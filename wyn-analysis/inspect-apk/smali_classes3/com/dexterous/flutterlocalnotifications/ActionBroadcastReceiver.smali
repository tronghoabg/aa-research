.class public Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field public static b:LOc/d;

.field public static c:Llc/b;


# instance fields
.field public a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/p;


# direct methods
.method public constructor <init>()V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/p;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/p;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {v0, p1, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/p;-><init>(Landroid/content/Context;I)V

    .line 22
    .line 23
    .line 24
    :cond_1
    iput-object v0, p0, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/p;

    .line 25
    .line 26
    invoke-static {p2}, Lcom/dexterous/flutterlocalnotifications/FlutterLocalNotificationsPlugin;->extractNotificationResponseMap(Landroid/content/Intent;)Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "cancelNotification"

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    const/4 v1, 0x0

    .line 38
    if-eqz p2, :cond_3

    .line 39
    .line 40
    const-string p2, "notificationId"

    .line 41
    .line 42
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    check-cast p2, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    const-string v3, "notificationTag"

    .line 53
    .line 54
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    instance-of v4, v3, Ljava/lang/String;

    .line 59
    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    new-instance v4, LX0/N;

    .line 63
    .line 64
    invoke-direct {v4, p1}, LX0/N;-><init>(Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    check-cast v3, Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v4, p2, v3}, LX0/N;->b(ILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    new-instance v3, LX0/N;

    .line 74
    .line 75
    invoke-direct {v3, p1}, LX0/N;-><init>(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, p2, v1}, LX0/N;->b(ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    :goto_0
    sget-object p2, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->b:LOc/d;

    .line 82
    .line 83
    if-nez p2, :cond_4

    .line 84
    .line 85
    new-instance p2, LOc/d;

    .line 86
    .line 87
    const/4 v3, 0x4

    .line 88
    invoke-direct {p2, v3}, LOc/d;-><init>(I)V

    .line 89
    .line 90
    .line 91
    sput-object p2, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->b:LOc/d;

    .line 92
    .line 93
    :cond_4
    sget-object p2, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->b:LOc/d;

    .line 94
    .line 95
    iget-object v3, p2, LOc/d;->c:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, Luc/h;

    .line 98
    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    invoke-virtual {v3, v0}, Luc/h;->a(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    iget-object p2, p2, LOc/d;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p2, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    :goto_1
    sget-object p2, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->c:Llc/b;

    .line 113
    .line 114
    const-string v0, "ActionBroadcastReceiver"

    .line 115
    .line 116
    if-eqz p2, :cond_6

    .line 117
    .line 118
    const-string p1, "Engine is already initialised"

    .line 119
    .line 120
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_6
    invoke-static {}, Lb7/k;->z()Lb7/k;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    iget-object p2, p2, Lb7/k;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p2, Loc/d;

    .line 131
    .line 132
    invoke-virtual {p2, p1}, Loc/d;->c(Landroid/content/Context;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, p1, v1}, Loc/d;->a(Landroid/content/Context;[Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    new-instance v3, Llc/b;

    .line 139
    .line 140
    invoke-direct {v3, p1, v1}, Llc/b;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    sput-object v3, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->c:Llc/b;

    .line 144
    .line 145
    iget-object v1, p0, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/p;

    .line 146
    .line 147
    const-string v3, "flutter_local_notifications_plugin"

    .line 148
    .line 149
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/p;->a:Landroid/content/Context;

    .line 150
    .line 151
    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    const-string v2, "com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY"

    .line 156
    .line 157
    const-wide/16 v3, -0x1

    .line 158
    .line 159
    invoke-interface {v1, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 160
    .line 161
    .line 162
    move-result-wide v1

    .line 163
    invoke-static {v1, v2}, Lio/flutter/view/FlutterCallbackInformation;->lookupCallbackInformation(J)Lio/flutter/view/FlutterCallbackInformation;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    if-nez v1, :cond_7

    .line 168
    .line 169
    const-string p1, "Callback information could not be retrieved"

    .line 170
    .line 171
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :cond_7
    sget-object v0, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->c:Llc/b;

    .line 176
    .line 177
    iget-object v0, v0, Llc/b;->c:Lmc/b;

    .line 178
    .line 179
    new-instance v2, Luc/j;

    .line 180
    .line 181
    iget-object v3, v0, Lmc/b;->f:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v3, La2/c;

    .line 184
    .line 185
    const-string v4, "dexterous.com/flutter/local_notifications/actions"

    .line 186
    .line 187
    invoke-direct {v2, v3, v4}, Luc/j;-><init>(Luc/f;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    sget-object v3, Lcom/dexterous/flutterlocalnotifications/ActionBroadcastReceiver;->b:LOc/d;

    .line 191
    .line 192
    invoke-virtual {v2, v3}, Luc/j;->a(Luc/i;)V

    .line 193
    .line 194
    .line 195
    iget-object p2, p2, Loc/d;->d:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast p2, LM/y;

    .line 198
    .line 199
    iget-object p2, p2, LM/y;->c:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast p2, Ljava/lang/String;

    .line 202
    .line 203
    new-instance v2, LG9/e;

    .line 204
    .line 205
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    const/16 v3, 0x1d

    .line 210
    .line 211
    invoke-direct {v2, p1, p2, v1, v3}, LG9/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v2}, Lmc/b;->c(LG9/e;)V

    .line 215
    .line 216
    .line 217
    return-void
.end method
