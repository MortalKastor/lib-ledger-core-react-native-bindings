// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

#import "RCTCoreBaseModule.h"
#import <Foundation/Foundation.h>
#import <React/RCTBridge.h>
#import <React/RCTBridgeModule.h>

/**
 * Structure representing DER encoded signature
 * DER format :
 * - DER prefix
 * - Length of rest of signature
 * - Marker for r value
 * - Length of r value
 * - r value, Big Endian
 * - Marker for s value
 * - Length of s value
 * - s value, Big Endian
 * - SIGHASH byte (ALL, NONE, SINGLE)
 */
@interface RCTCoreLGBitcoinLikeSignature : RCTCoreBaseModule <RCTBridgeModule>
@end
