.class public final LW1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:LW1/b;

.field public static final d:Ll8/e0;

.field public static final e:Ll8/j0;


# instance fields
.field public final a:Landroid/util/SparseArray;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    new-instance v2, LW1/b;

    .line 5
    .line 6
    sget-object v3, LW1/a;->d:LW1/a;

    .line 7
    .line 8
    invoke-static {v3}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-direct {v2, v3}, LW1/b;-><init>(Ll8/e0;)V

    .line 13
    .line 14
    .line 15
    sput-object v2, LW1/b;->c:LW1/b;

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const/4 v4, 0x5

    .line 23
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const/4 v5, 0x6

    .line 28
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    new-array v6, v1, [Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    aput-object v3, v6, v7

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    aput-object v4, v6, v3

    .line 39
    .line 40
    aput-object v5, v6, v2

    .line 41
    .line 42
    invoke-static {v1, v6}, Ll8/s;->b(I[Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v6}, Ll8/K;->h(I[Ljava/lang/Object;)Ll8/e0;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sput-object v1, LW1/b;->d:Ll8/e0;

    .line 50
    .line 51
    new-instance v1, LE4/n;

    .line 52
    .line 53
    const/4 v2, 0x4

    .line 54
    invoke-direct {v1, v2, v0}, LE4/n;-><init>(II)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v4, v5}, LE4/n;->v(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    const/16 v2, 0x11

    .line 61
    .line 62
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v1, v2, v5}, LE4/n;->v(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    const/4 v2, 0x7

    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v1, v2, v5}, LE4/n;->v(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    const/16 v2, 0x1e

    .line 78
    .line 79
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    const/16 v3, 0xa

    .line 84
    .line 85
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v1, v2, v3}, LE4/n;->v(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v1, v0, v5}, LE4/n;->v(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    const/16 v0, 0x8

    .line 100
    .line 101
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v1, v5, v2}, LE4/n;->v(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v1, v2, v3}, LE4/n;->v(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    const/16 v2, 0xe

    .line 120
    .line 121
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v1, v2, v0}, LE4/n;->v(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, LE4/n;->e()Ll8/j0;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    sput-object v0, LW1/b;->e:Ll8/j0;

    .line 137
    .line 138
    return-void
.end method

.method public constructor <init>(Ll8/e0;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LW1/b;->a:Landroid/util/SparseArray;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    iget v2, p1, Ll8/e0;->d:I

    .line 14
    .line 15
    if-ge v1, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, LW1/a;

    .line 22
    .line 23
    iget-object v3, p0, LW1/b;->a:Landroid/util/SparseArray;

    .line 24
    .line 25
    iget v4, v2, LW1/a;->a:I

    .line 26
    .line 27
    invoke-virtual {v3, v4, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move p1, v0

    .line 34
    :goto_1
    iget-object v1, p0, LW1/b;->a:Landroid/util/SparseArray;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-ge v0, v1, :cond_1

    .line 41
    .line 42
    iget-object v1, p0, LW1/b;->a:Landroid/util/SparseArray;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, LW1/a;

    .line 49
    .line 50
    iget v1, v1, LW1/a;->b:I

    .line 51
    .line 52
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    iput p1, p0, LW1/b;->b:I

    .line 60
    .line 61
    return-void
.end method

.method public static a(I[I)Ll8/e0;
    .locals 4

    .line 1
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    new-array p1, v1, [I

    .line 9
    .line 10
    :cond_0
    :goto_0
    array-length v2, p1

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    aget v2, p1, v1

    .line 14
    .line 15
    new-instance v3, LW1/a;

    .line 16
    .line 17
    invoke-direct {v3, v2, p0}, LW1/a;-><init>(II)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v3}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {v0}, Ll8/H;->g()Ll8/e0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public static b(Landroid/content/Context;LN1/c;LY9/c;)LW1/b;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    .line 2
    .line 3
    const-string v1, "android.media.action.HDMI_AUDIO_PLUG"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0, v0, p1, p2}, LW1/b;->c(Landroid/content/Context;Landroid/content/Intent;LN1/c;LY9/c;)LW1/b;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static c(Landroid/content/Context;Landroid/content/Intent;LN1/c;LY9/c;)LW1/b;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const-string v4, "audio"

    .line 7
    .line 8
    move-object/from16 v5, p0

    .line 9
    .line 10
    invoke-virtual {v5, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast v4, Landroid/media/AudioManager;

    .line 18
    .line 19
    const/16 v6, 0x21

    .line 20
    .line 21
    if-eqz p3, :cond_0

    .line 22
    .line 23
    move-object/from16 v8, p3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget v7, LQ1/x;->a:I

    .line 27
    .line 28
    const/4 v8, 0x0

    .line 29
    if-lt v7, v6, :cond_2

    .line 30
    .line 31
    :try_start_0
    invoke-virtual/range {p2 .. p2}, LN1/c;->a()Ly3/j;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    iget-object v7, v7, Ly3/j;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v7, Landroid/media/AudioAttributes;

    .line 38
    .line 39
    invoke-static {v4, v7}, LG6/T;->s(Landroid/media/AudioManager;Landroid/media/AudioAttributes;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v7
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v9

    .line 47
    if-eqz v9, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    new-instance v8, LY9/c;

    .line 51
    .line 52
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    check-cast v7, Landroid/media/AudioDeviceInfo;

    .line 57
    .line 58
    const/16 v9, 0x18

    .line 59
    .line 60
    invoke-direct {v8, v7, v9}, LY9/c;-><init>(Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    :catch_0
    :cond_2
    :goto_0
    sget v7, LQ1/x;->a:I

    .line 64
    .line 65
    const-string v9, "android.hardware.type.automotive"

    .line 66
    .line 67
    const/16 v10, 0x17

    .line 68
    .line 69
    sget-object v11, LW1/b;->e:Ll8/j0;

    .line 70
    .line 71
    const/16 v12, 0xc

    .line 72
    .line 73
    if-lt v7, v6, :cond_9

    .line 74
    .line 75
    invoke-static {v5}, LQ1/x;->I(Landroid/content/Context;)Z

    .line 76
    .line 77
    .line 78
    move-result v13

    .line 79
    if-nez v13, :cond_3

    .line 80
    .line 81
    if-lt v7, v10, :cond_9

    .line 82
    .line 83
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    invoke-virtual {v13, v9}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v13

    .line 91
    if-eqz v13, :cond_9

    .line 92
    .line 93
    :cond_3
    invoke-virtual/range {p2 .. p2}, LN1/c;->a()Ly3/j;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget-object v0, v0, Ly3/j;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Landroid/media/AudioAttributes;

    .line 100
    .line 101
    invoke-static {v4, v0}, LG6/T;->C(Landroid/media/AudioManager;Landroid/media/AudioAttributes;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    new-instance v4, LW1/b;

    .line 106
    .line 107
    new-instance v5, Ljava/util/HashMap;

    .line 108
    .line 109
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    new-instance v6, Ljava/util/HashSet;

    .line 117
    .line 118
    filled-new-array {v12}, [I

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-static {v7}, LS3/f;->f([I)Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    invoke-direct {v6, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-ge v2, v1, :cond_7

    .line 137
    .line 138
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-static {v1}, LV1/h;->c(Ljava/lang/Object;)Landroid/media/AudioProfile;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-static {v1}, LV1/h;->b(Landroid/media/AudioProfile;)I

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-ne v6, v3, :cond_4

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_4
    invoke-static {v1}, LV1/h;->x(Landroid/media/AudioProfile;)I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    invoke-static {v6}, LQ1/x;->F(I)Z

    .line 158
    .line 159
    .line 160
    move-result v7

    .line 161
    if-nez v7, :cond_5

    .line 162
    .line 163
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    invoke-virtual {v11, v7}, Ll8/j0;->containsKey(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    if-nez v7, :cond_5

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_5
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    invoke-virtual {v5, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v7

    .line 182
    if-eqz v7, :cond_6

    .line 183
    .line 184
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    check-cast v6, Ljava/util/Set;

    .line 193
    .line 194
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    check-cast v6, Ljava/util/Set;

    .line 198
    .line 199
    invoke-static {v1}, LV1/h;->w(Landroid/media/AudioProfile;)[I

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-static {v1}, LS3/f;->f([I)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-interface {v6, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 208
    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_6
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    new-instance v7, Ljava/util/HashSet;

    .line 216
    .line 217
    invoke-static {v1}, LV1/h;->w(Landroid/media/AudioProfile;)[I

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-static {v1}, LS3/f;->f([I)Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-direct {v7, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    :goto_2
    add-int/2addr v2, v3

    .line 232
    goto :goto_1

    .line 233
    :cond_7
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {v5}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-eqz v2, :cond_8

    .line 250
    .line 251
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    check-cast v2, Ljava/util/Map$Entry;

    .line 256
    .line 257
    new-instance v3, LW1/a;

    .line 258
    .line 259
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    check-cast v5, Ljava/lang/Integer;

    .line 264
    .line 265
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 266
    .line 267
    .line 268
    move-result v5

    .line 269
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    check-cast v2, Ljava/util/Set;

    .line 274
    .line 275
    invoke-direct {v3, v5, v2}, LW1/a;-><init>(ILjava/util/Set;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, v3}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_8
    invoke-virtual {v0}, Ll8/H;->g()Ll8/e0;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-direct {v4, v0}, LW1/b;-><init>(Ll8/e0;)V

    .line 287
    .line 288
    .line 289
    return-object v4

    .line 290
    :cond_9
    const/4 v13, 0x4

    .line 291
    if-lt v7, v10, :cond_11

    .line 292
    .line 293
    if-nez v8, :cond_a

    .line 294
    .line 295
    invoke-virtual {v4, v1}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    goto :goto_4

    .line 300
    :cond_a
    new-array v4, v3, [Landroid/media/AudioDeviceInfo;

    .line 301
    .line 302
    iget-object v8, v8, LY9/c;->b:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v8, Landroid/media/AudioDeviceInfo;

    .line 305
    .line 306
    aput-object v8, v4, v2

    .line 307
    .line 308
    :goto_4
    new-instance v8, Ll8/O;

    .line 309
    .line 310
    invoke-direct {v8, v13}, Ll8/E;-><init>(I)V

    .line 311
    .line 312
    .line 313
    const/16 v14, 0x8

    .line 314
    .line 315
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 316
    .line 317
    .line 318
    move-result-object v14

    .line 319
    const/4 v15, 0x7

    .line 320
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 321
    .line 322
    .line 323
    move-result-object v15

    .line 324
    move/from16 v16, v3

    .line 325
    .line 326
    new-array v3, v1, [Ljava/lang/Integer;

    .line 327
    .line 328
    aput-object v14, v3, v2

    .line 329
    .line 330
    aput-object v15, v3, v16

    .line 331
    .line 332
    iget-object v14, v8, Ll8/O;->d:[Ljava/lang/Object;

    .line 333
    .line 334
    if-eqz v14, :cond_b

    .line 335
    .line 336
    move v14, v2

    .line 337
    :goto_5
    if-ge v14, v1, :cond_c

    .line 338
    .line 339
    aget-object v15, v3, v14

    .line 340
    .line 341
    invoke-virtual {v8, v15}, Ll8/O;->g(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    add-int/lit8 v14, v14, 0x1

    .line 345
    .line 346
    goto :goto_5

    .line 347
    :cond_b
    invoke-virtual {v8, v3}, Ll8/E;->b([Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    :cond_c
    const/16 v3, 0x1f

    .line 351
    .line 352
    if-lt v7, v3, :cond_e

    .line 353
    .line 354
    const/16 v3, 0x1a

    .line 355
    .line 356
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    const/16 v14, 0x1b

    .line 361
    .line 362
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 363
    .line 364
    .line 365
    move-result-object v14

    .line 366
    new-array v15, v1, [Ljava/lang/Integer;

    .line 367
    .line 368
    aput-object v3, v15, v2

    .line 369
    .line 370
    aput-object v14, v15, v16

    .line 371
    .line 372
    iget-object v3, v8, Ll8/O;->d:[Ljava/lang/Object;

    .line 373
    .line 374
    if-eqz v3, :cond_d

    .line 375
    .line 376
    move v3, v2

    .line 377
    :goto_6
    if-ge v3, v1, :cond_e

    .line 378
    .line 379
    aget-object v14, v15, v3

    .line 380
    .line 381
    invoke-virtual {v8, v14}, Ll8/O;->g(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    add-int/lit8 v3, v3, 0x1

    .line 385
    .line 386
    goto :goto_6

    .line 387
    :cond_d
    invoke-virtual {v8, v15}, Ll8/E;->b([Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    :cond_e
    if-lt v7, v6, :cond_f

    .line 391
    .line 392
    const/16 v3, 0x1e

    .line 393
    .line 394
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 395
    .line 396
    .line 397
    move-result-object v3

    .line 398
    invoke-virtual {v8, v3}, Ll8/O;->g(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    :cond_f
    invoke-virtual {v8}, Ll8/O;->i()Ll8/P;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    array-length v6, v4

    .line 406
    move v7, v2

    .line 407
    :goto_7
    if-ge v7, v6, :cond_12

    .line 408
    .line 409
    aget-object v8, v4, v7

    .line 410
    .line 411
    invoke-virtual {v8}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 412
    .line 413
    .line 414
    move-result v8

    .line 415
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 416
    .line 417
    .line 418
    move-result-object v8

    .line 419
    invoke-virtual {v3, v8}, Ll8/F;->contains(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v8

    .line 423
    if-eqz v8, :cond_10

    .line 424
    .line 425
    sget-object v0, LW1/b;->c:LW1/b;

    .line 426
    .line 427
    return-object v0

    .line 428
    :cond_10
    add-int/lit8 v7, v7, 0x1

    .line 429
    .line 430
    goto :goto_7

    .line 431
    :cond_11
    move/from16 v16, v3

    .line 432
    .line 433
    :cond_12
    new-instance v3, Ll8/O;

    .line 434
    .line 435
    invoke-direct {v3, v13}, Ll8/E;-><init>(I)V

    .line 436
    .line 437
    .line 438
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    invoke-virtual {v3, v4}, Ll8/O;->g(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    sget v4, LQ1/x;->a:I

    .line 446
    .line 447
    const/16 v6, 0x1d

    .line 448
    .line 449
    const/16 v7, 0xa

    .line 450
    .line 451
    if-lt v4, v6, :cond_17

    .line 452
    .line 453
    invoke-static {v5}, LQ1/x;->I(Landroid/content/Context;)Z

    .line 454
    .line 455
    .line 456
    move-result v6

    .line 457
    if-nez v6, :cond_13

    .line 458
    .line 459
    if-lt v4, v10, :cond_17

    .line 460
    .line 461
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 462
    .line 463
    .line 464
    move-result-object v4

    .line 465
    invoke-virtual {v4, v9}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 466
    .line 467
    .line 468
    move-result v4

    .line 469
    if-eqz v4, :cond_17

    .line 470
    .line 471
    :cond_13
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    invoke-virtual {v11}, Ll8/j0;->e()Ll8/P;

    .line 476
    .line 477
    .line 478
    move-result-object v2

    .line 479
    invoke-virtual {v2}, Ll8/F;->g()Ll8/t0;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    :cond_14
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 484
    .line 485
    .line 486
    move-result v4

    .line 487
    if-eqz v4, :cond_16

    .line 488
    .line 489
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v4

    .line 493
    check-cast v4, Ljava/lang/Integer;

    .line 494
    .line 495
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 496
    .line 497
    .line 498
    move-result v5

    .line 499
    sget v6, LQ1/x;->a:I

    .line 500
    .line 501
    invoke-static {v5}, LQ1/x;->o(I)I

    .line 502
    .line 503
    .line 504
    move-result v8

    .line 505
    if-ge v6, v8, :cond_15

    .line 506
    .line 507
    goto :goto_8

    .line 508
    :cond_15
    new-instance v6, Landroid/media/AudioFormat$Builder;

    .line 509
    .line 510
    invoke-direct {v6}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v6, v12}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 514
    .line 515
    .line 516
    move-result-object v6

    .line 517
    invoke-virtual {v6, v5}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 518
    .line 519
    .line 520
    move-result-object v5

    .line 521
    const v6, 0xbb80

    .line 522
    .line 523
    .line 524
    invoke-virtual {v5, v6}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    invoke-virtual {v5}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 529
    .line 530
    .line 531
    move-result-object v5

    .line 532
    invoke-virtual/range {p2 .. p2}, LN1/c;->a()Ly3/j;

    .line 533
    .line 534
    .line 535
    move-result-object v6

    .line 536
    iget-object v6, v6, Ly3/j;->b:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast v6, Landroid/media/AudioAttributes;

    .line 539
    .line 540
    invoke-static {v5, v6}, LG5/d;->y(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    .line 541
    .line 542
    .line 543
    move-result v5

    .line 544
    if-eqz v5, :cond_14

    .line 545
    .line 546
    invoke-virtual {v0, v4}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    goto :goto_8

    .line 550
    :cond_16
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    invoke-virtual {v0, v1}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v0}, Ll8/H;->g()Ll8/e0;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-virtual {v3, v0}, Ll8/O;->h(Ljava/util/List;)V

    .line 562
    .line 563
    .line 564
    new-instance v0, LW1/b;

    .line 565
    .line 566
    invoke-virtual {v3}, Ll8/O;->i()Ll8/P;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    invoke-static {v1}, LS3/f;->K(Ljava/util/Collection;)[I

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    invoke-static {v7, v1}, LW1/b;->a(I[I)Ll8/e0;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    invoke-direct {v0, v1}, LW1/b;-><init>(Ll8/e0;)V

    .line 579
    .line 580
    .line 581
    return-object v0

    .line 582
    :cond_17
    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    const-string v4, "use_external_surround_sound_flag"

    .line 587
    .line 588
    invoke-static {v1, v4, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 589
    .line 590
    .line 591
    move-result v4

    .line 592
    move/from16 v5, v16

    .line 593
    .line 594
    if-ne v4, v5, :cond_18

    .line 595
    .line 596
    const/4 v5, 0x1

    .line 597
    goto :goto_9

    .line 598
    :cond_18
    move v5, v2

    .line 599
    :goto_9
    if-nez v5, :cond_1a

    .line 600
    .line 601
    sget-object v4, LQ1/x;->c:Ljava/lang/String;

    .line 602
    .line 603
    const-string v6, "Amazon"

    .line 604
    .line 605
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    move-result v6

    .line 609
    if-nez v6, :cond_1a

    .line 610
    .line 611
    const-string v6, "Xiaomi"

    .line 612
    .line 613
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v4

    .line 617
    if-eqz v4, :cond_19

    .line 618
    .line 619
    goto :goto_a

    .line 620
    :cond_19
    const/4 v4, 0x1

    .line 621
    goto :goto_b

    .line 622
    :cond_1a
    :goto_a
    const-string v4, "external_surround_sound_enabled"

    .line 623
    .line 624
    invoke-static {v1, v4, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 625
    .line 626
    .line 627
    move-result v1

    .line 628
    const/4 v4, 0x1

    .line 629
    if-ne v1, v4, :cond_1b

    .line 630
    .line 631
    sget-object v1, LW1/b;->d:Ll8/e0;

    .line 632
    .line 633
    invoke-virtual {v3, v1}, Ll8/O;->h(Ljava/util/List;)V

    .line 634
    .line 635
    .line 636
    :cond_1b
    :goto_b
    if-eqz v0, :cond_1d

    .line 637
    .line 638
    if-nez v5, :cond_1d

    .line 639
    .line 640
    const-string v1, "android.media.extra.AUDIO_PLUG_STATE"

    .line 641
    .line 642
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    if-ne v1, v4, :cond_1d

    .line 647
    .line 648
    const-string v1, "android.media.extra.ENCODINGS"

    .line 649
    .line 650
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    if-eqz v1, :cond_1c

    .line 655
    .line 656
    invoke-static {v1}, LS3/f;->f([I)Ljava/util/List;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    check-cast v1, Ljava/util/List;

    .line 661
    .line 662
    invoke-virtual {v3, v1}, Ll8/O;->h(Ljava/util/List;)V

    .line 663
    .line 664
    .line 665
    :cond_1c
    new-instance v1, LW1/b;

    .line 666
    .line 667
    invoke-virtual {v3}, Ll8/O;->i()Ll8/P;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    invoke-static {v2}, LS3/f;->K(Ljava/util/Collection;)[I

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    const-string v3, "android.media.extra.MAX_CHANNEL_COUNT"

    .line 676
    .line 677
    invoke-virtual {v0, v3, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 678
    .line 679
    .line 680
    move-result v0

    .line 681
    invoke-static {v0, v2}, LW1/b;->a(I[I)Ll8/e0;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    invoke-direct {v1, v0}, LW1/b;-><init>(Ll8/e0;)V

    .line 686
    .line 687
    .line 688
    return-object v1

    .line 689
    :cond_1d
    new-instance v0, LW1/b;

    .line 690
    .line 691
    invoke-virtual {v3}, Ll8/O;->i()Ll8/P;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    invoke-static {v1}, LS3/f;->K(Ljava/util/Collection;)[I

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    invoke-static {v7, v1}, LW1/b;->a(I[I)Ll8/e0;

    .line 700
    .line 701
    .line 702
    move-result-object v1

    .line 703
    invoke-direct {v0, v1}, LW1/b;-><init>(Ll8/e0;)V

    .line 704
    .line 705
    .line 706
    return-object v0
.end method


# virtual methods
.method public final d(LN1/c;LN1/n;)Landroid/util/Pair;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v1, LN1/n;->n:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v3, v1, LN1/n;->k:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v2, v3}, LN1/C;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, LW1/b;->e:Ll8/j0;

    .line 21
    .line 22
    invoke-virtual {v4, v3}, Ll8/j0;->containsKey(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    goto/16 :goto_8

    .line 29
    .line 30
    :cond_0
    const/4 v3, 0x7

    .line 31
    const/4 v5, 0x6

    .line 32
    const/16 v6, 0x8

    .line 33
    .line 34
    const/16 v7, 0x12

    .line 35
    .line 36
    if-ne v2, v7, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, v7}, LW1/b;->e(I)Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-nez v8, :cond_1

    .line 43
    .line 44
    move v2, v5

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    if-ne v2, v6, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0, v6}, LW1/b;->e(I)Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-eqz v8, :cond_3

    .line 53
    .line 54
    :cond_2
    const/16 v8, 0x1e

    .line 55
    .line 56
    if-ne v2, v8, :cond_4

    .line 57
    .line 58
    invoke-virtual {v0, v8}, LW1/b;->e(I)Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-nez v8, :cond_4

    .line 63
    .line 64
    :cond_3
    move v2, v3

    .line 65
    :cond_4
    :goto_0
    invoke-virtual {v0, v2}, LW1/b;->e(I)Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-nez v8, :cond_5

    .line 70
    .line 71
    goto/16 :goto_8

    .line 72
    .line 73
    :cond_5
    iget-object v8, v0, LW1/b;->a:Landroid/util/SparseArray;

    .line 74
    .line 75
    invoke-virtual {v8, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    check-cast v8, LW1/a;

    .line 80
    .line 81
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    const/4 v9, -0x1

    .line 85
    const/4 v10, 0x1

    .line 86
    const/4 v11, 0x0

    .line 87
    const/16 v12, 0xa

    .line 88
    .line 89
    iget v13, v8, LW1/a;->b:I

    .line 90
    .line 91
    iget-object v14, v8, LW1/a;->c:Ll8/P;

    .line 92
    .line 93
    iget v15, v1, LN1/n;->C:I

    .line 94
    .line 95
    if-eq v15, v9, :cond_b

    .line 96
    .line 97
    if-ne v2, v7, :cond_6

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_6
    iget-object v1, v1, LN1/n;->n:Ljava/lang/String;

    .line 101
    .line 102
    const-string v4, "audio/vnd.dts.uhd;profile=p2"

    .line 103
    .line 104
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_7

    .line 109
    .line 110
    sget v1, LQ1/x;->a:I

    .line 111
    .line 112
    const/16 v4, 0x21

    .line 113
    .line 114
    if-ge v1, v4, :cond_7

    .line 115
    .line 116
    if-le v15, v12, :cond_13

    .line 117
    .line 118
    goto/16 :goto_8

    .line 119
    .line 120
    :cond_7
    if-nez v14, :cond_8

    .line 121
    .line 122
    if-gt v15, v13, :cond_a

    .line 123
    .line 124
    move v11, v10

    .line 125
    goto :goto_1

    .line 126
    :cond_8
    invoke-static {v15}, LQ1/x;->q(I)I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-nez v1, :cond_9

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v14, v1}, Ll8/F;->contains(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    :cond_a
    :goto_1
    if-nez v11, :cond_13

    .line 142
    .line 143
    goto/16 :goto_8

    .line 144
    .line 145
    :cond_b
    :goto_2
    iget v1, v1, LN1/n;->D:I

    .line 146
    .line 147
    if-eq v1, v9, :cond_c

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_c
    const v1, 0xbb80

    .line 151
    .line 152
    .line 153
    :goto_3
    if-eqz v14, :cond_d

    .line 154
    .line 155
    move v11, v13

    .line 156
    goto :goto_6

    .line 157
    :cond_d
    sget v7, LQ1/x;->a:I

    .line 158
    .line 159
    const/16 v9, 0x1d

    .line 160
    .line 161
    iget v8, v8, LW1/a;->a:I

    .line 162
    .line 163
    if-lt v7, v9, :cond_10

    .line 164
    .line 165
    :goto_4
    if-lez v12, :cond_12

    .line 166
    .line 167
    invoke-static {v12}, LQ1/x;->q(I)I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-nez v4, :cond_e

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_e
    new-instance v7, Landroid/media/AudioFormat$Builder;

    .line 175
    .line 176
    invoke-direct {v7}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v7, v8}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    invoke-virtual {v7, v1}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    invoke-virtual {v7, v4}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    invoke-virtual {v4}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-virtual/range {p1 .. p1}, LN1/c;->a()Ly3/j;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    iget-object v7, v7, Ly3/j;->b:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v7, Landroid/media/AudioAttributes;

    .line 202
    .line 203
    invoke-static {v4, v7}, LG5/d;->y(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    if-eqz v4, :cond_f

    .line 208
    .line 209
    move v11, v12

    .line 210
    goto :goto_6

    .line 211
    :cond_f
    :goto_5
    add-int/lit8 v12, v12, -0x1

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_10
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    invoke-virtual {v4, v1}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    if-eqz v1, :cond_11

    .line 227
    .line 228
    move-object v7, v1

    .line 229
    :cond_11
    check-cast v7, Ljava/lang/Integer;

    .line 230
    .line 231
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result v11

    .line 235
    :cond_12
    :goto_6
    move v15, v11

    .line 236
    :cond_13
    sget v1, LQ1/x;->a:I

    .line 237
    .line 238
    const/16 v4, 0x1c

    .line 239
    .line 240
    if-gt v1, v4, :cond_15

    .line 241
    .line 242
    if-ne v15, v3, :cond_14

    .line 243
    .line 244
    move v5, v6

    .line 245
    goto :goto_7

    .line 246
    :cond_14
    const/4 v3, 0x3

    .line 247
    if-eq v15, v3, :cond_16

    .line 248
    .line 249
    const/4 v3, 0x4

    .line 250
    if-eq v15, v3, :cond_16

    .line 251
    .line 252
    const/4 v3, 0x5

    .line 253
    if-ne v15, v3, :cond_15

    .line 254
    .line 255
    goto :goto_7

    .line 256
    :cond_15
    move v5, v15

    .line 257
    :cond_16
    :goto_7
    const/16 v3, 0x1a

    .line 258
    .line 259
    if-gt v1, v3, :cond_17

    .line 260
    .line 261
    const-string v1, "fugu"

    .line 262
    .line 263
    sget-object v3, LQ1/x;->b:Ljava/lang/String;

    .line 264
    .line 265
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-eqz v1, :cond_17

    .line 270
    .line 271
    if-ne v5, v10, :cond_17

    .line 272
    .line 273
    const/4 v5, 0x2

    .line 274
    :cond_17
    invoke-static {v5}, LQ1/x;->q(I)I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    if-nez v1, :cond_18

    .line 279
    .line 280
    :goto_8
    const/4 v1, 0x0

    .line 281
    return-object v1

    .line 282
    :cond_18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-static {v2, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    return-object v1
.end method

.method public final e(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, LW1/b;->a:Landroid/util/SparseArray;

    .line 2
    .line 3
    sget v1, LQ1/x;->a:I

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-ltz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    goto :goto_3

    .line 5
    :cond_0
    instance-of v1, p1, LW1/b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    goto :goto_4

    .line 11
    :cond_1
    check-cast p1, LW1/b;

    .line 12
    .line 13
    iget-object v1, p0, LW1/b;->a:Landroid/util/SparseArray;

    .line 14
    .line 15
    iget-object v3, p1, LW1/b;->a:Landroid/util/SparseArray;

    .line 16
    .line 17
    sget v4, LQ1/x;->a:I

    .line 18
    .line 19
    if-nez v1, :cond_4

    .line 20
    .line 21
    if-nez v3, :cond_3

    .line 22
    .line 23
    :cond_2
    move v1, v0

    .line 24
    goto :goto_2

    .line 25
    :cond_3
    :goto_0
    move v1, v2

    .line 26
    goto :goto_2

    .line 27
    :cond_4
    if-nez v3, :cond_5

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_5
    sget v4, LQ1/x;->a:I

    .line 31
    .line 32
    const/16 v5, 0x1f

    .line 33
    .line 34
    if-lt v4, v5, :cond_6

    .line 35
    .line 36
    invoke-static {v1, v3}, LF5/i;->q(Landroid/util/SparseArray;Landroid/util/SparseArray;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    goto :goto_2

    .line 41
    :cond_6
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eq v4, v5, :cond_7

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_7
    move v5, v2

    .line 53
    :goto_1
    if-ge v5, v4, :cond_2

    .line 54
    .line 55
    invoke-virtual {v1, v5}, Landroid/util/SparseArray;->keyAt(I)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    invoke-virtual {v1, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-virtual {v3, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-static {v7, v6}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-nez v6, :cond_8

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_8
    add-int/2addr v5, v0

    .line 75
    goto :goto_1

    .line 76
    :goto_2
    if-eqz v1, :cond_9

    .line 77
    .line 78
    iget v1, p0, LW1/b;->b:I

    .line 79
    .line 80
    iget p1, p1, LW1/b;->b:I

    .line 81
    .line 82
    if-ne v1, p1, :cond_9

    .line 83
    .line 84
    :goto_3
    return v0

    .line 85
    :cond_9
    :goto_4
    return v2
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, LW1/b;->a:Landroid/util/SparseArray;

    .line 2
    .line 3
    sget v1, LQ1/x;->a:I

    .line 4
    .line 5
    const/16 v2, 0x1f

    .line 6
    .line 7
    if-lt v1, v2, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, LF5/i;->d(Landroid/util/SparseArray;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/16 v1, 0x11

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-ge v3, v4, :cond_1

    .line 22
    .line 23
    mul-int/lit8 v1, v1, 0x1f

    .line 24
    .line 25
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    add-int/2addr v4, v1

    .line 30
    mul-int/2addr v4, v2

    .line 31
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Lj$/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-int/2addr v1, v4

    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v0, v1

    .line 44
    :goto_1
    mul-int/2addr v0, v2

    .line 45
    iget v1, p0, LW1/b;->b:I

    .line 46
    .line 47
    add-int/2addr v0, v1

    .line 48
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AudioCapabilities[maxChannelCount="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, LW1/b;->b:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", audioProfiles="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LW1/b;->a:Landroid/util/SparseArray;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "]"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method
