package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class bx extends com.google.v.du<bx, bw> implements com.google.v.fj {
    public static final int CONFIG_FIELD_NUMBER = 1;
    private static final bx DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bx> PARSER;
    private com.google.v.eo<br> config_ = emptyProtobufList();

    static {
        bx bxVar = new bx();
        DEFAULT_INSTANCE = bxVar;
        com.google.v.du.registerDefaultInstance(bx.class, bxVar);
    }

    private bx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConfig(Iterable<? extends br> iterable) {
        ensureConfigIsMutable();
        com.google.v.c.addAll(iterable, this.config_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConfig(int i2, br brVar) {
        Objects.requireNonNull(brVar);
        ensureConfigIsMutable();
        this.config_.add(i2, brVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfig() {
        this.config_ = emptyProtobufList();
    }

    private void ensureConfigIsMutable() {
        com.google.v.eo<br> eoVar = this.config_;
        if (eoVar.c()) {
            return;
        }
        this.config_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bw newBuilder() {
        return (bw) DEFAULT_INSTANCE.createBuilder();
    }

    public static bx parseDelimitedFrom(InputStream inputStream) {
        return (bx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bx parseFrom(com.google.v.v vVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConfig(int i2) {
        ensureConfigIsMutable();
        this.config_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfig(int i2, br brVar) {
        Objects.requireNonNull(brVar);
        ensureConfigIsMutable();
        this.config_.set(i2, brVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"config_", br.class});
        }
        if (iOrdinal == 3) {
            return new bx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public br getConfig(int i2) {
        return this.config_.get(i2);
    }

    public int getConfigCount() {
        return this.config_.size();
    }

    public List<br> getConfigList() {
        return this.config_;
    }

    public bv getConfigOrBuilder(int i2) {
        return this.config_.get(i2);
    }

    public List<? extends bv> getConfigOrBuilderList() {
        return this.config_;
    }

    public static bw newBuilder(bx bxVar) {
        return (bw) DEFAULT_INSTANCE.createBuilder(bxVar);
    }

    public static bx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bx parseFrom(com.google.v.z zVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConfig(br brVar) {
        Objects.requireNonNull(brVar);
        ensureConfigIsMutable();
        this.config_.add(brVar);
    }

    public static bx parseFrom(InputStream inputStream) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bx parseFrom(ByteBuffer byteBuffer) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bx parseFrom(byte[] bArr) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
