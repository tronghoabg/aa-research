package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bjr extends com.google.v.du<bjr, bjo> implements bjs {
    private static final bjr DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bjr> PARSER = null;
    public static final int TRAFFIC_SEVERITY_FIELD_NUMBER = 2;
    public static final int TRAFFIC_TYPE_FIELD_NUMBER = 1;
    private int trafficSeverity_;
    private int trafficType_;

    static {
        bjr bjrVar = new bjr();
        DEFAULT_INSTANCE = bjrVar;
        com.google.v.du.registerDefaultInstance(bjr.class, bjrVar);
    }

    private bjr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficSeverity() {
        this.trafficSeverity_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficType() {
        this.trafficType_ = 0;
    }

    public static bjr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bjo newBuilder() {
        return (bjo) DEFAULT_INSTANCE.createBuilder();
    }

    public static bjr parseDelimitedFrom(InputStream inputStream) {
        return (bjr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bjr parseFrom(com.google.v.v vVar) {
        return (bjr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bjr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficSeverity(bjp bjpVar) {
        this.trafficSeverity_ = bjpVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficSeverityValue(int i2) {
        this.trafficSeverity_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficType(bjq bjqVar) {
        this.trafficType_ = bjqVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficTypeValue(int i2) {
        this.trafficType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"trafficType_", "trafficSeverity_"});
        }
        if (iOrdinal == 3) {
            return new bjr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bjo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bjr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bjr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bjp getTrafficSeverity() {
        int i2 = this.trafficSeverity_;
        bjp bjpVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : bjp.CLOSED_ROAD : bjp.LIGHT : bjp.MODERATE : bjp.HEAVY : bjp.STANDSTILL : bjp.TRAFFIC_SEVERITY_UNSPECIFIED;
        return bjpVar == null ? bjp.UNRECOGNIZED : bjpVar;
    }

    public int getTrafficSeverityValue() {
        return this.trafficSeverity_;
    }

    public bjq getTrafficType() {
        int i2 = this.trafficType_;
        bjq bjqVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : bjq.CLOSURE : bjq.HAZARD : bjq.ACCIDENT : bjq.CHITCHAT : bjq.TRAFFIC_TYPE_UNSPECIFIED;
        return bjqVar == null ? bjq.UNRECOGNIZED : bjqVar;
    }

    public int getTrafficTypeValue() {
        return this.trafficType_;
    }

    public static bjo newBuilder(bjr bjrVar) {
        return (bjo) DEFAULT_INSTANCE.createBuilder(bjrVar);
    }

    public static bjr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bjr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bjr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bjr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bjr parseFrom(com.google.v.z zVar) {
        return (bjr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bjr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bjr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bjr parseFrom(InputStream inputStream) {
        return (bjr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bjr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bjr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bjr parseFrom(ByteBuffer byteBuffer) {
        return (bjr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bjr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bjr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bjr parseFrom(byte[] bArr) {
        return (bjr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bjr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bjr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
