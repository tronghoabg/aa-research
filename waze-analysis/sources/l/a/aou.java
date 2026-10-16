package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aou extends com.google.v.du<aou, aos> implements com.google.v.fj {
    private static final aou DEFAULT_INSTANCE;
    public static final int LOCATION_PERMISSION_COPY_VERSION_FIELD_NUMBER = 3;
    public static final int OS_BLUETOOTH_CONNECTIVITY_PERMISSION_ENABLED_FIELD_NUMBER = 2;
    public static final int OS_LOCATION_PERMISSION_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<aou> PARSER;
    private int bitField0_;
    private long locationPermissionCopyVersion_;
    private boolean osBluetoothConnectivityPermissionEnabled_;
    private int osLocationPermission_;

    static {
        aou aouVar = new aou();
        DEFAULT_INSTANCE = aouVar;
        com.google.v.du.registerDefaultInstance(aou.class, aouVar);
    }

    private aou() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationPermissionCopyVersion() {
        this.bitField0_ &= -3;
        this.locationPermissionCopyVersion_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsBluetoothConnectivityPermissionEnabled() {
        this.bitField0_ &= -2;
        this.osBluetoothConnectivityPermissionEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsLocationPermission() {
        this.osLocationPermission_ = 0;
    }

    public static aou getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aos newBuilder() {
        return (aos) DEFAULT_INSTANCE.createBuilder();
    }

    public static aou parseDelimitedFrom(InputStream inputStream) {
        return (aou) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aou parseFrom(com.google.v.v vVar) {
        return (aou) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aou> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationPermissionCopyVersion(long j2) {
        this.bitField0_ |= 2;
        this.locationPermissionCopyVersion_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsBluetoothConnectivityPermissionEnabled(boolean z) {
        this.bitField0_ |= 1;
        this.osBluetoothConnectivityPermissionEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsLocationPermission(aot aotVar) {
        this.osLocationPermission_ = aotVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsLocationPermissionValue(int i2) {
        this.osLocationPermission_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဇ\u0000\u0003ဂ\u0001", new Object[]{"bitField0_", "osLocationPermission_", "osBluetoothConnectivityPermissionEnabled_", "locationPermissionCopyVersion_"});
        }
        if (iOrdinal == 3) {
            return new aou();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aos(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aou> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aou.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getLocationPermissionCopyVersion() {
        return this.locationPermissionCopyVersion_;
    }

    public boolean getOsBluetoothConnectivityPermissionEnabled() {
        return this.osBluetoothConnectivityPermissionEnabled_;
    }

    public aot getOsLocationPermission() {
        int i2 = this.osLocationPermission_;
        aot aotVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : aot.NEVER : aot.WHEN_IN_USE : aot.ALWAYS_ON : aot.OS_LOCATION_PERMISSION_UNSPECIFIED;
        return aotVar == null ? aot.UNRECOGNIZED : aotVar;
    }

    public int getOsLocationPermissionValue() {
        return this.osLocationPermission_;
    }

    public boolean hasLocationPermissionCopyVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOsBluetoothConnectivityPermissionEnabled() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aos newBuilder(aou aouVar) {
        return (aos) DEFAULT_INSTANCE.createBuilder(aouVar);
    }

    public static aou parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aou) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aou parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aou) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aou parseFrom(com.google.v.z zVar) {
        return (aou) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aou parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aou) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aou parseFrom(InputStream inputStream) {
        return (aou) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aou parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aou) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aou parseFrom(ByteBuffer byteBuffer) {
        return (aou) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aou parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aou) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aou parseFrom(byte[] bArr) {
        return (aou) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aou parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aou) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
