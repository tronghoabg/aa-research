package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ry extends com.google.v.du<ry, rx> implements com.google.v.fj {
    private static final ry DEFAULT_INSTANCE;
    public static final int DETOUR_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ry> PARSER;
    private int bitField0_;
    private ro detour_;

    static {
        ry ryVar = new ry();
        DEFAULT_INSTANCE = ryVar;
        com.google.v.du.registerDefaultInstance(ry.class, ryVar);
    }

    private ry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetour() {
        this.detour_ = null;
        this.bitField0_ &= -2;
    }

    public static ry getDefaultInstance() {
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

    public static rx newBuilder() {
        return (rx) DEFAULT_INSTANCE.createBuilder();
    }

    public static ry parseDelimitedFrom(InputStream inputStream) {
        return (ry) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ry parseFrom(com.google.v.v vVar) {
        return (ry) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ry> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetour(ro roVar) {
        Objects.requireNonNull(roVar);
        this.detour_ = roVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "detour_"});
        }
        if (iOrdinal == 3) {
            return new ry();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new rx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ry> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ry.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ro getDetour() {
        ro roVar = this.detour_;
        return roVar == null ? ro.getDefaultInstance() : roVar;
    }

    public boolean hasDetour() {
        return (this.bitField0_ & 1) != 0;
    }

    public static rx newBuilder(ry ryVar) {
        return (rx) DEFAULT_INSTANCE.createBuilder(ryVar);
    }

    public static ry parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ry) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ry parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ry) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ry parseFrom(com.google.v.z zVar) {
        return (ry) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ry parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ry) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ry parseFrom(InputStream inputStream) {
        return (ry) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ry parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ry) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ry parseFrom(ByteBuffer byteBuffer) {
        return (ry) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ry parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ry) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ry parseFrom(byte[] bArr) {
        return (ry) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ry parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ry) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
