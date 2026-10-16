.class final Lj$/util/stream/v2;
.super Lj$/util/stream/a0;
.source "SourceFile"


# instance fields
.field final synthetic l:J

.field final synthetic m:J


# direct methods
.method constructor <init>(Lj$/util/stream/c0;IJJ)V
    .locals 0

    .line 231
    iput-wide p3, p0, Lj$/util/stream/v2;->l:J

    iput-wide p5, p0, Lj$/util/stream/v2;->m:J

    .line 91
    invoke-direct {p0, p1, p2}, Lj$/util/stream/b;-><init>(Lj$/util/stream/b;I)V

    return-void
.end method


# virtual methods
.method final L(Lj$/util/stream/b;Lj$/util/Spliterator;Ljava/util/function/IntFunction;)Lj$/util/stream/K0;
    .locals 12

    .line 267
    invoke-virtual {p1, p2}, Lj$/util/stream/b;->D(Lj$/util/Spliterator;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    const/4 v5, 0x1

    if-lez v4, :cond_0

    const/16 v4, 0x4000

    .line 268
    invoke-interface {p2, v4}, Lj$/util/Spliterator;->hasCharacteristics(I)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 274
    invoke-virtual {p1}, Lj$/util/stream/b;->G()Lj$/util/stream/h3;

    move-result-object v6

    iget-wide v8, p0, Lj$/util/stream/v2;->l:J

    iget-wide v10, p0, Lj$/util/stream/v2;->m:J

    move-object v7, p2

    invoke-static/range {v6 .. v11}, Lj$/util/stream/C2;->c(Lj$/util/stream/h3;Lj$/util/Spliterator;JJ)Lj$/util/Spliterator;

    move-result-object p2

    .line 275
    invoke-static {p1, p2, v5}, Lj$/util/stream/y0;->D(Lj$/util/stream/b;Lj$/util/Spliterator;Z)Lj$/util/stream/G0;

    move-result-object p1

    return-object p1

    :cond_0
    move-object v7, p2

    .line 276
    sget-object p2, Lj$/util/stream/g3;->ORDERED:Lj$/util/stream/g3;

    invoke-virtual {p1}, Lj$/util/stream/b;->H()I

    move-result v4

    invoke-virtual {p2, v4}, Lj$/util/stream/g3;->t(I)Z

    move-result p2

    if-nez p2, :cond_3

    .line 278
    invoke-virtual {p1, v7}, Lj$/util/stream/b;->U(Lj$/util/Spliterator;)Lj$/util/Spliterator;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lj$/util/Spliterator$OfInt;

    .line 234
    iget-wide p1, p0, Lj$/util/stream/v2;->l:J

    cmp-long p3, p1, v0

    iget-wide v8, p0, Lj$/util/stream/v2;->m:J

    if-gtz p3, :cond_2

    cmp-long p3, v8, v2

    sub-long/2addr v0, p1

    if-ltz p3, :cond_1

    .line 237
    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    move-wide v8, p1

    goto :goto_0

    :cond_1
    move-wide v8, v0

    :goto_0
    move-wide v10, v8

    move-wide v8, v2

    goto :goto_1

    :cond_2
    move-wide v10, v8

    move-wide v8, p1

    .line 240
    :goto_1
    new-instance v6, Lj$/util/stream/D3;

    .line 1077
    invoke-direct/range {v6 .. v11}, Lj$/util/stream/I3;-><init>(Lj$/util/Spliterator;JJ)V

    .line 284
    invoke-static {p0, v6, v5}, Lj$/util/stream/y0;->D(Lj$/util/stream/b;Lj$/util/Spliterator;Z)Lj$/util/stream/G0;

    move-result-object p1

    return-object p1

    .line 287
    :cond_3
    new-instance v0, Lj$/util/stream/B2;

    iget-wide v5, p0, Lj$/util/stream/v2;->l:J

    move-object v3, v7

    iget-wide v7, p0, Lj$/util/stream/v2;->m:J

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v8}, Lj$/util/stream/B2;-><init>(Lj$/util/stream/b;Lj$/util/stream/b;Lj$/util/Spliterator;Ljava/util/function/IntFunction;JJ)V

    .line 288
    invoke-virtual {v0}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/stream/K0;

    return-object p1
.end method

.method final M(Lj$/util/stream/b;Lj$/util/Spliterator;)Lj$/util/Spliterator;
    .locals 14

    .line 246
    invoke-virtual/range {p1 .. p2}, Lj$/util/stream/b;->D(Lj$/util/Spliterator;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    .line 247
    iget-wide v6, p0, Lj$/util/stream/v2;->m:J

    if-lez v0, :cond_0

    const/16 v0, 0x4000

    move-object/from16 v8, p2

    invoke-interface {v8, v0}, Lj$/util/Spliterator;->hasCharacteristics(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 248
    new-instance v8, Lj$/util/stream/x3;

    .line 249
    invoke-virtual/range {p1 .. p2}, Lj$/util/stream/b;->U(Lj$/util/Spliterator;)Lj$/util/Spliterator;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lj$/util/Spliterator$OfInt;

    .line 251
    iget-wide v10, p0, Lj$/util/stream/v2;->l:J

    invoke-static {v10, v11, v6, v7}, Lj$/util/stream/C2;->b(JJ)J

    move-result-wide v12

    .line 823
    invoke-direct/range {v8 .. v13}, Lj$/util/stream/z3;-><init>(Lj$/util/d0;JJ)V

    return-object v8

    .line 252
    :cond_0
    sget-object v0, Lj$/util/stream/g3;->ORDERED:Lj$/util/stream/g3;

    invoke-virtual {p1}, Lj$/util/stream/b;->H()I

    move-result v8

    invoke-virtual {v0, v8}, Lj$/util/stream/g3;->t(I)Z

    move-result v0

    if-nez v0, :cond_3

    .line 254
    invoke-virtual/range {p1 .. p2}, Lj$/util/stream/b;->U(Lj$/util/Spliterator;)Lj$/util/Spliterator;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lj$/util/Spliterator$OfInt;

    .line 234
    iget-wide v10, p0, Lj$/util/stream/v2;->l:J

    cmp-long v0, v10, v2

    if-gtz v0, :cond_2

    cmp-long v0, v6, v4

    sub-long/2addr v2, v10

    if-ltz v0, :cond_1

    .line 237
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    :cond_1
    move-wide v6, v2

    move-wide v10, v4

    :cond_2
    move-wide v12, v6

    .line 240
    new-instance v8, Lj$/util/stream/D3;

    .line 1077
    invoke-direct/range {v8 .. v13}, Lj$/util/stream/I3;-><init>(Lj$/util/Spliterator;JJ)V

    return-object v8

    .line 258
    :cond_3
    new-instance v0, Lj$/util/stream/B2;

    new-instance v4, Lj$/util/stream/d2;

    const/4 v2, 0x1

    .line 0
    invoke-direct {v4, v2}, Lj$/util/stream/d2;-><init>(I)V

    .line 258
    iget-wide v5, p0, Lj$/util/stream/v2;->l:J

    iget-wide v7, p0, Lj$/util/stream/v2;->m:J

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v8}, Lj$/util/stream/B2;-><init>(Lj$/util/stream/b;Lj$/util/stream/b;Lj$/util/Spliterator;Ljava/util/function/IntFunction;JJ)V

    .line 259
    invoke-virtual {v0}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/stream/K0;

    invoke-interface {v0}, Lj$/util/stream/K0;->spliterator()Lj$/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method final O(ILj$/util/stream/r2;)Lj$/util/stream/r2;
    .locals 0

    .line 294
    new-instance p1, Lj$/util/stream/u2;

    invoke-direct {p1, p0, p2}, Lj$/util/stream/u2;-><init>(Lj$/util/stream/v2;Lj$/util/stream/r2;)V

    return-object p1
.end method
