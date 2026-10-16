.class public final Lrb/h;
.super Lrb/b;
.source "SourceFile"


# instance fields
.field public final b:Lrb/f;

.field public final c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

.field public final d:Lad/G;

.field public final e:Lrb/g;


# direct methods
.method public constructor <init>(Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;Lrb/f;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lad/G;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, v1}, Lad/G;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lrb/h;->d:Lad/G;

    .line 11
    .line 12
    new-instance v0, Lrb/g;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, v1}, Lrb/g;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lrb/h;->e:Lrb/g;

    .line 19
    .line 20
    iput-object p1, p0, Lrb/h;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

    .line 21
    .line 22
    iput-object p2, p0, Lrb/h;->b:Lrb/f;

    .line 23
    .line 24
    return-void
.end method
