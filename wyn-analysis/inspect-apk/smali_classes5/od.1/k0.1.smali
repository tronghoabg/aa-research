.class public final Lod/k0;
.super Lod/U;
.source "SourceFile"


# instance fields
.field public final a:Lod/y;

.field public final b:LVa/X7;


# direct methods
.method public constructor <init>(Lod/y;LVa/X7;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lod/k0;->a:Lod/y;

    .line 5
    .line 6
    iput-object p2, p0, Lod/k0;->b:LVa/X7;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(LF6/r;Lmd/b0;Lmd/c;[Lmd/i;)Lod/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/k0;->a:Lod/y;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Lod/u;->c(LF6/r;Lmd/b0;Lmd/c;[Lmd/i;)Lod/r;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance p2, Lod/j0;

    .line 8
    .line 9
    invoke-direct {p2, p0, p1}, Lod/j0;-><init>(Lod/k0;Lod/r;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public final g()Lod/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/k0;->a:Lod/y;

    .line 2
    .line 3
    return-object v0
.end method
