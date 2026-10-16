.class public final LB9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/a;


# instance fields
.field public final a:Ldf/a;

.field public final b:LF9/a;

.field public final c:Ldf/a;

.field public final d:LF9/a;

.field public final e:LF9/a;

.field public final f:LF9/a;

.field public final g:Ldf/a;


# direct methods
.method public constructor <init>(Ldf/a;LF9/a;Ldf/a;LF9/a;LF9/a;LF9/a;Ldf/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB9/g;->a:Ldf/a;

    .line 5
    .line 6
    iput-object p2, p0, LB9/g;->b:LF9/a;

    .line 7
    .line 8
    iput-object p3, p0, LB9/g;->c:Ldf/a;

    .line 9
    .line 10
    iput-object p4, p0, LB9/g;->d:LF9/a;

    .line 11
    .line 12
    iput-object p5, p0, LB9/g;->e:LF9/a;

    .line 13
    .line 14
    iput-object p6, p0, LB9/g;->f:LF9/a;

    .line 15
    .line 16
    iput-object p7, p0, LB9/g;->g:Ldf/a;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, LB9/g;->a:Ldf/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, Lz9/B;

    .line 9
    .line 10
    iget-object v0, p0, LB9/g;->b:LF9/a;

    .line 11
    .line 12
    invoke-virtual {v0}, LF9/a;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v3, v0

    .line 17
    check-cast v3, Ljava/util/Map;

    .line 18
    .line 19
    iget-object v0, p0, LB9/g;->c:Ldf/a;

    .line 20
    .line 21
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v4, v0

    .line 26
    check-cast v4, LD9/g;

    .line 27
    .line 28
    new-instance v5, LY9/c;

    .line 29
    .line 30
    const/4 v0, 0x7

    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v5, v0, v1}, LY9/c;-><init>(IZ)V

    .line 33
    .line 34
    .line 35
    new-instance v6, LY9/c;

    .line 36
    .line 37
    const/4 v0, 0x7

    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-direct {v6, v0, v1}, LY9/c;-><init>(IZ)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, LB9/g;->d:LF9/a;

    .line 43
    .line 44
    invoke-virtual {v0}, LF9/a;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    move-object v7, v0

    .line 49
    check-cast v7, LD9/i;

    .line 50
    .line 51
    iget-object v0, p0, LB9/g;->e:LF9/a;

    .line 52
    .line 53
    invoke-virtual {v0}, LF9/a;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    move-object v8, v0

    .line 58
    check-cast v8, Landroid/app/Application;

    .line 59
    .line 60
    iget-object v0, p0, LB9/g;->f:LF9/a;

    .line 61
    .line 62
    invoke-virtual {v0}, LF9/a;->get()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move-object v9, v0

    .line 67
    check-cast v9, LD9/a;

    .line 68
    .line 69
    iget-object v0, p0, LB9/g;->g:Ldf/a;

    .line 70
    .line 71
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    move-object v10, v0

    .line 76
    check-cast v10, LD9/d;

    .line 77
    .line 78
    new-instance v1, LB9/f;

    .line 79
    .line 80
    invoke-direct/range {v1 .. v10}, LB9/f;-><init>(Lz9/B;Ljava/util/Map;LD9/g;LY9/c;LY9/c;LD9/i;Landroid/app/Application;LD9/a;LD9/d;)V

    .line 81
    .line 82
    .line 83
    return-object v1
.end method
