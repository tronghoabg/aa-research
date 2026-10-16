.class public final synthetic Lcom/applovin/mediation/adapters/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/publisher/NativeAd;


# direct methods
.method public synthetic constructor <init>(Lcom/moloco/sdk/publisher/NativeAd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/applovin/mediation/adapters/g;->a:Lcom/moloco/sdk/publisher/NativeAd;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/mediation/adapters/g;->a:Lcom/moloco/sdk/publisher/NativeAd;

    invoke-static {v0, p1}, Lcom/applovin/mediation/adapters/MolocoMediationAdapter$MaxMolocoNativeAd;->a(Lcom/moloco/sdk/publisher/NativeAd;Landroid/view/View;)V

    return-void
.end method
