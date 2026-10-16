.class public final Lcom/moloco/sdk/internal/ilrd/w;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:LC8/i;

.field public final synthetic c:J

.field public final synthetic d:Llf/j;


# direct methods
.method public constructor <init>(LC8/i;JLtf/l;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/w;->b:LC8/i;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/moloco/sdk/internal/ilrd/w;->c:J

    .line 4
    .line 5
    check-cast p4, Llf/j;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/moloco/sdk/internal/ilrd/w;->d:Llf/j;

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
    new-instance v0, Lcom/moloco/sdk/internal/ilrd/w;

    .line 2
    .line 3
    iget-object v4, p0, Lcom/moloco/sdk/internal/ilrd/w;->d:Llf/j;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/moloco/sdk/internal/ilrd/w;->b:LC8/i;

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/moloco/sdk/internal/ilrd/w;->c:J

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/internal/ilrd/w;-><init>(LC8/i;JLtf/l;Ljf/c;)V

    .line 11
    .line 12
    .line 13
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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/ilrd/w;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/ilrd/w;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/ilrd/w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v2, v0, Lcom/moloco/sdk/internal/ilrd/w;->a:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, v0, Lcom/moloco/sdk/internal/ilrd/w;->b:LC8/i;

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v1

    .line 26
    :cond_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, v4, LC8/i;->f:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Ljava/text/SimpleDateFormat;

    .line 32
    .line 33
    iget-object v5, v4, LC8/i;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, Lcom/moloco/sdk/internal/services/k;

    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v5

    .line 44
    iget-wide v7, v0, Lcom/moloco/sdk/internal/ilrd/w;->c:J

    .line 45
    .line 46
    invoke-static {v7, v8}, LCf/a;->d(J)J

    .line 47
    .line 48
    .line 49
    move-result-wide v9

    .line 50
    add-long/2addr v9, v5

    .line 51
    new-instance v5, Ljava/lang/Long;

    .line 52
    .line 53
    invoke-direct {v5, v9, v10}, Ljava/lang/Long;-><init>(J)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v5}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    sget-object v9, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 61
    .line 62
    new-instance v5, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v6, "Task "

    .line 65
    .line 66
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v6, v4, LC8/i;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v6, Ljava/lang/String;

    .line 72
    .line 73
    const-string v10, " scheduled at "

    .line 74
    .line 75
    invoke-static {v5, v6, v10, v2}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    const/4 v12, 0x0

    .line 80
    const/4 v13, 0x0

    .line 81
    const-string v10, "IlrdScheduler"

    .line 82
    .line 83
    const/16 v14, 0xc

    .line 84
    .line 85
    const/4 v15, 0x0

    .line 86
    invoke-static/range {v9 .. v15}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iput v3, v0, Lcom/moloco/sdk/internal/ilrd/w;->a:I

    .line 90
    .line 91
    invoke-static {v7, v8, v0}, LEf/H;->n(JLlf/c;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    if-ne v2, v1, :cond_2

    .line 96
    .line 97
    return-object v1

    .line 98
    :cond_2
    :goto_0
    iget-object v1, v4, LC8/i;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, LKd/a;

    .line 101
    .line 102
    new-instance v2, Lcom/moloco/sdk/internal/ilrd/v;

    .line 103
    .line 104
    iget-object v3, v0, Lcom/moloco/sdk/internal/ilrd/w;->d:Llf/j;

    .line 105
    .line 106
    const/4 v5, 0x0

    .line 107
    invoke-direct {v2, v4, v3, v5}, Lcom/moloco/sdk/internal/ilrd/v;-><init>(LC8/i;Ltf/l;Ljf/c;)V

    .line 108
    .line 109
    .line 110
    const/4 v3, 0x3

    .line 111
    invoke-static {v1, v5, v2, v3}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 112
    .line 113
    .line 114
    sget-object v1, Lef/C;->a:Lef/C;

    .line 115
    .line 116
    return-object v1
.end method
