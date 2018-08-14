// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

#import "RCTCoreBitcoinLikeNetworkParameters.h"
#import "BitcoinLikeNetworkParameters.h"

@implementation RCTCoreBitcoinLikeNetworkParameters

//Export module
RCT_EXPORT_MODULE(RCTCoreBitcoinLikeNetworkParameters)

@synthesize bridge = _bridge;
-(instancetype)init
{
    self = [super init];
    //Init Objc implementation
    if(self)
    {
        self.objcImplementations = [[NSMutableDictionary alloc] init];
    }
    return self;
}

+ (BOOL)requiresMainQueueSetup
{
    return NO;
}
RCT_REMAP_METHOD(init, initWithIdentifier:(nonnull NSString *)Identifier
                             P2PKHVersion:(nonnull NSData *)P2PKHVersion
                              P2SHVersion:(nonnull NSData *)P2SHVersion
                              XPUBVersion:(nonnull NSData *)XPUBVersion
                                FeePolicy:(BitcoinLikeFeePolicy)FeePolicy
                               DustAmount:(int64_t)DustAmount
                            MessagePrefix:(nonnull NSString *)MessagePrefix
               UsesTimestampedTransaction:(BOOL)UsesTimestampedTransaction
                           TimestampDelay:(int64_t)TimestampDelay
                                  SigHash:(nonnull NSData *)SigHash
                           AdditionalBIPs:(nonnull NSArray<NSString *> *)AdditionalBIPs withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {


    BitcoinLikeNetworkParameters * finalResult = [[BitcoinLikeNetworkParameters alloc] initWithIdentifier:Identifier P2PKHVersion:P2PKHVersion P2SHVersion:P2SHVersion XPUBVersion:XPUBVersion FeePolicy:FeePolicy DustAmount:DustAmount MessagePrefix:MessagePrefix UsesTimestampedTransaction:UsesTimestampedTransaction TimestampDelay:TimestampDelay SigHash:SigHash AdditionalBIPs:AdditionalBIPs];
    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreBitcoinLikeNetworkParameters *rctImpl = (RCTCoreBitcoinLikeNetworkParameters *)[self.bridge moduleForName:@"CoreBitcoinLikeNetworkParameters"];
    [rctImpl.objcImplementations setObject:finalResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreBitcoinLikeNetworkParameters", @"uid" : uuid };
    if(result)
    {
        resolve(result);
    }
}

@end