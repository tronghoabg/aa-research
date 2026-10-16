.class public final Lq/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/ya;
.implements Lrc/b;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lx/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq/s1;->a:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lq/s1;->b:Ljava/lang/Object;

    .line 12
    .line 13
    new-instance p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lq/s1;->c:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance p1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lq/s1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    new-instance p1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lq/s1;->e:Ljava/lang/Object;

    .line 33
    .line 34
    new-instance p1, Lx/l;

    .line 35
    .line 36
    invoke-direct {p1}, Lx/l;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lq/s1;->f:Ljava/lang/Object;

    .line 40
    .line 41
    new-instance p1, Lx/l;

    .line 42
    .line 43
    invoke-direct {p1}, Lx/l;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lq/s1;->g:Ljava/lang/Object;

    .line 47
    .line 48
    return-void
.end method

.method public static g(Ljava/lang/Exception;Lyc/C;)V
    .locals 3

    .line 1
    instance-of v0, p0, Landroid/hardware/camera2/CameraAccessException;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lyc/o;

    .line 7
    .line 8
    const-string v2, "CameraAccess"

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-direct {v0, v2, p0, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v0}, Lyc/C;->c(Lyc/o;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance v0, Lyc/o;

    .line 22
    .line 23
    const-string v2, "error"

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {v0, v2, p0, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, v0}, Lyc/C;->c(Lyc/o;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static h(Ljava/lang/Exception;Lyc/D;)V
    .locals 3

    .line 1
    instance-of v0, p0, Landroid/hardware/camera2/CameraAccessException;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lyc/o;

    .line 7
    .line 8
    const-string v2, "CameraAccess"

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-direct {v0, v2, p0, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v0}, Lyc/D;->c(Lyc/o;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance v0, Lyc/o;

    .line 22
    .line 23
    const-string v2, "error"

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {v0, v2, p0, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, v0}, Lyc/D;->c(Lyc/o;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lq/s1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, Lq/s1;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LVa/Z0;

    .line 8
    .line 9
    iget-object v2, p0, Lq/s1;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, LVa/V;

    .line 12
    .line 13
    invoke-static {v2, v0, p1, v1}, LVa/V;->G(LVa/V;Landroid/content/Context;Ljava/lang/String;LVa/Z0;)LVa/B7;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    iget-object p1, p0, Lq/s1;->b:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v4, p1

    .line 20
    check-cast v4, LVa/Z0;

    .line 21
    .line 22
    iget-object p1, p0, Lq/s1;->f:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v7, p1

    .line 25
    check-cast v7, LVa/Ba;

    .line 26
    .line 27
    iget-object p1, p0, Lq/s1;->g:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v3, p1

    .line 30
    check-cast v3, LVa/V;

    .line 31
    .line 32
    iget-object p1, p0, Lq/s1;->a:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v8, p1

    .line 35
    check-cast v8, Landroid/content/Context;

    .line 36
    .line 37
    iget-object p1, p0, Lq/s1;->c:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v9, p1

    .line 40
    check-cast v9, Ljava/lang/String;

    .line 41
    .line 42
    iget-object p1, p0, Lq/s1;->d:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v10, p1

    .line 45
    check-cast v10, Ljava/lang/String;

    .line 46
    .line 47
    iget-object p1, p0, Lq/s1;->e:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v6, p1

    .line 50
    check-cast v6, LVa/r9;

    .line 51
    .line 52
    const/4 v11, 0x0

    .line 53
    invoke-static/range {v3 .. v11}, LVa/V;->N(LVa/V;LVa/Z0;LVa/B7;LVa/r9;LVa/Ba;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public b(Luc/t;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq/s1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public c(Luc/u;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq/s1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(Luc/v;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq/s1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lq/s1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx/q;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    const-string v1, "Compose:abandons"

    .line 12
    .line 13
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v0}, Lx/q;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    move-object v1, v0

    .line 21
    check-cast v1, LAf/i;

    .line 22
    .line 23
    invoke-virtual {v1}, LAf/i;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, LAf/i;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, LN/q0;

    .line 34
    .line 35
    invoke-virtual {v1}, LAf/i;->remove()V

    .line 36
    .line 37
    .line 38
    invoke-interface {v2}, LN/q0;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :cond_1
    return-void
.end method

.method public f()V
    .locals 5

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lq/s1;->k(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq/s1;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget-object v2, p0, Lq/s1;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lx/q;

    .line 17
    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    const-string v1, "Compose:onForgotten"

    .line 21
    .line 22
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    add-int/lit8 v1, v1, -0x1

    .line 30
    .line 31
    :goto_0
    const/4 v3, -0x1

    .line 32
    if-ge v3, v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    instance-of v4, v3, LN/q0;

    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lx/q;->remove(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    check-cast v3, LN/q0;

    .line 46
    .line 47
    invoke-interface {v3}, LN/q0;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto :goto_2

    .line 53
    :cond_0
    :goto_1
    add-int/lit8 v1, v1, -0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 57
    .line 58
    .line 59
    goto :goto_3

    .line 60
    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_2
    :goto_3
    iget-object v0, p0, Lq/s1;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_4

    .line 73
    .line 74
    const-string v1, "Compose:onRemembered"

    .line 75
    .line 76
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :try_start_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    const/4 v3, 0x0

    .line 84
    :goto_4
    if-ge v3, v1, :cond_3

    .line 85
    .line 86
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, LN/q0;

    .line 91
    .line 92
    invoke-virtual {v2, v4}, Lx/q;->remove(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    invoke-interface {v4}, LN/q0;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 96
    .line 97
    .line 98
    add-int/lit8 v3, v3, 0x1

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :catchall_1
    move-exception v0

    .line 102
    goto :goto_5

    .line 103
    :cond_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :goto_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 108
    .line 109
    .line 110
    throw v0

    .line 111
    :cond_4
    return-void
.end method

.method public i(Lyc/x;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lq/s1;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyc/g;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-eq p1, v2, :cond_1

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    if-ne p1, v2, :cond_0

    .line 19
    .line 20
    const/16 p1, 0x11

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "Unreachable code"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    const/16 p1, 0x100

    .line 36
    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const/16 p1, 0x23

    .line 43
    .line 44
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :goto_0
    invoke-virtual {v0, p1}, Lyc/g;->f(Ljava/lang/Integer;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catch_0
    move-exception p1

    .line 53
    new-instance v0, Lyc/o;

    .line 54
    .line 55
    const-string v2, "CameraAccessException"

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-direct {v0, v2, p1, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_3
    new-instance p1, Lyc/o;

    .line 66
    .line 67
    const-string v0, "cameraNotFound"

    .line 68
    .line 69
    const-string v2, "Camera not found. Please call the \'create\' method before calling \'initialize\'."

    .line 70
    .line 71
    invoke-direct {p1, v0, v2, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    throw p1
.end method

.method public j(Ljava/lang/String;Lyc/y;)Ljava/lang/Long;
    .locals 11

    .line 1
    iget-object v0, p0, Lq/s1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/embedding/engine/renderer/k;

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/k;->d()Lio/flutter/embedding/engine/renderer/i;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    new-instance v5, Lmd/J;

    .line 10
    .line 11
    new-instance v0, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lcom/google/android/gms/ads/nativead/l;

    .line 21
    .line 22
    iget-object v2, p0, Lq/s1;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Luc/f;

    .line 25
    .line 26
    const/16 v4, 0x1c

    .line 27
    .line 28
    invoke-direct {v1, v2, v4}, Lcom/google/android/gms/ads/nativead/l;-><init>(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lt6/q;

    .line 32
    .line 33
    iget-wide v8, v3, Lio/flutter/embedding/engine/renderer/i;->a:J

    .line 34
    .line 35
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-direct {v4, v2, v6}, Lt6/q;-><init>(Luc/f;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v5, v0, v1, v4}, Lmd/J;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v6, Lt6/q;

    .line 46
    .line 47
    const-string v0, "camera"

    .line 48
    .line 49
    iget-object v1, p0, Lq/s1;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Landroid/app/Activity;

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Landroid/hardware/camera2/CameraManager;

    .line 58
    .line 59
    invoke-direct {v6, p1, v0}, Lt6/q;-><init>(Ljava/lang/String;Landroid/hardware/camera2/CameraManager;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p2, Lyc/y;->b:Ljava/lang/Long;

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    if-nez p1, :cond_0

    .line 66
    .line 67
    move-object p1, v0

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Long;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :goto_0
    iget-object v1, p2, Lyc/y;->c:Ljava/lang/Long;

    .line 78
    .line 79
    if-nez v1, :cond_1

    .line 80
    .line 81
    move-object v1, v0

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    :goto_1
    iget-object v2, p2, Lyc/y;->d:Ljava/lang/Long;

    .line 92
    .line 93
    if-nez v2, :cond_2

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Long;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    :goto_2
    iget-object v2, p2, Lyc/y;->a:Lyc/A;

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    const/4 v4, 0x1

    .line 111
    if-eqz v2, :cond_3

    .line 112
    .line 113
    const/4 v7, 0x2

    .line 114
    if-eq v2, v4, :cond_5

    .line 115
    .line 116
    const/4 v4, 0x3

    .line 117
    if-eq v2, v7, :cond_3

    .line 118
    .line 119
    const/4 v7, 0x4

    .line 120
    if-eq v2, v4, :cond_5

    .line 121
    .line 122
    const/4 v4, 0x5

    .line 123
    if-eq v2, v7, :cond_3

    .line 124
    .line 125
    if-ne v2, v4, :cond_4

    .line 126
    .line 127
    const/4 v4, 0x6

    .line 128
    :cond_3
    move-object v2, v1

    .line 129
    goto :goto_3

    .line 130
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 131
    .line 132
    const-string p2, "Unreachable code"

    .line 133
    .line 134
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw p1

    .line 138
    :cond_5
    move-object v2, v1

    .line 139
    move v4, v7

    .line 140
    :goto_3
    new-instance v1, Lyc/g;

    .line 141
    .line 142
    move v7, v4

    .line 143
    new-instance v4, La9/b;

    .line 144
    .line 145
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 146
    .line 147
    .line 148
    move v10, v7

    .line 149
    new-instance v7, LLc/b;

    .line 150
    .line 151
    iget-object p2, p2, Lyc/y;->e:Ljava/lang/Boolean;

    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 158
    .line 159
    .line 160
    iput v10, v7, LLc/b;->b:I

    .line 161
    .line 162
    iput-boolean p2, v7, LLc/b;->a:Z

    .line 163
    .line 164
    iput-object p1, v7, LLc/b;->c:Ljava/lang/Object;

    .line 165
    .line 166
    iput-object v2, v7, LLc/b;->d:Ljava/lang/Object;

    .line 167
    .line 168
    iput-object v0, v7, LLc/b;->e:Ljava/lang/Object;

    .line 169
    .line 170
    iget-object p1, p0, Lq/s1;->a:Ljava/lang/Object;

    .line 171
    .line 172
    move-object v2, p1

    .line 173
    check-cast v2, Landroid/app/Activity;

    .line 174
    .line 175
    invoke-direct/range {v1 .. v7}, Lyc/g;-><init>(Landroid/app/Activity;Lio/flutter/embedding/engine/renderer/i;La9/b;Lmd/J;Lt6/q;LLc/b;)V

    .line 176
    .line 177
    .line 178
    iput-object v1, p0, Lq/s1;->g:Ljava/lang/Object;

    .line 179
    .line 180
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    return-object p1
.end method

.method public k(I)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lq/s1;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_7

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    move v6, v0

    .line 15
    move-object v4, v3

    .line 16
    move-object v5, v4

    .line 17
    :goto_0
    iget-object v7, p0, Lq/s1;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v7, Lx/l;

    .line 20
    .line 21
    iget v8, v7, Lx/l;->b:I

    .line 22
    .line 23
    const-string v9, "null cannot be cast to non-null type androidx.collection.MutableIntList"

    .line 24
    .line 25
    if-ge v6, v8, :cond_2

    .line 26
    .line 27
    invoke-virtual {v7, v6}, Lx/l;->b(I)I

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    if-gt p1, v8, :cond_1

    .line 32
    .line 33
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    invoke-virtual {v7, v6}, Lx/l;->c(I)I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    iget-object v10, p0, Lq/s1;->f:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v10, Lx/l;

    .line 44
    .line 45
    invoke-virtual {v10, v6}, Lx/l;->c(I)I

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    if-nez v3, :cond_0

    .line 50
    .line 51
    new-array v3, v1, [Ljava/lang/Object;

    .line 52
    .line 53
    aput-object v8, v3, v0

    .line 54
    .line 55
    invoke-static {v3}, Lr7/e;->G([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    new-instance v5, Lx/l;

    .line 60
    .line 61
    invoke-direct {v5}, Lx/l;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5, v7}, Lx/l;->a(I)V

    .line 65
    .line 66
    .line 67
    new-instance v4, Lx/l;

    .line 68
    .line 69
    invoke-direct {v4}, Lx/l;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v10}, Lx/l;->a(I)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v3, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v7}, Lx/l;->a(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, v10}, Lx/l;->a(I)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    add-int/2addr v6, v1

    .line 93
    goto :goto_0

    .line 94
    :cond_2
    if-eqz v3, :cond_7

    .line 95
    .line 96
    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    sub-int/2addr p1, v1

    .line 107
    :goto_1
    if-ge v0, p1, :cond_6

    .line 108
    .line 109
    add-int/lit8 v2, v0, 0x1

    .line 110
    .line 111
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    move v7, v2

    .line 116
    :goto_2
    if-ge v7, v6, :cond_5

    .line 117
    .line 118
    invoke-virtual {v5, v0}, Lx/l;->b(I)I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    invoke-virtual {v5, v7}, Lx/l;->b(I)I

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    if-lt v8, v9, :cond_3

    .line 127
    .line 128
    if-ne v9, v8, :cond_4

    .line 129
    .line 130
    invoke-virtual {v4, v0}, Lx/l;->b(I)I

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    invoke-virtual {v4, v7}, Lx/l;->b(I)I

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    if-ge v8, v9, :cond_4

    .line 139
    .line 140
    :cond_3
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    invoke-interface {v3, v0, v9}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    invoke-interface {v3, v7, v8}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4, v0}, Lx/l;->b(I)I

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    invoke-virtual {v4, v7}, Lx/l;->b(I)I

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    invoke-virtual {v4, v0, v9}, Lx/l;->d(II)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v7, v8}, Lx/l;->d(II)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v5, v0}, Lx/l;->b(I)I

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    invoke-virtual {v5, v7}, Lx/l;->b(I)I

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    invoke-virtual {v5, v0, v9}, Lx/l;->d(II)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v5, v7, v8}, Lx/l;->d(II)V

    .line 180
    .line 181
    .line 182
    :cond_4
    add-int/2addr v7, v1

    .line 183
    goto :goto_2

    .line 184
    :cond_5
    move v0, v2

    .line 185
    goto :goto_1

    .line 186
    :cond_6
    iget-object p1, p0, Lq/s1;->c:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast p1, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 191
    .line 192
    .line 193
    :cond_7
    return-void
.end method

.method public l(LN/q0;III)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lq/s1;->k(I)V

    .line 2
    .line 3
    .line 4
    if-ltz p4, :cond_0

    .line 5
    .line 6
    if-ge p4, p2, :cond_0

    .line 7
    .line 8
    iget-object p2, p0, Lq/s1;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p2, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lq/s1;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Lx/l;

    .line 18
    .line 19
    invoke-virtual {p1, p3}, Lx/l;->a(I)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lq/s1;->g:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Lx/l;

    .line 25
    .line 26
    invoke-virtual {p1, p4}, Lx/l;->a(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iget-object p2, p0, Lq/s1;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p2, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public m(Luc/t;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq/s1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public n(Ljava/lang/Boolean;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lq/s1;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyc/g;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lq/s1;->f:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Luc/j;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p1, v1

    .line 18
    :goto_0
    const-string v2, "videoRecordingFailed"

    .line 19
    .line 20
    iget-object v3, v0, Lyc/g;->g:Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {v3}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    :try_start_0
    const-string v4, "REC"

    .line 27
    .line 28
    const-string v5, ".mp4"

    .line 29
    .line 30
    invoke-static {v4, v5, v3}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iput-object v3, v0, Lyc/g;->w:Ljava/io/File;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    :try_start_1
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v0, v3}, Lyc/g;->g(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 42
    .line 43
    .line 44
    iget-object v3, v0, Lyc/g;->a:LJ3/g;

    .line 45
    .line 46
    iget-object v5, v0, Lyc/g;->i:Lt6/q;

    .line 47
    .line 48
    iget-object v6, v0, Lyc/g;->j:La9/b;

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance v6, LAc/a;

    .line 54
    .line 55
    const/4 v7, 0x1

    .line 56
    invoke-direct {v6, v5, v7}, LAc/a;-><init>(Lt6/q;Z)V

    .line 57
    .line 58
    .line 59
    iget-object v3, v3, LJ3/g;->a:Ljava/util/HashMap;

    .line 60
    .line 61
    const-string v5, "AUTO_FOCUS"

    .line 62
    .line 63
    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    iget-object v3, v0, Lyc/g;->i:Lt6/q;

    .line 67
    .line 68
    invoke-virtual {v0, v3}, Lyc/g;->n(Lt6/q;)V

    .line 69
    .line 70
    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    new-instance v3, LWa/d;

    .line 74
    .line 75
    const/4 v5, 0x3

    .line 76
    invoke-direct {v3, v0, v5}, LWa/d;-><init>(Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v3}, Luc/j;->a(Luc/i;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    iget-object v3, v0, Lyc/g;->i:Lt6/q;

    .line 83
    .line 84
    iget-object v3, v3, Lt6/q;->a:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v3, Landroid/hardware/camera2/CameraCharacteristics;

    .line 87
    .line 88
    sget-object v5, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 89
    .line 90
    invoke-virtual {v3, v5}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Ljava/lang/Integer;

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    iput v3, v0, Lyc/g;->d:I

    .line 101
    .line 102
    iput-boolean v7, v0, Lyc/g;->u:Z

    .line 103
    .line 104
    if-eqz p1, :cond_2

    .line 105
    .line 106
    move p1, v7

    .line 107
    goto :goto_1

    .line 108
    :cond_2
    move p1, v4

    .line 109
    :goto_1
    :try_start_2
    invoke-virtual {v0, v7, p1}, Lyc/g;->o(ZZ)V
    :try_end_2
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_2 .. :try_end_2} :catch_0

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :catch_0
    move-exception p1

    .line 114
    iput-boolean v4, v0, Lyc/g;->u:Z

    .line 115
    .line 116
    iput-object v1, v0, Lyc/g;->w:Ljava/io/File;

    .line 117
    .line 118
    new-instance v0, Lyc/o;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-direct {v0, v2, p1, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    throw v0

    .line 128
    :catch_1
    move-exception p1

    .line 129
    iput-boolean v4, v0, Lyc/g;->u:Z

    .line 130
    .line 131
    iput-object v1, v0, Lyc/g;->w:Ljava/io/File;

    .line 132
    .line 133
    new-instance v0, Lyc/o;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-direct {v0, v2, p1, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    throw v0

    .line 143
    :catch_2
    move-exception p1

    .line 144
    goto :goto_2

    .line 145
    :catch_3
    move-exception p1

    .line 146
    :goto_2
    new-instance v0, Lyc/o;

    .line 147
    .line 148
    const-string v2, "cannotCreateFile"

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-direct {v0, v2, p1, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    throw v0
.end method

.method public o()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lq/s1;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyc/g;

    .line 4
    .line 5
    iget-boolean v1, v0, Lyc/g;->u:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v1, v0, Lyc/g;->a:LJ3/g;

    .line 13
    .line 14
    iget-object v2, v0, Lyc/g;->i:Lt6/q;

    .line 15
    .line 16
    iget-object v3, v0, Lyc/g;->j:La9/b;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v3, LAc/a;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-direct {v3, v2, v4}, LAc/a;-><init>(Lt6/q;Z)V

    .line 25
    .line 26
    .line 27
    iget-object v1, v1, LJ3/g;->a:Ljava/util/HashMap;

    .line 28
    .line 29
    const-string v2, "AUTO_FOCUS"

    .line 30
    .line 31
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, Lyc/g;->a:LJ3/g;

    .line 35
    .line 36
    iget-object v2, v0, Lyc/g;->i:Lt6/q;

    .line 37
    .line 38
    new-instance v3, LGc/a;

    .line 39
    .line 40
    invoke-direct {v3, v2}, LGc/a;-><init>(Lt6/q;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, v1, LJ3/g;->a:Ljava/util/HashMap;

    .line 44
    .line 45
    const-string v2, "FPS_RANGE"

    .line 46
    .line 47
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iput-boolean v4, v0, Lyc/g;->u:Z

    .line 51
    .line 52
    :try_start_0
    invoke-virtual {v0}, Lyc/g;->b()V

    .line 53
    .line 54
    .line 55
    iget-object v1, v0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/hardware/camera2/CameraCaptureSession;->abortCaptures()V

    .line 58
    .line 59
    .line 60
    iget-object v1, v0, Lyc/g;->t:Landroid/media/MediaRecorder;

    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/media/MediaRecorder;->stop()V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    :catch_0
    iget-object v1, v0, Lyc/g;->t:Landroid/media/MediaRecorder;

    .line 66
    .line 67
    invoke-virtual {v1}, Landroid/media/MediaRecorder;->reset()V

    .line 68
    .line 69
    .line 70
    const/4 v1, 0x0

    .line 71
    :try_start_1
    invoke-virtual {v0, v1}, Lyc/g;->p(Lyc/b;)V
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 72
    .line 73
    .line 74
    iget-object v2, v0, Lyc/g;->w:Ljava/io/File;

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    iput-object v1, v0, Lyc/g;->w:Ljava/io/File;

    .line 81
    .line 82
    return-object v2

    .line 83
    :catch_1
    move-exception v0

    .line 84
    goto :goto_0

    .line 85
    :catch_2
    move-exception v0

    .line 86
    goto :goto_0

    .line 87
    :catch_3
    move-exception v0

    .line 88
    :goto_0
    new-instance v2, Lyc/o;

    .line 89
    .line 90
    const-string v3, "videoRecordingFailed"

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-direct {v2, v3, v0, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    throw v2
.end method
