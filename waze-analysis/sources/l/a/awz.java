package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class awz extends com.google.v.du<awz, awy> implements com.google.v.fj {
    private static final awz DEFAULT_INSTANCE;
    public static final int ETA_SHOWN_FIELD_NUMBER = 1;
    public static final int LEAVE_ARRIVE_SHOWN_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<awz> PARSER = null;
    public static final int RT_TRAFFIC_SHOWN_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean etaShown_;
    private boolean leaveArriveShown_;
    private boolean rtTrafficShown_;

    static {
        awz awzVar = new awz();
        DEFAULT_INSTANCE = awzVar;
        com.google.v.du.registerDefaultInstance(awz.class, awzVar);
    }

    private awz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaShown() {
        this.bitField0_ &= -2;
        this.etaShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeaveArriveShown() {
        this.bitField0_ &= -5;
        this.leaveArriveShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtTrafficShown() {
        this.bitField0_ &= -3;
        this.rtTrafficShown_ = false;
    }

    public static awz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static awy newBuilder() {
        return (awy) DEFAULT_INSTANCE.createBuilder();
    }

    public static awz parseDelimitedFrom(InputStream inputStream) {
        return (awz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static awz parseFrom(com.google.v.v vVar) {
        return (awz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<awz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaShown(boolean z) {
        this.bitField0_ |= 1;
        this.etaShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeaveArriveShown(boolean z) {
        this.bitField0_ |= 4;
        this.leaveArriveShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtTrafficShown(boolean z) {
        this.bitField0_ |= 2;
        this.rtTrafficShown_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "etaShown_", "rtTrafficShown_", "leaveArriveShown_"});
        }
        if (iOrdinal == 3) {
            return new awz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new awy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<awz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (awz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getEtaShown() {
        return this.etaShown_;
    }

    public boolean getLeaveArriveShown() {
        return this.leaveArriveShown_;
    }

    public boolean getRtTrafficShown() {
        return this.rtTrafficShown_;
    }

    public boolean hasEtaShown() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLeaveArriveShown() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRtTrafficShown() {
        return (this.bitField0_ & 2) != 0;
    }

    public static awy newBuilder(awz awzVar) {
        return (awy) DEFAULT_INSTANCE.createBuilder(awzVar);
    }

    public static awz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (awz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static awz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (awz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static awz parseFrom(com.google.v.z zVar) {
        return (awz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static awz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (awz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static awz parseFrom(InputStream inputStream) {
        return (awz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static awz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (awz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static awz parseFrom(ByteBuffer byteBuffer) {
        return (awz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static awz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (awz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static awz parseFrom(byte[] bArr) {
        return (awz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static awz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (awz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
