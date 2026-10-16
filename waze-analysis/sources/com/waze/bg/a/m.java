package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m extends com.google.v.du<m, l> implements fj {
    public static final int ALERT_ADDRESS_FIELD_NUMBER = 8;
    public static final int ALERT_SOURCE_INFO_FIELD_NUMBER = 17;
    public static final int ARCHIVE_FIELD_NUMBER = 13;
    public static final int BEEPINFO_FIELD_NUMBER = 14;
    public static final int CHATINFO_FIELD_NUMBER = 16;
    public static final int COMMENTINFO_FIELD_NUMBER = 15;
    public static final int CURRENT_USER_IS_REPORTER_FIELD_NUMBER = 6;
    public static final int CURRENT_USER_THUMBED_UP_FIELD_NUMBER = 10;
    private static final m DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KIND_FIELD_NUMBER = 2;
    private static volatile fo<m> PARSER = null;
    public static final int PRIMARY_ALERT_ID_FIELD_NUMBER = 1;
    public static final int REPORTER_USERNAME_FIELD_NUMBER = 5;
    public static final int REPORT_IMAGE_ID_FIELD_NUMBER = 7;
    public static final int REPORT_TIME_FIELD_NUMBER = 4;
    public static final int SECONDS_TO_REPORT_FIELD_NUMBER = 11;
    public static final int SHOULD_PING_USER_FIELD_NUMBER = 12;
    public static final int THUMBS_UP_COUNT_FIELD_NUMBER = 9;
    private i alertAddress_;
    private r alertSourceInfo_;
    private boolean archive_;
    private y beepInfo_;
    private int bitField0_;
    private aa chatInfo_;
    private ac commentInfo_;
    private boolean currentUserIsReporter_;
    private boolean currentUserThumbedUp_;
    private int kind_;
    private long primaryAlertId_;
    private long reportTime_;
    private int secondsToReport_;
    private boolean shouldPingUser_;
    private int thumbsUpCount_;
    private String description_ = "";
    private String reporterUsername_ = "";
    private String reportImageId_ = "";

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        com.google.v.du.registerDefaultInstance(m.class, mVar);
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertAddress() {
        this.alertAddress_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertSourceInfo() {
        this.alertSourceInfo_ = null;
        this.bitField0_ &= -65537;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArchive() {
        this.bitField0_ &= -4097;
        this.archive_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeepInfo() {
        this.beepInfo_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChatInfo() {
        this.chatInfo_ = null;
        this.bitField0_ &= -32769;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommentInfo() {
        this.commentInfo_ = null;
        this.bitField0_ &= -16385;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentUserIsReporter() {
        this.bitField0_ &= -33;
        this.currentUserIsReporter_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentUserThumbedUp() {
        this.bitField0_ &= -513;
        this.currentUserThumbedUp_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -5;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.bitField0_ &= -3;
        this.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryAlertId() {
        this.bitField0_ &= -2;
        this.primaryAlertId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportImageId() {
        this.bitField0_ &= -65;
        this.reportImageId_ = getDefaultInstance().getReportImageId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportTime() {
        this.bitField0_ &= -9;
        this.reportTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReporterUsername() {
        this.bitField0_ &= -17;
        this.reporterUsername_ = getDefaultInstance().getReporterUsername();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondsToReport() {
        this.bitField0_ &= -1025;
        this.secondsToReport_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShouldPingUser() {
        this.bitField0_ &= -2049;
        this.shouldPingUser_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThumbsUpCount() {
        this.bitField0_ &= -257;
        this.thumbsUpCount_ = 0;
    }

    public static m getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertAddress(i iVar) {
        Objects.requireNonNull(iVar);
        i iVar2 = this.alertAddress_;
        if (iVar2 != null && iVar2 != i.getDefaultInstance()) {
            h hVarNewBuilder = i.newBuilder(iVar2);
            hVarNewBuilder.mergeFrom((h) iVar);
            iVar = hVarNewBuilder.buildPartial();
        }
        this.alertAddress_ = iVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertSourceInfo(r rVar) {
        Objects.requireNonNull(rVar);
        r rVar2 = this.alertSourceInfo_;
        if (rVar2 != null && rVar2 != r.getDefaultInstance()) {
            q qVarNewBuilder = r.newBuilder(rVar2);
            qVarNewBuilder.mergeFrom((q) rVar);
            rVar = qVarNewBuilder.buildPartial();
        }
        this.alertSourceInfo_ = rVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBeepInfo(y yVar) {
        Objects.requireNonNull(yVar);
        y yVar2 = this.beepInfo_;
        if (yVar2 != null && yVar2 != y.getDefaultInstance()) {
            x xVarNewBuilder = y.newBuilder(yVar2);
            xVarNewBuilder.mergeFrom((x) yVar);
            yVar = xVarNewBuilder.buildPartial();
        }
        this.beepInfo_ = yVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChatInfo(aa aaVar) {
        Objects.requireNonNull(aaVar);
        aa aaVar2 = this.chatInfo_;
        if (aaVar2 != null && aaVar2 != aa.getDefaultInstance()) {
            z zVarNewBuilder = aa.newBuilder(aaVar2);
            zVarNewBuilder.mergeFrom((z) aaVar);
            aaVar = zVarNewBuilder.buildPartial();
        }
        this.chatInfo_ = aaVar;
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCommentInfo(ac acVar) {
        Objects.requireNonNull(acVar);
        ac acVar2 = this.commentInfo_;
        if (acVar2 != null && acVar2 != ac.getDefaultInstance()) {
            ab abVarNewBuilder = ac.newBuilder(acVar2);
            abVarNewBuilder.mergeFrom((ab) acVar);
            acVar = abVarNewBuilder.buildPartial();
        }
        this.commentInfo_ = acVar;
        this.bitField0_ |= 16384;
    }

    public static l newBuilder() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public static m parseDelimitedFrom(InputStream inputStream) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(com.google.v.v vVar) {
        return (m) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<m> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertAddress(i iVar) {
        Objects.requireNonNull(iVar);
        this.alertAddress_ = iVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertSourceInfo(r rVar) {
        Objects.requireNonNull(rVar);
        this.alertSourceInfo_ = rVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArchive(boolean z) {
        this.bitField0_ |= 4096;
        this.archive_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeepInfo(y yVar) {
        Objects.requireNonNull(yVar);
        this.beepInfo_ = yVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatInfo(aa aaVar) {
        Objects.requireNonNull(aaVar);
        this.chatInfo_ = aaVar;
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommentInfo(ac acVar) {
        Objects.requireNonNull(acVar);
        this.commentInfo_ = acVar;
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentUserIsReporter(boolean z) {
        this.bitField0_ |= 32;
        this.currentUserIsReporter_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentUserThumbedUp(boolean z) {
        this.bitField0_ |= 512;
        this.currentUserThumbedUp_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(com.google.v.v vVar) {
        this.description_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(ah ahVar) {
        this.kind_ = ahVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryAlertId(long j2) {
        this.bitField0_ |= 1;
        this.primaryAlertId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportImageId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.reportImageId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportImageIdBytes(com.google.v.v vVar) {
        this.reportImageId_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportTime(long j2) {
        this.bitField0_ |= 8;
        this.reportTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReporterUsername(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.reporterUsername_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReporterUsernameBytes(com.google.v.v vVar) {
        this.reporterUsername_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondsToReport(int i2) {
        this.bitField0_ |= 1024;
        this.secondsToReport_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShouldPingUser(boolean z) {
        this.bitField0_ |= 2048;
        this.shouldPingUser_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThumbsUpCount(int i2) {
        this.bitField0_ |= 256;
        this.thumbsUpCount_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဈ\u0006\bဉ\u0007\tင\b\nဇ\t\u000bင\n\fဇ\u000b\rဇ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010", new Object[]{"bitField0_", "primaryAlertId_", "kind_", o.f16557c, "description_", "reportTime_", "reporterUsername_", "currentUserIsReporter_", "reportImageId_", "alertAddress_", "thumbsUpCount_", "currentUserThumbedUp_", "secondsToReport_", "shouldPingUser_", "archive_", "beepInfo_", "commentInfo_", "chatInfo_", "alertSourceInfo_"});
        }
        if (iOrdinal == 3) {
            return new m();
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
        fo<m> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (m.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i getAlertAddress() {
        i iVar = this.alertAddress_;
        return iVar == null ? i.getDefaultInstance() : iVar;
    }

    public r getAlertSourceInfo() {
        r rVar = this.alertSourceInfo_;
        return rVar == null ? r.getDefaultInstance() : rVar;
    }

    public boolean getArchive() {
        return this.archive_;
    }

    public y getBeepInfo() {
        y yVar = this.beepInfo_;
        return yVar == null ? y.getDefaultInstance() : yVar;
    }

    public aa getChatInfo() {
        aa aaVar = this.chatInfo_;
        return aaVar == null ? aa.getDefaultInstance() : aaVar;
    }

    public ac getCommentInfo() {
        ac acVar = this.commentInfo_;
        return acVar == null ? ac.getDefaultInstance() : acVar;
    }

    public boolean getCurrentUserIsReporter() {
        return this.currentUserIsReporter_;
    }

    public boolean getCurrentUserThumbedUp() {
        return this.currentUserThumbedUp_;
    }

    public String getDescription() {
        return this.description_;
    }

    public com.google.v.v getDescriptionBytes() {
        return com.google.v.v.s(this.description_);
    }

    public ah getKind() {
        ah ahVarA = ah.a(this.kind_);
        return ahVarA == null ? ah.PRIMARY : ahVarA;
    }

    public long getPrimaryAlertId() {
        return this.primaryAlertId_;
    }

    public String getReportImageId() {
        return this.reportImageId_;
    }

    public com.google.v.v getReportImageIdBytes() {
        return com.google.v.v.s(this.reportImageId_);
    }

    public long getReportTime() {
        return this.reportTime_;
    }

    public String getReporterUsername() {
        return this.reporterUsername_;
    }

    public com.google.v.v getReporterUsernameBytes() {
        return com.google.v.v.s(this.reporterUsername_);
    }

    public int getSecondsToReport() {
        return this.secondsToReport_;
    }

    public boolean getShouldPingUser() {
        return this.shouldPingUser_;
    }

    public int getThumbsUpCount() {
        return this.thumbsUpCount_;
    }

    public boolean hasAlertAddress() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasAlertSourceInfo() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasArchive() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasBeepInfo() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasChatInfo() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasCommentInfo() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasCurrentUserIsReporter() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasCurrentUserThumbedUp() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasKind() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPrimaryAlertId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasReportImageId() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasReportTime() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasReporterUsername() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSecondsToReport() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasShouldPingUser() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasThumbsUpCount() {
        return (this.bitField0_ & 256) != 0;
    }

    public static l newBuilder(m mVar) {
        return (l) DEFAULT_INSTANCE.createBuilder(mVar);
    }

    public static m parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (m) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static m parseFrom(com.google.v.z zVar) {
        return (m) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static m parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (m) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static m parseFrom(InputStream inputStream) {
        return (m) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (m) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(ByteBuffer byteBuffer) {
        return (m) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (m) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static m parseFrom(byte[] bArr) {
        return (m) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static m parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (m) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
