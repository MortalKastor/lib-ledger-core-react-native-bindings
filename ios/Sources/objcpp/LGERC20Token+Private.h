// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from erc20.djinni

#import "LGERC20Token.h"
#include "ERC20Token.hpp"

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@class LGERC20Token;

namespace djinni_generated {

struct ERC20Token
{
    using CppType = ::ledger::core::api::ERC20Token;
    using ObjcType = LGERC20Token*;

    using Boxed = ERC20Token;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCpp(const CppType& cpp);
};

}  // namespace djinni_generated
