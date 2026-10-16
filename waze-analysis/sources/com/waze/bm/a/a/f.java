package com.waze.bm.a.a;

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
/* loaded from: classes7.dex */
public final class f extends du<f, e> implements fj {
    private static final f DEFAULT_INSTANCE;
    public static final int GET_CLOSURE_CANDIDATES_RESPONSE_FIELD_NUMBER = 103;
    private static volatile fo<f> PARSER = null;
    public static final int REPORT_ALERT_RESPONSE_FIELD_NUMBER = 101;
    public static final int REPORT_CLOSURE_RESPONSE_FIELD_NUMBER = 102;
    public static final int REPORT_MAP_ISSUE_RESPONSE_FIELD_NUMBER = 100;
    private int actionCase_ = 0;
    private Object action_;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        du.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.actionCase_ = 0;
        this.action_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGetClosureCandidatesResponse() {
        if (this.actionCase_ == 103) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportAlertResponse() {
        if (this.actionCase_ == 101) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportClosureResponse() {
        if (this.actionCase_ == 102) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportMapIssueResponse() {
        if (this.actionCase_ == 100) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGetClosureCandidatesResponse(m mVar) {
        Objects.requireNonNull(mVar);
        if (this.actionCase_ == 103 && this.action_ != m.getDefaultInstance()) {
            l lVarNewBuilder = m.newBuilder((m) this.action_);
            lVarNewBuilder.mergeFrom((l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.action_ = mVar;
        this.actionCase_ = 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportAlertResponse(s sVar) {
        Objects.requireNonNull(sVar);
        if (this.actionCase_ == 101 && this.action_ != s.getDefaultInstance()) {
            r rVarNewBuilder = s.newBuilder((s) this.action_);
            rVarNewBuilder.mergeFrom((r) sVar);
            sVar = rVarNewBuilder.buildPartial();
        }
        this.action_ = sVar;
        this.actionCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportClosureResponse(w wVar) {
        Objects.requireNonNull(wVar);
        if (this.actionCase_ == 102 && this.action_ != w.getDefaultInstance()) {
            v vVarNewBuilder = w.newBuilder((w) this.action_);
            vVarNewBuilder.mergeFrom((v) wVar);
            wVar = vVarNewBuilder.buildPartial();
        }
        this.action_ = wVar;
        this.actionCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportMapIssueResponse(aa aaVar) {
        Objects.requireNonNull(aaVar);
        if (this.actionCase_ == 100 && this.action_ != aa.getDefaultInstance()) {
            z zVarNewBuilder = aa.newBuilder((aa) this.action_);
            zVarNewBuilder.mergeFrom((z) aaVar);
            aaVar = zVarNewBuilder.buildPartial();
        }
        this.action_ = aaVar;
        this.actionCase_ = 100;
    }

    public static e newBuilder() {
        return (e) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(com.google.v.v vVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<f> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGetClosureCandidatesResponse(m mVar) {
        Objects.requireNonNull(mVar);
        this.action_ = mVar;
        this.actionCase_ = 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportAlertResponse(s sVar) {
        Objects.requireNonNull(sVar);
        this.action_ = sVar;
        this.actionCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportClosureResponse(w wVar) {
        Objects.requireNonNull(wVar);
        this.action_ = wVar;
        this.actionCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportMapIssueResponse(aa aaVar) {
        Objects.requireNonNull(aaVar);
        this.action_ = aaVar;
        this.actionCase_ = 100;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0000dg\u0004\u0000\u0000\u0000d<\u0000e<\u0000f<\u0000g<\u0000", new Object[]{"action_", "actionCase_", aa.class, s.class, w.class, m.class});
        }
        if (iOrdinal == 3) {
            return new f();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new e(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<f> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (f.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public d getActionCase() {
        int i2 = this.actionCase_;
        if (i2 == 0) {
            return d.f17134e;
        }
        switch (i2) {
            case 100:
                return d.f17130a;
            case 101:
                return d.f17131b;
            case 102:
                return d.f17132c;
            case 103:
                return d.f17133d;
            default:
                return null;
        }
    }

    public m getGetClosureCandidatesResponse() {
        return this.actionCase_ == 103 ? (m) this.action_ : m.getDefaultInstance();
    }

    public s getReportAlertResponse() {
        return this.actionCase_ == 101 ? (s) this.action_ : s.getDefaultInstance();
    }

    public w getReportClosureResponse() {
        return this.actionCase_ == 102 ? (w) this.action_ : w.getDefaultInstance();
    }

    public aa getReportMapIssueResponse() {
        return this.actionCase_ == 100 ? (aa) this.action_ : aa.getDefaultInstance();
    }

    public boolean hasGetClosureCandidatesResponse() {
        return this.actionCase_ == 103;
    }

    public boolean hasReportAlertResponse() {
        return this.actionCase_ == 101;
    }

    public boolean hasReportClosureResponse() {
        return this.actionCase_ == 102;
    }

    public boolean hasReportMapIssueResponse() {
        return this.actionCase_ == 100;
    }

    public static e newBuilder(f fVar) {
        return (e) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(com.google.v.v vVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static f parseFrom(com.google.v.z zVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static f parseFrom(com.google.v.z zVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static f parseFrom(InputStream inputStream) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(InputStream inputStream, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(ByteBuffer byteBuffer) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static f parseFrom(byte[] bArr) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f parseFrom(byte[] bArr, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
