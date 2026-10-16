.class public abstract LK/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LZ/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, LZ/i;->a:LZ/i;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    int-to-float v1, v1

    .line 6
    invoke-static {v0, v1}, LE/L;->c(LZ/k;F)LZ/k;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, LK/t;->a:LZ/k;

    .line 11
    .line 12
    return-void
.end method

.method public static final a(Lh0/c;Ljava/lang/String;LZ/k;JLN/o;I)V
    .locals 9

    .line 1
    const-string v0, "painter"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, -0x44202ba2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p5, v0}, LN/o;->N(I)LN/o;

    .line 10
    .line 11
    .line 12
    sget-object v0, LZ/i;->a:LZ/i;

    .line 13
    .line 14
    sget-wide v1, Le0/q;->i:J

    .line 15
    .line 16
    invoke-static {p3, p4, v1, v2}, Le0/q;->b(JJ)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v2, 0x1d

    .line 27
    .line 28
    const/4 v3, 0x5

    .line 29
    if-lt v1, v2, :cond_1

    .line 30
    .line 31
    sget-object v1, Le0/k;->a:Le0/k;

    .line 32
    .line 33
    invoke-virtual {v1, p3, p4, v3}, Le0/k;->a(JI)Landroid/graphics/BlendModeColorFilter;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    .line 39
    .line 40
    invoke-static {p3, p4}, Le0/z;->s(J)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-static {v3}, Le0/z;->u(I)Landroid/graphics/PorterDuff$Mode;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-direct {v1, v2, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    new-instance v2, Le0/r;

    .line 52
    .line 53
    invoke-direct {v2, v1}, Le0/r;-><init>(Landroid/graphics/ColorFilter;)V

    .line 54
    .line 55
    .line 56
    move-object v1, v2

    .line 57
    :goto_1
    const v2, 0x5c3b3a55

    .line 58
    .line 59
    .line 60
    invoke-virtual {p5, v2}, LN/o;->M(I)V

    .line 61
    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    if-eqz p1, :cond_4

    .line 65
    .line 66
    const v3, 0x44faf204

    .line 67
    .line 68
    .line 69
    invoke-virtual {p5, v3}, LN/o;->M(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p5, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-virtual {p5}, LN/o;->F()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    if-nez v3, :cond_2

    .line 81
    .line 82
    sget-object v3, LN/k;->a:LN/P;

    .line 83
    .line 84
    if-ne v4, v3, :cond_3

    .line 85
    .line 86
    :cond_2
    new-instance v4, LK/s;

    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    invoke-direct {v4, p1, v3}, LK/s;-><init>(Ljava/lang/String;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p5, v4}, LN/o;->U(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    invoke-virtual {p5, v2}, LN/o;->p(Z)V

    .line 96
    .line 97
    .line 98
    check-cast v4, Ltf/l;

    .line 99
    .line 100
    invoke-static {v0, v2, v4}, LFe/g;->J(LZ/k;ZLtf/l;)LZ/k;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    goto :goto_2

    .line 105
    :cond_4
    move-object v3, v0

    .line 106
    :goto_2
    invoke-virtual {p5, v2}, LN/o;->p(Z)V

    .line 107
    .line 108
    .line 109
    const-string v4, "<this>"

    .line 110
    .line 111
    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lh0/c;->f()J

    .line 115
    .line 116
    .line 117
    move-result-wide v5

    .line 118
    sget-wide v7, Ld0/f;->c:J

    .line 119
    .line 120
    invoke-static {v5, v6, v7, v8}, Ld0/f;->a(JJ)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-nez v5, :cond_5

    .line 125
    .line 126
    invoke-virtual {p0}, Lh0/c;->f()J

    .line 127
    .line 128
    .line 129
    move-result-wide v5

    .line 130
    invoke-static {v5, v6}, Ld0/f;->d(J)F

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    invoke-static {v7}, Ljava/lang/Float;->isInfinite(F)Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    if-eqz v7, :cond_6

    .line 139
    .line 140
    invoke-static {v5, v6}, Ld0/f;->b(J)F

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    invoke-static {v5}, Ljava/lang/Float;->isInfinite(F)Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-eqz v5, :cond_6

    .line 149
    .line 150
    :cond_5
    sget-object v0, LK/t;->a:LZ/k;

    .line 151
    .line 152
    :cond_6
    invoke-interface {p2, v0}, LZ/k;->g(LZ/k;)LZ/k;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    sget-object v5, Lr0/g;->b:Lr0/f;

    .line 157
    .line 158
    sget-object v6, LZ/a;->e:LZ/d;

    .line 159
    .line 160
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance v4, Lb0/h;

    .line 164
    .line 165
    invoke-direct {v4, p0, v6, v5, v1}, Lb0/h;-><init>(Lh0/c;LZ/d;Lr0/h;Le0/r;)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v0, v4}, LZ/k;->g(LZ/k;)LZ/k;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-interface {v0, v3}, LZ/k;->g(LZ/k;)LZ/k;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {v0, p5, v2}, LE/p;->a(LZ/k;LN/o;I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p5}, LN/o;->r()LN/i0;

    .line 180
    .line 181
    .line 182
    move-result-object p5

    .line 183
    if-nez p5, :cond_7

    .line 184
    .line 185
    return-void

    .line 186
    :cond_7
    new-instance v0, LK/r;

    .line 187
    .line 188
    move-object v1, p0

    .line 189
    move-object v2, p1

    .line 190
    move-object v3, p2

    .line 191
    move-wide v4, p3

    .line 192
    move v6, p6

    .line 193
    invoke-direct/range {v0 .. v6}, LK/r;-><init>(Lh0/c;Ljava/lang/String;LZ/k;JI)V

    .line 194
    .line 195
    .line 196
    iput-object v0, p5, LN/i0;->d:Ltf/p;

    .line 197
    .line 198
    return-void
.end method

.method public static final b(Li0/d;LZ/k;JLN/o;I)V
    .locals 8

    .line 1
    const v0, -0x2fbc0c6f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, LN/o;->M(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p4}, Lic/d;->L(Li0/d;LN/o;)Li0/L;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    and-int/lit8 p0, p5, 0x70

    .line 12
    .line 13
    const/16 v0, 0x8

    .line 14
    .line 15
    or-int/2addr p0, v0

    .line 16
    and-int/lit16 v0, p5, 0x380

    .line 17
    .line 18
    or-int/2addr p0, v0

    .line 19
    and-int/lit16 p5, p5, 0x1c00

    .line 20
    .line 21
    or-int v7, p0, p5

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    move-object v3, p1

    .line 25
    move-wide v4, p2

    .line 26
    move-object v6, p4

    .line 27
    invoke-static/range {v1 .. v7}, LK/t;->a(Lh0/c;Ljava/lang/String;LZ/k;JLN/o;I)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    invoke-virtual {v6, p0}, LN/o;->p(Z)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
