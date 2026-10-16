package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class eb extends com.google.v.du<eb, dy> implements com.google.v.fj {
    public static final int ANOTHER_DEVICE_LOGGED_IN_DETAILS_FIELD_NUMBER = 3;
    public static final int APP_VERSION_NOT_SUPPORTED_DETAILS_FIELD_NUMBER = 4;
    private static final eb DEFAULT_INSTANCE;
    public static final int ERROR_TYPE_FIELD_NUMBER = 2;
    public static final int INTERNAL_ISSUES_DETAILS_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<eb> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private int bitField0_;
    private int detailsCase_ = 0;
    private Object details_;
    private int errorType_;
    private long reason_;

    static {
        eb ebVar = new eb();
        DEFAULT_INSTANCE = ebVar;
        com.google.v.du.registerDefaultInstance(eb.class, ebVar);
    }

    private eb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnotherDeviceLoggedInDetails() {
        if (this.detailsCase_ == 3) {
            this.detailsCase_ = 0;
            this.details_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppVersionNotSupportedDetails() {
        if (this.detailsCase_ == 4) {
            this.detailsCase_ = 0;
            this.details_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetails() {
        this.detailsCase_ = 0;
        this.details_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorType() {
        this.bitField0_ &= -3;
        this.errorType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInternalIssuesDetails() {
        if (this.detailsCase_ == 5) {
            this.detailsCase_ = 0;
            this.details_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.bitField0_ &= -2;
        this.reason_ = 0L;
    }

    public static eb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAnotherDeviceLoggedInDetails(df dfVar) {
        Objects.requireNonNull(dfVar);
        if (this.detailsCase_ == 3 && this.details_ != df.getDefaultInstance()) {
            de deVarNewBuilder = df.newBuilder((df) this.details_);
            deVarNewBuilder.mergeFrom((de) dfVar);
            dfVar = deVarNewBuilder.buildPartial();
        }
        this.details_ = dfVar;
        this.detailsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppVersionNotSupportedDetails(dh dhVar) {
        Objects.requireNonNull(dhVar);
        if (this.detailsCase_ == 4 && this.details_ != dh.getDefaultInstance()) {
            dg dgVarNewBuilder = dh.newBuilder((dh) this.details_);
            dgVarNewBuilder.mergeFrom((dg) dhVar);
            dhVar = dgVarNewBuilder.buildPartial();
        }
        this.details_ = dhVar;
        this.detailsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInternalIssuesDetails(dv dvVar) {
        Objects.requireNonNull(dvVar);
        if (this.detailsCase_ == 5 && this.details_ != dv.getDefaultInstance()) {
            dt dtVarNewBuilder = dv.newBuilder((dv) this.details_);
            dtVarNewBuilder.mergeFrom((dt) dvVar);
            dvVar = dtVarNewBuilder.buildPartial();
        }
        this.details_ = dvVar;
        this.detailsCase_ = 5;
    }

    public static dy newBuilder() {
        return (dy) DEFAULT_INSTANCE.createBuilder();
    }

    public static eb parseDelimitedFrom(InputStream inputStream) {
        return (eb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eb parseFrom(com.google.v.v vVar) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<eb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnotherDeviceLoggedInDetails(df dfVar) {
        Objects.requireNonNull(dfVar);
        this.details_ = dfVar;
        this.detailsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersionNotSupportedDetails(dh dhVar) {
        Objects.requireNonNull(dhVar);
        this.details_ = dhVar;
        this.detailsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorType(ea eaVar) {
        this.errorType_ = eaVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalIssuesDetails(dv dvVar) {
        Objects.requireNonNull(dvVar);
        this.details_ = dvVar;
        this.detailsCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(long j2) {
        this.bitField0_ |= 1;
        this.reason_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"details_", "detailsCase_", "bitField0_", "reason_", "errorType_", e.s, df.class, dh.class, dv.class});
        }
        if (iOrdinal == 3) {
            return new eb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<eb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (eb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public df getAnotherDeviceLoggedInDetails() {
        return this.detailsCase_ == 3 ? (df) this.details_ : df.getDefaultInstance();
    }

    public dh getAppVersionNotSupportedDetails() {
        return this.detailsCase_ == 4 ? (dh) this.details_ : dh.getDefaultInstance();
    }

    public dz getDetailsCase() {
        int i2 = this.detailsCase_;
        if (i2 == 0) {
            return dz.f48652d;
        }
        if (i2 == 3) {
            return dz.f48649a;
        }
        if (i2 == 4) {
            return dz.f48650b;
        }
        if (i2 != 5) {
            return null;
        }
        return dz.f48651c;
    }

    public ea getErrorType() {
        ea eaVarA = ea.a(this.errorType_);
        return eaVarA == null ? ea.UNKNOWN_ERROR : eaVarA;
    }

    public dv getInternalIssuesDetails() {
        return this.detailsCase_ == 5 ? (dv) this.details_ : dv.getDefaultInstance();
    }

    @Deprecated
    public long getReason() {
        return this.reason_;
    }

    public boolean hasAnotherDeviceLoggedInDetails() {
        return this.detailsCase_ == 3;
    }

    public boolean hasAppVersionNotSupportedDetails() {
        return this.detailsCase_ == 4;
    }

    public boolean hasErrorType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasInternalIssuesDetails() {
        return this.detailsCase_ == 5;
    }

    @Deprecated
    public boolean hasReason() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dy newBuilder(eb ebVar) {
        return (dy) DEFAULT_INSTANCE.createBuilder(ebVar);
    }

    public static eb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static eb parseFrom(com.google.v.z zVar) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static eb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static eb parseFrom(InputStream inputStream) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eb parseFrom(ByteBuffer byteBuffer) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static eb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static eb parseFrom(byte[] bArr) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static eb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
