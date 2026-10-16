package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class il extends com.google.v.du<il, ik> implements com.google.v.fj {
    private static final il DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<il> PARSER = null;
    public static final int WEB_URLS_FIELD_NUMBER = 1;
    private com.google.v.eo<ii> webUrls_ = emptyProtobufList();

    static {
        il ilVar = new il();
        DEFAULT_INSTANCE = ilVar;
        com.google.v.du.registerDefaultInstance(il.class, ilVar);
    }

    private il() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWebUrls(Iterable<? extends ii> iterable) {
        ensureWebUrlsIsMutable();
        com.google.v.c.addAll(iterable, this.webUrls_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWebUrls(int i2, ii iiVar) {
        Objects.requireNonNull(iiVar);
        ensureWebUrlsIsMutable();
        this.webUrls_.add(i2, iiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebUrls() {
        this.webUrls_ = emptyProtobufList();
    }

    private void ensureWebUrlsIsMutable() {
        com.google.v.eo<ii> eoVar = this.webUrls_;
        if (eoVar.c()) {
            return;
        }
        this.webUrls_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static il getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ik newBuilder() {
        return (ik) DEFAULT_INSTANCE.createBuilder();
    }

    public static il parseDelimitedFrom(InputStream inputStream) {
        return (il) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static il parseFrom(com.google.v.v vVar) {
        return (il) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<il> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWebUrls(int i2) {
        ensureWebUrlsIsMutable();
        this.webUrls_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebUrls(int i2, ii iiVar) {
        Objects.requireNonNull(iiVar);
        ensureWebUrlsIsMutable();
        this.webUrls_.set(i2, iiVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"webUrls_", ii.class});
        }
        if (iOrdinal == 3) {
            return new il();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ik(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<il> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (il.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ii getWebUrls(int i2) {
        return this.webUrls_.get(i2);
    }

    public int getWebUrlsCount() {
        return this.webUrls_.size();
    }

    public List<ii> getWebUrlsList() {
        return this.webUrls_;
    }

    public ij getWebUrlsOrBuilder(int i2) {
        return this.webUrls_.get(i2);
    }

    public List<? extends ij> getWebUrlsOrBuilderList() {
        return this.webUrls_;
    }

    public static ik newBuilder(il ilVar) {
        return (ik) DEFAULT_INSTANCE.createBuilder(ilVar);
    }

    public static il parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (il) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static il parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (il) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static il parseFrom(com.google.v.z zVar) {
        return (il) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static il parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (il) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWebUrls(ii iiVar) {
        Objects.requireNonNull(iiVar);
        ensureWebUrlsIsMutable();
        this.webUrls_.add(iiVar);
    }

    public static il parseFrom(InputStream inputStream) {
        return (il) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static il parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (il) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static il parseFrom(ByteBuffer byteBuffer) {
        return (il) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static il parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (il) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static il parseFrom(byte[] bArr) {
        return (il) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static il parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (il) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
