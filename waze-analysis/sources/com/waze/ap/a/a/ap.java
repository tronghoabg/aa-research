package com.waze.ap.a.a;

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
/* loaded from: classes6.dex */
public final class ap extends du<ap, an> implements fj {
    public static final int ANSWER_BASIC_INFO_FIELD_NUMBER = 1;
    private static final ap DEFAULT_INSTANCE;
    private static volatile fo<ap> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private b answerBasicInfo_;
    private int bitField0_;
    private int type_;

    static {
        ap apVar = new ap();
        DEFAULT_INSTANCE = apVar;
        du.registerDefaultInstance(ap.class, apVar);
    }

    private ap() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswerBasicInfo() {
        this.answerBasicInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -3;
        this.type_ = 0;
    }

    public static ap getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAnswerBasicInfo(b bVar) {
        Objects.requireNonNull(bVar);
        b bVar2 = this.answerBasicInfo_;
        if (bVar2 != null && bVar2 != b.getDefaultInstance()) {
            a aVarNewBuilder = b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.answerBasicInfo_ = bVar;
        this.bitField0_ |= 1;
    }

    public static an newBuilder() {
        return (an) DEFAULT_INSTANCE.createBuilder();
    }

    public static ap parseDelimitedFrom(InputStream inputStream) {
        return (ap) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ap parseFrom(com.google.v.v vVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ap> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswerBasicInfo(b bVar) {
        Objects.requireNonNull(bVar);
        this.answerBasicInfo_ = bVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ao aoVar) {
        this.type_ = aoVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.bitField0_ |= 2;
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "answerBasicInfo_", "type_"});
        }
        if (iOrdinal == 3) {
            return new ap();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new an(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ap> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ap.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public b getAnswerBasicInfo() {
        b bVar = this.answerBasicInfo_;
        return bVar == null ? b.getDefaultInstance() : bVar;
    }

    public ao getType() {
        ao aoVarB = ao.b(this.type_);
        return aoVarB == null ? ao.UNRECOGNIZED : aoVarB;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasAnswerBasicInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static an newBuilder(ap apVar) {
        return (an) DEFAULT_INSTANCE.createBuilder(apVar);
    }

    public static ap parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ap) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ap parseFrom(com.google.v.v vVar, de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ap parseFrom(com.google.v.z zVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ap parseFrom(com.google.v.z zVar, de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ap parseFrom(InputStream inputStream) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ap parseFrom(InputStream inputStream, de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ap parseFrom(ByteBuffer byteBuffer) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ap parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ap parseFrom(byte[] bArr) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ap parseFrom(byte[] bArr, de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
