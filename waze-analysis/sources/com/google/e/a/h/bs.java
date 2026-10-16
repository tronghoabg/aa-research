package com.google.e.a.h;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bs extends du<bs, br> implements bt {
    private static final bs DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile fo<bs> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private bj keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        bs bsVar = new bs();
        DEFAULT_INSTANCE = bsVar;
        du.registerDefaultInstance(bs.class, bsVar);
    }

    private bs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyData() {
        this.keyData_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyId() {
        this.keyId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutputPrefixType() {
        this.outputPrefixType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public static bs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKeyData(bj bjVar) {
        Objects.requireNonNull(bjVar);
        bj bjVar2 = this.keyData_;
        if (bjVar2 != null && bjVar2 != bj.getDefaultInstance()) {
            bh bhVarNewBuilder = bj.newBuilder(bjVar2);
            bhVarNewBuilder.mergeFrom((bh) bjVar);
            bjVar = bhVarNewBuilder.buildPartial();
        }
        this.keyData_ = bjVar;
        this.bitField0_ |= 1;
    }

    public static br newBuilder() {
        return (br) DEFAULT_INSTANCE.createBuilder();
    }

    public static bs parseDelimitedFrom(InputStream inputStream) {
        return (bs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bs parseFrom(com.google.v.v vVar) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyData(bj bjVar) {
        Objects.requireNonNull(bjVar);
        this.keyData_ = bjVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyId(int i2) {
        this.keyId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutputPrefixType(ci ciVar) {
        this.outputPrefixType_ = ciVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutputPrefixTypeValue(int i2) {
        this.outputPrefixType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(bk bkVar) {
        this.status_ = bkVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusValue(int i2) {
        this.status_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
        }
        if (iOrdinal == 3) {
            return new bs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new br(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bs.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bj getKeyData() {
        bj bjVar = this.keyData_;
        return bjVar == null ? bj.getDefaultInstance() : bjVar;
    }

    public int getKeyId() {
        return this.keyId_;
    }

    public ci getOutputPrefixType() {
        ci ciVarA = ci.a(this.outputPrefixType_);
        return ciVarA == null ? ci.UNRECOGNIZED : ciVarA;
    }

    public int getOutputPrefixTypeValue() {
        return this.outputPrefixType_;
    }

    public bk getStatus() {
        bk bkVarA = bk.a(this.status_);
        return bkVarA == null ? bk.UNRECOGNIZED : bkVarA;
    }

    public int getStatusValue() {
        return this.status_;
    }

    public boolean hasKeyData() {
        return (this.bitField0_ & 1) != 0;
    }

    public static br newBuilder(bs bsVar) {
        return (br) DEFAULT_INSTANCE.createBuilder(bsVar);
    }

    public static bs parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bs parseFrom(com.google.v.v vVar, de deVar) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bs parseFrom(com.google.v.z zVar) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bs parseFrom(com.google.v.z zVar, de deVar) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bs parseFrom(InputStream inputStream) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bs parseFrom(InputStream inputStream, de deVar) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bs parseFrom(ByteBuffer byteBuffer) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bs parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bs parseFrom(byte[] bArr) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bs parseFrom(byte[] bArr, de deVar) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
