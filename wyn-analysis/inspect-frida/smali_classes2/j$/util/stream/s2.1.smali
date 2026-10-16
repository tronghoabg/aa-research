.class final Lj$/util/stream/s2;
.super Lj$/util/stream/n2;
.source "SourceFile"


# instance fields
.field b:J

.field c:J

.field final synthetic d:Lj$/util/stream/t2;


# direct methods
.method constructor <init>(Lj$/util/stream/t2;Lj$/util/stream/r2;)V
    .locals 2

    .line 185
    iput-object p1, p0, Lj$/util/stream/s2;->d:Lj$/util/stream/t2;

    invoke-direct {p0, p2}, Lj$/util/stream/n2;-><init>(Lj$/util/stream/r2;)V

    .line 186
    iget-wide v0, p1, Lj$/util/stream/t2;->m:J

    iput-wide v0, p0, Lj$/util/stream/s2;->b:J

    const-wide/16 v0, 0x0

    .line 187
    iget-wide p1, p1, Lj$/util/stream/t2;->n:J

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide p1, 0x7fffffffffffffffL

    :goto_0
    iput-wide p1, p0, Lj$/util/stream/s2;->c:J

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    .line 196
    iget-wide v0, p0, Lj$/util/stream/s2;->b:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    const-wide/16 v5, 0x1

    if-nez v4, :cond_1

    .line 197
    iget-wide v0, p0, Lj$/util/stream/s2;->c:J

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    sub-long/2addr v0, v5

    .line 198
    iput-wide v0, p0, Lj$/util/stream/s2;->c:J

    .line 199
    iget-object v0, p0, Lj$/util/stream/n2;->a:Lj$/util/stream/r2;

    invoke-interface {v0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    sub-long/2addr v0, v5

    .line 203
    iput-wide v0, p0, Lj$/util/stream/s2;->b:J

    return-void
.end method

.method public final l(J)V
    .locals 7

    .line 191
    iget-object v0, p0, Lj$/util/stream/s2;->d:Lj$/util/stream/t2;

    iget-wide v3, v0, Lj$/util/stream/t2;->m:J

    iget-wide v5, p0, Lj$/util/stream/s2;->c:J

    move-wide v1, p1

    invoke-static/range {v1 .. v6}, Lj$/util/stream/C2;->a(JJJ)J

    move-result-wide p1

    iget-object v0, p0, Lj$/util/stream/n2;->a:Lj$/util/stream/r2;

    invoke-interface {v0, p1, p2}, Lj$/util/stream/r2;->l(J)V

    return-void
.end method

.method public final n()Z
    .locals 4

    .line 209
    iget-wide v0, p0, Lj$/util/stream/s2;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    iget-object v0, p0, Lj$/util/stream/n2;->a:Lj$/util/stream/r2;

    invoke-interface {v0}, Lj$/util/stream/r2;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
