package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ao extends com.google.v.du<ao, v> implements ap {
    private static final ao DEFAULT_INSTANCE;
    public static final int LOD_FIELD_NUMBER = 2;
    public static final int MULTIPOINT_FIELD_NUMBER = 3;
    public static final int MULTISURFACE_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<ao> PARSER = null;
    public static final int SEMANTICS_FIELD_NUMBER = 6;
    public static final int SOLID_FIELD_NUMBER = 5;
    private int bitField0_;
    private Object boundaries_;
    private int boundariesCase_ = 0;
    private String lod_ = "";
    private com.google.v.eo<ah> semantics_ = emptyProtobufList();

    static {
        ao aoVar = new ao();
        DEFAULT_INSTANCE = aoVar;
        com.google.v.du.registerDefaultInstance(ao.class, aoVar);
    }

    private ao() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSemantics(Iterable<? extends ah> iterable) {
        ensureSemanticsIsMutable();
        com.google.v.c.addAll(iterable, this.semantics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSemantics(int i2, ah ahVar) {
        Objects.requireNonNull(ahVar);
        ensureSemanticsIsMutable();
        this.semantics_.add(i2, ahVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoundaries() {
        this.boundariesCase_ = 0;
        this.boundaries_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLod() {
        this.bitField0_ &= -2;
        this.lod_ = getDefaultInstance().getLod();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMultipoint() {
        if (this.boundariesCase_ == 3) {
            this.boundariesCase_ = 0;
            this.boundaries_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMultisurface() {
        if (this.boundariesCase_ == 4) {
            this.boundariesCase_ = 0;
            this.boundaries_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSemantics() {
        this.semantics_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSolid() {
        if (this.boundariesCase_ == 5) {
            this.boundariesCase_ = 0;
            this.boundaries_ = null;
        }
    }

    private void ensureSemanticsIsMutable() {
        com.google.v.eo<ah> eoVar = this.semantics_;
        if (eoVar.c()) {
            return;
        }
        this.semantics_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ao getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMultipoint(aa aaVar) {
        Objects.requireNonNull(aaVar);
        if (this.boundariesCase_ == 3 && this.boundaries_ != aa.getDefaultInstance()) {
            z zVarNewBuilder = aa.newBuilder((aa) this.boundaries_);
            zVarNewBuilder.mergeFrom((z) aaVar);
            aaVar = zVarNewBuilder.buildPartial();
        }
        this.boundaries_ = aaVar;
        this.boundariesCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMultisurface(ad adVar) {
        Objects.requireNonNull(adVar);
        if (this.boundariesCase_ == 4 && this.boundaries_ != ad.getDefaultInstance()) {
            ac acVarNewBuilder = ad.newBuilder((ad) this.boundaries_);
            acVarNewBuilder.mergeFrom((ac) adVar);
            adVar = acVarNewBuilder.buildPartial();
        }
        this.boundaries_ = adVar;
        this.boundariesCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSolid(ak akVar) {
        Objects.requireNonNull(akVar);
        if (this.boundariesCase_ == 5 && this.boundaries_ != ak.getDefaultInstance()) {
            aj ajVarNewBuilder = ak.newBuilder((ak) this.boundaries_);
            ajVarNewBuilder.mergeFrom((aj) akVar);
            akVar = ajVarNewBuilder.buildPartial();
        }
        this.boundaries_ = akVar;
        this.boundariesCase_ = 5;
    }

    public static v newBuilder() {
        return (v) DEFAULT_INSTANCE.createBuilder();
    }

    public static ao parseDelimitedFrom(InputStream inputStream) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(com.google.v.v vVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ao> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSemantics(int i2) {
        ensureSemanticsIsMutable();
        this.semantics_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLod(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.lod_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLodBytes(com.google.v.v vVar) {
        this.lod_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMultipoint(aa aaVar) {
        Objects.requireNonNull(aaVar);
        this.boundaries_ = aaVar;
        this.boundariesCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMultisurface(ad adVar) {
        Objects.requireNonNull(adVar);
        this.boundaries_ = adVar;
        this.boundariesCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSemantics(int i2, ah ahVar) {
        Objects.requireNonNull(ahVar);
        ensureSemanticsIsMutable();
        this.semantics_.set(i2, ahVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSolid(ak akVar) {
        Objects.requireNonNull(akVar);
        this.boundaries_ = akVar;
        this.boundariesCase_ = 5;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u0002\u0006\u0005\u0000\u0001\u0000\u0002ဈ\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006\u001b", new Object[]{"boundaries_", "boundariesCase_", "bitField0_", "lod_", aa.class, ad.class, ak.class, "semantics_", ah.class});
        }
        if (iOrdinal == 3) {
            return new ao();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new v(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ao> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ao.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public u getBoundariesCase() {
        int i2 = this.boundariesCase_;
        if (i2 == 0) {
            return u.f12204d;
        }
        if (i2 == 3) {
            return u.f12201a;
        }
        if (i2 == 4) {
            return u.f12202b;
        }
        if (i2 != 5) {
            return null;
        }
        return u.f12203c;
    }

    public String getLod() {
        return this.lod_;
    }

    public com.google.v.v getLodBytes() {
        return com.google.v.v.s(this.lod_);
    }

    public aa getMultipoint() {
        return this.boundariesCase_ == 3 ? (aa) this.boundaries_ : aa.getDefaultInstance();
    }

    public ad getMultisurface() {
        return this.boundariesCase_ == 4 ? (ad) this.boundaries_ : ad.getDefaultInstance();
    }

    public ah getSemantics(int i2) {
        return this.semantics_.get(i2);
    }

    public int getSemanticsCount() {
        return this.semantics_.size();
    }

    public List<ah> getSemanticsList() {
        return this.semantics_;
    }

    public ai getSemanticsOrBuilder(int i2) {
        return this.semantics_.get(i2);
    }

    public List<? extends ai> getSemanticsOrBuilderList() {
        return this.semantics_;
    }

    public ak getSolid() {
        return this.boundariesCase_ == 5 ? (ak) this.boundaries_ : ak.getDefaultInstance();
    }

    public boolean hasLod() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMultipoint() {
        return this.boundariesCase_ == 3;
    }

    public boolean hasMultisurface() {
        return this.boundariesCase_ == 4;
    }

    public boolean hasSolid() {
        return this.boundariesCase_ == 5;
    }

    public static v newBuilder(ao aoVar) {
        return (v) DEFAULT_INSTANCE.createBuilder(aoVar);
    }

    public static ao parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ao parseFrom(com.google.v.z zVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ao parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSemantics(ah ahVar) {
        Objects.requireNonNull(ahVar);
        ensureSemanticsIsMutable();
        this.semantics_.add(ahVar);
    }

    public static ao parseFrom(InputStream inputStream) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(ByteBuffer byteBuffer) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ao parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ao parseFrom(byte[] bArr) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ao parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
