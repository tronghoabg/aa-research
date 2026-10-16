.class public final Lcom/google/android/gms/internal/ads/zzein;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final zzd:Lcom/google/android/gms/internal/ads/zzbui;


# instance fields
.field public final zza:Lcom/google/android/gms/internal/ads/zzeit;

.field public final zzb:Lorg/json/JSONObject;

.field public final zzc:Lcom/google/android/gms/internal/ads/zzcbm;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzeim;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzeim;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzein;->zzd:Lcom/google/android/gms/internal/ads/zzbui;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzeit;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzcbm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzein;->zza:Lcom/google/android/gms/internal/ads/zzeit;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzein;->zzb:Lorg/json/JSONObject;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzein;->zzc:Lcom/google/android/gms/internal/ads/zzcbm;

    return-void
.end method
