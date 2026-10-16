.class public final Li0/f;
.super Li0/B;
.source "SourceFile"


# instance fields
.field public b:Le0/m;

.field public c:F

.field public d:Ljava/util/List;

.field public e:F

.field public f:F

.field public g:Le0/m;

.field public h:I

.field public i:I

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Lg0/g;

.field public final r:Le0/f;

.field public final s:Le0/f;

.field public final t:Ljava/lang/Object;

.field public final u:LC8/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Li0/f;->c:F

    .line 7
    .line 8
    sget v1, Li0/I;->a:I

    .line 9
    .line 10
    sget-object v1, Lff/v;->a:Lff/v;

    .line 11
    .line 12
    iput-object v1, p0, Li0/f;->d:Ljava/util/List;

    .line 13
    .line 14
    iput v0, p0, Li0/f;->e:F

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput v1, p0, Li0/f;->h:I

    .line 18
    .line 19
    iput v1, p0, Li0/f;->i:I

    .line 20
    .line 21
    const/high16 v1, 0x40800000    # 4.0f

    .line 22
    .line 23
    iput v1, p0, Li0/f;->j:F

    .line 24
    .line 25
    iput v0, p0, Li0/f;->l:F

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Li0/f;->n:Z

    .line 29
    .line 30
    iput-boolean v0, p0, Li0/f;->o:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Li0/f;->p:Z

    .line 33
    .line 34
    invoke-static {}, Le0/z;->e()Le0/f;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Li0/f;->r:Le0/f;

    .line 39
    .line 40
    invoke-static {}, Le0/z;->e()Le0/f;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Li0/f;->s:Le0/f;

    .line 45
    .line 46
    sget-object v0, Lef/j;->c:Lef/j;

    .line 47
    .line 48
    sget-object v1, Li0/e;->j:Li0/e;

    .line 49
    .line 50
    invoke-static {v0, v1}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Li0/f;->t:Ljava/lang/Object;

    .line 55
    .line 56
    new-instance v0, LC8/i;

    .line 57
    .line 58
    const/16 v1, 0xd

    .line 59
    .line 60
    invoke-direct {v0, v1}, LC8/i;-><init>(I)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Li0/f;->u:LC8/i;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final a(Lg0/d;)V
    .locals 13

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Li0/f;->n:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Li0/f;->u:LC8/i;

    .line 11
    .line 12
    iget-object v1, v0, LC8/i;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Li0/f;->r:Le0/f;

    .line 20
    .line 21
    invoke-virtual {v1}, Le0/f;->c()V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Li0/f;->d:Ljava/util/List;

    .line 25
    .line 26
    const-string v3, "nodes"

    .line 27
    .line 28
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v3, v0, LC8/i;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Ljava/util/ArrayList;

    .line 34
    .line 35
    check-cast v2, Ljava/util/Collection;

    .line 36
    .line 37
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, LC8/i;->y(Le0/x;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Li0/f;->e()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-boolean v0, p0, Li0/f;->p:Z

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-virtual {p0}, Li0/f;->e()V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 55
    iput-boolean v0, p0, Li0/f;->n:Z

    .line 56
    .line 57
    iput-boolean v0, p0, Li0/f;->p:Z

    .line 58
    .line 59
    iget-object v3, p0, Li0/f;->b:Le0/m;

    .line 60
    .line 61
    iget-object v2, p0, Li0/f;->s:Le0/f;

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    iget v4, p0, Li0/f;->c:F

    .line 66
    .line 67
    const/16 v6, 0x38

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    move-object v1, p1

    .line 71
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/consent_sdk/a;->e(Lg0/d;Le0/f;Le0/m;FLg0/g;I)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    move-object v1, p1

    .line 76
    :goto_1
    iget-object v6, p0, Li0/f;->g:Le0/m;

    .line 77
    .line 78
    if-eqz v6, :cond_5

    .line 79
    .line 80
    iget-object p1, p0, Li0/f;->q:Lg0/g;

    .line 81
    .line 82
    iget-boolean v3, p0, Li0/f;->o:Z

    .line 83
    .line 84
    if-nez v3, :cond_4

    .line 85
    .line 86
    if-nez p1, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    move-object v8, p1

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    :goto_2
    new-instance v7, Lg0/g;

    .line 92
    .line 93
    iget v8, p0, Li0/f;->f:F

    .line 94
    .line 95
    iget v9, p0, Li0/f;->j:F

    .line 96
    .line 97
    iget v10, p0, Li0/f;->h:I

    .line 98
    .line 99
    iget v11, p0, Li0/f;->i:I

    .line 100
    .line 101
    const/16 v12, 0x10

    .line 102
    .line 103
    invoke-direct/range {v7 .. v12}, Lg0/g;-><init>(FFIII)V

    .line 104
    .line 105
    .line 106
    iput-object v7, p0, Li0/f;->q:Lg0/g;

    .line 107
    .line 108
    iput-boolean v0, p0, Li0/f;->o:Z

    .line 109
    .line 110
    move-object v8, v7

    .line 111
    :goto_3
    iget v7, p0, Li0/f;->e:F

    .line 112
    .line 113
    const/16 v9, 0x30

    .line 114
    .line 115
    move-object v4, v1

    .line 116
    move-object v5, v2

    .line 117
    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/consent_sdk/a;->e(Lg0/d;Le0/f;Le0/m;FLg0/g;I)V

    .line 118
    .line 119
    .line 120
    :cond_5
    return-void
.end method

.method public final e()V
    .locals 8

    .line 1
    iget-object v0, p0, Li0/f;->s:Le0/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Le0/f;->c()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Li0/f;->k:F

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    cmpg-float v1, v1, v2

    .line 10
    .line 11
    iget-object v3, p0, Li0/f;->r:Le0/f;

    .line 12
    .line 13
    const/high16 v4, 0x3f800000    # 1.0f

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget v1, p0, Li0/f;->l:F

    .line 18
    .line 19
    cmpg-float v1, v1, v4

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    sget-wide v1, Ld0/c;->b:J

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const-string v4, "path"

    .line 29
    .line 30
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v2}, Ld0/c;->b(J)F

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-static {v1, v2}, Ld0/c;->c(J)F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget-object v0, v0, Le0/f;->a:Landroid/graphics/Path;

    .line 42
    .line 43
    iget-object v2, v3, Le0/f;->a:Landroid/graphics/Path;

    .line 44
    .line 45
    invoke-virtual {v0, v2, v4, v1}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;FF)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    iget-object v1, p0, Li0/f;->t:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-interface {v1}, Lef/i;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    check-cast v5, Le0/g;

    .line 56
    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v3, v3, Le0/f;->a:Landroid/graphics/Path;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const/4 v3, 0x0

    .line 66
    :goto_0
    iget-object v5, v5, Le0/g;->a:Landroid/graphics/PathMeasure;

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    invoke-virtual {v5, v3, v6}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v1}, Lef/i;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Le0/g;

    .line 77
    .line 78
    iget-object v3, v3, Le0/g;->a:Landroid/graphics/PathMeasure;

    .line 79
    .line 80
    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->getLength()F

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    iget v5, p0, Li0/f;->k:F

    .line 85
    .line 86
    iget v6, p0, Li0/f;->m:F

    .line 87
    .line 88
    add-float/2addr v5, v6

    .line 89
    rem-float/2addr v5, v4

    .line 90
    mul-float/2addr v5, v3

    .line 91
    iget v7, p0, Li0/f;->l:F

    .line 92
    .line 93
    add-float/2addr v7, v6

    .line 94
    rem-float/2addr v7, v4

    .line 95
    mul-float/2addr v7, v3

    .line 96
    cmpl-float v4, v5, v7

    .line 97
    .line 98
    if-lez v4, :cond_2

    .line 99
    .line 100
    invoke-interface {v1}, Lef/i;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    check-cast v4, Le0/g;

    .line 105
    .line 106
    invoke-virtual {v4, v5, v3, v0}, Le0/g;->a(FFLe0/f;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v1}, Lef/i;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Le0/g;

    .line 114
    .line 115
    invoke-virtual {v1, v2, v7, v0}, Le0/g;->a(FFLe0/f;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_2
    invoke-interface {v1}, Lef/i;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    check-cast v1, Le0/g;

    .line 124
    .line 125
    invoke-virtual {v1, v5, v7, v0}, Le0/g;->a(FFLe0/f;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/f;->r:Le0/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
