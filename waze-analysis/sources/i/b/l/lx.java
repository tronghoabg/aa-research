package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class lx extends com.google.v.du<lx, lt> implements com.google.v.fj {
    public static final int AFFECTED_ROUTE_NAME_FIELD_NUMBER = 7;
    public static final int CATEGORY_FIELD_NUMBER = 6;
    public static final int CITY_NAME_FIELD_NUMBER = 10;
    private static final lx DEFAULT_INSTANCE;
    public static final int IMPACT_INTERACTION_FIELD_NUMBER = 4;
    public static final int IMPACT_LEVEL_FIELD_NUMBER = 3;
    public static final int IMPACT_TYPE_FIELD_NUMBER = 2;
    public static final int MTE_END_TIME_EPOCH_MSEC_FIELD_NUMBER = 9;
    public static final int MTE_NAME_FIELD_NUMBER = 5;
    public static final int MTE_START_TIME_EPOCH_MSEC_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<lx> PARSER;
    private int bitField0_;
    private int impactInteraction_;
    private int impactLevel_;
    private int impactType_;
    private long mteEndTimeEpochMsec_;
    private long mteStartTimeEpochMsec_;
    private String name_ = "major_traffic_event_impact";
    private String mteName_ = "";
    private String category_ = "";
    private String affectedRouteName_ = "";
    private String cityName_ = "";

    static {
        lx lxVar = new lx();
        DEFAULT_INSTANCE = lxVar;
        com.google.v.du.registerDefaultInstance(lx.class, lxVar);
    }

    private lx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAffectedRouteName() {
        this.bitField0_ &= -65;
        this.affectedRouteName_ = getDefaultInstance().getAffectedRouteName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategory() {
        this.bitField0_ &= -33;
        this.category_ = getDefaultInstance().getCategory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCityName() {
        this.bitField0_ &= -513;
        this.cityName_ = getDefaultInstance().getCityName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpactInteraction() {
        this.bitField0_ &= -9;
        this.impactInteraction_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpactLevel() {
        this.bitField0_ &= -5;
        this.impactLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpactType() {
        this.bitField0_ &= -3;
        this.impactType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMteEndTimeEpochMsec() {
        this.bitField0_ &= -257;
        this.mteEndTimeEpochMsec_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMteName() {
        this.bitField0_ &= -17;
        this.mteName_ = getDefaultInstance().getMteName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMteStartTimeEpochMsec() {
        this.bitField0_ &= -129;
        this.mteStartTimeEpochMsec_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    public static lx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static lt newBuilder() {
        return (lt) DEFAULT_INSTANCE.createBuilder();
    }

    public static lx parseDelimitedFrom(InputStream inputStream) {
        return (lx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lx parseFrom(com.google.v.v vVar) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<lx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAffectedRouteName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.affectedRouteName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAffectedRouteNameBytes(com.google.v.v vVar) {
        this.affectedRouteName_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategory(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.category_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryBytes(com.google.v.v vVar) {
        this.category_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.cityName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityNameBytes(com.google.v.v vVar) {
        this.cityName_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpactInteraction(lu luVar) {
        this.impactInteraction_ = luVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpactLevel(lv lvVar) {
        this.impactLevel_ = lvVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpactType(lw lwVar) {
        this.impactType_ = lwVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMteEndTimeEpochMsec(long j2) {
        this.bitField0_ |= 256;
        this.mteEndTimeEpochMsec_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMteName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.mteName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMteNameBytes(com.google.v.v vVar) {
        this.mteName_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMteStartTimeEpochMsec(long j2) {
        this.bitField0_ |= 128;
        this.mteStartTimeEpochMsec_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\tဂ\b\nဈ\t", new Object[]{"bitField0_", "name_", "impactType_", hf.o, "impactLevel_", hf.n, "impactInteraction_", hf.m, "mteName_", "category_", "affectedRouteName_", "mteStartTimeEpochMsec_", "mteEndTimeEpochMsec_", "cityName_"});
        }
        if (iOrdinal == 3) {
            return new lx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new lt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<lx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (lx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAffectedRouteName() {
        return this.affectedRouteName_;
    }

    public com.google.v.v getAffectedRouteNameBytes() {
        return com.google.v.v.s(this.affectedRouteName_);
    }

    public String getCategory() {
        return this.category_;
    }

    public com.google.v.v getCategoryBytes() {
        return com.google.v.v.s(this.category_);
    }

    public String getCityName() {
        return this.cityName_;
    }

    public com.google.v.v getCityNameBytes() {
        return com.google.v.v.s(this.cityName_);
    }

    public lu getImpactInteraction() {
        lu luVarA = lu.a(this.impactInteraction_);
        return luVarA == null ? lu.IMPACT_INTERACTION_UNSPECIFIED : luVarA;
    }

    public lv getImpactLevel() {
        lv lvVarA = lv.a(this.impactLevel_);
        return lvVarA == null ? lv.IMPACT_LEVEL_UNSPECIFIED : lvVarA;
    }

    public lw getImpactType() {
        lw lwVarA = lw.a(this.impactType_);
        return lwVarA == null ? lw.IMPACT_TYPE_UNSPECIFIED : lwVarA;
    }

    public long getMteEndTimeEpochMsec() {
        return this.mteEndTimeEpochMsec_;
    }

    public String getMteName() {
        return this.mteName_;
    }

    public com.google.v.v getMteNameBytes() {
        return com.google.v.v.s(this.mteName_);
    }

    public long getMteStartTimeEpochMsec() {
        return this.mteStartTimeEpochMsec_;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public boolean hasAffectedRouteName() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCategory() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasCityName() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasImpactInteraction() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasImpactLevel() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasImpactType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMteEndTimeEpochMsec() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasMteName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMteStartTimeEpochMsec() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static lt newBuilder(lx lxVar) {
        return (lt) DEFAULT_INSTANCE.createBuilder(lxVar);
    }

    public static lx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static lx parseFrom(com.google.v.z zVar) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static lx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static lx parseFrom(InputStream inputStream) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lx parseFrom(ByteBuffer byteBuffer) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static lx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static lx parseFrom(byte[] bArr) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static lx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
