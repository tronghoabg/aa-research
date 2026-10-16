package i.b.p;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class x extends du<x, v> implements y {
    public static final int ATTRIBUTES_FIELD_NUMBER = 17;
    public static final int CALCULATED_LOCATION_FIELD_NUMBER = 7;
    public static final int COMMUNITY_FIELD_NUMBER = 8;
    public static final int DATE_ONLY_FIELD_NUMBER = 5;
    private static final x DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 4;
    public static final int EVENT_ID_FIELD_NUMBER = 1;
    public static final int IS_RECURRING_FIELD_NUMBER = 16;
    public static final int LOCATION_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int OWNER_COMMUNITY_ID_FIELD_NUMBER = 10;
    public static final int OWNER_FIRST_NAME_FIELD_NUMBER = 11;
    public static final int OWNER_LAST_NAME_FIELD_NUMBER = 12;
    public static final int OWNER_NAME_FIELD_NUMBER = 9;
    public static final int OWNER_USER_NAME_FIELD_NUMBER = 13;
    private static volatile fo<x> PARSER = null;
    public static final int PARTNER_INFO_FIELD_NUMBER = 18;
    public static final int RECURRING_EVENT_ID_FIELD_NUMBER = 15;
    public static final int RSVP_STATUS_FIELD_NUMBER = 20;
    public static final int SRC_LOCATION_FIELD_NUMBER = 19;
    public static final int START_TIME_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 14;
    public static final int USER_POI_ID_FIELD_NUMBER = 21;
    private i.b.am attributes_;
    private int bitField0_;
    private u calculatedLocation_;
    private boolean dateOnly_;
    private long endTime_;
    private boolean isRecurring_;
    private u location_;
    private ac partnerInfo_;
    private u srcLocation_;
    private long startTime_;
    private int type_;
    private long userPoiId_;
    private String eventId_ = "";
    private String name_ = "";
    private String community_ = "";
    private String ownerName_ = "";
    private String ownerCommunityId_ = "";
    private String ownerFirstName_ = "";
    private String ownerLastName_ = "";
    private String ownerUserName_ = "";
    private String recurringEventId_ = "";
    private String rsvpStatus_ = "";

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        du.registerDefaultInstance(x.class, xVar);
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributes() {
        this.attributes_ = null;
        this.bitField0_ &= -65537;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalculatedLocation() {
        this.calculatedLocation_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommunity() {
        this.bitField0_ &= -129;
        this.community_ = getDefaultInstance().getCommunity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDateOnly() {
        this.bitField0_ &= -17;
        this.dateOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.bitField0_ &= -9;
        this.endTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventId() {
        this.bitField0_ &= -2;
        this.eventId_ = getDefaultInstance().getEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsRecurring() {
        this.bitField0_ &= -32769;
        this.isRecurring_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOwnerCommunityId() {
        this.bitField0_ &= -513;
        this.ownerCommunityId_ = getDefaultInstance().getOwnerCommunityId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOwnerFirstName() {
        this.bitField0_ &= -1025;
        this.ownerFirstName_ = getDefaultInstance().getOwnerFirstName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOwnerLastName() {
        this.bitField0_ &= -2049;
        this.ownerLastName_ = getDefaultInstance().getOwnerLastName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOwnerName() {
        this.bitField0_ &= -257;
        this.ownerName_ = getDefaultInstance().getOwnerName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOwnerUserName() {
        this.bitField0_ &= -4097;
        this.ownerUserName_ = getDefaultInstance().getOwnerUserName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPartnerInfo() {
        this.partnerInfo_ = null;
        this.bitField0_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecurringEventId() {
        this.bitField0_ &= -16385;
        this.recurringEventId_ = getDefaultInstance().getRecurringEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRsvpStatus() {
        this.bitField0_ &= -524289;
        this.rsvpStatus_ = getDefaultInstance().getRsvpStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSrcLocation() {
        this.srcLocation_ = null;
        this.bitField0_ &= -262145;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.bitField0_ &= -5;
        this.startTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -8193;
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserPoiId() {
        this.bitField0_ &= -1048577;
        this.userPoiId_ = 0L;
    }

    public static x getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAttributes(i.b.am amVar) {
        Objects.requireNonNull(amVar);
        i.b.am amVar2 = this.attributes_;
        if (amVar2 != null && amVar2 != i.b.am.getDefaultInstance()) {
            i.b.al alVarNewBuilder = i.b.am.newBuilder(amVar2);
            alVarNewBuilder.mergeFrom((i.b.al) amVar);
            amVar = alVarNewBuilder.buildPartial();
        }
        this.attributes_ = amVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCalculatedLocation(u uVar) {
        Objects.requireNonNull(uVar);
        u uVar2 = this.calculatedLocation_;
        if (uVar2 != null && uVar2 != u.getDefaultInstance()) {
            t tVarNewBuilder = u.newBuilder(uVar2);
            tVarNewBuilder.mergeFrom((t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.calculatedLocation_ = uVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocation(u uVar) {
        Objects.requireNonNull(uVar);
        u uVar2 = this.location_;
        if (uVar2 != null && uVar2 != u.getDefaultInstance()) {
            t tVarNewBuilder = u.newBuilder(uVar2);
            tVarNewBuilder.mergeFrom((t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.location_ = uVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePartnerInfo(ac acVar) {
        Objects.requireNonNull(acVar);
        ac acVar2 = this.partnerInfo_;
        if (acVar2 != null && acVar2 != ac.getDefaultInstance()) {
            ab abVarNewBuilder = ac.newBuilder(acVar2);
            abVarNewBuilder.mergeFrom((ab) acVar);
            acVar = abVarNewBuilder.buildPartial();
        }
        this.partnerInfo_ = acVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSrcLocation(u uVar) {
        Objects.requireNonNull(uVar);
        u uVar2 = this.srcLocation_;
        if (uVar2 != null && uVar2 != u.getDefaultInstance()) {
            t tVarNewBuilder = u.newBuilder(uVar2);
            tVarNewBuilder.mergeFrom((t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.srcLocation_ = uVar;
        this.bitField0_ |= 262144;
    }

    public static v newBuilder() {
        return (v) DEFAULT_INSTANCE.createBuilder();
    }

    public static x parseDelimitedFrom(InputStream inputStream) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(com.google.v.v vVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<x> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributes(i.b.am amVar) {
        Objects.requireNonNull(amVar);
        this.attributes_ = amVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalculatedLocation(u uVar) {
        Objects.requireNonNull(uVar);
        this.calculatedLocation_ = uVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunity(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.community_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunityBytes(com.google.v.v vVar) {
        this.community_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateOnly(boolean z) {
        this.bitField0_ |= 16;
        this.dateOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(long j2) {
        this.bitField0_ |= 8;
        this.endTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.eventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventIdBytes(com.google.v.v vVar) {
        this.eventId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsRecurring(boolean z) {
        this.bitField0_ |= 32768;
        this.isRecurring_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(u uVar) {
        Objects.requireNonNull(uVar);
        this.location_ = uVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerCommunityId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.ownerCommunityId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerCommunityIdBytes(com.google.v.v vVar) {
        this.ownerCommunityId_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerFirstName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.ownerFirstName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerFirstNameBytes(com.google.v.v vVar) {
        this.ownerFirstName_ = vVar.u();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerLastName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2048;
        this.ownerLastName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerLastNameBytes(com.google.v.v vVar) {
        this.ownerLastName_ = vVar.u();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.ownerName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerNameBytes(com.google.v.v vVar) {
        this.ownerName_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerUserName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4096;
        this.ownerUserName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerUserNameBytes(com.google.v.v vVar) {
        this.ownerUserName_ = vVar.u();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartnerInfo(ac acVar) {
        Objects.requireNonNull(acVar);
        this.partnerInfo_ = acVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecurringEventId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16384;
        this.recurringEventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecurringEventIdBytes(com.google.v.v vVar) {
        this.recurringEventId_ = vVar.u();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRsvpStatus(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 524288;
        this.rsvpStatus_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRsvpStatusBytes(com.google.v.v vVar) {
        this.rsvpStatus_ = vVar.u();
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSrcLocation(u uVar) {
        Objects.requireNonNull(uVar);
        this.srcLocation_ = uVar;
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(long j2) {
        this.bitField0_ |= 4;
        this.startTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(w wVar) {
        this.type_ = wVar.getNumber();
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPoiId(long j2) {
        this.bitField0_ |= 1048576;
        this.userPoiId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000e᠌\r\u000fဈ\u000e\u0010ဇ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဈ\u0013\u0015ဂ\u0014", new Object[]{"bitField0_", "eventId_", "name_", "startTime_", "endTime_", "dateOnly_", "location_", "calculatedLocation_", "community_", "ownerName_", "ownerCommunityId_", "ownerFirstName_", "ownerLastName_", "ownerUserName_", "type_", b.f49191f, "recurringEventId_", "isRecurring_", "attributes_", "partnerInfo_", "srcLocation_", "rsvpStatus_", "userPoiId_"});
        }
        if (iOrdinal == 3) {
            return new x();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new v(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<x> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (x.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.am getAttributes() {
        i.b.am amVar = this.attributes_;
        return amVar == null ? i.b.am.getDefaultInstance() : amVar;
    }

    public u getCalculatedLocation() {
        u uVar = this.calculatedLocation_;
        return uVar == null ? u.getDefaultInstance() : uVar;
    }

    public String getCommunity() {
        return this.community_;
    }

    public com.google.v.v getCommunityBytes() {
        return com.google.v.v.s(this.community_);
    }

    public boolean getDateOnly() {
        return this.dateOnly_;
    }

    public long getEndTime() {
        return this.endTime_;
    }

    public String getEventId() {
        return this.eventId_;
    }

    public com.google.v.v getEventIdBytes() {
        return com.google.v.v.s(this.eventId_);
    }

    public boolean getIsRecurring() {
        return this.isRecurring_;
    }

    public u getLocation() {
        u uVar = this.location_;
        return uVar == null ? u.getDefaultInstance() : uVar;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public String getOwnerCommunityId() {
        return this.ownerCommunityId_;
    }

    public com.google.v.v getOwnerCommunityIdBytes() {
        return com.google.v.v.s(this.ownerCommunityId_);
    }

    public String getOwnerFirstName() {
        return this.ownerFirstName_;
    }

    public com.google.v.v getOwnerFirstNameBytes() {
        return com.google.v.v.s(this.ownerFirstName_);
    }

    public String getOwnerLastName() {
        return this.ownerLastName_;
    }

    public com.google.v.v getOwnerLastNameBytes() {
        return com.google.v.v.s(this.ownerLastName_);
    }

    public String getOwnerName() {
        return this.ownerName_;
    }

    public com.google.v.v getOwnerNameBytes() {
        return com.google.v.v.s(this.ownerName_);
    }

    public String getOwnerUserName() {
        return this.ownerUserName_;
    }

    public com.google.v.v getOwnerUserNameBytes() {
        return com.google.v.v.s(this.ownerUserName_);
    }

    public ac getPartnerInfo() {
        ac acVar = this.partnerInfo_;
        return acVar == null ? ac.getDefaultInstance() : acVar;
    }

    public String getRecurringEventId() {
        return this.recurringEventId_;
    }

    public com.google.v.v getRecurringEventIdBytes() {
        return com.google.v.v.s(this.recurringEventId_);
    }

    public String getRsvpStatus() {
        return this.rsvpStatus_;
    }

    public com.google.v.v getRsvpStatusBytes() {
        return com.google.v.v.s(this.rsvpStatus_);
    }

    public u getSrcLocation() {
        u uVar = this.srcLocation_;
        return uVar == null ? u.getDefaultInstance() : uVar;
    }

    public long getStartTime() {
        return this.startTime_;
    }

    public w getType() {
        w wVarA = w.a(this.type_);
        return wVarA == null ? w.UNKNOWN : wVarA;
    }

    public long getUserPoiId() {
        return this.userPoiId_;
    }

    public boolean hasAttributes() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasCalculatedLocation() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCommunity() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasDateOnly() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasEndTime() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasEventId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsRecurring() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasLocation() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOwnerCommunityId() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasOwnerFirstName() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasOwnerLastName() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasOwnerName() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasOwnerUserName() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasPartnerInfo() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasRecurringEventId() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasRsvpStatus() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasSrcLocation() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasStartTime() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasUserPoiId() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public static v newBuilder(x xVar) {
        return (v) DEFAULT_INSTANCE.createBuilder(xVar);
    }

    public static x parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(com.google.v.v vVar, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static x parseFrom(com.google.v.z zVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static x parseFrom(com.google.v.z zVar, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static x parseFrom(InputStream inputStream) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(InputStream inputStream, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(ByteBuffer byteBuffer) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static x parseFrom(byte[] bArr) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static x parseFrom(byte[] bArr, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
