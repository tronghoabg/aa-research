package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aik extends com.google.v.du<aik, aij> implements ail {
    private static final aik DEFAULT_INSTANCE;
    public static final int OBJECT_TYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<aik> PARSER = null;
    public static final int QUANTITY_FIELD_NUMBER = 2;
    private int bitField0_;
    private int objectType_;
    private long quantity_;

    static {
        aik aikVar = new aik();
        DEFAULT_INSTANCE = aikVar;
        com.google.v.du.registerDefaultInstance(aik.class, aikVar);
    }

    private aik() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearObjectType() {
        this.objectType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuantity() {
        this.bitField0_ &= -2;
        this.quantity_ = 0L;
    }

    public static aik getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aij newBuilder() {
        return (aij) DEFAULT_INSTANCE.createBuilder();
    }

    public static aik parseDelimitedFrom(InputStream inputStream) {
        return (aik) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aik parseFrom(com.google.v.v vVar) {
        return (aik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aik> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObjectType(aim aimVar) {
        this.objectType_ = aimVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObjectTypeValue(int i2) {
        this.objectType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuantity(long j2) {
        this.bitField0_ |= 1;
        this.quantity_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဂ\u0000", new Object[]{"bitField0_", "objectType_", "quantity_"});
        }
        if (iOrdinal == 3) {
            return new aik();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aij(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aik> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aik.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aim getObjectType() {
        aim aimVar;
        switch (this.objectType_) {
            case 0:
                aimVar = aim.OBJECT_TYPE_UNSPECIFIED;
                break;
            case 1:
                aimVar = aim.TRAFFIC_LIGHT;
                break;
            case 2:
                aimVar = aim.STOP_SIGN;
                break;
            case 3:
                aimVar = aim.CAMERA;
                break;
            case 4:
                aimVar = aim.RAILROAD_CROSSING;
                break;
            case 5:
                aimVar = aim.SPEED_BUMP;
                break;
            case 6:
                aimVar = aim.SCHOOL_ZONE;
                break;
            case 7:
                aimVar = aim.SHARP_CURVE;
                break;
            case 8:
                aimVar = aim.COMPLEX_MERGER;
                break;
            case 9:
                aimVar = aim.COMPLEX_SPLIT_FORK;
                break;
            case 10:
                aimVar = aim.COMPLEX_INTERSECTION;
                break;
            case 11:
                aimVar = aim.TOLL_BOOTH;
                break;
            case 12:
                aimVar = aim.UGC_ALERT;
                break;
            default:
                aimVar = null;
                break;
        }
        return aimVar == null ? aim.UNRECOGNIZED : aimVar;
    }

    public int getObjectTypeValue() {
        return this.objectType_;
    }

    public long getQuantity() {
        return this.quantity_;
    }

    public boolean hasQuantity() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aij newBuilder(aik aikVar) {
        return (aij) DEFAULT_INSTANCE.createBuilder(aikVar);
    }

    public static aik parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aik) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aik parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aik parseFrom(com.google.v.z zVar) {
        return (aik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aik parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aik parseFrom(InputStream inputStream) {
        return (aik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aik parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aik parseFrom(ByteBuffer byteBuffer) {
        return (aik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aik parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aik parseFrom(byte[] bArr) {
        return (aik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aik parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
