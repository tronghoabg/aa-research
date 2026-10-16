.class public final synthetic Lyc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyc/b;->a:I

    iput-object p2, p0, Lyc/b;->b:Ljava/lang/Object;

    iput-object p3, p0, Lyc/b;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lyc/b;->c:Ljava/lang/Object;

    .line 3
    .line 4
    iget-object v2, p0, Lyc/b;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iget v3, p0, Lyc/b;->a:I

    .line 7
    .line 8
    packed-switch v3, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v2, Lcom/vungle/ads/BidTokenCallback;

    .line 12
    .line 13
    invoke-static {v2, v1}, Lcom/vungle/ads/internal/z2;->a(Lcom/vungle/ads/BidTokenCallback;Lef/i;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    sget v3, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;->a:I

    .line 18
    .line 19
    check-cast v2, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;

    .line 20
    .line 21
    check-cast v1, Landroid/app/job/JobParameters;

    .line 22
    .line 23
    invoke-virtual {v2, v1, v0}, Landroid/app/job/JobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_1
    new-instance v0, La2/k;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v3, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v4, "dev.flutter.pigeon.camera_android.CameraEventApi.error"

    .line 35
    .line 36
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    check-cast v2, Lmd/J;

    .line 40
    .line 41
    iget-object v2, v2, Lmd/J;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, Lt6/q;

    .line 44
    .line 45
    iget-object v4, v2, Lt6/q;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    new-instance v4, LVa/X7;

    .line 57
    .line 58
    sget-object v5, Lyc/p;->d:Lyc/p;

    .line 59
    .line 60
    const/4 v6, 0x0

    .line 61
    iget-object v2, v2, Lt6/q;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Luc/f;

    .line 64
    .line 65
    invoke-direct {v4, v2, v5, v6, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance v2, Ljava/util/ArrayList;

    .line 69
    .line 70
    check-cast v1, Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 77
    .line 78
    .line 79
    new-instance v1, LJ9/y;

    .line 80
    .line 81
    const/4 v5, 0x7

    .line 82
    invoke-direct {v1, v0, v3, v5}, LJ9/y;-><init>(La2/k;Ljava/lang/String;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v2, v1}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_2
    check-cast v2, LPc/q;

    .line 90
    .line 91
    check-cast v1, Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v2, v1}, LPc/q;->a(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_3
    check-cast v2, Lyc/d;

    .line 98
    .line 99
    iget-object v2, v2, Lyc/d;->b:Lyc/g;

    .line 100
    .line 101
    iget-object v4, v2, Lyc/g;->h:Lmd/J;

    .line 102
    .line 103
    check-cast v1, LIc/a;

    .line 104
    .line 105
    iget-object v3, v1, LIc/a;->c:Landroid/util/Size;

    .line 106
    .line 107
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    iget-object v1, v1, LIc/a;->c:Landroid/util/Size;

    .line 116
    .line 117
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    iget-object v1, v2, Lyc/g;->a:LJ3/g;

    .line 126
    .line 127
    iget-object v1, v1, LJ3/g;->a:Ljava/util/HashMap;

    .line 128
    .line 129
    const-string v3, "EXPOSURE_LOCK"

    .line 130
    .line 131
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    check-cast v1, LBc/a;

    .line 136
    .line 137
    iget v9, v1, LBc/a;->b:I

    .line 138
    .line 139
    iget-object v1, v2, Lyc/g;->a:LJ3/g;

    .line 140
    .line 141
    iget-object v1, v1, LJ3/g;->a:Ljava/util/HashMap;

    .line 142
    .line 143
    const-string v3, "AUTO_FOCUS"

    .line 144
    .line 145
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    check-cast v1, LAc/a;

    .line 150
    .line 151
    iget v10, v1, LAc/a;->b:I

    .line 152
    .line 153
    iget-object v1, v2, Lyc/g;->a:LJ3/g;

    .line 154
    .line 155
    invoke-virtual {v1}, LJ3/g;->c()LDc/a;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    iget-object v1, v1, Lzc/a;->a:Lt6/q;

    .line 160
    .line 161
    iget-object v1, v1, Lt6/q;->a:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v1, Landroid/hardware/camera2/CameraCharacteristics;

    .line 164
    .line 165
    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 166
    .line 167
    invoke-virtual {v1, v3}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    check-cast v1, Ljava/lang/Integer;

    .line 172
    .line 173
    const/4 v3, 0x1

    .line 174
    if-eqz v1, :cond_0

    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-lez v1, :cond_0

    .line 181
    .line 182
    move v1, v3

    .line 183
    goto :goto_0

    .line 184
    :cond_0
    move v1, v0

    .line 185
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    iget-object v1, v2, Lyc/g;->a:LJ3/g;

    .line 190
    .line 191
    invoke-virtual {v1}, LJ3/g;->d()LFc/a;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    iget-object v1, v1, Lzc/a;->a:Lt6/q;

    .line 196
    .line 197
    iget-object v1, v1, Lt6/q;->a:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v1, Landroid/hardware/camera2/CameraCharacteristics;

    .line 200
    .line 201
    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AF:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 202
    .line 203
    invoke-virtual {v1, v2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    check-cast v1, Ljava/lang/Integer;

    .line 208
    .line 209
    if-eqz v1, :cond_1

    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-lez v1, :cond_1

    .line 216
    .line 217
    move v0, v3

    .line 218
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    new-instance v3, Lyc/k;

    .line 223
    .line 224
    invoke-direct/range {v3 .. v10}, Lyc/k;-><init>(Lmd/J;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;II)V

    .line 225
    .line 226
    .line 227
    iget-object v0, v4, Lmd/J;->a:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v0, Landroid/os/Handler;

    .line 230
    .line 231
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :pswitch_4
    check-cast v1, LCc/a;

    .line 236
    .line 237
    iget-wide v0, v1, LCc/a;->b:D

    .line 238
    .line 239
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    check-cast v2, LPc/o;

    .line 244
    .line 245
    invoke-virtual {v2, v0}, LPc/o;->a(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    return-void

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
