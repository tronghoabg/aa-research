package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bet extends com.google.v.du<bet, beq> implements com.google.v.fj {
    private static final bet DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bet> PARSER = null;
    public static final int SUBTYPE_FIELD_NUMBER = 2;
    public static final int SUCCESS_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int WAZE_ON_FIELD_NUMBER = 4;
    private int bitField0_;
    private int subtype_;
    private boolean success_;
    private int type_;
    private boolean wazeOn_;

    static {
        bet betVar = new bet();
        DEFAULT_INSTANCE = betVar;
        com.google.v.du.registerDefaultInstance(bet.class, betVar);
    }

    private bet() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtype() {
        this.subtype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccess() {
        this.bitField0_ &= -2;
        this.success_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWazeOn() {
        this.bitField0_ &= -3;
        this.wazeOn_ = false;
    }

    public static bet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static beq newBuilder() {
        return (beq) DEFAULT_INSTANCE.createBuilder();
    }

    public static bet parseDelimitedFrom(InputStream inputStream) {
        return (bet) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bet parseFrom(com.google.v.v vVar) {
        return (bet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bet> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtype(ber berVar) {
        this.subtype_ = berVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtypeValue(int i2) {
        this.subtype_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(boolean z) {
        this.bitField0_ |= 1;
        this.success_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bes besVar) {
        this.type_ = besVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeOn(boolean z) {
        this.bitField0_ |= 2;
        this.wazeOn_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဇ\u0000\u0004ဇ\u0001", new Object[]{"bitField0_", "type_", "subtype_", "success_", "wazeOn_"});
        }
        if (iOrdinal == 3) {
            return new bet();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new beq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bet> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bet.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ber getSubtype() {
        ber berVar;
        switch (this.subtype_) {
            case 0:
                berVar = ber.SUBTYPE_UNSPECIFIED;
                break;
            case 1:
                berVar = ber.HOME;
                break;
            case 2:
                berVar = ber.WORK;
                break;
            case 3:
                berVar = ber.HISTORY;
                break;
            case 4:
                berVar = ber.OTHER;
                break;
            case 5:
            default:
                berVar = null;
                break;
            case 6:
                berVar = ber.ON;
                break;
            case 7:
                berVar = ber.OFF;
                break;
            case 8:
                berVar = ber.ALERTS_ONLY;
                break;
        }
        return berVar == null ? ber.UNRECOGNIZED : berVar;
    }

    public int getSubtypeValue() {
        return this.subtype_;
    }

    public boolean getSuccess() {
        return this.success_;
    }

    public bes getType() {
        int i2 = this.type_;
        bes besVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : bes.CHANGE_SOUND_MODE : bes.NAVIGATE : bes.TYPE_UNSPECIFIED;
        return besVar == null ? bes.UNRECOGNIZED : besVar;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean getWazeOn() {
        return this.wazeOn_;
    }

    public boolean hasSuccess() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWazeOn() {
        return (this.bitField0_ & 2) != 0;
    }

    public static beq newBuilder(bet betVar) {
        return (beq) DEFAULT_INSTANCE.createBuilder(betVar);
    }

    public static bet parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bet) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bet parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bet parseFrom(com.google.v.z zVar) {
        return (bet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bet parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bet parseFrom(InputStream inputStream) {
        return (bet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bet parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bet parseFrom(ByteBuffer byteBuffer) {
        return (bet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bet parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bet parseFrom(byte[] bArr) {
        return (bet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bet parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
