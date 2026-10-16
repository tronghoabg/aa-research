package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class p1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BUTTONS_FIELD_NUMBER = 5;
    public static final int CLICK_POS_FIELD_NUMBER = 1;
    private static final p1 DEFAULT_INSTANCE;
    private static volatile Parser<p1> PARSER = null;
    public static final int SCREEN_SIZE_FIELD_NUMBER = 2;
    public static final int VIEW_POS_FIELD_NUMBER = 3;
    public static final int VIEW_SIZE_FIELD_NUMBER = 4;
    private Internal.ProtobufList<n1> buttons_ = GeneratedMessageLite.emptyProtobufList();
    private B1 clickPos_;
    private D1 screenSize_;
    private B1 viewPos_;
    private D1 viewSize_;

    static {
        p1 p1Var = new p1();
        DEFAULT_INSTANCE = p1Var;
        GeneratedMessageLite.registerDefaultInstance(p1.class, p1Var);
    }

    public static void a(p1 p1Var, ArrayList arrayList) {
        Internal.ProtobufList<n1> protobufList = p1Var.buttons_;
        if (!protobufList.isModifiable()) {
            p1Var.buttons_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) p1Var.buttons_);
    }

    public static void b(p1 p1Var, B1 b12) {
        p1Var.getClass();
        p1Var.clickPos_ = b12;
    }

    public static void c(p1 p1Var, D1 d12) {
        p1Var.getClass();
        p1Var.screenSize_ = d12;
    }

    public static void d(p1 p1Var, B1 b12) {
        p1Var.getClass();
        p1Var.viewPos_ = b12;
    }

    public static void e(p1 p1Var, D1 d12) {
        p1Var.getClass();
        p1Var.viewSize_ = d12;
    }

    public static o1 g() {
        return (o1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1867d1.f28483a[methodToInvoke.ordinal()]) {
            case 1:
                return new p1();
            case 2:
                return new o1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\u001b", new Object[]{"clickPos_", "screenSize_", "viewPos_", "viewSize_", "buttons_", n1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<p1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (p1.class) {
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
