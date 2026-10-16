package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class af extends com.google.v.du<af, ad> implements com.google.v.fj {
    public static final int ALTERNATIVE_ROUTES_FIELD_NUMBER = 3;
    private static final af DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<af> PARSER = null;
    public static final int ROUTING_UPDATE_FIELD_NUMBER = 1;
    public static final int SILENT_REROUTE_SUGGESTION_FIELD_NUMBER = 2;
    private ps alternativeRoutes_;
    private int bitField0_;
    private Object currentRoute_;
    private int currentRouteCase_ = 0;
    private byte memoizedIsInitialized = 2;

    static {
        af afVar = new af();
        DEFAULT_INSTANCE = afVar;
        com.google.v.du.registerDefaultInstance(af.class, afVar);
    }

    private af() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRoutes() {
        this.alternativeRoutes_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentRoute() {
        this.currentRouteCase_ = 0;
        this.currentRoute_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingUpdate() {
        if (this.currentRouteCase_ == 1) {
            this.currentRouteCase_ = 0;
            this.currentRoute_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSilentRerouteSuggestion() {
        if (this.currentRouteCase_ == 2) {
            this.currentRouteCase_ = 0;
            this.currentRoute_ = null;
        }
    }

    public static af getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlternativeRoutes(ps psVar) {
        Objects.requireNonNull(psVar);
        ps psVar2 = this.alternativeRoutes_;
        if (psVar2 != null && psVar2 != ps.getDefaultInstance()) {
            pr prVarNewBuilder = ps.newBuilder(psVar2);
            prVarNewBuilder.mergeFrom((pr) psVar);
            psVar = prVarNewBuilder.buildPartial();
        }
        this.alternativeRoutes_ = psVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoutingUpdate(pw pwVar) {
        Objects.requireNonNull(pwVar);
        if (this.currentRouteCase_ == 1 && this.currentRoute_ != pw.getDefaultInstance()) {
            pv pvVarNewBuilder = pw.newBuilder((pw) this.currentRoute_);
            pvVarNewBuilder.mergeFrom((pv) pwVar);
            pwVar = pvVarNewBuilder.buildPartial();
        }
        this.currentRoute_ = pwVar;
        this.currentRouteCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSilentRerouteSuggestion(qg qgVar) {
        Objects.requireNonNull(qgVar);
        if (this.currentRouteCase_ == 2 && this.currentRoute_ != qg.getDefaultInstance()) {
            qf qfVarNewBuilder = qg.newBuilder((qg) this.currentRoute_);
            qfVarNewBuilder.mergeFrom((qf) qgVar);
            qgVar = qfVarNewBuilder.buildPartial();
        }
        this.currentRoute_ = qgVar;
        this.currentRouteCase_ = 2;
    }

    public static ad newBuilder() {
        return (ad) DEFAULT_INSTANCE.createBuilder();
    }

    public static af parseDelimitedFrom(InputStream inputStream) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(com.google.v.v vVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<af> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRoutes(ps psVar) {
        Objects.requireNonNull(psVar);
        this.alternativeRoutes_ = psVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingUpdate(pw pwVar) {
        Objects.requireNonNull(pwVar);
        this.currentRoute_ = pwVar;
        this.currentRouteCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSilentRerouteSuggestion(qg qgVar) {
        Objects.requireNonNull(qgVar);
        this.currentRoute_ = qgVar;
        this.currentRouteCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001м\u0000\u0002м\u0000\u0003ᐉ\u0000", new Object[]{"currentRoute_", "currentRouteCase_", "bitField0_", pw.class, qg.class, "alternativeRoutes_"});
            case 3:
                return new af();
            case 4:
                return new ad(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<af> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (af.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public ps getAlternativeRoutes() {
        ps psVar = this.alternativeRoutes_;
        return psVar == null ? ps.getDefaultInstance() : psVar;
    }

    public ae getCurrentRouteCase() {
        int i2 = this.currentRouteCase_;
        if (i2 == 0) {
            return ae.f48568c;
        }
        if (i2 == 1) {
            return ae.f48566a;
        }
        if (i2 != 2) {
            return null;
        }
        return ae.f48567b;
    }

    public pw getRoutingUpdate() {
        return this.currentRouteCase_ == 1 ? (pw) this.currentRoute_ : pw.getDefaultInstance();
    }

    public qg getSilentRerouteSuggestion() {
        return this.currentRouteCase_ == 2 ? (qg) this.currentRoute_ : qg.getDefaultInstance();
    }

    public boolean hasAlternativeRoutes() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRoutingUpdate() {
        return this.currentRouteCase_ == 1;
    }

    public boolean hasSilentRerouteSuggestion() {
        return this.currentRouteCase_ == 2;
    }

    public static ad newBuilder(af afVar) {
        return (ad) DEFAULT_INSTANCE.createBuilder(afVar);
    }

    public static af parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static af parseFrom(com.google.v.z zVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static af parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static af parseFrom(InputStream inputStream) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(ByteBuffer byteBuffer) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static af parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static af parseFrom(byte[] bArr) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static af parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
