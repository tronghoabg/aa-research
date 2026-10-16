.class public final LO8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LX8/c;


# direct methods
.method public constructor <init>(LX8/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LO8/b;->a:LX8/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lda/d;)V
    .locals 10

    .line 1
    iget-object v0, p0, LO8/b;->a:LX8/c;

    .line 2
    .line 3
    iget-object p1, p1, Lda/d;->a:Ljava/util/HashSet;

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    const/16 v2, 0xa

    .line 8
    .line 9
    invoke-static {p1, v2}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lda/e;

    .line 31
    .line 32
    check-cast v2, Lda/c;

    .line 33
    .line 34
    iget-object v4, v2, Lda/c;->b:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v5, v2, Lda/c;->d:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v3, v2, Lda/c;->e:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v7, v2, Lda/c;->c:Ljava/lang/String;

    .line 41
    .line 42
    iget-wide v8, v2, Lda/c;->f:J

    .line 43
    .line 44
    sget-object v2, LT8/m;->a:Lad/L;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const/16 v6, 0x100

    .line 51
    .line 52
    if-le v2, v6, :cond_0

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-virtual {v3, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    :cond_0
    move-object v6, v3

    .line 60
    new-instance v3, LT8/b;

    .line 61
    .line 62
    invoke-direct/range {v3 .. v9}, LT8/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iget-object p1, v0, LX8/c;->f:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, LI9/a;

    .line 72
    .line 73
    monitor-enter p1

    .line 74
    :try_start_0
    iget-object v2, v0, LX8/c;->f:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, LI9/a;

    .line 77
    .line 78
    invoke-virtual {v2, v1}, LI9/a;->c(Ljava/util/List;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_2

    .line 83
    .line 84
    monitor-exit p1

    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    iget-object v1, v0, LX8/c;->f:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, LI9/a;

    .line 91
    .line 92
    invoke-virtual {v1}, LI9/a;->b()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iget-object v2, v0, LX8/c;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v2, LS8/f;

    .line 99
    .line 100
    iget-object v2, v2, LS8/f;->b:LS8/c;

    .line 101
    .line 102
    new-instance v3, LT3/r;

    .line 103
    .line 104
    const/4 v4, 0x1

    .line 105
    invoke-direct {v3, v4, v0, v1}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v3}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 109
    .line 110
    .line 111
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    :goto_1
    const-string p1, "Updated Crashlytics Rollout State"

    .line 113
    .line 114
    const-string v0, "FirebaseCrashlytics"

    .line 115
    .line 116
    const/4 v1, 0x3

    .line 117
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    const-string v0, "FirebaseCrashlytics"

    .line 124
    .line 125
    const/4 v1, 0x0

    .line 126
    invoke-static {v0, p1, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 127
    .line 128
    .line 129
    :cond_3
    return-void

    .line 130
    :goto_2
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    throw v0
.end method
