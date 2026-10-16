.class public final LRe/M;
.super LRe/a;
.source "SourceFile"


# instance fields
.field public final c:I

.field public final d:Z

.field public final e:Lx9/d;


# direct methods
.method public constructor <init>(LRe/m;I)V
    .locals 1

    .line 1
    sget-object v0, LNe/b;->c:Lx9/d;

    .line 2
    .line 3
    invoke-direct {p0, p1}, LRe/a;-><init>(LHe/c;)V

    .line 4
    .line 5
    .line 6
    iput p2, p0, LRe/M;->c:I

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, LRe/M;->d:Z

    .line 10
    .line 11
    iput-object v0, p0, LRe/M;->e:Lx9/d;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final e(LHe/f;)V
    .locals 4

    .line 1
    new-instance v0, LRe/L;

    .line 2
    .line 3
    iget v1, p0, LRe/M;->c:I

    .line 4
    .line 5
    iget-boolean v2, p0, LRe/M;->d:Z

    .line 6
    .line 7
    iget-object v3, p0, LRe/M;->e:Lx9/d;

    .line 8
    .line 9
    invoke-direct {v0, p1, v1, v2, v3}, LRe/L;-><init>(LHe/f;IZLx9/d;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LRe/a;->b:LHe/c;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, LHe/c;->d(LHe/f;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
