.class public final Lw1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwf/b;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lac/a;

.field public final c:Ltf/l;

.field public final d:LEf/E;

.field public final e:Ljava/lang/Object;

.field public volatile f:Lx1/d;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lac/a;Ltf/l;LEf/E;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lw1/b;->a:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Lw1/b;->b:Lac/a;

    .line 12
    .line 13
    iput-object p3, p0, Lw1/b;->c:Ltf/l;

    .line 14
    .line 15
    iput-object p4, p0, Lw1/b;->d:LEf/E;

    .line 16
    .line 17
    new-instance p1, Ljava/lang/Object;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lw1/b;->e:Ljava/lang/Object;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Landroid/content/Context;

    .line 2
    .line 3
    const-string v0, "thisRef"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "property"

    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Lw1/b;->f:Lx1/d;

    .line 14
    .line 15
    if-nez p2, :cond_2

    .line 16
    .line 17
    iget-object p2, p0, Lw1/b;->e:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter p2

    .line 20
    :try_start_0
    iget-object v0, p0, Lw1/b;->f:Lx1/d;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v0, p0, Lw1/b;->b:Lac/a;

    .line 29
    .line 30
    iget-object v1, p0, Lw1/b;->c:Ltf/l;

    .line 31
    .line 32
    const-string v2, "applicationContext"

    .line 33
    .line 34
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v1, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/util/List;

    .line 42
    .line 43
    iget-object v7, p0, Lw1/b;->d:LEf/E;

    .line 44
    .line 45
    new-instance v2, LA0/e;

    .line 46
    .line 47
    const/4 v3, 0x6

    .line 48
    invoke-direct {v2, v3, p1, p0}, LA0/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const-string p1, "migrations"

    .line 52
    .line 53
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sget-object v4, Lx1/i;->a:Lx1/i;

    .line 57
    .line 58
    new-instance v3, Lt0/p;

    .line 59
    .line 60
    const/4 p1, 0x7

    .line 61
    invoke-direct {v3, v2, p1}, Lt0/p;-><init>(Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    if-nez v0, :cond_0

    .line 65
    .line 66
    new-instance v0, Lae/d;

    .line 67
    .line 68
    const/16 p1, 0xe

    .line 69
    .line 70
    invoke-direct {v0, p1}, Lae/d;-><init>(I)V

    .line 71
    .line 72
    .line 73
    :cond_0
    move-object v6, v0

    .line 74
    new-instance p1, Lu1/e;

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    invoke-direct {p1, v1, v0}, Lu1/e;-><init>(Ljava/util/List;Ljf/c;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    new-instance v2, Lu1/G;

    .line 85
    .line 86
    invoke-direct/range {v2 .. v7}, Lu1/G;-><init>(Ltf/a;Lu1/m;Ljava/util/List;Lu1/b;LEf/E;)V

    .line 87
    .line 88
    .line 89
    new-instance p1, Lx1/d;

    .line 90
    .line 91
    invoke-direct {p1, v2}, Lx1/d;-><init>(Lu1/G;)V

    .line 92
    .line 93
    .line 94
    iput-object p1, p0, Lw1/b;->f:Lx1/d;

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :catchall_0
    move-exception v0

    .line 98
    move-object p1, v0

    .line 99
    goto :goto_1

    .line 100
    :cond_1
    :goto_0
    iget-object p1, p0, Lw1/b;->f:Lx1/d;

    .line 101
    .line 102
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    .line 105
    monitor-exit p2

    .line 106
    return-object p1

    .line 107
    :goto_1
    monitor-exit p2

    .line 108
    throw p1

    .line 109
    :cond_2
    return-object p2
.end method
