package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class te extends com.google.v.du<te, tc> implements com.google.v.fj {
    private static final te DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<te> PARSER = null;
    public static final int PLANNED_DRIVE_ID_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String plannedDriveId_ = "";
    private int type_;

    static {
        te teVar = new te();
        DEFAULT_INSTANCE = teVar;
        com.google.v.du.registerDefaultInstance(te.class, teVar);
    }

    private te() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlannedDriveId() {
        this.plannedDriveId_ = getDefaultInstance().getPlannedDriveId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static te getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static tc newBuilder() {
        return (tc) DEFAULT_INSTANCE.createBuilder();
    }

    public static te parseDelimitedFrom(InputStream inputStream) {
        return (te) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static te parseFrom(com.google.v.v vVar) {
        return (te) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<te> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlannedDriveId(String str) {
        Objects.requireNonNull(str);
        this.plannedDriveId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlannedDriveIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.plannedDriveId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(td tdVar) {
        this.type_ = tdVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"type_", "plannedDriveId_"});
        }
        if (iOrdinal == 3) {
            return new te();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new tc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<te> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (te.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getPlannedDriveId() {
        return this.plannedDriveId_;
    }

    public com.google.v.v getPlannedDriveIdBytes() {
        return com.google.v.v.s(this.plannedDriveId_);
    }

    public td getType() {
        td tdVar;
        switch (this.type_) {
            case 0:
                tdVar = td.NAVIGATION_TYPE_UNSPECIFIED;
                break;
            case 1:
                tdVar = td.PLANNED_DRIVE;
                break;
            case 2:
                tdVar = td.HOME;
                break;
            case 3:
                tdVar = td.PLACE_TAP_ON_MAP;
                break;
            case 4:
                tdVar = td.PARKING;
                break;
            case 5:
                tdVar = td.SEARCH;
                break;
            case 6:
                tdVar = td.SHARED_DRIVE;
                break;
            case 7:
                tdVar = td.CALENDAR;
                break;
            case 8:
                tdVar = td.WORK;
                break;
            case 9:
                tdVar = td.GAS_SEARCH;
                break;
            case 10:
                tdVar = td.CALENDAR_DRIVE;
                break;
            case 11:
                tdVar = td.FAVORITE;
                break;
            case 12:
                tdVar = td.PARKING_SUGGESTION;
                break;
            case 13:
                tdVar = td.PLACE_SEARCH;
                break;
            case 14:
                tdVar = td.LOCATION;
                break;
            case 15:
                tdVar = td.CALENDAR_PUSH;
                break;
            case 16:
                tdVar = td.URL_SEARCH;
                break;
            case 17:
                tdVar = td.SHARED_LOCATION;
                break;
            case 18:
                tdVar = td.PLANNED_DRIVE_PUSH;
                break;
            case 19:
                tdVar = td.AD_TAP_ON_MAP;
                break;
            case 20:
                tdVar = td.HISTORY;
                break;
            case 21:
                tdVar = td.OTHER_FAVORITE;
                break;
            case 22:
                tdVar = td.URL_LOCATION;
                break;
            case 23:
                tdVar = td.RECENT_AD;
                break;
            case 24:
                tdVar = td.AD_SEARCH;
                break;
            default:
                tdVar = null;
                break;
        }
        return tdVar == null ? td.UNRECOGNIZED : tdVar;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public static tc newBuilder(te teVar) {
        return (tc) DEFAULT_INSTANCE.createBuilder(teVar);
    }

    public static te parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (te) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static te parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (te) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static te parseFrom(com.google.v.z zVar) {
        return (te) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static te parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (te) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static te parseFrom(InputStream inputStream) {
        return (te) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static te parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (te) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static te parseFrom(ByteBuffer byteBuffer) {
        return (te) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static te parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (te) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static te parseFrom(byte[] bArr) {
        return (te) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static te parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (te) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
