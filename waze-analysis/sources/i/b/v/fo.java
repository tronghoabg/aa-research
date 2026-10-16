package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fo extends com.google.v.du<fo, fn> implements com.google.v.fj {
    private static final fo DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<fo> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private br info_;
    private com.google.v.eo<String> value_ = emptyProtobufList();

    static {
        fo foVar = new fo();
        DEFAULT_INSTANCE = foVar;
        com.google.v.du.registerDefaultInstance(fo.class, foVar);
    }

    private fo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValue(Iterable<String> iterable) {
        ensureValueIsMutable();
        com.google.v.c.addAll(iterable, this.value_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValue(String str) {
        Objects.requireNonNull(str);
        ensureValueIsMutable();
        this.value_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValueBytes(com.google.v.v vVar) {
        ensureValueIsMutable();
        this.value_.add(vVar.u());
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
        com.google.v.eo<String> eoVar = this.value_;
        if (eoVar.c()) {
            return;
        }
        this.value_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static fo getDefaultInstance() {
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

    public static fn newBuilder() {
        return (fn) DEFAULT_INSTANCE.createBuilder();
    }

    public static fo parseDelimitedFrom(InputStream inputStream) {
        return (fo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fo parseFrom(com.google.v.v vVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(br brVar) {
        Objects.requireNonNull(brVar);
        this.info_ = brVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i2, String str) {
        Objects.requireNonNull(str);
        ensureValueIsMutable();
        this.value_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"bitField0_", "value_", "info_"});
        }
        if (iOrdinal == 3) {
            return new fo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fo.class) {
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

    public String getValue(int i2) {
        return this.value_.get(i2);
    }

    public com.google.v.v getValueBytes(int i2) {
        return com.google.v.v.s(this.value_.get(i2));
    }

    public int getValueCount() {
        return this.value_.size();
    }

    public List<String> getValueList() {
        return this.value_;
    }

    public boolean hasInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static fn newBuilder(fo foVar) {
        return (fn) DEFAULT_INSTANCE.createBuilder(foVar);
    }

    public static fo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fo parseFrom(com.google.v.z zVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fo parseFrom(InputStream inputStream) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fo parseFrom(ByteBuffer byteBuffer) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fo parseFrom(byte[] bArr) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
