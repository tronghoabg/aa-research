.class public final Lz5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/b;


# instance fields
.field public final a:LA5/e;

.field public final b:Ldf/a;

.field public final c:Ldf/a;

.field public final d:Lt5/s;

.field public final e:Ldf/a;

.field public final f:Ldf/a;

.field public final g:Ldf/a;


# direct methods
.method public constructor <init>(LA5/e;Ldf/a;Ldf/a;Lt5/s;Ldf/a;Ldf/a;Ldf/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz5/g;->a:LA5/e;

    .line 5
    .line 6
    iput-object p2, p0, Lz5/g;->b:Ldf/a;

    .line 7
    .line 8
    iput-object p3, p0, Lz5/g;->c:Ldf/a;

    .line 9
    .line 10
    iput-object p4, p0, Lz5/g;->d:Lt5/s;

    .line 11
    .line 12
    iput-object p5, p0, Lz5/g;->e:Ldf/a;

    .line 13
    .line 14
    iput-object p6, p0, Lz5/g;->f:Ldf/a;

    .line 15
    .line 16
    iput-object p7, p0, Lz5/g;->g:Ldf/a;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lz5/g;->a:LA5/e;

    .line 2
    .line 3
    iget-object v0, v0, LA5/e;->b:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v0

    .line 6
    check-cast v2, Landroid/content/Context;

    .line 7
    .line 8
    iget-object v0, p0, Lz5/g;->b:Ldf/a;

    .line 9
    .line 10
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    move-object v3, v0

    .line 15
    check-cast v3, Lu5/e;

    .line 16
    .line 17
    iget-object v0, p0, Lz5/g;->c:Ldf/a;

    .line 18
    .line 19
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    move-object v4, v0

    .line 24
    check-cast v4, LA5/d;

    .line 25
    .line 26
    iget-object v0, p0, Lz5/g;->d:Lt5/s;

    .line 27
    .line 28
    invoke-virtual {v0}, Lt5/s;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    move-object v5, v0

    .line 33
    check-cast v5, Lz5/c;

    .line 34
    .line 35
    iget-object v0, p0, Lz5/g;->e:Ldf/a;

    .line 36
    .line 37
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object v6, v0

    .line 42
    check-cast v6, Ljava/util/concurrent/Executor;

    .line 43
    .line 44
    iget-object v0, p0, Lz5/g;->f:Ldf/a;

    .line 45
    .line 46
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    move-object v7, v0

    .line 51
    check-cast v7, LB5/c;

    .line 52
    .line 53
    new-instance v8, LVa/ka;

    .line 54
    .line 55
    const/16 v0, 0xf

    .line 56
    .line 57
    invoke-direct {v8, v0}, LVa/ka;-><init>(I)V

    .line 58
    .line 59
    .line 60
    new-instance v9, Lza/a;

    .line 61
    .line 62
    const/16 v0, 0xe

    .line 63
    .line 64
    invoke-direct {v9, v0}, Lza/a;-><init>(I)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lz5/g;->g:Ldf/a;

    .line 68
    .line 69
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    move-object v10, v0

    .line 74
    check-cast v10, LA5/c;

    .line 75
    .line 76
    new-instance v1, Lz5/f;

    .line 77
    .line 78
    invoke-direct/range {v1 .. v10}, Lz5/f;-><init>(Landroid/content/Context;Lu5/e;LA5/d;Lz5/c;Ljava/util/concurrent/Executor;LB5/c;LC5/a;LC5/a;LA5/c;)V

    .line 79
    .line 80
    .line 81
    return-object v1
.end method
