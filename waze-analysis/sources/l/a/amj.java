package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class amj extends com.google.v.du<amj, ami> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final amj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<amj> PARSER = null;
    public static final int VENUE_ID_FIELD_NUMBER = 2;
    private int action_;
    private String venueId_ = "";

    static {
        amj amjVar = new amj();
        DEFAULT_INSTANCE = amjVar;
        com.google.v.du.registerDefaultInstance(amj.class, amjVar);
    }

    private amj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static amj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ami newBuilder() {
        return (ami) DEFAULT_INSTANCE.createBuilder();
    }

    public static amj parseDelimitedFrom(InputStream inputStream) {
        return (amj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static amj parseFrom(com.google.v.v vVar) {
        return (amj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<amj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(amh amhVar) {
        this.action_ = amhVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"action_", "venueId_"});
        }
        if (iOrdinal == 3) {
            return new amj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ami(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<amj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (amj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public amh getAction() {
        amh amhVar;
        switch (this.action_) {
            case 0:
                amhVar = amh.ACTION_UNSPECIFIED;
                break;
            case 1:
                amhVar = amh.ALTERNATIVE_ROUTES;
                break;
            case 2:
                amhVar = amh.CALENDAR_SETTINGS;
                break;
            case 3:
                amhVar = amh.DELETE_PLANNED_DRIVE;
                break;
            case 4:
                amhVar = amh.EDIT_PLANNED_DRIVE;
                break;
            case 5:
                amhVar = amh.INFO;
                break;
            case 6:
                amhVar = amh.FIND_PARKING;
                break;
            case 7:
                amhVar = amh.SHARE_LOCATION;
                break;
            default:
                amhVar = null;
                break;
        }
        return amhVar == null ? amh.UNRECOGNIZED : amhVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public static ami newBuilder(amj amjVar) {
        return (ami) DEFAULT_INSTANCE.createBuilder(amjVar);
    }

    public static amj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (amj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static amj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (amj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static amj parseFrom(com.google.v.z zVar) {
        return (amj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static amj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (amj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static amj parseFrom(InputStream inputStream) {
        return (amj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static amj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (amj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static amj parseFrom(ByteBuffer byteBuffer) {
        return (amj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static amj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (amj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static amj parseFrom(byte[] bArr) {
        return (amj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static amj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (amj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
