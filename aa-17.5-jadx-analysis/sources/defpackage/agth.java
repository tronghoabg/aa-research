package defpackage;

/* loaded from: classes3.dex */
public final class agth {
    public static final agth INSTANCE = new agth();
    public static final ahnd JVM_FIELD_ANNOTATION_CLASS_ID;
    public static final ahnf JVM_FIELD_ANNOTATION_FQ_NAME;
    private static final ahnd REFLECTION_FACTORY_IMPL;
    private static final ahnd REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION;

    static {
        ahnf ahnfVar = new ahnf("kotlin.jvm.JvmField");
        JVM_FIELD_ANNOTATION_FQ_NAME = ahnfVar;
        JVM_FIELD_ANNOTATION_CLASS_ID = ahnd.Companion.topLevel(ahnfVar);
        REFLECTION_FACTORY_IMPL = ahnd.Companion.topLevel(new ahnf("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION = ahnd.Companion.fromString("kotlin/jvm/internal/RepeatableContainer", false & ((2 & 2) == 0));
    }

    private agth() {
    }

    public static final String getterName(String str) {
        str.getClass();
        return startsWithIsPrefix(str) ? str : "get".concat(aiou.capitalizeAsciiOnly(str));
    }

    public static final boolean isGetterName(String str) {
        str.getClass();
        return afyh.g(str, "get", false) || afyh.g(str, "is", false);
    }

    public static final boolean isSetterName(String str) {
        str.getClass();
        return afyh.g(str, "set", false);
    }

    public static final String setterName(String str) {
        String strCapitalizeAsciiOnly;
        str.getClass();
        StringBuilder sb = new StringBuilder("set");
        if (startsWithIsPrefix(str)) {
            strCapitalizeAsciiOnly = str.substring(2);
            strCapitalizeAsciiOnly.getClass();
        } else {
            strCapitalizeAsciiOnly = aiou.capitalizeAsciiOnly(str);
        }
        sb.append(strCapitalizeAsciiOnly);
        return sb.toString();
    }

    public static final boolean startsWithIsPrefix(String str) {
        str.getClass();
        if (!afyh.g(str, "is", false) || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return cCharAt < 'a' || cCharAt > 'z';
    }

    public final ahnd getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION() {
        return REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION;
    }
}
