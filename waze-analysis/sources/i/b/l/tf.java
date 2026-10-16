package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class tf extends com.google.v.du<tf, te> implements com.google.v.fj {
    private static final tf DEFAULT_INSTANCE;
    public static final int MEETINGID_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<tf> PARSER = null;
    public static final int SESSION_FIELD_NUMBER = 3;
    public static final int SHOULDSHAREINFOWITHDRIVER_FIELD_NUMBER = 2;
    private int bitField0_;
    private String meetingID_ = "";
    private th session_;
    private boolean shouldShareInfoWithDriver_;

    static {
        tf tfVar = new tf();
        DEFAULT_INSTANCE = tfVar;
        com.google.v.du.registerDefaultInstance(tf.class, tfVar);
    }

    private tf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeetingID() {
        this.bitField0_ &= -2;
        this.meetingID_ = getDefaultInstance().getMeetingID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSession() {
        this.session_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShouldShareInfoWithDriver() {
        this.bitField0_ &= -3;
        this.shouldShareInfoWithDriver_ = false;
    }

    public static tf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSession(th thVar) {
        Objects.requireNonNull(thVar);
        th thVar2 = this.session_;
        if (thVar2 != null && thVar2 != th.getDefaultInstance()) {
            tg tgVarNewBuilder = th.newBuilder(thVar2);
            tgVarNewBuilder.mergeFrom((tg) thVar);
            thVar = tgVarNewBuilder.buildPartial();
        }
        this.session_ = thVar;
        this.bitField0_ |= 4;
    }

    public static te newBuilder() {
        return (te) DEFAULT_INSTANCE.createBuilder();
    }

    public static tf parseDelimitedFrom(InputStream inputStream) {
        return (tf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tf parseFrom(com.google.v.v vVar) {
        return (tf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<tf> parser() {
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
    public void setSession(th thVar) {
        Objects.requireNonNull(thVar);
        this.session_ = thVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShouldShareInfoWithDriver(boolean z) {
        this.bitField0_ |= 2;
        this.shouldShareInfoWithDriver_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "meetingID_", "shouldShareInfoWithDriver_", "session_"});
        }
        if (iOrdinal == 3) {
            return new tf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new te(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<tf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (tf.class) {
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

    public th getSession() {
        th thVar = this.session_;
        return thVar == null ? th.getDefaultInstance() : thVar;
    }

    public boolean getShouldShareInfoWithDriver() {
        return this.shouldShareInfoWithDriver_;
    }

    public boolean hasMeetingID() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSession() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasShouldShareInfoWithDriver() {
        return (this.bitField0_ & 2) != 0;
    }

    public static te newBuilder(tf tfVar) {
        return (te) DEFAULT_INSTANCE.createBuilder(tfVar);
    }

    public static tf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (tf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static tf parseFrom(com.google.v.z zVar) {
        return (tf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static tf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (tf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static tf parseFrom(InputStream inputStream) {
        return (tf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tf parseFrom(ByteBuffer byteBuffer) {
        return (tf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static tf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (tf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static tf parseFrom(byte[] bArr) {
        return (tf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static tf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (tf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
