// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from thread_dispatcher.djinni

#import "RCTCoreLGExecutionContext.h"


@implementation RCTCoreLGExecutionContext
//Export module
RCT_EXPORT_MODULE(RCTCoreLGExecutionContext)

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

/**
 *Execute a given runnable
 *@param runnalbe, Runnable object
 */
RCT_REMAP_METHOD(execute,execute:(NSDictionary *)currentInstance withParams:(NSDictionary *)runnable withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGExecutionContext::execute, first argument should be an instance of LGExecutionContextImpl", nil);
    }
    LGExecutionContextImpl *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGExecutionContextImpl::execute, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreLGRunnable *rctParam_runnable = (RCTCoreLGRunnable *)[self.bridge moduleForName:@"CoreLGRunnable"];
    LGRunnable *objcParam_0 = (LGRunnable *)[rctParam_runnable.objcImplementations objectForKey:runnable[@"uid"]];
    [currentInstanceObj execute:objcParam_0];

}

/**
 *Execute a given runnable with a delay
 *@param runnalbe, Runnable object
 *@param millis, 64 bits integer, delay in milli-seconds
 */
RCT_REMAP_METHOD(delay,delay:(NSDictionary *)currentInstance withParams:(NSDictionary *)runnable
                                                                 millis:(int64_t)millis withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGExecutionContext::delay, first argument should be an instance of LGExecutionContextImpl", nil);
    }
    LGExecutionContextImpl *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGExecutionContextImpl::delay, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreLGRunnable *rctParam_runnable = (RCTCoreLGRunnable *)[self.bridge moduleForName:@"CoreLGRunnable"];
    LGRunnable *objcParam_0 = (LGRunnable *)[rctParam_runnable.objcImplementations objectForKey:runnable[@"uid"]];
    [currentInstanceObj delay:objcParam_0 millis:millis];

}
RCT_REMAP_METHOD(new, newWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    LGExecutionContextImpl *objcResult = [[LGExecutionContextImpl alloc] init];
    NSString *uuid = [[NSUUID UUID] UUIDString];
    [self.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreLGExecutionContextImpl", @"uid" : uuid };
    if (!objcResult || !result)
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGExecutionContextImpl::init", nil);
    }
    resolve(result);
}
@end