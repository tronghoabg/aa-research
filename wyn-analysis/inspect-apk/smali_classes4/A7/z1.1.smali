.class public final LA7/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:LA7/x1;


# direct methods
.method public synthetic constructor <init>(LA7/x1;JI)V
    .locals 0

    .line 1
    iput p4, p0, LA7/z1;->a:I

    iput-wide p2, p0, LA7/z1;->b:J

    iput-object p1, p0, LA7/z1;->c:LA7/x1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, LA7/z1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/z1;->c:LA7/x1;

    .line 7
    .line 8
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LA7/x1;->k0()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-wide v2, p0, LA7/z1;->b:J

    .line 19
    .line 20
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iget-object v1, v1, LA7/N;->n:LA7/P;

    .line 25
    .line 26
    const-string v5, "Activity resumed, time"

    .line 27
    .line 28
    invoke-virtual {v1, v5, v4}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, LA7/n0;

    .line 34
    .line 35
    iget-object v4, v1, LA7/n0;->g:LA7/e;

    .line 36
    .line 37
    sget-object v5, LA7/y;->O0:LA7/D;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-virtual {v4, v6, v5}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    iget-object v1, v1, LA7/n0;->g:LA7/e;

    .line 45
    .line 46
    iget-object v5, v0, LA7/x1;->f:LA7/B1;

    .line 47
    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    invoke-virtual {v1}, LA7/e;->q0()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_0

    .line 55
    .line 56
    iget-boolean v1, v0, LA7/x1;->d:Z

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    :cond_0
    iget-object v1, v5, LA7/B1;->e:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, LA7/x1;

    .line 63
    .line 64
    invoke-virtual {v1}, LA7/B;->c0()V

    .line 65
    .line 66
    .line 67
    iget-object v1, v5, LA7/B1;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, LA7/C1;

    .line 70
    .line 71
    invoke-virtual {v1}, LA7/n;->a()V

    .line 72
    .line 73
    .line 74
    iput-wide v2, v5, LA7/B1;->b:J

    .line 75
    .line 76
    iput-wide v2, v5, LA7/B1;->c:J

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-virtual {v1}, LA7/e;->q0()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_2

    .line 84
    .line 85
    invoke-virtual {v0}, LA7/B0;->a0()LA7/Z;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v1, v1, LA7/Z;->t:LA7/X;

    .line 90
    .line 91
    invoke-virtual {v1}, LA7/X;->d()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_3

    .line 96
    .line 97
    :cond_2
    iget-object v1, v5, LA7/B1;->e:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, LA7/x1;

    .line 100
    .line 101
    invoke-virtual {v1}, LA7/B;->c0()V

    .line 102
    .line 103
    .line 104
    iget-object v1, v5, LA7/B1;->d:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v1, LA7/C1;

    .line 107
    .line 108
    invoke-virtual {v1}, LA7/n;->a()V

    .line 109
    .line 110
    .line 111
    iput-wide v2, v5, LA7/B1;->b:J

    .line 112
    .line 113
    iput-wide v2, v5, LA7/B1;->c:J

    .line 114
    .line 115
    :cond_3
    :goto_0
    iget-object v1, v0, LA7/x1;->g:LS3/s;

    .line 116
    .line 117
    iget-object v2, v1, LS3/s;->c:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v2, LA7/x1;

    .line 120
    .line 121
    invoke-virtual {v2}, LA7/B;->c0()V

    .line 122
    .line 123
    .line 124
    iget-object v1, v1, LS3/s;->b:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v1, LA7/A1;

    .line 127
    .line 128
    if-eqz v1, :cond_4

    .line 129
    .line 130
    iget-object v3, v2, LA7/x1;->c:Lcom/google/android/gms/internal/measurement/zzdh;

    .line 131
    .line 132
    invoke-virtual {v3, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 133
    .line 134
    .line 135
    :cond_4
    invoke-virtual {v2}, LA7/B0;->a0()LA7/Z;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    iget-object v1, v1, LA7/Z;->t:LA7/X;

    .line 140
    .line 141
    const/4 v3, 0x0

    .line 142
    invoke-virtual {v1, v3}, LA7/X;->c(Z)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, LA7/B;->c0()V

    .line 146
    .line 147
    .line 148
    iput-boolean v3, v2, LA7/x1;->d:Z

    .line 149
    .line 150
    iget-object v1, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v1, LA7/n0;

    .line 153
    .line 154
    iget-object v1, v1, LA7/n0;->g:LA7/e;

    .line 155
    .line 156
    sget-object v3, LA7/y;->L0:LA7/D;

    .line 157
    .line 158
    invoke-virtual {v1, v6, v3}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_5

    .line 163
    .line 164
    invoke-virtual {v2}, LA7/B;->e0()LA7/P0;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iget-boolean v1, v1, LA7/P0;->m:Z

    .line 169
    .line 170
    if-eqz v1, :cond_5

    .line 171
    .line 172
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    const-string v3, "Retrying trigger URI registration in foreground"

    .line 177
    .line 178
    iget-object v1, v1, LA7/N;->n:LA7/P;

    .line 179
    .line 180
    invoke-virtual {v1, v3}, LA7/P;->c(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, LA7/B;->e0()LA7/P0;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {v1}, LA7/P0;->D0()V

    .line 188
    .line 189
    .line 190
    :cond_5
    iget-object v0, v0, LA7/x1;->e:LY9/c;

    .line 191
    .line 192
    iget-object v1, v0, LY9/c;->b:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v1, LA7/x1;

    .line 195
    .line 196
    invoke-virtual {v1}, LA7/B;->c0()V

    .line 197
    .line 198
    .line 199
    iget-object v1, v0, LY9/c;->b:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v1, LA7/x1;

    .line 202
    .line 203
    iget-object v2, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v2, LA7/n0;

    .line 206
    .line 207
    invoke-virtual {v2}, LA7/n0;->e()Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_6

    .line 212
    .line 213
    iget-object v1, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v1, LA7/n0;

    .line 216
    .line 217
    iget-object v1, v1, LA7/n0;->n:Ln7/b;

    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 223
    .line 224
    .line 225
    move-result-wide v1

    .line 226
    invoke-virtual {v0, v1, v2}, LY9/c;->s(J)V

    .line 227
    .line 228
    .line 229
    :cond_6
    return-void

    .line 230
    :pswitch_0
    iget-object v0, p0, LA7/z1;->c:LA7/x1;

    .line 231
    .line 232
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0}, LA7/x1;->k0()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    iget-wide v6, p0, LA7/z1;->b:J

    .line 243
    .line 244
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    iget-object v1, v1, LA7/N;->n:LA7/P;

    .line 249
    .line 250
    const-string v3, "Activity paused, time"

    .line 251
    .line 252
    invoke-virtual {v1, v3, v2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    new-instance v2, LA7/A1;

    .line 256
    .line 257
    iget-object v3, v0, LA7/x1;->g:LS3/s;

    .line 258
    .line 259
    iget-object v1, v3, LS3/s;->c:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v1, LA7/x1;

    .line 262
    .line 263
    iget-object v4, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v4, LA7/n0;

    .line 266
    .line 267
    iget-object v4, v4, LA7/n0;->n:Ln7/b;

    .line 268
    .line 269
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 273
    .line 274
    .line 275
    move-result-wide v4

    .line 276
    invoke-direct/range {v2 .. v7}, LA7/A1;-><init>(LS3/s;JJ)V

    .line 277
    .line 278
    .line 279
    iput-object v2, v3, LS3/s;->b:Ljava/lang/Object;

    .line 280
    .line 281
    iget-object v1, v1, LA7/x1;->c:Lcom/google/android/gms/internal/measurement/zzdh;

    .line 282
    .line 283
    const-wide/16 v3, 0x7d0

    .line 284
    .line 285
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 286
    .line 287
    .line 288
    iget-object v1, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v1, LA7/n0;

    .line 291
    .line 292
    iget-object v1, v1, LA7/n0;->g:LA7/e;

    .line 293
    .line 294
    invoke-virtual {v1}, LA7/e;->q0()Z

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-eqz v1, :cond_7

    .line 299
    .line 300
    iget-object v0, v0, LA7/x1;->f:LA7/B1;

    .line 301
    .line 302
    iget-object v0, v0, LA7/B1;->d:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, LA7/C1;

    .line 305
    .line 306
    invoke-virtual {v0}, LA7/n;->a()V

    .line 307
    .line 308
    .line 309
    :cond_7
    return-void

    .line 310
    nop

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
