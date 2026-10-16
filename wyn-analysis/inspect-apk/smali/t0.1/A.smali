.class public final Lt0/A;
.super Lt0/y;
.source "SourceFile"


# static fields
.field public static final C:Lc7/l;


# instance fields
.field public A:Lr0/l;

.field public B:Z

.field public z:Lt0/y;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Le0/z;->d()Lc7/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-wide v1, Le0/q;->f:J

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lc7/l;->e(J)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lc7/l;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/graphics/Paint;

    .line 13
    .line 14
    const-string v2, "<this>"

    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/high16 v2, 0x3f800000    # 1.0f

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Lc7/l;->g(I)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lt0/A;->C:Lc7/l;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final J()Lt0/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/A;->z:Lt0/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt0/y;->J()Lt0/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final N()Lt0/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/A;->z:Lt0/y;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Z(Le0/o;)V
    .locals 1

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt0/A;->z:Lt0/y;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lt0/y;->D(Le0/o;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lt0/y;->e:Lt0/t;

    .line 12
    .line 13
    invoke-static {v0}, LS3/f;->E(Lt0/t;)Lt0/I;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lu0/n;

    .line 18
    .line 19
    invoke-virtual {v0}, Lu0/n;->getShowLayoutBounds()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    sget-object v0, Lt0/A;->C:Lc7/l;

    .line 26
    .line 27
    invoke-virtual {p0, p1, v0}, Lt0/y;->E(Le0/o;Lc7/l;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final e(J)Lr0/t;
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lr0/t;->p(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lt0/A;->A:Lr0/l;

    .line 5
    .line 6
    iget-object v1, p0, Lt0/A;->z:Lt0/y;

    .line 7
    .line 8
    invoke-virtual {v1}, Lt0/y;->J()Lt0/r;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, p0, Lt0/A;->z:Lt0/y;

    .line 13
    .line 14
    invoke-interface {v0, v1, v2, p1, p2}, Lr0/l;->q(Lt0/r;Lr0/m;J)LD0/b;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1}, Lt0/y;->b0(LD0/b;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lt0/y;->v:Lt0/G;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-wide v0, p0, Lr0/t;->c:J

    .line 26
    .line 27
    invoke-interface {p1, v0, v1}, Lt0/G;->d(J)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0}, Lt0/y;->Y()V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method public final m(JFLtf/l;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lt0/y;->m(JFLtf/l;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lt0/y;->f:Lt0/y;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-boolean p1, p1, Lt0/y;->q:Z

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p1, p0, Lt0/y;->s:[LX0/E;

    .line 15
    .line 16
    const/4 p2, 0x4

    .line 17
    aget-object p1, p1, p2

    .line 18
    .line 19
    :goto_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    move-object p2, p1

    .line 22
    check-cast p2, Lt0/O;

    .line 23
    .line 24
    iget-object p2, p2, LX0/E;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p2, LZ/j;

    .line 27
    .line 28
    check-cast p2, Lr0/q;

    .line 29
    .line 30
    invoke-interface {p2, p0}, Lr0/q;->r(Lt0/y;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p1, LX0/E;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, LX0/E;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-wide p1, p0, Lr0/t;->c:J

    .line 39
    .line 40
    const/16 p3, 0x20

    .line 41
    .line 42
    shr-long/2addr p1, p3

    .line 43
    long-to-int p1, p1

    .line 44
    iget-object p2, p0, Lt0/A;->z:Lt0/y;

    .line 45
    .line 46
    invoke-virtual {p2}, Lt0/y;->J()Lt0/r;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    iget-object p2, p2, Lt0/r;->a:Lt0/t;

    .line 51
    .line 52
    iget-object p2, p2, Lt0/t;->p:LL0/i;

    .line 53
    .line 54
    sget p3, Lr0/s;->c:I

    .line 55
    .line 56
    sget-object p4, Lr0/s;->b:LL0/i;

    .line 57
    .line 58
    sput p1, Lr0/s;->c:I

    .line 59
    .line 60
    sput-object p2, Lr0/s;->b:LL0/i;

    .line 61
    .line 62
    invoke-virtual {p0}, Lt0/y;->I()LD0/b;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, LD0/b;->c()V

    .line 67
    .line 68
    .line 69
    sput p3, Lr0/s;->c:I

    .line 70
    .line 71
    sput-object p4, Lr0/s;->b:LL0/i;

    .line 72
    .line 73
    return-void
.end method

.method public final v(Lr0/j;)I
    .locals 5

    .line 1
    const-string v0, "alignmentLine"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt0/y;->I()LD0/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, LD0/b;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/util/Map;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/high16 v1, -0x80000000

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Lt0/y;->I()LD0/b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v0, v0, LD0/b;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/util/Map;

    .line 29
    .line 30
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ljava/lang/Integer;

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    return p1

    .line 43
    :cond_0
    return v1

    .line 44
    :cond_1
    iget-object v0, p0, Lt0/A;->z:Lt0/y;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Lt0/y;->H(Lr0/j;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-ne v0, v1, :cond_2

    .line 51
    .line 52
    return v1

    .line 53
    :cond_2
    const/4 v1, 0x1

    .line 54
    iput-boolean v1, p0, Lt0/y;->q:Z

    .line 55
    .line 56
    iget-wide v1, p0, Lt0/y;->o:J

    .line 57
    .line 58
    iget v3, p0, Lt0/y;->p:F

    .line 59
    .line 60
    iget-object v4, p0, Lt0/y;->h:Ltf/l;

    .line 61
    .line 62
    invoke-virtual {p0, v1, v2, v3, v4}, Lt0/A;->m(JFLtf/l;)V

    .line 63
    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    iput-boolean v1, p0, Lt0/y;->q:Z

    .line 67
    .line 68
    instance-of p1, p1, Lr0/j;

    .line 69
    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    iget-object p1, p0, Lt0/A;->z:Lt0/y;

    .line 73
    .line 74
    iget-wide v1, p1, Lt0/y;->o:J

    .line 75
    .line 76
    const-wide v3, 0xffffffffL

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    and-long/2addr v1, v3

    .line 82
    long-to-int p1, v1

    .line 83
    add-int/2addr v0, p1

    .line 84
    return v0

    .line 85
    :cond_3
    iget-object p1, p0, Lt0/A;->z:Lt0/y;

    .line 86
    .line 87
    iget-wide v1, p1, Lt0/y;->o:J

    .line 88
    .line 89
    const/16 p1, 0x20

    .line 90
    .line 91
    shr-long/2addr v1, p1

    .line 92
    long-to-int p1, v1

    .line 93
    add-int/2addr v0, p1

    .line 94
    return v0
.end method
