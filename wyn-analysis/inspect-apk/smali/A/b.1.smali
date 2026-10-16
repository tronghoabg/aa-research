.class public final LA/b;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public a:LA/j;

.field public b:Lkotlin/jvm/internal/C;

.field public c:I

.field public final synthetic d:LA/e;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:LA/L;

.field public final synthetic g:J


# direct methods
.method public constructor <init>(LA/e;Ljava/lang/Object;LA/L;JLjf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA/b;->d:LA/e;

    .line 2
    .line 3
    iput-object p2, p0, LA/b;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, LA/b;->f:LA/L;

    .line 6
    .line 7
    iput-wide p4, p0, LA/b;->g:J

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1, p6}, Llf/j;-><init>(ILjf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljf/c;)Ljf/c;
    .locals 7

    .line 1
    new-instance v0, LA/b;

    .line 2
    .line 3
    iget-object v3, p0, LA/b;->f:LA/L;

    .line 4
    .line 5
    iget-object v1, p0, LA/b;->d:LA/e;

    .line 6
    .line 7
    iget-object v2, p0, LA/b;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iget-wide v4, p0, LA/b;->g:J

    .line 10
    .line 11
    move-object v6, p1

    .line 12
    invoke-direct/range {v0 .. v6}, LA/b;-><init>(LA/e;Ljava/lang/Object;LA/L;JLjf/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljf/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LA/b;->create(Ljf/c;)Ljf/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LA/b;

    .line 8
    .line 9
    sget-object v0, Lef/C;->a:Lef/C;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, LA/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    sget-object v6, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v0, v5, LA/b;->c:I

    .line 6
    .line 7
    const/4 v7, 0x1

    .line 8
    iget-object v8, v5, LA/b;->d:LA/e;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-ne v0, v7, :cond_0

    .line 13
    .line 14
    iget-object v0, v5, LA/b;->b:Lkotlin/jvm/internal/C;

    .line 15
    .line 16
    iget-object v1, v5, LA/b;->a:LA/j;

    .line 17
    .line 18
    :try_start_0
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :catch_0
    move-exception v0

    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :try_start_1
    iget-object v0, v8, LA/e;->c:LA/j;

    .line 38
    .line 39
    iget-object v1, v8, LA/e;->a:LS3/e;

    .line 40
    .line 41
    iget-object v1, v1, LS3/e;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lkotlin/jvm/internal/n;

    .line 44
    .line 45
    iget-object v2, v5, LA/b;->e:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-interface {v1, v2}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, LA/n;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const-string v2, "<set-?>"

    .line 57
    .line 58
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iput-object v1, v0, LA/j;->g:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 62
    .line 63
    iget-object v1, v5, LA/b;->f:LA/L;

    .line 64
    .line 65
    :try_start_2
    iget-object v0, v1, LA/L;->d:Ljava/lang/Object;

    .line 66
    .line 67
    iget-object v2, v8, LA/e;->e:LN/Y;

    .line 68
    .line 69
    invoke-virtual {v2, v0}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 73
    .line 74
    iget-object v2, v8, LA/e;->d:LN/Y;

    .line 75
    .line 76
    invoke-virtual {v2, v0}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, v8, LA/e;->c:LA/j;

    .line 80
    .line 81
    iget-object v2, v0, LA/j;->f:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, LN/Y;

    .line 84
    .line 85
    invoke-virtual {v2}, LN/Y;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v11

    .line 89
    iget-object v2, v0, LA/j;->g:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v2, LA/n;

    .line 92
    .line 93
    invoke-static {v2}, LA/t;->c(LA/n;)LA/n;

    .line 94
    .line 95
    .line 96
    move-result-object v12

    .line 97
    iget-wide v13, v0, LA/j;->b:J

    .line 98
    .line 99
    iget-boolean v2, v0, LA/j;->d:Z

    .line 100
    .line 101
    new-instance v9, LA/j;

    .line 102
    .line 103
    iget-object v0, v0, LA/j;->e:Ljava/lang/Object;

    .line 104
    .line 105
    move-object v10, v0

    .line 106
    check-cast v10, LS3/e;

    .line 107
    .line 108
    const-wide/high16 v15, -0x8000000000000000L

    .line 109
    .line 110
    move/from16 v17, v2

    .line 111
    .line 112
    invoke-direct/range {v9 .. v17}, LA/j;-><init>(LS3/e;Ljava/lang/Object;LA/n;JJZ)V

    .line 113
    .line 114
    .line 115
    move-object v0, v9

    .line 116
    new-instance v9, Lkotlin/jvm/internal/C;

    .line 117
    .line 118
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    iget-wide v2, v5, LA/b;->g:J

    .line 122
    .line 123
    new-instance v4, LA/a;

    .line 124
    .line 125
    const/4 v10, 0x0

    .line 126
    invoke-direct {v4, v8, v0, v9, v10}, LA/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 127
    .line 128
    .line 129
    iput-object v0, v5, LA/b;->a:LA/j;

    .line 130
    .line 131
    iput-object v9, v5, LA/b;->b:Lkotlin/jvm/internal/C;

    .line 132
    .line 133
    iput v7, v5, LA/b;->c:I

    .line 134
    .line 135
    invoke-static/range {v0 .. v5}, LA/t;->b(LA/j;LA/L;JLA/a;Llf/c;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    if-ne v1, v6, :cond_2

    .line 140
    .line 141
    return-object v6

    .line 142
    :cond_2
    move-object v1, v0

    .line 143
    move-object v0, v9

    .line 144
    :goto_0
    iget-boolean v0, v0, Lkotlin/jvm/internal/C;->a:Z

    .line 145
    .line 146
    if-eqz v0, :cond_3

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_3
    const/4 v7, 0x2

    .line 150
    :goto_1
    invoke-static {v8}, LA/e;->b(LA/e;)V

    .line 151
    .line 152
    .line 153
    new-instance v0, LA/g;

    .line 154
    .line 155
    invoke-direct {v0, v1, v7}, LA/g;-><init>(LA/j;I)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 156
    .line 157
    .line 158
    return-object v0

    .line 159
    :goto_2
    invoke-static {v8}, LA/e;->b(LA/e;)V

    .line 160
    .line 161
    .line 162
    throw v0
.end method
