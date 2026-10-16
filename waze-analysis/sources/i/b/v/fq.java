package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fq extends com.google.v.du<fq, fp> implements com.google.v.fj {
    private static final fq DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<fq> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private br info_;
    private String value_ = "";

    static {
        fq fqVar = new fq();
        DEFAULT_INSTANCE = fqVar;
        com.google.v.du.registerDefaultInstance(fq.class, fqVar);
    }

    private fq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfo() {
        this.info_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.bitField0_ &= -2;
        this.value_ = getDefaultInstance().getValue();
    }

    public static fq getDefaultInstance() {
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

    public static fp newBuilder() {
        return (fp) DEFAULT_INSTANCE.createBuilder();
    }

    public static fq parseDelimitedFrom(InputStream inputStream) {
        return (fq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fq parseFrom(com.google.v.v vVar) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(br brVar) {
        Objects.requireNonNull(brVar);
        this.info_ = brVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(com.google.v.v vVar) {
        this.value_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "value_", "info_"});
        }
        if (iOrdinal == 3) {
            return new fq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fq.class) {
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

    public String getValue() {
        return this.value_;
    }

    public com.google.v.v getValueBytes() {
        return com.google.v.v.s(this.value_);
    }

    public boolean hasInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public static fp newBuilder(fq fqVar) {
        return (fp) DEFAULT_INSTANCE.createBuilder(fqVar);
    }

    public static fq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fq parseFrom(com.google.v.z zVar) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fq parseFrom(InputStream inputStream) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fq parseFrom(ByteBuffer byteBuffer) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fq parseFrom(byte[] bArr) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
