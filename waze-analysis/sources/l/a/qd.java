package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class qd extends com.google.v.du<qd, qc> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final qd DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<qd> PARSER;
    private int action_;

    static {
        qd qdVar = new qd();
        DEFAULT_INSTANCE = qdVar;
        com.google.v.du.registerDefaultInstance(qd.class, qdVar);
    }

    private qd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static qd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static qc newBuilder() {
        return (qc) DEFAULT_INSTANCE.createBuilder();
    }

    public static qd parseDelimitedFrom(InputStream inputStream) {
        return (qd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qd parseFrom(com.google.v.v vVar) {
        return (qd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(qb qbVar) {
        this.action_ = qbVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"action_"});
        }
        if (iOrdinal == 3) {
            return new qd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new qc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<qd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (qd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public qb getAction() {
        qb qbVar;
        switch (this.action_) {
            case 0:
                qbVar = qb.ACTION_UNSPECIFIED;
                break;
            case 1:
                qbVar = qb.ADD_SHORTCUT_SIRI;
                break;
            case 2:
                qbVar = qb.CALENDAR_EVENT_CHANGE_LOCATION;
                break;
            case 3:
                qbVar = qb.CALENDAR_SETTINGS;
                break;
            case 4:
                qbVar = qb.REMOVE_PLANNED_DRIVE;
                break;
            case 5:
                qbVar = qb.EDIT_HOME;
                break;
            case 6:
                qbVar = qb.EDIT_WORK;
                break;
            case 7:
                qbVar = qb.FIND_PARKING;
                break;
            case 8:
                qbVar = qb.FOOTER_NAV_HISTORY;
                break;
            case 9:
                qbVar = qb.FOOTER_PLANNED_DRIVES_SETTINGS;
                break;
            case 10:
                qbVar = qb.FOOTER_SUGGESTION_SETTINGS;
                break;
            case 11:
                qbVar = qb.ADDRESS_INFO;
                break;
            case 12:
                qbVar = qb.PLANNED_DRIVE_EDIT;
                break;
            case 13:
                qbVar = qb.PLANNED_DRIVE_SETTINGS;
                break;
            case 14:
                qbVar = qb.REMOVE_CALENDAR_ALL_RECURRING;
                break;
            case 15:
                qbVar = qb.REMOVE_CALENDAR_ALL_THIS_ADDRESS;
                break;
            case 16:
                qbVar = qb.REMOVE_CALENDAR_EVENT;
                break;
            case 17:
                qbVar = qb.REMOVE_DESTINATION;
                break;
            case 18:
                qbVar = qb.REMOVE_HOME;
                break;
            case 19:
                qbVar = qb.REMOVE_SIMILAR_ROUTINES;
                break;
            case 20:
                qbVar = qb.REMOVE_ROUTINE;
                break;
            case 21:
                qbVar = qb.REMOVE_WORK;
                break;
            case 22:
                qbVar = qb.RENAME;
                break;
            case 23:
                qbVar = qb.SHARE;
                break;
            case 24:
                qbVar = qb.CLOSE;
                break;
            case 25:
                qbVar = qb.CALENDAR_EVENT_SET_ADDRESS;
                break;
            case 26:
                qbVar = qb.REMOVE_FAVORITE;
                break;
            case 27:
                qbVar = qb.SAVE_PLACE;
                break;
            default:
                qbVar = null;
                break;
        }
        return qbVar == null ? qb.UNRECOGNIZED : qbVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static qc newBuilder(qd qdVar) {
        return (qc) DEFAULT_INSTANCE.createBuilder(qdVar);
    }

    public static qd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qd parseFrom(com.google.v.z zVar) {
        return (qd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qd parseFrom(InputStream inputStream) {
        return (qd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qd parseFrom(ByteBuffer byteBuffer) {
        return (qd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qd parseFrom(byte[] bArr) {
        return (qd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
