.class public final Lcom/moloco/sdk/internal/services/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/moloco/sdk/internal/services/v;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/moloco/sdk/internal/services/v;)V
    .locals 1

    .line 1
    const-string v0, "deviceInfoService"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/c;->a:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/c;->b:Lcom/moloco/sdk/internal/services/v;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()LBa/c;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/services/c;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "connectivity"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "null cannot be cast to non-null type android.net.ConnectivityManager"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sget-object v2, Lcom/moloco/sdk/internal/services/b;->j:Lcom/moloco/sdk/internal/services/b;

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x1

    .line 37
    invoke-virtual {v0, v1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    sget-object v0, Lcom/moloco/sdk/internal/services/b;->k:Lcom/moloco/sdk/internal/services/b;

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    const/4 v1, 0x0

    .line 47
    invoke-virtual {v0, v1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    new-instance v0, Lcom/moloco/sdk/internal/services/a;

    .line 54
    .line 55
    iget-object v1, p0, Lcom/moloco/sdk/internal/services/c;->b:Lcom/moloco/sdk/internal/services/v;

    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/moloco/sdk/internal/services/v;->a()Lcom/moloco/sdk/internal/services/F;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object v1, v1, Lcom/moloco/sdk/internal/services/F;->g:Ljava/lang/String;

    .line 62
    .line 63
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/a;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_3
    :goto_0
    return-object v2
.end method
