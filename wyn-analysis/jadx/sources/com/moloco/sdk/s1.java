package com.moloco.sdk;

import android.os.Build;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class s1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final s1 DEFAULT_INSTANCE;
    public static final int MODEL_FIELD_NUMBER = 3;
    public static final int OS_FIELD_NUMBER = 1;
    public static final int OS_VER_FIELD_NUMBER = 2;
    private static volatile Parser<s1> PARSER = null;
    public static final int SCREEN_SCALE_FIELD_NUMBER = 4;
    private int os_;
    private float screenScale_;
    private String osVer_ = "";
    private String model_ = "";

    static {
        s1 s1Var = new s1();
        DEFAULT_INSTANCE = s1Var;
        GeneratedMessageLite.registerDefaultInstance(s1.class, s1Var);
    }

    public static void a(s1 s1Var, String str) {
        s1Var.getClass();
        s1Var.model_ = str;
    }

    public static void b(s1 s1Var) {
        r1 r1Var = r1.ANDROID;
        s1Var.getClass();
        s1Var.os_ = r1Var.getNumber();
    }

    public static void c(s1 s1Var) {
        String str = Build.VERSION.RELEASE;
        s1Var.getClass();
        str.getClass();
        s1Var.osVer_ = str;
    }

    public static void d(s1 s1Var, float f10) {
        s1Var.screenScale_ = f10;
    }

    public static q1 f() {
        return (q1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1867d1.f28483a[methodToInvoke.ordinal()]) {
            case 1:
                return new s1();
            case 2:
                return new q1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\u0001", new Object[]{"os_", "osVer_", "model_", "screenScale_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<s1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (s1.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
