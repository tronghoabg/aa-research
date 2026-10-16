package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bti extends com.google.v.du<bti, btg> implements com.google.v.fj {
    private static final bti DEFAULT_INSTANCE;
    public static final int DISTANCE_METERS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<bti> PARSER = null;
    public static final int SILENT_FIELD_NUMBER = 3;
    public static final int ZONE_TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private long distanceMeters_;
    private boolean silent_;
    private int zoneType_;

    static {
        bti btiVar = new bti();
        DEFAULT_INSTANCE = btiVar;
        com.google.v.du.registerDefaultInstance(bti.class, btiVar);
    }

    private bti() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceMeters() {
        this.bitField0_ &= -2;
        this.distanceMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSilent() {
        this.bitField0_ &= -3;
        this.silent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZoneType() {
        this.zoneType_ = 0;
    }

    public static bti getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static btg newBuilder() {
        return (btg) DEFAULT_INSTANCE.createBuilder();
    }

    public static bti parseDelimitedFrom(InputStream inputStream) {
        return (bti) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bti parseFrom(com.google.v.v vVar) {
        return (bti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bti> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceMeters(long j2) {
        this.bitField0_ |= 1;
        this.distanceMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSilent(boolean z) {
        this.bitField0_ |= 2;
        this.silent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZoneType(bth bthVar) {
        this.zoneType_ = bthVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZoneTypeValue(int i2) {
        this.zoneType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဂ\u0000\u0003ဇ\u0001", new Object[]{"bitField0_", "zoneType_", "distanceMeters_", "silent_"});
        }
        if (iOrdinal == 3) {
            return new bti();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new btg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bti> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bti.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getDistanceMeters() {
        return this.distanceMeters_;
    }

    public boolean getSilent() {
        return this.silent_;
    }

    public bth getZoneType() {
        int i2 = this.zoneType_;
        bth bthVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : bth.ENFORCEMENT_ZONE : bth.AVERAGE_SPEED_CAMERA_ZONE : bth.ZONE_TYPE_UNSPECIFIED;
        return bthVar == null ? bth.UNRECOGNIZED : bthVar;
    }

    public int getZoneTypeValue() {
        return this.zoneType_;
    }

    public boolean hasDistanceMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSilent() {
        return (this.bitField0_ & 2) != 0;
    }

    public static btg newBuilder(bti btiVar) {
        return (btg) DEFAULT_INSTANCE.createBuilder(btiVar);
    }

    public static bti parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bti) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bti parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bti parseFrom(com.google.v.z zVar) {
        return (bti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bti parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bti parseFrom(InputStream inputStream) {
        return (bti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bti parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bti parseFrom(ByteBuffer byteBuffer) {
        return (bti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bti parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bti parseFrom(byte[] bArr) {
        return (bti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bti parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
