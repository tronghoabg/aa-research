.class public final Lcom/moloco/sdk/internal/publisher/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/j;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/internal/publisher/l0;

.field public final synthetic b:LX2/j;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/l0;LX2/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/i0;->a:Lcom/moloco/sdk/internal/publisher/l0;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/i0;->b:LX2/j;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 8
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v1, "FullscreenAdImpl"

    const-string v2, "Ad skip button shown, triggering callback"

    const/16 v5, 0xc

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 9
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/i0;->a:Lcom/moloco/sdk/internal/publisher/l0;

    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/l0;->t:LAf/q;

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {v0}, LAf/q;->invoke()Ljava/lang/Object;

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/i0;->b:LX2/j;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LX2/j;->a()V

    :cond_1
    return-void
.end method

.method public final a(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/i0;->a:Lcom/moloco/sdk/internal/publisher/l0;

    iget-object v1, v0, Lcom/moloco/sdk/internal/publisher/l0;->r:Lcom/moloco/sdk/internal/ortb/model/q;

    if-eqz v1, :cond_1

    .line 2
    iget-boolean v2, v1, Lcom/moloco/sdk/internal/ortb/model/q;->a:Z

    if-eqz v2, :cond_1

    if-eqz p1, :cond_0

    iget-boolean v2, v1, Lcom/moloco/sdk/internal/ortb/model/q;->b:Z

    if-eqz v2, :cond_1

    .line 3
    :cond_0
    iget-object v1, v1, Lcom/moloco/sdk/internal/ortb/model/q;->c:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 4
    iget-object v2, v0, Lcom/moloco/sdk/internal/publisher/l0;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

    .line 5
    invoke-virtual {v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;->a(Ljava/lang/String;)V

    .line 6
    :cond_1
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/l0;->s:LFf/d;

    if-eqz v0, :cond_2

    .line 7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, LFf/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/i0;->b:LX2/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/i0;->a:Lcom/moloco/sdk/internal/publisher/l0;

    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    const/4 v3, 0x0

    .line 9
    iget-object v1, v1, Lcom/moloco/sdk/internal/publisher/l0;->d:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v1, v3, v3, v2, v3}, Lcom/moloco/sdk/publisher/MolocoAdKt;->createAdInfo$default(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ILjava/lang/Object;)Lcom/moloco/sdk/publisher/MolocoAd;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, LX2/j;->V(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 16
    .line 17
    .line 18
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
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/i0;->a:Lcom/moloco/sdk/internal/publisher/l0;

    .line 7
    .line 8
    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_SHOW_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 9
    .line 10
    sget-object v2, Lff/w;->a:Lff/w;

    .line 11
    .line 12
    iget-object v3, v0, Lcom/moloco/sdk/internal/publisher/l0;->d:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v3, v1, p1, v2}, Lcom/moloco/sdk/internal/s;->a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;Ljava/util/Map;)Lcom/moloco/sdk/internal/r;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/internal/publisher/l0;->b(Lcom/moloco/sdk/internal/r;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
