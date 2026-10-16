.class public final Lcom/google/android/gms/internal/ads/zzbfm;
.super LD6/a0;
.source "SourceFile"


# instance fields
.field private final zza:Ly6/f;


# direct methods
.method public constructor <init>(Ly6/f;)V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.client.IAppEventListener"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbem;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbfm;->zza:Ly6/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final zzb(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbfm;->zza:Ly6/f;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ly6/f;->onAppEvent(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzc()Ly6/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbfm;->zza:Ly6/f;

    .line 2
    .line 3
    return-object v0
.end method
