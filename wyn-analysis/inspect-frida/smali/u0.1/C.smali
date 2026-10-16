.class public final Lu0/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/Q;


# instance fields
.field public final a:Landroid/view/Choreographer;


# direct methods
.method public constructor <init>(Landroid/view/Choreographer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu0/C;->a:Landroid/view/Choreographer;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d(Ltf/l;Llf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-interface {p2}, Ljf/c;->getContext()Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljf/d;->a:Ljf/d;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Lu0/B;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Lu0/B;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    new-instance v1, LEf/n;

    .line 20
    .line 21
    invoke-static {p2}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-direct {v1, v2, p2}, LEf/n;-><init>(ILjf/c;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, LEf/n;->t()V

    .line 30
    .line 31
    .line 32
    new-instance p2, LN/v;

    .line 33
    .line 34
    invoke-direct {p2, v1, p0, p1}, LN/v;-><init>(LEf/n;Lu0/C;Ltf/l;)V

    .line 35
    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object p1, v0, Lu0/B;->b:Landroid/view/Choreographer;

    .line 40
    .line 41
    iget-object v3, p0, Lu0/C;->a:Landroid/view/Choreographer;

    .line 42
    .line 43
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object p1, v0, Lu0/B;->d:Ljava/lang/Object;

    .line 50
    .line 51
    monitor-enter p1

    .line 52
    :try_start_0
    iget-object v3, v0, Lu0/B;->f:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    iget-boolean v3, v0, Lu0/B;->i:Z

    .line 58
    .line 59
    if-nez v3, :cond_1

    .line 60
    .line 61
    iput-boolean v2, v0, Lu0/B;->i:Z

    .line 62
    .line 63
    iget-object v2, v0, Lu0/B;->b:Landroid/view/Choreographer;

    .line 64
    .line 65
    iget-object v3, v0, Lu0/B;->j:Lu0/A;

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catchall_0
    move-exception p2

    .line 72
    goto :goto_2

    .line 73
    :cond_1
    :goto_1
    monitor-exit p1

    .line 74
    new-instance p1, LA/W;

    .line 75
    .line 76
    const/16 v2, 0x17

    .line 77
    .line 78
    invoke-direct {p1, v2, v0, p2}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, p1}, LEf/n;->v(Ltf/l;)V

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :goto_2
    monitor-exit p1

    .line 86
    throw p2

    .line 87
    :cond_2
    iget-object p1, p0, Lu0/C;->a:Landroid/view/Choreographer;

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 90
    .line 91
    .line 92
    new-instance p1, LA/W;

    .line 93
    .line 94
    const/16 v0, 0x18

    .line 95
    .line 96
    invoke-direct {p1, v0, p0, p2}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, p1}, LEf/n;->v(Ltf/l;)V

    .line 100
    .line 101
    .line 102
    :goto_3
    invoke-virtual {v1}, LEf/n;->s()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 107
    .line 108
    return-object p1
.end method

.method public final fold(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final get(Ljf/g;)Ljf/f;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LFe/e;->C(Ljf/f;Ljf/g;)Ljf/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final getKey()Ljf/g;
    .locals 1

    .line 1
    sget-object v0, LN/P;->b:LN/P;

    return-object v0
.end method

.method public final minusKey(Ljf/g;)Ljf/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LFe/e;->N(Ljf/f;Ljf/g;)Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final plus(Ljf/h;)Ljf/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LFe/e;->O(Ljf/f;Ljf/h;)Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
