.class public final LH5/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:J

.field public m:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LH5/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "\n}"

    .line 4
    .line 5
    const-string v2, "\n videoFrameProcessingOffsetCount="

    .line 6
    .line 7
    const-string v3, "\n totalVideoFrameProcessingOffsetUs="

    .line 8
    .line 9
    const-string v4, "\n droppedToKeyframeEvents="

    .line 10
    .line 11
    const-string v5, "\n maxConsecutiveDroppedBuffers="

    .line 12
    .line 13
    const-string v6, "\n droppedInputBuffers="

    .line 14
    .line 15
    const-string v7, "\n droppedBuffers="

    .line 16
    .line 17
    const-string v8, "\n skippedOutputBuffers="

    .line 18
    .line 19
    const-string v9, "\n renderedOutputBuffers="

    .line 20
    .line 21
    const-string v10, "\n skippedInputBuffers="

    .line 22
    .line 23
    const-string v11, "\n queuedInputBuffers="

    .line 24
    .line 25
    const-string v12, ",\n decoderReleases="

    .line 26
    .line 27
    const-string v13, "DecoderCounters {\n decoderInits="

    .line 28
    .line 29
    iget v14, v0, LH5/e;->a:I

    .line 30
    .line 31
    packed-switch v14, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    iget v14, v0, LH5/e;->b:I

    .line 35
    .line 36
    iget v15, v0, LH5/e;->c:I

    .line 37
    .line 38
    move-object/from16 v16, v1

    .line 39
    .line 40
    iget v1, v0, LH5/e;->d:I

    .line 41
    .line 42
    move-object/from16 v17, v2

    .line 43
    .line 44
    iget v2, v0, LH5/e;->e:I

    .line 45
    .line 46
    move-object/from16 v18, v3

    .line 47
    .line 48
    iget v3, v0, LH5/e;->f:I

    .line 49
    .line 50
    move-object/from16 v19, v4

    .line 51
    .line 52
    iget v4, v0, LH5/e;->g:I

    .line 53
    .line 54
    move-object/from16 v20, v5

    .line 55
    .line 56
    iget v5, v0, LH5/e;->h:I

    .line 57
    .line 58
    move/from16 v21, v5

    .line 59
    .line 60
    iget v5, v0, LH5/e;->i:I

    .line 61
    .line 62
    move/from16 v22, v5

    .line 63
    .line 64
    iget v5, v0, LH5/e;->j:I

    .line 65
    .line 66
    move/from16 v23, v5

    .line 67
    .line 68
    iget v5, v0, LH5/e;->k:I

    .line 69
    .line 70
    move/from16 v25, v5

    .line 71
    .line 72
    move-object/from16 v24, v6

    .line 73
    .line 74
    iget-wide v5, v0, LH5/e;->l:J

    .line 75
    .line 76
    move-wide/from16 v26, v5

    .line 77
    .line 78
    iget v5, v0, LH5/e;->m:I

    .line 79
    .line 80
    sget v6, LQ1/x;->a:I

    .line 81
    .line 82
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 83
    .line 84
    invoke-static {v13, v14, v12, v15, v11}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-static {v1, v2, v10, v9, v6}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v3, v4, v8, v7, v6}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 92
    .line 93
    .line 94
    move-object/from16 v4, v20

    .line 95
    .line 96
    move/from16 v1, v21

    .line 97
    .line 98
    move/from16 v2, v22

    .line 99
    .line 100
    move-object/from16 v3, v24

    .line 101
    .line 102
    invoke-static {v1, v2, v3, v4, v6}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 103
    .line 104
    .line 105
    move-object/from16 v15, v18

    .line 106
    .line 107
    move-object/from16 v14, v19

    .line 108
    .line 109
    move/from16 v1, v23

    .line 110
    .line 111
    move/from16 v2, v25

    .line 112
    .line 113
    invoke-static {v1, v2, v14, v15, v6}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 114
    .line 115
    .line 116
    move-wide/from16 v1, v26

    .line 117
    .line 118
    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    move-object/from16 v1, v17

    .line 122
    .line 123
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    move-object/from16 v2, v16

    .line 130
    .line 131
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    return-object v1

    .line 139
    :pswitch_0
    move-object v14, v2

    .line 140
    move-object v2, v1

    .line 141
    move-object v1, v14

    .line 142
    move-object v15, v3

    .line 143
    move-object v14, v4

    .line 144
    move-object v4, v5

    .line 145
    move-object v3, v6

    .line 146
    iget v5, v0, LH5/e;->b:I

    .line 147
    .line 148
    iget v6, v0, LH5/e;->c:I

    .line 149
    .line 150
    move-object/from16 v16, v2

    .line 151
    .line 152
    iget v2, v0, LH5/e;->d:I

    .line 153
    .line 154
    move-object/from16 v17, v1

    .line 155
    .line 156
    iget v1, v0, LH5/e;->e:I

    .line 157
    .line 158
    move-object/from16 v19, v14

    .line 159
    .line 160
    iget v14, v0, LH5/e;->f:I

    .line 161
    .line 162
    move-object/from16 v18, v15

    .line 163
    .line 164
    iget v15, v0, LH5/e;->g:I

    .line 165
    .line 166
    move-object/from16 v24, v3

    .line 167
    .line 168
    iget v3, v0, LH5/e;->h:I

    .line 169
    .line 170
    move/from16 v20, v3

    .line 171
    .line 172
    iget v3, v0, LH5/e;->i:I

    .line 173
    .line 174
    move/from16 v21, v3

    .line 175
    .line 176
    iget v3, v0, LH5/e;->j:I

    .line 177
    .line 178
    move/from16 v22, v3

    .line 179
    .line 180
    iget v3, v0, LH5/e;->k:I

    .line 181
    .line 182
    move/from16 v25, v3

    .line 183
    .line 184
    move-object/from16 v23, v4

    .line 185
    .line 186
    iget-wide v3, v0, LH5/e;->l:J

    .line 187
    .line 188
    move-wide/from16 v26, v3

    .line 189
    .line 190
    iget v3, v0, LH5/e;->m:I

    .line 191
    .line 192
    sget v4, Lu6/v;->a:I

    .line 193
    .line 194
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 195
    .line 196
    invoke-static {v13, v5, v12, v6, v11}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-static {v2, v1, v10, v9, v4}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v14, v15, v8, v7, v4}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 204
    .line 205
    .line 206
    move/from16 v1, v20

    .line 207
    .line 208
    move/from16 v2, v21

    .line 209
    .line 210
    move-object/from16 v6, v23

    .line 211
    .line 212
    move-object/from16 v5, v24

    .line 213
    .line 214
    invoke-static {v1, v2, v5, v6, v4}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 215
    .line 216
    .line 217
    move-object/from16 v15, v18

    .line 218
    .line 219
    move-object/from16 v14, v19

    .line 220
    .line 221
    move/from16 v1, v22

    .line 222
    .line 223
    move/from16 v2, v25

    .line 224
    .line 225
    invoke-static {v1, v2, v14, v15, v4}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 226
    .line 227
    .line 228
    move-wide/from16 v1, v26

    .line 229
    .line 230
    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    move-object/from16 v1, v17

    .line 234
    .line 235
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    move-object/from16 v2, v16

    .line 242
    .line 243
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    return-object v1

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
