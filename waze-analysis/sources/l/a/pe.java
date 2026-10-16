package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class pe extends com.google.v.du<pe, pd> implements com.google.v.fj {
    public static final int CAR_ID_FIELD_NUMBER = 1;
    private static final pe DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<pe> PARSER;
    private String carId_ = "";

    static {
        pe peVar = new pe();
        DEFAULT_INSTANCE = peVar;
        com.google.v.du.registerDefaultInstance(pe.class, peVar);
    }

    private pe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarId() {
        this.carId_ = getDefaultInstance().getCarId();
    }

    public static pe getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static pd newBuilder() {
        return (pd) DEFAULT_INSTANCE.createBuilder();
    }

    public static pe parseDelimitedFrom(InputStream inputStream) {
        return (pe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pe parseFrom(com.google.v.v vVar) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<pe> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarId(String str) {
        Objects.requireNonNull(str);
        this.carId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.carId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"carId_"});
        }
        if (iOrdinal == 3) {
            return new pe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new pd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<pe> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (pe.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCarId() {
        return this.carId_;
    }

    public com.google.v.v getCarIdBytes() {
        return com.google.v.v.s(this.carId_);
    }

    public static pd newBuilder(pe peVar) {
        return (pd) DEFAULT_INSTANCE.createBuilder(peVar);
    }

    public static pe parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pe parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static pe parseFrom(com.google.v.z zVar) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static pe parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static pe parseFrom(InputStream inputStream) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pe parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pe parseFrom(ByteBuffer byteBuffer) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static pe parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static pe parseFrom(byte[] bArr) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static pe parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
