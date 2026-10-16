package com.google.aa.a.a.a.a;

import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bp extends du<bp, be> implements fj {
    private static final bp DEFAULT_INSTANCE;
    public static final int MAC_OS_DEVICE_INFO_FIELD_NUMBER = 2;
    private static volatile fo<bp> PARSER = null;
    public static final int WINDOWS_DEVICE_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private bh macOsDeviceInfo_;
    private bo windowsDeviceInfo_;

    static {
        bp bpVar = new bp();
        DEFAULT_INSTANCE = bpVar;
        du.registerDefaultInstance(bp.class, bpVar);
    }

    private bp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMacOsDeviceInfo() {
        this.macOsDeviceInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWindowsDeviceInfo() {
        this.windowsDeviceInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static bp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMacOsDeviceInfo(bh bhVar) {
        Objects.requireNonNull(bhVar);
        bh bhVar2 = this.macOsDeviceInfo_;
        if (bhVar2 != null && bhVar2 != bh.getDefaultInstance()) {
            bg bgVarNewBuilder = bh.newBuilder(bhVar2);
            bgVarNewBuilder.mergeFrom((bg) bhVar);
            bhVar = bgVarNewBuilder.buildPartial();
        }
        this.macOsDeviceInfo_ = bhVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWindowsDeviceInfo(bo boVar) {
        Objects.requireNonNull(boVar);
        bo boVar2 = this.windowsDeviceInfo_;
        if (boVar2 != null && boVar2 != bo.getDefaultInstance()) {
            bn bnVarNewBuilder = bo.newBuilder(boVar2);
            bnVarNewBuilder.mergeFrom((bn) boVar);
            boVar = bnVarNewBuilder.buildPartial();
        }
        this.windowsDeviceInfo_ = boVar;
        this.bitField0_ |= 1;
    }

    public static be newBuilder() {
        return (be) DEFAULT_INSTANCE.createBuilder();
    }

    public static bp parseDelimitedFrom(InputStream inputStream) {
        return (bp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bp parseFrom(com.google.v.v vVar) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMacOsDeviceInfo(bh bhVar) {
        Objects.requireNonNull(bhVar);
        this.macOsDeviceInfo_ = bhVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWindowsDeviceInfo(bo boVar) {
        Objects.requireNonNull(boVar);
        this.windowsDeviceInfo_ = boVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "windowsDeviceInfo_", "macOsDeviceInfo_"});
        }
        if (iOrdinal == 3) {
            return new bp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new be(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bh getMacOsDeviceInfo() {
        bh bhVar = this.macOsDeviceInfo_;
        return bhVar == null ? bh.getDefaultInstance() : bhVar;
    }

    public bo getWindowsDeviceInfo() {
        bo boVar = this.windowsDeviceInfo_;
        return boVar == null ? bo.getDefaultInstance() : boVar;
    }

    public boolean hasMacOsDeviceInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasWindowsDeviceInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static be newBuilder(bp bpVar) {
        return (be) DEFAULT_INSTANCE.createBuilder(bpVar);
    }

    public static bp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bp parseFrom(com.google.v.z zVar) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bp parseFrom(InputStream inputStream) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bp parseFrom(ByteBuffer byteBuffer) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bp parseFrom(byte[] bArr) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bp) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
