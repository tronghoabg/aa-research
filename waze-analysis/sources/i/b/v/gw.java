package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class gw extends com.google.v.du<gw, gv> implements gx {
    private static final gw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<gw> PARSER = null;
    public static final int VENUES_MERGE_REQUEST_FIELD_NUMBER = 7;
    public static final int VENUE_DELETE_IMAGE_REQUEST_FIELD_NUMBER = 4;
    public static final int VENUE_DELETE_REQUEST_FIELD_NUMBER = 2;
    public static final int VENUE_FLAG_REQUEST_FIELD_NUMBER = 3;
    public static final int VENUE_LIKE_IMAGE_REQUEST_FIELD_NUMBER = 5;
    public static final int VENUE_UNLIKE_IMAGE_REQUEST_FIELD_NUMBER = 6;
    public static final int VENUE_UPDATE_REQUEST_FIELD_NUMBER = 1;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private ek venueDeleteImageRequest_;
    private em venueDeleteRequest_;
    private fv venueFlagRequest_;
    private gc venueLikeImageRequest_;
    private gr venueUnlikeImageRequest_;
    private gu venueUpdateRequest_;
    private gz venuesMergeRequest_;

    static {
        gw gwVar = new gw();
        DEFAULT_INSTANCE = gwVar;
        com.google.v.du.registerDefaultInstance(gw.class, gwVar);
    }

    private gw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueDeleteImageRequest() {
        this.venueDeleteImageRequest_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueDeleteRequest() {
        this.venueDeleteRequest_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueFlagRequest() {
        this.venueFlagRequest_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueLikeImageRequest() {
        this.venueLikeImageRequest_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueUnlikeImageRequest() {
        this.venueUnlikeImageRequest_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueUpdateRequest() {
        this.venueUpdateRequest_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenuesMergeRequest() {
        this.venuesMergeRequest_ = null;
        this.bitField0_ &= -65;
    }

    public static gw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenueDeleteImageRequest(ek ekVar) {
        Objects.requireNonNull(ekVar);
        ek ekVar2 = this.venueDeleteImageRequest_;
        if (ekVar2 != null && ekVar2 != ek.getDefaultInstance()) {
            ej ejVarNewBuilder = ek.newBuilder(ekVar2);
            ejVarNewBuilder.mergeFrom((ej) ekVar);
            ekVar = ejVarNewBuilder.buildPartial();
        }
        this.venueDeleteImageRequest_ = ekVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenueDeleteRequest(em emVar) {
        Objects.requireNonNull(emVar);
        em emVar2 = this.venueDeleteRequest_;
        if (emVar2 != null && emVar2 != em.getDefaultInstance()) {
            el elVarNewBuilder = em.newBuilder(emVar2);
            elVarNewBuilder.mergeFrom((el) emVar);
            emVar = elVarNewBuilder.buildPartial();
        }
        this.venueDeleteRequest_ = emVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenueFlagRequest(fv fvVar) {
        Objects.requireNonNull(fvVar);
        fv fvVar2 = this.venueFlagRequest_;
        if (fvVar2 != null && fvVar2 != fv.getDefaultInstance()) {
            fr frVarNewBuilder = fv.newBuilder(fvVar2);
            frVarNewBuilder.mergeFrom((fr) fvVar);
            fvVar = frVarNewBuilder.buildPartial();
        }
        this.venueFlagRequest_ = fvVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenueLikeImageRequest(gc gcVar) {
        Objects.requireNonNull(gcVar);
        gc gcVar2 = this.venueLikeImageRequest_;
        if (gcVar2 != null && gcVar2 != gc.getDefaultInstance()) {
            gb gbVarNewBuilder = gc.newBuilder(gcVar2);
            gbVarNewBuilder.mergeFrom((gb) gcVar);
            gcVar = gbVarNewBuilder.buildPartial();
        }
        this.venueLikeImageRequest_ = gcVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenueUnlikeImageRequest(gr grVar) {
        Objects.requireNonNull(grVar);
        gr grVar2 = this.venueUnlikeImageRequest_;
        if (grVar2 != null && grVar2 != gr.getDefaultInstance()) {
            gq gqVarNewBuilder = gr.newBuilder(grVar2);
            gqVarNewBuilder.mergeFrom((gq) grVar);
            grVar = gqVarNewBuilder.buildPartial();
        }
        this.venueUnlikeImageRequest_ = grVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenueUpdateRequest(gu guVar) {
        Objects.requireNonNull(guVar);
        gu guVar2 = this.venueUpdateRequest_;
        if (guVar2 != null && guVar2 != gu.getDefaultInstance()) {
            gs gsVarNewBuilder = gu.newBuilder(guVar2);
            gsVarNewBuilder.mergeFrom((gs) guVar);
            guVar = gsVarNewBuilder.buildPartial();
        }
        this.venueUpdateRequest_ = guVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenuesMergeRequest(gz gzVar) {
        Objects.requireNonNull(gzVar);
        gz gzVar2 = this.venuesMergeRequest_;
        if (gzVar2 != null && gzVar2 != gz.getDefaultInstance()) {
            gy gyVarNewBuilder = gz.newBuilder(gzVar2);
            gyVarNewBuilder.mergeFrom((gy) gzVar);
            gzVar = gyVarNewBuilder.buildPartial();
        }
        this.venuesMergeRequest_ = gzVar;
        this.bitField0_ |= 64;
    }

    public static gv newBuilder() {
        return (gv) DEFAULT_INSTANCE.createBuilder();
    }

    public static gw parseDelimitedFrom(InputStream inputStream) {
        return (gw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gw parseFrom(com.google.v.v vVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueDeleteImageRequest(ek ekVar) {
        Objects.requireNonNull(ekVar);
        this.venueDeleteImageRequest_ = ekVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueDeleteRequest(em emVar) {
        Objects.requireNonNull(emVar);
        this.venueDeleteRequest_ = emVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueFlagRequest(fv fvVar) {
        Objects.requireNonNull(fvVar);
        this.venueFlagRequest_ = fvVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueLikeImageRequest(gc gcVar) {
        Objects.requireNonNull(gcVar);
        this.venueLikeImageRequest_ = gcVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueUnlikeImageRequest(gr grVar) {
        Objects.requireNonNull(grVar);
        this.venueUnlikeImageRequest_ = grVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueUpdateRequest(gu guVar) {
        Objects.requireNonNull(guVar);
        this.venueUpdateRequest_ = guVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenuesMergeRequest(gz gzVar) {
        Objects.requireNonNull(gzVar);
        this.venuesMergeRequest_ = gzVar;
        this.bitField0_ |= 64;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ᐉ\u0006", new Object[]{"bitField0_", "venueUpdateRequest_", "venueDeleteRequest_", "venueFlagRequest_", "venueDeleteImageRequest_", "venueLikeImageRequest_", "venueUnlikeImageRequest_", "venuesMergeRequest_"});
            case 3:
                return new gw();
            case 4:
                return new gv(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<gw> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (gw.class) {
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

    public ek getVenueDeleteImageRequest() {
        ek ekVar = this.venueDeleteImageRequest_;
        return ekVar == null ? ek.getDefaultInstance() : ekVar;
    }

    public em getVenueDeleteRequest() {
        em emVar = this.venueDeleteRequest_;
        return emVar == null ? em.getDefaultInstance() : emVar;
    }

    public fv getVenueFlagRequest() {
        fv fvVar = this.venueFlagRequest_;
        return fvVar == null ? fv.getDefaultInstance() : fvVar;
    }

    public gc getVenueLikeImageRequest() {
        gc gcVar = this.venueLikeImageRequest_;
        return gcVar == null ? gc.getDefaultInstance() : gcVar;
    }

    public gr getVenueUnlikeImageRequest() {
        gr grVar = this.venueUnlikeImageRequest_;
        return grVar == null ? gr.getDefaultInstance() : grVar;
    }

    public gu getVenueUpdateRequest() {
        gu guVar = this.venueUpdateRequest_;
        return guVar == null ? gu.getDefaultInstance() : guVar;
    }

    public gz getVenuesMergeRequest() {
        gz gzVar = this.venuesMergeRequest_;
        return gzVar == null ? gz.getDefaultInstance() : gzVar;
    }

    public boolean hasVenueDeleteImageRequest() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasVenueDeleteRequest() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVenueFlagRequest() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVenueLikeImageRequest() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasVenueUnlikeImageRequest() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasVenueUpdateRequest() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasVenuesMergeRequest() {
        return (this.bitField0_ & 64) != 0;
    }

    public static gv newBuilder(gw gwVar) {
        return (gv) DEFAULT_INSTANCE.createBuilder(gwVar);
    }

    public static gw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gw parseFrom(com.google.v.z zVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gw parseFrom(InputStream inputStream) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gw parseFrom(ByteBuffer byteBuffer) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gw parseFrom(byte[] bArr) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
