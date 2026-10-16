package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l extends com.google.v.du<l, j> implements fj {
    public static final int BUS_LANE_CONFIGURATION_FIELD_NUMBER = 10;
    public static final int CARPOOL_LANE_CONFIGURATION_FIELD_NUMBER = 9;
    private static final l DEFAULT_INSTANCE;
    public static final int DISTANCE_CONFIGURATION_FIELD_NUMBER = 8;
    public static final int DUMMY_CONFIGURATION_FIELD_NUMBER = 3;
    public static final int HOV_LANE_CONFIGURATION_FIELD_NUMBER = 11;
    public static final int MOBILE_PHONE_CONFIGURATION_FIELD_NUMBER = 5;
    public static final int NOISE_CONFIGURATION_FIELD_NUMBER = 7;
    private static volatile fo<l> PARSER = null;
    public static final int RED_LIGHT_CONFIGURATION_FIELD_NUMBER = 2;
    public static final int SEATBELT_CONFIGURATION_FIELD_NUMBER = 4;
    public static final int SPEED_CONFIGURATION_FIELD_NUMBER = 1;
    public static final int SPEED_RED_LIGHT_CONFIGURATION_FIELD_NUMBER = 12;
    public static final int STOP_CONFIGURATION_FIELD_NUMBER = 6;
    private int cameraTypeConfigurationCase_ = 0;
    private Object cameraTypeConfiguration_;

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        com.google.v.du.registerDefaultInstance(l.class, lVar);
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBusLaneConfiguration() {
        if (this.cameraTypeConfigurationCase_ == 10) {
            this.cameraTypeConfigurationCase_ = 0;
            this.cameraTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCameraTypeConfiguration() {
        this.cameraTypeConfigurationCase_ = 0;
        this.cameraTypeConfiguration_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarpoolLaneConfiguration() {
        if (this.cameraTypeConfigurationCase_ == 9) {
            this.cameraTypeConfigurationCase_ = 0;
            this.cameraTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceConfiguration() {
        if (this.cameraTypeConfigurationCase_ == 8) {
            this.cameraTypeConfigurationCase_ = 0;
            this.cameraTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDummyConfiguration() {
        if (this.cameraTypeConfigurationCase_ == 3) {
            this.cameraTypeConfigurationCase_ = 0;
            this.cameraTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHovLaneConfiguration() {
        if (this.cameraTypeConfigurationCase_ == 11) {
            this.cameraTypeConfigurationCase_ = 0;
            this.cameraTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobilePhoneConfiguration() {
        if (this.cameraTypeConfigurationCase_ == 5) {
            this.cameraTypeConfigurationCase_ = 0;
            this.cameraTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoiseConfiguration() {
        if (this.cameraTypeConfigurationCase_ == 7) {
            this.cameraTypeConfigurationCase_ = 0;
            this.cameraTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRedLightConfiguration() {
        if (this.cameraTypeConfigurationCase_ == 2) {
            this.cameraTypeConfigurationCase_ = 0;
            this.cameraTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeatbeltConfiguration() {
        if (this.cameraTypeConfigurationCase_ == 4) {
            this.cameraTypeConfigurationCase_ = 0;
            this.cameraTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedConfiguration() {
        if (this.cameraTypeConfigurationCase_ == 1) {
            this.cameraTypeConfigurationCase_ = 0;
            this.cameraTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedRedLightConfiguration() {
        if (this.cameraTypeConfigurationCase_ == 12) {
            this.cameraTypeConfigurationCase_ = 0;
            this.cameraTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStopConfiguration() {
        if (this.cameraTypeConfigurationCase_ == 6) {
            this.cameraTypeConfigurationCase_ = 0;
            this.cameraTypeConfiguration_ = null;
        }
    }

    public static l getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBusLaneConfiguration(i iVar) {
        Objects.requireNonNull(iVar);
        if (this.cameraTypeConfigurationCase_ == 10 && this.cameraTypeConfiguration_ != i.getDefaultInstance()) {
            h hVarNewBuilder = i.newBuilder((i) this.cameraTypeConfiguration_);
            hVarNewBuilder.mergeFrom((h) iVar);
            iVar = hVarNewBuilder.buildPartial();
        }
        this.cameraTypeConfiguration_ = iVar;
        this.cameraTypeConfigurationCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCarpoolLaneConfiguration(p pVar) {
        Objects.requireNonNull(pVar);
        if (this.cameraTypeConfigurationCase_ == 9 && this.cameraTypeConfiguration_ != p.getDefaultInstance()) {
            o oVarNewBuilder = p.newBuilder((p) this.cameraTypeConfiguration_);
            oVarNewBuilder.mergeFrom((o) pVar);
            pVar = oVarNewBuilder.buildPartial();
        }
        this.cameraTypeConfiguration_ = pVar;
        this.cameraTypeConfigurationCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDistanceConfiguration(aj ajVar) {
        Objects.requireNonNull(ajVar);
        if (this.cameraTypeConfigurationCase_ == 8 && this.cameraTypeConfiguration_ != aj.getDefaultInstance()) {
            ai aiVarNewBuilder = aj.newBuilder((aj) this.cameraTypeConfiguration_);
            aiVarNewBuilder.mergeFrom((ai) ajVar);
            ajVar = aiVarNewBuilder.buildPartial();
        }
        this.cameraTypeConfiguration_ = ajVar;
        this.cameraTypeConfigurationCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDummyConfiguration(al alVar) {
        Objects.requireNonNull(alVar);
        if (this.cameraTypeConfigurationCase_ == 3 && this.cameraTypeConfiguration_ != al.getDefaultInstance()) {
            ak akVarNewBuilder = al.newBuilder((al) this.cameraTypeConfiguration_);
            akVarNewBuilder.mergeFrom((ak) alVar);
            alVar = akVarNewBuilder.buildPartial();
        }
        this.cameraTypeConfiguration_ = alVar;
        this.cameraTypeConfigurationCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHovLaneConfiguration(be beVar) {
        Objects.requireNonNull(beVar);
        if (this.cameraTypeConfigurationCase_ == 11 && this.cameraTypeConfiguration_ != be.getDefaultInstance()) {
            bd bdVarNewBuilder = be.newBuilder((be) this.cameraTypeConfiguration_);
            bdVarNewBuilder.mergeFrom((bd) beVar);
            beVar = bdVarNewBuilder.buildPartial();
        }
        this.cameraTypeConfiguration_ = beVar;
        this.cameraTypeConfigurationCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMobilePhoneConfiguration(bq bqVar) {
        Objects.requireNonNull(bqVar);
        if (this.cameraTypeConfigurationCase_ == 5 && this.cameraTypeConfiguration_ != bq.getDefaultInstance()) {
            bp bpVarNewBuilder = bq.newBuilder((bq) this.cameraTypeConfiguration_);
            bpVarNewBuilder.mergeFrom((bp) bqVar);
            bqVar = bpVarNewBuilder.buildPartial();
        }
        this.cameraTypeConfiguration_ = bqVar;
        this.cameraTypeConfigurationCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNoiseConfiguration(bu buVar) {
        Objects.requireNonNull(buVar);
        if (this.cameraTypeConfigurationCase_ == 7 && this.cameraTypeConfiguration_ != bu.getDefaultInstance()) {
            bt btVarNewBuilder = bu.newBuilder((bu) this.cameraTypeConfiguration_);
            btVarNewBuilder.mergeFrom((bt) buVar);
            buVar = btVarNewBuilder.buildPartial();
        }
        this.cameraTypeConfiguration_ = buVar;
        this.cameraTypeConfigurationCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRedLightConfiguration(ck ckVar) {
        Objects.requireNonNull(ckVar);
        if (this.cameraTypeConfigurationCase_ == 2 && this.cameraTypeConfiguration_ != ck.getDefaultInstance()) {
            cj cjVarNewBuilder = ck.newBuilder((ck) this.cameraTypeConfiguration_);
            cjVarNewBuilder.mergeFrom((cj) ckVar);
            ckVar = cjVarNewBuilder.buildPartial();
        }
        this.cameraTypeConfiguration_ = ckVar;
        this.cameraTypeConfigurationCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSeatbeltConfiguration(cs csVar) {
        Objects.requireNonNull(csVar);
        if (this.cameraTypeConfigurationCase_ == 4 && this.cameraTypeConfiguration_ != cs.getDefaultInstance()) {
            cr crVarNewBuilder = cs.newBuilder((cs) this.cameraTypeConfiguration_);
            crVarNewBuilder.mergeFrom((cr) csVar);
            csVar = crVarNewBuilder.buildPartial();
        }
        this.cameraTypeConfiguration_ = csVar;
        this.cameraTypeConfigurationCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpeedConfiguration(db dbVar) {
        Objects.requireNonNull(dbVar);
        if (this.cameraTypeConfigurationCase_ == 1 && this.cameraTypeConfiguration_ != db.getDefaultInstance()) {
            da daVarNewBuilder = db.newBuilder((db) this.cameraTypeConfiguration_);
            daVarNewBuilder.mergeFrom((da) dbVar);
            dbVar = daVarNewBuilder.buildPartial();
        }
        this.cameraTypeConfiguration_ = dbVar;
        this.cameraTypeConfigurationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpeedRedLightConfiguration(dd ddVar) {
        Objects.requireNonNull(ddVar);
        if (this.cameraTypeConfigurationCase_ == 12 && this.cameraTypeConfiguration_ != dd.getDefaultInstance()) {
            dc dcVarNewBuilder = dd.newBuilder((dd) this.cameraTypeConfiguration_);
            dcVarNewBuilder.mergeFrom((dc) ddVar);
            ddVar = dcVarNewBuilder.buildPartial();
        }
        this.cameraTypeConfiguration_ = ddVar;
        this.cameraTypeConfigurationCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStopConfiguration(df dfVar) {
        Objects.requireNonNull(dfVar);
        if (this.cameraTypeConfigurationCase_ == 6 && this.cameraTypeConfiguration_ != df.getDefaultInstance()) {
            de deVarNewBuilder = df.newBuilder((df) this.cameraTypeConfiguration_);
            deVarNewBuilder.mergeFrom((de) dfVar);
            dfVar = deVarNewBuilder.buildPartial();
        }
        this.cameraTypeConfiguration_ = dfVar;
        this.cameraTypeConfigurationCase_ = 6;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static l parseDelimitedFrom(InputStream inputStream) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(com.google.v.v vVar) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<l> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusLaneConfiguration(i iVar) {
        Objects.requireNonNull(iVar);
        this.cameraTypeConfiguration_ = iVar;
        this.cameraTypeConfigurationCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarpoolLaneConfiguration(p pVar) {
        Objects.requireNonNull(pVar);
        this.cameraTypeConfiguration_ = pVar;
        this.cameraTypeConfigurationCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceConfiguration(aj ajVar) {
        Objects.requireNonNull(ajVar);
        this.cameraTypeConfiguration_ = ajVar;
        this.cameraTypeConfigurationCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDummyConfiguration(al alVar) {
        Objects.requireNonNull(alVar);
        this.cameraTypeConfiguration_ = alVar;
        this.cameraTypeConfigurationCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHovLaneConfiguration(be beVar) {
        Objects.requireNonNull(beVar);
        this.cameraTypeConfiguration_ = beVar;
        this.cameraTypeConfigurationCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobilePhoneConfiguration(bq bqVar) {
        Objects.requireNonNull(bqVar);
        this.cameraTypeConfiguration_ = bqVar;
        this.cameraTypeConfigurationCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoiseConfiguration(bu buVar) {
        Objects.requireNonNull(buVar);
        this.cameraTypeConfiguration_ = buVar;
        this.cameraTypeConfigurationCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRedLightConfiguration(ck ckVar) {
        Objects.requireNonNull(ckVar);
        this.cameraTypeConfiguration_ = ckVar;
        this.cameraTypeConfigurationCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeatbeltConfiguration(cs csVar) {
        Objects.requireNonNull(csVar);
        this.cameraTypeConfiguration_ = csVar;
        this.cameraTypeConfigurationCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedConfiguration(db dbVar) {
        Objects.requireNonNull(dbVar);
        this.cameraTypeConfiguration_ = dbVar;
        this.cameraTypeConfigurationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedRedLightConfiguration(dd ddVar) {
        Objects.requireNonNull(ddVar);
        this.cameraTypeConfiguration_ = ddVar;
        this.cameraTypeConfigurationCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStopConfiguration(df dfVar) {
        Objects.requireNonNull(dfVar);
        this.cameraTypeConfiguration_ = dfVar;
        this.cameraTypeConfigurationCase_ = 6;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0001\u0000\u0001\f\f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000", new Object[]{"cameraTypeConfiguration_", "cameraTypeConfigurationCase_", db.class, ck.class, al.class, cs.class, bq.class, df.class, bu.class, aj.class, p.class, i.class, be.class, dd.class});
        }
        if (iOrdinal == 3) {
            return new l();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new j(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<l> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (l.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i getBusLaneConfiguration() {
        return this.cameraTypeConfigurationCase_ == 10 ? (i) this.cameraTypeConfiguration_ : i.getDefaultInstance();
    }

    public k getCameraTypeConfigurationCase() {
        switch (this.cameraTypeConfigurationCase_) {
            case 0:
                return k.m;
            case 1:
                return k.f15079a;
            case 2:
                return k.f15080b;
            case 3:
                return k.f15081c;
            case 4:
                return k.f15082d;
            case 5:
                return k.f15083e;
            case 6:
                return k.f15084f;
            case 7:
                return k.f15085g;
            case 8:
                return k.f15086h;
            case 9:
                return k.f15087i;
            case 10:
                return k.f15088j;
            case 11:
                return k.f15089k;
            case 12:
                return k.f15090l;
            default:
                return null;
        }
    }

    public p getCarpoolLaneConfiguration() {
        return this.cameraTypeConfigurationCase_ == 9 ? (p) this.cameraTypeConfiguration_ : p.getDefaultInstance();
    }

    public aj getDistanceConfiguration() {
        return this.cameraTypeConfigurationCase_ == 8 ? (aj) this.cameraTypeConfiguration_ : aj.getDefaultInstance();
    }

    public al getDummyConfiguration() {
        return this.cameraTypeConfigurationCase_ == 3 ? (al) this.cameraTypeConfiguration_ : al.getDefaultInstance();
    }

    public be getHovLaneConfiguration() {
        return this.cameraTypeConfigurationCase_ == 11 ? (be) this.cameraTypeConfiguration_ : be.getDefaultInstance();
    }

    public bq getMobilePhoneConfiguration() {
        return this.cameraTypeConfigurationCase_ == 5 ? (bq) this.cameraTypeConfiguration_ : bq.getDefaultInstance();
    }

    public bu getNoiseConfiguration() {
        return this.cameraTypeConfigurationCase_ == 7 ? (bu) this.cameraTypeConfiguration_ : bu.getDefaultInstance();
    }

    public ck getRedLightConfiguration() {
        return this.cameraTypeConfigurationCase_ == 2 ? (ck) this.cameraTypeConfiguration_ : ck.getDefaultInstance();
    }

    public cs getSeatbeltConfiguration() {
        return this.cameraTypeConfigurationCase_ == 4 ? (cs) this.cameraTypeConfiguration_ : cs.getDefaultInstance();
    }

    public db getSpeedConfiguration() {
        return this.cameraTypeConfigurationCase_ == 1 ? (db) this.cameraTypeConfiguration_ : db.getDefaultInstance();
    }

    public dd getSpeedRedLightConfiguration() {
        return this.cameraTypeConfigurationCase_ == 12 ? (dd) this.cameraTypeConfiguration_ : dd.getDefaultInstance();
    }

    public df getStopConfiguration() {
        return this.cameraTypeConfigurationCase_ == 6 ? (df) this.cameraTypeConfiguration_ : df.getDefaultInstance();
    }

    public boolean hasBusLaneConfiguration() {
        return this.cameraTypeConfigurationCase_ == 10;
    }

    public boolean hasCarpoolLaneConfiguration() {
        return this.cameraTypeConfigurationCase_ == 9;
    }

    public boolean hasDistanceConfiguration() {
        return this.cameraTypeConfigurationCase_ == 8;
    }

    public boolean hasDummyConfiguration() {
        return this.cameraTypeConfigurationCase_ == 3;
    }

    public boolean hasHovLaneConfiguration() {
        return this.cameraTypeConfigurationCase_ == 11;
    }

    public boolean hasMobilePhoneConfiguration() {
        return this.cameraTypeConfigurationCase_ == 5;
    }

    public boolean hasNoiseConfiguration() {
        return this.cameraTypeConfigurationCase_ == 7;
    }

    public boolean hasRedLightConfiguration() {
        return this.cameraTypeConfigurationCase_ == 2;
    }

    public boolean hasSeatbeltConfiguration() {
        return this.cameraTypeConfigurationCase_ == 4;
    }

    public boolean hasSpeedConfiguration() {
        return this.cameraTypeConfigurationCase_ == 1;
    }

    public boolean hasSpeedRedLightConfiguration() {
        return this.cameraTypeConfigurationCase_ == 12;
    }

    public boolean hasStopConfiguration() {
        return this.cameraTypeConfigurationCase_ == 6;
    }

    public static j newBuilder(l lVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(lVar);
    }

    public static l parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static l parseFrom(com.google.v.z zVar) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static l parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static l parseFrom(InputStream inputStream) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(ByteBuffer byteBuffer) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static l parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static l parseFrom(byte[] bArr) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static l parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
