.class public final synthetic LPc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements Luc/b;
.implements Lk8/h;
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LPc/b;->a:I

    iput-object p1, p0, LPc/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, LR5/n;

    iget-object v0, p0, LPc/b;->b:Ljava/lang/Object;

    check-cast v0, LR5/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method

.method public e(Ljava/lang/Object;Lba/a;)V
    .locals 11

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/String;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, LPc/J;

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ljava/lang/String;

    .line 28
    .line 29
    new-instance v3, LPc/p;

    .line 30
    .line 31
    const/16 v4, 0x9

    .line 32
    .line 33
    invoke-direct {v3, v0, p2, v4}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 34
    .line 35
    .line 36
    iget-object p2, p0, LPc/b;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p2, LPc/u;

    .line 39
    .line 40
    check-cast p2, LPc/k;

    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget-object p2, LPc/k;->c:Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    check-cast p2, LK8/i;

    .line 52
    .line 53
    if-nez p2, :cond_0

    .line 54
    .line 55
    new-instance p1, Ljava/lang/Exception;

    .line 56
    .line 57
    const-string p2, "Resolver not found"

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v3, p1}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_0
    if-eqz v2, :cond_1

    .line 71
    .line 72
    iget-object p1, v2, LPc/J;->a:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v0, v2, LPc/J;->b:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {p1, v0}, LJ8/u;->Y(Ljava/lang/String;Ljava/lang/String;)LJ8/u;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-instance v0, LJ8/y;

    .line 81
    .line 82
    invoke-direct {v0, p1}, LJ8/y;-><init>(LJ8/u;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    sget-object v0, LPc/k;->d:Ljava/util/HashMap;

    .line 87
    .line 88
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    move-object v0, p1

    .line 93
    check-cast v0, LJ8/s;

    .line 94
    .line 95
    :goto_0
    iget-object p1, p2, LK8/i;->c:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {p1}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p1}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iget-object v1, p2, LK8/i;->b:LK8/j;

    .line 112
    .line 113
    invoke-static {v1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    instance-of v2, v0, LJ8/y;

    .line 117
    .line 118
    iget-object v6, p2, LK8/i;->e:LK8/e;

    .line 119
    .line 120
    if-eqz v2, :cond_2

    .line 121
    .line 122
    move-object v7, v0

    .line 123
    check-cast v7, LJ8/y;

    .line 124
    .line 125
    iget-object v8, v1, LK8/j;->b:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v8}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    new-instance v9, LJ8/g;

    .line 131
    .line 132
    invoke-direct {v9, p1}, LJ8/g;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 133
    .line 134
    .line 135
    iget-object v4, p1, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 136
    .line 137
    iget-object v5, p1, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 138
    .line 139
    invoke-virtual/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;LJ8/o;LJ8/y;Ljava/lang/String;LK8/J;)Lcom/google/android/gms/tasks/Task;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    goto :goto_1

    .line 144
    :cond_2
    instance-of v2, v0, LJ8/B;

    .line 145
    .line 146
    if-eqz v2, :cond_3

    .line 147
    .line 148
    move-object v7, v0

    .line 149
    check-cast v7, LJ8/B;

    .line 150
    .line 151
    iget-object v8, v1, LK8/j;->b:Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v8}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    iget-object v9, p1, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 157
    .line 158
    new-instance v10, LJ8/g;

    .line 159
    .line 160
    invoke-direct {v10, p1}, LJ8/g;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 161
    .line 162
    .line 163
    iget-object v4, p1, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 164
    .line 165
    iget-object v5, p1, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 166
    .line 167
    invoke-virtual/range {v4 .. v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;LJ8/o;LJ8/B;Ljava/lang/String;Ljava/lang/String;LK8/J;)Lcom/google/android/gms/tasks/Task;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    :goto_1
    new-instance v0, LK8/b;

    .line 172
    .line 173
    const/4 v1, 0x2

    .line 174
    invoke-direct {v0, p2, v1}, LK8/b;-><init>(Ljava/lang/Object;I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    new-instance p2, LPc/b;

    .line 182
    .line 183
    const/16 v0, 0x11

    .line 184
    .line 185
    invoke-direct {p2, v3, v0}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 193
    .line 194
    const-string p2, "multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion."

    .line 195
    .line 196
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw p1
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LPc/b;->b:Ljava/lang/Object;

    .line 3
    .line 4
    iget v2, p0, LPc/b;->a:I

    .line 5
    .line 6
    packed-switch v2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, LQc/c;->c:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    check-cast v1, LQc/h;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v1, p1}, LQc/h;->a(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {v1, p1}, LQc/h;->b(Ljava/lang/Exception;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    return-void

    .line 35
    :pswitch_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    check-cast v1, LPc/q;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, LK8/B;

    .line 48
    .line 49
    sget-object v0, LPc/l;->a:Ljava/util/HashMap;

    .line 50
    .line 51
    iget-object v2, p1, LK8/B;->a:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    iget v0, p1, LK8/B;->d:I

    .line 57
    .line 58
    int-to-long v2, v0

    .line 59
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget v2, p1, LK8/B;->c:I

    .line 64
    .line 65
    int-to-long v2, v2

    .line 66
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    iget-wide v3, p1, LK8/B;->e:J

    .line 71
    .line 72
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    new-instance v4, LPc/L;

    .line 77
    .line 78
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object v0, v4, LPc/L;->a:Ljava/lang/Long;

    .line 82
    .line 83
    iput-object v2, v4, LPc/L;->b:Ljava/lang/Long;

    .line 84
    .line 85
    iput-object v3, v4, LPc/L;->c:Ljava/lang/Long;

    .line 86
    .line 87
    iget-object v0, p1, LK8/B;->b:Ljava/lang/String;

    .line 88
    .line 89
    iput-object v0, v4, LPc/L;->d:Ljava/lang/String;

    .line 90
    .line 91
    iget-object p1, p1, LK8/B;->a:Ljava/lang/String;

    .line 92
    .line 93
    if-eqz p1, :cond_1

    .line 94
    .line 95
    iput-object p1, v4, LPc/L;->e:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v1, v4}, LPc/q;->a(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 102
    .line 103
    const-string v0, "Nonnull field \"secretKey\" is null."

    .line 104
    .line 105
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p1

    .line 109
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {v1, p1}, LPc/q;->b(Ljava/lang/Exception;)V

    .line 118
    .line 119
    .line 120
    :goto_1
    return-void

    .line 121
    :pswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    check-cast v1, LPc/o;

    .line 126
    .line 127
    if-eqz v0, :cond_3

    .line 128
    .line 129
    invoke-virtual {v1}, LPc/o;->success()V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {v1, p1}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 142
    .line 143
    .line 144
    :goto_2
    return-void

    .line 145
    :pswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    check-cast v1, LPc/o;

    .line 150
    .line 151
    if-eqz v0, :cond_4

    .line 152
    .line 153
    invoke-virtual {v1}, LPc/o;->success()V

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {v1, p1}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 166
    .line 167
    .line 168
    :goto_3
    return-void

    .line 169
    :pswitch_3
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    check-cast v1, LPc/p;

    .line 174
    .line 175
    if-eqz v0, :cond_5

    .line 176
    .line 177
    invoke-virtual {v1}, LPc/p;->success()V

    .line 178
    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_5
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-virtual {v1, p1}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 190
    .line 191
    .line 192
    :goto_4
    return-void

    .line 193
    :pswitch_4
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    check-cast v1, LPc/q;

    .line 198
    .line 199
    if-eqz v0, :cond_7

    .line 200
    .line 201
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    check-cast p1, LK8/j;

    .line 206
    .line 207
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    sget-object v2, LPc/k;->b:Ljava/util/HashMap;

    .line 216
    .line 217
    invoke-virtual {v2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    new-instance p1, LPc/I;

    .line 221
    .line 222
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 223
    .line 224
    .line 225
    if-eqz v0, :cond_6

    .line 226
    .line 227
    iput-object v0, p1, LPc/I;->a:Ljava/lang/String;

    .line 228
    .line 229
    invoke-virtual {v1, p1}, LPc/q;->a(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 234
    .line 235
    const-string v0, "Nonnull field \"id\" is null."

    .line 236
    .line 237
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw p1

    .line 241
    :cond_7
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-virtual {v1, p1}, LPc/q;->b(Ljava/lang/Exception;)V

    .line 250
    .line 251
    .line 252
    :goto_5
    return-void

    .line 253
    :pswitch_5
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    check-cast v1, LPc/p;

    .line 258
    .line 259
    if-eqz v0, :cond_8

    .line 260
    .line 261
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    check-cast p1, LK8/T;

    .line 266
    .line 267
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->i0(LK8/T;)LPc/M;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    invoke-virtual {v1, p1}, LPc/p;->a(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_8
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    invoke-virtual {v1, p1}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 284
    .line 285
    .line 286
    :goto_6
    return-void

    .line 287
    :pswitch_6
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    check-cast v1, LPc/o;

    .line 292
    .line 293
    if-eqz v0, :cond_9

    .line 294
    .line 295
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    check-cast p1, LK8/T;

    .line 300
    .line 301
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->i0(LK8/T;)LPc/M;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-virtual {v1, p1}, LPc/o;->a(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    goto :goto_7

    .line 309
    :cond_9
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-virtual {v1, p1}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 318
    .line 319
    .line 320
    :goto_7
    return-void

    .line 321
    :pswitch_7
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    check-cast v1, LPc/p;

    .line 326
    .line 327
    if-eqz v0, :cond_a

    .line 328
    .line 329
    invoke-virtual {v1}, LPc/p;->success()V

    .line 330
    .line 331
    .line 332
    goto :goto_8

    .line 333
    :cond_a
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    invoke-virtual {v1, p1}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 342
    .line 343
    .line 344
    :goto_8
    return-void

    .line 345
    :pswitch_8
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    check-cast v1, LPc/o;

    .line 350
    .line 351
    if-eqz v2, :cond_b

    .line 352
    .line 353
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    check-cast p1, LK8/T;

    .line 358
    .line 359
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->i0(LK8/T;)LPc/M;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    invoke-virtual {v1, p1}, LPc/o;->a(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    goto :goto_9

    .line 367
    :cond_b
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    const-string v3, "User was not linked to an account with the given provider."

    .line 376
    .line 377
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 378
    .line 379
    .line 380
    move-result v2

    .line 381
    if-eqz v2, :cond_c

    .line 382
    .line 383
    new-instance p1, LPc/t;

    .line 384
    .line 385
    const-string v2, "NO_SUCH_PROVIDER"

    .line 386
    .line 387
    invoke-direct {p1, v2, v3, v0}, LPc/t;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v1, p1}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 391
    .line 392
    .line 393
    goto :goto_9

    .line 394
    :cond_c
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    invoke-virtual {v1, p1}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 399
    .line 400
    .line 401
    :goto_9
    return-void

    .line 402
    :pswitch_9
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    check-cast v1, LPc/o;

    .line 407
    .line 408
    if-eqz v0, :cond_d

    .line 409
    .line 410
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    check-cast p1, LK8/T;

    .line 415
    .line 416
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->i0(LK8/T;)LPc/M;

    .line 417
    .line 418
    .line 419
    move-result-object p1

    .line 420
    invoke-virtual {v1, p1}, LPc/o;->a(Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    goto :goto_a

    .line 424
    :cond_d
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 429
    .line 430
    .line 431
    move-result-object p1

    .line 432
    invoke-virtual {v1, p1}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 433
    .line 434
    .line 435
    :goto_a
    return-void

    .line 436
    :pswitch_a
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    check-cast v1, LPc/q;

    .line 441
    .line 442
    if-eqz v0, :cond_e

    .line 443
    .line 444
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    check-cast p1, LK8/T;

    .line 449
    .line 450
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->i0(LK8/T;)LPc/M;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    invoke-virtual {v1, p1}, LPc/q;->a(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    goto :goto_b

    .line 458
    :cond_e
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 459
    .line 460
    .line 461
    move-result-object p1

    .line 462
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 463
    .line 464
    .line 465
    move-result-object p1

    .line 466
    invoke-virtual {v1, p1}, LPc/q;->b(Ljava/lang/Exception;)V

    .line 467
    .line 468
    .line 469
    :goto_b
    return-void

    .line 470
    :pswitch_b
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    check-cast v1, LPc/p;

    .line 475
    .line 476
    if-eqz v0, :cond_f

    .line 477
    .line 478
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object p1

    .line 482
    check-cast p1, LK8/T;

    .line 483
    .line 484
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->i0(LK8/T;)LPc/M;

    .line 485
    .line 486
    .line 487
    move-result-object p1

    .line 488
    invoke-virtual {v1, p1}, LPc/p;->a(Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    goto :goto_c

    .line 492
    :cond_f
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 493
    .line 494
    .line 495
    move-result-object p1

    .line 496
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 497
    .line 498
    .line 499
    move-result-object p1

    .line 500
    invoke-virtual {v1, p1}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 501
    .line 502
    .line 503
    :goto_c
    return-void

    .line 504
    :pswitch_c
    sget-object v0, LPc/d;->i:Ljava/util/HashMap;

    .line 505
    .line 506
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 507
    .line 508
    .line 509
    move-result v0

    .line 510
    check-cast v1, LPc/q;

    .line 511
    .line 512
    if-eqz v0, :cond_10

    .line 513
    .line 514
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object p1

    .line 518
    check-cast p1, LK8/T;

    .line 519
    .line 520
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->i0(LK8/T;)LPc/M;

    .line 521
    .line 522
    .line 523
    move-result-object p1

    .line 524
    invoke-virtual {v1, p1}, LPc/q;->a(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    goto :goto_d

    .line 528
    :cond_10
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 529
    .line 530
    .line 531
    move-result-object p1

    .line 532
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 533
    .line 534
    .line 535
    move-result-object p1

    .line 536
    invoke-virtual {v1, p1}, LPc/q;->b(Ljava/lang/Exception;)V

    .line 537
    .line 538
    .line 539
    :goto_d
    return-void

    .line 540
    :pswitch_d
    sget-object v0, LPc/d;->i:Ljava/util/HashMap;

    .line 541
    .line 542
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 543
    .line 544
    .line 545
    move-result v0

    .line 546
    check-cast v1, LPc/q;

    .line 547
    .line 548
    if-eqz v0, :cond_11

    .line 549
    .line 550
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object p1

    .line 554
    check-cast p1, LK8/T;

    .line 555
    .line 556
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->i0(LK8/T;)LPc/M;

    .line 557
    .line 558
    .line 559
    move-result-object p1

    .line 560
    invoke-virtual {v1, p1}, LPc/q;->a(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    goto :goto_e

    .line 564
    :cond_11
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 565
    .line 566
    .line 567
    move-result-object p1

    .line 568
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 569
    .line 570
    .line 571
    move-result-object p1

    .line 572
    invoke-virtual {v1, p1}, LPc/q;->b(Ljava/lang/Exception;)V

    .line 573
    .line 574
    .line 575
    :goto_e
    return-void

    .line 576
    :pswitch_e
    sget-object v0, LPc/d;->i:Ljava/util/HashMap;

    .line 577
    .line 578
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 579
    .line 580
    .line 581
    move-result v0

    .line 582
    check-cast v1, LPc/p;

    .line 583
    .line 584
    if-eqz v0, :cond_12

    .line 585
    .line 586
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object p1

    .line 590
    check-cast p1, LK8/k;

    .line 591
    .line 592
    iget-object p1, p1, LK8/k;->a:Ljava/util/List;

    .line 593
    .line 594
    invoke-virtual {v1, p1}, LPc/p;->a(Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    goto :goto_f

    .line 598
    :cond_12
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 599
    .line 600
    .line 601
    move-result-object p1

    .line 602
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 603
    .line 604
    .line 605
    move-result-object p1

    .line 606
    invoke-virtual {v1, p1}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 607
    .line 608
    .line 609
    :goto_f
    return-void

    .line 610
    :pswitch_f
    sget-object v0, LPc/d;->i:Ljava/util/HashMap;

    .line 611
    .line 612
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    check-cast v1, LPc/o;

    .line 617
    .line 618
    if-eqz v0, :cond_13

    .line 619
    .line 620
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object p1

    .line 624
    check-cast p1, LK8/T;

    .line 625
    .line 626
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->i0(LK8/T;)LPc/M;

    .line 627
    .line 628
    .line 629
    move-result-object p1

    .line 630
    invoke-virtual {v1, p1}, LPc/o;->a(Ljava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    goto :goto_10

    .line 634
    :cond_13
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 635
    .line 636
    .line 637
    move-result-object p1

    .line 638
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 639
    .line 640
    .line 641
    move-result-object p1

    .line 642
    invoke-virtual {v1, p1}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 643
    .line 644
    .line 645
    :goto_10
    return-void

    .line 646
    :pswitch_10
    sget-object v0, LPc/d;->i:Ljava/util/HashMap;

    .line 647
    .line 648
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 649
    .line 650
    .line 651
    move-result v0

    .line 652
    check-cast v1, LPc/o;

    .line 653
    .line 654
    if-eqz v0, :cond_14

    .line 655
    .line 656
    invoke-virtual {v1}, LPc/o;->success()V

    .line 657
    .line 658
    .line 659
    goto :goto_11

    .line 660
    :cond_14
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 661
    .line 662
    .line 663
    move-result-object p1

    .line 664
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 665
    .line 666
    .line 667
    move-result-object p1

    .line 668
    invoke-virtual {v1, p1}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 669
    .line 670
    .line 671
    :goto_11
    return-void

    .line 672
    :pswitch_11
    sget-object v0, LPc/d;->i:Ljava/util/HashMap;

    .line 673
    .line 674
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    check-cast v1, LPc/p;

    .line 679
    .line 680
    if-eqz v0, :cond_15

    .line 681
    .line 682
    invoke-virtual {v1}, LPc/p;->success()V

    .line 683
    .line 684
    .line 685
    goto :goto_12

    .line 686
    :cond_15
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 687
    .line 688
    .line 689
    move-result-object p1

    .line 690
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 691
    .line 692
    .line 693
    move-result-object p1

    .line 694
    invoke-virtual {v1, p1}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 695
    .line 696
    .line 697
    :goto_12
    return-void

    .line 698
    :pswitch_12
    sget-object v0, LPc/d;->i:Ljava/util/HashMap;

    .line 699
    .line 700
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 701
    .line 702
    .line 703
    move-result v0

    .line 704
    check-cast v1, LPc/o;

    .line 705
    .line 706
    if-eqz v0, :cond_16

    .line 707
    .line 708
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object p1

    .line 712
    check-cast p1, LK8/T;

    .line 713
    .line 714
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->i0(LK8/T;)LPc/M;

    .line 715
    .line 716
    .line 717
    move-result-object p1

    .line 718
    invoke-virtual {v1, p1}, LPc/o;->a(Ljava/lang/Object;)V

    .line 719
    .line 720
    .line 721
    goto :goto_13

    .line 722
    :cond_16
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 723
    .line 724
    .line 725
    move-result-object p1

    .line 726
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 727
    .line 728
    .line 729
    move-result-object p1

    .line 730
    invoke-virtual {v1, p1}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 731
    .line 732
    .line 733
    :goto_13
    return-void

    .line 734
    :pswitch_13
    sget-object v0, LPc/d;->i:Ljava/util/HashMap;

    .line 735
    .line 736
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 737
    .line 738
    .line 739
    move-result v0

    .line 740
    check-cast v1, LPc/p;

    .line 741
    .line 742
    if-eqz v0, :cond_17

    .line 743
    .line 744
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object p1

    .line 748
    check-cast p1, LK8/T;

    .line 749
    .line 750
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->i0(LK8/T;)LPc/M;

    .line 751
    .line 752
    .line 753
    move-result-object p1

    .line 754
    invoke-virtual {v1, p1}, LPc/p;->a(Ljava/lang/Object;)V

    .line 755
    .line 756
    .line 757
    goto :goto_14

    .line 758
    :cond_17
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 759
    .line 760
    .line 761
    move-result-object p1

    .line 762
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 763
    .line 764
    .line 765
    move-result-object p1

    .line 766
    invoke-virtual {v1, p1}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 767
    .line 768
    .line 769
    :goto_14
    return-void

    .line 770
    :pswitch_14
    sget-object v2, LPc/d;->i:Ljava/util/HashMap;

    .line 771
    .line 772
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 773
    .line 774
    .line 775
    move-result v2

    .line 776
    check-cast v1, LPc/o;

    .line 777
    .line 778
    if-eqz v2, :cond_23

    .line 779
    .line 780
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object p1

    .line 784
    check-cast p1, LK8/S;

    .line 785
    .line 786
    iget v2, p1, LK8/S;->a:I

    .line 787
    .line 788
    const/4 v3, 0x2

    .line 789
    const/4 v4, 0x5

    .line 790
    const/4 v5, 0x1

    .line 791
    if-eqz v2, :cond_1b

    .line 792
    .line 793
    if-eq v2, v5, :cond_1a

    .line 794
    .line 795
    const/4 v6, 0x4

    .line 796
    if-eq v2, v3, :cond_1c

    .line 797
    .line 798
    if-eq v2, v6, :cond_19

    .line 799
    .line 800
    const/4 v6, 0x6

    .line 801
    if-eq v2, v4, :cond_1c

    .line 802
    .line 803
    if-eq v2, v6, :cond_18

    .line 804
    .line 805
    const/4 v6, 0x0

    .line 806
    goto :goto_15

    .line 807
    :cond_18
    const/4 v6, 0x7

    .line 808
    goto :goto_15

    .line 809
    :cond_19
    move v6, v4

    .line 810
    goto :goto_15

    .line 811
    :cond_1a
    const/4 v6, 0x3

    .line 812
    goto :goto_15

    .line 813
    :cond_1b
    move v6, v3

    .line 814
    :cond_1c
    :goto_15
    iget-object p1, p1, LK8/S;->b:LJ8/a;

    .line 815
    .line 816
    if-eqz p1, :cond_1d

    .line 817
    .line 818
    if-eq v2, v5, :cond_1e

    .line 819
    .line 820
    :cond_1d
    if-nez v2, :cond_1f

    .line 821
    .line 822
    :cond_1e
    invoke-virtual {p1}, LJ8/a;->a()Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object p1

    .line 826
    move-object v7, v0

    .line 827
    move-object v0, p1

    .line 828
    move-object p1, v7

    .line 829
    goto :goto_17

    .line 830
    :cond_1f
    if-eq v2, v3, :cond_21

    .line 831
    .line 832
    if-ne v2, v4, :cond_20

    .line 833
    .line 834
    goto :goto_16

    .line 835
    :cond_20
    move-object p1, v0

    .line 836
    goto :goto_17

    .line 837
    :cond_21
    :goto_16
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    check-cast p1, LK8/N;

    .line 841
    .line 842
    iget-object v0, p1, LJ8/a;->a:Ljava/lang/String;

    .line 843
    .line 844
    iget-object p1, p1, LK8/N;->b:Ljava/lang/String;

    .line 845
    .line 846
    :goto_17
    new-instance v2, LPc/B;

    .line 847
    .line 848
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 849
    .line 850
    .line 851
    iput-object v0, v2, LPc/B;->a:Ljava/lang/String;

    .line 852
    .line 853
    iput-object p1, v2, LPc/B;->b:Ljava/lang/String;

    .line 854
    .line 855
    new-instance p1, LPc/A;

    .line 856
    .line 857
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 858
    .line 859
    .line 860
    if-eqz v6, :cond_22

    .line 861
    .line 862
    iput v6, p1, LPc/A;->a:I

    .line 863
    .line 864
    iput-object v2, p1, LPc/A;->b:LPc/B;

    .line 865
    .line 866
    invoke-virtual {v1, p1}, LPc/o;->a(Ljava/lang/Object;)V

    .line 867
    .line 868
    .line 869
    goto :goto_18

    .line 870
    :cond_22
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 871
    .line 872
    const-string v0, "Nonnull field \"operation\" is null."

    .line 873
    .line 874
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 875
    .line 876
    .line 877
    throw p1

    .line 878
    :cond_23
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 879
    .line 880
    .line 881
    move-result-object p1

    .line 882
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 883
    .line 884
    .line 885
    move-result-object p1

    .line 886
    invoke-virtual {v1, p1}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 887
    .line 888
    .line 889
    :goto_18
    return-void

    .line 890
    :pswitch_15
    sget-object v0, LPc/d;->i:Ljava/util/HashMap;

    .line 891
    .line 892
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 893
    .line 894
    .line 895
    move-result v0

    .line 896
    check-cast v1, LPc/o;

    .line 897
    .line 898
    if-eqz v0, :cond_24

    .line 899
    .line 900
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object p1

    .line 904
    check-cast p1, LK8/T;

    .line 905
    .line 906
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->i0(LK8/T;)LPc/M;

    .line 907
    .line 908
    .line 909
    move-result-object p1

    .line 910
    invoke-virtual {v1, p1}, LPc/o;->a(Ljava/lang/Object;)V

    .line 911
    .line 912
    .line 913
    goto :goto_19

    .line 914
    :cond_24
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 915
    .line 916
    .line 917
    move-result-object p1

    .line 918
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 919
    .line 920
    .line 921
    move-result-object p1

    .line 922
    invoke-virtual {v1, p1}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 923
    .line 924
    .line 925
    :goto_19
    return-void

    .line 926
    :pswitch_16
    sget-object v0, LPc/d;->i:Ljava/util/HashMap;

    .line 927
    .line 928
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 929
    .line 930
    .line 931
    move-result v0

    .line 932
    check-cast v1, LPc/p;

    .line 933
    .line 934
    if-eqz v0, :cond_25

    .line 935
    .line 936
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object p1

    .line 940
    check-cast p1, Ljava/lang/String;

    .line 941
    .line 942
    invoke-virtual {v1, p1}, LPc/p;->a(Ljava/lang/Object;)V

    .line 943
    .line 944
    .line 945
    goto :goto_1a

    .line 946
    :cond_25
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 947
    .line 948
    .line 949
    move-result-object p1

    .line 950
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 951
    .line 952
    .line 953
    move-result-object p1

    .line 954
    invoke-virtual {v1, p1}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 955
    .line 956
    .line 957
    :goto_1a
    return-void

    .line 958
    nop

    .line 959
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LPc/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LPc/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, LR8/k;

    .line 9
    .line 10
    invoke-virtual {p1}, LR8/k;->call()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lcom/google/android/gms/tasks/Task;

    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    iget-object p1, p0, LPc/b;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Ljava/util/concurrent/CountDownLatch;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    return-object p1

    .line 26
    :pswitch_1
    iget-object v0, p0, LPc/b;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, LD6/o;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, LR8/b;

    .line 44
    .line 45
    sget-object v0, LO8/c;->a:LO8/c;

    .line 46
    .line 47
    new-instance v1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v2, "Crashlytics report successfully enqueued to DataTransport: "

    .line 50
    .line 51
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v2, p1, LR8/b;->b:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, LO8/c;->c(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p1, LR8/b;->c:Ljava/io/File;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_0

    .line 73
    .line 74
    new-instance v1, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v2, "Deleted report file: "

    .line 77
    .line 78
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {v0, p1}, LO8/c;->c(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v2, "Crashlytics could not delete report file: "

    .line 99
    .line 100
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    const/4 v1, 0x0

    .line 115
    invoke-virtual {v0, p1, v1}, LO8/c;->g(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 116
    .line 117
    .line 118
    :goto_0
    const/4 p1, 0x1

    .line 119
    goto :goto_1

    .line 120
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    const-string v0, "FirebaseCrashlytics"

    .line 125
    .line 126
    const-string v1, "Crashlytics report could not be enqueued to DataTransport"

    .line 127
    .line 128
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 129
    .line 130
    .line 131
    const/4 p1, 0x0

    .line 132
    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    return-object p1

    .line 137
    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
