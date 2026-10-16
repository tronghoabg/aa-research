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
public final class bx extends du<bx, bw> implements by {
    private static final bx DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile fo<bx> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        bx bxVar = new bx();
        DEFAULT_INSTANCE = bxVar;
        du.registerDefaultInstance(bx.class, bxVar);
    }

    private bx() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    public static bx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bw newBuilder() {
        return (bw) DEFAULT_INSTANCE.createBuilder();
    }

    public static bx parseDelimitedFrom(InputStream inputStream) {
        return (bx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bx parseFrom(com.google.v.v vVar) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String str) {
        Objects.requireNonNull(str);
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.typeUrl_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
        }
        if (iOrdinal == 3) {
            return new bx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
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

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public com.google.v.v getTypeUrlBytes() {
        return com.google.v.v.s(this.typeUrl_);
    }

    public static bw newBuilder(bx bxVar) {
        return (bw) DEFAULT_INSTANCE.createBuilder(bxVar);
    }

    public static bx parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bx parseFrom(com.google.v.v vVar, de deVar) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bx parseFrom(com.google.v.z zVar) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bx parseFrom(com.google.v.z zVar, de deVar) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bx parseFrom(InputStream inputStream) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bx parseFrom(InputStream inputStream, de deVar) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bx parseFrom(ByteBuffer byteBuffer) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bx parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bx parseFrom(byte[] bArr) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bx parseFrom(byte[] bArr, de deVar) {
        return (bx) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
