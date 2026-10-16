package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class asl extends com.google.v.du<asl, asj> implements com.google.v.fj {
    private static final asl DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<asl> PARSER = null;
    public static final int PROMOTIONAL_CHIP_INFO_FIELD_NUMBER = 2;
    public static final int SKIP_REASON_FIELD_NUMBER = 1;
    private int bitField0_;
    private ase promotionalChipInfo_;
    private int skipReason_;

    static {
        asl aslVar = new asl();
        DEFAULT_INSTANCE = aslVar;
        com.google.v.du.registerDefaultInstance(asl.class, aslVar);
    }

    private asl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromotionalChipInfo() {
        this.promotionalChipInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkipReason() {
        this.skipReason_ = 0;
    }

    public static asl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePromotionalChipInfo(ase aseVar) {
        Objects.requireNonNull(aseVar);
        ase aseVar2 = this.promotionalChipInfo_;
        if (aseVar2 != null && aseVar2 != ase.getDefaultInstance()) {
            asd asdVarNewBuilder = ase.newBuilder(aseVar2);
            asdVarNewBuilder.mergeFrom((asd) aseVar);
            aseVar = asdVarNewBuilder.buildPartial();
        }
        this.promotionalChipInfo_ = aseVar;
        this.bitField0_ |= 1;
    }

    public static asj newBuilder() {
        return (asj) DEFAULT_INSTANCE.createBuilder();
    }

    public static asl parseDelimitedFrom(InputStream inputStream) {
        return (asl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static asl parseFrom(com.google.v.v vVar) {
        return (asl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<asl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromotionalChipInfo(ase aseVar) {
        Objects.requireNonNull(aseVar);
        this.promotionalChipInfo_ = aseVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipReason(ask askVar) {
        this.skipReason_ = askVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipReasonValue(int i2) {
        this.skipReason_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "skipReason_", "promotionalChipInfo_"});
        }
        if (iOrdinal == 3) {
            return new asl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new asj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<asl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (asl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ase getPromotionalChipInfo() {
        ase aseVar = this.promotionalChipInfo_;
        return aseVar == null ? ase.getDefaultInstance() : aseVar;
    }

    public ask getSkipReason() {
        int i2 = this.skipReason_;
        ask askVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : ask.ROAMING : ask.IN_CAR_PROJECTED_CONNECTED : ask.NAVIGATING : ask.SKIP_REASON_UNSPECIFIED;
        return askVar == null ? ask.UNRECOGNIZED : askVar;
    }

    public int getSkipReasonValue() {
        return this.skipReason_;
    }

    public boolean hasPromotionalChipInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static asj newBuilder(asl aslVar) {
        return (asj) DEFAULT_INSTANCE.createBuilder(aslVar);
    }

    public static asl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (asl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static asl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (asl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static asl parseFrom(com.google.v.z zVar) {
        return (asl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static asl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (asl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static asl parseFrom(InputStream inputStream) {
        return (asl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static asl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (asl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static asl parseFrom(ByteBuffer byteBuffer) {
        return (asl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static asl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (asl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static asl parseFrom(byte[] bArr) {
        return (asl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static asl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (asl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
