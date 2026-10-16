package l.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class c extends du<c, a> implements fj {
    private static final c DEFAULT_INSTANCE;
    public static final int GEO_CONFIG_REQUEST_LABELS_FIELD_NUMBER = 4;
    public static final int LATENCY_MS_FIELD_NUMBER = 1;
    public static final int LOGIN_REQUEST_LABELS_FIELD_NUMBER = 3;
    public static final int ONBOARDING_REQUEST_LABELS_FIELD_NUMBER = 5;
    private static volatile fo<c> PARSER = null;
    public static final int ROUTING_REQUEST_LABELS_FIELD_NUMBER = 2;
    private int bitField0_;
    private int labelsCase_ = 0;
    private Object labels_;
    private long latencyMs_;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeoConfigRequestLabels() {
        if (this.labelsCase_ == 4) {
            this.labelsCase_ = 0;
            this.labels_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabels() {
        this.labelsCase_ = 0;
        this.labels_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatencyMs() {
        this.bitField0_ &= -2;
        this.latencyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoginRequestLabels() {
        if (this.labelsCase_ == 3) {
            this.labelsCase_ = 0;
            this.labels_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnboardingRequestLabels() {
        if (this.labelsCase_ == 5) {
            this.labelsCase_ = 0;
            this.labels_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingRequestLabels() {
        if (this.labelsCase_ == 2) {
            this.labelsCase_ = 0;
            this.labels_ = null;
        }
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGeoConfigRequestLabels(f fVar) {
        Objects.requireNonNull(fVar);
        if (this.labelsCase_ == 4 && this.labels_ != f.getDefaultInstance()) {
            d dVarNewBuilder = f.newBuilder((f) this.labels_);
            dVarNewBuilder.mergeFrom((d) fVar);
            fVar = dVarNewBuilder.buildPartial();
        }
        this.labels_ = fVar;
        this.labelsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLoginRequestLabels(i iVar) {
        Objects.requireNonNull(iVar);
        if (this.labelsCase_ == 3 && this.labels_ != i.getDefaultInstance()) {
            g gVarNewBuilder = i.newBuilder((i) this.labels_);
            gVarNewBuilder.mergeFrom((g) iVar);
            iVar = gVarNewBuilder.buildPartial();
        }
        this.labels_ = iVar;
        this.labelsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOnboardingRequestLabels(r rVar) {
        Objects.requireNonNull(rVar);
        if (this.labelsCase_ == 5 && this.labels_ != r.getDefaultInstance()) {
            j jVarNewBuilder = r.newBuilder((r) this.labels_);
            jVarNewBuilder.mergeFrom((j) rVar);
            rVar = jVarNewBuilder.buildPartial();
        }
        this.labels_ = rVar;
        this.labelsCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoutingRequestLabels(u uVar) {
        Objects.requireNonNull(uVar);
        if (this.labelsCase_ == 2 && this.labels_ != u.getDefaultInstance()) {
            s sVarNewBuilder = u.newBuilder((u) this.labels_);
            sVarNewBuilder.mergeFrom((s) uVar);
            uVar = sVarNewBuilder.buildPartial();
        }
        this.labels_ = uVar;
        this.labelsCase_ = 2;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(v vVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeoConfigRequestLabels(f fVar) {
        Objects.requireNonNull(fVar);
        this.labels_ = fVar;
        this.labelsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatencyMs(long j2) {
        this.bitField0_ |= 1;
        this.latencyMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoginRequestLabels(i iVar) {
        Objects.requireNonNull(iVar);
        this.labels_ = iVar;
        this.labelsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnboardingRequestLabels(r rVar) {
        Objects.requireNonNull(rVar);
        this.labels_ = rVar;
        this.labelsCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingRequestLabels(u uVar) {
        Objects.requireNonNull(uVar);
        this.labels_ = uVar;
        this.labelsCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"labels_", "labelsCase_", "bitField0_", "latencyMs_", u.class, i.class, f.class, r.class});
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

    public f getGeoConfigRequestLabels() {
        return this.labelsCase_ == 4 ? (f) this.labels_ : f.getDefaultInstance();
    }

    public b getLabelsCase() {
        int i2 = this.labelsCase_;
        if (i2 == 0) {
            return b.f55762e;
        }
        if (i2 == 2) {
            return b.f55758a;
        }
        if (i2 == 3) {
            return b.f55759b;
        }
        if (i2 == 4) {
            return b.f55760c;
        }
        if (i2 != 5) {
            return null;
        }
        return b.f55761d;
    }

    public long getLatencyMs() {
        return this.latencyMs_;
    }

    public i getLoginRequestLabels() {
        return this.labelsCase_ == 3 ? (i) this.labels_ : i.getDefaultInstance();
    }

    public r getOnboardingRequestLabels() {
        return this.labelsCase_ == 5 ? (r) this.labels_ : r.getDefaultInstance();
    }

    public u getRoutingRequestLabels() {
        return this.labelsCase_ == 2 ? (u) this.labels_ : u.getDefaultInstance();
    }

    public boolean hasGeoConfigRequestLabels() {
        return this.labelsCase_ == 4;
    }

    public boolean hasLatencyMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLoginRequestLabels() {
        return this.labelsCase_ == 3;
    }

    public boolean hasOnboardingRequestLabels() {
        return this.labelsCase_ == 5;
    }

    public boolean hasRoutingRequestLabels() {
        return this.labelsCase_ == 2;
    }

    public static a newBuilder(c cVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(v vVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(z zVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(z zVar, de deVar) {
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
