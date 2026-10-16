package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class adj extends com.google.v.du<adj, adh> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final adj DEFAULT_INSTANCE;
    public static final int INSIGHT_CARD_INFO_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<adj> PARSER = null;
    public static final int PLATFORM_SOURCE_FIELD_NUMBER = 3;
    private int action_;
    private int bitField0_;
    private adp insightCardInfo_;
    private int platformSource_;

    static {
        adj adjVar = new adj();
        DEFAULT_INSTANCE = adjVar;
        com.google.v.du.registerDefaultInstance(adj.class, adjVar);
    }

    private adj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightCardInfo() {
        this.insightCardInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlatformSource() {
        this.platformSource_ = 0;
    }

    public static adj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightCardInfo(adp adpVar) {
        Objects.requireNonNull(adpVar);
        adp adpVar2 = this.insightCardInfo_;
        if (adpVar2 != null && adpVar2 != adp.getDefaultInstance()) {
            adm admVarNewBuilder = adp.newBuilder(adpVar2);
            admVarNewBuilder.mergeFrom((adm) adpVar);
            adpVar = admVarNewBuilder.buildPartial();
        }
        this.insightCardInfo_ = adpVar;
        this.bitField0_ |= 1;
    }

    public static adh newBuilder() {
        return (adh) DEFAULT_INSTANCE.createBuilder();
    }

    public static adj parseDelimitedFrom(InputStream inputStream) {
        return (adj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static adj parseFrom(com.google.v.v vVar) {
        return (adj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<adj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(adg adgVar) {
        this.action_ = adgVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightCardInfo(adp adpVar) {
        Objects.requireNonNull(adpVar);
        this.insightCardInfo_ = adpVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformSource(adi adiVar) {
        this.platformSource_ = adiVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformSourceValue(int i2) {
        this.platformSource_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\f", new Object[]{"bitField0_", "insightCardInfo_", "action_", "platformSource_"});
        }
        if (iOrdinal == 3) {
            return new adj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new adh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<adj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (adj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public adg getAction() {
        adg adgVar;
        switch (this.action_) {
            case 0:
                adgVar = adg.ACTION_UNSPECIFIED;
                break;
            case 1:
                adgVar = adg.PRIMARY_BUTTON;
                break;
            case 2:
                adgVar = adg.SECONDARY_BUTTON;
                break;
            case 3:
                adgVar = adg.CLOSE;
                break;
            case 4:
                adgVar = adg.GENERAL_CARD_TAP;
                break;
            case 5:
                adgVar = adg.EMPTY_MAP_CLICK;
                break;
            case 6:
                adgVar = adg.BACK_CLICK;
                break;
            case 7:
                adgVar = adg.TIMEOUT;
                break;
            case 8:
                adgVar = adg.SYSTEM_DISMISSED;
                break;
            case 9:
                adgVar = adg.FAILED_TO_PRESENT;
                break;
            default:
                adgVar = null;
                break;
        }
        return adgVar == null ? adg.UNRECOGNIZED : adgVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public adp getInsightCardInfo() {
        adp adpVar = this.insightCardInfo_;
        return adpVar == null ? adp.getDefaultInstance() : adpVar;
    }

    public adi getPlatformSource() {
        adi adiVar;
        switch (this.platformSource_) {
            case 0:
                adiVar = adi.PLATFORM_SOURCE_UNSPECIFIED;
                break;
            case 1:
                adiVar = adi.MOBILE;
                break;
            case 2:
                adiVar = adi.CARPLAY;
                break;
            case 3:
                adiVar = adi.DASHBOARD_MODE;
                break;
            case 4:
                adiVar = adi.AAOS;
                break;
            case 5:
                adiVar = adi.AAP;
                break;
            case 6:
                adiVar = adi.COOLWALK;
                break;
            default:
                adiVar = null;
                break;
        }
        return adiVar == null ? adi.UNRECOGNIZED : adiVar;
    }

    public int getPlatformSourceValue() {
        return this.platformSource_;
    }

    public boolean hasInsightCardInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static adh newBuilder(adj adjVar) {
        return (adh) DEFAULT_INSTANCE.createBuilder(adjVar);
    }

    public static adj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (adj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static adj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (adj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static adj parseFrom(com.google.v.z zVar) {
        return (adj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static adj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (adj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static adj parseFrom(InputStream inputStream) {
        return (adj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static adj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (adj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static adj parseFrom(ByteBuffer byteBuffer) {
        return (adj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static adj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (adj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static adj parseFrom(byte[] bArr) {
        return (adj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static adj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (adj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
