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
public final class p extends du<p, o> implements fj {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final p DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    public static final int HMAC_PARAMS_FIELD_NUMBER = 4;
    private static volatile fo<p> PARSER;
    private int bitField0_;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;
    private bg hmacParams_;

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        du.registerDefaultInstance(p.class, pVar);
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCiphertextSegmentSize() {
        this.ciphertextSegmentSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDerivedKeySize() {
        this.derivedKeySize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHkdfHashType() {
        this.hkdfHashType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHmacParams() {
        this.hmacParams_ = null;
        this.bitField0_ &= -2;
    }

    public static p getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHmacParams(bg bgVar) {
        Objects.requireNonNull(bgVar);
        bg bgVar2 = this.hmacParams_;
        if (bgVar2 != null && bgVar2 != bg.getDefaultInstance()) {
            bf bfVarNewBuilder = bg.newBuilder(bgVar2);
            bfVarNewBuilder.mergeFrom((bf) bgVar);
            bgVar = bfVarNewBuilder.buildPartial();
        }
        this.hmacParams_ = bgVar;
        this.bitField0_ |= 1;
    }

    public static o newBuilder() {
        return (o) DEFAULT_INSTANCE.createBuilder();
    }

    public static p parseDelimitedFrom(InputStream inputStream) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(com.google.v.v vVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<p> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCiphertextSegmentSize(int i2) {
        this.ciphertextSegmentSize_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDerivedKeySize(int i2) {
        this.derivedKeySize_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHkdfHashType(ba baVar) {
        this.hkdfHashType_ = baVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHkdfHashTypeValue(int i2) {
        this.hkdfHashType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHmacParams(bg bgVar) {
        Objects.requireNonNull(bgVar);
        this.hmacParams_ = bgVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f\u0004ဉ\u0000", new Object[]{"bitField0_", "ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_", "hmacParams_"});
        }
        if (iOrdinal == 3) {
            return new p();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new o(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<p> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (p.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getCiphertextSegmentSize() {
        return this.ciphertextSegmentSize_;
    }

    public int getDerivedKeySize() {
        return this.derivedKeySize_;
    }

    public ba getHkdfHashType() {
        ba baVarA = ba.a(this.hkdfHashType_);
        return baVarA == null ? ba.UNRECOGNIZED : baVarA;
    }

    public int getHkdfHashTypeValue() {
        return this.hkdfHashType_;
    }

    public bg getHmacParams() {
        bg bgVar = this.hmacParams_;
        return bgVar == null ? bg.getDefaultInstance() : bgVar;
    }

    public boolean hasHmacParams() {
        return (this.bitField0_ & 1) != 0;
    }

    public static o newBuilder(p pVar) {
        return (o) DEFAULT_INSTANCE.createBuilder(pVar);
    }

    public static p parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(com.google.v.v vVar, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static p parseFrom(com.google.v.z zVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static p parseFrom(com.google.v.z zVar, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static p parseFrom(InputStream inputStream) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(InputStream inputStream, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(ByteBuffer byteBuffer) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static p parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static p parseFrom(byte[] bArr) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static p parseFrom(byte[] bArr, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
