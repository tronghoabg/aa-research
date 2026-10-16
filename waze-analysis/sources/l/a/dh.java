package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class dh extends com.google.v.du<dh, df> implements com.google.v.fj {
    public static final int ALTERNATIVE_ROUTES_BLOCKING_POPUP_CLICKED_FIELD_NUMBER = 3;
    public static final int ALTERNATIVE_ROUTES_BLOCKING_POPUP_SHOWN_FIELD_NUMBER = 4;
    public static final int ALTERNATIVE_ROUTES_FTE_TOOLTIP_SHOWN_FIELD_NUMBER = 10;
    public static final int ALTERNATIVE_ROUTES_LOADER_HIDDEN_FIELD_NUMBER = 7;
    public static final int ALTERNATIVE_ROUTES_SCREEN_CLICKED_FIELD_NUMBER = 9;
    public static final int ALTERNATIVE_ROUTES_SCREEN_MODE_UPDATED_FIELD_NUMBER = 11;
    public static final int ALTERNATIVE_ROUTES_SCREEN_SHOWN_FIELD_NUMBER = 5;
    public static final int ALTERNATIVE_ROUTES_SHOWN_FIELD_NUMBER = 8;
    private static final dh DEFAULT_INSTANCE;
    public static final int IN_CAR_ALTERNATIVE_ROUTES_BUTTON_CLICKED_FIELD_NUMBER = 6;
    private static volatile com.google.v.fo<dh> PARSER = null;
    public static final int ROUTES_SCREEN_CLICKED_FIELD_NUMBER = 1;
    public static final int ROUTES_SCREEN_SHOWN_FIELD_NUMBER = 2;
    public static final int ROUTE_CARD_TIMELINE_SHOWN_FIELD_NUMBER = 12;
    private int statCase_ = 0;
    private Object stat_;

    static {
        dh dhVar = new dh();
        DEFAULT_INSTANCE = dhVar;
        com.google.v.du.registerDefaultInstance(dh.class, dhVar);
    }

    private dh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRoutesBlockingPopupClicked() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRoutesBlockingPopupShown() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRoutesFteTooltipShown() {
        if (this.statCase_ == 10) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRoutesLoaderHidden() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRoutesScreenClicked() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRoutesScreenModeUpdated() {
        if (this.statCase_ == 11) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRoutesScreenShown() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRoutesShown() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarAlternativeRoutesButtonClicked() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteCardTimelineShown() {
        if (this.statCase_ == 12) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutesScreenClicked() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutesScreenShown() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static dh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlternativeRoutesBlockingPopupClicked(Cdo cdo) {
        Objects.requireNonNull(cdo);
        if (this.statCase_ == 3 && this.stat_ != Cdo.getDefaultInstance()) {
            dn dnVarNewBuilder = Cdo.newBuilder((Cdo) this.stat_);
            dnVarNewBuilder.mergeFrom((dn) cdo);
            cdo = dnVarNewBuilder.buildPartial();
        }
        this.stat_ = cdo;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlternativeRoutesBlockingPopupShown(dq dqVar) {
        Objects.requireNonNull(dqVar);
        if (this.statCase_ == 4 && this.stat_ != dq.getDefaultInstance()) {
            dp dpVarNewBuilder = dq.newBuilder((dq) this.stat_);
            dpVarNewBuilder.mergeFrom((dp) dqVar);
            dqVar = dpVarNewBuilder.buildPartial();
        }
        this.stat_ = dqVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlternativeRoutesFteTooltipShown(ds dsVar) {
        Objects.requireNonNull(dsVar);
        if (this.statCase_ == 10 && this.stat_ != ds.getDefaultInstance()) {
            dr drVarNewBuilder = ds.newBuilder((ds) this.stat_);
            drVarNewBuilder.mergeFrom((dr) dsVar);
            dsVar = drVarNewBuilder.buildPartial();
        }
        this.stat_ = dsVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlternativeRoutesLoaderHidden(du duVar) {
        Objects.requireNonNull(duVar);
        if (this.statCase_ == 7 && this.stat_ != du.getDefaultInstance()) {
            dt dtVarNewBuilder = du.newBuilder((du) this.stat_);
            dtVarNewBuilder.mergeFrom((dt) duVar);
            duVar = dtVarNewBuilder.buildPartial();
        }
        this.stat_ = duVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlternativeRoutesScreenClicked(dy dyVar) {
        Objects.requireNonNull(dyVar);
        if (this.statCase_ == 9 && this.stat_ != dy.getDefaultInstance()) {
            dx dxVarNewBuilder = dy.newBuilder((dy) this.stat_);
            dxVarNewBuilder.mergeFrom((dx) dyVar);
            dyVar = dxVarNewBuilder.buildPartial();
        }
        this.stat_ = dyVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlternativeRoutesScreenModeUpdated(ec ecVar) {
        Objects.requireNonNull(ecVar);
        if (this.statCase_ == 11 && this.stat_ != ec.getDefaultInstance()) {
            dz dzVarNewBuilder = ec.newBuilder((ec) this.stat_);
            dzVarNewBuilder.mergeFrom((dz) ecVar);
            ecVar = dzVarNewBuilder.buildPartial();
        }
        this.stat_ = ecVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlternativeRoutesScreenShown(ee eeVar) {
        Objects.requireNonNull(eeVar);
        if (this.statCase_ == 5 && this.stat_ != ee.getDefaultInstance()) {
            ed edVarNewBuilder = ee.newBuilder((ee) this.stat_);
            edVarNewBuilder.mergeFrom((ed) eeVar);
            eeVar = edVarNewBuilder.buildPartial();
        }
        this.stat_ = eeVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlternativeRoutesShown(eh ehVar) {
        Objects.requireNonNull(ehVar);
        if (this.statCase_ == 8 && this.stat_ != eh.getDefaultInstance()) {
            ef efVarNewBuilder = eh.newBuilder((eh) this.stat_);
            efVarNewBuilder.mergeFrom((ef) ehVar);
            ehVar = efVarNewBuilder.buildPartial();
        }
        this.stat_ = ehVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInCarAlternativeRoutesButtonClicked(abv abvVar) {
        Objects.requireNonNull(abvVar);
        if (this.statCase_ == 6 && this.stat_ != abv.getDefaultInstance()) {
            abu abuVarNewBuilder = abv.newBuilder((abv) this.stat_);
            abuVarNewBuilder.mergeFrom((abu) abvVar);
            abvVar = abuVarNewBuilder.buildPartial();
        }
        this.stat_ = abvVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteCardTimelineShown(awa awaVar) {
        Objects.requireNonNull(awaVar);
        if (this.statCase_ == 12 && this.stat_ != awa.getDefaultInstance()) {
            avz avzVarNewBuilder = awa.newBuilder((awa) this.stat_);
            avzVarNewBuilder.mergeFrom((avz) awaVar);
            awaVar = avzVarNewBuilder.buildPartial();
        }
        this.stat_ = awaVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoutesScreenClicked(awq awqVar) {
        Objects.requireNonNull(awqVar);
        if (this.statCase_ == 1 && this.stat_ != awq.getDefaultInstance()) {
            awp awpVarNewBuilder = awq.newBuilder((awq) this.stat_);
            awpVarNewBuilder.mergeFrom((awp) awqVar);
            awqVar = awpVarNewBuilder.buildPartial();
        }
        this.stat_ = awqVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoutesScreenShown(aws awsVar) {
        Objects.requireNonNull(awsVar);
        if (this.statCase_ == 2 && this.stat_ != aws.getDefaultInstance()) {
            awr awrVarNewBuilder = aws.newBuilder((aws) this.stat_);
            awrVarNewBuilder.mergeFrom((awr) awsVar);
            awsVar = awrVarNewBuilder.buildPartial();
        }
        this.stat_ = awsVar;
        this.statCase_ = 2;
    }

    public static df newBuilder() {
        return (df) DEFAULT_INSTANCE.createBuilder();
    }

    public static dh parseDelimitedFrom(InputStream inputStream) {
        return (dh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dh parseFrom(com.google.v.v vVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRoutesBlockingPopupClicked(Cdo cdo) {
        Objects.requireNonNull(cdo);
        this.stat_ = cdo;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRoutesBlockingPopupShown(dq dqVar) {
        Objects.requireNonNull(dqVar);
        this.stat_ = dqVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRoutesFteTooltipShown(ds dsVar) {
        Objects.requireNonNull(dsVar);
        this.stat_ = dsVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRoutesLoaderHidden(du duVar) {
        Objects.requireNonNull(duVar);
        this.stat_ = duVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRoutesScreenClicked(dy dyVar) {
        Objects.requireNonNull(dyVar);
        this.stat_ = dyVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRoutesScreenModeUpdated(ec ecVar) {
        Objects.requireNonNull(ecVar);
        this.stat_ = ecVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRoutesScreenShown(ee eeVar) {
        Objects.requireNonNull(eeVar);
        this.stat_ = eeVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRoutesShown(eh ehVar) {
        Objects.requireNonNull(ehVar);
        this.stat_ = ehVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarAlternativeRoutesButtonClicked(abv abvVar) {
        Objects.requireNonNull(abvVar);
        this.stat_ = abvVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteCardTimelineShown(awa awaVar) {
        Objects.requireNonNull(awaVar);
        this.stat_ = awaVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutesScreenClicked(awq awqVar) {
        Objects.requireNonNull(awqVar);
        this.stat_ = awqVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutesScreenShown(aws awsVar) {
        Objects.requireNonNull(awsVar);
        this.stat_ = awsVar;
        this.statCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0001\u0000\u0001\f\f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000", new Object[]{"stat_", "statCase_", awq.class, aws.class, Cdo.class, dq.class, ee.class, abv.class, du.class, eh.class, dy.class, ds.class, ec.class, awa.class});
        }
        if (iOrdinal == 3) {
            return new dh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new df(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public Cdo getAlternativeRoutesBlockingPopupClicked() {
        return this.statCase_ == 3 ? (Cdo) this.stat_ : Cdo.getDefaultInstance();
    }

    public dq getAlternativeRoutesBlockingPopupShown() {
        return this.statCase_ == 4 ? (dq) this.stat_ : dq.getDefaultInstance();
    }

    public ds getAlternativeRoutesFteTooltipShown() {
        return this.statCase_ == 10 ? (ds) this.stat_ : ds.getDefaultInstance();
    }

    public du getAlternativeRoutesLoaderHidden() {
        return this.statCase_ == 7 ? (du) this.stat_ : du.getDefaultInstance();
    }

    public dy getAlternativeRoutesScreenClicked() {
        return this.statCase_ == 9 ? (dy) this.stat_ : dy.getDefaultInstance();
    }

    public ec getAlternativeRoutesScreenModeUpdated() {
        return this.statCase_ == 11 ? (ec) this.stat_ : ec.getDefaultInstance();
    }

    public ee getAlternativeRoutesScreenShown() {
        return this.statCase_ == 5 ? (ee) this.stat_ : ee.getDefaultInstance();
    }

    public eh getAlternativeRoutesShown() {
        return this.statCase_ == 8 ? (eh) this.stat_ : eh.getDefaultInstance();
    }

    public abv getInCarAlternativeRoutesButtonClicked() {
        return this.statCase_ == 6 ? (abv) this.stat_ : abv.getDefaultInstance();
    }

    public awa getRouteCardTimelineShown() {
        return this.statCase_ == 12 ? (awa) this.stat_ : awa.getDefaultInstance();
    }

    public awq getRoutesScreenClicked() {
        return this.statCase_ == 1 ? (awq) this.stat_ : awq.getDefaultInstance();
    }

    public aws getRoutesScreenShown() {
        return this.statCase_ == 2 ? (aws) this.stat_ : aws.getDefaultInstance();
    }

    public dg getStatCase() {
        switch (this.statCase_) {
            case 0:
                return dg.m;
            case 1:
                return dg.f54776a;
            case 2:
                return dg.f54777b;
            case 3:
                return dg.f54778c;
            case 4:
                return dg.f54779d;
            case 5:
                return dg.f54780e;
            case 6:
                return dg.f54781f;
            case 7:
                return dg.f54782g;
            case 8:
                return dg.f54783h;
            case 9:
                return dg.f54784i;
            case 10:
                return dg.f54785j;
            case 11:
                return dg.f54786k;
            case 12:
                return dg.f54787l;
            default:
                return null;
        }
    }

    public boolean hasAlternativeRoutesBlockingPopupClicked() {
        return this.statCase_ == 3;
    }

    public boolean hasAlternativeRoutesBlockingPopupShown() {
        return this.statCase_ == 4;
    }

    public boolean hasAlternativeRoutesFteTooltipShown() {
        return this.statCase_ == 10;
    }

    public boolean hasAlternativeRoutesLoaderHidden() {
        return this.statCase_ == 7;
    }

    public boolean hasAlternativeRoutesScreenClicked() {
        return this.statCase_ == 9;
    }

    public boolean hasAlternativeRoutesScreenModeUpdated() {
        return this.statCase_ == 11;
    }

    public boolean hasAlternativeRoutesScreenShown() {
        return this.statCase_ == 5;
    }

    public boolean hasAlternativeRoutesShown() {
        return this.statCase_ == 8;
    }

    public boolean hasInCarAlternativeRoutesButtonClicked() {
        return this.statCase_ == 6;
    }

    public boolean hasRouteCardTimelineShown() {
        return this.statCase_ == 12;
    }

    public boolean hasRoutesScreenClicked() {
        return this.statCase_ == 1;
    }

    public boolean hasRoutesScreenShown() {
        return this.statCase_ == 2;
    }

    public static df newBuilder(dh dhVar) {
        return (df) DEFAULT_INSTANCE.createBuilder(dhVar);
    }

    public static dh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dh parseFrom(com.google.v.z zVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dh parseFrom(InputStream inputStream) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dh parseFrom(ByteBuffer byteBuffer) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dh parseFrom(byte[] bArr) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
