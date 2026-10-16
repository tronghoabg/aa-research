.class public final Lcom/moloco/sdk/internal/publisher/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/publisher/FullscreenAd;
.implements Lcom/moloco/sdk/internal/publisher/b0;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/moloco/sdk/internal/services/u;

.field public final c:Lcom/moloco/sdk/internal/services/events/c;

.field public final d:Ljava/lang/String;

.field public final e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

.field public final f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

.field public final g:Ltf/l;

.field public final h:LC8/i;

.field public final i:Lcom/moloco/sdk/publisher/AdFormatType;

.field public final j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

.field public final k:LW1/r;

.field public final l:Lcom/moloco/sdk/acm/recorder/c;

.field public final m:LKd/a;

.field public final n:Lcom/moloco/sdk/acm/l;

.field public o:Lcom/moloco/sdk/acm/l;

.field public final p:Lcom/moloco/sdk/internal/publisher/B;

.field public q:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;

.field public r:Lcom/moloco/sdk/internal/ortb/model/q;

.field public s:LFf/d;

.field public t:LAf/q;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/moloco/sdk/internal/services/u;Lcom/moloco/sdk/internal/services/events/c;Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Ltf/l;LC8/i;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;LW1/r;Lcom/moloco/sdk/acm/recorder/c;)V
    .locals 14

    .line 1
    move-object/from16 v8, p4

    .line 2
    .line 3
    move-object/from16 v9, p7

    .line 4
    .line 5
    move-object/from16 v10, p9

    .line 6
    .line 7
    move-object/from16 v11, p12

    .line 8
    .line 9
    const-string v0, "adUnitId"

    .line 10
    .line 11
    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "adFormatType"

    .line 15
    .line 16
    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    move-object v0, p1

    .line 23
    iput-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->a:Landroid/content/Context;

    .line 24
    .line 25
    move-object/from16 v0, p2

    .line 26
    .line 27
    iput-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->b:Lcom/moloco/sdk/internal/services/u;

    .line 28
    .line 29
    move-object/from16 v0, p3

    .line 30
    .line 31
    iput-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->c:Lcom/moloco/sdk/internal/services/events/c;

    .line 32
    .line 33
    iput-object v8, p0, Lcom/moloco/sdk/internal/publisher/l0;->d:Ljava/lang/String;

    .line 34
    .line 35
    move-object/from16 v0, p5

    .line 36
    .line 37
    iput-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

    .line 38
    .line 39
    move-object/from16 v0, p6

    .line 40
    .line 41
    iput-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 42
    .line 43
    iput-object v9, p0, Lcom/moloco/sdk/internal/publisher/l0;->g:Ltf/l;

    .line 44
    .line 45
    move-object/from16 v0, p8

    .line 46
    .line 47
    iput-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->h:LC8/i;

    .line 48
    .line 49
    iput-object v10, p0, Lcom/moloco/sdk/internal/publisher/l0;->i:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 50
    .line 51
    move-object/from16 v0, p10

    .line 52
    .line 53
    iput-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 54
    .line 55
    move-object/from16 v0, p11

    .line 56
    .line 57
    iput-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->k:LW1/r;

    .line 58
    .line 59
    iput-object v11, p0, Lcom/moloco/sdk/internal/publisher/l0;->l:Lcom/moloco/sdk/acm/recorder/c;

    .line 60
    .line 61
    sget-object v0, LEf/S;->a:LLf/e;

    .line 62
    .line 63
    sget-object v0, LJf/n;->a:LFf/e;

    .line 64
    .line 65
    invoke-static {v0}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 66
    .line 67
    .line 68
    move-result-object v12

    .line 69
    iput-object v12, p0, Lcom/moloco/sdk/internal/publisher/l0;->m:LKd/a;

    .line 70
    .line 71
    sget-object v0, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 72
    .line 73
    const-string v0, "ad_create_to_load_ms"

    .line 74
    .line 75
    invoke-virtual {v11, v0}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 80
    .line 81
    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 86
    .line 87
    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const-string v3, "toLowerCase(...)"

    .line 92
    .line 93
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const-string v3, "ad_type"

    .line 97
    .line 98
    invoke-virtual {v0, v3, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->n:Lcom/moloco/sdk/acm/l;

    .line 102
    .line 103
    new-instance v13, LAf/r;

    .line 104
    .line 105
    const/16 v0, 0x11

    .line 106
    .line 107
    invoke-direct {v13, p0, v0}, LAf/r;-><init>(Ljava/lang/Object;I)V

    .line 108
    .line 109
    .line 110
    new-instance v3, LEf/p0;

    .line 111
    .line 112
    move-object v0, v3

    .line 113
    const-class v3, Lcom/moloco/sdk/internal/publisher/l0;

    .line 114
    .line 115
    const-string v4, "recreateXenossAd"

    .line 116
    .line 117
    const/4 v1, 0x1

    .line 118
    const-string v5, "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;"

    .line 119
    .line 120
    const/4 v6, 0x0

    .line 121
    const/4 v7, 0x2

    .line 122
    move-object v2, p0

    .line 123
    invoke-direct/range {v0 .. v7}, LEf/p0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 124
    .line 125
    .line 126
    sget-object v1, Lcom/moloco/sdk/service_locator/a;->a:Lef/p;

    .line 127
    .line 128
    invoke-virtual {v1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    move-object v5, v1

    .line 133
    check-cast v5, Lcom/moloco/sdk/internal/services/l;

    .line 134
    .line 135
    new-instance v7, Lcom/moloco/sdk/internal/publisher/d0;

    .line 136
    .line 137
    const/4 v1, 0x0

    .line 138
    invoke-direct {v7, p0, v1}, Lcom/moloco/sdk/internal/publisher/d0;-><init>(Lcom/moloco/sdk/internal/publisher/l0;I)V

    .line 139
    .line 140
    .line 141
    move-object v3, v0

    .line 142
    move-object v2, v8

    .line 143
    move-object v4, v10

    .line 144
    move-object v6, v11

    .line 145
    move-object v0, v12

    .line 146
    move-object v1, v13

    .line 147
    invoke-static/range {v0 .. v7}, Lvf/a;->c(LKd/a;Ltf/l;Ljava/lang/String;Ltf/l;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/internal/services/l;Lcom/moloco/sdk/acm/recorder/c;Ltf/a;)Lcom/moloco/sdk/internal/publisher/B;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iput-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->p:Lcom/moloco/sdk/internal/publisher/B;

    .line 152
    .line 153
    const/4 v0, 0x0

    .line 154
    invoke-interface {v9, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;

    .line 159
    .line 160
    iput-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->q:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;

    .line 161
    .line 162
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->k:LW1/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, LW1/r;->a(JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(Lcom/moloco/sdk/internal/r;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->h:LC8/i;

    .line 2
    .line 3
    iget-object v1, v0, LC8/i;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LEf/H0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v2}, LEf/z0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v2, v0, LC8/i;->e:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v1, v0, LC8/i;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/f;->l()LHf/v0;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, LHf/v0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v3, 0x1

    .line 38
    if-ne v1, v3, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v3, 0x0

    .line 42
    :goto_0
    iget-object v1, v0, LC8/i;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-interface {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/n;->destroy()V

    .line 49
    .line 50
    .line 51
    :cond_2
    iput-object v2, v0, LC8/i;->b:Ljava/lang/Object;

    .line 52
    .line 53
    iget-object v1, v0, LC8/i;->f:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, LX2/j;

    .line 56
    .line 57
    iput-object v2, v0, LC8/i;->f:Ljava/lang/Object;

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    invoke-virtual {v1, p1}, LX2/j;->R(Lcom/moloco/sdk/internal/r;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    if-eqz v3, :cond_4

    .line 67
    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    iget-object p1, p0, Lcom/moloco/sdk/internal/publisher/l0;->d:Ljava/lang/String;

    .line 71
    .line 72
    const/4 v3, 0x6

    .line 73
    invoke-static {p1, v2, v2, v3, v2}, Lcom/moloco/sdk/publisher/MolocoAdKt;->createAdInfo$default(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ILjava/lang/Object;)Lcom/moloco/sdk/publisher/MolocoAd;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {v1, p1}, LX2/j;->W(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    iput-object v2, v0, LC8/i;->c:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object v2, v0, LC8/i;->d:Ljava/lang/Object;

    .line 83
    .line 84
    return-void
.end method

.method public final c()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->h:LC8/i;

    .line 2
    .line 3
    iget-object v0, v0, LC8/i;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/m;->getCreativeType()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public final destroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->m:LKd/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, LEf/H;->j(LEf/E;Ljava/util/concurrent/CancellationException;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/moloco/sdk/internal/publisher/l0;->b(Lcom/moloco/sdk/internal/r;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lcom/moloco/sdk/internal/publisher/l0;->s:LFf/d;

    .line 11
    .line 12
    return-void
.end method

.method public final isLoaded()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->p:Lcom/moloco/sdk/internal/publisher/B;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/moloco/sdk/internal/publisher/B;->k:Z

    .line 4
    .line 5
    return v0
.end method

.method public final load(Ljava/lang/String;Lcom/moloco/sdk/publisher/AdLoad$Listener;)V
    .locals 2

    .line 1
    const-string v0, "bidResponseJson"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->l:Lcom/moloco/sdk/acm/recorder/c;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/l0;->n:Lcom/moloco/sdk/acm/l;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 14
    .line 15
    const-string v1, "load_to_show_time"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->o:Lcom/moloco/sdk/acm/l;

    .line 22
    .line 23
    new-instance v0, Lcom/moloco/sdk/internal/publisher/h0;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p0, p1, p2, v1}, Lcom/moloco/sdk/internal/publisher/h0;-><init>(Lcom/moloco/sdk/internal/publisher/l0;Ljava/lang/String;Lcom/moloco/sdk/publisher/AdLoad$Listener;Ljf/c;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x3

    .line 30
    iget-object p2, p0, Lcom/moloco/sdk/internal/publisher/l0;->m:LKd/a;

    .line 31
    .line 32
    invoke-static {p2, v1, v0, p1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final show(Lcom/moloco/sdk/publisher/AdShowListener;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/l0;->o:Lcom/moloco/sdk/acm/l;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/l0;->l:Lcom/moloco/sdk/acm/recorder/c;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/l0;->i:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 6
    .line 7
    const-string v3, "ad_type"

    .line 8
    .line 9
    const-string v4, "toLowerCase(...)"

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/moloco/sdk/internal/publisher/l0;->c()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 27
    .line 28
    const-string v5, "UNKNOWN"

    .line 29
    .line 30
    :goto_0
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 31
    .line 32
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sget-object v6, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 46
    .line 47
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v3, v6}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v6, "creative_type"

    .line 58
    .line 59
    invoke-virtual {v0, v6, v5}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v0}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    new-instance v0, Lcom/moloco/sdk/acm/h;

    .line 66
    .line 67
    sget-object v5, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 68
    .line 69
    const-string v5, "show_ad_attempted"

    .line 70
    .line 71
    invoke-direct {v0, v5}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    sget-object v5, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 81
    .line 82
    invoke-virtual {v2, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v3, v2}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v0}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 93
    .line 94
    .line 95
    new-instance v0, Lcom/moloco/sdk/internal/publisher/k0;

    .line 96
    .line 97
    const/4 v1, 0x0

    .line 98
    invoke-direct {v0, p1, p0, v1}, Lcom/moloco/sdk/internal/publisher/k0;-><init>(Lcom/moloco/sdk/publisher/AdShowListener;Lcom/moloco/sdk/internal/publisher/l0;Ljf/c;)V

    .line 99
    .line 100
    .line 101
    const/4 p1, 0x3

    .line 102
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/l0;->m:LKd/a;

    .line 103
    .line 104
    invoke-static {v2, v1, v0, p1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 105
    .line 106
    .line 107
    return-void
.end method
