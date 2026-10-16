.class public final synthetic Lcom/google/android/gms/ads/nativead/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzblz;
.implements Lcom/moloco/sdk/publisher/AdShowListener;
.implements Lq/h0;
.implements Lk1/e;
.implements Lp/i;
.implements Lx6/r;
.implements Lnb/b;
.implements Luc/p;
.implements Lzg/e;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lcom/google/android/gms/ads/nativead/l;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance p1, LBf/i;

    const-string v0, "^[a-z][a-z0-9]*(\\.[a-z][a-z0-9]*)+$"

    invoke-direct {p1, v0}, LBf/i;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    return-void

    .line 5
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance p1, LP/d;

    const/16 v0, 0x10

    new-array v0, v0, [Lt0/t;

    invoke-direct {p1, v0}, LP/d;-><init>([Ljava/lang/Object;)V

    .line 7
    iput-object p1, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    return-void

    .line 8
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    return-void

    .line 10
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_2
        0x13 -> :sswitch_1
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/gms/ads/nativead/l;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/view/ContentInfo;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lcom/google/android/gms/ads/nativead/l;->a:I

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-static {p1}, Le1/c;->k(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf9/a;)V
    .locals 3

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/ads/nativead/l;->a:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    if-eqz p1, :cond_6

    .line 14
    iget-object v1, p1, Lf9/a;->e:Landroid/os/Bundle;

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 15
    :cond_0
    iget-object p1, p1, Lf9/a;->e:Landroid/os/Bundle;

    if-nez p1, :cond_1

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 16
    :cond_1
    const-string v1, "scionData"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    .line 17
    :cond_2
    const-string v1, "_cmp"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_0

    .line 18
    :cond_3
    const-string v1, "medium"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 20
    const-string v2, "utm_medium"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    :cond_4
    const-string v1, "source"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 22
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 23
    const-string v2, "utm_source"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    :cond_5
    const-string v1, "campaign"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 25
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 26
    const-string v1, "utm_campaign"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    :cond_6
    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lcom/google/android/gms/ads/nativead/l;->a:I

    iput-object p1, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    const/16 p2, 0x11

    iput p2, p0, Lcom/google/android/gms/ads/nativead/l;->a:I

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Luc/f;)V
    .locals 5

    const/16 v0, 0x16

    iput v0, p0, Lcom/google/android/gms/ads/nativead/l;->a:I

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, LY2/B;

    invoke-direct {v0, p0}, LY2/B;-><init>(Lcom/google/android/gms/ads/nativead/l;)V

    .line 30
    new-instance v1, Luc/r;

    sget-object v2, Luc/x;->b:Luc/x;

    const/4 v3, 0x0

    .line 31
    const-string v4, "flutter/keyboard"

    invoke-direct {v1, p1, v4, v2, v3}, Luc/r;-><init>(Luc/f;Ljava/lang/String;Luc/s;Lab/b;)V

    .line 32
    invoke-virtual {v1, v0}, Luc/r;->b(Luc/p;)V

    return-void
.end method

.method public static h(Lt0/t;)V
    .locals 6

    .line 1
    iget v0, p0, Lt0/t;->N:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ne v0, v1, :cond_3

    .line 6
    .line 7
    iget-boolean v0, p0, Lt0/t;->L:Z

    .line 8
    .line 9
    if-nez v0, :cond_3

    .line 10
    .line 11
    iget-boolean v0, p0, Lt0/t;->K:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-boolean v0, p0, Lt0/t;->s:Z

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v0, p0, Lt0/t;->H:LP/d;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    iget v1, v0, LP/d;->c:I

    .line 26
    .line 27
    if-lez v1, :cond_3

    .line 28
    .line 29
    iget-object v0, v0, LP/d;->a:[Ljava/lang/Object;

    .line 30
    .line 31
    move v3, v2

    .line 32
    :cond_2
    aget-object v4, v0, v3

    .line 33
    .line 34
    check-cast v4, Lef/k;

    .line 35
    .line 36
    iget-object v5, v4, Lef/k;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v5, Lr0/o;

    .line 39
    .line 40
    iget-object v4, v4, Lef/k;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v4, Lr0/k;

    .line 43
    .line 44
    invoke-interface {v5, v4}, Lr0/o;->m(Lr0/k;)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    if-lt v3, v1, :cond_2

    .line 50
    .line 51
    :cond_3
    :goto_0
    iput-boolean v2, p0, Lt0/t;->I:Z

    .line 52
    .line 53
    invoke-virtual {p0}, Lt0/t;->l()LP/d;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iget v0, p0, LP/d;->c:I

    .line 58
    .line 59
    if-lez v0, :cond_5

    .line 60
    .line 61
    iget-object p0, p0, LP/d;->a:[Ljava/lang/Object;

    .line 62
    .line 63
    :cond_4
    aget-object v1, p0, v2

    .line 64
    .line 65
    check-cast v1, Lt0/t;

    .line 66
    .line 67
    invoke-static {v1}, Lcom/google/android/gms/ads/nativead/l;->h(Lt0/t;)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v2, v2, 0x1

    .line 71
    .line 72
    if-lt v2, v0, :cond_4

    .line 73
    .line 74
    :cond_5
    return-void
.end method

.method private final k(Luc/o;Luc/q;)V
    .locals 12

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    const-string v1, "No such clipboard content format: "

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lba/a;

    .line 8
    .line 9
    iget-object v3, v2, Lba/a;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Lio/flutter/plugin/platform/n;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    goto/16 :goto_d

    .line 16
    .line 17
    :cond_0
    iget-object v3, p1, Luc/o;->a:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    const/4 v6, 0x3

    .line 25
    const/4 v7, 0x4

    .line 26
    const/4 v8, 0x2

    .line 27
    const/4 v9, 0x1

    .line 28
    const/4 v10, 0x0

    .line 29
    sparse-switch v5, :sswitch_data_0

    .line 30
    .line 31
    .line 32
    goto/16 :goto_0

    .line 33
    .line 34
    :sswitch_0
    const-string v5, "SystemChrome.setPreferredOrientations"

    .line 35
    .line 36
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    move v3, v8

    .line 43
    goto/16 :goto_1

    .line 44
    .line 45
    :catch_0
    move-exception p1

    .line 46
    goto/16 :goto_c

    .line 47
    .line 48
    :sswitch_1
    const-string v5, "SystemChrome.setEnabledSystemUIOverlays"

    .line 49
    .line 50
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    move v3, v7

    .line 57
    goto/16 :goto_1

    .line 58
    .line 59
    :sswitch_2
    const-string v5, "Clipboard.getData"

    .line 60
    .line 61
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    const/16 v3, 0xb

    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :sswitch_3
    const-string v5, "SystemChrome.setSystemUIOverlayStyle"

    .line 72
    .line 73
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_1

    .line 78
    .line 79
    const/16 v3, 0x8

    .line 80
    .line 81
    goto/16 :goto_1

    .line 82
    .line 83
    :sswitch_4
    const-string v5, "SystemChrome.setEnabledSystemUIMode"

    .line 84
    .line 85
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_1

    .line 90
    .line 91
    const/4 v3, 0x5

    .line 92
    goto/16 :goto_1

    .line 93
    .line 94
    :sswitch_5
    const-string v5, "Clipboard.hasStrings"

    .line 95
    .line 96
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_1

    .line 101
    .line 102
    const/16 v3, 0xd

    .line 103
    .line 104
    goto/16 :goto_1

    .line 105
    .line 106
    :sswitch_6
    const-string v5, "SystemChrome.restoreSystemUIOverlays"

    .line 107
    .line 108
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_1

    .line 113
    .line 114
    const/4 v3, 0x7

    .line 115
    goto :goto_1

    .line 116
    :sswitch_7
    const-string v5, "SystemSound.play"

    .line 117
    .line 118
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_1

    .line 123
    .line 124
    move v3, v10

    .line 125
    goto :goto_1

    .line 126
    :sswitch_8
    const-string v5, "HapticFeedback.vibrate"

    .line 127
    .line 128
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_1

    .line 133
    .line 134
    move v3, v9

    .line 135
    goto :goto_1

    .line 136
    :sswitch_9
    const-string v5, "SystemChrome.setApplicationSwitcherDescription"

    .line 137
    .line 138
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_1

    .line 143
    .line 144
    move v3, v6

    .line 145
    goto :goto_1

    .line 146
    :sswitch_a
    const-string v5, "SystemChrome.setSystemUIChangeListener"

    .line 147
    .line 148
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_1

    .line 153
    .line 154
    const/4 v3, 0x6

    .line 155
    goto :goto_1

    .line 156
    :sswitch_b
    const-string v5, "Clipboard.setData"

    .line 157
    .line 158
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_1

    .line 163
    .line 164
    const/16 v3, 0xc

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :sswitch_c
    const-string v5, "SystemNavigator.pop"

    .line 168
    .line 169
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    if-eqz v3, :cond_1

    .line 174
    .line 175
    const/16 v3, 0xa

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :sswitch_d
    const-string v5, "Share.invoke"

    .line 179
    .line 180
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-eqz v3, :cond_1

    .line 185
    .line 186
    const/16 v3, 0xe

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :sswitch_e
    const-string v5, "SystemNavigator.setFrameworkHandlesBack"

    .line 190
    .line 191
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v3
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    if-eqz v3, :cond_1

    .line 196
    .line 197
    const/16 v3, 0x9

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_1
    :goto_0
    const/4 v3, -0x1

    .line 201
    :goto_1
    const-string v5, "text"

    .line 202
    .line 203
    const-string v11, "clipboard"

    .line 204
    .line 205
    iget-object p1, p1, Luc/o;->b:Ljava/lang/Object;

    .line 206
    .line 207
    packed-switch v3, :pswitch_data_0

    .line 208
    .line 209
    .line 210
    :try_start_1
    move-object p1, p2

    .line 211
    check-cast p1, Ltc/g;

    .line 212
    .line 213
    invoke-virtual {p1}, Ltc/g;->c()V

    .line 214
    .line 215
    .line 216
    goto/16 :goto_d

    .line 217
    .line 218
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 219
    .line 220
    iget-object v1, v2, Lba/a;->c:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 223
    .line 224
    iget-object v1, v1, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v1, LN2/j;

    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    new-instance v2, Landroid/content/Intent;

    .line 232
    .line 233
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 234
    .line 235
    .line 236
    const-string v3, "android.intent.action.SEND"

    .line 237
    .line 238
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 239
    .line 240
    .line 241
    const-string v3, "text/plain"

    .line 242
    .line 243
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 244
    .line 245
    .line 246
    const-string v3, "android.intent.extra.TEXT"

    .line 247
    .line 248
    invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 249
    .line 250
    .line 251
    invoke-static {v2, v4}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    iget-object v1, v1, LN2/j;->c:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v1, Landroid/app/Activity;

    .line 258
    .line 259
    invoke-virtual {v1, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 260
    .line 261
    .line 262
    move-object p1, p2

    .line 263
    check-cast p1, Ltc/g;

    .line 264
    .line 265
    invoke-virtual {p1, v4}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    goto/16 :goto_d

    .line 269
    .line 270
    :pswitch_1
    iget-object p1, v2, Lba/a;->c:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast p1, Lio/flutter/plugin/platform/n;

    .line 273
    .line 274
    iget-object p1, p1, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast p1, LN2/j;

    .line 277
    .line 278
    iget-object p1, p1, LN2/j;->c:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast p1, Landroid/app/Activity;

    .line 281
    .line 282
    invoke-virtual {p1, v11}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    check-cast p1, Landroid/content/ClipboardManager;

    .line 287
    .line 288
    invoke-virtual {p1}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    if-nez v1, :cond_2

    .line 293
    .line 294
    goto :goto_2

    .line 295
    :cond_2
    invoke-virtual {p1}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    if-nez p1, :cond_3

    .line 300
    .line 301
    goto :goto_2

    .line 302
    :cond_3
    const-string v1, "text/*"

    .line 303
    .line 304
    invoke-virtual {p1, v1}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 305
    .line 306
    .line 307
    move-result v10

    .line 308
    :goto_2
    new-instance p1, Lorg/json/JSONObject;

    .line 309
    .line 310
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 311
    .line 312
    .line 313
    const-string v1, "value"

    .line 314
    .line 315
    invoke-virtual {p1, v1, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 316
    .line 317
    .line 318
    move-object v1, p2

    .line 319
    check-cast v1, Ltc/g;

    .line 320
    .line 321
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    goto/16 :goto_d

    .line 325
    .line 326
    :pswitch_2
    check-cast p1, Lorg/json/JSONObject;

    .line 327
    .line 328
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    iget-object v1, v2, Lba/a;->c:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 335
    .line 336
    iget-object v1, v1, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v1, LN2/j;

    .line 339
    .line 340
    iget-object v1, v1, LN2/j;->c:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v1, Landroid/app/Activity;

    .line 343
    .line 344
    invoke-virtual {v1, v11}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    check-cast v1, Landroid/content/ClipboardManager;

    .line 349
    .line 350
    const-string v2, "text label?"

    .line 351
    .line 352
    invoke-static {v2, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    invoke-virtual {v1, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 357
    .line 358
    .line 359
    move-object p1, p2

    .line 360
    check-cast p1, Ltc/g;

    .line 361
    .line 362
    invoke-virtual {p1, v4}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    goto/16 :goto_d

    .line 366
    .line 367
    :pswitch_3
    check-cast p1, Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 368
    .line 369
    if-eqz p1, :cond_4

    .line 370
    .line 371
    :try_start_2
    invoke-static {p1}, Ltc/b;->a(Ljava/lang/String;)Ltc/b;

    .line 372
    .line 373
    .line 374
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 375
    goto :goto_3

    .line 376
    :catch_1
    :try_start_3
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    move-object v1, p2

    .line 381
    check-cast v1, Ltc/g;

    .line 382
    .line 383
    invoke-virtual {v1, v0, p1, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    :cond_4
    move-object p1, v4

    .line 387
    :goto_3
    iget-object v1, v2, Lba/a;->c:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 390
    .line 391
    invoke-virtual {v1, p1}, Lio/flutter/plugin/platform/n;->f(Ltc/b;)Ljava/lang/CharSequence;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    if-eqz p1, :cond_5

    .line 396
    .line 397
    new-instance v1, Lorg/json/JSONObject;

    .line 398
    .line 399
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v1, v5, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 403
    .line 404
    .line 405
    move-object p1, p2

    .line 406
    check-cast p1, Ltc/g;

    .line 407
    .line 408
    invoke-virtual {p1, v1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    goto/16 :goto_d

    .line 412
    .line 413
    :cond_5
    move-object p1, p2

    .line 414
    check-cast p1, Ltc/g;

    .line 415
    .line 416
    invoke-virtual {p1, v4}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    goto/16 :goto_d

    .line 420
    .line 421
    :pswitch_4
    iget-object p1, v2, Lba/a;->c:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast p1, Lio/flutter/plugin/platform/n;

    .line 424
    .line 425
    iget-object p1, p1, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast p1, LN2/j;

    .line 428
    .line 429
    iget-object v1, p1, LN2/j;->a:Ljava/lang/Object;

    .line 430
    .line 431
    invoke-interface {v1}, Lkc/e;->r()Z

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    if-eqz v1, :cond_6

    .line 436
    .line 437
    goto :goto_4

    .line 438
    :cond_6
    iget-object p1, p1, LN2/j;->c:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast p1, Landroid/app/Activity;

    .line 441
    .line 442
    instance-of v1, p1, Landroidx/activity/y;

    .line 443
    .line 444
    if-eqz v1, :cond_7

    .line 445
    .line 446
    check-cast p1, Landroidx/activity/y;

    .line 447
    .line 448
    invoke-interface {p1}, Landroidx/activity/y;->getOnBackPressedDispatcher()Landroidx/activity/w;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    invoke-virtual {p1}, Landroidx/activity/w;->b()V

    .line 453
    .line 454
    .line 455
    goto :goto_4

    .line 456
    :cond_7
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 457
    .line 458
    .line 459
    :goto_4
    move-object p1, p2

    .line 460
    check-cast p1, Ltc/g;

    .line 461
    .line 462
    invoke-virtual {p1, v4}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    goto/16 :goto_d

    .line 466
    .line 467
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 468
    .line 469
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 470
    .line 471
    .line 472
    move-result p1

    .line 473
    iget-object v1, v2, Lba/a;->c:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 476
    .line 477
    iget-object v1, v1, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v1, LN2/j;

    .line 480
    .line 481
    iget-object v1, v1, LN2/j;->a:Ljava/lang/Object;

    .line 482
    .line 483
    invoke-interface {v1, p1}, Lkc/e;->w(Z)V

    .line 484
    .line 485
    .line 486
    move-object p1, p2

    .line 487
    check-cast p1, Ltc/g;

    .line 488
    .line 489
    invoke-virtual {p1, v4}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 490
    .line 491
    .line 492
    goto/16 :goto_d

    .line 493
    .line 494
    :pswitch_6
    :try_start_4
    check-cast p1, Lorg/json/JSONObject;

    .line 495
    .line 496
    invoke-static {v2, p1}, Lba/a;->h(Lba/a;Lorg/json/JSONObject;)LL8/a;

    .line 497
    .line 498
    .line 499
    move-result-object p1

    .line 500
    iget-object v1, v2, Lba/a;->c:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 503
    .line 504
    iget-object v1, v1, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 505
    .line 506
    check-cast v1, LN2/j;

    .line 507
    .line 508
    invoke-virtual {v1, p1}, LN2/j;->o(LL8/a;)V

    .line 509
    .line 510
    .line 511
    move-object p1, p2

    .line 512
    check-cast p1, Ltc/g;

    .line 513
    .line 514
    invoke-virtual {p1, v4}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_2

    .line 515
    .line 516
    .line 517
    goto/16 :goto_d

    .line 518
    .line 519
    :catch_2
    move-exception p1

    .line 520
    goto :goto_5

    .line 521
    :catch_3
    move-exception p1

    .line 522
    :goto_5
    :try_start_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    move-object v1, p2

    .line 527
    check-cast v1, Ltc/g;

    .line 528
    .line 529
    invoke-virtual {v1, v0, p1, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    goto/16 :goto_d

    .line 533
    .line 534
    :pswitch_7
    iget-object p1, v2, Lba/a;->c:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast p1, Lio/flutter/plugin/platform/n;

    .line 537
    .line 538
    iget-object p1, p1, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast p1, LN2/j;

    .line 541
    .line 542
    invoke-virtual {p1}, LN2/j;->q()V

    .line 543
    .line 544
    .line 545
    move-object p1, p2

    .line 546
    check-cast p1, Ltc/g;

    .line 547
    .line 548
    invoke-virtual {p1, v4}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    goto/16 :goto_d

    .line 552
    .line 553
    :pswitch_8
    iget-object p1, v2, Lba/a;->c:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast p1, Lio/flutter/plugin/platform/n;

    .line 556
    .line 557
    iget-object p1, p1, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast p1, LN2/j;

    .line 560
    .line 561
    iget-object v1, p1, LN2/j;->c:Ljava/lang/Object;

    .line 562
    .line 563
    check-cast v1, Landroid/app/Activity;

    .line 564
    .line 565
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    new-instance v2, Lio/flutter/plugin/platform/d;

    .line 574
    .line 575
    invoke-direct {v2, p1, v1}, Lio/flutter/plugin/platform/d;-><init>(LN2/j;Landroid/view/View;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    .line 579
    .line 580
    .line 581
    move-object p1, p2

    .line 582
    check-cast p1, Ltc/g;

    .line 583
    .line 584
    invoke-virtual {p1, v4}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    .line 585
    .line 586
    .line 587
    goto/16 :goto_d

    .line 588
    .line 589
    :pswitch_9
    :try_start_6
    check-cast p1, Ljava/lang/String;

    .line 590
    .line 591
    invoke-static {v2, p1}, Lba/a;->g(Lba/a;Ljava/lang/String;)I

    .line 592
    .line 593
    .line 594
    move-result p1

    .line 595
    iget-object v1, v2, Lba/a;->c:Ljava/lang/Object;

    .line 596
    .line 597
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 598
    .line 599
    iget-object v1, v1, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 600
    .line 601
    check-cast v1, LN2/j;

    .line 602
    .line 603
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 604
    .line 605
    .line 606
    if-ne p1, v9, :cond_8

    .line 607
    .line 608
    const/16 p1, 0x706

    .line 609
    .line 610
    goto :goto_6

    .line 611
    :cond_8
    if-ne p1, v8, :cond_9

    .line 612
    .line 613
    const/16 p1, 0xf06

    .line 614
    .line 615
    goto :goto_6

    .line 616
    :cond_9
    if-ne p1, v6, :cond_a

    .line 617
    .line 618
    const/16 p1, 0x1706

    .line 619
    .line 620
    goto :goto_6

    .line 621
    :cond_a
    if-ne p1, v7, :cond_b

    .line 622
    .line 623
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 624
    .line 625
    const/16 v2, 0x1d

    .line 626
    .line 627
    if-lt p1, v2, :cond_b

    .line 628
    .line 629
    const/16 p1, 0x700

    .line 630
    .line 631
    :goto_6
    iput p1, v1, LN2/j;->b:I

    .line 632
    .line 633
    invoke-virtual {v1}, LN2/j;->q()V

    .line 634
    .line 635
    .line 636
    :cond_b
    move-object p1, p2

    .line 637
    check-cast p1, Ltc/g;

    .line 638
    .line 639
    invoke-virtual {p1, v4}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/NoSuchFieldException; {:try_start_6 .. :try_end_6} :catch_4

    .line 640
    .line 641
    .line 642
    goto/16 :goto_d

    .line 643
    .line 644
    :catch_4
    move-exception p1

    .line 645
    goto :goto_7

    .line 646
    :catch_5
    move-exception p1

    .line 647
    :goto_7
    :try_start_7
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object p1

    .line 651
    move-object v1, p2

    .line 652
    check-cast v1, Ltc/g;

    .line 653
    .line 654
    invoke-virtual {v1, v0, p1, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_0

    .line 655
    .line 656
    .line 657
    goto/16 :goto_d

    .line 658
    .line 659
    :pswitch_a
    :try_start_8
    check-cast p1, Lorg/json/JSONArray;

    .line 660
    .line 661
    invoke-static {v2, p1}, Lba/a;->f(Lba/a;Lorg/json/JSONArray;)Ljava/util/ArrayList;

    .line 662
    .line 663
    .line 664
    move-result-object p1

    .line 665
    iget-object v1, v2, Lba/a;->c:Ljava/lang/Object;

    .line 666
    .line 667
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 668
    .line 669
    invoke-virtual {v1, p1}, Lio/flutter/plugin/platform/n;->m(Ljava/util/ArrayList;)V

    .line 670
    .line 671
    .line 672
    move-object p1, p2

    .line 673
    check-cast p1, Ltc/g;

    .line 674
    .line 675
    invoke-virtual {p1, v4}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_7
    .catch Ljava/lang/NoSuchFieldException; {:try_start_8 .. :try_end_8} :catch_6

    .line 676
    .line 677
    .line 678
    goto/16 :goto_d

    .line 679
    .line 680
    :catch_6
    move-exception p1

    .line 681
    goto :goto_8

    .line 682
    :catch_7
    move-exception p1

    .line 683
    :goto_8
    :try_start_9
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object p1

    .line 687
    move-object v1, p2

    .line 688
    check-cast v1, Ltc/g;

    .line 689
    .line 690
    invoke-virtual {v1, v0, p1, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_0

    .line 691
    .line 692
    .line 693
    goto/16 :goto_d

    .line 694
    .line 695
    :pswitch_b
    :try_start_a
    check-cast p1, Lorg/json/JSONObject;

    .line 696
    .line 697
    const-string v1, "primaryColor"

    .line 698
    .line 699
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 700
    .line 701
    .line 702
    move-result v1

    .line 703
    if-eqz v1, :cond_c

    .line 704
    .line 705
    const/high16 v3, -0x1000000

    .line 706
    .line 707
    or-int/2addr v1, v3

    .line 708
    :cond_c
    const-string v3, "label"

    .line 709
    .line 710
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object p1

    .line 714
    iget-object v2, v2, Lba/a;->c:Ljava/lang/Object;

    .line 715
    .line 716
    check-cast v2, Lio/flutter/plugin/platform/n;

    .line 717
    .line 718
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 719
    .line 720
    iget-object v2, v2, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 721
    .line 722
    check-cast v2, LN2/j;

    .line 723
    .line 724
    iget-object v2, v2, LN2/j;->c:Ljava/lang/Object;

    .line 725
    .line 726
    check-cast v2, Landroid/app/Activity;

    .line 727
    .line 728
    const/16 v5, 0x1c

    .line 729
    .line 730
    if-ge v3, v5, :cond_d

    .line 731
    .line 732
    new-instance v3, Landroid/app/ActivityManager$TaskDescription;

    .line 733
    .line 734
    invoke-direct {v3, p1, v4, v1}, Landroid/app/ActivityManager$TaskDescription;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;I)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v2, v3}, Landroid/app/Activity;->setTaskDescription(Landroid/app/ActivityManager$TaskDescription;)V

    .line 738
    .line 739
    .line 740
    goto :goto_9

    .line 741
    :cond_d
    new-instance v3, Landroid/app/ActivityManager$TaskDescription;

    .line 742
    .line 743
    invoke-static {v1, p1}, Ldb/b;->e(ILjava/lang/String;)Landroid/app/ActivityManager$TaskDescription;

    .line 744
    .line 745
    .line 746
    move-result-object p1

    .line 747
    invoke-virtual {v2, p1}, Landroid/app/Activity;->setTaskDescription(Landroid/app/ActivityManager$TaskDescription;)V

    .line 748
    .line 749
    .line 750
    :goto_9
    move-object p1, p2

    .line 751
    check-cast p1, Ltc/g;

    .line 752
    .line 753
    invoke-virtual {p1, v4}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_8

    .line 754
    .line 755
    .line 756
    goto/16 :goto_d

    .line 757
    .line 758
    :catch_8
    move-exception p1

    .line 759
    :try_start_b
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object p1

    .line 763
    move-object v1, p2

    .line 764
    check-cast v1, Ltc/g;

    .line 765
    .line 766
    invoke-virtual {v1, v0, p1, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_0

    .line 767
    .line 768
    .line 769
    goto/16 :goto_d

    .line 770
    .line 771
    :pswitch_c
    :try_start_c
    check-cast p1, Lorg/json/JSONArray;

    .line 772
    .line 773
    invoke-static {v2, p1}, Lba/a;->d(Lba/a;Lorg/json/JSONArray;)I

    .line 774
    .line 775
    .line 776
    move-result p1

    .line 777
    iget-object v1, v2, Lba/a;->c:Ljava/lang/Object;

    .line 778
    .line 779
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 780
    .line 781
    iget-object v1, v1, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 782
    .line 783
    check-cast v1, LN2/j;

    .line 784
    .line 785
    iget-object v1, v1, LN2/j;->c:Ljava/lang/Object;

    .line 786
    .line 787
    check-cast v1, Landroid/app/Activity;

    .line 788
    .line 789
    invoke-virtual {v1, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 790
    .line 791
    .line 792
    move-object p1, p2

    .line 793
    check-cast p1, Ltc/g;

    .line 794
    .line 795
    invoke-virtual {p1, v4}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_c
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_a
    .catch Ljava/lang/NoSuchFieldException; {:try_start_c .. :try_end_c} :catch_9

    .line 796
    .line 797
    .line 798
    goto/16 :goto_d

    .line 799
    .line 800
    :catch_9
    move-exception p1

    .line 801
    goto :goto_a

    .line 802
    :catch_a
    move-exception p1

    .line 803
    :goto_a
    :try_start_d
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object p1

    .line 807
    move-object v1, p2

    .line 808
    check-cast v1, Ltc/g;

    .line 809
    .line 810
    invoke-virtual {v1, v0, p1, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_0

    .line 811
    .line 812
    .line 813
    goto :goto_d

    .line 814
    :pswitch_d
    :try_start_e
    check-cast p1, Ljava/lang/String;

    .line 815
    .line 816
    invoke-static {p1}, Lpd/f;->e(Ljava/lang/String;)I

    .line 817
    .line 818
    .line 819
    move-result p1

    .line 820
    iget-object v1, v2, Lba/a;->c:Ljava/lang/Object;

    .line 821
    .line 822
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 823
    .line 824
    invoke-virtual {v1, p1}, Lio/flutter/plugin/platform/n;->n(I)V

    .line 825
    .line 826
    .line 827
    move-object p1, p2

    .line 828
    check-cast p1, Ltc/g;

    .line 829
    .line 830
    invoke-virtual {p1, v4}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_e
    .catch Ljava/lang/NoSuchFieldException; {:try_start_e .. :try_end_e} :catch_b
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_0

    .line 831
    .line 832
    .line 833
    goto :goto_d

    .line 834
    :catch_b
    move-exception p1

    .line 835
    :try_start_f
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 836
    .line 837
    .line 838
    move-result-object p1

    .line 839
    move-object v1, p2

    .line 840
    check-cast v1, Ltc/g;

    .line 841
    .line 842
    invoke-virtual {v1, v0, p1, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_f
    .catch Lorg/json/JSONException; {:try_start_f .. :try_end_f} :catch_0

    .line 843
    .line 844
    .line 845
    goto :goto_d

    .line 846
    :pswitch_e
    :try_start_10
    check-cast p1, Ljava/lang/String;

    .line 847
    .line 848
    invoke-static {p1}, Lpd/f;->f(Ljava/lang/String;)I

    .line 849
    .line 850
    .line 851
    move-result p1

    .line 852
    iget-object v1, v2, Lba/a;->c:Ljava/lang/Object;

    .line 853
    .line 854
    check-cast v1, Lio/flutter/plugin/platform/n;

    .line 855
    .line 856
    iget-object v1, v1, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 857
    .line 858
    check-cast v1, LN2/j;

    .line 859
    .line 860
    if-ne p1, v9, :cond_e

    .line 861
    .line 862
    iget-object p1, v1, LN2/j;->c:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast p1, Landroid/app/Activity;

    .line 865
    .line 866
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 867
    .line 868
    .line 869
    move-result-object p1

    .line 870
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 871
    .line 872
    .line 873
    move-result-object p1

    .line 874
    invoke-virtual {p1, v10}, Landroid/view/View;->playSoundEffect(I)V

    .line 875
    .line 876
    .line 877
    goto :goto_b

    .line 878
    :cond_e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 879
    .line 880
    .line 881
    :goto_b
    move-object p1, p2

    .line 882
    check-cast p1, Ltc/g;

    .line 883
    .line 884
    invoke-virtual {p1, v4}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_10
    .catch Ljava/lang/NoSuchFieldException; {:try_start_10 .. :try_end_10} :catch_c
    .catch Lorg/json/JSONException; {:try_start_10 .. :try_end_10} :catch_0

    .line 885
    .line 886
    .line 887
    goto :goto_d

    .line 888
    :catch_c
    move-exception p1

    .line 889
    :try_start_11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object p1

    .line 893
    move-object v1, p2

    .line 894
    check-cast v1, Ltc/g;

    .line 895
    .line 896
    invoke-virtual {v1, v0, p1, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_11
    .catch Lorg/json/JSONException; {:try_start_11 .. :try_end_11} :catch_0

    .line 897
    .line 898
    .line 899
    goto :goto_d

    .line 900
    :goto_c
    new-instance v1, Ljava/lang/StringBuilder;

    .line 901
    .line 902
    const-string v2, "JSON error: "

    .line 903
    .line 904
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object p1

    .line 911
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 912
    .line 913
    .line 914
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object p1

    .line 918
    check-cast p2, Ltc/g;

    .line 919
    .line 920
    invoke-virtual {p2, v0, p1, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 921
    .line 922
    .line 923
    :goto_d
    return-void

    .line 924
    nop

    .line 925
    :sswitch_data_0
    .sparse-switch
        -0x59804db0 -> :sswitch_e
        -0x3789da79 -> :sswitch_d
        -0x2dad73d5 -> :sswitch_c
        -0x2af4a94c -> :sswitch_b
        -0x2267c49c -> :sswitch_a
        -0x20b0f718 -> :sswitch_9
        -0xebc6f23 -> :sswitch_8
        -0xcd4cf9e -> :sswitch_7
        0xe6a45af -> :sswitch_6
        0x3436a200 -> :sswitch_5
        0x4341194a -> :sswitch_4
        0x52e10221 -> :sswitch_3
        0x5a408fa8 -> :sswitch_2
        0x63cbfa4a -> :sswitch_1
        0x7e576127 -> :sswitch_0
    .end sparse-switch

    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/reflect/Type;

    .line 4
    .line 5
    return-object v0
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LDd/c;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-virtual {v0}, LDd/c;->C()V

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, LDd/c;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lp9/n;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v1, v2}, Lp9/n;->c(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v1
.end method

.method public c()Landroid/view/ContentInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    return-object v0
.end method

.method public d()Landroid/content/ClipData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {v0}, Le1/c;->c(Landroid/view/ContentInfo;)Landroid/content/ClipData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public e(Lzg/w;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lzg/g;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lzg/g;-><init>(Lzg/w;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lac/a;

    .line 7
    .line 8
    const/16 v2, 0x1b

    .line 9
    .line 10
    invoke-direct {v1, v0, v2}, Lac/a;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v1}, Lzg/w;->i(Lzg/f;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public f(Lp/k;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    .line 4
    .line 5
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->z:Lq/l;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p1, Lad/L;

    .line 10
    .line 11
    iget-object p1, p1, Lad/L;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 14
    .line 15
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->G:Lk1/m;

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Lk1/m;->a(Landroid/view/MenuItem;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return p1
.end method

.method public g()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {v0}, Le1/c;->b(Landroid/view/ContentInfo;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getSource()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {v0}, Le1/c;->C(Landroid/view/ContentInfo;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public i()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LDd/c;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-virtual {v0}, LDd/c;->C()V

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, LDd/c;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lp9/n;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-virtual {v1, v2}, Lp9/n;->c(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v1
.end method

.method public j(Ljava/lang/String;Ljava/lang/String;Luc/q;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v1, Lr9/k;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, p3, p1, p2, v2}, Lr9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public l(Luc/q;Ljava/io/Serializable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v1, Lng/a;

    .line 6
    .line 7
    const/16 v2, 0xf

    .line 8
    .line 9
    invoke-direct {v1, v2, p1, p2}, Lng/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onAdClicked(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 1

    .line 1
    const-string v0, "molocoAd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/moloco/sdk/publisher/InterstitialAdShowListener;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0, p1}, Lcom/moloco/sdk/publisher/AdShowListener;->onAdClicked(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public onAdHidden(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 1

    .line 1
    const-string v0, "molocoAd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/moloco/sdk/publisher/InterstitialAdShowListener;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0, p1}, Lcom/moloco/sdk/publisher/AdShowListener;->onAdHidden(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public onAdLoaded()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lpb/a;

    .line 4
    .line 5
    iget-object v1, v0, Lpb/a;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lpb/b;

    .line 8
    .line 9
    iget-object v1, v1, LCa/d;->b:Ljava/io/Serializable;

    .line 10
    .line 11
    check-cast v1, Lj$/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    iget-object v2, v0, Lpb/a;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lnb/c;

    .line 16
    .line 17
    iget-object v2, v2, Lnb/c;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v0, v0, Lpb/a;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lvb/c;

    .line 22
    .line 23
    invoke-virtual {v1, v2, v0}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public onAdShowFailed(Lcom/moloco/sdk/publisher/MolocoAdError;)V
    .locals 1

    .line 1
    const-string v0, "molocoAdError"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/moloco/sdk/publisher/InterstitialAdShowListener;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0, p1}, Lcom/moloco/sdk/publisher/AdShowListener;->onAdShowFailed(Lcom/moloco/sdk/publisher/MolocoAdError;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public onAdShowSuccess(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 1

    .line 1
    const-string v0, "molocoAd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/moloco/sdk/publisher/InterstitialAdShowListener;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0, p1}, Lcom/moloco/sdk/publisher/AdShowListener;->onAdShowSuccess(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public onMethodCall(Luc/o;Luc/q;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const-string v3, "error"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x3

    .line 10
    const/4 v6, 0x4

    .line 11
    const/4 v7, 0x2

    .line 12
    const/16 v8, 0x8

    .line 13
    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v10, 0x1

    .line 16
    iget v11, v1, Lcom/google/android/gms/ads/nativead/l;->a:I

    .line 17
    .line 18
    packed-switch v11, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const-string v11, "data"

    .line 22
    .line 23
    iget-object v12, v1, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v12, Lt6/q;

    .line 26
    .line 27
    iget-object v13, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v13, La2/c;

    .line 30
    .line 31
    if-nez v13, :cond_0

    .line 32
    .line 33
    goto/16 :goto_d

    .line 34
    .line 35
    :cond_0
    iget-object v13, v0, Luc/o;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const/16 v14, 0x1a

    .line 41
    .line 42
    iget-object v0, v0, Luc/o;->b:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v15

    .line 48
    sparse-switch v15, :sswitch_data_0

    .line 49
    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :sswitch_0
    const-string v15, "TextInput.requestAutofill"

    .line 54
    .line 55
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v13

    .line 59
    if-nez v13, :cond_1

    .line 60
    .line 61
    goto/16 :goto_0

    .line 62
    .line 63
    :cond_1
    const/16 v2, 0x9

    .line 64
    .line 65
    goto/16 :goto_0

    .line 66
    .line 67
    :sswitch_1
    const-string v15, "TextInput.clearClient"

    .line 68
    .line 69
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v13

    .line 73
    if-nez v13, :cond_2

    .line 74
    .line 75
    goto/16 :goto_0

    .line 76
    .line 77
    :cond_2
    move v2, v8

    .line 78
    goto/16 :goto_0

    .line 79
    .line 80
    :sswitch_2
    const-string v15, "TextInput.finishAutofillContext"

    .line 81
    .line 82
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v13

    .line 86
    if-nez v13, :cond_3

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    const/4 v2, 0x7

    .line 90
    goto :goto_0

    .line 91
    :sswitch_3
    const-string v15, "TextInput.setEditableSizeAndTransform"

    .line 92
    .line 93
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v13

    .line 97
    if-nez v13, :cond_4

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    const/4 v2, 0x6

    .line 101
    goto :goto_0

    .line 102
    :sswitch_4
    const-string v15, "TextInput.sendAppPrivateCommand"

    .line 103
    .line 104
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v13

    .line 108
    if-nez v13, :cond_5

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_5
    const/4 v2, 0x5

    .line 112
    goto :goto_0

    .line 113
    :sswitch_5
    const-string v15, "TextInput.show"

    .line 114
    .line 115
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v13

    .line 119
    if-nez v13, :cond_6

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_6
    move v2, v6

    .line 123
    goto :goto_0

    .line 124
    :sswitch_6
    const-string v15, "TextInput.hide"

    .line 125
    .line 126
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v13

    .line 130
    if-nez v13, :cond_7

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_7
    move v2, v5

    .line 134
    goto :goto_0

    .line 135
    :sswitch_7
    const-string v15, "TextInput.setClient"

    .line 136
    .line 137
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    if-nez v13, :cond_8

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_8
    move v2, v7

    .line 145
    goto :goto_0

    .line 146
    :sswitch_8
    const-string v15, "TextInput.setEditingState"

    .line 147
    .line 148
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    if-nez v13, :cond_9

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_9
    move v2, v10

    .line 156
    goto :goto_0

    .line 157
    :sswitch_9
    const-string v15, "TextInput.setPlatformViewClient"

    .line 158
    .line 159
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v13

    .line 163
    if-nez v13, :cond_a

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_a
    move v2, v9

    .line 167
    :goto_0
    packed-switch v2, :pswitch_data_1

    .line 168
    .line 169
    .line 170
    move-object/from16 v0, p2

    .line 171
    .line 172
    check-cast v0, Ltc/g;

    .line 173
    .line 174
    invoke-virtual {v0}, Ltc/g;->c()V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_d

    .line 178
    .line 179
    :pswitch_0
    iget-object v0, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, La2/c;

    .line 182
    .line 183
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 184
    .line 185
    iget-object v0, v0, La2/c;->b:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, Lio/flutter/plugin/editing/i;

    .line 188
    .line 189
    if-lt v2, v14, :cond_b

    .line 190
    .line 191
    iget-object v2, v0, Lio/flutter/plugin/editing/i;->c:Landroid/view/autofill/AutofillManager;

    .line 192
    .line 193
    if-eqz v2, :cond_c

    .line 194
    .line 195
    iget-object v2, v0, Lio/flutter/plugin/editing/i;->g:Landroid/util/SparseArray;

    .line 196
    .line 197
    if-eqz v2, :cond_c

    .line 198
    .line 199
    iget-object v2, v0, Lio/flutter/plugin/editing/i;->f:Ltc/k;

    .line 200
    .line 201
    iget-object v2, v2, Ltc/k;->j:LS3/i;

    .line 202
    .line 203
    iget-object v2, v2, LS3/i;->a:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v2, Ljava/lang/String;

    .line 206
    .line 207
    new-array v3, v7, [I

    .line 208
    .line 209
    iget-object v5, v0, Lio/flutter/plugin/editing/i;->a:Lkc/r;

    .line 210
    .line 211
    invoke-virtual {v5, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 212
    .line 213
    .line 214
    new-instance v6, Landroid/graphics/Rect;

    .line 215
    .line 216
    iget-object v7, v0, Lio/flutter/plugin/editing/i;->m:Landroid/graphics/Rect;

    .line 217
    .line 218
    invoke-direct {v6, v7}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 219
    .line 220
    .line 221
    aget v7, v3, v9

    .line 222
    .line 223
    aget v3, v3, v10

    .line 224
    .line 225
    invoke-virtual {v6, v7, v3}, Landroid/graphics/Rect;->offset(II)V

    .line 226
    .line 227
    .line 228
    iget-object v0, v0, Lio/flutter/plugin/editing/i;->c:Landroid/view/autofill/AutofillManager;

    .line 229
    .line 230
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    invoke-static {v0, v5, v2, v6}, Le0/h;->k(Landroid/view/autofill/AutofillManager;Lkc/r;ILandroid/graphics/Rect;)V

    .line 235
    .line 236
    .line 237
    goto :goto_1

    .line 238
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    :cond_c
    :goto_1
    move-object/from16 v0, p2

    .line 242
    .line 243
    check-cast v0, Ltc/g;

    .line 244
    .line 245
    invoke-virtual {v0, v4}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    goto/16 :goto_d

    .line 249
    .line 250
    :pswitch_1
    iget-object v0, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v0, La2/c;

    .line 253
    .line 254
    iget-object v0, v0, La2/c;->b:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v0, Lio/flutter/plugin/editing/i;

    .line 257
    .line 258
    iget-object v2, v0, Lio/flutter/plugin/editing/i;->e:LD9/n;

    .line 259
    .line 260
    iget v2, v2, LD9/n;->b:I

    .line 261
    .line 262
    if-ne v2, v5, :cond_d

    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_d
    iget-object v2, v0, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 266
    .line 267
    invoke-virtual {v2, v0}, Lio/flutter/plugin/editing/e;->e(Lio/flutter/plugin/editing/d;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0}, Lio/flutter/plugin/editing/i;->d()V

    .line 271
    .line 272
    .line 273
    iput-object v4, v0, Lio/flutter/plugin/editing/i;->f:Ltc/k;

    .line 274
    .line 275
    invoke-virtual {v0, v4}, Lio/flutter/plugin/editing/i;->e(Ltc/k;)V

    .line 276
    .line 277
    .line 278
    new-instance v2, LD9/n;

    .line 279
    .line 280
    invoke-direct {v2, v10, v9, v8}, LD9/n;-><init>(III)V

    .line 281
    .line 282
    .line 283
    iput-object v2, v0, Lio/flutter/plugin/editing/i;->e:LD9/n;

    .line 284
    .line 285
    iput-object v4, v0, Lio/flutter/plugin/editing/i;->m:Landroid/graphics/Rect;

    .line 286
    .line 287
    :goto_2
    move-object/from16 v0, p2

    .line 288
    .line 289
    check-cast v0, Ltc/g;

    .line 290
    .line 291
    invoke-virtual {v0, v4}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    goto/16 :goto_d

    .line 295
    .line 296
    :pswitch_2
    iget-object v2, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v2, La2/c;

    .line 299
    .line 300
    check-cast v0, Ljava/lang/Boolean;

    .line 301
    .line 302
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 307
    .line 308
    if-lt v3, v14, :cond_10

    .line 309
    .line 310
    iget-object v2, v2, La2/c;->b:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v2, Lio/flutter/plugin/editing/i;

    .line 313
    .line 314
    iget-object v2, v2, Lio/flutter/plugin/editing/i;->c:Landroid/view/autofill/AutofillManager;

    .line 315
    .line 316
    if-nez v2, :cond_e

    .line 317
    .line 318
    goto :goto_3

    .line 319
    :cond_e
    if-eqz v0, :cond_f

    .line 320
    .line 321
    invoke-static {v2}, Le0/h;->i(Landroid/view/autofill/AutofillManager;)V

    .line 322
    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_f
    invoke-static {v2}, Lio/flutter/plugin/editing/h;->w(Landroid/view/autofill/AutofillManager;)V

    .line 326
    .line 327
    .line 328
    goto :goto_3

    .line 329
    :cond_10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    :goto_3
    move-object/from16 v0, p2

    .line 333
    .line 334
    check-cast v0, Ltc/g;

    .line 335
    .line 336
    invoke-virtual {v0, v4}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    goto/16 :goto_d

    .line 340
    .line 341
    :pswitch_3
    :try_start_0
    check-cast v0, Lorg/json/JSONObject;

    .line 342
    .line 343
    const-string v2, "width"

    .line 344
    .line 345
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 346
    .line 347
    .line 348
    move-result-wide v14

    .line 349
    const-string v2, "height"

    .line 350
    .line 351
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 352
    .line 353
    .line 354
    move-result-wide v16

    .line 355
    const-string v2, "transform"

    .line 356
    .line 357
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    const/16 v2, 0x10

    .line 362
    .line 363
    new-array v5, v2, [D

    .line 364
    .line 365
    :goto_4
    if-ge v9, v2, :cond_11

    .line 366
    .line 367
    invoke-virtual {v0, v9}, Lorg/json/JSONArray;->getDouble(I)D

    .line 368
    .line 369
    .line 370
    move-result-wide v6

    .line 371
    aput-wide v6, v5, v9

    .line 372
    .line 373
    add-int/2addr v9, v10

    .line 374
    goto :goto_4

    .line 375
    :catch_0
    move-exception v0

    .line 376
    goto :goto_5

    .line 377
    :cond_11
    iget-object v0, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 378
    .line 379
    move-object v13, v0

    .line 380
    check-cast v13, La2/c;

    .line 381
    .line 382
    move-object/from16 v18, v5

    .line 383
    .line 384
    invoke-virtual/range {v13 .. v18}, La2/c;->L(DD[D)V

    .line 385
    .line 386
    .line 387
    move-object/from16 v0, p2

    .line 388
    .line 389
    check-cast v0, Ltc/g;

    .line 390
    .line 391
    invoke-virtual {v0, v4}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 392
    .line 393
    .line 394
    goto/16 :goto_d

    .line 395
    .line 396
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    move-object/from16 v2, p2

    .line 401
    .line 402
    check-cast v2, Ltc/g;

    .line 403
    .line 404
    invoke-virtual {v2, v3, v0, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    goto/16 :goto_d

    .line 408
    .line 409
    :pswitch_4
    :try_start_1
    check-cast v0, Lorg/json/JSONObject;

    .line 410
    .line 411
    const-string v2, "action"

    .line 412
    .line 413
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    if-eqz v0, :cond_12

    .line 422
    .line 423
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 424
    .line 425
    .line 426
    move-result v5

    .line 427
    if-nez v5, :cond_12

    .line 428
    .line 429
    new-instance v5, Landroid/os/Bundle;

    .line 430
    .line 431
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v5, v11, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    goto :goto_6

    .line 438
    :catch_1
    move-exception v0

    .line 439
    goto :goto_7

    .line 440
    :cond_12
    move-object v5, v4

    .line 441
    :goto_6
    iget-object v0, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v0, La2/c;

    .line 444
    .line 445
    iget-object v0, v0, La2/c;->b:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v0, Lio/flutter/plugin/editing/i;

    .line 448
    .line 449
    iget-object v6, v0, Lio/flutter/plugin/editing/i;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 450
    .line 451
    iget-object v0, v0, Lio/flutter/plugin/editing/i;->a:Lkc/r;

    .line 452
    .line 453
    invoke-virtual {v6, v0, v2, v5}, Landroid/view/inputmethod/InputMethodManager;->sendAppPrivateCommand(Landroid/view/View;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 454
    .line 455
    .line 456
    move-object/from16 v0, p2

    .line 457
    .line 458
    check-cast v0, Ltc/g;

    .line 459
    .line 460
    invoke-virtual {v0, v4}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 461
    .line 462
    .line 463
    goto/16 :goto_d

    .line 464
    .line 465
    :goto_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    move-object/from16 v2, p2

    .line 470
    .line 471
    check-cast v2, Ltc/g;

    .line 472
    .line 473
    invoke-virtual {v2, v3, v0, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    goto/16 :goto_d

    .line 477
    .line 478
    :pswitch_5
    iget-object v0, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v0, La2/c;

    .line 481
    .line 482
    iget-object v0, v0, La2/c;->b:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v0, Lio/flutter/plugin/editing/i;

    .line 485
    .line 486
    iget-object v2, v0, Lio/flutter/plugin/editing/i;->a:Lkc/r;

    .line 487
    .line 488
    iget-object v3, v0, Lio/flutter/plugin/editing/i;->f:Ltc/k;

    .line 489
    .line 490
    iget-object v5, v0, Lio/flutter/plugin/editing/i;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 491
    .line 492
    if-eqz v3, :cond_14

    .line 493
    .line 494
    iget-object v3, v3, Ltc/k;->g:LN1/P;

    .line 495
    .line 496
    const/16 v6, 0xb

    .line 497
    .line 498
    iget v3, v3, LN1/P;->a:I

    .line 499
    .line 500
    if-eq v3, v6, :cond_13

    .line 501
    .line 502
    goto :goto_8

    .line 503
    :cond_13
    invoke-virtual {v0}, Lio/flutter/plugin/editing/i;->d()V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    invoke-virtual {v5, v0, v9}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 511
    .line 512
    .line 513
    goto :goto_9

    .line 514
    :cond_14
    :goto_8
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    .line 515
    .line 516
    .line 517
    invoke-virtual {v5, v2, v9}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 518
    .line 519
    .line 520
    :goto_9
    move-object/from16 v0, p2

    .line 521
    .line 522
    check-cast v0, Ltc/g;

    .line 523
    .line 524
    invoke-virtual {v0, v4}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    goto/16 :goto_d

    .line 528
    .line 529
    :pswitch_6
    iget-object v0, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast v0, La2/c;

    .line 532
    .line 533
    iget-object v0, v0, La2/c;->b:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v0, Lio/flutter/plugin/editing/i;

    .line 536
    .line 537
    iget-object v2, v0, Lio/flutter/plugin/editing/i;->e:LD9/n;

    .line 538
    .line 539
    iget v2, v2, LD9/n;->b:I

    .line 540
    .line 541
    if-ne v2, v6, :cond_15

    .line 542
    .line 543
    invoke-virtual {v0}, Lio/flutter/plugin/editing/i;->d()V

    .line 544
    .line 545
    .line 546
    goto :goto_a

    .line 547
    :cond_15
    iget-object v2, v0, Lio/flutter/plugin/editing/i;->a:Lkc/r;

    .line 548
    .line 549
    invoke-virtual {v0}, Lio/flutter/plugin/editing/i;->d()V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v2}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    iget-object v0, v0, Lio/flutter/plugin/editing/i;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 557
    .line 558
    invoke-virtual {v0, v2, v9}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 559
    .line 560
    .line 561
    :goto_a
    move-object/from16 v0, p2

    .line 562
    .line 563
    check-cast v0, Ltc/g;

    .line 564
    .line 565
    invoke-virtual {v0, v4}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    goto/16 :goto_d

    .line 569
    .line 570
    :pswitch_7
    :try_start_2
    check-cast v0, Lorg/json/JSONArray;

    .line 571
    .line 572
    invoke-virtual {v0, v9}, Lorg/json/JSONArray;->getInt(I)I

    .line 573
    .line 574
    .line 575
    move-result v2

    .line 576
    invoke-virtual {v0, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    iget-object v5, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast v5, La2/c;

    .line 583
    .line 584
    invoke-static {v0}, Ltc/k;->a(Lorg/json/JSONObject;)Ltc/k;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    invoke-virtual {v5, v2, v0}, La2/c;->K(ILtc/k;)V

    .line 589
    .line 590
    .line 591
    move-object/from16 v0, p2

    .line 592
    .line 593
    check-cast v0, Ltc/g;

    .line 594
    .line 595
    invoke-virtual {v0, v4}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_2

    .line 596
    .line 597
    .line 598
    goto/16 :goto_d

    .line 599
    .line 600
    :catch_2
    move-exception v0

    .line 601
    goto :goto_b

    .line 602
    :catch_3
    move-exception v0

    .line 603
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    move-object/from16 v2, p2

    .line 608
    .line 609
    check-cast v2, Ltc/g;

    .line 610
    .line 611
    invoke-virtual {v2, v3, v0, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    goto :goto_d

    .line 615
    :pswitch_8
    :try_start_3
    check-cast v0, Lorg/json/JSONObject;

    .line 616
    .line 617
    iget-object v2, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v2, La2/c;

    .line 620
    .line 621
    invoke-static {v0}, Ltc/l;->a(Lorg/json/JSONObject;)Ltc/l;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    invoke-virtual {v2, v0}, La2/c;->M(Ltc/l;)V

    .line 626
    .line 627
    .line 628
    move-object/from16 v0, p2

    .line 629
    .line 630
    check-cast v0, Ltc/g;

    .line 631
    .line 632
    invoke-virtual {v0, v4}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_4

    .line 633
    .line 634
    .line 635
    goto :goto_d

    .line 636
    :catch_4
    move-exception v0

    .line 637
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    move-object/from16 v2, p2

    .line 642
    .line 643
    check-cast v2, Ltc/g;

    .line 644
    .line 645
    invoke-virtual {v2, v3, v0, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 646
    .line 647
    .line 648
    goto :goto_d

    .line 649
    :pswitch_9
    :try_start_4
    check-cast v0, Lorg/json/JSONObject;

    .line 650
    .line 651
    const-string v2, "platformViewId"

    .line 652
    .line 653
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 654
    .line 655
    .line 656
    move-result v2

    .line 657
    const-string v7, "usesVirtualDisplay"

    .line 658
    .line 659
    invoke-virtual {v0, v7, v9}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 660
    .line 661
    .line 662
    move-result v0

    .line 663
    iget-object v7, v12, Lt6/q;->b:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast v7, La2/c;

    .line 666
    .line 667
    iget-object v7, v7, La2/c;->b:Ljava/lang/Object;

    .line 668
    .line 669
    check-cast v7, Lio/flutter/plugin/editing/i;

    .line 670
    .line 671
    if-eqz v0, :cond_16

    .line 672
    .line 673
    iget-object v0, v7, Lio/flutter/plugin/editing/i;->a:Lkc/r;

    .line 674
    .line 675
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 676
    .line 677
    .line 678
    new-instance v6, LD9/n;

    .line 679
    .line 680
    invoke-direct {v6, v5, v2, v8}, LD9/n;-><init>(III)V

    .line 681
    .line 682
    .line 683
    iput-object v6, v7, Lio/flutter/plugin/editing/i;->e:LD9/n;

    .line 684
    .line 685
    iget-object v2, v7, Lio/flutter/plugin/editing/i;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 686
    .line 687
    invoke-virtual {v2, v0}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 688
    .line 689
    .line 690
    iput-boolean v9, v7, Lio/flutter/plugin/editing/i;->i:Z

    .line 691
    .line 692
    goto :goto_c

    .line 693
    :cond_16
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 694
    .line 695
    .line 696
    new-instance v0, LD9/n;

    .line 697
    .line 698
    invoke-direct {v0, v6, v2, v8}, LD9/n;-><init>(III)V

    .line 699
    .line 700
    .line 701
    iput-object v0, v7, Lio/flutter/plugin/editing/i;->e:LD9/n;

    .line 702
    .line 703
    iput-object v4, v7, Lio/flutter/plugin/editing/i;->j:Landroid/view/inputmethod/InputConnection;

    .line 704
    .line 705
    :goto_c
    move-object/from16 v0, p2

    .line 706
    .line 707
    check-cast v0, Ltc/g;

    .line 708
    .line 709
    invoke-virtual {v0, v4}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_5

    .line 710
    .line 711
    .line 712
    goto :goto_d

    .line 713
    :catch_5
    move-exception v0

    .line 714
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    move-object/from16 v2, p2

    .line 719
    .line 720
    check-cast v2, Ltc/g;

    .line 721
    .line 722
    invoke-virtual {v2, v3, v0, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 723
    .line 724
    .line 725
    :goto_d
    return-void

    .line 726
    :pswitch_a
    iget-object v5, v1, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 727
    .line 728
    check-cast v5, La2/v;

    .line 729
    .line 730
    iget-object v6, v5, La2/v;->b:Ljava/lang/Object;

    .line 731
    .line 732
    check-cast v6, Lba/a;

    .line 733
    .line 734
    if-nez v6, :cond_17

    .line 735
    .line 736
    goto/16 :goto_10

    .line 737
    .line 738
    :cond_17
    iget-object v0, v0, Luc/o;->a:Ljava/lang/String;

    .line 739
    .line 740
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 741
    .line 742
    .line 743
    const/16 v6, 0x22

    .line 744
    .line 745
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 746
    .line 747
    .line 748
    move-result v8

    .line 749
    sparse-switch v8, :sswitch_data_1

    .line 750
    .line 751
    .line 752
    goto :goto_e

    .line 753
    :sswitch_a
    const-string v8, "Scribe.isStylusHandwritingAvailable"

    .line 754
    .line 755
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 756
    .line 757
    .line 758
    move-result v0

    .line 759
    if-nez v0, :cond_18

    .line 760
    .line 761
    goto :goto_e

    .line 762
    :cond_18
    move v2, v7

    .line 763
    goto :goto_e

    .line 764
    :sswitch_b
    const-string v7, "Scribe.startStylusHandwriting"

    .line 765
    .line 766
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 767
    .line 768
    .line 769
    move-result v0

    .line 770
    if-nez v0, :cond_19

    .line 771
    .line 772
    goto :goto_e

    .line 773
    :cond_19
    move v2, v10

    .line 774
    goto :goto_e

    .line 775
    :sswitch_c
    const-string v7, "Scribe.isFeatureAvailable"

    .line 776
    .line 777
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 778
    .line 779
    .line 780
    move-result v0

    .line 781
    if-nez v0, :cond_1a

    .line 782
    .line 783
    goto :goto_e

    .line 784
    :cond_1a
    move v2, v9

    .line 785
    :goto_e
    packed-switch v2, :pswitch_data_2

    .line 786
    .line 787
    .line 788
    move-object/from16 v0, p2

    .line 789
    .line 790
    check-cast v0, Ltc/g;

    .line 791
    .line 792
    invoke-virtual {v0}, Ltc/g;->c()V

    .line 793
    .line 794
    .line 795
    goto/16 :goto_10

    .line 796
    .line 797
    :pswitch_b
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 798
    .line 799
    if-ge v0, v6, :cond_1b

    .line 800
    .line 801
    const-string v0, "Requires API level 34 or higher."

    .line 802
    .line 803
    move-object/from16 v2, p2

    .line 804
    .line 805
    check-cast v2, Ltc/g;

    .line 806
    .line 807
    invoke-virtual {v2, v3, v0, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 808
    .line 809
    .line 810
    goto/16 :goto_10

    .line 811
    .line 812
    :cond_1b
    :try_start_5
    iget-object v0, v5, La2/v;->b:Ljava/lang/Object;

    .line 813
    .line 814
    check-cast v0, Lba/a;

    .line 815
    .line 816
    iget-object v0, v0, Lba/a;->b:Ljava/lang/Object;

    .line 817
    .line 818
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 819
    .line 820
    invoke-static {v0}, Lh3/e;->s(Landroid/view/inputmethod/InputMethodManager;)Z

    .line 821
    .line 822
    .line 823
    move-result v0

    .line 824
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    move-object/from16 v2, p2

    .line 829
    .line 830
    check-cast v2, Ltc/g;

    .line 831
    .line 832
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_6

    .line 833
    .line 834
    .line 835
    goto/16 :goto_10

    .line 836
    .line 837
    :catch_6
    move-exception v0

    .line 838
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v0

    .line 842
    move-object/from16 v2, p2

    .line 843
    .line 844
    check-cast v2, Ltc/g;

    .line 845
    .line 846
    invoke-virtual {v2, v3, v0, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 847
    .line 848
    .line 849
    goto :goto_10

    .line 850
    :pswitch_c
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 851
    .line 852
    const/16 v2, 0x21

    .line 853
    .line 854
    if-ge v0, v2, :cond_1c

    .line 855
    .line 856
    const-string v0, "Requires API level 33 or higher."

    .line 857
    .line 858
    move-object/from16 v2, p2

    .line 859
    .line 860
    check-cast v2, Ltc/g;

    .line 861
    .line 862
    invoke-virtual {v2, v3, v0, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 863
    .line 864
    .line 865
    goto :goto_10

    .line 866
    :cond_1c
    :try_start_6
    iget-object v0, v5, La2/v;->b:Ljava/lang/Object;

    .line 867
    .line 868
    check-cast v0, Lba/a;

    .line 869
    .line 870
    iget-object v2, v0, Lba/a;->b:Ljava/lang/Object;

    .line 871
    .line 872
    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 873
    .line 874
    iget-object v0, v0, Lba/a;->c:Ljava/lang/Object;

    .line 875
    .line 876
    check-cast v0, Lkc/r;

    .line 877
    .line 878
    invoke-static {v2, v0}, Lea/T;->u(Landroid/view/inputmethod/InputMethodManager;Lkc/r;)V

    .line 879
    .line 880
    .line 881
    move-object/from16 v0, p2

    .line 882
    .line 883
    check-cast v0, Ltc/g;

    .line 884
    .line 885
    invoke-virtual {v0, v4}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_7

    .line 886
    .line 887
    .line 888
    goto :goto_10

    .line 889
    :catch_7
    move-exception v0

    .line 890
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    move-object/from16 v2, p2

    .line 895
    .line 896
    check-cast v2, Ltc/g;

    .line 897
    .line 898
    invoke-virtual {v2, v3, v0, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 899
    .line 900
    .line 901
    goto :goto_10

    .line 902
    :pswitch_d
    :try_start_7
    iget-object v0, v5, La2/v;->b:Ljava/lang/Object;

    .line 903
    .line 904
    check-cast v0, Lba/a;

    .line 905
    .line 906
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 907
    .line 908
    if-lt v2, v6, :cond_1d

    .line 909
    .line 910
    iget-object v0, v0, Lba/a;->b:Ljava/lang/Object;

    .line 911
    .line 912
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 913
    .line 914
    invoke-static {v0}, Lh3/e;->s(Landroid/view/inputmethod/InputMethodManager;)Z

    .line 915
    .line 916
    .line 917
    move-result v0

    .line 918
    if-eqz v0, :cond_1e

    .line 919
    .line 920
    move v9, v10

    .line 921
    goto :goto_f

    .line 922
    :cond_1d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    .line 924
    .line 925
    :cond_1e
    :goto_f
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    move-object/from16 v2, p2

    .line 930
    .line 931
    check-cast v2, Ltc/g;

    .line 932
    .line 933
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_8

    .line 934
    .line 935
    .line 936
    goto :goto_10

    .line 937
    :catch_8
    move-exception v0

    .line 938
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    move-object/from16 v2, p2

    .line 943
    .line 944
    check-cast v2, Ltc/g;

    .line 945
    .line 946
    invoke-virtual {v2, v3, v0, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 947
    .line 948
    .line 949
    :goto_10
    return-void

    .line 950
    :pswitch_e
    invoke-direct/range {p0 .. p2}, Lcom/google/android/gms/ads/nativead/l;->k(Luc/o;Luc/q;)V

    .line 951
    .line 952
    .line 953
    return-void

    .line 954
    nop

    .line 955
    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_e
        :pswitch_a
    .end packed-switch

    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    :sswitch_data_0
    .sparse-switch
        -0x6a0a6d0c -> :sswitch_9
        -0x3c861a16 -> :sswitch_8
        -0x23d2364 -> :sswitch_7
        0x101f2613 -> :sswitch_6
        0x102423ce -> :sswitch_5
        0x26b1e570 -> :sswitch_4
        0x47cf0f0b -> :sswitch_3
        0x66f8a3d9 -> :sswitch_2
        0x71834287 -> :sswitch_1
        0x7df775f0 -> :sswitch_0
    .end sparse-switch

    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_9
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

    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    :sswitch_data_1
    .sparse-switch
        -0x2a11fcff -> :sswitch_c
        0x68dc8e5d -> :sswitch_b
        0x7e58a2bc -> :sswitch_a
    .end sparse-switch

    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch
.end method

.method public onUserEarnedReward(LR6/b;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lrb/j;

    .line 4
    .line 5
    iget-object p1, p1, Lrb/j;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;->onUserEarnedReward()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/ads/nativead/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "ContentInfoCompat{"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Landroid/view/ContentInfo;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "}"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public z(Lp/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/appcompat/widget/ActionMenuView;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->u:La2/c;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, La2/c;->z(Lp/k;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public zza(Landroid/widget/ImageView$ScaleType;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/gms/ads/nativead/NativeAdView;->b:Lcom/google/android/gms/internal/ads/zzbmp;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p1, :cond_1

    .line 11
    .line 12
    :try_start_0
    new-instance v1, Lq7/b;

    .line 13
    .line 14
    invoke-direct {v1, p1}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzbmp;->zzdC(Lq7/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception p1

    .line 22
    const-string v0, "Unable to call setMediaViewImageScaleType on delegate"

    .line 23
    .line 24
    invoke-static {v0, p1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method
