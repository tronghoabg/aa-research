package com.google.e.a.h;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ad extends du<ad, ac> implements fj {
    private static final ad DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile fo<ad> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.v.v keyValue_ = com.google.v.v.f13054a;
    private ah params_;
    private int version_;

    static {
        ad adVar = new ad();
        DEFAULT_INSTANCE = adVar;
        du.registerDefaultInstance(ad.class, adVar);
    }

    private ad() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyValue() {
        this.keyValue_ = getDefaultInstance().getKeyValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static ad getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(ah ahVar) {
        Objects.requireNonNull(ahVar);
        ah ahVar2 = this.params_;
        if (ahVar2 != null && ahVar2 != ah.getDefaultInstance()) {
            ag agVarNewBuilder = ah.newBuilder(ahVar2);
            agVarNewBuilder.mergeFrom((ag) ahVar);
            ahVar = agVarNewBuilder.buildPartial();
        }
        this.params_ = ahVar;
        this.bitField0_ |= 1;
    }

    public static ac newBuilder() {
        return (ac) DEFAULT_INSTANCE.createBuilder();
    }

    public static ad parseDelimitedFrom(InputStream inputStream) {
        return (ad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ad parseFrom(com.google.v.v vVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ad> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyValue(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.keyValue_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.params_ = ahVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i2) {
        this.version_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
        }
        if (iOrdinal == 3) {
            return new ad();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ac(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ad> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ad.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.v.v getKeyValue() {
        return this.keyValue_;
    }

    public ah getParams() {
        ah ahVar = this.params_;
        return ahVar == null ? ah.getDefaultInstance() : ahVar;
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasParams() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ac newBuilder(ad adVar) {
        return (ac) DEFAULT_INSTANCE.createBuilder(adVar);
    }

    public static ad parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ad parseFrom(com.google.v.v vVar, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ad parseFrom(com.google.v.z zVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ad parseFrom(com.google.v.z zVar, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ad parseFrom(InputStream inputStream) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ad parseFrom(InputStream inputStream, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ad parseFrom(ByteBuffer byteBuffer) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ad parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ad parseFrom(byte[] bArr) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ad parseFrom(byte[] bArr, de deVar) {
        return (ad) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
