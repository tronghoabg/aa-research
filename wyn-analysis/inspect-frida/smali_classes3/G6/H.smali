.class public final LG6/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzimz;


# instance fields
.field public final synthetic a:I

.field public final b:Lcom/google/android/gms/internal/ads/zzimz;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzimz;I)V
    .locals 0

    .line 1
    iput p2, p0, LG6/H;->a:I

    iput-object p1, p0, LG6/H;->b:Lcom/google/android/gms/internal/ads/zzimz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LG6/H;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfoi;->zzc()Lcom/google/android/gms/internal/ads/zzhcp;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, LG6/H;->b:Lcom/google/android/gms/internal/ads/zzimz;

    .line 11
    .line 12
    check-cast v1, Lcom/google/android/gms/internal/ads/zzefo;

    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzefo;->zza()Lcom/google/android/gms/internal/ads/zzefn;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, LN6/r;

    .line 19
    .line 20
    invoke-direct {v2, v0, v1}, LN6/r;-><init>(Lcom/google/android/gms/internal/ads/zzhcp;Lcom/google/android/gms/internal/ads/zzefn;)V

    .line 21
    .line 22
    .line 23
    return-object v2

    .line 24
    :pswitch_0
    iget-object v0, p0, LG6/H;->b:Lcom/google/android/gms/internal/ads/zzimz;

    .line 25
    .line 26
    check-cast v0, Lcom/google/android/gms/internal/ads/zzcnz;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcnz;->zza()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, LM6/d;

    .line 33
    .line 34
    invoke-direct {v1, v0}, LM6/d;-><init>(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :pswitch_1
    iget-object v0, p0, LG6/H;->b:Lcom/google/android/gms/internal/ads/zzimz;

    .line 39
    .line 40
    check-cast v0, Lcom/google/android/gms/internal/ads/zzcnz;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcnz;->zza()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v1, LG6/G;

    .line 47
    .line 48
    invoke-direct {v1, v0}, LG6/G;-><init>(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    return-object v1

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
