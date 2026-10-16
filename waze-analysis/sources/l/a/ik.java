package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ik extends com.google.v.du<ik, ij> implements com.google.v.fj {
    public static final int ALLOW_BLUETOOTH_PERMISSIONS_FIELD_NUMBER = 1;
    private static final ik DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ik> PARSER = null;
    public static final int REQUEST_TRIGGER_FIELD_NUMBER = 2;
    private boolean allowBluetoothPermissions_;
    private int bitField0_;
    private int requestTrigger_;

    static {
        ik ikVar = new ik();
        DEFAULT_INSTANCE = ikVar;
        com.google.v.du.registerDefaultInstance(ik.class, ikVar);
    }

    private ik() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowBluetoothPermissions() {
        this.bitField0_ &= -2;
        this.allowBluetoothPermissions_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestTrigger() {
        this.requestTrigger_ = 0;
    }

    public static ik getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ij newBuilder() {
        return (ij) DEFAULT_INSTANCE.createBuilder();
    }

    public static ik parseDelimitedFrom(InputStream inputStream) {
        return (ik) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ik parseFrom(com.google.v.v vVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ik> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowBluetoothPermissions(boolean z) {
        this.bitField0_ |= 1;
        this.allowBluetoothPermissions_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTrigger(in inVar) {
        this.requestTrigger_ = inVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTriggerValue(int i2) {
        this.requestTrigger_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002\f", new Object[]{"bitField0_", "allowBluetoothPermissions_", "requestTrigger_"});
        }
        if (iOrdinal == 3) {
            return new ik();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ij(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ik> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ik.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAllowBluetoothPermissions() {
        return this.allowBluetoothPermissions_;
    }

    public in getRequestTrigger() {
        in inVarA = in.a(this.requestTrigger_);
        return inVarA == null ? in.UNRECOGNIZED : inVarA;
    }

    public int getRequestTriggerValue() {
        return this.requestTrigger_;
    }

    public boolean hasAllowBluetoothPermissions() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ij newBuilder(ik ikVar) {
        return (ij) DEFAULT_INSTANCE.createBuilder(ikVar);
    }

    public static ik parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ik) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ik parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ik parseFrom(com.google.v.z zVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ik parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ik parseFrom(InputStream inputStream) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ik parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ik parseFrom(ByteBuffer byteBuffer) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ik parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ik parseFrom(byte[] bArr) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ik parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
