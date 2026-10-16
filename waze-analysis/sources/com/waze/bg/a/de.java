package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class de extends com.google.v.du<de, cj> implements fj {
    public static final int ANIMAL_FIELD_NUMBER = 12;
    public static final int BLOCKED_LANE_FIELD_NUMBER = 6;
    public static final int CAMERA_FIELD_NUMBER = 11;
    public static final int CLOSURE_FIELD_NUMBER = 8;
    public static final int CRASH_FIELD_NUMBER = 3;
    private static final de DEFAULT_INSTANCE;
    public static final int HAZARD_ON_ROAD_FIELD_NUMBER = 4;
    private static volatile fo<de> PARSER = null;
    public static final int PERMANENT_HAZARD_FIELD_NUMBER = 7;
    public static final int PERSONAL_SAFETY_FIELD_NUMBER = 10;
    public static final int POLICE_FIELD_NUMBER = 2;
    public static final int TRAFFIC_FIELD_NUMBER = 1;
    public static final int TURN_CLOSURE_FIELD_NUMBER = 9;
    public static final int WEATHER_FIELD_NUMBER = 5;
    private int alertDetailsCase_ = 0;
    private Object alertDetails_;

    static {
        de deVar = new de();
        DEFAULT_INSTANCE = deVar;
        com.google.v.du.registerDefaultInstance(de.class, deVar);
    }

    private de() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertDetails() {
        this.alertDetailsCase_ = 0;
        this.alertDetails_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnimal() {
        if (this.alertDetailsCase_ == 12) {
            this.alertDetailsCase_ = 0;
            this.alertDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlockedLane() {
        if (this.alertDetailsCase_ == 6) {
            this.alertDetailsCase_ = 0;
            this.alertDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCamera() {
        if (this.alertDetailsCase_ == 11) {
            this.alertDetailsCase_ = 0;
            this.alertDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosure() {
        if (this.alertDetailsCase_ == 8) {
            this.alertDetailsCase_ = 0;
            this.alertDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrash() {
        if (this.alertDetailsCase_ == 3) {
            this.alertDetailsCase_ = 0;
            this.alertDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHazardOnRoad() {
        if (this.alertDetailsCase_ == 4) {
            this.alertDetailsCase_ = 0;
            this.alertDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermanentHazard() {
        if (this.alertDetailsCase_ == 7) {
            this.alertDetailsCase_ = 0;
            this.alertDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPersonalSafety() {
        if (this.alertDetailsCase_ == 10) {
            this.alertDetailsCase_ = 0;
            this.alertDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolice() {
        if (this.alertDetailsCase_ == 2) {
            this.alertDetailsCase_ = 0;
            this.alertDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraffic() {
        if (this.alertDetailsCase_ == 1) {
            this.alertDetailsCase_ = 0;
            this.alertDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTurnClosure() {
        if (this.alertDetailsCase_ == 9) {
            this.alertDetailsCase_ = 0;
            this.alertDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeather() {
        if (this.alertDetailsCase_ == 5) {
            this.alertDetailsCase_ = 0;
            this.alertDetails_ = null;
        }
    }

    public static de getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAnimal(cg cgVar) {
        Objects.requireNonNull(cgVar);
        if (this.alertDetailsCase_ == 12 && this.alertDetails_ != cg.getDefaultInstance()) {
            cf cfVarNewBuilder = cg.newBuilder((cg) this.alertDetails_);
            cfVarNewBuilder.mergeFrom((cf) cgVar);
            cgVar = cfVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = cgVar;
        this.alertDetailsCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBlockedLane(ci ciVar) {
        Objects.requireNonNull(ciVar);
        if (this.alertDetailsCase_ == 6 && this.alertDetails_ != ci.getDefaultInstance()) {
            ch chVarNewBuilder = ci.newBuilder((ci) this.alertDetails_);
            chVarNewBuilder.mergeFrom((ch) ciVar);
            ciVar = chVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = ciVar;
        this.alertDetailsCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCamera(cl clVar) {
        Objects.requireNonNull(clVar);
        if (this.alertDetailsCase_ == 11 && this.alertDetails_ != cl.getDefaultInstance()) {
            ck ckVarNewBuilder = cl.newBuilder((cl) this.alertDetails_);
            ckVarNewBuilder.mergeFrom((ck) clVar);
            clVar = ckVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = clVar;
        this.alertDetailsCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClosure(cn cnVar) {
        Objects.requireNonNull(cnVar);
        if (this.alertDetailsCase_ == 8 && this.alertDetails_ != cn.getDefaultInstance()) {
            cm cmVarNewBuilder = cn.newBuilder((cn) this.alertDetails_);
            cmVarNewBuilder.mergeFrom((cm) cnVar);
            cnVar = cmVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = cnVar;
        this.alertDetailsCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCrash(cp cpVar) {
        Objects.requireNonNull(cpVar);
        if (this.alertDetailsCase_ == 3 && this.alertDetails_ != cp.getDefaultInstance()) {
            co coVarNewBuilder = cp.newBuilder((cp) this.alertDetails_);
            coVarNewBuilder.mergeFrom((co) cpVar);
            cpVar = coVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = cpVar;
        this.alertDetailsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHazardOnRoad(cr crVar) {
        Objects.requireNonNull(crVar);
        if (this.alertDetailsCase_ == 4 && this.alertDetails_ != cr.getDefaultInstance()) {
            cq cqVarNewBuilder = cr.newBuilder((cr) this.alertDetails_);
            cqVarNewBuilder.mergeFrom((cq) crVar);
            crVar = cqVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = crVar;
        this.alertDetailsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePermanentHazard(ct ctVar) {
        Objects.requireNonNull(ctVar);
        if (this.alertDetailsCase_ == 7 && this.alertDetails_ != ct.getDefaultInstance()) {
            cs csVarNewBuilder = ct.newBuilder((ct) this.alertDetails_);
            csVarNewBuilder.mergeFrom((cs) ctVar);
            ctVar = csVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = ctVar;
        this.alertDetailsCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePersonalSafety(cv cvVar) {
        Objects.requireNonNull(cvVar);
        if (this.alertDetailsCase_ == 10 && this.alertDetails_ != cv.getDefaultInstance()) {
            cu cuVarNewBuilder = cv.newBuilder((cv) this.alertDetails_);
            cuVarNewBuilder.mergeFrom((cu) cvVar);
            cvVar = cuVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = cvVar;
        this.alertDetailsCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePolice(cx cxVar) {
        Objects.requireNonNull(cxVar);
        if (this.alertDetailsCase_ == 2 && this.alertDetails_ != cx.getDefaultInstance()) {
            cw cwVarNewBuilder = cx.newBuilder((cx) this.alertDetails_);
            cwVarNewBuilder.mergeFrom((cw) cxVar);
            cxVar = cwVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = cxVar;
        this.alertDetailsCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTraffic(cz czVar) {
        Objects.requireNonNull(czVar);
        if (this.alertDetailsCase_ == 1 && this.alertDetails_ != cz.getDefaultInstance()) {
            cy cyVarNewBuilder = cz.newBuilder((cz) this.alertDetails_);
            cyVarNewBuilder.mergeFrom((cy) czVar);
            czVar = cyVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = czVar;
        this.alertDetailsCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTurnClosure(db dbVar) {
        Objects.requireNonNull(dbVar);
        if (this.alertDetailsCase_ == 9 && this.alertDetails_ != db.getDefaultInstance()) {
            da daVarNewBuilder = db.newBuilder((db) this.alertDetails_);
            daVarNewBuilder.mergeFrom((da) dbVar);
            dbVar = daVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = dbVar;
        this.alertDetailsCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWeather(dd ddVar) {
        Objects.requireNonNull(ddVar);
        if (this.alertDetailsCase_ == 5 && this.alertDetails_ != dd.getDefaultInstance()) {
            dc dcVarNewBuilder = dd.newBuilder((dd) this.alertDetails_);
            dcVarNewBuilder.mergeFrom((dc) ddVar);
            ddVar = dcVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = ddVar;
        this.alertDetailsCase_ = 5;
    }

    public static cj newBuilder() {
        return (cj) DEFAULT_INSTANCE.createBuilder();
    }

    public static de parseDelimitedFrom(InputStream inputStream) {
        return (de) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static de parseFrom(com.google.v.v vVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<de> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimal(cg cgVar) {
        Objects.requireNonNull(cgVar);
        this.alertDetails_ = cgVar;
        this.alertDetailsCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlockedLane(ci ciVar) {
        Objects.requireNonNull(ciVar);
        this.alertDetails_ = ciVar;
        this.alertDetailsCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCamera(cl clVar) {
        Objects.requireNonNull(clVar);
        this.alertDetails_ = clVar;
        this.alertDetailsCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosure(cn cnVar) {
        Objects.requireNonNull(cnVar);
        this.alertDetails_ = cnVar;
        this.alertDetailsCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrash(cp cpVar) {
        Objects.requireNonNull(cpVar);
        this.alertDetails_ = cpVar;
        this.alertDetailsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHazardOnRoad(cr crVar) {
        Objects.requireNonNull(crVar);
        this.alertDetails_ = crVar;
        this.alertDetailsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermanentHazard(ct ctVar) {
        Objects.requireNonNull(ctVar);
        this.alertDetails_ = ctVar;
        this.alertDetailsCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersonalSafety(cv cvVar) {
        Objects.requireNonNull(cvVar);
        this.alertDetails_ = cvVar;
        this.alertDetailsCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolice(cx cxVar) {
        Objects.requireNonNull(cxVar);
        this.alertDetails_ = cxVar;
        this.alertDetailsCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraffic(cz czVar) {
        Objects.requireNonNull(czVar);
        this.alertDetails_ = czVar;
        this.alertDetailsCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTurnClosure(db dbVar) {
        Objects.requireNonNull(dbVar);
        this.alertDetails_ = dbVar;
        this.alertDetailsCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeather(dd ddVar) {
        Objects.requireNonNull(ddVar);
        this.alertDetails_ = ddVar;
        this.alertDetailsCase_ = 5;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0001\u0000\u0001\f\f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000", new Object[]{"alertDetails_", "alertDetailsCase_", cz.class, cx.class, cp.class, cr.class, dd.class, ci.class, ct.class, cn.class, db.class, cv.class, cl.class, cg.class});
        }
        if (iOrdinal == 3) {
            return new de();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<de> foVar = PARSER;
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
    }

    public ce getAlertDetailsCase() {
        switch (this.alertDetailsCase_) {
            case 0:
                return ce.m;
            case 1:
                return ce.f16524a;
            case 2:
                return ce.f16525b;
            case 3:
                return ce.f16526c;
            case 4:
                return ce.f16527d;
            case 5:
                return ce.f16528e;
            case 6:
                return ce.f16529f;
            case 7:
                return ce.f16530g;
            case 8:
                return ce.f16531h;
            case 9:
                return ce.f16532i;
            case 10:
                return ce.f16533j;
            case 11:
                return ce.f16534k;
            case 12:
                return ce.f16535l;
            default:
                return null;
        }
    }

    public cg getAnimal() {
        return this.alertDetailsCase_ == 12 ? (cg) this.alertDetails_ : cg.getDefaultInstance();
    }

    public ci getBlockedLane() {
        return this.alertDetailsCase_ == 6 ? (ci) this.alertDetails_ : ci.getDefaultInstance();
    }

    public cl getCamera() {
        return this.alertDetailsCase_ == 11 ? (cl) this.alertDetails_ : cl.getDefaultInstance();
    }

    public cn getClosure() {
        return this.alertDetailsCase_ == 8 ? (cn) this.alertDetails_ : cn.getDefaultInstance();
    }

    public cp getCrash() {
        return this.alertDetailsCase_ == 3 ? (cp) this.alertDetails_ : cp.getDefaultInstance();
    }

    public cr getHazardOnRoad() {
        return this.alertDetailsCase_ == 4 ? (cr) this.alertDetails_ : cr.getDefaultInstance();
    }

    public ct getPermanentHazard() {
        return this.alertDetailsCase_ == 7 ? (ct) this.alertDetails_ : ct.getDefaultInstance();
    }

    public cv getPersonalSafety() {
        return this.alertDetailsCase_ == 10 ? (cv) this.alertDetails_ : cv.getDefaultInstance();
    }

    public cx getPolice() {
        return this.alertDetailsCase_ == 2 ? (cx) this.alertDetails_ : cx.getDefaultInstance();
    }

    public cz getTraffic() {
        return this.alertDetailsCase_ == 1 ? (cz) this.alertDetails_ : cz.getDefaultInstance();
    }

    public db getTurnClosure() {
        return this.alertDetailsCase_ == 9 ? (db) this.alertDetails_ : db.getDefaultInstance();
    }

    public dd getWeather() {
        return this.alertDetailsCase_ == 5 ? (dd) this.alertDetails_ : dd.getDefaultInstance();
    }

    public boolean hasAnimal() {
        return this.alertDetailsCase_ == 12;
    }

    public boolean hasBlockedLane() {
        return this.alertDetailsCase_ == 6;
    }

    public boolean hasCamera() {
        return this.alertDetailsCase_ == 11;
    }

    public boolean hasClosure() {
        return this.alertDetailsCase_ == 8;
    }

    public boolean hasCrash() {
        return this.alertDetailsCase_ == 3;
    }

    public boolean hasHazardOnRoad() {
        return this.alertDetailsCase_ == 4;
    }

    public boolean hasPermanentHazard() {
        return this.alertDetailsCase_ == 7;
    }

    public boolean hasPersonalSafety() {
        return this.alertDetailsCase_ == 10;
    }

    public boolean hasPolice() {
        return this.alertDetailsCase_ == 2;
    }

    public boolean hasTraffic() {
        return this.alertDetailsCase_ == 1;
    }

    public boolean hasTurnClosure() {
        return this.alertDetailsCase_ == 9;
    }

    public boolean hasWeather() {
        return this.alertDetailsCase_ == 5;
    }

    public static cj newBuilder(de deVar) {
        return (cj) DEFAULT_INSTANCE.createBuilder(deVar);
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
