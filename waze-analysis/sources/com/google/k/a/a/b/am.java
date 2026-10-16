package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class am extends com.google.v.du<am, ak> implements com.google.v.fj {
    public static final int BASE_HEIGHT_METERS_AGL_FIELD_NUMBER = 4;
    public static final int DEFAULT_DISPLAY_LEVEL_FIELD_NUMBER = 7;
    private static final am DEFAULT_INSTANCE;
    public static final int FLOORS_FIELD_NUMBER = 2;
    public static final int FLOORS_METADATA_FIELD_NUMBER = 500;
    public static final int HEIGHT_METERS_FIELD_NUMBER = 3;
    public static final int HEIGHT_METERS_METADATA_FIELD_NUMBER = 501;
    public static final int LEVEL_FIELD_NUMBER = 6;
    private static volatile com.google.v.fo<am> PARSER = null;
    public static final int STRUCTURE_FIELD_NUMBER = 1;
    private float baseHeightMetersAgl_;
    private int bitField0_;
    private bw defaultDisplayLevel_;
    private ce floorsMetadata_;
    private int floors_;
    private ce heightMetersMetadata_;
    private float heightMeters_;
    private int structure_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<bw> level_ = emptyProtobufList();

    static {
        am amVar = new am();
        DEFAULT_INSTANCE = amVar;
        com.google.v.du.registerDefaultInstance(am.class, amVar);
    }

    private am() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLevel(Iterable<? extends bw> iterable) {
        ensureLevelIsMutable();
        com.google.v.c.addAll(iterable, this.level_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLevel(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureLevelIsMutable();
        this.level_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaseHeightMetersAgl() {
        this.bitField0_ &= -33;
        this.baseHeightMetersAgl_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultDisplayLevel() {
        this.defaultDisplayLevel_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFloors() {
        this.bitField0_ &= -3;
        this.floors_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFloorsMetadata() {
        this.floorsMetadata_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeightMeters() {
        this.bitField0_ &= -9;
        this.heightMeters_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeightMetersMetadata() {
        this.heightMetersMetadata_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.level_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructure() {
        this.bitField0_ &= -2;
        this.structure_ = 0;
    }

    private void ensureLevelIsMutable() {
        com.google.v.eo<bw> eoVar = this.level_;
        if (eoVar.c()) {
            return;
        }
        this.level_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static am getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDefaultDisplayLevel(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.defaultDisplayLevel_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.defaultDisplayLevel_ = bwVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFloorsMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        ce ceVar2 = this.floorsMetadata_;
        if (ceVar2 != null && ceVar2 != ce.getDefaultInstance()) {
            cd cdVarNewBuilder = ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.floorsMetadata_ = ceVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHeightMetersMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        ce ceVar2 = this.heightMetersMetadata_;
        if (ceVar2 != null && ceVar2 != ce.getDefaultInstance()) {
            cd cdVarNewBuilder = ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.heightMetersMetadata_ = ceVar;
        this.bitField0_ |= 16;
    }

    public static ak newBuilder() {
        return (ak) DEFAULT_INSTANCE.createBuilder();
    }

    public static am parseDelimitedFrom(InputStream inputStream) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(com.google.v.v vVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<am> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLevel(int i2) {
        ensureLevelIsMutable();
        this.level_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseHeightMetersAgl(float f2) {
        this.bitField0_ |= 32;
        this.baseHeightMetersAgl_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultDisplayLevel(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.defaultDisplayLevel_ = bwVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFloors(int i2) {
        this.bitField0_ |= 2;
        this.floors_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFloorsMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.floorsMetadata_ = ceVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeightMeters(float f2) {
        this.bitField0_ |= 8;
        this.heightMeters_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeightMetersMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.heightMetersMetadata_ = ceVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureLevelIsMutable();
        this.level_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructure(al alVar) {
        this.structure_ = alVar.getNumber();
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001ǵ\b\u0000\u0001\u0002\u0001᠌\u0000\u0002င\u0001\u0003ခ\u0003\u0004ခ\u0005\u0006Л\u0007ᐉ\u0006Ǵဉ\u0002ǵဉ\u0004", new Object[]{"bitField0_", "structure_", c.f11203g, "floors_", "heightMeters_", "baseHeightMetersAgl_", "level_", bw.class, "defaultDisplayLevel_", "floorsMetadata_", "heightMetersMetadata_"});
            case 3:
                return new am();
            case 4:
                return new ak(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<am> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (am.class) {
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

    public float getBaseHeightMetersAgl() {
        return this.baseHeightMetersAgl_;
    }

    public bw getDefaultDisplayLevel() {
        bw bwVar = this.defaultDisplayLevel_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public int getFloors() {
        return this.floors_;
    }

    public ce getFloorsMetadata() {
        ce ceVar = this.floorsMetadata_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    public float getHeightMeters() {
        return this.heightMeters_;
    }

    public ce getHeightMetersMetadata() {
        ce ceVar = this.heightMetersMetadata_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    public bw getLevel(int i2) {
        return this.level_.get(i2);
    }

    public int getLevelCount() {
        return this.level_.size();
    }

    public List<bw> getLevelList() {
        return this.level_;
    }

    public bx getLevelOrBuilder(int i2) {
        return this.level_.get(i2);
    }

    public List<? extends bx> getLevelOrBuilderList() {
        return this.level_;
    }

    public al getStructure() {
        al alVarA = al.a(this.structure_);
        return alVarA == null ? al.STRUCTURE_ANY : alVarA;
    }

    public boolean hasBaseHeightMetersAgl() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasDefaultDisplayLevel() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasFloors() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasFloorsMetadata() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasHeightMeters() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasHeightMetersMetadata() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasStructure() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ak newBuilder(am amVar) {
        return (ak) DEFAULT_INSTANCE.createBuilder(amVar);
    }

    public static am parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static am parseFrom(com.google.v.z zVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static am parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLevel(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureLevelIsMutable();
        this.level_.add(bwVar);
    }

    public static am parseFrom(InputStream inputStream) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(ByteBuffer byteBuffer) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static am parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static am parseFrom(byte[] bArr) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static am parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
