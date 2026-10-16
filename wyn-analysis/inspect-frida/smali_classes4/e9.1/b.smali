.class public final Le9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/ads/nativead/l;

.field public final b:Lf9/a;


# direct methods
.method public constructor <init>(Lf9/a;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Le9/b;->b:Lf9/a;

    .line 8
    .line 9
    iput-object p1, p0, Le9/b;->a:Lcom/google/android/gms/ads/nativead/l;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-wide v0, p1, Lf9/a;->d:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iput-wide v0, p1, Lf9/a;->d:J

    .line 25
    .line 26
    :cond_1
    iput-object p1, p0, Le9/b;->b:Lf9/a;

    .line 27
    .line 28
    new-instance v0, Lcom/google/android/gms/ads/nativead/l;

    .line 29
    .line 30
    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/nativead/l;-><init>(Lf9/a;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Le9/b;->a:Lcom/google/android/gms/ads/nativead/l;

    .line 34
    .line 35
    return-void
.end method
