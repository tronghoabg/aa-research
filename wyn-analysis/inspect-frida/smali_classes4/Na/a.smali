.class public final LNa/a;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/media/AudioManager;

.field public final c:Lc8/e;

.field public final d:LOa/h;

.field public e:F


# direct methods
.method public constructor <init>(Landroid/os/Handler;Landroid/content/Context;Lc8/e;LOa/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LNa/a;->a:Landroid/content/Context;

    .line 5
    .line 6
    const-string p1, "audio"

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Landroid/media/AudioManager;

    .line 13
    .line 14
    iput-object p1, p0, LNa/a;->b:Landroid/media/AudioManager;

    .line 15
    .line 16
    iput-object p3, p0, LNa/a;->c:Lc8/e;

    .line 17
    .line 18
    iput-object p4, p0, LNa/a;->d:LOa/h;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()F
    .locals 3

    .line 1
    iget-object v0, p0, LNa/a;->b:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v2

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v0

    iget-object v1, p0, LNa/a;->c:Lc8/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-lez v0, :cond_2

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    int-to-float v1, v2

    int-to-float v0, v0

    div-float/2addr v1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v2, v1, v0

    if-lez v2, :cond_1

    return v0

    :cond_1
    return v1

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b()V
    .locals 8

    .line 1
    iget v0, p0, LNa/a;->e:F

    .line 2
    .line 3
    iget-object v1, p0, LNa/a;->d:LOa/h;

    .line 4
    .line 5
    iput v0, v1, LOa/h;->a:F

    .line 6
    .line 7
    iget-object v2, v1, LOa/h;->d:LOa/c;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    sget-object v2, LOa/c;->c:LOa/c;

    .line 12
    .line 13
    iput-object v2, v1, LOa/h;->d:LOa/c;

    .line 14
    .line 15
    :cond_0
    iget-object v1, v1, LOa/h;->d:LOa/c;

    .line 16
    .line 17
    iget-object v1, v1, LOa/c;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, LMa/j;

    .line 38
    .line 39
    iget-object v2, v2, LMa/j;->e:LQa/a;

    .line 40
    .line 41
    sget-object v3, LOa/g;->a:LOa/g;

    .line 42
    .line 43
    invoke-virtual {v2}, LQa/a;->e()Landroid/webkit/WebView;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    iget-object v2, v2, LQa/a;->a:Ljava/lang/String;

    .line 52
    .line 53
    const/4 v6, 0x2

    .line 54
    new-array v6, v6, [Ljava/lang/Object;

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    aput-object v5, v6, v7

    .line 58
    .line 59
    const/4 v5, 0x1

    .line 60
    aput-object v2, v6, v5

    .line 61
    .line 62
    const-string v2, "setDeviceVolume"

    .line 63
    .line 64
    invoke-virtual {v3, v4, v2, v6}, LOa/g;->a(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    return-void
.end method

.method public final onChange(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LNa/a;->a()F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iget v0, p0, LNa/a;->e:F

    .line 9
    .line 10
    cmpl-float v0, p1, v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iput p1, p0, LNa/a;->e:F

    .line 15
    .line 16
    invoke-virtual {p0}, LNa/a;->b()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
