.class public final Lvd/d;
.super Lvd/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public final synthetic c:Lmd/O;


# direct methods
.method public constructor <init>(Lvd/e;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lvd/d;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvd/d;->c:Lmd/O;

    return-void
.end method

.method public constructor <init>(Lvd/r;Lmd/y;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lvd/d;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lvd/d;->c:Lmd/O;

    .line 5
    new-instance p1, Lvd/h;

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lvd/h;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lvd/d;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b(LDd/c;)Lmd/e;
    .locals 5

    .line 1
    iget v0, p0, Lvd/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lvd/a;->b(LDd/c;)Lmd/e;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    new-instance v0, Lvd/q;

    .line 12
    .line 13
    iget-object v1, p0, Lvd/d;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lvd/h;

    .line 16
    .line 17
    iget-object v2, p0, Lvd/d;->c:Lmd/O;

    .line 18
    .line 19
    check-cast v2, Lvd/r;

    .line 20
    .line 21
    invoke-direct {v0, v2, p1, v1}, Lvd/q;-><init>(Lvd/r;LDd/c;Lvd/h;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p1, LDd/c;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/List;

    .line 27
    .line 28
    invoke-static {p1}, Lvd/r;->g(Ljava/util/List;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    iget-object v1, v2, Lvd/r;->f:LS1/n;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Lmd/u;

    .line 42
    .line 43
    iget-object v4, v4, Lmd/u;->a:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v1, v4}, LS1/n;->containsKey(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lmd/u;

    .line 60
    .line 61
    iget-object p1, p1, Lmd/u;->a:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget-object v1, v2, Lvd/r;->f:LS1/n;

    .line 68
    .line 69
    invoke-virtual {v1, p1}, LS1/n;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Lvd/k;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Lvd/k;->a(Lvd/q;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p1, Lvd/k;->d:Ljava/lang/Long;

    .line 79
    .line 80
    if-eqz p1, :cond_0

    .line 81
    .line 82
    invoke-virtual {v0}, Lvd/q;->t()V

    .line 83
    .line 84
    .line 85
    :cond_0
    return-object v0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final l(Lmd/m;Lmd/M;)V
    .locals 5

    .line 1
    iget v0, p0, Lvd/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lvd/d;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lvd/h;

    .line 9
    .line 10
    new-instance v1, Lod/k1;

    .line 11
    .line 12
    invoke-direct {v1, p2}, Lod/k1;-><init>(Lmd/M;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1, v1}, Lvd/a;->l(Lmd/m;Lmd/M;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iget-object v0, p0, Lvd/d;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lmd/O;

    .line 22
    .line 23
    iget-object v1, p0, Lvd/d;->c:Lmd/O;

    .line 24
    .line 25
    check-cast v1, Lvd/e;

    .line 26
    .line 27
    iget-object v2, v1, Lvd/e;->k:Lmd/O;

    .line 28
    .line 29
    sget-object v3, Lmd/m;->b:Lmd/m;

    .line 30
    .line 31
    if-ne v0, v2, :cond_0

    .line 32
    .line 33
    iget-boolean v0, v1, Lvd/e;->n:Z

    .line 34
    .line 35
    const-string v2, "there\'s pending lb while current lb has been out of READY"

    .line 36
    .line 37
    invoke-static {v2, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    iput-object p1, v1, Lvd/e;->l:Lmd/m;

    .line 41
    .line 42
    iput-object p2, v1, Lvd/e;->m:Lmd/M;

    .line 43
    .line 44
    if-ne p1, v3, :cond_3

    .line 45
    .line 46
    invoke-virtual {v1}, Lvd/e;->h()V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    iget-object v4, v1, Lvd/e;->i:Lmd/O;

    .line 51
    .line 52
    if-ne v0, v4, :cond_3

    .line 53
    .line 54
    if-ne p1, v3, :cond_1

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 v0, 0x0

    .line 59
    :goto_0
    iput-boolean v0, v1, Lvd/e;->n:Z

    .line 60
    .line 61
    if-nez v0, :cond_2

    .line 62
    .line 63
    iget-object v0, v1, Lvd/e;->f:Lvd/c;

    .line 64
    .line 65
    if-eq v2, v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {v1}, Lvd/e;->h()V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    iget-object v0, v1, Lvd/e;->g:Lvd/a;

    .line 72
    .line 73
    invoke-virtual {v0, p1, p2}, Lvd/a;->l(Lmd/m;Lmd/M;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_1
    return-void

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m()Lmd/y;
    .locals 1

    .line 1
    iget v0, p0, Lvd/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lvd/d;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lvd/h;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lvd/d;->c:Lmd/O;

    .line 12
    .line 13
    check-cast v0, Lvd/e;

    .line 14
    .line 15
    iget-object v0, v0, Lvd/e;->g:Lvd/a;

    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
