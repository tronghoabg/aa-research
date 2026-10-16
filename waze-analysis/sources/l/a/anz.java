package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class anz extends com.google.v.du<anz, anx> implements com.google.v.fj {
    private static final anz DEFAULT_INSTANCE;
    public static final int NOTIFICATION_ID_FIELD_NUMBER = 2;
    public static final int NOTIFICATION_TYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<anz> PARSER;
    private String notificationId_ = "";
    private int notificationType_;

    static {
        anz anzVar = new anz();
        DEFAULT_INSTANCE = anzVar;
        com.google.v.du.registerDefaultInstance(anz.class, anzVar);
    }

    private anz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotificationId() {
        this.notificationId_ = getDefaultInstance().getNotificationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotificationType() {
        this.notificationType_ = 0;
    }

    public static anz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static anx newBuilder() {
        return (anx) DEFAULT_INSTANCE.createBuilder();
    }

    public static anz parseDelimitedFrom(InputStream inputStream) {
        return (anz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static anz parseFrom(com.google.v.v vVar) {
        return (anz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<anz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotificationId(String str) {
        Objects.requireNonNull(str);
        this.notificationId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotificationIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.notificationId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotificationType(any anyVar) {
        this.notificationType_ = anyVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotificationTypeValue(int i2) {
        this.notificationType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"notificationType_", "notificationId_"});
        }
        if (iOrdinal == 3) {
            return new anz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new anx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<anz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (anz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getNotificationId() {
        return this.notificationId_;
    }

    public com.google.v.v getNotificationIdBytes() {
        return com.google.v.v.s(this.notificationId_);
    }

    public any getNotificationType() {
        any anyVar;
        switch (this.notificationType_) {
            case 0:
                anyVar = any.NOTIFICATION_TYPE_UNSPECIFIED;
                break;
            case 1:
                anyVar = any.WAZE_ASK;
                break;
            case 2:
                anyVar = any.REPORT;
                break;
            case 3:
                anyVar = any.TURN_ON_YOUR_HEADLIGHTS;
                break;
            case 4:
                anyVar = any.ECO_REGULATION;
                break;
            case 5:
                anyVar = any.GTW_REROUTE_SUGGESTION;
                break;
            case 6:
                anyVar = any.NETWORK_ISSUE;
                break;
            case 7:
            default:
                anyVar = null;
                break;
            case 8:
                anyVar = any.CONVERSATION_FEEDBACK;
                break;
            case 9:
                anyVar = any.INSIGHT_FEEDBACK;
                break;
            case 10:
                anyVar = any.LIVE_MATCH;
                break;
            case 11:
                anyVar = any.START_SEQUENCE;
                break;
            case 12:
                anyVar = any.GPS_ISSUE;
                break;
            case 13:
                anyVar = any.MULTI_ASK;
                break;
        }
        return anyVar == null ? any.UNRECOGNIZED : anyVar;
    }

    public int getNotificationTypeValue() {
        return this.notificationType_;
    }

    public static anx newBuilder(anz anzVar) {
        return (anx) DEFAULT_INSTANCE.createBuilder(anzVar);
    }

    public static anz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (anz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static anz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (anz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static anz parseFrom(com.google.v.z zVar) {
        return (anz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static anz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (anz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static anz parseFrom(InputStream inputStream) {
        return (anz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static anz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (anz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static anz parseFrom(ByteBuffer byteBuffer) {
        return (anz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static anz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (anz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static anz parseFrom(byte[] bArr) {
        return (anz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static anz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (anz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
