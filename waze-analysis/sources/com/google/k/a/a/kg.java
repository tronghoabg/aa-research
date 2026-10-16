package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kg extends com.google.v.du<kg, kd> implements com.google.v.fj {
    public static final int CAUSE_CATEGORY_FIELD_NUMBER = 10;
    private static final kg DEFAULT_INSTANCE;
    public static final int EVENT_MID_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<kg> PARSER = null;
    public static final int ROAD_DISRUPTION_ID_FIELD_NUMBER = 1;
    private Object causeId_;
    private int causeIdCase_ = 0;
    private byte memoizedIsInitialized = 2;

    static {
        kg kgVar = new kg();
        DEFAULT_INSTANCE = kgVar;
        com.google.v.du.registerDefaultInstance(kg.class, kgVar);
    }

    private kg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCauseCategory() {
        if (this.causeIdCase_ == 10) {
            this.causeIdCase_ = 0;
            this.causeId_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCauseId() {
        this.causeIdCase_ = 0;
        this.causeId_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventMid() {
        if (this.causeIdCase_ == 4) {
            this.causeIdCase_ = 0;
            this.causeId_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadDisruptionId() {
        if (this.causeIdCase_ == 1) {
            this.causeIdCase_ = 0;
            this.causeId_ = null;
        }
    }

    public static kg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoadDisruptionId(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        if (this.causeIdCase_ == 1 && this.causeId_ != com.google.k.a.a.b.bw.getDefaultInstance()) {
            com.google.k.a.a.b.bv bvVarNewBuilder = com.google.k.a.a.b.bw.newBuilder((com.google.k.a.a.b.bw) this.causeId_);
            bvVarNewBuilder.mergeFrom((com.google.k.a.a.b.bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.causeId_ = bwVar;
        this.causeIdCase_ = 1;
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
    public void setCauseCategory(ke keVar) {
        this.causeId_ = Integer.valueOf(keVar.getNumber());
        this.causeIdCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventMid(String str) {
        Objects.requireNonNull(str);
        this.causeIdCase_ = 4;
        this.causeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventMidBytes(com.google.v.v vVar) {
        this.causeId_ = vVar.u();
        this.causeIdCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadDisruptionId(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.causeId_ = bwVar;
        this.causeIdCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0000\u0001\n\u0003\u0000\u0000\u0001\u0001м\u0000\u0004;\u0000\n\u083f\u0000", new Object[]{"causeId_", "causeIdCase_", com.google.k.a.a.b.bw.class, ha.p});
            case 3:
                return new kg();
            case 4:
                return new kd(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
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
            default:
                throw null;
        }
    }

    public ke getCauseCategory() {
        ke keVarA;
        return (this.causeIdCase_ != 10 || (keVarA = ke.a(((Integer) this.causeId_).intValue())) == null) ? ke.CAUSE_CATEGORY_UNSPECIFIED : keVarA;
    }

    public kf getCauseIdCase() {
        int i2 = this.causeIdCase_;
        if (i2 == 0) {
            return kf.f12026d;
        }
        if (i2 == 1) {
            return kf.f12023a;
        }
        if (i2 == 4) {
            return kf.f12024b;
        }
        if (i2 != 10) {
            return null;
        }
        return kf.f12025c;
    }

    public String getEventMid() {
        return this.causeIdCase_ == 4 ? (String) this.causeId_ : "";
    }

    public com.google.v.v getEventMidBytes() {
        return com.google.v.v.s(this.causeIdCase_ == 4 ? (String) this.causeId_ : "");
    }

    public com.google.k.a.a.b.bw getRoadDisruptionId() {
        return this.causeIdCase_ == 1 ? (com.google.k.a.a.b.bw) this.causeId_ : com.google.k.a.a.b.bw.getDefaultInstance();
    }

    public boolean hasCauseCategory() {
        return this.causeIdCase_ == 10;
    }

    public boolean hasEventMid() {
        return this.causeIdCase_ == 4;
    }

    public boolean hasRoadDisruptionId() {
        return this.causeIdCase_ == 1;
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
