.class public abstract LA6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln1/f;


# static fields
.field public static a:Ljava/lang/Class;

.field public static b:Ljava/lang/reflect/Method;

.field public static c:Ljava/lang/reflect/Method;

.field public static d:Ljava/lang/reflect/Method;


# direct methods
.method public static varargs A(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p1, p2}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    throw p0
.end method

.method public static final B(Lz0/j;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz0/j;->f:LE0/o;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lz0/j;->d:LE0/j;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, Lz0/j;->c:LE0/l;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 22
    return p0
.end method

.method public static C(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v3, 0x21

    .line 13
    .line 14
    if-ge v2, v3, :cond_0

    .line 15
    .line 16
    const/16 v2, 0x1000

    .line 17
    .line 18
    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {}, Lea/T;->c()Landroid/content/pm/PackageManager$PackageInfoFlags;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v1, p0, v2}, Lea/T;->b(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :goto_0
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 32
    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    array-length v1, p0

    .line 36
    move v2, v0

    .line 37
    :goto_1
    if-ge v2, v1, :cond_2

    .line 38
    .line 39
    aget-object v3, p0, v2

    .line 40
    .line 41
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    return p0

    .line 49
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catch_0
    move-exception p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 54
    .line 55
    .line 56
    :cond_2
    return v0
.end method

.method public static final D(Lc0/g;)Z
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lc0/g;->k:Lt0/y;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lt0/y;->e:Lt0/t;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p0, Lt0/t;->s:Z

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lt0/t;->r()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-ne p0, v1, :cond_0

    .line 24
    .line 25
    return v1

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public static F(I)I
    .locals 4

    .line 1
    sget-object v0, Ljava/math/RoundingMode;->UNNECESSARY:Ljava/math/RoundingMode;

    .line 2
    .line 3
    if-lez p0, :cond_2

    .line 4
    .line 5
    sget-object v1, Ln8/d;->a:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    new-instance p0, Ljava/lang/AssertionError;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 20
    .line 21
    .line 22
    throw p0

    .line 23
    :pswitch_0
    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const v1, -0x4afb0ccd

    .line 28
    .line 29
    .line 30
    ushr-int/2addr v1, v0

    .line 31
    rsub-int/lit8 v0, v0, 0x1f

    .line 32
    .line 33
    sub-int/2addr v1, p0

    .line 34
    not-int p0, v1

    .line 35
    not-int p0, p0

    .line 36
    ushr-int/lit8 p0, p0, 0x1f

    .line 37
    .line 38
    add-int/2addr v0, p0

    .line 39
    return v0

    .line 40
    :pswitch_1
    sub-int/2addr p0, v1

    .line 41
    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    rsub-int/lit8 p0, p0, 0x20

    .line 46
    .line 47
    return p0

    .line 48
    :pswitch_2
    const/4 v0, 0x0

    .line 49
    if-lez p0, :cond_0

    .line 50
    .line 51
    move v2, v1

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move v2, v0

    .line 54
    :goto_0
    add-int/lit8 v3, p0, -0x1

    .line 55
    .line 56
    and-int/2addr v3, p0

    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move v1, v0

    .line 61
    :goto_1
    and-int v0, v2, v1

    .line 62
    .line 63
    invoke-static {v0}, LBa/c;->m(Z)V

    .line 64
    .line 65
    .line 66
    :pswitch_3
    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    rsub-int/lit8 p0, p0, 0x1f

    .line 71
    .line 72
    return p0

    .line 73
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 74
    .line 75
    const-string v1, "x ("

    .line 76
    .line 77
    const-string v2, ") must be > 0"

    .line 78
    .line 79
    invoke-static {p0, v1, v2}, LA7/p0;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static G(Lp9/j;Ls9/d;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    iget-object v1, p1, Ls9/d;->a:Ls9/j;

    .line 5
    .line 6
    iget-object v2, p0, Lp9/j;->c:Ls9/j;

    .line 7
    .line 8
    invoke-virtual {v2, v1}, Ls9/e;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    sget-object v1, Lp9/i;->h:Lp9/i;

    .line 16
    .line 17
    iget-object p0, p0, Lp9/j;->a:Lp9/i;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x1

    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    sget-object v1, Lp9/i;->i:Lp9/i;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move p0, v0

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    :goto_0
    move p0, v2

    .line 38
    :goto_1
    const/4 v1, 0x3

    .line 39
    iget p1, p1, Ls9/d;->b:I

    .line 40
    .line 41
    invoke-static {p1, v1}, LA/f;->b(II)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-ne p1, p0, :cond_3

    .line 46
    .line 47
    return v2

    .line 48
    :cond_3
    :goto_2
    return v0
.end method

.method public static H(Lp9/t;Ls9/d;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lp9/t;->b:Ls9/j;

    .line 2
    .line 3
    iget-object v1, p1, Ls9/d;->a:Ls9/j;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ls9/e;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget p1, p1, Ls9/d;->b:I

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-static {p1, v0}, LA/f;->b(II)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget p0, p0, Lp9/t;->a:I

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-static {p0, v0}, LA/f;->b(II)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    :cond_1
    const/4 v1, 0x2

    .line 30
    invoke-static {p1, v1}, LA/f;->b(II)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    invoke-static {p0, v1}, LA/f;->b(II)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_3

    .line 41
    .line 42
    :cond_2
    return v0

    .line 43
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 44
    return p0
.end method

.method public static I(I)I
    .locals 1

    .line 1
    const/high16 v0, 0x10000

    .line 2
    .line 3
    rem-int/2addr p0, v0

    .line 4
    if-ltz p0, :cond_0

    .line 5
    .line 6
    return p0

    .line 7
    :cond_0
    add-int/2addr p0, v0

    .line 8
    return p0
.end method

.method public static J(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Integer;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/Long;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Long;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public static M(Luc/f;Lkd/s;)V
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
    iget-object v0, p1, Lkd/s;->a:LC8/i;

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
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor"

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
    new-instance v2, Lkd/I;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

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
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.settings"

    .line 48
    .line 49
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    new-instance v2, Lkd/I;

    .line 55
    .line 56
    const/4 v4, 0x2

    .line 57
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

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
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData"

    .line 70
    .line 71
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    new-instance v2, Lkd/I;

    .line 77
    .line 78
    const/4 v4, 0x6

    .line 79
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

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
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl"

    .line 92
    .line 93
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    new-instance v2, Lkd/I;

    .line 99
    .line 100
    const/4 v4, 0x7

    .line 101
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

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
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl"

    .line 114
    .line 115
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    if-eqz p1, :cond_5

    .line 119
    .line 120
    new-instance v2, Lkd/I;

    .line 121
    .line 122
    const/16 v4, 0x8

    .line 123
    .line 124
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 128
    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_5
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 132
    .line 133
    .line 134
    :goto_5
    new-instance v1, LVa/X7;

    .line 135
    .line 136
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl"

    .line 137
    .line 138
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    if-eqz p1, :cond_6

    .line 142
    .line 143
    new-instance v2, Lkd/I;

    .line 144
    .line 145
    const/16 v4, 0x9

    .line 146
    .line 147
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 151
    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_6
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 155
    .line 156
    .line 157
    :goto_6
    new-instance v1, LVa/X7;

    .line 158
    .line 159
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl"

    .line 160
    .line 161
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    if-eqz p1, :cond_7

    .line 165
    .line 166
    new-instance v2, Lkd/I;

    .line 167
    .line 168
    const/16 v4, 0xa

    .line 169
    .line 170
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 174
    .line 175
    .line 176
    goto :goto_7

    .line 177
    :cond_7
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 178
    .line 179
    .line 180
    :goto_7
    new-instance v1, LVa/X7;

    .line 181
    .line 182
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack"

    .line 183
    .line 184
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    if-eqz p1, :cond_8

    .line 188
    .line 189
    new-instance v2, Lkd/I;

    .line 190
    .line 191
    const/16 v4, 0xc

    .line 192
    .line 193
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 197
    .line 198
    .line 199
    goto :goto_8

    .line 200
    :cond_8
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 201
    .line 202
    .line 203
    :goto_8
    new-instance v1, LVa/X7;

    .line 204
    .line 205
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward"

    .line 206
    .line 207
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    if-eqz p1, :cond_9

    .line 211
    .line 212
    new-instance v2, Lkd/I;

    .line 213
    .line 214
    const/16 v4, 0xd

    .line 215
    .line 216
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 220
    .line 221
    .line 222
    goto :goto_9

    .line 223
    :cond_9
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 224
    .line 225
    .line 226
    :goto_9
    new-instance v1, LVa/X7;

    .line 227
    .line 228
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack"

    .line 229
    .line 230
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    if-eqz p1, :cond_a

    .line 234
    .line 235
    new-instance v2, Lkd/I;

    .line 236
    .line 237
    const/16 v4, 0xe

    .line 238
    .line 239
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 243
    .line 244
    .line 245
    goto :goto_a

    .line 246
    :cond_a
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 247
    .line 248
    .line 249
    :goto_a
    new-instance v1, LVa/X7;

    .line 250
    .line 251
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward"

    .line 252
    .line 253
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    if-eqz p1, :cond_b

    .line 257
    .line 258
    new-instance v2, Lkd/I;

    .line 259
    .line 260
    const/16 v4, 0xb

    .line 261
    .line 262
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 266
    .line 267
    .line 268
    goto :goto_b

    .line 269
    :cond_b
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 270
    .line 271
    .line 272
    :goto_b
    new-instance v1, LVa/X7;

    .line 273
    .line 274
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.reload"

    .line 275
    .line 276
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    if-eqz p1, :cond_c

    .line 280
    .line 281
    new-instance v2, Lkd/I;

    .line 282
    .line 283
    const/16 v4, 0xf

    .line 284
    .line 285
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 289
    .line 290
    .line 291
    goto :goto_c

    .line 292
    :cond_c
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 293
    .line 294
    .line 295
    :goto_c
    new-instance v1, LVa/X7;

    .line 296
    .line 297
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache"

    .line 298
    .line 299
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    if-eqz p1, :cond_d

    .line 303
    .line 304
    new-instance v2, Lkd/I;

    .line 305
    .line 306
    const/16 v4, 0x10

    .line 307
    .line 308
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 312
    .line 313
    .line 314
    goto :goto_d

    .line 315
    :cond_d
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 316
    .line 317
    .line 318
    :goto_d
    new-instance v1, LVa/X7;

    .line 319
    .line 320
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript"

    .line 321
    .line 322
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    if-eqz p1, :cond_e

    .line 326
    .line 327
    new-instance v2, Lkd/I;

    .line 328
    .line 329
    const/16 v4, 0x11

    .line 330
    .line 331
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 335
    .line 336
    .line 337
    goto :goto_e

    .line 338
    :cond_e
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 339
    .line 340
    .line 341
    :goto_e
    new-instance v1, LVa/X7;

    .line 342
    .line 343
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle"

    .line 344
    .line 345
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    if-eqz p1, :cond_f

    .line 349
    .line 350
    new-instance v2, Lkd/I;

    .line 351
    .line 352
    const/16 v4, 0x12

    .line 353
    .line 354
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 358
    .line 359
    .line 360
    goto :goto_f

    .line 361
    :cond_f
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 362
    .line 363
    .line 364
    :goto_f
    new-instance v1, LVa/X7;

    .line 365
    .line 366
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled"

    .line 367
    .line 368
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    if-eqz p1, :cond_10

    .line 372
    .line 373
    new-instance v2, Lkd/I;

    .line 374
    .line 375
    const/16 v4, 0x13

    .line 376
    .line 377
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 381
    .line 382
    .line 383
    goto :goto_10

    .line 384
    :cond_10
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 385
    .line 386
    .line 387
    :goto_10
    new-instance v1, LVa/X7;

    .line 388
    .line 389
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient"

    .line 390
    .line 391
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    if-eqz p1, :cond_11

    .line 395
    .line 396
    new-instance v2, Lkd/I;

    .line 397
    .line 398
    const/16 v4, 0x14

    .line 399
    .line 400
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 404
    .line 405
    .line 406
    goto :goto_11

    .line 407
    :cond_11
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 408
    .line 409
    .line 410
    :goto_11
    new-instance v1, LVa/X7;

    .line 411
    .line 412
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel"

    .line 413
    .line 414
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    if-eqz p1, :cond_12

    .line 418
    .line 419
    new-instance v2, Lkd/I;

    .line 420
    .line 421
    const/16 v4, 0x15

    .line 422
    .line 423
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 427
    .line 428
    .line 429
    goto :goto_12

    .line 430
    :cond_12
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 431
    .line 432
    .line 433
    :goto_12
    new-instance v1, LVa/X7;

    .line 434
    .line 435
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel"

    .line 436
    .line 437
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    if-eqz p1, :cond_13

    .line 441
    .line 442
    new-instance v2, Lkd/I;

    .line 443
    .line 444
    const/16 v4, 0x16

    .line 445
    .line 446
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 450
    .line 451
    .line 452
    goto :goto_13

    .line 453
    :cond_13
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 454
    .line 455
    .line 456
    :goto_13
    new-instance v1, LVa/X7;

    .line 457
    .line 458
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener"

    .line 459
    .line 460
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    if-eqz p1, :cond_14

    .line 464
    .line 465
    new-instance v2, Lkd/I;

    .line 466
    .line 467
    const/4 v4, 0x1

    .line 468
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 472
    .line 473
    .line 474
    goto :goto_14

    .line 475
    :cond_14
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 476
    .line 477
    .line 478
    :goto_14
    new-instance v1, LVa/X7;

    .line 479
    .line 480
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient"

    .line 481
    .line 482
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    if-eqz p1, :cond_15

    .line 486
    .line 487
    new-instance v2, Lkd/I;

    .line 488
    .line 489
    const/4 v4, 0x3

    .line 490
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 494
    .line 495
    .line 496
    goto :goto_15

    .line 497
    :cond_15
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 498
    .line 499
    .line 500
    :goto_15
    new-instance v1, LVa/X7;

    .line 501
    .line 502
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor"

    .line 503
    .line 504
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    if-eqz p1, :cond_16

    .line 508
    .line 509
    new-instance v2, Lkd/I;

    .line 510
    .line 511
    const/4 v4, 0x4

    .line 512
    invoke-direct {v2, p1, v4}, Lkd/I;-><init>(Lkd/s;I)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 516
    .line 517
    .line 518
    goto :goto_16

    .line 519
    :cond_16
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 520
    .line 521
    .line 522
    :goto_16
    new-instance v1, LVa/X7;

    .line 523
    .line 524
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy"

    .line 525
    .line 526
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    if-eqz p1, :cond_17

    .line 530
    .line 531
    new-instance p0, Lkd/I;

    .line 532
    .line 533
    const/4 v0, 0x5

    .line 534
    invoke-direct {p0, p1, v0}, Lkd/I;-><init>(Lkd/s;I)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v1, p0}, LVa/X7;->n(Luc/b;)V

    .line 538
    .line 539
    .line 540
    return-void

    .line 541
    :cond_17
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 542
    .line 543
    .line 544
    return-void
.end method

.method public static N(ILJ5/h;LY4/b;)LU5/f;
    .locals 6

    .line 1
    invoke-static {p1, p2}, LU5/f;->b(LJ5/h;LY4/b;)LU5/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    iget v1, v0, LU5/f;->a:I

    .line 6
    .line 7
    if-eq v1, p0, :cond_1

    .line 8
    .line 9
    const-string v2, "Ignoring unknown WAV chunk: "

    .line 10
    .line 11
    const-string v3, "WavHeaderReader"

    .line 12
    .line 13
    invoke-static {v1, v2, v3}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-wide/16 v2, 0x8

    .line 17
    .line 18
    iget-wide v4, v0, LU5/f;->b:J

    .line 19
    .line 20
    add-long/2addr v4, v2

    .line 21
    const-wide/32 v2, 0x7fffffff

    .line 22
    .line 23
    .line 24
    cmp-long v0, v4, v2

    .line 25
    .line 26
    if-gtz v0, :cond_0

    .line 27
    .line 28
    long-to-int v0, v4

    .line 29
    invoke-virtual {p1, v0}, LJ5/h;->j(I)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2}, LU5/f;->b(LJ5/h;LY4/b;)LU5/f;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string p1, "Chunk is too large (~2GB+) to skip; id: "

    .line 40
    .line 41
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, LE5/o0;->b(Ljava/lang/String;)LE5/o0;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    throw p0

    .line 56
    :cond_1
    return-object v0
.end method

.method public static P(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    .line 5
    .line 6
    return-object p0

    .line 7
    :pswitch_0
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzi:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    .line 8
    .line 9
    return-object p0

    .line 10
    :pswitch_1
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzh:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_2
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzg:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_3
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzf:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_4
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_5
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzd:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_6
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_7
    sget-object p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    .line 29
    .line 30
    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final a(FF)J
    .locals 4

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-long v0, p0

    .line 6
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    int-to-long p0, p0

    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    shl-long/2addr v0, v2

    .line 14
    const-wide v2, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr p0, v2

    .line 20
    or-long/2addr p0, v0

    .line 21
    sget v0, LL0/e;->c:I

    .line 22
    .line 23
    return-wide p0
.end method

.method public static final b(FF)J
    .locals 4

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-long v0, p0

    .line 6
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    int-to-long p0, p0

    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    shl-long/2addr v0, v2

    .line 14
    const-wide v2, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr p0, v2

    .line 20
    or-long/2addr p0, v0

    .line 21
    sget v0, LL0/f;->c:I

    .line 22
    .line 23
    return-wide p0
.end method

.method public static final c(Landroid/content/Context;Ljava/util/List;JLlf/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    instance-of v1, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;

    .line 9
    .line 10
    iget v2, v1, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;->e:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;->e:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Llf/c;-><init>(Ljf/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;->d:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 30
    .line 31
    iget v3, v1, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;->e:I

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    if-eq v3, v5, :cond_2

    .line 38
    .line 39
    if-ne v3, v4, :cond_1

    .line 40
    .line 41
    iget-object v1, v1, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Ljava/util/List;

    .line 44
    .line 45
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_7

    .line 49
    .line 50
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_2
    iget-wide v5, v1, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;->a:J

    .line 59
    .line 60
    iget-object v3, v1, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;->c:Ljava/util/List;

    .line 61
    .line 62
    check-cast v3, Ljava/util/List;

    .line 63
    .line 64
    iget-object v7, v1, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v7, Lef/i;

    .line 67
    .line 68
    :try_start_0
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/moloco/sdk/internal/publisher/nativead/parser/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    move-wide v12, v5

    .line 72
    move-object v11, v7

    .line 73
    :goto_1
    move-object v10, v3

    .line 74
    goto/16 :goto_5

    .line 75
    .line 76
    :cond_3
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    new-instance v0, LAf/q;

    .line 80
    .line 81
    const/16 v3, 0xd

    .line 82
    .line 83
    move-object/from16 v6, p0

    .line 84
    .line 85
    invoke-direct {v0, v6, v3}, LAf/q;-><init>(Ljava/lang/Object;I)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 93
    .line 94
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-eqz v6, :cond_5

    .line 106
    .line 107
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    move-object v7, v6

    .line 112
    check-cast v7, Lcom/moloco/sdk/internal/publisher/nativead/model/e;

    .line 113
    .line 114
    iget-boolean v7, v7, Lcom/moloco/sdk/internal/publisher/nativead/model/e;->b:Z

    .line 115
    .line 116
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-virtual {v0, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    if-nez v9, :cond_4

    .line 125
    .line 126
    new-instance v9, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-interface {v0, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    :cond_4
    check-cast v9, Ljava/util/List;

    .line 135
    .line 136
    invoke-interface {v9, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_5
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 141
    .line 142
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v3, Ljava/util/List;

    .line 147
    .line 148
    sget-object v6, Lff/v;->a:Lff/v;

    .line 149
    .line 150
    if-nez v3, :cond_6

    .line 151
    .line 152
    move-object v7, v6

    .line 153
    goto :goto_3

    .line 154
    :cond_6
    move-object v7, v3

    .line 155
    :goto_3
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 156
    .line 157
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v0, Ljava/util/List;

    .line 162
    .line 163
    if-nez v0, :cond_7

    .line 164
    .line 165
    move-object v3, v6

    .line 166
    goto :goto_4

    .line 167
    :cond_7
    move-object v3, v0

    .line 168
    :goto_4
    :try_start_1
    new-instance v6, Lcom/moloco/sdk/internal/publisher/nativead/parser/g;

    .line 169
    .line 170
    const/4 v11, 0x0

    .line 171
    move-wide/from16 v9, p2

    .line 172
    .line 173
    invoke-direct/range {v6 .. v11}, Lcom/moloco/sdk/internal/publisher/nativead/parser/g;-><init>(Ljava/util/List;Lef/p;JLjf/c;)V

    .line 174
    .line 175
    .line 176
    iput-object v8, v1, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;->b:Ljava/lang/Object;

    .line 177
    .line 178
    move-object v0, v3

    .line 179
    check-cast v0, Ljava/util/List;

    .line 180
    .line 181
    iput-object v0, v1, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;->c:Ljava/util/List;

    .line 182
    .line 183
    move-wide/from16 v9, p2

    .line 184
    .line 185
    iput-wide v9, v1, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;->a:J

    .line 186
    .line 187
    iput v5, v1, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;->e:I

    .line 188
    .line 189
    invoke-static {v6, v1}, LEf/H;->l(Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    if-ne v0, v2, :cond_8

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_8
    move-object v11, v8

    .line 197
    move-wide v12, v9

    .line 198
    goto :goto_1

    .line 199
    :goto_5
    check-cast v0, Ljava/util/List;
    :try_end_1
    .catch Lcom/moloco/sdk/internal/publisher/nativead/parser/a; {:try_start_1 .. :try_end_1} :catch_0

    .line 200
    .line 201
    new-instance v9, Lcom/moloco/sdk/internal/publisher/nativead/parser/e;

    .line 202
    .line 203
    const/4 v14, 0x0

    .line 204
    invoke-direct/range {v9 .. v14}, Lcom/moloco/sdk/internal/publisher/nativead/parser/e;-><init>(Ljava/util/List;Lef/i;JLjf/c;)V

    .line 205
    .line 206
    .line 207
    iput-object v0, v1, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;->b:Ljava/lang/Object;

    .line 208
    .line 209
    const/4 v3, 0x0

    .line 210
    iput-object v3, v1, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;->c:Ljava/util/List;

    .line 211
    .line 212
    iput v4, v1, Lcom/moloco/sdk/internal/publisher/nativead/parser/c;->e:I

    .line 213
    .line 214
    invoke-static {v9, v1}, LEf/H;->l(Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    if-ne v1, v2, :cond_9

    .line 219
    .line 220
    :goto_6
    return-object v2

    .line 221
    :cond_9
    move-object v15, v1

    .line 222
    move-object v1, v0

    .line 223
    move-object v0, v15

    .line 224
    :goto_7
    check-cast v0, Ljava/util/List;

    .line 225
    .line 226
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 227
    .line 228
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 229
    .line 230
    .line 231
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 232
    .line 233
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 234
    .line 235
    .line 236
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 237
    .line 238
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 239
    .line 240
    .line 241
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 242
    .line 243
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 244
    .line 245
    .line 246
    new-instance v7, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-static {v0, v1}, Lff/o;->E0(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-eqz v1, :cond_10

    .line 264
    .line 265
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    check-cast v1, Lef/k;

    .line 270
    .line 271
    iget-object v2, v1, Lef/k;->a:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v2, Lcom/moloco/sdk/internal/publisher/nativead/model/e;

    .line 274
    .line 275
    iget-object v1, v1, Lef/k;->b:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v1, Lcom/moloco/sdk/internal/A;

    .line 278
    .line 279
    instance-of v8, v1, Lcom/moloco/sdk/internal/y;

    .line 280
    .line 281
    if-eqz v8, :cond_a

    .line 282
    .line 283
    check-cast v1, Lcom/moloco/sdk/internal/y;

    .line 284
    .line 285
    iget-object v1, v1, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 286
    .line 287
    new-instance v8, Lef/k;

    .line 288
    .line 289
    invoke-direct {v8, v2, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_a
    instance-of v2, v1, Lcom/moloco/sdk/internal/z;

    .line 297
    .line 298
    if-eqz v2, :cond_f

    .line 299
    .line 300
    check-cast v1, Lcom/moloco/sdk/internal/z;

    .line 301
    .line 302
    iget-object v1, v1, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v1, Lcom/moloco/sdk/internal/publisher/nativead/model/m;

    .line 305
    .line 306
    instance-of v2, v1, Lcom/moloco/sdk/internal/publisher/nativead/model/i;

    .line 307
    .line 308
    if-eqz v2, :cond_b

    .line 309
    .line 310
    iget-object v2, v1, Lcom/moloco/sdk/internal/publisher/nativead/model/m;->a:Lcom/moloco/sdk/internal/publisher/nativead/model/e;

    .line 311
    .line 312
    iget v2, v2, Lcom/moloco/sdk/internal/publisher/nativead/model/e;->a:I

    .line 313
    .line 314
    new-instance v8, Ljava/lang/Integer;

    .line 315
    .line 316
    invoke-direct {v8, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 317
    .line 318
    .line 319
    invoke-interface {v3, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    goto :goto_8

    .line 323
    :cond_b
    instance-of v2, v1, Lcom/moloco/sdk/internal/publisher/nativead/model/j;

    .line 324
    .line 325
    if-eqz v2, :cond_c

    .line 326
    .line 327
    iget-object v2, v1, Lcom/moloco/sdk/internal/publisher/nativead/model/m;->a:Lcom/moloco/sdk/internal/publisher/nativead/model/e;

    .line 328
    .line 329
    iget v2, v2, Lcom/moloco/sdk/internal/publisher/nativead/model/e;->a:I

    .line 330
    .line 331
    new-instance v8, Ljava/lang/Integer;

    .line 332
    .line 333
    invoke-direct {v8, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 334
    .line 335
    .line 336
    invoke-interface {v4, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    goto :goto_8

    .line 340
    :cond_c
    instance-of v2, v1, Lcom/moloco/sdk/internal/publisher/nativead/model/k;

    .line 341
    .line 342
    if-eqz v2, :cond_d

    .line 343
    .line 344
    iget-object v2, v1, Lcom/moloco/sdk/internal/publisher/nativead/model/m;->a:Lcom/moloco/sdk/internal/publisher/nativead/model/e;

    .line 345
    .line 346
    iget v2, v2, Lcom/moloco/sdk/internal/publisher/nativead/model/e;->a:I

    .line 347
    .line 348
    new-instance v8, Ljava/lang/Integer;

    .line 349
    .line 350
    invoke-direct {v8, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 351
    .line 352
    .line 353
    invoke-interface {v5, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_d
    instance-of v2, v1, Lcom/moloco/sdk/internal/publisher/nativead/model/l;

    .line 358
    .line 359
    if-eqz v2, :cond_e

    .line 360
    .line 361
    iget-object v2, v1, Lcom/moloco/sdk/internal/publisher/nativead/model/m;->a:Lcom/moloco/sdk/internal/publisher/nativead/model/e;

    .line 362
    .line 363
    iget v2, v2, Lcom/moloco/sdk/internal/publisher/nativead/model/e;->a:I

    .line 364
    .line 365
    new-instance v8, Ljava/lang/Integer;

    .line 366
    .line 367
    invoke-direct {v8, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 368
    .line 369
    .line 370
    invoke-interface {v6, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    goto :goto_8

    .line 374
    :cond_e
    new-instance v0, LE5/Q;

    .line 375
    .line 376
    const/16 v1, 0x9

    .line 377
    .line 378
    const/4 v2, 0x0

    .line 379
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 380
    .line 381
    .line 382
    throw v0

    .line 383
    :cond_f
    new-instance v0, LE5/Q;

    .line 384
    .line 385
    const/16 v1, 0x9

    .line 386
    .line 387
    const/4 v2, 0x0

    .line 388
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 389
    .line 390
    .line 391
    throw v0

    .line 392
    :cond_10
    new-instance v0, Lcom/moloco/sdk/internal/z;

    .line 393
    .line 394
    new-instance v2, Lcom/moloco/sdk/internal/publisher/nativead/model/n;

    .line 395
    .line 396
    invoke-direct/range {v2 .. v7}, Lcom/moloco/sdk/internal/publisher/nativead/model/n;-><init>(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/ArrayList;)V

    .line 397
    .line 398
    .line 399
    invoke-direct {v0, v2}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    return-object v0

    .line 403
    :goto_9
    move-object v4, v0

    .line 404
    goto :goto_a

    .line 405
    :catch_0
    move-exception v0

    .line 406
    goto :goto_9

    .line 407
    :goto_a
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 408
    .line 409
    const-string v3, "Failed to prepare required assets"

    .line 410
    .line 411
    const/4 v5, 0x0

    .line 412
    const-string v2, "PrepareNativeAssets"

    .line 413
    .line 414
    const/16 v6, 0x8

    .line 415
    .line 416
    const/4 v7, 0x0

    .line 417
    invoke-static/range {v1 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 421
    .line 422
    invoke-direct {v0, v4}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    return-object v0
.end method

.method public static final d(Lcom/moloco/sdk/internal/publisher/nativead/model/e;Lef/i;JLlf/j;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Lcom/moloco/sdk/internal/publisher/nativead/model/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p1, Lcom/moloco/sdk/internal/z;

    .line 6
    .line 7
    new-instance p2, Lcom/moloco/sdk/internal/publisher/nativead/model/i;

    .line 8
    .line 9
    check-cast p0, Lcom/moloco/sdk/internal/publisher/nativead/model/a;

    .line 10
    .line 11
    invoke-direct {p2, p0}, Lcom/moloco/sdk/internal/publisher/nativead/model/i;-><init>(Lcom/moloco/sdk/internal/publisher/nativead/model/a;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p1, p2}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    instance-of v0, p0, Lcom/moloco/sdk/internal/publisher/nativead/model/b;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast p0, Lcom/moloco/sdk/internal/publisher/nativead/model/b;

    .line 23
    .line 24
    sget-object p1, Lcom/moloco/sdk/service_locator/g;->b:Lef/p;

    .line 25
    .line 26
    invoke-virtual {p1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;

    .line 31
    .line 32
    invoke-static {p0, p1, p4}, LA6/c;->i(Lcom/moloco/sdk/internal/publisher/nativead/model/b;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;Llf/c;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_1
    instance-of v0, p0, Lcom/moloco/sdk/internal/publisher/nativead/model/c;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    new-instance p1, Lcom/moloco/sdk/internal/z;

    .line 42
    .line 43
    new-instance p2, Lcom/moloco/sdk/internal/publisher/nativead/model/k;

    .line 44
    .line 45
    check-cast p0, Lcom/moloco/sdk/internal/publisher/nativead/model/c;

    .line 46
    .line 47
    invoke-direct {p2, p0}, Lcom/moloco/sdk/internal/publisher/nativead/model/k;-><init>(Lcom/moloco/sdk/internal/publisher/nativead/model/c;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p1, p2}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_2
    instance-of v0, p0, Lcom/moloco/sdk/internal/publisher/nativead/model/d;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    check-cast p0, Lcom/moloco/sdk/internal/publisher/nativead/model/d;

    .line 59
    .line 60
    invoke-interface {p1}, Lef/i;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 65
    .line 66
    invoke-static {p0, p1, p2, p3, p4}, LA6/c;->j(Lcom/moloco/sdk/internal/publisher/nativead/model/d;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;JLlf/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :cond_3
    new-instance p0, LE5/Q;

    .line 72
    .line 73
    const/16 p1, 0x9

    .line 74
    .line 75
    const/4 p2, 0x0

    .line 76
    invoke-direct {p0, p2, p1}, LE5/Q;-><init>(BI)V

    .line 77
    .line 78
    .line 79
    throw p0
.end method

.method public static final e(JJLZ/k;FFLtf/a;Ljava/lang/String;Landroidx/lifecycle/v;IILN/o;I)V
    .locals 45

    move-wide/from16 v1, p0

    move-wide/from16 v5, p2

    move/from16 v0, p6

    move-object/from16 v8, p7

    move-object/from16 v3, p8

    move/from16 v9, p10

    move/from16 v12, p11

    move-object/from16 v4, p12

    move/from16 v7, p13

    const/4 v11, 0x6

    const-string v14, "onTimerFinish"

    invoke-static {v8, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "customTimerString"

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v14, 0x54657db4

    .line 1
    invoke-virtual {v4, v14}, LN/o;->N(I)LN/o;

    and-int/lit8 v14, v7, 0x6

    if-nez v14, :cond_1

    invoke-virtual {v4, v1, v2}, LN/o;->d(J)Z

    move-result v14

    if-eqz v14, :cond_0

    const/4 v14, 0x4

    goto :goto_0

    :cond_0
    const/4 v14, 0x2

    :goto_0
    or-int/2addr v14, v7

    goto :goto_1

    :cond_1
    move v14, v7

    :goto_1
    and-int/lit8 v16, v7, 0x30

    if-nez v16, :cond_3

    invoke-virtual {v4, v5, v6}, LN/o;->d(J)Z

    move-result v16

    if-eqz v16, :cond_2

    const/16 v16, 0x20

    goto :goto_2

    :cond_2
    const/16 v16, 0x10

    :goto_2
    or-int v14, v14, v16

    :cond_3
    const/16 v19, 0x1

    and-int/lit16 v10, v7, 0x180

    if-nez v10, :cond_5

    move-object/from16 v10, p4

    invoke-virtual {v4, v10}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_4

    const/16 v16, 0x100

    goto :goto_3

    :cond_4
    const/16 v16, 0x80

    :goto_3
    or-int v14, v14, v16

    goto :goto_4

    :cond_5
    move-object/from16 v10, p4

    :goto_4
    or-int/lit16 v14, v14, 0xc00

    and-int/lit16 v11, v7, 0x6000

    if-nez v11, :cond_7

    invoke-virtual {v4, v0}, LN/o;->b(F)Z

    move-result v11

    if-eqz v11, :cond_6

    const/16 v11, 0x4000

    goto :goto_5

    :cond_6
    const/16 v11, 0x2000

    :goto_5
    or-int/2addr v14, v11

    :cond_7
    const/high16 v11, 0x30000

    and-int/2addr v11, v7

    if-nez v11, :cond_9

    invoke-virtual {v4, v8}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/high16 v11, 0x20000

    goto :goto_6

    :cond_8
    const/high16 v11, 0x10000

    :goto_6
    or-int/2addr v14, v11

    :cond_9
    const/high16 v11, 0x180000

    and-int/2addr v11, v7

    if-nez v11, :cond_b

    invoke-virtual {v4, v3}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/high16 v11, 0x100000

    goto :goto_7

    :cond_a
    const/high16 v11, 0x80000

    :goto_7
    or-int/2addr v14, v11

    :cond_b
    const/high16 v11, 0xc00000

    and-int/2addr v11, v7

    if-nez v11, :cond_c

    const/high16 v11, 0x400000

    or-int/2addr v14, v11

    :cond_c
    const/high16 v11, 0x6000000

    and-int/2addr v11, v7

    if-nez v11, :cond_e

    invoke-virtual {v4, v9}, LN/o;->c(I)Z

    move-result v11

    if-eqz v11, :cond_d

    const/high16 v11, 0x4000000

    goto :goto_8

    :cond_d
    const/high16 v11, 0x2000000

    :goto_8
    or-int/2addr v14, v11

    :cond_e
    const/high16 v11, 0x30000000

    and-int/2addr v11, v7

    if-nez v11, :cond_10

    invoke-virtual {v4, v12}, LN/o;->c(I)Z

    move-result v11

    if-eqz v11, :cond_f

    const/high16 v11, 0x20000000

    goto :goto_9

    :cond_f
    const/high16 v11, 0x10000000

    :goto_9
    or-int/2addr v14, v11

    :cond_10
    const v11, 0x12492493

    and-int/2addr v11, v14

    const v15, 0x12492492

    if-ne v11, v15, :cond_12

    invoke-virtual {v4}, LN/o;->x()Z

    move-result v11

    if-nez v11, :cond_11

    goto :goto_a

    .line 2
    :cond_11
    invoke-virtual {v4}, LN/o;->I()V

    move/from16 v6, p5

    move-object/from16 v10, p9

    move-object v14, v4

    goto/16 :goto_1b

    .line 3
    :cond_12
    :goto_a
    invoke-virtual {v4}, LN/o;->K()V

    and-int/lit8 v11, v7, 0x1

    sget-object v15, LZ/i;->a:LZ/i;

    move/from16 v17, v14

    const/4 v14, 0x5

    const v18, -0x1c00001

    if-eqz v11, :cond_14

    invoke-virtual {v4}, LN/o;->w()Z

    move-result v11

    if-eqz v11, :cond_13

    goto :goto_b

    .line 4
    :cond_13
    invoke-virtual {v4}, LN/o;->I()V

    and-int v11, v17, v18

    move-object/from16 v14, p9

    move/from16 v22, v11

    move/from16 v11, p5

    goto :goto_c

    :cond_14
    :goto_b
    int-to-float v11, v14

    .line 5
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LN/f0;

    move-result-object v14

    .line 6
    invoke-virtual {v4, v14}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/lifecycle/v;

    and-int v17, v17, v18

    move/from16 v22, v17

    .line 7
    :goto_c
    invoke-virtual {v4}, LN/o;->q()V

    const v13, -0x4035f75b

    .line 8
    invoke-virtual {v4, v13}, LN/o;->M(I)V

    .line 9
    invoke-virtual {v4}, LN/o;->F()Ljava/lang/Object;

    move-result-object v13

    .line 10
    sget-object v1, LN/k;->a:LN/P;

    sget-object v2, LN/P;->f:LN/P;

    if-ne v13, v1, :cond_15

    .line 11
    new-instance v13, LL0/h;

    const-wide/16 v5, 0x0

    invoke-direct {v13, v5, v6}, LL0/h;-><init>(J)V

    .line 12
    invoke-static {v13, v2}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    move-result-object v13

    .line 13
    invoke-virtual {v4, v13}, LN/o;->U(Ljava/lang/Object;)V

    .line 14
    :cond_15
    move-object v5, v13

    check-cast v5, LN/V;

    const/4 v6, 0x0

    .line 15
    invoke-virtual {v4, v6}, LN/o;->p(Z)V

    const v6, -0x4035eea7

    .line 16
    invoke-virtual {v4, v6}, LN/o;->M(I)V

    .line 17
    invoke-virtual {v4, v14}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v6

    .line 18
    invoke-virtual {v4}, LN/o;->F()Ljava/lang/Object;

    move-result-object v13

    if-nez v6, :cond_16

    if-ne v13, v1, :cond_17

    .line 19
    :cond_16
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    invoke-static {v6, v2}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    move-result-object v13

    .line 21
    invoke-virtual {v4, v13}, LN/o;->U(Ljava/lang/Object;)V

    .line 22
    :cond_17
    move-object v2, v13

    check-cast v2, LN/V;

    const/4 v6, 0x0

    .line 23
    invoke-virtual {v4, v6}, LN/o;->p(Z)V

    .line 24
    new-array v13, v6, [Ljava/lang/Object;

    const v6, -0x4035e088

    invoke-virtual {v4, v6}, LN/o;->M(I)V

    invoke-virtual {v4, v12}, LN/o;->c(I)Z

    move-result v6

    move-object/from16 p5, v5

    .line 25
    invoke-virtual {v4}, LN/o;->F()Ljava/lang/Object;

    move-result-object v5

    if-nez v6, :cond_19

    if-ne v5, v1, :cond_18

    goto :goto_d

    :cond_18
    const/4 v6, 0x0

    goto :goto_e

    .line 26
    :cond_19
    :goto_d
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/b;

    const/4 v6, 0x0

    invoke-direct {v5, v12, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/b;-><init>(II)V

    .line 27
    invoke-virtual {v4, v5}, LN/o;->U(Ljava/lang/Object;)V

    .line 28
    :goto_e
    check-cast v5, Ltf/a;

    .line 29
    invoke-virtual {v4, v6}, LN/o;->p(Z)V

    const/16 v18, 0x6

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v23, v17

    const/16 v17, 0x0

    move-object v0, v15

    move-object v15, v5

    move-object v5, v0

    move-object/from16 v16, v4

    move v0, v6

    move-object/from16 v6, v23

    const/4 v4, 0x2

    .line 30
    invoke-static/range {v13 .. v18}, Lgc/b;->E([Ljava/lang/Object;LS3/e;Ltf/a;LN/o;II)Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v14, v16

    check-cast v13, LN/V;

    const v15, -0x4035d5c6

    invoke-virtual {v14, v15}, LN/o;->M(I)V

    .line 31
    invoke-virtual {v14}, LN/o;->F()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v1, :cond_1a

    .line 32
    invoke-static {v12, v9}, Lxg/g;->d(II)F

    move-result v15

    invoke-static {v15}, LA/t;->a(F)LA/e;

    move-result-object v15

    .line 33
    invoke-virtual {v14, v15}, LN/o;->U(Ljava/lang/Object;)V

    .line 34
    :cond_1a
    check-cast v15, LA/e;

    .line 35
    invoke-virtual {v14, v0}, LN/o;->p(Z)V

    .line 36
    new-instance v4, Lef/u;

    invoke-direct {v4, v12}, Lef/u;-><init>(I)V

    const v0, -0x4035c0ed

    .line 37
    invoke-virtual {v14, v0}, LN/o;->M(I)V

    invoke-virtual {v14, v13}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v14, v12}, LN/o;->c(I)Z

    move-result v17

    or-int v0, v0, v17

    invoke-virtual {v14, v9}, LN/o;->c(I)Z

    move-result v17

    or-int v0, v0, v17

    invoke-virtual {v14, v15}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v17

    or-int v0, v0, v17

    invoke-virtual {v14, v8}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v17

    or-int v0, v0, v17

    move/from16 v17, v0

    .line 38
    invoke-virtual {v14}, LN/o;->F()Ljava/lang/Object;

    move-result-object v0

    if-nez v17, :cond_1c

    if-ne v0, v1, :cond_1b

    goto :goto_f

    :cond_1b
    move-object v7, v0

    move v0, v11

    move v8, v12

    move-object v9, v15

    const/16 v20, 0x6

    goto :goto_10

    .line 39
    :cond_1c
    :goto_f
    new-instance v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/h;

    move-object v12, v13

    const/4 v13, 0x0

    move v0, v11

    move-object v10, v15

    const/16 v20, 0x6

    move-object v11, v8

    move/from16 v8, p11

    invoke-direct/range {v7 .. v13}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/h;-><init>(IILA/e;Ltf/a;LN/V;Ljf/c;)V

    move-object v9, v10

    .line 40
    invoke-virtual {v14, v7}, LN/o;->U(Ljava/lang/Object;)V

    .line 41
    :goto_10
    check-cast v7, Ltf/p;

    const/4 v10, 0x0

    .line 42
    invoke-virtual {v14, v10}, LN/o;->p(Z)V

    .line 43
    invoke-static {v14, v4, v7}, LN/d;->d(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 44
    invoke-interface {v2}, LN/K0;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v7, -0x40353d33

    .line 45
    invoke-virtual {v14, v7}, LN/o;->M(I)V

    invoke-virtual {v14, v2}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v14, v9}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v7, v10

    .line 46
    invoke-virtual {v14}, LN/o;->F()Ljava/lang/Object;

    move-result-object v10

    if-nez v7, :cond_1d

    if-ne v10, v1, :cond_1e

    .line 47
    :cond_1d
    new-instance v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/i;

    const/4 v7, 0x0

    invoke-direct {v10, v9, v2, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/i;-><init>(LA/e;LN/V;Ljf/c;)V

    .line 48
    invoke-virtual {v14, v10}, LN/o;->U(Ljava/lang/Object;)V

    .line 49
    :cond_1e
    check-cast v10, Ltf/p;

    const/4 v7, 0x0

    .line 50
    invoke-virtual {v14, v7}, LN/o;->p(Z)V

    .line 51
    invoke-static {v14, v4, v10}, LN/d;->d(LN/o;Ljava/lang/Object;Ltf/p;)V

    const v4, -0x40352bf6

    .line 52
    invoke-virtual {v14, v4}, LN/o;->M(I)V

    invoke-virtual {v14, v2}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v14, v9}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-virtual {v14, v6}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    .line 53
    invoke-virtual {v14}, LN/o;->F()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_20

    if-ne v7, v1, :cond_1f

    goto :goto_11

    :cond_1f
    const/4 v10, 0x0

    goto :goto_12

    .line 54
    :cond_20
    :goto_11
    new-instance v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/c;

    const/4 v10, 0x0

    invoke-direct {v7, v6, v9, v2, v10}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/c;-><init>(Landroidx/lifecycle/v;LA/e;LN/V;I)V

    .line 55
    invoke-virtual {v14, v7}, LN/o;->U(Ljava/lang/Object;)V

    .line 56
    :goto_12
    check-cast v7, Ltf/l;

    .line 57
    invoke-virtual {v14, v10}, LN/o;->p(Z)V

    .line 58
    invoke-static {v6, v7, v14}, LN/d;->c(Ljava/lang/Object;Ltf/l;LN/o;)V

    .line 59
    sget-object v2, LE/i;->a:LE/f;

    const/16 v2, 0x8

    int-to-float v2, v2

    .line 60
    new-instance v4, LE/e;

    invoke-direct {v4, v2}, LE/e;-><init>(F)V

    const v2, 0x2952b718

    .line 61
    invoke-virtual {v14, v2}, LN/o;->M(I)V

    .line 62
    invoke-static {v4, v14}, LE/J;->a(LE/c;LN/o;)Lr0/n;

    move-result-object v2

    const v4, -0x4ee9b9da

    .line 63
    invoke-virtual {v14, v4}, LN/o;->M(I)V

    .line 64
    sget-object v7, Lu0/M;->e:LN/L0;

    .line 65
    invoke-virtual {v14, v7}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v10

    .line 66
    check-cast v10, LL0/b;

    .line 67
    sget-object v11, Lu0/M;->k:LN/L0;

    .line 68
    invoke-virtual {v14, v11}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v12

    .line 69
    check-cast v12, LL0/i;

    .line 70
    sget-object v13, Lu0/M;->o:LN/L0;

    .line 71
    invoke-virtual {v14, v13}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v15

    .line 72
    check-cast v15, Lu0/p0;

    .line 73
    sget-object v17, Lt0/c;->g9:Lt0/b;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v17, v9

    .line 74
    sget-object v9, Lt0/b;->b:Lt0/d;

    .line 75
    invoke-static/range {p4 .. p4}, LS3/f;->y(LZ/k;)LV/d;

    move-result-object v4

    .line 76
    invoke-virtual {v14}, LN/o;->O()V

    move-object/from16 v23, v6

    .line 77
    iget-boolean v6, v14, LN/o;->O:Z

    if-eqz v6, :cond_21

    .line 78
    invoke-virtual {v14, v9}, LN/o;->k(Ltf/a;)V

    :goto_13
    const/4 v6, 0x0

    goto :goto_14

    .line 79
    :cond_21
    invoke-virtual {v14}, LN/o;->X()V

    goto :goto_13

    .line 80
    :goto_14
    iput-boolean v6, v14, LN/o;->x:Z

    .line 81
    sget-object v6, Lt0/b;->e:Lt0/a;

    .line 82
    invoke-static {v14, v2, v6}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 83
    sget-object v2, Lt0/b;->d:Lt0/a;

    .line 84
    invoke-static {v14, v10, v2}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 85
    sget-object v10, Lt0/b;->f:Lt0/a;

    .line 86
    invoke-static {v14, v12, v10}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 87
    sget-object v12, Lt0/b;->g:Lt0/a;

    .line 88
    invoke-static {v14, v15, v12, v14}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    move-result-object v15

    move-object/from16 v24, v9

    const v9, 0x7ab4aae9

    move-object/from16 v25, v6

    const/4 v6, 0x0

    invoke-static {v6, v4, v15, v14, v9}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    const v4, -0x286e2e7f

    .line 89
    invoke-virtual {v14, v4}, LN/o;->M(I)V

    move-object v4, v10

    int-to-long v9, v8

    const-wide v26, 0xffffffffL

    and-long v9, v9, v26

    const/16 v15, 0xa

    .line 90
    invoke-static {v9, v10, v15}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v9

    .line 91
    const-string v10, "[SECONDS_LEFT]"

    invoke-static {v3, v10, v9, v6}, LBf/r;->h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v9

    move-object v6, v7

    .line 92
    sget-wide v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/utils/a;->b:J

    const v10, -0x1aac6387

    .line 93
    invoke-virtual {v14, v10}, LN/o;->M(I)V

    const-string v10, "custom_countdown_timer_text"

    invoke-virtual {v14, v10}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v10

    .line 94
    invoke-virtual {v14}, LN/o;->F()Ljava/lang/Object;

    move-result-object v15

    if-nez v10, :cond_22

    if-ne v15, v1, :cond_23

    .line 95
    :cond_22
    new-instance v15, Lcom/moloco/sdk/internal/publisher/d;

    const/16 v10, 0xd

    invoke-direct {v15, v10}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 96
    invoke-virtual {v14, v15}, LN/o;->U(Ljava/lang/Object;)V

    .line 97
    :cond_23
    check-cast v15, Ltf/l;

    const/4 v10, 0x0

    .line 98
    invoke-virtual {v14, v10}, LN/o;->p(Z)V

    .line 99
    invoke-static {v5, v10, v15}, LFe/g;->J(LZ/k;ZLtf/l;)LZ/k;

    move-result-object v15

    move-object v10, v13

    .line 100
    new-instance v13, LK0/c;

    const/4 v3, 0x5

    invoke-direct {v13, v3}, LK0/c;-><init>(I)V

    shl-int/lit8 v3, v22, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/lit16 v3, v3, 0xc00

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v27, v22

    move/from16 v22, v3

    move-object v3, v9

    const/4 v9, 0x0

    move-object/from16 v28, v10

    const/4 v10, 0x0

    move-object/from16 v29, v11

    move-object/from16 v30, v12

    const-wide/16 v11, 0x0

    move-object/from16 v31, v4

    move-object v4, v15

    const-wide/16 v14, 0x0

    const/16 v32, 0x2

    const/16 v16, 0x0

    move-object/from16 v33, v17

    const/16 v17, 0x0

    const v34, -0x4ee9b9da

    const/16 v18, 0x2

    move-object/from16 v35, v23

    const/16 v23, 0xc00

    move-object/from16 v36, v24

    const v24, 0xddf0

    move-object/from16 v21, v2

    move-object/from16 v2, p5

    move-object/from16 p5, v21

    move-object/from16 v21, p12

    move-object/from16 v38, v6

    move-object/from16 v42, v25

    move-object/from16 v40, v28

    move-object/from16 v39, v29

    move-object/from16 v44, v30

    move-object/from16 v43, v31

    move-object/from16 v37, v33

    move-object/from16 v41, v36

    move/from16 v25, v0

    move-object v0, v5

    move-wide/from16 v5, p2

    .line 101
    invoke-static/range {v3 .. v24}, LK/I;->b(Ljava/lang/String;LZ/k;JJLE0/l;LE0/o;JLK0/c;JIZILK/B;Lz0/p;LN/o;III)V

    move-object/from16 v14, v21

    .line 102
    sget-object v3, LZ/a;->e:LZ/d;

    move/from16 v7, p6

    .line 103
    invoke-static {v0, v7}, LE/L;->c(LZ/k;F)LZ/k;

    move-result-object v4

    const/4 v8, 0x2

    int-to-float v8, v8

    .line 104
    invoke-static {v4, v8}, Lcom/moloco/sdk/internal/publisher/H;->f0(LZ/k;F)LZ/k;

    move-result-object v4

    const v8, -0x1aac3014

    invoke-virtual {v14, v8}, LN/o;->M(I)V

    invoke-virtual {v14, v2}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v8

    .line 105
    invoke-virtual {v14}, LN/o;->F()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_25

    if-ne v9, v1, :cond_24

    goto :goto_15

    :cond_24
    const/4 v10, 0x0

    goto :goto_16

    .line 106
    :cond_25
    :goto_15
    new-instance v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/d;

    const/4 v10, 0x0

    invoke-direct {v9, v2, v10}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/d;-><init>(LN/V;I)V

    .line 107
    invoke-virtual {v14, v9}, LN/o;->U(Ljava/lang/Object;)V

    .line 108
    :goto_16
    check-cast v9, Ltf/l;

    .line 109
    invoke-virtual {v14, v10}, LN/o;->p(Z)V

    .line 110
    const-string v8, "<this>"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onSizeChanged"

    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    new-instance v8, Lr0/r;

    invoke-direct {v8, v9}, Lr0/r;-><init>(Ltf/l;)V

    .line 112
    invoke-interface {v4, v8}, LZ/k;->g(LZ/k;)LZ/k;

    move-result-object v4

    .line 113
    sget-wide v8, Le0/q;->d:J

    const v10, 0x3f666666    # 0.9f

    .line 114
    invoke-static {v8, v9, v10}, Le0/q;->a(JF)J

    move-result-wide v8

    .line 115
    sget-object v10, LH/e;->a:LH/d;

    .line 116
    invoke-static {v4, v8, v9, v10}, LU8/v0;->l(LZ/k;JLe0/E;)LZ/k;

    move-result-object v4

    const v8, -0x1aac1bd4

    .line 117
    invoke-virtual {v14, v8}, LN/o;->M(I)V

    const-string v8, "custom_timer_container"

    invoke-virtual {v14, v8}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v8

    .line 118
    invoke-virtual {v14}, LN/o;->F()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_26

    if-ne v9, v1, :cond_27

    .line 119
    :cond_26
    new-instance v9, Lcom/moloco/sdk/internal/publisher/d;

    const/16 v8, 0xe

    invoke-direct {v9, v8}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 120
    invoke-virtual {v14, v9}, LN/o;->U(Ljava/lang/Object;)V

    .line 121
    :cond_27
    check-cast v9, Ltf/l;

    const/4 v10, 0x0

    .line 122
    invoke-virtual {v14, v10}, LN/o;->p(Z)V

    .line 123
    invoke-static {v4, v10, v9}, LFe/g;->J(LZ/k;ZLtf/l;)LZ/k;

    move-result-object v4

    const v8, 0x2bb5b5d7

    .line 124
    invoke-virtual {v14, v8}, LN/o;->M(I)V

    .line 125
    invoke-static {v3, v10, v14}, LE/p;->c(LZ/d;ZLN/o;)Lr0/n;

    move-result-object v3

    const v8, -0x4ee9b9da

    .line 126
    invoke-virtual {v14, v8}, LN/o;->M(I)V

    move-object/from16 v8, v38

    .line 127
    invoke-virtual {v14, v8}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v8

    .line 128
    check-cast v8, LL0/b;

    move-object/from16 v9, v39

    .line 129
    invoke-virtual {v14, v9}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v9

    .line 130
    check-cast v9, LL0/i;

    move-object/from16 v10, v40

    .line 131
    invoke-virtual {v14, v10}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v10

    .line 132
    check-cast v10, Lu0/p0;

    .line 133
    invoke-static {v4}, LS3/f;->y(LZ/k;)LV/d;

    move-result-object v4

    .line 134
    invoke-virtual {v14}, LN/o;->O()V

    .line 135
    iget-boolean v11, v14, LN/o;->O:Z

    if-eqz v11, :cond_28

    move-object/from16 v11, v41

    .line 136
    invoke-virtual {v14, v11}, LN/o;->k(Ltf/a;)V

    :goto_17
    const/4 v11, 0x0

    goto :goto_18

    .line 137
    :cond_28
    invoke-virtual {v14}, LN/o;->X()V

    goto :goto_17

    .line 138
    :goto_18
    iput-boolean v11, v14, LN/o;->x:Z

    move-object/from16 v12, v42

    .line 139
    invoke-static {v14, v3, v12}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    move-object/from16 v3, p5

    .line 140
    invoke-static {v14, v8, v3}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    move-object/from16 v3, v43

    .line 141
    invoke-static {v14, v9, v3}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    move-object/from16 v3, v44

    .line 142
    invoke-static {v14, v10, v3, v14}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    move-result-object v3

    const v15, 0x7ab4aae9

    invoke-static {v11, v4, v3, v14, v15}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    const v3, -0x7f65a980

    .line 143
    invoke-virtual {v14, v3}, LN/o;->M(I)V

    .line 144
    invoke-static {v0}, LE/L;->a(LZ/k;)LZ/k;

    move-result-object v8

    const v0, -0x463ac91a

    invoke-virtual {v14, v0}, LN/o;->M(I)V

    move-wide/from16 v3, p0

    invoke-virtual {v14, v3, v4}, LN/o;->d(J)Z

    move-result v0

    invoke-virtual {v14, v2}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v0, v9

    move/from16 v9, v25

    invoke-virtual {v14, v9}, LN/o;->b(F)Z

    move-result v10

    or-int/2addr v0, v10

    move-object/from16 v10, v37

    invoke-virtual {v14, v10}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v0, v12

    invoke-virtual {v14, v5, v6}, LN/o;->d(J)Z

    move-result v12

    or-int/2addr v0, v12

    .line 145
    invoke-virtual {v14}, LN/o;->F()Ljava/lang/Object;

    move-result-object v12

    if-nez v0, :cond_2a

    if-ne v12, v1, :cond_29

    goto :goto_19

    :cond_29
    move v3, v9

    move v10, v11

    goto :goto_1a

    .line 146
    :cond_2a
    :goto_19
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/e;

    move-object v7, v2

    move-wide v1, v3

    move v3, v9

    move-object v4, v10

    move v10, v11

    invoke-direct/range {v0 .. v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/e;-><init>(JFLA/e;JLN/V;)V

    .line 147
    invoke-virtual {v14, v0}, LN/o;->U(Ljava/lang/Object;)V

    move-object v12, v0

    .line 148
    :goto_1a
    check-cast v12, Ltf/l;

    .line 149
    invoke-virtual {v14, v10}, LN/o;->p(Z)V

    const/4 v0, 0x6

    .line 150
    invoke-static {v8, v12, v14, v0}, Landroid/support/v4/media/session/b;->F(LZ/k;Ltf/l;LN/o;I)V

    const/4 v0, 0x1

    .line 151
    invoke-static {v14, v10, v10, v0, v10}, Lwg/b;->e(LN/o;ZZZZ)V

    invoke-static {v14, v10, v10, v10, v0}, Lwg/b;->e(LN/o;ZZZZ)V

    .line 152
    invoke-virtual {v14, v10}, LN/o;->p(Z)V

    .line 153
    invoke-virtual {v14, v10}, LN/o;->p(Z)V

    move v6, v3

    move-object/from16 v10, v35

    .line 154
    :goto_1b
    invoke-virtual {v14}, LN/o;->r()LN/i0;

    move-result-object v14

    if-eqz v14, :cond_2b

    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/f;

    move-wide/from16 v1, p0

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/f;-><init>(JJLZ/k;FFLtf/a;Ljava/lang/String;Landroidx/lifecycle/v;III)V

    .line 155
    iput-object v0, v14, LN/i0;->d:Ltf/p;

    :cond_2b
    return-void
.end method

.method public static final f(Landroid/webkit/WebView;LZ/k;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;LN/o;I)V
    .locals 11

    .line 1
    const-string v0, "webView"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, -0x42422c80

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3, v0}, LN/o;->N(I)LN/o;

    .line 10
    .line 11
    .line 12
    and-int/lit8 v0, p4, 0x6

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p3, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x2

    .line 25
    :goto_0
    or-int/2addr v0, p4

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v0, p4

    .line 28
    :goto_1
    and-int/lit8 v1, p4, 0x30

    .line 29
    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    invoke-virtual {p3, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    const/16 v1, 0x20

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    const/16 v1, 0x10

    .line 42
    .line 43
    :goto_2
    or-int/2addr v0, v1

    .line 44
    :cond_3
    and-int/lit16 v1, p4, 0x180

    .line 45
    .line 46
    if-nez v1, :cond_5

    .line 47
    .line 48
    invoke-virtual {p3, p2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    const/16 v1, 0x100

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_4
    const/16 v1, 0x80

    .line 58
    .line 59
    :goto_3
    or-int/2addr v0, v1

    .line 60
    :cond_5
    and-int/lit16 v1, v0, 0x93

    .line 61
    .line 62
    const/16 v2, 0x92

    .line 63
    .line 64
    if-ne v1, v2, :cond_7

    .line 65
    .line 66
    invoke-virtual {p3}, LN/o;->x()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_6

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_6
    invoke-virtual {p3}, LN/o;->I()V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_6

    .line 77
    .line 78
    :cond_7
    :goto_4
    const v1, 0x5bc2c4a4

    .line 79
    .line 80
    .line 81
    invoke-virtual {p3, v1}, LN/o;->M(I)V

    .line 82
    .line 83
    .line 84
    const v1, 0x5bc24789

    .line 85
    .line 86
    .line 87
    invoke-virtual {p3, v1}, LN/o;->M(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p3, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-virtual {p3}, LN/o;->F()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    sget-object v3, LN/k;->a:LN/P;

    .line 99
    .line 100
    if-nez v1, :cond_8

    .line 101
    .line 102
    if-ne v2, v3, :cond_9

    .line 103
    .line 104
    :cond_8
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/a;

    .line 105
    .line 106
    const/4 v1, 0x0

    .line 107
    invoke-direct {v2, p0, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/a;-><init>(Landroid/webkit/WebView;I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p3, v2}, LN/o;->U(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_9
    move-object v5, v2

    .line 114
    check-cast v5, Ltf/l;

    .line 115
    .line 116
    const/4 v1, 0x0

    .line 117
    invoke-virtual {p3, v1}, LN/o;->p(Z)V

    .line 118
    .line 119
    .line 120
    and-int/lit8 v9, v0, 0x70

    .line 121
    .line 122
    const/4 v7, 0x0

    .line 123
    const/4 v10, 0x4

    .line 124
    move-object v6, p1

    .line 125
    move-object v8, p3

    .line 126
    invoke-static/range {v5 .. v10}, La/a;->c(Ltf/l;LZ/k;LM0/m;LN/o;II)V

    .line 127
    .line 128
    .line 129
    const v2, 0x5bc2c7a1

    .line 130
    .line 131
    .line 132
    invoke-virtual {p3, v2}, LN/o;->M(I)V

    .line 133
    .line 134
    .line 135
    if-nez p2, :cond_a

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_a
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/k;

    .line 139
    .line 140
    const/4 v5, 0x1

    .line 141
    invoke-direct {v2, v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/k;-><init>(I)V

    .line 142
    .line 143
    .line 144
    const v5, 0x3cb77a0f

    .line 145
    .line 146
    .line 147
    invoke-static {p3, v5, v2}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    shr-int/lit8 v0, v0, 0x3

    .line 152
    .line 153
    and-int/lit8 v0, v0, 0x70

    .line 154
    .line 155
    or-int/lit8 v0, v0, 0x6

    .line 156
    .line 157
    move-object v5, p2

    .line 158
    check-cast v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 159
    .line 160
    invoke-virtual {v5, v2, p3, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;->a(LV/d;LN/o;I)V

    .line 161
    .line 162
    .line 163
    :goto_5
    invoke-virtual {p3, v1}, LN/o;->p(Z)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p3, v1}, LN/o;->p(Z)V

    .line 167
    .line 168
    .line 169
    const v0, 0x5bc2e14f

    .line 170
    .line 171
    .line 172
    invoke-virtual {p3, v0}, LN/o;->M(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p3, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    invoke-virtual {p3}, LN/o;->F()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    if-nez v0, :cond_b

    .line 184
    .line 185
    if-ne v2, v3, :cond_c

    .line 186
    .line 187
    :cond_b
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/a;

    .line 188
    .line 189
    const/4 v0, 0x1

    .line 190
    invoke-direct {v2, p0, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/a;-><init>(Landroid/webkit/WebView;I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p3, v2}, LN/o;->U(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_c
    check-cast v2, Ltf/l;

    .line 197
    .line 198
    invoke-virtual {p3, v1}, LN/o;->p(Z)V

    .line 199
    .line 200
    .line 201
    invoke-static {p0, v2, p3}, LN/d;->c(Ljava/lang/Object;Ltf/l;LN/o;)V

    .line 202
    .line 203
    .line 204
    :goto_6
    invoke-virtual {p3}, LN/o;->r()LN/i0;

    .line 205
    .line 206
    .line 207
    move-result-object p3

    .line 208
    if-eqz p3, :cond_d

    .line 209
    .line 210
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/b;

    .line 211
    .line 212
    const/4 v5, 0x2

    .line 213
    move-object v1, p0

    .line 214
    move-object v2, p1

    .line 215
    move-object v3, p2

    .line 216
    move v4, p4

    .line 217
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/b;-><init>(Ljava/lang/Object;LZ/k;Ljava/lang/Object;II)V

    .line 218
    .line 219
    .line 220
    iput-object v0, p3, LN/i0;->d:Ltf/p;

    .line 221
    .line 222
    :cond_d
    return-void
.end method

.method public static final g(Lc0/g;)LP/d;
    .locals 5

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lc0/g;->c:LP/d;

    .line 7
    .line 8
    iget v0, p0, LP/d;->c:I

    .line 9
    .line 10
    if-lez v0, :cond_5

    .line 11
    .line 12
    iget-object v1, p0, LP/d;->a:[Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :cond_0
    aget-object v4, v1, v3

    .line 17
    .line 18
    check-cast v4, Lc0/g;

    .line 19
    .line 20
    iget-object v4, v4, Lc0/g;->d:Lc0/r;

    .line 21
    .line 22
    invoke-virtual {v4}, Lc0/r;->a()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_4

    .line 27
    .line 28
    new-instance v0, LP/d;

    .line 29
    .line 30
    const/16 v1, 0x10

    .line 31
    .line 32
    new-array v1, v1, [Lc0/g;

    .line 33
    .line 34
    invoke-direct {v0, v1}, LP/d;-><init>([Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget v1, p0, LP/d;->c:I

    .line 38
    .line 39
    if-lez v1, :cond_3

    .line 40
    .line 41
    iget-object p0, p0, LP/d;->a:[Ljava/lang/Object;

    .line 42
    .line 43
    :cond_1
    aget-object v3, p0, v2

    .line 44
    .line 45
    check-cast v3, Lc0/g;

    .line 46
    .line 47
    iget-object v4, v3, Lc0/g;->d:Lc0/r;

    .line 48
    .line 49
    invoke-virtual {v4}, Lc0/r;->a()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0, v3}, LP/d;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-static {v3}, LA6/c;->g(Lc0/g;)LP/d;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget v4, v0, LP/d;->c:I

    .line 64
    .line 65
    invoke-virtual {v0, v4, v3}, LP/d;->c(ILP/d;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    if-lt v2, v1, :cond_1

    .line 71
    .line 72
    :cond_3
    return-object v0

    .line 73
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    if-lt v3, v0, :cond_0

    .line 76
    .line 77
    :cond_5
    return-object p0
.end method

.method public static final h(Lp0/s;Llf/a;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, LC/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LC/b;

    .line 7
    .line 8
    iget v1, v0, LC/b;->c:I

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
    iput v1, v0, LC/b;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LC/b;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LC/b;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LC/b;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, LC/b;->a:Lp0/s;

    .line 38
    .line 39
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0

    .line 51
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const-string p1, "<this>"

    .line 55
    .line 56
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lp0/s;->e:Lp0/t;

    .line 60
    .line 61
    iget-object p1, p1, Lp0/t;->e:Lp0/f;

    .line 62
    .line 63
    iget-object p1, p1, Lp0/f;->a:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    move v5, v4

    .line 70
    :goto_1
    if-ge v5, v2, :cond_6

    .line 71
    .line 72
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    check-cast v6, Lp0/k;

    .line 77
    .line 78
    iget-boolean v6, v6, Lp0/k;->d:Z

    .line 79
    .line 80
    if-eqz v6, :cond_5

    .line 81
    .line 82
    :goto_2
    sget-object p1, Lp0/g;->c:Lp0/g;

    .line 83
    .line 84
    iput-object p0, v0, LC/b;->a:Lp0/s;

    .line 85
    .line 86
    iput v3, v0, LC/b;->c:I

    .line 87
    .line 88
    invoke-virtual {p0, p1, v0}, Lp0/s;->e(Lp0/g;Llf/a;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-ne p1, v1, :cond_3

    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_3
    :goto_3
    check-cast p1, Lp0/f;

    .line 96
    .line 97
    iget-object p1, p1, Lp0/f;->a:Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    move v5, v4

    .line 104
    :goto_4
    if-ge v5, v2, :cond_6

    .line 105
    .line 106
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    check-cast v6, Lp0/k;

    .line 111
    .line 112
    iget-boolean v6, v6, Lp0/k;->d:Z

    .line 113
    .line 114
    if-eqz v6, :cond_4

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_6
    sget-object p0, Lef/C;->a:Lef/C;

    .line 124
    .line 125
    return-object p0
.end method

.method public static final i(Lcom/moloco/sdk/internal/publisher/nativead/model/b;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;Llf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lcom/moloco/sdk/internal/publisher/nativead/parser/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/b;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/b;->c:I

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
    iput v1, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/b;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/b;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/b;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/b;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/b;->a:Lcom/moloco/sdk/internal/publisher/nativead/model/b;

    .line 37
    .line 38
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lcom/moloco/sdk/internal/publisher/nativead/model/b;->c:Ljava/lang/String;

    .line 54
    .line 55
    iput-object p0, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/b;->a:Lcom/moloco/sdk/internal/publisher/nativead/model/b;

    .line 56
    .line 57
    iput v3, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/b;->c:I

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    sget-object v2, LEf/S;->a:LLf/e;

    .line 63
    .line 64
    sget-object v2, LLf/d;->b:LLf/d;

    .line 65
    .line 66
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/j;

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    invoke-direct {v3, p2, p1, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/j;-><init>(Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;Ljf/c;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v2, v3, v0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    if-ne p2, v1, :cond_3

    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_3
    :goto_1
    check-cast p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/i;

    .line 80
    .line 81
    instance-of p1, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/h;

    .line 82
    .line 83
    if-eqz p1, :cond_4

    .line 84
    .line 85
    :try_start_0
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 86
    .line 87
    const-string v1, "PrepareNativeAssets"

    .line 88
    .line 89
    const-string v2, "Successfully loaded image asset media"

    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    const/4 v4, 0x0

    .line 93
    const/16 v5, 0xc

    .line 94
    .line 95
    const/4 v6, 0x0

    .line 96
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    check-cast p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/h;

    .line 100
    .line 101
    iget-object p1, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/h;->a:Ljava/io/File;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    const-string p2, "getAbsolutePath(...)"

    .line 108
    .line 109
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const-string p2, "parse(this)"

    .line 117
    .line 118
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    .line 120
    .line 121
    new-instance p2, Lcom/moloco/sdk/internal/z;

    .line 122
    .line 123
    new-instance v0, Lcom/moloco/sdk/internal/publisher/nativead/model/j;

    .line 124
    .line 125
    invoke-direct {v0, p0, p1}, Lcom/moloco/sdk/internal/publisher/nativead/model/j;-><init>(Lcom/moloco/sdk/internal/publisher/nativead/model/b;Landroid/net/Uri;)V

    .line 126
    .line 127
    .line 128
    invoke-direct {p2, v0}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return-object p2

    .line 132
    :goto_2
    move-object v3, p0

    .line 133
    goto :goto_3

    .line 134
    :catch_0
    move-exception v0

    .line 135
    move-object p0, v0

    .line 136
    goto :goto_2

    .line 137
    :goto_3
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 138
    .line 139
    const-string v2, "Failed to prepare image asset"

    .line 140
    .line 141
    const/4 v4, 0x0

    .line 142
    const-string v1, "PrepareNativeAssets"

    .line 143
    .line 144
    const/16 v5, 0x8

    .line 145
    .line 146
    const/4 v6, 0x0

    .line 147
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    new-instance p0, Lcom/moloco/sdk/internal/y;

    .line 151
    .line 152
    sget-object p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/f;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/f;

    .line 153
    .line 154
    invoke-direct {p0, p1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    return-object p0

    .line 158
    :cond_4
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 159
    .line 160
    const/4 v3, 0x0

    .line 161
    const/4 v4, 0x0

    .line 162
    const-string v1, "PrepareNativeAssets"

    .line 163
    .line 164
    const-string v2, "Failed to fetch image asset media"

    .line 165
    .line 166
    const/16 v5, 0xc

    .line 167
    .line 168
    const/4 v6, 0x0

    .line 169
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    new-instance p0, Lcom/moloco/sdk/internal/y;

    .line 173
    .line 174
    sget-object p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/f;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/f;

    .line 175
    .line 176
    invoke-direct {p0, p1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-object p0
.end method

.method public static final j(Lcom/moloco/sdk/internal/publisher/nativead/model/d;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;JLlf/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p4, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;->e:I

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
    iput v1, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;->e:I

    .line 30
    .line 31
    const-string v3, "Failed to fetch video asset media: "

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v5, :cond_2

    .line 38
    .line 39
    if-ne v2, v4, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;->a:Lcom/moloco/sdk/internal/publisher/nativead/model/d;

    .line 42
    .line 43
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_2
    iget-wide p2, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;->c:J

    .line 57
    .line 58
    iget-object p1, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 59
    .line 60
    iget-object p0, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;->a:Lcom/moloco/sdk/internal/publisher/nativead/model/d;

    .line 61
    .line 62
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p4, p0, Lcom/moloco/sdk/internal/publisher/nativead/model/d;->c:Ljava/lang/String;

    .line 70
    .line 71
    iput-object p0, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;->a:Lcom/moloco/sdk/internal/publisher/nativead/model/d;

    .line 72
    .line 73
    iput-object p1, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 74
    .line 75
    iput-wide p2, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;->c:J

    .line 76
    .line 77
    iput v5, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;->e:I

    .line 78
    .line 79
    const-string v2, "UNKNOWN_MTID"

    .line 80
    .line 81
    invoke-virtual {p1, p4, v2, v5, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->i(Ljava/lang/String;Ljava/lang/String;ZLlf/c;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p4

    .line 85
    if-ne p4, v1, :cond_4

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    :goto_1
    check-cast p4, Lcom/moloco/sdk/internal/A;

    .line 89
    .line 90
    instance-of v2, p4, Lcom/moloco/sdk/internal/z;

    .line 91
    .line 92
    if-eqz v2, :cond_a

    .line 93
    .line 94
    invoke-static {p2, p3}, LCf/a;->d(J)J

    .line 95
    .line 96
    .line 97
    move-result-wide p2

    .line 98
    long-to-double p2, p2

    .line 99
    const-wide v5, 0x3feccccccccccccdL    # 0.9

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    mul-double/2addr p2, v5

    .line 105
    sget-object v2, LCf/c;->c:LCf/c;

    .line 106
    .line 107
    const-string v5, "unit"

    .line 108
    .line 109
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    sget-object v5, LCf/c;->b:LCf/c;

    .line 113
    .line 114
    invoke-static {p2, p3, v2, v5}, LFe/c;->n(DLCf/c;LCf/c;)D

    .line 115
    .line 116
    .line 117
    move-result-wide v5

    .line 118
    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-nez v7, :cond_9

    .line 123
    .line 124
    invoke-static {v5, v6}, Lvf/a;->I(D)J

    .line 125
    .line 126
    .line 127
    move-result-wide v5

    .line 128
    const-wide v7, -0x3ffffffffffa14bfL    # -2.0000000001722644

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    cmp-long v7, v7, v5

    .line 134
    .line 135
    if-gtz v7, :cond_5

    .line 136
    .line 137
    const-wide v7, 0x3ffffffffffa14c0L    # 1.999999999913868

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    cmp-long v7, v5, v7

    .line 143
    .line 144
    if-gez v7, :cond_5

    .line 145
    .line 146
    invoke-static {v5, v6}, LFe/b;->t(J)J

    .line 147
    .line 148
    .line 149
    move-result-wide p2

    .line 150
    goto :goto_2

    .line 151
    :cond_5
    invoke-static {p2, p3, v2, v2}, LFe/c;->n(DLCf/c;LCf/c;)D

    .line 152
    .line 153
    .line 154
    move-result-wide p2

    .line 155
    invoke-static {p2, p3}, Lvf/a;->I(D)J

    .line 156
    .line 157
    .line 158
    move-result-wide p2

    .line 159
    invoke-static {p2, p3}, LFe/b;->s(J)J

    .line 160
    .line 161
    .line 162
    move-result-wide p2

    .line 163
    :goto_2
    check-cast p4, Lcom/moloco/sdk/internal/z;

    .line 164
    .line 165
    iget-object p4, p4, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast p4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;

    .line 168
    .line 169
    iput-object p0, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;->a:Lcom/moloco/sdk/internal/publisher/nativead/model/d;

    .line 170
    .line 171
    const/4 v2, 0x0

    .line 172
    iput-object v2, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 173
    .line 174
    iput v4, v0, Lcom/moloco/sdk/internal/publisher/nativead/parser/h;->e:I

    .line 175
    .line 176
    invoke-virtual {p1, p4, p2, p3, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->h(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;JLlf/c;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p4

    .line 180
    if-ne p4, v1, :cond_6

    .line 181
    .line 182
    :goto_3
    return-object v1

    .line 183
    :cond_6
    :goto_4
    check-cast p4, Lcom/moloco/sdk/internal/A;

    .line 184
    .line 185
    instance-of p1, p4, Lcom/moloco/sdk/internal/z;

    .line 186
    .line 187
    if-eqz p1, :cond_7

    .line 188
    .line 189
    sget-object v4, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 190
    .line 191
    const/4 v7, 0x0

    .line 192
    const/4 v8, 0x0

    .line 193
    const-string v5, "PrepareNativeAssets"

    .line 194
    .line 195
    const-string v6, "Successfully loaded video asset media"

    .line 196
    .line 197
    const/16 v9, 0xc

    .line 198
    .line 199
    const/4 v10, 0x0

    .line 200
    invoke-static/range {v4 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    new-instance p1, Lcom/moloco/sdk/internal/z;

    .line 204
    .line 205
    new-instance p2, Lcom/moloco/sdk/internal/publisher/nativead/model/l;

    .line 206
    .line 207
    check-cast p4, Lcom/moloco/sdk/internal/z;

    .line 208
    .line 209
    iget-object p3, p4, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;

    .line 212
    .line 213
    invoke-direct {p2, p0, p3}, Lcom/moloco/sdk/internal/publisher/nativead/model/l;-><init>(Lcom/moloco/sdk/internal/publisher/nativead/model/d;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;)V

    .line 214
    .line 215
    .line 216
    invoke-direct {p1, p2}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    return-object p1

    .line 220
    :cond_7
    instance-of p0, p4, Lcom/moloco/sdk/internal/y;

    .line 221
    .line 222
    if-eqz p0, :cond_8

    .line 223
    .line 224
    sget-object v4, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 225
    .line 226
    new-instance p0, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    check-cast p4, Lcom/moloco/sdk/internal/y;

    .line 232
    .line 233
    iget-object p1, p4, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 234
    .line 235
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    const/4 v7, 0x0

    .line 243
    const/4 v8, 0x0

    .line 244
    const-string v5, "PrepareNativeAssets"

    .line 245
    .line 246
    const/16 v9, 0xc

    .line 247
    .line 248
    const/4 v10, 0x0

    .line 249
    invoke-static/range {v4 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    new-instance p0, Lcom/moloco/sdk/internal/y;

    .line 253
    .line 254
    sget-object p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/f;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/f;

    .line 255
    .line 256
    invoke-direct {p0, p1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    return-object p0

    .line 260
    :cond_8
    new-instance p0, LE5/Q;

    .line 261
    .line 262
    const/16 p1, 0x9

    .line 263
    .line 264
    const/4 p2, 0x0

    .line 265
    invoke-direct {p0, p2, p1}, LE5/Q;-><init>(BI)V

    .line 266
    .line 267
    .line 268
    throw p0

    .line 269
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 270
    .line 271
    const-string p1, "Duration value cannot be NaN."

    .line 272
    .line 273
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw p0

    .line 277
    :cond_a
    instance-of p0, p4, Lcom/moloco/sdk/internal/y;

    .line 278
    .line 279
    if-eqz p0, :cond_b

    .line 280
    .line 281
    sget-object v4, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 282
    .line 283
    new-instance p0, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    check-cast p4, Lcom/moloco/sdk/internal/y;

    .line 289
    .line 290
    iget-object p1, p4, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 291
    .line 292
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    const/4 v7, 0x0

    .line 300
    const/4 v8, 0x0

    .line 301
    const-string v5, "PrepareNativeAssets"

    .line 302
    .line 303
    const/16 v9, 0xc

    .line 304
    .line 305
    const/4 v10, 0x0

    .line 306
    invoke-static/range {v4 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    new-instance p0, Lcom/moloco/sdk/internal/y;

    .line 310
    .line 311
    sget-object p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/f;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/f;

    .line 312
    .line 313
    invoke-direct {p0, p1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    return-object p0

    .line 317
    :cond_b
    new-instance p0, LE5/Q;

    .line 318
    .line 319
    const/16 p1, 0x9

    .line 320
    .line 321
    const/4 p2, 0x0

    .line 322
    invoke-direct {p0, p2, p1}, LE5/Q;-><init>(BI)V

    .line 323
    .line 324
    .line 325
    throw p0
.end method

.method public static k(LY1/m;Ljava/lang/String;LY1/j;I)LS1/k;
    .locals 11

    .line 1
    sget-object v4, Ll8/j0;->g:Ll8/j0;

    .line 2
    .line 3
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 4
    .line 5
    iget-object v0, p2, LY1/j;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p1, v0}, LQ1/k;->u(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, LY1/m;->a()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    :goto_0
    move-object v9, p1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget-object p0, p0, LY1/m;->b:Ll8/K;

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, LY1/b;

    .line 27
    .line 28
    iget-object p0, p0, LY1/b;->a:Ljava/lang/String;

    .line 29
    .line 30
    iget-object p1, p2, LY1/j;->c:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {p0, p1}, LQ1/k;->u(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_0

    .line 41
    :goto_1
    const-string p0, "The uri must be set."

    .line 42
    .line 43
    invoke-static {v1, p0}, LQ1/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, LS1/k;

    .line 47
    .line 48
    iget-wide v5, p2, LY1/j;->a:J

    .line 49
    .line 50
    iget-wide v7, p2, LY1/j;->b:J

    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    const/4 v3, 0x0

    .line 54
    move v10, p3

    .line 55
    invoke-direct/range {v0 .. v10}, LS1/k;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method

.method public static final l(Ljava/lang/String;)LNd/c;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LNd/c;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LNd/c;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static m(LJ5/h;)Z
    .locals 4

    .line 1
    new-instance v0, LY4/b;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, LY4/b;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, LU5/f;->b(LJ5/h;LY4/b;)LU5/f;

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
    iget-object v1, v0, LY4/b;->a:[B

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    invoke-virtual {p0, v1, v3, v2, v3}, LJ5/h;->c([BIIZ)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v3}, LY4/b;->A(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, LY4/b;->d()I

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
    invoke-static {v0, p0}, Lu6/a;->o(Ljava/lang/String;Ljava/lang/String;)V

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

.method public static n(II)I
    .locals 5

    .line 1
    int-to-long v0, p0

    .line 2
    int-to-long v2, p1

    .line 3
    add-long/2addr v0, v2

    .line 4
    long-to-int v2, v0

    .line 5
    int-to-long v3, v2

    .line 6
    cmp-long v0, v0, v3

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v2

    .line 16
    :cond_1
    new-instance v0, Ljava/lang/ArithmeticException;

    .line 17
    .line 18
    const-string v1, "overflow: checkedAdd("

    .line 19
    .line 20
    const-string v2, ", "

    .line 21
    .line 22
    const-string v3, ")"

    .line 23
    .line 24
    invoke-static {v1, p0, v2, p1, v3}, LN0/a;->e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v0, p0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public static final o([BII)Ljava/lang/String;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    if-ltz v1, :cond_19

    .line 8
    .line 9
    array-length v3, v0

    .line 10
    if-gt v2, v3, :cond_19

    .line 11
    .line 12
    if-gt v1, v2, :cond_19

    .line 13
    .line 14
    sub-int v3, v2, v1

    .line 15
    .line 16
    new-array v3, v3, [C

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    move v5, v4

    .line 20
    :goto_0
    if-ge v1, v2, :cond_18

    .line 21
    .line 22
    aget-byte v6, v0, v1

    .line 23
    .line 24
    if-ltz v6, :cond_1

    .line 25
    .line 26
    int-to-char v6, v6

    .line 27
    add-int/lit8 v7, v5, 0x1

    .line 28
    .line 29
    aput-char v6, v3, v5

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    :goto_1
    if-ge v1, v2, :cond_0

    .line 34
    .line 35
    aget-byte v5, v0, v1

    .line 36
    .line 37
    if-ltz v5, :cond_0

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    int-to-char v5, v5

    .line 42
    add-int/lit8 v6, v7, 0x1

    .line 43
    .line 44
    aput-char v5, v3, v7

    .line 45
    .line 46
    move v7, v6

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    :goto_2
    move v5, v7

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    shr-int/lit8 v7, v6, 0x5

    .line 51
    .line 52
    const/4 v9, 0x1

    .line 53
    const/4 v10, -0x2

    .line 54
    const/16 v11, 0x80

    .line 55
    .line 56
    const v12, 0xfffd

    .line 57
    .line 58
    .line 59
    if-ne v7, v10, :cond_6

    .line 60
    .line 61
    add-int/lit8 v7, v1, 0x1

    .line 62
    .line 63
    if-gt v2, v7, :cond_3

    .line 64
    .line 65
    int-to-char v6, v12

    .line 66
    add-int/lit8 v7, v5, 0x1

    .line 67
    .line 68
    aput-char v6, v3, v5

    .line 69
    .line 70
    :cond_2
    :goto_3
    move v8, v9

    .line 71
    goto :goto_5

    .line 72
    :cond_3
    aget-byte v7, v0, v7

    .line 73
    .line 74
    and-int/lit16 v10, v7, 0xc0

    .line 75
    .line 76
    if-ne v10, v11, :cond_5

    .line 77
    .line 78
    xor-int/lit16 v7, v7, 0xf80

    .line 79
    .line 80
    shl-int/lit8 v6, v6, 0x6

    .line 81
    .line 82
    xor-int/2addr v6, v7

    .line 83
    if-ge v6, v11, :cond_4

    .line 84
    .line 85
    int-to-char v6, v12

    .line 86
    add-int/lit8 v7, v5, 0x1

    .line 87
    .line 88
    aput-char v6, v3, v5

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_4
    int-to-char v6, v6

    .line 92
    add-int/lit8 v7, v5, 0x1

    .line 93
    .line 94
    aput-char v6, v3, v5

    .line 95
    .line 96
    :goto_4
    const/4 v8, 0x2

    .line 97
    goto :goto_5

    .line 98
    :cond_5
    int-to-char v6, v12

    .line 99
    add-int/lit8 v7, v5, 0x1

    .line 100
    .line 101
    aput-char v6, v3, v5

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :goto_5
    add-int/2addr v1, v8

    .line 105
    goto :goto_2

    .line 106
    :cond_6
    shr-int/lit8 v7, v6, 0x4

    .line 107
    .line 108
    const/4 v13, 0x3

    .line 109
    const v14, 0xe000

    .line 110
    .line 111
    .line 112
    const v15, 0xd800

    .line 113
    .line 114
    .line 115
    if-ne v7, v10, :cond_c

    .line 116
    .line 117
    add-int/lit8 v7, v1, 0x2

    .line 118
    .line 119
    if-gt v2, v7, :cond_7

    .line 120
    .line 121
    int-to-char v6, v12

    .line 122
    add-int/lit8 v7, v5, 0x1

    .line 123
    .line 124
    aput-char v6, v3, v5

    .line 125
    .line 126
    add-int/lit8 v5, v1, 0x1

    .line 127
    .line 128
    if-le v2, v5, :cond_2

    .line 129
    .line 130
    aget-byte v5, v0, v5

    .line 131
    .line 132
    and-int/lit16 v5, v5, 0xc0

    .line 133
    .line 134
    if-ne v5, v11, :cond_2

    .line 135
    .line 136
    :goto_6
    goto :goto_4

    .line 137
    :cond_7
    add-int/lit8 v10, v1, 0x1

    .line 138
    .line 139
    aget-byte v10, v0, v10

    .line 140
    .line 141
    and-int/lit16 v8, v10, 0xc0

    .line 142
    .line 143
    if-ne v8, v11, :cond_b

    .line 144
    .line 145
    aget-byte v7, v0, v7

    .line 146
    .line 147
    and-int/lit16 v8, v7, 0xc0

    .line 148
    .line 149
    if-ne v8, v11, :cond_a

    .line 150
    .line 151
    const v8, -0x1e080

    .line 152
    .line 153
    .line 154
    xor-int/2addr v7, v8

    .line 155
    shl-int/lit8 v8, v10, 0x6

    .line 156
    .line 157
    xor-int/2addr v7, v8

    .line 158
    shl-int/lit8 v6, v6, 0xc

    .line 159
    .line 160
    xor-int/2addr v6, v7

    .line 161
    const/16 v7, 0x800

    .line 162
    .line 163
    if-ge v6, v7, :cond_8

    .line 164
    .line 165
    int-to-char v6, v12

    .line 166
    add-int/lit8 v7, v5, 0x1

    .line 167
    .line 168
    aput-char v6, v3, v5

    .line 169
    .line 170
    goto :goto_7

    .line 171
    :cond_8
    if-gt v15, v6, :cond_9

    .line 172
    .line 173
    if-ge v6, v14, :cond_9

    .line 174
    .line 175
    int-to-char v6, v12

    .line 176
    add-int/lit8 v7, v5, 0x1

    .line 177
    .line 178
    aput-char v6, v3, v5

    .line 179
    .line 180
    goto :goto_7

    .line 181
    :cond_9
    int-to-char v6, v6

    .line 182
    add-int/lit8 v7, v5, 0x1

    .line 183
    .line 184
    aput-char v6, v3, v5

    .line 185
    .line 186
    :goto_7
    move v8, v13

    .line 187
    goto :goto_5

    .line 188
    :cond_a
    int-to-char v6, v12

    .line 189
    add-int/lit8 v7, v5, 0x1

    .line 190
    .line 191
    aput-char v6, v3, v5

    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_b
    int-to-char v6, v12

    .line 195
    add-int/lit8 v7, v5, 0x1

    .line 196
    .line 197
    aput-char v6, v3, v5

    .line 198
    .line 199
    goto/16 :goto_3

    .line 200
    .line 201
    :cond_c
    shr-int/lit8 v7, v6, 0x3

    .line 202
    .line 203
    if-ne v7, v10, :cond_17

    .line 204
    .line 205
    add-int/lit8 v7, v1, 0x3

    .line 206
    .line 207
    if-gt v2, v7, :cond_f

    .line 208
    .line 209
    add-int/lit8 v6, v5, 0x1

    .line 210
    .line 211
    aput-char v12, v3, v5

    .line 212
    .line 213
    add-int/lit8 v5, v1, 0x1

    .line 214
    .line 215
    if-le v2, v5, :cond_e

    .line 216
    .line 217
    aget-byte v5, v0, v5

    .line 218
    .line 219
    and-int/lit16 v5, v5, 0xc0

    .line 220
    .line 221
    if-ne v5, v11, :cond_e

    .line 222
    .line 223
    add-int/lit8 v5, v1, 0x2

    .line 224
    .line 225
    if-le v2, v5, :cond_d

    .line 226
    .line 227
    aget-byte v5, v0, v5

    .line 228
    .line 229
    and-int/lit16 v5, v5, 0xc0

    .line 230
    .line 231
    if-ne v5, v11, :cond_d

    .line 232
    .line 233
    :goto_8
    move v8, v13

    .line 234
    goto/16 :goto_d

    .line 235
    .line 236
    :cond_d
    :goto_9
    const/4 v8, 0x2

    .line 237
    goto/16 :goto_d

    .line 238
    .line 239
    :cond_e
    :goto_a
    move v8, v9

    .line 240
    goto/16 :goto_d

    .line 241
    .line 242
    :cond_f
    add-int/lit8 v8, v1, 0x1

    .line 243
    .line 244
    aget-byte v8, v0, v8

    .line 245
    .line 246
    and-int/lit16 v10, v8, 0xc0

    .line 247
    .line 248
    if-ne v10, v11, :cond_16

    .line 249
    .line 250
    add-int/lit8 v9, v1, 0x2

    .line 251
    .line 252
    aget-byte v9, v0, v9

    .line 253
    .line 254
    and-int/lit16 v10, v9, 0xc0

    .line 255
    .line 256
    if-ne v10, v11, :cond_15

    .line 257
    .line 258
    aget-byte v7, v0, v7

    .line 259
    .line 260
    and-int/lit16 v10, v7, 0xc0

    .line 261
    .line 262
    if-ne v10, v11, :cond_14

    .line 263
    .line 264
    const v10, 0x381f80

    .line 265
    .line 266
    .line 267
    xor-int/2addr v7, v10

    .line 268
    shl-int/lit8 v9, v9, 0x6

    .line 269
    .line 270
    xor-int/2addr v7, v9

    .line 271
    shl-int/lit8 v8, v8, 0xc

    .line 272
    .line 273
    xor-int/2addr v7, v8

    .line 274
    shl-int/lit8 v6, v6, 0x12

    .line 275
    .line 276
    xor-int/2addr v6, v7

    .line 277
    const v7, 0x10ffff

    .line 278
    .line 279
    .line 280
    if-le v6, v7, :cond_10

    .line 281
    .line 282
    add-int/lit8 v6, v5, 0x1

    .line 283
    .line 284
    aput-char v12, v3, v5

    .line 285
    .line 286
    goto :goto_c

    .line 287
    :cond_10
    if-gt v15, v6, :cond_11

    .line 288
    .line 289
    if-ge v6, v14, :cond_11

    .line 290
    .line 291
    add-int/lit8 v6, v5, 0x1

    .line 292
    .line 293
    aput-char v12, v3, v5

    .line 294
    .line 295
    goto :goto_c

    .line 296
    :cond_11
    const/high16 v7, 0x10000

    .line 297
    .line 298
    if-ge v6, v7, :cond_12

    .line 299
    .line 300
    add-int/lit8 v6, v5, 0x1

    .line 301
    .line 302
    aput-char v12, v3, v5

    .line 303
    .line 304
    goto :goto_c

    .line 305
    :cond_12
    if-eq v6, v12, :cond_13

    .line 306
    .line 307
    ushr-int/lit8 v7, v6, 0xa

    .line 308
    .line 309
    const v8, 0xd7c0

    .line 310
    .line 311
    .line 312
    add-int/2addr v7, v8

    .line 313
    int-to-char v7, v7

    .line 314
    add-int/lit8 v8, v5, 0x1

    .line 315
    .line 316
    aput-char v7, v3, v5

    .line 317
    .line 318
    and-int/lit16 v6, v6, 0x3ff

    .line 319
    .line 320
    const v7, 0xdc00

    .line 321
    .line 322
    .line 323
    add-int/2addr v6, v7

    .line 324
    int-to-char v6, v6

    .line 325
    add-int/lit8 v5, v5, 0x2

    .line 326
    .line 327
    aput-char v6, v3, v8

    .line 328
    .line 329
    goto :goto_b

    .line 330
    :cond_13
    add-int/lit8 v6, v5, 0x1

    .line 331
    .line 332
    aput-char v12, v3, v5

    .line 333
    .line 334
    move v5, v6

    .line 335
    :goto_b
    move v6, v5

    .line 336
    :goto_c
    const/4 v8, 0x4

    .line 337
    goto :goto_d

    .line 338
    :cond_14
    add-int/lit8 v6, v5, 0x1

    .line 339
    .line 340
    aput-char v12, v3, v5

    .line 341
    .line 342
    goto :goto_8

    .line 343
    :cond_15
    add-int/lit8 v6, v5, 0x1

    .line 344
    .line 345
    aput-char v12, v3, v5

    .line 346
    .line 347
    goto :goto_9

    .line 348
    :cond_16
    add-int/lit8 v6, v5, 0x1

    .line 349
    .line 350
    aput-char v12, v3, v5

    .line 351
    .line 352
    goto :goto_a

    .line 353
    :goto_d
    add-int/2addr v1, v8

    .line 354
    :goto_e
    move v5, v6

    .line 355
    goto/16 :goto_0

    .line 356
    .line 357
    :cond_17
    add-int/lit8 v6, v5, 0x1

    .line 358
    .line 359
    aput-char v12, v3, v5

    .line 360
    .line 361
    add-int/lit8 v1, v1, 0x1

    .line 362
    .line 363
    goto :goto_e

    .line 364
    :cond_18
    invoke-static {v3, v4, v5}, LBf/r;->Z([CII)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    return-object v0

    .line 369
    :cond_19
    new-instance v3, Ljava/lang/IndexOutOfBoundsException;

    .line 370
    .line 371
    new-instance v4, Ljava/lang/StringBuilder;

    .line 372
    .line 373
    const-string v5, "size="

    .line 374
    .line 375
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    array-length v0, v0

    .line 379
    const-string v5, " beginIndex="

    .line 380
    .line 381
    const-string v6, " endIndex="

    .line 382
    .line 383
    invoke-static {v0, v1, v5, v6, v4}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-direct {v3, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    throw v3
.end method

.method public static final p(LJd/y;)LJd/x;
    .locals 8

    .line 1
    const-string v0, "parameters"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LJd/z;

    .line 7
    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    invoke-direct {v0, v1}, LA7/B0;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, LNd/k;->names()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/Iterable;

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/String;

    .line 34
    .line 35
    invoke-interface {p0, v2}, LNd/k;->i(Ljava/lang/String;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    sget-object v3, Lff/v;->a:Lff/v;

    .line 42
    .line 43
    :cond_0
    const/16 v4, 0xf

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-static {v5, v5, v4, v2}, LJd/b;->d(IIILjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v3, Ljava/lang/Iterable;

    .line 51
    .line 52
    new-instance v4, Ljava/util/ArrayList;

    .line 53
    .line 54
    const/16 v6, 0xa

    .line 55
    .line 56
    invoke-static {v3, v6}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v6, :cond_1

    .line 72
    .line 73
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    check-cast v6, Ljava/lang/String;

    .line 78
    .line 79
    const/16 v7, 0xb

    .line 80
    .line 81
    invoke-static {v5, v5, v7, v6}, LJd/b;->d(IIILjava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-virtual {v0, v2, v4}, LA7/B0;->f(Ljava/lang/String;Ljava/lang/Iterable;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    new-instance p0, LJd/A;

    .line 94
    .line 95
    const-string v1, "values"

    .line 96
    .line 97
    iget-object v0, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Ljava/util/Map;

    .line 100
    .line 101
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-direct {p0, v0}, LNd/l;-><init>(Ljava/util/Map;)V

    .line 105
    .line 106
    .line 107
    return-object p0
.end method

.method public static q(II)I
    .locals 5

    .line 1
    sget-object v0, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_4

    .line 7
    .line 8
    div-int v1, p0, p1

    .line 9
    .line 10
    mul-int v2, p1, v1

    .line 11
    .line 12
    sub-int v2, p0, v2

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    xor-int/2addr p0, p1

    .line 18
    shr-int/lit8 p0, p0, 0x1f

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    or-int/2addr p0, v3

    .line 22
    sget-object v4, Ln8/d;->a:[I

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    aget v0, v4, v0

    .line 29
    .line 30
    packed-switch v0, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    new-instance p0, Ljava/lang/AssertionError;

    .line 34
    .line 35
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 36
    .line 37
    .line 38
    throw p0

    .line 39
    :pswitch_0
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    sub-int/2addr p1, v0

    .line 48
    sub-int/2addr v0, p1

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    sget-object p0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 52
    .line 53
    sget-object p0, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    if-lez v0, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :pswitch_1
    if-lez p0, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_2
    if-gez p0, :cond_2

    .line 63
    .line 64
    :goto_0
    :pswitch_3
    add-int/2addr v1, p0

    .line 65
    :cond_2
    :goto_1
    :pswitch_4
    return v1

    .line 66
    :pswitch_5
    if-nez v2, :cond_3

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    const/4 v3, 0x0

    .line 70
    :goto_2
    invoke-static {v3}, LBa/c;->m(Z)V

    .line 71
    .line 72
    .line 73
    return v1

    .line 74
    :cond_4
    new-instance p0, Ljava/lang/ArithmeticException;

    .line 75
    .line 76
    const-string p1, "/ by zero"

    .line 77
    .line 78
    invoke-direct {p0, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static r(II)I
    .locals 4

    .line 1
    sget-object v0, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    div-int v1, p0, p1

    .line 6
    .line 7
    mul-int v2, p1, v1

    .line 8
    .line 9
    sub-int v2, p0, v2

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    xor-int/2addr p0, p1

    .line 15
    shr-int/lit8 p0, p0, 0x1f

    .line 16
    .line 17
    or-int/lit8 p0, p0, 0x1

    .line 18
    .line 19
    sget-object v3, Lq9/d;->a:[I

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    aget v0, v3, v0

    .line 26
    .line 27
    packed-switch v0, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    new-instance p0, Ljava/lang/AssertionError;

    .line 31
    .line 32
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 33
    .line 34
    .line 35
    throw p0

    .line 36
    :pswitch_0
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    sub-int/2addr p1, v0

    .line 45
    sub-int/2addr v0, p1

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    sget-object p0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 49
    .line 50
    sget-object p0, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    if-lez v0, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_1
    if-gez p0, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :pswitch_2
    if-lez p0, :cond_2

    .line 60
    .line 61
    :goto_0
    :pswitch_3
    add-int/2addr v1, p0

    .line 62
    :cond_2
    :goto_1
    :pswitch_4
    return v1

    .line 63
    :cond_3
    new-instance p0, Ljava/lang/ArithmeticException;

    .line 64
    .line 65
    const-string p1, "/ by zero"

    .line 66
    .line 67
    invoke-direct {p0, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p0

    .line 71
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static varargs s(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/AssertionError;

    .line 2
    .line 3
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string p1, "INTERNAL ASSERTION FAILED: "

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    throw v0
.end method

.method public static final t(Lc0/g;)Lc0/g;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc0/g;->d:Lc0/r;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    if-eq v0, v1, :cond_4

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    if-eq v0, v1, :cond_2

    .line 26
    .line 27
    const/4 p0, 0x5

    .line 28
    if-ne v0, p0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p0, LE5/Q;

    .line 32
    .line 33
    const/16 v0, 0x9

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-direct {p0, v1, v0}, LE5/Q;-><init>(BI)V

    .line 37
    .line 38
    .line 39
    throw p0

    .line 40
    :cond_1
    :goto_0
    return-object v2

    .line 41
    :cond_2
    iget-object p0, p0, Lc0/g;->e:Lc0/g;

    .line 42
    .line 43
    if-eqz p0, :cond_3

    .line 44
    .line 45
    invoke-static {p0}, LA6/c;->t(Lc0/g;)Lc0/g;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_3
    return-object v2

    .line 51
    :cond_4
    return-object p0
.end method

.method public static final u(Lc0/g;)Lc0/g;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc0/g;->b:Lc0/g;

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget-object v1, p0, Lc0/g;->d:Lc0/r;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    if-eq v1, v2, :cond_1

    .line 20
    .line 21
    const/4 p0, 0x2

    .line 22
    if-eq v1, p0, :cond_2

    .line 23
    .line 24
    const/4 p0, 0x3

    .line 25
    if-eq v1, p0, :cond_2

    .line 26
    .line 27
    const/4 p0, 0x4

    .line 28
    if-eq v1, p0, :cond_2

    .line 29
    .line 30
    const/4 p0, 0x5

    .line 31
    if-ne v1, p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p0, LE5/Q;

    .line 35
    .line 36
    const/16 v0, 0x9

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-direct {p0, v1, v0}, LE5/Q;-><init>(BI)V

    .line 40
    .line 41
    .line 42
    throw p0

    .line 43
    :cond_1
    return-object p0

    .line 44
    :cond_2
    :goto_0
    invoke-static {v0}, LA6/c;->u(Lc0/g;)Lc0/g;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_3
    const/4 p0, 0x0

    .line 50
    return-object p0
.end method

.method public static final v(Lc0/g;)Ld0/d;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lc0/g;->k:Lt0/y;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-static {p0}, LFe/g;->z(Lr0/k;)Lr0/k;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    check-cast v0, Lt0/y;

    .line 16
    .line 17
    invoke-virtual {v0, p0, v1}, Lt0/y;->U(Lr0/k;Z)Ld0/d;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Ld0/d;->e:Ld0/d;

    .line 23
    .line 24
    return-object p0
.end method

.method public static final w(Lp0/t;Ltf/p;Llf/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, LC/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LC/c;

    .line 7
    .line 8
    iget v1, v0, LC/c;->e:I

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
    iput v1, v0, LC/c;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LC/c;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LC/c;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LC/c;->e:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    sget-object v4, Lef/C;->a:Lef/C;

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x3

    .line 36
    const/4 v7, 0x1

    .line 37
    if-eqz v2, :cond_5

    .line 38
    .line 39
    if-eq v2, v7, :cond_4

    .line 40
    .line 41
    if-eq v2, v5, :cond_2

    .line 42
    .line 43
    if-ne v2, v6, :cond_1

    .line 44
    .line 45
    iget-object p0, v0, LC/c;->c:Ljf/h;

    .line 46
    .line 47
    iget-object p1, v0, LC/c;->b:Ltf/p;

    .line 48
    .line 49
    iget-object v2, v0, LC/c;->a:Lp0/t;

    .line 50
    .line 51
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0

    .line 63
    :cond_2
    iget-object p0, v0, LC/c;->c:Ljf/h;

    .line 64
    .line 65
    iget-object p1, v0, LC/c;->b:Ltf/p;

    .line 66
    .line 67
    iget-object v2, v0, LC/c;->a:Lp0/t;

    .line 68
    .line 69
    :try_start_0
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_1
    move-object p2, p0

    .line 73
    move-object p0, v2

    .line 74
    goto :goto_2

    .line 75
    :catch_0
    move-exception p2

    .line 76
    goto :goto_5

    .line 77
    :cond_4
    iget-object p0, v0, LC/c;->c:Ljf/h;

    .line 78
    .line 79
    iget-object p1, v0, LC/c;->b:Ltf/p;

    .line 80
    .line 81
    iget-object v2, v0, LC/c;->a:Lp0/t;

    .line 82
    .line 83
    :try_start_1
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_5
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v0}, Ljf/c;->getContext()Ljf/h;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    :goto_2
    invoke-static {p2}, LEf/H;->z(Ljf/h;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_a

    .line 99
    .line 100
    :try_start_2
    iput-object p0, v0, LC/c;->a:Lp0/t;

    .line 101
    .line 102
    iput-object p1, v0, LC/c;->b:Ltf/p;

    .line 103
    .line 104
    iput-object p2, v0, LC/c;->c:Ljf/h;

    .line 105
    .line 106
    iput v7, v0, LC/c;->e:I

    .line 107
    .line 108
    invoke-interface {p1, p0, v0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1

    .line 112
    if-ne v2, v1, :cond_6

    .line 113
    .line 114
    goto :goto_7

    .line 115
    :cond_6
    move-object v2, p0

    .line 116
    move-object p0, p2

    .line 117
    :goto_3
    :try_start_3
    iput-object v2, v0, LC/c;->a:Lp0/t;

    .line 118
    .line 119
    iput-object p1, v0, LC/c;->b:Ltf/p;

    .line 120
    .line 121
    iput-object p0, v0, LC/c;->c:Ljf/h;

    .line 122
    .line 123
    iput v5, v0, LC/c;->e:I

    .line 124
    .line 125
    new-instance p2, LC/a;

    .line 126
    .line 127
    invoke-direct {p2, v5, v3}, Llf/i;-><init>(ILjf/c;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, p2, v0}, Lp0/t;->A(Ltf/p;Llf/c;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    sget-object v8, Lkf/a;->a:Lkf/a;
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    .line 135
    .line 136
    if-ne p2, v8, :cond_7

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_7
    move-object p2, v4

    .line 140
    :goto_4
    if-ne p2, v1, :cond_3

    .line 141
    .line 142
    goto :goto_7

    .line 143
    :catch_1
    move-exception v2

    .line 144
    move-object v9, v2

    .line 145
    move-object v2, p0

    .line 146
    move-object p0, p2

    .line 147
    move-object p2, v9

    .line 148
    :goto_5
    invoke-static {p0}, LEf/H;->z(Ljf/h;)Z

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    if-eqz v8, :cond_9

    .line 153
    .line 154
    iput-object v2, v0, LC/c;->a:Lp0/t;

    .line 155
    .line 156
    iput-object p1, v0, LC/c;->b:Ltf/p;

    .line 157
    .line 158
    iput-object p0, v0, LC/c;->c:Ljf/h;

    .line 159
    .line 160
    iput v6, v0, LC/c;->e:I

    .line 161
    .line 162
    new-instance p2, LC/a;

    .line 163
    .line 164
    invoke-direct {p2, v5, v3}, Llf/i;-><init>(ILjf/c;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, p2, v0}, Lp0/t;->A(Ltf/p;Llf/c;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    sget-object v8, Lkf/a;->a:Lkf/a;

    .line 172
    .line 173
    if-ne p2, v8, :cond_8

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_8
    move-object p2, v4

    .line 177
    :goto_6
    if-ne p2, v1, :cond_3

    .line 178
    .line 179
    :goto_7
    return-object v1

    .line 180
    :cond_9
    throw p2

    .line 181
    :cond_a
    return-object v4
.end method

.method public static y(I)LS1/k;
    .locals 11

    .line 1
    new-instance v0, LS1/k;

    .line 2
    .line 3
    sget v1, LQ1/x;->a:I

    .line 4
    .line 5
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "rtp://0.0.0.0:"

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sget-object v4, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 26
    .line 27
    const-wide/16 v5, 0x0

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v2, 0x1

    .line 31
    const/4 v3, 0x0

    .line 32
    const-wide/16 v7, -0x1

    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    invoke-direct/range {v0 .. v10}, LS1/k;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public static varargs z(ZLjava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p1, p2}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    throw p0
.end method


# virtual methods
.method public abstract E()Z
.end method

.method public abstract K(Z)V
.end method

.method public abstract L(Z)V
.end method

.method public abstract O(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;
.end method

.method public abstract x([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
.end method
