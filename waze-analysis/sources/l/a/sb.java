package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class sb extends com.google.v.du<sb, rz> implements com.google.v.fj {
    public static final int ALREADY_SHOWN_FIELD_NUMBER = 2;
    private static final sb DEFAULT_INSTANCE;
    public static final int DETOUR_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<sb> PARSER = null;
    public static final int REMOVE_TYPE_FIELD_NUMBER = 3;
    private boolean alreadyShown_;
    private int bitField0_;
    private ro detour_;
    private int removeType_;

    static {
        sb sbVar = new sb();
        DEFAULT_INSTANCE = sbVar;
        com.google.v.du.registerDefaultInstance(sb.class, sbVar);
    }

    private sb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlreadyShown() {
        this.bitField0_ &= -3;
        this.alreadyShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetour() {
        this.detour_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoveType() {
        this.removeType_ = 0;
    }

    public static sb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDetour(ro roVar) {
        Objects.requireNonNull(roVar);
        ro roVar2 = this.detour_;
        if (roVar2 != null && roVar2 != ro.getDefaultInstance()) {
            rn rnVarNewBuilder = ro.newBuilder(roVar2);
            rnVarNewBuilder.mergeFrom((rn) roVar);
            roVar = rnVarNewBuilder.buildPartial();
        }
        this.detour_ = roVar;
        this.bitField0_ |= 1;
    }

    public static rz newBuilder() {
        return (rz) DEFAULT_INSTANCE.createBuilder();
    }

    public static sb parseDelimitedFrom(InputStream inputStream) {
        return (sb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sb parseFrom(com.google.v.v vVar) {
        return (sb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<sb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlreadyShown(boolean z) {
        this.bitField0_ |= 2;
        this.alreadyShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetour(ro roVar) {
        Objects.requireNonNull(roVar);
        this.detour_ = roVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveType(sa saVar) {
        this.removeType_ = saVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveTypeValue(int i2) {
        this.removeType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003\f", new Object[]{"bitField0_", "detour_", "alreadyShown_", "removeType_"});
        }
        if (iOrdinal == 3) {
            return new sb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new rz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<sb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (sb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAlreadyShown() {
        return this.alreadyShown_;
    }

    public ro getDetour() {
        ro roVar = this.detour_;
        return roVar == null ? ro.getDefaultInstance() : roVar;
    }

    @Deprecated
    public sa getRemoveType() {
        int i2 = this.removeType_;
        sa saVar = i2 != 0 ? i2 != 1 ? null : sa.INVALID : sa.REMOVE_TYPE_UNSPECIFIED;
        return saVar == null ? sa.UNRECOGNIZED : saVar;
    }

    @Deprecated
    public int getRemoveTypeValue() {
        return this.removeType_;
    }

    public boolean hasAlreadyShown() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDetour() {
        return (this.bitField0_ & 1) != 0;
    }

    public static rz newBuilder(sb sbVar) {
        return (rz) DEFAULT_INSTANCE.createBuilder(sbVar);
    }

    public static sb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (sb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static sb parseFrom(com.google.v.z zVar) {
        return (sb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static sb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (sb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static sb parseFrom(InputStream inputStream) {
        return (sb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sb parseFrom(ByteBuffer byteBuffer) {
        return (sb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static sb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (sb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static sb parseFrom(byte[] bArr) {
        return (sb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static sb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (sb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
