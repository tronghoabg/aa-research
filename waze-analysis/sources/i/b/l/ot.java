package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ot extends com.google.v.du<ot, os> implements com.google.v.fj {
    public static final int ARRIVE_AT_FIELD_NUMBER = 3;
    private static final ot DEFAULT_INSTANCE;
    public static final int INTERVAL_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ot> PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 1;
    private boolean arriveAt_;
    private int bitField0_;
    private int interval_;
    private int range_;

    static {
        ot otVar = new ot();
        DEFAULT_INSTANCE = otVar;
        com.google.v.du.registerDefaultInstance(ot.class, otVar);
    }

    private ot() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArriveAt() {
        this.bitField0_ &= -5;
        this.arriveAt_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInterval() {
        this.bitField0_ &= -3;
        this.interval_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRange() {
        this.bitField0_ &= -2;
        this.range_ = 0;
    }

    public static ot getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static os newBuilder() {
        return (os) DEFAULT_INSTANCE.createBuilder();
    }

    public static ot parseDelimitedFrom(InputStream inputStream) {
        return (ot) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ot parseFrom(com.google.v.v vVar) {
        return (ot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ot> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArriveAt(boolean z) {
        this.bitField0_ |= 4;
        this.arriveAt_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInterval(int i2) {
        this.bitField0_ |= 2;
        this.interval_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRange(int i2) {
        this.bitField0_ |= 1;
        this.range_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "range_", "interval_", "arriveAt_"});
        }
        if (iOrdinal == 3) {
            return new ot();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new os(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ot> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ot.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getArriveAt() {
        return this.arriveAt_;
    }

    public int getInterval() {
        return this.interval_;
    }

    public int getRange() {
        return this.range_;
    }

    public boolean hasArriveAt() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasInterval() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRange() {
        return (this.bitField0_ & 1) != 0;
    }

    public static os newBuilder(ot otVar) {
        return (os) DEFAULT_INSTANCE.createBuilder(otVar);
    }

    public static ot parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ot) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ot parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ot parseFrom(com.google.v.z zVar) {
        return (ot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ot parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ot parseFrom(InputStream inputStream) {
        return (ot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ot parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ot parseFrom(ByteBuffer byteBuffer) {
        return (ot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ot parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ot parseFrom(byte[] bArr) {
        return (ot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ot parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ot) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
