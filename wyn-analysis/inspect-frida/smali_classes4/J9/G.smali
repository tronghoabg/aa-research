.class public final LJ9/G;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:Ljava/util/HashMap;

.field public static final i:Ljava/util/HashMap;


# instance fields
.field public final a:LB8/b;

.field public final b:Ls8/g;

.field public final c:LP9/d;

.field public final d:LM9/a;

.field public final e:Lw8/d;

.field public final f:LJ9/j;

.field public final g:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ9/G;->h:Ljava/util/HashMap;

    .line 7
    .line 8
    new-instance v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, LJ9/G;->i:Ljava/util/HashMap;

    .line 14
    .line 15
    sget-object v2, Lz9/D;->a:Lz9/D;

    .line 16
    .line 17
    sget-object v3, Lz9/Z;->b:Lz9/Z;

    .line 18
    .line 19
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object v2, Lz9/D;->b:Lz9/D;

    .line 23
    .line 24
    sget-object v3, Lz9/Z;->c:Lz9/Z;

    .line 25
    .line 26
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    sget-object v2, Lz9/D;->c:Lz9/D;

    .line 30
    .line 31
    sget-object v3, Lz9/Z;->d:Lz9/Z;

    .line 32
    .line 33
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    sget-object v2, Lz9/D;->d:Lz9/D;

    .line 37
    .line 38
    sget-object v3, Lz9/Z;->e:Lz9/Z;

    .line 39
    .line 40
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    sget-object v0, Lz9/C;->b:Lz9/C;

    .line 44
    .line 45
    sget-object v2, Lz9/r;->c:Lz9/r;

    .line 46
    .line 47
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    sget-object v0, Lz9/C;->c:Lz9/C;

    .line 51
    .line 52
    sget-object v2, Lz9/r;->d:Lz9/r;

    .line 53
    .line 54
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    sget-object v0, Lz9/C;->d:Lz9/C;

    .line 58
    .line 59
    sget-object v2, Lz9/r;->e:Lz9/r;

    .line 60
    .line 61
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    sget-object v0, Lz9/C;->a:Lz9/C;

    .line 65
    .line 66
    sget-object v2, Lz9/r;->b:Lz9/r;

    .line 67
    .line 68
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public constructor <init>(LB8/b;Lw8/d;Ls8/g;LP9/d;LM9/a;LJ9/j;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ9/G;->a:LB8/b;

    .line 5
    .line 6
    iput-object p2, p0, LJ9/G;->e:Lw8/d;

    .line 7
    .line 8
    iput-object p3, p0, LJ9/G;->b:Ls8/g;

    .line 9
    .line 10
    iput-object p4, p0, LJ9/G;->c:LP9/d;

    .line 11
    .line 12
    iput-object p5, p0, LJ9/G;->d:LM9/a;

    .line 13
    .line 14
    iput-object p6, p0, LJ9/G;->f:LJ9/j;

    .line 15
    .line 16
    iput-object p7, p0, LJ9/G;->g:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    return-void
.end method

.method public static b(LN9/a;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, LN9/a;->a:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method


# virtual methods
.method public final a(LN9/h;Ljava/lang/String;)Lz9/b;
    .locals 4

    .line 1
    invoke-static {}, Lz9/c;->j()Lz9/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lz9/b;->f()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LJ9/G;->b:Ls8/g;

    .line 9
    .line 10
    invoke-virtual {v1}, Ls8/g;->a()V

    .line 11
    .line 12
    .line 13
    iget-object v2, v1, Ls8/g;->c:Ls8/l;

    .line 14
    .line 15
    iget-object v3, v2, Ls8/l;->e:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Lz9/b;->g(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p1, LN9/h;->b:LE5/b;

    .line 21
    .line 22
    iget-object p1, p1, LE5/b;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lz9/b;->a(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lz9/f;->d()Lz9/e;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v1}, Ls8/g;->a()V

    .line 34
    .line 35
    .line 36
    iget-object v1, v2, Ls8/l;->b:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Lz9/e;->b(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p2}, Lz9/e;->a(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p1}, Lz9/b;->b(Lz9/e;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, LJ9/G;->d:LM9/a;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 53
    .line 54
    .line 55
    move-result-wide p1

    .line 56
    invoke-virtual {v0, p1, p2}, Lz9/b;->c(J)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method

.method public final c(LN9/h;Ljava/lang/String;Z)V
    .locals 6

    .line 1
    iget-object p1, p1, LN9/h;->b:LE5/b;

    .line 2
    .line 3
    iget-object v0, p1, LE5/b;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/lang/String;

    .line 6
    .line 7
    iget-object p1, p1, LE5/b;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    new-instance v1, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v2, "_nmid"

    .line 17
    .line 18
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v2, "_nmn"

    .line 22
    .line 23
    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :try_start_0
    iget-object p1, p0, LJ9/G;->d:LM9/a;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    const-wide/16 v4, 0x3e8

    .line 36
    .line 37
    div-long/2addr v2, v4

    .line 38
    long-to-int p1, v2

    .line 39
    const-string v2, "_ndt"

    .line 40
    .line 41
    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception p1

    .line 46
    new-instance v2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v3, "Error while parsing use_device_time in FIAM event: "

    .line 49
    .line 50
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1}, Lic/d;->G(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v2, "Sending event="

    .line 70
    .line 71
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v2, " params="

    .line 78
    .line 79
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {p1}, Lic/d;->E(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, LJ9/G;->e:Lw8/d;

    .line 93
    .line 94
    if-eqz p1, :cond_0

    .line 95
    .line 96
    const-string v2, "fiam"

    .line 97
    .line 98
    invoke-interface {p1, v2, p2, v1}, Lw8/d;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 99
    .line 100
    .line 101
    if-eqz p3, :cond_1

    .line 102
    .line 103
    const-string p2, "fiam:"

    .line 104
    .line 105
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-interface {p1, v2, p2}, Lw8/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_0
    const-string p1, "Unable to log event: analytics library is missing"

    .line 114
    .line 115
    invoke-static {p1}, Lic/d;->G(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_1
    :goto_1
    return-void
.end method
