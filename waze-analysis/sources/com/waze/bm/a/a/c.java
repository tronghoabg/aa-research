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
public final class c extends du<c, b> implements fj {
    private static final c DEFAULT_INSTANCE;
    public static final int GET_CLOSURE_CANDIDATES_FIELD_NUMBER = 103;
    private static volatile fo<c> PARSER = null;
    public static final int REPORT_ALERT_FIELD_NUMBER = 101;
    public static final int REPORT_CLOSURE_FIELD_NUMBER = 102;
    public static final int REPORT_MAP_ISSUE_FIELD_NUMBER = 100;
    private int actionCase_ = 0;
    private Object action_;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.actionCase_ = 0;
        this.action_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGetClosureCandidates() {
        if (this.actionCase_ == 103) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportAlert() {
        if (this.actionCase_ == 101) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportClosure() {
        if (this.actionCase_ == 102) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportMapIssue() {
        if (this.actionCase_ == 100) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGetClosureCandidates(k kVar) {
        Objects.requireNonNull(kVar);
        if (this.actionCase_ == 103 && this.action_ != k.getDefaultInstance()) {
            j jVarNewBuilder = k.newBuilder((k) this.action_);
            jVarNewBuilder.mergeFrom((j) kVar);
            kVar = jVarNewBuilder.buildPartial();
        }
        this.action_ = kVar;
        this.actionCase_ = 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportAlert(q qVar) {
        Objects.requireNonNull(qVar);
        if (this.actionCase_ == 101 && this.action_ != q.getDefaultInstance()) {
            p pVarNewBuilder = q.newBuilder((q) this.action_);
            pVarNewBuilder.mergeFrom((p) qVar);
            qVar = pVarNewBuilder.buildPartial();
        }
        this.action_ = qVar;
        this.actionCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportClosure(u uVar) {
        Objects.requireNonNull(uVar);
        if (this.actionCase_ == 102 && this.action_ != u.getDefaultInstance()) {
            t tVarNewBuilder = u.newBuilder((u) this.action_);
            tVarNewBuilder.mergeFrom((t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.action_ = uVar;
        this.actionCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportMapIssue(y yVar) {
        Objects.requireNonNull(yVar);
        if (this.actionCase_ == 100 && this.action_ != y.getDefaultInstance()) {
            x xVarNewBuilder = y.newBuilder((y) this.action_);
            xVarNewBuilder.mergeFrom((x) yVar);
            yVar = xVarNewBuilder.buildPartial();
        }
        this.action_ = yVar;
        this.actionCase_ = 100;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
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
    public void setGetClosureCandidates(k kVar) {
        Objects.requireNonNull(kVar);
        this.action_ = kVar;
        this.actionCase_ = 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportAlert(q qVar) {
        Objects.requireNonNull(qVar);
        this.action_ = qVar;
        this.actionCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportClosure(u uVar) {
        Objects.requireNonNull(uVar);
        this.action_ = uVar;
        this.actionCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportMapIssue(y yVar) {
        Objects.requireNonNull(yVar);
        this.action_ = yVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0000dg\u0004\u0000\u0000\u0000d<\u0000e<\u0000f<\u0000g<\u0000", new Object[]{"action_", "actionCase_", y.class, q.class, u.class, k.class});
        }
        if (iOrdinal == 3) {
            return new c();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new b(bArr);
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

    public a getActionCase() {
        int i2 = this.actionCase_;
        if (i2 == 0) {
            return a.f17112e;
        }
        switch (i2) {
            case 100:
                return a.f17108a;
            case 101:
                return a.f17109b;
            case 102:
                return a.f17110c;
            case 103:
                return a.f17111d;
            default:
                return null;
        }
    }

    public k getGetClosureCandidates() {
        return this.actionCase_ == 103 ? (k) this.action_ : k.getDefaultInstance();
    }

    public q getReportAlert() {
        return this.actionCase_ == 101 ? (q) this.action_ : q.getDefaultInstance();
    }

    public u getReportClosure() {
        return this.actionCase_ == 102 ? (u) this.action_ : u.getDefaultInstance();
    }

    public y getReportMapIssue() {
        return this.actionCase_ == 100 ? (y) this.action_ : y.getDefaultInstance();
    }

    public boolean hasGetClosureCandidates() {
        return this.actionCase_ == 103;
    }

    public boolean hasReportAlert() {
        return this.actionCase_ == 101;
    }

    public boolean hasReportClosure() {
        return this.actionCase_ == 102;
    }

    public boolean hasReportMapIssue() {
        return this.actionCase_ == 100;
    }

    public static b newBuilder(c cVar) {
        return (b) DEFAULT_INSTANCE.createBuilder(cVar);
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
