package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ge extends com.google.v.du<ge, gd> implements com.google.v.fj {
    private static final ge DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ge> PARSER = null;
    public static final int VENUE3_FIELD_NUMBER = 2;
    public static final int VENUE_FIELD_NUMBER = 1;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<ef> venue_ = emptyProtobufList();
    private com.google.v.eo<ed> venue3_ = emptyProtobufList();

    static {
        ge geVar = new ge();
        DEFAULT_INSTANCE = geVar;
        com.google.v.du.registerDefaultInstance(ge.class, geVar);
    }

    private ge() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVenue(Iterable<? extends ef> iterable) {
        ensureVenueIsMutable();
        com.google.v.c.addAll(iterable, this.venue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVenue3(Iterable<? extends ed> iterable) {
        ensureVenue3IsMutable();
        com.google.v.c.addAll(iterable, this.venue3_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVenue(int i2, ef efVar) {
        Objects.requireNonNull(efVar);
        ensureVenueIsMutable();
        this.venue_.add(i2, efVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVenue3(int i2, ed edVar) {
        Objects.requireNonNull(edVar);
        ensureVenue3IsMutable();
        this.venue3_.add(i2, edVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenue() {
        this.venue_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenue3() {
        this.venue3_ = emptyProtobufList();
    }

    private void ensureVenue3IsMutable() {
        com.google.v.eo<ed> eoVar = this.venue3_;
        if (eoVar.c()) {
            return;
        }
        this.venue3_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureVenueIsMutable() {
        com.google.v.eo<ef> eoVar = this.venue_;
        if (eoVar.c()) {
            return;
        }
        this.venue_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ge getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gd newBuilder() {
        return (gd) DEFAULT_INSTANCE.createBuilder();
    }

    public static ge parseDelimitedFrom(InputStream inputStream) {
        return (ge) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ge parseFrom(com.google.v.v vVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ge> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVenue(int i2) {
        ensureVenueIsMutable();
        this.venue_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVenue3(int i2) {
        ensureVenue3IsMutable();
        this.venue3_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenue(int i2, ef efVar) {
        Objects.requireNonNull(efVar);
        ensureVenueIsMutable();
        this.venue_.set(i2, efVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenue3(int i2, ed edVar) {
        Objects.requireNonNull(edVar);
        ensureVenue3IsMutable();
        this.venue3_.set(i2, edVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"venue_", ef.class, "venue3_", ed.class});
            case 3:
                return new ge();
            case 4:
                return new gd(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ge> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ge.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public ef getVenue(int i2) {
        return this.venue_.get(i2);
    }

    public ed getVenue3(int i2) {
        return this.venue3_.get(i2);
    }

    public int getVenue3Count() {
        return this.venue3_.size();
    }

    public List<ed> getVenue3List() {
        return this.venue3_;
    }

    public ee getVenue3OrBuilder(int i2) {
        return this.venue3_.get(i2);
    }

    public List<? extends ee> getVenue3OrBuilderList() {
        return this.venue3_;
    }

    public int getVenueCount() {
        return this.venue_.size();
    }

    public List<ef> getVenueList() {
        return this.venue_;
    }

    public gh getVenueOrBuilder(int i2) {
        return this.venue_.get(i2);
    }

    public List<? extends gh> getVenueOrBuilderList() {
        return this.venue_;
    }

    public static gd newBuilder(ge geVar) {
        return (gd) DEFAULT_INSTANCE.createBuilder(geVar);
    }

    public static ge parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ge) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ge parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ge parseFrom(com.google.v.z zVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ge parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVenue(ef efVar) {
        Objects.requireNonNull(efVar);
        ensureVenueIsMutable();
        this.venue_.add(efVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVenue3(ed edVar) {
        Objects.requireNonNull(edVar);
        ensureVenue3IsMutable();
        this.venue3_.add(edVar);
    }

    public static ge parseFrom(InputStream inputStream) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ge parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ge parseFrom(ByteBuffer byteBuffer) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ge parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ge parseFrom(byte[] bArr) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ge parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
