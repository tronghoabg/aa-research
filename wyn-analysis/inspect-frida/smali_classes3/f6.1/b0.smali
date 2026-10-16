.class public abstract Lf6/b0;
.super Lf6/i;
.source "SourceFile"


# instance fields
.field public final k:Lf6/a;


# direct methods
.method public constructor <init>(Lf6/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf6/i;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf6/b0;->k:Lf6/a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final f()LE5/J0;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/b0;->k:Lf6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf6/a;->f()LE5/J0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final g()LE5/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/b0;->k:Lf6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf6/a;->g()LE5/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/b0;->k:Lf6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf6/a;->h()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final k(Lt6/K;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf6/i;->j:Lt6/K;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-static {p1}, Lu6/v;->j(Lq2/d;)Landroid/os/Handler;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lf6/i;->i:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {p0}, Lf6/b0;->y()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final r(Ljava/lang/Object;Lf6/z;)Lf6/z;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lf6/b0;->w(Lf6/z;)Lf6/z;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final s(JLjava/lang/Object;)J
    .locals 0

    .line 1
    check-cast p3, Ljava/lang/Void;

    .line 2
    .line 3
    return-wide p1
.end method

.method public final t(ILjava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Void;

    .line 2
    .line 3
    return p1
.end method

.method public final u(Ljava/lang/Object;Lf6/a;LE5/J0;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p3}, Lf6/b0;->x(LE5/J0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public w(Lf6/z;)Lf6/z;
    .locals 0

    .line 1
    return-object p1
.end method

.method public abstract x(LE5/J0;)V
.end method

.method public y()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lf6/b0;->k:Lf6/a;

    .line 3
    .line 4
    invoke-virtual {p0, v0, v1}, Lf6/i;->v(Ljava/lang/Object;Lf6/a;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
