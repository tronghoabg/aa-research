.class public final LA7/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:LA7/N1;

.field public final synthetic e:Z

.field public final synthetic f:LA7/m1;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LA7/m1;Ljava/lang/String;Ljava/lang/String;LA7/N1;ZLcom/google/android/gms/internal/measurement/zzdo;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA7/o1;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LA7/o1;->b:Ljava/lang/String;

    iput-object p3, p0, LA7/o1;->c:Ljava/lang/String;

    iput-object p4, p0, LA7/o1;->d:LA7/N1;

    iput-boolean p5, p0, LA7/o1;->e:Z

    iput-object p6, p0, LA7/o1;->g:Ljava/lang/Object;

    iput-object p1, p0, LA7/o1;->f:LA7/m1;

    return-void
.end method

.method public constructor <init>(LA7/m1;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;LA7/N1;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA7/o1;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LA7/o1;->g:Ljava/lang/Object;

    iput-object p3, p0, LA7/o1;->b:Ljava/lang/String;

    iput-object p4, p0, LA7/o1;->c:Ljava/lang/String;

    iput-object p5, p0, LA7/o1;->d:LA7/N1;

    iput-boolean p6, p0, LA7/o1;->e:Z

    iput-object p1, p0, LA7/o1;->f:LA7/m1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, LA7/o1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/o1;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :try_start_0
    iget-object v2, p0, LA7/o1;->f:LA7/m1;

    .line 13
    .line 14
    iget-object v3, v2, LA7/m1;->d:LA7/F;

    .line 15
    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 23
    .line 24
    const-string v3, "(legacy) Failed to get user properties; not connected to service"

    .line 25
    .line 26
    iget-object v4, p0, LA7/o1;->b:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v5, p0, LA7/o1;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v2, v1, v4, v5, v3}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, LA7/o1;->g:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 36
    .line 37
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 40
    .line 41
    .line 42
    :try_start_1
    iget-object v1, p0, LA7/o1;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 47
    .line 48
    .line 49
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    goto :goto_3

    .line 51
    :catchall_0
    move-exception v1

    .line 52
    goto :goto_5

    .line 53
    :catchall_1
    move-exception v1

    .line 54
    goto :goto_4

    .line 55
    :catch_0
    move-exception v2

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    :try_start_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    iget-object v2, p0, LA7/o1;->d:LA7/N1;

    .line 64
    .line 65
    iget-object v4, p0, LA7/o1;->g:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 68
    .line 69
    iget-object v5, p0, LA7/o1;->b:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v6, p0, LA7/o1;->c:Ljava/lang/String;

    .line 72
    .line 73
    iget-boolean v7, p0, LA7/o1;->e:Z

    .line 74
    .line 75
    invoke-interface {v3, v5, v6, v7, v2}, LA7/F;->j(Ljava/lang/String;Ljava/lang/String;ZLA7/N1;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    iget-object v2, p0, LA7/o1;->g:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 86
    .line 87
    iget-object v4, p0, LA7/o1;->b:Ljava/lang/String;

    .line 88
    .line 89
    iget-object v5, p0, LA7/o1;->c:Ljava/lang/String;

    .line 90
    .line 91
    iget-boolean v6, p0, LA7/o1;->e:Z

    .line 92
    .line 93
    invoke-interface {v3, v1, v4, v5, v6}, LA7/F;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :goto_0
    iget-object v2, p0, LA7/o1;->f:LA7/m1;

    .line 101
    .line 102
    invoke-virtual {v2}, LA7/m1;->v0()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 103
    .line 104
    .line 105
    :try_start_3
    iget-object v1, p0, LA7/o1;->g:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :goto_1
    :try_start_4
    iget-object v3, p0, LA7/o1;->f:LA7/m1;

    .line 114
    .line 115
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    iget-object v3, v3, LA7/N;->f:LA7/P;

    .line 120
    .line 121
    const-string v4, "(legacy) Failed to get user properties; remote exception"

    .line 122
    .line 123
    iget-object v5, p0, LA7/o1;->b:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v3, v1, v5, v2, v4}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, LA7/o1;->g:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 131
    .line 132
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 133
    .line 134
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 135
    .line 136
    .line 137
    :try_start_5
    iget-object v1, p0, LA7/o1;->g:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 142
    .line 143
    .line 144
    :goto_2
    monitor-exit v0

    .line 145
    :goto_3
    return-void

    .line 146
    :goto_4
    iget-object v2, p0, LA7/o1;->g:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 151
    .line 152
    .line 153
    throw v1

    .line 154
    :goto_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 155
    throw v1

    .line 156
    :pswitch_0
    iget-object v0, p0, LA7/o1;->d:LA7/N1;

    .line 157
    .line 158
    iget-object v1, p0, LA7/o1;->b:Ljava/lang/String;

    .line 159
    .line 160
    iget-object v2, p0, LA7/o1;->g:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzdo;

    .line 163
    .line 164
    iget-object v3, p0, LA7/o1;->f:LA7/m1;

    .line 165
    .line 166
    new-instance v4, Landroid/os/Bundle;

    .line 167
    .line 168
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 169
    .line 170
    .line 171
    :try_start_6
    iget-object v5, v3, LA7/m1;->d:LA7/F;
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 172
    .line 173
    iget-object v6, p0, LA7/o1;->c:Ljava/lang/String;

    .line 174
    .line 175
    if-nez v5, :cond_2

    .line 176
    .line 177
    :try_start_7
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 182
    .line 183
    const-string v5, "Failed to get user properties; not connected to service"

    .line 184
    .line 185
    invoke-virtual {v0, v1, v5, v6}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3}, LA7/B0;->b0()LA7/U1;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0, v2, v4}, LA7/U1;->A0(Lcom/google/android/gms/internal/measurement/zzdo;Landroid/os/Bundle;)V

    .line 193
    .line 194
    .line 195
    goto :goto_7

    .line 196
    :catchall_2
    move-exception v0

    .line 197
    goto :goto_8

    .line 198
    :catch_1
    move-exception v0

    .line 199
    goto :goto_6

    .line 200
    :cond_2
    :try_start_8
    iget-boolean v7, p0, LA7/o1;->e:Z

    .line 201
    .line 202
    invoke-interface {v5, v1, v6, v7, v0}, LA7/F;->j(Ljava/lang/String;Ljava/lang/String;ZLA7/N1;)Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-static {v0}, LA7/U1;->p0(Ljava/util/List;)Landroid/os/Bundle;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-virtual {v3}, LA7/m1;->v0()V
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 211
    .line 212
    .line 213
    invoke-virtual {v3}, LA7/B0;->b0()LA7/U1;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {v0, v2, v4}, LA7/U1;->A0(Lcom/google/android/gms/internal/measurement/zzdo;Landroid/os/Bundle;)V

    .line 218
    .line 219
    .line 220
    goto :goto_7

    .line 221
    :goto_6
    :try_start_9
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    iget-object v5, v5, LA7/N;->f:LA7/P;

    .line 226
    .line 227
    const-string v6, "Failed to get user properties; remote exception"

    .line 228
    .line 229
    invoke-virtual {v5, v1, v6, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3}, LA7/B0;->b0()LA7/U1;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v0, v2, v4}, LA7/U1;->A0(Lcom/google/android/gms/internal/measurement/zzdo;Landroid/os/Bundle;)V

    .line 237
    .line 238
    .line 239
    :goto_7
    return-void

    .line 240
    :goto_8
    invoke-virtual {v3}, LA7/B0;->b0()LA7/U1;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-virtual {v1, v2, v4}, LA7/U1;->A0(Lcom/google/android/gms/internal/measurement/zzdo;Landroid/os/Bundle;)V

    .line 245
    .line 246
    .line 247
    throw v0

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
