.class public final LN6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzimz;


# instance fields
.field public final synthetic a:I

.field public final b:Lcom/google/android/gms/internal/ads/zzcnz;

.field public final c:Lcom/google/android/gms/internal/ads/zzini;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcnz;Lcom/google/android/gms/internal/ads/zzini;I)V
    .locals 0

    .line 1
    iput p3, p0, LN6/q;->a:I

    iput-object p1, p0, LN6/q;->b:Lcom/google/android/gms/internal/ads/zzcnz;

    iput-object p2, p0, LN6/q;->c:Lcom/google/android/gms/internal/ads/zzini;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LN6/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN6/q;->b:Lcom/google/android/gms/internal/ads/zzcnz;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcnz;->zza()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, LN6/q;->c:Lcom/google/android/gms/internal/ads/zzini;

    .line 13
    .line 14
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzino;->zzb()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/google/android/gms/internal/ads/zzdzy;

    .line 19
    .line 20
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfoi;->zzc()Lcom/google/android/gms/internal/ads/zzhcp;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    new-instance v3, LN6/x;

    .line 25
    .line 26
    invoke-direct {v3, v0, v1, v2}, LN6/x;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzdzy;Lcom/google/android/gms/internal/ads/zzhcp;)V

    .line 27
    .line 28
    .line 29
    return-object v3

    .line 30
    :pswitch_0
    iget-object v0, p0, LN6/q;->b:Lcom/google/android/gms/internal/ads/zzcnz;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcnz;->zza()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzcri;->zza()Lcom/google/android/gms/internal/ads/zzbih;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzexz;->zzc()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/util/List;

    .line 44
    .line 45
    iget-object v2, p0, LN6/q;->c:Lcom/google/android/gms/internal/ads/zzini;

    .line 46
    .line 47
    check-cast v2, Lcom/google/android/gms/internal/ads/zzcop;

    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcop;->zza()LH6/a;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-instance v3, LN6/b;

    .line 54
    .line 55
    invoke-direct {v3, v0, v1, v2}, LN6/b;-><init>(Landroid/content/Context;Ljava/util/List;LH6/a;)V

    .line 56
    .line 57
    .line 58
    return-object v3

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
