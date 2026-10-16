.class public final Lcom/moloco/sdk/acm/eventprocessing/d;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LS3/i;

.field public final synthetic d:Lcom/moloco/sdk/acm/db/b;

.field public final synthetic e:J

.field public final synthetic f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;LS3/i;Lcom/moloco/sdk/acm/db/b;JLjava/util/ArrayList;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/acm/eventprocessing/d;->b:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/acm/eventprocessing/d;->c:LS3/i;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/acm/eventprocessing/d;->d:Lcom/moloco/sdk/acm/db/b;

    .line 6
    .line 7
    iput-wide p4, p0, Lcom/moloco/sdk/acm/eventprocessing/d;->e:J

    .line 8
    .line 9
    iput-object p6, p0, Lcom/moloco/sdk/acm/eventprocessing/d;->f:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p7}, Llf/j;-><init>(ILjf/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 8

    .line 1
    new-instance v0, Lcom/moloco/sdk/acm/eventprocessing/d;

    .line 2
    .line 3
    iget-object v6, p0, Lcom/moloco/sdk/acm/eventprocessing/d;->f:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v3, p0, Lcom/moloco/sdk/acm/eventprocessing/d;->d:Lcom/moloco/sdk/acm/db/b;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/moloco/sdk/acm/eventprocessing/d;->b:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/moloco/sdk/acm/eventprocessing/d;->c:LS3/i;

    .line 10
    .line 11
    iget-wide v4, p0, Lcom/moloco/sdk/acm/eventprocessing/d;->e:J

    .line 12
    .line 13
    move-object v7, p2

    .line 14
    invoke-direct/range {v0 .. v7}, Lcom/moloco/sdk/acm/eventprocessing/d;-><init>(Ljava/lang/String;LS3/i;Lcom/moloco/sdk/acm/db/b;JLjava/util/ArrayList;Ljf/c;)V

    .line 15
    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/acm/eventprocessing/d;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/acm/eventprocessing/d;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/acm/eventprocessing/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v2, v1, Lcom/moloco/sdk/acm/eventprocessing/d;->a:I

    .line 6
    .line 7
    const-string v3, "EventProcessor"

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v6, v1, Lcom/moloco/sdk/acm/eventprocessing/d;->c:LS3/i;

    .line 12
    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    if-eq v2, v5, :cond_1

    .line 16
    .line 17
    if-ne v2, v4, :cond_0

    .line 18
    .line 19
    :try_start_0
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :catch_0
    move-exception v0

    .line 25
    goto :goto_2

    .line 26
    :catch_1
    move-exception v0

    .line 27
    goto :goto_3

    .line 28
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :cond_1
    :try_start_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :try_start_2
    new-instance v7, Lcom/moloco/sdk/acm/db/a;

    .line 44
    .line 45
    iget-object v10, v1, Lcom/moloco/sdk/acm/eventprocessing/d;->b:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v2, v6, LS3/i;->b:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 50
    .line 51
    .line 52
    move-result-wide v11

    .line 53
    iget-object v13, v1, Lcom/moloco/sdk/acm/eventprocessing/d;->d:Lcom/moloco/sdk/acm/db/b;

    .line 54
    .line 55
    iget-wide v8, v1, Lcom/moloco/sdk/acm/eventprocessing/d;->e:J

    .line 56
    .line 57
    new-instance v14, Ljava/lang/Long;

    .line 58
    .line 59
    invoke-direct {v14, v8, v9}, Ljava/lang/Long;-><init>(J)V

    .line 60
    .line 61
    .line 62
    iget-object v15, v1, Lcom/moloco/sdk/acm/eventprocessing/d;->f:Ljava/util/ArrayList;

    .line 63
    .line 64
    const-wide/16 v8, 0x0

    .line 65
    .line 66
    invoke-direct/range {v7 .. v15}, Lcom/moloco/sdk/acm/db/a;-><init>(JLjava/lang/String;JLcom/moloco/sdk/acm/db/b;Ljava/lang/Long;Ljava/util/List;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, v6, LS3/i;->a:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Lcom/moloco/sdk/acm/db/e;

    .line 72
    .line 73
    invoke-virtual {v2, v7}, Lcom/moloco/sdk/acm/db/e;->a(Lcom/moloco/sdk/acm/db/a;)V

    .line 74
    .line 75
    .line 76
    iget-object v2, v6, LS3/i;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, LC6/l;

    .line 79
    .line 80
    iput v5, v1, Lcom/moloco/sdk/acm/eventprocessing/d;->a:I

    .line 81
    .line 82
    invoke-virtual {v2, v1}, LC6/l;->m(Llf/c;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-ne v2, v0, :cond_3

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    :goto_0
    iget-object v2, v6, LS3/i;->d:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v2, Lb7/k;

    .line 92
    .line 93
    iput v4, v1, Lcom/moloco/sdk/acm/eventprocessing/d;->a:I

    .line 94
    .line 95
    invoke-virtual {v2, v1}, Lb7/k;->k(Lcom/moloco/sdk/acm/eventprocessing/d;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 99
    if-ne v2, v0, :cond_4

    .line 100
    .line 101
    :goto_1
    return-object v0

    .line 102
    :goto_2
    sget-object v2, Lcom/moloco/sdk/acm/services/e;->a:LKd/a;

    .line 103
    .line 104
    new-instance v2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string v4, "Unexpected error while processing event: "

    .line 107
    .line 108
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v3, v0}, Lcom/moloco/sdk/acm/services/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_4

    .line 126
    :goto_3
    sget-object v2, Lcom/moloco/sdk/acm/services/e;->a:LKd/a;

    .line 127
    .line 128
    new-instance v2, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string v4, "Database error: "

    .line 131
    .line 132
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v3, v0}, Lcom/moloco/sdk/acm/services/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    :cond_4
    :goto_4
    sget-object v0, Lef/C;->a:Lef/C;

    .line 150
    .line 151
    return-object v0
.end method
