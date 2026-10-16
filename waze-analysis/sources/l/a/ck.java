package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ck extends com.google.v.du<ck, cj> implements cl {
    public static final int ALERT_ID_FIELD_NUMBER = 1;
    public static final int ALERT_UUID_FIELD_NUMBER = 7;
    private static final ck DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ck> PARSER = null;
    public static final int SEGMENT_INFO_FIELD_NUMBER = 6;
    public static final int SUBTYPE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    private long alertId_;
    private String alertUuid_ = "";
    private int bitField0_;
    private bad segmentInfo_;
    private long subtype_;
    private long type_;

    static {
        ck ckVar = new ck();
        DEFAULT_INSTANCE = ckVar;
        com.google.v.du.registerDefaultInstance(ck.class, ckVar);
    }

    private ck() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertId() {
        this.alertId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertUuid() {
        this.alertUuid_ = getDefaultInstance().getAlertUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentInfo() {
        this.segmentInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtype() {
        this.bitField0_ &= -3;
        this.subtype_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0L;
    }

    public static ck getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegmentInfo(bad badVar) {
        Objects.requireNonNull(badVar);
        bad badVar2 = this.segmentInfo_;
        if (badVar2 != null && badVar2 != bad.getDefaultInstance()) {
            bac bacVarNewBuilder = bad.newBuilder(badVar2);
            bacVarNewBuilder.mergeFrom((bac) badVar);
            badVar = bacVarNewBuilder.buildPartial();
        }
        this.segmentInfo_ = badVar;
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
    public void setAlertId(long j2) {
        this.alertId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertUuid(String str) {
        Objects.requireNonNull(str);
        this.alertUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertUuidBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.alertUuid_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentInfo(bad badVar) {
        Objects.requireNonNull(badVar);
        this.segmentInfo_ = badVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtype(long j2) {
        this.bitField0_ |= 2;
        this.subtype_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(long j2) {
        this.bitField0_ |= 1;
        this.type_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001\u0002\u0002ဂ\u0000\u0003ဂ\u0001\u0006ဉ\u0002\u0007Ȉ", new Object[]{"bitField0_", "alertId_", "type_", "subtype_", "segmentInfo_", "alertUuid_"});
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

    public long getAlertId() {
        return this.alertId_;
    }

    public String getAlertUuid() {
        return this.alertUuid_;
    }

    public com.google.v.v getAlertUuidBytes() {
        return com.google.v.v.s(this.alertUuid_);
    }

    public bad getSegmentInfo() {
        bad badVar = this.segmentInfo_;
        return badVar == null ? bad.getDefaultInstance() : badVar;
    }

    public long getSubtype() {
        return this.subtype_;
    }

    public long getType() {
        return this.type_;
    }

    public boolean hasSegmentInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSubtype() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
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
