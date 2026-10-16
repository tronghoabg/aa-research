package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class avu extends com.google.v.du<avu, avt> implements com.google.v.fj {
    public static final int BATTERY_HEAT_MEASUREMENT_FIELD_NUMBER = 1;
    public static final int BATTERY_PERCENTAGE_FIELD_NUMBER = 2;
    public static final int CHARGER_CONNECTED_FIELD_NUMBER = 7;
    private static final avu DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<avu> PARSER;
    private long batteryHeatMeasurement_;
    private long batteryPercentage_;
    private int bitField0_;
    private boolean chargerConnected_;

    static {
        avu avuVar = new avu();
        DEFAULT_INSTANCE = avuVar;
        com.google.v.du.registerDefaultInstance(avu.class, avuVar);
    }

    private avu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatteryHeatMeasurement() {
        this.bitField0_ &= -2;
        this.batteryHeatMeasurement_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatteryPercentage() {
        this.bitField0_ &= -3;
        this.batteryPercentage_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChargerConnected() {
        this.bitField0_ &= -5;
        this.chargerConnected_ = false;
    }

    public static avu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static avt newBuilder() {
        return (avt) DEFAULT_INSTANCE.createBuilder();
    }

    public static avu parseDelimitedFrom(InputStream inputStream) {
        return (avu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static avu parseFrom(com.google.v.v vVar) {
        return (avu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<avu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatteryHeatMeasurement(long j2) {
        this.bitField0_ |= 1;
        this.batteryHeatMeasurement_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatteryPercentage(long j2) {
        this.bitField0_ |= 2;
        this.batteryPercentage_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChargerConnected(boolean z) {
        this.bitField0_ |= 4;
        this.chargerConnected_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001တ\u0000\u0002တ\u0001\u0007ဇ\u0002", new Object[]{"bitField0_", "batteryHeatMeasurement_", "batteryPercentage_", "chargerConnected_"});
        }
        if (iOrdinal == 3) {
            return new avu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new avt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<avu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (avu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getBatteryHeatMeasurement() {
        return this.batteryHeatMeasurement_;
    }

    public long getBatteryPercentage() {
        return this.batteryPercentage_;
    }

    public boolean getChargerConnected() {
        return this.chargerConnected_;
    }

    public boolean hasBatteryHeatMeasurement() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasBatteryPercentage() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasChargerConnected() {
        return (this.bitField0_ & 4) != 0;
    }

    public static avt newBuilder(avu avuVar) {
        return (avt) DEFAULT_INSTANCE.createBuilder(avuVar);
    }

    public static avu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (avu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static avu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (avu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static avu parseFrom(com.google.v.z zVar) {
        return (avu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static avu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (avu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static avu parseFrom(InputStream inputStream) {
        return (avu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static avu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (avu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static avu parseFrom(ByteBuffer byteBuffer) {
        return (avu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static avu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (avu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static avu parseFrom(byte[] bArr) {
        return (avu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static avu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (avu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
