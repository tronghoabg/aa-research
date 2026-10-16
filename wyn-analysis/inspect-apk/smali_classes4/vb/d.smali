.class public final Lvb/d;
.super Lrb/b;
.source "SourceFile"


# instance fields
.field public final b:Lvb/c;

.field public final c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

.field public final d:Lad/G;

.field public final e:Lrb/g;


# direct methods
.method public constructor <init>(Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;Lvb/c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lad/G;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, p0, v1}, Lad/G;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lvb/d;->d:Lad/G;

    .line 11
    .line 12
    new-instance v0, Lrb/g;

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lrb/g;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lvb/d;->e:Lrb/g;

    .line 18
    .line 19
    iput-object p1, p0, Lvb/d;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

    .line 20
    .line 21
    iput-object p2, p0, Lvb/d;->b:Lvb/c;

    .line 22
    .line 23
    return-void
.end method
