package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fa extends com.google.v.du<fa, ez> implements com.google.v.fj {
    private static final fa DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<fa> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private br info_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<bi> value_ = emptyProtobufList();

    static {
        fa faVar = new fa();
        DEFAULT_INSTANCE = faVar;
        com.google.v.du.registerDefaultInstance(fa.class, faVar);
    }

    private fa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValue(Iterable<? extends bi> iterable) {
        ensureValueIsMutable();
        com.google.v.c.addAll(iterable, this.value_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValue(int i2, bi biVar) {
        Objects.requireNonNull(biVar);
        ensureValueIsMutable();
        this.value_.add(i2, biVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfo() {
        this.info_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = emptyProtobufList();
    }

    private void ensureValueIsMutable() {
        com.google.v.eo<bi> eoVar = this.value_;
        if (eoVar.c()) {
            return;
        }
        this.value_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static fa getDefaultInstance() {
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
        this.bitField0_ |= 1;
    }

    public static ez newBuilder() {
        return (ez) DEFAULT_INSTANCE.createBuilder();
    }

    public static fa parseDelimitedFrom(InputStream inputStream) {
        return (fa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fa parseFrom(com.google.v.v vVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValue(int i2) {
        ensureValueIsMutable();
        this.value_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(br brVar) {
        Objects.requireNonNull(brVar);
        this.info_ = brVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i2, bi biVar) {
        Objects.requireNonNull(biVar);
        ensureValueIsMutable();
        this.value_.set(i2, biVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000", new Object[]{"bitField0_", "value_", bi.class, "info_"});
            case 3:
                return new fa();
            case 4:
                return new ez(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<fa> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (fa.class) {
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

    public bi getValue(int i2) {
        return this.value_.get(i2);
    }

    public int getValueCount() {
        return this.value_.size();
    }

    public List<bi> getValueList() {
        return this.value_;
    }

    public bj getValueOrBuilder(int i2) {
        return this.value_.get(i2);
    }

    public List<? extends bj> getValueOrBuilderList() {
        return this.value_;
    }

    public boolean hasInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ez newBuilder(fa faVar) {
        return (ez) DEFAULT_INSTANCE.createBuilder(faVar);
    }

    public static fa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fa parseFrom(com.google.v.z zVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValue(bi biVar) {
        Objects.requireNonNull(biVar);
        ensureValueIsMutable();
        this.value_.add(biVar);
    }

    public static fa parseFrom(InputStream inputStream) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fa parseFrom(ByteBuffer byteBuffer) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fa parseFrom(byte[] bArr) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
