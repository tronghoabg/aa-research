.class public Lcc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;
.implements Lrc/a;
.implements Luc/b;
.implements Luc/p;
.implements Luc/t;


# instance fields
.field public a:Luc/r;

.field public b:Landroid/content/Context;

.field public c:Landroid/app/Activity;

.field public d:LVa/X7;

.field public e:Ltc/g;


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
.method public final e(Ljava/lang/Object;Lba/a;)V
    .locals 5

    .line 1
    new-instance v0, LVa/X7;

    .line 2
    .line 3
    invoke-static {}, LE4/y;->a()LE4/y;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, LE4/y;->a:Ljava/util/HashMap;

    .line 8
    .line 9
    const-string v2, "wynCachedEngine"

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Llc/b;

    .line 16
    .line 17
    iget-object v1, v1, Llc/b;->c:Lmc/b;

    .line 18
    .line 19
    sget-object v2, Luc/l;->a:Luc/l;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const-string v4, "x-slayer/overlay_messenger"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2, v3, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1, p2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)Z
    .locals 0

    .line 1
    const/16 p2, 0x4e0

    .line 2
    .line 3
    if-ne p1, p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcc/a;->e:Ltc/g;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, Lcc/a;->b:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {p2}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p1, p2}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput-object p1, p0, Lcc/a;->e:Ltc/g;

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public final onAttachedToActivity(Lrc/b;)V
    .locals 5

    .line 1
    check-cast p1, Lq/s1;

    .line 2
    .line 3
    iget-object v0, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/app/Activity;

    .line 6
    .line 7
    iput-object v0, p0, Lcc/a;->c:Landroid/app/Activity;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Lq/s1;->b(Luc/t;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, LE4/y;->a()LE4/y;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "wynCachedEngine"

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {p1, v0, v1}, LE4/y;->b(Ljava/lang/String;Llc/b;)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, LE4/y;->a()LE4/y;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p1, p1, LE4/y;->a:Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Llc/b;

    .line 33
    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    new-instance p1, Llc/d;

    .line 37
    .line 38
    iget-object v2, p0, Lcc/a;->b:Landroid/content/Context;

    .line 39
    .line 40
    invoke-direct {p1, v2, v1}, Llc/d;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v2, Lmc/a;

    .line 44
    .line 45
    invoke-static {}, Lb7/k;->z()Lb7/k;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iget-object v3, v3, Lb7/k;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v3, Loc/d;

    .line 52
    .line 53
    iget-object v3, v3, Loc/d;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, LM/y;

    .line 56
    .line 57
    iget-object v3, v3, LM/y;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Ljava/lang/String;

    .line 60
    .line 61
    const-string v4, "overlayMain"

    .line 62
    .line 63
    invoke-direct {v2, v3, v4}, Lmc/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v3, p0, Lcc/a;->b:Landroid/content/Context;

    .line 67
    .line 68
    new-instance v4, LE5/l;

    .line 69
    .line 70
    invoke-direct {v4, v3}, LE5/l;-><init>(Landroid/content/Context;)V

    .line 71
    .line 72
    .line 73
    iput-object v2, v4, LE5/l;->e:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object v1, v4, LE5/l;->f:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-virtual {p1, v4}, Llc/d;->a(LE5/l;)Llc/b;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {}, LE4/y;->a()LE4/y;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1, v0, p1}, LE4/y;->b(Ljava/lang/String;Llc/b;)V

    .line 86
    .line 87
    .line 88
    :cond_0
    return-void
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lqc/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    iput-object v0, p0, Lcc/a;->b:Landroid/content/Context;

    .line 4
    .line 5
    new-instance v0, Luc/r;

    .line 6
    .line 7
    iget-object p1, p1, Lqc/a;->c:Luc/f;

    .line 8
    .line 9
    const-string v1, "x-slayer/overlay_channel"

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcc/a;->a:Luc/r;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Luc/r;->b(Luc/p;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, LVa/X7;

    .line 20
    .line 21
    sget-object v1, Luc/l;->a:Luc/l;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const-string v3, "x-slayer/overlay_messenger"

    .line 25
    .line 26
    invoke-direct {v0, p1, v1, v2, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcc/a;->d:LVa/X7;

    .line 30
    .line 31
    invoke-virtual {v0, p0}, LVa/X7;->n(Luc/b;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcc/a;->d:LVa/X7;

    .line 35
    .line 36
    sput-object p1, LS3/f;->f:LVa/X7;

    .line 37
    .line 38
    invoke-virtual {p1, p0}, LVa/X7;->n(Luc/b;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcc/a;->c:Landroid/app/Activity;

    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcc/a;->c:Landroid/app/Activity;

    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcc/a;->a:Luc/r;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Luc/r;->b(Luc/p;)V

    .line 5
    .line 6
    .line 7
    sget-object p1, LS3/f;->f:LVa/X7;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, LVa/X7;->n(Luc/b;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput-object v2, v0, Lcc/a;->e:Ltc/g;

    .line 7
    .line 8
    iget-object v3, v1, Luc/o;->a:Ljava/lang/String;

    .line 9
    .line 10
    const-string v4, "checkPermission"

    .line 11
    .line 12
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    iget-object v1, v0, Lcc/a;->b:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v1}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    move-object/from16 v2, p2

    .line 29
    .line 30
    check-cast v2, Ltc/g;

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    iget-object v3, v1, Luc/o;->a:Ljava/lang/String;

    .line 37
    .line 38
    const-string v4, "requestPermission"

    .line 39
    .line 40
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    new-instance v1, Landroid/content/Intent;

    .line 47
    .line 48
    const-string v2, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    .line 49
    .line 50
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    new-instance v2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v3, "package:"

    .line 56
    .line 57
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object v3, v0, Lcc/a;->c:Landroid/app/Activity;

    .line 61
    .line 62
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 78
    .line 79
    .line 80
    move-object/from16 v2, p2

    .line 81
    .line 82
    check-cast v2, Ltc/g;

    .line 83
    .line 84
    iput-object v2, v0, Lcc/a;->e:Ltc/g;

    .line 85
    .line 86
    iget-object v2, v0, Lcc/a;->c:Landroid/app/Activity;

    .line 87
    .line 88
    const/16 v3, 0x4e0

    .line 89
    .line 90
    invoke-virtual {v2, v1, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_1
    const-string v4, "showOverlay"

    .line 95
    .line 96
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    const-class v5, Lflutter/overlay/window/flutter_overlay_window/OverlayService;

    .line 101
    .line 102
    const-string v9, "y"

    .line 103
    .line 104
    const-string v10, "x"

    .line 105
    .line 106
    if-eqz v4, :cond_16

    .line 107
    .line 108
    iget-object v3, v0, Lcc/a;->b:Landroid/content/Context;

    .line 109
    .line 110
    invoke-static {v3}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-nez v3, :cond_2

    .line 115
    .line 116
    const-string v1, "overlay permission is not enabled"

    .line 117
    .line 118
    move-object/from16 v3, p2

    .line 119
    .line 120
    check-cast v3, Ltc/g;

    .line 121
    .line 122
    const-string v4, "PERMISSION"

    .line 123
    .line 124
    invoke-virtual {v3, v4, v1, v2}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_2
    const-string v3, "height"

    .line 129
    .line 130
    invoke-virtual {v1, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    check-cast v3, Ljava/lang/Integer;

    .line 135
    .line 136
    const-string v4, "width"

    .line 137
    .line 138
    invoke-virtual {v1, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    check-cast v4, Ljava/lang/Integer;

    .line 143
    .line 144
    const-string v11, "alignment"

    .line 145
    .line 146
    invoke-virtual {v1, v11}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    check-cast v11, Ljava/lang/String;

    .line 151
    .line 152
    const-string v12, "flag"

    .line 153
    .line 154
    invoke-virtual {v1, v12}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v12

    .line 158
    check-cast v12, Ljava/lang/String;

    .line 159
    .line 160
    const-string v13, "overlayTitle"

    .line 161
    .line 162
    invoke-virtual {v1, v13}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v13

    .line 166
    check-cast v13, Ljava/lang/String;

    .line 167
    .line 168
    const-string v14, "overlayContent"

    .line 169
    .line 170
    invoke-virtual {v1, v14}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v14

    .line 174
    check-cast v14, Ljava/lang/String;

    .line 175
    .line 176
    const-string v15, "notificationVisibility"

    .line 177
    .line 178
    invoke-virtual {v1, v15}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v15

    .line 182
    check-cast v15, Ljava/lang/String;

    .line 183
    .line 184
    const/16 v16, 0x0

    .line 185
    .line 186
    const-string v6, "enableDrag"

    .line 187
    .line 188
    invoke-virtual {v1, v6}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    check-cast v6, Ljava/lang/Boolean;

    .line 193
    .line 194
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    const/16 v17, 0x1

    .line 199
    .line 200
    const-string v7, "positionGravity"

    .line 201
    .line 202
    invoke-virtual {v1, v7}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    check-cast v7, Ljava/lang/String;

    .line 207
    .line 208
    const/16 v18, -0x1

    .line 209
    .line 210
    const-string v8, "startPosition"

    .line 211
    .line 212
    invoke-virtual {v1, v8}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    check-cast v1, Ljava/util/Map;

    .line 217
    .line 218
    const/4 v8, -0x6

    .line 219
    if-eqz v1, :cond_3

    .line 220
    .line 221
    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v19

    .line 225
    if-eqz v19, :cond_3

    .line 226
    .line 227
    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    check-cast v10, Ljava/lang/Integer;

    .line 232
    .line 233
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 234
    .line 235
    .line 236
    move-result v10

    .line 237
    goto :goto_0

    .line 238
    :cond_3
    move v10, v8

    .line 239
    :goto_0
    if-eqz v1, :cond_4

    .line 240
    .line 241
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v19

    .line 245
    if-eqz v19, :cond_4

    .line 246
    .line 247
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    check-cast v1, Ljava/lang/Integer;

    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 254
    .line 255
    .line 256
    move-result v8

    .line 257
    :cond_4
    if-eqz v4, :cond_5

    .line 258
    .line 259
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    goto :goto_1

    .line 264
    :cond_5
    move/from16 v1, v18

    .line 265
    .line 266
    :goto_1
    sput v1, LS3/f;->c:I

    .line 267
    .line 268
    if-eqz v3, :cond_6

    .line 269
    .line 270
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    goto :goto_2

    .line 275
    :cond_6
    move/from16 v1, v18

    .line 276
    .line 277
    :goto_2
    sput v1, LS3/f;->b:I

    .line 278
    .line 279
    sput-boolean v6, LS3/f;->k:Z

    .line 280
    .line 281
    const-string v1, "center"

    .line 282
    .line 283
    if-eqz v11, :cond_7

    .line 284
    .line 285
    goto :goto_3

    .line 286
    :cond_7
    move-object v11, v1

    .line 287
    :goto_3
    const-string v3, "topLeft"

    .line 288
    .line 289
    invoke-virtual {v11, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    if-eqz v3, :cond_8

    .line 294
    .line 295
    const/16 v1, 0x33

    .line 296
    .line 297
    sput v1, LS3/f;->e:I

    .line 298
    .line 299
    goto :goto_4

    .line 300
    :cond_8
    const-string v3, "topCenter"

    .line 301
    .line 302
    invoke-virtual {v11, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    if-eqz v3, :cond_9

    .line 307
    .line 308
    const/16 v3, 0x30

    .line 309
    .line 310
    sput v3, LS3/f;->e:I

    .line 311
    .line 312
    :cond_9
    const-string v3, "topRight"

    .line 313
    .line 314
    invoke-virtual {v11, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    if-eqz v3, :cond_a

    .line 319
    .line 320
    const/16 v1, 0x35

    .line 321
    .line 322
    sput v1, LS3/f;->e:I

    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_a
    const-string v3, "centerLeft"

    .line 326
    .line 327
    invoke-virtual {v11, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    if-eqz v3, :cond_b

    .line 332
    .line 333
    const/16 v1, 0x13

    .line 334
    .line 335
    sput v1, LS3/f;->e:I

    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_b
    invoke-virtual {v11, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    if-eqz v1, :cond_c

    .line 343
    .line 344
    const/16 v1, 0x11

    .line 345
    .line 346
    sput v1, LS3/f;->e:I

    .line 347
    .line 348
    :cond_c
    const-string v1, "centerRight"

    .line 349
    .line 350
    invoke-virtual {v11, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-eqz v1, :cond_d

    .line 355
    .line 356
    const/16 v1, 0x15

    .line 357
    .line 358
    sput v1, LS3/f;->e:I

    .line 359
    .line 360
    goto :goto_4

    .line 361
    :cond_d
    const-string v1, "bottomLeft"

    .line 362
    .line 363
    invoke-virtual {v11, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    if-eqz v1, :cond_e

    .line 368
    .line 369
    const/16 v1, 0x53

    .line 370
    .line 371
    sput v1, LS3/f;->e:I

    .line 372
    .line 373
    goto :goto_4

    .line 374
    :cond_e
    const-string v1, "bottomCenter"

    .line 375
    .line 376
    invoke-virtual {v11, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    if-eqz v1, :cond_f

    .line 381
    .line 382
    const/16 v1, 0x50

    .line 383
    .line 384
    sput v1, LS3/f;->e:I

    .line 385
    .line 386
    :cond_f
    const-string v1, "bottomRight"

    .line 387
    .line 388
    invoke-virtual {v11, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    if-eqz v1, :cond_10

    .line 393
    .line 394
    const/16 v1, 0x55

    .line 395
    .line 396
    sput v1, LS3/f;->e:I

    .line 397
    .line 398
    :cond_10
    :goto_4
    if-eqz v12, :cond_11

    .line 399
    .line 400
    goto :goto_5

    .line 401
    :cond_11
    const-string v12, "flagNotFocusable"

    .line 402
    .line 403
    :goto_5
    invoke-static {v12}, LS3/f;->G(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    sput-object v13, LS3/f;->g:Ljava/lang/String;

    .line 407
    .line 408
    if-nez v14, :cond_12

    .line 409
    .line 410
    const-string v14, ""

    .line 411
    .line 412
    :cond_12
    sput-object v14, LS3/f;->h:Ljava/lang/String;

    .line 413
    .line 414
    sput-object v7, LS3/f;->i:Ljava/lang/String;

    .line 415
    .line 416
    const-string v1, "visibilityPublic"

    .line 417
    .line 418
    invoke-virtual {v15, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    if-eqz v1, :cond_13

    .line 423
    .line 424
    sput v17, LS3/f;->j:I

    .line 425
    .line 426
    :cond_13
    const-string v1, "visibilitySecret"

    .line 427
    .line 428
    invoke-virtual {v15, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 429
    .line 430
    .line 431
    move-result v1

    .line 432
    if-eqz v1, :cond_14

    .line 433
    .line 434
    sput v18, LS3/f;->j:I

    .line 435
    .line 436
    :cond_14
    const-string v1, "visibilityPrivate"

    .line 437
    .line 438
    invoke-virtual {v15, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    if-eqz v1, :cond_15

    .line 443
    .line 444
    sput v16, LS3/f;->j:I

    .line 445
    .line 446
    :cond_15
    new-instance v1, Landroid/content/Intent;

    .line 447
    .line 448
    iget-object v3, v0, Lcc/a;->b:Landroid/content/Context;

    .line 449
    .line 450
    invoke-direct {v1, v3, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 451
    .line 452
    .line 453
    const/high16 v3, 0x10000000

    .line 454
    .line 455
    invoke-virtual {v1, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 456
    .line 457
    .line 458
    const/high16 v3, 0x20000000

    .line 459
    .line 460
    invoke-virtual {v1, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 461
    .line 462
    .line 463
    const-string v3, "startX"

    .line 464
    .line 465
    invoke-virtual {v1, v3, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 466
    .line 467
    .line 468
    const-string v3, "startY"

    .line 469
    .line 470
    invoke-virtual {v1, v3, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 471
    .line 472
    .line 473
    iget-object v3, v0, Lcc/a;->b:Landroid/content/Context;

    .line 474
    .line 475
    invoke-virtual {v3, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 476
    .line 477
    .line 478
    move-object/from16 v1, p2

    .line 479
    .line 480
    check-cast v1, Ltc/g;

    .line 481
    .line 482
    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    return-void

    .line 486
    :cond_16
    const/16 v16, 0x0

    .line 487
    .line 488
    const/16 v17, 0x1

    .line 489
    .line 490
    const/16 v18, -0x1

    .line 491
    .line 492
    const-string v4, "isOverlayActive"

    .line 493
    .line 494
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v6

    .line 498
    if-eqz v6, :cond_17

    .line 499
    .line 500
    sget-boolean v1, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->r:Z

    .line 501
    .line 502
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 503
    .line 504
    .line 505
    move-result-object v1

    .line 506
    move-object/from16 v2, p2

    .line 507
    .line 508
    check-cast v2, Ltc/g;

    .line 509
    .line 510
    invoke-virtual {v2, v1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    return-void

    .line 514
    :cond_17
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result v4

    .line 518
    if-eqz v4, :cond_18

    .line 519
    .line 520
    sget-boolean v1, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->r:Z

    .line 521
    .line 522
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    move-object/from16 v2, p2

    .line 527
    .line 528
    check-cast v2, Ltc/g;

    .line 529
    .line 530
    invoke-virtual {v2, v1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    return-void

    .line 534
    :cond_18
    const-string v4, "moveOverlay"

    .line 535
    .line 536
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v4

    .line 540
    if-eqz v4, :cond_1c

    .line 541
    .line 542
    invoke-virtual {v1, v10}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    check-cast v2, Ljava/lang/Integer;

    .line 547
    .line 548
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 549
    .line 550
    .line 551
    move-result v2

    .line 552
    invoke-virtual {v1, v9}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    check-cast v1, Ljava/lang/Integer;

    .line 557
    .line 558
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 559
    .line 560
    .line 561
    move-result v1

    .line 562
    sget-object v3, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->q:Lflutter/overlay/window/flutter_overlay_window/OverlayService;

    .line 563
    .line 564
    if-eqz v3, :cond_1b

    .line 565
    .line 566
    iget-object v4, v3, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 567
    .line 568
    if-eqz v4, :cond_1b

    .line 569
    .line 570
    iget-object v3, v3, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 571
    .line 572
    if-eqz v3, :cond_1b

    .line 573
    .line 574
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 575
    .line 576
    .line 577
    move-result-object v3

    .line 578
    check-cast v3, Landroid/view/WindowManager$LayoutParams;

    .line 579
    .line 580
    const/16 v4, -0x7cf

    .line 581
    .line 582
    if-eq v2, v4, :cond_1a

    .line 583
    .line 584
    move/from16 v4, v18

    .line 585
    .line 586
    if-ne v2, v4, :cond_19

    .line 587
    .line 588
    goto :goto_6

    .line 589
    :cond_19
    sget-object v4, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->q:Lflutter/overlay/window/flutter_overlay_window/OverlayService;

    .line 590
    .line 591
    invoke-virtual {v4, v2}, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->a(I)I

    .line 592
    .line 593
    .line 594
    move-result v8

    .line 595
    goto :goto_7

    .line 596
    :cond_1a
    move/from16 v4, v18

    .line 597
    .line 598
    :goto_6
    move v8, v4

    .line 599
    :goto_7
    iput v8, v3, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 600
    .line 601
    sget-object v2, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->q:Lflutter/overlay/window/flutter_overlay_window/OverlayService;

    .line 602
    .line 603
    invoke-virtual {v2, v1}, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->a(I)I

    .line 604
    .line 605
    .line 606
    move-result v1

    .line 607
    iput v1, v3, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 608
    .line 609
    sget-object v1, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->q:Lflutter/overlay/window/flutter_overlay_window/OverlayService;

    .line 610
    .line 611
    iget-object v2, v1, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->d:Landroid/view/WindowManager;

    .line 612
    .line 613
    iget-object v1, v1, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 614
    .line 615
    invoke-interface {v2, v1, v3}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 616
    .line 617
    .line 618
    move/from16 v6, v17

    .line 619
    .line 620
    goto :goto_8

    .line 621
    :cond_1b
    move/from16 v6, v16

    .line 622
    .line 623
    :goto_8
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    move-object/from16 v2, p2

    .line 628
    .line 629
    check-cast v2, Ltc/g;

    .line 630
    .line 631
    invoke-virtual {v2, v1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    return-void

    .line 635
    :cond_1c
    const-string v1, "getOverlayPosition"

    .line 636
    .line 637
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move-result v1

    .line 641
    if-eqz v1, :cond_1e

    .line 642
    .line 643
    sget-object v1, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->q:Lflutter/overlay/window/flutter_overlay_window/OverlayService;

    .line 644
    .line 645
    if-eqz v1, :cond_1d

    .line 646
    .line 647
    iget-object v1, v1, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->e:Lkc/r;

    .line 648
    .line 649
    if-eqz v1, :cond_1d

    .line 650
    .line 651
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    check-cast v1, Landroid/view/WindowManager$LayoutParams;

    .line 656
    .line 657
    new-instance v2, Ljava/util/HashMap;

    .line 658
    .line 659
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 660
    .line 661
    .line 662
    sget-object v3, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->q:Lflutter/overlay/window/flutter_overlay_window/OverlayService;

    .line 663
    .line 664
    iget v4, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 665
    .line 666
    int-to-double v4, v4

    .line 667
    iget-object v3, v3, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->c:Landroid/content/res/Resources;

    .line 668
    .line 669
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 670
    .line 671
    .line 672
    move-result-object v3

    .line 673
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 674
    .line 675
    float-to-double v6, v3

    .line 676
    div-double/2addr v4, v6

    .line 677
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 678
    .line 679
    .line 680
    move-result-object v3

    .line 681
    invoke-virtual {v2, v10, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    sget-object v3, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->q:Lflutter/overlay/window/flutter_overlay_window/OverlayService;

    .line 685
    .line 686
    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 687
    .line 688
    int-to-double v4, v1

    .line 689
    iget-object v1, v3, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->c:Landroid/content/res/Resources;

    .line 690
    .line 691
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 696
    .line 697
    float-to-double v6, v1

    .line 698
    div-double/2addr v4, v6

    .line 699
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 700
    .line 701
    .line 702
    move-result-object v1

    .line 703
    invoke-virtual {v2, v9, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    :cond_1d
    move-object/from16 v1, p2

    .line 707
    .line 708
    check-cast v1, Ltc/g;

    .line 709
    .line 710
    invoke-virtual {v1, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    return-void

    .line 714
    :cond_1e
    const-string v1, "closeOverlay"

    .line 715
    .line 716
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 717
    .line 718
    .line 719
    move-result v1

    .line 720
    if-eqz v1, :cond_20

    .line 721
    .line 722
    sget-boolean v1, Lflutter/overlay/window/flutter_overlay_window/OverlayService;->r:Z

    .line 723
    .line 724
    if-eqz v1, :cond_1f

    .line 725
    .line 726
    new-instance v1, Landroid/content/Intent;

    .line 727
    .line 728
    iget-object v2, v0, Lcc/a;->b:Landroid/content/Context;

    .line 729
    .line 730
    invoke-direct {v1, v2, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 731
    .line 732
    .line 733
    iget-object v2, v0, Lcc/a;->b:Landroid/content/Context;

    .line 734
    .line 735
    invoke-virtual {v2, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 736
    .line 737
    .line 738
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 739
    .line 740
    move-object/from16 v2, p2

    .line 741
    .line 742
    check-cast v2, Ltc/g;

    .line 743
    .line 744
    invoke-virtual {v2, v1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    :cond_1f
    return-void

    .line 748
    :cond_20
    move-object/from16 v1, p2

    .line 749
    .line 750
    check-cast v1, Ltc/g;

    .line 751
    .line 752
    invoke-virtual {v1}, Ltc/g;->c()V

    .line 753
    .line 754
    .line 755
    return-void
.end method

.method public final onReattachedToActivityForConfigChanges(Lrc/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcc/a;->onAttachedToActivity(Lrc/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
