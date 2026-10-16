.class public final LZ1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lk2/H;

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILk2/H;)V
    .locals 0

    .line 1
    iput-object p1, p0, LZ1/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput p2, p0, LZ1/d;->a:I

    iput-object p3, p0, LZ1/d;->b:Lk2/H;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LQ1/c;)V
    .locals 5

    .line 1
    iget-object v0, p0, LZ1/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lk2/L;

    .line 18
    .line 19
    iget-object v2, v1, Lk2/L;->b:Ljava/lang/Object;

    .line 20
    .line 21
    new-instance v3, Lcom/applovin/impl/sdk/nativeAd/e;

    .line 22
    .line 23
    const/16 v4, 0x18

    .line 24
    .line 25
    invoke-direct {v3, v4, p1, v2}, Lcom/applovin/impl/sdk/nativeAd/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, v1, Lk2/L;->a:Landroid/os/Handler;

    .line 29
    .line 30
    invoke-static {v1, v3}, LQ1/x;->O(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public b(ILN1/n;ILjava/lang/Object;J)V
    .locals 10

    .line 1
    new-instance v0, Lh2/g;

    .line 2
    .line 3
    invoke-static/range {p5 .. p6}, LQ1/x;->W(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    move v2, p1

    .line 14
    move-object v3, p2

    .line 15
    move v4, p3

    .line 16
    move-object v5, p4

    .line 17
    invoke-direct/range {v0 .. v9}, Lh2/g;-><init>(IILN1/n;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Laa/f;

    .line 21
    .line 22
    const/16 p2, 0xb

    .line 23
    .line 24
    invoke-direct {p1, p2, p0, v0}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, LZ1/d;->a(LQ1/c;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public c(Lk2/z;IILN1/n;ILjava/lang/Object;JJ)V
    .locals 10

    .line 1
    new-instance v0, Lh2/g;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, LQ1/x;->W(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, LQ1/x;->W(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move v1, p2

    .line 12
    move v2, p3

    .line 13
    move-object v3, p4

    .line 14
    move v4, p5

    .line 15
    move-object/from16 v5, p6

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, Lh2/g;-><init>(IILN1/n;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    new-instance p2, Lk2/J;

    .line 21
    .line 22
    const/4 p3, 0x2

    .line 23
    invoke-direct {p2, p0, p1, v0, p3}, Lk2/J;-><init>(LZ1/d;Lk2/z;Lh2/g;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p2}, LZ1/d;->a(LQ1/c;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public d(Lk2/z;I)V
    .locals 11

    .line 1
    const/4 v5, 0x0

    .line 2
    const/4 v6, 0x0

    .line 3
    const/4 v3, -0x1

    .line 4
    const/4 v4, 0x0

    .line 5
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move v2, p2

    .line 18
    invoke-virtual/range {v0 .. v10}, LZ1/d;->e(Lk2/z;IILN1/n;ILjava/lang/Object;JJ)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public e(Lk2/z;IILN1/n;ILjava/lang/Object;JJ)V
    .locals 10

    .line 1
    new-instance v0, Lh2/g;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, LQ1/x;->W(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, LQ1/x;->W(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move v1, p2

    .line 12
    move v2, p3

    .line 13
    move-object v3, p4

    .line 14
    move v4, p5

    .line 15
    move-object/from16 v5, p6

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, Lh2/g;-><init>(IILN1/n;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    new-instance p2, Lk2/J;

    .line 21
    .line 22
    const/4 p3, 0x1

    .line 23
    invoke-direct {p2, p0, p1, v0, p3}, Lk2/J;-><init>(LZ1/d;Lk2/z;Lh2/g;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p2}, LZ1/d;->a(LQ1/c;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public f(Lk2/z;IILN1/n;ILjava/lang/Object;JJLjava/io/IOException;Z)V
    .locals 10

    .line 1
    new-instance v0, Lh2/g;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, LQ1/x;->W(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, LQ1/x;->W(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move v1, p2

    .line 12
    move v2, p3

    .line 13
    move-object v3, p4

    .line 14
    move v4, p5

    .line 15
    move-object/from16 v5, p6

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, Lh2/g;-><init>(IILN1/n;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    move-object p5, v0

    .line 21
    new-instance p2, Lk2/K;

    .line 22
    .line 23
    move-object p3, p0

    .line 24
    move-object p4, p1

    .line 25
    move-object/from16 p6, p11

    .line 26
    .line 27
    move/from16 p7, p12

    .line 28
    .line 29
    invoke-direct/range {p2 .. p7}, Lk2/K;-><init>(LZ1/d;Lk2/z;Lh2/g;Ljava/io/IOException;Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p2}, LZ1/d;->a(LQ1/c;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public g(Lk2/z;ILjava/io/IOException;Z)V
    .locals 13

    .line 1
    const/4 v5, 0x0

    .line 2
    const/4 v6, 0x0

    .line 3
    const/4 v3, -0x1

    .line 4
    const/4 v4, 0x0

    .line 5
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move v2, p2

    .line 18
    move-object/from16 v11, p3

    .line 19
    .line 20
    move/from16 v12, p4

    .line 21
    .line 22
    invoke-virtual/range {v0 .. v12}, LZ1/d;->f(Lk2/z;IILN1/n;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public h(Lk2/z;IILN1/n;ILjava/lang/Object;JJ)V
    .locals 10

    .line 1
    new-instance v0, Lh2/g;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, LQ1/x;->W(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, LQ1/x;->W(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move v1, p2

    .line 12
    move v2, p3

    .line 13
    move-object v3, p4

    .line 14
    move v4, p5

    .line 15
    move-object/from16 v5, p6

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, Lh2/g;-><init>(IILN1/n;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    new-instance p2, Lk2/J;

    .line 21
    .line 22
    const/4 p3, 0x0

    .line 23
    invoke-direct {p2, p0, p1, v0, p3}, Lk2/J;-><init>(LZ1/d;Lk2/z;Lh2/g;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p2}, LZ1/d;->a(LQ1/c;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
