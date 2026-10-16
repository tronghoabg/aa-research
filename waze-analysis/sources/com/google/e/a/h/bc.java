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
public final class bc extends du<bc, bb> implements fj {
    private static final bc DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile fo<bc> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.v.v keyValue_ = com.google.v.v.f13054a;
    private bg params_;
    private int version_;

    static {
        bc bcVar = new bc();
        DEFAULT_INSTANCE = bcVar;
        du.registerDefaultInstance(bc.class, bcVar);
    }

    private bc() {
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

    public static bc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(bg bgVar) {
        Objects.requireNonNull(bgVar);
        bg bgVar2 = this.params_;
        if (bgVar2 != null && bgVar2 != bg.getDefaultInstance()) {
            bf bfVarNewBuilder = bg.newBuilder(bgVar2);
            bfVarNewBuilder.mergeFrom((bf) bgVar);
            bgVar = bfVarNewBuilder.buildPartial();
        }
        this.params_ = bgVar;
        this.bitField0_ |= 1;
    }

    public static bb newBuilder() {
        return (bb) DEFAULT_INSTANCE.createBuilder();
    }

    public static bc parseDelimitedFrom(InputStream inputStream) {
        return (bc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bc parseFrom(com.google.v.v vVar) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyValue(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.keyValue_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(bg bgVar) {
        Objects.requireNonNull(bgVar);
        this.params_ = bgVar;
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
            return new bc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bc.class) {
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

    public bg getParams() {
        bg bgVar = this.params_;
        return bgVar == null ? bg.getDefaultInstance() : bgVar;
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasParams() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bb newBuilder(bc bcVar) {
        return (bb) DEFAULT_INSTANCE.createBuilder(bcVar);
    }

    public static bc parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bc parseFrom(com.google.v.v vVar, de deVar) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bc parseFrom(com.google.v.z zVar) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bc parseFrom(com.google.v.z zVar, de deVar) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bc parseFrom(InputStream inputStream) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bc parseFrom(InputStream inputStream, de deVar) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bc parseFrom(ByteBuffer byteBuffer) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bc parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bc parseFrom(byte[] bArr) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bc parseFrom(byte[] bArr, de deVar) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
