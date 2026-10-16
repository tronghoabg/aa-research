.class public final LS3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/K0;
.implements Lcom/google/android/gms/internal/ads/zzbjx;
.implements Lf6/D;
.implements LI5/g;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LA/M;LA/O;Ltf/l;Ltf/l;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS3/i;->d:Ljava/lang/Object;

    .line 42
    iput-object p2, p0, LS3/i;->a:Ljava/lang/Object;

    .line 43
    check-cast p3, Lkotlin/jvm/internal/n;

    iput-object p3, p0, LS3/i;->b:Ljava/lang/Object;

    .line 44
    check-cast p4, Lkotlin/jvm/internal/n;

    iput-object p4, p0, LS3/i;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LG6/U;Lcom/google/android/gms/internal/ads/zzbjy;Landroid/os/Bundle;Landroid/content/Context;Landroid/net/Uri;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LS3/i;->a:Ljava/lang/Object;

    iput-object p3, p0, LS3/i;->b:Ljava/lang/Object;

    iput-object p4, p0, LS3/i;->c:Ljava/lang/Object;

    iput-object p5, p0, LS3/i;->d:Ljava/lang/Object;

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LVa/x;Lorg/json/JSONArray;Ljava/util/ArrayList;LVa/p;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS3/i;->d:Ljava/lang/Object;

    iput-object p2, p0, LS3/i;->a:Ljava/lang/Object;

    iput-object p3, p0, LS3/i;->b:Ljava/lang/Object;

    iput-object p4, p0, LS3/i;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, LS3/i;->b:Ljava/lang/Object;

    .line 20
    iput-object p2, p0, LS3/i;->a:Ljava/lang/Object;

    .line 21
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LS3/i;->c:Ljava/lang/Object;

    .line 22
    new-instance p1, Lx/v;

    const/4 p2, 0x0

    .line 23
    invoke-direct {p1, p2}, Lx/v;-><init>(I)V

    .line 24
    iput-object p1, p0, LS3/i;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, LS3/i;->a:Ljava/lang/Object;

    .line 9
    new-instance v0, LS3/b;

    const/4 v1, 0x2

    .line 10
    invoke-direct {v0, p1, v1}, LS3/b;-><init>(Lk3/m;I)V

    .line 11
    iput-object v0, p0, LS3/i;->b:Ljava/lang/Object;

    .line 12
    new-instance v0, LS3/h;

    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, p1, v1}, LS3/h;-><init>(Lk3/m;I)V

    .line 14
    iput-object v0, p0, LS3/i;->c:Ljava/lang/Object;

    .line 15
    new-instance v0, LS3/h;

    const/4 v1, 0x1

    .line 16
    invoke-direct {v0, p1, v1}, LS3/h;-><init>(Lk3/m;I)V

    .line 17
    iput-object v0, p0, LS3/i;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/moloco/sdk/acm/db/e;Lad/r;LC6/l;Lb7/k;)V
    .locals 1

    const-string v0, "metricsDAO"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestScheduler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationLifecycle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS3/i;->a:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, LS3/i;->b:Ljava/lang/Object;

    .line 5
    iput-object p3, p0, LS3/i;->c:Ljava/lang/Object;

    .line 6
    iput-object p4, p0, LS3/i;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf6/i;Ljava/lang/Object;)V
    .locals 4

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS3/i;->d:Ljava/lang/Object;

    .line 26
    new-instance v0, LI5/f;

    .line 27
    iget-object v1, p1, Lf6/a;->c:LI5/f;

    iget-object v1, v1, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 28
    invoke-direct {v0, v1, v2, v3}, LI5/f;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILf6/z;)V

    .line 29
    iput-object v0, p0, LS3/i;->b:Ljava/lang/Object;

    .line 30
    new-instance v0, LI5/f;

    .line 31
    iget-object p1, p1, Lf6/a;->d:LI5/f;

    iget-object p1, p1, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 32
    invoke-direct {v0, p1, v2, v3}, LI5/f;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILf6/z;)V

    .line 33
    iput-object v0, p0, LS3/i;->c:Ljava/lang/Object;

    .line 34
    iput-object p2, p0, LS3/i;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, LS3/i;->a:Ljava/lang/Object;

    iput-object p2, p0, LS3/i;->b:Ljava/lang/Object;

    iput-object p3, p0, LS3/i;->c:Ljava/lang/Object;

    iput-object p4, p0, LS3/i;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ltc/l;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, LS3/i;->a:Ljava/lang/Object;

    .line 38
    iput-object p2, p0, LS3/i;->b:Ljava/lang/Object;

    .line 39
    iput-object p3, p0, LS3/i;->d:Ljava/lang/Object;

    .line 40
    iput-object p4, p0, LS3/i;->c:Ljava/lang/Object;

    return-void
.end method

.method public static final a(LS3/i;Ljava/lang/String;Lcom/moloco/sdk/acm/db/b;JLjava/util/ArrayList;Llf/j;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, LEf/S;->a:LLf/e;

    .line 5
    .line 6
    sget-object v0, LLf/d;->b:LLf/d;

    .line 7
    .line 8
    new-instance v1, Lcom/moloco/sdk/acm/eventprocessing/d;

    .line 9
    .line 10
    const/4 v8, 0x0

    .line 11
    move-object v3, p0

    .line 12
    move-object v2, p1

    .line 13
    move-object v4, p2

    .line 14
    move-wide v5, p3

    .line 15
    move-object v7, p5

    .line 16
    invoke-direct/range {v1 .. v8}, Lcom/moloco/sdk/acm/eventprocessing/d;-><init>(Ljava/lang/String;LS3/i;Lcom/moloco/sdk/acm/db/b;JLjava/util/ArrayList;Ljf/c;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1, p6}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 24
    .line 25
    if-ne p0, p1, :cond_0

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    sget-object p0, Lef/C;->a:Lef/C;

    .line 29
    .line 30
    return-object p0
.end method


# virtual methods
.method public A(ILf6/z;Lf6/p;Lf6/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LS3/i;->e(ILf6/z;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LS3/i;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LI5/f;

    .line 10
    .line 11
    invoke-virtual {p0, p4}, LS3/i;->f(Lf6/u;)Lf6/u;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p1, p3, p2}, LI5/f;->c(Lf6/p;Lf6/u;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public C(ILf6/z;Lf6/p;Lf6/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LS3/i;->e(ILf6/z;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LS3/i;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LI5/f;

    .line 10
    .line 11
    invoke-virtual {p0, p4}, LS3/i;->f(Lf6/u;)Lf6/u;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p1, p3, p2}, LI5/f;->d(Lf6/p;Lf6/u;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public D(ILf6/z;Lf6/p;Lf6/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LS3/i;->e(ILf6/z;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LS3/i;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LI5/f;

    .line 10
    .line 11
    invoke-virtual {p0, p4}, LS3/i;->f(Lf6/u;)Lf6/u;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p1, p3, p2}, LI5/f;->f(Lf6/p;Lf6/u;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public H(ILf6/z;Lf6/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LS3/i;->e(ILf6/z;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LS3/i;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LI5/f;

    .line 10
    .line 11
    invoke-virtual {p0, p3}, LS3/i;->f(Lf6/u;)Lf6/u;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p1, p2}, LI5/f;->b(Lf6/u;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public b(Lo/a;)Lo/f;
    .locals 5

    .line 1
    iget-object v0, p0, LS3/i;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Lo/f;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    iget-object v4, v3, Lo/f;->b:Lo/a;

    .line 21
    .line 22
    if-ne v4, p1, :cond_0

    .line 23
    .line 24
    return-object v3

    .line 25
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    new-instance v1, Lo/f;

    .line 29
    .line 30
    iget-object v2, p0, LS3/i;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Landroid/content/Context;

    .line 33
    .line 34
    invoke-direct {v1, v2, p1}, Lo/f;-><init>(Landroid/content/Context;Lo/a;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    return-object v1
.end method

.method public c(LS3/j;)LS3/g;
    .locals 6

    .line 1
    const-string v0, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v1, v0}, Lk3/q;->d(ILjava/lang/String;)Lk3/q;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v2, p1, LS3/j;->a:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Lk3/q;->N(I)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0, v3, v2}, Lk3/q;->x(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iget p1, p1, LS3/j;->b:I

    .line 21
    .line 22
    int-to-long v2, p1

    .line 23
    invoke-virtual {v0, v1, v2, v3}, Lk3/q;->G(IJ)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, LS3/i;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Landroidx/work/impl/WorkDatabase_Impl;

    .line 29
    .line 30
    invoke-virtual {p1}, Lk3/m;->b()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lk3/m;->l(Lo3/f;)Landroid/database/Cursor;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :try_start_0
    const-string v1, "work_spec_id"

    .line 38
    .line 39
    invoke-static {p1, v1}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const-string v2, "generation"

    .line 44
    .line 45
    invoke-static {p1, v2}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const-string v3, "system_id"

    .line 50
    .line 51
    invoke-static {p1, v3}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const/4 v5, 0x0

    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    invoke-interface {p1, v1}, Landroid/database/Cursor;->isNull(I)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    :goto_1
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    new-instance v3, LS3/g;

    .line 82
    .line 83
    invoke-direct {v3, v5, v1, v2}, LS3/g;-><init>(Ljava/lang/String;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    .line 86
    move-object v5, v3

    .line 87
    goto :goto_2

    .line 88
    :catchall_0
    move-exception v1

    .line 89
    goto :goto_3

    .line 90
    :cond_2
    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Lk3/q;->h()V

    .line 94
    .line 95
    .line 96
    return-object v5

    .line 97
    :goto_3
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lk3/q;->h()V

    .line 101
    .line 102
    .line 103
    throw v1
.end method

.method public d(LS3/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, LS3/i;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Lk3/m;->b()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lk3/m;->c()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object v1, p0, LS3/i;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, LS3/b;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lk3/e;->x(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lk3/m;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lk3/m;->j()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    invoke-virtual {v0}, Lk3/m;->j()V

    .line 27
    .line 28
    .line 29
    throw p1
.end method

.method public e(ILf6/z;)Z
    .locals 3

    .line 1
    iget-object v0, p0, LS3/i;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lf6/i;

    .line 4
    .line 5
    iget-object v1, p0, LS3/i;->a:Ljava/lang/Object;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1, p2}, Lf6/i;->r(Ljava/lang/Object;Lf6/z;)Lf6/z;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p2, 0x0

    .line 18
    :cond_1
    invoke-virtual {v0, p1, v1}, Lf6/i;->t(ILjava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object v1, p0, LS3/i;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, LI5/f;

    .line 25
    .line 26
    iget v2, v1, LI5/f;->a:I

    .line 27
    .line 28
    if-ne v2, p1, :cond_2

    .line 29
    .line 30
    iget-object v1, v1, LI5/f;->b:Lf6/z;

    .line 31
    .line 32
    invoke-static {v1, p2}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    :cond_2
    new-instance v1, LI5/f;

    .line 39
    .line 40
    iget-object v2, v0, Lf6/a;->c:LI5/f;

    .line 41
    .line 42
    iget-object v2, v2, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 43
    .line 44
    invoke-direct {v1, v2, p1, p2}, LI5/f;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILf6/z;)V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, LS3/i;->b:Ljava/lang/Object;

    .line 48
    .line 49
    :cond_3
    iget-object v1, p0, LS3/i;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, LI5/f;

    .line 52
    .line 53
    iget v2, v1, LI5/f;->a:I

    .line 54
    .line 55
    if-ne v2, p1, :cond_4

    .line 56
    .line 57
    iget-object v1, v1, LI5/f;->b:Lf6/z;

    .line 58
    .line 59
    invoke-static {v1, p2}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_5

    .line 64
    .line 65
    :cond_4
    new-instance v1, LI5/f;

    .line 66
    .line 67
    iget-object v0, v0, Lf6/a;->d:LI5/f;

    .line 68
    .line 69
    iget-object v0, v0, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 70
    .line 71
    invoke-direct {v1, v0, p1, p2}, LI5/f;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILf6/z;)V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, LS3/i;->c:Ljava/lang/Object;

    .line 75
    .line 76
    :cond_5
    const/4 p1, 0x1

    .line 77
    return p1
.end method

.method public f(Lf6/u;)Lf6/u;
    .locals 12

    .line 1
    iget-object v0, p0, LS3/i;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lf6/i;

    .line 4
    .line 5
    iget-object v1, p0, LS3/i;->a:Ljava/lang/Object;

    .line 6
    .line 7
    iget-wide v2, p1, Lf6/u;->d:J

    .line 8
    .line 9
    invoke-virtual {v0, v2, v3, v1}, Lf6/i;->s(JLjava/lang/Object;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v8

    .line 13
    iget-wide v4, p1, Lf6/u;->e:J

    .line 14
    .line 15
    invoke-virtual {v0, v4, v5, v1}, Lf6/i;->s(JLjava/lang/Object;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v10

    .line 19
    cmp-long v0, v8, v2

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    cmp-long v0, v10, v4

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    new-instance v4, Lf6/u;

    .line 29
    .line 30
    iget v6, p1, Lf6/u;->b:I

    .line 31
    .line 32
    iget-object v7, p1, Lf6/u;->c:LE5/T;

    .line 33
    .line 34
    iget v5, p1, Lf6/u;->a:I

    .line 35
    .line 36
    invoke-direct/range {v4 .. v11}, Lf6/u;-><init>(IILE5/T;JJ)V

    .line 37
    .line 38
    .line 39
    return-object v4
.end method

.method public g(Lo/a;Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, LS3/i;->b(Lo/a;)Lo/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lp/r;

    .line 6
    .line 7
    iget-object v1, p0, LS3/i;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Landroid/content/Context;

    .line 10
    .line 11
    check-cast p2, Ld1/a;

    .line 12
    .line 13
    invoke-direct {v0, v1, p2}, Lp/r;-><init>(Landroid/content/Context;Ld1/a;)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, LS3/i;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Landroid/view/ActionMode$Callback;

    .line 19
    .line 20
    invoke-interface {p2, p1, v0}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LS3/i;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA/M;

    .line 4
    .line 5
    iget-object v0, v0, LA/M;->d:LA/U;

    .line 6
    .line 7
    invoke-virtual {v0}, LA/U;->c()LA/N;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, LS3/i;->i(LA/N;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LS3/i;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LA/O;

    .line 17
    .line 18
    iget-object v0, v0, LA/O;->h:LN/Y;

    .line 19
    .line 20
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public h(Lo/a;Lp/k;)Z
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, LS3/i;->b(Lo/a;)Lo/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, LS3/i;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lx/v;

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Landroid/view/Menu;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Lp/A;

    .line 18
    .line 19
    iget-object v2, p0, LS3/i;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Landroid/content/Context;

    .line 22
    .line 23
    invoke-direct {v1, v2, p2}, Lp/A;-><init>(Landroid/content/Context;Lp/k;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2, v1}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object p2, p0, LS3/i;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p2, Landroid/view/ActionMode$Callback;

    .line 32
    .line 33
    invoke-interface {p2, p1, v1}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1
.end method

.method public i(LA/N;)V
    .locals 4

    .line 1
    const-string v0, "segment"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LS3/i;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lkotlin/jvm/internal/n;

    .line 9
    .line 10
    iget-object v1, p1, LA/N;->b:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-interface {v0, v1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, LS3/i;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, LA/M;

    .line 19
    .line 20
    iget-object v1, v1, LA/M;->d:LA/U;

    .line 21
    .line 22
    invoke-virtual {v1}, LA/U;->d()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    iget-object v2, p0, LS3/i;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, LA/O;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iget-object v1, p0, LS3/i;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lkotlin/jvm/internal/n;

    .line 35
    .line 36
    iget-object v3, p1, LA/N;->a:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-interface {v1, v3}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v3, p0, LS3/i;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Lkotlin/jvm/internal/n;

    .line 45
    .line 46
    invoke-interface {v3, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, LA/u;

    .line 51
    .line 52
    invoke-virtual {v2, v1, v0, p1}, LA/O;->d(Ljava/lang/Object;Ljava/lang/Object;LA/u;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    iget-object v1, p0, LS3/i;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Lkotlin/jvm/internal/n;

    .line 59
    .line 60
    invoke-interface {v1, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, LA/u;

    .line 65
    .line 66
    invoke-virtual {v2, v0, p1}, LA/O;->e(Ljava/lang/Object;LA/u;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public o(ILf6/z;Lf6/p;Lf6/u;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LS3/i;->e(ILf6/z;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LS3/i;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LI5/f;

    .line 10
    .line 11
    invoke-virtual {p0, p4}, LS3/i;->f(Lf6/u;)Lf6/u;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p1, p3, p2, p5, p6}, LI5/f;->e(Lf6/p;Lf6/u;Ljava/io/IOException;Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public zza()V
    .locals 5

    .line 1
    iget-object v0, p0, LS3/i;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/ads/zzbjy;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbjy;->zzc()Lu/n;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lp9/C;

    .line 10
    .line 11
    invoke-direct {v2, v1}, Lp9/C;-><init>(Lu/n;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LS3/i;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Landroid/os/Bundle;

    .line 17
    .line 18
    invoke-static {v2, v1}, LG6/U;->z(Lp9/C;Landroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Lp9/C;->b()Lu/k;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, LS3/i;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Landroid/content/Context;

    .line 28
    .line 29
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzinp;->zza(Landroid/content/Context;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object v4, v1, Lu/k;->a:Landroid/content/Intent;

    .line 34
    .line 35
    invoke-virtual {v4, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    iget-object v3, p0, LS3/i;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, Landroid/net/Uri;

    .line 41
    .line 42
    invoke-virtual {v1, v2, v3}, Lu/k;->a(Landroid/content/Context;Landroid/net/Uri;)V

    .line 43
    .line 44
    .line 45
    check-cast v2, Landroid/app/Activity;

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzbjy;->zzb(Landroid/app/Activity;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method
