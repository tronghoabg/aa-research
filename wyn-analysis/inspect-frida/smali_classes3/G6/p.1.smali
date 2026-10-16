.class public abstract LG6/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/lang/Runnable;

.field private volatile zzb:Ljava/lang/Thread;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LA7/V;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LA7/V;-><init>(LG6/p;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LG6/p;->zza:Ljava/lang/Runnable;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public abstract zza()V
.end method

.method public zzb()Lp8/p;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcfy;->zza:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 2
    .line 3
    iget-object v1, p0, LG6/p;->zza:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzhcp;->zza(Ljava/lang/Runnable;)Lp8/p;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final synthetic zzc(Ljava/lang/Thread;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG6/p;->zzb:Ljava/lang/Thread;

    .line 2
    .line 3
    return-void
.end method
