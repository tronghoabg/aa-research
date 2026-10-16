.class public final Lcom/moloco/sdk/internal/publisher/x;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/internal/publisher/B;

.field public final synthetic b:Lcom/moloco/sdk/internal/publisher/C;

.field public final synthetic c:Lcom/moloco/sdk/internal/ortb/model/u;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/B;Lcom/moloco/sdk/internal/publisher/C;Lcom/moloco/sdk/internal/ortb/model/u;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/x;->a:Lcom/moloco/sdk/internal/publisher/B;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/x;->b:Lcom/moloco/sdk/internal/publisher/C;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/x;->c:Lcom/moloco/sdk/internal/ortb/model/u;

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
    new-instance p1, Lcom/moloco/sdk/internal/publisher/x;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/x;->b:Lcom/moloco/sdk/internal/publisher/C;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/x;->c:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/x;->a:Lcom/moloco/sdk/internal/publisher/B;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, Lcom/moloco/sdk/internal/publisher/x;-><init>(Lcom/moloco/sdk/internal/publisher/B;Lcom/moloco/sdk/internal/publisher/C;Lcom/moloco/sdk/internal/ortb/model/u;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/x;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/publisher/x;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/moloco/sdk/internal/publisher/x;->a:Lcom/moloco/sdk/internal/publisher/B;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p1, Lcom/moloco/sdk/internal/publisher/B;->k:Z

    .line 10
    .line 11
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/x;->c:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/Float;

    .line 14
    .line 15
    iget v2, v0, Lcom/moloco/sdk/internal/ortb/model/u;->b:F

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/Float;-><init>(F)V

    .line 18
    .line 19
    .line 20
    iget-object v2, p1, Lcom/moloco/sdk/internal/publisher/B;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/moloco/sdk/internal/ortb/model/u;->e:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v2, v1, v0}, Lcom/moloco/sdk/publisher/MolocoAdKt;->createAdInfo(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lcom/moloco/sdk/publisher/MolocoAd;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p1, Lcom/moloco/sdk/internal/publisher/B;->m:Lcom/moloco/sdk/internal/ortb/model/y;

    .line 29
    .line 30
    invoke-static {p1, v1}, Lcom/moloco/sdk/internal/publisher/B;->a(Lcom/moloco/sdk/internal/publisher/B;Lcom/moloco/sdk/internal/ortb/model/y;)Lcom/moloco/sdk/internal/ortb/model/u;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    iget-object p1, p1, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    iget-object p1, p1, Lcom/moloco/sdk/internal/ortb/model/w;->d:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    :goto_0
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/x;->b:Lcom/moloco/sdk/internal/publisher/C;

    .line 45
    .line 46
    invoke-virtual {v1, v0, p1}, Lcom/moloco/sdk/internal/publisher/C;->c(Lcom/moloco/sdk/publisher/MolocoAd;Lcom/moloco/sdk/internal/ortb/model/d;)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Lef/C;->a:Lef/C;

    .line 50
    .line 51
    return-object p1
.end method
