package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class gu extends com.google.v.du<gu, gs> implements com.google.v.fj {
    public static final int DATA_LAYER_FIELD_NUMBER = 12;
    private static final gu DEFAULT_INSTANCE;
    public static final int HINTS_FIELD_NUMBER = 9;
    public static final int IGNORE_EXISTING_FIELDS_FIELD_NUMBER = 14;
    public static final int IMAGES_SEMANTICS_FIELD_NUMBER = 15;
    public static final int MUST_BE_REVIEWED_FIELD_NUMBER = 13;
    private static volatile com.google.v.fo<gu> PARSER = null;
    public static final int REFERRER_FIELD_NUMBER = 10;
    public static final int RETURN_PENDING_REQUESTS_FIELD_NUMBER = 11;
    public static final int RETURN_UNSCANNED_IMAGES_FIELD_NUMBER = 16;
    public static final int RETURN_VENUE_FIELD_NUMBER = 5;
    public static final int SESSION_FIELD_NUMBER = 3;
    public static final int TIME_FIELD_NUMBER = 7;
    public static final int USER_INFO_FIELD_NUMBER = 1;
    public static final int UUID_FIELD_NUMBER = 8;
    public static final int VENUE3_FIELD_NUMBER = 6;
    public static final int VENUE_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private int dataLayer_;
    private gg hints_;
    private boolean ignoreExistingFields_;
    private int imagesSemantics_;
    private boolean mustBeReviewed_;
    private di referrer_;
    private boolean returnPendingRequests_;
    private boolean returnUnscannedImages_;
    private boolean returnVenue_;
    private long time_;
    private dx userInfo_;
    private ed venue3_;
    private ef venue_;
    private long version_;
    private byte memoizedIsInitialized = 2;
    private String session_ = "";
    private com.google.v.v uuid_ = com.google.v.v.f13054a;

    static {
        gu guVar = new gu();
        DEFAULT_INSTANCE = guVar;
        com.google.v.du.registerDefaultInstance(gu.class, guVar);
    }

    private gu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataLayer() {
        this.bitField0_ &= -2049;
        this.dataLayer_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHints() {
        this.hints_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIgnoreExistingFields() {
        this.bitField0_ &= -8193;
        this.ignoreExistingFields_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImagesSemantics() {
        this.bitField0_ &= -16385;
        this.imagesSemantics_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMustBeReviewed() {
        this.bitField0_ &= -4097;
        this.mustBeReviewed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReferrer() {
        this.referrer_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnPendingRequests() {
        this.bitField0_ &= -1025;
        this.returnPendingRequests_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnUnscannedImages() {
        this.bitField0_ &= -32769;
        this.returnUnscannedImages_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnVenue() {
        this.bitField0_ &= -17;
        this.returnVenue_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSession() {
        this.bitField0_ &= -5;
        this.session_ = getDefaultInstance().getSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.bitField0_ &= -65;
        this.time_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserInfo() {
        this.userInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUuid() {
        this.bitField0_ &= -129;
        this.uuid_ = getDefaultInstance().getUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenue() {
        this.venue_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenue3() {
        this.venue3_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.bitField0_ &= -3;
        this.version_ = 0L;
    }

    public static gu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHints(gg ggVar) {
        Objects.requireNonNull(ggVar);
        gg ggVar2 = this.hints_;
        if (ggVar2 != null && ggVar2 != gg.getDefaultInstance()) {
            gf gfVarNewBuilder = gg.newBuilder(ggVar2);
            gfVarNewBuilder.mergeFrom((gf) ggVar);
            ggVar = gfVarNewBuilder.buildPartial();
        }
        this.hints_ = ggVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReferrer(di diVar) {
        Objects.requireNonNull(diVar);
        di diVar2 = this.referrer_;
        if (diVar2 != null && diVar2 != di.getDefaultInstance()) {
            dg dgVarNewBuilder = di.newBuilder(diVar2);
            dgVarNewBuilder.mergeFrom((dg) diVar);
            diVar = dgVarNewBuilder.buildPartial();
        }
        this.referrer_ = diVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserInfo(dx dxVar) {
        Objects.requireNonNull(dxVar);
        dx dxVar2 = this.userInfo_;
        if (dxVar2 != null && dxVar2 != dx.getDefaultInstance()) {
            dv dvVarNewBuilder = dx.newBuilder(dxVar2);
            dvVarNewBuilder.mergeFrom((dv) dxVar);
            dxVar = dvVarNewBuilder.buildPartial();
        }
        this.userInfo_ = dxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenue(ef efVar) {
        Objects.requireNonNull(efVar);
        ef efVar2 = this.venue_;
        if (efVar2 != null && efVar2 != ef.getDefaultInstance()) {
            eb ebVarNewBuilder = ef.newBuilder(efVar2);
            ebVarNewBuilder.mergeFrom((eb) efVar);
            efVar = ebVarNewBuilder.buildPartial();
        }
        this.venue_ = efVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenue3(ed edVar) {
        Objects.requireNonNull(edVar);
        ed edVar2 = this.venue3_;
        if (edVar2 != null && edVar2 != ed.getDefaultInstance()) {
            ec ecVarNewBuilder = ed.newBuilder(edVar2);
            ecVarNewBuilder.mergeFrom((ec) edVar);
            edVar = ecVarNewBuilder.buildPartial();
        }
        this.venue3_ = edVar;
        this.bitField0_ |= 32;
    }

    public static gs newBuilder() {
        return (gs) DEFAULT_INSTANCE.createBuilder();
    }

    public static gu parseDelimitedFrom(InputStream inputStream) {
        return (gu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gu parseFrom(com.google.v.v vVar) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataLayer(ei eiVar) {
        this.dataLayer_ = eiVar.getNumber();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHints(gg ggVar) {
        Objects.requireNonNull(ggVar);
        this.hints_ = ggVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgnoreExistingFields(boolean z) {
        this.bitField0_ |= 8192;
        this.ignoreExistingFields_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImagesSemantics(gt gtVar) {
        this.imagesSemantics_ = gtVar.getNumber();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMustBeReviewed(boolean z) {
        this.bitField0_ |= 4096;
        this.mustBeReviewed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReferrer(di diVar) {
        Objects.requireNonNull(diVar);
        this.referrer_ = diVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnPendingRequests(boolean z) {
        this.bitField0_ |= 1024;
        this.returnPendingRequests_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnUnscannedImages(boolean z) {
        this.bitField0_ |= 32768;
        this.returnUnscannedImages_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnVenue(boolean z) {
        this.bitField0_ |= 16;
        this.returnVenue_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSession(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.session_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionBytes(com.google.v.v vVar) {
        this.session_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(long j2) {
        this.bitField0_ |= 64;
        this.time_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserInfo(dx dxVar) {
        Objects.requireNonNull(dxVar);
        this.userInfo_ = dxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUuid(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 128;
        this.uuid_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenue(ef efVar) {
        Objects.requireNonNull(efVar);
        this.venue_ = efVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenue3(ed edVar) {
        Objects.requireNonNull(edVar);
        this.venue3_ = edVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(long j2) {
        this.bitField0_ |= 2;
        this.version_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0002\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ᐉ\u0005\u0007ဂ\u0006\bည\u0007\tဉ\b\nဉ\t\u000bဇ\n\f᠌\u000b\rဇ\f\u000eဇ\r\u000f᠌\u000e\u0010ဇ\u000f", new Object[]{"bitField0_", "userInfo_", "version_", "session_", "venue_", "returnVenue_", "venue3_", "time_", "uuid_", "hints_", "referrer_", "returnPendingRequests_", "dataLayer_", z.u, "mustBeReviewed_", "ignoreExistingFields_", "imagesSemantics_", ft.f49499g, "returnUnscannedImages_"});
            case 3:
                return new gu();
            case 4:
                return new gs(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<gu> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (gu.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public ei getDataLayer() {
        ei eiVarA = ei.a(this.dataLayer_);
        return eiVarA == null ? ei.BASE : eiVarA;
    }

    @Deprecated
    public gg getHints() {
        gg ggVar = this.hints_;
        return ggVar == null ? gg.getDefaultInstance() : ggVar;
    }

    public boolean getIgnoreExistingFields() {
        return this.ignoreExistingFields_;
    }

    public gt getImagesSemantics() {
        gt gtVarA = gt.a(this.imagesSemantics_);
        return gtVarA == null ? gt.MERGE : gtVarA;
    }

    public boolean getMustBeReviewed() {
        return this.mustBeReviewed_;
    }

    public di getReferrer() {
        di diVar = this.referrer_;
        return diVar == null ? di.getDefaultInstance() : diVar;
    }

    public boolean getReturnPendingRequests() {
        return this.returnPendingRequests_;
    }

    public boolean getReturnUnscannedImages() {
        return this.returnUnscannedImages_;
    }

    public boolean getReturnVenue() {
        return this.returnVenue_;
    }

    public String getSession() {
        return this.session_;
    }

    public com.google.v.v getSessionBytes() {
        return com.google.v.v.s(this.session_);
    }

    public long getTime() {
        return this.time_;
    }

    public dx getUserInfo() {
        dx dxVar = this.userInfo_;
        return dxVar == null ? dx.getDefaultInstance() : dxVar;
    }

    public com.google.v.v getUuid() {
        return this.uuid_;
    }

    public ef getVenue() {
        ef efVar = this.venue_;
        return efVar == null ? ef.getDefaultInstance() : efVar;
    }

    public ed getVenue3() {
        ed edVar = this.venue3_;
        return edVar == null ? ed.getDefaultInstance() : edVar;
    }

    @Deprecated
    public long getVersion() {
        return this.version_;
    }

    public boolean hasDataLayer() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Deprecated
    public boolean hasHints() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasIgnoreExistingFields() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasImagesSemantics() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasMustBeReviewed() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasReferrer() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasReturnPendingRequests() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasReturnUnscannedImages() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasReturnVenue() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSession() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTime() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasUserInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUuid() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasVenue() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasVenue3() {
        return (this.bitField0_ & 32) != 0;
    }

    @Deprecated
    public boolean hasVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public static gs newBuilder(gu guVar) {
        return (gs) DEFAULT_INSTANCE.createBuilder(guVar);
    }

    public static gu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gu parseFrom(com.google.v.z zVar) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gu parseFrom(InputStream inputStream) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gu parseFrom(ByteBuffer byteBuffer) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gu parseFrom(byte[] bArr) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
