package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class agj extends com.google.v.du<agj, agh> implements com.google.v.fj {
    private static final agj DEFAULT_INSTANCE;
    public static final int LOCATION_PERMISSION_STATUS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<agj> PARSER;
    private int locationPermissionStatus_;

    static {
        agj agjVar = new agj();
        DEFAULT_INSTANCE = agjVar;
        com.google.v.du.registerDefaultInstance(agj.class, agjVar);
    }

    private agj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationPermissionStatus() {
        this.locationPermissionStatus_ = 0;
    }

    public static agj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static agh newBuilder() {
        return (agh) DEFAULT_INSTANCE.createBuilder();
    }

    public static agj parseDelimitedFrom(InputStream inputStream) {
        return (agj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static agj parseFrom(com.google.v.v vVar) {
        return (agj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<agj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationPermissionStatus(agi agiVar) {
        this.locationPermissionStatus_ = agiVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationPermissionStatusValue(int i2) {
        this.locationPermissionStatus_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"locationPermissionStatus_"});
        }
        if (iOrdinal == 3) {
            return new agj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new agh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<agj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (agj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public agi getLocationPermissionStatus() {
        int i2 = this.locationPermissionStatus_;
        agi agiVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : agi.NOT_DETERMINED : agi.RESTRICTED : agi.DENIED : agi.AUTHORIZED_WHEN_IN_USE : agi.AUTHORIZED_ALWAYS : agi.LOCATION_PERMISSION_STATUS_UNSPECIFIED;
        return agiVar == null ? agi.UNRECOGNIZED : agiVar;
    }

    public int getLocationPermissionStatusValue() {
        return this.locationPermissionStatus_;
    }

    public static agh newBuilder(agj agjVar) {
        return (agh) DEFAULT_INSTANCE.createBuilder(agjVar);
    }

    public static agj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (agj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static agj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (agj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static agj parseFrom(com.google.v.z zVar) {
        return (agj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static agj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (agj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static agj parseFrom(InputStream inputStream) {
        return (agj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static agj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (agj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static agj parseFrom(ByteBuffer byteBuffer) {
        return (agj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static agj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (agj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static agj parseFrom(byte[] bArr) {
        return (agj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static agj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (agj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
