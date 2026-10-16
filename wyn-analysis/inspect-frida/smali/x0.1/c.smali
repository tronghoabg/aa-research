.class public final Lx0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static e:I = 0x1


# instance fields
.field public final a:Lt0/t;

.field public final b:Lt0/t;

.field public final c:Ld0/d;

.field public final d:LL0/i;


# direct methods
.method public constructor <init>(Lt0/t;Lt0/t;)V
    .locals 1

    .line 1
    const-string v0, "subtreeRoot"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lx0/c;->a:Lt0/t;

    .line 10
    .line 11
    iput-object p2, p0, Lx0/c;->b:Lt0/t;

    .line 12
    .line 13
    iget-object v0, p1, Lt0/t;->p:LL0/i;

    .line 14
    .line 15
    iput-object v0, p0, Lx0/c;->d:LL0/i;

    .line 16
    .line 17
    invoke-static {p2}, LU8/v0;->G(Lt0/t;)Lt0/y;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iget-object p1, p1, Lt0/t;->x:Lt0/i;

    .line 22
    .line 23
    invoke-virtual {p1}, Lt0/y;->S()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2}, Lt0/y;->S()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    invoke-virtual {p1, p2, v0}, Lt0/y;->U(Lr0/k;Z)Ld0/d;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    :goto_0
    iput-object p1, p0, Lx0/c;->c:Ld0/d;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(Lx0/c;)I
    .locals 8

    .line 1
    const-string v0, "other"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iget-object v1, p0, Lx0/c;->c:Ld0/d;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_1

    .line 12
    .line 13
    :cond_0
    iget-object v2, p1, Lx0/c;->c:Ld0/d;

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_1
    sget v3, Lx0/c;->e:I

    .line 20
    .line 21
    iget v4, v1, Ld0/d;->b:F

    .line 22
    .line 23
    iget v5, v2, Ld0/d;->b:F

    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    if-ne v3, v0, :cond_3

    .line 27
    .line 28
    iget v3, v1, Ld0/d;->d:F

    .line 29
    .line 30
    sub-float/2addr v3, v5

    .line 31
    cmpg-float v3, v3, v6

    .line 32
    .line 33
    if-gtz v3, :cond_2

    .line 34
    .line 35
    goto/16 :goto_2

    .line 36
    .line 37
    :cond_2
    iget v3, v2, Ld0/d;->d:F

    .line 38
    .line 39
    sub-float v3, v4, v3

    .line 40
    .line 41
    cmpl-float v3, v3, v6

    .line 42
    .line 43
    if-ltz v3, :cond_3

    .line 44
    .line 45
    goto/16 :goto_1

    .line 46
    .line 47
    :cond_3
    sget-object v3, LL0/i;->a:LL0/i;

    .line 48
    .line 49
    iget-object v7, p0, Lx0/c;->d:LL0/i;

    .line 50
    .line 51
    if-ne v7, v3, :cond_5

    .line 52
    .line 53
    iget v3, v1, Ld0/d;->a:F

    .line 54
    .line 55
    iget v7, v2, Ld0/d;->a:F

    .line 56
    .line 57
    sub-float/2addr v3, v7

    .line 58
    cmpg-float v3, v3, v6

    .line 59
    .line 60
    if-nez v3, :cond_4

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_4
    if-gez v3, :cond_b

    .line 64
    .line 65
    goto/16 :goto_2

    .line 66
    .line 67
    :cond_5
    iget v3, v1, Ld0/d;->c:F

    .line 68
    .line 69
    iget v7, v2, Ld0/d;->c:F

    .line 70
    .line 71
    sub-float/2addr v3, v7

    .line 72
    cmpg-float v3, v3, v6

    .line 73
    .line 74
    if-nez v3, :cond_a

    .line 75
    .line 76
    :goto_0
    sub-float/2addr v4, v5

    .line 77
    cmpg-float v3, v4, v6

    .line 78
    .line 79
    if-nez v3, :cond_9

    .line 80
    .line 81
    invoke-virtual {v1}, Ld0/d;->b()F

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-virtual {v2}, Ld0/d;->b()F

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    sub-float/2addr v3, v4

    .line 90
    cmpg-float v3, v3, v6

    .line 91
    .line 92
    if-nez v3, :cond_8

    .line 93
    .line 94
    invoke-virtual {v1}, Ld0/d;->c()F

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    invoke-virtual {v2}, Ld0/d;->c()F

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    sub-float/2addr v1, v2

    .line 103
    cmpg-float v1, v1, v6

    .line 104
    .line 105
    if-nez v1, :cond_7

    .line 106
    .line 107
    iget-object v1, p0, Lx0/c;->b:Lt0/t;

    .line 108
    .line 109
    invoke-static {v1}, LU8/v0;->G(Lt0/t;)Lt0/y;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-static {v2}, LFe/g;->q(Lt0/y;)Ld0/d;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    iget-object v3, p1, Lx0/c;->b:Lt0/t;

    .line 118
    .line 119
    invoke-static {v3}, LU8/v0;->G(Lt0/t;)Lt0/y;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-static {v4}, LFe/g;->q(Lt0/y;)Ld0/d;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    new-instance v5, Lx0/b;

    .line 128
    .line 129
    const/4 v6, 0x0

    .line 130
    invoke-direct {v5, v2, v6}, Lx0/b;-><init>(Ld0/d;I)V

    .line 131
    .line 132
    .line 133
    invoke-static {v1, v5}, LU8/v0;->E(Lt0/t;Ltf/l;)Lt0/t;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    new-instance v2, Lx0/b;

    .line 138
    .line 139
    const/4 v5, 0x1

    .line 140
    invoke-direct {v2, v4, v5}, Lx0/b;-><init>(Ld0/d;I)V

    .line 141
    .line 142
    .line 143
    invoke-static {v3, v2}, LU8/v0;->E(Lt0/t;Ltf/l;)Lt0/t;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    if-eqz v1, :cond_6

    .line 148
    .line 149
    if-eqz v2, :cond_6

    .line 150
    .line 151
    new-instance v0, Lx0/c;

    .line 152
    .line 153
    iget-object v3, p0, Lx0/c;->a:Lt0/t;

    .line 154
    .line 155
    invoke-direct {v0, v3, v1}, Lx0/c;-><init>(Lt0/t;Lt0/t;)V

    .line 156
    .line 157
    .line 158
    new-instance v1, Lx0/c;

    .line 159
    .line 160
    iget-object p1, p1, Lx0/c;->a:Lt0/t;

    .line 161
    .line 162
    invoke-direct {v1, p1, v2}, Lx0/c;-><init>(Lt0/t;Lt0/t;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v1}, Lx0/c;->a(Lx0/c;)I

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    return p1

    .line 170
    :cond_6
    if-eqz v1, :cond_c

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_7
    if-gez v1, :cond_c

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_8
    if-gez v3, :cond_c

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_9
    if-gez v3, :cond_b

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_a
    if-gez v3, :cond_c

    .line 183
    .line 184
    :cond_b
    :goto_1
    return v0

    .line 185
    :cond_c
    :goto_2
    const/4 p1, -0x1

    .line 186
    return p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lx0/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lx0/c;->a(Lx0/c;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
