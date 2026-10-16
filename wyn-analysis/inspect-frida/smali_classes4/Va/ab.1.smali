.class public final LVa/ab;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# static fields
.field public static d:I = 0x0

.field public static e:I = 0x1

.field public static f:I


# instance fields
.field public final synthetic a:I

.field public synthetic b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/ab;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILjava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [C

    .line 6
    .line 7
    sget-object v0, LVa/a;->u:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sput p0, LVa/a;->t:I

    .line 11
    .line 12
    array-length p0, p1

    .line 13
    new-array p0, p0, [C

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    sput v1, LVa/a;->s:I

    .line 17
    .line 18
    :goto_0
    sget v1, LVa/a;->s:I

    .line 19
    .line 20
    array-length v2, p1

    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    aget-char v2, p1, v1

    .line 24
    .line 25
    sget v3, LVa/a;->t:I

    .line 26
    .line 27
    mul-int/2addr v3, v1

    .line 28
    xor-int/2addr v2, v3

    .line 29
    int-to-long v2, v2

    .line 30
    const-wide v4, 0x8f31be65b274aedL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    xor-long/2addr v2, v4

    .line 36
    long-to-int v2, v2

    .line 37
    int-to-char v2, v2

    .line 38
    aput-char v2, p0, v1

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    sput v1, LVa/a;->s:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    .line 50
    .line 51
    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    return-object p1

    .line 54
    :goto_1
    monitor-exit v0

    .line 55
    throw p0
.end method

.method public static b(Ljava/lang/String;IIIZ)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->x:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    new-array v1, p1, [C

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    sput v2, LVa/Ab;->v:I

    .line 14
    .line 15
    :goto_0
    sget v3, LVa/Ab;->v:I

    .line 16
    .line 17
    if-ge v3, p1, :cond_0

    .line 18
    .line 19
    aget-char v4, p0, v3

    .line 20
    .line 21
    add-int/2addr v4, p2

    .line 22
    int-to-char v4, v4

    .line 23
    aput-char v4, v1, v3

    .line 24
    .line 25
    add-int/lit8 v4, v4, -0x4d

    .line 26
    .line 27
    int-to-char v4, v4

    .line 28
    aput-char v4, v1, v3

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    sput v3, LVa/Ab;->v:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    if-lez p3, :cond_1

    .line 38
    .line 39
    sput p3, LVa/Ab;->w:I

    .line 40
    .line 41
    new-array p0, p1, [C

    .line 42
    .line 43
    invoke-static {v1, v2, p0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    sget p2, LVa/Ab;->w:I

    .line 47
    .line 48
    sub-int p3, p1, p2

    .line 49
    .line 50
    invoke-static {p0, v2, v1, p3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    sget p2, LVa/Ab;->w:I

    .line 54
    .line 55
    sub-int p3, p1, p2

    .line 56
    .line 57
    invoke-static {p0, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    :cond_1
    if-eqz p4, :cond_3

    .line 61
    .line 62
    new-array p0, p1, [C

    .line 63
    .line 64
    sput v2, LVa/Ab;->v:I

    .line 65
    .line 66
    :goto_1
    sget p2, LVa/Ab;->v:I

    .line 67
    .line 68
    if-ge p2, p1, :cond_2

    .line 69
    .line 70
    sub-int p3, p1, p2

    .line 71
    .line 72
    add-int/lit8 p3, p3, -0x1

    .line 73
    .line 74
    aget-char p3, v1, p3

    .line 75
    .line 76
    aput-char p3, p0, p2

    .line 77
    .line 78
    add-int/lit8 p2, p2, 0x1

    .line 79
    .line 80
    sput p2, LVa/Ab;->v:I

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v1, p0

    .line 84
    :cond_3
    new-instance p0, Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 87
    .line 88
    .line 89
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    return-object p0

    .line 91
    :goto_2
    monitor-exit v0

    .line 92
    throw p0
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 2

    .line 1
    iget p1, p0, LVa/ab;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LVa/ab;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p2, p0, LVa/ab;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p2, LVa/Pb;

    .line 11
    .line 12
    const/4 p3, 0x0

    .line 13
    :try_start_0
    new-instance p4, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, p1, p4}, LVa/Pb;->B(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result p5

    .line 25
    const/4 p6, 0x1

    .line 26
    xor-int/2addr p5, p6

    .line 27
    if-eq p5, p6, :cond_0

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    invoke-virtual {p2, p1}, LVa/Pb;->t(Ljava/lang/Object;)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    if-eqz p5, :cond_1

    .line 35
    .line 36
    sget p7, LVa/ab;->f:I

    .line 37
    .line 38
    add-int/lit8 p7, p7, 0x29

    .line 39
    .line 40
    rem-int/lit16 p7, p7, 0x80

    .line 41
    .line 42
    :try_start_1
    iget-object p8, p2, LVa/Pb;->j:LVa/Ob;

    .line 43
    .line 44
    iget-boolean p8, p8, LVa/Ob;->e:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    if-eq p8, p6, :cond_1

    .line 47
    .line 48
    add-int/lit8 p7, p7, 0x71

    .line 49
    .line 50
    rem-int/lit16 p7, p7, 0x80

    .line 51
    .line 52
    sput p7, LVa/ab;->f:I

    .line 53
    .line 54
    :try_start_2
    invoke-virtual {p5, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    :goto_0
    invoke-virtual {p2, p1, p4}, LVa/Pb;->z(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 61
    .line 62
    .line 63
    new-instance p5, Lorg/json/JSONObject;

    .line 64
    .line 65
    invoke-direct {p5}, Lorg/json/JSONObject;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p4

    .line 72
    invoke-virtual {p2, p5, p4, p1}, LVa/Mb;->m(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :goto_1
    const-string p2, ""

    .line 77
    .line 78
    invoke-static {p2, p3}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    const p4, 0xef4d

    .line 83
    .line 84
    .line 85
    add-int/2addr p2, p4

    .line 86
    const-string p4, "\u4aab\ua5d5\u941b\u8766\uf7aa\ue60f\ud151\uc193\u30e0\u2336\u13ae\u02c6\u7d39\u6c65\u5cb5\u4f0a\ube51\uae95\u99f5"

    .line 87
    .line 88
    invoke-static {p2, p4}, LVa/ab;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-static {p3}, Landroid/graphics/Color;->blue(I)I

    .line 97
    .line 98
    .line 99
    move-result p4

    .line 100
    rsub-int p4, p4, 0x5777

    .line 101
    .line 102
    const-string p5, "\u4aa8\u1de8\ue471\u4ce7\u1743\uff9e\u464e\u2ec2\uf175\u59ad\u2025\u88bc\u5318\u3b9f\u8200\u5561\u3de9\u8449\u6cdb\u3759\u9fcf\u6649\uceb2"

    .line 103
    .line 104
    invoke-static {p4, p5}, LVa/ab;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p4

    .line 108
    invoke-virtual {p4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p4

    .line 112
    invoke-static {p2, p4, p1, p3}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 113
    .line 114
    .line 115
    :goto_2
    return-void

    .line 116
    :pswitch_0
    sget p1, LVa/ab;->e:I

    .line 117
    .line 118
    add-int/lit8 p1, p1, 0x3f

    .line 119
    .line 120
    rem-int/lit16 p2, p1, 0x80

    .line 121
    .line 122
    sput p2, LVa/ab;->d:I

    .line 123
    .line 124
    rem-int/lit8 p1, p1, 0x2

    .line 125
    .line 126
    if-nez p1, :cond_3

    .line 127
    .line 128
    invoke-static {}, LVa/Kb;->u()LVa/Kb;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, LVa/Kb;->C()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-nez p1, :cond_2

    .line 137
    .line 138
    sget p1, LVa/ab;->d:I

    .line 139
    .line 140
    add-int/lit8 p1, p1, 0x75

    .line 141
    .line 142
    rem-int/lit16 p1, p1, 0x80

    .line 143
    .line 144
    sput p1, LVa/ab;->e:I

    .line 145
    .line 146
    :try_start_3
    iget-object p1, p0, LVa/ab;->c:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast p1, LVa/cb;

    .line 149
    .line 150
    iget-object p2, p0, LVa/ab;->b:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast p2, Landroid/view/ViewGroup;

    .line 153
    .line 154
    invoke-static {p1, p2, p0}, LVa/cb;->m(LVa/cb;Landroid/view/ViewGroup;LVa/ab;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 155
    .line 156
    .line 157
    sget p1, LVa/ab;->d:I

    .line 158
    .line 159
    add-int/lit8 p1, p1, 0x4d

    .line 160
    .line 161
    rem-int/lit16 p1, p1, 0x80

    .line 162
    .line 163
    sput p1, LVa/ab;->e:I

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :catchall_1
    move-exception p1

    .line 167
    const-string p2, ""

    .line 168
    .line 169
    const/16 p3, 0x30

    .line 170
    .line 171
    invoke-static {p2, p3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 172
    .line 173
    .line 174
    move-result p4

    .line 175
    rsub-int/lit8 p4, p4, 0x19

    .line 176
    .line 177
    const/4 p5, 0x0

    .line 178
    invoke-static {p5, p5, p5, p5}, Landroid/graphics/Color;->argb(IIII)I

    .line 179
    .line 180
    .line 181
    move-result p6

    .line 182
    rsub-int p6, p6, 0xb3

    .line 183
    .line 184
    invoke-static {p2, p2, p5, p5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 185
    .line 186
    .line 187
    move-result p7

    .line 188
    add-int/lit8 p7, p7, 0x1a

    .line 189
    .line 190
    const-string p8, "\uffe1\u0006\t\ufffc\ufffb\u0006\uffee\t\u000f\ufffd\u0002\uffe6\u0003\r\u000e\uffff\u0008\uffff\u000c\uffed\uffff\u000c\u0010\u0003\ufffd\uffff"

    .line 191
    .line 192
    invoke-static {p8, p4, p6, p7, p5}, LVa/ab;->b(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p4

    .line 196
    invoke-virtual {p4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p4

    .line 200
    const-wide/16 p6, 0x0

    .line 201
    .line 202
    invoke-static {p6, p7}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 203
    .line 204
    .line 205
    move-result p8

    .line 206
    rsub-int/lit8 p8, p8, 0x17

    .line 207
    .line 208
    invoke-static {p2, p3, p5, p5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 209
    .line 210
    .line 211
    move-result p2

    .line 212
    add-int/lit16 p2, p2, 0xaf

    .line 213
    .line 214
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 215
    .line 216
    .line 217
    move-result-wide v0

    .line 218
    cmp-long p3, v0, p6

    .line 219
    .line 220
    rsub-int/lit8 p3, p3, 0x5

    .line 221
    .line 222
    const/4 p6, 0x1

    .line 223
    const-string p7, "\u000e\u0011\u0011\uffe4\u0004\u0006\r\u0000\u0007\uffe2\u0013\u0014\u000e\u0018\u0000\uffeb\r\u000e\uffbf\r\u0008\uffbf\u0011"

    .line 224
    .line 225
    invoke-static {p7, p8, p2, p3, p6}, LVa/ab;->b(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    invoke-static {p4, p2, p1, p5}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 234
    .line 235
    .line 236
    :cond_2
    :goto_3
    return-void

    .line 237
    :cond_3
    invoke-static {}, LVa/Kb;->u()LVa/Kb;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-virtual {p1}, LVa/Kb;->C()Z

    .line 242
    .line 243
    .line 244
    const/4 p1, 0x0

    .line 245
    throw p1

    .line 246
    nop

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
