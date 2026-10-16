.class public final LG/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LP/d;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LP/d;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    new-array v1, v1, [LG/g;

    .line 9
    .line 10
    invoke-direct {v0, v1}, LP/d;-><init>([Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, LG/e;->a:LP/d;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Llf/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, LG/d;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, LG/d;

    .line 11
    .line 12
    iget v3, v2, LG/d;->g:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, LG/d;->g:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, LG/d;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, LG/d;-><init>(LG/e;Llf/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, LG/d;->e:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 32
    .line 33
    iget v4, v2, LG/d;->g:I

    .line 34
    .line 35
    sget-object v5, Lef/C;->a:Lef/C;

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x1

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    if-ne v4, v8, :cond_1

    .line 43
    .line 44
    iget v4, v2, LG/d;->d:I

    .line 45
    .line 46
    iget v9, v2, LG/d;->c:I

    .line 47
    .line 48
    iget-object v10, v2, LG/d;->b:[Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v11, v2, LG/d;->a:Ld0/d;

    .line 51
    .line 52
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move/from16 p1, v8

    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v1

    .line 67
    :cond_2
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v1, v0, LG/e;->a:LP/d;

    .line 71
    .line 72
    iget v4, v1, LP/d;->c:I

    .line 73
    .line 74
    if-lez v4, :cond_9

    .line 75
    .line 76
    iget-object v1, v1, LP/d;->a:[Ljava/lang/Object;

    .line 77
    .line 78
    move-object v10, v1

    .line 79
    move v9, v4

    .line 80
    move-object v11, v6

    .line 81
    move v4, v7

    .line 82
    :goto_1
    aget-object v1, v10, v4

    .line 83
    .line 84
    check-cast v1, LG/g;

    .line 85
    .line 86
    iput-object v11, v2, LG/d;->a:Ld0/d;

    .line 87
    .line 88
    iput-object v10, v2, LG/d;->b:[Ljava/lang/Object;

    .line 89
    .line 90
    iput v9, v2, LG/d;->c:I

    .line 91
    .line 92
    iput v4, v2, LG/d;->d:I

    .line 93
    .line 94
    iput v8, v2, LG/d;->g:I

    .line 95
    .line 96
    iget-object v12, v1, LG/g;->c:Lt0/y;

    .line 97
    .line 98
    if-eqz v12, :cond_3

    .line 99
    .line 100
    invoke-virtual {v12}, Lt0/y;->S()Z

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    if-eqz v13, :cond_3

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    move-object v12, v6

    .line 108
    :goto_2
    if-nez v12, :cond_4

    .line 109
    .line 110
    move/from16 p1, v8

    .line 111
    .line 112
    move v15, v9

    .line 113
    goto :goto_4

    .line 114
    :cond_4
    if-nez v11, :cond_5

    .line 115
    .line 116
    iget-wide v13, v12, Lr0/t;->c:J

    .line 117
    .line 118
    invoke-static {v13, v14}, LBa/c;->R(J)J

    .line 119
    .line 120
    .line 121
    move-result-wide v13

    .line 122
    move/from16 p1, v8

    .line 123
    .line 124
    move v15, v9

    .line 125
    sget-wide v8, Ld0/c;->b:J

    .line 126
    .line 127
    invoke-static {v8, v9, v13, v14}, La/a;->f(JJ)Ld0/d;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    goto :goto_3

    .line 132
    :cond_5
    move/from16 p1, v8

    .line 133
    .line 134
    move v15, v9

    .line 135
    move-object v8, v11

    .line 136
    :goto_3
    iget-object v9, v1, LG/g;->b:LG/a;

    .line 137
    .line 138
    if-nez v9, :cond_6

    .line 139
    .line 140
    iget-object v9, v1, LG/g;->a:LG/a;

    .line 141
    .line 142
    :cond_6
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-static {v12}, LFe/g;->G(Lr0/k;)J

    .line 146
    .line 147
    .line 148
    move-result-wide v12

    .line 149
    invoke-virtual {v8, v12, v13}, Ld0/d;->e(J)Ld0/d;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    new-instance v8, Landroid/graphics/Rect;

    .line 154
    .line 155
    iget v12, v1, Ld0/d;->a:F

    .line 156
    .line 157
    float-to-int v12, v12

    .line 158
    iget v13, v1, Ld0/d;->b:F

    .line 159
    .line 160
    float-to-int v13, v13

    .line 161
    iget v14, v1, Ld0/d;->c:F

    .line 162
    .line 163
    float-to-int v14, v14

    .line 164
    iget v1, v1, Ld0/d;->d:F

    .line 165
    .line 166
    float-to-int v1, v1

    .line 167
    invoke-direct {v8, v12, v13, v14, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 168
    .line 169
    .line 170
    iget-object v1, v9, LG/a;->a:Landroid/view/View;

    .line 171
    .line 172
    invoke-virtual {v1, v8, v7}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;Z)Z

    .line 173
    .line 174
    .line 175
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 176
    .line 177
    :goto_4
    if-ne v5, v3, :cond_7

    .line 178
    .line 179
    return-object v3

    .line 180
    :cond_7
    move v9, v15

    .line 181
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 182
    .line 183
    if-lt v4, v9, :cond_8

    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_8
    move/from16 v8, p1

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_9
    :goto_6
    return-object v5
.end method
