.class public interface abstract Lcom/moloco/sdk/publisher/NativeAd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/publisher/AdLoad;
.implements Lcom/moloco/sdk/publisher/Destroyable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/moloco/sdk/publisher/NativeAd$Assets;,
        Lcom/moloco/sdk/publisher/NativeAd$InteractionListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008f\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0011\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H&\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000b8&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/moloco/sdk/publisher/NativeAd;",
        "Lcom/moloco/sdk/publisher/AdLoad;",
        "Lcom/moloco/sdk/publisher/Destroyable;",
        "Lef/C;",
        "handleImpression",
        "()V",
        "handleGeneralAdClick",
        "Lcom/moloco/sdk/publisher/NativeAd$Assets;",
        "getAssets",
        "()Lcom/moloco/sdk/publisher/NativeAd$Assets;",
        "assets",
        "Lcom/moloco/sdk/publisher/NativeAd$InteractionListener;",
        "getInteractionListener",
        "()Lcom/moloco/sdk/publisher/NativeAd$InteractionListener;",
        "setInteractionListener",
        "(Lcom/moloco/sdk/publisher/NativeAd$InteractionListener;)V",
        "interactionListener",
        "InteractionListener",
        "Assets",
        "moloco-sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getAssets()Lcom/moloco/sdk/publisher/NativeAd$Assets;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getInteractionListener()Lcom/moloco/sdk/publisher/NativeAd$InteractionListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract handleGeneralAdClick()V
.end method

.method public abstract handleImpression()V
.end method

.method public abstract setInteractionListener(Lcom/moloco/sdk/publisher/NativeAd$InteractionListener;)V
    .param p1    # Lcom/moloco/sdk/publisher/NativeAd$InteractionListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method
