.class public final LQe/e;
.super LHe/a;
.source "SourceFile"


# instance fields
.field public final a:LHe/a;

.field public final b:LLe/b;

.field public final c:LLe/a;


# direct methods
.method public constructor <init>(LHe/a;LLe/b;LLe/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQe/e;->a:LHe/a;

    .line 5
    .line 6
    iput-object p2, p0, LQe/e;->b:LLe/b;

    .line 7
    .line 8
    iput-object p3, p0, LQe/e;->c:LLe/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final e(LHe/b;)V
    .locals 1

    .line 1
    new-instance v0, LQe/d;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LQe/d;-><init>(LQe/e;LHe/b;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LQe/e;->a:LHe/a;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, LHe/a;->d(LHe/b;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
