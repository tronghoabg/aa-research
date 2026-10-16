package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dy extends com.google.v.du<dy, dx> implements com.google.v.fj {
    public static final int BUILDING_FIELD_NUMBER = 2;
    private static final dy DEFAULT_INSTANCE;
    public static final int NUMBER_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<dy> PARSER;
    private int bitField0_;
    private float number_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<bw> building_ = emptyProtobufList();

    static {
        dy dyVar = new dy();
        DEFAULT_INSTANCE = dyVar;
        com.google.v.du.registerDefaultInstance(dy.class, dyVar);
    }

    private dy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBuilding(Iterable<? extends bw> iterable) {
        ensureBuildingIsMutable();
        com.google.v.c.addAll(iterable, this.building_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBuilding(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureBuildingIsMutable();
        this.building_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuilding() {
        this.building_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.bitField0_ &= -2;
        this.number_ = 0.0f;
    }

    private void ensureBuildingIsMutable() {
        com.google.v.eo<bw> eoVar = this.building_;
        if (eoVar.c()) {
            return;
        }
        this.building_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static dy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dx newBuilder() {
        return (dx) DEFAULT_INSTANCE.createBuilder();
    }

    public static dy parseDelimitedFrom(InputStream inputStream) {
        return (dy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dy parseFrom(com.google.v.v vVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBuilding(int i2) {
        ensureBuildingIsMutable();
        this.building_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuilding(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureBuildingIsMutable();
        this.building_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(float f2) {
        this.bitField0_ |= 1;
        this.number_ = f2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ခ\u0000\u0002Л", new Object[]{"bitField0_", "number_", "building_", bw.class});
            case 3:
                return new dy();
            case 4:
                return new dx(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<dy> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (dy.class) {
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

    public bw getBuilding(int i2) {
        return this.building_.get(i2);
    }

    public int getBuildingCount() {
        return this.building_.size();
    }

    public List<bw> getBuildingList() {
        return this.building_;
    }

    public bx getBuildingOrBuilder(int i2) {
        return this.building_.get(i2);
    }

    public List<? extends bx> getBuildingOrBuilderList() {
        return this.building_;
    }

    public float getNumber() {
        return this.number_;
    }

    public boolean hasNumber() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dx newBuilder(dy dyVar) {
        return (dx) DEFAULT_INSTANCE.createBuilder(dyVar);
    }

    public static dy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dy parseFrom(com.google.v.z zVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBuilding(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureBuildingIsMutable();
        this.building_.add(bwVar);
    }

    public static dy parseFrom(InputStream inputStream) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dy parseFrom(ByteBuffer byteBuffer) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dy parseFrom(byte[] bArr) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
