package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class boy extends com.google.v.du<boy, bow> implements com.google.v.fj {
    private static final boy DEFAULT_INSTANCE;
    public static final int FORCE_UPGRADE_MESSAGE_CLICKED_FIELD_NUMBER = 8;
    public static final int FORCE_UPGRADE_MESSAGE_RECEIVED_FIELD_NUMBER = 6;
    public static final int FORCE_UPGRADE_MESSAGE_SHOWN_FIELD_NUMBER = 7;
    public static final int IN_CAR_LOGIN_CONFIRMATION_SCREEN_SHOWN_FIELD_NUMBER = 4;
    public static final int IN_CAR_LOGIN_SCREEN_CLICKED_FIELD_NUMBER = 1;
    public static final int IN_CAR_LOGIN_SCREEN_SHOWN_FIELD_NUMBER = 2;
    public static final int LOGIN_COMPLETE_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<boy> PARSER = null;
    public static final int QR_CODE_LOGIN_SHOWN_FIELD_NUMBER = 3;
    private int statCase_ = 0;
    private Object stat_;

    static {
        boy boyVar = new boy();
        DEFAULT_INSTANCE = boyVar;
        com.google.v.du.registerDefaultInstance(boy.class, boyVar);
    }

    private boy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForceUpgradeMessageClicked() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForceUpgradeMessageReceived() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForceUpgradeMessageShown() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarLoginConfirmationScreenShown() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarLoginScreenClicked() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarLoginScreenShown() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoginComplete() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQrCodeLoginShown() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static boy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeForceUpgradeMessageClicked(wy wyVar) {
        Objects.requireNonNull(wyVar);
        if (this.statCase_ == 8 && this.stat_ != wy.getDefaultInstance()) {
            wx wxVarNewBuilder = wy.newBuilder((wy) this.stat_);
            wxVarNewBuilder.mergeFrom((wx) wyVar);
            wyVar = wxVarNewBuilder.buildPartial();
        }
        this.stat_ = wyVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeForceUpgradeMessageReceived(xa xaVar) {
        Objects.requireNonNull(xaVar);
        if (this.statCase_ == 6 && this.stat_ != xa.getDefaultInstance()) {
            wz wzVarNewBuilder = xa.newBuilder((xa) this.stat_);
            wzVarNewBuilder.mergeFrom((wz) xaVar);
            xaVar = wzVarNewBuilder.buildPartial();
        }
        this.stat_ = xaVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeForceUpgradeMessageShown(xc xcVar) {
        Objects.requireNonNull(xcVar);
        if (this.statCase_ == 7 && this.stat_ != xc.getDefaultInstance()) {
            xb xbVarNewBuilder = xc.newBuilder((xc) this.stat_);
            xbVarNewBuilder.mergeFrom((xb) xcVar);
            xcVar = xbVarNewBuilder.buildPartial();
        }
        this.stat_ = xcVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInCarLoginConfirmationScreenShown(ace aceVar) {
        Objects.requireNonNull(aceVar);
        if (this.statCase_ == 4 && this.stat_ != ace.getDefaultInstance()) {
            acd acdVarNewBuilder = ace.newBuilder((ace) this.stat_);
            acdVarNewBuilder.mergeFrom((acd) aceVar);
            aceVar = acdVarNewBuilder.buildPartial();
        }
        this.stat_ = aceVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInCarLoginScreenClicked(ach achVar) {
        Objects.requireNonNull(achVar);
        if (this.statCase_ == 1 && this.stat_ != ach.getDefaultInstance()) {
            acg acgVarNewBuilder = ach.newBuilder((ach) this.stat_);
            acgVarNewBuilder.mergeFrom((acg) achVar);
            achVar = acgVarNewBuilder.buildPartial();
        }
        this.stat_ = achVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInCarLoginScreenShown(acj acjVar) {
        Objects.requireNonNull(acjVar);
        if (this.statCase_ == 2 && this.stat_ != acj.getDefaultInstance()) {
            aci aciVarNewBuilder = acj.newBuilder((acj) this.stat_);
            aciVarNewBuilder.mergeFrom((aci) acjVar);
            acjVar = aciVarNewBuilder.buildPartial();
        }
        this.stat_ = acjVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLoginComplete(ahe aheVar) {
        Objects.requireNonNull(aheVar);
        if (this.statCase_ == 5 && this.stat_ != ahe.getDefaultInstance()) {
            ahd ahdVarNewBuilder = ahe.newBuilder((ahe) this.stat_);
            ahdVarNewBuilder.mergeFrom((ahd) aheVar);
            aheVar = ahdVarNewBuilder.buildPartial();
        }
        this.stat_ = aheVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQrCodeLoginShown(ate ateVar) {
        Objects.requireNonNull(ateVar);
        if (this.statCase_ == 3 && this.stat_ != ate.getDefaultInstance()) {
            atd atdVarNewBuilder = ate.newBuilder((ate) this.stat_);
            atdVarNewBuilder.mergeFrom((atd) ateVar);
            ateVar = atdVarNewBuilder.buildPartial();
        }
        this.stat_ = ateVar;
        this.statCase_ = 3;
    }

    public static bow newBuilder() {
        return (bow) DEFAULT_INSTANCE.createBuilder();
    }

    public static boy parseDelimitedFrom(InputStream inputStream) {
        return (boy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static boy parseFrom(com.google.v.v vVar) {
        return (boy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<boy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForceUpgradeMessageClicked(wy wyVar) {
        Objects.requireNonNull(wyVar);
        this.stat_ = wyVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForceUpgradeMessageReceived(xa xaVar) {
        Objects.requireNonNull(xaVar);
        this.stat_ = xaVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForceUpgradeMessageShown(xc xcVar) {
        Objects.requireNonNull(xcVar);
        this.stat_ = xcVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarLoginConfirmationScreenShown(ace aceVar) {
        Objects.requireNonNull(aceVar);
        this.stat_ = aceVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarLoginScreenClicked(ach achVar) {
        Objects.requireNonNull(achVar);
        this.stat_ = achVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarLoginScreenShown(acj acjVar) {
        Objects.requireNonNull(acjVar);
        this.stat_ = acjVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoginComplete(ahe aheVar) {
        Objects.requireNonNull(aheVar);
        this.stat_ = aheVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQrCodeLoginShown(ate ateVar) {
        Objects.requireNonNull(ateVar);
        this.stat_ = ateVar;
        this.statCase_ = 3;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"stat_", "statCase_", ach.class, acj.class, ate.class, ace.class, ahe.class, xa.class, xc.class, wy.class});
        }
        if (iOrdinal == 3) {
            return new boy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bow(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<boy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (boy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public wy getForceUpgradeMessageClicked() {
        return this.statCase_ == 8 ? (wy) this.stat_ : wy.getDefaultInstance();
    }

    public xa getForceUpgradeMessageReceived() {
        return this.statCase_ == 6 ? (xa) this.stat_ : xa.getDefaultInstance();
    }

    public xc getForceUpgradeMessageShown() {
        return this.statCase_ == 7 ? (xc) this.stat_ : xc.getDefaultInstance();
    }

    public ace getInCarLoginConfirmationScreenShown() {
        return this.statCase_ == 4 ? (ace) this.stat_ : ace.getDefaultInstance();
    }

    public ach getInCarLoginScreenClicked() {
        return this.statCase_ == 1 ? (ach) this.stat_ : ach.getDefaultInstance();
    }

    public acj getInCarLoginScreenShown() {
        return this.statCase_ == 2 ? (acj) this.stat_ : acj.getDefaultInstance();
    }

    public ahe getLoginComplete() {
        return this.statCase_ == 5 ? (ahe) this.stat_ : ahe.getDefaultInstance();
    }

    @Deprecated
    public ate getQrCodeLoginShown() {
        return this.statCase_ == 3 ? (ate) this.stat_ : ate.getDefaultInstance();
    }

    public box getStatCase() {
        switch (this.statCase_) {
            case 0:
                return box.f54445i;
            case 1:
                return box.f54437a;
            case 2:
                return box.f54438b;
            case 3:
                return box.f54439c;
            case 4:
                return box.f54440d;
            case 5:
                return box.f54441e;
            case 6:
                return box.f54442f;
            case 7:
                return box.f54443g;
            case 8:
                return box.f54444h;
            default:
                return null;
        }
    }

    public boolean hasForceUpgradeMessageClicked() {
        return this.statCase_ == 8;
    }

    public boolean hasForceUpgradeMessageReceived() {
        return this.statCase_ == 6;
    }

    public boolean hasForceUpgradeMessageShown() {
        return this.statCase_ == 7;
    }

    public boolean hasInCarLoginConfirmationScreenShown() {
        return this.statCase_ == 4;
    }

    public boolean hasInCarLoginScreenClicked() {
        return this.statCase_ == 1;
    }

    public boolean hasInCarLoginScreenShown() {
        return this.statCase_ == 2;
    }

    public boolean hasLoginComplete() {
        return this.statCase_ == 5;
    }

    @Deprecated
    public boolean hasQrCodeLoginShown() {
        return this.statCase_ == 3;
    }

    public static bow newBuilder(boy boyVar) {
        return (bow) DEFAULT_INSTANCE.createBuilder(boyVar);
    }

    public static boy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (boy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static boy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (boy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static boy parseFrom(com.google.v.z zVar) {
        return (boy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static boy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (boy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static boy parseFrom(InputStream inputStream) {
        return (boy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static boy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (boy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static boy parseFrom(ByteBuffer byteBuffer) {
        return (boy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static boy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (boy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static boy parseFrom(byte[] bArr) {
        return (boy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static boy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (boy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
