.class public abstract LFe/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:I = 0x5


# direct methods
.method public static final A(Lkotlin/reflect/KClass;)Ljava/lang/Class;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p0, Lkotlin/jvm/internal/d;

    .line 7
    .line 8
    invoke-interface {p0}, Lkotlin/jvm/internal/d;->getJClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    sparse-switch v0, :sswitch_data_0

    .line 28
    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :sswitch_0
    const-string v0, "java.lang.Double"

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    sget-object p0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    return-object p0

    .line 44
    :sswitch_1
    const-string v0, "java.lang.Void"

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    sget-object p0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    return-object p0

    .line 56
    :sswitch_2
    const-string v0, "java.lang.Long"

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-nez p0, :cond_3

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    sget-object p0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 66
    .line 67
    return-object p0

    .line 68
    :sswitch_3
    const-string v0, "java.lang.Byte"

    .line 69
    .line 70
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-nez p0, :cond_4

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    sget-object p0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 78
    .line 79
    return-object p0

    .line 80
    :sswitch_4
    const-string v0, "java.lang.Boolean"

    .line 81
    .line 82
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-nez p0, :cond_5

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    sget-object p0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 90
    .line 91
    return-object p0

    .line 92
    :sswitch_5
    const-string v0, "java.lang.Character"

    .line 93
    .line 94
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-nez p0, :cond_6

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_6
    sget-object p0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 102
    .line 103
    return-object p0

    .line 104
    :sswitch_6
    const-string v0, "java.lang.Short"

    .line 105
    .line 106
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-nez p0, :cond_7

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_7
    sget-object p0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 114
    .line 115
    return-object p0

    .line 116
    :sswitch_7
    const-string v0, "java.lang.Float"

    .line 117
    .line 118
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-nez p0, :cond_8

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_8
    sget-object p0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 126
    .line 127
    return-object p0

    .line 128
    :sswitch_8
    const-string v0, "java.lang.Integer"

    .line 129
    .line 130
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    if-nez p0, :cond_9

    .line 135
    .line 136
    :goto_0
    const/4 p0, 0x0

    .line 137
    return-object p0

    .line 138
    :cond_9
    sget-object p0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 139
    .line 140
    return-object p0

    .line 141
    :sswitch_data_0
    .sparse-switch
        -0x7a988a96 -> :sswitch_8
        -0x1f76ce78 -> :sswitch_7
        -0x1ec16c58 -> :sswitch_6
        0x9415455 -> :sswitch_5
        0x148d6054 -> :sswitch_4
        0x17c0bc5c -> :sswitch_3
        0x17c521d0 -> :sswitch_2
        0x17c9ace8 -> :sswitch_1
        0x2d605225 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final B(Ljava/lang/Class;)Lkotlin/reflect/KClass;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static final C(LPf/i;)J
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, LPf/i;->getBuffer()LPf/a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget-wide v0, p0, LPf/a;->c:J

    .line 11
    .line 12
    return-wide v0
.end method

.method public static final D(D)J
    .locals 2

    .line 1
    const-wide v0, 0x100000000L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    double-to-float p0, p0

    .line 7
    invoke-static {v0, v1, p0}, LFe/b;->M(JF)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method public static final E(I)J
    .locals 2

    .line 1
    const-wide v0, 0x100000000L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    int-to-float p0, p0

    .line 7
    invoke-static {v0, v1, p0}, LFe/b;->M(JF)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method public static F()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x2

    .line 11
    aget-object v2, v0, v1

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    aget-object v3, v0, v1

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    aget-object v0, v0, v1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/16 v1, 0x2e

    .line 30
    .line 31
    invoke-virtual {v3, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    invoke-virtual {v3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v3, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, ": "

    .line 50
    .line 51
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, "() ["

    .line 58
    .line 59
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v0, "] - "

    .line 66
    .line 67
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    return-object v0
.end method

.method public static G(Lp9/k;)Z
    .locals 4

    .line 1
    instance-of v0, p0, Lp9/j;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    instance-of v0, p0, Lp9/d;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    move-object v1, p0

    .line 10
    check-cast v1, Lp9/d;

    .line 11
    .line 12
    iget-object v2, v1, Lp9/d;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lp9/k;

    .line 29
    .line 30
    instance-of v3, v3, Lp9/d;

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v1}, Lp9/d;->e()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_2
    :goto_0
    if-eqz v0, :cond_6

    .line 43
    .line 44
    check-cast p0, Lp9/d;

    .line 45
    .line 46
    iget v0, p0, Lp9/d;->b:I

    .line 47
    .line 48
    const/4 v1, 0x2

    .line 49
    if-ne v0, v1, :cond_6

    .line 50
    .line 51
    iget-object p0, p0, Lp9/d;->a:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-static {p0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_7

    .line 66
    .line 67
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Lp9/k;

    .line 72
    .line 73
    instance-of v1, v0, Lp9/j;

    .line 74
    .line 75
    if-nez v1, :cond_3

    .line 76
    .line 77
    instance-of v1, v0, Lp9/d;

    .line 78
    .line 79
    if-eqz v1, :cond_6

    .line 80
    .line 81
    check-cast v0, Lp9/d;

    .line 82
    .line 83
    iget-object v1, v0, Lp9/d;->a:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_5

    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Lp9/k;

    .line 100
    .line 101
    instance-of v2, v2, Lp9/d;

    .line 102
    .line 103
    if-eqz v2, :cond_4

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    invoke-virtual {v0}, Lp9/d;->e()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_6

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_6
    :goto_2
    const/4 p0, 0x0

    .line 114
    return p0

    .line 115
    :cond_7
    :goto_3
    const/4 p0, 0x1

    .line 116
    return p0
.end method

.method public static final H(J)Z
    .locals 2

    .line 1
    sget-object v0, LL0/j;->b:[LL0/k;

    .line 2
    .line 3
    const-wide v0, 0xff00000000L

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    and-long/2addr p0, v0

    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    cmp-long p0, p0, v0

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public static I(Landroid/view/View;IIII)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    int-to-float v1, v1

    .line 11
    const-string v2, "\tdesired (w,h)"

    .line 12
    .line 13
    invoke-static {v2, v0, v1}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/16 v1, 0x8

    .line 21
    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    move p2, p1

    .line 26
    :cond_0
    invoke-static {p1, p3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-static {p2, p4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    int-to-float p1, p1

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    int-to-float p0, p0

    .line 47
    const-string p2, "\tactual (w,h)"

    .line 48
    .line 49
    invoke-static {p2, p1, p0}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static J(Landroid/view/View;II)V
    .locals 1

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    invoke-static {p0, p1, p2, v0, v0}, LFe/b;->I(Landroid/view/View;IIII)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final M(JF)J
    .locals 4

    .line 1
    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    int-to-long v0, p2

    .line 6
    const-wide v2, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr v0, v2

    .line 12
    or-long/2addr p0, v0

    .line 13
    sget-object p2, LL0/j;->b:[LL0/k;

    .line 14
    .line 15
    return-wide p0
.end method

.method public static N(Ljava/lang/String;)J
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_29

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x1

    .line 15
    const/16 v4, 0x2d

    .line 16
    .line 17
    const/16 v5, 0x2b

    .line 18
    .line 19
    if-eq v2, v5, :cond_1

    .line 20
    .line 21
    if-eq v2, v4, :cond_0

    .line 22
    .line 23
    move v2, v1

    .line 24
    :goto_0
    move v6, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    move v2, v3

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v6, v1

    .line 29
    move v2, v3

    .line 30
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-le v7, v2, :cond_28

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    const/16 v8, 0x50

    .line 41
    .line 42
    const-string v9, ""

    .line 43
    .line 44
    if-ne v7, v8, :cond_27

    .line 45
    .line 46
    add-int/2addr v2, v3

    .line 47
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eq v2, v7, :cond_26

    .line 52
    .line 53
    move v15, v1

    .line 54
    move/from16 v16, v3

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    const-wide/16 v11, 0x0

    .line 58
    .line 59
    const-wide/16 v13, 0x0

    .line 60
    .line 61
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-ge v2, v3, :cond_23

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    const/16 v7, 0x54

    .line 72
    .line 73
    if-ne v3, v7, :cond_3

    .line 74
    .line 75
    if-nez v15, :cond_2

    .line 76
    .line 77
    add-int/lit8 v2, v2, 0x1

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eq v2, v3, :cond_2

    .line 84
    .line 85
    move/from16 v15, v16

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 89
    .line 90
    invoke-direct {v0, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v0

    .line 94
    :cond_3
    sget-object v7, LCf/d;->e:LCf/d;

    .line 95
    .line 96
    iget-boolean v8, v7, LCf/d;->b:Z

    .line 97
    .line 98
    if-eqz v8, :cond_6

    .line 99
    .line 100
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-eq v8, v5, :cond_5

    .line 105
    .line 106
    if-eq v8, v4, :cond_4

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_4
    add-int/lit8 v8, v2, 0x1

    .line 110
    .line 111
    const/16 v17, -0x1

    .line 112
    .line 113
    move/from16 v10, v17

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_5
    add-int/lit8 v8, v2, 0x1

    .line 117
    .line 118
    :goto_3
    move/from16 v10, v16

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_6
    :goto_4
    move v8, v2

    .line 122
    goto :goto_3

    .line 123
    :goto_5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    const/16 v5, 0x30

    .line 128
    .line 129
    if-ge v8, v4, :cond_7

    .line 130
    .line 131
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-ne v4, v5, :cond_7

    .line 136
    .line 137
    add-int/lit8 v8, v8, 0x1

    .line 138
    .line 139
    const/16 v5, 0x2b

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_7
    const-wide/16 v18, 0x0

    .line 143
    .line 144
    :goto_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    const/16 v5, 0x3a

    .line 149
    .line 150
    if-ge v8, v4, :cond_d

    .line 151
    .line 152
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    move/from16 v20, v2

    .line 157
    .line 158
    const/16 v2, 0x30

    .line 159
    .line 160
    if-gt v2, v4, :cond_e

    .line 161
    .line 162
    if-ge v4, v5, :cond_e

    .line 163
    .line 164
    add-int/lit8 v4, v4, -0x30

    .line 165
    .line 166
    move v2, v6

    .line 167
    iget-wide v5, v7, LCf/d;->c:J

    .line 168
    .line 169
    cmp-long v5, v18, v5

    .line 170
    .line 171
    if-gtz v5, :cond_9

    .line 172
    .line 173
    if-nez v5, :cond_8

    .line 174
    .line 175
    int-to-long v5, v4

    .line 176
    move-wide/from16 v21, v5

    .line 177
    .line 178
    iget-wide v5, v7, LCf/d;->d:J

    .line 179
    .line 180
    cmp-long v5, v21, v5

    .line 181
    .line 182
    if-lez v5, :cond_8

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_8
    const/4 v5, 0x3

    .line 186
    shl-long v5, v18, v5

    .line 187
    .line 188
    shl-long v18, v18, v16

    .line 189
    .line 190
    add-long v5, v5, v18

    .line 191
    .line 192
    move-wide/from16 v18, v5

    .line 193
    .line 194
    int-to-long v4, v4

    .line 195
    add-long v18, v18, v4

    .line 196
    .line 197
    add-int/lit8 v8, v8, 0x1

    .line 198
    .line 199
    move v6, v2

    .line 200
    move/from16 v2, v20

    .line 201
    .line 202
    const/16 v5, 0x30

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_9
    :goto_7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-ge v8, v4, :cond_a

    .line 210
    .line 211
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    const/16 v5, 0x30

    .line 216
    .line 217
    if-gt v5, v4, :cond_a

    .line 218
    .line 219
    const/16 v5, 0x3a

    .line 220
    .line 221
    if-ge v4, v5, :cond_a

    .line 222
    .line 223
    add-int/lit8 v8, v8, 0x1

    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_a
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    if-eq v8, v4, :cond_c

    .line 231
    .line 232
    const/16 v4, 0x2b

    .line 233
    .line 234
    if-eq v3, v4, :cond_b

    .line 235
    .line 236
    const/16 v4, 0x2d

    .line 237
    .line 238
    if-eq v3, v4, :cond_b

    .line 239
    .line 240
    const/4 v3, 0x0

    .line 241
    goto :goto_8

    .line 242
    :cond_b
    move/from16 v3, v16

    .line 243
    .line 244
    :goto_8
    add-int v3, v20, v3

    .line 245
    .line 246
    if-eq v8, v3, :cond_c

    .line 247
    .line 248
    iget-wide v3, v7, LCf/d;->a:J

    .line 249
    .line 250
    move-wide v6, v3

    .line 251
    const/16 v4, 0x2b

    .line 252
    .line 253
    const/16 v5, 0x2d

    .line 254
    .line 255
    goto :goto_a

    .line 256
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 257
    .line 258
    invoke-direct {v0, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v0

    .line 262
    :cond_d
    move/from16 v20, v2

    .line 263
    .line 264
    :cond_e
    move v2, v6

    .line 265
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    if-eq v8, v4, :cond_22

    .line 270
    .line 271
    const/16 v4, 0x2b

    .line 272
    .line 273
    const/16 v5, 0x2d

    .line 274
    .line 275
    if-eq v3, v4, :cond_f

    .line 276
    .line 277
    if-eq v3, v5, :cond_f

    .line 278
    .line 279
    const/4 v3, 0x0

    .line 280
    goto :goto_9

    .line 281
    :cond_f
    move/from16 v3, v16

    .line 282
    .line 283
    :goto_9
    add-int v3, v20, v3

    .line 284
    .line 285
    if-eq v8, v3, :cond_22

    .line 286
    .line 287
    move-wide/from16 v6, v18

    .line 288
    .line 289
    :goto_a
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    const/16 v4, 0x2e

    .line 294
    .line 295
    if-ne v3, v4, :cond_16

    .line 296
    .line 297
    add-int/lit8 v3, v8, 0x1

    .line 298
    .line 299
    add-int/lit8 v8, v8, 0x7

    .line 300
    .line 301
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    invoke-static {v8, v4}, Ljava/lang/Math;->min(II)I

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    move v8, v3

    .line 310
    const/4 v13, 0x0

    .line 311
    :goto_b
    if-ge v8, v4, :cond_10

    .line 312
    .line 313
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 314
    .line 315
    .line 316
    move-result v14

    .line 317
    const/16 v5, 0x30

    .line 318
    .line 319
    if-gt v5, v14, :cond_10

    .line 320
    .line 321
    const/16 v5, 0x3a

    .line 322
    .line 323
    if-ge v14, v5, :cond_10

    .line 324
    .line 325
    shl-int/lit8 v5, v13, 0x3

    .line 326
    .line 327
    shl-int/lit8 v13, v13, 0x1

    .line 328
    .line 329
    add-int/2addr v5, v13

    .line 330
    add-int/lit8 v14, v14, -0x30

    .line 331
    .line 332
    add-int v13, v14, v5

    .line 333
    .line 334
    add-int/lit8 v8, v8, 0x1

    .line 335
    .line 336
    goto :goto_b

    .line 337
    :cond_10
    sub-int v4, v8, v3

    .line 338
    .line 339
    rsub-int/lit8 v4, v4, 0x6

    .line 340
    .line 341
    const/4 v5, 0x0

    .line 342
    :goto_c
    if-ge v5, v4, :cond_11

    .line 343
    .line 344
    shl-int/lit8 v14, v13, 0x3

    .line 345
    .line 346
    shl-int/lit8 v13, v13, 0x1

    .line 347
    .line 348
    add-int/2addr v13, v14

    .line 349
    add-int/lit8 v5, v5, 0x1

    .line 350
    .line 351
    goto :goto_c

    .line 352
    :cond_11
    add-int/lit8 v4, v8, 0x9

    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 355
    .line 356
    .line 357
    move-result v5

    .line 358
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    move v5, v8

    .line 363
    const/4 v14, 0x0

    .line 364
    :goto_d
    move/from16 v19, v2

    .line 365
    .line 366
    if-ge v5, v4, :cond_12

    .line 367
    .line 368
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    move/from16 v20, v4

    .line 373
    .line 374
    const/16 v4, 0x30

    .line 375
    .line 376
    if-gt v4, v2, :cond_12

    .line 377
    .line 378
    const/16 v4, 0x3a

    .line 379
    .line 380
    if-ge v2, v4, :cond_12

    .line 381
    .line 382
    shl-int/lit8 v4, v14, 0x3

    .line 383
    .line 384
    shl-int/lit8 v14, v14, 0x1

    .line 385
    .line 386
    add-int/2addr v4, v14

    .line 387
    add-int/lit8 v2, v2, -0x30

    .line 388
    .line 389
    add-int v14, v2, v4

    .line 390
    .line 391
    add-int/lit8 v5, v5, 0x1

    .line 392
    .line 393
    move/from16 v2, v19

    .line 394
    .line 395
    move/from16 v4, v20

    .line 396
    .line 397
    goto :goto_d

    .line 398
    :cond_12
    sub-int v2, v5, v8

    .line 399
    .line 400
    rsub-int/lit8 v2, v2, 0x9

    .line 401
    .line 402
    const/4 v4, 0x0

    .line 403
    :goto_e
    if-ge v4, v2, :cond_13

    .line 404
    .line 405
    shl-int/lit8 v8, v14, 0x3

    .line 406
    .line 407
    shl-int/lit8 v14, v14, 0x1

    .line 408
    .line 409
    add-int/2addr v14, v8

    .line 410
    add-int/lit8 v4, v4, 0x1

    .line 411
    .line 412
    goto :goto_e

    .line 413
    :cond_13
    move v8, v5

    .line 414
    :goto_f
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    if-ge v8, v2, :cond_14

    .line 419
    .line 420
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    const/16 v5, 0x30

    .line 425
    .line 426
    if-gt v5, v2, :cond_14

    .line 427
    .line 428
    const/16 v4, 0x3a

    .line 429
    .line 430
    if-ge v2, v4, :cond_14

    .line 431
    .line 432
    add-int/lit8 v8, v8, 0x1

    .line 433
    .line 434
    goto :goto_f

    .line 435
    :cond_14
    if-eq v8, v3, :cond_15

    .line 436
    .line 437
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    if-eq v8, v2, :cond_15

    .line 442
    .line 443
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    const/16 v3, 0x53

    .line 448
    .line 449
    if-ne v2, v3, :cond_15

    .line 450
    .line 451
    int-to-long v2, v13

    .line 452
    const v4, 0x3b9aca00

    .line 453
    .line 454
    .line 455
    int-to-long v4, v4

    .line 456
    mul-long/2addr v2, v4

    .line 457
    int-to-long v4, v14

    .line 458
    add-long/2addr v2, v4

    .line 459
    int-to-long v4, v10

    .line 460
    sget-object v13, LCf/c;->d:LCf/c;

    .line 461
    .line 462
    long-to-double v2, v2

    .line 463
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 464
    .line 465
    .line 466
    move-result v14

    .line 467
    packed-switch v14, :pswitch_data_0

    .line 468
    .line 469
    .line 470
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 471
    .line 472
    new-instance v1, Ljava/lang/StringBuilder;

    .line 473
    .line 474
    const-string v2, "Unknown unit: "

    .line 475
    .line 476
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    throw v0

    .line 494
    :pswitch_0
    const-wide v13, 0x3fb61e4f765fd8aeL    # 0.0864

    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    goto :goto_10

    .line 500
    :pswitch_1
    const-wide v13, 0x3f6d7dbf487fcb92L    # 0.0036

    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    goto :goto_10

    .line 506
    :pswitch_2
    const-wide v13, 0x3f0f75104d551d69L    # 6.0E-5

    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    goto :goto_10

    .line 512
    :pswitch_3
    const-wide v13, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    goto :goto_10

    .line 518
    :pswitch_4
    const-wide v13, 0x3e112e0be826d695L    # 1.0E-9

    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    goto :goto_10

    .line 524
    :pswitch_5
    const-wide v13, 0x3d719799812dea11L    # 1.0E-12

    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    goto :goto_10

    .line 530
    :pswitch_6
    const-wide v13, 0x3cd203af9ee75616L    # 1.0E-15

    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    :goto_10
    mul-double/2addr v2, v13

    .line 536
    invoke-static {v2, v3}, Lvf/a;->I(D)J

    .line 537
    .line 538
    .line 539
    move-result-wide v2

    .line 540
    mul-long/2addr v2, v4

    .line 541
    move-wide v13, v2

    .line 542
    goto :goto_11

    .line 543
    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 544
    .line 545
    invoke-direct {v0, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    throw v0

    .line 549
    :cond_16
    move/from16 v19, v2

    .line 550
    .line 551
    :goto_11
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    const/16 v3, 0x44

    .line 556
    .line 557
    if-eq v2, v3, :cond_1a

    .line 558
    .line 559
    const/16 v3, 0x48

    .line 560
    .line 561
    if-eq v2, v3, :cond_19

    .line 562
    .line 563
    const/16 v3, 0x4d

    .line 564
    .line 565
    if-eq v2, v3, :cond_18

    .line 566
    .line 567
    const/16 v3, 0x53

    .line 568
    .line 569
    if-eq v2, v3, :cond_17

    .line 570
    .line 571
    const/4 v2, 0x0

    .line 572
    goto :goto_12

    .line 573
    :cond_17
    sget-object v2, LCf/c;->d:LCf/c;

    .line 574
    .line 575
    goto :goto_12

    .line 576
    :cond_18
    sget-object v2, LCf/c;->e:LCf/c;

    .line 577
    .line 578
    goto :goto_12

    .line 579
    :cond_19
    sget-object v2, LCf/c;->f:LCf/c;

    .line 580
    .line 581
    goto :goto_12

    .line 582
    :cond_1a
    sget-object v2, LCf/c;->g:LCf/c;

    .line 583
    .line 584
    :goto_12
    if-eqz v2, :cond_21

    .line 585
    .line 586
    if-eqz v1, :cond_1c

    .line 587
    .line 588
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 589
    .line 590
    .line 591
    move-result v1

    .line 592
    if-lez v1, :cond_1b

    .line 593
    .line 594
    goto :goto_13

    .line 595
    :cond_1b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 596
    .line 597
    const-string v1, "Unexpected order of duration components"

    .line 598
    .line 599
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    throw v0

    .line 603
    :cond_1c
    :goto_13
    sget-object v1, LCf/c;->g:LCf/c;

    .line 604
    .line 605
    if-ne v2, v1, :cond_1e

    .line 606
    .line 607
    if-nez v15, :cond_1d

    .line 608
    .line 609
    int-to-long v3, v10

    .line 610
    invoke-static {v6, v7, v2}, LFe/c;->q(JLCf/c;)J

    .line 611
    .line 612
    .line 613
    move-result-wide v5

    .line 614
    mul-long/2addr v5, v3

    .line 615
    move-wide v11, v5

    .line 616
    goto :goto_14

    .line 617
    :cond_1d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 618
    .line 619
    invoke-direct {v0, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 620
    .line 621
    .line 622
    throw v0

    .line 623
    :cond_1e
    if-eqz v15, :cond_20

    .line 624
    .line 625
    int-to-long v3, v10

    .line 626
    invoke-static {v6, v7, v2}, LFe/c;->q(JLCf/c;)J

    .line 627
    .line 628
    .line 629
    move-result-wide v5

    .line 630
    mul-long/2addr v5, v3

    .line 631
    invoke-static {v11, v12, v5, v6}, LFe/b;->c(JJ)J

    .line 632
    .line 633
    .line 634
    move-result-wide v3

    .line 635
    const-wide v5, 0x7fffffffffffc0deL

    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    cmp-long v1, v3, v5

    .line 641
    .line 642
    if-eqz v1, :cond_1f

    .line 643
    .line 644
    move-wide v11, v3

    .line 645
    :goto_14
    add-int/lit8 v1, v8, 0x1

    .line 646
    .line 647
    move-object v4, v2

    .line 648
    move v2, v1

    .line 649
    move-object v1, v4

    .line 650
    move/from16 v6, v19

    .line 651
    .line 652
    const/16 v4, 0x2d

    .line 653
    .line 654
    const/16 v5, 0x2b

    .line 655
    .line 656
    goto/16 :goto_2

    .line 657
    .line 658
    :cond_1f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 659
    .line 660
    invoke-direct {v0, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    throw v0

    .line 664
    :cond_20
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 665
    .line 666
    invoke-direct {v0, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 667
    .line 668
    .line 669
    throw v0

    .line 670
    :cond_21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 671
    .line 672
    const-string v2, "Unknown duration unit short name: "

    .line 673
    .line 674
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 678
    .line 679
    .line 680
    move-result v0

    .line 681
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 689
    .line 690
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 691
    .line 692
    .line 693
    throw v1

    .line 694
    :cond_22
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 695
    .line 696
    invoke-direct {v0, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    throw v0

    .line 700
    :cond_23
    move/from16 v19, v6

    .line 701
    .line 702
    sget-object v0, LCf/c;->c:LCf/c;

    .line 703
    .line 704
    invoke-static {v11, v12, v0}, LFe/b;->T(JLCf/c;)J

    .line 705
    .line 706
    .line 707
    move-result-wide v0

    .line 708
    sget-object v2, LCf/c;->b:LCf/c;

    .line 709
    .line 710
    invoke-static {v13, v14, v2}, LFe/b;->T(JLCf/c;)J

    .line 711
    .line 712
    .line 713
    move-result-wide v2

    .line 714
    invoke-static {v0, v1, v2, v3}, LCf/a;->g(JJ)J

    .line 715
    .line 716
    .line 717
    move-result-wide v0

    .line 718
    if-eqz v19, :cond_25

    .line 719
    .line 720
    sget-wide v2, LCf/a;->e:J

    .line 721
    .line 722
    cmp-long v2, v0, v2

    .line 723
    .line 724
    if-nez v2, :cond_24

    .line 725
    .line 726
    return-wide v0

    .line 727
    :cond_24
    invoke-static {v0, v1}, LCf/a;->k(J)J

    .line 728
    .line 729
    .line 730
    move-result-wide v0

    .line 731
    :cond_25
    return-wide v0

    .line 732
    :cond_26
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 733
    .line 734
    invoke-direct {v0, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 735
    .line 736
    .line 737
    throw v0

    .line 738
    :cond_27
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 739
    .line 740
    invoke-direct {v0, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 741
    .line 742
    .line 743
    throw v0

    .line 744
    :cond_28
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 745
    .line 746
    const-string v1, "No components"

    .line 747
    .line 748
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 749
    .line 750
    .line 751
    throw v0

    .line 752
    :cond_29
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 753
    .line 754
    const-string v1, "The string is empty"

    .line 755
    .line 756
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 757
    .line 758
    .line 759
    throw v0

    .line 760
    nop

    .line 761
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final O(LA/e0;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 3

    .line 1
    sget-object v0, LXf/j;->a:LWf/F;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    sget-object p2, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, LXf/p;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v0, p2, v2, v1}, LXf/p;-><init>(Ljava/io/Serializable;ZLkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 13
    .line 14
    .line 15
    move-object p2, v0

    .line 16
    :goto_0
    invoke-virtual {p0, p1, p2}, LA/e0;->v(Ljava/lang/String;Lkotlinx/serialization/json/d;)Lkotlinx/serialization/json/b;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final P(LA/e0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, LXf/j;->b(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p0, p1, p2}, LA/e0;->v(Ljava/lang/String;Lkotlinx/serialization/json/d;)Lkotlinx/serialization/json/b;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static Q(Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static R(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/PrintWriter;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/io/PrintWriter;->flush()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "toString(...)"

    .line 22
    .line 23
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static final S(ILCf/c;)J
    .locals 2

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LCf/c;->d:LCf/c;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-gtz v0, :cond_0

    .line 13
    .line 14
    int-to-long v0, p0

    .line 15
    sget-object p0, LCf/c;->b:LCf/c;

    .line 16
    .line 17
    invoke-static {v0, v1, p1, p0}, LFe/c;->p(JLCf/c;LCf/c;)J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    invoke-static {p0, p1}, LFe/b;->t(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide p0

    .line 25
    return-wide p0

    .line 26
    :cond_0
    int-to-long v0, p0

    .line 27
    invoke-static {v0, v1, p1}, LFe/b;->T(JLCf/c;)J

    .line 28
    .line 29
    .line 30
    move-result-wide p0

    .line 31
    return-wide p0
.end method

.method public static final T(JLCf/c;)J
    .locals 6

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LCf/c;->b:LCf/c;

    .line 7
    .line 8
    const-wide v1, 0x3ffffffffffa14bfL    # 1.9999999999138678

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2, v0, p2}, LFe/c;->p(JLCf/c;LCf/c;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    neg-long v3, v1

    .line 18
    cmp-long v3, v3, p0

    .line 19
    .line 20
    if-gtz v3, :cond_0

    .line 21
    .line 22
    cmp-long v1, p0, v1

    .line 23
    .line 24
    if-gtz v1, :cond_0

    .line 25
    .line 26
    invoke-static {p0, p1, p2, v0}, LFe/c;->p(JLCf/c;LCf/c;)J

    .line 27
    .line 28
    .line 29
    move-result-wide p0

    .line 30
    invoke-static {p0, p1}, LFe/b;->t(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide p0

    .line 34
    return-wide p0

    .line 35
    :cond_0
    sget-object v0, LCf/c;->c:LCf/c;

    .line 36
    .line 37
    invoke-virtual {p2, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-ltz v1, :cond_2

    .line 42
    .line 43
    invoke-static {p0, p1}, Ljava/lang/Long;->signum(J)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    int-to-long v0, v0

    .line 48
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    cmp-long v4, p0, v2

    .line 54
    .line 55
    if-gez v4, :cond_1

    .line 56
    .line 57
    move-wide p0, v2

    .line 58
    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Math;->abs(J)J

    .line 59
    .line 60
    .line 61
    move-result-wide p0

    .line 62
    invoke-static {p0, p1, p2}, LFe/c;->q(JLCf/c;)J

    .line 63
    .line 64
    .line 65
    move-result-wide p0

    .line 66
    mul-long/2addr p0, v0

    .line 67
    invoke-static {p0, p1}, LFe/b;->r(J)J

    .line 68
    .line 69
    .line 70
    move-result-wide p0

    .line 71
    return-wide p0

    .line 72
    :cond_2
    invoke-static {p0, p1, p2, v0}, LFe/c;->o(JLCf/c;LCf/c;)J

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    const-wide v2, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    const-wide v4, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    invoke-static/range {v0 .. v5}, Landroid/support/v4/media/session/b;->T(JJJ)J

    .line 87
    .line 88
    .line 89
    move-result-wide p0

    .line 90
    invoke-static {p0, p1}, LFe/b;->r(J)J

    .line 91
    .line 92
    .line 93
    move-result-wide p0

    .line 94
    return-wide p0
.end method

.method public static U(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget v0, LFe/b;->a:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-le v0, v1, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, LFe/b;->F()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v0, "RootBeer"

    .line 30
    .line 31
    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public static V(Ljava/lang/Throwable;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    instance-of v1, p0, Lyc/o;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast p0, Lyc/o;

    .line 12
    .line 13
    iget-object v1, p0, Lyc/o;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lyc/o;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    new-instance v1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v2, "Cause: "

    .line 52
    .line 53
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v2, ", Stacktrace: "

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    return-object v0
.end method

.method public static final a(Lh0/c;Ltf/a;LZ/k;ZLjava/lang/String;JJJLe0/E;JLN/o;II)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p14

    move/from16 v15, p15

    move/from16 v3, p16

    const-string v4, "painter"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onClick"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, -0x775873f7

    .line 1
    invoke-virtual {v0, v4}, LN/o;->N(I)LN/o;

    invoke-virtual {v0, v1}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v15

    invoke-virtual {v0, v2}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x20

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v4, v5

    and-int/lit8 v5, v3, 0x4

    if-eqz v5, :cond_2

    or-int/lit16 v4, v4, 0x180

    move-object/from16 v6, p2

    goto :goto_3

    :cond_2
    move-object/from16 v6, p2

    invoke-virtual {v0, v6}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x100

    goto :goto_2

    :cond_3
    const/16 v7, 0x80

    :goto_2
    or-int/2addr v4, v7

    :goto_3
    and-int/lit8 v7, v3, 0x8

    if-eqz v7, :cond_4

    or-int/lit16 v4, v4, 0xc00

    move/from16 v8, p3

    goto :goto_5

    :cond_4
    move/from16 v8, p3

    invoke-virtual {v0, v8}, LN/o;->f(Z)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x800

    goto :goto_4

    :cond_5
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v4, v9

    :goto_5
    and-int/lit16 v9, v15, 0x6000

    if-nez v9, :cond_7

    move-object/from16 v9, p4

    invoke-virtual {v0, v9}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x4000

    goto :goto_6

    :cond_6
    const/16 v10, 0x2000

    :goto_6
    or-int/2addr v4, v10

    goto :goto_7

    :cond_7
    move-object/from16 v9, p4

    :goto_7
    const/high16 v10, 0x30000

    and-int/2addr v10, v15

    if-nez v10, :cond_9

    move-wide/from16 v10, p5

    invoke-virtual {v0, v10, v11}, LN/o;->d(J)Z

    move-result v12

    if-eqz v12, :cond_8

    const/high16 v12, 0x20000

    goto :goto_8

    :cond_8
    const/high16 v12, 0x10000

    :goto_8
    or-int/2addr v4, v12

    goto :goto_9

    :cond_9
    move-wide/from16 v10, p5

    :goto_9
    and-int/lit8 v12, v3, 0x40

    if-eqz v12, :cond_a

    const/high16 v13, 0x180000

    or-int/2addr v4, v13

    move-wide/from16 v13, p7

    goto :goto_b

    :cond_a
    move-wide/from16 v13, p7

    invoke-virtual {v0, v13, v14}, LN/o;->d(J)Z

    move-result v16

    if-eqz v16, :cond_b

    const/high16 v16, 0x100000

    goto :goto_a

    :cond_b
    const/high16 v16, 0x80000

    :goto_a
    or-int v4, v4, v16

    :goto_b
    and-int/lit16 v1, v3, 0x80

    if-nez v1, :cond_c

    move-wide/from16 v1, p9

    invoke-virtual {v0, v1, v2}, LN/o;->d(J)Z

    move-result v16

    if-eqz v16, :cond_d

    const/high16 v16, 0x800000

    goto :goto_c

    :cond_c
    move-wide/from16 v1, p9

    :cond_d
    const/high16 v16, 0x400000

    :goto_c
    or-int v4, v4, v16

    and-int/lit16 v1, v3, 0x100

    if-eqz v1, :cond_e

    const/high16 v2, 0x6000000

    or-int/2addr v2, v4

    move v4, v2

    move-object/from16 v2, p11

    goto :goto_e

    :cond_e
    move-object/from16 v2, p11

    invoke-virtual {v0, v2}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_f

    const/high16 v16, 0x4000000

    goto :goto_d

    :cond_f
    const/high16 v16, 0x2000000

    :goto_d
    or-int v4, v4, v16

    :goto_e
    move/from16 v16, v1

    and-int/lit16 v1, v3, 0x200

    if-eqz v1, :cond_10

    const/high16 v17, 0x30000000

    or-int v4, v4, v17

    move/from16 v17, v1

    move-wide/from16 v1, p12

    goto :goto_10

    :cond_10
    move/from16 v17, v1

    move-wide/from16 v1, p12

    invoke-virtual {v0, v1, v2}, LN/o;->d(J)Z

    move-result v18

    if-eqz v18, :cond_11

    const/high16 v18, 0x20000000

    goto :goto_f

    :cond_11
    const/high16 v18, 0x10000000

    :goto_f
    or-int v4, v4, v18

    :goto_10
    const v18, 0x12492493

    and-int v1, v4, v18

    const v2, 0x12492492

    if-ne v1, v2, :cond_13

    invoke-virtual {v0}, LN/o;->x()Z

    move-result v1

    if-nez v1, :cond_12

    goto :goto_11

    .line 2
    :cond_12
    invoke-virtual {v0}, LN/o;->I()V

    move-wide/from16 v10, p9

    move-object/from16 v12, p11

    move-object v3, v6

    move v4, v8

    move-wide v8, v13

    move-wide/from16 v13, p12

    goto/16 :goto_1a

    .line 3
    :cond_13
    :goto_11
    invoke-virtual {v0}, LN/o;->K()V

    and-int/lit8 v1, v15, 0x1

    sget-object v2, LZ/i;->a:LZ/i;

    move/from16 v18, v1

    const v19, -0x1c00001

    if-eqz v18, :cond_16

    invoke-virtual {v0}, LN/o;->w()Z

    move-result v18

    if-eqz v18, :cond_14

    goto :goto_13

    .line 4
    :cond_14
    invoke-virtual {v0}, LN/o;->I()V

    and-int/lit16 v5, v3, 0x80

    if-eqz v5, :cond_15

    and-int v4, v4, v19

    :cond_15
    move-object v7, v2

    move/from16 v17, v4

    move-wide v12, v13

    move-wide/from16 v4, p9

    move-object/from16 v14, p11

    :goto_12
    move-wide/from16 v1, p12

    goto :goto_17

    :cond_16
    :goto_13
    if-eqz v5, :cond_17

    move-object v6, v2

    :cond_17
    if-eqz v7, :cond_18

    const/4 v8, 0x1

    :cond_18
    if-eqz v12, :cond_19

    .line 5
    sget-wide v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/utils/a;->c:J

    goto :goto_14

    :cond_19
    move-wide v12, v13

    :goto_14
    and-int/lit16 v5, v3, 0x80

    if-eqz v5, :cond_1a

    and-int v4, v4, v19

    move v7, v4

    move-wide v4, v12

    goto :goto_15

    :cond_1a
    move v7, v4

    move-wide/from16 v4, p9

    :goto_15
    if-eqz v16, :cond_1b

    .line 6
    sget-object v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/utils/a;->e:LH/d;

    goto :goto_16

    :cond_1b
    move-object/from16 v14, p11

    :goto_16
    if-eqz v17, :cond_1c

    .line 7
    sget-wide v16, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/utils/a;->d:J

    move/from16 v23, v7

    move-object v7, v2

    move-wide/from16 v1, v16

    move/from16 v17, v23

    goto :goto_17

    :cond_1c
    move/from16 v17, v7

    move-object v7, v2

    goto :goto_12

    .line 8
    :goto_17
    invoke-virtual {v0}, LN/o;->q()V

    .line 9
    invoke-static {v6, v12, v13}, LE/L;->d(LZ/k;J)LZ/k;

    move-result-object v3

    .line 10
    invoke-static {v3, v14}, Lic/d;->k(LZ/k;Le0/E;)LZ/k;

    move-result-object v3

    move-object/from16 v18, v6

    .line 11
    sget-object v6, Le0/z;->a:Lad/I;

    .line 12
    invoke-static {v3, v1, v2, v6}, LU8/v0;->l(LZ/k;JLe0/E;)LZ/k;

    move-result-object v3

    const/4 v6, 0x6

    .line 13
    invoke-static {v0, v6, v6}, LM/s;->a(LN/o;II)LM/e;

    move-result-object v19

    move/from16 p2, v6

    const v6, -0x622ae55a

    invoke-virtual {v0, v6}, LN/o;->M(I)V

    .line 14
    invoke-virtual {v0}, LN/o;->F()Ljava/lang/Object;

    move-result-object v6

    move-wide/from16 v20, v1

    .line 15
    sget-object v1, LN/k;->a:LN/P;

    if-ne v6, v1, :cond_1d

    .line 16
    new-instance v6, LD/i;

    invoke-direct {v6}, LD/i;-><init>()V

    .line 17
    invoke-virtual {v0, v6}, LN/o;->U(Ljava/lang/Object;)V

    .line 18
    :cond_1d
    check-cast v6, LD/i;

    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1}, LN/o;->p(Z)V

    .line 20
    new-instance v2, Lx0/e;

    invoke-direct {v2, v1}, Lx0/e;-><init>(I)V

    move-object/from16 p13, p1

    move-object/from16 p12, v2

    move-object/from16 p7, v3

    move-object/from16 p8, v6

    move/from16 p10, v8

    move-object/from16 p11, v9

    move-object/from16 p9, v19

    .line 21
    invoke-static/range {p7 .. p13}, Lcom/moloco/sdk/internal/publisher/H;->P(LZ/k;LD/i;LB/Q;ZLjava/lang/String;Lx0/e;Ltf/a;)LZ/k;

    move-result-object v2

    move/from16 v8, p10

    .line 22
    sget-object v3, LZ/a;->e:LZ/d;

    const v6, 0x2bb5b5d7

    .line 23
    invoke-virtual {v0, v6}, LN/o;->M(I)V

    .line 24
    invoke-static {v3, v1, v0}, LE/p;->c(LZ/d;ZLN/o;)Lr0/n;

    move-result-object v3

    const v6, -0x4ee9b9da

    .line 25
    invoke-virtual {v0, v6}, LN/o;->M(I)V

    .line 26
    sget-object v6, Lu0/M;->e:LN/L0;

    .line 27
    invoke-virtual {v0, v6}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v6

    .line 28
    check-cast v6, LL0/b;

    .line 29
    sget-object v9, Lu0/M;->k:LN/L0;

    .line 30
    invoke-virtual {v0, v9}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v9

    .line 31
    check-cast v9, LL0/i;

    .line 32
    sget-object v1, Lu0/M;->o:LN/L0;

    .line 33
    invoke-virtual {v0, v1}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v1

    .line 34
    check-cast v1, Lu0/p0;

    .line 35
    sget-object v19, Lt0/c;->g9:Lt0/b;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 p7, v2

    .line 36
    sget-object v2, Lt0/b;->b:Lt0/d;

    move-object/from16 p8, v7

    .line 37
    invoke-static/range {p7 .. p7}, LS3/f;->y(LZ/k;)LV/d;

    move-result-object v7

    .line 38
    invoke-virtual {v0}, LN/o;->O()V

    move/from16 v19, v8

    .line 39
    iget-boolean v8, v0, LN/o;->O:Z

    if-eqz v8, :cond_1e

    .line 40
    invoke-virtual {v0, v2}, LN/o;->k(Ltf/a;)V

    :goto_18
    const/4 v2, 0x0

    goto :goto_19

    .line 41
    :cond_1e
    invoke-virtual {v0}, LN/o;->X()V

    goto :goto_18

    .line 42
    :goto_19
    iput-boolean v2, v0, LN/o;->x:Z

    .line 43
    sget-object v2, Lt0/b;->e:Lt0/a;

    .line 44
    invoke-static {v0, v3, v2}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 45
    sget-object v2, Lt0/b;->d:Lt0/a;

    .line 46
    invoke-static {v0, v6, v2}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 47
    sget-object v2, Lt0/b;->f:Lt0/a;

    .line 48
    invoke-static {v0, v9, v2}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 49
    sget-object v2, Lt0/b;->g:Lt0/a;

    .line 50
    invoke-static {v0, v1, v2, v0}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    move-result-object v1

    const v2, 0x7ab4aae9

    const/4 v3, 0x0

    .line 51
    invoke-static {v3, v7, v1, v0, v2}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    const v1, -0x7f65a980

    .line 52
    invoke-virtual {v0, v1}, LN/o;->M(I)V

    move-object/from16 v7, p8

    .line 53
    invoke-static {v7, v4, v5}, LE/L;->d(LZ/k;J)LZ/k;

    move-result-object v1

    and-int/lit8 v2, v17, 0xe

    shr-int/lit8 v3, v17, 0x9

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    shr-int/lit8 v3, v17, 0x6

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v2, v3

    move-object/from16 p7, p0

    move-object/from16 p8, p4

    move-object/from16 p12, v0

    move-object/from16 p9, v1

    move/from16 p13, v2

    move-wide/from16 p10, v10

    .line 54
    invoke-static/range {p7 .. p13}, LK/t;->a(Lh0/c;Ljava/lang/String;LZ/k;JLN/o;I)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 55
    invoke-static {v0, v2, v2, v1, v2}, Lwg/b;->e(LN/o;ZZZZ)V

    .line 56
    invoke-virtual {v0, v2}, LN/o;->p(Z)V

    move-wide v10, v4

    move-wide v8, v12

    move-object v12, v14

    move-object/from16 v3, v18

    move/from16 v4, v19

    move-wide/from16 v13, v20

    .line 57
    :goto_1a
    invoke-virtual {v0}, LN/o;->r()LN/i0;

    move-result-object v0

    if-eqz v0, :cond_1f

    move-object v1, v0

    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/C;

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move-wide/from16 v6, p5

    move/from16 v16, p16

    move-object/from16 v22, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v16}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/C;-><init>(Lh0/c;Ltf/a;LZ/k;ZLjava/lang/String;JJJLe0/E;JII)V

    move-object/from16 v1, v22

    .line 58
    iput-object v0, v1, LN/i0;->d:Ltf/p;

    :cond_1f
    return-void
.end method

.method public static final b(Lcom/moloco/sdk/internal/bidtoken/a;J)Z
    .locals 10

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 7
    .line 8
    iget-wide v1, p0, Lcom/moloco/sdk/internal/bidtoken/a;->a:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sget-object p0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 15
    .line 16
    const-wide/16 v2, 0x2

    .line 17
    .line 18
    invoke-virtual {p0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    sub-long v4, v0, v2

    .line 23
    .line 24
    cmp-long p0, p1, v4

    .line 25
    .line 26
    if-ltz p0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    :goto_0
    sget-object v4, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 32
    .line 33
    const-string v5, "[sbt] currentTimeInMillis: "

    .line 34
    .line 35
    const-string v6, ", expirationTimeMillis: "

    .line 36
    .line 37
    invoke-static {p1, p2, v5, v6}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p2, ", expiredThresholdMillis: "

    .line 45
    .line 46
    const-string v0, ", expired: "

    .line 47
    .line 48
    invoke-static {p1, p2, v2, v3, v0}, LVa/M6;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    const/4 v8, 0x4

    .line 59
    const/4 v9, 0x0

    .line 60
    const-string v5, "ServerBidTokenCache"

    .line 61
    .line 62
    const/4 v7, 0x0

    .line 63
    invoke-static/range {v4 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->debugBuildLog$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return p0
.end method

.method public static final c(JJ)J
    .locals 7

    .line 1
    const-wide v0, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v2, p0, v0

    .line 7
    .line 8
    const-wide v3, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    cmp-long v2, p0, v3

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    cmp-long v0, p2, v0

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    cmp-long v0, p2, v3

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    add-long v1, p0, p2

    .line 30
    .line 31
    const-wide v3, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    const-wide v5, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static/range {v1 .. v6}, Landroid/support/v4/media/session/b;->T(JJJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide p0

    .line 45
    return-wide p0

    .line 46
    :cond_2
    :goto_0
    return-wide p2

    .line 47
    :cond_3
    :goto_1
    cmp-long v2, v3, p2

    .line 48
    .line 49
    if-gez v2, :cond_4

    .line 50
    .line 51
    cmp-long v0, p2, v0

    .line 52
    .line 53
    if-gez v0, :cond_4

    .line 54
    .line 55
    return-wide p0

    .line 56
    :cond_4
    xor-long/2addr p2, p0

    .line 57
    const-wide/16 v0, 0x0

    .line 58
    .line 59
    cmp-long p2, p2, v0

    .line 60
    .line 61
    if-ltz p2, :cond_5

    .line 62
    .line 63
    return-wide p0

    .line 64
    :cond_5
    const-wide p0, 0x7fffffffffffc0deL

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    return-wide p0
.end method

.method public static d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "exception"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eq p0, p1, :cond_2

    .line 12
    .line 13
    sget-object v0, Lof/a;->a:Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/16 v1, 0x13

    .line 22
    .line 23
    if-lt v0, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object v0, Lnf/a;->a:Ljava/lang/reflect/Method;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    new-array v1, v1, [Ljava/lang/Object;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    aput-object p1, v1, v2

    .line 35
    .line 36
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public static e(Lp9/k;)Lp9/k;
    .locals 7

    .line 1
    invoke-static {p0}, LFe/b;->h(Lp9/k;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Lp9/j;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    check-cast p0, Lp9/d;

    .line 10
    .line 11
    iget-object v0, p0, Lp9/d;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x1

    .line 23
    if-ne v1, v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Lp9/k;

    .line 30
    .line 31
    invoke-static {p0}, LFe/b;->e(Lp9/k;)Lp9/k;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_1
    iget-object v1, p0, Lp9/d;->a:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_9

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Lp9/k;

    .line 53
    .line 54
    instance-of v4, v4, Lp9/d;

    .line 55
    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    new-instance v1, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_3

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Lp9/k;

    .line 78
    .line 79
    invoke-static {v4}, LFe/b;->e(Lp9/k;)Lp9/k;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    iget v5, p0, Lp9/d;->b:I

    .line 101
    .line 102
    if-eqz v4, :cond_7

    .line 103
    .line 104
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    check-cast v4, Lp9/k;

    .line 109
    .line 110
    instance-of v6, v4, Lp9/j;

    .line 111
    .line 112
    if-eqz v6, :cond_5

    .line 113
    .line 114
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_5
    instance-of v6, v4, Lp9/d;

    .line 119
    .line 120
    if-eqz v6, :cond_4

    .line 121
    .line 122
    check-cast v4, Lp9/d;

    .line 123
    .line 124
    iget v6, v4, Lp9/d;->b:I

    .line 125
    .line 126
    invoke-static {v6, v5}, LA/f;->b(II)Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    if-eqz v5, :cond_6

    .line 131
    .line 132
    iget-object v4, v4, Lp9/d;->a:Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-static {v4}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_6
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-ne p0, v3, :cond_8

    .line 151
    .line 152
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    check-cast p0, Lp9/k;

    .line 157
    .line 158
    return-object p0

    .line 159
    :cond_8
    new-instance p0, Lp9/d;

    .line 160
    .line 161
    invoke-direct {p0, v5, v0}, Lp9/d;-><init>(ILjava/util/List;)V

    .line 162
    .line 163
    .line 164
    :cond_9
    return-object p0
.end method

.method public static f(Lp9/j;Lp9/d;)Lp9/d;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lp9/d;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p1, Lp9/d;->a:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 19
    .line 20
    .line 21
    new-instance p0, Lp9/d;

    .line 22
    .line 23
    iget p1, p1, Lp9/d;->b:I

    .line 24
    .line 25
    invoke-direct {p0, p1, v0}, Lp9/d;-><init>(ILjava/util/List;)V

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lp9/k;

    .line 53
    .line 54
    invoke-static {p0, v1}, LFe/b;->g(Lp9/k;Lp9/k;)Lp9/k;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    new-instance p0, Lp9/d;

    .line 63
    .line 64
    const/4 v0, 0x2

    .line 65
    invoke-direct {p0, v0, p1}, Lp9/d;-><init>(ILjava/util/List;)V

    .line 66
    .line 67
    .line 68
    return-object p0
.end method

.method public static g(Lp9/k;Lp9/k;)Lp9/k;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    invoke-static {p0}, LFe/b;->h(Lp9/k;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LFe/b;->h(Lp9/k;)V

    .line 7
    .line 8
    .line 9
    instance-of v2, p0, Lp9/j;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    instance-of v4, p1, Lp9/j;

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    check-cast p0, Lp9/j;

    .line 19
    .line 20
    check-cast p1, Lp9/j;

    .line 21
    .line 22
    new-instance v2, Lp9/d;

    .line 23
    .line 24
    new-array v1, v1, [Lp9/k;

    .line 25
    .line 26
    aput-object p0, v1, v0

    .line 27
    .line 28
    aput-object p1, v1, v3

    .line 29
    .line 30
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v2, v3, p0}, Lp9/d;-><init>(ILjava/util/List;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_0
    if-eqz v2, :cond_1

    .line 40
    .line 41
    instance-of v2, p1, Lp9/d;

    .line 42
    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    check-cast p0, Lp9/j;

    .line 46
    .line 47
    check-cast p1, Lp9/d;

    .line 48
    .line 49
    invoke-static {p0, p1}, LFe/b;->f(Lp9/j;Lp9/d;)Lp9/d;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :cond_1
    instance-of v2, p0, Lp9/d;

    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    instance-of v2, p1, Lp9/j;

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    check-cast p1, Lp9/j;

    .line 64
    .line 65
    check-cast p0, Lp9/d;

    .line 66
    .line 67
    invoke-static {p1, p0}, LFe/b;->f(Lp9/j;Lp9/d;)Lp9/d;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    goto/16 :goto_4

    .line 72
    .line 73
    :cond_2
    check-cast p0, Lp9/d;

    .line 74
    .line 75
    check-cast p1, Lp9/d;

    .line 76
    .line 77
    iget-object v2, p0, Lp9/d;->a:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-nez v2, :cond_3

    .line 88
    .line 89
    iget-object v2, p1, Lp9/d;->a:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-nez v2, :cond_3

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    move v3, v0

    .line 103
    :goto_0
    const-string v2, "Found an empty composite filter"

    .line 104
    .line 105
    new-array v0, v0, [Ljava/lang/Object;

    .line 106
    .line 107
    invoke-static {v3, v2, v0}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lp9/d;->e()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    iget v2, p0, Lp9/d;->b:I

    .line 115
    .line 116
    if-eqz v0, :cond_4

    .line 117
    .line 118
    invoke-virtual {p1}, Lp9/d;->e()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_4

    .line 123
    .line 124
    iget-object p1, p1, Lp9/d;->a:Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    new-instance v0, Ljava/util/ArrayList;

    .line 131
    .line 132
    iget-object p0, p0, Lp9/d;->a:Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 138
    .line 139
    .line 140
    new-instance p0, Lp9/d;

    .line 141
    .line 142
    invoke-direct {p0, v2, v0}, Lp9/d;-><init>(ILjava/util/List;)V

    .line 143
    .line 144
    .line 145
    :goto_1
    move-object v2, p0

    .line 146
    goto :goto_4

    .line 147
    :cond_4
    if-ne v2, v1, :cond_5

    .line 148
    .line 149
    move-object v0, p0

    .line 150
    goto :goto_2

    .line 151
    :cond_5
    move-object v0, p1

    .line 152
    :goto_2
    if-ne v2, v1, :cond_6

    .line 153
    .line 154
    move-object p0, p1

    .line 155
    :cond_6
    new-instance p1, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 158
    .line 159
    .line 160
    iget-object v0, v0, Lp9/d;->a:Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-eqz v2, :cond_7

    .line 175
    .line 176
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    check-cast v2, Lp9/k;

    .line 181
    .line 182
    invoke-static {v2, p0}, LFe/b;->g(Lp9/k;Lp9/k;)Lp9/k;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_7
    new-instance p0, Lp9/d;

    .line 191
    .line 192
    invoke-direct {p0, v1, p1}, Lp9/d;-><init>(ILjava/util/List;)V

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :goto_4
    invoke-static {v2}, LFe/b;->e(Lp9/k;)Lp9/k;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    return-object p0
.end method

.method public static h(Lp9/k;)V
    .locals 2

    .line 1
    instance-of v0, p0, Lp9/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    instance-of p0, p0, Lp9/d;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move p0, v1

    .line 12
    goto :goto_1

    .line 13
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 14
    :goto_1
    const-string v0, "Only field filters and composite filters are accepted."

    .line 15
    .line 16
    new-array v1, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    invoke-static {p0, v0, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final i(JJJF)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p6}, Le0/q;->a(JF)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    invoke-static {p0, p1, p4, p5}, Le0/z;->g(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    invoke-static {p2, p3, p0, p1}, Le0/z;->g(JJ)J

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    invoke-static {p2, p3}, Le0/z;->l(J)F

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const p3, 0x3d4ccccd    # 0.05f

    .line 18
    .line 19
    .line 20
    add-float/2addr p2, p3

    .line 21
    invoke-static {p0, p1}, Le0/z;->l(J)F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    add-float/2addr p0, p3

    .line 26
    invoke-static {p2, p0}, Ljava/lang/Math;->max(FF)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-static {p2, p0}, Ljava/lang/Math;->min(FF)F

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    div-float/2addr p1, p0

    .line 35
    return p1
.end method

.method public static final j(J)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LFe/b;->H(J)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string p1, "Cannot perform operation for Unspecified type."

    .line 11
    .line 12
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p0
.end method

.method public static k(Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 5
    .line 6
    const-string v0, "Cannot return null from a non-@Nullable component method"

    .line 7
    .line 8
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public static l(Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 5
    .line 6
    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 7
    .line 8
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public static m(LS1/h;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p0}, LS1/h;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    :cond_0
    return-void
.end method

.method public static final n(LHf/v0;LN/o;I)LN/V;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x4

    .line 3
    const/4 v2, 0x3

    .line 4
    const/4 v3, 0x1

    .line 5
    sget-object v4, LG1/f;->a:LN/f0;

    .line 6
    .line 7
    invoke-virtual {p1, v4}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    check-cast v4, Landroidx/lifecycle/v;

    .line 12
    .line 13
    sget-object v7, Landroidx/lifecycle/n;->d:Landroidx/lifecycle/n;

    .line 14
    .line 15
    sget-object v8, Ljf/i;->a:Ljf/i;

    .line 16
    .line 17
    invoke-interface {p0}, LHf/v0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v11

    .line 21
    invoke-interface {v4}, Landroidx/lifecycle/v;->getLifecycle()Landroidx/lifecycle/o;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    and-int/lit8 v4, p2, 0xe

    .line 26
    .line 27
    shl-int/2addr p2, v2

    .line 28
    and-int/lit16 v5, p2, 0x1c00

    .line 29
    .line 30
    or-int/2addr v4, v5

    .line 31
    const v5, 0xe000

    .line 32
    .line 33
    .line 34
    and-int/2addr p2, v5

    .line 35
    or-int/2addr p2, v4

    .line 36
    new-array v4, v1, [Ljava/lang/Object;

    .line 37
    .line 38
    aput-object p0, v4, v0

    .line 39
    .line 40
    aput-object v6, v4, v3

    .line 41
    .line 42
    const/4 v5, 0x2

    .line 43
    aput-object v7, v4, v5

    .line 44
    .line 45
    aput-object v8, v4, v2

    .line 46
    .line 47
    invoke-virtual {p1, v6}, LN/o;->g(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    and-int/lit16 v5, p2, 0x1c00

    .line 52
    .line 53
    xor-int/lit16 v5, v5, 0xc00

    .line 54
    .line 55
    const/16 v9, 0x800

    .line 56
    .line 57
    if-le v5, v9, :cond_0

    .line 58
    .line 59
    invoke-virtual {p1, v7}, LN/o;->e(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-nez v5, :cond_1

    .line 64
    .line 65
    :cond_0
    and-int/lit16 p2, p2, 0xc00

    .line 66
    .line 67
    if-ne p2, v9, :cond_2

    .line 68
    .line 69
    :cond_1
    move p2, v3

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    move p2, v0

    .line 72
    :goto_0
    or-int/2addr p2, v2

    .line 73
    invoke-virtual {p1, v8}, LN/o;->g(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    or-int/2addr p2, v2

    .line 78
    invoke-virtual {p1, p0}, LN/o;->g(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    or-int/2addr p2, v2

    .line 83
    invoke-virtual {p1}, LN/o;->F()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    sget-object v12, LN/k;->a:LN/P;

    .line 88
    .line 89
    if-nez p2, :cond_3

    .line 90
    .line 91
    if-ne v2, v12, :cond_4

    .line 92
    .line 93
    :cond_3
    new-instance v5, LG1/d;

    .line 94
    .line 95
    const/4 v10, 0x0

    .line 96
    move-object v9, p0

    .line 97
    invoke-direct/range {v5 .. v10}, LG1/d;-><init>(Landroidx/lifecycle/o;Landroidx/lifecycle/n;Ljf/h;LHf/v0;Ljf/c;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v5}, LN/o;->U(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    move-object v2, v5

    .line 104
    :cond_4
    check-cast v2, Ltf/p;

    .line 105
    .line 106
    invoke-virtual {p1}, LN/o;->F()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    if-ne p0, v12, :cond_5

    .line 111
    .line 112
    sget-object p0, LN/P;->f:LN/P;

    .line 113
    .line 114
    invoke-static {v11, p0}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p1, p0}, LN/o;->U(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    check-cast p0, LN/V;

    .line 122
    .line 123
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-virtual {p1, v2}, LN/o;->g(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    invoke-virtual {p1}, LN/o;->F()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    if-nez v1, :cond_6

    .line 136
    .line 137
    if-ne v4, v12, :cond_7

    .line 138
    .line 139
    :cond_6
    new-instance v4, LN/D0;

    .line 140
    .line 141
    const/4 v1, 0x0

    .line 142
    invoke-direct {v4, v2, p0, v1}, LN/D0;-><init>(Ltf/p;LN/V;Ljf/c;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v4}, LN/o;->U(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_7
    check-cast v4, Ltf/p;

    .line 149
    .line 150
    iget-object v1, p1, LN/o;->b:LN/q;

    .line 151
    .line 152
    invoke-virtual {v1}, LN/q;->h()Ljf/h;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    array-length v2, p2

    .line 157
    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    array-length v2, p2

    .line 162
    move v5, v0

    .line 163
    :goto_1
    if-ge v0, v2, :cond_8

    .line 164
    .line 165
    aget-object v6, p2, v0

    .line 166
    .line 167
    invoke-virtual {p1, v6}, LN/o;->e(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    or-int/2addr v5, v6

    .line 172
    add-int/2addr v0, v3

    .line 173
    goto :goto_1

    .line 174
    :cond_8
    invoke-virtual {p1}, LN/o;->F()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    if-nez v5, :cond_a

    .line 179
    .line 180
    if-ne p2, v12, :cond_9

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_9
    return-object p0

    .line 184
    :cond_a
    :goto_2
    new-instance p2, LN/M;

    .line 185
    .line 186
    invoke-direct {p2, v1, v4}, LN/M;-><init>(Ljf/h;Ltf/p;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, p2}, LN/o;->U(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    return-object p0
.end method

.method public static o(Lp9/k;)Lp9/k;
    .locals 5

    .line 1
    invoke-static {p0}, LFe/b;->h(Lp9/k;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Lp9/j;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    move-object v0, p0

    .line 10
    check-cast v0, Lp9/d;

    .line 11
    .line 12
    iget-object v1, v0, Lp9/d;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x1

    .line 23
    const/4 v3, 0x0

    .line 24
    if-ne v1, v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lp9/k;->b()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Lp9/k;

    .line 35
    .line 36
    invoke-static {p0}, LFe/b;->o(Lp9/k;)Lp9/k;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    iget-object v1, v0, Lp9/d;->a:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Lp9/k;

    .line 67
    .line 68
    invoke-static {v4}, LFe/b;->o(Lp9/k;)Lp9/k;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    new-instance v1, Lp9/d;

    .line 77
    .line 78
    iget v0, v0, Lp9/d;->b:I

    .line 79
    .line 80
    invoke-direct {v1, v0, p0}, Lp9/d;-><init>(ILjava/util/List;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v1}, LFe/b;->e(Lp9/k;)Lp9/k;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p0}, LFe/b;->G(Lp9/k;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_3
    instance-of v0, p0, Lp9/d;

    .line 95
    .line 96
    const-string v1, "field filters are already in DNF form."

    .line 97
    .line 98
    new-array v4, v3, [Ljava/lang/Object;

    .line 99
    .line 100
    invoke-static {v0, v1, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    check-cast p0, Lp9/d;

    .line 104
    .line 105
    invoke-virtual {p0}, Lp9/d;->e()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    const-string v1, "Disjunction of filters all of which are already in DNF form is itself in DNF form."

    .line 110
    .line 111
    new-array v4, v3, [Ljava/lang/Object;

    .line 112
    .line 113
    invoke-static {v0, v1, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iget-object p0, p0, Lp9/d;->a:Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-static {p0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-le v0, v2, :cond_4

    .line 127
    .line 128
    move v0, v2

    .line 129
    goto :goto_1

    .line 130
    :cond_4
    move v0, v3

    .line 131
    :goto_1
    const-string v1, "Single-filter composite filters are already in DNF form."

    .line 132
    .line 133
    new-array v4, v3, [Ljava/lang/Object;

    .line 134
    .line 135
    invoke-static {v0, v1, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-static {p0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, Lp9/k;

    .line 147
    .line 148
    :goto_2
    invoke-static {p0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-ge v2, v1, :cond_5

    .line 157
    .line 158
    invoke-static {p0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, Lp9/k;

    .line 167
    .line 168
    invoke-static {v0, v1}, LFe/b;->g(Lp9/k;Lp9/k;)Lp9/k;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    add-int/lit8 v2, v2, 0x1

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_5
    return-object v0
.end method

.method public static p(Lp9/k;)Lp9/k;
    .locals 5

    .line 1
    invoke-static {p0}, LFe/b;->h(Lp9/k;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    instance-of v1, p0, Lp9/j;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    instance-of v1, p0, Lp9/o;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast p0, Lp9/o;

    .line 18
    .line 19
    iget-object v1, p0, Lp9/j;->b:Lka/C1;

    .line 20
    .line 21
    invoke-virtual {v1}, Lka/C1;->m()Lka/g;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Lka/g;->getValuesList()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lka/C1;

    .line 44
    .line 45
    sget-object v3, Lp9/i;->d:Lp9/i;

    .line 46
    .line 47
    iget-object v4, p0, Lp9/j;->c:Ls9/j;

    .line 48
    .line 49
    invoke-static {v4, v3, v2}, Lp9/j;->e(Ls9/j;Lp9/i;Lka/C1;)Lp9/j;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    new-instance p0, Lp9/d;

    .line 58
    .line 59
    const/4 v1, 0x2

    .line 60
    invoke-direct {p0, v1, v0}, Lp9/d;-><init>(ILjava/util/List;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-object p0

    .line 64
    :cond_2
    check-cast p0, Lp9/d;

    .line 65
    .line 66
    iget-object v1, p0, Lp9/d;->a:Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Lp9/k;

    .line 87
    .line 88
    invoke-static {v2}, LFe/b;->p(Lp9/k;)Lp9/k;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    new-instance v1, Lp9/d;

    .line 97
    .line 98
    iget p0, p0, Lp9/d;->b:I

    .line 99
    .line 100
    invoke-direct {v1, p0, v0}, Lp9/d;-><init>(ILjava/util/List;)V

    .line 101
    .line 102
    .line 103
    return-object v1
.end method

.method public static q(Ljava/lang/String;)Lyc/o;
    .locals 3

    .line 1
    new-instance v0, Lyc/o;

    .line 2
    .line 3
    const-string v1, "Unable to establish connection on channel: "

    .line 4
    .line 5
    const-string v2, "."

    .line 6
    .line 7
    invoke-static {v1, p0, v2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, ""

    .line 12
    .line 13
    const-string v2, "channel-error"

    .line 14
    .line 15
    invoke-direct {v0, v2, p0, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public static final r(J)J
    .locals 3

    .line 1
    sget-object v0, LCf/a;->b:LCf/h;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    shl-long/2addr p0, v1

    .line 5
    const-wide/16 v1, 0x1

    .line 6
    .line 7
    add-long/2addr p0, v1

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget v0, LCf/b;->a:I

    .line 12
    .line 13
    return-wide p0
.end method

.method public static final s(J)J
    .locals 6

    .line 1
    const-wide v0, -0x431bde82d7aL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, v0, p0

    .line 7
    .line 8
    if-gtz v0, :cond_0

    .line 9
    .line 10
    const-wide v0, 0x431bde82d7bL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmp-long v0, p0, v0

    .line 16
    .line 17
    if-gez v0, :cond_0

    .line 18
    .line 19
    const v0, 0xf4240

    .line 20
    .line 21
    .line 22
    int-to-long v0, v0

    .line 23
    mul-long/2addr p0, v0

    .line 24
    invoke-static {p0, p1}, LFe/b;->t(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    return-wide p0

    .line 29
    :cond_0
    const-wide v2, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    const-wide v4, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    move-wide v0, p0

    .line 40
    invoke-static/range {v0 .. v5}, Landroid/support/v4/media/session/b;->T(JJJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide p0

    .line 44
    invoke-static {p0, p1}, LFe/b;->r(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide p0

    .line 48
    return-wide p0
.end method

.method public static final t(J)J
    .locals 1

    .line 1
    sget-object v0, LCf/a;->b:LCf/h;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    shl-long/2addr p0, v0

    .line 5
    sget v0, LCf/b;->a:I

    .line 6
    .line 7
    return-wide p0
.end method

.method public static u(Ljava/io/Serializable;)V
    .locals 2

    .line 1
    sget v0, LFe/b;->a:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, LFe/b;->F()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "RootBeer"

    .line 29
    .line 30
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static {}, LFe/b;->F()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const-string v0, "QLog"

    .line 57
    .line 58
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void
.end method

.method public static v(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
.end method

.method public static w(DD)I
    .locals 4

    .line 1
    cmpg-double v0, p0, p2

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-gez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    cmpl-double v0, p0, p2

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-lez v0, :cond_1

    .line 11
    .line 12
    return v2

    .line 13
    :cond_1
    const/4 v3, 0x0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    return v3

    .line 17
    :cond_2
    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-nez p2, :cond_3

    .line 22
    .line 23
    return v1

    .line 24
    :cond_3
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_4

    .line 29
    .line 30
    return v2

    .line 31
    :cond_4
    return v3
.end method

.method public static final x(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "annotationType(...)"

    .line 11
    .line 12
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, LFe/b;->B(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v0, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>"

    .line 20
    .line 21
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public static final y(Lkotlin/reflect/KClass;)Ljava/lang/Class;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p0, Lkotlin/jvm/internal/d;

    .line 7
    .line 8
    invoke-interface {p0}, Lkotlin/jvm/internal/d;->getJClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v0, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"

    .line 13
    .line 14
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public static final z(Lkotlin/reflect/KClass;)Ljava/lang/Class;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p0, Lkotlin/jvm/internal/d;

    .line 7
    .line 8
    invoke-interface {p0}, Lkotlin/jvm/internal/d;->getJClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    sparse-switch v1, :sswitch_data_0

    .line 28
    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :sswitch_0
    const-string v1, "short"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :cond_1
    const-class p0, Ljava/lang/Short;

    .line 43
    .line 44
    goto/16 :goto_0

    .line 45
    .line 46
    :sswitch_1
    const-string v1, "float"

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const-class p0, Ljava/lang/Float;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :sswitch_2
    const-string v1, "boolean"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    const-class p0, Ljava/lang/Boolean;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :sswitch_3
    const-string v1, "void"

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_4

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    const-class p0, Ljava/lang/Void;

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :sswitch_4
    const-string v1, "long"

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_5

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    const-class p0, Ljava/lang/Long;

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :sswitch_5
    const-string v1, "char"

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_6

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_6
    const-class p0, Ljava/lang/Character;

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :sswitch_6
    const-string v1, "byte"

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_7

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_7
    const-class p0, Ljava/lang/Byte;

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :sswitch_7
    const-string v1, "int"

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_8

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_8
    const-class p0, Ljava/lang/Integer;

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :sswitch_8
    const-string v1, "double"

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-nez v0, :cond_9

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_9
    const-class p0, Ljava/lang/Double;

    .line 140
    .line 141
    :goto_0
    return-object p0

    .line 142
    nop

    .line 143
    :sswitch_data_0
    .sparse-switch
        -0x4f08842f -> :sswitch_8
        0x197ef -> :sswitch_7
        0x2e6108 -> :sswitch_6
        0x2e9356 -> :sswitch_5
        0x32c67c -> :sswitch_4
        0x375194 -> :sswitch_3
        0x3db6c28 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x685847c -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public abstract K(I)V
.end method

.method public abstract L(Landroid/graphics/Typeface;Z)V
.end method
