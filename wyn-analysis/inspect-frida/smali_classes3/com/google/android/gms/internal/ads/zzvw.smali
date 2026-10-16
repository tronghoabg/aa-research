.class public abstract Lcom/google/android/gms/internal/ads/zzvw;
.super Lcom/google/android/gms/internal/ads/zziz;
.source "SourceFile"


# static fields
.field private static final zzb:[B


# instance fields
.field private zzA:Z

.field private zzB:F

.field private zzC:Ljava/util/ArrayDeque;

.field private zzD:Lcom/google/android/gms/internal/ads/zzvs;

.field private zzE:Lcom/google/android/gms/internal/ads/zzvp;

.field private zzF:I

.field private zzG:Z

.field private zzH:Z

.field private zzI:Z

.field private zzJ:Z

.field private zzK:Z

.field private zzL:J

.field private zzM:Z

.field private zzN:J

.field private zzO:I

.field private zzP:I

.field private zzQ:Ljava/nio/ByteBuffer;

.field private zzR:Z

.field private zzS:Z

.field private zzT:Z

.field private zzU:Z

.field private zzV:Z

.field private zzW:I

.field private zzX:I

.field private zzY:I

.field private zzZ:Z

.field protected zza:Lcom/google/android/gms/internal/ads/zzjd;

.field private zzaa:Z

.field private zzab:Z

.field private zzac:J

.field private zzad:J

.field private zzae:Z

.field private zzaf:Z

.field private zzag:Z

.field private zzah:Lcom/google/android/gms/internal/ads/zzvv;

.field private zzai:J

.field private zzaj:Z

.field private zzak:Z

.field private zzal:Z

.field private zzam:J

.field private zzan:Lcom/google/android/gms/internal/ads/zzjb;

.field private zzao:Lcom/google/android/gms/internal/ads/zzjb;

.field private zzap:Lcom/google/android/gms/internal/ads/zzgxd;

.field private final zzc:Landroid/content/Context;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzvk;

.field private final zze:Lcom/google/android/gms/internal/ads/zzvy;

.field private final zzf:F

.field private final zzg:Lcom/google/android/gms/internal/ads/zzix;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzix;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzix;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzvd;

.field private final zzk:Landroid/media/MediaCodec$BufferInfo;

.field private final zzl:Ljava/util/ArrayDeque;

.field private final zzm:Lcom/google/android/gms/internal/ads/zzub;

.field private final zzn:Ljava/util/concurrent/atomic/AtomicInteger;

.field private zzo:Lcom/google/android/gms/internal/ads/zzv;

.field private zzp:Lcom/google/android/gms/internal/ads/zzv;

.field private zzq:Lcom/google/android/gms/internal/ads/zzuj;

.field private zzr:Lcom/google/android/gms/internal/ads/zzuj;

.field private zzs:Lcom/google/android/gms/internal/ads/zznb;

.field private zzt:Landroid/media/MediaCrypto;

.field private zzu:J

.field private zzv:F

.field private zzw:F

.field private zzx:Lcom/google/android/gms/internal/ads/zzvm;

.field private zzy:Lcom/google/android/gms/internal/ads/zzv;

.field private zzz:Landroid/media/MediaFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x26

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzvw;->zzb:[B

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;ILcom/google/android/gms/internal/ads/zzvk;Lcom/google/android/gms/internal/ads/zzvy;ZF)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zziz;-><init>(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzc:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzd:Lcom/google/android/gms/internal/ads/zzvk;

    .line 11
    .line 12
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzvw;->zze:Lcom/google/android/gms/internal/ads/zzvy;

    .line 16
    .line 17
    iput p6, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzf:F

    .line 18
    .line 19
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzn:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 25
    .line 26
    new-instance p1, Lcom/google/android/gms/internal/ads/zzix;

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-direct {p1, p2, p2}, Lcom/google/android/gms/internal/ads/zzix;-><init>(II)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzg:Lcom/google/android/gms/internal/ads/zzix;

    .line 33
    .line 34
    new-instance p1, Lcom/google/android/gms/internal/ads/zzix;

    .line 35
    .line 36
    invoke-direct {p1, p2, p2}, Lcom/google/android/gms/internal/ads/zzix;-><init>(II)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzh:Lcom/google/android/gms/internal/ads/zzix;

    .line 40
    .line 41
    new-instance p1, Lcom/google/android/gms/internal/ads/zzix;

    .line 42
    .line 43
    const/4 p3, 0x2

    .line 44
    invoke-direct {p1, p3, p2}, Lcom/google/android/gms/internal/ads/zzix;-><init>(II)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzi:Lcom/google/android/gms/internal/ads/zzix;

    .line 48
    .line 49
    new-instance p1, Lcom/google/android/gms/internal/ads/zzvd;

    .line 50
    .line 51
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzvd;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzj:Lcom/google/android/gms/internal/ads/zzvd;

    .line 55
    .line 56
    new-instance p3, Landroid/media/MediaCodec$BufferInfo;

    .line 57
    .line 58
    invoke-direct {p3}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 62
    .line 63
    const/high16 p3, 0x3f800000    # 1.0f

    .line 64
    .line 65
    iput p3, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzv:F

    .line 66
    .line 67
    iput p3, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzw:F

    .line 68
    .line 69
    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzu:J

    .line 75
    .line 76
    new-instance p5, Ljava/util/ArrayDeque;

    .line 77
    .line 78
    invoke-direct {p5}, Ljava/util/ArrayDeque;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzl:Ljava/util/ArrayDeque;

    .line 82
    .line 83
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzvv;->zza()Lcom/google/android/gms/internal/ads/zzvv;

    .line 84
    .line 85
    .line 86
    move-result-object p5

    .line 87
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzah:Lcom/google/android/gms/internal/ads/zzvv;

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzix;->zzj(I)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzix;->zzc:Ljava/nio/ByteBuffer;

    .line 93
    .line 94
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 95
    .line 96
    .line 97
    move-result-object p5

    .line 98
    invoke-virtual {p1, p5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 99
    .line 100
    .line 101
    new-instance p1, Lcom/google/android/gms/internal/ads/zzub;

    .line 102
    .line 103
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzub;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzm:Lcom/google/android/gms/internal/ads/zzub;

    .line 107
    .line 108
    const/high16 p1, -0x40800000    # -1.0f

    .line 109
    .line 110
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzB:F

    .line 111
    .line 112
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzF:I

    .line 113
    .line 114
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzW:I

    .line 115
    .line 116
    const/4 p1, -0x1

    .line 117
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzO:I

    .line 118
    .line 119
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzP:I

    .line 120
    .line 121
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzN:J

    .line 122
    .line 123
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzac:J

    .line 124
    .line 125
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzad:J

    .line 126
    .line 127
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzai:J

    .line 128
    .line 129
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzL:J

    .line 130
    .line 131
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzX:I

    .line 132
    .line 133
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzY:I

    .line 134
    .line 135
    new-instance p1, Lcom/google/android/gms/internal/ads/zzjd;

    .line 136
    .line 137
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzjd;-><init>()V

    .line 138
    .line 139
    .line 140
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zza:Lcom/google/android/gms/internal/ads/zzjd;

    .line 141
    .line 142
    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzal:Z

    .line 143
    .line 144
    const-wide/16 p1, 0x0

    .line 145
    .line 146
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzam:J

    .line 147
    .line 148
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgxd;->zzh()Lcom/google/android/gms/internal/ads/zzgxd;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzap:Lcom/google/android/gms/internal/ads/zzgxd;

    .line 153
    .line 154
    sget-object p1, Lcom/google/android/gms/internal/ads/zzjb;->zza:Lcom/google/android/gms/internal/ads/zzjb;

    .line 155
    .line 156
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzan:Lcom/google/android/gms/internal/ads/zzjb;

    .line 157
    .line 158
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzao:Lcom/google/android/gms/internal/ads/zzjb;

    .line 159
    .line 160
    return-void
.end method

.method private final zzaA()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzvm;->zzk()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaT()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaT()V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method private final zzaB()V
    .locals 3

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzac:J

    .line 7
    .line 8
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzad:J

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbv()Lcom/google/android/gms/internal/ads/zzvv;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzvv;->zzi(J)V

    .line 15
    .line 16
    .line 17
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzai:J

    .line 18
    .line 19
    return-void
.end method

.method private final zzaC(I)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziz;->zzI()Lcom/google/android/gms/internal/ads/zzly;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzg:Lcom/google/android/gms/internal/ads/zzix;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzix;->zza()V

    .line 8
    .line 9
    .line 10
    or-int/lit8 p1, p1, 0x4

    .line 11
    .line 12
    invoke-virtual {p0, v0, v1, p1}, Lcom/google/android/gms/internal/ads/zziz;->zzR(Lcom/google/android/gms/internal/ads/zzly;Lcom/google/android/gms/internal/ads/zzix;I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v2, -0x5

    .line 17
    const/4 v3, 0x1

    .line 18
    if-ne p1, v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzvw;->zzap(Lcom/google/android/gms/internal/ads/zzly;)Lcom/google/android/gms/internal/ads/zzje;

    .line 21
    .line 22
    .line 23
    return v3

    .line 24
    :cond_0
    const/4 v0, -0x4

    .line 25
    if-ne p1, v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzis;->zzb()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzae:Z

    .line 34
    .line 35
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbt()V

    .line 36
    .line 37
    .line 38
    :cond_1
    const/4 p1, 0x0

    .line 39
    return p1
.end method

.method private final zzaD(J)Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzu:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziz;->zzM()Lcom/google/android/gms/internal/ads/zzdp;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdp;->zzb()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    sub-long/2addr v0, p1

    .line 21
    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzu:J

    .line 22
    .line 23
    cmp-long p1, v0, p1

    .line 24
    .line 25
    if-gez p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    return p1

    .line 30
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 31
    return p1
.end method

.method private final zzaE()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzP:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final zzar()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzS:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzay()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final zzay()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaB()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzU:Z

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzj:Lcom/google/android/gms/internal/ads/zzvd;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzvd;->zza()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzi:Lcom/google/android/gms/internal/ads/zzix;

    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzix;->zza()V

    .line 15
    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzT:Z

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzm:Lcom/google/android/gms/internal/ads/zzub;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzub;->zzb()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final zzaz()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaQ()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaO()V

    .line 14
    .line 15
    .line 16
    return v1

    .line 17
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaR()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaA()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzal:Z

    .line 28
    .line 29
    :goto_0
    const/4 v0, 0x0

    .line 30
    return v0
.end method

.method public static zzbl(Lcom/google/android/gms/internal/ads/zzv;)Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/gms/internal/ads/zzv;->zzP:I

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x1

    .line 8
    return p0
.end method

.method private final zzbo()V
    .locals 2

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzO:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzh:Lcom/google/android/gms/internal/ads/zzix;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzix;->zzc:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private final zzbp()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzP:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzQ:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private final zzbq(Lcom/google/android/gms/internal/ads/zzv;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzY:I

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    if-eq v0, v2, :cond_3

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziz;->zze()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzw:F

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziz;->zzJ()[Lcom/google/android/gms/internal/ads/zzv;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p0, v0, p1, v2}, Lcom/google/android/gms/internal/ads/zzvw;->zzal(FLcom/google/android/gms/internal/ads/zzv;[Lcom/google/android/gms/internal/ads/zzv;)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzB:F

    .line 32
    .line 33
    cmpl-float v2, v0, p1

    .line 34
    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    const/high16 v2, -0x40800000    # -1.0f

    .line 38
    .line 39
    cmpl-float v3, p1, v2

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbs()V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    return p1

    .line 48
    :cond_1
    cmpl-float v0, v0, v2

    .line 49
    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzf:F

    .line 53
    .line 54
    cmpl-float v0, p1, v0

    .line 55
    .line 56
    if-lez v0, :cond_3

    .line 57
    .line 58
    :cond_2
    new-instance v0, Landroid/os/Bundle;

    .line 59
    .line 60
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string v2, "operating-rate"

    .line 64
    .line 65
    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 66
    .line 67
    .line 68
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/zzvm;->zzp(Landroid/os/Bundle;)V

    .line 74
    .line 75
    .line 76
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzB:F

    .line 77
    .line 78
    :cond_3
    :goto_0
    return v1
.end method

.method private final zzbr()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzZ:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzX:I

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaQ()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x3

    .line 15
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzY:I

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzY:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbw()V

    .line 24
    .line 25
    .line 26
    :goto_0
    return v1
.end method

.method private final zzbs()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzZ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzX:I

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzY:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaO()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaG()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private final zzbt()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzY:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    if-eq v0, v2, :cond_0

    .line 11
    .line 12
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzaf:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzav()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaO()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaG()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaA()V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbw()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaA()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method private final zzbu(Lcom/google/android/gms/internal/ads/zzvv;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzah:Lcom/google/android/gms/internal/ads/zzvv;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzvv;->zzd()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzaj:Z

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzvv;->zzd()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzaw(J)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method private final zzbv()Lcom/google/android/gms/internal/ads/zzvv;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzl:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/google/android/gms/internal/ads/zzvv;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzah:Lcom/google/android/gms/internal/ads/zzvv;

    .line 17
    .line 18
    return-object v0
.end method

.method private final zzbw()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzr:Lcom/google/android/gms/internal/ads/zzuj;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzq:Lcom/google/android/gms/internal/ads/zzuj;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzX:I

    .line 10
    .line 11
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzY:I

    .line 12
    .line 13
    return-void
.end method

.method private final zzbx(JJ)Z
    .locals 4

    .line 1
    cmp-long v0, p3, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-gez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzp:Lcom/google/android/gms/internal/ads/zzv;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 12
    .line 13
    const-string v3, "audio/opus"

    .line 14
    .line 15
    invoke-static {v0, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzgx;->zzf(JJ)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    return v1

    .line 28
    :cond_0
    return v2

    .line 29
    :cond_1
    return v1
.end method


# virtual methods
.method public zzA(JZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzl:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, Lcom/google/android/gms/internal/ads/zzvv;

    .line 14
    .line 15
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzah:Lcom/google/android/gms/internal/ads/zzvv;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 18
    .line 19
    .line 20
    if-nez p4, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzae:Z

    .line 25
    .line 26
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzaf:Z

    .line 27
    .line 28
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzS:Z

    .line 29
    .line 30
    if-eqz p2, :cond_2

    .line 31
    .line 32
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzay()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaP()Z

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzah:Lcom/google/android/gms/internal/ads/zzvv;

    .line 40
    .line 41
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzvv;->zze()Lcom/google/android/gms/internal/ads/zzfi;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzfi;->zzc()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-lez p2, :cond_3

    .line 50
    .line 51
    const/4 p2, 0x1

    .line 52
    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzag:Z

    .line 53
    .line 54
    :cond_3
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzah:Lcom/google/android/gms/internal/ads/zzvv;

    .line 55
    .line 56
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzvv;->zze()Lcom/google/android/gms/internal/ads/zzfi;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzfi;->zzb()V

    .line 61
    .line 62
    .line 63
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzah:Lcom/google/android/gms/internal/ads/zzvv;

    .line 64
    .line 65
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzvv;->zzg(Z)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public zzD()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzo:Lcom/google/android/gms/internal/ads/zzv;

    .line 3
    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzvv;->zza()Lcom/google/android/gms/internal/ads/zzvv;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbu(Lcom/google/android/gms/internal/ads/zzvv;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzl:Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 14
    .line 15
    .line 16
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzS:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzar()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaz()Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public zzE()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzar()V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaO()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzr:Lcom/google/android/gms/internal/ads/zzuj;

    .line 9
    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzr:Lcom/google/android/gms/internal/ads/zzuj;

    .line 13
    .line 14
    throw v1
.end method

.method public final zzG(Lcom/google/android/gms/internal/ads/zzbf;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbv()Lcom/google/android/gms/internal/ads/zzvv;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final zzW(JJ)J
    .locals 6

    .line 1
    iget-boolean v5, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzM:Z

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-wide v1, p1

    .line 5
    move-wide v3, p3

    .line 6
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzvw;->zzak(JJZ)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    return-wide p1
.end method

.method public zzY(FF)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzv:F

    .line 2
    .line 3
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzw:F

    .line 4
    .line 5
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzy:Lcom/google/android/gms/internal/ads/zzv;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbq(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final zzaF()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzak:Z

    return-void
.end method

.method public final zzaG()V
    .locals 26
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v8, "MediaCodecRenderer"

    .line 4
    .line 5
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 6
    .line 7
    if-nez v0, :cond_20

    .line 8
    .line 9
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzS:Z

    .line 10
    .line 11
    if-nez v0, :cond_20

    .line 12
    .line 13
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzo:Lcom/google/android/gms/internal/ads/zzv;

    .line 14
    .line 15
    if-nez v9, :cond_0

    .line 16
    .line 17
    goto/16 :goto_14

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v1, v9}, Lcom/google/android/gms/internal/ads/zzvw;->zzaH(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v10, 0x1

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzar()V

    .line 27
    .line 28
    .line 29
    iget-object v0, v9, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 30
    .line 31
    const-string v2, "audio/mp4a-latm"

    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    const-string v2, "audio/mpeg"

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    const-string v2, "audio/opus"

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzj:Lcom/google/android/gms/internal/ads/zzvd;

    .line 56
    .line 57
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/ads/zzvd;->zzm(I)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzj:Lcom/google/android/gms/internal/ads/zzvd;

    .line 62
    .line 63
    const/16 v2, 0x20

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzvd;->zzm(I)V

    .line 66
    .line 67
    .line 68
    :goto_0
    iput-boolean v10, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzS:Z

    .line 69
    .line 70
    return-void

    .line 71
    :cond_2
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzr:Lcom/google/android/gms/internal/ads/zzuj;

    .line 72
    .line 73
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzq:Lcom/google/android/gms/internal/ads/zzuj;

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    invoke-static {v10}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V

    .line 78
    .line 79
    .line 80
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzq:Lcom/google/android/gms/internal/ads/zzuj;

    .line 81
    .line 82
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzuj;->zza()Lcom/google/android/gms/internal/ads/zzui;

    .line 83
    .line 84
    .line 85
    :cond_3
    const/4 v11, 0x0

    .line 86
    :try_start_0
    const-string v12, "Failed to initialize decoder: "

    .line 87
    .line 88
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzo:Lcom/google/android/gms/internal/ads/zzv;

    .line 89
    .line 90
    const/4 v14, 0x0

    .line 91
    if-eqz v13, :cond_1f

    .line 92
    .line 93
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzC:Ljava/util/ArrayDeque;
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzvs; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    if-nez v0, :cond_5

    .line 96
    .line 97
    :try_start_1
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zze:Lcom/google/android/gms/internal/ads/zzvy;

    .line 98
    .line 99
    invoke-virtual {v1, v0, v13, v11}, Lcom/google/android/gms/internal/ads/zzvw;->zzag(Lcom/google/android/gms/internal/ads/zzvy;Lcom/google/android/gms/internal/ads/zzv;Z)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    new-instance v2, Ljava/util/ArrayDeque;

    .line 107
    .line 108
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzC:Ljava/util/ArrayDeque;

    .line 112
    .line 113
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-nez v2, :cond_4

    .line 118
    .line 119
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzC:Ljava/util/ArrayDeque;

    .line 120
    .line 121
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Lcom/google/android/gms/internal/ads/zzvp;

    .line 126
    .line 127
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :catch_0
    move-exception v0

    .line 132
    goto/16 :goto_13

    .line 133
    .line 134
    :catch_1
    move-exception v0

    .line 135
    goto :goto_2

    .line 136
    :cond_4
    :goto_1
    iput-object v14, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzD:Lcom/google/android/gms/internal/ads/zzvs;
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/zzwa; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/google/android/gms/internal/ads/zzvs; {:try_start_1 .. :try_end_1} :catch_0

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :goto_2
    :try_start_2
    new-instance v2, Lcom/google/android/gms/internal/ads/zzvs;

    .line 140
    .line 141
    const v3, -0xc34e

    .line 142
    .line 143
    .line 144
    invoke-direct {v2, v13, v0, v11, v3}, Lcom/google/android/gms/internal/ads/zzvs;-><init>(Lcom/google/android/gms/internal/ads/zzv;Ljava/lang/Throwable;ZI)V

    .line 145
    .line 146
    .line 147
    throw v2

    .line 148
    :cond_5
    :goto_3
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzC:Ljava/util/ArrayDeque;

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-nez v0, :cond_1e

    .line 155
    .line 156
    iget-object v15, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzC:Ljava/util/ArrayDeque;

    .line 157
    .line 158
    if-eqz v15, :cond_1d

    .line 159
    .line 160
    :goto_4
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 161
    .line 162
    if-nez v0, :cond_1c

    .line 163
    .line 164
    invoke-virtual {v15}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    move-object v2, v0

    .line 169
    check-cast v2, Lcom/google/android/gms/internal/ads/zzvp;

    .line 170
    .line 171
    if-eqz v2, :cond_1b

    .line 172
    .line 173
    invoke-virtual {v1, v13}, Lcom/google/android/gms/internal/ads/zzvw;->zzaW(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzvw;->zzaI(Lcom/google/android/gms/internal/ads/zzvp;)Z

    .line 177
    .line 178
    .line 179
    move-result v0
    :try_end_2
    .catch Lcom/google/android/gms/internal/ads/zzvs; {:try_start_2 .. :try_end_2} :catch_0

    .line 180
    if-eqz v0, :cond_20

    .line 181
    .line 182
    :try_start_3
    const-string v0, "createCodec:"

    .line 183
    .line 184
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzE:Lcom/google/android/gms/internal/ads/zzvp;

    .line 185
    .line 186
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzo:Lcom/google/android/gms/internal/ads/zzv;

    .line 187
    .line 188
    if-eqz v3, :cond_18

    .line 189
    .line 190
    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzvp;->zza:Ljava/lang/String;

    .line 191
    .line 192
    iget v5, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzw:F

    .line 193
    .line 194
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzJ()[Lcom/google/android/gms/internal/ads/zzv;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {v1, v5, v3, v6}, Lcom/google/android/gms/internal/ads/zzvw;->zzal(FLcom/google/android/gms/internal/ads/zzv;[Lcom/google/android/gms/internal/ads/zzv;)F

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzf:F

    .line 203
    .line 204
    cmpg-float v6, v5, v6

    .line 205
    .line 206
    if-gtz v6, :cond_6

    .line 207
    .line 208
    const/high16 v5, -0x40800000    # -1.0f

    .line 209
    .line 210
    :cond_6
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzM()Lcom/google/android/gms/internal/ads/zzdp;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzdp;->zzb()J

    .line 215
    .line 216
    .line 217
    move-result-wide v6
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 218
    move/from16 v16, v10

    .line 219
    .line 220
    :try_start_4
    invoke-virtual {v1, v2, v3, v14, v5}, Lcom/google/android/gms/internal/ads/zzvw;->zzai(Lcom/google/android/gms/internal/ads/zzvp;Lcom/google/android/gms/internal/ads/zzv;Landroid/media/MediaCrypto;F)Lcom/google/android/gms/internal/ads/zzvj;

    .line 221
    .line 222
    .line 223
    move-result-object v10

    .line 224
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 225
    .line 226
    const/16 v14, 0x1f

    .line 227
    .line 228
    if-lt v11, v14, :cond_7

    .line 229
    .line 230
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzL()Lcom/google/android/gms/internal/ads/zzqh;

    .line 231
    .line 232
    .line 233
    move-result-object v18

    .line 234
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/ads/zzqh;->zza()Landroid/media/metrics/LogSessionId;

    .line 235
    .line 236
    .line 237
    move-result-object v18

    .line 238
    invoke-static {}, LF5/i;->g()Landroid/media/metrics/LogSessionId;

    .line 239
    .line 240
    .line 241
    invoke-static/range {v18 .. v18}, LV1/h;->v(Landroid/media/metrics/LogSessionId;)Z

    .line 242
    .line 243
    .line 244
    move-result v19

    .line 245
    if-nez v19, :cond_7

    .line 246
    .line 247
    iget-object v14, v10, Lcom/google/android/gms/internal/ads/zzvj;->zzb:Landroid/media/MediaFormat;

    .line 248
    .line 249
    move-wide/from16 v20, v6

    .line 250
    .line 251
    const-string v6, "log-session-id"

    .line 252
    .line 253
    invoke-static/range {v18 .. v18}, Lab/d;->n(Landroid/media/metrics/LogSessionId;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    invoke-virtual {v14, v6, v7}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 258
    .line 259
    .line 260
    goto :goto_6

    .line 261
    :catch_2
    move-exception v0

    .line 262
    :goto_5
    move-object v10, v2

    .line 263
    goto/16 :goto_11

    .line 264
    .line 265
    :cond_7
    move-wide/from16 v20, v6

    .line 266
    .line 267
    :goto_6
    :try_start_5
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    add-int/lit8 v6, v6, 0xc

    .line 272
    .line 273
    new-instance v7, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzd:Lcom/google/android/gms/internal/ads/zzvk;

    .line 292
    .line 293
    invoke-interface {v0, v10}, Lcom/google/android/gms/internal/ads/zzvk;->zzc(Lcom/google/android/gms/internal/ads/zzvj;)Lcom/google/android/gms/internal/ads/zzvm;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 298
    .line 299
    new-instance v6, Lcom/google/android/gms/internal/ads/zzvu;

    .line 300
    .line 301
    const/4 v7, 0x0

    .line 302
    invoke-direct {v6, v1, v7}, Lcom/google/android/gms/internal/ads/zzvu;-><init>(Lcom/google/android/gms/internal/ads/zzvw;[B)V

    .line 303
    .line 304
    .line 305
    invoke-interface {v0, v6}, Lcom/google/android/gms/internal/ads/zzvm;->zzm(Lcom/google/android/gms/internal/ads/zzvl;)Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    iput-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzM:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 310
    .line 311
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzM()Lcom/google/android/gms/internal/ads/zzdp;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdp;->zzb()J

    .line 319
    .line 320
    .line 321
    move-result-wide v6

    .line 322
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzc:Landroid/content/Context;

    .line 323
    .line 324
    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/internal/ads/zzvp;->zzc(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    if-nez v0, :cond_8

    .line 329
    .line 330
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzv;->zze(Lcom/google/android/gms/internal/ads/zzv;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    sget-object v14, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 335
    .line 336
    sget-object v14, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 337
    .line 338
    new-instance v14, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 341
    .line 342
    .line 343
    move-wide/from16 v22, v6

    .line 344
    .line 345
    const-string v6, "Format exceeds selected codec\'s capabilities ["

    .line 346
    .line 347
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    const-string v0, ", "

    .line 354
    .line 355
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    const-string v0, "]"

    .line 362
    .line 363
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    goto :goto_7

    .line 374
    :cond_8
    move-wide/from16 v22, v6

    .line 375
    .line 376
    :goto_7
    iput v5, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzB:F

    .line 377
    .line 378
    iput-object v3, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzy:Lcom/google/android/gms/internal/ads/zzv;

    .line 379
    .line 380
    const/16 v0, 0x19

    .line 381
    .line 382
    const/4 v3, 0x2

    .line 383
    if-gt v11, v0, :cond_a

    .line 384
    .line 385
    const-string v5, "OMX.Exynos.avc.dec.secure"

    .line 386
    .line 387
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v5

    .line 391
    if-eqz v5, :cond_a

    .line 392
    .line 393
    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 394
    .line 395
    const-string v6, "SM-T585"

    .line 396
    .line 397
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 398
    .line 399
    .line 400
    move-result v6

    .line 401
    if-nez v6, :cond_9

    .line 402
    .line 403
    const-string v6, "SM-A510"

    .line 404
    .line 405
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 406
    .line 407
    .line 408
    move-result v6

    .line 409
    if-nez v6, :cond_9

    .line 410
    .line 411
    const-string v6, "SM-A520"

    .line 412
    .line 413
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 414
    .line 415
    .line 416
    move-result v6

    .line 417
    if-nez v6, :cond_9

    .line 418
    .line 419
    const-string v6, "SM-J700"

    .line 420
    .line 421
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    if-eqz v5, :cond_a

    .line 426
    .line 427
    :cond_9
    move v5, v3

    .line 428
    goto :goto_9

    .line 429
    :cond_a
    const/16 v5, 0x18

    .line 430
    .line 431
    if-ge v11, v5, :cond_b

    .line 432
    .line 433
    const-string v5, "OMX.Nvidia.h264.decode"

    .line 434
    .line 435
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v5

    .line 439
    if-nez v5, :cond_c

    .line 440
    .line 441
    const-string v5, "OMX.Nvidia.h264.decode.secure"

    .line 442
    .line 443
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v5

    .line 447
    if-eqz v5, :cond_b

    .line 448
    .line 449
    goto :goto_8

    .line 450
    :cond_b
    const/4 v5, 0x0

    .line 451
    goto :goto_9

    .line 452
    :cond_c
    :goto_8
    const-string v5, "flounder"

    .line 453
    .line 454
    sget-object v6, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 455
    .line 456
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    if-nez v5, :cond_d

    .line 461
    .line 462
    const-string v5, "flounder_lte"

    .line 463
    .line 464
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    move-result v5

    .line 468
    if-nez v5, :cond_d

    .line 469
    .line 470
    const-string v5, "grouper"

    .line 471
    .line 472
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v5

    .line 476
    if-nez v5, :cond_d

    .line 477
    .line 478
    const-string v5, "tilapia"

    .line 479
    .line 480
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v5

    .line 484
    if-eqz v5, :cond_b

    .line 485
    .line 486
    :cond_d
    move/from16 v5, v16

    .line 487
    .line 488
    :goto_9
    iput v5, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzF:I

    .line 489
    .line 490
    const/16 v5, 0x1d

    .line 491
    .line 492
    if-ne v11, v5, :cond_e

    .line 493
    .line 494
    const-string v6, "c2.android.aac.decoder"

    .line 495
    .line 496
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    move-result v6

    .line 500
    if-eqz v6, :cond_e

    .line 501
    .line 502
    move/from16 v6, v16

    .line 503
    .line 504
    goto :goto_a

    .line 505
    :cond_e
    const/4 v6, 0x0

    .line 506
    :goto_a
    iput-boolean v6, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzG:Z

    .line 507
    .line 508
    const/16 v6, 0x17

    .line 509
    .line 510
    if-ne v11, v6, :cond_f

    .line 511
    .line 512
    const-string v6, "OMX.google.vorbis.decoder"

    .line 513
    .line 514
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result v6

    .line 518
    if-eqz v6, :cond_f

    .line 519
    .line 520
    move/from16 v6, v16

    .line 521
    .line 522
    goto :goto_b

    .line 523
    :cond_f
    const/4 v6, 0x0

    .line 524
    :goto_b
    iput-boolean v6, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzH:Z

    .line 525
    .line 526
    iget-object v6, v2, Lcom/google/android/gms/internal/ads/zzvp;->zza:Ljava/lang/String;

    .line 527
    .line 528
    if-gt v11, v0, :cond_11

    .line 529
    .line 530
    const-string v0, "OMX.rk.video_decoder.avc"

    .line 531
    .line 532
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    move-result v0

    .line 536
    if-nez v0, :cond_10

    .line 537
    .line 538
    goto :goto_d

    .line 539
    :cond_10
    :goto_c
    move/from16 v0, v16

    .line 540
    .line 541
    goto :goto_e

    .line 542
    :cond_11
    :goto_d
    if-gt v11, v5, :cond_12

    .line 543
    .line 544
    const-string v0, "OMX.broadcom.video_decoder.tunnel"

    .line 545
    .line 546
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    if-nez v0, :cond_10

    .line 551
    .line 552
    const-string v0, "OMX.broadcom.video_decoder.tunnel.secure"

    .line 553
    .line 554
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result v0

    .line 558
    if-nez v0, :cond_10

    .line 559
    .line 560
    const-string v0, "OMX.bcm.vdec.avc.tunnel"

    .line 561
    .line 562
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v0

    .line 566
    if-nez v0, :cond_10

    .line 567
    .line 568
    const-string v0, "OMX.bcm.vdec.avc.tunnel.secure"

    .line 569
    .line 570
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v0

    .line 574
    if-nez v0, :cond_10

    .line 575
    .line 576
    const-string v0, "OMX.bcm.vdec.hevc.tunnel"

    .line 577
    .line 578
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    move-result v0

    .line 582
    if-nez v0, :cond_10

    .line 583
    .line 584
    const-string v0, "OMX.bcm.vdec.hevc.tunnel.secure"

    .line 585
    .line 586
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    move-result v0

    .line 590
    if-nez v0, :cond_10

    .line 591
    .line 592
    :cond_12
    const-string v0, "Amazon"

    .line 593
    .line 594
    sget-object v5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 595
    .line 596
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    if-eqz v0, :cond_13

    .line 601
    .line 602
    const-string v0, "AFTS"

    .line 603
    .line 604
    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 605
    .line 606
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    if-eqz v0, :cond_13

    .line 611
    .line 612
    iget-boolean v0, v2, Lcom/google/android/gms/internal/ads/zzvp;->zzf:Z

    .line 613
    .line 614
    if-eqz v0, :cond_13

    .line 615
    .line 616
    goto :goto_c

    .line 617
    :cond_13
    const/4 v0, 0x0

    .line 618
    :goto_e
    iput-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzK:Z

    .line 619
    .line 620
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 621
    .line 622
    if-eqz v0, :cond_17

    .line 623
    .line 624
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zze()I

    .line 625
    .line 626
    .line 627
    move-result v0

    .line 628
    if-ne v0, v3, :cond_14

    .line 629
    .line 630
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzM()Lcom/google/android/gms/internal/ads/zzdp;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdp;->zzb()J

    .line 635
    .line 636
    .line 637
    move-result-wide v5

    .line 638
    const-wide/16 v24, 0x3e8

    .line 639
    .line 640
    add-long v5, v5, v24

    .line 641
    .line 642
    iput-wide v5, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzN:J

    .line 643
    .line 644
    :cond_14
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zza:Lcom/google/android/gms/internal/ads/zzjd;

    .line 645
    .line 646
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzjd;->zza:I

    .line 647
    .line 648
    add-int/lit8 v3, v3, 0x1

    .line 649
    .line 650
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzjd;->zza:I

    .line 651
    .line 652
    sub-long v6, v22, v20

    .line 653
    .line 654
    const/16 v0, 0x1f

    .line 655
    .line 656
    if-lt v11, v0, :cond_15

    .line 657
    .line 658
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzap:Lcom/google/android/gms/internal/ads/zzgxd;

    .line 659
    .line 660
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 661
    .line 662
    .line 663
    move-result v0

    .line 664
    if-nez v0, :cond_15

    .line 665
    .line 666
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 667
    .line 668
    if-eqz v0, :cond_16

    .line 669
    .line 670
    new-instance v3, Ljava/util/ArrayList;

    .line 671
    .line 672
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzap:Lcom/google/android/gms/internal/ads/zzgxd;

    .line 673
    .line 674
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 675
    .line 676
    .line 677
    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/zzvm;->zzr(Ljava/util/List;)V

    .line 678
    .line 679
    .line 680
    :cond_15
    move-object v3, v10

    .line 681
    move-object v10, v2

    .line 682
    move-object v2, v4

    .line 683
    move-wide/from16 v4, v22

    .line 684
    .line 685
    goto :goto_f

    .line 686
    :cond_16
    const/16 v17, 0x0

    .line 687
    .line 688
    throw v17
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 689
    :goto_f
    :try_start_7
    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzvw;->zzam(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzvj;JJ)V

    .line 690
    .line 691
    .line 692
    :goto_10
    move/from16 v10, v16

    .line 693
    .line 694
    const/4 v11, 0x0

    .line 695
    const/4 v14, 0x0

    .line 696
    goto/16 :goto_4

    .line 697
    .line 698
    :catch_3
    move-exception v0

    .line 699
    goto :goto_11

    .line 700
    :cond_17
    move-object v10, v2

    .line 701
    const/16 v17, 0x0

    .line 702
    .line 703
    throw v17

    .line 704
    :catchall_0
    move-exception v0

    .line 705
    move-object v10, v2

    .line 706
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 707
    .line 708
    .line 709
    throw v0

    .line 710
    :catch_4
    move-exception v0

    .line 711
    move/from16 v16, v10

    .line 712
    .line 713
    goto/16 :goto_5

    .line 714
    .line 715
    :cond_18
    move/from16 v16, v10

    .line 716
    .line 717
    move-object/from16 v17, v14

    .line 718
    .line 719
    move-object v10, v2

    .line 720
    throw v17
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 721
    :goto_11
    :try_start_8
    iget-object v2, v10, Lcom/google/android/gms/internal/ads/zzvp;->zza:Ljava/lang/String;

    .line 722
    .line 723
    invoke-virtual {v12, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v2

    .line 727
    invoke-static {v8, v2, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 728
    .line 729
    .line 730
    invoke-virtual {v15}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    new-instance v2, Lcom/google/android/gms/internal/ads/zzvs;

    .line 734
    .line 735
    const/4 v3, 0x0

    .line 736
    invoke-direct {v2, v13, v0, v3, v10}, Lcom/google/android/gms/internal/ads/zzvs;-><init>(Lcom/google/android/gms/internal/ads/zzv;Ljava/lang/Throwable;ZLcom/google/android/gms/internal/ads/zzvp;)V

    .line 737
    .line 738
    .line 739
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzvw;->zzao(Ljava/lang/Exception;)V

    .line 740
    .line 741
    .line 742
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzD:Lcom/google/android/gms/internal/ads/zzvs;

    .line 743
    .line 744
    if-nez v0, :cond_19

    .line 745
    .line 746
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzD:Lcom/google/android/gms/internal/ads/zzvs;

    .line 747
    .line 748
    goto :goto_12

    .line 749
    :cond_19
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzvs;->zza(Lcom/google/android/gms/internal/ads/zzvs;)Lcom/google/android/gms/internal/ads/zzvs;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzD:Lcom/google/android/gms/internal/ads/zzvs;

    .line 754
    .line 755
    :goto_12
    invoke-virtual {v15}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 756
    .line 757
    .line 758
    move-result v0

    .line 759
    if-nez v0, :cond_1a

    .line 760
    .line 761
    goto :goto_10

    .line 762
    :cond_1a
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzD:Lcom/google/android/gms/internal/ads/zzvs;

    .line 763
    .line 764
    throw v0

    .line 765
    :cond_1b
    move-object v7, v14

    .line 766
    throw v7

    .line 767
    :cond_1c
    move-object v7, v14

    .line 768
    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzC:Ljava/util/ArrayDeque;

    .line 769
    .line 770
    goto :goto_14

    .line 771
    :cond_1d
    move-object v7, v14

    .line 772
    throw v7

    .line 773
    :cond_1e
    move-object v7, v14

    .line 774
    new-instance v0, Lcom/google/android/gms/internal/ads/zzvs;

    .line 775
    .line 776
    const v2, -0xc34f

    .line 777
    .line 778
    .line 779
    const/4 v3, 0x0

    .line 780
    invoke-direct {v0, v13, v7, v3, v2}, Lcom/google/android/gms/internal/ads/zzvs;-><init>(Lcom/google/android/gms/internal/ads/zzv;Ljava/lang/Throwable;ZI)V

    .line 781
    .line 782
    .line 783
    throw v0

    .line 784
    :cond_1f
    move-object/from16 v17, v14

    .line 785
    .line 786
    throw v17
    :try_end_8
    .catch Lcom/google/android/gms/internal/ads/zzvs; {:try_start_8 .. :try_end_8} :catch_0

    .line 787
    :goto_13
    const/16 v2, 0xfa1

    .line 788
    .line 789
    const/4 v3, 0x0

    .line 790
    invoke-virtual {v1, v0, v9, v3, v2}, Lcom/google/android/gms/internal/ads/zziz;->zzQ(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzv;ZI)Lcom/google/android/gms/internal/ads/zzjm;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    throw v0

    .line 795
    :cond_20
    :goto_14
    return-void
.end method

.method public final zzaH(Lcom/google/android/gms/internal/ads/zzv;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzr:Lcom/google/android/gms/internal/ads/zzuj;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzvw;->zzah(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public zzaI(Lcom/google/android/gms/internal/ads/zzvp;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final zzaJ()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzS:Z

    return v0
.end method

.method public final zzaK()Lcom/google/android/gms/internal/ads/zzvm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    return-object v0
.end method

.method public final zzaL()Lcom/google/android/gms/internal/ads/zzv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzy:Lcom/google/android/gms/internal/ads/zzv;

    return-object v0
.end method

.method public final zzaM()Landroid/media/MediaFormat;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzz:Landroid/media/MediaFormat;

    return-object v0
.end method

.method public final zzaN()Lcom/google/android/gms/internal/ads/zzvp;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzE:Lcom/google/android/gms/internal/ads/zzvp;

    return-object v0
.end method

.method public final zzaO()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 3
    .line 4
    if-eqz v1, :cond_1

    .line 5
    .line 6
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzvm;->zzl()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zza:Lcom/google/android/gms/internal/ads/zzjd;

    .line 10
    .line 11
    iget v2, v1, Lcom/google/android/gms/internal/ads/zzjd;->zzb:I

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    .line 15
    iput v2, v1, Lcom/google/android/gms/internal/ads/zzjd;->zzb:I

    .line 16
    .line 17
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzE:Lcom/google/android/gms/internal/ads/zzvp;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzvp;->zza:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzan(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    :cond_1
    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzt:Landroid/media/MediaCrypto;

    .line 33
    .line 34
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzq:Lcom/google/android/gms/internal/ads/zzuj;

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaU()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :goto_1
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 41
    .line 42
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzt:Landroid/media/MediaCrypto;

    .line 43
    .line 44
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzq:Lcom/google/android/gms/internal/ads/zzuj;

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaU()V

    .line 47
    .line 48
    .line 49
    throw v1
.end method

.method public final zzaP()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaz()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaG()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return v0
.end method

.method public zzaQ()Z
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzY:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v1, :cond_3

    .line 6
    .line 7
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzG:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzab:Z

    .line 12
    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzH:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzaa:Z

    .line 20
    .line 21
    if-nez v1, :cond_3

    .line 22
    .line 23
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzX:I

    .line 24
    .line 25
    if-ne v1, v2, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/4 v1, 0x2

    .line 29
    if-ne v0, v1, :cond_2

    .line 30
    .line 31
    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbw()V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzjm; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception v0

    .line 36
    const-string v1, "MediaCodecRenderer"

    .line 37
    .line 38
    const-string v3, "Failed to update the DRM session, releasing the codec instead."

    .line 39
    .line 40
    invoke-static {v1, v3, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    return v2

    .line 44
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 45
    return v0

    .line 46
    :cond_3
    :goto_1
    return v2
.end method

.method public zzaR()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zzaS()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzam:J

    return-wide v0
.end method

.method public zzaT()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbo()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbp()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaB()V

    .line 8
    .line 9
    .line 10
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzN:J

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzaa:Z

    .line 19
    .line 20
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzL:J

    .line 21
    .line 22
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzZ:Z

    .line 23
    .line 24
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzI:Z

    .line 25
    .line 26
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzJ:Z

    .line 27
    .line 28
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzR:Z

    .line 29
    .line 30
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzX:I

    .line 31
    .line 32
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzY:I

    .line 33
    .line 34
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzV:Z

    .line 35
    .line 36
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzW:I

    .line 37
    .line 38
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzal:Z

    .line 39
    .line 40
    const-wide/16 v0, 0x0

    .line 41
    .line 42
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzam:J

    .line 43
    .line 44
    return-void
.end method

.method public final zzaU()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaT()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzC:Ljava/util/ArrayDeque;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzE:Lcom/google/android/gms/internal/ads/zzvp;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzy:Lcom/google/android/gms/internal/ads/zzv;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzz:Landroid/media/MediaFormat;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzA:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzab:Z

    .line 17
    .line 18
    const/high16 v1, -0x40800000    # -1.0f

    .line 19
    .line 20
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzB:F

    .line 21
    .line 22
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzF:I

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzG:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzH:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzK:Z

    .line 29
    .line 30
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzM:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzV:Z

    .line 33
    .line 34
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzW:I

    .line 35
    .line 36
    return-void
.end method

.method public zzaV(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzvp;)Lcom/google/android/gms/internal/ads/zzvo;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzvo;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzvo;-><init>(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzvp;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public zzaW(Lcom/google/android/gms/internal/ads/zzv;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    const/4 p1, 0x1

    return p1
.end method

.method public zzaX(Lcom/google/android/gms/internal/ads/zzix;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    return-void
.end method

.method public zzaY(Lcom/google/android/gms/internal/ads/zzix;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public zzaZ(Lcom/google/android/gms/internal/ads/zzix;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public zzaa(JJ)V
    .locals 25
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    :try_start_0
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzaf:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzav()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception v0

    .line 13
    move v15, v2

    .line 14
    :goto_0
    const/4 v10, 0x0

    .line 15
    goto/16 :goto_26

    .line 16
    .line 17
    :catch_1
    move-exception v0

    .line 18
    const/4 v10, 0x0

    .line 19
    goto/16 :goto_2a

    .line 20
    .line 21
    :cond_0
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzo:Lcom/google/android/gms/internal/ads/zzv;

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-direct {v1, v4}, Lcom/google/android/gms/internal/ads/zzvw;->zzaC(I)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto/16 :goto_25

    .line 33
    .line 34
    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzaG()V

    .line 35
    .line 36
    .line 37
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzS:Z
    :try_end_0
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    const/4 v5, -0x5

    .line 40
    const/4 v6, 0x0

    .line 41
    if-eqz v0, :cond_1a

    .line 42
    .line 43
    :try_start_1
    const-string v0, "bypassRender"

    .line 44
    .line 45
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzaf:Z

    .line 49
    .line 50
    xor-int/2addr v0, v2

    .line 51
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V

    .line 52
    .line 53
    .line 54
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzj:Lcom/google/android/gms/internal/ads/zzvd;

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvd;->zzp()Z

    .line 57
    .line 58
    .line 59
    move-result v4
    :try_end_1
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_9

    .line 60
    if-eqz v4, :cond_4

    .line 61
    .line 62
    :try_start_2
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzix;->zzc:Ljava/nio/ByteBuffer;

    .line 63
    .line 64
    iget v8, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzP:I

    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvd;->zzo()I

    .line 67
    .line 68
    .line 69
    move-result v10

    .line 70
    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/zzix;->zzd:J

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzH()J

    .line 73
    .line 74
    .line 75
    move-result-wide v13

    .line 76
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvd;->zzn()J

    .line 77
    .line 78
    .line 79
    move-result-wide v2

    .line 80
    invoke-direct {v1, v13, v14, v2, v3}, Lcom/google/android/gms/internal/ads/zzvw;->zzbx(JJ)Z

    .line 81
    .line 82
    .line 83
    move-result v13

    .line 84
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzis;->zzb()Z

    .line 85
    .line 86
    .line 87
    move-result v14

    .line 88
    const/4 v2, 0x1

    .line 89
    iget-object v15, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzp:Lcom/google/android/gms/internal/ads/zzv;

    .line 90
    .line 91
    if-eqz v15, :cond_3

    .line 92
    .line 93
    move-object v3, v6

    .line 94
    const/4 v6, 0x0

    .line 95
    const/4 v4, 0x0

    .line 96
    const/4 v9, 0x0

    .line 97
    move-wide/from16 v2, p1

    .line 98
    .line 99
    move-wide/from16 v4, p3

    .line 100
    .line 101
    invoke-virtual/range {v1 .. v15}, Lcom/google/android/gms/internal/ads/zzvw;->zzat(JJLcom/google/android/gms/internal/ads/zzvm;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzv;)Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-eqz v6, :cond_2

    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvd;->zzn()J

    .line 108
    .line 109
    .line 110
    move-result-wide v2

    .line 111
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzvw;->zzbb(J)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvd;->zza()V

    .line 115
    .line 116
    .line 117
    const/4 v2, 0x0

    .line 118
    goto :goto_3

    .line 119
    :catch_2
    move-exception v0

    .line 120
    const/4 v10, 0x0

    .line 121
    const/4 v15, 0x1

    .line 122
    goto/16 :goto_26

    .line 123
    .line 124
    :cond_2
    const/4 v3, 0x1

    .line 125
    :goto_2
    const/4 v5, 0x0

    .line 126
    goto/16 :goto_b

    .line 127
    .line 128
    :cond_3
    move-object v2, v6

    .line 129
    throw v2
    :try_end_2
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    .line 130
    :cond_4
    move-object v2, v6

    .line 131
    :goto_3
    :try_start_3
    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzae:Z
    :try_end_3
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_8

    .line 132
    .line 133
    if-eqz v3, :cond_5

    .line 134
    .line 135
    const/4 v3, 0x1

    .line 136
    :try_start_4
    iput-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzaf:Z
    :try_end_4
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_3

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :catch_3
    move-exception v0

    .line 140
    move v15, v3

    .line 141
    goto :goto_0

    .line 142
    :cond_5
    const/4 v3, 0x1

    .line 143
    :try_start_5
    iget-boolean v4, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzT:Z

    .line 144
    .line 145
    if-eqz v4, :cond_6

    .line 146
    .line 147
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzi:Lcom/google/android/gms/internal/ads/zzix;

    .line 148
    .line 149
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzvd;->zzq(Lcom/google/android/gms/internal/ads/zzix;)Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V
    :try_end_5
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_6

    .line 154
    .line 155
    .line 156
    const/4 v5, 0x0

    .line 157
    :try_start_6
    iput-boolean v5, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzT:Z

    .line 158
    .line 159
    goto :goto_7

    .line 160
    :catch_4
    move-exception v0

    .line 161
    :goto_4
    move v15, v3

    .line 162
    move v10, v5

    .line 163
    goto/16 :goto_26

    .line 164
    .line 165
    :catch_5
    move-exception v0

    .line 166
    :goto_5
    move v10, v5

    .line 167
    goto/16 :goto_2a

    .line 168
    .line 169
    :catch_6
    move-exception v0

    .line 170
    :goto_6
    const/4 v5, 0x0

    .line 171
    goto :goto_4

    .line 172
    :catch_7
    move-exception v0

    .line 173
    const/4 v5, 0x0

    .line 174
    goto :goto_5

    .line 175
    :cond_6
    const/4 v5, 0x0

    .line 176
    :goto_7
    iget-boolean v4, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzU:Z

    .line 177
    .line 178
    if-eqz v4, :cond_8

    .line 179
    .line 180
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvd;->zzp()Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-eqz v4, :cond_7

    .line 185
    .line 186
    const/4 v8, -0x5

    .line 187
    goto/16 :goto_c

    .line 188
    .line 189
    :cond_7
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzar()V

    .line 190
    .line 191
    .line 192
    iput-boolean v5, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzU:Z

    .line 193
    .line 194
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzaG()V

    .line 195
    .line 196
    .line 197
    iget-boolean v4, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzS:Z

    .line 198
    .line 199
    if-nez v4, :cond_8

    .line 200
    .line 201
    goto/16 :goto_b

    .line 202
    .line 203
    :cond_8
    iget-boolean v4, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzae:Z

    .line 204
    .line 205
    xor-int/2addr v4, v3

    .line 206
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzI()Lcom/google/android/gms/internal/ads/zzly;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzi:Lcom/google/android/gms/internal/ads/zzix;

    .line 214
    .line 215
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzix;->zza()V

    .line 216
    .line 217
    .line 218
    :cond_9
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzix;->zza()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v4, v6, v5}, Lcom/google/android/gms/internal/ads/zziz;->zzR(Lcom/google/android/gms/internal/ads/zzly;Lcom/google/android/gms/internal/ads/zzix;I)I

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    const/4 v8, -0x5

    .line 226
    if-eq v7, v8, :cond_15

    .line 227
    .line 228
    const/4 v9, -0x4

    .line 229
    if-eq v7, v9, :cond_a

    .line 230
    .line 231
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzcW()Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eqz v4, :cond_16

    .line 236
    .line 237
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbv()Lcom/google/android/gms/internal/ads/zzvv;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    iget-wide v6, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzac:J

    .line 242
    .line 243
    invoke-virtual {v4, v6, v7}, Lcom/google/android/gms/internal/ads/zzvv;->zzi(J)V

    .line 244
    .line 245
    .line 246
    goto/16 :goto_a

    .line 247
    .line 248
    :cond_a
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzis;->zzb()Z

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-eqz v7, :cond_b

    .line 253
    .line 254
    iput-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzae:Z

    .line 255
    .line 256
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbv()Lcom/google/android/gms/internal/ads/zzvv;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    iget-wide v6, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzac:J

    .line 261
    .line 262
    invoke-virtual {v4, v6, v7}, Lcom/google/android/gms/internal/ads/zzvv;->zzi(J)V

    .line 263
    .line 264
    .line 265
    goto/16 :goto_a

    .line 266
    .line 267
    :cond_b
    iget-wide v9, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzac:J

    .line 268
    .line 269
    iget-wide v11, v6, Lcom/google/android/gms/internal/ads/zzix;->zzd:J

    .line 270
    .line 271
    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 272
    .line 273
    .line 274
    move-result-wide v9

    .line 275
    iput-wide v9, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzac:J

    .line 276
    .line 277
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzcW()Z

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    if-nez v7, :cond_c

    .line 282
    .line 283
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzh:Lcom/google/android/gms/internal/ads/zzix;

    .line 284
    .line 285
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzis;->zzd()Z

    .line 286
    .line 287
    .line 288
    move-result v7

    .line 289
    if-eqz v7, :cond_d

    .line 290
    .line 291
    :cond_c
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbv()Lcom/google/android/gms/internal/ads/zzvv;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    iget-wide v9, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzac:J

    .line 296
    .line 297
    invoke-virtual {v7, v9, v10}, Lcom/google/android/gms/internal/ads/zzvv;->zzi(J)V

    .line 298
    .line 299
    .line 300
    :cond_d
    iget-boolean v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzag:Z
    :try_end_6
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_4

    .line 301
    .line 302
    const-string v9, "audio/opus"

    .line 303
    .line 304
    if-eqz v7, :cond_10

    .line 305
    .line 306
    :try_start_7
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzo:Lcom/google/android/gms/internal/ads/zzv;

    .line 307
    .line 308
    if-eqz v7, :cond_f

    .line 309
    .line 310
    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzp:Lcom/google/android/gms/internal/ads/zzv;

    .line 311
    .line 312
    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 313
    .line 314
    invoke-static {v7, v9}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v7

    .line 318
    if-eqz v7, :cond_e

    .line 319
    .line 320
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzp:Lcom/google/android/gms/internal/ads/zzv;

    .line 321
    .line 322
    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzv;->zzs:Ljava/util/List;

    .line 323
    .line 324
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 325
    .line 326
    .line 327
    move-result v7

    .line 328
    if-nez v7, :cond_e

    .line 329
    .line 330
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzp:Lcom/google/android/gms/internal/ads/zzv;

    .line 331
    .line 332
    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzv;->zzs:Ljava/util/List;

    .line 333
    .line 334
    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v7

    .line 338
    check-cast v7, [B

    .line 339
    .line 340
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzgx;->zze([B)I

    .line 341
    .line 342
    .line 343
    move-result v7

    .line 344
    iget-object v10, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzp:Lcom/google/android/gms/internal/ads/zzv;

    .line 345
    .line 346
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 347
    .line 348
    .line 349
    move-result-object v10

    .line 350
    invoke-virtual {v10, v7}, Lcom/google/android/gms/internal/ads/zzt;->zzK(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    iput-object v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzp:Lcom/google/android/gms/internal/ads/zzv;

    .line 358
    .line 359
    :cond_e
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzp:Lcom/google/android/gms/internal/ads/zzv;

    .line 360
    .line 361
    invoke-virtual {v1, v7, v2}, Lcom/google/android/gms/internal/ads/zzvw;->zzaq(Lcom/google/android/gms/internal/ads/zzv;Landroid/media/MediaFormat;)V

    .line 362
    .line 363
    .line 364
    iput-boolean v5, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzag:Z

    .line 365
    .line 366
    goto :goto_8

    .line 367
    :cond_f
    throw v2

    .line 368
    :cond_10
    :goto_8
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzix;->zzl()V

    .line 369
    .line 370
    .line 371
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzp:Lcom/google/android/gms/internal/ads/zzv;

    .line 372
    .line 373
    if-eqz v7, :cond_12

    .line 374
    .line 375
    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 376
    .line 377
    invoke-static {v7, v9}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v7

    .line 381
    if-eqz v7, :cond_12

    .line 382
    .line 383
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzis;->zze()Z

    .line 384
    .line 385
    .line 386
    move-result v7

    .line 387
    if-eqz v7, :cond_11

    .line 388
    .line 389
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzp:Lcom/google/android/gms/internal/ads/zzv;

    .line 390
    .line 391
    iput-object v7, v6, Lcom/google/android/gms/internal/ads/zzix;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 392
    .line 393
    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/ads/zzvw;->zzax(Lcom/google/android/gms/internal/ads/zzix;)V

    .line 394
    .line 395
    .line 396
    :cond_11
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzH()J

    .line 397
    .line 398
    .line 399
    move-result-wide v9

    .line 400
    iget-wide v11, v6, Lcom/google/android/gms/internal/ads/zzix;->zzd:J

    .line 401
    .line 402
    invoke-static {v9, v10, v11, v12}, Lcom/google/android/gms/internal/ads/zzgx;->zzf(JJ)Z

    .line 403
    .line 404
    .line 405
    move-result v7

    .line 406
    if-eqz v7, :cond_12

    .line 407
    .line 408
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzm:Lcom/google/android/gms/internal/ads/zzub;

    .line 409
    .line 410
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzp:Lcom/google/android/gms/internal/ads/zzv;

    .line 411
    .line 412
    iget-object v9, v9, Lcom/google/android/gms/internal/ads/zzv;->zzs:Ljava/util/List;

    .line 413
    .line 414
    invoke-virtual {v7, v6, v9}, Lcom/google/android/gms/internal/ads/zzub;->zza(Lcom/google/android/gms/internal/ads/zzix;Ljava/util/List;)V

    .line 415
    .line 416
    .line 417
    :cond_12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvd;->zzp()Z

    .line 418
    .line 419
    .line 420
    move-result v7

    .line 421
    if-nez v7, :cond_13

    .line 422
    .line 423
    goto :goto_9

    .line 424
    :cond_13
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzH()J

    .line 425
    .line 426
    .line 427
    move-result-wide v9

    .line 428
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvd;->zzn()J

    .line 429
    .line 430
    .line 431
    move-result-wide v11

    .line 432
    invoke-direct {v1, v9, v10, v11, v12}, Lcom/google/android/gms/internal/ads/zzvw;->zzbx(JJ)Z

    .line 433
    .line 434
    .line 435
    move-result v7

    .line 436
    iget-wide v11, v6, Lcom/google/android/gms/internal/ads/zzix;->zzd:J

    .line 437
    .line 438
    invoke-direct {v1, v9, v10, v11, v12}, Lcom/google/android/gms/internal/ads/zzvw;->zzbx(JJ)Z

    .line 439
    .line 440
    .line 441
    move-result v9

    .line 442
    if-ne v7, v9, :cond_14

    .line 443
    .line 444
    :goto_9
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzvd;->zzq(Lcom/google/android/gms/internal/ads/zzix;)Z

    .line 445
    .line 446
    .line 447
    move-result v7

    .line 448
    if-nez v7, :cond_9

    .line 449
    .line 450
    :cond_14
    iput-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzT:Z

    .line 451
    .line 452
    goto :goto_a

    .line 453
    :cond_15
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/zzvw;->zzap(Lcom/google/android/gms/internal/ads/zzly;)Lcom/google/android/gms/internal/ads/zzje;

    .line 454
    .line 455
    .line 456
    :cond_16
    :goto_a
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvd;->zzp()Z

    .line 457
    .line 458
    .line 459
    move-result v4

    .line 460
    if-eqz v4, :cond_17

    .line 461
    .line 462
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzix;->zzl()V

    .line 463
    .line 464
    .line 465
    :cond_17
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvd;->zzp()Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-nez v0, :cond_19

    .line 470
    .line 471
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzae:Z

    .line 472
    .line 473
    if-nez v0, :cond_19

    .line 474
    .line 475
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzU:Z

    .line 476
    .line 477
    if-eqz v0, :cond_18

    .line 478
    .line 479
    goto :goto_c

    .line 480
    :cond_18
    :goto_b
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 481
    .line 482
    .line 483
    move v15, v3

    .line 484
    move v10, v5

    .line 485
    goto/16 :goto_24

    .line 486
    .line 487
    :cond_19
    :goto_c
    move-object v6, v2

    .line 488
    move v2, v3

    .line 489
    move v5, v8

    .line 490
    goto/16 :goto_1

    .line 491
    .line 492
    :catch_8
    move-exception v0

    .line 493
    const/4 v3, 0x1

    .line 494
    goto/16 :goto_6

    .line 495
    .line 496
    :catch_9
    move-exception v0

    .line 497
    move v3, v2

    .line 498
    goto/16 :goto_6

    .line 499
    .line 500
    :cond_1a
    move v3, v2

    .line 501
    move v8, v5

    .line 502
    move-object v2, v6

    .line 503
    const/4 v5, 0x0

    .line 504
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 505
    .line 506
    if-eqz v0, :cond_5c

    .line 507
    .line 508
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzM()Lcom/google/android/gms/internal/ads/zzdp;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdp;->zzb()J

    .line 513
    .line 514
    .line 515
    move-result-wide v6

    .line 516
    const-string v0, "drainAndFeed"

    .line 517
    .line 518
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    move-wide v9, v6

    .line 522
    :goto_d
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 523
    .line 524
    if-eqz v6, :cond_5b

    .line 525
    .line 526
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzaE()Z

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    const/4 v7, 0x4

    .line 536
    if-nez v0, :cond_31

    .line 537
    .line 538
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 539
    .line 540
    invoke-interface {v6, v0}, Lcom/google/android/gms/internal/ads/zzvm;->zzf(Landroid/media/MediaCodec$BufferInfo;)I

    .line 541
    .line 542
    .line 543
    move-result v11

    .line 544
    if-gez v11, :cond_2a

    .line 545
    .line 546
    const/4 v0, -0x2

    .line 547
    if-ne v11, v0, :cond_26

    .line 548
    .line 549
    iput-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzab:Z

    .line 550
    .line 551
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 552
    .line 553
    if-eqz v0, :cond_25

    .line 554
    .line 555
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzvm;->zzg()Landroid/media/MediaFormat;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzF:I

    .line 560
    .line 561
    if-eqz v6, :cond_1b

    .line 562
    .line 563
    const-string v6, "width"

    .line 564
    .line 565
    invoke-virtual {v0, v6}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 566
    .line 567
    .line 568
    move-result v6

    .line 569
    const/16 v11, 0x20

    .line 570
    .line 571
    if-ne v6, v11, :cond_1b

    .line 572
    .line 573
    const-string v6, "height"

    .line 574
    .line 575
    invoke-virtual {v0, v6}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 576
    .line 577
    .line 578
    move-result v6

    .line 579
    if-ne v6, v11, :cond_1b

    .line 580
    .line 581
    iput-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzJ:Z

    .line 582
    .line 583
    :goto_e
    move-object/from16 v19, v2

    .line 584
    .line 585
    move-wide v12, v9

    .line 586
    goto/16 :goto_18

    .line 587
    .line 588
    :cond_1b
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 589
    .line 590
    const/16 v11, 0x1d

    .line 591
    .line 592
    if-lt v6, v11, :cond_24

    .line 593
    .line 594
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzap:Lcom/google/android/gms/internal/ads/zzgxd;

    .line 595
    .line 596
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 597
    .line 598
    .line 599
    move-result v6

    .line 600
    if-eqz v6, :cond_1c

    .line 601
    .line 602
    goto/16 :goto_10

    .line 603
    .line 604
    :cond_1c
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzap:Lcom/google/android/gms/internal/ads/zzgxd;

    .line 605
    .line 606
    sget-object v11, Lcom/google/android/gms/internal/ads/zzjb;->zza:Lcom/google/android/gms/internal/ads/zzjb;

    .line 607
    .line 608
    new-instance v11, Lcom/google/android/gms/internal/ads/zzja;

    .line 609
    .line 610
    invoke-direct {v11}, Lcom/google/android/gms/internal/ads/zzja;-><init>()V

    .line 611
    .line 612
    .line 613
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 614
    .line 615
    .line 616
    move-result-object v6

    .line 617
    :cond_1d
    :goto_f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 618
    .line 619
    .line 620
    move-result v12

    .line 621
    if-eqz v12, :cond_23

    .line 622
    .line 623
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v12

    .line 627
    check-cast v12, Ljava/lang/String;

    .line 628
    .line 629
    invoke-virtual {v0, v12}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 630
    .line 631
    .line 632
    move-result v13

    .line 633
    if-eqz v13, :cond_1d

    .line 634
    .line 635
    invoke-static {v0, v12}, Lc5/a;->a(Landroid/media/MediaFormat;Ljava/lang/String;)I

    .line 636
    .line 637
    .line 638
    move-result v13

    .line 639
    if-eq v13, v3, :cond_22

    .line 640
    .line 641
    if-eq v13, v4, :cond_21

    .line 642
    .line 643
    const/4 v14, 0x3

    .line 644
    if-eq v13, v14, :cond_20

    .line 645
    .line 646
    if-eq v13, v7, :cond_1f

    .line 647
    .line 648
    const/4 v14, 0x5

    .line 649
    if-eq v13, v14, :cond_1e

    .line 650
    .line 651
    goto :goto_f

    .line 652
    :cond_1e
    invoke-virtual {v0, v12}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    .line 653
    .line 654
    .line 655
    move-result-object v13

    .line 656
    invoke-virtual {v11, v12, v13}, Lcom/google/android/gms/internal/ads/zzja;->zze(Ljava/lang/String;Ljava/nio/ByteBuffer;)Lcom/google/android/gms/internal/ads/zzja;

    .line 657
    .line 658
    .line 659
    goto :goto_f

    .line 660
    :cond_1f
    invoke-virtual {v0, v12}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v13

    .line 664
    invoke-virtual {v11, v12, v13}, Lcom/google/android/gms/internal/ads/zzja;->zzd(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzja;

    .line 665
    .line 666
    .line 667
    goto :goto_f

    .line 668
    :cond_20
    invoke-virtual {v0, v12}, Landroid/media/MediaFormat;->getFloat(Ljava/lang/String;)F

    .line 669
    .line 670
    .line 671
    move-result v13

    .line 672
    invoke-virtual {v11, v12, v13}, Lcom/google/android/gms/internal/ads/zzja;->zzc(Ljava/lang/String;F)Lcom/google/android/gms/internal/ads/zzja;

    .line 673
    .line 674
    .line 675
    goto :goto_f

    .line 676
    :cond_21
    invoke-virtual {v0, v12}, Landroid/media/MediaFormat;->getLong(Ljava/lang/String;)J

    .line 677
    .line 678
    .line 679
    move-result-wide v13

    .line 680
    invoke-virtual {v11, v12, v13, v14}, Lcom/google/android/gms/internal/ads/zzja;->zzb(Ljava/lang/String;J)Lcom/google/android/gms/internal/ads/zzja;

    .line 681
    .line 682
    .line 683
    goto :goto_f

    .line 684
    :cond_22
    invoke-virtual {v0, v12}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 685
    .line 686
    .line 687
    move-result v13

    .line 688
    invoke-virtual {v11, v12, v13}, Lcom/google/android/gms/internal/ads/zzja;->zza(Ljava/lang/String;I)Lcom/google/android/gms/internal/ads/zzja;

    .line 689
    .line 690
    .line 691
    goto :goto_f

    .line 692
    :cond_23
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzja;->zzg()Lcom/google/android/gms/internal/ads/zzjb;

    .line 693
    .line 694
    .line 695
    move-result-object v6

    .line 696
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzao:Lcom/google/android/gms/internal/ads/zzjb;

    .line 697
    .line 698
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzjb;->equals(Ljava/lang/Object;)Z

    .line 699
    .line 700
    .line 701
    move-result v7

    .line 702
    if-nez v7, :cond_24

    .line 703
    .line 704
    iput-object v6, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzao:Lcom/google/android/gms/internal/ads/zzjb;

    .line 705
    .line 706
    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/ads/zzvw;->zzau(Lcom/google/android/gms/internal/ads/zzjb;)V

    .line 707
    .line 708
    .line 709
    :cond_24
    :goto_10
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzz:Landroid/media/MediaFormat;

    .line 710
    .line 711
    iput-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzA:Z

    .line 712
    .line 713
    goto/16 :goto_e

    .line 714
    .line 715
    :cond_25
    throw v2

    .line 716
    :cond_26
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzK:Z

    .line 717
    .line 718
    if-eqz v0, :cond_28

    .line 719
    .line 720
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzae:Z

    .line 721
    .line 722
    if-nez v0, :cond_27

    .line 723
    .line 724
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzX:I

    .line 725
    .line 726
    if-ne v0, v4, :cond_28

    .line 727
    .line 728
    :cond_27
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbt()V

    .line 729
    .line 730
    .line 731
    :cond_28
    iget-wide v6, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzL:J

    .line 732
    .line 733
    cmp-long v0, v6, v16

    .line 734
    .line 735
    if-eqz v0, :cond_29

    .line 736
    .line 737
    const-wide/16 v11, 0x64

    .line 738
    .line 739
    add-long/2addr v6, v11

    .line 740
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzM()Lcom/google/android/gms/internal/ads/zzdp;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdp;->zza()J

    .line 745
    .line 746
    .line 747
    move-result-wide v11

    .line 748
    cmp-long v0, v6, v11

    .line 749
    .line 750
    if-gez v0, :cond_29

    .line 751
    .line 752
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbt()V

    .line 753
    .line 754
    .line 755
    :cond_29
    :goto_11
    move-object/from16 v19, v2

    .line 756
    .line 757
    move-wide v12, v9

    .line 758
    goto/16 :goto_19

    .line 759
    .line 760
    :cond_2a
    iget-wide v12, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 761
    .line 762
    iget-wide v14, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzam:J

    .line 763
    .line 764
    sub-long/2addr v12, v14

    .line 765
    iput-wide v12, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 766
    .line 767
    iget-boolean v12, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzJ:Z

    .line 768
    .line 769
    if-eqz v12, :cond_2b

    .line 770
    .line 771
    iput-boolean v5, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzJ:Z

    .line 772
    .line 773
    invoke-interface {v6, v11, v5}, Lcom/google/android/gms/internal/ads/zzvm;->zzc(IZ)V

    .line 774
    .line 775
    .line 776
    goto/16 :goto_e

    .line 777
    .line 778
    :cond_2b
    iget v12, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 779
    .line 780
    if-nez v12, :cond_2c

    .line 781
    .line 782
    iget v12, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 783
    .line 784
    and-int/2addr v12, v7

    .line 785
    if-eqz v12, :cond_2c

    .line 786
    .line 787
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbt()V

    .line 788
    .line 789
    .line 790
    goto :goto_11

    .line 791
    :cond_2c
    iput v11, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzP:I

    .line 792
    .line 793
    invoke-interface {v6, v11}, Lcom/google/android/gms/internal/ads/zzvm;->zzj(I)Ljava/nio/ByteBuffer;

    .line 794
    .line 795
    .line 796
    move-result-object v11

    .line 797
    iput-object v11, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzQ:Ljava/nio/ByteBuffer;

    .line 798
    .line 799
    if-eqz v11, :cond_2d

    .line 800
    .line 801
    iget v12, v0, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 802
    .line 803
    invoke-virtual {v11, v12}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 804
    .line 805
    .line 806
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzQ:Ljava/nio/ByteBuffer;

    .line 807
    .line 808
    iget v12, v0, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 809
    .line 810
    iget v13, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 811
    .line 812
    add-int/2addr v12, v13

    .line 813
    invoke-virtual {v11, v12}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 814
    .line 815
    .line 816
    :cond_2d
    iget-wide v11, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 817
    .line 818
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzah:Lcom/google/android/gms/internal/ads/zzvv;

    .line 819
    .line 820
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvv;->zze()Lcom/google/android/gms/internal/ads/zzfi;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    invoke-virtual {v0, v11, v12}, Lcom/google/android/gms/internal/ads/zzfi;->zze(J)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    check-cast v0, Lcom/google/android/gms/internal/ads/zzv;

    .line 829
    .line 830
    if-nez v0, :cond_2e

    .line 831
    .line 832
    iget-boolean v11, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzaj:Z

    .line 833
    .line 834
    if-eqz v11, :cond_2e

    .line 835
    .line 836
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzz:Landroid/media/MediaFormat;

    .line 837
    .line 838
    if-eqz v11, :cond_2e

    .line 839
    .line 840
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzah:Lcom/google/android/gms/internal/ads/zzvv;

    .line 841
    .line 842
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvv;->zze()Lcom/google/android/gms/internal/ads/zzfi;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfi;->zzd()Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    check-cast v0, Lcom/google/android/gms/internal/ads/zzv;

    .line 851
    .line 852
    :cond_2e
    if-eqz v0, :cond_2f

    .line 853
    .line 854
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzp:Lcom/google/android/gms/internal/ads/zzv;

    .line 855
    .line 856
    goto :goto_12

    .line 857
    :cond_2f
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzA:Z

    .line 858
    .line 859
    if-eqz v0, :cond_31

    .line 860
    .line 861
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzp:Lcom/google/android/gms/internal/ads/zzv;

    .line 862
    .line 863
    if-eqz v0, :cond_31

    .line 864
    .line 865
    :goto_12
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzp:Lcom/google/android/gms/internal/ads/zzv;

    .line 866
    .line 867
    if-eqz v0, :cond_30

    .line 868
    .line 869
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzz:Landroid/media/MediaFormat;

    .line 870
    .line 871
    invoke-virtual {v1, v0, v11}, Lcom/google/android/gms/internal/ads/zzvw;->zzaq(Lcom/google/android/gms/internal/ads/zzv;Landroid/media/MediaFormat;)V

    .line 872
    .line 873
    .line 874
    iput-boolean v5, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzA:Z

    .line 875
    .line 876
    iput-boolean v5, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzaj:Z

    .line 877
    .line 878
    goto :goto_13

    .line 879
    :cond_30
    throw v2

    .line 880
    :cond_31
    :goto_13
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzal:Z

    .line 881
    .line 882
    if-nez v0, :cond_32

    .line 883
    .line 884
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 885
    .line 886
    iget-wide v11, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 887
    .line 888
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzH()J

    .line 889
    .line 890
    .line 891
    move-result-wide v13

    .line 892
    cmp-long v0, v11, v13

    .line 893
    .line 894
    if-ltz v0, :cond_32

    .line 895
    .line 896
    move v0, v5

    .line 897
    goto :goto_14

    .line 898
    :cond_32
    move v0, v3

    .line 899
    :goto_14
    iput-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzR:Z

    .line 900
    .line 901
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzah:Lcom/google/android/gms/internal/ads/zzvv;

    .line 902
    .line 903
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvv;->zzh()J

    .line 904
    .line 905
    .line 906
    move-result-wide v11

    .line 907
    cmp-long v0, v11, v16

    .line 908
    .line 909
    if-eqz v0, :cond_33

    .line 910
    .line 911
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzah:Lcom/google/android/gms/internal/ads/zzvv;

    .line 912
    .line 913
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvv;->zzh()J

    .line 914
    .line 915
    .line 916
    move-result-wide v11

    .line 917
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 918
    .line 919
    iget-wide v13, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 920
    .line 921
    cmp-long v0, v11, v13

    .line 922
    .line 923
    if-gtz v0, :cond_33

    .line 924
    .line 925
    move v14, v3

    .line 926
    :goto_15
    move v0, v7

    .line 927
    goto :goto_16

    .line 928
    :cond_33
    move v14, v5

    .line 929
    goto :goto_15

    .line 930
    :goto_16
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzQ:Ljava/nio/ByteBuffer;

    .line 931
    .line 932
    move/from16 v18, v8

    .line 933
    .line 934
    iget v8, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzP:I

    .line 935
    .line 936
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzk:Landroid/media/MediaCodec$BufferInfo;

    .line 937
    .line 938
    move-wide v12, v9

    .line 939
    iget v9, v11, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 940
    .line 941
    move-object v10, v11

    .line 942
    move-wide/from16 v19, v12

    .line 943
    .line 944
    iget-wide v11, v10, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 945
    .line 946
    iget-boolean v13, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzR:Z

    .line 947
    .line 948
    iget-object v15, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzp:Lcom/google/android/gms/internal/ads/zzv;
    :try_end_7
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_4

    .line 949
    .line 950
    if-eqz v15, :cond_5a

    .line 951
    .line 952
    move-object/from16 v21, v10

    .line 953
    .line 954
    const/4 v10, 0x1

    .line 955
    move-wide/from16 v4, p3

    .line 956
    .line 957
    move-wide/from16 v22, v19

    .line 958
    .line 959
    move-object/from16 v24, v21

    .line 960
    .line 961
    move-object/from16 v19, v2

    .line 962
    .line 963
    move-wide/from16 v2, p1

    .line 964
    .line 965
    :try_start_8
    invoke-virtual/range {v1 .. v15}, Lcom/google/android/gms/internal/ads/zzvw;->zzat(JJLcom/google/android/gms/internal/ads/zzvm;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzv;)Z

    .line 966
    .line 967
    .line 968
    move-result v6

    .line 969
    if-eqz v6, :cond_36

    .line 970
    .line 971
    move-object/from16 v10, v24

    .line 972
    .line 973
    iget-wide v2, v10, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 974
    .line 975
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzvw;->zzbb(J)V

    .line 976
    .line 977
    .line 978
    iget v2, v10, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 979
    .line 980
    and-int/2addr v0, v2

    .line 981
    if-eqz v0, :cond_34

    .line 982
    .line 983
    const/4 v2, 0x1

    .line 984
    goto :goto_17

    .line 985
    :cond_34
    const/4 v2, 0x0

    .line 986
    :goto_17
    if-nez v2, :cond_35

    .line 987
    .line 988
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzaa:Z

    .line 989
    .line 990
    if-eqz v0, :cond_35

    .line 991
    .line 992
    if-eqz v14, :cond_35

    .line 993
    .line 994
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzM()Lcom/google/android/gms/internal/ads/zzdp;

    .line 995
    .line 996
    .line 997
    move-result-object v0

    .line 998
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdp;->zza()J

    .line 999
    .line 1000
    .line 1001
    move-result-wide v3

    .line 1002
    iput-wide v3, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzL:J

    .line 1003
    .line 1004
    :cond_35
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbp()V

    .line 1005
    .line 1006
    .line 1007
    if-eqz v2, :cond_37

    .line 1008
    .line 1009
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbt()V

    .line 1010
    .line 1011
    .line 1012
    :cond_36
    move-wide/from16 v12, v22

    .line 1013
    .line 1014
    goto :goto_19

    .line 1015
    :cond_37
    move-wide/from16 v12, v22

    .line 1016
    .line 1017
    :goto_18
    invoke-direct {v1, v12, v13}, Lcom/google/android/gms/internal/ads/zzvw;->zzaD(J)Z

    .line 1018
    .line 1019
    .line 1020
    move-result v0

    .line 1021
    if-nez v0, :cond_38

    .line 1022
    .line 1023
    goto :goto_19

    .line 1024
    :cond_38
    move-wide v9, v12

    .line 1025
    move-object/from16 v2, v19

    .line 1026
    .line 1027
    const/4 v3, 0x1

    .line 1028
    const/4 v4, 0x2

    .line 1029
    const/4 v5, 0x0

    .line 1030
    const/4 v8, -0x5

    .line 1031
    goto/16 :goto_d

    .line 1032
    .line 1033
    :goto_19
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 1034
    .line 1035
    if-eqz v2, :cond_39

    .line 1036
    .line 1037
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzX:I

    .line 1038
    .line 1039
    const/4 v9, 0x2

    .line 1040
    if-eq v0, v9, :cond_39

    .line 1041
    .line 1042
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzae:Z

    .line 1043
    .line 1044
    if-eqz v0, :cond_3a

    .line 1045
    .line 1046
    :cond_39
    const/4 v10, 0x0

    .line 1047
    const/4 v15, 0x1

    .line 1048
    goto/16 :goto_23

    .line 1049
    .line 1050
    :cond_3a
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzO:I

    .line 1051
    .line 1052
    if-gez v0, :cond_3b

    .line 1053
    .line 1054
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzvm;->zze()I

    .line 1055
    .line 1056
    .line 1057
    move-result v0

    .line 1058
    iput v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzO:I

    .line 1059
    .line 1060
    if-ltz v0, :cond_39

    .line 1061
    .line 1062
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzh:Lcom/google/android/gms/internal/ads/zzix;

    .line 1063
    .line 1064
    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/zzvm;->zzh(I)Ljava/nio/ByteBuffer;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v0

    .line 1068
    iput-object v0, v3, Lcom/google/android/gms/internal/ads/zzix;->zzc:Ljava/nio/ByteBuffer;

    .line 1069
    .line 1070
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzix;->zza()V

    .line 1071
    .line 1072
    .line 1073
    :cond_3b
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzX:I
    :try_end_8
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_2

    .line 1074
    .line 1075
    const/4 v15, 0x1

    .line 1076
    if-ne v0, v15, :cond_3d

    .line 1077
    .line 1078
    :try_start_9
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzK:Z

    .line 1079
    .line 1080
    if-nez v0, :cond_3c

    .line 1081
    .line 1082
    iput-boolean v15, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzaa:Z

    .line 1083
    .line 1084
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzO:I

    .line 1085
    .line 1086
    const/4 v4, 0x0

    .line 1087
    const/4 v5, 0x0

    .line 1088
    const-wide/16 v6, 0x0

    .line 1089
    .line 1090
    const/4 v8, 0x4

    .line 1091
    invoke-interface/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/zzvm;->zza(IIIJI)V

    .line 1092
    .line 1093
    .line 1094
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbo()V

    .line 1095
    .line 1096
    .line 1097
    goto :goto_1a

    .line 1098
    :catch_a
    move-exception v0

    .line 1099
    goto/16 :goto_0

    .line 1100
    .line 1101
    :cond_3c
    :goto_1a
    iput v9, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzX:I

    .line 1102
    .line 1103
    const/4 v10, 0x0

    .line 1104
    goto/16 :goto_23

    .line 1105
    .line 1106
    :cond_3d
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzI:Z
    :try_end_9
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_a

    .line 1107
    .line 1108
    if-eqz v0, :cond_3f

    .line 1109
    .line 1110
    const/4 v10, 0x0

    .line 1111
    :try_start_a
    iput-boolean v10, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzI:Z

    .line 1112
    .line 1113
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzh:Lcom/google/android/gms/internal/ads/zzix;

    .line 1114
    .line 1115
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzix;->zzc:Ljava/nio/ByteBuffer;

    .line 1116
    .line 1117
    if-eqz v0, :cond_3e

    .line 1118
    .line 1119
    sget-object v3, Lcom/google/android/gms/internal/ads/zzvw;->zzb:[B

    .line 1120
    .line 1121
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1122
    .line 1123
    .line 1124
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzO:I

    .line 1125
    .line 1126
    const/4 v4, 0x0

    .line 1127
    const/16 v5, 0x26

    .line 1128
    .line 1129
    const-wide/16 v6, 0x0

    .line 1130
    .line 1131
    const/4 v8, 0x0

    .line 1132
    invoke-interface/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/zzvm;->zza(IIIJI)V

    .line 1133
    .line 1134
    .line 1135
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbo()V

    .line 1136
    .line 1137
    .line 1138
    iput-boolean v15, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzZ:Z

    .line 1139
    .line 1140
    goto/16 :goto_22

    .line 1141
    .line 1142
    :catch_b
    move-exception v0

    .line 1143
    goto/16 :goto_26

    .line 1144
    .line 1145
    :catch_c
    move-exception v0

    .line 1146
    goto/16 :goto_2a

    .line 1147
    .line 1148
    :cond_3e
    throw v19

    .line 1149
    :cond_3f
    const/4 v10, 0x0

    .line 1150
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzW:I

    .line 1151
    .line 1152
    if-ne v0, v15, :cond_43

    .line 1153
    .line 1154
    move v3, v10

    .line 1155
    :goto_1b
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzy:Lcom/google/android/gms/internal/ads/zzv;

    .line 1156
    .line 1157
    if-eqz v0, :cond_42

    .line 1158
    .line 1159
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzs:Ljava/util/List;

    .line 1160
    .line 1161
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1162
    .line 1163
    .line 1164
    move-result v0

    .line 1165
    if-ge v3, v0, :cond_41

    .line 1166
    .line 1167
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzy:Lcom/google/android/gms/internal/ads/zzv;

    .line 1168
    .line 1169
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzs:Ljava/util/List;

    .line 1170
    .line 1171
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v0

    .line 1175
    check-cast v0, [B

    .line 1176
    .line 1177
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzh:Lcom/google/android/gms/internal/ads/zzix;

    .line 1178
    .line 1179
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzix;->zzc:Ljava/nio/ByteBuffer;

    .line 1180
    .line 1181
    if-eqz v4, :cond_40

    .line 1182
    .line 1183
    invoke-virtual {v4, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1184
    .line 1185
    .line 1186
    add-int/2addr v3, v15

    .line 1187
    goto :goto_1b

    .line 1188
    :cond_40
    throw v19

    .line 1189
    :cond_41
    iput v9, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzW:I

    .line 1190
    .line 1191
    goto :goto_1c

    .line 1192
    :cond_42
    throw v19

    .line 1193
    :cond_43
    :goto_1c
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzh:Lcom/google/android/gms/internal/ads/zzix;

    .line 1194
    .line 1195
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzix;->zzc:Ljava/nio/ByteBuffer;

    .line 1196
    .line 1197
    if-eqz v0, :cond_58

    .line 1198
    .line 1199
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 1200
    .line 1201
    .line 1202
    move-result v0

    .line 1203
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzI()Lcom/google/android/gms/internal/ads/zzly;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v3
    :try_end_a
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_a .. :try_end_a} :catch_c
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_b

    .line 1207
    :try_start_b
    new-instance v4, Lcom/google/android/gms/internal/ads/zzvt;

    .line 1208
    .line 1209
    invoke-direct {v4, v1, v3}, Lcom/google/android/gms/internal/ads/zzvt;-><init>(Lcom/google/android/gms/internal/ads/zzvw;Lcom/google/android/gms/internal/ads/zzly;)V

    .line 1210
    .line 1211
    .line 1212
    invoke-interface {v2, v4}, Lcom/google/android/gms/internal/ads/zzvm;->zzi(Ljava/lang/Runnable;)V
    :try_end_b
    .catch Lcom/google/android/gms/internal/ads/zziw; {:try_start_b .. :try_end_b} :catch_d
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_b .. :try_end_b} :catch_c
    .catch Ljava/lang/IllegalStateException; {:try_start_b .. :try_end_b} :catch_b

    .line 1213
    .line 1214
    .line 1215
    :try_start_c
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzn:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1216
    .line 1217
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1218
    .line 1219
    .line 1220
    move-result v4

    .line 1221
    const/4 v5, -0x3

    .line 1222
    if-ne v4, v5, :cond_44

    .line 1223
    .line 1224
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzcW()Z

    .line 1225
    .line 1226
    .line 1227
    move-result v0

    .line 1228
    if-eqz v0, :cond_59

    .line 1229
    .line 1230
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbv()Lcom/google/android/gms/internal/ads/zzvv;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v0

    .line 1234
    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzac:J

    .line 1235
    .line 1236
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzvv;->zzi(J)V

    .line 1237
    .line 1238
    .line 1239
    goto/16 :goto_23

    .line 1240
    .line 1241
    :cond_44
    const/4 v11, -0x5

    .line 1242
    if-ne v4, v11, :cond_46

    .line 1243
    .line 1244
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzW:I

    .line 1245
    .line 1246
    if-ne v0, v9, :cond_45

    .line 1247
    .line 1248
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzh:Lcom/google/android/gms/internal/ads/zzix;

    .line 1249
    .line 1250
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzix;->zza()V

    .line 1251
    .line 1252
    .line 1253
    iput v15, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzW:I

    .line 1254
    .line 1255
    :cond_45
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzvw;->zzap(Lcom/google/android/gms/internal/ads/zzly;)Lcom/google/android/gms/internal/ads/zzje;

    .line 1256
    .line 1257
    .line 1258
    goto/16 :goto_22

    .line 1259
    .line 1260
    :cond_46
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzh:Lcom/google/android/gms/internal/ads/zzix;

    .line 1261
    .line 1262
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzis;->zzb()Z

    .line 1263
    .line 1264
    .line 1265
    move-result v4

    .line 1266
    if-eqz v4, :cond_49

    .line 1267
    .line 1268
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbv()Lcom/google/android/gms/internal/ads/zzvv;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v0

    .line 1272
    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzac:J

    .line 1273
    .line 1274
    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/internal/ads/zzvv;->zzi(J)V

    .line 1275
    .line 1276
    .line 1277
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzW:I

    .line 1278
    .line 1279
    if-ne v0, v9, :cond_47

    .line 1280
    .line 1281
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzix;->zza()V

    .line 1282
    .line 1283
    .line 1284
    iput v15, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzW:I

    .line 1285
    .line 1286
    :cond_47
    iput-boolean v15, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzae:Z

    .line 1287
    .line 1288
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzZ:Z

    .line 1289
    .line 1290
    if-nez v0, :cond_48

    .line 1291
    .line 1292
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbt()V

    .line 1293
    .line 1294
    .line 1295
    goto/16 :goto_23

    .line 1296
    .line 1297
    :cond_48
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzK:Z

    .line 1298
    .line 1299
    if-nez v0, :cond_59

    .line 1300
    .line 1301
    iput-boolean v15, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzaa:Z

    .line 1302
    .line 1303
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzO:I

    .line 1304
    .line 1305
    const/4 v4, 0x0

    .line 1306
    const/4 v5, 0x0

    .line 1307
    const-wide/16 v6, 0x0

    .line 1308
    .line 1309
    const/4 v8, 0x4

    .line 1310
    invoke-interface/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/zzvm;->zza(IIIJI)V

    .line 1311
    .line 1312
    .line 1313
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbo()V

    .line 1314
    .line 1315
    .line 1316
    goto/16 :goto_23

    .line 1317
    .line 1318
    :cond_49
    iget-boolean v4, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzZ:Z

    .line 1319
    .line 1320
    if-nez v4, :cond_4a

    .line 1321
    .line 1322
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzis;->zzc()Z

    .line 1323
    .line 1324
    .line 1325
    move-result v4

    .line 1326
    if-nez v4, :cond_4a

    .line 1327
    .line 1328
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzix;->zza()V

    .line 1329
    .line 1330
    .line 1331
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzW:I

    .line 1332
    .line 1333
    if-ne v0, v9, :cond_57

    .line 1334
    .line 1335
    iput v15, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzW:I

    .line 1336
    .line 1337
    goto/16 :goto_22

    .line 1338
    .line 1339
    :cond_4a
    iget-wide v4, v3, Lcom/google/android/gms/internal/ads/zzix;->zzd:J

    .line 1340
    .line 1341
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzvw;->zzaZ(Lcom/google/android/gms/internal/ads/zzix;)Z

    .line 1342
    .line 1343
    .line 1344
    move-result v6

    .line 1345
    if-nez v6, :cond_57

    .line 1346
    .line 1347
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzix;->zzk()Z

    .line 1348
    .line 1349
    .line 1350
    move-result v6

    .line 1351
    if-eqz v6, :cond_4b

    .line 1352
    .line 1353
    iget-object v7, v3, Lcom/google/android/gms/internal/ads/zzix;->zzb:Lcom/google/android/gms/internal/ads/zziu;

    .line 1354
    .line 1355
    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/ads/zziu;->zzc(I)V

    .line 1356
    .line 1357
    .line 1358
    :cond_4b
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzag:Z

    .line 1359
    .line 1360
    if-eqz v0, :cond_4d

    .line 1361
    .line 1362
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbv()Lcom/google/android/gms/internal/ads/zzvv;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v0

    .line 1366
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvv;->zze()Lcom/google/android/gms/internal/ads/zzfi;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v7

    .line 1370
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzo:Lcom/google/android/gms/internal/ads/zzv;

    .line 1371
    .line 1372
    if-eqz v8, :cond_4c

    .line 1373
    .line 1374
    invoke-virtual {v7, v4, v5, v8}, Lcom/google/android/gms/internal/ads/zzfi;->zza(JLjava/lang/Object;)V

    .line 1375
    .line 1376
    .line 1377
    invoke-virtual {v0, v15}, Lcom/google/android/gms/internal/ads/zzvv;->zzg(Z)V

    .line 1378
    .line 1379
    .line 1380
    iput-boolean v10, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzag:Z

    .line 1381
    .line 1382
    goto :goto_1d

    .line 1383
    :cond_4c
    throw v19

    .line 1384
    :cond_4d
    :goto_1d
    iget-wide v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzac:J

    .line 1385
    .line 1386
    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 1387
    .line 1388
    .line 1389
    move-result-wide v7

    .line 1390
    iput-wide v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzac:J

    .line 1391
    .line 1392
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzP()J

    .line 1393
    .line 1394
    .line 1395
    move-result-wide v7

    .line 1396
    cmp-long v0, v7, v16

    .line 1397
    .line 1398
    if-eqz v0, :cond_4e

    .line 1399
    .line 1400
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbv()Lcom/google/android/gms/internal/ads/zzvv;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v0

    .line 1404
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvv;->zzd()J

    .line 1405
    .line 1406
    .line 1407
    move-result-wide v7

    .line 1408
    sub-long v7, v4, v7

    .line 1409
    .line 1410
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzP()J

    .line 1411
    .line 1412
    .line 1413
    move-result-wide v20

    .line 1414
    cmp-long v0, v7, v20

    .line 1415
    .line 1416
    if-gez v0, :cond_4f

    .line 1417
    .line 1418
    :cond_4e
    iget-wide v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzad:J

    .line 1419
    .line 1420
    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 1421
    .line 1422
    .line 1423
    move-result-wide v7

    .line 1424
    iput-wide v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzad:J

    .line 1425
    .line 1426
    :cond_4f
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zziz;->zzcW()Z

    .line 1427
    .line 1428
    .line 1429
    move-result v0

    .line 1430
    if-nez v0, :cond_50

    .line 1431
    .line 1432
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzis;->zzd()Z

    .line 1433
    .line 1434
    .line 1435
    move-result v0

    .line 1436
    if-eqz v0, :cond_51

    .line 1437
    .line 1438
    :cond_50
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbv()Lcom/google/android/gms/internal/ads/zzvv;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v0

    .line 1442
    iget-wide v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzac:J

    .line 1443
    .line 1444
    invoke-virtual {v0, v7, v8}, Lcom/google/android/gms/internal/ads/zzvv;->zzi(J)V

    .line 1445
    .line 1446
    .line 1447
    :cond_51
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzix;->zzl()V

    .line 1448
    .line 1449
    .line 1450
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzis;->zze()Z

    .line 1451
    .line 1452
    .line 1453
    move-result v0

    .line 1454
    if-eqz v0, :cond_52

    .line 1455
    .line 1456
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzvw;->zzax(Lcom/google/android/gms/internal/ads/zzix;)V

    .line 1457
    .line 1458
    .line 1459
    :cond_52
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzal:Z

    .line 1460
    .line 1461
    if-eqz v0, :cond_54

    .line 1462
    .line 1463
    iget-wide v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzac:J

    .line 1464
    .line 1465
    cmp-long v0, v4, v7

    .line 1466
    .line 1467
    if-gtz v0, :cond_53

    .line 1468
    .line 1469
    move-wide/from16 v22, v12

    .line 1470
    .line 1471
    iget-wide v11, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzam:J

    .line 1472
    .line 1473
    sub-long/2addr v7, v4

    .line 1474
    const-wide/16 v13, 0x1

    .line 1475
    .line 1476
    add-long/2addr v7, v13

    .line 1477
    add-long/2addr v7, v11

    .line 1478
    iput-wide v7, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzam:J

    .line 1479
    .line 1480
    goto :goto_1e

    .line 1481
    :cond_53
    move-wide/from16 v22, v12

    .line 1482
    .line 1483
    :goto_1e
    iput-wide v4, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzac:J

    .line 1484
    .line 1485
    iput-wide v4, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzad:J

    .line 1486
    .line 1487
    iput-boolean v10, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzal:Z

    .line 1488
    .line 1489
    goto :goto_1f

    .line 1490
    :cond_54
    move-wide/from16 v22, v12

    .line 1491
    .line 1492
    :goto_1f
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzvw;->zzaX(Lcom/google/android/gms/internal/ads/zzix;)V

    .line 1493
    .line 1494
    .line 1495
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzvw;->zzaY(Lcom/google/android/gms/internal/ads/zzix;)I

    .line 1496
    .line 1497
    .line 1498
    move-result v8

    .line 1499
    iget-wide v11, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzam:J

    .line 1500
    .line 1501
    add-long/2addr v4, v11

    .line 1502
    if-eqz v6, :cond_55

    .line 1503
    .line 1504
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzO:I

    .line 1505
    .line 1506
    move-wide v6, v4

    .line 1507
    iget-object v5, v3, Lcom/google/android/gms/internal/ads/zzix;->zzb:Lcom/google/android/gms/internal/ads/zziu;

    .line 1508
    .line 1509
    const/4 v4, 0x0

    .line 1510
    move v3, v0

    .line 1511
    invoke-interface/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/zzvm;->zzb(IILcom/google/android/gms/internal/ads/zziu;JI)V

    .line 1512
    .line 1513
    .line 1514
    goto :goto_20

    .line 1515
    :cond_55
    move-wide v6, v4

    .line 1516
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzO:I

    .line 1517
    .line 1518
    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzix;->zzc:Ljava/nio/ByteBuffer;

    .line 1519
    .line 1520
    if-eqz v3, :cond_56

    .line 1521
    .line 1522
    invoke-virtual {v3}, Ljava/nio/Buffer;->limit()I

    .line 1523
    .line 1524
    .line 1525
    move-result v5

    .line 1526
    const/4 v4, 0x0

    .line 1527
    move v3, v0

    .line 1528
    invoke-interface/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/zzvm;->zza(IIIJI)V

    .line 1529
    .line 1530
    .line 1531
    :goto_20
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzbo()V

    .line 1532
    .line 1533
    .line 1534
    iput-boolean v15, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzZ:Z

    .line 1535
    .line 1536
    iput v10, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzW:I

    .line 1537
    .line 1538
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zza:Lcom/google/android/gms/internal/ads/zzjd;

    .line 1539
    .line 1540
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzjd;->zzc:I

    .line 1541
    .line 1542
    add-int/2addr v2, v15

    .line 1543
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzjd;->zzc:I

    .line 1544
    .line 1545
    :goto_21
    move-wide/from16 v12, v22

    .line 1546
    .line 1547
    goto :goto_22

    .line 1548
    :cond_56
    throw v19

    .line 1549
    :catch_d
    move-exception v0

    .line 1550
    move-wide/from16 v22, v12

    .line 1551
    .line 1552
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzvw;->zzao(Ljava/lang/Exception;)V

    .line 1553
    .line 1554
    .line 1555
    invoke-direct {v1, v10}, Lcom/google/android/gms/internal/ads/zzvw;->zzaC(I)Z

    .line 1556
    .line 1557
    .line 1558
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzaA()V

    .line 1559
    .line 1560
    .line 1561
    goto :goto_21

    .line 1562
    :cond_57
    :goto_22
    invoke-direct {v1, v12, v13}, Lcom/google/android/gms/internal/ads/zzvw;->zzaD(J)Z

    .line 1563
    .line 1564
    .line 1565
    move-result v0

    .line 1566
    if-eqz v0, :cond_59

    .line 1567
    .line 1568
    goto/16 :goto_19

    .line 1569
    .line 1570
    :cond_58
    throw v19

    .line 1571
    :cond_59
    :goto_23
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1572
    .line 1573
    .line 1574
    goto :goto_24

    .line 1575
    :cond_5a
    move-object/from16 v19, v2

    .line 1576
    .line 1577
    move v15, v3

    .line 1578
    move v10, v5

    .line 1579
    throw v19

    .line 1580
    :cond_5b
    move-object/from16 v19, v2

    .line 1581
    .line 1582
    move v15, v3

    .line 1583
    move v10, v5

    .line 1584
    throw v19

    .line 1585
    :cond_5c
    move v15, v3

    .line 1586
    move v10, v5

    .line 1587
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zza:Lcom/google/android/gms/internal/ads/zzjd;

    .line 1588
    .line 1589
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzjd;->zzd:I

    .line 1590
    .line 1591
    invoke-virtual/range {p0 .. p2}, Lcom/google/android/gms/internal/ads/zziz;->zzS(J)I

    .line 1592
    .line 1593
    .line 1594
    move-result v3

    .line 1595
    add-int/2addr v2, v3

    .line 1596
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzjd;->zzd:I

    .line 1597
    .line 1598
    invoke-direct {v1, v15}, Lcom/google/android/gms/internal/ads/zzvw;->zzaC(I)Z

    .line 1599
    .line 1600
    .line 1601
    :goto_24
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzvw;->zza:Lcom/google/android/gms/internal/ads/zzjd;

    .line 1602
    .line 1603
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzjd;->zza()V
    :try_end_c
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_c .. :try_end_c} :catch_c
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_c} :catch_b

    .line 1604
    .line 1605
    .line 1606
    :goto_25
    return-void

    .line 1607
    :goto_26
    instance-of v2, v0, Landroid/media/MediaCodec$CodecException;

    .line 1608
    .line 1609
    if-eqz v2, :cond_5d

    .line 1610
    .line 1611
    goto :goto_27

    .line 1612
    :cond_5d
    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v3

    .line 1616
    array-length v4, v3

    .line 1617
    if-lez v4, :cond_61

    .line 1618
    .line 1619
    aget-object v3, v3, v10

    .line 1620
    .line 1621
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v3

    .line 1625
    const-string v4, "android.media.MediaCodec"

    .line 1626
    .line 1627
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1628
    .line 1629
    .line 1630
    move-result v3

    .line 1631
    if-eqz v3, :cond_61

    .line 1632
    .line 1633
    :goto_27
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzvw;->zzao(Ljava/lang/Exception;)V

    .line 1634
    .line 1635
    .line 1636
    if-eqz v2, :cond_5e

    .line 1637
    .line 1638
    move-object v2, v0

    .line 1639
    check-cast v2, Landroid/media/MediaCodec$CodecException;

    .line 1640
    .line 1641
    invoke-virtual {v2}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    .line 1642
    .line 1643
    .line 1644
    move-result v2

    .line 1645
    if-eqz v2, :cond_5e

    .line 1646
    .line 1647
    move v2, v15

    .line 1648
    goto :goto_28

    .line 1649
    :cond_5e
    move v2, v10

    .line 1650
    :goto_28
    if-eqz v2, :cond_5f

    .line 1651
    .line 1652
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzvw;->zzaO()V

    .line 1653
    .line 1654
    .line 1655
    :cond_5f
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzE:Lcom/google/android/gms/internal/ads/zzvp;

    .line 1656
    .line 1657
    invoke-virtual {v1, v0, v3}, Lcom/google/android/gms/internal/ads/zzvw;->zzaV(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzvp;)Lcom/google/android/gms/internal/ads/zzvo;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v0

    .line 1661
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzvo;->zza:I

    .line 1662
    .line 1663
    const/16 v4, 0x44d

    .line 1664
    .line 1665
    if-ne v3, v4, :cond_60

    .line 1666
    .line 1667
    const/16 v3, 0xfa6

    .line 1668
    .line 1669
    goto :goto_29

    .line 1670
    :cond_60
    const/16 v3, 0xfa3

    .line 1671
    .line 1672
    :goto_29
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzo:Lcom/google/android/gms/internal/ads/zzv;

    .line 1673
    .line 1674
    invoke-virtual {v1, v0, v4, v2, v3}, Lcom/google/android/gms/internal/ads/zziz;->zzQ(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzv;ZI)Lcom/google/android/gms/internal/ads/zzjm;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v0

    .line 1678
    throw v0

    .line 1679
    :cond_61
    throw v0

    .line 1680
    :goto_2a
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzvw;->zzo:Lcom/google/android/gms/internal/ads/zzv;

    .line 1681
    .line 1682
    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 1683
    .line 1684
    .line 1685
    move-result v3

    .line 1686
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzfm;->zzJ(I)I

    .line 1687
    .line 1688
    .line 1689
    move-result v3

    .line 1690
    invoke-virtual {v1, v0, v2, v10, v3}, Lcom/google/android/gms/internal/ads/zziz;->zzQ(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzv;ZI)Lcom/google/android/gms/internal/ads/zzjm;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v0

    .line 1694
    throw v0
.end method

.method public zzab()Z
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public zzac()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzaf:Z

    return v0
.end method

.method public final zzae(Lcom/google/android/gms/internal/ads/zzv;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zze:Lcom/google/android/gms/internal/ads/zzvy;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/ads/zzvw;->zzaf(Lcom/google/android/gms/internal/ads/zzvy;Lcom/google/android/gms/internal/ads/zzv;)I

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzwa; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return p1

    .line 8
    :catch_0
    move-exception v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0xfa2

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/zziz;->zzQ(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzv;ZI)Lcom/google/android/gms/internal/ads/zzjm;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    throw p1
.end method

.method public abstract zzaf(Lcom/google/android/gms/internal/ads/zzvy;Lcom/google/android/gms/internal/ads/zzv;)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzwa;
        }
    .end annotation
.end method

.method public abstract zzag(Lcom/google/android/gms/internal/ads/zzvy;Lcom/google/android/gms/internal/ads/zzv;Z)Ljava/util/List;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzwa;
        }
    .end annotation
.end method

.method public zzah(Lcom/google/android/gms/internal/ads/zzv;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public abstract zzai(Lcom/google/android/gms/internal/ads/zzvp;Lcom/google/android/gms/internal/ads/zzv;Landroid/media/MediaCrypto;F)Lcom/google/android/gms/internal/ads/zzvj;
.end method

.method public zzaj(Lcom/google/android/gms/internal/ads/zzvp;Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzv;Z)Lcom/google/android/gms/internal/ads/zzje;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public zzak(JJZ)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/H;->a(Lcom/google/android/gms/internal/ads/zznc;JJ)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    return-wide p1
.end method

.method public zzal(FLcom/google/android/gms/internal/ads/zzv;[Lcom/google/android/gms/internal/ads/zzv;)F
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public zzam(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzvj;JJ)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public zzan(Ljava/lang/String;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public zzao(Ljava/lang/Exception;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public zzap(Lcom/google/android/gms/internal/ads/zzly;)Lcom/google/android/gms/internal/ads/zzje;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzag:Z

    .line 3
    .line 4
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzly;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_17

    .line 13
    .line 14
    const-string v4, "video/av01"

    .line 15
    .line 16
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    const/16 v6, 0x10

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    if-nez v5, :cond_5

    .line 24
    .line 25
    const-string v5, "video/x-vnd.on2.vp9"

    .line 26
    .line 27
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-nez v5, :cond_5

    .line 32
    .line 33
    const-string v5, "video/dolby-vision"

    .line 34
    .line 35
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    if-eqz v8, :cond_6

    .line 40
    .line 41
    sget v8, Lcom/google/android/gms/internal/ads/zzdr;->zza:I

    .line 42
    .line 43
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    :goto_0
    move-object v2, v7

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzdr;->zze(Lcom/google/android/gms/internal/ads/zzv;)Landroid/util/Pair;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-nez v2, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eq v2, v6, :cond_4

    .line 67
    .line 68
    const/16 v5, 0x20

    .line 69
    .line 70
    if-eq v2, v5, :cond_4

    .line 71
    .line 72
    const/16 v5, 0x100

    .line 73
    .line 74
    if-eq v2, v5, :cond_4

    .line 75
    .line 76
    const/16 v5, 0x200

    .line 77
    .line 78
    if-eq v2, v5, :cond_3

    .line 79
    .line 80
    const/16 v5, 0x400

    .line 81
    .line 82
    if-eq v2, v5, :cond_2

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    move-object v2, v4

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    const-string v2, "video/avc"

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    const-string v2, "video/hevc"

    .line 91
    .line 92
    :goto_1
    invoke-static {v2, v4}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_6

    .line 97
    .line 98
    :cond_5
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzv;->zzs:Ljava/util/List;

    .line 99
    .line 100
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-nez v2, :cond_6

    .line 105
    .line 106
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/zzt;->zzr(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzt;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    :cond_6
    move-object v11, v1

    .line 118
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzly;->zza:Lcom/google/android/gms/internal/ads/zzuj;

    .line 119
    .line 120
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzr:Lcom/google/android/gms/internal/ads/zzuj;

    .line 121
    .line 122
    iput-object v11, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzo:Lcom/google/android/gms/internal/ads/zzv;

    .line 123
    .line 124
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzS:Z

    .line 125
    .line 126
    if-eqz p1, :cond_7

    .line 127
    .line 128
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzU:Z

    .line 129
    .line 130
    return-object v7

    .line 131
    :cond_7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 132
    .line 133
    if-nez p1, :cond_8

    .line 134
    .line 135
    iput-object v7, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzC:Ljava/util/ArrayDeque;

    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaG()V

    .line 138
    .line 139
    .line 140
    return-object v7

    .line 141
    :cond_8
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzE:Lcom/google/android/gms/internal/ads/zzvp;

    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iget-object v10, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzy:Lcom/google/android/gms/internal/ads/zzv;

    .line 147
    .line 148
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzq:Lcom/google/android/gms/internal/ads/zzuj;

    .line 152
    .line 153
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzr:Lcom/google/android/gms/internal/ads/zzuj;

    .line 154
    .line 155
    if-ne v2, v4, :cond_16

    .line 156
    .line 157
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbv()Lcom/google/android/gms/internal/ads/zzvv;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzvv;->zzf()Z

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    invoke-virtual {p0, v1, v10, v11, v5}, Lcom/google/android/gms/internal/ads/zzvw;->zzaj(Lcom/google/android/gms/internal/ads/zzvp;Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzv;Z)Lcom/google/android/gms/internal/ads/zzje;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    iget v7, v5, Lcom/google/android/gms/internal/ads/zzje;->zzd:I

    .line 170
    .line 171
    const/4 v8, 0x3

    .line 172
    if-eqz v7, :cond_13

    .line 173
    .line 174
    const/4 v9, 0x2

    .line 175
    if-eq v7, v0, :cond_f

    .line 176
    .line 177
    if-eq v7, v9, :cond_b

    .line 178
    .line 179
    invoke-direct {p0, v11}, Lcom/google/android/gms/internal/ads/zzvw;->zzbq(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-nez v0, :cond_9

    .line 184
    .line 185
    :goto_2
    move v13, v6

    .line 186
    goto/16 :goto_6

    .line 187
    .line 188
    :cond_9
    iput-object v11, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzy:Lcom/google/android/gms/internal/ads/zzv;

    .line 189
    .line 190
    if-eq v4, v2, :cond_a

    .line 191
    .line 192
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbr()Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-nez v0, :cond_a

    .line 197
    .line 198
    :goto_3
    move v13, v9

    .line 199
    goto :goto_6

    .line 200
    :cond_a
    :goto_4
    move v13, v3

    .line 201
    goto :goto_6

    .line 202
    :cond_b
    invoke-direct {p0, v11}, Lcom/google/android/gms/internal/ads/zzvw;->zzbq(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 203
    .line 204
    .line 205
    move-result v12

    .line 206
    if-nez v12, :cond_c

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_c
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzV:Z

    .line 210
    .line 211
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzW:I

    .line 212
    .line 213
    iget v6, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzF:I

    .line 214
    .line 215
    if-eq v6, v9, :cond_e

    .line 216
    .line 217
    if-ne v6, v0, :cond_d

    .line 218
    .line 219
    iget v6, v11, Lcom/google/android/gms/internal/ads/zzv;->zzw:I

    .line 220
    .line 221
    iget v12, v10, Lcom/google/android/gms/internal/ads/zzv;->zzw:I

    .line 222
    .line 223
    if-ne v6, v12, :cond_d

    .line 224
    .line 225
    iget v6, v11, Lcom/google/android/gms/internal/ads/zzv;->zzx:I

    .line 226
    .line 227
    iget v12, v10, Lcom/google/android/gms/internal/ads/zzv;->zzx:I

    .line 228
    .line 229
    if-ne v6, v12, :cond_d

    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_d
    move v0, v3

    .line 233
    :cond_e
    :goto_5
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzI:Z

    .line 234
    .line 235
    iput-object v11, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzy:Lcom/google/android/gms/internal/ads/zzv;

    .line 236
    .line 237
    if-eq v4, v2, :cond_a

    .line 238
    .line 239
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbr()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-nez v0, :cond_a

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_f
    invoke-direct {p0, v11}, Lcom/google/android/gms/internal/ads/zzvw;->zzbq(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 247
    .line 248
    .line 249
    move-result v12

    .line 250
    if-nez v12, :cond_10

    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_10
    iput-object v11, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzy:Lcom/google/android/gms/internal/ads/zzv;

    .line 254
    .line 255
    if-eq v4, v2, :cond_11

    .line 256
    .line 257
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbr()Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-nez v0, :cond_a

    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_11
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzZ:Z

    .line 265
    .line 266
    if-eqz v2, :cond_a

    .line 267
    .line 268
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzX:I

    .line 269
    .line 270
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaQ()Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    if-eqz v2, :cond_12

    .line 275
    .line 276
    iput v8, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzY:I

    .line 277
    .line 278
    goto :goto_3

    .line 279
    :cond_12
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzY:I

    .line 280
    .line 281
    goto :goto_4

    .line 282
    :cond_13
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbs()V

    .line 283
    .line 284
    .line 285
    goto :goto_4

    .line 286
    :goto_6
    if-eqz v7, :cond_15

    .line 287
    .line 288
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzx:Lcom/google/android/gms/internal/ads/zzvm;

    .line 289
    .line 290
    if-ne v0, p1, :cond_14

    .line 291
    .line 292
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzY:I

    .line 293
    .line 294
    if-ne p1, v8, :cond_15

    .line 295
    .line 296
    :cond_14
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzvp;->zza:Ljava/lang/String;

    .line 297
    .line 298
    new-instance v8, Lcom/google/android/gms/internal/ads/zzje;

    .line 299
    .line 300
    const/4 v12, 0x0

    .line 301
    invoke-direct/range {v8 .. v13}, Lcom/google/android/gms/internal/ads/zzje;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzv;II)V

    .line 302
    .line 303
    .line 304
    return-object v8

    .line 305
    :cond_15
    return-object v5

    .line 306
    :cond_16
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbs()V

    .line 307
    .line 308
    .line 309
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzvp;->zza:Ljava/lang/String;

    .line 310
    .line 311
    new-instance v8, Lcom/google/android/gms/internal/ads/zzje;

    .line 312
    .line 313
    const/4 v12, 0x0

    .line 314
    const/16 v13, 0x80

    .line 315
    .line 316
    invoke-direct/range {v8 .. v13}, Lcom/google/android/gms/internal/ads/zzje;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzv;II)V

    .line 317
    .line 318
    .line 319
    return-object v8

    .line 320
    :cond_17
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 321
    .line 322
    const-string v0, "Sample MIME type is null."

    .line 323
    .line 324
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    const/16 v0, 0xfa5

    .line 328
    .line 329
    invoke-virtual {p0, p1, v1, v3, v0}, Lcom/google/android/gms/internal/ads/zziz;->zzQ(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/zzv;ZI)Lcom/google/android/gms/internal/ads/zzjm;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    throw p1
.end method

.method public zzaq(Lcom/google/android/gms/internal/ads/zzv;Landroid/media/MediaFormat;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    const/4 p1, 0x0

    throw p1
.end method

.method public zzas()V
    .locals 0

    return-void
.end method

.method public abstract zzat(JJLcom/google/android/gms/internal/ads/zzvm;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/zzv;)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation
.end method

.method public abstract zzau(Lcom/google/android/gms/internal/ads/zzjb;)V
.end method

.method public zzav()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    const/4 v0, 0x0

    throw v0
.end method

.method public zzaw(J)V
    .locals 0

    return-void
.end method

.method public zzax(Lcom/google/android/gms/internal/ads/zzix;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    const/4 p1, 0x0

    throw p1
.end method

.method public final zzba()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzai:J

    return-wide v0
.end method

.method public zzbb(J)V
    .locals 3

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzai:J

    .line 2
    .line 3
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzai:J

    .line 8
    .line 9
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzl:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/google/android/gms/internal/ads/zzvv;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzvv;->zzb()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    cmp-long v1, p1, v1

    .line 28
    .line 29
    if-ltz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lcom/google/android/gms/internal/ads/zzvv;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbu(Lcom/google/android/gms/internal/ads/zzvv;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzas()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return-void
.end method

.method public final zzbc()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzo:Lcom/google/android/gms/internal/ads/zzv;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziz;->zzT()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzaE()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzN:J

    .line 20
    .line 21
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmp-long v0, v3, v5

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziz;->zzM()Lcom/google/android/gms/internal/ads/zzdp;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdp;->zzb()J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzN:J

    .line 39
    .line 40
    cmp-long v0, v3, v5

    .line 41
    .line 42
    if-ltz v0, :cond_0

    .line 43
    .line 44
    return v1

    .line 45
    :cond_0
    return v2

    .line 46
    :cond_1
    return v1

    .line 47
    :cond_2
    return v2

    .line 48
    :cond_3
    return v1
.end method

.method public final zzbd()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzv:F

    return v0
.end method

.method public final zzbe()Lcom/google/android/gms/internal/ads/zznb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzs:Lcom/google/android/gms/internal/ads/zznb;

    return-object v0
.end method

.method public final zzbf()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzy:Lcom/google/android/gms/internal/ads/zzv;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbq(Lcom/google/android/gms/internal/ads/zzv;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final zzbg()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzah:Lcom/google/android/gms/internal/ads/zzvv;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvv;->zzh()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final zzbh()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzac:J

    return-wide v0
.end method

.method public final zzbi()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzah:Lcom/google/android/gms/internal/ads/zzvv;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvv;->zzd()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final zzbj()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzah:Lcom/google/android/gms/internal/ads/zzvv;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzvv;->zzc()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final zzbk(Landroid/media/MediaFormat;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzan:Lcom/google/android/gms/internal/ads/zzjb;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzjb;->zzb(Landroid/media/MediaFormat;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final synthetic zzbm(Lcom/google/android/gms/internal/ads/zzly;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzh:Lcom/google/android/gms/internal/ads/zzix;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzn:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {p0, p1, v0, v2}, Lcom/google/android/gms/internal/ads/zziz;->zzR(Lcom/google/android/gms/internal/ads/zzly;Lcom/google/android/gms/internal/ads/zzix;I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final synthetic zzbn()Lcom/google/android/gms/internal/ads/zznb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzs:Lcom/google/android/gms/internal/ads/zznb;

    return-object v0
.end method

.method public final zzu()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public zzx(ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p2, Lcom/google/android/gms/internal/ads/zznb;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzs:Lcom/google/android/gms/internal/ads/zznb;

    .line 12
    .line 13
    return-void
.end method

.method public zzy(ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    new-instance p1, Lcom/google/android/gms/internal/ads/zzjd;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzjd;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zza:Lcom/google/android/gms/internal/ads/zzjd;

    return-void
.end method

.method public zzz([Lcom/google/android/gms/internal/ads/zzv;JJLcom/google/android/gms/internal/ads/zzxl;)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zziz;->zzP()J

    .line 2
    .line 3
    .line 4
    move-result-wide v7

    .line 5
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzah:Lcom/google/android/gms/internal/ads/zzvv;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzvv;->zzd()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long p1, v0, v11

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    new-instance v0, Lcom/google/android/gms/internal/ads/zzvv;

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    move-wide v3, p2

    .line 30
    move-wide/from16 v5, p4

    .line 31
    .line 32
    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/zzvv;-><init>(JJJJZ[B)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbu(Lcom/google/android/gms/internal/ads/zzvv;)V

    .line 36
    .line 37
    .line 38
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzak:Z

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzas()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzl:Ljava/util/ArrayDeque;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzac:J

    .line 55
    .line 56
    cmp-long v2, v0, v11

    .line 57
    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzai:J

    .line 61
    .line 62
    cmp-long v4, v2, v11

    .line 63
    .line 64
    if-eqz v4, :cond_3

    .line 65
    .line 66
    cmp-long v0, v2, v0

    .line 67
    .line 68
    if-ltz v0, :cond_3

    .line 69
    .line 70
    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzvv;

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    const/4 v10, 0x0

    .line 74
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    move-wide v3, p2

    .line 80
    move-wide/from16 v5, p4

    .line 81
    .line 82
    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/zzvv;-><init>(JJJJZ[B)V

    .line 83
    .line 84
    .line 85
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzvw;->zzbu(Lcom/google/android/gms/internal/ads/zzvv;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzah:Lcom/google/android/gms/internal/ads/zzvv;

    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzvv;->zzd()J

    .line 91
    .line 92
    .line 93
    move-result-wide v0

    .line 94
    cmp-long p1, v0, v11

    .line 95
    .line 96
    if-eqz p1, :cond_2

    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzvw;->zzas()V

    .line 99
    .line 100
    .line 101
    :cond_2
    return-void

    .line 102
    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/ads/zzvv;

    .line 103
    .line 104
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzvw;->zzac:J

    .line 105
    .line 106
    const/4 v9, 0x0

    .line 107
    const/4 v10, 0x0

    .line 108
    move-wide v3, p2

    .line 109
    move-wide/from16 v5, p4

    .line 110
    .line 111
    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/zzvv;-><init>(JJJJZ[B)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    return-void
.end method
