.class public final LMa/j;
.super LMa/b;
.source "SourceFile"


# instance fields
.field public final a:LMa/d;

.field public final b:LMa/c;

.field public final c:Ljava/util/ArrayList;

.field public d:LN/O0;

.field public e:LQa/a;

.field public f:Z

.field public g:Z

.field public final h:Ljava/lang/String;

.field public i:Z

.field public j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "^[a-zA-Z0-9 ]+$"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(LMa/c;LMa/d;)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v2, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v2, p0, LMa/j;->c:Ljava/util/ArrayList;

    .line 12
    .line 13
    iput-boolean v1, p0, LMa/j;->f:Z

    .line 14
    .line 15
    iput-boolean v1, p0, LMa/j;->g:Z

    .line 16
    .line 17
    iput-object p1, p0, LMa/j;->b:LMa/c;

    .line 18
    .line 19
    iput-object p2, p0, LMa/j;->a:LMa/d;

    .line 20
    .line 21
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iput-object v2, p0, LMa/j;->h:Ljava/lang/String;

    .line 30
    .line 31
    new-instance v3, LN/O0;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object v3, p0, LMa/j;->d:LN/O0;

    .line 38
    .line 39
    sget-object v3, LMa/e;->b:LMa/e;

    .line 40
    .line 41
    iget-object v4, p2, LMa/d;->g:LMa/e;

    .line 42
    .line 43
    if-eq v4, v3, :cond_1

    .line 44
    .line 45
    sget-object v3, LMa/e;->c:LMa/e;

    .line 46
    .line 47
    if-ne v4, v3, :cond_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    new-instance v3, LQa/c;

    .line 51
    .line 52
    iget-object p2, p2, LMa/d;->d:Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-direct {v3, v2, p2}, LQa/c;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    iput-object v3, p0, LMa/j;->e:LQa/a;

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_1
    :goto_1
    new-instance v3, LQa/b;

    .line 65
    .line 66
    invoke-direct {v3, v2}, LQa/a;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object p2, p2, LMa/d;->b:Landroid/webkit/WebView;

    .line 70
    .line 71
    if-eqz p2, :cond_2

    .line 72
    .line 73
    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Landroid/webkit/WebSettings;->getJavaScriptEnabled()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_2

    .line 82
    .line 83
    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 88
    .line 89
    .line 90
    :cond_2
    new-instance v2, LN/O0;

    .line 91
    .line 92
    invoke-direct {v2, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iput-object v2, v3, LQa/a;->b:LN/O0;

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :goto_2
    iget-object p2, p0, LMa/j;->e:LQa/a;

    .line 99
    .line 100
    invoke-virtual {p2}, LQa/a;->f()V

    .line 101
    .line 102
    .line 103
    sget-object p2, LOa/c;->c:LOa/c;

    .line 104
    .line 105
    iget-object p2, p2, LOa/c;->a:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    iget-object p2, p0, LMa/j;->e:LQa/a;

    .line 111
    .line 112
    sget-object v2, LOa/g;->a:LOa/g;

    .line 113
    .line 114
    invoke-virtual {p2}, LQa/a;->e()Landroid/webkit/WebView;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    new-instance v4, Lorg/json/JSONObject;

    .line 119
    .line 120
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 121
    .line 122
    .line 123
    iget-object v5, p1, LMa/c;->a:LMa/h;

    .line 124
    .line 125
    const-string v6, "impressionOwner"

    .line 126
    .line 127
    invoke-static {v4, v6, v5}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    iget-object v5, p1, LMa/c;->b:LMa/h;

    .line 131
    .line 132
    const-string v6, "mediaEventsOwner"

    .line 133
    .line 134
    invoke-static {v4, v6, v5}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-object v5, p1, LMa/c;->d:LMa/f;

    .line 138
    .line 139
    const-string v6, "creativeType"

    .line 140
    .line 141
    invoke-static {v4, v6, v5}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    iget-object v5, p1, LMa/c;->e:LMa/g;

    .line 145
    .line 146
    const-string v6, "impressionType"

    .line 147
    .line 148
    invoke-static {v4, v6, v5}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    iget-boolean p1, p1, LMa/c;->c:Z

    .line 152
    .line 153
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    const-string v5, "isolateVerificationScripts"

    .line 158
    .line 159
    invoke-static {v4, v5, p1}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p2, LQa/a;->a:Ljava/lang/String;

    .line 163
    .line 164
    const/4 p2, 0x2

    .line 165
    new-array p2, p2, [Ljava/lang/Object;

    .line 166
    .line 167
    aput-object v4, p2, v1

    .line 168
    .line 169
    aput-object p1, p2, v0

    .line 170
    .line 171
    const-string p1, "init"

    .line 172
    .line 173
    invoke-virtual {v2, v3, p1, p2}, LOa/g;->a(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, LMa/j;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const-string v0, "AdView is null"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lr7/e;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LMa/j;->d:LN/O0;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/view/View;

    .line 18
    .line 19
    if-ne v0, p1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    new-instance v0, LN/O0;

    .line 23
    .line 24
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LMa/j;->d:LN/O0;

    .line 28
    .line 29
    iget-object v0, p0, LMa/j;->e:LQa/a;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    iput-wide v1, v0, LQa/a;->e:J

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    iput v1, v0, LQa/a;->d:I

    .line 42
    .line 43
    sget-object v0, LOa/c;->c:LOa/c;

    .line 44
    .line 45
    iget-object v0, v0, LOa/c;->a:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, LMa/j;

    .line 74
    .line 75
    if-eq v1, p0, :cond_2

    .line 76
    .line 77
    iget-object v2, v1, LMa/j;->d:LN/O0;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Landroid/view/View;

    .line 84
    .line 85
    if-ne v2, p1, :cond_2

    .line 86
    .line 87
    iget-object v1, v1, LMa/j;->d:LN/O0;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    :goto_1
    return-void
.end method

.method public final b()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-boolean v2, p0, LMa/j;->f:Z

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iput-boolean v1, p0, LMa/j;->f:Z

    .line 9
    .line 10
    sget-object v2, LOa/c;->c:LOa/c;

    .line 11
    .line 12
    iget-object v3, v2, LOa/c;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-lez v3, :cond_1

    .line 19
    .line 20
    move v3, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move v3, v0

    .line 23
    :goto_0
    iget-object v2, v2, LOa/c;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    if-nez v3, :cond_4

    .line 29
    .line 30
    invoke-static {}, LOa/h;->b()LOa/h;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    sget-object v3, LOa/b;->d:LOa/b;

    .line 38
    .line 39
    iput-object v2, v3, LOa/e;->c:LOa/d;

    .line 40
    .line 41
    iput-boolean v1, v3, LOa/e;->a:Z

    .line 42
    .line 43
    new-instance v4, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 44
    .line 45
    invoke-direct {v4}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {v4}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 49
    .line 50
    .line 51
    iget v4, v4, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 52
    .line 53
    const/16 v5, 0x64

    .line 54
    .line 55
    if-ne v4, v5, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-virtual {v3}, LOa/b;->c()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    :goto_1
    move v4, v1

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move v4, v0

    .line 67
    :goto_2
    iput-boolean v4, v3, LOa/e;->b:Z

    .line 68
    .line 69
    invoke-virtual {v3, v4}, LOa/b;->a(Z)V

    .line 70
    .line 71
    .line 72
    sget-object v3, LSa/a;->g:LSa/a;

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {}, LSa/a;->b()V

    .line 78
    .line 79
    .line 80
    iget-object v2, v2, LOa/h;->c:LNa/a;

    .line 81
    .line 82
    invoke-virtual {v2}, LNa/a;->a()F

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    iput v3, v2, LNa/a;->e:F

    .line 87
    .line 88
    invoke-virtual {v2}, LNa/a;->b()V

    .line 89
    .line 90
    .line 91
    iget-object v3, v2, LNa/a;->a:Landroid/content/Context;

    .line 92
    .line 93
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    sget-object v4, Landroid/provider/Settings$System;->CONTENT_URI:Landroid/net/Uri;

    .line 98
    .line 99
    invoke-virtual {v3, v4, v1, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 100
    .line 101
    .line 102
    :cond_4
    invoke-static {}, LOa/h;->b()LOa/h;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    iget v2, v2, LOa/h;->a:F

    .line 107
    .line 108
    iget-object v3, p0, LMa/j;->e:LQa/a;

    .line 109
    .line 110
    sget-object v4, LOa/g;->a:LOa/g;

    .line 111
    .line 112
    invoke-virtual {v3}, LQa/a;->e()Landroid/webkit/WebView;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    iget-object v3, v3, LQa/a;->a:Ljava/lang/String;

    .line 121
    .line 122
    const/4 v6, 0x2

    .line 123
    new-array v6, v6, [Ljava/lang/Object;

    .line 124
    .line 125
    aput-object v2, v6, v0

    .line 126
    .line 127
    aput-object v3, v6, v1

    .line 128
    .line 129
    const-string v0, "setDeviceVolume"

    .line 130
    .line 131
    invoke-virtual {v4, v5, v0, v6}, LOa/g;->a(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, LMa/j;->e:LQa/a;

    .line 135
    .line 136
    sget-object v1, LOa/a;->f:LOa/a;

    .line 137
    .line 138
    iget-object v1, v1, LOa/a;->b:Ljava/util/Date;

    .line 139
    .line 140
    if-eqz v1, :cond_5

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/util/Date;->clone()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Ljava/util/Date;

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_5
    const/4 v1, 0x0

    .line 150
    :goto_3
    invoke-virtual {v0, v1}, LQa/a;->c(Ljava/util/Date;)V

    .line 151
    .line 152
    .line 153
    iget-object v0, p0, LMa/j;->e:LQa/a;

    .line 154
    .line 155
    iget-object v1, p0, LMa/j;->a:LMa/d;

    .line 156
    .line 157
    invoke-virtual {v0, p0, v1}, LQa/a;->a(LMa/j;LMa/d;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method
