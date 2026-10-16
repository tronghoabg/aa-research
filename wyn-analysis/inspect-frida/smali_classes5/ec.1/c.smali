.class public Lec/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;
.implements Lrc/a;
.implements Luc/p;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroid/app/Activity;

.field public c:Luc/r;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lec/c;->a:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v2, "IS_MAN_AUTO_START_ACCEPTED"

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lec/c;->a:Landroid/content/Context;

    .line 35
    .line 36
    invoke-static {v0, v2}, Lvf/a;->w(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    return v0

    .line 47
    :cond_1
    iget-object v0, p0, Lec/c;->a:Landroid/content/Context;

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    invoke-static {v0, v1}, Lgc/b;->z(Landroid/content/Context;I)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v3, p0, Lec/c;->a:Landroid/content/Context;

    .line 55
    .line 56
    xor-int/2addr v0, v1

    .line 57
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v3, v2, v1}, Lvf/a;->J(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 62
    .line 63
    .line 64
    return v0
.end method

.method public final b()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lec/c;->a:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v2, "IS_MAN_BATTERY_OPTIMIZATION_ACCEPTED"

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lec/c;->a:Landroid/content/Context;

    .line 35
    .line 36
    invoke-static {v0, v2}, Lvf/a;->w(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    return v0

    .line 47
    :cond_1
    iget-object v0, p0, Lec/c;->a:Landroid/content/Context;

    .line 48
    .line 49
    const/4 v1, 0x3

    .line 50
    invoke-static {v0, v1}, Lgc/b;->z(Landroid/content/Context;I)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v1, p0, Lec/c;->a:Landroid/content/Context;

    .line 55
    .line 56
    xor-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {v1, v2, v3}, Lvf/a;->J(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 63
    .line 64
    .line 65
    return v0
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lec/c;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Ltg/b;->G(Landroid/content/Context;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lec/c;->a:Landroid/content/Context;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "package:"

    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v2, Landroid/content/Intent;

    .line 34
    .line 35
    const-string v3, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"

    .line 36
    .line 37
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {v2, v3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 42
    .line 43
    .line 44
    const/high16 v1, 0x10000000

    .line 45
    .line 46
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v2, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-nez v1, :cond_0

    .line 58
    .line 59
    new-instance v2, Landroid/content/Intent;

    .line 60
    .line 61
    const-string v1, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 62
    .line 63
    invoke-direct {v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const/4 v1, 0x0

    .line 75
    const-string v3, "package"

    .line 76
    .line 77
    invoke-static {v3, v0, v1}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v2, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 82
    .line 83
    .line 84
    :cond_0
    iget-object v0, p0, Lec/c;->a:Landroid/content/Context;

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_1
    const-string v0, "BO:DisableOptimization"

    .line 91
    .line 92
    const-string v1, "Battery optimization is already disabled"

    .line 93
    .line 94
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public final d(Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lec/c;->b:Landroid/app/Activity;

    .line 2
    .line 3
    iget-object v2, p0, Lec/c;->f:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v3, p0, Lec/c;->g:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v4, Lec/b;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-direct {v4, p0, p1, v1}, Lec/b;-><init>(Lec/c;ZI)V

    .line 11
    .line 12
    .line 13
    new-instance v5, Lec/b;

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-direct {v5, p0, p1, v1}, Lec/b;-><init>(Lec/c;ZI)V

    .line 17
    .line 18
    .line 19
    invoke-static/range {v0 .. v5}, Ltg/b;->R(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lic/a;Lic/b;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onAttachedToActivity(Lrc/b;)V
    .locals 0

    .line 1
    check-cast p1, Lq/s1;

    .line 2
    .line 3
    iget-object p1, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroid/app/Activity;

    .line 6
    .line 7
    iput-object p1, p0, Lec/c;->b:Landroid/app/Activity;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lec/c;->a:Landroid/content/Context;

    .line 14
    .line 15
    iget-object p1, p0, Lec/c;->c:Luc/r;

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Luc/r;->b(Luc/p;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 3

    .line 1
    new-instance v0, Luc/r;

    .line 2
    .line 3
    iget-object v1, p1, Lqc/a;->c:Luc/f;

    .line 4
    .line 5
    const-string v2, "in.jvapps.disable_battery_optimization"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lec/c;->c:Luc/r;

    .line 11
    .line 12
    iget-object p1, p1, Lqc/a;->a:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p1, p0, Lec/c;->a:Landroid/content/Context;

    .line 15
    .line 16
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lec/c;->b:Landroid/app/Activity;

    .line 3
    .line 4
    iget-object v1, p0, Lec/c;->c:Luc/r;

    .line 5
    .line 6
    invoke-virtual {v1, v0}, Luc/r;->b(Luc/p;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lec/c;->b:Landroid/app/Activity;

    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 12

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    iget-object v2, p1, Luc/o;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "BO:DisableOptimization"

    .line 11
    .line 12
    iget-object p1, p1, Luc/o;->b:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v6, -0x1

    .line 15
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    sparse-switch v7, :sswitch_data_0

    .line 20
    .line 21
    .line 22
    goto/16 :goto_0

    .line 23
    .line 24
    :sswitch_0
    const-string v7, "showDisableManBatteryOptimization"

    .line 25
    .line 26
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v6, 0x7

    .line 34
    goto :goto_0

    .line 35
    :sswitch_1
    const-string v7, "showDisableBatteryOptimization"

    .line 36
    .line 37
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v6, 0x6

    .line 45
    goto :goto_0

    .line 46
    :sswitch_2
    const-string v7, "isManBatteryOptimizationDisabled"

    .line 47
    .line 48
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const/4 v6, 0x5

    .line 56
    goto :goto_0

    .line 57
    :sswitch_3
    const-string v7, "isAllOptimizationsDisabled"

    .line 58
    .line 59
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    const/4 v6, 0x4

    .line 67
    goto :goto_0

    .line 68
    :sswitch_4
    const-string v7, "disableAllOptimizations"

    .line 69
    .line 70
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_4

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    move v6, v0

    .line 78
    goto :goto_0

    .line 79
    :sswitch_5
    const-string v7, "showEnableAutoStart"

    .line 80
    .line 81
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_5

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    move v6, v1

    .line 89
    goto :goto_0

    .line 90
    :sswitch_6
    const-string v7, "isBatteryOptimizationDisabled"

    .line 91
    .line 92
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_6

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_6
    move v6, v3

    .line 100
    goto :goto_0

    .line 101
    :sswitch_7
    const-string v7, "isAutoStartEnabled"

    .line 102
    .line 103
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_7

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_7
    move v6, v4

    .line 111
    :goto_0
    packed-switch v6, :pswitch_data_0

    .line 112
    .line 113
    .line 114
    check-cast p2, Ltc/g;

    .line 115
    .line 116
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_0
    :try_start_0
    check-cast p1, Ljava/util/List;

    .line 121
    .line 122
    if-eqz p1, :cond_8

    .line 123
    .line 124
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iput-object v0, p0, Lec/c;->f:Ljava/lang/String;

    .line 133
    .line 134
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iput-object p1, p0, Lec/c;->g:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {p0, v4}, Lec/c;->d(Z)V

    .line 145
    .line 146
    .line 147
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 148
    .line 149
    move-object v0, p2

    .line 150
    check-cast v0, Ltc/g;

    .line 151
    .line 152
    invoke-virtual {v0, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :catch_0
    move-exception v0

    .line 157
    move-object p1, v0

    .line 158
    goto :goto_1

    .line 159
    :cond_8
    const-string p1, "Unable to request disable manufacturer battery optimization. Arguments are null"

    .line 160
    .line 161
    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 162
    .line 163
    .line 164
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 165
    .line 166
    move-object v0, p2

    .line 167
    check-cast v0, Ltc/g;

    .line 168
    .line 169
    invoke-virtual {v0, p1}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    const-string v1, "Exception in showDisableManBatteryOptimization. "

    .line 176
    .line 177
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 195
    .line 196
    check-cast p2, Ltc/g;

    .line 197
    .line 198
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    goto/16 :goto_6

    .line 202
    .line 203
    :pswitch_1
    :try_start_1
    invoke-virtual {p0}, Lec/c;->c()V

    .line 204
    .line 205
    .line 206
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 207
    .line 208
    move-object v0, p2

    .line 209
    check-cast v0, Ltc/g;

    .line 210
    .line 211
    invoke-virtual {v0, p1}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :catch_1
    move-exception v0

    .line 216
    move-object p1, v0

    .line 217
    new-instance v0, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    const-string v1, "Exception in showDisableBatteryOptimization. "

    .line 220
    .line 221
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 236
    .line 237
    .line 238
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 239
    .line 240
    check-cast p2, Ltc/g;

    .line 241
    .line 242
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    goto/16 :goto_6

    .line 246
    .line 247
    :pswitch_2
    invoke-virtual {p0}, Lec/c;->b()Z

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    check-cast p2, Ltc/g;

    .line 256
    .line 257
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    return-void

    .line 261
    :pswitch_3
    invoke-virtual {p0}, Lec/c;->a()Z

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    if-eqz p1, :cond_9

    .line 266
    .line 267
    iget-object p1, p0, Lec/c;->a:Landroid/content/Context;

    .line 268
    .line 269
    invoke-static {p1}, Ltg/b;->G(Landroid/content/Context;)Z

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    if-eqz p1, :cond_9

    .line 274
    .line 275
    invoke-virtual {p0}, Lec/c;->b()Z

    .line 276
    .line 277
    .line 278
    move-result p1

    .line 279
    if-eqz p1, :cond_9

    .line 280
    .line 281
    goto :goto_2

    .line 282
    :cond_9
    move v3, v4

    .line 283
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    check-cast p2, Ltc/g;

    .line 288
    .line 289
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :pswitch_4
    :try_start_2
    check-cast p1, Ljava/util/List;

    .line 294
    .line 295
    if-eqz p1, :cond_c

    .line 296
    .line 297
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    iput-object v2, p0, Lec/c;->d:Ljava/lang/String;

    .line 306
    .line 307
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    iput-object v2, p0, Lec/c;->e:Ljava/lang/String;

    .line 316
    .line 317
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    iput-object v1, p0, Lec/c;->f:Ljava/lang/String;

    .line 326
    .line 327
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    iput-object p1, p0, Lec/c;->g:Ljava/lang/String;

    .line 336
    .line 337
    invoke-virtual {p0}, Lec/c;->b()Z

    .line 338
    .line 339
    .line 340
    move-result p1

    .line 341
    invoke-virtual {p0}, Lec/c;->a()Z

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    if-nez v0, :cond_a

    .line 346
    .line 347
    new-instance v10, Lec/b;

    .line 348
    .line 349
    invoke-direct {v10, p0, p1, v4}, Lec/b;-><init>(Lec/c;ZI)V

    .line 350
    .line 351
    .line 352
    new-instance v11, Lec/b;

    .line 353
    .line 354
    invoke-direct {v11, p0, p1, v3}, Lec/b;-><init>(Lec/c;ZI)V

    .line 355
    .line 356
    .line 357
    iget-object v6, p0, Lec/c;->b:Landroid/app/Activity;

    .line 358
    .line 359
    iget-object v8, p0, Lec/c;->d:Ljava/lang/String;

    .line 360
    .line 361
    iget-object v9, p0, Lec/c;->e:Ljava/lang/String;

    .line 362
    .line 363
    const/4 v7, 0x1

    .line 364
    invoke-static/range {v6 .. v11}, Ltg/b;->R(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lic/a;Lic/b;)V

    .line 365
    .line 366
    .line 367
    goto :goto_3

    .line 368
    :cond_a
    if-nez p1, :cond_b

    .line 369
    .line 370
    invoke-virtual {p0, v3}, Lec/c;->d(Z)V

    .line 371
    .line 372
    .line 373
    goto :goto_3

    .line 374
    :cond_b
    invoke-virtual {p0}, Lec/c;->c()V

    .line 375
    .line 376
    .line 377
    :goto_3
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 378
    .line 379
    move-object v0, p2

    .line 380
    check-cast v0, Ltc/g;

    .line 381
    .line 382
    invoke-virtual {v0, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    return-void

    .line 386
    :catch_2
    move-exception v0

    .line 387
    move-object p1, v0

    .line 388
    goto :goto_4

    .line 389
    :cond_c
    const-string p1, "Unable to request disable all optimizations. Arguments are null"

    .line 390
    .line 391
    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 392
    .line 393
    .line 394
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 395
    .line 396
    move-object v0, p2

    .line 397
    check-cast v0, Ltc/g;

    .line 398
    .line 399
    invoke-virtual {v0, p1}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 400
    .line 401
    .line 402
    return-void

    .line 403
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 404
    .line 405
    const-string v1, "Exception in disableAllOptimizations. "

    .line 406
    .line 407
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 422
    .line 423
    .line 424
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 425
    .line 426
    check-cast p2, Ltc/g;

    .line 427
    .line 428
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    goto :goto_6

    .line 432
    :pswitch_5
    :try_start_3
    check-cast p1, Ljava/util/List;

    .line 433
    .line 434
    if-eqz p1, :cond_d

    .line 435
    .line 436
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    iput-object v0, p0, Lec/c;->d:Ljava/lang/String;

    .line 445
    .line 446
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v9

    .line 454
    iput-object v9, p0, Lec/c;->e:Ljava/lang/String;

    .line 455
    .line 456
    new-instance v10, Lec/a;

    .line 457
    .line 458
    invoke-direct {v10, p0}, Lec/a;-><init>(Lec/c;)V

    .line 459
    .line 460
    .line 461
    new-instance v11, Lec/a;

    .line 462
    .line 463
    invoke-direct {v11, p0}, Lec/a;-><init>(Lec/c;)V

    .line 464
    .line 465
    .line 466
    iget-object v6, p0, Lec/c;->b:Landroid/app/Activity;

    .line 467
    .line 468
    iget-object v8, p0, Lec/c;->d:Ljava/lang/String;

    .line 469
    .line 470
    const/4 v7, 0x1

    .line 471
    invoke-static/range {v6 .. v11}, Ltg/b;->R(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lic/a;Lic/b;)V

    .line 472
    .line 473
    .line 474
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 475
    .line 476
    move-object v0, p2

    .line 477
    check-cast v0, Ltc/g;

    .line 478
    .line 479
    invoke-virtual {v0, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    return-void

    .line 483
    :catch_3
    move-exception v0

    .line 484
    move-object p1, v0

    .line 485
    goto :goto_5

    .line 486
    :cond_d
    const-string p1, "Unable to request enableAutoStart. Arguments are null"

    .line 487
    .line 488
    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 489
    .line 490
    .line 491
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 492
    .line 493
    move-object v0, p2

    .line 494
    check-cast v0, Ltc/g;

    .line 495
    .line 496
    invoke-virtual {v0, p1}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 497
    .line 498
    .line 499
    return-void

    .line 500
    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 501
    .line 502
    const-string v1, "Exception in showEnableAutoStart. "

    .line 503
    .line 504
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object p1

    .line 511
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object p1

    .line 518
    invoke-static {v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 519
    .line 520
    .line 521
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 522
    .line 523
    check-cast p2, Ltc/g;

    .line 524
    .line 525
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    :goto_6
    return-void

    .line 529
    :pswitch_6
    iget-object p1, p0, Lec/c;->a:Landroid/content/Context;

    .line 530
    .line 531
    invoke-static {p1}, Ltg/b;->G(Landroid/content/Context;)Z

    .line 532
    .line 533
    .line 534
    move-result p1

    .line 535
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 536
    .line 537
    .line 538
    move-result-object p1

    .line 539
    check-cast p2, Ltc/g;

    .line 540
    .line 541
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    return-void

    .line 545
    :pswitch_7
    invoke-virtual {p0}, Lec/c;->a()Z

    .line 546
    .line 547
    .line 548
    move-result p1

    .line 549
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 550
    .line 551
    .line 552
    move-result-object p1

    .line 553
    check-cast p2, Ltc/g;

    .line 554
    .line 555
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 556
    .line 557
    .line 558
    return-void

    .line 559
    :sswitch_data_0
    .sparse-switch
        -0x676412e8 -> :sswitch_7
        -0x63d342d4 -> :sswitch_6
        -0x4a62730d -> :sswitch_5
        -0x3690a873 -> :sswitch_4
        -0x11ee2295 -> :sswitch_3
        0x11e43ac6 -> :sswitch_2
        0x2fbd18ef -> :sswitch_1
        0x33a8eb6b -> :sswitch_0
    .end sparse-switch

    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final onReattachedToActivityForConfigChanges(Lrc/b;)V
    .locals 0

    .line 1
    check-cast p1, Lq/s1;

    .line 2
    .line 3
    iget-object p1, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroid/app/Activity;

    .line 6
    .line 7
    iput-object p1, p0, Lec/c;->b:Landroid/app/Activity;

    .line 8
    .line 9
    return-void
.end method
