.class public final Lcom/vungle/ads/internal/ui/z;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"

# interfaces
.implements Lcom/vungle/ads/internal/util/v;


# instance fields
.field public final a:Lcom/vungle/ads/internal/model/h0;

.field public final b:Lcom/vungle/ads/internal/model/i3;

.field public final c:Ljava/util/concurrent/ExecutorService;

.field public final d:Lcom/vungle/ads/internal/platform/f;

.field public final e:Lcom/vungle/ads/internal/load/e;

.field public final f:Ljava/lang/Long;

.field public final g:Lef/i;

.field public h:Z

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Landroid/webkit/WebView;

.field public n:Z

.field public o:Lcom/vungle/ads/internal/ui/view/o;

.field public p:Lcom/vungle/ads/internal/ui/view/p;

.field public q:Lcom/vungle/ads/internal/omsdk/f;

.field public r:Ljava/lang/Boolean;

.field public final s:Lcom/vungle/ads/internal/s1;

.field public final t:Lcom/vungle/ads/internal/s1;

.field public final u:Lcom/vungle/ads/internal/m2;


# direct methods
.method public synthetic constructor <init>(Lcom/vungle/ads/internal/model/h0;Lcom/vungle/ads/internal/model/i3;Ljava/util/concurrent/ExecutorService;Lcom/vungle/ads/internal/platform/f;)V
    .locals 7

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 1
    invoke-direct/range {v0 .. v6}, Lcom/vungle/ads/internal/ui/z;-><init>(Lcom/vungle/ads/internal/model/h0;Lcom/vungle/ads/internal/model/i3;Ljava/util/concurrent/ExecutorService;Lcom/vungle/ads/internal/platform/f;Lcom/vungle/ads/internal/load/e;Ljava/lang/Long;)V

    return-void
.end method

.method public constructor <init>(Lcom/vungle/ads/internal/model/h0;Lcom/vungle/ads/internal/model/i3;Ljava/util/concurrent/ExecutorService;Lcom/vungle/ads/internal/platform/f;Lcom/vungle/ads/internal/load/e;Ljava/lang/Long;)V
    .locals 1

    const-string v0, "advertisement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "placement"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offloadExecutor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/vungle/ads/internal/ui/z;->a:Lcom/vungle/ads/internal/model/h0;

    .line 4
    iput-object p2, p0, Lcom/vungle/ads/internal/ui/z;->b:Lcom/vungle/ads/internal/model/i3;

    .line 5
    iput-object p3, p0, Lcom/vungle/ads/internal/ui/z;->c:Ljava/util/concurrent/ExecutorService;

    .line 6
    iput-object p4, p0, Lcom/vungle/ads/internal/ui/z;->d:Lcom/vungle/ads/internal/platform/f;

    .line 7
    iput-object p5, p0, Lcom/vungle/ads/internal/ui/z;->e:Lcom/vungle/ads/internal/load/e;

    .line 8
    iput-object p6, p0, Lcom/vungle/ads/internal/ui/z;->f:Ljava/lang/Long;

    .line 9
    sget-object p1, Lcom/vungle/ads/internal/ui/p;->a:Lcom/vungle/ads/internal/ui/p;

    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    move-result-object p1

    iput-object p1, p0, Lcom/vungle/ads/internal/ui/z;->g:Lef/i;

    .line 10
    new-instance p1, Lcom/vungle/ads/internal/s1;

    sget-object p2, Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;->AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET:Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;

    invoke-direct {p1, p2}, Lcom/vungle/ads/internal/s1;-><init>(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V

    iput-object p1, p0, Lcom/vungle/ads/internal/ui/z;->s:Lcom/vungle/ads/internal/s1;

    .line 11
    new-instance p1, Lcom/vungle/ads/internal/s1;

    invoke-direct {p1, p2}, Lcom/vungle/ads/internal/s1;-><init>(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V

    iput-object p1, p0, Lcom/vungle/ads/internal/ui/z;->t:Lcom/vungle/ads/internal/s1;

    .line 12
    new-instance p1, Lcom/vungle/ads/internal/m2;

    sget-object p2, Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;->BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL:Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;

    invoke-direct {p1, p2}, Lcom/vungle/ads/internal/m2;-><init>(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V

    iput-object p1, p0, Lcom/vungle/ads/internal/ui/z;->u:Lcom/vungle/ads/internal/m2;

    return-void
.end method

.method public static final synthetic a(Lcom/vungle/ads/internal/ui/z;)Lcom/vungle/ads/internal/model/h0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/vungle/ads/internal/ui/z;->a:Lcom/vungle/ads/internal/model/h0;

    return-object p0
.end method

.method public static final a(Lcom/vungle/ads/internal/ui/view/o;Ljava/lang/String;Lkotlinx/serialization/json/c;Lcom/vungle/ads/internal/ui/z;Landroid/webkit/WebView;)V
    .locals 1

    const-string v0, "$it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    check-cast p0, Lcom/vungle/ads/internal/presenter/r;

    invoke-virtual {p0, p1, p2}, Lcom/vungle/ads/internal/presenter/r;->a(Ljava/lang/String;Lkotlinx/serialization/json/c;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 14
    const-string p0, "window.vungle.mraidBridge.notifyCommandComplete()"

    invoke-virtual {p3, p4, p0}, Lcom/vungle/ads/internal/ui/z;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static final a(Lcom/vungle/ads/internal/ui/z;Landroid/webkit/WebView;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/z;->a:Lcom/vungle/ads/internal/model/h0;

    invoke-virtual {v0}, Lcom/vungle/ads/internal/model/h0;->g()Lkotlinx/serialization/json/c;

    move-result-object v0

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "window.vungle.mraidBridge.notifyReadyEvent("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 12
    invoke-virtual {p0, p1, v0}, Lcom/vungle/ads/internal/ui/z;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method

.method public static final a(ZLcom/vungle/ads/internal/ui/z;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    new-instance v0, LA/e0;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, LA/e0;-><init>(I)V

    .line 44
    iget-object v1, p1, Lcom/vungle/ads/internal/ui/z;->a:Lcom/vungle/ads/internal/model/h0;

    invoke-virtual {v1}, Lcom/vungle/ads/internal/model/h0;->F()Ljava/lang/String;

    move-result-object v1

    const-string v2, "placementType"

    invoke-static {v0, v2, v1}, LFe/b;->P(LA/e0;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    iget-object v1, p1, Lcom/vungle/ads/internal/ui/z;->r:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    const-string v2, "isViewable"

    invoke-static {v0, v2, v1}, LFe/b;->O(LA/e0;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 46
    :cond_0
    const-string v1, "os"

    const-string v2, "android"

    invoke-static {v0, v1, v2}, LFe/b;->P(LA/e0;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "osVersion"

    invoke-static {v0, v2, v1}, LFe/b;->P(LA/e0;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    iget-object v1, p1, Lcom/vungle/ads/internal/ui/z;->b:Lcom/vungle/ads/internal/model/i3;

    invoke-virtual {v1}, Lcom/vungle/ads/internal/model/i3;->j()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "incentivized"

    invoke-static {v0, v2, v1}, LFe/b;->O(LA/e0;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 49
    iget-object v1, p1, Lcom/vungle/ads/internal/ui/z;->d:Lcom/vungle/ads/internal/platform/f;

    if-eqz v1, :cond_1

    check-cast v1, Lcom/vungle/ads/internal/platform/c;

    invoke-virtual {v1}, Lcom/vungle/ads/internal/platform/c;->o()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "isSilent"

    invoke-static {v0, v2, v1}, LFe/b;->O(LA/e0;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 50
    :cond_1
    iget-object v1, p1, Lcom/vungle/ads/internal/ui/z;->f:Ljava/lang/Long;

    if-eqz v1, :cond_2

    .line 51
    invoke-static {v1}, LXf/j;->a(Ljava/lang/Number;)Lkotlinx/serialization/json/d;

    move-result-object v1

    const-string v2, "timeLoaded"

    invoke-virtual {v0, v2, v1}, LA/e0;->v(Ljava/lang/String;Lkotlinx/serialization/json/d;)Lkotlinx/serialization/json/b;

    .line 52
    :cond_2
    iget-boolean v1, p1, Lcom/vungle/ads/internal/ui/z;->h:Z

    const-string v2, "consentRequired"

    if-eqz v1, :cond_3

    .line 53
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2, v1}, LFe/b;->O(LA/e0;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 54
    iget-object v1, p1, Lcom/vungle/ads/internal/ui/z;->i:Ljava/lang/String;

    const-string v2, "consentTitleText"

    invoke-static {v0, v2, v1}, LFe/b;->P(LA/e0;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    iget-object v1, p1, Lcom/vungle/ads/internal/ui/z;->j:Ljava/lang/String;

    const-string v2, "consentBodyText"

    invoke-static {v0, v2, v1}, LFe/b;->P(LA/e0;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    iget-object v1, p1, Lcom/vungle/ads/internal/ui/z;->k:Ljava/lang/String;

    const-string v2, "consentAcceptButtonText"

    invoke-static {v0, v2, v1}, LFe/b;->P(LA/e0;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    iget-object v1, p1, Lcom/vungle/ads/internal/ui/z;->l:Ljava/lang/String;

    const-string v2, "consentDenyButtonText"

    invoke-static {v0, v2, v1}, LFe/b;->P(LA/e0;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 58
    :cond_3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v2, v1}, LFe/b;->O(LA/e0;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 59
    :goto_0
    const-string v1, "sdkVersion"

    const-string v2, "7.7.4"

    invoke-static {v0, v1, v2}, LFe/b;->P(LA/e0;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    new-instance v1, Lkotlinx/serialization/json/c;

    iget-object v0, v0, LA/e0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "window.vungle.mraidBridge.notifyPropertiesChange("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 62
    iget-object v0, p1, Lcom/vungle/ads/internal/ui/z;->m:Landroid/webkit/WebView;

    if-eqz v0, :cond_4

    invoke-virtual {p1, v0, p0}, Lcom/vungle/ads/internal/ui/z;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public static final b(Lcom/vungle/ads/internal/ui/z;Landroid/webkit/WebView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/z;->e:Lcom/vungle/ads/internal/load/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/vungle/ads/internal/load/e;->b()V

    .line 2
    :cond_0
    const-string v0, "window.vungle.mraidBridge.notifyCommandComplete()"

    invoke-virtual {p0, p1, v0}, Lcom/vungle/ads/internal/ui/z;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method

.method public static final c(Lcom/vungle/ads/internal/ui/z;Landroid/webkit/WebView;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/z;->e:Lcom/vungle/ads/internal/load/e;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/vungle/ads/internal/load/e;->a()V

    .line 11
    .line 12
    .line 13
    :cond_0
    const-string v0, "window.vungle.mraidBridge.notifyCommandComplete()"

    .line 14
    .line 15
    invoke-virtual {p0, p1, v0}, Lcom/vungle/ads/internal/ui/z;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 15
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/z;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, LC8/g;

    const/16 v2, 0x8

    invoke-direct {v1, p0, v2}, LC8/g;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(I)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/z;->g:Lef/i;

    invoke-interface {v0}, Lef/i;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/vungle/ads/internal/util/j;

    .line 3
    iget-object v1, p0, Lcom/vungle/ads/internal/ui/z;->m:Landroid/webkit/WebView;

    new-instance v2, Lcom/vungle/ads/internal/ui/q;

    invoke-direct {v2, p0}, Lcom/vungle/ads/internal/ui/q;-><init>(Lcom/vungle/ads/internal/ui/z;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/vungle/ads/internal/util/j;->a(Landroid/webkit/WebView;ILcom/vungle/ads/internal/ui/q;)V

    return-void
.end method

.method public final a(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 41
    sget-boolean v0, Lcom/vungle/ads/internal/util/u;->a:Z

    new-instance v0, Lcom/vungle/ads/internal/ui/u;

    invoke-direct {v0, p2}, Lcom/vungle/ads/internal/ui/u;-><init>(Ljava/lang/String;)V

    const-string v1, "VungleWebClient"

    invoke-static {v1, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ltf/a;)V

    .line 42
    sget-object v0, Lcom/vungle/ads/internal/util/y;->a:Landroid/os/Handler;

    new-instance v0, Lcom/vungle/ads/internal/ui/v;

    invoke-direct {v0, p0, p1, p2}, Lcom/vungle/ads/internal/ui/v;-><init>(Lcom/vungle/ads/internal/ui/z;Landroid/webkit/WebView;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/vungle/ads/internal/util/y;->a(Ltf/a;)V

    return-void
.end method

.method public final a(Lcom/vungle/ads/internal/omsdk/e;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/vungle/ads/internal/ui/z;->q:Lcom/vungle/ads/internal/omsdk/f;

    return-void
.end method

.method public final a(Lcom/vungle/ads/internal/ui/view/o;)V
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/vungle/ads/internal/ui/z;->o:Lcom/vungle/ads/internal/ui/view/o;

    return-void
.end method

.method public final a(Lcom/vungle/ads/internal/ui/view/p;)V
    .locals 1

    const-string v0, "errorHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    iput-object p1, p0, Lcom/vungle/ads/internal/ui/z;->p:Lcom/vungle/ads/internal/ui/view/p;

    return-void
.end method

.method public final a(Ljava/lang/String;I)V
    .locals 9

    const-string v0, "errorMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/z;->m:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "window.vungle.mraidBridgeExt.notifyBlackScreenResult("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 18
    invoke-virtual {p0, v0, v1}, Lcom/vungle/ads/internal/ui/z;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 19
    :cond_0
    sget-boolean v0, Lcom/vungle/ads/internal/util/u;->a:Z

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Returning black screen result: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "VungleWebClient"

    invoke-static {v1, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    if-ltz p2, :cond_1

    .line 20
    sget-object v2, Lcom/vungle/ads/internal/AnalyticsClient;->INSTANCE:Lcom/vungle/ads/internal/AnalyticsClient;

    .line 21
    sget-object v3, Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;->BLACK_SCREEN_IS_DETECTED:Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;

    int-to-long v4, p2

    .line 22
    iget-object p1, p0, Lcom/vungle/ads/internal/ui/z;->a:Lcom/vungle/ads/internal/model/h0;

    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->q()Lcom/vungle/ads/internal/util/s;

    move-result-object v6

    const/4 v7, 0x0

    const/16 v8, 0x8

    .line 23
    invoke-static/range {v2 .. v8}, Lcom/vungle/ads/internal/AnalyticsClient;->a(Lcom/vungle/ads/internal/AnalyticsClient;Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;JLcom/vungle/ads/internal/util/s;Ljava/lang/String;I)V

    return-void

    .line 24
    :cond_1
    sget-object p2, Lcom/vungle/ads/internal/AnalyticsClient;->INSTANCE:Lcom/vungle/ads/internal/AnalyticsClient;

    .line 25
    sget-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->BLACK_SCREEN_DETECTION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 26
    iget-object v1, p0, Lcom/vungle/ads/internal/ui/z;->a:Lcom/vungle/ads/internal/model/h0;

    invoke-virtual {v1}, Lcom/vungle/ads/internal/model/h0;->q()Lcom/vungle/ads/internal/util/s;

    move-result-object v1

    .line 27
    invoke-virtual {p2, v0, p1, v1}, Lcom/vungle/ads/internal/AnalyticsClient;->c(Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;Ljava/lang/String;Lcom/vungle/ads/internal/util/s;)V

    return-void
.end method

.method public final a(Z)V
    .locals 5

    .line 28
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/z;->m:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 29
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 30
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 31
    sget-object v2, LXf/j;->a:LWf/F;

    .line 32
    new-instance v2, LXf/p;

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 33
    invoke-direct {v2, p1, v4, v3}, LXf/p;-><init>(Ljava/io/Serializable;ZLkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 34
    const-string p1, "isSilent"

    .line 35
    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/b;

    .line 36
    new-instance p1, Lkotlinx/serialization/json/c;

    invoke-direct {p1, v1}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "window.vungle.mraidBridge.notifyPropertiesChange("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 38
    invoke-virtual {p0, v0, p1}, Lcom/vungle/ads/internal/ui/z;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final a(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/vungle/ads/internal/ui/z;->h:Z

    .line 5
    iput-object p2, p0, Lcom/vungle/ads/internal/ui/z;->i:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lcom/vungle/ads/internal/ui/z;->j:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Lcom/vungle/ads/internal/ui/z;->k:Ljava/lang/String;

    .line 8
    iput-object p5, p0, Lcom/vungle/ads/internal/ui/z;->l:Ljava/lang/String;

    return-void
.end method

.method public final b(Z)V
    .locals 5

    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/vungle/ads/internal/ui/z;->r:Ljava/lang/Boolean;

    .line 4
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/z;->m:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 5
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 6
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 7
    sget-object v2, LXf/j;->a:LWf/F;

    .line 8
    new-instance v2, LXf/p;

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 9
    invoke-direct {v2, p1, v4, v3}, LXf/p;-><init>(Ljava/io/Serializable;ZLkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 10
    const-string p1, "isViewable"

    .line 11
    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/b;

    .line 12
    new-instance p1, Lkotlinx/serialization/json/c;

    invoke-direct {p1, v1}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "window.vungle.mraidBridge.notifyPropertiesChange("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-virtual {p0, v0, p1}, Lcom/vungle/ads/internal/ui/z;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    sget-boolean p2, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 5
    .line 6
    sget-object p2, Lcom/vungle/ads/internal/ui/r;->a:Lcom/vungle/ads/internal/ui/r;

    .line 7
    .line 8
    const-string v0, "VungleWebClient"

    .line 9
    .line 10
    invoke-static {v0, p2}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ltf/a;)V

    .line 11
    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iput-object p1, p0, Lcom/vungle/ads/internal/ui/z;->m:Landroid/webkit/WebView;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/vungle/ads/internal/ui/z;->a()V

    .line 23
    .line 24
    .line 25
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 26
    .line 27
    const/16 v0, 0x1d

    .line 28
    .line 29
    if-lt p2, v0, :cond_1

    .line 30
    .line 31
    new-instance p2, Lcom/vungle/ads/internal/ui/o;

    .line 32
    .line 33
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/z;->p:Lcom/vungle/ads/internal/ui/view/p;

    .line 34
    .line 35
    invoke-direct {p2, v0}, Lcom/vungle/ads/internal/ui/o;-><init>(Lcom/vungle/ads/internal/ui/view/p;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1, p2}, LG5/d;->v(Landroid/webkit/WebView;Lcom/vungle/ads/internal/ui/o;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object p2, p0, Lcom/vungle/ads/internal/ui/z;->q:Lcom/vungle/ads/internal/omsdk/f;

    .line 42
    .line 43
    if-eqz p2, :cond_2

    .line 44
    .line 45
    check-cast p2, Lcom/vungle/ads/internal/omsdk/e;

    .line 46
    .line 47
    invoke-virtual {p2, p1}, Lcom/vungle/ads/internal/omsdk/e;->a(Landroid/webkit/WebView;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_0
    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "description"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failingUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 5

    .line 2
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    const/4 p1, 0x0

    if-eqz p3, :cond_0

    .line 3
    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    move-result-object p3

    goto :goto_0

    :cond_0
    move-object p3, p1

    :goto_0
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    if-eqz p2, :cond_1

    .line 4
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p1

    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_2

    .line 5
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p2

    if-ne p2, v1, :cond_2

    move p2, v1

    goto :goto_1

    :cond_2
    move p2, v0

    .line 6
    :goto_1
    sget-boolean v2, Lcom/vungle/ads/internal/util/u;->a:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error desc "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, " for URL "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "VungleWebClient"

    invoke-static {v4, v2}, Lcom/vungle/ads/internal/util/t;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_3

    .line 8
    iget-object v2, p0, Lcom/vungle/ads/internal/ui/z;->a:Lcom/vungle/ads/internal/model/h0;

    invoke-virtual {v2, p1}, Lcom/vungle/ads/internal/model/h0;->b(Ljava/lang/String;)Z

    move-result v2

    goto :goto_2

    :cond_3
    move v2, v0

    :goto_2
    if-eqz v2, :cond_4

    if-eqz p2, :cond_4

    move v0, v1

    .line 9
    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 10
    iget-object p2, p0, Lcom/vungle/ads/internal/ui/z;->p:Lcom/vungle/ads/internal/ui/view/p;

    if-eqz p2, :cond_5

    check-cast p2, Lcom/vungle/ads/internal/presenter/r;

    invoke-virtual {p2, v0, p1}, Lcom/vungle/ads/internal/presenter/r;->a(ZLjava/lang/String;)V

    :cond_5
    return-void
.end method

.method public final onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 5

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    invoke-virtual {p3}, Landroid/webkit/WebResourceResponse;->getStatusCode()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object p3, p1

    .line 17
    :goto_0
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 v0, 0x0

    .line 32
    const/4 v1, 0x1

    .line 33
    if-eqz p2, :cond_2

    .line 34
    .line 35
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-ne p2, v1, :cond_2

    .line 40
    .line 41
    move p2, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move p2, v0

    .line 44
    :goto_1
    sget-boolean v2, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 45
    .line 46
    new-instance v2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v3, "Http Error desc "

    .line 49
    .line 50
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const/16 v3, 0x20

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v4, " for URL "

    .line 65
    .line 66
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const-string v4, "VungleWebClient"

    .line 77
    .line 78
    invoke-static {v4, v2}, Lcom/vungle/ads/internal/util/t;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-lez v2, :cond_3

    .line 86
    .line 87
    iget-object v2, p0, Lcom/vungle/ads/internal/ui/z;->a:Lcom/vungle/ads/internal/model/h0;

    .line 88
    .line 89
    invoke-virtual {v2, p1}, Lcom/vungle/ads/internal/model/h0;->b(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    goto :goto_2

    .line 94
    :cond_3
    move v2, v0

    .line 95
    :goto_2
    if-eqz v2, :cond_4

    .line 96
    .line 97
    if-eqz p2, :cond_4

    .line 98
    .line 99
    move v0, v1

    .line 100
    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    iget-object p2, p0, Lcom/vungle/ads/internal/ui/z;->p:Lcom/vungle/ads/internal/ui/view/p;

    .line 119
    .line 120
    if-eqz p2, :cond_5

    .line 121
    .line 122
    check-cast p2, Lcom/vungle/ads/internal/presenter/r;

    .line 123
    .line 124
    invoke-virtual {p2, v0, p1}, Lcom/vungle/ads/internal/presenter/r;->a(ZLjava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :cond_5
    return-void
.end method

.method public final onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/vungle/ads/internal/ui/z;->m:Landroid/webkit/WebView;

    .line 3
    .line 4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v2, 0x1a

    .line 7
    .line 8
    const-string v3, "VungleWebClient"

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    sget-boolean p2, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 14
    .line 15
    new-instance p2, Lcom/vungle/ads/internal/ui/s;

    .line 16
    .line 17
    invoke-direct {p2, p1}, Lcom/vungle/ads/internal/ui/s;-><init>(Landroid/webkit/WebView;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v3, p2}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ltf/a;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/vungle/ads/internal/ui/z;->p:Lcom/vungle/ads/internal/ui/view/p;

    .line 24
    .line 25
    if-eqz p1, :cond_3

    .line 26
    .line 27
    check-cast p1, Lcom/vungle/ads/internal/presenter/r;

    .line 28
    .line 29
    new-instance p2, Lcom/vungle/ads/WebViewRenderingProcessGone;

    .line 30
    .line 31
    const-string v1, "didCrash=true"

    .line 32
    .line 33
    invoke-direct {p2, v1}, Lcom/vungle/ads/WebViewRenderingProcessGone;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2, v4, v0}, Lcom/vungle/ads/internal/presenter/r;->a(Lcom/vungle/ads/VungleError;ZLjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return v4

    .line 40
    :cond_0
    sget-boolean v1, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 41
    .line 42
    new-instance v1, Lcom/vungle/ads/internal/ui/t;

    .line 43
    .line 44
    invoke-direct {v1, p1, p2}, Lcom/vungle/ads/internal/ui/t;-><init>(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v3, v1}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ltf/a;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lcom/vungle/ads/internal/ui/z;->p:Lcom/vungle/ads/internal/ui/view/p;

    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    invoke-static {p2}, Lcc/b;->w(Landroid/webkit/RenderProcessGoneDetail;)Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move-object p2, v0

    .line 66
    :goto_0
    check-cast p1, Lcom/vungle/ads/internal/presenter/r;

    .line 67
    .line 68
    if-eqz p2, :cond_2

    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    move p2, v4

    .line 76
    :goto_1
    new-instance v1, Lcom/vungle/ads/WebViewRenderingProcessGone;

    .line 77
    .line 78
    new-instance v2, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v3, "didCrash="

    .line 81
    .line 82
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-direct {v1, v2}, Lcom/vungle/ads/WebViewRenderingProcessGone;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v1, p2, v0}, Lcom/vungle/ads/internal/presenter/r;->a(Lcom/vungle/ads/VungleError;ZLjava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    return v4
.end method

.method public final shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "bytes="

    .line 4
    .line 5
    const-string v4, "<<Return:"

    .line 6
    .line 7
    const-string v5, "bytes "

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    invoke-interface/range {p2 .. p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 13
    .line 14
    .line 15
    move-result-object v7

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v7, v6

    .line 18
    :goto_0
    if-nez v7, :cond_2

    .line 19
    .line 20
    :cond_1
    :goto_1
    move-object v3, v6

    .line 21
    goto/16 :goto_c

    .line 22
    .line 23
    :cond_2
    invoke-virtual {v7}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    if-eqz v8, :cond_1

    .line 28
    .line 29
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 30
    .line 31
    const-string v10, "ROOT"

    .line 32
    .line 33
    const-string v11, "this as java.lang.String).toLowerCase(locale)"

    .line 34
    .line 35
    invoke-static {v9, v10, v8, v9, v11}, Lcom/google/android/gms/internal/consent_sdk/a;->v(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    const-string v9, "http"

    .line 40
    .line 41
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    if-nez v9, :cond_3

    .line 46
    .line 47
    const-string v9, "https"

    .line 48
    .line 49
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    if-nez v8, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    iget-object v8, v1, Lcom/vungle/ads/internal/ui/z;->a:Lcom/vungle/ads/internal/model/h0;

    .line 57
    .line 58
    invoke-virtual {v8}, Lcom/vungle/ads/internal/model/h0;->B()Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "VungleWebClient"

    .line 63
    .line 64
    if-nez v8, :cond_4

    .line 65
    .line 66
    sget-boolean v0, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 67
    .line 68
    sget-object v0, Lcom/vungle/ads/internal/ui/w;->a:Lcom/vungle/ads/internal/ui/w;

    .line 69
    .line 70
    invoke-static {v9, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ltf/a;)V

    .line 71
    .line 72
    .line 73
    return-object v6

    .line 74
    :cond_4
    invoke-virtual {v7}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    const-string v10, "uri.toString()"

    .line 79
    .line 80
    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget-object v10, v1, Lcom/vungle/ads/internal/ui/z;->a:Lcom/vungle/ads/internal/model/h0;

    .line 84
    .line 85
    invoke-virtual {v10, v8}, Lcom/vungle/ads/internal/model/h0;->a(Ljava/lang/String;)Lcom/vungle/ads/internal/model/b;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    if-eqz v10, :cond_5

    .line 90
    .line 91
    invoke-virtual {v10}, Lcom/vungle/ads/internal/model/b;->c()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    goto :goto_2

    .line 96
    :cond_5
    move-object v11, v6

    .line 97
    :goto_2
    if-eqz v11, :cond_1

    .line 98
    .line 99
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    if-nez v12, :cond_6

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_6
    new-instance v12, Ljava/io/File;

    .line 107
    .line 108
    invoke-direct {v12, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    if-nez v11, :cond_7

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_7
    invoke-virtual {v10}, Lcom/vungle/ads/internal/model/b;->b()J

    .line 119
    .line 120
    .line 121
    move-result-wide v13

    .line 122
    const-wide/16 v15, 0x0

    .line 123
    .line 124
    cmp-long v11, v13, v15

    .line 125
    .line 126
    if-gtz v11, :cond_8

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_8
    move-object v11, v7

    .line 130
    invoke-virtual {v12}, Ljava/io/File;->length()J

    .line 131
    .line 132
    .line 133
    move-result-wide v6

    .line 134
    move-wide/from16 v17, v15

    .line 135
    .line 136
    invoke-interface/range {p2 .. p2}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 137
    .line 138
    .line 139
    move-result-object v15

    .line 140
    const-string v2, "Range"

    .line 141
    .line 142
    invoke-interface {v15, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    check-cast v2, Ljava/lang/String;

    .line 147
    .line 148
    iget-object v15, v1, Lcom/vungle/ads/internal/ui/z;->s:Lcom/vungle/ads/internal/s1;

    .line 149
    .line 150
    new-instance v3, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    move-object/from16 v20, v11

    .line 159
    .line 160
    const-string v11, " cached:"

    .line 161
    .line 162
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const/16 v11, 0x20

    .line 169
    .line 170
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-virtual {v15, v3}, Lcom/vungle/ads/internal/h1;->a(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    sget-object v3, Lcom/vungle/ads/internal/AnalyticsClient;->INSTANCE:Lcom/vungle/ads/internal/AnalyticsClient;

    .line 184
    .line 185
    iget-object v15, v1, Lcom/vungle/ads/internal/ui/z;->s:Lcom/vungle/ads/internal/s1;

    .line 186
    .line 187
    iget-object v11, v1, Lcom/vungle/ads/internal/ui/z;->a:Lcom/vungle/ads/internal/model/h0;

    .line 188
    .line 189
    invoke-virtual {v11}, Lcom/vungle/ads/internal/model/h0;->q()Lcom/vungle/ads/internal/util/s;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    invoke-static {v3, v15, v11}, Lcom/vungle/ads/internal/AnalyticsClient;->a(Lcom/vungle/ads/internal/AnalyticsClient;Lcom/vungle/ads/internal/s1;Lcom/vungle/ads/internal/util/s;)V

    .line 194
    .line 195
    .line 196
    if-eqz v2, :cond_d

    .line 197
    .line 198
    const/4 v3, 0x0

    .line 199
    :try_start_0
    invoke-static {v2, v0, v3}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    const/4 v15, 0x1

    .line 204
    if-ne v11, v15, :cond_d

    .line 205
    .line 206
    invoke-static {v2, v0}, LBf/k;->E0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    const-string v11, "-"

    .line 211
    .line 212
    filled-new-array {v11}, [Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v11

    .line 216
    invoke-static {v0, v11}, LBf/k;->I0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-static {v3, v0}, Lff/o;->t0(ILjava/util/List;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    check-cast v11, Ljava/lang/String;

    .line 225
    .line 226
    if-eqz v11, :cond_9

    .line 227
    .line 228
    invoke-static {v11}, LBf/r;->m0(Ljava/lang/String;)Ljava/lang/Long;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    :goto_3
    const/4 v15, 0x1

    .line 233
    goto :goto_4

    .line 234
    :catchall_0
    move-exception v0

    .line 235
    goto :goto_7

    .line 236
    :cond_9
    const/4 v3, 0x0

    .line 237
    goto :goto_3

    .line 238
    :goto_4
    invoke-static {v15, v0}, Lff/o;->t0(ILjava/util/List;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    check-cast v0, Ljava/lang/String;

    .line 243
    .line 244
    if-eqz v0, :cond_a

    .line 245
    .line 246
    invoke-static {v0}, LBf/r;->m0(Ljava/lang/String;)Ljava/lang/Long;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    goto :goto_5

    .line 251
    :cond_a
    const/4 v0, 0x0

    .line 252
    :goto_5
    if-nez v3, :cond_c

    .line 253
    .line 254
    if-nez v0, :cond_b

    .line 255
    .line 256
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    goto :goto_6

    .line 261
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 262
    .line 263
    .line 264
    move-result-wide v21

    .line 265
    sub-long v21, v13, v21

    .line 266
    .line 267
    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    const/4 v0, 0x0

    .line 272
    :cond_c
    :goto_6
    new-instance v11, Lef/k;

    .line 273
    .line 274
    invoke-direct {v11, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    goto :goto_8

    .line 278
    :cond_d
    new-instance v11, Lef/k;

    .line 279
    .line 280
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    const/4 v3, 0x0

    .line 285
    invoke-direct {v11, v0, v3}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 286
    .line 287
    .line 288
    goto :goto_8

    .line 289
    :goto_7
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 290
    .line 291
    .line 292
    move-result-object v11

    .line 293
    :goto_8
    invoke-static {v11}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    if-nez v0, :cond_e

    .line 298
    .line 299
    goto :goto_9

    .line 300
    :cond_e
    new-instance v11, Lef/k;

    .line 301
    .line 302
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    const/4 v3, 0x0

    .line 307
    invoke-direct {v11, v0, v3}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    :goto_9
    check-cast v11, Lef/k;

    .line 311
    .line 312
    iget-object v0, v11, Lef/k;->a:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v0, Ljava/lang/Number;

    .line 315
    .line 316
    move-object v3, v0

    .line 317
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 318
    .line 319
    .line 320
    move-result-wide v0

    .line 321
    invoke-virtual {v10, v0, v1}, Lcom/vungle/ads/internal/model/b;->c(J)V

    .line 322
    .line 323
    .line 324
    iget-object v0, v11, Lef/k;->b:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v0, Ljava/lang/Long;

    .line 327
    .line 328
    invoke-virtual {v10, v0}, Lcom/vungle/ads/internal/model/b;->a(Ljava/lang/Long;)V

    .line 329
    .line 330
    .line 331
    move-object v1, v10

    .line 332
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 333
    .line 334
    .line 335
    move-result-wide v10

    .line 336
    move-object v15, v4

    .line 337
    sub-long v3, v6, v10

    .line 338
    .line 339
    sget-boolean v21, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 340
    .line 341
    move-object/from16 v21, v1

    .line 342
    .line 343
    new-instance v1, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    move-object/from16 v22, v15

    .line 346
    .line 347
    const-string v15, ">>request: "

    .line 348
    .line 349
    invoke-direct {v1, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    move-object/from16 v15, v20

    .line 353
    .line 354
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    const-string v15, " rangeStart="

    .line 358
    .line 359
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    const-string v15, " rangeEnd="

    .line 366
    .line 367
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    const-string v15, " cachedFileLength="

    .line 374
    .line 375
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    const-string v15, " availableBytes="

    .line 382
    .line 383
    move-object/from16 v20, v0

    .line 384
    .line 385
    const-string v0, " contentLength="

    .line 386
    .line 387
    invoke-static {v1, v15, v3, v4, v0}, LVa/M6;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    const/16 v15, 0x20

    .line 394
    .line 395
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-static {v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    cmp-long v0, v3, v17

    .line 406
    .line 407
    if-gtz v0, :cond_f

    .line 408
    .line 409
    new-instance v0, Lcom/vungle/ads/internal/ui/x;

    .line 410
    .line 411
    invoke-direct {v0, v2}, Lcom/vungle/ads/internal/ui/x;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    invoke-static {v9, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ltf/a;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v21 .. v21}, Lcom/vungle/ads/internal/model/b;->q()V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12}, Ljava/io/File;->length()J

    .line 421
    .line 422
    .line 423
    move-result-wide v6

    .line 424
    :cond_f
    const-wide/16 v0, 0x1

    .line 425
    .line 426
    if-eqz v20, :cond_10

    .line 427
    .line 428
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Long;->longValue()J

    .line 429
    .line 430
    .line 431
    move-result-wide v2

    .line 432
    goto :goto_a

    .line 433
    :cond_10
    sub-long v2, v6, v0

    .line 434
    .line 435
    :goto_a
    sub-long v6, v2, v10

    .line 436
    .line 437
    add-long/2addr v6, v0

    .line 438
    :try_start_1
    new-instance v0, Ljava/io/FileInputStream;

    .line 439
    .line 440
    invoke-direct {v0, v12}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 441
    .line 442
    .line 443
    new-instance v23, Landroid/webkit/WebResourceResponse;

    .line 444
    .line 445
    invoke-virtual/range {v21 .. v21}, Lcom/vungle/ads/internal/model/b;->d()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v24

    .line 449
    const-string v25, "UTF-8"

    .line 450
    .line 451
    const-string v27, "Partial Content"

    .line 452
    .line 453
    const-string v1, "Content-Type"

    .line 454
    .line 455
    invoke-virtual/range {v21 .. v21}, Lcom/vungle/ads/internal/model/b;->d()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v4

    .line 459
    new-instance v12, Lef/k;

    .line 460
    .line 461
    invoke-direct {v12, v1, v4}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    const-string v1, "Accept-Ranges"

    .line 465
    .line 466
    const-string v4, "bytes"

    .line 467
    .line 468
    new-instance v15, Lef/k;

    .line 469
    .line 470
    invoke-direct {v15, v1, v4}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    const-string v1, "Content-Length"

    .line 474
    .line 475
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v4

    .line 479
    new-instance v6, Lef/k;

    .line 480
    .line 481
    invoke-direct {v6, v1, v4}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    const-string v1, "Content-Range"

    .line 485
    .line 486
    new-instance v4, Ljava/lang/StringBuilder;

    .line 487
    .line 488
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v4, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    const/16 v5, 0x2d

    .line 495
    .line 496
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    const/16 v2, 0x2f

    .line 503
    .line 504
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v4, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    new-instance v3, Lef/k;

    .line 515
    .line 516
    invoke-direct {v3, v1, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    const/4 v1, 0x4

    .line 520
    new-array v1, v1, [Lef/k;

    .line 521
    .line 522
    const/16 v19, 0x0

    .line 523
    .line 524
    aput-object v12, v1, v19

    .line 525
    .line 526
    const/16 v16, 0x1

    .line 527
    .line 528
    aput-object v15, v1, v16

    .line 529
    .line 530
    const/4 v2, 0x2

    .line 531
    aput-object v6, v1, v2

    .line 532
    .line 533
    const/4 v2, 0x3

    .line 534
    aput-object v3, v1, v2

    .line 535
    .line 536
    invoke-static {v1}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 537
    .line 538
    .line 539
    move-result-object v28

    .line 540
    new-instance v1, Ljava/io/BufferedInputStream;

    .line 541
    .line 542
    const/16 v2, 0x400

    .line 543
    .line 544
    invoke-direct {v1, v0, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 545
    .line 546
    .line 547
    const/16 v26, 0xce

    .line 548
    .line 549
    move-object/from16 v29, v1

    .line 550
    .line 551
    invoke-direct/range {v23 .. v29}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V

    .line 552
    .line 553
    .line 554
    new-instance v0, Ljava/lang/StringBuilder;

    .line 555
    .line 556
    move-object/from16 v15, v22

    .line 557
    .line 558
    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual/range {v23 .. v23}, Landroid/webkit/WebResourceResponse;->getResponseHeaders()Ljava/util/Map;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-static {v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 573
    .line 574
    .line 575
    return-object v23

    .line 576
    :catchall_1
    move-exception v0

    .line 577
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-static {v0}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    if-eqz v0, :cond_11

    .line 586
    .line 587
    sget-boolean v1, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 588
    .line 589
    const-string v1, "Error serving local range video: "

    .line 590
    .line 591
    invoke-static {v1}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    invoke-static {v9, v1, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 607
    .line 608
    .line 609
    move-object/from16 v1, p0

    .line 610
    .line 611
    iget-object v2, v1, Lcom/vungle/ads/internal/ui/z;->t:Lcom/vungle/ads/internal/s1;

    .line 612
    .line 613
    new-instance v3, Ljava/lang/StringBuilder;

    .line 614
    .line 615
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    const/16 v15, 0x20

    .line 622
    .line 623
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    invoke-virtual {v2, v0}, Lcom/vungle/ads/internal/h1;->a(Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    sget-object v0, Lcom/vungle/ads/internal/AnalyticsClient;->INSTANCE:Lcom/vungle/ads/internal/AnalyticsClient;

    .line 641
    .line 642
    iget-object v2, v1, Lcom/vungle/ads/internal/ui/z;->t:Lcom/vungle/ads/internal/s1;

    .line 643
    .line 644
    iget-object v3, v1, Lcom/vungle/ads/internal/ui/z;->a:Lcom/vungle/ads/internal/model/h0;

    .line 645
    .line 646
    invoke-virtual {v3}, Lcom/vungle/ads/internal/model/h0;->q()Lcom/vungle/ads/internal/util/s;

    .line 647
    .line 648
    .line 649
    move-result-object v3

    .line 650
    invoke-static {v0, v2, v3}, Lcom/vungle/ads/internal/AnalyticsClient;->a(Lcom/vungle/ads/internal/AnalyticsClient;Lcom/vungle/ads/internal/s1;Lcom/vungle/ads/internal/util/s;)V

    .line 651
    .line 652
    .line 653
    :goto_b
    const/4 v3, 0x0

    .line 654
    goto :goto_c

    .line 655
    :cond_11
    move-object/from16 v1, p0

    .line 656
    .line 657
    goto :goto_b

    .line 658
    :goto_c
    return-object v3
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 12

    .line 1
    const/4 v7, 0x1

    .line 2
    const/4 v8, 0x0

    .line 3
    const-string v0, "Open URL"

    .line 4
    .line 5
    const-string v1, "url: "

    .line 6
    .line 7
    const-string v2, "VungleWebClient"

    .line 8
    .line 9
    const-string v3, "MRAID Command "

    .line 10
    .line 11
    :try_start_0
    sget-boolean v6, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 12
    .line 13
    new-instance v6, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {v2, v3}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    :cond_0
    move-object v9, v2

    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :cond_1
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const-string v6, "parse(this)"

    .line 44
    .line 45
    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    if-eqz v6, :cond_f

    .line 53
    .line 54
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-nez v6, :cond_2

    .line 59
    .line 60
    goto/16 :goto_5

    .line 61
    .line 62
    :cond_2
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    const-string v9, "mraid"

    .line 67
    .line 68
    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    const-string v10, "element"

    .line 73
    .line 74
    if-eqz v9, :cond_b

    .line 75
    .line 76
    move-object v9, v2

    .line 77
    :try_start_1
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    if-eqz v2, :cond_c

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    const v1, -0x73d81938

    .line 88
    .line 89
    .line 90
    if-eq v0, v1, :cond_7

    .line 91
    .line 92
    const v1, 0x54506bf

    .line 93
    .line 94
    .line 95
    if-eq v0, v1, :cond_5

    .line 96
    .line 97
    const v1, 0x72017d2

    .line 98
    .line 99
    .line 100
    if-eq v0, v1, :cond_3

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    const-string v0, "readyToPlay"

    .line 104
    .line 105
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_4

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_4
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/z;->c:Ljava/util/concurrent/ExecutorService;

    .line 113
    .line 114
    new-instance v1, LKb/b;

    .line 115
    .line 116
    invoke-direct {v1, p0, p1, v8}, LKb/b;-><init>(Lcom/vungle/ads/internal/ui/z;Landroid/webkit/WebView;I)V

    .line 117
    .line 118
    .line 119
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 120
    .line 121
    .line 122
    return v7

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    goto/16 :goto_4

    .line 125
    .line 126
    :cond_5
    const-string v0, "failToLoad"

    .line 127
    .line 128
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_6

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_6
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/z;->c:Ljava/util/concurrent/ExecutorService;

    .line 136
    .line 137
    new-instance v1, LKb/b;

    .line 138
    .line 139
    invoke-direct {v1, p0, p1, v7}, LKb/b;-><init>(Lcom/vungle/ads/internal/ui/z;Landroid/webkit/WebView;I)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 143
    .line 144
    .line 145
    return v7

    .line 146
    :cond_7
    const-string v0, "propertiesChangeCompleted"

    .line 147
    .line 148
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_8

    .line 153
    .line 154
    iget-boolean v0, p0, Lcom/vungle/ads/internal/ui/z;->n:Z

    .line 155
    .line 156
    if-nez v0, :cond_e

    .line 157
    .line 158
    iput-boolean v7, p0, Lcom/vungle/ads/internal/ui/z;->n:Z

    .line 159
    .line 160
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/z;->c:Ljava/util/concurrent/ExecutorService;

    .line 161
    .line 162
    new-instance v1, LKb/b;

    .line 163
    .line 164
    const/4 v2, 0x2

    .line 165
    invoke-direct {v1, p0, p1, v2}, LKb/b;-><init>(Lcom/vungle/ads/internal/ui/z;Landroid/webkit/WebView;I)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 169
    .line 170
    .line 171
    return v7

    .line 172
    :cond_8
    :goto_0
    iget-object v1, p0, Lcom/vungle/ads/internal/ui/z;->o:Lcom/vungle/ads/internal/ui/view/o;

    .line 173
    .line 174
    if-nez v1, :cond_9

    .line 175
    .line 176
    const-string v0, "window.vungle.mraidBridge.notifyCommandComplete()"

    .line 177
    .line 178
    invoke-virtual {p0, p1, v0}, Lcom/vungle/ads/internal/ui/z;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    return v7

    .line 182
    :cond_9
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 183
    .line 184
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v9

    .line 199
    if-eqz v9, :cond_a

    .line 200
    .line 201
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    check-cast v9, Ljava/lang/String;

    .line 206
    .line 207
    const-string v11, "param"

    .line 208
    .line 209
    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3, v9}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v11

    .line 216
    invoke-static {v11}, LXf/j;->b(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    .line 217
    .line 218
    .line 219
    move-result-object v11

    .line 220
    invoke-static {v11, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-interface {v0, v9, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v9

    .line 227
    check-cast v9, Lkotlinx/serialization/json/b;

    .line 228
    .line 229
    goto :goto_1

    .line 230
    :cond_a
    new-instance v3, Lkotlinx/serialization/json/c;

    .line 231
    .line 232
    invoke-direct {v3, v0}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    .line 233
    .line 234
    .line 235
    iget-object v9, p0, Lcom/vungle/ads/internal/ui/z;->c:Ljava/util/concurrent/ExecutorService;

    .line 236
    .line 237
    new-instance v0, LKb/c;

    .line 238
    .line 239
    const/4 v6, 0x0

    .line 240
    move-object v4, p0

    .line 241
    move-object v5, p1

    .line 242
    invoke-direct/range {v0 .. v6}, LKb/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 243
    .line 244
    .line 245
    invoke-interface {v9, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 246
    .line 247
    .line 248
    return v7

    .line 249
    :cond_b
    move-object v9, v2

    .line 250
    const-string v2, "http"

    .line 251
    .line 252
    invoke-virtual {v2, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    if-nez v2, :cond_d

    .line 257
    .line 258
    const-string v2, "https"

    .line 259
    .line 260
    invoke-virtual {v2, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    if-eqz v2, :cond_c

    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_c
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/z;->u:Lcom/vungle/ads/internal/m2;

    .line 268
    .line 269
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-virtual {v0, v1}, Lcom/vungle/ads/internal/h1;->a(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    sget-object v0, Lcom/vungle/ads/internal/AnalyticsClient;->INSTANCE:Lcom/vungle/ads/internal/AnalyticsClient;

    .line 277
    .line 278
    iget-object v1, p0, Lcom/vungle/ads/internal/ui/z;->u:Lcom/vungle/ads/internal/m2;

    .line 279
    .line 280
    iget-object v2, p0, Lcom/vungle/ads/internal/ui/z;->a:Lcom/vungle/ads/internal/model/h0;

    .line 281
    .line 282
    invoke-virtual {v2}, Lcom/vungle/ads/internal/model/h0;->q()Lcom/vungle/ads/internal/util/s;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    const/4 v3, 0x4

    .line 287
    invoke-static {v0, v1, v2, v3}, Lcom/vungle/ads/internal/AnalyticsClient;->a(Lcom/vungle/ads/internal/AnalyticsClient;Lcom/vungle/ads/internal/m2;Lcom/vungle/ads/internal/util/s;I)V

    .line 288
    .line 289
    .line 290
    new-instance v0, Lcom/vungle/ads/internal/ui/y;

    .line 291
    .line 292
    invoke-direct {v0, p2}, Lcom/vungle/ads/internal/ui/y;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-static {v9, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ltf/a;)V

    .line 296
    .line 297
    .line 298
    return v8

    .line 299
    :cond_d
    :goto_2
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-static {v9, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 304
    .line 305
    .line 306
    iget-object v0, p0, Lcom/vungle/ads/internal/ui/z;->o:Lcom/vungle/ads/internal/ui/view/o;

    .line 307
    .line 308
    if-eqz v0, :cond_e

    .line 309
    .line 310
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 311
    .line 312
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 313
    .line 314
    .line 315
    const-string v2, "url"

    .line 316
    .line 317
    invoke-static {p2}, LXf/j;->b(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    check-cast v2, Lkotlinx/serialization/json/b;

    .line 329
    .line 330
    new-instance v2, Lkotlinx/serialization/json/c;

    .line 331
    .line 332
    invoke-direct {v2, v1}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    .line 333
    .line 334
    .line 335
    const-string v1, "openNonMraid"

    .line 336
    .line 337
    check-cast v0, Lcom/vungle/ads/internal/presenter/r;

    .line 338
    .line 339
    invoke-virtual {v0, v1, v2}, Lcom/vungle/ads/internal/presenter/r;->a(Ljava/lang/String;Lkotlinx/serialization/json/c;)Z

    .line 340
    .line 341
    .line 342
    :cond_e
    return v7

    .line 343
    :goto_3
    const-string v0, "Invalid URL "

    .line 344
    .line 345
    invoke-static {v9, v0}, Lcom/vungle/ads/internal/util/t;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 346
    .line 347
    .line 348
    return v8

    .line 349
    :goto_4
    instance-of v0, v0, Ljava/lang/OutOfMemoryError;

    .line 350
    .line 351
    if-eqz v0, :cond_f

    .line 352
    .line 353
    new-instance v0, Lcom/vungle/ads/OutOfMemory;

    .line 354
    .line 355
    const-string v1, "mraid:"

    .line 356
    .line 357
    invoke-static {v1, p2}, Lcom/iab/omid/library/vungle/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    invoke-direct {v0, v1}, Lcom/vungle/ads/OutOfMemory;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v0}, Lcom/vungle/ads/VungleError;->logErrorNoReturnValue$vungle_ads_release()V

    .line 365
    .line 366
    .line 367
    :cond_f
    :goto_5
    return v8
.end method
