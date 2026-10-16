.class public final LE/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE/d;


# instance fields
.field public final a:F

.field public final b:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LE/e;->a:F

    .line 5
    .line 6
    iput p1, p0, LE/e;->b:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LL0/b;I[I[I)V
    .locals 7

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sizes"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "outPositions"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v5, LL0/i;->a:LL0/i;

    .line 17
    .line 18
    move-object v1, p0

    .line 19
    move-object v2, p1

    .line 20
    move v3, p2

    .line 21
    move-object v4, p3

    .line 22
    move-object v6, p4

    .line 23
    invoke-virtual/range {v1 .. v6}, LE/e;->c(LL0/b;I[ILL0/i;[I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final b()F
    .locals 1

    .line 1
    iget v0, p0, LE/e;->b:F

    .line 2
    .line 3
    return v0
.end method

.method public final c(LL0/b;I[ILL0/i;[I)V
    .locals 10

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    const-string v2, "<this>"

    .line 4
    .line 5
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v2, "sizes"

    .line 9
    .line 10
    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v2, "layoutDirection"

    .line 14
    .line 15
    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v2, "outPositions"

    .line 19
    .line 20
    invoke-static {p5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    array-length v2, p3

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    goto/16 :goto_5

    .line 27
    .line 28
    :cond_0
    iget v2, p0, LE/e;->a:F

    .line 29
    .line 30
    invoke-interface {p1, v2}, LL0/b;->j(F)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    sget-object v2, LL0/i;->b:LL0/i;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    if-ne p4, v2, :cond_1

    .line 38
    .line 39
    move v2, v1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move v2, v3

    .line 42
    :goto_0
    sget-object v4, LE/i;->a:LE/f;

    .line 43
    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    array-length v2, p3

    .line 47
    move v4, v3

    .line 48
    move v5, v4

    .line 49
    move v6, v5

    .line 50
    move v7, v6

    .line 51
    :goto_1
    if-ge v4, v2, :cond_3

    .line 52
    .line 53
    aget v6, p3, v4

    .line 54
    .line 55
    add-int/lit8 v8, v7, 0x1

    .line 56
    .line 57
    sub-int v9, p2, v6

    .line 58
    .line 59
    invoke-static {v5, v9}, Ljava/lang/Math;->min(II)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    aput v5, p5, v7

    .line 64
    .line 65
    sub-int v5, p2, v5

    .line 66
    .line 67
    sub-int/2addr v5, v6

    .line 68
    invoke-static {p1, v5}, Ljava/lang/Math;->min(II)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    aget v7, p5, v7

    .line 73
    .line 74
    add-int/2addr v7, v6

    .line 75
    add-int v6, v7, v5

    .line 76
    .line 77
    add-int/2addr v4, v1

    .line 78
    move v7, v6

    .line 79
    move v6, v5

    .line 80
    move v5, v7

    .line 81
    move v7, v8

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    array-length v2, p3

    .line 84
    sub-int/2addr v2, v1

    .line 85
    move v5, v3

    .line 86
    move v6, v5

    .line 87
    :goto_2
    if-ge v0, v2, :cond_3

    .line 88
    .line 89
    aget v4, p3, v2

    .line 90
    .line 91
    sub-int v6, p2, v4

    .line 92
    .line 93
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    aput v5, p5, v2

    .line 98
    .line 99
    sub-int v5, p2, v5

    .line 100
    .line 101
    sub-int/2addr v5, v4

    .line 102
    invoke-static {p1, v5}, Ljava/lang/Math;->min(II)I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    aget v5, p5, v2

    .line 107
    .line 108
    add-int/2addr v5, v4

    .line 109
    add-int/2addr v5, v6

    .line 110
    add-int/2addr v2, v0

    .line 111
    goto :goto_2

    .line 112
    :cond_3
    sub-int/2addr v5, v6

    .line 113
    if-ge v5, p2, :cond_5

    .line 114
    .line 115
    sub-int/2addr p2, v5

    .line 116
    int-to-float p1, p2

    .line 117
    const/high16 p2, 0x40000000    # 2.0f

    .line 118
    .line 119
    div-float/2addr p1, p2

    .line 120
    sget-object p2, LL0/i;->a:LL0/i;

    .line 121
    .line 122
    const/high16 p3, -0x40800000    # -1.0f

    .line 123
    .line 124
    if-ne p4, p2, :cond_4

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_4
    int-to-float p2, v0

    .line 128
    mul-float/2addr p3, p2

    .line 129
    :goto_3
    int-to-float p2, v1

    .line 130
    add-float/2addr p2, p3

    .line 131
    mul-float/2addr p2, p1

    .line 132
    invoke-static {p2}, Lvf/a;->H(F)I

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    array-length p2, p5

    .line 137
    :goto_4
    if-ge v3, p2, :cond_5

    .line 138
    .line 139
    aget p3, p5, v3

    .line 140
    .line 141
    add-int/2addr p3, p1

    .line 142
    aput p3, p5, v3

    .line 143
    .line 144
    add-int/2addr v3, v1

    .line 145
    goto :goto_4

    .line 146
    :cond_5
    :goto_5
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, LE/e;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, LE/e;

    .line 10
    .line 11
    iget p1, p1, LE/e;->a:F

    .line 12
    .line 13
    iget v0, p0, LE/e;->a:F

    .line 14
    .line 15
    invoke-static {v0, p1}, LL0/d;->a(FF)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    sget-object p1, LE/h;->i:LE/h;

    .line 23
    .line 24
    invoke-virtual {p1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_3

    .line 29
    .line 30
    :goto_0
    const/4 p1, 0x0

    .line 31
    return p1

    .line 32
    :cond_3
    :goto_1
    const/4 p1, 0x1

    .line 33
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, LE/e;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    sget-object v1, LE/h;->i:LE/h;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v1, v0

    .line 20
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "Arrangement#spacedAligned("

    .line 4
    .line 5
    invoke-static {v0, v1}, LA7/p0;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, p0, LE/e;->a:F

    .line 10
    .line 11
    invoke-static {v1}, LL0/d;->b(F)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ", "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    sget-object v1, LE/h;->i:LE/h;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const/16 v1, 0x29

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0
.end method
