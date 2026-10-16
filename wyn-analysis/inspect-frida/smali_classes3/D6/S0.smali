.class public final LD6/S0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/zzbvf;

.field public final b:LD6/w1;

.field public final c:Lcom/google/android/gms/ads/VideoController;

.field public final d:LD6/R0;

.field public e:LD6/a;

.field public f:Lcom/google/android/gms/ads/AdListener;

.field public g:[Lcom/google/android/gms/ads/AdSize;

.field public h:Ly6/f;

.field public i:LD6/L;

.field public j:Lx6/w;

.field public k:Ljava/lang/String;

.field public final l:Lx6/j;

.field public m:Z

.field public n:Lx6/q;

.field public final o:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Lx6/j;)V
    .locals 2

    .line 1
    sget-object v0, LD6/w1;->a:LD6/w1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/google/android/gms/internal/ads/zzbvf;

    .line 7
    .line 8
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzbvf;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, LD6/S0;->a:Lcom/google/android/gms/internal/ads/zzbvf;

    .line 12
    .line 13
    new-instance v1, Lcom/google/android/gms/ads/VideoController;

    .line 14
    .line 15
    invoke-direct {v1}, Lcom/google/android/gms/ads/VideoController;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, LD6/S0;->c:Lcom/google/android/gms/ads/VideoController;

    .line 19
    .line 20
    new-instance v1, LD6/R0;

    .line 21
    .line 22
    invoke-direct {v1, p0}, LD6/R0;-><init>(LD6/S0;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, LD6/S0;->d:LD6/R0;

    .line 26
    .line 27
    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, LD6/S0;->o:Ljava/util/concurrent/atomic/AtomicLong;

    .line 33
    .line 34
    iput-object p1, p0, LD6/S0;->l:Lx6/j;

    .line 35
    .line 36
    iput-object v0, p0, LD6/S0;->b:LD6/w1;

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    iput-object p1, p0, LD6/S0;->i:LD6/L;

    .line 40
    .line 41
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public static a(Landroid/content/Context;[Lcom/google/android/gms/ads/AdSize;)LD6/x1;
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_1

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    sget-object v5, Lcom/google/android/gms/ads/AdSize;->n:Lcom/google/android/gms/ads/AdSize;

    .line 11
    .line 12
    invoke-virtual {v4, v5}, Lcom/google/android/gms/ads/AdSize;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    new-instance v5, LD6/x1;

    .line 19
    .line 20
    const/16 v18, 0x0

    .line 21
    .line 22
    const/16 v19, 0x0

    .line 23
    .line 24
    const-string v6, "invalid"

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v11, 0x0

    .line 31
    const/4 v12, 0x0

    .line 32
    const/4 v13, 0x0

    .line 33
    const/4 v14, 0x0

    .line 34
    const/4 v15, 0x0

    .line 35
    const/16 v16, 0x1

    .line 36
    .line 37
    const/16 v17, 0x0

    .line 38
    .line 39
    const/16 v20, 0x0

    .line 40
    .line 41
    const/16 v21, 0x0

    .line 42
    .line 43
    invoke-direct/range {v5 .. v21}, LD6/x1;-><init>(Ljava/lang/String;IIZII[LD6/x1;ZZZZZZZZZ)V

    .line 44
    .line 45
    .line 46
    return-object v5

    .line 47
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    new-instance v1, LD6/x1;

    .line 51
    .line 52
    move-object/from16 v3, p0

    .line 53
    .line 54
    invoke-direct {v1, v3, v0}, LD6/x1;-><init>(Landroid/content/Context;[Lcom/google/android/gms/ads/AdSize;)V

    .line 55
    .line 56
    .line 57
    iput-boolean v2, v1, LD6/x1;->j:Z

    .line 58
    .line 59
    return-object v1
.end method


# virtual methods
.method public final b(LD6/Q0;)V
    .locals 11

    .line 1
    const-string v1, "#007 Could not call remote method."

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    iget-object v0, p0, LD6/S0;->i:LD6/L;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    iget-object v4, p0, LD6/S0;->l:Lx6/j;

    .line 10
    .line 11
    if-nez v0, :cond_8

    .line 12
    .line 13
    :try_start_1
    iget-object v5, p0, LD6/S0;->g:[Lcom/google/android/gms/ads/AdSize;

    .line 14
    .line 15
    if-eqz v5, :cond_0

    .line 16
    .line 17
    iget-object v5, p0, LD6/S0;->k:Ljava/lang/String;

    .line 18
    .line 19
    if-nez v5, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    move-object p1, v0

    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_0
    :goto_0
    if-eqz v0, :cond_7

    .line 27
    .line 28
    :cond_1
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    iget-object v0, p0, LD6/S0;->g:[Lcom/google/android/gms/ads/AdSize;

    .line 33
    .line 34
    invoke-static {v7, v0}, LD6/S0;->a(Landroid/content/Context;[Lcom/google/android/gms/ads/AdSize;)LD6/x1;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    sget-object v0, LD6/q;->g:LD6/q;

    .line 39
    .line 40
    iget-object v6, v0, LD6/q;->b:LD6/o;

    .line 41
    .line 42
    iget-object v9, p0, LD6/S0;->k:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v10, p0, LD6/S0;->a:Lcom/google/android/gms/internal/ads/zzbvf;

    .line 45
    .line 46
    new-instance v5, LD6/h;

    .line 47
    .line 48
    invoke-direct/range {v5 .. v10}, LD6/h;-><init>(LD6/o;Landroid/content/Context;LD6/x1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbvj;)V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-virtual {v5, v7, v0}, LD6/p;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, LD6/L;

    .line 57
    .line 58
    iput-object v0, p0, LD6/S0;->i:LD6/L;

    .line 59
    .line 60
    new-instance v5, LD6/s1;

    .line 61
    .line 62
    iget-object v6, p0, LD6/S0;->d:LD6/R0;

    .line 63
    .line 64
    invoke-direct {v5, v6}, LD6/s1;-><init>(Lcom/google/android/gms/ads/AdListener;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v5}, LD6/L;->zzdS(LD6/y;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, LD6/S0;->e:LD6/a;

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    iget-object v5, p0, LD6/S0;->i:LD6/L;

    .line 75
    .line 76
    new-instance v6, LD6/r;

    .line 77
    .line 78
    invoke-direct {v6, v0}, LD6/r;-><init>(LD6/a;)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v5, v6}, LD6/L;->zzy(LD6/v;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    iget-object v0, p0, LD6/S0;->h:Ly6/f;

    .line 85
    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    iget-object v5, p0, LD6/S0;->i:LD6/L;

    .line 89
    .line 90
    new-instance v6, Lcom/google/android/gms/internal/ads/zzbfm;

    .line 91
    .line 92
    invoke-direct {v6, v0}, Lcom/google/android/gms/internal/ads/zzbfm;-><init>(Ly6/f;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v5, v6}, LD6/L;->zzi(LD6/b0;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    iget-object v0, p0, LD6/S0;->j:Lx6/w;

    .line 99
    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    iget-object v5, p0, LD6/S0;->i:LD6/L;

    .line 103
    .line 104
    new-instance v6, LD6/r1;

    .line 105
    .line 106
    invoke-direct {v6, v0}, LD6/r1;-><init>(Lx6/w;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v5, v6}, LD6/L;->zzG(LD6/r1;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    iget-object v0, p0, LD6/S0;->i:LD6/L;

    .line 113
    .line 114
    new-instance v5, LD6/n1;

    .line 115
    .line 116
    iget-object v6, p0, LD6/S0;->n:Lx6/q;

    .line 117
    .line 118
    invoke-direct {v5, v6}, LD6/n1;-><init>(Lx6/q;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v0, v5}, LD6/L;->zzP(LD6/A0;)V

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, LD6/S0;->i:LD6/L;

    .line 125
    .line 126
    iget-boolean v5, p0, LD6/S0;->m:Z

    .line 127
    .line 128
    invoke-interface {v0, v5}, LD6/L;->zzz(Z)V

    .line 129
    .line 130
    .line 131
    iget-object v0, p0, LD6/S0;->i:LD6/L;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 132
    .line 133
    if-nez v0, :cond_5

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    :try_start_2
    invoke-interface {v0}, LD6/L;->zzb()Lq7/a;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbkv;->zzf:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 143
    .line 144
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    check-cast v5, Ljava/lang/Boolean;

    .line 149
    .line 150
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-eqz v5, :cond_6

    .line 155
    .line 156
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbix;->zzmO:Lcom/google/android/gms/internal/ads/zzbio;

    .line 157
    .line 158
    sget-object v6, LD6/s;->e:LD6/s;

    .line 159
    .line 160
    iget-object v6, v6, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 161
    .line 162
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    check-cast v5, Ljava/lang/Boolean;

    .line 167
    .line 168
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    if-eqz v5, :cond_6

    .line 173
    .line 174
    sget-object v5, LH6/f;->b:Lcom/google/android/gms/internal/ads/zzgax;

    .line 175
    .line 176
    new-instance v6, LA7/p;

    .line 177
    .line 178
    const/16 v7, 0xf

    .line 179
    .line 180
    const/4 v8, 0x0

    .line 181
    invoke-direct {v6, p0, v8, v0, v7}, LA7/p;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :catch_1
    move-exception v0

    .line 189
    goto :goto_1

    .line 190
    :cond_6
    invoke-static {v0}, Lq7/b;->S(Lq7/a;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    check-cast v0, Landroid/view/View;

    .line 195
    .line 196
    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    .line 197
    .line 198
    .line 199
    goto :goto_2

    .line 200
    :goto_1
    :try_start_3
    invoke-static {v1, v0}, LH6/l;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 201
    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 205
    .line 206
    const-string v0, "The ad size and ad unit ID must be set before loadAd is called."

    .line 207
    .line 208
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw p1

    .line 212
    :cond_8
    :goto_2
    iput-wide v2, p1, LD6/Q0;->n:J

    .line 213
    .line 214
    iget-object v0, p0, LD6/S0;->i:LD6/L;

    .line 215
    .line 216
    if-eqz v0, :cond_a

    .line 217
    .line 218
    iget-object v2, p0, LD6/S0;->o:Ljava/util/concurrent/atomic/AtomicLong;

    .line 219
    .line 220
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 221
    .line 222
    .line 223
    move-result-wide v5

    .line 224
    const-wide/16 v7, 0x0

    .line 225
    .line 226
    cmp-long v3, v5, v7

    .line 227
    .line 228
    if-eqz v3, :cond_9

    .line 229
    .line 230
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 231
    .line 232
    .line 233
    move-result-wide v2

    .line 234
    invoke-interface {v0, v2, v3}, LD6/L;->zzT(J)V

    .line 235
    .line 236
    .line 237
    :cond_9
    iget-object v2, p0, LD6/S0;->b:LD6/w1;

    .line 238
    .line 239
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-static {v3, p1}, LD6/w1;->a(Landroid/content/Context;LD6/Q0;)LD6/v1;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-interface {v0, p1}, LD6/L;->zze(LD6/v1;)Z

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :cond_a
    const/4 p1, 0x0

    .line 255
    throw p1
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0

    .line 256
    :goto_3
    invoke-static {v1, p1}, LH6/l;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 257
    .line 258
    .line 259
    return-void
.end method

.method public final c(LD6/a;)V
    .locals 2

    .line 1
    :try_start_0
    iput-object p1, p0, LD6/S0;->e:LD6/a;

    .line 2
    .line 3
    iget-object v0, p0, LD6/S0;->i:LD6/L;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance v1, LD6/r;

    .line 10
    .line 11
    invoke-direct {v1, p1}, LD6/r;-><init>(LD6/a;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception p1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-interface {v0, v1}, LD6/L;->zzy(LD6/v;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void

    .line 22
    :goto_1
    const-string v0, "#007 Could not call remote method."

    .line 23
    .line 24
    invoke-static {v0, p1}, LH6/l;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final varargs d([Lcom/google/android/gms/ads/AdSize;)V
    .locals 3

    .line 1
    iget-object v0, p0, LD6/S0;->l:Lx6/j;

    .line 2
    .line 3
    iput-object p1, p0, LD6/S0;->g:[Lcom/google/android/gms/ads/AdSize;

    .line 4
    .line 5
    :try_start_0
    iget-object p1, p0, LD6/S0;->i:LD6/L;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, LD6/S0;->g:[Lcom/google/android/gms/ads/AdSize;

    .line 14
    .line 15
    invoke-static {v1, v2}, LD6/S0;->a(Landroid/content/Context;[Lcom/google/android/gms/ads/AdSize;)LD6/x1;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {p1, v1}, LD6/L;->zzo(LD6/x1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p1

    .line 24
    const-string v1, "#007 Could not call remote method."

    .line 25
    .line 26
    invoke-static {v1, p1}, LH6/l;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final e(Ly6/f;)V
    .locals 2

    .line 1
    :try_start_0
    iput-object p1, p0, LD6/S0;->h:Ly6/f;

    .line 2
    .line 3
    iget-object v0, p0, LD6/S0;->i:LD6/L;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lcom/google/android/gms/internal/ads/zzbfm;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/zzbfm;-><init>(Ly6/f;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception p1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-interface {v0, v1}, LD6/L;->zzi(LD6/b0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void

    .line 22
    :goto_1
    const-string v0, "#007 Could not call remote method."

    .line 23
    .line 24
    invoke-static {v0, p1}, LH6/l;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
