package com.waze.sharedrive.f.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag extends du<ag, o> implements ah {
    private static final ag DEFAULT_INSTANCE;
    public static final int DRIVER_FIELD_NUMBER = 7;
    public static final int IS_CURRENT_USER_FIELD_NUMBER = 2;
    public static final int LAST_KNOWN_LOCATION_FIELD_NUMBER = 4;
    public static final int LOCATION_FRESHNESS_FIELD_NUMBER = 8;
    private static volatile fo<ag> PARSER = null;
    public static final int PARTICIPANT_ID_FIELD_NUMBER = 1;
    public static final int PERSONAL_DETAILS_FIELD_NUMBER = 3;
    public static final int VIEWER_FIELD_NUMBER = 5;
    public static final int VIEWER_SHARING_LOCATION_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean isCurrentUser_;
    private i.b.s lastKnownLocation_;
    private int locationFreshness_;
    private Object participantType_;
    private ab personalDetails_;
    private int participantTypeCase_ = 0;
    private String participantId_ = "";

    static {
        ag agVar = new ag();
        DEFAULT_INSTANCE = agVar;
        du.registerDefaultInstance(ag.class, agVar);
    }

    private ag() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriver() {
        if (this.participantTypeCase_ == 7) {
            this.participantTypeCase_ = 0;
            this.participantType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCurrentUser() {
        this.isCurrentUser_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastKnownLocation() {
        this.lastKnownLocation_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationFreshness() {
        this.locationFreshness_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantId() {
        this.participantId_ = getDefaultInstance().getParticipantId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantType() {
        this.participantTypeCase_ = 0;
        this.participantType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPersonalDetails() {
        this.personalDetails_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewer() {
        if (this.participantTypeCase_ == 5) {
            this.participantTypeCase_ = 0;
            this.participantType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewerSharingLocation() {
        if (this.participantTypeCase_ == 6) {
            this.participantTypeCase_ = 0;
            this.participantType_ = null;
        }
    }

    public static ag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDriver(x xVar) {
        Objects.requireNonNull(xVar);
        if (this.participantTypeCase_ == 7 && this.participantType_ != x.getDefaultInstance()) {
            p pVarNewBuilder = x.newBuilder((x) this.participantType_);
            pVarNewBuilder.mergeFrom((p) xVar);
            xVar = pVarNewBuilder.buildPartial();
        }
        this.participantType_ = xVar;
        this.participantTypeCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLastKnownLocation(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.lastKnownLocation_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.lastKnownLocation_ = sVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePersonalDetails(ab abVar) {
        Objects.requireNonNull(abVar);
        ab abVar2 = this.personalDetails_;
        if (abVar2 != null && abVar2 != ab.getDefaultInstance()) {
            aa aaVarNewBuilder = ab.newBuilder(abVar2);
            aaVarNewBuilder.mergeFrom((aa) abVar);
            abVar = aaVarNewBuilder.buildPartial();
        }
        this.personalDetails_ = abVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeViewer(ad adVar) {
        Objects.requireNonNull(adVar);
        if (this.participantTypeCase_ == 5 && this.participantType_ != ad.getDefaultInstance()) {
            ac acVarNewBuilder = ad.newBuilder((ad) this.participantType_);
            acVarNewBuilder.mergeFrom((ac) adVar);
            adVar = acVarNewBuilder.buildPartial();
        }
        this.participantType_ = adVar;
        this.participantTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeViewerSharingLocation(af afVar) {
        Objects.requireNonNull(afVar);
        if (this.participantTypeCase_ == 6 && this.participantType_ != af.getDefaultInstance()) {
            ae aeVarNewBuilder = af.newBuilder((af) this.participantType_);
            aeVarNewBuilder.mergeFrom((ae) afVar);
            afVar = aeVarNewBuilder.buildPartial();
        }
        this.participantType_ = afVar;
        this.participantTypeCase_ = 6;
    }

    public static o newBuilder() {
        return (o) DEFAULT_INSTANCE.createBuilder();
    }

    public static ag parseDelimitedFrom(InputStream inputStream) {
        return (ag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ag parseFrom(com.google.v.v vVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriver(x xVar) {
        Objects.requireNonNull(xVar);
        this.participantType_ = xVar;
        this.participantTypeCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCurrentUser(boolean z) {
        this.isCurrentUser_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastKnownLocation(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.lastKnownLocation_ = sVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationFreshness(y yVar) {
        this.locationFreshness_ = yVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationFreshnessValue(int i2) {
        this.locationFreshness_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantId(String str) {
        Objects.requireNonNull(str);
        this.participantId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.participantId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersonalDetails(ab abVar) {
        Objects.requireNonNull(abVar);
        this.personalDetails_ = abVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewer(ad adVar) {
        Objects.requireNonNull(adVar);
        this.participantType_ = adVar;
        this.participantTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewerSharingLocation(af afVar) {
        Objects.requireNonNull(afVar);
        this.participantType_ = afVar;
        this.participantTypeCase_ = 6;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003ဉ\u0000\u0004ဉ\u0001\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\f", new Object[]{"participantType_", "participantTypeCase_", "bitField0_", "participantId_", "isCurrentUser_", "personalDetails_", "lastKnownLocation_", ad.class, af.class, x.class, "locationFreshness_"});
        }
        if (iOrdinal == 3) {
            return new ag();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new o(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ag> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ag.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public x getDriver() {
        return this.participantTypeCase_ == 7 ? (x) this.participantType_ : x.getDefaultInstance();
    }

    public boolean getIsCurrentUser() {
        return this.isCurrentUser_;
    }

    public i.b.s getLastKnownLocation() {
        i.b.s sVar = this.lastKnownLocation_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public y getLocationFreshness() {
        int i2 = this.locationFreshness_;
        y yVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : y.STALE : y.FRESH : y.LOCATION_FRESHNESS_UNSPECIFIED;
        return yVar == null ? y.UNRECOGNIZED : yVar;
    }

    public int getLocationFreshnessValue() {
        return this.locationFreshness_;
    }

    public String getParticipantId() {
        return this.participantId_;
    }

    public com.google.v.v getParticipantIdBytes() {
        return com.google.v.v.s(this.participantId_);
    }

    public z getParticipantTypeCase() {
        int i2 = this.participantTypeCase_;
        if (i2 == 0) {
            return z.f38595d;
        }
        if (i2 == 5) {
            return z.f38592a;
        }
        if (i2 == 6) {
            return z.f38593b;
        }
        if (i2 != 7) {
            return null;
        }
        return z.f38594c;
    }

    public ab getPersonalDetails() {
        ab abVar = this.personalDetails_;
        return abVar == null ? ab.getDefaultInstance() : abVar;
    }

    public ad getViewer() {
        return this.participantTypeCase_ == 5 ? (ad) this.participantType_ : ad.getDefaultInstance();
    }

    public af getViewerSharingLocation() {
        return this.participantTypeCase_ == 6 ? (af) this.participantType_ : af.getDefaultInstance();
    }

    public boolean hasDriver() {
        return this.participantTypeCase_ == 7;
    }

    public boolean hasLastKnownLocation() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPersonalDetails() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasViewer() {
        return this.participantTypeCase_ == 5;
    }

    public boolean hasViewerSharingLocation() {
        return this.participantTypeCase_ == 6;
    }

    public static o newBuilder(ag agVar) {
        return (o) DEFAULT_INSTANCE.createBuilder(agVar);
    }

    public static ag parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ag parseFrom(com.google.v.v vVar, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ag parseFrom(com.google.v.z zVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ag parseFrom(com.google.v.z zVar, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ag parseFrom(InputStream inputStream) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ag parseFrom(InputStream inputStream, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ag parseFrom(ByteBuffer byteBuffer) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ag parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ag parseFrom(byte[] bArr) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ag parseFrom(byte[] bArr, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
