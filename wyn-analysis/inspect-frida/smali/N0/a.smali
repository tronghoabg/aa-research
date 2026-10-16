.class public abstract synthetic LN0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static A(Luc/f;LQc/c;)V
    .locals 4

    .line 1
    new-instance v0, LVa/X7;

    .line 2
    .line 3
    new-instance v1, Luc/w;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    new-instance v1, LQc/d;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v1, p1, v2}, LQc/d;-><init>(LQc/c;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, LVa/X7;->n(Luc/b;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    new-instance v0, LVa/X7;

    .line 30
    .line 31
    new-instance v1, Luc/w;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v2, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled"

    .line 37
    .line 38
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    new-instance v1, LQc/d;

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    invoke-direct {v1, p1, v2}, LQc/d;-><init>(LQc/c;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, LVa/X7;->n(Luc/b;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    new-instance v0, LVa/X7;

    .line 57
    .line 58
    new-instance v1, Luc/w;

    .line 59
    .line 60
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string v2, "dev.flutter.pigeon.FirebaseAppHostApi.delete"

    .line 64
    .line 65
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    new-instance p0, LQc/d;

    .line 71
    .line 72
    const/4 v1, 0x2

    .line 73
    invoke-direct {p0, p1, v1}, LQc/d;-><init>(LQc/c;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p0}, LVa/X7;->n(Luc/b;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_2
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public static B(Luc/f;LQc/c;)V
    .locals 5

    .line 1
    new-instance v0, LVa/X7;

    .line 2
    .line 3
    sget-object v1, LQc/e;->d:LQc/e;

    .line 4
    .line 5
    const-string v2, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v2, LQc/d;

    .line 14
    .line 15
    const/4 v4, 0x3

    .line 16
    invoke-direct {v2, p1, v4}, LQc/d;-><init>(LQc/c;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    new-instance v0, LVa/X7;

    .line 27
    .line 28
    const-string v2, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore"

    .line 29
    .line 30
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    new-instance v2, LQc/d;

    .line 36
    .line 37
    const/4 v4, 0x4

    .line 38
    invoke-direct {v2, p1, v4}, LQc/d;-><init>(LQc/c;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    new-instance v0, LVa/X7;

    .line 49
    .line 50
    const-string v2, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource"

    .line 51
    .line 52
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    new-instance p0, LQc/d;

    .line 58
    .line 59
    const/4 v1, 0x5

    .line 60
    invoke-direct {p0, p1, v1}, LQc/d;-><init>(LQc/c;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p0}, LVa/X7;->n(Luc/b;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public static a(LP2/l;[BI)LP2/b;
    .locals 7

    .line 1
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v5, LP2/k;->c:LP2/k;

    .line 6
    .line 7
    new-instance v6, LB8/b;

    .line 8
    .line 9
    const/16 v1, 0x1b

    .line 10
    .line 11
    invoke-direct {v6, v0, v1}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    move-object v1, p0

    .line 16
    move-object v2, p1

    .line 17
    move v4, p2

    .line 18
    invoke-interface/range {v1 .. v6}, LP2/l;->E([BIILP2/k;LQ1/c;)V

    .line 19
    .line 20
    .line 21
    new-instance p0, LP2/b;

    .line 22
    .line 23
    invoke-virtual {v0}, Ll8/H;->g()Ll8/e0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {p0, p1}, LP2/b;-><init>(Ll8/e0;)V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public static b(FFFF)F
    .locals 0

    .line 1
    sub-float/2addr p0, p1

    mul-float/2addr p0, p2

    add-float/2addr p0, p3

    return p0
.end method

.method public static c(IILjava/lang/String;)I
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    add-int/2addr p2, p0

    .line 6
    mul-int/2addr p2, p1

    .line 7
    return p2
.end method

.method public static d(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static i(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static j(Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static k(IIIII)V
    .locals 0

    .line 1
    invoke-static {p0}, LQ1/x;->E(I)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LQ1/x;->E(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, LQ1/x;->E(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p3}, LQ1/x;->E(I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p4}, LQ1/x;->E(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static l(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static m(ILandroid/text/SpannableStringBuilder;III)V
    .locals 1

    .line 1
    new-instance v0, Landroid/text/style/StyleSpan;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0, p2, p3, p4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic n(ILjava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    throw p0
.end method

.method public static o(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p2, p0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static p(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p1, p4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p2, p0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static s(Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic t(I)Ljava/lang/String;
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    throw p0

    :pswitch_0
    const-string p0, "CENTER_Y"

    return-object p0

    :pswitch_1
    const-string p0, "CENTER_X"

    return-object p0

    :pswitch_2
    const-string p0, "CENTER"

    return-object p0

    :pswitch_3
    const-string p0, "BASELINE"

    return-object p0

    :pswitch_4
    const-string p0, "BOTTOM"

    return-object p0

    :pswitch_5
    const-string p0, "RIGHT"

    return-object p0

    :pswitch_6
    const-string p0, "TOP"

    return-object p0

    :pswitch_7
    const-string p0, "LEFT"

    return-object p0

    :pswitch_8
    const-string p0, "NONE"

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
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

.method public static u(Luc/f;LPc/d;)V
    .locals 5

    .line 1
    new-instance v0, LVa/X7;

    .line 2
    .line 3
    sget-object v1, LPc/r;->e:LPc/r;

    .line 4
    .line 5
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.registerIdTokenListener"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v2, LPc/n;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    new-instance v0, LVa/X7;

    .line 27
    .line 28
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.registerAuthStateListener"

    .line 29
    .line 30
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    new-instance v2, LPc/n;

    .line 36
    .line 37
    const/4 v4, 0x2

    .line 38
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    new-instance v0, LVa/X7;

    .line 49
    .line 50
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.useEmulator"

    .line 51
    .line 52
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    new-instance v2, LPc/n;

    .line 58
    .line 59
    const/4 v4, 0x5

    .line 60
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 68
    .line 69
    .line 70
    :goto_2
    new-instance v0, LVa/X7;

    .line 71
    .line 72
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.applyActionCode"

    .line 73
    .line 74
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    new-instance v2, LPc/n;

    .line 80
    .line 81
    const/4 v4, 0x6

    .line 82
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 90
    .line 91
    .line 92
    :goto_3
    new-instance v0, LVa/X7;

    .line 93
    .line 94
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.checkActionCode"

    .line 95
    .line 96
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    if-eqz p1, :cond_4

    .line 100
    .line 101
    new-instance v2, LPc/n;

    .line 102
    .line 103
    const/4 v4, 0x7

    .line 104
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 108
    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_4
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 112
    .line 113
    .line 114
    :goto_4
    new-instance v0, LVa/X7;

    .line 115
    .line 116
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.confirmPasswordReset"

    .line 117
    .line 118
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    if-eqz p1, :cond_5

    .line 122
    .line 123
    new-instance v2, LPc/n;

    .line 124
    .line 125
    const/16 v4, 0x8

    .line 126
    .line 127
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 131
    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_5
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 135
    .line 136
    .line 137
    :goto_5
    new-instance v0, LVa/X7;

    .line 138
    .line 139
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.createUserWithEmailAndPassword"

    .line 140
    .line 141
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    if-eqz p1, :cond_6

    .line 145
    .line 146
    new-instance v2, LPc/n;

    .line 147
    .line 148
    const/16 v4, 0x9

    .line 149
    .line 150
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 154
    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_6
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 158
    .line 159
    .line 160
    :goto_6
    new-instance v0, LVa/X7;

    .line 161
    .line 162
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInAnonymously"

    .line 163
    .line 164
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    if-eqz p1, :cond_7

    .line 168
    .line 169
    new-instance v2, LPc/n;

    .line 170
    .line 171
    const/16 v4, 0xa

    .line 172
    .line 173
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 177
    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_7
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 181
    .line 182
    .line 183
    :goto_7
    new-instance v0, LVa/X7;

    .line 184
    .line 185
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithCredential"

    .line 186
    .line 187
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    if-eqz p1, :cond_8

    .line 191
    .line 192
    new-instance v2, LPc/n;

    .line 193
    .line 194
    const/16 v4, 0xc

    .line 195
    .line 196
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 200
    .line 201
    .line 202
    goto :goto_8

    .line 203
    :cond_8
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 204
    .line 205
    .line 206
    :goto_8
    new-instance v0, LVa/X7;

    .line 207
    .line 208
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithCustomToken"

    .line 209
    .line 210
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    if-eqz p1, :cond_9

    .line 214
    .line 215
    new-instance v2, LPc/n;

    .line 216
    .line 217
    const/16 v4, 0xd

    .line 218
    .line 219
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 223
    .line 224
    .line 225
    goto :goto_9

    .line 226
    :cond_9
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 227
    .line 228
    .line 229
    :goto_9
    new-instance v0, LVa/X7;

    .line 230
    .line 231
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithEmailAndPassword"

    .line 232
    .line 233
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    if-eqz p1, :cond_a

    .line 237
    .line 238
    new-instance v2, LPc/n;

    .line 239
    .line 240
    const/16 v4, 0xb

    .line 241
    .line 242
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 246
    .line 247
    .line 248
    goto :goto_a

    .line 249
    :cond_a
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 250
    .line 251
    .line 252
    :goto_a
    new-instance v0, LVa/X7;

    .line 253
    .line 254
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithEmailLink"

    .line 255
    .line 256
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    if-eqz p1, :cond_b

    .line 260
    .line 261
    new-instance v2, LPc/n;

    .line 262
    .line 263
    const/16 v4, 0xe

    .line 264
    .line 265
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 269
    .line 270
    .line 271
    goto :goto_b

    .line 272
    :cond_b
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 273
    .line 274
    .line 275
    :goto_b
    new-instance v0, LVa/X7;

    .line 276
    .line 277
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithProvider"

    .line 278
    .line 279
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    if-eqz p1, :cond_c

    .line 283
    .line 284
    new-instance v2, LPc/n;

    .line 285
    .line 286
    const/16 v4, 0xf

    .line 287
    .line 288
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 292
    .line 293
    .line 294
    goto :goto_c

    .line 295
    :cond_c
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 296
    .line 297
    .line 298
    :goto_c
    new-instance v0, LVa/X7;

    .line 299
    .line 300
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signOut"

    .line 301
    .line 302
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    if-eqz p1, :cond_d

    .line 306
    .line 307
    new-instance v2, LPc/n;

    .line 308
    .line 309
    const/16 v4, 0x10

    .line 310
    .line 311
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 315
    .line 316
    .line 317
    goto :goto_d

    .line 318
    :cond_d
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 319
    .line 320
    .line 321
    :goto_d
    new-instance v0, LVa/X7;

    .line 322
    .line 323
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.fetchSignInMethodsForEmail"

    .line 324
    .line 325
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    if-eqz p1, :cond_e

    .line 329
    .line 330
    new-instance v2, LPc/n;

    .line 331
    .line 332
    const/16 v4, 0x11

    .line 333
    .line 334
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 338
    .line 339
    .line 340
    goto :goto_e

    .line 341
    :cond_e
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 342
    .line 343
    .line 344
    :goto_e
    new-instance v0, LVa/X7;

    .line 345
    .line 346
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.sendPasswordResetEmail"

    .line 347
    .line 348
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    if-eqz p1, :cond_f

    .line 352
    .line 353
    new-instance v2, LPc/n;

    .line 354
    .line 355
    const/16 v4, 0x12

    .line 356
    .line 357
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 361
    .line 362
    .line 363
    goto :goto_f

    .line 364
    :cond_f
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 365
    .line 366
    .line 367
    :goto_f
    new-instance v0, LVa/X7;

    .line 368
    .line 369
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.sendSignInLinkToEmail"

    .line 370
    .line 371
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    if-eqz p1, :cond_10

    .line 375
    .line 376
    new-instance v2, LPc/n;

    .line 377
    .line 378
    const/16 v4, 0x13

    .line 379
    .line 380
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 384
    .line 385
    .line 386
    goto :goto_10

    .line 387
    :cond_10
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 388
    .line 389
    .line 390
    :goto_10
    new-instance v0, LVa/X7;

    .line 391
    .line 392
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.setLanguageCode"

    .line 393
    .line 394
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    if-eqz p1, :cond_11

    .line 398
    .line 399
    new-instance v2, LPc/n;

    .line 400
    .line 401
    const/16 v4, 0x14

    .line 402
    .line 403
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 407
    .line 408
    .line 409
    goto :goto_11

    .line 410
    :cond_11
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 411
    .line 412
    .line 413
    :goto_11
    new-instance v0, LVa/X7;

    .line 414
    .line 415
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.setSettings"

    .line 416
    .line 417
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    if-eqz p1, :cond_12

    .line 421
    .line 422
    new-instance v2, LPc/n;

    .line 423
    .line 424
    const/16 v4, 0x15

    .line 425
    .line 426
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 430
    .line 431
    .line 432
    goto :goto_12

    .line 433
    :cond_12
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 434
    .line 435
    .line 436
    :goto_12
    new-instance v0, LVa/X7;

    .line 437
    .line 438
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.verifyPasswordResetCode"

    .line 439
    .line 440
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    if-eqz p1, :cond_13

    .line 444
    .line 445
    new-instance v2, LPc/n;

    .line 446
    .line 447
    const/4 v4, 0x1

    .line 448
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 452
    .line 453
    .line 454
    goto :goto_13

    .line 455
    :cond_13
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 456
    .line 457
    .line 458
    :goto_13
    new-instance v0, LVa/X7;

    .line 459
    .line 460
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.verifyPhoneNumber"

    .line 461
    .line 462
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    if-eqz p1, :cond_14

    .line 466
    .line 467
    new-instance v2, LPc/n;

    .line 468
    .line 469
    const/4 v4, 0x3

    .line 470
    invoke-direct {v2, p1, v4}, LPc/n;-><init>(LPc/d;I)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 474
    .line 475
    .line 476
    goto :goto_14

    .line 477
    :cond_14
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 478
    .line 479
    .line 480
    :goto_14
    new-instance v0, LVa/X7;

    .line 481
    .line 482
    sget-object v2, LPc/r;->e:LPc/r;

    .line 483
    .line 484
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.revokeTokenWithAuthorizationCode"

    .line 485
    .line 486
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    if-eqz p1, :cond_15

    .line 490
    .line 491
    new-instance p0, LPc/n;

    .line 492
    .line 493
    const/4 v1, 0x4

    .line 494
    invoke-direct {p0, p1, v1}, LPc/n;-><init>(LPc/d;I)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v0, p0}, LVa/X7;->n(Luc/b;)V

    .line 498
    .line 499
    .line 500
    return-void

    .line 501
    :cond_15
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 502
    .line 503
    .line 504
    return-void
.end method

.method public static v(Luc/f;LPc/u;)V
    .locals 4

    .line 1
    new-instance v0, LVa/X7;

    .line 2
    .line 3
    sget-object v1, LPc/r;->g:LPc/r;

    .line 4
    .line 5
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactoResolverHostApi.resolveSignIn"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance p0, LPc/b;

    .line 14
    .line 15
    const/16 v1, 0x17

    .line 16
    .line 17
    invoke-direct {p0, p1, v1}, LPc/b;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, LVa/X7;->n(Luc/b;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static w(Luc/f;LPc/w;)V
    .locals 5

    .line 1
    new-instance v0, LVa/X7;

    .line 2
    .line 3
    sget-object v1, LPc/r;->h:LPc/r;

    .line 4
    .line 5
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.generateSecret"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v2, LPc/v;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-direct {v2, p1, v4}, LPc/v;-><init>(LPc/w;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    new-instance v0, LVa/X7;

    .line 27
    .line 28
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForEnrollment"

    .line 29
    .line 30
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    new-instance v2, LPc/v;

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    invoke-direct {v2, p1, v4}, LPc/v;-><init>(LPc/w;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    new-instance v0, LVa/X7;

    .line 49
    .line 50
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForSignIn"

    .line 51
    .line 52
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    new-instance p0, LPc/v;

    .line 58
    .line 59
    const/4 v1, 0x2

    .line 60
    invoke-direct {p0, p1, v1}, LPc/v;-><init>(LPc/w;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p0}, LVa/X7;->n(Luc/b;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public static x(Luc/f;LPc/z;)V
    .locals 5

    .line 1
    new-instance v0, LVa/X7;

    .line 2
    .line 3
    sget-object v1, LPc/r;->i:LPc/r;

    .line 4
    .line 5
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollPhone"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v2, LPc/y;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-direct {v2, p1, v4}, LPc/y;-><init>(LPc/z;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    new-instance v0, LVa/X7;

    .line 27
    .line 28
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollTotp"

    .line 29
    .line 30
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    new-instance v2, LPc/y;

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    invoke-direct {v2, p1, v4}, LPc/y;-><init>(LPc/z;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    new-instance v0, LVa/X7;

    .line 49
    .line 50
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getSession"

    .line 51
    .line 52
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    new-instance v2, LPc/y;

    .line 58
    .line 59
    const/4 v4, 0x2

    .line 60
    invoke-direct {v2, p1, v4}, LPc/y;-><init>(LPc/z;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 68
    .line 69
    .line 70
    :goto_2
    new-instance v0, LVa/X7;

    .line 71
    .line 72
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.unenroll"

    .line 73
    .line 74
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    new-instance v2, LPc/y;

    .line 80
    .line 81
    const/4 v4, 0x3

    .line 82
    invoke-direct {v2, p1, v4}, LPc/y;-><init>(LPc/z;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 90
    .line 91
    .line 92
    :goto_3
    new-instance v0, LVa/X7;

    .line 93
    .line 94
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getEnrolledFactors"

    .line 95
    .line 96
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    if-eqz p1, :cond_4

    .line 100
    .line 101
    new-instance p0, LPc/y;

    .line 102
    .line 103
    const/4 v1, 0x4

    .line 104
    invoke-direct {p0, p1, v1}, LPc/y;-><init>(LPc/z;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p0}, LVa/X7;->n(Luc/b;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_4
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public static y(Luc/f;Lc8/e;)V
    .locals 4

    .line 1
    new-instance v0, LVa/X7;

    .line 2
    .line 3
    new-instance v1, Luc/w;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.generateQrCodeUrl"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    new-instance v1, LPc/x;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v1, p1, v2}, LPc/x;-><init>(Lc8/e;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, LVa/X7;->n(Luc/b;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    new-instance v0, LVa/X7;

    .line 30
    .line 31
    new-instance v1, Luc/w;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.openInOtpApp"

    .line 37
    .line 38
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    new-instance p0, LPc/x;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {p0, p1, v1}, LPc/x;-><init>(Lc8/e;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p0}, LVa/X7;->n(Luc/b;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public static z(Luc/f;Lxa/d;)V
    .locals 5

    .line 1
    new-instance v0, LVa/X7;

    .line 2
    .line 3
    sget-object v1, LPc/r;->f:LPc/r;

    .line 4
    .line 5
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.delete"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v2, LPc/s;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-direct {v2, p1, v4}, LPc/s;-><init>(Lxa/d;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    new-instance v0, LVa/X7;

    .line 27
    .line 28
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.getIdToken"

    .line 29
    .line 30
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    new-instance v2, LPc/s;

    .line 36
    .line 37
    const/16 v4, 0x9

    .line 38
    .line 39
    invoke-direct {v2, p1, v4}, LPc/s;-><init>(Lxa/d;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    new-instance v0, LVa/X7;

    .line 50
    .line 51
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.linkWithCredential"

    .line 52
    .line 53
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    new-instance v2, LPc/s;

    .line 59
    .line 60
    const/16 v4, 0xa

    .line 61
    .line 62
    invoke-direct {v2, p1, v4}, LPc/s;-><init>(Lxa/d;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 70
    .line 71
    .line 72
    :goto_2
    new-instance v0, LVa/X7;

    .line 73
    .line 74
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.linkWithProvider"

    .line 75
    .line 76
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    if-eqz p1, :cond_3

    .line 80
    .line 81
    new-instance v2, LPc/s;

    .line 82
    .line 83
    const/16 v4, 0xb

    .line 84
    .line 85
    invoke-direct {v2, p1, v4}, LPc/s;-><init>(Lxa/d;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_3
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 93
    .line 94
    .line 95
    :goto_3
    new-instance v0, LVa/X7;

    .line 96
    .line 97
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reauthenticateWithCredential"

    .line 98
    .line 99
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    if-eqz p1, :cond_4

    .line 103
    .line 104
    new-instance v2, LPc/s;

    .line 105
    .line 106
    const/16 v4, 0xc

    .line 107
    .line 108
    invoke-direct {v2, p1, v4}, LPc/s;-><init>(Lxa/d;I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_4
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 116
    .line 117
    .line 118
    :goto_4
    new-instance v0, LVa/X7;

    .line 119
    .line 120
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reauthenticateWithProvider"

    .line 121
    .line 122
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    if-eqz p1, :cond_5

    .line 126
    .line 127
    new-instance v2, LPc/s;

    .line 128
    .line 129
    const/16 v4, 0xd

    .line 130
    .line 131
    invoke-direct {v2, p1, v4}, LPc/s;-><init>(Lxa/d;I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 135
    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_5
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 139
    .line 140
    .line 141
    :goto_5
    new-instance v0, LVa/X7;

    .line 142
    .line 143
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reload"

    .line 144
    .line 145
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    if-eqz p1, :cond_6

    .line 149
    .line 150
    new-instance v2, LPc/s;

    .line 151
    .line 152
    const/4 v4, 0x1

    .line 153
    invoke-direct {v2, p1, v4}, LPc/s;-><init>(Lxa/d;I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 157
    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_6
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 161
    .line 162
    .line 163
    :goto_6
    new-instance v0, LVa/X7;

    .line 164
    .line 165
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.sendEmailVerification"

    .line 166
    .line 167
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    if-eqz p1, :cond_7

    .line 171
    .line 172
    new-instance v2, LPc/s;

    .line 173
    .line 174
    const/4 v4, 0x2

    .line 175
    invoke-direct {v2, p1, v4}, LPc/s;-><init>(Lxa/d;I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 179
    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_7
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 183
    .line 184
    .line 185
    :goto_7
    new-instance v0, LVa/X7;

    .line 186
    .line 187
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.unlink"

    .line 188
    .line 189
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    if-eqz p1, :cond_8

    .line 193
    .line 194
    new-instance v2, LPc/s;

    .line 195
    .line 196
    const/4 v4, 0x3

    .line 197
    invoke-direct {v2, p1, v4}, LPc/s;-><init>(Lxa/d;I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 201
    .line 202
    .line 203
    goto :goto_8

    .line 204
    :cond_8
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 205
    .line 206
    .line 207
    :goto_8
    new-instance v0, LVa/X7;

    .line 208
    .line 209
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updateEmail"

    .line 210
    .line 211
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    if-eqz p1, :cond_9

    .line 215
    .line 216
    new-instance v2, LPc/s;

    .line 217
    .line 218
    const/4 v4, 0x4

    .line 219
    invoke-direct {v2, p1, v4}, LPc/s;-><init>(Lxa/d;I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 223
    .line 224
    .line 225
    goto :goto_9

    .line 226
    :cond_9
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 227
    .line 228
    .line 229
    :goto_9
    new-instance v0, LVa/X7;

    .line 230
    .line 231
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updatePassword"

    .line 232
    .line 233
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    if-eqz p1, :cond_a

    .line 237
    .line 238
    new-instance v2, LPc/s;

    .line 239
    .line 240
    const/4 v4, 0x5

    .line 241
    invoke-direct {v2, p1, v4}, LPc/s;-><init>(Lxa/d;I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 245
    .line 246
    .line 247
    goto :goto_a

    .line 248
    :cond_a
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 249
    .line 250
    .line 251
    :goto_a
    new-instance v0, LVa/X7;

    .line 252
    .line 253
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updatePhoneNumber"

    .line 254
    .line 255
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    if-eqz p1, :cond_b

    .line 259
    .line 260
    new-instance v2, LPc/s;

    .line 261
    .line 262
    const/4 v4, 0x6

    .line 263
    invoke-direct {v2, p1, v4}, LPc/s;-><init>(Lxa/d;I)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 267
    .line 268
    .line 269
    goto :goto_b

    .line 270
    :cond_b
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 271
    .line 272
    .line 273
    :goto_b
    new-instance v0, LVa/X7;

    .line 274
    .line 275
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updateProfile"

    .line 276
    .line 277
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    if-eqz p1, :cond_c

    .line 281
    .line 282
    new-instance v2, LPc/s;

    .line 283
    .line 284
    const/4 v4, 0x7

    .line 285
    invoke-direct {v2, p1, v4}, LPc/s;-><init>(Lxa/d;I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 289
    .line 290
    .line 291
    goto :goto_c

    .line 292
    :cond_c
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 293
    .line 294
    .line 295
    :goto_c
    new-instance v0, LVa/X7;

    .line 296
    .line 297
    const-string v2, "dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.verifyBeforeUpdateEmail"

    .line 298
    .line 299
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    if-eqz p1, :cond_d

    .line 303
    .line 304
    new-instance p0, LPc/s;

    .line 305
    .line 306
    const/16 v1, 0x8

    .line 307
    .line 308
    invoke-direct {p0, p1, v1}, LPc/s;-><init>(Lxa/d;I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0, p0}, LVa/X7;->n(Luc/b;)V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :cond_d
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 316
    .line 317
    .line 318
    return-void
.end method
