package i.b.p;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class an extends du<an, am> implements fj {
    private static final an DEFAULT_INSTANCE;
    public static final int IMAGE_ID_FIELD_NUMBER = 2;
    private static volatile fo<an> PARSER = null;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String imageId_ = "";
    private long userId_;

    static {
        an anVar = new an();
        DEFAULT_INSTANCE = anVar;
        du.registerDefaultInstance(an.class, anVar);
    }

    private an() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageId() {
        this.bitField0_ &= -3;
        this.imageId_ = getDefaultInstance().getImageId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -2;
        this.userId_ = 0L;
    }

    public static an getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static am newBuilder() {
        return (am) DEFAULT_INSTANCE.createBuilder();
    }

    public static an parseDelimitedFrom(InputStream inputStream) {
        return (an) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static an parseFrom(com.google.v.v vVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<an> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.imageId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageIdBytes(com.google.v.v vVar) {
        this.imageId_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "userId_", "imageId_"});
        }
        if (iOrdinal == 3) {
            return new an();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new am(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<an> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (an.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public String getImageId() {
        return this.imageId_;
    }

    @Deprecated
    public com.google.v.v getImageIdBytes() {
        return com.google.v.v.s(this.imageId_);
    }

    public long getUserId() {
        return this.userId_;
    }

    @Deprecated
    public boolean hasImageId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static am newBuilder(an anVar) {
        return (am) DEFAULT_INSTANCE.createBuilder(anVar);
    }

    public static an parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (an) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static an parseFrom(com.google.v.v vVar, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static an parseFrom(com.google.v.z zVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static an parseFrom(com.google.v.z zVar, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static an parseFrom(InputStream inputStream) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static an parseFrom(InputStream inputStream, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static an parseFrom(ByteBuffer byteBuffer) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static an parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static an parseFrom(byte[] bArr) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static an parseFrom(byte[] bArr, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
