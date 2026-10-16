.class public final Lq2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/ads/nativead/l;

.field public final b:Lq2/m;

.field public final c:LC8/j;

.field public final d:LQ1/t;

.field public final e:LQ1/t;

.field public final f:LG4/f;

.field public g:LN1/Y;

.field public h:LN1/Y;

.field public i:J

.field public j:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/nativead/l;Lq2/m;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq2/p;->a:Lcom/google/android/gms/ads/nativead/l;

    .line 5
    .line 6
    iput-object p2, p0, Lq2/p;->b:Lq2/m;

    .line 7
    .line 8
    new-instance p1, LC8/j;

    .line 9
    .line 10
    const/4 p2, 0x5

    .line 11
    invoke-direct {p1, p2}, LC8/j;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lq2/p;->c:LC8/j;

    .line 15
    .line 16
    new-instance p1, LQ1/t;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    invoke-direct {p1, p2}, LQ1/t;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lq2/p;->d:LQ1/t;

    .line 23
    .line 24
    new-instance p1, LQ1/t;

    .line 25
    .line 26
    invoke-direct {p1, p2}, LQ1/t;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lq2/p;->e:LQ1/t;

    .line 30
    .line 31
    new-instance p1, LG4/f;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    const/16 p2, 0x10

    .line 37
    .line 38
    invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v1, 0x1

    .line 43
    if-eq v0, v1, :cond_0

    .line 44
    .line 45
    const/16 p2, 0xf

    .line 46
    .line 47
    invoke-static {p2}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    shl-int/2addr p2, v1

    .line 52
    :cond_0
    const/4 v0, 0x0

    .line 53
    iput v0, p1, LG4/f;->a:I

    .line 54
    .line 55
    iput v0, p1, LG4/f;->b:I

    .line 56
    .line 57
    new-array v0, p2, [J

    .line 58
    .line 59
    iput-object v0, p1, LG4/f;->d:Ljava/lang/Object;

    .line 60
    .line 61
    sub-int/2addr p2, v1

    .line 62
    iput p2, p1, LG4/f;->c:I

    .line 63
    .line 64
    iput-object p1, p0, Lq2/p;->f:LG4/f;

    .line 65
    .line 66
    sget-object p1, LN1/Y;->d:LN1/Y;

    .line 67
    .line 68
    iput-object p1, p0, Lq2/p;->h:LN1/Y;

    .line 69
    .line 70
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    iput-wide p1, p0, Lq2/p;->j:J

    .line 76
    .line 77
    return-void
.end method
