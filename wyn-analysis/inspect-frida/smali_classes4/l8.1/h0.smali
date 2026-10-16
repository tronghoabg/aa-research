.class public final Ll8/h0;
.super Ll8/P;
.source "SourceFile"


# instance fields
.field public final transient d:Ll8/j0;

.field public final transient e:Ll8/i0;


# direct methods
.method public constructor <init>(Ll8/j0;Ll8/i0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll8/h0;->d:Ll8/j0;

    .line 5
    .line 6
    iput-object p2, p0, Ll8/h0;->e:Ll8/i0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ll8/K;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/h0;->e:Ll8/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(I[Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/h0;->e:Ll8/i0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ll8/K;->b(I[Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/h0;->d:Ll8/j0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public final f()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final g()Ll8/t0;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Ll8/h0;->e:Ll8/i0;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Ll8/K;->l(I)Ll8/I;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/h0;->d:Ll8/j0;

    .line 2
    .line 3
    iget v0, v0, Ll8/j0;->f:I

    .line 4
    .line 5
    return v0
.end method
