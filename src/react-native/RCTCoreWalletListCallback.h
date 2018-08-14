// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#import "Error.h"
#import "RCTCoreError.h"
#import "RCTCoreWallet.h"
#import "Wallet.h"
#import "WalletListCallbackImpl.h"
#import <Foundation/Foundation.h>
#import <React/RCTBridge.h>
#import <React/RCTBridgeModule.h>


/**
 *Callback triggered by main completed task,
 *returns optional result as list of template type T
 */
@interface RCTCoreWalletListCallback : NSObject <WalletListCallback>
@property (nonatomic, strong) RCTPromiseResolveBlock resolve;
@property (nonatomic, strong) RCTPromiseRejectBlock reject;
@property (nonatomic, weak) RCTBridge *bridge;
-(instancetype)initWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock) reject andBridge: (RCTBridge *) bridge;
@end