package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ps extends com.google.v.du<ps, pq> implements com.google.v.fj {
    public static final int APP_OPENED_VIA_DEEP_LINK_FIELD_NUMBER = 2;
    public static final int APP_VERSION_OUTDATED_POPUP_CLICKED_FIELD_NUMBER = 5;
    public static final int APP_VERSION_OUTDATED_POPUP_SHOWN_FIELD_NUMBER = 4;
    private static final ps DEFAULT_INSTANCE;
    public static final int LAUNCHED_FROM_APP_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ps> PARSER = null;
    public static final int SDK_CONNECTION_MADE_FIELD_NUMBER = 3;
    private int statCase_ = 0;
    private Object stat_;

    static {
        ps psVar = new ps();
        DEFAULT_INSTANCE = psVar;
        com.google.v.du.registerDefaultInstance(ps.class, psVar);
    }

    private ps() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppOpenedViaDeepLink() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppVersionOutdatedPopupClicked() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppVersionOutdatedPopupShown() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaunchedFromApp() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkConnectionMade() {
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

    public static ps getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppOpenedViaDeepLink(fd fdVar) {
        Objects.requireNonNull(fdVar);
        if (this.statCase_ == 2 && this.stat_ != fd.getDefaultInstance()) {
            fc fcVarNewBuilder = fd.newBuilder((fd) this.stat_);
            fcVarNewBuilder.mergeFrom((fc) fdVar);
            fdVar = fcVarNewBuilder.buildPartial();
        }
        this.stat_ = fdVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppVersionOutdatedPopupClicked(fp fpVar) {
        Objects.requireNonNull(fpVar);
        if (this.statCase_ == 5 && this.stat_ != fp.getDefaultInstance()) {
            fo foVarNewBuilder = fp.newBuilder((fp) this.stat_);
            foVarNewBuilder.mergeFrom((fo) fpVar);
            fpVar = foVarNewBuilder.buildPartial();
        }
        this.stat_ = fpVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppVersionOutdatedPopupShown(fr frVar) {
        Objects.requireNonNull(frVar);
        if (this.statCase_ == 4 && this.stat_ != fr.getDefaultInstance()) {
            fq fqVarNewBuilder = fr.newBuilder((fr) this.stat_);
            fqVarNewBuilder.mergeFrom((fq) frVar);
            frVar = fqVarNewBuilder.buildPartial();
        }
        this.stat_ = frVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLaunchedFromApp(aga agaVar) {
        Objects.requireNonNull(agaVar);
        if (this.statCase_ == 1 && this.stat_ != aga.getDefaultInstance()) {
            afy afyVarNewBuilder = aga.newBuilder((aga) this.stat_);
            afyVarNewBuilder.mergeFrom((afy) agaVar);
            agaVar = afyVarNewBuilder.buildPartial();
        }
        this.stat_ = agaVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSdkConnectionMade(axu axuVar) {
        Objects.requireNonNull(axuVar);
        if (this.statCase_ == 3 && this.stat_ != axu.getDefaultInstance()) {
            axt axtVarNewBuilder = axu.newBuilder((axu) this.stat_);
            axtVarNewBuilder.mergeFrom((axt) axuVar);
            axuVar = axtVarNewBuilder.buildPartial();
        }
        this.stat_ = axuVar;
        this.statCase_ = 3;
    }

    public static pq newBuilder() {
        return (pq) DEFAULT_INSTANCE.createBuilder();
    }

    public static ps parseDelimitedFrom(InputStream inputStream) {
        return (ps) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ps parseFrom(com.google.v.v vVar) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ps> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppOpenedViaDeepLink(fd fdVar) {
        Objects.requireNonNull(fdVar);
        this.stat_ = fdVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersionOutdatedPopupClicked(fp fpVar) {
        Objects.requireNonNull(fpVar);
        this.stat_ = fpVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersionOutdatedPopupShown(fr frVar) {
        Objects.requireNonNull(frVar);
        this.stat_ = frVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaunchedFromApp(aga agaVar) {
        Objects.requireNonNull(agaVar);
        this.stat_ = agaVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkConnectionMade(axu axuVar) {
        Objects.requireNonNull(axuVar);
        this.stat_ = axuVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"stat_", "statCase_", aga.class, fd.class, axu.class, fr.class, fp.class});
        }
        if (iOrdinal == 3) {
            return new ps();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new pq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ps> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ps.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public fd getAppOpenedViaDeepLink() {
        return this.statCase_ == 2 ? (fd) this.stat_ : fd.getDefaultInstance();
    }

    public fp getAppVersionOutdatedPopupClicked() {
        return this.statCase_ == 5 ? (fp) this.stat_ : fp.getDefaultInstance();
    }

    public fr getAppVersionOutdatedPopupShown() {
        return this.statCase_ == 4 ? (fr) this.stat_ : fr.getDefaultInstance();
    }

    public aga getLaunchedFromApp() {
        return this.statCase_ == 1 ? (aga) this.stat_ : aga.getDefaultInstance();
    }

    public axu getSdkConnectionMade() {
        return this.statCase_ == 3 ? (axu) this.stat_ : axu.getDefaultInstance();
    }

    public pr getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return pr.f55234f;
        }
        if (i2 == 1) {
            return pr.f55229a;
        }
        if (i2 == 2) {
            return pr.f55230b;
        }
        if (i2 == 3) {
            return pr.f55231c;
        }
        if (i2 == 4) {
            return pr.f55232d;
        }
        if (i2 != 5) {
            return null;
        }
        return pr.f55233e;
    }

    public boolean hasAppOpenedViaDeepLink() {
        return this.statCase_ == 2;
    }

    public boolean hasAppVersionOutdatedPopupClicked() {
        return this.statCase_ == 5;
    }

    public boolean hasAppVersionOutdatedPopupShown() {
        return this.statCase_ == 4;
    }

    public boolean hasLaunchedFromApp() {
        return this.statCase_ == 1;
    }

    public boolean hasSdkConnectionMade() {
        return this.statCase_ == 3;
    }

    public static pq newBuilder(ps psVar) {
        return (pq) DEFAULT_INSTANCE.createBuilder(psVar);
    }

    public static ps parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ps) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ps parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ps parseFrom(com.google.v.z zVar) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ps parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ps parseFrom(InputStream inputStream) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ps parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ps parseFrom(ByteBuffer byteBuffer) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ps parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ps parseFrom(byte[] bArr) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ps parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ps) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
