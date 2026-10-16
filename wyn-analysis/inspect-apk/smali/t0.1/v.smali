.class public final Lt0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/d;


# instance fields
.field public final a:Lg0/b;

.field public b:Lt0/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lg0/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lg0/b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lt0/v;->a:Lg0/b;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lt0/v;->a:Lg0/b;

    .line 2
    .line 3
    iget-object v0, v0, Lg0/b;->b:Lba/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lba/a;->v()Le0/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lt0/v;->b:Lt0/f;

    .line 10
    .line 11
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, v1, LX0/E;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, LX0/E;

    .line 17
    .line 18
    check-cast v2, Lt0/f;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2, v0}, Lt0/f;->j(Le0/o;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object v1, v1, LX0/E;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lt0/y;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Lt0/y;->Z(Le0/o;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/v;->a:Lg0/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/b;->b()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lt0/v;->a:Lg0/b;

    .line 2
    .line 3
    iget-object v0, v0, Lg0/b;->b:Lba/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lba/a;->y()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final d(Le0/d;JLg0/c;)V
    .locals 1

    .line 1
    const-string v0, "style"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt0/v;->a:Lg0/b;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3, p4}, Lg0/b;->d(Le0/d;JLg0/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final e(Le0/m;JJFLg0/c;)V
    .locals 6

    .line 1
    const-string v0, "brush"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "style"

    .line 7
    .line 8
    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-wide v0, p2

    .line 12
    move-object p2, p1

    .line 13
    iget-object p1, p0, Lt0/v;->a:Lg0/b;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string p3, "brush"

    .line 19
    .line 20
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string p3, "style"

    .line 24
    .line 25
    invoke-static {p7, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object p3, p1, Lg0/b;->a:Lg0/a;

    .line 29
    .line 30
    iget-object v2, p3, Lg0/a;->c:Le0/o;

    .line 31
    .line 32
    move-wide v3, v0

    .line 33
    invoke-static {v3, v4}, Ld0/c;->b(J)F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    move-object v0, v2

    .line 38
    invoke-static {v3, v4}, Ld0/c;->c(J)F

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-static {v3, v4}, Ld0/c;->b(J)F

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    invoke-static {p4, p5}, Ld0/f;->d(J)F

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    add-float/2addr v5, p3

    .line 51
    invoke-static {v3, v4}, Ld0/c;->c(J)F

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    invoke-static {p4, p5}, Ld0/f;->b(J)F

    .line 56
    .line 57
    .line 58
    move-result p4

    .line 59
    add-float v4, p4, p3

    .line 60
    .line 61
    move p4, p6

    .line 62
    const/4 p6, 0x1

    .line 63
    const/4 p5, 0x0

    .line 64
    move-object p3, p7

    .line 65
    invoke-virtual/range {p1 .. p6}, Lg0/b;->e(Le0/m;Lg0/c;FLe0/r;I)Lc7/l;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    move v3, v5

    .line 70
    move-object v5, p1

    .line 71
    invoke-interface/range {v0 .. v5}, Le0/o;->a(FFFFLc7/l;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final f(Le0/d;JJJJFLe0/r;I)V
    .locals 14

    .line 1
    const-string v0, "image"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lt0/v;->a:Lg0/b;

    .line 7
    .line 8
    move-object v2, p1

    .line 9
    move-wide/from16 v3, p2

    .line 10
    .line 11
    move-wide/from16 v5, p4

    .line 12
    .line 13
    move-wide/from16 v7, p6

    .line 14
    .line 15
    move-wide/from16 v9, p8

    .line 16
    .line 17
    move/from16 v11, p10

    .line 18
    .line 19
    move-object/from16 v12, p11

    .line 20
    .line 21
    move/from16 v13, p12

    .line 22
    .line 23
    invoke-virtual/range {v1 .. v13}, Lg0/b;->f(Le0/d;JJJJFLe0/r;I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final g(Le0/m;JJJFLg0/c;)V
    .locals 11

    .line 1
    move-object/from16 v0, p9

    .line 2
    .line 3
    const-string v1, "brush"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "style"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lt0/v;->a:Lg0/b;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string v2, "brush"

    .line 19
    .line 20
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v2, "style"

    .line 24
    .line 25
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, v1, Lg0/b;->a:Lg0/a;

    .line 29
    .line 30
    iget-object v2, v2, Lg0/a;->c:Le0/o;

    .line 31
    .line 32
    invoke-static {p2, p3}, Ld0/c;->b(J)F

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-static {p2, p3}, Ld0/c;->c(J)F

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-static {p2, p3}, Ld0/c;->b(J)F

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-static/range {p4 .. p5}, Ld0/f;->d(J)F

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    add-float/2addr v6, v5

    .line 49
    invoke-static {p2, p3}, Ld0/c;->c(J)F

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-static/range {p4 .. p5}, Ld0/f;->b(J)F

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    add-float/2addr v7, v5

    .line 58
    invoke-static/range {p6 .. p7}, Ld0/a;->b(J)F

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-static/range {p6 .. p7}, Ld0/a;->c(J)F

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    const/4 v9, 0x1

    .line 67
    const/4 v10, 0x0

    .line 68
    move-object p3, p1

    .line 69
    move/from16 p5, p8

    .line 70
    .line 71
    move-object p4, v0

    .line 72
    move-object p2, v1

    .line 73
    move/from16 p7, v9

    .line 74
    .line 75
    move-object/from16 p6, v10

    .line 76
    .line 77
    invoke-virtual/range {p2 .. p7}, Lg0/b;->e(Le0/m;Lg0/c;FLe0/r;I)Lc7/l;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    move-object/from16 p8, p1

    .line 82
    .line 83
    move-object p1, v2

    .line 84
    move p2, v3

    .line 85
    move p3, v4

    .line 86
    move/from16 p6, v5

    .line 87
    .line 88
    move p4, v6

    .line 89
    move/from16 p5, v7

    .line 90
    .line 91
    move/from16 p7, v8

    .line 92
    .line 93
    invoke-interface/range {p1 .. p8}, Le0/o;->n(FFFFFFLc7/l;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final getFontScale()F
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/v;->a:Lg0/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/b;->getFontScale()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getLayoutDirection()LL0/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/v;->a:Lg0/b;

    .line 2
    .line 3
    iget-object v0, v0, Lg0/b;->a:Lg0/a;

    .line 4
    .line 5
    iget-object v0, v0, Lg0/a;->b:LL0/i;

    .line 6
    .line 7
    return-object v0
.end method

.method public final i(Le0/f;Le0/m;FLg0/c;)V
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "brush"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "style"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lt0/v;->a:Lg0/b;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2, p3, p4}, Lg0/b;->i(Le0/f;Le0/m;FLg0/c;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final j(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/v;->a:Lg0/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p1}, LA7/p0;->a(LL0/b;F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final k(JJJFLg0/c;Le0/r;I)V
    .locals 11

    .line 1
    iget-object v0, p0, Lt0/v;->a:Lg0/b;

    .line 2
    .line 3
    move-wide v1, p1

    .line 4
    move-wide v3, p3

    .line 5
    move-wide/from16 v5, p5

    .line 6
    .line 7
    move/from16 v7, p7

    .line 8
    .line 9
    move-object/from16 v8, p8

    .line 10
    .line 11
    move-object/from16 v9, p9

    .line 12
    .line 13
    move/from16 v10, p10

    .line 14
    .line 15
    invoke-virtual/range {v0 .. v10}, Lg0/b;->k(JJJFLg0/c;Le0/r;I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final l(J)F
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/v;->a:Lg0/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, v0}, LA7/p0;->b(JLL0/b;)F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final t(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/v;->a:Lg0/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/b;->b()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-float/2addr v0, p1

    .line 8
    return v0
.end method

.method public final u()Lba/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/v;->a:Lg0/b;

    .line 2
    .line 3
    iget-object v0, v0, Lg0/b;->b:Lba/a;

    .line 4
    .line 5
    return-object v0
.end method

.method public final w(JFFJJLg0/g;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lt0/v;->a:Lg0/b;

    .line 2
    .line 3
    move-wide v1, p1

    .line 4
    move v3, p3

    .line 5
    move v4, p4

    .line 6
    move-wide v5, p5

    .line 7
    move-wide/from16 v7, p7

    .line 8
    .line 9
    move-object/from16 v9, p9

    .line 10
    .line 11
    invoke-virtual/range {v0 .. v9}, Lg0/b;->w(JFFJJLg0/g;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final x()J
    .locals 2

    .line 1
    iget-object v0, p0, Lt0/v;->a:Lg0/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/b;->x()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final y(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lt0/v;->a:Lg0/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, v0}, LA7/p0;->c(JLL0/b;)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    return-wide p1
.end method

.method public final z(JJJJLg0/c;)V
    .locals 11

    .line 1
    const-string v0, "style"

    .line 2
    .line 3
    move-object/from16 v10, p9

    .line 4
    .line 5
    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lt0/v;->a:Lg0/b;

    .line 9
    .line 10
    move-wide v2, p1

    .line 11
    move-wide v4, p3

    .line 12
    move-wide/from16 v6, p5

    .line 13
    .line 14
    move-wide/from16 v8, p7

    .line 15
    .line 16
    invoke-virtual/range {v1 .. v10}, Lg0/b;->z(JJJJLg0/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
