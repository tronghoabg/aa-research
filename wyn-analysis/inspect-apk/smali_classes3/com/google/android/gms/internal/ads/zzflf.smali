.class public final Lcom/google/android/gms/internal/ads/zzflf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:LD6/v1;

.field private zzb:LD6/x1;

.field private zzc:Ljava/lang/String;

.field private zzd:LD6/r1;

.field private zze:Z

.field private zzf:Ljava/util/ArrayList;

.field private zzg:Ljava/util/ArrayList;

.field private zzh:Lcom/google/android/gms/internal/ads/zzbma;

.field private zzi:LD6/A1;

.field private zzj:LA6/a;

.field private zzk:LA6/g;

.field private zzl:LD6/b0;

.field private zzm:I

.field private zzn:Lcom/google/android/gms/internal/ads/zzbsi;

.field private final zzo:Lcom/google/android/gms/internal/ads/zzfkt;

.field private zzp:Z

.field private zzq:Z

.field private zzr:Lcom/google/android/gms/internal/ads/zzetk;

.field private zzs:Z

.field private zzt:Landroid/os/Bundle;

.field private final zzu:Ljava/util/concurrent/atomic/AtomicLong;

.field private zzv:Z

.field private zzw:Lorg/json/JSONArray;

.field private zzx:LD6/e0;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzm:I

    .line 6
    .line 7
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfkt;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfkt;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzo:Lcom/google/android/gms/internal/ads/zzfkt;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzp:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzq:Z

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzs:Z

    .line 20
    .line 21
    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzu:Ljava/util/concurrent/atomic/AtomicLong;

    .line 27
    .line 28
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzv:Z

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final zzA(Lcom/google/android/gms/internal/ads/zzflg;)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzo:Lcom/google/android/gms/internal/ads/zzfkt;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzp:Lcom/google/android/gms/internal/ads/zzfku;

    .line 4
    .line 5
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzfku;->zza:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfkt;->zza(I)Lcom/google/android/gms/internal/ads/zzfkt;

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzd:LD6/v1;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zza:LD6/v1;

    .line 13
    .line 14
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzf:LD6/x1;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzb:LD6/x1;

    .line 17
    .line 18
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzx:LD6/e0;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzx:LD6/e0;

    .line 21
    .line 22
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzg:Ljava/lang/String;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzc:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzflg;->zza:LD6/r1;

    .line 27
    .line 28
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzd:LD6/r1;

    .line 29
    .line 30
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzh:Ljava/util/ArrayList;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzf:Ljava/util/ArrayList;

    .line 33
    .line 34
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzi:Ljava/util/ArrayList;

    .line 35
    .line 36
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzg:Ljava/util/ArrayList;

    .line 37
    .line 38
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzj:Lcom/google/android/gms/internal/ads/zzbma;

    .line 39
    .line 40
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzh:Lcom/google/android/gms/internal/ads/zzbma;

    .line 41
    .line 42
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzk:LD6/A1;

    .line 43
    .line 44
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzi:LD6/A1;

    .line 45
    .line 46
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzm:LA6/a;

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzflf;->zzs(LA6/a;)Lcom/google/android/gms/internal/ads/zzflf;

    .line 49
    .line 50
    .line 51
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzn:LA6/g;

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzflf;->zzr(LA6/g;)Lcom/google/android/gms/internal/ads/zzflf;

    .line 54
    .line 55
    .line 56
    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzq:Z

    .line 57
    .line 58
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzp:Z

    .line 59
    .line 60
    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzr:Z

    .line 61
    .line 62
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzq:Z

    .line 63
    .line 64
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzc:Lcom/google/android/gms/internal/ads/zzetk;

    .line 65
    .line 66
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzr:Lcom/google/android/gms/internal/ads/zzetk;

    .line 67
    .line 68
    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzs:Z

    .line 69
    .line 70
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzs:Z

    .line 71
    .line 72
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzt:Landroid/os/Bundle;

    .line 73
    .line 74
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzt:Landroid/os/Bundle;

    .line 75
    .line 76
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzu:Ljava/util/concurrent/atomic/AtomicLong;

    .line 77
    .line 78
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzu:Ljava/util/concurrent/atomic/AtomicLong;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 81
    .line 82
    .line 83
    move-result-wide v1

    .line 84
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 85
    .line 86
    .line 87
    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzv:Z

    .line 88
    .line 89
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzv:Z

    .line 90
    .line 91
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzw:Lorg/json/JSONArray;

    .line 92
    .line 93
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzw:Lorg/json/JSONArray;

    .line 94
    .line 95
    return-object p0
.end method

.method public final zzB()Lcom/google/android/gms/internal/ads/zzflg;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzc:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "ad unit must not be null"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzb:LD6/x1;

    .line 9
    .line 10
    const-string v1, "ad size must not be null"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zza:LD6/v1;

    .line 16
    .line 17
    const-string v1, "ad request must not be null"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lcom/google/android/gms/internal/ads/zzflg;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzflg;-><init>(Lcom/google/android/gms/internal/ads/zzflf;[B)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public final zzC()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzp:Z

    return v0
.end method

.method public final zzD()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzq:Z

    return v0
.end method

.method public final synthetic zzE()LD6/v1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zza:LD6/v1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic zzF()LD6/x1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzb:LD6/x1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic zzG()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzc:Ljava/lang/String;

    return-object v0
.end method

.method public final synthetic zzH()LD6/r1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzd:LD6/r1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic zzI()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zze:Z

    return v0
.end method

.method public final synthetic zzJ()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzf:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final synthetic zzK()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzg:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final synthetic zzL()Lcom/google/android/gms/internal/ads/zzbma;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzh:Lcom/google/android/gms/internal/ads/zzbma;

    return-object v0
.end method

.method public final synthetic zzM()LD6/A1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzi:LD6/A1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic zzN()LA6/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzj:LA6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic zzO()LA6/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzk:LA6/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic zzP()LD6/b0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzl:LD6/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic zzQ()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzm:I

    return v0
.end method

.method public final synthetic zzR()Lcom/google/android/gms/internal/ads/zzbsi;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzn:Lcom/google/android/gms/internal/ads/zzbsi;

    return-object v0
.end method

.method public final synthetic zzS()Lcom/google/android/gms/internal/ads/zzfkt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzo:Lcom/google/android/gms/internal/ads/zzfkt;

    return-object v0
.end method

.method public final synthetic zzT()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzp:Z

    return v0
.end method

.method public final synthetic zzU()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzq:Z

    return v0
.end method

.method public final synthetic zzV()Lcom/google/android/gms/internal/ads/zzetk;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzr:Lcom/google/android/gms/internal/ads/zzetk;

    return-object v0
.end method

.method public final synthetic zzW()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzs:Z

    return v0
.end method

.method public final synthetic zzX()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzt:Landroid/os/Bundle;

    return-object v0
.end method

.method public final synthetic zzY()Ljava/util/concurrent/atomic/AtomicLong;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzu:Ljava/util/concurrent/atomic/AtomicLong;

    return-object v0
.end method

.method public final synthetic zzZ()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzv:Z

    return v0
.end method

.method public final zza(LD6/v1;)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zza:LD6/v1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final synthetic zzaa()Lorg/json/JSONArray;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzw:Lorg/json/JSONArray;

    return-object v0
.end method

.method public final zzab(LD6/e0;)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzx:LD6/e0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final synthetic zzac()LD6/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzx:LD6/e0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zzb()LD6/v1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zza:LD6/v1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zzc(LD6/x1;)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzb:LD6/x1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zzd(Z)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzp:Z

    return-object p0
.end method

.method public final zze(Z)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzq:Z

    return-object p0
.end method

.method public final zzf()LD6/x1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzb:LD6/x1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zzg(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzc:Ljava/lang/String;

    return-object p0
.end method

.method public final zzh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzc:Ljava/lang/String;

    return-object v0
.end method

.method public final zzi(LD6/r1;)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzd:LD6/r1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zzj()Lcom/google/android/gms/internal/ads/zzfkt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzo:Lcom/google/android/gms/internal/ads/zzfkt;

    return-object v0
.end method

.method public final zzk(Z)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zze:Z

    return-object p0
.end method

.method public final zzl(I)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzm:I

    return-object p0
.end method

.method public final zzm(Ljava/util/ArrayList;)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzf:Ljava/util/ArrayList;

    return-object p0
.end method

.method public final zzn(Ljava/util/ArrayList;)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzg:Ljava/util/ArrayList;

    return-object p0
.end method

.method public final zzo(Lcom/google/android/gms/internal/ads/zzbma;)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzh:Lcom/google/android/gms/internal/ads/zzbma;

    return-object p0
.end method

.method public final zzp(LD6/A1;)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzi:LD6/A1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zzq(Lcom/google/android/gms/internal/ads/zzbsi;)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzn:Lcom/google/android/gms/internal/ads/zzbsi;

    .line 2
    .line 3
    new-instance p1, LD6/r1;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {p1, v0, v1, v0}, LD6/r1;-><init>(ZZZ)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzd:LD6/r1;

    .line 11
    .line 12
    return-object p0
.end method

.method public final zzr(LA6/g;)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzk:LA6/g;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p1, LA6/g;->a:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zze:Z

    .line 8
    .line 9
    iget-object p1, p1, LA6/g;->b:LD6/b0;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzl:LD6/b0;

    .line 12
    .line 13
    :cond_0
    return-object p0
.end method

.method public final zzs(LA6/a;)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzj:LA6/a;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-boolean p1, p1, LA6/a;->a:Z

    .line 6
    .line 7
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zze:Z

    .line 8
    .line 9
    :cond_0
    return-object p0
.end method

.method public final zzt(Lcom/google/android/gms/internal/ads/zzetk;)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzr:Lcom/google/android/gms/internal/ads/zzetk;

    return-object p0
.end method

.method public final zzu(Z)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzs:Z

    return-object p0
.end method

.method public final zzv(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzt:Landroid/os/Bundle;

    return-object p0
.end method

.method public final zzw()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzu:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final zzx(J)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzu:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final zzy(Z)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzv:Z

    return-object p0
.end method

.method public final zzz(Lorg/json/JSONArray;)Lcom/google/android/gms/internal/ads/zzflf;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzflf;->zzw:Lorg/json/JSONArray;

    return-object p0
.end method
