package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class tz extends com.google.v.du<tz, ty> implements com.google.v.fj {
    public static final int ALERT_UUID_FIELD_NUMBER = 2;
    private static final tz DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<tz> PARSER;
    private String alertUuid_ = "";
    private int bitField0_;
    private int id_;

    static {
        tz tzVar = new tz();
        DEFAULT_INSTANCE = tzVar;
        com.google.v.du.registerDefaultInstance(tz.class, tzVar);
    }

    private tz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertUuid() {
        this.bitField0_ &= -3;
        this.alertUuid_ = getDefaultInstance().getAlertUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0;
    }

    public static tz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ty newBuilder() {
        return (ty) DEFAULT_INSTANCE.createBuilder();
    }

    public static tz parseDelimitedFrom(InputStream inputStream) {
        return (tz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tz parseFrom(com.google.v.v vVar) {
        return (tz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<tz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.alertUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertUuidBytes(com.google.v.v vVar) {
        this.alertUuid_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i2) {
        this.bitField0_ |= 1;
        this.id_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "id_", "alertUuid_"});
        }
        if (iOrdinal == 3) {
            return new tz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ty(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<tz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (tz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAlertUuid() {
        return this.alertUuid_;
    }

    public com.google.v.v getAlertUuidBytes() {
        return com.google.v.v.s(this.alertUuid_);
    }

    public int getId() {
        return this.id_;
    }

    public boolean hasAlertUuid() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ty newBuilder(tz tzVar) {
        return (ty) DEFAULT_INSTANCE.createBuilder(tzVar);
    }

    public static tz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (tz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static tz parseFrom(com.google.v.z zVar) {
        return (tz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static tz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (tz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static tz parseFrom(InputStream inputStream) {
        return (tz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tz parseFrom(ByteBuffer byteBuffer) {
        return (tz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static tz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (tz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static tz parseFrom(byte[] bArr) {
        return (tz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static tz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (tz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
