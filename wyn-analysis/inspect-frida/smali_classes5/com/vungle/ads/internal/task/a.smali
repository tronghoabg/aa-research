.class public final Lcom/vungle/ads/internal/task/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a()Lcom/vungle/ads/internal/task/f;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Lcom/vungle/ads/internal/task/a;->a(Ljava/lang/String;)Lcom/vungle/ads/internal/task/f;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Lcom/vungle/ads/internal/task/f;
    .locals 4

    .line 2
    new-instance v0, Lcom/vungle/ads/internal/task/f;

    const-string v1, "CleanupJob"

    invoke-direct {v0, v1}, Lcom/vungle/ads/internal/task/f;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 3
    iput v1, v0, Lcom/vungle/ads/internal/task/f;->e:I

    .line 4
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    if-eqz p0, :cond_0

    .line 5
    const-string v3, "AD_ID_KEY"

    invoke-virtual {v2, v3, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    :cond_0
    invoke-virtual {v0, v2}, Lcom/vungle/ads/internal/task/f;->a(Landroid/os/Bundle;)Lcom/vungle/ads/internal/task/f;

    move-result-object v0

    if-nez p0, :cond_1

    const/4 v1, 0x1

    .line 7
    :cond_1
    iput-boolean v1, v0, Lcom/vungle/ads/internal/task/f;->b:Z

    return-object v0
.end method
