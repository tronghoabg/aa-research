package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class eo extends com.google.v.du<eo, en> implements com.google.v.fj {
    private static final eo DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<eo> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private br info_;
    private com.google.v.eo<i> value_ = emptyProtobufList();

    static {
        eo eoVar = new eo();
        DEFAULT_INSTANCE = eoVar;
        com.google.v.du.registerDefaultInstance(eo.class, eoVar);
    }

    private eo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValue(Iterable<? extends i> iterable) {
        ensureValueIsMutable();
        com.google.v.c.addAll(iterable, this.value_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValue(int i2, i iVar) {
        Objects.requireNonNull(iVar);
        ensureValueIsMutable();
        this.value_.add(i2, iVar);
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
        com.google.v.eo<i> eoVar = this.value_;
        if (eoVar.c()) {
            return;
        }
        this.value_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static eo getDefaultInstance() {
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

    public static en newBuilder() {
        return (en) DEFAULT_INSTANCE.createBuilder();
    }

    public static eo parseDelimitedFrom(InputStream inputStream) {
        return (eo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eo parseFrom(com.google.v.v vVar) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<eo> parser() {
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
    public void setValue(int i2, i iVar) {
        Objects.requireNonNull(iVar);
        ensureValueIsMutable();
        this.value_.set(i2, iVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "value_", i.class, "info_"});
        }
        if (iOrdinal == 3) {
            return new eo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new en(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<eo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (eo.class) {
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

    public i getValue(int i2) {
        return this.value_.get(i2);
    }

    public int getValueCount() {
        return this.value_.size();
    }

    public List<i> getValueList() {
        return this.value_;
    }

    public j getValueOrBuilder(int i2) {
        return this.value_.get(i2);
    }

    public List<? extends j> getValueOrBuilderList() {
        return this.value_;
    }

    public boolean hasInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static en newBuilder(eo eoVar) {
        return (en) DEFAULT_INSTANCE.createBuilder(eoVar);
    }

    public static eo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static eo parseFrom(com.google.v.z zVar) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static eo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValue(i iVar) {
        Objects.requireNonNull(iVar);
        ensureValueIsMutable();
        this.value_.add(iVar);
    }

    public static eo parseFrom(InputStream inputStream) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eo parseFrom(ByteBuffer byteBuffer) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static eo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static eo parseFrom(byte[] bArr) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static eo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (eo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
