.class public final Lu0/s0;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lt0/G;


# static fields
.field public static final m:Lu0/q0;

.field public static n:Ljava/lang/reflect/Method;

.field public static o:Ljava/lang/reflect/Field;

.field public static p:Z

.field public static q:Z


# instance fields
.field public final a:Lu0/n;

.field public final b:Lu0/S;

.field public c:Lt0/y;

.field public d:Lt0/p;

.field public final e:Lu0/c0;

.field public f:Z

.field public g:Landroid/graphics/Rect;

.field public h:Z

.field public i:Z

.field public final j:Lac/a;

.field public final k:Lu0/a0;

.field public l:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lu0/q0;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/view/ViewOutlineProvider;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu0/s0;->m:Lu0/q0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lu0/n;Lu0/S;Lt0/y;Lt0/p;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "invalidateParentLayer"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {p0, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lu0/s0;->a:Lu0/n;

    .line 19
    .line 20
    iput-object p2, p0, Lu0/s0;->b:Lu0/S;

    .line 21
    .line 22
    iput-object p3, p0, Lu0/s0;->c:Lt0/y;

    .line 23
    .line 24
    iput-object p4, p0, Lu0/s0;->d:Lt0/p;

    .line 25
    .line 26
    new-instance p3, Lu0/c0;

    .line 27
    .line 28
    invoke-virtual {p1}, Lu0/n;->getDensity()LL0/b;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {p3, p1}, Lu0/c0;-><init>(LL0/b;)V

    .line 33
    .line 34
    .line 35
    iput-object p3, p0, Lu0/s0;->e:Lu0/c0;

    .line 36
    .line 37
    new-instance p1, Lac/a;

    .line 38
    .line 39
    const/4 p3, 0x4

    .line 40
    invoke-direct {p1, p3}, Lac/a;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lu0/s0;->j:Lac/a;

    .line 44
    .line 45
    new-instance p1, Lu0/a0;

    .line 46
    .line 47
    sget-object p3, Lu0/J;->l:Lu0/J;

    .line 48
    .line 49
    invoke-direct {p1, p3}, Lu0/a0;-><init>(Ltf/p;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lu0/s0;->k:Lu0/a0;

    .line 53
    .line 54
    sget-wide p3, Le0/J;->b:J

    .line 55
    .line 56
    iput-wide p3, p0, Lu0/s0;->l:J

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-virtual {p0, p1}, Landroid/view/View;->setId(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method private final getManualClipPath()Le0/x;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getClipToOutline()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lu0/s0;->e:Lu0/c0;

    .line 8
    .line 9
    iget-boolean v1, v0, Lu0/c0;->i:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Lu0/c0;->e()V

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, Lu0/c0;->g:Le0/x;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method

.method private final setInvalidated(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lu0/s0;->h:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lu0/s0;->h:Z

    .line 6
    .line 7
    iget-object v0, p0, Lu0/s0;->a:Lu0/n;

    .line 8
    .line 9
    invoke-virtual {v0, p0, p1}, Lu0/n;->l(Lt0/G;Z)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Le0/o;)V
    .locals 3

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    cmpl-float v0, v0, v1

    .line 12
    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    iput-boolean v0, p0, Lu0/s0;->i:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p1}, Le0/o;->i()V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lu0/s0;->b:Lu0/S;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getDrawingTime()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-virtual {v0, p1, p0, v1, v2}, Lu0/S;->a(Le0/o;Lu0/s0;J)V

    .line 32
    .line 33
    .line 34
    iget-boolean v0, p0, Lu0/s0;->i:Z

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-interface {p1}, Le0/o;->o()V

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void
.end method

.method public final b(FFFFFJLe0/E;ZJJLL0/i;LL0/b;)V
    .locals 6

    .line 1
    const-string v0, "shape"

    .line 2
    .line 3
    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "layoutDirection"

    .line 7
    .line 8
    move-object/from16 v1, p14

    .line 9
    .line 10
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "density"

    .line 14
    .line 15
    move-object/from16 v2, p15

    .line 16
    .line 17
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-wide p6, p0, Lu0/s0;->l:J

    .line 21
    .line 22
    invoke-virtual/range {p0 .. p1}, Landroid/view/View;->setScaleX(F)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p2}, Landroid/view/View;->setScaleY(F)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p3}, Landroid/view/View;->setAlpha(F)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p4}, Landroid/view/View;->setElevation(F)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotation(F)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotationX(F)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->setRotationY(F)V

    .line 48
    .line 49
    .line 50
    iget-wide p1, p0, Lu0/s0;->l:J

    .line 51
    .line 52
    sget p3, Le0/J;->c:I

    .line 53
    .line 54
    const/16 p3, 0x20

    .line 55
    .line 56
    shr-long/2addr p1, p3

    .line 57
    long-to-int p1, p1

    .line 58
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    int-to-float p2, p2

    .line 67
    mul-float/2addr p1, p2

    .line 68
    invoke-virtual {p0, p1}, Landroid/view/View;->setPivotX(F)V

    .line 69
    .line 70
    .line 71
    iget-wide p1, p0, Lu0/s0;->l:J

    .line 72
    .line 73
    const-wide p3, 0xffffffffL

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    and-long/2addr p1, p3

    .line 79
    long-to-int p1, p1

    .line 80
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    int-to-float p2, p2

    .line 89
    mul-float/2addr p1, p2

    .line 90
    invoke-virtual {p0, p1}, Landroid/view/View;->setPivotY(F)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p5}, Lu0/s0;->setCameraDistancePx(F)V

    .line 94
    .line 95
    .line 96
    sget-object p1, Le0/z;->a:Lad/I;

    .line 97
    .line 98
    const/4 v3, 0x0

    .line 99
    const/4 v4, 0x1

    .line 100
    if-eqz p9, :cond_0

    .line 101
    .line 102
    if-ne p8, p1, :cond_0

    .line 103
    .line 104
    move p2, v4

    .line 105
    goto :goto_0

    .line 106
    :cond_0
    move p2, v3

    .line 107
    :goto_0
    iput-boolean p2, p0, Lu0/s0;->f:Z

    .line 108
    .line 109
    invoke-virtual {p0}, Lu0/s0;->j()V

    .line 110
    .line 111
    .line 112
    invoke-direct {p0}, Lu0/s0;->getManualClipPath()Le0/x;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    if-eqz p2, :cond_1

    .line 117
    .line 118
    move v5, v4

    .line 119
    goto :goto_1

    .line 120
    :cond_1
    move v5, v3

    .line 121
    :goto_1
    if-eqz p9, :cond_2

    .line 122
    .line 123
    if-eq p8, p1, :cond_2

    .line 124
    .line 125
    move p1, v4

    .line 126
    goto :goto_2

    .line 127
    :cond_2
    move p1, v3

    .line 128
    :goto_2
    invoke-virtual {p0, p1}, Landroid/view/View;->setClipToOutline(Z)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 132
    .line 133
    .line 134
    move-result p3

    .line 135
    invoke-virtual {p0}, Landroid/view/View;->getClipToOutline()Z

    .line 136
    .line 137
    .line 138
    move-result p4

    .line 139
    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    iget-object p2, p0, Lu0/s0;->e:Lu0/c0;

    .line 144
    .line 145
    move p5, p1

    .line 146
    move-object p1, p2

    .line 147
    move-object p2, p8

    .line 148
    move-object p6, v1

    .line 149
    move-object p7, v2

    .line 150
    invoke-virtual/range {p1 .. p7}, Lu0/c0;->d(Le0/E;FZFLL0/i;LL0/b;)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    iget-object p2, p0, Lu0/s0;->e:Lu0/c0;

    .line 155
    .line 156
    invoke-virtual {p2}, Lu0/c0;->b()Landroid/graphics/Outline;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    const/4 p3, 0x0

    .line 161
    if-eqz p2, :cond_3

    .line 162
    .line 163
    sget-object p2, Lu0/s0;->m:Lu0/q0;

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_3
    move-object p2, p3

    .line 167
    :goto_3
    invoke-virtual {p0, p2}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 168
    .line 169
    .line 170
    invoke-direct {p0}, Lu0/s0;->getManualClipPath()Le0/x;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    if-eqz p2, :cond_4

    .line 175
    .line 176
    move v3, v4

    .line 177
    :cond_4
    if-ne v5, v3, :cond_5

    .line 178
    .line 179
    if-eqz v3, :cond_6

    .line 180
    .line 181
    if-eqz p1, :cond_6

    .line 182
    .line 183
    :cond_5
    invoke-virtual {p0}, Lu0/s0;->invalidate()V

    .line 184
    .line 185
    .line 186
    :cond_6
    iget-boolean p1, p0, Lu0/s0;->i:Z

    .line 187
    .line 188
    if-nez p1, :cond_7

    .line 189
    .line 190
    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    cmpl-float p1, p1, v0

    .line 195
    .line 196
    if-lez p1, :cond_7

    .line 197
    .line 198
    iget-object p1, p0, Lu0/s0;->d:Lt0/p;

    .line 199
    .line 200
    if-eqz p1, :cond_7

    .line 201
    .line 202
    invoke-virtual {p1}, Lt0/p;->invoke()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    :cond_7
    iget-object p1, p0, Lu0/s0;->k:Lu0/a0;

    .line 206
    .line 207
    invoke-virtual {p1}, Lu0/a0;->c()V

    .line 208
    .line 209
    .line 210
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 211
    .line 212
    const/16 p2, 0x1c

    .line 213
    .line 214
    if-lt p1, p2, :cond_8

    .line 215
    .line 216
    sget-object p2, Lu0/u0;->a:Lu0/u0;

    .line 217
    .line 218
    invoke-static/range {p10 .. p11}, Le0/z;->s(J)I

    .line 219
    .line 220
    .line 221
    move-result p4

    .line 222
    invoke-virtual {p2, p0, p4}, Lu0/u0;->a(Landroid/view/View;I)V

    .line 223
    .line 224
    .line 225
    invoke-static/range {p12 .. p13}, Le0/z;->s(J)I

    .line 226
    .line 227
    .line 228
    move-result p4

    .line 229
    invoke-virtual {p2, p0, p4}, Lu0/u0;->b(Landroid/view/View;I)V

    .line 230
    .line 231
    .line 232
    :cond_8
    const/16 p2, 0x1f

    .line 233
    .line 234
    if-lt p1, p2, :cond_9

    .line 235
    .line 236
    sget-object p1, Lu0/v0;->a:Lu0/v0;

    .line 237
    .line 238
    invoke-virtual {p1, p0, p3}, Lu0/v0;->a(Landroid/view/View;Le0/A;)V

    .line 239
    .line 240
    .line 241
    :cond_9
    return-void
.end method

.method public final c(JZ)J
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/s0;->k:Lu0/a0;

    .line 2
    .line 3
    if-eqz p3, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lu0/a0;->a(Ljava/lang/Object;)[F

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    invoke-static {p1, p2, p3}, Le0/z;->m(J[F)J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    return-wide p1

    .line 16
    :cond_0
    sget-wide p1, Ld0/c;->c:J

    .line 17
    .line 18
    return-wide p1

    .line 19
    :cond_1
    invoke-virtual {v0, p0}, Lu0/a0;->b(Ljava/lang/Object;)[F

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-static {p1, p2, p3}, Le0/z;->m(J[F)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    return-wide p1
.end method

.method public final d(J)V
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p1, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    const-wide v2, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr p1, v2

    .line 12
    long-to-int p1, p1

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-ne v1, p2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eq p1, p2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void

    .line 27
    :cond_1
    :goto_0
    iget-wide v4, p0, Lu0/s0;->l:J

    .line 28
    .line 29
    sget p2, Le0/J;->c:I

    .line 30
    .line 31
    shr-long/2addr v4, v0

    .line 32
    long-to-int p2, v4

    .line 33
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    int-to-float v0, v1

    .line 38
    mul-float/2addr p2, v0

    .line 39
    invoke-virtual {p0, p2}, Landroid/view/View;->setPivotX(F)V

    .line 40
    .line 41
    .line 42
    iget-wide v4, p0, Lu0/s0;->l:J

    .line 43
    .line 44
    and-long/2addr v2, v4

    .line 45
    long-to-int p2, v2

    .line 46
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    int-to-float v2, p1

    .line 51
    mul-float/2addr p2, v2

    .line 52
    invoke-virtual {p0, p2}, Landroid/view/View;->setPivotY(F)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v2}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    iget-object p2, p0, Lu0/s0;->e:Lu0/c0;

    .line 60
    .line 61
    iget-wide v4, p2, Lu0/c0;->d:J

    .line 62
    .line 63
    invoke-static {v4, v5, v2, v3}, Ld0/f;->a(JJ)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    iput-wide v2, p2, Lu0/c0;->d:J

    .line 70
    .line 71
    const/4 v0, 0x1

    .line 72
    iput-boolean v0, p2, Lu0/c0;->h:Z

    .line 73
    .line 74
    :cond_2
    invoke-virtual {p2}, Lu0/c0;->b()Landroid/graphics/Outline;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    if-eqz p2, :cond_3

    .line 79
    .line 80
    sget-object p2, Lu0/s0;->m:Lu0/q0;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    const/4 p2, 0x0

    .line 84
    :goto_1
    invoke-virtual {p0, p2}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    add-int/2addr v2, v1

    .line 100
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    add-int/2addr v1, p1

    .line 105
    invoke-virtual {p0, p2, v0, v2, v1}, Landroid/view/View;->layout(IIII)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lu0/s0;->j()V

    .line 109
    .line 110
    .line 111
    iget-object p1, p0, Lu0/s0;->k:Lu0/a0;

    .line 112
    .line 113
    invoke-virtual {p1}, Lu0/a0;->c()V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public final destroy()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lu0/s0;->setInvalidated(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lu0/s0;->a:Lu0/n;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Lu0/n;->u:Z

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, p0, Lu0/s0;->c:Lt0/y;

    .line 12
    .line 13
    iput-object v1, p0, Lu0/s0;->d:Lt0/p;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Lu0/n;->q(Lt0/G;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lu0/s0;->b:Lu0/S;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lu0/s0;->setInvalidated(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lu0/s0;->j:Lac/a;

    .line 11
    .line 12
    iget-object v2, v1, Lac/a;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Le0/b;

    .line 15
    .line 16
    iget-object v3, v2, Le0/b;->a:Landroid/graphics/Canvas;

    .line 17
    .line 18
    iput-object p1, v2, Le0/b;->a:Landroid/graphics/Canvas;

    .line 19
    .line 20
    invoke-direct {p0}, Lu0/s0;->getManualClipPath()Le0/x;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-object v1, v1, Lac/a;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Le0/b;

    .line 27
    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v1}, Le0/b;->m()V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lu0/s0;->e:Lu0/c0;

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Lu0/c0;->a(Le0/o;)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    :cond_1
    iget-object p1, p0, Lu0/s0;->c:Lt0/y;

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    invoke-virtual {p1, v1}, Lt0/y;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_2
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {v1}, Le0/b;->restore()V

    .line 55
    .line 56
    .line 57
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const-string p1, "<set-?>"

    .line 61
    .line 62
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iput-object v3, v1, Le0/b;->a:Landroid/graphics/Canvas;

    .line 66
    .line 67
    return-void
.end method

.method public final e(J)Z
    .locals 4

    .line 1
    invoke-static {p1, p2}, Ld0/c;->b(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, p2}, Ld0/c;->c(J)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-boolean v2, p0, Lu0/s0;->f:Z

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    cmpg-float p2, p1, v0

    .line 16
    .line 17
    if-gtz p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    int-to-float p2, p2

    .line 24
    cmpg-float p2, v0, p2

    .line 25
    .line 26
    if-gez p2, :cond_0

    .line 27
    .line 28
    cmpg-float p1, p1, v1

    .line 29
    .line 30
    if-gtz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    int-to-float p1, p1

    .line 37
    cmpg-float p1, v1, p1

    .line 38
    .line 39
    if-gez p1, :cond_0

    .line 40
    .line 41
    return v3

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    return p1

    .line 44
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getClipToOutline()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    iget-object v0, p0, Lu0/s0;->e:Lu0/c0;

    .line 51
    .line 52
    invoke-virtual {v0, p1, p2}, Lu0/c0;->c(J)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    return p1

    .line 57
    :cond_2
    return v3
.end method

.method public final f(Ld0/b;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/s0;->k:Lu0/a0;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lu0/a0;->a(Ljava/lang/Object;)[F

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-static {p2, p1}, Le0/z;->n([FLd0/b;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const/4 p2, 0x0

    .line 16
    iput p2, p1, Ld0/b;->a:F

    .line 17
    .line 18
    iput p2, p1, Ld0/b;->b:F

    .line 19
    .line 20
    iput p2, p1, Ld0/b;->c:F

    .line 21
    .line 22
    iput p2, p1, Ld0/b;->d:F

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {v0, p0}, Lu0/a0;->b(Ljava/lang/Object;)[F

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {p2, p1}, Le0/z;->n([FLd0/b;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final forceLayout()V
    .locals 0

    .line 1
    return-void
.end method

.method public final g(J)V
    .locals 3

    .line 1
    sget v0, LL0/g;->c:I

    .line 2
    .line 3
    const/16 v0, 0x20

    .line 4
    .line 5
    shr-long v0, p1, v0

    .line 6
    .line 7
    long-to-int v0, v0

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget-object v2, p0, Lu0/s0;->k:Lu0/a0;

    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sub-int/2addr v0, v1

    .line 21
    invoke-virtual {p0, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lu0/a0;->c()V

    .line 25
    .line 26
    .line 27
    :cond_0
    const-wide v0, 0xffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr p1, v0

    .line 33
    long-to-int p1, p1

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eq p1, p2, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    sub-int/2addr p1, p2

    .line 45
    invoke-virtual {p0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Lu0/a0;->c()V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method

.method public final getCameraDistancePx()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getCameraDistance()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 14
    .line 15
    int-to-float v1, v1

    .line 16
    div-float/2addr v0, v1

    .line 17
    return v0
.end method

.method public final getContainer()Lu0/S;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/s0;->b:Lu0/S;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLayerId()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    return-wide v0
.end method

.method public final getOwnerView()Lu0/n;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lu0/s0;->a:Lu0/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public getOwnerViewId()J
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lu0/s0;->a:Lu0/n;

    .line 8
    .line 9
    invoke-static {v0}, Lu0/r0;->a(Landroid/view/View;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0

    .line 14
    :cond_0
    const-wide/16 v0, -0x1

    .line 15
    .line 16
    return-wide v0
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lu0/s0;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Lu0/s0;->q:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, v0}, Lu0/s0;->setInvalidated(Z)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lu0/Q;->k(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final i(Lt0/y;Lt0/p;)V
    .locals 2

    .line 1
    const-string v0, "invalidateParentLayer"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu0/s0;->b:Lu0/S;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lu0/s0;->f:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lu0/s0;->i:Z

    .line 15
    .line 16
    sget-wide v0, Le0/J;->b:J

    .line 17
    .line 18
    iput-wide v0, p0, Lu0/s0;->l:J

    .line 19
    .line 20
    iput-object p1, p0, Lu0/s0;->c:Lt0/y;

    .line 21
    .line 22
    iput-object p2, p0, Lu0/s0;->d:Lt0/p;

    .line 23
    .line 24
    return-void
.end method

.method public final invalidate()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lu0/s0;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-direct {p0, v0}, Lu0/s0;->setInvalidated(Z)V

    .line 7
    .line 8
    .line 9
    invoke-super {p0}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lu0/s0;->a:Lu0/n;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lu0/s0;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lu0/s0;->g:Landroid/graphics/Rect;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Landroid/graphics/Rect;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-direct {v0, v1, v1, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lu0/s0;->g:Landroid/graphics/Rect;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {v0, v1, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-object v0, p0, Lu0/s0;->g:Landroid/graphics/Rect;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/4 v0, 0x0

    .line 44
    :goto_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setCameraDistancePx(F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    mul-float/2addr p1, v0

    .line 13
    invoke-virtual {p0, p1}, Landroid/view/View;->setCameraDistance(F)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
