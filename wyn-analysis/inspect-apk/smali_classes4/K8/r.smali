.class public final LK8/r;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LE4/F;Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, LK8/r;->a:I

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LK8/r;->b:Ljava/lang/Object;

    .line 3
    iput-object p3, p0, LK8/r;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LVb/a;Luc/h;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LK8/r;->a:I

    iput-object p1, p0, LK8/r;->b:Ljava/lang/Object;

    iput-object p2, p0, LK8/r;->c:Ljava/lang/Object;

    .line 5
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/internal/D;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LK8/r;->a:I

    .line 4
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-object p1, p0, LK8/r;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget v1, p0, LK8/r;->a:I

    .line 3
    .line 4
    packed-switch v1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object p1, v0

    .line 19
    :goto_0
    const-string p2, "com.google.android.gms"

    .line 20
    .line 21
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_3

    .line 26
    .line 27
    iget-object p1, p0, LK8/r;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lcom/google/android/gms/common/api/internal/D;

    .line 30
    .line 31
    iget-object p2, p1, Lcom/google/android/gms/common/api/internal/D;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p2, Lcom/google/android/gms/common/api/internal/e0;

    .line 34
    .line 35
    iget-object p2, p2, Lcom/google/android/gms/common/api/internal/e0;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p2, Lcom/google/android/gms/common/api/internal/E;

    .line 38
    .line 39
    iget-object v1, p2, Lcom/google/android/gms/common/api/internal/E;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p2, p2, Lcom/google/android/gms/common/api/internal/E;->f:Lcom/google/android/gms/common/api/internal/i;

    .line 45
    .line 46
    iget-object p2, p2, Lcom/google/android/gms/common/api/internal/i;->n:Lcom/google/android/gms/internal/base/zau;

    .line 47
    .line 48
    const/4 v1, 0x3

    .line 49
    invoke-virtual {p2, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {p2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 54
    .line 55
    .line 56
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/D;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Landroid/app/AlertDialog;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_1

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 67
    .line 68
    .line 69
    :cond_1
    monitor-enter p0

    .line 70
    :try_start_0
    iget-object p1, p0, LK8/r;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Landroid/content/Context;

    .line 73
    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    :goto_1
    iput-object v0, p0, LK8/r;->b:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    monitor-exit p0

    .line 85
    goto :goto_3

    .line 86
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    throw p1

    .line 88
    :cond_3
    :goto_3
    return-void

    .line 89
    :pswitch_0
    const-string v1, "context"

    .line 90
    .line 91
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const-string p1, "intent"

    .line 95
    .line 96
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const-string p1, "status"

    .line 100
    .line 101
    const/4 v1, -0x1

    .line 102
    invoke-virtual {p2, p1, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    iget-object p2, p0, LK8/r;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p2, LVb/a;

    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {p1}, LVb/a;->b(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iget-object p2, p0, LK8/r;->c:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p2, Luc/h;

    .line 120
    .line 121
    if-eqz p1, :cond_4

    .line 122
    .line 123
    invoke-virtual {p2, p1}, Luc/h;->a(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_4
    const-string p1, "UNAVAILABLE"

    .line 128
    .line 129
    const-string v1, "Charging status unavailable"

    .line 130
    .line 131
    invoke-virtual {p2, p1, v1, v0}, Luc/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 132
    .line 133
    .line 134
    :goto_4
    return-void

    .line 135
    :pswitch_1
    iget-object v1, p0, LK8/r;->b:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Landroid/app/Activity;

    .line 144
    .line 145
    iget-object v2, p0, LK8/r;->c:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 148
    .line 149
    if-nez v1, :cond_5

    .line 150
    .line 151
    const-string p2, "FederatedAuthReceiver"

    .line 152
    .line 153
    const-string v1, "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation."

    .line 154
    .line 155
    invoke-static {p2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    new-instance p2, Lcom/google/android/gms/common/api/Status;

    .line 159
    .line 160
    const/16 v1, 0x445b

    .line 161
    .line 162
    const-string v3, "Activity that started the web operation is no longer alive; see logcat for details"

    .line 163
    .line 164
    invoke-direct {p2, v1, v3, v0, v0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 165
    .line 166
    .line 167
    invoke-static {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadg;->zza(Lcom/google/android/gms/common/api/Status;)Ls8/j;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-virtual {v2, p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 172
    .line 173
    .line 174
    invoke-static {p1}, LE4/F;->w(Landroid/content/Context;)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_6

    .line 178
    .line 179
    :cond_5
    const-string v1, "com.google.firebase.auth.internal.OPERATION"

    .line 180
    .line 181
    invoke-virtual {p2, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-eqz v3, :cond_7

    .line 186
    .line 187
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    const-string v1, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"

    .line 192
    .line 193
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-eqz v1, :cond_6

    .line 198
    .line 199
    const-string v0, "com.google.firebase.auth.internal.RECAPTCHA_TOKEN"

    .line 200
    .line 201
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    invoke-virtual {v2, p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-static {p1}, LE4/F;->w(Landroid/content/Context;)V

    .line 209
    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    const-string p2, "WEB_CONTEXT_CANCELED:Unknown operation received ("

    .line 215
    .line 216
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    const-string p2, ")"

    .line 223
    .line 224
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-static {p1}, La/a;->i0(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadg;->zza(Lcom/google/android/gms/common/api/Status;)Ls8/j;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {v2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 240
    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_7
    sget-object v1, LK8/D;->a:Ljava/util/HashMap;

    .line 244
    .line 245
    const-string v1, "com.google.firebase.auth.internal.STATUS"

    .line 246
    .line 247
    invoke-virtual {p2, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    if-eqz v3, :cond_9

    .line 252
    .line 253
    invoke-virtual {p2, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    invoke-static {v3}, Lcom/google/android/gms/common/internal/v;->b(Z)V

    .line 258
    .line 259
    .line 260
    sget-object v3, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 261
    .line 262
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    .line 263
    .line 264
    .line 265
    move-result-object p2

    .line 266
    if-nez p2, :cond_8

    .line 267
    .line 268
    goto :goto_5

    .line 269
    :cond_8
    invoke-static {p2, v3}, Landroid/support/v4/media/session/b;->c0([BLandroid/os/Parcelable$Creator;)Lf7/c;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    :goto_5
    check-cast v0, Lcom/google/android/gms/common/api/Status;

    .line 274
    .line 275
    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadg;->zza(Lcom/google/android/gms/common/api/Status;)Ls8/j;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    invoke-virtual {v2, p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 280
    .line 281
    .line 282
    invoke-static {p1}, LE4/F;->w(Landroid/content/Context;)V

    .line 283
    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_9
    const-string v0, "com.google.firebase.auth.internal.EXTRA_CANCELED"

    .line 287
    .line 288
    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 289
    .line 290
    .line 291
    move-result p2

    .line 292
    if-eqz p2, :cond_a

    .line 293
    .line 294
    const-string p2, "WEB_CONTEXT_CANCELED"

    .line 295
    .line 296
    invoke-static {p2}, La/a;->i0(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    .line 297
    .line 298
    .line 299
    move-result-object p2

    .line 300
    invoke-static {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzadg;->zza(Lcom/google/android/gms/common/api/Status;)Ls8/j;

    .line 301
    .line 302
    .line 303
    move-result-object p2

    .line 304
    invoke-virtual {v2, p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 305
    .line 306
    .line 307
    invoke-static {p1}, LE4/F;->w(Landroid/content/Context;)V

    .line 308
    .line 309
    .line 310
    :cond_a
    :goto_6
    return-void

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
