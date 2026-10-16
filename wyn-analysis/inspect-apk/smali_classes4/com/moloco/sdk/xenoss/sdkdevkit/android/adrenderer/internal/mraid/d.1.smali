.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidActivity;

.field public final synthetic b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

.field public final synthetic c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;

.field public final synthetic d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;

.field public final synthetic e:Ltf/p;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidActivity;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;Ltf/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/d;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidActivity;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/d;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/d;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/d;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/d;->e:Ltf/p;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v11, p1

    .line 4
    .line 5
    check-cast v11, LN/o;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v1, v1, 0x3

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    if-ne v1, v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v11}, LN/o;->x()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v11}, LN/o;->I()V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_1

    .line 31
    .line 32
    :cond_1
    :goto_0
    iget-object v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/d;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;

    .line 33
    .line 34
    iget-object v13, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/d;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidActivity;

    .line 35
    .line 36
    invoke-virtual {v13}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v2, "getIntent(...)"

    .line 41
    .line 42
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v2, "CLOSE_DELAY_SECONDS"

    .line 46
    .line 47
    const/4 v14, 0x0

    .line 48
    invoke-virtual {v1, v2, v14}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 49
    .line 50
    .line 51
    move-result v15

    .line 52
    const v1, -0x282c8a6c

    .line 53
    .line 54
    .line 55
    invoke-virtual {v11, v1}, LN/o;->M(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v11}, LN/o;->F()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    sget-object v10, LN/k;->a:LN/P;

    .line 63
    .line 64
    if-ne v1, v10, :cond_2

    .line 65
    .line 66
    new-instance v1, Lcom/moloco/sdk/internal/publisher/d;

    .line 67
    .line 68
    const/4 v2, 0x6

    .line 69
    invoke-direct {v1, v2}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v11, v1}, LN/o;->U(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    move-object/from16 v16, v1

    .line 76
    .line 77
    check-cast v16, Ltf/l;

    .line 78
    .line 79
    invoke-virtual {v11, v14}, LN/o;->p(Z)V

    .line 80
    .line 81
    .line 82
    const v1, -0x282c81eb

    .line 83
    .line 84
    .line 85
    invoke-virtual {v11, v1}, LN/o;->M(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v11, v4}, LN/o;->e(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-virtual {v11}, LN/o;->F()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    if-nez v1, :cond_3

    .line 97
    .line 98
    if-ne v2, v10, :cond_4

    .line 99
    .line 100
    :cond_3
    new-instance v2, LS8/d;

    .line 101
    .line 102
    const-string v7, "onSkipOrClose()V"

    .line 103
    .line 104
    const/4 v8, 0x0

    .line 105
    const/4 v3, 0x0

    .line 106
    const-class v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;

    .line 107
    .line 108
    const-string v6, "onSkipOrClose"

    .line 109
    .line 110
    const/16 v9, 0xa

    .line 111
    .line 112
    invoke-direct/range {v2 .. v9}, LS8/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v11, v2}, LN/o;->U(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_4
    check-cast v2, Lkotlin/reflect/KFunction;

    .line 119
    .line 120
    invoke-virtual {v11, v14}, LN/o;->p(Z)V

    .line 121
    .line 122
    .line 123
    move-object/from16 v17, v2

    .line 124
    .line 125
    check-cast v17, Ltf/a;

    .line 126
    .line 127
    sget-object v18, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/g;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 128
    .line 129
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/d;->e:Ltf/p;

    .line 134
    .line 135
    invoke-interface {v2, v11, v1}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    move-object/from16 v19, v1

    .line 140
    .line 141
    check-cast v19, Ltf/c;

    .line 142
    .line 143
    const/4 v9, 0x0

    .line 144
    const/16 v12, 0xff

    .line 145
    .line 146
    const/4 v1, 0x0

    .line 147
    const/4 v2, 0x0

    .line 148
    move-object v5, v4

    .line 149
    const-wide/16 v3, 0x0

    .line 150
    .line 151
    move-object v7, v5

    .line 152
    const-wide/16 v5, 0x0

    .line 153
    .line 154
    move-object/from16 v20, v7

    .line 155
    .line 156
    const-wide/16 v7, 0x0

    .line 157
    .line 158
    move-object/from16 v21, v10

    .line 159
    .line 160
    const/4 v10, 0x0

    .line 161
    move-object/from16 v22, v20

    .line 162
    .line 163
    move-object/from16 v14, v21

    .line 164
    .line 165
    invoke-static/range {v1 .. v12}, Lic/d;->d(LZ/d;LE/F;JJJLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/z;Lcom/moloco/sdk/internal/ortb/model/D;LN/o;I)LV/d;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    const v1, -0x282c5659

    .line 170
    .line 171
    .line 172
    invoke-virtual {v11, v1}, LN/o;->M(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v11}, LN/o;->F()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    if-ne v1, v14, :cond_5

    .line 180
    .line 181
    new-instance v1, Lcom/moloco/sdk/service_locator/h;

    .line 182
    .line 183
    const/16 v2, 0xc

    .line 184
    .line 185
    invoke-direct {v1, v2}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v11, v1}, LN/o;->U(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_5
    check-cast v1, Ltf/a;

    .line 192
    .line 193
    const/4 v2, 0x0

    .line 194
    invoke-virtual {v11, v2}, LN/o;->p(Z)V

    .line 195
    .line 196
    .line 197
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/d;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    .line 198
    .line 199
    iget-object v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/d;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;

    .line 200
    .line 201
    move-object v12, v11

    .line 202
    move-object v11, v1

    .line 203
    move-object v1, v13

    .line 204
    const/16 v13, 0x6000

    .line 205
    .line 206
    move-object/from16 v4, v22

    .line 207
    .line 208
    iget-object v3, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;

    .line 209
    .line 210
    move v4, v15

    .line 211
    move-object/from16 v5, v16

    .line 212
    .line 213
    move-object/from16 v6, v17

    .line 214
    .line 215
    move-object/from16 v8, v18

    .line 216
    .line 217
    move-object/from16 v9, v19

    .line 218
    .line 219
    invoke-static/range {v1 .. v13}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/k;->b(Landroid/app/Activity;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;ILtf/l;Ltf/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Ltf/c;LV/d;Ltf/a;LN/o;I)V

    .line 220
    .line 221
    .line 222
    :goto_1
    sget-object v1, Lef/C;->a:Lef/C;

    .line 223
    .line 224
    return-object v1
.end method
