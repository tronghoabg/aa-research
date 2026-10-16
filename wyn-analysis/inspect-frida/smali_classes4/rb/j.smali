.class public final Lrb/j;
.super Lrb/b;
.source "SourceFile"


# instance fields
.field public final b:Lrb/f;

.field public final c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

.field public final d:Lrb/i;

.field public final e:Lcom/google/android/gms/ads/nativead/l;

.field public final f:Lrb/g;


# direct methods
.method public constructor <init>(Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;Lrb/f;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lrb/i;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lrb/i;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lrb/j;->d:Lrb/i;

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/ads/nativead/l;

    .line 13
    .line 14
    const/16 v1, 0x12

    .line 15
    .line 16
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/ads/nativead/l;-><init>(Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lrb/j;->e:Lcom/google/android/gms/ads/nativead/l;

    .line 20
    .line 21
    new-instance v0, Lrb/g;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-direct {v0, p0, v1}, Lrb/g;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lrb/j;->f:Lrb/g;

    .line 28
    .line 29
    iput-object p1, p0, Lrb/j;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

    .line 30
    .line 31
    iput-object p2, p0, Lrb/j;->b:Lrb/f;

    .line 32
    .line 33
    return-void
.end method
