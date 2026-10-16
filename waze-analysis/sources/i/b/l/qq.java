package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class qq extends com.google.v.du<qq, qj> implements com.google.v.fj {
    private static final qq DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<qq> PARSER = null;
    public static final int POLYLINES_FIELD_NUMBER = 1;
    public static final int SEGMENT_CLOSURE_PINS_FIELD_NUMBER = 2;
    public static final int TURN_CLOSURE_PINS_FIELD_NUMBER = 3;
    public static final int VISUAL_MTE_FIELD_NUMBER = 4;
    private com.google.v.eo<qo> polylines_ = emptyProtobufList();
    private com.google.v.eo<ql> segmentClosurePins_ = emptyProtobufList();
    private com.google.v.eo<ql> turnClosurePins_ = emptyProtobufList();
    private com.google.v.eo<qu> visualMte_ = emptyProtobufList();

    static {
        qq qqVar = new qq();
        DEFAULT_INSTANCE = qqVar;
        com.google.v.du.registerDefaultInstance(qq.class, qqVar);
    }

    private qq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPolylines(Iterable<? extends qo> iterable) {
        ensurePolylinesIsMutable();
        com.google.v.c.addAll(iterable, this.polylines_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSegmentClosurePins(Iterable<? extends ql> iterable) {
        ensureSegmentClosurePinsIsMutable();
        com.google.v.c.addAll(iterable, this.segmentClosurePins_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTurnClosurePins(Iterable<? extends ql> iterable) {
        ensureTurnClosurePinsIsMutable();
        com.google.v.c.addAll(iterable, this.turnClosurePins_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVisualMte(Iterable<? extends qu> iterable) {
        ensureVisualMteIsMutable();
        com.google.v.c.addAll(iterable, this.visualMte_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPolylines(int i2, qo qoVar) {
        Objects.requireNonNull(qoVar);
        ensurePolylinesIsMutable();
        this.polylines_.add(i2, qoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegmentClosurePins(int i2, ql qlVar) {
        Objects.requireNonNull(qlVar);
        ensureSegmentClosurePinsIsMutable();
        this.segmentClosurePins_.add(i2, qlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTurnClosurePins(int i2, ql qlVar) {
        Objects.requireNonNull(qlVar);
        ensureTurnClosurePinsIsMutable();
        this.turnClosurePins_.add(i2, qlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVisualMte(int i2, qu quVar) {
        Objects.requireNonNull(quVar);
        ensureVisualMteIsMutable();
        this.visualMte_.add(i2, quVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolylines() {
        this.polylines_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentClosurePins() {
        this.segmentClosurePins_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTurnClosurePins() {
        this.turnClosurePins_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisualMte() {
        this.visualMte_ = emptyProtobufList();
    }

    private void ensurePolylinesIsMutable() {
        com.google.v.eo<qo> eoVar = this.polylines_;
        if (eoVar.c()) {
            return;
        }
        this.polylines_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureSegmentClosurePinsIsMutable() {
        com.google.v.eo<ql> eoVar = this.segmentClosurePins_;
        if (eoVar.c()) {
            return;
        }
        this.segmentClosurePins_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureTurnClosurePinsIsMutable() {
        com.google.v.eo<ql> eoVar = this.turnClosurePins_;
        if (eoVar.c()) {
            return;
        }
        this.turnClosurePins_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureVisualMteIsMutable() {
        com.google.v.eo<qu> eoVar = this.visualMte_;
        if (eoVar.c()) {
            return;
        }
        this.visualMte_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static qq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static qj newBuilder() {
        return (qj) DEFAULT_INSTANCE.createBuilder();
    }

    public static qq parseDelimitedFrom(InputStream inputStream) {
        return (qq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qq parseFrom(com.google.v.v vVar) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePolylines(int i2) {
        ensurePolylinesIsMutable();
        this.polylines_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSegmentClosurePins(int i2) {
        ensureSegmentClosurePinsIsMutable();
        this.segmentClosurePins_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTurnClosurePins(int i2) {
        ensureTurnClosurePinsIsMutable();
        this.turnClosurePins_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVisualMte(int i2) {
        ensureVisualMteIsMutable();
        this.visualMte_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolylines(int i2, qo qoVar) {
        Objects.requireNonNull(qoVar);
        ensurePolylinesIsMutable();
        this.polylines_.set(i2, qoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentClosurePins(int i2, ql qlVar) {
        Objects.requireNonNull(qlVar);
        ensureSegmentClosurePinsIsMutable();
        this.segmentClosurePins_.set(i2, qlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTurnClosurePins(int i2, ql qlVar) {
        Objects.requireNonNull(qlVar);
        ensureTurnClosurePinsIsMutable();
        this.turnClosurePins_.set(i2, qlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisualMte(int i2, qu quVar) {
        Objects.requireNonNull(quVar);
        ensureVisualMteIsMutable();
        this.visualMte_.set(i2, quVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"polylines_", qo.class, "segmentClosurePins_", ql.class, "turnClosurePins_", ql.class, "visualMte_", qu.class});
        }
        if (iOrdinal == 3) {
            return new qq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new qj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<qq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (qq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public qo getPolylines(int i2) {
        return this.polylines_.get(i2);
    }

    public int getPolylinesCount() {
        return this.polylines_.size();
    }

    public List<qo> getPolylinesList() {
        return this.polylines_;
    }

    public qp getPolylinesOrBuilder(int i2) {
        return this.polylines_.get(i2);
    }

    public List<? extends qp> getPolylinesOrBuilderList() {
        return this.polylines_;
    }

    public ql getSegmentClosurePins(int i2) {
        return this.segmentClosurePins_.get(i2);
    }

    public int getSegmentClosurePinsCount() {
        return this.segmentClosurePins_.size();
    }

    public List<ql> getSegmentClosurePinsList() {
        return this.segmentClosurePins_;
    }

    public qm getSegmentClosurePinsOrBuilder(int i2) {
        return this.segmentClosurePins_.get(i2);
    }

    public List<? extends qm> getSegmentClosurePinsOrBuilderList() {
        return this.segmentClosurePins_;
    }

    public ql getTurnClosurePins(int i2) {
        return this.turnClosurePins_.get(i2);
    }

    public int getTurnClosurePinsCount() {
        return this.turnClosurePins_.size();
    }

    public List<ql> getTurnClosurePinsList() {
        return this.turnClosurePins_;
    }

    public qm getTurnClosurePinsOrBuilder(int i2) {
        return this.turnClosurePins_.get(i2);
    }

    public List<? extends qm> getTurnClosurePinsOrBuilderList() {
        return this.turnClosurePins_;
    }

    public qu getVisualMte(int i2) {
        return this.visualMte_.get(i2);
    }

    public int getVisualMteCount() {
        return this.visualMte_.size();
    }

    public List<qu> getVisualMteList() {
        return this.visualMte_;
    }

    public qv getVisualMteOrBuilder(int i2) {
        return this.visualMte_.get(i2);
    }

    public List<? extends qv> getVisualMteOrBuilderList() {
        return this.visualMte_;
    }

    public static qj newBuilder(qq qqVar) {
        return (qj) DEFAULT_INSTANCE.createBuilder(qqVar);
    }

    public static qq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qq parseFrom(com.google.v.z zVar) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPolylines(qo qoVar) {
        Objects.requireNonNull(qoVar);
        ensurePolylinesIsMutable();
        this.polylines_.add(qoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegmentClosurePins(ql qlVar) {
        Objects.requireNonNull(qlVar);
        ensureSegmentClosurePinsIsMutable();
        this.segmentClosurePins_.add(qlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTurnClosurePins(ql qlVar) {
        Objects.requireNonNull(qlVar);
        ensureTurnClosurePinsIsMutable();
        this.turnClosurePins_.add(qlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVisualMte(qu quVar) {
        Objects.requireNonNull(quVar);
        ensureVisualMteIsMutable();
        this.visualMte_.add(quVar);
    }

    public static qq parseFrom(InputStream inputStream) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qq parseFrom(ByteBuffer byteBuffer) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qq parseFrom(byte[] bArr) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
