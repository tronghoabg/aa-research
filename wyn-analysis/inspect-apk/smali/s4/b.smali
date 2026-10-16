.class public Ls4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;
.implements Lrc/a;
.implements Luc/p;
.implements Luc/i;
.implements Luc/t;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final c:Ljava/util/concurrent/ExecutorService;

.field public d:Luc/r;

.field public e:Luc/j;

.field public f:Ltc/g;

.field public g:Landroid/content/Context;

.field public h:Landroid/app/Activity;

.field public i:Lqc/a;

.field public j:Luc/h;

.field public final k:Lcom/google/android/gms/ads/nativead/l;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ls4/b;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ls4/b;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    const/16 v0, 0xa

    .line 20
    .line 21
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Ls4/b;->c:Ljava/util/concurrent/ExecutorService;

    .line 26
    .line 27
    new-instance v0, Lcom/google/android/gms/ads/nativead/l;

    .line 28
    .line 29
    const/16 v2, 0x13

    .line 30
    .line 31
    invoke-direct {v0, v2}, Lcom/google/android/gms/ads/nativead/l;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 35
    .line 36
    const-string v0, "FFmpegKitFlutterPlugin created %s."

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    new-array v2, v2, [Ljava/lang/Object;

    .line 40
    .line 41
    aput-object p0, v2, v1

    .line 42
    .line 43
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "ffmpeg-kit-flutter"

    .line 48
    .line 49
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static k(Ljava/lang/Integer;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-ltz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static l(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 4

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
    if-ge v1, v2, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    instance-of v3, v2, Lorg/json/JSONArray;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    check-cast v2, Lorg/json/JSONArray;

    .line 24
    .line 25
    invoke-static {v2}, Ls4/b;->l(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    instance-of v3, v2, Lorg/json/JSONObject;

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    check-cast v2, Lorg/json/JSONObject;

    .line 35
    .line 36
    invoke-static {v2}, Ls4/b;->n(Lorg/json/JSONObject;)Ljava/util/HashMap;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    :cond_1
    :goto_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    return-object v0
.end method

.method public static m(Lcom/google/android/gms/ads/nativead/l;)Ljava/util/HashMap;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    new-instance v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lorg/json/JSONObject;

    .line 11
    .line 12
    invoke-static {p0}, Ls4/b;->n(Lorg/json/JSONObject;)Ljava/util/HashMap;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static n(Lorg/json/JSONObject;)Ljava/util/HashMap;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    instance-of v4, v3, Lorg/json/JSONArray;

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    check-cast v3, Lorg/json/JSONArray;

    .line 33
    .line 34
    invoke-static {v3}, Ls4/b;->l(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    instance-of v4, v3, Lorg/json/JSONObject;

    .line 40
    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    check-cast v3, Lorg/json/JSONObject;

    .line 44
    .line 45
    invoke-static {v3}, Ls4/b;->n(Lorg/json/JSONObject;)Ljava/util/HashMap;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    :cond_2
    :goto_1
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    return-object v0
.end method

.method public static o(Lr4/e;)Ljava/util/HashMap;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lr4/e;->a:J

    .line 7
    .line 8
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "sessionId"

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lr4/e;->b:I

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/16 v1, 0x38

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v1}, Lpd/f;->i(I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "level"

    .line 33
    .line 34
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Lr4/e;->c:Ljava/lang/String;

    .line 38
    .line 39
    const-string v1, "message"

    .line 40
    .line 41
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    return-object v0
.end method

.method public static p(Lr4/h;)Ljava/util/HashMap;
    .locals 7

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    move-object v1, p0

    .line 11
    check-cast v1, Lr4/a;

    .line 12
    .line 13
    iget-wide v2, v1, Lr4/a;->a:J

    .line 14
    .line 15
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "sessionId"

    .line 20
    .line 21
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iget-object v2, v1, Lr4/a;->b:Ljava/util/Date;

    .line 25
    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-wide v5, v3

    .line 36
    :goto_0
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v5, "createTime"

    .line 41
    .line 42
    invoke-virtual {v0, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    iget-object v2, v1, Lr4/a;->c:Ljava/util/Date;

    .line 46
    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    :cond_2
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const-string v3, "startTime"

    .line 58
    .line 59
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    iget-object v1, v1, Lr4/a;->e:[Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->a([Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v2, "command"

    .line 69
    .line 70
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    invoke-interface {p0}, Lr4/h;->a()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    const-string v2, "type"

    .line 78
    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    const/4 p0, 0x1

    .line 82
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {v0, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_3
    invoke-interface {p0}, Lr4/h;->b()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_4

    .line 95
    .line 96
    const/4 p0, 0x2

    .line 97
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {v0, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    return-object v0

    .line 105
    :cond_4
    invoke-interface {p0}, Lr4/h;->c()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_6

    .line 110
    .line 111
    check-cast p0, Lr4/f;

    .line 112
    .line 113
    iget-object p0, p0, Lr4/f;->n:Lcom/google/android/gms/ads/nativead/l;

    .line 114
    .line 115
    if-eqz p0, :cond_5

    .line 116
    .line 117
    invoke-static {p0}, Ls4/b;->m(Lcom/google/android/gms/ads/nativead/l;)Ljava/util/HashMap;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    const-string v1, "mediaInformation"

    .line 122
    .line 123
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :cond_5
    const/4 p0, 0x3

    .line 127
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {v0, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    :cond_6
    return-object v0
.end method

.method public static q(Lr4/i;)Ljava/util/HashMap;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    iget-wide v1, p0, Lr4/i;->a:J

    .line 9
    .line 10
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "sessionId"

    .line 15
    .line 16
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iget v1, p0, Lr4/i;->b:I

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "videoFrameNumber"

    .line 26
    .line 27
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget v1, p0, Lr4/i;->c:F

    .line 31
    .line 32
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "videoFps"

    .line 37
    .line 38
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    iget v1, p0, Lr4/i;->d:F

    .line 42
    .line 43
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v2, "videoQuality"

    .line 48
    .line 49
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    iget-wide v1, p0, Lr4/i;->e:J

    .line 53
    .line 54
    const-wide/32 v3, 0x7fffffff

    .line 55
    .line 56
    .line 57
    cmp-long v5, v1, v3

    .line 58
    .line 59
    if-gez v5, :cond_0

    .line 60
    .line 61
    :goto_0
    long-to-int v1, v1

    .line 62
    goto :goto_1

    .line 63
    :cond_0
    rem-long/2addr v1, v3

    .line 64
    goto :goto_0

    .line 65
    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const-string v2, "size"

    .line 70
    .line 71
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    iget-wide v1, p0, Lr4/i;->f:D

    .line 75
    .line 76
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const-string v2, "time"

    .line 81
    .line 82
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    iget-wide v1, p0, Lr4/i;->g:D

    .line 86
    .line 87
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const-string v2, "bitrate"

    .line 92
    .line 93
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    iget-wide v1, p0, Lr4/i;->h:D

    .line 97
    .line 98
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    const-string v1, "speed"

    .line 103
    .line 104
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    :cond_1
    return-object v0
.end method

.method public static r(Ljava/util/LinkedList;)Ljava/util/ArrayList;
    .locals 3

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
    invoke-virtual {p0}, Ljava/util/LinkedList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lr4/h;

    .line 18
    .line 19
    invoke-static {v2}, Ls4/b;->p(Lr4/h;)Ljava/util/HashMap;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(Ltc/g;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/LinkedList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/LinkedList;->clear()V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->d:La2/e;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    .line 12
    .line 13
    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    iget-object v0, p0, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw p1
.end method

.method public final b(Lr4/a;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ls4/b;->p(Lr4/h;)Ljava/util/HashMap;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v1, "FFmpegKitCompleteCallbackEvent"

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Ls4/b;->j:Luc/h;

    .line 16
    .line 17
    iget-object v1, p0, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v2, LVc/f;

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    invoke-direct {v2, p1, v0, v3}, LVc/f;-><init>(Luc/h;Ljava/util/HashMap;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Ls4/b;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Ls4/b;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final e(Ltc/g;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2
    .line 3
    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    .line 5
    new-instance v1, Ljava/util/LinkedList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v2, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v2

    .line 13
    :try_start_0
    sget-object v3, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/LinkedList;

    .line 14
    .line 15
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Lr4/h;

    .line 30
    .line 31
    invoke-interface {v4}, Lr4/h;->a()Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    check-cast v4, Lr4/c;

    .line 38
    .line 39
    invoke-virtual {v1, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    invoke-static {v1}, Ls4/b;->r(Ljava/util/LinkedList;)Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    throw p1
.end method

.method public final f(Ltc/g;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2
    .line 3
    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    .line 5
    new-instance v1, Ljava/util/LinkedList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v2, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v2

    .line 13
    :try_start_0
    sget-object v3, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/LinkedList;

    .line 14
    .line 15
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Lr4/h;

    .line 30
    .line 31
    invoke-interface {v4}, Lr4/h;->b()Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    check-cast v4, Lr4/d;

    .line 38
    .line 39
    invoke-virtual {v1, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    invoke-static {v1}, Ls4/b;->r(Ljava/util/LinkedList;)Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    throw p1
.end method

.method public final g(Ltc/g;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/LinkedList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    add-int/lit8 v1, v1, -0x1

    .line 11
    .line 12
    :goto_0
    if-ltz v1, :cond_1

    .line 13
    .line 14
    sget-object v2, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/LinkedList;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lr4/h;

    .line 21
    .line 22
    move-object v3, v2

    .line 23
    check-cast v3, Lr4/a;

    .line 24
    .line 25
    iget v3, v3, Lr4/a;->i:I

    .line 26
    .line 27
    const/4 v4, 0x4

    .line 28
    if-ne v3, v4, :cond_0

    .line 29
    .line 30
    monitor-exit v0

    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_2

    .line 34
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    const/4 v2, 0x0

    .line 39
    :goto_1
    iget-object v0, p0, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 40
    .line 41
    invoke-static {v2}, Ls4/b;->p(Lr4/h;)Ljava/util/HashMap;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    throw p1
.end method

.method public final h(Ltc/g;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/LinkedList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-lez v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/lit8 v2, v2, -0x1

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lr4/h;

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    const/4 v1, 0x0

    .line 30
    :goto_0
    iget-object v0, p0, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 31
    .line 32
    invoke-static {v1}, Ls4/b;->p(Lr4/h;)Ljava/util/HashMap;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    throw p1
.end method

.method public final i(Ltc/g;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2
    .line 3
    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    new-instance v2, Ljava/util/LinkedList;

    .line 7
    .line 8
    sget-object v3, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/LinkedList;

    .line 9
    .line 10
    invoke-direct {v2, v3}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 11
    .line 12
    .line 13
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    invoke-static {v2}, Ls4/b;->r(Ljava/util/LinkedList;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw p1
.end method

.method public final j(Ljava/lang/Integer;Ltc/g;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz p1, :cond_2

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-eq p1, v1, :cond_1

    .line 12
    .line 13
    if-eq p1, v2, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x3

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move v1, v2

    .line 20
    :cond_2
    :goto_0
    sget-object p1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 21
    .line 22
    new-instance p1, Ljava/util/LinkedList;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 25
    .line 26
    .line 27
    sget-object v2, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    .line 28
    .line 29
    monitor-enter v2

    .line 30
    :try_start_0
    sget-object v3, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/LinkedList;

    .line 31
    .line 32
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lr4/h;

    .line 47
    .line 48
    move-object v5, v4

    .line 49
    check-cast v5, Lr4/a;

    .line 50
    .line 51
    iget v5, v5, Lr4/a;->i:I

    .line 52
    .line 53
    if-ne v5, v1, :cond_3

    .line 54
    .line 55
    invoke-virtual {p1, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    goto :goto_2

    .line 61
    :cond_4
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    invoke-static {p1}, Ls4/b;->r(Ljava/util/LinkedList;)Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :goto_2
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    throw p1
.end method

.method public final onActivityResult(IILandroid/content/Intent;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez p3, :cond_0

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p3}, Landroid/content/Intent;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    :goto_0
    const/4 v6, 0x3

    .line 21
    new-array v6, v6, [Ljava/lang/Object;

    .line 22
    .line 23
    aput-object v2, v6, v1

    .line 24
    .line 25
    aput-object v3, v6, v0

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    aput-object v5, v6, v2

    .line 29
    .line 30
    const-string v2, "selectDocument completed with requestCode: %d, resultCode: %d, data: %s."

    .line 31
    .line 32
    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v3, "ffmpeg-kit-flutter"

    .line 37
    .line 38
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    const/16 v2, 0x2710

    .line 42
    .line 43
    if-eq p1, v2, :cond_2

    .line 44
    .line 45
    const/16 v2, 0x4e20

    .line 46
    .line 47
    if-ne p1, v2, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-array p2, v0, [Ljava/lang/Object;

    .line 55
    .line 56
    aput-object p1, p2, v1

    .line 57
    .line 58
    const-string p1, "FFmpegKitFlutterPlugin ignored unsupported activity result for requestCode: %d."

    .line 59
    .line 60
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    return v1

    .line 68
    :cond_2
    :goto_1
    const/4 p1, -0x1

    .line 69
    iget-object v1, p0, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 70
    .line 71
    if-ne p2, p1, :cond_5

    .line 72
    .line 73
    if-nez p3, :cond_3

    .line 74
    .line 75
    iget-object p1, p0, Ls4/b;->f:Ltc/g;

    .line 76
    .line 77
    invoke-virtual {v1, p1, v4}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_3
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object p2, p0, Ls4/b;->f:Ltc/g;

    .line 86
    .line 87
    if-nez p1, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    :goto_2
    invoke-virtual {v1, p2, v4}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    iget-object p1, p0, Ls4/b;->f:Ltc/g;

    .line 99
    .line 100
    const-string p3, "SELECT_CANCELLED"

    .line 101
    .line 102
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-virtual {v1, p3, p2, p1}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 107
    .line 108
    .line 109
    :goto_3
    return v0
.end method

.method public final onAttachedToActivity(Lrc/b;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    check-cast p1, Lq/s1;

    .line 5
    .line 6
    iget-object v3, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v3, Landroid/app/Activity;

    .line 9
    .line 10
    new-array v4, v2, [Ljava/lang/Object;

    .line 11
    .line 12
    aput-object p0, v4, v1

    .line 13
    .line 14
    aput-object v3, v4, v0

    .line 15
    .line 16
    const-string v3, "FFmpegKitFlutterPlugin %s attached to activity %s."

    .line 17
    .line 18
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const-string v4, "ffmpeg-kit-flutter"

    .line 23
    .line 24
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    iget-object v3, p0, Ls4/b;->i:Lqc/a;

    .line 28
    .line 29
    iget-object v5, v3, Lqc/a;->c:Luc/f;

    .line 30
    .line 31
    new-instance v6, Ls4/a;

    .line 32
    .line 33
    invoke-direct {v6, p0}, Ls4/a;-><init>(Ls4/b;)V

    .line 34
    .line 35
    .line 36
    sput-object v6, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j:Ls4/a;

    .line 37
    .line 38
    new-instance v6, Ls4/a;

    .line 39
    .line 40
    invoke-direct {v6, p0}, Ls4/a;-><init>(Ls4/b;)V

    .line 41
    .line 42
    .line 43
    sput-object v6, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->k:Ls4/a;

    .line 44
    .line 45
    new-instance v6, Ls4/a;

    .line 46
    .line 47
    invoke-direct {v6, p0}, Ls4/a;-><init>(Ls4/b;)V

    .line 48
    .line 49
    .line 50
    sput-object v6, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->l:Ls4/a;

    .line 51
    .line 52
    new-instance v6, Ls4/a;

    .line 53
    .line 54
    invoke-direct {v6, p0}, Ls4/a;-><init>(Ls4/b;)V

    .line 55
    .line 56
    .line 57
    sput-object v6, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->h:Ls4/a;

    .line 58
    .line 59
    new-instance v6, Ls4/a;

    .line 60
    .line 61
    invoke-direct {v6, p0}, Ls4/a;-><init>(Ls4/b;)V

    .line 62
    .line 63
    .line 64
    sput-object v6, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->i:Ls4/a;

    .line 65
    .line 66
    iget-object v6, p0, Ls4/b;->d:Luc/r;

    .line 67
    .line 68
    if-nez v6, :cond_0

    .line 69
    .line 70
    new-instance v6, Luc/r;

    .line 71
    .line 72
    const-string v7, "flutter.arthenica.com/ffmpeg_kit"

    .line 73
    .line 74
    invoke-direct {v6, v5, v7}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iput-object v6, p0, Ls4/b;->d:Luc/r;

    .line 78
    .line 79
    invoke-virtual {v6, p0}, Luc/r;->b(Luc/p;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    const-string v6, "FFmpegKitFlutterPlugin method channel was already initialised."

    .line 84
    .line 85
    invoke-static {v4, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    :goto_0
    iget-object v6, p0, Ls4/b;->e:Luc/j;

    .line 89
    .line 90
    if-nez v6, :cond_1

    .line 91
    .line 92
    new-instance v6, Luc/j;

    .line 93
    .line 94
    const-string v7, "flutter.arthenica.com/ffmpeg_kit_event"

    .line 95
    .line 96
    invoke-direct {v6, v5, v7}, Luc/j;-><init>(Luc/f;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iput-object v6, p0, Ls4/b;->e:Luc/j;

    .line 100
    .line 101
    invoke-virtual {v6, p0}, Luc/j;->a(Luc/i;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    const-string v5, "FFmpegKitFlutterPlugin event channel was already initialised."

    .line 106
    .line 107
    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    :goto_1
    iget-object v3, v3, Lqc/a;->a:Landroid/content/Context;

    .line 111
    .line 112
    iput-object v3, p0, Ls4/b;->g:Landroid/content/Context;

    .line 113
    .line 114
    iget-object v5, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v5, Landroid/app/Activity;

    .line 117
    .line 118
    iput-object v5, p0, Ls4/b;->h:Landroid/app/Activity;

    .line 119
    .line 120
    invoke-virtual {p1, p0}, Lq/s1;->b(Luc/t;)V

    .line 121
    .line 122
    .line 123
    const-string p1, "FFmpegKitFlutterPlugin %s initialised with context %s and activity %s."

    .line 124
    .line 125
    const/4 v6, 0x3

    .line 126
    new-array v6, v6, [Ljava/lang/Object;

    .line 127
    .line 128
    aput-object p0, v6, v1

    .line 129
    .line 130
    aput-object v3, v6, v0

    .line 131
    .line 132
    aput-object v5, v6, v2

    .line 133
    .line 134
    invoke-static {p1, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {v4, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls4/b;->i:Lqc/a;

    .line 2
    .line 3
    return-void
.end method

.method public final onCancel(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Ls4/b;->j:Luc/h;

    .line 3
    .line 4
    const-string p1, "ffmpeg-kit-flutter"

    .line 5
    .line 6
    const-string v0, "FFmpegKitFlutterPlugin stopped listening to events."

    .line 7
    .line 8
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 3

    .line 1
    iget-object v0, p0, Ls4/b;->d:Luc/r;

    .line 2
    .line 3
    const-string v1, "ffmpeg-kit-flutter"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string v0, "FFmpegKitFlutterPlugin method channel was already uninitialised."

    .line 9
    .line 10
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0, v2}, Luc/r;->b(Luc/p;)V

    .line 15
    .line 16
    .line 17
    iput-object v2, p0, Ls4/b;->d:Luc/r;

    .line 18
    .line 19
    :goto_0
    iget-object v0, p0, Ls4/b;->e:Luc/j;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const-string v0, "FFmpegKitFlutterPlugin event channel was already uninitialised."

    .line 24
    .line 25
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0, v2}, Luc/j;->a(Luc/i;)V

    .line 30
    .line 31
    .line 32
    iput-object v2, p0, Ls4/b;->e:Luc/j;

    .line 33
    .line 34
    :goto_1
    iput-object v2, p0, Ls4/b;->g:Landroid/content/Context;

    .line 35
    .line 36
    iput-object v2, p0, Ls4/b;->h:Landroid/app/Activity;

    .line 37
    .line 38
    const-string v0, "FFmpegKitFlutterPlugin uninitialized."

    .line 39
    .line 40
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    const-string v0, "FFmpegKitFlutterPlugin detached from activity."

    .line 44
    .line 45
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ls4/b;->onDetachedFromActivity()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Ls4/b;->i:Lqc/a;

    .line 3
    .line 4
    return-void
.end method

.method public final onListen(Ljava/lang/Object;Luc/g;)V
    .locals 2

    .line 1
    move-object p1, p2

    .line 2
    check-cast p1, Luc/h;

    .line 3
    .line 4
    iput-object p1, p0, Ls4/b;->j:Luc/h;

    .line 5
    .line 6
    const-string p1, "FFmpegKitFlutterPlugin %s started listening to events on %s."

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    new-array v0, v0, [Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    aput-object p0, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    aput-object p2, v0, v1

    .line 16
    .line 17
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string p2, "ffmpeg-kit-flutter"

    .line 22
    .line 23
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v7, 0x6

    .line 8
    const-string v8, "sessionId"

    .line 9
    .line 10
    invoke-virtual {v0, v8}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v8

    .line 14
    check-cast v8, Ljava/lang/Integer;

    .line 15
    .line 16
    const-string v9, "waitTimeout"

    .line 17
    .line 18
    invoke-virtual {v0, v9}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v9

    .line 22
    check-cast v9, Ljava/lang/Integer;

    .line 23
    .line 24
    const-string v10, "arguments"

    .line 25
    .line 26
    invoke-virtual {v0, v10}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v10

    .line 30
    check-cast v10, Ljava/util/List;

    .line 31
    .line 32
    const-string v11, "ffprobeJsonOutput"

    .line 33
    .line 34
    invoke-virtual {v0, v11}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v11

    .line 38
    check-cast v11, Ljava/lang/String;

    .line 39
    .line 40
    const-string v12, "writable"

    .line 41
    .line 42
    invoke-virtual {v0, v12}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v12

    .line 46
    check-cast v12, Ljava/lang/Boolean;

    .line 47
    .line 48
    iget-object v13, v0, Luc/o;->a:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const/4 v15, 0x0

    .line 54
    const-wide/16 v16, 0x0

    .line 55
    .line 56
    const/4 v14, 0x2

    .line 57
    const/4 v6, 0x3

    .line 58
    const/16 v18, 0x1388

    .line 59
    .line 60
    const/4 v4, 0x1

    .line 61
    const/4 v3, 0x0

    .line 62
    const/16 v19, -0x1

    .line 63
    .line 64
    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result v20

    .line 68
    sparse-switch v20, :sswitch_data_0

    .line 69
    .line 70
    .line 71
    goto/16 :goto_0

    .line 72
    .line 73
    :sswitch_0
    const-string v5, "ffprobeSessionExecute"

    .line 74
    .line 75
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-nez v5, :cond_0

    .line 80
    .line 81
    goto/16 :goto_0

    .line 82
    .line 83
    :cond_0
    const/16 v19, 0x3f

    .line 84
    .line 85
    goto/16 :goto_0

    .line 86
    .line 87
    :sswitch_1
    const-string v5, "setLogRedirectionStrategy"

    .line 88
    .line 89
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-nez v5, :cond_1

    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :cond_1
    const/16 v19, 0x3e

    .line 98
    .line 99
    goto/16 :goto_0

    .line 100
    .line 101
    :sswitch_2
    const-string v5, "mediaInformationJsonParserFrom"

    .line 102
    .line 103
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-nez v5, :cond_2

    .line 108
    .line 109
    goto/16 :goto_0

    .line 110
    .line 111
    :cond_2
    const/16 v19, 0x3d

    .line 112
    .line 113
    goto/16 :goto_0

    .line 114
    .line 115
    :sswitch_3
    const-string v5, "enableLogs"

    .line 116
    .line 117
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-nez v5, :cond_3

    .line 122
    .line 123
    goto/16 :goto_0

    .line 124
    .line 125
    :cond_3
    const/16 v19, 0x3c

    .line 126
    .line 127
    goto/16 :goto_0

    .line 128
    .line 129
    :sswitch_4
    const-string v5, "abstractSessionGetAllLogs"

    .line 130
    .line 131
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-nez v5, :cond_4

    .line 136
    .line 137
    goto/16 :goto_0

    .line 138
    .line 139
    :cond_4
    const/16 v19, 0x3b

    .line 140
    .line 141
    goto/16 :goto_0

    .line 142
    .line 143
    :sswitch_5
    const-string v5, "selectDocument"

    .line 144
    .line 145
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-nez v5, :cond_5

    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :cond_5
    const/16 v19, 0x3a

    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :sswitch_6
    const-string v5, "setFontDirectoryList"

    .line 158
    .line 159
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    if-nez v5, :cond_6

    .line 164
    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :cond_6
    const/16 v19, 0x39

    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :sswitch_7
    const-string v5, "mediaInformationJsonParserFromWithError"

    .line 172
    .line 173
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-nez v5, :cond_7

    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :cond_7
    const/16 v19, 0x38

    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :sswitch_8
    const-string v5, "getMediaInformationSessions"

    .line 186
    .line 187
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-nez v5, :cond_8

    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :cond_8
    const/16 v19, 0x37

    .line 196
    .line 197
    goto/16 :goto_0

    .line 198
    .line 199
    :sswitch_9
    const-string v5, "messagesInTransmit"

    .line 200
    .line 201
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    if-nez v5, :cond_9

    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :cond_9
    const/16 v19, 0x36

    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :sswitch_a
    const-string v5, "getExternalLibraries"

    .line 214
    .line 215
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-nez v5, :cond_a

    .line 220
    .line 221
    goto/16 :goto_0

    .line 222
    .line 223
    :cond_a
    const/16 v19, 0x35

    .line 224
    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :sswitch_b
    const-string v5, "setFontconfigConfigurationPath"

    .line 228
    .line 229
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-nez v5, :cond_b

    .line 234
    .line 235
    goto/16 :goto_0

    .line 236
    .line 237
    :cond_b
    const/16 v19, 0x34

    .line 238
    .line 239
    goto/16 :goto_0

    .line 240
    .line 241
    :sswitch_c
    const-string v5, "mediaInformationSessionExecute"

    .line 242
    .line 243
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    if-nez v5, :cond_c

    .line 248
    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :cond_c
    const/16 v19, 0x33

    .line 252
    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :sswitch_d
    const-string v5, "writeToPipe"

    .line 256
    .line 257
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-nez v5, :cond_d

    .line 262
    .line 263
    goto/16 :goto_0

    .line 264
    .line 265
    :cond_d
    const/16 v19, 0x32

    .line 266
    .line 267
    goto/16 :goto_0

    .line 268
    .line 269
    :sswitch_e
    const-string v5, "setSessionHistorySize"

    .line 270
    .line 271
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v5

    .line 275
    if-nez v5, :cond_e

    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :cond_e
    const/16 v19, 0x31

    .line 280
    .line 281
    goto/16 :goto_0

    .line 282
    .line 283
    :sswitch_f
    const-string v5, "disableLogs"

    .line 284
    .line 285
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    if-nez v5, :cond_f

    .line 290
    .line 291
    goto/16 :goto_0

    .line 292
    .line 293
    :cond_f
    const/16 v19, 0x30

    .line 294
    .line 295
    goto/16 :goto_0

    .line 296
    .line 297
    :sswitch_10
    const-string v5, "getLastCompletedSession"

    .line 298
    .line 299
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v5

    .line 303
    if-nez v5, :cond_10

    .line 304
    .line 305
    goto/16 :goto_0

    .line 306
    .line 307
    :cond_10
    const/16 v19, 0x2f

    .line 308
    .line 309
    goto/16 :goto_0

    .line 310
    .line 311
    :sswitch_11
    const-string v5, "setEnvironmentVariable"

    .line 312
    .line 313
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    if-nez v5, :cond_11

    .line 318
    .line 319
    goto/16 :goto_0

    .line 320
    .line 321
    :cond_11
    const/16 v19, 0x2e

    .line 322
    .line 323
    goto/16 :goto_0

    .line 324
    .line 325
    :sswitch_12
    const-string v5, "abstractSessionGetEndTime"

    .line 326
    .line 327
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v5

    .line 331
    if-nez v5, :cond_12

    .line 332
    .line 333
    goto/16 :goto_0

    .line 334
    .line 335
    :cond_12
    const/16 v19, 0x2d

    .line 336
    .line 337
    goto/16 :goto_0

    .line 338
    .line 339
    :sswitch_13
    const-string v5, "getLogRedirectionStrategy"

    .line 340
    .line 341
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    if-nez v5, :cond_13

    .line 346
    .line 347
    goto/16 :goto_0

    .line 348
    .line 349
    :cond_13
    const/16 v19, 0x2c

    .line 350
    .line 351
    goto/16 :goto_0

    .line 352
    .line 353
    :sswitch_14
    const-string v5, "abstractSessionGetLogs"

    .line 354
    .line 355
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v5

    .line 359
    if-nez v5, :cond_14

    .line 360
    .line 361
    goto/16 :goto_0

    .line 362
    .line 363
    :cond_14
    const/16 v19, 0x2b

    .line 364
    .line 365
    goto/16 :goto_0

    .line 366
    .line 367
    :sswitch_15
    const-string v5, "ffmpegSessionExecute"

    .line 368
    .line 369
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    if-nez v5, :cond_15

    .line 374
    .line 375
    goto/16 :goto_0

    .line 376
    .line 377
    :cond_15
    const/16 v19, 0x2a

    .line 378
    .line 379
    goto/16 :goto_0

    .line 380
    .line 381
    :sswitch_16
    const-string v5, "disableRedirection"

    .line 382
    .line 383
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v5

    .line 387
    if-nez v5, :cond_16

    .line 388
    .line 389
    goto/16 :goto_0

    .line 390
    .line 391
    :cond_16
    const/16 v19, 0x29

    .line 392
    .line 393
    goto/16 :goto_0

    .line 394
    .line 395
    :sswitch_17
    const-string v5, "ffprobeSession"

    .line 396
    .line 397
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v5

    .line 401
    if-nez v5, :cond_17

    .line 402
    .line 403
    goto/16 :goto_0

    .line 404
    .line 405
    :cond_17
    const/16 v19, 0x28

    .line 406
    .line 407
    goto/16 :goto_0

    .line 408
    .line 409
    :sswitch_18
    const-string v5, "registerNewFFmpegPipe"

    .line 410
    .line 411
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v5

    .line 415
    if-nez v5, :cond_18

    .line 416
    .line 417
    goto/16 :goto_0

    .line 418
    .line 419
    :cond_18
    const/16 v19, 0x27

    .line 420
    .line 421
    goto/16 :goto_0

    .line 422
    .line 423
    :sswitch_19
    const-string v5, "clearSessions"

    .line 424
    .line 425
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v5

    .line 429
    if-nez v5, :cond_19

    .line 430
    .line 431
    goto/16 :goto_0

    .line 432
    .line 433
    :cond_19
    const/16 v19, 0x26

    .line 434
    .line 435
    goto/16 :goto_0

    .line 436
    .line 437
    :sswitch_1a
    const-string v5, "getFFprobeSessions"

    .line 438
    .line 439
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    move-result v5

    .line 443
    if-nez v5, :cond_1a

    .line 444
    .line 445
    goto/16 :goto_0

    .line 446
    .line 447
    :cond_1a
    const/16 v19, 0x25

    .line 448
    .line 449
    goto/16 :goto_0

    .line 450
    .line 451
    :sswitch_1b
    const-string v5, "getPackageName"

    .line 452
    .line 453
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v5

    .line 457
    if-nez v5, :cond_1b

    .line 458
    .line 459
    goto/16 :goto_0

    .line 460
    .line 461
    :cond_1b
    const/16 v19, 0x24

    .line 462
    .line 463
    goto/16 :goto_0

    .line 464
    .line 465
    :sswitch_1c
    const-string v5, "closeFFmpegPipe"

    .line 466
    .line 467
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v5

    .line 471
    if-nez v5, :cond_1c

    .line 472
    .line 473
    goto/16 :goto_0

    .line 474
    .line 475
    :cond_1c
    const/16 v19, 0x23

    .line 476
    .line 477
    goto/16 :goto_0

    .line 478
    .line 479
    :sswitch_1d
    const-string v5, "asyncFFprobeSessionExecute"

    .line 480
    .line 481
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    move-result v5

    .line 485
    if-nez v5, :cond_1d

    .line 486
    .line 487
    goto/16 :goto_0

    .line 488
    .line 489
    :cond_1d
    const/16 v19, 0x22

    .line 490
    .line 491
    goto/16 :goto_0

    .line 492
    .line 493
    :sswitch_1e
    const-string v5, "abstractSessionGetFailStackTrace"

    .line 494
    .line 495
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result v5

    .line 499
    if-nez v5, :cond_1e

    .line 500
    .line 501
    goto/16 :goto_0

    .line 502
    .line 503
    :cond_1e
    const/16 v19, 0x21

    .line 504
    .line 505
    goto/16 :goto_0

    .line 506
    .line 507
    :sswitch_1f
    const-string v5, "ignoreSignal"

    .line 508
    .line 509
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    move-result v5

    .line 513
    if-nez v5, :cond_1f

    .line 514
    .line 515
    goto/16 :goto_0

    .line 516
    .line 517
    :cond_1f
    const/16 v19, 0x20

    .line 518
    .line 519
    goto/16 :goto_0

    .line 520
    .line 521
    :sswitch_20
    const-string v5, "thereAreAsynchronousMessagesInTransmit"

    .line 522
    .line 523
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result v5

    .line 527
    if-nez v5, :cond_20

    .line 528
    .line 529
    goto/16 :goto_0

    .line 530
    .line 531
    :cond_20
    const/16 v19, 0x1f

    .line 532
    .line 533
    goto/16 :goto_0

    .line 534
    .line 535
    :sswitch_21
    const-string v5, "getArch"

    .line 536
    .line 537
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result v5

    .line 541
    if-nez v5, :cond_21

    .line 542
    .line 543
    goto/16 :goto_0

    .line 544
    .line 545
    :cond_21
    const/16 v19, 0x1e

    .line 546
    .line 547
    goto/16 :goto_0

    .line 548
    .line 549
    :sswitch_22
    const-string v5, "getMediaInformation"

    .line 550
    .line 551
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result v5

    .line 555
    if-nez v5, :cond_22

    .line 556
    .line 557
    goto/16 :goto_0

    .line 558
    .line 559
    :cond_22
    const/16 v19, 0x1d

    .line 560
    .line 561
    goto/16 :goto_0

    .line 562
    .line 563
    :sswitch_23
    const-string v5, "getLogLevel"

    .line 564
    .line 565
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v5

    .line 569
    if-nez v5, :cond_23

    .line 570
    .line 571
    goto/16 :goto_0

    .line 572
    .line 573
    :cond_23
    const/16 v19, 0x1c

    .line 574
    .line 575
    goto/16 :goto_0

    .line 576
    .line 577
    :sswitch_24
    const-string v5, "getFFmpegSessions"

    .line 578
    .line 579
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v5

    .line 583
    if-nez v5, :cond_24

    .line 584
    .line 585
    goto/16 :goto_0

    .line 586
    .line 587
    :cond_24
    const/16 v19, 0x1b

    .line 588
    .line 589
    goto/16 :goto_0

    .line 590
    .line 591
    :sswitch_25
    const-string v5, "setLogLevel"

    .line 592
    .line 593
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result v5

    .line 597
    if-nez v5, :cond_25

    .line 598
    .line 599
    goto/16 :goto_0

    .line 600
    .line 601
    :cond_25
    const/16 v19, 0x1a

    .line 602
    .line 603
    goto/16 :goto_0

    .line 604
    .line 605
    :sswitch_26
    const-string v5, "enableStatistics"

    .line 606
    .line 607
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    move-result v5

    .line 611
    if-nez v5, :cond_26

    .line 612
    .line 613
    goto/16 :goto_0

    .line 614
    .line 615
    :cond_26
    const/16 v19, 0x19

    .line 616
    .line 617
    goto/16 :goto_0

    .line 618
    .line 619
    :sswitch_27
    const-string v5, "getPlatform"

    .line 620
    .line 621
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 622
    .line 623
    .line 624
    move-result v5

    .line 625
    if-nez v5, :cond_27

    .line 626
    .line 627
    goto/16 :goto_0

    .line 628
    .line 629
    :cond_27
    const/16 v19, 0x18

    .line 630
    .line 631
    goto/16 :goto_0

    .line 632
    .line 633
    :sswitch_28
    const-string v5, "abstractSessionGetAllLogsAsString"

    .line 634
    .line 635
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 636
    .line 637
    .line 638
    move-result v5

    .line 639
    if-nez v5, :cond_28

    .line 640
    .line 641
    goto/16 :goto_0

    .line 642
    .line 643
    :cond_28
    const/16 v19, 0x17

    .line 644
    .line 645
    goto/16 :goto_0

    .line 646
    .line 647
    :sswitch_29
    const-string v5, "getFFmpegVersion"

    .line 648
    .line 649
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    move-result v5

    .line 653
    if-nez v5, :cond_29

    .line 654
    .line 655
    goto/16 :goto_0

    .line 656
    .line 657
    :cond_29
    const/16 v19, 0x16

    .line 658
    .line 659
    goto/16 :goto_0

    .line 660
    .line 661
    :sswitch_2a
    const-string v5, "getSessions"

    .line 662
    .line 663
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    move-result v5

    .line 667
    if-nez v5, :cond_2a

    .line 668
    .line 669
    goto/16 :goto_0

    .line 670
    .line 671
    :cond_2a
    const/16 v19, 0x15

    .line 672
    .line 673
    goto/16 :goto_0

    .line 674
    .line 675
    :sswitch_2b
    const-string v5, "getSessionsByState"

    .line 676
    .line 677
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    move-result v5

    .line 681
    if-nez v5, :cond_2b

    .line 682
    .line 683
    goto/16 :goto_0

    .line 684
    .line 685
    :cond_2b
    const/16 v19, 0x14

    .line 686
    .line 687
    goto/16 :goto_0

    .line 688
    .line 689
    :sswitch_2c
    const-string v5, "cancelSession"

    .line 690
    .line 691
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    move-result v5

    .line 695
    if-nez v5, :cond_2c

    .line 696
    .line 697
    goto/16 :goto_0

    .line 698
    .line 699
    :cond_2c
    const/16 v19, 0x13

    .line 700
    .line 701
    goto/16 :goto_0

    .line 702
    .line 703
    :sswitch_2d
    const-string v5, "asyncMediaInformationSessionExecute"

    .line 704
    .line 705
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 706
    .line 707
    .line 708
    move-result v5

    .line 709
    if-nez v5, :cond_2d

    .line 710
    .line 711
    goto/16 :goto_0

    .line 712
    .line 713
    :cond_2d
    const/16 v19, 0x12

    .line 714
    .line 715
    goto/16 :goto_0

    .line 716
    .line 717
    :sswitch_2e
    const-string v5, "enableRedirection"

    .line 718
    .line 719
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 720
    .line 721
    .line 722
    move-result v5

    .line 723
    if-nez v5, :cond_2e

    .line 724
    .line 725
    goto/16 :goto_0

    .line 726
    .line 727
    :cond_2e
    const/16 v19, 0x11

    .line 728
    .line 729
    goto/16 :goto_0

    .line 730
    .line 731
    :sswitch_2f
    const-string v5, "getLastSession"

    .line 732
    .line 733
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 734
    .line 735
    .line 736
    move-result v5

    .line 737
    if-nez v5, :cond_2f

    .line 738
    .line 739
    goto/16 :goto_0

    .line 740
    .line 741
    :cond_2f
    const/16 v19, 0x10

    .line 742
    .line 743
    goto/16 :goto_0

    .line 744
    .line 745
    :sswitch_30
    const-string v5, "getSessionHistorySize"

    .line 746
    .line 747
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    move-result v5

    .line 751
    if-nez v5, :cond_30

    .line 752
    .line 753
    goto/16 :goto_0

    .line 754
    .line 755
    :cond_30
    const/16 v19, 0xf

    .line 756
    .line 757
    goto/16 :goto_0

    .line 758
    .line 759
    :sswitch_31
    const-string v5, "abstractSessionGetReturnCode"

    .line 760
    .line 761
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    move-result v5

    .line 765
    if-nez v5, :cond_31

    .line 766
    .line 767
    goto/16 :goto_0

    .line 768
    .line 769
    :cond_31
    const/16 v19, 0xe

    .line 770
    .line 771
    goto/16 :goto_0

    .line 772
    .line 773
    :sswitch_32
    const-string v5, "abstractSessionGetState"

    .line 774
    .line 775
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 776
    .line 777
    .line 778
    move-result v5

    .line 779
    if-nez v5, :cond_32

    .line 780
    .line 781
    goto/16 :goto_0

    .line 782
    .line 783
    :cond_32
    const/16 v19, 0xd

    .line 784
    .line 785
    goto/16 :goto_0

    .line 786
    .line 787
    :sswitch_33
    const-string v5, "ffmpegSessionGetStatistics"

    .line 788
    .line 789
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 790
    .line 791
    .line 792
    move-result v5

    .line 793
    if-nez v5, :cond_33

    .line 794
    .line 795
    goto/16 :goto_0

    .line 796
    .line 797
    :cond_33
    const/16 v19, 0xc

    .line 798
    .line 799
    goto/16 :goto_0

    .line 800
    .line 801
    :sswitch_34
    const-string v5, "disableStatistics"

    .line 802
    .line 803
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    move-result v5

    .line 807
    if-nez v5, :cond_34

    .line 808
    .line 809
    goto/16 :goto_0

    .line 810
    .line 811
    :cond_34
    const/16 v19, 0xb

    .line 812
    .line 813
    goto/16 :goto_0

    .line 814
    .line 815
    :sswitch_35
    const-string v5, "getSession"

    .line 816
    .line 817
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 818
    .line 819
    .line 820
    move-result v5

    .line 821
    if-nez v5, :cond_35

    .line 822
    .line 823
    goto/16 :goto_0

    .line 824
    .line 825
    :cond_35
    const/16 v19, 0xa

    .line 826
    .line 827
    goto/16 :goto_0

    .line 828
    .line 829
    :sswitch_36
    const-string v5, "cancel"

    .line 830
    .line 831
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 832
    .line 833
    .line 834
    move-result v5

    .line 835
    if-nez v5, :cond_36

    .line 836
    .line 837
    goto/16 :goto_0

    .line 838
    .line 839
    :cond_36
    const/16 v19, 0x9

    .line 840
    .line 841
    goto/16 :goto_0

    .line 842
    .line 843
    :sswitch_37
    const-string v5, "ffmpegSessionGetAllStatistics"

    .line 844
    .line 845
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 846
    .line 847
    .line 848
    move-result v5

    .line 849
    if-nez v5, :cond_37

    .line 850
    .line 851
    goto/16 :goto_0

    .line 852
    .line 853
    :cond_37
    const/16 v19, 0x8

    .line 854
    .line 855
    goto/16 :goto_0

    .line 856
    .line 857
    :sswitch_38
    const-string v5, "getBuildDate"

    .line 858
    .line 859
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    move-result v5

    .line 863
    if-nez v5, :cond_38

    .line 864
    .line 865
    goto/16 :goto_0

    .line 866
    .line 867
    :cond_38
    const/16 v19, 0x7

    .line 868
    .line 869
    goto :goto_0

    .line 870
    :sswitch_39
    const-string v5, "asyncFFmpegSessionExecute"

    .line 871
    .line 872
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 873
    .line 874
    .line 875
    move-result v5

    .line 876
    if-nez v5, :cond_39

    .line 877
    .line 878
    goto :goto_0

    .line 879
    :cond_39
    move/from16 v19, v7

    .line 880
    .line 881
    goto :goto_0

    .line 882
    :sswitch_3a
    const-string v5, "abstractSessionGetDuration"

    .line 883
    .line 884
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 885
    .line 886
    .line 887
    move-result v5

    .line 888
    if-nez v5, :cond_3a

    .line 889
    .line 890
    goto :goto_0

    .line 891
    :cond_3a
    const/16 v19, 0x5

    .line 892
    .line 893
    goto :goto_0

    .line 894
    :sswitch_3b
    const-string v5, "setFontDirectory"

    .line 895
    .line 896
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 897
    .line 898
    .line 899
    move-result v5

    .line 900
    if-nez v5, :cond_3b

    .line 901
    .line 902
    goto :goto_0

    .line 903
    :cond_3b
    const/16 v19, 0x4

    .line 904
    .line 905
    goto :goto_0

    .line 906
    :sswitch_3c
    const-string v5, "isLTSBuild"

    .line 907
    .line 908
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 909
    .line 910
    .line 911
    move-result v5

    .line 912
    if-nez v5, :cond_3c

    .line 913
    .line 914
    goto :goto_0

    .line 915
    :cond_3c
    move/from16 v19, v6

    .line 916
    .line 917
    goto :goto_0

    .line 918
    :sswitch_3d
    const-string v5, "mediaInformationSession"

    .line 919
    .line 920
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 921
    .line 922
    .line 923
    move-result v5

    .line 924
    if-nez v5, :cond_3d

    .line 925
    .line 926
    goto :goto_0

    .line 927
    :cond_3d
    move/from16 v19, v14

    .line 928
    .line 929
    goto :goto_0

    .line 930
    :sswitch_3e
    const-string v5, "ffmpegSession"

    .line 931
    .line 932
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 933
    .line 934
    .line 935
    move-result v5

    .line 936
    if-nez v5, :cond_3e

    .line 937
    .line 938
    goto :goto_0

    .line 939
    :cond_3e
    move/from16 v19, v4

    .line 940
    .line 941
    goto :goto_0

    .line 942
    :sswitch_3f
    const-string v5, "getSafParameter"

    .line 943
    .line 944
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 945
    .line 946
    .line 947
    move-result v5

    .line 948
    if-nez v5, :cond_3f

    .line 949
    .line 950
    goto :goto_0

    .line 951
    :cond_3f
    move/from16 v19, v15

    .line 952
    .line 953
    :goto_0
    packed-switch v19, :pswitch_data_0

    .line 954
    .line 955
    .line 956
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 957
    .line 958
    iget-object v0, v0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 959
    .line 960
    check-cast v0, Landroid/os/Handler;

    .line 961
    .line 962
    new-instance v3, LCg/b;

    .line 963
    .line 964
    check-cast v2, Ltc/g;

    .line 965
    .line 966
    invoke-direct {v3, v2, v7}, LCg/b;-><init>(Ltc/g;I)V

    .line 967
    .line 968
    .line 969
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 970
    .line 971
    .line 972
    return-void

    .line 973
    :pswitch_0
    if-eqz v8, :cond_42

    .line 974
    .line 975
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 976
    .line 977
    .line 978
    move-result-wide v3

    .line 979
    invoke-static {v3, v4}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 980
    .line 981
    .line 982
    move-result-object v0

    .line 983
    iget-object v5, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 984
    .line 985
    if-nez v0, :cond_40

    .line 986
    .line 987
    const-string v0, "SESSION_NOT_FOUND"

    .line 988
    .line 989
    const-string v3, "Session not found."

    .line 990
    .line 991
    invoke-virtual {v5, v0, v3, v2}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 992
    .line 993
    .line 994
    return-void

    .line 995
    :cond_40
    invoke-interface {v0}, Lr4/h;->b()Z

    .line 996
    .line 997
    .line 998
    move-result v3

    .line 999
    if-eqz v3, :cond_41

    .line 1000
    .line 1001
    move-object v7, v2

    .line 1002
    new-instance v2, Lpb/a;

    .line 1003
    .line 1004
    move-object v4, v0

    .line 1005
    check-cast v4, Lr4/d;

    .line 1006
    .line 1007
    move-object v6, v7

    .line 1008
    check-cast v6, Ltc/g;

    .line 1009
    .line 1010
    const/4 v3, 0x4

    .line 1011
    const/4 v7, 0x0

    .line 1012
    invoke-direct/range {v2 .. v7}, Lpb/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 1013
    .line 1014
    .line 1015
    iget-object v0, v1, Ls4/b;->c:Ljava/util/concurrent/ExecutorService;

    .line 1016
    .line 1017
    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 1018
    .line 1019
    .line 1020
    return-void

    .line 1021
    :cond_41
    move-object v7, v2

    .line 1022
    const-string v0, "NOT_FFPROBE_SESSION"

    .line 1023
    .line 1024
    const-string v2, "A session is found but it does not have the correct type."

    .line 1025
    .line 1026
    invoke-virtual {v5, v0, v2, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1027
    .line 1028
    .line 1029
    return-void

    .line 1030
    :cond_42
    move-object v7, v2

    .line 1031
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1032
    .line 1033
    const-string v2, "INVALID_SESSION"

    .line 1034
    .line 1035
    const-string v3, "Invalid session id."

    .line 1036
    .line 1037
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1038
    .line 1039
    .line 1040
    return-void

    .line 1041
    :pswitch_1
    move-object v7, v2

    .line 1042
    const-string v2, "strategy"

    .line 1043
    .line 1044
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    check-cast v0, Ljava/lang/Integer;

    .line 1049
    .line 1050
    if-eqz v0, :cond_47

    .line 1051
    .line 1052
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1053
    .line 1054
    .line 1055
    move-result v0

    .line 1056
    if-eqz v0, :cond_45

    .line 1057
    .line 1058
    if-eq v0, v4, :cond_46

    .line 1059
    .line 1060
    if-eq v0, v14, :cond_44

    .line 1061
    .line 1062
    if-eq v0, v6, :cond_43

    .line 1063
    .line 1064
    const/4 v14, 0x5

    .line 1065
    goto :goto_1

    .line 1066
    :cond_43
    const/4 v14, 0x4

    .line 1067
    goto :goto_1

    .line 1068
    :cond_44
    move v14, v6

    .line 1069
    goto :goto_1

    .line 1070
    :cond_45
    move v14, v4

    .line 1071
    :cond_46
    :goto_1
    sput v14, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->o:I

    .line 1072
    .line 1073
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1074
    .line 1075
    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 1076
    .line 1077
    .line 1078
    return-void

    .line 1079
    :cond_47
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1080
    .line 1081
    const-string v2, "INVALID_LOG_REDIRECTION_STRATEGY"

    .line 1082
    .line 1083
    const-string v3, "Invalid log redirection strategy value."

    .line 1084
    .line 1085
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1086
    .line 1087
    .line 1088
    return-void

    .line 1089
    :pswitch_2
    move-object v7, v2

    .line 1090
    if-eqz v11, :cond_48

    .line 1091
    .line 1092
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1093
    .line 1094
    :try_start_0
    invoke-static {v11}, Lcom/moloco/sdk/internal/publisher/H;->U(Ljava/lang/String;)Lcom/google/android/gms/ads/nativead/l;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v0

    .line 1098
    invoke-static {v0}, Ls4/b;->m(Lcom/google/android/gms/ads/nativead/l;)Ljava/util/HashMap;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v0

    .line 1102
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1103
    .line 1104
    .line 1105
    goto/16 :goto_18

    .line 1106
    .line 1107
    :catch_0
    move-exception v0

    .line 1108
    const-string v4, "ffmpeg-kit-flutter"

    .line 1109
    .line 1110
    const-string v5, "Parsing MediaInformation failed."

    .line 1111
    .line 1112
    invoke-static {v4, v5, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v2, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 1116
    .line 1117
    .line 1118
    goto/16 :goto_18

    .line 1119
    .line 1120
    :cond_48
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1121
    .line 1122
    const-string v2, "INVALID_FFPROBE_JSON_OUTPUT"

    .line 1123
    .line 1124
    const-string v3, "Invalid ffprobe json output."

    .line 1125
    .line 1126
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1127
    .line 1128
    .line 1129
    return-void

    .line 1130
    :pswitch_3
    move-object v7, v2

    .line 1131
    invoke-virtual {v1}, Ls4/b;->c()V

    .line 1132
    .line 1133
    .line 1134
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1135
    .line 1136
    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 1137
    .line 1138
    .line 1139
    return-void

    .line 1140
    :pswitch_4
    move-object v7, v2

    .line 1141
    if-eqz v8, :cond_4c

    .line 1142
    .line 1143
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 1144
    .line 1145
    .line 1146
    move-result-wide v2

    .line 1147
    invoke-static {v2, v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1152
    .line 1153
    if-nez v0, :cond_49

    .line 1154
    .line 1155
    const-string v0, "SESSION_NOT_FOUND"

    .line 1156
    .line 1157
    const-string v3, "Session not found."

    .line 1158
    .line 1159
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1160
    .line 1161
    .line 1162
    return-void

    .line 1163
    :cond_49
    invoke-static {v9}, Ls4/b;->k(Ljava/lang/Integer;)Z

    .line 1164
    .line 1165
    .line 1166
    move-result v3

    .line 1167
    if-eqz v3, :cond_4a

    .line 1168
    .line 1169
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 1170
    .line 1171
    .line 1172
    move-result v18

    .line 1173
    :cond_4a
    move/from16 v3, v18

    .line 1174
    .line 1175
    check-cast v0, Lr4/a;

    .line 1176
    .line 1177
    invoke-virtual {v0, v3}, Lr4/a;->e(I)Ljava/util/LinkedList;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v0

    .line 1181
    new-instance v3, Ljava/util/ArrayList;

    .line 1182
    .line 1183
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1184
    .line 1185
    .line 1186
    :goto_2
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 1187
    .line 1188
    .line 1189
    move-result v5

    .line 1190
    if-ge v15, v5, :cond_4b

    .line 1191
    .line 1192
    invoke-virtual {v0, v15}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v5

    .line 1196
    check-cast v5, Lr4/e;

    .line 1197
    .line 1198
    invoke-static {v5}, Ls4/b;->o(Lr4/e;)Ljava/util/HashMap;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v5

    .line 1202
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1203
    .line 1204
    .line 1205
    add-int/2addr v15, v4

    .line 1206
    goto :goto_2

    .line 1207
    :cond_4b
    invoke-virtual {v2, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 1208
    .line 1209
    .line 1210
    return-void

    .line 1211
    :cond_4c
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1212
    .line 1213
    const-string v2, "INVALID_SESSION"

    .line 1214
    .line 1215
    const-string v3, "Invalid session id."

    .line 1216
    .line 1217
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1218
    .line 1219
    .line 1220
    return-void

    .line 1221
    :pswitch_5
    move-object v7, v2

    .line 1222
    const-string v2, "title"

    .line 1223
    .line 1224
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v2

    .line 1228
    check-cast v2, Ljava/lang/String;

    .line 1229
    .line 1230
    const-string v5, "type"

    .line 1231
    .line 1232
    invoke-virtual {v0, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v5

    .line 1236
    check-cast v5, Ljava/lang/String;

    .line 1237
    .line 1238
    const-string v8, "extraTypes"

    .line 1239
    .line 1240
    invoke-virtual {v0, v8}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v0

    .line 1244
    check-cast v0, Ljava/util/List;

    .line 1245
    .line 1246
    if-eqz v0, :cond_4d

    .line 1247
    .line 1248
    new-array v8, v15, [Ljava/lang/String;

    .line 1249
    .line 1250
    invoke-interface {v0, v8}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v0

    .line 1254
    check-cast v0, [Ljava/lang/String;

    .line 1255
    .line 1256
    move-object v8, v0

    .line 1257
    goto :goto_3

    .line 1258
    :cond_4d
    move-object v8, v3

    .line 1259
    :goto_3
    if-eqz v12, :cond_58

    .line 1260
    .line 1261
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1262
    .line 1263
    .line 1264
    move-result v0

    .line 1265
    if-eqz v0, :cond_4e

    .line 1266
    .line 1267
    new-instance v0, Landroid/content/Intent;

    .line 1268
    .line 1269
    const-string v4, "android.intent.action.CREATE_DOCUMENT"

    .line 1270
    .line 1271
    invoke-direct {v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v0, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1275
    .line 1276
    .line 1277
    goto :goto_4

    .line 1278
    :cond_4e
    new-instance v0, Landroid/content/Intent;

    .line 1279
    .line 1280
    const-string v6, "android.intent.action.GET_CONTENT"

    .line 1281
    .line 1282
    invoke-direct {v0, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1283
    .line 1284
    .line 1285
    const-string v6, "android.intent.category.OPENABLE"

    .line 1286
    .line 1287
    invoke-virtual {v0, v6}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 1288
    .line 1289
    .line 1290
    invoke-virtual {v0, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1291
    .line 1292
    .line 1293
    :goto_4
    if-eqz v5, :cond_4f

    .line 1294
    .line 1295
    invoke-virtual {v0, v5}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1296
    .line 1297
    .line 1298
    goto :goto_5

    .line 1299
    :cond_4f
    const-string v4, "*/*"

    .line 1300
    .line 1301
    invoke-virtual {v0, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1302
    .line 1303
    .line 1304
    :goto_5
    if-eqz v2, :cond_50

    .line 1305
    .line 1306
    const-string v4, "android.intent.extra.TITLE"

    .line 1307
    .line 1308
    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1309
    .line 1310
    .line 1311
    :cond_50
    if-eqz v8, :cond_51

    .line 1312
    .line 1313
    const-string v4, "android.intent.extra.MIME_TYPES"

    .line 1314
    .line 1315
    invoke-virtual {v0, v4, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 1316
    .line 1317
    .line 1318
    :cond_51
    iget-object v4, v1, Ls4/b;->g:Landroid/content/Context;

    .line 1319
    .line 1320
    const-string v6, "Cannot selectDocument using parameters writable: "

    .line 1321
    .line 1322
    iget-object v9, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1323
    .line 1324
    const-string v10, " and extra types: "

    .line 1325
    .line 1326
    const-string v11, ", title: "

    .line 1327
    .line 1328
    const-string v13, ", type: "

    .line 1329
    .line 1330
    const-string v14, "ffmpeg-kit-flutter"

    .line 1331
    .line 1332
    if-eqz v4, :cond_56

    .line 1333
    .line 1334
    iget-object v4, v1, Ls4/b;->h:Landroid/app/Activity;

    .line 1335
    .line 1336
    if-eqz v4, :cond_54

    .line 1337
    .line 1338
    :try_start_1
    move-object v6, v7

    .line 1339
    check-cast v6, Ltc/g;

    .line 1340
    .line 1341
    iput-object v6, v1, Ls4/b;->f:Ltc/g;

    .line 1342
    .line 1343
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1344
    .line 1345
    .line 1346
    move-result v6

    .line 1347
    if-eqz v6, :cond_52

    .line 1348
    .line 1349
    const/16 v6, 0x4e20

    .line 1350
    .line 1351
    goto :goto_6

    .line 1352
    :cond_52
    const/16 v6, 0x2710

    .line 1353
    .line 1354
    :goto_6
    invoke-virtual {v4, v0, v6}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 1355
    .line 1356
    .line 1357
    goto/16 :goto_18

    .line 1358
    .line 1359
    :catch_1
    move-exception v0

    .line 1360
    if-nez v8, :cond_53

    .line 1361
    .line 1362
    goto :goto_7

    .line 1363
    :cond_53
    invoke-static {v8}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v3

    .line 1367
    :goto_7
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1368
    .line 1369
    const-string v6, "Failed to selectDocument using parameters writable: "

    .line 1370
    .line 1371
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1372
    .line 1373
    .line 1374
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1375
    .line 1376
    .line 1377
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1378
    .line 1379
    .line 1380
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1381
    .line 1382
    .line 1383
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1384
    .line 1385
    .line 1386
    const-string v5, "!"

    .line 1387
    .line 1388
    invoke-static {v4, v2, v10, v3, v5}, Lka/n;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v2

    .line 1392
    invoke-static {v14, v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1393
    .line 1394
    .line 1395
    const-string v2, "SELECT_FAILED"

    .line 1396
    .line 1397
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0

    .line 1401
    invoke-virtual {v9, v2, v0, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1402
    .line 1403
    .line 1404
    goto/16 :goto_18

    .line 1405
    .line 1406
    :cond_54
    if-nez v8, :cond_55

    .line 1407
    .line 1408
    goto :goto_8

    .line 1409
    :cond_55
    invoke-static {v8}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v3

    .line 1413
    :goto_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1414
    .line 1415
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1416
    .line 1417
    .line 1418
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1419
    .line 1420
    .line 1421
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1422
    .line 1423
    .line 1424
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1425
    .line 1426
    .line 1427
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1428
    .line 1429
    .line 1430
    const-string v4, ". Activity is null."

    .line 1431
    .line 1432
    invoke-static {v0, v2, v10, v3, v4}, Lka/n;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v0

    .line 1436
    invoke-static {v14, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1437
    .line 1438
    .line 1439
    const-string v0, "INVALID_ACTIVITY"

    .line 1440
    .line 1441
    const-string v2, "Activity is null."

    .line 1442
    .line 1443
    invoke-virtual {v9, v0, v2, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1444
    .line 1445
    .line 1446
    goto/16 :goto_18

    .line 1447
    .line 1448
    :cond_56
    if-nez v8, :cond_57

    .line 1449
    .line 1450
    goto :goto_9

    .line 1451
    :cond_57
    invoke-static {v8}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v3

    .line 1455
    :goto_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1456
    .line 1457
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1458
    .line 1459
    .line 1460
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1461
    .line 1462
    .line 1463
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1467
    .line 1468
    .line 1469
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1470
    .line 1471
    .line 1472
    const-string v4, ". Context is null."

    .line 1473
    .line 1474
    invoke-static {v0, v2, v10, v3, v4}, Lka/n;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v0

    .line 1478
    invoke-static {v14, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1479
    .line 1480
    .line 1481
    const-string v0, "INVALID_CONTEXT"

    .line 1482
    .line 1483
    const-string v2, "Context is null."

    .line 1484
    .line 1485
    invoke-virtual {v9, v0, v2, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1486
    .line 1487
    .line 1488
    goto/16 :goto_18

    .line 1489
    .line 1490
    :cond_58
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1491
    .line 1492
    const-string v2, "INVALID_WRITABLE"

    .line 1493
    .line 1494
    const-string v3, "Invalid writable value."

    .line 1495
    .line 1496
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1497
    .line 1498
    .line 1499
    return-void

    .line 1500
    :pswitch_6
    move-object v7, v2

    .line 1501
    const-string v2, "fontDirectoryList"

    .line 1502
    .line 1503
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v2

    .line 1507
    check-cast v2, Ljava/util/List;

    .line 1508
    .line 1509
    const-string v4, "fontNameMap"

    .line 1510
    .line 1511
    invoke-virtual {v0, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v0

    .line 1515
    check-cast v0, Ljava/util/Map;

    .line 1516
    .line 1517
    if-eqz v2, :cond_5a

    .line 1518
    .line 1519
    iget-object v4, v1, Ls4/b;->g:Landroid/content/Context;

    .line 1520
    .line 1521
    iget-object v5, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1522
    .line 1523
    if-eqz v4, :cond_59

    .line 1524
    .line 1525
    invoke-static {v4, v2, v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->n(Landroid/content/Context;Ljava/util/List;Ljava/util/Map;)V

    .line 1526
    .line 1527
    .line 1528
    invoke-virtual {v5, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 1529
    .line 1530
    .line 1531
    return-void

    .line 1532
    :cond_59
    const-string v0, "ffmpeg-kit-flutter"

    .line 1533
    .line 1534
    const-string v2, "Cannot setFontDirectoryList. Context is null."

    .line 1535
    .line 1536
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1537
    .line 1538
    .line 1539
    const-string v0, "INVALID_CONTEXT"

    .line 1540
    .line 1541
    const-string v2, "Context is null."

    .line 1542
    .line 1543
    invoke-virtual {v5, v0, v2, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1544
    .line 1545
    .line 1546
    return-void

    .line 1547
    :cond_5a
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1548
    .line 1549
    const-string v2, "INVALID_FONT_DIRECTORY_LIST"

    .line 1550
    .line 1551
    const-string v3, "Invalid font directory list."

    .line 1552
    .line 1553
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1554
    .line 1555
    .line 1556
    return-void

    .line 1557
    :pswitch_7
    move-object v7, v2

    .line 1558
    if-eqz v11, :cond_5b

    .line 1559
    .line 1560
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1561
    .line 1562
    :try_start_2
    invoke-static {v11}, Lcom/moloco/sdk/internal/publisher/H;->U(Ljava/lang/String;)Lcom/google/android/gms/ads/nativead/l;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v0

    .line 1566
    invoke-static {v0}, Ls4/b;->m(Lcom/google/android/gms/ads/nativead/l;)Ljava/util/HashMap;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v0

    .line 1570
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1571
    .line 1572
    .line 1573
    goto/16 :goto_18

    .line 1574
    .line 1575
    :catch_2
    move-exception v0

    .line 1576
    const-string v3, "ffmpeg-kit-flutter"

    .line 1577
    .line 1578
    const-string v4, "Parsing MediaInformation failed."

    .line 1579
    .line 1580
    invoke-static {v3, v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1581
    .line 1582
    .line 1583
    const-string v0, "PARSE_FAILED"

    .line 1584
    .line 1585
    const-string v3, "Parsing MediaInformation failed with JSON error."

    .line 1586
    .line 1587
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1588
    .line 1589
    .line 1590
    goto/16 :goto_18

    .line 1591
    .line 1592
    :cond_5b
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1593
    .line 1594
    const-string v2, "INVALID_FFPROBE_JSON_OUTPUT"

    .line 1595
    .line 1596
    const-string v3, "Invalid ffprobe json output."

    .line 1597
    .line 1598
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1599
    .line 1600
    .line 1601
    return-void

    .line 1602
    :pswitch_8
    move-object v7, v2

    .line 1603
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1604
    .line 1605
    sget-object v2, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1606
    .line 1607
    new-instance v2, Ljava/util/LinkedList;

    .line 1608
    .line 1609
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 1610
    .line 1611
    .line 1612
    sget-object v3, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f:Ljava/lang/Object;

    .line 1613
    .line 1614
    monitor-enter v3

    .line 1615
    :try_start_3
    sget-object v4, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e:Ljava/util/LinkedList;

    .line 1616
    .line 1617
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v4

    .line 1621
    :cond_5c
    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1622
    .line 1623
    .line 1624
    move-result v5

    .line 1625
    if-eqz v5, :cond_5d

    .line 1626
    .line 1627
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v5

    .line 1631
    check-cast v5, Lr4/h;

    .line 1632
    .line 1633
    invoke-interface {v5}, Lr4/h;->c()Z

    .line 1634
    .line 1635
    .line 1636
    move-result v6

    .line 1637
    if-eqz v6, :cond_5c

    .line 1638
    .line 1639
    check-cast v5, Lr4/f;

    .line 1640
    .line 1641
    invoke-virtual {v2, v5}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 1642
    .line 1643
    .line 1644
    goto :goto_a

    .line 1645
    :catchall_0
    move-exception v0

    .line 1646
    goto :goto_b

    .line 1647
    :cond_5d
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1648
    invoke-static {v2}, Ls4/b;->r(Ljava/util/LinkedList;)Ljava/util/ArrayList;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v2

    .line 1652
    invoke-virtual {v0, v7, v2}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 1653
    .line 1654
    .line 1655
    return-void

    .line 1656
    :goto_b
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1657
    throw v0

    .line 1658
    :pswitch_9
    move-object v7, v2

    .line 1659
    if-eqz v8, :cond_5e

    .line 1660
    .line 1661
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 1662
    .line 1663
    .line 1664
    move-result-wide v2

    .line 1665
    invoke-static {v2, v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->messagesInTransmit(J)I

    .line 1666
    .line 1667
    .line 1668
    move-result v0

    .line 1669
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v0

    .line 1673
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1674
    .line 1675
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 1676
    .line 1677
    .line 1678
    return-void

    .line 1679
    :cond_5e
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1680
    .line 1681
    const-string v2, "INVALID_SESSION"

    .line 1682
    .line 1683
    const-string v3, "Invalid session id."

    .line 1684
    .line 1685
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1686
    .line 1687
    .line 1688
    return-void

    .line 1689
    :pswitch_a
    move-object v7, v2

    .line 1690
    invoke-static {}, Lr4/g;->a()Ljava/util/ArrayList;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v0

    .line 1694
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1695
    .line 1696
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 1697
    .line 1698
    .line 1699
    return-void

    .line 1700
    :pswitch_b
    move-object v7, v2

    .line 1701
    const-string v2, "path"

    .line 1702
    .line 1703
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v0

    .line 1707
    check-cast v0, Ljava/lang/String;

    .line 1708
    .line 1709
    if-eqz v0, :cond_5f

    .line 1710
    .line 1711
    invoke-static {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->o(Ljava/lang/String;)V

    .line 1712
    .line 1713
    .line 1714
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1715
    .line 1716
    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 1717
    .line 1718
    .line 1719
    return-void

    .line 1720
    :cond_5f
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1721
    .line 1722
    const-string v2, "INVALID_PATH"

    .line 1723
    .line 1724
    const-string v3, "Invalid path."

    .line 1725
    .line 1726
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1727
    .line 1728
    .line 1729
    return-void

    .line 1730
    :pswitch_c
    move-object v7, v2

    .line 1731
    if-eqz v8, :cond_63

    .line 1732
    .line 1733
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 1734
    .line 1735
    .line 1736
    move-result-wide v2

    .line 1737
    invoke-static {v2, v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v0

    .line 1741
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1742
    .line 1743
    if-nez v0, :cond_60

    .line 1744
    .line 1745
    const-string v0, "SESSION_NOT_FOUND"

    .line 1746
    .line 1747
    const-string v3, "Session not found."

    .line 1748
    .line 1749
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1750
    .line 1751
    .line 1752
    return-void

    .line 1753
    :cond_60
    invoke-interface {v0}, Lr4/h;->c()Z

    .line 1754
    .line 1755
    .line 1756
    move-result v3

    .line 1757
    if-eqz v3, :cond_62

    .line 1758
    .line 1759
    invoke-static {v9}, Ls4/b;->k(Ljava/lang/Integer;)Z

    .line 1760
    .line 1761
    .line 1762
    move-result v3

    .line 1763
    if-eqz v3, :cond_61

    .line 1764
    .line 1765
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 1766
    .line 1767
    .line 1768
    move-result v18

    .line 1769
    :cond_61
    move/from16 v3, v18

    .line 1770
    .line 1771
    new-instance v4, LA7/g1;

    .line 1772
    .line 1773
    check-cast v0, Lr4/f;

    .line 1774
    .line 1775
    move-object v5, v7

    .line 1776
    check-cast v5, Ltc/g;

    .line 1777
    .line 1778
    invoke-direct {v4, v0, v3, v2, v5}, LA7/g1;-><init>(Lr4/f;ILcom/google/android/gms/ads/nativead/l;Ltc/g;)V

    .line 1779
    .line 1780
    .line 1781
    iget-object v0, v1, Ls4/b;->c:Ljava/util/concurrent/ExecutorService;

    .line 1782
    .line 1783
    invoke-interface {v0, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 1784
    .line 1785
    .line 1786
    return-void

    .line 1787
    :cond_62
    const-string v0, "NOT_MEDIA_INFORMATION_SESSION"

    .line 1788
    .line 1789
    const-string v3, "A session is found but it does not have the correct type."

    .line 1790
    .line 1791
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1792
    .line 1793
    .line 1794
    return-void

    .line 1795
    :cond_63
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1796
    .line 1797
    const-string v2, "INVALID_SESSION"

    .line 1798
    .line 1799
    const-string v3, "Invalid session id."

    .line 1800
    .line 1801
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1802
    .line 1803
    .line 1804
    return-void

    .line 1805
    :pswitch_d
    move-object v7, v2

    .line 1806
    const-string v2, "input"

    .line 1807
    .line 1808
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v2

    .line 1812
    check-cast v2, Ljava/lang/String;

    .line 1813
    .line 1814
    const-string v3, "pipe"

    .line 1815
    .line 1816
    invoke-virtual {v0, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v0

    .line 1820
    check-cast v0, Ljava/lang/String;

    .line 1821
    .line 1822
    if-eqz v2, :cond_64

    .line 1823
    .line 1824
    if-eqz v0, :cond_64

    .line 1825
    .line 1826
    new-instance v3, LA7/W0;

    .line 1827
    .line 1828
    iget-object v4, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1829
    .line 1830
    move-object v5, v7

    .line 1831
    check-cast v5, Ltc/g;

    .line 1832
    .line 1833
    invoke-direct {v3, v2, v0, v4, v5}, LA7/W0;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/nativead/l;Ltc/g;)V

    .line 1834
    .line 1835
    .line 1836
    iget-object v0, v1, Ls4/b;->c:Ljava/util/concurrent/ExecutorService;

    .line 1837
    .line 1838
    invoke-interface {v0, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 1839
    .line 1840
    .line 1841
    return-void

    .line 1842
    :cond_64
    if-eqz v0, :cond_65

    .line 1843
    .line 1844
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1845
    .line 1846
    const-string v2, "INVALID_INPUT"

    .line 1847
    .line 1848
    const-string v3, "Invalid input value."

    .line 1849
    .line 1850
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1851
    .line 1852
    .line 1853
    return-void

    .line 1854
    :cond_65
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1855
    .line 1856
    const-string v2, "INVALID_PIPE"

    .line 1857
    .line 1858
    const-string v3, "Invalid pipe value."

    .line 1859
    .line 1860
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1861
    .line 1862
    .line 1863
    return-void

    .line 1864
    :pswitch_e
    move-object v7, v2

    .line 1865
    const-string v2, "sessionHistorySize"

    .line 1866
    .line 1867
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v0

    .line 1871
    check-cast v0, Ljava/lang/Integer;

    .line 1872
    .line 1873
    if-eqz v0, :cond_68

    .line 1874
    .line 1875
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1876
    .line 1877
    .line 1878
    move-result v0

    .line 1879
    sget-object v2, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1880
    .line 1881
    const/16 v2, 0x3e8

    .line 1882
    .line 1883
    if-ge v0, v2, :cond_67

    .line 1884
    .line 1885
    if-lez v0, :cond_66

    .line 1886
    .line 1887
    sput v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->c:I

    .line 1888
    .line 1889
    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->b()V

    .line 1890
    .line 1891
    .line 1892
    :cond_66
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1893
    .line 1894
    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 1895
    .line 1896
    .line 1897
    return-void

    .line 1898
    :cond_67
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1899
    .line 1900
    const-string v2, "Session history size must not exceed the hard limit!"

    .line 1901
    .line 1902
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1903
    .line 1904
    .line 1905
    throw v0

    .line 1906
    :cond_68
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1907
    .line 1908
    const-string v2, "INVALID_SIZE"

    .line 1909
    .line 1910
    const-string v3, "Invalid session history size value."

    .line 1911
    .line 1912
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1913
    .line 1914
    .line 1915
    return-void

    .line 1916
    :pswitch_f
    move-object v7, v2

    .line 1917
    iget-object v0, v1, Ls4/b;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1918
    .line 1919
    invoke-virtual {v0, v4, v15}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1920
    .line 1921
    .line 1922
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1923
    .line 1924
    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 1925
    .line 1926
    .line 1927
    return-void

    .line 1928
    :pswitch_10
    move-object v7, v2

    .line 1929
    move-object v0, v7

    .line 1930
    check-cast v0, Ltc/g;

    .line 1931
    .line 1932
    invoke-virtual {v1, v0}, Ls4/b;->g(Ltc/g;)V

    .line 1933
    .line 1934
    .line 1935
    return-void

    .line 1936
    :pswitch_11
    move-object v7, v2

    .line 1937
    const-string v2, "variableName"

    .line 1938
    .line 1939
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v2

    .line 1943
    check-cast v2, Ljava/lang/String;

    .line 1944
    .line 1945
    const-string v4, "variableValue"

    .line 1946
    .line 1947
    invoke-virtual {v0, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1948
    .line 1949
    .line 1950
    move-result-object v0

    .line 1951
    check-cast v0, Ljava/lang/String;

    .line 1952
    .line 1953
    if-eqz v2, :cond_69

    .line 1954
    .line 1955
    if-eqz v0, :cond_69

    .line 1956
    .line 1957
    invoke-static {v2, v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 1958
    .line 1959
    .line 1960
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1961
    .line 1962
    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 1963
    .line 1964
    .line 1965
    return-void

    .line 1966
    :cond_69
    if-eqz v0, :cond_6a

    .line 1967
    .line 1968
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1969
    .line 1970
    const-string v2, "INVALID_NAME"

    .line 1971
    .line 1972
    const-string v3, "Invalid environment variable name."

    .line 1973
    .line 1974
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1975
    .line 1976
    .line 1977
    return-void

    .line 1978
    :cond_6a
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 1979
    .line 1980
    const-string v2, "INVALID_VALUE"

    .line 1981
    .line 1982
    const-string v3, "Invalid environment variable value."

    .line 1983
    .line 1984
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 1985
    .line 1986
    .line 1987
    return-void

    .line 1988
    :pswitch_12
    move-object v7, v2

    .line 1989
    if-eqz v8, :cond_6d

    .line 1990
    .line 1991
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 1992
    .line 1993
    .line 1994
    move-result-wide v4

    .line 1995
    invoke-static {v4, v5}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 1996
    .line 1997
    .line 1998
    move-result-object v0

    .line 1999
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2000
    .line 2001
    if-nez v0, :cond_6b

    .line 2002
    .line 2003
    const-string v0, "SESSION_NOT_FOUND"

    .line 2004
    .line 2005
    const-string v3, "Session not found."

    .line 2006
    .line 2007
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2008
    .line 2009
    .line 2010
    return-void

    .line 2011
    :cond_6b
    check-cast v0, Lr4/a;

    .line 2012
    .line 2013
    iget-object v0, v0, Lr4/a;->d:Ljava/util/Date;

    .line 2014
    .line 2015
    if-nez v0, :cond_6c

    .line 2016
    .line 2017
    invoke-virtual {v2, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2018
    .line 2019
    .line 2020
    return-void

    .line 2021
    :cond_6c
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 2022
    .line 2023
    .line 2024
    move-result-wide v3

    .line 2025
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v0

    .line 2029
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2030
    .line 2031
    .line 2032
    return-void

    .line 2033
    :cond_6d
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2034
    .line 2035
    const-string v2, "INVALID_SESSION"

    .line 2036
    .line 2037
    const-string v3, "Invalid session id."

    .line 2038
    .line 2039
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2040
    .line 2041
    .line 2042
    return-void

    .line 2043
    :pswitch_13
    move-object v7, v2

    .line 2044
    sget v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->o:I

    .line 2045
    .line 2046
    invoke-static {v0}, LA/f;->f(I)I

    .line 2047
    .line 2048
    .line 2049
    move-result v0

    .line 2050
    if-eqz v0, :cond_71

    .line 2051
    .line 2052
    if-eq v0, v4, :cond_70

    .line 2053
    .line 2054
    if-eq v0, v14, :cond_6f

    .line 2055
    .line 2056
    if-eq v0, v6, :cond_6e

    .line 2057
    .line 2058
    const/4 v15, 0x4

    .line 2059
    goto :goto_c

    .line 2060
    :cond_6e
    move v15, v6

    .line 2061
    goto :goto_c

    .line 2062
    :cond_6f
    move v15, v14

    .line 2063
    goto :goto_c

    .line 2064
    :cond_70
    move v15, v4

    .line 2065
    :cond_71
    :goto_c
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v0

    .line 2069
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2070
    .line 2071
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2072
    .line 2073
    .line 2074
    return-void

    .line 2075
    :pswitch_14
    move-object v7, v2

    .line 2076
    if-eqz v8, :cond_74

    .line 2077
    .line 2078
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 2079
    .line 2080
    .line 2081
    move-result-wide v2

    .line 2082
    invoke-static {v2, v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 2083
    .line 2084
    .line 2085
    move-result-object v0

    .line 2086
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2087
    .line 2088
    if-nez v0, :cond_72

    .line 2089
    .line 2090
    const-string v0, "SESSION_NOT_FOUND"

    .line 2091
    .line 2092
    const-string v3, "Session not found."

    .line 2093
    .line 2094
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2095
    .line 2096
    .line 2097
    return-void

    .line 2098
    :cond_72
    check-cast v0, Lr4/a;

    .line 2099
    .line 2100
    invoke-virtual {v0}, Lr4/a;->f()Ljava/util/LinkedList;

    .line 2101
    .line 2102
    .line 2103
    move-result-object v0

    .line 2104
    new-instance v3, Ljava/util/ArrayList;

    .line 2105
    .line 2106
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2107
    .line 2108
    .line 2109
    :goto_d
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 2110
    .line 2111
    .line 2112
    move-result v5

    .line 2113
    if-ge v15, v5, :cond_73

    .line 2114
    .line 2115
    invoke-virtual {v0, v15}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 2116
    .line 2117
    .line 2118
    move-result-object v5

    .line 2119
    check-cast v5, Lr4/e;

    .line 2120
    .line 2121
    invoke-static {v5}, Ls4/b;->o(Lr4/e;)Ljava/util/HashMap;

    .line 2122
    .line 2123
    .line 2124
    move-result-object v5

    .line 2125
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2126
    .line 2127
    .line 2128
    add-int/2addr v15, v4

    .line 2129
    goto :goto_d

    .line 2130
    :cond_73
    invoke-virtual {v2, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2131
    .line 2132
    .line 2133
    return-void

    .line 2134
    :cond_74
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2135
    .line 2136
    const-string v2, "INVALID_SESSION"

    .line 2137
    .line 2138
    const-string v3, "Invalid session id."

    .line 2139
    .line 2140
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2141
    .line 2142
    .line 2143
    return-void

    .line 2144
    :pswitch_15
    move-object v7, v2

    .line 2145
    if-eqz v8, :cond_77

    .line 2146
    .line 2147
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 2148
    .line 2149
    .line 2150
    move-result-wide v2

    .line 2151
    invoke-static {v2, v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 2152
    .line 2153
    .line 2154
    move-result-object v0

    .line 2155
    iget-object v5, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2156
    .line 2157
    if-nez v0, :cond_75

    .line 2158
    .line 2159
    const-string v0, "SESSION_NOT_FOUND"

    .line 2160
    .line 2161
    const-string v2, "Session not found."

    .line 2162
    .line 2163
    invoke-virtual {v5, v0, v2, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2164
    .line 2165
    .line 2166
    return-void

    .line 2167
    :cond_75
    invoke-interface {v0}, Lr4/h;->a()Z

    .line 2168
    .line 2169
    .line 2170
    move-result v2

    .line 2171
    if-eqz v2, :cond_76

    .line 2172
    .line 2173
    new-instance v2, Lpb/a;

    .line 2174
    .line 2175
    move-object v4, v0

    .line 2176
    check-cast v4, Lr4/c;

    .line 2177
    .line 2178
    move-object v6, v7

    .line 2179
    check-cast v6, Ltc/g;

    .line 2180
    .line 2181
    const/4 v3, 0x3

    .line 2182
    const/4 v7, 0x0

    .line 2183
    invoke-direct/range {v2 .. v7}, Lpb/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 2184
    .line 2185
    .line 2186
    iget-object v0, v1, Ls4/b;->c:Ljava/util/concurrent/ExecutorService;

    .line 2187
    .line 2188
    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 2189
    .line 2190
    .line 2191
    return-void

    .line 2192
    :cond_76
    const-string v0, "NOT_FFMPEG_SESSION"

    .line 2193
    .line 2194
    const-string v2, "A session is found but it does not have the correct type."

    .line 2195
    .line 2196
    invoke-virtual {v5, v0, v2, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2197
    .line 2198
    .line 2199
    return-void

    .line 2200
    :cond_77
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2201
    .line 2202
    const-string v2, "INVALID_SESSION"

    .line 2203
    .line 2204
    const-string v3, "Invalid session id."

    .line 2205
    .line 2206
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2207
    .line 2208
    .line 2209
    return-void

    .line 2210
    :pswitch_16
    move-object v7, v2

    .line 2211
    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->c()V

    .line 2212
    .line 2213
    .line 2214
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2215
    .line 2216
    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2217
    .line 2218
    .line 2219
    return-void

    .line 2220
    :pswitch_17
    move-object v7, v2

    .line 2221
    if-eqz v10, :cond_78

    .line 2222
    .line 2223
    new-array v0, v15, [Ljava/lang/String;

    .line 2224
    .line 2225
    invoke-interface {v10, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v0

    .line 2229
    check-cast v0, [Ljava/lang/String;

    .line 2230
    .line 2231
    new-instance v2, Lr4/d;

    .line 2232
    .line 2233
    invoke-direct {v2, v0}, Lr4/a;-><init>([Ljava/lang/String;)V

    .line 2234
    .line 2235
    .line 2236
    invoke-static {v2}, Ls4/b;->p(Lr4/h;)Ljava/util/HashMap;

    .line 2237
    .line 2238
    .line 2239
    move-result-object v0

    .line 2240
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2241
    .line 2242
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2243
    .line 2244
    .line 2245
    return-void

    .line 2246
    :cond_78
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2247
    .line 2248
    const-string v2, "INVALID_ARGUMENTS"

    .line 2249
    .line 2250
    const-string v3, "Invalid arguments array."

    .line 2251
    .line 2252
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2253
    .line 2254
    .line 2255
    return-void

    .line 2256
    :pswitch_18
    move-object v7, v2

    .line 2257
    iget-object v0, v1, Ls4/b;->g:Landroid/content/Context;

    .line 2258
    .line 2259
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2260
    .line 2261
    if-eqz v0, :cond_79

    .line 2262
    .line 2263
    invoke-static {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->l(Landroid/content/Context;)Ljava/lang/String;

    .line 2264
    .line 2265
    .line 2266
    move-result-object v0

    .line 2267
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2268
    .line 2269
    .line 2270
    return-void

    .line 2271
    :cond_79
    const-string v0, "ffmpeg-kit-flutter"

    .line 2272
    .line 2273
    const-string v3, "Cannot registerNewFFmpegPipe. Context is null."

    .line 2274
    .line 2275
    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 2276
    .line 2277
    .line 2278
    const-string v0, "INVALID_CONTEXT"

    .line 2279
    .line 2280
    const-string v3, "Context is null."

    .line 2281
    .line 2282
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2283
    .line 2284
    .line 2285
    return-void

    .line 2286
    :pswitch_19
    move-object v7, v2

    .line 2287
    move-object v0, v7

    .line 2288
    check-cast v0, Ltc/g;

    .line 2289
    .line 2290
    invoke-virtual {v1, v0}, Ls4/b;->a(Ltc/g;)V

    .line 2291
    .line 2292
    .line 2293
    return-void

    .line 2294
    :pswitch_1a
    move-object v7, v2

    .line 2295
    move-object v0, v7

    .line 2296
    check-cast v0, Ltc/g;

    .line 2297
    .line 2298
    invoke-virtual {v1, v0}, Ls4/b;->f(Ltc/g;)V

    .line 2299
    .line 2300
    .line 2301
    return-void

    .line 2302
    :pswitch_1b
    move-object v7, v2

    .line 2303
    invoke-static {}, Lr4/g;->b()Ljava/lang/String;

    .line 2304
    .line 2305
    .line 2306
    move-result-object v0

    .line 2307
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2308
    .line 2309
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2310
    .line 2311
    .line 2312
    return-void

    .line 2313
    :pswitch_1c
    move-object v7, v2

    .line 2314
    const-string v2, "ffmpegPipePath"

    .line 2315
    .line 2316
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 2317
    .line 2318
    .line 2319
    move-result-object v0

    .line 2320
    check-cast v0, Ljava/lang/String;

    .line 2321
    .line 2322
    if-eqz v0, :cond_7b

    .line 2323
    .line 2324
    sget-object v2, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2325
    .line 2326
    new-instance v2, Ljava/io/File;

    .line 2327
    .line 2328
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2329
    .line 2330
    .line 2331
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 2332
    .line 2333
    .line 2334
    move-result v0

    .line 2335
    if-eqz v0, :cond_7a

    .line 2336
    .line 2337
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 2338
    .line 2339
    .line 2340
    :cond_7a
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2341
    .line 2342
    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2343
    .line 2344
    .line 2345
    return-void

    .line 2346
    :cond_7b
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2347
    .line 2348
    const-string v2, "INVALID_PIPE_PATH"

    .line 2349
    .line 2350
    const-string v3, "Invalid ffmpeg pipe path."

    .line 2351
    .line 2352
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2353
    .line 2354
    .line 2355
    return-void

    .line 2356
    :pswitch_1d
    move-object v7, v2

    .line 2357
    if-eqz v8, :cond_7e

    .line 2358
    .line 2359
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 2360
    .line 2361
    .line 2362
    move-result-wide v4

    .line 2363
    invoke-static {v4, v5}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 2364
    .line 2365
    .line 2366
    move-result-object v0

    .line 2367
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2368
    .line 2369
    if-nez v0, :cond_7c

    .line 2370
    .line 2371
    const-string v0, "SESSION_NOT_FOUND"

    .line 2372
    .line 2373
    const-string v3, "Session not found."

    .line 2374
    .line 2375
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2376
    .line 2377
    .line 2378
    return-void

    .line 2379
    :cond_7c
    invoke-interface {v0}, Lr4/h;->b()Z

    .line 2380
    .line 2381
    .line 2382
    move-result v4

    .line 2383
    if-eqz v4, :cond_7d

    .line 2384
    .line 2385
    check-cast v0, Lr4/d;

    .line 2386
    .line 2387
    new-instance v4, Lg5/d;

    .line 2388
    .line 2389
    const/16 v5, 0x17

    .line 2390
    .line 2391
    invoke-direct {v4, v0, v5}, Lg5/d;-><init>(Ljava/lang/Object;I)V

    .line 2392
    .line 2393
    .line 2394
    sget-object v5, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->g:Ljava/util/concurrent/ExecutorService;

    .line 2395
    .line 2396
    invoke-interface {v5, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 2397
    .line 2398
    .line 2399
    move-result-object v4

    .line 2400
    iput-object v4, v0, Lr4/a;->h:Ljava/util/concurrent/Future;

    .line 2401
    .line 2402
    invoke-virtual {v2, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2403
    .line 2404
    .line 2405
    return-void

    .line 2406
    :cond_7d
    const-string v0, "NOT_FFPROBE_SESSION"

    .line 2407
    .line 2408
    const-string v3, "A session is found but it does not have the correct type."

    .line 2409
    .line 2410
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2411
    .line 2412
    .line 2413
    return-void

    .line 2414
    :cond_7e
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2415
    .line 2416
    const-string v2, "INVALID_SESSION"

    .line 2417
    .line 2418
    const-string v3, "Invalid session id."

    .line 2419
    .line 2420
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2421
    .line 2422
    .line 2423
    return-void

    .line 2424
    :pswitch_1e
    move-object v7, v2

    .line 2425
    if-eqz v8, :cond_80

    .line 2426
    .line 2427
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 2428
    .line 2429
    .line 2430
    move-result-wide v2

    .line 2431
    invoke-static {v2, v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 2432
    .line 2433
    .line 2434
    move-result-object v0

    .line 2435
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2436
    .line 2437
    if-nez v0, :cond_7f

    .line 2438
    .line 2439
    const-string v0, "SESSION_NOT_FOUND"

    .line 2440
    .line 2441
    const-string v3, "Session not found."

    .line 2442
    .line 2443
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2444
    .line 2445
    .line 2446
    return-void

    .line 2447
    :cond_7f
    check-cast v0, Lr4/a;

    .line 2448
    .line 2449
    iget-object v0, v0, Lr4/a;->k:Ljava/lang/String;

    .line 2450
    .line 2451
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2452
    .line 2453
    .line 2454
    return-void

    .line 2455
    :cond_80
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2456
    .line 2457
    const-string v2, "INVALID_SESSION"

    .line 2458
    .line 2459
    const-string v3, "Invalid session id."

    .line 2460
    .line 2461
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2462
    .line 2463
    .line 2464
    return-void

    .line 2465
    :pswitch_1f
    move-object v7, v2

    .line 2466
    const-string v2, "signal"

    .line 2467
    .line 2468
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 2469
    .line 2470
    .line 2471
    move-result-object v0

    .line 2472
    check-cast v0, Ljava/lang/Integer;

    .line 2473
    .line 2474
    if-eqz v0, :cond_87

    .line 2475
    .line 2476
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2477
    .line 2478
    .line 2479
    move-result v2

    .line 2480
    if-nez v2, :cond_81

    .line 2481
    .line 2482
    move v14, v4

    .line 2483
    goto :goto_e

    .line 2484
    :cond_81
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2485
    .line 2486
    .line 2487
    move-result v2

    .line 2488
    if-ne v2, v4, :cond_82

    .line 2489
    .line 2490
    goto :goto_e

    .line 2491
    :cond_82
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2492
    .line 2493
    .line 2494
    move-result v2

    .line 2495
    if-ne v2, v14, :cond_83

    .line 2496
    .line 2497
    move v14, v6

    .line 2498
    goto :goto_e

    .line 2499
    :cond_83
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2500
    .line 2501
    .line 2502
    move-result v2

    .line 2503
    if-ne v2, v6, :cond_84

    .line 2504
    .line 2505
    const/4 v14, 0x4

    .line 2506
    goto :goto_e

    .line 2507
    :cond_84
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2508
    .line 2509
    .line 2510
    move-result v0

    .line 2511
    const/4 v2, 0x4

    .line 2512
    if-ne v0, v2, :cond_85

    .line 2513
    .line 2514
    const/4 v14, 0x5

    .line 2515
    goto :goto_e

    .line 2516
    :cond_85
    move v14, v15

    .line 2517
    :goto_e
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2518
    .line 2519
    if-eqz v14, :cond_86

    .line 2520
    .line 2521
    invoke-static {v14}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->k(I)V

    .line 2522
    .line 2523
    .line 2524
    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2525
    .line 2526
    .line 2527
    return-void

    .line 2528
    :cond_86
    const-string v2, "INVALID_SIGNAL"

    .line 2529
    .line 2530
    const-string v3, "Signal value not supported."

    .line 2531
    .line 2532
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2533
    .line 2534
    .line 2535
    return-void

    .line 2536
    :cond_87
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2537
    .line 2538
    const-string v2, "INVALID_SIGNAL"

    .line 2539
    .line 2540
    const-string v3, "Invalid signal value."

    .line 2541
    .line 2542
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2543
    .line 2544
    .line 2545
    return-void

    .line 2546
    :pswitch_20
    move-object v7, v2

    .line 2547
    if-eqz v8, :cond_89

    .line 2548
    .line 2549
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 2550
    .line 2551
    .line 2552
    move-result-wide v2

    .line 2553
    invoke-static {v2, v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 2554
    .line 2555
    .line 2556
    move-result-object v0

    .line 2557
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2558
    .line 2559
    if-nez v0, :cond_88

    .line 2560
    .line 2561
    const-string v0, "SESSION_NOT_FOUND"

    .line 2562
    .line 2563
    const-string v3, "Session not found."

    .line 2564
    .line 2565
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2566
    .line 2567
    .line 2568
    return-void

    .line 2569
    :cond_88
    check-cast v0, Lr4/a;

    .line 2570
    .line 2571
    invoke-virtual {v0}, Lr4/a;->h()Z

    .line 2572
    .line 2573
    .line 2574
    move-result v0

    .line 2575
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2576
    .line 2577
    .line 2578
    move-result-object v0

    .line 2579
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2580
    .line 2581
    .line 2582
    return-void

    .line 2583
    :cond_89
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2584
    .line 2585
    const-string v2, "INVALID_SESSION"

    .line 2586
    .line 2587
    const-string v3, "Invalid session id."

    .line 2588
    .line 2589
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2590
    .line 2591
    .line 2592
    return-void

    .line 2593
    :pswitch_21
    move-object v7, v2

    .line 2594
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2595
    .line 2596
    sget-boolean v2, Lcom/arthenica/ffmpegkit/AbiDetect;->a:Z

    .line 2597
    .line 2598
    if-eqz v2, :cond_8a

    .line 2599
    .line 2600
    const-string v2, "arm-v7a-neon"

    .line 2601
    .line 2602
    goto :goto_f

    .line 2603
    :cond_8a
    invoke-static {}, Lcom/arthenica/ffmpegkit/AbiDetect;->getNativeAbi()Ljava/lang/String;

    .line 2604
    .line 2605
    .line 2606
    move-result-object v2

    .line 2607
    :goto_f
    invoke-virtual {v0, v7, v2}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2608
    .line 2609
    .line 2610
    return-void

    .line 2611
    :pswitch_22
    move-object v7, v2

    .line 2612
    if-eqz v8, :cond_8d

    .line 2613
    .line 2614
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 2615
    .line 2616
    .line 2617
    move-result-wide v2

    .line 2618
    invoke-static {v2, v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 2619
    .line 2620
    .line 2621
    move-result-object v0

    .line 2622
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2623
    .line 2624
    if-nez v0, :cond_8b

    .line 2625
    .line 2626
    const-string v0, "SESSION_NOT_FOUND"

    .line 2627
    .line 2628
    const-string v3, "Session not found."

    .line 2629
    .line 2630
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2631
    .line 2632
    .line 2633
    return-void

    .line 2634
    :cond_8b
    invoke-interface {v0}, Lr4/h;->c()Z

    .line 2635
    .line 2636
    .line 2637
    move-result v3

    .line 2638
    if-eqz v3, :cond_8c

    .line 2639
    .line 2640
    check-cast v0, Lr4/f;

    .line 2641
    .line 2642
    iget-object v0, v0, Lr4/f;->n:Lcom/google/android/gms/ads/nativead/l;

    .line 2643
    .line 2644
    invoke-static {v0}, Ls4/b;->m(Lcom/google/android/gms/ads/nativead/l;)Ljava/util/HashMap;

    .line 2645
    .line 2646
    .line 2647
    move-result-object v0

    .line 2648
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2649
    .line 2650
    .line 2651
    return-void

    .line 2652
    :cond_8c
    const-string v0, "NOT_MEDIA_INFORMATION_SESSION"

    .line 2653
    .line 2654
    const-string v3, "A session is found but it does not have the correct type."

    .line 2655
    .line 2656
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2657
    .line 2658
    .line 2659
    return-void

    .line 2660
    :cond_8d
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2661
    .line 2662
    const-string v2, "INVALID_SESSION"

    .line 2663
    .line 2664
    const-string v3, "Invalid session id."

    .line 2665
    .line 2666
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2667
    .line 2668
    .line 2669
    return-void

    .line 2670
    :pswitch_23
    move-object v7, v2

    .line 2671
    sget v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->b:I

    .line 2672
    .line 2673
    if-nez v0, :cond_8e

    .line 2674
    .line 2675
    const/16 v3, 0x38

    .line 2676
    .line 2677
    goto :goto_10

    .line 2678
    :cond_8e
    invoke-static {v0}, Lpd/f;->i(I)I

    .line 2679
    .line 2680
    .line 2681
    move-result v3

    .line 2682
    :goto_10
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2683
    .line 2684
    .line 2685
    move-result-object v0

    .line 2686
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2687
    .line 2688
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2689
    .line 2690
    .line 2691
    return-void

    .line 2692
    :pswitch_24
    move-object v7, v2

    .line 2693
    move-object v0, v7

    .line 2694
    check-cast v0, Ltc/g;

    .line 2695
    .line 2696
    invoke-virtual {v1, v0}, Ls4/b;->e(Ltc/g;)V

    .line 2697
    .line 2698
    .line 2699
    return-void

    .line 2700
    :pswitch_25
    move-object v7, v2

    .line 2701
    const-string v2, "level"

    .line 2702
    .line 2703
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 2704
    .line 2705
    .line 2706
    move-result-object v0

    .line 2707
    check-cast v0, Ljava/lang/Integer;

    .line 2708
    .line 2709
    if-eqz v0, :cond_8f

    .line 2710
    .line 2711
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2712
    .line 2713
    .line 2714
    move-result v0

    .line 2715
    invoke-static {v0}, Lpd/f;->c(I)I

    .line 2716
    .line 2717
    .line 2718
    move-result v0

    .line 2719
    invoke-static {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->p(I)V

    .line 2720
    .line 2721
    .line 2722
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2723
    .line 2724
    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2725
    .line 2726
    .line 2727
    return-void

    .line 2728
    :cond_8f
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2729
    .line 2730
    const-string v2, "INVALID_LEVEL"

    .line 2731
    .line 2732
    const-string v3, "Invalid level value."

    .line 2733
    .line 2734
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2735
    .line 2736
    .line 2737
    return-void

    .line 2738
    :pswitch_26
    move-object v7, v2

    .line 2739
    invoke-virtual {v1}, Ls4/b;->d()V

    .line 2740
    .line 2741
    .line 2742
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2743
    .line 2744
    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2745
    .line 2746
    .line 2747
    return-void

    .line 2748
    :pswitch_27
    move-object v7, v2

    .line 2749
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2750
    .line 2751
    const-string v2, "android"

    .line 2752
    .line 2753
    invoke-virtual {v0, v7, v2}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2754
    .line 2755
    .line 2756
    return-void

    .line 2757
    :pswitch_28
    move-object v7, v2

    .line 2758
    if-eqz v8, :cond_93

    .line 2759
    .line 2760
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 2761
    .line 2762
    .line 2763
    move-result-wide v2

    .line 2764
    invoke-static {v2, v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 2765
    .line 2766
    .line 2767
    move-result-object v0

    .line 2768
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2769
    .line 2770
    if-nez v0, :cond_90

    .line 2771
    .line 2772
    const-string v0, "SESSION_NOT_FOUND"

    .line 2773
    .line 2774
    const-string v3, "Session not found."

    .line 2775
    .line 2776
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2777
    .line 2778
    .line 2779
    return-void

    .line 2780
    :cond_90
    invoke-static {v9}, Ls4/b;->k(Ljava/lang/Integer;)Z

    .line 2781
    .line 2782
    .line 2783
    move-result v3

    .line 2784
    if-eqz v3, :cond_91

    .line 2785
    .line 2786
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 2787
    .line 2788
    .line 2789
    move-result v18

    .line 2790
    :cond_91
    move/from16 v3, v18

    .line 2791
    .line 2792
    check-cast v0, Lr4/a;

    .line 2793
    .line 2794
    invoke-virtual {v0, v3}, Lr4/a;->i(I)V

    .line 2795
    .line 2796
    .line 2797
    invoke-virtual {v0}, Lr4/a;->h()Z

    .line 2798
    .line 2799
    .line 2800
    move-result v3

    .line 2801
    if-eqz v3, :cond_92

    .line 2802
    .line 2803
    iget-wide v5, v0, Lr4/a;->a:J

    .line 2804
    .line 2805
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2806
    .line 2807
    .line 2808
    move-result-object v3

    .line 2809
    new-array v4, v4, [Ljava/lang/Object;

    .line 2810
    .line 2811
    aput-object v3, v4, v15

    .line 2812
    .line 2813
    const-string v3, "getAllLogsAsString was called to return all logs but there are still logs being transmitted for session id %d."

    .line 2814
    .line 2815
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2816
    .line 2817
    .line 2818
    move-result-object v3

    .line 2819
    const-string v4, "ffmpeg-kit"

    .line 2820
    .line 2821
    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2822
    .line 2823
    .line 2824
    :cond_92
    invoke-virtual {v0}, Lr4/a;->g()Ljava/lang/String;

    .line 2825
    .line 2826
    .line 2827
    move-result-object v0

    .line 2828
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2829
    .line 2830
    .line 2831
    return-void

    .line 2832
    :cond_93
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2833
    .line 2834
    const-string v2, "INVALID_SESSION"

    .line 2835
    .line 2836
    const-string v3, "Invalid session id."

    .line 2837
    .line 2838
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2839
    .line 2840
    .line 2841
    return-void

    .line 2842
    :pswitch_29
    move-object v7, v2

    .line 2843
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2844
    .line 2845
    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->h()Ljava/lang/String;

    .line 2846
    .line 2847
    .line 2848
    move-result-object v2

    .line 2849
    invoke-virtual {v0, v7, v2}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2850
    .line 2851
    .line 2852
    return-void

    .line 2853
    :pswitch_2a
    move-object v7, v2

    .line 2854
    move-object v0, v7

    .line 2855
    check-cast v0, Ltc/g;

    .line 2856
    .line 2857
    invoke-virtual {v1, v0}, Ls4/b;->i(Ltc/g;)V

    .line 2858
    .line 2859
    .line 2860
    return-void

    .line 2861
    :pswitch_2b
    move-object v7, v2

    .line 2862
    const-string v2, "state"

    .line 2863
    .line 2864
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 2865
    .line 2866
    .line 2867
    move-result-object v0

    .line 2868
    check-cast v0, Ljava/lang/Integer;

    .line 2869
    .line 2870
    if-eqz v0, :cond_94

    .line 2871
    .line 2872
    move-object v2, v7

    .line 2873
    check-cast v2, Ltc/g;

    .line 2874
    .line 2875
    invoke-virtual {v1, v0, v2}, Ls4/b;->j(Ljava/lang/Integer;Ltc/g;)V

    .line 2876
    .line 2877
    .line 2878
    return-void

    .line 2879
    :cond_94
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2880
    .line 2881
    const-string v2, "INVALID_SESSION_STATE"

    .line 2882
    .line 2883
    const-string v3, "Invalid session state value."

    .line 2884
    .line 2885
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2886
    .line 2887
    .line 2888
    return-void

    .line 2889
    :pswitch_2c
    move-object v7, v2

    .line 2890
    if-eqz v8, :cond_95

    .line 2891
    .line 2892
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 2893
    .line 2894
    .line 2895
    move-result-wide v4

    .line 2896
    invoke-static {v4, v5}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->nativeFFmpegCancel(J)V

    .line 2897
    .line 2898
    .line 2899
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2900
    .line 2901
    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2902
    .line 2903
    .line 2904
    return-void

    .line 2905
    :cond_95
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2906
    .line 2907
    const-string v2, "INVALID_SESSION"

    .line 2908
    .line 2909
    const-string v3, "Invalid session id."

    .line 2910
    .line 2911
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2912
    .line 2913
    .line 2914
    return-void

    .line 2915
    :pswitch_2d
    move-object v7, v2

    .line 2916
    if-eqz v8, :cond_99

    .line 2917
    .line 2918
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 2919
    .line 2920
    .line 2921
    move-result-wide v4

    .line 2922
    invoke-static {v4, v5}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 2923
    .line 2924
    .line 2925
    move-result-object v0

    .line 2926
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2927
    .line 2928
    if-nez v0, :cond_96

    .line 2929
    .line 2930
    const-string v0, "SESSION_NOT_FOUND"

    .line 2931
    .line 2932
    const-string v3, "Session not found."

    .line 2933
    .line 2934
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2935
    .line 2936
    .line 2937
    return-void

    .line 2938
    :cond_96
    invoke-interface {v0}, Lr4/h;->c()Z

    .line 2939
    .line 2940
    .line 2941
    move-result v4

    .line 2942
    if-eqz v4, :cond_98

    .line 2943
    .line 2944
    invoke-static {v9}, Ls4/b;->k(Ljava/lang/Integer;)Z

    .line 2945
    .line 2946
    .line 2947
    move-result v4

    .line 2948
    if-eqz v4, :cond_97

    .line 2949
    .line 2950
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 2951
    .line 2952
    .line 2953
    move-result v18

    .line 2954
    :cond_97
    check-cast v0, Lr4/f;

    .line 2955
    .line 2956
    new-instance v4, LL7/b;

    .line 2957
    .line 2958
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2959
    .line 2960
    .line 2961
    move-result-object v5

    .line 2962
    const/16 v6, 0x19

    .line 2963
    .line 2964
    invoke-direct {v4, v6, v0, v5}, LL7/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 2965
    .line 2966
    .line 2967
    sget-object v5, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->g:Ljava/util/concurrent/ExecutorService;

    .line 2968
    .line 2969
    invoke-interface {v5, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 2970
    .line 2971
    .line 2972
    move-result-object v4

    .line 2973
    iput-object v4, v0, Lr4/a;->h:Ljava/util/concurrent/Future;

    .line 2974
    .line 2975
    invoke-virtual {v2, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 2976
    .line 2977
    .line 2978
    return-void

    .line 2979
    :cond_98
    const-string v0, "NOT_MEDIA_INFORMATION_SESSION"

    .line 2980
    .line 2981
    const-string v3, "A session is found but it does not have the correct type."

    .line 2982
    .line 2983
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2984
    .line 2985
    .line 2986
    return-void

    .line 2987
    :cond_99
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 2988
    .line 2989
    const-string v2, "INVALID_SESSION"

    .line 2990
    .line 2991
    const-string v3, "Invalid session id."

    .line 2992
    .line 2993
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 2994
    .line 2995
    .line 2996
    return-void

    .line 2997
    :pswitch_2e
    move-object v7, v2

    .line 2998
    invoke-virtual {v1}, Ls4/b;->c()V

    .line 2999
    .line 3000
    .line 3001
    invoke-virtual {v1}, Ls4/b;->d()V

    .line 3002
    .line 3003
    .line 3004
    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->d()V

    .line 3005
    .line 3006
    .line 3007
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3008
    .line 3009
    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3010
    .line 3011
    .line 3012
    return-void

    .line 3013
    :pswitch_2f
    move-object v7, v2

    .line 3014
    move-object v0, v7

    .line 3015
    check-cast v0, Ltc/g;

    .line 3016
    .line 3017
    invoke-virtual {v1, v0}, Ls4/b;->h(Ltc/g;)V

    .line 3018
    .line 3019
    .line 3020
    return-void

    .line 3021
    :pswitch_30
    move-object v7, v2

    .line 3022
    sget v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->c:I

    .line 3023
    .line 3024
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3025
    .line 3026
    .line 3027
    move-result-object v0

    .line 3028
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3029
    .line 3030
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3031
    .line 3032
    .line 3033
    return-void

    .line 3034
    :pswitch_31
    move-object v7, v2

    .line 3035
    if-eqz v8, :cond_9c

    .line 3036
    .line 3037
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 3038
    .line 3039
    .line 3040
    move-result-wide v4

    .line 3041
    invoke-static {v4, v5}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 3042
    .line 3043
    .line 3044
    move-result-object v0

    .line 3045
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3046
    .line 3047
    if-nez v0, :cond_9a

    .line 3048
    .line 3049
    const-string v0, "SESSION_NOT_FOUND"

    .line 3050
    .line 3051
    const-string v3, "Session not found."

    .line 3052
    .line 3053
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3054
    .line 3055
    .line 3056
    return-void

    .line 3057
    :cond_9a
    check-cast v0, Lr4/a;

    .line 3058
    .line 3059
    iget-object v0, v0, Lr4/a;->j:LR1/i;

    .line 3060
    .line 3061
    if-nez v0, :cond_9b

    .line 3062
    .line 3063
    invoke-virtual {v2, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3064
    .line 3065
    .line 3066
    return-void

    .line 3067
    :cond_9b
    iget v0, v0, LR1/i;->b:I

    .line 3068
    .line 3069
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3070
    .line 3071
    .line 3072
    move-result-object v0

    .line 3073
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3074
    .line 3075
    .line 3076
    return-void

    .line 3077
    :cond_9c
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3078
    .line 3079
    const-string v2, "INVALID_SESSION"

    .line 3080
    .line 3081
    const-string v3, "Invalid session id."

    .line 3082
    .line 3083
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3084
    .line 3085
    .line 3086
    return-void

    .line 3087
    :pswitch_32
    move-object v7, v2

    .line 3088
    if-eqz v8, :cond_9e

    .line 3089
    .line 3090
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 3091
    .line 3092
    .line 3093
    move-result-wide v2

    .line 3094
    invoke-static {v2, v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 3095
    .line 3096
    .line 3097
    move-result-object v0

    .line 3098
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3099
    .line 3100
    if-nez v0, :cond_9d

    .line 3101
    .line 3102
    const-string v0, "SESSION_NOT_FOUND"

    .line 3103
    .line 3104
    const-string v3, "Session not found."

    .line 3105
    .line 3106
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3107
    .line 3108
    .line 3109
    return-void

    .line 3110
    :cond_9d
    check-cast v0, Lr4/a;

    .line 3111
    .line 3112
    iget v0, v0, Lr4/a;->i:I

    .line 3113
    .line 3114
    invoke-static {v0}, LA/f;->f(I)I

    .line 3115
    .line 3116
    .line 3117
    move-result v0

    .line 3118
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3119
    .line 3120
    .line 3121
    move-result-object v0

    .line 3122
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3123
    .line 3124
    .line 3125
    return-void

    .line 3126
    :cond_9e
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3127
    .line 3128
    const-string v2, "INVALID_SESSION"

    .line 3129
    .line 3130
    const-string v3, "Invalid session id."

    .line 3131
    .line 3132
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3133
    .line 3134
    .line 3135
    return-void

    .line 3136
    :pswitch_33
    move-object v7, v2

    .line 3137
    if-eqz v8, :cond_a2

    .line 3138
    .line 3139
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 3140
    .line 3141
    .line 3142
    move-result-wide v2

    .line 3143
    invoke-static {v2, v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 3144
    .line 3145
    .line 3146
    move-result-object v0

    .line 3147
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3148
    .line 3149
    if-nez v0, :cond_9f

    .line 3150
    .line 3151
    const-string v0, "SESSION_NOT_FOUND"

    .line 3152
    .line 3153
    const-string v3, "Session not found."

    .line 3154
    .line 3155
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3156
    .line 3157
    .line 3158
    return-void

    .line 3159
    :cond_9f
    invoke-interface {v0}, Lr4/h;->a()Z

    .line 3160
    .line 3161
    .line 3162
    move-result v3

    .line 3163
    if-eqz v3, :cond_a1

    .line 3164
    .line 3165
    check-cast v0, Lr4/c;

    .line 3166
    .line 3167
    invoke-virtual {v0}, Lr4/c;->j()Ljava/util/LinkedList;

    .line 3168
    .line 3169
    .line 3170
    move-result-object v0

    .line 3171
    new-instance v3, Ljava/util/ArrayList;

    .line 3172
    .line 3173
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 3174
    .line 3175
    .line 3176
    :goto_11
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 3177
    .line 3178
    .line 3179
    move-result v5

    .line 3180
    if-ge v15, v5, :cond_a0

    .line 3181
    .line 3182
    invoke-virtual {v0, v15}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 3183
    .line 3184
    .line 3185
    move-result-object v5

    .line 3186
    check-cast v5, Lr4/i;

    .line 3187
    .line 3188
    invoke-static {v5}, Ls4/b;->q(Lr4/i;)Ljava/util/HashMap;

    .line 3189
    .line 3190
    .line 3191
    move-result-object v5

    .line 3192
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3193
    .line 3194
    .line 3195
    add-int/2addr v15, v4

    .line 3196
    goto :goto_11

    .line 3197
    :cond_a0
    invoke-virtual {v2, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3198
    .line 3199
    .line 3200
    return-void

    .line 3201
    :cond_a1
    const-string v0, "NOT_FFMPEG_SESSION"

    .line 3202
    .line 3203
    const-string v3, "A session is found but it does not have the correct type."

    .line 3204
    .line 3205
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3206
    .line 3207
    .line 3208
    return-void

    .line 3209
    :cond_a2
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3210
    .line 3211
    const-string v2, "INVALID_SESSION"

    .line 3212
    .line 3213
    const-string v3, "Invalid session id."

    .line 3214
    .line 3215
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3216
    .line 3217
    .line 3218
    return-void

    .line 3219
    :pswitch_34
    move-object v7, v2

    .line 3220
    iget-object v0, v1, Ls4/b;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3221
    .line 3222
    invoke-virtual {v0, v4, v15}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 3223
    .line 3224
    .line 3225
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3226
    .line 3227
    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3228
    .line 3229
    .line 3230
    return-void

    .line 3231
    :pswitch_35
    move-object v7, v2

    .line 3232
    if-eqz v8, :cond_a4

    .line 3233
    .line 3234
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 3235
    .line 3236
    .line 3237
    move-result-wide v2

    .line 3238
    invoke-static {v2, v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 3239
    .line 3240
    .line 3241
    move-result-object v0

    .line 3242
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3243
    .line 3244
    if-nez v0, :cond_a3

    .line 3245
    .line 3246
    const-string v0, "SESSION_NOT_FOUND"

    .line 3247
    .line 3248
    const-string v3, "Session not found."

    .line 3249
    .line 3250
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3251
    .line 3252
    .line 3253
    return-void

    .line 3254
    :cond_a3
    invoke-static {v0}, Ls4/b;->p(Lr4/h;)Ljava/util/HashMap;

    .line 3255
    .line 3256
    .line 3257
    move-result-object v0

    .line 3258
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3259
    .line 3260
    .line 3261
    return-void

    .line 3262
    :cond_a4
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3263
    .line 3264
    const-string v2, "INVALID_SESSION"

    .line 3265
    .line 3266
    const-string v3, "Invalid session id."

    .line 3267
    .line 3268
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3269
    .line 3270
    .line 3271
    return-void

    .line 3272
    :pswitch_36
    move-object v7, v2

    .line 3273
    invoke-static/range {v16 .. v17}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->nativeFFmpegCancel(J)V

    .line 3274
    .line 3275
    .line 3276
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3277
    .line 3278
    invoke-virtual {v0, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3279
    .line 3280
    .line 3281
    return-void

    .line 3282
    :pswitch_37
    move-object v7, v2

    .line 3283
    if-eqz v8, :cond_aa

    .line 3284
    .line 3285
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 3286
    .line 3287
    .line 3288
    move-result-wide v2

    .line 3289
    invoke-static {v2, v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 3290
    .line 3291
    .line 3292
    move-result-object v0

    .line 3293
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3294
    .line 3295
    if-nez v0, :cond_a5

    .line 3296
    .line 3297
    const-string v0, "SESSION_NOT_FOUND"

    .line 3298
    .line 3299
    const-string v3, "Session not found."

    .line 3300
    .line 3301
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3302
    .line 3303
    .line 3304
    return-void

    .line 3305
    :cond_a5
    invoke-interface {v0}, Lr4/h;->a()Z

    .line 3306
    .line 3307
    .line 3308
    move-result v3

    .line 3309
    if-eqz v3, :cond_a9

    .line 3310
    .line 3311
    invoke-static {v9}, Ls4/b;->k(Ljava/lang/Integer;)Z

    .line 3312
    .line 3313
    .line 3314
    move-result v3

    .line 3315
    if-eqz v3, :cond_a6

    .line 3316
    .line 3317
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 3318
    .line 3319
    .line 3320
    move-result v18

    .line 3321
    :cond_a6
    move/from16 v3, v18

    .line 3322
    .line 3323
    check-cast v0, Lr4/c;

    .line 3324
    .line 3325
    invoke-virtual {v0, v3}, Lr4/a;->i(I)V

    .line 3326
    .line 3327
    .line 3328
    invoke-virtual {v0}, Lr4/a;->h()Z

    .line 3329
    .line 3330
    .line 3331
    move-result v3

    .line 3332
    if-eqz v3, :cond_a7

    .line 3333
    .line 3334
    iget-wide v5, v0, Lr4/a;->a:J

    .line 3335
    .line 3336
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3337
    .line 3338
    .line 3339
    move-result-object v3

    .line 3340
    new-array v5, v4, [Ljava/lang/Object;

    .line 3341
    .line 3342
    aput-object v3, v5, v15

    .line 3343
    .line 3344
    const-string v3, "getAllStatistics was called to return all statistics but there are still statistics being transmitted for session id %d."

    .line 3345
    .line 3346
    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 3347
    .line 3348
    .line 3349
    move-result-object v3

    .line 3350
    const-string v5, "ffmpeg-kit"

    .line 3351
    .line 3352
    invoke-static {v5, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3353
    .line 3354
    .line 3355
    :cond_a7
    invoke-virtual {v0}, Lr4/c;->j()Ljava/util/LinkedList;

    .line 3356
    .line 3357
    .line 3358
    move-result-object v0

    .line 3359
    new-instance v3, Ljava/util/ArrayList;

    .line 3360
    .line 3361
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 3362
    .line 3363
    .line 3364
    :goto_12
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 3365
    .line 3366
    .line 3367
    move-result v5

    .line 3368
    if-ge v15, v5, :cond_a8

    .line 3369
    .line 3370
    invoke-virtual {v0, v15}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 3371
    .line 3372
    .line 3373
    move-result-object v5

    .line 3374
    check-cast v5, Lr4/i;

    .line 3375
    .line 3376
    invoke-static {v5}, Ls4/b;->q(Lr4/i;)Ljava/util/HashMap;

    .line 3377
    .line 3378
    .line 3379
    move-result-object v5

    .line 3380
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3381
    .line 3382
    .line 3383
    add-int/2addr v15, v4

    .line 3384
    goto :goto_12

    .line 3385
    :cond_a8
    invoke-virtual {v2, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3386
    .line 3387
    .line 3388
    return-void

    .line 3389
    :cond_a9
    const-string v0, "NOT_FFMPEG_SESSION"

    .line 3390
    .line 3391
    const-string v3, "A session is found but it does not have the correct type."

    .line 3392
    .line 3393
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3394
    .line 3395
    .line 3396
    return-void

    .line 3397
    :cond_aa
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3398
    .line 3399
    const-string v2, "INVALID_SESSION"

    .line 3400
    .line 3401
    const-string v3, "Invalid session id."

    .line 3402
    .line 3403
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3404
    .line 3405
    .line 3406
    return-void

    .line 3407
    :pswitch_38
    move-object v7, v2

    .line 3408
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3409
    .line 3410
    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->g()Ljava/lang/String;

    .line 3411
    .line 3412
    .line 3413
    move-result-object v2

    .line 3414
    invoke-virtual {v0, v7, v2}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3415
    .line 3416
    .line 3417
    return-void

    .line 3418
    :pswitch_39
    move-object v7, v2

    .line 3419
    if-eqz v8, :cond_ad

    .line 3420
    .line 3421
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 3422
    .line 3423
    .line 3424
    move-result-wide v4

    .line 3425
    invoke-static {v4, v5}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 3426
    .line 3427
    .line 3428
    move-result-object v0

    .line 3429
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3430
    .line 3431
    if-nez v0, :cond_ab

    .line 3432
    .line 3433
    const-string v0, "SESSION_NOT_FOUND"

    .line 3434
    .line 3435
    const-string v3, "Session not found."

    .line 3436
    .line 3437
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3438
    .line 3439
    .line 3440
    return-void

    .line 3441
    :cond_ab
    invoke-interface {v0}, Lr4/h;->a()Z

    .line 3442
    .line 3443
    .line 3444
    move-result v4

    .line 3445
    if-eqz v4, :cond_ac

    .line 3446
    .line 3447
    check-cast v0, Lr4/c;

    .line 3448
    .line 3449
    new-instance v4, Lg5/d;

    .line 3450
    .line 3451
    const/16 v5, 0x16

    .line 3452
    .line 3453
    invoke-direct {v4, v0, v5}, Lg5/d;-><init>(Ljava/lang/Object;I)V

    .line 3454
    .line 3455
    .line 3456
    sget-object v5, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->g:Ljava/util/concurrent/ExecutorService;

    .line 3457
    .line 3458
    invoke-interface {v5, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 3459
    .line 3460
    .line 3461
    move-result-object v4

    .line 3462
    iput-object v4, v0, Lr4/a;->h:Ljava/util/concurrent/Future;

    .line 3463
    .line 3464
    invoke-virtual {v2, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3465
    .line 3466
    .line 3467
    return-void

    .line 3468
    :cond_ac
    const-string v0, "NOT_FFMPEG_SESSION"

    .line 3469
    .line 3470
    const-string v3, "A session is found but it does not have the correct type."

    .line 3471
    .line 3472
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3473
    .line 3474
    .line 3475
    return-void

    .line 3476
    :cond_ad
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3477
    .line 3478
    const-string v2, "INVALID_SESSION"

    .line 3479
    .line 3480
    const-string v3, "Invalid session id."

    .line 3481
    .line 3482
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3483
    .line 3484
    .line 3485
    return-void

    .line 3486
    :pswitch_3a
    move-object v7, v2

    .line 3487
    if-eqz v8, :cond_b0

    .line 3488
    .line 3489
    invoke-virtual {v8}, Ljava/lang/Integer;->longValue()J

    .line 3490
    .line 3491
    .line 3492
    move-result-wide v2

    .line 3493
    invoke-static {v2, v3}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j(J)Lr4/h;

    .line 3494
    .line 3495
    .line 3496
    move-result-object v0

    .line 3497
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3498
    .line 3499
    if-nez v0, :cond_ae

    .line 3500
    .line 3501
    const-string v0, "SESSION_NOT_FOUND"

    .line 3502
    .line 3503
    const-string v3, "Session not found."

    .line 3504
    .line 3505
    invoke-virtual {v2, v0, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3506
    .line 3507
    .line 3508
    return-void

    .line 3509
    :cond_ae
    check-cast v0, Lr4/a;

    .line 3510
    .line 3511
    iget-object v3, v0, Lr4/a;->c:Ljava/util/Date;

    .line 3512
    .line 3513
    iget-object v0, v0, Lr4/a;->d:Ljava/util/Date;

    .line 3514
    .line 3515
    if-eqz v3, :cond_af

    .line 3516
    .line 3517
    if-eqz v0, :cond_af

    .line 3518
    .line 3519
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 3520
    .line 3521
    .line 3522
    move-result-wide v4

    .line 3523
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    .line 3524
    .line 3525
    .line 3526
    move-result-wide v8

    .line 3527
    sub-long v16, v4, v8

    .line 3528
    .line 3529
    :cond_af
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3530
    .line 3531
    .line 3532
    move-result-object v0

    .line 3533
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3534
    .line 3535
    .line 3536
    return-void

    .line 3537
    :cond_b0
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3538
    .line 3539
    const-string v2, "INVALID_SESSION"

    .line 3540
    .line 3541
    const-string v3, "Invalid session id."

    .line 3542
    .line 3543
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3544
    .line 3545
    .line 3546
    return-void

    .line 3547
    :pswitch_3b
    move-object v7, v2

    .line 3548
    const-string v2, "fontDirectory"

    .line 3549
    .line 3550
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 3551
    .line 3552
    .line 3553
    move-result-object v2

    .line 3554
    check-cast v2, Ljava/lang/String;

    .line 3555
    .line 3556
    const-string v4, "fontNameMap"

    .line 3557
    .line 3558
    invoke-virtual {v0, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 3559
    .line 3560
    .line 3561
    move-result-object v0

    .line 3562
    check-cast v0, Ljava/util/Map;

    .line 3563
    .line 3564
    if-eqz v2, :cond_b2

    .line 3565
    .line 3566
    iget-object v4, v1, Ls4/b;->g:Landroid/content/Context;

    .line 3567
    .line 3568
    iget-object v5, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3569
    .line 3570
    if-eqz v4, :cond_b1

    .line 3571
    .line 3572
    sget-object v6, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3573
    .line 3574
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 3575
    .line 3576
    .line 3577
    move-result-object v2

    .line 3578
    invoke-static {v4, v2, v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->n(Landroid/content/Context;Ljava/util/List;Ljava/util/Map;)V

    .line 3579
    .line 3580
    .line 3581
    invoke-virtual {v5, v7, v3}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3582
    .line 3583
    .line 3584
    return-void

    .line 3585
    :cond_b1
    const-string v0, "ffmpeg-kit-flutter"

    .line 3586
    .line 3587
    const-string v2, "Cannot setFontDirectory. Context is null."

    .line 3588
    .line 3589
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 3590
    .line 3591
    .line 3592
    const-string v0, "INVALID_CONTEXT"

    .line 3593
    .line 3594
    const-string v2, "Context is null."

    .line 3595
    .line 3596
    invoke-virtual {v5, v0, v2, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3597
    .line 3598
    .line 3599
    return-void

    .line 3600
    :cond_b2
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3601
    .line 3602
    const-string v2, "INVALID_FONT_DIRECTORY"

    .line 3603
    .line 3604
    const-string v3, "Invalid font directory."

    .line 3605
    .line 3606
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3607
    .line 3608
    .line 3609
    return-void

    .line 3610
    :pswitch_3c
    move-object v7, v2

    .line 3611
    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3612
    .line 3613
    invoke-static {}, Lcom/arthenica/ffmpegkit/AbiDetect;->isNativeLTSBuild()Z

    .line 3614
    .line 3615
    .line 3616
    move-result v0

    .line 3617
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 3618
    .line 3619
    .line 3620
    move-result-object v0

    .line 3621
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3622
    .line 3623
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3624
    .line 3625
    .line 3626
    return-void

    .line 3627
    :pswitch_3d
    move-object v7, v2

    .line 3628
    if-eqz v10, :cond_b3

    .line 3629
    .line 3630
    new-array v0, v15, [Ljava/lang/String;

    .line 3631
    .line 3632
    invoke-interface {v10, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 3633
    .line 3634
    .line 3635
    move-result-object v0

    .line 3636
    check-cast v0, [Ljava/lang/String;

    .line 3637
    .line 3638
    new-instance v2, Lr4/f;

    .line 3639
    .line 3640
    invoke-direct {v2, v0}, Lr4/a;-><init>([Ljava/lang/String;)V

    .line 3641
    .line 3642
    .line 3643
    invoke-static {v2}, Ls4/b;->p(Lr4/h;)Ljava/util/HashMap;

    .line 3644
    .line 3645
    .line 3646
    move-result-object v0

    .line 3647
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3648
    .line 3649
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3650
    .line 3651
    .line 3652
    return-void

    .line 3653
    :cond_b3
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3654
    .line 3655
    const-string v2, "INVALID_ARGUMENTS"

    .line 3656
    .line 3657
    const-string v3, "Invalid arguments array."

    .line 3658
    .line 3659
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3660
    .line 3661
    .line 3662
    return-void

    .line 3663
    :pswitch_3e
    move-object v7, v2

    .line 3664
    if-eqz v10, :cond_b4

    .line 3665
    .line 3666
    new-array v0, v15, [Ljava/lang/String;

    .line 3667
    .line 3668
    invoke-interface {v10, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 3669
    .line 3670
    .line 3671
    move-result-object v0

    .line 3672
    check-cast v0, [Ljava/lang/String;

    .line 3673
    .line 3674
    new-instance v2, Lr4/c;

    .line 3675
    .line 3676
    invoke-direct {v2, v0}, Lr4/c;-><init>([Ljava/lang/String;)V

    .line 3677
    .line 3678
    .line 3679
    invoke-static {v2}, Ls4/b;->p(Lr4/h;)Ljava/util/HashMap;

    .line 3680
    .line 3681
    .line 3682
    move-result-object v0

    .line 3683
    iget-object v2, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3684
    .line 3685
    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3686
    .line 3687
    .line 3688
    return-void

    .line 3689
    :cond_b4
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3690
    .line 3691
    const-string v2, "INVALID_ARGUMENTS"

    .line 3692
    .line 3693
    const-string v3, "Invalid arguments array."

    .line 3694
    .line 3695
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3696
    .line 3697
    .line 3698
    return-void

    .line 3699
    :pswitch_3f
    move-object v7, v2

    .line 3700
    const-string v2, "uri"

    .line 3701
    .line 3702
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 3703
    .line 3704
    .line 3705
    move-result-object v2

    .line 3706
    check-cast v2, Ljava/lang/String;

    .line 3707
    .line 3708
    const-string v3, "openMode"

    .line 3709
    .line 3710
    invoke-virtual {v0, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 3711
    .line 3712
    .line 3713
    move-result-object v0

    .line 3714
    move-object v3, v0

    .line 3715
    check-cast v3, Ljava/lang/String;

    .line 3716
    .line 3717
    if-eqz v2, :cond_ba

    .line 3718
    .line 3719
    if-eqz v3, :cond_ba

    .line 3720
    .line 3721
    const-string v4, "."

    .line 3722
    .line 3723
    iget-object v0, v1, Ls4/b;->g:Landroid/content/Context;

    .line 3724
    .line 3725
    const-string v5, "Cannot getSafParameter using parameters uriString: "

    .line 3726
    .line 3727
    iget-object v6, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3728
    .line 3729
    const-string v8, ", openMode: "

    .line 3730
    .line 3731
    const-string v9, "ffmpeg-kit-flutter"

    .line 3732
    .line 3733
    if-eqz v0, :cond_b9

    .line 3734
    .line 3735
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 3736
    .line 3737
    .line 3738
    move-result-object v11

    .line 3739
    if-nez v11, :cond_b5

    .line 3740
    .line 3741
    const-string v0, ". Uri string cannot be parsed."

    .line 3742
    .line 3743
    invoke-static {v5, v2, v8, v3, v0}, LR8/v;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3744
    .line 3745
    .line 3746
    move-result-object v0

    .line 3747
    invoke-static {v9, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 3748
    .line 3749
    .line 3750
    const-string v0, "GET_SAF_PARAMETER_FAILED"

    .line 3751
    .line 3752
    const-string v2, "Uri string cannot be parsed."

    .line 3753
    .line 3754
    invoke-virtual {v6, v0, v2, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3755
    .line 3756
    .line 3757
    goto/16 :goto_18

    .line 3758
    .line 3759
    :cond_b5
    iget-object v0, v1, Ls4/b;->g:Landroid/content/Context;

    .line 3760
    .line 3761
    sget-object v5, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3762
    .line 3763
    const-string v5, "ffmpeg-kit"

    .line 3764
    .line 3765
    :try_start_5
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 3766
    .line 3767
    .line 3768
    move-result-object v10

    .line 3769
    const/4 v12, 0x0

    .line 3770
    const/4 v13, 0x0

    .line 3771
    const/4 v14, 0x0

    .line 3772
    const/4 v15, 0x0

    .line 3773
    invoke-virtual/range {v10 .. v15}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 3774
    .line 3775
    .line 3776
    move-result-object v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 3777
    if-eqz v10, :cond_b6

    .line 3778
    .line 3779
    :try_start_6
    invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z

    .line 3780
    .line 3781
    .line 3782
    move-result v12

    .line 3783
    if-eqz v12, :cond_b6

    .line 3784
    .line 3785
    const-string v12, "_display_name"

    .line 3786
    .line 3787
    invoke-interface {v10, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 3788
    .line 3789
    .line 3790
    move-result v12

    .line 3791
    invoke-interface {v10, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 3792
    .line 3793
    .line 3794
    move-result-object v12
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 3795
    goto :goto_14

    .line 3796
    :catchall_1
    move-exception v0

    .line 3797
    move-object v2, v0

    .line 3798
    :try_start_7
    invoke-interface {v10}, Landroid/database/Cursor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 3799
    .line 3800
    .line 3801
    goto :goto_13

    .line 3802
    :catchall_2
    move-exception v0

    .line 3803
    :try_start_8
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 3804
    .line 3805
    .line 3806
    :goto_13
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 3807
    :catchall_3
    move-exception v0

    .line 3808
    goto/16 :goto_17

    .line 3809
    .line 3810
    :cond_b6
    const-string v12, "unknown"

    .line 3811
    .line 3812
    :goto_14
    if-eqz v10, :cond_b7

    .line 3813
    .line 3814
    :try_start_9
    invoke-interface {v10}, Landroid/database/Cursor;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 3815
    .line 3816
    .line 3817
    :cond_b7
    sget-object v10, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3818
    .line 3819
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 3820
    .line 3821
    .line 3822
    move-result v10

    .line 3823
    sget-object v13, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->m:Landroid/util/SparseArray;

    .line 3824
    .line 3825
    new-instance v14, Lr4/b;

    .line 3826
    .line 3827
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3828
    .line 3829
    .line 3830
    move-result-object v15

    .line 3831
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 3832
    .line 3833
    .line 3834
    move-result-object v0

    .line 3835
    invoke-direct {v14, v15, v11, v3, v0}, Lr4/b;-><init>(Ljava/lang/Integer;Landroid/net/Uri;Ljava/lang/String;Landroid/content/ContentResolver;)V

    .line 3836
    .line 3837
    .line 3838
    invoke-virtual {v13, v10, v14}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 3839
    .line 3840
    .line 3841
    new-instance v11, Ljava/lang/StringBuilder;

    .line 3842
    .line 3843
    const-string v0, "saf:"

    .line 3844
    .line 3845
    invoke-direct {v11, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3846
    .line 3847
    .line 3848
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3849
    .line 3850
    .line 3851
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3852
    .line 3853
    .line 3854
    invoke-virtual {v12, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 3855
    .line 3856
    .line 3857
    move-result v0

    .line 3858
    if-ltz v0, :cond_b8

    .line 3859
    .line 3860
    invoke-virtual {v12, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 3861
    .line 3862
    .line 3863
    move-result v0

    .line 3864
    invoke-virtual {v12, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 3865
    .line 3866
    .line 3867
    move-result-object v0

    .line 3868
    goto :goto_15

    .line 3869
    :cond_b8
    move-object v0, v12

    .line 3870
    :goto_15
    :try_start_a
    new-instance v10, Ljava/util/StringTokenizer;

    .line 3871
    .line 3872
    const-string v13, " ."

    .line 3873
    .line 3874
    invoke-direct {v10, v0, v13}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 3875
    .line 3876
    .line 3877
    invoke-virtual {v10}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 3878
    .line 3879
    .line 3880
    move-result-object v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_3

    .line 3881
    goto :goto_16

    .line 3882
    :catch_3
    move-exception v0

    .line 3883
    invoke-static {v0}, Lu4/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 3884
    .line 3885
    .line 3886
    move-result-object v0

    .line 3887
    new-instance v10, Ljava/lang/StringBuilder;

    .line 3888
    .line 3889
    const-string v13, "Failed to extract extension from saf display name: "

    .line 3890
    .line 3891
    invoke-direct {v10, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3892
    .line 3893
    .line 3894
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3895
    .line 3896
    .line 3897
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3898
    .line 3899
    .line 3900
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3901
    .line 3902
    .line 3903
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3904
    .line 3905
    .line 3906
    move-result-object v0

    .line 3907
    invoke-static {v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 3908
    .line 3909
    .line 3910
    const-string v0, "raw"

    .line 3911
    .line 3912
    :goto_16
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3913
    .line 3914
    .line 3915
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3916
    .line 3917
    .line 3918
    move-result-object v0

    .line 3919
    const-string v5, "getSafParameter using parameters uriString: "

    .line 3920
    .line 3921
    const-string v10, " completed with saf parameter: "

    .line 3922
    .line 3923
    invoke-static {v5, v2, v8, v3, v10}, LA7/p0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3924
    .line 3925
    .line 3926
    move-result-object v2

    .line 3927
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3928
    .line 3929
    .line 3930
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3931
    .line 3932
    .line 3933
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3934
    .line 3935
    .line 3936
    move-result-object v2

    .line 3937
    invoke-static {v9, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3938
    .line 3939
    .line 3940
    invoke-virtual {v6, v7, v0}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 3941
    .line 3942
    .line 3943
    goto :goto_18

    .line 3944
    :goto_17
    invoke-virtual {v11}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 3945
    .line 3946
    .line 3947
    move-result-object v2

    .line 3948
    invoke-static {v0}, Lu4/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 3949
    .line 3950
    .line 3951
    move-result-object v3

    .line 3952
    new-instance v6, Ljava/lang/StringBuilder;

    .line 3953
    .line 3954
    const-string v7, "Failed to get _display_name column for "

    .line 3955
    .line 3956
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3957
    .line 3958
    .line 3959
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3960
    .line 3961
    .line 3962
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3963
    .line 3964
    .line 3965
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3966
    .line 3967
    .line 3968
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3969
    .line 3970
    .line 3971
    move-result-object v2

    .line 3972
    invoke-static {v5, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 3973
    .line 3974
    .line 3975
    throw v0

    .line 3976
    :cond_b9
    const-string v0, ". Context is null."

    .line 3977
    .line 3978
    invoke-static {v5, v2, v8, v3, v0}, LR8/v;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3979
    .line 3980
    .line 3981
    move-result-object v0

    .line 3982
    invoke-static {v9, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 3983
    .line 3984
    .line 3985
    const-string v0, "INVALID_CONTEXT"

    .line 3986
    .line 3987
    const-string v2, "Context is null."

    .line 3988
    .line 3989
    invoke-virtual {v6, v0, v2, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 3990
    .line 3991
    .line 3992
    :goto_18
    return-void

    .line 3993
    :cond_ba
    if-eqz v2, :cond_bb

    .line 3994
    .line 3995
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 3996
    .line 3997
    const-string v2, "INVALID_OPEN_MODE"

    .line 3998
    .line 3999
    const-string v3, "Invalid openMode value."

    .line 4000
    .line 4001
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 4002
    .line 4003
    .line 4004
    return-void

    .line 4005
    :cond_bb
    iget-object v0, v1, Ls4/b;->k:Lcom/google/android/gms/ads/nativead/l;

    .line 4006
    .line 4007
    const-string v2, "INVALID_URI"

    .line 4008
    .line 4009
    const-string v3, "Invalid uri value."

    .line 4010
    .line 4011
    invoke-virtual {v0, v2, v3, v7}, Lcom/google/android/gms/ads/nativead/l;->j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V

    .line 4012
    .line 4013
    .line 4014
    return-void

    .line 4015
    :sswitch_data_0
    .sparse-switch
        -0x7e6482d9 -> :sswitch_3f
        -0x7d5ff76f -> :sswitch_3e
        -0x7202c932 -> :sswitch_3d
        -0x6f42e773 -> :sswitch_3c
        -0x67f04264 -> :sswitch_3b
        -0x66a401aa -> :sswitch_3a
        -0x629525e0 -> :sswitch_39
        -0x541b4b7a -> :sswitch_38
        -0x52d40761 -> :sswitch_37
        -0x5185d186 -> :sswitch_36
        -0x4be241a0 -> :sswitch_35
        -0x49b3d1d5 -> :sswitch_34
        -0x49773bf8 -> :sswitch_33
        -0x48ab64f1 -> :sswitch_32
        -0x47653081 -> :sswitch_31
        -0x447e03cb -> :sswitch_30
        -0x3f8b2616 -> :sswitch_2f
        -0x3c0bbad7 -> :sswitch_2e
        -0x3bd93d9d -> :sswitch_2d
        -0x3ad17144 -> :sswitch_2c
        -0x3411fb19 -> :sswitch_2b
        -0x3065f1ed -> :sswitch_2a
        -0x17904cc3 -> :sswitch_29
        -0x177a550f -> :sswitch_28
        -0x14685a17 -> :sswitch_27
        -0x139f14fa -> :sswitch_26
        -0x1278eede -> :sswitch_25
        -0x1067f928 -> :sswitch_24
        -0xd314fea -> :sswitch_23
        -0x80b01e2 -> :sswitch_22
        -0x482c734 -> :sswitch_21
        0x256bd39 -> :sswitch_20
        0x5d1331a -> :sswitch_1f
        0x801109d -> :sswitch_1e
        0xab4da13 -> :sswitch_1d
        0xfd2f98b -> :sswitch_1c
        0x1000d6bb -> :sswitch_1b
        0x24c29597 -> :sswitch_1a
        0x27bf4e0a -> :sswitch_19
        0x2cf77550 -> :sswitch_18
        0x358d3986 -> :sswitch_17
        0x377166a4 -> :sswitch_16
        0x3de2f1a4 -> :sswitch_15
        0x3fb52771 -> :sswitch_14
        0x42d08b51 -> :sswitch_13
        0x45e19946 -> :sswitch_12
        0x487741ed -> :sswitch_11
        0x4d2630f7 -> :sswitch_10
        0x50a6a8b7 -> :sswitch_f
        0x52ad7e41 -> :sswitch_e
        0x558bef88 -> :sswitch_d
        0x569db4c7 -> :sswitch_c
        0x576a5428 -> :sswitch_b
        0x5cbb0a58 -> :sswitch_a
        0x5d58fd61 -> :sswitch_9
        0x61b634db -> :sswitch_8
        0x663388a9 -> :sswitch_7
        0x68a3b45a -> :sswitch_6
        0x6c1fae37 -> :sswitch_5
        0x6f4c29ee -> :sswitch_4
        0x70d4e5d2 -> :sswitch_3
        0x73f50439 -> :sswitch_2
        0x7514275d -> :sswitch_1
        0x793fb30f -> :sswitch_0
    .end sparse-switch

    .line 4016
    .line 4017
    .line 4018
    .line 4019
    .line 4020
    .line 4021
    .line 4022
    .line 4023
    .line 4024
    .line 4025
    .line 4026
    .line 4027
    .line 4028
    .line 4029
    .line 4030
    .line 4031
    .line 4032
    .line 4033
    .line 4034
    .line 4035
    .line 4036
    .line 4037
    .line 4038
    .line 4039
    .line 4040
    .line 4041
    .line 4042
    .line 4043
    .line 4044
    .line 4045
    .line 4046
    .line 4047
    .line 4048
    .line 4049
    .line 4050
    .line 4051
    .line 4052
    .line 4053
    .line 4054
    .line 4055
    .line 4056
    .line 4057
    .line 4058
    .line 4059
    .line 4060
    .line 4061
    .line 4062
    .line 4063
    .line 4064
    .line 4065
    .line 4066
    .line 4067
    .line 4068
    .line 4069
    .line 4070
    .line 4071
    .line 4072
    .line 4073
    .line 4074
    .line 4075
    .line 4076
    .line 4077
    .line 4078
    .line 4079
    .line 4080
    .line 4081
    .line 4082
    .line 4083
    .line 4084
    .line 4085
    .line 4086
    .line 4087
    .line 4088
    .line 4089
    .line 4090
    .line 4091
    .line 4092
    .line 4093
    .line 4094
    .line 4095
    .line 4096
    .line 4097
    .line 4098
    .line 4099
    .line 4100
    .line 4101
    .line 4102
    .line 4103
    .line 4104
    .line 4105
    .line 4106
    .line 4107
    .line 4108
    .line 4109
    .line 4110
    .line 4111
    .line 4112
    .line 4113
    .line 4114
    .line 4115
    .line 4116
    .line 4117
    .line 4118
    .line 4119
    .line 4120
    .line 4121
    .line 4122
    .line 4123
    .line 4124
    .line 4125
    .line 4126
    .line 4127
    .line 4128
    .line 4129
    .line 4130
    .line 4131
    .line 4132
    .line 4133
    .line 4134
    .line 4135
    .line 4136
    .line 4137
    .line 4138
    .line 4139
    .line 4140
    .line 4141
    .line 4142
    .line 4143
    .line 4144
    .line 4145
    .line 4146
    .line 4147
    .line 4148
    .line 4149
    .line 4150
    .line 4151
    .line 4152
    .line 4153
    .line 4154
    .line 4155
    .line 4156
    .line 4157
    .line 4158
    .line 4159
    .line 4160
    .line 4161
    .line 4162
    .line 4163
    .line 4164
    .line 4165
    .line 4166
    .line 4167
    .line 4168
    .line 4169
    .line 4170
    .line 4171
    .line 4172
    .line 4173
    .line 4174
    .line 4175
    .line 4176
    .line 4177
    .line 4178
    .line 4179
    .line 4180
    .line 4181
    .line 4182
    .line 4183
    .line 4184
    .line 4185
    .line 4186
    .line 4187
    .line 4188
    .line 4189
    .line 4190
    .line 4191
    .line 4192
    .line 4193
    .line 4194
    .line 4195
    .line 4196
    .line 4197
    .line 4198
    .line 4199
    .line 4200
    .line 4201
    .line 4202
    .line 4203
    .line 4204
    .line 4205
    .line 4206
    .line 4207
    .line 4208
    .line 4209
    .line 4210
    .line 4211
    .line 4212
    .line 4213
    .line 4214
    .line 4215
    .line 4216
    .line 4217
    .line 4218
    .line 4219
    .line 4220
    .line 4221
    .line 4222
    .line 4223
    .line 4224
    .line 4225
    .line 4226
    .line 4227
    .line 4228
    .line 4229
    .line 4230
    .line 4231
    .line 4232
    .line 4233
    .line 4234
    .line 4235
    .line 4236
    .line 4237
    .line 4238
    .line 4239
    .line 4240
    .line 4241
    .line 4242
    .line 4243
    .line 4244
    .line 4245
    .line 4246
    .line 4247
    .line 4248
    .line 4249
    .line 4250
    .line 4251
    .line 4252
    .line 4253
    .line 4254
    .line 4255
    .line 4256
    .line 4257
    .line 4258
    .line 4259
    .line 4260
    .line 4261
    .line 4262
    .line 4263
    .line 4264
    .line 4265
    .line 4266
    .line 4267
    .line 4268
    .line 4269
    .line 4270
    .line 4271
    .line 4272
    .line 4273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
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

.method public final onReattachedToActivityForConfigChanges(Lrc/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ls4/b;->onAttachedToActivity(Lrc/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
