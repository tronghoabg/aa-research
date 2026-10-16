package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ads extends com.google.v.du<ads, adr> implements com.google.v.fj {
    private static final ads DEFAULT_INSTANCE;
    public static final int FROM_INSIGHT_STATE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ads> PARSER = null;
    public static final int TO_INSIGHT_STATE_FIELD_NUMBER = 2;
    private com.google.v.eo<adp> fromInsightState_ = emptyProtobufList();
    private com.google.v.eo<adp> toInsightState_ = emptyProtobufList();

    static {
        ads adsVar = new ads();
        DEFAULT_INSTANCE = adsVar;
        com.google.v.du.registerDefaultInstance(ads.class, adsVar);
    }

    private ads() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFromInsightState(Iterable<? extends adp> iterable) {
        ensureFromInsightStateIsMutable();
        com.google.v.c.addAll(iterable, this.fromInsightState_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllToInsightState(Iterable<? extends adp> iterable) {
        ensureToInsightStateIsMutable();
        com.google.v.c.addAll(iterable, this.toInsightState_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFromInsightState(int i2, adp adpVar) {
        Objects.requireNonNull(adpVar);
        ensureFromInsightStateIsMutable();
        this.fromInsightState_.add(i2, adpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addToInsightState(int i2, adp adpVar) {
        Objects.requireNonNull(adpVar);
        ensureToInsightStateIsMutable();
        this.toInsightState_.add(i2, adpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromInsightState() {
        this.fromInsightState_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToInsightState() {
        this.toInsightState_ = emptyProtobufList();
    }

    private void ensureFromInsightStateIsMutable() {
        com.google.v.eo<adp> eoVar = this.fromInsightState_;
        if (eoVar.c()) {
            return;
        }
        this.fromInsightState_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureToInsightStateIsMutable() {
        com.google.v.eo<adp> eoVar = this.toInsightState_;
        if (eoVar.c()) {
            return;
        }
        this.toInsightState_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ads getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static adr newBuilder() {
        return (adr) DEFAULT_INSTANCE.createBuilder();
    }

    public static ads parseDelimitedFrom(InputStream inputStream) {
        return (ads) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ads parseFrom(com.google.v.v vVar) {
        return (ads) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ads> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFromInsightState(int i2) {
        ensureFromInsightStateIsMutable();
        this.fromInsightState_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeToInsightState(int i2) {
        ensureToInsightStateIsMutable();
        this.toInsightState_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromInsightState(int i2, adp adpVar) {
        Objects.requireNonNull(adpVar);
        ensureFromInsightStateIsMutable();
        this.fromInsightState_.set(i2, adpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToInsightState(int i2, adp adpVar) {
        Objects.requireNonNull(adpVar);
        ensureToInsightStateIsMutable();
        this.toInsightState_.set(i2, adpVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"fromInsightState_", adp.class, "toInsightState_", adp.class});
        }
        if (iOrdinal == 3) {
            return new ads();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new adr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ads> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ads.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public adp getFromInsightState(int i2) {
        return this.fromInsightState_.get(i2);
    }

    public int getFromInsightStateCount() {
        return this.fromInsightState_.size();
    }

    public List<adp> getFromInsightStateList() {
        return this.fromInsightState_;
    }

    public adq getFromInsightStateOrBuilder(int i2) {
        return this.fromInsightState_.get(i2);
    }

    public List<? extends adq> getFromInsightStateOrBuilderList() {
        return this.fromInsightState_;
    }

    public adp getToInsightState(int i2) {
        return this.toInsightState_.get(i2);
    }

    public int getToInsightStateCount() {
        return this.toInsightState_.size();
    }

    public List<adp> getToInsightStateList() {
        return this.toInsightState_;
    }

    public adq getToInsightStateOrBuilder(int i2) {
        return this.toInsightState_.get(i2);
    }

    public List<? extends adq> getToInsightStateOrBuilderList() {
        return this.toInsightState_;
    }

    public static adr newBuilder(ads adsVar) {
        return (adr) DEFAULT_INSTANCE.createBuilder(adsVar);
    }

    public static ads parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ads) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ads parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ads) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ads parseFrom(com.google.v.z zVar) {
        return (ads) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ads parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ads) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFromInsightState(adp adpVar) {
        Objects.requireNonNull(adpVar);
        ensureFromInsightStateIsMutable();
        this.fromInsightState_.add(adpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addToInsightState(adp adpVar) {
        Objects.requireNonNull(adpVar);
        ensureToInsightStateIsMutable();
        this.toInsightState_.add(adpVar);
    }

    public static ads parseFrom(InputStream inputStream) {
        return (ads) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ads parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ads) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ads parseFrom(ByteBuffer byteBuffer) {
        return (ads) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ads parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ads) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ads parseFrom(byte[] bArr) {
        return (ads) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ads parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ads) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
