.class public final Lcom/google/android/gms/internal/ads/zzbma;
.super Lf7/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/zzbma;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final zza:I

.field public final zzb:Z

.field public final zzc:I

.field public final zzd:Z

.field public final zze:I

.field public final zzf:LD6/r1;

.field public final zzg:Z

.field public final zzh:I

.field public final zzi:I

.field public final zzj:Z

.field public final zzk:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbmb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbmb;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbma;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZIZILD6/r1;ZIIZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbma;->zza:I

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzb:Z

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzc:I

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzd:Z

    iput p5, p0, Lcom/google/android/gms/internal/ads/zzbma;->zze:I

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzf:LD6/r1;

    iput-boolean p7, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzg:Z

    iput p8, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzh:I

    iput-boolean p10, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzj:Z

    iput p9, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzi:I

    iput p11, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzk:I

    return-void
.end method

.method public constructor <init>(LA6/e;)V
    .locals 12
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    iget-boolean v2, p1, LA6/e;->a:Z

    .line 4
    iget-object v0, p1, LA6/e;->f:Lx6/w;

    if-eqz v0, :cond_0

    .line 5
    new-instance v1, LD6/r1;

    invoke-direct {v1, v0}, LD6/r1;-><init>(Lx6/w;)V

    :goto_0
    move-object v6, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v1, 0x4

    .line 6
    iget v3, p1, LA6/e;->b:I

    iget-boolean v4, p1, LA6/e;->d:Z

    iget v5, p1, LA6/e;->e:I

    iget-boolean v7, p1, LA6/e;->g:Z

    iget v8, p1, LA6/e;->c:I

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/ads/zzbma;-><init>(IZIZILD6/r1;ZIIZI)V

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzbma;)Lcom/google/android/gms/ads/nativead/g;
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/ads/nativead/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/ads/nativead/f;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    new-instance p0, Lcom/google/android/gms/ads/nativead/g;

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/nativead/g;-><init>(Lcom/google/android/gms/ads/nativead/f;)V

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbma;->zza:I

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eq v1, v2, :cond_6

    .line 18
    .line 19
    const/4 v3, 0x3

    .line 20
    if-eq v1, v3, :cond_5

    .line 21
    .line 22
    const/4 v4, 0x4

    .line 23
    if-eq v1, v4, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzg:Z

    .line 27
    .line 28
    iput-boolean v1, v0, Lcom/google/android/gms/ads/nativead/f;->f:Z

    .line 29
    .line 30
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzh:I

    .line 31
    .line 32
    iput v1, v0, Lcom/google/android/gms/ads/nativead/f;->b:I

    .line 33
    .line 34
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzi:I

    .line 35
    .line 36
    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzj:Z

    .line 37
    .line 38
    iput-boolean v4, v0, Lcom/google/android/gms/ads/nativead/f;->g:Z

    .line 39
    .line 40
    iput v1, v0, Lcom/google/android/gms/ads/nativead/f;->h:I

    .line 41
    .line 42
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzk:I

    .line 43
    .line 44
    const/4 v4, 0x1

    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    :cond_2
    move v2, v4

    .line 48
    goto :goto_0

    .line 49
    :cond_3
    if-ne v1, v2, :cond_4

    .line 50
    .line 51
    move v2, v3

    .line 52
    goto :goto_0

    .line 53
    :cond_4
    if-ne v1, v4, :cond_2

    .line 54
    .line 55
    :goto_0
    iput v2, v0, Lcom/google/android/gms/ads/nativead/f;->i:I

    .line 56
    .line 57
    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzf:LD6/r1;

    .line 58
    .line 59
    if-eqz v1, :cond_6

    .line 60
    .line 61
    new-instance v2, Lx6/w;

    .line 62
    .line 63
    invoke-direct {v2, v1}, Lx6/w;-><init>(LD6/r1;)V

    .line 64
    .line 65
    .line 66
    iput-object v2, v0, Lcom/google/android/gms/ads/nativead/f;->d:Lx6/w;

    .line 67
    .line 68
    :cond_6
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbma;->zze:I

    .line 69
    .line 70
    iput v1, v0, Lcom/google/android/gms/ads/nativead/f;->e:I

    .line 71
    .line 72
    :goto_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzb:Z

    .line 73
    .line 74
    iput-boolean v1, v0, Lcom/google/android/gms/ads/nativead/f;->a:Z

    .line 75
    .line 76
    iget-boolean p0, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzd:Z

    .line 77
    .line 78
    iput-boolean p0, v0, Lcom/google/android/gms/ads/nativead/f;->c:Z

    .line 79
    .line 80
    new-instance p0, Lcom/google/android/gms/ads/nativead/g;

    .line 81
    .line 82
    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/nativead/g;-><init>(Lcom/google/android/gms/ads/nativead/f;)V

    .line 83
    .line 84
    .line 85
    return-object p0
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbma;->zza:I

    .line 2
    .line 3
    const/16 v1, 0x4f45

    .line 4
    .line 5
    invoke-static {v1, p1}, La/a;->l0(ILandroid/os/Parcel;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x4

    .line 11
    invoke-static {p1, v2, v3}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzb:Z

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-static {p1, v2, v3}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzc:I

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-static {p1, v2, v3}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 33
    .line 34
    .line 35
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzd:Z

    .line 36
    .line 37
    invoke-static {p1, v3, v3}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 41
    .line 42
    .line 43
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbma;->zze:I

    .line 44
    .line 45
    const/4 v2, 0x5

    .line 46
    invoke-static {p1, v2, v3}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzf:LD6/r1;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    const/4 v4, 0x6

    .line 56
    invoke-static {p1, v4, v0, p2, v2}, La/a;->Z(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 57
    .line 58
    .line 59
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzg:Z

    .line 60
    .line 61
    const/4 v0, 0x7

    .line 62
    invoke-static {p1, v0, v3}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 66
    .line 67
    .line 68
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzh:I

    .line 69
    .line 70
    const/16 v0, 0x8

    .line 71
    .line 72
    invoke-static {p1, v0, v3}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 76
    .line 77
    .line 78
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzi:I

    .line 79
    .line 80
    const/16 v0, 0x9

    .line 81
    .line 82
    invoke-static {p1, v0, v3}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 86
    .line 87
    .line 88
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzj:Z

    .line 89
    .line 90
    const/16 v0, 0xa

    .line 91
    .line 92
    invoke-static {p1, v0, v3}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 96
    .line 97
    .line 98
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzbma;->zzk:I

    .line 99
    .line 100
    const/16 v0, 0xb

    .line 101
    .line 102
    invoke-static {p1, v0, v3}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 106
    .line 107
    .line 108
    invoke-static {v1, p1}, La/a;->m0(ILandroid/os/Parcel;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method
