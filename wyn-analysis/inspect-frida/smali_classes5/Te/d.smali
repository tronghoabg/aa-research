.class public final LTe/d;
.super LHe/n;
.source "SourceFile"

# interfaces
.implements LOe/b;


# instance fields
.field public final a:LTe/c;

.field public final b:LNe/a;


# direct methods
.method public constructor <init>(LTe/c;LNe/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LTe/d;->a:LTe/c;

    .line 5
    .line 6
    iput-object p2, p0, LTe/d;->b:LNe/a;

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
    iget-object v1, p0, LTe/d;->a:LTe/c;

    .line 4
    .line 5
    iget-object v2, p0, LTe/d;->b:LNe/a;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, LTe/c;-><init>(LHe/i;Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final c(LHe/o;)V
    .locals 3

    .line 1
    new-instance v0, LTe/b;

    .line 2
    .line 3
    iget-object v1, p0, LTe/d;->b:LNe/a;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, p1, v1, v2}, LTe/b;-><init>(Ljava/lang/Object;LNe/a;I)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, LTe/d;->a:LTe/c;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, LHe/i;->c(LHe/j;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
