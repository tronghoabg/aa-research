.class public final synthetic Laa/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lcom/applovin/sdk/AppLovinSdk$SdkInitializationListener;
.implements Lt/a;
.implements Lx6/r;
.implements Lcom/moloco/sdk/publisher/MolocoBidTokenListener;
.implements Lcom/unity3d/ads/IUnityAdsTokenListener;
.implements Lt6/k;
.implements LL8/e;
.implements LQ1/c;
.implements Ln2/l;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements Lr6/i;
.implements Lw9/o;
.implements Lw9/m;
.implements LB5/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Laa/f;->a:I

    iput-object p2, p0, Laa/f;->b:Ljava/lang/Object;

    iput-object p3, p0, Laa/f;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILf6/Z;[I)Ll8/e0;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    iget v1, v0, Laa/f;->a:I

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 11
    .line 12
    .line 13
    move-result-object v8

    .line 14
    const/4 v1, 0x0

    .line 15
    move v4, v1

    .line 16
    :goto_0
    iget v1, v3, Lf6/Z;->a:I

    .line 17
    .line 18
    if-ge v4, v1, :cond_0

    .line 19
    .line 20
    new-instance v1, Lr6/h;

    .line 21
    .line 22
    aget v6, p3, v4

    .line 23
    .line 24
    iget-object v2, v0, Laa/f;->b:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v5, v2

    .line 27
    check-cast v5, Lr6/f;

    .line 28
    .line 29
    iget-object v2, v0, Laa/f;->c:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v7, v2

    .line 32
    check-cast v7, Ljava/lang/String;

    .line 33
    .line 34
    move/from16 v2, p1

    .line 35
    .line 36
    invoke-direct/range {v1 .. v7}, Lr6/h;-><init>(ILf6/Z;ILr6/f;ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v8, v1}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {v8}, Ll8/H;->g()Ll8/e0;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    return-object v1

    .line 50
    :pswitch_0
    iget-object v1, v0, Laa/f;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, [I

    .line 53
    .line 54
    aget v7, v1, p1

    .line 55
    .line 56
    iget-object v1, v0, Laa/f;->b:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v5, v1

    .line 59
    check-cast v5, Lr6/f;

    .line 60
    .line 61
    iget v1, v5, Lr6/r;->i:I

    .line 62
    .line 63
    const v10, 0x7fffffff

    .line 64
    .line 65
    .line 66
    if-eq v1, v10, :cond_8

    .line 67
    .line 68
    iget v2, v5, Lr6/r;->j:I

    .line 69
    .line 70
    if-ne v2, v10, :cond_1

    .line 71
    .line 72
    goto/16 :goto_6

    .line 73
    .line 74
    :cond_1
    move v6, v10

    .line 75
    const/4 v4, 0x0

    .line 76
    :goto_1
    iget v8, v3, Lf6/Z;->a:I

    .line 77
    .line 78
    if-ge v4, v8, :cond_7

    .line 79
    .line 80
    iget-object v8, v3, Lf6/Z;->d:[LE5/T;

    .line 81
    .line 82
    aget-object v8, v8, v4

    .line 83
    .line 84
    iget v12, v8, LE5/T;->q:I

    .line 85
    .line 86
    if-lez v12, :cond_6

    .line 87
    .line 88
    iget v13, v8, LE5/T;->r:I

    .line 89
    .line 90
    if-lez v13, :cond_6

    .line 91
    .line 92
    iget-boolean v14, v5, Lr6/r;->k:Z

    .line 93
    .line 94
    if-eqz v14, :cond_4

    .line 95
    .line 96
    if-le v12, v13, :cond_2

    .line 97
    .line 98
    const/4 v14, 0x1

    .line 99
    goto :goto_2

    .line 100
    :cond_2
    const/4 v14, 0x0

    .line 101
    :goto_2
    if-le v1, v2, :cond_3

    .line 102
    .line 103
    const/4 v15, 0x1

    .line 104
    goto :goto_3

    .line 105
    :cond_3
    const/4 v15, 0x0

    .line 106
    :goto_3
    if-eq v14, v15, :cond_4

    .line 107
    .line 108
    move v14, v1

    .line 109
    move v15, v2

    .line 110
    goto :goto_4

    .line 111
    :cond_4
    move v15, v1

    .line 112
    move v14, v2

    .line 113
    :goto_4
    mul-int v9, v12, v14

    .line 114
    .line 115
    mul-int v11, v13, v15

    .line 116
    .line 117
    if-lt v9, v11, :cond_5

    .line 118
    .line 119
    new-instance v9, Landroid/graphics/Point;

    .line 120
    .line 121
    invoke-static {v11, v12}, Lu6/v;->f(II)I

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    invoke-direct {v9, v15, v11}, Landroid/graphics/Point;-><init>(II)V

    .line 126
    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_5
    new-instance v11, Landroid/graphics/Point;

    .line 130
    .line 131
    invoke-static {v9, v13}, Lu6/v;->f(II)I

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    invoke-direct {v11, v9, v14}, Landroid/graphics/Point;-><init>(II)V

    .line 136
    .line 137
    .line 138
    move-object v9, v11

    .line 139
    :goto_5
    iget v8, v8, LE5/T;->q:I

    .line 140
    .line 141
    mul-int v11, v8, v13

    .line 142
    .line 143
    iget v12, v9, Landroid/graphics/Point;->x:I

    .line 144
    .line 145
    int-to-float v12, v12

    .line 146
    const v14, 0x3f7ae148    # 0.98f

    .line 147
    .line 148
    .line 149
    mul-float/2addr v12, v14

    .line 150
    float-to-int v12, v12

    .line 151
    if-lt v8, v12, :cond_6

    .line 152
    .line 153
    iget v8, v9, Landroid/graphics/Point;->y:I

    .line 154
    .line 155
    int-to-float v8, v8

    .line 156
    mul-float/2addr v8, v14

    .line 157
    float-to-int v8, v8

    .line 158
    if-lt v13, v8, :cond_6

    .line 159
    .line 160
    if-ge v11, v6, :cond_6

    .line 161
    .line 162
    move v6, v11

    .line 163
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_7
    move v9, v6

    .line 167
    goto :goto_7

    .line 168
    :cond_8
    :goto_6
    move v9, v10

    .line 169
    :goto_7
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 170
    .line 171
    .line 172
    move-result-object v11

    .line 173
    const/4 v4, 0x0

    .line 174
    :goto_8
    iget v1, v3, Lf6/Z;->a:I

    .line 175
    .line 176
    if-ge v4, v1, :cond_d

    .line 177
    .line 178
    iget-object v1, v3, Lf6/Z;->d:[LE5/T;

    .line 179
    .line 180
    aget-object v1, v1, v4

    .line 181
    .line 182
    iget v2, v1, LE5/T;->q:I

    .line 183
    .line 184
    const/4 v6, -0x1

    .line 185
    if-eq v2, v6, :cond_a

    .line 186
    .line 187
    iget v1, v1, LE5/T;->r:I

    .line 188
    .line 189
    if-ne v1, v6, :cond_9

    .line 190
    .line 191
    goto :goto_9

    .line 192
    :cond_9
    mul-int/2addr v2, v1

    .line 193
    goto :goto_a

    .line 194
    :cond_a
    :goto_9
    move v2, v6

    .line 195
    :goto_a
    if-eq v9, v10, :cond_c

    .line 196
    .line 197
    if-eq v2, v6, :cond_b

    .line 198
    .line 199
    if-gt v2, v9, :cond_b

    .line 200
    .line 201
    goto :goto_b

    .line 202
    :cond_b
    const/4 v8, 0x0

    .line 203
    goto :goto_c

    .line 204
    :cond_c
    :goto_b
    const/4 v8, 0x1

    .line 205
    :goto_c
    new-instance v1, Lr6/k;

    .line 206
    .line 207
    aget v6, p3, v4

    .line 208
    .line 209
    move/from16 v2, p1

    .line 210
    .line 211
    invoke-direct/range {v1 .. v8}, Lr6/k;-><init>(ILf6/Z;ILr6/f;IIZ)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v11, v1}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    add-int/lit8 v4, v4, 0x1

    .line 218
    .line 219
    move-object/from16 v3, p2

    .line 220
    .line 221
    goto :goto_8

    .line 222
    :cond_d
    invoke-virtual {v11}, Ll8/H;->g()Ll8/e0;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    return-object v1

    .line 227
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Lk2/M;

    .line 2
    .line 3
    iget-object v0, p0, Laa/f;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LZ1/d;

    .line 6
    .line 7
    iget v1, v0, LZ1/d;->a:I

    .line 8
    .line 9
    iget-object v2, p0, Laa/f;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lh2/g;

    .line 12
    .line 13
    iget-object v0, v0, LZ1/d;->b:Lk2/H;

    .line 14
    .line 15
    invoke-interface {p1, v1, v0, v2}, Lk2/M;->q(ILk2/H;Lh2/g;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Laa/f;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v3, p0, Laa/f;->b:Ljava/lang/Object;

    .line 6
    .line 7
    iget v4, p0, Laa/f;->a:I

    .line 8
    .line 9
    sparse-switch v4, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ls9/k;

    .line 13
    .line 14
    check-cast v3, Lp9/u;

    .line 15
    .line 16
    invoke-virtual {v3, p1}, Lp9/u;->g(Ls9/k;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    iget-object p1, p1, Ls9/k;->a:Ls9/h;

    .line 23
    .line 24
    check-cast v2, Ljava/util/Set;

    .line 25
    .line 26
    invoke-interface {v2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v0, v1

    .line 34
    :cond_1
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :sswitch_0
    check-cast v2, Ljava/lang/String;

    .line 40
    .line 41
    check-cast p1, Landroid/database/Cursor;

    .line 42
    .line 43
    check-cast v3, LX2/j;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    const/4 v4, 0x2

    .line 52
    :try_start_0
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getBlob(I)[B

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-static {v5}, Lja/d;->i([B)Lja/d;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    new-instance v6, Lo9/j;

    .line 61
    .line 62
    invoke-virtual {v5}, Lja/d;->e()Lja/c;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    sget-object v8, Lja/c;->b:Lja/c;

    .line 67
    .line 68
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-eqz v7, :cond_2

    .line 73
    .line 74
    move v4, v0

    .line 75
    :cond_2
    invoke-virtual {v5}, Lja/d;->f()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-virtual {v5}, Lja/d;->g()Lka/h1;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-static {v7, v5}, Lv9/o;->e(Ljava/lang/String;Lka/h1;)Lp9/A;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    new-instance v7, Lo9/i;

    .line 88
    .line 89
    invoke-direct {v7, v5, v4}, Lo9/i;-><init>(Lp9/A;I)V

    .line 90
    .line 91
    .line 92
    new-instance v4, Ls9/o;

    .line 93
    .line 94
    new-instance v5, Ls8/q;

    .line 95
    .line 96
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 97
    .line 98
    .line 99
    move-result-wide v8

    .line 100
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    invoke-direct {v5, v8, v9, p1}, Ls8/q;-><init>(JI)V

    .line 105
    .line 106
    .line 107
    invoke-direct {v4, v5}, Ls9/o;-><init>(Ls8/q;)V

    .line 108
    .line 109
    .line 110
    invoke-direct {v6, v2, v7, v4}, Lo9/j;-><init>(Ljava/lang/String;Lo9/i;Ls9/o;)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    .line 112
    .line 113
    move-object v3, v6

    .line 114
    goto :goto_1

    .line 115
    :catch_0
    move-exception p1

    .line 116
    const-string v2, "NamedQuery failed to parse: %s"

    .line 117
    .line 118
    new-array v0, v0, [Ljava/lang/Object;

    .line 119
    .line 120
    aput-object p1, v0, v1

    .line 121
    .line 122
    invoke-static {v2, v0}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    throw v3

    .line 126
    :cond_3
    :goto_1
    return-object v3

    .line 127
    :sswitch_1
    check-cast p1, Lcom/applovin/impl/i5;

    .line 128
    .line 129
    check-cast v3, Lcom/applovin/impl/sdk/ad/b;

    .line 130
    .line 131
    check-cast v2, Landroid/view/MotionEvent;

    .line 132
    .line 133
    invoke-static {v3, v2, p1}, Lcom/applovin/impl/sdk/ad/b;->H(Lcom/applovin/impl/sdk/ad/b;Landroid/view/MotionEvent;Lcom/applovin/impl/i5;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    return-object p1

    .line 138
    nop

    .line 139
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method

.method public b()Lt6/l;
    .locals 4

    .line 1
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/d;

    .line 2
    .line 3
    iget-object v1, p0, Laa/f;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;

    .line 6
    .line 7
    iget-object v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;

    .line 8
    .line 9
    iget-object v3, p0, Laa/f;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v0, v3, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/d;-><init>(Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->q:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/d;

    .line 17
    .line 18
    return-object v0
.end method

.method public c(ILN1/O;[I)Ll8/e0;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    iget v1, v0, Laa/f;->a:I

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 11
    .line 12
    .line 13
    move-result-object v8

    .line 14
    const/4 v1, 0x0

    .line 15
    move v4, v1

    .line 16
    :goto_0
    iget v1, v3, LN1/O;->a:I

    .line 17
    .line 18
    if-ge v4, v1, :cond_0

    .line 19
    .line 20
    new-instance v1, Ln2/k;

    .line 21
    .line 22
    aget v6, p3, v4

    .line 23
    .line 24
    iget-object v2, v0, Laa/f;->b:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v5, v2

    .line 27
    check-cast v5, Ln2/i;

    .line 28
    .line 29
    iget-object v2, v0, Laa/f;->c:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v7, v2

    .line 32
    check-cast v7, Ljava/lang/String;

    .line 33
    .line 34
    move/from16 v2, p1

    .line 35
    .line 36
    invoke-direct/range {v1 .. v7}, Ln2/k;-><init>(ILN1/O;ILn2/i;ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v8, v1}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {v8}, Ll8/H;->g()Ll8/e0;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    return-object v1

    .line 50
    :pswitch_0
    iget-object v1, v0, Laa/f;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, [I

    .line 53
    .line 54
    aget v7, v1, p1

    .line 55
    .line 56
    iget-object v1, v0, Laa/f;->b:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v5, v1

    .line 59
    check-cast v5, Ln2/i;

    .line 60
    .line 61
    iget v1, v5, LN1/T;->e:I

    .line 62
    .line 63
    const v10, 0x7fffffff

    .line 64
    .line 65
    .line 66
    if-eq v1, v10, :cond_8

    .line 67
    .line 68
    iget v2, v5, LN1/T;->f:I

    .line 69
    .line 70
    if-ne v2, v10, :cond_1

    .line 71
    .line 72
    goto/16 :goto_6

    .line 73
    .line 74
    :cond_1
    move v6, v10

    .line 75
    const/4 v4, 0x0

    .line 76
    :goto_1
    iget v8, v3, LN1/O;->a:I

    .line 77
    .line 78
    if-ge v4, v8, :cond_7

    .line 79
    .line 80
    iget-object v8, v3, LN1/O;->d:[LN1/n;

    .line 81
    .line 82
    aget-object v8, v8, v4

    .line 83
    .line 84
    iget v12, v8, LN1/n;->u:I

    .line 85
    .line 86
    if-lez v12, :cond_6

    .line 87
    .line 88
    iget v13, v8, LN1/n;->v:I

    .line 89
    .line 90
    if-lez v13, :cond_6

    .line 91
    .line 92
    iget-boolean v14, v5, LN1/T;->g:Z

    .line 93
    .line 94
    if-eqz v14, :cond_4

    .line 95
    .line 96
    if-le v12, v13, :cond_2

    .line 97
    .line 98
    const/4 v14, 0x1

    .line 99
    goto :goto_2

    .line 100
    :cond_2
    const/4 v14, 0x0

    .line 101
    :goto_2
    if-le v1, v2, :cond_3

    .line 102
    .line 103
    const/4 v15, 0x1

    .line 104
    goto :goto_3

    .line 105
    :cond_3
    const/4 v15, 0x0

    .line 106
    :goto_3
    if-eq v14, v15, :cond_4

    .line 107
    .line 108
    move v14, v1

    .line 109
    move v15, v2

    .line 110
    goto :goto_4

    .line 111
    :cond_4
    move v15, v1

    .line 112
    move v14, v2

    .line 113
    :goto_4
    mul-int v9, v12, v14

    .line 114
    .line 115
    mul-int v11, v13, v15

    .line 116
    .line 117
    if-lt v9, v11, :cond_5

    .line 118
    .line 119
    new-instance v9, Landroid/graphics/Point;

    .line 120
    .line 121
    invoke-static {v11, v12}, LQ1/x;->f(II)I

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    invoke-direct {v9, v15, v11}, Landroid/graphics/Point;-><init>(II)V

    .line 126
    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_5
    new-instance v11, Landroid/graphics/Point;

    .line 130
    .line 131
    invoke-static {v9, v13}, LQ1/x;->f(II)I

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    invoke-direct {v11, v9, v14}, Landroid/graphics/Point;-><init>(II)V

    .line 136
    .line 137
    .line 138
    move-object v9, v11

    .line 139
    :goto_5
    iget v8, v8, LN1/n;->u:I

    .line 140
    .line 141
    mul-int v11, v8, v13

    .line 142
    .line 143
    iget v12, v9, Landroid/graphics/Point;->x:I

    .line 144
    .line 145
    int-to-float v12, v12

    .line 146
    const v14, 0x3f7ae148    # 0.98f

    .line 147
    .line 148
    .line 149
    mul-float/2addr v12, v14

    .line 150
    float-to-int v12, v12

    .line 151
    if-lt v8, v12, :cond_6

    .line 152
    .line 153
    iget v8, v9, Landroid/graphics/Point;->y:I

    .line 154
    .line 155
    int-to-float v8, v8

    .line 156
    mul-float/2addr v8, v14

    .line 157
    float-to-int v8, v8

    .line 158
    if-lt v13, v8, :cond_6

    .line 159
    .line 160
    if-ge v11, v6, :cond_6

    .line 161
    .line 162
    move v6, v11

    .line 163
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_7
    move v9, v6

    .line 167
    goto :goto_7

    .line 168
    :cond_8
    :goto_6
    move v9, v10

    .line 169
    :goto_7
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 170
    .line 171
    .line 172
    move-result-object v11

    .line 173
    const/4 v4, 0x0

    .line 174
    :goto_8
    iget v1, v3, LN1/O;->a:I

    .line 175
    .line 176
    if-ge v4, v1, :cond_d

    .line 177
    .line 178
    iget-object v1, v3, LN1/O;->d:[LN1/n;

    .line 179
    .line 180
    aget-object v1, v1, v4

    .line 181
    .line 182
    iget v2, v1, LN1/n;->u:I

    .line 183
    .line 184
    const/4 v6, -0x1

    .line 185
    if-eq v2, v6, :cond_a

    .line 186
    .line 187
    iget v1, v1, LN1/n;->v:I

    .line 188
    .line 189
    if-ne v1, v6, :cond_9

    .line 190
    .line 191
    goto :goto_9

    .line 192
    :cond_9
    mul-int/2addr v2, v1

    .line 193
    goto :goto_a

    .line 194
    :cond_a
    :goto_9
    move v2, v6

    .line 195
    :goto_a
    if-eq v9, v10, :cond_c

    .line 196
    .line 197
    if-eq v2, v6, :cond_b

    .line 198
    .line 199
    if-gt v2, v9, :cond_b

    .line 200
    .line 201
    goto :goto_b

    .line 202
    :cond_b
    const/4 v8, 0x0

    .line 203
    goto :goto_c

    .line 204
    :cond_c
    :goto_b
    const/4 v8, 0x1

    .line 205
    :goto_c
    new-instance v1, Ln2/n;

    .line 206
    .line 207
    aget v6, p3, v4

    .line 208
    .line 209
    move/from16 v2, p1

    .line 210
    .line 211
    invoke-direct/range {v1 .. v8}, Ln2/n;-><init>(ILN1/O;ILn2/i;IIZ)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v11, v1}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    add-int/lit8 v4, v4, 0x1

    .line 218
    .line 219
    move-object/from16 v3, p2

    .line 220
    .line 221
    goto :goto_8

    .line 222
    :cond_d
    invoke-virtual {v11}, Ll8/H;->g()Ll8/e0;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    return-object v1

    .line 227
    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
    .end packed-switch
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Laa/f;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls8/b;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-boolean v1, v0, Ls8/b;->b:Z

    .line 7
    .line 8
    iget-object v0, p0, Laa/f;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/applovin/impl/Y;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Lcom/applovin/impl/Y;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public execute()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Laa/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Laa/f;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lz5/f;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Laa/f;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/util/Map$Entry;

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    int-to-long v3, v3

    .line 48
    sget-object v5, Lw5/c;->g:Lw5/c;

    .line 49
    .line 50
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/lang/String;

    .line 55
    .line 56
    iget-object v6, v0, Lz5/f;->i:LA5/c;

    .line 57
    .line 58
    check-cast v6, LA5/m;

    .line 59
    .line 60
    invoke-virtual {v6, v3, v4, v5, v2}, LA5/m;->i(JLw5/c;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const/4 v0, 0x0

    .line 65
    return-object v0

    .line 66
    :pswitch_0
    iget-object v0, p0, Laa/f;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lz5/f;

    .line 69
    .line 70
    iget-object v0, v0, Lz5/f;->c:LA5/d;

    .line 71
    .line 72
    check-cast v0, LA5/m;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Laa/f;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, Ljava/lang/Iterable;

    .line 80
    .line 81
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-nez v2, :cond_1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v3, "DELETE FROM events WHERE _id in "

    .line 95
    .line 96
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v1}, LA5/m;->w(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v0}, LA5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    .line 119
    .line 120
    .line 121
    :goto_1
    const/4 v0, 0x0

    .line 122
    return-object v0

    .line 123
    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_0
    .end packed-switch
.end method

.method public get()Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v3, v1, Laa/f;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v4, v1, Laa/f;->b:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    iget v7, v1, Laa/f;->a:I

    .line 11
    .line 12
    packed-switch v7, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v4, Lr9/l;

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v3, Lo9/e;

    .line 21
    .line 22
    iget-object v0, v3, Lo9/e;->a:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v2, v4, Lr9/l;->j:Lr9/a;

    .line 25
    .line 26
    invoke-interface {v2, v0}, Lr9/a;->u(Ljava/lang/String;)Lo9/e;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    iget-object v0, v0, Lo9/e;->c:Ls9/o;

    .line 33
    .line 34
    iget-object v2, v3, Lo9/e;->c:Ls9/o;

    .line 35
    .line 36
    iget-object v0, v0, Ls9/o;->a:Ls8/q;

    .line 37
    .line 38
    iget-object v2, v2, Ls9/o;->a:Ls8/q;

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ls8/q;->c(Ls8/q;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-ltz v0, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v5, v6

    .line 48
    :goto_0
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :pswitch_0
    check-cast v4, Lr9/l;

    .line 54
    .line 55
    iget-object v4, v4, Lr9/l;->k:Landroid/util/SparseArray;

    .line 56
    .line 57
    check-cast v3, Lr9/q;

    .line 58
    .line 59
    iget-object v7, v3, Lr9/q;->b:LJ5/n;

    .line 60
    .line 61
    iget-wide v8, v7, LJ5/n;->a:J

    .line 62
    .line 63
    const-wide/16 v10, -0x1

    .line 64
    .line 65
    cmp-long v8, v8, v10

    .line 66
    .line 67
    const-string v9, "LruGarbageCollector"

    .line 68
    .line 69
    if-nez v8, :cond_1

    .line 70
    .line 71
    new-array v0, v6, [Ljava/lang/Object;

    .line 72
    .line 73
    const-string v2, "Garbage collection skipped; disabled"

    .line 74
    .line 75
    invoke-static {v9, v2, v5, v0}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    new-instance v0, Lr9/o;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    goto/16 :goto_d

    .line 84
    .line 85
    :cond_1
    iget-object v3, v3, Lr9/q;->a:Ljava/lang/Object;

    .line 86
    .line 87
    move-object v8, v3

    .line 88
    check-cast v8, LA7/c0;

    .line 89
    .line 90
    const-string v12, "PRAGMA page_count"

    .line 91
    .line 92
    iget-object v8, v8, LA7/c0;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v8, Lr9/K;

    .line 95
    .line 96
    invoke-virtual {v8, v12}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    invoke-virtual {v12}, Lne/a;->i()Landroid/database/Cursor;

    .line 101
    .line 102
    .line 103
    move-result-object v12

    .line 104
    :try_start_0
    invoke-interface {v12}, Landroid/database/Cursor;->moveToFirst()Z

    .line 105
    .line 106
    .line 107
    move-result v13

    .line 108
    if-eqz v13, :cond_2

    .line 109
    .line 110
    invoke-interface {v12, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 111
    .line 112
    .line 113
    move-result-wide v13

    .line 114
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 115
    .line 116
    .line 117
    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 118
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :goto_1
    move-object v1, v0

    .line 123
    goto/16 :goto_16

    .line 124
    .line 125
    :cond_2
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 126
    .line 127
    .line 128
    move-object v13, v2

    .line 129
    :goto_2
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 130
    .line 131
    .line 132
    move-result-wide v12

    .line 133
    const-string v14, "PRAGMA page_size"

    .line 134
    .line 135
    invoke-virtual {v8, v14}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    invoke-virtual {v8}, Lne/a;->i()Landroid/database/Cursor;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    :try_start_1
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    .line 144
    .line 145
    .line 146
    move-result v14

    .line 147
    if-eqz v14, :cond_3

    .line 148
    .line 149
    invoke-interface {v8, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 150
    .line 151
    .line 152
    move-result-wide v14

    .line 153
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 154
    .line 155
    .line 156
    move-result-object v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 157
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :goto_3
    move-object v1, v0

    .line 162
    goto/16 :goto_14

    .line 163
    .line 164
    :cond_3
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 165
    .line 166
    .line 167
    move-object v14, v2

    .line 168
    :goto_4
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 169
    .line 170
    .line 171
    move-result-wide v14

    .line 172
    mul-long/2addr v14, v12

    .line 173
    iget-wide v7, v7, LJ5/n;->a:J

    .line 174
    .line 175
    cmp-long v12, v14, v7

    .line 176
    .line 177
    if-gez v12, :cond_4

    .line 178
    .line 179
    const-string v0, "Garbage collection skipped; Cache size "

    .line 180
    .line 181
    const-string v2, " is lower than threshold "

    .line 182
    .line 183
    invoke-static {v14, v15, v0, v2}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    new-array v2, v6, [Ljava/lang/Object;

    .line 195
    .line 196
    invoke-static {v9, v0, v5, v2}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    new-instance v0, Lr9/o;

    .line 200
    .line 201
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 202
    .line 203
    .line 204
    goto/16 :goto_d

    .line 205
    .line 206
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 207
    .line 208
    .line 209
    move-result-wide v7

    .line 210
    move-object v12, v3

    .line 211
    check-cast v12, LA7/c0;

    .line 212
    .line 213
    iget-object v12, v12, LA7/c0;->b:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v12, Lr9/K;

    .line 216
    .line 217
    iget-object v13, v12, Lr9/K;->g:Lr9/O;

    .line 218
    .line 219
    iget-wide v13, v13, Lr9/O;->f:J

    .line 220
    .line 221
    const-string v15, "SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)"

    .line 222
    .line 223
    invoke-virtual {v12, v15}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 224
    .line 225
    .line 226
    move-result-object v12

    .line 227
    invoke-virtual {v12}, Lne/a;->i()Landroid/database/Cursor;

    .line 228
    .line 229
    .line 230
    move-result-object v12

    .line 231
    :try_start_2
    invoke-interface {v12}, Landroid/database/Cursor;->moveToFirst()Z

    .line 232
    .line 233
    .line 234
    move-result v15

    .line 235
    if-eqz v15, :cond_5

    .line 236
    .line 237
    invoke-interface {v12, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 238
    .line 239
    .line 240
    move-result-wide v15

    .line 241
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 242
    .line 243
    .line 244
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 245
    :cond_5
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 246
    .line 247
    .line 248
    goto :goto_6

    .line 249
    :goto_5
    move-object v1, v0

    .line 250
    goto/16 :goto_12

    .line 251
    .line 252
    :goto_6
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 253
    .line 254
    .line 255
    move-result-wide v15

    .line 256
    add-long/2addr v13, v15

    .line 257
    const/16 v2, 0xa

    .line 258
    .line 259
    int-to-float v2, v2

    .line 260
    const/high16 v12, 0x42c80000    # 100.0f

    .line 261
    .line 262
    div-float/2addr v2, v12

    .line 263
    long-to-float v12, v13

    .line 264
    mul-float/2addr v2, v12

    .line 265
    float-to-int v2, v2

    .line 266
    const/16 v12, 0x3e8

    .line 267
    .line 268
    if-le v2, v12, :cond_6

    .line 269
    .line 270
    const-string v13, "Capping sequence numbers to collect down to the maximum of 1000 from "

    .line 271
    .line 272
    invoke-static {v2, v13}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    new-array v13, v6, [Ljava/lang/Object;

    .line 277
    .line 278
    invoke-static {v9, v2, v5, v13}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    move v2, v12

    .line 282
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 283
    .line 284
    .line 285
    move-result-wide v12

    .line 286
    if-nez v2, :cond_7

    .line 287
    .line 288
    const/16 v16, 0x2

    .line 289
    .line 290
    goto/16 :goto_b

    .line 291
    .line 292
    :cond_7
    new-instance v10, Lr9/p;

    .line 293
    .line 294
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 295
    .line 296
    .line 297
    iput v2, v10, Lr9/p;->a:I

    .line 298
    .line 299
    new-instance v11, Ljava/util/PriorityQueue;

    .line 300
    .line 301
    sget-object v14, Lr9/p;->c:Lq6/d;

    .line 302
    .line 303
    invoke-direct {v11, v2, v14}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 304
    .line 305
    .line 306
    iput-object v11, v10, Lr9/p;->b:Ljava/lang/Object;

    .line 307
    .line 308
    new-instance v11, Lr9/n;

    .line 309
    .line 310
    invoke-direct {v11, v10, v6}, Lr9/n;-><init>(Lr9/p;I)V

    .line 311
    .line 312
    .line 313
    move-object v14, v3

    .line 314
    check-cast v14, LA7/c0;

    .line 315
    .line 316
    iget-object v14, v14, LA7/c0;->b:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v14, Lr9/K;

    .line 319
    .line 320
    iget-object v14, v14, Lr9/K;->g:Lr9/O;

    .line 321
    .line 322
    iget-object v15, v14, Lr9/O;->a:Lr9/K;

    .line 323
    .line 324
    const/16 v16, 0x2

    .line 325
    .line 326
    const-string v0, "SELECT target_proto FROM targets"

    .line 327
    .line 328
    invoke-virtual {v15, v0}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {v0}, Lne/a;->i()Landroid/database/Cursor;

    .line 333
    .line 334
    .line 335
    move-result-object v15

    .line 336
    :goto_7
    :try_start_3
    invoke-interface {v15}, Landroid/database/Cursor;->moveToNext()Z

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    if-eqz v0, :cond_8

    .line 341
    .line 342
    invoke-interface {v15, v6}, Landroid/database/Cursor;->getBlob(I)[B

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v14, v0}, Lr9/O;->k([B)Lr9/S;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {v11, v0}, Lr9/n;->accept(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 351
    .line 352
    .line 353
    goto :goto_7

    .line 354
    :goto_8
    move-object v1, v0

    .line 355
    goto/16 :goto_10

    .line 356
    .line 357
    :cond_8
    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    .line 358
    .line 359
    .line 360
    new-instance v0, Lr9/n;

    .line 361
    .line 362
    invoke-direct {v0, v10, v5}, Lr9/n;-><init>(Lr9/p;I)V

    .line 363
    .line 364
    .line 365
    move-object v11, v3

    .line 366
    check-cast v11, LA7/c0;

    .line 367
    .line 368
    iget-object v11, v11, LA7/c0;->b:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v11, Lr9/K;

    .line 371
    .line 372
    const-string v14, "select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0"

    .line 373
    .line 374
    invoke-virtual {v11, v14}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 375
    .line 376
    .line 377
    move-result-object v11

    .line 378
    invoke-virtual {v11}, Lne/a;->i()Landroid/database/Cursor;

    .line 379
    .line 380
    .line 381
    move-result-object v11

    .line 382
    :goto_9
    :try_start_4
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    .line 383
    .line 384
    .line 385
    move-result v14

    .line 386
    if-eqz v14, :cond_9

    .line 387
    .line 388
    invoke-interface {v11, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 389
    .line 390
    .line 391
    move-result-wide v14

    .line 392
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 393
    .line 394
    .line 395
    move-result-object v14

    .line 396
    invoke-virtual {v0, v14}, Lr9/n;->accept(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 397
    .line 398
    .line 399
    goto :goto_9

    .line 400
    :goto_a
    move-object v1, v0

    .line 401
    goto/16 :goto_e

    .line 402
    .line 403
    :cond_9
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 404
    .line 405
    .line 406
    iget-object v0, v10, Lr9/p;->b:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v0, Ljava/util/PriorityQueue;

    .line 409
    .line 410
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    check-cast v0, Ljava/lang/Long;

    .line 415
    .line 416
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 417
    .line 418
    .line 419
    move-result-wide v10

    .line 420
    :goto_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 421
    .line 422
    .line 423
    move-result-wide v14

    .line 424
    move-object v0, v3

    .line 425
    check-cast v0, LA7/c0;

    .line 426
    .line 427
    iget-object v0, v0, LA7/c0;->b:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v0, Lr9/K;

    .line 430
    .line 431
    iget-object v0, v0, Lr9/K;->g:Lr9/O;

    .line 432
    .line 433
    move/from16 v17, v6

    .line 434
    .line 435
    new-array v6, v5, [I

    .line 436
    .line 437
    iget-object v5, v0, Lr9/O;->a:Lr9/K;

    .line 438
    .line 439
    const-string v1, "SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?"

    .line 440
    .line 441
    invoke-virtual {v5, v1}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 446
    .line 447
    .line 448
    move-result-object v5

    .line 449
    move-object/from16 v19, v3

    .line 450
    .line 451
    move-object/from16 v18, v5

    .line 452
    .line 453
    const/4 v3, 0x1

    .line 454
    new-array v5, v3, [Ljava/lang/Object;

    .line 455
    .line 456
    aput-object v18, v5, v17

    .line 457
    .line 458
    invoke-virtual {v1, v5}, Lne/a;->b([Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    new-instance v5, Lr9/H;

    .line 462
    .line 463
    invoke-direct {v5, v0, v4, v6, v3}, Lr9/H;-><init>(Ljava/lang/Object;Ljava/lang/Cloneable;Ljava/lang/Object;I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v1, v5}, Lne/a;->f(Lw9/g;)I

    .line 467
    .line 468
    .line 469
    invoke-virtual {v0}, Lr9/O;->m()V

    .line 470
    .line 471
    .line 472
    aget v0, v6, v17

    .line 473
    .line 474
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 475
    .line 476
    .line 477
    move-result-wide v4

    .line 478
    move-object/from16 v1, v19

    .line 479
    .line 480
    check-cast v1, LA7/c0;

    .line 481
    .line 482
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    new-array v6, v3, [I

    .line 486
    .line 487
    move-wide/from16 v19, v4

    .line 488
    .line 489
    new-instance v4, Ljava/util/ArrayList;

    .line 490
    .line 491
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 492
    .line 493
    .line 494
    new-array v5, v3, [Ls9/m;

    .line 495
    .line 496
    sget-object v3, Ls9/m;->b:Ls9/m;

    .line 497
    .line 498
    aput-object v3, v5, v17

    .line 499
    .line 500
    :goto_c
    iget-object v3, v1, LA7/c0;->b:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast v3, Lr9/K;

    .line 503
    .line 504
    move-wide/from16 v21, v7

    .line 505
    .line 506
    const-string v7, "select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? AND path > ? LIMIT ?"

    .line 507
    .line 508
    invoke-virtual {v3, v7}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 509
    .line 510
    .line 511
    move-result-object v7

    .line 512
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 513
    .line 514
    .line 515
    move-result-object v8

    .line 516
    aget-object v23, v5, v17

    .line 517
    .line 518
    invoke-static/range {v23 .. v23}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v23

    .line 522
    move-object/from16 v24, v8

    .line 523
    .line 524
    const/16 v8, 0x64

    .line 525
    .line 526
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 527
    .line 528
    .line 529
    move-result-object v25

    .line 530
    const/4 v8, 0x3

    .line 531
    new-array v8, v8, [Ljava/lang/Object;

    .line 532
    .line 533
    aput-object v24, v8, v17

    .line 534
    .line 535
    const/16 v18, 0x1

    .line 536
    .line 537
    aput-object v23, v8, v18

    .line 538
    .line 539
    aput-object v25, v8, v16

    .line 540
    .line 541
    invoke-virtual {v7, v8}, Lne/a;->b([Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    new-instance v8, Lr9/G;

    .line 545
    .line 546
    invoke-direct {v8, v1, v6, v4, v5}, Lr9/G;-><init>(LA7/c0;[ILjava/util/ArrayList;[Ls9/m;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v7, v8}, Lne/a;->f(Lw9/g;)I

    .line 550
    .line 551
    .line 552
    move-result v7

    .line 553
    const/16 v8, 0x64

    .line 554
    .line 555
    if-ne v7, v8, :cond_a

    .line 556
    .line 557
    move-wide/from16 v7, v21

    .line 558
    .line 559
    goto :goto_c

    .line 560
    :cond_a
    iget-object v1, v3, Lr9/K;->i:Lme/a;

    .line 561
    .line 562
    invoke-virtual {v1, v4}, Lme/a;->z(Ljava/util/ArrayList;)V

    .line 563
    .line 564
    .line 565
    aget v1, v6, v17

    .line 566
    .line 567
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 568
    .line 569
    .line 570
    move-result-wide v3

    .line 571
    invoke-static {}, LBa/c;->E()Z

    .line 572
    .line 573
    .line 574
    move-result v5

    .line 575
    if-eqz v5, :cond_b

    .line 576
    .line 577
    new-instance v5, Ljava/lang/StringBuilder;

    .line 578
    .line 579
    const-string v6, "LRU Garbage Collection:\n\tCounted targets in "

    .line 580
    .line 581
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    sub-long v6, v12, v21

    .line 585
    .line 586
    const-string v8, "ms\n"

    .line 587
    .line 588
    invoke-static {v5, v6, v7, v8}, LVa/M6;->s(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v5

    .line 592
    invoke-static {v5}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    move-result-object v5

    .line 596
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 597
    .line 598
    sub-long v6, v14, v12

    .line 599
    .line 600
    new-instance v10, Ljava/lang/StringBuilder;

    .line 601
    .line 602
    const-string v11, "\tDetermined least recently used "

    .line 603
    .line 604
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 608
    .line 609
    .line 610
    const-string v2, " sequence numbers in "

    .line 611
    .line 612
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v10, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    invoke-static {v2}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 633
    .line 634
    .line 635
    move-result-object v2

    .line 636
    sub-long v5, v19, v14

    .line 637
    .line 638
    new-instance v7, Ljava/lang/StringBuilder;

    .line 639
    .line 640
    const-string v10, "\tRemoved "

    .line 641
    .line 642
    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 646
    .line 647
    .line 648
    const-string v0, " targets in "

    .line 649
    .line 650
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    invoke-static {v0}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    sub-long v5, v3, v19

    .line 675
    .line 676
    new-instance v2, Ljava/lang/StringBuilder;

    .line 677
    .line 678
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    const-string v1, " documents in "

    .line 685
    .line 686
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    invoke-static {v0}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    sub-long v3, v3, v21

    .line 711
    .line 712
    new-instance v1, Ljava/lang/StringBuilder;

    .line 713
    .line 714
    const-string v2, "Total Duration: "

    .line 715
    .line 716
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 720
    .line 721
    .line 722
    const-string v2, "ms"

    .line 723
    .line 724
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    move/from16 v1, v17

    .line 739
    .line 740
    new-array v1, v1, [Ljava/lang/Object;

    .line 741
    .line 742
    const/4 v3, 0x1

    .line 743
    invoke-static {v9, v0, v3, v1}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 744
    .line 745
    .line 746
    :cond_b
    new-instance v0, Lr9/o;

    .line 747
    .line 748
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 749
    .line 750
    .line 751
    :goto_d
    return-object v0

    .line 752
    :catchall_0
    move-exception v0

    .line 753
    goto/16 :goto_a

    .line 754
    .line 755
    :goto_e
    if-eqz v11, :cond_c

    .line 756
    .line 757
    :try_start_5
    invoke-interface {v11}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 758
    .line 759
    .line 760
    goto :goto_f

    .line 761
    :catchall_1
    move-exception v0

    .line 762
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 763
    .line 764
    .line 765
    :cond_c
    :goto_f
    throw v1

    .line 766
    :catchall_2
    move-exception v0

    .line 767
    goto/16 :goto_8

    .line 768
    .line 769
    :goto_10
    if-eqz v15, :cond_d

    .line 770
    .line 771
    :try_start_6
    invoke-interface {v15}, Landroid/database/Cursor;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 772
    .line 773
    .line 774
    goto :goto_11

    .line 775
    :catchall_3
    move-exception v0

    .line 776
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 777
    .line 778
    .line 779
    :cond_d
    :goto_11
    throw v1

    .line 780
    :catchall_4
    move-exception v0

    .line 781
    goto/16 :goto_5

    .line 782
    .line 783
    :goto_12
    if-eqz v12, :cond_e

    .line 784
    .line 785
    :try_start_7
    invoke-interface {v12}, Landroid/database/Cursor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 786
    .line 787
    .line 788
    goto :goto_13

    .line 789
    :catchall_5
    move-exception v0

    .line 790
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 791
    .line 792
    .line 793
    :cond_e
    :goto_13
    throw v1

    .line 794
    :catchall_6
    move-exception v0

    .line 795
    goto/16 :goto_3

    .line 796
    .line 797
    :goto_14
    if-eqz v8, :cond_f

    .line 798
    .line 799
    :try_start_8
    invoke-interface {v8}, Landroid/database/Cursor;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 800
    .line 801
    .line 802
    goto :goto_15

    .line 803
    :catchall_7
    move-exception v0

    .line 804
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 805
    .line 806
    .line 807
    :cond_f
    :goto_15
    throw v1

    .line 808
    :catchall_8
    move-exception v0

    .line 809
    goto/16 :goto_1

    .line 810
    .line 811
    :goto_16
    if-eqz v12, :cond_10

    .line 812
    .line 813
    :try_start_9
    invoke-interface {v12}, Landroid/database/Cursor;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 814
    .line 815
    .line 816
    goto :goto_17

    .line 817
    :catchall_9
    move-exception v0

    .line 818
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 819
    .line 820
    .line 821
    :cond_10
    :goto_17
    throw v1

    .line 822
    :pswitch_1
    const/16 v16, 0x2

    .line 823
    .line 824
    check-cast v4, Lr9/l;

    .line 825
    .line 826
    check-cast v3, LC8/i;

    .line 827
    .line 828
    iget-object v0, v3, LC8/i;->b:Ljava/lang/Object;

    .line 829
    .line 830
    check-cast v0, Lt9/i;

    .line 831
    .line 832
    iget-object v1, v4, Lr9/l;->c:Lr9/v;

    .line 833
    .line 834
    iget-object v2, v3, LC8/i;->e:Ljava/lang/Object;

    .line 835
    .line 836
    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 837
    .line 838
    invoke-interface {v1, v0, v2}, Lr9/v;->j(Lt9/i;Lcom/google/protobuf/ByteString;)V

    .line 839
    .line 840
    .line 841
    invoke-virtual {v0}, Lt9/i;->b()Ljava/util/HashSet;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 846
    .line 847
    .line 848
    move-result-object v1

    .line 849
    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 850
    .line 851
    .line 852
    move-result v2

    .line 853
    iget-object v5, v3, LC8/i;->d:Ljava/lang/Object;

    .line 854
    .line 855
    check-cast v5, Ljava/util/ArrayList;

    .line 856
    .line 857
    iget-object v6, v0, Lt9/i;->d:Ljava/util/List;

    .line 858
    .line 859
    if-eqz v2, :cond_17

    .line 860
    .line 861
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v2

    .line 865
    check-cast v2, Ls9/h;

    .line 866
    .line 867
    iget-object v7, v4, Lr9/l;->e:Lr9/A;

    .line 868
    .line 869
    invoke-interface {v7, v2}, Lr9/A;->B(Ls9/h;)Ls9/k;

    .line 870
    .line 871
    .line 872
    move-result-object v8

    .line 873
    iget-object v9, v3, LC8/i;->f:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v9, Lc9/c;

    .line 876
    .line 877
    invoke-virtual {v9, v2}, Lc9/c;->b(Ls9/h;)Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v2

    .line 881
    check-cast v2, Ls9/o;

    .line 882
    .line 883
    if-eqz v2, :cond_11

    .line 884
    .line 885
    const/4 v9, 0x1

    .line 886
    goto :goto_19

    .line 887
    :cond_11
    const/4 v9, 0x0

    .line 888
    :goto_19
    const-string v10, "docVersions should contain every doc in the write."

    .line 889
    .line 890
    const/4 v11, 0x0

    .line 891
    new-array v12, v11, [Ljava/lang/Object;

    .line 892
    .line 893
    invoke-static {v9, v10, v12}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 894
    .line 895
    .line 896
    iget-object v9, v8, Ls9/k;->c:Ls9/o;

    .line 897
    .line 898
    invoke-virtual {v9, v2}, Ls9/o;->a(Ls9/o;)I

    .line 899
    .line 900
    .line 901
    move-result v2

    .line 902
    if-gez v2, :cond_15

    .line 903
    .line 904
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 905
    .line 906
    .line 907
    move-result v2

    .line 908
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 909
    .line 910
    .line 911
    move-result v9

    .line 912
    if-ne v9, v2, :cond_12

    .line 913
    .line 914
    const/4 v9, 0x1

    .line 915
    goto :goto_1a

    .line 916
    :cond_12
    const/4 v9, 0x0

    .line 917
    :goto_1a
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 918
    .line 919
    .line 920
    move-result-object v10

    .line 921
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 922
    .line 923
    .line 924
    move-result v11

    .line 925
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 926
    .line 927
    .line 928
    move-result-object v11

    .line 929
    move/from16 v12, v16

    .line 930
    .line 931
    new-array v13, v12, [Ljava/lang/Object;

    .line 932
    .line 933
    const/16 v17, 0x0

    .line 934
    .line 935
    aput-object v10, v13, v17

    .line 936
    .line 937
    const/16 v18, 0x1

    .line 938
    .line 939
    aput-object v11, v13, v18

    .line 940
    .line 941
    const-string v10, "Mismatch between mutations length (%d) and results length (%d)"

    .line 942
    .line 943
    invoke-static {v9, v10, v13}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 944
    .line 945
    .line 946
    move/from16 v9, v17

    .line 947
    .line 948
    :goto_1b
    if-ge v9, v2, :cond_14

    .line 949
    .line 950
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v10

    .line 954
    check-cast v10, Lt9/h;

    .line 955
    .line 956
    iget-object v11, v10, Lt9/h;->a:Ls9/h;

    .line 957
    .line 958
    iget-object v13, v8, Ls9/k;->a:Ls9/h;

    .line 959
    .line 960
    invoke-virtual {v11, v13}, Ls9/h;->equals(Ljava/lang/Object;)Z

    .line 961
    .line 962
    .line 963
    move-result v11

    .line 964
    if-eqz v11, :cond_13

    .line 965
    .line 966
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v11

    .line 970
    check-cast v11, Lt9/j;

    .line 971
    .line 972
    invoke-virtual {v10, v8, v11}, Lt9/h;->b(Ls9/k;Lt9/j;)V

    .line 973
    .line 974
    .line 975
    :cond_13
    const/4 v10, 0x1

    .line 976
    add-int/2addr v9, v10

    .line 977
    goto :goto_1b

    .line 978
    :cond_14
    const/4 v10, 0x1

    .line 979
    iget v2, v8, Ls9/k;->b:I

    .line 980
    .line 981
    invoke-static {v2, v10}, LA/f;->b(II)Z

    .line 982
    .line 983
    .line 984
    move-result v2

    .line 985
    if-nez v2, :cond_16

    .line 986
    .line 987
    iget-object v2, v3, LC8/i;->c:Ljava/lang/Object;

    .line 988
    .line 989
    check-cast v2, Ls9/o;

    .line 990
    .line 991
    invoke-interface {v7, v8, v2}, Lr9/A;->F(Ls9/k;Ls9/o;)V

    .line 992
    .line 993
    .line 994
    goto :goto_1c

    .line 995
    :cond_15
    move/from16 v12, v16

    .line 996
    .line 997
    const/16 v17, 0x0

    .line 998
    .line 999
    :cond_16
    :goto_1c
    move/from16 v16, v12

    .line 1000
    .line 1001
    goto/16 :goto_18

    .line 1002
    .line 1003
    :cond_17
    const/16 v17, 0x0

    .line 1004
    .line 1005
    iget-object v1, v4, Lr9/l;->c:Lr9/v;

    .line 1006
    .line 1007
    invoke-interface {v1, v0}, Lr9/v;->e(Lt9/i;)V

    .line 1008
    .line 1009
    .line 1010
    iget-object v1, v4, Lr9/l;->c:Lr9/v;

    .line 1011
    .line 1012
    invoke-interface {v1}, Lr9/v;->a()V

    .line 1013
    .line 1014
    .line 1015
    iget-object v1, v4, Lr9/l;->d:Lr9/b;

    .line 1016
    .line 1017
    iget v2, v0, Lt9/i;->a:I

    .line 1018
    .line 1019
    invoke-interface {v1, v2}, Lr9/b;->f(I)V

    .line 1020
    .line 1021
    .line 1022
    iget-object v1, v4, Lr9/l;->f:LVa/Za;

    .line 1023
    .line 1024
    new-instance v2, Ljava/util/HashSet;

    .line 1025
    .line 1026
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 1027
    .line 1028
    .line 1029
    move/from16 v3, v17

    .line 1030
    .line 1031
    :goto_1d
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1032
    .line 1033
    .line 1034
    move-result v7

    .line 1035
    if-ge v3, v7, :cond_19

    .line 1036
    .line 1037
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v7

    .line 1041
    check-cast v7, Lt9/j;

    .line 1042
    .line 1043
    iget-object v7, v7, Lt9/j;->b:Ljava/util/ArrayList;

    .line 1044
    .line 1045
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1046
    .line 1047
    .line 1048
    move-result v7

    .line 1049
    if-nez v7, :cond_18

    .line 1050
    .line 1051
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v7

    .line 1055
    check-cast v7, Lt9/h;

    .line 1056
    .line 1057
    iget-object v7, v7, Lt9/h;->a:Ls9/h;

    .line 1058
    .line 1059
    invoke-virtual {v2, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1060
    .line 1061
    .line 1062
    :cond_18
    const/16 v18, 0x1

    .line 1063
    .line 1064
    add-int/lit8 v3, v3, 0x1

    .line 1065
    .line 1066
    goto :goto_1d

    .line 1067
    :cond_19
    iget-object v3, v1, LVa/Za;->a:Ljava/lang/Object;

    .line 1068
    .line 1069
    check-cast v3, Lr9/A;

    .line 1070
    .line 1071
    invoke-interface {v3, v2}, Lr9/A;->y(Ljava/lang/Iterable;)Ljava/util/HashMap;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v2

    .line 1075
    invoke-virtual {v1, v2}, LVa/Za;->k(Ljava/util/Map;)Ljava/util/HashMap;

    .line 1076
    .line 1077
    .line 1078
    iget-object v1, v4, Lr9/l;->f:LVa/Za;

    .line 1079
    .line 1080
    invoke-virtual {v0}, Lt9/i;->b()Ljava/util/HashSet;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v0

    .line 1084
    invoke-virtual {v1, v0}, LVa/Za;->e(Ljava/lang/Iterable;)Lc9/c;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v0

    .line 1088
    return-object v0

    .line 1089
    :pswitch_2
    check-cast v4, Lr9/l;

    .line 1090
    .line 1091
    iget-object v0, v4, Lr9/l;->j:Lr9/a;

    .line 1092
    .line 1093
    check-cast v3, Ljava/lang/String;

    .line 1094
    .line 1095
    invoke-interface {v0, v3}, Lr9/a;->A(Ljava/lang/String;)Lo9/j;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v0

    .line 1099
    return-object v0

    .line 1100
    nop

    .line 1101
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public o(LC6/l;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Laa/f;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Laa/f;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LL8/b;

    .line 8
    .line 9
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, v1, LL8/b;->f:LL8/e;

    .line 13
    .line 14
    invoke-interface {v0, p1}, LL8/e;->o(LC6/l;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public onBidTokenResult(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;)V
    .locals 2

    .line 1
    iget-object v0, p0, Laa/f;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/mediation/adapters/MolocoMediationAdapter;

    iget-object v1, p0, Laa/f;->c:Ljava/lang/Object;

    check-cast v1, Lcom/applovin/mediation/adapter/listeners/MaxSignalCollectionListener;

    invoke-static {v0, v1, p1, p2}, Lcom/applovin/mediation/adapters/MolocoMediationAdapter;->h(Lcom/applovin/mediation/adapters/MolocoMediationAdapter;Lcom/applovin/mediation/adapter/listeners/MaxSignalCollectionListener;Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;)V

    return-void
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 12

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    iget v1, p0, Laa/f;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Laa/f;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LR1/q;

    .line 11
    .line 12
    iget-object v2, p0, Laa/f;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lp9/B;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1, p1}, LR1/q;->s(Lcom/google/android/gms/tasks/Task;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_7

    .line 29
    .line 30
    :cond_0
    iget-boolean v3, v2, Lp9/B;->d:Z

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    xor-int/2addr v3, v4

    .line 34
    const/4 v5, 0x0

    .line 35
    new-array v5, v5, [Ljava/lang/Object;

    .line 36
    .line 37
    const-string v6, "A transaction object cannot be used after its update callback has been invoked."

    .line 38
    .line 39
    invoke-static {v3, v6, v5}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v3, v2, Lp9/B;->e:Lm9/G;

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    invoke-static {v3}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    goto/16 :goto_6

    .line 51
    .line 52
    :cond_1
    new-instance v3, Ljava/util/HashSet;

    .line 53
    .line 54
    iget-object v5, v2, Lp9/B;->b:Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-direct {v3, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 61
    .line 62
    .line 63
    iget-object v5, v2, Lp9/B;->c:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_2

    .line 74
    .line 75
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    check-cast v6, Lt9/h;

    .line 80
    .line 81
    iget-object v6, v6, Lt9/h;->a:Ls9/h;

    .line 82
    .line 83
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_3

    .line 96
    .line 97
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    check-cast v5, Ls9/h;

    .line 102
    .line 103
    iget-object v6, v2, Lp9/B;->c:Ljava/util/ArrayList;

    .line 104
    .line 105
    new-instance v7, Lt9/q;

    .line 106
    .line 107
    invoke-virtual {v2, v5}, Lp9/B;->a(Ls9/h;)Lt9/m;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-direct {v7, v5, v8}, Lt9/h;-><init>(Ls9/h;Lt9/m;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    iput-boolean v4, v2, Lp9/B;->d:Z

    .line 119
    .line 120
    iget-object v3, v2, Lp9/B;->a:Lv9/g;

    .line 121
    .line 122
    iget-object v2, v2, Lp9/B;->c:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-static {}, Lka/x;->e()Lka/w;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    iget-object v6, v3, Lv9/g;->a:Lv9/o;

    .line 132
    .line 133
    iget-object v6, v6, Lv9/o;->b:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v5, v6}, Lka/w;->b(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    if-eqz v6, :cond_4

    .line 147
    .line 148
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    check-cast v6, Lt9/h;

    .line 153
    .line 154
    iget-object v7, v3, Lv9/g;->a:Lv9/o;

    .line 155
    .line 156
    invoke-virtual {v7, v6}, Lv9/o;->i(Lt9/h;)Lka/G1;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-virtual {v5, v6}, Lka/w;->a(Lka/G1;)V

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_4
    iget-object v2, v3, Lv9/g;->c:Lv9/m;

    .line 165
    .line 166
    sget-object v6, Lka/e0;->b:LF6/r;

    .line 167
    .line 168
    if-nez v6, :cond_6

    .line 169
    .line 170
    const-class v7, Lka/e0;

    .line 171
    .line 172
    monitor-enter v7

    .line 173
    :try_start_0
    sget-object v6, Lka/e0;->b:LF6/r;

    .line 174
    .line 175
    if-nez v6, :cond_5

    .line 176
    .line 177
    invoke-static {}, LF6/r;->d()LM/y;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    sget-object v8, Lmd/c0;->a:Lmd/c0;

    .line 182
    .line 183
    iput-object v8, v6, LM/y;->d:Ljava/lang/Object;

    .line 184
    .line 185
    const-string v8, "google.firestore.v1.Firestore"

    .line 186
    .line 187
    const-string v9, "Commit"

    .line 188
    .line 189
    invoke-static {v8, v9}, LF6/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    iput-object v8, v6, LM/y;->e:Ljava/lang/Object;

    .line 194
    .line 195
    iput-boolean v4, v6, LM/y;->a:Z

    .line 196
    .line 197
    invoke-static {}, Lka/x;->d()Lka/x;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    sget-object v8, Ltd/c;->a:Lcom/google/protobuf/ExtensionRegistryLite;

    .line 202
    .line 203
    new-instance v8, Ltd/b;

    .line 204
    .line 205
    invoke-direct {v8, v4}, Ltd/b;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 206
    .line 207
    .line 208
    iput-object v8, v6, LM/y;->b:Ljava/lang/Object;

    .line 209
    .line 210
    invoke-static {}, Lka/A;->c()Lka/A;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    new-instance v8, Ltd/b;

    .line 215
    .line 216
    invoke-direct {v8, v4}, Ltd/b;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 217
    .line 218
    .line 219
    iput-object v8, v6, LM/y;->c:Ljava/lang/Object;

    .line 220
    .line 221
    invoke-virtual {v6}, LM/y;->d()LF6/r;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    sput-object v4, Lka/e0;->b:LF6/r;

    .line 226
    .line 227
    move-object v6, v4

    .line 228
    goto :goto_3

    .line 229
    :catchall_0
    move-exception p1

    .line 230
    goto :goto_4

    .line 231
    :cond_5
    :goto_3
    monitor-exit v7

    .line 232
    goto :goto_5

    .line 233
    :goto_4
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 234
    throw p1

    .line 235
    :cond_6
    :goto_5
    invoke-virtual {v5}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    check-cast v4, Lka/x;

    .line 240
    .line 241
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    new-instance v5, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 245
    .line 246
    invoke-direct {v5}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 247
    .line 248
    .line 249
    iget-object v7, v2, Lv9/m;->d:LX8/c;

    .line 250
    .line 251
    iget-object v8, v7, LX8/c;->a:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v8, Lcom/google/android/gms/tasks/Task;

    .line 254
    .line 255
    iget-object v9, v7, LX8/c;->b:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v9, Lw9/e;

    .line 258
    .line 259
    iget-object v9, v9, Lw9/e;->a:Lw9/c;

    .line 260
    .line 261
    new-instance v10, Laa/f;

    .line 262
    .line 263
    const/16 v11, 0x1a

    .line 264
    .line 265
    invoke-direct {v10, v11, v7, v6}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    iget-object v7, v2, Lv9/m;->a:Lw9/e;

    .line 273
    .line 274
    iget-object v7, v7, Lw9/e;->a:Lw9/c;

    .line 275
    .line 276
    new-instance v8, LA5/g;

    .line 277
    .line 278
    const/16 v9, 0x17

    .line 279
    .line 280
    invoke-direct {v8, v2, v5, v4, v9}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v5}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    iget-object v4, v3, Lv9/g;->b:Lw9/e;

    .line 291
    .line 292
    iget-object v4, v4, Lw9/e;->a:Lw9/c;

    .line 293
    .line 294
    new-instance v5, Lo1/c;

    .line 295
    .line 296
    const/4 v6, 0x7

    .line 297
    invoke-direct {v5, v3, v6}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    sget-object v3, Lw9/k;->b:Lcom/applovin/impl/T0;

    .line 305
    .line 306
    new-instance v4, Lm9/B;

    .line 307
    .line 308
    invoke-direct {v4, v0}, Lm9/B;-><init>(I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    :goto_6
    iget-object v3, v1, LR1/q;->b:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v3, Lw9/e;

    .line 318
    .line 319
    iget-object v3, v3, Lw9/e;->a:Lw9/c;

    .line 320
    .line 321
    new-instance v4, Laa/f;

    .line 322
    .line 323
    invoke-direct {v4, v0, v1, p1}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 327
    .line 328
    .line 329
    :goto_7
    return-void

    .line 330
    :pswitch_0
    iget-object v0, p0, Laa/f;->b:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v0, LR1/q;

    .line 333
    .line 334
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    if-eqz v1, :cond_7

    .line 342
    .line 343
    iget-object p1, v0, LR1/q;->f:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 346
    .line 347
    iget-object v0, p0, Laa/f;->c:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v0, Lcom/google/android/gms/tasks/Task;

    .line 350
    .line 351
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    goto :goto_8

    .line 359
    :cond_7
    invoke-virtual {v0, p1}, LR1/q;->s(Lcom/google/android/gms/tasks/Task;)V

    .line 360
    .line 361
    .line 362
    :goto_8
    return-void

    .line 363
    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public onSdkInitialized(Lcom/applovin/sdk/AppLovinSdkConfiguration;)V
    .locals 2

    .line 1
    iget-object v0, p0, Laa/f;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/applovin_max/AppLovinMAX;

    iget-object v1, p0, Laa/f;->c:Ljava/lang/Object;

    check-cast v1, Luc/q;

    invoke-static {v0, v1, p1}, Lcom/applovin/applovin_max/AppLovinMAX;->b(Lcom/applovin/applovin_max/AppLovinMAX;Luc/q;Lcom/applovin/sdk/AppLovinSdkConfiguration;)V

    return-void
.end method

.method public onUnityAdsTokenReady(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Laa/f;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/mediation/adapters/UnityAdsMediationAdapter;

    iget-object v1, p0, Laa/f;->c:Ljava/lang/Object;

    check-cast v1, Lcom/applovin/mediation/adapter/listeners/MaxSignalCollectionListener;

    invoke-static {v0, v1, p1}, Lcom/applovin/mediation/adapters/UnityAdsMediationAdapter;->a(Lcom/applovin/mediation/adapters/UnityAdsMediationAdapter;Lcom/applovin/mediation/adapter/listeners/MaxSignalCollectionListener;Ljava/lang/String;)V

    return-void
.end method

.method public onUserEarnedReward(LR6/b;)V
    .locals 2

    .line 1
    iget v0, p0, Laa/f;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Laa/f;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/mediation/adapters/GoogleMediationAdapter;

    iget-object v1, p0, Laa/f;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzccz;

    invoke-static {v0, v1, p1}, Lcom/applovin/mediation/adapters/GoogleMediationAdapter;->a(Lcom/applovin/mediation/adapters/GoogleMediationAdapter;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzccz;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Laa/f;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/mediation/adapters/GoogleAdManagerMediationAdapter;

    iget-object v1, p0, Laa/f;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzccz;

    invoke-static {v0, v1, p1}, Lcom/applovin/mediation/adapters/GoogleAdManagerMediationAdapter;->a(Lcom/applovin/mediation/adapters/GoogleAdManagerMediationAdapter;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzccz;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    iget v3, p0, Laa/f;->a:I

    .line 5
    .line 6
    sparse-switch v3, :sswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Laa/f;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, LX8/c;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lmd/S;

    .line 21
    .line 22
    iget-object v0, v0, LX8/c;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lmd/c;

    .line 25
    .line 26
    iget-object v1, p0, Laa/f;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, LF6/r;

    .line 29
    .line 30
    invoke-virtual {p1, v1, v0}, Lmd/d;->h(LF6/r;Lmd/c;)Lmd/f;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :sswitch_0
    iget-object v0, p0, Laa/f;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lv9/g;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_1

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    instance-of v1, v1, Lm9/G;

    .line 57
    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Lm9/G;

    .line 65
    .line 66
    iget-object v1, v1, Lm9/G;->a:Lm9/F;

    .line 67
    .line 68
    sget-object v2, Lm9/F;->l:Lm9/F;

    .line 69
    .line 70
    if-ne v1, v2, :cond_0

    .line 71
    .line 72
    iget-object v0, v0, Lv9/g;->c:Lv9/m;

    .line 73
    .line 74
    iget-object v1, v0, Lv9/m;->b:Ln9/d;

    .line 75
    .line 76
    invoke-virtual {v1}, Ln9/d;->Y()V

    .line 77
    .line 78
    .line 79
    iget-object v0, v0, Lv9/m;->c:Ln9/b;

    .line 80
    .line 81
    invoke-virtual {v0}, Ln9/b;->X()V

    .line 82
    .line 83
    .line 84
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    throw p1

    .line 89
    :cond_1
    new-instance v0, Ljava/util/HashMap;

    .line 90
    .line 91
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Lka/y0;

    .line 99
    .line 100
    invoke-virtual {p1}, Lka/y0;->c()Lka/d;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Lka/d;->b()Ljava/util/Map;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-eqz v3, :cond_2

    .line 121
    .line 122
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    check-cast v3, Ljava/util/Map$Entry;

    .line 127
    .line 128
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    iget-object v5, p0, Laa/f;->c:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v5, Ljava/util/HashMap;

    .line 135
    .line 136
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    new-array v7, v2, [Ljava/lang/Object;

    .line 145
    .line 146
    aput-object v6, v7, v1

    .line 147
    .line 148
    const-string v6, "%s not present in aliasMap"

    .line 149
    .line 150
    invoke-static {v4, v6, v7}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    check-cast v4, Ljava/lang/String;

    .line 162
    .line 163
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    check-cast v3, Lka/C1;

    .line 168
    .line 169
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_2
    return-object v0

    .line 174
    :sswitch_1
    iget-object v1, p0, Laa/f;->b:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v1, Lm9/e;

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    iget-object v3, p0, Laa/f;->c:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v3, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 188
    .line 189
    if-eqz v2, :cond_3

    .line 190
    .line 191
    new-instance v2, Lm9/f;

    .line 192
    .line 193
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    check-cast p1, Ljava/util/Map;

    .line 198
    .line 199
    invoke-direct {v2, v1, p1}, Lm9/f;-><init>(Lm9/e;Ljava/util/Map;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {v3, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 211
    .line 212
    .line 213
    :goto_1
    return-object v0

    .line 214
    :sswitch_2
    iget-object p1, p0, Laa/f;->b:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast p1, Laa/n;

    .line 217
    .line 218
    iget-object v3, p0, Laa/f;->c:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v3, Lcom/google/android/gms/tasks/Task;

    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    const/16 v4, 0x193

    .line 226
    .line 227
    const/16 v5, 0xc8

    .line 228
    .line 229
    :try_start_0
    invoke-virtual {v3}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    if-eqz v6, :cond_9

    .line 234
    .line 235
    invoke-virtual {p1, v2}, Laa/n;->i(Z)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v3}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    check-cast v3, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 243
    .line 244
    :try_start_1
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object v7
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 252
    if-ne v6, v5, :cond_4

    .line 253
    .line 254
    :try_start_2
    monitor-enter p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 255
    const/16 v8, 0x8

    .line 256
    .line 257
    :try_start_3
    iput v8, p1, Laa/n;->c:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 258
    .line 259
    :try_start_4
    monitor-exit p1

    .line 260
    iget-object v8, p1, Laa/n;->o:Laa/k;

    .line 261
    .line 262
    sget-object v9, Laa/k;->f:Ljava/util/Date;

    .line 263
    .line 264
    invoke-virtual {v8, v1, v9}, Laa/k;->e(ILjava/util/Date;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p1, v3}, Laa/n;->k(Ljava/net/HttpURLConnection;)LD6/o;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    invoke-virtual {v8}, LD6/o;->g()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 272
    .line 273
    .line 274
    goto :goto_2

    .line 275
    :catchall_0
    move-exception v0

    .line 276
    goto/16 :goto_9

    .line 277
    .line 278
    :catch_0
    move-exception v6

    .line 279
    goto/16 :goto_5

    .line 280
    .line 281
    :catchall_1
    move-exception v6

    .line 282
    :try_start_5
    monitor-exit p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 283
    :try_start_6
    throw v6
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 284
    :cond_4
    :goto_2
    invoke-static {v3}, Laa/n;->b(Ljava/net/HttpURLConnection;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1, v1}, Laa/n;->i(Z)V

    .line 288
    .line 289
    .line 290
    invoke-static {v6}, Laa/n;->d(I)Z

    .line 291
    .line 292
    .line 293
    move-result v8

    .line 294
    if-eqz v8, :cond_5

    .line 295
    .line 296
    new-instance v9, Ljava/util/Date;

    .line 297
    .line 298
    iget-object v10, p1, Laa/n;->n:Ln7/b;

    .line 299
    .line 300
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 304
    .line 305
    .line 306
    move-result-wide v10

    .line 307
    invoke-direct {v9, v10, v11}, Ljava/util/Date;-><init>(J)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p1, v9}, Laa/n;->l(Ljava/util/Date;)V

    .line 311
    .line 312
    .line 313
    :cond_5
    if-nez v8, :cond_8

    .line 314
    .line 315
    if-ne v6, v5, :cond_6

    .line 316
    .line 317
    goto :goto_4

    .line 318
    :cond_6
    const-string v5, "Unable to connect to the server. Try again in a few minutes. HTTP status code: %d"

    .line 319
    .line 320
    new-array v2, v2, [Ljava/lang/Object;

    .line 321
    .line 322
    aput-object v7, v2, v1

    .line 323
    .line 324
    invoke-static {v5, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    if-ne v6, v4, :cond_7

    .line 329
    .line 330
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    invoke-static {v2}, Laa/n;->f(Ljava/io/InputStream;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    :cond_7
    new-instance v3, LZ9/h;

    .line 339
    .line 340
    invoke-direct {v3, v6, v2, v1}, LZ9/h;-><init>(ILjava/lang/String;I)V

    .line 341
    .line 342
    .line 343
    :goto_3
    invoke-virtual {p1, v3}, Laa/n;->g(LZ9/f;)V

    .line 344
    .line 345
    .line 346
    goto/16 :goto_8

    .line 347
    .line 348
    :cond_8
    :goto_4
    invoke-virtual {p1}, Laa/n;->h()V

    .line 349
    .line 350
    .line 351
    goto/16 :goto_8

    .line 352
    .line 353
    :catchall_2
    move-exception v6

    .line 354
    move-object v7, v0

    .line 355
    move-object v0, v6

    .line 356
    goto/16 :goto_9

    .line 357
    .line 358
    :catch_1
    move-exception v6

    .line 359
    move-object v7, v0

    .line 360
    goto :goto_5

    .line 361
    :catchall_3
    move-exception v3

    .line 362
    move-object v7, v0

    .line 363
    move-object v0, v3

    .line 364
    move-object v3, v7

    .line 365
    goto/16 :goto_9

    .line 366
    .line 367
    :catch_2
    move-exception v6

    .line 368
    move-object v3, v0

    .line 369
    move-object v7, v3

    .line 370
    goto :goto_5

    .line 371
    :cond_9
    :try_start_7
    new-instance v6, Ljava/io/IOException;

    .line 372
    .line 373
    invoke-virtual {v3}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    invoke-direct {v6, v3}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 378
    .line 379
    .line 380
    throw v6
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 381
    :goto_5
    :try_start_8
    const-string v8, "FirebaseRemoteConfig"

    .line 382
    .line 383
    const-string v9, "Exception connecting to real-time RC backend. Retrying the connection..."

    .line 384
    .line 385
    invoke-static {v8, v9, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 386
    .line 387
    .line 388
    invoke-static {v3}, Laa/n;->b(Ljava/net/HttpURLConnection;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {p1, v1}, Laa/n;->i(Z)V

    .line 392
    .line 393
    .line 394
    if-eqz v7, :cond_b

    .line 395
    .line 396
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 397
    .line 398
    .line 399
    move-result v6

    .line 400
    invoke-static {v6}, Laa/n;->d(I)Z

    .line 401
    .line 402
    .line 403
    move-result v6

    .line 404
    if-eqz v6, :cond_a

    .line 405
    .line 406
    goto :goto_6

    .line 407
    :cond_a
    move v6, v1

    .line 408
    goto :goto_7

    .line 409
    :cond_b
    :goto_6
    move v6, v2

    .line 410
    :goto_7
    if-eqz v6, :cond_c

    .line 411
    .line 412
    new-instance v8, Ljava/util/Date;

    .line 413
    .line 414
    iget-object v9, p1, Laa/n;->n:Ln7/b;

    .line 415
    .line 416
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 420
    .line 421
    .line 422
    move-result-wide v9

    .line 423
    invoke-direct {v8, v9, v10}, Ljava/util/Date;-><init>(J)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {p1, v8}, Laa/n;->l(Ljava/util/Date;)V

    .line 427
    .line 428
    .line 429
    :cond_c
    if-nez v6, :cond_8

    .line 430
    .line 431
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 432
    .line 433
    .line 434
    move-result v6

    .line 435
    if-ne v6, v5, :cond_d

    .line 436
    .line 437
    goto :goto_4

    .line 438
    :cond_d
    const-string v5, "Unable to connect to the server. Try again in a few minutes. HTTP status code: %d"

    .line 439
    .line 440
    new-array v2, v2, [Ljava/lang/Object;

    .line 441
    .line 442
    aput-object v7, v2, v1

    .line 443
    .line 444
    invoke-static {v5, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 449
    .line 450
    .line 451
    move-result v5

    .line 452
    if-ne v5, v4, :cond_e

    .line 453
    .line 454
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    invoke-static {v2}, Laa/n;->f(Ljava/io/InputStream;)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    :cond_e
    new-instance v3, LZ9/h;

    .line 463
    .line 464
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 465
    .line 466
    .line 467
    move-result v4

    .line 468
    invoke-direct {v3, v4, v2, v1}, LZ9/h;-><init>(ILjava/lang/String;I)V

    .line 469
    .line 470
    .line 471
    goto/16 :goto_3

    .line 472
    .line 473
    :goto_8
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 474
    .line 475
    .line 476
    move-result-object p1

    .line 477
    return-object p1

    .line 478
    :goto_9
    invoke-static {v3}, Laa/n;->b(Ljava/net/HttpURLConnection;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {p1, v1}, Laa/n;->i(Z)V

    .line 482
    .line 483
    .line 484
    if-eqz v7, :cond_10

    .line 485
    .line 486
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 487
    .line 488
    .line 489
    move-result v6

    .line 490
    invoke-static {v6}, Laa/n;->d(I)Z

    .line 491
    .line 492
    .line 493
    move-result v6

    .line 494
    if-eqz v6, :cond_f

    .line 495
    .line 496
    goto :goto_a

    .line 497
    :cond_f
    move v6, v1

    .line 498
    goto :goto_b

    .line 499
    :cond_10
    :goto_a
    move v6, v2

    .line 500
    :goto_b
    if-eqz v6, :cond_11

    .line 501
    .line 502
    new-instance v8, Ljava/util/Date;

    .line 503
    .line 504
    iget-object v9, p1, Laa/n;->n:Ln7/b;

    .line 505
    .line 506
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 510
    .line 511
    .line 512
    move-result-wide v9

    .line 513
    invoke-direct {v8, v9, v10}, Ljava/util/Date;-><init>(J)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {p1, v8}, Laa/n;->l(Ljava/util/Date;)V

    .line 517
    .line 518
    .line 519
    :cond_11
    if-nez v6, :cond_13

    .line 520
    .line 521
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 522
    .line 523
    .line 524
    move-result v6

    .line 525
    if-eq v6, v5, :cond_13

    .line 526
    .line 527
    const-string v5, "Unable to connect to the server. Try again in a few minutes. HTTP status code: %d"

    .line 528
    .line 529
    new-array v2, v2, [Ljava/lang/Object;

    .line 530
    .line 531
    aput-object v7, v2, v1

    .line 532
    .line 533
    invoke-static {v5, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 538
    .line 539
    .line 540
    move-result v5

    .line 541
    if-ne v5, v4, :cond_12

    .line 542
    .line 543
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    invoke-static {v2}, Laa/n;->f(Ljava/io/InputStream;)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    :cond_12
    new-instance v3, LZ9/h;

    .line 552
    .line 553
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 554
    .line 555
    .line 556
    move-result v4

    .line 557
    invoke-direct {v3, v4, v2, v1}, LZ9/h;-><init>(ILjava/lang/String;I)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {p1, v3}, Laa/n;->g(LZ9/f;)V

    .line 561
    .line 562
    .line 563
    goto :goto_c

    .line 564
    :cond_13
    invoke-virtual {p1}, Laa/n;->h()V

    .line 565
    .line 566
    .line 567
    :goto_c
    throw v0

    .line 568
    :sswitch_3
    iget-object v0, p0, Laa/f;->c:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v0, Ljava/util/HashMap;

    .line 571
    .line 572
    iget-object v1, p0, Laa/f;->b:Ljava/lang/Object;

    .line 573
    .line 574
    check-cast v1, Laa/h;

    .line 575
    .line 576
    const-wide/16 v2, 0x0

    .line 577
    .line 578
    invoke-virtual {v1, p1, v2, v3, v0}, Laa/h;->b(Lcom/google/android/gms/tasks/Task;JLjava/util/HashMap;)Lcom/google/android/gms/tasks/Task;

    .line 579
    .line 580
    .line 581
    move-result-object p1

    .line 582
    return-object p1

    .line 583
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x1 -> :sswitch_2
        0xc -> :sswitch_1
        0x19 -> :sswitch_0
    .end sparse-switch
.end method
