package i.b.p;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class at extends du<at, as> implements fj {
    public static final int ACCOUNT_ID_FIELD_NUMBER = 4;
    public static final int COMMUNITY_FIELD_NUMBER = 2;
    private static final at DEFAULT_INSTANCE;
    public static final int MEETING_FIELD_NUMBER = 3;
    private static volatile fo<at> PARSER = null;
    public static final int USER_CALENDAR_SYNC_ENABLED_FIELD_NUMBER = 6;
    public static final int USER_ID_FIELD_NUMBER = 1;
    public static final int USER_SIGNIFICANT_LOCATION_MONITORING_ENABLED_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean userCalendarSyncEnabled_;
    private long userId_;
    private boolean userSignificantLocationMonitoringEnabled_;
    private String community_ = "";
    private eo<x> meeting_ = emptyProtobufList();
    private String accountId_ = "";

    static {
        at atVar = new at();
        DEFAULT_INSTANCE = atVar;
        du.registerDefaultInstance(at.class, atVar);
    }

    private at() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMeeting(Iterable<? extends x> iterable) {
        ensureMeetingIsMutable();
        com.google.v.c.addAll(iterable, this.meeting_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMeeting(int i2, x xVar) {
        Objects.requireNonNull(xVar);
        ensureMeetingIsMutable();
        this.meeting_.add(i2, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountId() {
        this.bitField0_ &= -5;
        this.accountId_ = getDefaultInstance().getAccountId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommunity() {
        this.bitField0_ &= -3;
        this.community_ = getDefaultInstance().getCommunity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeeting() {
        this.meeting_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserCalendarSyncEnabled() {
        this.bitField0_ &= -17;
        this.userCalendarSyncEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -2;
        this.userId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserSignificantLocationMonitoringEnabled() {
        this.bitField0_ &= -9;
        this.userSignificantLocationMonitoringEnabled_ = false;
    }

    private void ensureMeetingIsMutable() {
        eo<x> eoVar = this.meeting_;
        if (eoVar.c()) {
            return;
        }
        this.meeting_ = du.mutableCopy(eoVar);
    }

    public static at getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static as newBuilder() {
        return (as) DEFAULT_INSTANCE.createBuilder();
    }

    public static at parseDelimitedFrom(InputStream inputStream) {
        return (at) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static at parseFrom(com.google.v.v vVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<at> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMeeting(int i2) {
        ensureMeetingIsMutable();
        this.meeting_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.accountId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountIdBytes(com.google.v.v vVar) {
        this.accountId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunity(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.community_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunityBytes(com.google.v.v vVar) {
        this.community_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeeting(int i2, x xVar) {
        Objects.requireNonNull(xVar);
        ensureMeetingIsMutable();
        this.meeting_.set(i2, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserCalendarSyncEnabled(boolean z) {
        this.bitField0_ |= 16;
        this.userCalendarSyncEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(long j2) {
        this.bitField0_ |= 1;
        this.userId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserSignificantLocationMonitoringEnabled(boolean z) {
        this.bitField0_ |= 8;
        this.userSignificantLocationMonitoringEnabled_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဈ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "userId_", "community_", "meeting_", x.class, "accountId_", "userSignificantLocationMonitoringEnabled_", "userCalendarSyncEnabled_"});
        }
        if (iOrdinal == 3) {
            return new at();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new as(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<at> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (at.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAccountId() {
        return this.accountId_;
    }

    public com.google.v.v getAccountIdBytes() {
        return com.google.v.v.s(this.accountId_);
    }

    public String getCommunity() {
        return this.community_;
    }

    public com.google.v.v getCommunityBytes() {
        return com.google.v.v.s(this.community_);
    }

    public x getMeeting(int i2) {
        return this.meeting_.get(i2);
    }

    public int getMeetingCount() {
        return this.meeting_.size();
    }

    public List<x> getMeetingList() {
        return this.meeting_;
    }

    public y getMeetingOrBuilder(int i2) {
        return this.meeting_.get(i2);
    }

    public List<? extends y> getMeetingOrBuilderList() {
        return this.meeting_;
    }

    public boolean getUserCalendarSyncEnabled() {
        return this.userCalendarSyncEnabled_;
    }

    public long getUserId() {
        return this.userId_;
    }

    public boolean getUserSignificantLocationMonitoringEnabled() {
        return this.userSignificantLocationMonitoringEnabled_;
    }

    public boolean hasAccountId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCommunity() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUserCalendarSyncEnabled() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUserSignificantLocationMonitoringEnabled() {
        return (this.bitField0_ & 8) != 0;
    }

    public static as newBuilder(at atVar) {
        return (as) DEFAULT_INSTANCE.createBuilder(atVar);
    }

    public static at parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (at) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static at parseFrom(com.google.v.v vVar, de deVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static at parseFrom(com.google.v.z zVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static at parseFrom(com.google.v.z zVar, de deVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMeeting(x xVar) {
        Objects.requireNonNull(xVar);
        ensureMeetingIsMutable();
        this.meeting_.add(xVar);
    }

    public static at parseFrom(InputStream inputStream) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static at parseFrom(InputStream inputStream, de deVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static at parseFrom(ByteBuffer byteBuffer) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static at parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static at parseFrom(byte[] bArr) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static at parseFrom(byte[] bArr, de deVar) {
        return (at) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
