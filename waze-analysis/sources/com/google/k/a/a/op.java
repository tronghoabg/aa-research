package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class op extends com.google.v.du<op, on> implements com.google.v.fj {
    private static final op DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<op> PARSER = null;
    public static final int UNIT_FIELD_NUMBER = 2;
    public static final int WEIGHT_FIELD_NUMBER = 1;
    private int bitField0_;
    private int unit_;
    private float weight_;

    static {
        op opVar = new op();
        DEFAULT_INSTANCE = opVar;
        com.google.v.du.registerDefaultInstance(op.class, opVar);
    }

    private op() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.bitField0_ &= -3;
        this.unit_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeight() {
        this.bitField0_ &= -2;
        this.weight_ = 0.0f;
    }

    public static op getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static on newBuilder() {
        return (on) DEFAULT_INSTANCE.createBuilder();
    }

    public static op parseDelimitedFrom(InputStream inputStream) {
        return (op) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static op parseFrom(com.google.v.v vVar) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<op> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnit(oo ooVar) {
        this.unit_ = ooVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeight(float f2) {
        this.bitField0_ |= 1;
        this.weight_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "weight_", "unit_", lq.f12096i});
        }
        if (iOrdinal == 3) {
            return new op();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new on(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<op> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (op.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public oo getUnit() {
        oo ooVarA = oo.a(this.unit_);
        return ooVarA == null ? oo.UNIT_UNKNOWN : ooVarA;
    }

    public float getWeight() {
        return this.weight_;
    }

    public boolean hasUnit() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasWeight() {
        return (this.bitField0_ & 1) != 0;
    }

    public static on newBuilder(op opVar) {
        return (on) DEFAULT_INSTANCE.createBuilder(opVar);
    }

    public static op parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (op) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static op parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static op parseFrom(com.google.v.z zVar) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static op parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static op parseFrom(InputStream inputStream) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static op parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static op parseFrom(ByteBuffer byteBuffer) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static op parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static op parseFrom(byte[] bArr) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static op parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (op) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
