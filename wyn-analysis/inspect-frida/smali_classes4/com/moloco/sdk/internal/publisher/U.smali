.class public final Lcom/moloco/sdk/internal/publisher/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/r;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/internal/publisher/V;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/V;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/U;->a:Lcom/moloco/sdk/internal/publisher/V;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .line 2
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/U;->a:Lcom/moloco/sdk/internal/publisher/V;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/moloco/sdk/internal/publisher/V;->v:LY2/B;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/V;->d:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x6

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v0, v3, v3, v2, v3}, Lcom/moloco/sdk/publisher/MolocoAdKt;->createAdInfo$default(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ILjava/lang/Object;)Lcom/moloco/sdk/publisher/MolocoAd;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string v2, "molocoAd"

    .line 19
    .line 20
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, v1, LY2/B;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lcom/moloco/sdk/internal/publisher/b;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lcom/moloco/sdk/internal/publisher/b;->c(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V
    .locals 4

    .line 1
    const-string v0, "internalShowError"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/U;->a:Lcom/moloco/sdk/internal/publisher/V;

    .line 7
    .line 8
    iget-object v1, v0, Lcom/moloco/sdk/internal/publisher/V;->d:Ljava/lang/String;

    .line 9
    .line 10
    sget-object v2, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_SHOW_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 11
    .line 12
    sget-object v3, Lff/w;->a:Lff/w;

    .line 13
    .line 14
    invoke-static {v1, v2, p1, v3}, Lcom/moloco/sdk/internal/s;->a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;Ljava/util/Map;)Lcom/moloco/sdk/internal/r;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/internal/publisher/V;->b(Lcom/moloco/sdk/internal/r;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
