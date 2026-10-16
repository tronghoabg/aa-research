package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class og extends com.google.v.du<og, od> implements com.google.v.fj {
    public static final int CATEGORY_NAME_FIELD_NUMBER = 6;
    private static final og DEFAULT_INSTANCE;
    public static final int IMPACTING_CLOSURES_FIELD_NUMBER = 4;
    public static final int IMPACT_FIELD_NUMBER = 1;
    public static final int MTE_NAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<og> PARSER = null;
    public static final int STREET_NAME_FIELD_NUMBER = 3;
    public static final int VISUAL_CLOSURE_INFO_FIELD_NUMBER = 5;
    private int bitField0_;
    private Object closureInfo_;
    private int impact_;
    private qq visualClosureInfo_;
    private int closureInfoCase_ = 0;
    private com.google.v.eo<ob> impactingClosures_ = emptyProtobufList();

    static {
        og ogVar = new og();
        DEFAULT_INSTANCE = ogVar;
        com.google.v.du.registerDefaultInstance(og.class, ogVar);
    }

    private og() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllImpactingClosures(Iterable<? extends ob> iterable) {
        ensureImpactingClosuresIsMutable();
        com.google.v.c.addAll(iterable, this.impactingClosures_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImpactingClosures(int i2, ob obVar) {
        Objects.requireNonNull(obVar);
        ensureImpactingClosuresIsMutable();
        this.impactingClosures_.add(i2, obVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoryName() {
        if (this.closureInfoCase_ == 6) {
            this.closureInfoCase_ = 0;
            this.closureInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosureInfo() {
        this.closureInfoCase_ = 0;
        this.closureInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpact() {
        this.bitField0_ &= -2;
        this.impact_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpactingClosures() {
        this.impactingClosures_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMteName() {
        if (this.closureInfoCase_ == 2) {
            this.closureInfoCase_ = 0;
            this.closureInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreetName() {
        if (this.closureInfoCase_ == 3) {
            this.closureInfoCase_ = 0;
            this.closureInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisualClosureInfo() {
        this.visualClosureInfo_ = null;
        this.bitField0_ &= -3;
    }

    private void ensureImpactingClosuresIsMutable() {
        com.google.v.eo<ob> eoVar = this.impactingClosures_;
        if (eoVar.c()) {
            return;
        }
        this.impactingClosures_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static og getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCategoryName(sz szVar) {
        Objects.requireNonNull(szVar);
        if (this.closureInfoCase_ == 6 && this.closureInfo_ != sz.getDefaultInstance()) {
            sy syVarNewBuilder = sz.newBuilder((sz) this.closureInfo_);
            syVarNewBuilder.mergeFrom((sy) szVar);
            szVar = syVarNewBuilder.buildPartial();
        }
        this.closureInfo_ = szVar;
        this.closureInfoCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVisualClosureInfo(qq qqVar) {
        Objects.requireNonNull(qqVar);
        qq qqVar2 = this.visualClosureInfo_;
        if (qqVar2 != null && qqVar2 != qq.getDefaultInstance()) {
            qj qjVarNewBuilder = qq.newBuilder(qqVar2);
            qjVarNewBuilder.mergeFrom((qj) qqVar);
            qqVar = qjVarNewBuilder.buildPartial();
        }
        this.visualClosureInfo_ = qqVar;
        this.bitField0_ |= 2;
    }

    public static od newBuilder() {
        return (od) DEFAULT_INSTANCE.createBuilder();
    }

    public static og parseDelimitedFrom(InputStream inputStream) {
        return (og) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static og parseFrom(com.google.v.v vVar) {
        return (og) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<og> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeImpactingClosures(int i2) {
        ensureImpactingClosuresIsMutable();
        this.impactingClosures_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryName(sz szVar) {
        Objects.requireNonNull(szVar);
        this.closureInfo_ = szVar;
        this.closureInfoCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpact(of ofVar) {
        this.impact_ = ofVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpactingClosures(int i2, ob obVar) {
        Objects.requireNonNull(obVar);
        ensureImpactingClosuresIsMutable();
        this.impactingClosures_.set(i2, obVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMteName(String str) {
        Objects.requireNonNull(str);
        this.closureInfoCase_ = 2;
        this.closureInfo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMteNameBytes(com.google.v.v vVar) {
        this.closureInfo_ = vVar.u();
        this.closureInfoCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetName(String str) {
        Objects.requireNonNull(str);
        this.closureInfoCase_ = 3;
        this.closureInfo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetNameBytes(com.google.v.v vVar) {
        this.closureInfo_ = vVar.u();
        this.closureInfoCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisualClosureInfo(qq qqVar) {
        Objects.requireNonNull(qqVar);
        this.visualClosureInfo_ = qqVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002;\u0000\u0003;\u0000\u0004\u001b\u0005ဉ\u0001\u0006<\u0000", new Object[]{"closureInfo_", "closureInfoCase_", "bitField0_", "impact_", hf.u, "impactingClosures_", ob.class, "visualClosureInfo_", sz.class});
        }
        if (iOrdinal == 3) {
            return new og();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new od(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<og> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (og.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public sz getCategoryName() {
        return this.closureInfoCase_ == 6 ? (sz) this.closureInfo_ : sz.getDefaultInstance();
    }

    public oe getClosureInfoCase() {
        int i2 = this.closureInfoCase_;
        if (i2 == 0) {
            return oe.f48928d;
        }
        if (i2 == 6) {
            return oe.f48927c;
        }
        if (i2 == 2) {
            return oe.f48925a;
        }
        if (i2 != 3) {
            return null;
        }
        return oe.f48926b;
    }

    public of getImpact() {
        of ofVarA = of.a(this.impact_);
        return ofVarA == null ? of.IMPACT_TYPE_UNSPECIFIED : ofVarA;
    }

    @Deprecated
    public ob getImpactingClosures(int i2) {
        return this.impactingClosures_.get(i2);
    }

    @Deprecated
    public int getImpactingClosuresCount() {
        return this.impactingClosures_.size();
    }

    @Deprecated
    public List<ob> getImpactingClosuresList() {
        return this.impactingClosures_;
    }

    @Deprecated
    public oc getImpactingClosuresOrBuilder(int i2) {
        return this.impactingClosures_.get(i2);
    }

    @Deprecated
    public List<? extends oc> getImpactingClosuresOrBuilderList() {
        return this.impactingClosures_;
    }

    public String getMteName() {
        return this.closureInfoCase_ == 2 ? (String) this.closureInfo_ : "";
    }

    public com.google.v.v getMteNameBytes() {
        return com.google.v.v.s(this.closureInfoCase_ == 2 ? (String) this.closureInfo_ : "");
    }

    public String getStreetName() {
        return this.closureInfoCase_ == 3 ? (String) this.closureInfo_ : "";
    }

    public com.google.v.v getStreetNameBytes() {
        return com.google.v.v.s(this.closureInfoCase_ == 3 ? (String) this.closureInfo_ : "");
    }

    @Deprecated
    public qq getVisualClosureInfo() {
        qq qqVar = this.visualClosureInfo_;
        return qqVar == null ? qq.getDefaultInstance() : qqVar;
    }

    public boolean hasCategoryName() {
        return this.closureInfoCase_ == 6;
    }

    public boolean hasImpact() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMteName() {
        return this.closureInfoCase_ == 2;
    }

    public boolean hasStreetName() {
        return this.closureInfoCase_ == 3;
    }

    @Deprecated
    public boolean hasVisualClosureInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public static od newBuilder(og ogVar) {
        return (od) DEFAULT_INSTANCE.createBuilder(ogVar);
    }

    public static og parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (og) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static og parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (og) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static og parseFrom(com.google.v.z zVar) {
        return (og) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static og parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (og) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImpactingClosures(ob obVar) {
        Objects.requireNonNull(obVar);
        ensureImpactingClosuresIsMutable();
        this.impactingClosures_.add(obVar);
    }

    public static og parseFrom(InputStream inputStream) {
        return (og) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static og parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (og) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static og parseFrom(ByteBuffer byteBuffer) {
        return (og) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static og parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (og) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static og parseFrom(byte[] bArr) {
        return (og) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static og parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (og) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
