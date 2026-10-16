.class public LN1/S;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Z

.field public h:Ll8/e0;

.field public i:Ll8/e0;

.field public j:I

.field public k:I

.field public l:Ll8/e0;

.field public m:LN1/Q;

.field public n:Ll8/e0;

.field public o:I

.field public p:Ljava/util/HashMap;

.field public q:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x7fffffff

    .line 5
    .line 6
    .line 7
    iput v0, p0, LN1/S;->a:I

    .line 8
    .line 9
    iput v0, p0, LN1/S;->b:I

    .line 10
    .line 11
    iput v0, p0, LN1/S;->c:I

    .line 12
    .line 13
    iput v0, p0, LN1/S;->d:I

    .line 14
    .line 15
    iput v0, p0, LN1/S;->e:I

    .line 16
    .line 17
    iput v0, p0, LN1/S;->f:I

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    iput-boolean v1, p0, LN1/S;->g:Z

    .line 21
    .line 22
    sget-object v1, Ll8/K;->b:Ll8/I;

    .line 23
    .line 24
    sget-object v1, Ll8/e0;->e:Ll8/e0;

    .line 25
    .line 26
    iput-object v1, p0, LN1/S;->h:Ll8/e0;

    .line 27
    .line 28
    iput-object v1, p0, LN1/S;->i:Ll8/e0;

    .line 29
    .line 30
    iput v0, p0, LN1/S;->j:I

    .line 31
    .line 32
    iput v0, p0, LN1/S;->k:I

    .line 33
    .line 34
    iput-object v1, p0, LN1/S;->l:Ll8/e0;

    .line 35
    .line 36
    sget-object v0, LN1/Q;->d:LN1/Q;

    .line 37
    .line 38
    iput-object v0, p0, LN1/S;->m:LN1/Q;

    .line 39
    .line 40
    iput-object v1, p0, LN1/S;->n:Ll8/e0;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    iput v0, p0, LN1/S;->o:I

    .line 44
    .line 45
    new-instance v0, Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, LN1/S;->p:Ljava/util/HashMap;

    .line 51
    .line 52
    new-instance v0, Ljava/util/HashSet;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, LN1/S;->q:Ljava/util/HashSet;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final a(Ln2/i;)V
    .locals 2

    .line 1
    iget v0, p1, LN1/T;->a:I

    .line 2
    .line 3
    iput v0, p0, LN1/S;->a:I

    .line 4
    .line 5
    iget v0, p1, LN1/T;->b:I

    .line 6
    .line 7
    iput v0, p0, LN1/S;->b:I

    .line 8
    .line 9
    iget v0, p1, LN1/T;->c:I

    .line 10
    .line 11
    iput v0, p0, LN1/S;->c:I

    .line 12
    .line 13
    iget v0, p1, LN1/T;->d:I

    .line 14
    .line 15
    iput v0, p0, LN1/S;->d:I

    .line 16
    .line 17
    iget v0, p1, LN1/T;->e:I

    .line 18
    .line 19
    iput v0, p0, LN1/S;->e:I

    .line 20
    .line 21
    iget v0, p1, LN1/T;->f:I

    .line 22
    .line 23
    iput v0, p0, LN1/S;->f:I

    .line 24
    .line 25
    iget-boolean v0, p1, LN1/T;->g:Z

    .line 26
    .line 27
    iput-boolean v0, p0, LN1/S;->g:Z

    .line 28
    .line 29
    iget-object v0, p1, LN1/T;->h:Ll8/e0;

    .line 30
    .line 31
    iput-object v0, p0, LN1/S;->h:Ll8/e0;

    .line 32
    .line 33
    iget-object v0, p1, LN1/T;->i:Ll8/e0;

    .line 34
    .line 35
    iput-object v0, p0, LN1/S;->i:Ll8/e0;

    .line 36
    .line 37
    iget v0, p1, LN1/T;->j:I

    .line 38
    .line 39
    iput v0, p0, LN1/S;->j:I

    .line 40
    .line 41
    iget v0, p1, LN1/T;->k:I

    .line 42
    .line 43
    iput v0, p0, LN1/S;->k:I

    .line 44
    .line 45
    iget-object v0, p1, LN1/T;->l:Ll8/e0;

    .line 46
    .line 47
    iput-object v0, p0, LN1/S;->l:Ll8/e0;

    .line 48
    .line 49
    iget-object v0, p1, LN1/T;->m:LN1/Q;

    .line 50
    .line 51
    iput-object v0, p0, LN1/S;->m:LN1/Q;

    .line 52
    .line 53
    iget-object v0, p1, LN1/T;->n:Ll8/e0;

    .line 54
    .line 55
    iput-object v0, p0, LN1/S;->n:Ll8/e0;

    .line 56
    .line 57
    iget v0, p1, LN1/T;->o:I

    .line 58
    .line 59
    iput v0, p0, LN1/S;->o:I

    .line 60
    .line 61
    new-instance v0, Ljava/util/HashSet;

    .line 62
    .line 63
    iget-object v1, p1, LN1/T;->q:Ll8/P;

    .line 64
    .line 65
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, LN1/S;->q:Ljava/util/HashSet;

    .line 69
    .line 70
    new-instance v0, Ljava/util/HashMap;

    .line 71
    .line 72
    iget-object p1, p1, LN1/T;->p:Ll8/j0;

    .line 73
    .line 74
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, LN1/S;->p:Ljava/util/HashMap;

    .line 78
    .line 79
    return-void
.end method

.method public b(II)LN1/S;
    .locals 0

    .line 1
    iput p1, p0, LN1/S;->e:I

    .line 2
    .line 3
    iput p2, p0, LN1/S;->f:I

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, LN1/S;->g:Z

    .line 7
    .line 8
    return-object p0
.end method
