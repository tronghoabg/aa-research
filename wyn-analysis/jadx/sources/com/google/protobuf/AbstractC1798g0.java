package com.google.protobuf;

/* renamed from: com.google.protobuf.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1798g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f27682a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f27682a = cls;
    }

    public static final ExtensionRegistryLite a(String str) {
        Class cls = f27682a;
        if (cls != null) {
            try {
                return (ExtensionRegistryLite) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
