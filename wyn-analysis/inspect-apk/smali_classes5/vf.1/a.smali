.class public abstract Lvf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static A(Landroid/content/Context;LU1/u;ZLjava/lang/String;)LV1/k;
    .locals 2

    .line 1
    const-string v0, "media_metrics"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, LV1/h;->e(Ljava/lang/Object;)Landroid/media/metrics/MediaMetricsManager;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v1, LV1/i;

    .line 16
    .line 17
    invoke-static {v0}, LV1/h;->h(Landroid/media/metrics/MediaMetricsManager;)Landroid/media/metrics/PlaybackSession;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {v1, p0, v0}, LV1/i;-><init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V

    .line 22
    .line 23
    .line 24
    move-object p0, v1

    .line 25
    :goto_0
    if-nez p0, :cond_1

    .line 26
    .line 27
    const-string p0, "ExoPlayerImpl"

    .line 28
    .line 29
    const-string p1, "MediaMetricsService unavailable."

    .line 30
    .line 31
    invoke-static {p0, p1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance p0, LV1/k;

    .line 35
    .line 36
    invoke-static {}, LF5/i;->g()Landroid/media/metrics/LogSessionId;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {p0, p1, p3}, LV1/k;-><init>(Landroid/media/metrics/LogSessionId;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    if-eqz p2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p1, p1, LU1/u;->r:LV1/d;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object p1, p1, LV1/d;->f:LQ1/j;

    .line 55
    .line 56
    invoke-virtual {p1, p0}, LQ1/j;->a(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    new-instance p1, LV1/k;

    .line 60
    .line 61
    iget-object p0, p0, LV1/i;->c:Landroid/media/metrics/PlaybackSession;

    .line 62
    .line 63
    invoke-static {p0}, LV1/h;->d(Landroid/media/metrics/PlaybackSession;)Landroid/media/metrics/LogSessionId;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-direct {p1, p0, p3}, LV1/k;-><init>(Landroid/media/metrics/LogSessionId;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object p1
.end method

.method public static B(Landroid/content/Context;ILandroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    filled-new-array {p1}, [I

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 15
    .line 16
    .line 17
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_0
    :try_start_1
    iget v2, v1, Landroid/util/TypedValue;->type:I

    .line 25
    .line 26
    const/16 v3, 0x1c

    .line 27
    .line 28
    if-lt v2, v3, :cond_1

    .line 29
    .line 30
    const/16 v3, 0x1f

    .line 31
    .line 32
    if-gt v2, v3, :cond_1

    .line 33
    .line 34
    iget p2, v1, Landroid/util/TypedValue;->data:I

    .line 35
    .line 36
    invoke-static {p0, p2}, Lvf/a;->t(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 37
    .line 38
    .line 39
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    :try_start_2
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 47
    .line 48
    .line 49
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 57
    .line 58
    .line 59
    return-object p2

    .line 60
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 61
    .line 62
    .line 63
    throw p0
.end method

.method public static C(Landroid/content/Context;IZ)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    filled-new-array {p1}, [I

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 p1, 0x0

    .line 14
    :try_start_0
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 15
    .line 16
    .line 17
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    .line 20
    .line 21
    return p1

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public static D(Landroid/content/Context;II)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    filled-new-array {p1}, [I

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 p1, 0x0

    .line 14
    :try_start_0
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 15
    .line 16
    .line 17
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    .line 20
    .line 21
    return p1

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public static E(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    filled-new-array {p1}, [I

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 p1, 0x0

    .line 14
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public static F(Landroid/content/Context;ILl4/d;)Ll4/d;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    filled-new-array {p1}, [I

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 p2, 0x2

    .line 18
    const/4 v0, 0x1

    .line 19
    const/4 v1, 0x0

    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    if-eq p1, p2, :cond_0

    .line 23
    .line 24
    move p1, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p1, p2

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move p1, v0

    .line 29
    :goto_0
    invoke-virtual {p0, v1, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eq p1, v0, :cond_3

    .line 34
    .line 35
    if-eq p1, p2, :cond_2

    .line 36
    .line 37
    sget-object p1, Ll4/d;->a:Ll4/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    :try_start_1
    sget-object p1, Ll4/d;->c:Ll4/d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_3
    :try_start_2
    sget-object p1, Ll4/d;->b:Ll4/d;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 54
    .line 55
    .line 56
    return-object p1

    .line 57
    :goto_1
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public static G(D)I
    .locals 2

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    const-wide v0, 0x41dfffffffc00000L    # 2.147483647E9

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmpl-double v0, p0, v0

    .line 13
    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    const p0, 0x7fffffff

    .line 17
    .line 18
    .line 19
    return p0

    .line 20
    :cond_0
    const-wide/high16 v0, -0x3e20000000000000L    # -2.147483648E9

    .line 21
    .line 22
    cmpg-double v0, p0, v0

    .line 23
    .line 24
    if-gez v0, :cond_1

    .line 25
    .line 26
    const/high16 p0, -0x80000000

    .line 27
    .line 28
    return p0

    .line 29
    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    .line 30
    .line 31
    .line 32
    move-result-wide p0

    .line 33
    long-to-int p0, p0

    .line 34
    return p0

    .line 35
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 36
    .line 37
    const-string p1, "Cannot round NaN value."

    .line 38
    .line 39
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public static H(F)I
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v0, "Cannot round NaN value."

    .line 15
    .line 16
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method public static I(D)J
    .locals 1

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0

    .line 12
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string p1, "Cannot round NaN value."

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method public static J(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 31
    .line 32
    .line 33
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public static K(LUc/y;Ljava/lang/Exception;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lvf/a;->n(Ljava/lang/Exception;)Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LUc/o;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v2, "firebase_firestore"

    .line 12
    .line 13
    invoke-direct {v1, v2, p1, v0}, LUc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v1}, LUc/y;->b(Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final L(LJd/B;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object p1, Lff/v;->a:Lff/v;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string v0, "/"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    sget-object p1, LJd/C;->a:Ljava/util/List;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v0, 0x1

    .line 32
    new-array v0, v0, [C

    .line 33
    .line 34
    const/16 v1, 0x2f

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    aput-char v1, v0, v2

    .line 38
    .line 39
    invoke-static {p1, v0}, LBf/k;->H0(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Ljava/util/Collection;

    .line 44
    .line 45
    invoke-static {p1}, Lff/o;->U0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    :goto_0
    const-string v0, "<set-?>"

    .line 50
    .line 51
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, LJd/B;->h:Ljava/util/List;

    .line 55
    .line 56
    return-void
.end method

.method public static M(Luc/f;Lkd/i;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, Lkd/i;->a:LC8/i;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LC8/i;->q()Luc/n;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Lkd/b;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    :goto_0
    new-instance v1, LVa/X7;

    .line 23
    .line 24
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor"

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    new-instance v2, Lkd/G;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v2, p1, v4}, Lkd/G;-><init>(Lkd/i;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    new-instance v1, LVa/X7;

    .line 46
    .line 47
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser"

    .line 48
    .line 49
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    new-instance v2, Lkd/G;

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    invoke-direct {v2, p1, v4}, Lkd/G;-><init>(Lkd/i;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 65
    .line 66
    .line 67
    :goto_2
    new-instance v1, LVa/X7;

    .line 68
    .line 69
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage"

    .line 70
    .line 71
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    new-instance v2, Lkd/G;

    .line 77
    .line 78
    const/4 v4, 0x2

    .line 79
    invoke-direct {v2, p1, v4}, Lkd/G;-><init>(Lkd/i;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 87
    .line 88
    .line 89
    :goto_3
    new-instance v1, LVa/X7;

    .line 90
    .line 91
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert"

    .line 92
    .line 93
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    new-instance v2, Lkd/G;

    .line 99
    .line 100
    const/4 v4, 0x3

    .line 101
    invoke-direct {v2, p1, v4}, Lkd/G;-><init>(Lkd/i;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 105
    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_4
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 109
    .line 110
    .line 111
    :goto_4
    new-instance v1, LVa/X7;

    .line 112
    .line 113
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm"

    .line 114
    .line 115
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    if-eqz p1, :cond_5

    .line 119
    .line 120
    new-instance v2, Lkd/G;

    .line 121
    .line 122
    const/4 v4, 0x4

    .line 123
    invoke-direct {v2, p1, v4}, Lkd/G;-><init>(Lkd/i;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 127
    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_5
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 131
    .line 132
    .line 133
    :goto_5
    new-instance v1, LVa/X7;

    .line 134
    .line 135
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt"

    .line 136
    .line 137
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    if-eqz p1, :cond_6

    .line 141
    .line 142
    new-instance p0, Lkd/G;

    .line 143
    .line 144
    const/4 v0, 0x5

    .line 145
    invoke-direct {p0, p1, v0}, Lkd/G;-><init>(Lkd/i;I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, p0}, LVa/X7;->n(Luc/b;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_6
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 153
    .line 154
    .line 155
    return-void
.end method

.method public static N(ILs2/j;LQ1/o;)LU5/f;
    .locals 10

    .line 1
    invoke-static {p1, p2}, LU5/f;->c(Ls2/j;LQ1/o;)LU5/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    iget v1, v0, LU5/f;->a:I

    .line 6
    .line 7
    if-eq v1, p0, :cond_2

    .line 8
    .line 9
    const-string v2, "Ignoring unknown WAV chunk: "

    .line 10
    .line 11
    const-string v3, "WavHeaderReader"

    .line 12
    .line 13
    invoke-static {v1, v2, v3}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-wide/16 v2, 0x8

    .line 17
    .line 18
    iget-wide v4, v0, LU5/f;->b:J

    .line 19
    .line 20
    add-long/2addr v2, v4

    .line 21
    const-wide/16 v6, 0x2

    .line 22
    .line 23
    rem-long v6, v4, v6

    .line 24
    .line 25
    const-wide/16 v8, 0x0

    .line 26
    .line 27
    cmp-long v0, v6, v8

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const-wide/16 v2, 0x9

    .line 32
    .line 33
    add-long/2addr v2, v4

    .line 34
    :cond_0
    const-wide/32 v4, 0x7fffffff

    .line 35
    .line 36
    .line 37
    cmp-long v0, v2, v4

    .line 38
    .line 39
    if-gtz v0, :cond_1

    .line 40
    .line 41
    long-to-int v0, v2

    .line 42
    invoke-virtual {p1, v0}, Ls2/j;->j(I)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2}, LU5/f;->c(Ls2/j;LQ1/o;)LU5/f;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string p1, "Chunk is too large (~2GB+) to skip; id: "

    .line 53
    .line 54
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    throw p0

    .line 69
    :cond_2
    return-object v0
.end method

.method public static O(I)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    int-to-double v3, p0

    .line 30
    const-wide v5, 0x406fe00000000000L    # 255.0

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    div-double/2addr v3, v5

    .line 36
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const/4 v3, 0x4

    .line 41
    new-array v3, v3, [Ljava/lang/Object;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    aput-object v0, v3, v4

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    aput-object v1, v3, v0

    .line 48
    .line 49
    const/4 v0, 0x2

    .line 50
    aput-object v2, v3, v0

    .line 51
    .line 52
    const/4 v0, 0x3

    .line 53
    aput-object p0, v3, v0

    .line 54
    .line 55
    sget p0, Lu6/v;->a:I

    .line 56
    .line 57
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 58
    .line 59
    const-string v0, "rgba(%d,%d,%d,%.3f)"

    .line 60
    .line 61
    invoke-static {p0, v0, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
.end method

.method public static final P(Lc0/g;)V
    .locals 3

    .line 1
    invoke-static {p0}, Lc0/m;->a(Lc0/g;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lc0/g;->c:LP/d;

    .line 5
    .line 6
    iget v0, p0, LP/d;->c:I

    .line 7
    .line 8
    if-lez v0, :cond_1

    .line 9
    .line 10
    iget-object p0, p0, LP/d;->a:[Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :cond_0
    aget-object v2, p0, v1

    .line 14
    .line 15
    check-cast v2, Lc0/g;

    .line 16
    .line 17
    invoke-static {v2}, Lvf/a;->P(Lc0/g;)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    if-lt v1, v0, :cond_0

    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public static final a(ZLtf/a;LN/o;I)V
    .locals 6

    .line 1
    const/4 v0, 0x6

    .line 2
    const v1, -0x158b58d6

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2, v1}, LN/o;->N(I)LN/o;

    .line 6
    .line 7
    .line 8
    or-int/lit8 v1, p3, 0x6

    .line 9
    .line 10
    invoke-virtual {p2, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    const/16 v2, 0x20

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/16 v2, 0x10

    .line 20
    .line 21
    :goto_0
    or-int/2addr v1, v2

    .line 22
    and-int/lit8 v1, v1, 0x5b

    .line 23
    .line 24
    const/16 v2, 0x12

    .line 25
    .line 26
    if-ne v1, v2, :cond_2

    .line 27
    .line 28
    invoke-virtual {p2}, LN/o;->x()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {p2}, LN/o;->I()V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_2
    :goto_1
    invoke-static {p1, p2}, LN/d;->I(Ljava/lang/Object;LN/o;)LN/V;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const v1, -0x384349

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, v1}, LN/o;->M(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    sget-object v2, LN/k;->a:LN/P;

    .line 55
    .line 56
    if-ne v1, v2, :cond_3

    .line 57
    .line 58
    new-instance v1, Le/b;

    .line 59
    .line 60
    invoke-direct {v1, p0}, Le/b;-><init>(LN/V;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, v1}, LN/o;->U(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    const/4 p0, 0x0

    .line 67
    invoke-virtual {p2, p0}, LN/o;->p(Z)V

    .line 68
    .line 69
    .line 70
    check-cast v1, Le/b;

    .line 71
    .line 72
    const/4 v3, 0x1

    .line 73
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    const v5, -0x384098

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v5}, LN/o;->M(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    invoke-virtual {p2, v4}, LN/o;->e(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    or-int/2addr v4, v5

    .line 92
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    if-nez v4, :cond_4

    .line 97
    .line 98
    if-ne v5, v2, :cond_5

    .line 99
    .line 100
    :cond_4
    new-instance v5, LA0/p;

    .line 101
    .line 102
    const/16 v2, 0x14

    .line 103
    .line 104
    invoke-direct {v5, v1, v2}, LA0/p;-><init>(Ljava/lang/Object;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, v5}, LN/o;->U(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :cond_5
    invoke-virtual {p2, p0}, LN/o;->p(Z)V

    .line 111
    .line 112
    .line 113
    check-cast v5, Ltf/a;

    .line 114
    .line 115
    invoke-static {v5, p2}, LN/d;->g(Ltf/a;LN/o;)V

    .line 116
    .line 117
    .line 118
    sget-object v2, Le/e;->a:LN/D;

    .line 119
    .line 120
    const v2, -0x7b43639d

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2, v2}, LN/o;->M(I)V

    .line 124
    .line 125
    .line 126
    sget-object v2, Le/e;->a:LN/D;

    .line 127
    .line 128
    invoke-virtual {p2, v2}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    check-cast v2, Landroidx/activity/y;

    .line 133
    .line 134
    const v4, 0x64249efd

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2, v4}, LN/o;->M(I)V

    .line 138
    .line 139
    .line 140
    if-nez v2, :cond_6

    .line 141
    .line 142
    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:LN/L0;

    .line 143
    .line 144
    invoke-virtual {p2, v2}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, Landroid/view/View;

    .line 149
    .line 150
    const-string v4, "<this>"

    .line 151
    .line 152
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    sget-object v4, Landroidx/activity/z;->j:Landroidx/activity/z;

    .line 156
    .line 157
    invoke-static {v2, v4}, LAf/n;->a0(Ljava/lang/Object;Ltf/l;)LAf/k;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    sget-object v4, Landroidx/activity/z;->k:Landroidx/activity/z;

    .line 162
    .line 163
    invoke-static {v2, v4}, LAf/n;->d0(LAf/k;Ltf/l;)LAf/g;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-static {v2}, LAf/n;->X(LAf/k;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    check-cast v2, Landroidx/activity/y;

    .line 172
    .line 173
    :cond_6
    invoke-virtual {p2, p0}, LN/o;->p(Z)V

    .line 174
    .line 175
    .line 176
    if-nez v2, :cond_9

    .line 177
    .line 178
    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:LN/L0;

    .line 179
    .line 180
    invoke-virtual {p2, v2}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, Landroid/content/Context;

    .line 185
    .line 186
    :goto_2
    instance-of v4, v2, Landroid/content/ContextWrapper;

    .line 187
    .line 188
    if-eqz v4, :cond_8

    .line 189
    .line 190
    instance-of v4, v2, Landroidx/activity/y;

    .line 191
    .line 192
    if-eqz v4, :cond_7

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_7
    check-cast v2, Landroid/content/ContextWrapper;

    .line 196
    .line 197
    invoke-virtual {v2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    goto :goto_2

    .line 202
    :cond_8
    const/4 v2, 0x0

    .line 203
    :goto_3
    check-cast v2, Landroidx/activity/y;

    .line 204
    .line 205
    :cond_9
    invoke-virtual {p2, p0}, LN/o;->p(Z)V

    .line 206
    .line 207
    .line 208
    if-eqz v2, :cond_b

    .line 209
    .line 210
    invoke-interface {v2}, Landroidx/activity/y;->getOnBackPressedDispatcher()Landroidx/activity/w;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LN/f0;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {p2, v2}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    check-cast v2, Landroidx/lifecycle/v;

    .line 223
    .line 224
    new-instance v4, LA/a;

    .line 225
    .line 226
    invoke-direct {v4, p0, v2, v1, v0}, LA/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 227
    .line 228
    .line 229
    invoke-static {v2, p0, v4, p2}, LN/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ltf/l;LN/o;)V

    .line 230
    .line 231
    .line 232
    move p0, v3

    .line 233
    :goto_4
    invoke-virtual {p2}, LN/o;->r()LN/i0;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    if-nez p2, :cond_a

    .line 238
    .line 239
    return-void

    .line 240
    :cond_a
    new-instance v0, Le/a;

    .line 241
    .line 242
    invoke-direct {v0, p0, p1, p3}, Le/a;-><init>(ZLtf/a;I)V

    .line 243
    .line 244
    .line 245
    iput-object v0, p2, LN/i0;->d:Ltf/p;

    .line 246
    .line 247
    return-void

    .line 248
    :cond_b
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 249
    .line 250
    const-string p1, "No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner"

    .line 251
    .line 252
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw p0
.end method

.method public static final b(Ljava/lang/String;LZ/k;Lz0/p;Ltf/l;IZILN/o;I)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v5, p2

    .line 6
    .line 7
    move-object/from16 v0, p3

    .line 8
    .line 9
    move/from16 v8, p4

    .line 10
    .line 11
    move/from16 v7, p5

    .line 12
    .line 13
    move/from16 v6, p6

    .line 14
    .line 15
    move-object/from16 v12, p7

    .line 16
    .line 17
    move/from16 v15, p8

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    const/4 v4, 0x2

    .line 21
    const/4 v9, 0x0

    .line 22
    const-string v10, "text"

    .line 23
    .line 24
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const v10, 0x3cf10926

    .line 28
    .line 29
    .line 30
    invoke-virtual {v12, v10}, LN/o;->N(I)LN/o;

    .line 31
    .line 32
    .line 33
    and-int/lit8 v10, v15, 0xe

    .line 34
    .line 35
    if-nez v10, :cond_1

    .line 36
    .line 37
    invoke-virtual {v12, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    if-eqz v10, :cond_0

    .line 42
    .line 43
    const/4 v10, 0x4

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move v10, v4

    .line 46
    :goto_0
    or-int/2addr v10, v15

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v10, v15

    .line 49
    :goto_1
    and-int/lit8 v11, v15, 0x70

    .line 50
    .line 51
    if-nez v11, :cond_3

    .line 52
    .line 53
    invoke-virtual {v12, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    if-eqz v11, :cond_2

    .line 58
    .line 59
    const/16 v11, 0x20

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    const/16 v11, 0x10

    .line 63
    .line 64
    :goto_2
    or-int/2addr v10, v11

    .line 65
    :cond_3
    and-int/lit16 v11, v15, 0x380

    .line 66
    .line 67
    if-nez v11, :cond_5

    .line 68
    .line 69
    invoke-virtual {v12, v5}, LN/o;->e(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    if-eqz v11, :cond_4

    .line 74
    .line 75
    const/16 v11, 0x100

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    const/16 v11, 0x80

    .line 79
    .line 80
    :goto_3
    or-int/2addr v10, v11

    .line 81
    :cond_5
    and-int/lit16 v11, v15, 0x1c00

    .line 82
    .line 83
    if-nez v11, :cond_7

    .line 84
    .line 85
    invoke-virtual {v12, v0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v11

    .line 89
    if-eqz v11, :cond_6

    .line 90
    .line 91
    const/16 v11, 0x800

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_6
    const/16 v11, 0x400

    .line 95
    .line 96
    :goto_4
    or-int/2addr v10, v11

    .line 97
    :cond_7
    const v11, 0xe000

    .line 98
    .line 99
    .line 100
    and-int/2addr v11, v15

    .line 101
    if-nez v11, :cond_9

    .line 102
    .line 103
    invoke-virtual {v12, v8}, LN/o;->c(I)Z

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    if-eqz v11, :cond_8

    .line 108
    .line 109
    const/16 v11, 0x4000

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_8
    const/16 v11, 0x2000

    .line 113
    .line 114
    :goto_5
    or-int/2addr v10, v11

    .line 115
    :cond_9
    const/high16 v11, 0x70000

    .line 116
    .line 117
    and-int/2addr v11, v15

    .line 118
    if-nez v11, :cond_b

    .line 119
    .line 120
    invoke-virtual {v12, v7}, LN/o;->f(Z)Z

    .line 121
    .line 122
    .line 123
    move-result v11

    .line 124
    if-eqz v11, :cond_a

    .line 125
    .line 126
    const/high16 v11, 0x20000

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_a
    const/high16 v11, 0x10000

    .line 130
    .line 131
    :goto_6
    or-int/2addr v10, v11

    .line 132
    :cond_b
    const/high16 v11, 0x380000

    .line 133
    .line 134
    and-int/2addr v11, v15

    .line 135
    if-nez v11, :cond_d

    .line 136
    .line 137
    invoke-virtual {v12, v6}, LN/o;->c(I)Z

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    if-eqz v11, :cond_c

    .line 142
    .line 143
    const/high16 v11, 0x100000

    .line 144
    .line 145
    goto :goto_7

    .line 146
    :cond_c
    const/high16 v11, 0x80000

    .line 147
    .line 148
    :goto_7
    or-int/2addr v10, v11

    .line 149
    :cond_d
    const v11, 0x2db6db

    .line 150
    .line 151
    .line 152
    and-int/2addr v10, v11

    .line 153
    const v11, 0x92492

    .line 154
    .line 155
    .line 156
    if-ne v10, v11, :cond_f

    .line 157
    .line 158
    invoke-virtual {v12}, LN/o;->x()Z

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-nez v10, :cond_e

    .line 163
    .line 164
    goto :goto_8

    .line 165
    :cond_e
    invoke-virtual {v12}, LN/o;->I()V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_10

    .line 169
    .line 170
    :cond_f
    :goto_8
    sget-object v10, LZ/i;->a:LZ/i;

    .line 171
    .line 172
    if-lez v6, :cond_18

    .line 173
    .line 174
    sget-object v11, LJ/b;->a:LN/D;

    .line 175
    .line 176
    invoke-virtual {v12, v11}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v11

    .line 180
    if-nez v11, :cond_17

    .line 181
    .line 182
    sget-object v11, Lu0/M;->e:LN/L0;

    .line 183
    .line 184
    invoke-virtual {v12, v11}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    move-object/from16 v16, v13

    .line 189
    .line 190
    check-cast v16, LL0/b;

    .line 191
    .line 192
    sget-object v13, Lu0/M;->h:LN/L0;

    .line 193
    .line 194
    invoke-virtual {v12, v13}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v13

    .line 198
    move-object/from16 v17, v13

    .line 199
    .line 200
    check-cast v17, LE0/e;

    .line 201
    .line 202
    const/4 v13, 0x0

    .line 203
    new-array v14, v4, [Ljava/lang/Object;

    .line 204
    .line 205
    aput-object v1, v14, v9

    .line 206
    .line 207
    aput-object v13, v14, v3

    .line 208
    .line 209
    new-instance v3, LI/d;

    .line 210
    .line 211
    invoke-direct {v3, v4}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 212
    .line 213
    .line 214
    sget-object v4, LI/e;->j:LI/e;

    .line 215
    .line 216
    sget-object v18, LW/i;->a:LS3/e;

    .line 217
    .line 218
    move-object/from16 v18, v10

    .line 219
    .line 220
    new-instance v10, LS3/e;

    .line 221
    .line 222
    const/16 v13, 0x16

    .line 223
    .line 224
    invoke-direct {v10, v3, v9, v4, v13}, LS3/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 225
    .line 226
    .line 227
    move-object v3, v11

    .line 228
    new-instance v11, LI/b;

    .line 229
    .line 230
    invoke-direct {v11, v9}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 231
    .line 232
    .line 233
    const/16 v13, 0x48

    .line 234
    .line 235
    move v4, v9

    .line 236
    move-object v9, v14

    .line 237
    const/4 v14, 0x4

    .line 238
    const/4 v4, 0x0

    .line 239
    invoke-static/range {v9 .. v14}, Lgc/b;->E([Ljava/lang/Object;LS3/e;Ltf/a;LN/o;II)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    check-cast v9, Ljava/lang/Number;

    .line 244
    .line 245
    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    .line 246
    .line 247
    .line 248
    const v9, -0x1d58f75c

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v9}, LN/o;->M(I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12}, LN/o;->F()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    sget-object v10, LN/k;->a:LN/P;

    .line 259
    .line 260
    const/4 v11, 0x6

    .line 261
    if-ne v9, v10, :cond_10

    .line 262
    .line 263
    new-instance v13, LI/i;

    .line 264
    .line 265
    new-instance v14, LVa/X7;

    .line 266
    .line 267
    new-instance v9, Lz0/b;

    .line 268
    .line 269
    invoke-direct {v9, v11, v4, v1}, Lz0/b;-><init>(ILjava/util/List;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    move-object v10, v3

    .line 273
    new-instance v3, LI/j;

    .line 274
    .line 275
    move-object v15, v4

    .line 276
    move-object v4, v9

    .line 277
    move-object/from16 v20, v10

    .line 278
    .line 279
    move-object/from16 v9, v16

    .line 280
    .line 281
    move-object/from16 v10, v17

    .line 282
    .line 283
    move-object/from16 v19, v18

    .line 284
    .line 285
    invoke-direct/range {v3 .. v10}, LI/j;-><init>(Lz0/b;Lz0/p;IZILL0/b;LE0/e;)V

    .line 286
    .line 287
    .line 288
    move-object v4, v3

    .line 289
    move-object v3, v9

    .line 290
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 291
    .line 292
    .line 293
    iput-object v4, v14, LVa/X7;->a:Ljava/lang/Object;

    .line 294
    .line 295
    sget-object v4, LI/e;->k:LI/e;

    .line 296
    .line 297
    iput-object v4, v14, LVa/X7;->b:Ljava/lang/Object;

    .line 298
    .line 299
    sget v4, Ld0/c;->e:I

    .line 300
    .line 301
    sget v4, Le0/q;->j:I

    .line 302
    .line 303
    sget-object v4, Lef/C;->a:Lef/C;

    .line 304
    .line 305
    sget-object v9, LN/P;->c:LN/P;

    .line 306
    .line 307
    invoke-static {v4, v9}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    iput-object v4, v14, LVa/X7;->d:Ljava/lang/Object;

    .line 312
    .line 313
    invoke-direct {v13, v14}, LI/i;-><init>(LVa/X7;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v13}, LN/o;->U(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    move-object v9, v13

    .line 320
    :goto_9
    const/4 v13, 0x0

    .line 321
    goto :goto_a

    .line 322
    :cond_10
    move-object/from16 v20, v3

    .line 323
    .line 324
    move-object v15, v4

    .line 325
    move-object/from16 v3, v16

    .line 326
    .line 327
    move-object/from16 v10, v17

    .line 328
    .line 329
    move-object/from16 v19, v18

    .line 330
    .line 331
    goto :goto_9

    .line 332
    :goto_a
    invoke-virtual {v12, v13}, LN/o;->p(Z)V

    .line 333
    .line 334
    .line 335
    move-object v14, v9

    .line 336
    check-cast v14, LI/i;

    .line 337
    .line 338
    iget-object v4, v14, LI/i;->a:LVa/X7;

    .line 339
    .line 340
    iget-boolean v9, v12, LN/o;->O:Z

    .line 341
    .line 342
    if-nez v9, :cond_14

    .line 343
    .line 344
    iget-object v9, v4, LVa/X7;->a:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v9, LI/j;

    .line 347
    .line 348
    const-string v13, "style"

    .line 349
    .line 350
    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    const-string v13, "density"

    .line 354
    .line 355
    invoke-static {v3, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    const-string v13, "fontFamilyResolver"

    .line 359
    .line 360
    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    iget-object v13, v9, LI/j;->a:Lz0/b;

    .line 364
    .line 365
    iget-object v13, v13, Lz0/b;->a:Ljava/lang/String;

    .line 366
    .line 367
    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v13

    .line 371
    if-eqz v13, :cond_11

    .line 372
    .line 373
    iget-object v13, v9, LI/j;->b:Lz0/p;

    .line 374
    .line 375
    invoke-static {v13, v5}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v13

    .line 379
    if-eqz v13, :cond_11

    .line 380
    .line 381
    iget-boolean v13, v9, LI/j;->d:Z

    .line 382
    .line 383
    if-ne v13, v7, :cond_11

    .line 384
    .line 385
    iget v13, v9, LI/j;->e:I

    .line 386
    .line 387
    if-ne v13, v8, :cond_11

    .line 388
    .line 389
    iget v13, v9, LI/j;->c:I

    .line 390
    .line 391
    if-ne v13, v6, :cond_11

    .line 392
    .line 393
    iget-object v13, v9, LI/j;->f:LL0/b;

    .line 394
    .line 395
    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v13

    .line 399
    if-eqz v13, :cond_11

    .line 400
    .line 401
    iget-object v13, v9, LI/j;->g:LE0/e;

    .line 402
    .line 403
    if-eq v13, v10, :cond_12

    .line 404
    .line 405
    :cond_11
    move-object v9, v4

    .line 406
    goto :goto_b

    .line 407
    :cond_12
    move-object v11, v4

    .line 408
    goto :goto_c

    .line 409
    :goto_b
    new-instance v4, Lz0/b;

    .line 410
    .line 411
    invoke-direct {v4, v11, v15, v1}, Lz0/b;-><init>(ILjava/util/List;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    move-object v13, v3

    .line 415
    new-instance v3, LI/j;

    .line 416
    .line 417
    move-object v11, v9

    .line 418
    move-object v9, v13

    .line 419
    invoke-direct/range {v3 .. v10}, LI/j;-><init>(Lz0/b;Lz0/p;IZILL0/b;LE0/e;)V

    .line 420
    .line 421
    .line 422
    move-object v9, v3

    .line 423
    :goto_c
    iget-object v3, v14, LI/i;->a:LVa/X7;

    .line 424
    .line 425
    iget-object v4, v3, LVa/X7;->a:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v4, LI/j;

    .line 428
    .line 429
    if-ne v4, v9, :cond_13

    .line 430
    .line 431
    goto :goto_d

    .line 432
    :cond_13
    iput-object v9, v3, LVa/X7;->a:Ljava/lang/Object;

    .line 433
    .line 434
    iget-object v3, v9, LI/j;->a:Lz0/b;

    .line 435
    .line 436
    new-instance v4, LA/W;

    .line 437
    .line 438
    const/16 v5, 0x9

    .line 439
    .line 440
    invoke-direct {v4, v5, v3, v14}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    move-object/from16 v3, v19

    .line 444
    .line 445
    const/4 v13, 0x0

    .line 446
    invoke-static {v3, v13, v4}, LFe/g;->J(LZ/k;ZLtf/l;)LZ/k;

    .line 447
    .line 448
    .line 449
    move-result-object v4

    .line 450
    iput-object v4, v14, LI/i;->d:LZ/k;

    .line 451
    .line 452
    goto :goto_e

    .line 453
    :cond_14
    move-object v11, v4

    .line 454
    :goto_d
    move-object/from16 v3, v19

    .line 455
    .line 456
    :goto_e
    const-string v4, "<set-?>"

    .line 457
    .line 458
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    iput-object v0, v11, LVa/X7;->b:Ljava/lang/Object;

    .line 462
    .line 463
    iput-object v3, v14, LI/i;->e:LZ/k;

    .line 464
    .line 465
    const v3, 0x392cd595

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12, v3}, LN/o;->M(I)V

    .line 469
    .line 470
    .line 471
    const/4 v13, 0x0

    .line 472
    invoke-virtual {v12, v13}, LN/o;->p(Z)V

    .line 473
    .line 474
    .line 475
    iget-object v3, v14, LI/i;->c:LZ/k;

    .line 476
    .line 477
    iget-object v4, v14, LI/i;->d:LZ/k;

    .line 478
    .line 479
    invoke-interface {v3, v4}, LZ/k;->g(LZ/k;)LZ/k;

    .line 480
    .line 481
    .line 482
    move-result-object v3

    .line 483
    iget-object v4, v14, LI/i;->e:LZ/k;

    .line 484
    .line 485
    invoke-interface {v3, v4}, LZ/k;->g(LZ/k;)LZ/k;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    invoke-interface {v2, v3}, LZ/k;->g(LZ/k;)LZ/k;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    iget-object v4, v14, LI/i;->b:LI/h;

    .line 494
    .line 495
    const v5, 0x207baf9a

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v5}, LN/o;->M(I)V

    .line 499
    .line 500
    .line 501
    move-object/from16 v10, v20

    .line 502
    .line 503
    invoke-virtual {v12, v10}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v5

    .line 507
    check-cast v5, LL0/b;

    .line 508
    .line 509
    sget-object v6, Lu0/M;->k:LN/L0;

    .line 510
    .line 511
    invoke-virtual {v12, v6}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v6

    .line 515
    check-cast v6, LL0/i;

    .line 516
    .line 517
    sget-object v7, Lu0/M;->o:LN/L0;

    .line 518
    .line 519
    invoke-virtual {v12, v7}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v7

    .line 523
    check-cast v7, Lu0/p0;

    .line 524
    .line 525
    invoke-static {v12, v3}, Lr7/e;->F(LN/o;LZ/k;)LZ/k;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    sget-object v8, Lt0/c;->g9:Lt0/b;

    .line 530
    .line 531
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    sget-object v8, Lt0/b;->b:Lt0/d;

    .line 535
    .line 536
    const v9, 0x53ca7ea5

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12, v9}, LN/o;->M(I)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12}, LN/o;->O()V

    .line 543
    .line 544
    .line 545
    iget-boolean v9, v12, LN/o;->O:Z

    .line 546
    .line 547
    if-eqz v9, :cond_15

    .line 548
    .line 549
    new-instance v9, LI/c;

    .line 550
    .line 551
    const/4 v13, 0x0

    .line 552
    invoke-direct {v9, v8, v13}, LI/c;-><init>(Lt0/d;I)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12, v9}, LN/o;->k(Ltf/a;)V

    .line 556
    .line 557
    .line 558
    goto :goto_f

    .line 559
    :cond_15
    const/4 v13, 0x0

    .line 560
    invoke-virtual {v12}, LN/o;->X()V

    .line 561
    .line 562
    .line 563
    :goto_f
    iput-boolean v13, v12, LN/o;->x:Z

    .line 564
    .line 565
    sget-object v8, Lt0/b;->e:Lt0/a;

    .line 566
    .line 567
    invoke-static {v12, v4, v8}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 568
    .line 569
    .line 570
    sget-object v4, Lt0/b;->d:Lt0/a;

    .line 571
    .line 572
    invoke-static {v12, v5, v4}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 573
    .line 574
    .line 575
    sget-object v4, Lt0/b;->f:Lt0/a;

    .line 576
    .line 577
    invoke-static {v12, v6, v4}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 578
    .line 579
    .line 580
    sget-object v4, Lt0/b;->g:Lt0/a;

    .line 581
    .line 582
    invoke-static {v12, v7, v4}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 583
    .line 584
    .line 585
    sget-object v4, Lt0/b;->c:Lt0/a;

    .line 586
    .line 587
    invoke-static {v12, v3, v4}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12}, LN/o;->o()V

    .line 591
    .line 592
    .line 593
    const/4 v3, 0x1

    .line 594
    invoke-virtual {v12, v3}, LN/o;->p(Z)V

    .line 595
    .line 596
    .line 597
    const/4 v13, 0x0

    .line 598
    invoke-virtual {v12, v13}, LN/o;->p(Z)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12, v13}, LN/o;->p(Z)V

    .line 602
    .line 603
    .line 604
    :goto_10
    invoke-virtual {v12}, LN/o;->r()LN/i0;

    .line 605
    .line 606
    .line 607
    move-result-object v9

    .line 608
    if-nez v9, :cond_16

    .line 609
    .line 610
    return-void

    .line 611
    :cond_16
    new-instance v0, LI/a;

    .line 612
    .line 613
    move-object/from16 v3, p2

    .line 614
    .line 615
    move-object/from16 v4, p3

    .line 616
    .line 617
    move/from16 v5, p4

    .line 618
    .line 619
    move/from16 v6, p5

    .line 620
    .line 621
    move/from16 v7, p6

    .line 622
    .line 623
    move/from16 v8, p8

    .line 624
    .line 625
    invoke-direct/range {v0 .. v8}, LI/a;-><init>(Ljava/lang/String;LZ/k;Lz0/p;Ltf/l;IZII)V

    .line 626
    .line 627
    .line 628
    iput-object v0, v9, LN/i0;->d:Ltf/p;

    .line 629
    .line 630
    return-void

    .line 631
    :cond_17
    new-instance v0, Ljava/lang/ClassCastException;

    .line 632
    .line 633
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 634
    .line 635
    .line 636
    throw v0

    .line 637
    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 638
    .line 639
    const-string v1, "maxLines should be greater than 0"

    .line 640
    .line 641
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    throw v0
.end method

.method public static final c(LKd/a;Ltf/l;Ljava/lang/String;Ltf/l;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/internal/services/l;Lcom/moloco/sdk/acm/recorder/c;Ltf/a;)Lcom/moloco/sdk/internal/publisher/B;
    .locals 12

    .line 1
    const-string v0, "adUnitId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "adFormatType"

    .line 7
    .line 8
    move-object/from16 v8, p4

    .line 9
    .line 10
    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "webViewChecker"

    .line 14
    .line 15
    move-object/from16 v9, p5

    .line 16
    .line 17
    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lcom/moloco/sdk/internal/publisher/B;

    .line 21
    .line 22
    sget-object v0, Lcom/moloco/sdk/internal/ortb/f;->a:Lef/p;

    .line 23
    .line 24
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v6, v0

    .line 29
    check-cast v6, Lcom/moloco/sdk/internal/ortb/e;

    .line 30
    .line 31
    new-instance v7, Landroidx/fragment/app/X;

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-direct {v7, v0}, Landroidx/fragment/app/X;-><init>(I)V

    .line 35
    .line 36
    .line 37
    move-object v2, p0

    .line 38
    move-object v3, p1

    .line 39
    move-object v4, p2

    .line 40
    move-object v5, p3

    .line 41
    move-object/from16 v10, p6

    .line 42
    .line 43
    move-object/from16 v11, p7

    .line 44
    .line 45
    invoke-direct/range {v1 .. v11}, Lcom/moloco/sdk/internal/publisher/B;-><init>(LKd/a;Ltf/l;Ljava/lang/String;Ltf/l;Lcom/moloco/sdk/internal/ortb/e;Landroidx/fragment/app/X;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/internal/services/l;Lcom/moloco/sdk/acm/recorder/c;Ltf/a;)V

    .line 46
    .line 47
    .line 48
    return-object v1
.end method

.method public static final d(Lp0/s;Llf/a;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/e;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/e;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/e;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/e;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/e;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/e;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v3, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/e;->a:Lp0/s;

    .line 41
    .line 42
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_5

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    iget-object p0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/e;->a:Lp0/s;

    .line 55
    .line 56
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_4
    sget-object p1, Lp0/g;->a:Lp0/g;

    .line 64
    .line 65
    iput-object p0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/e;->a:Lp0/s;

    .line 66
    .line 67
    iput v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/e;->c:I

    .line 68
    .line 69
    invoke-virtual {p0, p1, v0}, Lp0/s;->e(Lp0/g;Llf/a;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v1, :cond_5

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_5
    :goto_1
    check-cast p1, Lp0/f;

    .line 77
    .line 78
    iget-object v2, p1, Lp0/f;->a:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    move v7, v5

    .line 85
    :goto_2
    iget-object v8, p1, Lp0/f;->a:Ljava/util/List;

    .line 86
    .line 87
    if-ge v7, v6, :cond_c

    .line 88
    .line 89
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    check-cast v9, Lp0/k;

    .line 94
    .line 95
    invoke-static {v9}, Landroid/support/v4/media/session/b;->O(Lp0/k;)Z

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    if-nez v9, :cond_b

    .line 100
    .line 101
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    move v2, v5

    .line 106
    :goto_3
    if-ge v2, p1, :cond_7

    .line 107
    .line 108
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    check-cast v6, Lp0/k;

    .line 113
    .line 114
    invoke-virtual {v6}, Lp0/k;->b()Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-nez v7, :cond_9

    .line 119
    .line 120
    iget-object v7, p0, Lp0/s;->e:Lp0/t;

    .line 121
    .line 122
    iget-wide v9, v7, Lp0/t;->i:J

    .line 123
    .line 124
    invoke-virtual {p0}, Lp0/s;->h()J

    .line 125
    .line 126
    .line 127
    move-result-wide v11

    .line 128
    invoke-static {v6, v9, v10, v11, v12}, Landroid/support/v4/media/session/b;->k0(Lp0/k;JJ)Z

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    if-eqz v6, :cond_6

    .line 133
    .line 134
    goto :goto_7

    .line 135
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_7
    sget-object p1, Lp0/g;->c:Lp0/g;

    .line 139
    .line 140
    iput-object p0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/e;->a:Lp0/s;

    .line 141
    .line 142
    iput v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/e;->c:I

    .line 143
    .line 144
    invoke-virtual {p0, p1, v0}, Lp0/s;->e(Lp0/g;Llf/a;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-ne p1, v1, :cond_8

    .line 149
    .line 150
    :goto_4
    return-object v1

    .line 151
    :cond_8
    :goto_5
    check-cast p1, Lp0/f;

    .line 152
    .line 153
    iget-object p1, p1, Lp0/f;->a:Ljava/util/List;

    .line 154
    .line 155
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    move v6, v5

    .line 160
    :goto_6
    if-ge v6, v2, :cond_4

    .line 161
    .line 162
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    check-cast v7, Lp0/k;

    .line 167
    .line 168
    invoke-virtual {v7}, Lp0/k;->b()Z

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    if-eqz v7, :cond_a

    .line 173
    .line 174
    :cond_9
    :goto_7
    const/4 p0, 0x0

    .line 175
    return-object p0

    .line 176
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_b
    add-int/lit8 v7, v7, 0x1

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_c
    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    return-object p0
.end method

.method public static final e(Lp0/t;Ltf/p;Llf/j;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, LC/e;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LC/e;-><init>(Lp0/t;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/d;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, v0, p1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/touch/d;-><init>(LC/e;Ltf/p;Ljf/c;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v1, p2}, LA6/c;->w(Lp0/t;Ltf/p;Llf/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 17
    .line 18
    if-ne p0, p1, :cond_0

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    sget-object p0, Lef/C;->a:Lef/C;

    .line 22
    .line 23
    return-object p0
.end method

.method public static final f(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/z;LZ/k;Ltf/a;ZJJJLcom/moloco/sdk/internal/ortb/model/D;Ltf/a;LN/o;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move-wide/from16 v6, p6

    move-object/from16 v8, p10

    move-object/from16 v11, p11

    move-object/from16 v4, p12

    move/from16 v14, p13

    const-string v1, "countdownButtonPart"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onClick"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onTimerFinish"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x672c46ed

    .line 1
    invoke-virtual {v4, v1}, LN/o;->N(I)LN/o;

    and-int/lit8 v1, v14, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v4, v0}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v14

    goto :goto_1

    :cond_1
    move v1, v14

    :goto_1
    and-int/lit8 v3, v14, 0x30

    move-object/from16 v15, p1

    if-nez v3, :cond_3

    invoke-virtual {v4, v15}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit16 v3, v14, 0x180

    if-nez v3, :cond_5

    invoke-virtual {v4, v2}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v1, v3

    :cond_5
    and-int/lit16 v3, v14, 0xc00

    if-nez v3, :cond_7

    move/from16 v3, p3

    invoke-virtual {v4, v3}, LN/o;->f(Z)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_4

    :cond_6
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v1, v5

    goto :goto_5

    :cond_7
    move/from16 v3, p3

    :goto_5
    and-int/lit16 v5, v14, 0x6000

    move-wide/from16 v9, p4

    if-nez v5, :cond_9

    invoke-virtual {v4, v9, v10}, LN/o;->d(J)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x4000

    goto :goto_6

    :cond_8
    const/16 v5, 0x2000

    :goto_6
    or-int/2addr v1, v5

    :cond_9
    const/high16 v5, 0x30000

    and-int/2addr v5, v14

    if-nez v5, :cond_b

    invoke-virtual {v4, v6, v7}, LN/o;->d(J)Z

    move-result v5

    if-eqz v5, :cond_a

    const/high16 v5, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v5, 0x10000

    :goto_7
    or-int/2addr v1, v5

    :cond_b
    const/high16 v5, 0x180000

    and-int/2addr v5, v14

    move-wide/from16 v12, p8

    if-nez v5, :cond_d

    invoke-virtual {v4, v12, v13}, LN/o;->d(J)Z

    move-result v5

    if-eqz v5, :cond_c

    const/high16 v5, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v5, 0x80000

    :goto_8
    or-int/2addr v1, v5

    :cond_d
    const/high16 v5, 0xc00000

    and-int/2addr v5, v14

    if-nez v5, :cond_f

    invoke-virtual {v4, v8}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    const/high16 v5, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v5, 0x400000

    :goto_9
    or-int/2addr v1, v5

    :cond_f
    const/high16 v5, 0x6000000

    and-int/2addr v5, v14

    if-nez v5, :cond_11

    invoke-virtual {v4, v11}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    const/high16 v5, 0x4000000

    goto :goto_a

    :cond_10
    const/high16 v5, 0x2000000

    :goto_a
    or-int/2addr v1, v5

    :cond_11
    move/from16 v16, v1

    const v1, 0x2492493

    and-int v1, v16, v1

    const v5, 0x2492492

    if-ne v1, v5, :cond_13

    invoke-virtual {v4}, LN/o;->x()Z

    move-result v1

    if-nez v1, :cond_12

    goto :goto_b

    .line 2
    :cond_12
    invoke-virtual {v4}, LN/o;->I()V

    goto/16 :goto_11

    .line 3
    :cond_13
    :goto_b
    invoke-virtual {v4}, LN/o;->K()V

    and-int/lit8 v1, v14, 0x1

    sget-object v5, LZ/i;->a:LZ/i;

    if-eqz v1, :cond_15

    invoke-virtual {v4}, LN/o;->w()Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_c

    .line 4
    :cond_14
    invoke-virtual {v4}, LN/o;->I()V

    .line 5
    :cond_15
    :goto_c
    invoke-virtual {v4}, LN/o;->q()V

    .line 6
    invoke-static {v5}, LE/L;->a(LZ/k;)LZ/k;

    move-result-object v1

    .line 7
    invoke-static {v1, v6, v7}, LE/L;->d(LZ/k;J)LZ/k;

    move-result-object v1

    .line 8
    sget-object v5, LZ/a;->c:LZ/d;

    move-object/from16 v17, v1

    const v1, 0x2bb5b5d7

    .line 9
    invoke-virtual {v4, v1}, LN/o;->M(I)V

    const/4 v1, 0x0

    .line 10
    invoke-static {v5, v1, v4}, LE/p;->c(LZ/d;ZLN/o;)Lr0/n;

    move-result-object v5

    const v1, -0x4ee9b9da

    .line 11
    invoke-virtual {v4, v1}, LN/o;->M(I)V

    .line 12
    sget-object v1, Lu0/M;->e:LN/L0;

    .line 13
    invoke-virtual {v4, v1}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v1

    .line 14
    check-cast v1, LL0/b;

    .line 15
    sget-object v2, Lu0/M;->k:LN/L0;

    .line 16
    invoke-virtual {v4, v2}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v2

    .line 17
    check-cast v2, LL0/i;

    .line 18
    sget-object v3, Lu0/M;->o:LN/L0;

    .line 19
    invoke-virtual {v4, v3}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v3

    .line 20
    check-cast v3, Lu0/p0;

    .line 21
    sget-object v18, Lt0/c;->g9:Lt0/b;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    sget-object v6, Lt0/b;->b:Lt0/d;

    .line 23
    invoke-static/range {v17 .. v17}, LS3/f;->y(LZ/k;)LV/d;

    move-result-object v7

    .line 24
    invoke-virtual {v4}, LN/o;->O()V

    .line 25
    iget-boolean v8, v4, LN/o;->O:Z

    if-eqz v8, :cond_16

    .line 26
    invoke-virtual {v4, v6}, LN/o;->k(Ltf/a;)V

    :goto_d
    const/4 v6, 0x0

    goto :goto_e

    .line 27
    :cond_16
    invoke-virtual {v4}, LN/o;->X()V

    goto :goto_d

    .line 28
    :goto_e
    iput-boolean v6, v4, LN/o;->x:Z

    .line 29
    sget-object v6, Lt0/b;->e:Lt0/a;

    .line 30
    invoke-static {v4, v5, v6}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 31
    sget-object v5, Lt0/b;->d:Lt0/a;

    .line 32
    invoke-static {v4, v1, v5}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 33
    sget-object v1, Lt0/b;->f:Lt0/a;

    .line 34
    invoke-static {v4, v2, v1}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 35
    sget-object v1, Lt0/b;->g:Lt0/a;

    .line 36
    invoke-static {v4, v3, v1, v4}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    move-result-object v1

    const v2, 0x7ab4aae9

    const/4 v6, 0x0

    invoke-static {v6, v7, v1, v4, v2}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    const v1, -0x7f65a980

    .line 37
    invoke-virtual {v4, v1}, LN/o;->M(I)V

    const v1, 0x1f3a72c3

    .line 38
    invoke-virtual {v4, v1}, LN/o;->M(I)V

    .line 39
    instance-of v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/w;

    if-eqz v1, :cond_17

    if-eqz p10, :cond_17

    .line 40
    move-object v1, v0

    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/w;

    iget-boolean v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/w;->a:Z

    if-eqz v2, :cond_17

    shr-int/lit8 v2, v16, 0x15

    and-int/lit8 v2, v2, 0xe

    shr-int/lit8 v3, v16, 0xf

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v2, v3

    .line 41
    iget v9, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/w;->b:I

    iget v10, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/w;->c:I

    move-object/from16 v8, p10

    move v13, v2

    move-object v12, v4

    invoke-static/range {v8 .. v13}, Lxg/g;->h(Lcom/moloco/sdk/internal/ortb/model/D;IILtf/a;LN/o;I)V

    :goto_f
    const/4 v6, 0x0

    goto :goto_10

    :cond_17
    move-object v12, v4

    goto :goto_f

    .line 42
    :goto_10
    invoke-virtual {v12, v6}, LN/o;->p(Z)V

    .line 43
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/v;

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-wide/from16 v4, p4

    move-wide/from16 v8, p8

    move v10, v6

    move-wide/from16 v6, p6

    invoke-direct/range {v1 .. v9}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/v;-><init>(Ltf/a;ZJJJ)V

    const v2, 0x7a4f3041

    invoke-static {v12, v2, v1}, LV/e;->b(LN/o;ILef/e;)LV/d;

    move-result-object v3

    and-int/lit8 v1, v16, 0xe

    or-int/lit16 v1, v1, 0xc00

    and-int/lit8 v2, v16, 0x70

    or-int v5, v1, v2

    const/4 v2, 0x0

    const/4 v6, 0x4

    move-object v4, v12

    move-object v1, v15

    invoke-static/range {v0 .. v6}, LFe/g;->c(Ljava/lang/Object;LZ/k;LA/Z;LV/d;LN/o;II)V

    const/4 v0, 0x1

    .line 44
    invoke-static {v4, v10, v10, v0, v10}, Lwg/b;->e(LN/o;ZZZZ)V

    .line 45
    invoke-virtual {v4, v10}, LN/o;->p(Z)V

    .line 46
    :goto_11
    invoke-virtual {v4}, LN/o;->r()LN/i0;

    move-result-object v15

    if-eqz v15, :cond_18

    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/u;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move v13, v14

    invoke-direct/range {v0 .. v13}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/u;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/z;LZ/k;Ltf/a;ZJJJLcom/moloco/sdk/internal/ortb/model/D;Ltf/a;I)V

    .line 47
    iput-object v0, v15, LN/i0;->d:Ltf/p;

    :cond_18
    return-void
.end method

.method public static final g(LJd/B;Ljava/lang/StringBuilder;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, LJd/B;->c()LJd/D;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, LJd/D;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LJd/B;->c()LJd/D;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, LJd/D;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/16 v2, 0x2f

    .line 21
    .line 22
    const-string v3, "://"

    .line 23
    .line 24
    const-string v4, ":"

    .line 25
    .line 26
    sparse-switch v1, :sswitch_data_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :sswitch_0
    const-string v1, "about"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object p0, p0, LJd/B;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :sswitch_1
    const-string v1, "file"

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iget-object v0, p0, LJd/B;->a:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {p0}, Lvf/a;->v(LJd/B;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v2}, LBf/k;->K0(Ljava/lang/String;C)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_2

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 76
    .line 77
    .line 78
    :cond_2
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :sswitch_2
    const-string v1, "data"

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_3

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    iget-object p0, p0, LJd/B;->a:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :sswitch_3
    const-string v1, "tel"

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_4

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_4
    iget-object p0, p0, LJd/B;->a:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :sswitch_4
    const-string v1, "mailto"

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_c

    .line 125
    .line 126
    :goto_0
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 127
    .line 128
    .line 129
    invoke-static {p0}, Lvf/a;->u(LJd/B;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 134
    .line 135
    .line 136
    invoke-static {p0}, Lvf/a;->v(LJd/B;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iget-object v1, p0, LJd/B;->i:LJd/z;

    .line 141
    .line 142
    iget-boolean v3, p0, LJd/B;->b:Z

    .line 143
    .line 144
    const-string v4, "encodedPath"

    .line 145
    .line 146
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    const-string v4, "encodedQueryParameters"

    .line 150
    .line 151
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v0}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    if-nez v4, :cond_5

    .line 159
    .line 160
    const/4 v4, 0x0

    .line 161
    const-string v5, "/"

    .line 162
    .line 163
    invoke-static {v0, v5, v4}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    if-nez v4, :cond_5

    .line 168
    .line 169
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 170
    .line 171
    .line 172
    :cond_5
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 173
    .line 174
    .line 175
    iget-object v0, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Ljava/util/Map;

    .line 178
    .line 179
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_6

    .line 184
    .line 185
    if-eqz v3, :cond_7

    .line 186
    .line 187
    :cond_6
    const-string v0, "?"

    .line 188
    .line 189
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 190
    .line 191
    .line 192
    :cond_7
    invoke-virtual {v1}, LA7/B0;->b()Ljava/util/Set;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, Ljava/lang/Iterable;

    .line 197
    .line 198
    new-instance v1, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 201
    .line 202
    .line 203
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_a

    .line 212
    .line 213
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    check-cast v2, Ljava/util/Map$Entry;

    .line 218
    .line 219
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    check-cast v3, Ljava/lang/String;

    .line 224
    .line 225
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    check-cast v2, Ljava/util/List;

    .line 230
    .line 231
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eqz v4, :cond_8

    .line 236
    .line 237
    new-instance v2, Lef/k;

    .line 238
    .line 239
    const/4 v4, 0x0

    .line 240
    invoke-direct {v2, v3, v4}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-static {v2}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    goto :goto_3

    .line 248
    :cond_8
    check-cast v2, Ljava/lang/Iterable;

    .line 249
    .line 250
    new-instance v4, Ljava/util/ArrayList;

    .line 251
    .line 252
    const/16 v5, 0xa

    .line 253
    .line 254
    invoke-static {v2, v5}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 259
    .line 260
    .line 261
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v5

    .line 269
    if-eqz v5, :cond_9

    .line 270
    .line 271
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    check-cast v5, Ljava/lang/String;

    .line 276
    .line 277
    new-instance v6, Lef/k;

    .line 278
    .line 279
    invoke-direct {v6, v3, v5}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    goto :goto_2

    .line 286
    :cond_9
    move-object v2, v4

    .line 287
    :goto_3
    check-cast v2, Ljava/lang/Iterable;

    .line 288
    .line 289
    invoke-static {v2, v1}, Lff/t;->e0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 290
    .line 291
    .line 292
    goto :goto_1

    .line 293
    :cond_a
    new-instance v6, LAd/g;

    .line 294
    .line 295
    const/16 v0, 0x11

    .line 296
    .line 297
    invoke-direct {v6, v0}, LAd/g;-><init>(I)V

    .line 298
    .line 299
    .line 300
    const/4 v4, 0x0

    .line 301
    const/4 v5, 0x0

    .line 302
    const-string v3, "&"

    .line 303
    .line 304
    const/16 v7, 0x3c

    .line 305
    .line 306
    move-object v2, p1

    .line 307
    invoke-static/range {v1 .. v7}, Lff/o;->v0(Ljava/lang/Iterable;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltf/l;I)V

    .line 308
    .line 309
    .line 310
    iget-object p1, p0, LJd/B;->g:Ljava/lang/String;

    .line 311
    .line 312
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 313
    .line 314
    .line 315
    move-result p1

    .line 316
    if-lez p1, :cond_b

    .line 317
    .line 318
    const/16 p1, 0x23

    .line 319
    .line 320
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 321
    .line 322
    .line 323
    iget-object p0, p0, LJd/B;->g:Ljava/lang/String;

    .line 324
    .line 325
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 326
    .line 327
    .line 328
    :cond_b
    return-void

    .line 329
    :cond_c
    move-object v2, p1

    .line 330
    new-instance p1, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 333
    .line 334
    .line 335
    iget-object v0, p0, LJd/B;->e:Ljava/lang/String;

    .line 336
    .line 337
    iget-object v1, p0, LJd/B;->f:Ljava/lang/String;

    .line 338
    .line 339
    if-nez v0, :cond_d

    .line 340
    .line 341
    goto :goto_4

    .line 342
    :cond_d
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    if-eqz v1, :cond_e

    .line 346
    .line 347
    const/16 v0, 0x3a

    .line 348
    .line 349
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    :cond_e
    const-string v0, "@"

    .line 356
    .line 357
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    :goto_4
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    iget-object p0, p0, LJd/B;->a:Ljava/lang/String;

    .line 365
    .line 366
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 373
    .line 374
    .line 375
    return-void

    .line 376
    nop

    .line 377
    :sswitch_data_0
    .sparse-switch
        -0x40777d8e -> :sswitch_4
        0x1c01b -> :sswitch_3
        0x2eefaa -> :sswitch_2
        0x2ff57c -> :sswitch_1
        0x585238d -> :sswitch_0
    .end sparse-switch
.end method

.method public static h(FI)I
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    mul-float/2addr v0, p0

    .line 7
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {p0, v0, v1, p1}, Landroid/graphics/Color;->argb(IIII)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method public static i(Ljava/lang/StringBuilder;Ljava/lang/Object;Ltf/l;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-interface {p2, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/CharSequence;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    if-nez p1, :cond_1

    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    instance-of p2, p1, Ljava/lang/CharSequence;

    .line 23
    .line 24
    :goto_0
    if-eqz p2, :cond_2

    .line 25
    .line 26
    check-cast p1, Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    instance-of p2, p1, Ljava/lang/Character;

    .line 33
    .line 34
    if-eqz p2, :cond_3

    .line 35
    .line 36
    check-cast p1, Ljava/lang/Character;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static j(I)I
    .locals 3

    .line 1
    const/16 v0, 0x1fff

    .line 2
    .line 3
    if-ge p0, v0, :cond_0

    .line 4
    .line 5
    const/16 p0, 0xd

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    const/16 v0, 0x7fff

    .line 9
    .line 10
    if-ge p0, v0, :cond_1

    .line 11
    .line 12
    const/16 p0, 0xf

    .line 13
    .line 14
    return p0

    .line 15
    :cond_1
    const v0, 0xffff

    .line 16
    .line 17
    .line 18
    if-ge p0, v0, :cond_2

    .line 19
    .line 20
    const/16 p0, 0x10

    .line 21
    .line 22
    return p0

    .line 23
    :cond_2
    const v0, 0x3ffff

    .line 24
    .line 25
    .line 26
    if-ge p0, v0, :cond_3

    .line 27
    .line 28
    const/16 p0, 0x12

    .line 29
    .line 30
    return p0

    .line 31
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    const-string v1, "Can\'t represent a size of "

    .line 34
    .line 35
    const-string v2, " in Constraints"

    .line 36
    .line 37
    invoke-static {p0, v1, v2}, LA7/p0;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
.end method

.method public static k(Ls2/j;)Z
    .locals 4

    .line 1
    new-instance v0, LQ1/o;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, LQ1/o;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, LU5/f;->c(Ls2/j;LQ1/o;)LU5/f;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const v2, 0x52494646

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    iget v1, v1, LU5/f;->a:I

    .line 17
    .line 18
    if-eq v1, v2, :cond_0

    .line 19
    .line 20
    const v2, 0x52463634

    .line 21
    .line 22
    .line 23
    if-eq v1, v2, :cond_0

    .line 24
    .line 25
    return v3

    .line 26
    :cond_0
    iget-object v1, v0, LQ1/o;->a:[B

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    invoke-virtual {p0, v1, v3, v2, v3}, Ls2/j;->c([BIIZ)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v3}, LQ1/o;->G(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, LQ1/o;->h()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    const v0, 0x57415645

    .line 40
    .line 41
    .line 42
    if-eq p0, v0, :cond_1

    .line 43
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v1, "Unsupported form type: "

    .line 47
    .line 48
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string v0, "WavHeaderReader"

    .line 59
    .line 60
    invoke-static {v0, p0}, LQ1/k;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return v3

    .line 64
    :cond_1
    const/4 p0, 0x1

    .line 65
    return p0
.end method

.method public static l(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Li4/f;IZ)Landroid/graphics/Bitmap;
    .locals 6

    .line 1
    instance-of v0, p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    if-lt v3, v1, :cond_0

    .line 23
    .line 24
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->p()Landroid/graphics/Bitmap$Config;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-ne p1, v3, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v3, p1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 34
    .line 35
    :goto_1
    if-ne v2, v3, :cond_5

    .line 36
    .line 37
    if-eqz p4, :cond_2

    .line 38
    .line 39
    goto :goto_4

    .line 40
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 41
    .line 42
    .line 43
    move-result p4

    .line 44
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    sget-object v3, Li4/f;->c:Li4/f;

    .line 49
    .line 50
    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_3

    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    goto :goto_2

    .line 61
    :cond_3
    iget-object v4, p2, Li4/f;->a:Lp7/b;

    .line 62
    .line 63
    invoke-static {v4, p3}, Lk4/e;->d(Lp7/b;I)I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    :goto_2
    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_4

    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    iget-object v3, p2, Li4/f;->b:Lp7/b;

    .line 79
    .line 80
    invoke-static {v3, p3}, Lk4/e;->d(Lp7/b;I)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    :goto_3
    invoke-static {p4, v2, v4, v3, p3}, Lxg/g;->r(IIIII)D

    .line 85
    .line 86
    .line 87
    move-result-wide v2

    .line 88
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 89
    .line 90
    cmpg-double p4, v2, v4

    .line 91
    .line 92
    if-nez p4, :cond_5

    .line 93
    .line 94
    :goto_4
    return-object v0

    .line 95
    :cond_5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    sget-object p4, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    .line 100
    .line 101
    instance-of p4, p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 102
    .line 103
    const/4 v0, 0x0

    .line 104
    if-eqz p4, :cond_6

    .line 105
    .line 106
    move-object v2, p0

    .line 107
    check-cast v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_6
    move-object v2, v0

    .line 111
    :goto_5
    if-eqz v2, :cond_7

    .line 112
    .line 113
    invoke-virtual {v2}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    if-eqz v2, :cond_7

    .line 118
    .line 119
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    goto :goto_6

    .line 124
    :cond_7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    :goto_6
    const/16 v3, 0x200

    .line 129
    .line 130
    if-lez v2, :cond_8

    .line 131
    .line 132
    goto :goto_7

    .line 133
    :cond_8
    move v2, v3

    .line 134
    :goto_7
    if-eqz p4, :cond_9

    .line 135
    .line 136
    move-object v0, p0

    .line 137
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 138
    .line 139
    :cond_9
    if-eqz v0, :cond_a

    .line 140
    .line 141
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 142
    .line 143
    .line 144
    move-result-object p4

    .line 145
    if-eqz p4, :cond_a

    .line 146
    .line 147
    invoke-virtual {p4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 148
    .line 149
    .line 150
    move-result p4

    .line 151
    goto :goto_8

    .line 152
    :cond_a
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 153
    .line 154
    .line 155
    move-result p4

    .line 156
    :goto_8
    if-lez p4, :cond_b

    .line 157
    .line 158
    move v3, p4

    .line 159
    :cond_b
    sget-object p4, Li4/f;->c:Li4/f;

    .line 160
    .line 161
    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_c

    .line 166
    .line 167
    move v0, v2

    .line 168
    goto :goto_9

    .line 169
    :cond_c
    iget-object v0, p2, Li4/f;->a:Lp7/b;

    .line 170
    .line 171
    invoke-static {v0, p3}, Lk4/e;->d(Lp7/b;I)I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    :goto_9
    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result p4

    .line 179
    if-eqz p4, :cond_d

    .line 180
    .line 181
    move p2, v3

    .line 182
    goto :goto_a

    .line 183
    :cond_d
    iget-object p2, p2, Li4/f;->b:Lp7/b;

    .line 184
    .line 185
    invoke-static {p2, p3}, Lk4/e;->d(Lp7/b;I)I

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    :goto_a
    invoke-static {v2, v3, v0, p2, p3}, Lxg/g;->r(IIIII)D

    .line 190
    .line 191
    .line 192
    move-result-wide p2

    .line 193
    int-to-double v4, v2

    .line 194
    mul-double/2addr v4, p2

    .line 195
    invoke-static {v4, v5}, Lvf/a;->G(D)I

    .line 196
    .line 197
    .line 198
    move-result p4

    .line 199
    int-to-double v2, v3

    .line 200
    mul-double/2addr p2, v2

    .line 201
    invoke-static {p2, p3}, Lvf/a;->G(D)I

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    if-eqz p1, :cond_e

    .line 206
    .line 207
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 208
    .line 209
    if-lt p3, v1, :cond_f

    .line 210
    .line 211
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->p()Landroid/graphics/Bitmap$Config;

    .line 212
    .line 213
    .line 214
    move-result-object p3

    .line 215
    if-ne p1, p3, :cond_f

    .line 216
    .line 217
    :cond_e
    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 218
    .line 219
    :cond_f
    invoke-static {p4, p2, p1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    const-string p3, "createBitmap(width, height, config)"

    .line 224
    .line 225
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 229
    .line 230
    .line 231
    move-result-object p3

    .line 232
    iget v0, p3, Landroid/graphics/Rect;->left:I

    .line 233
    .line 234
    iget v1, p3, Landroid/graphics/Rect;->top:I

    .line 235
    .line 236
    iget v2, p3, Landroid/graphics/Rect;->right:I

    .line 237
    .line 238
    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    .line 239
    .line 240
    const/4 v3, 0x0

    .line 241
    invoke-virtual {p0, v3, v3, p4, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 242
    .line 243
    .line 244
    new-instance p2, Landroid/graphics/Canvas;

    .line 245
    .line 246
    invoke-direct {p2, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0, p2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0, v0, v1, v2, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 253
    .line 254
    .line 255
    return-object p1
.end method

.method public static m(IIII)J
    .locals 6

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    if-ne p3, v0, :cond_0

    .line 5
    .line 6
    move v1, p2

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v1, p3

    .line 9
    :goto_0
    invoke-static {v1}, Lvf/a;->j(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ne p1, v0, :cond_1

    .line 14
    .line 15
    move v3, p0

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move v3, p1

    .line 18
    :goto_1
    invoke-static {v3}, Lvf/a;->j(I)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    add-int/2addr v2, v4

    .line 23
    const/16 v5, 0x1f

    .line 24
    .line 25
    if-gt v2, v5, :cond_8

    .line 26
    .line 27
    const/16 v1, 0xd

    .line 28
    .line 29
    if-eq v4, v1, :cond_5

    .line 30
    .line 31
    const/16 v1, 0x12

    .line 32
    .line 33
    if-eq v4, v1, :cond_4

    .line 34
    .line 35
    const/16 v1, 0xf

    .line 36
    .line 37
    if-eq v4, v1, :cond_3

    .line 38
    .line 39
    const/16 v1, 0x10

    .line 40
    .line 41
    if-ne v4, v1, :cond_2

    .line 42
    .line 43
    const-wide/16 v1, 0x0

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "Should only have the provided constants."

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_3
    const-wide/16 v1, 0x2

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_4
    const-wide/16 v1, 0x1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_5
    const-wide/16 v1, 0x3

    .line 61
    .line 62
    :goto_2
    const/4 v3, 0x0

    .line 63
    if-ne p1, v0, :cond_6

    .line 64
    .line 65
    move p1, v3

    .line 66
    goto :goto_3

    .line 67
    :cond_6
    add-int/lit8 p1, p1, 0x1

    .line 68
    .line 69
    :goto_3
    if-ne p3, v0, :cond_7

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_7
    add-int/lit8 v3, p3, 0x1

    .line 73
    .line 74
    :goto_4
    sget-object p3, LL0/a;->b:[I

    .line 75
    .line 76
    long-to-int v0, v1

    .line 77
    aget p3, p3, v0

    .line 78
    .line 79
    add-int/lit8 v0, p3, 0x1f

    .line 80
    .line 81
    int-to-long v4, p0

    .line 82
    const/4 p0, 0x2

    .line 83
    shl-long/2addr v4, p0

    .line 84
    or-long/2addr v1, v4

    .line 85
    int-to-long p0, p1

    .line 86
    const/16 v4, 0x21

    .line 87
    .line 88
    shl-long/2addr p0, v4

    .line 89
    or-long/2addr p0, v1

    .line 90
    int-to-long v1, p2

    .line 91
    shl-long p2, v1, p3

    .line 92
    .line 93
    or-long/2addr p0, p2

    .line 94
    int-to-long p2, v3

    .line 95
    shl-long/2addr p2, v0

    .line 96
    or-long/2addr p0, p2

    .line 97
    return-wide p0

    .line 98
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 99
    .line 100
    const-string p1, "Can\'t represent a width of "

    .line 101
    .line 102
    const-string p2, " and height of "

    .line 103
    .line 104
    const-string p3, " in Constraints"

    .line 105
    .line 106
    invoke-static {p1, v3, p2, v1, p3}, LN0/a;->e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p0
.end method

.method public static n(Ljava/lang/Exception;)Ljava/util/HashMap;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    instance-of v1, p0, Lm9/G;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    new-instance v1, LUc/a;

    .line 15
    .line 16
    move-object v2, p0

    .line 17
    check-cast v2, Lm9/G;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-direct {v1, v2, v3}, LUc/a;-><init>(Lm9/G;Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    instance-of v1, v1, Lm9/G;

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    new-instance v1, LUc/a;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lm9/G;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    :goto_0
    invoke-direct {v1, v2, v3}, LUc/a;-><init>(Lm9/G;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    const/4 v1, 0x0

    .line 77
    :goto_1
    const-string v2, "code"

    .line 78
    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    iget-object v3, v1, LUc/a;->a:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    const-string v3, "message"

    .line 87
    .line 88
    iget-object v1, v1, LUc/a;->b:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :cond_4
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_5

    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    const-string v2, "unknown"

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    const-string v1, "FLTFirebaseFirestore"

    .line 117
    .line 118
    const-string v2, "An unknown error occurred"

    .line 119
    .line 120
    invoke-static {v1, v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 121
    .line 122
    .line 123
    :cond_5
    :goto_2
    return-object v0
.end method

.method public static final o(Landroid/content/Context;)LE0/f;
    .locals 4

    .line 1
    new-instance v0, LE0/f;

    .line 2
    .line 3
    new-instance v1, LE0/a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, LE0/a;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v3, 0x1f

    .line 11
    .line 12
    if-lt v2, v3, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Le1/c;->a(Landroid/content/res/Configuration;)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    :goto_0
    new-instance v2, LE0/b;

    .line 29
    .line 30
    invoke-direct {v2, p0}, LE0/b;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, LE0/f;-><init>(LE0/a;LE0/b;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public static final p(Lc0/g;)Lc0/g;
    .locals 2

    .line 1
    iget-object v0, p0, Lc0/g;->d:Lc0/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_4

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    .line 21
    const/4 p0, 0x5

    .line 22
    if-ne v0, p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p0, LE5/Q;

    .line 26
    .line 27
    const/16 v0, 0x9

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {p0, v1, v0}, LE5/Q;-><init>(BI)V

    .line 31
    .line 32
    .line 33
    throw p0

    .line 34
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 35
    return-object p0

    .line 36
    :cond_2
    iget-object p0, p0, Lc0/g;->e:Lc0/g;

    .line 37
    .line 38
    if-eqz p0, :cond_3

    .line 39
    .line 40
    invoke-static {p0}, Lvf/a;->p(Lc0/g;)Lc0/g;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-eqz p0, :cond_3

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v0, "no child"

    .line 50
    .line 51
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_4
    return-object p0
.end method

.method public static q(ILandroid/view/View;)Landroid/view/View;
    .locals 4

    .line 1
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    check-cast p1, Landroid/view/ViewGroup;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    return-object v3

    .line 27
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    return-object v1
.end method

.method public static r(II)J
    .locals 3

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    invoke-static {p0, p0, p1, p1}, Lvf/a;->m(IIII)J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0

    .line 10
    :cond_0
    const-string v0, "width("

    .line 11
    .line 12
    const-string v1, ") and height("

    .line 13
    .line 14
    const-string v2, ") must be >= 0"

    .line 15
    .line 16
    invoke-static {v0, p0, v1, p1, v2}, LN0/a;->e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method

.method public static s(LNd/j;Ltf/p;)V
    .locals 2

    .line 1
    invoke-interface {p0}, LNd/j;->b()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {p1, v1, v0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
.end method

.method public static t(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const v1, 0x1010036

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v1, v0}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    move p1, p0

    .line 12
    :cond_0
    new-array p0, v0, [I

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    new-array v1, v1, [[I

    .line 16
    .line 17
    const v2, -0x101009e

    .line 18
    .line 19
    .line 20
    filled-new-array {v2}, [I

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    aput-object v2, v1, v0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    aput-object p0, v1, v0

    .line 28
    .line 29
    const p0, 0x3ecccccd    # 0.4f

    .line 30
    .line 31
    .line 32
    invoke-static {p0, p1}, Lvf/a;->h(FI)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    filled-new-array {p0, p1}, [I

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance p1, Landroid/content/res/ColorStateList;

    .line 41
    .line 42
    invoke-direct {p1, v1, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 43
    .line 44
    .line 45
    return-object p1
.end method

.method public static final u(LJd/B;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, LJd/B;->e:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v3, p0, LJd/B;->f:Ljava/lang/String;

    .line 19
    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    const/16 v2, 0x3a

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    :cond_1
    const-string v2, "@"

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, LJd/B;->a:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget v1, p0, LJd/B;->c:I

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0}, LJd/B;->c()LJd/D;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget v2, v2, LJd/D;->b:I

    .line 62
    .line 63
    if-eq v1, v2, :cond_2

    .line 64
    .line 65
    const-string v1, ":"

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget p0, p0, LJd/B;->c:I

    .line 71
    .line 72
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method

.method public static final v(LJd/B;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, LJd/B;->h:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const-string p0, ""

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x1

    .line 22
    if-ne v0, v1, :cond_2

    .line 23
    .line 24
    invoke-static {p0}, Lff/o;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ljava/lang/CharSequence;

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const-string p0, "/"

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_1
    invoke-static {p0}, Lff/o;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Ljava/lang/String;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_2
    move-object v0, p0

    .line 47
    check-cast v0, Ljava/lang/Iterable;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    const/16 v5, 0x3e

    .line 51
    .line 52
    const-string v1, "/"

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-static/range {v0 .. v5}, Lff/o;->w0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltf/l;I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method public static w(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-interface {p0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 33
    .line 34
    .line 35
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    return-object p0

    .line 37
    :catch_0
    move-exception p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    const-string p1, "Exception"

    .line 46
    .line 47
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    :cond_0
    return-object v0
.end method

.method public static x(Landroid/content/res/Configuration;)Lg1/d;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, LY0/a;->e(Landroid/content/res/Configuration;)Landroid/os/LocaleList;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Lg1/d;

    .line 12
    .line 13
    new-instance v1, Lg1/g;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lg1/g;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Lg1/d;-><init>(Lg1/f;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    iget-object p0, p0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    new-array v0, v0, [Ljava/util/Locale;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    aput-object p0, v0, v1

    .line 29
    .line 30
    invoke-static {v0}, Lg1/d;->a([Ljava/util/Locale;)Lg1/d;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static y(I)Z
    .locals 6

    .line 1
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-double v0, v0

    .line 6
    const-wide v2, 0x3fd322d0e5604189L    # 0.299

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    mul-double/2addr v0, v2

    .line 12
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    int-to-double v2, v2

    .line 17
    const-wide v4, 0x3fe2c8b439581062L    # 0.587

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    mul-double/2addr v2, v4

    .line 23
    add-double/2addr v2, v0

    .line 24
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    int-to-double v0, p0

    .line 29
    const-wide v4, 0x3fbd2f1a9fbe76c9L    # 0.114

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    mul-double/2addr v0, v4

    .line 35
    add-double/2addr v0, v2

    .line 36
    const-wide v2, 0x406fe00000000000L    # 255.0

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    div-double/2addr v0, v2

    .line 42
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 43
    .line 44
    sub-double/2addr v2, v0

    .line 45
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    .line 46
    .line 47
    cmpl-double p0, v2, v0

    .line 48
    .line 49
    if-ltz p0, :cond_0

    .line 50
    .line 51
    const/4 p0, 0x1

    .line 52
    return p0

    .line 53
    :cond_0
    const/4 p0, 0x0

    .line 54
    return p0
.end method

.method public static z(Ljava/nio/MappedByteBuffer;)Lz1/b;
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/lit8 v0, v0, 0x4

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const v1, 0xffff

    .line 24
    .line 25
    .line 26
    and-int/2addr v0, v1

    .line 27
    const/16 v1, 0x64

    .line 28
    .line 29
    const-string v2, "Cannot read metadata."

    .line 30
    .line 31
    if-gt v0, v1, :cond_5

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/lit8 v1, v1, 0x6

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    move v3, v1

    .line 44
    :goto_0
    const-wide v4, 0xffffffffL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    const-wide/16 v6, -0x1

    .line 50
    .line 51
    if-ge v3, v0, :cond_1

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    add-int/lit8 v9, v9, 0x4

    .line 62
    .line 63
    invoke-virtual {p0, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    int-to-long v9, v9

    .line 71
    and-long/2addr v9, v4

    .line 72
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    add-int/lit8 v11, v11, 0x4

    .line 77
    .line 78
    invoke-virtual {p0, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 79
    .line 80
    .line 81
    const v11, 0x6d657461

    .line 82
    .line 83
    .line 84
    if-ne v11, v8, :cond_0

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    move-wide v9, v6

    .line 91
    :goto_1
    cmp-long v0, v9, v6

    .line 92
    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    int-to-long v6, v0

    .line 100
    sub-long v6, v9, v6

    .line 101
    .line 102
    long-to-int v0, v6

    .line 103
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    add-int/2addr v3, v0

    .line 108
    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    add-int/lit8 v0, v0, 0xc

    .line 116
    .line 117
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    int-to-long v6, v0

    .line 125
    and-long/2addr v6, v4

    .line 126
    :goto_2
    int-to-long v11, v1

    .line 127
    cmp-long v0, v11, v6

    .line 128
    .line 129
    if-gez v0, :cond_4

    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    int-to-long v11, v3

    .line 140
    and-long/2addr v11, v4

    .line 141
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 142
    .line 143
    .line 144
    const v3, 0x456d6a69

    .line 145
    .line 146
    .line 147
    if-eq v3, v0, :cond_3

    .line 148
    .line 149
    const v3, 0x656d6a69

    .line 150
    .line 151
    .line 152
    if-ne v3, v0, :cond_2

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_3
    :goto_3
    add-long/2addr v11, v9

    .line 159
    long-to-int v0, v11

    .line 160
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 161
    .line 162
    .line 163
    new-instance v0, Lz1/b;

    .line 164
    .line 165
    invoke-direct {v0}, Lgf/e;-><init>()V

    .line 166
    .line 167
    .line 168
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 169
    .line 170
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    add-int/2addr v2, v1

    .line 186
    iput-object p0, v0, Lgf/e;->d:Ljava/lang/Object;

    .line 187
    .line 188
    iput v2, v0, Lgf/e;->a:I

    .line 189
    .line 190
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 191
    .line 192
    .line 193
    move-result p0

    .line 194
    sub-int/2addr v2, p0

    .line 195
    iput v2, v0, Lgf/e;->b:I

    .line 196
    .line 197
    iget-object p0, v0, Lgf/e;->d:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast p0, Ljava/nio/ByteBuffer;

    .line 200
    .line 201
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    iput p0, v0, Lgf/e;->c:I

    .line 206
    .line 207
    return-object v0

    .line 208
    :cond_4
    new-instance p0, Ljava/io/IOException;

    .line 209
    .line 210
    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw p0

    .line 214
    :cond_5
    new-instance p0, Ljava/io/IOException;

    .line 215
    .line 216
    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw p0
.end method


# virtual methods
.method public abstract Q(Lcom/google/protobuf/ByteString;)V
.end method

.method public abstract R(D)V
.end method

.method public abstract S()V
.end method

.method public abstract T(J)V
.end method

.method public abstract U(Ljava/lang/String;)V
.end method
