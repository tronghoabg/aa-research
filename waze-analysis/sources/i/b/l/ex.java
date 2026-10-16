package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ex extends com.google.v.du<ex, ew> implements ey {
    private static final ex DEFAULT_INSTANCE;
    public static final int ISEXPIRED_FIELD_NUMBER = 3;
    public static final int ISINMEETING_FIELD_NUMBER = 2;
    public static final int MEETINGINFO_FIELD_NUMBER = 1;
    public static final int ONDEMAND_FIELD_NUMBER = 5;
    public static final int OWNERPERSISTENTID_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<ex> PARSER;
    private int bitField0_;
    private boolean isExpired_;
    private boolean isInMeeting_;
    private i.b.p.x meetingInfo_;
    private boolean onDemand_;
    private String ownerPersistentId_ = "";

    static {
        ex exVar = new ex();
        DEFAULT_INSTANCE = exVar;
        com.google.v.du.registerDefaultInstance(ex.class, exVar);
    }

    private ex() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsExpired() {
        this.bitField0_ &= -5;
        this.isExpired_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInMeeting() {
        this.bitField0_ &= -3;
        this.isInMeeting_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeetingInfo() {
        this.meetingInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnDemand() {
        this.bitField0_ &= -17;
        this.onDemand_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOwnerPersistentId() {
        this.bitField0_ &= -9;
        this.ownerPersistentId_ = getDefaultInstance().getOwnerPersistentId();
    }

    public static ex getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMeetingInfo(i.b.p.x xVar) {
        Objects.requireNonNull(xVar);
        i.b.p.x xVar2 = this.meetingInfo_;
        if (xVar2 != null && xVar2 != i.b.p.x.getDefaultInstance()) {
            i.b.p.v vVarNewBuilder = i.b.p.x.newBuilder(xVar2);
            vVarNewBuilder.mergeFrom((i.b.p.v) xVar);
            xVar = vVarNewBuilder.buildPartial();
        }
        this.meetingInfo_ = xVar;
        this.bitField0_ |= 1;
    }

    public static ew newBuilder() {
        return (ew) DEFAULT_INSTANCE.createBuilder();
    }

    public static ex parseDelimitedFrom(InputStream inputStream) {
        return (ex) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ex parseFrom(com.google.v.v vVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ex> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsExpired(boolean z) {
        this.bitField0_ |= 4;
        this.isExpired_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInMeeting(boolean z) {
        this.bitField0_ |= 2;
        this.isInMeeting_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeetingInfo(i.b.p.x xVar) {
        Objects.requireNonNull(xVar);
        this.meetingInfo_ = xVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnDemand(boolean z) {
        this.bitField0_ |= 16;
        this.onDemand_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerPersistentId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.ownerPersistentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerPersistentIdBytes(com.google.v.v vVar) {
        this.ownerPersistentId_ = vVar.u();
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "meetingInfo_", "isInMeeting_", "isExpired_", "ownerPersistentId_", "onDemand_"});
        }
        if (iOrdinal == 3) {
            return new ex();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ew(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ex> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ex.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsExpired() {
        return this.isExpired_;
    }

    public boolean getIsInMeeting() {
        return this.isInMeeting_;
    }

    public i.b.p.x getMeetingInfo() {
        i.b.p.x xVar = this.meetingInfo_;
        return xVar == null ? i.b.p.x.getDefaultInstance() : xVar;
    }

    public boolean getOnDemand() {
        return this.onDemand_;
    }

    public String getOwnerPersistentId() {
        return this.ownerPersistentId_;
    }

    public com.google.v.v getOwnerPersistentIdBytes() {
        return com.google.v.v.s(this.ownerPersistentId_);
    }

    public boolean hasIsExpired() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsInMeeting() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMeetingInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOnDemand() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasOwnerPersistentId() {
        return (this.bitField0_ & 8) != 0;
    }

    public static ew newBuilder(ex exVar) {
        return (ew) DEFAULT_INSTANCE.createBuilder(exVar);
    }

    public static ex parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ex) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ex parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ex parseFrom(com.google.v.z zVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ex parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ex parseFrom(InputStream inputStream) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ex parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ex parseFrom(ByteBuffer byteBuffer) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ex parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ex parseFrom(byte[] bArr) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ex parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
