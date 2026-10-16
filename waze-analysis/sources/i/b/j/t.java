package i.b.j;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t extends du<t, l> implements fj {
    private static final t DEFAULT_INSTANCE;
    public static final int FEEDBACK_CLICKED_FIELD_NUMBER = 3;
    public static final int FEEDBACK_DISMISSED_FIELD_NUMBER = 2;
    public static final int FEEDBACK_RECEIVED_FIELD_NUMBER = 1;
    public static final int ORIGINATOR_FIELD_NUMBER = 4;
    private static volatile fo<t> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private Object feedbackEvent_;
    private int feedbackEventCase_ = 0;
    private String originator_ = "";
    private String requestId_ = "";

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        du.registerDefaultInstance(t.class, tVar);
    }

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeedbackClicked() {
        if (this.feedbackEventCase_ == 3) {
            this.feedbackEventCase_ = 0;
            this.feedbackEvent_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeedbackDismissed() {
        if (this.feedbackEventCase_ == 2) {
            this.feedbackEventCase_ = 0;
            this.feedbackEvent_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeedbackEvent() {
        this.feedbackEventCase_ = 0;
        this.feedbackEvent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeedbackReceived() {
        if (this.feedbackEventCase_ == 1) {
            this.feedbackEventCase_ = 0;
            this.feedbackEvent_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginator() {
        this.bitField0_ &= -2;
        this.originator_ = getDefaultInstance().getOriginator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.bitField0_ &= -3;
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    public static t getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeedbackClicked(o oVar) {
        Objects.requireNonNull(oVar);
        if (this.feedbackEventCase_ == 3 && this.feedbackEvent_ != o.getDefaultInstance()) {
            n nVarNewBuilder = o.newBuilder((o) this.feedbackEvent_);
            nVarNewBuilder.mergeFrom((n) oVar);
            oVar = nVarNewBuilder.buildPartial();
        }
        this.feedbackEvent_ = oVar;
        this.feedbackEventCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeedbackDismissed(q qVar) {
        Objects.requireNonNull(qVar);
        if (this.feedbackEventCase_ == 2 && this.feedbackEvent_ != q.getDefaultInstance()) {
            p pVarNewBuilder = q.newBuilder((q) this.feedbackEvent_);
            pVarNewBuilder.mergeFrom((p) qVar);
            qVar = pVarNewBuilder.buildPartial();
        }
        this.feedbackEvent_ = qVar;
        this.feedbackEventCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeedbackReceived(s sVar) {
        Objects.requireNonNull(sVar);
        if (this.feedbackEventCase_ == 1 && this.feedbackEvent_ != s.getDefaultInstance()) {
            r rVarNewBuilder = s.newBuilder((s) this.feedbackEvent_);
            rVarNewBuilder.mergeFrom((r) sVar);
            sVar = rVarNewBuilder.buildPartial();
        }
        this.feedbackEvent_ = sVar;
        this.feedbackEventCase_ = 1;
    }

    public static l newBuilder() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public static t parseDelimitedFrom(InputStream inputStream) {
        return (t) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static t parseFrom(com.google.v.v vVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<t> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeedbackClicked(o oVar) {
        Objects.requireNonNull(oVar);
        this.feedbackEvent_ = oVar;
        this.feedbackEventCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeedbackDismissed(q qVar) {
        Objects.requireNonNull(qVar);
        this.feedbackEvent_ = qVar;
        this.feedbackEventCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeedbackReceived(s sVar) {
        Objects.requireNonNull(sVar);
        this.feedbackEvent_ = sVar;
        this.feedbackEventCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginator(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.originator_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginatorBytes(com.google.v.v vVar) {
        this.originator_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.requestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestIdBytes(com.google.v.v vVar) {
        this.requestId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004ဈ\u0000\u0005ဈ\u0001", new Object[]{"feedbackEvent_", "feedbackEventCase_", "bitField0_", s.class, q.class, o.class, "originator_", "requestId_"});
        }
        if (iOrdinal == 3) {
            return new t();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new l(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<t> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (t.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public o getFeedbackClicked() {
        return this.feedbackEventCase_ == 3 ? (o) this.feedbackEvent_ : o.getDefaultInstance();
    }

    public q getFeedbackDismissed() {
        return this.feedbackEventCase_ == 2 ? (q) this.feedbackEvent_ : q.getDefaultInstance();
    }

    public m getFeedbackEventCase() {
        int i2 = this.feedbackEventCase_;
        if (i2 == 0) {
            return m.f48517d;
        }
        if (i2 == 1) {
            return m.f48514a;
        }
        if (i2 == 2) {
            return m.f48515b;
        }
        if (i2 != 3) {
            return null;
        }
        return m.f48516c;
    }

    public s getFeedbackReceived() {
        return this.feedbackEventCase_ == 1 ? (s) this.feedbackEvent_ : s.getDefaultInstance();
    }

    public String getOriginator() {
        return this.originator_;
    }

    public com.google.v.v getOriginatorBytes() {
        return com.google.v.v.s(this.originator_);
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public com.google.v.v getRequestIdBytes() {
        return com.google.v.v.s(this.requestId_);
    }

    public boolean hasFeedbackClicked() {
        return this.feedbackEventCase_ == 3;
    }

    public boolean hasFeedbackDismissed() {
        return this.feedbackEventCase_ == 2;
    }

    public boolean hasFeedbackReceived() {
        return this.feedbackEventCase_ == 1;
    }

    public boolean hasOriginator() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRequestId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static l newBuilder(t tVar) {
        return (l) DEFAULT_INSTANCE.createBuilder(tVar);
    }

    public static t parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (t) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static t parseFrom(com.google.v.v vVar, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static t parseFrom(z zVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static t parseFrom(z zVar, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static t parseFrom(InputStream inputStream) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static t parseFrom(InputStream inputStream, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static t parseFrom(ByteBuffer byteBuffer) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static t parseFrom(byte[] bArr) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static t parseFrom(byte[] bArr, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
