package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class sw extends com.google.v.du<sw, sv> implements sx {
    private static final sw DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LENGTHTOWAYPOINTMETERS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<sw> PARSER = null;
    public static final int SECONDSTOWAYPOINT_FIELD_NUMBER = 3;
    public static final int WAYPOINTINDEXINPOINTS_FIELD_NUMBER = 4;
    private int bitField0_;
    private int id_;
    private int lengthToWaypointMeters_;
    private int secondsToWaypoint_;
    private int waypointIndexInPoints_;

    static {
        sw swVar = new sw();
        DEFAULT_INSTANCE = swVar;
        com.google.v.du.registerDefaultInstance(sw.class, swVar);
    }

    private sw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLengthToWaypointMeters() {
        this.bitField0_ &= -3;
        this.lengthToWaypointMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondsToWaypoint() {
        this.bitField0_ &= -5;
        this.secondsToWaypoint_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypointIndexInPoints() {
        this.bitField0_ &= -9;
        this.waypointIndexInPoints_ = 0;
    }

    public static sw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static sv newBuilder() {
        return (sv) DEFAULT_INSTANCE.createBuilder();
    }

    public static sw parseDelimitedFrom(InputStream inputStream) {
        return (sw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sw parseFrom(com.google.v.v vVar) {
        return (sw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<sw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i2) {
        this.bitField0_ |= 1;
        this.id_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLengthToWaypointMeters(int i2) {
        this.bitField0_ |= 2;
        this.lengthToWaypointMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondsToWaypoint(int i2) {
        this.bitField0_ |= 4;
        this.secondsToWaypoint_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaypointIndexInPoints(int i2) {
        this.bitField0_ |= 8;
        this.waypointIndexInPoints_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"bitField0_", "id_", "lengthToWaypointMeters_", "secondsToWaypoint_", "waypointIndexInPoints_"});
        }
        if (iOrdinal == 3) {
            return new sw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new sv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<sw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (sw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getId() {
        return this.id_;
    }

    public int getLengthToWaypointMeters() {
        return this.lengthToWaypointMeters_;
    }

    public int getSecondsToWaypoint() {
        return this.secondsToWaypoint_;
    }

    public int getWaypointIndexInPoints() {
        return this.waypointIndexInPoints_;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLengthToWaypointMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSecondsToWaypoint() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasWaypointIndexInPoints() {
        return (this.bitField0_ & 8) != 0;
    }

    public static sv newBuilder(sw swVar) {
        return (sv) DEFAULT_INSTANCE.createBuilder(swVar);
    }

    public static sw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (sw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static sw parseFrom(com.google.v.z zVar) {
        return (sw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static sw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (sw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static sw parseFrom(InputStream inputStream) {
        return (sw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sw parseFrom(ByteBuffer byteBuffer) {
        return (sw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static sw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (sw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static sw parseFrom(byte[] bArr) {
        return (sw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static sw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (sw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
