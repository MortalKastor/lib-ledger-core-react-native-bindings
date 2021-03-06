// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from stellar_like_wallet.djinni

#import "RCTCoreLGStellarLikeAsset.h"
#import "LGStellarLikeAsset.h"

@implementation RCTCoreLGStellarLikeAsset

//Export module
RCT_EXPORT_MODULE(RCTCoreLGStellarLikeAsset)

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
RCT_REMAP_METHOD(init, initWithType:(nonnull NSString *)type
                               code:(nonnull NSString *)code
                             issuer:(nonnull NSString *)issuer withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {


    LGStellarLikeAsset * finalResult = [[LGStellarLikeAsset alloc] initWithType:type code:code issuer:issuer];
    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGStellarLikeAsset *rctImpl = (RCTCoreLGStellarLikeAsset *)[self.bridge moduleForName:@"CoreLGStellarLikeAsset"];
    NSArray *finalResultArray = [[NSArray alloc] initWithObjects:finalResult, uuid, nil];
    [rctImpl baseSetObject:finalResultArray];
    NSDictionary *result = @{@"type" : @"CoreLGStellarLikeAsset", @"uid" : uuid };
    if (result)
    {
        resolve(result);
    }
}

RCT_REMAP_METHOD(getType, getType:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGStellarLikeAsset *objcImpl = (LGStellarLikeAsset *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.type};
    resolve(result);
}

RCT_REMAP_METHOD(getCode, getCode:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGStellarLikeAsset *objcImpl = (LGStellarLikeAsset *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.code};
    resolve(result);
}

RCT_REMAP_METHOD(getIssuer, getIssuer:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGStellarLikeAsset *objcImpl = (LGStellarLikeAsset *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.issuer};
    resolve(result);
}

@end
