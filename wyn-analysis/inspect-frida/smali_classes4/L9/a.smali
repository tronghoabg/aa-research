.class public final LL9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA9/b;


# instance fields
.field public final a:LDd/c;

.field public final b:Ldf/a;

.field public final c:LK9/a;

.field public final d:LK9/a;


# direct methods
.method public constructor <init>(LDd/c;Ldf/a;LK9/a;LK9/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL9/a;->a:LDd/c;

    .line 5
    .line 6
    iput-object p2, p0, LL9/a;->b:Ldf/a;

    .line 7
    .line 8
    iput-object p3, p0, LL9/a;->c:LK9/a;

    .line 9
    .line 10
    iput-object p4, p0, LL9/a;->d:LK9/a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, LL9/a;->c:LK9/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LK9/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v4, v0

    .line 8
    check-cast v4, Landroid/app/Application;

    .line 9
    .line 10
    iget-object v0, p0, LL9/a;->d:LK9/a;

    .line 11
    .line 12
    invoke-virtual {v0}, LK9/a;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v6, v0

    .line 17
    check-cast v6, LJ9/J;

    .line 18
    .line 19
    new-instance v1, LJ9/c;

    .line 20
    .line 21
    iget-object v0, p0, LL9/a;->a:LDd/c;

    .line 22
    .line 23
    iget-object v2, v0, LDd/c;->b:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v3, v2

    .line 26
    check-cast v3, Ls8/g;

    .line 27
    .line 28
    iget-object v0, v0, LDd/c;->d:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v5, v0

    .line 31
    check-cast v5, LM9/a;

    .line 32
    .line 33
    iget-object v2, p0, LL9/a;->b:Ldf/a;

    .line 34
    .line 35
    invoke-direct/range {v1 .. v6}, LJ9/c;-><init>(Ldf/a;Ls8/g;Landroid/app/Application;LM9/a;LJ9/J;)V

    .line 36
    .line 37
    .line 38
    return-object v1
.end method
