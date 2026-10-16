.class public abstract Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/B;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sput v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/B;->a:F

    .line 5
    .line 6
    return-void
.end method

.method public static final a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/s;Ltf/a;Ltf/a;LZ/k;LN/o;I)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v0, p4

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "resource"

    .line 11
    .line 12
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v5, "onDisplayed"

    .line 16
    .line 17
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v5, "onClick"

    .line 21
    .line 22
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const v5, -0x714317d3

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v5}, LN/o;->N(I)LN/o;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    const/4 v5, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v5, 0x2

    .line 40
    :goto_0
    or-int v5, p5, v5

    .line 41
    .line 42
    invoke-virtual {v0, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_1

    .line 47
    .line 48
    const/16 v6, 0x20

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/16 v6, 0x10

    .line 52
    .line 53
    :goto_1
    or-int/2addr v5, v6

    .line 54
    invoke-virtual {v0, v3}, LN/o;->e(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_2

    .line 59
    .line 60
    const/16 v6, 0x100

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    const/16 v6, 0x80

    .line 64
    .line 65
    :goto_2
    or-int/2addr v5, v6

    .line 66
    or-int/lit16 v5, v5, 0xc00

    .line 67
    .line 68
    and-int/lit16 v5, v5, 0x493

    .line 69
    .line 70
    const/16 v6, 0x492

    .line 71
    .line 72
    if-ne v5, v6, :cond_4

    .line 73
    .line 74
    invoke-virtual {v0}, LN/o;->x()Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-nez v5, :cond_3

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_3
    invoke-virtual {v0}, LN/o;->I()V

    .line 82
    .line 83
    .line 84
    move-object/from16 v4, p3

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_4
    :goto_3
    sget-object v5, LZ/i;->a:LZ/i;

    .line 88
    .line 89
    sget-object v6, Lef/C;->a:Lef/C;

    .line 90
    .line 91
    const v7, 0x5d7c3f0a

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v7}, LN/o;->M(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    invoke-virtual {v0}, LN/o;->F()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    const/4 v9, 0x0

    .line 106
    if-nez v7, :cond_5

    .line 107
    .line 108
    sget-object v7, LN/k;->a:LN/P;

    .line 109
    .line 110
    if-ne v8, v7, :cond_6

    .line 111
    .line 112
    :cond_5
    new-instance v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/A;

    .line 113
    .line 114
    invoke-direct {v8, v2, v9}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/A;-><init>(Ltf/a;Ljf/c;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v8}, LN/o;->U(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_6
    check-cast v8, Ltf/p;

    .line 121
    .line 122
    invoke-virtual {v0, v4}, LN/o;->p(Z)V

    .line 123
    .line 124
    .line 125
    invoke-static {v0, v6, v8}, LN/d;->d(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 126
    .line 127
    .line 128
    sget-object v6, LE/L;->a:LE/x;

    .line 129
    .line 130
    new-instance v10, LE/M;

    .line 131
    .line 132
    const/high16 v12, 0x7fc00000    # Float.NaN

    .line 133
    .line 134
    sget v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/B;->a:F

    .line 135
    .line 136
    const/high16 v11, 0x7fc00000    # Float.NaN

    .line 137
    .line 138
    const/4 v15, 0x1

    .line 139
    move v14, v13

    .line 140
    invoke-direct/range {v10 .. v15}, LE/M;-><init>(FFFFZ)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v5, v10}, LZ/k;->g(LZ/k;)LZ/k;

    .line 144
    .line 145
    .line 146
    instance-of v6, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/q;

    .line 147
    .line 148
    if-eqz v6, :cond_7

    .line 149
    .line 150
    const v6, 0x520f648d

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v6}, LN/o;->M(I)V

    .line 154
    .line 155
    .line 156
    move-object v6, v1

    .line 157
    check-cast v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/q;

    .line 158
    .line 159
    invoke-static {v6, v10, v0, v4}, Lff/B;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/q;LZ/k;LN/o;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v4}, LN/o;->p(Z)V

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_7
    instance-of v6, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/r;

    .line 167
    .line 168
    if-eqz v6, :cond_9

    .line 169
    .line 170
    const v6, 0x521213e1

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v6}, LN/o;->M(I)V

    .line 174
    .line 175
    .line 176
    const/4 v6, 0x7

    .line 177
    invoke-static {v10, v9, v3, v6}, Lcom/moloco/sdk/internal/publisher/H;->R(LZ/k;Lx0/e;Ltf/a;I)LZ/k;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    move-object v7, v1

    .line 182
    check-cast v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/r;

    .line 183
    .line 184
    invoke-static {v7, v6, v0, v4, v4}, Ltg/b;->d(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/r;LZ/k;LN/o;II)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v4}, LN/o;->p(Z)V

    .line 188
    .line 189
    .line 190
    :goto_4
    move-object v4, v5

    .line 191
    :goto_5
    invoke-virtual {v0}, LN/o;->r()LN/i0;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    if-eqz v7, :cond_8

    .line 196
    .line 197
    new-instance v0, Lcom/applovin/mediation/adapters/d;

    .line 198
    .line 199
    const/4 v6, 0x4

    .line 200
    move/from16 v5, p5

    .line 201
    .line 202
    invoke-direct/range {v0 .. v6}, Lcom/applovin/mediation/adapters/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lef/e;Ljava/lang/Object;II)V

    .line 203
    .line 204
    .line 205
    iput-object v0, v7, LN/i0;->d:Ltf/p;

    .line 206
    .line 207
    :cond_8
    return-void

    .line 208
    :cond_9
    const v1, 0x5d7c57d2

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v1}, LN/o;->M(I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v4}, LN/o;->p(Z)V

    .line 215
    .line 216
    .line 217
    new-instance v0, LE5/Q;

    .line 218
    .line 219
    const/16 v1, 0x9

    .line 220
    .line 221
    invoke-direct {v0, v4, v1}, LE5/Q;-><init>(BI)V

    .line 222
    .line 223
    .line 224
    throw v0
.end method
