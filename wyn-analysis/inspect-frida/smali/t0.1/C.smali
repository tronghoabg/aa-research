.class public final Lt0/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final a:Lt0/t;

.field public final b:Ls0/b;

.field public c:Lt0/C;

.field public d:Lt0/C;

.field public e:Z

.field public final f:LP/d;


# direct methods
.method public constructor <init>(Lt0/t;Ls0/b;)V
    .locals 1

    .line 1
    const-string v0, "layoutNode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "modifier"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lt0/C;->a:Lt0/t;

    .line 15
    .line 16
    iput-object p2, p0, Lt0/C;->b:Ls0/b;

    .line 17
    .line 18
    new-instance p1, LP/d;

    .line 19
    .line 20
    const/16 p2, 0x10

    .line 21
    .line 22
    new-array p2, p2, [Lt0/B;

    .line 23
    .line 24
    invoke-direct {p1, p2}, LP/d;-><init>([Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lt0/C;->f:LP/d;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lt0/C;->e:Z

    .line 3
    .line 4
    iget-object v1, p0, Lt0/C;->f:LP/d;

    .line 5
    .line 6
    iget v2, v1, LP/d;->c:I

    .line 7
    .line 8
    if-lez v2, :cond_1

    .line 9
    .line 10
    iget-object v1, v1, LP/d;->a:[Ljava/lang/Object;

    .line 11
    .line 12
    move v3, v0

    .line 13
    :cond_0
    aget-object v4, v1, v3

    .line 14
    .line 15
    check-cast v4, Lt0/B;

    .line 16
    .line 17
    sget-object v5, Lt0/B;->e:Lt0/j;

    .line 18
    .line 19
    iget-object v6, v4, Lt0/B;->b:Ls0/a;

    .line 20
    .line 21
    invoke-interface {v6, v5}, Ls0/a;->o(Ls0/c;)V

    .line 22
    .line 23
    .line 24
    iput-boolean v0, v4, Lt0/B;->d:Z

    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    if-lt v3, v2, :cond_0

    .line 29
    .line 30
    :cond_1
    iget-object v1, p0, Lt0/C;->b:Ls0/b;

    .line 31
    .line 32
    invoke-interface {v1}, Ls0/b;->getKey()La2/v;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p0, v1, v0}, Lt0/C;->c(La2/v;Z)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final b(La2/v;)Ls0/b;
    .locals 2

    .line 1
    const-string v0, "local"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt0/C;->b:Ls0/b;

    .line 7
    .line 8
    invoke-interface {v0}, Ls0/b;->getKey()La2/v;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    iget-object v0, p0, Lt0/C;->d:Lt0/C;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lt0/C;->b(La2/v;)Ls0/b;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-object v0

    .line 31
    :cond_2
    :goto_0
    iget-object v0, p0, Lt0/C;->a:Lt0/t;

    .line 32
    .line 33
    invoke-virtual {v0}, Lt0/t;->j()Lt0/t;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    iget-object v0, v0, Lt0/t;->D:Lt0/C;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lt0/C;->b(La2/v;)Ls0/b;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_3
    const/4 p1, 0x0

    .line 49
    return-object p1
.end method

.method public final c(La2/v;Z)V
    .locals 5

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Lt0/C;->b:Ls0/b;

    .line 4
    .line 5
    invoke-interface {p2}, Ls0/b;->getKey()La2/v;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-object p2, p0, Lt0/C;->f:LP/d;

    .line 17
    .line 18
    iget v0, p2, LP/d;->c:I

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-lez v0, :cond_3

    .line 22
    .line 23
    iget-object p2, p2, LP/d;->a:[Ljava/lang/Object;

    .line 24
    .line 25
    move v2, v1

    .line 26
    :cond_1
    aget-object v3, p2, v2

    .line 27
    .line 28
    check-cast v3, Lt0/B;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const-string v4, "local"

    .line 34
    .line 35
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v4, v3, Lt0/B;->c:LP/d;

    .line 39
    .line 40
    invoke-virtual {v4, p1}, LP/d;->f(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    iget-object v4, v3, Lt0/B;->a:Lt0/C;

    .line 47
    .line 48
    iget-object v4, v4, Lt0/C;->a:Lt0/t;

    .line 49
    .line 50
    iget-object v4, v4, Lt0/t;->g:Lu0/n;

    .line 51
    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    invoke-virtual {v4, v3}, Lu0/n;->r(Ltf/a;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    if-lt v2, v0, :cond_1

    .line 60
    .line 61
    :cond_3
    iget-object p2, p0, Lt0/C;->c:Lt0/C;

    .line 62
    .line 63
    const/4 v0, 0x1

    .line 64
    if-eqz p2, :cond_4

    .line 65
    .line 66
    invoke-virtual {p2, p1, v0}, Lt0/C;->c(La2/v;Z)V

    .line 67
    .line 68
    .line 69
    sget-object p2, Lef/C;->a:Lef/C;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    const/4 p2, 0x0

    .line 73
    :goto_0
    if-nez p2, :cond_6

    .line 74
    .line 75
    iget-object p2, p0, Lt0/C;->a:Lt0/t;

    .line 76
    .line 77
    invoke-virtual {p2}, Lt0/t;->l()LP/d;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    iget v2, p2, LP/d;->c:I

    .line 82
    .line 83
    if-lez v2, :cond_6

    .line 84
    .line 85
    iget-object p2, p2, LP/d;->a:[Ljava/lang/Object;

    .line 86
    .line 87
    :cond_5
    aget-object v3, p2, v1

    .line 88
    .line 89
    check-cast v3, Lt0/t;

    .line 90
    .line 91
    iget-object v3, v3, Lt0/t;->C:Lt0/C;

    .line 92
    .line 93
    invoke-virtual {v3, p1, v0}, Lt0/C;->c(La2/v;Z)V

    .line 94
    .line 95
    .line 96
    add-int/lit8 v1, v1, 0x1

    .line 97
    .line 98
    if-lt v1, v2, :cond_5

    .line 99
    .line 100
    :cond_6
    :goto_1
    return-void
.end method

.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lt0/C;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lt0/C;->b:Ls0/b;

    .line 6
    .line 7
    invoke-interface {v0}, Ls0/b;->getKey()La2/v;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p0, v0, v1}, Lt0/C;->c(La2/v;Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    sget-object v0, Lef/C;->a:Lef/C;

    .line 16
    .line 17
    return-object v0
.end method
