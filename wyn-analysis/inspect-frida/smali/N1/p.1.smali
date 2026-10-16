.class public final LN1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Landroid/net/Uri;

.field public c:Ljava/lang/String;

.field public d:LJ5/n;

.field public e:Lza/a;

.field public f:Ljava/util/List;

.field public g:Ll8/K;

.field public h:Ljava/lang/String;

.field public i:J

.field public j:LN1/z;

.field public k:LE5/Y;

.field public l:LN1/u;


# virtual methods
.method public final a()LN1/w;
    .locals 12

    .line 1
    iget-object v0, p0, LN1/p;->e:Lza/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, LN1/p;->b:Landroid/net/Uri;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    new-instance v1, LN1/t;

    .line 12
    .line 13
    iget-object v3, p0, LN1/p;->c:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v0, p0, LN1/p;->e:Lza/a;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v6, p0, LN1/p;->g:Ll8/K;

    .line 21
    .line 22
    iget-object v7, p0, LN1/p;->h:Ljava/lang/String;

    .line 23
    .line 24
    iget-wide v8, p0, LN1/p;->i:J

    .line 25
    .line 26
    iget-object v5, p0, LN1/p;->f:Ljava/util/List;

    .line 27
    .line 28
    invoke-direct/range {v1 .. v9}, LN1/t;-><init>(Landroid/net/Uri;Ljava/lang/String;Lic/d;Ljava/util/List;Ll8/K;Ljava/lang/String;J)V

    .line 29
    .line 30
    .line 31
    move-object v8, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v8, v4

    .line 34
    :goto_0
    new-instance v5, LN1/w;

    .line 35
    .line 36
    iget-object v0, p0, LN1/p;->a:Ljava/lang/String;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    :goto_1
    move-object v6, v0

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const-string v0, ""

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :goto_2
    iget-object v0, p0, LN1/p;->d:LJ5/n;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v7, LN1/r;

    .line 51
    .line 52
    invoke-direct {v7, v0}, LN1/q;-><init>(LJ5/n;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, LN1/p;->k:LE5/Y;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance v9, LN1/s;

    .line 61
    .line 62
    invoke-direct {v9, v0}, LN1/s;-><init>(LE5/Y;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, LN1/p;->j:LN1/z;

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    :goto_3
    move-object v10, v0

    .line 70
    goto :goto_4

    .line 71
    :cond_2
    sget-object v0, LN1/z;->B:LN1/z;

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :goto_4
    iget-object v11, p0, LN1/p;->l:LN1/u;

    .line 75
    .line 76
    invoke-direct/range {v5 .. v11}, LN1/w;-><init>(Ljava/lang/String;LN1/r;LN1/t;LN1/s;LN1/z;LN1/u;)V

    .line 77
    .line 78
    .line 79
    return-object v5
.end method
