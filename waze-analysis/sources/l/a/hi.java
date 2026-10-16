package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class hi extends com.google.v.du<hi, hh> implements com.google.v.fj {
    public static final int BANNER_INFO_FIELD_NUMBER = 1;
    private static final hi DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<hi> PARSER;
    private hg bannerInfo_;
    private int bitField0_;

    static {
        hi hiVar = new hi();
        DEFAULT_INSTANCE = hiVar;
        com.google.v.du.registerDefaultInstance(hi.class, hiVar);
    }

    private hi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBannerInfo() {
        this.bannerInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static hi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBannerInfo(hg hgVar) {
        Objects.requireNonNull(hgVar);
        hg hgVar2 = this.bannerInfo_;
        if (hgVar2 != null && hgVar2 != hg.getDefaultInstance()) {
            hf hfVarNewBuilder = hg.newBuilder(hgVar2);
            hfVarNewBuilder.mergeFrom((hf) hgVar);
            hgVar = hfVarNewBuilder.buildPartial();
        }
        this.bannerInfo_ = hgVar;
        this.bitField0_ |= 1;
    }

    public static hh newBuilder() {
        return (hh) DEFAULT_INSTANCE.createBuilder();
    }

    public static hi parseDelimitedFrom(InputStream inputStream) {
        return (hi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hi parseFrom(com.google.v.v vVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerInfo(hg hgVar) {
        Objects.requireNonNull(hgVar);
        this.bannerInfo_ = hgVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "bannerInfo_"});
        }
        if (iOrdinal == 3) {
            return new hi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public hg getBannerInfo() {
        hg hgVar = this.bannerInfo_;
        return hgVar == null ? hg.getDefaultInstance() : hgVar;
    }

    public boolean hasBannerInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static hh newBuilder(hi hiVar) {
        return (hh) DEFAULT_INSTANCE.createBuilder(hiVar);
    }

    public static hi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hi parseFrom(com.google.v.z zVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hi parseFrom(InputStream inputStream) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hi parseFrom(ByteBuffer byteBuffer) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hi parseFrom(byte[] bArr) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
