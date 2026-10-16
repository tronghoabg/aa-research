package com.waze.network;

import androidx.core.app.NotificationCompat;
import com.waze.NativeManager;
import com.waze.ResultStruct;
import com.waze.jni.protos.network.MessageAuthType;
import com.waze.jni.protos.network.MessagePriority;
import com.waze.jni.protos.network.MessageRequestMetadata;
import com.waze.jni.protos.network.ResultStructMessage;
import com.waze.jni.protos.network.TransactionQueueId;
import com.waze.jni.protos.network.TransactionStatsMessage;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
class NetworkManager extends af implements ba {
    private final okhttp3.s cookieJar;
    private final au httpClient;
    private final com.waze.shared_infra.i.e logger;
    private final com.waze.network.b.ab queueDispatcher;

    public NetworkManager(au auVar, okhttp3.s sVar, com.waze.network.b.ab abVar, com.waze.shared_infra.i.e eVar) {
        this.httpClient = auVar;
        this.cookieJar = sVar;
        this.queueDispatcher = abVar;
        this.logger = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void HTTPGetError(long j2, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void HTTPGetResponse(byte[] bArr, String str, long j2);

    private static String[] getCookies(List<okhttp3.q> list) {
        int size = list.size();
        String[] strArr = new String[size + size];
        int i2 = 0;
        for (okhttp3.q qVar : list) {
            strArr[i2] = qVar.a();
            strArr[i2 + 1] = qVar.c();
            i2 += 2;
        }
        return strArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResult(final com.waze.network.g.a aVar, final com.waze.network.b.bf bfVar) {
        NativeManager.Post(new Runnable() { // from class: com.waze.network.aa
            @Override // java.lang.Runnable
            public final void run() {
                this.f31861a.lambda$handleResult$0(aVar, bfVar);
            }
        });
    }

    private void handleResultNative(Long l2, com.waze.network.g.a aVar, com.waze.network.b.bf bfVar) {
        TransactionQueueId transactionQueueId;
        MessagePriority messagePriority;
        com.waze.sharedui.f.r rVarH = aVar.h();
        h.g.b.x.f(rVarH, "stats");
        TransactionStatsMessage.Builder builderNewBuilder = TransactionStatsMessage.newBuilder();
        if (rVarH.g() != null) {
            builderNewBuilder.setNetworkLatencyMs(rVarH.g().intValue());
        }
        if (rVarH.h() != null) {
            builderNewBuilder.setResponseSizeBytes(rVarH.h().intValue());
        }
        if (rVarH.i() != null) {
            builderNewBuilder.setServerProcessingLatencyMs(rVarH.i().intValue());
        }
        if (rVarH.d() != null) {
            com.waze.sharedui.f.g gVar = com.waze.sharedui.f.g.f38898a;
            com.waze.sharedui.f.g gVarD = rVarH.d();
            h.g.b.x.f(gVarD, "priority");
            MessagePriority messagePriority2 = MessagePriority.USER_AWAITING;
            int iOrdinal = gVarD.ordinal();
            if (iOrdinal == 0) {
                messagePriority = MessagePriority.USER_AWAITING;
            } else if (iOrdinal == 1) {
                messagePriority = MessagePriority.USER_VISIBLE;
            } else if (iOrdinal == 2) {
                messagePriority = MessagePriority.DATA_FETCH;
            } else {
                if (iOrdinal != 3) {
                    throw new h.i();
                }
                messagePriority = MessagePriority.DATA_SEND;
            }
            builderNewBuilder.setPriority(messagePriority);
        }
        if (rVarH.e() != null) {
            com.waze.sharedui.f.q qVarE = rVarH.e();
            h.g.b.x.f(qVarE, "<this>");
            TransactionQueueId transactionQueueId2 = TransactionQueueId.General;
            com.waze.sharedui.f.q qVar = com.waze.sharedui.f.q.f38922a;
            switch (qVarE.ordinal()) {
                case 0:
                    transactionQueueId = TransactionQueueId.General;
                    break;
                case 1:
                    transactionQueueId = TransactionQueueId.Routing;
                    break;
                case 2:
                    transactionQueueId = TransactionQueueId.RoutingUpdate;
                    break;
                case 3:
                    transactionQueueId = TransactionQueueId.Background;
                    break;
                case 4:
                    transactionQueueId = TransactionQueueId.Register;
                    break;
                case 5:
                    transactionQueueId = TransactionQueueId.DriveSuggestions;
                    break;
                case 6:
                    transactionQueueId = TransactionQueueId.GeoConfig;
                    break;
                case 7:
                    transactionQueueId = TransactionQueueId.Username;
                    break;
                default:
                    throw new h.i();
            }
            builderNewBuilder.setQueueId(transactionQueueId);
        }
        if (rVarH.f() != null) {
            builderNewBuilder.setIntegrityTokenGenerationLatencyMs(rVarH.f().intValue());
        }
        builderNewBuilder.setQueueLatencyMs(rVarH.a());
        builderNewBuilder.setRequestSizeBytes(rVarH.b());
        builderNewBuilder.setRetries(rVarH.c());
        TransactionStatsMessage transactionStatsMessageBuild = builderNewBuilder.build();
        h.g.b.x.e(transactionStatsMessageBuild, "build(...)");
        byte[] byteArray = transactionStatsMessageBuild.toByteArray();
        if (bfVar instanceof com.waze.network.b.be) {
            com.waze.network.b.be beVar = (com.waze.network.b.be) bfVar;
            processMessageResponseNTV(beVar.b(), l2.longValue(), getCookies(aVar), beVar.a(), byteArray);
        } else if (!(bfVar instanceof com.waze.network.b.bd)) {
            this.logger.g("unknown result type: ".concat(String.valueOf(String.valueOf(bfVar))));
        } else {
            com.waze.network.b.bd bdVar = (com.waze.network.b.bd) bfVar;
            processMessageErrorNTV(l2.longValue(), bdVar.e(), bdVar.f(), bdVar.b(), bdVar.c(), byteArray);
        }
    }

    private native void initNativeLayerNTV();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleResult$0(com.waze.network.g.a aVar, com.waze.network.b.bf bfVar) {
        handleResultNative(Long.valueOf(aVar.c()), aVar, bfVar);
    }

    private native void processMessageErrorNTV(long j2, boolean z, boolean z2, String str, String str2, byte[] bArr);

    private native void processMessageResponseNTV(byte[] bArr, long j2, String[] strArr, String str, byte[] bArr2);

    void AbortTransactions(int[] iArr) {
        if (iArr != null) {
            com.waze.network.b.ab abVar = this.queueDispatcher;
            h.g.b.x.f(abVar, "<this>");
            h.g.b.x.f(iArr, "transactionIds");
            abVar.c(new com.waze.car_lib.login.b(h.a.c.ac(iArr), 9));
        }
    }

    void AbortTransactionsByQueue(int i2) {
        TransactionQueueId transactionQueueIdForNumber = TransactionQueueId.forNumber(i2);
        com.waze.shared_infra.i.e eVar = this.logger;
        if (transactionQueueIdForNumber == null) {
            eVar.g("invalid queue id " + i2);
        } else {
            com.waze.sharedui.f.q qVarA = com.waze.sharedui.profile.c.a(transactionQueueIdForNumber);
            eVar.g("aborting all queue items ".concat(String.valueOf(String.valueOf(qVarA))));
            com.waze.network.b.ab abVar = this.queueDispatcher;
            h.g.b.x.f(abVar, "<this>");
            h.g.b.x.f(qVarA, "queueId");
            abVar.c(new com.waze.car_lib.login.b(qVarA, 10));
        }
    }

    boolean HTTPGet(String str, long j2, long j3) {
        return this.httpClient.a(str, j2, j3);
    }

    boolean HTTPPost(String str, String str2, byte[] bArr, long j2) {
        return this.httpClient.b(str, str2, bArr, j2);
    }

    boolean HTTPPostFile(String str, String str2, String str3, long j2) {
        return this.httpClient.c(str, str2, str3, j2);
    }

    void SendMessage(MessageRequestMetadata messageRequestMetadata, byte[] bArr) {
        com.waze.sharedui.f.c cVar;
        com.waze.sharedui.f.g gVarC;
        com.waze.sharedui.f.c cVar2 = com.waze.sharedui.f.c.f38887a;
        MessageAuthType authType = messageRequestMetadata.getAuthType();
        h.g.b.x.f(authType, "authType");
        MessageAuthType messageAuthType = MessageAuthType.SESSION;
        int iOrdinal = authType.ordinal();
        if (iOrdinal == 0) {
            cVar = com.waze.sharedui.f.c.f38887a;
        } else if (iOrdinal == 1) {
            cVar = com.waze.sharedui.f.c.f38888b;
        } else if (iOrdinal == 2) {
            cVar = com.waze.sharedui.f.c.f38889c;
        } else {
            if (iOrdinal != 3) {
                throw new h.i();
            }
            cVar = com.waze.sharedui.f.c.f38887a;
        }
        com.waze.sharedui.f.c cVar3 = cVar;
        if (messageRequestMetadata.hasPriority()) {
            com.waze.sharedui.f.g gVar = com.waze.sharedui.f.g.f38898a;
            gVarC = com.waze.sharedui.f.n.c(messageRequestMetadata.getPriority());
        } else {
            gVarC = null;
        }
        this.queueDispatcher.a(new com.waze.network.g.a(com.waze.network.g.a.f32372a, messageRequestMetadata.getUrl(), messageRequestMetadata.getType(), gVarC, bArr, messageRequestMetadata.getTransactionId(), cVar3, messageRequestMetadata.getContext(), com.waze.sharedui.profile.c.a(messageRequestMetadata.getQueueId()), false), new com.waze.network.b.aa() { // from class: com.waze.network.ab
            @Override // com.waze.network.b.aa
            public final void a(com.waze.network.g.a aVar, com.waze.network.b.bf bfVar) {
                this.f31864a.handleResult(aVar, bfVar);
            }
        });
    }

    Object newResultStruct(ResultStructMessage resultStructMessage) {
        int code = resultStructMessage.getCode();
        String title = resultStructMessage.getTitle();
        String body = resultStructMessage.getBody();
        String action = resultStructMessage.getAction();
        String deepLink = resultStructMessage.getDeepLink();
        boolean showAsToast = resultStructMessage.getShowAsToast();
        boolean hideCloseButton = resultStructMessage.getHideCloseButton();
        boolean terminal = resultStructMessage.getTerminal();
        String analytics = resultStructMessage.getAnalytics();
        String errorCode = resultStructMessage.getErrorCode();
        TransactionStatsMessage stats = resultStructMessage.getStats();
        h.g.b.x.f(stats, NotificationCompat.CATEGORY_MESSAGE);
        int queueLatencyMs = stats.getQueueLatencyMs();
        TransactionStatsMessage transactionStatsMessage = true != stats.hasServerProcessingLatencyMs() ? null : stats;
        Integer numValueOf = transactionStatsMessage != null ? Integer.valueOf(transactionStatsMessage.getServerProcessingLatencyMs()) : null;
        TransactionStatsMessage transactionStatsMessage2 = true != stats.hasResponseSizeBytes() ? null : stats;
        Integer numValueOf2 = transactionStatsMessage2 != null ? Integer.valueOf(transactionStatsMessage2.getNetworkLatencyMs()) : null;
        int retries = stats.getRetries();
        com.waze.sharedui.f.g gVar = com.waze.sharedui.f.g.f38898a;
        MessagePriority priority = stats.getPriority();
        h.g.b.x.e(priority, "getPriority(...)");
        com.waze.sharedui.f.g gVarC = com.waze.sharedui.f.n.c(priority);
        TransactionQueueId queueId = stats.getQueueId();
        h.g.b.x.e(queueId, "getQueueId(...)");
        com.waze.sharedui.f.q qVarA = com.waze.sharedui.profile.c.a(queueId);
        int requestSizeBytes = stats.getRequestSizeBytes();
        if (true != stats.hasResponseSizeBytes()) {
            stats = null;
        }
        return new ResultStruct(code, title, body, action, deepLink, showAsToast, hideCloseButton, terminal, analytics, errorCode, new com.waze.sharedui.f.r(queueLatencyMs, numValueOf, numValueOf2, retries, gVarC, qVarA, requestSizeBytes, stats != null ? Integer.valueOf(stats.getResponseSizeBytes()) : null, null));
    }

    @Override // com.waze.network.ba
    public void startNetwork() {
        initNativeLayerNTV();
    }

    @Override // com.waze.network.ba
    public ag stats() {
        return new ag(this.queueDispatcher.b());
    }

    public NetworkManager(au auVar, okhttp3.s sVar, com.waze.network.b.ab abVar) {
        this(auVar, sVar, abVar, com.waze.shared_infra.i.a.d("WazeNetwork"));
    }

    private String[] getCookies(com.waze.network.g.a aVar) {
        String strJ = aVar.j();
        try {
            okhttp3.s sVar = this.cookieJar;
            int i2 = okhttp3.ab.f55817a;
            return getCookies((List<okhttp3.q>) sVar.a(kotlinx.b.a.b.C(strJ)));
        } catch (Exception e2) {
            this.logger.c("Failed to get cookies for ".concat(String.valueOf(strJ)), e2);
            return new String[0];
        }
    }
}
