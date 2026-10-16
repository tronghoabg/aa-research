package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class yz extends com.google.v.du<yz, yy> implements com.google.v.fj {
    private static final yz DEFAULT_INSTANCE;
    public static final int GOOGLE_AD_INFORMATION_EXTENDED_FIELD_NUMBER = 2;
    public static final int GOOGLE_AD_INFORMATION_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<yz> PARSER;
    private int bitField0_;
    private zk googleAdInformationExtended_;
    private zh googleAdInformation_;

    static {
        yz yzVar = new yz();
        DEFAULT_INSTANCE = yzVar;
        com.google.v.du.registerDefaultInstance(yz.class, yzVar);
    }

    private yz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdInformation() {
        this.googleAdInformation_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdInformationExtended() {
        this.googleAdInformationExtended_ = null;
        this.bitField0_ &= -3;
    }

    public static yz getDefaultInstance() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAdInformationExtended(zk zkVar) {
        Objects.requireNonNull(zkVar);
        zk zkVar2 = this.googleAdInformationExtended_;
        if (zkVar2 != null && zkVar2 != zk.getDefaultInstance()) {
            zj zjVarNewBuilder = zk.newBuilder(zkVar2);
            zjVarNewBuilder.mergeFrom((zj) zkVar);
            zkVar = zjVarNewBuilder.buildPartial();
        }
        this.googleAdInformationExtended_ = zkVar;
        this.bitField0_ |= 2;
    }

    public static yy newBuilder() {
        return (yy) DEFAULT_INSTANCE.createBuilder();
    }

    public static yz parseDelimitedFrom(InputStream inputStream) {
        return (yz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static yz parseFrom(com.google.v.v vVar) {
        return (yz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<yz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdInformation(zh zhVar) {
        Objects.requireNonNull(zhVar);
        this.googleAdInformation_ = zhVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdInformationExtended(zk zkVar) {
        Objects.requireNonNull(zkVar);
        this.googleAdInformationExtended_ = zkVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "googleAdInformation_", "googleAdInformationExtended_"});
        }
        if (iOrdinal == 3) {
            return new yz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new yy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<yz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (yz.class) {
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

    public zk getGoogleAdInformationExtended() {
        zk zkVar = this.googleAdInformationExtended_;
        return zkVar == null ? zk.getDefaultInstance() : zkVar;
    }

    public boolean hasGoogleAdInformation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasGoogleAdInformationExtended() {
        return (this.bitField0_ & 2) != 0;
    }

    public static yy newBuilder(yz yzVar) {
        return (yy) DEFAULT_INSTANCE.createBuilder(yzVar);
    }

    public static yz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (yz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static yz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (yz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static yz parseFrom(com.google.v.z zVar) {
        return (yz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static yz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (yz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static yz parseFrom(InputStream inputStream) {
        return (yz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static yz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (yz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static yz parseFrom(ByteBuffer byteBuffer) {
        return (yz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static yz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (yz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static yz parseFrom(byte[] bArr) {
        return (yz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static yz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (yz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
