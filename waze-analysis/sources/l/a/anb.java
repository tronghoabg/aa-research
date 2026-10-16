package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class anb extends com.google.v.du<anb, ana> implements com.google.v.fj {
    public static final int AT_LEAST_ONE_POPULAR_FIELD_NUMBER = 3;
    private static final anb DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<anb> PARSER = null;
    public static final int PRESENTED_PINS_COUNT_FIELD_NUMBER = 2;
    public static final int RECEIVED_PINS_COUNT_FIELD_NUMBER = 1;
    private boolean atLeastOnePopular_;
    private int bitField0_;
    private long presentedPinsCount_;
    private long receivedPinsCount_;

    static {
        anb anbVar = new anb();
        DEFAULT_INSTANCE = anbVar;
        com.google.v.du.registerDefaultInstance(anb.class, anbVar);
    }

    private anb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAtLeastOnePopular() {
        this.bitField0_ &= -5;
        this.atLeastOnePopular_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPresentedPinsCount() {
        this.bitField0_ &= -3;
        this.presentedPinsCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReceivedPinsCount() {
        this.bitField0_ &= -2;
        this.receivedPinsCount_ = 0L;
    }

    public static anb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ana newBuilder() {
        return (ana) DEFAULT_INSTANCE.createBuilder();
    }

    public static anb parseDelimitedFrom(InputStream inputStream) {
        return (anb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static anb parseFrom(com.google.v.v vVar) {
        return (anb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<anb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAtLeastOnePopular(boolean z) {
        this.bitField0_ |= 4;
        this.atLeastOnePopular_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresentedPinsCount(long j2) {
        this.bitField0_ |= 2;
        this.presentedPinsCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReceivedPinsCount(long j2) {
        this.bitField0_ |= 1;
        this.receivedPinsCount_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "receivedPinsCount_", "presentedPinsCount_", "atLeastOnePopular_"});
        }
        if (iOrdinal == 3) {
            return new anb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ana(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<anb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (anb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAtLeastOnePopular() {
        return this.atLeastOnePopular_;
    }

    public long getPresentedPinsCount() {
        return this.presentedPinsCount_;
    }

    public long getReceivedPinsCount() {
        return this.receivedPinsCount_;
    }

    public boolean hasAtLeastOnePopular() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPresentedPinsCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasReceivedPinsCount() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ana newBuilder(anb anbVar) {
        return (ana) DEFAULT_INSTANCE.createBuilder(anbVar);
    }

    public static anb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (anb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static anb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (anb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static anb parseFrom(com.google.v.z zVar) {
        return (anb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static anb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (anb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static anb parseFrom(InputStream inputStream) {
        return (anb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static anb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (anb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static anb parseFrom(ByteBuffer byteBuffer) {
        return (anb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static anb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (anb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static anb parseFrom(byte[] bArr) {
        return (anb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static anb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (anb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
