package i.b.e;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o extends du<o, n> implements fj {
    private static final o DEFAULT_INSTANCE;
    public static final int FAVORITE_FIELD_NUMBER = 1;
    private static volatile fo<o> PARSER = null;
    public static final int SYNC_VERSION_FIELD_NUMBER = 2;
    public static final int UPDATE_VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private eo<l> favorite_ = emptyProtobufList();
    private int syncVersion_;
    private int updateVersion_;

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        du.registerDefaultInstance(o.class, oVar);
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFavorite(Iterable<? extends l> iterable) {
        ensureFavoriteIsMutable();
        com.google.v.c.addAll(iterable, this.favorite_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFavorite(int i2, l lVar) {
        Objects.requireNonNull(lVar);
        ensureFavoriteIsMutable();
        this.favorite_.add(i2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavorite() {
        this.favorite_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncVersion() {
        this.bitField0_ &= -2;
        this.syncVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateVersion() {
        this.bitField0_ &= -3;
        this.updateVersion_ = 0;
    }

    private void ensureFavoriteIsMutable() {
        eo<l> eoVar = this.favorite_;
        if (eoVar.c()) {
            return;
        }
        this.favorite_ = du.mutableCopy(eoVar);
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
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<o> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFavorite(int i2) {
        ensureFavoriteIsMutable();
        this.favorite_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavorite(int i2, l lVar) {
        Objects.requireNonNull(lVar);
        ensureFavoriteIsMutable();
        this.favorite_.set(i2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncVersion(int i2) {
        this.bitField0_ |= 1;
        this.syncVersion_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateVersion(int i2) {
        this.bitField0_ |= 2;
        this.updateVersion_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001", new Object[]{"bitField0_", "favorite_", l.class, "syncVersion_", "updateVersion_"});
        }
        if (iOrdinal == 3) {
            return new o();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new n(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<o> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (o.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public l getFavorite(int i2) {
        return this.favorite_.get(i2);
    }

    public int getFavoriteCount() {
        return this.favorite_.size();
    }

    public List<l> getFavoriteList() {
        return this.favorite_;
    }

    public m getFavoriteOrBuilder(int i2) {
        return this.favorite_.get(i2);
    }

    public List<? extends m> getFavoriteOrBuilderList() {
        return this.favorite_;
    }

    public int getSyncVersion() {
        return this.syncVersion_;
    }

    public int getUpdateVersion() {
        return this.updateVersion_;
    }

    public boolean hasSyncVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUpdateVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public static n newBuilder(o oVar) {
        return (n) DEFAULT_INSTANCE.createBuilder(oVar);
    }

    public static o parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(com.google.v.v vVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static o parseFrom(com.google.v.z zVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static o parseFrom(com.google.v.z zVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFavorite(l lVar) {
        Objects.requireNonNull(lVar);
        ensureFavoriteIsMutable();
        this.favorite_.add(lVar);
    }

    public static o parseFrom(InputStream inputStream) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(InputStream inputStream, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(ByteBuffer byteBuffer) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static o parseFrom(byte[] bArr) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static o parseFrom(byte[] bArr, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
