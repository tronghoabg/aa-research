.class public final synthetic LB8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;
.implements LL8/e;
.implements Lcom/google/android/gms/tasks/OnFailureListener;
.implements Lu6/g;
.implements Lcom/google/android/gms/tasks/OnSuccessListener;
.implements LLe/b;
.implements LO9/a;
.implements Lk1/r;
.implements LHe/e;
.implements Lcom/vungle/ads/internal/ui/view/b;
.implements LJ5/c;
.implements LQ1/c;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LF5/a;Lf6/p;Lf6/u;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    const/16 p1, 0xc

    iput p1, p0, LB8/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LB8/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(LF5/a;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, LB8/b;->a:I

    iput-object p2, p0, LB8/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p2, p0, LB8/b;->a:I

    iput-object p1, p0, LB8/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 9

    .line 2
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    check-cast v0, LJ5/p;

    iget v1, v0, LJ5/p;->f:I

    int-to-long v1, v1

    mul-long/2addr p1, v1

    const-wide/32 v1, 0xf4240

    div-long v3, p1, v1

    .line 3
    iget-wide p1, v0, LJ5/p;->k:J

    const-wide/16 v0, 0x1

    sub-long v7, p1, v0

    const-wide/16 v5, 0x0

    invoke-static/range {v3 .. v8}, Lu6/v;->i(JJJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public a(FF)V
    .locals 1

    .line 1
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    check-cast v0, Lcom/vungle/ads/internal/ui/view/n;

    invoke-static {v0, p1, p2}, Lcom/vungle/ads/internal/ui/view/n;->a(Lcom/vungle/ads/internal/ui/view/n;FF)V

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget v0, p0, LB8/b;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LP2/a;

    .line 7
    .line 8
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ll8/H;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :sswitch_0
    check-cast p1, LP2/a;

    .line 17
    .line 18
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LP2/h;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v1, LP2/g;

    .line 26
    .line 27
    iget-wide v2, p1, LP2/a;->b:J

    .line 28
    .line 29
    iget-object v4, p1, LP2/a;->a:Ll8/K;

    .line 30
    .line 31
    iget-wide v5, p1, LP2/a;->c:J

    .line 32
    .line 33
    invoke-static {v5, v6, v4}, Lm9/S;->d(JLl8/K;)[B

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-direct {v1, v2, v3, v4}, LP2/g;-><init>(J[B)V

    .line 38
    .line 39
    .line 40
    iget-object v2, v0, LP2/h;->c:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    iget-wide v2, v0, LP2/h;->j:J

    .line 46
    .line 47
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    cmp-long v4, v2, v4

    .line 53
    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    iget-wide v4, p1, LP2/a;->b:J

    .line 57
    .line 58
    cmp-long p1, v4, v2

    .line 59
    .line 60
    if-ltz p1, :cond_1

    .line 61
    .line 62
    :cond_0
    invoke-virtual {v0, v1}, LP2/h;->b(LP2/g;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    return-void

    .line 66
    :sswitch_1
    check-cast p1, Lta/o;

    .line 67
    .line 68
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, LJ9/Z;

    .line 71
    .line 72
    iget-boolean v1, v0, LJ9/Z;->b:Z

    .line 73
    .line 74
    if-nez v1, :cond_4

    .line 75
    .line 76
    iget-boolean v1, v0, LJ9/Z;->c:Z

    .line 77
    .line 78
    iget-object v2, v0, LJ9/Z;->a:LJ9/Y;

    .line 79
    .line 80
    const/4 v3, 0x1

    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    iget v1, v0, LJ9/Z;->d:I

    .line 84
    .line 85
    add-int/2addr v1, v3

    .line 86
    iput v1, v0, LJ9/Z;->d:I

    .line 87
    .line 88
    const/4 v4, 0x5

    .line 89
    if-lt v1, v4, :cond_2

    .line 90
    .line 91
    const/4 v1, 0x0

    .line 92
    iput-boolean v1, v0, LJ9/Z;->c:Z

    .line 93
    .line 94
    const-string v4, "fresh_install"

    .line 95
    .line 96
    invoke-virtual {v2, v4, v1}, LJ9/Y;->a(Ljava/lang/String;Z)V

    .line 97
    .line 98
    .line 99
    :cond_2
    invoke-virtual {p1}, Lta/o;->e()Lcom/google/protobuf/Internal$ProtobufList;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_4

    .line 112
    .line 113
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Lsa/f;

    .line 118
    .line 119
    invoke-virtual {v1}, Lsa/f;->e()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_3

    .line 124
    .line 125
    iput-boolean v3, v0, LJ9/Z;->b:Z

    .line 126
    .line 127
    const-string p1, "test_device"

    .line 128
    .line 129
    invoke-virtual {v2, p1, v3}, LJ9/Y;->a(Ljava/lang/String;Z)V

    .line 130
    .line 131
    .line 132
    const-string p1, "Setting this device as a test device"

    .line 133
    .line 134
    invoke-static {p1}, Lic/d;->F(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_4
    return-void

    .line 138
    :sswitch_2
    check-cast p1, Lta/o;

    .line 139
    .line 140
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, LJ9/b;

    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    new-instance v1, Ljava/util/HashSet;

    .line 148
    .line 149
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Lta/o;->e()Lcom/google/protobuf/Internal$ProtobufList;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_7

    .line 165
    .line 166
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    check-cast v2, Lsa/f;

    .line 171
    .line 172
    invoke-virtual {v2}, Lsa/f;->h()Lcom/google/protobuf/Internal$ProtobufList;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    :cond_6
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-eqz v3, :cond_5

    .line 185
    .line 186
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    check-cast v3, Lz9/p;

    .line 191
    .line 192
    invoke-virtual {v3}, Lz9/p;->b()Lz9/i;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-virtual {v4}, Lz9/i;->getName()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    if-nez v4, :cond_6

    .line 205
    .line 206
    invoke-virtual {v3}, Lz9/p;->b()Lz9/i;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-virtual {v3}, Lz9/i;->getName()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_7
    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    const/16 v2, 0x32

    .line 223
    .line 224
    if-le p1, v2, :cond_8

    .line 225
    .line 226
    const-string p1, "Too many contextual triggers defined - limiting to 50"

    .line 227
    .line 228
    invoke-static {p1}, Lic/d;->F(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    const-string v2, "Updating contextual triggers for the following analytics events: "

    .line 234
    .line 235
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    invoke-static {p1}, Lic/d;->E(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    iget-object p1, v0, LJ9/b;->c:Lw8/a;

    .line 249
    .line 250
    invoke-interface {p1, v1}, Lw8/a;->c(Ljava/util/HashSet;)V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    nop

    .line 255
    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_2
        0xf -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public b([B)V
    .locals 3

    .line 1
    new-instance v0, Lq5/a;

    .line 2
    .line 3
    sget-object v1, Lq5/e;->a:Lq5/e;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, p1, v1, v2}, Lq5/a;-><init>(Ljava/lang/Object;Lq5/e;Lq5/b;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lm9/B;

    .line 10
    .line 11
    const/16 v1, 0x17

    .line 12
    .line 13
    invoke-direct {p1, v1}, Lm9/B;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, LB8/b;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lt5/q;

    .line 19
    .line 20
    invoke-virtual {v1, v0, p1}, Lt5/q;->a(Lq5/d;Lq5/h;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public f(LO9/b;)V
    .locals 4

    .line 1
    iget v0, p0, LB8/b;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LO9/b;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lca/a;

    .line 11
    .line 12
    check-cast p1, LZ9/k;

    .line 13
    .line 14
    invoke-virtual {p1}, LZ9/k;->a()LZ9/d;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p1, p1, LZ9/d;->l:LVa/Za;

    .line 19
    .line 20
    iget-object v0, p1, LVa/Za;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/util/Set;

    .line 23
    .line 24
    iget-object v1, p0, LB8/b;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, LO8/b;

    .line 27
    .line 28
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    iget-object v0, p1, LVa/Za;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Laa/c;

    .line 34
    .line 35
    invoke-virtual {v0}, Laa/c;->b()Lcom/google/android/gms/tasks/Task;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v2, LA5/g;

    .line 40
    .line 41
    const/16 v3, 0xa

    .line 42
    .line 43
    invoke-direct {v2, p1, v0, v1, v3}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p1, LVa/Za;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 49
    .line 50
    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x3

    .line 54
    const-string v0, "FirebaseCrashlytics"

    .line 55
    .line 56
    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_0

    .line 61
    .line 62
    const-string p1, "Registering RemoteConfig Rollouts subscriber"

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-static {v0, p1, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 66
    .line 67
    .line 68
    :cond_0
    return-void

    .line 69
    :sswitch_0
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, LO8/a;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    const-string v1, "FirebaseCrashlytics"

    .line 77
    .line 78
    const/4 v2, 0x3

    .line 79
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_1

    .line 84
    .line 85
    const-string v2, "Crashlytics native component now available."

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    invoke-static {v1, v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 89
    .line 90
    .line 91
    :cond_1
    invoke-interface {p1}, LO9/b;->get()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast p1, LO8/a;

    .line 96
    .line 97
    iget-object v0, v0, LO8/a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 98
    .line 99
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :sswitch_1
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, LJ9/L;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-interface {p1}, LO9/b;->get()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iput-object p1, v0, LJ9/L;->a:Ljava/lang/Object;

    .line 115
    .line 116
    return-void

    .line 117
    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_1
        0x18 -> :sswitch_0
    .end sparse-switch
.end method

.method public g(LRe/i;)V
    .locals 3

    .line 1
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lxa/d;

    .line 4
    .line 5
    new-instance v1, LB8/b;

    .line 6
    .line 7
    const/16 v2, 0x13

    .line 8
    .line 9
    invoke-direct {v1, p1, v2}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, v0, Lxa/d;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, LJ9/H;

    .line 15
    .line 16
    iput-object v1, p1, LJ9/H;->a:LB8/b;

    .line 17
    .line 18
    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, LB8/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LF5/j;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lf6/u;

    .line 14
    .line 15
    iget v0, v0, Lf6/u;->a:I

    .line 16
    .line 17
    iput v0, p1, LF5/j;->v:I

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    check-cast p1, LF5/j;

    .line 21
    .line 22
    iget v0, p1, LF5/j;->x:I

    .line 23
    .line 24
    iget-object v1, p0, LB8/b;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, LH5/e;

    .line 27
    .line 28
    iget v2, v1, LH5/e;->h:I

    .line 29
    .line 30
    add-int/2addr v0, v2

    .line 31
    iput v0, p1, LF5/j;->x:I

    .line 32
    .line 33
    iget v0, p1, LF5/j;->y:I

    .line 34
    .line 35
    iget v1, v1, LH5/e;->f:I

    .line 36
    .line 37
    add-int/2addr v0, v1

    .line 38
    iput v0, p1, LF5/j;->y:I

    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_1
    check-cast p1, LF5/j;

    .line 42
    .line 43
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, LE5/o;

    .line 46
    .line 47
    iput-object v0, p1, LF5/j;->n:LE5/o;

    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_2
    check-cast p1, LE5/u0;

    .line 51
    .line 52
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, LE5/n;

    .line 55
    .line 56
    invoke-interface {p1, v0}, LE5/u0;->s(LE5/n;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_3
    check-cast p1, LE5/u0;

    .line 61
    .line 62
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, LW5/c;

    .line 65
    .line 66
    invoke-interface {p1, v0}, LE5/u0;->z(LW5/c;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_4
    check-cast p1, LE5/u0;

    .line 71
    .line 72
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, LE5/F;

    .line 75
    .line 76
    iget-object v0, v0, LE5/F;->a:LE5/I;

    .line 77
    .line 78
    iget-object v0, v0, LE5/I;->P:LE5/f0;

    .line 79
    .line 80
    invoke-interface {p1, v0}, LE5/u0;->I(LE5/f0;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_5
    check-cast p1, LE5/u0;

    .line 85
    .line 86
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lh6/c;

    .line 89
    .line 90
    invoke-interface {p1, v0}, LE5/u0;->F(Lh6/c;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_6
    check-cast p1, LE5/u0;

    .line 95
    .line 96
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Lr6/r;

    .line 99
    .line 100
    invoke-interface {p1, v0}, LE5/u0;->v(Lr6/r;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :pswitch_7
    check-cast p1, LE5/u0;

    .line 105
    .line 106
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, LE5/f0;

    .line 109
    .line 110
    invoke-interface {p1, v0}, LE5/u0;->I(LE5/f0;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public o(LC6/l;)Ljava/lang/Object;
    .locals 49

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v9, v1, LB8/b;->a:I

    .line 6
    .line 7
    packed-switch v9, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget v9, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->d:I

    .line 11
    .line 12
    iget-object v9, v1, LB8/b;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v9, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;

    .line 15
    .line 16
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v10

    .line 23
    const-class v12, Ls8/g;

    .line 24
    .line 25
    invoke-virtual {v0, v12}, LC6/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v12

    .line 29
    move-object v14, v12

    .line 30
    check-cast v14, Ls8/g;

    .line 31
    .line 32
    const-class v12, LP9/d;

    .line 33
    .line 34
    invoke-virtual {v0, v12}, LC6/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v12

    .line 38
    check-cast v12, LP9/d;

    .line 39
    .line 40
    const-class v13, LO8/a;

    .line 41
    .line 42
    invoke-virtual {v0, v13}, LC6/l;->g(Ljava/lang/Class;)LL8/r;

    .line 43
    .line 44
    .line 45
    move-result-object v13

    .line 46
    const-class v15, Lw8/d;

    .line 47
    .line 48
    invoke-virtual {v0, v15}, LC6/l;->g(Ljava/lang/Class;)LL8/r;

    .line 49
    .line 50
    .line 51
    move-result-object v15

    .line 52
    const-class v3, Lca/a;

    .line 53
    .line 54
    invoke-virtual {v0, v3}, LC6/l;->g(Ljava/lang/Class;)LL8/r;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const/16 v24, 0x1

    .line 59
    .line 60
    iget-object v7, v9, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:LL8/t;

    .line 61
    .line 62
    invoke-virtual {v0, v7}, LC6/l;->b(LL8/t;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    check-cast v7, Ljava/util/concurrent/ExecutorService;

    .line 67
    .line 68
    iget-object v2, v9, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:LL8/t;

    .line 69
    .line 70
    invoke-virtual {v0, v2}, LC6/l;->b(LL8/t;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Ljava/util/concurrent/ExecutorService;

    .line 75
    .line 76
    iget-object v9, v9, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->c:LL8/t;

    .line 77
    .line 78
    invoke-virtual {v0, v9}, LC6/l;->b(LL8/t;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 83
    .line 84
    invoke-virtual {v14}, Ls8/g;->a()V

    .line 85
    .line 86
    .line 87
    iget-object v9, v14, Ls8/g;->a:Landroid/content/Context;

    .line 88
    .line 89
    const/16 v25, 0x2

    .line 90
    .line 91
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    new-instance v4, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const/16 v26, 0x0

    .line 98
    .line 99
    const-string v8, "Initializing Firebase Crashlytics 19.3.0 for "

    .line 100
    .line 101
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const-string v8, "FirebaseCrashlytics"

    .line 112
    .line 113
    const/4 v6, 0x0

    .line 114
    invoke-static {v8, v4, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 115
    .line 116
    .line 117
    new-instance v4, LS8/f;

    .line 118
    .line 119
    invoke-direct {v4, v7, v2}, LS8/f;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V

    .line 120
    .line 121
    .line 122
    new-instance v2, LX8/c;

    .line 123
    .line 124
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 125
    .line 126
    .line 127
    sget-object v7, LO8/c;->b:LO8/c;

    .line 128
    .line 129
    invoke-virtual {v7, v9}, LO8/c;->e(Landroid/content/Context;)LU8/E0;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    check-cast v7, LU8/b0;

    .line 134
    .line 135
    iget-object v7, v7, LU8/b0;->a:Ljava/lang/String;

    .line 136
    .line 137
    iput-object v7, v2, LX8/c;->a:Ljava/lang/Object;

    .line 138
    .line 139
    invoke-virtual {v9}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    iput-object v6, v2, LX8/c;->b:Ljava/lang/Object;

    .line 144
    .line 145
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result v16

    .line 149
    if-nez v16, :cond_1

    .line 150
    .line 151
    move-object/from16 v23, v4

    .line 152
    .line 153
    new-instance v4, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    move-wide/from16 v27, v10

    .line 156
    .line 157
    const-string v10, ".crashlytics.v3"

    .line 158
    .line 159
    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    sget-object v10, Ljava/io/File;->separator:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    const/16 v11, 0x28

    .line 172
    .line 173
    if-le v10, v11, :cond_0

    .line 174
    .line 175
    invoke-static {v7}, LR8/g;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    goto :goto_0

    .line 180
    :cond_0
    const-string v10, "[^a-zA-Z0-9.]"

    .line 181
    .line 182
    const-string v11, "_"

    .line 183
    .line 184
    invoke-virtual {v7, v10, v11}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    :goto_0
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    goto :goto_1

    .line 196
    :cond_1
    move-object/from16 v23, v4

    .line 197
    .line 198
    move-wide/from16 v27, v10

    .line 199
    .line 200
    const-string v4, ".com.google.firebase.crashlytics.files.v1"

    .line 201
    .line 202
    :goto_1
    new-instance v7, Ljava/io/File;

    .line 203
    .line 204
    invoke-direct {v7, v6, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-static {v7}, LX8/c;->f(Ljava/io/File;)V

    .line 208
    .line 209
    .line 210
    iput-object v7, v2, LX8/c;->c:Ljava/lang/Object;

    .line 211
    .line 212
    new-instance v4, Ljava/io/File;

    .line 213
    .line 214
    const-string v6, "open-sessions"

    .line 215
    .line 216
    invoke-direct {v4, v7, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-static {v4}, LX8/c;->f(Ljava/io/File;)V

    .line 220
    .line 221
    .line 222
    iput-object v4, v2, LX8/c;->d:Ljava/lang/Object;

    .line 223
    .line 224
    new-instance v4, Ljava/io/File;

    .line 225
    .line 226
    const-string v6, "reports"

    .line 227
    .line 228
    invoke-direct {v4, v7, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v4}, LX8/c;->f(Ljava/io/File;)V

    .line 232
    .line 233
    .line 234
    iput-object v4, v2, LX8/c;->e:Ljava/lang/Object;

    .line 235
    .line 236
    new-instance v4, Ljava/io/File;

    .line 237
    .line 238
    const-string v6, "priority-reports"

    .line 239
    .line 240
    invoke-direct {v4, v7, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-static {v4}, LX8/c;->f(Ljava/io/File;)V

    .line 244
    .line 245
    .line 246
    iput-object v4, v2, LX8/c;->f:Ljava/lang/Object;

    .line 247
    .line 248
    new-instance v4, Ljava/io/File;

    .line 249
    .line 250
    const-string v6, "native-reports"

    .line 251
    .line 252
    invoke-direct {v4, v7, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    invoke-static {v4}, LX8/c;->f(Ljava/io/File;)V

    .line 256
    .line 257
    .line 258
    iput-object v4, v2, LX8/c;->g:Ljava/lang/Object;

    .line 259
    .line 260
    new-instance v4, LR0/e;

    .line 261
    .line 262
    invoke-direct {v4, v14}, LR0/e;-><init>(Ls8/g;)V

    .line 263
    .line 264
    .line 265
    new-instance v6, LR8/z;

    .line 266
    .line 267
    invoke-direct {v6, v9, v5, v12, v4}, LR8/z;-><init>(Landroid/content/Context;Ljava/lang/String;LP9/d;LR0/e;)V

    .line 268
    .line 269
    .line 270
    new-instance v5, LO8/a;

    .line 271
    .line 272
    invoke-direct {v5, v13}, LO8/a;-><init>(LL8/r;)V

    .line 273
    .line 274
    .line 275
    new-instance v7, LN8/b;

    .line 276
    .line 277
    invoke-direct {v7, v15}, LN8/b;-><init>(LL8/r;)V

    .line 278
    .line 279
    .line 280
    new-instance v10, LR8/j;

    .line 281
    .line 282
    invoke-direct {v10, v4, v2}, LR8/j;-><init>(LR0/e;LX8/c;)V

    .line 283
    .line 284
    .line 285
    sget-object v11, Lfa/c;->a:Lfa/c;

    .line 286
    .line 287
    sget-object v11, Lfa/d;->a:Lfa/d;

    .line 288
    .line 289
    sget-object v12, Lfa/c;->a:Lfa/c;

    .line 290
    .line 291
    invoke-static {v11}, Lfa/c;->a(Lfa/d;)Lfa/a;

    .line 292
    .line 293
    .line 294
    move-result-object v12

    .line 295
    iget-object v13, v12, Lfa/a;->b:LR8/j;

    .line 296
    .line 297
    const-string v15, "Subscriber "

    .line 298
    .line 299
    move-object/from16 v20, v2

    .line 300
    .line 301
    const-string v2, "SessionsDependencies"

    .line 302
    .line 303
    if-eqz v13, :cond_2

    .line 304
    .line 305
    new-instance v12, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    invoke-direct {v12, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    const-string v11, " already registered."

    .line 314
    .line 315
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v11

    .line 322
    invoke-static {v2, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 323
    .line 324
    .line 325
    goto :goto_2

    .line 326
    :cond_2
    iput-object v10, v12, Lfa/a;->b:LR8/j;

    .line 327
    .line 328
    new-instance v13, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    invoke-direct {v13, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    const-string v11, " registered."

    .line 337
    .line 338
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v11

    .line 345
    invoke-static {v2, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 346
    .line 347
    .line 348
    iget-object v2, v12, Lfa/a;->a:LNf/d;

    .line 349
    .line 350
    const/4 v11, 0x0

    .line 351
    invoke-virtual {v2, v11}, LNf/d;->a(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    :goto_2
    new-instance v2, Lxa/d;

    .line 355
    .line 356
    const/16 v11, 0x13

    .line 357
    .line 358
    invoke-direct {v2, v3, v11}, Lxa/d;-><init>(Ljava/lang/Object;I)V

    .line 359
    .line 360
    .line 361
    new-instance v13, LR8/s;

    .line 362
    .line 363
    new-instance v3, LN8/a;

    .line 364
    .line 365
    invoke-direct {v3, v7}, LN8/a;-><init>(LN8/b;)V

    .line 366
    .line 367
    .line 368
    new-instance v11, LN8/a;

    .line 369
    .line 370
    invoke-direct {v11, v7}, LN8/a;-><init>(LN8/b;)V

    .line 371
    .line 372
    .line 373
    move-object/from16 v22, v2

    .line 374
    .line 375
    move-object/from16 v18, v3

    .line 376
    .line 377
    move-object/from16 v17, v4

    .line 378
    .line 379
    move-object/from16 v16, v5

    .line 380
    .line 381
    move-object v15, v6

    .line 382
    move-object/from16 v21, v10

    .line 383
    .line 384
    move-object/from16 v19, v11

    .line 385
    .line 386
    invoke-direct/range {v13 .. v23}, LR8/s;-><init>(Ls8/g;LR8/z;LO8/a;LR0/e;LN8/a;LN8/a;LX8/c;LR8/j;Lxa/d;LS8/f;)V

    .line 387
    .line 388
    .line 389
    move-object/from16 v4, v17

    .line 390
    .line 391
    move-object/from16 v3, v20

    .line 392
    .line 393
    move-object/from16 v2, v23

    .line 394
    .line 395
    iget-object v5, v13, LR8/s;->p:LS8/f;

    .line 396
    .line 397
    invoke-virtual {v14}, Ls8/g;->a()V

    .line 398
    .line 399
    .line 400
    iget-object v6, v14, Ls8/g;->c:Ls8/l;

    .line 401
    .line 402
    iget-object v6, v6, Ls8/l;->b:Ljava/lang/String;

    .line 403
    .line 404
    const-string v7, "com.google.firebase.crashlytics.mapping_file_id"

    .line 405
    .line 406
    const-string v10, "string"

    .line 407
    .line 408
    invoke-static {v9, v7, v10}, LR8/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 409
    .line 410
    .line 411
    move-result v7

    .line 412
    if-nez v7, :cond_3

    .line 413
    .line 414
    const-string v7, "com.crashlytics.android.build_id"

    .line 415
    .line 416
    invoke-static {v9, v7, v10}, LR8/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 417
    .line 418
    .line 419
    move-result v7

    .line 420
    :cond_3
    if-eqz v7, :cond_4

    .line 421
    .line 422
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 423
    .line 424
    .line 425
    move-result-object v10

    .line 426
    invoke-virtual {v10, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v7

    .line 430
    goto :goto_3

    .line 431
    :cond_4
    const/4 v7, 0x0

    .line 432
    :goto_3
    new-instance v10, Ljava/util/ArrayList;

    .line 433
    .line 434
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 435
    .line 436
    .line 437
    const-string v11, "com.google.firebase.crashlytics.build_ids_lib"

    .line 438
    .line 439
    const-string v12, "array"

    .line 440
    .line 441
    invoke-static {v9, v11, v12}, LR8/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 442
    .line 443
    .line 444
    move-result v11

    .line 445
    const-string v14, "com.google.firebase.crashlytics.build_ids_arch"

    .line 446
    .line 447
    invoke-static {v9, v14, v12}, LR8/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 448
    .line 449
    .line 450
    move-result v14

    .line 451
    move-object/from16 v34, v15

    .line 452
    .line 453
    const-string v15, "com.google.firebase.crashlytics.build_ids_build_id"

    .line 454
    .line 455
    invoke-static {v9, v15, v12}, LR8/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 456
    .line 457
    .line 458
    move-result v12

    .line 459
    if-eqz v11, :cond_5

    .line 460
    .line 461
    if-eqz v14, :cond_5

    .line 462
    .line 463
    if-nez v12, :cond_6

    .line 464
    .line 465
    :cond_5
    move-object/from16 v17, v5

    .line 466
    .line 467
    move-object/from16 v18, v13

    .line 468
    .line 469
    goto/16 :goto_7

    .line 470
    .line 471
    :cond_6
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 472
    .line 473
    .line 474
    move-result-object v15

    .line 475
    invoke-virtual {v15, v11}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v11

    .line 479
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 480
    .line 481
    .line 482
    move-result-object v15

    .line 483
    invoke-virtual {v15, v14}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v14

    .line 487
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 488
    .line 489
    .line 490
    move-result-object v15

    .line 491
    invoke-virtual {v15, v12}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v12

    .line 495
    array-length v15, v11

    .line 496
    array-length v1, v12

    .line 497
    if-ne v15, v1, :cond_7

    .line 498
    .line 499
    array-length v1, v14

    .line 500
    array-length v15, v12

    .line 501
    if-eq v1, v15, :cond_8

    .line 502
    .line 503
    :cond_7
    move-object/from16 v17, v5

    .line 504
    .line 505
    move-object/from16 v18, v13

    .line 506
    .line 507
    goto :goto_6

    .line 508
    :cond_8
    move/from16 v1, v26

    .line 509
    .line 510
    :goto_4
    array-length v15, v12

    .line 511
    if-ge v1, v15, :cond_9

    .line 512
    .line 513
    new-instance v15, LR8/d;

    .line 514
    .line 515
    move/from16 v16, v1

    .line 516
    .line 517
    aget-object v1, v11, v16

    .line 518
    .line 519
    move-object/from16 v17, v5

    .line 520
    .line 521
    aget-object v5, v14, v16

    .line 522
    .line 523
    move-object/from16 v18, v13

    .line 524
    .line 525
    aget-object v13, v12, v16

    .line 526
    .line 527
    invoke-direct {v15, v1, v5, v13}, LR8/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    add-int/lit8 v1, v16, 0x1

    .line 534
    .line 535
    move-object/from16 v5, v17

    .line 536
    .line 537
    move-object/from16 v13, v18

    .line 538
    .line 539
    goto :goto_4

    .line 540
    :cond_9
    move-object/from16 v17, v5

    .line 541
    .line 542
    move-object/from16 v18, v13

    .line 543
    .line 544
    :cond_a
    :goto_5
    const/4 v11, 0x0

    .line 545
    const/4 v12, 0x3

    .line 546
    goto :goto_8

    .line 547
    :goto_6
    array-length v1, v11

    .line 548
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 549
    .line 550
    .line 551
    move-result-object v1

    .line 552
    array-length v5, v14

    .line 553
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 554
    .line 555
    .line 556
    move-result-object v5

    .line 557
    array-length v11, v12

    .line 558
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 559
    .line 560
    .line 561
    move-result-object v11

    .line 562
    const/4 v12, 0x3

    .line 563
    new-array v13, v12, [Ljava/lang/Object;

    .line 564
    .line 565
    aput-object v1, v13, v26

    .line 566
    .line 567
    aput-object v5, v13, v24

    .line 568
    .line 569
    aput-object v11, v13, v25

    .line 570
    .line 571
    const-string v1, "Lengths did not match: %d %d %d"

    .line 572
    .line 573
    invoke-static {v1, v13}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    invoke-static {v8, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 578
    .line 579
    .line 580
    move-result v5

    .line 581
    if-eqz v5, :cond_a

    .line 582
    .line 583
    const/4 v11, 0x0

    .line 584
    invoke-static {v8, v1, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 585
    .line 586
    .line 587
    goto :goto_5

    .line 588
    :goto_7
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 593
    .line 594
    .line 595
    move-result-object v5

    .line 596
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 597
    .line 598
    .line 599
    move-result-object v11

    .line 600
    const/4 v12, 0x3

    .line 601
    new-array v13, v12, [Ljava/lang/Object;

    .line 602
    .line 603
    aput-object v1, v13, v26

    .line 604
    .line 605
    aput-object v5, v13, v24

    .line 606
    .line 607
    aput-object v11, v13, v25

    .line 608
    .line 609
    const-string v1, "Could not find resources: %d %d %d"

    .line 610
    .line 611
    invoke-static {v1, v13}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    invoke-static {v8, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 616
    .line 617
    .line 618
    move-result v5

    .line 619
    if-eqz v5, :cond_b

    .line 620
    .line 621
    const/4 v11, 0x0

    .line 622
    invoke-static {v8, v1, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 623
    .line 624
    .line 625
    goto :goto_8

    .line 626
    :cond_b
    const/4 v11, 0x0

    .line 627
    :goto_8
    const-string v1, "Mapping file ID is: "

    .line 628
    .line 629
    invoke-static {v1, v7}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    invoke-static {v8, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 634
    .line 635
    .line 636
    move-result v5

    .line 637
    if-eqz v5, :cond_c

    .line 638
    .line 639
    invoke-static {v8, v1, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 640
    .line 641
    .line 642
    :cond_c
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    :cond_d
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 647
    .line 648
    .line 649
    move-result v5

    .line 650
    if-eqz v5, :cond_e

    .line 651
    .line 652
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v5

    .line 656
    check-cast v5, LR8/d;

    .line 657
    .line 658
    iget-object v11, v5, LR8/d;->a:Ljava/lang/String;

    .line 659
    .line 660
    const-string v12, "Build id for "

    .line 661
    .line 662
    const-string v13, " on "

    .line 663
    .line 664
    invoke-static {v12, v11, v13}, Lcom/google/android/gms/internal/consent_sdk/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 665
    .line 666
    .line 667
    move-result-object v11

    .line 668
    iget-object v12, v5, LR8/d;->b:Ljava/lang/String;

    .line 669
    .line 670
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 671
    .line 672
    .line 673
    const-string v12, ": "

    .line 674
    .line 675
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 676
    .line 677
    .line 678
    iget-object v5, v5, LR8/d;->c:Ljava/lang/String;

    .line 679
    .line 680
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v5

    .line 687
    const/4 v12, 0x3

    .line 688
    invoke-static {v8, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 689
    .line 690
    .line 691
    move-result v11

    .line 692
    if-eqz v11, :cond_d

    .line 693
    .line 694
    const/4 v11, 0x0

    .line 695
    invoke-static {v8, v5, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 696
    .line 697
    .line 698
    goto :goto_9

    .line 699
    :cond_e
    new-instance v1, LS3/s;

    .line 700
    .line 701
    invoke-direct {v1, v9}, LS3/s;-><init>(Landroid/content/Context;)V

    .line 702
    .line 703
    .line 704
    :try_start_0
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v5

    .line 708
    invoke-virtual/range {v34 .. v34}, LR8/z;->d()Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v11

    .line 712
    invoke-virtual {v9}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 713
    .line 714
    .line 715
    move-result-object v12

    .line 716
    move/from16 v13, v26

    .line 717
    .line 718
    invoke-virtual {v12, v5, v13}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 719
    .line 720
    .line 721
    move-result-object v12

    .line 722
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 723
    .line 724
    const/16 v14, 0x1c

    .line 725
    .line 726
    if-lt v13, v14, :cond_f

    .line 727
    .line 728
    invoke-static {v12}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->d(Landroid/content/pm/PackageInfo;)J

    .line 729
    .line 730
    .line 731
    move-result-wide v13

    .line 732
    invoke-static {v13, v14}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v13

    .line 736
    goto :goto_a

    .line 737
    :cond_f
    iget v13, v12, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 738
    .line 739
    invoke-static {v13}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v13

    .line 743
    :goto_a
    iget-object v12, v12, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 744
    .line 745
    if-nez v12, :cond_10

    .line 746
    .line 747
    const-string v12, "0.0"

    .line 748
    .line 749
    :cond_10
    new-instance v14, LR8/a;

    .line 750
    .line 751
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 752
    .line 753
    .line 754
    iput-object v6, v14, LR8/a;->a:Ljava/lang/Object;

    .line 755
    .line 756
    iput-object v7, v14, LR8/a;->b:Ljava/lang/Object;

    .line 757
    .line 758
    iput-object v10, v14, LR8/a;->g:Ljava/lang/Object;

    .line 759
    .line 760
    iput-object v11, v14, LR8/a;->c:Ljava/lang/Object;

    .line 761
    .line 762
    iput-object v5, v14, LR8/a;->d:Ljava/lang/Object;

    .line 763
    .line 764
    iput-object v13, v14, LR8/a;->e:Ljava/lang/Object;

    .line 765
    .line 766
    iput-object v12, v14, LR8/a;->f:Ljava/lang/Object;

    .line 767
    .line 768
    iput-object v1, v14, LR8/a;->h:Ljava/lang/Object;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 769
    .line 770
    const-string v1, "Installer package name is: "

    .line 771
    .line 772
    invoke-static {v1, v11}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    move/from16 v5, v25

    .line 777
    .line 778
    invoke-static {v8, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 779
    .line 780
    .line 781
    move-result v7

    .line 782
    if-eqz v7, :cond_11

    .line 783
    .line 784
    const/4 v11, 0x0

    .line 785
    invoke-static {v8, v1, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 786
    .line 787
    .line 788
    :cond_11
    new-instance v1, Lx9/d;

    .line 789
    .line 790
    const/16 v5, 0x1c

    .line 791
    .line 792
    invoke-direct {v1, v5}, Lx9/d;-><init>(I)V

    .line 793
    .line 794
    .line 795
    invoke-virtual/range {v34 .. v34}, LR8/z;->d()Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v5

    .line 799
    new-instance v7, Lm9/S;

    .line 800
    .line 801
    const/16 v10, 0x1a

    .line 802
    .line 803
    invoke-direct {v7, v10}, Lm9/S;-><init>(I)V

    .line 804
    .line 805
    .line 806
    new-instance v10, Lxa/d;

    .line 807
    .line 808
    const/16 v11, 0x1d

    .line 809
    .line 810
    invoke-direct {v10, v7, v11}, Lxa/d;-><init>(Ljava/lang/Object;I)V

    .line 811
    .line 812
    .line 813
    new-instance v11, LY9/c;

    .line 814
    .line 815
    invoke-direct {v11, v3}, LY9/c;-><init>(LX8/c;)V

    .line 816
    .line 817
    .line 818
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 819
    .line 820
    const-string v3, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/"

    .line 821
    .line 822
    const-string v15, "/settings"

    .line 823
    .line 824
    invoke-static {v3, v6, v15}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v3

    .line 828
    new-instance v15, LB8/e;

    .line 829
    .line 830
    invoke-direct {v15, v3, v1}, LB8/e;-><init>(Ljava/lang/String;Lx9/d;)V

    .line 831
    .line 832
    .line 833
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 834
    .line 835
    sget-object v3, LR8/z;->h:Ljava/lang/String;

    .line 836
    .line 837
    move-object/from16 v16, v5

    .line 838
    .line 839
    const-string v5, ""

    .line 840
    .line 841
    invoke-virtual {v1, v3, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 846
    .line 847
    move-object/from16 v41, v14

    .line 848
    .line 849
    const-string v14, ""

    .line 850
    .line 851
    invoke-virtual {v5, v3, v14}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v5

    .line 855
    const-string v14, "/"

    .line 856
    .line 857
    invoke-static {v1, v14, v5}, LN0/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v31

    .line 861
    sget-object v1, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    .line 862
    .line 863
    const-string v5, ""

    .line 864
    .line 865
    invoke-virtual {v1, v3, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v32

    .line 869
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 870
    .line 871
    const-string v5, ""

    .line 872
    .line 873
    invoke-virtual {v1, v3, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v33

    .line 877
    const-string v1, "com.google.firebase.crashlytics.mapping_file_id"

    .line 878
    .line 879
    const-string v3, "string"

    .line 880
    .line 881
    invoke-static {v9, v1, v3}, LR8/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 882
    .line 883
    .line 884
    move-result v1

    .line 885
    if-nez v1, :cond_12

    .line 886
    .line 887
    const-string v1, "com.crashlytics.android.build_id"

    .line 888
    .line 889
    invoke-static {v9, v1, v3}, LR8/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 890
    .line 891
    .line 892
    move-result v1

    .line 893
    :cond_12
    if-eqz v1, :cond_13

    .line 894
    .line 895
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 896
    .line 897
    .line 898
    move-result-object v3

    .line 899
    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v1

    .line 903
    goto :goto_b

    .line 904
    :cond_13
    const/4 v1, 0x0

    .line 905
    :goto_b
    filled-new-array {v1, v6, v12, v13}, [Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    move-result-object v1

    .line 909
    new-instance v3, Ljava/util/ArrayList;

    .line 910
    .line 911
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 912
    .line 913
    .line 914
    const/4 v5, 0x0

    .line 915
    :goto_c
    const-string v14, ""

    .line 916
    .line 917
    move-object/from16 v19, v1

    .line 918
    .line 919
    const/4 v1, 0x4

    .line 920
    if-ge v5, v1, :cond_15

    .line 921
    .line 922
    aget-object v1, v19, v5

    .line 923
    .line 924
    move/from16 v20, v5

    .line 925
    .line 926
    if-eqz v1, :cond_14

    .line 927
    .line 928
    const-string v5, "-"

    .line 929
    .line 930
    invoke-virtual {v1, v5, v14}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object v1

    .line 934
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 935
    .line 936
    invoke-virtual {v1, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v1

    .line 940
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 941
    .line 942
    .line 943
    :cond_14
    add-int/lit8 v5, v20, 0x1

    .line 944
    .line 945
    move-object/from16 v1, v19

    .line 946
    .line 947
    goto :goto_c

    .line 948
    :cond_15
    invoke-static {v3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 949
    .line 950
    .line 951
    new-instance v1, Ljava/lang/StringBuilder;

    .line 952
    .line 953
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 957
    .line 958
    .line 959
    move-result-object v3

    .line 960
    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 961
    .line 962
    .line 963
    move-result v5

    .line 964
    if-eqz v5, :cond_16

    .line 965
    .line 966
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v5

    .line 970
    check-cast v5, Ljava/lang/String;

    .line 971
    .line 972
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 973
    .line 974
    .line 975
    goto :goto_d

    .line 976
    :cond_16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v1

    .line 980
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 981
    .line 982
    .line 983
    move-result v3

    .line 984
    if-lez v3, :cond_17

    .line 985
    .line 986
    invoke-static {v1}, LR8/g;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 987
    .line 988
    .line 989
    move-result-object v1

    .line 990
    move-object/from16 v35, v1

    .line 991
    .line 992
    goto :goto_e

    .line 993
    :cond_17
    const/16 v35, 0x0

    .line 994
    .line 995
    :goto_e
    if-eqz v16, :cond_18

    .line 996
    .line 997
    const/4 v1, 0x4

    .line 998
    goto :goto_f

    .line 999
    :cond_18
    move/from16 v1, v24

    .line 1000
    .line 1001
    :goto_f
    new-instance v29, LZ8/c;

    .line 1002
    .line 1003
    invoke-static {v1}, LR8/v;->b(I)I

    .line 1004
    .line 1005
    .line 1006
    move-result v38

    .line 1007
    move-object/from16 v30, v6

    .line 1008
    .line 1009
    move-object/from16 v36, v12

    .line 1010
    .line 1011
    move-object/from16 v37, v13

    .line 1012
    .line 1013
    invoke-direct/range {v29 .. v38}, LZ8/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LR8/z;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1014
    .line 1015
    .line 1016
    move-object/from16 v1, v29

    .line 1017
    .line 1018
    new-instance v3, LK3/r;

    .line 1019
    .line 1020
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1021
    .line 1022
    .line 1023
    new-instance v5, Ljava/util/concurrent/atomic/AtomicReference;

    .line 1024
    .line 1025
    invoke-direct {v5}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 1026
    .line 1027
    .line 1028
    iput-object v5, v3, LK3/r;->h:Ljava/lang/Object;

    .line 1029
    .line 1030
    new-instance v6, Ljava/util/concurrent/atomic/AtomicReference;

    .line 1031
    .line 1032
    new-instance v12, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 1033
    .line 1034
    invoke-direct {v12}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 1035
    .line 1036
    .line 1037
    invoke-direct {v6, v12}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 1038
    .line 1039
    .line 1040
    iput-object v6, v3, LK3/r;->i:Ljava/lang/Object;

    .line 1041
    .line 1042
    iput-object v9, v3, LK3/r;->a:Ljava/lang/Object;

    .line 1043
    .line 1044
    iput-object v1, v3, LK3/r;->b:Ljava/lang/Object;

    .line 1045
    .line 1046
    iput-object v7, v3, LK3/r;->d:Ljava/lang/Object;

    .line 1047
    .line 1048
    iput-object v10, v3, LK3/r;->c:Ljava/lang/Object;

    .line 1049
    .line 1050
    iput-object v11, v3, LK3/r;->e:Ljava/lang/Object;

    .line 1051
    .line 1052
    iput-object v15, v3, LK3/r;->f:Ljava/lang/Object;

    .line 1053
    .line 1054
    iput-object v4, v3, LK3/r;->g:Ljava/lang/Object;

    .line 1055
    .line 1056
    invoke-static {v7}, Lx4/d;->x(Lm9/S;)LZ8/a;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v1

    .line 1060
    invoke-virtual {v5, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 1061
    .line 1062
    .line 1063
    iget-object v1, v3, LK3/r;->a:Ljava/lang/Object;

    .line 1064
    .line 1065
    check-cast v1, Landroid/content/Context;

    .line 1066
    .line 1067
    const-string v4, "com.google.firebase.crashlytics"

    .line 1068
    .line 1069
    const/4 v13, 0x0

    .line 1070
    invoke-virtual {v1, v4, v13}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v1

    .line 1074
    const-string v4, "existing_instance_identifier"

    .line 1075
    .line 1076
    invoke-interface {v1, v4, v14}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v1

    .line 1080
    iget-object v4, v3, LK3/r;->b:Ljava/lang/Object;

    .line 1081
    .line 1082
    check-cast v4, LZ8/c;

    .line 1083
    .line 1084
    iget-object v4, v4, LZ8/c;->f:Ljava/lang/String;

    .line 1085
    .line 1086
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1087
    .line 1088
    .line 1089
    move-result v1

    .line 1090
    iget-object v4, v3, LK3/r;->i:Ljava/lang/Object;

    .line 1091
    .line 1092
    check-cast v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 1093
    .line 1094
    iget-object v5, v3, LK3/r;->h:Ljava/lang/Object;

    .line 1095
    .line 1096
    check-cast v5, Ljava/util/concurrent/atomic/AtomicReference;

    .line 1097
    .line 1098
    if-eqz v1, :cond_19

    .line 1099
    .line 1100
    move/from16 v1, v24

    .line 1101
    .line 1102
    invoke-virtual {v3, v1}, LK3/r;->b(I)LZ8/a;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v6

    .line 1106
    if-eqz v6, :cond_19

    .line 1107
    .line 1108
    invoke-virtual {v5, v6}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 1109
    .line 1110
    .line 1111
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v1

    .line 1115
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 1116
    .line 1117
    invoke-virtual {v1, v6}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 1118
    .line 1119
    .line 1120
    const/4 v11, 0x0

    .line 1121
    invoke-static {v11}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v1

    .line 1125
    goto :goto_10

    .line 1126
    :cond_19
    const/4 v12, 0x3

    .line 1127
    invoke-virtual {v3, v12}, LK3/r;->b(I)LZ8/a;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v1

    .line 1131
    if-eqz v1, :cond_1a

    .line 1132
    .line 1133
    invoke-virtual {v5, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v4

    .line 1140
    check-cast v4, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 1141
    .line 1142
    invoke-virtual {v4, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 1143
    .line 1144
    .line 1145
    :cond_1a
    iget-object v1, v3, LK3/r;->g:Ljava/lang/Object;

    .line 1146
    .line 1147
    check-cast v1, LR0/e;

    .line 1148
    .line 1149
    iget-object v4, v1, LR0/e;->i:Ljava/lang/Object;

    .line 1150
    .line 1151
    check-cast v4, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 1152
    .line 1153
    invoke-virtual {v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v4

    .line 1157
    iget-object v5, v1, LR0/e;->f:Ljava/lang/Object;

    .line 1158
    .line 1159
    monitor-enter v5

    .line 1160
    :try_start_1
    iget-object v1, v1, LR0/e;->g:Ljava/lang/Object;

    .line 1161
    .line 1162
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 1163
    .line 1164
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v1

    .line 1168
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1169
    invoke-static {v4, v1}, LS8/a;->a(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v1

    .line 1173
    new-instance v4, LY2/B;

    .line 1174
    .line 1175
    const/4 v5, 0x1

    .line 1176
    invoke-direct {v4, v5, v3, v2}, LY2/B;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1177
    .line 1178
    .line 1179
    iget-object v2, v2, LS8/f;->a:LS8/c;

    .line 1180
    .line 1181
    invoke-virtual {v1, v2, v4}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v1

    .line 1185
    :goto_10
    new-instance v2, LJ9/x;

    .line 1186
    .line 1187
    const/16 v4, 0x10

    .line 1188
    .line 1189
    invoke-direct {v2, v4}, LJ9/x;-><init>(I)V

    .line 1190
    .line 1191
    .line 1192
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 1193
    .line 1194
    .line 1195
    move-object/from16 v13, v18

    .line 1196
    .line 1197
    iget-object v0, v13, LR8/s;->j:LX8/c;

    .line 1198
    .line 1199
    iget-object v1, v13, LR8/s;->a:Landroid/content/Context;

    .line 1200
    .line 1201
    if-eqz v1, :cond_1c

    .line 1202
    .line 1203
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v2

    .line 1207
    if-eqz v2, :cond_1c

    .line 1208
    .line 1209
    const-string v4, "bool"

    .line 1210
    .line 1211
    const-string v5, "com.crashlytics.RequireBuildId"

    .line 1212
    .line 1213
    invoke-static {v1, v5, v4}, LR8/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 1214
    .line 1215
    .line 1216
    move-result v4

    .line 1217
    if-lez v4, :cond_1b

    .line 1218
    .line 1219
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 1220
    .line 1221
    .line 1222
    move-result v2

    .line 1223
    goto :goto_11

    .line 1224
    :cond_1b
    const-string v2, "string"

    .line 1225
    .line 1226
    invoke-static {v1, v5, v2}, LR8/g;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 1227
    .line 1228
    .line 1229
    move-result v2

    .line 1230
    if-lez v2, :cond_1c

    .line 1231
    .line 1232
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v2

    .line 1236
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v2

    .line 1240
    goto :goto_11

    .line 1241
    :cond_1c
    const/4 v2, 0x1

    .line 1242
    :goto_11
    if-nez v2, :cond_1e

    .line 1243
    .line 1244
    const/4 v5, 0x2

    .line 1245
    invoke-static {v8, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1246
    .line 1247
    .line 1248
    move-result v2

    .line 1249
    if-eqz v2, :cond_1d

    .line 1250
    .line 1251
    const-string v2, "Configured not to require a build ID."

    .line 1252
    .line 1253
    const/4 v11, 0x0

    .line 1254
    invoke-static {v8, v2, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1255
    .line 1256
    .line 1257
    :cond_1d
    move-object/from16 v2, v41

    .line 1258
    .line 1259
    goto :goto_12

    .line 1260
    :cond_1e
    move-object/from16 v2, v41

    .line 1261
    .line 1262
    iget-object v4, v2, LR8/a;->b:Ljava/lang/Object;

    .line 1263
    .line 1264
    check-cast v4, Ljava/lang/String;

    .line 1265
    .line 1266
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1267
    .line 1268
    .line 1269
    move-result v4

    .line 1270
    if-nez v4, :cond_23

    .line 1271
    .line 1272
    :goto_12
    new-instance v4, LR8/e;

    .line 1273
    .line 1274
    invoke-direct {v4}, LR8/e;-><init>()V

    .line 1275
    .line 1276
    .line 1277
    iget-object v4, v4, LR8/e;->a:Ljava/lang/String;

    .line 1278
    .line 1279
    :try_start_2
    new-instance v5, LS3/e;

    .line 1280
    .line 1281
    const-string v6, "crash_marker"

    .line 1282
    .line 1283
    const/4 v7, 0x0

    .line 1284
    const/16 v9, 0x10

    .line 1285
    .line 1286
    invoke-direct {v5, v6, v7, v0, v9}, LS3/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 1287
    .line 1288
    .line 1289
    iput-object v5, v13, LR8/s;->f:LS3/e;

    .line 1290
    .line 1291
    new-instance v5, LS3/e;

    .line 1292
    .line 1293
    const-string v6, "initialization_marker"

    .line 1294
    .line 1295
    invoke-direct {v5, v6, v7, v0, v9}, LS3/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 1296
    .line 1297
    .line 1298
    iput-object v5, v13, LR8/s;->e:LS3/e;

    .line 1299
    .line 1300
    new-instance v5, LX8/c;

    .line 1301
    .line 1302
    move-object/from16 v6, v17

    .line 1303
    .line 1304
    invoke-direct {v5, v4, v0, v6}, LX8/c;-><init>(Ljava/lang/String;LX8/c;LS8/f;)V

    .line 1305
    .line 1306
    .line 1307
    new-instance v7, LT8/e;

    .line 1308
    .line 1309
    invoke-direct {v7, v0}, LT8/e;-><init>(LX8/c;)V

    .line 1310
    .line 1311
    .line 1312
    new-instance v0, LY2/B;

    .line 1313
    .line 1314
    new-instance v9, La9/b;

    .line 1315
    .line 1316
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 1317
    .line 1318
    .line 1319
    const/4 v10, 0x1

    .line 1320
    new-array v10, v10, [La9/c;

    .line 1321
    .line 1322
    const/16 v26, 0x0

    .line 1323
    .line 1324
    aput-object v9, v10, v26

    .line 1325
    .line 1326
    invoke-direct {v0, v10}, LY2/B;-><init>([La9/c;)V

    .line 1327
    .line 1328
    .line 1329
    iget-object v9, v13, LR8/s;->o:Lxa/d;

    .line 1330
    .line 1331
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1332
    .line 1333
    .line 1334
    new-instance v10, LO8/b;

    .line 1335
    .line 1336
    invoke-direct {v10, v5}, LO8/b;-><init>(LX8/c;)V

    .line 1337
    .line 1338
    .line 1339
    new-instance v11, LB8/b;

    .line 1340
    .line 1341
    const/16 v12, 0x19

    .line 1342
    .line 1343
    invoke-direct {v11, v10, v12}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 1344
    .line 1345
    .line 1346
    iget-object v9, v9, Lxa/d;->b:Ljava/lang/Object;

    .line 1347
    .line 1348
    check-cast v9, LL8/r;

    .line 1349
    .line 1350
    invoke-virtual {v9, v11}, LL8/r;->a(LO9/a;)V

    .line 1351
    .line 1352
    .line 1353
    iget-object v9, v13, LR8/s;->a:Landroid/content/Context;

    .line 1354
    .line 1355
    iget-object v10, v13, LR8/s;->i:LR8/z;

    .line 1356
    .line 1357
    iget-object v11, v13, LR8/s;->j:LX8/c;

    .line 1358
    .line 1359
    iget-object v12, v13, LR8/s;->c:LS3/s;

    .line 1360
    .line 1361
    iget-object v14, v13, LR8/s;->m:LR8/j;

    .line 1362
    .line 1363
    iget-object v15, v13, LR8/s;->p:LS8/f;

    .line 1364
    .line 1365
    move-object/from16 v41, v0

    .line 1366
    .line 1367
    move-object/from16 v38, v2

    .line 1368
    .line 1369
    move-object/from16 v42, v3

    .line 1370
    .line 1371
    move-object/from16 v40, v5

    .line 1372
    .line 1373
    move-object/from16 v39, v7

    .line 1374
    .line 1375
    move-object/from16 v35, v9

    .line 1376
    .line 1377
    move-object/from16 v36, v10

    .line 1378
    .line 1379
    move-object/from16 v37, v11

    .line 1380
    .line 1381
    move-object/from16 v43, v12

    .line 1382
    .line 1383
    move-object/from16 v44, v14

    .line 1384
    .line 1385
    move-object/from16 v45, v15

    .line 1386
    .line 1387
    invoke-static/range {v35 .. v45}, LD6/o;->d(Landroid/content/Context;LR8/z;LX8/c;LR8/a;LT8/e;LX8/c;LY2/B;LK3/r;LS3/s;LR8/j;LS8/f;)LD6/o;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v44

    .line 1391
    move-object/from16 v41, v38

    .line 1392
    .line 1393
    move-object/from16 v43, v39

    .line 1394
    .line 1395
    move-object/from16 v0, v42

    .line 1396
    .line 1397
    move-object/from16 v42, v40

    .line 1398
    .line 1399
    new-instance v35, LR8/m;

    .line 1400
    .line 1401
    iget-object v2, v13, LR8/s;->a:Landroid/content/Context;

    .line 1402
    .line 1403
    iget-object v3, v13, LR8/s;->i:LR8/z;

    .line 1404
    .line 1405
    iget-object v5, v13, LR8/s;->b:LR0/e;

    .line 1406
    .line 1407
    iget-object v7, v13, LR8/s;->j:LX8/c;

    .line 1408
    .line 1409
    iget-object v9, v13, LR8/s;->f:LS3/e;

    .line 1410
    .line 1411
    iget-object v10, v13, LR8/s;->n:LO8/a;

    .line 1412
    .line 1413
    iget-object v11, v13, LR8/s;->l:LN8/a;

    .line 1414
    .line 1415
    iget-object v12, v13, LR8/s;->m:LR8/j;

    .line 1416
    .line 1417
    iget-object v14, v13, LR8/s;->p:LS8/f;

    .line 1418
    .line 1419
    move-object/from16 v36, v2

    .line 1420
    .line 1421
    move-object/from16 v37, v3

    .line 1422
    .line 1423
    move-object/from16 v38, v5

    .line 1424
    .line 1425
    move-object/from16 v39, v7

    .line 1426
    .line 1427
    move-object/from16 v40, v9

    .line 1428
    .line 1429
    move-object/from16 v45, v10

    .line 1430
    .line 1431
    move-object/from16 v46, v11

    .line 1432
    .line 1433
    move-object/from16 v47, v12

    .line 1434
    .line 1435
    move-object/from16 v48, v14

    .line 1436
    .line 1437
    invoke-direct/range {v35 .. v48}, LR8/m;-><init>(Landroid/content/Context;LR8/z;LR0/e;LX8/c;LS3/e;LR8/a;LX8/c;LT8/e;LD6/o;LO8/a;LN8/a;LR8/j;LS8/f;)V

    .line 1438
    .line 1439
    .line 1440
    move-object/from16 v2, v35

    .line 1441
    .line 1442
    iput-object v2, v13, LR8/s;->h:LR8/m;

    .line 1443
    .line 1444
    iget-object v2, v13, LR8/s;->e:LS3/e;

    .line 1445
    .line 1446
    iget-object v3, v2, LS3/e;->b:Ljava/lang/Object;

    .line 1447
    .line 1448
    check-cast v3, Ljava/lang/String;

    .line 1449
    .line 1450
    iget-object v2, v2, LS3/e;->c:Ljava/lang/Object;

    .line 1451
    .line 1452
    check-cast v2, LX8/c;

    .line 1453
    .line 1454
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1455
    .line 1456
    .line 1457
    new-instance v5, Ljava/io/File;

    .line 1458
    .line 1459
    iget-object v2, v2, LX8/c;->c:Ljava/lang/Object;

    .line 1460
    .line 1461
    check-cast v2, Ljava/io/File;

    .line 1462
    .line 1463
    invoke-direct {v5, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 1467
    .line 1468
    .line 1469
    move-result v2

    .line 1470
    iget-object v3, v6, LS8/f;->a:LS8/c;

    .line 1471
    .line 1472
    iget-object v3, v3, LS8/c;->a:Ljava/util/concurrent/ExecutorService;

    .line 1473
    .line 1474
    new-instance v5, LG8/c;

    .line 1475
    .line 1476
    const/4 v7, 0x4

    .line 1477
    invoke-direct {v5, v13, v7}, LG8/c;-><init>(Ljava/lang/Object;I)V

    .line 1478
    .line 1479
    .line 1480
    invoke-interface {v3, v5}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 1484
    :try_start_3
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1485
    .line 1486
    const-wide/16 v9, 0x3

    .line 1487
    .line 1488
    invoke-interface {v3, v9, v10, v5}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v3

    .line 1492
    check-cast v3, Ljava/lang/Boolean;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 1493
    .line 1494
    :try_start_4
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1495
    .line 1496
    invoke-virtual {v5, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 1497
    .line 1498
    .line 1499
    move-result v3

    .line 1500
    iput-boolean v3, v13, LR8/s;->g:Z

    .line 1501
    .line 1502
    goto :goto_13

    .line 1503
    :catch_0
    const/4 v7, 0x0

    .line 1504
    iput-boolean v7, v13, LR8/s;->g:Z

    .line 1505
    .line 1506
    :goto_13
    iget-object v3, v13, LR8/s;->h:LR8/m;

    .line 1507
    .line 1508
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v5

    .line 1512
    iput-object v0, v3, LR8/m;->o:LK3/r;

    .line 1513
    .line 1514
    iget-object v7, v3, LR8/m;->e:LS8/f;

    .line 1515
    .line 1516
    iget-object v7, v7, LS8/f;->a:LS8/c;

    .line 1517
    .line 1518
    new-instance v9, LC8/d;

    .line 1519
    .line 1520
    const/16 v14, 0x1c

    .line 1521
    .line 1522
    invoke-direct {v9, v14, v3, v4}, LC8/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1523
    .line 1524
    .line 1525
    invoke-virtual {v7, v9}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 1526
    .line 1527
    .line 1528
    new-instance v4, LY9/c;

    .line 1529
    .line 1530
    const/16 v7, 0x16

    .line 1531
    .line 1532
    invoke-direct {v4, v3, v7}, LY9/c;-><init>(Ljava/lang/Object;I)V

    .line 1533
    .line 1534
    .line 1535
    new-instance v7, LR8/u;

    .line 1536
    .line 1537
    iget-object v9, v3, LR8/m;->j:LO8/a;

    .line 1538
    .line 1539
    invoke-direct {v7, v4, v0, v5, v9}, LR8/u;-><init>(LY9/c;LK3/r;Ljava/lang/Thread$UncaughtExceptionHandler;LO8/a;)V

    .line 1540
    .line 1541
    .line 1542
    iput-object v7, v3, LR8/m;->n:LR8/u;

    .line 1543
    .line 1544
    invoke-static {v7}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 1545
    .line 1546
    .line 1547
    if-eqz v2, :cond_1f

    .line 1548
    .line 1549
    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    .line 1550
    .line 1551
    invoke-virtual {v1, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    .line 1552
    .line 1553
    .line 1554
    move-result v2

    .line 1555
    if-nez v2, :cond_20

    .line 1556
    .line 1557
    const-string v2, "connectivity"

    .line 1558
    .line 1559
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v1

    .line 1563
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 1564
    .line 1565
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v1

    .line 1569
    if-eqz v1, :cond_1f

    .line 1570
    .line 1571
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    .line 1572
    .line 1573
    .line 1574
    move-result v1

    .line 1575
    if-eqz v1, :cond_1f

    .line 1576
    .line 1577
    goto :goto_14

    .line 1578
    :cond_1f
    const/4 v12, 0x3

    .line 1579
    goto :goto_15

    .line 1580
    :cond_20
    :goto_14
    const-string v1, "Crashlytics did not finish previous background initialization. Initializing synchronously."

    .line 1581
    .line 1582
    const/4 v12, 0x3

    .line 1583
    invoke-static {v8, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1584
    .line 1585
    .line 1586
    move-result v2

    .line 1587
    if-eqz v2, :cond_21

    .line 1588
    .line 1589
    const/4 v11, 0x0

    .line 1590
    invoke-static {v8, v1, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1591
    .line 1592
    .line 1593
    :cond_21
    invoke-virtual {v13, v0}, LR8/s;->b(LK3/r;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 1594
    .line 1595
    .line 1596
    goto :goto_17

    .line 1597
    :catch_1
    move-exception v0

    .line 1598
    goto :goto_16

    .line 1599
    :goto_15
    invoke-static {v8, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1600
    .line 1601
    .line 1602
    move-result v1

    .line 1603
    if-eqz v1, :cond_22

    .line 1604
    .line 1605
    const-string v1, "Successfully configured exception handler."

    .line 1606
    .line 1607
    const/4 v11, 0x0

    .line 1608
    invoke-static {v8, v1, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1609
    .line 1610
    .line 1611
    :cond_22
    new-instance v1, LR8/n;

    .line 1612
    .line 1613
    const/4 v7, 0x0

    .line 1614
    invoke-direct {v1, v13, v0, v7}, LR8/n;-><init>(LR8/s;LK3/r;I)V

    .line 1615
    .line 1616
    .line 1617
    iget-object v0, v6, LS8/f;->a:LS8/c;

    .line 1618
    .line 1619
    invoke-virtual {v0, v1}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 1620
    .line 1621
    .line 1622
    goto :goto_17

    .line 1623
    :goto_16
    const-string v1, "Crashlytics was not started due to an exception during initialization"

    .line 1624
    .line 1625
    invoke-static {v8, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1626
    .line 1627
    .line 1628
    const/4 v11, 0x0

    .line 1629
    iput-object v11, v13, LR8/s;->h:LR8/m;

    .line 1630
    .line 1631
    :goto_17
    new-instance v11, LN8/c;

    .line 1632
    .line 1633
    invoke-direct {v11, v13}, LN8/c;-><init>(LR8/s;)V

    .line 1634
    .line 1635
    .line 1636
    goto :goto_18

    .line 1637
    :cond_23
    const-string v0, "."

    .line 1638
    .line 1639
    invoke-static {v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1640
    .line 1641
    .line 1642
    const-string v1, ".     |  | "

    .line 1643
    .line 1644
    invoke-static {v8, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1645
    .line 1646
    .line 1647
    const-string v1, ".     |  |"

    .line 1648
    .line 1649
    invoke-static {v8, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1650
    .line 1651
    .line 1652
    invoke-static {v8, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1653
    .line 1654
    .line 1655
    const-string v2, ".   \\ |  | /"

    .line 1656
    .line 1657
    invoke-static {v8, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1658
    .line 1659
    .line 1660
    const-string v2, ".    \\    /"

    .line 1661
    .line 1662
    invoke-static {v8, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1663
    .line 1664
    .line 1665
    const-string v2, ".     \\  /"

    .line 1666
    .line 1667
    invoke-static {v8, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1668
    .line 1669
    .line 1670
    const-string v2, ".      \\/"

    .line 1671
    .line 1672
    invoke-static {v8, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1673
    .line 1674
    .line 1675
    invoke-static {v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1676
    .line 1677
    .line 1678
    const-string v2, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"

    .line 1679
    .line 1680
    invoke-static {v8, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1681
    .line 1682
    .line 1683
    invoke-static {v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1684
    .line 1685
    .line 1686
    const-string v3, ".      /\\"

    .line 1687
    .line 1688
    invoke-static {v8, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1689
    .line 1690
    .line 1691
    const-string v3, ".     /  \\"

    .line 1692
    .line 1693
    invoke-static {v8, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1694
    .line 1695
    .line 1696
    const-string v3, ".    /    \\"

    .line 1697
    .line 1698
    invoke-static {v8, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1699
    .line 1700
    .line 1701
    const-string v3, ".   / |  | \\"

    .line 1702
    .line 1703
    invoke-static {v8, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1704
    .line 1705
    .line 1706
    invoke-static {v8, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1707
    .line 1708
    .line 1709
    invoke-static {v8, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1710
    .line 1711
    .line 1712
    invoke-static {v8, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1713
    .line 1714
    .line 1715
    invoke-static {v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1716
    .line 1717
    .line 1718
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1719
    .line 1720
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1721
    .line 1722
    .line 1723
    throw v0

    .line 1724
    :catchall_0
    move-exception v0

    .line 1725
    :try_start_5
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1726
    throw v0

    .line 1727
    :catch_2
    move-exception v0

    .line 1728
    const-string v1, "Error retrieving app package info."

    .line 1729
    .line 1730
    invoke-static {v8, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1731
    .line 1732
    .line 1733
    const/4 v11, 0x0

    .line 1734
    :goto_18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1735
    .line 1736
    .line 1737
    move-result-wide v0

    .line 1738
    sub-long v0, v0, v27

    .line 1739
    .line 1740
    const-wide/16 v2, 0x10

    .line 1741
    .line 1742
    cmp-long v2, v0, v2

    .line 1743
    .line 1744
    if-lez v2, :cond_24

    .line 1745
    .line 1746
    const-string v2, "Initializing Crashlytics blocked main for "

    .line 1747
    .line 1748
    const-string v3, " ms"

    .line 1749
    .line 1750
    invoke-static {v0, v1, v2, v3}, Lcb/a;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v0

    .line 1754
    const/4 v12, 0x3

    .line 1755
    invoke-static {v8, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1756
    .line 1757
    .line 1758
    move-result v1

    .line 1759
    if-eqz v1, :cond_24

    .line 1760
    .line 1761
    const/4 v1, 0x0

    .line 1762
    invoke-static {v8, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1763
    .line 1764
    .line 1765
    :cond_24
    return-object v11

    .line 1766
    :pswitch_0
    iget-object v2, v1, LB8/b;->b:Ljava/lang/Object;

    .line 1767
    .line 1768
    check-cast v2, Lcom/google/firebase/inappmessaging/display/FirebaseInAppMessagingDisplayRegistrar;

    .line 1769
    .line 1770
    invoke-static {v2, v0}, Lcom/google/firebase/inappmessaging/display/FirebaseInAppMessagingDisplayRegistrar;->a(Lcom/google/firebase/inappmessaging/display/FirebaseInAppMessagingDisplayRegistrar;LC6/l;)LB9/f;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v0

    .line 1774
    return-object v0

    .line 1775
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    .line 1
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, LB8/b;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v1, LPc/d;->i:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    check-cast v0, LPc/q;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, LPc/q;->success()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v0, p1}, LPc/q;->b(Ljava/lang/Exception;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-void

    .line 34
    :pswitch_0
    sget-object v1, LPc/d;->i:Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    check-cast v0, LPc/p;

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, LK8/T;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->i0(LK8/T;)LPc/M;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v0, p1}, LPc/p;->a(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v0, p1}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_0
    .end packed-switch
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 6

    .line 1
    iget-object p1, p0, LB8/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, LC8/h;

    .line 4
    .line 5
    invoke-virtual {p1}, LC8/h;->a()V

    .line 6
    .line 7
    .line 8
    iget-wide v0, p1, LC8/h;->e:J

    .line 9
    .line 10
    const-wide/16 v2, -0x1

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const-wide/16 v0, 0x1e

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-wide v0, p1, LC8/h;->e:J

    .line 20
    .line 21
    const-wide/16 v2, 0x2

    .line 22
    .line 23
    mul-long/2addr v0, v2

    .line 24
    const-wide/16 v4, 0x3c0

    .line 25
    .line 26
    cmp-long v0, v0, v4

    .line 27
    .line 28
    if-gez v0, :cond_1

    .line 29
    .line 30
    iget-wide v0, p1, LC8/h;->e:J

    .line 31
    .line 32
    mul-long/2addr v0, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-wide v0, v4

    .line 35
    :goto_0
    iput-wide v0, p1, LC8/h;->e:J

    .line 36
    .line 37
    iget-object v0, p1, LC8/h;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 38
    .line 39
    new-instance v1, LC8/g;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-direct {v1, p1, v2}, LC8/g;-><init>(Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    iget-wide v2, p1, LC8/h;->e:J

    .line 46
    .line 47
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 48
    .line 49
    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p1, LC8/h;->d:Ljava/util/concurrent/ScheduledFuture;

    .line 54
    .line 55
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    check-cast v0, Lcom/vungle/ads/internal/platform/c;

    check-cast p1, Lcom/google/android/gms/appset/AppSetIdInfo;

    invoke-static {v0, p1}, Lcom/vungle/ads/internal/platform/c;->a(Lcom/vungle/ads/internal/platform/c;Lcom/google/android/gms/appset/AppSetIdInfo;)V

    return-void
.end method

.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 11

    .line 1
    iget v0, p0, LB8/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LC8/f;

    .line 9
    .line 10
    check-cast p1, LC8/b;

    .line 11
    .line 12
    iget-object v1, v0, LC8/f;->i:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    new-instance v2, LC8/d;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v2, v3, v0, p1}, LC8/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, LC8/f;->m:LC8/b;

    .line 24
    .line 25
    iget-object v1, v0, LC8/f;->f:LC8/n;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    instance-of v2, p1, LC8/b;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    move-object v2, p1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v2, p1, LC8/b;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v2}, LC8/b;->b(Ljava/lang/String;)LC8/b;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    :goto_0
    iget-wide v3, v2, LC8/b;->b:J

    .line 43
    .line 44
    iget-wide v5, v2, LC8/b;->c:J

    .line 45
    .line 46
    long-to-double v5, v5

    .line 47
    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    .line 48
    .line 49
    mul-double/2addr v5, v7

    .line 50
    double-to-long v5, v5

    .line 51
    add-long/2addr v3, v5

    .line 52
    const-wide/32 v5, 0x493e0

    .line 53
    .line 54
    .line 55
    add-long/2addr v3, v5

    .line 56
    iput-wide v3, v1, LC8/n;->e:J

    .line 57
    .line 58
    iget-wide v3, v1, LC8/n;->e:J

    .line 59
    .line 60
    iget-wide v5, v2, LC8/b;->b:J

    .line 61
    .line 62
    iget-wide v7, v2, LC8/b;->c:J

    .line 63
    .line 64
    add-long v9, v5, v7

    .line 65
    .line 66
    cmp-long v2, v3, v9

    .line 67
    .line 68
    if-lez v2, :cond_1

    .line 69
    .line 70
    add-long/2addr v5, v7

    .line 71
    const-wide/32 v2, 0xea60

    .line 72
    .line 73
    .line 74
    sub-long/2addr v5, v2

    .line 75
    iput-wide v5, v1, LC8/n;->e:J

    .line 76
    .line 77
    :cond_1
    invoke-virtual {v1}, LC8/n;->b()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_2

    .line 82
    .line 83
    iget-object v2, v1, LC8/n;->a:LC8/h;

    .line 84
    .line 85
    iget-wide v3, v1, LC8/n;->e:J

    .line 86
    .line 87
    iget-object v1, v1, LC8/n;->b:Lza/a;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 93
    .line 94
    .line 95
    move-result-wide v5

    .line 96
    sub-long/2addr v3, v5

    .line 97
    invoke-virtual {v2, v3, v4}, LC8/h;->b(J)V

    .line 98
    .line 99
    .line 100
    :cond_2
    iget-object v1, v0, LC8/f;->d:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_3

    .line 111
    .line 112
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, LOc/c;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance v3, Ljava/util/HashMap;

    .line 122
    .line 123
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 124
    .line 125
    .line 126
    iget-object v4, p1, LC8/b;->a:Ljava/lang/String;

    .line 127
    .line 128
    const-string v5, "token"

    .line 129
    .line 130
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    iget-object v2, v2, LOc/c;->a:Luc/h;

    .line 134
    .line 135
    invoke-virtual {v2, v3}, Luc/h;->a(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_3
    invoke-static {p1}, LC8/c;->a(LC8/b;)LC8/c;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget-object v0, v0, LC8/f;->c:Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_4

    .line 154
    .line 155
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    check-cast v2, Ln9/a;

    .line 160
    .line 161
    invoke-virtual {v2, v1}, Ln9/a;->a(LC8/c;)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_4
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    return-object p1

    .line 170
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 171
    .line 172
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, LB8/d;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    new-instance v1, LB8/e;

    .line 180
    .line 181
    const/4 v2, 0x0

    .line 182
    invoke-direct {v1, p1, v2}, LB8/e;-><init>(Ljava/lang/String;I)V

    .line 183
    .line 184
    .line 185
    new-instance p1, LB8/c;

    .line 186
    .line 187
    invoke-direct {p1, v2, v0, v1}, LB8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    iget-object v0, v0, LB8/d;->c:Ljava/util/concurrent/Executor;

    .line 191
    .line 192
    invoke-static {v0, p1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    return-object p1

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public v(Landroid/view/View;Lk1/v0;)Lk1/v0;
    .locals 1

    .line 1
    iget-object v0, p0, LB8/b;->b:Ljava/lang/Object;

    check-cast v0, Lcom/vungle/ads/internal/ui/l;

    invoke-static {v0, p1, p2}, Lcom/vungle/ads/internal/ui/l;->a(Lcom/vungle/ads/internal/ui/l;Landroid/view/View;Lk1/v0;)Lk1/v0;

    move-result-object p1

    return-object p1
.end method
