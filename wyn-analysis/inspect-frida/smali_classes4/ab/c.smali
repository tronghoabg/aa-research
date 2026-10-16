.class public final Lab/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/v;


# instance fields
.field public a:Landroid/app/Activity;

.field public b:LY9/c;


# virtual methods
.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 4

    .line 1
    const-string v0, "permissions"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "grantResults"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    array-length v0, p3

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lab/c;->b:LY9/c;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    new-instance p2, LYa/a;

    .line 21
    .line 22
    const-string p3, "The permission request dialog was closed or the request was cancelled."

    .line 23
    .line 24
    invoke-direct {p2, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p1, LY9/c;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Ltc/g;

    .line 30
    .line 31
    const-class p3, LYa/a;

    .line 32
    .line 33
    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p1, p3, p2, v1}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    iput-object v1, p0, Lab/c;->a:Landroid/app/Activity;

    .line 45
    .line 46
    iput-object v1, p0, Lab/c;->b:LY9/c;

    .line 47
    .line 48
    return v2

    .line 49
    :cond_1
    sget-object v0, LZa/b;->b:LZa/b;

    .line 50
    .line 51
    const/16 v3, 0x64

    .line 52
    .line 53
    if-ne p1, v3, :cond_7

    .line 54
    .line 55
    const-string p1, "android.permission.POST_NOTIFICATIONS"

    .line 56
    .line 57
    invoke-static {p1, p2}, Lff/m;->y0(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-ltz p2, :cond_2

    .line 62
    .line 63
    aget p2, p3, p2

    .line 64
    .line 65
    if-nez p2, :cond_2

    .line 66
    .line 67
    sget-object v0, LZa/b;->a:LZa/b;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget-object p2, p0, Lab/c;->a:Landroid/app/Activity;

    .line 71
    .line 72
    if-eqz p2, :cond_3

    .line 73
    .line 74
    invoke-virtual {p2, p1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    if-nez p2, :cond_3

    .line 79
    .line 80
    sget-object v0, LZa/b;->c:LZa/b;

    .line 81
    .line 82
    :cond_3
    :goto_0
    iget-object p2, p0, Lab/c;->a:Landroid/app/Activity;

    .line 83
    .line 84
    if-eqz p2, :cond_5

    .line 85
    .line 86
    const-string p3, "com.pravera.flutter_foreground_task.prefs.NOTIFICATION_PERMISSION_STATUS"

    .line 87
    .line 88
    invoke-virtual {p2, p3, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    if-nez p2, :cond_4

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    invoke-interface {p2, p1, p3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 104
    .line 105
    .line 106
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 107
    .line 108
    .line 109
    :cond_5
    :goto_1
    iget-object p1, p0, Lab/c;->b:LY9/c;

    .line 110
    .line 111
    if-eqz p1, :cond_6

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    iget-object p1, p1, LY9/c;->b:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p1, Ltc/g;

    .line 124
    .line 125
    invoke-virtual {p1, p2}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_6
    iput-object v1, p0, Lab/c;->a:Landroid/app/Activity;

    .line 129
    .line 130
    iput-object v1, p0, Lab/c;->b:LY9/c;

    .line 131
    .line 132
    const/4 p1, 0x1

    .line 133
    return p1

    .line 134
    :cond_7
    return v2
.end method
