package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class gr extends com.google.v.du<gr, gq> implements com.google.v.fj {
    private static final gr DEFAULT_INSTANCE;
    public static final int MOODS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<gr> PARSER;
    private com.google.v.eo<go> moods_ = emptyProtobufList();

    static {
        gr grVar = new gr();
        DEFAULT_INSTANCE = grVar;
        com.google.v.du.registerDefaultInstance(gr.class, grVar);
    }

    private gr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMoods(Iterable<? extends go> iterable) {
        ensureMoodsIsMutable();
        com.google.v.c.addAll(iterable, this.moods_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMoods(int i2, go goVar) {
        Objects.requireNonNull(goVar);
        ensureMoodsIsMutable();
        this.moods_.add(i2, goVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoods() {
        this.moods_ = emptyProtobufList();
    }

    private void ensureMoodsIsMutable() {
        com.google.v.eo<go> eoVar = this.moods_;
        if (eoVar.c()) {
            return;
        }
        this.moods_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static gr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gq newBuilder() {
        return (gq) DEFAULT_INSTANCE.createBuilder();
    }

    public static gr parseDelimitedFrom(InputStream inputStream) {
        return (gr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gr parseFrom(com.google.v.v vVar) {
        return (gr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMoods(int i2) {
        ensureMoodsIsMutable();
        this.moods_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoods(int i2, go goVar) {
        Objects.requireNonNull(goVar);
        ensureMoodsIsMutable();
        this.moods_.set(i2, goVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"moods_", go.class});
        }
        if (iOrdinal == 3) {
            return new gr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public go getMoods(int i2) {
        return this.moods_.get(i2);
    }

    public int getMoodsCount() {
        return this.moods_.size();
    }

    public List<go> getMoodsList() {
        return this.moods_;
    }

    public gp getMoodsOrBuilder(int i2) {
        return this.moods_.get(i2);
    }

    public List<? extends gp> getMoodsOrBuilderList() {
        return this.moods_;
    }

    public static gq newBuilder(gr grVar) {
        return (gq) DEFAULT_INSTANCE.createBuilder(grVar);
    }

    public static gr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gr parseFrom(com.google.v.z zVar) {
        return (gr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMoods(go goVar) {
        Objects.requireNonNull(goVar);
        ensureMoodsIsMutable();
        this.moods_.add(goVar);
    }

    public static gr parseFrom(InputStream inputStream) {
        return (gr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gr parseFrom(ByteBuffer byteBuffer) {
        return (gr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gr parseFrom(byte[] bArr) {
        return (gr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
