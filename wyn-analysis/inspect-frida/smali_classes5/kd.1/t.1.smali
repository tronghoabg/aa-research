.class public final Lkd/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lkd/i;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkd/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkd/t;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lkd/t;->b:Lkd/i;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public postMessage(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, Lkd/t;->b:Lkd/i;

    .line 2
    .line 3
    new-instance v1, Lcom/applovin/impl/sdk/nativeAd/e;

    .line 4
    .line 5
    const/16 v2, 0x1b

    .line 6
    .line 7
    invoke-direct {v1, v2, p0, p1}, Lcom/applovin/impl/sdk/nativeAd/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, v0, Lkd/i;->a:LC8/i;

    .line 11
    .line 12
    invoke-virtual {p1, v1}, LC8/i;->x(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
