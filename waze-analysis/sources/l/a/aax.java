package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aax extends com.google.v.du<aax, aav> implements com.google.v.fj {
    public static final int DEAD_RECKONING_FIELD_NUMBER = 2;
    private static final aax DEFAULT_INSTANCE;
    public static final int FUTURE_PATH_FOLLOWER_FIELD_NUMBER = 4;
    public static final int GPS_QUALITY_FIELD_NUMBER = 3;
    public static final int GPS_RECEPTION_FIELD_NUMBER = 1;
    public static final int GPS_SOURCE_CHANGED_FIELD_NUMBER = 5;
    public static final int LOCATION_ISSUE_DETECTED_FIELD_NUMBER = 8;
    private static volatile com.google.v.fo<aax> PARSER = null;
    public static final int TOP_BAR_GPS_ERROR_MESSAGE_REMOVED_FIELD_NUMBER = 6;
    public static final int TOP_BAR_GPS_ERROR_MESSAGE_SHOWN_FIELD_NUMBER = 7;
    private int statCase_ = 0;
    private Object stat_;

    static {
        aax aaxVar = new aax();
        DEFAULT_INSTANCE = aaxVar;
        com.google.v.du.registerDefaultInstance(aax.class, aaxVar);
    }

    private aax() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeadReckoning() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFuturePathFollower() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGpsQuality() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGpsReception() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGpsSourceChanged() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationIssueDetected() {
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
    public void clearTopBarGpsErrorMessageRemoved() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopBarGpsErrorMessageShown() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static aax getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeadReckoning(pp ppVar) {
        Objects.requireNonNull(ppVar);
        if (this.statCase_ == 2 && this.stat_ != pp.getDefaultInstance()) {
            po poVarNewBuilder = pp.newBuilder((pp) this.stat_);
            poVarNewBuilder.mergeFrom((po) ppVar);
            ppVar = poVarNewBuilder.buildPartial();
        }
        this.stat_ = ppVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFuturePathFollower(xk xkVar) {
        Objects.requireNonNull(xkVar);
        if (this.statCase_ == 4 && this.stat_ != xk.getDefaultInstance()) {
            xj xjVarNewBuilder = xk.newBuilder((xk) this.stat_);
            xjVarNewBuilder.mergeFrom((xj) xkVar);
            xkVar = xjVarNewBuilder.buildPartial();
        }
        this.stat_ = xkVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGpsQuality(aao aaoVar) {
        Objects.requireNonNull(aaoVar);
        if (this.statCase_ == 3 && this.stat_ != aao.getDefaultInstance()) {
            aan aanVarNewBuilder = aao.newBuilder((aao) this.stat_);
            aanVarNewBuilder.mergeFrom((aan) aaoVar);
            aaoVar = aanVarNewBuilder.buildPartial();
        }
        this.stat_ = aaoVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGpsReception(aar aarVar) {
        Objects.requireNonNull(aarVar);
        if (this.statCase_ == 1 && this.stat_ != aar.getDefaultInstance()) {
            aap aapVarNewBuilder = aar.newBuilder((aar) this.stat_);
            aapVarNewBuilder.mergeFrom((aap) aarVar);
            aarVar = aapVarNewBuilder.buildPartial();
        }
        this.stat_ = aarVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGpsSourceChanged(aau aauVar) {
        Objects.requireNonNull(aauVar);
        if (this.statCase_ == 5 && this.stat_ != aau.getDefaultInstance()) {
            aas aasVarNewBuilder = aau.newBuilder((aau) this.stat_);
            aasVarNewBuilder.mergeFrom((aas) aauVar);
            aauVar = aasVarNewBuilder.buildPartial();
        }
        this.stat_ = aauVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocationIssueDetected(agp agpVar) {
        Objects.requireNonNull(agpVar);
        if (this.statCase_ == 8 && this.stat_ != agp.getDefaultInstance()) {
            agn agnVarNewBuilder = agp.newBuilder((agp) this.stat_);
            agnVarNewBuilder.mergeFrom((agn) agpVar);
            agpVar = agnVarNewBuilder.buildPartial();
        }
        this.stat_ = agpVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTopBarGpsErrorMessageRemoved(bjg bjgVar) {
        Objects.requireNonNull(bjgVar);
        if (this.statCase_ == 6 && this.stat_ != bjg.getDefaultInstance()) {
            bjf bjfVarNewBuilder = bjg.newBuilder((bjg) this.stat_);
            bjfVarNewBuilder.mergeFrom((bjf) bjgVar);
            bjgVar = bjfVarNewBuilder.buildPartial();
        }
        this.stat_ = bjgVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTopBarGpsErrorMessageShown(bji bjiVar) {
        Objects.requireNonNull(bjiVar);
        if (this.statCase_ == 7 && this.stat_ != bji.getDefaultInstance()) {
            bjh bjhVarNewBuilder = bji.newBuilder((bji) this.stat_);
            bjhVarNewBuilder.mergeFrom((bjh) bjiVar);
            bjiVar = bjhVarNewBuilder.buildPartial();
        }
        this.stat_ = bjiVar;
        this.statCase_ = 7;
    }

    public static aav newBuilder() {
        return (aav) DEFAULT_INSTANCE.createBuilder();
    }

    public static aax parseDelimitedFrom(InputStream inputStream) {
        return (aax) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aax parseFrom(com.google.v.v vVar) {
        return (aax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aax> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeadReckoning(pp ppVar) {
        Objects.requireNonNull(ppVar);
        this.stat_ = ppVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFuturePathFollower(xk xkVar) {
        Objects.requireNonNull(xkVar);
        this.stat_ = xkVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGpsQuality(aao aaoVar) {
        Objects.requireNonNull(aaoVar);
        this.stat_ = aaoVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGpsReception(aar aarVar) {
        Objects.requireNonNull(aarVar);
        this.stat_ = aarVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGpsSourceChanged(aau aauVar) {
        Objects.requireNonNull(aauVar);
        this.stat_ = aauVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationIssueDetected(agp agpVar) {
        Objects.requireNonNull(agpVar);
        this.stat_ = agpVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopBarGpsErrorMessageRemoved(bjg bjgVar) {
        Objects.requireNonNull(bjgVar);
        this.stat_ = bjgVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopBarGpsErrorMessageShown(bji bjiVar) {
        Objects.requireNonNull(bjiVar);
        this.stat_ = bjiVar;
        this.statCase_ = 7;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"stat_", "statCase_", aar.class, pp.class, aao.class, xk.class, aau.class, bjg.class, bji.class, agp.class});
        }
        if (iOrdinal == 3) {
            return new aax();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aav(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aax> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aax.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public pp getDeadReckoning() {
        return this.statCase_ == 2 ? (pp) this.stat_ : pp.getDefaultInstance();
    }

    public xk getFuturePathFollower() {
        return this.statCase_ == 4 ? (xk) this.stat_ : xk.getDefaultInstance();
    }

    public aao getGpsQuality() {
        return this.statCase_ == 3 ? (aao) this.stat_ : aao.getDefaultInstance();
    }

    public aar getGpsReception() {
        return this.statCase_ == 1 ? (aar) this.stat_ : aar.getDefaultInstance();
    }

    public aau getGpsSourceChanged() {
        return this.statCase_ == 5 ? (aau) this.stat_ : aau.getDefaultInstance();
    }

    public agp getLocationIssueDetected() {
        return this.statCase_ == 8 ? (agp) this.stat_ : agp.getDefaultInstance();
    }

    public aaw getStatCase() {
        switch (this.statCase_) {
            case 0:
                return aaw.f52124i;
            case 1:
                return aaw.f52116a;
            case 2:
                return aaw.f52117b;
            case 3:
                return aaw.f52118c;
            case 4:
                return aaw.f52119d;
            case 5:
                return aaw.f52120e;
            case 6:
                return aaw.f52121f;
            case 7:
                return aaw.f52122g;
            case 8:
                return aaw.f52123h;
            default:
                return null;
        }
    }

    public bjg getTopBarGpsErrorMessageRemoved() {
        return this.statCase_ == 6 ? (bjg) this.stat_ : bjg.getDefaultInstance();
    }

    public bji getTopBarGpsErrorMessageShown() {
        return this.statCase_ == 7 ? (bji) this.stat_ : bji.getDefaultInstance();
    }

    public boolean hasDeadReckoning() {
        return this.statCase_ == 2;
    }

    public boolean hasFuturePathFollower() {
        return this.statCase_ == 4;
    }

    public boolean hasGpsQuality() {
        return this.statCase_ == 3;
    }

    public boolean hasGpsReception() {
        return this.statCase_ == 1;
    }

    public boolean hasGpsSourceChanged() {
        return this.statCase_ == 5;
    }

    public boolean hasLocationIssueDetected() {
        return this.statCase_ == 8;
    }

    public boolean hasTopBarGpsErrorMessageRemoved() {
        return this.statCase_ == 6;
    }

    public boolean hasTopBarGpsErrorMessageShown() {
        return this.statCase_ == 7;
    }

    public static aav newBuilder(aax aaxVar) {
        return (aav) DEFAULT_INSTANCE.createBuilder(aaxVar);
    }

    public static aax parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aax) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aax parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aax parseFrom(com.google.v.z zVar) {
        return (aax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aax parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aax parseFrom(InputStream inputStream) {
        return (aax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aax parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aax parseFrom(ByteBuffer byteBuffer) {
        return (aax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aax parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aax parseFrom(byte[] bArr) {
        return (aax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aax parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
