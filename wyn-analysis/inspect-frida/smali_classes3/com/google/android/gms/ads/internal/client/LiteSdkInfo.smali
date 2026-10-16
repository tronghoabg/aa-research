.class public Lcom/google/android/gms/ads/internal/client/LiteSdkInfo;
.super LD6/i0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    const-string p1, "com.google.android.gms.ads.internal.client.ILiteSdkInfo"

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbem;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getAdapterCreator()Lcom/google/android/gms/internal/ads/zzbvj;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbvf;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbvf;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public getLiteSdkVersion()LD6/d1;
    .locals 4

    .line 1
    new-instance v0, LD6/d1;

    .line 2
    .line 3
    const v1, 0xf2edf10

    .line 4
    .line 5
    .line 6
    const v2, 0xf9960b0

    .line 7
    .line 8
    .line 9
    const-string v3, "25.3.0"

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3}, LD6/d1;-><init>(IILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
