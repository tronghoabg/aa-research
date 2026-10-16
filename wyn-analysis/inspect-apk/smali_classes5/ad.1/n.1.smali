.class public Lad/n;
.super Lad/i;
.source "SourceFile"

# interfaces
.implements Lad/k;


# instance fields
.field public final b:LG9/e;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/List;

.field public final e:Lad/l;

.field public final f:LE0/a;

.field public g:Ly6/c;


# direct methods
.method public constructor <init>(ILG9/e;Ljava/lang/String;Ljava/util/List;Lad/l;LE0/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lad/i;-><init>(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Lad/n;->b:LG9/e;

    .line 17
    .line 18
    iput-object p3, p0, Lad/n;->c:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p4, p0, Lad/n;->d:Ljava/util/List;

    .line 21
    .line 22
    iput-object p5, p0, Lad/n;->e:Lad/l;

    .line 23
    .line 24
    iput-object p6, p0, Lad/n;->f:LE0/a;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lad/n;->g:Ly6/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lx6/j;->a()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lad/n;->g:Ly6/c;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public b()Lio/flutter/plugin/platform/e;
    .locals 3

    .line 1
    iget-object v0, p0, Lad/n;->g:Ly6/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    new-instance v1, Lad/N;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, v0, v2}, Lad/N;-><init>(Landroid/view/View;I)V

    .line 11
    .line 12
    .line 13
    return-object v1
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lad/n;->f:LE0/a;

    .line 2
    .line 3
    new-instance v1, Ly6/c;

    .line 4
    .line 5
    iget-object v0, v0, LE0/a;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ly6/c;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lad/n;->g:Ly6/c;

    .line 11
    .line 12
    instance-of v0, p0, Lad/c;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 17
    .line 18
    const/4 v2, -0x1

    .line 19
    const/4 v3, -0x2

    .line 20
    invoke-direct {v0, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lad/n;->g:Ly6/c;

    .line 27
    .line 28
    iget-object v1, p0, Lad/n;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lx6/j;->setAdUnitId(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lad/n;->g:Ly6/c;

    .line 34
    .line 35
    new-instance v1, Lad/m;

    .line 36
    .line 37
    invoke-direct {v1, p0}, Lad/m;-><init>(Lad/n;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ly6/c;->setAppEventListener(Ly6/f;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lad/n;->d:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    new-array v1, v1, [Lcom/google/android/gms/ads/AdSize;

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-ge v2, v3, :cond_1

    .line 57
    .line 58
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Lad/w;

    .line 63
    .line 64
    iget-object v3, v3, Lad/w;->a:Lcom/google/android/gms/ads/AdSize;

    .line 65
    .line 66
    aput-object v3, v1, v2

    .line 67
    .line 68
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    iget-object v0, p0, Lad/n;->g:Ly6/c;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ly6/c;->setAdSizes([Lcom/google/android/gms/ads/AdSize;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lad/n;->g:Ly6/c;

    .line 77
    .line 78
    new-instance v1, Lad/D;

    .line 79
    .line 80
    iget v2, p0, Lad/i;->a:I

    .line 81
    .line 82
    iget-object v3, p0, Lad/n;->b:LG9/e;

    .line 83
    .line 84
    invoke-direct {v1, v2, v3, p0}, Lad/D;-><init>(ILG9/e;Lad/k;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Lx6/j;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lad/n;->g:Ly6/c;

    .line 91
    .line 92
    iget-object v1, p0, Lad/n;->e:Lad/l;

    .line 93
    .line 94
    invoke-virtual {v1}, Lad/l;->c()Ly6/b;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v0, v1}, Ly6/c;->c(Ly6/b;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public onAdLoaded()V
    .locals 3

    .line 1
    iget-object v0, p0, Lad/n;->g:Ly6/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lad/i;->a:I

    .line 6
    .line 7
    invoke-virtual {v0}, Lx6/j;->getResponseInfo()Lx6/t;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v2, p0, Lad/n;->b:LG9/e;

    .line 12
    .line 13
    invoke-virtual {v2, v1, v0}, LG9/e;->z(ILx6/t;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
