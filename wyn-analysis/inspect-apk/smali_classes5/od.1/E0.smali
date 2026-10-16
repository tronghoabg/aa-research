.class public final Lod/E0;
.super Lmd/y;
.source "SourceFile"


# instance fields
.field public a:LS3/n;

.field public final synthetic b:Lod/M0;


# direct methods
.method public constructor <init>(Lod/M0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lod/E0;->b:Lod/M0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(LDd/c;)Lmd/e;
    .locals 3

    .line 1
    iget-object v0, p0, Lod/E0;->b:Lod/M0;

    .line 2
    .line 3
    iget-object v1, v0, Lod/M0;->m:Lmd/n0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lmd/n0;->e()V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, v0, Lod/M0;->I:Z

    .line 9
    .line 10
    xor-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    const-string v2, "Channel is being terminated"

    .line 13
    .line 14
    invoke-static {v2, v1}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lod/L0;

    .line 18
    .line 19
    invoke-direct {v1, v0, p1}, Lod/L0;-><init>(Lod/M0;LDd/c;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method public final d()Lmd/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/E0;->b:Lod/M0;

    .line 2
    .line 3
    iget-object v0, v0, Lod/M0;->O:Lod/k;

    .line 4
    .line 5
    return-object v0
.end method

.method public final e()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/E0;->b:Lod/M0;

    .line 2
    .line 3
    iget-object v0, v0, Lod/M0;->g:Lod/K0;

    .line 4
    .line 5
    return-object v0
.end method

.method public final g()Lmd/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/E0;->b:Lod/M0;

    .line 2
    .line 3
    iget-object v0, v0, Lod/M0;->m:Lmd/n0;

    .line 4
    .line 5
    return-object v0
.end method

.method public final i()V
    .locals 3

    .line 1
    iget-object v0, p0, Lod/E0;->b:Lod/M0;

    .line 2
    .line 3
    iget-object v1, v0, Lod/M0;->m:Lmd/n0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lmd/n0;->e()V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lg5/d;

    .line 9
    .line 10
    const/16 v2, 0x9

    .line 11
    .line 12
    invoke-direct {v1, p0, v2}, Lg5/d;-><init>(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Lod/M0;->m:Lmd/n0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final l(Lmd/m;Lmd/M;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lod/E0;->b:Lod/M0;

    .line 2
    .line 3
    iget-object v1, v0, Lod/M0;->m:Lmd/n0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lmd/n0;->e()V

    .line 6
    .line 7
    .line 8
    const-string v1, "newState"

    .line 9
    .line 10
    invoke-static {p1, v1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "newPicker"

    .line 14
    .line 15
    invoke-static {p2, v1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, LA7/w0;

    .line 19
    .line 20
    const/16 v2, 0x1d

    .line 21
    .line 22
    invoke-direct {v1, p0, p2, p1, v2}, LA7/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    iget-object p1, v0, Lod/M0;->m:Lmd/n0;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
