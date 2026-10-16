.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LK3/q;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 16

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static/range {p1 .. p1}, LK3/q;->c(Landroid/content/Context;)LK3/q;

    .line 5
    .line 6
    .line 7
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    :goto_0
    move-object/from16 v1, p0

    .line 9
    .line 10
    goto :goto_4

    .line 11
    :catch_0
    move-exception v0

    .line 12
    move-object v4, v0

    .line 13
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 14
    .line 15
    const-string v3, "WorkManager not initialized already, performing initialization"

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    const-string v2, "MolocoWorkManager"

    .line 19
    .line 20
    const/16 v6, 0x8

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    invoke-static/range {v1 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Lx9/d;

    .line 27
    .line 28
    const/16 v2, 0x13

    .line 29
    .line 30
    invoke-direct {v0, v2}, Lx9/d;-><init>(I)V

    .line 31
    .line 32
    .line 33
    new-instance v2, LJ3/b;

    .line 34
    .line 35
    invoke-direct {v2, v0}, LJ3/b;-><init>(Lx9/d;)V

    .line 36
    .line 37
    .line 38
    :try_start_1
    const-string v6, "MolocoWorkManager"

    .line 39
    .line 40
    const-string v7, "Trying to initialize work manager as one is not already available"

    .line 41
    .line 42
    const/16 v10, 0xc

    .line 43
    .line 44
    const/4 v11, 0x0

    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v9, 0x0

    .line 47
    move-object v5, v1

    .line 48
    invoke-static/range {v5 .. v11}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2

    .line 49
    .line 50
    .line 51
    move-object/from16 v1, p1

    .line 52
    .line 53
    :try_start_2
    invoke-static {v1, v2}, LK3/q;->d(Landroid/content/Context;LJ3/b;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :catch_1
    move-exception v0

    .line 58
    :goto_1
    move-object v5, v0

    .line 59
    goto :goto_2

    .line 60
    :catch_2
    move-exception v0

    .line 61
    move-object/from16 v1, p1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :goto_2
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 65
    .line 66
    const/16 v7, 0x8

    .line 67
    .line 68
    const/4 v8, 0x0

    .line 69
    const-string v3, "MolocoWorkManager"

    .line 70
    .line 71
    const-string v4, "WorkManager initialized already at this point, retrieving instance"

    .line 72
    .line 73
    const/4 v6, 0x0

    .line 74
    invoke-static/range {v2 .. v8}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :goto_3
    sget-object v9, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 78
    .line 79
    const/16 v14, 0xc

    .line 80
    .line 81
    const/4 v15, 0x0

    .line 82
    const-string v10, "MolocoWorkManager"

    .line 83
    .line 84
    const-string v11, "Trying to retrieve work manager instance"

    .line 85
    .line 86
    const/4 v12, 0x0

    .line 87
    const/4 v13, 0x0

    .line 88
    invoke-static/range {v9 .. v15}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :try_start_3
    invoke-static {v1}, LK3/q;->c(Landroid/content/Context;)LK3/q;

    .line 92
    .line 93
    .line 94
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3

    .line 95
    goto :goto_0

    .line 96
    :goto_4
    iput-object v0, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/o;->a:LK3/q;

    .line 97
    .line 98
    return-void

    .line 99
    :catch_3
    move-exception v0

    .line 100
    move-object/from16 v1, p0

    .line 101
    .line 102
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 103
    .line 104
    const/16 v7, 0xc

    .line 105
    .line 106
    const/4 v8, 0x0

    .line 107
    const-string v3, "MolocoWorkManager"

    .line 108
    .line 109
    const-string v4, "WorkManager instance couldn\'t be re-initialized, cannot provide WorkManager"

    .line 110
    .line 111
    const/4 v5, 0x0

    .line 112
    const/4 v6, 0x0

    .line 113
    invoke-static/range {v2 .. v8}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    const-string v3, "Cannot provide MolocoWorkManager. Failed to re-initialize WorkManager"

    .line 119
    .line 120
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    throw v2
.end method
