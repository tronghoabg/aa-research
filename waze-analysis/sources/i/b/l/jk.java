package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class jk extends com.google.v.du<jk, jj> implements com.google.v.fj {
    private static final jk DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<jk> PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 1;
    private com.google.v.eo<jt> provider_ = emptyProtobufList();

    static {
        jk jkVar = new jk();
        DEFAULT_INSTANCE = jkVar;
        com.google.v.du.registerDefaultInstance(jk.class, jkVar);
    }

    private jk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProvider(Iterable<? extends jt> iterable) {
        ensureProviderIsMutable();
        com.google.v.c.addAll(iterable, this.provider_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvider(int i2, jt jtVar) {
        Objects.requireNonNull(jtVar);
        ensureProviderIsMutable();
        this.provider_.add(i2, jtVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.provider_ = emptyProtobufList();
    }

    private void ensureProviderIsMutable() {
        com.google.v.eo<jt> eoVar = this.provider_;
        if (eoVar.c()) {
            return;
        }
        this.provider_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static jk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jj newBuilder() {
        return (jj) DEFAULT_INSTANCE.createBuilder();
    }

    public static jk parseDelimitedFrom(InputStream inputStream) {
        return (jk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jk parseFrom(com.google.v.v vVar) {
        return (jk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProvider(int i2) {
        ensureProviderIsMutable();
        this.provider_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(int i2, jt jtVar) {
        Objects.requireNonNull(jtVar);
        ensureProviderIsMutable();
        this.provider_.set(i2, jtVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"provider_", jt.class});
        }
        if (iOrdinal == 3) {
            return new jk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public jt getProvider(int i2) {
        return this.provider_.get(i2);
    }

    public int getProviderCount() {
        return this.provider_.size();
    }

    public List<jt> getProviderList() {
        return this.provider_;
    }

    public ju getProviderOrBuilder(int i2) {
        return this.provider_.get(i2);
    }

    public List<? extends ju> getProviderOrBuilderList() {
        return this.provider_;
    }

    public static jj newBuilder(jk jkVar) {
        return (jj) DEFAULT_INSTANCE.createBuilder(jkVar);
    }

    public static jk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jk parseFrom(com.google.v.z zVar) {
        return (jk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvider(jt jtVar) {
        Objects.requireNonNull(jtVar);
        ensureProviderIsMutable();
        this.provider_.add(jtVar);
    }

    public static jk parseFrom(InputStream inputStream) {
        return (jk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jk parseFrom(ByteBuffer byteBuffer) {
        return (jk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jk parseFrom(byte[] bArr) {
        return (jk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
