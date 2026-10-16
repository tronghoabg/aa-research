package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bid extends com.google.v.du<bid, bic> implements com.google.v.fj {
    private static final bid DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bid> PARSER = null;
    public static final int TILE_IDS_FIELD_NUMBER = 1;
    private int tileIdsMemoizedSerializedSize = -1;
    private com.google.v.en tileIds_ = emptyLongList();

    static {
        bid bidVar = new bid();
        DEFAULT_INSTANCE = bidVar;
        com.google.v.du.registerDefaultInstance(bid.class, bidVar);
    }

    private bid() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTileIds(Iterable<? extends Long> iterable) {
        ensureTileIdsIsMutable();
        com.google.v.c.addAll(iterable, this.tileIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTileIds(long j2) {
        ensureTileIdsIsMutable();
        this.tileIds_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTileIds() {
        this.tileIds_ = emptyLongList();
    }

    private void ensureTileIdsIsMutable() {
        com.google.v.en enVar = this.tileIds_;
        if (enVar.c()) {
            return;
        }
        this.tileIds_ = com.google.v.du.mutableCopy(enVar);
    }

    public static bid getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bic newBuilder() {
        return (bic) DEFAULT_INSTANCE.createBuilder();
    }

    public static bid parseDelimitedFrom(InputStream inputStream) {
        return (bid) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bid parseFrom(com.google.v.v vVar) {
        return (bid) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bid> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTileIds(int i2, long j2) {
        ensureTileIdsIsMutable();
        this.tileIds_.d(i2, j2);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"tileIds_"});
        }
        if (iOrdinal == 3) {
            return new bid();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bic(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bid> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bid.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getTileIds(int i2) {
        return this.tileIds_.a(i2);
    }

    public int getTileIdsCount() {
        return this.tileIds_.size();
    }

    public List<Long> getTileIdsList() {
        return this.tileIds_;
    }

    public static bic newBuilder(bid bidVar) {
        return (bic) DEFAULT_INSTANCE.createBuilder(bidVar);
    }

    public static bid parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bid) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bid parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bid) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bid parseFrom(com.google.v.z zVar) {
        return (bid) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bid parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bid) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bid parseFrom(InputStream inputStream) {
        return (bid) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bid parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bid) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bid parseFrom(ByteBuffer byteBuffer) {
        return (bid) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bid parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bid) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bid parseFrom(byte[] bArr) {
        return (bid) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bid parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bid) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
