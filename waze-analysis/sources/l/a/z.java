package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class z extends com.google.v.du<z, x> implements com.google.v.fj {
    private static final z DEFAULT_INSTANCE;
    public static final int GOOGLE_AD_CLICKED_FIELD_NUMBER = 2;
    public static final int GOOGLE_AD_IMPRESSION_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<z> PARSER = null;
    public static final int REPORTING_CONTEXT_FIELD_NUMBER = 3;
    private int bitField0_;
    private int eventCase_ = 0;
    private Object event_;
    private aj reportingContext_;

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        com.google.v.du.registerDefaultInstance(z.class, zVar);
    }

    private z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.eventCase_ = 0;
        this.event_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdClicked() {
        if (this.eventCase_ == 2) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdImpression() {
        if (this.eventCase_ == 1) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportingContext() {
        this.reportingContext_ = null;
        this.bitField0_ &= -2;
    }

    public static z getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAdClicked(yz yzVar) {
        Objects.requireNonNull(yzVar);
        if (this.eventCase_ == 2 && this.event_ != yz.getDefaultInstance()) {
            yy yyVarNewBuilder = yz.newBuilder((yz) this.event_);
            yyVarNewBuilder.mergeFrom((yy) yzVar);
            yzVar = yyVarNewBuilder.buildPartial();
        }
        this.event_ = yzVar;
        this.eventCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAdImpression(zf zfVar) {
        Objects.requireNonNull(zfVar);
        if (this.eventCase_ == 1 && this.event_ != zf.getDefaultInstance()) {
            ze zeVarNewBuilder = zf.newBuilder((zf) this.event_);
            zeVarNewBuilder.mergeFrom((ze) zfVar);
            zfVar = zeVarNewBuilder.buildPartial();
        }
        this.event_ = zfVar;
        this.eventCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportingContext(aj ajVar) {
        Objects.requireNonNull(ajVar);
        aj ajVar2 = this.reportingContext_;
        if (ajVar2 != null && ajVar2 != aj.getDefaultInstance()) {
            ai aiVarNewBuilder = aj.newBuilder(ajVar2);
            aiVarNewBuilder.mergeFrom((ai) ajVar);
            ajVar = aiVarNewBuilder.buildPartial();
        }
        this.reportingContext_ = ajVar;
        this.bitField0_ |= 1;
    }

    public static x newBuilder() {
        return (x) DEFAULT_INSTANCE.createBuilder();
    }

    public static z parseDelimitedFrom(InputStream inputStream) {
        return (z) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static z parseFrom(com.google.v.v vVar) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<z> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdClicked(yz yzVar) {
        Objects.requireNonNull(yzVar);
        this.event_ = yzVar;
        this.eventCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdImpression(zf zfVar) {
        Objects.requireNonNull(zfVar);
        this.event_ = zfVar;
        this.eventCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportingContext(aj ajVar) {
        Objects.requireNonNull(ajVar);
        this.reportingContext_ = ajVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000", new Object[]{"event_", "eventCase_", "bitField0_", zf.class, yz.class, "reportingContext_"});
        }
        if (iOrdinal == 3) {
            return new z();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new x(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<z> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (z.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public y getEventCase() {
        int i2 = this.eventCase_;
        if (i2 == 0) {
            return y.f55650c;
        }
        if (i2 == 1) {
            return y.f55648a;
        }
        if (i2 != 2) {
            return null;
        }
        return y.f55649b;
    }

    public yz getGoogleAdClicked() {
        return this.eventCase_ == 2 ? (yz) this.event_ : yz.getDefaultInstance();
    }

    public zf getGoogleAdImpression() {
        return this.eventCase_ == 1 ? (zf) this.event_ : zf.getDefaultInstance();
    }

    public aj getReportingContext() {
        aj ajVar = this.reportingContext_;
        return ajVar == null ? aj.getDefaultInstance() : ajVar;
    }

    public boolean hasGoogleAdClicked() {
        return this.eventCase_ == 2;
    }

    public boolean hasGoogleAdImpression() {
        return this.eventCase_ == 1;
    }

    public boolean hasReportingContext() {
        return (this.bitField0_ & 1) != 0;
    }

    public static x newBuilder(z zVar) {
        return (x) DEFAULT_INSTANCE.createBuilder(zVar);
    }

    public static z parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (z) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static z parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static z parseFrom(com.google.v.z zVar) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static z parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static z parseFrom(InputStream inputStream) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static z parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static z parseFrom(ByteBuffer byteBuffer) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static z parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static z parseFrom(byte[] bArr) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static z parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
