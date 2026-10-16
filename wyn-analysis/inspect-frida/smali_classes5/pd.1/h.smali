.class public final Lpd/h;
.super Lmd/v;
.source "SourceFile"


# static fields
.field public static final m:Lqd/b;

.field public static final n:J

.field public static final o:La2/v;


# instance fields
.field public final a:Lod/N0;

.field public final b:Lod/Y1;

.field public final c:La2/v;

.field public final d:La2/v;

.field public e:Ljavax/net/ssl/SSLSocketFactory;

.field public final f:Lqd/b;

.field public g:I

.field public h:J

.field public final i:J

.field public final j:I

.field public final k:I

.field public final l:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-class v0, Lpd/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    new-instance v0, LK8/f;

    .line 11
    .line 12
    sget-object v1, Lqd/b;->e:Lqd/b;

    .line 13
    .line 14
    invoke-direct {v0, v1}, LK8/f;-><init>(Lqd/b;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x6

    .line 18
    new-array v1, v1, [Lqd/a;

    .line 19
    .line 20
    sget-object v2, Lqd/a;->i:Lqd/a;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    aput-object v2, v1, v3

    .line 24
    .line 25
    sget-object v2, Lqd/a;->k:Lqd/a;

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    aput-object v2, v1, v4

    .line 29
    .line 30
    sget-object v2, Lqd/a;->j:Lqd/a;

    .line 31
    .line 32
    const/4 v5, 0x2

    .line 33
    aput-object v2, v1, v5

    .line 34
    .line 35
    sget-object v2, Lqd/a;->l:Lqd/a;

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    aput-object v2, v1, v5

    .line 39
    .line 40
    sget-object v2, Lqd/a;->n:Lqd/a;

    .line 41
    .line 42
    const/4 v5, 0x4

    .line 43
    aput-object v2, v1, v5

    .line 44
    .line 45
    sget-object v2, Lqd/a;->m:Lqd/a;

    .line 46
    .line 47
    const/4 v5, 0x5

    .line 48
    aput-object v2, v1, v5

    .line 49
    .line 50
    invoke-virtual {v0, v1}, LK8/f;->c([Lqd/a;)V

    .line 51
    .line 52
    .line 53
    new-array v1, v4, [Lqd/m;

    .line 54
    .line 55
    sget-object v2, Lqd/m;->c:Lqd/m;

    .line 56
    .line 57
    aput-object v2, v1, v3

    .line 58
    .line 59
    invoke-virtual {v0, v1}, LK8/f;->f([Lqd/m;)V

    .line 60
    .line 61
    .line 62
    iget-boolean v1, v0, LK8/f;->a:Z

    .line 63
    .line 64
    if-eqz v1, :cond_0

    .line 65
    .line 66
    iput-boolean v4, v0, LK8/f;->b:Z

    .line 67
    .line 68
    new-instance v1, Lqd/b;

    .line 69
    .line 70
    invoke-direct {v1, v0}, Lqd/b;-><init>(LK8/f;)V

    .line 71
    .line 72
    .line 73
    sput-object v1, Lpd/h;->m:Lqd/b;

    .line 74
    .line 75
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 76
    .line 77
    const-wide/16 v1, 0x3e8

    .line 78
    .line 79
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    sput-wide v0, Lpd/h;->n:J

    .line 84
    .line 85
    new-instance v0, Lad/r;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 88
    .line 89
    .line 90
    new-instance v1, La2/v;

    .line 91
    .line 92
    const/16 v2, 0x11

    .line 93
    .line 94
    invoke-direct {v1, v0, v2}, La2/v;-><init>(Ljava/lang/Object;I)V

    .line 95
    .line 96
    .line 97
    sput-object v1, Lpd/h;->o:La2/v;

    .line 98
    .line 99
    sget-object v0, Lmd/p0;->a:Lmd/p0;

    .line 100
    .line 101
    sget-object v1, Lmd/p0;->b:Lmd/p0;

    .line 102
    .line 103
    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 108
    .line 109
    const-string v1, "no TLS extensions for cleartext connections"

    .line 110
    .line 111
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lod/a2;->d:Lod/Y1;

    .line 5
    .line 6
    iput-object v0, p0, Lpd/h;->b:Lod/Y1;

    .line 7
    .line 8
    sget-object v0, Lpd/h;->o:La2/v;

    .line 9
    .line 10
    iput-object v0, p0, Lpd/h;->c:La2/v;

    .line 11
    .line 12
    sget-object v0, Lod/a0;->q:Lod/Y1;

    .line 13
    .line 14
    new-instance v1, La2/v;

    .line 15
    .line 16
    const/16 v2, 0x11

    .line 17
    .line 18
    invoke-direct {v1, v0, v2}, La2/v;-><init>(Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lpd/h;->d:La2/v;

    .line 22
    .line 23
    sget-object v0, Lpd/h;->m:Lqd/b;

    .line 24
    .line 25
    iput-object v0, p0, Lpd/h;->f:Lqd/b;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput v0, p0, Lpd/h;->g:I

    .line 29
    .line 30
    const-wide v0, 0x7fffffffffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    iput-wide v0, p0, Lpd/h;->h:J

    .line 36
    .line 37
    sget-wide v0, Lod/a0;->l:J

    .line 38
    .line 39
    iput-wide v0, p0, Lpd/h;->i:J

    .line 40
    .line 41
    const v0, 0xffff

    .line 42
    .line 43
    .line 44
    iput v0, p0, Lpd/h;->j:I

    .line 45
    .line 46
    const/high16 v0, 0x400000

    .line 47
    .line 48
    iput v0, p0, Lpd/h;->k:I

    .line 49
    .line 50
    const v0, 0x7fffffff

    .line 51
    .line 52
    .line 53
    iput v0, p0, Lpd/h;->l:I

    .line 54
    .line 55
    new-instance v0, Lod/N0;

    .line 56
    .line 57
    new-instance v1, La2/v;

    .line 58
    .line 59
    const/16 v2, 0x14

    .line 60
    .line 61
    invoke-direct {v1, p0, v2}, La2/v;-><init>(Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    new-instance v2, Lcom/google/android/gms/ads/nativead/l;

    .line 65
    .line 66
    const/16 v3, 0xe

    .line 67
    .line 68
    invoke-direct {v2, p0, v3}, Lcom/google/android/gms/ads/nativead/l;-><init>(Ljava/lang/Object;I)V

    .line 69
    .line 70
    .line 71
    invoke-direct {v0, p1, v1, v2}, Lod/N0;-><init>(Ljava/lang/String;La2/v;Lcom/google/android/gms/ads/nativead/l;)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, Lpd/h;->a:Lod/N0;

    .line 75
    .line 76
    return-void
.end method


# virtual methods
.method public final m()Lmd/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lpd/h;->a:Lod/N0;

    .line 2
    .line 3
    return-object v0
.end method
