.class public final Lcom/moloco/sdk/internal/publisher/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/moloco/sdk/internal/ortb/e;

.field public final b:Landroidx/fragment/app/X;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/ortb/e;Landroidx/fragment/app/X;)V
    .locals 1

    .line 1
    const-string v0, "bidResponseParser"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/a0;->a:Lcom/moloco/sdk/internal/ortb/e;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/a0;->b:Landroidx/fragment/app/X;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Llf/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, Lcom/moloco/sdk/internal/publisher/X;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/moloco/sdk/internal/publisher/X;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/internal/publisher/X;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/moloco/sdk/internal/publisher/X;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/internal/publisher/X;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/moloco/sdk/internal/publisher/X;-><init>(Lcom/moloco/sdk/internal/publisher/a0;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/moloco/sdk/internal/publisher/X;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/internal/publisher/X;->e:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object p3

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    iget-object p1, v0, Lcom/moloco/sdk/internal/publisher/X;->b:Ljava/lang/String;

    .line 52
    .line 53
    iget-object p2, v0, Lcom/moloco/sdk/internal/publisher/X;->a:Lcom/moloco/sdk/internal/publisher/a0;

    .line 54
    .line 55
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object v5, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 63
    .line 64
    const-string p3, "parse() called with bidResponseJson: "

    .line 65
    .line 66
    invoke-static {p3, p2}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    const-string v6, "BidLoader"

    .line 71
    .line 72
    const/4 v8, 0x0

    .line 73
    const/4 v9, 0x4

    .line 74
    const/4 v10, 0x0

    .line 75
    invoke-static/range {v5 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iput-object p0, v0, Lcom/moloco/sdk/internal/publisher/X;->a:Lcom/moloco/sdk/internal/publisher/a0;

    .line 79
    .line 80
    iput-object p1, v0, Lcom/moloco/sdk/internal/publisher/X;->b:Ljava/lang/String;

    .line 81
    .line 82
    iput v4, v0, Lcom/moloco/sdk/internal/publisher/X;->e:I

    .line 83
    .line 84
    invoke-virtual {p0, p2, v0}, Lcom/moloco/sdk/internal/publisher/a0;->b(Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    if-ne p3, v1, :cond_4

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_4
    move-object p2, p0

    .line 92
    :goto_1
    check-cast p3, Ljava/lang/String;

    .line 93
    .line 94
    if-nez p3, :cond_5

    .line 95
    .line 96
    sget-object p2, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_BID_PARSE_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 97
    .line 98
    sget-object p3, Lcom/moloco/sdk/internal/o;->a:Lcom/moloco/sdk/internal/o;

    .line 99
    .line 100
    sget-object v0, Lff/w;->a:Lff/w;

    .line 101
    .line 102
    invoke-static {p1, p2, p3, v0}, Lcom/moloco/sdk/internal/s;->a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;Ljava/util/Map;)Lcom/moloco/sdk/internal/r;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    new-instance p2, Lcom/moloco/sdk/internal/y;

    .line 107
    .line 108
    invoke-direct {p2, p1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    return-object p2

    .line 112
    :cond_5
    sget-object v4, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 113
    .line 114
    const/4 v7, 0x0

    .line 115
    const/4 v8, 0x0

    .line 116
    const-string v5, "BidLoader"

    .line 117
    .line 118
    const-string v6, "Processed the bidResponse, proceeding with parsing it."

    .line 119
    .line 120
    const/16 v9, 0xc

    .line 121
    .line 122
    const/4 v10, 0x0

    .line 123
    invoke-static/range {v4 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    const/4 v2, 0x0

    .line 127
    iput-object v2, v0, Lcom/moloco/sdk/internal/publisher/X;->a:Lcom/moloco/sdk/internal/publisher/a0;

    .line 128
    .line 129
    iput-object v2, v0, Lcom/moloco/sdk/internal/publisher/X;->b:Ljava/lang/String;

    .line 130
    .line 131
    iput v3, v0, Lcom/moloco/sdk/internal/publisher/X;->e:I

    .line 132
    .line 133
    invoke-virtual {p2, p3, p1, v0}, Lcom/moloco/sdk/internal/publisher/a0;->c(Ljava/lang/String;Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    if-ne p1, v1, :cond_6

    .line 138
    .line 139
    :goto_2
    return-object v1

    .line 140
    :cond_6
    return-object p1
.end method

.method public final b(Ljava/lang/String;Llf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lcom/moloco/sdk/internal/publisher/Z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/moloco/sdk/internal/publisher/Z;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/internal/publisher/Z;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/moloco/sdk/internal/publisher/Z;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/internal/publisher/Z;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/moloco/sdk/internal/publisher/Z;-><init>(Lcom/moloco/sdk/internal/publisher/a0;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/moloco/sdk/internal/publisher/Z;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/internal/publisher/Z;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lcom/moloco/sdk/internal/publisher/Z;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, v0, Lcom/moloco/sdk/internal/publisher/Z;->a:Ljava/lang/String;

    .line 54
    .line 55
    iput v3, v0, Lcom/moloco/sdk/internal/publisher/Z;->d:I

    .line 56
    .line 57
    iget-object p2, p0, Lcom/moloco/sdk/internal/publisher/a0;->b:Landroidx/fragment/app/X;

    .line 58
    .line 59
    sget-object v2, LEf/S;->a:LLf/e;

    .line 60
    .line 61
    new-instance v3, Lcom/moloco/sdk/internal/publisher/W;

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    invoke-direct {v3, p2, p1, v4}, Lcom/moloco/sdk/internal/publisher/W;-><init>(Landroidx/fragment/app/X;Ljava/lang/String;Ljf/c;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v2, v3, v0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    if-ne p2, v1, :cond_3

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/String;

    .line 75
    .line 76
    if-eqz p2, :cond_4

    .line 77
    .line 78
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    const/4 v4, 0x0

    .line 82
    const-string v1, "BidLoader"

    .line 83
    .line 84
    const-string v2, "Found no pre-preprocessor for the current mediation. Returning the original bid response."

    .line 85
    .line 86
    const/16 v5, 0xc

    .line 87
    .line 88
    const/4 v6, 0x0

    .line 89
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    return-object p2

    .line 93
    :cond_4
    return-object p1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Llf/c;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    instance-of v4, v1, Lcom/moloco/sdk/internal/publisher/Y;

    .line 9
    .line 10
    if-eqz v4, :cond_0

    .line 11
    .line 12
    move-object v4, v1

    .line 13
    check-cast v4, Lcom/moloco/sdk/internal/publisher/Y;

    .line 14
    .line 15
    iget v5, v4, Lcom/moloco/sdk/internal/publisher/Y;->e:I

    .line 16
    .line 17
    const/high16 v6, -0x80000000

    .line 18
    .line 19
    and-int v7, v5, v6

    .line 20
    .line 21
    if-eqz v7, :cond_0

    .line 22
    .line 23
    sub-int/2addr v5, v6

    .line 24
    iput v5, v4, Lcom/moloco/sdk/internal/publisher/Y;->e:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v4, Lcom/moloco/sdk/internal/publisher/Y;

    .line 28
    .line 29
    invoke-direct {v4, v0, v1}, Lcom/moloco/sdk/internal/publisher/Y;-><init>(Lcom/moloco/sdk/internal/publisher/a0;Llf/c;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget-object v1, v4, Lcom/moloco/sdk/internal/publisher/Y;->c:Ljava/lang/Object;

    .line 33
    .line 34
    sget-object v5, Lkf/a;->a:Lkf/a;

    .line 35
    .line 36
    iget v6, v4, Lcom/moloco/sdk/internal/publisher/Y;->e:I

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x1

    .line 40
    if-eqz v6, :cond_2

    .line 41
    .line 42
    if-ne v6, v8, :cond_1

    .line 43
    .line 44
    iget-object v5, v4, Lcom/moloco/sdk/internal/publisher/Y;->b:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v4, v4, Lcom/moloco/sdk/internal/publisher/Y;->a:Lcom/moloco/sdk/internal/publisher/a0;

    .line 47
    .line 48
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    move-object/from16 v18, v4

    .line 52
    .line 53
    move-object v4, v1

    .line 54
    move-object v1, v5

    .line 55
    move-object/from16 v5, v18

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v1

    .line 66
    :cond_2
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iput-object v0, v4, Lcom/moloco/sdk/internal/publisher/Y;->a:Lcom/moloco/sdk/internal/publisher/a0;

    .line 70
    .line 71
    move-object/from16 v1, p2

    .line 72
    .line 73
    iput-object v1, v4, Lcom/moloco/sdk/internal/publisher/Y;->b:Ljava/lang/String;

    .line 74
    .line 75
    iput v8, v4, Lcom/moloco/sdk/internal/publisher/Y;->e:I

    .line 76
    .line 77
    iget-object v6, v0, Lcom/moloco/sdk/internal/publisher/a0;->a:Lcom/moloco/sdk/internal/ortb/e;

    .line 78
    .line 79
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    sget-object v8, LEf/S;->a:LLf/e;

    .line 83
    .line 84
    sget-object v8, LLf/d;->b:LLf/d;

    .line 85
    .line 86
    new-instance v9, Lcom/moloco/sdk/internal/ortb/d;

    .line 87
    .line 88
    move-object/from16 v10, p1

    .line 89
    .line 90
    invoke-direct {v9, v6, v10, v7}, Lcom/moloco/sdk/internal/ortb/d;-><init>(Lcom/moloco/sdk/internal/ortb/e;Ljava/lang/String;Ljf/c;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v8, v9, v4}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    if-ne v4, v5, :cond_3

    .line 98
    .line 99
    return-object v5

    .line 100
    :cond_3
    move-object v5, v0

    .line 101
    :goto_1
    check-cast v4, Lcom/moloco/sdk/internal/A;

    .line 102
    .line 103
    instance-of v6, v4, Lcom/moloco/sdk/internal/y;

    .line 104
    .line 105
    if-eqz v6, :cond_f

    .line 106
    .line 107
    check-cast v4, Lcom/moloco/sdk/internal/y;

    .line 108
    .line 109
    iget-object v6, v4, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v6, Lcom/moloco/sdk/internal/ortb/c;

    .line 112
    .line 113
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    instance-of v5, v6, Lcom/moloco/sdk/internal/ortb/a;

    .line 117
    .line 118
    if-eqz v5, :cond_4

    .line 119
    .line 120
    sget-object v2, Lcom/moloco/sdk/internal/o;->b:Lcom/moloco/sdk/internal/o;

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    instance-of v5, v6, Lcom/moloco/sdk/internal/ortb/b;

    .line 124
    .line 125
    if-eqz v5, :cond_e

    .line 126
    .line 127
    sget-object v2, Lcom/moloco/sdk/internal/o;->c:Lcom/moloco/sdk/internal/o;

    .line 128
    .line 129
    :goto_2
    iget-object v3, v4, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 130
    .line 131
    instance-of v4, v3, Lcom/moloco/sdk/internal/ortb/a;

    .line 132
    .line 133
    if-eqz v4, :cond_5

    .line 134
    .line 135
    move-object v4, v3

    .line 136
    check-cast v4, Lcom/moloco/sdk/internal/ortb/a;

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_5
    move-object v4, v7

    .line 140
    :goto_3
    if-eqz v4, :cond_6

    .line 141
    .line 142
    iget-object v4, v4, Lcom/moloco/sdk/internal/ortb/a;->a:Ljava/lang/Exception;

    .line 143
    .line 144
    move-object v11, v4

    .line 145
    goto :goto_4

    .line 146
    :cond_6
    move-object v11, v7

    .line 147
    :goto_4
    instance-of v4, v3, Lcom/moloco/sdk/internal/ortb/b;

    .line 148
    .line 149
    if-eqz v4, :cond_7

    .line 150
    .line 151
    check-cast v3, Lcom/moloco/sdk/internal/ortb/b;

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_7
    move-object v3, v7

    .line 155
    :goto_5
    if-eqz v3, :cond_8

    .line 156
    .line 157
    iget-object v3, v3, Lcom/moloco/sdk/internal/ortb/b;->a:Ljava/util/ArrayList;

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_8
    move-object v3, v7

    .line 161
    :goto_6
    if-eqz v3, :cond_a

    .line 162
    .line 163
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-nez v4, :cond_9

    .line 168
    .line 169
    move-object v12, v3

    .line 170
    goto :goto_7

    .line 171
    :cond_9
    move-object v12, v7

    .line 172
    :goto_7
    if-eqz v12, :cond_a

    .line 173
    .line 174
    const/4 v15, 0x0

    .line 175
    const/16 v16, 0x0

    .line 176
    .line 177
    const-string v13, ","

    .line 178
    .line 179
    const-string v14, " missingFields="

    .line 180
    .line 181
    const/16 v17, 0x3c

    .line 182
    .line 183
    invoke-static/range {v12 .. v17}, Lff/o;->w0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltf/l;I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    if-nez v4, :cond_b

    .line 188
    .line 189
    :cond_a
    const-string v4, ""

    .line 190
    .line 191
    :cond_b
    sget-object v8, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 192
    .line 193
    new-instance v5, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    const-string v6, "parseBidResponse failed to parse BID json string. subType="

    .line 196
    .line 197
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    const-string v9, "BidLoader"

    .line 211
    .line 212
    const/4 v12, 0x0

    .line 213
    const/16 v13, 0x8

    .line 214
    .line 215
    const/4 v14, 0x0

    .line 216
    invoke-static/range {v8 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    sget-object v4, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_BID_PARSE_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 220
    .line 221
    if-eqz v3, :cond_d

    .line 222
    .line 223
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    if-nez v5, :cond_c

    .line 228
    .line 229
    move-object v8, v3

    .line 230
    goto :goto_8

    .line 231
    :cond_c
    move-object v8, v7

    .line 232
    :goto_8
    if-eqz v8, :cond_d

    .line 233
    .line 234
    const/4 v11, 0x0

    .line 235
    const/4 v12, 0x0

    .line 236
    const-string v9, ","

    .line 237
    .line 238
    const/4 v10, 0x0

    .line 239
    const/16 v13, 0x3e

    .line 240
    .line 241
    invoke-static/range {v8 .. v13}, Lff/o;->w0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltf/l;I)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    if-eqz v3, :cond_d

    .line 246
    .line 247
    new-instance v5, Lef/k;

    .line 248
    .line 249
    const-string v6, "missing_fields"

    .line 250
    .line 251
    invoke-direct {v5, v6, v3}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    invoke-static {v5}, Lff/B;->E(Lef/k;)Ljava/util/Map;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    goto :goto_9

    .line 259
    :cond_d
    sget-object v3, Lff/w;->a:Lff/w;

    .line 260
    .line 261
    :goto_9
    invoke-static {v1, v4, v2, v3}, Lcom/moloco/sdk/internal/s;->a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;Ljava/util/Map;)Lcom/moloco/sdk/internal/r;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    new-instance v2, Lcom/moloco/sdk/internal/y;

    .line 266
    .line 267
    invoke-direct {v2, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    return-object v2

    .line 271
    :cond_e
    new-instance v1, LE5/Q;

    .line 272
    .line 273
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 274
    .line 275
    .line 276
    throw v1

    .line 277
    :cond_f
    instance-of v1, v4, Lcom/moloco/sdk/internal/z;

    .line 278
    .line 279
    if-eqz v1, :cond_10

    .line 280
    .line 281
    new-instance v1, Lcom/moloco/sdk/internal/z;

    .line 282
    .line 283
    check-cast v4, Lcom/moloco/sdk/internal/z;

    .line 284
    .line 285
    iget-object v2, v4, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v2, Lcom/moloco/sdk/internal/ortb/model/y;

    .line 288
    .line 289
    iget-object v2, v2, Lcom/moloco/sdk/internal/ortb/model/y;->a:Ljava/util/List;

    .line 290
    .line 291
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    check-cast v2, Lcom/moloco/sdk/internal/ortb/model/f;

    .line 296
    .line 297
    iget-object v2, v2, Lcom/moloco/sdk/internal/ortb/model/f;->a:Ljava/util/List;

    .line 298
    .line 299
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    invoke-direct {v1, v2}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    return-object v1

    .line 307
    :cond_10
    new-instance v1, LE5/Q;

    .line 308
    .line 309
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 310
    .line 311
    .line 312
    throw v1
.end method
