.class public final Lad/u;
.super Lad/w;
.source "SourceFile"


# instance fields
.field public final d:Ljava/lang/Integer;

.field public final e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lad/r;Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/Integer;)V
    .locals 3

    .line 1
    if-eqz p4, :cond_3

    .line 2
    .line 3
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, -0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    sget-object p1, Lcom/google/android/gms/ads/AdSize;->i:Lcom/google/android/gms/ads/AdSize;

    .line 13
    .line 14
    invoke-static {p2, v2}, LH6/f;->p(Landroid/content/Context;I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    new-instance p2, Lcom/google/android/gms/ads/AdSize;

    .line 19
    .line 20
    invoke-direct {p2, p3, v1}, Lcom/google/android/gms/ads/AdSize;-><init>(II)V

    .line 21
    .line 22
    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    sget-object p2, Lcom/google/android/gms/ads/AdSize;->n:Lcom/google/android/gms/ads/AdSize;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput p1, p2, Lcom/google/android/gms/ads/AdSize;->f:I

    .line 29
    .line 30
    iput-boolean v2, p2, Lcom/google/android/gms/ads/AdSize;->e:Z

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    sget-object p1, Lcom/google/android/gms/ads/AdSize;->i:Lcom/google/android/gms/ads/AdSize;

    .line 34
    .line 35
    const/4 p1, 0x2

    .line 36
    invoke-static {p2, p1}, LH6/f;->p(Landroid/content/Context;I)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    new-instance p2, Lcom/google/android/gms/ads/AdSize;

    .line 41
    .line 42
    invoke-direct {p2, p3, v1}, Lcom/google/android/gms/ads/AdSize;-><init>(II)V

    .line 43
    .line 44
    .line 45
    if-ne p1, v0, :cond_2

    .line 46
    .line 47
    sget-object p2, Lcom/google/android/gms/ads/AdSize;->n:Lcom/google/android/gms/ads/AdSize;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iput p1, p2, Lcom/google/android/gms/ads/AdSize;->f:I

    .line 51
    .line 52
    iput-boolean v2, p2, Lcom/google/android/gms/ads/AdSize;->e:Z

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    if-eqz p5, :cond_4

    .line 56
    .line 57
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-static {p3, p1}, Lcom/google/android/gms/ads/AdSize;->d(II)Lcom/google/android/gms/ads/AdSize;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    invoke-static {p2, p3}, Lcom/google/android/gms/ads/AdSize;->b(Landroid/content/Context;I)Lcom/google/android/gms/ads/AdSize;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    :goto_0
    invoke-direct {p0, p2}, Lad/w;-><init>(Lcom/google/android/gms/ads/AdSize;)V

    .line 71
    .line 72
    .line 73
    iput-object p4, p0, Lad/u;->d:Ljava/lang/Integer;

    .line 74
    .line 75
    iput-object p5, p0, Lad/u;->e:Ljava/lang/Integer;

    .line 76
    .line 77
    return-void
.end method
