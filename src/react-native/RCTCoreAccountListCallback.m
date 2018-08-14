// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#import "RCTCoreAccountListCallback.h"


@implementation RCTCoreAccountListCallback
-(instancetype)initWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock) reject andBridge: (RCTBridge *) bridge
{
    self = [super init];
    if(self)
    {
        self.resolve = resolve;
        self.reject = reject;
        self.bridge = bridge;
    }
    return self;
}

/**
 * Method triggered when main task complete
 * @params result optional of type list<T>, non null if main task failed
 * @params error optional of type Error, non null if main task succeeded
 */
- (void)onCallback:(nullable NSArray<Account *> *)result
             error:(nullable Error *)error {
    if (error)
    {
        self.reject(@"RCTCoreAccountListCallback Error", error.message, nil);
    }

    NSMutableArray *converted_result = [[NSMutableArray alloc] init];
    for (id result_elem in result)
    {
        NSString *uuid = [[NSUUID UUID] UUIDString];
        RCTCoreAccount *rctImpl_result_elem = (RCTCoreAccount *)[self.bridge moduleForName:@"CoreAccount"];
        [rctImpl_result_elem.objcImplementations setObject:result_elem forKey:uuid];
        NSDictionary *converted_result_elem = @{@"type" : @"CoreAccount", @"uid" : uuid };
        [converted_result addObject:converted_result_elem];
    }

    self.resolve(converted_result);

}
@end