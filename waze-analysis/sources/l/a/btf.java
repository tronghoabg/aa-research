package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class btf extends com.google.v.du<btf, btd> implements com.google.v.fj {
    private static final btf DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<btf> PARSER = null;
    public static final int PRODUCT_TAKEOVERS_RECEIVED_FIELD_NUMBER = 8;
    public static final int PRODUCT_TAKEOVER_CAN_BE_SHOWN_FIELD_NUMBER = 9;
    public static final int PRODUCT_TAKEOVER_CLICKED_FIELD_NUMBER = 1;
    public static final int PRODUCT_TAKEOVER_CLOSED_FIELD_NUMBER = 7;
    public static final int PRODUCT_TAKEOVER_HIDDEN_FIELD_NUMBER = 6;
    public static final int PRODUCT_TAKEOVER_REQUESTED_FIELD_NUMBER = 10;
    public static final int PRODUCT_TAKEOVER_SHOWN_FIELD_NUMBER = 2;
    public static final int ZERO_SPEED_ENDED_FIELD_NUMBER = 3;
    public static final int ZERO_SPEED_STARTED_FIELD_NUMBER = 5;
    public static final int ZERO_SPEED_START_DRIVE_FIELD_NUMBER = 4;
    private int statCase_ = 0;
    private Object stat_;

    static {
        btf btfVar = new btf();
        DEFAULT_INSTANCE = btfVar;
        com.google.v.du.registerDefaultInstance(btf.class, btfVar);
    }

    private btf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductTakeoverCanBeShown() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductTakeoverClicked() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductTakeoverClosed() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductTakeoverHidden() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductTakeoverRequested() {
        if (this.statCase_ == 10) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductTakeoverShown() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductTakeoversReceived() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZeroSpeedEnded() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZeroSpeedStartDrive() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZeroSpeedStarted() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static btf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProductTakeoverCanBeShown(arh arhVar) {
        Objects.requireNonNull(arhVar);
        if (this.statCase_ == 9 && this.stat_ != arh.getDefaultInstance()) {
            arg argVarNewBuilder = arh.newBuilder((arh) this.stat_);
            argVarNewBuilder.mergeFrom((arg) arhVar);
            arhVar = argVarNewBuilder.buildPartial();
        }
        this.stat_ = arhVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProductTakeoverClicked(ark arkVar) {
        Objects.requireNonNull(arkVar);
        if (this.statCase_ == 1 && this.stat_ != ark.getDefaultInstance()) {
            arj arjVarNewBuilder = ark.newBuilder((ark) this.stat_);
            arjVarNewBuilder.mergeFrom((arj) arkVar);
            arkVar = arjVarNewBuilder.buildPartial();
        }
        this.stat_ = arkVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProductTakeoverClosed(arn arnVar) {
        Objects.requireNonNull(arnVar);
        if (this.statCase_ == 7 && this.stat_ != arn.getDefaultInstance()) {
            arl arlVarNewBuilder = arn.newBuilder((arn) this.stat_);
            arlVarNewBuilder.mergeFrom((arl) arnVar);
            arnVar = arlVarNewBuilder.buildPartial();
        }
        this.stat_ = arnVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProductTakeoverHidden(arp arpVar) {
        Objects.requireNonNull(arpVar);
        if (this.statCase_ == 6 && this.stat_ != arp.getDefaultInstance()) {
            aro aroVarNewBuilder = arp.newBuilder((arp) this.stat_);
            aroVarNewBuilder.mergeFrom((aro) arpVar);
            arpVar = aroVarNewBuilder.buildPartial();
        }
        this.stat_ = arpVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProductTakeoverRequested(aru aruVar) {
        Objects.requireNonNull(aruVar);
        if (this.statCase_ == 10 && this.stat_ != aru.getDefaultInstance()) {
            art artVarNewBuilder = aru.newBuilder((aru) this.stat_);
            artVarNewBuilder.mergeFrom((art) aruVar);
            aruVar = artVarNewBuilder.buildPartial();
        }
        this.stat_ = aruVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProductTakeoverShown(arw arwVar) {
        Objects.requireNonNull(arwVar);
        if (this.statCase_ == 2 && this.stat_ != arw.getDefaultInstance()) {
            arv arvVarNewBuilder = arw.newBuilder((arw) this.stat_);
            arvVarNewBuilder.mergeFrom((arv) arwVar);
            arwVar = arvVarNewBuilder.buildPartial();
        }
        this.stat_ = arwVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProductTakeoversReceived(arz arzVar) {
        Objects.requireNonNull(arzVar);
        if (this.statCase_ == 8 && this.stat_ != arz.getDefaultInstance()) {
            ary aryVarNewBuilder = arz.newBuilder((arz) this.stat_);
            aryVarNewBuilder.mergeFrom((ary) arzVar);
            arzVar = aryVarNewBuilder.buildPartial();
        }
        this.stat_ = arzVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeZeroSpeedEnded(bsy bsyVar) {
        Objects.requireNonNull(bsyVar);
        if (this.statCase_ == 3 && this.stat_ != bsy.getDefaultInstance()) {
            bsx bsxVarNewBuilder = bsy.newBuilder((bsy) this.stat_);
            bsxVarNewBuilder.mergeFrom((bsx) bsyVar);
            bsyVar = bsxVarNewBuilder.buildPartial();
        }
        this.stat_ = bsyVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeZeroSpeedStartDrive(bta btaVar) {
        Objects.requireNonNull(btaVar);
        if (this.statCase_ == 4 && this.stat_ != bta.getDefaultInstance()) {
            bsz bszVarNewBuilder = bta.newBuilder((bta) this.stat_);
            bszVarNewBuilder.mergeFrom((bsz) btaVar);
            btaVar = bszVarNewBuilder.buildPartial();
        }
        this.stat_ = btaVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeZeroSpeedStarted(btc btcVar) {
        Objects.requireNonNull(btcVar);
        if (this.statCase_ == 5 && this.stat_ != btc.getDefaultInstance()) {
            btb btbVarNewBuilder = btc.newBuilder((btc) this.stat_);
            btbVarNewBuilder.mergeFrom((btb) btcVar);
            btcVar = btbVarNewBuilder.buildPartial();
        }
        this.stat_ = btcVar;
        this.statCase_ = 5;
    }

    public static btd newBuilder() {
        return (btd) DEFAULT_INSTANCE.createBuilder();
    }

    public static btf parseDelimitedFrom(InputStream inputStream) {
        return (btf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static btf parseFrom(com.google.v.v vVar) {
        return (btf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<btf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductTakeoverCanBeShown(arh arhVar) {
        Objects.requireNonNull(arhVar);
        this.stat_ = arhVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductTakeoverClicked(ark arkVar) {
        Objects.requireNonNull(arkVar);
        this.stat_ = arkVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductTakeoverClosed(arn arnVar) {
        Objects.requireNonNull(arnVar);
        this.stat_ = arnVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductTakeoverHidden(arp arpVar) {
        Objects.requireNonNull(arpVar);
        this.stat_ = arpVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductTakeoverRequested(aru aruVar) {
        Objects.requireNonNull(aruVar);
        this.stat_ = aruVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductTakeoverShown(arw arwVar) {
        Objects.requireNonNull(arwVar);
        this.stat_ = arwVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductTakeoversReceived(arz arzVar) {
        Objects.requireNonNull(arzVar);
        this.stat_ = arzVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZeroSpeedEnded(bsy bsyVar) {
        Objects.requireNonNull(bsyVar);
        this.stat_ = bsyVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZeroSpeedStartDrive(bta btaVar) {
        Objects.requireNonNull(btaVar);
        this.stat_ = btaVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZeroSpeedStarted(btc btcVar) {
        Objects.requireNonNull(btcVar);
        this.stat_ = btcVar;
        this.statCase_ = 5;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"stat_", "statCase_", ark.class, arw.class, bsy.class, bta.class, btc.class, arp.class, arn.class, arz.class, arh.class, aru.class});
        }
        if (iOrdinal == 3) {
            return new btf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new btd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<btf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (btf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public arh getProductTakeoverCanBeShown() {
        return this.statCase_ == 9 ? (arh) this.stat_ : arh.getDefaultInstance();
    }

    public ark getProductTakeoverClicked() {
        return this.statCase_ == 1 ? (ark) this.stat_ : ark.getDefaultInstance();
    }

    public arn getProductTakeoverClosed() {
        return this.statCase_ == 7 ? (arn) this.stat_ : arn.getDefaultInstance();
    }

    public arp getProductTakeoverHidden() {
        return this.statCase_ == 6 ? (arp) this.stat_ : arp.getDefaultInstance();
    }

    public aru getProductTakeoverRequested() {
        return this.statCase_ == 10 ? (aru) this.stat_ : aru.getDefaultInstance();
    }

    public arw getProductTakeoverShown() {
        return this.statCase_ == 2 ? (arw) this.stat_ : arw.getDefaultInstance();
    }

    public arz getProductTakeoversReceived() {
        return this.statCase_ == 8 ? (arz) this.stat_ : arz.getDefaultInstance();
    }

    public bte getStatCase() {
        switch (this.statCase_) {
            case 0:
                return bte.f54653k;
            case 1:
                return bte.f54643a;
            case 2:
                return bte.f54644b;
            case 3:
                return bte.f54645c;
            case 4:
                return bte.f54646d;
            case 5:
                return bte.f54647e;
            case 6:
                return bte.f54648f;
            case 7:
                return bte.f54649g;
            case 8:
                return bte.f54650h;
            case 9:
                return bte.f54651i;
            case 10:
                return bte.f54652j;
            default:
                return null;
        }
    }

    public bsy getZeroSpeedEnded() {
        return this.statCase_ == 3 ? (bsy) this.stat_ : bsy.getDefaultInstance();
    }

    public bta getZeroSpeedStartDrive() {
        return this.statCase_ == 4 ? (bta) this.stat_ : bta.getDefaultInstance();
    }

    public btc getZeroSpeedStarted() {
        return this.statCase_ == 5 ? (btc) this.stat_ : btc.getDefaultInstance();
    }

    public boolean hasProductTakeoverCanBeShown() {
        return this.statCase_ == 9;
    }

    public boolean hasProductTakeoverClicked() {
        return this.statCase_ == 1;
    }

    public boolean hasProductTakeoverClosed() {
        return this.statCase_ == 7;
    }

    public boolean hasProductTakeoverHidden() {
        return this.statCase_ == 6;
    }

    public boolean hasProductTakeoverRequested() {
        return this.statCase_ == 10;
    }

    public boolean hasProductTakeoverShown() {
        return this.statCase_ == 2;
    }

    public boolean hasProductTakeoversReceived() {
        return this.statCase_ == 8;
    }

    public boolean hasZeroSpeedEnded() {
        return this.statCase_ == 3;
    }

    public boolean hasZeroSpeedStartDrive() {
        return this.statCase_ == 4;
    }

    public boolean hasZeroSpeedStarted() {
        return this.statCase_ == 5;
    }

    public static btd newBuilder(btf btfVar) {
        return (btd) DEFAULT_INSTANCE.createBuilder(btfVar);
    }

    public static btf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (btf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static btf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (btf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static btf parseFrom(com.google.v.z zVar) {
        return (btf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static btf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (btf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static btf parseFrom(InputStream inputStream) {
        return (btf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static btf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (btf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static btf parseFrom(ByteBuffer byteBuffer) {
        return (btf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static btf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (btf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static btf parseFrom(byte[] bArr) {
        return (btf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static btf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (btf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
