package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class nm extends com.google.v.du<nm, mz> implements com.google.v.fj {
    private static final nm DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<nm> PARSER = null;
    public static final int ROUTE_DURATIONS_FIELD_NUMBER = 1;
    private com.google.v.eo<nk> routeDurations_ = emptyProtobufList();

    static {
        nm nmVar = new nm();
        DEFAULT_INSTANCE = nmVar;
        com.google.v.du.registerDefaultInstance(nm.class, nmVar);
    }

    private nm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRouteDurations(Iterable<? extends nk> iterable) {
        ensureRouteDurationsIsMutable();
        com.google.v.c.addAll(iterable, this.routeDurations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouteDurations(int i2, nk nkVar) {
        Objects.requireNonNull(nkVar);
        ensureRouteDurationsIsMutable();
        this.routeDurations_.add(i2, nkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteDurations() {
        this.routeDurations_ = emptyProtobufList();
    }

    private void ensureRouteDurationsIsMutable() {
        com.google.v.eo<nk> eoVar = this.routeDurations_;
        if (eoVar.c()) {
            return;
        }
        this.routeDurations_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static nm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static mz newBuilder() {
        return (mz) DEFAULT_INSTANCE.createBuilder();
    }

    public static nm parseDelimitedFrom(InputStream inputStream) {
        return (nm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nm parseFrom(com.google.v.v vVar) {
        return (nm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRouteDurations(int i2) {
        ensureRouteDurationsIsMutable();
        this.routeDurations_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteDurations(int i2, nk nkVar) {
        Objects.requireNonNull(nkVar);
        ensureRouteDurationsIsMutable();
        this.routeDurations_.set(i2, nkVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"routeDurations_", nk.class});
        }
        if (iOrdinal == 3) {
            return new nm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new mz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<nm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (nm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public nk getRouteDurations(int i2) {
        return this.routeDurations_.get(i2);
    }

    public int getRouteDurationsCount() {
        return this.routeDurations_.size();
    }

    public List<nk> getRouteDurationsList() {
        return this.routeDurations_;
    }

    public nl getRouteDurationsOrBuilder(int i2) {
        return this.routeDurations_.get(i2);
    }

    public List<? extends nl> getRouteDurationsOrBuilderList() {
        return this.routeDurations_;
    }

    public static mz newBuilder(nm nmVar) {
        return (mz) DEFAULT_INSTANCE.createBuilder(nmVar);
    }

    public static nm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nm parseFrom(com.google.v.z zVar) {
        return (nm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouteDurations(nk nkVar) {
        Objects.requireNonNull(nkVar);
        ensureRouteDurationsIsMutable();
        this.routeDurations_.add(nkVar);
    }

    public static nm parseFrom(InputStream inputStream) {
        return (nm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nm parseFrom(ByteBuffer byteBuffer) {
        return (nm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nm parseFrom(byte[] bArr) {
        return (nm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
