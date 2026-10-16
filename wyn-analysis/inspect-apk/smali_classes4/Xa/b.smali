.class public final LXa/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/p;
.implements Luc/t;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LXa/a;

.field public c:Luc/r;

.field public d:Landroid/app/Activity;

.field public final e:Ljava/util/LinkedHashMap;

.field public final f:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Landroid/content/Context;LXa/a;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LXa/b;->a:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p2, p0, LXa/b;->b:LXa/a;

    .line 12
    .line 13
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, LXa/b;->e:Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LXa/b;->f:Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a()Landroid/app/Activity;
    .locals 2

    .line 1
    iget-object v0, p0, LXa/b;->d:Landroid/app/Activity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v0, LYa/a;

    .line 10
    .line 11
    const-string v1, "Cannot call method because Activity is not attached to FlutterEngine."

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v0
.end method

.method public final onActivityResult(IILandroid/content/Intent;)Z
    .locals 4

    .line 1
    iget-object p2, p0, LXa/b;->e:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-virtual {p2, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    check-cast p3, Ljava/lang/Integer;

    .line 12
    .line 13
    iget-object v0, p0, LXa/b;->f:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Luc/q;

    .line 24
    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {p2, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    if-eqz p3, :cond_2

    .line 41
    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :cond_0
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    const-string p3, "null cannot be cast to non-null type android.os.PowerManager"

    .line 51
    .line 52
    const-string v0, "power"

    .line 53
    .line 54
    const-string v2, "context"

    .line 55
    .line 56
    iget-object v3, p0, LXa/b;->a:Landroid/content/Context;

    .line 57
    .line 58
    packed-switch p2, :pswitch_data_0

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :pswitch_0
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 66
    .line 67
    const/16 p3, 0x1f

    .line 68
    .line 69
    if-lt p2, p3, :cond_1

    .line 70
    .line 71
    const-string p2, "alarm"

    .line 72
    .line 73
    invoke-virtual {v3, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    const-string p3, "null cannot be cast to non-null type android.app.AlarmManager"

    .line 78
    .line 79
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    check-cast p2, Landroid/app/AlarmManager;

    .line 83
    .line 84
    invoke-static {p2}, Lab/d;->y(Landroid/app/AlarmManager;)Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    goto :goto_0

    .line 89
    :cond_1
    move p2, p1

    .line 90
    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-interface {v1, p2}, Luc/q;->a(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return p1

    .line 98
    :pswitch_1
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v3}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-interface {v1, p2}, Luc/q;->a(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return p1

    .line 113
    :pswitch_2
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    check-cast p2, Landroid/os/PowerManager;

    .line 124
    .line 125
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    invoke-virtual {p2, p3}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-interface {v1, p2}, Luc/q;->a(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    return p1

    .line 141
    :pswitch_3
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    check-cast p2, Landroid/os/PowerManager;

    .line 152
    .line 153
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p3

    .line 157
    invoke-virtual {p2, p3}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-interface {v1, p2}, Luc/q;->a(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_2
    :goto_1
    return p1

    .line 169
    :pswitch_data_0
    .packed-switch 0xc8
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "activity"

    .line 8
    .line 9
    const-string v4, "call"

    .line 10
    .line 11
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    iget-object v5, v0, Luc/o;->a:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v5, :cond_28

    .line 17
    .line 18
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    iget-object v7, v1, LXa/b;->f:Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    iget-object v8, v1, LXa/b;->e:Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    iget-object v9, v1, LXa/b;->b:LXa/a;

    .line 27
    .line 28
    const-string v10, "notificationPermissionManager"

    .line 29
    .line 30
    const-string v13, "android.permission.POST_NOTIFICATIONS"

    .line 31
    .line 32
    const-string v12, "null cannot be cast to non-null type android.os.PowerManager"

    .line 33
    .line 34
    const-string v4, "power"

    .line 35
    .line 36
    const-string v11, "package:"

    .line 37
    .line 38
    const v18, 0xffff

    .line 39
    .line 40
    .line 41
    const-string v14, "context"

    .line 42
    .line 43
    iget-object v15, v1, LXa/b;->a:Landroid/content/Context;

    .line 44
    .line 45
    iget-object v0, v0, Luc/o;->b:Ljava/lang/Object;

    .line 46
    .line 47
    sparse-switch v6, :sswitch_data_0

    .line 48
    .line 49
    .line 50
    goto/16 :goto_7

    .line 51
    .line 52
    :sswitch_0
    :try_start_1
    const-string v0, "isIgnoringBatteryOptimizations"

    .line 53
    .line 54
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_0

    .line 59
    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :cond_0
    invoke-static {v15, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v15, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    check-cast v0, Landroid/os/PowerManager;

    .line 73
    .line 74
    invoke-virtual {v15}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v0, v3}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    move-object v3, v2

    .line 87
    check-cast v3, Ltc/g;

    .line 88
    .line 89
    invoke-virtual {v3, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :catch_0
    move-exception v0

    .line 94
    goto/16 :goto_8

    .line 95
    .line 96
    :sswitch_1
    const-string v3, "startService"

    .line 97
    .line 98
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-nez v3, :cond_1

    .line 103
    .line 104
    goto/16 :goto_7

    .line 105
    .line 106
    :cond_1
    invoke-virtual {v9}, LXa/a;->a()Lab/b;

    .line 107
    .line 108
    .line 109
    invoke-static {v15, v0}, Lab/b;->i(Landroid/content/Context;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 113
    .line 114
    move-object v3, v2

    .line 115
    check-cast v3, Ltc/g;

    .line 116
    .line 117
    invoke-virtual {v3, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :sswitch_2
    const-string v0, "openAlarmsAndRemindersSettings"

    .line 122
    .line 123
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_2

    .line 128
    .line 129
    goto/16 :goto_7

    .line 130
    .line 131
    :cond_2
    invoke-virtual {v1}, LXa/b;->a()Landroid/app/Activity;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v3}, Ljava/util/UUID;->hashCode()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    and-int v3, v3, v18

    .line 144
    .line 145
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    const/16 v5, 0xcb

    .line 150
    .line 151
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-interface {v8, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-interface {v7, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 166
    .line 167
    const/16 v5, 0x1f

    .line 168
    .line 169
    if-lt v4, v5, :cond_3

    .line 170
    .line 171
    new-instance v4, Landroid/content/Intent;

    .line 172
    .line 173
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    new-instance v6, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    const-string v6, "android.settings.REQUEST_SCHEDULE_EXACT_ALARM"

    .line 194
    .line 195
    invoke-direct {v4, v6, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v4, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_3
    new-instance v0, LYa/a;

    .line 203
    .line 204
    const-string v3, "only supports Android 12.0+"

    .line 205
    .line 206
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v0

    .line 210
    :sswitch_3
    const-string v0, "openIgnoreBatteryOptimizationSettings"

    .line 211
    .line 212
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-nez v0, :cond_4

    .line 217
    .line 218
    goto/16 :goto_7

    .line 219
    .line 220
    :cond_4
    invoke-virtual {v1}, LXa/b;->a()Landroid/app/Activity;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {v3}, Ljava/util/UUID;->hashCode()I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    and-int v3, v3, v18

    .line 233
    .line 234
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    const/16 v5, 0xc9

    .line 239
    .line 240
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    invoke-interface {v8, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    invoke-interface {v7, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    new-instance v4, Landroid/content/Intent;

    .line 255
    .line 256
    const-string v5, "android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"

    .line 257
    .line 258
    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v4, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :sswitch_4
    const-string v0, "attachedActivity"

    .line 266
    .line 267
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-nez v0, :cond_5

    .line 272
    .line 273
    goto/16 :goto_7

    .line 274
    .line 275
    :cond_5
    iget-object v0, v1, LXa/b;->d:Landroid/app/Activity;

    .line 276
    .line 277
    if-eqz v0, :cond_6

    .line 278
    .line 279
    const/4 v11, 0x1

    .line 280
    goto :goto_0

    .line 281
    :cond_6
    const/4 v11, 0x0

    .line 282
    :goto_0
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    move-object v3, v2

    .line 287
    check-cast v3, Ltc/g;

    .line 288
    .line 289
    invoke-virtual {v3, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :sswitch_5
    const-string v3, "sendData"

    .line 294
    .line 295
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    if-nez v3, :cond_7

    .line 300
    .line 301
    goto/16 :goto_7

    .line 302
    .line 303
    :cond_7
    invoke-virtual {v9}, LXa/a;->a()Lab/b;

    .line 304
    .line 305
    .line 306
    if-eqz v0, :cond_29

    .line 307
    .line 308
    sget-object v0, Lab/a;->a:LHf/e0;

    .line 309
    .line 310
    iget-object v0, v0, LHf/e0;->a:LHf/c0;

    .line 311
    .line 312
    check-cast v0, LHf/x0;

    .line 313
    .line 314
    invoke-virtual {v0}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    check-cast v0, Ljava/lang/Boolean;

    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :sswitch_6
    const-string v0, "canScheduleExactAlarms"

    .line 325
    .line 326
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-nez v0, :cond_8

    .line 331
    .line 332
    goto/16 :goto_7

    .line 333
    .line 334
    :cond_8
    invoke-static {v15, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 338
    .line 339
    const/16 v5, 0x1f

    .line 340
    .line 341
    if-lt v0, v5, :cond_9

    .line 342
    .line 343
    const-string v0, "alarm"

    .line 344
    .line 345
    invoke-virtual {v15, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    const-string v3, "null cannot be cast to non-null type android.app.AlarmManager"

    .line 350
    .line 351
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    check-cast v0, Landroid/app/AlarmManager;

    .line 355
    .line 356
    invoke-static {v0}, Lab/d;->y(Landroid/app/AlarmManager;)Z

    .line 357
    .line 358
    .line 359
    move-result v14

    .line 360
    goto :goto_1

    .line 361
    :cond_9
    const/4 v14, 0x1

    .line 362
    :goto_1
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    move-object v3, v2

    .line 367
    check-cast v3, Ltc/g;

    .line 368
    .line 369
    invoke-virtual {v3, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    return-void

    .line 373
    :sswitch_7
    const-string v0, "stopService"

    .line 374
    .line 375
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    if-nez v0, :cond_a

    .line 380
    .line 381
    goto/16 :goto_7

    .line 382
    .line 383
    :cond_a
    invoke-virtual {v9}, LXa/a;->a()Lab/b;

    .line 384
    .line 385
    .line 386
    invoke-static {v15}, Lab/b;->j(Landroid/content/Context;)V

    .line 387
    .line 388
    .line 389
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 390
    .line 391
    move-object v3, v2

    .line 392
    check-cast v3, Ltc/g;

    .line 393
    .line 394
    invoke-virtual {v3, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    return-void

    .line 398
    :sswitch_8
    const-string v0, "minimizeApp"

    .line 399
    .line 400
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    if-nez v0, :cond_b

    .line 405
    .line 406
    goto/16 :goto_7

    .line 407
    .line 408
    :cond_b
    invoke-virtual {v1}, LXa/b;->a()Landroid/app/Activity;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    const/4 v4, 0x1

    .line 413
    invoke-virtual {v0, v4}, Landroid/app/Activity;->moveTaskToBack(Z)Z

    .line 414
    .line 415
    .line 416
    return-void

    .line 417
    :sswitch_9
    const-string v3, "updateService"

    .line 418
    .line 419
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    if-nez v3, :cond_c

    .line 424
    .line 425
    goto/16 :goto_7

    .line 426
    .line 427
    :cond_c
    invoke-virtual {v9}, LXa/a;->a()Lab/b;

    .line 428
    .line 429
    .line 430
    invoke-static {v15, v0}, Lab/b;->k(Landroid/content/Context;Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 434
    .line 435
    move-object v3, v2

    .line 436
    check-cast v3, Ltc/g;

    .line 437
    .line 438
    invoke-virtual {v3, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    return-void

    .line 442
    :sswitch_a
    const-string v0, "restartService"

    .line 443
    .line 444
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v0

    .line 448
    if-nez v0, :cond_d

    .line 449
    .line 450
    goto/16 :goto_7

    .line 451
    .line 452
    :cond_d
    invoke-virtual {v9}, LXa/a;->a()Lab/b;

    .line 453
    .line 454
    .line 455
    invoke-static {v15}, Lab/b;->h(Landroid/content/Context;)V

    .line 456
    .line 457
    .line 458
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 459
    .line 460
    move-object v3, v2

    .line 461
    check-cast v3, Ltc/g;

    .line 462
    .line 463
    invoke-virtual {v3, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    return-void

    .line 467
    :sswitch_b
    const-string v0, "isRunningService"

    .line 468
    .line 469
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    if-nez v0, :cond_e

    .line 474
    .line 475
    goto/16 :goto_7

    .line 476
    .line 477
    :cond_e
    invoke-virtual {v9}, LXa/a;->a()Lab/b;

    .line 478
    .line 479
    .line 480
    invoke-static {}, Lab/b;->f()Z

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    move-object v3, v2

    .line 489
    check-cast v3, Ltc/g;

    .line 490
    .line 491
    invoke-virtual {v3, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    return-void

    .line 495
    :sswitch_c
    const-string v0, "openSystemAlertWindowSettings"

    .line 496
    .line 497
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    if-nez v0, :cond_f

    .line 502
    .line 503
    goto/16 :goto_7

    .line 504
    .line 505
    :cond_f
    invoke-virtual {v1}, LXa/b;->a()Landroid/app/Activity;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    invoke-virtual {v3}, Ljava/util/UUID;->hashCode()I

    .line 514
    .line 515
    .line 516
    move-result v3

    .line 517
    and-int v3, v3, v18

    .line 518
    .line 519
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 520
    .line 521
    .line 522
    move-result-object v4

    .line 523
    const/16 v5, 0xca

    .line 524
    .line 525
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 526
    .line 527
    .line 528
    move-result-object v5

    .line 529
    invoke-interface {v8, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 533
    .line 534
    .line 535
    move-result-object v4

    .line 536
    invoke-interface {v7, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    new-instance v4, Landroid/content/Intent;

    .line 540
    .line 541
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v5

    .line 545
    new-instance v6, Ljava/lang/StringBuilder;

    .line 546
    .line 547
    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v5

    .line 557
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 558
    .line 559
    .line 560
    move-result-object v5

    .line 561
    const-string v6, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    .line 562
    .line 563
    invoke-direct {v4, v6, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v0, v4, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 567
    .line 568
    .line 569
    return-void

    .line 570
    :sswitch_d
    const/4 v4, 0x1

    .line 571
    const-string v3, "launchApp"

    .line 572
    .line 573
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    move-result v3

    .line 577
    if-nez v3, :cond_10

    .line 578
    .line 579
    goto/16 :goto_7

    .line 580
    .line 581
    :cond_10
    if-nez v0, :cond_11

    .line 582
    .line 583
    move v3, v4

    .line 584
    goto :goto_2

    .line 585
    :cond_11
    instance-of v3, v0, Ljava/lang/String;

    .line 586
    .line 587
    :goto_2
    if-eqz v3, :cond_29

    .line 588
    .line 589
    check-cast v0, Ljava/lang/String;

    .line 590
    .line 591
    invoke-static {v15, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v15}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 595
    .line 596
    .line 597
    move-result-object v3

    .line 598
    invoke-virtual {v15}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v4

    .line 602
    invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 603
    .line 604
    .line 605
    move-result-object v3

    .line 606
    if-eqz v3, :cond_29

    .line 607
    .line 608
    const/high16 v4, 0x10000000

    .line 609
    .line 610
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 611
    .line 612
    .line 613
    if-eqz v0, :cond_12

    .line 614
    .line 615
    const-string v4, "route"

    .line 616
    .line 617
    invoke-virtual {v3, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 618
    .line 619
    .line 620
    :cond_12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 621
    .line 622
    const/16 v4, 0x22

    .line 623
    .line 624
    if-lt v0, v4, :cond_13

    .line 625
    .line 626
    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-static {v0}, LWf/p;->s(Landroid/app/ActivityOptions;)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v0}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    invoke-virtual {v15, v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 638
    .line 639
    .line 640
    return-void

    .line 641
    :cond_13
    invoke-virtual {v15, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 642
    .line 643
    .line 644
    return-void

    .line 645
    :sswitch_e
    const-string v0, "checkNotificationPermission"

    .line 646
    .line 647
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    move-result v0

    .line 651
    if-nez v0, :cond_14

    .line 652
    .line 653
    goto/16 :goto_7

    .line 654
    .line 655
    :cond_14
    invoke-virtual {v1}, LXa/b;->a()Landroid/app/Activity;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    iget-object v3, v9, LXa/a;->a:Lab/c;

    .line 660
    .line 661
    if-eqz v3, :cond_1a

    .line 662
    .line 663
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 664
    .line 665
    const/16 v4, 0x21

    .line 666
    .line 667
    if-ge v3, v4, :cond_15

    .line 668
    .line 669
    sget-object v0, LZa/b;->a:LZa/b;

    .line 670
    .line 671
    goto :goto_5

    .line 672
    :cond_15
    invoke-static {v0, v13}, LY0/e;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 673
    .line 674
    .line 675
    move-result v3

    .line 676
    if-nez v3, :cond_16

    .line 677
    .line 678
    sget-object v0, LZa/b;->a:LZa/b;

    .line 679
    .line 680
    goto :goto_5

    .line 681
    :cond_16
    const-string v3, "com.pravera.flutter_foreground_task.prefs.NOTIFICATION_PERMISSION_STATUS"

    .line 682
    .line 683
    const/4 v4, 0x0

    .line 684
    invoke-virtual {v0, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 685
    .line 686
    .line 687
    move-result-object v3

    .line 688
    if-nez v3, :cond_17

    .line 689
    .line 690
    :goto_3
    const/4 v3, 0x0

    .line 691
    goto :goto_4

    .line 692
    :cond_17
    const/4 v4, 0x0

    .line 693
    invoke-interface {v3, v13, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    if-nez v3, :cond_18

    .line 698
    .line 699
    goto :goto_3

    .line 700
    :cond_18
    invoke-static {v3}, LZa/b;->valueOf(Ljava/lang/String;)LZa/b;

    .line 701
    .line 702
    .line 703
    move-result-object v3

    .line 704
    :goto_4
    if-eqz v3, :cond_19

    .line 705
    .line 706
    sget-object v4, LZa/b;->c:LZa/b;

    .line 707
    .line 708
    if-ne v3, v4, :cond_19

    .line 709
    .line 710
    invoke-virtual {v0, v13}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    .line 711
    .line 712
    .line 713
    move-result v0

    .line 714
    if-nez v0, :cond_19

    .line 715
    .line 716
    move-object v0, v4

    .line 717
    goto :goto_5

    .line 718
    :cond_19
    sget-object v0, LZa/b;->b:LZa/b;

    .line 719
    .line 720
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 721
    .line 722
    .line 723
    move-result v0

    .line 724
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    move-object v3, v2

    .line 729
    check-cast v3, Ltc/g;

    .line 730
    .line 731
    invoke-virtual {v3, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 732
    .line 733
    .line 734
    return-void

    .line 735
    :cond_1a
    invoke-static {v10}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 736
    .line 737
    .line 738
    const/16 v16, 0x0

    .line 739
    .line 740
    throw v16

    .line 741
    :sswitch_f
    const-string v0, "requestNotificationPermission"

    .line 742
    .line 743
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 744
    .line 745
    .line 746
    move-result v0

    .line 747
    if-nez v0, :cond_1b

    .line 748
    .line 749
    goto/16 :goto_7

    .line 750
    .line 751
    :cond_1b
    invoke-virtual {v1}, LXa/b;->a()Landroid/app/Activity;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    new-instance v3, LY9/c;

    .line 756
    .line 757
    move-object v4, v2

    .line 758
    check-cast v4, Ltc/g;

    .line 759
    .line 760
    const/16 v5, 0x1a

    .line 761
    .line 762
    invoke-direct {v3, v4, v5}, LY9/c;-><init>(Ljava/lang/Object;I)V

    .line 763
    .line 764
    .line 765
    iget-object v5, v9, LXa/a;->a:Lab/c;

    .line 766
    .line 767
    if-eqz v5, :cond_1d

    .line 768
    .line 769
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 770
    .line 771
    const/16 v7, 0x21

    .line 772
    .line 773
    if-ge v6, v7, :cond_1c

    .line 774
    .line 775
    sget-object v0, LZa/b;->a:LZa/b;

    .line 776
    .line 777
    const/16 v17, 0x0

    .line 778
    .line 779
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    invoke-virtual {v4, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 784
    .line 785
    .line 786
    return-void

    .line 787
    :cond_1c
    iput-object v0, v5, Lab/c;->a:Landroid/app/Activity;

    .line 788
    .line 789
    iput-object v3, v5, Lab/c;->b:LY9/c;

    .line 790
    .line 791
    filled-new-array {v13}, [Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v3

    .line 795
    const/16 v4, 0x64

    .line 796
    .line 797
    invoke-static {v0, v3, v4}, LX0/b;->a(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 798
    .line 799
    .line 800
    return-void

    .line 801
    :cond_1d
    invoke-static {v10}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    const/16 v16, 0x0

    .line 805
    .line 806
    throw v16

    .line 807
    :sswitch_10
    const-string v0, "wakeUpScreen"

    .line 808
    .line 809
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 810
    .line 811
    .line 812
    move-result v0

    .line 813
    if-nez v0, :cond_1e

    .line 814
    .line 815
    goto/16 :goto_7

    .line 816
    .line 817
    :cond_1e
    invoke-static {v15, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v15, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 825
    .line 826
    .line 827
    check-cast v0, Landroid/os/PowerManager;

    .line 828
    .line 829
    const-string v3, "PluginUtils:WakeLock"

    .line 830
    .line 831
    const v4, 0x3000000a

    .line 832
    .line 833
    .line 834
    invoke-virtual {v0, v4, v3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    const-wide/16 v3, 0x3e8

    .line 839
    .line 840
    invoke-virtual {v0, v3, v4}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 844
    .line 845
    .line 846
    return-void

    .line 847
    :sswitch_11
    const-string v0, "canDrawOverlays"

    .line 848
    .line 849
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 850
    .line 851
    .line 852
    move-result v0

    .line 853
    if-nez v0, :cond_1f

    .line 854
    .line 855
    goto/16 :goto_7

    .line 856
    .line 857
    :cond_1f
    invoke-static {v15, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    invoke-static {v15}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 861
    .line 862
    .line 863
    move-result v0

    .line 864
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    move-object v3, v2

    .line 869
    check-cast v3, Ltc/g;

    .line 870
    .line 871
    invoke-virtual {v3, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 872
    .line 873
    .line 874
    return-void

    .line 875
    :sswitch_12
    const-string v0, "requestIgnoreBatteryOptimization"

    .line 876
    .line 877
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 878
    .line 879
    .line 880
    move-result v0

    .line 881
    if-nez v0, :cond_20

    .line 882
    .line 883
    goto/16 :goto_7

    .line 884
    .line 885
    :cond_20
    invoke-virtual {v1}, LXa/b;->a()Landroid/app/Activity;

    .line 886
    .line 887
    .line 888
    move-result-object v0

    .line 889
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 890
    .line 891
    .line 892
    move-result-object v3

    .line 893
    invoke-virtual {v3}, Ljava/util/UUID;->hashCode()I

    .line 894
    .line 895
    .line 896
    move-result v3

    .line 897
    and-int v3, v3, v18

    .line 898
    .line 899
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 900
    .line 901
    .line 902
    move-result-object v4

    .line 903
    const/16 v5, 0xc8

    .line 904
    .line 905
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 906
    .line 907
    .line 908
    move-result-object v5

    .line 909
    invoke-interface {v8, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 913
    .line 914
    .line 915
    move-result-object v4

    .line 916
    invoke-interface {v7, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    new-instance v4, Landroid/content/Intent;

    .line 920
    .line 921
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object v5

    .line 925
    new-instance v6, Ljava/lang/StringBuilder;

    .line 926
    .line 927
    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 928
    .line 929
    .line 930
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 931
    .line 932
    .line 933
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v5

    .line 937
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 938
    .line 939
    .line 940
    move-result-object v5

    .line 941
    const-string v6, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"

    .line 942
    .line 943
    invoke-direct {v4, v6, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 944
    .line 945
    .line 946
    invoke-virtual {v0, v4, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 947
    .line 948
    .line 949
    return-void

    .line 950
    :sswitch_13
    const/4 v4, 0x1

    .line 951
    const/16 v17, 0x0

    .line 952
    .line 953
    const-string v0, "isAppOnForeground"

    .line 954
    .line 955
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 956
    .line 957
    .line 958
    move-result v0

    .line 959
    if-nez v0, :cond_21

    .line 960
    .line 961
    goto/16 :goto_7

    .line 962
    .line 963
    :cond_21
    invoke-static {v15, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 964
    .line 965
    .line 966
    invoke-virtual {v15, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    const-string v3, "null cannot be cast to non-null type android.app.ActivityManager"

    .line 971
    .line 972
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 973
    .line 974
    .line 975
    check-cast v0, Landroid/app/ActivityManager;

    .line 976
    .line 977
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    if-nez v0, :cond_23

    .line 982
    .line 983
    :cond_22
    move/from16 v11, v17

    .line 984
    .line 985
    goto :goto_6

    .line 986
    :cond_23
    invoke-virtual {v15}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 987
    .line 988
    .line 989
    move-result-object v3

    .line 990
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 991
    .line 992
    .line 993
    move-result-object v0

    .line 994
    :cond_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 995
    .line 996
    .line 997
    move-result v5

    .line 998
    if-eqz v5, :cond_22

    .line 999
    .line 1000
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v5

    .line 1004
    check-cast v5, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 1005
    .line 1006
    iget v6, v5, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 1007
    .line 1008
    const/16 v7, 0x64

    .line 1009
    .line 1010
    if-ne v6, v7, :cond_24

    .line 1011
    .line 1012
    iget-object v5, v5, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    .line 1013
    .line 1014
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1015
    .line 1016
    .line 1017
    move-result v5

    .line 1018
    if-eqz v5, :cond_24

    .line 1019
    .line 1020
    move v11, v4

    .line 1021
    :goto_6
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v0

    .line 1025
    move-object v3, v2

    .line 1026
    check-cast v3, Ltc/g;

    .line 1027
    .line 1028
    invoke-virtual {v3, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1029
    .line 1030
    .line 1031
    return-void

    .line 1032
    :sswitch_14
    const-string v3, "setOnLockScreenVisibility"

    .line 1033
    .line 1034
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1035
    .line 1036
    .line 1037
    move-result v3

    .line 1038
    if-nez v3, :cond_25

    .line 1039
    .line 1040
    goto :goto_7

    .line 1041
    :cond_25
    invoke-virtual {v1}, LXa/b;->a()Landroid/app/Activity;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v3

    .line 1045
    instance-of v4, v0, Ljava/lang/Boolean;

    .line 1046
    .line 1047
    if-eqz v4, :cond_29

    .line 1048
    .line 1049
    check-cast v0, Ljava/lang/Boolean;

    .line 1050
    .line 1051
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1052
    .line 1053
    .line 1054
    move-result v0

    .line 1055
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1056
    .line 1057
    const/16 v5, 0x1b

    .line 1058
    .line 1059
    if-lt v4, v5, :cond_26

    .line 1060
    .line 1061
    invoke-static {v0, v3}, LF6/k;->i(ZLandroid/app/Activity;)V

    .line 1062
    .line 1063
    .line 1064
    return-void

    .line 1065
    :cond_26
    const/high16 v4, 0x80000

    .line 1066
    .line 1067
    if-eqz v0, :cond_27

    .line 1068
    .line 1069
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v0

    .line 1073
    if-eqz v0, :cond_29

    .line 1074
    .line 1075
    invoke-virtual {v0, v4}, Landroid/view/Window;->addFlags(I)V

    .line 1076
    .line 1077
    .line 1078
    return-void

    .line 1079
    :cond_27
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    if-eqz v0, :cond_29

    .line 1084
    .line 1085
    invoke-virtual {v0, v4}, Landroid/view/Window;->clearFlags(I)V

    .line 1086
    .line 1087
    .line 1088
    return-void

    .line 1089
    :cond_28
    :goto_7
    move-object v0, v2

    .line 1090
    check-cast v0, Ltc/g;

    .line 1091
    .line 1092
    invoke-virtual {v0}, Ltc/g;->c()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1093
    .line 1094
    .line 1095
    return-void

    .line 1096
    :goto_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v3

    .line 1100
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v3

    .line 1104
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    check-cast v2, Ltc/g;

    .line 1109
    .line 1110
    const/4 v4, 0x0

    .line 1111
    invoke-virtual {v2, v3, v0, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1112
    .line 1113
    .line 1114
    :cond_29
    return-void

    .line 1115
    :sswitch_data_0
    .sparse-switch
        -0x7b649496 -> :sswitch_14
        -0x538b2147 -> :sswitch_13
        -0x392076e7 -> :sswitch_12
        -0x36b61089 -> :sswitch_11
        -0x3249d355 -> :sswitch_10
        -0x317d0577 -> :sswitch_f
        -0x2fd823be -> :sswitch_e
        -0x283da292 -> :sswitch_d
        -0x1703bd2a -> :sswitch_c
        0x1287abc0 -> :sswitch_b
        0x1cb5a1a6 -> :sswitch_a
        0x1d1961ac -> :sswitch_9
        0x285ccea3 -> :sswitch_8
        0x29afb053 -> :sswitch_7
        0x314e031a -> :sswitch_6
        0x4a532f52 -> :sswitch_5
        0x4b4cf0d3 -> :sswitch_4
        0x5753f001 -> :sswitch_3
        0x6060d5b9 -> :sswitch_2
        0x6e4047f3 -> :sswitch_1
        0x7bf6be92 -> :sswitch_0
    .end sparse-switch
.end method
