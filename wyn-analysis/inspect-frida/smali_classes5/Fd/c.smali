.class public final LFd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJd/r;


# instance fields
.field public final a:LJd/B;

.field public b:LJd/s;

.field public final c:LJd/n;

.field public d:Ljava/lang/Object;

.field public e:LEf/I0;

.field public final f:LNd/d;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LJd/B;

    .line 5
    .line 6
    invoke-direct {v0}, LJd/B;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LFd/c;->a:LJd/B;

    .line 10
    .line 11
    sget-object v0, LJd/s;->b:LJd/s;

    .line 12
    .line 13
    iput-object v0, p0, LFd/c;->b:LJd/s;

    .line 14
    .line 15
    new-instance v0, LJd/n;

    .line 16
    .line 17
    const/16 v1, 0x8

    .line 18
    .line 19
    invoke-direct {v0, v1}, LA7/B0;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, LFd/c;->c:LJd/n;

    .line 23
    .line 24
    sget-object v0, LHd/b;->a:LHd/b;

    .line 25
    .line 26
    iput-object v0, p0, LFd/c;->d:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {}, LEf/H;->f()LEf/I0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, LFd/c;->e:LEf/I0;

    .line 33
    .line 34
    new-instance v0, LNd/d;

    .line 35
    .line 36
    invoke-direct {v0}, LNd/d;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, LFd/c;->f:LNd/d;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final a()LJd/n;
    .locals 1

    .line 1
    iget-object v0, p0, LFd/c;->c:LJd/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(LSd/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, LFd/c;->f:LNd/d;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sget-object v1, LFd/h;->a:LNd/a;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, LNd/d;->e(LNd/a;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget-object p1, LFd/h;->a:LNd/a;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string v1, "key"

    .line 17
    .line 18
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, LNd/d;->c()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final c(LJd/s;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LFd/c;->b:LJd/s;

    .line 7
    .line 8
    return-void
.end method

.method public final d(LFd/c;)V
    .locals 4

    .line 1
    const-string v0, "builder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LFd/c;->b:LJd/s;

    .line 7
    .line 8
    iput-object v0, p0, LFd/c;->b:LJd/s;

    .line 9
    .line 10
    iget-object v0, p1, LFd/c;->d:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object v0, p0, LFd/c;->d:Ljava/lang/Object;

    .line 13
    .line 14
    sget-object v0, LFd/h;->a:LNd/a;

    .line 15
    .line 16
    iget-object v1, p1, LFd/c;->f:LNd/d;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, LNd/d;->d(LNd/a;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, LSd/a;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, LFd/c;->b(LSd/a;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, LFd/c;->a:LJd/B;

    .line 28
    .line 29
    iget-object v2, p1, LFd/c;->a:LJd/B;

    .line 30
    .line 31
    invoke-static {v0, v2}, Lxg/g;->U(LJd/B;LJd/B;)V

    .line 32
    .line 33
    .line 34
    iget-object v2, v0, LJd/B;->h:Ljava/util/List;

    .line 35
    .line 36
    const-string v3, "<set-?>"

    .line 37
    .line 38
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iput-object v2, v0, LJd/B;->h:Ljava/util/List;

    .line 42
    .line 43
    iget-object v0, p0, LFd/c;->c:LJd/n;

    .line 44
    .line 45
    iget-object p1, p1, LFd/c;->c:LJd/n;

    .line 46
    .line 47
    invoke-static {v0, p1}, Lxg/g;->l(LNd/k;LNd/k;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, LFd/c;->f:LNd/d;

    .line 51
    .line 52
    const-string v0, "<this>"

    .line 53
    .line 54
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, LNd/d;->c()Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Ljava/lang/Iterable;

    .line 66
    .line 67
    invoke-static {v0}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Ljava/lang/Iterable;

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_0

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, LNd/a;

    .line 88
    .line 89
    const-string v3, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>"

    .line 90
    .line 91
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v2}, LNd/d;->b(LNd/a;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {p1, v2, v3}, LNd/d;->e(LNd/a;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    return-void
.end method
