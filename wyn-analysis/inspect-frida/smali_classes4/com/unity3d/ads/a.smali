.class public final synthetic Lcom/unity3d/ads/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/unity3d/ads/LoadListener;

.field public final synthetic c:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Lcom/unity3d/ads/LoadListener;Ljava/lang/Throwable;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/unity3d/ads/a;->a:I

    iput-object p1, p0, Lcom/unity3d/ads/a;->b:Lcom/unity3d/ads/LoadListener;

    iput-object p2, p0, Lcom/unity3d/ads/a;->c:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/unity3d/ads/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/unity3d/ads/a;->c:Ljava/lang/Throwable;

    iget-object v1, p0, Lcom/unity3d/ads/a;->b:Lcom/unity3d/ads/LoadListener;

    invoke-static {v1, v0}, Lcom/unity3d/ads/RewardedAd$Companion$load$1;->d(Lcom/unity3d/ads/LoadListener;Ljava/lang/Throwable;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/unity3d/ads/a;->c:Ljava/lang/Throwable;

    iget-object v1, p0, Lcom/unity3d/ads/a;->b:Lcom/unity3d/ads/LoadListener;

    invoke-static {v1, v0}, Lcom/unity3d/ads/InterstitialAd$Companion$load$1;->d(Lcom/unity3d/ads/LoadListener;Ljava/lang/Throwable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
