package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ank extends com.google.v.du<ank, ani> implements com.google.v.fj {
    private static final ank DEFAULT_INSTANCE;
    public static final int DOWNLOADER_FAILED_DOWNLOAD_FIELD_NUMBER = 5;
    public static final int DOWNLOADER_FINISHED_DOWNLOAD_AGGREGATE_FIELD_NUMBER = 4;
    public static final int LOGIN_FIELD_NUMBER = 1;
    public static final int NETWORK_STATE_CHANGED_FIELD_NUMBER = 3;
    public static final int NO_NETWORK_ERROR_FIELD_NUMBER = 7;
    private static volatile com.google.v.fo<ank> PARSER = null;
    public static final int REALTIME_REFRESH_CYCLE_TRIGGERED_FIELD_NUMBER = 11;
    public static final int REALTIME_REQUEST_ERROR_FIELD_NUMBER = 6;
    public static final int SERVER_REQUEST_RESULT_FIELD_NUMBER = 8;
    public static final int SERVER_ROUTING_REQUEST_RESULT_FIELD_NUMBER = 9;
    public static final int SERVER_SELECT_ROUTE_REQUEST_RESULT_FIELD_NUMBER = 10;
    public static final int SUCCESSFUL_LOGIN_FIELD_NUMBER = 2;
    private int statCase_ = 0;
    private Object stat_;

    static {
        ank ankVar = new ank();
        DEFAULT_INSTANCE = ankVar;
        com.google.v.du.registerDefaultInstance(ank.class, ankVar);
    }

    private ank() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownloaderFailedDownload() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownloaderFinishedDownloadAggregate() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogin() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkStateChanged() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoNetworkError() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRealtimeRefreshCycleTriggered() {
        if (this.statCase_ == 11) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRealtimeRequestError() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerRequestResult() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerRoutingRequestResult() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerSelectRouteRequestResult() {
        if (this.statCase_ == 10) {
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
    public void clearSuccessfulLogin() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static ank getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDownloaderFailedDownload(sq sqVar) {
        Objects.requireNonNull(sqVar);
        if (this.statCase_ == 5 && this.stat_ != sq.getDefaultInstance()) {
            sp spVarNewBuilder = sq.newBuilder((sq) this.stat_);
            spVarNewBuilder.mergeFrom((sp) sqVar);
            sqVar = spVarNewBuilder.buildPartial();
        }
        this.stat_ = sqVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDownloaderFinishedDownloadAggregate(ss ssVar) {
        Objects.requireNonNull(ssVar);
        if (this.statCase_ == 4 && this.stat_ != ss.getDefaultInstance()) {
            sr srVarNewBuilder = ss.newBuilder((ss) this.stat_);
            srVarNewBuilder.mergeFrom((sr) ssVar);
            ssVar = srVarNewBuilder.buildPartial();
        }
        this.stat_ = ssVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLogin(ahg ahgVar) {
        Objects.requireNonNull(ahgVar);
        if (this.statCase_ == 1 && this.stat_ != ahg.getDefaultInstance()) {
            ahf ahfVarNewBuilder = ahg.newBuilder((ahg) this.stat_);
            ahfVarNewBuilder.mergeFrom((ahf) ahgVar);
            ahgVar = ahfVarNewBuilder.buildPartial();
        }
        this.stat_ = ahgVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNetworkStateChanged(anh anhVar) {
        Objects.requireNonNull(anhVar);
        if (this.statCase_ == 3 && this.stat_ != anh.getDefaultInstance()) {
            anf anfVarNewBuilder = anh.newBuilder((anh) this.stat_);
            anfVarNewBuilder.mergeFrom((anf) anhVar);
            anhVar = anfVarNewBuilder.buildPartial();
        }
        this.stat_ = anhVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNoNetworkError(ans ansVar) {
        Objects.requireNonNull(ansVar);
        if (this.statCase_ == 7 && this.stat_ != ans.getDefaultInstance()) {
            anq anqVarNewBuilder = ans.newBuilder((ans) this.stat_);
            anqVarNewBuilder.mergeFrom((anq) ansVar);
            ansVar = anqVarNewBuilder.buildPartial();
        }
        this.stat_ = ansVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRealtimeRefreshCycleTriggered(atw atwVar) {
        Objects.requireNonNull(atwVar);
        if (this.statCase_ == 11 && this.stat_ != atw.getDefaultInstance()) {
            atu atuVarNewBuilder = atw.newBuilder((atw) this.stat_);
            atuVarNewBuilder.mergeFrom((atu) atwVar);
            atwVar = atuVarNewBuilder.buildPartial();
        }
        this.stat_ = atwVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRealtimeRequestError(aty atyVar) {
        Objects.requireNonNull(atyVar);
        if (this.statCase_ == 6 && this.stat_ != aty.getDefaultInstance()) {
            atx atxVarNewBuilder = aty.newBuilder((aty) this.stat_);
            atxVarNewBuilder.mergeFrom((atx) atyVar);
            atyVar = atxVarNewBuilder.buildPartial();
        }
        this.stat_ = atyVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeServerRequestResult(bau bauVar) {
        Objects.requireNonNull(bauVar);
        if (this.statCase_ == 8 && this.stat_ != bau.getDefaultInstance()) {
            bat batVarNewBuilder = bau.newBuilder((bau) this.stat_);
            batVarNewBuilder.mergeFrom((bat) bauVar);
            bauVar = batVarNewBuilder.buildPartial();
        }
        this.stat_ = bauVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeServerRoutingRequestResult(baw bawVar) {
        Objects.requireNonNull(bawVar);
        if (this.statCase_ == 9 && this.stat_ != baw.getDefaultInstance()) {
            bav bavVarNewBuilder = baw.newBuilder((baw) this.stat_);
            bavVarNewBuilder.mergeFrom((bav) bawVar);
            bawVar = bavVarNewBuilder.buildPartial();
        }
        this.stat_ = bawVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeServerSelectRouteRequestResult(bay bayVar) {
        Objects.requireNonNull(bayVar);
        if (this.statCase_ == 10 && this.stat_ != bay.getDefaultInstance()) {
            bax baxVarNewBuilder = bay.newBuilder((bay) this.stat_);
            baxVarNewBuilder.mergeFrom((bax) bayVar);
            bayVar = baxVarNewBuilder.buildPartial();
        }
        this.stat_ = bayVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSuccessfulLogin(bgo bgoVar) {
        Objects.requireNonNull(bgoVar);
        if (this.statCase_ == 2 && this.stat_ != bgo.getDefaultInstance()) {
            bgn bgnVarNewBuilder = bgo.newBuilder((bgo) this.stat_);
            bgnVarNewBuilder.mergeFrom((bgn) bgoVar);
            bgoVar = bgnVarNewBuilder.buildPartial();
        }
        this.stat_ = bgoVar;
        this.statCase_ = 2;
    }

    public static ani newBuilder() {
        return (ani) DEFAULT_INSTANCE.createBuilder();
    }

    public static ank parseDelimitedFrom(InputStream inputStream) {
        return (ank) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ank parseFrom(com.google.v.v vVar) {
        return (ank) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ank> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloaderFailedDownload(sq sqVar) {
        Objects.requireNonNull(sqVar);
        this.stat_ = sqVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloaderFinishedDownloadAggregate(ss ssVar) {
        Objects.requireNonNull(ssVar);
        this.stat_ = ssVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogin(ahg ahgVar) {
        Objects.requireNonNull(ahgVar);
        this.stat_ = ahgVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkStateChanged(anh anhVar) {
        Objects.requireNonNull(anhVar);
        this.stat_ = anhVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoNetworkError(ans ansVar) {
        Objects.requireNonNull(ansVar);
        this.stat_ = ansVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealtimeRefreshCycleTriggered(atw atwVar) {
        Objects.requireNonNull(atwVar);
        this.stat_ = atwVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealtimeRequestError(aty atyVar) {
        Objects.requireNonNull(atyVar);
        this.stat_ = atyVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerRequestResult(bau bauVar) {
        Objects.requireNonNull(bauVar);
        this.stat_ = bauVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerRoutingRequestResult(baw bawVar) {
        Objects.requireNonNull(bawVar);
        this.stat_ = bawVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerSelectRouteRequestResult(bay bayVar) {
        Objects.requireNonNull(bayVar);
        this.stat_ = bayVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccessfulLogin(bgo bgoVar) {
        Objects.requireNonNull(bgoVar);
        this.stat_ = bgoVar;
        this.statCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", new Object[]{"stat_", "statCase_", ahg.class, bgo.class, anh.class, ss.class, sq.class, aty.class, ans.class, bau.class, baw.class, bay.class, atw.class});
        }
        if (iOrdinal == 3) {
            return new ank();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ani(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ank> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ank.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public sq getDownloaderFailedDownload() {
        return this.statCase_ == 5 ? (sq) this.stat_ : sq.getDefaultInstance();
    }

    public ss getDownloaderFinishedDownloadAggregate() {
        return this.statCase_ == 4 ? (ss) this.stat_ : ss.getDefaultInstance();
    }

    public ahg getLogin() {
        return this.statCase_ == 1 ? (ahg) this.stat_ : ahg.getDefaultInstance();
    }

    public anh getNetworkStateChanged() {
        return this.statCase_ == 3 ? (anh) this.stat_ : anh.getDefaultInstance();
    }

    public ans getNoNetworkError() {
        return this.statCase_ == 7 ? (ans) this.stat_ : ans.getDefaultInstance();
    }

    public atw getRealtimeRefreshCycleTriggered() {
        return this.statCase_ == 11 ? (atw) this.stat_ : atw.getDefaultInstance();
    }

    public aty getRealtimeRequestError() {
        return this.statCase_ == 6 ? (aty) this.stat_ : aty.getDefaultInstance();
    }

    public bau getServerRequestResult() {
        return this.statCase_ == 8 ? (bau) this.stat_ : bau.getDefaultInstance();
    }

    public baw getServerRoutingRequestResult() {
        return this.statCase_ == 9 ? (baw) this.stat_ : baw.getDefaultInstance();
    }

    public bay getServerSelectRouteRequestResult() {
        return this.statCase_ == 10 ? (bay) this.stat_ : bay.getDefaultInstance();
    }

    public anj getStatCase() {
        switch (this.statCase_) {
            case 0:
                return anj.f52798l;
            case 1:
                return anj.f52787a;
            case 2:
                return anj.f52788b;
            case 3:
                return anj.f52789c;
            case 4:
                return anj.f52790d;
            case 5:
                return anj.f52791e;
            case 6:
                return anj.f52792f;
            case 7:
                return anj.f52793g;
            case 8:
                return anj.f52794h;
            case 9:
                return anj.f52795i;
            case 10:
                return anj.f52796j;
            case 11:
                return anj.f52797k;
            default:
                return null;
        }
    }

    public bgo getSuccessfulLogin() {
        return this.statCase_ == 2 ? (bgo) this.stat_ : bgo.getDefaultInstance();
    }

    public boolean hasDownloaderFailedDownload() {
        return this.statCase_ == 5;
    }

    public boolean hasDownloaderFinishedDownloadAggregate() {
        return this.statCase_ == 4;
    }

    public boolean hasLogin() {
        return this.statCase_ == 1;
    }

    public boolean hasNetworkStateChanged() {
        return this.statCase_ == 3;
    }

    public boolean hasNoNetworkError() {
        return this.statCase_ == 7;
    }

    public boolean hasRealtimeRefreshCycleTriggered() {
        return this.statCase_ == 11;
    }

    public boolean hasRealtimeRequestError() {
        return this.statCase_ == 6;
    }

    public boolean hasServerRequestResult() {
        return this.statCase_ == 8;
    }

    public boolean hasServerRoutingRequestResult() {
        return this.statCase_ == 9;
    }

    public boolean hasServerSelectRouteRequestResult() {
        return this.statCase_ == 10;
    }

    public boolean hasSuccessfulLogin() {
        return this.statCase_ == 2;
    }

    public static ani newBuilder(ank ankVar) {
        return (ani) DEFAULT_INSTANCE.createBuilder(ankVar);
    }

    public static ank parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ank) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ank parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ank) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ank parseFrom(com.google.v.z zVar) {
        return (ank) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ank parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ank) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ank parseFrom(InputStream inputStream) {
        return (ank) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ank parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ank) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ank parseFrom(ByteBuffer byteBuffer) {
        return (ank) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ank parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ank) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ank parseFrom(byte[] bArr) {
        return (ank) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ank parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ank) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
