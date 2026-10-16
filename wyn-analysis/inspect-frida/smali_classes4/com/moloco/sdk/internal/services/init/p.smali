.class public final Lcom/moloco/sdk/internal/services/init/p;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:Lcom/moloco/sdk/internal/services/init/s;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/moloco/sdk/publisher/MediationInfo;

.field public final synthetic e:Lcom/moloco/sdk/acm/recorder/b;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/init/s;Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/acm/recorder/b;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/init/p;->b:Lcom/moloco/sdk/internal/services/init/s;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/init/p;->c:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/internal/services/init/p;->d:Lcom/moloco/sdk/publisher/MediationInfo;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/moloco/sdk/internal/services/init/p;->e:Lcom/moloco/sdk/acm/recorder/b;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Llf/j;-><init>(ILjf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/services/init/p;

    .line 2
    .line 3
    iget-object v3, p0, Lcom/moloco/sdk/internal/services/init/p;->d:Lcom/moloco/sdk/publisher/MediationInfo;

    .line 4
    .line 5
    iget-object v4, p0, Lcom/moloco/sdk/internal/services/init/p;->e:Lcom/moloco/sdk/acm/recorder/b;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/moloco/sdk/internal/services/init/p;->b:Lcom/moloco/sdk/internal/services/init/s;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/moloco/sdk/internal/services/init/p;->c:Ljava/lang/String;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/internal/services/init/p;-><init>(Lcom/moloco/sdk/internal/services/init/s;Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/acm/recorder/b;Ljf/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/services/init/p;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/services/init/p;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/services/init/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v6, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v0, p0, Lcom/moloco/sdk/internal/services/init/p;->a:I

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object v7, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 26
    .line 27
    const/4 v10, 0x0

    .line 28
    const/4 v11, 0x0

    .line 29
    const-string v8, "InitService"

    .line 30
    .line 31
    const-string v9, "Async fetching init response"

    .line 32
    .line 33
    const/16 v12, 0xc

    .line 34
    .line 35
    const/4 v13, 0x0

    .line 36
    invoke-static/range {v7 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iput v1, p0, Lcom/moloco/sdk/internal/services/init/p;->a:I

    .line 40
    .line 41
    iget-object v0, p0, Lcom/moloco/sdk/internal/services/init/p;->b:Lcom/moloco/sdk/internal/services/init/s;

    .line 42
    .line 43
    iget-object v2, p0, Lcom/moloco/sdk/internal/services/init/p;->d:Lcom/moloco/sdk/publisher/MediationInfo;

    .line 44
    .line 45
    iget-object v3, p0, Lcom/moloco/sdk/internal/services/init/p;->e:Lcom/moloco/sdk/acm/recorder/b;

    .line 46
    .line 47
    iget-object v1, p0, Lcom/moloco/sdk/internal/services/init/p;->c:Ljava/lang/String;

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    move-object v5, p0

    .line 51
    invoke-virtual/range {v0 .. v5}, Lcom/moloco/sdk/internal/services/init/s;->a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/acm/recorder/b;ZLlf/c;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-ne v0, v6, :cond_2

    .line 56
    .line 57
    return-object v6

    .line 58
    :cond_2
    :goto_0
    sget-object v0, Lef/C;->a:Lef/C;

    .line 59
    .line 60
    return-object v0
.end method
