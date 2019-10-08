// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

#import "RCTCoreLGBitcoinLikeSignature.h"
#import "LGBitcoinLikeSignature.h"

@implementation RCTCoreLGBitcoinLikeSignature

//Export module
RCT_EXPORT_MODULE(RCTCoreLGBitcoinLikeSignature)

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
-(NSData *) hexStringToData: (NSString *)hexString 
{
    NSMutableData *data= [[NSMutableData alloc] init];
    unsigned char byte;
    char byteChars[3] = {'\0','\0','\0'};
    for (int i = 0; i < ([hexString length] / 2); i++)
    {
        byteChars[0] = [hexString characterAtIndex: i*2];
        byteChars[1] = [hexString characterAtIndex: i*2 + 1];
        byte = strtol(byteChars, NULL, 16);
        [data appendBytes:&byte length:1];
    }
    return data;
}
RCT_REMAP_METHOD(init, initWithR:(NSString *)r
                               s:(NSString *)s
                               v:(NSString *)v withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    NSData *field_0 = [self hexStringToData:r];

    NSData *field_1 = [self hexStringToData:s];

    NSData *field_2 = [self hexStringToData:v];



    LGBitcoinLikeSignature * finalResult = [[LGBitcoinLikeSignature alloc] initWithR:field_0 s:field_1 v:field_2];
    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBitcoinLikeSignature *rctImpl = (RCTCoreLGBitcoinLikeSignature *)[self.bridge moduleForName:@"CoreLGBitcoinLikeSignature"];
    NSArray *finalResultArray = [[NSArray alloc] initWithObjects:finalResult, uuid, nil];
    [rctImpl baseSetObject:finalResultArray];
    NSDictionary *result = @{@"type" : @"CoreLGBitcoinLikeSignature", @"uid" : uuid };
    if (result)
    {
        resolve(result);
    }
}

RCT_REMAP_METHOD(getR, getR:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGBitcoinLikeSignature *objcImpl = (LGBitcoinLikeSignature *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.r.description};
    resolve(result);
}

RCT_REMAP_METHOD(getS, getS:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGBitcoinLikeSignature *objcImpl = (LGBitcoinLikeSignature *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.s.description};
    resolve(result);
}

RCT_REMAP_METHOD(getV, getV:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGBitcoinLikeSignature *objcImpl = (LGBitcoinLikeSignature *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.v.description};
    resolve(result);
}

@end