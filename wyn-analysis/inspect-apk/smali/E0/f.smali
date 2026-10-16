.class public final LE0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE0/e;


# instance fields
.field public final a:LE0/a;

.field public final b:LE0/b;

.field public final c:LS3/c;

.field public final d:LE0/i;

.field public final e:Lxa/d;

.field public final f:LB/F;


# direct methods
.method public constructor <init>(LE0/a;LE0/b;)V
    .locals 5

    .line 1
    sget-object v0, LE0/g;->a:LS3/c;

    .line 2
    .line 3
    new-instance v1, LE0/i;

    .line 4
    .line 5
    sget-object v2, LE0/g;->b:LVa/ka;

    .line 6
    .line 7
    sget-object v3, Ljf/i;->a:Ljf/i;

    .line 8
    .line 9
    const-string v4, "asyncTypefaceCache"

    .line 10
    .line 11
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    sget-object v2, LE0/i;->a:LE0/h;

    .line 18
    .line 19
    invoke-interface {v2, v3}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v3, LEf/I0;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-direct {v3, v4}, LEf/o0;-><init>(LEf/m0;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v2, v3}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v2}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 34
    .line 35
    .line 36
    new-instance v2, Lxa/d;

    .line 37
    .line 38
    const/4 v3, 0x6

    .line 39
    invoke-direct {v2, v3}, Lxa/d;-><init>(I)V

    .line 40
    .line 41
    .line 42
    const-string v3, "typefaceRequestCache"

    .line 43
    .line 44
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, LE0/f;->a:LE0/a;

    .line 51
    .line 52
    iput-object p2, p0, LE0/f;->b:LE0/b;

    .line 53
    .line 54
    iput-object v0, p0, LE0/f;->c:LS3/c;

    .line 55
    .line 56
    iput-object v1, p0, LE0/f;->d:LE0/i;

    .line 57
    .line 58
    iput-object v2, p0, LE0/f;->e:Lxa/d;

    .line 59
    .line 60
    new-instance p1, LB/F;

    .line 61
    .line 62
    const/4 p2, 0x1

    .line 63
    invoke-direct {p1, p0, p2}, LB/F;-><init>(Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, LE0/f;->f:LB/F;

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final a(LE0/p;)LE0/q;
    .locals 5

    .line 1
    iget-object v0, p0, LE0/f;->c:LS3/c;

    .line 2
    .line 3
    new-instance v1, LA/W;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    invoke-direct {v1, v2, p0, p1}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, LS3/c;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lc8/e;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    iget-object v3, v0, LS3/c;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, LD0/b;

    .line 20
    .line 21
    invoke-virtual {v3, p1}, LD0/b;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, LE0/q;

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    iget-boolean v4, v3, LE0/q;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    monitor-exit v2

    .line 34
    return-object v3

    .line 35
    :cond_0
    :try_start_1
    iget-object v3, v0, LS3/c;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, LD0/b;

    .line 38
    .line 39
    invoke-virtual {v3, p1}, LD0/b;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, LE0/q;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_3

    .line 48
    :cond_1
    :goto_0
    monitor-exit v2

    .line 49
    :try_start_2
    new-instance v2, LA/W;

    .line 50
    .line 51
    const/4 v3, 0x7

    .line 52
    invoke-direct {v2, v3, v0, p1}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2}, LA/W;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, LE0/q;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 60
    .line 61
    iget-object v2, v0, LS3/c;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Lc8/e;

    .line 64
    .line 65
    monitor-enter v2

    .line 66
    :try_start_3
    iget-object v3, v0, LS3/c;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v3, LD0/b;

    .line 69
    .line 70
    invoke-virtual {v3, p1}, LD0/b;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    if-nez v3, :cond_2

    .line 75
    .line 76
    iget-boolean v3, v1, LE0/q;->b:Z

    .line 77
    .line 78
    if-eqz v3, :cond_2

    .line 79
    .line 80
    iget-object v0, v0, LS3/c;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, LD0/b;

    .line 83
    .line 84
    invoke-virtual {v0, p1, v1}, LD0/b;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catchall_1
    move-exception p1

    .line 89
    goto :goto_2

    .line 90
    :cond_2
    :goto_1
    monitor-exit v2

    .line 91
    return-object v1

    .line 92
    :goto_2
    monitor-exit v2

    .line 93
    throw p1

    .line 94
    :catch_0
    move-exception p1

    .line 95
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 96
    .line 97
    const-string v1, "Could not load font"

    .line 98
    .line 99
    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    throw v0

    .line 103
    :goto_3
    monitor-exit v2

    .line 104
    throw p1
.end method

.method public final b(LE0/o;LE0/l;II)LE0/q;
    .locals 7

    .line 1
    const-string v0, "fontWeight"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LE0/p;

    .line 7
    .line 8
    iget-object v0, p0, LE0/f;->b:LE0/b;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v2, "fontWeight"

    .line 14
    .line 15
    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget v0, v0, LE0/b;->a:I

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const v2, 0x7fffffff

    .line 23
    .line 24
    .line 25
    if-ne v0, v2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget p2, p2, LE0/l;->a:I

    .line 29
    .line 30
    add-int/2addr p2, v0

    .line 31
    const/4 v0, 0x1

    .line 32
    const/16 v2, 0x3e8

    .line 33
    .line 34
    invoke-static {p2, v0, v2}, Landroid/support/v4/media/session/b;->S(III)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    new-instance v0, LE0/l;

    .line 39
    .line 40
    invoke-direct {v0, p2}, LE0/l;-><init>(I)V

    .line 41
    .line 42
    .line 43
    move-object v3, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    :goto_0
    move-object v3, p2

    .line 46
    :goto_1
    iget-object p2, p0, LE0/f;->a:LE0/a;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    move-object v2, p1

    .line 53
    move v4, p3

    .line 54
    move v5, p4

    .line 55
    invoke-direct/range {v1 .. v6}, LE0/p;-><init>(LE0/o;LE0/l;IILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v1}, LE0/f;->a(LE0/p;)LE0/q;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
.end method
