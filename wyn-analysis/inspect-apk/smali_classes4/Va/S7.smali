.class public final LVa/S7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Z

.field public final synthetic c:LVa/r8;

.field public final synthetic d:LVa/x8;

.field public final synthetic e:LVa/y7;


# direct methods
.method public constructor <init>(LVa/y7;LVa/r8;LVa/x8;Ljava/util/List;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, LVa/S7;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-boolean p5, p0, LVa/S7;->b:Z

    .line 7
    .line 8
    iput-object p2, p0, LVa/S7;->c:LVa/r8;

    .line 9
    .line 10
    iput-object p3, p0, LVa/S7;->d:LVa/x8;

    .line 11
    .line 12
    iput-object p1, p0, LVa/S7;->e:LVa/y7;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    iget-object v2, p0, LVa/S7;->a:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p4

    .line 17
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p5

    .line 21
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p6

    .line 25
    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p7

    .line 29
    invoke-static {p8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p8

    .line 33
    invoke-static {p9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p9

    .line 37
    const/16 v3, 0xa

    .line 38
    .line 39
    new-array v3, v3, [Ljava/lang/Object;

    .line 40
    .line 41
    aput-object p0, v3, v0

    .line 42
    .line 43
    aput-object p1, v3, v1

    .line 44
    .line 45
    const/4 p1, 0x2

    .line 46
    aput-object p2, v3, p1

    .line 47
    .line 48
    const/4 p1, 0x3

    .line 49
    aput-object p3, v3, p1

    .line 50
    .line 51
    const/4 p1, 0x4

    .line 52
    aput-object p4, v3, p1

    .line 53
    .line 54
    const/4 p1, 0x5

    .line 55
    aput-object p5, v3, p1

    .line 56
    .line 57
    const/4 p1, 0x6

    .line 58
    aput-object p6, v3, p1

    .line 59
    .line 60
    const/4 p1, 0x7

    .line 61
    aput-object p7, v3, p1

    .line 62
    .line 63
    const/16 p1, 0x8

    .line 64
    .line 65
    aput-object p8, v3, p1

    .line 66
    .line 67
    const/16 p1, 0x9

    .line 68
    .line 69
    aput-object p9, v3, p1

    .line 70
    .line 71
    invoke-static {v2, v3}, LVa/E7;->N1(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-boolean p2, p0, LVa/S7;->b:Z

    .line 76
    .line 77
    if-eq p2, v1, :cond_0

    .line 78
    .line 79
    new-instance p2, LVa/y;

    .line 80
    .line 81
    const/16 p3, 0xe

    .line 82
    .line 83
    invoke-direct {p2, p3}, LVa/y;-><init>(I)V

    .line 84
    .line 85
    .line 86
    iput-object p0, p2, LVa/y;->e:Ljava/lang/Object;

    .line 87
    .line 88
    iput-object p1, p2, LVa/y;->d:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-static {p2}, LVa/Cb;->j(LVa/Ba;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :catchall_0
    move-exception p1

    .line 95
    goto :goto_0

    .line 96
    :cond_0
    iget-object p2, p0, LVa/S7;->c:LVa/r8;

    .line 97
    .line 98
    iget-object p3, p0, LVa/S7;->d:LVa/x8;

    .line 99
    .line 100
    iget-object p4, p0, LVa/S7;->e:LVa/y7;

    .line 101
    .line 102
    invoke-virtual {p2, p3, p4, p1}, LVa/r8;->c(LVa/x8;LVa/y7;Ljava/util/List;)LVa/s8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :goto_0
    iget-object p2, p0, LVa/S7;->e:LVa/y7;

    .line 107
    .line 108
    invoke-virtual {p2}, LVa/y7;->f()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    new-instance p3, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    const-string p4, "\u07b1\u4c5b\u903c\ue40c\u28f2\u7c85\uc0b3\u1491\u593c\uad7e\uf138\u45c7\u89c9\uddb4\u218d\u7672\uba50\u0e1a\u5216\ua6f2\ueade\u3eb2\u836f\ud763\u1b25\u6f12\ub3f2\u07de\u4bb6\u9f98\ue460\u2817\u7c3d\uc0e7\u14dd\u58aa\uac84\uf160\u451a"

    .line 118
    .line 119
    const-string p5, ""

    .line 120
    .line 121
    invoke-static {p5}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    move-result p5

    .line 125
    add-int/lit16 p5, p5, 0x4bde

    .line 126
    .line 127
    invoke-virtual {p4}, Ljava/lang/String;->toCharArray()[C

    .line 128
    .line 129
    .line 130
    move-result-object p4

    .line 131
    sget-object p6, LVa/a;->u:Ljava/lang/Object;

    .line 132
    .line 133
    monitor-enter p6

    .line 134
    :try_start_1
    sput p5, LVa/a;->t:I

    .line 135
    .line 136
    array-length p5, p4

    .line 137
    new-array p5, p5, [C

    .line 138
    .line 139
    sput v0, LVa/a;->s:I

    .line 140
    .line 141
    :goto_1
    sget p7, LVa/a;->s:I

    .line 142
    .line 143
    array-length p8, p4

    .line 144
    if-ge p7, p8, :cond_1

    .line 145
    .line 146
    aget-char p8, p4, p7

    .line 147
    .line 148
    sget p9, LVa/a;->t:I

    .line 149
    .line 150
    mul-int/2addr p9, p7

    .line 151
    xor-int/2addr p8, p9

    .line 152
    int-to-long p8, p8

    .line 153
    const-wide v2, -0x55eb24c51f5bf80cL

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    xor-long/2addr p8, v2

    .line 159
    long-to-int p8, p8

    .line 160
    int-to-char p8, p8

    .line 161
    aput-char p8, p5, p7

    .line 162
    .line 163
    add-int/2addr p7, v1

    .line 164
    sput p7, LVa/a;->s:I

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :catchall_1
    move-exception p1

    .line 168
    goto :goto_2

    .line 169
    :cond_1
    new-instance p4, Ljava/lang/String;

    .line 170
    .line 171
    invoke-direct {p4, p5}, Ljava/lang/String;-><init>([C)V

    .line 172
    .line 173
    .line 174
    monitor-exit p6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 175
    invoke-virtual {p4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p4

    .line 179
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    iget-object p4, p0, LVa/S7;->c:LVa/r8;

    .line 183
    .line 184
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    sget p5, LVa/r8;->f:I

    .line 188
    .line 189
    add-int/lit8 p5, p5, 0x19

    .line 190
    .line 191
    rem-int/lit16 p5, p5, 0x80

    .line 192
    .line 193
    sput p5, LVa/r8;->g:I

    .line 194
    .line 195
    iget-object p4, p4, LVa/r8;->a:Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p3

    .line 204
    invoke-static {p2, p3, p1}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :goto_2
    monitor-exit p6

    .line 209
    throw p1
.end method
