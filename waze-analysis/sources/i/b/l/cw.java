package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class cw extends com.google.v.du<cw, cv> implements com.google.v.fj {
    public static final int COMMUNITY_NAME_FIELD_NUMBER = 1;
    private static final cw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<cw> PARSER;
    private int bitField0_;
    private String communityName_ = "";

    static {
        cw cwVar = new cw();
        DEFAULT_INSTANCE = cwVar;
        com.google.v.du.registerDefaultInstance(cw.class, cwVar);
    }

    private cw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommunityName() {
        this.bitField0_ &= -2;
        this.communityName_ = getDefaultInstance().getCommunityName();
    }

    public static cw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cv newBuilder() {
        return (cv) DEFAULT_INSTANCE.createBuilder();
    }

    public static cw parseDelimitedFrom(InputStream inputStream) {
        return (cw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cw parseFrom(com.google.v.v vVar) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunityName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.communityName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunityNameBytes(com.google.v.v vVar) {
        this.communityName_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "communityName_"});
        }
        if (iOrdinal == 3) {
            return new cw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCommunityName() {
        return this.communityName_;
    }

    public com.google.v.v getCommunityNameBytes() {
        return com.google.v.v.s(this.communityName_);
    }

    public boolean hasCommunityName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cv newBuilder(cw cwVar) {
        return (cv) DEFAULT_INSTANCE.createBuilder(cwVar);
    }

    public static cw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cw parseFrom(com.google.v.z zVar) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cw parseFrom(InputStream inputStream) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cw parseFrom(ByteBuffer byteBuffer) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cw parseFrom(byte[] bArr) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
