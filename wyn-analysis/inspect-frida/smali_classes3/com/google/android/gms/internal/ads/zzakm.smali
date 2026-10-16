.class public final Lcom/google/android/gms/internal/ads/zzakm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaga;


# static fields
.field public static final synthetic zza:I

.field private static final zzb:[B

.field private static final zzc:[B

.field private static final zzd:[B

.field private static final zze:[B

.field private static final zzf:Ljava/util/UUID;

.field private static final zzg:Ljava/util/Map;


# instance fields
.field private zzA:J

.field private zzB:J

.field private zzC:J

.field private zzD:Z

.field private zzE:Z

.field private zzF:Lcom/google/android/gms/internal/ads/zzakg;

.field private zzG:Lcom/google/android/gms/internal/ads/zzakl;

.field private zzH:Z

.field private zzI:I

.field private zzJ:J

.field private final zzK:Landroid/util/SparseArray;

.field private zzL:Z

.field private zzM:J

.field private zzN:I

.field private zzO:J

.field private zzP:J

.field private zzQ:I

.field private zzR:Z

.field private zzS:J

.field private zzT:J

.field private zzU:J

.field private zzV:Z

.field private zzW:I

.field private zzX:J

.field private zzY:J

.field private zzZ:I

.field private zzaa:I

.field private zzab:[I

.field private zzac:I

.field private zzad:I

.field private zzae:I

.field private zzaf:I

.field private zzag:Z

.field private zzah:J

.field private zzai:I

.field private zzaj:I

.field private zzak:I

.field private zzal:Z

.field private zzam:Z

.field private zzan:Z

.field private zzao:I

.field private zzap:B

.field private zzaq:Z

.field private zzar:Lcom/google/android/gms/internal/ads/zzagd;

.field private final zzas:Lcom/google/android/gms/internal/ads/zzake;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzako;

.field private final zzi:Landroid/util/SparseArray;

.field private final zzj:Landroid/util/LongSparseArray;

.field private final zzk:Z

.field private final zzl:Z

.field private final zzm:Lcom/google/android/gms/internal/ads/zzanq;

.field private final zzn:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzo:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzp:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzq:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzr:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzs:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzt:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzu:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzv:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzw:Lcom/google/android/gms/internal/ads/zzeu;

.field private zzx:Ljava/nio/ByteBuffer;

.field private zzy:J

.field private zzz:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, Lcom/google/android/gms/internal/ads/zzakm;->zzb:[B

    .line 9
    .line 10
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 11
    .line 12
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    const-string v2, "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text"

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sput-object v1, Lcom/google/android/gms/internal/ads/zzakm;->zzc:[B

    .line 21
    .line 22
    new-array v0, v0, [B

    .line 23
    .line 24
    fill-array-data v0, :array_1

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/google/android/gms/internal/ads/zzakm;->zzd:[B

    .line 28
    .line 29
    const/16 v0, 0x26

    .line 30
    .line 31
    new-array v0, v0, [B

    .line 32
    .line 33
    fill-array-data v0, :array_2

    .line 34
    .line 35
    .line 36
    sput-object v0, Lcom/google/android/gms/internal/ads/zzakm;->zze:[B

    .line 37
    .line 38
    new-instance v0, Ljava/util/UUID;

    .line 39
    .line 40
    const-wide v1, 0x100000000001000L

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    const-wide v3, -0x7fffff55ffc7648fL    # -3.607411173533E-312

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lcom/google/android/gms/internal/ads/zzakm;->zzf:Ljava/util/UUID;

    .line 54
    .line 55
    new-instance v0, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    const-string v2, "htc_video_rotA-000"

    .line 62
    .line 63
    const/16 v3, 0x5a

    .line 64
    .line 65
    const-string v4, "htc_video_rotA-090"

    .line 66
    .line 67
    invoke-static {v1, v0, v2, v3, v4}, LN0/a;->p(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/16 v1, 0xb4

    .line 71
    .line 72
    const-string v2, "htc_video_rotA-180"

    .line 73
    .line 74
    const/16 v3, 0x10e

    .line 75
    .line 76
    const-string v4, "htc_video_rotA-270"

    .line 77
    .line 78
    invoke-static {v1, v0, v2, v3, v4}, LN0/a;->p(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, Lcom/google/android/gms/internal/ads/zzakm;->zzg:Ljava/util/Map;

    .line 86
    .line 87
    return-void

    .line 88
    nop

    .line 89
    :array_0
    .array-data 1
        0x31t
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    :array_1
    .array-data 1
        0x44t
        0x69t
        0x61t
        0x6ct
        0x6ft
        0x67t
        0x75t
        0x65t
        0x3at
        0x20t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
    .end array-data

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    :array_2
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x56t
        0x54t
        0x54t
        0xat
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzake;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzake;-><init>()V

    const/4 v1, 0x2

    sget-object v2, Lcom/google/android/gms/internal/ads/zzanq;->zza:Lcom/google/android/gms/internal/ads/zzanq;

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzakm;-><init>(Lcom/google/android/gms/internal/ads/zzake;ILcom/google/android/gms/internal/ads/zzanq;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzake;ILcom/google/android/gms/internal/ads/zzanq;)V
    .locals 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzz:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzA:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzB:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzC:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzM:J

    const/4 v4, -0x1

    iput v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzN:I

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzO:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzP:J

    iput v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzQ:I

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzS:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzT:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzU:J

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzas:Lcom/google/android/gms/internal/ads/zzake;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzakh;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzakh;-><init>(Lcom/google/android/gms/internal/ads/zzakm;[B)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzake;->zza(Lcom/google/android/gms/internal/ads/zzakf;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzm:Lcom/google/android/gms/internal/ads/zzanq;

    new-instance p1, Landroid/util/SparseArray;

    .line 3
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzK:Landroid/util/SparseArray;

    and-int/lit8 p1, p2, 0x1

    const/4 p3, 0x1

    xor-int/2addr p1, p3

    const/4 v0, 0x0

    if-eq p3, p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    move p1, p3

    :goto_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzk:Z

    and-int/lit8 p1, p2, 0x2

    if-nez p1, :cond_1

    move v0, p3

    :cond_1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzl:Z

    .line 4
    new-instance p1, Lcom/google/android/gms/internal/ads/zzako;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzako;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzh:Lcom/google/android/gms/internal/ads/zzako;

    new-instance p1, Landroid/util/LongSparseArray;

    .line 5
    invoke-direct {p1}, Landroid/util/LongSparseArray;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzj:Landroid/util/LongSparseArray;

    new-instance p1, Landroid/util/SparseArray;

    .line 6
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzi:Landroid/util/SparseArray;

    .line 7
    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzp:Lcom/google/android/gms/internal/ads/zzeu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 8
    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzeu;-><init>([B)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzq:Lcom/google/android/gms/internal/ads/zzeu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 9
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzr:Lcom/google/android/gms/internal/ads/zzeu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 10
    sget-object v0, Lcom/google/android/gms/internal/ads/zzgr;->zza:[B

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzeu;-><init>([B)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzn:Lcom/google/android/gms/internal/ads/zzeu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 11
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzo:Lcom/google/android/gms/internal/ads/zzeu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 12
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzs:Lcom/google/android/gms/internal/ads/zzeu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 13
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzt:Lcom/google/android/gms/internal/ads/zzeu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    const/16 p2, 0x8

    .line 14
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzu:Lcom/google/android/gms/internal/ads/zzeu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 15
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzv:Lcom/google/android/gms/internal/ads/zzeu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 16
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzw:Lcom/google/android/gms/internal/ads/zzeu;

    new-array p1, p3, [I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzab:[I

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzE:Z

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzanq;I)V
    .locals 1

    .line 17
    new-instance p2, Lcom/google/android/gms/internal/ads/zzake;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzake;-><init>()V

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzakm;-><init>(Lcom/google/android/gms/internal/ads/zzake;ILcom/google/android/gms/internal/ads/zzanq;)V

    return-void
.end method

.method private final zzA(J)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzA:J

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v2, v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-wide/16 v4, 0x3e8

    .line 13
    .line 14
    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 15
    .line 16
    move-wide v0, p1

    .line 17
    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    return-wide p1

    .line 22
    :cond_0
    const-string p1, "Can\'t scale timecode prior to timecodeScale being set."

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    throw p1
.end method

.method private static zzB([II)[I
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    new-array p0, p1, [I

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    array-length v0, p0

    .line 7
    if-lt v0, p1, :cond_1

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_1
    add-int/2addr v0, v0

    .line 11
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    new-array p0, p0, [I

    .line 16
    .line 17
    return-object p0
.end method

.method private final zzC()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzE:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzi:Landroid/util/SparseArray;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-ge v1, v3, :cond_1

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lcom/google/android/gms/internal/ads/zzakl;

    .line 20
    .line 21
    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/zzakl;->zzW:Z

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzar:Lcom/google/android/gms/internal/ads/zzagd;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagd;->zzv()V

    .line 35
    .line 36
    .line 37
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzE:Z

    .line 38
    .line 39
    :cond_2
    :goto_1
    return-void
.end method

.method public static synthetic zzn()[B
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzakm;->zzc:[B

    return-object v0
.end method

.method public static synthetic zzo()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzakm;->zzf:Ljava/util/UUID;

    return-object v0
.end method

.method public static synthetic zzp()Ljava/util/Map;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzakm;->zzg:Ljava/util/Map;

    return-object v0
.end method

.method private final zzq(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzF:Lcom/google/android/gms/internal/ads/zzakg;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x23

    .line 17
    .line 18
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const-string v0, "Element "

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p1, " must be in an EditionEntry"

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    throw p1
.end method

.method private final zzr(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x20

    .line 17
    .line 18
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const-string v0, "Element "

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p1, " must be in a TrackEntry"

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    throw p1
.end method

.method private final zzs(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzL:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x1a

    .line 17
    .line 18
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const-string v0, "Element "

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p1, " must be in a Cues"

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    throw p1
.end method

.method private final zzt(Lcom/google/android/gms/internal/ads/zzakl;JIII)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzV:Lcom/google/android/gms/internal/ads/zzahn;

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move-object v3, v2

    .line 11
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzZ:Lcom/google/android/gms/internal/ads/zzahm;

    .line 12
    .line 13
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzk:Lcom/google/android/gms/internal/ads/zzahl;

    .line 14
    .line 15
    move/from16 v5, p4

    .line 16
    .line 17
    move/from16 v6, p5

    .line 18
    .line 19
    move/from16 v7, p6

    .line 20
    .line 21
    move-object v1, v3

    .line 22
    move-wide/from16 v3, p2

    .line 23
    .line 24
    invoke-virtual/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/zzahn;->zzc(Lcom/google/android/gms/internal/ads/zzahm;JIIILcom/google/android/gms/internal/ads/zzahl;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_8

    .line 28
    .line 29
    :cond_0
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzc:Ljava/lang/String;

    .line 30
    .line 31
    const-string v3, "S_TEXT/UTF8"

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    const-string v5, "S_TEXT/WEBVTT"

    .line 38
    .line 39
    const-string v6, "S_TEXT/SSA"

    .line 40
    .line 41
    const-string v7, "S_TEXT/ASS"

    .line 42
    .line 43
    const/4 v8, 0x2

    .line 44
    const/4 v10, 0x0

    .line 45
    if-nez v4, :cond_1

    .line 46
    .line 47
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-nez v4, :cond_1

    .line 52
    .line 53
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_1

    .line 58
    .line 59
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    :cond_1
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzaa:I

    .line 66
    .line 67
    const-string v11, "MatroskaExtractor"

    .line 68
    .line 69
    if-le v4, v9, :cond_2

    .line 70
    .line 71
    const-string v2, "Skipping subtitle sample in laced block."

    .line 72
    .line 73
    invoke-static {v11, v2}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    iget-wide v12, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzY:J

    .line 78
    .line 79
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    cmp-long v4, v12, v14

    .line 85
    .line 86
    if-nez v4, :cond_4

    .line 87
    .line 88
    const-string v2, "Skipping subtitle sample with no duration."

    .line 89
    .line 90
    invoke-static {v11, v2}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    :goto_0
    move/from16 v2, p5

    .line 94
    .line 95
    goto/16 :goto_6

    .line 96
    .line 97
    :cond_4
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzt:Lcom/google/android/gms/internal/ads/zzeu;

    .line 98
    .line 99
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 104
    .line 105
    .line 106
    move-result v14

    .line 107
    const/4 v15, 0x3

    .line 108
    sparse-switch v14, :sswitch_data_0

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :sswitch_0
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_5

    .line 117
    .line 118
    move v2, v10

    .line 119
    goto :goto_2

    .line 120
    :sswitch_1
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_5

    .line 125
    .line 126
    move v2, v15

    .line 127
    goto :goto_2

    .line 128
    :sswitch_2
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eqz v2, :cond_5

    .line 133
    .line 134
    move v2, v8

    .line 135
    goto :goto_2

    .line 136
    :sswitch_3
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-eqz v2, :cond_5

    .line 141
    .line 142
    move v2, v9

    .line 143
    goto :goto_2

    .line 144
    :cond_5
    :goto_1
    const/4 v2, -0x1

    .line 145
    :goto_2
    const-wide/16 v5, 0x3e8

    .line 146
    .line 147
    if-eqz v2, :cond_8

    .line 148
    .line 149
    if-eq v2, v9, :cond_7

    .line 150
    .line 151
    if-eq v2, v8, :cond_7

    .line 152
    .line 153
    if-ne v2, v15, :cond_6

    .line 154
    .line 155
    const-string v2, "%02d:%02d:%02d.%03d"

    .line 156
    .line 157
    invoke-static {v12, v13, v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzakm;->zzy(JLjava/lang/String;J)[B

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    const/16 v3, 0x19

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 165
    .line 166
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 167
    .line 168
    .line 169
    throw v1

    .line 170
    :cond_7
    const-string v2, "%01d:%02d:%02d:%02d"

    .line 171
    .line 172
    const-wide/16 v5, 0x2710

    .line 173
    .line 174
    invoke-static {v12, v13, v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzakm;->zzy(JLjava/lang/String;J)[B

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    const/16 v3, 0x15

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_8
    const-string v2, "%02d:%02d:%02d,%03d"

    .line 182
    .line 183
    invoke-static {v12, v13, v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzakm;->zzy(JLjava/lang/String;J)[B

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    const/16 v3, 0x13

    .line 188
    .line 189
    :goto_3
    array-length v5, v2

    .line 190
    invoke-static {v2, v10, v11, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    :goto_4
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-ge v2, v3, :cond_a

    .line 202
    .line 203
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    aget-byte v3, v3, v2

    .line 208
    .line 209
    if-nez v3, :cond_9

    .line 210
    .line 211
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzf(I)V

    .line 212
    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_9
    add-int/lit8 v2, v2, 0x1

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_a
    :goto_5
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzZ:Lcom/google/android/gms/internal/ads/zzahm;

    .line 219
    .line 220
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    invoke-interface {v2, v4, v3}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    add-int v2, v2, p5

    .line 232
    .line 233
    :goto_6
    const/high16 v3, 0x10000000

    .line 234
    .line 235
    and-int v3, p4, v3

    .line 236
    .line 237
    if-eqz v3, :cond_c

    .line 238
    .line 239
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzaa:I

    .line 240
    .line 241
    if-le v3, v9, :cond_b

    .line 242
    .line 243
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzw:Lcom/google/android/gms/internal/ads/zzeu;

    .line 244
    .line 245
    invoke-virtual {v3, v10}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 246
    .line 247
    .line 248
    goto :goto_7

    .line 249
    :cond_b
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzw:Lcom/google/android/gms/internal/ads/zzeu;

    .line 250
    .line 251
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzZ:Lcom/google/android/gms/internal/ads/zzahm;

    .line 256
    .line 257
    invoke-interface {v5, v3, v4, v8}, Lcom/google/android/gms/internal/ads/zzahm;->zzd(Lcom/google/android/gms/internal/ads/zzeu;II)V

    .line 258
    .line 259
    .line 260
    add-int/2addr v2, v4

    .line 261
    :cond_c
    :goto_7
    move v14, v2

    .line 262
    iget-object v10, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzZ:Lcom/google/android/gms/internal/ads/zzahm;

    .line 263
    .line 264
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzk:Lcom/google/android/gms/internal/ads/zzahl;

    .line 265
    .line 266
    move-wide/from16 v11, p2

    .line 267
    .line 268
    move/from16 v13, p4

    .line 269
    .line 270
    move/from16 v15, p6

    .line 271
    .line 272
    move-object/from16 v16, v1

    .line 273
    .line 274
    invoke-interface/range {v10 .. v16}, Lcom/google/android/gms/internal/ads/zzahm;->zze(JIIILcom/google/android/gms/internal/ads/zzahl;)V

    .line 275
    .line 276
    .line 277
    :goto_8
    iput-boolean v9, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzV:Z

    .line 278
    .line 279
    return-void

    .line 280
    nop

    .line 281
    :sswitch_data_0
    .sparse-switch
        0x2c0618eb -> :sswitch_3
        0x2c065c6b -> :sswitch_2
        0x3e4ca2d8 -> :sswitch_1
        0x54c61e47 -> :sswitch_0
    .end sparse-switch
.end method

.method private final zzu(Lcom/google/android/gms/internal/ads/zzagb;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzp:Lcom/google/android/gms/internal/ads/zzeu;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lt v1, p2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzj()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-ge v1, p2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzj()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    add-int/2addr v1, v1

    .line 21
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzc(I)V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    sub-int v3, p2, v3

    .line 41
    .line 42
    invoke-interface {p1, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzf(I)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method private final zzv(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzakl;IZ)I
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzc:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "S_TEXT/UTF8"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object p2, Lcom/google/android/gms/internal/ads/zzakm;->zzb:[B

    .line 12
    .line 13
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzakm;->zzx(Lcom/google/android/gms/internal/ads/zzagb;[BI)V

    .line 14
    .line 15
    .line 16
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzakm;->zzw()V

    .line 19
    .line 20
    .line 21
    return p1

    .line 22
    :cond_0
    const-string v1, "S_TEXT/ASS"

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1d

    .line 29
    .line 30
    const-string v1, "S_TEXT/SSA"

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    goto/16 :goto_c

    .line 39
    .line 40
    :cond_1
    const-string v1, "S_TEXT/WEBVTT"

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    sget-object p2, Lcom/google/android/gms/internal/ads/zzakm;->zze:[B

    .line 49
    .line 50
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzakm;->zzx(Lcom/google/android/gms/internal/ads/zzagb;[BI)V

    .line 51
    .line 52
    .line 53
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 54
    .line 55
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzakm;->zzw()V

    .line 56
    .line 57
    .line 58
    return p1

    .line 59
    :cond_2
    iget-boolean v0, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzW:Z

    .line 60
    .line 61
    const/4 v1, 0x2

    .line 62
    const/4 v2, 0x1

    .line 63
    const/4 v3, 0x0

    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzaa:Lcom/google/android/gms/internal/ads/zzv;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeu;

    .line 72
    .line 73
    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-interface {p1, v4, v3, p3, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzh([BIIZ)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-nez v4, :cond_3

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzr()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzafz;->zza(I)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-ne v4, v2, :cond_4

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    const/16 v5, 0xa

    .line 105
    .line 106
    if-lt v4, v5, :cond_4

    .line 107
    .line 108
    new-array v4, v5, [B

    .line 109
    .line 110
    invoke-virtual {v0, v4, v3, v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 114
    .line 115
    .line 116
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzafz;->zzc([B)I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    add-int/lit8 v6, v4, 0x4

    .line 125
    .line 126
    if-lt v5, v6, :cond_4

    .line 127
    .line 128
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzafz;->zza(I)I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-ne v0, v1, :cond_4

    .line 140
    .line 141
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzaa:Lcom/google/android/gms/internal/ads/zzv;

    .line 142
    .line 143
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const-string v4, "audio/vnd.dts.hd"

    .line 148
    .line 149
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iput-object v0, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzaa:Lcom/google/android/gms/internal/ads/zzv;

    .line 157
    .line 158
    :cond_4
    :goto_0
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzZ:Lcom/google/android/gms/internal/ads/zzahm;

    .line 159
    .line 160
    iget-object v4, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzaa:Lcom/google/android/gms/internal/ads/zzv;

    .line 161
    .line 162
    invoke-interface {v0, v4}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 163
    .line 164
    .line 165
    iput-boolean v3, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzW:Z

    .line 166
    .line 167
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzakm;->zzC()V

    .line 168
    .line 169
    .line 170
    :cond_5
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzZ:Lcom/google/android/gms/internal/ads/zzahm;

    .line 171
    .line 172
    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzal:Z

    .line 173
    .line 174
    const/4 v5, 0x4

    .line 175
    if-nez v4, :cond_14

    .line 176
    .line 177
    iget-boolean v4, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzi:Z

    .line 178
    .line 179
    if-eqz v4, :cond_10

    .line 180
    .line 181
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzae:I

    .line 182
    .line 183
    const v6, -0x40000001    # -1.9999999f

    .line 184
    .line 185
    .line 186
    and-int/2addr v4, v6

    .line 187
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzae:I

    .line 188
    .line 189
    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzam:Z

    .line 190
    .line 191
    const/16 v6, 0x80

    .line 192
    .line 193
    if-nez v4, :cond_7

    .line 194
    .line 195
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzp:Lcom/google/android/gms/internal/ads/zzeu;

    .line 196
    .line 197
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    invoke-interface {p1, v7, v3, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 202
    .line 203
    .line 204
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 205
    .line 206
    add-int/2addr v7, v2

    .line 207
    iput v7, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 208
    .line 209
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    aget-byte v7, v7, v3

    .line 214
    .line 215
    and-int/2addr v7, v6

    .line 216
    if-eq v7, v6, :cond_6

    .line 217
    .line 218
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    aget-byte v4, v4, v3

    .line 223
    .line 224
    iput-byte v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzap:B

    .line 225
    .line 226
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzam:Z

    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_6
    const-string p1, "Extension bit is set in signal byte"

    .line 230
    .line 231
    const/4 p2, 0x0

    .line 232
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    throw p1

    .line 237
    :cond_7
    :goto_1
    iget-byte v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzap:B

    .line 238
    .line 239
    and-int/lit8 v7, v4, 0x1

    .line 240
    .line 241
    if-ne v7, v2, :cond_11

    .line 242
    .line 243
    and-int/2addr v4, v1

    .line 244
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzae:I

    .line 245
    .line 246
    const/high16 v8, 0x40000000    # 2.0f

    .line 247
    .line 248
    or-int/2addr v7, v8

    .line 249
    iput v7, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzae:I

    .line 250
    .line 251
    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaq:Z

    .line 252
    .line 253
    if-nez v7, :cond_9

    .line 254
    .line 255
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzu:Lcom/google/android/gms/internal/ads/zzeu;

    .line 256
    .line 257
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    const/16 v9, 0x8

    .line 262
    .line 263
    invoke-interface {p1, v8, v3, v9}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 264
    .line 265
    .line 266
    iget v8, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 267
    .line 268
    add-int/2addr v8, v9

    .line 269
    iput v8, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 270
    .line 271
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaq:Z

    .line 272
    .line 273
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzp:Lcom/google/android/gms/internal/ads/zzeu;

    .line 274
    .line 275
    if-ne v4, v1, :cond_8

    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_8
    move v6, v3

    .line 279
    :goto_2
    or-int/2addr v6, v9

    .line 280
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    int-to-byte v6, v6

    .line 285
    aput-byte v6, v10, v3

    .line 286
    .line 287
    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 288
    .line 289
    .line 290
    invoke-interface {v0, v8, v2, v2}, Lcom/google/android/gms/internal/ads/zzahm;->zzd(Lcom/google/android/gms/internal/ads/zzeu;II)V

    .line 291
    .line 292
    .line 293
    iget v6, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 294
    .line 295
    add-int/2addr v6, v2

    .line 296
    iput v6, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 297
    .line 298
    invoke-virtual {v7, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 299
    .line 300
    .line 301
    invoke-interface {v0, v7, v9, v2}, Lcom/google/android/gms/internal/ads/zzahm;->zzd(Lcom/google/android/gms/internal/ads/zzeu;II)V

    .line 302
    .line 303
    .line 304
    iget v6, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 305
    .line 306
    add-int/2addr v6, v9

    .line 307
    iput v6, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 308
    .line 309
    :cond_9
    if-ne v4, v1, :cond_11

    .line 310
    .line 311
    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzan:Z

    .line 312
    .line 313
    if-nez v4, :cond_a

    .line 314
    .line 315
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzp:Lcom/google/android/gms/internal/ads/zzeu;

    .line 316
    .line 317
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    invoke-interface {p1, v6, v3, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 322
    .line 323
    .line 324
    iget v6, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 325
    .line 326
    add-int/2addr v6, v2

    .line 327
    iput v6, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 328
    .line 329
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzao:I

    .line 337
    .line 338
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzan:Z

    .line 339
    .line 340
    :cond_a
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzao:I

    .line 341
    .line 342
    mul-int/2addr v4, v5

    .line 343
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzp:Lcom/google/android/gms/internal/ads/zzeu;

    .line 344
    .line 345
    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 349
    .line 350
    .line 351
    move-result-object v7

    .line 352
    invoke-interface {p1, v7, v3, v4}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 353
    .line 354
    .line 355
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 356
    .line 357
    add-int/2addr v7, v4

    .line 358
    iput v7, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 359
    .line 360
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzao:I

    .line 361
    .line 362
    shr-int/2addr v4, v2

    .line 363
    add-int/2addr v4, v2

    .line 364
    mul-int/lit8 v7, v4, 0x6

    .line 365
    .line 366
    add-int/2addr v7, v1

    .line 367
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzx:Ljava/nio/ByteBuffer;

    .line 368
    .line 369
    if-eqz v8, :cond_b

    .line 370
    .line 371
    invoke-virtual {v8}, Ljava/nio/Buffer;->capacity()I

    .line 372
    .line 373
    .line 374
    move-result v8

    .line 375
    if-ge v8, v7, :cond_c

    .line 376
    .line 377
    :cond_b
    invoke-static {v7}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 378
    .line 379
    .line 380
    move-result-object v8

    .line 381
    iput-object v8, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzx:Ljava/nio/ByteBuffer;

    .line 382
    .line 383
    :cond_c
    int-to-short v4, v4

    .line 384
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzx:Ljava/nio/ByteBuffer;

    .line 385
    .line 386
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 387
    .line 388
    .line 389
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzx:Ljava/nio/ByteBuffer;

    .line 390
    .line 391
    invoke-virtual {v8, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 392
    .line 393
    .line 394
    move v4, v3

    .line 395
    move v8, v4

    .line 396
    :goto_3
    iget v9, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzao:I

    .line 397
    .line 398
    if-ge v4, v9, :cond_e

    .line 399
    .line 400
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 401
    .line 402
    .line 403
    move-result v9

    .line 404
    sub-int v8, v9, v8

    .line 405
    .line 406
    rem-int/lit8 v10, v4, 0x2

    .line 407
    .line 408
    if-nez v10, :cond_d

    .line 409
    .line 410
    iget-object v10, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzx:Ljava/nio/ByteBuffer;

    .line 411
    .line 412
    int-to-short v8, v8

    .line 413
    invoke-virtual {v10, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 414
    .line 415
    .line 416
    goto :goto_4

    .line 417
    :cond_d
    iget-object v10, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzx:Ljava/nio/ByteBuffer;

    .line 418
    .line 419
    invoke-virtual {v10, v8}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 420
    .line 421
    .line 422
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 423
    .line 424
    move v8, v9

    .line 425
    goto :goto_3

    .line 426
    :cond_e
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 427
    .line 428
    sub-int v4, p3, v4

    .line 429
    .line 430
    sub-int/2addr v4, v8

    .line 431
    and-int/lit8 v6, v9, 0x1

    .line 432
    .line 433
    if-ne v6, v2, :cond_f

    .line 434
    .line 435
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzx:Ljava/nio/ByteBuffer;

    .line 436
    .line 437
    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 438
    .line 439
    .line 440
    goto :goto_5

    .line 441
    :cond_f
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzx:Ljava/nio/ByteBuffer;

    .line 442
    .line 443
    int-to-short v4, v4

    .line 444
    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 445
    .line 446
    .line 447
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzx:Ljava/nio/ByteBuffer;

    .line 448
    .line 449
    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 450
    .line 451
    .line 452
    :goto_5
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzv:Lcom/google/android/gms/internal/ads/zzeu;

    .line 453
    .line 454
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzx:Ljava/nio/ByteBuffer;

    .line 455
    .line 456
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    invoke-virtual {v4, v6, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzb([BI)V

    .line 461
    .line 462
    .line 463
    invoke-interface {v0, v4, v7, v2}, Lcom/google/android/gms/internal/ads/zzahm;->zzd(Lcom/google/android/gms/internal/ads/zzeu;II)V

    .line 464
    .line 465
    .line 466
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 467
    .line 468
    add-int/2addr v4, v7

    .line 469
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 470
    .line 471
    goto :goto_6

    .line 472
    :cond_10
    iget-object v4, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzj:[B

    .line 473
    .line 474
    if-eqz v4, :cond_11

    .line 475
    .line 476
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzs:Lcom/google/android/gms/internal/ads/zzeu;

    .line 477
    .line 478
    array-length v7, v4

    .line 479
    invoke-virtual {v6, v4, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzb([BI)V

    .line 480
    .line 481
    .line 482
    :cond_11
    :goto_6
    iget-object v4, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzc:Ljava/lang/String;

    .line 483
    .line 484
    const-string v6, "A_OPUS"

    .line 485
    .line 486
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result v4

    .line 490
    if-eqz v4, :cond_12

    .line 491
    .line 492
    if-eqz p4, :cond_13

    .line 493
    .line 494
    goto :goto_7

    .line 495
    :cond_12
    iget p4, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzh:I

    .line 496
    .line 497
    if-lez p4, :cond_13

    .line 498
    .line 499
    :goto_7
    iget p4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzae:I

    .line 500
    .line 501
    const/high16 v4, 0x10000000

    .line 502
    .line 503
    or-int/2addr p4, v4

    .line 504
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzae:I

    .line 505
    .line 506
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzw:Lcom/google/android/gms/internal/ads/zzeu;

    .line 507
    .line 508
    invoke-virtual {p4, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 509
    .line 510
    .line 511
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzs:Lcom/google/android/gms/internal/ads/zzeu;

    .line 512
    .line 513
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 514
    .line 515
    .line 516
    move-result p4

    .line 517
    add-int/2addr p4, p3

    .line 518
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 519
    .line 520
    sub-int/2addr p4, v4

    .line 521
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzp:Lcom/google/android/gms/internal/ads/zzeu;

    .line 522
    .line 523
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 524
    .line 525
    .line 526
    shr-int/lit8 v6, p4, 0x18

    .line 527
    .line 528
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 529
    .line 530
    .line 531
    move-result-object v7

    .line 532
    and-int/lit16 v6, v6, 0xff

    .line 533
    .line 534
    int-to-byte v6, v6

    .line 535
    aput-byte v6, v7, v3

    .line 536
    .line 537
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 538
    .line 539
    .line 540
    move-result-object v6

    .line 541
    shr-int/lit8 v7, p4, 0x10

    .line 542
    .line 543
    and-int/lit16 v7, v7, 0xff

    .line 544
    .line 545
    int-to-byte v7, v7

    .line 546
    aput-byte v7, v6, v2

    .line 547
    .line 548
    shr-int/lit8 v6, p4, 0x8

    .line 549
    .line 550
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 551
    .line 552
    .line 553
    move-result-object v7

    .line 554
    and-int/lit16 v6, v6, 0xff

    .line 555
    .line 556
    int-to-byte v6, v6

    .line 557
    aput-byte v6, v7, v1

    .line 558
    .line 559
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 560
    .line 561
    .line 562
    move-result-object v6

    .line 563
    and-int/lit16 p4, p4, 0xff

    .line 564
    .line 565
    int-to-byte p4, p4

    .line 566
    const/4 v7, 0x3

    .line 567
    aput-byte p4, v6, v7

    .line 568
    .line 569
    invoke-interface {v0, v4, v5, v1}, Lcom/google/android/gms/internal/ads/zzahm;->zzd(Lcom/google/android/gms/internal/ads/zzeu;II)V

    .line 570
    .line 571
    .line 572
    iget p4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 573
    .line 574
    add-int/2addr p4, v5

    .line 575
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 576
    .line 577
    :cond_13
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzal:Z

    .line 578
    .line 579
    :cond_14
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzs:Lcom/google/android/gms/internal/ads/zzeu;

    .line 580
    .line 581
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 582
    .line 583
    .line 584
    move-result v4

    .line 585
    add-int/2addr v4, p3

    .line 586
    iget-object p3, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzc:Ljava/lang/String;

    .line 587
    .line 588
    const-string v6, "V_MPEG4/ISO/AVC"

    .line 589
    .line 590
    invoke-virtual {v6, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-result v6

    .line 594
    if-nez v6, :cond_18

    .line 595
    .line 596
    const-string v6, "V_MPEGH/ISO/HEVC"

    .line 597
    .line 598
    invoke-virtual {v6, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    move-result p3

    .line 602
    if-eqz p3, :cond_15

    .line 603
    .line 604
    goto :goto_a

    .line 605
    :cond_15
    iget-object p3, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzV:Lcom/google/android/gms/internal/ads/zzahn;

    .line 606
    .line 607
    if-nez p3, :cond_16

    .line 608
    .line 609
    goto :goto_9

    .line 610
    :cond_16
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 611
    .line 612
    .line 613
    move-result p3

    .line 614
    if-nez p3, :cond_17

    .line 615
    .line 616
    goto :goto_8

    .line 617
    :cond_17
    move v2, v3

    .line 618
    :goto_8
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V

    .line 619
    .line 620
    .line 621
    iget-object p3, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzV:Lcom/google/android/gms/internal/ads/zzahn;

    .line 622
    .line 623
    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/zzahn;->zzb(Lcom/google/android/gms/internal/ads/zzagb;)V

    .line 624
    .line 625
    .line 626
    :goto_9
    iget p3, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 627
    .line 628
    if-ge p3, v4, :cond_1b

    .line 629
    .line 630
    sub-int p3, v4, p3

    .line 631
    .line 632
    invoke-direct {p0, p1, v0, p3}, Lcom/google/android/gms/internal/ads/zzakm;->zzz(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzahm;I)I

    .line 633
    .line 634
    .line 635
    move-result p3

    .line 636
    iget p4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 637
    .line 638
    add-int/2addr p4, p3

    .line 639
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 640
    .line 641
    iget p4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 642
    .line 643
    add-int/2addr p4, p3

    .line 644
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 645
    .line 646
    goto :goto_9

    .line 647
    :cond_18
    :goto_a
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzo:Lcom/google/android/gms/internal/ads/zzeu;

    .line 648
    .line 649
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 650
    .line 651
    .line 652
    move-result-object v6

    .line 653
    aput-byte v3, v6, v3

    .line 654
    .line 655
    aput-byte v3, v6, v2

    .line 656
    .line 657
    aput-byte v3, v6, v1

    .line 658
    .line 659
    iget v1, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzab:I

    .line 660
    .line 661
    rsub-int/lit8 v2, v1, 0x4

    .line 662
    .line 663
    :goto_b
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 664
    .line 665
    if-ge v7, v4, :cond_1b

    .line 666
    .line 667
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzak:I

    .line 668
    .line 669
    if-nez v7, :cond_1a

    .line 670
    .line 671
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 672
    .line 673
    .line 674
    move-result v7

    .line 675
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 676
    .line 677
    .line 678
    move-result v7

    .line 679
    add-int v8, v2, v7

    .line 680
    .line 681
    sub-int v9, v1, v7

    .line 682
    .line 683
    invoke-interface {p1, v6, v8, v9}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 684
    .line 685
    .line 686
    if-lez v7, :cond_19

    .line 687
    .line 688
    invoke-virtual {p4, v6, v2, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 689
    .line 690
    .line 691
    :cond_19
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 692
    .line 693
    add-int/2addr v7, v1

    .line 694
    iput v7, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 695
    .line 696
    invoke-virtual {p3, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 700
    .line 701
    .line 702
    move-result v7

    .line 703
    iput v7, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzak:I

    .line 704
    .line 705
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzn:Lcom/google/android/gms/internal/ads/zzeu;

    .line 706
    .line 707
    invoke-virtual {v7, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 708
    .line 709
    .line 710
    invoke-interface {v0, v7, v5}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 711
    .line 712
    .line 713
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 714
    .line 715
    add-int/2addr v7, v5

    .line 716
    iput v7, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 717
    .line 718
    goto :goto_b

    .line 719
    :cond_1a
    invoke-direct {p0, p1, v0, v7}, Lcom/google/android/gms/internal/ads/zzakm;->zzz(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzahm;I)I

    .line 720
    .line 721
    .line 722
    move-result v7

    .line 723
    iget v8, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 724
    .line 725
    add-int/2addr v8, v7

    .line 726
    iput v8, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 727
    .line 728
    iget v8, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 729
    .line 730
    add-int/2addr v8, v7

    .line 731
    iput v8, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 732
    .line 733
    iget v8, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzak:I

    .line 734
    .line 735
    sub-int/2addr v8, v7

    .line 736
    iput v8, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzak:I

    .line 737
    .line 738
    goto :goto_b

    .line 739
    :cond_1b
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzc:Ljava/lang/String;

    .line 740
    .line 741
    const-string p2, "A_VORBIS"

    .line 742
    .line 743
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 744
    .line 745
    .line 746
    move-result p1

    .line 747
    if-eqz p1, :cond_1c

    .line 748
    .line 749
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzq:Lcom/google/android/gms/internal/ads/zzeu;

    .line 750
    .line 751
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 752
    .line 753
    .line 754
    invoke-interface {v0, p1, v5}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 755
    .line 756
    .line 757
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 758
    .line 759
    add-int/2addr p1, v5

    .line 760
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 761
    .line 762
    :cond_1c
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 763
    .line 764
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzakm;->zzw()V

    .line 765
    .line 766
    .line 767
    return p1

    .line 768
    :cond_1d
    :goto_c
    sget-object p2, Lcom/google/android/gms/internal/ads/zzakm;->zzd:[B

    .line 769
    .line 770
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzakm;->zzx(Lcom/google/android/gms/internal/ads/zzagb;[BI)V

    .line 771
    .line 772
    .line 773
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 774
    .line 775
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzakm;->zzw()V

    .line 776
    .line 777
    .line 778
    return p1
.end method

.method private final zzw()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzai:I

    .line 3
    .line 4
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaj:I

    .line 5
    .line 6
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzak:I

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzal:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzam:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzan:Z

    .line 13
    .line 14
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzao:I

    .line 15
    .line 16
    iput-byte v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzap:B

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaq:Z

    .line 19
    .line 20
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzs:Lcom/google/android/gms/internal/ads/zzeu;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private final zzx(Lcom/google/android/gms/internal/ads/zzagb;[BI)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    array-length v0, p2

    .line 2
    add-int v1, v0, p3

    .line 3
    .line 4
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzt:Lcom/google/android/gms/internal/ads/zzeu;

    .line 5
    .line 6
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzj()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    const/4 v4, 0x0

    .line 11
    if-ge v3, v1, :cond_0

    .line 12
    .line 13
    add-int v3, v1, p3

    .line 14
    .line 15
    invoke-static {p2, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    array-length v3, p2

    .line 20
    invoke-virtual {v2, p2, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzb([BI)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {p2, v4, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-interface {p1, p2, v0, p3}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzf(I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method private static zzy(JLjava/lang/String;J)[B
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, p0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    move v2, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v0

    .line 15
    :goto_0
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgtr;->zza(Z)V

    .line 16
    .line 17
    .line 18
    const-wide v2, 0xd693a400L

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    div-long v4, p0, v2

    .line 24
    .line 25
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 26
    .line 27
    long-to-int v4, v4

    .line 28
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    int-to-long v7, v4

    .line 33
    mul-long/2addr v7, v2

    .line 34
    sub-long/2addr p0, v7

    .line 35
    const-wide/32 v2, 0x3938700

    .line 36
    .line 37
    .line 38
    div-long v7, p0, v2

    .line 39
    .line 40
    long-to-int v4, v7

    .line 41
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    int-to-long v8, v4

    .line 46
    mul-long/2addr v8, v2

    .line 47
    sub-long/2addr p0, v8

    .line 48
    const-wide/32 v2, 0xf4240

    .line 49
    .line 50
    .line 51
    div-long v8, p0, v2

    .line 52
    .line 53
    long-to-int v4, v8

    .line 54
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    int-to-long v9, v4

    .line 59
    mul-long/2addr v9, v2

    .line 60
    sub-long/2addr p0, v9

    .line 61
    div-long/2addr p0, p3

    .line 62
    long-to-int p0, p0

    .line 63
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const/4 p1, 0x4

    .line 68
    new-array p1, p1, [Ljava/lang/Object;

    .line 69
    .line 70
    aput-object v5, p1, v0

    .line 71
    .line 72
    aput-object v7, p1, v1

    .line 73
    .line 74
    const/4 p3, 0x2

    .line 75
    aput-object v8, p1, p3

    .line 76
    .line 77
    const/4 p3, 0x3

    .line 78
    aput-object p0, p1, p3

    .line 79
    .line 80
    invoke-static {v6, p2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    sget-object p1, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 85
    .line 86
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method

.method private final zzz(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzahm;I)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzs:Lcom/google/android/gms/internal/ads/zzeu;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-interface {p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 14
    .line 15
    .line 16
    return p1

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    invoke-interface {p2, p1, p3, v0}, Lcom/google/android/gms/internal/ads/zzahm;->zza(Lcom/google/android/gms/internal/ads/zzj;IZ)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzagb;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzakn;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzakn;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzakn;->zza(Lcom/google/android/gms/internal/ads/zzagb;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final synthetic zzb()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/f;->a(Lcom/google/android/gms/internal/ads/zzaga;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzagd;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzl:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzm:Lcom/google/android/gms/internal/ads/zzanq;

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/gms/internal/ads/zzant;

    .line 8
    .line 9
    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzant;-><init>(Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzanq;)V

    .line 10
    .line 11
    .line 12
    move-object p1, v1

    .line 13
    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzar:Lcom/google/android/gms/internal/ads/zzagd;

    .line 14
    .line 15
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzaha;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzV:Z

    .line 3
    .line 4
    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzV:Z

    .line 5
    .line 6
    if-nez v1, :cond_5

    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzas:Lcom/google/android/gms/internal/ads/zzake;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzake;->zzc(Lcom/google/android/gms/internal/ads/zzagb;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzR:Z

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzT:J

    .line 25
    .line 26
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzS:J

    .line 27
    .line 28
    iput-wide v1, p2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 29
    .line 30
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzR:Z

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzH:Z

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzT:J

    .line 38
    .line 39
    const-wide/16 v4, -0x1

    .line 40
    .line 41
    cmp-long v6, v2, v4

    .line 42
    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    iput-wide v2, p2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 46
    .line 47
    iput-wide v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzT:J

    .line 48
    .line 49
    :goto_0
    const/4 p1, 0x1

    .line 50
    return p1

    .line 51
    :cond_2
    if-nez v1, :cond_0

    .line 52
    .line 53
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzi:Landroid/util/SparseArray;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-ge v0, p2, :cond_4

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lcom/google/android/gms/internal/ads/zzakl;

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzakl;->zzb()V

    .line 68
    .line 69
    .line 70
    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzV:Lcom/google/android/gms/internal/ads/zzahn;

    .line 71
    .line 72
    if-eqz p2, :cond_3

    .line 73
    .line 74
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzZ:Lcom/google/android/gms/internal/ads/zzahm;

    .line 75
    .line 76
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzk:Lcom/google/android/gms/internal/ads/zzahl;

    .line 77
    .line 78
    invoke-virtual {p2, v1, p1}, Lcom/google/android/gms/internal/ads/zzahn;->zzd(Lcom/google/android/gms/internal/ads/zzahm;Lcom/google/android/gms/internal/ads/zzahl;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    const/4 p1, -0x1

    .line 85
    return p1

    .line 86
    :cond_5
    return v0
.end method

.method public final zze(JJ)V
    .locals 0

    .line 1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzU:J

    .line 7
    .line 8
    const/4 p3, 0x0

    .line 9
    iput p3, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzW:I

    .line 10
    .line 11
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzas:Lcom/google/android/gms/internal/ads/zzake;

    .line 12
    .line 13
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzake;->zzb()V

    .line 14
    .line 15
    .line 16
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzh:Lcom/google/android/gms/internal/ads/zzako;

    .line 17
    .line 18
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzako;->zza()V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzakm;->zzw()V

    .line 22
    .line 23
    .line 24
    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzL:Z

    .line 25
    .line 26
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzM:J

    .line 27
    .line 28
    const/4 p1, -0x1

    .line 29
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzN:I

    .line 30
    .line 31
    const-wide/16 p1, -0x1

    .line 32
    .line 33
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzO:J

    .line 34
    .line 35
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzP:J

    .line 36
    .line 37
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzH:Z

    .line 38
    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzK:Landroid/util/SparseArray;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    .line 44
    .line 45
    .line 46
    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzi:Landroid/util/SparseArray;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-ge p3, p2, :cond_2

    .line 53
    .line 54
    invoke-virtual {p1, p3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lcom/google/android/gms/internal/ads/zzakl;

    .line 59
    .line 60
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzV:Lcom/google/android/gms/internal/ads/zzahn;

    .line 61
    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzahn;->zza()V

    .line 65
    .line 66
    .line 67
    :cond_1
    add-int/lit8 p3, p3, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    return-void
.end method

.method public final zzf()V
    .locals 0

    return-void
.end method

.method public final synthetic zzg()Lcom/google/android/gms/internal/ads/zzaga;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/f;->b(Lcom/google/android/gms/internal/ads/zzaga;)Lcom/google/android/gms/internal/ads/zzaga;

    move-result-object v0

    return-object v0
.end method

.method public final zzh(IJJ)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzar:Lcom/google/android/gms/internal/ads/zzagd;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x80

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eq p1, v1, :cond_e

    .line 10
    .line 11
    const/16 v1, 0xa0

    .line 12
    .line 13
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    if-eq p1, v1, :cond_d

    .line 16
    .line 17
    const/16 v1, 0xae

    .line 18
    .line 19
    if-eq p1, v1, :cond_c

    .line 20
    .line 21
    const/16 v1, 0xbb

    .line 22
    .line 23
    if-eq p1, v1, :cond_a

    .line 24
    .line 25
    const/16 v1, 0x4dbb

    .line 26
    .line 27
    const/4 v5, -0x1

    .line 28
    const-wide/16 v6, -0x1

    .line 29
    .line 30
    if-eq p1, v1, :cond_9

    .line 31
    .line 32
    const/16 v1, 0x5035

    .line 33
    .line 34
    const/4 v8, 0x1

    .line 35
    if-eq p1, v1, :cond_8

    .line 36
    .line 37
    const v1, 0x18538067

    .line 38
    .line 39
    .line 40
    if-eq p1, v1, :cond_5

    .line 41
    .line 42
    const p2, 0x1c53bb6b

    .line 43
    .line 44
    .line 45
    if-eq p1, p2, :cond_4

    .line 46
    .line 47
    const p2, 0x1f43b675

    .line 48
    .line 49
    .line 50
    if-eq p1, p2, :cond_2

    .line 51
    .line 52
    const/16 p2, 0xb6

    .line 53
    .line 54
    if-eq p1, p2, :cond_1

    .line 55
    .line 56
    const/16 p2, 0xb7

    .line 57
    .line 58
    if-eq p1, p2, :cond_0

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzH:Z

    .line 62
    .line 63
    if-nez p2, :cond_b

    .line 64
    .line 65
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzs(I)V

    .line 66
    .line 67
    .line 68
    iput v5, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzN:I

    .line 69
    .line 70
    iput-wide v6, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzO:J

    .line 71
    .line 72
    iput-wide v6, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzP:J

    .line 73
    .line 74
    return-void

    .line 75
    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzakg;

    .line 76
    .line 77
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzakg;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzF:Lcom/google/android/gms/internal/ads/zzakg;

    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzH:Z

    .line 84
    .line 85
    if-nez p1, :cond_b

    .line 86
    .line 87
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzk:Z

    .line 88
    .line 89
    if-eqz p1, :cond_3

    .line 90
    .line 91
    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzS:J

    .line 92
    .line 93
    cmp-long p1, p1, v6

    .line 94
    .line 95
    if-eqz p1, :cond_3

    .line 96
    .line 97
    iput-boolean v8, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzR:Z

    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/ads/zzahc;

    .line 101
    .line 102
    iget-wide p2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzC:J

    .line 103
    .line 104
    invoke-direct {p1, p2, p3, v3, v4}, Lcom/google/android/gms/internal/ads/zzahc;-><init>(JJ)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzagd;->zzw(Lcom/google/android/gms/internal/ads/zzahd;)V

    .line 108
    .line 109
    .line 110
    iput-boolean v8, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzH:Z

    .line 111
    .line 112
    return-void

    .line 113
    :cond_4
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzH:Z

    .line 114
    .line 115
    if-nez p1, :cond_b

    .line 116
    .line 117
    iput-boolean v8, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzL:Z

    .line 118
    .line 119
    return-void

    .line 120
    :cond_5
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzz:J

    .line 121
    .line 122
    cmp-long p1, v0, v6

    .line 123
    .line 124
    if-eqz p1, :cond_7

    .line 125
    .line 126
    cmp-long p1, v0, p2

    .line 127
    .line 128
    if-nez p1, :cond_6

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_6
    const-string p1, "Multiple Segment elements not supported"

    .line 132
    .line 133
    invoke-static {p1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    throw p1

    .line 138
    :cond_7
    :goto_0
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzz:J

    .line 139
    .line 140
    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzy:J

    .line 141
    .line 142
    return-void

    .line 143
    :cond_8
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 144
    .line 145
    .line 146
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 147
    .line 148
    iput-boolean v8, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzi:Z

    .line 149
    .line 150
    return-void

    .line 151
    :cond_9
    iput v5, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzI:I

    .line 152
    .line 153
    iput-wide v6, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzJ:J

    .line 154
    .line 155
    return-void

    .line 156
    :cond_a
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzH:Z

    .line 157
    .line 158
    if-nez p2, :cond_b

    .line 159
    .line 160
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzs(I)V

    .line 161
    .line 162
    .line 163
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzM:J

    .line 169
    .line 170
    :cond_b
    :goto_1
    return-void

    .line 171
    :cond_c
    new-instance p1, Lcom/google/android/gms/internal/ads/zzakl;

    .line 172
    .line 173
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzakl;-><init>()V

    .line 174
    .line 175
    .line 176
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 177
    .line 178
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzD:Z

    .line 179
    .line 180
    iput-boolean p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zza:Z

    .line 181
    .line 182
    return-void

    .line 183
    :cond_d
    const/4 p1, 0x0

    .line 184
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzag:Z

    .line 185
    .line 186
    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzah:J

    .line 187
    .line 188
    return-void

    .line 189
    :cond_e
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzq(I)V

    .line 190
    .line 191
    .line 192
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzF:Lcom/google/android/gms/internal/ads/zzakg;

    .line 193
    .line 194
    iput-object v2, p2, Lcom/google/android/gms/internal/ads/zzakg;->zzh:Ljava/lang/String;

    .line 195
    .line 196
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzq(I)V

    .line 197
    .line 198
    .line 199
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzF:Lcom/google/android/gms/internal/ads/zzakg;

    .line 200
    .line 201
    iput-object v2, p1, Lcom/google/android/gms/internal/ads/zzakg;->zzi:Ljava/lang/String;

    .line 202
    .line 203
    return-void
.end method

.method public final zzi(I)V
    .locals 40
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    const/4 v8, 0x1

    .line 7
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzar:Lcom/google/android/gms/internal/ads/zzagd;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/16 v2, 0x80

    .line 13
    .line 14
    if-eq v1, v2, :cond_3c

    .line 15
    .line 16
    const/16 v2, 0xa0

    .line 17
    .line 18
    const/16 v3, 0x8

    .line 19
    .line 20
    const-string v4, "A_OPUS"

    .line 21
    .line 22
    const/4 v5, 0x2

    .line 23
    const-wide/16 v9, 0x0

    .line 24
    .line 25
    if-eq v1, v2, :cond_36

    .line 26
    .line 27
    const/16 v2, 0xae

    .line 28
    .line 29
    const/16 v6, 0x14

    .line 30
    .line 31
    const/4 v11, 0x0

    .line 32
    const/4 v12, -0x1

    .line 33
    if-eq v1, v2, :cond_33

    .line 34
    .line 35
    const/16 v2, 0x45b9

    .line 36
    .line 37
    if-eq v1, v2, :cond_2c

    .line 38
    .line 39
    const/16 v2, 0x4dbb

    .line 40
    .line 41
    const v3, 0x1c53bb6b

    .line 42
    .line 43
    .line 44
    if-eq v1, v2, :cond_2a

    .line 45
    .line 46
    const/16 v2, 0x6240

    .line 47
    .line 48
    if-eq v1, v2, :cond_28

    .line 49
    .line 50
    const/16 v2, 0x6d80

    .line 51
    .line 52
    if-eq v1, v2, :cond_26

    .line 53
    .line 54
    const v2, 0x1549a966

    .line 55
    .line 56
    .line 57
    const-wide/16 v15, -0x1

    .line 58
    .line 59
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    if-eq v1, v2, :cond_24

    .line 65
    .line 66
    const v2, 0x1654ae6b

    .line 67
    .line 68
    .line 69
    if-eq v1, v2, :cond_15

    .line 70
    .line 71
    if-eq v1, v3, :cond_4

    .line 72
    .line 73
    const/16 v2, 0xb6

    .line 74
    .line 75
    if-eq v1, v2, :cond_2

    .line 76
    .line 77
    const/16 v2, 0xb7

    .line 78
    .line 79
    if-eq v1, v2, :cond_0

    .line 80
    .line 81
    goto/16 :goto_1f

    .line 82
    .line 83
    :cond_0
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzH:Z

    .line 84
    .line 85
    if-nez v2, :cond_3d

    .line 86
    .line 87
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzs(I)V

    .line 88
    .line 89
    .line 90
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzM:J

    .line 91
    .line 92
    cmp-long v1, v1, v13

    .line 93
    .line 94
    if-eqz v1, :cond_3d

    .line 95
    .line 96
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzN:I

    .line 97
    .line 98
    if-eq v1, v12, :cond_3d

    .line 99
    .line 100
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzO:J

    .line 101
    .line 102
    cmp-long v2, v2, v15

    .line 103
    .line 104
    if-eqz v2, :cond_3d

    .line 105
    .line 106
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzK:Landroid/util/SparseArray;

    .line 107
    .line 108
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Ljava/util/List;

    .line 113
    .line 114
    if-nez v1, :cond_1

    .line 115
    .line 116
    new-instance v1, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzN:I

    .line 122
    .line 123
    invoke-virtual {v2, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_1
    new-instance v2, Lcom/google/android/gms/internal/ads/zzakj;

    .line 127
    .line 128
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzM:J

    .line 129
    .line 130
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzz:J

    .line 131
    .line 132
    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzO:J

    .line 133
    .line 134
    add-long/2addr v5, v7

    .line 135
    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzP:J

    .line 136
    .line 137
    const/4 v9, 0x0

    .line 138
    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/internal/ads/zzakj;-><init>(JJJ[B)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_2
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzF:Lcom/google/android/gms/internal/ads/zzakg;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/zzakg;->zza:J

    .line 151
    .line 152
    cmp-long v4, v2, v9

    .line 153
    .line 154
    if-eqz v4, :cond_3

    .line 155
    .line 156
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzj:Landroid/util/LongSparseArray;

    .line 157
    .line 158
    invoke-virtual {v4, v2, v3, v1}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :cond_3
    iput-object v11, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzF:Lcom/google/android/gms/internal/ads/zzakg;

    .line 162
    .line 163
    return-void

    .line 164
    :cond_4
    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzH:Z

    .line 165
    .line 166
    if-nez v1, :cond_3d

    .line 167
    .line 168
    move v1, v7

    .line 169
    :goto_0
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzK:Landroid/util/SparseArray;

    .line 170
    .line 171
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-ge v1, v3, :cond_5

    .line 176
    .line 177
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    check-cast v3, Ljava/util/List;

    .line 182
    .line 183
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-nez v3, :cond_8

    .line 188
    .line 189
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzC:J

    .line 190
    .line 191
    cmp-long v1, v3, v13

    .line 192
    .line 193
    if-nez v1, :cond_6

    .line 194
    .line 195
    :cond_5
    move/from16 v26, v12

    .line 196
    .line 197
    move-wide/from16 v24, v13

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_6
    move v1, v7

    .line 201
    :goto_1
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-ge v1, v3, :cond_7

    .line 206
    .line 207
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    check-cast v3, Ljava/util/List;

    .line 212
    .line 213
    invoke-static {v3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 214
    .line 215
    .line 216
    add-int/2addr v1, v8

    .line 217
    goto :goto_1

    .line 218
    :cond_7
    new-instance v15, Lcom/google/android/gms/internal/ads/zzakk;

    .line 219
    .line 220
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzC:J

    .line 221
    .line 222
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzQ:I

    .line 223
    .line 224
    move-wide/from16 v24, v13

    .line 225
    .line 226
    iget-wide v13, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzz:J

    .line 227
    .line 228
    move/from16 v26, v12

    .line 229
    .line 230
    move-wide/from16 v20, v13

    .line 231
    .line 232
    iget-wide v12, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzy:J

    .line 233
    .line 234
    move/from16 v19, v1

    .line 235
    .line 236
    move-object/from16 v16, v2

    .line 237
    .line 238
    move-wide/from16 v17, v3

    .line 239
    .line 240
    move-wide/from16 v22, v12

    .line 241
    .line 242
    invoke-direct/range {v15 .. v23}, Lcom/google/android/gms/internal/ads/zzakk;-><init>(Landroid/util/SparseArray;JIJJ)V

    .line 243
    .line 244
    .line 245
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzar:Lcom/google/android/gms/internal/ads/zzagd;

    .line 246
    .line 247
    invoke-interface {v1, v15}, Lcom/google/android/gms/internal/ads/zzagd;->zzw(Lcom/google/android/gms/internal/ads/zzahd;)V

    .line 248
    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_8
    move/from16 v26, v12

    .line 252
    .line 253
    move-wide/from16 v24, v13

    .line 254
    .line 255
    add-int/2addr v1, v8

    .line 256
    goto :goto_0

    .line 257
    :goto_2
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzar:Lcom/google/android/gms/internal/ads/zzagd;

    .line 258
    .line 259
    new-instance v3, Lcom/google/android/gms/internal/ads/zzahc;

    .line 260
    .line 261
    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzC:J

    .line 262
    .line 263
    invoke-direct {v3, v11, v12, v9, v10}, Lcom/google/android/gms/internal/ads/zzahc;-><init>(JJ)V

    .line 264
    .line 265
    .line 266
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zzagd;->zzw(Lcom/google/android/gms/internal/ads/zzahd;)V

    .line 267
    .line 268
    .line 269
    :goto_3
    iput-boolean v8, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzH:Z

    .line 270
    .line 271
    iput-boolean v7, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzL:Z

    .line 272
    .line 273
    move v1, v7

    .line 274
    :goto_4
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzi:Landroid/util/SparseArray;

    .line 275
    .line 276
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    if-ge v1, v4, :cond_14

    .line 281
    .line 282
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    check-cast v3, Lcom/google/android/gms/internal/ads/zzakl;

    .line 287
    .line 288
    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzC:J

    .line 289
    .line 290
    iget-wide v13, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzz:J

    .line 291
    .line 292
    move-wide/from16 v17, v9

    .line 293
    .line 294
    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzy:J

    .line 295
    .line 296
    iget v4, v3, Lcom/google/android/gms/internal/ads/zzakl;->zzf:I

    .line 297
    .line 298
    if-eq v4, v5, :cond_a

    .line 299
    .line 300
    :cond_9
    move/from16 p1, v1

    .line 301
    .line 302
    move-object/from16 v16, v2

    .line 303
    .line 304
    move/from16 v22, v7

    .line 305
    .line 306
    goto/16 :goto_c

    .line 307
    .line 308
    :cond_a
    iget v4, v3, Lcom/google/android/gms/internal/ads/zzakl;->zzd:I

    .line 309
    .line 310
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    check-cast v4, Ljava/util/List;

    .line 315
    .line 316
    if-eqz v4, :cond_9

    .line 317
    .line 318
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 319
    .line 320
    .line 321
    move-result v15

    .line 322
    if-nez v15, :cond_9

    .line 323
    .line 324
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 325
    .line 326
    .line 327
    move-result v15

    .line 328
    if-eqz v15, :cond_b

    .line 329
    .line 330
    move/from16 p1, v1

    .line 331
    .line 332
    move-object/from16 v16, v2

    .line 333
    .line 334
    move/from16 v22, v7

    .line 335
    .line 336
    :goto_5
    move-wide/from16 v1, v24

    .line 337
    .line 338
    goto/16 :goto_a

    .line 339
    .line 340
    :cond_b
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 341
    .line 342
    .line 343
    move-result v15

    .line 344
    invoke-static {v15, v6}, Ljava/lang/Math;->min(II)I

    .line 345
    .line 346
    .line 347
    move-result v15

    .line 348
    const-wide/16 v19, 0x0

    .line 349
    .line 350
    move/from16 v22, v7

    .line 351
    .line 352
    move/from16 v6, v26

    .line 353
    .line 354
    :goto_6
    if-ge v7, v15, :cond_c

    .line 355
    .line 356
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v16

    .line 360
    check-cast v16, Lcom/google/android/gms/internal/ads/zzakj;

    .line 361
    .line 362
    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/zzakj;->zza()J

    .line 363
    .line 364
    .line 365
    move-result-wide v27

    .line 366
    const-wide/32 v29, 0x989680

    .line 367
    .line 368
    .line 369
    cmp-long v23, v27, v29

    .line 370
    .line 371
    if-lez v23, :cond_d

    .line 372
    .line 373
    :cond_c
    move/from16 p1, v1

    .line 374
    .line 375
    move-object/from16 v16, v2

    .line 376
    .line 377
    move/from16 v1, v26

    .line 378
    .line 379
    goto :goto_9

    .line 380
    :cond_d
    add-int/lit8 v5, v7, 0x1

    .line 381
    .line 382
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 383
    .line 384
    .line 385
    move-result v27

    .line 386
    add-int/lit8 v8, v27, -0x1

    .line 387
    .line 388
    if-ge v7, v8, :cond_e

    .line 389
    .line 390
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v8

    .line 394
    check-cast v8, Lcom/google/android/gms/internal/ads/zzakj;

    .line 395
    .line 396
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzakj;->zzb()J

    .line 397
    .line 398
    .line 399
    move-result-wide v29

    .line 400
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzakj;->zzc()J

    .line 401
    .line 402
    .line 403
    move-result-wide v31

    .line 404
    add-long v29, v29, v31

    .line 405
    .line 406
    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/zzakj;->zzb()J

    .line 407
    .line 408
    .line 409
    move-result-wide v31

    .line 410
    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/zzakj;->zzc()J

    .line 411
    .line 412
    .line 413
    move-result-wide v33

    .line 414
    add-long v31, v31, v33

    .line 415
    .line 416
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzakj;->zza()J

    .line 417
    .line 418
    .line 419
    move-result-wide v33

    .line 420
    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/zzakj;->zza()J

    .line 421
    .line 422
    .line 423
    move-result-wide v35

    .line 424
    sub-long v33, v33, v35

    .line 425
    .line 426
    :goto_7
    sub-long v29, v29, v31

    .line 427
    .line 428
    move/from16 p1, v1

    .line 429
    .line 430
    move-object/from16 v16, v2

    .line 431
    .line 432
    move/from16 v27, v7

    .line 433
    .line 434
    move-wide/from16 v1, v29

    .line 435
    .line 436
    move-wide/from16 v7, v33

    .line 437
    .line 438
    goto :goto_8

    .line 439
    :cond_e
    add-long v29, v13, v9

    .line 440
    .line 441
    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/zzakj;->zzb()J

    .line 442
    .line 443
    .line 444
    move-result-wide v31

    .line 445
    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/zzakj;->zzc()J

    .line 446
    .line 447
    .line 448
    move-result-wide v33

    .line 449
    add-long v31, v31, v33

    .line 450
    .line 451
    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/internal/ads/zzakj;->zza()J

    .line 452
    .line 453
    .line 454
    move-result-wide v33

    .line 455
    sub-long v33, v11, v33

    .line 456
    .line 457
    goto :goto_7

    .line 458
    :goto_8
    cmp-long v29, v7, v17

    .line 459
    .line 460
    if-lez v29, :cond_f

    .line 461
    .line 462
    long-to-double v1, v1

    .line 463
    long-to-double v7, v7

    .line 464
    div-double/2addr v1, v7

    .line 465
    cmpl-double v7, v1, v19

    .line 466
    .line 467
    if-lez v7, :cond_f

    .line 468
    .line 469
    move-wide/from16 v19, v1

    .line 470
    .line 471
    move/from16 v6, v27

    .line 472
    .line 473
    :cond_f
    move/from16 v1, p1

    .line 474
    .line 475
    move v7, v5

    .line 476
    move-object/from16 v2, v16

    .line 477
    .line 478
    const/4 v5, 0x2

    .line 479
    const/4 v8, 0x1

    .line 480
    goto :goto_6

    .line 481
    :goto_9
    if-ne v6, v1, :cond_10

    .line 482
    .line 483
    goto/16 :goto_5

    .line 484
    .line 485
    :cond_10
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    check-cast v1, Lcom/google/android/gms/internal/ads/zzakj;

    .line 490
    .line 491
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzakj;->zza()J

    .line 492
    .line 493
    .line 494
    move-result-wide v1

    .line 495
    :goto_a
    cmp-long v4, v1, v24

    .line 496
    .line 497
    if-eqz v4, :cond_12

    .line 498
    .line 499
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzakl;->zzaa:Lcom/google/android/gms/internal/ads/zzv;

    .line 500
    .line 501
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzv;->zzl:Lcom/google/android/gms/internal/ads/zzap;

    .line 505
    .line 506
    new-instance v5, Lcom/google/android/gms/internal/ads/zzajd;

    .line 507
    .line 508
    invoke-direct {v5, v1, v2}, Lcom/google/android/gms/internal/ads/zzajd;-><init>(J)V

    .line 509
    .line 510
    .line 511
    if-nez v4, :cond_11

    .line 512
    .line 513
    new-instance v1, Lcom/google/android/gms/internal/ads/zzap;

    .line 514
    .line 515
    const/4 v2, 0x1

    .line 516
    new-array v4, v2, [Lcom/google/android/gms/internal/ads/zzao;

    .line 517
    .line 518
    aput-object v5, v4, v22

    .line 519
    .line 520
    move-wide/from16 v5, v24

    .line 521
    .line 522
    invoke-direct {v1, v5, v6, v4}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    .line 523
    .line 524
    .line 525
    goto :goto_b

    .line 526
    :cond_11
    const/4 v2, 0x1

    .line 527
    new-array v1, v2, [Lcom/google/android/gms/internal/ads/zzao;

    .line 528
    .line 529
    aput-object v5, v1, v22

    .line 530
    .line 531
    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/zzap;->zzg([Lcom/google/android/gms/internal/ads/zzao;)Lcom/google/android/gms/internal/ads/zzap;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    :goto_b
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzakl;->zzaa:Lcom/google/android/gms/internal/ads/zzv;

    .line 536
    .line 537
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzl(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzt;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    iput-object v1, v3, Lcom/google/android/gms/internal/ads/zzakl;->zzaa:Lcom/google/android/gms/internal/ads/zzv;

    .line 549
    .line 550
    :cond_12
    :goto_c
    iget-boolean v1, v3, Lcom/google/android/gms/internal/ads/zzakl;->zzW:Z

    .line 551
    .line 552
    if-nez v1, :cond_13

    .line 553
    .line 554
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzakl;->zzb()V

    .line 555
    .line 556
    .line 557
    iget-object v1, v3, Lcom/google/android/gms/internal/ads/zzakl;->zzZ:Lcom/google/android/gms/internal/ads/zzahm;

    .line 558
    .line 559
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzakl;->zzaa:Lcom/google/android/gms/internal/ads/zzv;

    .line 560
    .line 561
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 565
    .line 566
    .line 567
    :cond_13
    const/16 v28, 0x1

    .line 568
    .line 569
    add-int/lit8 v1, p1, 0x1

    .line 570
    .line 571
    move-object/from16 v2, v16

    .line 572
    .line 573
    move-wide/from16 v9, v17

    .line 574
    .line 575
    move/from16 v7, v22

    .line 576
    .line 577
    const/4 v5, 0x2

    .line 578
    const/16 v6, 0x14

    .line 579
    .line 580
    const/4 v8, 0x1

    .line 581
    const-wide v24, -0x7fffffffffffffffL    # -4.9E-324

    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    const/16 v26, -0x1

    .line 587
    .line 588
    goto/16 :goto_4

    .line 589
    .line 590
    :cond_14
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzakm;->zzC()V

    .line 591
    .line 592
    .line 593
    return-void

    .line 594
    :cond_15
    move/from16 v22, v7

    .line 595
    .line 596
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzi:Landroid/util/SparseArray;

    .line 597
    .line 598
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 599
    .line 600
    .line 601
    move-result v2

    .line 602
    if-eqz v2, :cond_23

    .line 603
    .line 604
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzk:Z

    .line 605
    .line 606
    if-eqz v2, :cond_16

    .line 607
    .line 608
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzS:J

    .line 609
    .line 610
    cmp-long v2, v2, v15

    .line 611
    .line 612
    if-nez v2, :cond_17

    .line 613
    .line 614
    :cond_16
    const/4 v2, 0x1

    .line 615
    goto :goto_d

    .line 616
    :cond_17
    move/from16 v2, v22

    .line 617
    .line 618
    :goto_d
    move/from16 v4, v22

    .line 619
    .line 620
    const/4 v3, -0x1

    .line 621
    const/4 v5, -0x1

    .line 622
    const/4 v6, -0x1

    .line 623
    const/4 v7, -0x1

    .line 624
    :goto_e
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 625
    .line 626
    .line 627
    move-result v8

    .line 628
    if-ge v4, v8, :cond_1d

    .line 629
    .line 630
    invoke-virtual {v1, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v8

    .line 634
    check-cast v8, Lcom/google/android/gms/internal/ads/zzakl;

    .line 635
    .line 636
    iget v9, v8, Lcom/google/android/gms/internal/ads/zzakl;->zzf:I

    .line 637
    .line 638
    const/4 v10, 0x2

    .line 639
    if-ne v9, v10, :cond_19

    .line 640
    .line 641
    iget-boolean v9, v8, Lcom/google/android/gms/internal/ads/zzakl;->zzY:Z

    .line 642
    .line 643
    if-eqz v9, :cond_18

    .line 644
    .line 645
    iget v5, v8, Lcom/google/android/gms/internal/ads/zzakl;->zzd:I

    .line 646
    .line 647
    :cond_18
    const/4 v10, -0x1

    .line 648
    if-ne v6, v10, :cond_1b

    .line 649
    .line 650
    iget v6, v8, Lcom/google/android/gms/internal/ads/zzakl;->zzd:I

    .line 651
    .line 652
    goto :goto_f

    .line 653
    :cond_19
    const/4 v10, -0x1

    .line 654
    const/4 v11, 0x1

    .line 655
    if-ne v9, v11, :cond_1b

    .line 656
    .line 657
    iget-boolean v9, v8, Lcom/google/android/gms/internal/ads/zzakl;->zzY:Z

    .line 658
    .line 659
    if-eqz v9, :cond_1a

    .line 660
    .line 661
    iget v7, v8, Lcom/google/android/gms/internal/ads/zzakl;->zzd:I

    .line 662
    .line 663
    :cond_1a
    if-ne v3, v10, :cond_1b

    .line 664
    .line 665
    iget v3, v8, Lcom/google/android/gms/internal/ads/zzakl;->zzd:I

    .line 666
    .line 667
    :cond_1b
    :goto_f
    if-eqz v2, :cond_1c

    .line 668
    .line 669
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzakl;->zzb()V

    .line 670
    .line 671
    .line 672
    iget-boolean v9, v8, Lcom/google/android/gms/internal/ads/zzakl;->zzW:Z

    .line 673
    .line 674
    if-nez v9, :cond_1c

    .line 675
    .line 676
    iget-object v9, v8, Lcom/google/android/gms/internal/ads/zzakl;->zzZ:Lcom/google/android/gms/internal/ads/zzahm;

    .line 677
    .line 678
    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzakl;->zzaa:Lcom/google/android/gms/internal/ads/zzv;

    .line 679
    .line 680
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    invoke-interface {v9, v8}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 684
    .line 685
    .line 686
    :cond_1c
    const/16 v28, 0x1

    .line 687
    .line 688
    add-int/lit8 v4, v4, 0x1

    .line 689
    .line 690
    goto :goto_e

    .line 691
    :cond_1d
    const/4 v10, -0x1

    .line 692
    if-eq v5, v10, :cond_1e

    .line 693
    .line 694
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzQ:I

    .line 695
    .line 696
    goto :goto_11

    .line 697
    :cond_1e
    if-eq v6, v10, :cond_1f

    .line 698
    .line 699
    iput v6, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzQ:I

    .line 700
    .line 701
    goto :goto_11

    .line 702
    :cond_1f
    if-eq v7, v10, :cond_20

    .line 703
    .line 704
    iput v7, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzQ:I

    .line 705
    .line 706
    goto :goto_11

    .line 707
    :cond_20
    if-eq v3, v10, :cond_21

    .line 708
    .line 709
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzQ:I

    .line 710
    .line 711
    goto :goto_11

    .line 712
    :cond_21
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 713
    .line 714
    .line 715
    move-result v3

    .line 716
    if-lez v3, :cond_22

    .line 717
    .line 718
    move/from16 v3, v22

    .line 719
    .line 720
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    check-cast v1, Lcom/google/android/gms/internal/ads/zzakl;

    .line 725
    .line 726
    iget v12, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzd:I

    .line 727
    .line 728
    goto :goto_10

    .line 729
    :cond_22
    const/4 v12, -0x1

    .line 730
    :goto_10
    iput v12, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzQ:I

    .line 731
    .line 732
    :goto_11
    if-eqz v2, :cond_3d

    .line 733
    .line 734
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzakm;->zzC()V

    .line 735
    .line 736
    .line 737
    return-void

    .line 738
    :cond_23
    const-string v1, "No valid tracks were found"

    .line 739
    .line 740
    invoke-static {v1, v11}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 741
    .line 742
    .line 743
    move-result-object v1

    .line 744
    throw v1

    .line 745
    :cond_24
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzA:J

    .line 746
    .line 747
    const-wide v24, -0x7fffffffffffffffL    # -4.9E-324

    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    cmp-long v1, v1, v24

    .line 753
    .line 754
    if-nez v1, :cond_25

    .line 755
    .line 756
    const-wide/32 v1, 0xf4240

    .line 757
    .line 758
    .line 759
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzA:J

    .line 760
    .line 761
    :cond_25
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzB:J

    .line 762
    .line 763
    cmp-long v3, v1, v24

    .line 764
    .line 765
    if-eqz v3, :cond_3d

    .line 766
    .line 767
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzakm;->zzA(J)J

    .line 768
    .line 769
    .line 770
    move-result-wide v1

    .line 771
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzC:J

    .line 772
    .line 773
    return-void

    .line 774
    :cond_26
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 775
    .line 776
    .line 777
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 778
    .line 779
    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzi:Z

    .line 780
    .line 781
    if-eqz v2, :cond_3d

    .line 782
    .line 783
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzj:[B

    .line 784
    .line 785
    if-nez v1, :cond_27

    .line 786
    .line 787
    goto/16 :goto_1f

    .line 788
    .line 789
    :cond_27
    const-string v1, "Combining encryption and compression is not supported"

    .line 790
    .line 791
    invoke-static {v1, v11}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    throw v1

    .line 796
    :cond_28
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 797
    .line 798
    .line 799
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 800
    .line 801
    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzi:Z

    .line 802
    .line 803
    if-eqz v2, :cond_3d

    .line 804
    .line 805
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzk:Lcom/google/android/gms/internal/ads/zzahl;

    .line 806
    .line 807
    if-eqz v2, :cond_29

    .line 808
    .line 809
    new-instance v2, Lcom/google/android/gms/internal/ads/zzq;

    .line 810
    .line 811
    new-instance v3, Lcom/google/android/gms/internal/ads/zzp;

    .line 812
    .line 813
    sget-object v4, Lcom/google/android/gms/internal/ads/zzg;->zza:Ljava/util/UUID;

    .line 814
    .line 815
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 816
    .line 817
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzakl;->zzk:Lcom/google/android/gms/internal/ads/zzahl;

    .line 818
    .line 819
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzahl;->zzb:[B

    .line 820
    .line 821
    const-string v6, "video/webm"

    .line 822
    .line 823
    invoke-direct {v3, v4, v11, v6, v5}, Lcom/google/android/gms/internal/ads/zzp;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 824
    .line 825
    .line 826
    const/4 v4, 0x1

    .line 827
    new-array v4, v4, [Lcom/google/android/gms/internal/ads/zzp;

    .line 828
    .line 829
    const/16 v22, 0x0

    .line 830
    .line 831
    aput-object v3, v4, v22

    .line 832
    .line 833
    invoke-direct {v2, v11, v4}, Lcom/google/android/gms/internal/ads/zzq;-><init>(Ljava/lang/String;[Lcom/google/android/gms/internal/ads/zzp;)V

    .line 834
    .line 835
    .line 836
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzm:Lcom/google/android/gms/internal/ads/zzq;

    .line 837
    .line 838
    return-void

    .line 839
    :cond_29
    const-string v1, "Encrypted Track found but ContentEncKeyID was not found"

    .line 840
    .line 841
    invoke-static {v1, v11}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    throw v1

    .line 846
    :cond_2a
    const-wide/16 v15, -0x1

    .line 847
    .line 848
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzI:I

    .line 849
    .line 850
    const/4 v10, -0x1

    .line 851
    if-eq v1, v10, :cond_2b

    .line 852
    .line 853
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzJ:J

    .line 854
    .line 855
    cmp-long v2, v4, v15

    .line 856
    .line 857
    if-eqz v2, :cond_2b

    .line 858
    .line 859
    if-ne v1, v3, :cond_3d

    .line 860
    .line 861
    iput-wide v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzS:J

    .line 862
    .line 863
    return-void

    .line 864
    :cond_2b
    const-string v1, "Mandatory element SeekID or SeekPosition not found"

    .line 865
    .line 866
    invoke-static {v1, v11}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 867
    .line 868
    .line 869
    move-result-object v1

    .line 870
    throw v1

    .line 871
    :cond_2c
    move-wide/from16 v17, v9

    .line 872
    .line 873
    const/4 v3, 0x0

    .line 874
    :goto_12
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzi:Landroid/util/SparseArray;

    .line 875
    .line 876
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 877
    .line 878
    .line 879
    move-result v2

    .line 880
    if-ge v3, v2, :cond_3d

    .line 881
    .line 882
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object v1

    .line 886
    check-cast v1, Lcom/google/android/gms/internal/ads/zzakl;

    .line 887
    .line 888
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzj:Landroid/util/LongSparseArray;

    .line 889
    .line 890
    new-instance v4, Ljava/util/ArrayList;

    .line 891
    .line 892
    invoke-virtual {v2}, Landroid/util/LongSparseArray;->size()I

    .line 893
    .line 894
    .line 895
    move-result v5

    .line 896
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 897
    .line 898
    .line 899
    const/4 v5, 0x0

    .line 900
    :goto_13
    invoke-virtual {v2}, Landroid/util/LongSparseArray;->size()I

    .line 901
    .line 902
    .line 903
    move-result v6

    .line 904
    if-ge v5, v6, :cond_30

    .line 905
    .line 906
    invoke-virtual {v2, v5}, Landroid/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v6

    .line 910
    check-cast v6, Lcom/google/android/gms/internal/ads/zzakg;

    .line 911
    .line 912
    iget-wide v7, v6, Lcom/google/android/gms/internal/ads/zzakg;->zze:J

    .line 913
    .line 914
    cmp-long v9, v7, v17

    .line 915
    .line 916
    if-eqz v9, :cond_2e

    .line 917
    .line 918
    iget-wide v9, v1, Lcom/google/android/gms/internal/ads/zzakl;->zze:J

    .line 919
    .line 920
    cmp-long v7, v7, v9

    .line 921
    .line 922
    if-nez v7, :cond_2d

    .line 923
    .line 924
    goto :goto_15

    .line 925
    :cond_2d
    :goto_14
    const/16 v28, 0x1

    .line 926
    .line 927
    goto :goto_16

    .line 928
    :cond_2e
    :goto_15
    new-instance v7, Lcom/google/android/gms/internal/ads/zzaiy;

    .line 929
    .line 930
    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzaiy;-><init>()V

    .line 931
    .line 932
    .line 933
    iget-wide v8, v6, Lcom/google/android/gms/internal/ads/zzakg;->zzb:J

    .line 934
    .line 935
    invoke-static {v8, v9}, Lcom/google/android/gms/internal/ads/zzfm;->zzr(J)J

    .line 936
    .line 937
    .line 938
    move-result-wide v8

    .line 939
    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/internal/ads/zzaiy;->zza(J)Lcom/google/android/gms/internal/ads/zzaiy;

    .line 940
    .line 941
    .line 942
    iget-wide v8, v6, Lcom/google/android/gms/internal/ads/zzakg;->zzc:J

    .line 943
    .line 944
    invoke-static {v8, v9}, Lcom/google/android/gms/internal/ads/zzfm;->zzr(J)J

    .line 945
    .line 946
    .line 947
    move-result-wide v8

    .line 948
    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/internal/ads/zzaiy;->zzb(J)Lcom/google/android/gms/internal/ads/zzaiy;

    .line 949
    .line 950
    .line 951
    iget-boolean v8, v6, Lcom/google/android/gms/internal/ads/zzakg;->zzd:Z

    .line 952
    .line 953
    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/ads/zzaiy;->zzc(Z)Lcom/google/android/gms/internal/ads/zzaiy;

    .line 954
    .line 955
    .line 956
    iget-object v8, v6, Lcom/google/android/gms/internal/ads/zzakg;->zzf:Ljava/lang/String;

    .line 957
    .line 958
    if-eqz v8, :cond_2f

    .line 959
    .line 960
    new-instance v8, Lcom/google/android/gms/internal/ads/zzx;

    .line 961
    .line 962
    iget-object v9, v6, Lcom/google/android/gms/internal/ads/zzakg;->zzg:Ljava/lang/String;

    .line 963
    .line 964
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzakg;->zzf:Ljava/lang/String;

    .line 965
    .line 966
    invoke-direct {v8, v9, v6}, Lcom/google/android/gms/internal/ads/zzx;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 967
    .line 968
    .line 969
    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/ads/zzaiy;->zzd(Lcom/google/android/gms/internal/ads/zzx;)Lcom/google/android/gms/internal/ads/zzaiy;

    .line 970
    .line 971
    .line 972
    :cond_2f
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzaiy;->zze()Lcom/google/android/gms/internal/ads/zzaiz;

    .line 973
    .line 974
    .line 975
    move-result-object v6

    .line 976
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 977
    .line 978
    .line 979
    goto :goto_14

    .line 980
    :goto_16
    add-int/lit8 v5, v5, 0x1

    .line 981
    .line 982
    goto :goto_13

    .line 983
    :cond_30
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 984
    .line 985
    .line 986
    move-result v2

    .line 987
    if-nez v2, :cond_32

    .line 988
    .line 989
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzaa:Lcom/google/android/gms/internal/ads/zzv;

    .line 990
    .line 991
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 992
    .line 993
    .line 994
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 995
    .line 996
    .line 997
    move-result-object v5

    .line 998
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzv;->zzl:Lcom/google/android/gms/internal/ads/zzap;

    .line 999
    .line 1000
    if-eqz v2, :cond_31

    .line 1001
    .line 1002
    const/4 v6, 0x0

    .line 1003
    new-array v7, v6, [Lcom/google/android/gms/internal/ads/zzaiz;

    .line 1004
    .line 1005
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v4

    .line 1009
    check-cast v4, [Lcom/google/android/gms/internal/ads/zzao;

    .line 1010
    .line 1011
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzap;->zzg([Lcom/google/android/gms/internal/ads/zzao;)Lcom/google/android/gms/internal/ads/zzap;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v2

    .line 1015
    goto :goto_17

    .line 1016
    :cond_31
    new-instance v2, Lcom/google/android/gms/internal/ads/zzap;

    .line 1017
    .line 1018
    invoke-direct {v2, v4}, Lcom/google/android/gms/internal/ads/zzap;-><init>(Ljava/util/List;)V

    .line 1019
    .line 1020
    .line 1021
    :goto_17
    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/ads/zzt;->zzl(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzt;

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v2

    .line 1028
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzaa:Lcom/google/android/gms/internal/ads/zzv;

    .line 1029
    .line 1030
    :cond_32
    const/16 v28, 0x1

    .line 1031
    .line 1032
    add-int/lit8 v3, v3, 0x1

    .line 1033
    .line 1034
    goto/16 :goto_12

    .line 1035
    .line 1036
    :cond_33
    move v10, v12

    .line 1037
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 1038
    .line 1039
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1040
    .line 1041
    .line 1042
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzc:Ljava/lang/String;

    .line 1043
    .line 1044
    if-eqz v2, :cond_35

    .line 1045
    .line 1046
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 1047
    .line 1048
    .line 1049
    move-result v5

    .line 1050
    sparse-switch v5, :sswitch_data_0

    .line 1051
    .line 1052
    .line 1053
    goto/16 :goto_18

    .line 1054
    .line 1055
    :sswitch_0
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1056
    .line 1057
    .line 1058
    move-result v2

    .line 1059
    if-eqz v2, :cond_34

    .line 1060
    .line 1061
    const/16 v7, 0xb

    .line 1062
    .line 1063
    goto/16 :goto_19

    .line 1064
    .line 1065
    :sswitch_1
    const-string v3, "A_FLAC"

    .line 1066
    .line 1067
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1068
    .line 1069
    .line 1070
    move-result v2

    .line 1071
    if-eqz v2, :cond_34

    .line 1072
    .line 1073
    const/16 v7, 0x16

    .line 1074
    .line 1075
    goto/16 :goto_19

    .line 1076
    .line 1077
    :sswitch_2
    const-string v3, "A_EAC3"

    .line 1078
    .line 1079
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1080
    .line 1081
    .line 1082
    move-result v2

    .line 1083
    if-eqz v2, :cond_34

    .line 1084
    .line 1085
    const/16 v7, 0x11

    .line 1086
    .line 1087
    goto/16 :goto_19

    .line 1088
    .line 1089
    :sswitch_3
    const-string v3, "V_MPEG2"

    .line 1090
    .line 1091
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1092
    .line 1093
    .line 1094
    move-result v2

    .line 1095
    if-eqz v2, :cond_34

    .line 1096
    .line 1097
    const/4 v7, 0x3

    .line 1098
    goto/16 :goto_19

    .line 1099
    .line 1100
    :sswitch_4
    const-string v3, "S_TEXT/UTF8"

    .line 1101
    .line 1102
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1103
    .line 1104
    .line 1105
    move-result v2

    .line 1106
    if-eqz v2, :cond_34

    .line 1107
    .line 1108
    const/16 v7, 0x1b

    .line 1109
    .line 1110
    goto/16 :goto_19

    .line 1111
    .line 1112
    :sswitch_5
    const-string v3, "S_TEXT/WEBVTT"

    .line 1113
    .line 1114
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1115
    .line 1116
    .line 1117
    move-result v2

    .line 1118
    if-eqz v2, :cond_34

    .line 1119
    .line 1120
    const/16 v7, 0x1e

    .line 1121
    .line 1122
    goto/16 :goto_19

    .line 1123
    .line 1124
    :sswitch_6
    const-string v4, "V_MPEGH/ISO/HEVC"

    .line 1125
    .line 1126
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1127
    .line 1128
    .line 1129
    move-result v2

    .line 1130
    if-eqz v2, :cond_34

    .line 1131
    .line 1132
    move v7, v3

    .line 1133
    goto/16 :goto_19

    .line 1134
    .line 1135
    :sswitch_7
    const-string v3, "S_TEXT/SSA"

    .line 1136
    .line 1137
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1138
    .line 1139
    .line 1140
    move-result v2

    .line 1141
    if-eqz v2, :cond_34

    .line 1142
    .line 1143
    const/16 v7, 0x1d

    .line 1144
    .line 1145
    goto/16 :goto_19

    .line 1146
    .line 1147
    :sswitch_8
    const-string v3, "S_TEXT/ASS"

    .line 1148
    .line 1149
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1150
    .line 1151
    .line 1152
    move-result v2

    .line 1153
    if-eqz v2, :cond_34

    .line 1154
    .line 1155
    const/16 v7, 0x1c

    .line 1156
    .line 1157
    goto/16 :goto_19

    .line 1158
    .line 1159
    :sswitch_9
    const-string v3, "A_PCM/INT/LIT"

    .line 1160
    .line 1161
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1162
    .line 1163
    .line 1164
    move-result v2

    .line 1165
    if-eqz v2, :cond_34

    .line 1166
    .line 1167
    const/16 v7, 0x18

    .line 1168
    .line 1169
    goto/16 :goto_19

    .line 1170
    .line 1171
    :sswitch_a
    const-string v3, "A_PCM/INT/BIG"

    .line 1172
    .line 1173
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1174
    .line 1175
    .line 1176
    move-result v2

    .line 1177
    if-eqz v2, :cond_34

    .line 1178
    .line 1179
    const/16 v7, 0x19

    .line 1180
    .line 1181
    goto/16 :goto_19

    .line 1182
    .line 1183
    :sswitch_b
    const-string v3, "A_PCM/FLOAT/IEEE"

    .line 1184
    .line 1185
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1186
    .line 1187
    .line 1188
    move-result v2

    .line 1189
    if-eqz v2, :cond_34

    .line 1190
    .line 1191
    const/16 v7, 0x1a

    .line 1192
    .line 1193
    goto/16 :goto_19

    .line 1194
    .line 1195
    :sswitch_c
    const-string v3, "A_DTS/EXPRESS"

    .line 1196
    .line 1197
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1198
    .line 1199
    .line 1200
    move-result v2

    .line 1201
    if-eqz v2, :cond_34

    .line 1202
    .line 1203
    const/16 v7, 0x14

    .line 1204
    .line 1205
    goto/16 :goto_19

    .line 1206
    .line 1207
    :sswitch_d
    const-string v3, "V_THEORA"

    .line 1208
    .line 1209
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1210
    .line 1211
    .line 1212
    move-result v2

    .line 1213
    if-eqz v2, :cond_34

    .line 1214
    .line 1215
    const/16 v7, 0xa

    .line 1216
    .line 1217
    goto/16 :goto_19

    .line 1218
    .line 1219
    :sswitch_e
    const-string v3, "S_HDMV/PGS"

    .line 1220
    .line 1221
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1222
    .line 1223
    .line 1224
    move-result v2

    .line 1225
    if-eqz v2, :cond_34

    .line 1226
    .line 1227
    const/16 v7, 0x20

    .line 1228
    .line 1229
    goto/16 :goto_19

    .line 1230
    .line 1231
    :sswitch_f
    const-string v3, "V_VP9"

    .line 1232
    .line 1233
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1234
    .line 1235
    .line 1236
    move-result v2

    .line 1237
    if-eqz v2, :cond_34

    .line 1238
    .line 1239
    const/4 v7, 0x1

    .line 1240
    goto/16 :goto_19

    .line 1241
    .line 1242
    :sswitch_10
    const-string v3, "V_VP8"

    .line 1243
    .line 1244
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1245
    .line 1246
    .line 1247
    move-result v2

    .line 1248
    if-eqz v2, :cond_34

    .line 1249
    .line 1250
    const/4 v7, 0x0

    .line 1251
    goto/16 :goto_19

    .line 1252
    .line 1253
    :sswitch_11
    const-string v3, "V_AV1"

    .line 1254
    .line 1255
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1256
    .line 1257
    .line 1258
    move-result v2

    .line 1259
    if-eqz v2, :cond_34

    .line 1260
    .line 1261
    const/4 v7, 0x2

    .line 1262
    goto/16 :goto_19

    .line 1263
    .line 1264
    :sswitch_12
    const-string v3, "A_DTS"

    .line 1265
    .line 1266
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1267
    .line 1268
    .line 1269
    move-result v2

    .line 1270
    if-eqz v2, :cond_34

    .line 1271
    .line 1272
    const/16 v7, 0x13

    .line 1273
    .line 1274
    goto/16 :goto_19

    .line 1275
    .line 1276
    :sswitch_13
    const-string v3, "A_AC3"

    .line 1277
    .line 1278
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1279
    .line 1280
    .line 1281
    move-result v2

    .line 1282
    if-eqz v2, :cond_34

    .line 1283
    .line 1284
    const/16 v7, 0x10

    .line 1285
    .line 1286
    goto/16 :goto_19

    .line 1287
    .line 1288
    :sswitch_14
    const-string v3, "A_AAC"

    .line 1289
    .line 1290
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1291
    .line 1292
    .line 1293
    move-result v2

    .line 1294
    if-eqz v2, :cond_34

    .line 1295
    .line 1296
    const/16 v7, 0xd

    .line 1297
    .line 1298
    goto/16 :goto_19

    .line 1299
    .line 1300
    :sswitch_15
    const-string v3, "A_DTS/LOSSLESS"

    .line 1301
    .line 1302
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1303
    .line 1304
    .line 1305
    move-result v2

    .line 1306
    if-eqz v2, :cond_34

    .line 1307
    .line 1308
    const/16 v7, 0x15

    .line 1309
    .line 1310
    goto/16 :goto_19

    .line 1311
    .line 1312
    :sswitch_16
    const-string v3, "S_VOBSUB"

    .line 1313
    .line 1314
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1315
    .line 1316
    .line 1317
    move-result v2

    .line 1318
    if-eqz v2, :cond_34

    .line 1319
    .line 1320
    const/16 v7, 0x1f

    .line 1321
    .line 1322
    goto/16 :goto_19

    .line 1323
    .line 1324
    :sswitch_17
    const-string v3, "V_MPEG4/ISO/AVC"

    .line 1325
    .line 1326
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1327
    .line 1328
    .line 1329
    move-result v2

    .line 1330
    if-eqz v2, :cond_34

    .line 1331
    .line 1332
    const/4 v7, 0x7

    .line 1333
    goto/16 :goto_19

    .line 1334
    .line 1335
    :sswitch_18
    const-string v3, "V_MPEG4/ISO/ASP"

    .line 1336
    .line 1337
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1338
    .line 1339
    .line 1340
    move-result v2

    .line 1341
    if-eqz v2, :cond_34

    .line 1342
    .line 1343
    const/4 v7, 0x5

    .line 1344
    goto/16 :goto_19

    .line 1345
    .line 1346
    :sswitch_19
    const-string v3, "S_DVBSUB"

    .line 1347
    .line 1348
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1349
    .line 1350
    .line 1351
    move-result v2

    .line 1352
    if-eqz v2, :cond_34

    .line 1353
    .line 1354
    const/16 v7, 0x21

    .line 1355
    .line 1356
    goto :goto_19

    .line 1357
    :sswitch_1a
    const-string v3, "V_MS/VFW/FOURCC"

    .line 1358
    .line 1359
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1360
    .line 1361
    .line 1362
    move-result v2

    .line 1363
    if-eqz v2, :cond_34

    .line 1364
    .line 1365
    const/16 v7, 0x9

    .line 1366
    .line 1367
    goto :goto_19

    .line 1368
    :sswitch_1b
    const-string v3, "A_MPEG/L3"

    .line 1369
    .line 1370
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1371
    .line 1372
    .line 1373
    move-result v2

    .line 1374
    if-eqz v2, :cond_34

    .line 1375
    .line 1376
    const/16 v7, 0xf

    .line 1377
    .line 1378
    goto :goto_19

    .line 1379
    :sswitch_1c
    const-string v3, "A_MPEG/L2"

    .line 1380
    .line 1381
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1382
    .line 1383
    .line 1384
    move-result v2

    .line 1385
    if-eqz v2, :cond_34

    .line 1386
    .line 1387
    const/16 v7, 0xe

    .line 1388
    .line 1389
    goto :goto_19

    .line 1390
    :sswitch_1d
    const-string v3, "A_VORBIS"

    .line 1391
    .line 1392
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1393
    .line 1394
    .line 1395
    move-result v2

    .line 1396
    if-eqz v2, :cond_34

    .line 1397
    .line 1398
    const/16 v7, 0xc

    .line 1399
    .line 1400
    goto :goto_19

    .line 1401
    :sswitch_1e
    const-string v3, "A_TRUEHD"

    .line 1402
    .line 1403
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1404
    .line 1405
    .line 1406
    move-result v2

    .line 1407
    if-eqz v2, :cond_34

    .line 1408
    .line 1409
    const/16 v7, 0x12

    .line 1410
    .line 1411
    goto :goto_19

    .line 1412
    :sswitch_1f
    const-string v3, "A_MS/ACM"

    .line 1413
    .line 1414
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1415
    .line 1416
    .line 1417
    move-result v2

    .line 1418
    if-eqz v2, :cond_34

    .line 1419
    .line 1420
    const/16 v7, 0x17

    .line 1421
    .line 1422
    goto :goto_19

    .line 1423
    :sswitch_20
    const-string v3, "V_MPEG4/ISO/SP"

    .line 1424
    .line 1425
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1426
    .line 1427
    .line 1428
    move-result v2

    .line 1429
    if-eqz v2, :cond_34

    .line 1430
    .line 1431
    const/4 v7, 0x4

    .line 1432
    goto :goto_19

    .line 1433
    :sswitch_21
    const-string v3, "V_MPEG4/ISO/AP"

    .line 1434
    .line 1435
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1436
    .line 1437
    .line 1438
    move-result v2

    .line 1439
    if-eqz v2, :cond_34

    .line 1440
    .line 1441
    const/4 v7, 0x6

    .line 1442
    goto :goto_19

    .line 1443
    :cond_34
    :goto_18
    move v7, v10

    .line 1444
    :goto_19
    packed-switch v7, :pswitch_data_0

    .line 1445
    .line 1446
    .line 1447
    goto :goto_1a

    .line 1448
    :pswitch_0
    iget v2, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzd:I

    .line 1449
    .line 1450
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzakl;->zza(I)V

    .line 1451
    .line 1452
    .line 1453
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzar:Lcom/google/android/gms/internal/ads/zzagd;

    .line 1454
    .line 1455
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzd:I

    .line 1456
    .line 1457
    iget v4, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzf:I

    .line 1458
    .line 1459
    invoke-interface {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzagd;->zzs(II)Lcom/google/android/gms/internal/ads/zzahm;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v2

    .line 1463
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzZ:Lcom/google/android/gms/internal/ads/zzahm;

    .line 1464
    .line 1465
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzi:Landroid/util/SparseArray;

    .line 1466
    .line 1467
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzd:I

    .line 1468
    .line 1469
    invoke-virtual {v2, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1470
    .line 1471
    .line 1472
    :goto_1a
    iput-object v11, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 1473
    .line 1474
    return-void

    .line 1475
    :cond_35
    const-string v1, "CodecId is missing in TrackEntry element"

    .line 1476
    .line 1477
    invoke-static {v1, v11}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v1

    .line 1481
    throw v1

    .line 1482
    :cond_36
    move-wide/from16 v17, v9

    .line 1483
    .line 1484
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzW:I

    .line 1485
    .line 1486
    const/4 v10, 0x2

    .line 1487
    if-ne v1, v10, :cond_3d

    .line 1488
    .line 1489
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzi:Landroid/util/SparseArray;

    .line 1490
    .line 1491
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzac:I

    .line 1492
    .line 1493
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v1

    .line 1497
    check-cast v1, Lcom/google/android/gms/internal/ads/zzakl;

    .line 1498
    .line 1499
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzakl;->zzb()V

    .line 1500
    .line 1501
    .line 1502
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzah:J

    .line 1503
    .line 1504
    cmp-long v2, v5, v17

    .line 1505
    .line 1506
    if-lez v2, :cond_37

    .line 1507
    .line 1508
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzc:Ljava/lang/String;

    .line 1509
    .line 1510
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1511
    .line 1512
    .line 1513
    move-result v2

    .line 1514
    if-eqz v2, :cond_37

    .line 1515
    .line 1516
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzw:Lcom/google/android/gms/internal/ads/zzeu;

    .line 1517
    .line 1518
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v3

    .line 1522
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1523
    .line 1524
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v3

    .line 1528
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzah:J

    .line 1529
    .line 1530
    invoke-virtual {v3, v4, v5}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v3

    .line 1534
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    .line 1535
    .line 1536
    .line 1537
    move-result-object v3

    .line 1538
    array-length v4, v3

    .line 1539
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzb([BI)V

    .line 1540
    .line 1541
    .line 1542
    :cond_37
    const/4 v2, 0x0

    .line 1543
    const/4 v3, 0x0

    .line 1544
    :goto_1b
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzaa:I

    .line 1545
    .line 1546
    if-ge v3, v4, :cond_38

    .line 1547
    .line 1548
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzab:[I

    .line 1549
    .line 1550
    aget v4, v4, v3

    .line 1551
    .line 1552
    add-int/2addr v2, v4

    .line 1553
    const/16 v28, 0x1

    .line 1554
    .line 1555
    add-int/lit8 v3, v3, 0x1

    .line 1556
    .line 1557
    goto :goto_1b

    .line 1558
    :cond_38
    const/4 v3, 0x0

    .line 1559
    :goto_1c
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzaa:I

    .line 1560
    .line 1561
    if-ge v3, v4, :cond_3b

    .line 1562
    .line 1563
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzX:J

    .line 1564
    .line 1565
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzg:I

    .line 1566
    .line 1567
    mul-int/2addr v6, v3

    .line 1568
    div-int/lit16 v6, v6, 0x3e8

    .line 1569
    .line 1570
    int-to-long v6, v6

    .line 1571
    add-long/2addr v4, v6

    .line 1572
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzae:I

    .line 1573
    .line 1574
    if-nez v3, :cond_3a

    .line 1575
    .line 1576
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzag:Z

    .line 1577
    .line 1578
    if-nez v3, :cond_39

    .line 1579
    .line 1580
    const/16 v28, 0x1

    .line 1581
    .line 1582
    or-int/lit8 v6, v6, 0x1

    .line 1583
    .line 1584
    :goto_1d
    const/4 v7, 0x0

    .line 1585
    goto :goto_1e

    .line 1586
    :cond_39
    const/16 v28, 0x1

    .line 1587
    .line 1588
    goto :goto_1d

    .line 1589
    :cond_3a
    const/16 v28, 0x1

    .line 1590
    .line 1591
    move v7, v3

    .line 1592
    :goto_1e
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzab:[I

    .line 1593
    .line 1594
    aget v3, v3, v7

    .line 1595
    .line 1596
    sub-int/2addr v2, v3

    .line 1597
    move/from16 v37, v6

    .line 1598
    .line 1599
    move v6, v2

    .line 1600
    move-wide/from16 v38, v4

    .line 1601
    .line 1602
    move v5, v3

    .line 1603
    move-wide/from16 v2, v38

    .line 1604
    .line 1605
    move/from16 v4, v37

    .line 1606
    .line 1607
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzakm;->zzt(Lcom/google/android/gms/internal/ads/zzakl;JIII)V

    .line 1608
    .line 1609
    .line 1610
    add-int/lit8 v3, v7, 0x1

    .line 1611
    .line 1612
    move v2, v6

    .line 1613
    goto :goto_1c

    .line 1614
    :cond_3b
    const/4 v3, 0x0

    .line 1615
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzW:I

    .line 1616
    .line 1617
    return-void

    .line 1618
    :cond_3c
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzF:Lcom/google/android/gms/internal/ads/zzakg;

    .line 1619
    .line 1620
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1621
    .line 1622
    .line 1623
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzakg;->zzf:Ljava/lang/String;

    .line 1624
    .line 1625
    if-nez v2, :cond_3d

    .line 1626
    .line 1627
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzakg;->zzh:Ljava/lang/String;

    .line 1628
    .line 1629
    if-eqz v2, :cond_3d

    .line 1630
    .line 1631
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzakg;->zzf:Ljava/lang/String;

    .line 1632
    .line 1633
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzakg;->zzi:Ljava/lang/String;

    .line 1634
    .line 1635
    if-eqz v2, :cond_3d

    .line 1636
    .line 1637
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzakg;->zzg:Ljava/lang/String;

    .line 1638
    .line 1639
    :cond_3d
    :goto_1f
    return-void

    .line 1640
    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_21
        -0x7ce7f3b0 -> :sswitch_20
        -0x76567dc0 -> :sswitch_1f
        -0x6a615338 -> :sswitch_1e
        -0x672350af -> :sswitch_1d
        -0x585f4fce -> :sswitch_1c
        -0x585f4fcd -> :sswitch_1b
        -0x51dc40b2 -> :sswitch_1a
        -0x37a9c464 -> :sswitch_19
        -0x2016c535 -> :sswitch_18
        -0x2016c4e5 -> :sswitch_17
        -0x19552dbd -> :sswitch_16
        -0x1538b2ba -> :sswitch_15
        0x3c02325 -> :sswitch_14
        0x3c02353 -> :sswitch_13
        0x3c030c5 -> :sswitch_12
        0x4e81333 -> :sswitch_11
        0x4e86155 -> :sswitch_10
        0x4e86156 -> :sswitch_f
        0x5e8da3e -> :sswitch_e
        0x1a8350d6 -> :sswitch_d
        0x2056f406 -> :sswitch_c
        0x25e26ee2 -> :sswitch_b
        0x2b45174d -> :sswitch_a
        0x2b453ce4 -> :sswitch_9
        0x2c0618eb -> :sswitch_8
        0x2c065c6b -> :sswitch_7
        0x32fdf009 -> :sswitch_6
        0x3e4ca2d8 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final zzj(IJ)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    const/16 v0, 0x88

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide/16 v2, 0x1

    .line 5
    .line 6
    const/4 v4, 0x1

    .line 7
    if-eq p1, v0, :cond_21

    .line 8
    .line 9
    const/16 v0, 0x89

    .line 10
    .line 11
    if-eq p1, v0, :cond_20

    .line 12
    .line 13
    const/16 v0, 0x91

    .line 14
    .line 15
    if-eq p1, v0, :cond_1f

    .line 16
    .line 17
    const/16 v0, 0x92

    .line 18
    .line 19
    if-eq p1, v0, :cond_1e

    .line 20
    .line 21
    const/16 v0, 0xf0

    .line 22
    .line 23
    const-wide/16 v5, -0x1

    .line 24
    .line 25
    if-eq p1, v0, :cond_1c

    .line 26
    .line 27
    const/16 v0, 0xf1

    .line 28
    .line 29
    if-eq p1, v0, :cond_1b

    .line 30
    .line 31
    const/16 v0, 0x5031

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    const-string v6, " not supported"

    .line 35
    .line 36
    if-eq p1, v0, :cond_19

    .line 37
    .line 38
    const/16 v0, 0x5032

    .line 39
    .line 40
    if-eq p1, v0, :cond_17

    .line 41
    .line 42
    const/16 v0, 0x73c4

    .line 43
    .line 44
    if-eq p1, v0, :cond_16

    .line 45
    .line 46
    const/16 v0, 0x73c5

    .line 47
    .line 48
    if-eq p1, v0, :cond_15

    .line 49
    .line 50
    const/16 v0, 0x21

    .line 51
    .line 52
    const/4 v7, -0x1

    .line 53
    const/4 v8, 0x3

    .line 54
    const/4 v9, 0x2

    .line 55
    sparse-switch p1, :sswitch_data_0

    .line 56
    .line 57
    .line 58
    packed-switch p1, :pswitch_data_0

    .line 59
    .line 60
    .line 61
    goto/16 :goto_0

    .line 62
    .line 63
    :pswitch_0
    long-to-int p2, p2

    .line 64
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 68
    .line 69
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzD:I

    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_1
    long-to-int p2, p2

    .line 73
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 77
    .line 78
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzC:I

    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_2
    long-to-int p2, p2

    .line 82
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 83
    .line 84
    .line 85
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzi;->zzb(I)I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eq p1, v7, :cond_1d

    .line 90
    .line 91
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 92
    .line 93
    iput p1, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzz:I

    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_3
    long-to-int p2, p2

    .line 97
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzi;->zzc(I)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eq p1, v7, :cond_1d

    .line 105
    .line 106
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 107
    .line 108
    iput p1, p2, Lcom/google/android/gms/internal/ads/zzakl;->zzA:I

    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_4
    long-to-int p2, p2

    .line 112
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 113
    .line 114
    .line 115
    if-eq p2, v4, :cond_1

    .line 116
    .line 117
    if-eq p2, v9, :cond_0

    .line 118
    .line 119
    goto/16 :goto_0

    .line 120
    .line 121
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 122
    .line 123
    iput v4, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzB:I

    .line 124
    .line 125
    return-void

    .line 126
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 127
    .line 128
    iput v9, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzB:I

    .line 129
    .line 130
    return-void

    .line 131
    :sswitch_0
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzA:J

    .line 132
    .line 133
    return-void

    .line 134
    :sswitch_1
    long-to-int p2, p2

    .line 135
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 136
    .line 137
    .line 138
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 139
    .line 140
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzg:I

    .line 141
    .line 142
    return-void

    .line 143
    :sswitch_2
    long-to-int p2, p2

    .line 144
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 145
    .line 146
    .line 147
    if-eqz p2, :cond_5

    .line 148
    .line 149
    if-eq p2, v4, :cond_4

    .line 150
    .line 151
    if-eq p2, v9, :cond_3

    .line 152
    .line 153
    if-eq p2, v8, :cond_2

    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 158
    .line 159
    iput v8, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzt:I

    .line 160
    .line 161
    return-void

    .line 162
    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 163
    .line 164
    iput v9, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzt:I

    .line 165
    .line 166
    return-void

    .line 167
    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 168
    .line 169
    iput v4, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzt:I

    .line 170
    .line 171
    return-void

    .line 172
    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 173
    .line 174
    iput v1, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzt:I

    .line 175
    .line 176
    return-void

    .line 177
    :sswitch_3
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzah:J

    .line 178
    .line 179
    return-void

    .line 180
    :sswitch_4
    long-to-int p2, p2

    .line 181
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 182
    .line 183
    .line 184
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 185
    .line 186
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzQ:I

    .line 187
    .line 188
    return-void

    .line 189
    :sswitch_5
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 190
    .line 191
    .line 192
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 193
    .line 194
    iput-wide p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzU:J

    .line 195
    .line 196
    return-void

    .line 197
    :sswitch_6
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 198
    .line 199
    .line 200
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 201
    .line 202
    iput-wide p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzT:J

    .line 203
    .line 204
    return-void

    .line 205
    :sswitch_7
    long-to-int p2, p2

    .line 206
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 207
    .line 208
    .line 209
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 210
    .line 211
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzh:I

    .line 212
    .line 213
    return-void

    .line 214
    :sswitch_8
    long-to-int p2, p2

    .line 215
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 216
    .line 217
    .line 218
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 219
    .line 220
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzp:I

    .line 221
    .line 222
    return-void

    .line 223
    :sswitch_9
    cmp-long p2, p2, v2

    .line 224
    .line 225
    if-nez p2, :cond_6

    .line 226
    .line 227
    move v1, v4

    .line 228
    :cond_6
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 229
    .line 230
    .line 231
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 232
    .line 233
    iput-boolean v1, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzX:Z

    .line 234
    .line 235
    return-void

    .line 236
    :sswitch_a
    long-to-int p2, p2

    .line 237
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 238
    .line 239
    .line 240
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 241
    .line 242
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzr:I

    .line 243
    .line 244
    return-void

    .line 245
    :sswitch_b
    long-to-int p2, p2

    .line 246
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 247
    .line 248
    .line 249
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 250
    .line 251
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzs:I

    .line 252
    .line 253
    return-void

    .line 254
    :sswitch_c
    long-to-int p2, p2

    .line 255
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 256
    .line 257
    .line 258
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 259
    .line 260
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzq:I

    .line 261
    .line 262
    return-void

    .line 263
    :sswitch_d
    long-to-int p2, p2

    .line 264
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 265
    .line 266
    .line 267
    if-eqz p2, :cond_a

    .line 268
    .line 269
    if-eq p2, v4, :cond_9

    .line 270
    .line 271
    if-eq p2, v8, :cond_8

    .line 272
    .line 273
    const/16 p1, 0xf

    .line 274
    .line 275
    if-eq p2, p1, :cond_7

    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :cond_7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 280
    .line 281
    iput v8, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzy:I

    .line 282
    .line 283
    return-void

    .line 284
    :cond_8
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 285
    .line 286
    iput v4, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzy:I

    .line 287
    .line 288
    return-void

    .line 289
    :cond_9
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 290
    .line 291
    iput v9, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzy:I

    .line 292
    .line 293
    return-void

    .line 294
    :cond_a
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 295
    .line 296
    iput v1, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzy:I

    .line 297
    .line 298
    return-void

    .line 299
    :sswitch_e
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzz:J

    .line 300
    .line 301
    add-long/2addr p2, v0

    .line 302
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzJ:J

    .line 303
    .line 304
    return-void

    .line 305
    :sswitch_f
    cmp-long p1, p2, v2

    .line 306
    .line 307
    if-nez p1, :cond_b

    .line 308
    .line 309
    goto/16 :goto_0

    .line 310
    .line 311
    :cond_b
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 316
    .line 317
    .line 318
    move-result p1

    .line 319
    new-instance v0, Ljava/lang/StringBuilder;

    .line 320
    .line 321
    add-int/lit8 p1, p1, 0x24

    .line 322
    .line 323
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 324
    .line 325
    .line 326
    const-string p1, "AESSettingsCipherMode "

    .line 327
    .line 328
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    invoke-static {p1, v5}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    throw p1

    .line 346
    :sswitch_10
    const-wide/16 v0, 0x5

    .line 347
    .line 348
    cmp-long p1, p2, v0

    .line 349
    .line 350
    if-nez p1, :cond_c

    .line 351
    .line 352
    goto/16 :goto_0

    .line 353
    .line 354
    :cond_c
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 359
    .line 360
    .line 361
    move-result p1

    .line 362
    new-instance v0, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    add-int/lit8 p1, p1, 0x1d

    .line 365
    .line 366
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 367
    .line 368
    .line 369
    const-string p1, "ContentEncAlgo "

    .line 370
    .line 371
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object p1

    .line 384
    invoke-static {p1, v5}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    throw p1

    .line 389
    :sswitch_11
    cmp-long p1, p2, v2

    .line 390
    .line 391
    if-nez p1, :cond_d

    .line 392
    .line 393
    goto/16 :goto_0

    .line 394
    .line 395
    :cond_d
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 400
    .line 401
    .line 402
    move-result p1

    .line 403
    add-int/lit8 p1, p1, 0x1e

    .line 404
    .line 405
    new-instance v0, Ljava/lang/StringBuilder;

    .line 406
    .line 407
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 408
    .line 409
    .line 410
    const-string p1, "EBMLReadVersion "

    .line 411
    .line 412
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object p1

    .line 425
    invoke-static {p1, v5}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    throw p1

    .line 430
    :sswitch_12
    cmp-long p1, p2, v2

    .line 431
    .line 432
    if-ltz p1, :cond_e

    .line 433
    .line 434
    const-wide/16 v1, 0x2

    .line 435
    .line 436
    cmp-long p1, p2, v1

    .line 437
    .line 438
    if-gtz p1, :cond_e

    .line 439
    .line 440
    goto/16 :goto_0

    .line 441
    .line 442
    :cond_e
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 447
    .line 448
    .line 449
    move-result p1

    .line 450
    new-instance v1, Ljava/lang/StringBuilder;

    .line 451
    .line 452
    add-int/2addr p1, v0

    .line 453
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 454
    .line 455
    .line 456
    const-string p1, "DocTypeReadVersion "

    .line 457
    .line 458
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object p1

    .line 471
    invoke-static {p1, v5}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 472
    .line 473
    .line 474
    move-result-object p1

    .line 475
    throw p1

    .line 476
    :sswitch_13
    const-wide/16 v0, 0x3

    .line 477
    .line 478
    cmp-long p1, p2, v0

    .line 479
    .line 480
    if-nez p1, :cond_f

    .line 481
    .line 482
    goto/16 :goto_0

    .line 483
    .line 484
    :cond_f
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object p1

    .line 488
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 489
    .line 490
    .line 491
    move-result p1

    .line 492
    add-int/lit8 p1, p1, 0x1e

    .line 493
    .line 494
    new-instance v0, Ljava/lang/StringBuilder;

    .line 495
    .line 496
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 497
    .line 498
    .line 499
    const-string p1, "ContentCompAlgo "

    .line 500
    .line 501
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object p1

    .line 514
    invoke-static {p1, v5}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 515
    .line 516
    .line 517
    move-result-object p1

    .line 518
    throw p1

    .line 519
    :sswitch_14
    long-to-int p2, p2

    .line 520
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 521
    .line 522
    .line 523
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 524
    .line 525
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzakl;->zzd(I)V

    .line 526
    .line 527
    .line 528
    return-void

    .line 529
    :sswitch_15
    iput-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzag:Z

    .line 530
    .line 531
    return-void

    .line 532
    :sswitch_16
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzH:Z

    .line 533
    .line 534
    if-nez v0, :cond_1d

    .line 535
    .line 536
    long-to-int p2, p2

    .line 537
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzs(I)V

    .line 538
    .line 539
    .line 540
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzN:I

    .line 541
    .line 542
    return-void

    .line 543
    :sswitch_17
    long-to-int p1, p2

    .line 544
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzaf:I

    .line 545
    .line 546
    return-void

    .line 547
    :sswitch_18
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/zzakm;->zzA(J)J

    .line 548
    .line 549
    .line 550
    move-result-wide p1

    .line 551
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzU:J

    .line 552
    .line 553
    return-void

    .line 554
    :sswitch_19
    long-to-int p2, p2

    .line 555
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 556
    .line 557
    .line 558
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 559
    .line 560
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzd:I

    .line 561
    .line 562
    return-void

    .line 563
    :sswitch_1a
    long-to-int p2, p2

    .line 564
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 565
    .line 566
    .line 567
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 568
    .line 569
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzo:I

    .line 570
    .line 571
    return-void

    .line 572
    :sswitch_1b
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzH:Z

    .line 573
    .line 574
    if-nez v0, :cond_1d

    .line 575
    .line 576
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzs(I)V

    .line 577
    .line 578
    .line 579
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/zzakm;->zzA(J)J

    .line 580
    .line 581
    .line 582
    move-result-wide p1

    .line 583
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzM:J

    .line 584
    .line 585
    return-void

    .line 586
    :sswitch_1c
    long-to-int p2, p2

    .line 587
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 588
    .line 589
    .line 590
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 591
    .line 592
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzn:I

    .line 593
    .line 594
    return-void

    .line 595
    :sswitch_1d
    long-to-int p2, p2

    .line 596
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 597
    .line 598
    .line 599
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 600
    .line 601
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzP:I

    .line 602
    .line 603
    return-void

    .line 604
    :sswitch_1e
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/zzakm;->zzA(J)J

    .line 605
    .line 606
    .line 607
    move-result-wide p1

    .line 608
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzY:J

    .line 609
    .line 610
    return-void

    .line 611
    :sswitch_1f
    cmp-long p2, p2, v2

    .line 612
    .line 613
    if-nez p2, :cond_10

    .line 614
    .line 615
    move v1, v4

    .line 616
    :cond_10
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzq(I)V

    .line 617
    .line 618
    .line 619
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzF:Lcom/google/android/gms/internal/ads/zzakg;

    .line 620
    .line 621
    iput-boolean v1, p1, Lcom/google/android/gms/internal/ads/zzakg;->zzd:Z

    .line 622
    .line 623
    return-void

    .line 624
    :sswitch_20
    long-to-int p2, p2

    .line 625
    if-eq p2, v4, :cond_14

    .line 626
    .line 627
    if-eq p2, v9, :cond_13

    .line 628
    .line 629
    const/16 p3, 0x11

    .line 630
    .line 631
    if-eq p2, p3, :cond_12

    .line 632
    .line 633
    if-eq p2, v0, :cond_11

    .line 634
    .line 635
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 636
    .line 637
    .line 638
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 639
    .line 640
    iput v7, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzf:I

    .line 641
    .line 642
    return-void

    .line 643
    :cond_11
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 644
    .line 645
    .line 646
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 647
    .line 648
    const/4 p2, 0x5

    .line 649
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzf:I

    .line 650
    .line 651
    return-void

    .line 652
    :cond_12
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 653
    .line 654
    .line 655
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 656
    .line 657
    iput v8, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzf:I

    .line 658
    .line 659
    return-void

    .line 660
    :cond_13
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 661
    .line 662
    .line 663
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 664
    .line 665
    iput v4, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzf:I

    .line 666
    .line 667
    return-void

    .line 668
    :cond_14
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 669
    .line 670
    .line 671
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 672
    .line 673
    iput v9, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzf:I

    .line 674
    .line 675
    return-void

    .line 676
    :cond_15
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 677
    .line 678
    .line 679
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 680
    .line 681
    iput-wide p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zze:J

    .line 682
    .line 683
    return-void

    .line 684
    :cond_16
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzq(I)V

    .line 685
    .line 686
    .line 687
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzF:Lcom/google/android/gms/internal/ads/zzakg;

    .line 688
    .line 689
    iput-wide p2, p1, Lcom/google/android/gms/internal/ads/zzakg;->zza:J

    .line 690
    .line 691
    return-void

    .line 692
    :cond_17
    cmp-long p1, p2, v2

    .line 693
    .line 694
    if-nez p1, :cond_18

    .line 695
    .line 696
    goto :goto_0

    .line 697
    :cond_18
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object p1

    .line 701
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 702
    .line 703
    .line 704
    move-result p1

    .line 705
    add-int/lit8 p1, p1, 0x23

    .line 706
    .line 707
    new-instance v0, Ljava/lang/StringBuilder;

    .line 708
    .line 709
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 710
    .line 711
    .line 712
    const-string p1, "ContentEncodingScope "

    .line 713
    .line 714
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 715
    .line 716
    .line 717
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 718
    .line 719
    .line 720
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 721
    .line 722
    .line 723
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object p1

    .line 727
    invoke-static {p1, v5}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 728
    .line 729
    .line 730
    move-result-object p1

    .line 731
    throw p1

    .line 732
    :cond_19
    const-wide/16 v0, 0x0

    .line 733
    .line 734
    cmp-long p1, p2, v0

    .line 735
    .line 736
    if-nez p1, :cond_1a

    .line 737
    .line 738
    goto :goto_0

    .line 739
    :cond_1a
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object p1

    .line 743
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 744
    .line 745
    .line 746
    move-result p1

    .line 747
    add-int/lit8 p1, p1, 0x23

    .line 748
    .line 749
    new-instance v0, Ljava/lang/StringBuilder;

    .line 750
    .line 751
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 752
    .line 753
    .line 754
    const-string p1, "ContentEncodingOrder "

    .line 755
    .line 756
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 757
    .line 758
    .line 759
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 760
    .line 761
    .line 762
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object p1

    .line 769
    invoke-static {p1, v5}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 770
    .line 771
    .line 772
    move-result-object p1

    .line 773
    throw p1

    .line 774
    :cond_1b
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzH:Z

    .line 775
    .line 776
    if-nez v0, :cond_1d

    .line 777
    .line 778
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzs(I)V

    .line 779
    .line 780
    .line 781
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzO:J

    .line 782
    .line 783
    cmp-long p1, v0, v5

    .line 784
    .line 785
    if-nez p1, :cond_1d

    .line 786
    .line 787
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzO:J

    .line 788
    .line 789
    return-void

    .line 790
    :cond_1c
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzH:Z

    .line 791
    .line 792
    if-nez v0, :cond_1d

    .line 793
    .line 794
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzs(I)V

    .line 795
    .line 796
    .line 797
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzP:J

    .line 798
    .line 799
    cmp-long p1, v0, v5

    .line 800
    .line 801
    if-nez p1, :cond_1d

    .line 802
    .line 803
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzP:J

    .line 804
    .line 805
    :cond_1d
    :goto_0
    return-void

    .line 806
    :cond_1e
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzq(I)V

    .line 807
    .line 808
    .line 809
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzF:Lcom/google/android/gms/internal/ads/zzakg;

    .line 810
    .line 811
    iput-wide p2, p1, Lcom/google/android/gms/internal/ads/zzakg;->zzc:J

    .line 812
    .line 813
    return-void

    .line 814
    :cond_1f
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzq(I)V

    .line 815
    .line 816
    .line 817
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzF:Lcom/google/android/gms/internal/ads/zzakg;

    .line 818
    .line 819
    iput-wide p2, p1, Lcom/google/android/gms/internal/ads/zzakg;->zzb:J

    .line 820
    .line 821
    return-void

    .line 822
    :cond_20
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzq(I)V

    .line 823
    .line 824
    .line 825
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzF:Lcom/google/android/gms/internal/ads/zzakg;

    .line 826
    .line 827
    iput-wide p2, p1, Lcom/google/android/gms/internal/ads/zzakg;->zze:J

    .line 828
    .line 829
    return-void

    .line 830
    :cond_21
    cmp-long p2, p2, v2

    .line 831
    .line 832
    if-nez p2, :cond_22

    .line 833
    .line 834
    move v1, v4

    .line 835
    :cond_22
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 836
    .line 837
    .line 838
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 839
    .line 840
    iput-boolean v1, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzY:Z

    .line 841
    .line 842
    return-void

    .line 843
    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_20
        0x98 -> :sswitch_1f
        0x9b -> :sswitch_1e
        0x9f -> :sswitch_1d
        0xb0 -> :sswitch_1c
        0xb3 -> :sswitch_1b
        0xba -> :sswitch_1a
        0xd7 -> :sswitch_19
        0xe7 -> :sswitch_18
        0xee -> :sswitch_17
        0xf7 -> :sswitch_16
        0xfb -> :sswitch_15
        0x41e7 -> :sswitch_14
        0x4254 -> :sswitch_13
        0x4285 -> :sswitch_12
        0x42f7 -> :sswitch_11
        0x47e1 -> :sswitch_10
        0x47e8 -> :sswitch_f
        0x53ac -> :sswitch_e
        0x53b8 -> :sswitch_d
        0x54b0 -> :sswitch_c
        0x54b2 -> :sswitch_b
        0x54ba -> :sswitch_a
        0x55aa -> :sswitch_9
        0x55b2 -> :sswitch_8
        0x55ee -> :sswitch_7
        0x56aa -> :sswitch_6
        0x56bb -> :sswitch_5
        0x6264 -> :sswitch_4
        0x75a2 -> :sswitch_3
        0x7671 -> :sswitch_2
        0x23e383 -> :sswitch_1
        0x2ad7b1 -> :sswitch_0
    .end sparse-switch

    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    :pswitch_data_0
    .packed-switch 0x55b9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzk(ID)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    const/16 v0, 0xb5

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x4489

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    packed-switch p1, :pswitch_data_1

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    double-to-float p2, p2

    .line 17
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 21
    .line 22
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzw:F

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_1
    double-to-float p2, p2

    .line 26
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 30
    .line 31
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzv:F

    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_2
    double-to-float p2, p2

    .line 35
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 39
    .line 40
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzu:F

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_3
    double-to-float p2, p2

    .line 44
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 48
    .line 49
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzN:F

    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_4
    double-to-float p2, p2

    .line 53
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 57
    .line 58
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzM:F

    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_5
    double-to-float p2, p2

    .line 62
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 66
    .line 67
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzL:F

    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_6
    double-to-float p2, p2

    .line 71
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 75
    .line 76
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzK:F

    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_7
    double-to-float p2, p2

    .line 80
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 84
    .line 85
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzJ:F

    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_8
    double-to-float p2, p2

    .line 89
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 93
    .line 94
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzI:F

    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_9
    double-to-float p2, p2

    .line 98
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 102
    .line 103
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzH:F

    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_a
    double-to-float p2, p2

    .line 107
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 111
    .line 112
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzG:F

    .line 113
    .line 114
    return-void

    .line 115
    :pswitch_b
    double-to-float p2, p2

    .line 116
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 120
    .line 121
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzF:F

    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_c
    double-to-float p2, p2

    .line 125
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 129
    .line 130
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzE:F

    .line 131
    .line 132
    return-void

    .line 133
    :cond_0
    double-to-long p1, p2

    .line 134
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzB:J

    .line 135
    .line 136
    return-void

    .line 137
    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 138
    .line 139
    .line 140
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 141
    .line 142
    double-to-int p2, p2

    .line 143
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzS:I

    .line 144
    .line 145
    return-void

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x55d1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    :pswitch_data_1
    .packed-switch 0x7673
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzl(ILjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    const/16 v0, 0x85

    .line 2
    .line 3
    if-eq p1, v0, :cond_7

    .line 4
    .line 5
    const/16 v0, 0x86

    .line 6
    .line 7
    if-eq p1, v0, :cond_6

    .line 8
    .line 9
    const/16 v0, 0x4282

    .line 10
    .line 11
    if-eq p1, v0, :cond_3

    .line 12
    .line 13
    const/16 v0, 0x437c

    .line 14
    .line 15
    if-eq p1, v0, :cond_2

    .line 16
    .line 17
    const/16 v0, 0x536e

    .line 18
    .line 19
    if-eq p1, v0, :cond_1

    .line 20
    .line 21
    const v0, 0x22b59c

    .line 22
    .line 23
    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzakl;->zze(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 40
    .line 41
    iput-object p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzb:Ljava/lang/String;

    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzq(I)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzF:Lcom/google/android/gms/internal/ads/zzakg;

    .line 48
    .line 49
    iput-object p2, p1, Lcom/google/android/gms/internal/ads/zzakg;->zzi:Ljava/lang/String;

    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    const-string p1, "webm"

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_5

    .line 59
    .line 60
    const-string v0, "matroska"

    .line 61
    .line 62
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    add-int/lit8 p1, p1, 0x16

    .line 76
    .line 77
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 78
    .line 79
    .line 80
    const-string p1, "DocType "

    .line 81
    .line 82
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string p1, " not supported"

    .line 89
    .line 90
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    const/4 p2, 0x0

    .line 98
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    throw p1

    .line 103
    :cond_5
    :goto_0
    invoke-static {p2, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzD:Z

    .line 108
    .line 109
    return-void

    .line 110
    :cond_6
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 114
    .line 115
    iput-object p2, p1, Lcom/google/android/gms/internal/ads/zzakl;->zzc:Ljava/lang/String;

    .line 116
    .line 117
    return-void

    .line 118
    :cond_7
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzq(I)V

    .line 119
    .line 120
    .line 121
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakm;->zzF:Lcom/google/android/gms/internal/ads/zzakg;

    .line 122
    .line 123
    iput-object p2, p1, Lcom/google/android/gms/internal/ads/zzakg;->zzh:Ljava/lang/String;

    .line 124
    .line 125
    return-void
.end method

.method public final zzm(IILcom/google/android/gms/internal/ads/zzagb;)V
    .locals 25
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v7, p3

    .line 8
    .line 9
    const/16 v3, 0xa1

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x2

    .line 13
    const/4 v6, 0x4

    .line 14
    const/16 v8, 0xa3

    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    const/4 v10, 0x0

    .line 18
    if-eq v1, v3, :cond_b

    .line 19
    .line 20
    if-eq v1, v8, :cond_b

    .line 21
    .line 22
    const/16 v3, 0xa5

    .line 23
    .line 24
    if-eq v1, v3, :cond_8

    .line 25
    .line 26
    const/16 v3, 0x41ed

    .line 27
    .line 28
    if-eq v1, v3, :cond_5

    .line 29
    .line 30
    const/16 v3, 0x4255

    .line 31
    .line 32
    if-eq v1, v3, :cond_4

    .line 33
    .line 34
    const/16 v3, 0x47e2

    .line 35
    .line 36
    if-eq v1, v3, :cond_3

    .line 37
    .line 38
    const/16 v3, 0x53ab

    .line 39
    .line 40
    if-eq v1, v3, :cond_2

    .line 41
    .line 42
    const/16 v3, 0x63a2

    .line 43
    .line 44
    if-eq v1, v3, :cond_1

    .line 45
    .line 46
    const/16 v3, 0x7672

    .line 47
    .line 48
    if-ne v1, v3, :cond_0

    .line 49
    .line 50
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 51
    .line 52
    .line 53
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 54
    .line 55
    new-array v3, v2, [B

    .line 56
    .line 57
    iput-object v3, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzx:[B

    .line 58
    .line 59
    invoke-interface {v7, v3, v10, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    add-int/lit8 v2, v2, 0xf

    .line 74
    .line 75
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 76
    .line 77
    .line 78
    const-string v2, "Unexpected id: "

    .line 79
    .line 80
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    throw v1

    .line 95
    :cond_1
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 96
    .line 97
    .line 98
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 99
    .line 100
    new-array v3, v2, [B

    .line 101
    .line 102
    iput-object v3, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzl:[B

    .line 103
    .line 104
    invoke-interface {v7, v3, v10, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_2
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzr:Lcom/google/android/gms/internal/ads/zzeu;

    .line 109
    .line 110
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-static {v3, v10}, Ljava/util/Arrays;->fill([BB)V

    .line 115
    .line 116
    .line 117
    rsub-int/lit8 v3, v2, 0x4

    .line 118
    .line 119
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-interface {v7, v4, v3, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    .line 130
    .line 131
    .line 132
    move-result-wide v1

    .line 133
    long-to-int v1, v1

    .line 134
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzI:I

    .line 135
    .line 136
    return-void

    .line 137
    :cond_3
    new-array v3, v2, [B

    .line 138
    .line 139
    invoke-interface {v7, v3, v10, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 140
    .line 141
    .line 142
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 143
    .line 144
    .line 145
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 146
    .line 147
    new-instance v2, Lcom/google/android/gms/internal/ads/zzahl;

    .line 148
    .line 149
    invoke-direct {v2, v9, v3, v10, v10}, Lcom/google/android/gms/internal/ads/zzahl;-><init>(I[BII)V

    .line 150
    .line 151
    .line 152
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzk:Lcom/google/android/gms/internal/ads/zzahl;

    .line 153
    .line 154
    return-void

    .line 155
    :cond_4
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 156
    .line 157
    .line 158
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 159
    .line 160
    new-array v3, v2, [B

    .line 161
    .line 162
    iput-object v3, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzj:[B

    .line 163
    .line 164
    invoke-interface {v7, v3, v10, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_5
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzr(I)V

    .line 169
    .line 170
    .line 171
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzG:Lcom/google/android/gms/internal/ads/zzakl;

    .line 172
    .line 173
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzakl;->zzc()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    const v4, 0x64767643

    .line 178
    .line 179
    .line 180
    if-eq v3, v4, :cond_7

    .line 181
    .line 182
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzakl;->zzc()I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    const v4, 0x64766343

    .line 187
    .line 188
    .line 189
    if-ne v3, v4, :cond_6

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_6
    invoke-interface {v7, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_7
    :goto_0
    new-array v3, v2, [B

    .line 197
    .line 198
    iput-object v3, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzO:[B

    .line 199
    .line 200
    invoke-interface {v7, v3, v10, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :cond_8
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzW:I

    .line 205
    .line 206
    if-eq v1, v5, :cond_9

    .line 207
    .line 208
    goto/16 :goto_d

    .line 209
    .line 210
    :cond_9
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzi:Landroid/util/SparseArray;

    .line 211
    .line 212
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzac:I

    .line 213
    .line 214
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    check-cast v1, Lcom/google/android/gms/internal/ads/zzakl;

    .line 219
    .line 220
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzaf:I

    .line 221
    .line 222
    if-ne v3, v6, :cond_a

    .line 223
    .line 224
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzakl;->zzc:Ljava/lang/String;

    .line 225
    .line 226
    const-string v3, "V_VP9"

    .line 227
    .line 228
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_a

    .line 233
    .line 234
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzw:Lcom/google/android/gms/internal/ads/zzeu;

    .line 235
    .line 236
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-interface {v7, v1, v10, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_a
    invoke-interface {v7, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :cond_b
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzW:I

    .line 252
    .line 253
    const/16 v11, 0x8

    .line 254
    .line 255
    if-nez v3, :cond_c

    .line 256
    .line 257
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzh:Lcom/google/android/gms/internal/ads/zzako;

    .line 258
    .line 259
    invoke-virtual {v3, v7, v10, v9, v11}, Lcom/google/android/gms/internal/ads/zzako;->zzb(Lcom/google/android/gms/internal/ads/zzagb;ZZI)J

    .line 260
    .line 261
    .line 262
    move-result-wide v12

    .line 263
    long-to-int v12, v12

    .line 264
    iput v12, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzac:I

    .line 265
    .line 266
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzako;->zzc()I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzad:I

    .line 271
    .line 272
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    iput-wide v12, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzY:J

    .line 278
    .line 279
    iput v9, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzW:I

    .line 280
    .line 281
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzp:Lcom/google/android/gms/internal/ads/zzeu;

    .line 282
    .line 283
    invoke-virtual {v3, v10}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 284
    .line 285
    .line 286
    :cond_c
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzi:Landroid/util/SparseArray;

    .line 287
    .line 288
    iget v12, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzac:I

    .line 289
    .line 290
    invoke-virtual {v3, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    check-cast v3, Lcom/google/android/gms/internal/ads/zzakl;

    .line 295
    .line 296
    if-nez v3, :cond_d

    .line 297
    .line 298
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzad:I

    .line 299
    .line 300
    sub-int v1, v2, v1

    .line 301
    .line 302
    invoke-interface {v7, v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 303
    .line 304
    .line 305
    iput v10, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzW:I

    .line 306
    .line 307
    return-void

    .line 308
    :cond_d
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzakl;->zzb()V

    .line 309
    .line 310
    .line 311
    iget v12, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzW:I

    .line 312
    .line 313
    if-ne v12, v9, :cond_1f

    .line 314
    .line 315
    const/4 v12, 0x3

    .line 316
    invoke-direct {v0, v7, v12}, Lcom/google/android/gms/internal/ads/zzakm;->zzu(Lcom/google/android/gms/internal/ads/zzagb;I)V

    .line 317
    .line 318
    .line 319
    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzp:Lcom/google/android/gms/internal/ads/zzeu;

    .line 320
    .line 321
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 322
    .line 323
    .line 324
    move-result-object v14

    .line 325
    aget-byte v14, v14, v5

    .line 326
    .line 327
    and-int/lit8 v14, v14, 0x6

    .line 328
    .line 329
    shr-int/2addr v14, v9

    .line 330
    const/16 v15, 0xff

    .line 331
    .line 332
    if-nez v14, :cond_e

    .line 333
    .line 334
    iput v9, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzaa:I

    .line 335
    .line 336
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzab:[I

    .line 337
    .line 338
    invoke-static {v4, v9}, Lcom/google/android/gms/internal/ads/zzakm;->zzB([II)[I

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    iput-object v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzab:[I

    .line 343
    .line 344
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzad:I

    .line 345
    .line 346
    sub-int/2addr v2, v6

    .line 347
    add-int/lit8 v2, v2, -0x3

    .line 348
    .line 349
    aput v2, v4, v10

    .line 350
    .line 351
    :goto_1
    move/from16 v18, v5

    .line 352
    .line 353
    move/from16 v20, v9

    .line 354
    .line 355
    move/from16 v17, v10

    .line 356
    .line 357
    move/from16 v19, v11

    .line 358
    .line 359
    goto/16 :goto_8

    .line 360
    .line 361
    :cond_e
    invoke-direct {v0, v7, v6}, Lcom/google/android/gms/internal/ads/zzakm;->zzu(Lcom/google/android/gms/internal/ads/zzagb;I)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 365
    .line 366
    .line 367
    move-result-object v16

    .line 368
    aget-byte v6, v16, v12

    .line 369
    .line 370
    and-int/2addr v6, v15

    .line 371
    add-int/2addr v6, v9

    .line 372
    iput v6, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzaa:I

    .line 373
    .line 374
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzab:[I

    .line 375
    .line 376
    invoke-static {v8, v6}, Lcom/google/android/gms/internal/ads/zzakm;->zzB([II)[I

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    iput-object v6, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzab:[I

    .line 381
    .line 382
    if-ne v14, v5, :cond_f

    .line 383
    .line 384
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzad:I

    .line 385
    .line 386
    sub-int/2addr v2, v4

    .line 387
    add-int/lit8 v2, v2, -0x4

    .line 388
    .line 389
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzaa:I

    .line 390
    .line 391
    div-int/2addr v2, v4

    .line 392
    invoke-static {v6, v10, v4, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 393
    .line 394
    .line 395
    goto :goto_1

    .line 396
    :cond_f
    if-ne v14, v9, :cond_12

    .line 397
    .line 398
    move v4, v10

    .line 399
    move v8, v4

    .line 400
    const/4 v6, 0x4

    .line 401
    :goto_2
    iget v12, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzaa:I

    .line 402
    .line 403
    add-int/lit8 v12, v12, -0x1

    .line 404
    .line 405
    if-ge v4, v12, :cond_11

    .line 406
    .line 407
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzab:[I

    .line 408
    .line 409
    aput v10, v12, v4

    .line 410
    .line 411
    :goto_3
    add-int/lit8 v12, v6, 0x1

    .line 412
    .line 413
    invoke-direct {v0, v7, v12}, Lcom/google/android/gms/internal/ads/zzakm;->zzu(Lcom/google/android/gms/internal/ads/zzagb;I)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 417
    .line 418
    .line 419
    move-result-object v14

    .line 420
    aget-byte v6, v14, v6

    .line 421
    .line 422
    and-int/2addr v6, v15

    .line 423
    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzab:[I

    .line 424
    .line 425
    aget v17, v14, v4

    .line 426
    .line 427
    add-int v17, v17, v6

    .line 428
    .line 429
    aput v17, v14, v4

    .line 430
    .line 431
    if-eq v6, v15, :cond_10

    .line 432
    .line 433
    add-int v8, v8, v17

    .line 434
    .line 435
    add-int/lit8 v4, v4, 0x1

    .line 436
    .line 437
    move v6, v12

    .line 438
    goto :goto_2

    .line 439
    :cond_10
    move v6, v12

    .line 440
    goto :goto_3

    .line 441
    :cond_11
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzab:[I

    .line 442
    .line 443
    iget v14, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzad:I

    .line 444
    .line 445
    sub-int/2addr v2, v14

    .line 446
    sub-int/2addr v2, v6

    .line 447
    sub-int/2addr v2, v8

    .line 448
    aput v2, v4, v12

    .line 449
    .line 450
    goto :goto_1

    .line 451
    :cond_12
    if-ne v14, v12, :cond_1e

    .line 452
    .line 453
    move v8, v10

    .line 454
    move v12, v8

    .line 455
    const/4 v6, 0x4

    .line 456
    :goto_4
    iget v14, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzaa:I

    .line 457
    .line 458
    add-int/lit8 v14, v14, -0x1

    .line 459
    .line 460
    if-ge v8, v14, :cond_1a

    .line 461
    .line 462
    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzab:[I

    .line 463
    .line 464
    aput v10, v14, v8

    .line 465
    .line 466
    add-int/lit8 v14, v6, 0x1

    .line 467
    .line 468
    invoke-direct {v0, v7, v14}, Lcom/google/android/gms/internal/ads/zzakm;->zzu(Lcom/google/android/gms/internal/ads/zzagb;I)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 472
    .line 473
    .line 474
    move-result-object v17

    .line 475
    aget-byte v17, v17, v6

    .line 476
    .line 477
    if-eqz v17, :cond_19

    .line 478
    .line 479
    move/from16 v17, v10

    .line 480
    .line 481
    :goto_5
    if-ge v10, v11, :cond_15

    .line 482
    .line 483
    rsub-int/lit8 v18, v10, 0x7

    .line 484
    .line 485
    move/from16 v19, v11

    .line 486
    .line 487
    shl-int v11, v9, v18

    .line 488
    .line 489
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 490
    .line 491
    .line 492
    move-result-object v18

    .line 493
    aget-byte v18, v18, v6

    .line 494
    .line 495
    and-int v18, v18, v11

    .line 496
    .line 497
    if-eqz v18, :cond_14

    .line 498
    .line 499
    add-int/2addr v14, v10

    .line 500
    invoke-direct {v0, v7, v14}, Lcom/google/android/gms/internal/ads/zzakm;->zzu(Lcom/google/android/gms/internal/ads/zzagb;I)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 504
    .line 505
    .line 506
    move-result-object v18

    .line 507
    add-int/lit8 v20, v6, 0x1

    .line 508
    .line 509
    aget-byte v6, v18, v6

    .line 510
    .line 511
    and-int/2addr v6, v15

    .line 512
    not-int v11, v11

    .line 513
    and-int/2addr v6, v11

    .line 514
    move v11, v5

    .line 515
    int-to-long v5, v6

    .line 516
    move/from16 v18, v11

    .line 517
    .line 518
    move/from16 v11, v20

    .line 519
    .line 520
    :goto_6
    if-ge v11, v14, :cond_13

    .line 521
    .line 522
    shl-long v5, v5, v19

    .line 523
    .line 524
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 525
    .line 526
    .line 527
    move-result-object v20

    .line 528
    add-int/lit8 v21, v11, 0x1

    .line 529
    .line 530
    aget-byte v11, v20, v11

    .line 531
    .line 532
    and-int/2addr v11, v15

    .line 533
    move/from16 v20, v9

    .line 534
    .line 535
    move/from16 v22, v10

    .line 536
    .line 537
    int-to-long v9, v11

    .line 538
    or-long/2addr v5, v9

    .line 539
    move/from16 v9, v20

    .line 540
    .line 541
    move/from16 v11, v21

    .line 542
    .line 543
    move/from16 v10, v22

    .line 544
    .line 545
    goto :goto_6

    .line 546
    :cond_13
    move/from16 v20, v9

    .line 547
    .line 548
    move/from16 v22, v10

    .line 549
    .line 550
    if-lez v8, :cond_16

    .line 551
    .line 552
    mul-int/lit8 v10, v22, 0x7

    .line 553
    .line 554
    add-int/lit8 v10, v10, 0x6

    .line 555
    .line 556
    const-wide/16 v21, 0x1

    .line 557
    .line 558
    shl-long v9, v21, v10

    .line 559
    .line 560
    const-wide/16 v21, -0x1

    .line 561
    .line 562
    add-long v9, v9, v21

    .line 563
    .line 564
    sub-long/2addr v5, v9

    .line 565
    goto :goto_7

    .line 566
    :cond_14
    move/from16 v18, v5

    .line 567
    .line 568
    move/from16 v20, v9

    .line 569
    .line 570
    move/from16 v22, v10

    .line 571
    .line 572
    add-int/lit8 v10, v22, 0x1

    .line 573
    .line 574
    move/from16 v11, v19

    .line 575
    .line 576
    goto :goto_5

    .line 577
    :cond_15
    move/from16 v18, v5

    .line 578
    .line 579
    move/from16 v20, v9

    .line 580
    .line 581
    move/from16 v19, v11

    .line 582
    .line 583
    const-wide/16 v5, 0x0

    .line 584
    .line 585
    :cond_16
    :goto_7
    const-wide/32 v9, -0x80000000

    .line 586
    .line 587
    .line 588
    cmp-long v9, v5, v9

    .line 589
    .line 590
    if-ltz v9, :cond_18

    .line 591
    .line 592
    const-wide/32 v9, 0x7fffffff

    .line 593
    .line 594
    .line 595
    cmp-long v9, v5, v9

    .line 596
    .line 597
    if-gtz v9, :cond_18

    .line 598
    .line 599
    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzab:[I

    .line 600
    .line 601
    long-to-int v5, v5

    .line 602
    if-eqz v8, :cond_17

    .line 603
    .line 604
    add-int/lit8 v6, v8, -0x1

    .line 605
    .line 606
    aget v6, v9, v6

    .line 607
    .line 608
    add-int/2addr v5, v6

    .line 609
    :cond_17
    aput v5, v9, v8

    .line 610
    .line 611
    add-int/2addr v12, v5

    .line 612
    add-int/lit8 v8, v8, 0x1

    .line 613
    .line 614
    move v6, v14

    .line 615
    move/from16 v10, v17

    .line 616
    .line 617
    move/from16 v5, v18

    .line 618
    .line 619
    move/from16 v11, v19

    .line 620
    .line 621
    move/from16 v9, v20

    .line 622
    .line 623
    goto/16 :goto_4

    .line 624
    .line 625
    :cond_18
    const-string v1, "EBML lacing sample size out of range."

    .line 626
    .line 627
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    throw v1

    .line 632
    :cond_19
    const-string v1, "No valid varint length mask found"

    .line 633
    .line 634
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 635
    .line 636
    .line 637
    move-result-object v1

    .line 638
    throw v1

    .line 639
    :cond_1a
    move/from16 v18, v5

    .line 640
    .line 641
    move/from16 v20, v9

    .line 642
    .line 643
    move/from16 v17, v10

    .line 644
    .line 645
    move/from16 v19, v11

    .line 646
    .line 647
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzab:[I

    .line 648
    .line 649
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzad:I

    .line 650
    .line 651
    sub-int/2addr v2, v5

    .line 652
    sub-int/2addr v2, v6

    .line 653
    sub-int/2addr v2, v12

    .line 654
    aput v2, v4, v14

    .line 655
    .line 656
    :goto_8
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    aget-byte v2, v2, v17

    .line 661
    .line 662
    shl-int/lit8 v2, v2, 0x8

    .line 663
    .line 664
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 665
    .line 666
    .line 667
    move-result-object v4

    .line 668
    aget-byte v4, v4, v20

    .line 669
    .line 670
    and-int/2addr v4, v15

    .line 671
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzU:J

    .line 672
    .line 673
    or-int/2addr v2, v4

    .line 674
    int-to-long v8, v2

    .line 675
    invoke-direct {v0, v8, v9}, Lcom/google/android/gms/internal/ads/zzakm;->zzA(J)J

    .line 676
    .line 677
    .line 678
    move-result-wide v8

    .line 679
    add-long/2addr v5, v8

    .line 680
    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzX:J

    .line 681
    .line 682
    iget v2, v3, Lcom/google/android/gms/internal/ads/zzakl;->zzf:I

    .line 683
    .line 684
    move/from16 v4, v20

    .line 685
    .line 686
    if-eq v2, v4, :cond_1b

    .line 687
    .line 688
    const/16 v2, 0xa3

    .line 689
    .line 690
    if-ne v1, v2, :cond_1d

    .line 691
    .line 692
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    aget-byte v1, v1, v18

    .line 697
    .line 698
    const/16 v2, 0x80

    .line 699
    .line 700
    and-int/2addr v1, v2

    .line 701
    if-ne v1, v2, :cond_1c

    .line 702
    .line 703
    const/16 v1, 0xa3

    .line 704
    .line 705
    :cond_1b
    const/4 v2, 0x1

    .line 706
    goto :goto_9

    .line 707
    :cond_1c
    move/from16 v2, v17

    .line 708
    .line 709
    const/16 v1, 0xa3

    .line 710
    .line 711
    goto :goto_9

    .line 712
    :cond_1d
    move/from16 v2, v17

    .line 713
    .line 714
    :goto_9
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzae:I

    .line 715
    .line 716
    move/from16 v11, v18

    .line 717
    .line 718
    iput v11, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzW:I

    .line 719
    .line 720
    move/from16 v2, v17

    .line 721
    .line 722
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzZ:I

    .line 723
    .line 724
    const/16 v2, 0xa3

    .line 725
    .line 726
    goto :goto_a

    .line 727
    :cond_1e
    const-string v1, "Unexpected lacing value: 2"

    .line 728
    .line 729
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    throw v1

    .line 734
    :cond_1f
    move v2, v8

    .line 735
    :goto_a
    if-ne v1, v2, :cond_21

    .line 736
    .line 737
    :goto_b
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzZ:I

    .line 738
    .line 739
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzaa:I

    .line 740
    .line 741
    if-ge v1, v2, :cond_20

    .line 742
    .line 743
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzab:[I

    .line 744
    .line 745
    aget v1, v2, v1

    .line 746
    .line 747
    const/4 v2, 0x0

    .line 748
    invoke-direct {v0, v7, v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzakm;->zzv(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzakl;IZ)I

    .line 749
    .line 750
    .line 751
    move-result v5

    .line 752
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzX:J

    .line 753
    .line 754
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzZ:I

    .line 755
    .line 756
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzakl;->zzg:I

    .line 757
    .line 758
    mul-int/2addr v4, v6

    .line 759
    div-int/lit16 v4, v4, 0x3e8

    .line 760
    .line 761
    int-to-long v8, v4

    .line 762
    add-long/2addr v1, v8

    .line 763
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzae:I

    .line 764
    .line 765
    const/4 v6, 0x0

    .line 766
    move-wide/from16 v23, v1

    .line 767
    .line 768
    move-object v1, v3

    .line 769
    move-wide/from16 v2, v23

    .line 770
    .line 771
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzakm;->zzt(Lcom/google/android/gms/internal/ads/zzakl;JIII)V

    .line 772
    .line 773
    .line 774
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzZ:I

    .line 775
    .line 776
    const/4 v4, 0x1

    .line 777
    add-int/2addr v2, v4

    .line 778
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzZ:I

    .line 779
    .line 780
    move-object v3, v1

    .line 781
    goto :goto_b

    .line 782
    :cond_20
    const/4 v2, 0x0

    .line 783
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzW:I

    .line 784
    .line 785
    return-void

    .line 786
    :cond_21
    move-object v1, v3

    .line 787
    const/4 v4, 0x1

    .line 788
    :goto_c
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzZ:I

    .line 789
    .line 790
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzaa:I

    .line 791
    .line 792
    if-ge v2, v3, :cond_22

    .line 793
    .line 794
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzab:[I

    .line 795
    .line 796
    aget v5, v3, v2

    .line 797
    .line 798
    invoke-direct {v0, v7, v1, v5, v4}, Lcom/google/android/gms/internal/ads/zzakm;->zzv(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzakl;IZ)I

    .line 799
    .line 800
    .line 801
    move-result v5

    .line 802
    aput v5, v3, v2

    .line 803
    .line 804
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzZ:I

    .line 805
    .line 806
    add-int/2addr v2, v4

    .line 807
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzakm;->zzZ:I

    .line 808
    .line 809
    goto :goto_c

    .line 810
    :cond_22
    :goto_d
    return-void
.end method
