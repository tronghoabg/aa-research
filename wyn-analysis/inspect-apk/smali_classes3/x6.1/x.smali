.class public abstract Lx6/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:LD6/X;

.field public static final b:Ld7/d;

.field public static final c:[Ld7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ld7/d;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-string v4, "additional_video_csi"

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    const/4 v5, 0x1

    .line 9
    invoke-direct/range {v0 .. v5}, Ld7/d;-><init>(IJLjava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lx6/x;->b:Ld7/d;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    new-array v1, v1, [Ld7/d;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    aput-object v0, v1, v2

    .line 19
    .line 20
    sput-object v1, Lx6/x;->c:[Ld7/d;

    .line 21
    .line 22
    return-void
.end method

.method public static a(Landroid/content/Context;)LD6/X;
    .locals 4

    .line 1
    sget-object v0, Lx6/x;->a:LD6/X;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lx6/x;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lx6/x;->a:LD6/X;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    sget-object v1, LD6/q;->g:LD6/q;

    .line 13
    .line 14
    iget-object v1, v1, LD6/q;->b:LD6/o;

    .line 15
    .line 16
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbvf;

    .line 17
    .line 18
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzbvf;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v3, LD6/l;

    .line 25
    .line 26
    invoke-direct {v3, v1, p0, v2}, LD6/l;-><init>(LD6/o;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbvf;)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {v3, p0, v1}, LD6/p;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, LD6/X;

    .line 35
    .line 36
    sput-object p0, Lx6/x;->a:LD6/X;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    :goto_0
    monitor-exit v0

    .line 42
    goto :goto_2

    .line 43
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p0

    .line 45
    :cond_1
    :goto_2
    sget-object p0, Lx6/x;->a:LD6/X;

    .line 46
    .line 47
    return-object p0
.end method
