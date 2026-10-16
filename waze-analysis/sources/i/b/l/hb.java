package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class hb extends com.google.v.du<hb, gz> implements hc {
    public static final int ANIMAL_REPORT_CATEGORY_FIELD_NUMBER = 12;
    public static final int BLOCKED_LANE_REPORT_CATEGORY_FIELD_NUMBER = 1;
    public static final int CLOSURE_REPORT_CATEGORY_FIELD_NUMBER = 10;
    public static final int CRASH_REPORT_CATEGORY_FIELD_NUMBER = 4;
    public static final int DEBUG_REPORT_CATEGORY_FIELD_NUMBER = 8;
    private static final hb DEFAULT_INSTANCE;
    public static final int HAZARD_REPORT_CATEGORY_FIELD_NUMBER = 3;
    public static final int LEGACY_REPORT_CATEGORY_FIELD_NUMBER = 7;
    public static final int MAP_ISSUE_REPORT_CATEGORY_FIELD_NUMBER = 9;
    private static volatile com.google.v.fo<hb> PARSER = null;
    public static final int PERSONAL_SAFETY_REPORT_CATEGORY_FIELD_NUMBER = 11;
    public static final int POLICE_REPORT_CATEGORY_FIELD_NUMBER = 5;
    public static final int TRAFFIC_REPORT_CATEGORY_FIELD_NUMBER = 6;
    public static final int WEATHER_REPORT_CATEGORY_FIELD_NUMBER = 2;
    private int reportCategoryCase_ = 0;
    private Object reportCategory_;

    static {
        hb hbVar = new hb();
        DEFAULT_INSTANCE = hbVar;
        com.google.v.du.registerDefaultInstance(hb.class, hbVar);
    }

    private hb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnimalReportCategory() {
        if (this.reportCategoryCase_ == 12) {
            this.reportCategoryCase_ = 0;
            this.reportCategory_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlockedLaneReportCategory() {
        if (this.reportCategoryCase_ == 1) {
            this.reportCategoryCase_ = 0;
            this.reportCategory_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosureReportCategory() {
        if (this.reportCategoryCase_ == 10) {
            this.reportCategoryCase_ = 0;
            this.reportCategory_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrashReportCategory() {
        if (this.reportCategoryCase_ == 4) {
            this.reportCategoryCase_ = 0;
            this.reportCategory_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDebugReportCategory() {
        if (this.reportCategoryCase_ == 8) {
            this.reportCategoryCase_ = 0;
            this.reportCategory_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHazardReportCategory() {
        if (this.reportCategoryCase_ == 3) {
            this.reportCategoryCase_ = 0;
            this.reportCategory_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacyReportCategory() {
        if (this.reportCategoryCase_ == 7) {
            this.reportCategoryCase_ = 0;
            this.reportCategory_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapIssueReportCategory() {
        if (this.reportCategoryCase_ == 9) {
            this.reportCategoryCase_ = 0;
            this.reportCategory_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPersonalSafetyReportCategory() {
        if (this.reportCategoryCase_ == 11) {
            this.reportCategoryCase_ = 0;
            this.reportCategory_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoliceReportCategory() {
        if (this.reportCategoryCase_ == 5) {
            this.reportCategoryCase_ = 0;
            this.reportCategory_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportCategory() {
        this.reportCategoryCase_ = 0;
        this.reportCategory_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficReportCategory() {
        if (this.reportCategoryCase_ == 6) {
            this.reportCategoryCase_ = 0;
            this.reportCategory_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeatherReportCategory() {
        if (this.reportCategoryCase_ == 2) {
            this.reportCategoryCase_ = 0;
            this.reportCategory_ = null;
        }
    }

    public static hb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAnimalReportCategory(fh fhVar) {
        Objects.requireNonNull(fhVar);
        if (this.reportCategoryCase_ == 12 && this.reportCategory_ != fh.getDefaultInstance()) {
            fg fgVarNewBuilder = fh.newBuilder((fh) this.reportCategory_);
            fgVarNewBuilder.mergeFrom((fg) fhVar);
            fhVar = fgVarNewBuilder.buildPartial();
        }
        this.reportCategory_ = fhVar;
        this.reportCategoryCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBlockedLaneReportCategory(fl flVar) {
        Objects.requireNonNull(flVar);
        if (this.reportCategoryCase_ == 1 && this.reportCategory_ != fl.getDefaultInstance()) {
            fk fkVarNewBuilder = fl.newBuilder((fl) this.reportCategory_);
            fkVarNewBuilder.mergeFrom((fk) flVar);
            flVar = fkVarNewBuilder.buildPartial();
        }
        this.reportCategory_ = flVar;
        this.reportCategoryCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClosureReportCategory(fn fnVar) {
        Objects.requireNonNull(fnVar);
        if (this.reportCategoryCase_ == 10 && this.reportCategory_ != fn.getDefaultInstance()) {
            fm fmVarNewBuilder = fn.newBuilder((fn) this.reportCategory_);
            fmVarNewBuilder.mergeFrom((fm) fnVar);
            fnVar = fmVarNewBuilder.buildPartial();
        }
        this.reportCategory_ = fnVar;
        this.reportCategoryCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCrashReportCategory(fs fsVar) {
        Objects.requireNonNull(fsVar);
        if (this.reportCategoryCase_ == 4 && this.reportCategory_ != fs.getDefaultInstance()) {
            fr frVarNewBuilder = fs.newBuilder((fs) this.reportCategory_);
            frVarNewBuilder.mergeFrom((fr) fsVar);
            fsVar = frVarNewBuilder.buildPartial();
        }
        this.reportCategory_ = fsVar;
        this.reportCategoryCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDebugReportCategory(fu fuVar) {
        Objects.requireNonNull(fuVar);
        if (this.reportCategoryCase_ == 8 && this.reportCategory_ != fu.getDefaultInstance()) {
            ft ftVarNewBuilder = fu.newBuilder((fu) this.reportCategory_);
            ftVarNewBuilder.mergeFrom((ft) fuVar);
            fuVar = ftVarNewBuilder.buildPartial();
        }
        this.reportCategory_ = fuVar;
        this.reportCategoryCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHazardReportCategory(gb gbVar) {
        Objects.requireNonNull(gbVar);
        if (this.reportCategoryCase_ == 3 && this.reportCategory_ != gb.getDefaultInstance()) {
            ga gaVarNewBuilder = gb.newBuilder((gb) this.reportCategory_);
            gaVarNewBuilder.mergeFrom((ga) gbVar);
            gbVar = gaVarNewBuilder.buildPartial();
        }
        this.reportCategory_ = gbVar;
        this.reportCategoryCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapIssueReportCategory(gm gmVar) {
        Objects.requireNonNull(gmVar);
        if (this.reportCategoryCase_ == 9 && this.reportCategory_ != gm.getDefaultInstance()) {
            gl glVarNewBuilder = gm.newBuilder((gm) this.reportCategory_);
            glVarNewBuilder.mergeFrom((gl) gmVar);
            gmVar = glVarNewBuilder.buildPartial();
        }
        this.reportCategory_ = gmVar;
        this.reportCategoryCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePersonalSafetyReportCategory(gt gtVar) {
        Objects.requireNonNull(gtVar);
        if (this.reportCategoryCase_ == 11 && this.reportCategory_ != gt.getDefaultInstance()) {
            gs gsVarNewBuilder = gt.newBuilder((gt) this.reportCategory_);
            gsVarNewBuilder.mergeFrom((gs) gtVar);
            gtVar = gsVarNewBuilder.buildPartial();
        }
        this.reportCategory_ = gtVar;
        this.reportCategoryCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePoliceReportCategory(gv gvVar) {
        Objects.requireNonNull(gvVar);
        if (this.reportCategoryCase_ == 5 && this.reportCategory_ != gv.getDefaultInstance()) {
            gu guVarNewBuilder = gv.newBuilder((gv) this.reportCategory_);
            guVarNewBuilder.mergeFrom((gu) gvVar);
            gvVar = guVarNewBuilder.buildPartial();
        }
        this.reportCategory_ = gvVar;
        this.reportCategoryCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrafficReportCategory(hs hsVar) {
        Objects.requireNonNull(hsVar);
        if (this.reportCategoryCase_ == 6 && this.reportCategory_ != hs.getDefaultInstance()) {
            hr hrVarNewBuilder = hs.newBuilder((hs) this.reportCategory_);
            hrVarNewBuilder.mergeFrom((hr) hsVar);
            hsVar = hrVarNewBuilder.buildPartial();
        }
        this.reportCategory_ = hsVar;
        this.reportCategoryCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWeatherReportCategory(Cif cif) {
        Objects.requireNonNull(cif);
        if (this.reportCategoryCase_ == 2 && this.reportCategory_ != Cif.getDefaultInstance()) {
            ie ieVarNewBuilder = Cif.newBuilder((Cif) this.reportCategory_);
            ieVarNewBuilder.mergeFrom((ie) cif);
            cif = ieVarNewBuilder.buildPartial();
        }
        this.reportCategory_ = cif;
        this.reportCategoryCase_ = 2;
    }

    public static gz newBuilder() {
        return (gz) DEFAULT_INSTANCE.createBuilder();
    }

    public static hb parseDelimitedFrom(InputStream inputStream) {
        return (hb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hb parseFrom(com.google.v.v vVar) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimalReportCategory(fh fhVar) {
        Objects.requireNonNull(fhVar);
        this.reportCategory_ = fhVar;
        this.reportCategoryCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlockedLaneReportCategory(fl flVar) {
        Objects.requireNonNull(flVar);
        this.reportCategory_ = flVar;
        this.reportCategoryCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosureReportCategory(fn fnVar) {
        Objects.requireNonNull(fnVar);
        this.reportCategory_ = fnVar;
        this.reportCategoryCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrashReportCategory(fs fsVar) {
        Objects.requireNonNull(fsVar);
        this.reportCategory_ = fsVar;
        this.reportCategoryCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDebugReportCategory(fu fuVar) {
        Objects.requireNonNull(fuVar);
        this.reportCategory_ = fuVar;
        this.reportCategoryCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHazardReportCategory(gb gbVar) {
        Objects.requireNonNull(gbVar);
        this.reportCategory_ = gbVar;
        this.reportCategoryCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyReportCategory(gy gyVar) {
        this.reportCategory_ = Integer.valueOf(gyVar.getNumber());
        this.reportCategoryCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapIssueReportCategory(gm gmVar) {
        Objects.requireNonNull(gmVar);
        this.reportCategory_ = gmVar;
        this.reportCategoryCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersonalSafetyReportCategory(gt gtVar) {
        Objects.requireNonNull(gtVar);
        this.reportCategory_ = gtVar;
        this.reportCategoryCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoliceReportCategory(gv gvVar) {
        Objects.requireNonNull(gvVar);
        this.reportCategory_ = gvVar;
        this.reportCategoryCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficReportCategory(hs hsVar) {
        Objects.requireNonNull(hsVar);
        this.reportCategory_ = hsVar;
        this.reportCategoryCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeatherReportCategory(Cif cif) {
        Objects.requireNonNull(cif);
        this.reportCategory_ = cif;
        this.reportCategoryCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0001\u0000\u0001\f\f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007\u083f\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000", new Object[]{"reportCategory_", "reportCategoryCase_", fl.class, Cif.class, gb.class, fs.class, gv.class, hs.class, hf.f48738b, fu.class, gm.class, fn.class, gt.class, fh.class});
        }
        if (iOrdinal == 3) {
            return new hb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public fh getAnimalReportCategory() {
        return this.reportCategoryCase_ == 12 ? (fh) this.reportCategory_ : fh.getDefaultInstance();
    }

    public fl getBlockedLaneReportCategory() {
        return this.reportCategoryCase_ == 1 ? (fl) this.reportCategory_ : fl.getDefaultInstance();
    }

    public fn getClosureReportCategory() {
        return this.reportCategoryCase_ == 10 ? (fn) this.reportCategory_ : fn.getDefaultInstance();
    }

    public fs getCrashReportCategory() {
        return this.reportCategoryCase_ == 4 ? (fs) this.reportCategory_ : fs.getDefaultInstance();
    }

    public fu getDebugReportCategory() {
        return this.reportCategoryCase_ == 8 ? (fu) this.reportCategory_ : fu.getDefaultInstance();
    }

    public gb getHazardReportCategory() {
        return this.reportCategoryCase_ == 3 ? (gb) this.reportCategory_ : gb.getDefaultInstance();
    }

    public gy getLegacyReportCategory() {
        gy gyVarA;
        return (this.reportCategoryCase_ != 7 || (gyVarA = gy.a(((Integer) this.reportCategory_).intValue())) == null) ? gy.REPORT_CATEGORY_UNSPECIFIED : gyVarA;
    }

    public gm getMapIssueReportCategory() {
        return this.reportCategoryCase_ == 9 ? (gm) this.reportCategory_ : gm.getDefaultInstance();
    }

    public gt getPersonalSafetyReportCategory() {
        return this.reportCategoryCase_ == 11 ? (gt) this.reportCategory_ : gt.getDefaultInstance();
    }

    public gv getPoliceReportCategory() {
        return this.reportCategoryCase_ == 5 ? (gv) this.reportCategory_ : gv.getDefaultInstance();
    }

    public ha getReportCategoryCase() {
        switch (this.reportCategoryCase_) {
            case 0:
                return ha.m;
            case 1:
                return ha.f48725a;
            case 2:
                return ha.f48726b;
            case 3:
                return ha.f48727c;
            case 4:
                return ha.f48728d;
            case 5:
                return ha.f48729e;
            case 6:
                return ha.f48730f;
            case 7:
                return ha.f48731g;
            case 8:
                return ha.f48732h;
            case 9:
                return ha.f48733i;
            case 10:
                return ha.f48734j;
            case 11:
                return ha.f48735k;
            case 12:
                return ha.f48736l;
            default:
                return null;
        }
    }

    public hs getTrafficReportCategory() {
        return this.reportCategoryCase_ == 6 ? (hs) this.reportCategory_ : hs.getDefaultInstance();
    }

    public Cif getWeatherReportCategory() {
        return this.reportCategoryCase_ == 2 ? (Cif) this.reportCategory_ : Cif.getDefaultInstance();
    }

    public boolean hasAnimalReportCategory() {
        return this.reportCategoryCase_ == 12;
    }

    public boolean hasBlockedLaneReportCategory() {
        return this.reportCategoryCase_ == 1;
    }

    public boolean hasClosureReportCategory() {
        return this.reportCategoryCase_ == 10;
    }

    public boolean hasCrashReportCategory() {
        return this.reportCategoryCase_ == 4;
    }

    public boolean hasDebugReportCategory() {
        return this.reportCategoryCase_ == 8;
    }

    public boolean hasHazardReportCategory() {
        return this.reportCategoryCase_ == 3;
    }

    public boolean hasLegacyReportCategory() {
        return this.reportCategoryCase_ == 7;
    }

    public boolean hasMapIssueReportCategory() {
        return this.reportCategoryCase_ == 9;
    }

    public boolean hasPersonalSafetyReportCategory() {
        return this.reportCategoryCase_ == 11;
    }

    public boolean hasPoliceReportCategory() {
        return this.reportCategoryCase_ == 5;
    }

    public boolean hasTrafficReportCategory() {
        return this.reportCategoryCase_ == 6;
    }

    public boolean hasWeatherReportCategory() {
        return this.reportCategoryCase_ == 2;
    }

    public static gz newBuilder(hb hbVar) {
        return (gz) DEFAULT_INSTANCE.createBuilder(hbVar);
    }

    public static hb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hb parseFrom(com.google.v.z zVar) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hb parseFrom(InputStream inputStream) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hb parseFrom(ByteBuffer byteBuffer) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hb parseFrom(byte[] bArr) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
