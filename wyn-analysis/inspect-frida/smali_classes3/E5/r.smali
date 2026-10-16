.class public final LE5/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lu6/q;

.field public final c:LE5/p;

.field public final d:LE5/p;

.field public final e:LE5/p;

.field public final f:LE5/p;

.field public g:Landroid/os/Looper;

.field public final h:LG5/h;

.field public final i:I

.field public final j:Z

.field public final k:LE5/C0;

.field public final l:J

.field public final m:J

.field public final n:LE5/j;

.field public final o:J

.field public final p:J

.field public q:Z

.field public final r:Z

.field public s:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    new-instance v0, LE5/p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, LE5/p;-><init>(Landroid/content/Context;I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, LE5/p;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v1, p1, v2}, LE5/p;-><init>(Landroid/content/Context;I)V

    .line 11
    .line 12
    .line 13
    new-instance v3, LE5/p;

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    invoke-direct {v3, p1, v4}, LE5/p;-><init>(Landroid/content/Context;I)V

    .line 17
    .line 18
    .line 19
    new-instance v4, LE5/p;

    .line 20
    .line 21
    const/4 v5, 0x3

    .line 22
    invoke-direct {v4, p1, v5}, LE5/p;-><init>(Landroid/content/Context;I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, LE5/r;->a:Landroid/content/Context;

    .line 32
    .line 33
    iput-object v0, p0, LE5/r;->c:LE5/p;

    .line 34
    .line 35
    iput-object v1, p0, LE5/r;->d:LE5/p;

    .line 36
    .line 37
    iput-object v3, p0, LE5/r;->e:LE5/p;

    .line 38
    .line 39
    iput-object v4, p0, LE5/r;->f:LE5/p;

    .line 40
    .line 41
    sget p1, Lu6/v;->a:I

    .line 42
    .line 43
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :goto_0
    iput-object p1, p0, LE5/r;->g:Landroid/os/Looper;

    .line 55
    .line 56
    sget-object p1, LG5/h;->g:LG5/h;

    .line 57
    .line 58
    iput-object p1, p0, LE5/r;->h:LG5/h;

    .line 59
    .line 60
    iput v2, p0, LE5/r;->i:I

    .line 61
    .line 62
    iput-boolean v2, p0, LE5/r;->j:Z

    .line 63
    .line 64
    sget-object p1, LE5/C0;->c:LE5/C0;

    .line 65
    .line 66
    iput-object p1, p0, LE5/r;->k:LE5/C0;

    .line 67
    .line 68
    const-wide/16 v0, 0x1388

    .line 69
    .line 70
    iput-wide v0, p0, LE5/r;->l:J

    .line 71
    .line 72
    const-wide/16 v0, 0x3a98

    .line 73
    .line 74
    iput-wide v0, p0, LE5/r;->m:J

    .line 75
    .line 76
    const-wide/16 v0, 0x14

    .line 77
    .line 78
    invoke-static {v0, v1}, Lu6/v;->y(J)J

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    const-wide/16 v3, 0x1f4

    .line 83
    .line 84
    invoke-static {v3, v4}, Lu6/v;->y(J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v5

    .line 88
    new-instance p1, LE5/j;

    .line 89
    .line 90
    invoke-direct {p1, v0, v1, v5, v6}, LE5/j;-><init>(JJ)V

    .line 91
    .line 92
    .line 93
    iput-object p1, p0, LE5/r;->n:LE5/j;

    .line 94
    .line 95
    sget-object p1, Lu6/q;->a:Lu6/q;

    .line 96
    .line 97
    iput-object p1, p0, LE5/r;->b:Lu6/q;

    .line 98
    .line 99
    iput-wide v3, p0, LE5/r;->o:J

    .line 100
    .line 101
    const-wide/16 v0, 0x7d0

    .line 102
    .line 103
    iput-wide v0, p0, LE5/r;->p:J

    .line 104
    .line 105
    iput-boolean v2, p0, LE5/r;->r:Z

    .line 106
    .line 107
    return-void
.end method
