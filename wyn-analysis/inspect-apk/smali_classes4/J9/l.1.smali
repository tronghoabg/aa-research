.class public final LJ9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA9/b;


# instance fields
.field public final a:LK9/a;

.field public final b:LD9/f;

.field public final c:LK9/a;

.field public final d:LK9/a;

.field public final e:LK9/a;

.field public final f:LD9/f;

.field public final g:Ldf/a;

.field public final h:LJ9/g;


# direct methods
.method public constructor <init>(LK9/a;LD9/f;LK9/a;LK9/a;LK9/a;LD9/f;Ldf/a;LJ9/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ9/l;->a:LK9/a;

    .line 5
    .line 6
    iput-object p2, p0, LJ9/l;->b:LD9/f;

    .line 7
    .line 8
    iput-object p3, p0, LJ9/l;->c:LK9/a;

    .line 9
    .line 10
    iput-object p4, p0, LJ9/l;->d:LK9/a;

    .line 11
    .line 12
    iput-object p5, p0, LJ9/l;->e:LK9/a;

    .line 13
    .line 14
    iput-object p6, p0, LJ9/l;->f:LD9/f;

    .line 15
    .line 16
    iput-object p7, p0, LJ9/l;->g:Ldf/a;

    .line 17
    .line 18
    iput-object p8, p0, LJ9/l;->h:LJ9/g;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, LJ9/l;->a:LK9/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LK9/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, LJ9/u;

    .line 9
    .line 10
    iget-object v0, p0, LJ9/l;->b:LD9/f;

    .line 11
    .line 12
    invoke-virtual {v0}, LD9/f;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v3, v0

    .line 17
    check-cast v3, LM9/a;

    .line 18
    .line 19
    iget-object v0, p0, LJ9/l;->c:LK9/a;

    .line 20
    .line 21
    invoke-virtual {v0}, LK9/a;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v4, v0

    .line 26
    check-cast v4, LJ9/X;

    .line 27
    .line 28
    iget-object v0, p0, LJ9/l;->d:LK9/a;

    .line 29
    .line 30
    invoke-virtual {v0}, LK9/a;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    move-object v5, v0

    .line 35
    check-cast v5, LJ9/V;

    .line 36
    .line 37
    iget-object v0, p0, LJ9/l;->e:LK9/a;

    .line 38
    .line 39
    invoke-virtual {v0}, LK9/a;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    move-object v6, v0

    .line 44
    check-cast v6, LJ9/f;

    .line 45
    .line 46
    iget-object v0, p0, LJ9/l;->f:LD9/f;

    .line 47
    .line 48
    invoke-virtual {v0}, LD9/f;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v7, v0

    .line 53
    check-cast v7, LN9/b;

    .line 54
    .line 55
    iget-object v0, p0, LJ9/l;->g:Ldf/a;

    .line 56
    .line 57
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    move-object v8, v0

    .line 62
    check-cast v8, LJ9/G;

    .line 63
    .line 64
    iget-object v0, p0, LJ9/l;->h:LJ9/g;

    .line 65
    .line 66
    invoke-virtual {v0}, LJ9/g;->get()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    move-object v9, v0

    .line 71
    check-cast v9, LJ9/i;

    .line 72
    .line 73
    new-instance v1, LJ9/k;

    .line 74
    .line 75
    invoke-direct/range {v1 .. v9}, LJ9/k;-><init>(LJ9/u;LM9/a;LJ9/X;LJ9/V;LJ9/f;LN9/b;LJ9/G;LJ9/i;)V

    .line 76
    .line 77
    .line 78
    return-object v1
.end method
