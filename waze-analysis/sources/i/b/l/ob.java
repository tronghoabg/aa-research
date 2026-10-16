package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ob extends com.google.v.du<ob, nv> implements oc {
    public static final int CLOSED_SEGMENT_FIELD_NUMBER = 1;
    public static final int CLOSED_TURN_FIELD_NUMBER = 2;
    private static final ob DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ob> PARSER;
    private int closureCase_ = 0;
    private Object closure_;

    static {
        ob obVar = new ob();
        DEFAULT_INSTANCE = obVar;
        com.google.v.du.registerDefaultInstance(ob.class, obVar);
    }

    private ob() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosedSegment() {
        if (this.closureCase_ == 1) {
            this.closureCase_ = 0;
            this.closure_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosedTurn() {
        if (this.closureCase_ == 2) {
            this.closureCase_ = 0;
            this.closure_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosure() {
        this.closureCase_ = 0;
        this.closure_ = null;
    }

    public static ob getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClosedSegment(nx nxVar) {
        Objects.requireNonNull(nxVar);
        if (this.closureCase_ == 1 && this.closure_ != nx.getDefaultInstance()) {
            nw nwVarNewBuilder = nx.newBuilder((nx) this.closure_);
            nwVarNewBuilder.mergeFrom((nw) nxVar);
            nxVar = nwVarNewBuilder.buildPartial();
        }
        this.closure_ = nxVar;
        this.closureCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClosedTurn(nz nzVar) {
        Objects.requireNonNull(nzVar);
        if (this.closureCase_ == 2 && this.closure_ != nz.getDefaultInstance()) {
            ny nyVarNewBuilder = nz.newBuilder((nz) this.closure_);
            nyVarNewBuilder.mergeFrom((ny) nzVar);
            nzVar = nyVarNewBuilder.buildPartial();
        }
        this.closure_ = nzVar;
        this.closureCase_ = 2;
    }

    public static nv newBuilder() {
        return (nv) DEFAULT_INSTANCE.createBuilder();
    }

    public static ob parseDelimitedFrom(InputStream inputStream) {
        return (ob) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ob parseFrom(com.google.v.v vVar) {
        return (ob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ob> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosedSegment(nx nxVar) {
        Objects.requireNonNull(nxVar);
        this.closure_ = nxVar;
        this.closureCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosedTurn(nz nzVar) {
        Objects.requireNonNull(nzVar);
        this.closure_ = nzVar;
        this.closureCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"closure_", "closureCase_", nx.class, nz.class});
        }
        if (iOrdinal == 3) {
            return new ob();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new nv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ob> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ob.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public nx getClosedSegment() {
        return this.closureCase_ == 1 ? (nx) this.closure_ : nx.getDefaultInstance();
    }

    public nz getClosedTurn() {
        return this.closureCase_ == 2 ? (nz) this.closure_ : nz.getDefaultInstance();
    }

    public oa getClosureCase() {
        int i2 = this.closureCase_;
        if (i2 == 0) {
            return oa.f48923c;
        }
        if (i2 == 1) {
            return oa.f48921a;
        }
        if (i2 != 2) {
            return null;
        }
        return oa.f48922b;
    }

    public boolean hasClosedSegment() {
        return this.closureCase_ == 1;
    }

    public boolean hasClosedTurn() {
        return this.closureCase_ == 2;
    }

    public static nv newBuilder(ob obVar) {
        return (nv) DEFAULT_INSTANCE.createBuilder(obVar);
    }

    public static ob parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ob) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ob parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ob parseFrom(com.google.v.z zVar) {
        return (ob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ob parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ob parseFrom(InputStream inputStream) {
        return (ob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ob parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ob parseFrom(ByteBuffer byteBuffer) {
        return (ob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ob parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ob parseFrom(byte[] bArr) {
        return (ob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ob parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ob) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
