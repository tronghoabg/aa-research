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
public final class q extends du<q, p> implements fj {
    private static final q DEFAULT_INSTANCE;
    public static final int FAVORITE_FIELD_NUMBER = 2;
    private static volatile fo<q> PARSER = null;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private eo<l> favorite_ = emptyProtobufList();
    private long userId_;

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        du.registerDefaultInstance(q.class, qVar);
    }

    private q() {
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
    public void clearUserId() {
        this.bitField0_ &= -2;
        this.userId_ = 0L;
    }

    private void ensureFavoriteIsMutable() {
        eo<l> eoVar = this.favorite_;
        if (eoVar.c()) {
            return;
        }
        this.favorite_ = du.mutableCopy(eoVar);
    }

    public static q getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static p newBuilder() {
        return (p) DEFAULT_INSTANCE.createBuilder();
    }

    public static q parseDelimitedFrom(InputStream inputStream) {
        return (q) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static q parseFrom(com.google.v.v vVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<q> parser() {
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
    public void setUserId(long j2) {
        this.bitField0_ |= 1;
        this.userId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new Object[]{"bitField0_", "userId_", "favorite_", l.class});
        }
        if (iOrdinal == 3) {
            return new q();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new p(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<q> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (q.class) {
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

    public long getUserId() {
        return this.userId_;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static p newBuilder(q qVar) {
        return (p) DEFAULT_INSTANCE.createBuilder(qVar);
    }

    public static q parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (q) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static q parseFrom(com.google.v.v vVar, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static q parseFrom(com.google.v.z zVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static q parseFrom(com.google.v.z zVar, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFavorite(l lVar) {
        Objects.requireNonNull(lVar);
        ensureFavoriteIsMutable();
        this.favorite_.add(lVar);
    }

    public static q parseFrom(InputStream inputStream) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static q parseFrom(InputStream inputStream, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static q parseFrom(ByteBuffer byteBuffer) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static q parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static q parseFrom(byte[] bArr) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static q parseFrom(byte[] bArr, de deVar) {
        return (q) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
