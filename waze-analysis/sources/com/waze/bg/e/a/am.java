package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class am extends com.google.v.du<am, aa> implements com.google.v.fj {
    public static final int ADD_WAYPOINT_FIELD_NUMBER = 6;
    public static final int CLOSURE_FIELD_NUMBER = 5;
    public static final int CURRENT_ROUTE_UUID_FIELD_NUMBER = 2;
    private static final am DEFAULT_INSTANCE;
    public static final int LEGACY_REROUTE_SUGGESTION_FIELD_NUMBER = 8;
    private static volatile com.google.v.fo<am> PARSER = null;
    public static final int REROUTE_WHEN_NOT_NAVIGATING_FIELD_NUMBER = 7;
    public static final int ROUTE_CALCULATION_PARAMS_FIELD_NUMBER = 1;
    public static final int SETTINGS_CHANGED_FIELD_NUMBER = 4;
    public static final int WRONG_TURN_FIELD_NUMBER = 3;
    private int bitField0_;
    private Object flow_;
    private gq routeCalculationParams_;
    private int flowCase_ = 0;
    private String currentRouteUuid_ = "";

    static {
        am amVar = new am();
        DEFAULT_INSTANCE = amVar;
        com.google.v.du.registerDefaultInstance(am.class, amVar);
    }

    private am() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddWaypoint() {
        if (this.flowCase_ == 6) {
            this.flowCase_ = 0;
            this.flow_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosure() {
        if (this.flowCase_ == 5) {
            this.flowCase_ = 0;
            this.flow_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentRouteUuid() {
        this.bitField0_ &= -3;
        this.currentRouteUuid_ = getDefaultInstance().getCurrentRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlow() {
        this.flowCase_ = 0;
        this.flow_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacyRerouteSuggestion() {
        if (this.flowCase_ == 8) {
            this.flowCase_ = 0;
            this.flow_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRerouteWhenNotNavigating() {
        if (this.flowCase_ == 7) {
            this.flowCase_ = 0;
            this.flow_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteCalculationParams() {
        this.routeCalculationParams_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSettingsChanged() {
        if (this.flowCase_ == 4) {
            this.flowCase_ = 0;
            this.flow_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWrongTurn() {
        if (this.flowCase_ == 3) {
            this.flowCase_ = 0;
            this.flow_ = null;
        }
    }

    public static am getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddWaypoint(z zVar) {
        Objects.requireNonNull(zVar);
        if (this.flowCase_ == 6 && this.flow_ != z.getDefaultInstance()) {
            y yVarNewBuilder = z.newBuilder((z) this.flow_);
            yVarNewBuilder.mergeFrom((y) zVar);
            zVar = yVarNewBuilder.buildPartial();
        }
        this.flow_ = zVar;
        this.flowCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClosure(ac acVar) {
        Objects.requireNonNull(acVar);
        if (this.flowCase_ == 5 && this.flow_ != ac.getDefaultInstance()) {
            ab abVarNewBuilder = ac.newBuilder((ac) this.flow_);
            abVarNewBuilder.mergeFrom((ab) acVar);
            acVar = abVarNewBuilder.buildPartial();
        }
        this.flow_ = acVar;
        this.flowCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLegacyRerouteSuggestion(af afVar) {
        Objects.requireNonNull(afVar);
        if (this.flowCase_ == 8 && this.flow_ != af.getDefaultInstance()) {
            ae aeVarNewBuilder = af.newBuilder((af) this.flow_);
            aeVarNewBuilder.mergeFrom((ae) afVar);
            afVar = aeVarNewBuilder.buildPartial();
        }
        this.flow_ = afVar;
        this.flowCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRerouteWhenNotNavigating(ah ahVar) {
        Objects.requireNonNull(ahVar);
        if (this.flowCase_ == 7 && this.flow_ != ah.getDefaultInstance()) {
            ag agVarNewBuilder = ah.newBuilder((ah) this.flow_);
            agVarNewBuilder.mergeFrom((ag) ahVar);
            ahVar = agVarNewBuilder.buildPartial();
        }
        this.flow_ = ahVar;
        this.flowCase_ = 7;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSettingsChanged(aj ajVar) {
        Objects.requireNonNull(ajVar);
        if (this.flowCase_ == 4 && this.flow_ != aj.getDefaultInstance()) {
            ai aiVarNewBuilder = aj.newBuilder((aj) this.flow_);
            aiVarNewBuilder.mergeFrom((ai) ajVar);
            ajVar = aiVarNewBuilder.buildPartial();
        }
        this.flow_ = ajVar;
        this.flowCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWrongTurn(al alVar) {
        Objects.requireNonNull(alVar);
        if (this.flowCase_ == 3 && this.flow_ != al.getDefaultInstance()) {
            ak akVarNewBuilder = al.newBuilder((al) this.flow_);
            akVarNewBuilder.mergeFrom((ak) alVar);
            alVar = akVarNewBuilder.buildPartial();
        }
        this.flow_ = alVar;
        this.flowCase_ = 3;
    }

    public static aa newBuilder() {
        return (aa) DEFAULT_INSTANCE.createBuilder();
    }

    public static am parseDelimitedFrom(InputStream inputStream) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(com.google.v.v vVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<am> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddWaypoint(z zVar) {
        Objects.requireNonNull(zVar);
        this.flow_ = zVar;
        this.flowCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosure(ac acVar) {
        Objects.requireNonNull(acVar);
        this.flow_ = acVar;
        this.flowCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.currentRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentRouteUuidBytes(com.google.v.v vVar) {
        this.currentRouteUuid_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyRerouteSuggestion(af afVar) {
        Objects.requireNonNull(afVar);
        this.flow_ = afVar;
        this.flowCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRerouteWhenNotNavigating(ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.flow_ = ahVar;
        this.flowCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteCalculationParams(gq gqVar) {
        Objects.requireNonNull(gqVar);
        this.routeCalculationParams_ = gqVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSettingsChanged(aj ajVar) {
        Objects.requireNonNull(ajVar);
        this.flow_ = ajVar;
        this.flowCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWrongTurn(al alVar) {
        Objects.requireNonNull(alVar);
        this.flow_ = alVar;
        this.flowCase_ = 3;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"flow_", "flowCase_", "bitField0_", "routeCalculationParams_", "currentRouteUuid_", al.class, aj.class, ac.class, z.class, ah.class, af.class});
        }
        if (iOrdinal == 3) {
            return new am();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aa(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<am> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (am.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public z getAddWaypoint() {
        return this.flowCase_ == 6 ? (z) this.flow_ : z.getDefaultInstance();
    }

    public ac getClosure() {
        return this.flowCase_ == 5 ? (ac) this.flow_ : ac.getDefaultInstance();
    }

    public String getCurrentRouteUuid() {
        return this.currentRouteUuid_;
    }

    public com.google.v.v getCurrentRouteUuidBytes() {
        return com.google.v.v.s(this.currentRouteUuid_);
    }

    public ad getFlowCase() {
        int i2 = this.flowCase_;
        if (i2 == 0) {
            return ad.f16615g;
        }
        switch (i2) {
            case 3:
                return ad.f16609a;
            case 4:
                return ad.f16610b;
            case 5:
                return ad.f16611c;
            case 6:
                return ad.f16612d;
            case 7:
                return ad.f16613e;
            case 8:
                return ad.f16614f;
            default:
                return null;
        }
    }

    public af getLegacyRerouteSuggestion() {
        return this.flowCase_ == 8 ? (af) this.flow_ : af.getDefaultInstance();
    }

    public ah getRerouteWhenNotNavigating() {
        return this.flowCase_ == 7 ? (ah) this.flow_ : ah.getDefaultInstance();
    }

    public gq getRouteCalculationParams() {
        gq gqVar = this.routeCalculationParams_;
        return gqVar == null ? gq.getDefaultInstance() : gqVar;
    }

    public aj getSettingsChanged() {
        return this.flowCase_ == 4 ? (aj) this.flow_ : aj.getDefaultInstance();
    }

    public al getWrongTurn() {
        return this.flowCase_ == 3 ? (al) this.flow_ : al.getDefaultInstance();
    }

    public boolean hasAddWaypoint() {
        return this.flowCase_ == 6;
    }

    public boolean hasClosure() {
        return this.flowCase_ == 5;
    }

    public boolean hasCurrentRouteUuid() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLegacyRerouteSuggestion() {
        return this.flowCase_ == 8;
    }

    public boolean hasRerouteWhenNotNavigating() {
        return this.flowCase_ == 7;
    }

    public boolean hasRouteCalculationParams() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSettingsChanged() {
        return this.flowCase_ == 4;
    }

    public boolean hasWrongTurn() {
        return this.flowCase_ == 3;
    }

    public static aa newBuilder(am amVar) {
        return (aa) DEFAULT_INSTANCE.createBuilder(amVar);
    }

    public static am parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static am parseFrom(com.google.v.z zVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static am parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static am parseFrom(InputStream inputStream) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(ByteBuffer byteBuffer) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static am parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static am parseFrom(byte[] bArr) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static am parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
