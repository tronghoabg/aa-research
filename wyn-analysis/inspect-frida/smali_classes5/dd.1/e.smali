.class public final Ldd/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/t;


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Landroid/app/Activity;

.field public final c:La2/c;

.field public final d:La9/a;

.field public e:La7/a;

.field public f:Ljava/util/List;

.field public g:LC6/l;


# direct methods
.method public constructor <init>(Landroid/content/Context;La9/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La2/c;

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-direct {v0, v1}, La2/c;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ldd/e;->c:La2/c;

    .line 12
    .line 13
    iput-object p1, p0, Ldd/e;->a:Landroid/content/Context;

    .line 14
    .line 15
    iput-object p2, p0, Ldd/e;->d:La9/a;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ldd/j;Ldd/m;LPc/p;LPc/o;Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ldd/e;->g:LC6/l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LC6/l;

    .line 6
    .line 7
    move-object v2, p1

    .line 8
    move-object v3, p2

    .line 9
    move-object v4, p3

    .line 10
    move-object v5, p4

    .line 11
    move-object v6, p5

    .line 12
    move-object v7, p6

    .line 13
    invoke-direct/range {v1 .. v7}, LC6/l;-><init>(Ljava/lang/String;Ldd/j;Ldd/m;LPc/p;LPc/o;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Ldd/e;->g:LC6/l;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    move-object v2, p1

    .line 20
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    new-instance p2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string p3, "Concurrent operations detected: "

    .line 25
    .line 26
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object p3, p0, Ldd/e;->g:LC6/l;

    .line 30
    .line 31
    iget-object p3, p3, LC6/l;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p3, Ljava/lang/String;

    .line 34
    .line 35
    const-string p4, ", "

    .line 36
    .line 37
    invoke-static {p2, p3, p4, v2}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldd/e;->g:LC6/l;

    .line 2
    .line 3
    iget-object v1, v0, LC6/l;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ldd/m;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v0, Ldd/g;

    .line 10
    .line 11
    invoke-direct {v0, p1, p2}, Ldd/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1, v0}, Ldd/m;->d(Ldd/g;)V

    .line 15
    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v1, v0, LC6/l;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ldd/j;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object v1, v0, LC6/l;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, LPc/p;

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iget-object v0, v0, LC6/l;->e:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v1, v0

    .line 35
    check-cast v1, LPc/o;

    .line 36
    .line 37
    :goto_0
    invoke-static {v1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    new-instance v0, Ldd/g;

    .line 41
    .line 42
    invoke-direct {v0, p1, p2}, Ldd/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v1, v0}, Ldd/j;->d(Ldd/g;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    const/4 p1, 0x0

    .line 49
    iput-object p1, p0, Ldd/e;->g:LC6/l;

    .line 50
    .line 51
    return-void
.end method

.method public final c(Ldd/h;)V
    .locals 11

    .line 1
    const-string v0, "two different server client ids provided"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p1, Ldd/h;->b:Ldd/k;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    new-instance v1, LVa/H;

    .line 15
    .line 16
    sget-object v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->l:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 17
    .line 18
    invoke-direct {v1, v3}, LVa/H;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    move-object p1, v0

    .line 24
    goto/16 :goto_4

    .line 25
    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "Unknown signInOption"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    new-instance v1, LVa/H;

    .line 35
    .line 36
    sget-object v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->k:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 37
    .line 38
    invoke-direct {v1, v3}, LVa/H;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 39
    .line 40
    .line 41
    iget-object v3, v1, LVa/H;->g:Ljava/io/Serializable;

    .line 42
    .line 43
    check-cast v3, Ljava/util/HashSet;

    .line 44
    .line 45
    sget-object v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->m:Lcom/google/android/gms/common/api/Scope;

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :goto_0
    iget-object v3, p1, Ldd/h;->e:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v4, p1, Ldd/h;->d:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v4}, LFe/c;->D(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-nez v4, :cond_2

    .line 59
    .line 60
    invoke-static {v3}, LFe/c;->D(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_2

    .line 65
    .line 66
    const-string v3, "google_sign_in"

    .line 67
    .line 68
    const-string v4, "clientId is not supported on Android and is interpreted as serverClientId. Use serverClientId instead to suppress this warning."

    .line 69
    .line 70
    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    iget-object v3, p1, Ldd/h;->d:Ljava/lang/String;

    .line 74
    .line 75
    :cond_2
    invoke-static {v3}, LFe/c;->D(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    iget-object v6, p0, Ldd/e;->a:Landroid/content/Context;

    .line 80
    .line 81
    if-eqz v4, :cond_3

    .line 82
    .line 83
    :try_start_1
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    const-string v5, "default_web_client_id"

    .line 88
    .line 89
    const-string v7, "string"

    .line 90
    .line 91
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    invoke-virtual {v4, v5, v7, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_3

    .line 100
    .line 101
    invoke-virtual {v6, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    :cond_3
    invoke-static {v3}, LFe/c;->D(Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    const/4 v5, 0x0

    .line 110
    if-nez v4, :cond_8

    .line 111
    .line 112
    iput-boolean v2, v1, LVa/H;->c:Z

    .line 113
    .line 114
    invoke-static {v3}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-object v4, v1, LVa/H;->d:Ljava/lang/String;

    .line 118
    .line 119
    if-eqz v4, :cond_4

    .line 120
    .line 121
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_5

    .line 126
    .line 127
    :cond_4
    move v4, v2

    .line 128
    goto :goto_1

    .line 129
    :cond_5
    move v4, v5

    .line 130
    :goto_1
    invoke-static {v0, v4}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 131
    .line 132
    .line 133
    iput-object v3, v1, LVa/H;->d:Ljava/lang/String;

    .line 134
    .line 135
    iget-object v4, p1, Ldd/h;->f:Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    iput-boolean v2, v1, LVa/H;->a:Z

    .line 142
    .line 143
    invoke-static {v3}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    iget-object v7, v1, LVa/H;->d:Ljava/lang/String;

    .line 147
    .line 148
    if-eqz v7, :cond_6

    .line 149
    .line 150
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-eqz v7, :cond_7

    .line 155
    .line 156
    :cond_6
    move v7, v2

    .line 157
    goto :goto_2

    .line 158
    :cond_7
    move v7, v5

    .line 159
    :goto_2
    invoke-static {v0, v7}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 160
    .line 161
    .line 162
    iput-object v3, v1, LVa/H;->d:Ljava/lang/String;

    .line 163
    .line 164
    iput-boolean v4, v1, LVa/H;->b:Z

    .line 165
    .line 166
    :cond_8
    iget-object v0, p1, Ldd/h;->a:Ljava/util/List;

    .line 167
    .line 168
    iput-object v0, p0, Ldd/e;->f:Ljava/util/List;

    .line 169
    .line 170
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_9

    .line 179
    .line 180
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    check-cast v3, Ljava/lang/String;

    .line 185
    .line 186
    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    .line 187
    .line 188
    invoke-direct {v4, v2, v3}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 189
    .line 190
    .line 191
    new-array v3, v5, [Lcom/google/android/gms/common/api/Scope;

    .line 192
    .line 193
    iget-object v7, v1, LVa/H;->g:Ljava/io/Serializable;

    .line 194
    .line 195
    check-cast v7, Ljava/util/HashSet;

    .line 196
    .line 197
    invoke-virtual {v7, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-interface {v7, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 205
    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_9
    iget-object v0, p1, Ldd/h;->c:Ljava/lang/String;

    .line 209
    .line 210
    invoke-static {v0}, LFe/c;->D(Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-nez v0, :cond_a

    .line 215
    .line 216
    iget-object p1, p1, Ldd/h;->c:Ljava/lang/String;

    .line 217
    .line 218
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    iput-object p1, v1, LVa/H;->e:Ljava/lang/String;

    .line 222
    .line 223
    :cond_a
    iget-object p1, p0, Ldd/e;->d:La9/a;

    .line 224
    .line 225
    invoke-virtual {v1}, LVa/H;->a()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    new-instance v5, La7/a;

    .line 233
    .line 234
    sget-object v8, LV6/a;->a:Lcom/google/android/gms/common/api/i;

    .line 235
    .line 236
    new-instance p1, Lcom/google/android/gms/common/api/internal/a;

    .line 237
    .line 238
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    new-instance v10, Lcom/google/android/gms/common/api/k;

    .line 246
    .line 247
    invoke-direct {v10, p1, v0}, Lcom/google/android/gms/common/api/k;-><init>(Lcom/google/android/gms/common/api/internal/a;Landroid/os/Looper;)V

    .line 248
    .line 249
    .line 250
    const/4 v7, 0x0

    .line 251
    invoke-direct/range {v5 .. v10}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    .line 252
    .line 253
    .line 254
    iput-object v5, p0, Ldd/e;->e:La7/a;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 255
    .line 256
    return-void

    .line 257
    :goto_4
    new-instance v0, Ldd/g;

    .line 258
    .line 259
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    const-string v1, "exception"

    .line 264
    .line 265
    invoke-direct {v0, v1, p1}, Ldd/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw v0
.end method

.method public final d(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->d:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->g:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->f:Landroid/net/Uri;

    .line 7
    .line 8
    if-eqz v3, :cond_0

    .line 9
    .line 10
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v3, v2

    .line 16
    :goto_0
    new-instance v4, Ldd/l;

    .line 17
    .line 18
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v5, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->e:Ljava/lang/String;

    .line 22
    .line 23
    iput-object v5, v4, Ldd/l;->a:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iput-object v0, v4, Ldd/l;->b:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v0, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->b:Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iput-object v0, v4, Ldd/l;->c:Ljava/lang/String;

    .line 34
    .line 35
    iput-object v3, v4, Ldd/l;->d:Ljava/lang/String;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->c:Ljava/lang/String;

    .line 38
    .line 39
    iput-object p1, v4, Ldd/l;->e:Ljava/lang/String;

    .line 40
    .line 41
    iput-object v1, v4, Ldd/l;->f:Ljava/lang/String;

    .line 42
    .line 43
    iget-object p1, p0, Ldd/e;->g:LC6/l;

    .line 44
    .line 45
    iget-object p1, p1, LC6/l;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ldd/j;

    .line 48
    .line 49
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, v4}, Ldd/j;->a(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object v2, p0, Ldd/e;->g:LC6/l;

    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v0, "Nonnull field \"id\" is null."

    .line 61
    .line 62
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v0, "Nonnull field \"email\" is null."

    .line 69
    .line 70
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1
.end method

.method public final e(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    .line 1
    :try_start_0
    const-class v0, Lcom/google/android/gms/common/api/j;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->getResult(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ldd/e;->d(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    :try_end_0
    .catch Lcom/google/android/gms/common/api/j; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/tasks/RuntimeExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception p1

    .line 14
    goto :goto_0

    .line 15
    :catch_1
    move-exception p1

    .line 16
    goto :goto_1

    .line 17
    :goto_0
    const-string v0, "exception"

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, v0, p1}, Ldd/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    goto :goto_3

    .line 27
    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/j;->getStatusCode()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x4

    .line 32
    if-eq v0, v1, :cond_2

    .line 33
    .line 34
    const/4 v1, 0x7

    .line 35
    if-eq v0, v1, :cond_1

    .line 36
    .line 37
    const/16 v1, 0x30d5

    .line 38
    .line 39
    if-eq v0, v1, :cond_0

    .line 40
    .line 41
    const-string v0, "sign_in_failed"

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_0
    const-string v0, "sign_in_canceled"

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const-string v0, "network_error"

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const-string v0, "sign_in_required"

    .line 51
    .line 52
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p0, v0, p1}, Ldd/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :goto_3
    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Ldd/e;->g:LC6/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v2, 0x0

    .line 8
    const/4 v3, -0x1

    .line 9
    const/4 v4, 0x1

    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    :goto_0
    return v1

    .line 14
    :pswitch_0
    if-ne p2, v3, :cond_1

    .line 15
    .line 16
    move v1, v4

    .line 17
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p2, p0, Ldd/e;->g:LC6/l;

    .line 22
    .line 23
    iget-object p2, p2, LC6/l;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p2, LPc/p;

    .line 26
    .line 27
    invoke-static {p2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p1}, LPc/p;->a(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v2, p0, Ldd/e;->g:LC6/l;

    .line 34
    .line 35
    return v4

    .line 36
    :pswitch_1
    if-ne p2, v3, :cond_2

    .line 37
    .line 38
    iget-object p1, v0, LC6/l;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, LPc/o;

    .line 41
    .line 42
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    iget-object p2, p0, Ldd/e;->g:LC6/l;

    .line 46
    .line 47
    iget-object p2, p2, LC6/l;->f:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-static {p2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    check-cast p2, Ljava/lang/String;

    .line 53
    .line 54
    iput-object v2, p0, Ldd/e;->g:LC6/l;

    .line 55
    .line 56
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 57
    .line 58
    new-instance v0, Ldd/c;

    .line 59
    .line 60
    invoke-direct {v0, p0, p2, v1}, Ldd/c;-><init>(Ldd/e;Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    new-instance v1, Lcom/applovin/impl/Y;

    .line 64
    .line 65
    invoke-direct {v1, p0, p1, p3, p2}, Lcom/applovin/impl/Y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Ldd/e;->c:La2/c;

    .line 69
    .line 70
    invoke-virtual {p1, v0, v1}, La2/c;->J(Ljava/util/concurrent/Callable;Ldd/a;)V

    .line 71
    .line 72
    .line 73
    return v4

    .line 74
    :cond_2
    const-string p1, "failed_to_recover_auth"

    .line 75
    .line 76
    const-string p2, "Failed attempt to recover authentication"

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, Ldd/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return v4

    .line 82
    :pswitch_2
    if-eqz p3, :cond_7

    .line 83
    .line 84
    sget-object p1, Lb7/j;->a:Lh7/a;

    .line 85
    .line 86
    sget-object p1, Lcom/google/android/gms/common/api/Status;->g:Lcom/google/android/gms/common/api/Status;

    .line 87
    .line 88
    const-string p2, "googleSignInStatus"

    .line 89
    .line 90
    invoke-virtual {p3, p2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    check-cast p2, Lcom/google/android/gms/common/api/Status;

    .line 95
    .line 96
    const-string v0, "googleSignInAccount"

    .line 97
    .line 98
    invoke-virtual {p3, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    check-cast p3, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 103
    .line 104
    if-nez p3, :cond_4

    .line 105
    .line 106
    new-instance p3, La7/b;

    .line 107
    .line 108
    if-nez p2, :cond_3

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    move-object p1, p2

    .line 112
    :goto_1
    invoke-direct {p3, v2, p1}, La7/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    new-instance p1, La7/b;

    .line 117
    .line 118
    sget-object p2, Lcom/google/android/gms/common/api/Status;->e:Lcom/google/android/gms/common/api/Status;

    .line 119
    .line 120
    invoke-direct {p1, p3, p2}, La7/b;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    .line 121
    .line 122
    .line 123
    move-object p3, p1

    .line 124
    :goto_2
    iget-object p1, p3, La7/b;->a:Lcom/google/android/gms/common/api/Status;

    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->V()Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-eqz p2, :cond_6

    .line 131
    .line 132
    iget-object p2, p3, La7/b;->b:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 133
    .line 134
    if-nez p2, :cond_5

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_5
    invoke-static {p2}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    goto :goto_4

    .line 142
    :cond_6
    :goto_3
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->n(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/j;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    :goto_4
    invoke-virtual {p0, p1}, Ldd/e;->e(Lcom/google/android/gms/tasks/Task;)V

    .line 151
    .line 152
    .line 153
    return v4

    .line 154
    :cond_7
    const-string p1, "sign_in_failed"

    .line 155
    .line 156
    const-string p2, "Signin failed"

    .line 157
    .line 158
    invoke-virtual {p0, p1, p2}, Ldd/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return v4

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0xd02d
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
