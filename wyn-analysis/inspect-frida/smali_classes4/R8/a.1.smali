.class public final LR8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/n;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;LKd/a;Landroid/content/Context;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/e;)V
    .locals 6

    .line 1
    const-string v1, "context"

    .line 2
    .line 3
    invoke-static {p6, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "customUserEventBuilderService"

    .line 7
    .line 8
    invoke-static {p7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "externalLinkHandler"

    .line 12
    .line 13
    invoke-static {p8, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LR8/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object p4, p0, LR8/a;->a:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p7, p0, LR8/a;->c:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p8, p0, LR8/a;->d:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object p9, p0, LR8/a;->e:Ljava/lang/Object;

    .line 28
    .line 29
    move-object/from16 p1, p10

    .line 30
    .line 31
    iput-object p1, p0, LR8/a;->f:Ljava/lang/Object;

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    invoke-static {p1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 35
    .line 36
    .line 37
    move-result-object p4

    .line 38
    iput-object p4, p0, LR8/a;->g:Ljava/lang/Object;

    .line 39
    .line 40
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/A;

    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    move-object v1, p0

    .line 44
    move-object v3, p2

    .line 45
    move-object v4, p3

    .line 46
    move-object v2, p6

    .line 47
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/A;-><init>(LR8/a;Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Ljf/c;)V

    .line 48
    .line 49
    .line 50
    const/4 p2, 0x3

    .line 51
    invoke-static {p5, p1, v0, p2}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 52
    .line 53
    .line 54
    new-instance p2, LY3/l;

    .line 55
    .line 56
    const/4 p3, 0x3

    .line 57
    invoke-direct {p2, p4, p3}, LY3/l;-><init>(LHf/x0;I)V

    .line 58
    .line 59
    .line 60
    new-instance p3, LHf/u0;

    .line 61
    .line 62
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-static {p2, p5, p3, p1}, LHf/k0;->x(LHf/l;LEf/E;LHf/o0;Ljava/lang/Object;)LHf/e0;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, LR8/a;->h:Ljava/lang/Object;

    .line 70
    .line 71
    return-void
.end method

.method public static o()Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-static {}, Ld2/n;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method


# virtual methods
.method public a(Lcom/moloco/sdk/acm/recorder/b;Ljava/lang/String;Lcom/moloco/sdk/internal/services/bidtoken/g;Llf/c;)Ljava/io/Serializable;
    .locals 11

    .line 1
    instance-of v0, p4, Lcom/moloco/sdk/internal/services/bidtoken/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/moloco/sdk/internal/services/bidtoken/s;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/internal/services/bidtoken/s;->h:I

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
    iput v1, v0, Lcom/moloco/sdk/internal/services/bidtoken/s;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/internal/services/bidtoken/s;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/moloco/sdk/internal/services/bidtoken/s;-><init>(LR8/a;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/moloco/sdk/internal/services/bidtoken/s;->f:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/internal/services/bidtoken/s;->h:I

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
    iget-object p1, v0, Lcom/moloco/sdk/internal/services/bidtoken/s;->e:LNf/d;

    .line 37
    .line 38
    iget-object p3, v0, Lcom/moloco/sdk/internal/services/bidtoken/s;->d:Lcom/moloco/sdk/internal/services/bidtoken/g;

    .line 39
    .line 40
    iget-object p2, v0, Lcom/moloco/sdk/internal/services/bidtoken/s;->c:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v1, v0, Lcom/moloco/sdk/internal/services/bidtoken/s;->b:Lcom/moloco/sdk/acm/recorder/b;

    .line 43
    .line 44
    iget-object v0, v0, Lcom/moloco/sdk/internal/services/bidtoken/s;->a:LR8/a;

    .line 45
    .line 46
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object p4, p1

    .line 50
    move-object p1, v1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iput-object p0, v0, Lcom/moloco/sdk/internal/services/bidtoken/s;->a:LR8/a;

    .line 64
    .line 65
    iput-object p1, v0, Lcom/moloco/sdk/internal/services/bidtoken/s;->b:Lcom/moloco/sdk/acm/recorder/b;

    .line 66
    .line 67
    iput-object p2, v0, Lcom/moloco/sdk/internal/services/bidtoken/s;->c:Ljava/lang/String;

    .line 68
    .line 69
    iput-object p3, v0, Lcom/moloco/sdk/internal/services/bidtoken/s;->d:Lcom/moloco/sdk/internal/services/bidtoken/g;

    .line 70
    .line 71
    iget-object p4, p0, LR8/a;->h:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p4, LNf/d;

    .line 74
    .line 75
    iput-object p4, v0, Lcom/moloco/sdk/internal/services/bidtoken/s;->e:LNf/d;

    .line 76
    .line 77
    iput v3, v0, Lcom/moloco/sdk/internal/services/bidtoken/s;->h:I

    .line 78
    .line 79
    invoke-virtual {p4, v0}, LNf/d;->b(Ljf/c;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-ne v0, v1, :cond_3

    .line 84
    .line 85
    return-object v1

    .line 86
    :cond_3
    move-object v0, p0

    .line 87
    :goto_1
    const/4 v1, 0x0

    .line 88
    :try_start_0
    invoke-virtual {v0, p2, p3}, LR8/a;->c(Ljava/lang/String;Lcom/moloco/sdk/internal/services/bidtoken/g;)Z

    .line 89
    .line 90
    .line 91
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    const-string v3, "result"

    .line 93
    .line 94
    const-string v4, "cbt_cached"

    .line 95
    .line 96
    if-eqz v2, :cond_4

    .line 97
    .line 98
    :try_start_1
    sget-object v5, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 99
    .line 100
    const-string v6, "ClientBidTokenServiceImpl"

    .line 101
    .line 102
    const-string v7, "Bid token needs refresh, fetching new bid token"

    .line 103
    .line 104
    const/4 v10, 0x0

    .line 105
    const/4 v8, 0x0

    .line 106
    const/4 v9, 0x4

    .line 107
    invoke-static/range {v5 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->debugBuildLog$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iput-object p2, v0, LR8/a;->a:Ljava/lang/Object;

    .line 111
    .line 112
    iput-object p3, v0, LR8/a;->g:Ljava/lang/Object;

    .line 113
    .line 114
    new-instance p3, Lcom/moloco/sdk/acm/h;

    .line 115
    .line 116
    sget-object v2, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 117
    .line 118
    invoke-direct {p3, v4}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    sget-object v2, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 122
    .line 123
    const-string v2, "false"

    .line 124
    .line 125
    invoke-virtual {p3, v3, v2}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    check-cast p1, Lcom/moloco/sdk/acm/recorder/c;

    .line 129
    .line 130
    invoke-virtual {p1, p3}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, p2, p1}, LR8/a;->b(Ljava/lang/String;Lcom/moloco/sdk/acm/recorder/c;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    iput-object p1, v0, LR8/a;->b:Ljava/lang/Object;

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :catchall_0
    move-exception v0

    .line 141
    move-object p1, v0

    .line 142
    goto :goto_3

    .line 143
    :cond_4
    new-instance p2, Lcom/moloco/sdk/acm/h;

    .line 144
    .line 145
    sget-object p3, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 146
    .line 147
    invoke-direct {p2, v4}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    sget-object p3, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 151
    .line 152
    const-string p3, "true"

    .line 153
    .line 154
    invoke-virtual {p2, v3, p3}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    check-cast p1, Lcom/moloco/sdk/acm/recorder/c;

    .line 158
    .line 159
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 160
    .line 161
    .line 162
    :goto_2
    iget-object p1, v0, LR8/a;->b:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast p1, Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-nez p1, :cond_5

    .line 171
    .line 172
    new-instance p1, Ljava/lang/Exception;

    .line 173
    .line 174
    const-string p2, "Client bid token is empty"

    .line 175
    .line 176
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-static {p1}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 180
    .line 181
    .line 182
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 183
    invoke-interface {p4, v1}, LNf/a;->a(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    return-object p1

    .line 187
    :cond_5
    :try_start_2
    iget-object p1, v0, LR8/a;->b:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast p1, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 190
    .line 191
    invoke-interface {p4, v1}, LNf/a;->a(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    return-object p1

    .line 195
    :goto_3
    invoke-interface {p4, v1}, LNf/a;->a(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    throw p1
.end method

.method public b(Ljava/lang/String;Lcom/moloco/sdk/acm/recorder/c;)Ljava/lang/String;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    const-string v0, "success"

    .line 6
    .line 7
    iget-object v3, v1, LR8/a;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lcom/moloco/sdk/internal/services/bidtoken/r;

    .line 10
    .line 11
    iget-object v4, v1, LR8/a;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Lcom/moloco/sdk/internal/services/bidtoken/providers/l;

    .line 14
    .line 15
    iget-object v5, v1, LR8/a;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v5, LC8/i;

    .line 18
    .line 19
    iget-object v6, v1, LR8/a;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v6, Lcom/moloco/sdk/internal/services/k;

    .line 22
    .line 23
    const-string v7, "v2:"

    .line 24
    .line 25
    const-string v8, "Client bid token build time: "

    .line 26
    .line 27
    const-string v9, "BidToken Component: "

    .line 28
    .line 29
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v10

    .line 33
    const-string v11, "reason"

    .line 34
    .line 35
    const-string v12, "failure"

    .line 36
    .line 37
    const-string v13, "bid_token_build"

    .line 38
    .line 39
    const-string v14, "result"

    .line 40
    .line 41
    const-string v15, ""

    .line 42
    .line 43
    if-nez v10, :cond_0

    .line 44
    .line 45
    new-instance v0, Lcom/moloco/sdk/acm/h;

    .line 46
    .line 47
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 48
    .line 49
    invoke-direct {v0, v13}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 53
    .line 54
    invoke-virtual {v0, v14, v12}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v3, "empty_public_key"

    .line 58
    .line 59
    invoke-virtual {v0, v11, v3}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v0}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 63
    .line 64
    .line 65
    return-object v15

    .line 66
    :cond_0
    sget-object v10, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 67
    .line 68
    const-string v10, "bid_token_build_time_ms"

    .line 69
    .line 70
    invoke-virtual {v2, v10}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    :try_start_0
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 78
    .line 79
    .line 80
    move-result-wide v16

    .line 81
    const-string v18, "rsa"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    move-object/from16 v19, v4

    .line 84
    .line 85
    move-object/from16 v4, p1

    .line 86
    .line 87
    :try_start_1
    invoke-virtual {v5, v4}, LC8/i;->d(Ljava/lang/String;)[B

    .line 88
    .line 89
    .line 90
    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 91
    :try_start_2
    const-string v18, "update_signal_state"
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 92
    .line 93
    :try_start_3
    invoke-virtual/range {v19 .. v19}, Lcom/moloco/sdk/internal/services/bidtoken/providers/l;->a()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 94
    .line 95
    .line 96
    :try_start_4
    const-string v18, "provide_signal"
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 97
    .line 98
    :try_start_5
    invoke-virtual/range {v19 .. v19}, Lcom/moloco/sdk/internal/services/bidtoken/providers/l;->d()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v19

    .line 102
    move-object/from16 p1, v4

    .line 103
    .line 104
    move-object/from16 v4, v19

    .line 105
    .line 106
    check-cast v4, Lcom/moloco/sdk/internal/services/bidtoken/providers/k;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 107
    .line 108
    move-object/from16 v19, v6

    .line 109
    .line 110
    :try_start_6
    iget-object v6, v1, LR8/a;->g:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v6, Lcom/moloco/sdk/internal/services/bidtoken/g;

    .line 113
    .line 114
    invoke-virtual {v3, v4, v6}, Lcom/moloco/sdk/internal/services/bidtoken/r;->a(Lcom/moloco/sdk/internal/services/bidtoken/providers/k;Lcom/moloco/sdk/internal/services/bidtoken/g;)Lcom/moloco/sdk/Q;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    sget-object v20, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 119
    .line 120
    const-string v21, "ClientBidTokenServiceImpl"

    .line 121
    .line 122
    new-instance v4, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v22

    .line 134
    const/16 v25, 0x0

    .line 135
    .line 136
    const/16 v23, 0x0

    .line 137
    .line 138
    const/16 v24, 0x4

    .line 139
    .line 140
    invoke-static/range {v20 .. v25}, Lcom/moloco/sdk/internal/MolocoLogger;->debugBuildLog$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    const/4 v4, 0x0

    .line 148
    invoke-static {v3, v4}, Landroid/util/Base64;->encode([BI)[B

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    const-string v18, "aes"
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 153
    .line 154
    :try_start_7
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget-object v6, v5, LC8/i;->d:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v6, Lef/p;

    .line 160
    .line 161
    invoke-virtual {v6}, Lef/p;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    check-cast v6, Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {v6}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    iget-object v9, v5, LC8/i;->e:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v9, Ljavax/crypto/spec/SecretKeySpec;

    .line 174
    .line 175
    iget-object v5, v5, LC8/i;->f:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v5, Lef/p;

    .line 178
    .line 179
    invoke-virtual {v5}, Lef/p;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    check-cast v5, Ljavax/crypto/spec/IvParameterSpec;

    .line 184
    .line 185
    const/4 v4, 0x1

    .line 186
    invoke-virtual {v6, v4, v9, v5}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v6, v3}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    const-string v4, "doFinal(...)"

    .line 194
    .line 195
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    .line 196
    .line 197
    .line 198
    const/4 v4, 0x0

    .line 199
    :try_start_8
    invoke-static {v3, v4}, Landroid/util/Base64;->encode([BI)[B

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    invoke-static {}, Lcom/moloco/sdk/i;->d()Lcom/moloco/sdk/h;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-static/range {p1 .. p1}, Lcom/google/protobuf/ByteString;->copyFrom([B)Lcom/google/protobuf/ByteString;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    invoke-virtual {v4, v5}, Lcom/moloco/sdk/h;->a(Lcom/google/protobuf/ByteString;)V

    .line 215
    .line 216
    .line 217
    invoke-static {v3}, Lcom/google/protobuf/ByteString;->copyFrom([B)Lcom/google/protobuf/ByteString;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    invoke-virtual {v4, v3}, Lcom/moloco/sdk/h;->b(Lcom/google/protobuf/ByteString;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    check-cast v3, Lcom/moloco/sdk/i;

    .line 229
    .line 230
    invoke-virtual {v3}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    const-string v4, "toByteArray(...)"

    .line 235
    .line 236
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    const/4 v4, 0x0

    .line 240
    invoke-static {v3, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    sget-object v4, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 245
    .line 246
    invoke-virtual {v10, v14, v0}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v10}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 250
    .line 251
    .line 252
    new-instance v4, Lcom/moloco/sdk/acm/h;

    .line 253
    .line 254
    sget-object v5, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 255
    .line 256
    invoke-direct {v4, v13}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v4, v14, v0}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v4}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 263
    .line 264
    .line 265
    const-string v21, "ClientBidTokenServiceImpl"

    .line 266
    .line 267
    new-instance v0, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 276
    .line 277
    .line 278
    move-result-wide v4

    .line 279
    sub-long v4, v4, v16

    .line 280
    .line 281
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string v4, " ms"

    .line 285
    .line 286
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v22

    .line 293
    const/16 v23, 0x0

    .line 294
    .line 295
    const/16 v24, 0x0

    .line 296
    .line 297
    const/16 v25, 0xc

    .line 298
    .line 299
    const/16 v26, 0x0

    .line 300
    .line 301
    invoke-static/range {v20 .. v26}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    new-instance v0, Ljava/lang/StringBuilder;

    .line 305
    .line 306
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 316
    return-object v0

    .line 317
    :catch_0
    move-exception v0

    .line 318
    move-object v6, v0

    .line 319
    move-object v0, v15

    .line 320
    goto :goto_1

    .line 321
    :goto_0
    move-object v6, v0

    .line 322
    move-object/from16 v0, v18

    .line 323
    .line 324
    goto :goto_1

    .line 325
    :catch_1
    move-exception v0

    .line 326
    goto :goto_0

    .line 327
    :goto_1
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    sget-object v16, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 336
    .line 337
    const-string v4, "Client bid token build failed: "

    .line 338
    .line 339
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    const-string v4, "ClientBidTokenServiceImpl"

    .line 344
    .line 345
    const/4 v7, 0x0

    .line 346
    const/16 v8, 0x8

    .line 347
    .line 348
    const/4 v9, 0x0

    .line 349
    move-object v1, v3

    .line 350
    move-object/from16 v3, v16

    .line 351
    .line 352
    invoke-static/range {v3 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    new-instance v3, Lcom/moloco/sdk/acm/h;

    .line 356
    .line 357
    sget-object v4, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 358
    .line 359
    invoke-direct {v3, v13}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    sget-object v4, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 363
    .line 364
    invoke-virtual {v3, v14, v12}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v3, v11, v1}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 371
    .line 372
    .line 373
    move-result v4

    .line 374
    if-lez v4, :cond_1

    .line 375
    .line 376
    const-string v4, "step"

    .line 377
    .line 378
    invoke-virtual {v3, v4, v0}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 382
    .line 383
    const-string v4, "Recording metric failure: "

    .line 384
    .line 385
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    iget-object v4, v3, Lcom/moloco/sdk/acm/h;->b:Ljava/lang/String;

    .line 389
    .line 390
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    const-string v4, ", tags: "

    .line 394
    .line 395
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    iget-object v4, v3, Lcom/moloco/sdk/acm/h;->a:Ljava/util/ArrayList;

    .line 399
    .line 400
    const/16 v20, 0x0

    .line 401
    .line 402
    const/16 v21, 0x0

    .line 403
    .line 404
    const-string v18, ","

    .line 405
    .line 406
    const/16 v19, 0x0

    .line 407
    .line 408
    const/16 v22, 0x3e

    .line 409
    .line 410
    move-object/from16 v17, v4

    .line 411
    .line 412
    invoke-static/range {v17 .. v22}, Lff/o;->w0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltf/l;I)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v18

    .line 423
    const-string v17, "ClientBidTokenServiceImpl"

    .line 424
    .line 425
    const/16 v19, 0x0

    .line 426
    .line 427
    const/16 v20, 0x4

    .line 428
    .line 429
    invoke-static/range {v16 .. v21}, Lcom/moloco/sdk/internal/MolocoLogger;->debugBuildLog$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2, v3}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v10, v14, v12}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v10, v11, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2, v10}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 442
    .line 443
    .line 444
    return-object v15
.end method

.method public c(Ljava/lang/String;Lcom/moloco/sdk/internal/services/bidtoken/g;)Z
    .locals 7

    .line 1
    iget-object v0, p0, LR8/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 13
    .line 14
    const-string v3, "rp changed, needs refresh"

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const-string v2, "ClientBidTokenServiceImpl"

    .line 18
    .line 19
    const/4 v5, 0x4

    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->debugBuildLog$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return v0

    .line 25
    :cond_0
    iget-object p1, p0, LR8/a;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lcom/moloco/sdk/internal/services/bidtoken/g;

    .line 28
    .line 29
    iput-object p2, p0, LR8/a;->g:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 36
    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    const-string p2, "config updated"

    .line 40
    .line 41
    :goto_0
    move-object v3, p2

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p2, "config didn\'t change"

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :goto_1
    const/4 v5, 0x4

    .line 47
    const/4 v6, 0x0

    .line 48
    const-string v2, "ClientBidTokenServiceImpl"

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->debugBuildLog$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    if-nez p1, :cond_2

    .line 55
    .line 56
    const-string v3, "config changed, needs refresh"

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    const-string v2, "ClientBidTokenServiceImpl"

    .line 60
    .line 61
    const/4 v5, 0x4

    .line 62
    const/4 v6, 0x0

    .line 63
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->debugBuildLog$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return v0

    .line 67
    :cond_2
    iget-object p1, p0, LR8/a;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-nez p1, :cond_3

    .line 76
    .line 77
    const-string v3, "cached bidToken is empty, needs refresh"

    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    const-string v2, "ClientBidTokenServiceImpl"

    .line 81
    .line 82
    const/4 v5, 0x4

    .line 83
    const/4 v6, 0x0

    .line 84
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->debugBuildLog$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return v0

    .line 88
    :cond_3
    iget-object p1, p0, LR8/a;->f:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p1, Lcom/moloco/sdk/internal/services/bidtoken/providers/l;

    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/moloco/sdk/internal/services/bidtoken/providers/l;->b()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    const-string v3, "signal provider updated, needs refresh"

    .line 99
    .line 100
    const/4 v4, 0x0

    .line 101
    const-string v2, "ClientBidTokenServiceImpl"

    .line 102
    .line 103
    const/4 v5, 0x4

    .line 104
    const/4 v6, 0x0

    .line 105
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->debugBuildLog$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return v0

    .line 109
    :cond_4
    const-string v3, "Bid token doesn\'t need refresh"

    .line 110
    .line 111
    const/4 v4, 0x0

    .line 112
    const-string v2, "ClientBidTokenServiceImpl"

    .line 113
    .line 114
    const/4 v5, 0x4

    .line 115
    const/4 v6, 0x0

    .line 116
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->debugBuildLog$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    const/4 p1, 0x0

    .line 120
    return p1
.end method

.method public d()Z
    .locals 6

    .line 1
    iget-object v0, p0, LR8/a;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_3

    .line 8
    :cond_0
    iget-object v1, p0, LR8/a;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ldb/d;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 16
    .line 17
    .line 18
    iput-object v2, p0, LR8/a;->b:Ljava/lang/Object;

    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, LR8/a;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ldb/d;

    .line 23
    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    iget-object v1, p0, LR8/a;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/content/Context;

    .line 29
    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, LR8/a;->c:Ljava/lang/Object;

    .line 37
    .line 38
    :cond_3
    :goto_0
    iget-object v0, p0, LR8/a;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, LL1/d;

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_4
    iget-object v0, p0, LR8/a;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Landroid/media/AudioManager;

    .line 49
    .line 50
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, LR8/a;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, LL1/d;

    .line 56
    .line 57
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    .line 62
    const/16 v5, 0x1a

    .line 63
    .line 64
    if-lt v4, v5, :cond_5

    .line 65
    .line 66
    iget-object v3, v3, LL1/d;->f:Ljava/lang/Object;

    .line 67
    .line 68
    invoke-static {v3}, LA0/h;->l(Ljava/lang/Object;)Landroid/media/AudioFocusRequest;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-static {v0, v3}, LL1/e;->a(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    goto :goto_1

    .line 77
    :cond_5
    iget-object v3, v3, LL1/d;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 78
    .line 79
    invoke-virtual {v0, v3}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    :goto_1
    iput-object v2, p0, LR8/a;->a:Ljava/lang/Object;

    .line 84
    .line 85
    if-ne v0, v1, :cond_6

    .line 86
    .line 87
    :goto_2
    return v1

    .line 88
    :cond_6
    :goto_3
    const/4 v0, 0x0

    .line 89
    return v0
.end method

.method public destroy()V
    .locals 2

    .line 1
    iget-object v0, p0, LR8/a;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LHf/x0;

    .line 4
    .line 5
    invoke-virtual {v0}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/t;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/t;->destroy()V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, LHf/x0;->j(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public e(III)V
    .locals 1

    .line 1
    iget-object v0, p0, LR8/a;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/AudioManager;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Landroid/media/AudioManager;->adjustStreamVolume(III)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public f(Ljava/util/Map;)V
    .locals 14

    .line 1
    new-instance v0, Landroid/view/KeyEvent;

    .line 2
    .line 3
    const-string v1, "downTime"

    .line 4
    .line 5
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lff/B;->t(Ljava/lang/Object;)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    const-string v3, "eventTime"

    .line 21
    .line 22
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v3}, Lff/B;->t(Ljava/lang/Object;)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    const-string v5, "action"

    .line 38
    .line 39
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const-string v6, "null cannot be cast to non-null type kotlin.Int"

    .line 44
    .line 45
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    check-cast v5, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    const-string v7, "keyCode"

    .line 55
    .line 56
    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    check-cast v7, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    const-string v8, "repeatCount"

    .line 70
    .line 71
    invoke-interface {p1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    check-cast v8, Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    const-string v9, "metaState"

    .line 85
    .line 86
    invoke-interface {p1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    invoke-static {v9, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    check-cast v9, Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    const-string v10, "deviceId"

    .line 100
    .line 101
    invoke-interface {p1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    invoke-static {v10, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    check-cast v10, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    const-string v11, "scanCode"

    .line 115
    .line 116
    invoke-interface {p1, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v11

    .line 120
    invoke-static {v11, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    check-cast v11, Ljava/lang/Integer;

    .line 124
    .line 125
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    const-string v12, "flags"

    .line 130
    .line 131
    invoke-interface {p1, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    invoke-static {v12, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    check-cast v12, Ljava/lang/Integer;

    .line 139
    .line 140
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 141
    .line 142
    .line 143
    move-result v12

    .line 144
    const-string v13, "source"

    .line 145
    .line 146
    invoke-interface {p1, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    check-cast p1, Ljava/lang/Integer;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    move v6, v7

    .line 160
    move v7, v8

    .line 161
    move v8, v9

    .line 162
    move v9, v10

    .line 163
    move v10, v11

    .line 164
    move v11, v12

    .line 165
    move v12, p1

    .line 166
    invoke-direct/range {v0 .. v12}, Landroid/view/KeyEvent;-><init>(JJIIIIIIII)V

    .line 167
    .line 168
    .line 169
    iget-object p1, p0, LR8/a;->e:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast p1, Landroid/media/AudioManager;

    .line 172
    .line 173
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, v0}, Landroid/media/AudioManager;->dispatchMediaKeyEvent(Landroid/view/KeyEvent;)V

    .line 177
    .line 178
    .line 179
    return-void
.end method

.method public g()Ljava/util/ArrayList;
    .locals 3

    .line 1
    iget-object v0, p0, LR8/a;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/AudioManager;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lab/d;->p(Landroid/media/AudioManager;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "getAvailableCommunicationDevices(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast v0, Ljava/lang/Iterable;

    .line 18
    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    const/16 v2, 0xa

    .line 22
    .line 23
    invoke-static {v0, v2}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Landroid/media/AudioDeviceInfo;

    .line 45
    .line 46
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v2}, Lff/B;->r(Landroid/media/AudioDeviceInfo;)Ljava/util/Map;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    return-object v1
.end method

.method public h()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LR8/a;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/AudioManager;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lab/d;->g(Landroid/media/AudioManager;)Landroid/media/AudioDeviceInfo;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-static {v0}, Lff/B;->r(Landroid/media/AudioDeviceInfo;)Ljava/util/Map;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public i(I)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LR8/a;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Landroid/media/AudioManager;

    .line 9
    .line 10
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v1, "getDevices(...)"

    .line 18
    .line 19
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    array-length v1, p1

    .line 23
    const/4 v2, 0x0

    .line 24
    :goto_0
    if-ge v2, v1, :cond_0

    .line 25
    .line 26
    aget-object v3, p1, v2

    .line 27
    .line 28
    invoke-static {v3}, Lff/B;->r(Landroid/media/AudioDeviceInfo;)Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v0
.end method

.method public j()Ljava/util/ArrayList;
    .locals 24

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x2

    .line 6
    new-instance v4, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    move-object/from16 v5, p0

    .line 12
    .line 13
    iget-object v6, v5, LR8/a;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v6, Landroid/media/AudioManager;

    .line 16
    .line 17
    invoke-static {v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v6}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->m(Landroid/media/AudioManager;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    const-string v7, "getMicrophones(...)"

    .line 25
    .line 26
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-eqz v7, :cond_2

    .line 38
    .line 39
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    invoke-static {v7}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->k(Ljava/lang/Object;)Landroid/media/MicrophoneInfo;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-static {v7}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->n(Landroid/media/MicrophoneInfo;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    const-string v9, "getFrequencyResponse(...)"

    .line 52
    .line 53
    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    check-cast v8, Ljava/lang/Iterable;

    .line 57
    .line 58
    new-instance v9, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-static {v8, v0}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    if-eqz v10, :cond_0

    .line 76
    .line 77
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    check-cast v10, Landroid/util/Pair;

    .line 82
    .line 83
    iget-object v11, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v11, Ljava/lang/Number;

    .line 86
    .line 87
    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    .line 88
    .line 89
    .line 90
    move-result v11

    .line 91
    float-to-double v11, v11

    .line 92
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 93
    .line 94
    .line 95
    move-result-object v11

    .line 96
    iget-object v10, v10, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v10, Ljava/lang/Number;

    .line 99
    .line 100
    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    float-to-double v12, v10

    .line 105
    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    new-array v12, v3, [Ljava/lang/Double;

    .line 110
    .line 111
    aput-object v11, v12, v2

    .line 112
    .line 113
    aput-object v10, v12, v1

    .line 114
    .line 115
    invoke-static {v12}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_0
    invoke-static {v7}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->y(Landroid/media/MicrophoneInfo;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    const-string v10, "getChannelMapping(...)"

    .line 128
    .line 129
    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    check-cast v8, Ljava/lang/Iterable;

    .line 133
    .line 134
    new-instance v10, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-static {v8, v0}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v11

    .line 151
    if-eqz v11, :cond_1

    .line 152
    .line 153
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v11

    .line 157
    check-cast v11, Landroid/util/Pair;

    .line 158
    .line 159
    iget-object v12, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v12, Ljava/lang/Number;

    .line 162
    .line 163
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result v12

    .line 167
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v12

    .line 171
    iget-object v11, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v11, Ljava/lang/Number;

    .line 174
    .line 175
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    new-array v13, v3, [Ljava/lang/Integer;

    .line 184
    .line 185
    aput-object v12, v13, v2

    .line 186
    .line 187
    aput-object v11, v13, v1

    .line 188
    .line 189
    invoke-static {v13}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_1
    invoke-static {v7}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->l(Landroid/media/MicrophoneInfo;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    new-instance v11, Lef/k;

    .line 202
    .line 203
    const-string v12, "description"

    .line 204
    .line 205
    invoke-direct {v11, v12, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-static {v7}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->u(Landroid/media/MicrophoneInfo;)I

    .line 209
    .line 210
    .line 211
    move-result v8

    .line 212
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    new-instance v12, Lef/k;

    .line 217
    .line 218
    const-string v13, "id"

    .line 219
    .line 220
    invoke-direct {v12, v13, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v7}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->A(Landroid/media/MicrophoneInfo;)I

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v8

    .line 231
    new-instance v13, Lef/k;

    .line 232
    .line 233
    const-string v14, "type"

    .line 234
    .line 235
    invoke-direct {v13, v14, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-static {v7}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->x(Landroid/media/MicrophoneInfo;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    new-instance v14, Lef/k;

    .line 243
    .line 244
    const-string v15, "address"

    .line 245
    .line 246
    invoke-direct {v14, v15, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    invoke-static {v7}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->B(Landroid/media/MicrophoneInfo;)I

    .line 250
    .line 251
    .line 252
    move-result v8

    .line 253
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    new-instance v15, Lef/k;

    .line 258
    .line 259
    move/from16 v16, v0

    .line 260
    .line 261
    const-string v0, "location"

    .line 262
    .line 263
    invoke-direct {v15, v0, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    invoke-static {v7}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->C(Landroid/media/MicrophoneInfo;)I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    new-instance v8, Lef/k;

    .line 275
    .line 276
    move/from16 v17, v1

    .line 277
    .line 278
    const-string v1, "group"

    .line 279
    .line 280
    invoke-direct {v8, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    invoke-static {v7}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->D(Landroid/media/MicrophoneInfo;)I

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    new-instance v1, Lef/k;

    .line 292
    .line 293
    move/from16 v18, v2

    .line 294
    .line 295
    const-string v2, "indexInTheGroup"

    .line 296
    .line 297
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    invoke-static {v7}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->j(Landroid/media/MicrophoneInfo;)Landroid/media/MicrophoneInfo$Coordinate3F;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    const-string v2, "getPosition(...)"

    .line 305
    .line 306
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-static {v0}, Lff/B;->k(Landroid/media/MicrophoneInfo$Coordinate3F;)Ljava/util/ArrayList;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    new-instance v2, Lef/k;

    .line 314
    .line 315
    move/from16 v19, v3

    .line 316
    .line 317
    const-string v3, "position"

    .line 318
    .line 319
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    invoke-static {v7}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->w(Landroid/media/MicrophoneInfo;)Landroid/media/MicrophoneInfo$Coordinate3F;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    const-string v3, "getOrientation(...)"

    .line 327
    .line 328
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    invoke-static {v0}, Lff/B;->k(Landroid/media/MicrophoneInfo$Coordinate3F;)Ljava/util/ArrayList;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    new-instance v3, Lef/k;

    .line 336
    .line 337
    move-object/from16 v20, v1

    .line 338
    .line 339
    const-string v1, "orientation"

    .line 340
    .line 341
    invoke-direct {v3, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    new-instance v0, Lef/k;

    .line 345
    .line 346
    const-string v1, "frequencyResponse"

    .line 347
    .line 348
    invoke-direct {v0, v1, v9}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    new-instance v1, Lef/k;

    .line 352
    .line 353
    const-string v9, "channelMapping"

    .line 354
    .line 355
    invoke-direct {v1, v9, v10}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    invoke-static {v7}, Ldb/b;->b(Landroid/media/MicrophoneInfo;)F

    .line 359
    .line 360
    .line 361
    move-result v9

    .line 362
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 363
    .line 364
    .line 365
    move-result-object v9

    .line 366
    new-instance v10, Lef/k;

    .line 367
    .line 368
    move-object/from16 v21, v0

    .line 369
    .line 370
    const-string v0, "sensitivity"

    .line 371
    .line 372
    invoke-direct {v10, v0, v9}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    invoke-static {v7}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->b(Landroid/media/MicrophoneInfo;)F

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    new-instance v9, Lef/k;

    .line 384
    .line 385
    move-object/from16 v22, v1

    .line 386
    .line 387
    const-string v1, "maxSpl"

    .line 388
    .line 389
    invoke-direct {v9, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    invoke-static {v7}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->t(Landroid/media/MicrophoneInfo;)F

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    new-instance v1, Lef/k;

    .line 401
    .line 402
    move-object/from16 v23, v2

    .line 403
    .line 404
    const-string v2, "minSpl"

    .line 405
    .line 406
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    invoke-static {v7}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->c(Landroid/media/MicrophoneInfo;)I

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    new-instance v2, Lef/k;

    .line 418
    .line 419
    const-string v7, "directionality"

    .line 420
    .line 421
    invoke-direct {v2, v7, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    const/16 v0, 0xf

    .line 425
    .line 426
    new-array v0, v0, [Lef/k;

    .line 427
    .line 428
    aput-object v11, v0, v18

    .line 429
    .line 430
    aput-object v12, v0, v17

    .line 431
    .line 432
    aput-object v13, v0, v19

    .line 433
    .line 434
    const/4 v7, 0x3

    .line 435
    aput-object v14, v0, v7

    .line 436
    .line 437
    const/4 v7, 0x4

    .line 438
    aput-object v15, v0, v7

    .line 439
    .line 440
    const/4 v7, 0x5

    .line 441
    aput-object v8, v0, v7

    .line 442
    .line 443
    const/4 v7, 0x6

    .line 444
    aput-object v20, v0, v7

    .line 445
    .line 446
    const/4 v7, 0x7

    .line 447
    aput-object v23, v0, v7

    .line 448
    .line 449
    const/16 v7, 0x8

    .line 450
    .line 451
    aput-object v3, v0, v7

    .line 452
    .line 453
    const/16 v3, 0x9

    .line 454
    .line 455
    aput-object v21, v0, v3

    .line 456
    .line 457
    aput-object v22, v0, v16

    .line 458
    .line 459
    const/16 v3, 0xb

    .line 460
    .line 461
    aput-object v10, v0, v3

    .line 462
    .line 463
    const/16 v3, 0xc

    .line 464
    .line 465
    aput-object v9, v0, v3

    .line 466
    .line 467
    const/16 v3, 0xd

    .line 468
    .line 469
    aput-object v1, v0, v3

    .line 470
    .line 471
    const/16 v1, 0xe

    .line 472
    .line 473
    aput-object v2, v0, v1

    .line 474
    .line 475
    invoke-static {v0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move/from16 v0, v16

    .line 483
    .line 484
    move/from16 v1, v17

    .line 485
    .line 486
    move/from16 v2, v18

    .line 487
    .line 488
    move/from16 v3, v19

    .line 489
    .line 490
    goto/16 :goto_0

    .line 491
    .line 492
    :cond_2
    return-object v4
.end method

.method public k(I)Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, LR8/a;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/AudioManager;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public l(I)Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, LR8/a;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/AudioManager;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, p1}, LA0/j;->c(Landroid/media/AudioManager;I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public varargs m(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, LR8/a;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ldb/a;

    .line 20
    .line 21
    invoke-static {p2}, Lff/m;->O0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v1, v1, Ldb/a;->a:Luc/r;

    .line 26
    .line 27
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-virtual {v1, p1, v2, v3}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void
.end method

.method public n()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, LR8/a;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/AudioManager;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/media/AudioManager;->isBluetoothScoOn()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public p()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, LR8/a;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/AudioManager;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public q()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, LR8/a;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/AudioManager;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public r()V
    .locals 1

    .line 1
    iget-object v0, p0, LR8/a;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/AudioManager;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/media/AudioManager;->loadSoundEffects()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public s(Ljava/util/List;)Z
    .locals 13

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "args"

    .line 5
    .line 6
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, LR8/a;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, LL1/d;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    return v3

    .line 17
    :cond_0
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>"

    .line 22
    .line 23
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast p1, Ljava/util/Map;

    .line 27
    .line 28
    const-string v2, "gainType"

    .line 29
    .line 30
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v4, "null cannot be cast to non-null type kotlin.Int"

    .line 35
    .line 36
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    check-cast v2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    sget-object v2, LL1/d;->g:Landroidx/media/AudioAttributesCompat;

    .line 46
    .line 47
    const/4 v11, 0x2

    .line 48
    if-eq v6, v3, :cond_2

    .line 49
    .line 50
    if-eq v6, v11, :cond_2

    .line 51
    .line 52
    const/4 v5, 0x3

    .line 53
    if-eq v6, v5, :cond_2

    .line 54
    .line 55
    const/4 v5, 0x4

    .line 56
    if-ne v6, v5, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 60
    .line 61
    const-string v0, "Illegal audio focus gain type "

    .line 62
    .line 63
    invoke-static {v6, v0}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_2
    :goto_0
    new-instance v7, Ldb/c;

    .line 72
    .line 73
    invoke-direct {v7, p0}, Ldb/c;-><init>(LR8/a;)V

    .line 74
    .line 75
    .line 76
    new-instance v8, Landroid/os/Handler;

    .line 77
    .line 78
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-direct {v8, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 83
    .line 84
    .line 85
    const-string v5, "audioAttributes"

    .line 86
    .line 87
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    const/16 v12, 0x1a

    .line 92
    .line 93
    if-eqz v9, :cond_7

    .line 94
    .line 95
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Ljava/util/Map;

    .line 100
    .line 101
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    sget v5, Landroidx/media/AudioAttributesCompat;->b:I

    .line 105
    .line 106
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 107
    .line 108
    if-lt v5, v12, :cond_3

    .line 109
    .line 110
    new-instance v5, LL1/a;

    .line 111
    .line 112
    invoke-direct {v5, v0}, Ly3/j;-><init>(I)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    new-instance v5, Ly3/j;

    .line 117
    .line 118
    invoke-direct {v5, v0}, Ly3/j;-><init>(I)V

    .line 119
    .line 120
    .line 121
    :goto_1
    const-string v0, "contentType"

    .line 122
    .line 123
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    iget-object v10, v5, Ly3/j;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v10, Landroid/media/AudioAttributes$Builder;

    .line 130
    .line 131
    if-eqz v9, :cond_4

    .line 132
    .line 133
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    check-cast v0, Ljava/lang/Integer;

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    invoke-virtual {v10, v0}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 147
    .line 148
    .line 149
    :cond_4
    const-string v0, "flags"

    .line 150
    .line 151
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    if-eqz v9, :cond_5

    .line 156
    .line 157
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    check-cast v0, Ljava/lang/Integer;

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-virtual {v10, v0}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    .line 171
    .line 172
    .line 173
    :cond_5
    const-string v0, "usage"

    .line 174
    .line 175
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    if-eqz v9, :cond_6

    .line 180
    .line 181
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    check-cast v0, Ljava/lang/Integer;

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    invoke-virtual {v5, v0}, Ly3/j;->t(I)Ly3/j;

    .line 195
    .line 196
    .line 197
    :cond_6
    new-instance v2, Landroidx/media/AudioAttributesCompat;

    .line 198
    .line 199
    invoke-virtual {v5}, Ly3/j;->h()Landroidx/media/AudioAttributesImpl;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 204
    .line 205
    .line 206
    iput-object v0, v2, Landroidx/media/AudioAttributesCompat;->a:Landroidx/media/AudioAttributesImpl;

    .line 207
    .line 208
    :cond_7
    move-object v9, v2

    .line 209
    const-string v0, "willPauseWhenDucked"

    .line 210
    .line 211
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    if-eqz v2, :cond_8

    .line 216
    .line 217
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    const-string v0, "null cannot be cast to non-null type kotlin.Boolean"

    .line 222
    .line 223
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    check-cast p1, Ljava/lang/Boolean;

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    move v10, p1

    .line 233
    goto :goto_2

    .line 234
    :cond_8
    move v10, v1

    .line 235
    :goto_2
    new-instance v5, LL1/d;

    .line 236
    .line 237
    invoke-direct/range {v5 .. v10}, LL1/d;-><init>(ILdb/c;Landroid/os/Handler;Landroidx/media/AudioAttributesCompat;Z)V

    .line 238
    .line 239
    .line 240
    iput-object v5, p0, LR8/a;->a:Ljava/lang/Object;

    .line 241
    .line 242
    iget-object p1, p0, LR8/a;->e:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast p1, Landroid/media/AudioManager;

    .line 245
    .line 246
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    iget-object v0, p0, LR8/a;->a:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, LL1/d;

    .line 252
    .line 253
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 257
    .line 258
    if-lt v2, v12, :cond_9

    .line 259
    .line 260
    iget-object v0, v0, LL1/d;->f:Ljava/lang/Object;

    .line 261
    .line 262
    invoke-static {v0}, LA0/h;->l(Ljava/lang/Object;)Landroid/media/AudioFocusRequest;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-static {p1, v0}, LL1/e;->b(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    goto :goto_3

    .line 271
    :cond_9
    iget-object v2, v0, LL1/d;->d:Landroidx/media/AudioAttributesCompat;

    .line 272
    .line 273
    iget-object v2, v2, Landroidx/media/AudioAttributesCompat;->a:Landroidx/media/AudioAttributesImpl;

    .line 274
    .line 275
    invoke-interface {v2}, Landroidx/media/AudioAttributesImpl;->a()I

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    iget-object v4, v0, LL1/d;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 280
    .line 281
    iget v0, v0, LL1/d;->a:I

    .line 282
    .line 283
    invoke-virtual {p1, v4, v2, v0}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    :goto_3
    if-ne p1, v3, :cond_a

    .line 288
    .line 289
    move p1, v3

    .line 290
    goto :goto_4

    .line 291
    :cond_a
    move p1, v1

    .line 292
    :goto_4
    if-eqz p1, :cond_d

    .line 293
    .line 294
    iget-object v0, p0, LR8/a;->b:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v0, Ldb/d;

    .line 297
    .line 298
    if-eqz v0, :cond_b

    .line 299
    .line 300
    goto :goto_5

    .line 301
    :cond_b
    new-instance v0, Ldb/d;

    .line 302
    .line 303
    invoke-direct {v0, p0, v1}, Ldb/d;-><init>(LR8/a;I)V

    .line 304
    .line 305
    .line 306
    iput-object v0, p0, LR8/a;->b:Ljava/lang/Object;

    .line 307
    .line 308
    iget-object v0, p0, LR8/a;->d:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v0, Landroid/content/Context;

    .line 311
    .line 312
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    iget-object v1, p0, LR8/a;->b:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v1, Ldb/d;

    .line 318
    .line 319
    new-instance v2, Landroid/content/IntentFilter;

    .line 320
    .line 321
    const-string v4, "android.media.AUDIO_BECOMING_NOISY"

    .line 322
    .line 323
    invoke-direct {v2, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-static {v0, v1, v2, v11}, LY0/e;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 327
    .line 328
    .line 329
    :goto_5
    iget-object v0, p0, LR8/a;->c:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v0, Ldb/d;

    .line 332
    .line 333
    if-eqz v0, :cond_c

    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_c
    new-instance v0, Ldb/d;

    .line 337
    .line 338
    invoke-direct {v0, p0, v3}, Ldb/d;-><init>(LR8/a;I)V

    .line 339
    .line 340
    .line 341
    iput-object v0, p0, LR8/a;->c:Ljava/lang/Object;

    .line 342
    .line 343
    iget-object v0, p0, LR8/a;->d:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v0, Landroid/content/Context;

    .line 346
    .line 347
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    iget-object v1, p0, LR8/a;->c:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v1, Ldb/d;

    .line 353
    .line 354
    new-instance v2, Landroid/content/IntentFilter;

    .line 355
    .line 356
    const-string v3, "android.media.ACTION_SCO_AUDIO_STATE_UPDATED"

    .line 357
    .line 358
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    invoke-static {v0, v1, v2, v11}, LY0/e;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 362
    .line 363
    .line 364
    :cond_d
    :goto_6
    return p1
.end method

.method public t(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LR8/a;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/AudioManager;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, p1}, Ld2/n;->f(Landroid/media/AudioManager;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public u(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LR8/a;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/AudioManager;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setBluetoothScoOn(Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public v(I)Z
    .locals 3

    .line 1
    iget-object v0, p0, LR8/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroid/media/AudioDeviceInfo;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/media/AudioDeviceInfo;->getId()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-ne v2, p1, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, LR8/a;->e:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Landroid/media/AudioManager;

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v1}, Lab/d;->A(Landroid/media/AudioManager;Landroid/media/AudioDeviceInfo;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    return p1

    .line 39
    :cond_1
    const/4 p1, 0x0

    .line 40
    return p1
.end method

.method public w(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LR8/a;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/AudioManager;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setMicrophoneMute(Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public x(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LR8/a;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/AudioManager;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
