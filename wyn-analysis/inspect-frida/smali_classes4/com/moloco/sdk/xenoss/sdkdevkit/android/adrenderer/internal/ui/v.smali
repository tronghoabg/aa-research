.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic a:Ltf/a;

.field public final synthetic b:Z

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:J


# direct methods
.method public constructor <init>(Ltf/a;ZJJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/v;->a:Ltf/a;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/v;->b:Z

    .line 7
    .line 8
    iput-wide p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/v;->c:J

    .line 9
    .line 10
    iput-wide p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/v;->d:J

    .line 11
    .line 12
    iput-wide p7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/v;->e:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/z;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, LN/o;

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    check-cast v3, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const-string v4, "buttonPart"

    .line 20
    .line 21
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    and-int/lit8 v4, v3, 0x6

    .line 25
    .line 26
    if-nez v4, :cond_1

    .line 27
    .line 28
    invoke-virtual {v2, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    const/4 v4, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v4, 0x2

    .line 37
    :goto_0
    or-int/2addr v3, v4

    .line 38
    :cond_1
    and-int/lit8 v3, v3, 0x13

    .line 39
    .line 40
    const/16 v4, 0x12

    .line 41
    .line 42
    if-ne v3, v4, :cond_3

    .line 43
    .line 44
    invoke-virtual {v2}, LN/o;->x()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-virtual {v2}, LN/o;->I()V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_2

    .line 55
    .line 56
    :cond_3
    :goto_1
    sget-object v3, LK/M;->a:LN/L0;

    .line 57
    .line 58
    invoke-virtual {v2, v3}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, LK/L;

    .line 63
    .line 64
    iget-object v3, v3, LK/L;->f:Lz0/p;

    .line 65
    .line 66
    instance-of v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/w;

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    const v1, 0x3b9edb0a

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v1}, LN/o;->M(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v4}, LN/o;->p(Z)V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_2

    .line 81
    .line 82
    :cond_4
    instance-of v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/x;

    .line 83
    .line 84
    if-eqz v3, :cond_5

    .line 85
    .line 86
    const v3, 0x3ba4136e

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v3}, LN/o;->M(I)V

    .line 90
    .line 91
    .line 92
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/x;

    .line 93
    .line 94
    iget-object v6, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/x;->b:Ljava/lang/String;

    .line 95
    .line 96
    const/16 v17, 0x0

    .line 97
    .line 98
    const/16 v18, 0x4

    .line 99
    .line 100
    move-object/from16 v16, v2

    .line 101
    .line 102
    iget-object v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/x;->a:Lh0/c;

    .line 103
    .line 104
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/v;->a:Ltf/a;

    .line 105
    .line 106
    move v5, v4

    .line 107
    move v7, v5

    .line 108
    iget-boolean v5, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/v;->b:Z

    .line 109
    .line 110
    move v9, v7

    .line 111
    iget-wide v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/v;->c:J

    .line 112
    .line 113
    move v11, v9

    .line 114
    iget-wide v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/v;->d:J

    .line 115
    .line 116
    move v13, v11

    .line 117
    iget-wide v11, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/x;->c:J

    .line 118
    .line 119
    move v14, v13

    .line 120
    iget-object v13, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/x;->d:Le0/E;

    .line 121
    .line 122
    move v15, v5

    .line 123
    iget-wide v4, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/x;->e:J

    .line 124
    .line 125
    move v1, v14

    .line 126
    move-wide/from16 v21, v4

    .line 127
    .line 128
    move v5, v15

    .line 129
    move-wide/from16 v14, v21

    .line 130
    .line 131
    const/4 v4, 0x0

    .line 132
    invoke-static/range {v2 .. v18}, LFe/b;->a(Lh0/c;Ltf/a;LZ/k;ZLjava/lang/String;JJJLe0/E;JLN/o;II)V

    .line 133
    .line 134
    .line 135
    move-object/from16 v2, v16

    .line 136
    .line 137
    invoke-virtual {v2, v1}, LN/o;->p(Z)V

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_5
    move v13, v4

    .line 142
    instance-of v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/y;

    .line 143
    .line 144
    if-eqz v3, :cond_7

    .line 145
    .line 146
    const v3, 0x3bb757b3

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v3}, LN/o;->M(I)V

    .line 150
    .line 151
    .line 152
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/y;

    .line 153
    .line 154
    sget-wide v3, LL0/j;->c:J

    .line 155
    .line 156
    iget-wide v5, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/y;->j:J

    .line 157
    .line 158
    invoke-static {v5, v6, v3, v4}, LL0/j;->a(JJ)Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_6

    .line 163
    .line 164
    iget-wide v5, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/v;->e:J

    .line 165
    .line 166
    :cond_6
    move-wide/from16 v16, v5

    .line 167
    .line 168
    const/16 v3, 0x78

    .line 169
    .line 170
    int-to-float v3, v3

    .line 171
    const/16 v4, 0x14

    .line 172
    .line 173
    int-to-float v4, v4

    .line 174
    invoke-static {v3, v4}, LA6/c;->b(FF)J

    .line 175
    .line 176
    .line 177
    move-result-wide v10

    .line 178
    move-object/from16 v19, v2

    .line 179
    .line 180
    iget-object v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/y;->a:Ljava/lang/String;

    .line 181
    .line 182
    iget-object v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/y;->b:Lh0/c;

    .line 183
    .line 184
    iget-object v4, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/y;->c:Ljava/lang/String;

    .line 185
    .line 186
    iget-boolean v14, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/y;->g:Z

    .line 187
    .line 188
    iget-boolean v15, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/y;->h:Z

    .line 189
    .line 190
    iget-wide v5, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/y;->d:J

    .line 191
    .line 192
    iget-object v7, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/y;->e:Le0/E;

    .line 193
    .line 194
    iget-wide v8, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/y;->f:J

    .line 195
    .line 196
    move v12, v14

    .line 197
    iget-wide v13, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/y;->i:J

    .line 198
    .line 199
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/v;->a:Ltf/a;

    .line 200
    .line 201
    const/high16 v20, 0x180000

    .line 202
    .line 203
    move-wide/from16 v21, v13

    .line 204
    .line 205
    move v14, v12

    .line 206
    move-wide/from16 v12, v21

    .line 207
    .line 208
    move-object/from16 v18, v1

    .line 209
    .line 210
    const/4 v1, 0x0

    .line 211
    invoke-static/range {v2 .. v20}, LU8/v0;->h(Ljava/lang/String;Lh0/c;Ljava/lang/String;JLe0/E;JJJZZJLtf/a;LN/o;I)V

    .line 212
    .line 213
    .line 214
    move-object/from16 v2, v19

    .line 215
    .line 216
    invoke-virtual {v2, v1}, LN/o;->p(Z)V

    .line 217
    .line 218
    .line 219
    :goto_2
    sget-object v1, Lef/C;->a:Lef/C;

    .line 220
    .line 221
    return-object v1

    .line 222
    :cond_7
    move v1, v13

    .line 223
    const v3, -0x58ea5c1c

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v3}, LN/o;->M(I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v1}, LN/o;->p(Z)V

    .line 230
    .line 231
    .line 232
    new-instance v1, LE5/Q;

    .line 233
    .line 234
    const/16 v2, 0x9

    .line 235
    .line 236
    const/4 v3, 0x0

    .line 237
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 238
    .line 239
    .line 240
    throw v1
.end method
