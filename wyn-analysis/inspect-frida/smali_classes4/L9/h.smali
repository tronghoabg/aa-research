.class public final LL9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA9/b;


# instance fields
.field public final a:LL9/b;

.field public final b:LA9/c;

.field public final c:LK9/a;

.field public final d:LL9/b;

.field public final e:LK9/a;

.field public final f:LK9/a;


# direct methods
.method public constructor <init>(LL9/b;LA9/c;LK9/a;LL9/b;LD9/f;LK9/a;LK9/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL9/h;->a:LL9/b;

    .line 5
    .line 6
    iput-object p2, p0, LL9/h;->b:LA9/c;

    .line 7
    .line 8
    iput-object p3, p0, LL9/h;->c:LK9/a;

    .line 9
    .line 10
    iput-object p4, p0, LL9/h;->d:LL9/b;

    .line 11
    .line 12
    iput-object p6, p0, LL9/h;->e:LK9/a;

    .line 13
    .line 14
    iput-object p7, p0, LL9/h;->f:LK9/a;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, LL9/h;->a:LL9/b;

    .line 2
    .line 3
    iget-object v0, v0, LL9/b;->b:LDd/c;

    .line 4
    .line 5
    iget-object v0, v0, LDd/c;->b:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v4, v0

    .line 8
    check-cast v4, Ls8/g;

    .line 9
    .line 10
    iget-object v0, p0, LL9/h;->b:LA9/c;

    .line 11
    .line 12
    iget-object v0, v0, LA9/c;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lq5/g;

    .line 15
    .line 16
    iget-object v1, p0, LL9/h;->c:LK9/a;

    .line 17
    .line 18
    invoke-virtual {v1}, LK9/a;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    move-object v3, v1

    .line 23
    check-cast v3, Lw8/d;

    .line 24
    .line 25
    iget-object v1, p0, LL9/h;->d:LL9/b;

    .line 26
    .line 27
    invoke-virtual {v1}, LL9/b;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object v5, v1

    .line 32
    check-cast v5, LP9/d;

    .line 33
    .line 34
    new-instance v6, LM9/a;

    .line 35
    .line 36
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, LL9/h;->e:LK9/a;

    .line 40
    .line 41
    invoke-virtual {v1}, LK9/a;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    move-object v7, v1

    .line 46
    check-cast v7, LJ9/j;

    .line 47
    .line 48
    iget-object v1, p0, LL9/h;->f:LK9/a;

    .line 49
    .line 50
    invoke-virtual {v1}, LK9/a;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    move-object v8, v1

    .line 55
    check-cast v8, Ljava/util/concurrent/Executor;

    .line 56
    .line 57
    new-instance v1, LJ9/x;

    .line 58
    .line 59
    const/16 v2, 0x8

    .line 60
    .line 61
    invoke-direct {v1, v2}, LJ9/x;-><init>(I)V

    .line 62
    .line 63
    .line 64
    check-cast v0, Lt5/p;

    .line 65
    .line 66
    new-instance v2, Lq5/c;

    .line 67
    .line 68
    const-string v9, "proto"

    .line 69
    .line 70
    invoke-direct {v2, v9}, Lq5/c;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v9, "FIREBASE_INAPPMESSAGING"

    .line 74
    .line 75
    invoke-virtual {v0, v9, v2, v1}, Lt5/p;->a(Ljava/lang/String;Lq5/c;Lq5/f;)Lt5/q;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    new-instance v1, LJ9/G;

    .line 80
    .line 81
    new-instance v2, LB8/b;

    .line 82
    .line 83
    const/16 v9, 0x14

    .line 84
    .line 85
    invoke-direct {v2, v0, v9}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 86
    .line 87
    .line 88
    invoke-direct/range {v1 .. v8}, LJ9/G;-><init>(LB8/b;Lw8/d;Ls8/g;LP9/d;LM9/a;LJ9/j;Ljava/util/concurrent/Executor;)V

    .line 89
    .line 90
    .line 91
    return-object v1
.end method
