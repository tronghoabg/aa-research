package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class id extends com.google.v.du<id, ic> implements com.google.v.fj {
    private static final id DEFAULT_INSTANCE;
    public static final int LANGUAGE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<id> PARSER;
    private com.google.v.eo<ia> language_ = emptyProtobufList();

    static {
        id idVar = new id();
        DEFAULT_INSTANCE = idVar;
        com.google.v.du.registerDefaultInstance(id.class, idVar);
    }

    private id() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLanguage(Iterable<? extends ia> iterable) {
        ensureLanguageIsMutable();
        com.google.v.c.addAll(iterable, this.language_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLanguage(int i2, ia iaVar) {
        Objects.requireNonNull(iaVar);
        ensureLanguageIsMutable();
        this.language_.add(i2, iaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.language_ = emptyProtobufList();
    }

    private void ensureLanguageIsMutable() {
        com.google.v.eo<ia> eoVar = this.language_;
        if (eoVar.c()) {
            return;
        }
        this.language_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static id getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ic newBuilder() {
        return (ic) DEFAULT_INSTANCE.createBuilder();
    }

    public static id parseDelimitedFrom(InputStream inputStream) {
        return (id) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static id parseFrom(com.google.v.v vVar) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<id> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLanguage(int i2) {
        ensureLanguageIsMutable();
        this.language_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(int i2, ia iaVar) {
        Objects.requireNonNull(iaVar);
        ensureLanguageIsMutable();
        this.language_.set(i2, iaVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"language_", ia.class});
        }
        if (iOrdinal == 3) {
            return new id();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ic(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<id> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (id.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ia getLanguage(int i2) {
        return this.language_.get(i2);
    }

    public int getLanguageCount() {
        return this.language_.size();
    }

    public List<ia> getLanguageList() {
        return this.language_;
    }

    public ib getLanguageOrBuilder(int i2) {
        return this.language_.get(i2);
    }

    public List<? extends ib> getLanguageOrBuilderList() {
        return this.language_;
    }

    public static ic newBuilder(id idVar) {
        return (ic) DEFAULT_INSTANCE.createBuilder(idVar);
    }

    public static id parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (id) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static id parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static id parseFrom(com.google.v.z zVar) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static id parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLanguage(ia iaVar) {
        Objects.requireNonNull(iaVar);
        ensureLanguageIsMutable();
        this.language_.add(iaVar);
    }

    public static id parseFrom(InputStream inputStream) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static id parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static id parseFrom(ByteBuffer byteBuffer) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static id parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static id parseFrom(byte[] bArr) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static id parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (id) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
