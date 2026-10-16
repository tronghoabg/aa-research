package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class he extends com.google.v.du<he, hd> implements com.google.v.fj {
    private static final he DEFAULT_INSTANCE;
    public static final int LOWER_AMOUNT_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<he> PARSER = null;
    public static final int UNIT_FIELD_NUMBER = 3;
    public static final int UPPER_AMOUNT_FIELD_NUMBER = 2;
    private int bitField0_;
    private int lowerAmount_;
    private int unit_;
    private int upperAmount_;

    static {
        he heVar = new he();
        DEFAULT_INSTANCE = heVar;
        com.google.v.du.registerDefaultInstance(he.class, heVar);
    }

    private he() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLowerAmount() {
        this.bitField0_ &= -2;
        this.lowerAmount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.bitField0_ &= -5;
        this.unit_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpperAmount() {
        this.bitField0_ &= -3;
        this.upperAmount_ = 0;
    }

    public static he getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hd newBuilder() {
        return (hd) DEFAULT_INSTANCE.createBuilder();
    }

    public static he parseDelimitedFrom(InputStream inputStream) {
        return (he) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static he parseFrom(com.google.v.v vVar) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<he> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLowerAmount(int i2) {
        this.bitField0_ |= 1;
        this.lowerAmount_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnit(hf hfVar) {
        this.unit_ = hfVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpperAmount(int i2) {
        this.bitField0_ |= 2;
        this.upperAmount_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"bitField0_", "lowerAmount_", "upperAmount_", "unit_", ha.f11886c});
        }
        if (iOrdinal == 3) {
            return new he();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<he> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (he.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getLowerAmount() {
        return this.lowerAmount_;
    }

    public hf getUnit() {
        hf hfVarA = hf.a(this.unit_);
        return hfVarA == null ? hf.UNDEFINED_ENERGY_UNIT : hfVarA;
    }

    public int getUpperAmount() {
        return this.upperAmount_;
    }

    public boolean hasLowerAmount() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUnit() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUpperAmount() {
        return (this.bitField0_ & 2) != 0;
    }

    public static hd newBuilder(he heVar) {
        return (hd) DEFAULT_INSTANCE.createBuilder(heVar);
    }

    public static he parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (he) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static he parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static he parseFrom(com.google.v.z zVar) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static he parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static he parseFrom(InputStream inputStream) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static he parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static he parseFrom(ByteBuffer byteBuffer) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static he parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static he parseFrom(byte[] bArr) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static he parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (he) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
