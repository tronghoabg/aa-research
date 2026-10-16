.class public Lhd/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;


# instance fields
.field public final a:Landroid/util/LongSparseArray;

.field public b:LC8/i;

.field public final c:Ls8/b;

.field public d:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/util/LongSparseArray;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lhd/q;->a:Landroid/util/LongSparseArray;

    .line 10
    .line 11
    new-instance v0, Ls8/b;

    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    invoke-direct {v0, v1}, Ls8/b;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lhd/q;->c:Ls8/b;

    .line 18
    .line 19
    const-wide/16 v0, 0x1

    .line 20
    .line 21
    iput-wide v0, p0, Lhd/q;->d:J

    .line 22
    .line 23
    return-void
.end method

.method public static e(Lhd/e;)LJ8/a;
    .locals 5

    .line 1
    iget-object v0, p0, Lhd/e;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "asset:"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    const-string p0, "asset:///"

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    new-instance p0, Lhd/c;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {p0, v0, v1}, Lhd/c;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    const-string v0, "assetUrl must start with \'asset:///\'"

    .line 29
    .line 30
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0

    .line 34
    :cond_1
    const-string v1, "rtsp:"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    const-string p0, "rtsp://"

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_2

    .line 49
    .line 50
    new-instance p0, Lhd/c;

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-direct {p0, v0, v1}, Lhd/c;-><init>(Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 58
    .line 59
    const-string v0, "rtspUrl must start with \'rtsp://\'"

    .line 60
    .line 61
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_3
    iget-object v1, p0, Lhd/e;->b:Lhd/g;

    .line 66
    .line 67
    const/4 v2, 0x1

    .line 68
    if-eqz v1, :cond_7

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_6

    .line 75
    .line 76
    if-eq v1, v2, :cond_5

    .line 77
    .line 78
    const/4 v3, 0x2

    .line 79
    if-eq v1, v3, :cond_4

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    move v2, v3

    .line 83
    goto :goto_0

    .line 84
    :cond_5
    const/4 v2, 0x4

    .line 85
    goto :goto_0

    .line 86
    :cond_6
    const/4 v2, 0x3

    .line 87
    :cond_7
    :goto_0
    iget-object v1, p0, Lhd/e;->c:Ljava/util/Map;

    .line 88
    .line 89
    iget-object p0, p0, Lhd/e;->d:Ljava/lang/String;

    .line 90
    .line 91
    new-instance v3, Lhd/b;

    .line 92
    .line 93
    new-instance v4, Ljava/util/HashMap;

    .line 94
    .line 95
    invoke-direct {v4, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 96
    .line 97
    .line 98
    invoke-direct {v3, v0, v2, v4, p0}, Lhd/b;-><init>(Ljava/lang/String;ILjava/util/HashMap;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-object v3
.end method


# virtual methods
.method public final a(Lhd/e;)Ljava/lang/Long;
    .locals 13

    .line 1
    invoke-static {p1}, Lhd/q;->e(Lhd/e;)LJ8/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-wide v0, p0, Lhd/q;->d:J

    .line 6
    .line 7
    const-wide/16 v2, 0x1

    .line 8
    .line 9
    add-long/2addr v2, v0

    .line 10
    iput-wide v2, p0, Lhd/q;->d:J

    .line 11
    .line 12
    iget-object v2, p0, Lhd/q;->b:LC8/i;

    .line 13
    .line 14
    iget-object v3, v2, LC8/i;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Landroid/content/Context;

    .line 17
    .line 18
    new-instance v4, Luc/j;

    .line 19
    .line 20
    iget-object v2, v2, LC8/i;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Luc/f;

    .line 23
    .line 24
    const-string v5, "flutter.io/videoPlayer/videoEvents"

    .line 25
    .line 26
    invoke-static {v0, v1, v5}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-direct {v4, v2, v5}, Luc/j;-><init>(Luc/f;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Lhd/n;

    .line 34
    .line 35
    invoke-direct {v2}, Lhd/n;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v5, LWa/d;

    .line 39
    .line 40
    const/4 v6, 0x2

    .line 41
    invoke-direct {v5, v2, v6}, LWa/d;-><init>(Ljava/lang/Object;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v5}, Luc/j;->a(Luc/i;)V

    .line 45
    .line 46
    .line 47
    new-instance v8, Lad/L;

    .line 48
    .line 49
    const/16 v4, 0x8

    .line 50
    .line 51
    invoke-direct {v8, v2, v4}, Lad/L;-><init>(Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    new-instance v7, Lid/d;

    .line 55
    .line 56
    invoke-virtual {p1}, LJ8/a;->b()LN1/w;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    new-instance v12, Lid/c;

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-direct {v12, v3, p1, v2}, Lid/c;-><init>(Landroid/content/Context;LJ8/a;I)V

    .line 64
    .line 65
    .line 66
    const/4 v11, 0x0

    .line 67
    iget-object v10, p0, Lhd/q;->c:Ls8/b;

    .line 68
    .line 69
    invoke-direct/range {v7 .. v12}, Lhd/o;-><init>(Lad/L;LN1/w;Ls8/b;Lio/flutter/view/TextureRegistry$SurfaceProducer;Lid/c;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lhd/q;->b:LC8/i;

    .line 73
    .line 74
    iget-object p1, p1, LC8/i;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Luc/f;

    .line 77
    .line 78
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {p1, v2, v7}, Lcom/google/android/gms/internal/consent_sdk/a;->J(Luc/f;Ljava/lang/String;Lhd/o;)V

    .line 83
    .line 84
    .line 85
    new-instance v3, Laa/f;

    .line 86
    .line 87
    const/16 v4, 0xa

    .line 88
    .line 89
    invoke-direct {v3, v4, p1, v2}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iput-object v3, v7, Lhd/o;->c:Laa/f;

    .line 93
    .line 94
    iget-object p1, p0, Lhd/q;->a:Landroid/util/LongSparseArray;

    .line 95
    .line 96
    invoke-virtual {p1, v0, v1, v7}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    return-object p1
.end method

.method public final b(Lhd/e;)Lhd/j;
    .locals 10

    .line 1
    invoke-static {p1}, Lhd/q;->e(Lhd/e;)LJ8/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-wide v0, p0, Lhd/q;->d:J

    .line 6
    .line 7
    const-wide/16 v2, 0x1

    .line 8
    .line 9
    add-long/2addr v2, v0

    .line 10
    iput-wide v2, p0, Lhd/q;->d:J

    .line 11
    .line 12
    iget-object v2, p0, Lhd/q;->b:LC8/i;

    .line 13
    .line 14
    iget-object v2, v2, LC8/i;->f:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lio/flutter/embedding/engine/renderer/k;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-virtual {v2, v3}, Lio/flutter/embedding/engine/renderer/k;->c(I)Lio/flutter/view/TextureRegistry$SurfaceProducer;

    .line 20
    .line 21
    .line 22
    move-result-object v8

    .line 23
    iget-object v2, p0, Lhd/q;->b:LC8/i;

    .line 24
    .line 25
    iget-object v4, v2, LC8/i;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Landroid/content/Context;

    .line 28
    .line 29
    new-instance v5, Luc/j;

    .line 30
    .line 31
    iget-object v2, v2, LC8/i;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Luc/f;

    .line 34
    .line 35
    const-string v6, "flutter.io/videoPlayer/videoEvents"

    .line 36
    .line 37
    invoke-static {v0, v1, v6}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-direct {v5, v2, v6}, Luc/j;-><init>(Luc/f;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance v2, Lhd/n;

    .line 45
    .line 46
    invoke-direct {v2}, Lhd/n;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v6, LWa/d;

    .line 50
    .line 51
    const/4 v7, 0x2

    .line 52
    invoke-direct {v6, v2, v7}, LWa/d;-><init>(Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, v6}, Luc/j;->a(Luc/i;)V

    .line 56
    .line 57
    .line 58
    new-instance v5, Lad/L;

    .line 59
    .line 60
    const/16 v6, 0x8

    .line 61
    .line 62
    invoke-direct {v5, v2, v6}, Lad/L;-><init>(Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    move-object v2, v4

    .line 66
    new-instance v4, Ljd/b;

    .line 67
    .line 68
    invoke-virtual {p1}, LJ8/a;->b()LN1/w;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    new-instance v9, Lid/c;

    .line 73
    .line 74
    const/4 v7, 0x1

    .line 75
    invoke-direct {v9, v2, p1, v7}, Lid/c;-><init>(Landroid/content/Context;LJ8/a;I)V

    .line 76
    .line 77
    .line 78
    iget-object v7, p0, Lhd/q;->c:Ls8/b;

    .line 79
    .line 80
    invoke-direct/range {v4 .. v9}, Lhd/o;-><init>(Lad/L;LN1/w;Ls8/b;Lio/flutter/view/TextureRegistry$SurfaceProducer;Lid/c;)V

    .line 81
    .line 82
    .line 83
    iput-boolean v3, v4, Ljd/b;->e:Z

    .line 84
    .line 85
    invoke-interface {v8, v4}, Lio/flutter/view/TextureRegistry$SurfaceProducer;->setCallback(Lio/flutter/view/q;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v8}, Lio/flutter/view/TextureRegistry$SurfaceProducer;->getSurface()Landroid/view/Surface;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object v2, v4, Lhd/o;->d:LU1/m;

    .line 93
    .line 94
    check-cast v2, LU1/u;

    .line 95
    .line 96
    invoke-virtual {v2, p1}, LU1/u;->L0(Landroid/view/Surface;)V

    .line 97
    .line 98
    .line 99
    if-nez p1, :cond_0

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    const/4 v3, 0x0

    .line 103
    :goto_0
    iput-boolean v3, v4, Ljd/b;->e:Z

    .line 104
    .line 105
    iget-object p1, p0, Lhd/q;->b:LC8/i;

    .line 106
    .line 107
    iget-object p1, p1, LC8/i;->c:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p1, Luc/f;

    .line 110
    .line 111
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {p1, v2, v4}, Lcom/google/android/gms/internal/consent_sdk/a;->J(Luc/f;Ljava/lang/String;Lhd/o;)V

    .line 116
    .line 117
    .line 118
    new-instance v3, Laa/f;

    .line 119
    .line 120
    const/16 v5, 0xa

    .line 121
    .line 122
    invoke-direct {v3, v5, p1, v2}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    iput-object v3, v4, Lhd/o;->c:Laa/f;

    .line 126
    .line 127
    iget-object p1, p0, Lhd/q;->a:Landroid/util/LongSparseArray;

    .line 128
    .line 129
    invoke-virtual {p1, v0, v1, v4}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-interface {v8}, Lio/flutter/view/TextureRegistry$SurfaceProducer;->id()J

    .line 137
    .line 138
    .line 139
    move-result-wide v0

    .line 140
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    new-instance v1, Lhd/j;

    .line 145
    .line 146
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 147
    .line 148
    .line 149
    iput-object p1, v1, Lhd/j;->a:Ljava/lang/Long;

    .line 150
    .line 151
    iput-object v0, v1, Lhd/j;->b:Ljava/lang/Long;

    .line 152
    .line 153
    return-object v1
.end method

.method public final c(Ljava/lang/Long;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lhd/q;->a:Landroid/util/LongSparseArray;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    check-cast v3, Lhd/o;

    .line 12
    .line 13
    if-nez v3, :cond_1

    .line 14
    .line 15
    const-string p1, "No player found with playerId <"

    .line 16
    .line 17
    const-string v3, ">"

    .line 18
    .line 19
    invoke-static {v0, v1, p1, v3}, Lcb/a;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v2}, Landroid/util/LongSparseArray;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    const-string v0, " and no active players created by the plugin."

    .line 30
    .line 31
    invoke-static {p1, v0}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :cond_1
    invoke-virtual {v3}, Lhd/o;->b()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    invoke-virtual {v2, v0, v1}, Landroid/util/LongSparseArray;->remove(J)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Lhd/q;->b:LC8/i;

    .line 4
    .line 5
    iget-object p2, p2, LC8/i;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p2, Lhd/p;

    .line 8
    .line 9
    iget-object p2, p2, Lhd/p;->a:Loc/d;

    .line 10
    .line 11
    invoke-virtual {p2, p1}, Loc/d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object v0, p0, Lhd/q;->b:LC8/i;

    .line 17
    .line 18
    iget-object v0, v0, LC8/i;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lhd/p;

    .line 21
    .line 22
    iget-object v0, v0, Lhd/p;->a:Loc/d;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v2, "packages"

    .line 30
    .line 31
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v1, v2, p2, v2, p1}, Lka/n;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v0, p1}, Loc/d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 8

    .line 1
    invoke-static {}, Lb7/k;->z()Lb7/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LC8/i;

    .line 6
    .line 7
    iget-object v2, p1, Lqc/a;->a:Landroid/content/Context;

    .line 8
    .line 9
    iget-object v0, v0, Lb7/k;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Loc/d;

    .line 12
    .line 13
    new-instance v4, Lhd/p;

    .line 14
    .line 15
    invoke-direct {v4, v0}, Lhd/p;-><init>(Loc/d;)V

    .line 16
    .line 17
    .line 18
    new-instance v5, Lhd/p;

    .line 19
    .line 20
    invoke-direct {v5, v0}, Lhd/p;-><init>(Loc/d;)V

    .line 21
    .line 22
    .line 23
    iget-object v6, p1, Lqc/a;->d:Lio/flutter/embedding/engine/renderer/k;

    .line 24
    .line 25
    iget-object v3, p1, Lqc/a;->c:Luc/f;

    .line 26
    .line 27
    const/16 v7, 0xc

    .line 28
    .line 29
    invoke-direct/range {v1 .. v7}, LC8/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lhd/q;->b:LC8/i;

    .line 33
    .line 34
    invoke-static {v3, p0}, Lcom/google/android/gms/internal/consent_sdk/a;->I(Luc/f;Lhd/q;)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Lad/Z;

    .line 38
    .line 39
    iget-object v1, p0, Lhd/q;->a:Landroid/util/LongSparseArray;

    .line 40
    .line 41
    invoke-static {v1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    new-instance v2, Lcom/unity3d/services/core/webview/b;

    .line 45
    .line 46
    const/16 v3, 0x9

    .line 47
    .line 48
    invoke-direct {v2, v1, v3}, Lcom/unity3d/services/core/webview/b;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, v2}, Lad/Z;-><init>(Lcom/unity3d/services/core/webview/b;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p1, Lqc/a;->e:Lio/flutter/plugin/platform/n;

    .line 55
    .line 56
    const-string v1, "plugins.flutter.dev/video_player_android"

    .line 57
    .line 58
    invoke-virtual {p1, v1, v0}, Lio/flutter/plugin/platform/n;->j(Ljava/lang/String;Lio/flutter/plugin/platform/f;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lhd/q;->b:LC8/i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "VideoPlayerPlugin"

    .line 6
    .line 7
    const-string v1, "Detached from the engine before registering to it."

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lhd/q;->b:LC8/i;

    .line 13
    .line 14
    iget-object p1, p1, Lqc/a;->c:Luc/f;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/consent_sdk/a;->I(Luc/f;Lhd/q;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lhd/q;->b:LC8/i;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    :goto_0
    iget-object v0, p0, Lhd/q;->a:Landroid/util/LongSparseArray;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/util/LongSparseArray;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-ge p1, v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Landroid/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lhd/o;

    .line 39
    .line 40
    invoke-virtual {v0}, Lhd/o;->b()V

    .line 41
    .line 42
    .line 43
    add-int/lit8 p1, p1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {v0}, Landroid/util/LongSparseArray;->clear()V

    .line 47
    .line 48
    .line 49
    return-void
.end method
