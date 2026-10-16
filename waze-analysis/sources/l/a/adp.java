package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class adp extends com.google.v.du<adp, adm> implements adq {
    public static final int ALERT_CARD_SOURCE_FIELD_NUMBER = 3;
    public static final int AVAILABLE_CLICK_OPTIONS_FIELD_NUMBER = 2;
    private static final adp DEFAULT_INSTANCE;
    public static final int FTE_CARD_SOURCE_FIELD_NUMBER = 7;
    public static final int INSIGHT_CARD_STATE_FIELD_NUMBER = 1;
    public static final int NOTIFICATION_CARD_SOURCE_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<adp> PARSER = null;
    public static final int SEGMENT_CARD_SOURCE_FIELD_NUMBER = 4;
    public static final int STREET_CARD_SOURCE_FIELD_NUMBER = 6;
    private static final com.google.v.el<adl> availableClickOptions_converter_ = new ve(6);
    private int availableClickOptionsMemoizedSerializedSize;
    private int insightCardState_;
    private Object insightInfo_;
    private int insightInfoCase_ = 0;
    private com.google.v.ek availableClickOptions_ = emptyIntList();

    static {
        adp adpVar = new adp();
        DEFAULT_INSTANCE = adpVar;
        com.google.v.du.registerDefaultInstance(adp.class, adpVar);
    }

    private adp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAvailableClickOptions(Iterable<? extends adl> iterable) {
        ensureAvailableClickOptionsIsMutable();
        Iterator<? extends adl> it = iterable.iterator();
        while (it.hasNext()) {
            this.availableClickOptions_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAvailableClickOptionsValue(Iterable<Integer> iterable) {
        ensureAvailableClickOptionsIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.availableClickOptions_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvailableClickOptions(adl adlVar) {
        Objects.requireNonNull(adlVar);
        ensureAvailableClickOptionsIsMutable();
        this.availableClickOptions_.i(adlVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvailableClickOptionsValue(int i2) {
        ensureAvailableClickOptionsIsMutable();
        this.availableClickOptions_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertCardSource() {
        if (this.insightInfoCase_ == 3) {
            this.insightInfoCase_ = 0;
            this.insightInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailableClickOptions() {
        this.availableClickOptions_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFteCardSource() {
        if (this.insightInfoCase_ == 7) {
            this.insightInfoCase_ = 0;
            this.insightInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightCardState() {
        this.insightCardState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightInfo() {
        this.insightInfoCase_ = 0;
        this.insightInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotificationCardSource() {
        if (this.insightInfoCase_ == 5) {
            this.insightInfoCase_ = 0;
            this.insightInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentCardSource() {
        if (this.insightInfoCase_ == 4) {
            this.insightInfoCase_ = 0;
            this.insightInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreetCardSource() {
        if (this.insightInfoCase_ == 6) {
            this.insightInfoCase_ = 0;
            this.insightInfo_ = null;
        }
    }

    private void ensureAvailableClickOptionsIsMutable() {
        com.google.v.ek ekVar = this.availableClickOptions_;
        if (ekVar.c()) {
            return;
        }
        this.availableClickOptions_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static adp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertCardSource(cb cbVar) {
        Objects.requireNonNull(cbVar);
        if (this.insightInfoCase_ == 3 && this.insightInfo_ != cb.getDefaultInstance()) {
            ca caVarNewBuilder = cb.newBuilder((cb) this.insightInfo_);
            caVarNewBuilder.mergeFrom((ca) cbVar);
            cbVar = caVarNewBuilder.buildPartial();
        }
        this.insightInfo_ = cbVar;
        this.insightInfoCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFteCardSource(xi xiVar) {
        Objects.requireNonNull(xiVar);
        if (this.insightInfoCase_ == 7 && this.insightInfo_ != xi.getDefaultInstance()) {
            xh xhVarNewBuilder = xi.newBuilder((xi) this.insightInfo_);
            xhVarNewBuilder.mergeFrom((xh) xiVar);
            xiVar = xhVarNewBuilder.buildPartial();
        }
        this.insightInfo_ = xiVar;
        this.insightInfoCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNotificationCardSource(anz anzVar) {
        Objects.requireNonNull(anzVar);
        if (this.insightInfoCase_ == 5 && this.insightInfo_ != anz.getDefaultInstance()) {
            anx anxVarNewBuilder = anz.newBuilder((anz) this.insightInfo_);
            anxVarNewBuilder.mergeFrom((anx) anzVar);
            anzVar = anxVarNewBuilder.buildPartial();
        }
        this.insightInfo_ = anzVar;
        this.insightInfoCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegmentCardSource(bab babVar) {
        Objects.requireNonNull(babVar);
        if (this.insightInfoCase_ == 4 && this.insightInfo_ != bab.getDefaultInstance()) {
            azz azzVarNewBuilder = bab.newBuilder((bab) this.insightInfo_);
            azzVarNewBuilder.mergeFrom((azz) babVar);
            babVar = azzVarNewBuilder.buildPartial();
        }
        this.insightInfo_ = babVar;
        this.insightInfoCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStreetCardSource(bgm bgmVar) {
        Objects.requireNonNull(bgmVar);
        if (this.insightInfoCase_ == 6 && this.insightInfo_ != bgm.getDefaultInstance()) {
            bgl bglVarNewBuilder = bgm.newBuilder((bgm) this.insightInfo_);
            bglVarNewBuilder.mergeFrom((bgl) bgmVar);
            bgmVar = bglVarNewBuilder.buildPartial();
        }
        this.insightInfo_ = bgmVar;
        this.insightInfoCase_ = 6;
    }

    public static adm newBuilder() {
        return (adm) DEFAULT_INSTANCE.createBuilder();
    }

    public static adp parseDelimitedFrom(InputStream inputStream) {
        return (adp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static adp parseFrom(com.google.v.v vVar) {
        return (adp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<adp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertCardSource(cb cbVar) {
        Objects.requireNonNull(cbVar);
        this.insightInfo_ = cbVar;
        this.insightInfoCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableClickOptions(int i2, adl adlVar) {
        Objects.requireNonNull(adlVar);
        ensureAvailableClickOptionsIsMutable();
        this.availableClickOptions_.e(i2, adlVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableClickOptionsValue(int i2, int i3) {
        ensureAvailableClickOptionsIsMutable();
        this.availableClickOptions_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFteCardSource(xi xiVar) {
        Objects.requireNonNull(xiVar);
        this.insightInfo_ = xiVar;
        this.insightInfoCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightCardState(adn adnVar) {
        this.insightCardState_ = adnVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightCardStateValue(int i2) {
        this.insightCardState_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotificationCardSource(anz anzVar) {
        Objects.requireNonNull(anzVar);
        this.insightInfo_ = anzVar;
        this.insightInfoCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentCardSource(bab babVar) {
        Objects.requireNonNull(babVar);
        this.insightInfo_ = babVar;
        this.insightInfoCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetCardSource(bgm bgmVar) {
        Objects.requireNonNull(bgmVar);
        this.insightInfo_ = bgmVar;
        this.insightInfoCase_ = 6;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\f\u0002,\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"insightInfo_", "insightInfoCase_", "insightCardState_", "availableClickOptions_", cb.class, bab.class, anz.class, bgm.class, xi.class});
        }
        if (iOrdinal == 3) {
            return new adp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new adm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<adp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (adp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public cb getAlertCardSource() {
        return this.insightInfoCase_ == 3 ? (cb) this.insightInfo_ : cb.getDefaultInstance();
    }

    public adl getAvailableClickOptions(int i2) {
        adl adlVarA = adl.a(this.availableClickOptions_.d(i2));
        return adlVarA == null ? adl.UNRECOGNIZED : adlVarA;
    }

    public int getAvailableClickOptionsCount() {
        return this.availableClickOptions_.size();
    }

    public List<adl> getAvailableClickOptionsList() {
        return new com.google.v.em(this.availableClickOptions_, availableClickOptions_converter_);
    }

    public int getAvailableClickOptionsValue(int i2) {
        return this.availableClickOptions_.d(i2);
    }

    public List<Integer> getAvailableClickOptionsValueList() {
        return this.availableClickOptions_;
    }

    public xi getFteCardSource() {
        return this.insightInfoCase_ == 7 ? (xi) this.insightInfo_ : xi.getDefaultInstance();
    }

    public adn getInsightCardState() {
        adn adnVar;
        switch (this.insightCardState_) {
            case 0:
                adnVar = adn.INSIGHT_CARD_STATE_UNSPECIFIED;
                break;
            case 1:
                adnVar = adn.MINI;
                break;
            case 2:
                adnVar = adn.MINI_FULL;
                break;
            case 3:
                adnVar = adn.REGULAR;
                break;
            case 4:
                adnVar = adn.EXTENDED;
                break;
            case 5:
                adnVar = adn.HIDDEN;
                break;
            case 6:
                adnVar = adn.REMOVED;
                break;
            case 7:
                adnVar = adn.LABEL;
                break;
            case 8:
                adnVar = adn.COMPACT;
                break;
            case 9:
                adnVar = adn.TEMPLATE;
                break;
            default:
                adnVar = null;
                break;
        }
        return adnVar == null ? adn.UNRECOGNIZED : adnVar;
    }

    public int getInsightCardStateValue() {
        return this.insightCardState_;
    }

    public ado getInsightInfoCase() {
        int i2 = this.insightInfoCase_;
        if (i2 == 0) {
            return ado.f52292f;
        }
        if (i2 == 3) {
            return ado.f52287a;
        }
        if (i2 == 4) {
            return ado.f52288b;
        }
        if (i2 == 5) {
            return ado.f52289c;
        }
        if (i2 == 6) {
            return ado.f52290d;
        }
        if (i2 != 7) {
            return null;
        }
        return ado.f52291e;
    }

    public anz getNotificationCardSource() {
        return this.insightInfoCase_ == 5 ? (anz) this.insightInfo_ : anz.getDefaultInstance();
    }

    public bab getSegmentCardSource() {
        return this.insightInfoCase_ == 4 ? (bab) this.insightInfo_ : bab.getDefaultInstance();
    }

    public bgm getStreetCardSource() {
        return this.insightInfoCase_ == 6 ? (bgm) this.insightInfo_ : bgm.getDefaultInstance();
    }

    public boolean hasAlertCardSource() {
        return this.insightInfoCase_ == 3;
    }

    public boolean hasFteCardSource() {
        return this.insightInfoCase_ == 7;
    }

    public boolean hasNotificationCardSource() {
        return this.insightInfoCase_ == 5;
    }

    public boolean hasSegmentCardSource() {
        return this.insightInfoCase_ == 4;
    }

    public boolean hasStreetCardSource() {
        return this.insightInfoCase_ == 6;
    }

    public static adm newBuilder(adp adpVar) {
        return (adm) DEFAULT_INSTANCE.createBuilder(adpVar);
    }

    public static adp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (adp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static adp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (adp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static adp parseFrom(com.google.v.z zVar) {
        return (adp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static adp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (adp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static adp parseFrom(InputStream inputStream) {
        return (adp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static adp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (adp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static adp parseFrom(ByteBuffer byteBuffer) {
        return (adp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static adp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (adp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static adp parseFrom(byte[] bArr) {
        return (adp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static adp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (adp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
