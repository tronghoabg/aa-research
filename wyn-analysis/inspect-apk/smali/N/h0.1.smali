.class public final LN/h0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:LN/i0;

.field public final synthetic j:I

.field public final synthetic k:Lx/n;


# direct methods
.method public constructor <init>(LN/i0;ILx/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/h0;->i:LN/i0;

    .line 2
    .line 3
    iput p2, p0, LN/h0;->j:I

    .line 4
    .line 5
    iput-object p3, p0, LN/h0;->k:Lx/n;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, LN/p;

    .line 6
    .line 7
    iget-object v2, v0, LN/h0;->i:LN/i0;

    .line 8
    .line 9
    iget v3, v2, LN/i0;->e:I

    .line 10
    .line 11
    iget v4, v0, LN/h0;->j:I

    .line 12
    .line 13
    if-ne v3, v4, :cond_9

    .line 14
    .line 15
    iget-object v3, v2, LN/i0;->f:Lx/n;

    .line 16
    .line 17
    iget-object v5, v0, LN/h0;->k:Lx/n;

    .line 18
    .line 19
    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_9

    .line 24
    .line 25
    instance-of v3, v1, LN/s;

    .line 26
    .line 27
    if-eqz v3, :cond_9

    .line 28
    .line 29
    iget-object v3, v5, Lx/n;->a:[J

    .line 30
    .line 31
    array-length v6, v3

    .line 32
    add-int/lit8 v6, v6, -0x2

    .line 33
    .line 34
    if-ltz v6, :cond_9

    .line 35
    .line 36
    const/4 v8, 0x0

    .line 37
    :goto_0
    aget-wide v9, v3, v8

    .line 38
    .line 39
    not-long v11, v9

    .line 40
    const/4 v13, 0x7

    .line 41
    shl-long/2addr v11, v13

    .line 42
    and-long/2addr v11, v9

    .line 43
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr v11, v13

    .line 49
    cmp-long v11, v11, v13

    .line 50
    .line 51
    if-eqz v11, :cond_8

    .line 52
    .line 53
    sub-int v11, v8, v6

    .line 54
    .line 55
    not-int v11, v11

    .line 56
    ushr-int/lit8 v11, v11, 0x1f

    .line 57
    .line 58
    const/16 v12, 0x8

    .line 59
    .line 60
    rsub-int/lit8 v11, v11, 0x8

    .line 61
    .line 62
    const/4 v13, 0x0

    .line 63
    :goto_1
    if-ge v13, v11, :cond_7

    .line 64
    .line 65
    const-wide/16 v14, 0xff

    .line 66
    .line 67
    and-long/2addr v14, v9

    .line 68
    const-wide/16 v16, 0x80

    .line 69
    .line 70
    cmp-long v14, v14, v16

    .line 71
    .line 72
    if-gez v14, :cond_5

    .line 73
    .line 74
    shl-int/lit8 v14, v8, 0x3

    .line 75
    .line 76
    add-int/2addr v14, v13

    .line 77
    iget-object v15, v5, Lx/n;->b:[Ljava/lang/Object;

    .line 78
    .line 79
    aget-object v15, v15, v14

    .line 80
    .line 81
    iget-object v7, v5, Lx/n;->c:[I

    .line 82
    .line 83
    aget v7, v7, v14

    .line 84
    .line 85
    if-eq v7, v4, :cond_0

    .line 86
    .line 87
    const/4 v7, 0x1

    .line 88
    goto :goto_2

    .line 89
    :cond_0
    const/4 v7, 0x0

    .line 90
    :goto_2
    if-eqz v7, :cond_3

    .line 91
    .line 92
    move/from16 v16, v12

    .line 93
    .line 94
    move-object v12, v1

    .line 95
    check-cast v12, LN/s;

    .line 96
    .line 97
    iget-object v0, v12, LN/s;->g:LY9/c;

    .line 98
    .line 99
    invoke-virtual {v0, v15, v2}, LY9/c;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    instance-of v0, v15, LN/z;

    .line 103
    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    move-object v0, v15

    .line 107
    check-cast v0, LN/z;

    .line 108
    .line 109
    move-object/from16 v17, v1

    .line 110
    .line 111
    iget-object v1, v12, LN/s;->g:LY9/c;

    .line 112
    .line 113
    iget-object v1, v1, LY9/c;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v1, Lx/o;

    .line 116
    .line 117
    invoke-virtual {v1, v0}, Lx/o;->b(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-nez v1, :cond_1

    .line 122
    .line 123
    iget-object v1, v12, LN/s;->j:LY9/c;

    .line 124
    .line 125
    invoke-virtual {v1, v0}, LY9/c;->p(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_1
    iget-object v0, v2, LN/i0;->g:Lx/o;

    .line 129
    .line 130
    if-eqz v0, :cond_4

    .line 131
    .line 132
    invoke-virtual {v0, v15}, Lx/o;->g(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_2
    move-object/from16 v17, v1

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_3
    move-object/from16 v17, v1

    .line 140
    .line 141
    move/from16 v16, v12

    .line 142
    .line 143
    :cond_4
    :goto_3
    if-eqz v7, :cond_6

    .line 144
    .line 145
    invoke-virtual {v5, v14}, Lx/n;->e(I)V

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_5
    move-object/from16 v17, v1

    .line 150
    .line 151
    move/from16 v16, v12

    .line 152
    .line 153
    :cond_6
    :goto_4
    shr-long v9, v9, v16

    .line 154
    .line 155
    add-int/lit8 v13, v13, 0x1

    .line 156
    .line 157
    move-object/from16 v0, p0

    .line 158
    .line 159
    move/from16 v12, v16

    .line 160
    .line 161
    move-object/from16 v1, v17

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_7
    move-object/from16 v17, v1

    .line 165
    .line 166
    move v0, v12

    .line 167
    if-ne v11, v0, :cond_9

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_8
    move-object/from16 v17, v1

    .line 171
    .line 172
    :goto_5
    if-eq v8, v6, :cond_9

    .line 173
    .line 174
    add-int/lit8 v8, v8, 0x1

    .line 175
    .line 176
    move-object/from16 v0, p0

    .line 177
    .line 178
    move-object/from16 v1, v17

    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_9
    sget-object v0, Lef/C;->a:Lef/C;

    .line 183
    .line 184
    return-object v0
.end method
