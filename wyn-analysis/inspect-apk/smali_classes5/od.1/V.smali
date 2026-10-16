.class public abstract Lod/V;
.super Lmd/S;
.source "SourceFile"


# instance fields
.field public final a:Lod/M0;


# direct methods
.method public constructor <init>(Lod/M0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lod/V;->a:Lod/M0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/V;->a:Lod/M0;

    .line 2
    .line 3
    iget-object v0, v0, Lod/M0;->t:Lmd/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Lmd/d;->g()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final h(LF6/r;Lmd/c;)Lmd/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/V;->a:Lod/M0;

    .line 2
    .line 3
    iget-object v0, v0, Lod/M0;->t:Lmd/d;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lmd/d;->h(LF6/r;Lmd/c;)Lmd/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final i(J)Z
    .locals 1

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    iget-object v0, p0, Lod/V;->a:Lod/M0;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lod/M0;->i(J)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/V;->a:Lod/M0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lod/M0;->j()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k()Lmd/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/V;->a:Lod/M0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lod/M0;->k()Lmd/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final l(Lmd/m;Lv9/n;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/V;->a:Lod/M0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lod/M0;->l(Lmd/m;Lv9/n;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, LBa/c;->S(Ljava/lang/Object;)LA7/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lod/V;->a:Lod/M0;

    .line 6
    .line 7
    const-string v2, "delegate"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, LA7/b0;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method
