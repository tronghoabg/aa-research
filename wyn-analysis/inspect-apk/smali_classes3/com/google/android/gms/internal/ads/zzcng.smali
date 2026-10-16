.class final synthetic Lcom/google/android/gms/internal/ads/zzcng;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzcnj;

.field private final synthetic zzb:Landroid/content/Context;

.field private final synthetic zzc:LH6/a;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcnj;Landroid/content/Context;LH6/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcng;->zza:Lcom/google/android/gms/internal/ads/zzcnj;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcng;->zzb:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcng;->zzc:LH6/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcng;->zza:Lcom/google/android/gms/internal/ads/zzcnj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcng;->zzb:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcng;->zzc:LH6/a;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzcnj;->zzb(Landroid/content/Context;LH6/a;)V

    return-void
.end method
