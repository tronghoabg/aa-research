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
public final class aa extends du<aa, z> implements fj {
    public static final int CALCULATE_ROUTE_FIELD_NUMBER = 104;
    public static final int CHANGE_VOICE_GUIDANCE_MODE_FIELD_NUMBER = 107;
    private static final aa DEFAULT_INSTANCE;
    public static final int DISPLAY_TEXT_FIELD_NUMBER = 101;
    public static final int END_CONVERSATION_FIELD_NUMBER = 102;
    public static final int GET_CLOSURE_CANDIDATES_FIELD_NUMBER = 112;
    private static volatile fo<aa> PARSER = null;
    public static final int PLAY_SOUND_FIELD_NUMBER = 100;
    public static final int REPORT_ALERT_FIELD_NUMBER = 109;
    public static final int REPORT_CLOSURE_FIELD_NUMBER = 113;
    public static final int REPORT_MAP_ISSUE_FIELD_NUMBER = 108;
    public static final int SEARCH_RESULTS_FIELD_NUMBER = 105;
    public static final int SEND_USER_LOGS_FIELD_NUMBER = 110;
    public static final int START_NAVIGATION_FIELD_NUMBER = 106;
    public static final int STOP_NAVIGATION_FIELD_NUMBER = 111;
    public static final int UPDATE_FAVORITE_FIELD_NUMBER = 103;
    private Object action_;
    private int actionCase_ = 0;
    private byte memoizedIsInitialized = 2;

    static {
        aa aaVar = new aa();
        DEFAULT_INSTANCE = aaVar;
        du.registerDefaultInstance(aa.class, aaVar);
    }

    private aa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.actionCase_ = 0;
        this.action_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalculateRoute() {
        if (this.actionCase_ == 104) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangeVoiceGuidanceMode() {
        if (this.actionCase_ == 107) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayText() {
        if (this.actionCase_ == 101) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndConversation() {
        if (this.actionCase_ == 102) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGetClosureCandidates() {
        if (this.actionCase_ == 112) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaySound() {
        if (this.actionCase_ == 100) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportAlert() {
        if (this.actionCase_ == 109) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportClosure() {
        if (this.actionCase_ == 113) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportMapIssue() {
        if (this.actionCase_ == 108) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchResults() {
        if (this.actionCase_ == 105) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSendUserLogs() {
        if (this.actionCase_ == 110) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartNavigation() {
        if (this.actionCase_ == 106) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStopNavigation() {
        if (this.actionCase_ == 111) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateFavorite() {
        if (this.actionCase_ == 103) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    public static aa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCalculateRoute(k kVar) {
        Objects.requireNonNull(kVar);
        if (this.actionCase_ == 104 && this.action_ != k.getDefaultInstance()) {
            j jVarNewBuilder = k.newBuilder((k) this.action_);
            jVarNewBuilder.mergeFrom((j) kVar);
            kVar = jVarNewBuilder.buildPartial();
        }
        this.action_ = kVar;
        this.actionCase_ = 104;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChangeVoiceGuidanceMode(q qVar) {
        Objects.requireNonNull(qVar);
        if (this.actionCase_ == 107 && this.action_ != q.getDefaultInstance()) {
            n nVarNewBuilder = q.newBuilder((q) this.action_);
            nVarNewBuilder.mergeFrom((n) qVar);
            qVar = nVarNewBuilder.buildPartial();
        }
        this.action_ = qVar;
        this.actionCase_ = 107;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisplayText(com.waze.u.a.i iVar) {
        Objects.requireNonNull(iVar);
        if (this.actionCase_ == 101 && this.action_ != com.waze.u.a.i.getDefaultInstance()) {
            com.waze.u.a.h hVarNewBuilder = com.waze.u.a.i.newBuilder((com.waze.u.a.i) this.action_);
            hVarNewBuilder.mergeFrom((com.waze.u.a.h) iVar);
            iVar = hVarNewBuilder.buildPartial();
        }
        this.action_ = iVar;
        this.actionCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndConversation(com.waze.u.a.k kVar) {
        Objects.requireNonNull(kVar);
        if (this.actionCase_ == 102 && this.action_ != com.waze.u.a.k.getDefaultInstance()) {
            com.waze.u.a.j jVarNewBuilder = com.waze.u.a.k.newBuilder((com.waze.u.a.k) this.action_);
            jVarNewBuilder.mergeFrom((com.waze.u.a.j) kVar);
            kVar = jVarNewBuilder.buildPartial();
        }
        this.action_ = kVar;
        this.actionCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGetClosureCandidates(com.waze.bm.a.a.k kVar) {
        Objects.requireNonNull(kVar);
        if (this.actionCase_ == 112 && this.action_ != com.waze.bm.a.a.k.getDefaultInstance()) {
            com.waze.bm.a.a.j jVarNewBuilder = com.waze.bm.a.a.k.newBuilder((com.waze.bm.a.a.k) this.action_);
            jVarNewBuilder.mergeFrom((com.waze.bm.a.a.j) kVar);
            kVar = jVarNewBuilder.buildPartial();
        }
        this.action_ = kVar;
        this.actionCase_ = 112;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaySound(com.waze.u.a.m mVar) {
        Objects.requireNonNull(mVar);
        if (this.actionCase_ == 100 && this.action_ != com.waze.u.a.m.getDefaultInstance()) {
            com.waze.u.a.l lVarNewBuilder = com.waze.u.a.m.newBuilder((com.waze.u.a.m) this.action_);
            lVarNewBuilder.mergeFrom((com.waze.u.a.l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.action_ = mVar;
        this.actionCase_ = 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportAlert(com.waze.bm.a.a.q qVar) {
        Objects.requireNonNull(qVar);
        if (this.actionCase_ == 109 && this.action_ != com.waze.bm.a.a.q.getDefaultInstance()) {
            com.waze.bm.a.a.p pVarNewBuilder = com.waze.bm.a.a.q.newBuilder((com.waze.bm.a.a.q) this.action_);
            pVarNewBuilder.mergeFrom((com.waze.bm.a.a.p) qVar);
            qVar = pVarNewBuilder.buildPartial();
        }
        this.action_ = qVar;
        this.actionCase_ = 109;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportClosure(com.waze.bm.a.a.u uVar) {
        Objects.requireNonNull(uVar);
        if (this.actionCase_ == 113 && this.action_ != com.waze.bm.a.a.u.getDefaultInstance()) {
            com.waze.bm.a.a.t tVarNewBuilder = com.waze.bm.a.a.u.newBuilder((com.waze.bm.a.a.u) this.action_);
            tVarNewBuilder.mergeFrom((com.waze.bm.a.a.t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.action_ = uVar;
        this.actionCase_ = 113;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportMapIssue(com.waze.bm.a.a.y yVar) {
        Objects.requireNonNull(yVar);
        if (this.actionCase_ == 108 && this.action_ != com.waze.bm.a.a.y.getDefaultInstance()) {
            com.waze.bm.a.a.x xVarNewBuilder = com.waze.bm.a.a.y.newBuilder((com.waze.bm.a.a.y) this.action_);
            xVarNewBuilder.mergeFrom((com.waze.bm.a.a.x) yVar);
            yVar = xVarNewBuilder.buildPartial();
        }
        this.action_ = yVar;
        this.actionCase_ = 108;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSearchResults(aq aqVar) {
        Objects.requireNonNull(aqVar);
        if (this.actionCase_ == 105 && this.action_ != aq.getDefaultInstance()) {
            ap apVarNewBuilder = aq.newBuilder((aq) this.action_);
            apVarNewBuilder.mergeFrom((ap) aqVar);
            aqVar = apVarNewBuilder.buildPartial();
        }
        this.action_ = aqVar;
        this.actionCase_ = 105;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSendUserLogs(as asVar) {
        Objects.requireNonNull(asVar);
        if (this.actionCase_ == 110 && this.action_ != as.getDefaultInstance()) {
            ar arVarNewBuilder = as.newBuilder((as) this.action_);
            arVarNewBuilder.mergeFrom((ar) asVar);
            asVar = arVarNewBuilder.buildPartial();
        }
        this.action_ = asVar;
        this.actionCase_ = 110;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartNavigation(ba baVar) {
        Objects.requireNonNull(baVar);
        if (this.actionCase_ == 106 && this.action_ != ba.getDefaultInstance()) {
            az azVarNewBuilder = ba.newBuilder((ba) this.action_);
            azVarNewBuilder.mergeFrom((az) baVar);
            baVar = azVarNewBuilder.buildPartial();
        }
        this.action_ = baVar;
        this.actionCase_ = 106;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStopNavigation(be beVar) {
        Objects.requireNonNull(beVar);
        if (this.actionCase_ == 111 && this.action_ != be.getDefaultInstance()) {
            bd bdVarNewBuilder = be.newBuilder((be) this.action_);
            bdVarNewBuilder.mergeFrom((bd) beVar);
            beVar = bdVarNewBuilder.buildPartial();
        }
        this.action_ = beVar;
        this.actionCase_ = 111;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateFavorite(ca caVar) {
        Objects.requireNonNull(caVar);
        if (this.actionCase_ == 103 && this.action_ != ca.getDefaultInstance()) {
            by byVarNewBuilder = ca.newBuilder((ca) this.action_);
            byVarNewBuilder.mergeFrom((by) caVar);
            caVar = byVarNewBuilder.buildPartial();
        }
        this.action_ = caVar;
        this.actionCase_ = 103;
    }

    public static z newBuilder() {
        return (z) DEFAULT_INSTANCE.createBuilder();
    }

    public static aa parseDelimitedFrom(InputStream inputStream) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(com.google.v.v vVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalculateRoute(k kVar) {
        Objects.requireNonNull(kVar);
        this.action_ = kVar;
        this.actionCase_ = 104;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeVoiceGuidanceMode(q qVar) {
        Objects.requireNonNull(qVar);
        this.action_ = qVar;
        this.actionCase_ = 107;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayText(com.waze.u.a.i iVar) {
        Objects.requireNonNull(iVar);
        this.action_ = iVar;
        this.actionCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndConversation(com.waze.u.a.k kVar) {
        Objects.requireNonNull(kVar);
        this.action_ = kVar;
        this.actionCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGetClosureCandidates(com.waze.bm.a.a.k kVar) {
        Objects.requireNonNull(kVar);
        this.action_ = kVar;
        this.actionCase_ = 112;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaySound(com.waze.u.a.m mVar) {
        Objects.requireNonNull(mVar);
        this.action_ = mVar;
        this.actionCase_ = 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportAlert(com.waze.bm.a.a.q qVar) {
        Objects.requireNonNull(qVar);
        this.action_ = qVar;
        this.actionCase_ = 109;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportClosure(com.waze.bm.a.a.u uVar) {
        Objects.requireNonNull(uVar);
        this.action_ = uVar;
        this.actionCase_ = 113;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportMapIssue(com.waze.bm.a.a.y yVar) {
        Objects.requireNonNull(yVar);
        this.action_ = yVar;
        this.actionCase_ = 108;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchResults(aq aqVar) {
        Objects.requireNonNull(aqVar);
        this.action_ = aqVar;
        this.actionCase_ = 105;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSendUserLogs(as asVar) {
        Objects.requireNonNull(asVar);
        this.action_ = asVar;
        this.actionCase_ = 110;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartNavigation(ba baVar) {
        Objects.requireNonNull(baVar);
        this.action_ = baVar;
        this.actionCase_ = 106;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStopNavigation(be beVar) {
        Objects.requireNonNull(beVar);
        this.action_ = beVar;
        this.actionCase_ = 111;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateFavorite(ca caVar) {
        Objects.requireNonNull(caVar);
        this.action_ = caVar;
        this.actionCase_ = 103;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0001\u0000dq\u000e\u0000\u0000\u0002d<\u0000e<\u0000f<\u0000g<\u0000hм\u0000iм\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000o<\u0000p<\u0000q<\u0000", new Object[]{"action_", "actionCase_", com.waze.u.a.m.class, com.waze.u.a.i.class, com.waze.u.a.k.class, ca.class, k.class, aq.class, ba.class, q.class, com.waze.bm.a.a.y.class, com.waze.bm.a.a.q.class, as.class, be.class, com.waze.bm.a.a.k.class, com.waze.bm.a.a.u.class});
            case 3:
                return new aa();
            case 4:
                return new z(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<aa> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (aa.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public y getActionCase() {
        int i2 = this.actionCase_;
        if (i2 == 0) {
            return y.o;
        }
        switch (i2) {
            case 100:
                return y.f32923a;
            case 101:
                return y.f32924b;
            case 102:
                return y.f32925c;
            case 103:
                return y.f32926d;
            case 104:
                return y.f32927e;
            case 105:
                return y.f32928f;
            case 106:
                return y.f32929g;
            case 107:
                return y.f32930h;
            case 108:
                return y.f32931i;
            case 109:
                return y.f32932j;
            case 110:
                return y.f32933k;
            case 111:
                return y.f32934l;
            case 112:
                return y.m;
            case 113:
                return y.n;
            default:
                return null;
        }
    }

    public k getCalculateRoute() {
        return this.actionCase_ == 104 ? (k) this.action_ : k.getDefaultInstance();
    }

    public q getChangeVoiceGuidanceMode() {
        return this.actionCase_ == 107 ? (q) this.action_ : q.getDefaultInstance();
    }

    public com.waze.u.a.i getDisplayText() {
        return this.actionCase_ == 101 ? (com.waze.u.a.i) this.action_ : com.waze.u.a.i.getDefaultInstance();
    }

    public com.waze.u.a.k getEndConversation() {
        return this.actionCase_ == 102 ? (com.waze.u.a.k) this.action_ : com.waze.u.a.k.getDefaultInstance();
    }

    public com.waze.bm.a.a.k getGetClosureCandidates() {
        return this.actionCase_ == 112 ? (com.waze.bm.a.a.k) this.action_ : com.waze.bm.a.a.k.getDefaultInstance();
    }

    public com.waze.u.a.m getPlaySound() {
        return this.actionCase_ == 100 ? (com.waze.u.a.m) this.action_ : com.waze.u.a.m.getDefaultInstance();
    }

    public com.waze.bm.a.a.q getReportAlert() {
        return this.actionCase_ == 109 ? (com.waze.bm.a.a.q) this.action_ : com.waze.bm.a.a.q.getDefaultInstance();
    }

    public com.waze.bm.a.a.u getReportClosure() {
        return this.actionCase_ == 113 ? (com.waze.bm.a.a.u) this.action_ : com.waze.bm.a.a.u.getDefaultInstance();
    }

    public com.waze.bm.a.a.y getReportMapIssue() {
        return this.actionCase_ == 108 ? (com.waze.bm.a.a.y) this.action_ : com.waze.bm.a.a.y.getDefaultInstance();
    }

    public aq getSearchResults() {
        return this.actionCase_ == 105 ? (aq) this.action_ : aq.getDefaultInstance();
    }

    public as getSendUserLogs() {
        return this.actionCase_ == 110 ? (as) this.action_ : as.getDefaultInstance();
    }

    public ba getStartNavigation() {
        return this.actionCase_ == 106 ? (ba) this.action_ : ba.getDefaultInstance();
    }

    public be getStopNavigation() {
        return this.actionCase_ == 111 ? (be) this.action_ : be.getDefaultInstance();
    }

    public ca getUpdateFavorite() {
        return this.actionCase_ == 103 ? (ca) this.action_ : ca.getDefaultInstance();
    }

    public boolean hasCalculateRoute() {
        return this.actionCase_ == 104;
    }

    public boolean hasChangeVoiceGuidanceMode() {
        return this.actionCase_ == 107;
    }

    public boolean hasDisplayText() {
        return this.actionCase_ == 101;
    }

    public boolean hasEndConversation() {
        return this.actionCase_ == 102;
    }

    public boolean hasGetClosureCandidates() {
        return this.actionCase_ == 112;
    }

    public boolean hasPlaySound() {
        return this.actionCase_ == 100;
    }

    public boolean hasReportAlert() {
        return this.actionCase_ == 109;
    }

    public boolean hasReportClosure() {
        return this.actionCase_ == 113;
    }

    public boolean hasReportMapIssue() {
        return this.actionCase_ == 108;
    }

    public boolean hasSearchResults() {
        return this.actionCase_ == 105;
    }

    public boolean hasSendUserLogs() {
        return this.actionCase_ == 110;
    }

    public boolean hasStartNavigation() {
        return this.actionCase_ == 106;
    }

    public boolean hasStopNavigation() {
        return this.actionCase_ == 111;
    }

    public boolean hasUpdateFavorite() {
        return this.actionCase_ == 103;
    }

    public static z newBuilder(aa aaVar) {
        return (z) DEFAULT_INSTANCE.createBuilder(aaVar);
    }

    public static aa parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(com.google.v.v vVar, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aa parseFrom(com.google.v.z zVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aa parseFrom(com.google.v.z zVar, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aa parseFrom(InputStream inputStream) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(InputStream inputStream, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(ByteBuffer byteBuffer) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aa parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aa parseFrom(byte[] bArr) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aa parseFrom(byte[] bArr, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
