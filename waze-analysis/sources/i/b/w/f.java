package i.b.w;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class f extends du<f, e> implements fj {
    private static final f DEFAULT_INSTANCE;
    public static final int OWNED_BY_USER_ONLY_FIELD_NUMBER = 2;
    private static volatile fo<f> PARSER = null;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean ownedByUserOnly_;
    private long userId_;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        du.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOwnedByUserOnly() {
        this.bitField0_ &= -3;
        this.ownedByUserOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -2;
        this.userId_ = 0L;
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static e newBuilder() {
        return (e) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(v vVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<f> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnedByUserOnly(boolean z) {
        this.bitField0_ |= 2;
        this.ownedByUserOnly_ = z;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "userId_", "ownedByUserOnly_"});
        }
        if (iOrdinal == 3) {
            return new f();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new e(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<f> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (f.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getOwnedByUserOnly() {
        return this.ownedByUserOnly_;
    }

    public long getUserId() {
        return this.userId_;
    }

    public boolean hasOwnedByUserOnly() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static e newBuilder(f fVar) {
        return (e) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(v vVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static f parseFrom(z zVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static f parseFrom(z zVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static f parseFrom(InputStream inputStream) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(InputStream inputStream, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(ByteBuffer byteBuffer) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static f parseFrom(byte[] bArr) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f parseFrom(byte[] bArr, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
