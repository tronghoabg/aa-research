.class final synthetic Lcom/google/android/gms/internal/ads/zzhgv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhma;


# static fields
.field static final synthetic zza:Lcom/google/android/gms/internal/ads/zzhgv;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhgv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhgv;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhgv;->zza:Lcom/google/android/gms/internal/ads/zzhgv;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzheq;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/zzhdz;
    .locals 1

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzhgz;

    .line 2
    .line 3
    sget v0, Lcom/google/android/gms/internal/ads/zzhgx;->zza:I

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhgz;->zzc()Lcom/google/android/gms/internal/ads/zzhgy;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/16 v0, 0x20

    .line 10
    .line 11
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzibm;->zzb(I)Lcom/google/android/gms/internal/ads/zzibm;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzhgu;->zzd(Lcom/google/android/gms/internal/ads/zzhgy;Lcom/google/android/gms/internal/ads/zzibm;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/zzhgu;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
