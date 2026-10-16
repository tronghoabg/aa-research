.class public final Lk2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/f0;


# instance fields
.field public final a:Lk2/f0;

.field public final b:Ll8/K;


# direct methods
.method public constructor <init>(Lk2/f0;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk2/m;->a:Lk2/f0;

    .line 5
    .line 6
    invoke-static {p2}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lk2/m;->b:Ll8/K;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/m;->a:Lk2/f0;

    .line 2
    .line 3
    invoke-interface {v0}, Lk2/f0;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/m;->a:Lk2/f0;

    .line 2
    .line 3
    invoke-interface {v0}, Lk2/f0;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final k(LU1/C;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/m;->a:Lk2/f0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lk2/f0;->k(LU1/C;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final n()J
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/m;->a:Lk2/f0;

    .line 2
    .line 3
    invoke-interface {v0}, Lk2/f0;->n()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final o(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/m;->a:Lk2/f0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lk2/f0;->o(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
