package com.moloco.sdk;

import android.os.Build;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1976w extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BRAND_FIELD_NUMBER = 23;
    public static final int CARRIER_FIELD_NUMBER = 6;
    public static final int DBT_FIELD_NUMBER = 15;
    private static final C1976w DEFAULT_INSTANCE;
    public static final int DEVICETYPE_FIELD_NUMBER = 7;
    public static final int GEO_FIELD_NUMBER = 9;
    public static final int HARDWARE_FIELD_NUMBER = 22;
    public static final int HAS_GY_FIELD_NUMBER = 17;
    public static final int HWV_FIELD_NUMBER = 5;
    public static final int H_FIELD_NUMBER = 11;
    public static final int JS_FIELD_NUMBER = 8;
    public static final int KB_LOC_FIELD_NUMBER = 18;
    public static final int LANGUAGE_FIELD_NUMBER = 1;
    public static final int LOCALE_FIELD_NUMBER = 19;
    public static final int MAKE_FIELD_NUMBER = 3;
    public static final int MODEL_FIELD_NUMBER = 4;
    public static final int ORTN_FIELD_NUMBER = 16;
    public static final int OSV_FIELD_NUMBER = 2;
    public static final int OS_FIELD_NUMBER = 14;
    private static volatile Parser<C1976w> PARSER = null;
    public static final int PPI_FIELD_NUMBER = 12;
    public static final int PXRATIO_FIELD_NUMBER = 13;
    public static final int W_FIELD_NUMBER = 10;
    public static final int XDPI_FIELD_NUMBER = 20;
    public static final int YDPI_FIELD_NUMBER = 21;
    private int bitField0_;
    private long dbt_;
    private int devicetype_;
    private A geo_;
    private int h_;
    private boolean hasGy_;
    private int js_;
    private int ortn_;
    private int ppi_;
    private double pxratio_;
    private int w_;
    private float xdpi_;
    private float ydpi_;
    private String language_ = "";
    private String osv_ = "";
    private String make_ = "";
    private String model_ = "";
    private String hwv_ = "";
    private String carrier_ = "";
    private String os_ = "";
    private String kbLoc_ = "";
    private String locale_ = "";
    private String hardware_ = "";
    private String brand_ = "";

    static {
        C1976w c1976w = new C1976w();
        DEFAULT_INSTANCE = c1976w;
        GeneratedMessageLite.registerDefaultInstance(C1976w.class, c1976w);
    }

    public static void a(C1976w c1976w, String str) {
        c1976w.getClass();
        c1976w.bitField0_ |= 4194304;
        c1976w.brand_ = str;
    }

    public static void b(C1976w c1976w, String str) {
        c1976w.getClass();
        c1976w.bitField0_ |= 32;
        c1976w.carrier_ = str;
    }

    public static void c(C1976w c1976w, long j8) {
        c1976w.bitField0_ |= Http2.INITIAL_MAX_FRAME_SIZE;
        c1976w.dbt_ = j8;
    }

    public static void d(C1976w c1976w, int i5) {
        c1976w.bitField0_ |= 64;
        c1976w.devicetype_ = i5;
    }

    public static void e(C1976w c1976w, A a5) {
        c1976w.getClass();
        a5.getClass();
        c1976w.geo_ = a5;
        c1976w.bitField0_ |= 256;
    }

    public static void f(C1976w c1976w, int i5) {
        c1976w.bitField0_ |= Segment.SHARE_MINIMUM;
        c1976w.h_ = i5;
    }

    public static void g(C1976w c1976w, String str) {
        c1976w.getClass();
        c1976w.bitField0_ |= 2097152;
        c1976w.hardware_ = str;
    }

    public static void h(C1976w c1976w, boolean z2) {
        c1976w.bitField0_ |= 65536;
        c1976w.hasGy_ = z2;
    }

    public static void i(C1976w c1976w, String str) {
        c1976w.getClass();
        c1976w.bitField0_ |= 16;
        c1976w.hwv_ = str;
    }

    public static void j(C1976w c1976w) {
        c1976w.bitField0_ |= 128;
        c1976w.js_ = 1;
    }

    public static void k(C1976w c1976w, String str) {
        c1976w.getClass();
        str.getClass();
        c1976w.bitField0_ |= 131072;
        c1976w.kbLoc_ = str;
    }

    public static void l(C1976w c1976w, String str) {
        c1976w.getClass();
        c1976w.bitField0_ |= 1;
        c1976w.language_ = str;
    }

    public static void m(C1976w c1976w, String str) {
        c1976w.getClass();
        str.getClass();
        c1976w.bitField0_ |= 262144;
        c1976w.locale_ = str;
    }

    public static void n(C1976w c1976w, String str) {
        c1976w.getClass();
        c1976w.bitField0_ |= 4;
        c1976w.make_ = str;
    }

    public static void o(C1976w c1976w, String str) {
        c1976w.getClass();
        c1976w.bitField0_ |= 8;
        c1976w.model_ = str;
    }

    public static void p(C1976w c1976w, EnumC1974v enumC1974v) {
        c1976w.getClass();
        c1976w.ortn_ = enumC1974v.getNumber();
        c1976w.bitField0_ |= 32768;
    }

    public static void q(C1976w c1976w) {
        c1976w.getClass();
        c1976w.bitField0_ |= Segment.SIZE;
        c1976w.os_ = "android";
    }

    public static void r(C1976w c1976w) {
        String str = Build.VERSION.RELEASE;
        c1976w.getClass();
        str.getClass();
        c1976w.bitField0_ |= 2;
        c1976w.osv_ = str;
    }

    public static void s(C1976w c1976w, int i5) {
        c1976w.bitField0_ |= 2048;
        c1976w.ppi_ = i5;
    }

    public static void t(C1976w c1976w, double d3) {
        c1976w.bitField0_ |= 4096;
        c1976w.pxratio_ = d3;
    }

    public static void u(C1976w c1976w, int i5) {
        c1976w.bitField0_ |= 512;
        c1976w.w_ = i5;
    }

    public static void v(C1976w c1976w, float f10) {
        c1976w.bitField0_ |= 524288;
        c1976w.xdpi_ = f10;
    }

    public static void w(C1976w c1976w, float f10) {
        c1976w.bitField0_ |= 1048576;
        c1976w.ydpi_ = f10;
    }

    public static C1972u y() {
        return (C1972u) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1976w();
            case 2:
                return new C1972u(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ဋ\u0006\bဋ\u0007\tဉ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rက\f\u000eለ\r\u000fဃ\u000e\u0010ဌ\u000f\u0011ဇ\u0010\u0012ለ\u0011\u0013ለ\u0012\u0014ခ\u0013\u0015ခ\u0014\u0016ለ\u0015\u0017ለ\u0016", new Object[]{"bitField0_", "language_", "osv_", "make_", "model_", "hwv_", "carrier_", "devicetype_", "js_", "geo_", "w_", "h_", "ppi_", "pxratio_", "os_", "dbt_", "ortn_", "hasGy_", "kbLoc_", "locale_", "xdpi_", "ydpi_", "hardware_", "brand_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1976w> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1976w.class) {
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
