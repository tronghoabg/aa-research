.class final synthetic Lcom/google/android/gms/internal/ads/zzebz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzece;

.field private final synthetic zzb:Ljava/lang/Object;

.field private final synthetic zzc:Lcom/google/android/gms/internal/ads/zzcgd;

.field private final synthetic zzd:Ljava/lang/String;

.field private final synthetic zze:J

.field private final synthetic zzf:Lcom/google/android/gms/internal/ads/zzfqg;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzece;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcgd;Ljava/lang/String;JLcom/google/android/gms/internal/ads/zzfqg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzebz;->zza:Lcom/google/android/gms/internal/ads/zzece;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzebz;->zzb:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzebz;->zzc:Lcom/google/android/gms/internal/ads/zzcgd;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzebz;->zzd:Ljava/lang/String;

    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/zzebz;->zze:J

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzebz;->zzf:Lcom/google/android/gms/internal/ads/zzfqg;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzebz;->zza:Lcom/google/android/gms/internal/ads/zzece;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzebz;->zzb:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzebz;->zzc:Lcom/google/android/gms/internal/ads/zzcgd;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzebz;->zzd:Ljava/lang/String;

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzebz;->zze:J

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzebz;->zzf:Lcom/google/android/gms/internal/ads/zzfqg;

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzece;->zzi(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcgd;Ljava/lang/String;JLcom/google/android/gms/internal/ads/zzfqg;)V

    return-void
.end method
