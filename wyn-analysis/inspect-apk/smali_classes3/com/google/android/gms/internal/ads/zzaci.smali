.class final synthetic Lcom/google/android/gms/internal/ads/zzaci;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field static final synthetic zza:Lcom/google/android/gms/internal/ads/zzaci;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaci;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaci;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaci;->zza:Lcom/google/android/gms/internal/ads/zzaci;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p2, Lcom/google/android/gms/internal/ads/zzacg;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/gms/internal/ads/zzacg;

    .line 4
    .line 5
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzacg;->zza:I

    .line 6
    .line 7
    iget p2, p2, Lcom/google/android/gms/internal/ads/zzacg;->zza:I

    .line 8
    .line 9
    sub-int/2addr p1, p2

    .line 10
    return p1
.end method
