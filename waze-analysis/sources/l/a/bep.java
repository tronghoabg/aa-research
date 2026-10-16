package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bep extends com.google.v.du<bep, bem> implements com.google.v.fj {
    private static final bep DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bep> PARSER = null;
    public static final int SUBTYPE_FIELD_NUMBER = 2;
    public static final int SUCCESS_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int subtype_;
    private boolean success_;
    private int type_;

    static {
        bep bepVar = new bep();
        DEFAULT_INSTANCE = bepVar;
        com.google.v.du.registerDefaultInstance(bep.class, bepVar);
    }

    private bep() {
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

    public static bep getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bem newBuilder() {
        return (bem) DEFAULT_INSTANCE.createBuilder();
    }

    public static bep parseDelimitedFrom(InputStream inputStream) {
        return (bep) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bep parseFrom(com.google.v.v vVar) {
        return (bep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bep> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtype(ben benVar) {
        this.subtype_ = benVar.getNumber();
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
    public void setType(beo beoVar) {
        this.type_ = beoVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဇ\u0000", new Object[]{"bitField0_", "type_", "subtype_", "success_"});
        }
        if (iOrdinal == 3) {
            return new bep();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bem(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bep> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bep.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ben getSubtype() {
        int i2 = this.subtype_;
        ben benVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 6 ? i2 != 7 ? i2 != 8 ? null : ben.ALERTS_ONLY : ben.OFF : ben.ON : ben.FAVORITE : ben.WORK : ben.HOME : ben.SUBTYPE_UNSPECIFIED;
        return benVar == null ? ben.UNRECOGNIZED : benVar;
    }

    public int getSubtypeValue() {
        return this.subtype_;
    }

    public boolean getSuccess() {
        return this.success_;
    }

    public beo getType() {
        int i2 = this.type_;
        beo beoVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : beo.CHANGE_SOUND_MODE : beo.NAVIGATE : beo.TYPE_UNSPECIFIED;
        return beoVar == null ? beo.UNRECOGNIZED : beoVar;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasSuccess() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bem newBuilder(bep bepVar) {
        return (bem) DEFAULT_INSTANCE.createBuilder(bepVar);
    }

    public static bep parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bep) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bep parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bep parseFrom(com.google.v.z zVar) {
        return (bep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bep parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bep parseFrom(InputStream inputStream) {
        return (bep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bep parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bep parseFrom(ByteBuffer byteBuffer) {
        return (bep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bep parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bep parseFrom(byte[] bArr) {
        return (bep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bep parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
