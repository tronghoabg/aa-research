.class public final Lod/L1;
.super Lmd/y;
.source "SourceFile"


# static fields
.field public static final d:Lmd/a;


# instance fields
.field public final a:Lmd/y;

.field public final b:Lod/h;

.field public final c:Lmd/n0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lmd/a;

    .line 2
    .line 3
    const-string v1, "io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lmd/a;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lod/L1;->d:Lmd/a;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lod/O;Lod/h;Lmd/n0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lod/L1;->a:Lmd/y;

    .line 5
    .line 6
    iput-object p2, p0, Lod/L1;->b:Lod/h;

    .line 7
    .line 8
    iput-object p3, p0, Lod/L1;->c:Lmd/n0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/L1;->a:Lmd/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmd/y;->f()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/L1;->a:Lmd/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmd/y;->h()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lod/L1;->a:Lmd/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmd/y;->j()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lod/L1;->b:Lod/h;

    .line 7
    .line 8
    iget-object v1, v0, Lod/h;->b:Lmd/n0;

    .line 9
    .line 10
    invoke-virtual {v1}, Lmd/n0;->e()V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lkd/c;

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    invoke-direct {v2, v0, v3}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final k(Lmd/e;)V
    .locals 1

    .line 1
    new-instance v0, Lod/K1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lod/K1;-><init>(Lod/L1;Lmd/e;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lod/L1;->a:Lmd/y;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lmd/y;->k(Lmd/e;)V

    .line 9
    .line 10
    .line 11
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
    const-string v1, "delegate"

    .line 6
    .line 7
    iget-object v2, p0, Lod/L1;->a:Lmd/y;

    .line 8
    .line 9
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
