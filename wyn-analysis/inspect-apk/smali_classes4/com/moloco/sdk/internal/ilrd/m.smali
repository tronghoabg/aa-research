.class public final Lcom/moloco/sdk/internal/ilrd/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final a:LKd/a;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

.field public final d:J

.field public final e:I

.field public final f:J

.field public final g:J

.field public final h:Lcom/moloco/sdk/internal/services/k;

.field public final i:Lcom/moloco/sdk/internal/services/q;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Lcom/moloco/sdk/internal/services/g;

.field public final m:LC8/i;

.field public final n:LC8/i;

.field public final o:LC8/i;

.field public final p:LNf/d;

.field public q:Lcom/moloco/sdk/internal/ilrd/r;

.field public final r:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LKd/a;Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;JIJJLcom/moloco/sdk/internal/services/k;Landroidx/lifecycle/o;Lcom/moloco/sdk/internal/services/q;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/services/g;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p6

    move-object/from16 v5, p11

    move-object/from16 v6, p12

    move-object/from16 v7, p13

    move-object/from16 v8, p16

    .line 1
    new-instance v9, LC8/i;

    const-string v10, "SessionInactiveScheduler"

    invoke-direct {v9, v1, v5, v10}, LC8/i;-><init>(LKd/a;Lcom/moloco/sdk/internal/services/k;Ljava/lang/String;)V

    .line 2
    new-instance v10, LC8/i;

    const-string v11, "SessionMaxLengthScheduler"

    invoke-direct {v10, v1, v5, v11}, LC8/i;-><init>(LKd/a;Lcom/moloco/sdk/internal/services/k;Ljava/lang/String;)V

    .line 3
    new-instance v11, LC8/i;

    const-string v12, "UploadIntervalScheduler"

    invoke-direct {v11, v1, v5, v12}, LC8/i;-><init>(LKd/a;Lcom/moloco/sdk/internal/services/k;Ljava/lang/String;)V

    .line 4
    const-string v12, "persistentHttpRequest"

    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "timeProvider"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "processLifeycle"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "advertisingIdService"

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "dataStoreService"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object v1, v0, Lcom/moloco/sdk/internal/ilrd/m;->a:LKd/a;

    .line 7
    iput-object v2, v0, Lcom/moloco/sdk/internal/ilrd/m;->b:Ljava/lang/String;

    .line 8
    iput-object v3, v0, Lcom/moloco/sdk/internal/ilrd/m;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

    move-wide/from16 v12, p4

    .line 9
    iput-wide v12, v0, Lcom/moloco/sdk/internal/ilrd/m;->d:J

    .line 10
    iput v4, v0, Lcom/moloco/sdk/internal/ilrd/m;->e:I

    move-wide/from16 v14, p7

    .line 11
    iput-wide v14, v0, Lcom/moloco/sdk/internal/ilrd/m;->f:J

    move-wide/from16 v12, p9

    .line 12
    iput-wide v12, v0, Lcom/moloco/sdk/internal/ilrd/m;->g:J

    .line 13
    iput-object v5, v0, Lcom/moloco/sdk/internal/ilrd/m;->h:Lcom/moloco/sdk/internal/services/k;

    .line 14
    iput-object v7, v0, Lcom/moloco/sdk/internal/ilrd/m;->i:Lcom/moloco/sdk/internal/services/q;

    move-object/from16 v3, p14

    .line 15
    iput-object v3, v0, Lcom/moloco/sdk/internal/ilrd/m;->j:Ljava/lang/String;

    move-object/from16 v3, p15

    .line 16
    iput-object v3, v0, Lcom/moloco/sdk/internal/ilrd/m;->k:Ljava/lang/String;

    .line 17
    iput-object v8, v0, Lcom/moloco/sdk/internal/ilrd/m;->l:Lcom/moloco/sdk/internal/services/g;

    .line 18
    iput-object v9, v0, Lcom/moloco/sdk/internal/ilrd/m;->m:LC8/i;

    .line 19
    iput-object v10, v0, Lcom/moloco/sdk/internal/ilrd/m;->n:LC8/i;

    .line 20
    iput-object v11, v0, Lcom/moloco/sdk/internal/ilrd/m;->o:LC8/i;

    .line 21
    invoke-static {}, LNf/e;->a()LNf/d;

    move-result-object v3

    iput-object v3, v0, Lcom/moloco/sdk/internal/ilrd/m;->p:LNf/d;

    .line 22
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Lcom/moloco/sdk/internal/ilrd/m;->r:Ljava/util/ArrayList;

    .line 23
    sget-object v3, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    const-string v5, "ILRD repository initialized - url="

    const-string v7, ", uploadInterval="

    .line 24
    invoke-static {v5, v2, v7}, Lcom/google/android/gms/internal/consent_sdk/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 25
    invoke-static {v14, v15}, LCf/a;->j(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", maxBatchSize="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", sessionExpiry="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p4 .. p5}, LCf/a;->j(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", maxSessionLength="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v12, v13}, LCf/a;->j(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v7, "IlrdEventsRepository"

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object/from16 p4, v2

    move-object/from16 p2, v3

    move-object/from16 p5, v4

    move/from16 p6, v5

    move-object/from16 p3, v7

    move/from16 p7, v8

    move-object/from16 p8, v9

    invoke-static/range {p2 .. p8}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 26
    sget-object v2, LEf/S;->a:LLf/e;

    .line 27
    sget-object v2, LJf/n;->a:LFf/e;

    .line 28
    iget-object v2, v2, LFf/e;->e:LFf/e;

    .line 29
    new-instance v3, Lcom/moloco/sdk/internal/ilrd/a;

    const/4 v4, 0x0

    invoke-direct {v3, v6, v0, v4}, Lcom/moloco/sdk/internal/ilrd/a;-><init>(Landroidx/lifecycle/o;Lcom/moloco/sdk/internal/ilrd/m;Ljf/c;)V

    const/4 v5, 0x2

    invoke-static {v1, v2, v3, v5}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 30
    new-instance v2, Lcom/moloco/sdk/internal/ilrd/b;

    invoke-direct {v2, v0, v4}, Lcom/moloco/sdk/internal/ilrd/b;-><init>(Lcom/moloco/sdk/internal/ilrd/m;Ljf/c;)V

    const/4 v3, 0x3

    invoke-static {v1, v4, v2, v3}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    return-void
.end method

.method public static final a(Lcom/moloco/sdk/internal/ilrd/m;Lcom/moloco/sdk/internal/ilrd/t;)Lcom/moloco/sdk/f0;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/moloco/sdk/f0;->e()Lcom/moloco/sdk/e0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Lcom/moloco/sdk/e0;->a(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/moloco/sdk/internal/ilrd/m;->q:Lcom/moloco/sdk/internal/ilrd/r;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/moloco/sdk/internal/ilrd/r;->c()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v2}, Lcom/moloco/sdk/e0;->c(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sget-object v2, LCf/a;->b:LCf/h;

    .line 31
    .line 32
    iget-object p0, p0, Lcom/moloco/sdk/internal/ilrd/m;->h:Lcom/moloco/sdk/internal/services/k;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    iget-wide v4, v1, Lcom/moloco/sdk/internal/ilrd/r;->d:J

    .line 42
    .line 43
    sub-long/2addr v2, v4

    .line 44
    sget-object p0, LCf/c;->c:LCf/c;

    .line 45
    .line 46
    invoke-static {v2, v3, p0}, LFe/b;->T(JLCf/c;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    sget-object v4, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 51
    .line 52
    new-instance p0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v5, "Event created: sessionId="

    .line 55
    .line 56
    invoke-direct {p0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/moloco/sdk/internal/ilrd/r;->c()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ", sessionAge="

    .line 67
    .line 68
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-static {v2, v3}, LCf/a;->j(J)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    const/16 v9, 0xc

    .line 83
    .line 84
    const/4 v10, 0x0

    .line 85
    const-string v5, "IlrdEventsRepository"

    .line 86
    .line 87
    const/4 v7, 0x0

    .line 88
    const/4 v8, 0x0

    .line 89
    invoke-static/range {v4 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_0
    instance-of p0, p1, Lcom/moloco/sdk/internal/ilrd/t;

    .line 93
    .line 94
    if-eqz p0, :cond_1

    .line 95
    .line 96
    iget-object p0, p1, Lcom/moloco/sdk/internal/ilrd/t;->a:Lcom/moloco/sdk/l0;

    .line 97
    .line 98
    invoke-virtual {v0, p0}, Lcom/moloco/sdk/e0;->b(Lcom/moloco/sdk/l0;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    check-cast p0, Lcom/moloco/sdk/f0;

    .line 106
    .line 107
    return-object p0

    .line 108
    :cond_1
    new-instance p0, LE5/Q;

    .line 109
    .line 110
    const/16 p1, 0x9

    .line 111
    .line 112
    const/4 v0, 0x0

    .line 113
    invoke-direct {p0, v0, p1}, LE5/Q;-><init>(BI)V

    .line 114
    .line 115
    .line 116
    throw p0
.end method

.method public static final b(Lcom/moloco/sdk/internal/ilrd/m;Llf/c;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    instance-of v2, v1, Lcom/moloco/sdk/internal/ilrd/d;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, Lcom/moloco/sdk/internal/ilrd/d;

    .line 14
    .line 15
    iget v3, v2, Lcom/moloco/sdk/internal/ilrd/d;->e:I

    .line 16
    .line 17
    const/high16 v4, -0x80000000

    .line 18
    .line 19
    and-int v5, v3, v4

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    sub-int/2addr v3, v4

    .line 24
    iput v3, v2, Lcom/moloco/sdk/internal/ilrd/d;->e:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v2, Lcom/moloco/sdk/internal/ilrd/d;

    .line 28
    .line 29
    invoke-direct {v2, v0, v1}, Lcom/moloco/sdk/internal/ilrd/d;-><init>(Lcom/moloco/sdk/internal/ilrd/m;Llf/c;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget-object v1, v2, Lcom/moloco/sdk/internal/ilrd/d;->c:Ljava/lang/Object;

    .line 33
    .line 34
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 35
    .line 36
    iget v4, v2, Lcom/moloco/sdk/internal/ilrd/d;->e:I

    .line 37
    .line 38
    sget-object v5, Lef/C;->a:Lef/C;

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    const-string v7, "ilrd_session_store"

    .line 42
    .line 43
    const-string v8, "ilrd_events_store"

    .line 44
    .line 45
    packed-switch v4, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0

    .line 56
    :pswitch_0
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_8

    .line 60
    .line 61
    :pswitch_1
    iget-object v4, v2, Lcom/moloco/sdk/internal/ilrd/d;->a:Lcom/moloco/sdk/internal/ilrd/m;

    .line 62
    .line 63
    :try_start_0
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    goto/16 :goto_8

    .line 67
    .line 68
    :catch_0
    move-exception v0

    .line 69
    move-object v14, v0

    .line 70
    move-object v10, v8

    .line 71
    goto/16 :goto_7

    .line 72
    .line 73
    :pswitch_2
    iget-object v0, v2, Lcom/moloco/sdk/internal/ilrd/d;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lcom/moloco/sdk/internal/ilrd/r;

    .line 76
    .line 77
    iget-object v4, v2, Lcom/moloco/sdk/internal/ilrd/d;->a:Lcom/moloco/sdk/internal/ilrd/m;

    .line 78
    .line 79
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object v10, v8

    .line 83
    goto/16 :goto_5

    .line 84
    .line 85
    :pswitch_3
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-object v5

    .line 89
    :pswitch_4
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    return-object v5

    .line 93
    :pswitch_5
    iget-object v0, v2, Lcom/moloco/sdk/internal/ilrd/d;->a:Lcom/moloco/sdk/internal/ilrd/m;

    .line 94
    .line 95
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto/16 :goto_3

    .line 99
    .line 100
    :pswitch_6
    iget-object v0, v2, Lcom/moloco/sdk/internal/ilrd/d;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Ljava/lang/String;

    .line 103
    .line 104
    iget-object v4, v2, Lcom/moloco/sdk/internal/ilrd/d;->a:Lcom/moloco/sdk/internal/ilrd/m;

    .line 105
    .line 106
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object v1, v0

    .line 110
    move-object v0, v4

    .line 111
    goto :goto_2

    .line 112
    :pswitch_7
    iget-object v0, v2, Lcom/moloco/sdk/internal/ilrd/d;->a:Lcom/moloco/sdk/internal/ilrd/m;

    .line 113
    .line 114
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :pswitch_8
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iput-object v0, v2, Lcom/moloco/sdk/internal/ilrd/d;->a:Lcom/moloco/sdk/internal/ilrd/m;

    .line 122
    .line 123
    const/4 v1, 0x1

    .line 124
    iput v1, v2, Lcom/moloco/sdk/internal/ilrd/d;->e:I

    .line 125
    .line 126
    iget-object v1, v0, Lcom/moloco/sdk/internal/ilrd/m;->l:Lcom/moloco/sdk/internal/services/g;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    sget-object v4, LEf/S;->a:LLf/e;

    .line 132
    .line 133
    sget-object v4, LLf/d;->b:LLf/d;

    .line 134
    .line 135
    new-instance v9, Lcom/moloco/sdk/internal/services/d;

    .line 136
    .line 137
    invoke-direct {v9, v1, v7, v6}, Lcom/moloco/sdk/internal/services/d;-><init>(Lcom/moloco/sdk/internal/services/g;Ljava/lang/String;Ljf/c;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v4, v9, v2}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    if-ne v1, v3, :cond_1

    .line 145
    .line 146
    goto/16 :goto_9

    .line 147
    .line 148
    :cond_1
    :goto_1
    check-cast v1, Ljava/lang/String;

    .line 149
    .line 150
    if-nez v1, :cond_2

    .line 151
    .line 152
    goto/16 :goto_4

    .line 153
    .line 154
    :cond_2
    sget-object v9, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 155
    .line 156
    const-string v4, "Existing session found: "

    .line 157
    .line 158
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v11

    .line 162
    const/16 v14, 0xc

    .line 163
    .line 164
    const/4 v15, 0x0

    .line 165
    const-string v10, "IlrdEventsRepository"

    .line 166
    .line 167
    const/4 v12, 0x0

    .line 168
    const/4 v13, 0x0

    .line 169
    invoke-static/range {v9 .. v15}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iget-object v4, v0, Lcom/moloco/sdk/internal/ilrd/m;->l:Lcom/moloco/sdk/internal/services/g;

    .line 173
    .line 174
    iput-object v0, v2, Lcom/moloco/sdk/internal/ilrd/d;->a:Lcom/moloco/sdk/internal/ilrd/m;

    .line 175
    .line 176
    iput-object v1, v2, Lcom/moloco/sdk/internal/ilrd/d;->b:Ljava/lang/Object;

    .line 177
    .line 178
    const/4 v9, 0x2

    .line 179
    iput v9, v2, Lcom/moloco/sdk/internal/ilrd/d;->e:I

    .line 180
    .line 181
    invoke-virtual {v4, v7, v2}, Lcom/moloco/sdk/internal/services/g;->b(Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    if-ne v4, v3, :cond_3

    .line 186
    .line 187
    goto/16 :goto_9

    .line 188
    .line 189
    :cond_3
    :goto_2
    sget-object v4, LEf/S;->a:LLf/e;

    .line 190
    .line 191
    new-instance v7, Lcom/moloco/sdk/internal/ilrd/e;

    .line 192
    .line 193
    invoke-direct {v7, v0, v1, v6}, Lcom/moloco/sdk/internal/ilrd/e;-><init>(Lcom/moloco/sdk/internal/ilrd/m;Ljava/lang/String;Ljf/c;)V

    .line 194
    .line 195
    .line 196
    iput-object v0, v2, Lcom/moloco/sdk/internal/ilrd/d;->a:Lcom/moloco/sdk/internal/ilrd/m;

    .line 197
    .line 198
    iput-object v6, v2, Lcom/moloco/sdk/internal/ilrd/d;->b:Ljava/lang/Object;

    .line 199
    .line 200
    const/4 v1, 0x3

    .line 201
    iput v1, v2, Lcom/moloco/sdk/internal/ilrd/d;->e:I

    .line 202
    .line 203
    invoke-static {v4, v7, v2}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    if-ne v1, v3, :cond_4

    .line 208
    .line 209
    goto/16 :goto_9

    .line 210
    .line 211
    :cond_4
    :goto_3
    check-cast v1, Lcom/moloco/sdk/internal/ilrd/r;

    .line 212
    .line 213
    iget-object v4, v0, Lcom/moloco/sdk/internal/ilrd/m;->h:Lcom/moloco/sdk/internal/services/k;

    .line 214
    .line 215
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 219
    .line 220
    .line 221
    move-result-wide v9

    .line 222
    sget-object v4, LCf/a;->b:LCf/h;

    .line 223
    .line 224
    iget-wide v11, v1, Lcom/moloco/sdk/internal/ilrd/r;->d:J

    .line 225
    .line 226
    sub-long v11, v9, v11

    .line 227
    .line 228
    sget-object v4, LCf/c;->c:LCf/c;

    .line 229
    .line 230
    invoke-static {v11, v12, v4}, LFe/b;->T(JLCf/c;)J

    .line 231
    .line 232
    .line 233
    move-result-wide v11

    .line 234
    invoke-virtual {v1}, Lcom/moloco/sdk/internal/ilrd/r;->b()Lcom/moloco/sdk/internal/ilrd/o;

    .line 235
    .line 236
    .line 237
    move-result-object v7

    .line 238
    iget-wide v13, v0, Lcom/moloco/sdk/internal/ilrd/m;->g:J

    .line 239
    .line 240
    invoke-static {v11, v12, v13, v14}, LCf/a;->c(JJ)I

    .line 241
    .line 242
    .line 243
    move-result v15

    .line 244
    iget-object v6, v0, Lcom/moloco/sdk/internal/ilrd/m;->l:Lcom/moloco/sdk/internal/services/g;

    .line 245
    .line 246
    if-lez v15, :cond_5

    .line 247
    .line 248
    sget-object v16, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 249
    .line 250
    const/16 v21, 0xc

    .line 251
    .line 252
    const/16 v22, 0x0

    .line 253
    .line 254
    const-string v17, "IlrdEventsRepository"

    .line 255
    .line 256
    const-string v18, "Discarding restored session - exceeded maximum length."

    .line 257
    .line 258
    const/16 v19, 0x0

    .line 259
    .line 260
    const/16 v20, 0x0

    .line 261
    .line 262
    invoke-static/range {v16 .. v22}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    const/4 v1, 0x0

    .line 266
    iput-object v1, v2, Lcom/moloco/sdk/internal/ilrd/d;->a:Lcom/moloco/sdk/internal/ilrd/m;

    .line 267
    .line 268
    const/4 v0, 0x4

    .line 269
    iput v0, v2, Lcom/moloco/sdk/internal/ilrd/d;->e:I

    .line 270
    .line 271
    invoke-virtual {v6, v8, v2}, Lcom/moloco/sdk/internal/services/g;->b(Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    if-ne v0, v3, :cond_6

    .line 276
    .line 277
    goto/16 :goto_9

    .line 278
    .line 279
    :cond_5
    const-wide/16 v15, 0x0

    .line 280
    .line 281
    move-wide/from16 v17, v9

    .line 282
    .line 283
    iget-wide v9, v7, Lcom/moloco/sdk/internal/ilrd/o;->a:J

    .line 284
    .line 285
    cmp-long v7, v9, v15

    .line 286
    .line 287
    if-lez v7, :cond_7

    .line 288
    .line 289
    sub-long v9, v17, v9

    .line 290
    .line 291
    move-wide v15, v9

    .line 292
    iget-wide v9, v0, Lcom/moloco/sdk/internal/ilrd/m;->d:J

    .line 293
    .line 294
    invoke-static {v9, v10}, LCf/a;->d(J)J

    .line 295
    .line 296
    .line 297
    move-result-wide v9

    .line 298
    cmp-long v7, v15, v9

    .line 299
    .line 300
    if-lez v7, :cond_7

    .line 301
    .line 302
    sget-object v19, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 303
    .line 304
    const/16 v24, 0xc

    .line 305
    .line 306
    const/16 v25, 0x0

    .line 307
    .line 308
    const-string v20, "IlrdEventsRepository"

    .line 309
    .line 310
    const-string v21, "Discarding restored session - exceeded inactivity timeout"

    .line 311
    .line 312
    const/16 v22, 0x0

    .line 313
    .line 314
    const/16 v23, 0x0

    .line 315
    .line 316
    invoke-static/range {v19 .. v25}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    const/4 v1, 0x0

    .line 320
    iput-object v1, v2, Lcom/moloco/sdk/internal/ilrd/d;->a:Lcom/moloco/sdk/internal/ilrd/m;

    .line 321
    .line 322
    const/4 v0, 0x5

    .line 323
    iput v0, v2, Lcom/moloco/sdk/internal/ilrd/d;->e:I

    .line 324
    .line 325
    invoke-virtual {v6, v8, v2}, Lcom/moloco/sdk/internal/services/g;->b(Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    if-ne v0, v3, :cond_6

    .line 330
    .line 331
    goto/16 :goto_9

    .line 332
    .line 333
    :cond_6
    :goto_4
    return-object v5

    .line 334
    :cond_7
    iget-wide v9, v1, Lcom/moloco/sdk/internal/ilrd/r;->d:J

    .line 335
    .line 336
    sub-long v9, v17, v9

    .line 337
    .line 338
    invoke-static {v9, v10, v4}, LFe/b;->T(JLCf/c;)J

    .line 339
    .line 340
    .line 341
    move-result-wide v9

    .line 342
    sget-object v15, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 343
    .line 344
    new-instance v4, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    const-string v7, "ILRD session restored successfully - sessionId="

    .line 347
    .line 348
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1}, Lcom/moloco/sdk/internal/ilrd/r;->c()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v7

    .line 355
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    const-string v7, ", age="

    .line 359
    .line 360
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-static {v9, v10}, LCf/a;->j(J)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v7

    .line 367
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    const-string v7, ", impressions="

    .line 371
    .line 372
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1}, Lcom/moloco/sdk/internal/ilrd/r;->b()Lcom/moloco/sdk/internal/ilrd/o;

    .line 376
    .line 377
    .line 378
    move-result-object v7

    .line 379
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v17

    .line 386
    const/16 v20, 0xc

    .line 387
    .line 388
    const/16 v21, 0x0

    .line 389
    .line 390
    const-string v16, "IlrdEventsRepository"

    .line 391
    .line 392
    const/16 v18, 0x0

    .line 393
    .line 394
    const/16 v19, 0x0

    .line 395
    .line 396
    invoke-static/range {v15 .. v21}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    iput-object v1, v0, Lcom/moloco/sdk/internal/ilrd/m;->q:Lcom/moloco/sdk/internal/ilrd/r;

    .line 400
    .line 401
    new-instance v4, Lcom/moloco/sdk/internal/ilrd/h;

    .line 402
    .line 403
    const/4 v7, 0x0

    .line 404
    invoke-direct {v4, v0, v7}, Lcom/moloco/sdk/internal/ilrd/h;-><init>(Lcom/moloco/sdk/internal/ilrd/m;Ljf/c;)V

    .line 405
    .line 406
    .line 407
    iget-object v9, v0, Lcom/moloco/sdk/internal/ilrd/m;->o:LC8/i;

    .line 408
    .line 409
    move-object v10, v8

    .line 410
    iget-wide v7, v0, Lcom/moloco/sdk/internal/ilrd/m;->f:J

    .line 411
    .line 412
    invoke-virtual {v9, v7, v8, v4}, LC8/i;->b(JLtf/l;)V

    .line 413
    .line 414
    .line 415
    invoke-static {v11, v12}, LCf/a;->k(J)J

    .line 416
    .line 417
    .line 418
    move-result-wide v7

    .line 419
    invoke-static {v13, v14, v7, v8}, LCf/a;->g(JJ)J

    .line 420
    .line 421
    .line 422
    move-result-wide v7

    .line 423
    new-instance v4, Lcom/moloco/sdk/internal/ilrd/g;

    .line 424
    .line 425
    const/4 v9, 0x0

    .line 426
    invoke-direct {v4, v0, v9}, Lcom/moloco/sdk/internal/ilrd/g;-><init>(Lcom/moloco/sdk/internal/ilrd/m;Ljf/c;)V

    .line 427
    .line 428
    .line 429
    iget-object v9, v0, Lcom/moloco/sdk/internal/ilrd/m;->n:LC8/i;

    .line 430
    .line 431
    invoke-virtual {v9, v7, v8, v4}, LC8/i;->b(JLtf/l;)V

    .line 432
    .line 433
    .line 434
    iput-object v0, v2, Lcom/moloco/sdk/internal/ilrd/d;->a:Lcom/moloco/sdk/internal/ilrd/m;

    .line 435
    .line 436
    iput-object v1, v2, Lcom/moloco/sdk/internal/ilrd/d;->b:Ljava/lang/Object;

    .line 437
    .line 438
    const/4 v4, 0x6

    .line 439
    iput v4, v2, Lcom/moloco/sdk/internal/ilrd/d;->e:I

    .line 440
    .line 441
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    sget-object v4, LEf/S;->a:LLf/e;

    .line 445
    .line 446
    sget-object v4, LLf/d;->b:LLf/d;

    .line 447
    .line 448
    new-instance v7, Lcom/moloco/sdk/internal/services/d;

    .line 449
    .line 450
    const/4 v9, 0x0

    .line 451
    invoke-direct {v7, v6, v10, v9}, Lcom/moloco/sdk/internal/services/d;-><init>(Lcom/moloco/sdk/internal/services/g;Ljava/lang/String;Ljf/c;)V

    .line 452
    .line 453
    .line 454
    invoke-static {v4, v7, v2}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    if-ne v4, v3, :cond_8

    .line 459
    .line 460
    goto/16 :goto_9

    .line 461
    .line 462
    :cond_8
    move-object/from16 v26, v4

    .line 463
    .line 464
    move-object v4, v0

    .line 465
    move-object v0, v1

    .line 466
    move-object/from16 v1, v26

    .line 467
    .line 468
    :goto_5
    check-cast v1, Ljava/lang/String;

    .line 469
    .line 470
    if-eqz v1, :cond_c

    .line 471
    .line 472
    const/4 v6, 0x0

    .line 473
    :try_start_1
    invoke-static {v1, v6}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    invoke-static {v1}, Lcom/moloco/sdk/h0;->i([B)Lcom/moloco/sdk/h0;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    invoke-virtual {v1}, Lcom/moloco/sdk/h0;->g()Lcom/google/protobuf/Internal$ProtobufList;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    const-string v6, "getEventsList(...)"

    .line 486
    .line 487
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    new-instance v6, Ljava/util/ArrayList;

    .line 491
    .line 492
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 493
    .line 494
    .line 495
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    :cond_9
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 500
    .line 501
    .line 502
    move-result v7

    .line 503
    if-eqz v7, :cond_a

    .line 504
    .line 505
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v7

    .line 509
    move-object v8, v7

    .line 510
    check-cast v8, Lcom/moloco/sdk/f0;

    .line 511
    .line 512
    invoke-virtual {v8}, Lcom/moloco/sdk/f0;->getSessionId()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v8

    .line 516
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/ilrd/r;->c()Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v9

    .line 520
    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v8

    .line 524
    if-eqz v8, :cond_9

    .line 525
    .line 526
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    goto :goto_6

    .line 530
    :catch_1
    move-exception v0

    .line 531
    move-object v14, v0

    .line 532
    goto :goto_7

    .line 533
    :cond_a
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 534
    .line 535
    .line 536
    move-result v1

    .line 537
    if-nez v1, :cond_b

    .line 538
    .line 539
    iget-object v1, v4, Lcom/moloco/sdk/internal/ilrd/m;->r:Ljava/util/ArrayList;

    .line 540
    .line 541
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 542
    .line 543
    .line 544
    sget-object v11, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 545
    .line 546
    const-string v12, "IlrdEventsRepository"

    .line 547
    .line 548
    new-instance v1, Ljava/lang/StringBuilder;

    .line 549
    .line 550
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 551
    .line 552
    .line 553
    const-string v7, "Restored "

    .line 554
    .line 555
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 559
    .line 560
    .line 561
    move-result v6

    .line 562
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    const-string v6, " pending ILRD events for sessionId="

    .line 566
    .line 567
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/ilrd/r;->c()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v13

    .line 581
    const/16 v16, 0xc

    .line 582
    .line 583
    const/16 v17, 0x0

    .line 584
    .line 585
    const/4 v14, 0x0

    .line 586
    const/4 v15, 0x0

    .line 587
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    goto :goto_8

    .line 591
    :cond_b
    sget-object v11, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 592
    .line 593
    const-string v12, "IlrdEventsRepository"

    .line 594
    .line 595
    new-instance v1, Ljava/lang/StringBuilder;

    .line 596
    .line 597
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 598
    .line 599
    .line 600
    const-string v6, "No pending ILRD events matched restored sessionId="

    .line 601
    .line 602
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/ilrd/r;->c()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 610
    .line 611
    .line 612
    const-string v0, "; clearing persisted events"

    .line 613
    .line 614
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v13

    .line 621
    const/16 v16, 0xc

    .line 622
    .line 623
    const/16 v17, 0x0

    .line 624
    .line 625
    const/4 v14, 0x0

    .line 626
    const/4 v15, 0x0

    .line 627
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 628
    .line 629
    .line 630
    iget-object v0, v4, Lcom/moloco/sdk/internal/ilrd/m;->l:Lcom/moloco/sdk/internal/services/g;

    .line 631
    .line 632
    iput-object v4, v2, Lcom/moloco/sdk/internal/ilrd/d;->a:Lcom/moloco/sdk/internal/ilrd/m;

    .line 633
    .line 634
    const/4 v1, 0x0

    .line 635
    iput-object v1, v2, Lcom/moloco/sdk/internal/ilrd/d;->b:Ljava/lang/Object;

    .line 636
    .line 637
    const/4 v1, 0x7

    .line 638
    iput v1, v2, Lcom/moloco/sdk/internal/ilrd/d;->e:I

    .line 639
    .line 640
    invoke-virtual {v0, v10, v2}, Lcom/moloco/sdk/internal/services/g;->b(Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 644
    if-ne v0, v3, :cond_c

    .line 645
    .line 646
    goto :goto_9

    .line 647
    :goto_7
    sget-object v11, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 648
    .line 649
    const/16 v16, 0x8

    .line 650
    .line 651
    const/16 v17, 0x0

    .line 652
    .line 653
    const-string v12, "IlrdEventsRepository"

    .line 654
    .line 655
    const-string v13, "Failed to restore persisted ILRD events"

    .line 656
    .line 657
    const/4 v15, 0x0

    .line 658
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    iget-object v0, v4, Lcom/moloco/sdk/internal/ilrd/m;->l:Lcom/moloco/sdk/internal/services/g;

    .line 662
    .line 663
    const/4 v1, 0x0

    .line 664
    iput-object v1, v2, Lcom/moloco/sdk/internal/ilrd/d;->a:Lcom/moloco/sdk/internal/ilrd/m;

    .line 665
    .line 666
    iput-object v1, v2, Lcom/moloco/sdk/internal/ilrd/d;->b:Ljava/lang/Object;

    .line 667
    .line 668
    const/16 v1, 0x8

    .line 669
    .line 670
    iput v1, v2, Lcom/moloco/sdk/internal/ilrd/d;->e:I

    .line 671
    .line 672
    invoke-virtual {v0, v10, v2}, Lcom/moloco/sdk/internal/services/g;->b(Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    if-ne v0, v3, :cond_c

    .line 677
    .line 678
    goto :goto_9

    .line 679
    :cond_c
    :goto_8
    move-object v3, v5

    .line 680
    :goto_9
    return-object v3

    .line 681
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final d(Lcom/moloco/sdk/internal/ilrd/m;Llf/c;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "Ilrd request created now sending it with "

    .line 5
    .line 6
    instance-of v1, p1, Lcom/moloco/sdk/internal/ilrd/j;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Lcom/moloco/sdk/internal/ilrd/j;

    .line 12
    .line 13
    iget v2, v1, Lcom/moloco/sdk/internal/ilrd/j;->f:I

    .line 14
    .line 15
    const/high16 v3, -0x80000000

    .line 16
    .line 17
    and-int v4, v2, v3

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    sub-int/2addr v2, v3

    .line 22
    iput v2, v1, Lcom/moloco/sdk/internal/ilrd/j;->f:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v1, Lcom/moloco/sdk/internal/ilrd/j;

    .line 26
    .line 27
    invoke-direct {v1, p0, p1}, Lcom/moloco/sdk/internal/ilrd/j;-><init>(Lcom/moloco/sdk/internal/ilrd/m;Llf/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p1, v1, Lcom/moloco/sdk/internal/ilrd/j;->d:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 33
    .line 34
    iget v3, v1, Lcom/moloco/sdk/internal/ilrd/j;->f:I

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    if-eq v3, v6, :cond_2

    .line 42
    .line 43
    if-ne v3, v5, :cond_1

    .line 44
    .line 45
    iget-object p0, v1, Lcom/moloco/sdk/internal/ilrd/j;->c:[B

    .line 46
    .line 47
    iget-object v0, v1, Lcom/moloco/sdk/internal/ilrd/j;->b:LNf/a;

    .line 48
    .line 49
    move-object v2, v0

    .line 50
    check-cast v2, LNf/a;

    .line 51
    .line 52
    iget-object v0, v1, Lcom/moloco/sdk/internal/ilrd/j;->a:Lcom/moloco/sdk/internal/ilrd/m;

    .line 53
    .line 54
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_4

    .line 58
    .line 59
    :catchall_0
    move-exception v0

    .line 60
    move-object p0, v0

    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p0

    .line 71
    :cond_2
    iget-object p0, v1, Lcom/moloco/sdk/internal/ilrd/j;->b:LNf/a;

    .line 72
    .line 73
    check-cast p0, LNf/a;

    .line 74
    .line 75
    iget-object v3, v1, Lcom/moloco/sdk/internal/ilrd/j;->a:Lcom/moloco/sdk/internal/ilrd/m;

    .line 76
    .line 77
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-object p1, p0

    .line 81
    move-object p0, v3

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    new-instance p1, Lcom/moloco/sdk/internal/ilrd/h;

    .line 87
    .line 88
    invoke-direct {p1, p0, v4}, Lcom/moloco/sdk/internal/ilrd/h;-><init>(Lcom/moloco/sdk/internal/ilrd/m;Ljf/c;)V

    .line 89
    .line 90
    .line 91
    iget-object v3, p0, Lcom/moloco/sdk/internal/ilrd/m;->o:LC8/i;

    .line 92
    .line 93
    iget-wide v7, p0, Lcom/moloco/sdk/internal/ilrd/m;->f:J

    .line 94
    .line 95
    invoke-virtual {v3, v7, v8, p1}, LC8/i;->b(JLtf/l;)V

    .line 96
    .line 97
    .line 98
    iput-object p0, v1, Lcom/moloco/sdk/internal/ilrd/j;->a:Lcom/moloco/sdk/internal/ilrd/m;

    .line 99
    .line 100
    iget-object p1, p0, Lcom/moloco/sdk/internal/ilrd/m;->p:LNf/d;

    .line 101
    .line 102
    iput-object p1, v1, Lcom/moloco/sdk/internal/ilrd/j;->b:LNf/a;

    .line 103
    .line 104
    iput v6, v1, Lcom/moloco/sdk/internal/ilrd/j;->f:I

    .line 105
    .line 106
    invoke-virtual {p1, v1}, LNf/d;->b(Ljf/c;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    if-ne v3, v2, :cond_4

    .line 111
    .line 112
    goto/16 :goto_3

    .line 113
    .line 114
    :cond_4
    :goto_1
    :try_start_1
    iget-object v3, p0, Lcom/moloco/sdk/internal/ilrd/m;->r:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-eqz v3, :cond_5

    .line 121
    .line 122
    sget-object v6, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 123
    .line 124
    const-string v7, "IlrdEventsRepository"

    .line 125
    .line 126
    const-string v8, "Request for sendEvent came, but event list is empty. Returning"

    .line 127
    .line 128
    const/16 v11, 0xc

    .line 129
    .line 130
    const/4 v12, 0x0

    .line 131
    const/4 v9, 0x0

    .line 132
    const/4 v10, 0x0

    .line 133
    invoke-static/range {v6 .. v12}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    move-object v0, p0

    .line 137
    move-object v2, p1

    .line 138
    move-object p0, v4

    .line 139
    goto/16 :goto_4

    .line 140
    .line 141
    :catchall_1
    move-exception v0

    .line 142
    move-object p0, v0

    .line 143
    move-object v2, p1

    .line 144
    goto/16 :goto_5

    .line 145
    .line 146
    :cond_5
    invoke-static {}, Lcom/moloco/sdk/h0;->h()Lcom/moloco/sdk/g0;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v3}, Lcom/moloco/sdk/g0;->c()V

    .line 151
    .line 152
    .line 153
    iget-object v6, p0, Lcom/moloco/sdk/internal/ilrd/m;->j:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v3, v6}, Lcom/moloco/sdk/g0;->e(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    iget-object v6, p0, Lcom/moloco/sdk/internal/ilrd/m;->k:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v3, v6}, Lcom/moloco/sdk/g0;->d(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget-object v6, p0, Lcom/moloco/sdk/internal/ilrd/m;->i:Lcom/moloco/sdk/internal/services/q;

    .line 164
    .line 165
    check-cast v6, Lcom/moloco/sdk/internal/services/r;

    .line 166
    .line 167
    invoke-virtual {v6}, Lcom/moloco/sdk/internal/services/r;->a()LFe/c;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    instance-of v7, v6, Lcom/moloco/sdk/internal/services/o;

    .line 172
    .line 173
    if-eqz v7, :cond_6

    .line 174
    .line 175
    check-cast v6, Lcom/moloco/sdk/internal/services/o;

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_6
    move-object v6, v4

    .line 179
    :goto_2
    if-eqz v6, :cond_7

    .line 180
    .line 181
    iget-object v6, v6, Lcom/moloco/sdk/internal/services/o;->a:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {v3, v6}, Lcom/moloco/sdk/g0;->b(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 184
    .line 185
    .line 186
    :cond_7
    iget-object v6, p0, Lcom/moloco/sdk/internal/ilrd/m;->r:Ljava/util/ArrayList;

    .line 187
    .line 188
    :try_start_2
    invoke-virtual {v3, v6}, Lcom/moloco/sdk/g0;->a(Ljava/util/List;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    check-cast v3, Lcom/moloco/sdk/h0;

    .line 196
    .line 197
    sget-object v7, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 198
    .line 199
    const-string v8, "IlrdEventsRepository"

    .line 200
    .line 201
    new-instance v9, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3}, Lcom/moloco/sdk/h0;->g()Lcom/google/protobuf/Internal$ProtobufList;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v0, " events"

    .line 218
    .line 219
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v9

    .line 226
    const/16 v12, 0xc

    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const/4 v10, 0x0

    .line 230
    const/4 v11, 0x0

    .line 231
    invoke-static/range {v7 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    const-string v3, "toByteArray(...)"

    .line 239
    .line 240
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-static {v0}, Lae/b;->b([B)[B

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 248
    .line 249
    .line 250
    iget-object v3, p0, Lcom/moloco/sdk/internal/ilrd/m;->l:Lcom/moloco/sdk/internal/services/g;

    .line 251
    .line 252
    const-string v6, "ilrd_events_store"

    .line 253
    .line 254
    iput-object p0, v1, Lcom/moloco/sdk/internal/ilrd/j;->a:Lcom/moloco/sdk/internal/ilrd/m;

    .line 255
    .line 256
    move-object v7, p1

    .line 257
    check-cast v7, LNf/a;

    .line 258
    .line 259
    iput-object v7, v1, Lcom/moloco/sdk/internal/ilrd/j;->b:LNf/a;

    .line 260
    .line 261
    iput-object v0, v1, Lcom/moloco/sdk/internal/ilrd/j;->c:[B

    .line 262
    .line 263
    iput v5, v1, Lcom/moloco/sdk/internal/ilrd/j;->f:I

    .line 264
    .line 265
    invoke-virtual {v3, v6, v1}, Lcom/moloco/sdk/internal/services/g;->b(Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 269
    if-ne v1, v2, :cond_8

    .line 270
    .line 271
    :goto_3
    return-object v2

    .line 272
    :cond_8
    move-object v2, v0

    .line 273
    move-object v0, p0

    .line 274
    move-object p0, v2

    .line 275
    move-object v2, p1

    .line 276
    :goto_4
    invoke-interface {v2, v4}, LNf/a;->a(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    if-eqz p0, :cond_9

    .line 280
    .line 281
    iget-object p1, v0, Lcom/moloco/sdk/internal/ilrd/m;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

    .line 282
    .line 283
    sget-object v1, LJd/c;->b:LJd/f;

    .line 284
    .line 285
    iget-object v0, v0, Lcom/moloco/sdk/internal/ilrd/m;->b:Ljava/lang/String;

    .line 286
    .line 287
    const-string v2, "gzip"

    .line 288
    .line 289
    invoke-virtual {p1, v0, p0, v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;->a(Ljava/lang/String;[BLJd/f;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    :cond_9
    sget-object p0, Lef/C;->a:Lef/C;

    .line 293
    .line 294
    return-object p0

    .line 295
    :goto_5
    invoke-interface {v2, v4}, LNf/a;->a(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    throw p0
.end method


# virtual methods
.method public final c()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/ilrd/m;->q:Lcom/moloco/sdk/internal/ilrd/r;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/moloco/sdk/internal/ilrd/m;->g:J

    .line 4
    .line 5
    iget-object v3, p0, Lcom/moloco/sdk/internal/ilrd/m;->h:Lcom/moloco/sdk/internal/services/k;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-boolean v4, v0, Lcom/moloco/sdk/internal/ilrd/r;->f:Z

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v4, LCf/a;->b:LCf/h;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    iget-wide v5, v0, Lcom/moloco/sdk/internal/ilrd/r;->d:J

    .line 24
    .line 25
    sub-long/2addr v3, v5

    .line 26
    sget-object v0, LCf/c;->c:LCf/c;

    .line 27
    .line 28
    invoke-static {v3, v4, v0}, LFe/b;->T(JLCf/c;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    sget-object v5, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v6, "Session validation - age: "

    .line 37
    .line 38
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v3, v4}, LCf/a;->j(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v3, ", limit: "

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v2}, LCf/a;->j(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    const/4 v8, 0x0

    .line 65
    const/4 v9, 0x0

    .line 66
    const-string v6, "IlrdEventsRepository"

    .line 67
    .line 68
    const/16 v10, 0xc

    .line 69
    .line 70
    const/4 v11, 0x0

    .line 71
    invoke-static/range {v5 .. v11}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_1
    :goto_0
    new-instance v0, Lcom/moloco/sdk/internal/ilrd/r;

    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    invoke-direct {v0, v3, v4}, Lcom/moloco/sdk/internal/ilrd/r;-><init>(Lcom/moloco/sdk/internal/services/k;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Lcom/moloco/sdk/internal/ilrd/m;->q:Lcom/moloco/sdk/internal/ilrd/r;

    .line 82
    .line 83
    new-instance v3, Lcom/moloco/sdk/internal/ilrd/g;

    .line 84
    .line 85
    invoke-direct {v3, p0, v4}, Lcom/moloco/sdk/internal/ilrd/g;-><init>(Lcom/moloco/sdk/internal/ilrd/m;Ljf/c;)V

    .line 86
    .line 87
    .line 88
    iget-object v5, p0, Lcom/moloco/sdk/internal/ilrd/m;->n:LC8/i;

    .line 89
    .line 90
    invoke-virtual {v5, v1, v2, v3}, LC8/i;->b(JLtf/l;)V

    .line 91
    .line 92
    .line 93
    new-instance v3, Lcom/moloco/sdk/internal/ilrd/h;

    .line 94
    .line 95
    invoke-direct {v3, p0, v4}, Lcom/moloco/sdk/internal/ilrd/h;-><init>(Lcom/moloco/sdk/internal/ilrd/m;Ljf/c;)V

    .line 96
    .line 97
    .line 98
    iget-object v4, p0, Lcom/moloco/sdk/internal/ilrd/m;->o:LC8/i;

    .line 99
    .line 100
    iget-wide v5, p0, Lcom/moloco/sdk/internal/ilrd/m;->f:J

    .line 101
    .line 102
    invoke-virtual {v4, v5, v6, v3}, LC8/i;->b(JLtf/l;)V

    .line 103
    .line 104
    .line 105
    sget-object v7, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 106
    .line 107
    new-instance v3, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const-string v4, "New session started: sessionId="

    .line 110
    .line 111
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/ilrd/r;->c()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v0, ", maxBatch="

    .line 122
    .line 123
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    iget v0, p0, Lcom/moloco/sdk/internal/ilrd/m;->e:I

    .line 127
    .line 128
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v0, ", uploadInterval="

    .line 132
    .line 133
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-static {v5, v6}, LCf/a;->j(J)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v0, ", sessionExp="

    .line 144
    .line 145
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    iget-wide v4, p0, Lcom/moloco/sdk/internal/ilrd/m;->d:J

    .line 149
    .line 150
    invoke-static {v4, v5}, LCf/a;->j(J)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v0, ", maxLength="

    .line 158
    .line 159
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-static {v1, v2}, LCf/a;->j(J)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    const/16 v12, 0xc

    .line 174
    .line 175
    const/4 v13, 0x0

    .line 176
    const-string v8, "IlrdEventsRepository"

    .line 177
    .line 178
    const/4 v10, 0x0

    .line 179
    const/4 v11, 0x0

    .line 180
    invoke-static/range {v7 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    return-void
.end method

.method public final synthetic onCreate(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    invoke-static {p1}, LVa/M6;->c(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public final onDestroy(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onPause(Landroidx/lifecycle/v;)V
    .locals 7

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 2
    .line 3
    const/4 v3, 0x0

    .line 4
    const/4 v4, 0x0

    .line 5
    const-string v1, "IlrdEventsRepository"

    .line 6
    .line 7
    const-string v2, "onPause called, sending events"

    .line 8
    .line 9
    const/16 v5, 0xc

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Lcom/moloco/sdk/internal/ilrd/i;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, v0}, Lcom/moloco/sdk/internal/ilrd/i;-><init>(Lcom/moloco/sdk/internal/ilrd/m;Ljf/c;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/moloco/sdk/internal/ilrd/m;->a:LKd/a;

    .line 22
    .line 23
    const/4 v2, 0x3

    .line 24
    invoke-static {v1, v0, p1, v2}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final synthetic onResume(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    invoke-static {p1}, LVa/M6;->d(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public final synthetic onStart(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    invoke-static {p1}, LVa/M6;->e(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public final synthetic onStop(Landroidx/lifecycle/v;)V
    .locals 0

    .line 1
    return-void
.end method
