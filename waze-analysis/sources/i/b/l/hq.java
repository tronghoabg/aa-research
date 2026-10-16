package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class hq extends com.google.v.du<hq, hp> implements com.google.v.fj {
    private static final hq DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<hq> PARSER;
    private com.google.v.eo<hn> limit_ = emptyProtobufList();

    static {
        hq hqVar = new hq();
        DEFAULT_INSTANCE = hqVar;
        com.google.v.du.registerDefaultInstance(hq.class, hqVar);
    }

    private hq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLimit(Iterable<? extends hn> iterable) {
        ensureLimitIsMutable();
        com.google.v.c.addAll(iterable, this.limit_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLimit(int i2, hn hnVar) {
        Objects.requireNonNull(hnVar);
        ensureLimitIsMutable();
        this.limit_.add(i2, hnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimit() {
        this.limit_ = emptyProtobufList();
    }

    private void ensureLimitIsMutable() {
        com.google.v.eo<hn> eoVar = this.limit_;
        if (eoVar.c()) {
            return;
        }
        this.limit_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static hq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hp newBuilder() {
        return (hp) DEFAULT_INSTANCE.createBuilder();
    }

    public static hq parseDelimitedFrom(InputStream inputStream) {
        return (hq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hq parseFrom(com.google.v.v vVar) {
        return (hq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLimit(int i2) {
        ensureLimitIsMutable();
        this.limit_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimit(int i2, hn hnVar) {
        Objects.requireNonNull(hnVar);
        ensureLimitIsMutable();
        this.limit_.set(i2, hnVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"limit_", hn.class});
        }
        if (iOrdinal == 3) {
            return new hq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public hn getLimit(int i2) {
        return this.limit_.get(i2);
    }

    public int getLimitCount() {
        return this.limit_.size();
    }

    public List<hn> getLimitList() {
        return this.limit_;
    }

    public ho getLimitOrBuilder(int i2) {
        return this.limit_.get(i2);
    }

    public List<? extends ho> getLimitOrBuilderList() {
        return this.limit_;
    }

    public static hp newBuilder(hq hqVar) {
        return (hp) DEFAULT_INSTANCE.createBuilder(hqVar);
    }

    public static hq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hq parseFrom(com.google.v.z zVar) {
        return (hq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLimit(hn hnVar) {
        Objects.requireNonNull(hnVar);
        ensureLimitIsMutable();
        this.limit_.add(hnVar);
    }

    public static hq parseFrom(InputStream inputStream) {
        return (hq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hq parseFrom(ByteBuffer byteBuffer) {
        return (hq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hq parseFrom(byte[] bArr) {
        return (hq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
