.class public final LRe/t;
.super LHe/g;
.source "SourceFile"


# instance fields
.field public final a:LRe/B;


# direct methods
.method public constructor <init>(LRe/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LRe/t;->a:LRe/B;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(LHe/h;)V
    .locals 1

    .line 1
    new-instance v0, LRe/s;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LRe/s;-><init>(LHe/h;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LRe/t;->a:LRe/B;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, LHe/c;->d(LHe/f;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final e()LHe/c;
    .locals 2

    .line 1
    new-instance v0, LRe/r;

    .line 2
    .line 3
    iget-object v1, p0, LRe/t;->a:LRe/B;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LRe/a;-><init>(LHe/c;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
