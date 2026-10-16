package com.google.v;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dz extends du<dz, dw> implements fj {
    public static final int API_LEVEL_FIELD_NUMBER = 2;
    private static final dz DEFAULT_INSTANCE;
    public static final int LEGACY_UNMARSHAL_JSON_ENUM_FIELD_NUMBER = 1;
    public static final int OPTIMIZE_MODE_FIELD_NUMBER = 4;
    private static volatile fo<dz> PARSER = null;
    public static final int STRIP_ENUM_PREFIX_FIELD_NUMBER = 3;
    private int apiLevel_;
    private int bitField0_;
    private boolean legacyUnmarshalJsonEnum_;
    private int optimizeMode_;
    private int stripEnumPrefix_;

    static {
        dz dzVar = new dz();
        DEFAULT_INSTANCE = dzVar;
        du.registerDefaultInstance(dz.class, dzVar);
    }

    private dz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApiLevel() {
        this.bitField0_ &= -3;
        this.apiLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacyUnmarshalJsonEnum() {
        this.bitField0_ &= -2;
        this.legacyUnmarshalJsonEnum_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptimizeMode() {
        this.bitField0_ &= -9;
        this.optimizeMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStripEnumPrefix() {
        this.bitField0_ &= -5;
        this.stripEnumPrefix_ = 0;
    }

    public static dz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dw newBuilder() {
        return (dw) DEFAULT_INSTANCE.createBuilder();
    }

    public static dz parseDelimitedFrom(InputStream inputStream) {
        return (dz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dz parseFrom(v vVar) {
        return (dz) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<dz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApiLevel(dv dvVar) {
        this.apiLevel_ = dvVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyUnmarshalJsonEnum(boolean z) {
        this.bitField0_ |= 1;
        this.legacyUnmarshalJsonEnum_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptimizeMode(dx dxVar) {
        this.optimizeMode_ = dxVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStripEnumPrefix(dy dyVar) {
        this.stripEnumPrefix_ = dyVar.getNumber();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "legacyUnmarshalJsonEnum_", "apiLevel_", cl.f12816d, "stripEnumPrefix_", cl.f12818f, "optimizeMode_", cl.f12817e});
        }
        if (iOrdinal == 3) {
            return new dz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<dz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public dv getApiLevel() {
        dv dvVarA = dv.a(this.apiLevel_);
        return dvVarA == null ? dv.API_LEVEL_UNSPECIFIED : dvVarA;
    }

    public boolean getLegacyUnmarshalJsonEnum() {
        return this.legacyUnmarshalJsonEnum_;
    }

    public dx getOptimizeMode() {
        dx dxVarA = dx.a(this.optimizeMode_);
        return dxVarA == null ? dx.OPTIMIZE_MODE_UNSPECIFIED : dxVarA;
    }

    public dy getStripEnumPrefix() {
        dy dyVarA = dy.a(this.stripEnumPrefix_);
        return dyVarA == null ? dy.STRIP_ENUM_PREFIX_UNSPECIFIED : dyVarA;
    }

    public boolean hasApiLevel() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLegacyUnmarshalJsonEnum() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOptimizeMode() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasStripEnumPrefix() {
        return (this.bitField0_ & 4) != 0;
    }

    public static dw newBuilder(dz dzVar) {
        return (dw) DEFAULT_INSTANCE.createBuilder(dzVar);
    }

    public static dz parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (dz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dz parseFrom(v vVar, de deVar) {
        return (dz) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dz parseFrom(z zVar) {
        return (dz) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dz parseFrom(z zVar, de deVar) {
        return (dz) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dz parseFrom(InputStream inputStream) {
        return (dz) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dz parseFrom(InputStream inputStream, de deVar) {
        return (dz) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dz parseFrom(ByteBuffer byteBuffer) {
        return (dz) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dz parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (dz) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dz parseFrom(byte[] bArr) {
        return (dz) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dz parseFrom(byte[] bArr, de deVar) {
        return (dz) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
