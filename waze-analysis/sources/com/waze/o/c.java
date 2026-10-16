package com.waze.o;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends du<c, a> implements fj {
    public static final int CALCULATE_ROUTE_RESPONSE_FIELD_NUMBER = 102;
    public static final int CHANGE_VOICE_GUIDANCE_MODE_RESPONSE_FIELD_NUMBER = 103;
    private static final c DEFAULT_INSTANCE;
    public static final int GET_CLOSURE_CANDIDATES_RESPONSE_FIELD_NUMBER = 109;
    private static volatile fo<c> PARSER = null;
    public static final int REPORT_ALERT_RESPONSE_FIELD_NUMBER = 105;
    public static final int REPORT_CLOSURE_RESPONSE_FIELD_NUMBER = 110;
    public static final int REPORT_MAP_ISSUE_RESPONSE_FIELD_NUMBER = 104;
    public static final int SEND_USER_LOGS_RESPONSE_FIELD_NUMBER = 106;
    public static final int START_NAVIGATION_RESPONSE_FIELD_NUMBER = 108;
    public static final int STOP_NAVIGATION_RESPONSE_FIELD_NUMBER = 107;
    public static final int UPDATE_FAVORITE_RESPONSE_FIELD_NUMBER = 101;
    private int resultCase_ = 0;
    private Object result_;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalculateRouteResponse() {
        if (this.resultCase_ == 102) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangeVoiceGuidanceModeResponse() {
        if (this.resultCase_ == 103) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGetClosureCandidatesResponse() {
        if (this.resultCase_ == 109) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportAlertResponse() {
        if (this.resultCase_ == 105) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportClosureResponse() {
        if (this.resultCase_ == 110) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportMapIssueResponse() {
        if (this.resultCase_ == 104) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSendUserLogsResponse() {
        if (this.resultCase_ == 106) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartNavigationResponse() {
        if (this.resultCase_ == 108) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStopNavigationResponse() {
        if (this.resultCase_ == 107) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateFavoriteResponse() {
        if (this.resultCase_ == 101) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCalculateRouteResponse(m mVar) {
        Objects.requireNonNull(mVar);
        if (this.resultCase_ == 102 && this.result_ != m.getDefaultInstance()) {
            l lVarNewBuilder = m.newBuilder((m) this.result_);
            lVarNewBuilder.mergeFrom((l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.result_ = mVar;
        this.resultCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChangeVoiceGuidanceModeResponse(s sVar) {
        Objects.requireNonNull(sVar);
        if (this.resultCase_ == 103 && this.result_ != s.getDefaultInstance()) {
            r rVarNewBuilder = s.newBuilder((s) this.result_);
            rVarNewBuilder.mergeFrom((r) sVar);
            sVar = rVarNewBuilder.buildPartial();
        }
        this.result_ = sVar;
        this.resultCase_ = 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGetClosureCandidatesResponse(com.waze.bm.a.a.m mVar) {
        Objects.requireNonNull(mVar);
        if (this.resultCase_ == 109 && this.result_ != com.waze.bm.a.a.m.getDefaultInstance()) {
            com.waze.bm.a.a.l lVarNewBuilder = com.waze.bm.a.a.m.newBuilder((com.waze.bm.a.a.m) this.result_);
            lVarNewBuilder.mergeFrom((com.waze.bm.a.a.l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.result_ = mVar;
        this.resultCase_ = 109;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportAlertResponse(com.waze.bm.a.a.s sVar) {
        Objects.requireNonNull(sVar);
        if (this.resultCase_ == 105 && this.result_ != com.waze.bm.a.a.s.getDefaultInstance()) {
            com.waze.bm.a.a.r rVarNewBuilder = com.waze.bm.a.a.s.newBuilder((com.waze.bm.a.a.s) this.result_);
            rVarNewBuilder.mergeFrom((com.waze.bm.a.a.r) sVar);
            sVar = rVarNewBuilder.buildPartial();
        }
        this.result_ = sVar;
        this.resultCase_ = 105;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportClosureResponse(com.waze.bm.a.a.w wVar) {
        Objects.requireNonNull(wVar);
        if (this.resultCase_ == 110 && this.result_ != com.waze.bm.a.a.w.getDefaultInstance()) {
            com.waze.bm.a.a.v vVarNewBuilder = com.waze.bm.a.a.w.newBuilder((com.waze.bm.a.a.w) this.result_);
            vVarNewBuilder.mergeFrom((com.waze.bm.a.a.v) wVar);
            wVar = vVarNewBuilder.buildPartial();
        }
        this.result_ = wVar;
        this.resultCase_ = 110;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportMapIssueResponse(com.waze.bm.a.a.aa aaVar) {
        Objects.requireNonNull(aaVar);
        if (this.resultCase_ == 104 && this.result_ != com.waze.bm.a.a.aa.getDefaultInstance()) {
            com.waze.bm.a.a.z zVarNewBuilder = com.waze.bm.a.a.aa.newBuilder((com.waze.bm.a.a.aa) this.result_);
            zVarNewBuilder.mergeFrom((com.waze.bm.a.a.z) aaVar);
            aaVar = zVarNewBuilder.buildPartial();
        }
        this.result_ = aaVar;
        this.resultCase_ = 104;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSendUserLogsResponse(au auVar) {
        Objects.requireNonNull(auVar);
        if (this.resultCase_ == 106 && this.result_ != au.getDefaultInstance()) {
            at atVarNewBuilder = au.newBuilder((au) this.result_);
            atVarNewBuilder.mergeFrom((at) auVar);
            auVar = atVarNewBuilder.buildPartial();
        }
        this.result_ = auVar;
        this.resultCase_ = 106;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartNavigationResponse(bc bcVar) {
        Objects.requireNonNull(bcVar);
        if (this.resultCase_ == 108 && this.result_ != bc.getDefaultInstance()) {
            bb bbVarNewBuilder = bc.newBuilder((bc) this.result_);
            bbVarNewBuilder.mergeFrom((bb) bcVar);
            bcVar = bbVarNewBuilder.buildPartial();
        }
        this.result_ = bcVar;
        this.resultCase_ = 108;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStopNavigationResponse(bg bgVar) {
        Objects.requireNonNull(bgVar);
        if (this.resultCase_ == 107 && this.result_ != bg.getDefaultInstance()) {
            bf bfVarNewBuilder = bg.newBuilder((bg) this.result_);
            bfVarNewBuilder.mergeFrom((bf) bgVar);
            bgVar = bfVarNewBuilder.buildPartial();
        }
        this.result_ = bgVar;
        this.resultCase_ = 107;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateFavoriteResponse(cc ccVar) {
        Objects.requireNonNull(ccVar);
        if (this.resultCase_ == 101 && this.result_ != cc.getDefaultInstance()) {
            cb cbVarNewBuilder = cc.newBuilder((cc) this.result_);
            cbVarNewBuilder.mergeFrom((cb) ccVar);
            ccVar = cbVarNewBuilder.buildPartial();
        }
        this.result_ = ccVar;
        this.resultCase_ = 101;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(com.google.v.v vVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalculateRouteResponse(m mVar) {
        Objects.requireNonNull(mVar);
        this.result_ = mVar;
        this.resultCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeVoiceGuidanceModeResponse(s sVar) {
        Objects.requireNonNull(sVar);
        this.result_ = sVar;
        this.resultCase_ = 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGetClosureCandidatesResponse(com.waze.bm.a.a.m mVar) {
        Objects.requireNonNull(mVar);
        this.result_ = mVar;
        this.resultCase_ = 109;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportAlertResponse(com.waze.bm.a.a.s sVar) {
        Objects.requireNonNull(sVar);
        this.result_ = sVar;
        this.resultCase_ = 105;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportClosureResponse(com.waze.bm.a.a.w wVar) {
        Objects.requireNonNull(wVar);
        this.result_ = wVar;
        this.resultCase_ = 110;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportMapIssueResponse(com.waze.bm.a.a.aa aaVar) {
        Objects.requireNonNull(aaVar);
        this.result_ = aaVar;
        this.resultCase_ = 104;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSendUserLogsResponse(au auVar) {
        Objects.requireNonNull(auVar);
        this.result_ = auVar;
        this.resultCase_ = 106;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartNavigationResponse(bc bcVar) {
        Objects.requireNonNull(bcVar);
        this.result_ = bcVar;
        this.resultCase_ = 108;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStopNavigationResponse(bg bgVar) {
        Objects.requireNonNull(bgVar);
        this.result_ = bgVar;
        this.resultCase_ = 107;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateFavoriteResponse(cc ccVar) {
        Objects.requireNonNull(ccVar);
        this.result_ = ccVar;
        this.resultCase_ = 101;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0001\u0000en\n\u0000\u0000\u0000e<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000", new Object[]{"result_", "resultCase_", cc.class, m.class, s.class, com.waze.bm.a.a.aa.class, com.waze.bm.a.a.s.class, au.class, bg.class, bc.class, com.waze.bm.a.a.m.class, com.waze.bm.a.a.w.class});
        }
        if (iOrdinal == 3) {
            return new c();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<c> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (c.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public m getCalculateRouteResponse() {
        return this.resultCase_ == 102 ? (m) this.result_ : m.getDefaultInstance();
    }

    public s getChangeVoiceGuidanceModeResponse() {
        return this.resultCase_ == 103 ? (s) this.result_ : s.getDefaultInstance();
    }

    public com.waze.bm.a.a.m getGetClosureCandidatesResponse() {
        return this.resultCase_ == 109 ? (com.waze.bm.a.a.m) this.result_ : com.waze.bm.a.a.m.getDefaultInstance();
    }

    public com.waze.bm.a.a.s getReportAlertResponse() {
        return this.resultCase_ == 105 ? (com.waze.bm.a.a.s) this.result_ : com.waze.bm.a.a.s.getDefaultInstance();
    }

    public com.waze.bm.a.a.w getReportClosureResponse() {
        return this.resultCase_ == 110 ? (com.waze.bm.a.a.w) this.result_ : com.waze.bm.a.a.w.getDefaultInstance();
    }

    public com.waze.bm.a.a.aa getReportMapIssueResponse() {
        return this.resultCase_ == 104 ? (com.waze.bm.a.a.aa) this.result_ : com.waze.bm.a.a.aa.getDefaultInstance();
    }

    public b getResultCase() {
        int i2 = this.resultCase_;
        if (i2 == 0) {
            return b.f32645k;
        }
        switch (i2) {
            case 101:
                return b.f32635a;
            case 102:
                return b.f32636b;
            case 103:
                return b.f32637c;
            case 104:
                return b.f32638d;
            case 105:
                return b.f32639e;
            case 106:
                return b.f32640f;
            case 107:
                return b.f32641g;
            case 108:
                return b.f32642h;
            case 109:
                return b.f32643i;
            case 110:
                return b.f32644j;
            default:
                return null;
        }
    }

    public au getSendUserLogsResponse() {
        return this.resultCase_ == 106 ? (au) this.result_ : au.getDefaultInstance();
    }

    public bc getStartNavigationResponse() {
        return this.resultCase_ == 108 ? (bc) this.result_ : bc.getDefaultInstance();
    }

    public bg getStopNavigationResponse() {
        return this.resultCase_ == 107 ? (bg) this.result_ : bg.getDefaultInstance();
    }

    public cc getUpdateFavoriteResponse() {
        return this.resultCase_ == 101 ? (cc) this.result_ : cc.getDefaultInstance();
    }

    public boolean hasCalculateRouteResponse() {
        return this.resultCase_ == 102;
    }

    public boolean hasChangeVoiceGuidanceModeResponse() {
        return this.resultCase_ == 103;
    }

    public boolean hasGetClosureCandidatesResponse() {
        return this.resultCase_ == 109;
    }

    public boolean hasReportAlertResponse() {
        return this.resultCase_ == 105;
    }

    public boolean hasReportClosureResponse() {
        return this.resultCase_ == 110;
    }

    public boolean hasReportMapIssueResponse() {
        return this.resultCase_ == 104;
    }

    public boolean hasSendUserLogsResponse() {
        return this.resultCase_ == 106;
    }

    public boolean hasStartNavigationResponse() {
        return this.resultCase_ == 108;
    }

    public boolean hasStopNavigationResponse() {
        return this.resultCase_ == 107;
    }

    public boolean hasUpdateFavoriteResponse() {
        return this.resultCase_ == 101;
    }

    public static a newBuilder(c cVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(com.google.v.v vVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(com.google.v.z zVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(com.google.v.z zVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static c parseFrom(InputStream inputStream) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(InputStream inputStream, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(ByteBuffer byteBuffer) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static c parseFrom(byte[] bArr) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static c parseFrom(byte[] bArr, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
