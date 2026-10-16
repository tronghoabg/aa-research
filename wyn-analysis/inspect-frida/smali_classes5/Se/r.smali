.class public final LSe/r;
.super LSe/a;
.source "SourceFile"


# instance fields
.field public final b:LLe/b;

.field public final c:LLe/b;


# direct methods
.method public constructor <init>(LHe/g;LLe/b;LLe/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LSe/a;-><init>(LHe/g;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LSe/r;->b:LLe/b;

    .line 5
    .line 6
    iput-object p3, p0, LSe/r;->c:LLe/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(LHe/h;)V
    .locals 2

    .line 1
    new-instance v0, LQe/d;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p1, p0, v1}, LQe/d;-><init>(LHe/h;Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LSe/a;->a:LHe/g;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, LHe/g;->b(LHe/h;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
