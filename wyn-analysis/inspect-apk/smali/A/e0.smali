.class public final LA/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/o;
.implements LA7/T;
.implements Lcom/google/android/gms/ads/initialization/InitializationStatus;
.implements LI4/q;
.implements LI4/a;
.implements LB4/b;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lcom/google/android/gms/internal/ads/zzhbm;
.implements LO7/a;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;
.implements Lo2/h;
.implements Lk2/e0;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    iput p1, p0, LA/e0;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance p1, Ljava/util/EnumMap;

    const-class v0, LA7/E0;

    invoke-direct {p1, v0}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object p1, p0, LA/e0;->b:Ljava/lang/Object;

    return-void

    .line 5
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance p1, Lj$/util/concurrent/ConcurrentHashMap;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 7
    iput-object p1, p0, LA/e0;->b:Ljava/lang/Object;

    return-void

    .line 8
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, LA/e0;->b:Ljava/lang/Object;

    return-void

    .line 10
    :sswitch_2
    sget-object p1, Ll8/K;->b:Ll8/I;

    .line 11
    sget-object p1, Ll8/e0;->e:Ll8/e0;

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, LA/e0;->b:Ljava/lang/Object;

    return-void

    .line 14
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x2

    new-array p1, p1, [I

    iput-object p1, p0, LA/e0;->b:Ljava/lang/Object;

    return-void

    .line 15
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    sget-object p1, LY4/m;->a:[C

    .line 17
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1, v0}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 18
    iput-object p1, p0, LA/e0;->b:Ljava/lang/Object;

    return-void

    .line 19
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance p1, LN1/k;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, LN1/k;-><init>(I)V

    iput-object p1, p0, LA/e0;->b:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_5
        0x11 -> :sswitch_4
        0x12 -> :sswitch_3
        0x15 -> :sswitch_2
        0x19 -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, LA/e0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LG5/h;)V
    .locals 3

    const/4 v0, 0x7

    iput v0, p0, LA/e0;->a:I

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    iget v1, p1, LG5/h;->a:I

    .line 41
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    iget v1, p1, LG5/h;->b:I

    .line 42
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    iget v1, p1, LG5/h;->c:I

    .line 43
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    .line 44
    sget v1, Lu6/v;->a:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_0

    .line 45
    iget v2, p1, LG5/h;->d:I

    invoke-static {v0, v2}, LG5/e;->a(Landroid/media/AudioAttributes$Builder;I)V

    :cond_0
    const/16 v2, 0x20

    if-lt v1, v2, :cond_1

    .line 46
    iget p1, p1, LG5/h;->e:I

    invoke-static {v0, p1}, LG5/g;->a(Landroid/media/AudioAttributes$Builder;I)V

    .line 47
    :cond_1
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p1

    iput-object p1, p0, LA/e0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/16 v0, 0x17

    iput v0, p0, LA/e0;->a:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const-string v0, "com.google.android.gms.appid"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, LA/e0;->b:Ljava/lang/Object;

    .line 27
    const-string v1, "com.google.android.gms.appid-no-backup"

    .line 28
    invoke-static {p1}, LY0/e;->getNoBackupFilesDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    .line 29
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 30
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 31
    :cond_0
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 32
    monitor-enter p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    :try_start_1
    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p0

    if-nez p1, :cond_1

    .line 34
    const-string p1, "FirebaseMessaging"

    const-string v0, "App restored, clearing state"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    invoke-virtual {p0}, LA/e0;->m()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 36
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 37
    :goto_0
    const-string v0, "FirebaseMessaging"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 38
    const-string v0, "FirebaseMessaging"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error creating file in no backup dir: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_1
    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, LA/e0;->a:I

    const-string v0, "workDatabase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/e0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, LA/e0;->a:I

    iput-object p1, p0, LA/e0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/EnumMap;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, LA/e0;->a:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/EnumMap;

    const-class v1, LA7/E0;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, LA/e0;->b:Ljava/lang/Object;

    .line 23
    invoke-virtual {v0, p1}, Ljava/util/EnumMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public static j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p0, "|T|"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, "|*"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method


# virtual methods
.method public A(Lo2/j;JJ)V
    .locals 22

    .line 1
    move-wide/from16 v0, p2

    .line 2
    .line 3
    move-wide/from16 v2, p4

    .line 4
    .line 5
    move-object/from16 v6, p1

    .line 6
    .line 7
    check-cast v6, Lo2/p;

    .line 8
    .line 9
    move-object/from16 v7, p0

    .line 10
    .line 11
    iget-object v8, v7, LA/e0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v8, LX1/f;

    .line 14
    .line 15
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v9, Lk2/z;

    .line 19
    .line 20
    iget-wide v10, v6, Lo2/p;->a:J

    .line 21
    .line 22
    iget-object v10, v6, Lo2/p;->d:LS1/z;

    .line 23
    .line 24
    iget-object v10, v10, LS1/z;->c:Landroid/net/Uri;

    .line 25
    .line 26
    invoke-direct {v9, v2, v3}, Lk2/z;-><init>(J)V

    .line 27
    .line 28
    .line 29
    iget-object v10, v8, LX1/f;->m:Lae/d;

    .line 30
    .line 31
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v10, v8, LX1/f;->q:LZ1/d;

    .line 35
    .line 36
    iget v11, v6, Lo2/p;->c:I

    .line 37
    .line 38
    invoke-virtual {v10, v9, v11}, LZ1/d;->d(Lk2/z;I)V

    .line 39
    .line 40
    .line 41
    iget-object v9, v6, Lo2/p;->f:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v9, LY1/c;

    .line 44
    .line 45
    iget-object v10, v8, LX1/f;->H:LY1/c;

    .line 46
    .line 47
    const/4 v11, 0x0

    .line 48
    if-nez v10, :cond_0

    .line 49
    .line 50
    move v10, v11

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object v10, v10, LY1/c;->m:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    :goto_0
    invoke-virtual {v9, v11}, LY1/c;->b(I)LY1/h;

    .line 59
    .line 60
    .line 61
    move-result-object v12

    .line 62
    iget-wide v12, v12, LY1/h;->b:J

    .line 63
    .line 64
    move v14, v11

    .line 65
    :goto_1
    if-ge v14, v10, :cond_1

    .line 66
    .line 67
    iget-object v15, v8, LX1/f;->H:LY1/c;

    .line 68
    .line 69
    invoke-virtual {v15, v14}, LY1/c;->b(I)LY1/h;

    .line 70
    .line 71
    .line 72
    move-result-object v15

    .line 73
    const/16 v17, 0x1

    .line 74
    .line 75
    iget-wide v4, v15, LY1/h;->b:J

    .line 76
    .line 77
    cmp-long v4, v4, v12

    .line 78
    .line 79
    if-gez v4, :cond_2

    .line 80
    .line 81
    add-int/lit8 v14, v14, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    const/16 v17, 0x1

    .line 85
    .line 86
    :cond_2
    iget-boolean v4, v9, LY1/c;->d:Z

    .line 87
    .line 88
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    if-eqz v4, :cond_6

    .line 94
    .line 95
    sub-int/2addr v10, v14

    .line 96
    iget-object v4, v9, LY1/c;->m:Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-le v10, v4, :cond_3

    .line 103
    .line 104
    const-string v0, "DashMediaSource"

    .line 105
    .line 106
    const-string v1, "Loaded out of sync manifest"

    .line 107
    .line 108
    invoke-static {v0, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_3
    iget-wide v4, v8, LX1/f;->N:J

    .line 113
    .line 114
    cmp-long v10, v4, v12

    .line 115
    .line 116
    move-wide/from16 v18, v12

    .line 117
    .line 118
    if-eqz v10, :cond_5

    .line 119
    .line 120
    iget-wide v12, v9, LY1/c;->h:J

    .line 121
    .line 122
    const-wide/16 v20, 0x3e8

    .line 123
    .line 124
    mul-long v12, v12, v20

    .line 125
    .line 126
    cmp-long v4, v12, v4

    .line 127
    .line 128
    if-gtz v4, :cond_5

    .line 129
    .line 130
    const-string v0, "DashMediaSource"

    .line 131
    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v2, "Loaded stale dynamic manifest: "

    .line 135
    .line 136
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget-wide v2, v9, LY1/c;->h:J

    .line 140
    .line 141
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v2, ", "

    .line 145
    .line 146
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    iget-wide v2, v8, LX1/f;->N:J

    .line 150
    .line 151
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-static {v0, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :goto_2
    iget v0, v8, LX1/f;->M:I

    .line 162
    .line 163
    add-int/lit8 v5, v0, 0x1

    .line 164
    .line 165
    iput v5, v8, LX1/f;->M:I

    .line 166
    .line 167
    iget-object v1, v8, LX1/f;->m:Lae/d;

    .line 168
    .line 169
    iget v2, v6, Lo2/p;->c:I

    .line 170
    .line 171
    invoke-virtual {v1, v2}, Lae/d;->g(I)I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-ge v0, v1, :cond_4

    .line 176
    .line 177
    iget v0, v8, LX1/f;->M:I

    .line 178
    .line 179
    add-int/lit8 v0, v0, -0x1

    .line 180
    .line 181
    mul-int/lit16 v0, v0, 0x3e8

    .line 182
    .line 183
    const/16 v1, 0x1388

    .line 184
    .line 185
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    int-to-long v0, v0

    .line 190
    iget-object v2, v8, LX1/f;->D:Landroid/os/Handler;

    .line 191
    .line 192
    iget-object v3, v8, LX1/f;->v:LX1/c;

    .line 193
    .line 194
    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_4
    new-instance v0, Lio/ktor/utils/io/T;

    .line 199
    .line 200
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 201
    .line 202
    .line 203
    iput-object v0, v8, LX1/f;->C:Lio/ktor/utils/io/T;

    .line 204
    .line 205
    return-void

    .line 206
    :cond_5
    iput v11, v8, LX1/f;->M:I

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_6
    move-wide/from16 v18, v12

    .line 210
    .line 211
    :goto_3
    iput-object v9, v8, LX1/f;->H:LY1/c;

    .line 212
    .line 213
    iget-boolean v4, v8, LX1/f;->I:Z

    .line 214
    .line 215
    iget-boolean v5, v9, LY1/c;->d:Z

    .line 216
    .line 217
    and-int/2addr v4, v5

    .line 218
    iput-boolean v4, v8, LX1/f;->I:Z

    .line 219
    .line 220
    sub-long v2, v0, v2

    .line 221
    .line 222
    iput-wide v2, v8, LX1/f;->J:J

    .line 223
    .line 224
    iput-wide v0, v8, LX1/f;->K:J

    .line 225
    .line 226
    iget v0, v8, LX1/f;->O:I

    .line 227
    .line 228
    add-int/2addr v0, v14

    .line 229
    iput v0, v8, LX1/f;->O:I

    .line 230
    .line 231
    iget-object v1, v8, LX1/f;->t:Ljava/lang/Object;

    .line 232
    .line 233
    monitor-enter v1

    .line 234
    :try_start_0
    iget-object v0, v6, Lo2/p;->b:LS1/k;

    .line 235
    .line 236
    iget-object v0, v0, LS1/k;->a:Landroid/net/Uri;

    .line 237
    .line 238
    iget-object v2, v8, LX1/f;->F:Landroid/net/Uri;

    .line 239
    .line 240
    if-ne v0, v2, :cond_8

    .line 241
    .line 242
    iget-object v0, v8, LX1/f;->H:LY1/c;

    .line 243
    .line 244
    iget-object v0, v0, LY1/c;->k:Landroid/net/Uri;

    .line 245
    .line 246
    if-eqz v0, :cond_7

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_7
    iget-object v0, v6, Lo2/p;->d:LS1/z;

    .line 250
    .line 251
    iget-object v0, v0, LS1/z;->c:Landroid/net/Uri;

    .line 252
    .line 253
    :goto_4
    iput-object v0, v8, LX1/f;->F:Landroid/net/Uri;

    .line 254
    .line 255
    goto :goto_5

    .line 256
    :catchall_0
    move-exception v0

    .line 257
    goto/16 :goto_b

    .line 258
    .line 259
    :cond_8
    :goto_5
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 260
    iget-object v0, v8, LX1/f;->H:LY1/c;

    .line 261
    .line 262
    iget-boolean v1, v0, LY1/c;->d:Z

    .line 263
    .line 264
    if-eqz v1, :cond_12

    .line 265
    .line 266
    iget-wide v1, v8, LX1/f;->L:J

    .line 267
    .line 268
    cmp-long v1, v1, v18

    .line 269
    .line 270
    if-nez v1, :cond_12

    .line 271
    .line 272
    iget-object v0, v0, LY1/c;->i:LY1/t;

    .line 273
    .line 274
    if-eqz v0, :cond_11

    .line 275
    .line 276
    iget-object v1, v0, LY1/t;->b:Ljava/lang/String;

    .line 277
    .line 278
    sget v2, LQ1/x;->a:I

    .line 279
    .line 280
    const-string v2, "urn:mpeg:dash:utc:direct:2014"

    .line 281
    .line 282
    invoke-static {v1, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    if-nez v2, :cond_10

    .line 287
    .line 288
    const-string v2, "urn:mpeg:dash:utc:direct:2012"

    .line 289
    .line 290
    invoke-static {v1, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    if-eqz v2, :cond_9

    .line 295
    .line 296
    goto/16 :goto_9

    .line 297
    .line 298
    :cond_9
    const-string v2, "urn:mpeg:dash:utc:http-iso:2014"

    .line 299
    .line 300
    invoke-static {v1, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    const/4 v3, 0x5

    .line 305
    if-nez v2, :cond_f

    .line 306
    .line 307
    const-string v2, "urn:mpeg:dash:utc:http-iso:2012"

    .line 308
    .line 309
    invoke-static {v1, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    if-eqz v2, :cond_a

    .line 314
    .line 315
    goto :goto_8

    .line 316
    :cond_a
    const-string v2, "urn:mpeg:dash:utc:http-xsdate:2014"

    .line 317
    .line 318
    invoke-static {v1, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    if-nez v2, :cond_e

    .line 323
    .line 324
    const-string v2, "urn:mpeg:dash:utc:http-xsdate:2012"

    .line 325
    .line 326
    invoke-static {v1, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-eqz v2, :cond_b

    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_b
    const-string v0, "urn:mpeg:dash:utc:ntp:2014"

    .line 334
    .line 335
    invoke-static {v1, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-nez v0, :cond_d

    .line 340
    .line 341
    const-string v0, "urn:mpeg:dash:utc:ntp:2012"

    .line 342
    .line 343
    invoke-static {v1, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-eqz v0, :cond_c

    .line 348
    .line 349
    goto :goto_6

    .line 350
    :cond_c
    new-instance v0, Ljava/io/IOException;

    .line 351
    .line 352
    const-string v1, "Unsupported UTC timing scheme"

    .line 353
    .line 354
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v8, v0}, LX1/f;->x(Ljava/io/IOException;)V

    .line 358
    .line 359
    .line 360
    return-void

    .line 361
    :cond_d
    :goto_6
    invoke-virtual {v8}, LX1/f;->u()V

    .line 362
    .line 363
    .line 364
    return-void

    .line 365
    :cond_e
    :goto_7
    new-instance v1, Lya/b;

    .line 366
    .line 367
    const/16 v2, 0x1c

    .line 368
    .line 369
    invoke-direct {v1, v2}, Lya/b;-><init>(I)V

    .line 370
    .line 371
    .line 372
    new-instance v2, Lo2/p;

    .line 373
    .line 374
    iget-object v4, v8, LX1/f;->z:LS1/h;

    .line 375
    .line 376
    iget-object v0, v0, LY1/t;->c:Ljava/lang/String;

    .line 377
    .line 378
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-direct {v2, v4, v0, v3, v1}, Lo2/p;-><init>(LS1/h;Landroid/net/Uri;ILo2/o;)V

    .line 383
    .line 384
    .line 385
    new-instance v0, Ly3/j;

    .line 386
    .line 387
    const/16 v1, 0x1a

    .line 388
    .line 389
    invoke-direct {v0, v8, v1}, Ly3/j;-><init>(Ljava/lang/Object;I)V

    .line 390
    .line 391
    .line 392
    iget-object v1, v8, LX1/f;->A:Lo2/m;

    .line 393
    .line 394
    move/from16 v3, v17

    .line 395
    .line 396
    invoke-virtual {v1, v2, v0, v3}, Lo2/m;->f(Lo2/j;Lo2/h;I)J

    .line 397
    .line 398
    .line 399
    new-instance v10, Lk2/z;

    .line 400
    .line 401
    iget-object v0, v2, Lo2/p;->b:LS1/k;

    .line 402
    .line 403
    invoke-direct {v10, v0}, Lk2/z;-><init>(LS1/k;)V

    .line 404
    .line 405
    .line 406
    iget-object v9, v8, LX1/f;->q:LZ1/d;

    .line 407
    .line 408
    iget v11, v2, Lo2/p;->c:I

    .line 409
    .line 410
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    const/4 v12, -0x1

    .line 421
    const/4 v13, 0x0

    .line 422
    const/4 v14, 0x0

    .line 423
    const/4 v15, 0x0

    .line 424
    invoke-virtual/range {v9 .. v19}, LZ1/d;->h(Lk2/z;IILN1/n;ILjava/lang/Object;JJ)V

    .line 425
    .line 426
    .line 427
    return-void

    .line 428
    :cond_f
    :goto_8
    new-instance v1, LX1/e;

    .line 429
    .line 430
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 431
    .line 432
    .line 433
    new-instance v2, Lo2/p;

    .line 434
    .line 435
    iget-object v4, v8, LX1/f;->z:LS1/h;

    .line 436
    .line 437
    iget-object v0, v0, LY1/t;->c:Ljava/lang/String;

    .line 438
    .line 439
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-direct {v2, v4, v0, v3, v1}, Lo2/p;-><init>(LS1/h;Landroid/net/Uri;ILo2/o;)V

    .line 444
    .line 445
    .line 446
    new-instance v0, Ly3/j;

    .line 447
    .line 448
    const/16 v1, 0x1a

    .line 449
    .line 450
    invoke-direct {v0, v8, v1}, Ly3/j;-><init>(Ljava/lang/Object;I)V

    .line 451
    .line 452
    .line 453
    iget-object v1, v8, LX1/f;->A:Lo2/m;

    .line 454
    .line 455
    const/4 v3, 0x1

    .line 456
    invoke-virtual {v1, v2, v0, v3}, Lo2/m;->f(Lo2/j;Lo2/h;I)J

    .line 457
    .line 458
    .line 459
    new-instance v10, Lk2/z;

    .line 460
    .line 461
    iget-object v0, v2, Lo2/p;->b:LS1/k;

    .line 462
    .line 463
    invoke-direct {v10, v0}, Lk2/z;-><init>(LS1/k;)V

    .line 464
    .line 465
    .line 466
    iget-object v9, v8, LX1/f;->q:LZ1/d;

    .line 467
    .line 468
    iget v11, v2, Lo2/p;->c:I

    .line 469
    .line 470
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    const/4 v12, -0x1

    .line 481
    const/4 v13, 0x0

    .line 482
    const/4 v14, 0x0

    .line 483
    const/4 v15, 0x0

    .line 484
    invoke-virtual/range {v9 .. v19}, LZ1/d;->h(Lk2/z;IILN1/n;ILjava/lang/Object;JJ)V

    .line 485
    .line 486
    .line 487
    return-void

    .line 488
    :cond_10
    :goto_9
    :try_start_1
    iget-object v0, v0, LY1/t;->c:Ljava/lang/String;

    .line 489
    .line 490
    invoke-static {v0}, LQ1/x;->N(Ljava/lang/String;)J

    .line 491
    .line 492
    .line 493
    move-result-wide v0

    .line 494
    iget-wide v2, v8, LX1/f;->K:J

    .line 495
    .line 496
    sub-long/2addr v0, v2

    .line 497
    iput-wide v0, v8, LX1/f;->L:J

    .line 498
    .line 499
    const/4 v3, 0x1

    .line 500
    invoke-virtual {v8, v3}, LX1/f;->y(Z)V
    :try_end_1
    .catch LN1/D; {:try_start_1 .. :try_end_1} :catch_0

    .line 501
    .line 502
    .line 503
    goto :goto_a

    .line 504
    :catch_0
    move-exception v0

    .line 505
    invoke-virtual {v8, v0}, LX1/f;->x(Ljava/io/IOException;)V

    .line 506
    .line 507
    .line 508
    :goto_a
    return-void

    .line 509
    :cond_11
    invoke-virtual {v8}, LX1/f;->u()V

    .line 510
    .line 511
    .line 512
    return-void

    .line 513
    :cond_12
    const/4 v3, 0x1

    .line 514
    invoke-virtual {v8, v3}, LX1/f;->y(Z)V

    .line 515
    .line 516
    .line 517
    return-void

    .line 518
    :goto_b
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 519
    throw v0
.end method

.method public B(LA7/E0;I)V
    .locals 2

    .line 1
    sget-object v0, LA7/h;->b:LA7/h;

    .line 2
    .line 3
    const/16 v1, -0x1e

    .line 4
    .line 5
    if-eq p2, v1, :cond_3

    .line 6
    .line 7
    const/16 v1, -0x14

    .line 8
    .line 9
    if-eq p2, v1, :cond_2

    .line 10
    .line 11
    const/16 v1, -0xa

    .line 12
    .line 13
    if-eq p2, v1, :cond_1

    .line 14
    .line 15
    if-eqz p2, :cond_2

    .line 16
    .line 17
    const/16 v1, 0x1e

    .line 18
    .line 19
    if-eq p2, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    sget-object v0, LA7/h;->f:LA7/h;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    sget-object v0, LA7/h;->e:LA7/h;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    sget-object v0, LA7/h;->g:LA7/h;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    sget-object v0, LA7/h;->h:LA7/h;

    .line 32
    .line 33
    :goto_0
    iget-object p2, p0, LA/e0;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p2, Ljava/util/EnumMap;

    .line 36
    .line 37
    invoke-virtual {p2, p1, v0}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public C(LA7/E0;LA7/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, LA/e0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/EnumMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public E(Lo2/j;JJLjava/io/IOException;I)LU5/f;
    .locals 4

    .line 1
    const/4 p2, 0x0

    .line 2
    check-cast p1, Lo2/p;

    .line 3
    .line 4
    iget-object p3, p0, LA/e0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p3, LX1/f;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lk2/z;

    .line 12
    .line 13
    iget-wide v1, p1, Lo2/p;->a:J

    .line 14
    .line 15
    iget-object v1, p1, Lo2/p;->d:LS1/z;

    .line 16
    .line 17
    iget-object v1, v1, LS1/z;->c:Landroid/net/Uri;

    .line 18
    .line 19
    invoke-direct {v0, p4, p5}, Lk2/z;-><init>(J)V

    .line 20
    .line 21
    .line 22
    iget-object p4, p3, LX1/f;->m:Lae/d;

    .line 23
    .line 24
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    instance-of p4, p6, LN1/D;

    .line 28
    .line 29
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    if-nez p4, :cond_2

    .line 35
    .line 36
    instance-of p4, p6, Ljava/io/FileNotFoundException;

    .line 37
    .line 38
    if-nez p4, :cond_2

    .line 39
    .line 40
    instance-of p4, p6, LS1/r;

    .line 41
    .line 42
    if-nez p4, :cond_2

    .line 43
    .line 44
    instance-of p4, p6, Lo2/l;

    .line 45
    .line 46
    if-nez p4, :cond_2

    .line 47
    .line 48
    sget p4, LS1/i;->b:I

    .line 49
    .line 50
    move-object p4, p6

    .line 51
    :goto_0
    if-eqz p4, :cond_1

    .line 52
    .line 53
    instance-of p5, p4, LS1/i;

    .line 54
    .line 55
    if-eqz p5, :cond_0

    .line 56
    .line 57
    move-object p5, p4

    .line 58
    check-cast p5, LS1/i;

    .line 59
    .line 60
    iget p5, p5, LS1/i;->a:I

    .line 61
    .line 62
    const/16 v3, 0x7d8

    .line 63
    .line 64
    if-ne p5, v3, :cond_0

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_0
    invoke-virtual {p4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 68
    .line 69
    .line 70
    move-result-object p4

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    add-int/lit8 p7, p7, -0x1

    .line 73
    .line 74
    mul-int/lit16 p7, p7, 0x3e8

    .line 75
    .line 76
    const/16 p4, 0x1388

    .line 77
    .line 78
    invoke-static {p7, p4}, Ljava/lang/Math;->min(II)I

    .line 79
    .line 80
    .line 81
    move-result p4

    .line 82
    int-to-long p4, p4

    .line 83
    goto :goto_2

    .line 84
    :cond_2
    :goto_1
    move-wide p4, v1

    .line 85
    :goto_2
    cmp-long p7, p4, v1

    .line 86
    .line 87
    if-nez p7, :cond_3

    .line 88
    .line 89
    sget-object p2, Lo2/m;->f:LU5/f;

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_3
    new-instance p7, LU5/f;

    .line 93
    .line 94
    invoke-direct {p7, p4, p5, p2, p2}, LU5/f;-><init>(JIZ)V

    .line 95
    .line 96
    .line 97
    move-object p2, p7

    .line 98
    :goto_3
    invoke-virtual {p2}, LU5/f;->a()Z

    .line 99
    .line 100
    .line 101
    move-result p4

    .line 102
    xor-int/lit8 p4, p4, 0x1

    .line 103
    .line 104
    iget-object p3, p3, LX1/f;->q:LZ1/d;

    .line 105
    .line 106
    iget p1, p1, Lo2/p;->c:I

    .line 107
    .line 108
    invoke-virtual {p3, v0, p1, p6, p4}, LZ1/d;->g(Lk2/z;ILjava/io/IOException;Z)V

    .line 109
    .line 110
    .line 111
    return-object p2
.end method

.method public a(Lk2/f0;)V
    .locals 1

    .line 1
    check-cast p1, La2/s;

    .line 2
    .line 3
    iget-object p1, p0, LA/e0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, La2/m;

    .line 6
    .line 7
    iget-object v0, p1, La2/m;->q:Lk2/E;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lk2/e0;->a(Lk2/f0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public b(Landroid/view/View;)Lorg/json/JSONObject;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    invoke-static {v0, v0, v0, v0}, LRa/b;->a(IIII)Lorg/json/JSONObject;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object v3, p0, LA/e0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, [I

    .line 20
    .line 21
    invoke-virtual {p1, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 22
    .line 23
    .line 24
    aget p1, v3, v0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    aget v0, v3, v0

    .line 28
    .line 29
    invoke-static {p1, v0, v1, v2}, LRa/b;->a(IIII)Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public c(LI5/f;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(LI4/v;)LI4/p;
    .locals 2

    .line 1
    new-instance p1, LI4/b;

    .line 2
    .line 3
    iget-object v0, p0, LA/e0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/content/res/AssetManager;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {p1, v1, v0, p0}, LI4/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object p1
.end method

.method public f(IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, LA/e0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LN1/k;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, LN1/k;->a(I)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public g(Ljava/lang/Object;Ljava/io/File;LB4/g;)Z
    .locals 5

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    const-string p3, "StreamEncoder"

    .line 4
    .line 5
    iget-object v0, p0, LA/e0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LF4/f;

    .line 8
    .line 9
    const/high16 v1, 0x10000

    .line 10
    .line 11
    const-class v2, [B

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, LF4/f;->e(ILjava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, [B

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    :try_start_0
    new-instance v4, Ljava/io/FileOutputStream;

    .line 22
    .line 23
    invoke-direct {v4, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    .line 25
    .line 26
    :goto_0
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const/4 v3, -0x1

    .line 31
    if-eq p2, v3, :cond_0

    .line 32
    .line 33
    invoke-virtual {v4, v1, v2, p2}, Ljava/io/OutputStream;->write([BII)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    move-object v3, v4

    .line 39
    goto :goto_3

    .line 40
    :catch_0
    move-exception p1

    .line 41
    move-object v3, v4

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    .line 46
    :try_start_2
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 47
    .line 48
    .line 49
    :catch_1
    invoke-virtual {v0, v1}, LF4/f;->i(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    goto :goto_2

    .line 54
    :catchall_1
    move-exception p1

    .line 55
    goto :goto_3

    .line 56
    :catch_2
    move-exception p1

    .line 57
    :goto_1
    const/4 p2, 0x3

    .line 58
    :try_start_3
    invoke-static {p3, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_1

    .line 63
    .line 64
    const-string p2, "Failed to encode data onto the OutputStream"

    .line 65
    .line 66
    invoke-static {p3, p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 67
    .line 68
    .line 69
    :cond_1
    if-eqz v3, :cond_2

    .line 70
    .line 71
    :try_start_4
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 72
    .line 73
    .line 74
    :catch_3
    :cond_2
    invoke-virtual {v0, v1}, LF4/f;->i(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :goto_2
    return v2

    .line 78
    :goto_3
    if-eqz v3, :cond_3

    .line 79
    .line 80
    :try_start_5
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 81
    .line 82
    .line 83
    :catch_4
    :cond_3
    invoke-virtual {v0, v1}, LF4/f;->i(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    throw p1
.end method

.method public get(I)LA/v;
    .locals 0

    .line 1
    iget-object p1, p0, LA/e0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, LA/v;

    .line 4
    .line 5
    return-object p1
.end method

.method public getAdapterStatusMap()Ljava/util/Map;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LD6/V0;

    .line 7
    .line 8
    iget-object v2, p0, LA/e0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, LD6/Z0;

    .line 11
    .line 12
    invoke-static {v2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v2, "com.google.android.gms.ads.MobileAds"

    .line 19
    .line 20
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public h(IILs2/j;)V
    .locals 22

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p0

    .line 8
    .line 9
    iget-object v4, v3, LA/e0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v5, v4

    .line 12
    check-cast v5, LK2/d;

    .line 13
    .line 14
    iget-object v4, v5, LK2/d;->c:Landroid/util/SparseArray;

    .line 15
    .line 16
    const/4 v6, 0x4

    .line 17
    const/4 v7, 0x2

    .line 18
    const/4 v12, 0x0

    .line 19
    const/4 v13, 0x1

    .line 20
    const/16 v8, 0xa1

    .line 21
    .line 22
    const/16 v9, 0xa3

    .line 23
    .line 24
    const/4 v10, 0x0

    .line 25
    if-eq v0, v8, :cond_b

    .line 26
    .line 27
    if-eq v0, v9, :cond_b

    .line 28
    .line 29
    const/16 v8, 0xa5

    .line 30
    .line 31
    if-eq v0, v8, :cond_8

    .line 32
    .line 33
    const/16 v4, 0x41ed

    .line 34
    .line 35
    if-eq v0, v4, :cond_5

    .line 36
    .line 37
    const/16 v4, 0x4255

    .line 38
    .line 39
    if-eq v0, v4, :cond_4

    .line 40
    .line 41
    const/16 v4, 0x47e2

    .line 42
    .line 43
    if-eq v0, v4, :cond_3

    .line 44
    .line 45
    const/16 v4, 0x53ab

    .line 46
    .line 47
    if-eq v0, v4, :cond_2

    .line 48
    .line 49
    const/16 v4, 0x63a2

    .line 50
    .line 51
    if-eq v0, v4, :cond_1

    .line 52
    .line 53
    const/16 v4, 0x7672

    .line 54
    .line 55
    if-ne v0, v4, :cond_0

    .line 56
    .line 57
    invoke-virtual {v5, v0}, LK2/d;->c(I)V

    .line 58
    .line 59
    .line 60
    iget-object v0, v5, LK2/d;->w:LK2/c;

    .line 61
    .line 62
    new-array v4, v1, [B

    .line 63
    .line 64
    iput-object v4, v0, LK2/c;->w:[B

    .line 65
    .line 66
    invoke-virtual {v2, v4, v12, v1, v12}, Ls2/j;->f([BIIZ)Z

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string v2, "Unexpected id: "

    .line 73
    .line 74
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v10, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    throw v0

    .line 89
    :cond_1
    invoke-virtual {v5, v0}, LK2/d;->c(I)V

    .line 90
    .line 91
    .line 92
    iget-object v0, v5, LK2/d;->w:LK2/c;

    .line 93
    .line 94
    new-array v4, v1, [B

    .line 95
    .line 96
    iput-object v4, v0, LK2/c;->k:[B

    .line 97
    .line 98
    invoke-virtual {v2, v4, v12, v1, v12}, Ls2/j;->f([BIIZ)Z

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_2
    iget-object v0, v5, LK2/d;->k:LQ1/o;

    .line 103
    .line 104
    iget-object v4, v0, LQ1/o;->a:[B

    .line 105
    .line 106
    invoke-static {v4, v12}, Ljava/util/Arrays;->fill([BB)V

    .line 107
    .line 108
    .line 109
    iget-object v4, v0, LQ1/o;->a:[B

    .line 110
    .line 111
    rsub-int/lit8 v6, v1, 0x4

    .line 112
    .line 113
    invoke-virtual {v2, v4, v6, v1, v12}, Ls2/j;->f([BIIZ)Z

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v12}, LQ1/o;->G(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, LQ1/o;->w()J

    .line 120
    .line 121
    .line 122
    move-result-wide v0

    .line 123
    long-to-int v0, v0

    .line 124
    iput v0, v5, LK2/d;->y:I

    .line 125
    .line 126
    return-void

    .line 127
    :cond_3
    new-array v4, v1, [B

    .line 128
    .line 129
    invoke-virtual {v2, v4, v12, v1, v12}, Ls2/j;->f([BIIZ)Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5, v0}, LK2/d;->c(I)V

    .line 133
    .line 134
    .line 135
    iget-object v0, v5, LK2/d;->w:LK2/c;

    .line 136
    .line 137
    new-instance v1, Ls2/B;

    .line 138
    .line 139
    invoke-direct {v1, v13, v4, v12, v12}, Ls2/B;-><init>(I[BII)V

    .line 140
    .line 141
    .line 142
    iput-object v1, v0, LK2/c;->j:Ls2/B;

    .line 143
    .line 144
    return-void

    .line 145
    :cond_4
    invoke-virtual {v5, v0}, LK2/d;->c(I)V

    .line 146
    .line 147
    .line 148
    iget-object v0, v5, LK2/d;->w:LK2/c;

    .line 149
    .line 150
    new-array v4, v1, [B

    .line 151
    .line 152
    iput-object v4, v0, LK2/c;->i:[B

    .line 153
    .line 154
    invoke-virtual {v2, v4, v12, v1, v12}, Ls2/j;->f([BIIZ)Z

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_5
    invoke-virtual {v5, v0}, LK2/d;->c(I)V

    .line 159
    .line 160
    .line 161
    iget-object v0, v5, LK2/d;->w:LK2/c;

    .line 162
    .line 163
    iget v4, v0, LK2/c;->g:I

    .line 164
    .line 165
    const v5, 0x64767643

    .line 166
    .line 167
    .line 168
    if-eq v4, v5, :cond_7

    .line 169
    .line 170
    const v5, 0x64766343

    .line 171
    .line 172
    .line 173
    if-ne v4, v5, :cond_6

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_6
    invoke-virtual {v2, v1}, Ls2/j;->j(I)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_7
    :goto_0
    new-array v4, v1, [B

    .line 181
    .line 182
    iput-object v4, v0, LK2/c;->O:[B

    .line 183
    .line 184
    invoke-virtual {v2, v4, v12, v1, v12}, Ls2/j;->f([BIIZ)Z

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_8
    iget v0, v5, LK2/d;->I:I

    .line 189
    .line 190
    if-eq v0, v7, :cond_9

    .line 191
    .line 192
    goto/16 :goto_12

    .line 193
    .line 194
    :cond_9
    iget v0, v5, LK2/d;->O:I

    .line 195
    .line 196
    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, LK2/c;

    .line 201
    .line 202
    iget v4, v5, LK2/d;->R:I

    .line 203
    .line 204
    if-ne v4, v6, :cond_a

    .line 205
    .line 206
    const-string v4, "V_VP9"

    .line 207
    .line 208
    iget-object v0, v0, LK2/c;->b:Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_a

    .line 215
    .line 216
    iget-object v0, v5, LK2/d;->p:LQ1/o;

    .line 217
    .line 218
    invoke-virtual {v0, v1}, LQ1/o;->D(I)V

    .line 219
    .line 220
    .line 221
    iget-object v0, v0, LQ1/o;->a:[B

    .line 222
    .line 223
    invoke-virtual {v2, v0, v12, v1, v12}, Ls2/j;->f([BIIZ)Z

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_a
    invoke-virtual {v2, v1}, Ls2/j;->j(I)V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :cond_b
    iget v8, v5, LK2/d;->I:I

    .line 232
    .line 233
    const/16 v11, 0x8

    .line 234
    .line 235
    iget-object v14, v5, LK2/d;->i:LQ1/o;

    .line 236
    .line 237
    if-nez v8, :cond_c

    .line 238
    .line 239
    iget-object v8, v5, LK2/d;->b:LK2/e;

    .line 240
    .line 241
    invoke-virtual {v8, v2, v12, v13, v11}, LK2/e;->c(Ls2/j;ZZI)J

    .line 242
    .line 243
    .line 244
    move-result-wide v9

    .line 245
    long-to-int v9, v9

    .line 246
    iput v9, v5, LK2/d;->O:I

    .line 247
    .line 248
    iget v8, v8, LK2/e;->c:I

    .line 249
    .line 250
    iput v8, v5, LK2/d;->P:I

    .line 251
    .line 252
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    iput-wide v8, v5, LK2/d;->K:J

    .line 258
    .line 259
    iput v13, v5, LK2/d;->I:I

    .line 260
    .line 261
    invoke-virtual {v14, v12}, LQ1/o;->D(I)V

    .line 262
    .line 263
    .line 264
    :cond_c
    iget v8, v5, LK2/d;->O:I

    .line 265
    .line 266
    invoke-virtual {v4, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    check-cast v4, LK2/c;

    .line 271
    .line 272
    if-nez v4, :cond_d

    .line 273
    .line 274
    iget v0, v5, LK2/d;->P:I

    .line 275
    .line 276
    sub-int v0, v1, v0

    .line 277
    .line 278
    invoke-virtual {v2, v0}, Ls2/j;->j(I)V

    .line 279
    .line 280
    .line 281
    iput v12, v5, LK2/d;->I:I

    .line 282
    .line 283
    return-void

    .line 284
    :cond_d
    iget-object v8, v4, LK2/c;->Y:Ls2/C;

    .line 285
    .line 286
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    iget v8, v5, LK2/d;->I:I

    .line 290
    .line 291
    if-ne v8, v13, :cond_22

    .line 292
    .line 293
    const/4 v8, 0x3

    .line 294
    invoke-virtual {v5, v2, v8}, LK2/d;->f(Ls2/j;I)V

    .line 295
    .line 296
    .line 297
    iget-object v9, v14, LQ1/o;->a:[B

    .line 298
    .line 299
    aget-byte v9, v9, v7

    .line 300
    .line 301
    and-int/lit8 v9, v9, 0x6

    .line 302
    .line 303
    shr-int/2addr v9, v13

    .line 304
    const/16 v10, 0xff

    .line 305
    .line 306
    if-nez v9, :cond_10

    .line 307
    .line 308
    iput v13, v5, LK2/d;->M:I

    .line 309
    .line 310
    iget-object v6, v5, LK2/d;->N:[I

    .line 311
    .line 312
    if-nez v6, :cond_e

    .line 313
    .line 314
    new-array v6, v13, [I

    .line 315
    .line 316
    goto :goto_1

    .line 317
    :cond_e
    array-length v9, v6

    .line 318
    if-lt v9, v13, :cond_f

    .line 319
    .line 320
    goto :goto_1

    .line 321
    :cond_f
    array-length v6, v6

    .line 322
    mul-int/2addr v6, v7

    .line 323
    invoke-static {v6, v13}, Ljava/lang/Math;->max(II)I

    .line 324
    .line 325
    .line 326
    move-result v6

    .line 327
    new-array v6, v6, [I

    .line 328
    .line 329
    :goto_1
    iput-object v6, v5, LK2/d;->N:[I

    .line 330
    .line 331
    iget v9, v5, LK2/d;->P:I

    .line 332
    .line 333
    sub-int/2addr v1, v9

    .line 334
    sub-int/2addr v1, v8

    .line 335
    aput v1, v6, v12

    .line 336
    .line 337
    :goto_2
    move/from16 v19, v12

    .line 338
    .line 339
    move/from16 v17, v13

    .line 340
    .line 341
    goto/16 :goto_b

    .line 342
    .line 343
    :cond_10
    invoke-virtual {v5, v2, v6}, LK2/d;->f(Ls2/j;I)V

    .line 344
    .line 345
    .line 346
    move/from16 v17, v6

    .line 347
    .line 348
    iget-object v6, v14, LQ1/o;->a:[B

    .line 349
    .line 350
    aget-byte v6, v6, v8

    .line 351
    .line 352
    and-int/2addr v6, v10

    .line 353
    add-int/2addr v6, v13

    .line 354
    iput v6, v5, LK2/d;->M:I

    .line 355
    .line 356
    iget-object v15, v5, LK2/d;->N:[I

    .line 357
    .line 358
    if-nez v15, :cond_11

    .line 359
    .line 360
    new-array v15, v6, [I

    .line 361
    .line 362
    goto :goto_3

    .line 363
    :cond_11
    array-length v11, v15

    .line 364
    if-lt v11, v6, :cond_12

    .line 365
    .line 366
    goto :goto_3

    .line 367
    :cond_12
    array-length v11, v15

    .line 368
    mul-int/2addr v11, v7

    .line 369
    invoke-static {v11, v6}, Ljava/lang/Math;->max(II)I

    .line 370
    .line 371
    .line 372
    move-result v6

    .line 373
    new-array v15, v6, [I

    .line 374
    .line 375
    :goto_3
    iput-object v15, v5, LK2/d;->N:[I

    .line 376
    .line 377
    if-ne v9, v7, :cond_13

    .line 378
    .line 379
    iget v6, v5, LK2/d;->P:I

    .line 380
    .line 381
    sub-int/2addr v1, v6

    .line 382
    add-int/lit8 v1, v1, -0x4

    .line 383
    .line 384
    iget v6, v5, LK2/d;->M:I

    .line 385
    .line 386
    div-int/2addr v1, v6

    .line 387
    invoke-static {v15, v12, v6, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 388
    .line 389
    .line 390
    goto :goto_2

    .line 391
    :cond_13
    if-ne v9, v13, :cond_16

    .line 392
    .line 393
    move v8, v12

    .line 394
    move v9, v8

    .line 395
    move/from16 v6, v17

    .line 396
    .line 397
    :goto_4
    iget v11, v5, LK2/d;->M:I

    .line 398
    .line 399
    sub-int/2addr v11, v13

    .line 400
    if-ge v8, v11, :cond_15

    .line 401
    .line 402
    iget-object v11, v5, LK2/d;->N:[I

    .line 403
    .line 404
    aput v12, v11, v8

    .line 405
    .line 406
    :goto_5
    add-int/lit8 v11, v6, 0x1

    .line 407
    .line 408
    invoke-virtual {v5, v2, v11}, LK2/d;->f(Ls2/j;I)V

    .line 409
    .line 410
    .line 411
    iget-object v15, v14, LQ1/o;->a:[B

    .line 412
    .line 413
    aget-byte v6, v15, v6

    .line 414
    .line 415
    and-int/2addr v6, v10

    .line 416
    iget-object v15, v5, LK2/d;->N:[I

    .line 417
    .line 418
    aget v16, v15, v8

    .line 419
    .line 420
    add-int v16, v16, v6

    .line 421
    .line 422
    aput v16, v15, v8

    .line 423
    .line 424
    if-eq v6, v10, :cond_14

    .line 425
    .line 426
    add-int v9, v9, v16

    .line 427
    .line 428
    add-int/lit8 v8, v8, 0x1

    .line 429
    .line 430
    move v6, v11

    .line 431
    goto :goto_4

    .line 432
    :cond_14
    move v6, v11

    .line 433
    goto :goto_5

    .line 434
    :cond_15
    iget-object v8, v5, LK2/d;->N:[I

    .line 435
    .line 436
    iget v15, v5, LK2/d;->P:I

    .line 437
    .line 438
    sub-int/2addr v1, v15

    .line 439
    sub-int/2addr v1, v6

    .line 440
    sub-int/2addr v1, v9

    .line 441
    aput v1, v8, v11

    .line 442
    .line 443
    goto :goto_2

    .line 444
    :cond_16
    if-ne v9, v8, :cond_21

    .line 445
    .line 446
    move v8, v12

    .line 447
    move v9, v8

    .line 448
    move/from16 v6, v17

    .line 449
    .line 450
    :goto_6
    iget v11, v5, LK2/d;->M:I

    .line 451
    .line 452
    sub-int/2addr v11, v13

    .line 453
    if-ge v8, v11, :cond_1e

    .line 454
    .line 455
    iget-object v11, v5, LK2/d;->N:[I

    .line 456
    .line 457
    aput v12, v11, v8

    .line 458
    .line 459
    add-int/lit8 v11, v6, 0x1

    .line 460
    .line 461
    invoke-virtual {v5, v2, v11}, LK2/d;->f(Ls2/j;I)V

    .line 462
    .line 463
    .line 464
    iget-object v15, v14, LQ1/o;->a:[B

    .line 465
    .line 466
    aget-byte v15, v15, v6

    .line 467
    .line 468
    if-eqz v15, :cond_1d

    .line 469
    .line 470
    move/from16 v17, v13

    .line 471
    .line 472
    move v13, v12

    .line 473
    :goto_7
    const/16 v15, 0x8

    .line 474
    .line 475
    if-ge v13, v15, :cond_19

    .line 476
    .line 477
    rsub-int/lit8 v15, v13, 0x7

    .line 478
    .line 479
    shl-int v15, v17, v15

    .line 480
    .line 481
    move/from16 v19, v12

    .line 482
    .line 483
    iget-object v12, v14, LQ1/o;->a:[B

    .line 484
    .line 485
    aget-byte v12, v12, v6

    .line 486
    .line 487
    and-int/2addr v12, v15

    .line 488
    if-eqz v12, :cond_18

    .line 489
    .line 490
    add-int v12, v11, v13

    .line 491
    .line 492
    invoke-virtual {v5, v2, v12}, LK2/d;->f(Ls2/j;I)V

    .line 493
    .line 494
    .line 495
    iget-object v7, v14, LQ1/o;->a:[B

    .line 496
    .line 497
    aget-byte v6, v7, v6

    .line 498
    .line 499
    and-int/2addr v6, v10

    .line 500
    not-int v7, v15

    .line 501
    and-int/2addr v6, v7

    .line 502
    int-to-long v6, v6

    .line 503
    :goto_8
    if-ge v11, v12, :cond_17

    .line 504
    .line 505
    const/16 v18, 0x8

    .line 506
    .line 507
    shl-long v6, v6, v18

    .line 508
    .line 509
    iget-object v15, v14, LQ1/o;->a:[B

    .line 510
    .line 511
    add-int/lit8 v20, v11, 0x1

    .line 512
    .line 513
    aget-byte v11, v15, v11

    .line 514
    .line 515
    and-int/2addr v11, v10

    .line 516
    int-to-long v10, v11

    .line 517
    or-long/2addr v6, v10

    .line 518
    move/from16 v11, v20

    .line 519
    .line 520
    const/16 v10, 0xff

    .line 521
    .line 522
    goto :goto_8

    .line 523
    :cond_17
    if-lez v8, :cond_1a

    .line 524
    .line 525
    mul-int/lit8 v13, v13, 0x7

    .line 526
    .line 527
    add-int/lit8 v13, v13, 0x6

    .line 528
    .line 529
    const-wide/16 v10, 0x1

    .line 530
    .line 531
    shl-long v20, v10, v13

    .line 532
    .line 533
    sub-long v20, v20, v10

    .line 534
    .line 535
    sub-long v6, v6, v20

    .line 536
    .line 537
    goto :goto_9

    .line 538
    :cond_18
    add-int/lit8 v13, v13, 0x1

    .line 539
    .line 540
    move/from16 v12, v19

    .line 541
    .line 542
    const/4 v7, 0x2

    .line 543
    const/16 v10, 0xff

    .line 544
    .line 545
    goto :goto_7

    .line 546
    :cond_19
    move/from16 v19, v12

    .line 547
    .line 548
    const-wide/16 v6, 0x0

    .line 549
    .line 550
    move v12, v11

    .line 551
    :cond_1a
    :goto_9
    const-wide/32 v10, -0x80000000

    .line 552
    .line 553
    .line 554
    cmp-long v10, v6, v10

    .line 555
    .line 556
    if-ltz v10, :cond_1c

    .line 557
    .line 558
    const-wide/32 v10, 0x7fffffff

    .line 559
    .line 560
    .line 561
    cmp-long v10, v6, v10

    .line 562
    .line 563
    if-gtz v10, :cond_1c

    .line 564
    .line 565
    long-to-int v6, v6

    .line 566
    iget-object v7, v5, LK2/d;->N:[I

    .line 567
    .line 568
    if-nez v8, :cond_1b

    .line 569
    .line 570
    goto :goto_a

    .line 571
    :cond_1b
    add-int/lit8 v10, v8, -0x1

    .line 572
    .line 573
    aget v10, v7, v10

    .line 574
    .line 575
    add-int/2addr v6, v10

    .line 576
    :goto_a
    aput v6, v7, v8

    .line 577
    .line 578
    add-int/2addr v9, v6

    .line 579
    add-int/lit8 v8, v8, 0x1

    .line 580
    .line 581
    move v6, v12

    .line 582
    move/from16 v13, v17

    .line 583
    .line 584
    move/from16 v12, v19

    .line 585
    .line 586
    const/4 v7, 0x2

    .line 587
    const/16 v10, 0xff

    .line 588
    .line 589
    goto/16 :goto_6

    .line 590
    .line 591
    :cond_1c
    const-string v0, "EBML lacing sample size out of range."

    .line 592
    .line 593
    const/4 v1, 0x0

    .line 594
    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    throw v0

    .line 599
    :cond_1d
    const/4 v1, 0x0

    .line 600
    const-string v0, "No valid varint length mask found"

    .line 601
    .line 602
    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    throw v0

    .line 607
    :cond_1e
    move/from16 v19, v12

    .line 608
    .line 609
    move/from16 v17, v13

    .line 610
    .line 611
    iget-object v7, v5, LK2/d;->N:[I

    .line 612
    .line 613
    iget v8, v5, LK2/d;->P:I

    .line 614
    .line 615
    sub-int/2addr v1, v8

    .line 616
    sub-int/2addr v1, v6

    .line 617
    sub-int/2addr v1, v9

    .line 618
    aput v1, v7, v11

    .line 619
    .line 620
    :goto_b
    iget-object v1, v14, LQ1/o;->a:[B

    .line 621
    .line 622
    aget-byte v6, v1, v19

    .line 623
    .line 624
    const/16 v18, 0x8

    .line 625
    .line 626
    shl-int/lit8 v6, v6, 0x8

    .line 627
    .line 628
    aget-byte v1, v1, v17

    .line 629
    .line 630
    const/16 v15, 0xff

    .line 631
    .line 632
    and-int/2addr v1, v15

    .line 633
    or-int/2addr v1, v6

    .line 634
    iget-wide v6, v5, LK2/d;->D:J

    .line 635
    .line 636
    int-to-long v8, v1

    .line 637
    invoke-virtual {v5, v8, v9}, LK2/d;->m(J)J

    .line 638
    .line 639
    .line 640
    move-result-wide v8

    .line 641
    add-long/2addr v8, v6

    .line 642
    iput-wide v8, v5, LK2/d;->J:J

    .line 643
    .line 644
    iget v1, v4, LK2/c;->d:I

    .line 645
    .line 646
    const/4 v6, 0x2

    .line 647
    if-eq v1, v6, :cond_20

    .line 648
    .line 649
    const/16 v15, 0xa3

    .line 650
    .line 651
    if-ne v0, v15, :cond_1f

    .line 652
    .line 653
    iget-object v1, v14, LQ1/o;->a:[B

    .line 654
    .line 655
    aget-byte v1, v1, v6

    .line 656
    .line 657
    const/16 v7, 0x80

    .line 658
    .line 659
    and-int/2addr v1, v7

    .line 660
    if-ne v1, v7, :cond_1f

    .line 661
    .line 662
    goto :goto_c

    .line 663
    :cond_1f
    move/from16 v1, v19

    .line 664
    .line 665
    goto :goto_d

    .line 666
    :cond_20
    :goto_c
    move/from16 v1, v17

    .line 667
    .line 668
    :goto_d
    iput v1, v5, LK2/d;->Q:I

    .line 669
    .line 670
    iput v6, v5, LK2/d;->I:I

    .line 671
    .line 672
    move/from16 v1, v19

    .line 673
    .line 674
    iput v1, v5, LK2/d;->L:I

    .line 675
    .line 676
    :goto_e
    const/16 v15, 0xa3

    .line 677
    .line 678
    goto :goto_f

    .line 679
    :cond_21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 680
    .line 681
    const-string v1, "Unexpected lacing value: "

    .line 682
    .line 683
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    const/4 v1, 0x0

    .line 694
    invoke-static {v1, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    throw v0

    .line 699
    :cond_22
    move/from16 v17, v13

    .line 700
    .line 701
    goto :goto_e

    .line 702
    :goto_f
    if-ne v0, v15, :cond_24

    .line 703
    .line 704
    :goto_10
    iget v0, v5, LK2/d;->L:I

    .line 705
    .line 706
    iget v1, v5, LK2/d;->M:I

    .line 707
    .line 708
    if-ge v0, v1, :cond_23

    .line 709
    .line 710
    iget-object v1, v5, LK2/d;->N:[I

    .line 711
    .line 712
    aget v0, v1, v0

    .line 713
    .line 714
    const/4 v1, 0x0

    .line 715
    invoke-virtual {v5, v2, v4, v0, v1}, LK2/d;->n(Ls2/j;LK2/c;IZ)I

    .line 716
    .line 717
    .line 718
    move-result v10

    .line 719
    iget-wide v0, v5, LK2/d;->J:J

    .line 720
    .line 721
    iget v6, v5, LK2/d;->L:I

    .line 722
    .line 723
    iget v7, v4, LK2/c;->e:I

    .line 724
    .line 725
    mul-int/2addr v6, v7

    .line 726
    div-int/lit16 v6, v6, 0x3e8

    .line 727
    .line 728
    int-to-long v6, v6

    .line 729
    add-long/2addr v0, v6

    .line 730
    iget v9, v5, LK2/d;->Q:I

    .line 731
    .line 732
    const/4 v11, 0x0

    .line 733
    move-wide v7, v0

    .line 734
    move-object v6, v4

    .line 735
    invoke-virtual/range {v5 .. v11}, LK2/d;->d(LK2/c;JIII)V

    .line 736
    .line 737
    .line 738
    iget v0, v5, LK2/d;->L:I

    .line 739
    .line 740
    add-int/lit8 v0, v0, 0x1

    .line 741
    .line 742
    iput v0, v5, LK2/d;->L:I

    .line 743
    .line 744
    goto :goto_10

    .line 745
    :cond_23
    const/4 v1, 0x0

    .line 746
    iput v1, v5, LK2/d;->I:I

    .line 747
    .line 748
    return-void

    .line 749
    :cond_24
    move-object v6, v4

    .line 750
    :goto_11
    iget v0, v5, LK2/d;->L:I

    .line 751
    .line 752
    iget v1, v5, LK2/d;->M:I

    .line 753
    .line 754
    if-ge v0, v1, :cond_25

    .line 755
    .line 756
    iget-object v1, v5, LK2/d;->N:[I

    .line 757
    .line 758
    aget v4, v1, v0

    .line 759
    .line 760
    move/from16 v7, v17

    .line 761
    .line 762
    invoke-virtual {v5, v2, v6, v4, v7}, LK2/d;->n(Ls2/j;LK2/c;IZ)I

    .line 763
    .line 764
    .line 765
    move-result v4

    .line 766
    aput v4, v1, v0

    .line 767
    .line 768
    iget v0, v5, LK2/d;->L:I

    .line 769
    .line 770
    add-int/2addr v0, v7

    .line 771
    iput v0, v5, LK2/d;->L:I

    .line 772
    .line 773
    goto :goto_11

    .line 774
    :cond_25
    :goto_12
    return-void
.end method

.method public i(ILDd/c;)LT5/C;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p1, v0, :cond_a

    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    iget-object v1, p2, LDd/c;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    if-eq p1, v0, :cond_9

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    if-eq p1, v0, :cond_9

    .line 13
    .line 14
    const/16 v0, 0x15

    .line 15
    .line 16
    if-eq p1, v0, :cond_8

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const/16 v2, 0x1b

    .line 20
    .line 21
    if-eq p1, v2, :cond_7

    .line 22
    .line 23
    const/16 v2, 0x24

    .line 24
    .line 25
    if-eq p1, v2, :cond_6

    .line 26
    .line 27
    const/16 v2, 0x59

    .line 28
    .line 29
    if-eq p1, v2, :cond_5

    .line 30
    .line 31
    const/16 v2, 0x8a

    .line 32
    .line 33
    if-eq p1, v2, :cond_4

    .line 34
    .line 35
    const/16 v2, 0xac

    .line 36
    .line 37
    if-eq p1, v2, :cond_3

    .line 38
    .line 39
    const/16 v2, 0x101

    .line 40
    .line 41
    if-eq p1, v2, :cond_2

    .line 42
    .line 43
    const/16 v2, 0x86

    .line 44
    .line 45
    if-eq p1, v2, :cond_1

    .line 46
    .line 47
    const/16 v2, 0x87

    .line 48
    .line 49
    if-eq p1, v2, :cond_0

    .line 50
    .line 51
    packed-switch p1, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    packed-switch p1, :pswitch_data_1

    .line 56
    .line 57
    .line 58
    :pswitch_0
    return-object v0

    .line 59
    :pswitch_1
    new-instance p1, LT5/t;

    .line 60
    .line 61
    new-instance p2, LT5/q;

    .line 62
    .line 63
    invoke-direct {p2, v1}, LT5/q;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p1, p2}, LT5/t;-><init>(LT5/f;)V

    .line 67
    .line 68
    .line 69
    return-object p1

    .line 70
    :pswitch_2
    new-instance p1, LT5/t;

    .line 71
    .line 72
    new-instance v0, LT5/k;

    .line 73
    .line 74
    new-instance v1, LS3/e;

    .line 75
    .line 76
    invoke-virtual {p0, p2}, LA/e0;->o(LDd/c;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-direct {v1, p2}, LS3/e;-><init>(Ljava/util/List;)V

    .line 81
    .line 82
    .line 83
    invoke-direct {v0, v1}, LT5/k;-><init>(LS3/e;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, v0}, LT5/t;-><init>(LT5/f;)V

    .line 87
    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_3
    new-instance p1, LT5/t;

    .line 91
    .line 92
    new-instance p2, LT5/c;

    .line 93
    .line 94
    invoke-direct {p2, v0, v1}, LT5/c;-><init>(ZLjava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-direct {p1, p2}, LT5/t;-><init>(LT5/f;)V

    .line 98
    .line 99
    .line 100
    return-object p1

    .line 101
    :cond_0
    :pswitch_4
    new-instance p1, LT5/t;

    .line 102
    .line 103
    new-instance p2, LT5/a;

    .line 104
    .line 105
    const/4 v0, 0x0

    .line 106
    invoke-direct {p2, v1, v0}, LT5/a;-><init>(Ljava/lang/String;I)V

    .line 107
    .line 108
    .line 109
    invoke-direct {p1, p2}, LT5/t;-><init>(LT5/f;)V

    .line 110
    .line 111
    .line 112
    return-object p1

    .line 113
    :cond_1
    new-instance p1, LT5/y;

    .line 114
    .line 115
    new-instance p2, Lb7/k;

    .line 116
    .line 117
    const-string v0, "application/x-scte35"

    .line 118
    .line 119
    invoke-direct {p2, v0}, Lb7/k;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-direct {p1, p2}, LT5/y;-><init>(LT5/x;)V

    .line 123
    .line 124
    .line 125
    return-object p1

    .line 126
    :cond_2
    new-instance p1, LT5/y;

    .line 127
    .line 128
    new-instance p2, Lb7/k;

    .line 129
    .line 130
    const-string v0, "application/vnd.dvb.ait"

    .line 131
    .line 132
    invoke-direct {p2, v0}, Lb7/k;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-direct {p1, p2}, LT5/y;-><init>(LT5/x;)V

    .line 136
    .line 137
    .line 138
    return-object p1

    .line 139
    :cond_3
    new-instance p1, LT5/t;

    .line 140
    .line 141
    new-instance p2, LT5/a;

    .line 142
    .line 143
    const/4 v0, 0x1

    .line 144
    invoke-direct {p2, v1, v0}, LT5/a;-><init>(Ljava/lang/String;I)V

    .line 145
    .line 146
    .line 147
    invoke-direct {p1, p2}, LT5/t;-><init>(LT5/f;)V

    .line 148
    .line 149
    .line 150
    return-object p1

    .line 151
    :cond_4
    new-instance p1, LT5/t;

    .line 152
    .line 153
    new-instance p2, LT5/d;

    .line 154
    .line 155
    invoke-direct {p2, v1}, LT5/d;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-direct {p1, p2}, LT5/t;-><init>(LT5/f;)V

    .line 159
    .line 160
    .line 161
    return-object p1

    .line 162
    :cond_5
    new-instance p1, LT5/t;

    .line 163
    .line 164
    new-instance v0, LT5/e;

    .line 165
    .line 166
    iget-object p2, p2, LDd/c;->c:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p2, Ljava/util/List;

    .line 169
    .line 170
    const/4 v1, 0x0

    .line 171
    invoke-direct {v0, v1, p2}, LT5/e;-><init>(ILjava/util/List;)V

    .line 172
    .line 173
    .line 174
    invoke-direct {p1, v0}, LT5/t;-><init>(LT5/f;)V

    .line 175
    .line 176
    .line 177
    return-object p1

    .line 178
    :cond_6
    new-instance p1, LT5/t;

    .line 179
    .line 180
    new-instance v0, LT5/p;

    .line 181
    .line 182
    new-instance v1, LS3/s;

    .line 183
    .line 184
    invoke-virtual {p0, p2}, LA/e0;->o(LDd/c;)Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-direct {v1, p2}, LS3/s;-><init>(Ljava/util/List;)V

    .line 189
    .line 190
    .line 191
    invoke-direct {v0, v1}, LT5/p;-><init>(LS3/s;)V

    .line 192
    .line 193
    .line 194
    invoke-direct {p1, v0}, LT5/t;-><init>(LT5/f;)V

    .line 195
    .line 196
    .line 197
    return-object p1

    .line 198
    :cond_7
    new-instance p1, LT5/t;

    .line 199
    .line 200
    new-instance v1, LT5/n;

    .line 201
    .line 202
    new-instance v2, LS3/s;

    .line 203
    .line 204
    invoke-virtual {p0, p2}, LA/e0;->o(LDd/c;)Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    invoke-direct {v2, p2}, LS3/s;-><init>(Ljava/util/List;)V

    .line 209
    .line 210
    .line 211
    invoke-direct {v1, v2, v0, v0}, LT5/n;-><init>(LS3/s;ZZ)V

    .line 212
    .line 213
    .line 214
    invoke-direct {p1, v1}, LT5/t;-><init>(LT5/f;)V

    .line 215
    .line 216
    .line 217
    return-object p1

    .line 218
    :cond_8
    new-instance p1, LT5/t;

    .line 219
    .line 220
    new-instance p2, LT5/e;

    .line 221
    .line 222
    const/4 v0, 0x1

    .line 223
    invoke-direct {p2, v0}, LT5/e;-><init>(I)V

    .line 224
    .line 225
    .line 226
    invoke-direct {p1, p2}, LT5/t;-><init>(LT5/f;)V

    .line 227
    .line 228
    .line 229
    return-object p1

    .line 230
    :cond_9
    new-instance p1, LT5/t;

    .line 231
    .line 232
    new-instance p2, LT5/r;

    .line 233
    .line 234
    invoke-direct {p2, v1}, LT5/r;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-direct {p1, p2}, LT5/t;-><init>(LT5/f;)V

    .line 238
    .line 239
    .line 240
    return-object p1

    .line 241
    :cond_a
    :pswitch_5
    new-instance p1, LT5/t;

    .line 242
    .line 243
    new-instance v0, LT5/h;

    .line 244
    .line 245
    new-instance v1, LS3/e;

    .line 246
    .line 247
    invoke-virtual {p0, p2}, LA/e0;->o(LDd/c;)Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object p2

    .line 251
    invoke-direct {v1, p2}, LS3/e;-><init>(Ljava/util/List;)V

    .line 252
    .line 253
    .line 254
    invoke-direct {v0, v1}, LT5/h;-><init>(LS3/e;)V

    .line 255
    .line 256
    .line 257
    invoke-direct {p1, v0}, LT5/t;-><init>(LT5/f;)V

    .line 258
    .line 259
    .line 260
    return-object p1

    .line 261
    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    :pswitch_data_1
    .packed-switch 0x80
        :pswitch_5
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method public k(Landroid/content/res/AssetManager;Ljava/lang/String;)LC4/e;
    .locals 2

    .line 1
    new-instance v0, LC4/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, p2, v1}, LC4/k;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public declared-synchronized m()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LA/e0;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Landroid/content/SharedPreferences;

    .line 5
    .line 6
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v0
.end method

.method public n(Lkotlinx/serialization/descriptors/SerialDescriptor;LYf/s;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/e0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/util/Map;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object p1, v0

    .line 25
    :goto_0
    if-nez p1, :cond_1

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_1
    return-object p1
.end method

.method public o(LDd/c;)Ljava/util/List;
    .locals 11

    .line 1
    new-instance v0, LY4/b;

    .line 2
    .line 3
    iget-object p1, p1, LDd/c;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, [B

    .line 6
    .line 7
    invoke-direct {v0, p1}, LY4/b;-><init>([B)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LA/e0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Ll8/K;

    .line 13
    .line 14
    :goto_0
    invoke-virtual {v0}, LY4/b;->a()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-lez v1, :cond_5

    .line 19
    .line 20
    invoke-virtual {v0}, LY4/b;->q()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {v0}, LY4/b;->q()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget v3, v0, LY4/b;->b:I

    .line 29
    .line 30
    add-int/2addr v3, v2

    .line 31
    const/16 v2, 0x86

    .line 32
    .line 33
    if-ne v1, v2, :cond_4

    .line 34
    .line 35
    new-instance p1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, LY4/b;->q()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    and-int/lit8 v1, v1, 0x1f

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    move v4, v2

    .line 48
    :goto_1
    if-ge v4, v1, :cond_4

    .line 49
    .line 50
    sget-object v5, Lk8/g;->c:Ljava/nio/charset/Charset;

    .line 51
    .line 52
    const/4 v6, 0x3

    .line 53
    invoke-virtual {v0, v6, v5}, LY4/b;->o(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v0}, LY4/b;->q()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    and-int/lit16 v7, v6, 0x80

    .line 62
    .line 63
    const/4 v8, 0x1

    .line 64
    if-eqz v7, :cond_0

    .line 65
    .line 66
    move v7, v8

    .line 67
    goto :goto_2

    .line 68
    :cond_0
    move v7, v2

    .line 69
    :goto_2
    if-eqz v7, :cond_1

    .line 70
    .line 71
    and-int/lit8 v6, v6, 0x3f

    .line 72
    .line 73
    const-string v9, "application/cea-708"

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_1
    const-string v9, "application/cea-608"

    .line 77
    .line 78
    move v6, v8

    .line 79
    :goto_3
    invoke-virtual {v0}, LY4/b;->q()I

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    int-to-byte v10, v10

    .line 84
    invoke-virtual {v0, v8}, LY4/b;->B(I)V

    .line 85
    .line 86
    .line 87
    if-eqz v7, :cond_3

    .line 88
    .line 89
    and-int/lit8 v7, v10, 0x40

    .line 90
    .line 91
    if-eqz v7, :cond_2

    .line 92
    .line 93
    new-array v7, v8, [B

    .line 94
    .line 95
    aput-byte v8, v7, v2

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_2
    new-array v7, v8, [B

    .line 99
    .line 100
    aput-byte v2, v7, v2

    .line 101
    .line 102
    :goto_4
    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    goto :goto_5

    .line 107
    :cond_3
    const/4 v7, 0x0

    .line 108
    :goto_5
    new-instance v8, LE5/S;

    .line 109
    .line 110
    invoke-direct {v8}, LE5/S;-><init>()V

    .line 111
    .line 112
    .line 113
    iput-object v9, v8, LE5/S;->k:Ljava/lang/String;

    .line 114
    .line 115
    iput-object v5, v8, LE5/S;->c:Ljava/lang/String;

    .line 116
    .line 117
    iput v6, v8, LE5/S;->C:I

    .line 118
    .line 119
    iput-object v7, v8, LE5/S;->m:Ljava/util/List;

    .line 120
    .line 121
    new-instance v5, LE5/T;

    .line 122
    .line 123
    invoke-direct {v5, v8}, LE5/T;-><init>(LE5/S;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    add-int/lit8 v4, v4, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    invoke-virtual {v0, v3}, LY4/b;->A(I)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_5
    return-object p1
.end method

.method public p()LI5/d;
    .locals 1

    .line 1
    iget-object v0, p0, LA/e0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LI5/d;

    .line 4
    .line 5
    return-object v0
.end method

.method public q()Ljava/util/UUID;
    .locals 1

    .line 1
    sget-object v0, LE5/i;->a:Ljava/util/UUID;

    .line 2
    .line 3
    return-object v0
.end method

.method public r()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public s(IJ)V
    .locals 9

    .line 1
    iget-object v0, p0, LA/e0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LK2/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x5031

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-string v3, " not supported"

    .line 12
    .line 13
    if-eq p1, v1, :cond_13

    .line 14
    .line 15
    const/16 v1, 0x5032

    .line 16
    .line 17
    const-wide/16 v4, 0x1

    .line 18
    .line 19
    if-eq p1, v1, :cond_11

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v6, 0x3

    .line 23
    const/4 v7, 0x2

    .line 24
    const/4 v8, 0x1

    .line 25
    sparse-switch p1, :sswitch_data_0

    .line 26
    .line 27
    .line 28
    const/4 v1, -0x1

    .line 29
    packed-switch p1, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    goto/16 :goto_0

    .line 33
    .line 34
    :pswitch_0
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 35
    .line 36
    .line 37
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 38
    .line 39
    long-to-int p2, p2

    .line 40
    iput p2, p1, LK2/c;->D:I

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_1
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 44
    .line 45
    .line 46
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 47
    .line 48
    long-to-int p2, p2

    .line 49
    iput p2, p1, LK2/c;->C:I

    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_2
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 53
    .line 54
    .line 55
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 56
    .line 57
    iput-boolean v8, p1, LK2/c;->y:Z

    .line 58
    .line 59
    long-to-int p1, p2

    .line 60
    invoke-static {p1}, LN1/f;->f(I)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eq p1, v1, :cond_14

    .line 65
    .line 66
    iget-object p2, v0, LK2/d;->w:LK2/c;

    .line 67
    .line 68
    iput p1, p2, LK2/c;->z:I

    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_3
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 72
    .line 73
    .line 74
    long-to-int p1, p2

    .line 75
    invoke-static {p1}, LN1/f;->g(I)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eq p1, v1, :cond_14

    .line 80
    .line 81
    iget-object p2, v0, LK2/d;->w:LK2/c;

    .line 82
    .line 83
    iput p1, p2, LK2/c;->A:I

    .line 84
    .line 85
    return-void

    .line 86
    :pswitch_4
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 87
    .line 88
    .line 89
    long-to-int p1, p2

    .line 90
    if-eq p1, v8, :cond_1

    .line 91
    .line 92
    if-eq p1, v7, :cond_0

    .line 93
    .line 94
    goto/16 :goto_0

    .line 95
    .line 96
    :cond_0
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 97
    .line 98
    iput v8, p1, LK2/c;->B:I

    .line 99
    .line 100
    return-void

    .line 101
    :cond_1
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 102
    .line 103
    iput v7, p1, LK2/c;->B:I

    .line 104
    .line 105
    return-void

    .line 106
    :sswitch_0
    iput-wide p2, v0, LK2/d;->t:J

    .line 107
    .line 108
    return-void

    .line 109
    :sswitch_1
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 110
    .line 111
    .line 112
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 113
    .line 114
    long-to-int p2, p2

    .line 115
    iput p2, p1, LK2/c;->e:I

    .line 116
    .line 117
    return-void

    .line 118
    :sswitch_2
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 119
    .line 120
    .line 121
    long-to-int p1, p2

    .line 122
    if-eqz p1, :cond_5

    .line 123
    .line 124
    if-eq p1, v8, :cond_4

    .line 125
    .line 126
    if-eq p1, v7, :cond_3

    .line 127
    .line 128
    if-eq p1, v6, :cond_2

    .line 129
    .line 130
    goto/16 :goto_0

    .line 131
    .line 132
    :cond_2
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 133
    .line 134
    iput v6, p1, LK2/c;->s:I

    .line 135
    .line 136
    return-void

    .line 137
    :cond_3
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 138
    .line 139
    iput v7, p1, LK2/c;->s:I

    .line 140
    .line 141
    return-void

    .line 142
    :cond_4
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 143
    .line 144
    iput v8, p1, LK2/c;->s:I

    .line 145
    .line 146
    return-void

    .line 147
    :cond_5
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 148
    .line 149
    iput v1, p1, LK2/c;->s:I

    .line 150
    .line 151
    return-void

    .line 152
    :sswitch_3
    iput-wide p2, v0, LK2/d;->T:J

    .line 153
    .line 154
    return-void

    .line 155
    :sswitch_4
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 156
    .line 157
    .line 158
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 159
    .line 160
    long-to-int p2, p2

    .line 161
    iput p2, p1, LK2/c;->Q:I

    .line 162
    .line 163
    return-void

    .line 164
    :sswitch_5
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 165
    .line 166
    .line 167
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 168
    .line 169
    iput-wide p2, p1, LK2/c;->T:J

    .line 170
    .line 171
    return-void

    .line 172
    :sswitch_6
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 173
    .line 174
    .line 175
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 176
    .line 177
    iput-wide p2, p1, LK2/c;->S:J

    .line 178
    .line 179
    return-void

    .line 180
    :sswitch_7
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 181
    .line 182
    .line 183
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 184
    .line 185
    long-to-int p2, p2

    .line 186
    iput p2, p1, LK2/c;->f:I

    .line 187
    .line 188
    return-void

    .line 189
    :sswitch_8
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 190
    .line 191
    .line 192
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 193
    .line 194
    iput-boolean v8, p1, LK2/c;->y:Z

    .line 195
    .line 196
    long-to-int p2, p2

    .line 197
    iput p2, p1, LK2/c;->o:I

    .line 198
    .line 199
    return-void

    .line 200
    :sswitch_9
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 201
    .line 202
    .line 203
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 204
    .line 205
    cmp-long p2, p2, v4

    .line 206
    .line 207
    if-nez p2, :cond_6

    .line 208
    .line 209
    move v1, v8

    .line 210
    :cond_6
    iput-boolean v1, p1, LK2/c;->V:Z

    .line 211
    .line 212
    return-void

    .line 213
    :sswitch_a
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 214
    .line 215
    .line 216
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 217
    .line 218
    long-to-int p2, p2

    .line 219
    iput p2, p1, LK2/c;->q:I

    .line 220
    .line 221
    return-void

    .line 222
    :sswitch_b
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 223
    .line 224
    .line 225
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 226
    .line 227
    long-to-int p2, p2

    .line 228
    iput p2, p1, LK2/c;->r:I

    .line 229
    .line 230
    return-void

    .line 231
    :sswitch_c
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 232
    .line 233
    .line 234
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 235
    .line 236
    long-to-int p2, p2

    .line 237
    iput p2, p1, LK2/c;->p:I

    .line 238
    .line 239
    return-void

    .line 240
    :sswitch_d
    long-to-int p2, p2

    .line 241
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 242
    .line 243
    .line 244
    if-eqz p2, :cond_a

    .line 245
    .line 246
    if-eq p2, v8, :cond_9

    .line 247
    .line 248
    if-eq p2, v6, :cond_8

    .line 249
    .line 250
    const/16 p1, 0xf

    .line 251
    .line 252
    if-eq p2, p1, :cond_7

    .line 253
    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :cond_7
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 257
    .line 258
    iput v6, p1, LK2/c;->x:I

    .line 259
    .line 260
    return-void

    .line 261
    :cond_8
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 262
    .line 263
    iput v8, p1, LK2/c;->x:I

    .line 264
    .line 265
    return-void

    .line 266
    :cond_9
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 267
    .line 268
    iput v7, p1, LK2/c;->x:I

    .line 269
    .line 270
    return-void

    .line 271
    :cond_a
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 272
    .line 273
    iput v1, p1, LK2/c;->x:I

    .line 274
    .line 275
    return-void

    .line 276
    :sswitch_e
    iget-wide v1, v0, LK2/d;->s:J

    .line 277
    .line 278
    add-long/2addr p2, v1

    .line 279
    iput-wide p2, v0, LK2/d;->z:J

    .line 280
    .line 281
    return-void

    .line 282
    :sswitch_f
    cmp-long p1, p2, v4

    .line 283
    .line 284
    if-nez p1, :cond_b

    .line 285
    .line 286
    goto/16 :goto_0

    .line 287
    .line 288
    :cond_b
    new-instance p1, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    const-string v0, "AESSettingsCipherMode "

    .line 291
    .line 292
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-static {v2, p1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    throw p1

    .line 310
    :sswitch_10
    const-wide/16 v0, 0x5

    .line 311
    .line 312
    cmp-long p1, p2, v0

    .line 313
    .line 314
    if-nez p1, :cond_c

    .line 315
    .line 316
    goto/16 :goto_0

    .line 317
    .line 318
    :cond_c
    new-instance p1, Ljava/lang/StringBuilder;

    .line 319
    .line 320
    const-string v0, "ContentEncAlgo "

    .line 321
    .line 322
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-static {v2, p1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    throw p1

    .line 340
    :sswitch_11
    cmp-long p1, p2, v4

    .line 341
    .line 342
    if-nez p1, :cond_d

    .line 343
    .line 344
    goto/16 :goto_0

    .line 345
    .line 346
    :cond_d
    new-instance p1, Ljava/lang/StringBuilder;

    .line 347
    .line 348
    const-string v0, "EBMLReadVersion "

    .line 349
    .line 350
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    invoke-static {v2, p1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    throw p1

    .line 368
    :sswitch_12
    cmp-long p1, p2, v4

    .line 369
    .line 370
    if-ltz p1, :cond_e

    .line 371
    .line 372
    const-wide/16 v0, 0x2

    .line 373
    .line 374
    cmp-long p1, p2, v0

    .line 375
    .line 376
    if-gtz p1, :cond_e

    .line 377
    .line 378
    goto/16 :goto_0

    .line 379
    .line 380
    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    const-string v0, "DocTypeReadVersion "

    .line 383
    .line 384
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    invoke-static {v2, p1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    throw p1

    .line 402
    :sswitch_13
    const-wide/16 v0, 0x3

    .line 403
    .line 404
    cmp-long p1, p2, v0

    .line 405
    .line 406
    if-nez p1, :cond_f

    .line 407
    .line 408
    goto/16 :goto_0

    .line 409
    .line 410
    :cond_f
    new-instance p1, Ljava/lang/StringBuilder;

    .line 411
    .line 412
    const-string v0, "ContentCompAlgo "

    .line 413
    .line 414
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    invoke-static {v2, p1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    throw p1

    .line 432
    :sswitch_14
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 433
    .line 434
    .line 435
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 436
    .line 437
    long-to-int p2, p2

    .line 438
    iput p2, p1, LK2/c;->g:I

    .line 439
    .line 440
    return-void

    .line 441
    :sswitch_15
    iput-boolean v8, v0, LK2/d;->S:Z

    .line 442
    .line 443
    return-void

    .line 444
    :sswitch_16
    iget-boolean v1, v0, LK2/d;->G:Z

    .line 445
    .line 446
    if-nez v1, :cond_14

    .line 447
    .line 448
    invoke-virtual {v0, p1}, LK2/d;->b(I)V

    .line 449
    .line 450
    .line 451
    iget-object p1, v0, LK2/d;->F:LQ1/l;

    .line 452
    .line 453
    invoke-virtual {p1, p2, p3}, LQ1/l;->a(J)V

    .line 454
    .line 455
    .line 456
    iput-boolean v8, v0, LK2/d;->G:Z

    .line 457
    .line 458
    return-void

    .line 459
    :sswitch_17
    long-to-int p1, p2

    .line 460
    iput p1, v0, LK2/d;->R:I

    .line 461
    .line 462
    return-void

    .line 463
    :sswitch_18
    invoke-virtual {v0, p2, p3}, LK2/d;->m(J)J

    .line 464
    .line 465
    .line 466
    move-result-wide p1

    .line 467
    iput-wide p1, v0, LK2/d;->D:J

    .line 468
    .line 469
    return-void

    .line 470
    :sswitch_19
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 471
    .line 472
    .line 473
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 474
    .line 475
    long-to-int p2, p2

    .line 476
    iput p2, p1, LK2/c;->c:I

    .line 477
    .line 478
    return-void

    .line 479
    :sswitch_1a
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 480
    .line 481
    .line 482
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 483
    .line 484
    long-to-int p2, p2

    .line 485
    iput p2, p1, LK2/c;->n:I

    .line 486
    .line 487
    return-void

    .line 488
    :sswitch_1b
    invoke-virtual {v0, p1}, LK2/d;->b(I)V

    .line 489
    .line 490
    .line 491
    iget-object p1, v0, LK2/d;->E:LQ1/l;

    .line 492
    .line 493
    invoke-virtual {v0, p2, p3}, LK2/d;->m(J)J

    .line 494
    .line 495
    .line 496
    move-result-wide p2

    .line 497
    invoke-virtual {p1, p2, p3}, LQ1/l;->a(J)V

    .line 498
    .line 499
    .line 500
    return-void

    .line 501
    :sswitch_1c
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 502
    .line 503
    .line 504
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 505
    .line 506
    long-to-int p2, p2

    .line 507
    iput p2, p1, LK2/c;->m:I

    .line 508
    .line 509
    return-void

    .line 510
    :sswitch_1d
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 511
    .line 512
    .line 513
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 514
    .line 515
    long-to-int p2, p2

    .line 516
    iput p2, p1, LK2/c;->P:I

    .line 517
    .line 518
    return-void

    .line 519
    :sswitch_1e
    invoke-virtual {v0, p2, p3}, LK2/d;->m(J)J

    .line 520
    .line 521
    .line 522
    move-result-wide p1

    .line 523
    iput-wide p1, v0, LK2/d;->K:J

    .line 524
    .line 525
    return-void

    .line 526
    :sswitch_1f
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 527
    .line 528
    .line 529
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 530
    .line 531
    cmp-long p2, p2, v4

    .line 532
    .line 533
    if-nez p2, :cond_10

    .line 534
    .line 535
    move v1, v8

    .line 536
    :cond_10
    iput-boolean v1, p1, LK2/c;->W:Z

    .line 537
    .line 538
    return-void

    .line 539
    :sswitch_20
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 540
    .line 541
    .line 542
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 543
    .line 544
    long-to-int p2, p2

    .line 545
    iput p2, p1, LK2/c;->d:I

    .line 546
    .line 547
    return-void

    .line 548
    :cond_11
    cmp-long p1, p2, v4

    .line 549
    .line 550
    if-nez p1, :cond_12

    .line 551
    .line 552
    goto :goto_0

    .line 553
    :cond_12
    new-instance p1, Ljava/lang/StringBuilder;

    .line 554
    .line 555
    const-string v0, "ContentEncodingScope "

    .line 556
    .line 557
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object p1

    .line 570
    invoke-static {v2, p1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 571
    .line 572
    .line 573
    move-result-object p1

    .line 574
    throw p1

    .line 575
    :cond_13
    const-wide/16 v0, 0x0

    .line 576
    .line 577
    cmp-long p1, p2, v0

    .line 578
    .line 579
    if-nez p1, :cond_15

    .line 580
    .line 581
    :cond_14
    :goto_0
    return-void

    .line 582
    :cond_15
    new-instance p1, Ljava/lang/StringBuilder;

    .line 583
    .line 584
    const-string v0, "ContentEncodingOrder "

    .line 585
    .line 586
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object p1

    .line 599
    invoke-static {v2, p1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 600
    .line 601
    .line 602
    move-result-object p1

    .line 603
    throw p1

    .line 604
    nop

    .line 605
    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_20
        0x88 -> :sswitch_1f
        0x9b -> :sswitch_1e
        0x9f -> :sswitch_1d
        0xb0 -> :sswitch_1c
        0xb3 -> :sswitch_1b
        0xba -> :sswitch_1a
        0xd7 -> :sswitch_19
        0xe7 -> :sswitch_18
        0xee -> :sswitch_17
        0xf1 -> :sswitch_16
        0xfb -> :sswitch_15
        0x41e7 -> :sswitch_14
        0x4254 -> :sswitch_13
        0x4285 -> :sswitch_12
        0x42f7 -> :sswitch_11
        0x47e1 -> :sswitch_10
        0x47e8 -> :sswitch_f
        0x53ac -> :sswitch_e
        0x53b8 -> :sswitch_d
        0x54b0 -> :sswitch_c
        0x54b2 -> :sswitch_b
        0x54ba -> :sswitch_a
        0x55aa -> :sswitch_9
        0x55b2 -> :sswitch_8
        0x55ee -> :sswitch_7
        0x56aa -> :sswitch_6
        0x56bb -> :sswitch_5
        0x6264 -> :sswitch_4
        0x75a2 -> :sswitch_3
        0x7671 -> :sswitch_2
        0x23e383 -> :sswitch_1
        0x2ad7b1 -> :sswitch_0
    .end sparse-switch

    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    :pswitch_data_0
    .packed-switch 0x55b9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public t(Ljava/lang/String;ILjava/io/IOException;[BLjava/util/Map;)V
    .locals 7

    .line 1
    iget-object v0, p0, LA/e0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, LA7/L1;

    .line 5
    .line 6
    move-object v2, p1

    .line 7
    move v3, p2

    .line 8
    move-object v4, p3

    .line 9
    move-object v5, p4

    .line 10
    move-object v6, p5

    .line 11
    invoke-virtual/range {v1 .. v6}, LA7/L1;->J(Ljava/lang/String;ILjava/io/IOException;[BLjava/util/Map;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 23
    check-cast p1, LZ8/a;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 24
    const-string p1, "FirebaseCrashlytics"

    const-string v1, "Received null app settings at app startup. Cannot send cached reports"

    invoke-static {p1, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 25
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    .line 26
    :cond_0
    iget-object p1, p0, LA/e0;->b:Ljava/lang/Object;

    check-cast p1, LS3/c;

    iget-object v1, p1, LS3/c;->c:Ljava/lang/Object;

    check-cast v1, LR8/m;

    invoke-static {v1}, LR8/m;->a(LR8/m;)Lcom/google/android/gms/tasks/Task;

    .line 27
    iget-object p1, p1, LS3/c;->c:Ljava/lang/Object;

    check-cast p1, LR8/m;

    iget-object v1, p1, LR8/m;->m:LD6/o;

    .line 28
    iget-object v2, p1, LR8/m;->e:LS8/f;

    iget-object v2, v2, LS8/f;->a:LS8/c;

    .line 29
    invoke-virtual {v1, v0, v2}, LD6/o;->j(Ljava/lang/String;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;

    .line 30
    iget-object p1, p1, LR8/m;->r:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 31
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public synthetic then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzahh;

    .line 4
    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzahn;

    if-eqz v0, :cond_1

    .line 5
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzahn;

    .line 6
    new-instance v0, LK8/B;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahn;->zzf()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahn;->zze()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahn;->zzc()I

    move-result v3

    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahn;->zzb()I

    move-result v4

    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahn;->zzd()J

    move-result-wide v5

    .line 12
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahn;->zza()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    iget-object p1, p0, LA/e0;->b:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct/range {v0 .. v8}, LK8/B;-><init>(Ljava/lang/String;Ljava/lang/String;IIJLjava/lang/String;Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 13
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    .line 14
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Response should be an instance of StartTotpMfaEnrollmentResponse but was "

    const-string v2, "."

    .line 16
    invoke-static {v1, p1, v2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 17
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, LA/e0;->a:I

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "1"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, LA7/E0;->values()[LA7/E0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    array-length v2, v1

    .line 23
    const/4 v3, 0x0

    .line 24
    :goto_0
    if-ge v3, v2, :cond_1

    .line 25
    .line 26
    aget-object v4, v1, v3

    .line 27
    .line 28
    iget-object v5, p0, LA/e0;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, Ljava/util/EnumMap;

    .line 31
    .line 32
    invoke-virtual {v5, v4}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, LA7/h;

    .line 37
    .line 38
    if-nez v4, :cond_0

    .line 39
    .line 40
    sget-object v4, LA7/h;->b:LA7/h;

    .line 41
    .line 42
    :cond_0
    iget-char v4, v4, LA7/h;->a:C

    .line 43
    .line 44
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0

    .line 55
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public u()V
    .locals 12

    .line 1
    iget-object v0, p0, LA/e0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La2/m;

    .line 4
    .line 5
    iget v1, v0, La2/m;->r:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    iput v1, v0, La2/m;->r:I

    .line 10
    .line 11
    if-lez v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v1, v0, La2/m;->t:[La2/s;

    .line 15
    .line 16
    array-length v2, v1

    .line 17
    const/4 v3, 0x0

    .line 18
    move v4, v3

    .line 19
    move v5, v4

    .line 20
    :goto_0
    if-ge v4, v2, :cond_1

    .line 21
    .line 22
    aget-object v6, v1, v4

    .line 23
    .line 24
    invoke-virtual {v6}, La2/s;->a()V

    .line 25
    .line 26
    .line 27
    iget-object v6, v6, La2/s;->I:Lk2/n0;

    .line 28
    .line 29
    iget v6, v6, Lk2/n0;->a:I

    .line 30
    .line 31
    add-int/2addr v5, v6

    .line 32
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    new-array v1, v5, [LN1/O;

    .line 36
    .line 37
    iget-object v2, v0, La2/m;->t:[La2/s;

    .line 38
    .line 39
    array-length v4, v2

    .line 40
    move v5, v3

    .line 41
    move v6, v5

    .line 42
    :goto_1
    if-ge v5, v4, :cond_3

    .line 43
    .line 44
    aget-object v7, v2, v5

    .line 45
    .line 46
    invoke-virtual {v7}, La2/s;->a()V

    .line 47
    .line 48
    .line 49
    iget-object v8, v7, La2/s;->I:Lk2/n0;

    .line 50
    .line 51
    iget v8, v8, Lk2/n0;->a:I

    .line 52
    .line 53
    move v9, v3

    .line 54
    :goto_2
    if-ge v9, v8, :cond_2

    .line 55
    .line 56
    add-int/lit8 v10, v6, 0x1

    .line 57
    .line 58
    invoke-virtual {v7}, La2/s;->a()V

    .line 59
    .line 60
    .line 61
    iget-object v11, v7, La2/s;->I:Lk2/n0;

    .line 62
    .line 63
    invoke-virtual {v11, v9}, Lk2/n0;->a(I)LN1/O;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    aput-object v11, v1, v6

    .line 68
    .line 69
    add-int/lit8 v9, v9, 0x1

    .line 70
    .line 71
    move v6, v10

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    new-instance v2, Lk2/n0;

    .line 77
    .line 78
    invoke-direct {v2, v1}, Lk2/n0;-><init>([LN1/O;)V

    .line 79
    .line 80
    .line 81
    iput-object v2, v0, La2/m;->s:Lk2/n0;

    .line 82
    .line 83
    iget-object v1, v0, La2/m;->q:Lk2/E;

    .line 84
    .line 85
    invoke-interface {v1, v0}, Lk2/E;->l(Lk2/F;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public v(Ljava/lang/String;Lkotlinx/serialization/json/d;)Lkotlinx/serialization/json/b;
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "element"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LA/e0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lkotlinx/serialization/json/b;

    .line 20
    .line 21
    return-object p1
.end method

.method public w(Lo2/j;JJZ)V
    .locals 0

    .line 1
    check-cast p1, Lo2/p;

    .line 2
    .line 3
    iget-object p2, p0, LA/e0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p2, LX1/f;

    .line 6
    .line 7
    invoke-virtual {p2, p1, p4, p5}, LX1/f;->v(Lo2/p;J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public declared-synchronized x(LA4/c;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iput-object v0, p1, LA4/c;->b:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    iput-object v0, p1, LA4/c;->c:LA4/b;

    .line 6
    .line 7
    iget-object v0, p0, LA/e0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw p1

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_0
.end method

.method public y(LI5/f;)V
    .locals 0

    .line 1
    return-void
.end method

.method public z(IJJ)V
    .locals 8

    .line 1
    iget-object v0, p0, LA/e0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LK2/d;

    .line 4
    .line 5
    iget-object v1, v0, LK2/d;->d0:Ls2/o;

    .line 6
    .line 7
    invoke-static {v1}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0xa0

    .line 11
    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    if-eq p1, v1, :cond_c

    .line 16
    .line 17
    const/16 v1, 0xae

    .line 18
    .line 19
    const/4 v5, -0x1

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x1

    .line 22
    if-eq p1, v1, :cond_b

    .line 23
    .line 24
    const/16 v1, 0xbb

    .line 25
    .line 26
    if-eq p1, v1, :cond_a

    .line 27
    .line 28
    const/16 v1, 0x4dbb

    .line 29
    .line 30
    const-wide/16 v2, -0x1

    .line 31
    .line 32
    if-eq p1, v1, :cond_9

    .line 33
    .line 34
    const/16 v1, 0x5035

    .line 35
    .line 36
    if-eq p1, v1, :cond_8

    .line 37
    .line 38
    const/16 v1, 0x55d0

    .line 39
    .line 40
    if-eq p1, v1, :cond_7

    .line 41
    .line 42
    const v1, 0x18538067

    .line 43
    .line 44
    .line 45
    if-eq p1, v1, :cond_4

    .line 46
    .line 47
    const p2, 0x1c53bb6b

    .line 48
    .line 49
    .line 50
    if-eq p1, p2, :cond_3

    .line 51
    .line 52
    const p2, 0x1f43b675

    .line 53
    .line 54
    .line 55
    if-eq p1, p2, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget-boolean p1, v0, LK2/d;->x:Z

    .line 59
    .line 60
    if-nez p1, :cond_2

    .line 61
    .line 62
    iget-boolean p1, v0, LK2/d;->d:Z

    .line 63
    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    iget-wide p1, v0, LK2/d;->B:J

    .line 67
    .line 68
    cmp-long p1, p1, v2

    .line 69
    .line 70
    if-eqz p1, :cond_1

    .line 71
    .line 72
    iput-boolean v7, v0, LK2/d;->A:Z

    .line 73
    .line 74
    return-void

    .line 75
    :cond_1
    iget-object p1, v0, LK2/d;->d0:Ls2/o;

    .line 76
    .line 77
    new-instance p2, Ls2/q;

    .line 78
    .line 79
    iget-wide p3, v0, LK2/d;->v:J

    .line 80
    .line 81
    invoke-direct {p2, p3, p4}, Ls2/q;-><init>(J)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p1, p2}, Ls2/o;->s(Ls2/w;)V

    .line 85
    .line 86
    .line 87
    iput-boolean v7, v0, LK2/d;->x:Z

    .line 88
    .line 89
    :cond_2
    :goto_0
    return-void

    .line 90
    :cond_3
    new-instance p1, LQ1/l;

    .line 91
    .line 92
    const/4 p2, 0x0

    .line 93
    const/4 p3, 0x0

    .line 94
    invoke-direct {p1, p3, p2}, LQ1/l;-><init>(BI)V

    .line 95
    .line 96
    .line 97
    iput-object p1, v0, LK2/d;->E:LQ1/l;

    .line 98
    .line 99
    new-instance p1, LQ1/l;

    .line 100
    .line 101
    invoke-direct {p1, p3, p2}, LQ1/l;-><init>(BI)V

    .line 102
    .line 103
    .line 104
    iput-object p1, v0, LK2/d;->F:LQ1/l;

    .line 105
    .line 106
    return-void

    .line 107
    :cond_4
    iget-wide v4, v0, LK2/d;->s:J

    .line 108
    .line 109
    cmp-long p1, v4, v2

    .line 110
    .line 111
    if-eqz p1, :cond_6

    .line 112
    .line 113
    cmp-long p1, v4, p2

    .line 114
    .line 115
    if-nez p1, :cond_5

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_5
    const-string p1, "Multiple Segment elements not supported"

    .line 119
    .line 120
    invoke-static {v6, p1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    throw p1

    .line 125
    :cond_6
    :goto_1
    iput-wide p2, v0, LK2/d;->s:J

    .line 126
    .line 127
    iput-wide p4, v0, LK2/d;->r:J

    .line 128
    .line 129
    return-void

    .line 130
    :cond_7
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 131
    .line 132
    .line 133
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 134
    .line 135
    iput-boolean v7, p1, LK2/c;->y:Z

    .line 136
    .line 137
    return-void

    .line 138
    :cond_8
    invoke-virtual {v0, p1}, LK2/d;->c(I)V

    .line 139
    .line 140
    .line 141
    iget-object p1, v0, LK2/d;->w:LK2/c;

    .line 142
    .line 143
    iput-boolean v7, p1, LK2/c;->h:Z

    .line 144
    .line 145
    return-void

    .line 146
    :cond_9
    iput v5, v0, LK2/d;->y:I

    .line 147
    .line 148
    iput-wide v2, v0, LK2/d;->z:J

    .line 149
    .line 150
    return-void

    .line 151
    :cond_a
    iput-boolean v4, v0, LK2/d;->G:Z

    .line 152
    .line 153
    return-void

    .line 154
    :cond_b
    new-instance p1, LK2/c;

    .line 155
    .line 156
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 157
    .line 158
    .line 159
    iput v5, p1, LK2/c;->m:I

    .line 160
    .line 161
    iput v5, p1, LK2/c;->n:I

    .line 162
    .line 163
    iput v5, p1, LK2/c;->o:I

    .line 164
    .line 165
    iput v5, p1, LK2/c;->p:I

    .line 166
    .line 167
    iput v5, p1, LK2/c;->q:I

    .line 168
    .line 169
    iput v4, p1, LK2/c;->r:I

    .line 170
    .line 171
    iput v5, p1, LK2/c;->s:I

    .line 172
    .line 173
    const/4 p2, 0x0

    .line 174
    iput p2, p1, LK2/c;->t:F

    .line 175
    .line 176
    iput p2, p1, LK2/c;->u:F

    .line 177
    .line 178
    iput p2, p1, LK2/c;->v:F

    .line 179
    .line 180
    iput-object v6, p1, LK2/c;->w:[B

    .line 181
    .line 182
    iput v5, p1, LK2/c;->x:I

    .line 183
    .line 184
    iput-boolean v4, p1, LK2/c;->y:Z

    .line 185
    .line 186
    iput v5, p1, LK2/c;->z:I

    .line 187
    .line 188
    iput v5, p1, LK2/c;->A:I

    .line 189
    .line 190
    iput v5, p1, LK2/c;->B:I

    .line 191
    .line 192
    const/16 p2, 0x3e8

    .line 193
    .line 194
    iput p2, p1, LK2/c;->C:I

    .line 195
    .line 196
    const/16 p2, 0xc8

    .line 197
    .line 198
    iput p2, p1, LK2/c;->D:I

    .line 199
    .line 200
    const/high16 p2, -0x40800000    # -1.0f

    .line 201
    .line 202
    iput p2, p1, LK2/c;->E:F

    .line 203
    .line 204
    iput p2, p1, LK2/c;->F:F

    .line 205
    .line 206
    iput p2, p1, LK2/c;->G:F

    .line 207
    .line 208
    iput p2, p1, LK2/c;->H:F

    .line 209
    .line 210
    iput p2, p1, LK2/c;->I:F

    .line 211
    .line 212
    iput p2, p1, LK2/c;->J:F

    .line 213
    .line 214
    iput p2, p1, LK2/c;->K:F

    .line 215
    .line 216
    iput p2, p1, LK2/c;->L:F

    .line 217
    .line 218
    iput p2, p1, LK2/c;->M:F

    .line 219
    .line 220
    iput p2, p1, LK2/c;->N:F

    .line 221
    .line 222
    iput v7, p1, LK2/c;->P:I

    .line 223
    .line 224
    iput v5, p1, LK2/c;->Q:I

    .line 225
    .line 226
    const/16 p2, 0x1f40

    .line 227
    .line 228
    iput p2, p1, LK2/c;->R:I

    .line 229
    .line 230
    iput-wide v2, p1, LK2/c;->S:J

    .line 231
    .line 232
    iput-wide v2, p1, LK2/c;->T:J

    .line 233
    .line 234
    iput-boolean v7, p1, LK2/c;->W:Z

    .line 235
    .line 236
    const-string p2, "eng"

    .line 237
    .line 238
    iput-object p2, p1, LK2/c;->X:Ljava/lang/String;

    .line 239
    .line 240
    iput-object p1, v0, LK2/d;->w:LK2/c;

    .line 241
    .line 242
    return-void

    .line 243
    :cond_c
    iput-boolean v4, v0, LK2/d;->S:Z

    .line 244
    .line 245
    iput-wide v2, v0, LK2/d;->T:J

    .line 246
    .line 247
    return-void
.end method

.method public synthetic zza()Lp8/p;
    .locals 8

    .line 1
    iget-object v0, p0, LA/e0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, LN6/j;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object v2, v1, LN6/j;->b:Landroid/content/Context;

    .line 10
    .line 11
    const-string v4, "BANNER"

    .line 12
    .line 13
    new-instance v7, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual/range {v1 .. v7}, LN6/j;->W(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;LD6/x1;LD6/v1;Landroid/os/Bundle;)LN6/G;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, LN6/G;->zza()Lp8/p;

    .line 26
    .line 27
    .line 28
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    return-object v0

    .line 30
    :catch_0
    move-exception v0

    .line 31
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhcf;->zzc(Ljava/lang/Throwable;)Lp8/p;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method
