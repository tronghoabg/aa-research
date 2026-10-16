.class public final LTe/n;
.super LHe/i;
.source "SourceFile"

# interfaces
.implements LOe/f;


# instance fields
.field public final a:LJ9/O;


# direct methods
.method public constructor <init>(LJ9/O;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LTe/n;->a:LJ9/O;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LTe/n;->a:LJ9/O;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(LHe/j;)V
    .locals 2

    .line 1
    new-instance v0, LTe/o;

    .line 2
    .line 3
    iget-object v1, p0, LTe/n;->a:LJ9/O;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, LTe/o;-><init>(LHe/j;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, v0}, LHe/j;->a(LJe/b;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LTe/o;->run()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
