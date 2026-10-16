package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fr extends com.google.v.du<fr, fo> implements fs {
    public static final int DASH_LENGTH_METERS_FIELD_NUMBER = 2;
    private static final fr DEFAULT_INSTANCE;
    public static final int GAP_COLOR_FIELD_NUMBER = 5;
    public static final int GAP_LENGTH_METERS_FIELD_NUMBER = 3;
    public static final int MATERIAL_FIELD_NUMBER = 6;
    public static final int PAINT_COLOR_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<fr> PARSER = null;
    public static final int PATTERN_FIELD_NUMBER = 1;
    public static final int PHYSICAL_LINE_TOKEN_FIELD_NUMBER = 7;
    private static final com.google.v.el<fq> material_converter_ = new fn(0);
    private int bitField0_;
    private float dashLengthMeters_;
    private fl gapColor_;
    private float gapLengthMeters_;
    private fl paintColor_;
    private int pattern_ = 1;
    private com.google.v.ek material_ = emptyIntList();
    private String physicalLineToken_ = "";

    static {
        fr frVar = new fr();
        DEFAULT_INSTANCE = frVar;
        com.google.v.du.registerDefaultInstance(fr.class, frVar);
    }

    private fr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMaterial(Iterable<? extends fq> iterable) {
        ensureMaterialIsMutable();
        Iterator<? extends fq> it = iterable.iterator();
        while (it.hasNext()) {
            this.material_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMaterial(fq fqVar) {
        Objects.requireNonNull(fqVar);
        ensureMaterialIsMutable();
        this.material_.i(fqVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDashLengthMeters() {
        this.bitField0_ &= -3;
        this.dashLengthMeters_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGapColor() {
        this.gapColor_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGapLengthMeters() {
        this.bitField0_ &= -5;
        this.gapLengthMeters_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaterial() {
        this.material_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaintColor() {
        this.paintColor_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPattern() {
        this.bitField0_ &= -2;
        this.pattern_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhysicalLineToken() {
        this.bitField0_ &= -33;
        this.physicalLineToken_ = getDefaultInstance().getPhysicalLineToken();
    }

    private void ensureMaterialIsMutable() {
        com.google.v.ek ekVar = this.material_;
        if (ekVar.c()) {
            return;
        }
        this.material_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static fr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGapColor(fl flVar) {
        Objects.requireNonNull(flVar);
        fl flVar2 = this.gapColor_;
        if (flVar2 != null && flVar2 != fl.getDefaultInstance()) {
            fj fjVarNewBuilder = fl.newBuilder(flVar2);
            fjVarNewBuilder.mergeFrom((fj) flVar);
            flVar = fjVarNewBuilder.buildPartial();
        }
        this.gapColor_ = flVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePaintColor(fl flVar) {
        Objects.requireNonNull(flVar);
        fl flVar2 = this.paintColor_;
        if (flVar2 != null && flVar2 != fl.getDefaultInstance()) {
            fj fjVarNewBuilder = fl.newBuilder(flVar2);
            fjVarNewBuilder.mergeFrom((fj) flVar);
            flVar = fjVarNewBuilder.buildPartial();
        }
        this.paintColor_ = flVar;
        this.bitField0_ |= 8;
    }

    public static fo newBuilder() {
        return (fo) DEFAULT_INSTANCE.createBuilder();
    }

    public static fr parseDelimitedFrom(InputStream inputStream) {
        return (fr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fr parseFrom(com.google.v.v vVar) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDashLengthMeters(float f2) {
        this.bitField0_ |= 2;
        this.dashLengthMeters_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGapColor(fl flVar) {
        Objects.requireNonNull(flVar);
        this.gapColor_ = flVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGapLengthMeters(float f2) {
        this.bitField0_ |= 4;
        this.gapLengthMeters_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaterial(int i2, fq fqVar) {
        Objects.requireNonNull(fqVar);
        ensureMaterialIsMutable();
        this.material_.e(i2, fqVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaintColor(fl flVar) {
        Objects.requireNonNull(flVar);
        this.paintColor_ = flVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPattern(fp fpVar) {
        this.pattern_ = fpVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhysicalLineToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.physicalLineToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhysicalLineTokenBytes(com.google.v.v vVar) {
        this.physicalLineToken_ = vVar.u();
        this.bitField0_ |= 32;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ࠞ\u0007ဈ\u0005", new Object[]{"bitField0_", "pattern_", h.o, "dashLengthMeters_", "gapLengthMeters_", "paintColor_", "gapColor_", "material_", h.p, "physicalLineToken_"});
        }
        if (iOrdinal == 3) {
            return new fr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public float getDashLengthMeters() {
        return this.dashLengthMeters_;
    }

    public fl getGapColor() {
        fl flVar = this.gapColor_;
        return flVar == null ? fl.getDefaultInstance() : flVar;
    }

    public float getGapLengthMeters() {
        return this.gapLengthMeters_;
    }

    public fq getMaterial(int i2) {
        fq fqVarA = fq.a(this.material_.d(i2));
        return fqVarA == null ? fq.UNKNOWN_STRIPE_MATERIAL : fqVarA;
    }

    public int getMaterialCount() {
        return this.material_.size();
    }

    public List<fq> getMaterialList() {
        return new com.google.v.em(this.material_, material_converter_);
    }

    public fl getPaintColor() {
        fl flVar = this.paintColor_;
        return flVar == null ? fl.getDefaultInstance() : flVar;
    }

    public fp getPattern() {
        fp fpVarA = fp.a(this.pattern_);
        return fpVarA == null ? fp.UNKNOWN_DASH_PATTERN : fpVarA;
    }

    public String getPhysicalLineToken() {
        return this.physicalLineToken_;
    }

    public com.google.v.v getPhysicalLineTokenBytes() {
        return com.google.v.v.s(this.physicalLineToken_);
    }

    public boolean hasDashLengthMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasGapColor() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasGapLengthMeters() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPaintColor() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPattern() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPhysicalLineToken() {
        return (this.bitField0_ & 32) != 0;
    }

    public static fo newBuilder(fr frVar) {
        return (fo) DEFAULT_INSTANCE.createBuilder(frVar);
    }

    public static fr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fr parseFrom(com.google.v.z zVar) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fr parseFrom(InputStream inputStream) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fr parseFrom(ByteBuffer byteBuffer) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fr parseFrom(byte[] bArr) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
