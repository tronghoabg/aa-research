package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class es extends com.google.v.du<es, er> implements com.google.v.fj {
    private static final es DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<es> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private br info_;
    private byte memoizedIsInitialized = 2;
    private u value_;

    static {
        es esVar = new es();
        DEFAULT_INSTANCE = esVar;
        com.google.v.du.registerDefaultInstance(es.class, esVar);
    }

    private es() {
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

    public static es getDefaultInstance() {
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
    public void mergeValue(u uVar) {
        Objects.requireNonNull(uVar);
        u uVar2 = this.value_;
        if (uVar2 != null && uVar2 != u.getDefaultInstance()) {
            t tVarNewBuilder = u.newBuilder(uVar2);
            tVarNewBuilder.mergeFrom((t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.value_ = uVar;
        this.bitField0_ |= 1;
    }

    public static er newBuilder() {
        return (er) DEFAULT_INSTANCE.createBuilder();
    }

    public static es parseDelimitedFrom(InputStream inputStream) {
        return (es) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static es parseFrom(com.google.v.v vVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<es> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(br brVar) {
        Objects.requireNonNull(brVar);
        this.info_ = brVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(u uVar) {
        Objects.requireNonNull(uVar);
        this.value_ = uVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "value_", "info_"});
            case 3:
                return new es();
            case 4:
                return new er(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<es> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (es.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public br getInfo() {
        br brVar = this.info_;
        return brVar == null ? br.getDefaultInstance() : brVar;
    }

    public u getValue() {
        u uVar = this.value_;
        return uVar == null ? u.getDefaultInstance() : uVar;
    }

    public boolean hasInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public static er newBuilder(es esVar) {
        return (er) DEFAULT_INSTANCE.createBuilder(esVar);
    }

    public static es parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (es) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static es parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static es parseFrom(com.google.v.z zVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static es parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static es parseFrom(InputStream inputStream) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static es parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static es parseFrom(ByteBuffer byteBuffer) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static es parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static es parseFrom(byte[] bArr) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static es parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
