package com.google.aa.a.a.a.a;

import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g extends du<g, f> implements fj {
    private static final g DEFAULT_INSTANCE;
    public static final int IS_ANDROID_TV_FIELD_NUMBER = 4;
    public static final int IS_ANDROID_XR_FIELD_NUMBER = 6;
    public static final int IS_ANDROID_XR_PERIPHERAL_FIELD_NUMBER = 7;
    public static final int IS_AUTOMOTIVE_FIELD_NUMBER = 2;
    public static final int IS_BSTAR_FIELD_NUMBER = 5;
    public static final int IS_CHROME_OS_FIELD_NUMBER = 3;
    public static final int IS_DESKTOP_FIELD_NUMBER = 8;
    public static final int IS_WATCH_FIELD_NUMBER = 1;
    private static volatile fo<g> PARSER;
    private int bitField0_;
    private boolean isAndroidTv_;
    private boolean isAndroidXrPeripheral_;
    private boolean isAndroidXr_;
    private boolean isAutomotive_;
    private boolean isBstar_;
    private boolean isChromeOs_;
    private boolean isDesktop_;
    private boolean isWatch_;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        du.registerDefaultInstance(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAndroidTv() {
        this.bitField0_ &= -9;
        this.isAndroidTv_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAndroidXr() {
        this.bitField0_ &= -33;
        this.isAndroidXr_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAndroidXrPeripheral() {
        this.bitField0_ &= -65;
        this.isAndroidXrPeripheral_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAutomotive() {
        this.bitField0_ &= -3;
        this.isAutomotive_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBstar() {
        this.bitField0_ &= -17;
        this.isBstar_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsChromeOs() {
        this.bitField0_ &= -5;
        this.isChromeOs_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsDesktop() {
        this.bitField0_ &= -129;
        this.isDesktop_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsWatch() {
        this.bitField0_ &= -2;
        this.isWatch_ = false;
    }

    public static g getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static f newBuilder() {
        return (f) DEFAULT_INSTANCE.createBuilder();
    }

    public static g parseDelimitedFrom(InputStream inputStream) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(com.google.v.v vVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<g> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAndroidTv(boolean z) {
        this.bitField0_ |= 8;
        this.isAndroidTv_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAndroidXr(boolean z) {
        this.bitField0_ |= 32;
        this.isAndroidXr_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAndroidXrPeripheral(boolean z) {
        this.bitField0_ |= 64;
        this.isAndroidXrPeripheral_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAutomotive(boolean z) {
        this.bitField0_ |= 2;
        this.isAutomotive_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBstar(boolean z) {
        this.bitField0_ |= 16;
        this.isBstar_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsChromeOs(boolean z) {
        this.bitField0_ |= 4;
        this.isChromeOs_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsDesktop(boolean z) {
        this.bitField0_ |= 128;
        this.isDesktop_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsWatch(boolean z) {
        this.bitField0_ |= 1;
        this.isWatch_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"bitField0_", "isWatch_", "isAutomotive_", "isChromeOs_", "isAndroidTv_", "isBstar_", "isAndroidXr_", "isAndroidXrPeripheral_", "isDesktop_"});
        }
        if (iOrdinal == 3) {
            return new g();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new f(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<g> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (g.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsAndroidTv() {
        return this.isAndroidTv_;
    }

    public boolean getIsAndroidXr() {
        return this.isAndroidXr_;
    }

    public boolean getIsAndroidXrPeripheral() {
        return this.isAndroidXrPeripheral_;
    }

    public boolean getIsAutomotive() {
        return this.isAutomotive_;
    }

    public boolean getIsBstar() {
        return this.isBstar_;
    }

    public boolean getIsChromeOs() {
        return this.isChromeOs_;
    }

    public boolean getIsDesktop() {
        return this.isDesktop_;
    }

    public boolean getIsWatch() {
        return this.isWatch_;
    }

    public boolean hasIsAndroidTv() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsAndroidXr() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasIsAndroidXrPeripheral() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasIsAutomotive() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIsBstar() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasIsChromeOs() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsDesktop() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasIsWatch() {
        return (this.bitField0_ & 1) != 0;
    }

    public static f newBuilder(g gVar) {
        return (f) DEFAULT_INSTANCE.createBuilder(gVar);
    }

    public static g parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static g parseFrom(com.google.v.z zVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static g parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static g parseFrom(InputStream inputStream) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(ByteBuffer byteBuffer) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static g parseFrom(byte[] bArr) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static g parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
