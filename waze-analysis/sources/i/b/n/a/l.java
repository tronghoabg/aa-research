package i.b.n.a;

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
@Deprecated
/* loaded from: classes8.dex */
public final class l extends du<l, k> implements fj {
    public static final int ADVERTISER_BRAND_ID_FIELD_NUMBER = 1;
    private static final l DEFAULT_INSTANCE;
    private static volatile fo<l> PARSER;
    private eo<String> advertiserBrandId_ = emptyProtobufList();

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        du.registerDefaultInstance(l.class, lVar);
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdvertiserBrandId(String str) {
        Objects.requireNonNull(str);
        ensureAdvertiserBrandIdIsMutable();
        this.advertiserBrandId_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdvertiserBrandIdBytes(com.google.v.v vVar) {
        ensureAdvertiserBrandIdIsMutable();
        this.advertiserBrandId_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAdvertiserBrandId(Iterable<String> iterable) {
        ensureAdvertiserBrandIdIsMutable();
        com.google.v.c.addAll(iterable, this.advertiserBrandId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvertiserBrandId() {
        this.advertiserBrandId_ = emptyProtobufList();
    }

    private void ensureAdvertiserBrandIdIsMutable() {
        eo<String> eoVar = this.advertiserBrandId_;
        if (eoVar.c()) {
            return;
        }
        this.advertiserBrandId_ = du.mutableCopy(eoVar);
    }

    public static l getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static k newBuilder() {
        return (k) DEFAULT_INSTANCE.createBuilder();
    }

    public static l parseDelimitedFrom(InputStream inputStream) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(com.google.v.v vVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<l> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertiserBrandId(int i2, String str) {
        Objects.requireNonNull(str);
        ensureAdvertiserBrandIdIsMutable();
        this.advertiserBrandId_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"advertiserBrandId_"});
        }
        if (iOrdinal == 3) {
            return new l();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new k(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<l> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (l.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAdvertiserBrandId(int i2) {
        return this.advertiserBrandId_.get(i2);
    }

    public com.google.v.v getAdvertiserBrandIdBytes(int i2) {
        return com.google.v.v.s(this.advertiserBrandId_.get(i2));
    }

    public int getAdvertiserBrandIdCount() {
        return this.advertiserBrandId_.size();
    }

    public List<String> getAdvertiserBrandIdList() {
        return this.advertiserBrandId_;
    }

    public static k newBuilder(l lVar) {
        return (k) DEFAULT_INSTANCE.createBuilder(lVar);
    }

    public static l parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(com.google.v.v vVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static l parseFrom(com.google.v.z zVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static l parseFrom(com.google.v.z zVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static l parseFrom(InputStream inputStream) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(InputStream inputStream, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(ByteBuffer byteBuffer) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static l parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static l parseFrom(byte[] bArr) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static l parseFrom(byte[] bArr, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
