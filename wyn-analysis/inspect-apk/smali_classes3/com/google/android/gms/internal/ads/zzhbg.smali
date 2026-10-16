.class final synthetic Lcom/google/android/gms/internal/ads/zzhbg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzhbh;

.field private final synthetic zzb:I

.field private final synthetic zzc:Lp8/p;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzhbh;ILp8/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhbg;->zza:Lcom/google/android/gms/internal/ads/zzhbh;

    .line 5
    .line 6
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzhbg;->zzb:I

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzhbg;->zzc:Lp8/p;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhbg;->zza:Lcom/google/android/gms/internal/ads/zzhbh;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzhbg;->zzb:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzhbg;->zzc:Lp8/p;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhbh;->zzy(ILp8/p;)V

    return-void
.end method
