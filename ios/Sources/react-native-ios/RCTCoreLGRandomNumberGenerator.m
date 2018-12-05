// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from random.djinni

#import "RCTCoreLGRandomNumberGenerator.h"


@implementation RCTCoreLGRandomNumberGenerator
//Export module
RCT_EXPORT_MODULE(RCTCoreLGRandomNumberGenerator)

@synthesize bridge = _bridge;


+ (BOOL)requiresMainQueueSetup
{
    return NO;
}
RCT_REMAP_METHOD(release, release:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseRelease:currentInstance withResolver: resolve rejecter:reject];
}
RCT_REMAP_METHOD(log, logWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseLogWithResolver:resolve rejecter:reject];
}
RCT_REMAP_METHOD(flush, flushWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseFlushWithResolver:resolve rejecter:reject];
}
RCT_REMAP_METHOD(isNull, isNull:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseIsNull:currentInstance withResolver:resolve rejecter:reject];
}

/**
 * Generates random bytes.
 * @params size number of bytes to generate
 * @return 'size' random bytes
 */
RCT_REMAP_METHOD(getRandomBytes,getRandomBytes:(NSDictionary *)currentInstance withParams:(int)size withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGRandomNumberGenerator::getRandomBytes, first argument should be an instance of LGRandomNumberGeneratorImpl", nil);
        return;
    }
    LGRandomNumberGeneratorImpl *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGRandomNumberGeneratorImpl::getRandomBytes, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSData * objcResult = [currentInstanceObj getRandomBytes:size];
    NSDictionary *result = @{@"value" : objcResult.description};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGRandomNumberGeneratorImpl::getRandomBytes", nil);
        return;
    }

}

/**
 * Generates random 32 bits integer.
 * @return random 32 bits integer
 */
RCT_REMAP_METHOD(getRandomInt,getRandomInt:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGRandomNumberGenerator::getRandomInt, first argument should be an instance of LGRandomNumberGeneratorImpl", nil);
        return;
    }
    LGRandomNumberGeneratorImpl *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGRandomNumberGeneratorImpl::getRandomInt, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSInteger objcResult = [currentInstanceObj getRandomInt];
    NSDictionary *result = @{@"value" : @(objcResult)};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGRandomNumberGeneratorImpl::getRandomInt", nil);
        return;
    }

}

/**
 * Generates random 64 bits integer.
 * @return random 64 bits integer
 */
RCT_REMAP_METHOD(getRandomLong,getRandomLong:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGRandomNumberGenerator::getRandomLong, first argument should be an instance of LGRandomNumberGeneratorImpl", nil);
        return;
    }
    LGRandomNumberGeneratorImpl *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGRandomNumberGeneratorImpl::getRandomLong, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSInteger objcResult = [currentInstanceObj getRandomLong];
    NSDictionary *result = @{@"value" : @(objcResult)};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGRandomNumberGeneratorImpl::getRandomLong", nil);
        return;
    }

}

/**
 * Generates random byte.
 * @return random byte
 */
RCT_REMAP_METHOD(getRandomByte,getRandomByte:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGRandomNumberGenerator::getRandomByte, first argument should be an instance of LGRandomNumberGeneratorImpl", nil);
        return;
    }
    LGRandomNumberGeneratorImpl *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGRandomNumberGeneratorImpl::getRandomByte, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSInteger objcResult = [currentInstanceObj getRandomByte];
    NSDictionary *result = @{@"value" : @(objcResult)};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGRandomNumberGeneratorImpl::getRandomByte", nil);
        return;
    }

}
RCT_REMAP_METHOD(newInstance, newInstanceWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    LGRandomNumberGeneratorImpl *objcResult = [[LGRandomNumberGeneratorImpl alloc] init];
    NSString *uuid = [[NSUUID UUID] UUIDString];
    NSArray *resultArray = [[NSArray alloc] initWithObjects:objcResult, uuid, nil];
    [self baseSetObject:resultArray];
    NSDictionary *result = @{@"type" : @"CoreLGRandomNumberGeneratorImpl", @"uid" : uuid };
    if (!objcResult || !result)
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGRandomNumberGeneratorImpl::init", nil);
        return;
    }
    resolve(result);
}
@end
