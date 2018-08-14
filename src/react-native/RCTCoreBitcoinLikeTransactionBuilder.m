// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

#import "RCTCoreBitcoinLikeTransactionBuilder.h"


@implementation RCTCoreBitcoinLikeTransactionBuilder
//Export module
RCT_EXPORT_MODULE(RCTCoreBitcoinLikeTransactionBuilder)

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
 * Add the given input to the final transaction.
 * @param transactionhash The hash of the transaction in where the UTXO can be located.
 * @params index Index of the UTXO in the previous transaction
 * @params sequence Sequence number to add at the end of the input serialization. This can be used for RBF transaction
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(addInput,addInput:(NSDictionary *)currentInstance withParams:(nonnull NSString *)transactionHash
                                                                        index:(int32_t)index
                                                                     sequence:(int32_t)sequence withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreBitcoinLikeTransactionBuilder::addInput, first argument should be an instance of BitcoinLikeTransactionBuilder", nil);
    }
    BitcoinLikeTransactionBuilder *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling BitcoinLikeTransactionBuilder::addInput, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    BitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj addInput:transactionHash index:index sequence:sequence];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreBitcoinLikeTransactionBuilder"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreBitcoinLikeTransactionBuilder", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling BitcoinLikeTransactionBuilder::addInput", nil);
    }

}

/**
 * Add the given output to the final transaction
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(addOutput,addOutput:(NSDictionary *)currentInstance withParams:(NSDictionary *)amount
                                                                         script:(NSDictionary *)script withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreBitcoinLikeTransactionBuilder::addOutput, first argument should be an instance of BitcoinLikeTransactionBuilder", nil);
    }
    BitcoinLikeTransactionBuilder *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling BitcoinLikeTransactionBuilder::addOutput, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreAmount *rctParam_amount = (RCTCoreAmount *)[self.bridge moduleForName:@"CoreAmount"];
    Amount *objcParam_0 = (Amount *)[rctParam_amount.objcImplementations objectForKey:amount[@"uid"]];
    RCTCoreBitcoinLikeScript *rctParam_script = (RCTCoreBitcoinLikeScript *)[self.bridge moduleForName:@"CoreBitcoinLikeScript"];
    BitcoinLikeScript *objcParam_1 = (BitcoinLikeScript *)[rctParam_script.objcImplementations objectForKey:script[@"uid"]];
    BitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj addOutput:objcParam_0 script:objcParam_1];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreBitcoinLikeTransactionBuilder"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreBitcoinLikeTransactionBuilder", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling BitcoinLikeTransactionBuilder::addOutput", nil);
    }

}

/**
 * If needed the transaction will send its change to the given path. It is possible to add multiple change path.
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(addChangePath,addChangePath:(NSDictionary *)currentInstance withParams:(nonnull NSString *)path withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreBitcoinLikeTransactionBuilder::addChangePath, first argument should be an instance of BitcoinLikeTransactionBuilder", nil);
    }
    BitcoinLikeTransactionBuilder *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling BitcoinLikeTransactionBuilder::addChangePath, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    BitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj addChangePath:path];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreBitcoinLikeTransactionBuilder"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreBitcoinLikeTransactionBuilder", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling BitcoinLikeTransactionBuilder::addChangePath", nil);
    }

}

/**
 * Exclude UTXO from the coin selection (alias UTXO picking). You can call this method multiple times to exclude multiple
 * UTXO.
 * @param transactionHash The hash of the transaction in which this UTXO can be found.
 * @param outputIndex The position of the output in the previous transaction,
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(excludeUtxo,excludeUtxo:(NSDictionary *)currentInstance withParams:(nonnull NSString *)transactionHash
                                                                        outputIndex:(int32_t)outputIndex withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreBitcoinLikeTransactionBuilder::excludeUtxo, first argument should be an instance of BitcoinLikeTransactionBuilder", nil);
    }
    BitcoinLikeTransactionBuilder *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling BitcoinLikeTransactionBuilder::excludeUtxo, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    BitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj excludeUtxo:transactionHash outputIndex:outputIndex];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreBitcoinLikeTransactionBuilder"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreBitcoinLikeTransactionBuilder", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling BitcoinLikeTransactionBuilder::excludeUtxo", nil);
    }

}

/** @return A reference on the same builder in order to chain calls. */
RCT_REMAP_METHOD(setNumberOfChangeAddresses,setNumberOfChangeAddresses:(NSDictionary *)currentInstance withParams:(int32_t)count withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreBitcoinLikeTransactionBuilder::setNumberOfChangeAddresses, first argument should be an instance of BitcoinLikeTransactionBuilder", nil);
    }
    BitcoinLikeTransactionBuilder *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling BitcoinLikeTransactionBuilder::setNumberOfChangeAddresses, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    BitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj setNumberOfChangeAddresses:count];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreBitcoinLikeTransactionBuilder"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreBitcoinLikeTransactionBuilder", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling BitcoinLikeTransactionBuilder::setNumberOfChangeAddresses", nil);
    }

}

/**
 * Set the maximum amount per change output. By default there is no max amount.
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(setMaxAmountOnChange,setMaxAmountOnChange:(NSDictionary *)currentInstance withParams:(NSDictionary *)amount withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreBitcoinLikeTransactionBuilder::setMaxAmountOnChange, first argument should be an instance of BitcoinLikeTransactionBuilder", nil);
    }
    BitcoinLikeTransactionBuilder *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling BitcoinLikeTransactionBuilder::setMaxAmountOnChange, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreAmount *rctParam_amount = (RCTCoreAmount *)[self.bridge moduleForName:@"CoreAmount"];
    Amount *objcParam_0 = (Amount *)[rctParam_amount.objcImplementations objectForKey:amount[@"uid"]];
    BitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj setMaxAmountOnChange:objcParam_0];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreBitcoinLikeTransactionBuilder"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreBitcoinLikeTransactionBuilder", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling BitcoinLikeTransactionBuilder::setMaxAmountOnChange", nil);
    }

}

/**
 * Set the minimum amount per change output. By default this value is the dust value of the currency.
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(setMinAmountOnChange,setMinAmountOnChange:(NSDictionary *)currentInstance withParams:(NSDictionary *)amount withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreBitcoinLikeTransactionBuilder::setMinAmountOnChange, first argument should be an instance of BitcoinLikeTransactionBuilder", nil);
    }
    BitcoinLikeTransactionBuilder *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling BitcoinLikeTransactionBuilder::setMinAmountOnChange, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreAmount *rctParam_amount = (RCTCoreAmount *)[self.bridge moduleForName:@"CoreAmount"];
    Amount *objcParam_0 = (Amount *)[rctParam_amount.objcImplementations objectForKey:amount[@"uid"]];
    BitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj setMinAmountOnChange:objcParam_0];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreBitcoinLikeTransactionBuilder"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreBitcoinLikeTransactionBuilder", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling BitcoinLikeTransactionBuilder::setMinAmountOnChange", nil);
    }

}

/**
 * Set the UTXO picking strategy (see [[BitcoinLikePickingStrategy]]).
 * @param strategy The strategy to adopt in order to select which input to use in the transaction.
 * @param sequence The sequence value serialized at the end of the raw transaction. If you don't know what to put here
 * just use 0xFFFFFF
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(pickInputs,pickInputs:(NSDictionary *)currentInstance withParams:(BitcoinLikePickingStrategy)strategy
                                                                         sequence:(int32_t)sequence withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreBitcoinLikeTransactionBuilder::pickInputs, first argument should be an instance of BitcoinLikeTransactionBuilder", nil);
    }
    BitcoinLikeTransactionBuilder *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling BitcoinLikeTransactionBuilder::pickInputs, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    BitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj pickInputs:strategy sequence:sequence];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreBitcoinLikeTransactionBuilder"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreBitcoinLikeTransactionBuilder", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling BitcoinLikeTransactionBuilder::pickInputs", nil);
    }

}

/**
 * Send funds to the given address. This method can be called multiple times to send to multiple addresses.
 * @param amount The value to send
 * @param address Address of the recipient
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(sendToAddress,sendToAddress:(NSDictionary *)currentInstance withParams:(NSDictionary *)amount
                                                                                address:(nonnull NSString *)address withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreBitcoinLikeTransactionBuilder::sendToAddress, first argument should be an instance of BitcoinLikeTransactionBuilder", nil);
    }
    BitcoinLikeTransactionBuilder *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling BitcoinLikeTransactionBuilder::sendToAddress, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreAmount *rctParam_amount = (RCTCoreAmount *)[self.bridge moduleForName:@"CoreAmount"];
    Amount *objcParam_0 = (Amount *)[rctParam_amount.objcImplementations objectForKey:amount[@"uid"]];
    BitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj sendToAddress:objcParam_0 address:address];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreBitcoinLikeTransactionBuilder"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreBitcoinLikeTransactionBuilder", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling BitcoinLikeTransactionBuilder::sendToAddress", nil);
    }

}

/**
 * Send all available funds to the given address.
 * @param address Address of the recipient
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(wipeToAddress,wipeToAddress:(NSDictionary *)currentInstance withParams:(nonnull NSString *)address withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreBitcoinLikeTransactionBuilder::wipeToAddress, first argument should be an instance of BitcoinLikeTransactionBuilder", nil);
    }
    BitcoinLikeTransactionBuilder *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling BitcoinLikeTransactionBuilder::wipeToAddress, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    BitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj wipeToAddress:address];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreBitcoinLikeTransactionBuilder"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreBitcoinLikeTransactionBuilder", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling BitcoinLikeTransactionBuilder::wipeToAddress", nil);
    }

}

/**
 * Set the amount of fees per byte (of the raw transaction).
 * @return A reference on the same builder in order to chain calls.
 */
RCT_REMAP_METHOD(setFeesPerByte,setFeesPerByte:(NSDictionary *)currentInstance withParams:(NSDictionary *)fees withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreBitcoinLikeTransactionBuilder::setFeesPerByte, first argument should be an instance of BitcoinLikeTransactionBuilder", nil);
    }
    BitcoinLikeTransactionBuilder *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling BitcoinLikeTransactionBuilder::setFeesPerByte, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreAmount *rctParam_fees = (RCTCoreAmount *)[self.bridge moduleForName:@"CoreAmount"];
    Amount *objcParam_0 = (Amount *)[rctParam_fees.objcImplementations objectForKey:fees[@"uid"]];
    BitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj setFeesPerByte:objcParam_0];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreBitcoinLikeTransactionBuilder"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreBitcoinLikeTransactionBuilder", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling BitcoinLikeTransactionBuilder::setFeesPerByte", nil);
    }

}

/** Build a transaction from the given builder parameters. */
RCT_REMAP_METHOD(build,build:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreBitcoinLikeTransactionBuilder::build, first argument should be an instance of BitcoinLikeTransactionBuilder", nil);
    }
    BitcoinLikeTransactionBuilder *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling BitcoinLikeTransactionBuilder::build, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreBitcoinLikeTransactionCallback *objcParam_0 = [[RCTCoreBitcoinLikeTransactionCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj build:objcParam_0];

}

/**
 * Creates a clone of this builder.
 * @return A copy of the current builder instance.
 */
RCT_REMAP_METHOD(clone,clone:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreBitcoinLikeTransactionBuilder::clone, first argument should be an instance of BitcoinLikeTransactionBuilder", nil);
    }
    BitcoinLikeTransactionBuilder *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling BitcoinLikeTransactionBuilder::clone, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    BitcoinLikeTransactionBuilder * objcResult = [currentInstanceObj clone];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreBitcoinLikeTransactionBuilder *rctImpl_objcResult = (RCTCoreBitcoinLikeTransactionBuilder *)[self.bridge moduleForName:@"CoreBitcoinLikeTransactionBuilder"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreBitcoinLikeTransactionBuilder", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling BitcoinLikeTransactionBuilder::clone", nil);
    }

}

/** Reset the current instance to its initial state */
RCT_REMAP_METHOD(reset,reset:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreBitcoinLikeTransactionBuilder::reset, first argument should be an instance of BitcoinLikeTransactionBuilder", nil);
    }
    BitcoinLikeTransactionBuilder *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling BitcoinLikeTransactionBuilder::reset, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    [currentInstanceObj reset];

}

RCT_REMAP_METHOD(parseRawUnsignedTransaction,parseRawUnsignedTransactionwithParams:(NSDictionary *)currency
                                                                    rawTransaction:(nonnull NSData *)rawTransaction withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    RCTCoreCurrency *rctParam_currency = (RCTCoreCurrency *)[self.bridge moduleForName:@"CoreCurrency"];
    Currency *objcParam_0 = (Currency *)[rctParam_currency.objcImplementations objectForKey:currency[@"uid"]];
    BitcoinLikeTransaction * objcResult = [BitcoinLikeTransactionBuilder parseRawUnsignedTransaction:objcParam_0 rawTransaction:rawTransaction];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreBitcoinLikeTransaction *rctImpl_objcResult = (RCTCoreBitcoinLikeTransaction *)[self.bridge moduleForName:@"CoreBitcoinLikeTransaction"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreBitcoinLikeTransaction", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling BitcoinLikeTransactionBuilder::parseRawUnsignedTransaction", nil);
    }

}
@end