package com.google.w.o;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum b implements eg {
    UNSPECIFIED(0),
    BOOL_FIELD(1),
    CHANGE_TO_UNSIGNED_INT(2),
    CHANGE_TO_SIGNED_INT(3),
    CHANGED_FIELD_TYPE(4),
    INVALID_MESSAGE_CHANGE(5),
    TYPE_CHANGE(6),
    BOOL_TO_ENUM(7),
    DEFAULT_VALUE_CHANGE(8),
    DELETE_FIELD_RESERVED(9),
    DELETE_NON_DEPRECATED_FIELD(10),
    ENUM_DEFAULT_VALUE_ZERO(11),
    ENUM_DEFAULT_VALUE_NAME(12),
    ENUM_DEFAULT_VALUE_NAME_CONFLICT(13),
    ENUM_VALUE_ADDED(14),
    ENUM_VALUE_CHANGED(15),
    ENUM_VALUE_NAMES(16),
    FIELD_PRESENCE(17),
    GENERATED_CODE_STYLE(18),
    LARGE_ENUM(19),
    MESSAGE_SET_MISMATCH(20),
    PACKED_FIELD(21),
    RENAME_FIELD(22),
    TAG_CHANGE(23),
    TIME_UNIT(24),
    TOO_MANY_FIELDS(25),
    DELETE_REQUIRED_FIELD(26),
    KEYWORD_CONFLICT(27),
    GLOBAL_PACKAGE(28),
    ONEOF_FIELD_CHANGE(29),
    KEEP_PROTO_FILES_SMALL(30),
    LONG_FIELD_JSPB_ANNOTATED(31),
    ENUM_VALUE_DELETE(32),
    REPEATED_FIELD_TRANSITION_PACKED(33),
    REPEATED_FIELD_TRANSITION_MESSAGE(34),
    REQUIRED_TO_OPTIONAL(35),
    DELETE_ENUM_VALUE(36),
    MISSING_GLUE_MERGE_ANNOTATION(37),
    RENAME_SERVICE_PACKAGE(38),
    LARGE_ONEOF(39),
    REQUIRE_INNERTUBE_CAPABILITY_NEGOTIATION(40),
    JSPB_MESSAGE_ID_CHANGE(41),
    REQUIRE_DROIDGUARD_CLIENT_RESPONSE_ANNOTATION(42),
    SERVICE_DEADLINE(43),
    IMPORT_PUBLIC(44),
    ONEOF_AVOID(45),
    INT32_AVOID(46),
    UNSIGNED_INTEGER(47),
    JAVA_FEATURES(48),
    GOOGLESQL_AVOID_DEFAULTS(49),
    NESTED_EXPORT(50),
    EXPORT_ALL(51),
    GOOGLE_API_HTTP(52),
    PROTO_PACKAGE_STYLE(53),
    ENFORCE_NAMING_STYLE(54);

    private final int ae;

    b(int i2) {
        this.ae = i2;
    }

    public static b a(int i2) {
        switch (i2) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return BOOL_FIELD;
            case 2:
                return CHANGE_TO_UNSIGNED_INT;
            case 3:
                return CHANGE_TO_SIGNED_INT;
            case 4:
                return CHANGED_FIELD_TYPE;
            case 5:
                return INVALID_MESSAGE_CHANGE;
            case 6:
                return TYPE_CHANGE;
            case 7:
                return BOOL_TO_ENUM;
            case 8:
                return DEFAULT_VALUE_CHANGE;
            case 9:
                return DELETE_FIELD_RESERVED;
            case 10:
                return DELETE_NON_DEPRECATED_FIELD;
            case 11:
                return ENUM_DEFAULT_VALUE_ZERO;
            case 12:
                return ENUM_DEFAULT_VALUE_NAME;
            case 13:
                return ENUM_DEFAULT_VALUE_NAME_CONFLICT;
            case 14:
                return ENUM_VALUE_ADDED;
            case 15:
                return ENUM_VALUE_CHANGED;
            case 16:
                return ENUM_VALUE_NAMES;
            case 17:
                return FIELD_PRESENCE;
            case 18:
                return GENERATED_CODE_STYLE;
            case 19:
                return LARGE_ENUM;
            case 20:
                return MESSAGE_SET_MISMATCH;
            case 21:
                return PACKED_FIELD;
            case 22:
                return RENAME_FIELD;
            case 23:
                return TAG_CHANGE;
            case 24:
                return TIME_UNIT;
            case 25:
                return TOO_MANY_FIELDS;
            case 26:
                return DELETE_REQUIRED_FIELD;
            case 27:
                return KEYWORD_CONFLICT;
            case 28:
                return GLOBAL_PACKAGE;
            case 29:
                return ONEOF_FIELD_CHANGE;
            case 30:
                return KEEP_PROTO_FILES_SMALL;
            case 31:
                return LONG_FIELD_JSPB_ANNOTATED;
            case 32:
                return ENUM_VALUE_DELETE;
            case 33:
                return REPEATED_FIELD_TRANSITION_PACKED;
            case 34:
                return REPEATED_FIELD_TRANSITION_MESSAGE;
            case 35:
                return REQUIRED_TO_OPTIONAL;
            case 36:
                return DELETE_ENUM_VALUE;
            case 37:
                return MISSING_GLUE_MERGE_ANNOTATION;
            case 38:
                return RENAME_SERVICE_PACKAGE;
            case 39:
                return LARGE_ONEOF;
            case 40:
                return REQUIRE_INNERTUBE_CAPABILITY_NEGOTIATION;
            case 41:
                return JSPB_MESSAGE_ID_CHANGE;
            case 42:
                return REQUIRE_DROIDGUARD_CLIENT_RESPONSE_ANNOTATION;
            case 43:
                return SERVICE_DEADLINE;
            case 44:
                return IMPORT_PUBLIC;
            case 45:
                return ONEOF_AVOID;
            case 46:
                return INT32_AVOID;
            case 47:
                return UNSIGNED_INTEGER;
            case 48:
                return JAVA_FEATURES;
            case 49:
                return GOOGLESQL_AVOID_DEFAULTS;
            case 50:
                return NESTED_EXPORT;
            case 51:
                return EXPORT_ALL;
            case 52:
                return GOOGLE_API_HTTP;
            case 53:
                return PROTO_PACKAGE_STYLE;
            case 54:
                return ENFORCE_NAMING_STYLE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.ae;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ae);
    }
}
