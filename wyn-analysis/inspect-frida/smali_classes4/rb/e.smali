.class public final Lrb/e;
.super Lrb/b;
.source "SourceFile"


# instance fields
.field public final b:Lcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;

.field public final c:Lrb/c;

.field public final d:Lrb/d;


# direct methods
.method public constructor <init>(Lcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;Lrb/c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lrb/d;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lrb/d;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lrb/e;->d:Lrb/d;

    .line 11
    .line 12
    iput-object p1, p0, Lrb/e;->b:Lcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;

    .line 13
    .line 14
    iput-object p2, p0, Lrb/e;->c:Lrb/c;

    .line 15
    .line 16
    return-void
.end method
