.class public final LX2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP2/l;


# instance fields
.field public final a:LQ1/o;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, LQ1/o;

    .line 8
    .line 9
    invoke-direct {p1}, LQ1/o;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, LX2/a;->a:LQ1/o;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance p1, LQ1/o;

    .line 19
    .line 20
    const/16 v0, 0xa

    .line 21
    .line 22
    invoke-direct {p1, v0}, LQ1/o;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LX2/a;->a:LQ1/o;

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public E([BIILP2/k;LQ1/c;)V
    .locals 16

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    add-int v2, v0, p3

    .line 6
    .line 7
    move-object/from16 v3, p0

    .line 8
    .line 9
    iget-object v4, v3, LX2/a;->a:LQ1/o;

    .line 10
    .line 11
    move-object/from16 v5, p1

    .line 12
    .line 13
    invoke-virtual {v4, v2, v5}, LQ1/o;->E(I[B)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, v0}, LQ1/o;->G(I)V

    .line 17
    .line 18
    .line 19
    new-instance v6, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-virtual {v4}, LQ1/o;->a()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-lez v0, :cond_8

    .line 29
    .line 30
    invoke-virtual {v4}, LQ1/o;->a()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    if-lt v0, v1, :cond_0

    .line 37
    .line 38
    move v0, v5

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    move v0, v2

    .line 41
    :goto_1
    const-string v7, "Incomplete Mp4Webvtt Top Level box header found."

    .line 42
    .line 43
    invoke-static {v7, v0}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    const v8, 0x76747463

    .line 55
    .line 56
    .line 57
    if-ne v7, v8, :cond_7

    .line 58
    .line 59
    sub-int/2addr v0, v1

    .line 60
    const/4 v7, 0x0

    .line 61
    move-object v8, v7

    .line 62
    move-object v9, v8

    .line 63
    :cond_1
    :goto_2
    if-lez v0, :cond_4

    .line 64
    .line 65
    if-lt v0, v1, :cond_2

    .line 66
    .line 67
    move v10, v5

    .line 68
    goto :goto_3

    .line 69
    :cond_2
    move v10, v2

    .line 70
    :goto_3
    const-string v11, "Incomplete vtt cue box header found."

    .line 71
    .line 72
    invoke-static {v11, v10}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    add-int/lit8 v0, v0, -0x8

    .line 84
    .line 85
    sub-int/2addr v10, v1

    .line 86
    iget-object v12, v4, LQ1/o;->a:[B

    .line 87
    .line 88
    iget v13, v4, LQ1/o;->b:I

    .line 89
    .line 90
    sget v14, LQ1/x;->a:I

    .line 91
    .line 92
    new-instance v14, Ljava/lang/String;

    .line 93
    .line 94
    sget-object v15, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 95
    .line 96
    invoke-direct {v14, v12, v13, v10, v15}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v10}, LQ1/o;->H(I)V

    .line 100
    .line 101
    .line 102
    sub-int/2addr v0, v10

    .line 103
    const v10, 0x73747467

    .line 104
    .line 105
    .line 106
    if-ne v11, v10, :cond_3

    .line 107
    .line 108
    new-instance v9, LX2/h;

    .line 109
    .line 110
    invoke-direct {v9}, LX2/h;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-static {v14, v9}, LX2/i;->e(Ljava/lang/String;LX2/h;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v9}, LX2/h;->a()LP1/a;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    goto :goto_2

    .line 121
    :cond_3
    const v10, 0x7061796c

    .line 122
    .line 123
    .line 124
    if-ne v11, v10, :cond_1

    .line 125
    .line 126
    invoke-virtual {v14}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    sget-object v10, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 131
    .line 132
    invoke-static {v7, v8, v10}, LX2/i;->f(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroid/text/SpannedString;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    goto :goto_2

    .line 137
    :cond_4
    if-nez v8, :cond_5

    .line 138
    .line 139
    const-string v8, ""

    .line 140
    .line 141
    :cond_5
    if-eqz v9, :cond_6

    .line 142
    .line 143
    iput-object v8, v9, LP1/a;->a:Ljava/lang/CharSequence;

    .line 144
    .line 145
    invoke-virtual {v9}, LP1/a;->a()LP1/b;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    goto :goto_4

    .line 150
    :cond_6
    sget-object v0, LX2/i;->a:Ljava/util/regex/Pattern;

    .line 151
    .line 152
    new-instance v0, LX2/h;

    .line 153
    .line 154
    invoke-direct {v0}, LX2/h;-><init>()V

    .line 155
    .line 156
    .line 157
    iput-object v8, v0, LX2/h;->c:Ljava/lang/CharSequence;

    .line 158
    .line 159
    invoke-virtual {v0}, LX2/h;->a()LP1/a;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, LP1/a;->a()LP1/b;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    :goto_4
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :cond_7
    sub-int/2addr v0, v1

    .line 173
    invoke-virtual {v4, v0}, LQ1/o;->H(I)V

    .line 174
    .line 175
    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :cond_8
    new-instance v5, LP2/a;

    .line 179
    .line 180
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    invoke-direct/range {v5 .. v10}, LP2/a;-><init>(Ljava/util/List;JJ)V

    .line 191
    .line 192
    .line 193
    move-object/from16 v0, p5

    .line 194
    .line 195
    invoke-interface {v0, v5}, LQ1/c;->accept(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    return-void
.end method

.method public synthetic H(II[B)LP2/d;
    .locals 0

    .line 1
    invoke-static {p0, p3, p2}, LN0/a;->a(LP2/l;[BI)LP2/b;

    move-result-object p1

    return-object p1
.end method

.method public P()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method

.method public a(Ls2/j;LG2/g;)LN1/B;
    .locals 8

    .line 1
    iget-object v0, p0, LX2/a;->a:LQ1/o;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v1

    .line 6
    :goto_0
    :try_start_0
    iget-object v4, v0, LQ1/o;->a:[B

    .line 7
    .line 8
    const/16 v5, 0xa

    .line 9
    .line 10
    invoke-virtual {p1, v4, v1, v5, v1}, Ls2/j;->c([BIIZ)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, LQ1/o;->G(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LQ1/o;->x()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const v6, 0x494433

    .line 21
    .line 22
    .line 23
    if-eq v4, v6, :cond_0

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    const/4 v4, 0x3

    .line 27
    invoke-virtual {v0, v4}, LQ1/o;->H(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, LQ1/o;->t()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    add-int/lit8 v6, v4, 0xa

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    new-array v2, v6, [B

    .line 39
    .line 40
    iget-object v7, v0, LQ1/o;->a:[B

    .line 41
    .line 42
    invoke-static {v7, v1, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v2, v5, v4, v1}, Ls2/j;->c([BIIZ)Z

    .line 46
    .line 47
    .line 48
    new-instance v4, LG2/i;

    .line 49
    .line 50
    invoke-direct {v4, p2}, LG2/i;-><init>(LG2/g;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v6, v2}, LG2/i;->O(I[B)LN1/B;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {p1, v4, v1}, Ls2/j;->b(IZ)Z

    .line 59
    .line 60
    .line 61
    :goto_1
    add-int/2addr v3, v6

    .line 62
    goto :goto_0

    .line 63
    :catch_0
    :goto_2
    iput v1, p1, Ls2/j;->f:I

    .line 64
    .line 65
    invoke-virtual {p1, v3, v1}, Ls2/j;->b(IZ)Z

    .line 66
    .line 67
    .line 68
    return-object v2
.end method

.method public synthetic reset()V
    .locals 0

    .line 1
    return-void
.end method
