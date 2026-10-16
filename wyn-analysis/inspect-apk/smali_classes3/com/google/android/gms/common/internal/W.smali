.class public final Lcom/google/android/gms/common/internal/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/common/internal/X;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/common/internal/X;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/gms/common/internal/W;->a:Lcom/google/android/gms/common/internal/X;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 8

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const-string v1, "Timeout waiting for ServiceConnection callback "

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    if-eq v0, v3, :cond_0

    .line 10
    .line 11
    return v2

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/internal/W;->a:Lcom/google/android/gms/common/internal/X;

    .line 13
    .line 14
    iget-object v4, v0, Lcom/google/android/gms/common/internal/X;->d:Ljava/util/HashMap;

    .line 15
    .line 16
    monitor-enter v4

    .line 17
    :try_start_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Lcom/google/android/gms/common/internal/U;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/google/android/gms/common/internal/X;->d:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/google/android/gms/common/internal/V;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    iget v2, v0, Lcom/google/android/gms/common/internal/V;->b:I

    .line 32
    .line 33
    const/4 v5, 0x3

    .line 34
    if-ne v2, v5, :cond_3

    .line 35
    .line 36
    const-string v2, "GmsClientSupervisor"

    .line 37
    .line 38
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    add-int/lit8 v6, v6, 0x2f

    .line 47
    .line 48
    new-instance v7, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    new-instance v5, Ljava/lang/Exception;

    .line 64
    .line 65
    invoke-direct {v5}, Ljava/lang/Exception;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v1, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    .line 70
    .line 71
    iget-object v1, v0, Lcom/google/android/gms/common/internal/V;->f:Landroid/content/ComponentName;

    .line 72
    .line 73
    if-nez v1, :cond_1

    .line 74
    .line 75
    iget-object v1, p1, Lcom/google/android/gms/common/internal/U;->c:Landroid/content/ComponentName;

    .line 76
    .line 77
    :cond_1
    if-nez v1, :cond_2

    .line 78
    .line 79
    new-instance v1, Landroid/content/ComponentName;

    .line 80
    .line 81
    iget-object p1, p1, Lcom/google/android/gms/common/internal/U;->b:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    const-string v2, "unknown"

    .line 87
    .line 88
    invoke-direct {v1, p1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :catchall_0
    move-exception p1

    .line 93
    goto :goto_1

    .line 94
    :cond_2
    :goto_0
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/V;->onServiceDisconnected(Landroid/content/ComponentName;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    monitor-exit v4

    .line 98
    return v3

    .line 99
    :goto_1
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    throw p1

    .line 101
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/common/internal/W;->a:Lcom/google/android/gms/common/internal/X;

    .line 102
    .line 103
    iget-object v1, v0, Lcom/google/android/gms/common/internal/X;->d:Ljava/util/HashMap;

    .line 104
    .line 105
    monitor-enter v1

    .line 106
    :try_start_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p1, Lcom/google/android/gms/common/internal/U;

    .line 109
    .line 110
    iget-object v4, v0, Lcom/google/android/gms/common/internal/X;->d:Ljava/util/HashMap;

    .line 111
    .line 112
    invoke-virtual {v4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    check-cast v4, Lcom/google/android/gms/common/internal/V;

    .line 117
    .line 118
    if-eqz v4, :cond_6

    .line 119
    .line 120
    iget-object v5, v4, Lcom/google/android/gms/common/internal/V;->a:Ljava/util/HashMap;

    .line 121
    .line 122
    invoke-virtual {v5}, Ljava/util/HashMap;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-eqz v5, :cond_6

    .line 127
    .line 128
    iget-boolean v5, v4, Lcom/google/android/gms/common/internal/V;->c:Z

    .line 129
    .line 130
    if-eqz v5, :cond_5

    .line 131
    .line 132
    iget-object v5, v4, Lcom/google/android/gms/common/internal/V;->e:Lcom/google/android/gms/common/internal/U;

    .line 133
    .line 134
    iget-object v6, v4, Lcom/google/android/gms/common/internal/V;->g:Lcom/google/android/gms/common/internal/X;

    .line 135
    .line 136
    iget-object v7, v6, Lcom/google/android/gms/common/internal/X;->f:Lcom/google/android/gms/internal/common/zzg;

    .line 137
    .line 138
    invoke-virtual {v7, v3, v5}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    iget-object v5, v6, Lcom/google/android/gms/common/internal/X;->g:Lm7/a;

    .line 142
    .line 143
    iget-object v6, v6, Lcom/google/android/gms/common/internal/X;->e:Landroid/content/Context;

    .line 144
    .line 145
    invoke-virtual {v5, v6, v4}, Lm7/a;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 146
    .line 147
    .line 148
    iput-boolean v2, v4, Lcom/google/android/gms/common/internal/V;->c:Z

    .line 149
    .line 150
    const/4 v2, 0x2

    .line 151
    iput v2, v4, Lcom/google/android/gms/common/internal/V;->b:I

    .line 152
    .line 153
    :cond_5
    iget-object v0, v0, Lcom/google/android/gms/common/internal/X;->d:Ljava/util/HashMap;

    .line 154
    .line 155
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :catchall_1
    move-exception p1

    .line 160
    goto :goto_3

    .line 161
    :cond_6
    :goto_2
    monitor-exit v1

    .line 162
    return v3

    .line 163
    :goto_3
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 164
    throw p1
.end method
