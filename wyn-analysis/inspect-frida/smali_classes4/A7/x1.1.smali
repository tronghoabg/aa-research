.class public final LA7/x1;
.super LA7/Y;
.source "SourceFile"


# instance fields
.field public c:Lcom/google/android/gms/internal/measurement/zzdh;

.field public d:Z

.field public final e:LY9/c;

.field public final f:LA7/B1;

.field public final g:LS3/s;


# direct methods
.method public constructor <init>(LA7/n0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, LA7/Y;-><init>(LA7/n0;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, LA7/x1;->d:Z

    .line 6
    .line 7
    new-instance p1, LY9/c;

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    invoke-direct {p1, p0, v0}, LY9/c;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LA7/x1;->e:LY9/c;

    .line 14
    .line 15
    new-instance p1, LA7/B1;

    .line 16
    .line 17
    invoke-direct {p1, p0}, LA7/B1;-><init>(LA7/x1;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, LA7/x1;->f:LA7/B1;

    .line 21
    .line 22
    new-instance p1, LS3/s;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    invoke-direct {p1, p0, v0}, LS3/s;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, LA7/x1;->g:LS3/s;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final j0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final k0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LA7/x1;->c:Lcom/google/android/gms/internal/measurement/zzdh;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdh;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzdh;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, LA7/x1;->c:Lcom/google/android/gms/internal/measurement/zzdh;

    .line 18
    .line 19
    :cond_0
    return-void
.end method
