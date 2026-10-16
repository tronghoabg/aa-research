.class public final Lz0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LK0/g;

.field public final b:J

.field public final c:LE0/l;

.field public final d:LE0/j;

.field public final e:LE0/k;

.field public final f:LE0/o;

.field public final g:Ljava/lang/String;

.field public final h:J

.field public final i:LK0/a;

.field public final j:LK0/h;

.field public final k:LG0/c;

.field public final l:J

.field public final m:LK0/d;

.field public final n:Le0/D;


# direct methods
.method public constructor <init>(JJLE0/l;LE0/j;LE0/k;LE0/o;Ljava/lang/String;JLK0/a;LK0/h;LG0/c;JLK0/d;Le0/D;I)V
    .locals 20

    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 16
    sget-wide v1, Le0/q;->i:J

    goto :goto_0

    :cond_0
    move-wide/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    .line 17
    sget-wide v3, LL0/j;->c:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p3

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v5, p5

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    const/4 v7, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v7, p6

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    const/4 v8, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    const/4 v9, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    const/4 v10, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    .line 18
    sget-wide v11, LL0/j;->c:J

    goto :goto_7

    :cond_7
    move-wide/from16 v11, p10

    :goto_7
    and-int/lit16 v13, v0, 0x100

    if-eqz v13, :cond_8

    const/4 v13, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v13, p12

    :goto_8
    and-int/lit16 v14, v0, 0x200

    if-eqz v14, :cond_9

    const/4 v14, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v14, p13

    :goto_9
    and-int/lit16 v15, v0, 0x400

    if-eqz v15, :cond_a

    const/4 v15, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v15, p14

    :goto_a
    and-int/lit16 v6, v0, 0x800

    if-eqz v6, :cond_b

    .line 19
    sget-wide v16, Le0/q;->i:J

    goto :goto_b

    :cond_b
    move-wide/from16 v16, p15

    :goto_b
    and-int/lit16 v6, v0, 0x1000

    if-eqz v6, :cond_c

    const/4 v6, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v6, p17

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    const/4 v0, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v0, p18

    .line 20
    :goto_d
    sget-wide v18, Le0/q;->i:J

    cmp-long v18, v1, v18

    if-eqz v18, :cond_e

    move-object/from16 p18, v0

    .line 21
    new-instance v0, LK0/b;

    invoke-direct {v0, v1, v2}, LK0/b;-><init>(J)V

    :goto_e
    move-object/from16 p1, p0

    move-object/from16 p2, v0

    move-wide/from16 p3, v3

    move-object/from16 p5, v5

    move-object/from16 p17, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-wide/from16 p10, v11

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p14, v15

    move-wide/from16 p15, v16

    goto :goto_f

    :cond_e
    move-object/from16 p18, v0

    sget-object v0, LK0/f;->a:LK0/f;

    goto :goto_e

    .line 22
    :goto_f
    invoke-direct/range {p1 .. p18}, Lz0/j;-><init>(LK0/g;JLE0/l;LE0/j;LE0/k;LE0/o;Ljava/lang/String;JLK0/a;LK0/h;LG0/c;JLK0/d;Le0/D;)V

    return-void
.end method

.method public constructor <init>(LK0/g;JLE0/l;LE0/j;LE0/k;LE0/o;Ljava/lang/String;JLK0/a;LK0/h;LG0/c;JLK0/d;Le0/D;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lz0/j;->a:LK0/g;

    .line 3
    iput-wide p2, p0, Lz0/j;->b:J

    .line 4
    iput-object p4, p0, Lz0/j;->c:LE0/l;

    .line 5
    iput-object p5, p0, Lz0/j;->d:LE0/j;

    .line 6
    iput-object p6, p0, Lz0/j;->e:LE0/k;

    .line 7
    iput-object p7, p0, Lz0/j;->f:LE0/o;

    .line 8
    iput-object p8, p0, Lz0/j;->g:Ljava/lang/String;

    .line 9
    iput-wide p9, p0, Lz0/j;->h:J

    .line 10
    iput-object p11, p0, Lz0/j;->i:LK0/a;

    .line 11
    iput-object p12, p0, Lz0/j;->j:LK0/h;

    .line 12
    iput-object p13, p0, Lz0/j;->k:LG0/c;

    .line 13
    iput-wide p14, p0, Lz0/j;->l:J

    move-object/from16 p1, p16

    .line 14
    iput-object p1, p0, Lz0/j;->m:LK0/d;

    move-object/from16 p1, p17

    .line 15
    iput-object p1, p0, Lz0/j;->n:Le0/D;

    return-void
.end method


# virtual methods
.method public final a(Lz0/j;)Z
    .locals 7

    .line 1
    const-string v0, "other"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-ne p0, p1, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    iget-wide v1, p0, Lz0/j;->b:J

    .line 11
    .line 12
    iget-wide v3, p1, Lz0/j;->b:J

    .line 13
    .line 14
    invoke-static {v1, v2, v3, v4}, LL0/j;->a(JJ)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    return v2

    .line 22
    :cond_1
    iget-object v1, p0, Lz0/j;->c:LE0/l;

    .line 23
    .line 24
    iget-object v3, p1, Lz0/j;->c:LE0/l;

    .line 25
    .line 26
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    return v2

    .line 33
    :cond_2
    iget-object v1, p0, Lz0/j;->d:LE0/j;

    .line 34
    .line 35
    iget-object v3, p1, Lz0/j;->d:LE0/j;

    .line 36
    .line 37
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_3

    .line 42
    .line 43
    return v2

    .line 44
    :cond_3
    iget-object v1, p0, Lz0/j;->e:LE0/k;

    .line 45
    .line 46
    iget-object v3, p1, Lz0/j;->e:LE0/k;

    .line 47
    .line 48
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_4

    .line 53
    .line 54
    return v2

    .line 55
    :cond_4
    iget-object v1, p0, Lz0/j;->f:LE0/o;

    .line 56
    .line 57
    iget-object v3, p1, Lz0/j;->f:LE0/o;

    .line 58
    .line 59
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_5

    .line 64
    .line 65
    return v2

    .line 66
    :cond_5
    iget-object v1, p0, Lz0/j;->g:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v3, p1, Lz0/j;->g:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_6

    .line 75
    .line 76
    return v2

    .line 77
    :cond_6
    iget-wide v3, p0, Lz0/j;->h:J

    .line 78
    .line 79
    iget-wide v5, p1, Lz0/j;->h:J

    .line 80
    .line 81
    invoke-static {v3, v4, v5, v6}, LL0/j;->a(JJ)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_7

    .line 86
    .line 87
    return v2

    .line 88
    :cond_7
    iget-object v1, p0, Lz0/j;->i:LK0/a;

    .line 89
    .line 90
    iget-object v3, p1, Lz0/j;->i:LK0/a;

    .line 91
    .line 92
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-nez v1, :cond_8

    .line 97
    .line 98
    return v2

    .line 99
    :cond_8
    iget-object v1, p0, Lz0/j;->j:LK0/h;

    .line 100
    .line 101
    iget-object v3, p1, Lz0/j;->j:LK0/h;

    .line 102
    .line 103
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_9

    .line 108
    .line 109
    return v2

    .line 110
    :cond_9
    iget-object v1, p0, Lz0/j;->k:LG0/c;

    .line 111
    .line 112
    iget-object v3, p1, Lz0/j;->k:LG0/c;

    .line 113
    .line 114
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-nez v1, :cond_a

    .line 119
    .line 120
    return v2

    .line 121
    :cond_a
    iget-wide v3, p0, Lz0/j;->l:J

    .line 122
    .line 123
    iget-wide v5, p1, Lz0/j;->l:J

    .line 124
    .line 125
    invoke-static {v3, v4, v5, v6}, Le0/q;->b(JJ)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-nez p1, :cond_b

    .line 130
    .line 131
    return v2

    .line 132
    :cond_b
    return v0
.end method

.method public final b(Lz0/j;)Lz0/j;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v2, v0, Lz0/j;->a:LK0/g;

    .line 9
    .line 10
    iget-object v3, v1, Lz0/j;->a:LK0/g;

    .line 11
    .line 12
    invoke-interface {v2, v3}, LK0/g;->c(LK0/g;)LK0/g;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    iget-object v2, v1, Lz0/j;->f:LE0/o;

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    iget-object v2, v0, Lz0/j;->f:LE0/o;

    .line 21
    .line 22
    :cond_1
    move-object v11, v2

    .line 23
    iget-wide v2, v1, Lz0/j;->b:J

    .line 24
    .line 25
    invoke-static {v2, v3}, LFe/b;->H(J)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_2

    .line 30
    .line 31
    :goto_0
    move-wide v6, v2

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    iget-wide v2, v0, Lz0/j;->b:J

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :goto_1
    iget-object v2, v1, Lz0/j;->c:LE0/l;

    .line 37
    .line 38
    if-nez v2, :cond_3

    .line 39
    .line 40
    iget-object v2, v0, Lz0/j;->c:LE0/l;

    .line 41
    .line 42
    :cond_3
    move-object v8, v2

    .line 43
    iget-object v2, v1, Lz0/j;->d:LE0/j;

    .line 44
    .line 45
    if-nez v2, :cond_4

    .line 46
    .line 47
    iget-object v2, v0, Lz0/j;->d:LE0/j;

    .line 48
    .line 49
    :cond_4
    move-object v9, v2

    .line 50
    iget-object v2, v1, Lz0/j;->e:LE0/k;

    .line 51
    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    iget-object v2, v0, Lz0/j;->e:LE0/k;

    .line 55
    .line 56
    :cond_5
    move-object v10, v2

    .line 57
    iget-object v2, v1, Lz0/j;->g:Ljava/lang/String;

    .line 58
    .line 59
    if-nez v2, :cond_6

    .line 60
    .line 61
    iget-object v2, v0, Lz0/j;->g:Ljava/lang/String;

    .line 62
    .line 63
    :cond_6
    move-object v12, v2

    .line 64
    iget-wide v2, v1, Lz0/j;->h:J

    .line 65
    .line 66
    invoke-static {v2, v3}, LFe/b;->H(J)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-nez v4, :cond_7

    .line 71
    .line 72
    :goto_2
    move-wide v13, v2

    .line 73
    goto :goto_3

    .line 74
    :cond_7
    iget-wide v2, v0, Lz0/j;->h:J

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :goto_3
    iget-object v2, v1, Lz0/j;->i:LK0/a;

    .line 78
    .line 79
    if-nez v2, :cond_8

    .line 80
    .line 81
    iget-object v2, v0, Lz0/j;->i:LK0/a;

    .line 82
    .line 83
    :cond_8
    move-object v15, v2

    .line 84
    iget-object v2, v1, Lz0/j;->j:LK0/h;

    .line 85
    .line 86
    if-nez v2, :cond_9

    .line 87
    .line 88
    iget-object v2, v0, Lz0/j;->j:LK0/h;

    .line 89
    .line 90
    :cond_9
    move-object/from16 v16, v2

    .line 91
    .line 92
    iget-object v2, v1, Lz0/j;->k:LG0/c;

    .line 93
    .line 94
    if-nez v2, :cond_a

    .line 95
    .line 96
    iget-object v2, v0, Lz0/j;->k:LG0/c;

    .line 97
    .line 98
    :cond_a
    move-object/from16 v17, v2

    .line 99
    .line 100
    sget-wide v2, Le0/q;->i:J

    .line 101
    .line 102
    move-wide/from16 v18, v2

    .line 103
    .line 104
    iget-wide v2, v1, Lz0/j;->l:J

    .line 105
    .line 106
    cmp-long v4, v2, v18

    .line 107
    .line 108
    if-eqz v4, :cond_b

    .line 109
    .line 110
    :goto_4
    move-wide/from16 v18, v2

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_b
    iget-wide v2, v0, Lz0/j;->l:J

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :goto_5
    iget-object v2, v1, Lz0/j;->m:LK0/d;

    .line 117
    .line 118
    if-nez v2, :cond_c

    .line 119
    .line 120
    iget-object v2, v0, Lz0/j;->m:LK0/d;

    .line 121
    .line 122
    :cond_c
    move-object/from16 v20, v2

    .line 123
    .line 124
    iget-object v1, v1, Lz0/j;->n:Le0/D;

    .line 125
    .line 126
    if-nez v1, :cond_d

    .line 127
    .line 128
    iget-object v1, v0, Lz0/j;->n:Le0/D;

    .line 129
    .line 130
    :cond_d
    move-object/from16 v21, v1

    .line 131
    .line 132
    new-instance v4, Lz0/j;

    .line 133
    .line 134
    invoke-direct/range {v4 .. v21}, Lz0/j;-><init>(LK0/g;JLE0/l;LE0/j;LE0/k;LE0/o;Ljava/lang/String;JLK0/a;LK0/h;LG0/c;JLK0/d;Le0/D;)V

    .line 135
    .line 136
    .line 137
    return-object v4
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lz0/j;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lz0/j;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lz0/j;->a(Lz0/j;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_5

    .line 18
    .line 19
    iget-object v1, p1, Lz0/j;->a:LK0/g;

    .line 20
    .line 21
    iget-object v3, p0, Lz0/j;->a:LK0/g;

    .line 22
    .line 23
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    iget-object v1, p0, Lz0/j;->m:LK0/d;

    .line 31
    .line 32
    iget-object v3, p1, Lz0/j;->m:LK0/d;

    .line 33
    .line 34
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_3

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    iget-object v1, p0, Lz0/j;->n:Le0/D;

    .line 42
    .line 43
    iget-object p1, p1, Lz0/j;->n:Le0/D;

    .line 44
    .line 45
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_4

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_4
    return v0

    .line 53
    :cond_5
    :goto_0
    return v2
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lz0/j;->a:LK0/g;

    .line 2
    .line 3
    invoke-interface {v0}, LK0/g;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sget v2, Le0/q;->j:I

    .line 8
    .line 9
    invoke-static {v0, v1}, Lef/w;->a(J)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    mul-int/lit16 v0, v0, 0x3c1

    .line 14
    .line 15
    iget-wide v1, p0, Lz0/j;->b:J

    .line 16
    .line 17
    invoke-static {v1, v2}, LL0/j;->d(J)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-int/2addr v1, v0

    .line 22
    mul-int/lit8 v1, v1, 0x1f

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iget-object v2, p0, Lz0/j;->c:LE0/l;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget v2, v2, LE0/l;->a:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v2, v0

    .line 33
    :goto_0
    add-int/2addr v1, v2

    .line 34
    mul-int/lit8 v1, v1, 0x1f

    .line 35
    .line 36
    iget-object v2, p0, Lz0/j;->d:LE0/j;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    iget v2, v2, LE0/j;->a:I

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v2, v0

    .line 44
    :goto_1
    add-int/2addr v1, v2

    .line 45
    mul-int/lit8 v1, v1, 0x1f

    .line 46
    .line 47
    iget-object v2, p0, Lz0/j;->e:LE0/k;

    .line 48
    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    iget v2, v2, LE0/k;->a:I

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move v2, v0

    .line 55
    :goto_2
    add-int/2addr v1, v2

    .line 56
    mul-int/lit8 v1, v1, 0x1f

    .line 57
    .line 58
    iget-object v2, p0, Lz0/j;->f:LE0/o;

    .line 59
    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    move v2, v0

    .line 68
    :goto_3
    add-int/2addr v1, v2

    .line 69
    mul-int/lit8 v1, v1, 0x1f

    .line 70
    .line 71
    iget-object v2, p0, Lz0/j;->g:Ljava/lang/String;

    .line 72
    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    goto :goto_4

    .line 80
    :cond_4
    move v2, v0

    .line 81
    :goto_4
    add-int/2addr v1, v2

    .line 82
    mul-int/lit8 v1, v1, 0x1f

    .line 83
    .line 84
    iget-wide v2, p0, Lz0/j;->h:J

    .line 85
    .line 86
    invoke-static {v2, v3}, LL0/j;->d(J)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    add-int/2addr v2, v1

    .line 91
    mul-int/lit8 v2, v2, 0x1f

    .line 92
    .line 93
    iget-object v1, p0, Lz0/j;->i:LK0/a;

    .line 94
    .line 95
    if-eqz v1, :cond_5

    .line 96
    .line 97
    iget v1, v1, LK0/a;->a:F

    .line 98
    .line 99
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    goto :goto_5

    .line 104
    :cond_5
    move v1, v0

    .line 105
    :goto_5
    add-int/2addr v2, v1

    .line 106
    mul-int/lit8 v2, v2, 0x1f

    .line 107
    .line 108
    iget-object v1, p0, Lz0/j;->j:LK0/h;

    .line 109
    .line 110
    if-eqz v1, :cond_6

    .line 111
    .line 112
    invoke-virtual {v1}, LK0/h;->hashCode()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    goto :goto_6

    .line 117
    :cond_6
    move v1, v0

    .line 118
    :goto_6
    add-int/2addr v2, v1

    .line 119
    mul-int/lit8 v2, v2, 0x1f

    .line 120
    .line 121
    iget-object v1, p0, Lz0/j;->k:LG0/c;

    .line 122
    .line 123
    if-eqz v1, :cond_7

    .line 124
    .line 125
    iget-object v1, v1, LG0/c;->a:Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    goto :goto_7

    .line 132
    :cond_7
    move v1, v0

    .line 133
    :goto_7
    add-int/2addr v2, v1

    .line 134
    mul-int/lit8 v2, v2, 0x1f

    .line 135
    .line 136
    iget-wide v3, p0, Lz0/j;->l:J

    .line 137
    .line 138
    invoke-static {v3, v4}, Lef/w;->a(J)I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    add-int/2addr v1, v2

    .line 143
    mul-int/lit8 v1, v1, 0x1f

    .line 144
    .line 145
    iget-object v2, p0, Lz0/j;->m:LK0/d;

    .line 146
    .line 147
    if-eqz v2, :cond_8

    .line 148
    .line 149
    iget v2, v2, LK0/d;->a:I

    .line 150
    .line 151
    goto :goto_8

    .line 152
    :cond_8
    move v2, v0

    .line 153
    :goto_8
    add-int/2addr v1, v2

    .line 154
    mul-int/lit8 v1, v1, 0x1f

    .line 155
    .line 156
    iget-object v2, p0, Lz0/j;->n:Le0/D;

    .line 157
    .line 158
    if-eqz v2, :cond_9

    .line 159
    .line 160
    invoke-virtual {v2}, Le0/D;->hashCode()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    :cond_9
    add-int/2addr v1, v0

    .line 165
    mul-int/lit8 v1, v1, 0x1f

    .line 166
    .line 167
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SpanStyle(color="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lz0/j;->a:LK0/g;

    .line 9
    .line 10
    invoke-interface {v1}, LK0/g;->a()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    invoke-static {v1, v2}, Le0/q;->h(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, ", brush=null, fontSize="

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-wide v1, p0, Lz0/j;->b:J

    .line 27
    .line 28
    invoke-static {v1, v2}, LL0/j;->e(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", fontWeight="

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lz0/j;->c:LE0/l;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, ", fontStyle="

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lz0/j;->d:LE0/j;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", fontSynthesis="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lz0/j;->e:LE0/k;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", fontFamily="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lz0/j;->f:LE0/o;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ", fontFeatureSettings="

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, Lz0/j;->g:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ", letterSpacing="

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-wide v1, p0, Lz0/j;->h:J

    .line 91
    .line 92
    invoke-static {v1, v2}, LL0/j;->e(J)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v1, ", baselineShift="

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget-object v1, p0, Lz0/j;->i:LK0/a;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v1, ", textGeometricTransform="

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    iget-object v1, p0, Lz0/j;->j:LK0/h;

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v1, ", localeList="

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Lz0/j;->k:LG0/c;

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string v1, ", background="

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    iget-wide v1, p0, Lz0/j;->l:J

    .line 135
    .line 136
    invoke-static {v1, v2}, Le0/q;->h(J)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, ", textDecoration="

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    iget-object v1, p0, Lz0/j;->m:LK0/d;

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v1, ", shadow="

    .line 154
    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    iget-object v1, p0, Lz0/j;->n:Le0/D;

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v1, ", platformStyle=null)"

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    return-object v0
.end method
