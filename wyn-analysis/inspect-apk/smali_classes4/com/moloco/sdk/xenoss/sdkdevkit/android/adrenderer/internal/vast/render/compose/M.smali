.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lh0/c;

.field public final synthetic c:Lh0/c;

.field public final synthetic d:LN/V;

.field public final synthetic e:Ltf/p;

.field public final synthetic f:Ltf/l;

.field public final synthetic g:Z

.field public final synthetic h:J

.field public final synthetic i:J

.field public final synthetic j:J

.field public final synthetic k:Le0/E;

.field public final synthetic l:J


# direct methods
.method public constructor <init>(ZLh0/c;Lh0/c;LN/V;Ltf/p;Ltf/l;ZJJJLe0/E;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->b:Lh0/c;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->c:Lh0/c;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->d:LN/V;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->e:Ltf/p;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->f:Ltf/l;

    .line 15
    .line 16
    iput-boolean p7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->g:Z

    .line 17
    .line 18
    iput-wide p8, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->h:J

    .line 19
    .line 20
    iput-wide p10, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->i:J

    .line 21
    .line 22
    iput-wide p12, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->j:J

    .line 23
    .line 24
    iput-object p14, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->k:Le0/E;

    .line 25
    .line 26
    move-wide p1, p15

    .line 27
    iput-wide p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->l:J

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lz/d;

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
    const-string v3, "$this$AnimatedVisibility"

    .line 19
    .line 20
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-boolean v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->a:Z

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->b:Lh0/c;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->c:Lh0/c;

    .line 31
    .line 32
    :goto_0
    sget-object v4, LZ/i;->a:LZ/i;

    .line 33
    .line 34
    iget-object v5, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->d:LN/V;

    .line 35
    .line 36
    invoke-interface {v5}, LN/K0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    check-cast v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;

    .line 41
    .line 42
    const v7, -0x7f0510b

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v7}, LN/o;->M(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v5}, LN/o;->e(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    iget-object v8, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->e:Ltf/p;

    .line 53
    .line 54
    invoke-virtual {v2, v8}, LN/o;->e(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    or-int/2addr v7, v9

    .line 59
    invoke-virtual {v2, v1}, LN/o;->f(Z)Z

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    or-int/2addr v7, v9

    .line 64
    invoke-virtual {v2}, LN/o;->F()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    sget-object v10, LN/k;->a:LN/P;

    .line 69
    .line 70
    if-nez v7, :cond_1

    .line 71
    .line 72
    if-ne v9, v10, :cond_2

    .line 73
    .line 74
    :cond_1
    new-instance v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/L;

    .line 75
    .line 76
    const/4 v7, 0x0

    .line 77
    invoke-direct {v9, v8, v1, v5, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/L;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v9}, LN/o;->U(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    check-cast v9, Ltf/l;

    .line 84
    .line 85
    const/4 v7, 0x0

    .line 86
    invoke-virtual {v2, v7}, LN/o;->p(Z)V

    .line 87
    .line 88
    .line 89
    const-string v11, "savedStateButton"

    .line 90
    .line 91
    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const-string v11, "updateButtonState"

    .line 95
    .line 96
    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    new-instance v11, LFf/d;

    .line 100
    .line 101
    const/4 v12, 0x5

    .line 102
    invoke-direct {v11, v12, v6, v9}, LFf/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v4, v11}, LU8/v0;->X(LZ/k;Ltf/l;)LZ/k;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    const v6, -0x7f0355f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v6}, LN/o;->M(I)V

    .line 113
    .line 114
    .line 115
    const-string v6, "mute_button"

    .line 116
    .line 117
    invoke-virtual {v2, v6}, LN/o;->e(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    invoke-virtual {v2}, LN/o;->F()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    if-nez v6, :cond_3

    .line 126
    .line 127
    if-ne v9, v10, :cond_4

    .line 128
    .line 129
    :cond_3
    new-instance v9, Lcom/moloco/sdk/internal/publisher/d;

    .line 130
    .line 131
    const/16 v6, 0x13

    .line 132
    .line 133
    invoke-direct {v9, v6}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v9}, LN/o;->U(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_4
    check-cast v9, Ltf/l;

    .line 140
    .line 141
    invoke-virtual {v2, v7}, LN/o;->p(Z)V

    .line 142
    .line 143
    .line 144
    invoke-static {v4, v7, v9}, LFe/g;->J(LZ/k;ZLtf/l;)LZ/k;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    const v6, -0x7f01ca5

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v6}, LN/o;->M(I)V

    .line 152
    .line 153
    .line 154
    iget-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->f:Ltf/l;

    .line 155
    .line 156
    invoke-virtual {v2, v6}, LN/o;->e(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    invoke-virtual {v2, v1}, LN/o;->f(Z)Z

    .line 161
    .line 162
    .line 163
    move-result v11

    .line 164
    or-int/2addr v9, v11

    .line 165
    invoke-virtual {v2, v5}, LN/o;->e(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    or-int/2addr v9, v11

    .line 170
    invoke-virtual {v2, v8}, LN/o;->e(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v11

    .line 174
    or-int/2addr v9, v11

    .line 175
    const/4 v11, 0x0

    .line 176
    invoke-virtual {v2, v11}, LN/o;->e(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v11

    .line 180
    or-int/2addr v9, v11

    .line 181
    invoke-virtual {v2}, LN/o;->F()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v11

    .line 185
    if-nez v9, :cond_5

    .line 186
    .line 187
    if-ne v11, v10, :cond_6

    .line 188
    .line 189
    :cond_5
    new-instance v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/t;

    .line 190
    .line 191
    invoke-direct {v11, v6, v1, v8, v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/t;-><init>(Ltf/l;ZLtf/p;LN/V;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2, v11}, LN/o;->U(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :cond_6
    check-cast v11, Ltf/a;

    .line 198
    .line 199
    invoke-virtual {v2, v7}, LN/o;->p(Z)V

    .line 200
    .line 201
    .line 202
    const/16 v17, 0x6000

    .line 203
    .line 204
    const/16 v18, 0x0

    .line 205
    .line 206
    iget-boolean v5, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->g:Z

    .line 207
    .line 208
    const-string v6, "mute/unmute"

    .line 209
    .line 210
    iget-wide v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->h:J

    .line 211
    .line 212
    iget-wide v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->i:J

    .line 213
    .line 214
    move-object/from16 v16, v2

    .line 215
    .line 216
    move-object v2, v3

    .line 217
    move-object v3, v11

    .line 218
    iget-wide v11, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->j:J

    .line 219
    .line 220
    iget-object v13, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->k:Le0/E;

    .line 221
    .line 222
    iget-wide v14, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;->l:J

    .line 223
    .line 224
    invoke-static/range {v2 .. v18}, LFe/b;->a(Lh0/c;Ltf/a;LZ/k;ZLjava/lang/String;JJJLe0/E;JLN/o;II)V

    .line 225
    .line 226
    .line 227
    sget-object v1, Lef/C;->a:Lef/C;

    .line 228
    .line 229
    return-object v1
.end method
