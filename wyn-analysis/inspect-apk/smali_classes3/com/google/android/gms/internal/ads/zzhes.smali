.class public final Lcom/google/android/gms/internal/ads/zzhes;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzhes;

.field public static final zzb:Lcom/google/android/gms/internal/ads/zzhes;

.field public static final zzc:Lcom/google/android/gms/internal/ads/zzhes;

.field public static final zzd:Lcom/google/android/gms/internal/ads/zzhes;

.field public static final zze:Lcom/google/android/gms/internal/ads/zzhes;


# instance fields
.field private final zzf:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhes;

    const-string v1, "UNKNOWN_KEYMATERIAL"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzhes;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhes;->zza:Lcom/google/android/gms/internal/ads/zzhes;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhes;

    const-string v1, "SYMMETRIC"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzhes;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhes;->zzb:Lcom/google/android/gms/internal/ads/zzhes;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhes;

    const-string v1, "ASYMMETRIC_PRIVATE"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzhes;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhes;->zzc:Lcom/google/android/gms/internal/ads/zzhes;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhes;

    const-string v1, "ASYMMETRIC_PUBLIC"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzhes;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhes;->zzd:Lcom/google/android/gms/internal/ads/zzhes;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhes;

    const-string v1, "REMOTE"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzhes;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhes;->zze:Lcom/google/android/gms/internal/ads/zzhes;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhes;->zzf:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhes;->zzf:Ljava/lang/String;

    return-object v0
.end method
