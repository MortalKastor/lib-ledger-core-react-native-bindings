// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from database.djinni

#ifndef DJINNI_GENERATED_DATABASEERROR_HPP
#define DJINNI_GENERATED_DATABASEERROR_HPP

#include <string>

namespace ledger { namespace core { namespace api {

/** Wrapper class around errors. */
class DatabaseError {
public:
    virtual ~DatabaseError() {}

    /**
     * Get a human readable error message.
     * @return The error message.
     */
    virtual std::string getMessage() = 0;
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_DATABASEERROR_HPP
