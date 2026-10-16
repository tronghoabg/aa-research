package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class yv extends com.google.v.du<yv, yt> implements com.google.v.fj {
    private static final yv DEFAULT_INSTANCE;
    public static final int DISMISS_METHOD_FIELD_NUMBER = 2;
    public static final int GOOGLE_AD_INFORMATION_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<yv> PARSER;
    private int bitField0_;
    private int dismissMethod_;
    private zh googleAdInformation_;

    static {
        yv yvVar = new yv();
        DEFAULT_INSTANCE = yvVar;
        com.google.v.du.registerDefaultInstance(yv.class, yvVar);
    }

    private yv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDismissMethod() {
        this.dismissMethod_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdInformation() {
        this.googleAdInformation_ = null;
        this.bitField0_ &= -2;
    }

    public static yv getDefaultInstance() {
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

    public static yt newBuilder() {
        return (yt) DEFAULT_INSTANCE.createBuilder();
    }

    public static yv parseDelimitedFrom(InputStream inputStream) {
        return (yv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static yv parseFrom(com.google.v.v vVar) {
        return (yv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<yv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDismissMethod(yu yuVar) {
        this.dismissMethod_ = yuVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDismissMethodValue(int i2) {
        this.dismissMethod_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "googleAdInformation_", "dismissMethod_"});
        }
        if (iOrdinal == 3) {
            return new yv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new yt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<yv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (yv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public yu getDismissMethod() {
        int i2 = this.dismissMethod_;
        yu yuVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : yu.BACK_BUTTON : yu.TAP_X_ICON : yu.SWIPE_DOWN_OR_TAP_ON_MAP : yu.DISMISS_UNSPECIFIED;
        return yuVar == null ? yu.UNRECOGNIZED : yuVar;
    }

    public int getDismissMethodValue() {
        return this.dismissMethod_;
    }

    public zh getGoogleAdInformation() {
        zh zhVar = this.googleAdInformation_;
        return zhVar == null ? zh.getDefaultInstance() : zhVar;
    }

    public boolean hasGoogleAdInformation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static yt newBuilder(yv yvVar) {
        return (yt) DEFAULT_INSTANCE.createBuilder(yvVar);
    }

    public static yv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (yv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static yv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (yv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static yv parseFrom(com.google.v.z zVar) {
        return (yv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static yv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (yv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static yv parseFrom(InputStream inputStream) {
        return (yv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static yv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (yv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static yv parseFrom(ByteBuffer byteBuffer) {
        return (yv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static yv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (yv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static yv parseFrom(byte[] bArr) {
        return (yv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static yv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (yv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
