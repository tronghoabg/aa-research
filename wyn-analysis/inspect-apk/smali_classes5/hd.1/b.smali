.class public final Lhd/b;
.super LJ8/a;
.source "SourceFile"


# instance fields
.field public final b:I

.field public final c:Ljava/util/HashMap;

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/util/HashMap;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LJ8/a;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lhd/b;->b:I

    .line 5
    .line 6
    iput-object p3, p0, Lhd/b;->c:Ljava/util/HashMap;

    .line 7
    .line 8
    iput-object p4, p0, Lhd/b;->d:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b()LN1/w;
    .locals 15

    .line 1
    new-instance v0, LJ5/n;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, LJ5/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lza/a;

    .line 8
    .line 9
    invoke-direct {v1}, Lza/a;-><init>()V

    .line 10
    .line 11
    .line 12
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 13
    .line 14
    sget-object v7, Ll8/e0;->e:Ll8/e0;

    .line 15
    .line 16
    new-instance v1, LE5/Y;

    .line 17
    .line 18
    invoke-direct {v1}, LE5/Y;-><init>()V

    .line 19
    .line 20
    .line 21
    sget-object v14, LN1/u;->a:LN1/u;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    iget-object v3, p0, LJ8/a;->a:Ljava/lang/String;

    .line 25
    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    move-object v3, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    :goto_0
    iget v4, p0, Lhd/b;->b:I

    .line 35
    .line 36
    invoke-static {v4}, LA/f;->f(I)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v5, 0x1

    .line 41
    if-eq v4, v5, :cond_3

    .line 42
    .line 43
    const/4 v5, 0x2

    .line 44
    if-eq v4, v5, :cond_2

    .line 45
    .line 46
    const/4 v5, 0x3

    .line 47
    if-eq v4, v5, :cond_1

    .line 48
    .line 49
    move-object v4, v2

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string v4, "application/x-mpegURL"

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    const-string v4, "application/dash+xml"

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    const-string v4, "application/vnd.ms-sstr+xml"

    .line 58
    .line 59
    :goto_1
    if-eqz v4, :cond_4

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    move-object v4, v2

    .line 63
    :goto_2
    const/4 v5, 0x0

    .line 64
    if-eqz v3, :cond_5

    .line 65
    .line 66
    new-instance v2, LN1/t;

    .line 67
    .line 68
    const/4 v8, 0x0

    .line 69
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    invoke-direct/range {v2 .. v10}, LN1/t;-><init>(Landroid/net/Uri;Ljava/lang/String;Lic/d;Ljava/util/List;Ll8/K;Ljava/lang/String;J)V

    .line 75
    .line 76
    .line 77
    move-object v11, v2

    .line 78
    goto :goto_3

    .line 79
    :cond_5
    move-object v11, v5

    .line 80
    :goto_3
    new-instance v8, LN1/w;

    .line 81
    .line 82
    new-instance v10, LN1/r;

    .line 83
    .line 84
    invoke-direct {v10, v0}, LN1/q;-><init>(LJ5/n;)V

    .line 85
    .line 86
    .line 87
    new-instance v12, LN1/s;

    .line 88
    .line 89
    invoke-direct {v12, v1}, LN1/s;-><init>(LE5/Y;)V

    .line 90
    .line 91
    .line 92
    sget-object v13, LN1/z;->B:LN1/z;

    .line 93
    .line 94
    const-string v9, ""

    .line 95
    .line 96
    invoke-direct/range {v8 .. v14}, LN1/w;-><init>(Ljava/lang/String;LN1/r;LN1/t;LN1/s;LN1/z;LN1/u;)V

    .line 97
    .line 98
    .line 99
    return-object v8
.end method

.method public final c(Landroid/content/Context;)Lk2/G;
    .locals 3

    .line 1
    new-instance v0, LN2/e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LN2/e;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lhd/b;->d:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v1, v0, LN2/e;->f:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, v0, LN2/e;->d:Z

    .line 13
    .line 14
    iget-object v1, p0, Lhd/b;->c:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v1}, LN2/e;->e(Ljava/util/HashMap;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    new-instance v1, LS3/c;

    .line 26
    .line 27
    invoke-direct {v1, p1, v0}, LS3/c;-><init>(Landroid/content/Context;LN2/e;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lk2/v;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Lk2/v;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, v0, Lk2/v;->b:LS3/c;

    .line 36
    .line 37
    iget-object p1, v0, Lk2/v;->a:LF6/r;

    .line 38
    .line 39
    iget-object v2, p1, LF6/r;->f:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, LS3/c;

    .line 42
    .line 43
    if-eq v1, v2, :cond_1

    .line 44
    .line 45
    iput-object v1, p1, LF6/r;->f:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object v1, p1, LF6/r;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 52
    .line 53
    .line 54
    iget-object p1, p1, LF6/r;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-object v0
.end method
