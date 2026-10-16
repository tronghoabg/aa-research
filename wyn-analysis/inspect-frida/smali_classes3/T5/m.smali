.class public final LT5/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LJ5/w;

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


# direct methods
.method public constructor <init>(LJ5/w;ZZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT5/m;->a:LJ5/w;

    .line 5
    .line 6
    iput-boolean p2, p0, LT5/m;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, LT5/m;->c:Z

    .line 9
    .line 10
    new-instance p1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LT5/m;->d:Landroid/util/SparseArray;

    .line 16
    .line 17
    new-instance p1, Landroid/util/SparseArray;

    .line 18
    .line 19
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, LT5/m;->e:Landroid/util/SparseArray;

    .line 23
    .line 24
    new-instance p1, LT5/l;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, LT5/m;->m:LT5/l;

    .line 30
    .line 31
    new-instance p1, LT5/l;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, LT5/m;->n:LT5/l;

    .line 37
    .line 38
    const/16 p1, 0x80

    .line 39
    .line 40
    new-array p1, p1, [B

    .line 41
    .line 42
    iput-object p1, p0, LT5/m;->g:[B

    .line 43
    .line 44
    new-instance p2, LJ5/y;

    .line 45
    .line 46
    const/4 p3, 0x0

    .line 47
    const/4 v0, 0x7

    .line 48
    invoke-direct {p2, p3, p1, p3, v0}, LJ5/y;-><init>(I[BII)V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, LT5/m;->f:LJ5/y;

    .line 52
    .line 53
    iput-boolean p3, p0, LT5/m;->k:Z

    .line 54
    .line 55
    iput-boolean p3, p0, LT5/m;->o:Z

    .line 56
    .line 57
    iget-object p1, p0, LT5/m;->n:LT5/l;

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
