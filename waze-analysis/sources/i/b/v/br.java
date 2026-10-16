package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class br extends com.google.v.du<br, bq> implements com.google.v.fj {
    private static final br DEFAULT_INSTANCE;
    public static final int IS_DELETED_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<br> PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 3;
    public static final int TS_FIELD_NUMBER = 2;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isDeleted_;
    private String provider_ = "";
    private long ts_;
    private long userId_;

    static {
        br brVar = new br();
        DEFAULT_INSTANCE = brVar;
        com.google.v.du.registerDefaultInstance(br.class, brVar);
    }

    private br() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsDeleted() {
        this.bitField0_ &= -9;
        this.isDeleted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.bitField0_ &= -5;
        this.provider_ = getDefaultInstance().getProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTs() {
        this.bitField0_ &= -3;
        this.ts_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -2;
        this.userId_ = 0L;
    }

    public static br getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bq newBuilder() {
        return (bq) DEFAULT_INSTANCE.createBuilder();
    }

    public static br parseDelimitedFrom(InputStream inputStream) {
        return (br) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static br parseFrom(com.google.v.v vVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<br> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsDeleted(boolean z) {
        this.bitField0_ |= 8;
        this.isDeleted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.provider_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderBytes(com.google.v.v vVar) {
        this.provider_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTs(long j2) {
        this.bitField0_ |= 2;
        this.ts_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(long j2) {
        this.bitField0_ |= 1;
        this.userId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "userId_", "ts_", "provider_", "isDeleted_"});
        }
        if (iOrdinal == 3) {
            return new br();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<br> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (br.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsDeleted() {
        return this.isDeleted_;
    }

    public String getProvider() {
        return this.provider_;
    }

    public com.google.v.v getProviderBytes() {
        return com.google.v.v.s(this.provider_);
    }

    public long getTs() {
        return this.ts_;
    }

    public long getUserId() {
        return this.userId_;
    }

    public boolean hasIsDeleted() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasProvider() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTs() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bq newBuilder(br brVar) {
        return (bq) DEFAULT_INSTANCE.createBuilder(brVar);
    }

    public static br parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (br) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static br parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static br parseFrom(com.google.v.z zVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static br parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static br parseFrom(InputStream inputStream) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static br parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static br parseFrom(ByteBuffer byteBuffer) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static br parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static br parseFrom(byte[] bArr) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static br parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
