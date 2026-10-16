.class public final LNb/b;
.super Landroid/location/GnssStatus$Callback;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LNb/b;->a:I

    iput-object p1, p0, LNb/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/location/GnssStatus$Callback;-><init>()V

    return-void
.end method

.method private final a(I)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b()V
    .locals 0

    .line 1
    return-void
.end method

.method private final c()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public onFirstFix(I)V
    .locals 1

    .line 1
    iget v0, p0, LNb/b;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/location/GnssStatus$Callback;->onFirstFix(I)V

    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onSatelliteStatusChanged(Landroid/location/GnssStatus;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, v0, LNb/b;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iget v5, v0, LNb/b;->a:I

    .line 10
    .line 11
    packed-switch v5, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v5, v4

    .line 15
    check-cast v5, Lx4/k;

    .line 16
    .line 17
    invoke-static {v1}, Lu6/u;->a(Landroid/location/GnssStatus;)I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    int-to-double v6, v6

    .line 22
    iput-wide v6, v5, Lx4/k;->g:D

    .line 23
    .line 24
    move-object v5, v4

    .line 25
    check-cast v5, Lx4/k;

    .line 26
    .line 27
    const-wide/16 v6, 0x0

    .line 28
    .line 29
    iput-wide v6, v5, Lx4/k;->h:D

    .line 30
    .line 31
    :goto_0
    int-to-double v5, v3

    .line 32
    move-object v7, v4

    .line 33
    check-cast v7, Lx4/k;

    .line 34
    .line 35
    iget-wide v7, v7, Lx4/k;->g:D

    .line 36
    .line 37
    cmpg-double v5, v5, v7

    .line 38
    .line 39
    if-gez v5, :cond_1

    .line 40
    .line 41
    invoke-static {v1, v3}, Lu6/u;->n(Landroid/location/GnssStatus;I)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_0

    .line 46
    .line 47
    move-object v5, v4

    .line 48
    check-cast v5, Lx4/k;

    .line 49
    .line 50
    iget-wide v6, v5, Lx4/k;->h:D

    .line 51
    .line 52
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 53
    .line 54
    add-double/2addr v6, v8

    .line 55
    iput-wide v6, v5, Lx4/k;->h:D

    .line 56
    .line 57
    :cond_0
    add-int/2addr v3, v2

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    return-void

    .line 60
    :pswitch_0
    const-string v5, "status"

    .line 61
    .line 62
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    new-instance v5, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-static {v1}, Lu6/u;->a(Landroid/location/GnssStatus;)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    move v7, v3

    .line 75
    :goto_1
    if-ge v7, v6, :cond_3

    .line 76
    .line 77
    invoke-static {v1, v7}, Lu6/u;->n(Landroid/location/GnssStatus;I)Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    new-instance v9, Lef/k;

    .line 86
    .line 87
    const-string v10, "usedInFix"

    .line 88
    .line 89
    invoke-direct {v9, v10, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v1, v7}, LA7/O0;->a(Landroid/location/GnssStatus;I)F

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    new-instance v10, Lef/k;

    .line 101
    .line 102
    const-string v11, "azimuthDegrees"

    .line 103
    .line 104
    invoke-direct {v10, v11, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 108
    .line 109
    const/16 v11, 0x1a

    .line 110
    .line 111
    if-lt v8, v11, :cond_2

    .line 112
    .line 113
    invoke-static {v1, v7}, LA0/h;->a(Landroid/location/GnssStatus;I)F

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    goto :goto_2

    .line 118
    :cond_2
    const/4 v8, 0x0

    .line 119
    :goto_2
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    new-instance v11, Lef/k;

    .line 124
    .line 125
    const-string v12, "carrierFrequencyHz"

    .line 126
    .line 127
    invoke-direct {v11, v12, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v1, v7}, LA7/O0;->z(Landroid/location/GnssStatus;I)F

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    new-instance v12, Lef/k;

    .line 139
    .line 140
    const-string v13, "cn0DbHz"

    .line 141
    .line 142
    invoke-direct {v12, v13, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v1, v7}, LA7/O0;->b(Landroid/location/GnssStatus;I)I

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    new-instance v13, Lef/k;

    .line 154
    .line 155
    const-string v14, "constellationType"

    .line 156
    .line 157
    invoke-direct {v13, v14, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v1, v7}, LA7/O0;->D(Landroid/location/GnssStatus;I)F

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    new-instance v14, Lef/k;

    .line 169
    .line 170
    const-string v15, "elevationDegrees"

    .line 171
    .line 172
    invoke-direct {v14, v15, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-static {v1, v7}, LA7/O0;->A(Landroid/location/GnssStatus;I)I

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    new-instance v15, Lef/k;

    .line 184
    .line 185
    move/from16 v16, v2

    .line 186
    .line 187
    const-string v2, "svid"

    .line 188
    .line 189
    invoke-direct {v15, v2, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    const/4 v2, 0x7

    .line 193
    new-array v2, v2, [Lef/k;

    .line 194
    .line 195
    aput-object v9, v2, v3

    .line 196
    .line 197
    aput-object v10, v2, v16

    .line 198
    .line 199
    const/4 v8, 0x2

    .line 200
    aput-object v11, v2, v8

    .line 201
    .line 202
    const/4 v8, 0x3

    .line 203
    aput-object v12, v2, v8

    .line 204
    .line 205
    const/4 v8, 0x4

    .line 206
    aput-object v13, v2, v8

    .line 207
    .line 208
    const/4 v8, 0x5

    .line 209
    aput-object v14, v2, v8

    .line 210
    .line 211
    const/4 v8, 0x6

    .line 212
    aput-object v15, v2, v8

    .line 213
    .line 214
    invoke-static {v2}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    add-int/lit8 v7, v7, 0x1

    .line 222
    .line 223
    move/from16 v2, v16

    .line 224
    .line 225
    goto/16 :goto_1

    .line 226
    .line 227
    :cond_3
    check-cast v4, Lcom/wynauto/wyn/MainActivity;

    .line 228
    .line 229
    iget-object v1, v4, Lcom/wynauto/wyn/MainActivity;->h:Luc/r;

    .line 230
    .line 231
    const/4 v2, 0x0

    .line 232
    if-eqz v1, :cond_4

    .line 233
    .line 234
    const-string v3, "gnssStatusChanged"

    .line 235
    .line 236
    invoke-virtual {v1, v3, v5, v2}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :cond_4
    const-string v1, "channel"

    .line 241
    .line 242
    invoke-static {v1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw v2

    .line 246
    nop

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onStarted()V
    .locals 1

    .line 1
    iget v0, p0, LNb/b;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Landroid/location/GnssStatus$Callback;->onStarted()V

    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onStopped()V
    .locals 1

    .line 1
    iget v0, p0, LNb/b;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Landroid/location/GnssStatus$Callback;->onStopped()V

    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
