package i.b.v;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class dc extends com.google.v.du<dc, db> implements com.google.v.fj {
    private static final dc DEFAULT_INSTANCE;
    public static final int MAP_FIELD_NUMBER = 612;
    private static volatile com.google.v.fo<dc> PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 610;
    public static final int UPDATETIME_FIELD_NUMBER = 611;
    private int bitField0_;
    private double price_;
    private long updateTime_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<dr> map_ = emptyProtobufList();

    static {
        dc dcVar = new dc();
        DEFAULT_INSTANCE = dcVar;
        com.google.v.du.registerDefaultInstance(dc.class, dcVar);
    }

    private dc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMap(Iterable<? extends dr> iterable) {
        ensureMapIsMutable();
        com.google.v.c.addAll(iterable, this.map_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMap(int i2, dr drVar) {
        Objects.requireNonNull(drVar);
        ensureMapIsMutable();
        this.map_.add(i2, drVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMap() {
        this.map_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrice() {
        this.bitField0_ &= -2;
        this.price_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateTime() {
        this.bitField0_ &= -3;
        this.updateTime_ = 0L;
    }

    private void ensureMapIsMutable() {
        com.google.v.eo<dr> eoVar = this.map_;
        if (eoVar.c()) {
            return;
        }
        this.map_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static dc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static db newBuilder() {
        return (db) DEFAULT_INSTANCE.createBuilder();
    }

    public static dc parseDelimitedFrom(InputStream inputStream) {
        return (dc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dc parseFrom(com.google.v.v vVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMap(int i2) {
        ensureMapIsMutable();
        this.map_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMap(int i2, dr drVar) {
        Objects.requireNonNull(drVar);
        ensureMapIsMutable();
        this.map_.set(i2, drVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrice(double d2) {
        this.bitField0_ |= 1;
        this.price_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateTime(long j2) {
        this.bitField0_ |= 2;
        this.updateTime_ = j2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001ɢɤ\u0003\u0000\u0001\u0001ɢက\u0000ɣဂ\u0001ɤЛ", new Object[]{"bitField0_", "price_", "updateTime_", "map_", dr.class});
            case 3:
                return new dc();
            case 4:
                return new db(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<dc> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (dc.class) {
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

    public dr getMap(int i2) {
        return this.map_.get(i2);
    }

    public int getMapCount() {
        return this.map_.size();
    }

    public List<dr> getMapList() {
        return this.map_;
    }

    public ds getMapOrBuilder(int i2) {
        return this.map_.get(i2);
    }

    public List<? extends ds> getMapOrBuilderList() {
        return this.map_;
    }

    public double getPrice() {
        return this.price_;
    }

    public long getUpdateTime() {
        return this.updateTime_;
    }

    public boolean hasPrice() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUpdateTime() {
        return (this.bitField0_ & 2) != 0;
    }

    public static db newBuilder(dc dcVar) {
        return (db) DEFAULT_INSTANCE.createBuilder(dcVar);
    }

    public static dc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dc parseFrom(com.google.v.z zVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMap(dr drVar) {
        Objects.requireNonNull(drVar);
        ensureMapIsMutable();
        this.map_.add(drVar);
    }

    public static dc parseFrom(InputStream inputStream) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dc parseFrom(ByteBuffer byteBuffer) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dc parseFrom(byte[] bArr) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
