package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fz extends com.google.v.du<fz, fy> implements com.google.v.fj {
    public static final int CONFIG_FIELD_NUMBER = 1;
    private static final fz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fz> PARSER;
    private com.google.v.eo<fw> config_ = emptyProtobufList();

    static {
        fz fzVar = new fz();
        DEFAULT_INSTANCE = fzVar;
        com.google.v.du.registerDefaultInstance(fz.class, fzVar);
    }

    private fz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConfig(Iterable<? extends fw> iterable) {
        ensureConfigIsMutable();
        com.google.v.c.addAll(iterable, this.config_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConfig(int i2, fw fwVar) {
        Objects.requireNonNull(fwVar);
        ensureConfigIsMutable();
        this.config_.add(i2, fwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfig() {
        this.config_ = emptyProtobufList();
    }

    private void ensureConfigIsMutable() {
        com.google.v.eo<fw> eoVar = this.config_;
        if (eoVar.c()) {
            return;
        }
        this.config_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static fz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fy newBuilder() {
        return (fy) DEFAULT_INSTANCE.createBuilder();
    }

    public static fz parseDelimitedFrom(InputStream inputStream) {
        return (fz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fz parseFrom(com.google.v.v vVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConfig(int i2) {
        ensureConfigIsMutable();
        this.config_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfig(int i2, fw fwVar) {
        Objects.requireNonNull(fwVar);
        ensureConfigIsMutable();
        this.config_.set(i2, fwVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"config_", fw.class});
        }
        if (iOrdinal == 3) {
            return new fz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public fw getConfig(int i2) {
        return this.config_.get(i2);
    }

    public int getConfigCount() {
        return this.config_.size();
    }

    public List<fw> getConfigList() {
        return this.config_;
    }

    public fx getConfigOrBuilder(int i2) {
        return this.config_.get(i2);
    }

    public List<? extends fx> getConfigOrBuilderList() {
        return this.config_;
    }

    public static fy newBuilder(fz fzVar) {
        return (fy) DEFAULT_INSTANCE.createBuilder(fzVar);
    }

    public static fz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fz parseFrom(com.google.v.z zVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConfig(fw fwVar) {
        Objects.requireNonNull(fwVar);
        ensureConfigIsMutable();
        this.config_.add(fwVar);
    }

    public static fz parseFrom(InputStream inputStream) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fz parseFrom(ByteBuffer byteBuffer) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fz parseFrom(byte[] bArr) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
