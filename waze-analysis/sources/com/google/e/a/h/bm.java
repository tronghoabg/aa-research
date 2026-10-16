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
public final class bm extends du<bm, bl> implements fj {
    private static final bm DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile fo<bm> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private com.google.v.v value_ = com.google.v.v.f13054a;

    static {
        bm bmVar = new bm();
        DEFAULT_INSTANCE = bmVar;
        du.registerDefaultInstance(bm.class, bmVar);
    }

    private bm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutputPrefixType() {
        this.outputPrefixType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static bm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bl newBuilder() {
        return (bl) DEFAULT_INSTANCE.createBuilder();
    }

    public static bm parseDelimitedFrom(InputStream inputStream) {
        return (bm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bm parseFrom(com.google.v.v vVar) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setTypeUrl(String str) {
        Objects.requireNonNull(str);
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.typeUrl_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.value_ = vVar;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
        }
        if (iOrdinal == 3) {
            return new bm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ci getOutputPrefixType() {
        ci ciVarA = ci.a(this.outputPrefixType_);
        return ciVarA == null ? ci.UNRECOGNIZED : ciVarA;
    }

    public int getOutputPrefixTypeValue() {
        return this.outputPrefixType_;
    }

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public com.google.v.v getTypeUrlBytes() {
        return com.google.v.v.s(this.typeUrl_);
    }

    public com.google.v.v getValue() {
        return this.value_;
    }

    public static bl newBuilder(bm bmVar) {
        return (bl) DEFAULT_INSTANCE.createBuilder(bmVar);
    }

    public static bm parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bm parseFrom(com.google.v.v vVar, de deVar) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bm parseFrom(com.google.v.z zVar) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bm parseFrom(com.google.v.z zVar, de deVar) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bm parseFrom(InputStream inputStream) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bm parseFrom(InputStream inputStream, de deVar) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bm parseFrom(ByteBuffer byteBuffer) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bm parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bm parseFrom(byte[] bArr) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bm parseFrom(byte[] bArr, de deVar) {
        return (bm) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
