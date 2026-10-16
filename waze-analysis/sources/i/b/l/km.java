package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class km extends com.google.v.du<km, kl> implements kn {
    public static final int COMMUNITY_FIELD_NUMBER = 1;
    private static final km DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<km> PARSER;
    private int bitField0_;
    private String community_ = "";

    static {
        km kmVar = new km();
        DEFAULT_INSTANCE = kmVar;
        com.google.v.du.registerDefaultInstance(km.class, kmVar);
    }

    private km() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommunity() {
        this.bitField0_ &= -2;
        this.community_ = getDefaultInstance().getCommunity();
    }

    public static km getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kl newBuilder() {
        return (kl) DEFAULT_INSTANCE.createBuilder();
    }

    public static km parseDelimitedFrom(InputStream inputStream) {
        return (km) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static km parseFrom(com.google.v.v vVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<km> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunity(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.community_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunityBytes(com.google.v.v vVar) {
        this.community_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "community_"});
        }
        if (iOrdinal == 3) {
            return new km();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<km> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (km.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCommunity() {
        return this.community_;
    }

    public com.google.v.v getCommunityBytes() {
        return com.google.v.v.s(this.community_);
    }

    public boolean hasCommunity() {
        return (this.bitField0_ & 1) != 0;
    }

    public static kl newBuilder(km kmVar) {
        return (kl) DEFAULT_INSTANCE.createBuilder(kmVar);
    }

    public static km parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (km) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static km parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static km parseFrom(com.google.v.z zVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static km parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static km parseFrom(InputStream inputStream) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static km parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static km parseFrom(ByteBuffer byteBuffer) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static km parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static km parseFrom(byte[] bArr) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static km parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
