package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cb extends com.google.v.du<cb, ca> implements com.google.v.fj {
    public static final int CURRENT_ROUTE_UPDATE_FIELD_NUMBER = 1;
    private static final cb DEFAULT_INSTANCE;
    public static final int ERROR_RESULT_FIELD_NUMBER = 6;
    public static final int NEXT_UPDATE_SCHEDULE_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<cb> PARSER = null;
    public static final int REROUTE_SUGGESTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private az currentRouteUpdate_;
    private Cdo errorResult_;
    private gh nextUpdateSchedule_;
    private bx rerouteSuggestion_;

    static {
        cb cbVar = new cb();
        DEFAULT_INSTANCE = cbVar;
        com.google.v.du.registerDefaultInstance(cb.class, cbVar);
    }

    private cb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentRouteUpdate() {
        this.currentRouteUpdate_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorResult() {
        this.errorResult_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextUpdateSchedule() {
        this.nextUpdateSchedule_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRerouteSuggestion() {
        this.rerouteSuggestion_ = null;
        this.bitField0_ &= -3;
    }

    public static cb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurrentRouteUpdate(az azVar) {
        Objects.requireNonNull(azVar);
        az azVar2 = this.currentRouteUpdate_;
        if (azVar2 != null && azVar2 != az.getDefaultInstance()) {
            ay ayVarNewBuilder = az.newBuilder(azVar2);
            ayVarNewBuilder.mergeFrom((ay) azVar);
            azVar = ayVarNewBuilder.buildPartial();
        }
        this.currentRouteUpdate_ = azVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeErrorResult(Cdo cdo) {
        Objects.requireNonNull(cdo);
        Cdo cdo2 = this.errorResult_;
        if (cdo2 != null && cdo2 != Cdo.getDefaultInstance()) {
            dg dgVarNewBuilder = Cdo.newBuilder(cdo2);
            dgVarNewBuilder.mergeFrom((dg) cdo);
            cdo = dgVarNewBuilder.buildPartial();
        }
        this.errorResult_ = cdo;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNextUpdateSchedule(gh ghVar) {
        Objects.requireNonNull(ghVar);
        gh ghVar2 = this.nextUpdateSchedule_;
        if (ghVar2 != null && ghVar2 != gh.getDefaultInstance()) {
            gg ggVarNewBuilder = gh.newBuilder(ghVar2);
            ggVarNewBuilder.mergeFrom((gg) ghVar);
            ghVar = ggVarNewBuilder.buildPartial();
        }
        this.nextUpdateSchedule_ = ghVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRerouteSuggestion(bx bxVar) {
        Objects.requireNonNull(bxVar);
        bx bxVar2 = this.rerouteSuggestion_;
        if (bxVar2 != null && bxVar2 != bx.getDefaultInstance()) {
            bm bmVarNewBuilder = bx.newBuilder(bxVar2);
            bmVarNewBuilder.mergeFrom((bm) bxVar);
            bxVar = bmVarNewBuilder.buildPartial();
        }
        this.rerouteSuggestion_ = bxVar;
        this.bitField0_ |= 2;
    }

    public static ca newBuilder() {
        return (ca) DEFAULT_INSTANCE.createBuilder();
    }

    public static cb parseDelimitedFrom(InputStream inputStream) {
        return (cb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cb parseFrom(com.google.v.v vVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentRouteUpdate(az azVar) {
        Objects.requireNonNull(azVar);
        this.currentRouteUpdate_ = azVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorResult(Cdo cdo) {
        Objects.requireNonNull(cdo);
        this.errorResult_ = cdo;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextUpdateSchedule(gh ghVar) {
        Objects.requireNonNull(ghVar);
        this.nextUpdateSchedule_ = ghVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRerouteSuggestion(bx bxVar) {
        Objects.requireNonNull(bxVar);
        this.rerouteSuggestion_ = bxVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0006ဉ\u0003", new Object[]{"bitField0_", "currentRouteUpdate_", "rerouteSuggestion_", "nextUpdateSchedule_", "errorResult_"});
        }
        if (iOrdinal == 3) {
            return new cb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ca(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public az getCurrentRouteUpdate() {
        az azVar = this.currentRouteUpdate_;
        return azVar == null ? az.getDefaultInstance() : azVar;
    }

    public Cdo getErrorResult() {
        Cdo cdo = this.errorResult_;
        return cdo == null ? Cdo.getDefaultInstance() : cdo;
    }

    public gh getNextUpdateSchedule() {
        gh ghVar = this.nextUpdateSchedule_;
        return ghVar == null ? gh.getDefaultInstance() : ghVar;
    }

    public bx getRerouteSuggestion() {
        bx bxVar = this.rerouteSuggestion_;
        return bxVar == null ? bx.getDefaultInstance() : bxVar;
    }

    public boolean hasCurrentRouteUpdate() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasErrorResult() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasNextUpdateSchedule() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRerouteSuggestion() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ca newBuilder(cb cbVar) {
        return (ca) DEFAULT_INSTANCE.createBuilder(cbVar);
    }

    public static cb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cb parseFrom(com.google.v.z zVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cb parseFrom(InputStream inputStream) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cb parseFrom(ByteBuffer byteBuffer) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cb parseFrom(byte[] bArr) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
