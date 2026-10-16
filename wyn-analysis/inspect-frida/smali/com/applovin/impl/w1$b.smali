.class Lcom/applovin/impl/w1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/impl/sdk/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/w1;-><init>(Lcom/applovin/impl/sdk/ad/b;Landroid/app/Activity;Ljava/util/Map;Lcom/applovin/impl/sdk/k;Lcom/applovin/sdk/AppLovinAdClickListener;Lcom/applovin/sdk/AppLovinAdDisplayListener;Lcom/applovin/sdk/AppLovinAdVideoPlaybackListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/applovin/impl/w1;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/w1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/w1$b;->a:Lcom/applovin/impl/w1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/w1$b;->a:Lcom/applovin/impl/w1;

    .line 2
    .line 3
    iget v1, v0, Lcom/applovin/impl/w1;->A:I

    .line 4
    .line 5
    sget v2, Lcom/applovin/impl/sdk/i;->h:I

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, v0, Lcom/applovin/impl/w1;->B:Z

    .line 11
    .line 12
    :cond_0
    invoke-static {v0}, Lcom/applovin/impl/w1;->a(Lcom/applovin/impl/w1;)Lcom/applovin/adview/AppLovinAdView;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lcom/applovin/adview/AppLovinAdView;->getController()Lcom/applovin/impl/adview/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lcom/applovin/impl/adview/a;->f()Lcom/applovin/impl/adview/b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/applovin/impl/w1$b;->a:Lcom/applovin/impl/w1;

    .line 27
    .line 28
    iget-object v0, v0, Lcom/applovin/impl/w1;->c:Lcom/applovin/impl/sdk/o;

    .line 29
    .line 30
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    iget-object v0, p0, Lcom/applovin/impl/w1$b;->a:Lcom/applovin/impl/w1;

    .line 37
    .line 38
    iget-object v0, v0, Lcom/applovin/impl/w1;->c:Lcom/applovin/impl/sdk/o;

    .line 39
    .line 40
    const-string v1, "AppLovinFullscreenActivity"

    .line 41
    .line 42
    const-string v2, "Unable to handle ringer mode change: no valid web view."

    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Lcom/applovin/impl/sdk/o;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-static {p1}, Lcom/applovin/impl/sdk/i;->a(I)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iget-object v1, p0, Lcom/applovin/impl/w1$b;->a:Lcom/applovin/impl/w1;

    .line 55
    .line 56
    iget v1, v1, Lcom/applovin/impl/w1;->A:I

    .line 57
    .line 58
    invoke-static {v1}, Lcom/applovin/impl/sdk/i;->a(I)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_2

    .line 63
    .line 64
    const-string v1, "javascript:al_muteSwitchOn();"

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lcom/applovin/impl/adview/b;->a(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    const/4 v1, 0x2

    .line 71
    if-ne p1, v1, :cond_3

    .line 72
    .line 73
    const-string v1, "javascript:al_muteSwitchOff();"

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lcom/applovin/impl/adview/b;->a(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/applovin/impl/w1$b;->a:Lcom/applovin/impl/w1;

    .line 79
    .line 80
    iput p1, v0, Lcom/applovin/impl/w1;->A:I

    .line 81
    .line 82
    return-void
.end method
