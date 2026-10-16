.class final Lcom/google/android/gms/internal/ads/zzgbx;
.super Llf/c;
.source "SourceFile"


# instance fields
.field zza:Ljava/lang/Object;

.field synthetic zzb:Ljava/lang/Object;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzgcp;

.field zzd:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgcp;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgbx;->zzc:Lcom/google/android/gms/internal/ads/zzgcp;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgbx;->zzb:Ljava/lang/Object;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzgbx;->zzd:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzgbx;->zzd:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgbx;->zzc:Lcom/google/android/gms/internal/ads/zzgcp;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzgcp;->zzp(Lcom/google/android/gms/internal/ads/zzgcp;Ljf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
