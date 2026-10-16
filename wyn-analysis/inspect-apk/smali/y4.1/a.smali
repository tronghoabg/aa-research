.class public final Ly4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/v;


# static fields
.field public static d:Ly4/a;


# instance fields
.field public a:Landroid/app/Activity;

.field public b:LKa/b;

.field public c:LKa/b;


# direct methods
.method public static a(Landroid/content/Context;)I
    .locals 2

    .line 1
    invoke-static {p0}, Ly4/a;->b(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p0, v1}, LY0/e;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 28
    .line 29
    const/16 v1, 0x1d

    .line 30
    .line 31
    if-ge v0, v1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-string v0, "android.permission.ACCESS_BACKGROUND_LOCATION"

    .line 35
    .line 36
    invoke-static {p0, v0}, LA6/c;->C(Landroid/content/Context;Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-static {p0, v0}, LY0/e;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_3

    .line 48
    .line 49
    :goto_0
    const/4 p0, 0x4

    .line 50
    return p0

    .line 51
    :cond_3
    :goto_1
    const/4 p0, 0x3

    .line 52
    return p0

    .line 53
    :cond_4
    const/4 p0, 0x1

    .line 54
    return p0
.end method

.method public static b(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    .line 2
    .line 3
    invoke-static {p0, v0}, LA6/c;->C(Landroid/content/Context;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    .line 8
    .line 9
    invoke-static {p0, v2}, LA6/c;->C(Landroid/content/Context;Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p0, Lw4/b;

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p0

    .line 24
    :cond_1
    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_2
    if-eqz p0, :cond_3

    .line 35
    .line 36
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_3
    return-object v3
.end method


# virtual methods
.method public final c(Landroid/app/Activity;LKa/b;LKa/b;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p3, p1}, LKa/b;->onError(I)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    invoke-static {p1}, Ly4/a;->b(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/16 v2, 0x1d

    .line 15
    .line 16
    if-lt v0, v2, :cond_1

    .line 17
    .line 18
    const-string v0, "android.permission.ACCESS_BACKGROUND_LOCATION"

    .line 19
    .line 20
    invoke-static {p1, v0}, LA6/c;->C(Landroid/content/Context;Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-static {p1}, Ly4/a;->a(Landroid/content/Context;)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x3

    .line 31
    if-ne v2, v3, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_1
    iput-object p3, p0, Ly4/a;->b:LKa/b;

    .line 37
    .line 38
    iput-object p2, p0, Ly4/a;->c:LKa/b;

    .line 39
    .line 40
    iput-object p1, p0, Ly4/a;->a:Landroid/app/Activity;

    .line 41
    .line 42
    const/4 p2, 0x0

    .line 43
    new-array p2, p2, [Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    check-cast p2, [Ljava/lang/String;

    .line 50
    .line 51
    const/16 p3, 0x6d

    .line 52
    .line 53
    invoke-static {p1, p2, p3}, LX0/b;->a(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 9

    .line 1
    const/16 v0, 0x6d

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_3

    .line 7
    .line 8
    :cond_0
    iget-object p1, p0, Ly4/a;->a:Landroid/app/Activity;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    const-string v2, "Geolocator"

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    const-string p1, "Trying to process permission result without an valid Activity instance"

    .line 16
    .line 17
    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Ly4/a;->b:LKa/b;

    .line 21
    .line 22
    if-eqz p1, :cond_11

    .line 23
    .line 24
    invoke-virtual {p1, v0}, LKa/b;->onError(I)V

    .line 25
    .line 26
    .line 27
    return v1

    .line 28
    :cond_1
    const/4 v3, 0x4

    .line 29
    :try_start_0
    invoke-static {p1}, Ly4/a;->b(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catch Lw4/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    array-length v4, p3

    .line 34
    if-nez v4, :cond_2

    .line 35
    .line 36
    const-string p1, "The grantResults array is empty. This can happen when the user cancels the permission request"

    .line 37
    .line 38
    invoke-static {v2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    return v1

    .line 42
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const/4 v4, -0x1

    .line 47
    move v5, v1

    .line 48
    move v6, v5

    .line 49
    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_6

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-interface {v8, v7}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-ltz v8, :cond_4

    .line 70
    .line 71
    move v5, v0

    .line 72
    :cond_4
    aget v8, p3, v8

    .line 73
    .line 74
    if-nez v8, :cond_5

    .line 75
    .line 76
    move v4, v1

    .line 77
    :cond_5
    iget-object v8, p0, Ly4/a;->a:Landroid/app/Activity;

    .line 78
    .line 79
    invoke-static {v8, v7}, LX0/b;->b(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-eqz v7, :cond_3

    .line 84
    .line 85
    move v6, v0

    .line 86
    goto :goto_0

    .line 87
    :cond_6
    if-nez v5, :cond_7

    .line 88
    .line 89
    const-string p1, "Location permissions not part of permissions send to onRequestPermissionsResult method."

    .line 90
    .line 91
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    return v1

    .line 95
    :cond_7
    const/4 p1, 0x2

    .line 96
    const/4 v2, 0x3

    .line 97
    if-nez v4, :cond_9

    .line 98
    .line 99
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 100
    .line 101
    const/16 v5, 0x1d

    .line 102
    .line 103
    if-lt v4, v5, :cond_b

    .line 104
    .line 105
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    const-string v4, "android.permission.ACCESS_BACKGROUND_LOCATION"

    .line 110
    .line 111
    invoke-interface {p2, v4}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    if-ltz p2, :cond_8

    .line 116
    .line 117
    aget p2, p3, p2

    .line 118
    .line 119
    if-nez p2, :cond_8

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_8
    move v3, v2

    .line 123
    goto :goto_1

    .line 124
    :cond_9
    if-nez v6, :cond_a

    .line 125
    .line 126
    move v3, p1

    .line 127
    goto :goto_1

    .line 128
    :cond_a
    move v3, v0

    .line 129
    :cond_b
    :goto_1
    iget-object p2, p0, Ly4/a;->c:LKa/b;

    .line 130
    .line 131
    if-eqz p2, :cond_10

    .line 132
    .line 133
    invoke-static {v3}, LA/f;->f(I)I

    .line 134
    .line 135
    .line 136
    move-result p3

    .line 137
    if-eqz p3, :cond_f

    .line 138
    .line 139
    if-eq p3, v0, :cond_e

    .line 140
    .line 141
    if-eq p3, p1, :cond_d

    .line 142
    .line 143
    if-ne p3, v2, :cond_c

    .line 144
    .line 145
    move v1, v2

    .line 146
    goto :goto_2

    .line 147
    :cond_c
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 148
    .line 149
    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 150
    .line 151
    .line 152
    throw p1

    .line 153
    :cond_d
    move v1, p1

    .line 154
    goto :goto_2

    .line 155
    :cond_e
    move v1, v0

    .line 156
    :cond_f
    :goto_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iget-object p2, p2, LKa/b;->b:Ltc/g;

    .line 161
    .line 162
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    :cond_10
    return v0

    .line 166
    :catch_0
    iget-object p1, p0, Ly4/a;->b:LKa/b;

    .line 167
    .line 168
    if-eqz p1, :cond_11

    .line 169
    .line 170
    invoke-virtual {p1, v3}, LKa/b;->onError(I)V

    .line 171
    .line 172
    .line 173
    :cond_11
    :goto_3
    return v1
.end method
