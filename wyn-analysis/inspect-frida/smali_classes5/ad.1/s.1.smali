.class public final Lad/s;
.super Lad/w;
.source "SourceFile"


# instance fields
.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lad/r;Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 p2, 0x1

    .line 2
    if-nez p3, :cond_0

    .line 3
    .line 4
    sget-object v0, Lcom/google/android/gms/ads/AdSize;->i:Lcom/google/android/gms/ads/AdSize;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {p1, p4, v0}, LH6/f;->k(Landroid/content/Context;II)Lcom/google/android/gms/ads/AdSize;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-boolean p2, p1, Lcom/google/android/gms/ads/AdSize;->d:Z

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string v0, "portrait"

    .line 15
    .line 16
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget-object v0, Lcom/google/android/gms/ads/AdSize;->i:Lcom/google/android/gms/ads/AdSize;

    .line 23
    .line 24
    invoke-static {p1, p4, p2}, LH6/f;->k(Landroid/content/Context;II)Lcom/google/android/gms/ads/AdSize;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-boolean p2, p1, Lcom/google/android/gms/ads/AdSize;->d:Z

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const-string v0, "landscape"

    .line 32
    .line 33
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    sget-object v0, Lcom/google/android/gms/ads/AdSize;->i:Lcom/google/android/gms/ads/AdSize;

    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    invoke-static {p1, p4, v0}, LH6/f;->k(Landroid/content/Context;II)Lcom/google/android/gms/ads/AdSize;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-boolean p2, p1, Lcom/google/android/gms/ads/AdSize;->d:Z

    .line 47
    .line 48
    :goto_0
    invoke-direct {p0, p1}, Lad/w;-><init>(Lcom/google/android/gms/ads/AdSize;)V

    .line 49
    .line 50
    .line 51
    iput-object p3, p0, Lad/s;->d:Ljava/lang/String;

    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 55
    .line 56
    const-string p2, "Unexpected value for orientation: "

    .line 57
    .line 58
    invoke-virtual {p2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method
