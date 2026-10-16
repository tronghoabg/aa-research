package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class asi extends com.google.v.du<asi, ash> implements com.google.v.fj {
    private static final asi DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<asi> PARSER = null;
    public static final int PROMOTIONAL_CHIP_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private ase promotionalChipInfo_;

    static {
        asi asiVar = new asi();
        DEFAULT_INSTANCE = asiVar;
        com.google.v.du.registerDefaultInstance(asi.class, asiVar);
    }

    private asi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromotionalChipInfo() {
        this.promotionalChipInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static asi getDefaultInstance() {
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

    public static ash newBuilder() {
        return (ash) DEFAULT_INSTANCE.createBuilder();
    }

    public static asi parseDelimitedFrom(InputStream inputStream) {
        return (asi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static asi parseFrom(com.google.v.v vVar) {
        return (asi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<asi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromotionalChipInfo(ase aseVar) {
        Objects.requireNonNull(aseVar);
        this.promotionalChipInfo_ = aseVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "promotionalChipInfo_"});
        }
        if (iOrdinal == 3) {
            return new asi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ash(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<asi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (asi.class) {
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

    public boolean hasPromotionalChipInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ash newBuilder(asi asiVar) {
        return (ash) DEFAULT_INSTANCE.createBuilder(asiVar);
    }

    public static asi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (asi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static asi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (asi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static asi parseFrom(com.google.v.z zVar) {
        return (asi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static asi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (asi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static asi parseFrom(InputStream inputStream) {
        return (asi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static asi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (asi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static asi parseFrom(ByteBuffer byteBuffer) {
        return (asi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static asi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (asi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static asi parseFrom(byte[] bArr) {
        return (asi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static asi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (asi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
