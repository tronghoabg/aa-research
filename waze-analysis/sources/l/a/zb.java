package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class zb extends com.google.v.du<zb, za> implements com.google.v.fj {
    private static final zb DEFAULT_INSTANCE;
    public static final int GOOGLE_AD_INFORMATION_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<zb> PARSER;
    private int bitField0_;
    private zh googleAdInformation_;

    static {
        zb zbVar = new zb();
        DEFAULT_INSTANCE = zbVar;
        com.google.v.du.registerDefaultInstance(zb.class, zbVar);
    }

    private zb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdInformation() {
        this.googleAdInformation_ = null;
        this.bitField0_ &= -2;
    }

    public static zb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAdInformation(zh zhVar) {
        Objects.requireNonNull(zhVar);
        zh zhVar2 = this.googleAdInformation_;
        if (zhVar2 != null && zhVar2 != zh.getDefaultInstance()) {
            zg zgVarNewBuilder = zh.newBuilder(zhVar2);
            zgVarNewBuilder.mergeFrom((zg) zhVar);
            zhVar = zgVarNewBuilder.buildPartial();
        }
        this.googleAdInformation_ = zhVar;
        this.bitField0_ |= 1;
    }

    public static za newBuilder() {
        return (za) DEFAULT_INSTANCE.createBuilder();
    }

    public static zb parseDelimitedFrom(InputStream inputStream) {
        return (zb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static zb parseFrom(com.google.v.v vVar) {
        return (zb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<zb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdInformation(zh zhVar) {
        Objects.requireNonNull(zhVar);
        this.googleAdInformation_ = zhVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "googleAdInformation_"});
        }
        if (iOrdinal == 3) {
            return new zb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new za(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<zb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (zb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public zh getGoogleAdInformation() {
        zh zhVar = this.googleAdInformation_;
        return zhVar == null ? zh.getDefaultInstance() : zhVar;
    }

    public boolean hasGoogleAdInformation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static za newBuilder(zb zbVar) {
        return (za) DEFAULT_INSTANCE.createBuilder(zbVar);
    }

    public static zb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (zb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static zb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (zb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static zb parseFrom(com.google.v.z zVar) {
        return (zb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static zb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (zb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static zb parseFrom(InputStream inputStream) {
        return (zb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static zb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (zb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static zb parseFrom(ByteBuffer byteBuffer) {
        return (zb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static zb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (zb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static zb parseFrom(byte[] bArr) {
        return (zb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static zb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (zb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
