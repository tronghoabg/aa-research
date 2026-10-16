.class public abstract LQa/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:LN/O0;

.field public c:LMa/a;

.field public d:I

.field public e:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iput-wide v0, p0, LQa/a;->e:J

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput v0, p0, LQa/a;->d:I

    .line 12
    .line 13
    iput-object p1, p0, LQa/a;->a:Ljava/lang/String;

    .line 14
    .line 15
    new-instance p1, LN/O0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, LQa/a;->b:LN/O0;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public a(LMa/j;LMa/d;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, LQa/a;->b(LMa/j;LMa/d;Lorg/json/JSONObject;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final b(LMa/j;LMa/d;Lorg/json/JSONObject;)V
    .locals 9

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    iget-object p1, p1, LMa/j;->h:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v4, Lorg/json/JSONObject;

    .line 8
    .line 9
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v5, "environment"

    .line 13
    .line 14
    const-string v6, "app"

    .line 15
    .line 16
    invoke-static {v4, v5, v6}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v5, p2, LMa/d;->g:LMa/e;

    .line 20
    .line 21
    const-string v7, "adSessionType"

    .line 22
    .line 23
    invoke-static {v4, v7, v5}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    new-instance v5, Lorg/json/JSONObject;

    .line 27
    .line 28
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v7, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    sget-object v8, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v8, "; "

    .line 42
    .line 43
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    const-string v8, "deviceType"

    .line 56
    .line 57
    invoke-static {v5, v8, v7}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    .line 62
    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    const-string v8, "osVersion"

    .line 67
    .line 68
    invoke-static {v5, v8, v7}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    const-string v7, "Android"

    .line 72
    .line 73
    const-string v8, "os"

    .line 74
    .line 75
    invoke-static {v5, v8, v7}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    const-string v7, "deviceInfo"

    .line 79
    .line 80
    invoke-static {v4, v7, v5}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sget-object v5, Lka/e0;->g:Landroid/app/UiModeManager;

    .line 84
    .line 85
    if-eqz v5, :cond_2

    .line 86
    .line 87
    invoke-virtual {v5}, Landroid/app/UiModeManager;->getCurrentModeType()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eq v5, v3, :cond_1

    .line 92
    .line 93
    if-eq v5, v0, :cond_0

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    move v5, v3

    .line 97
    goto :goto_1

    .line 98
    :cond_1
    move v5, v2

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    :goto_0
    move v5, v1

    .line 101
    :goto_1
    if-eq v5, v3, :cond_5

    .line 102
    .line 103
    if-eq v5, v2, :cond_4

    .line 104
    .line 105
    if-ne v5, v1, :cond_3

    .line 106
    .line 107
    const-string v5, "other"

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_3
    const/4 p1, 0x0

    .line 111
    throw p1

    .line 112
    :cond_4
    const-string v5, "mobile"

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    const-string v5, "ctv"

    .line 116
    .line 117
    :goto_2
    const-string v7, "deviceCategory"

    .line 118
    .line 119
    invoke-static {v4, v7, v5}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    new-instance v5, Lorg/json/JSONArray;

    .line 123
    .line 124
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string v7, "clid"

    .line 128
    .line 129
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 130
    .line 131
    .line 132
    const-string v7, "vlid"

    .line 133
    .line 134
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 135
    .line 136
    .line 137
    const-string v7, "supports"

    .line 138
    .line 139
    invoke-static {v4, v7, v5}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    new-instance v5, Lorg/json/JSONObject;

    .line 143
    .line 144
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 145
    .line 146
    .line 147
    iget-object v7, p2, LMa/d;->a:LMa/i;

    .line 148
    .line 149
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    const-string v7, "partnerName"

    .line 153
    .line 154
    const-string v8, "Unity3d"

    .line 155
    .line 156
    invoke-static {v5, v7, v8}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    const-string v7, "partnerVersion"

    .line 160
    .line 161
    const-string v8, "4.18.0"

    .line 162
    .line 163
    invoke-static {v5, v7, v8}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    const-string v7, "omidNativeInfo"

    .line 167
    .line 168
    invoke-static {v4, v7, v5}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    new-instance v5, Lorg/json/JSONObject;

    .line 172
    .line 173
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 174
    .line 175
    .line 176
    const-string v7, "libraryVersion"

    .line 177
    .line 178
    const-string v8, "1.4.9-Unity3d"

    .line 179
    .line 180
    invoke-static {v5, v7, v8}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    sget-object v7, LOa/f;->b:LOa/f;

    .line 184
    .line 185
    iget-object v7, v7, LOa/f;->a:Landroid/content/Context;

    .line 186
    .line 187
    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    const-string v8, "appId"

    .line 196
    .line 197
    invoke-static {v5, v8, v7}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v4, v6, v5}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iget-object v5, p2, LMa/d;->f:Ljava/lang/String;

    .line 204
    .line 205
    if-eqz v5, :cond_6

    .line 206
    .line 207
    const-string v6, "contentUrl"

    .line 208
    .line 209
    invoke-static {v4, v6, v5}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    :cond_6
    iget-object v5, p2, LMa/d;->e:Ljava/lang/String;

    .line 213
    .line 214
    if-eqz v5, :cond_7

    .line 215
    .line 216
    const-string v6, "customReferenceData"

    .line 217
    .line 218
    invoke-static {v4, v6, v5}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    :cond_7
    new-instance v5, Lorg/json/JSONObject;

    .line 222
    .line 223
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 224
    .line 225
    .line 226
    iget-object p2, p2, LMa/d;->c:Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object p2

    .line 236
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    if-nez v6, :cond_8

    .line 241
    .line 242
    sget-object p2, LOa/g;->a:LOa/g;

    .line 243
    .line 244
    invoke-virtual {p0}, LQa/a;->e()Landroid/webkit/WebView;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    new-array v0, v0, [Ljava/lang/Object;

    .line 249
    .line 250
    const/4 v7, 0x0

    .line 251
    aput-object p1, v0, v7

    .line 252
    .line 253
    aput-object v4, v0, v3

    .line 254
    .line 255
    aput-object v5, v0, v2

    .line 256
    .line 257
    aput-object p3, v0, v1

    .line 258
    .line 259
    const-string p1, "startSession"

    .line 260
    .line 261
    invoke-virtual {p2, v6, p1, v0}, LOa/g;->a(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :cond_8
    invoke-static {p2}, LVa/M6;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    throw p1
.end method

.method public final c(Ljava/util/Date;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v1, "timestamp"

    .line 18
    .line 19
    invoke-static {v0, v1, p1}, LRa/b;->b(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, LOa/g;->a:LOa/g;

    .line 23
    .line 24
    invoke-virtual {p0}, LQa/a;->e()Landroid/webkit/WebView;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x1

    .line 29
    new-array v2, v2, [Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    aput-object v0, v2, v3

    .line 33
    .line 34
    const-string v0, "setLastActivity"

    .line 35
    .line 36
    invoke-virtual {p1, v1, v0, v2}, LOa/g;->a(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, LQa/a;->b:LN/O0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()Landroid/webkit/WebView;
    .locals 1

    .line 1
    iget-object v0, p0, LQa/a;->b:LN/O0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/webkit/WebView;

    .line 8
    .line 9
    return-object v0
.end method

.method public f()V
    .locals 0

    .line 1
    return-void
.end method
