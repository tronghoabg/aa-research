.class public final LTe/l;
.super LHe/a;
.source "SourceFile"

# interfaces
.implements LOe/b;


# instance fields
.field public final a:LTe/c;

.field public final b:LJ9/U;


# direct methods
.method public constructor <init>(LTe/c;LJ9/U;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LTe/l;->a:LTe/c;

    .line 5
    .line 6
    iput-object p2, p0, LTe/l;->b:LJ9/U;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()LHe/i;
    .locals 4

    .line 1
    new-instance v0, LTe/c;

    .line 2
    .line 3
    iget-object v1, p0, LTe/l;->b:LJ9/U;

    .line 4
    .line 5
    iget-object v2, p0, LTe/l;->a:LTe/c;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    invoke-direct {v0, v2, v1, v3}, LTe/c;-><init>(LHe/i;Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final e(LHe/b;)V
    .locals 2

    .line 1
    new-instance v0, LTe/k;

    .line 2
    .line 3
    iget-object v1, p0, LTe/l;->b:LJ9/U;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, LTe/k;-><init>(LHe/b;LJ9/U;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LTe/l;->a:LTe/c;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, LHe/i;->c(LHe/j;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
