package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s extends com.google.v.du<s, k> implements com.google.v.fj {
    public static final int BEGIN_NAVIGATION_FIELD_NUMBER = 2;
    private static final s DEFAULT_INSTANCE;
    public static final int ERROR_RECOVERY_FIELD_NUMBER = 5;
    public static final int OFFLINE_RECOVERY_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<s> PARSER = null;
    public static final int RESUME_NAVIGATION_FIELD_NUMBER = 3;
    public static final int ROUTE_CALCULATION_PARAMS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int flowCase_ = 0;
    private Object flow_;
    private gq routeCalculationParams_;

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        com.google.v.du.registerDefaultInstance(s.class, sVar);
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeginNavigation() {
        if (this.flowCase_ == 2) {
            this.flowCase_ = 0;
            this.flow_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorRecovery() {
        if (this.flowCase_ == 5) {
            this.flowCase_ = 0;
            this.flow_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlow() {
        this.flowCase_ = 0;
        this.flow_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOfflineRecovery() {
        if (this.flowCase_ == 4) {
            this.flowCase_ = 0;
            this.flow_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeNavigation() {
        if (this.flowCase_ == 3) {
            this.flowCase_ = 0;
            this.flow_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteCalculationParams() {
        this.routeCalculationParams_ = null;
        this.bitField0_ &= -2;
    }

    public static s getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBeginNavigation(j jVar) {
        Objects.requireNonNull(jVar);
        if (this.flowCase_ == 2 && this.flow_ != j.getDefaultInstance()) {
            i iVarNewBuilder = j.newBuilder((j) this.flow_);
            iVarNewBuilder.mergeFrom((i) jVar);
            jVar = iVarNewBuilder.buildPartial();
        }
        this.flow_ = jVar;
        this.flowCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeErrorRecovery(m mVar) {
        Objects.requireNonNull(mVar);
        if (this.flowCase_ == 5 && this.flow_ != m.getDefaultInstance()) {
            l lVarNewBuilder = m.newBuilder((m) this.flow_);
            lVarNewBuilder.mergeFrom((l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.flow_ = mVar;
        this.flowCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOfflineRecovery(p pVar) {
        Objects.requireNonNull(pVar);
        if (this.flowCase_ == 4 && this.flow_ != p.getDefaultInstance()) {
            o oVarNewBuilder = p.newBuilder((p) this.flow_);
            oVarNewBuilder.mergeFrom((o) pVar);
            pVar = oVarNewBuilder.buildPartial();
        }
        this.flow_ = pVar;
        this.flowCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResumeNavigation(r rVar) {
        Objects.requireNonNull(rVar);
        if (this.flowCase_ == 3 && this.flow_ != r.getDefaultInstance()) {
            q qVarNewBuilder = r.newBuilder((r) this.flow_);
            qVarNewBuilder.mergeFrom((q) rVar);
            rVar = qVarNewBuilder.buildPartial();
        }
        this.flow_ = rVar;
        this.flowCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteCalculationParams(gq gqVar) {
        Objects.requireNonNull(gqVar);
        gq gqVar2 = this.routeCalculationParams_;
        if (gqVar2 != null && gqVar2 != gq.getDefaultInstance()) {
            gp gpVarNewBuilder = gq.newBuilder(gqVar2);
            gpVarNewBuilder.mergeFrom((gp) gqVar);
            gqVar = gpVarNewBuilder.buildPartial();
        }
        this.routeCalculationParams_ = gqVar;
        this.bitField0_ |= 1;
    }

    public static k newBuilder() {
        return (k) DEFAULT_INSTANCE.createBuilder();
    }

    public static s parseDelimitedFrom(InputStream inputStream) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(com.google.v.v vVar) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<s> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeginNavigation(j jVar) {
        Objects.requireNonNull(jVar);
        this.flow_ = jVar;
        this.flowCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorRecovery(m mVar) {
        Objects.requireNonNull(mVar);
        this.flow_ = mVar;
        this.flowCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfflineRecovery(p pVar) {
        Objects.requireNonNull(pVar);
        this.flow_ = pVar;
        this.flowCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeNavigation(r rVar) {
        Objects.requireNonNull(rVar);
        this.flow_ = rVar;
        this.flowCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteCalculationParams(gq gqVar) {
        Objects.requireNonNull(gqVar);
        this.routeCalculationParams_ = gqVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"flow_", "flowCase_", "bitField0_", "routeCalculationParams_", j.class, r.class, p.class, m.class});
        }
        if (iOrdinal == 3) {
            return new s();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new k(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<s> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (s.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public j getBeginNavigation() {
        return this.flowCase_ == 2 ? (j) this.flow_ : j.getDefaultInstance();
    }

    public m getErrorRecovery() {
        return this.flowCase_ == 5 ? (m) this.flow_ : m.getDefaultInstance();
    }

    public n getFlowCase() {
        int i2 = this.flowCase_;
        if (i2 == 0) {
            return n.f16734e;
        }
        if (i2 == 2) {
            return n.f16730a;
        }
        if (i2 == 3) {
            return n.f16731b;
        }
        if (i2 == 4) {
            return n.f16732c;
        }
        if (i2 != 5) {
            return null;
        }
        return n.f16733d;
    }

    public p getOfflineRecovery() {
        return this.flowCase_ == 4 ? (p) this.flow_ : p.getDefaultInstance();
    }

    public r getResumeNavigation() {
        return this.flowCase_ == 3 ? (r) this.flow_ : r.getDefaultInstance();
    }

    public gq getRouteCalculationParams() {
        gq gqVar = this.routeCalculationParams_;
        return gqVar == null ? gq.getDefaultInstance() : gqVar;
    }

    public boolean hasBeginNavigation() {
        return this.flowCase_ == 2;
    }

    public boolean hasErrorRecovery() {
        return this.flowCase_ == 5;
    }

    public boolean hasOfflineRecovery() {
        return this.flowCase_ == 4;
    }

    public boolean hasResumeNavigation() {
        return this.flowCase_ == 3;
    }

    public boolean hasRouteCalculationParams() {
        return (this.bitField0_ & 1) != 0;
    }

    public static k newBuilder(s sVar) {
        return (k) DEFAULT_INSTANCE.createBuilder(sVar);
    }

    public static s parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static s parseFrom(com.google.v.z zVar) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static s parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static s parseFrom(InputStream inputStream) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(ByteBuffer byteBuffer) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static s parseFrom(byte[] bArr) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static s parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (s) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
