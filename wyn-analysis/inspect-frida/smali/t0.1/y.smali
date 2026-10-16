.class public abstract Lt0/y;
.super Lr0/t;
.source "SourceFile"

# interfaces
.implements Lr0/m;
.implements Lr0/k;
.implements Lt0/J;
.implements Ltf/l;


# static fields
.field public static final w:Le0/B;

.field public static final x:Lt0/j;

.field public static final y:Lt0/j;


# instance fields
.field public final e:Lt0/t;

.field public f:Lt0/y;

.field public g:Z

.field public h:Ltf/l;

.field public i:LL0/b;

.field public j:LL0/i;

.field public k:F

.field public l:Z

.field public m:LD0/b;

.field public n:Ljava/util/LinkedHashMap;

.field public o:J

.field public p:F

.field public q:Z

.field public r:Ld0/b;

.field public final s:[LX0/E;

.field public final t:Lt0/p;

.field public u:Z

.field public v:Lt0/G;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Le0/B;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    iput v1, v0, Le0/B;->a:F

    .line 9
    .line 10
    iput v1, v0, Le0/B;->b:F

    .line 11
    .line 12
    iput v1, v0, Le0/B;->c:F

    .line 13
    .line 14
    sget-wide v2, Le0/t;->a:J

    .line 15
    .line 16
    iput-wide v2, v0, Le0/B;->e:J

    .line 17
    .line 18
    iput-wide v2, v0, Le0/B;->f:J

    .line 19
    .line 20
    const/high16 v2, 0x41000000    # 8.0f

    .line 21
    .line 22
    iput v2, v0, Le0/B;->g:F

    .line 23
    .line 24
    sget-wide v2, Le0/J;->b:J

    .line 25
    .line 26
    iput-wide v2, v0, Le0/B;->h:J

    .line 27
    .line 28
    sget-object v2, Le0/z;->a:Lad/I;

    .line 29
    .line 30
    iput-object v2, v0, Le0/B;->i:Le0/E;

    .line 31
    .line 32
    new-instance v2, LL0/c;

    .line 33
    .line 34
    invoke-direct {v2, v1, v1}, LL0/c;-><init>(FF)V

    .line 35
    .line 36
    .line 37
    iput-object v2, v0, Le0/B;->k:LL0/b;

    .line 38
    .line 39
    sput-object v0, Lt0/y;->w:Le0/B;

    .line 40
    .line 41
    new-instance v0, Lt0/j;

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-direct {v0, v1}, Lt0/j;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lt0/y;->x:Lt0/j;

    .line 48
    .line 49
    new-instance v0, Lt0/j;

    .line 50
    .line 51
    const/4 v1, 0x2

    .line 52
    invoke-direct {v0, v1}, Lt0/j;-><init>(I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lt0/y;->y:Lt0/j;

    .line 56
    .line 57
    return-void
.end method

.method public constructor <init>(Lt0/t;)V
    .locals 2

    .line 1
    const-string v0, "layoutNode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lr0/t;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lt0/y;->e:Lt0/t;

    .line 10
    .line 11
    iget-object v0, p1, Lt0/t;->n:LL0/b;

    .line 12
    .line 13
    iput-object v0, p0, Lt0/y;->i:LL0/b;

    .line 14
    .line 15
    iget-object p1, p1, Lt0/t;->p:LL0/i;

    .line 16
    .line 17
    iput-object p1, p0, Lt0/y;->j:LL0/i;

    .line 18
    .line 19
    const p1, 0x3f4ccccd    # 0.8f

    .line 20
    .line 21
    .line 22
    iput p1, p0, Lt0/y;->k:F

    .line 23
    .line 24
    sget-wide v0, LL0/g;->b:J

    .line 25
    .line 26
    iput-wide v0, p0, Lt0/y;->o:J

    .line 27
    .line 28
    const/4 p1, 0x6

    .line 29
    new-array p1, p1, [LX0/E;

    .line 30
    .line 31
    iput-object p1, p0, Lt0/y;->s:[LX0/E;

    .line 32
    .line 33
    new-instance p1, Lt0/p;

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    invoke-direct {p1, p0, v0}, Lt0/p;-><init>(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lt0/y;->t:Lt0/p;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final A(J)J
    .locals 5

    .line 1
    invoke-static {p1, p2}, Ld0/f;->d(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lr0/t;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    int-to-float v1, v1

    .line 10
    sub-float/2addr v0, v1

    .line 11
    invoke-static {p1, p2}, Ld0/f;->b(J)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget-wide v1, p0, Lr0/t;->c:J

    .line 16
    .line 17
    const-wide v3, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr v1, v3

    .line 23
    long-to-int p2, v1

    .line 24
    int-to-float p2, p2

    .line 25
    sub-float/2addr p1, p2

    .line 26
    const/high16 p2, 0x40000000    # 2.0f

    .line 27
    .line 28
    div-float/2addr v0, p2

    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    div-float/2addr p1, p2

    .line 35
    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-static {v0, p1}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 40
    .line 41
    .line 42
    move-result-wide p1

    .line 43
    return-wide p1
.end method

.method public final B()V
    .locals 5

    .line 1
    iget-object v0, p0, Lt0/y;->s:[LX0/E;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_1

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    :goto_1
    if-eqz v4, :cond_0

    .line 11
    .line 12
    invoke-virtual {v4}, LX0/E;->h()V

    .line 13
    .line 14
    .line 15
    iget-object v4, v4, LX0/E;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, LX0/E;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iput-boolean v2, p0, Lt0/y;->l:Z

    .line 24
    .line 25
    iget-object v0, p0, Lt0/y;->h:Ltf/l;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lt0/y;->X(Ltf/l;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lt0/y;->e:Lt0/t;

    .line 31
    .line 32
    invoke-virtual {v0}, Lt0/t;->j()Lt0/t;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0}, Lt0/t;->o()V

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void
.end method

.method public final C(JJ)F
    .locals 6

    .line 1
    invoke-virtual {p0}, Lr0/t;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    invoke-static {p3, p4}, Ld0/f;->d(J)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    cmpl-float v0, v0, v1

    .line 11
    .line 12
    const-wide v1, 0xffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    iget-wide v3, p0, Lr0/t;->c:J

    .line 20
    .line 21
    and-long/2addr v3, v1

    .line 22
    long-to-int v0, v3

    .line 23
    int-to-float v0, v0

    .line 24
    invoke-static {p3, p4}, Ld0/f;->b(J)F

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    cmpl-float v0, v0, v3

    .line 29
    .line 30
    if-ltz v0, :cond_0

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    invoke-virtual {p0, p3, p4}, Lt0/y;->A(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide p3

    .line 37
    invoke-static {p3, p4}, Ld0/f;->d(J)F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {p3, p4}, Ld0/f;->b(J)F

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    invoke-static {p1, p2}, Ld0/c;->b(J)F

    .line 46
    .line 47
    .line 48
    move-result p4

    .line 49
    const/4 v3, 0x0

    .line 50
    cmpg-float v4, p4, v3

    .line 51
    .line 52
    if-gez v4, :cond_1

    .line 53
    .line 54
    neg-float p4, p4

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {p0}, Lr0/t;->h()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    int-to-float v4, v4

    .line 61
    sub-float/2addr p4, v4

    .line 62
    :goto_0
    invoke-static {v3, p4}, Ljava/lang/Math;->max(FF)F

    .line 63
    .line 64
    .line 65
    move-result p4

    .line 66
    invoke-static {p1, p2}, Ld0/c;->c(J)F

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    cmpg-float p2, p1, v3

    .line 71
    .line 72
    if-gez p2, :cond_2

    .line 73
    .line 74
    neg-float p1, p1

    .line 75
    goto :goto_1

    .line 76
    :cond_2
    iget-wide v4, p0, Lr0/t;->c:J

    .line 77
    .line 78
    and-long/2addr v1, v4

    .line 79
    long-to-int p2, v1

    .line 80
    int-to-float p2, p2

    .line 81
    sub-float/2addr p1, p2

    .line 82
    :goto_1
    invoke-static {v3, p1}, Ljava/lang/Math;->max(FF)F

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    invoke-static {p4, p1}, LU8/v0;->f(FF)J

    .line 87
    .line 88
    .line 89
    move-result-wide p1

    .line 90
    cmpl-float p4, v0, v3

    .line 91
    .line 92
    if-gtz p4, :cond_3

    .line 93
    .line 94
    cmpl-float p4, p3, v3

    .line 95
    .line 96
    if-lez p4, :cond_4

    .line 97
    .line 98
    :cond_3
    invoke-static {p1, p2}, Ld0/c;->b(J)F

    .line 99
    .line 100
    .line 101
    move-result p4

    .line 102
    cmpg-float p4, p4, v0

    .line 103
    .line 104
    if-gtz p4, :cond_4

    .line 105
    .line 106
    invoke-static {p1, p2}, Ld0/c;->c(J)F

    .line 107
    .line 108
    .line 109
    move-result p4

    .line 110
    cmpg-float p3, p4, p3

    .line 111
    .line 112
    if-gtz p3, :cond_4

    .line 113
    .line 114
    invoke-static {p1, p2}, Ld0/c;->b(J)F

    .line 115
    .line 116
    .line 117
    move-result p3

    .line 118
    invoke-static {p1, p2}, Ld0/c;->b(J)F

    .line 119
    .line 120
    .line 121
    move-result p4

    .line 122
    mul-float/2addr p4, p3

    .line 123
    invoke-static {p1, p2}, Ld0/c;->c(J)F

    .line 124
    .line 125
    .line 126
    move-result p3

    .line 127
    invoke-static {p1, p2}, Ld0/c;->c(J)F

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    mul-float/2addr p1, p3

    .line 132
    add-float/2addr p1, p4

    .line 133
    return p1

    .line 134
    :cond_4
    :goto_2
    const/high16 p1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 135
    .line 136
    return p1
.end method

.method public final D(Le0/o;)V
    .locals 5

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt0/y;->v:Lt0/G;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lt0/G;->a(Le0/o;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-wide v0, p0, Lt0/y;->o:J

    .line 15
    .line 16
    sget v2, LL0/g;->c:I

    .line 17
    .line 18
    const/16 v2, 0x20

    .line 19
    .line 20
    shr-long v2, v0, v2

    .line 21
    .line 22
    long-to-int v2, v2

    .line 23
    int-to-float v2, v2

    .line 24
    const-wide v3, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v0, v3

    .line 30
    long-to-int v0, v0

    .line 31
    int-to-float v0, v0

    .line 32
    invoke-interface {p1, v2, v0}, Le0/o;->f(FF)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lt0/y;->s:[LX0/E;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    aget-object v1, v1, v3

    .line 39
    .line 40
    check-cast v1, Lt0/f;

    .line 41
    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lt0/y;->Z(Le0/o;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {v1, p1}, Lt0/f;->j(Le0/o;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    neg-float v1, v2

    .line 52
    neg-float v0, v0

    .line 53
    invoke-interface {p1, v1, v0}, Le0/o;->f(FF)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final E(Le0/o;Lc7/l;)V
    .locals 7

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "paint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ld0/d;

    .line 12
    .line 13
    iget-wide v1, p0, Lr0/t;->c:J

    .line 14
    .line 15
    const/16 v3, 0x20

    .line 16
    .line 17
    shr-long v3, v1, v3

    .line 18
    .line 19
    long-to-int v3, v3

    .line 20
    int-to-float v3, v3

    .line 21
    const/high16 v4, 0x3f000000    # 0.5f

    .line 22
    .line 23
    sub-float/2addr v3, v4

    .line 24
    const-wide v5, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v1, v5

    .line 30
    long-to-int v1, v1

    .line 31
    int-to-float v1, v1

    .line 32
    sub-float/2addr v1, v4

    .line 33
    invoke-direct {v0, v4, v4, v3, v1}, Ld0/d;-><init>(FFFF)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1, v0, p2}, Le0/o;->g(Ld0/d;Lc7/l;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final F(Lt0/y;)Lt0/y;
    .locals 6

    .line 1
    const-string v0, "other"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lt0/y;->e:Lt0/t;

    .line 7
    .line 8
    iget-object v1, p0, Lt0/y;->e:Lt0/t;

    .line 9
    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    iget-object v0, v1, Lt0/t;->y:Lt0/F;

    .line 13
    .line 14
    iget-object v0, v0, Lt0/F;->f:Lt0/y;

    .line 15
    .line 16
    move-object v1, p0

    .line 17
    :goto_0
    if-eq v1, v0, :cond_0

    .line 18
    .line 19
    if-eq v1, p1, :cond_0

    .line 20
    .line 21
    iget-object v1, v1, Lt0/y;->f:Lt0/y;

    .line 22
    .line 23
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-ne v1, p1, :cond_6

    .line 28
    .line 29
    goto :goto_4

    .line 30
    :cond_1
    move-object v2, v0

    .line 31
    :goto_1
    iget v3, v2, Lt0/t;->h:I

    .line 32
    .line 33
    iget v4, v1, Lt0/t;->h:I

    .line 34
    .line 35
    if-le v3, v4, :cond_2

    .line 36
    .line 37
    invoke-virtual {v2}, Lt0/t;->j()Lt0/t;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move-object v3, v1

    .line 46
    :goto_2
    iget v4, v3, Lt0/t;->h:I

    .line 47
    .line 48
    iget v5, v2, Lt0/t;->h:I

    .line 49
    .line 50
    if-le v4, v5, :cond_3

    .line 51
    .line 52
    invoke-virtual {v3}, Lt0/t;->j()Lt0/t;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    :goto_3
    if-eq v2, v3, :cond_5

    .line 61
    .line 62
    invoke-virtual {v2}, Lt0/t;->j()Lt0/t;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v3}, Lt0/t;->j()Lt0/t;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    if-eqz v2, :cond_4

    .line 71
    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 76
    .line 77
    const-string v0, "layouts are not part of the same hierarchy"

    .line 78
    .line 79
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1

    .line 83
    :cond_5
    if-ne v3, v1, :cond_7

    .line 84
    .line 85
    :cond_6
    return-object p0

    .line 86
    :cond_7
    if-ne v2, v0, :cond_8

    .line 87
    .line 88
    :goto_4
    return-object p1

    .line 89
    :cond_8
    iget-object p1, v2, Lt0/t;->x:Lt0/i;

    .line 90
    .line 91
    return-object p1
.end method

.method public final G(J)J
    .locals 5

    .line 1
    iget-wide v0, p0, Lt0/y;->o:J

    .line 2
    .line 3
    invoke-static {p1, p2}, Ld0/c;->b(J)F

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    sget v3, LL0/g;->c:I

    .line 8
    .line 9
    const/16 v3, 0x20

    .line 10
    .line 11
    shr-long v3, v0, v3

    .line 12
    .line 13
    long-to-int v3, v3

    .line 14
    int-to-float v3, v3

    .line 15
    sub-float/2addr v2, v3

    .line 16
    invoke-static {p1, p2}, Ld0/c;->c(J)F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const-wide v3, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v0, v3

    .line 26
    long-to-int p2, v0

    .line 27
    int-to-float p2, p2

    .line 28
    sub-float/2addr p1, p2

    .line 29
    invoke-static {v2, p1}, LU8/v0;->f(FF)J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    iget-object v0, p0, Lt0/y;->v:Lt0/G;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-interface {v0, p1, p2, v1}, Lt0/G;->c(JZ)J

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    :cond_0
    return-wide p1
.end method

.method public final H(Lr0/j;)I
    .locals 4

    .line 1
    const-string v0, "alignmentLine"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt0/y;->m:LD0/b;

    .line 7
    .line 8
    const/high16 v1, -0x80000000

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lt0/y;->v(Lr0/j;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-ne p1, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lr0/t;->g()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    sget v2, LL0/g;->c:I

    .line 24
    .line 25
    const-wide v2, 0xffffffffL

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    and-long/2addr v0, v2

    .line 31
    long-to-int v0, v0

    .line 32
    add-int/2addr p1, v0

    .line 33
    return p1

    .line 34
    :cond_1
    :goto_0
    return v1
.end method

.method public final I()LD0/b;
    .locals 2

    .line 1
    iget-object v0, p0, Lt0/y;->m:LD0/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Asking for measurement result of unmeasured layout modifier"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public abstract J()Lt0/r;
.end method

.method public final K()J
    .locals 3

    .line 1
    iget-object v0, p0, Lt0/y;->i:LL0/b;

    .line 2
    .line 3
    iget-object v1, p0, Lt0/y;->e:Lt0/t;

    .line 4
    .line 5
    iget-object v1, v1, Lt0/t;->q:Lu0/p0;

    .line 6
    .line 7
    invoke-interface {v1}, Lu0/p0;->a()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-interface {v0, v1, v2}, LL0/b;->y(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
.end method

.method public final L(Lt0/O;)Ljava/lang/Object;
    .locals 2

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Lt0/y;->N()Lt0/y;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lt0/y;->a()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return-object p1

    .line 16
    :cond_1
    iget-object v0, p1, LX0/E;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LZ/j;

    .line 19
    .line 20
    check-cast v0, LE/j;

    .line 21
    .line 22
    invoke-virtual {p0}, Lt0/y;->J()Lt0/r;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object p1, p1, LX0/E;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, LX0/E;

    .line 29
    .line 30
    check-cast p1, Lt0/O;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lt0/y;->L(Lt0/O;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const-string p1, "<this>"

    .line 39
    .line 40
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public final M()Lt0/y;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lt0/y;->S()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lt0/y;->e:Lt0/t;

    .line 8
    .line 9
    iget-object v0, v0, Lt0/t;->y:Lt0/F;

    .line 10
    .line 11
    iget-object v0, v0, Lt0/F;->f:Lt0/y;

    .line 12
    .line 13
    iget-object v0, v0, Lt0/y;->f:Lt0/y;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v1, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method public N()Lt0/y;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final O(LX0/E;Lt0/j;JLt0/h;ZZF)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object/from16 v4, p5

    .line 7
    .line 8
    move/from16 v5, p6

    .line 9
    .line 10
    move/from16 v6, p7

    .line 11
    .line 12
    invoke-virtual/range {v0 .. v6}, Lt0/y;->Q(Lt0/j;JLt0/h;ZZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p2, p1}, Lt0/j;->b(LX0/E;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v10

    .line 20
    new-instance v0, Lt0/x;

    .line 21
    .line 22
    move-object v1, p0

    .line 23
    move-object v2, p1

    .line 24
    move-object v3, p2

    .line 25
    move-wide v4, p3

    .line 26
    move-object/from16 v6, p5

    .line 27
    .line 28
    move/from16 v7, p6

    .line 29
    .line 30
    move/from16 v8, p7

    .line 31
    .line 32
    move/from16 v9, p8

    .line 33
    .line 34
    invoke-direct/range {v0 .. v9}, Lt0/x;-><init>(Lt0/y;LX0/E;Lt0/j;JLt0/h;ZZF)V

    .line 35
    .line 36
    .line 37
    move-object v4, v6

    .line 38
    invoke-virtual {v4, v10, v9, v8, v0}, Lt0/h;->c(Ljava/lang/Object;FZLtf/a;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final P(Lt0/j;JLt0/h;ZZ)V
    .locals 13

    .line 1
    move-wide v3, p2

    .line 2
    move-object/from16 v5, p4

    .line 3
    .line 4
    const-string v0, "hitTestSource"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "hitTestResult"

    .line 10
    .line 11
    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget v0, p1, Lt0/j;->a:I

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    goto :goto_0

    .line 21
    :pswitch_0
    const/4 v0, 0x1

    .line 22
    :goto_0
    iget-object v1, p0, Lt0/y;->s:[LX0/E;

    .line 23
    .line 24
    aget-object v1, v1, v0

    .line 25
    .line 26
    invoke-static {v3, v4}, LU8/v0;->R(J)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v2, 0x1

    .line 31
    const/4 v6, 0x0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    iget-object v0, p0, Lt0/y;->v:Lt0/G;

    .line 36
    .line 37
    if-eqz v0, :cond_5

    .line 38
    .line 39
    iget-boolean v7, p0, Lt0/y;->g:Z

    .line 40
    .line 41
    if-eqz v7, :cond_5

    .line 42
    .line 43
    invoke-interface {v0, v3, v4}, Lt0/G;->e(J)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    :goto_1
    if-eqz p5, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0}, Lt0/y;->K()J

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    invoke-virtual {p0, v3, v4, v7, v8}, Lt0/y;->C(JJ)F

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    invoke-static {v8}, Ljava/lang/Float;->isInfinite(F)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_4

    .line 71
    .line 72
    iget v0, v5, Lt0/h;->c:I

    .line 73
    .line 74
    invoke-static {v5}, Lr7/e;->z(Ljava/util/List;)I

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-ne v0, v7, :cond_2

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    invoke-static {v8, v6}, LFe/g;->i(FZ)J

    .line 82
    .line 83
    .line 84
    move-result-wide v9

    .line 85
    invoke-virtual {v5}, Lt0/h;->a()J

    .line 86
    .line 87
    .line 88
    move-result-wide v11

    .line 89
    invoke-static {v11, v12, v9, v10}, LFe/c;->m(JJ)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-lez v0, :cond_3

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    move v2, v6

    .line 97
    :goto_2
    if-eqz v2, :cond_4

    .line 98
    .line 99
    const/4 v7, 0x0

    .line 100
    move-object v0, p0

    .line 101
    move-object v2, p1

    .line 102
    move/from16 v6, p5

    .line 103
    .line 104
    invoke-virtual/range {v0 .. v8}, Lt0/y;->O(LX0/E;Lt0/j;JLt0/h;ZZF)V

    .line 105
    .line 106
    .line 107
    :cond_4
    return-void

    .line 108
    :cond_5
    :goto_3
    if-nez v1, :cond_6

    .line 109
    .line 110
    invoke-virtual/range {p0 .. p6}, Lt0/y;->Q(Lt0/j;JLt0/h;ZZ)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    invoke-static/range {p2 .. p3}, Ld0/c;->b(J)F

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    invoke-static/range {p2 .. p3}, Ld0/c;->c(J)F

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    const/4 v7, 0x0

    .line 123
    cmpl-float v8, v4, v7

    .line 124
    .line 125
    if-ltz v8, :cond_7

    .line 126
    .line 127
    cmpl-float v7, v5, v7

    .line 128
    .line 129
    if-ltz v7, :cond_7

    .line 130
    .line 131
    invoke-virtual {p0}, Lr0/t;->h()I

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    int-to-float v7, v7

    .line 136
    cmpg-float v4, v4, v7

    .line 137
    .line 138
    if-gez v4, :cond_7

    .line 139
    .line 140
    iget-wide v7, p0, Lr0/t;->c:J

    .line 141
    .line 142
    const-wide v9, 0xffffffffL

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    and-long/2addr v7, v9

    .line 148
    long-to-int v4, v7

    .line 149
    int-to-float v4, v4

    .line 150
    cmpg-float v4, v5, v4

    .line 151
    .line 152
    if-gez v4, :cond_7

    .line 153
    .line 154
    invoke-virtual {p1, v1}, Lt0/j;->b(LX0/E;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    new-instance v0, Lt0/w;

    .line 159
    .line 160
    move-object v3, p1

    .line 161
    move-wide v4, p2

    .line 162
    move-object/from16 v6, p4

    .line 163
    .line 164
    move/from16 v7, p5

    .line 165
    .line 166
    move/from16 v8, p6

    .line 167
    .line 168
    move-object v2, v1

    .line 169
    move-object v1, p0

    .line 170
    invoke-direct/range {v0 .. v8}, Lt0/w;-><init>(Lt0/y;LX0/E;Lt0/j;JLt0/h;ZZ)V

    .line 171
    .line 172
    .line 173
    move-object p1, v0

    .line 174
    move-object v5, v6

    .line 175
    move v7, v8

    .line 176
    const/high16 v1, -0x40800000    # -1.0f

    .line 177
    .line 178
    invoke-virtual {v5, v9, v1, v7, p1}, Lt0/h;->c(Ljava/lang/Object;FZLtf/a;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :cond_7
    move-wide v3, p2

    .line 183
    move-object/from16 v5, p4

    .line 184
    .line 185
    move/from16 v7, p6

    .line 186
    .line 187
    if-nez p5, :cond_8

    .line 188
    .line 189
    const/high16 v8, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_8
    invoke-virtual {p0}, Lt0/y;->K()J

    .line 193
    .line 194
    .line 195
    move-result-wide v8

    .line 196
    invoke-virtual {p0, v3, v4, v8, v9}, Lt0/y;->C(JJ)F

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    :goto_4
    invoke-static {v8}, Ljava/lang/Float;->isInfinite(F)Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-nez v9, :cond_b

    .line 205
    .line 206
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    .line 207
    .line 208
    .line 209
    move-result v9

    .line 210
    if-nez v9, :cond_b

    .line 211
    .line 212
    iget v9, v5, Lt0/h;->c:I

    .line 213
    .line 214
    invoke-static {v5}, Lr7/e;->z(Ljava/util/List;)I

    .line 215
    .line 216
    .line 217
    move-result v10

    .line 218
    if-ne v9, v10, :cond_9

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_9
    invoke-static {v8, v7}, LFe/g;->i(FZ)J

    .line 222
    .line 223
    .line 224
    move-result-wide v9

    .line 225
    invoke-virtual {v5}, Lt0/h;->a()J

    .line 226
    .line 227
    .line 228
    move-result-wide v11

    .line 229
    invoke-static {v11, v12, v9, v10}, LFe/c;->m(JJ)I

    .line 230
    .line 231
    .line 232
    move-result v9

    .line 233
    if-lez v9, :cond_a

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_a
    move v2, v6

    .line 237
    :goto_5
    if-eqz v2, :cond_b

    .line 238
    .line 239
    move-object v0, p0

    .line 240
    move-object v2, p1

    .line 241
    move/from16 v6, p5

    .line 242
    .line 243
    invoke-virtual/range {v0 .. v8}, Lt0/y;->O(LX0/E;Lt0/j;JLt0/h;ZZF)V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_b
    move-object v0, p0

    .line 248
    move-object v2, p1

    .line 249
    move-wide v3, p2

    .line 250
    move-object/from16 v5, p4

    .line 251
    .line 252
    move/from16 v6, p5

    .line 253
    .line 254
    move/from16 v7, p6

    .line 255
    .line 256
    invoke-virtual/range {v0 .. v8}, Lt0/y;->d0(LX0/E;Lt0/j;JLt0/h;ZZF)V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    nop

    .line 261
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public Q(Lt0/j;JLt0/h;ZZ)V
    .locals 8

    .line 1
    const-string v0, "hitTestSource"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "hitTestResult"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lt0/y;->N()Lt0/y;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1, p2, p3}, Lt0/y;->G(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    move-object v2, p1

    .line 22
    move-object v5, p4

    .line 23
    move v6, p5

    .line 24
    move v7, p6

    .line 25
    invoke-virtual/range {v1 .. v7}, Lt0/y;->P(Lt0/j;JLt0/h;ZZ)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final R()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/y;->v:Lt0/G;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lt0/G;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lt0/y;->f:Lt0/y;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Lt0/y;->R()V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final S()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lt0/y;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lt0/y;->e:Lt0/t;

    .line 6
    .line 7
    invoke-virtual {v0}, Lt0/t;->r()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v1, "Failed requirement."

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lt0/y;->l:Z

    .line 23
    .line 24
    return v0
.end method

.method public final T()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lt0/y;->v:Lt0/G;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lt0/y;->k:F

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    cmpg-float v0, v0, v1

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    iget-object v0, p0, Lt0/y;->f:Lt0/y;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lt0/y;->T()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final U(Lr0/k;Z)Ld0/d;
    .locals 7

    .line 1
    const-string v0, "sourceCoordinates"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt0/y;->S()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    move-object v0, p1

    .line 13
    check-cast v0, Lt0/y;

    .line 14
    .line 15
    invoke-virtual {v0}, Lt0/y;->S()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    check-cast p1, Lt0/y;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lt0/y;->F(Lt0/y;)Lt0/y;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v2, p0, Lt0/y;->r:Ld0/b;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    new-instance v2, Ld0/b;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    iput v3, v2, Ld0/b;->a:F

    .line 38
    .line 39
    iput v3, v2, Ld0/b;->b:F

    .line 40
    .line 41
    iput v3, v2, Ld0/b;->c:F

    .line 42
    .line 43
    iput v3, v2, Ld0/b;->d:F

    .line 44
    .line 45
    iput-object v2, p0, Lt0/y;->r:Ld0/b;

    .line 46
    .line 47
    :cond_0
    iput v3, v2, Ld0/b;->a:F

    .line 48
    .line 49
    iput v3, v2, Ld0/b;->b:F

    .line 50
    .line 51
    iget-wide v3, v0, Lr0/t;->c:J

    .line 52
    .line 53
    const/16 v0, 0x20

    .line 54
    .line 55
    shr-long v5, v3, v0

    .line 56
    .line 57
    long-to-int v0, v5

    .line 58
    int-to-float v0, v0

    .line 59
    iput v0, v2, Ld0/b;->c:F

    .line 60
    .line 61
    const-wide v5, 0xffffffffL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    and-long/2addr v3, v5

    .line 67
    long-to-int v0, v3

    .line 68
    int-to-float v0, v0

    .line 69
    iput v0, v2, Ld0/b;->d:F

    .line 70
    .line 71
    :goto_0
    if-eq p1, v1, :cond_2

    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    invoke-virtual {p1, v2, p2, v0}, Lt0/y;->a0(Ld0/b;ZZ)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Ld0/b;->b()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_1

    .line 82
    .line 83
    sget-object p1, Ld0/d;->e:Ld0/d;

    .line 84
    .line 85
    return-object p1

    .line 86
    :cond_1
    iget-object p1, p1, Lt0/y;->f:Lt0/y;

    .line 87
    .line 88
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    invoke-virtual {p0, v1, v2, p2}, Lt0/y;->q(Lt0/y;Ld0/b;Z)V

    .line 93
    .line 94
    .line 95
    new-instance p1, Ld0/d;

    .line 96
    .line 97
    iget p2, v2, Ld0/b;->a:F

    .line 98
    .line 99
    iget v0, v2, Ld0/b;->b:F

    .line 100
    .line 101
    iget v1, v2, Ld0/b;->c:F

    .line 102
    .line 103
    iget v2, v2, Ld0/b;->d:F

    .line 104
    .line 105
    invoke-direct {p1, p2, v0, v1, v2}, Ld0/d;-><init>(FFFF)V

    .line 106
    .line 107
    .line 108
    return-object p1

    .line 109
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const-string v0, "LayoutCoordinates "

    .line 112
    .line 113
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string p1, " is not attached!"

    .line 120
    .line 121
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw p2

    .line 138
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 139
    .line 140
    const-string p2, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 141
    .line 142
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p1
.end method

.method public final V(Lt0/i;J)J
    .locals 1

    .line 1
    const-string v0, "sourceCoordinates"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lt0/y;->F(Lt0/y;)Lt0/y;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1, p2, p3}, Lt0/y;->e0(J)J

    .line 13
    .line 14
    .line 15
    move-result-wide p2

    .line 16
    iget-object p1, p1, Lt0/y;->f:Lt0/y;

    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0, v0, p2, p3}, Lt0/y;->r(Lt0/y;J)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    return-wide p1
.end method

.method public final W(J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, Lt0/y;->S()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    :goto_0
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Lt0/y;->e0(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iget-object v0, v0, Lt0/y;->f:Lt0/y;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-wide p1

    .line 18
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string p2, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public final X(Ltf/l;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lt0/y;->h:Ltf/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Lt0/y;->e:Lt0/t;

    .line 6
    .line 7
    if-ne v0, p1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lt0/y;->i:LL0/b;

    .line 10
    .line 11
    iget-object v4, v3, Lt0/t;->n:LL0/b;

    .line 12
    .line 13
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lt0/y;->j:LL0/i;

    .line 20
    .line 21
    iget-object v4, v3, Lt0/t;->p:LL0/i;

    .line 22
    .line 23
    if-eq v0, v4, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v0, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    move v0, v2

    .line 29
    :goto_1
    iput-object p1, p0, Lt0/y;->h:Ltf/l;

    .line 30
    .line 31
    iget-object v4, v3, Lt0/t;->n:LL0/b;

    .line 32
    .line 33
    iput-object v4, p0, Lt0/y;->i:LL0/b;

    .line 34
    .line 35
    iget-object v4, v3, Lt0/t;->p:LL0/i;

    .line 36
    .line 37
    iput-object v4, p0, Lt0/y;->j:LL0/i;

    .line 38
    .line 39
    invoke-virtual {p0}, Lt0/y;->S()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x0

    .line 44
    iget-object v6, p0, Lt0/y;->t:Lt0/p;

    .line 45
    .line 46
    if-eqz v4, :cond_d

    .line 47
    .line 48
    if-eqz p1, :cond_d

    .line 49
    .line 50
    iget-object p1, p0, Lt0/y;->v:Lt0/G;

    .line 51
    .line 52
    if-nez p1, :cond_b

    .line 53
    .line 54
    invoke-static {v3}, LS3/f;->E(Lt0/t;)Lt0/I;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lu0/n;

    .line 59
    .line 60
    const-string v0, "invalidateParentLayer"

    .line 61
    .line 62
    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    iget-object v0, p1, Lu0/n;->g0:Lu0/w0;

    .line 66
    .line 67
    iget-object v4, v0, Lu0/w0;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v4, Ljava/lang/ref/ReferenceQueue;

    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    iget-object v0, v0, Lu0/w0;->a:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, LP/d;

    .line 78
    .line 79
    if-eqz v4, :cond_3

    .line 80
    .line 81
    invoke-virtual {v0, v4}, LP/d;->k(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    :cond_3
    if-nez v4, :cond_2

    .line 85
    .line 86
    :cond_4
    invoke-virtual {v0}, LP/d;->j()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_5

    .line 91
    .line 92
    iget v4, v0, LP/d;->c:I

    .line 93
    .line 94
    sub-int/2addr v4, v2

    .line 95
    invoke-virtual {v0, v4}, LP/d;->m(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    check-cast v4, Ljava/lang/ref/Reference;

    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    if-eqz v4, :cond_4

    .line 106
    .line 107
    move-object v5, v4

    .line 108
    :cond_5
    check-cast v5, Lt0/G;

    .line 109
    .line 110
    if-eqz v5, :cond_6

    .line 111
    .line 112
    invoke-interface {v5, p0, v6}, Lt0/G;->i(Lt0/y;Lt0/p;)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->isHardwareAccelerated()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_7

    .line 121
    .line 122
    iget-boolean v0, p1, Lu0/n;->M:Z

    .line 123
    .line 124
    if-eqz v0, :cond_7

    .line 125
    .line 126
    :try_start_0
    new-instance v5, Lu0/h0;

    .line 127
    .line 128
    invoke-direct {v5, p1, p0, v6}, Lu0/h0;-><init>(Lu0/n;Lt0/y;Lt0/p;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :catchall_0
    iput-boolean v1, p1, Lu0/n;->M:Z

    .line 133
    .line 134
    :cond_7
    iget-object v0, p1, Lu0/n;->A:Lu0/S;

    .line 135
    .line 136
    if-nez v0, :cond_a

    .line 137
    .line 138
    sget-boolean v0, Lu0/s0;->p:Z

    .line 139
    .line 140
    if-nez v0, :cond_8

    .line 141
    .line 142
    new-instance v0, Landroid/view/View;

    .line 143
    .line 144
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v0}, Lu0/Q;->k(Landroid/view/View;)V

    .line 152
    .line 153
    .line 154
    :cond_8
    sget-boolean v0, Lu0/s0;->q:Z

    .line 155
    .line 156
    const-string v1, "context"

    .line 157
    .line 158
    if-eqz v0, :cond_9

    .line 159
    .line 160
    new-instance v0, Lu0/S;

    .line 161
    .line 162
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-direct {v0, v4}, Lu0/S;-><init>(Landroid/content/Context;)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_9
    new-instance v0, Lu0/t0;

    .line 174
    .line 175
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-direct {v0, v4}, Lu0/S;-><init>(Landroid/content/Context;)V

    .line 183
    .line 184
    .line 185
    :goto_2
    iput-object v0, p1, Lu0/n;->A:Lu0/S;

    .line 186
    .line 187
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 188
    .line 189
    .line 190
    :cond_a
    new-instance v5, Lu0/s0;

    .line 191
    .line 192
    iget-object v0, p1, Lu0/n;->A:Lu0/S;

    .line 193
    .line 194
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-direct {v5, p1, v0, p0, v6}, Lu0/s0;-><init>(Lu0/n;Lu0/S;Lt0/y;Lt0/p;)V

    .line 198
    .line 199
    .line 200
    :goto_3
    iget-wide v0, p0, Lr0/t;->c:J

    .line 201
    .line 202
    invoke-interface {v5, v0, v1}, Lt0/G;->d(J)V

    .line 203
    .line 204
    .line 205
    iget-wide v0, p0, Lt0/y;->o:J

    .line 206
    .line 207
    invoke-interface {v5, v0, v1}, Lt0/G;->g(J)V

    .line 208
    .line 209
    .line 210
    iput-object v5, p0, Lt0/y;->v:Lt0/G;

    .line 211
    .line 212
    invoke-virtual {p0}, Lt0/y;->f0()V

    .line 213
    .line 214
    .line 215
    iput-boolean v2, v3, Lt0/t;->B:Z

    .line 216
    .line 217
    invoke-virtual {v6}, Lt0/p;->invoke()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_b
    if-eqz v0, :cond_c

    .line 222
    .line 223
    invoke-virtual {p0}, Lt0/y;->f0()V

    .line 224
    .line 225
    .line 226
    :cond_c
    :goto_4
    return-void

    .line 227
    :cond_d
    iget-object p1, p0, Lt0/y;->v:Lt0/G;

    .line 228
    .line 229
    if-eqz p1, :cond_e

    .line 230
    .line 231
    invoke-interface {p1}, Lt0/G;->destroy()V

    .line 232
    .line 233
    .line 234
    iput-boolean v2, v3, Lt0/t;->B:Z

    .line 235
    .line 236
    invoke-virtual {v6}, Lt0/p;->invoke()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0}, Lt0/y;->S()Z

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    if-eqz p1, :cond_e

    .line 244
    .line 245
    iget-object p1, v3, Lt0/t;->g:Lu0/n;

    .line 246
    .line 247
    if-eqz p1, :cond_e

    .line 248
    .line 249
    invoke-virtual {p1, v3}, Lu0/n;->n(Lt0/t;)V

    .line 250
    .line 251
    .line 252
    :cond_e
    iput-object v5, p0, Lt0/y;->v:Lt0/G;

    .line 253
    .line 254
    iput-boolean v1, p0, Lt0/y;->u:Z

    .line 255
    .line 256
    return-void
.end method

.method public final Y()V
    .locals 8

    .line 1
    iget-object v0, p0, Lt0/y;->s:[LX0/E;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-static {v0, v1}, LFe/e;->H([LX0/E;I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_2

    .line 9
    .line 10
    sget-object v2, LX/m;->a:LDd/c;

    .line 11
    .line 12
    invoke-virtual {v2}, LDd/c;->E()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, LX/g;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-static {v2, v4, v3}, LX/m;->h(LX/g;Ltf/l;Z)LX/g;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :try_start_0
    invoke-virtual {v2}, LX/g;->j()LX/g;

    .line 25
    .line 26
    .line 27
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    :try_start_1
    aget-object v0, v0, v1

    .line 29
    .line 30
    :goto_0
    if-eqz v0, :cond_1

    .line 31
    .line 32
    move-object v1, v0

    .line 33
    check-cast v1, Lt0/O;

    .line 34
    .line 35
    iget-object v1, v1, LX0/E;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, LZ/j;

    .line 38
    .line 39
    check-cast v1, Lr0/r;

    .line 40
    .line 41
    iget-wide v4, p0, Lr0/t;->c:J

    .line 42
    .line 43
    iget-wide v6, v1, Lr0/r;->c:J

    .line 44
    .line 45
    invoke-static {v6, v7, v4, v5}, LL0/h;->a(JJ)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-nez v6, :cond_0

    .line 50
    .line 51
    new-instance v6, LL0/h;

    .line 52
    .line 53
    invoke-direct {v6, v4, v5}, LL0/h;-><init>(J)V

    .line 54
    .line 55
    .line 56
    iget-object v7, v1, Lr0/r;->b:Ltf/l;

    .line 57
    .line 58
    invoke-interface {v7, v6}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    iput-wide v4, v1, Lr0/r;->c:J

    .line 62
    .line 63
    :cond_0
    iget-object v0, v0, LX0/E;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, LX0/E;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    :try_start_2
    invoke-static {v3}, LX/g;->p(LX/g;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, LX/g;->c()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :goto_1
    :try_start_3
    invoke-static {v3}, LX/g;->p(LX/g;)V

    .line 78
    .line 79
    .line 80
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 81
    :catchall_1
    move-exception v0

    .line 82
    invoke-virtual {v2}, LX/g;->c()V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :cond_2
    return-void
.end method

.method public abstract Z(Le0/o;)V
.end method

.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lt0/y;->s:[LX0/E;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    check-cast v0, Lt0/O;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lt0/y;->L(Lt0/O;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final a0(Ld0/b;ZZ)V
    .locals 10

    .line 1
    iget-object v0, p0, Lt0/y;->v:Lt0/G;

    .line 2
    .line 3
    const-wide v1, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/16 v3, 0x20

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iget-boolean v4, p0, Lt0/y;->g:Z

    .line 13
    .line 14
    if-eqz v4, :cond_2

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lt0/y;->K()J

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    invoke-static {p2, p3}, Ld0/f;->d(J)F

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/high16 v5, 0x40000000    # 2.0f

    .line 27
    .line 28
    div-float/2addr v4, v5

    .line 29
    invoke-static {p2, p3}, Ld0/f;->b(J)F

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    div-float/2addr p2, v5

    .line 34
    neg-float p3, v4

    .line 35
    neg-float v5, p2

    .line 36
    iget-wide v6, p0, Lr0/t;->c:J

    .line 37
    .line 38
    shr-long v8, v6, v3

    .line 39
    .line 40
    long-to-int v8, v8

    .line 41
    int-to-float v8, v8

    .line 42
    add-float/2addr v8, v4

    .line 43
    and-long/2addr v6, v1

    .line 44
    long-to-int v4, v6

    .line 45
    int-to-float v4, v4

    .line 46
    add-float/2addr v4, p2

    .line 47
    invoke-virtual {p1, p3, v5, v8, v4}, Ld0/b;->a(FFFF)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    if-eqz p2, :cond_1

    .line 52
    .line 53
    iget-wide p2, p0, Lr0/t;->c:J

    .line 54
    .line 55
    shr-long v4, p2, v3

    .line 56
    .line 57
    long-to-int v4, v4

    .line 58
    int-to-float v4, v4

    .line 59
    and-long/2addr p2, v1

    .line 60
    long-to-int p2, p2

    .line 61
    int-to-float p2, p2

    .line 62
    const/4 p3, 0x0

    .line 63
    invoke-virtual {p1, p3, p3, v4, p2}, Ld0/b;->a(FFFF)V

    .line 64
    .line 65
    .line 66
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ld0/b;->b()Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-eqz p2, :cond_2

    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    const/4 p2, 0x0

    .line 74
    invoke-interface {v0, p1, p2}, Lt0/G;->f(Ld0/b;Z)V

    .line 75
    .line 76
    .line 77
    :cond_3
    iget-wide p2, p0, Lt0/y;->o:J

    .line 78
    .line 79
    sget v0, LL0/g;->c:I

    .line 80
    .line 81
    shr-long v3, p2, v3

    .line 82
    .line 83
    long-to-int v0, v3

    .line 84
    iget v3, p1, Ld0/b;->a:F

    .line 85
    .line 86
    int-to-float v0, v0

    .line 87
    add-float/2addr v3, v0

    .line 88
    iput v3, p1, Ld0/b;->a:F

    .line 89
    .line 90
    iget v3, p1, Ld0/b;->c:F

    .line 91
    .line 92
    add-float/2addr v3, v0

    .line 93
    iput v3, p1, Ld0/b;->c:F

    .line 94
    .line 95
    and-long/2addr p2, v1

    .line 96
    long-to-int p2, p2

    .line 97
    iget p3, p1, Ld0/b;->b:F

    .line 98
    .line 99
    int-to-float p2, p2

    .line 100
    add-float/2addr p3, p2

    .line 101
    iput p3, p1, Ld0/b;->b:F

    .line 102
    .line 103
    iget p3, p1, Ld0/b;->d:F

    .line 104
    .line 105
    add-float/2addr p3, p2

    .line 106
    iput p3, p1, Ld0/b;->d:F

    .line 107
    .line 108
    return-void
.end method

.method public final b0(LD0/b;)V
    .locals 7

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt0/y;->m:LD0/b;

    .line 7
    .line 8
    if-eq p1, v0, :cond_c

    .line 9
    .line 10
    iput-object p1, p0, Lt0/y;->m:LD0/b;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    iget-object v2, p0, Lt0/y;->e:Lt0/t;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget v3, p1, LD0/b;->b:I

    .line 18
    .line 19
    iget v4, v0, LD0/b;->b:I

    .line 20
    .line 21
    if-ne v3, v4, :cond_0

    .line 22
    .line 23
    iget v3, p1, LD0/b;->c:I

    .line 24
    .line 25
    iget v0, v0, LD0/b;->c:I

    .line 26
    .line 27
    if-eq v3, v0, :cond_5

    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Lt0/y;->v:Lt0/G;

    .line 30
    .line 31
    iget v3, p1, LD0/b;->b:I

    .line 32
    .line 33
    iget v4, p1, LD0/b;->c:I

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-static {v3, v4}, LBa/c;->a(II)J

    .line 38
    .line 39
    .line 40
    move-result-wide v5

    .line 41
    invoke-interface {v0, v5, v6}, Lt0/G;->d(J)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget-object v0, p0, Lt0/y;->f:Lt0/y;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0}, Lt0/y;->R()V

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_0
    iget-object v0, v2, Lt0/t;->g:Lu0/n;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lu0/n;->n(Lt0/t;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-static {v3, v4}, LBa/c;->a(II)J

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    iget-wide v5, p0, Lr0/t;->c:J

    .line 64
    .line 65
    invoke-static {v5, v6, v3, v4}, LL0/h;->a(JJ)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    iput-wide v3, p0, Lr0/t;->c:J

    .line 72
    .line 73
    invoke-virtual {p0}, Lr0/t;->o()V

    .line 74
    .line 75
    .line 76
    :cond_4
    iget-object v0, p0, Lt0/y;->s:[LX0/E;

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    aget-object v0, v0, v3

    .line 80
    .line 81
    :goto_1
    if-eqz v0, :cond_5

    .line 82
    .line 83
    move-object v3, v0

    .line 84
    check-cast v3, Lt0/f;

    .line 85
    .line 86
    iput-boolean v1, v3, Lt0/f;->g:Z

    .line 87
    .line 88
    iget-object v0, v0, LX0/E;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, LX0/E;

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_5
    iget-object v0, p0, Lt0/y;->n:Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    if-eqz v0, :cond_6

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_7

    .line 102
    .line 103
    :cond_6
    iget-object v0, p1, LD0/b;->e:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Ljava/util/Map;

    .line 106
    .line 107
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_c

    .line 112
    .line 113
    :cond_7
    iget-object v0, p0, Lt0/y;->n:Ljava/util/LinkedHashMap;

    .line 114
    .line 115
    iget-object p1, p1, LD0/b;->e:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p1, Ljava/util/Map;

    .line 118
    .line 119
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_c

    .line 124
    .line 125
    invoke-virtual {p0}, Lt0/y;->N()Lt0/y;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-eqz v0, :cond_8

    .line 130
    .line 131
    iget-object v0, v0, Lt0/y;->e:Lt0/t;

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_8
    const/4 v0, 0x0

    .line 135
    :goto_2
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_a

    .line 140
    .line 141
    invoke-virtual {v2}, Lt0/t;->j()Lt0/t;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-eqz v0, :cond_9

    .line 146
    .line 147
    invoke-virtual {v0}, Lt0/t;->v()V

    .line 148
    .line 149
    .line 150
    :cond_9
    iget-object v0, v2, Lt0/t;->r:Lt0/u;

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_a
    invoke-virtual {v2}, Lt0/t;->v()V

    .line 157
    .line 158
    .line 159
    :goto_3
    iget-object v0, v2, Lt0/t;->r:Lt0/u;

    .line 160
    .line 161
    iput-boolean v1, v0, Lt0/u;->b:Z

    .line 162
    .line 163
    iget-object v0, p0, Lt0/y;->n:Ljava/util/LinkedHashMap;

    .line 164
    .line 165
    if-nez v0, :cond_b

    .line 166
    .line 167
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 168
    .line 169
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 170
    .line 171
    .line 172
    iput-object v0, p0, Lt0/y;->n:Ljava/util/LinkedHashMap;

    .line 173
    .line 174
    :cond_b
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 175
    .line 176
    .line 177
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 178
    .line 179
    .line 180
    :cond_c
    return-void
.end method

.method public final c0()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lt0/y;->s:[LX0/E;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    check-cast v0, Lt0/L;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lt0/L;->j()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Lt0/y;->N()Lt0/y;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Lt0/y;->c0()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-ne v0, v1, :cond_1

    .line 28
    .line 29
    :goto_0
    return v1

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method public final d0(LX0/E;Lt0/j;JLt0/h;ZZF)V
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object v4, p5

    .line 7
    move v5, p6

    .line 8
    move/from16 v6, p7

    .line 9
    .line 10
    invoke-virtual/range {v0 .. v6}, Lt0/y;->Q(Lt0/j;JLt0/h;ZZ)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget v0, p2, Lt0/j;->a:I

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object v0, p1

    .line 20
    check-cast v0, Lx0/h;

    .line 21
    .line 22
    const-string v2, "entity"

    .line 23
    .line 24
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_0
    move-object v0, p1

    .line 29
    check-cast v0, Lt0/L;

    .line 30
    .line 31
    const-string v2, "entity"

    .line 32
    .line 33
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, v0, LX0/E;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, LZ/j;

    .line 39
    .line 40
    check-cast v0, Lp0/o;

    .line 41
    .line 42
    invoke-interface {v0}, Lp0/o;->s()Lp0/n;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    :goto_0
    iget-object p1, p1, LX0/E;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, LX0/E;

    .line 52
    .line 53
    move-object v0, p0

    .line 54
    move-object v1, p1

    .line 55
    move-object v2, p2

    .line 56
    move-wide v3, p3

    .line 57
    move-object v5, p5

    .line 58
    move v6, p6

    .line 59
    move/from16 v7, p7

    .line 60
    .line 61
    move/from16 v8, p8

    .line 62
    .line 63
    invoke-virtual/range {v0 .. v8}, Lt0/y;->d0(LX0/E;Lt0/j;JLt0/h;ZZF)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final e0(J)J
    .locals 5

    .line 1
    iget-object v0, p0, Lt0/y;->v:Lt0/G;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, p1, p2, v1}, Lt0/G;->c(JZ)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    :cond_0
    iget-wide v0, p0, Lt0/y;->o:J

    .line 11
    .line 12
    invoke-static {p1, p2}, Ld0/c;->b(J)F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    sget v3, LL0/g;->c:I

    .line 17
    .line 18
    const/16 v3, 0x20

    .line 19
    .line 20
    shr-long v3, v0, v3

    .line 21
    .line 22
    long-to-int v3, v3

    .line 23
    int-to-float v3, v3

    .line 24
    add-float/2addr v2, v3

    .line 25
    invoke-static {p1, p2}, Ld0/c;->c(J)F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const-wide v3, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v0, v3

    .line 35
    long-to-int p2, v0

    .line 36
    int-to-float p2, p2

    .line 37
    add-float/2addr p1, p2

    .line 38
    invoke-static {v2, p1}, LU8/v0;->f(FF)J

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    return-wide p1
.end method

.method public final f0()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lt0/y;->v:Lt0/G;

    .line 4
    .line 5
    sget-object v2, Lt0/y;->w:Le0/B;

    .line 6
    .line 7
    iget-object v3, v0, Lt0/y;->e:Lt0/t;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    iget-object v4, v0, Lt0/y;->h:Ltf/l;

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    const/high16 v5, 0x3f800000    # 1.0f

    .line 16
    .line 17
    iput v5, v2, Le0/B;->a:F

    .line 18
    .line 19
    iput v5, v2, Le0/B;->b:F

    .line 20
    .line 21
    iput v5, v2, Le0/B;->c:F

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    iput v5, v2, Le0/B;->d:F

    .line 25
    .line 26
    sget-wide v5, Le0/t;->a:J

    .line 27
    .line 28
    iput-wide v5, v2, Le0/B;->e:J

    .line 29
    .line 30
    iput-wide v5, v2, Le0/B;->f:J

    .line 31
    .line 32
    const/high16 v5, 0x41000000    # 8.0f

    .line 33
    .line 34
    iput v5, v2, Le0/B;->g:F

    .line 35
    .line 36
    sget-wide v5, Le0/J;->b:J

    .line 37
    .line 38
    iput-wide v5, v2, Le0/B;->h:J

    .line 39
    .line 40
    sget-object v5, Le0/z;->a:Lad/I;

    .line 41
    .line 42
    iput-object v5, v2, Le0/B;->i:Le0/E;

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    iput-boolean v5, v2, Le0/B;->j:Z

    .line 46
    .line 47
    iget-object v5, v3, Lt0/t;->n:LL0/b;

    .line 48
    .line 49
    const-string v6, "<set-?>"

    .line 50
    .line 51
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iput-object v5, v2, Le0/B;->k:LL0/b;

    .line 55
    .line 56
    invoke-static {v3}, LS3/f;->E(Lt0/t;)Lt0/I;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    check-cast v5, Lu0/n;

    .line 61
    .line 62
    invoke-virtual {v5}, Lu0/n;->getSnapshotObserver()Lt0/K;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    sget-object v6, Lt0/e;->l:Lt0/e;

    .line 67
    .line 68
    new-instance v7, Lt0/p;

    .line 69
    .line 70
    const/4 v8, 0x2

    .line 71
    invoke-direct {v7, v4, v8}, Lt0/p;-><init>(Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5, v0, v6, v7}, Lt0/K;->a(Lt0/J;Ltf/l;Ltf/a;)V

    .line 75
    .line 76
    .line 77
    iget v4, v2, Le0/B;->a:F

    .line 78
    .line 79
    iget v5, v2, Le0/B;->b:F

    .line 80
    .line 81
    move v6, v4

    .line 82
    iget v4, v2, Le0/B;->c:F

    .line 83
    .line 84
    move v7, v5

    .line 85
    iget v5, v2, Le0/B;->d:F

    .line 86
    .line 87
    iget-wide v11, v2, Le0/B;->e:J

    .line 88
    .line 89
    iget-wide v13, v2, Le0/B;->f:J

    .line 90
    .line 91
    move v8, v6

    .line 92
    iget v6, v2, Le0/B;->g:F

    .line 93
    .line 94
    move v10, v7

    .line 95
    move v9, v8

    .line 96
    iget-wide v7, v2, Le0/B;->h:J

    .line 97
    .line 98
    move v15, v9

    .line 99
    iget-object v9, v2, Le0/B;->i:Le0/E;

    .line 100
    .line 101
    move/from16 v16, v10

    .line 102
    .line 103
    iget-boolean v10, v2, Le0/B;->j:Z

    .line 104
    .line 105
    move-object/from16 v17, v2

    .line 106
    .line 107
    move v2, v15

    .line 108
    iget-object v15, v3, Lt0/t;->p:LL0/i;

    .line 109
    .line 110
    move-object/from16 v18, v1

    .line 111
    .line 112
    iget-object v1, v3, Lt0/t;->n:LL0/b;

    .line 113
    .line 114
    move-object/from16 v19, v3

    .line 115
    .line 116
    move/from16 v3, v16

    .line 117
    .line 118
    move-object/from16 v0, v17

    .line 119
    .line 120
    move-object/from16 v16, v1

    .line 121
    .line 122
    move-object/from16 v1, v18

    .line 123
    .line 124
    invoke-interface/range {v1 .. v16}, Lt0/G;->b(FFFFFJLe0/E;ZJJLL0/i;LL0/b;)V

    .line 125
    .line 126
    .line 127
    iget-boolean v1, v0, Le0/B;->j:Z

    .line 128
    .line 129
    move-object/from16 v2, p0

    .line 130
    .line 131
    iput-boolean v1, v2, Lt0/y;->g:Z

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_0
    move-object v2, v0

    .line 135
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 136
    .line 137
    const-string v1, "Required value was null."

    .line 138
    .line 139
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v0

    .line 143
    :cond_1
    move-object/from16 v19, v2

    .line 144
    .line 145
    move-object v2, v0

    .line 146
    move-object/from16 v0, v19

    .line 147
    .line 148
    move-object/from16 v19, v3

    .line 149
    .line 150
    iget-object v1, v2, Lt0/y;->h:Ltf/l;

    .line 151
    .line 152
    if-nez v1, :cond_3

    .line 153
    .line 154
    :goto_0
    iget v0, v0, Le0/B;->c:F

    .line 155
    .line 156
    iput v0, v2, Lt0/y;->k:F

    .line 157
    .line 158
    move-object/from16 v0, v19

    .line 159
    .line 160
    iget-object v1, v0, Lt0/t;->g:Lu0/n;

    .line 161
    .line 162
    if-eqz v1, :cond_2

    .line 163
    .line 164
    invoke-virtual {v1, v0}, Lu0/n;->n(Lt0/t;)V

    .line 165
    .line 166
    .line 167
    :cond_2
    return-void

    .line 168
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 169
    .line 170
    const-string v1, "Failed requirement."

    .line 171
    .line 172
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Le0/o;

    .line 2
    .line 3
    const-string v0, "canvas"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lt0/y;->e:Lt0/t;

    .line 9
    .line 10
    iget-boolean v1, v0, Lt0/t;->s:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-static {v0}, LS3/f;->E(Lt0/t;)Lt0/I;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lu0/n;

    .line 19
    .line 20
    invoke-virtual {v0}, Lu0/n;->getSnapshotObserver()Lt0/K;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v1, Lt0/e;->k:Lt0/e;

    .line 25
    .line 26
    new-instance v2, LA0/e;

    .line 27
    .line 28
    const/4 v3, 0x5

    .line 29
    invoke-direct {v2, v3, p0, p1}, LA0/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p0, v1, v2}, Lt0/K;->a(Lt0/J;Ltf/l;Ltf/a;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    iput-boolean p1, p0, Lt0/y;->u:Z

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 p1, 0x1

    .line 40
    iput-boolean p1, p0, Lt0/y;->u:Z

    .line 41
    .line 42
    :goto_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 43
    .line 44
    return-object p1
.end method

.method public m(JFLtf/l;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p4}, Lt0/y;->X(Ltf/l;)V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lt0/y;->o:J

    .line 5
    .line 6
    sget p4, LL0/g;->c:I

    .line 7
    .line 8
    cmp-long p4, v0, p1

    .line 9
    .line 10
    if-nez p4, :cond_0

    .line 11
    .line 12
    goto :goto_3

    .line 13
    :cond_0
    iput-wide p1, p0, Lt0/y;->o:J

    .line 14
    .line 15
    iget-object p4, p0, Lt0/y;->v:Lt0/G;

    .line 16
    .line 17
    if-eqz p4, :cond_1

    .line 18
    .line 19
    invoke-interface {p4, p1, p2}, Lt0/G;->g(J)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object p1, p0, Lt0/y;->f:Lt0/y;

    .line 24
    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Lt0/y;->R()V

    .line 28
    .line 29
    .line 30
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lt0/y;->N()Lt0/y;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    iget-object p1, p1, Lt0/y;->e:Lt0/t;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    const/4 p1, 0x0

    .line 40
    :goto_1
    iget-object p2, p0, Lt0/y;->e:Lt0/t;

    .line 41
    .line 42
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-nez p1, :cond_4

    .line 47
    .line 48
    invoke-virtual {p2}, Lt0/t;->v()V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_4
    invoke-virtual {p2}, Lt0/t;->j()Lt0/t;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_5

    .line 57
    .line 58
    invoke-virtual {p1}, Lt0/t;->v()V

    .line 59
    .line 60
    .line 61
    :cond_5
    :goto_2
    iget-object p1, p2, Lt0/t;->g:Lu0/n;

    .line 62
    .line 63
    if-eqz p1, :cond_6

    .line 64
    .line 65
    invoke-virtual {p1, p2}, Lu0/n;->n(Lt0/t;)V

    .line 66
    .line 67
    .line 68
    :cond_6
    :goto_3
    iput p3, p0, Lt0/y;->p:F

    .line 69
    .line 70
    return-void
.end method

.method public final n()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/y;->v:Lt0/G;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final q(Lt0/y;Ld0/b;Z)V
    .locals 6

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lt0/y;->f:Lt0/y;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lt0/y;->q(Lt0/y;Ld0/b;Z)V

    .line 9
    .line 10
    .line 11
    :cond_1
    iget-wide v0, p0, Lt0/y;->o:J

    .line 12
    .line 13
    sget p1, LL0/g;->c:I

    .line 14
    .line 15
    const/16 p1, 0x20

    .line 16
    .line 17
    shr-long v2, v0, p1

    .line 18
    .line 19
    long-to-int v2, v2

    .line 20
    iget v3, p2, Ld0/b;->a:F

    .line 21
    .line 22
    int-to-float v2, v2

    .line 23
    sub-float/2addr v3, v2

    .line 24
    iput v3, p2, Ld0/b;->a:F

    .line 25
    .line 26
    iget v3, p2, Ld0/b;->c:F

    .line 27
    .line 28
    sub-float/2addr v3, v2

    .line 29
    iput v3, p2, Ld0/b;->c:F

    .line 30
    .line 31
    const-wide v2, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v0, v2

    .line 37
    long-to-int v0, v0

    .line 38
    iget v1, p2, Ld0/b;->b:F

    .line 39
    .line 40
    int-to-float v0, v0

    .line 41
    sub-float/2addr v1, v0

    .line 42
    iput v1, p2, Ld0/b;->b:F

    .line 43
    .line 44
    iget v1, p2, Ld0/b;->d:F

    .line 45
    .line 46
    sub-float/2addr v1, v0

    .line 47
    iput v1, p2, Ld0/b;->d:F

    .line 48
    .line 49
    iget-object v0, p0, Lt0/y;->v:Lt0/G;

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    invoke-interface {v0, p2, v1}, Lt0/G;->f(Ld0/b;Z)V

    .line 55
    .line 56
    .line 57
    iget-boolean v0, p0, Lt0/y;->g:Z

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    if-eqz p3, :cond_2

    .line 62
    .line 63
    iget-wide v0, p0, Lr0/t;->c:J

    .line 64
    .line 65
    shr-long v4, v0, p1

    .line 66
    .line 67
    long-to-int p1, v4

    .line 68
    int-to-float p1, p1

    .line 69
    and-long/2addr v0, v2

    .line 70
    long-to-int p3, v0

    .line 71
    int-to-float p3, p3

    .line 72
    const/4 v0, 0x0

    .line 73
    invoke-virtual {p2, v0, v0, p1, p3}, Ld0/b;->a(FFFF)V

    .line 74
    .line 75
    .line 76
    :cond_2
    :goto_0
    return-void
.end method

.method public final r(Lt0/y;J)J
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    return-wide p2

    .line 4
    :cond_0
    iget-object v0, p0, Lt0/y;->f:Lt0/y;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {v0, p1, p2, p3}, Lt0/y;->r(Lt0/y;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    invoke-virtual {p0, p1, p2}, Lt0/y;->G(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    return-wide p1

    .line 24
    :cond_2
    :goto_0
    invoke-virtual {p0, p2, p3}, Lt0/y;->G(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    return-wide p1
.end method

.method public final s()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lt0/y;->l:Z

    .line 3
    .line 4
    iget-object v0, p0, Lt0/y;->h:Ltf/l;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lt0/y;->X(Ltf/l;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lt0/y;->s:[LX0/E;

    .line 10
    .line 11
    array-length v1, v0

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_1

    .line 14
    .line 15
    aget-object v3, v0, v2

    .line 16
    .line 17
    :goto_1
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v3}, LX0/E;->g()V

    .line 20
    .line 21
    .line 22
    iget-object v3, v3, LX0/E;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, LX0/E;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
.end method

.method public abstract v(Lr0/j;)I
.end method
