.class public final Lod/S;
.super Lod/b1;
.source "SourceFile"


# instance fields
.field public b:Z

.field public final c:Lmd/k0;

.field public final d:Lod/s;

.field public final e:[Lmd/i;


# direct methods
.method public constructor <init>(Lmd/k0;Lod/s;[Lmd/i;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Lmd/k0;->f()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "error must not be OK"

    invoke-static {v1, v0}, LFe/e;->p(Ljava/lang/String;Z)V

    .line 3
    iput-object p1, p0, Lod/S;->c:Lmd/k0;

    .line 4
    iput-object p2, p0, Lod/S;->d:Lod/s;

    .line 5
    iput-object p3, p0, Lod/S;->e:[Lmd/i;

    return-void
.end method

.method public constructor <init>(Lmd/k0;[Lmd/i;)V
    .locals 1

    .line 6
    sget-object v0, Lod/s;->a:Lod/s;

    invoke-direct {p0, p1, v0, p2}, Lod/S;-><init>(Lmd/k0;Lod/s;[Lmd/i;)V

    return-void
.end method


# virtual methods
.method public final i(LN/J0;)V
    .locals 2

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    iget-object v1, p0, Lod/S;->c:Lmd/k0;

    .line 4
    .line 5
    invoke-virtual {p1, v1, v0}, LN/J0;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "progress"

    .line 9
    .line 10
    iget-object v1, p0, Lod/S;->d:Lod/s;

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, LN/J0;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final k(Lod/t;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lod/S;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    const-string v2, "already started"

    .line 6
    .line 7
    invoke-static {v2, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 8
    .line 9
    .line 10
    iput-boolean v1, p0, Lod/S;->b:Z

    .line 11
    .line 12
    iget-object v0, p0, Lod/S;->e:[Lmd/i;

    .line 13
    .line 14
    array-length v1, v0

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    iget-object v3, p0, Lod/S;->c:Lmd/k0;

    .line 17
    .line 18
    if-ge v2, v1, :cond_0

    .line 19
    .line 20
    aget-object v4, v0, v2

    .line 21
    .line 22
    invoke-virtual {v4, v3}, Lmd/i;->m(Lmd/k0;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v0, Lmd/b0;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lod/S;->d:Lod/s;

    .line 34
    .line 35
    invoke-interface {p1, v3, v1, v0}, Lod/t;->m(Lmd/k0;Lod/s;Lmd/b0;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
