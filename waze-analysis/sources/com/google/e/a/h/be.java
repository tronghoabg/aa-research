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
public final class be extends du<be, bd> implements fj {
    private static final be DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile fo<be> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private int keySize_;
    private bg params_;
    private int version_;

    static {
        be beVar = new be();
        DEFAULT_INSTANCE = beVar;
        du.registerDefaultInstance(be.class, beVar);
    }

    private be() {
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

    public static be getDefaultInstance() {
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

    public static bd newBuilder() {
        return (bd) DEFAULT_INSTANCE.createBuilder();
    }

    public static be parseDelimitedFrom(InputStream inputStream) {
        return (be) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static be parseFrom(com.google.v.v vVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<be> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeySize(int i2) {
        this.keySize_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"bitField0_", "params_", "keySize_", "version_"});
        }
        if (iOrdinal == 3) {
            return new be();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<be> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (be.class) {
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

    public static bd newBuilder(be beVar) {
        return (bd) DEFAULT_INSTANCE.createBuilder(beVar);
    }

    public static be parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (be) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static be parseFrom(com.google.v.v vVar, de deVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static be parseFrom(com.google.v.z zVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static be parseFrom(com.google.v.z zVar, de deVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static be parseFrom(InputStream inputStream) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static be parseFrom(InputStream inputStream, de deVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static be parseFrom(ByteBuffer byteBuffer) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static be parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static be parseFrom(byte[] bArr) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static be parseFrom(byte[] bArr, de deVar) {
        return (be) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
