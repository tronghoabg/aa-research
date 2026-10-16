.class public final LR0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:Z

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LR0/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ls8/g;)V
    .locals 7

    const/4 v0, 0x1

    iput v0, p0, LR0/e;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LR0/e;->f:Ljava/lang/Object;

    .line 4
    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iput-object v1, p0, LR0/e;->g:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, LR0/e;->b:Z

    .line 6
    iput-boolean v1, p0, LR0/e;->c:Z

    .line 7
    new-instance v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iput-object v2, p0, LR0/e;->i:Ljava/lang/Object;

    .line 8
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 9
    iget-object v2, p1, Ls8/g;->a:Landroid/content/Context;

    .line 10
    iput-object p1, p0, LR0/e;->e:Ljava/lang/Object;

    .line 11
    const-string p1, "com.google.firebase.crashlytics"

    invoke-virtual {v2, p1, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 12
    iput-object p1, p0, LR0/e;->d:Ljava/lang/Object;

    .line 13
    const-string v3, "firebase_crashlytics_collection_enabled"

    invoke-interface {p1, v3}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_0

    .line 14
    iput-boolean v1, p0, LR0/e;->c:Z

    .line 15
    invoke-interface {p1, v3, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v5

    :goto_0
    if-nez p1, :cond_3

    .line 16
    const-string p1, "firebase_crashlytics_collection_enabled"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 17
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v4, 0x80

    .line 18
    invoke-virtual {v3, v2, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 19
    iget-object v3, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v3, :cond_1

    .line 20
    invoke-virtual {v3, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 21
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v2, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 22
    const-string v2, "FirebaseCrashlytics"

    const-string v3, "Could not read data collection permission from manifest"

    invoke-static {v2, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    move-object p1, v1

    :goto_1
    if-nez p1, :cond_2

    const/4 p1, 0x0

    .line 23
    iput-boolean p1, p0, LR0/e;->c:Z

    move-object p1, v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x1

    .line 24
    iput-boolean v1, p0, LR0/e;->c:Z

    .line 25
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 26
    :cond_3
    :goto_2
    iput-object p1, p0, LR0/e;->h:Ljava/lang/Object;

    .line 27
    monitor-enter v0

    .line 28
    :try_start_1
    invoke-virtual {p0}, LR0/e;->f()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 29
    iget-object p1, p0, LR0/e;->g:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1, v5}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 30
    iput-boolean v6, p0, LR0/e;->b:Z

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    .line 31
    :cond_4
    :goto_3
    monitor-exit v0

    return-void

    :goto_4
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public synthetic constructor <init>(ZZLcg/y;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 10

    const/4 v0, 0x2

    iput v0, p0, LR0/e;->a:I

    .line 41
    sget-object v9, Lff/w;->a:Lff/w;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    .line 42
    invoke-direct/range {v1 .. v9}, LR0/e;-><init>(ZZLcg/y;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(ZZLcg/y;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LR0/e;->a:I

    const-string v0, "extras"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-boolean p1, p0, LR0/e;->b:Z

    .line 34
    iput-boolean p2, p0, LR0/e;->c:Z

    .line 35
    iput-object p3, p0, LR0/e;->d:Ljava/lang/Object;

    .line 36
    iput-object p4, p0, LR0/e;->e:Ljava/lang/Object;

    .line 37
    iput-object p5, p0, LR0/e;->f:Ljava/lang/Object;

    .line 38
    iput-object p6, p0, LR0/e;->g:Ljava/lang/Object;

    .line 39
    iput-object p7, p0, LR0/e;->h:Ljava/lang/Object;

    .line 40
    invoke-static {p8}, Lff/A;->Y(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LR0/e;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(LR0/f;ILjava/util/ArrayList;LR0/l;)V
    .locals 6

    .line 1
    iget-object p1, p1, LR0/f;->d:LR0/o;

    .line 2
    .line 3
    iget-object v0, p1, LR0/o;->c:LR0/l;

    .line 4
    .line 5
    if-nez v0, :cond_a

    .line 6
    .line 7
    iget-object v0, p0, LR0/e;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LQ0/e;

    .line 10
    .line 11
    iget-object v1, v0, LQ0/d;->d:LR0/k;

    .line 12
    .line 13
    if-eq p1, v1, :cond_a

    .line 14
    .line 15
    iget-object v0, v0, LQ0/d;->e:LR0/m;

    .line 16
    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_0
    if-nez p4, :cond_1

    .line 22
    .line 23
    new-instance p4, LR0/l;

    .line 24
    .line 25
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput-object v0, p4, LR0/l;->a:LR0/o;

    .line 30
    .line 31
    new-instance v0, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p4, LR0/l;->b:Ljava/util/ArrayList;

    .line 37
    .line 38
    iput-object p1, p4, LR0/l;->a:LR0/o;

    .line 39
    .line 40
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_1
    iput-object p4, p1, LR0/o;->c:LR0/l;

    .line 44
    .line 45
    iget-object v0, p4, LR0/l;->b:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    iget-object v0, p1, LR0/o;->h:LR0/f;

    .line 51
    .line 52
    iget-object v1, v0, LR0/f;->k:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, LR0/d;

    .line 69
    .line 70
    instance-of v3, v2, LR0/f;

    .line 71
    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    check-cast v2, LR0/f;

    .line 75
    .line 76
    invoke-virtual {p0, v2, p2, p3, p4}, LR0/e;->a(LR0/f;ILjava/util/ArrayList;LR0/l;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    iget-object v1, p1, LR0/o;->i:LR0/f;

    .line 81
    .line 82
    iget-object v2, v1, LR0/f;->k:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_5

    .line 93
    .line 94
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    check-cast v3, LR0/d;

    .line 99
    .line 100
    instance-of v4, v3, LR0/f;

    .line 101
    .line 102
    if-eqz v4, :cond_4

    .line 103
    .line 104
    check-cast v3, LR0/f;

    .line 105
    .line 106
    invoke-virtual {p0, v3, p2, p3, p4}, LR0/e;->a(LR0/f;ILjava/util/ArrayList;LR0/l;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    const/4 v2, 0x1

    .line 111
    if-ne p2, v2, :cond_7

    .line 112
    .line 113
    instance-of v3, p1, LR0/m;

    .line 114
    .line 115
    if-eqz v3, :cond_7

    .line 116
    .line 117
    move-object v3, p1

    .line 118
    check-cast v3, LR0/m;

    .line 119
    .line 120
    iget-object v3, v3, LR0/m;->k:LR0/f;

    .line 121
    .line 122
    iget-object v3, v3, LR0/f;->k:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    :cond_6
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-eqz v4, :cond_7

    .line 133
    .line 134
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    check-cast v4, LR0/d;

    .line 139
    .line 140
    instance-of v5, v4, LR0/f;

    .line 141
    .line 142
    if-eqz v5, :cond_6

    .line 143
    .line 144
    check-cast v4, LR0/f;

    .line 145
    .line 146
    invoke-virtual {p0, v4, p2, p3, p4}, LR0/e;->a(LR0/f;ILjava/util/ArrayList;LR0/l;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_7
    iget-object v0, v0, LR0/f;->l:Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_8

    .line 161
    .line 162
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, LR0/f;

    .line 167
    .line 168
    invoke-virtual {p0, v3, p2, p3, p4}, LR0/e;->a(LR0/f;ILjava/util/ArrayList;LR0/l;)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_8
    iget-object v0, v1, LR0/f;->l:Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_9

    .line 183
    .line 184
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    check-cast v1, LR0/f;

    .line 189
    .line 190
    invoke-virtual {p0, v1, p2, p3, p4}, LR0/e;->a(LR0/f;ILjava/util/ArrayList;LR0/l;)V

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_9
    if-ne p2, v2, :cond_a

    .line 195
    .line 196
    instance-of v0, p1, LR0/m;

    .line 197
    .line 198
    if-eqz v0, :cond_a

    .line 199
    .line 200
    check-cast p1, LR0/m;

    .line 201
    .line 202
    iget-object p1, p1, LR0/m;->k:LR0/f;

    .line 203
    .line 204
    iget-object p1, p1, LR0/f;->l:Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_a

    .line 215
    .line 216
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, LR0/f;

    .line 221
    .line 222
    :try_start_0
    invoke-virtual {p0, v0, p2, p3, p4}, LR0/e;->a(LR0/f;ILjava/util/ArrayList;LR0/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :catchall_0
    move-exception p1

    .line 227
    throw p1

    .line 228
    :cond_a
    :goto_6
    return-void
.end method

.method public b(LQ0/e;)V
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, v0, LQ0/e;->q0:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_2b

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    move-object v8, v2

    .line 20
    check-cast v8, LQ0/d;

    .line 21
    .line 22
    iget-object v2, v8, LQ0/d;->p0:[I

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    aget v4, v2, v3

    .line 26
    .line 27
    const/4 v9, 0x1

    .line 28
    aget v2, v2, v9

    .line 29
    .line 30
    iget v5, v8, LQ0/d;->g0:I

    .line 31
    .line 32
    const/16 v6, 0x8

    .line 33
    .line 34
    if-ne v5, v6, :cond_1

    .line 35
    .line 36
    iput-boolean v9, v8, LQ0/d;->a:Z

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget v5, v8, LQ0/d;->w:F

    .line 40
    .line 41
    const/high16 v10, 0x3f800000    # 1.0f

    .line 42
    .line 43
    cmpg-float v6, v5, v10

    .line 44
    .line 45
    const/4 v7, 0x3

    .line 46
    const/4 v11, 0x2

    .line 47
    if-gez v6, :cond_2

    .line 48
    .line 49
    if-ne v4, v7, :cond_2

    .line 50
    .line 51
    iput v11, v8, LQ0/d;->r:I

    .line 52
    .line 53
    :cond_2
    iget v6, v8, LQ0/d;->z:F

    .line 54
    .line 55
    cmpg-float v12, v6, v10

    .line 56
    .line 57
    if-gez v12, :cond_3

    .line 58
    .line 59
    if-ne v2, v7, :cond_3

    .line 60
    .line 61
    iput v11, v8, LQ0/d;->s:I

    .line 62
    .line 63
    :cond_3
    iget v12, v8, LQ0/d;->W:F

    .line 64
    .line 65
    const/4 v13, 0x0

    .line 66
    cmpl-float v12, v12, v13

    .line 67
    .line 68
    const/4 v13, 0x2

    .line 69
    const/4 v14, 0x1

    .line 70
    if-lez v12, :cond_9

    .line 71
    .line 72
    if-ne v4, v7, :cond_5

    .line 73
    .line 74
    if-eq v2, v13, :cond_4

    .line 75
    .line 76
    if-ne v2, v14, :cond_5

    .line 77
    .line 78
    :cond_4
    iput v7, v8, LQ0/d;->r:I

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_5
    if-ne v2, v7, :cond_7

    .line 82
    .line 83
    if-eq v4, v13, :cond_6

    .line 84
    .line 85
    if-ne v4, v14, :cond_7

    .line 86
    .line 87
    :cond_6
    iput v7, v8, LQ0/d;->s:I

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_7
    if-ne v4, v7, :cond_9

    .line 91
    .line 92
    if-ne v2, v7, :cond_9

    .line 93
    .line 94
    iget v12, v8, LQ0/d;->r:I

    .line 95
    .line 96
    if-nez v12, :cond_8

    .line 97
    .line 98
    iput v7, v8, LQ0/d;->r:I

    .line 99
    .line 100
    :cond_8
    iget v12, v8, LQ0/d;->s:I

    .line 101
    .line 102
    if-nez v12, :cond_9

    .line 103
    .line 104
    iput v7, v8, LQ0/d;->s:I

    .line 105
    .line 106
    :cond_9
    :goto_1
    iget-object v12, v8, LQ0/d;->K:LQ0/c;

    .line 107
    .line 108
    iget-object v15, v8, LQ0/d;->I:LQ0/c;

    .line 109
    .line 110
    move/from16 v16, v3

    .line 111
    .line 112
    if-ne v4, v7, :cond_b

    .line 113
    .line 114
    iget v3, v8, LQ0/d;->r:I

    .line 115
    .line 116
    if-ne v3, v9, :cond_b

    .line 117
    .line 118
    iget-object v3, v15, LQ0/c;->f:LQ0/c;

    .line 119
    .line 120
    if-eqz v3, :cond_a

    .line 121
    .line 122
    iget-object v3, v12, LQ0/c;->f:LQ0/c;

    .line 123
    .line 124
    if-nez v3, :cond_b

    .line 125
    .line 126
    :cond_a
    move v4, v13

    .line 127
    :cond_b
    iget-object v3, v8, LQ0/d;->L:LQ0/c;

    .line 128
    .line 129
    move/from16 v17, v10

    .line 130
    .line 131
    iget-object v10, v8, LQ0/d;->J:LQ0/c;

    .line 132
    .line 133
    if-ne v2, v7, :cond_d

    .line 134
    .line 135
    iget v11, v8, LQ0/d;->s:I

    .line 136
    .line 137
    if-ne v11, v9, :cond_d

    .line 138
    .line 139
    iget-object v11, v10, LQ0/c;->f:LQ0/c;

    .line 140
    .line 141
    if-eqz v11, :cond_c

    .line 142
    .line 143
    iget-object v11, v3, LQ0/c;->f:LQ0/c;

    .line 144
    .line 145
    if-nez v11, :cond_d

    .line 146
    .line 147
    :cond_c
    move v2, v13

    .line 148
    :cond_d
    iget-object v11, v8, LQ0/d;->d:LR0/k;

    .line 149
    .line 150
    iput v4, v11, LR0/o;->d:I

    .line 151
    .line 152
    iget v9, v8, LQ0/d;->r:I

    .line 153
    .line 154
    iput v9, v11, LR0/o;->a:I

    .line 155
    .line 156
    iget-object v11, v8, LQ0/d;->e:LR0/m;

    .line 157
    .line 158
    iput v2, v11, LR0/o;->d:I

    .line 159
    .line 160
    iget v7, v8, LQ0/d;->s:I

    .line 161
    .line 162
    iput v7, v11, LR0/o;->a:I

    .line 163
    .line 164
    const/4 v11, 0x4

    .line 165
    if-eq v4, v11, :cond_e

    .line 166
    .line 167
    if-eq v4, v14, :cond_e

    .line 168
    .line 169
    if-ne v4, v13, :cond_10

    .line 170
    .line 171
    :cond_e
    if-eq v2, v11, :cond_f

    .line 172
    .line 173
    if-eq v2, v14, :cond_f

    .line 174
    .line 175
    if-ne v2, v13, :cond_10

    .line 176
    .line 177
    :cond_f
    move v6, v2

    .line 178
    goto/16 :goto_b

    .line 179
    .line 180
    :cond_10
    iget-object v3, v0, LQ0/d;->p0:[I

    .line 181
    .line 182
    iget-object v10, v8, LQ0/d;->Q:[LQ0/c;

    .line 183
    .line 184
    const/high16 v12, 0x3f000000    # 0.5f

    .line 185
    .line 186
    const/4 v15, 0x3

    .line 187
    if-ne v4, v15, :cond_1a

    .line 188
    .line 189
    if-eq v2, v13, :cond_12

    .line 190
    .line 191
    if-ne v2, v14, :cond_11

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_11
    move/from16 v21, v6

    .line 195
    .line 196
    move v6, v2

    .line 197
    move v2, v15

    .line 198
    move v15, v4

    .line 199
    move v4, v13

    .line 200
    move/from16 v13, v21

    .line 201
    .line 202
    goto/16 :goto_5

    .line 203
    .line 204
    :cond_12
    :goto_2
    if-ne v9, v15, :cond_14

    .line 205
    .line 206
    if-ne v2, v13, :cond_13

    .line 207
    .line 208
    const/4 v7, 0x0

    .line 209
    const/4 v5, 0x0

    .line 210
    move v6, v13

    .line 211
    move-object/from16 v3, p0

    .line 212
    .line 213
    move v4, v13

    .line 214
    invoke-virtual/range {v3 .. v8}, LR0/e;->h(IIIILQ0/d;)V

    .line 215
    .line 216
    .line 217
    :cond_13
    invoke-virtual {v8}, LQ0/d;->k()I

    .line 218
    .line 219
    .line 220
    move-result v7

    .line 221
    int-to-float v2, v7

    .line 222
    iget v3, v8, LQ0/d;->W:F

    .line 223
    .line 224
    mul-float/2addr v2, v3

    .line 225
    add-float/2addr v2, v12

    .line 226
    float-to-int v5, v2

    .line 227
    move v6, v14

    .line 228
    move-object/from16 v3, p0

    .line 229
    .line 230
    move v4, v14

    .line 231
    invoke-virtual/range {v3 .. v8}, LR0/e;->h(IIIILQ0/d;)V

    .line 232
    .line 233
    .line 234
    iget-object v2, v8, LQ0/d;->d:LR0/k;

    .line 235
    .line 236
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 237
    .line 238
    invoke-virtual {v8}, LQ0/d;->q()I

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    invoke-virtual {v2, v3}, LR0/g;->d(I)V

    .line 243
    .line 244
    .line 245
    iget-object v2, v8, LQ0/d;->e:LR0/m;

    .line 246
    .line 247
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 248
    .line 249
    invoke-virtual {v8}, LQ0/d;->k()I

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    invoke-virtual {v2, v3}, LR0/g;->d(I)V

    .line 254
    .line 255
    .line 256
    const/4 v13, 0x1

    .line 257
    iput-boolean v13, v8, LQ0/d;->a:Z

    .line 258
    .line 259
    goto/16 :goto_0

    .line 260
    .line 261
    :cond_14
    move v15, v4

    .line 262
    move v4, v13

    .line 263
    const/4 v13, 0x1

    .line 264
    if-ne v9, v13, :cond_15

    .line 265
    .line 266
    const/4 v5, 0x0

    .line 267
    const/4 v7, 0x0

    .line 268
    move-object/from16 v3, p0

    .line 269
    .line 270
    move v6, v2

    .line 271
    invoke-virtual/range {v3 .. v8}, LR0/e;->h(IIIILQ0/d;)V

    .line 272
    .line 273
    .line 274
    iget-object v2, v8, LQ0/d;->d:LR0/k;

    .line 275
    .line 276
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 277
    .line 278
    invoke-virtual {v8}, LQ0/d;->q()I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    iput v3, v2, LR0/g;->m:I

    .line 283
    .line 284
    goto/16 :goto_0

    .line 285
    .line 286
    :cond_15
    move v13, v6

    .line 287
    move v6, v2

    .line 288
    const/4 v2, 0x2

    .line 289
    if-ne v9, v2, :cond_18

    .line 290
    .line 291
    aget v2, v3, v16

    .line 292
    .line 293
    if-eq v2, v14, :cond_17

    .line 294
    .line 295
    if-ne v2, v11, :cond_16

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_16
    :goto_3
    const/4 v2, 0x3

    .line 299
    goto :goto_5

    .line 300
    :cond_17
    :goto_4
    invoke-virtual {v0}, LQ0/d;->q()I

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    int-to-float v2, v2

    .line 305
    mul-float/2addr v5, v2

    .line 306
    add-float/2addr v5, v12

    .line 307
    float-to-int v5, v5

    .line 308
    invoke-virtual {v8}, LQ0/d;->k()I

    .line 309
    .line 310
    .line 311
    move-result v7

    .line 312
    move-object/from16 v3, p0

    .line 313
    .line 314
    move v4, v14

    .line 315
    invoke-virtual/range {v3 .. v8}, LR0/e;->h(IIIILQ0/d;)V

    .line 316
    .line 317
    .line 318
    iget-object v2, v8, LQ0/d;->d:LR0/k;

    .line 319
    .line 320
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 321
    .line 322
    invoke-virtual {v8}, LQ0/d;->q()I

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    invoke-virtual {v2, v3}, LR0/g;->d(I)V

    .line 327
    .line 328
    .line 329
    iget-object v2, v8, LQ0/d;->e:LR0/m;

    .line 330
    .line 331
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 332
    .line 333
    invoke-virtual {v8}, LQ0/d;->k()I

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    invoke-virtual {v2, v3}, LR0/g;->d(I)V

    .line 338
    .line 339
    .line 340
    const/4 v2, 0x1

    .line 341
    iput-boolean v2, v8, LQ0/d;->a:Z

    .line 342
    .line 343
    goto/16 :goto_0

    .line 344
    .line 345
    :cond_18
    const/16 v19, 0x1

    .line 346
    .line 347
    aget-object v2, v10, v16

    .line 348
    .line 349
    iget-object v2, v2, LQ0/c;->f:LQ0/c;

    .line 350
    .line 351
    if-eqz v2, :cond_19

    .line 352
    .line 353
    aget-object v2, v10, v19

    .line 354
    .line 355
    iget-object v2, v2, LQ0/c;->f:LQ0/c;

    .line 356
    .line 357
    if-nez v2, :cond_16

    .line 358
    .line 359
    :cond_19
    const/4 v5, 0x0

    .line 360
    const/4 v7, 0x0

    .line 361
    move-object/from16 v3, p0

    .line 362
    .line 363
    invoke-virtual/range {v3 .. v8}, LR0/e;->h(IIIILQ0/d;)V

    .line 364
    .line 365
    .line 366
    iget-object v2, v8, LQ0/d;->d:LR0/k;

    .line 367
    .line 368
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 369
    .line 370
    invoke-virtual {v8}, LQ0/d;->q()I

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    invoke-virtual {v2, v3}, LR0/g;->d(I)V

    .line 375
    .line 376
    .line 377
    iget-object v2, v8, LQ0/d;->e:LR0/m;

    .line 378
    .line 379
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 380
    .line 381
    invoke-virtual {v8}, LQ0/d;->k()I

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    invoke-virtual {v2, v3}, LR0/g;->d(I)V

    .line 386
    .line 387
    .line 388
    const/4 v2, 0x1

    .line 389
    iput-boolean v2, v8, LQ0/d;->a:Z

    .line 390
    .line 391
    goto/16 :goto_0

    .line 392
    .line 393
    :cond_1a
    move v15, v4

    .line 394
    move v4, v13

    .line 395
    move v13, v6

    .line 396
    move v6, v2

    .line 397
    goto :goto_3

    .line 398
    :goto_5
    if-ne v6, v2, :cond_26

    .line 399
    .line 400
    if-eq v15, v4, :cond_1c

    .line 401
    .line 402
    if-ne v15, v14, :cond_1b

    .line 403
    .line 404
    goto :goto_6

    .line 405
    :cond_1b
    move v10, v15

    .line 406
    move v15, v4

    .line 407
    move v4, v10

    .line 408
    move v10, v2

    .line 409
    const/4 v2, 0x1

    .line 410
    goto/16 :goto_9

    .line 411
    .line 412
    :cond_1c
    :goto_6
    if-ne v7, v2, :cond_1f

    .line 413
    .line 414
    if-ne v15, v4, :cond_1d

    .line 415
    .line 416
    const/4 v7, 0x0

    .line 417
    const/4 v5, 0x0

    .line 418
    move v6, v4

    .line 419
    move-object/from16 v3, p0

    .line 420
    .line 421
    invoke-virtual/range {v3 .. v8}, LR0/e;->h(IIIILQ0/d;)V

    .line 422
    .line 423
    .line 424
    :cond_1d
    invoke-virtual {v8}, LQ0/d;->q()I

    .line 425
    .line 426
    .line 427
    move-result v5

    .line 428
    iget v2, v8, LQ0/d;->W:F

    .line 429
    .line 430
    iget v3, v8, LQ0/d;->X:I

    .line 431
    .line 432
    const/4 v4, -0x1

    .line 433
    if-ne v3, v4, :cond_1e

    .line 434
    .line 435
    div-float v2, v17, v2

    .line 436
    .line 437
    :cond_1e
    int-to-float v3, v5

    .line 438
    mul-float/2addr v3, v2

    .line 439
    add-float/2addr v3, v12

    .line 440
    float-to-int v7, v3

    .line 441
    move v6, v14

    .line 442
    move-object/from16 v3, p0

    .line 443
    .line 444
    move v4, v14

    .line 445
    invoke-virtual/range {v3 .. v8}, LR0/e;->h(IIIILQ0/d;)V

    .line 446
    .line 447
    .line 448
    iget-object v2, v8, LQ0/d;->d:LR0/k;

    .line 449
    .line 450
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 451
    .line 452
    invoke-virtual {v8}, LQ0/d;->q()I

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    invoke-virtual {v2, v3}, LR0/g;->d(I)V

    .line 457
    .line 458
    .line 459
    iget-object v2, v8, LQ0/d;->e:LR0/m;

    .line 460
    .line 461
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 462
    .line 463
    invoke-virtual {v8}, LQ0/d;->k()I

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    invoke-virtual {v2, v3}, LR0/g;->d(I)V

    .line 468
    .line 469
    .line 470
    const/4 v2, 0x1

    .line 471
    iput-boolean v2, v8, LQ0/d;->a:Z

    .line 472
    .line 473
    goto/16 :goto_0

    .line 474
    .line 475
    :cond_1f
    const/4 v2, 0x1

    .line 476
    if-ne v7, v2, :cond_20

    .line 477
    .line 478
    const/4 v7, 0x0

    .line 479
    const/4 v5, 0x0

    .line 480
    move-object/from16 v3, p0

    .line 481
    .line 482
    move v6, v4

    .line 483
    move v4, v15

    .line 484
    invoke-virtual/range {v3 .. v8}, LR0/e;->h(IIIILQ0/d;)V

    .line 485
    .line 486
    .line 487
    iget-object v2, v8, LQ0/d;->e:LR0/m;

    .line 488
    .line 489
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 490
    .line 491
    invoke-virtual {v8}, LQ0/d;->k()I

    .line 492
    .line 493
    .line 494
    move-result v3

    .line 495
    iput v3, v2, LR0/g;->m:I

    .line 496
    .line 497
    goto/16 :goto_0

    .line 498
    .line 499
    :cond_20
    move/from16 v17, v15

    .line 500
    .line 501
    move v15, v4

    .line 502
    const/4 v4, 0x2

    .line 503
    if-ne v7, v4, :cond_24

    .line 504
    .line 505
    aget v4, v3, v2

    .line 506
    .line 507
    if-eq v4, v14, :cond_23

    .line 508
    .line 509
    if-ne v4, v11, :cond_21

    .line 510
    .line 511
    goto :goto_8

    .line 512
    :cond_21
    move/from16 v4, v17

    .line 513
    .line 514
    :cond_22
    :goto_7
    const/4 v2, 0x1

    .line 515
    const/4 v10, 0x3

    .line 516
    goto/16 :goto_9

    .line 517
    .line 518
    :cond_23
    :goto_8
    invoke-virtual {v8}, LQ0/d;->q()I

    .line 519
    .line 520
    .line 521
    move-result v5

    .line 522
    invoke-virtual {v0}, LQ0/d;->k()I

    .line 523
    .line 524
    .line 525
    move-result v2

    .line 526
    int-to-float v2, v2

    .line 527
    mul-float v6, v13, v2

    .line 528
    .line 529
    add-float/2addr v6, v12

    .line 530
    float-to-int v7, v6

    .line 531
    move-object/from16 v3, p0

    .line 532
    .line 533
    move v6, v14

    .line 534
    move/from16 v4, v17

    .line 535
    .line 536
    invoke-virtual/range {v3 .. v8}, LR0/e;->h(IIIILQ0/d;)V

    .line 537
    .line 538
    .line 539
    iget-object v2, v8, LQ0/d;->d:LR0/k;

    .line 540
    .line 541
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 542
    .line 543
    invoke-virtual {v8}, LQ0/d;->q()I

    .line 544
    .line 545
    .line 546
    move-result v3

    .line 547
    invoke-virtual {v2, v3}, LR0/g;->d(I)V

    .line 548
    .line 549
    .line 550
    iget-object v2, v8, LQ0/d;->e:LR0/m;

    .line 551
    .line 552
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 553
    .line 554
    invoke-virtual {v8}, LQ0/d;->k()I

    .line 555
    .line 556
    .line 557
    move-result v3

    .line 558
    invoke-virtual {v2, v3}, LR0/g;->d(I)V

    .line 559
    .line 560
    .line 561
    const/4 v2, 0x1

    .line 562
    iput-boolean v2, v8, LQ0/d;->a:Z

    .line 563
    .line 564
    goto/16 :goto_0

    .line 565
    .line 566
    :cond_24
    move/from16 v18, v4

    .line 567
    .line 568
    move/from16 v4, v17

    .line 569
    .line 570
    aget-object v2, v10, v18

    .line 571
    .line 572
    iget-object v2, v2, LQ0/c;->f:LQ0/c;

    .line 573
    .line 574
    if-eqz v2, :cond_25

    .line 575
    .line 576
    const/16 v20, 0x3

    .line 577
    .line 578
    aget-object v2, v10, v20

    .line 579
    .line 580
    iget-object v2, v2, LQ0/c;->f:LQ0/c;

    .line 581
    .line 582
    if-nez v2, :cond_22

    .line 583
    .line 584
    :cond_25
    const/4 v5, 0x0

    .line 585
    const/4 v7, 0x0

    .line 586
    move-object/from16 v3, p0

    .line 587
    .line 588
    move v4, v15

    .line 589
    invoke-virtual/range {v3 .. v8}, LR0/e;->h(IIIILQ0/d;)V

    .line 590
    .line 591
    .line 592
    iget-object v2, v8, LQ0/d;->d:LR0/k;

    .line 593
    .line 594
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 595
    .line 596
    invoke-virtual {v8}, LQ0/d;->q()I

    .line 597
    .line 598
    .line 599
    move-result v3

    .line 600
    invoke-virtual {v2, v3}, LR0/g;->d(I)V

    .line 601
    .line 602
    .line 603
    iget-object v2, v8, LQ0/d;->e:LR0/m;

    .line 604
    .line 605
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 606
    .line 607
    invoke-virtual {v8}, LQ0/d;->k()I

    .line 608
    .line 609
    .line 610
    move-result v3

    .line 611
    invoke-virtual {v2, v3}, LR0/g;->d(I)V

    .line 612
    .line 613
    .line 614
    const/4 v2, 0x1

    .line 615
    iput-boolean v2, v8, LQ0/d;->a:Z

    .line 616
    .line 617
    goto/16 :goto_0

    .line 618
    .line 619
    :cond_26
    move v2, v15

    .line 620
    move v15, v4

    .line 621
    move v4, v2

    .line 622
    goto :goto_7

    .line 623
    :goto_9
    if-ne v4, v10, :cond_0

    .line 624
    .line 625
    if-ne v6, v10, :cond_0

    .line 626
    .line 627
    if-eq v9, v2, :cond_28

    .line 628
    .line 629
    if-ne v7, v2, :cond_27

    .line 630
    .line 631
    goto :goto_a

    .line 632
    :cond_27
    const/4 v4, 0x2

    .line 633
    if-ne v7, v4, :cond_0

    .line 634
    .line 635
    if-ne v9, v4, :cond_0

    .line 636
    .line 637
    aget v4, v3, v16

    .line 638
    .line 639
    if-ne v4, v14, :cond_0

    .line 640
    .line 641
    aget v3, v3, v2

    .line 642
    .line 643
    if-ne v3, v14, :cond_0

    .line 644
    .line 645
    invoke-virtual {v0}, LQ0/d;->q()I

    .line 646
    .line 647
    .line 648
    move-result v2

    .line 649
    int-to-float v2, v2

    .line 650
    mul-float/2addr v5, v2

    .line 651
    add-float/2addr v5, v12

    .line 652
    float-to-int v5, v5

    .line 653
    invoke-virtual {v0}, LQ0/d;->k()I

    .line 654
    .line 655
    .line 656
    move-result v2

    .line 657
    int-to-float v2, v2

    .line 658
    mul-float v6, v13, v2

    .line 659
    .line 660
    add-float/2addr v6, v12

    .line 661
    float-to-int v7, v6

    .line 662
    move v6, v14

    .line 663
    move-object/from16 v3, p0

    .line 664
    .line 665
    move v4, v14

    .line 666
    invoke-virtual/range {v3 .. v8}, LR0/e;->h(IIIILQ0/d;)V

    .line 667
    .line 668
    .line 669
    iget-object v2, v8, LQ0/d;->d:LR0/k;

    .line 670
    .line 671
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 672
    .line 673
    invoke-virtual {v8}, LQ0/d;->q()I

    .line 674
    .line 675
    .line 676
    move-result v3

    .line 677
    invoke-virtual {v2, v3}, LR0/g;->d(I)V

    .line 678
    .line 679
    .line 680
    iget-object v2, v8, LQ0/d;->e:LR0/m;

    .line 681
    .line 682
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 683
    .line 684
    invoke-virtual {v8}, LQ0/d;->k()I

    .line 685
    .line 686
    .line 687
    move-result v3

    .line 688
    invoke-virtual {v2, v3}, LR0/g;->d(I)V

    .line 689
    .line 690
    .line 691
    const/4 v2, 0x1

    .line 692
    iput-boolean v2, v8, LQ0/d;->a:Z

    .line 693
    .line 694
    goto/16 :goto_0

    .line 695
    .line 696
    :cond_28
    :goto_a
    const/4 v7, 0x0

    .line 697
    const/4 v5, 0x0

    .line 698
    move v6, v15

    .line 699
    move-object/from16 v3, p0

    .line 700
    .line 701
    move v4, v15

    .line 702
    invoke-virtual/range {v3 .. v8}, LR0/e;->h(IIIILQ0/d;)V

    .line 703
    .line 704
    .line 705
    iget-object v2, v8, LQ0/d;->d:LR0/k;

    .line 706
    .line 707
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 708
    .line 709
    invoke-virtual {v8}, LQ0/d;->q()I

    .line 710
    .line 711
    .line 712
    move-result v3

    .line 713
    iput v3, v2, LR0/g;->m:I

    .line 714
    .line 715
    iget-object v2, v8, LQ0/d;->e:LR0/m;

    .line 716
    .line 717
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 718
    .line 719
    invoke-virtual {v8}, LQ0/d;->k()I

    .line 720
    .line 721
    .line 722
    move-result v3

    .line 723
    iput v3, v2, LR0/g;->m:I

    .line 724
    .line 725
    goto/16 :goto_0

    .line 726
    .line 727
    :goto_b
    invoke-virtual {v8}, LQ0/d;->q()I

    .line 728
    .line 729
    .line 730
    move-result v2

    .line 731
    if-ne v4, v11, :cond_29

    .line 732
    .line 733
    invoke-virtual {v0}, LQ0/d;->q()I

    .line 734
    .line 735
    .line 736
    move-result v2

    .line 737
    iget v4, v15, LQ0/c;->g:I

    .line 738
    .line 739
    sub-int/2addr v2, v4

    .line 740
    iget v4, v12, LQ0/c;->g:I

    .line 741
    .line 742
    sub-int/2addr v2, v4

    .line 743
    move v4, v14

    .line 744
    :cond_29
    move v5, v2

    .line 745
    invoke-virtual {v8}, LQ0/d;->k()I

    .line 746
    .line 747
    .line 748
    move-result v2

    .line 749
    if-ne v6, v11, :cond_2a

    .line 750
    .line 751
    invoke-virtual {v0}, LQ0/d;->k()I

    .line 752
    .line 753
    .line 754
    move-result v2

    .line 755
    iget v6, v10, LQ0/c;->g:I

    .line 756
    .line 757
    sub-int/2addr v2, v6

    .line 758
    iget v3, v3, LQ0/c;->g:I

    .line 759
    .line 760
    sub-int/2addr v2, v3

    .line 761
    move v6, v14

    .line 762
    :cond_2a
    move-object/from16 v3, p0

    .line 763
    .line 764
    move v7, v2

    .line 765
    invoke-virtual/range {v3 .. v8}, LR0/e;->h(IIIILQ0/d;)V

    .line 766
    .line 767
    .line 768
    iget-object v2, v8, LQ0/d;->d:LR0/k;

    .line 769
    .line 770
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 771
    .line 772
    invoke-virtual {v8}, LQ0/d;->q()I

    .line 773
    .line 774
    .line 775
    move-result v3

    .line 776
    invoke-virtual {v2, v3}, LR0/g;->d(I)V

    .line 777
    .line 778
    .line 779
    iget-object v2, v8, LQ0/d;->e:LR0/m;

    .line 780
    .line 781
    iget-object v2, v2, LR0/o;->e:LR0/g;

    .line 782
    .line 783
    invoke-virtual {v8}, LQ0/d;->k()I

    .line 784
    .line 785
    .line 786
    move-result v3

    .line 787
    invoke-virtual {v2, v3}, LR0/g;->d(I)V

    .line 788
    .line 789
    .line 790
    const/4 v2, 0x1

    .line 791
    iput-boolean v2, v8, LQ0/d;->a:Z

    .line 792
    .line 793
    goto/16 :goto_0

    .line 794
    .line 795
    :cond_2b
    return-void
.end method

.method public c()V
    .locals 8

    .line 1
    iget-object v0, p0, LR0/e;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LR0/e;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LQ0/e;

    .line 11
    .line 12
    iget-object v2, v1, LQ0/d;->d:LR0/k;

    .line 13
    .line 14
    invoke-virtual {v2}, LR0/k;->f()V

    .line 15
    .line 16
    .line 17
    iget-object v2, v1, LQ0/d;->e:LR0/m;

    .line 18
    .line 19
    invoke-virtual {v2}, LR0/m;->f()V

    .line 20
    .line 21
    .line 22
    iget-object v2, v1, LQ0/d;->d:LR0/k;

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    iget-object v2, v1, LQ0/d;->e:LR0/m;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    iget-object v2, v1, LQ0/e;->q0:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const/4 v3, 0x0

    .line 39
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x1

    .line 44
    const/4 v6, 0x0

    .line 45
    if-eqz v4, :cond_8

    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, LQ0/d;

    .line 52
    .line 53
    instance-of v7, v4, LQ0/h;

    .line 54
    .line 55
    if-eqz v7, :cond_1

    .line 56
    .line 57
    new-instance v5, LR0/i;

    .line 58
    .line 59
    invoke-direct {v5, v4}, LR0/o;-><init>(LQ0/d;)V

    .line 60
    .line 61
    .line 62
    iget-object v6, v4, LQ0/d;->d:LR0/k;

    .line 63
    .line 64
    invoke-virtual {v6}, LR0/k;->f()V

    .line 65
    .line 66
    .line 67
    iget-object v6, v4, LQ0/d;->e:LR0/m;

    .line 68
    .line 69
    invoke-virtual {v6}, LR0/m;->f()V

    .line 70
    .line 71
    .line 72
    check-cast v4, LQ0/h;

    .line 73
    .line 74
    iget v4, v4, LQ0/h;->u0:I

    .line 75
    .line 76
    iput v4, v5, LR0/o;->f:I

    .line 77
    .line 78
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-virtual {v4}, LQ0/d;->x()Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-eqz v7, :cond_4

    .line 87
    .line 88
    iget-object v7, v4, LQ0/d;->b:LR0/c;

    .line 89
    .line 90
    if-nez v7, :cond_2

    .line 91
    .line 92
    new-instance v7, LR0/c;

    .line 93
    .line 94
    invoke-direct {v7, v4, v6}, LR0/c;-><init>(LQ0/d;I)V

    .line 95
    .line 96
    .line 97
    iput-object v7, v4, LQ0/d;->b:LR0/c;

    .line 98
    .line 99
    :cond_2
    if-nez v3, :cond_3

    .line 100
    .line 101
    new-instance v3, Ljava/util/HashSet;

    .line 102
    .line 103
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 104
    .line 105
    .line 106
    :cond_3
    iget-object v6, v4, LQ0/d;->b:LR0/c;

    .line 107
    .line 108
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_4
    iget-object v6, v4, LQ0/d;->d:LR0/k;

    .line 113
    .line 114
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :goto_1
    invoke-virtual {v4}, LQ0/d;->y()Z

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    if-eqz v6, :cond_7

    .line 122
    .line 123
    iget-object v6, v4, LQ0/d;->c:LR0/c;

    .line 124
    .line 125
    if-nez v6, :cond_5

    .line 126
    .line 127
    new-instance v6, LR0/c;

    .line 128
    .line 129
    invoke-direct {v6, v4, v5}, LR0/c;-><init>(LQ0/d;I)V

    .line 130
    .line 131
    .line 132
    iput-object v6, v4, LQ0/d;->c:LR0/c;

    .line 133
    .line 134
    :cond_5
    if-nez v3, :cond_6

    .line 135
    .line 136
    new-instance v3, Ljava/util/HashSet;

    .line 137
    .line 138
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 139
    .line 140
    .line 141
    :cond_6
    iget-object v5, v4, LQ0/d;->c:LR0/c;

    .line 142
    .line 143
    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_7
    iget-object v5, v4, LQ0/d;->e:LR0/m;

    .line 148
    .line 149
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    :goto_2
    instance-of v5, v4, LQ0/i;

    .line 153
    .line 154
    if-eqz v5, :cond_0

    .line 155
    .line 156
    new-instance v5, LR0/j;

    .line 157
    .line 158
    invoke-direct {v5, v4}, LR0/o;-><init>(LQ0/d;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_8
    if-eqz v3, :cond_9

    .line 166
    .line 167
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 168
    .line 169
    .line 170
    :cond_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_a

    .line 179
    .line 180
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    check-cast v3, LR0/o;

    .line 185
    .line 186
    invoke-virtual {v3}, LR0/o;->f()V

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_c

    .line 199
    .line 200
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    check-cast v2, LR0/o;

    .line 205
    .line 206
    iget-object v3, v2, LR0/o;->b:LQ0/d;

    .line 207
    .line 208
    if-ne v3, v1, :cond_b

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_b
    invoke-virtual {v2}, LR0/o;->d()V

    .line 212
    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_c
    iget-object v0, p0, LR0/e;->g:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 220
    .line 221
    .line 222
    iget-object v1, p0, LR0/e;->d:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v1, LQ0/e;

    .line 225
    .line 226
    iget-object v2, v1, LQ0/d;->d:LR0/k;

    .line 227
    .line 228
    invoke-virtual {p0, v2, v6, v0}, LR0/e;->e(LR0/o;ILjava/util/ArrayList;)V

    .line 229
    .line 230
    .line 231
    iget-object v1, v1, LQ0/d;->e:LR0/m;

    .line 232
    .line 233
    invoke-virtual {p0, v1, v5, v0}, LR0/e;->e(LR0/o;ILjava/util/ArrayList;)V

    .line 234
    .line 235
    .line 236
    iput-boolean v6, p0, LR0/e;->b:Z

    .line 237
    .line 238
    return-void
.end method

.method public d(LQ0/e;I)I
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v1, LR0/e;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/4 v7, 0x0

    .line 16
    const-wide/16 v8, 0x0

    .line 17
    .line 18
    :goto_0
    if-ge v7, v4, :cond_d

    .line 19
    .line 20
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v10

    .line 24
    check-cast v10, LR0/l;

    .line 25
    .line 26
    iget-object v10, v10, LR0/l;->a:LR0/o;

    .line 27
    .line 28
    instance-of v11, v10, LR0/c;

    .line 29
    .line 30
    if-eqz v11, :cond_0

    .line 31
    .line 32
    move-object v11, v10

    .line 33
    check-cast v11, LR0/c;

    .line 34
    .line 35
    iget v11, v11, LR0/o;->f:I

    .line 36
    .line 37
    if-eq v11, v2, :cond_2

    .line 38
    .line 39
    :goto_1
    move-object/from16 v18, v3

    .line 40
    .line 41
    move/from16 v16, v4

    .line 42
    .line 43
    move/from16 v17, v7

    .line 44
    .line 45
    const-wide/16 v0, 0x0

    .line 46
    .line 47
    goto/16 :goto_8

    .line 48
    .line 49
    :cond_0
    if-nez v2, :cond_1

    .line 50
    .line 51
    instance-of v11, v10, LR0/k;

    .line 52
    .line 53
    if-nez v11, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    instance-of v11, v10, LR0/m;

    .line 57
    .line 58
    if-nez v11, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    if-nez v2, :cond_3

    .line 62
    .line 63
    iget-object v11, v0, LQ0/d;->d:LR0/k;

    .line 64
    .line 65
    :goto_2
    iget-object v11, v11, LR0/o;->h:LR0/f;

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    iget-object v11, v0, LQ0/d;->e:LR0/m;

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :goto_3
    if-nez v2, :cond_4

    .line 72
    .line 73
    iget-object v12, v0, LQ0/d;->d:LR0/k;

    .line 74
    .line 75
    :goto_4
    iget-object v12, v12, LR0/o;->i:LR0/f;

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_4
    iget-object v12, v0, LQ0/d;->e:LR0/m;

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :goto_5
    iget-object v13, v10, LR0/o;->h:LR0/f;

    .line 82
    .line 83
    iget-object v13, v13, LR0/f;->l:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v11

    .line 89
    iget-object v13, v10, LR0/o;->i:LR0/f;

    .line 90
    .line 91
    iget-object v14, v13, LR0/f;->l:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v12

    .line 97
    invoke-virtual {v10}, LR0/o;->j()J

    .line 98
    .line 99
    .line 100
    move-result-wide v14

    .line 101
    iget-object v5, v10, LR0/o;->h:LR0/f;

    .line 102
    .line 103
    if-eqz v11, :cond_a

    .line 104
    .line 105
    if-eqz v12, :cond_a

    .line 106
    .line 107
    const-wide/16 v0, 0x0

    .line 108
    .line 109
    invoke-static {v5, v0, v1}, LR0/l;->b(LR0/f;J)J

    .line 110
    .line 111
    .line 112
    move-result-wide v11

    .line 113
    move-object v6, v3

    .line 114
    move/from16 v16, v4

    .line 115
    .line 116
    invoke-static {v13, v0, v1}, LR0/l;->a(LR0/f;J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v3

    .line 120
    sub-long/2addr v11, v14

    .line 121
    iget v0, v13, LR0/f;->f:I

    .line 122
    .line 123
    neg-int v1, v0

    .line 124
    move-object/from16 v18, v6

    .line 125
    .line 126
    move/from16 v17, v7

    .line 127
    .line 128
    int-to-long v6, v1

    .line 129
    cmp-long v1, v11, v6

    .line 130
    .line 131
    if-ltz v1, :cond_5

    .line 132
    .line 133
    int-to-long v0, v0

    .line 134
    add-long/2addr v11, v0

    .line 135
    :cond_5
    neg-long v0, v3

    .line 136
    sub-long/2addr v0, v14

    .line 137
    iget v3, v5, LR0/f;->f:I

    .line 138
    .line 139
    int-to-long v3, v3

    .line 140
    sub-long/2addr v0, v3

    .line 141
    cmp-long v6, v0, v3

    .line 142
    .line 143
    if-ltz v6, :cond_6

    .line 144
    .line 145
    sub-long/2addr v0, v3

    .line 146
    :cond_6
    iget-object v3, v10, LR0/o;->b:LQ0/d;

    .line 147
    .line 148
    if-nez v2, :cond_7

    .line 149
    .line 150
    iget v3, v3, LQ0/d;->d0:F

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_7
    const/4 v4, 0x1

    .line 154
    if-ne v2, v4, :cond_8

    .line 155
    .line 156
    iget v3, v3, LQ0/d;->e0:F

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_8
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    const/high16 v3, -0x40800000    # -1.0f

    .line 163
    .line 164
    :goto_6
    const/4 v4, 0x0

    .line 165
    cmpl-float v4, v3, v4

    .line 166
    .line 167
    const/high16 v6, 0x3f800000    # 1.0f

    .line 168
    .line 169
    if-lez v4, :cond_9

    .line 170
    .line 171
    long-to-float v0, v0

    .line 172
    div-float/2addr v0, v3

    .line 173
    long-to-float v1, v11

    .line 174
    sub-float v4, v6, v3

    .line 175
    .line 176
    div-float/2addr v1, v4

    .line 177
    add-float/2addr v1, v0

    .line 178
    float-to-long v0, v1

    .line 179
    goto :goto_7

    .line 180
    :cond_9
    const-wide/16 v0, 0x0

    .line 181
    .line 182
    :goto_7
    long-to-float v0, v0

    .line 183
    mul-float v1, v0, v3

    .line 184
    .line 185
    const/high16 v4, 0x3f000000    # 0.5f

    .line 186
    .line 187
    add-float/2addr v1, v4

    .line 188
    float-to-long v10, v1

    .line 189
    invoke-static {v6, v3, v0, v4}, LN0/a;->b(FFFF)F

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    float-to-long v0, v0

    .line 194
    add-long/2addr v10, v14

    .line 195
    add-long/2addr v10, v0

    .line 196
    iget v0, v5, LR0/f;->f:I

    .line 197
    .line 198
    int-to-long v0, v0

    .line 199
    add-long/2addr v0, v10

    .line 200
    iget v3, v13, LR0/f;->f:I

    .line 201
    .line 202
    int-to-long v3, v3

    .line 203
    sub-long/2addr v0, v3

    .line 204
    goto :goto_8

    .line 205
    :cond_a
    move-object/from16 v18, v3

    .line 206
    .line 207
    move/from16 v16, v4

    .line 208
    .line 209
    move/from16 v17, v7

    .line 210
    .line 211
    if-eqz v11, :cond_b

    .line 212
    .line 213
    iget v0, v5, LR0/f;->f:I

    .line 214
    .line 215
    int-to-long v0, v0

    .line 216
    invoke-static {v5, v0, v1}, LR0/l;->b(LR0/f;J)J

    .line 217
    .line 218
    .line 219
    move-result-wide v0

    .line 220
    iget v3, v5, LR0/f;->f:I

    .line 221
    .line 222
    int-to-long v3, v3

    .line 223
    add-long/2addr v3, v14

    .line 224
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 225
    .line 226
    .line 227
    move-result-wide v0

    .line 228
    goto :goto_8

    .line 229
    :cond_b
    if-eqz v12, :cond_c

    .line 230
    .line 231
    iget v0, v13, LR0/f;->f:I

    .line 232
    .line 233
    int-to-long v0, v0

    .line 234
    invoke-static {v13, v0, v1}, LR0/l;->a(LR0/f;J)J

    .line 235
    .line 236
    .line 237
    move-result-wide v0

    .line 238
    iget v3, v13, LR0/f;->f:I

    .line 239
    .line 240
    neg-int v3, v3

    .line 241
    int-to-long v3, v3

    .line 242
    add-long/2addr v3, v14

    .line 243
    neg-long v0, v0

    .line 244
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 245
    .line 246
    .line 247
    move-result-wide v0

    .line 248
    goto :goto_8

    .line 249
    :cond_c
    iget v0, v5, LR0/f;->f:I

    .line 250
    .line 251
    int-to-long v0, v0

    .line 252
    invoke-virtual {v10}, LR0/o;->j()J

    .line 253
    .line 254
    .line 255
    move-result-wide v3

    .line 256
    add-long/2addr v3, v0

    .line 257
    iget v0, v13, LR0/f;->f:I

    .line 258
    .line 259
    int-to-long v0, v0

    .line 260
    sub-long v0, v3, v0

    .line 261
    .line 262
    :goto_8
    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 263
    .line 264
    .line 265
    move-result-wide v8

    .line 266
    add-int/lit8 v7, v17, 0x1

    .line 267
    .line 268
    move-object/from16 v1, p0

    .line 269
    .line 270
    move-object/from16 v0, p1

    .line 271
    .line 272
    move/from16 v4, v16

    .line 273
    .line 274
    move-object/from16 v3, v18

    .line 275
    .line 276
    goto/16 :goto_0

    .line 277
    .line 278
    :cond_d
    long-to-int v0, v8

    .line 279
    return v0
.end method

.method public e(LR0/o;ILjava/util/ArrayList;)V
    .locals 4

    .line 1
    iget-object v0, p1, LR0/o;->h:LR0/f;

    .line 2
    .line 3
    iget-object v0, v0, LR0/f;->k:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p1, LR0/o;->i:LR0/f;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, LR0/d;

    .line 23
    .line 24
    instance-of v2, v1, LR0/f;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    check-cast v1, LR0/f;

    .line 29
    .line 30
    invoke-virtual {p0, v1, p2, p3, v3}, LR0/e;->a(LR0/f;ILjava/util/ArrayList;LR0/l;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    instance-of v2, v1, LR0/o;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    check-cast v1, LR0/o;

    .line 39
    .line 40
    iget-object v1, v1, LR0/o;->h:LR0/f;

    .line 41
    .line 42
    invoke-virtual {p0, v1, p2, p3, v3}, LR0/e;->a(LR0/f;ILjava/util/ArrayList;LR0/l;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-object v0, v2, LR0/f;->k:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, LR0/d;

    .line 63
    .line 64
    instance-of v2, v1, LR0/f;

    .line 65
    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    check-cast v1, LR0/f;

    .line 69
    .line 70
    invoke-virtual {p0, v1, p2, p3, v3}, LR0/e;->a(LR0/f;ILjava/util/ArrayList;LR0/l;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    instance-of v2, v1, LR0/o;

    .line 75
    .line 76
    if-eqz v2, :cond_3

    .line 77
    .line 78
    check-cast v1, LR0/o;

    .line 79
    .line 80
    iget-object v1, v1, LR0/o;->i:LR0/f;

    .line 81
    .line 82
    invoke-virtual {p0, v1, p2, p3, v3}, LR0/e;->a(LR0/f;ILjava/util/ArrayList;LR0/l;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    const/4 v0, 0x1

    .line 87
    if-ne p2, v0, :cond_7

    .line 88
    .line 89
    check-cast p1, LR0/m;

    .line 90
    .line 91
    iget-object p1, p1, LR0/m;->k:LR0/f;

    .line 92
    .line 93
    iget-object p1, p1, LR0/f;->k:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_7

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, LR0/d;

    .line 110
    .line 111
    instance-of v1, v0, LR0/f;

    .line 112
    .line 113
    if-eqz v1, :cond_6

    .line 114
    .line 115
    check-cast v0, LR0/f;

    .line 116
    .line 117
    invoke-virtual {p0, v0, p2, p3, v3}, LR0/e;->a(LR0/f;ILjava/util/ArrayList;LR0/l;)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_7
    return-void
.end method

.method public declared-synchronized f()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LR0/e;->h:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/lang/Boolean;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :try_start_1
    iget-object v0, p0, LR0/e;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ls8/g;

    .line 18
    .line 19
    invoke-virtual {v0}, Ls8/g;->k()Z

    .line 20
    .line 21
    .line 22
    move-result v0
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    :try_start_2
    invoke-virtual {p0, v0}, LR0/e;->g(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    .line 27
    .line 28
    monitor-exit p0

    .line 29
    return v0

    .line 30
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 31
    throw v0
.end method

.method public g(Z)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p1, "ENABLED"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p1, "DISABLED"

    .line 7
    .line 8
    :goto_0
    iget-object v0, p0, LR0/e;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/lang/Boolean;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const-string v0, "global Firebase setting"

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    iget-boolean v0, p0, LR0/e;->c:Z

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    const-string v0, "firebase_crashlytics_collection_enabled manifest flag"

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    const-string v0, "API"

    .line 25
    .line 26
    :goto_1
    const-string v1, "Crashlytics automatic data collection "

    .line 27
    .line 28
    const-string v2, " by "

    .line 29
    .line 30
    const-string v3, "."

    .line 31
    .line 32
    invoke-static {v1, p1, v2, v0, v3}, LR8/v;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 v0, 0x3

    .line 37
    const-string v1, "FirebaseCrashlytics"

    .line 38
    .line 39
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-static {v1, p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 47
    .line 48
    .line 49
    :cond_3
    return-void
.end method

.method public h(IIIILQ0/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, LR0/e;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LR0/b;

    .line 4
    .line 5
    iput p1, v0, LR0/b;->a:I

    .line 6
    .line 7
    iput p3, v0, LR0/b;->b:I

    .line 8
    .line 9
    iput p2, v0, LR0/b;->c:I

    .line 10
    .line 11
    iput p4, v0, LR0/b;->d:I

    .line 12
    .line 13
    iget-object p1, p0, LR0/e;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, LT0/e;

    .line 16
    .line 17
    invoke-virtual {p1, p5, v0}, LT0/e;->b(LQ0/d;LR0/b;)V

    .line 18
    .line 19
    .line 20
    iget p1, v0, LR0/b;->e:I

    .line 21
    .line 22
    invoke-virtual {p5, p1}, LQ0/d;->O(I)V

    .line 23
    .line 24
    .line 25
    iget p1, v0, LR0/b;->f:I

    .line 26
    .line 27
    invoke-virtual {p5, p1}, LQ0/d;->L(I)V

    .line 28
    .line 29
    .line 30
    iget-boolean p1, v0, LR0/b;->h:Z

    .line 31
    .line 32
    iput-boolean p1, p5, LQ0/d;->E:Z

    .line 33
    .line 34
    iget p1, v0, LR0/b;->g:I

    .line 35
    .line 36
    invoke-virtual {p5, p1}, LQ0/d;->I(I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public i()V
    .locals 15

    .line 1
    iget-object v0, p0, LR0/e;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LQ0/e;

    .line 4
    .line 5
    iget-object v0, v0, LQ0/e;->q0:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_b

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    move-object v7, v1

    .line 22
    check-cast v7, LQ0/d;

    .line 23
    .line 24
    iget-boolean v1, v7, LQ0/d;->a:Z

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v1, v7, LQ0/d;->p0:[I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    aget v8, v1, v2

    .line 33
    .line 34
    const/4 v9, 0x1

    .line 35
    aget v1, v1, v9

    .line 36
    .line 37
    iget v3, v7, LQ0/d;->r:I

    .line 38
    .line 39
    iget v4, v7, LQ0/d;->s:I

    .line 40
    .line 41
    const/4 v5, 0x2

    .line 42
    const/4 v10, 0x3

    .line 43
    if-eq v8, v5, :cond_3

    .line 44
    .line 45
    if-ne v8, v10, :cond_2

    .line 46
    .line 47
    if-ne v3, v9, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v3, v2

    .line 51
    goto :goto_2

    .line 52
    :cond_3
    :goto_1
    move v3, v9

    .line 53
    :goto_2
    if-eq v1, v5, :cond_4

    .line 54
    .line 55
    if-ne v1, v10, :cond_5

    .line 56
    .line 57
    if-ne v4, v9, :cond_5

    .line 58
    .line 59
    :cond_4
    move v2, v9

    .line 60
    :cond_5
    iget-object v4, v7, LQ0/d;->d:LR0/k;

    .line 61
    .line 62
    iget-object v4, v4, LR0/o;->e:LR0/g;

    .line 63
    .line 64
    iget-boolean v6, v4, LR0/f;->j:Z

    .line 65
    .line 66
    iget-object v11, v7, LQ0/d;->e:LR0/m;

    .line 67
    .line 68
    iget-object v11, v11, LR0/o;->e:LR0/g;

    .line 69
    .line 70
    iget-boolean v12, v11, LR0/f;->j:Z

    .line 71
    .line 72
    move v13, v3

    .line 73
    const/4 v3, 0x1

    .line 74
    if-eqz v6, :cond_6

    .line 75
    .line 76
    if-eqz v12, :cond_6

    .line 77
    .line 78
    iget v4, v4, LR0/f;->g:I

    .line 79
    .line 80
    iget v6, v11, LR0/f;->g:I

    .line 81
    .line 82
    move v5, v3

    .line 83
    move-object v2, p0

    .line 84
    invoke-virtual/range {v2 .. v7}, LR0/e;->h(IIIILQ0/d;)V

    .line 85
    .line 86
    .line 87
    iput-boolean v9, v7, LQ0/d;->a:Z

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_6
    if-eqz v6, :cond_8

    .line 91
    .line 92
    if-eqz v2, :cond_8

    .line 93
    .line 94
    iget v4, v4, LR0/f;->g:I

    .line 95
    .line 96
    iget v6, v11, LR0/f;->g:I

    .line 97
    .line 98
    move-object v2, p0

    .line 99
    invoke-virtual/range {v2 .. v7}, LR0/e;->h(IIIILQ0/d;)V

    .line 100
    .line 101
    .line 102
    if-ne v1, v10, :cond_7

    .line 103
    .line 104
    iget-object v1, v7, LQ0/d;->e:LR0/m;

    .line 105
    .line 106
    iget-object v1, v1, LR0/o;->e:LR0/g;

    .line 107
    .line 108
    invoke-virtual {v7}, LQ0/d;->k()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    iput v2, v1, LR0/g;->m:I

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_7
    iget-object v1, v7, LQ0/d;->e:LR0/m;

    .line 116
    .line 117
    iget-object v1, v1, LR0/o;->e:LR0/g;

    .line 118
    .line 119
    invoke-virtual {v7}, LQ0/d;->k()I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    invoke-virtual {v1, v2}, LR0/g;->d(I)V

    .line 124
    .line 125
    .line 126
    iput-boolean v9, v7, LQ0/d;->a:Z

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_8
    move v14, v5

    .line 130
    move v5, v3

    .line 131
    move v3, v14

    .line 132
    if-eqz v12, :cond_a

    .line 133
    .line 134
    if-eqz v13, :cond_a

    .line 135
    .line 136
    iget v4, v4, LR0/f;->g:I

    .line 137
    .line 138
    iget v6, v11, LR0/f;->g:I

    .line 139
    .line 140
    move-object v2, p0

    .line 141
    invoke-virtual/range {v2 .. v7}, LR0/e;->h(IIIILQ0/d;)V

    .line 142
    .line 143
    .line 144
    if-ne v8, v10, :cond_9

    .line 145
    .line 146
    iget-object v1, v7, LQ0/d;->d:LR0/k;

    .line 147
    .line 148
    iget-object v1, v1, LR0/o;->e:LR0/g;

    .line 149
    .line 150
    invoke-virtual {v7}, LQ0/d;->q()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    iput v2, v1, LR0/g;->m:I

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_9
    iget-object v1, v7, LQ0/d;->d:LR0/k;

    .line 158
    .line 159
    iget-object v1, v1, LR0/o;->e:LR0/g;

    .line 160
    .line 161
    invoke-virtual {v7}, LQ0/d;->q()I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    invoke-virtual {v1, v2}, LR0/g;->d(I)V

    .line 166
    .line 167
    .line 168
    iput-boolean v9, v7, LQ0/d;->a:Z

    .line 169
    .line 170
    :cond_a
    :goto_3
    iget-boolean v1, v7, LQ0/d;->a:Z

    .line 171
    .line 172
    if-eqz v1, :cond_0

    .line 173
    .line 174
    iget-object v1, v7, LQ0/d;->e:LR0/m;

    .line 175
    .line 176
    iget-object v1, v1, LR0/m;->l:LR0/a;

    .line 177
    .line 178
    if-eqz v1, :cond_0

    .line 179
    .line 180
    iget v2, v7, LQ0/d;->a0:I

    .line 181
    .line 182
    invoke-virtual {v1, v2}, LR0/g;->d(I)V

    .line 183
    .line 184
    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :cond_b
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget v0, p0, LR0/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-boolean v0, p0, LR0/e;->b:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const-string v0, "isRegularFile"

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-boolean v0, p0, LR0/e;->c:Z

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const-string v0, "isDirectory"

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, LR0/e;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/lang/Long;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v3, "byteCount="

    .line 43
    .line 44
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_2
    iget-object v0, p0, LR0/e;->f:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Ljava/lang/Long;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v3, "createdAt="

    .line 66
    .line 67
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :cond_3
    iget-object v0, p0, LR0/e;->g:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Ljava/lang/Long;

    .line 83
    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    new-instance v2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v3, "lastModifiedAt="

    .line 89
    .line 90
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    :cond_4
    iget-object v0, p0, LR0/e;->h:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Ljava/lang/Long;

    .line 106
    .line 107
    if-eqz v0, :cond_5

    .line 108
    .line 109
    new-instance v2, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const-string v3, "lastAccessedAt="

    .line 112
    .line 113
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    :cond_5
    iget-object v0, p0, LR0/e;->i:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Ljava/util/Map;

    .line 129
    .line 130
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-nez v2, :cond_6

    .line 135
    .line 136
    new-instance v2, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v3, "extras="

    .line 139
    .line 140
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    :cond_6
    const-string v4, ")"

    .line 154
    .line 155
    const/4 v5, 0x0

    .line 156
    const-string v2, ", "

    .line 157
    .line 158
    const-string v3, "FileMetadata("

    .line 159
    .line 160
    const/16 v6, 0x38

    .line 161
    .line 162
    invoke-static/range {v1 .. v6}, Lff/o;->w0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltf/l;I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    return-object v0

    .line 167
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
