.class public final Lcom/moloco/sdk/internal/services/t;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/internal/services/u;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/u;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/t;->a:Lcom/moloco/sdk/internal/services/u;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/moloco/sdk/internal/services/t;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/moloco/sdk/internal/services/t;->a:Lcom/moloco/sdk/internal/services/u;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/moloco/sdk/internal/services/t;-><init>(Lcom/moloco/sdk/internal/services/u;Ljf/c;)V

    .line 6
    .line 7
    .line 8
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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/services/t;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/services/t;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/services/t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 7
    .line 8
    const-string v3, "Tracking next bg / fg of the application"

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const-string v2, "AnalyticsApplicationLifecycleTrackerImpl"

    .line 12
    .line 13
    const/4 v5, 0x4

    .line 14
    const/4 v6, 0x0

    .line 15
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/moloco/sdk/internal/services/t;->a:Lcom/moloco/sdk/internal/services/u;

    .line 19
    .line 20
    iget-boolean v0, p1, Lcom/moloco/sdk/internal/services/u;->d:Z

    .line 21
    .line 22
    const/4 v7, 0x1

    .line 23
    iget-object v8, p1, Lcom/moloco/sdk/internal/services/u;->b:Lcom/moloco/sdk/internal/services/m;

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const-string v3, "Observing application lifecycle events"

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    const-string v2, "AnalyticsApplicationLifecycleTrackerImpl"

    .line 31
    .line 32
    const/4 v5, 0x4

    .line 33
    const/4 v6, 0x0

    .line 34
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p1, Lcom/moloco/sdk/internal/services/u;->a:Landroidx/lifecycle/o;

    .line 38
    .line 39
    invoke-virtual {v0, v8}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/u;)V

    .line 40
    .line 41
    .line 42
    iput-boolean v7, p1, Lcom/moloco/sdk/internal/services/u;->d:Z

    .line 43
    .line 44
    :cond_0
    iput-boolean v7, v8, Lcom/moloco/sdk/internal/services/m;->d:Z

    .line 45
    .line 46
    sget-object p1, Lef/C;->a:Lef/C;

    .line 47
    .line 48
    return-object p1
.end method
