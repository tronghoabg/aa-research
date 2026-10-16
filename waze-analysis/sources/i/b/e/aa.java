package i.b.e;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.en;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa extends du<aa, z> implements fj {
    private static final aa DEFAULT_INSTANCE;
    public static final int FAVORITE_IDS_FIELD_NUMBER = 2;
    private static volatile fo<aa> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 3;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private en favoriteIds_ = emptyLongList();
    private String requestId_ = "";
    private long userId_;

    static {
        aa aaVar = new aa();
        DEFAULT_INSTANCE = aaVar;
        du.registerDefaultInstance(aa.class, aaVar);
    }

    private aa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFavoriteIds(Iterable<? extends Long> iterable) {
        ensureFavoriteIdsIsMutable();
        com.google.v.c.addAll(iterable, this.favoriteIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFavoriteIds(long j2) {
        ensureFavoriteIdsIsMutable();
        this.favoriteIds_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavoriteIds() {
        this.favoriteIds_ = emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.bitField0_ &= -3;
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -2;
        this.userId_ = 0L;
    }

    private void ensureFavoriteIdsIsMutable() {
        en enVar = this.favoriteIds_;
        if (enVar.c()) {
            return;
        }
        this.favoriteIds_ = du.mutableCopy(enVar);
    }

    public static aa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static z newBuilder() {
        return (z) DEFAULT_INSTANCE.createBuilder();
    }

    public static aa parseDelimitedFrom(InputStream inputStream) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(com.google.v.v vVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavoriteIds(int i2, long j2) {
        ensureFavoriteIdsIsMutable();
        this.favoriteIds_.d(i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.requestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestIdBytes(com.google.v.v vVar) {
        this.requestId_ = vVar.u();
        this.bitField0_ |= 2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u0014\u0003ဈ\u0001", new Object[]{"bitField0_", "userId_", "favoriteIds_", "requestId_"});
        }
        if (iOrdinal == 3) {
            return new aa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new z(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<aa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getFavoriteIds(int i2) {
        return this.favoriteIds_.a(i2);
    }

    public int getFavoriteIdsCount() {
        return this.favoriteIds_.size();
    }

    public List<Long> getFavoriteIdsList() {
        return this.favoriteIds_;
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public com.google.v.v getRequestIdBytes() {
        return com.google.v.v.s(this.requestId_);
    }

    public long getUserId() {
        return this.userId_;
    }

    public boolean hasRequestId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static z newBuilder(aa aaVar) {
        return (z) DEFAULT_INSTANCE.createBuilder(aaVar);
    }

    public static aa parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(com.google.v.v vVar, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aa parseFrom(com.google.v.z zVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aa parseFrom(com.google.v.z zVar, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aa parseFrom(InputStream inputStream) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(InputStream inputStream, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(ByteBuffer byteBuffer) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aa parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aa parseFrom(byte[] bArr) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aa parseFrom(byte[] bArr, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
