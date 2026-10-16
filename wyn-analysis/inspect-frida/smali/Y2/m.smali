.class public final LY2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ls2/C;

.field public final b:Z

.field public final c:Z

.field public final d:Landroid/util/SparseArray;

.field public final e:Landroid/util/SparseArray;

.field public final f:LJ5/y;

.field public g:[B

.field public h:I

.field public i:I

.field public j:J

.field public k:Z

.field public l:J

.field public m:LT5/l;

.field public n:LT5/l;

.field public o:Z

.field public p:J

.field public q:J

.field public r:Z

.field public s:Z


# direct methods
.method public constructor <init>(Ls2/C;ZZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY2/m;->a:Ls2/C;

    .line 5
    .line 6
    iput-boolean p2, p0, LY2/m;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, LY2/m;->c:Z

    .line 9
    .line 10
    new-instance p1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LY2/m;->d:Landroid/util/SparseArray;

    .line 16
    .line 17
    new-instance p1, Landroid/util/SparseArray;

    .line 18
    .line 19
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, LY2/m;->e:Landroid/util/SparseArray;

    .line 23
    .line 24
    new-instance p1, LT5/l;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, LY2/m;->m:LT5/l;

    .line 30
    .line 31
    new-instance p1, LT5/l;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, LY2/m;->n:LT5/l;

    .line 37
    .line 38
    const/16 p1, 0x80

    .line 39
    .line 40
    new-array p1, p1, [B

    .line 41
    .line 42
    iput-object p1, p0, LY2/m;->g:[B

    .line 43
    .line 44
    new-instance p2, LJ5/y;

    .line 45
    .line 46
    const/4 p3, 0x0

    .line 47
    const/4 v0, 0x3

    .line 48
    invoke-direct {p2, p3, p1, p3, v0}, LJ5/y;-><init>(I[BII)V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, LY2/m;->f:LJ5/y;

    .line 52
    .line 53
    iput-boolean p3, p0, LY2/m;->k:Z

    .line 54
    .line 55
    iput-boolean p3, p0, LY2/m;->o:Z

    .line 56
    .line 57
    iget-object p1, p0, LY2/m;->n:LT5/l;

    .line 58
    .line 59
    iput-boolean p3, p1, LT5/l;->b:Z

    .line 60
    .line 61
    iput-boolean p3, p1, LT5/l;->a:Z

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-boolean v0, p0, LY2/m;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, LY2/m;->n:LT5/l;

    .line 8
    .line 9
    iget-boolean v3, v0, LT5/l;->b:Z

    .line 10
    .line 11
    if-eqz v3, :cond_1

    .line 12
    .line 13
    iget v0, v0, LT5/l;->d:I

    .line 14
    .line 15
    const/4 v3, 0x7

    .line 16
    if-eq v0, v3, :cond_0

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    if-ne v0, v3, :cond_1

    .line 20
    .line 21
    :cond_0
    move v0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v0, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iget-boolean v0, p0, LY2/m;->s:Z

    .line 26
    .line 27
    :goto_0
    iget-boolean v3, p0, LY2/m;->r:Z

    .line 28
    .line 29
    iget v4, p0, LY2/m;->i:I

    .line 30
    .line 31
    const/4 v5, 0x5

    .line 32
    if-eq v4, v5, :cond_3

    .line 33
    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    if-ne v4, v2, :cond_4

    .line 37
    .line 38
    :cond_3
    move v1, v2

    .line 39
    :cond_4
    or-int v0, v3, v1

    .line 40
    .line 41
    iput-boolean v0, p0, LY2/m;->r:Z

    .line 42
    .line 43
    return-void
.end method
