.class final synthetic Lcom/google/android/gms/internal/ads/zzeig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzeiq;

.field private final synthetic zzb:Lp8/p;

.field private final synthetic zzc:Lp8/p;

.field private final synthetic zzd:Lcom/google/android/gms/internal/ads/zzcbk;

.field private final synthetic zze:Lcom/google/android/gms/internal/ads/zzfqg;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzeiq;Lp8/p;Lp8/p;Lcom/google/android/gms/internal/ads/zzcbk;Lcom/google/android/gms/internal/ads/zzfqg;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeig;->zza:Lcom/google/android/gms/internal/ads/zzeiq;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeig;->zzb:Lp8/p;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzeig;->zzc:Lp8/p;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzeig;->zzd:Lcom/google/android/gms/internal/ads/zzcbk;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzeig;->zze:Lcom/google/android/gms/internal/ads/zzfqg;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeig;->zza:Lcom/google/android/gms/internal/ads/zzeiq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeig;->zzb:Lp8/p;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzeig;->zzc:Lp8/p;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzeig;->zzd:Lcom/google/android/gms/internal/ads/zzcbk;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzeig;->zze:Lcom/google/android/gms/internal/ads/zzfqg;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzeiq;->zzl(Lp8/p;Lp8/p;Lcom/google/android/gms/internal/ads/zzcbk;Lcom/google/android/gms/internal/ads/zzfqg;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
