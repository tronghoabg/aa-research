.class public Lcom/applovin/applovin_max/AppLovinMAX$AdViewSize;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/applovin/applovin_max/AppLovinMAX;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AdViewSize"
.end annotation


# instance fields
.field public final heightDp:I

.field public final widthDp:I


# direct methods
.method private constructor <init>(II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/applovin/applovin_max/AppLovinMAX$AdViewSize;->widthDp:I

    .line 4
    iput p2, p0, Lcom/applovin/applovin_max/AppLovinMAX$AdViewSize;->heightDp:I

    return-void
.end method

.method public synthetic constructor <init>(IILcom/applovin/applovin_max/AppLovinMAX$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/applovin/applovin_max/AppLovinMAX$AdViewSize;-><init>(II)V

    return-void
.end method
