package kotlin.reflect.jvm.internal.impl.load.java;

import Bf.r;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class JvmAbi {

    @NotNull
    public static final JvmAbi INSTANCE = new JvmAbi();

    @NotNull
    public static final ClassId JVM_FIELD_ANNOTATION_CLASS_ID;

    @NotNull
    public static final FqName JVM_FIELD_ANNOTATION_FQ_NAME;

    @NotNull
    private static final ClassId REFLECTION_FACTORY_IMPL;

    @NotNull
    private static final ClassId REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmField");
        JVM_FIELD_ANNOTATION_FQ_NAME = fqName;
        ClassId classId = ClassId.topLevel(fqName);
        AbstractC3340k.d(classId, "topLevel(...)");
        JVM_FIELD_ANNOTATION_CLASS_ID = classId;
        ClassId classId2 = ClassId.topLevel(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        AbstractC3340k.d(classId2, "topLevel(...)");
        REFLECTION_FACTORY_IMPL = classId2;
        ClassId classIdFromString = ClassId.fromString("kotlin/jvm/internal/RepeatableContainer");
        AbstractC3340k.d(classIdFromString, "fromString(...)");
        REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION = classIdFromString;
    }

    private JvmAbi() {
    }

    @NotNull
    public static final String getterName(@NotNull String propertyName) {
        AbstractC3340k.e(propertyName, "propertyName");
        if (startsWithIsPrefix(propertyName)) {
            return propertyName;
        }
        return "get" + CapitalizeDecapitalizeKt.capitalizeAsciiOnly(propertyName);
    }

    public static final boolean isGetterName(@NotNull String name) {
        AbstractC3340k.e(name, "name");
        return r.k0(name, "get", false) || r.k0(name, "is", false);
    }

    public static final boolean isSetterName(@NotNull String name) {
        AbstractC3340k.e(name, "name");
        return r.k0(name, "set", false);
    }

    @NotNull
    public static final String setterName(@NotNull String propertyName) {
        String strCapitalizeAsciiOnly;
        AbstractC3340k.e(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder("set");
        if (startsWithIsPrefix(propertyName)) {
            strCapitalizeAsciiOnly = propertyName.substring(2);
            AbstractC3340k.d(strCapitalizeAsciiOnly, "substring(...)");
        } else {
            strCapitalizeAsciiOnly = CapitalizeDecapitalizeKt.capitalizeAsciiOnly(propertyName);
        }
        sb2.append(strCapitalizeAsciiOnly);
        return sb2.toString();
    }

    public static final boolean startsWithIsPrefix(@NotNull String name) {
        AbstractC3340k.e(name, "name");
        if (r.k0(name, "is", false) && name.length() != 2) {
            char cCharAt = name.charAt(2);
            if (AbstractC3340k.g(97, cCharAt) > 0 || AbstractC3340k.g(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final ClassId getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION() {
        return REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION;
    }
}
