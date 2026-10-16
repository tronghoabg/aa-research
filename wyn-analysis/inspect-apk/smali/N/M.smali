.class public final LN/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/q0;


# instance fields
.field public final a:Ltf/p;

.field public final b:LKd/a;

.field public c:LEf/H0;


# direct methods
.method public constructor <init>(Ljf/h;Ltf/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LN/M;->a:Ltf/p;

    .line 5
    .line 6
    invoke-static {p1}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, LN/M;->b:LKd/a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, LN/M;->c:LEf/H0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const-string v2, "Old job was still running!"

    .line 7
    .line 8
    invoke-static {v0, v2, v1}, LEf/H;->k(LEf/m0;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x3

    .line 12
    iget-object v2, p0, LN/M;->a:Ltf/p;

    .line 13
    .line 14
    iget-object v3, p0, LN/M;->b:LKd/a;

    .line 15
    .line 16
    invoke-static {v3, v1, v2, v0}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, LN/M;->c:LEf/H0;

    .line 21
    .line 22
    return-void
.end method

.method public final j()V
    .locals 2

    .line 1
    iget-object v0, p0, LN/M;->c:LEf/H0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LN/O;

    .line 6
    .line 7
    invoke-direct {v1}, LN/O;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, LEf/z0;->r(Ljava/util/concurrent/CancellationException;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, LN/M;->c:LEf/H0;

    .line 15
    .line 16
    return-void
.end method

.method public final k()V
    .locals 2

    .line 1
    iget-object v0, p0, LN/M;->c:LEf/H0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LN/O;

    .line 6
    .line 7
    invoke-direct {v1}, LN/O;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, LEf/z0;->r(Ljava/util/concurrent/CancellationException;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, LN/M;->c:LEf/H0;

    .line 15
    .line 16
    return-void
.end method
