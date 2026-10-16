.class public final synthetic Lcom/applovin/mediation/adapters/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/gms/ads/nativead/MediaView;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/ads/nativead/MediaView;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/applovin/mediation/adapters/a;->a:I

    iput-object p1, p0, Lcom/applovin/mediation/adapters/a;->b:Lcom/google/android/gms/ads/nativead/MediaView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/applovin/mediation/adapters/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/applovin/mediation/adapters/a;->b:Lcom/google/android/gms/ads/nativead/MediaView;

    check-cast v0, Lcom/applovin/mediation/adapters/GoogleMediationAdapter$AutoMeasuringMediaView;

    invoke-static {v0}, Lcom/applovin/mediation/adapters/GoogleMediationAdapter$AutoMeasuringMediaView;->a(Lcom/applovin/mediation/adapters/GoogleMediationAdapter$AutoMeasuringMediaView;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/applovin/mediation/adapters/a;->b:Lcom/google/android/gms/ads/nativead/MediaView;

    check-cast v0, Lcom/applovin/mediation/adapters/GoogleAdManagerMediationAdapter$AutoMeasuringMediaView;

    invoke-static {v0}, Lcom/applovin/mediation/adapters/GoogleAdManagerMediationAdapter$AutoMeasuringMediaView;->a(Lcom/applovin/mediation/adapters/GoogleAdManagerMediationAdapter$AutoMeasuringMediaView;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
