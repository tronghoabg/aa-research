.class public final Li0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:J

.field public final g:I

.field public final h:Z

.field public final i:Ljava/util/ArrayList;

.field public final j:Li0/b;

.field public k:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;FFFFJIZ)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li0/c;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Li0/c;->b:F

    .line 7
    .line 8
    iput p3, p0, Li0/c;->c:F

    .line 9
    .line 10
    iput p4, p0, Li0/c;->d:F

    .line 11
    .line 12
    move/from16 p1, p5

    .line 13
    .line 14
    iput p1, p0, Li0/c;->e:F

    .line 15
    .line 16
    move-wide/from16 p1, p6

    .line 17
    .line 18
    iput-wide p1, p0, Li0/c;->f:J

    .line 19
    .line 20
    move/from16 p1, p8

    .line 21
    .line 22
    iput p1, p0, Li0/c;->g:I

    .line 23
    .line 24
    move/from16 p1, p9

    .line 25
    .line 26
    iput-boolean p1, p0, Li0/c;->h:Z

    .line 27
    .line 28
    new-instance p1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Li0/c;->i:Ljava/util/ArrayList;

    .line 34
    .line 35
    new-instance v0, Li0/b;

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    const/16 v10, 0x3ff

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, 0x0

    .line 43
    const/4 v4, 0x0

    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    invoke-direct/range {v0 .. v10}, Li0/b;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;I)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Li0/c;->j:Li0/b;

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a()Li0/d;
    .locals 15

    .line 1
    invoke-virtual {p0}, Li0/c;->b()V

    .line 2
    .line 3
    .line 4
    :goto_0
    iget-object v0, p0, Li0/c;->i:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-le v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Li0/c;->b()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sub-int/2addr v1, v2

    .line 21
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Li0/b;

    .line 26
    .line 27
    invoke-static {v0, v2}, Lka/n;->e(Ljava/util/ArrayList;I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Li0/b;

    .line 32
    .line 33
    iget-object v0, v0, Li0/b;->j:Ljava/util/List;

    .line 34
    .line 35
    new-instance v2, Li0/H;

    .line 36
    .line 37
    iget-object v3, v1, Li0/b;->a:Ljava/lang/String;

    .line 38
    .line 39
    iget v4, v1, Li0/b;->b:F

    .line 40
    .line 41
    iget v5, v1, Li0/b;->c:F

    .line 42
    .line 43
    iget v6, v1, Li0/b;->d:F

    .line 44
    .line 45
    iget v7, v1, Li0/b;->e:F

    .line 46
    .line 47
    iget v8, v1, Li0/b;->f:F

    .line 48
    .line 49
    iget v9, v1, Li0/b;->g:F

    .line 50
    .line 51
    iget v10, v1, Li0/b;->h:F

    .line 52
    .line 53
    iget-object v11, v1, Li0/b;->i:Ljava/util/List;

    .line 54
    .line 55
    iget-object v12, v1, Li0/b;->j:Ljava/util/List;

    .line 56
    .line 57
    invoke-direct/range {v2 .. v12}, Li0/H;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    new-instance v3, Li0/d;

    .line 65
    .line 66
    iget-object v0, p0, Li0/c;->j:Li0/b;

    .line 67
    .line 68
    new-instance v4, Li0/H;

    .line 69
    .line 70
    iget-object v5, v0, Li0/b;->a:Ljava/lang/String;

    .line 71
    .line 72
    iget v6, v0, Li0/b;->b:F

    .line 73
    .line 74
    iget v7, v0, Li0/b;->c:F

    .line 75
    .line 76
    iget v8, v0, Li0/b;->d:F

    .line 77
    .line 78
    iget v9, v0, Li0/b;->e:F

    .line 79
    .line 80
    iget v10, v0, Li0/b;->f:F

    .line 81
    .line 82
    iget v11, v0, Li0/b;->g:F

    .line 83
    .line 84
    iget v12, v0, Li0/b;->h:F

    .line 85
    .line 86
    iget-object v13, v0, Li0/b;->i:Ljava/util/List;

    .line 87
    .line 88
    iget-object v14, v0, Li0/b;->j:Ljava/util/List;

    .line 89
    .line 90
    invoke-direct/range {v4 .. v14}, Li0/H;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    move-object v9, v4

    .line 94
    iget-object v4, p0, Li0/c;->a:Ljava/lang/String;

    .line 95
    .line 96
    iget-wide v10, p0, Li0/c;->f:J

    .line 97
    .line 98
    iget v12, p0, Li0/c;->g:I

    .line 99
    .line 100
    iget v5, p0, Li0/c;->b:F

    .line 101
    .line 102
    iget v6, p0, Li0/c;->c:F

    .line 103
    .line 104
    iget v7, p0, Li0/c;->d:F

    .line 105
    .line 106
    iget v8, p0, Li0/c;->e:F

    .line 107
    .line 108
    iget-boolean v13, p0, Li0/c;->h:Z

    .line 109
    .line 110
    invoke-direct/range {v3 .. v13}, Li0/d;-><init>(Ljava/lang/String;FFFFLi0/H;JIZ)V

    .line 111
    .line 112
    .line 113
    iput-boolean v2, p0, Li0/c;->k:Z

    .line 114
    .line 115
    return-object v3
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Li0/c;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "ImageVector.Builder is single use, create a new instance to create a new ImageVector"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method
