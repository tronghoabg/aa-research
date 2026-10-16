package com.moloco.sdk;

import com.applovin.shadow.okio.Segment;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class Q extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ACCESSIBILITY_INFO_FIELD_NUMBER = 11;
    public static final int AD_INFO_FIELD_NUMBER = 8;
    public static final int AUDIO_INFO_FIELD_NUMBER = 10;
    public static final int BATTERY_INFO_FIELD_NUMBER = 9;
    private static final Q DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 3;
    public static final int DIR_INFO_FIELD_NUMBER = 6;
    public static final int IDFV_FIELD_NUMBER = 1;
    public static final int IMP_LVL_REV_DATA_FIELD_NUMBER = 12;
    public static final int INFO_FIELD_NUMBER = 4;
    public static final int MEMORY_INFO_FIELD_NUMBER = 5;
    public static final int NETWORK_INFO_FIELD_NUMBER = 7;
    private static volatile Parser<Q> PARSER = null;
    public static final int PRIVACY_FIELD_NUMBER = 2;
    public static final int TEST_CONFIG_FIELD_NUMBER = 13;
    private C1947k accessibilityInfo_;
    private C1951m adInfo_;
    private C1957p audioInfo_;
    private C1968s batteryInfo_;
    private int bitField0_;
    private C1976w device_;
    private C2141y dirInfo_;
    private String idfv_ = "";
    private E impLvlRevData_;
    private N info_;
    private G memoryInfo_;
    private J networkInfo_;
    private L privacy_;
    private P testConfig_;

    static {
        Q q4 = new Q();
        DEFAULT_INSTANCE = q4;
        GeneratedMessageLite.registerDefaultInstance(Q.class, q4);
    }

    public static void a(Q q4, C1947k c1947k) {
        q4.getClass();
        c1947k.getClass();
        q4.accessibilityInfo_ = c1947k;
        q4.bitField0_ |= 256;
    }

    public static void b(Q q4, C1951m c1951m) {
        q4.getClass();
        c1951m.getClass();
        q4.adInfo_ = c1951m;
        q4.bitField0_ |= 32;
    }

    public static void c(Q q4, C1957p c1957p) {
        q4.getClass();
        c1957p.getClass();
        q4.audioInfo_ = c1957p;
        q4.bitField0_ |= 128;
    }

    public static void d(Q q4, C1968s c1968s) {
        q4.getClass();
        c1968s.getClass();
        q4.batteryInfo_ = c1968s;
        q4.bitField0_ |= 64;
    }

    public static void e(Q q4, C1976w c1976w) {
        q4.getClass();
        c1976w.getClass();
        q4.device_ = c1976w;
    }

    public static void f(Q q4, C2141y c2141y) {
        q4.getClass();
        c2141y.getClass();
        q4.dirInfo_ = c2141y;
        q4.bitField0_ |= 8;
    }

    public static void g(Q q4, E e7) {
        q4.getClass();
        e7.getClass();
        q4.impLvlRevData_ = e7;
        q4.bitField0_ |= 512;
    }

    public static void h(Q q4, N n10) {
        q4.getClass();
        n10.getClass();
        q4.info_ = n10;
        q4.bitField0_ |= 2;
    }

    public static void i(Q q4, G g9) {
        q4.getClass();
        g9.getClass();
        q4.memoryInfo_ = g9;
        q4.bitField0_ |= 4;
    }

    public static void j(Q q4, J j8) {
        q4.getClass();
        j8.getClass();
        q4.networkInfo_ = j8;
        q4.bitField0_ |= 16;
    }

    public static void k(Q q4, L l10) {
        q4.getClass();
        l10.getClass();
        q4.privacy_ = l10;
    }

    public static void l(Q q4, P p10) {
        q4.getClass();
        p10.getClass();
        q4.testConfig_ = p10;
        q4.bitField0_ |= Segment.SHARE_MINIMUM;
    }

    public static C1970t n() {
        return (C1970t) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new Q();
            case 2:
                return new C1970t(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ለ\u0000\u0002\t\u0003\t\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0005\tဉ\u0006\nဉ\u0007\u000bဉ\b\fဉ\t\rဉ\n", new Object[]{"bitField0_", "idfv_", "privacy_", "device_", "info_", "memoryInfo_", "dirInfo_", "networkInfo_", "adInfo_", "batteryInfo_", "audioInfo_", "accessibilityInfo_", "impLvlRevData_", "testConfig_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Q> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Q.class) {
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
