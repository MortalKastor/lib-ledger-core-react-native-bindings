// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

#include "TezosLikeExtendedPublicKey.hpp"
#include <memory>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@class LGTezosLikeExtendedPublicKey;

namespace djinni_generated {

class TezosLikeExtendedPublicKey
{
public:
    using CppType = std::shared_ptr<::ledger::core::api::TezosLikeExtendedPublicKey>;
    using CppOptType = std::shared_ptr<::ledger::core::api::TezosLikeExtendedPublicKey>;
    using ObjcType = LGTezosLikeExtendedPublicKey*;

    using Boxed = TezosLikeExtendedPublicKey;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCppOpt(const CppOptType& cpp);
    static ObjcType fromCpp(const CppType& cpp) { return fromCppOpt(cpp); }

private:
    class ObjcProxy;
};

}  // namespace djinni_generated

