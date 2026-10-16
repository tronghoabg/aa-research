package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class zq extends com.google.v.du<zq, zo> implements com.google.v.fj {
    private static final zq DEFAULT_INSTANCE;
    public static final int GOOGLE_AD_BOTTOM_SHEET_CLICKED_FIELD_NUMBER = 2;
    public static final int GOOGLE_AD_BOTTOM_SHEET_DETOUR_SHOWN_FIELD_NUMBER = 1;
    public static final int GOOGLE_AD_BOTTOM_SHEET_DISMISSED_FIELD_NUMBER = 3;
    public static final int GOOGLE_AD_BOTTOM_SHEET_SHOWN_FIELD_NUMBER = 4;
    public static final int GOOGLE_AD_CLICKED_FIELD_NUMBER = 5;
    public static final int GOOGLE_AD_DISPLAYED_FIELD_NUMBER = 7;
    public static final int GOOGLE_AD_DISPLAY_STOPPED_FIELD_NUMBER = 6;
    public static final int GOOGLE_AD_IMPRESSION_FIELD_NUMBER = 8;
    public static final int GOOGLE_AD_TRUSTLESS_TOKEN_REQUEST_FIELD_NUMBER = 9;
    private static volatile com.google.v.fo<zq> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        zq zqVar = new zq();
        DEFAULT_INSTANCE = zqVar;
        com.google.v.du.registerDefaultInstance(zq.class, zqVar);
    }

    private zq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdBottomSheetClicked() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdBottomSheetDetourShown() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdBottomSheetDismissed() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdBottomSheetShown() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdClicked() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdDisplayStopped() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdDisplayed() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdImpression() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdTrustlessTokenRequest() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static zq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAdBottomSheetClicked(yq yqVar) {
        Objects.requireNonNull(yqVar);
        if (this.statCase_ == 2 && this.stat_ != yq.getDefaultInstance()) {
            yp ypVarNewBuilder = yq.newBuilder((yq) this.stat_);
            ypVarNewBuilder.mergeFrom((yp) yqVar);
            yqVar = ypVarNewBuilder.buildPartial();
        }
        this.stat_ = yqVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAdBottomSheetDetourShown(ys ysVar) {
        Objects.requireNonNull(ysVar);
        if (this.statCase_ == 1 && this.stat_ != ys.getDefaultInstance()) {
            yr yrVarNewBuilder = ys.newBuilder((ys) this.stat_);
            yrVarNewBuilder.mergeFrom((yr) ysVar);
            ysVar = yrVarNewBuilder.buildPartial();
        }
        this.stat_ = ysVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAdBottomSheetDismissed(yv yvVar) {
        Objects.requireNonNull(yvVar);
        if (this.statCase_ == 3 && this.stat_ != yv.getDefaultInstance()) {
            yt ytVarNewBuilder = yv.newBuilder((yv) this.stat_);
            ytVarNewBuilder.mergeFrom((yt) yvVar);
            yvVar = ytVarNewBuilder.buildPartial();
        }
        this.stat_ = yvVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAdBottomSheetShown(yx yxVar) {
        Objects.requireNonNull(yxVar);
        if (this.statCase_ == 4 && this.stat_ != yx.getDefaultInstance()) {
            yw ywVarNewBuilder = yx.newBuilder((yx) this.stat_);
            ywVarNewBuilder.mergeFrom((yw) yxVar);
            yxVar = ywVarNewBuilder.buildPartial();
        }
        this.stat_ = yxVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAdClicked(yz yzVar) {
        Objects.requireNonNull(yzVar);
        if (this.statCase_ == 5 && this.stat_ != yz.getDefaultInstance()) {
            yy yyVarNewBuilder = yz.newBuilder((yz) this.stat_);
            yyVarNewBuilder.mergeFrom((yy) yzVar);
            yzVar = yyVarNewBuilder.buildPartial();
        }
        this.stat_ = yzVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAdDisplayStopped(zb zbVar) {
        Objects.requireNonNull(zbVar);
        if (this.statCase_ == 6 && this.stat_ != zb.getDefaultInstance()) {
            za zaVarNewBuilder = zb.newBuilder((zb) this.stat_);
            zaVarNewBuilder.mergeFrom((za) zbVar);
            zbVar = zaVarNewBuilder.buildPartial();
        }
        this.stat_ = zbVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAdDisplayed(zd zdVar) {
        Objects.requireNonNull(zdVar);
        if (this.statCase_ == 7 && this.stat_ != zd.getDefaultInstance()) {
            zc zcVarNewBuilder = zd.newBuilder((zd) this.stat_);
            zcVarNewBuilder.mergeFrom((zc) zdVar);
            zdVar = zcVarNewBuilder.buildPartial();
        }
        this.stat_ = zdVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAdImpression(zf zfVar) {
        Objects.requireNonNull(zfVar);
        if (this.statCase_ == 8 && this.stat_ != zf.getDefaultInstance()) {
            ze zeVarNewBuilder = zf.newBuilder((zf) this.stat_);
            zeVarNewBuilder.mergeFrom((ze) zfVar);
            zfVar = zeVarNewBuilder.buildPartial();
        }
        this.stat_ = zfVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAdTrustlessTokenRequest(zn znVar) {
        Objects.requireNonNull(znVar);
        if (this.statCase_ == 9 && this.stat_ != zn.getDefaultInstance()) {
            zl zlVarNewBuilder = zn.newBuilder((zn) this.stat_);
            zlVarNewBuilder.mergeFrom((zl) znVar);
            znVar = zlVarNewBuilder.buildPartial();
        }
        this.stat_ = znVar;
        this.statCase_ = 9;
    }

    public static zo newBuilder() {
        return (zo) DEFAULT_INSTANCE.createBuilder();
    }

    public static zq parseDelimitedFrom(InputStream inputStream) {
        return (zq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static zq parseFrom(com.google.v.v vVar) {
        return (zq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<zq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdBottomSheetClicked(yq yqVar) {
        Objects.requireNonNull(yqVar);
        this.stat_ = yqVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdBottomSheetDetourShown(ys ysVar) {
        Objects.requireNonNull(ysVar);
        this.stat_ = ysVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdBottomSheetDismissed(yv yvVar) {
        Objects.requireNonNull(yvVar);
        this.stat_ = yvVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdBottomSheetShown(yx yxVar) {
        Objects.requireNonNull(yxVar);
        this.stat_ = yxVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdClicked(yz yzVar) {
        Objects.requireNonNull(yzVar);
        this.stat_ = yzVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdDisplayStopped(zb zbVar) {
        Objects.requireNonNull(zbVar);
        this.stat_ = zbVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdDisplayed(zd zdVar) {
        Objects.requireNonNull(zdVar);
        this.stat_ = zdVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdImpression(zf zfVar) {
        Objects.requireNonNull(zfVar);
        this.stat_ = zfVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdTrustlessTokenRequest(zn znVar) {
        Objects.requireNonNull(znVar);
        this.stat_ = znVar;
        this.statCase_ = 9;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"stat_", "statCase_", ys.class, yq.class, yv.class, yx.class, yz.class, zb.class, zd.class, zf.class, zn.class});
        }
        if (iOrdinal == 3) {
            return new zq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<zq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (zq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public yq getGoogleAdBottomSheetClicked() {
        return this.statCase_ == 2 ? (yq) this.stat_ : yq.getDefaultInstance();
    }

    public ys getGoogleAdBottomSheetDetourShown() {
        return this.statCase_ == 1 ? (ys) this.stat_ : ys.getDefaultInstance();
    }

    public yv getGoogleAdBottomSheetDismissed() {
        return this.statCase_ == 3 ? (yv) this.stat_ : yv.getDefaultInstance();
    }

    public yx getGoogleAdBottomSheetShown() {
        return this.statCase_ == 4 ? (yx) this.stat_ : yx.getDefaultInstance();
    }

    public yz getGoogleAdClicked() {
        return this.statCase_ == 5 ? (yz) this.stat_ : yz.getDefaultInstance();
    }

    public zb getGoogleAdDisplayStopped() {
        return this.statCase_ == 6 ? (zb) this.stat_ : zb.getDefaultInstance();
    }

    public zd getGoogleAdDisplayed() {
        return this.statCase_ == 7 ? (zd) this.stat_ : zd.getDefaultInstance();
    }

    public zf getGoogleAdImpression() {
        return this.statCase_ == 8 ? (zf) this.stat_ : zf.getDefaultInstance();
    }

    public zn getGoogleAdTrustlessTokenRequest() {
        return this.statCase_ == 9 ? (zn) this.stat_ : zn.getDefaultInstance();
    }

    public zp getStatCase() {
        switch (this.statCase_) {
            case 0:
                return zp.f55720j;
            case 1:
                return zp.f55711a;
            case 2:
                return zp.f55712b;
            case 3:
                return zp.f55713c;
            case 4:
                return zp.f55714d;
            case 5:
                return zp.f55715e;
            case 6:
                return zp.f55716f;
            case 7:
                return zp.f55717g;
            case 8:
                return zp.f55718h;
            case 9:
                return zp.f55719i;
            default:
                return null;
        }
    }

    public boolean hasGoogleAdBottomSheetClicked() {
        return this.statCase_ == 2;
    }

    public boolean hasGoogleAdBottomSheetDetourShown() {
        return this.statCase_ == 1;
    }

    public boolean hasGoogleAdBottomSheetDismissed() {
        return this.statCase_ == 3;
    }

    public boolean hasGoogleAdBottomSheetShown() {
        return this.statCase_ == 4;
    }

    public boolean hasGoogleAdClicked() {
        return this.statCase_ == 5;
    }

    public boolean hasGoogleAdDisplayStopped() {
        return this.statCase_ == 6;
    }

    public boolean hasGoogleAdDisplayed() {
        return this.statCase_ == 7;
    }

    public boolean hasGoogleAdImpression() {
        return this.statCase_ == 8;
    }

    public boolean hasGoogleAdTrustlessTokenRequest() {
        return this.statCase_ == 9;
    }

    public static zo newBuilder(zq zqVar) {
        return (zo) DEFAULT_INSTANCE.createBuilder(zqVar);
    }

    public static zq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (zq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static zq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (zq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static zq parseFrom(com.google.v.z zVar) {
        return (zq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static zq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (zq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static zq parseFrom(InputStream inputStream) {
        return (zq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static zq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (zq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static zq parseFrom(ByteBuffer byteBuffer) {
        return (zq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static zq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (zq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static zq parseFrom(byte[] bArr) {
        return (zq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static zq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (zq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
