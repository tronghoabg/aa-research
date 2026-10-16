.class final synthetic Lcom/google/android/gms/internal/ads/zzfjq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfhs;


# static fields
.field static final synthetic zza:Lcom/google/android/gms/internal/ads/zzfjq;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfjq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfjq;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfjq;->zza:Lcom/google/android/gms/internal/ads/zzfjq;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LR6/a;

    invoke-interface {p1}, LR6/a;->onAdMetadataChanged()V

    return-void
.end method
