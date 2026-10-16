package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class vd extends com.google.v.du<vd, vc> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final vd DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<vd> PARSER;
    private int action_;

    static {
        vd vdVar = new vd();
        DEFAULT_INSTANCE = vdVar;
        com.google.v.du.registerDefaultInstance(vd.class, vdVar);
    }

    private vd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static vd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static vc newBuilder() {
        return (vc) DEFAULT_INSTANCE.createBuilder();
    }

    public static vd parseDelimitedFrom(InputStream inputStream) {
        return (vd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static vd parseFrom(com.google.v.v vVar) {
        return (vd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<vd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(vb vbVar) {
        this.action_ = vbVar.getNumber();
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
            return new vd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new vc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<vd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (vd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public vb getAction() {
        vb vbVar;
        switch (this.action_) {
            case 0:
                vbVar = vb.UNKNOWN;
                break;
            case 1:
                vbVar = vb.COLLAPSE;
                break;
            case 2:
                vbVar = vb.OVERVIEW;
                break;
            case 3:
                vbVar = vb.STOP;
                break;
            case 4:
                vbVar = vb.CLOSE;
                break;
            case 5:
                vbVar = vb.BACK;
                break;
            case 6:
                vbVar = vb.ADD_A_STOP;
                break;
            case 7:
                vbVar = vb.GAS_WAYPOINT;
                break;
            case 8:
                vbVar = vb.FOOD_WAYPOINT;
                break;
            case 9:
                vbVar = vb.COFFEE_WAYPOINT;
                break;
            case 10:
                vbVar = vb.PARKING_WAYPOINT;
                break;
            case 11:
                vbVar = vb.SEARCH_WAYPOINT;
                break;
            case 12:
                vbVar = vb.EV_CHARGING_STATION_WAYPOINT;
                break;
            default:
                vbVar = null;
                break;
        }
        return vbVar == null ? vb.UNRECOGNIZED : vbVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static vc newBuilder(vd vdVar) {
        return (vc) DEFAULT_INSTANCE.createBuilder(vdVar);
    }

    public static vd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (vd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static vd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (vd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static vd parseFrom(com.google.v.z zVar) {
        return (vd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static vd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (vd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static vd parseFrom(InputStream inputStream) {
        return (vd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static vd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (vd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static vd parseFrom(ByteBuffer byteBuffer) {
        return (vd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static vd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (vd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static vd parseFrom(byte[] bArr) {
        return (vd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static vd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (vd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
