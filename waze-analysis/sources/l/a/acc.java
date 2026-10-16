package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class acc extends com.google.v.du<acc, acb> implements com.google.v.fj {
    private static final acc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<acc> PARSER = null;
    public static final int ROUTE_IDS_FIELD_NUMBER = 1;
    private int routeIdsMemoizedSerializedSize = -1;
    private com.google.v.en routeIds_ = emptyLongList();

    static {
        acc accVar = new acc();
        DEFAULT_INSTANCE = accVar;
        com.google.v.du.registerDefaultInstance(acc.class, accVar);
    }

    private acc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRouteIds(Iterable<? extends Long> iterable) {
        ensureRouteIdsIsMutable();
        com.google.v.c.addAll(iterable, this.routeIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouteIds(long j2) {
        ensureRouteIdsIsMutable();
        this.routeIds_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteIds() {
        this.routeIds_ = emptyLongList();
    }

    private void ensureRouteIdsIsMutable() {
        com.google.v.en enVar = this.routeIds_;
        if (enVar.c()) {
            return;
        }
        this.routeIds_ = com.google.v.du.mutableCopy(enVar);
    }

    public static acc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static acb newBuilder() {
        return (acb) DEFAULT_INSTANCE.createBuilder();
    }

    public static acc parseDelimitedFrom(InputStream inputStream) {
        return (acc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static acc parseFrom(com.google.v.v vVar) {
        return (acc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<acc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteIds(int i2, long j2) {
        ensureRouteIdsIsMutable();
        this.routeIds_.d(i2, j2);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"routeIds_"});
        }
        if (iOrdinal == 3) {
            return new acc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new acb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<acc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (acc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getRouteIds(int i2) {
        return this.routeIds_.a(i2);
    }

    public int getRouteIdsCount() {
        return this.routeIds_.size();
    }

    public List<Long> getRouteIdsList() {
        return this.routeIds_;
    }

    public static acb newBuilder(acc accVar) {
        return (acb) DEFAULT_INSTANCE.createBuilder(accVar);
    }

    public static acc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (acc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static acc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (acc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static acc parseFrom(com.google.v.z zVar) {
        return (acc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static acc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (acc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static acc parseFrom(InputStream inputStream) {
        return (acc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static acc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (acc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static acc parseFrom(ByteBuffer byteBuffer) {
        return (acc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static acc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (acc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static acc parseFrom(byte[] bArr) {
        return (acc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static acc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (acc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
