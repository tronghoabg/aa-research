.class public final Lcom/google/android/gms/internal/ads/zzbup;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final zza:LG6/r;

.field static final zzb:LG6/r;


# instance fields
.field private final zzc:Lcom/google/android/gms/internal/ads/zzbub;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbun;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbun;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbup;->zza:LG6/r;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbuo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbuo;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbup;->zzb:LG6/r;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LH6/a;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfqt;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbub;

    .line 5
    .line 6
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbup;->zza:LG6/r;

    .line 7
    .line 8
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbup;->zzb:LG6/r;

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    move-object v2, p2

    .line 12
    move-object v3, p3

    .line 13
    move-object v6, p4

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzbub;-><init>(Landroid/content/Context;LH6/a;Ljava/lang/String;LG6/r;LG6/r;Lcom/google/android/gms/internal/ads/zzfqt;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbup;->zzc:Lcom/google/android/gms/internal/ads/zzbub;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbui;Lcom/google/android/gms/internal/ads/zzbuh;)Lcom/google/android/gms/internal/ads/zzbuf;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbut;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbup;->zzc:Lcom/google/android/gms/internal/ads/zzbub;

    invoke-direct {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzbut;-><init>(Lcom/google/android/gms/internal/ads/zzbub;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbui;Lcom/google/android/gms/internal/ads/zzbuh;)V

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzbuy;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbuy;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbup;->zzc:Lcom/google/android/gms/internal/ads/zzbub;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbuy;-><init>(Lcom/google/android/gms/internal/ads/zzbub;)V

    return-object v0
.end method

.method public final zzc()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbup;->zzc:Lcom/google/android/gms/internal/ads/zzbub;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbub;->zzc()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
