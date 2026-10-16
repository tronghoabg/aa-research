.class public final LF6/j;
.super LG6/p;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LF6/l;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LF6/j;->a:I

    .line 1
    iput-object p1, p0, LF6/j;->b:Ljava/lang/Object;

    invoke-direct {p0}, LG6/p;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LF6/j;->a:I

    .line 2
    invoke-direct {p0}, LG6/p;-><init>()V

    iput-object p1, p0, LF6/j;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iget v1, p0, LF6/j;->a:I

    .line 3
    .line 4
    packed-switch v1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :try_start_0
    iget-object v1, p0, LF6/j;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {v1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getIsAdIdFakeForDebugLogging(Landroid/content/Context;)Z

    .line 12
    .line 13
    .line 14
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ld7/g; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ld7/h; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    goto :goto_1

    .line 16
    :catch_0
    move-exception v1

    .line 17
    goto :goto_0

    .line 18
    :catch_1
    move-exception v1

    .line 19
    goto :goto_0

    .line 20
    :catch_2
    move-exception v1

    .line 21
    goto :goto_0

    .line 22
    :catch_3
    move-exception v1

    .line 23
    :goto_0
    sget v2, LG6/L;->b:I

    .line 24
    .line 25
    const-string v2, "Fail to get isAdIdFakeForDebugLogging"

    .line 26
    .line 27
    invoke-static {v2, v1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    :goto_1
    sget-object v1, LH6/i;->b:Ljava/lang/Object;

    .line 31
    .line 32
    monitor-enter v1

    .line 33
    const/4 v2, 0x1

    .line 34
    :try_start_1
    sput-boolean v2, LH6/i;->c:Z

    .line 35
    .line 36
    sput-boolean v0, LH6/i;->d:Z

    .line 37
    .line 38
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x26

    .line 50
    .line 51
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 52
    .line 53
    .line 54
    const-string v1, "Update ad debug logging enablement as "

    .line 55
    .line 56
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sget v1, LG6/L;->b:I

    .line 67
    .line 68
    invoke-static {v0}, LH6/l;->f(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    throw v0

    .line 75
    :pswitch_0
    sget-object v1, LC6/n;->D:LC6/n;

    .line 76
    .line 77
    iget-object v1, v1, LC6/n;->x:LY9/c;

    .line 78
    .line 79
    iget-object v2, p0, LF6/j;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, LF6/l;

    .line 82
    .line 83
    iget-object v3, v2, LF6/l;->b:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 84
    .line 85
    iget-object v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->o:LC6/g;

    .line 86
    .line 87
    iget v3, v3, LC6/g;->f:I

    .line 88
    .line 89
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    iget-object v1, v1, LY9/c;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, Lj$/util/concurrent/ConcurrentHashMap;

    .line 96
    .line 97
    invoke-virtual {v1, v3}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Landroid/graphics/Bitmap;

    .line 102
    .line 103
    if-eqz v1, :cond_2

    .line 104
    .line 105
    iget-object v3, v2, LF6/l;->b:Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 106
    .line 107
    iget-object v3, v3, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;->o:LC6/g;

    .line 108
    .line 109
    iget-boolean v4, v3, LC6/g;->d:Z

    .line 110
    .line 111
    iget-object v2, v2, LF6/l;->a:Landroid/app/Activity;

    .line 112
    .line 113
    if-eqz v4, :cond_1

    .line 114
    .line 115
    iget v3, v3, LC6/g;->e:F

    .line 116
    .line 117
    const/4 v4, 0x0

    .line 118
    cmpg-float v4, v3, v4

    .line 119
    .line 120
    if-lez v4, :cond_1

    .line 121
    .line 122
    const/high16 v4, 0x41c80000    # 25.0f

    .line 123
    .line 124
    cmpl-float v4, v3, v4

    .line 125
    .line 126
    if-lez v4, :cond_0

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_0
    :try_start_3
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    invoke-static {v1, v4, v5, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-static {v4}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    invoke-static {v2}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-static {v6}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    invoke-static {v6, v7}, Landroid/renderscript/ScriptIntrinsicBlur;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicBlur;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-static {v6, v4}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;)Landroid/renderscript/Allocation;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-static {v6, v5}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;)Landroid/renderscript/Allocation;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-virtual {v7, v3}, Landroid/renderscript/ScriptIntrinsicBlur;->setRadius(F)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v7, v4}, Landroid/renderscript/ScriptIntrinsicBlur;->setInput(Landroid/renderscript/Allocation;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7, v6}, Landroid/renderscript/ScriptIntrinsicBlur;->forEach(Landroid/renderscript/Allocation;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v6, v5}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V

    .line 175
    .line 176
    .line 177
    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    .line 178
    .line 179
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-direct {v3, v4, v5}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :catch_4
    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    .line 188
    .line 189
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-direct {v3, v2, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_1
    :goto_2
    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    .line 198
    .line 199
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-direct {v3, v2, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 204
    .line 205
    .line 206
    :goto_3
    sget-object v1, LG6/U;->l:LG6/M;

    .line 207
    .line 208
    new-instance v2, LA7/p;

    .line 209
    .line 210
    const/16 v4, 0x11

    .line 211
    .line 212
    invoke-direct {v2, p0, v0, v3, v4}, LA7/p;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 216
    .line 217
    .line 218
    :cond_2
    return-void

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
