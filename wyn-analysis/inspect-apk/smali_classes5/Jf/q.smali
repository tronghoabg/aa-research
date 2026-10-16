.class public LJf/q;
.super LEf/a;
.source "SourceFile"

# interfaces
.implements Llf/d;


# instance fields
.field public final d:Ljf/c;


# direct methods
.method public constructor <init>(Ljf/c;Ljf/h;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p2, v0}, LEf/a;-><init>(Ljf/h;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, LJf/q;->d:Ljf/c;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final J()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public b0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final getCallerFrame()Llf/d;
    .locals 2

    .line 1
    iget-object v0, p0, LJf/q;->d:Ljf/c;

    .line 2
    .line 3
    instance-of v1, v0, Llf/d;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Llf/d;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public k(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJf/q;->d:Ljf/c;

    .line 2
    .line 3
    invoke-static {v0}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, LEf/H;->G(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1, v0}, LJf/b;->h(Ljava/lang/Object;Ljf/c;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public l(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJf/q;->d:Ljf/c;

    .line 2
    .line 3
    invoke-static {p1}, LEf/H;->G(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ljf/c;->resumeWith(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
