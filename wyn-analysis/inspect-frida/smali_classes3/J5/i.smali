.class public final LJ5/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I

.field public static final b:LS3/c;

.field public static final c:LS3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    new-array v2, v2, [I

    .line 8
    .line 9
    fill-array-data v2, :array_0

    .line 10
    .line 11
    .line 12
    sput-object v2, LJ5/i;->a:[I

    .line 13
    .line 14
    new-instance v2, LS3/c;

    .line 15
    .line 16
    new-instance v3, LF5/d;

    .line 17
    .line 18
    invoke-direct {v3, v0}, LF5/d;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v2, v3}, LS3/c;-><init>(LF5/d;)V

    .line 22
    .line 23
    .line 24
    sput-object v2, LJ5/i;->b:LS3/c;

    .line 25
    .line 26
    new-instance v0, LS3/c;

    .line 27
    .line 28
    new-instance v2, LF5/d;

    .line 29
    .line 30
    invoke-direct {v2, v1}, LF5/d;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v2}, LS3/c;-><init>(LF5/d;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, LJ5/i;->c:LS3/c;

    .line 37
    .line 38
    return-void

    .line 39
    :array_0
    .array-data 4
        0x5
        0x4
        0xc
        0x8
        0x3
        0xa
        0x9
        0xb
        0x6
        0x2
        0x0
        0x1
        0x7
        0x10
        0xf
        0xe
    .end array-data
.end method

.method public static a(Ljava/util/ArrayList;I)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    goto :goto_0

    .line 7
    :pswitch_1
    new-instance p1, LL5/b;

    .line 8
    .line 9
    invoke-direct {p1}, LL5/b;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_2
    sget-object p1, LJ5/i;->c:LS3/c;

    .line 17
    .line 18
    new-array v0, v1, [Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, LS3/c;->l([Ljava/lang/Object;)LJ5/k;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    :goto_0
    return-void

    .line 30
    :pswitch_3
    new-instance p1, LO5/a;

    .line 31
    .line 32
    invoke-direct {p1}, LO5/a;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_4
    new-instance p1, LU5/d;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iput v1, p1, LU5/d;->c:I

    .line 45
    .line 46
    const-wide/16 v0, -0x1

    .line 47
    .line 48
    iput-wide v0, p1, LU5/d;->d:J

    .line 49
    .line 50
    const/4 v2, -0x1

    .line 51
    iput v2, p1, LU5/d;->f:I

    .line 52
    .line 53
    iput-wide v0, p1, LU5/d;->g:J

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_5
    new-instance p1, LT5/z;

    .line 60
    .line 61
    invoke-direct {p1}, LT5/z;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_6
    new-instance p1, LT5/w;

    .line 69
    .line 70
    invoke-direct {p1}, LT5/w;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_7
    new-instance p1, LS5/c;

    .line 78
    .line 79
    invoke-direct {p1, v1}, LS5/c;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :pswitch_8
    new-instance p1, LR5/h;

    .line 87
    .line 88
    invoke-direct {p1}, LR5/h;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    new-instance p1, LR5/k;

    .line 95
    .line 96
    invoke-direct {p1}, LR5/k;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_9
    new-instance p1, LQ5/d;

    .line 104
    .line 105
    invoke-direct {p1}, LQ5/d;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :pswitch_a
    new-instance p1, LP5/c;

    .line 113
    .line 114
    invoke-direct {p1}, LP5/c;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_b
    new-instance p1, LN5/b;

    .line 122
    .line 123
    invoke-direct {p1}, LN5/b;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :pswitch_c
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    new-array v0, v0, [Ljava/lang/Object;

    .line 135
    .line 136
    aput-object p1, v0, v1

    .line 137
    .line 138
    sget-object p1, LJ5/i;->b:LS3/c;

    .line 139
    .line 140
    invoke-virtual {p1, v0}, LS3/c;->l([Ljava/lang/Object;)LJ5/k;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    if-eqz p1, :cond_1

    .line 145
    .line 146
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_1
    new-instance p1, LM5/b;

    .line 151
    .line 152
    invoke-direct {p1}, LM5/b;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :pswitch_d
    new-instance p1, LK5/a;

    .line 160
    .line 161
    invoke-direct {p1}, LK5/a;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :pswitch_e
    new-instance p1, LT5/b;

    .line 169
    .line 170
    invoke-direct {p1}, LT5/b;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :pswitch_f
    new-instance p1, LS5/c;

    .line 178
    .line 179
    const/4 v0, 0x2

    .line 180
    invoke-direct {p1, v0}, LS5/c;-><init>(I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :pswitch_10
    new-instance p1, LS5/c;

    .line 188
    .line 189
    invoke-direct {p1, v0}, LS5/c;-><init>(I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
