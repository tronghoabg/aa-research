.class public final LE5/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LVa/ka;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE5/m;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, LVa/ka;

    .line 7
    .line 8
    const/16 v0, 0x1b

    .line 9
    .line 10
    invoke-direct {p1, v0}, LVa/ka;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LE5/m;->b:LVa/ka;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Handler;LE5/F;LE5/F;LE5/F;LE5/F;)[LE5/f;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lv6/f;

    .line 7
    .line 8
    iget-object v4, p0, LE5/m;->b:LVa/ka;

    .line 9
    .line 10
    iget-object v2, p0, LE5/m;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-direct {v1, v2, v4, p1, p2}, Lv6/f;-><init>(Landroid/content/Context;LV5/j;Landroid/os/Handler;LE5/F;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    new-instance p2, LDd/c;

    .line 19
    .line 20
    const/4 v1, 0x5

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {p2, v1, v3}, LDd/c;-><init>(IZ)V

    .line 23
    .line 24
    .line 25
    sget-object v1, LG5/j;->c:LG5/j;

    .line 26
    .line 27
    iput-object v1, p2, LDd/c;->b:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v3, LG5/H;->a:LG5/H;

    .line 30
    .line 31
    iput-object v3, p2, LDd/c;->d:Ljava/lang/Object;

    .line 32
    .line 33
    new-instance v3, Landroid/content/IntentFilter;

    .line 34
    .line 35
    const-string v5, "android.media.action.HDMI_AUDIO_PLUG"

    .line 36
    .line 37
    invoke-direct {v3, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v5, 0x0

    .line 41
    invoke-static {v2, v5, v3}, Lu6/v;->C(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    sget v5, Lu6/v;->a:I

    .line 46
    .line 47
    const/16 v6, 0x11

    .line 48
    .line 49
    const/4 v8, 0x0

    .line 50
    if-lt v5, v6, :cond_1

    .line 51
    .line 52
    sget-object v6, Lu6/v;->c:Ljava/lang/String;

    .line 53
    .line 54
    const-string v7, "Amazon"

    .line 55
    .line 56
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-nez v7, :cond_0

    .line 61
    .line 62
    const-string v7, "Xiaomi"

    .line 63
    .line 64
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_1

    .line 69
    .line 70
    :cond_0
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    const-string v7, "external_surround_sound_enabled"

    .line 75
    .line 76
    invoke-static {v6, v7, v8}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    const/4 v7, 0x1

    .line 81
    if-ne v6, v7, :cond_1

    .line 82
    .line 83
    sget-object v1, LG5/j;->d:LG5/j;

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    const/16 v6, 0x1d

    .line 87
    .line 88
    const/16 v7, 0x8

    .line 89
    .line 90
    if-lt v5, v6, :cond_3

    .line 91
    .line 92
    invoke-static {v2}, Lu6/v;->x(Landroid/content/Context;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-nez v6, :cond_2

    .line 97
    .line 98
    const/16 v6, 0x17

    .line 99
    .line 100
    if-lt v5, v6, :cond_3

    .line 101
    .line 102
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    const-string v5, "android.hardware.type.automotive"

    .line 107
    .line 108
    invoke-virtual {v2, v5}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_3

    .line 113
    .line 114
    :cond_2
    new-instance v1, LG5/j;

    .line 115
    .line 116
    invoke-static {}, LG5/i;->a()[I

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-direct {v1, v7, v2}, LG5/j;-><init>(I[I)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_3
    if-eqz v3, :cond_5

    .line 125
    .line 126
    const-string v2, "android.media.extra.AUDIO_PLUG_STATE"

    .line 127
    .line 128
    invoke-virtual {v3, v2, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-nez v2, :cond_4

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_4
    new-instance v1, LG5/j;

    .line 136
    .line 137
    const-string v2, "android.media.extra.ENCODINGS"

    .line 138
    .line 139
    invoke-virtual {v3, v2}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    const-string v5, "android.media.extra.MAX_CHANNEL_COUNT"

    .line 144
    .line 145
    invoke-virtual {v3, v5, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    invoke-direct {v1, v3, v2}, LG5/j;-><init>(I[I)V

    .line 150
    .line 151
    .line 152
    :cond_5
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iput-object v1, p2, LDd/c;->b:Ljava/lang/Object;

    .line 156
    .line 157
    iget-object v1, p2, LDd/c;->c:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v1, LG9/e;

    .line 160
    .line 161
    if-nez v1, :cond_6

    .line 162
    .line 163
    new-instance v1, LG9/e;

    .line 164
    .line 165
    new-array v2, v8, [LG5/m;

    .line 166
    .line 167
    invoke-direct {v1, v2}, LG9/e;-><init>([LG5/m;)V

    .line 168
    .line 169
    .line 170
    iput-object v1, p2, LDd/c;->c:Ljava/lang/Object;

    .line 171
    .line 172
    :cond_6
    new-instance v7, LG5/G;

    .line 173
    .line 174
    invoke-direct {v7, p2}, LG5/G;-><init>(LDd/c;)V

    .line 175
    .line 176
    .line 177
    new-instance v2, LG5/K;

    .line 178
    .line 179
    iget-object v3, p0, LE5/m;->a:Landroid/content/Context;

    .line 180
    .line 181
    move-object v5, p1

    .line 182
    move-object v6, p3

    .line 183
    invoke-direct/range {v2 .. v7}, LG5/K;-><init>(Landroid/content/Context;LV5/j;Landroid/os/Handler;LE5/F;LG5/G;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    new-instance p2, Lh6/k;

    .line 194
    .line 195
    invoke-direct {p2, p4, p1}, Lh6/k;-><init>(LE5/F;Landroid/os/Looper;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    invoke-virtual {v5}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    new-instance p2, LW5/f;

    .line 206
    .line 207
    invoke-direct {p2, p5, p1}, LW5/f;-><init>(LE5/F;Landroid/os/Looper;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    new-instance p1, Lw6/b;

    .line 214
    .line 215
    invoke-direct {p1}, Lw6/b;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    new-array p1, v8, [LE5/f;

    .line 222
    .line 223
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    check-cast p1, [LE5/f;

    .line 228
    .line 229
    return-object p1
.end method
