.class public abstract Lk2/o0;
.super Lk2/l;
.source "SourceFile"


# instance fields
.field public final k:Lk2/a;


# direct methods
.method public constructor <init>(Lk2/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk2/l;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk2/o0;->k:Lk2/a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract B(LN1/N;)V
.end method

.method public C()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lk2/o0;->k:Lk2/a;

    .line 3
    .line 4
    invoke-virtual {p0, v0, v1}, Lk2/l;->y(Ljava/lang/Object;Lk2/a;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final g()LN1/N;
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/o0;->k:Lk2/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk2/a;->g()LN1/N;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final h()LN1/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/o0;->k:Lk2/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk2/a;->h()LN1/w;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/o0;->k:Lk2/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk2/a;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final l(LS1/A;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk2/l;->j:LS1/A;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-static {p1}, LQ1/x;->m(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lk2/l;->i:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {p0}, Lk2/o0;->C()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public s(LN1/w;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/o0;->k:Lk2/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk2/a;->s(LN1/w;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final t(Ljava/lang/Object;Lk2/H;)Lk2/H;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lk2/o0;->z(Lk2/H;)Lk2/H;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final u(JLjava/lang/Object;)J
    .locals 0

    .line 1
    check-cast p3, Ljava/lang/Void;

    .line 2
    .line 3
    return-wide p1
.end method

.method public final v(ILjava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Void;

    .line 2
    .line 3
    return p1
.end method

.method public final x(Ljava/lang/Object;Lk2/a;LN1/N;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p3}, Lk2/o0;->B(LN1/N;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public z(Lk2/H;)Lk2/H;
    .locals 0

    .line 1
    return-object p1
.end method
