.class public final LOc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/i;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, LOc/d;->a:I

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 2
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LOc/d;->b:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LOc/d;->a:I

    iput-object p1, p0, LOc/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget p1, p0, LOc/d;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, LOc/d;->c:Ljava/lang/Object;

    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, LOc/d;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lm9/E;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lm9/E;->remove()V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput-object p1, p0, LOc/d;->b:Ljava/lang/Object;

    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :pswitch_1
    iget-object p1, p0, LOc/d;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, LPc/S;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, LOc/d;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lcom/google/firebase/auth/FirebaseAuth;

    .line 32
    .line 33
    iget-object v0, v0, Lcom/google/firebase/auth/FirebaseAuth;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    iput-object p1, p0, LOc/d;->c:Ljava/lang/Object;

    .line 40
    .line 41
    :cond_1
    return-void

    .line 42
    :pswitch_2
    iget-object p1, p0, LOc/d;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, LPc/a;

    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, LOc/d;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lcom/google/firebase/auth/FirebaseAuth;

    .line 51
    .line 52
    iget-object v0, v0, Lcom/google/firebase/auth/FirebaseAuth;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    iput-object p1, p0, LOc/d;->c:Ljava/lang/Object;

    .line 59
    .line 60
    :cond_2
    return-void

    .line 61
    :pswitch_3
    iget-object p1, p0, LOc/d;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, LOc/c;

    .line 64
    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    iget-object v0, p0, LOc/d;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, LC8/f;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v1, v0, LC8/f;->d:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    iget-object p1, v0, LC8/f;->c:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    add-int/2addr v1, p1

    .line 90
    iget-object p1, v0, LC8/f;->f:LC8/n;

    .line 91
    .line 92
    invoke-virtual {p1, v1}, LC8/n;->a(I)V

    .line 93
    .line 94
    .line 95
    const/4 p1, 0x0

    .line 96
    iput-object p1, p0, LOc/d;->c:Ljava/lang/Object;

    .line 97
    .line 98
    :cond_3
    return-void

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onListen(Ljava/lang/Object;Luc/g;)V
    .locals 3

    .line 1
    iget p1, p0, LOc/d;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LOc/d;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/Map;

    .line 25
    .line 26
    move-object v2, p2

    .line 27
    check-cast v2, Luc/h;

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Luc/h;->a(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 34
    .line 35
    .line 36
    check-cast p2, Luc/h;

    .line 37
    .line 38
    iput-object p2, p0, LOc/d;->c:Ljava/lang/Object;

    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_0
    new-instance p1, LC8/g;

    .line 42
    .line 43
    check-cast p2, Luc/h;

    .line 44
    .line 45
    const/16 v0, 0x10

    .line 46
    .line 47
    invoke-direct {p1, p2, v0}, LC8/g;-><init>(Ljava/lang/Object;I)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, LOc/d;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p2, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 53
    .line 54
    sget-object v0, Lw9/k;->a:Ljava/util/concurrent/Executor;

    .line 55
    .line 56
    new-instance v1, Lm9/D;

    .line 57
    .line 58
    invoke-direct {v1, p1}, Lm9/D;-><init>(LC8/g;)V

    .line 59
    .line 60
    .line 61
    new-instance p1, Lp9/b;

    .line 62
    .line 63
    invoke-direct {p1, v0, v1}, Lp9/b;-><init>(Ljava/util/concurrent/Executor;Lm9/p;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p2, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 67
    .line 68
    monitor-enter v0

    .line 69
    :try_start_0
    invoke-virtual {v0}, LDd/c;->C()V

    .line 70
    .line 71
    .line 72
    iget-object p2, v0, LDd/c;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p2, Lp9/n;

    .line 75
    .line 76
    invoke-virtual {p2}, Lp9/n;->e()V

    .line 77
    .line 78
    .line 79
    new-instance v1, Lng/a;

    .line 80
    .line 81
    const/4 v2, 0x6

    .line 82
    invoke-direct {v1, v2, p2, p1}, Lng/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v2, p2, Lp9/n;->d:Lw9/e;

    .line 86
    .line 87
    invoke-virtual {v2, v1}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 88
    .line 89
    .line 90
    new-instance v1, Lm9/E;

    .line 91
    .line 92
    invoke-direct {v1, p1, p2}, Lm9/E;-><init>(Lp9/b;Lp9/n;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    monitor-exit v0

    .line 96
    iput-object v1, p0, LOc/d;->b:Ljava/lang/Object;

    .line 97
    .line 98
    return-void

    .line 99
    :catchall_0
    move-exception p1

    .line 100
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    throw p1

    .line 102
    :pswitch_1
    new-instance p1, Ljava/util/HashMap;

    .line 103
    .line 104
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, LOc/d;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Lcom/google/firebase/auth/FirebaseAuth;

    .line 110
    .line 111
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 112
    .line 113
    invoke-virtual {v1}, Ls8/g;->a()V

    .line 114
    .line 115
    .line 116
    const-string v2, "appName"

    .line 117
    .line 118
    iget-object v1, v1, Ls8/g;->b:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 124
    .line 125
    const/4 v2, 0x1

    .line 126
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 127
    .line 128
    .line 129
    new-instance v2, LPc/S;

    .line 130
    .line 131
    check-cast p2, Luc/h;

    .line 132
    .line 133
    invoke-direct {v2, v1, p1, p2}, LPc/S;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/HashMap;Luc/h;)V

    .line 134
    .line 135
    .line 136
    iput-object v2, p0, LOc/d;->c:Ljava/lang/Object;

    .line 137
    .line 138
    iget-object p1, v0, Lcom/google/firebase/auth/FirebaseAuth;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 139
    .line 140
    invoke-virtual {p1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    new-instance p1, LA7/p;

    .line 144
    .line 145
    const/16 p2, 0x15

    .line 146
    .line 147
    invoke-direct {p1, p2, v0, v2}, LA7/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iget-object p2, v0, Lcom/google/firebase/auth/FirebaseAuth;->A:Ljava/util/concurrent/Executor;

    .line 151
    .line 152
    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :pswitch_2
    new-instance p1, Ljava/util/HashMap;

    .line 157
    .line 158
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 159
    .line 160
    .line 161
    iget-object v0, p0, LOc/d;->b:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, Lcom/google/firebase/auth/FirebaseAuth;

    .line 164
    .line 165
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 166
    .line 167
    invoke-virtual {v1}, Ls8/g;->a()V

    .line 168
    .line 169
    .line 170
    const-string v2, "appName"

    .line 171
    .line 172
    iget-object v1, v1, Ls8/g;->b:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 178
    .line 179
    const/4 v2, 0x1

    .line 180
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 181
    .line 182
    .line 183
    new-instance v2, LPc/a;

    .line 184
    .line 185
    check-cast p2, Luc/h;

    .line 186
    .line 187
    invoke-direct {v2, v1, p1, p2}, LPc/a;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/HashMap;Luc/h;)V

    .line 188
    .line 189
    .line 190
    iput-object v2, p0, LOc/d;->c:Ljava/lang/Object;

    .line 191
    .line 192
    iget-object p1, v0, Lcom/google/firebase/auth/FirebaseAuth;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 193
    .line 194
    invoke-virtual {p1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    new-instance p1, LA7/p;

    .line 198
    .line 199
    const/16 p2, 0x17

    .line 200
    .line 201
    invoke-direct {p1, p2, v0, v2}, LA7/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    iget-object p2, v0, Lcom/google/firebase/auth/FirebaseAuth;->A:Ljava/util/concurrent/Executor;

    .line 205
    .line 206
    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :pswitch_3
    new-instance p1, LOc/c;

    .line 211
    .line 212
    check-cast p2, Luc/h;

    .line 213
    .line 214
    invoke-direct {p1, p2}, LOc/c;-><init>(Luc/h;)V

    .line 215
    .line 216
    .line 217
    iput-object p1, p0, LOc/d;->c:Ljava/lang/Object;

    .line 218
    .line 219
    iget-object v0, p0, LOc/d;->b:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, LC8/f;

    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    iget-object v1, v0, LC8/f;->d:Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    iget-object p1, v0, LC8/f;->c:Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    add-int/2addr v1, p1

    .line 242
    iget-object p1, v0, LC8/f;->f:LC8/n;

    .line 243
    .line 244
    invoke-virtual {p1, v1}, LC8/n;->a(I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0}, LC8/f;->b()Z

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    if-eqz p1, :cond_1

    .line 252
    .line 253
    iget-object p1, v0, LC8/f;->m:LC8/b;

    .line 254
    .line 255
    new-instance v0, Ljava/util/HashMap;

    .line 256
    .line 257
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 258
    .line 259
    .line 260
    iget-object p1, p1, LC8/b;->a:Ljava/lang/String;

    .line 261
    .line 262
    const-string v1, "token"

    .line 263
    .line 264
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    invoke-virtual {p2, v0}, Luc/h;->a(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    :cond_1
    return-void

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
