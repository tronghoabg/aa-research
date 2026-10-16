.class public final LZ9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final m:[B


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lt8/c;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Laa/c;

.field public final e:Laa/c;

.field public final f:Laa/c;

.field public final g:Laa/h;

.field public final h:Laa/i;

.field public final i:Laa/k;

.field public final j:LP9/d;

.field public final k:LVa/Y7;

.field public final l:LVa/Za;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, LZ9/d;->m:[B

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LP9/d;Lt8/c;Ljava/util/concurrent/Executor;Laa/c;Laa/c;Laa/c;Laa/h;Laa/i;Laa/k;LVa/Y7;LVa/Za;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ9/d;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, LZ9/d;->j:LP9/d;

    .line 7
    .line 8
    iput-object p3, p0, LZ9/d;->b:Lt8/c;

    .line 9
    .line 10
    iput-object p4, p0, LZ9/d;->c:Ljava/util/concurrent/Executor;

    .line 11
    .line 12
    iput-object p5, p0, LZ9/d;->d:Laa/c;

    .line 13
    .line 14
    iput-object p6, p0, LZ9/d;->e:Laa/c;

    .line 15
    .line 16
    iput-object p7, p0, LZ9/d;->f:Laa/c;

    .line 17
    .line 18
    iput-object p8, p0, LZ9/d;->g:Laa/h;

    .line 19
    .line 20
    iput-object p9, p0, LZ9/d;->h:Laa/i;

    .line 21
    .line 22
    iput-object p10, p0, LZ9/d;->i:Laa/k;

    .line 23
    .line 24
    iput-object p11, p0, LZ9/d;->k:LVa/Y7;

    .line 25
    .line 26
    iput-object p12, p0, LZ9/d;->l:LVa/Za;

    .line 27
    .line 28
    return-void
.end method

.method public static e(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    new-instance v2, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    return-object v0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/tasks/Task;
    .locals 6

    .line 1
    iget-object v0, p0, LZ9/d;->g:Laa/h;

    .line 2
    .line 3
    iget-object v1, v0, Laa/h;->g:Laa/k;

    .line 4
    .line 5
    sget-wide v2, Laa/h;->i:J

    .line 6
    .line 7
    iget-object v1, v1, Laa/k;->a:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    const-string v4, "minimum_fetch_interval_in_seconds"

    .line 10
    .line 11
    invoke-interface {v1, v4, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    new-instance v3, Ljava/util/HashMap;

    .line 16
    .line 17
    iget-object v4, v0, Laa/h;->h:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {v3, v4}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    const-string v4, "BASE/1"

    .line 23
    .line 24
    const-string v5, "X-Firebase-RC-Fetch-Type"

    .line 25
    .line 26
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iget-object v4, v0, Laa/h;->e:Laa/c;

    .line 30
    .line 31
    invoke-virtual {v4}, Laa/c;->b()Lcom/google/android/gms/tasks/Task;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    new-instance v5, LA5/j;

    .line 36
    .line 37
    invoke-direct {v5, v0, v1, v2, v3}, LA5/j;-><init>(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, v0, Laa/h;->c:Ljava/util/concurrent/Executor;

    .line 41
    .line 42
    invoke-virtual {v4, v0, v5}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v1, LM8/i;->a:LM8/i;

    .line 47
    .line 48
    new-instance v2, LV1/c;

    .line 49
    .line 50
    const/16 v3, 0xe

    .line 51
    .line 52
    invoke-direct {v2, v3}, LV1/c;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0
.end method

.method public final b()Ljava/util/HashMap;
    .locals 12

    .line 1
    iget-object v0, p0, LZ9/d;->h:Laa/i;

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Laa/i;->c:Laa/c;

    .line 9
    .line 10
    invoke-static {v2}, Laa/i;->b(Laa/c;)Ljava/util/HashSet;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, Laa/i;->d:Laa/c;

    .line 18
    .line 19
    invoke-static {v2}, Laa/i;->b(Laa/c;)Ljava/util/HashSet;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 24
    .line 25
    .line 26
    new-instance v2, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_6

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Ljava/lang/String;

    .line 46
    .line 47
    iget-object v4, v0, Laa/i;->c:Laa/c;

    .line 48
    .line 49
    invoke-virtual {v4}, Laa/c;->c()Laa/e;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    const/4 v5, 0x0

    .line 54
    if-nez v4, :cond_0

    .line 55
    .line 56
    :catch_0
    move-object v4, v5

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    :try_start_0
    iget-object v4, v4, Laa/e;->b:Lorg/json/JSONObject;

    .line 59
    .line 60
    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    :goto_1
    if-eqz v4, :cond_3

    .line 65
    .line 66
    iget-object v5, v0, Laa/i;->c:Laa/c;

    .line 67
    .line 68
    invoke-virtual {v5}, Laa/c;->c()Laa/e;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    if-nez v5, :cond_1

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_1
    iget-object v6, v0, Laa/i;->a:Ljava/util/HashSet;

    .line 76
    .line 77
    monitor-enter v6

    .line 78
    :try_start_1
    iget-object v7, v0, Laa/i;->a:Ljava/util/HashSet;

    .line 79
    .line 80
    invoke-virtual {v7}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_2

    .line 89
    .line 90
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    check-cast v8, LZ9/i;

    .line 95
    .line 96
    iget-object v9, v0, Laa/i;->b:Ljava/util/concurrent/Executor;

    .line 97
    .line 98
    new-instance v10, LAb/a;

    .line 99
    .line 100
    const/16 v11, 0x11

    .line 101
    .line 102
    invoke-direct {v10, v8, v3, v5, v11}, LAb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v9, v10}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :catchall_0
    move-exception v0

    .line 110
    goto :goto_4

    .line 111
    :cond_2
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    :goto_3
    new-instance v5, Laa/q;

    .line 113
    .line 114
    const/4 v6, 0x2

    .line 115
    invoke-direct {v5, v4, v6}, Laa/q;-><init>(Ljava/lang/String;I)V

    .line 116
    .line 117
    .line 118
    goto :goto_6

    .line 119
    :goto_4
    :try_start_2
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    throw v0

    .line 121
    :cond_3
    iget-object v4, v0, Laa/i;->d:Laa/c;

    .line 122
    .line 123
    invoke-virtual {v4}, Laa/c;->c()Laa/e;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    if-nez v4, :cond_4

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_4
    :try_start_3
    iget-object v4, v4, Laa/e;->b:Lorg/json/JSONObject;

    .line 131
    .line 132
    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v5
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 136
    :catch_1
    :goto_5
    if-eqz v5, :cond_5

    .line 137
    .line 138
    new-instance v4, Laa/q;

    .line 139
    .line 140
    const/4 v6, 0x1

    .line 141
    invoke-direct {v4, v5, v6}, Laa/q;-><init>(Ljava/lang/String;I)V

    .line 142
    .line 143
    .line 144
    move-object v5, v4

    .line 145
    goto :goto_6

    .line 146
    :cond_5
    new-instance v4, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const-string v5, "No value of type \'FirebaseRemoteConfigValue\' exists for parameter key \'"

    .line 149
    .line 150
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v5, "\'."

    .line 157
    .line 158
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    const-string v5, "FirebaseRemoteConfig"

    .line 166
    .line 167
    invoke-static {v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    new-instance v5, Laa/q;

    .line 171
    .line 172
    const-string v4, ""

    .line 173
    .line 174
    const/4 v6, 0x0

    .line 175
    invoke-direct {v5, v4, v6}, Laa/q;-><init>(Ljava/lang/String;I)V

    .line 176
    .line 177
    .line 178
    :goto_6
    invoke-virtual {v2, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :cond_6
    return-object v2
.end method

.method public final c()Laa/p;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, LZ9/d;->i:Laa/k;

    .line 4
    .line 5
    iget-object v3, v2, Laa/k;->b:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v3

    .line 8
    :try_start_0
    iget-object v4, v2, Laa/k;->a:Landroid/content/SharedPreferences;

    .line 9
    .line 10
    const-string v5, "last_fetch_time_in_millis"

    .line 11
    .line 12
    const-wide/16 v6, -0x1

    .line 13
    .line 14
    invoke-interface {v4, v5, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    iget-object v6, v2, Laa/k;->a:Landroid/content/SharedPreferences;

    .line 19
    .line 20
    const-string v7, "last_fetch_status"

    .line 21
    .line 22
    invoke-interface {v6, v7, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    new-instance v7, LC8/j;

    .line 27
    .line 28
    invoke-direct {v7, v0}, LC8/j;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iget-object v8, v2, Laa/k;->a:Landroid/content/SharedPreferences;

    .line 32
    .line 33
    const-string v9, "fetch_timeout_in_seconds"

    .line 34
    .line 35
    const-wide/16 v10, 0x3c

    .line 36
    .line 37
    invoke-interface {v8, v9, v10, v11}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 38
    .line 39
    .line 40
    move-result-wide v8

    .line 41
    const-wide/16 v10, 0x0

    .line 42
    .line 43
    cmp-long v10, v8, v10

    .line 44
    .line 45
    if-ltz v10, :cond_0

    .line 46
    .line 47
    iput-wide v8, v7, LC8/j;->a:J

    .line 48
    .line 49
    iget-object v0, v2, Laa/k;->a:Landroid/content/SharedPreferences;

    .line 50
    .line 51
    const-string v1, "minimum_fetch_interval_in_seconds"

    .line 52
    .line 53
    sget-wide v8, Laa/h;->i:J

    .line 54
    .line 55
    invoke-interface {v0, v1, v8, v9}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    invoke-virtual {v7, v0, v1}, LC8/j;->a(J)V

    .line 60
    .line 61
    .line 62
    new-instance v0, LC8/j;

    .line 63
    .line 64
    invoke-direct {v0, v7}, LC8/j;-><init>(LC8/j;)V

    .line 65
    .line 66
    .line 67
    new-instance v1, Laa/p;

    .line 68
    .line 69
    invoke-direct {v1, v4, v5, v6, v0}, Laa/p;-><init>(JILC8/j;)V

    .line 70
    .line 71
    .line 72
    monitor-exit v3

    .line 73
    return-object v1

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 77
    .line 78
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    new-array v0, v0, [Ljava/lang/Object;

    .line 83
    .line 84
    aput-object v4, v0, v1

    .line 85
    .line 86
    const-string v1, "Fetch connection timeout has to be a non-negative number. %d is an invalid argument"

    .line 87
    .line 88
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw v2

    .line 96
    :goto_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    throw v0
.end method

.method public final d(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ9/d;->k:LVa/Y7;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, LVa/Y7;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Laa/n;

    .line 7
    .line 8
    iput-boolean p1, v1, Laa/n;->e:Z

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LVa/Y7;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
.end method
