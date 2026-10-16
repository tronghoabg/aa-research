package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class eu extends com.google.v.du<eu, et> implements com.google.v.fj {
    private static final eu DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<eu> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private br info_;
    private x value_;

    static {
        eu euVar = new eu();
        DEFAULT_INSTANCE = euVar;
        com.google.v.du.registerDefaultInstance(eu.class, euVar);
    }

    private eu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfo() {
        this.info_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = null;
        this.bitField0_ &= -2;
    }

    public static eu getDefaultInstance() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValue(x xVar) {
        Objects.requireNonNull(xVar);
        x xVar2 = this.value_;
        if (xVar2 != null && xVar2 != x.getDefaultInstance()) {
            w wVarNewBuilder = x.newBuilder(xVar2);
            wVarNewBuilder.mergeFrom((w) xVar);
            xVar = wVarNewBuilder.buildPartial();
        }
        this.value_ = xVar;
        this.bitField0_ |= 1;
    }

    public static et newBuilder() {
        return (et) DEFAULT_INSTANCE.createBuilder();
    }

    public static eu parseDelimitedFrom(InputStream inputStream) {
        return (eu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eu parseFrom(com.google.v.v vVar) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<eu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(br brVar) {
        Objects.requireNonNull(brVar);
        this.info_ = brVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(x xVar) {
        Objects.requireNonNull(xVar);
        this.value_ = xVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "value_", "info_"});
        }
        if (iOrdinal == 3) {
            return new eu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new et(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<eu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (eu.class) {
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

    public x getValue() {
        x xVar = this.value_;
        return xVar == null ? x.getDefaultInstance() : xVar;
    }

    public boolean hasInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public static et newBuilder(eu euVar) {
        return (et) DEFAULT_INSTANCE.createBuilder(euVar);
    }

    public static eu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static eu parseFrom(com.google.v.z zVar) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static eu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static eu parseFrom(InputStream inputStream) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eu parseFrom(ByteBuffer byteBuffer) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static eu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static eu parseFrom(byte[] bArr) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static eu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (eu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
