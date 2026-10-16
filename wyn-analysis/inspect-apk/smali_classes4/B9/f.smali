.class public final LB9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingDisplay;
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final a:Lz9/B;

.field public final b:Ljava/util/Map;

.field public final c:LD9/g;

.field public final d:LY9/c;

.field public final e:LY9/c;

.field public final f:LD9/i;

.field public final g:LD9/a;

.field public final h:Landroid/app/Application;

.field public final i:LD9/d;

.field public j:LN9/h;

.field public k:Lz9/E;

.field public l:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lz9/B;Ljava/util/Map;LD9/g;LY9/c;LY9/c;LD9/i;Landroid/app/Application;LD9/a;LD9/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB9/f;->a:Lz9/B;

    .line 5
    .line 6
    iput-object p2, p0, LB9/f;->b:Ljava/util/Map;

    .line 7
    .line 8
    iput-object p3, p0, LB9/f;->c:LD9/g;

    .line 9
    .line 10
    iput-object p4, p0, LB9/f;->d:LY9/c;

    .line 11
    .line 12
    iput-object p5, p0, LB9/f;->e:LY9/c;

    .line 13
    .line 14
    iput-object p6, p0, LB9/f;->f:LD9/i;

    .line 15
    .line 16
    iput-object p7, p0, LB9/f;->h:Landroid/app/Application;

    .line 17
    .line 18
    iput-object p8, p0, LB9/f;->g:LD9/a;

    .line 19
    .line 20
    iput-object p9, p0, LB9/f;->i:LD9/d;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "Pausing activity: "

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, LD9/e;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final c(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "Resumed activity: "

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, LD9/e;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final displayMessage(LN9/h;Lz9/E;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final e(Landroid/app/Activity;)V
    .locals 6

    .line 1
    iget-object v0, p0, LB9/f;->f:LD9/i;

    .line 2
    .line 3
    iget-object v0, v0, LD9/i;->a:LE9/c;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, LE9/c;->j()Landroid/view/ViewGroup;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    :goto_0
    if-eqz v0, :cond_6

    .line 19
    .line 20
    iget-object v0, p0, LB9/f;->c:LD9/g;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    monitor-enter v2

    .line 34
    :try_start_0
    iget-object v3, v0, LD9/g;->b:Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    iget-object v3, v0, LD9/g;->b:Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Ljava/util/Set;

    .line 49
    .line 50
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, LV4/a;

    .line 65
    .line 66
    if-eqz v4, :cond_1

    .line 67
    .line 68
    iget-object v5, v0, LD9/g;->a:Lcom/bumptech/glide/h;

    .line 69
    .line 70
    invoke-virtual {v5, v4}, Lcom/bumptech/glide/h;->c(LV4/a;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    goto :goto_3

    .line 76
    :cond_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    iget-object v0, p0, LB9/f;->f:LD9/i;

    .line 78
    .line 79
    iget-object v2, v0, LD9/i;->a:LE9/c;

    .line 80
    .line 81
    if-nez v2, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    invoke-virtual {v2}, LE9/c;->j()Landroid/view/ViewGroup;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1}, Landroid/view/View;->isShown()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    :goto_2
    const/4 v2, 0x0

    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    const-string v1, "window"

    .line 96
    .line 97
    invoke-virtual {p1, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Landroid/view/WindowManager;

    .line 102
    .line 103
    iget-object v1, v0, LD9/i;->a:LE9/c;

    .line 104
    .line 105
    invoke-virtual {v1}, LE9/c;->j()Landroid/view/ViewGroup;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-interface {p1, v1}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 110
    .line 111
    .line 112
    iput-object v2, v0, LD9/i;->a:LE9/c;

    .line 113
    .line 114
    :cond_4
    iget-object p1, p0, LB9/f;->d:LY9/c;

    .line 115
    .line 116
    iget-object v0, p1, LY9/c;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Landroid/os/CountDownTimer;

    .line 119
    .line 120
    if-eqz v0, :cond_5

    .line 121
    .line 122
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 123
    .line 124
    .line 125
    iput-object v2, p1, LY9/c;->b:Ljava/lang/Object;

    .line 126
    .line 127
    :cond_5
    iget-object p1, p0, LB9/f;->e:LY9/c;

    .line 128
    .line 129
    iget-object v0, p1, LY9/c;->b:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Landroid/os/CountDownTimer;

    .line 132
    .line 133
    if-eqz v0, :cond_6

    .line 134
    .line 135
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 136
    .line 137
    .line 138
    iput-object v2, p1, LY9/c;->b:Ljava/lang/Object;

    .line 139
    .line 140
    return-void

    .line 141
    :goto_3
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    throw p1

    .line 143
    :cond_6
    return-void
.end method

.method public final f(Landroid/app/Activity;)V
    .locals 7

    .line 1
    iget-object v0, p0, LB9/f;->j:LN9/h;

    .line 2
    .line 3
    if-eqz v0, :cond_f

    .line 4
    .line 5
    iget-object v1, p0, LB9/f;->a:Lz9/B;

    .line 6
    .line 7
    iget-boolean v1, v1, Lz9/B;->e:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    iget-object v0, v0, LN9/h;->a:Lcom/google/firebase/inappmessaging/model/MessageType;

    .line 14
    .line 15
    sget-object v1, Lcom/google/firebase/inappmessaging/model/MessageType;->UNSUPPORTED:Lcom/google/firebase/inappmessaging/model/MessageType;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const-string p1, "The message being triggered is not supported by this version of the sdk."

    .line 24
    .line 25
    invoke-static {p1}, LD9/e;->d(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v0, p0, LB9/f;->j:LN9/h;

    .line 30
    .line 31
    iget-object v0, v0, LN9/h;->a:Lcom/google/firebase/inappmessaging/model/MessageType;

    .line 32
    .line 33
    iget-object v1, p0, LB9/f;->h:Landroid/app/Application;

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    const/4 v3, 0x2

    .line 47
    const/4 v4, 0x3

    .line 48
    const/4 v5, 0x4

    .line 49
    const/4 v6, 0x0

    .line 50
    if-ne v1, v2, :cond_6

    .line 51
    .line 52
    sget-object v1, LG9/b;->a:[I

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    aget v0, v1, v0

    .line 59
    .line 60
    if-eq v0, v2, :cond_5

    .line 61
    .line 62
    if-eq v0, v3, :cond_4

    .line 63
    .line 64
    if-eq v0, v4, :cond_3

    .line 65
    .line 66
    if-eq v0, v5, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    const-string v6, "BANNER_PORTRAIT"

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    const-string v6, "IMAGE_ONLY_PORTRAIT"

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    const-string v6, "CARD_PORTRAIT"

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_5
    const-string v6, "MODAL_PORTRAIT"

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_6
    sget-object v1, LG9/b;->a:[I

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    aget v0, v1, v0

    .line 88
    .line 89
    if-eq v0, v2, :cond_a

    .line 90
    .line 91
    if-eq v0, v3, :cond_9

    .line 92
    .line 93
    if-eq v0, v4, :cond_8

    .line 94
    .line 95
    if-eq v0, v5, :cond_7

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_7
    const-string v6, "BANNER_LANDSCAPE"

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_8
    const-string v6, "IMAGE_ONLY_LANDSCAPE"

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_9
    const-string v6, "CARD_LANDSCAPE"

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_a
    const-string v6, "MODAL_LANDSCAPE"

    .line 108
    .line 109
    :goto_0
    iget-object v0, p0, LB9/f;->b:Ljava/util/Map;

    .line 110
    .line 111
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Ldf/a;

    .line 116
    .line 117
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, LD9/k;

    .line 122
    .line 123
    sget-object v1, LB9/e;->a:[I

    .line 124
    .line 125
    iget-object v6, p0, LB9/f;->j:LN9/h;

    .line 126
    .line 127
    iget-object v6, v6, LN9/h;->a:Lcom/google/firebase/inappmessaging/model/MessageType;

    .line 128
    .line 129
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    aget v1, v1, v6

    .line 134
    .line 135
    iget-object v6, p0, LB9/f;->g:LD9/a;

    .line 136
    .line 137
    if-eq v1, v2, :cond_e

    .line 138
    .line 139
    if-eq v1, v3, :cond_d

    .line 140
    .line 141
    if-eq v1, v4, :cond_c

    .line 142
    .line 143
    if-eq v1, v5, :cond_b

    .line 144
    .line 145
    const-string p1, "No bindings found for this message type"

    .line 146
    .line 147
    invoke-static {p1}, LD9/e;->d(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_b
    iget-object v1, p0, LB9/f;->j:LN9/h;

    .line 152
    .line 153
    new-instance v2, LY9/c;

    .line 154
    .line 155
    const/16 v3, 0x8

    .line 156
    .line 157
    const/4 v4, 0x0

    .line 158
    invoke-direct {v2, v3, v4}, LY9/c;-><init>(IZ)V

    .line 159
    .line 160
    .line 161
    new-instance v3, LG9/e;

    .line 162
    .line 163
    iget-object v4, v6, LD9/a;->a:Landroid/app/Application;

    .line 164
    .line 165
    const/4 v5, 0x0

    .line 166
    invoke-direct {v3, v1, v0, v4, v5}, LG9/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 167
    .line 168
    .line 169
    iput-object v3, v2, LY9/c;->b:Ljava/lang/Object;

    .line 170
    .line 171
    invoke-virtual {v2}, LY9/c;->c()LX8/c;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    iget-object v0, v0, LX8/c;->g:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Ldf/a;

    .line 178
    .line 179
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    check-cast v0, LE9/e;

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_c
    iget-object v1, p0, LB9/f;->j:LN9/h;

    .line 187
    .line 188
    new-instance v2, LY9/c;

    .line 189
    .line 190
    const/16 v3, 0x8

    .line 191
    .line 192
    const/4 v4, 0x0

    .line 193
    invoke-direct {v2, v3, v4}, LY9/c;-><init>(IZ)V

    .line 194
    .line 195
    .line 196
    new-instance v3, LG9/e;

    .line 197
    .line 198
    iget-object v4, v6, LD9/a;->a:Landroid/app/Application;

    .line 199
    .line 200
    const/4 v5, 0x0

    .line 201
    invoke-direct {v3, v1, v0, v4, v5}, LG9/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 202
    .line 203
    .line 204
    iput-object v3, v2, LY9/c;->b:Ljava/lang/Object;

    .line 205
    .line 206
    invoke-virtual {v2}, LY9/c;->c()LX8/c;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    iget-object v0, v0, LX8/c;->d:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v0, Ldf/a;

    .line 213
    .line 214
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    check-cast v0, LE9/f;

    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_d
    iget-object v1, p0, LB9/f;->j:LN9/h;

    .line 222
    .line 223
    new-instance v2, LY9/c;

    .line 224
    .line 225
    const/16 v3, 0x8

    .line 226
    .line 227
    const/4 v4, 0x0

    .line 228
    invoke-direct {v2, v3, v4}, LY9/c;-><init>(IZ)V

    .line 229
    .line 230
    .line 231
    new-instance v3, LG9/e;

    .line 232
    .line 233
    iget-object v4, v6, LD9/a;->a:Landroid/app/Application;

    .line 234
    .line 235
    const/4 v5, 0x0

    .line 236
    invoke-direct {v3, v1, v0, v4, v5}, LG9/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 237
    .line 238
    .line 239
    iput-object v3, v2, LY9/c;->b:Ljava/lang/Object;

    .line 240
    .line 241
    invoke-virtual {v2}, LY9/c;->c()LX8/c;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    iget-object v0, v0, LX8/c;->e:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v0, Ldf/a;

    .line 248
    .line 249
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, LE9/g;

    .line 254
    .line 255
    goto :goto_1

    .line 256
    :cond_e
    iget-object v1, p0, LB9/f;->j:LN9/h;

    .line 257
    .line 258
    new-instance v2, LY9/c;

    .line 259
    .line 260
    const/16 v3, 0x8

    .line 261
    .line 262
    const/4 v4, 0x0

    .line 263
    invoke-direct {v2, v3, v4}, LY9/c;-><init>(IZ)V

    .line 264
    .line 265
    .line 266
    new-instance v3, LG9/e;

    .line 267
    .line 268
    iget-object v4, v6, LD9/a;->a:Landroid/app/Application;

    .line 269
    .line 270
    const/4 v5, 0x0

    .line 271
    invoke-direct {v3, v1, v0, v4, v5}, LG9/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 272
    .line 273
    .line 274
    iput-object v3, v2, LY9/c;->b:Ljava/lang/Object;

    .line 275
    .line 276
    invoke-virtual {v2}, LY9/c;->c()LX8/c;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    iget-object v0, v0, LX8/c;->f:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v0, Ldf/a;

    .line 283
    .line 284
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    check-cast v0, LE9/a;

    .line 289
    .line 290
    :goto_1
    const v1, 0x1020002

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    new-instance v2, LA7/w0;

    .line 298
    .line 299
    const/16 v3, 0x9

    .line 300
    .line 301
    invoke-direct {v2, p0, p1, v0, v3}, LA7/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    :cond_f
    :goto_2
    const-string p1, "No active message found to render"

    .line 309
    .line 310
    invoke-static {p1}, LD9/e;->d(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string p2, "Created activity: "

    .line 10
    .line 11
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, LD9/e;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "Destroyed activity: "

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, LD9/e;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget-object v0, p0, LB9/f;->l:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, LB9/f;->a:Lz9/B;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v2, "Unbinding from activity: "

    .line 20
    .line 21
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, LD9/e;->e(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const-string v0, "Removing display event component"

    .line 42
    .line 43
    invoke-static {v0}, Lic/d;->F(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    iput-object v0, v1, Lz9/B;->f:LA5/h;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, LB9/f;->e(Landroid/app/Activity;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, LB9/f;->l:Ljava/lang/String;

    .line 53
    .line 54
    :cond_0
    iget-object v0, v1, Lz9/B;->c:LJ9/j;

    .line 55
    .line 56
    iget-object v1, v0, LJ9/j;->b:Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 59
    .line 60
    .line 61
    iget-object v1, v0, LJ9/j;->e:Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 64
    .line 65
    .line 66
    iget-object v1, v0, LJ9/j;->d:Ljava/util/HashMap;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 69
    .line 70
    .line 71
    iget-object v0, v0, LJ9/j;->c:Ljava/util/HashMap;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p1}, LB9/f;->a(Landroid/app/Activity;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, LB9/f;->c(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LB9/f;->l:Ljava/lang/String;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "Binding to activity: "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, LD9/e;->e(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, LA5/h;

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-direct {v0, v1, p0, p1}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, LB9/f;->a:Lz9/B;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const-string v2, "Setting display event component"

    .line 51
    .line 52
    invoke-static {v2}, Lic/d;->F(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, v1, Lz9/B;->f:LA5/h;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, LB9/f;->l:Ljava/lang/String;

    .line 62
    .line 63
    :cond_1
    iget-object v0, p0, LB9/f;->j:LN9/h;

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {p0, p1}, LB9/f;->f(Landroid/app/Activity;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string p2, "SavedInstance activity: "

    .line 10
    .line 11
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, LD9/e;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "Started activity: "

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, LD9/e;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "Stopped activity: "

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, LD9/e;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
