.class public final Lmd/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:Lmd/c;


# instance fields
.field public final a:Lmd/r;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lv9/i;

.field public final d:[[Ljava/lang/Object;

.field public final e:Ljava/util/List;

.field public final f:Ljava/lang/Boolean;

.field public final g:Ljava/lang/Integer;

.field public final h:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LR8/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    new-array v2, v1, [I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    aput v1, v2, v3

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    aput v1, v2, v1

    .line 14
    .line 15
    const-class v1, Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, [[Ljava/lang/Object;

    .line 22
    .line 23
    iput-object v1, v0, LR8/a;->d:Ljava/lang/Object;

    .line 24
    .line 25
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 26
    .line 27
    iput-object v1, v0, LR8/a;->e:Ljava/lang/Object;

    .line 28
    .line 29
    new-instance v1, Lmd/c;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Lmd/c;-><init>(LR8/a;)V

    .line 32
    .line 33
    .line 34
    sput-object v1, Lmd/c;->i:Lmd/c;

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(LR8/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LR8/a;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lmd/r;

    .line 7
    .line 8
    iput-object v0, p0, Lmd/c;->a:Lmd/r;

    .line 9
    .line 10
    iget-object v0, p1, LR8/a;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    iput-object v0, p0, Lmd/c;->b:Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    iget-object v0, p1, LR8/a;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lv9/i;

    .line 19
    .line 20
    iput-object v0, p0, Lmd/c;->c:Lv9/i;

    .line 21
    .line 22
    iget-object v0, p1, LR8/a;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, [[Ljava/lang/Object;

    .line 25
    .line 26
    iput-object v0, p0, Lmd/c;->d:[[Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v0, p1, LR8/a;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ljava/util/List;

    .line 31
    .line 32
    iput-object v0, p0, Lmd/c;->e:Ljava/util/List;

    .line 33
    .line 34
    iget-object v0, p1, LR8/a;->f:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/lang/Boolean;

    .line 37
    .line 38
    iput-object v0, p0, Lmd/c;->f:Ljava/lang/Boolean;

    .line 39
    .line 40
    iget-object v0, p1, LR8/a;->g:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/lang/Integer;

    .line 43
    .line 44
    iput-object v0, p0, Lmd/c;->g:Ljava/lang/Integer;

    .line 45
    .line 46
    iget-object p1, p1, LR8/a;->h:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Ljava/lang/Integer;

    .line 49
    .line 50
    iput-object p1, p0, Lmd/c;->h:Ljava/lang/Integer;

    .line 51
    .line 52
    return-void
.end method

.method public static b(Lmd/c;)LR8/a;
    .locals 2

    .line 1
    new-instance v0, LR8/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lmd/c;->a:Lmd/r;

    .line 7
    .line 8
    iput-object v1, v0, LR8/a;->a:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v1, p0, Lmd/c;->b:Ljava/util/concurrent/Executor;

    .line 11
    .line 12
    iput-object v1, v0, LR8/a;->b:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v1, p0, Lmd/c;->c:Lv9/i;

    .line 15
    .line 16
    iput-object v1, v0, LR8/a;->c:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v1, p0, Lmd/c;->d:[[Ljava/lang/Object;

    .line 19
    .line 20
    iput-object v1, v0, LR8/a;->d:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v1, p0, Lmd/c;->e:Ljava/util/List;

    .line 23
    .line 24
    iput-object v1, v0, LR8/a;->e:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v1, p0, Lmd/c;->f:Ljava/lang/Boolean;

    .line 27
    .line 28
    iput-object v1, v0, LR8/a;->f:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v1, p0, Lmd/c;->g:Ljava/lang/Integer;

    .line 31
    .line 32
    iput-object v1, v0, LR8/a;->g:Ljava/lang/Object;

    .line 33
    .line 34
    iget-object p0, p0, Lmd/c;->h:Ljava/lang/Integer;

    .line 35
    .line 36
    iput-object p0, v0, LR8/a;->h:Ljava/lang/Object;

    .line 37
    .line 38
    return-object v0
.end method


# virtual methods
.method public final a(LB8/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    move v1, v0

    .line 8
    :goto_0
    iget-object v2, p0, Lmd/c;->d:[[Ljava/lang/Object;

    .line 9
    .line 10
    array-length v3, v2

    .line 11
    if-ge v1, v3, :cond_1

    .line 12
    .line 13
    aget-object v3, v2, v1

    .line 14
    .line 15
    aget-object v3, v3, v0

    .line 16
    .line 17
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    aget-object p1, v2, v1

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    aget-object p1, p1, v0

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    return-object p1
.end method

.method public final c(LB8/e;Ljava/lang/Object;)Lmd/c;
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const-string v2, "key"

    .line 4
    .line 5
    invoke-static {p1, v2}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lmd/c;->b(Lmd/c;)LR8/a;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    :goto_0
    iget-object v5, p0, Lmd/c;->d:[[Ljava/lang/Object;

    .line 15
    .line 16
    array-length v6, v5

    .line 17
    const/4 v7, -0x1

    .line 18
    if-ge v4, v6, :cond_1

    .line 19
    .line 20
    aget-object v6, v5, v4

    .line 21
    .line 22
    aget-object v6, v6, v3

    .line 23
    .line 24
    invoke-virtual {p1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    add-int/2addr v4, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move v4, v7

    .line 34
    :goto_1
    array-length v6, v5

    .line 35
    if-ne v4, v7, :cond_2

    .line 36
    .line 37
    move v8, v1

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move v8, v3

    .line 40
    :goto_2
    add-int/2addr v6, v8

    .line 41
    new-array v8, v0, [I

    .line 42
    .line 43
    aput v0, v8, v1

    .line 44
    .line 45
    aput v6, v8, v3

    .line 46
    .line 47
    const-class v6, Ljava/lang/Object;

    .line 48
    .line 49
    invoke-static {v6, v8}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    check-cast v6, [[Ljava/lang/Object;

    .line 54
    .line 55
    iput-object v6, v2, LR8/a;->d:Ljava/lang/Object;

    .line 56
    .line 57
    array-length v8, v5

    .line 58
    invoke-static {v5, v3, v6, v3, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    .line 60
    .line 61
    if-ne v4, v7, :cond_3

    .line 62
    .line 63
    iget-object v4, v2, LR8/a;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v4, [[Ljava/lang/Object;

    .line 66
    .line 67
    array-length v5, v5

    .line 68
    new-array v0, v0, [Ljava/lang/Object;

    .line 69
    .line 70
    aput-object p1, v0, v3

    .line 71
    .line 72
    aput-object p2, v0, v1

    .line 73
    .line 74
    aput-object v0, v4, v5

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    iget-object v5, v2, LR8/a;->d:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v5, [[Ljava/lang/Object;

    .line 80
    .line 81
    new-array v0, v0, [Ljava/lang/Object;

    .line 82
    .line 83
    aput-object p1, v0, v3

    .line 84
    .line 85
    aput-object p2, v0, v1

    .line 86
    .line 87
    aput-object v0, v5, v4

    .line 88
    .line 89
    :goto_3
    new-instance p1, Lmd/c;

    .line 90
    .line 91
    invoke-direct {p1, v2}, Lmd/c;-><init>(LR8/a;)V

    .line 92
    .line 93
    .line 94
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, LBa/c;->S(Ljava/lang/Object;)LA7/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "deadline"

    .line 6
    .line 7
    iget-object v2, p0, Lmd/c;->a:Lmd/r;

    .line 8
    .line 9
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "authority"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "callCredentials"

    .line 19
    .line 20
    iget-object v3, p0, Lmd/c;->c:Lv9/i;

    .line 21
    .line 22
    invoke-virtual {v0, v3, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lmd/c;->b:Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v1, v2

    .line 35
    :goto_0
    const-string v3, "executor"

    .line 36
    .line 37
    invoke-virtual {v0, v1, v3}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string v1, "compressorName"

    .line 41
    .line 42
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lmd/c;->d:[[Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {v1}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v2, "customOptions"

    .line 52
    .line 53
    invoke-virtual {v0, v1, v2}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 57
    .line 58
    iget-object v2, p0, Lmd/c;->f:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    const-string v2, "waitForReady"

    .line 65
    .line 66
    invoke-virtual {v0, v2, v1}, LA7/b0;->g(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v1, "maxInboundMessageSize"

    .line 70
    .line 71
    iget-object v2, p0, Lmd/c;->g:Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v1, "maxOutboundMessageSize"

    .line 77
    .line 78
    iget-object v2, p0, Lmd/c;->h:Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string v1, "streamTracerFactories"

    .line 84
    .line 85
    iget-object v2, p0, Lmd/c;->e:Ljava/util/List;

    .line 86
    .line 87
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, LA7/b0;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    return-object v0
.end method
