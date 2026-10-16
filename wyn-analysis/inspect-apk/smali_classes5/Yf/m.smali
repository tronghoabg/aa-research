.class public final LYf/m;
.super LE4/F;
.source "SourceFile"


# instance fields
.field public final e:LXf/c;

.field public f:I


# direct methods
.method public constructor <init>(LA/x;LXf/c;)V
    .locals 1

    .line 1
    const-string v0, "json"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x6

    .line 7
    invoke-direct {p0, p1, v0}, LE4/F;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, LYf/m;->e:LXf/c;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final e()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LE4/F;->b:Z

    .line 3
    .line 4
    iget v1, p0, LYf/m;->f:I

    .line 5
    .line 6
    add-int/2addr v1, v0

    .line 7
    iput v1, p0, LYf/m;->f:I

    .line 8
    .line 9
    return-void
.end method

.method public final i()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LE4/F;->b:Z

    .line 3
    .line 4
    const-string v1, "\n"

    .line 5
    .line 6
    invoke-virtual {p0, v1}, LE4/F;->p(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget v1, p0, LYf/m;->f:I

    .line 10
    .line 11
    :goto_0
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, LYf/m;->e:LXf/c;

    .line 14
    .line 15
    iget-object v2, v2, LXf/c;->a:LXf/h;

    .line 16
    .line 17
    iget-object v2, v2, LXf/h;->g:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0, v2}, LE4/F;->p(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LE4/F;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, LE4/F;->b:Z

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, LYf/m;->i()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final t()V
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LE4/F;->m(C)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final u()V
    .locals 1

    .line 1
    iget v0, p0, LYf/m;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, LYf/m;->f:I

    .line 6
    .line 7
    return-void
.end method
