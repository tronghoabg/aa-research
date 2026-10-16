package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ej extends com.google.v.du<ej, dk> implements fj {
    public static final int ANIMAL_FIELD_NUMBER = 14;
    public static final int BLOCKED_LANE_FIELD_NUMBER = 6;
    public static final int CAMERA_FIELD_NUMBER = 13;
    public static final int CLOSURE_FIELD_NUMBER = 8;
    public static final int CRASH_FIELD_NUMBER = 3;
    public static final int CRASH_PRONE_FIELD_NUMBER = 11;
    private static final ej DEFAULT_INSTANCE;
    public static final int HAZARD_ON_ROAD_FIELD_NUMBER = 4;
    private static volatile fo<ej> PARSER = null;
    public static final int PERMANENT_HAZARD_FIELD_NUMBER = 7;
    public static final int PERSONAL_SAFETY_FIELD_NUMBER = 12;
    public static final int POLICE_FIELD_NUMBER = 2;
    public static final int SPEED_LIMIT_DECREASE_FIELD_NUMBER = 9;
    public static final int TRAFFIC_FIELD_NUMBER = 1;
    public static final int TURN_CLOSURE_FIELD_NUMBER = 10;
    public static final int WEATHER_FIELD_NUMBER = 5;
    private int alertDetailsCase_ = 0;
    private Object alertDetails_;

    static {
        ej ejVar = new ej();
        DEFAULT_INSTANCE = ejVar;
        com.google.v.du.registerDefaultInstance(ej.class, ejVar);
    }

    private ej() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertDetails() {
        this.alertDetailsCase_ = 0;
        this.alertDetails_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnimal() {
        if (this.alertDetailsCase_ == 14) {
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
        if (this.alertDetailsCase_ == 13) {
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
    public void clearCrashProne() {
        if (this.alertDetailsCase_ == 11) {
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
        if (this.alertDetailsCase_ == 12) {
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
    public void clearSpeedLimitDecrease() {
        if (this.alertDetailsCase_ == 9) {
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
        if (this.alertDetailsCase_ == 10) {
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

    public static ej getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAnimal(dh dhVar) {
        Objects.requireNonNull(dhVar);
        if (this.alertDetailsCase_ == 14 && this.alertDetails_ != dh.getDefaultInstance()) {
            dg dgVarNewBuilder = dh.newBuilder((dh) this.alertDetails_);
            dgVarNewBuilder.mergeFrom((dg) dhVar);
            dhVar = dgVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = dhVar;
        this.alertDetailsCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBlockedLane(dj djVar) {
        Objects.requireNonNull(djVar);
        if (this.alertDetailsCase_ == 6 && this.alertDetails_ != dj.getDefaultInstance()) {
            di diVarNewBuilder = dj.newBuilder((dj) this.alertDetails_);
            diVarNewBuilder.mergeFrom((di) djVar);
            djVar = diVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = djVar;
        this.alertDetailsCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCamera(dm dmVar) {
        Objects.requireNonNull(dmVar);
        if (this.alertDetailsCase_ == 13 && this.alertDetails_ != dm.getDefaultInstance()) {
            dl dlVarNewBuilder = dm.newBuilder((dm) this.alertDetails_);
            dlVarNewBuilder.mergeFrom((dl) dmVar);
            dmVar = dlVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = dmVar;
        this.alertDetailsCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClosure(Cdo cdo) {
        Objects.requireNonNull(cdo);
        if (this.alertDetailsCase_ == 8 && this.alertDetails_ != Cdo.getDefaultInstance()) {
            dn dnVarNewBuilder = Cdo.newBuilder((Cdo) this.alertDetails_);
            dnVarNewBuilder.mergeFrom((dn) cdo);
            cdo = dnVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = cdo;
        this.alertDetailsCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCrash(dq dqVar) {
        Objects.requireNonNull(dqVar);
        if (this.alertDetailsCase_ == 3 && this.alertDetails_ != dq.getDefaultInstance()) {
            dp dpVarNewBuilder = dq.newBuilder((dq) this.alertDetails_);
            dpVarNewBuilder.mergeFrom((dp) dqVar);
            dqVar = dpVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = dqVar;
        this.alertDetailsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCrashProne(ds dsVar) {
        Objects.requireNonNull(dsVar);
        if (this.alertDetailsCase_ == 11 && this.alertDetails_ != ds.getDefaultInstance()) {
            dr drVarNewBuilder = ds.newBuilder((ds) this.alertDetails_);
            drVarNewBuilder.mergeFrom((dr) dsVar);
            dsVar = drVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = dsVar;
        this.alertDetailsCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHazardOnRoad(du duVar) {
        Objects.requireNonNull(duVar);
        if (this.alertDetailsCase_ == 4 && this.alertDetails_ != du.getDefaultInstance()) {
            dt dtVarNewBuilder = du.newBuilder((du) this.alertDetails_);
            dtVarNewBuilder.mergeFrom((dt) duVar);
            duVar = dtVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = duVar;
        this.alertDetailsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePermanentHazard(dw dwVar) {
        Objects.requireNonNull(dwVar);
        if (this.alertDetailsCase_ == 7 && this.alertDetails_ != dw.getDefaultInstance()) {
            dv dvVarNewBuilder = dw.newBuilder((dw) this.alertDetails_);
            dvVarNewBuilder.mergeFrom((dv) dwVar);
            dwVar = dvVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = dwVar;
        this.alertDetailsCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePersonalSafety(dy dyVar) {
        Objects.requireNonNull(dyVar);
        if (this.alertDetailsCase_ == 12 && this.alertDetails_ != dy.getDefaultInstance()) {
            dx dxVarNewBuilder = dy.newBuilder((dy) this.alertDetails_);
            dxVarNewBuilder.mergeFrom((dx) dyVar);
            dyVar = dxVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = dyVar;
        this.alertDetailsCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePolice(ea eaVar) {
        Objects.requireNonNull(eaVar);
        if (this.alertDetailsCase_ == 2 && this.alertDetails_ != ea.getDefaultInstance()) {
            dz dzVarNewBuilder = ea.newBuilder((ea) this.alertDetails_);
            dzVarNewBuilder.mergeFrom((dz) eaVar);
            eaVar = dzVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = eaVar;
        this.alertDetailsCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpeedLimitDecrease(ec ecVar) {
        Objects.requireNonNull(ecVar);
        if (this.alertDetailsCase_ == 9 && this.alertDetails_ != ec.getDefaultInstance()) {
            eb ebVarNewBuilder = ec.newBuilder((ec) this.alertDetails_);
            ebVarNewBuilder.mergeFrom((eb) ecVar);
            ecVar = ebVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = ecVar;
        this.alertDetailsCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTraffic(ee eeVar) {
        Objects.requireNonNull(eeVar);
        if (this.alertDetailsCase_ == 1 && this.alertDetails_ != ee.getDefaultInstance()) {
            ed edVarNewBuilder = ee.newBuilder((ee) this.alertDetails_);
            edVarNewBuilder.mergeFrom((ed) eeVar);
            eeVar = edVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = eeVar;
        this.alertDetailsCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTurnClosure(eg egVar) {
        Objects.requireNonNull(egVar);
        if (this.alertDetailsCase_ == 10 && this.alertDetails_ != eg.getDefaultInstance()) {
            ef efVarNewBuilder = eg.newBuilder((eg) this.alertDetails_);
            efVarNewBuilder.mergeFrom((ef) egVar);
            egVar = efVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = egVar;
        this.alertDetailsCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWeather(ei eiVar) {
        Objects.requireNonNull(eiVar);
        if (this.alertDetailsCase_ == 5 && this.alertDetails_ != ei.getDefaultInstance()) {
            eh ehVarNewBuilder = ei.newBuilder((ei) this.alertDetails_);
            ehVarNewBuilder.mergeFrom((eh) eiVar);
            eiVar = ehVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = eiVar;
        this.alertDetailsCase_ = 5;
    }

    public static dk newBuilder() {
        return (dk) DEFAULT_INSTANCE.createBuilder();
    }

    public static ej parseDelimitedFrom(InputStream inputStream) {
        return (ej) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ej parseFrom(com.google.v.v vVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ej> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimal(dh dhVar) {
        Objects.requireNonNull(dhVar);
        this.alertDetails_ = dhVar;
        this.alertDetailsCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlockedLane(dj djVar) {
        Objects.requireNonNull(djVar);
        this.alertDetails_ = djVar;
        this.alertDetailsCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCamera(dm dmVar) {
        Objects.requireNonNull(dmVar);
        this.alertDetails_ = dmVar;
        this.alertDetailsCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosure(Cdo cdo) {
        Objects.requireNonNull(cdo);
        this.alertDetails_ = cdo;
        this.alertDetailsCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrash(dq dqVar) {
        Objects.requireNonNull(dqVar);
        this.alertDetails_ = dqVar;
        this.alertDetailsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrashProne(ds dsVar) {
        Objects.requireNonNull(dsVar);
        this.alertDetails_ = dsVar;
        this.alertDetailsCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHazardOnRoad(du duVar) {
        Objects.requireNonNull(duVar);
        this.alertDetails_ = duVar;
        this.alertDetailsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermanentHazard(dw dwVar) {
        Objects.requireNonNull(dwVar);
        this.alertDetails_ = dwVar;
        this.alertDetailsCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersonalSafety(dy dyVar) {
        Objects.requireNonNull(dyVar);
        this.alertDetails_ = dyVar;
        this.alertDetailsCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolice(ea eaVar) {
        Objects.requireNonNull(eaVar);
        this.alertDetails_ = eaVar;
        this.alertDetailsCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedLimitDecrease(ec ecVar) {
        Objects.requireNonNull(ecVar);
        this.alertDetails_ = ecVar;
        this.alertDetailsCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraffic(ee eeVar) {
        Objects.requireNonNull(eeVar);
        this.alertDetails_ = eeVar;
        this.alertDetailsCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTurnClosure(eg egVar) {
        Objects.requireNonNull(egVar);
        this.alertDetails_ = egVar;
        this.alertDetailsCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeather(ei eiVar) {
        Objects.requireNonNull(eiVar);
        this.alertDetails_ = eiVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0001\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"alertDetails_", "alertDetailsCase_", ee.class, ea.class, dq.class, du.class, ei.class, dj.class, dw.class, Cdo.class, ec.class, eg.class, ds.class, dy.class, dm.class, dh.class});
        }
        if (iOrdinal == 3) {
            return new ej();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ej> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ej.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public df getAlertDetailsCase() {
        switch (this.alertDetailsCase_) {
            case 0:
                return df.o;
            case 1:
                return df.f16542a;
            case 2:
                return df.f16543b;
            case 3:
                return df.f16544c;
            case 4:
                return df.f16545d;
            case 5:
                return df.f16546e;
            case 6:
                return df.f16547f;
            case 7:
                return df.f16548g;
            case 8:
                return df.f16549h;
            case 9:
                return df.f16550i;
            case 10:
                return df.f16551j;
            case 11:
                return df.f16552k;
            case 12:
                return df.f16553l;
            case 13:
                return df.m;
            case 14:
                return df.n;
            default:
                return null;
        }
    }

    public dh getAnimal() {
        return this.alertDetailsCase_ == 14 ? (dh) this.alertDetails_ : dh.getDefaultInstance();
    }

    public dj getBlockedLane() {
        return this.alertDetailsCase_ == 6 ? (dj) this.alertDetails_ : dj.getDefaultInstance();
    }

    public dm getCamera() {
        return this.alertDetailsCase_ == 13 ? (dm) this.alertDetails_ : dm.getDefaultInstance();
    }

    public Cdo getClosure() {
        return this.alertDetailsCase_ == 8 ? (Cdo) this.alertDetails_ : Cdo.getDefaultInstance();
    }

    public dq getCrash() {
        return this.alertDetailsCase_ == 3 ? (dq) this.alertDetails_ : dq.getDefaultInstance();
    }

    public ds getCrashProne() {
        return this.alertDetailsCase_ == 11 ? (ds) this.alertDetails_ : ds.getDefaultInstance();
    }

    public du getHazardOnRoad() {
        return this.alertDetailsCase_ == 4 ? (du) this.alertDetails_ : du.getDefaultInstance();
    }

    public dw getPermanentHazard() {
        return this.alertDetailsCase_ == 7 ? (dw) this.alertDetails_ : dw.getDefaultInstance();
    }

    public dy getPersonalSafety() {
        return this.alertDetailsCase_ == 12 ? (dy) this.alertDetails_ : dy.getDefaultInstance();
    }

    public ea getPolice() {
        return this.alertDetailsCase_ == 2 ? (ea) this.alertDetails_ : ea.getDefaultInstance();
    }

    public ec getSpeedLimitDecrease() {
        return this.alertDetailsCase_ == 9 ? (ec) this.alertDetails_ : ec.getDefaultInstance();
    }

    public ee getTraffic() {
        return this.alertDetailsCase_ == 1 ? (ee) this.alertDetails_ : ee.getDefaultInstance();
    }

    public eg getTurnClosure() {
        return this.alertDetailsCase_ == 10 ? (eg) this.alertDetails_ : eg.getDefaultInstance();
    }

    public ei getWeather() {
        return this.alertDetailsCase_ == 5 ? (ei) this.alertDetails_ : ei.getDefaultInstance();
    }

    public boolean hasAnimal() {
        return this.alertDetailsCase_ == 14;
    }

    public boolean hasBlockedLane() {
        return this.alertDetailsCase_ == 6;
    }

    public boolean hasCamera() {
        return this.alertDetailsCase_ == 13;
    }

    public boolean hasClosure() {
        return this.alertDetailsCase_ == 8;
    }

    public boolean hasCrash() {
        return this.alertDetailsCase_ == 3;
    }

    public boolean hasCrashProne() {
        return this.alertDetailsCase_ == 11;
    }

    public boolean hasHazardOnRoad() {
        return this.alertDetailsCase_ == 4;
    }

    public boolean hasPermanentHazard() {
        return this.alertDetailsCase_ == 7;
    }

    public boolean hasPersonalSafety() {
        return this.alertDetailsCase_ == 12;
    }

    public boolean hasPolice() {
        return this.alertDetailsCase_ == 2;
    }

    public boolean hasSpeedLimitDecrease() {
        return this.alertDetailsCase_ == 9;
    }

    public boolean hasTraffic() {
        return this.alertDetailsCase_ == 1;
    }

    public boolean hasTurnClosure() {
        return this.alertDetailsCase_ == 10;
    }

    public boolean hasWeather() {
        return this.alertDetailsCase_ == 5;
    }

    public static dk newBuilder(ej ejVar) {
        return (dk) DEFAULT_INSTANCE.createBuilder(ejVar);
    }

    public static ej parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ej) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ej parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ej parseFrom(com.google.v.z zVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ej parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ej parseFrom(InputStream inputStream) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ej parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ej parseFrom(ByteBuffer byteBuffer) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ej parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ej parseFrom(byte[] bArr) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ej parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
