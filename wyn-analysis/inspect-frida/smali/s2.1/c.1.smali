.class public final Ls2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:F

.field public final l:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;IIIIIIIIIFLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls2/c;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput p2, p0, Ls2/c;->b:I

    .line 7
    .line 8
    iput p3, p0, Ls2/c;->c:I

    .line 9
    .line 10
    iput p4, p0, Ls2/c;->d:I

    .line 11
    .line 12
    iput p5, p0, Ls2/c;->e:I

    .line 13
    .line 14
    iput p6, p0, Ls2/c;->f:I

    .line 15
    .line 16
    iput p7, p0, Ls2/c;->g:I

    .line 17
    .line 18
    iput p8, p0, Ls2/c;->h:I

    .line 19
    .line 20
    iput p9, p0, Ls2/c;->i:I

    .line 21
    .line 22
    iput p10, p0, Ls2/c;->j:I

    .line 23
    .line 24
    iput p11, p0, Ls2/c;->k:F

    .line 25
    .line 26
    iput-object p12, p0, Ls2/c;->l:Ljava/lang/String;

    .line 27
    .line 28
    return-void
.end method

.method public static a(LQ1/o;)Ls2/c;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    :try_start_0
    invoke-virtual {v0, v1}, LQ1/o;->H(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, LQ1/o;->u()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x3

    .line 12
    and-int/2addr v2, v3

    .line 13
    add-int/lit8 v6, v2, 0x1

    .line 14
    .line 15
    if-eq v6, v3, :cond_3

    .line 16
    .line 17
    new-instance v5, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, LQ1/o;->u()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    and-int/lit8 v2, v2, 0x1f

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    move v4, v3

    .line 30
    :goto_0
    if-ge v4, v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, LQ1/o;->A()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    iget v8, v0, LQ1/o;->b:I

    .line 37
    .line 38
    invoke-virtual {v0, v7}, LQ1/o;->H(I)V

    .line 39
    .line 40
    .line 41
    iget-object v9, v0, LQ1/o;->a:[B

    .line 42
    .line 43
    sget-object v10, LQ1/a;->a:[B

    .line 44
    .line 45
    add-int/lit8 v10, v7, 0x4

    .line 46
    .line 47
    new-array v10, v10, [B

    .line 48
    .line 49
    sget-object v11, LQ1/a;->a:[B

    .line 50
    .line 51
    invoke-static {v11, v3, v10, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 52
    .line 53
    .line 54
    invoke-static {v9, v8, v10, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {v0}, LQ1/o;->u()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    move v7, v3

    .line 68
    :goto_1
    if-ge v7, v4, :cond_1

    .line 69
    .line 70
    invoke-virtual {v0}, LQ1/o;->A()I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    iget v9, v0, LQ1/o;->b:I

    .line 75
    .line 76
    invoke-virtual {v0, v8}, LQ1/o;->H(I)V

    .line 77
    .line 78
    .line 79
    iget-object v10, v0, LQ1/o;->a:[B

    .line 80
    .line 81
    sget-object v11, LQ1/a;->a:[B

    .line 82
    .line 83
    add-int/lit8 v11, v8, 0x4

    .line 84
    .line 85
    new-array v11, v11, [B

    .line 86
    .line 87
    sget-object v12, LQ1/a;->a:[B

    .line 88
    .line 89
    invoke-static {v12, v3, v11, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 90
    .line 91
    .line 92
    invoke-static {v10, v9, v11, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    add-int/lit8 v7, v7, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    if-lez v2, :cond_2

    .line 102
    .line 103
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, [B

    .line 108
    .line 109
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, [B

    .line 114
    .line 115
    array-length v0, v0

    .line 116
    invoke-static {v6, v0, v1}, LR1/n;->i(II[B)LR1/m;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget v1, v0, LR1/m;->e:I

    .line 121
    .line 122
    iget v2, v0, LR1/m;->f:I

    .line 123
    .line 124
    iget v3, v0, LR1/m;->h:I

    .line 125
    .line 126
    add-int/lit8 v3, v3, 0x8

    .line 127
    .line 128
    iget v4, v0, LR1/m;->i:I

    .line 129
    .line 130
    add-int/lit8 v4, v4, 0x8

    .line 131
    .line 132
    iget v7, v0, LR1/m;->p:I

    .line 133
    .line 134
    iget v8, v0, LR1/m;->q:I

    .line 135
    .line 136
    iget v9, v0, LR1/m;->r:I

    .line 137
    .line 138
    iget v10, v0, LR1/m;->s:I

    .line 139
    .line 140
    iget v11, v0, LR1/m;->g:F

    .line 141
    .line 142
    iget v12, v0, LR1/m;->a:I

    .line 143
    .line 144
    iget v13, v0, LR1/m;->b:I

    .line 145
    .line 146
    iget v0, v0, LR1/m;->c:I

    .line 147
    .line 148
    invoke-static {v12, v13, v0}, LQ1/a;->a(III)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    move v12, v8

    .line 153
    move v13, v9

    .line 154
    move v14, v10

    .line 155
    move v15, v11

    .line 156
    move v8, v2

    .line 157
    move v9, v3

    .line 158
    move v10, v4

    .line 159
    move v11, v7

    .line 160
    move v7, v1

    .line 161
    :goto_2
    move-object/from16 v16, v0

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_2
    const/4 v1, -0x1

    .line 165
    const/high16 v11, 0x3f800000    # 1.0f

    .line 166
    .line 167
    const/4 v0, 0x0

    .line 168
    const/16 v10, 0x10

    .line 169
    .line 170
    move v7, v1

    .line 171
    move v8, v7

    .line 172
    move v9, v8

    .line 173
    move v12, v9

    .line 174
    move v13, v12

    .line 175
    move v14, v10

    .line 176
    move v15, v11

    .line 177
    move v10, v13

    .line 178
    move v11, v10

    .line 179
    goto :goto_2

    .line 180
    :goto_3
    new-instance v4, Ls2/c;

    .line 181
    .line 182
    invoke-direct/range {v4 .. v16}, Ls2/c;-><init>(Ljava/util/ArrayList;IIIIIIIIIFLjava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return-object v4

    .line 186
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 187
    .line 188
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 189
    .line 190
    .line 191
    throw v0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 192
    :catch_0
    move-exception v0

    .line 193
    const-string v1, "Error parsing AVC config"

    .line 194
    .line 195
    invoke-static {v0, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    throw v0
.end method
