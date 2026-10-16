.class final synthetic Lcom/google/android/gms/internal/ads/zzaei;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzaeq;

.field private final synthetic zzb:J

.field private final synthetic zzc:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzaeq;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaei;->zza:Lcom/google/android/gms/internal/ads/zzaeq;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzaei;->zzb:J

    iput p4, p0, Lcom/google/android/gms/internal/ads/zzaei;->zzc:I

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaei;->zza:Lcom/google/android/gms/internal/ads/zzaeq;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzaei;->zzb:J

    iget v3, p0, Lcom/google/android/gms/internal/ads/zzaei;->zzc:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzaeq;->zzp(JI)V

    return-void
.end method
