.class public final synthetic LA7/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;
.implements LLe/c;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LA7/h0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LA7/s0;LA7/x;Ljava/lang/String;)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, LA7/h0;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/h0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, LA7/h0;->a:I

    iput-object p1, p0, LA7/h0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, LA7/h0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iget v1, p0, LA7/h0;->a:I

    .line 3
    .line 4
    packed-switch v1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LA7/h0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lz4/c;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    iget-object v2, p0, LA7/h0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lz4/c;

    .line 15
    .line 16
    iget-object v3, v2, Lz4/c;->i:Ljava/io/BufferedWriter;

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    monitor-exit v1

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {v2}, Lz4/c;->Q()V

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, LA7/h0;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Lz4/c;

    .line 30
    .line 31
    invoke-virtual {v2}, Lz4/c;->w()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    iget-object v2, p0, LA7/h0;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Lz4/c;

    .line 40
    .line 41
    invoke-virtual {v2}, Lz4/c;->J()V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, LA7/h0;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lz4/c;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    iput v3, v2, Lz4/c;->k:I

    .line 50
    .line 51
    :cond_1
    monitor-exit v1

    .line 52
    :goto_0
    return-object v0

    .line 53
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    throw v0

    .line 55
    :pswitch_0
    iget-object v0, p0, LA7/h0;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lcom/moloco/sdk/acm/db/e;

    .line 58
    .line 59
    iget-object v1, v0, Lcom/moloco/sdk/acm/db/e;->d:LS3/h;

    .line 60
    .line 61
    invoke-virtual {v1}, LE9/c;->a()Lo3/g;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget-object v0, v0, Lcom/moloco/sdk/acm/db/e;->a:Lcom/moloco/sdk/acm/db/MetricsDb_Impl;

    .line 66
    .line 67
    invoke-virtual {v0}, Lk3/m;->c()V

    .line 68
    .line 69
    .line 70
    :try_start_1
    invoke-interface {v2}, Lo3/g;->g()I

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lk3/m;->n()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lk3/m;->j()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v2}, LE9/c;->q(Lo3/g;)V

    .line 80
    .line 81
    .line 82
    sget-object v0, Lef/C;->a:Lef/C;

    .line 83
    .line 84
    return-object v0

    .line 85
    :catchall_1
    move-exception v3

    .line 86
    invoke-virtual {v0}, Lk3/m;->j()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v2}, LE9/c;->q(Lo3/g;)V

    .line 90
    .line 91
    .line 92
    throw v3

    .line 93
    :pswitch_1
    iget-object v0, p0, LA7/h0;->b:Ljava/lang/Object;

    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_2
    iget-object v0, p0, LA7/h0;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, LN6/a;

    .line 99
    .line 100
    invoke-virtual {v0}, LN6/a;->getViewSignals()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    return-object v0

    .line 105
    :pswitch_3
    iget-object v1, p0, LA7/h0;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, LK1/a;

    .line 108
    .line 109
    iget-object v2, v1, LK1/a;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 110
    .line 111
    const/4 v3, 0x1

    .line 112
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 113
    .line 114
    .line 115
    const/16 v2, 0xa

    .line 116
    .line 117
    :try_start_2
    invoke-static {v2}, Landroid/os/Process;->setThreadPriority(I)V

    .line 118
    .line 119
    .line 120
    iget-object v2, v1, LK1/a;->e:Lb7/d;

    .line 121
    .line 122
    invoke-virtual {v2}, Lb7/d;->d()V

    .line 123
    .line 124
    .line 125
    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v0}, LK1/a;->a(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return-object v0

    .line 132
    :catchall_2
    move-exception v2

    .line 133
    :try_start_3
    iget-object v4, v1, LK1/a;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 134
    .line 135
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 136
    .line 137
    .line 138
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 139
    :catchall_3
    move-exception v2

    .line 140
    invoke-virtual {v1, v0}, LK1/a;->a(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    throw v2

    .line 144
    :pswitch_4
    sget-object v0, LG6/U;->l:LG6/M;

    .line 145
    .line 146
    sget-object v0, LC6/n;->D:LC6/n;

    .line 147
    .line 148
    iget-object v0, v0, LC6/n;->c:LG6/U;

    .line 149
    .line 150
    iget-object v0, p0, LA7/h0;->b:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, Landroid/net/Uri;

    .line 153
    .line 154
    invoke-static {v0}, LG6/U;->o(Landroid/net/Uri;)Ljava/util/HashMap;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    return-object v0

    .line 159
    :pswitch_5
    iget-object v0, p0, LA7/h0;->b:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v0, LA7/s0;

    .line 162
    .line 163
    iget-object v1, v0, LA7/s0;->a:LA7/L1;

    .line 164
    .line 165
    invoke-virtual {v1}, LA7/L1;->Z()V

    .line 166
    .line 167
    .line 168
    iget-object v0, v0, LA7/s0;->a:LA7/L1;

    .line 169
    .line 170
    iget-object v0, v0, LA7/L1;->h:LA7/h1;

    .line 171
    .line 172
    invoke-static {v0}, LA7/L1;->m(LA7/G1;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, LA7/B0;->c0()V

    .line 176
    .line 177
    .line 178
    iget-object v0, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, LA7/n0;

    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 186
    .line 187
    const-string v1, "Unexpected call on client side"

    .line 188
    .line 189
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw v0

    .line 193
    :pswitch_6
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzr;

    .line 194
    .line 195
    iget-object v1, p0, LA7/h0;->b:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v1, LA7/f0;

    .line 198
    .line 199
    iget-object v1, v1, LA7/f0;->k:LY9/c;

    .line 200
    .line 201
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzr;-><init>(Lcom/google/android/gms/internal/measurement/zzv;)V

    .line 202
    .line 203
    .line 204
    return-object v0

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
