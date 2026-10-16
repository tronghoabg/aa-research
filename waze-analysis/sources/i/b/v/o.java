package i.b.v;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class o extends com.google.v.du<o, n> implements p {
    private static final o DEFAULT_INSTANCE;
    public static final int MAP_FIELD_NUMBER = 632;
    private static volatile com.google.v.fo<o> PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 630;
    public static final int UPDATETIME_FIELD_NUMBER = 631;
    public static final int USERID_FIELD_NUMBER = 635;
    public static final int USERNAME_FIELD_NUMBER = 634;
    private int bitField0_;
    private double price_;
    private long updateTime_;
    private long userId_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<dr> map_ = emptyProtobufList();
    private String userName_ = "";

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        com.google.v.du.registerDefaultInstance(o.class, oVar);
    }

    private o() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -9;
        this.userId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserName() {
        this.bitField0_ &= -5;
        this.userName_ = getDefaultInstance().getUserName();
    }

    private void ensureMapIsMutable() {
        com.google.v.eo<dr> eoVar = this.map_;
        if (eoVar.c()) {
            return;
        }
        this.map_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static o getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static n newBuilder() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static o parseDelimitedFrom(InputStream inputStream) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(com.google.v.v vVar) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<o> parser() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(long j2) {
        this.bitField0_ |= 8;
        this.userId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.userName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserNameBytes(com.google.v.v vVar) {
        this.userName_ = vVar.u();
        this.bitField0_ |= 4;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001ɶɻ\u0005\u0000\u0001\u0001ɶက\u0000ɷဂ\u0001ɸЛɺဈ\u0002ɻဂ\u0003", new Object[]{"bitField0_", "price_", "updateTime_", "map_", dr.class, "userName_", "userId_"});
            case 3:
                return new o();
            case 4:
                return new n(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<o> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (o.class) {
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

    public long getUserId() {
        return this.userId_;
    }

    public String getUserName() {
        return this.userName_;
    }

    public com.google.v.v getUserNameBytes() {
        return com.google.v.v.s(this.userName_);
    }

    public boolean hasPrice() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUpdateTime() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasUserName() {
        return (this.bitField0_ & 4) != 0;
    }

    public static n newBuilder(o oVar) {
        return (n) DEFAULT_INSTANCE.createBuilder(oVar);
    }

    public static o parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static o parseFrom(com.google.v.z zVar) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static o parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMap(dr drVar) {
        Objects.requireNonNull(drVar);
        ensureMapIsMutable();
        this.map_.add(drVar);
    }

    public static o parseFrom(InputStream inputStream) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(ByteBuffer byteBuffer) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static o parseFrom(byte[] bArr) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static o parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (o) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
