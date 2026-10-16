package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class tx extends com.google.v.du<tx, tw> implements com.google.v.fj {
    private static final tx DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<tx> PARSER = null;
    public static final int TAKEOVERS_FIELD_NUMBER = 1;
    private com.google.v.eo<uf> takeovers_ = emptyProtobufList();

    static {
        tx txVar = new tx();
        DEFAULT_INSTANCE = txVar;
        com.google.v.du.registerDefaultInstance(tx.class, txVar);
    }

    private tx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTakeovers(Iterable<? extends uf> iterable) {
        ensureTakeoversIsMutable();
        com.google.v.c.addAll(iterable, this.takeovers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTakeovers(int i2, uf ufVar) {
        Objects.requireNonNull(ufVar);
        ensureTakeoversIsMutable();
        this.takeovers_.add(i2, ufVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTakeovers() {
        this.takeovers_ = emptyProtobufList();
    }

    private void ensureTakeoversIsMutable() {
        com.google.v.eo<uf> eoVar = this.takeovers_;
        if (eoVar.c()) {
            return;
        }
        this.takeovers_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static tx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static tw newBuilder() {
        return (tw) DEFAULT_INSTANCE.createBuilder();
    }

    public static tx parseDelimitedFrom(InputStream inputStream) {
        return (tx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tx parseFrom(com.google.v.v vVar) {
        return (tx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<tx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTakeovers(int i2) {
        ensureTakeoversIsMutable();
        this.takeovers_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTakeovers(int i2, uf ufVar) {
        Objects.requireNonNull(ufVar);
        ensureTakeoversIsMutable();
        this.takeovers_.set(i2, ufVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"takeovers_", uf.class});
        }
        if (iOrdinal == 3) {
            return new tx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new tw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<tx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (tx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public uf getTakeovers(int i2) {
        return this.takeovers_.get(i2);
    }

    public int getTakeoversCount() {
        return this.takeovers_.size();
    }

    public List<uf> getTakeoversList() {
        return this.takeovers_;
    }

    public ug getTakeoversOrBuilder(int i2) {
        return this.takeovers_.get(i2);
    }

    public List<? extends ug> getTakeoversOrBuilderList() {
        return this.takeovers_;
    }

    public static tw newBuilder(tx txVar) {
        return (tw) DEFAULT_INSTANCE.createBuilder(txVar);
    }

    public static tx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (tx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static tx parseFrom(com.google.v.z zVar) {
        return (tx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static tx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (tx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTakeovers(uf ufVar) {
        Objects.requireNonNull(ufVar);
        ensureTakeoversIsMutable();
        this.takeovers_.add(ufVar);
    }

    public static tx parseFrom(InputStream inputStream) {
        return (tx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tx parseFrom(ByteBuffer byteBuffer) {
        return (tx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static tx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (tx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static tx parseFrom(byte[] bArr) {
        return (tx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static tx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (tx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
