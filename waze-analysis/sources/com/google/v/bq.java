package com.google.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bq extends du<bq, bp> implements br {
    private static final bq DEFAULT_INSTANCE;
    public static final int EDITION_DEPRECATED_FIELD_NUMBER = 1;
    public static final int EDITION_ENUM_FIELD_NUMBER = 4;
    public static final int EDITION_FIELD_NUMBER = 3;
    private static volatile fo<bq> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int editionEnum_;
    private int edition_;
    private String value_ = "";
    private String editionDeprecated_ = "";

    static {
        bq bqVar = new bq();
        DEFAULT_INSTANCE = bqVar;
        du.registerDefaultInstance(bq.class, bqVar);
    }

    private bq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEdition() {
        this.bitField0_ &= -2;
        this.edition_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEditionDeprecated() {
        this.bitField0_ &= -9;
        this.editionDeprecated_ = getDefaultInstance().getEditionDeprecated();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEditionEnum() {
        this.bitField0_ &= -5;
        this.editionEnum_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.bitField0_ &= -3;
        this.value_ = getDefaultInstance().getValue();
    }

    public static bq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bp newBuilder() {
        return (bp) DEFAULT_INSTANCE.createBuilder();
    }

    public static bq parseDelimitedFrom(InputStream inputStream) {
        return (bq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bq parseFrom(v vVar) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEdition(am amVar) {
        this.edition_ = amVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionDeprecated(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.editionDeprecated_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionDeprecatedBytes(v vVar) {
        this.editionDeprecated_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionEnum(am amVar) {
        this.editionEnum_ = amVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(v vVar) {
        this.value_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            am amVar = am.EDITION_UNKNOWN;
            ei eiVar = ai.f12653c;
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0003\u0002ဈ\u0001\u0003᠌\u0000\u0004᠌\u0002", new Object[]{"bitField0_", "editionDeprecated_", "value_", "edition_", eiVar, "editionEnum_", eiVar});
        }
        if (iOrdinal == 3) {
            return new bq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public am getEdition() {
        am amVarA = am.a(this.edition_);
        return amVarA == null ? am.EDITION_UNKNOWN : amVarA;
    }

    @Deprecated
    public String getEditionDeprecated() {
        return this.editionDeprecated_;
    }

    @Deprecated
    public v getEditionDeprecatedBytes() {
        return v.s(this.editionDeprecated_);
    }

    @Deprecated
    public am getEditionEnum() {
        am amVarA = am.a(this.editionEnum_);
        return amVarA == null ? am.EDITION_UNKNOWN : amVarA;
    }

    public String getValue() {
        return this.value_;
    }

    public v getValueBytes() {
        return v.s(this.value_);
    }

    public boolean hasEdition() {
        return (this.bitField0_ & 1) != 0;
    }

    @Deprecated
    public boolean hasEditionDeprecated() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasEditionEnum() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bp newBuilder(bq bqVar) {
        return (bp) DEFAULT_INSTANCE.createBuilder(bqVar);
    }

    public static bq parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bq parseFrom(v vVar, de deVar) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bq parseFrom(z zVar) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bq parseFrom(z zVar, de deVar) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bq parseFrom(InputStream inputStream) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bq parseFrom(InputStream inputStream, de deVar) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bq parseFrom(ByteBuffer byteBuffer) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bq parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bq parseFrom(byte[] bArr) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bq parseFrom(byte[] bArr, de deVar) {
        return (bq) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
