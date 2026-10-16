.class final synthetic Lcom/google/android/gms/internal/ads/zzhnd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhoi;


# static fields
.field static final synthetic zza:Lcom/google/android/gms/internal/ads/zzhnd;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhnd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhnd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhnd;->zza:Lcom/google/android/gms/internal/ads/zzhnd;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza()Ljava/lang/Object;
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhne;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhne;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhnc;->zza:Lcom/google/android/gms/internal/ads/zzhnc;

    .line 7
    .line 8
    new-instance v2, Lcom/google/android/gms/internal/ads/zzhmf;

    .line 9
    .line 10
    const-class v3, Lcom/google/android/gms/internal/ads/zzhmm;

    .line 11
    .line 12
    const-class v4, Lcom/google/android/gms/internal/ads/zzhnz;

    .line 13
    .line 14
    invoke-direct {v2, v3, v4, v1}, Lcom/google/android/gms/internal/ads/zzhmf;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzhmg;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzhne;->zzb(Lcom/google/android/gms/internal/ads/zzhmh;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
