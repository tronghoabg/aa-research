package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kg extends com.google.v.du<kg, kd> implements kh {
    public static final int BEGIN_FIELD_NUMBER = 6;
    private static final kg DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 7;
    public static final int INVERTED_FIELD_NUMBER = 2;
    public static final int OCCASION_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<kg> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private kc begin_;
    private int bitField0_;
    private kc end_;
    private boolean inverted_;
    private int type_ = 1;
    private int occasion_ = 1;

    static {
        kg kgVar = new kg();
        DEFAULT_INSTANCE = kgVar;
        com.google.v.du.registerDefaultInstance(kg.class, kgVar);
    }

    private kg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBegin() {
        this.begin_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnd() {
        this.end_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInverted() {
        this.bitField0_ &= -3;
        this.inverted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOccasion() {
        this.bitField0_ &= -5;
        this.occasion_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 1;
    }

    public static kg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBegin(kc kcVar) {
        Objects.requireNonNull(kcVar);
        kc kcVar2 = this.begin_;
        if (kcVar2 != null && kcVar2 != kc.getDefaultInstance()) {
            jx jxVarNewBuilder = kc.newBuilder(kcVar2);
            jxVarNewBuilder.mergeFrom((jx) kcVar);
            kcVar = jxVarNewBuilder.buildPartial();
        }
        this.begin_ = kcVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnd(kc kcVar) {
        Objects.requireNonNull(kcVar);
        kc kcVar2 = this.end_;
        if (kcVar2 != null && kcVar2 != kc.getDefaultInstance()) {
            jx jxVarNewBuilder = kc.newBuilder(kcVar2);
            jxVarNewBuilder.mergeFrom((jx) kcVar);
            kcVar = jxVarNewBuilder.buildPartial();
        }
        this.end_ = kcVar;
        this.bitField0_ |= 16;
    }

    public static kd newBuilder() {
        return (kd) DEFAULT_INSTANCE.createBuilder();
    }

    public static kg parseDelimitedFrom(InputStream inputStream) {
        return (kg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kg parseFrom(com.google.v.v vVar) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBegin(kc kcVar) {
        Objects.requireNonNull(kcVar);
        this.begin_ = kcVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnd(kc kcVar) {
        Objects.requireNonNull(kcVar);
        this.end_ = kcVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInverted(boolean z) {
        this.bitField0_ |= 2;
        this.inverted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOccasion(kf kfVar) {
        this.occasion_ = kfVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ke keVar) {
        this.type_ = keVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0006ဉ\u0003\u0007ဉ\u0004", new Object[]{"bitField0_", "type_", ka.f11673c, "inverted_", "occasion_", ka.f11674d, "begin_", "end_"});
        }
        if (iOrdinal == 3) {
            return new kg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<kg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (kg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public kc getBegin() {
        kc kcVar = this.begin_;
        return kcVar == null ? kc.getDefaultInstance() : kcVar;
    }

    public kc getEnd() {
        kc kcVar = this.end_;
        return kcVar == null ? kc.getDefaultInstance() : kcVar;
    }

    public boolean getInverted() {
        return this.inverted_;
    }

    public kf getOccasion() {
        kf kfVarA = kf.a(this.occasion_);
        return kfVarA == null ? kf.OCCASION_SEASON : kfVarA;
    }

    public ke getType() {
        ke keVarA = ke.a(this.type_);
        return keVarA == null ? ke.TYPE_OCCASION : keVarA;
    }

    public boolean hasBegin() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasEnd() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasInverted() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOccasion() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static kd newBuilder(kg kgVar) {
        return (kd) DEFAULT_INSTANCE.createBuilder(kgVar);
    }

    public static kg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kg parseFrom(com.google.v.z zVar) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kg parseFrom(InputStream inputStream) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kg parseFrom(ByteBuffer byteBuffer) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kg parseFrom(byte[] bArr) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
