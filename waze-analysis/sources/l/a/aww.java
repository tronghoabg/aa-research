package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aww extends com.google.v.du<aww, awu> implements com.google.v.fj {
    public static final int ADD_STOP_POPUP_CLICKED_FIELD_NUMBER = 2;
    public static final int ADD_STOP_POPUP_SHOWN_FIELD_NUMBER = 3;
    public static final int ADD_STOP_REQUESTED_FIELD_NUMBER = 4;
    private static final aww DEFAULT_INSTANCE;
    public static final int NAVIGATE_TO_DANGEROUS_AREA_POPUP_CLICKED_FIELD_NUMBER = 5;
    public static final int OFFLINE_ROUTE_FIELD_NUMBER = 1;
    public static final int ONE_STOP_LIMIT_POPUP_CLICKED_FIELD_NUMBER = 6;
    public static final int ONE_STOP_LIMIT_POPUP_SHOWN_FIELD_NUMBER = 7;
    private static volatile com.google.v.fo<aww> PARSER = null;
    public static final int ROUTE_CHANGED_BUBBLE_DISPLAYED_FIELD_NUMBER = 8;
    public static final int ROUTE_INSTRUMENTATION_ENDED_FIELD_NUMBER = 11;
    public static final int ROUTE_INSTRUMENTATION_STARTED_FIELD_NUMBER = 10;
    public static final int ROUTE_THROUGH_DANGEROUS_AREA_POPUP_CLICKED_FIELD_NUMBER = 9;
    private int statCase_ = 0;
    private Object stat_;

    static {
        aww awwVar = new aww();
        DEFAULT_INSTANCE = awwVar;
        com.google.v.du.registerDefaultInstance(aww.class, awwVar);
    }

    private aww() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddStopPopupClicked() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddStopPopupShown() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddStopRequested() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigateToDangerousAreaPopupClicked() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOfflineRoute() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneStopLimitPopupClicked() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneStopLimitPopupShown() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteChangedBubbleDisplayed() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteInstrumentationEnded() {
        if (this.statCase_ == 11) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteInstrumentationStarted() {
        if (this.statCase_ == 10) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteThroughDangerousAreaPopupClicked() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static aww getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddStopPopupClicked(am amVar) {
        Objects.requireNonNull(amVar);
        if (this.statCase_ == 2 && this.stat_ != am.getDefaultInstance()) {
            al alVarNewBuilder = am.newBuilder((am) this.stat_);
            alVarNewBuilder.mergeFrom((al) amVar);
            amVar = alVarNewBuilder.buildPartial();
        }
        this.stat_ = amVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddStopPopupShown(ao aoVar) {
        Objects.requireNonNull(aoVar);
        if (this.statCase_ == 3 && this.stat_ != ao.getDefaultInstance()) {
            an anVarNewBuilder = ao.newBuilder((ao) this.stat_);
            anVarNewBuilder.mergeFrom((an) aoVar);
            aoVar = anVarNewBuilder.buildPartial();
        }
        this.stat_ = aoVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddStopRequested(aq aqVar) {
        Objects.requireNonNull(aqVar);
        if (this.statCase_ == 4 && this.stat_ != aq.getDefaultInstance()) {
            ap apVarNewBuilder = aq.newBuilder((aq) this.stat_);
            apVarNewBuilder.mergeFrom((ap) aqVar);
            aqVar = apVarNewBuilder.buildPartial();
        }
        this.stat_ = aqVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavigateToDangerousAreaPopupClicked(alz alzVar) {
        Objects.requireNonNull(alzVar);
        if (this.statCase_ == 5 && this.stat_ != alz.getDefaultInstance()) {
            aly alyVarNewBuilder = alz.newBuilder((alz) this.stat_);
            alyVarNewBuilder.mergeFrom((aly) alzVar);
            alzVar = alyVarNewBuilder.buildPartial();
        }
        this.stat_ = alzVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOfflineRoute(aob aobVar) {
        Objects.requireNonNull(aobVar);
        if (this.statCase_ == 1 && this.stat_ != aob.getDefaultInstance()) {
            aoa aoaVarNewBuilder = aob.newBuilder((aob) this.stat_);
            aoaVarNewBuilder.mergeFrom((aoa) aobVar);
            aobVar = aoaVarNewBuilder.buildPartial();
        }
        this.stat_ = aobVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOneStopLimitPopupClicked(aoo aooVar) {
        Objects.requireNonNull(aooVar);
        if (this.statCase_ == 6 && this.stat_ != aoo.getDefaultInstance()) {
            aon aonVarNewBuilder = aoo.newBuilder((aoo) this.stat_);
            aonVarNewBuilder.mergeFrom((aon) aooVar);
            aooVar = aonVarNewBuilder.buildPartial();
        }
        this.stat_ = aooVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOneStopLimitPopupShown(aoq aoqVar) {
        Objects.requireNonNull(aoqVar);
        if (this.statCase_ == 7 && this.stat_ != aoq.getDefaultInstance()) {
            aop aopVarNewBuilder = aoq.newBuilder((aoq) this.stat_);
            aopVarNewBuilder.mergeFrom((aop) aoqVar);
            aoqVar = aopVarNewBuilder.buildPartial();
        }
        this.stat_ = aoqVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteChangedBubbleDisplayed(awc awcVar) {
        Objects.requireNonNull(awcVar);
        if (this.statCase_ == 8 && this.stat_ != awc.getDefaultInstance()) {
            awb awbVarNewBuilder = awc.newBuilder((awc) this.stat_);
            awbVarNewBuilder.mergeFrom((awb) awcVar);
            awcVar = awbVarNewBuilder.buildPartial();
        }
        this.stat_ = awcVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteInstrumentationEnded(awi awiVar) {
        Objects.requireNonNull(awiVar);
        if (this.statCase_ == 11 && this.stat_ != awi.getDefaultInstance()) {
            awh awhVarNewBuilder = awi.newBuilder((awi) this.stat_);
            awhVarNewBuilder.mergeFrom((awh) awiVar);
            awiVar = awhVarNewBuilder.buildPartial();
        }
        this.stat_ = awiVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteInstrumentationStarted(awk awkVar) {
        Objects.requireNonNull(awkVar);
        if (this.statCase_ == 10 && this.stat_ != awk.getDefaultInstance()) {
            awj awjVarNewBuilder = awk.newBuilder((awk) this.stat_);
            awjVarNewBuilder.mergeFrom((awj) awkVar);
            awkVar = awjVarNewBuilder.buildPartial();
        }
        this.stat_ = awkVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteThroughDangerousAreaPopupClicked(awn awnVar) {
        Objects.requireNonNull(awnVar);
        if (this.statCase_ == 9 && this.stat_ != awn.getDefaultInstance()) {
            awm awmVarNewBuilder = awn.newBuilder((awn) this.stat_);
            awmVarNewBuilder.mergeFrom((awm) awnVar);
            awnVar = awmVarNewBuilder.buildPartial();
        }
        this.stat_ = awnVar;
        this.statCase_ = 9;
    }

    public static awu newBuilder() {
        return (awu) DEFAULT_INSTANCE.createBuilder();
    }

    public static aww parseDelimitedFrom(InputStream inputStream) {
        return (aww) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aww parseFrom(com.google.v.v vVar) {
        return (aww) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aww> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddStopPopupClicked(am amVar) {
        Objects.requireNonNull(amVar);
        this.stat_ = amVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddStopPopupShown(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.stat_ = aoVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddStopRequested(aq aqVar) {
        Objects.requireNonNull(aqVar);
        this.stat_ = aqVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigateToDangerousAreaPopupClicked(alz alzVar) {
        Objects.requireNonNull(alzVar);
        this.stat_ = alzVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfflineRoute(aob aobVar) {
        Objects.requireNonNull(aobVar);
        this.stat_ = aobVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneStopLimitPopupClicked(aoo aooVar) {
        Objects.requireNonNull(aooVar);
        this.stat_ = aooVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneStopLimitPopupShown(aoq aoqVar) {
        Objects.requireNonNull(aoqVar);
        this.stat_ = aoqVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteChangedBubbleDisplayed(awc awcVar) {
        Objects.requireNonNull(awcVar);
        this.stat_ = awcVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteInstrumentationEnded(awi awiVar) {
        Objects.requireNonNull(awiVar);
        this.stat_ = awiVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteInstrumentationStarted(awk awkVar) {
        Objects.requireNonNull(awkVar);
        this.stat_ = awkVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteThroughDangerousAreaPopupClicked(awn awnVar) {
        Objects.requireNonNull(awnVar);
        this.stat_ = awnVar;
        this.statCase_ = 9;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", new Object[]{"stat_", "statCase_", aob.class, am.class, ao.class, aq.class, alz.class, aoo.class, aoq.class, awc.class, awn.class, awk.class, awi.class});
        }
        if (iOrdinal == 3) {
            return new aww();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new awu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aww> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aww.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public am getAddStopPopupClicked() {
        return this.statCase_ == 2 ? (am) this.stat_ : am.getDefaultInstance();
    }

    public ao getAddStopPopupShown() {
        return this.statCase_ == 3 ? (ao) this.stat_ : ao.getDefaultInstance();
    }

    public aq getAddStopRequested() {
        return this.statCase_ == 4 ? (aq) this.stat_ : aq.getDefaultInstance();
    }

    public alz getNavigateToDangerousAreaPopupClicked() {
        return this.statCase_ == 5 ? (alz) this.stat_ : alz.getDefaultInstance();
    }

    public aob getOfflineRoute() {
        return this.statCase_ == 1 ? (aob) this.stat_ : aob.getDefaultInstance();
    }

    public aoo getOneStopLimitPopupClicked() {
        return this.statCase_ == 6 ? (aoo) this.stat_ : aoo.getDefaultInstance();
    }

    public aoq getOneStopLimitPopupShown() {
        return this.statCase_ == 7 ? (aoq) this.stat_ : aoq.getDefaultInstance();
    }

    public awc getRouteChangedBubbleDisplayed() {
        return this.statCase_ == 8 ? (awc) this.stat_ : awc.getDefaultInstance();
    }

    public awi getRouteInstrumentationEnded() {
        return this.statCase_ == 11 ? (awi) this.stat_ : awi.getDefaultInstance();
    }

    public awk getRouteInstrumentationStarted() {
        return this.statCase_ == 10 ? (awk) this.stat_ : awk.getDefaultInstance();
    }

    public awn getRouteThroughDangerousAreaPopupClicked() {
        return this.statCase_ == 9 ? (awn) this.stat_ : awn.getDefaultInstance();
    }

    public awv getStatCase() {
        switch (this.statCase_) {
            case 0:
                return awv.f53352l;
            case 1:
                return awv.f53341a;
            case 2:
                return awv.f53342b;
            case 3:
                return awv.f53343c;
            case 4:
                return awv.f53344d;
            case 5:
                return awv.f53345e;
            case 6:
                return awv.f53346f;
            case 7:
                return awv.f53347g;
            case 8:
                return awv.f53348h;
            case 9:
                return awv.f53349i;
            case 10:
                return awv.f53350j;
            case 11:
                return awv.f53351k;
            default:
                return null;
        }
    }

    public boolean hasAddStopPopupClicked() {
        return this.statCase_ == 2;
    }

    public boolean hasAddStopPopupShown() {
        return this.statCase_ == 3;
    }

    public boolean hasAddStopRequested() {
        return this.statCase_ == 4;
    }

    public boolean hasNavigateToDangerousAreaPopupClicked() {
        return this.statCase_ == 5;
    }

    public boolean hasOfflineRoute() {
        return this.statCase_ == 1;
    }

    public boolean hasOneStopLimitPopupClicked() {
        return this.statCase_ == 6;
    }

    public boolean hasOneStopLimitPopupShown() {
        return this.statCase_ == 7;
    }

    public boolean hasRouteChangedBubbleDisplayed() {
        return this.statCase_ == 8;
    }

    public boolean hasRouteInstrumentationEnded() {
        return this.statCase_ == 11;
    }

    public boolean hasRouteInstrumentationStarted() {
        return this.statCase_ == 10;
    }

    public boolean hasRouteThroughDangerousAreaPopupClicked() {
        return this.statCase_ == 9;
    }

    public static awu newBuilder(aww awwVar) {
        return (awu) DEFAULT_INSTANCE.createBuilder(awwVar);
    }

    public static aww parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aww) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aww parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aww) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aww parseFrom(com.google.v.z zVar) {
        return (aww) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aww parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aww) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aww parseFrom(InputStream inputStream) {
        return (aww) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aww parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aww) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aww parseFrom(ByteBuffer byteBuffer) {
        return (aww) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aww parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aww) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aww parseFrom(byte[] bArr) {
        return (aww) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aww parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aww) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
