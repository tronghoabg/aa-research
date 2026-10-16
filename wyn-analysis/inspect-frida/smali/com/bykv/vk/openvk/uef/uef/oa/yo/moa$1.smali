.class Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;


# direct methods
.method public constructor <init>(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->sy()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    cmp-long v4, v0, v2

    .line 20
    .line 21
    if-lez v4, :cond_4

    .line 22
    .line 23
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 24
    .line 25
    invoke-virtual {v4}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->ivm()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_4

    .line 30
    .line 31
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 32
    .line 33
    invoke-static {v4}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->oa(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    const-wide/high16 v6, -0x8000000000000000L

    .line 38
    .line 39
    cmp-long v4, v4, v6

    .line 40
    .line 41
    if-eqz v4, :cond_4

    .line 42
    .line 43
    :try_start_0
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 44
    .line 45
    invoke-static {v4}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->oa(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v4

    .line 49
    cmp-long v4, v4, v0

    .line 50
    .line 51
    const/16 v5, 0x320

    .line 52
    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 56
    .line 57
    invoke-static {v4}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->yo(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-nez v4, :cond_1

    .line 62
    .line 63
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 64
    .line 65
    invoke-static {v4}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->moa(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)J

    .line 66
    .line 67
    .line 68
    move-result-wide v6

    .line 69
    const-wide/16 v8, 0x190

    .line 70
    .line 71
    cmp-long v4, v6, v8

    .line 72
    .line 73
    if-ltz v4, :cond_1

    .line 74
    .line 75
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 76
    .line 77
    const/16 v6, 0x2bd

    .line 78
    .line 79
    invoke-static {v4, v6, v5}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;II)V

    .line 80
    .line 81
    .line 82
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 83
    .line 84
    const/4 v5, 0x1

    .line 85
    invoke-static {v4, v5}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;Z)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_0
    move-exception v4

    .line 90
    goto :goto_1

    .line 91
    :cond_1
    :goto_0
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 92
    .line 93
    invoke-static {v4}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->moa(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v5

    .line 97
    iget-object v7, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 98
    .line 99
    invoke-static {v7}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->lw(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    int-to-long v7, v7

    .line 104
    add-long/2addr v5, v7

    .line 105
    invoke-static {v4, v5, v6}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;J)J

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_2
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 110
    .line 111
    invoke-static {v4}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->yo(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_3

    .line 116
    .line 117
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 118
    .line 119
    invoke-static {v4}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->ivm(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)J

    .line 120
    .line 121
    .line 122
    move-result-wide v6

    .line 123
    iget-object v8, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 124
    .line 125
    invoke-static {v8}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->moa(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)J

    .line 126
    .line 127
    .line 128
    move-result-wide v8

    .line 129
    add-long/2addr v6, v8

    .line 130
    invoke-static {v4, v6, v7}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->oa(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;J)J

    .line 131
    .line 132
    .line 133
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 134
    .line 135
    const/16 v6, 0x2be

    .line 136
    .line 137
    invoke-static {v4, v6, v5}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;II)V

    .line 138
    .line 139
    .line 140
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 141
    .line 142
    invoke-static {v4}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->ivm(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)J

    .line 143
    .line 144
    .line 145
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 146
    .line 147
    invoke-static {v4}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->xs(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)I

    .line 148
    .line 149
    .line 150
    :cond_3
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 151
    .line 152
    invoke-static {v4, v2, v3}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;J)J

    .line 153
    .line 154
    .line 155
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 156
    .line 157
    const/4 v5, 0x0

    .line 158
    invoke-static {v4, v5}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :goto_1
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    :cond_4
    :goto_2
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 166
    .line 167
    invoke-virtual {v4}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->bs()J

    .line 168
    .line 169
    .line 170
    move-result-wide v4

    .line 171
    cmp-long v2, v4, v2

    .line 172
    .line 173
    if-lez v2, :cond_7

    .line 174
    .line 175
    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 176
    .line 177
    invoke-static {v2}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->oa(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)J

    .line 178
    .line 179
    .line 180
    move-result-wide v2

    .line 181
    cmp-long v2, v2, v0

    .line 182
    .line 183
    if-eqz v2, :cond_6

    .line 184
    .line 185
    invoke-static {}, Lcom/bykv/vk/openvk/uef/uef/uef/yo;->moa()Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_5

    .line 190
    .line 191
    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 192
    .line 193
    invoke-static {v2}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->oa(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)J

    .line 194
    .line 195
    .line 196
    :cond_5
    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 197
    .line 198
    invoke-virtual {v2}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->bs()J

    .line 199
    .line 200
    .line 201
    move-result-wide v3

    .line 202
    invoke-static {v2, v0, v1, v3, v4}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;JJ)V

    .line 203
    .line 204
    .line 205
    :cond_6
    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 206
    .line 207
    invoke-static {v2, v0, v1}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->yo(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;J)J

    .line 208
    .line 209
    .line 210
    :cond_7
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 211
    .line 212
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->oa()Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-nez v0, :cond_8

    .line 217
    .line 218
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 219
    .line 220
    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->bcc(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)Lcom/bytedance/sdk/component/utils/ue;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    if-eqz v0, :cond_9

    .line 225
    .line 226
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 227
    .line 228
    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->bcc(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)Lcom/bytedance/sdk/component/utils/ue;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 233
    .line 234
    invoke-static {v1}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->lw(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)I

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    int-to-long v1, v1

    .line 239
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :cond_8
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 244
    .line 245
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->bs()J

    .line 246
    .line 247
    .line 248
    move-result-wide v1

    .line 249
    iget-object v3, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 250
    .line 251
    invoke-virtual {v3}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->bs()J

    .line 252
    .line 253
    .line 254
    move-result-wide v3

    .line 255
    invoke-static {v0, v1, v2, v3, v4}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;JJ)V

    .line 256
    .line 257
    .line 258
    :cond_9
    :goto_3
    return-void
.end method
