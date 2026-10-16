.class public final synthetic LQc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LQc/c;


# direct methods
.method public synthetic constructor <init>(LQc/c;I)V
    .locals 0

    .line 1
    iput p2, p0, LQc/d;->a:I

    iput-object p1, p0, LQc/d;->b:LQc/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lba/a;)V
    .locals 8

    .line 1
    iget v0, p0, LQc/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v0, LPc/q;

    .line 12
    .line 13
    const/16 v1, 0xc

    .line 14
    .line 15
    invoke-direct {v0, p1, p2, v1}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LQc/d;->b:LQc/c;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 24
    .line 25
    invoke-direct {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 26
    .line 27
    .line 28
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 29
    .line 30
    new-instance v2, LQc/a;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-direct {v2, p1, p2, v3}, LQc/a;-><init>(LQc/c;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p2, v0}, LQc/c;->b(Lcom/google/android/gms/tasks/TaskCompletionSource;LQc/h;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_0
    new-instance p1, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v0, LPc/p;

    .line 49
    .line 50
    const/16 v1, 0xc

    .line 51
    .line 52
    invoke-direct {v0, p1, p2, v1}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, LQc/d;->b:LQc/c;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 61
    .line 62
    invoke-direct {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 63
    .line 64
    .line 65
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 66
    .line 67
    new-instance v2, LQc/a;

    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    invoke-direct {v2, p1, p2, v3}, LQc/a;-><init>(LQc/c;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 74
    .line 75
    .line 76
    invoke-static {p2, v0}, LQc/c;->b(Lcom/google/android/gms/tasks/TaskCompletionSource;LQc/h;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_1
    new-instance v0, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    check-cast p1, Ljava/util/ArrayList;

    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    move-object v5, v1

    .line 93
    check-cast v5, Ljava/lang/String;

    .line 94
    .line 95
    const/4 v1, 0x1

    .line 96
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    move-object v4, p1

    .line 101
    check-cast v4, LQc/f;

    .line 102
    .line 103
    new-instance p1, LPc/o;

    .line 104
    .line 105
    const/16 v1, 0xd

    .line 106
    .line 107
    invoke-direct {p1, v0, p2, v1}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 108
    .line 109
    .line 110
    iget-object v3, p0, LQc/d;->b:LQc/c;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    new-instance v6, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 116
    .line 117
    invoke-direct {v6}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 118
    .line 119
    .line 120
    sget-object p2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 121
    .line 122
    new-instance v2, LCb/a;

    .line 123
    .line 124
    const/4 v7, 0x3

    .line 125
    invoke-direct/range {v2 .. v7}, LCb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    invoke-interface {p2, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 129
    .line 130
    .line 131
    invoke-static {v6, p1}, LQc/c;->b(Lcom/google/android/gms/tasks/TaskCompletionSource;LQc/h;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :pswitch_2
    new-instance v0, Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 138
    .line 139
    .line 140
    check-cast p1, Ljava/util/ArrayList;

    .line 141
    .line 142
    const/4 v1, 0x0

    .line 143
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    check-cast p1, Ljava/lang/String;

    .line 148
    .line 149
    new-instance v1, LPc/q;

    .line 150
    .line 151
    const/16 v2, 0xb

    .line 152
    .line 153
    invoke-direct {v1, v0, p2, v2}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 154
    .line 155
    .line 156
    iget-object p2, p0, LQc/d;->b:LQc/c;

    .line 157
    .line 158
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    new-instance p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 162
    .line 163
    invoke-direct {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 164
    .line 165
    .line 166
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 167
    .line 168
    new-instance v2, LC8/d;

    .line 169
    .line 170
    const/16 v3, 0x1b

    .line 171
    .line 172
    invoke-direct {v2, v3, p1, p2}, LC8/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 176
    .line 177
    .line 178
    invoke-static {p2, v1}, LQc/c;->b(Lcom/google/android/gms/tasks/TaskCompletionSource;LQc/h;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :pswitch_3
    new-instance v0, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    check-cast p1, Ljava/util/ArrayList;

    .line 188
    .line 189
    const/4 v1, 0x0

    .line 190
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    check-cast v1, Ljava/lang/String;

    .line 195
    .line 196
    const/4 v2, 0x1

    .line 197
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    check-cast p1, Ljava/lang/Boolean;

    .line 202
    .line 203
    new-instance v2, LPc/p;

    .line 204
    .line 205
    const/16 v3, 0xb

    .line 206
    .line 207
    invoke-direct {v2, v0, p2, v3}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 208
    .line 209
    .line 210
    iget-object p2, p0, LQc/d;->b:LQc/c;

    .line 211
    .line 212
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    new-instance p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 216
    .line 217
    invoke-direct {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 218
    .line 219
    .line 220
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 221
    .line 222
    new-instance v3, LQc/b;

    .line 223
    .line 224
    const/4 v4, 0x1

    .line 225
    invoke-direct {v3, v1, p1, p2, v4}, LQc/b;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 226
    .line 227
    .line 228
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 229
    .line 230
    .line 231
    invoke-static {p2, v2}, LQc/c;->b(Lcom/google/android/gms/tasks/TaskCompletionSource;LQc/h;)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :pswitch_4
    new-instance v0, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 238
    .line 239
    .line 240
    check-cast p1, Ljava/util/ArrayList;

    .line 241
    .line 242
    const/4 v1, 0x0

    .line 243
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    check-cast v1, Ljava/lang/String;

    .line 248
    .line 249
    const/4 v2, 0x1

    .line 250
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    check-cast p1, Ljava/lang/Boolean;

    .line 255
    .line 256
    new-instance v2, LPc/o;

    .line 257
    .line 258
    const/16 v3, 0xc

    .line 259
    .line 260
    invoke-direct {v2, v0, p2, v3}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 261
    .line 262
    .line 263
    iget-object p2, p0, LQc/d;->b:LQc/c;

    .line 264
    .line 265
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    new-instance p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 269
    .line 270
    invoke-direct {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 271
    .line 272
    .line 273
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 274
    .line 275
    new-instance v3, LQc/b;

    .line 276
    .line 277
    const/4 v4, 0x0

    .line 278
    invoke-direct {v3, v1, p1, p2, v4}, LQc/b;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 279
    .line 280
    .line 281
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 282
    .line 283
    .line 284
    invoke-static {p2, v2}, LQc/c;->b(Lcom/google/android/gms/tasks/TaskCompletionSource;LQc/h;)V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
