.class public final Lcom/moloco/sdk/internal/publisher/z;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/internal/publisher/B;

.field public final synthetic b:Lcom/moloco/sdk/internal/publisher/C;

.field public final synthetic c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/B;Lcom/moloco/sdk/internal/publisher/C;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/z;->a:Lcom/moloco/sdk/internal/publisher/B;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/z;->b:Lcom/moloco/sdk/internal/publisher/C;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/z;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Llf/j;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/moloco/sdk/internal/publisher/z;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/z;->b:Lcom/moloco/sdk/internal/publisher/C;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/z;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/z;->a:Lcom/moloco/sdk/internal/publisher/B;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, Lcom/moloco/sdk/internal/publisher/z;-><init>(Lcom/moloco/sdk/internal/publisher/B;Lcom/moloco/sdk/internal/publisher/C;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;Ljf/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/z;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/publisher/z;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/moloco/sdk/internal/publisher/z;->a:Lcom/moloco/sdk/internal/publisher/B;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p1, Lcom/moloco/sdk/internal/publisher/B;->k:Z

    .line 10
    .line 11
    sget-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_TIMEOUT_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/z;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;

    .line 14
    .line 15
    sget-object v2, Lff/w;->a:Lff/w;

    .line 16
    .line 17
    iget-object v3, p1, Lcom/moloco/sdk/internal/publisher/B;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v3, v0, v1, v2}, Lcom/moloco/sdk/internal/s;->a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;Ljava/util/Map;)Lcom/moloco/sdk/internal/r;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p1, Lcom/moloco/sdk/internal/publisher/B;->m:Lcom/moloco/sdk/internal/ortb/model/y;

    .line 24
    .line 25
    invoke-static {p1, v1}, Lcom/moloco/sdk/internal/publisher/B;->a(Lcom/moloco/sdk/internal/publisher/B;Lcom/moloco/sdk/internal/ortb/model/y;)Lcom/moloco/sdk/internal/ortb/model/u;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p1, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    iget-object p1, p1, Lcom/moloco/sdk/internal/ortb/model/w;->d:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    :goto_0
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/z;->b:Lcom/moloco/sdk/internal/publisher/C;

    .line 40
    .line 41
    invoke-virtual {v1, v0, p1}, Lcom/moloco/sdk/internal/publisher/C;->a(Lcom/moloco/sdk/internal/r;Lcom/moloco/sdk/internal/ortb/model/d;)V

    .line 42
    .line 43
    .line 44
    sget-object p1, Lef/C;->a:Lef/C;

    .line 45
    .line 46
    return-object p1
.end method
