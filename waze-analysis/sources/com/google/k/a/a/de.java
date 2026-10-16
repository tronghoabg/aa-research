package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class de extends com.google.v.du<de, dd> implements df {
    private static final de DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 500;
    private static volatile com.google.v.fo<de> PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 1;
    private int bitField0_;
    private k hours_;
    private byte memoizedIsInitialized = 2;
    private com.google.k.a.a.b.ce metadata_;
    private com.google.k.a.a.b.kg range_;

    static {
        de deVar = new de();
        DEFAULT_INSTANCE = deVar;
        com.google.v.du.registerDefaultInstance(de.class, deVar);
    }

    private de() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHours() {
        this.hours_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRange() {
        this.range_ = null;
        this.bitField0_ &= -2;
    }

    public static de getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHours(k kVar) {
        Objects.requireNonNull(kVar);
        k kVar2 = this.hours_;
        if (kVar2 != null && kVar2 != k.getDefaultInstance()) {
            j jVarNewBuilder = k.newBuilder(kVar2);
            jVarNewBuilder.mergeFrom((j) kVar);
            kVar = jVarNewBuilder.buildPartial();
        }
        this.hours_ = kVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(com.google.k.a.a.b.ce ceVar) {
        Objects.requireNonNull(ceVar);
        com.google.k.a.a.b.ce ceVar2 = this.metadata_;
        if (ceVar2 != null && ceVar2 != com.google.k.a.a.b.ce.getDefaultInstance()) {
            com.google.k.a.a.b.cd cdVarNewBuilder = com.google.k.a.a.b.ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((com.google.k.a.a.b.cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.metadata_ = ceVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRange(com.google.k.a.a.b.kg kgVar) {
        Objects.requireNonNull(kgVar);
        com.google.k.a.a.b.kg kgVar2 = this.range_;
        if (kgVar2 != null && kgVar2 != com.google.k.a.a.b.kg.getDefaultInstance()) {
            com.google.k.a.a.b.kd kdVarNewBuilder = com.google.k.a.a.b.kg.newBuilder(kgVar2);
            kdVarNewBuilder.mergeFrom((com.google.k.a.a.b.kd) kgVar);
            kgVar = kdVarNewBuilder.buildPartial();
        }
        this.range_ = kgVar;
        this.bitField0_ |= 1;
    }

    public static dd newBuilder() {
        return (dd) DEFAULT_INSTANCE.createBuilder();
    }

    public static de parseDelimitedFrom(InputStream inputStream) {
        return (de) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static de parseFrom(com.google.v.v vVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<de> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHours(k kVar) {
        Objects.requireNonNull(kVar);
        this.hours_ = kVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(com.google.k.a.a.b.ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRange(com.google.k.a.a.b.kg kgVar) {
        Objects.requireNonNull(kgVar);
        this.range_ = kgVar;
        this.bitField0_ |= 1;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001Ǵ\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001Ǵဉ\u0002", new Object[]{"bitField0_", "range_", "hours_", "metadata_"});
            case 3:
                return new de();
            case 4:
                return new dd(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<de> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (de.class) {
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

    public k getHours() {
        k kVar = this.hours_;
        return kVar == null ? k.getDefaultInstance() : kVar;
    }

    public com.google.k.a.a.b.ce getMetadata() {
        com.google.k.a.a.b.ce ceVar = this.metadata_;
        return ceVar == null ? com.google.k.a.a.b.ce.getDefaultInstance() : ceVar;
    }

    public com.google.k.a.a.b.kg getRange() {
        com.google.k.a.a.b.kg kgVar = this.range_;
        return kgVar == null ? com.google.k.a.a.b.kg.getDefaultInstance() : kgVar;
    }

    public boolean hasHours() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRange() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dd newBuilder(de deVar) {
        return (dd) DEFAULT_INSTANCE.createBuilder(deVar);
    }

    public static de parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (de) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static de parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static de parseFrom(com.google.v.z zVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static de parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static de parseFrom(InputStream inputStream) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static de parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static de parseFrom(ByteBuffer byteBuffer) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static de parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static de parseFrom(byte[] bArr) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static de parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
