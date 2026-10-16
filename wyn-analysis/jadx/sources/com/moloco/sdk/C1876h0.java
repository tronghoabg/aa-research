package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* renamed from: com.moloco.sdk.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1876h0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C1876h0 DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int EVENTS_FIELD_NUMBER = 6;
    public static final int IDFV_FIELD_NUMBER = 2;
    public static final int OS_FIELD_NUMBER = 3;
    private static volatile Parser<C1876h0> PARSER = null;
    public static final int PUBLISHER_APP_ID_FIELD_NUMBER = 5;
    public static final int PUBLISHER_ID_FIELD_NUMBER = 4;
    private String deviceId_ = "";
    private String idfv_ = "";
    private String os_ = "";
    private String publisherId_ = "";
    private String publisherAppId_ = "";
    private Internal.ProtobufList<C1872f0> events_ = GeneratedMessageLite.emptyProtobufList();

    static {
        C1876h0 c1876h0 = new C1876h0();
        DEFAULT_INSTANCE = c1876h0;
        GeneratedMessageLite.registerDefaultInstance(C1876h0.class, c1876h0);
    }

    public static void a(C1876h0 c1876h0, List list) {
        Internal.ProtobufList<C1872f0> protobufList = c1876h0.events_;
        if (!protobufList.isModifiable()) {
            c1876h0.events_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) list, (List) c1876h0.events_);
    }

    public static void b(C1876h0 c1876h0, String str) {
        c1876h0.getClass();
        c1876h0.deviceId_ = str;
    }

    public static void c(C1876h0 c1876h0) {
        c1876h0.getClass();
        c1876h0.os_ = "Android";
    }

    public static void d(C1876h0 c1876h0, String str) {
        c1876h0.getClass();
        str.getClass();
        c1876h0.publisherAppId_ = str;
    }

    public static void e(C1876h0 c1876h0, String str) {
        c1876h0.getClass();
        str.getClass();
        c1876h0.publisherId_ = str;
    }

    public static C1874g0 h() {
        return (C1874g0) DEFAULT_INSTANCE.createBuilder();
    }

    public static C1876h0 i(byte[] bArr) {
        return (C1876h0) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1866d0.f28482a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1876h0();
            case 2:
                return new C1874g0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"deviceId_", "idfv_", "os_", "publisherId_", "publisherAppId_", "events_", C1872f0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1876h0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1876h0.class) {
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

    public final Internal.ProtobufList g() {
        return this.events_;
    }
}
