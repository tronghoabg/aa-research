.class public abstract LM0/i;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Lk1/q;


# instance fields
.field public final a:Lo0/c;

.field public b:Landroid/view/View;

.field public c:Ltf/a;

.field public d:Z

.field public e:LZ/k;

.field public f:Ltf/l;

.field public g:LL0/b;

.field public h:Ltf/l;

.field public i:Landroidx/lifecycle/v;

.field public j:Ln3/f;

.field public final k:LX/u;

.field public final l:LM0/c;

.field public final m:LM0/f;

.field public n:Ltf/l;

.field public final o:[I

.field public p:I

.field public q:I

.field public final r:LD9/n;

.field public final s:Lt0/t;


# direct methods
.method public constructor <init>(Landroid/content/Context;LN/m;Lo0/c;)V
    .locals 5

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    const-string v3, "context"

    .line 5
    .line 6
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v3, "dispatcher"

    .line 10
    .line 11
    invoke-static {p3, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iput-object p3, p0, LM0/i;->a:Lo0/c;

    .line 18
    .line 19
    sget-object p1, Lu0/I0;->a:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    const p1, 0x7f0a0058

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v2}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 28
    .line 29
    .line 30
    sget-object p1, LM0/h;->i:LM0/h;

    .line 31
    .line 32
    iput-object p1, p0, LM0/i;->c:Ltf/a;

    .line 33
    .line 34
    sget-object p1, LZ/i;->a:LZ/i;

    .line 35
    .line 36
    iput-object p1, p0, LM0/i;->e:LZ/k;

    .line 37
    .line 38
    new-instance p1, LL0/c;

    .line 39
    .line 40
    const/high16 p2, 0x3f800000    # 1.0f

    .line 41
    .line 42
    invoke-direct {p1, p2, p2}, LL0/c;-><init>(FF)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, LM0/i;->g:LL0/b;

    .line 46
    .line 47
    new-instance p1, LX/u;

    .line 48
    .line 49
    new-instance p2, LM0/c;

    .line 50
    .line 51
    move-object p3, p0

    .line 52
    check-cast p3, LM0/o;

    .line 53
    .line 54
    const/4 v3, 0x1

    .line 55
    invoke-direct {p2, p3, v3}, LM0/c;-><init>(LM0/o;I)V

    .line 56
    .line 57
    .line 58
    invoke-direct {p1, p2}, LX/u;-><init>(Ltf/l;)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, LM0/i;->k:LX/u;

    .line 62
    .line 63
    new-instance p1, LM0/c;

    .line 64
    .line 65
    invoke-direct {p1, p3, v2}, LM0/c;-><init>(LM0/o;I)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, LM0/i;->l:LM0/c;

    .line 69
    .line 70
    new-instance p1, LM0/f;

    .line 71
    .line 72
    invoke-direct {p1, p3, v2}, LM0/f;-><init>(LM0/o;I)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, LM0/i;->m:LM0/f;

    .line 76
    .line 77
    new-array p1, v1, [I

    .line 78
    .line 79
    iput-object p1, p0, LM0/i;->o:[I

    .line 80
    .line 81
    const/high16 p1, -0x80000000

    .line 82
    .line 83
    iput p1, p0, LM0/i;->p:I

    .line 84
    .line 85
    iput p1, p0, LM0/i;->q:I

    .line 86
    .line 87
    new-instance p1, LD9/n;

    .line 88
    .line 89
    const/16 p2, 0x9

    .line 90
    .line 91
    invoke-direct {p1, p2}, LD9/n;-><init>(I)V

    .line 92
    .line 93
    .line 94
    iput-object p1, p0, LM0/i;->r:LD9/n;

    .line 95
    .line 96
    new-instance p1, Lt0/t;

    .line 97
    .line 98
    invoke-direct {p1, v2}, Lt0/t;-><init>(Z)V

    .line 99
    .line 100
    .line 101
    new-instance p2, Lp0/r;

    .line 102
    .line 103
    invoke-direct {p2}, Lp0/r;-><init>()V

    .line 104
    .line 105
    .line 106
    new-instance v2, LM0/c;

    .line 107
    .line 108
    invoke-direct {v2, p3, v1}, LM0/c;-><init>(LM0/o;I)V

    .line 109
    .line 110
    .line 111
    iput-object v2, p2, Lp0/r;->a:LM0/c;

    .line 112
    .line 113
    new-instance v2, LGf/r;

    .line 114
    .line 115
    invoke-direct {v2}, LGf/r;-><init>()V

    .line 116
    .line 117
    .line 118
    iget-object v3, p2, Lp0/r;->b:LGf/r;

    .line 119
    .line 120
    if-nez v3, :cond_0

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_0
    const/4 v4, 0x0

    .line 124
    iput-object v4, v3, LGf/r;->b:Ljava/lang/Object;

    .line 125
    .line 126
    :goto_0
    iput-object v2, p2, Lp0/r;->b:LGf/r;

    .line 127
    .line 128
    iput-object p2, v2, LGf/r;->b:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-virtual {p0, v2}, LM0/i;->setOnRequestDisallowInterceptTouchEvent$ui_release(Ltf/l;)V

    .line 131
    .line 132
    .line 133
    new-instance v2, LM0/a;

    .line 134
    .line 135
    invoke-direct {v2, p3, p1}, LM0/a;-><init>(LM0/o;Lt0/t;)V

    .line 136
    .line 137
    .line 138
    invoke-static {p2, v2}, Lka/e0;->m(LZ/k;Ltf/l;)LZ/k;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    new-instance v2, LM0/a;

    .line 143
    .line 144
    invoke-direct {v2, p3, p1, v1}, LM0/a;-><init>(LM0/o;Lt0/t;I)V

    .line 145
    .line 146
    .line 147
    invoke-static {p2, v2}, LU8/v0;->X(LZ/k;Ltf/l;)LZ/k;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    iget-object v1, p0, LM0/i;->e:LZ/k;

    .line 152
    .line 153
    invoke-interface {v1, p2}, LZ/k;->g(LZ/k;)LZ/k;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {p1, v1}, Lt0/t;->D(LZ/k;)V

    .line 158
    .line 159
    .line 160
    new-instance v1, LA/W;

    .line 161
    .line 162
    const/16 v2, 0xa

    .line 163
    .line 164
    invoke-direct {v1, v2, p1, p2}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    iput-object v1, p0, LM0/i;->f:Ltf/l;

    .line 168
    .line 169
    iget-object p2, p0, LM0/i;->g:LL0/b;

    .line 170
    .line 171
    invoke-virtual {p1, p2}, Lt0/t;->B(LL0/b;)V

    .line 172
    .line 173
    .line 174
    new-instance p2, LB/F;

    .line 175
    .line 176
    invoke-direct {p2, p1, v0}, LB/F;-><init>(Ljava/lang/Object;I)V

    .line 177
    .line 178
    .line 179
    iput-object p2, p0, LM0/i;->h:Ltf/l;

    .line 180
    .line 181
    new-instance p2, Lkotlin/jvm/internal/G;

    .line 182
    .line 183
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 184
    .line 185
    .line 186
    new-instance v1, LA/a;

    .line 187
    .line 188
    invoke-direct {v1, p3, p1, p2, v0}, LA/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 189
    .line 190
    .line 191
    iput-object v1, p1, Lt0/t;->F:LA/a;

    .line 192
    .line 193
    new-instance v0, LA/W;

    .line 194
    .line 195
    const/16 v1, 0xb

    .line 196
    .line 197
    invoke-direct {v0, v1, p3, p2}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    iput-object v0, p1, Lt0/t;->G:LA/W;

    .line 201
    .line 202
    new-instance p2, LM0/b;

    .line 203
    .line 204
    invoke-direct {p2, p3, p1}, LM0/b;-><init>(LM0/o;Lt0/t;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1, p2}, Lt0/t;->C(Lr0/n;)V

    .line 208
    .line 209
    .line 210
    iput-object p1, p0, LM0/i;->s:Lt0/t;

    .line 211
    .line 212
    return-void
.end method

.method public static final g(LM0/o;III)I
    .locals 1

    .line 1
    const/high16 p0, 0x40000000    # 2.0f

    .line 2
    .line 3
    if-gez p3, :cond_3

    .line 4
    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, -0x2

    .line 9
    const v0, 0x7fffffff

    .line 10
    .line 11
    .line 12
    if-ne p3, p1, :cond_1

    .line 13
    .line 14
    if-eq p2, v0, :cond_1

    .line 15
    .line 16
    const/high16 p0, -0x80000000

    .line 17
    .line 18
    invoke-static {p2, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p1, -0x1

    .line 24
    if-ne p3, p1, :cond_2

    .line 25
    .line 26
    if-eq p2, v0, :cond_2

    .line 27
    .line 28
    invoke-static {p2, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :cond_2
    const/4 p0, 0x0

    .line 34
    invoke-static {p0, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :cond_3
    :goto_0
    invoke-static {p3, p1, p2}, Landroid/support/v4/media/session/b;->S(III)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-static {p1, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0
.end method


# virtual methods
.method public final a(ILandroid/view/View;)V
    .locals 2

    .line 1
    iget-object p2, p0, LM0/i;->r:LD9/n;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    iput v1, p2, LD9/n;->c:I

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput v1, p2, LD9/n;->b:I

    .line 11
    .line 12
    return-void
.end method

.method public final b(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    .line 1
    const-string p2, "child"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iget-object p2, p0, LM0/i;->r:LD9/n;

    .line 8
    .line 9
    if-ne p4, p1, :cond_0

    .line 10
    .line 11
    iput p3, p2, LD9/n;->c:I

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iput p3, p2, LD9/n;->b:I

    .line 15
    .line 16
    return-void
.end method

.method public final c(Landroid/view/View;II[II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LM0/i;->isNestedScrollingEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    int-to-float p1, p2

    .line 9
    const/4 p2, -0x1

    .line 10
    int-to-float p2, p2

    .line 11
    mul-float/2addr p1, p2

    .line 12
    int-to-float p3, p3

    .line 13
    mul-float/2addr p3, p2

    .line 14
    invoke-static {p1, p3}, LU8/v0;->f(FF)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    const/4 p3, 0x1

    .line 19
    if-nez p5, :cond_1

    .line 20
    .line 21
    move p5, p3

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p5, 0x2

    .line 24
    :goto_0
    iget-object v0, p0, LM0/i;->a:Lo0/c;

    .line 25
    .line 26
    iget-object v0, v0, Lo0/c;->c:Lo0/f;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0, p5, p1, p2}, Lo0/f;->i(IJ)J

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    sget-wide p1, Ld0/c;->b:J

    .line 36
    .line 37
    :goto_1
    invoke-static {p1, p2}, Ld0/c;->b(J)F

    .line 38
    .line 39
    .line 40
    move-result p5

    .line 41
    invoke-static {p5}, Lu0/Q;->d(F)I

    .line 42
    .line 43
    .line 44
    move-result p5

    .line 45
    const/4 v0, 0x0

    .line 46
    aput p5, p4, v0

    .line 47
    .line 48
    invoke-static {p1, p2}, Ld0/c;->c(J)F

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {p1}, Lu0/Q;->d(F)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    aput p1, p4, p3

    .line 57
    .line 58
    return-void
.end method

.method public final d(Landroid/view/View;IIIII[I)V
    .locals 6

    .line 1
    invoke-virtual {p0}, LM0/i;->isNestedScrollingEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    int-to-float p1, p2

    .line 9
    const/4 p2, -0x1

    .line 10
    int-to-float p2, p2

    .line 11
    mul-float/2addr p1, p2

    .line 12
    int-to-float p3, p3

    .line 13
    mul-float/2addr p3, p2

    .line 14
    invoke-static {p1, p3}, LU8/v0;->f(FF)J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    int-to-float p1, p4

    .line 19
    mul-float/2addr p1, p2

    .line 20
    int-to-float p3, p5

    .line 21
    mul-float/2addr p3, p2

    .line 22
    invoke-static {p1, p3}, LU8/v0;->f(FF)J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    const/4 p1, 0x1

    .line 27
    if-nez p6, :cond_1

    .line 28
    .line 29
    move v1, p1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 p2, 0x2

    .line 32
    move v1, p2

    .line 33
    :goto_0
    iget-object p2, p0, LM0/i;->a:Lo0/c;

    .line 34
    .line 35
    iget-object v0, p2, Lo0/c;->c:Lo0/f;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-virtual/range {v0 .. v5}, Lo0/f;->d(IJJ)J

    .line 40
    .line 41
    .line 42
    move-result-wide p2

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    sget-wide p2, Ld0/c;->b:J

    .line 45
    .line 46
    :goto_1
    invoke-static {p2, p3}, Ld0/c;->b(J)F

    .line 47
    .line 48
    .line 49
    move-result p4

    .line 50
    invoke-static {p4}, Lu0/Q;->d(F)I

    .line 51
    .line 52
    .line 53
    move-result p4

    .line 54
    const/4 p5, 0x0

    .line 55
    aput p4, p7, p5

    .line 56
    .line 57
    invoke-static {p2, p3}, Ld0/c;->c(J)F

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    invoke-static {p2}, Lu0/Q;->d(F)I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    aput p2, p7, p1

    .line 66
    .line 67
    return-void
.end method

.method public final e(Landroid/view/View;IIIII)V
    .locals 6

    .line 1
    invoke-virtual {p0}, LM0/i;->isNestedScrollingEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    int-to-float p1, p2

    .line 9
    const/4 p2, -0x1

    .line 10
    int-to-float p2, p2

    .line 11
    mul-float/2addr p1, p2

    .line 12
    int-to-float p3, p3

    .line 13
    mul-float/2addr p3, p2

    .line 14
    invoke-static {p1, p3}, LU8/v0;->f(FF)J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    int-to-float p1, p4

    .line 19
    mul-float/2addr p1, p2

    .line 20
    int-to-float p3, p5

    .line 21
    mul-float/2addr p3, p2

    .line 22
    invoke-static {p1, p3}, LU8/v0;->f(FF)J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    if-nez p6, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    :goto_0
    move v1, p1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 p1, 0x2

    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object p1, p0, LM0/i;->a:Lo0/c;

    .line 34
    .line 35
    iget-object v0, p1, Lo0/c;->c:Lo0/f;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-virtual/range {v0 .. v5}, Lo0/f;->d(IJJ)J

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    sget p1, Ld0/c;->e:I

    .line 44
    .line 45
    return-void
.end method

.method public final f(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    .line 1
    const-string p2, "child"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x2

    const/4 p2, 0x1

    if-nez p1, :cond_1

    and-int/lit8 p1, p3, 0x1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    return p2
.end method

.method public final gatherTransparentRegion(Landroid/graphics/Region;)Z
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, LM0/i;->o:[I

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aget v4, v1, v2

    .line 12
    .line 13
    aget v5, v1, v0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    add-int v6, v2, v4

    .line 20
    .line 21
    aget v1, v1, v0

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    add-int v7, v2, v1

    .line 28
    .line 29
    sget-object v8, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 30
    .line 31
    move-object v3, p1

    .line 32
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    .line 33
    .line 34
    .line 35
    return v0
.end method

.method public final getDensity()LL0/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, LM0/i;->g:LL0/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLayoutNode()Lt0/t;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, LM0/i;->s:Lt0/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, LM0/i;->b:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object v0

    .line 13
    :cond_1
    :goto_0
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final getLifecycleOwner()Landroidx/lifecycle/v;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, LM0/i;->i:Landroidx/lifecycle/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getModifier()LZ/k;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, LM0/i;->e:LZ/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNestedScrollAxes()I
    .locals 2

    .line 1
    iget-object v0, p0, LM0/i;->r:LD9/n;

    .line 2
    .line 3
    iget v1, v0, LD9/n;->b:I

    .line 4
    .line 5
    iget v0, v0, LD9/n;->c:I

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    return v0
.end method

.method public final getOnDensityChanged$ui_release()Ltf/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ltf/l;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, LM0/i;->h:Ltf/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOnModifierChanged$ui_release()Ltf/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ltf/l;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, LM0/i;->f:Ltf/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOnRequestDisallowInterceptTouchEvent$ui_release()Ltf/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ltf/l;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, LM0/i;->n:Ltf/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSavedStateRegistryOwner()Ln3/f;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, LM0/i;->j:Ln3/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUpdate()Ltf/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ltf/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, LM0/i;->c:Ltf/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getView()Landroid/view/View;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, LM0/i;->b:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public final invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LM0/i;->s:Lt0/t;

    .line 5
    .line 6
    invoke-virtual {p1}, Lt0/t;->o()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 1

    .line 1
    iget-object v0, p0, LM0/i;->b:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    invoke-super {p0}, Landroid/view/ViewGroup;->isNestedScrollingEnabled()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LM0/i;->k:LX/u;

    .line 5
    .line 6
    invoke-virtual {v0}, LX/u;->d()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "child"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "target"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, LM0/i;->s:Lt0/t;

    .line 15
    .line 16
    invoke-virtual {p1}, Lt0/t;->o()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LM0/i;->k:LX/u;

    .line 5
    .line 6
    iget-object v1, v0, LX/u;->g:LS8/b;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, LS8/b;->c()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, LX/u;->b()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    iget-object p1, p0, LM0/i;->b:Landroid/view/View;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sub-int/2addr p4, p2

    .line 6
    sub-int/2addr p5, p3

    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    iget-object v0, p0, LM0/i;->b:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LM0/i;->b:Landroid/view/View;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move v0, v1

    .line 19
    :goto_0
    iget-object v2, p0, LM0/i;->b:Landroid/view/View;

    .line 20
    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    :cond_2
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 28
    .line 29
    .line 30
    iput p1, p0, LM0/i;->p:I

    .line 31
    .line 32
    iput p2, p0, LM0/i;->q:I

    .line 33
    .line 34
    return-void
.end method

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 7

    .line 1
    const-string v0, "target"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LM0/i;->isNestedScrollingEnabled()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 v0, 0x0

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    const/high16 p1, -0x40800000    # -1.0f

    .line 15
    .line 16
    mul-float/2addr p2, p1

    .line 17
    mul-float/2addr p3, p1

    .line 18
    invoke-static {p2, p3}, LFe/c;->d(FF)J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    iget-object p1, p0, LM0/i;->a:Lo0/c;

    .line 23
    .line 24
    iget-object p1, p1, Lo0/c;->a:Lkotlin/jvm/internal/n;

    .line 25
    .line 26
    invoke-interface {p1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, LEf/E;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    new-instance v1, LM0/d;

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    move-object v3, p0

    .line 38
    move v2, p4

    .line 39
    invoke-direct/range {v1 .. v6}, LM0/d;-><init>(ZLM0/i;JLjf/c;)V

    .line 40
    .line 41
    .line 42
    const/4 p2, 0x3

    .line 43
    const/4 p3, 0x0

    .line 44
    invoke-static {p1, p3, v1, p2}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 45
    .line 46
    .line 47
    return v0

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 3

    .line 1
    const-string v0, "target"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LM0/i;->isNestedScrollingEnabled()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 v0, 0x0

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    const/high16 p1, -0x40800000    # -1.0f

    .line 15
    .line 16
    mul-float/2addr p2, p1

    .line 17
    mul-float/2addr p3, p1

    .line 18
    invoke-static {p2, p3}, LFe/c;->d(FF)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    iget-object p3, p0, LM0/i;->a:Lo0/c;

    .line 23
    .line 24
    iget-object p3, p3, Lo0/c;->a:Lkotlin/jvm/internal/n;

    .line 25
    .line 26
    invoke-interface {p3}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    check-cast p3, LEf/E;

    .line 31
    .line 32
    if-eqz p3, :cond_1

    .line 33
    .line 34
    new-instance v1, LM0/e;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-direct {v1, p0, p1, p2, v2}, LM0/e;-><init>(LM0/i;JLjf/c;)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x3

    .line 41
    invoke-static {p3, v2, v1, p1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 42
    .line 43
    .line 44
    return v0

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1
.end method

.method public final requestDisallowInterceptTouchEvent(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LM0/i;->n:Ltf/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setDensity(LL0/b;)V
    .locals 1
    .param p1    # LL0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM0/i;->g:LL0/b;

    .line 7
    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, LM0/i;->g:LL0/b;

    .line 11
    .line 12
    iget-object v0, p0, LM0/i;->h:Ltf/l;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final setLifecycleOwner(Landroidx/lifecycle/v;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/v;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, LM0/i;->i:Landroidx/lifecycle/v;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, LM0/i;->i:Landroidx/lifecycle/v;

    .line 6
    .line 7
    invoke-static {p0, p1}, Landroidx/lifecycle/V;->h(Landroid/view/View;Landroidx/lifecycle/v;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setModifier(LZ/k;)V
    .locals 1
    .param p1    # LZ/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM0/i;->e:LZ/k;

    .line 7
    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, LM0/i;->e:LZ/k;

    .line 11
    .line 12
    iget-object v0, p0, LM0/i;->f:Ltf/l;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final setOnDensityChanged$ui_release(Ltf/l;)V
    .locals 0
    .param p1    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, LM0/i;->h:Ltf/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnModifierChanged$ui_release(Ltf/l;)V
    .locals 0
    .param p1    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, LM0/i;->f:Ltf/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnRequestDisallowInterceptTouchEvent$ui_release(Ltf/l;)V
    .locals 0
    .param p1    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, LM0/i;->n:Ltf/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setSavedStateRegistryOwner(Ln3/f;)V
    .locals 1
    .param p1    # Ln3/f;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, LM0/i;->j:Ln3/f;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, LM0/i;->j:Ln3/f;

    .line 6
    .line 7
    invoke-static {p0, p1}, Ltg/b;->O(Landroid/view/View;Ln3/f;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setUpdate(Ltf/a;)V
    .locals 1
    .param p1    # Ltf/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LM0/i;->c:Ltf/a;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, LM0/i;->d:Z

    .line 10
    .line 11
    iget-object p1, p0, LM0/i;->m:LM0/f;

    .line 12
    .line 13
    invoke-virtual {p1}, LM0/f;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setView$ui_release(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, LM0/i;->b:Landroid/view/View;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, LM0/i;->b:Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 8
    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, LM0/i;->m:LM0/f;

    .line 16
    .line 17
    invoke-virtual {p1}, LM0/f;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
