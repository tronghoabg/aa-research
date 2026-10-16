package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aqu extends com.google.v.du<aqu, aqt> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final aqu DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aqu> PARSER;
    private int action_;

    static {
        aqu aquVar = new aqu();
        DEFAULT_INSTANCE = aquVar;
        com.google.v.du.registerDefaultInstance(aqu.class, aquVar);
    }

    private aqu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static aqu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aqt newBuilder() {
        return (aqt) DEFAULT_INSTANCE.createBuilder();
    }

    public static aqu parseDelimitedFrom(InputStream inputStream) {
        return (aqu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aqu parseFrom(com.google.v.v vVar) {
        return (aqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aqu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(aqs aqsVar) {
        this.action_ = aqsVar.getNumber();
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
            return new aqu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aqt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aqu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aqu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aqs getAction() {
        aqs aqsVar;
        switch (this.action_) {
            case 0:
                aqsVar = aqs.ACTION_UNSPECIFIED;
                break;
            case 1:
                aqsVar = aqs.ADD;
                break;
            case 2:
                aqsVar = aqs.BACK;
                break;
            case 3:
                aqsVar = aqs.CALENDAR_DRIVE;
                break;
            case 4:
                aqsVar = aqs.NOTIFICATION_TOGGLE;
                break;
            case 5:
                aqsVar = aqs.NAVIGATE_TO_PLANNED_DRIVE;
                break;
            case 6:
                aqsVar = aqs.SETTINGS;
                break;
            case 7:
                aqsVar = aqs.CALENDAR_SYNC;
                break;
            default:
                aqsVar = null;
                break;
        }
        return aqsVar == null ? aqs.UNRECOGNIZED : aqsVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static aqt newBuilder(aqu aquVar) {
        return (aqt) DEFAULT_INSTANCE.createBuilder(aquVar);
    }

    public static aqu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aqu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aqu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aqu parseFrom(com.google.v.z zVar) {
        return (aqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aqu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aqu parseFrom(InputStream inputStream) {
        return (aqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aqu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aqu parseFrom(ByteBuffer byteBuffer) {
        return (aqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aqu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aqu parseFrom(byte[] bArr) {
        return (aqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aqu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
