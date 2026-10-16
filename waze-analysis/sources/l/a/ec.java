package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ec extends com.google.v.du<ec, dz> implements com.google.v.fj {
    private static final ec DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ec> PARSER = null;
    public static final int PCT_OF_LIST_SHOWN_FIELD_NUMBER = 3;
    public static final int TO_MODE_FIELD_NUMBER = 1;
    public static final int UPDATE_SOURCE_FIELD_NUMBER = 2;
    private int bitField0_;
    private float pctOfListShown_;
    private int toMode_;
    private int updateSource_;

    static {
        ec ecVar = new ec();
        DEFAULT_INSTANCE = ecVar;
        com.google.v.du.registerDefaultInstance(ec.class, ecVar);
    }

    private ec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPctOfListShown() {
        this.bitField0_ &= -2;
        this.pctOfListShown_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToMode() {
        this.toMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateSource() {
        this.updateSource_ = 0;
    }

    public static ec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dz newBuilder() {
        return (dz) DEFAULT_INSTANCE.createBuilder();
    }

    public static ec parseDelimitedFrom(InputStream inputStream) {
        return (ec) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ec parseFrom(com.google.v.v vVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ec> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPctOfListShown(float f2) {
        this.bitField0_ |= 1;
        this.pctOfListShown_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToMode(ea eaVar) {
        this.toMode_ = eaVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToModeValue(int i2) {
        this.toMode_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateSource(eb ebVar) {
        this.updateSource_ = ebVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateSourceValue(int i2) {
        this.updateSource_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003ခ\u0000", new Object[]{"bitField0_", "toMode_", "updateSource_", "pctOfListShown_"});
        }
        if (iOrdinal == 3) {
            return new ec();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ec> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ec.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public float getPctOfListShown() {
        return this.pctOfListShown_;
    }

    public ea getToMode() {
        int i2 = this.toMode_;
        ea eaVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : ea.LIST : ea.MAP : ea.MODE_UNSPECIFIED;
        return eaVar == null ? ea.UNRECOGNIZED : eaVar;
    }

    public int getToModeValue() {
        return this.toMode_;
    }

    public eb getUpdateSource() {
        int i2 = this.updateSource_;
        eb ebVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : eb.SYSTEM : eb.USER_ACTION : eb.UPDATE_SOURCE_UNSPECIFIED;
        return ebVar == null ? eb.UNRECOGNIZED : ebVar;
    }

    public int getUpdateSourceValue() {
        return this.updateSource_;
    }

    public boolean hasPctOfListShown() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dz newBuilder(ec ecVar) {
        return (dz) DEFAULT_INSTANCE.createBuilder(ecVar);
    }

    public static ec parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ec) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ec parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ec parseFrom(com.google.v.z zVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ec parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ec parseFrom(InputStream inputStream) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ec parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ec parseFrom(ByteBuffer byteBuffer) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ec parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ec parseFrom(byte[] bArr) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ec parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
