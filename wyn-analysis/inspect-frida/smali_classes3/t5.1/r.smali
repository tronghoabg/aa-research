.class public final Lt5/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile e:Lt5/j;


# instance fields
.field public final a:LC5/a;

.field public final b:LC5/a;

.field public final c:Ly5/c;

.field public final d:Lz5/f;


# direct methods
.method public constructor <init>(LC5/a;LC5/a;Ly5/c;Lz5/f;Lz5/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt5/r;->a:LC5/a;

    .line 5
    .line 6
    iput-object p2, p0, Lt5/r;->b:LC5/a;

    .line 7
    .line 8
    iput-object p3, p0, Lt5/r;->c:Ly5/c;

    .line 9
    .line 10
    iput-object p4, p0, Lt5/r;->d:Lz5/f;

    .line 11
    .line 12
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p1, Lkd/c;

    .line 16
    .line 17
    const/16 p2, 0x1d

    .line 18
    .line 19
    invoke-direct {p1, p5, p2}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    iget-object p2, p5, Lz5/h;->a:Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static a()Lt5/r;
    .locals 2

    .line 1
    sget-object v0, Lt5/r;->e:Lt5/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lt5/j;->f:Ldf/a;

    .line 6
    .line 7
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lt5/r;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v1, "Not initialized!"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, Lt5/r;->e:Lt5/j;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lt5/r;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lt5/r;->e:Lt5/j;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, LG4/c;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iput-object p0, v1, LG4/c;->a:Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {v1}, LG4/c;->c()Lt5/j;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sput-object p0, Lt5/r;->e:Lt5/j;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw p0

    .line 35
    :cond_1
    return-void
.end method


# virtual methods
.method public final c(Lr5/a;)Lt5/p;
    .locals 6

    .line 1
    new-instance v0, Lt5/p;

    .line 2
    .line 3
    instance-of v1, p1, Lt5/k;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v1, Lr5/a;->d:Ljava/util/Set;

    .line 11
    .line 12
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v1, Lq5/c;

    .line 18
    .line 19
    const-string v2, "proto"

    .line 20
    .line 21
    invoke-direct {v1, v2}, Lq5/c;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :goto_0
    invoke-static {}, Lt5/i;->a()Lne/a;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const-string v3, "cct"

    .line 36
    .line 37
    iput-object v3, v2, Lne/a;->a:Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v3, p1, Lr5/a;->a:Ljava/lang/String;

    .line 40
    .line 41
    iget-object p1, p1, Lr5/a;->b:Ljava/lang/String;

    .line 42
    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    if-nez p1, :cond_2

    .line 50
    .line 51
    const-string p1, ""

    .line 52
    .line 53
    :cond_2
    const-string v4, "1$"

    .line 54
    .line 55
    const-string v5, "\\"

    .line 56
    .line 57
    invoke-static {v4, v3, v5, p1}, LN0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string v3, "UTF-8"

    .line 62
    .line 63
    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {p1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    :goto_1
    iput-object p1, v2, Lne/a;->b:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-virtual {v2}, Lne/a;->c()Lt5/i;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {v0, v1, p1, p0}, Lt5/p;-><init>(Ljava/util/Set;Lt5/i;Lt5/r;)V

    .line 78
    .line 79
    .line 80
    return-object v0
.end method
