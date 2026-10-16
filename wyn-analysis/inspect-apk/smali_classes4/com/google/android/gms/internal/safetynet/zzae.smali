.class public final Lcom/google/android/gms/internal/safetynet/zzae;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Ljava/lang/String; = "zzae"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zza(Lcom/google/android/gms/common/api/o;[BLjava/lang/String;)Lcom/google/android/gms/common/api/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/o;",
            "[B",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/r;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/safetynet/zzi;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/safetynet/zzi;-><init>(Lcom/google/android/gms/common/api/o;[BLjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p0, Lcom/google/android/gms/common/api/internal/J;

    .line 7
    .line 8
    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/J;->b:Lcom/google/android/gms/common/api/l;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/e;)Lcom/google/android/gms/common/api/internal/e;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static varargs zzb(Lcom/google/android/gms/common/api/o;Ljava/lang/String;ILjava/lang/String;[I)Lcom/google/android/gms/common/api/r;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/o;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "[I)",
            "Lcom/google/android/gms/common/api/r;"
        }
    .end annotation

    .line 1
    array-length v0, p4

    .line 2
    if-eqz v0, :cond_1

    .line 3
    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v1, Lcom/google/android/gms/internal/safetynet/zzk;

    .line 11
    .line 12
    move-object v2, p0

    .line 13
    move-object v5, p1

    .line 14
    move v4, p2

    .line 15
    move-object v6, p3

    .line 16
    move-object v3, p4

    .line 17
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/safetynet/zzk;-><init>(Lcom/google/android/gms/common/api/o;[IILjava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    move-object p0, v2

    .line 21
    check-cast p0, Lcom/google/android/gms/common/api/internal/J;

    .line 22
    .line 23
    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/J;->b:Lcom/google/android/gms/common/api/l;

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/e;)Lcom/google/android/gms/common/api/internal/e;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    const-string p1, "Null or empty uri in lookupUri"

    .line 33
    .line 34
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p0

    .line 38
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    const-string p1, "Null threatTypes in lookupUri"

    .line 41
    .line 42
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p0
.end method


# virtual methods
.method public final attest(Lcom/google/android/gms/common/api/o;[B)Lcom/google/android/gms/common/api/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/o;",
            "[B)",
            "Lcom/google/android/gms/common/api/r;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/safetynet/zzae;->zza(Lcom/google/android/gms/common/api/o;[BLjava/lang/String;)Lcom/google/android/gms/common/api/r;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public final enableVerifyApps(Lcom/google/android/gms/common/api/o;)Lcom/google/android/gms/common/api/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/o;",
            ")",
            "Lcom/google/android/gms/common/api/r;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/safetynet/zzm;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/safetynet/zzm;-><init>(Lcom/google/android/gms/internal/safetynet/zzae;Lcom/google/android/gms/common/api/o;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/google/android/gms/common/api/internal/J;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/J;->b:Lcom/google/android/gms/common/api/l;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/e;)Lcom/google/android/gms/common/api/internal/e;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final isVerifyAppsEnabled(Lcom/google/android/gms/common/api/o;)Lcom/google/android/gms/common/api/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/o;",
            ")",
            "Lcom/google/android/gms/common/api/r;"
        }
    .end annotation

    .line 19
    new-instance v0, Lcom/google/android/gms/internal/safetynet/zzl;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/safetynet/zzl;-><init>(Lcom/google/android/gms/internal/safetynet/zzae;Lcom/google/android/gms/common/api/o;)V

    check-cast p1, Lcom/google/android/gms/common/api/internal/J;

    .line 20
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/J;->b:Lcom/google/android/gms/common/api/l;

    .line 21
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/e;)Lcom/google/android/gms/common/api/internal/e;

    move-result-object p1

    return-object p1
.end method

.method public final isVerifyAppsEnabled(Landroid/content/Context;)Z
    .locals 7

    .line 1
    sget-object v0, LC7/c;->a:Lcom/google/android/gms/common/api/i;

    .line 2
    new-instance v1, LC7/g;

    .line 3
    new-instance v0, Lcom/google/android/gms/common/api/internal/a;

    .line 4
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    .line 6
    new-instance v6, Lcom/google/android/gms/common/api/k;

    invoke-direct {v6, v0, v2}, Lcom/google/android/gms/common/api/k;-><init>(Lcom/google/android/gms/common/api/internal/a;Landroid/os/Looper;)V

    .line 7
    sget-object v4, LC7/c;->a:Lcom/google/android/gms/common/api/i;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    .line 8
    invoke-static {}, Lcom/google/android/gms/common/api/internal/A;->a()LN7/e;

    move-result-object p1

    const/16 v0, 0x1069

    .line 9
    iput v0, p1, LN7/e;->c:I

    .line 10
    new-instance v0, Lc8/e;

    invoke-direct {v0, v1}, Lc8/e;-><init>(LC7/g;)V

    .line 11
    iput-object v0, p1, LN7/e;->d:Ljava/lang/Object;

    .line 12
    invoke-virtual {p1}, LN7/e;->e()Lcom/google/android/gms/common/api/internal/V;

    move-result-object p1

    .line 13
    invoke-virtual {v1, p1}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/A;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    .line 14
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3a98

    .line 15
    invoke-static {p1, v1, v2, v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC7/f;

    .line 17
    iget-object p1, p1, LA7/B0;->a:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/common/api/t;

    .line 18
    check-cast p1, Lcom/google/android/gms/internal/safetynet/zzad;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/safetynet/zzad;->isVerifyAppsEnabled()Z

    move-result p1

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public final listHarmfulApps(Lcom/google/android/gms/common/api/o;)Lcom/google/android/gms/common/api/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/o;",
            ")",
            "Lcom/google/android/gms/common/api/r;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/safetynet/zzn;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/safetynet/zzn;-><init>(Lcom/google/android/gms/internal/safetynet/zzae;Lcom/google/android/gms/common/api/o;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/google/android/gms/common/api/internal/J;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/J;->b:Lcom/google/android/gms/common/api/l;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/e;)Lcom/google/android/gms/common/api/internal/e;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final varargs lookupUri(Lcom/google/android/gms/common/api/o;Ljava/lang/String;Ljava/lang/String;[I)Lcom/google/android/gms/common/api/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/o;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[I)",
            "Lcom/google/android/gms/common/api/r;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-static {p1, p2, v0, p3, p4}, Lcom/google/android/gms/internal/safetynet/zzae;->zzb(Lcom/google/android/gms/common/api/o;Ljava/lang/String;ILjava/lang/String;[I)Lcom/google/android/gms/common/api/r;

    move-result-object p1

    return-object p1
.end method

.method public final lookupUri(Lcom/google/android/gms/common/api/o;Ljava/util/List;Ljava/lang/String;)Lcom/google/android/gms/common/api/r;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/o;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/r;"
        }
    .end annotation

    if-eqz p2, :cond_1

    .line 2
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    new-instance v1, Lcom/google/android/gms/internal/safetynet/zzj;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/safetynet/zzj;-><init>(Lcom/google/android/gms/internal/safetynet/zzae;Lcom/google/android/gms/common/api/o;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    move-object p1, v3

    check-cast p1, Lcom/google/android/gms/common/api/internal/J;

    .line 4
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/J;->b:Lcom/google/android/gms/common/api/l;

    .line 5
    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/e;)Lcom/google/android/gms/common/api/internal/e;

    move-result-object p1

    return-object p1

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null or empty uri in lookupUri"

    .line 7
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null threatTypes in lookupUri"

    .line 9
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final verifyWithRecaptcha(Lcom/google/android/gms/common/api/o;Ljava/lang/String;)Lcom/google/android/gms/common/api/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/o;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/r;"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lcom/google/android/gms/internal/safetynet/zzo;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/safetynet/zzo;-><init>(Lcom/google/android/gms/internal/safetynet/zzae;Lcom/google/android/gms/common/api/o;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast p1, Lcom/google/android/gms/common/api/internal/J;

    .line 13
    .line 14
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/J;->b:Lcom/google/android/gms/common/api/l;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/e;)Lcom/google/android/gms/common/api/internal/e;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 22
    .line 23
    const-string p2, "Null or empty site key in verifyWithRecaptcha"

    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method
