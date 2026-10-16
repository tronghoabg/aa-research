.class public final LA7/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, LA7/c1;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayDeque;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object v0, p0, LA7/c1;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LA7/P0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA7/c1;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/c1;->b:Ljava/lang/Object;

    return-void
.end method

.method private final c(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final e(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final f(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final g(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final h(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final i(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final j(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final k(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;)V
    .locals 6

    .line 1
    const-string v0, "FirebaseMessaging"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_3

    .line 9
    .line 10
    const-string v2, "google.message_id"

    .line 11
    .line 12
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    const-string v2, "message_id"

    .line 19
    .line 20
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :cond_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    if-nez v3, :cond_2

    .line 29
    .line 30
    iget-object v3, p0, LA7/c1;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Ljava/util/ArrayDeque;

    .line 33
    .line 34
    :try_start_1
    invoke-virtual {v3, v2}, Ljava/util/ArrayDeque;->contains(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_1
    invoke-virtual {v3, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_2
    const-string v2, "gcm.n.analytics_data"

    .line 46
    .line 47
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 48
    .line 49
    .line 50
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 51
    goto :goto_0

    .line 52
    :catch_0
    move-exception p1

    .line 53
    const-string v2, "Failed trying to get analytics data from Intent extras."

    .line 54
    .line 55
    invoke-static {v0, v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_0
    const-string p1, "1"

    .line 59
    .line 60
    if-nez v1, :cond_4

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    goto :goto_1

    .line 64
    :cond_4
    const-string v2, "google.c.a.e"

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    :goto_1
    if-eqz v2, :cond_a

    .line 75
    .line 76
    if-nez v1, :cond_5

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_5
    const-string v2, "google.c.a.tc"

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    const/4 v2, 0x3

    .line 90
    if-eqz p1, :cond_8

    .line 91
    .line 92
    invoke-static {}, Ls8/g;->e()Ls8/g;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const-class v3, Lw8/d;

    .line 97
    .line 98
    invoke-virtual {p1, v3}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, Lw8/d;

    .line 103
    .line 104
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_6

    .line 109
    .line 110
    const-string v2, "Received event with track-conversion=true. Setting user property and reengagement event"

    .line 111
    .line 112
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    :cond_6
    if-eqz p1, :cond_7

    .line 116
    .line 117
    const-string v0, "google.c.a.c_id"

    .line 118
    .line 119
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const-string v2, "fcm"

    .line 124
    .line 125
    invoke-interface {p1, v2, v0}, Lw8/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    new-instance v3, Landroid/os/Bundle;

    .line 129
    .line 130
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 131
    .line 132
    .line 133
    const-string v4, "source"

    .line 134
    .line 135
    const-string v5, "Firebase"

    .line 136
    .line 137
    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    const-string v4, "medium"

    .line 141
    .line 142
    const-string v5, "notification"

    .line 143
    .line 144
    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    const-string v4, "campaign"

    .line 148
    .line 149
    invoke-virtual {v3, v4, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const-string v0, "_cmp"

    .line 153
    .line 154
    invoke-interface {p1, v2, v0, v3}, Lw8/d;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_7
    const-string p1, "Unable to set user property for conversion tracking:  analytics library is missing"

    .line 159
    .line 160
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_8
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_9

    .line 169
    .line 170
    const-string p1, "Received event with track-conversion=false. Do not set user property"

    .line 171
    .line 172
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    .line 174
    .line 175
    :cond_9
    :goto_2
    const-string p1, "_no"

    .line 176
    .line 177
    invoke-static {v1, p1}, Lp7/b;->L(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    :cond_a
    :goto_3
    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 9

    .line 1
    iget v0, p0, LA7/c1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v0, 0x19

    .line 16
    .line 17
    if-gt p2, v0, :cond_1

    .line 18
    .line 19
    new-instance p2, Landroid/os/Handler;

    .line 20
    .line 21
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, LT3/r;

    .line 29
    .line 30
    const/16 v1, 0x10

    .line 31
    .line 32
    invoke-direct {v0, v1, p0, p1}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {p0, p1}, LA7/c1;->a(Landroid/content/Intent;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    return-void

    .line 43
    :pswitch_0
    iget-object v0, p0, LA7/c1;->b:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v1, v0

    .line 46
    check-cast v1, LA7/P0;

    .line 47
    .line 48
    :try_start_0
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 53
    .line 54
    const-string v2, "onActivityCreated"

    .line 55
    .line 56
    invoke-virtual {v0, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    invoke-virtual {v1}, LA7/B;->f0()LA7/i1;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0, p1, p2}, LA7/i1;->p0(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_9

    .line 73
    .line 74
    :cond_2
    :try_start_1
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    invoke-virtual {v2}, Landroid/net/Uri;->isHierarchical()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_3

    .line 85
    .line 86
    :goto_1
    move-object v6, v2

    .line 87
    goto :goto_2

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    goto/16 :goto_a

    .line 90
    .line 91
    :catch_0
    move-exception v0

    .line 92
    goto :goto_8

    .line 93
    :cond_3
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    if-eqz v2, :cond_4

    .line 98
    .line 99
    const-string v3, "com.android.vending.referral_url"

    .line 100
    .line 101
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-nez v3, :cond_4

    .line 110
    .line 111
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    goto :goto_1

    .line 116
    :cond_4
    const/4 v2, 0x0

    .line 117
    goto :goto_1

    .line 118
    :goto_2
    if-eqz v6, :cond_8

    .line 119
    .line 120
    invoke-virtual {v6}, Landroid/net/Uri;->isHierarchical()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-nez v2, :cond_5

    .line 125
    .line 126
    goto :goto_7

    .line 127
    :cond_5
    invoke-virtual {v1}, LA7/B0;->b0()LA7/U1;

    .line 128
    .line 129
    .line 130
    invoke-static {v0}, LA7/U1;->L0(Landroid/content/Intent;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_6

    .line 135
    .line 136
    const-string v0, "gs"

    .line 137
    .line 138
    :goto_3
    move-object v7, v0

    .line 139
    goto :goto_4

    .line 140
    :cond_6
    const-string v0, "auto"

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :goto_4
    const-string v0, "referrer"

    .line 144
    .line 145
    invoke-virtual {v6, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    if-nez p2, :cond_7

    .line 150
    .line 151
    const/4 v0, 0x1

    .line 152
    :goto_5
    move v5, v0

    .line 153
    goto :goto_6

    .line 154
    :cond_7
    const/4 v0, 0x0

    .line 155
    goto :goto_5

    .line 156
    :goto_6
    invoke-virtual {v1}, LA7/B0;->zzl()LA7/k0;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    new-instance v3, LA7/A0;

    .line 161
    .line 162
    move-object v4, p0

    .line 163
    invoke-direct/range {v3 .. v8}, LA7/A0;-><init>(LA7/c1;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v3}, LA7/k0;->m0(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1}, LA7/B;->f0()LA7/i1;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v0, p1, p2}, LA7/i1;->p0(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 174
    .line 175
    .line 176
    goto :goto_9

    .line 177
    :cond_8
    :goto_7
    invoke-virtual {v1}, LA7/B;->f0()LA7/i1;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v0, p1, p2}, LA7/i1;->p0(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 182
    .line 183
    .line 184
    goto :goto_9

    .line 185
    :goto_8
    :try_start_2
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 190
    .line 191
    const-string v3, "Throwable caught in onActivityCreated"

    .line 192
    .line 193
    invoke-virtual {v2, v3, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1}, LA7/B;->f0()LA7/i1;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {v0, p1, p2}, LA7/i1;->p0(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 201
    .line 202
    .line 203
    :goto_9
    return-void

    .line 204
    :goto_a
    invoke-virtual {v1}, LA7/B;->f0()LA7/i1;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {v1, p1, p2}, LA7/i1;->p0(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 209
    .line 210
    .line 211
    throw v0

    .line 212
    nop

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget v0, p0, LA7/c1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, LA7/c1;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LA7/P0;

    .line 10
    .line 11
    invoke-virtual {v0}, LA7/B;->f0()LA7/i1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, v0, LA7/i1;->l:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v1

    .line 18
    :try_start_0
    iget-object v2, v0, LA7/i1;->g:Landroid/app/Activity;

    .line 19
    .line 20
    if-ne p1, v2, :cond_0

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    iput-object v2, v0, LA7/i1;->g:Landroid/app/Activity;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_2

    .line 28
    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    iget-object v1, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, LA7/n0;

    .line 32
    .line 33
    iget-object v1, v1, LA7/n0;->g:LA7/e;

    .line 34
    .line 35
    invoke-virtual {v1}, LA7/e;->q0()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    iget-object v0, v0, LA7/i1;->f:Lj$/util/concurrent/ConcurrentHashMap;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    :goto_1
    return-void

    .line 56
    :goto_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    throw p1

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 5

    .line 1
    iget v0, p0, LA7/c1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, LA7/c1;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LA7/P0;

    .line 10
    .line 11
    invoke-virtual {v0}, LA7/B;->f0()LA7/i1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, v0, LA7/i1;->l:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v1

    .line 18
    const/4 v2, 0x0

    .line 19
    :try_start_0
    iput-boolean v2, v0, LA7/i1;->k:Z

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    iput-boolean v2, v0, LA7/i1;->h:Z

    .line 23
    .line 24
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    iget-object v1, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, LA7/n0;

    .line 28
    .line 29
    iget-object v1, v1, LA7/n0;->n:Ln7/b;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    iget-object v3, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, LA7/n0;

    .line 41
    .line 42
    iget-object v3, v3, LA7/n0;->g:LA7/e;

    .line 43
    .line 44
    invoke-virtual {v3}, LA7/e;->q0()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const/4 v4, 0x0

    .line 49
    if-nez v3, :cond_0

    .line 50
    .line 51
    iput-object v4, v0, LA7/i1;->c:LA7/j1;

    .line 52
    .line 53
    invoke-virtual {v0}, LA7/B0;->zzl()LA7/k0;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v3, LA7/A;

    .line 58
    .line 59
    const/4 v4, 0x1

    .line 60
    invoke-direct {v3, v0, v1, v2, v4}, LA7/A;-><init>(Ljava/lang/Object;JI)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v3}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {v0, p1}, LA7/i1;->q0(Landroid/app/Activity;)LA7/j1;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object v3, v0, LA7/i1;->c:LA7/j1;

    .line 72
    .line 73
    iput-object v3, v0, LA7/i1;->d:LA7/j1;

    .line 74
    .line 75
    iput-object v4, v0, LA7/i1;->c:LA7/j1;

    .line 76
    .line 77
    invoke-virtual {v0}, LA7/B0;->zzl()LA7/k0;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    new-instance v4, LA7/T0;

    .line 82
    .line 83
    invoke-direct {v4, v0, p1, v1, v2}, LA7/T0;-><init>(LA7/i1;LA7/j1;J)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v4}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 87
    .line 88
    .line 89
    :goto_0
    iget-object p1, p0, LA7/c1;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p1, LA7/P0;

    .line 92
    .line 93
    invoke-virtual {p1}, LA7/B;->g0()LA7/x1;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iget-object v0, p1, LA7/B0;->a:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, LA7/n0;

    .line 100
    .line 101
    iget-object v0, v0, LA7/n0;->n:Ln7/b;

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 107
    .line 108
    .line 109
    move-result-wide v0

    .line 110
    invoke-virtual {p1}, LA7/B0;->zzl()LA7/k0;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    new-instance v3, LA7/z1;

    .line 115
    .line 116
    const/4 v4, 0x0

    .line 117
    invoke-direct {v3, p1, v0, v1, v4}, LA7/z1;-><init>(LA7/x1;JI)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v3}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :catchall_0
    move-exception p1

    .line 125
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    throw p1

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 6

    .line 1
    iget v0, p0, LA7/c1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, LA7/c1;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LA7/P0;

    .line 10
    .line 11
    invoke-virtual {v0}, LA7/B;->g0()LA7/x1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, LA7/n0;

    .line 18
    .line 19
    iget-object v1, v1, LA7/n0;->n:Ln7/b;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    invoke-virtual {v0}, LA7/B0;->zzl()LA7/k0;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    new-instance v4, LA7/z1;

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    invoke-direct {v4, v0, v1, v2, v5}, LA7/z1;-><init>(LA7/x1;JI)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v4}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, LA7/c1;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, LA7/P0;

    .line 44
    .line 45
    invoke-virtual {v0}, LA7/B;->f0()LA7/i1;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v1, v0, LA7/i1;->l:Ljava/lang/Object;

    .line 50
    .line 51
    monitor-enter v1

    .line 52
    const/4 v2, 0x1

    .line 53
    :try_start_0
    iput-boolean v2, v0, LA7/i1;->k:Z

    .line 54
    .line 55
    iget-object v2, v0, LA7/i1;->g:Landroid/app/Activity;

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    if-eq p1, v2, :cond_0

    .line 59
    .line 60
    iget-object v2, v0, LA7/i1;->l:Ljava/lang/Object;

    .line 61
    .line 62
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    :try_start_1
    iput-object p1, v0, LA7/i1;->g:Landroid/app/Activity;

    .line 64
    .line 65
    iput-boolean v3, v0, LA7/i1;->h:Z

    .line 66
    .line 67
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 68
    :try_start_2
    iget-object v2, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, LA7/n0;

    .line 71
    .line 72
    iget-object v2, v2, LA7/n0;->g:LA7/e;

    .line 73
    .line 74
    invoke-virtual {v2}, LA7/e;->q0()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_0

    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    iput-object v2, v0, LA7/i1;->i:LA7/j1;

    .line 82
    .line 83
    invoke-virtual {v0}, LA7/B0;->zzl()LA7/k0;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    new-instance v4, LA7/k1;

    .line 88
    .line 89
    const/4 v5, 0x1

    .line 90
    invoke-direct {v4, v0, v5}, LA7/k1;-><init>(LA7/i1;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v4}, LA7/k0;->m0(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :catchall_0
    move-exception p1

    .line 98
    goto :goto_2

    .line 99
    :catchall_1
    move-exception p1

    .line 100
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 101
    :try_start_4
    throw p1

    .line 102
    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 103
    iget-object v1, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v1, LA7/n0;

    .line 106
    .line 107
    iget-object v1, v1, LA7/n0;->g:LA7/e;

    .line 108
    .line 109
    invoke-virtual {v1}, LA7/e;->q0()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_1

    .line 114
    .line 115
    iget-object p1, v0, LA7/i1;->i:LA7/j1;

    .line 116
    .line 117
    iput-object p1, v0, LA7/i1;->c:LA7/j1;

    .line 118
    .line 119
    invoke-virtual {v0}, LA7/B0;->zzl()LA7/k0;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    new-instance v1, LA7/k1;

    .line 124
    .line 125
    const/4 v2, 0x0

    .line 126
    invoke-direct {v1, v0, v2}, LA7/k1;-><init>(LA7/i1;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v1}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_1
    invoke-virtual {v0, p1}, LA7/i1;->q0(Landroid/app/Activity;)LA7/j1;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v0, p1, v1, v3}, LA7/i1;->o0(Landroid/app/Activity;LA7/j1;Z)V

    .line 138
    .line 139
    .line 140
    iget-object p1, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p1, LA7/n0;

    .line 143
    .line 144
    invoke-virtual {p1}, LA7/n0;->h()LA7/r;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    iget-object v0, p1, LA7/B0;->a:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, LA7/n0;

    .line 151
    .line 152
    iget-object v0, v0, LA7/n0;->n:Ln7/b;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 158
    .line 159
    .line 160
    move-result-wide v0

    .line 161
    invoke-virtual {p1}, LA7/B0;->zzl()LA7/k0;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    new-instance v3, LA7/A;

    .line 166
    .line 167
    const/4 v4, 0x0

    .line 168
    invoke-direct {v3, p1, v0, v1, v4}, LA7/A;-><init>(Ljava/lang/Object;JI)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v3}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 172
    .line 173
    .line 174
    :goto_1
    return-void

    .line 175
    :goto_2
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 176
    throw p1

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget v0, p0, LA7/c1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, LA7/c1;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LA7/P0;

    .line 10
    .line 11
    invoke-virtual {v0}, LA7/B;->f0()LA7/i1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, LA7/n0;

    .line 18
    .line 19
    iget-object v1, v1, LA7/n0;->g:LA7/e;

    .line 20
    .line 21
    invoke-virtual {v1}, LA7/e;->q0()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    if-nez p2, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, v0, LA7/i1;->f:Lj$/util/concurrent/ConcurrentHashMap;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, LA7/j1;

    .line 46
    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    new-instance v0, Landroid/os/Bundle;

    .line 51
    .line 52
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v1, "id"

    .line 56
    .line 57
    iget-wide v2, p1, LA7/j1;->c:J

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 60
    .line 61
    .line 62
    const-string v1, "name"

    .line 63
    .line 64
    iget-object v2, p1, LA7/j1;->a:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const-string v1, "referrer_name"

    .line 70
    .line 71
    iget-object p1, p1, LA7/j1;->b:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string p1, "com.google.app_measurement.screen_service"

    .line 77
    .line 78
    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    return-void

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iget p1, p0, LA7/c1;->a:I

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iget p1, p0, LA7/c1;->a:I

    return-void
.end method
