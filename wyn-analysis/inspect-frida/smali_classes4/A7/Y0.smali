.class public final LA7/Y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, LA7/Y0;->a:I

    iput-boolean p3, p0, LA7/Y0;->b:Z

    iput-object p2, p0, LA7/Y0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LA7/Y0;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/Y0;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget v2, p0, LA7/Y0;->a:I

    .line 4
    .line 5
    packed-switch v2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, LA7/Y0;->b:Z

    .line 9
    .line 10
    sget v0, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;->d:I

    .line 11
    .line 12
    iget-object v0, p0, LA7/Y0;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v2, p0, LA7/Y0;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lod/A;

    .line 23
    .line 24
    iget-boolean v3, p0, LA7/Y0;->b:Z

    .line 25
    .line 26
    iget-object v2, v2, Lod/A;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lod/O;

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    iput-boolean v0, v2, Lod/O;->l:Z

    .line 33
    .line 34
    const-wide/16 v3, 0x0

    .line 35
    .line 36
    iget-wide v5, v2, Lod/O;->i:J

    .line 37
    .line 38
    cmp-long v0, v5, v3

    .line 39
    .line 40
    if-lez v0, :cond_0

    .line 41
    .line 42
    iget-object v0, v2, Lod/O;->k:Lj/E;

    .line 43
    .line 44
    iput-boolean v1, v0, Lj/E;->b:Z

    .line 45
    .line 46
    invoke-virtual {v0}, Lj/E;->b()V

    .line 47
    .line 48
    .line 49
    :cond_0
    iput-boolean v1, v2, Lod/O;->q:Z

    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_1
    iget-object v0, p0, LA7/Y0;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, LN6/x;

    .line 55
    .line 56
    iget-boolean v2, p0, LA7/Y0;->b:Z

    .line 57
    .line 58
    invoke-virtual {v0, v2, v1}, LN6/x;->d(ZZ)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_2
    iget-boolean v0, p0, LA7/Y0;->b:Z

    .line 63
    .line 64
    iget-object v1, p0, LA7/Y0;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, LC6/f;

    .line 67
    .line 68
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 69
    .line 70
    .line 71
    move-result-wide v2

    .line 72
    :try_start_0
    iget-object v4, v1, LC6/f;->j:Landroid/content/Context;

    .line 73
    .line 74
    iget-object v5, v1, LC6/f;->l:LH6/a;

    .line 75
    .line 76
    iget-boolean v6, v1, LC6/f;->m:Z

    .line 77
    .line 78
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzawv;->zze()Lcom/google/android/gms/internal/ads/zzawu;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/ads/zzawu;->zzb(Z)Lcom/google/android/gms/internal/ads/zzawu;

    .line 83
    .line 84
    .line 85
    iget-object v0, v5, LH6/a;->a:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/ads/zzawu;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzawu;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zziej;->zzbm()Lcom/google/android/gms/internal/ads/zziep;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Lcom/google/android/gms/internal/ads/zzawv;

    .line 95
    .line 96
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    if-nez v5, :cond_1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    move-object v4, v5

    .line 104
    :goto_0
    invoke-static {v4, v0, v6}, Lcom/google/android/gms/internal/ads/zzbao;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzawv;Z)Lcom/google/android/gms/internal/ads/zzbao;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbao;->zzm()V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :catch_0
    move-exception v0

    .line 113
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 114
    .line 115
    .line 116
    move-result-wide v4

    .line 117
    sub-long/2addr v4, v2

    .line 118
    iget-object v1, v1, LC6/f;->h:Lcom/google/android/gms/internal/ads/zzfxq;

    .line 119
    .line 120
    const/16 v2, 0x7eb

    .line 121
    .line 122
    invoke-virtual {v1, v2, v4, v5, v0}, Lcom/google/android/gms/internal/ads/zzfxq;->zzc(IJLjava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 123
    .line 124
    .line 125
    :goto_1
    return-void

    .line 126
    :pswitch_3
    iget-object v2, p0, LA7/Y0;->c:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v2, LA7/P0;

    .line 129
    .line 130
    iget-object v3, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v3, LA7/n0;

    .line 133
    .line 134
    invoke-virtual {v3}, LA7/n0;->e()Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    iget-object v4, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v4, LA7/n0;

    .line 141
    .line 142
    iget-object v5, v4, LA7/n0;->A:Ljava/lang/Boolean;

    .line 143
    .line 144
    if-eqz v5, :cond_2

    .line 145
    .line 146
    iget-object v4, v4, LA7/n0;->A:Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-eqz v4, :cond_2

    .line 153
    .line 154
    move v4, v0

    .line 155
    goto :goto_2

    .line 156
    :cond_2
    move v4, v1

    .line 157
    :goto_2
    iget-object v5, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v5, LA7/n0;

    .line 160
    .line 161
    iget-boolean v6, p0, LA7/Y0;->b:Z

    .line 162
    .line 163
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    iput-object v7, v5, LA7/n0;->A:Ljava/lang/Boolean;

    .line 168
    .line 169
    if-ne v4, v6, :cond_3

    .line 170
    .line 171
    iget-object v4, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v4, LA7/n0;

    .line 174
    .line 175
    iget-object v4, v4, LA7/n0;->i:LA7/N;

    .line 176
    .line 177
    invoke-static {v4}, LA7/n0;->d(LA7/D0;)V

    .line 178
    .line 179
    .line 180
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    iget-object v4, v4, LA7/N;->n:LA7/P;

    .line 185
    .line 186
    const-string v7, "Default data collection state already set to"

    .line 187
    .line 188
    invoke-virtual {v4, v7, v5}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_3
    iget-object v4, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v4, LA7/n0;

    .line 194
    .line 195
    invoke-virtual {v4}, LA7/n0;->e()Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-eq v4, v3, :cond_5

    .line 200
    .line 201
    iget-object v4, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v4, LA7/n0;

    .line 204
    .line 205
    invoke-virtual {v4}, LA7/n0;->e()Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    iget-object v5, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v5, LA7/n0;

    .line 212
    .line 213
    iget-object v7, v5, LA7/n0;->A:Ljava/lang/Boolean;

    .line 214
    .line 215
    if-eqz v7, :cond_4

    .line 216
    .line 217
    iget-object v5, v5, LA7/n0;->A:Ljava/lang/Boolean;

    .line 218
    .line 219
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    if-eqz v5, :cond_4

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_4
    move v0, v1

    .line 227
    :goto_3
    if-eq v4, v0, :cond_6

    .line 228
    .line 229
    :cond_5
    iget-object v0, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v0, LA7/n0;

    .line 232
    .line 233
    iget-object v0, v0, LA7/n0;->i:LA7/N;

    .line 234
    .line 235
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 236
    .line 237
    .line 238
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    iget-object v0, v0, LA7/N;->k:LA7/P;

    .line 247
    .line 248
    const-string v4, "Default data collection is different than actual status"

    .line 249
    .line 250
    invoke-virtual {v0, v1, v4, v3}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :cond_6
    invoke-virtual {v2}, LA7/P0;->E0()V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
