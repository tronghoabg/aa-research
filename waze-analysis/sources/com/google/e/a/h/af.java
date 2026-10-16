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
public final class af extends du<af, ae> implements fj {
    private static final af DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile fo<af> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private int keySize_;
    private ah params_;
    private int version_;

    static {
        af afVar = new af();
        DEFAULT_INSTANCE = afVar;
        du.registerDefaultInstance(af.class, afVar);
    }

    private af() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeySize() {
        this.keySize_ = 0;
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

    public static af getDefaultInstance() {
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

    public static ae newBuilder() {
        return (ae) DEFAULT_INSTANCE.createBuilder();
    }

    public static af parseDelimitedFrom(InputStream inputStream) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(com.google.v.v vVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<af> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeySize(int i2) {
        this.keySize_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"bitField0_", "params_", "keySize_", "version_"});
        }
        if (iOrdinal == 3) {
            return new af();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ae(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<af> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (af.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getKeySize() {
        return this.keySize_;
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

    public static ae newBuilder(af afVar) {
        return (ae) DEFAULT_INSTANCE.createBuilder(afVar);
    }

    public static af parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(com.google.v.v vVar, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static af parseFrom(com.google.v.z zVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static af parseFrom(com.google.v.z zVar, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static af parseFrom(InputStream inputStream) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(InputStream inputStream, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(ByteBuffer byteBuffer) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static af parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static af parseFrom(byte[] bArr) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static af parseFrom(byte[] bArr, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
