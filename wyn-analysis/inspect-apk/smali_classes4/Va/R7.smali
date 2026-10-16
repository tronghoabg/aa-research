.class public final LVa/R7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# static fields
.field public static g:I = 0x0

.field public static h:I = 0x1


# instance fields
.field public final synthetic a:LVa/r8;

.field public final synthetic b:LVa/r8;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Z

.field public final synthetic e:LVa/x8;

.field public final synthetic f:LVa/y7;


# direct methods
.method public constructor <init>(LVa/r8;LVa/r8;Ljava/util/List;ZLVa/x8;LVa/y7;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/R7;->a:LVa/r8;

    .line 5
    .line 6
    iput-object p2, p0, LVa/R7;->b:LVa/r8;

    .line 7
    .line 8
    iput-object p3, p0, LVa/R7;->c:Ljava/util/List;

    .line 9
    .line 10
    iput-boolean p4, p0, LVa/R7;->d:Z

    .line 11
    .line 12
    iput-object p5, p0, LVa/R7;->e:LVa/x8;

    .line 13
    .line 14
    iput-object p6, p0, LVa/R7;->f:LVa/y7;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(LVa/r8;Landroid/view/View;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v0, 0x2

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x1

    .line 9
    sget v6, LVa/R7;->h:I

    .line 10
    .line 11
    add-int/lit8 v6, v6, 0x31

    .line 12
    .line 13
    rem-int/lit16 v7, v6, 0x80

    .line 14
    .line 15
    sput v7, LVa/R7;->g:I

    .line 16
    .line 17
    rem-int/2addr v6, v0

    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    :try_start_0
    iget-object v0, v1, LVa/R7;->c:Ljava/util/List;

    .line 21
    .line 22
    const/4 v6, 0x3

    .line 23
    new-array v6, v6, [Ljava/lang/Object;

    .line 24
    .line 25
    aput-object v1, v6, v5

    .line 26
    .line 27
    aput-object p2, v6, v5

    .line 28
    .line 29
    invoke-static {v0, v6}, LVa/E7;->N1(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-boolean v6, v1, LVa/R7;->d:Z

    .line 34
    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    iget-object v6, v1, LVa/R7;->c:Ljava/util/List;

    .line 41
    .line 42
    new-array v0, v0, [Ljava/lang/Object;

    .line 43
    .line 44
    aput-object v1, v0, v3

    .line 45
    .line 46
    aput-object p2, v0, v5

    .line 47
    .line 48
    invoke-static {v6, v0}, LVa/E7;->N1(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-boolean v6, v1, LVa/R7;->d:Z

    .line 53
    .line 54
    if-nez v6, :cond_2

    .line 55
    .line 56
    :cond_1
    new-instance v6, LVa/Da;

    .line 57
    .line 58
    const/16 v7, 0x10

    .line 59
    .line 60
    invoke-direct {v6, v7}, LVa/Da;-><init>(I)V

    .line 61
    .line 62
    .line 63
    iput-object v1, v6, LVa/Da;->f:Ljava/lang/Object;

    .line 64
    .line 65
    iput-object v2, v6, LVa/Da;->d:Ljava/lang/Object;

    .line 66
    .line 67
    iput-object v0, v6, LVa/Da;->e:Ljava/lang/Object;

    .line 68
    .line 69
    invoke-static {v6}, LVa/Cb;->j(LVa/Ba;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    sget v0, LVa/R7;->h:I

    .line 73
    .line 74
    add-int/lit8 v0, v0, 0x55

    .line 75
    .line 76
    rem-int/lit16 v0, v0, 0x80

    .line 77
    .line 78
    sput v0, LVa/R7;->g:I

    .line 79
    .line 80
    return-void

    .line 81
    :cond_2
    :goto_0
    :try_start_1
    iget-object v6, v1, LVa/R7;->e:LVa/x8;

    .line 82
    .line 83
    iget-object v7, v1, LVa/R7;->f:LVa/y7;

    .line 84
    .line 85
    invoke-virtual {v2, v6, v7, v0}, LVa/r8;->c(LVa/x8;LVa/y7;Ljava/util/List;)LVa/s8;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :goto_1
    iget-object v6, v1, LVa/R7;->f:LVa/y7;

    .line 90
    .line 91
    invoke-virtual {v6}, LVa/y7;->f()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    new-instance v7, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v8, "\uf38c\ua625\uf3c9\u8406\u6f69\u5913\u7afc\u92ca\u0eee\u5a51\u7ff7\u95db\u098c\u5f0e\u7cc0\u98c4\u04c8\u5025\u71df\u9bf6\u07a4\u55f2\u76ba\u9d04\u02a8\u56d4\u6b9d\u801d\u1d8d\u4bef\u6889\u8320\u18b0\u4cf8\u6d8d\u8621\u1b69\u418f\u636b\u8957\u163c\u4298\u6070\u8c46\u1145\u47a5\u654b\u8f25"

    .line 101
    .line 102
    const-string v9, ""

    .line 103
    .line 104
    const-string v10, ""

    .line 105
    .line 106
    invoke-static {v9, v10, v3, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    invoke-virtual {v8}, Ljava/lang/String;->toCharArray()[C

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    sget-object v9, LVa/pb;->D:Ljava/lang/Object;

    .line 115
    .line 116
    monitor-enter v9

    .line 117
    const-wide v10, 0x400a46749514ff44L    # 3.284402050689012

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    :try_start_2
    invoke-static {v10, v11, v8, v3}, LVa/pb;->z(J[CI)[C

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    sput v4, LVa/pb;->C:I

    .line 127
    .line 128
    :goto_2
    sget v8, LVa/pb;->C:I

    .line 129
    .line 130
    array-length v12, v3

    .line 131
    if-ge v8, v12, :cond_3

    .line 132
    .line 133
    add-int/lit8 v12, v8, -0x4

    .line 134
    .line 135
    aget-char v13, v3, v8

    .line 136
    .line 137
    rem-int/lit8 v14, v8, 0x4

    .line 138
    .line 139
    aget-char v14, v3, v14

    .line 140
    .line 141
    xor-int/2addr v13, v14

    .line 142
    int-to-long v13, v13

    .line 143
    move-wide v15, v10

    .line 144
    int-to-long v10, v12

    .line 145
    mul-long/2addr v10, v15

    .line 146
    xor-long/2addr v10, v13

    .line 147
    long-to-int v10, v10

    .line 148
    int-to-char v10, v10

    .line 149
    aput-char v10, v3, v8

    .line 150
    .line 151
    add-int/2addr v8, v5

    .line 152
    sput v8, LVa/pb;->C:I

    .line 153
    .line 154
    move-wide v10, v15

    .line 155
    goto :goto_2

    .line 156
    :catchall_1
    move-exception v0

    .line 157
    goto :goto_3

    .line 158
    :cond_3
    new-instance v5, Ljava/lang/String;

    .line 159
    .line 160
    array-length v8, v3

    .line 161
    sub-int/2addr v8, v4

    .line 162
    invoke-direct {v5, v3, v4, v8}, Ljava/lang/String;-><init>([CII)V

    .line 163
    .line 164
    .line 165
    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 166
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    sget v3, LVa/r8;->f:I

    .line 177
    .line 178
    add-int/lit8 v3, v3, 0x19

    .line 179
    .line 180
    rem-int/lit16 v3, v3, 0x80

    .line 181
    .line 182
    sput v3, LVa/r8;->g:I

    .line 183
    .line 184
    iget-object v2, v2, LVa/r8;->a:Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-static {v6, v2, v0}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :goto_3
    monitor-exit v9

    .line 198
    throw v0
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    sget v0, LVa/R7;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x15

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/R7;->g:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/R7;->a:LVa/r8;

    .line 10
    .line 11
    invoke-virtual {p0, v0, p1}, LVa/R7;->a(LVa/r8;Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    sget p1, LVa/R7;->h:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x4f

    .line 17
    .line 18
    rem-int/lit16 p1, p1, 0x80

    .line 19
    .line 20
    sput p1, LVa/R7;->g:I

    .line 21
    .line 22
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    sget v0, LVa/R7;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/R7;->h:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/R7;->b:LVa/r8;

    .line 12
    .line 13
    invoke-virtual {p0, v1, p1}, LVa/R7;->a(LVa/r8;Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    throw p1
.end method
