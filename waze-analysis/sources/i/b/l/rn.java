package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class rn extends com.google.v.du<rn, rm> implements ro {
    private static final rn DEFAULT_INSTANCE;
    public static final int ETA_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<rn> PARSER = null;
    public static final int ROUTE_LENGTH_IN_MINUTES_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 4;
    public static final int TIME_TO_LEAVE_FIELD_NUMBER = 1;
    private int bitField0_;
    private long eta_;
    private int routeLengthInMinutes_;
    private String text_ = "";
    private long timeToLeave_;

    static {
        rn rnVar = new rn();
        DEFAULT_INSTANCE = rnVar;
        com.google.v.du.registerDefaultInstance(rn.class, rnVar);
    }

    private rn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEta() {
        this.bitField0_ &= -3;
        this.eta_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteLengthInMinutes() {
        this.bitField0_ &= -5;
        this.routeLengthInMinutes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.bitField0_ &= -9;
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToLeave() {
        this.bitField0_ &= -2;
        this.timeToLeave_ = 0L;
    }

    public static rn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static rm newBuilder() {
        return (rm) DEFAULT_INSTANCE.createBuilder();
    }

    public static rn parseDelimitedFrom(InputStream inputStream) {
        return (rn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rn parseFrom(com.google.v.v vVar) {
        return (rn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<rn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEta(long j2) {
        this.bitField0_ |= 2;
        this.eta_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteLengthInMinutes(int i2) {
        this.bitField0_ |= 4;
        this.routeLengthInMinutes_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(com.google.v.v vVar) {
        this.text_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToLeave(long j2) {
        this.bitField0_ |= 1;
        this.timeToLeave_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "timeToLeave_", "eta_", "routeLengthInMinutes_", "text_"});
        }
        if (iOrdinal == 3) {
            return new rn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new rm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<rn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (rn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getEta() {
        return this.eta_;
    }

    public int getRouteLengthInMinutes() {
        return this.routeLengthInMinutes_;
    }

    public String getText() {
        return this.text_;
    }

    public com.google.v.v getTextBytes() {
        return com.google.v.v.s(this.text_);
    }

    public long getTimeToLeave() {
        return this.timeToLeave_;
    }

    public boolean hasEta() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRouteLengthInMinutes() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasText() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTimeToLeave() {
        return (this.bitField0_ & 1) != 0;
    }

    public static rm newBuilder(rn rnVar) {
        return (rm) DEFAULT_INSTANCE.createBuilder(rnVar);
    }

    public static rn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (rn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static rn parseFrom(com.google.v.z zVar) {
        return (rn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static rn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (rn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static rn parseFrom(InputStream inputStream) {
        return (rn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rn parseFrom(ByteBuffer byteBuffer) {
        return (rn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static rn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (rn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static rn parseFrom(byte[] bArr) {
        return (rn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static rn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (rn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
