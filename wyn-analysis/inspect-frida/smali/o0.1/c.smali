.class public final Lo0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lkotlin/jvm/internal/n;

.field public b:LKd/a;

.field public c:Lo0/f;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LA0/p;

    .line 5
    .line 6
    const/16 v1, 0x1a

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, LA0/p;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lo0/c;->a:Lkotlin/jvm/internal/n;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(JJLlf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p5, Lo0/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lo0/a;

    .line 7
    .line 8
    iget v1, v0, Lo0/a;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lo0/a;->c:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lo0/a;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Lo0/a;-><init>(Lo0/c;Llf/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v6, Lo0/a;->a:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 30
    .line 31
    iget v1, v6, Lo0/a;->c:I

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    if-ne v1, v2, :cond_1

    .line 37
    .line 38
    invoke-static {p5}, LFe/e;->U(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p5}, LFe/e;->U(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lo0/c;->c:Lo0/f;

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    iput v2, v6, Lo0/a;->c:I

    .line 58
    .line 59
    move-wide v2, p1

    .line 60
    move-wide v4, p3

    .line 61
    invoke-virtual/range {v1 .. v6}, Lo0/f;->c(JJLlf/c;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p5

    .line 65
    if-ne p5, v0, :cond_3

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_3
    :goto_2
    check-cast p5, LL0/l;

    .line 69
    .line 70
    iget-wide p1, p5, LL0/l;->a:J

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    sget-wide p1, LL0/l;->b:J

    .line 74
    .line 75
    :goto_3
    new-instance p3, LL0/l;

    .line 76
    .line 77
    invoke-direct {p3, p1, p2}, LL0/l;-><init>(J)V

    .line 78
    .line 79
    .line 80
    return-object p3
.end method

.method public final b(JLlf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lo0/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lo0/b;

    .line 7
    .line 8
    iget v1, v0, Lo0/b;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lo0/b;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lo0/b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lo0/b;-><init>(Lo0/c;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lo0/b;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lo0/b;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p3, p0, Lo0/c;->c:Lo0/f;

    .line 52
    .line 53
    if-eqz p3, :cond_4

    .line 54
    .line 55
    iput v3, v0, Lo0/b;->c:I

    .line 56
    .line 57
    invoke-virtual {p3, p1, p2, v0}, Lo0/f;->f(JLlf/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    if-ne p3, v1, :cond_3

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_3
    :goto_1
    check-cast p3, LL0/l;

    .line 65
    .line 66
    iget-wide p1, p3, LL0/l;->a:J

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    sget-wide p1, LL0/l;->b:J

    .line 70
    .line 71
    :goto_2
    new-instance p3, LL0/l;

    .line 72
    .line 73
    invoke-direct {p3, p1, p2}, LL0/l;-><init>(J)V

    .line 74
    .line 75
    .line 76
    return-object p3
.end method
