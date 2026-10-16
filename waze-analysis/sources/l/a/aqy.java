package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aqy extends com.google.v.du<aqy, aqv> implements com.google.v.fj {
    private static final aqy DEFAULT_INSTANCE;
    public static final int NOTIFICATION_TOGGLE_STATE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<aqy> PARSER = null;
    public static final int PLANNED_DRIVE_SCREEN_STATE_FIELD_NUMBER = 1;
    private int notificationToggleState_;
    private int plannedDriveScreenState_;

    static {
        aqy aqyVar = new aqy();
        DEFAULT_INSTANCE = aqyVar;
        com.google.v.du.registerDefaultInstance(aqy.class, aqyVar);
    }

    private aqy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotificationToggleState() {
        this.notificationToggleState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlannedDriveScreenState() {
        this.plannedDriveScreenState_ = 0;
    }

    public static aqy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aqv newBuilder() {
        return (aqv) DEFAULT_INSTANCE.createBuilder();
    }

    public static aqy parseDelimitedFrom(InputStream inputStream) {
        return (aqy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aqy parseFrom(com.google.v.v vVar) {
        return (aqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aqy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotificationToggleState(aqw aqwVar) {
        this.notificationToggleState_ = aqwVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotificationToggleStateValue(int i2) {
        this.notificationToggleState_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlannedDriveScreenState(aqx aqxVar) {
        this.plannedDriveScreenState_ = aqxVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlannedDriveScreenStateValue(int i2) {
        this.plannedDriveScreenState_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"plannedDriveScreenState_", "notificationToggleState_"});
        }
        if (iOrdinal == 3) {
            return new aqy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aqv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aqy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aqy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aqw getNotificationToggleState() {
        int i2 = this.notificationToggleState_;
        aqw aqwVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : aqw.ON : aqw.OFF : aqw.NOT_SHOWN : aqw.TOGGLE_UNSPECIFIED;
        return aqwVar == null ? aqw.UNRECOGNIZED : aqwVar;
    }

    public int getNotificationToggleStateValue() {
        return this.notificationToggleState_;
    }

    public aqx getPlannedDriveScreenState() {
        int i2 = this.plannedDriveScreenState_;
        aqx aqxVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : aqx.NO_ACTIVE_AND_NO_PAST_PLANNED_DRIVES : aqx.NO_ACTIVE_PLANNED_DRIVES : aqx.HAS_PLANNED_DRIVES : aqx.STATE_UNSPECIFIED;
        return aqxVar == null ? aqx.UNRECOGNIZED : aqxVar;
    }

    public int getPlannedDriveScreenStateValue() {
        return this.plannedDriveScreenState_;
    }

    public static aqv newBuilder(aqy aqyVar) {
        return (aqv) DEFAULT_INSTANCE.createBuilder(aqyVar);
    }

    public static aqy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aqy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aqy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aqy parseFrom(com.google.v.z zVar) {
        return (aqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aqy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aqy parseFrom(InputStream inputStream) {
        return (aqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aqy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aqy parseFrom(ByteBuffer byteBuffer) {
        return (aqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aqy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aqy parseFrom(byte[] bArr) {
        return (aqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aqy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
