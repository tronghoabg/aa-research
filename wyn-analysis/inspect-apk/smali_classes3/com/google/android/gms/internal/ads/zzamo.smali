.class public final Lcom/google/android/gms/internal/ads/zzamo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:I

.field private zzb:I

.field private zzc:J

.field private zzd:J

.field private zze:J

.field private zzf:J

.field private zzg:Lcom/google/android/gms/internal/ads/zzv;

.field private zzh:I

.field private zzi:[Lcom/google/android/gms/internal/ads/zzamq;

.field private zzj:I

.field private zzk:Lcom/google/android/gms/internal/ads/zzhao;

.field private zzl:Lcom/google/android/gms/internal/ads/zzhao;

.field private zzm:Z

.field private zzn:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzb:I

    const-wide/16 v1, -0x1

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzc:J

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzd:J

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zze:J

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzf:J

    const/4 v1, 0x0

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzh:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzm:Z

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzn:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzamp;[B)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzamp;->zza:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzamo;->zza:I

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzamp;->zzb:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzb:I

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/zzamp;->zzc:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzc:J

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/zzamp;->zzd:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzd:J

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/zzamp;->zze:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zze:J

    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/zzamp;->zzf:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzf:J

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzamp;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzamp;->zzh:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzh:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzamp;->zzb()[Lcom/google/android/gms/internal/ads/zzamq;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzi:[Lcom/google/android/gms/internal/ads/zzamq;

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzamp;->zzk:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzj:I

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzamp;->zzi:Lcom/google/android/gms/internal/ads/zzhao;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzk:Lcom/google/android/gms/internal/ads/zzhao;

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzamp;->zzj:Lcom/google/android/gms/internal/ads/zzhao;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzl:Lcom/google/android/gms/internal/ads/zzhao;

    iget-boolean p2, p1, Lcom/google/android/gms/internal/ads/zzamp;->zzm:Z

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzm:Z

    iget p1, p1, Lcom/google/android/gms/internal/ads/zzamp;->zzl:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzn:I

    return-void
.end method


# virtual methods
.method public final synthetic zzA()Lcom/google/android/gms/internal/ads/zzhao;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzl:Lcom/google/android/gms/internal/ads/zzhao;

    return-object v0
.end method

.method public final synthetic zzB()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzm:Z

    return v0
.end method

.method public final synthetic zzC()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzn:I

    return v0
.end method

.method public final zza(I)Lcom/google/android/gms/internal/ads/zzamo;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zza:I

    return-object p0
.end method

.method public final zzb(I)Lcom/google/android/gms/internal/ads/zzamo;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzb:I

    return-object p0
.end method

.method public final zzc(J)Lcom/google/android/gms/internal/ads/zzamo;
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzc:J

    return-object p0
.end method

.method public final zzd(J)Lcom/google/android/gms/internal/ads/zzamo;
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzd:J

    return-object p0
.end method

.method public final zze(J)Lcom/google/android/gms/internal/ads/zzamo;
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zze:J

    return-object p0
.end method

.method public final zzf(J)Lcom/google/android/gms/internal/ads/zzamo;
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzf:J

    return-object p0
.end method

.method public final zzg(Lcom/google/android/gms/internal/ads/zzv;)Lcom/google/android/gms/internal/ads/zzamo;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    return-object p0
.end method

.method public final zzh(I)Lcom/google/android/gms/internal/ads/zzamo;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzh:I

    return-object p0
.end method

.method public final zzi([Lcom/google/android/gms/internal/ads/zzamq;)Lcom/google/android/gms/internal/ads/zzamo;
    .locals 0

    .line 1
    invoke-virtual {p1}, [Lcom/google/android/gms/internal/ads/zzamq;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [Lcom/google/android/gms/internal/ads/zzamq;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzi:[Lcom/google/android/gms/internal/ads/zzamq;

    .line 8
    .line 9
    return-object p0
.end method

.method public final zzj(I)Lcom/google/android/gms/internal/ads/zzamo;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzj:I

    return-object p0
.end method

.method public final zzk(Lcom/google/android/gms/internal/ads/zzhao;)Lcom/google/android/gms/internal/ads/zzamo;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzk:Lcom/google/android/gms/internal/ads/zzhao;

    return-object p0
.end method

.method public final zzl(Lcom/google/android/gms/internal/ads/zzhao;)Lcom/google/android/gms/internal/ads/zzamo;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzl:Lcom/google/android/gms/internal/ads/zzhao;

    return-object p0
.end method

.method public final zzm(Z)Lcom/google/android/gms/internal/ads/zzamo;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzm:Z

    return-object p0
.end method

.method public final zzn(I)Lcom/google/android/gms/internal/ads/zzamo;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzn:I

    return-object p0
.end method

.method public final zzo()Lcom/google/android/gms/internal/ads/zzamp;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/google/android/gms/internal/ads/zzamp;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzamp;-><init>(Lcom/google/android/gms/internal/ads/zzamo;[B)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final synthetic zzp()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zza:I

    return v0
.end method

.method public final synthetic zzq()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzb:I

    return v0
.end method

.method public final synthetic zzr()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzc:J

    return-wide v0
.end method

.method public final synthetic zzs()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzd:J

    return-wide v0
.end method

.method public final synthetic zzt()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zze:J

    return-wide v0
.end method

.method public final synthetic zzu()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzf:J

    return-wide v0
.end method

.method public final synthetic zzv()Lcom/google/android/gms/internal/ads/zzv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    return-object v0
.end method

.method public final synthetic zzw()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzh:I

    return v0
.end method

.method public final synthetic zzx()[Lcom/google/android/gms/internal/ads/zzamq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzi:[Lcom/google/android/gms/internal/ads/zzamq;

    return-object v0
.end method

.method public final synthetic zzy()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzj:I

    return v0
.end method

.method public final synthetic zzz()Lcom/google/android/gms/internal/ads/zzhao;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamo;->zzk:Lcom/google/android/gms/internal/ads/zzhao;

    return-object v0
.end method
