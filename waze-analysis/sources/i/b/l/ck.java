package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ck extends com.google.v.du<ck, cj> implements com.google.v.fj {
    private static final ck DEFAULT_INSTANCE;
    public static final int MEETINGID_FIELD_NUMBER = 1;
    public static final int MEETINGINFO_FIELD_NUMBER = 3;
    public static final int MEETINGURL_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ck> PARSER;
    private int bitField0_;
    private i.b.p.x meetingInfo_;
    private String meetingID_ = "";
    private String meetingUrl_ = "";

    static {
        ck ckVar = new ck();
        DEFAULT_INSTANCE = ckVar;
        com.google.v.du.registerDefaultInstance(ck.class, ckVar);
    }

    private ck() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeetingID() {
        this.bitField0_ &= -2;
        this.meetingID_ = getDefaultInstance().getMeetingID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeetingInfo() {
        this.meetingInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeetingUrl() {
        this.bitField0_ &= -3;
        this.meetingUrl_ = getDefaultInstance().getMeetingUrl();
    }

    public static ck getDefaultInstance() {
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
        this.bitField0_ |= 4;
    }

    public static cj newBuilder() {
        return (cj) DEFAULT_INSTANCE.createBuilder();
    }

    public static ck parseDelimitedFrom(InputStream inputStream) {
        return (ck) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ck parseFrom(com.google.v.v vVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ck> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeetingID(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.meetingID_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeetingIDBytes(com.google.v.v vVar) {
        this.meetingID_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeetingInfo(i.b.p.x xVar) {
        Objects.requireNonNull(xVar);
        this.meetingInfo_ = xVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeetingUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.meetingUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeetingUrlBytes(com.google.v.v vVar) {
        this.meetingUrl_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "meetingID_", "meetingUrl_", "meetingInfo_"});
        }
        if (iOrdinal == 3) {
            return new ck();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ck> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ck.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getMeetingID() {
        return this.meetingID_;
    }

    public com.google.v.v getMeetingIDBytes() {
        return com.google.v.v.s(this.meetingID_);
    }

    public i.b.p.x getMeetingInfo() {
        i.b.p.x xVar = this.meetingInfo_;
        return xVar == null ? i.b.p.x.getDefaultInstance() : xVar;
    }

    public String getMeetingUrl() {
        return this.meetingUrl_;
    }

    public com.google.v.v getMeetingUrlBytes() {
        return com.google.v.v.s(this.meetingUrl_);
    }

    public boolean hasMeetingID() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMeetingInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMeetingUrl() {
        return (this.bitField0_ & 2) != 0;
    }

    public static cj newBuilder(ck ckVar) {
        return (cj) DEFAULT_INSTANCE.createBuilder(ckVar);
    }

    public static ck parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ck) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ck parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ck parseFrom(com.google.v.z zVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ck parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ck parseFrom(InputStream inputStream) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ck parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ck parseFrom(ByteBuffer byteBuffer) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ck parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ck parseFrom(byte[] bArr) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ck parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
