.class public final synthetic LG6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:LG6/j;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(LG6/j;IIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LG6/b;->a:LG6/j;

    .line 5
    .line 6
    iput p2, p0, LG6/b;->b:I

    .line 7
    .line 8
    iput p3, p0, LG6/b;->c:I

    .line 9
    .line 10
    iput p4, p0, LG6/b;->d:I

    .line 11
    .line 12
    iput p5, p0, LG6/b;->e:I

    .line 13
    .line 14
    iput p6, p0, LG6/b;->f:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    .line 1
    const/4 p1, 0x0

    .line 2
    const/4 v0, 0x1

    .line 3
    iget-object v1, p0, LG6/b;->a:LG6/j;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v2, p0, LG6/b;->b:I

    .line 9
    .line 10
    if-ne p2, v2, :cond_4

    .line 11
    .line 12
    iget-object p1, v1, LG6/j;->a:Landroid/content/Context;

    .line 13
    .line 14
    instance-of p2, p1, Landroid/app/Activity;

    .line 15
    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    sget p1, LG6/L;->b:I

    .line 19
    .line 20
    const-string p1, "Can not create dialog without Activity Context"

    .line 21
    .line 22
    invoke-static {p1}, LH6/l;->e(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object p2, v1, LG6/j;->c:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const-string v2, "No debug information"

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const-string v0, "\\+"

    .line 38
    .line 39
    const-string v3, "%20"

    .line 40
    .line 41
    invoke-virtual {p2, v0, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    new-instance v0, Landroid/net/Uri$Builder;

    .line 46
    .line 47
    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p2}, Landroid/net/Uri$Builder;->encodedQuery(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    sget-object v3, LC6/n;->D:LC6/n;

    .line 64
    .line 65
    iget-object v3, v3, LC6/n;->c:LG6/U;

    .line 66
    .line 67
    invoke-static {p2}, LG6/U;->o(Landroid/net/Uri;)Ljava/util/HashMap;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_2

    .line 84
    .line 85
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    check-cast v4, Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v5, " = "

    .line 95
    .line 96
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    check-cast v4, Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v4, "\n\n"

    .line 109
    .line 110
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_3

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_3
    move-object v2, p2

    .line 130
    :goto_1
    sget-object p2, LC6/n;->D:LC6/n;

    .line 131
    .line 132
    iget-object p2, p2, LC6/n;->c:LG6/U;

    .line 133
    .line 134
    invoke-static {p1}, LG6/U;->k(Landroid/content/Context;)Landroid/app/AlertDialog$Builder;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 139
    .line 140
    .line 141
    const-string p2, "Ad Information"

    .line 142
    .line 143
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 144
    .line 145
    .line 146
    new-instance p2, LG6/g;

    .line 147
    .line 148
    invoke-direct {p2, v1, v2}, LG6/g;-><init>(LG6/j;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    const-string v0, "Share"

    .line 152
    .line 153
    invoke-virtual {p1, v0, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 154
    .line 155
    .line 156
    sget-object p2, LG6/h;->a:LG6/h;

    .line 157
    .line 158
    const-string v0, "Close"

    .line 159
    .line 160
    invoke-virtual {p1, v0, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :cond_4
    iget v2, p0, LG6/b;->c:I

    .line 172
    .line 173
    if-ne p2, v2, :cond_5

    .line 174
    .line 175
    sget p1, LG6/L;->b:I

    .line 176
    .line 177
    const-string p1, "Debug mode [Creative Preview] selected."

    .line 178
    .line 179
    invoke-static {p1}, LH6/l;->a(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    sget-object p1, Lcom/google/android/gms/internal/ads/zzcfy;->zza:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 183
    .line 184
    new-instance p2, LG6/c;

    .line 185
    .line 186
    invoke-direct {p2, v1, v0}, LG6/c;-><init>(LG6/j;I)V

    .line 187
    .line 188
    .line 189
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_5
    iget v2, p0, LG6/b;->d:I

    .line 194
    .line 195
    if-ne p2, v2, :cond_6

    .line 196
    .line 197
    sget p1, LG6/L;->b:I

    .line 198
    .line 199
    const-string p1, "Debug mode [Troubleshooting] selected."

    .line 200
    .line 201
    invoke-static {p1}, LH6/l;->a(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    sget-object p1, Lcom/google/android/gms/internal/ads/zzcfy;->zza:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 205
    .line 206
    new-instance p2, LG6/c;

    .line 207
    .line 208
    const/4 v0, 0x2

    .line 209
    invoke-direct {p2, v1, v0}, LG6/c;-><init>(LG6/j;I)V

    .line 210
    .line 211
    .line 212
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :cond_6
    iget v2, p0, LG6/b;->e:I

    .line 217
    .line 218
    iget-object v3, v1, LG6/j;->b:Lcom/google/android/gms/internal/ads/zzecz;

    .line 219
    .line 220
    if-ne p2, v2, :cond_8

    .line 221
    .line 222
    sget-object p2, Lcom/google/android/gms/internal/ads/zzcfy;->zzf:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 223
    .line 224
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcfy;->zza:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 225
    .line 226
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzecz;->zzs()Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-eqz v2, :cond_7

    .line 231
    .line 232
    new-instance p1, LG6/c;

    .line 233
    .line 234
    const/4 v0, 0x5

    .line 235
    invoke-direct {p1, v1, v0}, LG6/c;-><init>(LG6/j;I)V

    .line 236
    .line 237
    .line 238
    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :cond_7
    new-instance v2, LG6/i;

    .line 243
    .line 244
    invoke-direct {v2, v1, p2, p1}, LG6/i;-><init>(LG6/j;Lcom/google/android/gms/internal/ads/zzhcp;I)V

    .line 245
    .line 246
    .line 247
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :cond_8
    iget v2, p0, LG6/b;->f:I

    .line 252
    .line 253
    if-ne p2, v2, :cond_a

    .line 254
    .line 255
    sget-object p2, Lcom/google/android/gms/internal/ads/zzcfy;->zzf:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 256
    .line 257
    sget-object v2, Lcom/google/android/gms/internal/ads/zzcfy;->zza:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 258
    .line 259
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzecz;->zzs()Z

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    if-eqz v3, :cond_9

    .line 264
    .line 265
    new-instance v0, LG6/c;

    .line 266
    .line 267
    invoke-direct {v0, v1, p1}, LG6/c;-><init>(LG6/j;I)V

    .line 268
    .line 269
    .line 270
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 271
    .line 272
    .line 273
    return-void

    .line 274
    :cond_9
    new-instance p1, LG6/i;

    .line 275
    .line 276
    invoke-direct {p1, v1, p2, v0}, LG6/i;-><init>(LG6/j;Lcom/google/android/gms/internal/ads/zzhcp;I)V

    .line 277
    .line 278
    .line 279
    invoke-interface {v2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 280
    .line 281
    .line 282
    :cond_a
    return-void
.end method
