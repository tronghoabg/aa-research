.class public final Lcom/google/android/gms/internal/ads/zzawp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field private final zza:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzawp;->zza:Z

    return-void
.end method


# virtual methods
.method public final bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 12

    const v0, 0x1d99b65f

    const/16 v1, 0x9

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    const/4 v2, 0x0

    aget v3, v1, v2

    const/4 v4, 0x1

    aget v5, v1, v4

    const/4 v6, 0x2

    aget v6, v1, v6

    const/4 v7, 0x3

    aget v7, v1, v7

    const/4 v8, 0x4

    aget v8, v1, v8

    const/4 v9, 0x5

    aget v9, v1, v9

    const/4 v10, 0x6

    aget v10, v1, v10

    const/4 v11, 0x7

    aget v1, v1, v11

    not-int v11, v3

    and-int/2addr v5, v11

    or-int/2addr v5, v6

    and-int/2addr v3, v7

    or-int/2addr v3, v8

    invoke-static {v5, v3, v9, v10}, Lcb/a;->b(IIII)I

    move-result v3

    rem-int/2addr v1, v0

    check-cast p1, Lcom/google/android/gms/internal/ads/zzawt;

    check-cast p2, Lcom/google/android/gms/internal/ads/zzawt;

    iget v0, p1, Lcom/google/android/gms/internal/ads/zzawt;->zza:I

    iget v5, p2, Lcom/google/android/gms/internal/ads/zzawt;->zza:I

    if-ne v0, v5, :cond_5

    xor-int/2addr v1, v3

    if-eqz v0, :cond_4

    add-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    return v2

    :pswitch_0
    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzawt;->zzq()D

    move-result-wide v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzawt;->zzq()D

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    return p1

    :catch_0
    move-exception p1

    goto :goto_1

    :pswitch_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzawp;->zza:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzawt;->zzp()Lcom/google/android/gms/internal/ads/zzawl;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzawt;->zzp()Lcom/google/android/gms/internal/ads/zzawl;

    move-result-object p2

    if-eq p1, p2, :cond_0

    return v4

    :cond_0
    return v2

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzawt;->zzo()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzawt;->zzo()Ljava/util/List;

    move-result-object p2

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgwd;->zza(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v0

    :goto_0
    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_3
    sget-object v0, Lcom/google/android/gms/internal/ads/zzavx;->zzc:Ljava/util/Comparator;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzawt;->zzn()Lcom/google/android/gms/internal/ads/zzavx;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzawt;->zzn()Lcom/google/android/gms/internal/ads/zzavx;

    move-result-object p2

    goto :goto_0

    :pswitch_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzawt;->zzm()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzawt;->zzm()J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1

    :pswitch_5
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzawp;->zza:Z

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzawt;->zzl()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzawt;->zzl()Ljava/lang/Object;

    move-result-object p2

    if-eq p1, p2, :cond_2

    return v4

    :cond_2
    return v2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_6
    return v2

    :cond_4
    const/4 p1, 0x0

    throw p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzawq; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    new-instance p2, Ljava/lang/AssertionError;

    const-string v0, "CEiv6BFfPnitUE+D"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzavv;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :array_0
    .array-data 4
        0x1aa0264f
        0x6f054c22
        0x40788361
        -0x40d8937e    # -0.65399945f
        -0x2fdd5f1b
        0x41cde1c4
        0x54444e
        0x784006a9
        0x1d99b65f
    .end array-data
.end method
