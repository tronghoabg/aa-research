.class public final Lrb/c;
.super Lrb/a;
.source "SourceFile"


# instance fields
.field public h:Lcom/unity3d/services/banners/BannerView;

.field public i:I

.field public j:I

.field public k:Lx6/h;


# virtual methods
.method public final c(Lx6/g;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lrb/c;->h:Lcom/unity3d/services/banners/BannerView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lrb/c;->k:Lx6/h;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/ads/AdSize;

    .line 13
    .line 14
    iget v2, p0, Lrb/c;->i:I

    .line 15
    .line 16
    iget v3, p0, Lrb/c;->j:I

    .line 17
    .line 18
    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/ads/AdSize;-><init>(II)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lx6/j;->setAdSize(Lcom/google/android/gms/ads/AdSize;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lrb/a;->d:Lnb/c;

    .line 25
    .line 26
    iget-object v0, v0, Lnb/c;->c:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Lx6/j;->setAdUnitId(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lrb/a;->g:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lrb/b;

    .line 34
    .line 35
    check-cast v0, Lrb/e;

    .line 36
    .line 37
    iget-object v0, v0, Lrb/e;->d:Lrb/d;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Lx6/j;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p1}, Lx6/j;->b(Lx6/g;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method
