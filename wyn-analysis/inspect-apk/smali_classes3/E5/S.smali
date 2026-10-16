.class public final LE5/S;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:I

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Ljava/lang/String;

.field public i:LW5/c;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:I

.field public m:Ljava/util/List;

.field public n:LI5/c;

.field public o:J

.field public p:I

.field public q:I

.field public r:F

.field public s:I

.field public t:F

.field public u:[B

.field public v:I

.field public w:Lv6/b;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, LE5/S;->f:I

    .line 6
    .line 7
    iput v0, p0, LE5/S;->g:I

    .line 8
    .line 9
    iput v0, p0, LE5/S;->l:I

    .line 10
    .line 11
    const-wide v1, 0x7fffffffffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    iput-wide v1, p0, LE5/S;->o:J

    .line 17
    .line 18
    iput v0, p0, LE5/S;->p:I

    .line 19
    .line 20
    iput v0, p0, LE5/S;->q:I

    .line 21
    .line 22
    const/high16 v1, -0x40800000    # -1.0f

    .line 23
    .line 24
    iput v1, p0, LE5/S;->r:F

    .line 25
    .line 26
    const/high16 v1, 0x3f800000    # 1.0f

    .line 27
    .line 28
    iput v1, p0, LE5/S;->t:F

    .line 29
    .line 30
    iput v0, p0, LE5/S;->v:I

    .line 31
    .line 32
    iput v0, p0, LE5/S;->x:I

    .line 33
    .line 34
    iput v0, p0, LE5/S;->y:I

    .line 35
    .line 36
    iput v0, p0, LE5/S;->z:I

    .line 37
    .line 38
    iput v0, p0, LE5/S;->C:I

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    iput v0, p0, LE5/S;->D:I

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a()LE5/T;
    .locals 1

    .line 1
    new-instance v0, LE5/T;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LE5/T;-><init>(LE5/S;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
