.class public final Lf0/g;
.super LG9/e;
.source "SourceFile"


# instance fields
.field public final e:Lf0/n;

.field public final f:Lf0/n;

.field public final g:[F


# direct methods
.method public constructor <init>(Lf0/n;Lf0/n;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x19

    .line 3
    .line 4
    invoke-direct {p0, p1, p2, v0, v1}, LG9/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lf0/g;->e:Lf0/n;

    .line 8
    .line 9
    iput-object p2, p0, Lf0/g;->f:Lf0/n;

    .line 10
    .line 11
    iget-object v0, p1, Lf0/n;->d:Lf0/p;

    .line 12
    .line 13
    iget-object v1, p2, Lf0/n;->d:Lf0/p;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lf0/h;->e(Lf0/p;Lf0/p;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v2, p1, Lf0/n;->i:[F

    .line 20
    .line 21
    iget-object v3, p2, Lf0/n;->j:[F

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-static {v3, v2}, Lf0/h;->i([F[F)[F

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object p1, p1, Lf0/n;->d:Lf0/p;

    .line 31
    .line 32
    invoke-virtual {p1}, Lf0/p;->a()[F

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v1}, Lf0/p;->a()[F

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    sget-object v5, Lf0/h;->b:Lf0/p;

    .line 41
    .line 42
    invoke-static {p1, v5}, Lf0/h;->e(Lf0/p;Lf0/p;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    sget-object v6, Lf0/h;->e:[F

    .line 47
    .line 48
    sget-object v7, Lf0/a;->b:Lf0/a;

    .line 49
    .line 50
    iget-object v7, v7, Lf0/a;->a:[F

    .line 51
    .line 52
    const-string v8, "copyOf(this, size)"

    .line 53
    .line 54
    const/4 v9, 0x3

    .line 55
    if-nez p1, :cond_1

    .line 56
    .line 57
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v7, v0, p1}, Lf0/h;->c([F[F[F)[F

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1, v2}, Lf0/h;->i([F[F)[F

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    :cond_1
    invoke-static {v1, v5}, Lf0/h;->e(Lf0/p;Lf0/p;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-nez p1, :cond_2

    .line 77
    .line 78
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v7, v4, p1}, Lf0/h;->c([F[F[F)[F

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iget-object p2, p2, Lf0/n;->i:[F

    .line 90
    .line 91
    invoke-static {p1, p2}, Lf0/h;->i([F[F)[F

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {p1}, Lf0/h;->h([F)[F

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    :cond_2
    invoke-static {v3, v2}, Lf0/h;->i([F[F)[F

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    :goto_0
    iput-object p1, p0, Lf0/g;->g:[F

    .line 104
    .line 105
    return-void
.end method


# virtual methods
.method public final G([F)V
    .locals 6

    .line 1
    iget-object v0, p0, Lf0/g;->e:Lf0/n;

    .line 2
    .line 3
    iget-object v1, v0, Lf0/n;->n:Lf0/m;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget v3, p1, v2

    .line 7
    .line 8
    float-to-double v3, v3

    .line 9
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v1, v3}, Lf0/m;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    double-to-float v1, v3

    .line 24
    aput v1, p1, v2

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    aget v3, p1, v1

    .line 28
    .line 29
    float-to-double v3, v3

    .line 30
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-object v0, v0, Lf0/n;->n:Lf0/m;

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Lf0/m;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 43
    .line 44
    .line 45
    move-result-wide v3

    .line 46
    double-to-float v3, v3

    .line 47
    aput v3, p1, v1

    .line 48
    .line 49
    const/4 v3, 0x2

    .line 50
    aget v4, p1, v3

    .line 51
    .line 52
    float-to-double v4, v4

    .line 53
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v0, v4}, Lf0/m;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    double-to-float v0, v4

    .line 68
    aput v0, p1, v3

    .line 69
    .line 70
    iget-object v0, p0, Lf0/g;->g:[F

    .line 71
    .line 72
    invoke-static {v0, p1}, Lf0/h;->j([F[F)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Lf0/g;->f:Lf0/n;

    .line 76
    .line 77
    aget v4, p1, v2

    .line 78
    .line 79
    float-to-double v4, v4

    .line 80
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    iget-object v0, v0, Lf0/n;->l:Lf0/m;

    .line 85
    .line 86
    invoke-virtual {v0, v4}, Lf0/m;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Ljava/lang/Number;

    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    .line 93
    .line 94
    .line 95
    move-result-wide v4

    .line 96
    double-to-float v4, v4

    .line 97
    aput v4, p1, v2

    .line 98
    .line 99
    aget v2, p1, v1

    .line 100
    .line 101
    float-to-double v4, v2

    .line 102
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v0, v2}, Lf0/m;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, Ljava/lang/Number;

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 113
    .line 114
    .line 115
    move-result-wide v4

    .line 116
    double-to-float v2, v4

    .line 117
    aput v2, p1, v1

    .line 118
    .line 119
    aget v1, p1, v3

    .line 120
    .line 121
    float-to-double v1, v1

    .line 122
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v0, v1}, Lf0/m;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Ljava/lang/Number;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 133
    .line 134
    .line 135
    move-result-wide v0

    .line 136
    double-to-float v0, v0

    .line 137
    aput v0, p1, v3

    .line 138
    .line 139
    return-void
.end method
