.class final synthetic Lcom/google/android/gms/internal/ads/zzges;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN0/k;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzgev;

.field private final synthetic zzb:Ljava/lang/String;

.field private final synthetic zzc:Z

.field private final synthetic zzd:Ljava/lang/String;

.field private final synthetic zze:[B


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzgev;Ljava/lang/String;ZLjava/lang/String;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzges;->zza:Lcom/google/android/gms/internal/ads/zzgev;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzges;->zzb:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzges;->zzc:Z

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzges;->zzd:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzges;->zze:[B

    return-void
.end method


# virtual methods
.method public final synthetic attachCompleter(LN0/j;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzges;->zza:Lcom/google/android/gms/internal/ads/zzgev;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzges;->zzb:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzges;->zzc:Z

    .line 6
    .line 7
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzges;->zzd:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzges;->zze:[B

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzgev;->zzc(Ljava/lang/String;ZLjava/lang/String;[BLN0/j;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
