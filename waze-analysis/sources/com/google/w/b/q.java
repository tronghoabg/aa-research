package com.google.w.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q extends du<q, p> implements fj {
    public static final int AUTO_DELETE_WITHIN_180_DAYS_FIELD_NUMBER = 13;
    public static final int AUTO_DELETE_WITHIN_WIPEOUT_FIELD_NUMBER = 11;
    public static final int AUTO_TOMBSTONE_FIELD_NUMBER = 14;
    private static final q DEFAULT_INSTANCE;
    public static final int HAS_EXPLICIT_CONSENT_FIELD_NUMBER = 6;
    public static final int IS_ACCESS_GRANTEE_FIELD_NUMBER = 16;
    public static final int IS_ACCESS_TARGET_FIELD_NUMBER = 12;
    public static final int IS_ACTION_TARGET_FIELD_NUMBER = 18;
    public static final int IS_ACTION_TIME_FIELD_NUMBER = 19;
    public static final int IS_ACTOR_FIELD_NUMBER = 17;
    public static final int IS_ENCRYPTED_FIELD_NUMBER = 7;
    public static final int IS_GOOGLE_FIELD_NUMBER = 2;
    public static final int IS_INTERNAL_ONLY_FIELD_NUMBER = 20;
    public static final int IS_PARTNER_FIELD_NUMBER = 4;
    public static final int IS_PUBLIC_FIELD_NUMBER = 1;
    public static final int IS_PUBLISHER_FIELD_NUMBER = 5;
    public static final int IS_QUASI_IDENTIFIER_FIELD_NUMBER = 21;
    public static final int IS_USER_VISIBLE_FIELD_NUMBER = 15;
    public static final int LIMITED_ACCESS_FIELD_NUMBER = 10;
    public static final int NON_USER_LOCATION_FIELD_NUMBER = 9;
    public static final int OTHER_USER_FIELD_NUMBER = 3;
    private static volatile fo<q> PARSER = null;
    public static final int RELATED_FIELD_FIELD_NUMBER = 8;
    private boolean autoDeleteWithin180Days_;
    private boolean autoDeleteWithinWipeout_;
    private boolean autoTombstone_;
    private int bitField0_;
    private boolean hasExplicitConsent_;
    private boolean isAccessGrantee_;
    private boolean isAccessTarget_;
    private boolean isActionTarget_;
    private boolean isActionTime_;
    private boolean isActor_;
    private boolean isEncrypted_;
    private boolean isGoogle_;
    private boolean isInternalOnly_;
    private boolean isPartner_;
    private boolean isPublic_;
    private boolean isPublisher_;
    private boolean isQuasiIdentifier_;
    private boolean isUserVisible_;
    private boolean limitedAccess_;
    private boolean nonUserLocation_;
    private boolean otherUser_;
    private int relatedField_;

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        du.registerDefaultInstance(q.class, qVar);
    }

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoDeleteWithin180Days() {
        this.bitField0_ &= -4097;
        this.autoDeleteWithin180Days_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoDeleteWithinWipeout() {
        this.bitField0_ &= -2049;
        this.autoDeleteWithinWipeout_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoTombstone() {
        this.bitField0_ &= -1025;
        this.autoTombstone_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasExplicitConsent() {
        this.bitField0_ &= -33;
        this.hasExplicitConsent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAccessGrantee() {
        this.bitField0_ &= -32769;
        this.isAccessGrantee_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAccessTarget() {
        this.bitField0_ &= -8193;
        this.isAccessTarget_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsActionTarget() {
        this.bitField0_ &= -131073;
        this.isActionTarget_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsActionTime() {
        this.bitField0_ &= -262145;
        this.isActionTime_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsActor() {
        this.bitField0_ &= -65537;
        this.isActor_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsEncrypted() {
        this.bitField0_ &= -65;
        this.isEncrypted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsGoogle() {
        this.bitField0_ &= -3;
        this.isGoogle_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInternalOnly() {
        this.bitField0_ &= -524289;
        this.isInternalOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPartner() {
        this.bitField0_ &= -9;
        this.isPartner_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPublic() {
        this.bitField0_ &= -2;
        this.isPublic_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPublisher() {
        this.bitField0_ &= -17;
        this.isPublisher_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsQuasiIdentifier() {
        this.bitField0_ &= -1048577;
        this.isQuasiIdentifier_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsUserVisible() {
        this.bitField0_ &= -16385;
        this.isUserVisible_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimitedAccess() {
        this.bitField0_ &= -513;
        this.limitedAccess_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNonUserLocation() {
        this.bitField0_ &= -257;
        this.nonUserLocation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtherUser() {
        this.bitField0_ &= -5;
        this.otherUser_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelatedField() {
        this.bitField0_ &= -129;
        this.relatedField_ = 0;
    }

    public static q getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static p newBuilder() {
        return (p) DEFAULT_INSTANCE.createBuilder();
    }

    public static q parseDelimitedFrom(InputStream inputStream) {
        return (q) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static q parseFrom(v vVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<q> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoDeleteWithin180Days(boolean z) {
        this.bitField0_ |= 4096;
        this.autoDeleteWithin180Days_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoDeleteWithinWipeout(boolean z) {
        this.bitField0_ |= 2048;
        this.autoDeleteWithinWipeout_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoTombstone(boolean z) {
        this.bitField0_ |= 1024;
        this.autoTombstone_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasExplicitConsent(boolean z) {
        this.bitField0_ |= 32;
        this.hasExplicitConsent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAccessGrantee(boolean z) {
        this.bitField0_ |= 32768;
        this.isAccessGrantee_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAccessTarget(boolean z) {
        this.bitField0_ |= 8192;
        this.isAccessTarget_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsActionTarget(boolean z) {
        this.bitField0_ |= 131072;
        this.isActionTarget_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsActionTime(boolean z) {
        this.bitField0_ |= 262144;
        this.isActionTime_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsActor(boolean z) {
        this.bitField0_ |= 65536;
        this.isActor_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsEncrypted(boolean z) {
        this.bitField0_ |= 64;
        this.isEncrypted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsGoogle(boolean z) {
        this.bitField0_ |= 2;
        this.isGoogle_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInternalOnly(boolean z) {
        this.bitField0_ |= 524288;
        this.isInternalOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPartner(boolean z) {
        this.bitField0_ |= 8;
        this.isPartner_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPublic(boolean z) {
        this.bitField0_ |= 1;
        this.isPublic_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPublisher(boolean z) {
        this.bitField0_ |= 16;
        this.isPublisher_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsQuasiIdentifier(boolean z) {
        this.bitField0_ |= 1048576;
        this.isQuasiIdentifier_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsUserVisible(boolean z) {
        this.bitField0_ |= 16384;
        this.isUserVisible_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimitedAccess(boolean z) {
        this.bitField0_ |= 512;
        this.limitedAccess_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonUserLocation(boolean z) {
        this.bitField0_ |= 256;
        this.nonUserLocation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherUser(boolean z) {
        this.bitField0_ |= 4;
        this.otherUser_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelatedField(int i2) {
        this.bitField0_ |= 128;
        this.relatedField_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tဇ\b\nဇ\t\u000bဇ\u000b\fဇ\r\rဇ\f\u000eဇ\n\u000fဇ\u000e\u0010ဇ\u000f\u0011ဇ\u0010\u0012ဇ\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0015ဇ\u0014", new Object[]{"bitField0_", "isPublic_", "isGoogle_", "otherUser_", "isPartner_", "isPublisher_", "hasExplicitConsent_", "isEncrypted_", "relatedField_", "nonUserLocation_", "limitedAccess_", "autoDeleteWithinWipeout_", "isAccessTarget_", "autoDeleteWithin180Days_", "autoTombstone_", "isUserVisible_", "isAccessGrantee_", "isActor_", "isActionTarget_", "isActionTime_", "isInternalOnly_", "isQuasiIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new q();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new p(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<q> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (q.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAutoDeleteWithin180Days() {
        return this.autoDeleteWithin180Days_;
    }

    public boolean getAutoDeleteWithinWipeout() {
        return this.autoDeleteWithinWipeout_;
    }

    public boolean getAutoTombstone() {
        return this.autoTombstone_;
    }

    public boolean getHasExplicitConsent() {
        return this.hasExplicitConsent_;
    }

    public boolean getIsAccessGrantee() {
        return this.isAccessGrantee_;
    }

    public boolean getIsAccessTarget() {
        return this.isAccessTarget_;
    }

    public boolean getIsActionTarget() {
        return this.isActionTarget_;
    }

    public boolean getIsActionTime() {
        return this.isActionTime_;
    }

    public boolean getIsActor() {
        return this.isActor_;
    }

    public boolean getIsEncrypted() {
        return this.isEncrypted_;
    }

    public boolean getIsGoogle() {
        return this.isGoogle_;
    }

    public boolean getIsInternalOnly() {
        return this.isInternalOnly_;
    }

    public boolean getIsPartner() {
        return this.isPartner_;
    }

    public boolean getIsPublic() {
        return this.isPublic_;
    }

    public boolean getIsPublisher() {
        return this.isPublisher_;
    }

    public boolean getIsQuasiIdentifier() {
        return this.isQuasiIdentifier_;
    }

    public boolean getIsUserVisible() {
        return this.isUserVisible_;
    }

    public boolean getLimitedAccess() {
        return this.limitedAccess_;
    }

    public boolean getNonUserLocation() {
        return this.nonUserLocation_;
    }

    public boolean getOtherUser() {
        return this.otherUser_;
    }

    public int getRelatedField() {
        return this.relatedField_;
    }

    public boolean hasAutoDeleteWithin180Days() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasAutoDeleteWithinWipeout() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasAutoTombstone() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasHasExplicitConsent() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasIsAccessGrantee() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasIsAccessTarget() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasIsActionTarget() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasIsActionTime() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasIsActor() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasIsEncrypted() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasIsGoogle() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIsInternalOnly() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasIsPartner() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsPublic() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsPublisher() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasIsQuasiIdentifier() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasIsUserVisible() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasLimitedAccess() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasNonUserLocation() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasOtherUser() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRelatedField() {
        return (this.bitField0_ & 128) != 0;
    }

    public static p newBuilder(q qVar) {
        return (p) DEFAULT_INSTANCE.createBuilder(qVar);
    }

    public static q parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (q) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static q parseFrom(v vVar, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static q parseFrom(z zVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static q parseFrom(z zVar, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static q parseFrom(InputStream inputStream) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static q parseFrom(InputStream inputStream, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static q parseFrom(ByteBuffer byteBuffer) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static q parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static q parseFrom(byte[] bArr) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static q parseFrom(byte[] bArr, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
