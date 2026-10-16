package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1947k extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ACCESSIBILITY_CAPTIONING_ENABLED_FIELD_NUMBER = 1;
    public static final int ACCESSIBILITY_LARGE_POINTER_ICON_FIELD_NUMBER = 2;
    private static final C1947k DEFAULT_INSTANCE;
    public static final int FONT_SCALE_FIELD_NUMBER = 4;
    private static volatile Parser<C1947k> PARSER = null;
    public static final int REDUCE_BRIGHT_COLORS_ACTIVATED_FIELD_NUMBER = 3;
    private boolean accessibilityCaptioningEnabled_;
    private boolean accessibilityLargePointerIcon_;
    private int bitField0_;
    private float fontScale_;
    private boolean reduceBrightColorsActivated_;

    static {
        C1947k c1947k = new C1947k();
        DEFAULT_INSTANCE = c1947k;
        GeneratedMessageLite.registerDefaultInstance(C1947k.class, c1947k);
    }

    public static void a(C1947k c1947k, boolean z2) {
        c1947k.bitField0_ |= 1;
        c1947k.accessibilityCaptioningEnabled_ = z2;
    }

    public static void b(C1947k c1947k, boolean z2) {
        c1947k.bitField0_ |= 2;
        c1947k.accessibilityLargePointerIcon_ = z2;
    }

    public static void c(C1947k c1947k, float f10) {
        c1947k.bitField0_ |= 8;
        c1947k.fontScale_ = f10;
    }

    public static void d(C1947k c1947k, boolean z2) {
        c1947k.bitField0_ |= 4;
        c1947k.reduceBrightColorsActivated_ = z2;
    }

    public static C1945j f() {
        return (C1945j) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1947k();
            case 2:
                return new C1945j(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ခ\u0003", new Object[]{"bitField0_", "accessibilityCaptioningEnabled_", "accessibilityLargePointerIcon_", "reduceBrightColorsActivated_", "fontScale_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1947k> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1947k.class) {
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
