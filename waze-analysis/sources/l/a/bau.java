package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bau extends com.google.v.du<bau, bat> implements com.google.v.fj {
    private static final bau DEFAULT_INSTANCE;
    public static final int GENERIC_RESPONSE_DATA_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bau> PARSER;
    private int bitField0_;
    private bas genericResponseData_;

    static {
        bau bauVar = new bau();
        DEFAULT_INSTANCE = bauVar;
        com.google.v.du.registerDefaultInstance(bau.class, bauVar);
    }

    private bau() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGenericResponseData() {
        this.genericResponseData_ = null;
        this.bitField0_ &= -2;
    }

    public static bau getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGenericResponseData(bas basVar) {
        Objects.requireNonNull(basVar);
        bas basVar2 = this.genericResponseData_;
        if (basVar2 != null && basVar2 != bas.getDefaultInstance()) {
            bao baoVarNewBuilder = bas.newBuilder(basVar2);
            baoVarNewBuilder.mergeFrom((bao) basVar);
            basVar = baoVarNewBuilder.buildPartial();
        }
        this.genericResponseData_ = basVar;
        this.bitField0_ |= 1;
    }

    public static bat newBuilder() {
        return (bat) DEFAULT_INSTANCE.createBuilder();
    }

    public static bau parseDelimitedFrom(InputStream inputStream) {
        return (bau) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bau parseFrom(com.google.v.v vVar) {
        return (bau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bau> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGenericResponseData(bas basVar) {
        Objects.requireNonNull(basVar);
        this.genericResponseData_ = basVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "genericResponseData_"});
        }
        if (iOrdinal == 3) {
            return new bau();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bat(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bau> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bau.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bas getGenericResponseData() {
        bas basVar = this.genericResponseData_;
        return basVar == null ? bas.getDefaultInstance() : basVar;
    }

    public boolean hasGenericResponseData() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bat newBuilder(bau bauVar) {
        return (bat) DEFAULT_INSTANCE.createBuilder(bauVar);
    }

    public static bau parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bau) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bau parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bau parseFrom(com.google.v.z zVar) {
        return (bau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bau parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bau parseFrom(InputStream inputStream) {
        return (bau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bau parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bau parseFrom(ByteBuffer byteBuffer) {
        return (bau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bau parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bau parseFrom(byte[] bArr) {
        return (bau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bau parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bau) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
