package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fc extends com.google.v.du<fc, fb> implements com.google.v.fj {
    private static final fc DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<fc> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private br info_;
    private byte memoizedIsInitialized = 2;
    private bx value_;

    static {
        fc fcVar = new fc();
        DEFAULT_INSTANCE = fcVar;
        com.google.v.du.registerDefaultInstance(fc.class, fcVar);
    }

    private fc() {
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

    public static fc getDefaultInstance() {
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
    public void mergeValue(bx bxVar) {
        Objects.requireNonNull(bxVar);
        bx bxVar2 = this.value_;
        if (bxVar2 != null && bxVar2 != bx.getDefaultInstance()) {
            bv bvVarNewBuilder = bx.newBuilder(bxVar2);
            bvVarNewBuilder.mergeFrom((bv) bxVar);
            bxVar = bvVarNewBuilder.buildPartial();
        }
        this.value_ = bxVar;
        this.bitField0_ |= 1;
    }

    public static fb newBuilder() {
        return (fb) DEFAULT_INSTANCE.createBuilder();
    }

    public static fc parseDelimitedFrom(InputStream inputStream) {
        return (fc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fc parseFrom(com.google.v.v vVar) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(br brVar) {
        Objects.requireNonNull(brVar);
        this.info_ = brVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(bx bxVar) {
        Objects.requireNonNull(bxVar);
        this.value_ = bxVar;
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
                return new fc();
            case 4:
                return new fb(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<fc> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (fc.class) {
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

    public bx getValue() {
        bx bxVar = this.value_;
        return bxVar == null ? bx.getDefaultInstance() : bxVar;
    }

    public boolean hasInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public static fb newBuilder(fc fcVar) {
        return (fb) DEFAULT_INSTANCE.createBuilder(fcVar);
    }

    public static fc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fc parseFrom(com.google.v.z zVar) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fc parseFrom(InputStream inputStream) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fc parseFrom(ByteBuffer byteBuffer) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fc parseFrom(byte[] bArr) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
