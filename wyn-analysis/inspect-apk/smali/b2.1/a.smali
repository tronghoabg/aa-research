.class public final Lb2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb2/q;


# instance fields
.field public final synthetic a:Lb2/c;


# direct methods
.method public constructor <init>(Lb2/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb2/a;->a:Lb2/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Landroid/net/Uri;LA/x;Z)Z
    .locals 9

    .line 1
    const/4 p3, 0x1

    .line 2
    iget-object v0, p0, Lb2/a;->a:Lb2/c;

    .line 3
    .line 4
    iget-object v1, v0, Lb2/c;->l:Lb2/i;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v1, :cond_2

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    iget-object v1, v0, Lb2/c;->j:Lb2/l;

    .line 14
    .line 15
    sget v5, LQ1/x;->a:I

    .line 16
    .line 17
    iget-object v1, v1, Lb2/l;->e:Ljava/util/List;

    .line 18
    .line 19
    move v5, v2

    .line 20
    move v6, v5

    .line 21
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    iget-object v8, v0, Lb2/c;->d:Ljava/util/HashMap;

    .line 26
    .line 27
    if-ge v5, v7, :cond_1

    .line 28
    .line 29
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    check-cast v7, Lb2/k;

    .line 34
    .line 35
    iget-object v7, v7, Lb2/k;->a:Landroid/net/Uri;

    .line 36
    .line 37
    invoke-virtual {v8, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    check-cast v7, Lb2/b;

    .line 42
    .line 43
    if-eqz v7, :cond_0

    .line 44
    .line 45
    iget-wide v7, v7, Lb2/b;->h:J

    .line 46
    .line 47
    cmp-long v7, v3, v7

    .line 48
    .line 49
    if-gez v7, :cond_0

    .line 50
    .line 51
    add-int/2addr v6, p3

    .line 52
    :cond_0
    add-int/2addr v5, p3

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    new-instance v1, LF6/p;

    .line 55
    .line 56
    iget-object v3, v0, Lb2/c;->j:Lb2/l;

    .line 57
    .line 58
    iget-object v3, v3, Lb2/l;->e:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    invoke-direct {v1, p3, v2, v3, v6}, LF6/p;-><init>(IIII)V

    .line 65
    .line 66
    .line 67
    iget-object p3, v0, Lb2/c;->c:Lae/d;

    .line 68
    .line 69
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {v1, p2}, Lae/d;->f(LF6/p;LA/x;)LU5/f;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    if-eqz p2, :cond_2

    .line 77
    .line 78
    iget p3, p2, LU5/f;->a:I

    .line 79
    .line 80
    const/4 v0, 0x2

    .line 81
    if-ne p3, v0, :cond_2

    .line 82
    .line 83
    invoke-virtual {v8, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Lb2/b;

    .line 88
    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    iget-wide p2, p2, LU5/f;->b:J

    .line 92
    .line 93
    invoke-static {p1, p2, p3}, Lb2/b;->a(Lb2/b;J)Z

    .line 94
    .line 95
    .line 96
    :cond_2
    return v2
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb2/a;->a:Lb2/c;

    .line 2
    .line 3
    iget-object v0, v0, Lb2/c;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method
