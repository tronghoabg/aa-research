package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class sn extends com.google.v.du<sn, sm> implements com.google.v.fj {
    public static final int CHANGEDDEPARTURE_FIELD_NUMBER = 1;
    public static final int CHANGEDDESTINATION_FIELD_NUMBER = 2;
    public static final int DANGERZONE_FIELD_NUMBER = 5;
    private static final sn DEFAULT_INSTANCE;
    public static final int FERRY_FIELD_NUMBER = 4;
    public static final int HOV_FIELD_NUMBER = 6;
    private static volatile com.google.v.fo<sn> PARSER = null;
    public static final int TOLL_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean changedDeparture_;
    private boolean changedDestination_;
    private boolean dangerZone_;
    private boolean ferry_;
    private boolean hov_;
    private boolean toll_;

    static {
        sn snVar = new sn();
        DEFAULT_INSTANCE = snVar;
        com.google.v.du.registerDefaultInstance(sn.class, snVar);
    }

    private sn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedDeparture() {
        this.bitField0_ &= -2;
        this.changedDeparture_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedDestination() {
        this.bitField0_ &= -3;
        this.changedDestination_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDangerZone() {
        this.bitField0_ &= -17;
        this.dangerZone_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFerry() {
        this.bitField0_ &= -9;
        this.ferry_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHov() {
        this.bitField0_ &= -33;
        this.hov_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToll() {
        this.bitField0_ &= -5;
        this.toll_ = false;
    }

    public static sn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static sm newBuilder() {
        return (sm) DEFAULT_INSTANCE.createBuilder();
    }

    public static sn parseDelimitedFrom(InputStream inputStream) {
        return (sn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sn parseFrom(com.google.v.v vVar) {
        return (sn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<sn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedDeparture(boolean z) {
        this.bitField0_ |= 1;
        this.changedDeparture_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedDestination(boolean z) {
        this.bitField0_ |= 2;
        this.changedDestination_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDangerZone(boolean z) {
        this.bitField0_ |= 16;
        this.dangerZone_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFerry(boolean z) {
        this.bitField0_ |= 8;
        this.ferry_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHov(boolean z) {
        this.bitField0_ |= 32;
        this.hov_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToll(boolean z) {
        this.bitField0_ |= 4;
        this.toll_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "changedDeparture_", "changedDestination_", "toll_", "ferry_", "dangerZone_", "hov_"});
        }
        if (iOrdinal == 3) {
            return new sn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new sm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<sn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (sn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getChangedDeparture() {
        return this.changedDeparture_;
    }

    public boolean getChangedDestination() {
        return this.changedDestination_;
    }

    @Deprecated
    public boolean getDangerZone() {
        return this.dangerZone_;
    }

    @Deprecated
    public boolean getFerry() {
        return this.ferry_;
    }

    @Deprecated
    public boolean getHov() {
        return this.hov_;
    }

    @Deprecated
    public boolean getToll() {
        return this.toll_;
    }

    public boolean hasChangedDeparture() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasChangedDestination() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasDangerZone() {
        return (this.bitField0_ & 16) != 0;
    }

    @Deprecated
    public boolean hasFerry() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasHov() {
        return (this.bitField0_ & 32) != 0;
    }

    @Deprecated
    public boolean hasToll() {
        return (this.bitField0_ & 4) != 0;
    }

    public static sm newBuilder(sn snVar) {
        return (sm) DEFAULT_INSTANCE.createBuilder(snVar);
    }

    public static sn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (sn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static sn parseFrom(com.google.v.z zVar) {
        return (sn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static sn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (sn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static sn parseFrom(InputStream inputStream) {
        return (sn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sn parseFrom(ByteBuffer byteBuffer) {
        return (sn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static sn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (sn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static sn parseFrom(byte[] bArr) {
        return (sn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static sn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (sn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
