.class public final LJ9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LJ9/Y;

.field public b:Ljava/util/concurrent/atomic/AtomicBoolean;


# virtual methods
.method public final a()Z
    .locals 7

    .line 1
    const-string v0, "firebase_inapp_messaging_auto_data_collection_enabled"

    .line 2
    .line 3
    iget-object v1, p0, LJ9/i;->a:LJ9/Y;

    .line 4
    .line 5
    iget-object v2, v1, LJ9/Y;->a:Ls8/g;

    .line 6
    .line 7
    invoke-virtual {v2}, Ls8/g;->a()V

    .line 8
    .line 9
    .line 10
    iget-object v2, v2, Ls8/g;->a:Landroid/content/Context;

    .line 11
    .line 12
    check-cast v2, Landroid/app/Application;

    .line 13
    .line 14
    const-string v3, "com.google.firebase.inappmessaging"

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v5, "auto_init"

    .line 22
    .line 23
    invoke-interface {v2, v5}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v6, 0x1

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iget-object v0, v1, LJ9/Y;->a:Ls8/g;

    .line 31
    .line 32
    invoke-virtual {v0}, Ls8/g;->a()V

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, Ls8/g;->a:Landroid/content/Context;

    .line 36
    .line 37
    check-cast v0, Landroid/app/Application;

    .line 38
    .line 39
    invoke-virtual {v0, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0, v5}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    invoke-interface {v0, v5, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    return v0

    .line 54
    :cond_0
    return v6

    .line 55
    :cond_1
    iget-object v2, v1, LJ9/Y;->a:Ls8/g;

    .line 56
    .line 57
    invoke-virtual {v2}, Ls8/g;->a()V

    .line 58
    .line 59
    .line 60
    iget-object v2, v2, Ls8/g;->a:Landroid/content/Context;

    .line 61
    .line 62
    check-cast v2, Landroid/app/Application;

    .line 63
    .line 64
    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    const/16 v4, 0x80

    .line 75
    .line 76
    invoke-virtual {v3, v2, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 83
    .line 84
    if-eqz v2, :cond_3

    .line 85
    .line 86
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result v2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 90
    if-eqz v2, :cond_3

    .line 91
    .line 92
    iget-object v1, v1, LJ9/Y;->a:Ls8/g;

    .line 93
    .line 94
    invoke-virtual {v1}, Ls8/g;->a()V

    .line 95
    .line 96
    .line 97
    iget-object v1, v1, Ls8/g;->a:Landroid/content/Context;

    .line 98
    .line 99
    check-cast v1, Landroid/app/Application;

    .line 100
    .line 101
    :try_start_1
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    if-eqz v2, :cond_2

    .line 106
    .line 107
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v2, v1, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    if-eqz v1, :cond_2

    .line 116
    .line 117
    iget-object v2, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 118
    .line 119
    if-eqz v2, :cond_2

    .line 120
    .line 121
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_2

    .line 126
    .line 127
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 128
    .line 129
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v0
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 133
    return v0

    .line 134
    :catch_0
    :cond_2
    return v6

    .line 135
    :catch_1
    :cond_3
    iget-object v0, p0, LJ9/i;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    return v0
.end method
