package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ars extends com.google.v.du<ars, arq> implements com.google.v.fj {
    private static final ars DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MESSAGE_NAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ars> PARSER = null;
    public static final int PTO_ID_FIELD_NUMBER = 5;
    public static final int SUB_TYPE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private long id_;
    private String messageName_ = "";
    private String ptoId_ = "";
    private int subType_;
    private int type_;

    static {
        ars arsVar = new ars();
        DEFAULT_INSTANCE = arsVar;
        com.google.v.du.registerDefaultInstance(ars.class, arsVar);
    }

    private ars() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageName() {
        this.messageName_ = getDefaultInstance().getMessageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPtoId() {
        this.ptoId_ = getDefaultInstance().getPtoId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubType() {
        this.subType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static ars getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static arq newBuilder() {
        return (arq) DEFAULT_INSTANCE.createBuilder();
    }

    public static ars parseDelimitedFrom(InputStream inputStream) {
        return (ars) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ars parseFrom(com.google.v.v vVar) {
        return (ars) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ars> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.bitField0_ |= 1;
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageName(String str) {
        Objects.requireNonNull(str);
        this.messageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.messageName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPtoId(String str) {
        Objects.requireNonNull(str);
        this.ptoId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPtoIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.ptoId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubType(arr arrVar) {
        this.subType_ = arrVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubTypeValue(int i2) {
        this.subType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(arx arxVar) {
        this.type_ = arxVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002Ȉ\u0003\f\u0004\f\u0005Ȉ", new Object[]{"bitField0_", "id_", "messageName_", "type_", "subType_", "ptoId_"});
        }
        if (iOrdinal == 3) {
            return new ars();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new arq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ars> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ars.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public long getId() {
        return this.id_;
    }

    public String getMessageName() {
        return this.messageName_;
    }

    public com.google.v.v getMessageNameBytes() {
        return com.google.v.v.s(this.messageName_);
    }

    public String getPtoId() {
        return this.ptoId_;
    }

    public com.google.v.v getPtoIdBytes() {
        return com.google.v.v.s(this.ptoId_);
    }

    public arr getSubType() {
        arr arrVar;
        switch (this.subType_) {
            case 0:
                arrVar = arr.SUB_TYPE_UNSPECIFIED;
                break;
            case 1:
                arrVar = arr.TRAFFIC;
                break;
            case 2:
                arrVar = arr.HAZARD;
                break;
            case 3:
                arrVar = arr.POLICE;
                break;
            case 4:
                arrVar = arr.ACCIDENT;
                break;
            case 5:
                arrVar = arr.CHAT;
                break;
            case 6:
                arrVar = arr.BAD_WEATHER;
                break;
            case 7:
                arrVar = arr.CLOSURE;
                break;
            case 8:
                arrVar = arr.BLOCKED_LANE;
                break;
            case 9:
                arrVar = arr.ASSISTANCE;
                break;
            case 10:
                arrVar = arr.ANIMAL;
                break;
            default:
                arrVar = null;
                break;
        }
        return arrVar == null ? arr.UNRECOGNIZED : arrVar;
    }

    public int getSubTypeValue() {
        return this.subType_;
    }

    public arx getType() {
        arx arxVarA = arx.a(this.type_);
        return arxVarA == null ? arx.UNRECOGNIZED : arxVarA;
    }

    public int getTypeValue() {
        return this.type_;
    }

    @Deprecated
    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static arq newBuilder(ars arsVar) {
        return (arq) DEFAULT_INSTANCE.createBuilder(arsVar);
    }

    public static ars parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ars) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ars parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ars) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ars parseFrom(com.google.v.z zVar) {
        return (ars) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ars parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ars) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ars parseFrom(InputStream inputStream) {
        return (ars) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ars parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ars) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ars parseFrom(ByteBuffer byteBuffer) {
        return (ars) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ars parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ars) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ars parseFrom(byte[] bArr) {
        return (ars) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ars parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ars) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
