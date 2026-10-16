package com.google.e.a.h;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ah extends du<ah, ag> implements fj {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final ah DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    private static volatile fo<ah> PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;

    static {
        ah ahVar = new ah();
        DEFAULT_INSTANCE = ahVar;
        du.registerDefaultInstance(ah.class, ahVar);
    }

    private ah() {
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

    public static ah getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ag newBuilder() {
        return (ag) DEFAULT_INSTANCE.createBuilder();
    }

    public static ah parseDelimitedFrom(InputStream inputStream) {
        return (ah) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ah parseFrom(com.google.v.v vVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ah> parser() {
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

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_"});
        }
        if (iOrdinal == 3) {
            return new ah();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ag(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ah> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ah.class) {
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

    public static ag newBuilder(ah ahVar) {
        return (ag) DEFAULT_INSTANCE.createBuilder(ahVar);
    }

    public static ah parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ah) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ah parseFrom(com.google.v.v vVar, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ah parseFrom(com.google.v.z zVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ah parseFrom(com.google.v.z zVar, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ah parseFrom(InputStream inputStream) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ah parseFrom(InputStream inputStream, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ah parseFrom(ByteBuffer byteBuffer) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ah parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ah parseFrom(byte[] bArr) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ah parseFrom(byte[] bArr, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
