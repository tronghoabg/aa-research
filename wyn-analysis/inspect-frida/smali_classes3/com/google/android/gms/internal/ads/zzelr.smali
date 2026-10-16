.class public final enum Lcom/google/android/gms/internal/ads/zzelr;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/ads/zzelr;

.field public static final enum zzb:Lcom/google/android/gms/internal/ads/zzelr;

.field public static final enum zzc:Lcom/google/android/gms/internal/ads/zzelr;

.field private static final synthetic zze:[Lcom/google/android/gms/internal/ads/zzelr;


# instance fields
.field private final zzd:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzelr;

    .line 2
    .line 3
    const-string v1, "HTML_DISPLAY"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "htmlDisplay"

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzelr;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/google/android/gms/internal/ads/zzelr;->zza:Lcom/google/android/gms/internal/ads/zzelr;

    .line 12
    .line 13
    new-instance v1, Lcom/google/android/gms/internal/ads/zzelr;

    .line 14
    .line 15
    const-string v3, "NATIVE_DISPLAY"

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    const-string v5, "nativeDisplay"

    .line 19
    .line 20
    invoke-direct {v1, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzelr;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lcom/google/android/gms/internal/ads/zzelr;->zzb:Lcom/google/android/gms/internal/ads/zzelr;

    .line 24
    .line 25
    new-instance v3, Lcom/google/android/gms/internal/ads/zzelr;

    .line 26
    .line 27
    const-string v5, "VIDEO"

    .line 28
    .line 29
    const/4 v6, 0x2

    .line 30
    const-string v7, "video"

    .line 31
    .line 32
    invoke-direct {v3, v5, v6, v7}, Lcom/google/android/gms/internal/ads/zzelr;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v3, Lcom/google/android/gms/internal/ads/zzelr;->zzc:Lcom/google/android/gms/internal/ads/zzelr;

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    new-array v5, v5, [Lcom/google/android/gms/internal/ads/zzelr;

    .line 39
    .line 40
    aput-object v0, v5, v2

    .line 41
    .line 42
    aput-object v1, v5, v4

    .line 43
    .line 44
    aput-object v3, v5, v6

    .line 45
    .line 46
    sput-object v5, Lcom/google/android/gms/internal/ads/zzelr;->zze:[Lcom/google/android/gms/internal/ads/zzelr;

    .line 47
    .line 48
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzelr;->zzd:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/zzelr;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzelr;->zze:[Lcom/google/android/gms/internal/ads/zzelr;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/zzelr;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/google/android/gms/internal/ads/zzelr;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzelr;->zzd:Ljava/lang/String;

    return-object v0
.end method
