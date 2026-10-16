.class public final LRe/h;
.super LRe/a;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final d:I

.field public final e:I

.field public final f:LLe/c;


# direct methods
.method public constructor <init>(LRe/B;LJ9/w;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LRe/h;->c:I

    .line 5
    invoke-direct {p0, p1}, LRe/a;-><init>(LHe/c;)V

    .line 6
    iput-object p2, p0, LRe/h;->f:LLe/c;

    const/4 p1, 0x2

    .line 7
    iput p1, p0, LRe/h;->d:I

    const/4 p1, 0x1

    .line 8
    iput p1, p0, LRe/h;->e:I

    return-void
.end method

.method public constructor <init>(LRe/m;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LRe/h;->c:I

    sget-object v0, LNe/b;->a:Lza/a;

    .line 1
    invoke-direct {p0, p1}, LRe/a;-><init>(LHe/c;)V

    .line 2
    iput-object v0, p0, LRe/h;->f:LLe/c;

    const/4 p1, 0x3

    .line 3
    iput p1, p0, LRe/h;->d:I

    .line 4
    iput p2, p0, LRe/h;->e:I

    return-void
.end method


# virtual methods
.method public final e(LHe/f;)V
    .locals 6

    .line 1
    iget v0, p0, LRe/h;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LRe/a;->b:LHe/c;

    .line 7
    .line 8
    iget-object v1, p0, LRe/h;->f:LLe/c;

    .line 9
    .line 10
    check-cast v1, Lza/a;

    .line 11
    .line 12
    invoke-static {v0, p1, v1}, Lxg/g;->b0(Lug/a;LHe/f;LLe/c;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v2, LRe/z;

    .line 20
    .line 21
    iget v3, p0, LRe/h;->d:I

    .line 22
    .line 23
    iget v4, p0, LRe/h;->e:I

    .line 24
    .line 25
    invoke-direct {v2, p1, v1, v3, v4}, LRe/z;-><init>(LHe/f;Lza/a;II)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, LHe/c;->d(LHe/f;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    return-void

    .line 32
    :pswitch_0
    iget-object v0, p0, LRe/a;->b:LHe/c;

    .line 33
    .line 34
    iget-object v1, p0, LRe/h;->f:LLe/c;

    .line 35
    .line 36
    check-cast v1, LJ9/w;

    .line 37
    .line 38
    invoke-static {v0, p1, v1}, Lxg/g;->b0(Lug/a;LHe/f;LLe/c;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    iget v2, p0, LRe/h;->e:I

    .line 46
    .line 47
    invoke-static {v2}, LA/f;->f(I)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    iget v3, p0, LRe/h;->d:I

    .line 52
    .line 53
    const/4 v4, 0x1

    .line 54
    if-eq v2, v4, :cond_3

    .line 55
    .line 56
    const/4 v5, 0x2

    .line 57
    if-eq v2, v5, :cond_2

    .line 58
    .line 59
    new-instance v2, LRe/d;

    .line 60
    .line 61
    invoke-direct {v2, p1, v1, v3}, LRe/d;-><init>(LHe/f;LJ9/w;I)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    new-instance v2, LRe/c;

    .line 66
    .line 67
    invoke-direct {v2, p1, v1, v3, v4}, LRe/c;-><init>(LHe/f;LJ9/w;IZ)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    new-instance v2, LRe/c;

    .line 72
    .line 73
    const/4 v4, 0x0

    .line 74
    invoke-direct {v2, p1, v1, v3, v4}, LRe/c;-><init>(LHe/f;LJ9/w;IZ)V

    .line 75
    .line 76
    .line 77
    :goto_1
    invoke-virtual {v0, v2}, LHe/c;->a(LHe/f;)V

    .line 78
    .line 79
    .line 80
    :goto_2
    return-void

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
