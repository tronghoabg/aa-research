package l.a;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bjb extends com.google.v.du<bjb, biz> implements com.google.v.fj {
    public static final int ACTION_SOURCE_FIELD_NUMBER = 4;
    private static final bjb DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bjb> PARSER = null;
    public static final int POPUP_ID_FIELD_NUMBER = 5;
    public static final int TOLL_PRICE_CURRENCY_FIELD_NUMBER = 3;
    public static final int TOLL_PRICE_FIELD_NUMBER = 2;
    public static final int TOLL_ROAD_NAMES_FIELD_NUMBER = 1;
    private int actionSource_;
    private int bitField0_;
    private int popupId_;
    private double tollPrice_;
    private String tollRoadNames_ = "";
    private String tollPriceCurrency_ = "";

    static {
        bjb bjbVar = new bjb();
        DEFAULT_INSTANCE = bjbVar;
        com.google.v.du.registerDefaultInstance(bjb.class, bjbVar);
    }

    private bjb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionSource() {
        this.actionSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopupId() {
        this.popupId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollPrice() {
        this.bitField0_ &= -2;
        this.tollPrice_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollPriceCurrency() {
        this.tollPriceCurrency_ = getDefaultInstance().getTollPriceCurrency();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollRoadNames() {
        this.tollRoadNames_ = getDefaultInstance().getTollRoadNames();
    }

    public static bjb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static biz newBuilder() {
        return (biz) DEFAULT_INSTANCE.createBuilder();
    }

    public static bjb parseDelimitedFrom(InputStream inputStream) {
        return (bjb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bjb parseFrom(com.google.v.v vVar) {
        return (bjb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bjb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionSource(biy biyVar) {
        this.actionSource_ = biyVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionSourceValue(int i2) {
        this.actionSource_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopupId(bja bjaVar) {
        this.popupId_ = bjaVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopupIdValue(int i2) {
        this.popupId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPrice(double d2) {
        this.bitField0_ |= 1;
        this.tollPrice_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPriceCurrency(String str) {
        Objects.requireNonNull(str);
        this.tollPriceCurrency_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPriceCurrencyBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.tollPriceCurrency_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollRoadNames(String str) {
        Objects.requireNonNull(str);
        this.tollRoadNames_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollRoadNamesBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.tollRoadNames_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002က\u0000\u0003Ȉ\u0004\f\u0005\f", new Object[]{"bitField0_", "tollRoadNames_", "tollPrice_", "tollPriceCurrency_", "actionSource_", "popupId_"});
        }
        if (iOrdinal == 3) {
            return new bjb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new biz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bjb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bjb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public biy getActionSource() {
        int i2 = this.actionSource_;
        biy biyVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : biy.UNKNOWN : biy.ALTERNATE_ROUTES_SCREEN : biy.TRIP_OVERVIEW_SCREEN : biy.ETA_SCREEN : biy.ACTION_SOURCE_UNSPECIFIED;
        return biyVar == null ? biy.UNRECOGNIZED : biyVar;
    }

    public int getActionSourceValue() {
        return this.actionSource_;
    }

    public bja getPopupId() {
        bja bjaVar;
        switch (this.popupId_) {
            case 0:
                bjaVar = bja.TOLL_INFO_UNSPECIFIED;
                break;
            case 1:
                bjaVar = bja.TOLL_INFO_MISSING_PASS;
                break;
            case 2:
                bjaVar = bja.TOLL_INFO_MISSING_PASS_WITH_PRICE;
                break;
            case 3:
                bjaVar = bja.TOLL_INFO_PRICE_CHANGE;
                break;
            case 4:
                bjaVar = bja.TOLL_INFO_PRICE_CHANGE_BY_TIME;
                break;
            case 5:
                bjaVar = bja.TOLL_INFO_WITH_PASS;
                break;
            case 6:
                bjaVar = bja.TOLL_INFO_DEFAULT;
                break;
            case 7:
                bjaVar = bja.TOLL_INFO_NO_PRICE;
                break;
            case 8:
                bjaVar = bja.TOLL_INFO_DISABLED_BY_CONFIG;
                break;
            case 9:
                bjaVar = bja.TOLL_INFO_DYNAMIC_PRICE_SHOWN;
                break;
            case 10:
                bjaVar = bja.TOLL_INFO_DYNAMIC_PRICE_NOT_SHOWN;
                break;
            default:
                bjaVar = null;
                break;
        }
        return bjaVar == null ? bja.UNRECOGNIZED : bjaVar;
    }

    public int getPopupIdValue() {
        return this.popupId_;
    }

    public double getTollPrice() {
        return this.tollPrice_;
    }

    public String getTollPriceCurrency() {
        return this.tollPriceCurrency_;
    }

    public com.google.v.v getTollPriceCurrencyBytes() {
        return com.google.v.v.s(this.tollPriceCurrency_);
    }

    public String getTollRoadNames() {
        return this.tollRoadNames_;
    }

    public com.google.v.v getTollRoadNamesBytes() {
        return com.google.v.v.s(this.tollRoadNames_);
    }

    public boolean hasTollPrice() {
        return (this.bitField0_ & 1) != 0;
    }

    public static biz newBuilder(bjb bjbVar) {
        return (biz) DEFAULT_INSTANCE.createBuilder(bjbVar);
    }

    public static bjb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bjb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bjb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bjb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bjb parseFrom(com.google.v.z zVar) {
        return (bjb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bjb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bjb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bjb parseFrom(InputStream inputStream) {
        return (bjb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bjb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bjb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bjb parseFrom(ByteBuffer byteBuffer) {
        return (bjb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bjb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bjb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bjb parseFrom(byte[] bArr) {
        return (bjb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bjb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bjb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
