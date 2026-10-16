package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class bz extends com.google.v.du<bz, by> implements com.google.v.fj {
    public static final int CONFIG_KEY_FIELD_NUMBER = 1;
    private static final bz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bz> PARSER;
    private com.google.v.eo<bt> configKey_ = emptyProtobufList();

    static {
        bz bzVar = new bz();
        DEFAULT_INSTANCE = bzVar;
        com.google.v.du.registerDefaultInstance(bz.class, bzVar);
    }

    private bz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConfigKey(Iterable<? extends bt> iterable) {
        ensureConfigKeyIsMutable();
        com.google.v.c.addAll(iterable, this.configKey_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConfigKey(int i2, bt btVar) {
        Objects.requireNonNull(btVar);
        ensureConfigKeyIsMutable();
        this.configKey_.add(i2, btVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigKey() {
        this.configKey_ = emptyProtobufList();
    }

    private void ensureConfigKeyIsMutable() {
        com.google.v.eo<bt> eoVar = this.configKey_;
        if (eoVar.c()) {
            return;
        }
        this.configKey_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static by newBuilder() {
        return (by) DEFAULT_INSTANCE.createBuilder();
    }

    public static bz parseDelimitedFrom(InputStream inputStream) {
        return (bz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bz parseFrom(com.google.v.v vVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConfigKey(int i2) {
        ensureConfigKeyIsMutable();
        this.configKey_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigKey(int i2, bt btVar) {
        Objects.requireNonNull(btVar);
        ensureConfigKeyIsMutable();
        this.configKey_.set(i2, btVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"configKey_", bt.class});
        }
        if (iOrdinal == 3) {
            return new bz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new by(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bt getConfigKey(int i2) {
        return this.configKey_.get(i2);
    }

    public int getConfigKeyCount() {
        return this.configKey_.size();
    }

    public List<bt> getConfigKeyList() {
        return this.configKey_;
    }

    public bu getConfigKeyOrBuilder(int i2) {
        return this.configKey_.get(i2);
    }

    public List<? extends bu> getConfigKeyOrBuilderList() {
        return this.configKey_;
    }

    public static by newBuilder(bz bzVar) {
        return (by) DEFAULT_INSTANCE.createBuilder(bzVar);
    }

    public static bz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bz parseFrom(com.google.v.z zVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConfigKey(bt btVar) {
        Objects.requireNonNull(btVar);
        ensureConfigKeyIsMutable();
        this.configKey_.add(btVar);
    }

    public static bz parseFrom(InputStream inputStream) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bz parseFrom(ByteBuffer byteBuffer) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bz parseFrom(byte[] bArr) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
