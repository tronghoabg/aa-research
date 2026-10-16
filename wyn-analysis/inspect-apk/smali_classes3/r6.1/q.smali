.class public Lr6/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:Z

.field public l:Ll8/e0;

.field public m:I

.field public n:Ll8/e0;

.field public o:I

.field public p:I

.field public q:I

.field public r:Ll8/e0;

.field public s:Ll8/e0;

.field public t:I

.field public u:I

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Ljava/util/HashMap;

.field public z:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x7fffffff

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lr6/q;->a:I

    .line 8
    .line 9
    iput v0, p0, Lr6/q;->b:I

    .line 10
    .line 11
    iput v0, p0, Lr6/q;->c:I

    .line 12
    .line 13
    iput v0, p0, Lr6/q;->d:I

    .line 14
    .line 15
    iput v0, p0, Lr6/q;->i:I

    .line 16
    .line 17
    iput v0, p0, Lr6/q;->j:I

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    iput-boolean v1, p0, Lr6/q;->k:Z

    .line 21
    .line 22
    sget-object v1, Ll8/K;->b:Ll8/I;

    .line 23
    .line 24
    sget-object v1, Ll8/e0;->e:Ll8/e0;

    .line 25
    .line 26
    iput-object v1, p0, Lr6/q;->l:Ll8/e0;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    iput v2, p0, Lr6/q;->m:I

    .line 30
    .line 31
    iput-object v1, p0, Lr6/q;->n:Ll8/e0;

    .line 32
    .line 33
    iput v2, p0, Lr6/q;->o:I

    .line 34
    .line 35
    iput v0, p0, Lr6/q;->p:I

    .line 36
    .line 37
    iput v0, p0, Lr6/q;->q:I

    .line 38
    .line 39
    iput-object v1, p0, Lr6/q;->r:Ll8/e0;

    .line 40
    .line 41
    iput-object v1, p0, Lr6/q;->s:Ll8/e0;

    .line 42
    .line 43
    iput v2, p0, Lr6/q;->t:I

    .line 44
    .line 45
    iput v2, p0, Lr6/q;->u:I

    .line 46
    .line 47
    iput-boolean v2, p0, Lr6/q;->v:Z

    .line 48
    .line 49
    iput-boolean v2, p0, Lr6/q;->w:Z

    .line 50
    .line 51
    iput-boolean v2, p0, Lr6/q;->x:Z

    .line 52
    .line 53
    new-instance v0, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lr6/q;->y:Ljava/util/HashMap;

    .line 59
    .line 60
    new-instance v0, Ljava/util/HashSet;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lr6/q;->z:Ljava/util/HashSet;

    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr6/q;->y:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lr6/p;

    .line 22
    .line 23
    iget-object v1, v1, Lr6/p;->a:Lf6/Z;

    .line 24
    .line 25
    iget v1, v1, Lf6/Z;->c:I

    .line 26
    .line 27
    if-ne v1, p1, :cond_0

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-void
.end method

.method public final b(Lr6/r;)V
    .locals 2

    .line 1
    iget v0, p1, Lr6/r;->a:I

    .line 2
    .line 3
    iput v0, p0, Lr6/q;->a:I

    .line 4
    .line 5
    iget v0, p1, Lr6/r;->b:I

    .line 6
    .line 7
    iput v0, p0, Lr6/q;->b:I

    .line 8
    .line 9
    iget v0, p1, Lr6/r;->c:I

    .line 10
    .line 11
    iput v0, p0, Lr6/q;->c:I

    .line 12
    .line 13
    iget v0, p1, Lr6/r;->d:I

    .line 14
    .line 15
    iput v0, p0, Lr6/q;->d:I

    .line 16
    .line 17
    iget v0, p1, Lr6/r;->e:I

    .line 18
    .line 19
    iput v0, p0, Lr6/q;->e:I

    .line 20
    .line 21
    iget v0, p1, Lr6/r;->f:I

    .line 22
    .line 23
    iput v0, p0, Lr6/q;->f:I

    .line 24
    .line 25
    iget v0, p1, Lr6/r;->g:I

    .line 26
    .line 27
    iput v0, p0, Lr6/q;->g:I

    .line 28
    .line 29
    iget v0, p1, Lr6/r;->h:I

    .line 30
    .line 31
    iput v0, p0, Lr6/q;->h:I

    .line 32
    .line 33
    iget v0, p1, Lr6/r;->i:I

    .line 34
    .line 35
    iput v0, p0, Lr6/q;->i:I

    .line 36
    .line 37
    iget v0, p1, Lr6/r;->j:I

    .line 38
    .line 39
    iput v0, p0, Lr6/q;->j:I

    .line 40
    .line 41
    iget-boolean v0, p1, Lr6/r;->k:Z

    .line 42
    .line 43
    iput-boolean v0, p0, Lr6/q;->k:Z

    .line 44
    .line 45
    iget-object v0, p1, Lr6/r;->l:Ll8/e0;

    .line 46
    .line 47
    iput-object v0, p0, Lr6/q;->l:Ll8/e0;

    .line 48
    .line 49
    iget v0, p1, Lr6/r;->m:I

    .line 50
    .line 51
    iput v0, p0, Lr6/q;->m:I

    .line 52
    .line 53
    iget-object v0, p1, Lr6/r;->n:Ll8/e0;

    .line 54
    .line 55
    iput-object v0, p0, Lr6/q;->n:Ll8/e0;

    .line 56
    .line 57
    iget v0, p1, Lr6/r;->o:I

    .line 58
    .line 59
    iput v0, p0, Lr6/q;->o:I

    .line 60
    .line 61
    iget v0, p1, Lr6/r;->p:I

    .line 62
    .line 63
    iput v0, p0, Lr6/q;->p:I

    .line 64
    .line 65
    iget v0, p1, Lr6/r;->q:I

    .line 66
    .line 67
    iput v0, p0, Lr6/q;->q:I

    .line 68
    .line 69
    iget-object v0, p1, Lr6/r;->r:Ll8/e0;

    .line 70
    .line 71
    iput-object v0, p0, Lr6/q;->r:Ll8/e0;

    .line 72
    .line 73
    iget-object v0, p1, Lr6/r;->s:Ll8/e0;

    .line 74
    .line 75
    iput-object v0, p0, Lr6/q;->s:Ll8/e0;

    .line 76
    .line 77
    iget v0, p1, Lr6/r;->t:I

    .line 78
    .line 79
    iput v0, p0, Lr6/q;->t:I

    .line 80
    .line 81
    iget v0, p1, Lr6/r;->u:I

    .line 82
    .line 83
    iput v0, p0, Lr6/q;->u:I

    .line 84
    .line 85
    iget-boolean v0, p1, Lr6/r;->v:Z

    .line 86
    .line 87
    iput-boolean v0, p0, Lr6/q;->v:Z

    .line 88
    .line 89
    iget-boolean v0, p1, Lr6/r;->w:Z

    .line 90
    .line 91
    iput-boolean v0, p0, Lr6/q;->w:Z

    .line 92
    .line 93
    iget-boolean v0, p1, Lr6/r;->x:Z

    .line 94
    .line 95
    iput-boolean v0, p0, Lr6/q;->x:Z

    .line 96
    .line 97
    new-instance v0, Ljava/util/HashSet;

    .line 98
    .line 99
    iget-object v1, p1, Lr6/r;->z:Ll8/P;

    .line 100
    .line 101
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 102
    .line 103
    .line 104
    iput-object v0, p0, Lr6/q;->z:Ljava/util/HashSet;

    .line 105
    .line 106
    new-instance v0, Ljava/util/HashMap;

    .line 107
    .line 108
    iget-object p1, p1, Lr6/r;->y:Ll8/j0;

    .line 109
    .line 110
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 111
    .line 112
    .line 113
    iput-object v0, p0, Lr6/q;->y:Ljava/util/HashMap;

    .line 114
    .line 115
    return-void
.end method

.method public c(II)Lr6/q;
    .locals 0

    .line 1
    iput p1, p0, Lr6/q;->i:I

    .line 2
    .line 3
    iput p2, p0, Lr6/q;->j:I

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lr6/q;->k:Z

    .line 7
    .line 8
    return-object p0
.end method
