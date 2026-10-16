.class public final LN2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/w;


# instance fields
.field public final synthetic a:LN2/b;


# direct methods
.method public constructor <init>(LN2/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN2/a;->a:LN2/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(J)Ls2/v;
    .locals 17

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p0

    .line 4
    .line 5
    iget-object v3, v2, LN2/a;->a:LN2/b;

    .line 6
    .line 7
    iget-object v4, v3, LN2/b;->m:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v4, LN2/i;

    .line 10
    .line 11
    iget v4, v4, LN2/i;->f:I

    .line 12
    .line 13
    int-to-long v4, v4

    .line 14
    mul-long/2addr v4, v0

    .line 15
    const-wide/32 v6, 0xf4240

    .line 16
    .line 17
    .line 18
    div-long/2addr v4, v6

    .line 19
    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    iget-wide v5, v3, LN2/b;->c:J

    .line 24
    .line 25
    iget-wide v7, v3, LN2/b;->b:J

    .line 26
    .line 27
    sub-long v9, v5, v7

    .line 28
    .line 29
    invoke-static {v9, v10}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    invoke-virtual {v4, v9}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-wide v9, v3, LN2/b;->e:J

    .line 38
    .line 39
    invoke-static {v9, v10}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    invoke-virtual {v4, v9}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4}, Ljava/math/BigInteger;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v9

    .line 51
    add-long/2addr v9, v7

    .line 52
    const-wide/16 v7, 0x7530

    .line 53
    .line 54
    sub-long v11, v9, v7

    .line 55
    .line 56
    const-wide/16 v7, 0x1

    .line 57
    .line 58
    sub-long v15, v5, v7

    .line 59
    .line 60
    iget-wide v13, v3, LN2/b;->b:J

    .line 61
    .line 62
    invoke-static/range {v11 .. v16}, LQ1/x;->j(JJJ)J

    .line 63
    .line 64
    .line 65
    move-result-wide v3

    .line 66
    new-instance v5, Ls2/v;

    .line 67
    .line 68
    new-instance v6, Ls2/x;

    .line 69
    .line 70
    invoke-direct {v6, v0, v1, v3, v4}, Ls2/x;-><init>(JJ)V

    .line 71
    .line 72
    .line 73
    invoke-direct {v5, v6, v6}, Ls2/v;-><init>(Ls2/x;Ls2/x;)V

    .line 74
    .line 75
    .line 76
    return-object v5
.end method

.method public final e()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final f()J
    .locals 6

    .line 1
    iget-object v0, p0, LN2/a;->a:LN2/b;

    .line 2
    .line 3
    iget-object v1, v0, LN2/b;->m:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LN2/i;

    .line 6
    .line 7
    iget-wide v2, v0, LN2/b;->e:J

    .line 8
    .line 9
    const-wide/32 v4, 0xf4240

    .line 10
    .line 11
    .line 12
    mul-long/2addr v2, v4

    .line 13
    iget v0, v1, LN2/i;->f:I

    .line 14
    .line 15
    int-to-long v0, v0

    .line 16
    div-long/2addr v2, v0

    .line 17
    return-wide v2
.end method
