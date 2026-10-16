.class public final LH0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lz0/p;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/ArrayList;

.field public final e:LE0/e;

.field public final f:LL0/b;

.field public final g:LH0/d;

.field public final h:Ljava/lang/CharSequence;

.field public final i:LDd/c;

.field public final j:Ljava/util/ArrayList;

.field public final k:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lz0/p;Ljava/util/List;Ljava/util/ArrayList;LE0/e;LL0/b;)V
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    const-wide v6, 0x100000000L

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x1

    const-string v11, "fontFamilyResolver"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "density"

    invoke-static {v3, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v12, p1

    .line 2
    iput-object v12, v0, LH0/c;->a:Ljava/lang/String;

    .line 3
    iput-object v1, v0, LH0/c;->b:Lz0/p;

    move-object/from16 v12, p3

    .line 4
    iput-object v12, v0, LH0/c;->c:Ljava/util/List;

    move-object/from16 v12, p4

    .line 5
    iput-object v12, v0, LH0/c;->d:Ljava/util/ArrayList;

    .line 6
    iput-object v2, v0, LH0/c;->e:LE0/e;

    .line 7
    iput-object v3, v0, LH0/c;->f:LL0/b;

    .line 8
    new-instance v12, LH0/d;

    invoke-interface {v3}, LL0/b;->b()F

    move-result v13

    .line 9
    invoke-direct {v12, v10}, Landroid/text/TextPaint;-><init>(I)V

    .line 10
    iput v13, v12, Landroid/text/TextPaint;->density:F

    .line 11
    sget-object v13, LK0/d;->b:LK0/d;

    iput-object v13, v12, LH0/d;->a:LK0/d;

    .line 12
    sget-object v13, Le0/D;->d:Le0/D;

    .line 13
    iput-object v13, v12, LH0/d;->b:Le0/D;

    .line 14
    iput-object v12, v0, LH0/c;->g:LH0/d;

    .line 15
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    iput-object v13, v0, LH0/c;->j:Ljava/util/ArrayList;

    .line 16
    iget-object v14, v1, Lz0/p;->b:Lz0/h;

    .line 17
    iget-object v14, v14, Lz0/h;->b:LK0/e;

    .line 18
    iget-object v1, v1, Lz0/p;->a:Lz0/j;

    iget-object v15, v1, Lz0/j;->k:LG0/c;

    const/4 v4, 0x3

    if-eqz v14, :cond_0

    .line 19
    iget v5, v14, LK0/e;->a:I

    goto :goto_0

    :cond_0
    move v5, v4

    :goto_0
    const/4 v14, 0x4

    if-ne v5, v14, :cond_2

    :cond_1
    :goto_1
    move v4, v9

    goto :goto_3

    :cond_2
    const/4 v14, 0x5

    if-ne v5, v14, :cond_3

    goto :goto_3

    :cond_3
    if-ne v5, v10, :cond_4

    move v4, v8

    goto :goto_3

    :cond_4
    if-ne v5, v9, :cond_5

    move v4, v10

    goto :goto_3

    :cond_5
    if-ne v5, v4, :cond_46

    if-eqz v15, :cond_6

    .line 20
    iget-object v5, v15, LG0/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LG0/b;

    .line 21
    iget-object v5, v5, LG0/b;->a:LG0/a;

    .line 22
    iget-object v5, v5, LG0/a;->a:Ljava/util/Locale;

    goto :goto_2

    .line 23
    :cond_6
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    .line 24
    :goto_2
    invoke-static {v5}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result v5

    if-eqz v5, :cond_1

    if-eq v5, v10, :cond_7

    goto :goto_1

    .line 25
    :cond_7
    :goto_3
    iput v4, v0, LH0/c;->k:I

    .line 26
    new-instance v4, LH0/b;

    invoke-direct {v4, v0, v8}, LH0/b;-><init>(Ljava/lang/Object;I)V

    .line 27
    iget-wide v14, v1, Lz0/j;->b:J

    move v5, v9

    move/from16 v16, v10

    invoke-static {v14, v15}, LL0/j;->b(J)J

    move-result-wide v9

    .line 28
    invoke-static {v9, v10, v6, v7}, LL0/k;->a(JJ)Z

    move-result v17

    if-eqz v17, :cond_8

    .line 29
    invoke-interface {v3, v14, v15}, LL0/b;->l(J)F

    move-result v3

    invoke-virtual {v12, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    move/from16 p1, v5

    goto :goto_4

    :cond_8
    move/from16 p1, v5

    const-wide v5, 0x200000000L

    .line 30
    invoke-static {v9, v10, v5, v6}, LL0/k;->a(JJ)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 31
    invoke-virtual {v12}, Landroid/graphics/Paint;->getTextSize()F

    move-result v3

    invoke-static {v14, v15}, LL0/j;->c(J)F

    move-result v5

    mul-float/2addr v5, v3

    invoke-virtual {v12, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 32
    :cond_9
    :goto_4
    invoke-static {v1}, LA6/c;->B(Lz0/j;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 33
    iget-object v3, v1, Lz0/j;->c:LE0/l;

    if-nez v3, :cond_a

    .line 34
    sget-object v3, LE0/l;->d:LE0/l;

    .line 35
    :cond_a
    iget-object v5, v1, Lz0/j;->d:LE0/j;

    if-eqz v5, :cond_b

    iget v5, v5, LE0/j;->a:I

    goto :goto_5

    :cond_b
    move v5, v8

    .line 36
    :goto_5
    iget-object v6, v1, Lz0/j;->e:LE0/k;

    if-eqz v6, :cond_c

    iget v6, v6, LE0/k;->a:I

    goto :goto_6

    :cond_c
    move/from16 v6, v16

    .line 37
    :goto_6
    const-string v7, "fontWeight"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    check-cast v2, LE0/f;

    iget-object v7, v1, Lz0/j;->f:LE0/o;

    invoke-virtual {v2, v7, v3, v5, v6}, LE0/f;->b(LE0/o;LE0/l;II)LE0/q;

    move-result-object v2

    .line 39
    new-instance v3, LH0/e;

    invoke-direct {v3, v2}, LH0/e;-><init>(LE0/q;)V

    .line 40
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    iget-object v2, v3, LH0/e;->b:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Typeface;

    .line 42
    invoke-virtual {v12, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 43
    :cond_d
    iget-object v2, v1, Lz0/j;->k:LG0/c;

    if-eqz v2, :cond_11

    .line 44
    sget-object v3, LG0/e;->a:LG0/d;

    .line 45
    invoke-interface {v3}, LG0/d;->b()Ljava/util/List;

    move-result-object v3

    .line 46
    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    move v7, v8

    :goto_7
    if-ge v7, v6, :cond_e

    .line 48
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 49
    check-cast v9, LG0/a;

    .line 50
    new-instance v10, LG0/b;

    invoke-direct {v10, v9}, LG0/b;-><init>(LG0/a;)V

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    :cond_e
    new-instance v3, LG0/c;

    invoke-direct {v3, v5}, LG0/c;-><init>(Ljava/util/ArrayList;)V

    .line 51
    invoke-virtual {v2, v3}, LG0/c;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    .line 52
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x18

    if-lt v3, v5, :cond_f

    .line 53
    sget-object v3, LI0/a;->a:LI0/a;

    invoke-virtual {v3, v12, v2}, LI0/a;->b(LH0/d;LG0/c;)V

    goto :goto_9

    .line 54
    :cond_f
    iget-object v2, v2, LG0/c;->a:Ljava/util/ArrayList;

    .line 55
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_10

    .line 56
    new-instance v2, LG0/b;

    .line 57
    sget-object v3, LG0/e;->a:LG0/d;

    .line 58
    invoke-interface {v3}, LG0/d;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LG0/a;

    invoke-direct {v2, v3}, LG0/b;-><init>(LG0/a;)V

    goto :goto_8

    .line 59
    :cond_10
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LG0/b;

    .line 60
    :goto_8
    const-string v3, "<this>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    iget-object v2, v2, LG0/b;->a:LG0/a;

    iget-object v2, v2, LG0/a;->a:Ljava/util/Locale;

    .line 62
    invoke-virtual {v12, v2}, Landroid/graphics/Paint;->setTextLocale(Ljava/util/Locale;)V

    .line 63
    :cond_11
    :goto_9
    iget-wide v2, v1, Lz0/j;->h:J

    invoke-static {v2, v3}, LL0/j;->b(J)J

    move-result-wide v5

    const-wide v9, 0x200000000L

    .line 64
    invoke-static {v5, v6, v9, v10}, LL0/k;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-static {v2, v3}, LL0/j;->c(J)F

    move-result v5

    invoke-virtual {v12, v5}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 65
    :cond_12
    iget-object v5, v1, Lz0/j;->g:Ljava/lang/String;

    if-eqz v5, :cond_13

    .line 66
    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_13

    .line 67
    invoke-virtual {v12, v5}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 68
    :cond_13
    iget-object v5, v1, Lz0/j;->j:LK0/h;

    if-eqz v5, :cond_14

    .line 69
    sget-object v6, LK0/h;->c:LK0/h;

    .line 70
    invoke-virtual {v5, v6}, LK0/h;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    .line 71
    invoke-virtual {v12}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v6

    iget v7, v5, LK0/h;->a:F

    mul-float/2addr v6, v7

    invoke-virtual {v12, v6}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 72
    invoke-virtual {v12}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v6

    iget v5, v5, LK0/h;->b:F

    add-float/2addr v6, v5

    invoke-virtual {v12, v6}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 73
    :cond_14
    iget-object v5, v1, Lz0/j;->a:LK0/g;

    invoke-interface {v5}, LK0/g;->a()J

    move-result-wide v5

    .line 74
    invoke-virtual {v12, v5, v6}, LH0/d;->a(J)V

    .line 75
    sget v5, Ld0/f;->d:I

    const/4 v5, 0x0

    .line 76
    invoke-virtual {v12, v5}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 77
    iget-object v6, v1, Lz0/j;->n:Le0/D;

    invoke-virtual {v12, v6}, LH0/d;->b(Le0/D;)V

    .line 78
    iget-object v6, v1, Lz0/j;->m:LK0/d;

    invoke-virtual {v12, v6}, LH0/d;->c(LK0/d;)V

    .line 79
    invoke-static {v2, v3}, LL0/j;->b(J)J

    move-result-wide v6

    const-wide v9, 0x100000000L

    invoke-static {v6, v7, v9, v10}, LL0/k;->a(JJ)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_16

    .line 80
    invoke-static {v2, v3}, LL0/j;->c(J)F

    move-result v6

    cmpg-float v6, v6, v7

    if-nez v6, :cond_15

    goto :goto_b

    :cond_15
    :goto_a
    move-wide/from16 v28, v2

    goto :goto_c

    .line 81
    :cond_16
    :goto_b
    sget-wide v2, LL0/j;->c:J

    goto :goto_a

    .line 82
    :goto_c
    sget-wide v2, Le0/q;->h:J

    .line 83
    iget-wide v9, v1, Lz0/j;->l:J

    invoke-static {v9, v10, v2, v3}, Le0/q;->b(JJ)Z

    move-result v2

    if-eqz v2, :cond_17

    .line 84
    sget-wide v9, Le0/q;->i:J

    :cond_17
    move-wide/from16 v33, v9

    .line 85
    iget-object v1, v1, Lz0/j;->i:LK0/a;

    if-nez v1, :cond_18

    move v2, v8

    goto :goto_d

    .line 86
    :cond_18
    iget v2, v1, LK0/a;->a:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    .line 87
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    :goto_d
    if-eqz v2, :cond_19

    move-object/from16 v30, v5

    goto :goto_e

    :cond_19
    move-object/from16 v30, v1

    .line 88
    :goto_e
    new-instance v18, Lz0/j;

    const/16 v32, 0x0

    const/16 v37, 0x367f

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v31, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v18 .. v37}, Lz0/j;-><init>(JJLE0/l;LE0/j;LE0/k;LE0/o;Ljava/lang/String;JLK0/a;LK0/h;LG0/c;JLK0/d;Le0/D;I)V

    move-object/from16 v1, v18

    .line 89
    iget-object v2, v0, LH0/c;->a:Ljava/lang/String;

    .line 90
    iget-object v3, v0, LH0/c;->g:LH0/d;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    move-result v3

    .line 91
    iget-object v6, v0, LH0/c;->b:Lz0/p;

    .line 92
    new-instance v9, Lz0/a;

    .line 93
    iget-object v10, v0, LH0/c;->a:Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    .line 94
    invoke-direct {v9, v1, v8, v10}, Lz0/a;-><init>(Ljava/lang/Object;II)V

    .line 95
    invoke-static {v9}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    .line 96
    iget-object v9, v0, LH0/c;->c:Ljava/util/List;

    check-cast v9, Ljava/lang/Iterable;

    .line 97
    invoke-static {v9, v1}, Lff/o;->E0(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    .line 98
    iget-object v9, v0, LH0/c;->d:Ljava/util/ArrayList;

    .line 99
    iget-object v10, v0, LH0/c;->f:LL0/b;

    .line 100
    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v11

    iget-object v12, v6, Lz0/p;->b:Lz0/h;

    if-eqz v11, :cond_1a

    .line 102
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_1a

    .line 103
    iget-object v11, v12, Lz0/h;->d:LK0/i;

    .line 104
    sget-object v13, LK0/i;->c:LK0/i;

    .line 105
    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1a

    .line 106
    iget-wide v13, v12, Lz0/h;->c:J

    invoke-static {v13, v14}, LFe/b;->H(J)Z

    move-result v11

    if-eqz v11, :cond_1a

    goto/16 :goto_2a

    .line 107
    :cond_1a
    new-instance v11, Landroid/text/SpannableString;

    invoke-direct {v11, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 108
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    iget-wide v13, v12, Lz0/h;->c:J

    move-object/from16 p2, v5

    move-object v2, v6

    .line 110
    invoke-static {v13, v14}, LL0/j;->b(J)J

    move-result-wide v5

    const-wide v7, 0x100000000L

    .line 111
    invoke-static {v5, v6, v7, v8}, LL0/k;->a(JJ)Z

    move-result v18

    if-eqz v18, :cond_1b

    invoke-interface {v10, v13, v14}, LL0/b;->l(J)F

    move-result v5

    goto :goto_f

    :cond_1b
    const-wide v7, 0x200000000L

    .line 112
    invoke-static {v5, v6, v7, v8}, LL0/k;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_1c

    invoke-static {v13, v14}, LL0/j;->c(J)F

    move-result v5

    mul-float/2addr v5, v3

    goto :goto_f

    :cond_1c
    const/high16 v5, 0x7fc00000    # Float.NaN

    .line 113
    :goto_f
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_1d

    .line 114
    new-instance v6, LC0/e;

    invoke-direct {v6, v5}, LC0/e;-><init>(F)V

    .line 115
    invoke-virtual {v11}, Landroid/text/SpannableString;->length()I

    move-result v5

    const/4 v15, 0x0

    .line 116
    invoke-static {v11, v6, v15, v5}, Lxg/g;->S(Landroid/text/Spannable;Ljava/lang/Object;II)V

    goto :goto_10

    :cond_1d
    const/4 v15, 0x0

    .line 117
    :goto_10
    iget-object v5, v12, Lz0/h;->d:LK0/i;

    if-eqz v5, :cond_1e

    .line 118
    invoke-static {v15}, LFe/b;->E(I)J

    move-result-wide v6

    iget-wide v12, v5, LK0/i;->a:J

    invoke-static {v12, v13, v6, v7}, LL0/j;->a(JJ)Z

    move-result v6

    iget-wide v7, v5, LK0/i;->b:J

    if-eqz v6, :cond_1f

    invoke-static {v15}, LFe/b;->E(I)J

    move-result-wide v5

    invoke-static {v7, v8, v5, v6}, LL0/j;->a(JJ)Z

    move-result v5

    if-nez v5, :cond_1e

    goto :goto_12

    :cond_1e
    :goto_11
    move-object/from16 p5, v2

    goto/16 :goto_15

    .line 119
    :cond_1f
    :goto_12
    invoke-static {v12, v13}, LFe/b;->H(J)Z

    move-result v5

    if-nez v5, :cond_1e

    invoke-static {v7, v8}, LFe/b;->H(J)Z

    move-result v5

    if-eqz v5, :cond_20

    goto :goto_11

    .line 120
    :cond_20
    invoke-static {v12, v13}, LL0/j;->b(J)J

    move-result-wide v5

    move-object/from16 p5, v2

    move/from16 p4, v3

    const-wide v2, 0x100000000L

    .line 121
    invoke-static {v5, v6, v2, v3}, LL0/k;->a(JJ)Z

    move-result v14

    if-eqz v14, :cond_21

    invoke-interface {v10, v12, v13}, LL0/b;->l(J)F

    move-result v5

    const-wide v2, 0x200000000L

    goto :goto_13

    :cond_21
    const-wide v2, 0x200000000L

    .line 122
    invoke-static {v5, v6, v2, v3}, LL0/k;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_22

    invoke-static {v12, v13}, LL0/j;->c(J)F

    move-result v5

    mul-float v5, v5, p4

    goto :goto_13

    :cond_22
    const/4 v5, 0x0

    .line 123
    :goto_13
    invoke-static {v7, v8}, LL0/j;->b(J)J

    move-result-wide v12

    const-wide v2, 0x100000000L

    .line 124
    invoke-static {v12, v13, v2, v3}, LL0/k;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_23

    invoke-interface {v10, v7, v8}, LL0/b;->l(J)F

    move-result v7

    goto :goto_14

    :cond_23
    const-wide v2, 0x200000000L

    .line 125
    invoke-static {v12, v13, v2, v3}, LL0/k;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_24

    invoke-static {v7, v8}, LL0/j;->c(J)F

    move-result v2

    mul-float v7, v2, p4

    goto :goto_14

    :cond_24
    const/4 v7, 0x0

    .line 126
    :goto_14
    new-instance v2, Landroid/text/style/LeadingMarginSpan$Standard;

    float-to-double v5, v5

    .line 127
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-float v3, v5

    float-to-int v3, v3

    float-to-double v5, v7

    .line 128
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-float v5, v5

    float-to-int v5, v5

    .line 129
    invoke-direct {v2, v3, v5}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    .line 130
    invoke-virtual {v11}, Landroid/text/SpannableString;->length()I

    move-result v3

    const/4 v15, 0x0

    .line 131
    invoke-static {v11, v2, v15, v3}, Lxg/g;->S(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 132
    :goto_15
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 133
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v5, 0x0

    :goto_16
    if-ge v5, v3, :cond_27

    .line 134
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 135
    move-object v7, v6

    check-cast v7, Lz0/a;

    .line 136
    iget-object v8, v7, Lz0/a;->a:Ljava/lang/Object;

    .line 137
    check-cast v8, Lz0/j;

    invoke-static {v8}, LA6/c;->B(Lz0/j;)Z

    move-result v8

    if-nez v8, :cond_25

    iget-object v7, v7, Lz0/a;->a:Ljava/lang/Object;

    check-cast v7, Lz0/j;

    .line 138
    iget-object v7, v7, Lz0/j;->e:LE0/k;

    if-eqz v7, :cond_26

    .line 139
    :cond_25
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_26
    add-int/lit8 v5, v5, 0x1

    goto :goto_16

    :cond_27
    move-object/from16 v5, p5

    .line 140
    iget-object v3, v5, Lz0/p;->a:Lz0/j;

    invoke-static {v3}, LA6/c;->B(Lz0/j;)Z

    move-result v5

    if-nez v5, :cond_29

    iget-object v5, v3, Lz0/j;->e:LE0/k;

    if-eqz v5, :cond_28

    goto :goto_17

    :cond_28
    move-object/from16 v3, p2

    goto :goto_18

    .line 141
    :cond_29
    :goto_17
    new-instance v18, Lz0/j;

    const-wide/16 v33, 0x0

    const/16 v37, 0x3fc3

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    iget-object v5, v3, Lz0/j;->c:LE0/l;

    iget-object v6, v3, Lz0/j;->d:LE0/j;

    iget-object v7, v3, Lz0/j;->e:LE0/k;

    iget-object v3, v3, Lz0/j;->f:LE0/o;

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    move-object/from16 v26, v3

    move-object/from16 v23, v5

    move-object/from16 v24, v6

    move-object/from16 v25, v7

    invoke-direct/range {v18 .. v37}, Lz0/j;-><init>(JJLE0/l;LE0/j;LE0/k;LE0/o;Ljava/lang/String;JLK0/a;LK0/h;LG0/c;JLK0/d;Le0/D;I)V

    move-object/from16 v3, v18

    .line 142
    :goto_18
    new-instance v5, LB/T;

    move/from16 v6, v16

    invoke-direct {v5, v6, v11, v4}, LB/T;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 143
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-gt v4, v6, :cond_2b

    .line 144
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_34

    const/4 v15, 0x0

    .line 145
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lz0/a;

    .line 146
    iget-object v4, v4, Lz0/a;->a:Ljava/lang/Object;

    .line 147
    check-cast v4, Lz0/j;

    if-nez v3, :cond_2a

    goto :goto_19

    .line 148
    :cond_2a
    invoke-virtual {v3, v4}, Lz0/j;->b(Lz0/j;)Lz0/j;

    move-result-object v4

    .line 149
    :goto_19
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz0/a;

    .line 150
    iget v3, v3, Lz0/a;->b:I

    .line 151
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 152
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz0/a;

    .line 153
    iget v2, v2, Lz0/a;->c:I

    .line 154
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 155
    invoke-virtual {v5, v4, v3, v2}, LB/T;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_21

    .line 156
    :cond_2b
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    mul-int/lit8 v6, v4, 0x2

    .line 157
    new-array v7, v6, [Ljava/lang/Integer;

    const/4 v8, 0x0

    :goto_1a
    if-ge v8, v6, :cond_2c

    const/4 v15, 0x0

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v7, v8

    const/16 v16, 0x1

    add-int/lit8 v8, v8, 0x1

    goto :goto_1a

    .line 158
    :cond_2c
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v12, 0x0

    :goto_1b
    if-ge v12, v8, :cond_2d

    .line 159
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 160
    check-cast v13, Lz0/a;

    .line 161
    iget v14, v13, Lz0/a;->b:I

    .line 162
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v7, v12

    add-int v14, v12, v4

    .line 163
    iget v13, v13, Lz0/a;->c:I

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v7, v14

    const/4 v13, 0x1

    add-int/2addr v12, v13

    goto :goto_1b

    :cond_2d
    const/4 v13, 0x1

    .line 164
    move-object v4, v7

    check-cast v4, [Ljava/lang/Comparable;

    .line 165
    array-length v8, v4

    if-le v8, v13, :cond_2e

    invoke-static {v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 166
    :cond_2e
    invoke-static {v7}, Lff/m;->u0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    const/4 v8, 0x0

    :goto_1c
    if-ge v8, v6, :cond_34

    .line 167
    aget-object v12, v7, v8

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v13

    if-ne v13, v4, :cond_2f

    move-object/from16 p5, v2

    move-object/from16 p4, v3

    move/from16 p6, v6

    move-object/from16 v18, v7

    const/16 v16, 0x1

    goto :goto_20

    .line 168
    :cond_2f
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v14

    move-object/from16 p4, v3

    const/4 v15, 0x0

    :goto_1d
    if-ge v15, v14, :cond_32

    .line 169
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 p5, v2

    .line 170
    move-object/from16 v2, v18

    check-cast v2, Lz0/a;

    move/from16 p6, v6

    .line 171
    iget v6, v2, Lz0/a;->b:I

    move-object/from16 v18, v7

    .line 172
    iget v7, v2, Lz0/a;->c:I

    if-eq v6, v7, :cond_31

    .line 173
    invoke-static {v4, v13, v6, v7}, Lz0/c;->b(IIII)Z

    move-result v6

    if-eqz v6, :cond_31

    .line 174
    iget-object v2, v2, Lz0/a;->a:Ljava/lang/Object;

    check-cast v2, Lz0/j;

    if-nez v3, :cond_30

    :goto_1e
    move-object v3, v2

    goto :goto_1f

    .line 175
    :cond_30
    invoke-virtual {v3, v2}, Lz0/j;->b(Lz0/j;)Lz0/j;

    move-result-object v2

    goto :goto_1e

    :cond_31
    :goto_1f
    const/16 v16, 0x1

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v2, p5

    move/from16 v6, p6

    move-object/from16 v7, v18

    goto :goto_1d

    :cond_32
    move-object/from16 p5, v2

    move/from16 p6, v6

    move-object/from16 v18, v7

    const/16 v16, 0x1

    if-eqz v3, :cond_33

    .line 176
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5, v3, v2, v12}, LB/T;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_33
    move v4, v13

    :goto_20
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v3, p4

    move-object/from16 v2, p5

    move/from16 v6, p6

    move-object/from16 v7, v18

    goto :goto_1c

    .line 177
    :cond_34
    :goto_21
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 178
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_22
    if-ge v4, v3, :cond_42

    .line 179
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lz0/a;

    .line 180
    iget v6, v5, Lz0/a;->b:I

    if-ltz v6, :cond_35

    .line 181
    invoke-virtual {v11}, Landroid/text/SpannableString;->length()I

    move-result v7

    if-ge v6, v7, :cond_35

    iget v7, v5, Lz0/a;->c:I

    if-le v7, v6, :cond_35

    invoke-virtual {v11}, Landroid/text/SpannableString;->length()I

    move-result v6

    if-le v7, v6, :cond_37

    :cond_35
    move/from16 p3, v3

    move/from16 p5, v4

    move-object v7, v10

    move-object v5, v11

    const-wide v13, 0x200000000L

    :cond_36
    :goto_23
    const/16 v16, 0x1

    goto/16 :goto_28

    .line 182
    :cond_37
    iget-object v6, v5, Lz0/a;->a:Ljava/lang/Object;

    check-cast v6, Lz0/j;

    .line 183
    iget-object v7, v6, Lz0/j;->i:LK0/a;

    .line 184
    iget v8, v5, Lz0/a;->b:I

    iget v5, v5, Lz0/a;->c:I

    if-eqz v7, :cond_38

    .line 185
    new-instance v12, LC0/a;

    iget v7, v7, LK0/a;->a:F

    const/4 v15, 0x0

    invoke-direct {v12, v7, v15}, LC0/a;-><init>(FI)V

    invoke-static {v11, v12, v8, v5}, Lxg/g;->S(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 186
    :cond_38
    iget-object v7, v6, Lz0/j;->a:LK0/g;

    invoke-interface {v7}, LK0/g;->a()J

    move-result-wide v12

    .line 187
    invoke-static {v11, v12, v13, v8, v5}, Lxg/g;->P(Landroid/text/SpannableString;JII)V

    .line 188
    iget-object v7, v6, Lz0/j;->m:LK0/d;

    if-eqz v7, :cond_3b

    .line 189
    new-instance v12, LC0/i;

    .line 190
    iget v7, v7, LK0/d;->a:I

    const/16 v16, 0x1

    or-int/lit8 v13, v7, 0x1

    if-ne v13, v7, :cond_39

    const/4 v13, 0x1

    goto :goto_24

    :cond_39
    const/4 v13, 0x0

    :goto_24
    or-int/lit8 v14, v7, 0x2

    if-ne v14, v7, :cond_3a

    const/4 v7, 0x1

    goto :goto_25

    :cond_3a
    const/4 v7, 0x0

    .line 191
    :goto_25
    invoke-direct {v12, v13, v7}, LC0/i;-><init>(ZZ)V

    .line 192
    invoke-static {v11, v12, v8, v5}, Lxg/g;->S(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 193
    :cond_3b
    iget-wide v12, v6, Lz0/j;->b:J

    move/from16 v23, v5

    move/from16 v22, v8

    move-object/from16 v21, v10

    move-object/from16 v18, v11

    move-wide/from16 v19, v12

    invoke-static/range {v18 .. v23}, Lxg/g;->Q(Landroid/text/SpannableString;JLL0/b;II)V

    move-object/from16 v5, v18

    move-object/from16 v7, v21

    move/from16 v10, v23

    .line 194
    iget-object v11, v6, Lz0/j;->g:Ljava/lang/String;

    if-eqz v11, :cond_3c

    .line 195
    new-instance v12, LC0/b;

    invoke-direct {v12, v11}, LC0/b;-><init>(Ljava/lang/String;)V

    invoke-static {v5, v12, v8, v10}, Lxg/g;->S(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 196
    :cond_3c
    iget-object v11, v6, Lz0/j;->j:LK0/h;

    if-eqz v11, :cond_3d

    .line 197
    new-instance v12, Landroid/text/style/ScaleXSpan;

    iget v13, v11, LK0/h;->a:F

    invoke-direct {v12, v13}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    invoke-static {v5, v12, v8, v10}, Lxg/g;->S(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 198
    new-instance v12, LC0/a;

    iget v11, v11, LK0/h;->b:F

    const/4 v13, 0x1

    invoke-direct {v12, v11, v13}, LC0/a;-><init>(FI)V

    invoke-static {v5, v12, v8, v10}, Lxg/g;->S(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 199
    :cond_3d
    iget-object v11, v6, Lz0/j;->k:LG0/c;

    invoke-static {v5, v11, v8, v10}, Lxg/g;->R(Landroid/text/SpannableString;LG0/c;II)V

    .line 200
    sget-wide v11, Le0/q;->i:J

    .line 201
    iget-wide v13, v6, Lz0/j;->l:J

    cmp-long v11, v13, v11

    if-eqz v11, :cond_3e

    .line 202
    new-instance v11, Landroid/text/style/BackgroundColorSpan;

    invoke-static {v13, v14}, Le0/z;->s(J)I

    move-result v12

    invoke-direct {v11, v12}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 203
    invoke-static {v5, v11, v8, v10}, Lxg/g;->S(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 204
    :cond_3e
    iget-object v11, v6, Lz0/j;->n:Le0/D;

    if-eqz v11, :cond_3f

    .line 205
    new-instance v12, LC0/h;

    iget-wide v13, v11, Le0/D;->a:J

    invoke-static {v13, v14}, Le0/z;->s(J)I

    move-result v13

    move/from16 p3, v3

    move v14, v4

    iget-wide v3, v11, Le0/D;->b:J

    invoke-static {v3, v4}, Ld0/c;->b(J)F

    move-result v15

    invoke-static {v3, v4}, Ld0/c;->c(J)F

    move-result v3

    iget v4, v11, Le0/D;->c:F

    invoke-direct {v12, v13, v15, v3, v4}, LC0/h;-><init>(IFFF)V

    .line 206
    invoke-static {v5, v12, v8, v10}, Lxg/g;->S(Landroid/text/Spannable;Ljava/lang/Object;II)V

    goto :goto_26

    :cond_3f
    move/from16 p3, v3

    move v14, v4

    .line 207
    :goto_26
    iget-wide v3, v6, Lz0/j;->h:J

    invoke-static {v3, v4}, LL0/j;->b(J)J

    move-result-wide v11

    move/from16 p5, v14

    const-wide v13, 0x100000000L

    .line 208
    invoke-static {v11, v12, v13, v14}, LL0/k;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_40

    .line 209
    new-instance v6, LC0/d;

    invoke-interface {v7, v3, v4}, LL0/b;->l(J)F

    move-result v3

    invoke-direct {v6, v3}, LC0/d;-><init>(F)V

    const-wide v13, 0x200000000L

    goto :goto_27

    :cond_40
    const-wide v13, 0x200000000L

    .line 210
    invoke-static {v11, v12, v13, v14}, LL0/k;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_41

    .line 211
    new-instance v6, LC0/c;

    invoke-static {v3, v4}, LL0/j;->c(J)F

    move-result v3

    invoke-direct {v6, v3}, LC0/c;-><init>(F)V

    goto :goto_27

    :cond_41
    move-object/from16 v6, p2

    :goto_27
    if-eqz v6, :cond_36

    .line 212
    new-instance v3, LI0/b;

    invoke-direct {v3, v6, v8, v10}, LI0/b;-><init>(Landroid/text/style/MetricAffectingSpan;II)V

    .line 213
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_23

    :goto_28
    add-int/lit8 v4, p5, 0x1

    move/from16 v3, p3

    move-object v11, v5

    move-object v10, v7

    goto/16 :goto_22

    :cond_42
    move-object v5, v11

    .line 214
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v15, 0x0

    :goto_29
    if-ge v15, v1, :cond_43

    .line 215
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 216
    check-cast v3, LI0/b;

    .line 217
    iget-object v4, v3, LI0/b;->a:Landroid/text/style/MetricAffectingSpan;

    .line 218
    iget v6, v3, LI0/b;->b:I

    iget v3, v3, LI0/b;->c:I

    invoke-static {v5, v4, v6, v3}, Lxg/g;->S(Landroid/text/Spannable;Ljava/lang/Object;II)V

    const/16 v16, 0x1

    add-int/lit8 v15, v15, 0x1

    goto :goto_29

    .line 219
    :cond_43
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gtz v1, :cond_44

    move-object v2, v5

    .line 220
    :goto_2a
    iput-object v2, v0, LH0/c;->h:Ljava/lang/CharSequence;

    .line 221
    new-instance v1, LDd/c;

    iget-object v3, v0, LH0/c;->g:LH0/d;

    iget v4, v0, LH0/c;->k:I

    invoke-direct {v1, v4, v3, v2}, LDd/c;-><init>(ILandroid/text/TextPaint;Ljava/lang/CharSequence;)V

    iput-object v1, v0, LH0/c;->i:LDd/c;

    return-void

    :cond_44
    const/4 v15, 0x0

    .line 222
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 223
    check-cast v1, Lz0/a;

    .line 224
    iget-object v1, v1, Lz0/a;->a:Ljava/lang/Object;

    if-nez v1, :cond_45

    .line 225
    new-instance v1, LC0/g;

    .line 226
    throw p2

    .line 227
    :cond_45
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    .line 228
    :cond_46
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 229
    const-string v2, "Invalid TextDirection."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final a()F
    .locals 1

    .line 1
    iget-object v0, p0, LH0/c;->i:LDd/c;

    .line 2
    .line 3
    iget-object v0, v0, LDd/c;->d:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0}, Lef/i;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, LH0/c;->i:LDd/c;

    .line 2
    .line 3
    iget-object v0, v0, LDd/c;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0}, Lef/i;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method
