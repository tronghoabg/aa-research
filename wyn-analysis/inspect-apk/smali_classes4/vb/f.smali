.class public final Lvb/f;
.super Lrb/b;
.source "SourceFile"


# instance fields
.field public final b:Lvb/c;

.field public final c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

.field public final d:Lrb/i;

.field public final e:Lvb/e;

.field public final f:Lrb/g;


# direct methods
.method public constructor <init>(Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;Lvb/c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lrb/i;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, v1}, Lrb/i;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lvb/f;->d:Lrb/i;

    .line 11
    .line 12
    new-instance v0, Lvb/e;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lvb/e;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lvb/f;->e:Lvb/e;

    .line 18
    .line 19
    new-instance v0, Lrb/g;

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    invoke-direct {v0, p0, v1}, Lrb/g;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lvb/f;->f:Lrb/g;

    .line 26
    .line 27
    iput-object p1, p0, Lvb/f;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

    .line 28
    .line 29
    iput-object p2, p0, Lvb/f;->b:Lvb/c;

    .line 30
    .line 31
    return-void
.end method
