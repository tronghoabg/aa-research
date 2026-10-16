.class public final Lk2/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/d0;


# instance fields
.field public final a:J

.field public b:Z

.field public c:J


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lk2/j0;->j:LN1/n;

    .line 5
    .line 6
    const-wide/32 v0, 0xac44

    .line 7
    .line 8
    .line 9
    mul-long/2addr p1, v0

    .line 10
    const-wide/32 v0, 0xf4240

    .line 11
    .line 12
    .line 13
    div-long/2addr p1, v0

    .line 14
    sget v0, LQ1/x;->a:I

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    int-to-long v0, v0

    .line 18
    mul-long/2addr v0, p1

    .line 19
    iput-wide v0, p0, Lk2/i0;->a:J

    .line 20
    .line 21
    const-wide/16 p1, 0x0

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Lk2/i0;->b(J)V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(J)V
    .locals 8

    .line 1
    sget-object v0, Lk2/j0;->j:LN1/n;

    .line 2
    .line 3
    const-wide/32 v0, 0xac44

    .line 4
    .line 5
    .line 6
    mul-long/2addr p1, v0

    .line 7
    const-wide/32 v0, 0xf4240

    .line 8
    .line 9
    .line 10
    div-long/2addr p1, v0

    .line 11
    sget v0, LQ1/x;->a:I

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    int-to-long v0, v0

    .line 15
    mul-long v2, v0, p1

    .line 16
    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    iget-wide v6, p0, Lk2/i0;->a:J

    .line 20
    .line 21
    invoke-static/range {v2 .. v7}, LQ1/x;->j(JJJ)J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    iput-wide p1, p0, Lk2/i0;->c:J

    .line 26
    .line 27
    return-void
.end method

.method public final g(J)I
    .locals 2

    .line 1
    iget-wide v0, p0, Lk2/i0;->c:J

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lk2/i0;->b(J)V

    .line 4
    .line 5
    .line 6
    iget-wide p1, p0, Lk2/i0;->c:J

    .line 7
    .line 8
    sub-long/2addr p1, v0

    .line 9
    sget-object v0, Lk2/j0;->l:[B

    .line 10
    .line 11
    array-length v0, v0

    .line 12
    int-to-long v0, v0

    .line 13
    div-long/2addr p1, v0

    .line 14
    long-to-int p1, p1

    .line 15
    return p1
.end method

.method public final isReady()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final s(LS3/c;LT1/d;I)I
    .locals 9

    .line 1
    const/4 v0, 0x4

    .line 2
    iget-boolean v1, p0, Lk2/i0;->b:Z

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v1, :cond_4

    .line 6
    .line 7
    and-int/lit8 v1, p3, 0x2

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-wide v3, p0, Lk2/i0;->c:J

    .line 13
    .line 14
    iget-wide v5, p0, Lk2/i0;->a:J

    .line 15
    .line 16
    sub-long/2addr v5, v3

    .line 17
    const-wide/16 v7, 0x0

    .line 18
    .line 19
    cmp-long p1, v5, v7

    .line 20
    .line 21
    const/4 v1, -0x4

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p2, v0}, LH5/a;->b(I)V

    .line 25
    .line 26
    .line 27
    return v1

    .line 28
    :cond_1
    sget-object p1, Lk2/j0;->j:LN1/n;

    .line 29
    .line 30
    sget p1, LQ1/x;->a:I

    .line 31
    .line 32
    int-to-long v7, v0

    .line 33
    div-long/2addr v3, v7

    .line 34
    const-wide/32 v7, 0xf4240

    .line 35
    .line 36
    .line 37
    mul-long/2addr v3, v7

    .line 38
    const-wide/32 v7, 0xac44

    .line 39
    .line 40
    .line 41
    div-long/2addr v3, v7

    .line 42
    iput-wide v3, p2, LT1/d;->g:J

    .line 43
    .line 44
    invoke-virtual {p2, v2}, LH5/a;->b(I)V

    .line 45
    .line 46
    .line 47
    sget-object p1, Lk2/j0;->l:[B

    .line 48
    .line 49
    array-length v3, p1

    .line 50
    int-to-long v3, v3

    .line 51
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    long-to-int v3, v3

    .line 56
    and-int/2addr v0, p3

    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    invoke-virtual {p2, v3}, LT1/d;->r(I)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p2, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-virtual {p2, p1, v0, v3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 66
    .line 67
    .line 68
    :cond_2
    and-int/lit8 p1, p3, 0x1

    .line 69
    .line 70
    if-nez p1, :cond_3

    .line 71
    .line 72
    iget-wide p1, p0, Lk2/i0;->c:J

    .line 73
    .line 74
    int-to-long v2, v3

    .line 75
    add-long/2addr p1, v2

    .line 76
    iput-wide p1, p0, Lk2/i0;->c:J

    .line 77
    .line 78
    :cond_3
    return v1

    .line 79
    :cond_4
    :goto_0
    sget-object p2, Lk2/j0;->j:LN1/n;

    .line 80
    .line 81
    iput-object p2, p1, LS3/c;->c:Ljava/lang/Object;

    .line 82
    .line 83
    iput-boolean v2, p0, Lk2/i0;->b:Z

    .line 84
    .line 85
    const/4 p1, -0x5

    .line 86
    return p1
.end method
