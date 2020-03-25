// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#import "LGOperation+Private.h"
#import "LGOperation.h"
#import "DJICppWrapperCache+Private.h"
#import "DJIError.h"
#import "DJIMarshal+Private.h"
#import "LGAmount+Private.h"
#import "LGBitcoinLikeOperation+Private.h"
#import "LGCurrency+Private.h"
#import "LGEthereumLikeOperation+Private.h"
#import "LGOperationType+Private.h"
#import "LGPreferences+Private.h"
#import "LGRippleLikeOperation+Private.h"
#import "LGTezosLikeOperation+Private.h"
#import "LGTrustIndicator+Private.h"
#import "LGWalletType+Private.h"
#include <exception>
#include <stdexcept>
#include <utility>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@interface LGOperation ()

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::Operation>&)cppRef;

@end

@implementation LGOperation {
    ::djinni::CppProxyCache::Handle<std::shared_ptr<::ledger::core::api::Operation>> _cppRefHandle;
}

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::Operation>&)cppRef
{
    if (self = [super init]) {
        _cppRefHandle.assign(cppRef);
    }
    return self;
}

- (nonnull NSString *)getUid {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getUid();
        return ::djinni::String::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (int32_t)getAccountIndex {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getAccountIndex();
        return ::djinni::I32::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (LGOperationType)getOperationType {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getOperationType();
        return ::djinni::Enum<::ledger::core::api::OperationType, LGOperationType>::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSDate *)getDate {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getDate();
        return ::djinni::Date::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSArray<NSString *> *)getSenders {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getSenders();
        return ::djinni::List<::djinni::String>::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSArray<NSString *> *)getRecipients {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getRecipients();
        return ::djinni::List<::djinni::String>::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGAmount *)getAmount {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getAmount();
        return ::djinni_generated::Amount::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGAmount *)getFees {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getFees();
        return ::djinni::Optional<std::experimental::optional, ::djinni_generated::Amount>::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGPreferences *)getPreferences {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getPreferences();
        return ::djinni_generated::Preferences::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGTrustIndicator *)getTrust {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getTrust();
        return ::djinni_generated::TrustIndicator::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable NSNumber *)getBlockHeight {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getBlockHeight();
        return ::djinni::Optional<std::experimental::optional, ::djinni::I64>::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGBitcoinLikeOperation *)asBitcoinLikeOperation {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->asBitcoinLikeOperation();
        return ::djinni_generated::BitcoinLikeOperation::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGEthereumLikeOperation *)asEthereumLikeOperation {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->asEthereumLikeOperation();
        return ::djinni_generated::EthereumLikeOperation::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGRippleLikeOperation *)asRippleLikeOperation {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->asRippleLikeOperation();
        return ::djinni_generated::RippleLikeOperation::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGTezosLikeOperation *)asTezosLikeOperation {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->asTezosLikeOperation();
        return ::djinni_generated::TezosLikeOperation::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (BOOL)isInstanceOfBitcoinLikeOperation {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->isInstanceOfBitcoinLikeOperation();
        return ::djinni::Bool::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (BOOL)isInstanceOfEthereumLikeOperation {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->isInstanceOfEthereumLikeOperation();
        return ::djinni::Bool::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (BOOL)isInstanceOfRippleLikeOperation {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->isInstanceOfRippleLikeOperation();
        return ::djinni::Bool::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (BOOL)isInstanceOfTezosLikeOperation {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->isInstanceOfTezosLikeOperation();
        return ::djinni::Bool::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (BOOL)isComplete {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->isComplete();
        return ::djinni::Bool::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (LGWalletType)getWalletType {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getWalletType();
        return ::djinni::Enum<::ledger::core::api::WalletType, LGWalletType>::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull LGCurrency *)getCurrency {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getCurrency();
        return ::djinni_generated::Currency::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

namespace djinni_generated {

auto Operation::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    return objc->_cppRefHandle.get();
}

auto Operation::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    return ::djinni::get_cpp_proxy<LGOperation>(cpp);
}

}  // namespace djinni_generated

@end
