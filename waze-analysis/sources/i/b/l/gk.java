package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class gk extends com.google.v.du<gk, gj> implements com.google.v.fj {
    private static final gk DEFAULT_INSTANCE;
    public static final int MAP_CARS_FIELD_NUMBER = 2;
    public static final int MODIFIED_TIME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<gk> PARSER;
    private int bitField0_;
    private com.google.v.eo<gh> mapCars_ = emptyProtobufList();
    private long modifiedTime_;

    static {
        gk gkVar = new gk();
        DEFAULT_INSTANCE = gkVar;
        com.google.v.du.registerDefaultInstance(gk.class, gkVar);
    }

    private gk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMapCars(Iterable<? extends gh> iterable) {
        ensureMapCarsIsMutable();
        com.google.v.c.addAll(iterable, this.mapCars_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMapCars(int i2, gh ghVar) {
        Objects.requireNonNull(ghVar);
        ensureMapCarsIsMutable();
        this.mapCars_.add(i2, ghVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapCars() {
        this.mapCars_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModifiedTime() {
        this.bitField0_ &= -2;
        this.modifiedTime_ = 0L;
    }

    private void ensureMapCarsIsMutable() {
        com.google.v.eo<gh> eoVar = this.mapCars_;
        if (eoVar.c()) {
            return;
        }
        this.mapCars_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static gk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gj newBuilder() {
        return (gj) DEFAULT_INSTANCE.createBuilder();
    }

    public static gk parseDelimitedFrom(InputStream inputStream) {
        return (gk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gk parseFrom(com.google.v.v vVar) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMapCars(int i2) {
        ensureMapCarsIsMutable();
        this.mapCars_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapCars(int i2, gh ghVar) {
        Objects.requireNonNull(ghVar);
        ensureMapCarsIsMutable();
        this.mapCars_.set(i2, ghVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModifiedTime(long j2) {
        this.bitField0_ |= 1;
        this.modifiedTime_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new Object[]{"bitField0_", "modifiedTime_", "mapCars_", gh.class});
        }
        if (iOrdinal == 3) {
            return new gk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public gh getMapCars(int i2) {
        return this.mapCars_.get(i2);
    }

    public int getMapCarsCount() {
        return this.mapCars_.size();
    }

    public List<gh> getMapCarsList() {
        return this.mapCars_;
    }

    public gi getMapCarsOrBuilder(int i2) {
        return this.mapCars_.get(i2);
    }

    public List<? extends gi> getMapCarsOrBuilderList() {
        return this.mapCars_;
    }

    public long getModifiedTime() {
        return this.modifiedTime_;
    }

    public boolean hasModifiedTime() {
        return (this.bitField0_ & 1) != 0;
    }

    public static gj newBuilder(gk gkVar) {
        return (gj) DEFAULT_INSTANCE.createBuilder(gkVar);
    }

    public static gk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gk parseFrom(com.google.v.z zVar) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMapCars(gh ghVar) {
        Objects.requireNonNull(ghVar);
        ensureMapCarsIsMutable();
        this.mapCars_.add(ghVar);
    }

    public static gk parseFrom(InputStream inputStream) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gk parseFrom(ByteBuffer byteBuffer) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gk parseFrom(byte[] bArr) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
