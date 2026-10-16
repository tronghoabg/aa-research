package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fe extends com.google.v.du<fe, fd> implements com.google.v.fj {
    private static final fe DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<fe> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private br info_;
    private int value_;

    static {
        fe feVar = new fe();
        DEFAULT_INSTANCE = feVar;
        com.google.v.du.registerDefaultInstance(fe.class, feVar);
    }

    private fe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfo() {
        this.info_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.bitField0_ &= -2;
        this.value_ = 0;
    }

    public static fe getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInfo(br brVar) {
        Objects.requireNonNull(brVar);
        br brVar2 = this.info_;
        if (brVar2 != null && brVar2 != br.getDefaultInstance()) {
            bq bqVarNewBuilder = br.newBuilder(brVar2);
            bqVarNewBuilder.mergeFrom((bq) brVar);
            brVar = bqVarNewBuilder.buildPartial();
        }
        this.info_ = brVar;
        this.bitField0_ |= 2;
    }

    public static fd newBuilder() {
        return (fd) DEFAULT_INSTANCE.createBuilder();
    }

    public static fe parseDelimitedFrom(InputStream inputStream) {
        return (fe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fe parseFrom(com.google.v.v vVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fe> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(br brVar) {
        Objects.requireNonNull(brVar);
        this.info_ = brVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i2) {
        this.bitField0_ |= 1;
        this.value_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "value_", "info_"});
        }
        if (iOrdinal == 3) {
            return new fe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fe> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fe.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public br getInfo() {
        br brVar = this.info_;
        return brVar == null ? br.getDefaultInstance() : brVar;
    }

    public int getValue() {
        return this.value_;
    }

    public boolean hasInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public static fd newBuilder(fe feVar) {
        return (fd) DEFAULT_INSTANCE.createBuilder(feVar);
    }

    public static fe parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fe parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fe parseFrom(com.google.v.z zVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fe parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fe parseFrom(InputStream inputStream) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fe parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fe parseFrom(ByteBuffer byteBuffer) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fe parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fe parseFrom(byte[] bArr) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fe parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
