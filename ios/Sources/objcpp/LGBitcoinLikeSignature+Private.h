// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

#import "LGBitcoinLikeSignature.h"
#include "BitcoinLikeSignature.hpp"

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@class LGBitcoinLikeSignature;

namespace djinni_generated {

struct BitcoinLikeSignature
{
    using CppType = ::ledger::core::api::BitcoinLikeSignature;
    using ObjcType = LGBitcoinLikeSignature*;

    using Boxed = BitcoinLikeSignature;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCpp(const CppType& cpp);
};

}  // namespace djinni_generated