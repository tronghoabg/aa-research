package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bay extends com.google.v.du<bay, bax> implements com.google.v.fj {
    private static final bay DEFAULT_INSTANCE;
    public static final int GENERIC_RESPONSE_DATA_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bay> PARSER = null;
    public static final int USE_CASE_FIELD_NUMBER = 2;
    private int bitField0_;
    private bas genericResponseData_;
    private int useCase_;

    static {
        bay bayVar = new bay();
        DEFAULT_INSTANCE = bayVar;
        com.google.v.du.registerDefaultInstance(bay.class, bayVar);
    }

    private bay() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGenericResponseData() {
        this.genericResponseData_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseCase() {
        this.useCase_ = 0;
    }

    public static bay getDefaultInstance() {
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

    public static bax newBuilder() {
        return (bax) DEFAULT_INSTANCE.createBuilder();
    }

    public static bay parseDelimitedFrom(InputStream inputStream) {
        return (bay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bay parseFrom(com.google.v.v vVar) {
        return (bay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bay> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGenericResponseData(bas basVar) {
        Objects.requireNonNull(basVar);
        this.genericResponseData_ = basVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCase(awx awxVar) {
        this.useCase_ = awxVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCaseValue(int i2) {
        this.useCase_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "genericResponseData_", "useCase_"});
        }
        if (iOrdinal == 3) {
            return new bay();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bax(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bay> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bay.class) {
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

    public awx getUseCase() {
        awx awxVarA = awx.a(this.useCase_);
        return awxVarA == null ? awx.UNRECOGNIZED : awxVarA;
    }

    public int getUseCaseValue() {
        return this.useCase_;
    }

    public boolean hasGenericResponseData() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bax newBuilder(bay bayVar) {
        return (bax) DEFAULT_INSTANCE.createBuilder(bayVar);
    }

    public static bay parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bay parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bay parseFrom(com.google.v.z zVar) {
        return (bay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bay parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bay parseFrom(InputStream inputStream) {
        return (bay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bay parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bay parseFrom(ByteBuffer byteBuffer) {
        return (bay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bay parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bay parseFrom(byte[] bArr) {
        return (bay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bay parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
