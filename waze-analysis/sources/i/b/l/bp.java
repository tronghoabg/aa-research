package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class bp extends com.google.v.du<bp, bo> implements com.google.v.fj {
    public static final int ACCESS_TOKEN_FIELD_NUMBER = 1;
    private static final bp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bp> PARSER;
    private String accessToken_ = "";
    private int bitField0_;

    static {
        bp bpVar = new bp();
        DEFAULT_INSTANCE = bpVar;
        com.google.v.du.registerDefaultInstance(bp.class, bpVar);
    }

    private bp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessToken() {
        this.bitField0_ &= -2;
        this.accessToken_ = getDefaultInstance().getAccessToken();
    }

    public static bp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bo newBuilder() {
        return (bo) DEFAULT_INSTANCE.createBuilder();
    }

    public static bp parseDelimitedFrom(InputStream inputStream) {
        return (bp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bp parseFrom(com.google.v.v vVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.accessToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessTokenBytes(com.google.v.v vVar) {
        this.accessToken_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "accessToken_"});
        }
        if (iOrdinal == 3) {
            return new bp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAccessToken() {
        return this.accessToken_;
    }

    public com.google.v.v getAccessTokenBytes() {
        return com.google.v.v.s(this.accessToken_);
    }

    public boolean hasAccessToken() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bo newBuilder(bp bpVar) {
        return (bo) DEFAULT_INSTANCE.createBuilder(bpVar);
    }

    public static bp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bp parseFrom(com.google.v.z zVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bp parseFrom(InputStream inputStream) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bp parseFrom(ByteBuffer byteBuffer) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bp parseFrom(byte[] bArr) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
