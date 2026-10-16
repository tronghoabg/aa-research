.class public final Lvd/c;
.super Lmd/O;
.source "SourceFile"


# instance fields
.field public final synthetic f:Lvd/e;


# direct methods
.method public constructor <init>(Lvd/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvd/c;->f:Lvd/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Lmd/k0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lvd/c;->f:Lvd/e;

    .line 2
    .line 3
    iget-object v0, v0, Lvd/e;->g:Lvd/a;

    .line 4
    .line 5
    sget-object v1, Lmd/m;->c:Lmd/m;

    .line 6
    .line 7
    new-instance v2, Lod/z0;

    .line 8
    .line 9
    invoke-static {p1}, Lmd/K;->a(Lmd/k0;)Lmd/K;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {v2, p1}, Lod/z0;-><init>(Lmd/K;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Lvd/a;->l(Lmd/m;Lmd/M;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final d(Lmd/L;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final f()V
    .locals 0

    .line 1
    return-void
.end method
