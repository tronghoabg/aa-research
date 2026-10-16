.class public final LH/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/E;


# instance fields
.field public final a:LH/a;

.field public final b:LH/a;

.field public final c:LH/a;

.field public final d:LH/a;


# direct methods
.method public constructor <init>(LH/a;LH/a;LH/a;LH/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LH/d;->a:LH/a;

    .line 5
    .line 6
    iput-object p2, p0, LH/d;->b:LH/a;

    .line 7
    .line 8
    iput-object p3, p0, LH/d;->c:LH/a;

    .line 9
    .line 10
    iput-object p4, p0, LH/d;->d:LH/a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(JLL0/i;LL0/b;)Le0/z;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v4, p4

    .line 8
    .line 9
    const-string v5, "layoutDirection"

    .line 10
    .line 11
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v5, "density"

    .line 15
    .line 16
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v5, v0, LH/d;->a:LH/a;

    .line 20
    .line 21
    invoke-interface {v5, v1, v2, v4}, LH/a;->a(JLL0/b;)F

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    iget-object v6, v0, LH/d;->b:LH/a;

    .line 26
    .line 27
    invoke-interface {v6, v1, v2, v4}, LH/a;->a(JLL0/b;)F

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    iget-object v7, v0, LH/d;->c:LH/a;

    .line 32
    .line 33
    invoke-interface {v7, v1, v2, v4}, LH/a;->a(JLL0/b;)F

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    iget-object v8, v0, LH/d;->d:LH/a;

    .line 38
    .line 39
    invoke-interface {v8, v1, v2, v4}, LH/a;->a(JLL0/b;)F

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-static {v1, v2}, Ld0/f;->c(J)F

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    add-float v9, v5, v4

    .line 48
    .line 49
    cmpl-float v10, v9, v8

    .line 50
    .line 51
    if-lez v10, :cond_0

    .line 52
    .line 53
    div-float v9, v8, v9

    .line 54
    .line 55
    mul-float/2addr v5, v9

    .line 56
    mul-float/2addr v4, v9

    .line 57
    :cond_0
    add-float v9, v6, v7

    .line 58
    .line 59
    cmpl-float v10, v9, v8

    .line 60
    .line 61
    if-lez v10, :cond_1

    .line 62
    .line 63
    div-float/2addr v8, v9

    .line 64
    mul-float/2addr v6, v8

    .line 65
    mul-float/2addr v7, v8

    .line 66
    :cond_1
    const/4 v8, 0x0

    .line 67
    cmpl-float v9, v5, v8

    .line 68
    .line 69
    if-ltz v9, :cond_7

    .line 70
    .line 71
    cmpl-float v9, v6, v8

    .line 72
    .line 73
    if-ltz v9, :cond_7

    .line 74
    .line 75
    cmpl-float v9, v7, v8

    .line 76
    .line 77
    if-ltz v9, :cond_7

    .line 78
    .line 79
    cmpl-float v9, v4, v8

    .line 80
    .line 81
    if-ltz v9, :cond_7

    .line 82
    .line 83
    add-float v9, v5, v6

    .line 84
    .line 85
    add-float/2addr v9, v7

    .line 86
    add-float/2addr v9, v4

    .line 87
    cmpg-float v8, v9, v8

    .line 88
    .line 89
    if-nez v8, :cond_2

    .line 90
    .line 91
    new-instance v3, Le0/v;

    .line 92
    .line 93
    sget-wide v4, Ld0/c;->b:J

    .line 94
    .line 95
    invoke-static {v4, v5, v1, v2}, La/a;->f(JJ)Ld0/d;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-direct {v3, v1}, Le0/v;-><init>(Ld0/d;)V

    .line 100
    .line 101
    .line 102
    return-object v3

    .line 103
    :cond_2
    new-instance v8, Le0/w;

    .line 104
    .line 105
    sget-wide v9, Ld0/c;->b:J

    .line 106
    .line 107
    invoke-static {v9, v10, v1, v2}, La/a;->f(JJ)Ld0/d;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    sget-object v2, LL0/i;->a:LL0/i;

    .line 112
    .line 113
    if-ne v3, v2, :cond_3

    .line 114
    .line 115
    move v9, v5

    .line 116
    goto :goto_0

    .line 117
    :cond_3
    move v9, v6

    .line 118
    :goto_0
    invoke-static {v9, v9}, LFe/g;->a(FF)J

    .line 119
    .line 120
    .line 121
    move-result-wide v15

    .line 122
    if-ne v3, v2, :cond_4

    .line 123
    .line 124
    move v5, v6

    .line 125
    :cond_4
    invoke-static {v5, v5}, LFe/g;->a(FF)J

    .line 126
    .line 127
    .line 128
    move-result-wide v17

    .line 129
    if-ne v3, v2, :cond_5

    .line 130
    .line 131
    move v5, v7

    .line 132
    goto :goto_1

    .line 133
    :cond_5
    move v5, v4

    .line 134
    :goto_1
    invoke-static {v5, v5}, LFe/g;->a(FF)J

    .line 135
    .line 136
    .line 137
    move-result-wide v19

    .line 138
    if-ne v3, v2, :cond_6

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_6
    move v4, v7

    .line 142
    :goto_2
    invoke-static {v4, v4}, LFe/g;->a(FF)J

    .line 143
    .line 144
    .line 145
    move-result-wide v21

    .line 146
    new-instance v10, Ld0/e;

    .line 147
    .line 148
    iget v13, v1, Ld0/d;->c:F

    .line 149
    .line 150
    iget v14, v1, Ld0/d;->d:F

    .line 151
    .line 152
    iget v11, v1, Ld0/d;->a:F

    .line 153
    .line 154
    iget v12, v1, Ld0/d;->b:F

    .line 155
    .line 156
    invoke-direct/range {v10 .. v22}, Ld0/e;-><init>(FFFFJJJJ)V

    .line 157
    .line 158
    .line 159
    invoke-direct {v8, v10}, Le0/w;-><init>(Ld0/e;)V

    .line 160
    .line 161
    .line 162
    return-object v8

    .line 163
    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    const-string v2, "Corner size in Px can\'t be negative(topStart = "

    .line 166
    .line 167
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v2, ", topEnd = "

    .line 174
    .line 175
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-string v2, ", bottomEnd = "

    .line 182
    .line 183
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string v2, ", bottomStart = "

    .line 190
    .line 191
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    const-string v2, ")!"

    .line 198
    .line 199
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw v2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LH/d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, LH/d;

    .line 12
    .line 13
    iget-object v1, p1, LH/d;->a:LH/a;

    .line 14
    .line 15
    iget-object v3, p0, LH/d;->a:LH/a;

    .line 16
    .line 17
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p1, LH/d;->b:LH/a;

    .line 25
    .line 26
    iget-object v3, p0, LH/d;->b:LH/a;

    .line 27
    .line 28
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p1, LH/d;->c:LH/a;

    .line 36
    .line 37
    iget-object v3, p0, LH/d;->c:LH/a;

    .line 38
    .line 39
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object p1, p1, LH/d;->d:LH/a;

    .line 47
    .line 48
    iget-object v1, p0, LH/d;->d:LH/a;

    .line 49
    .line 50
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, LH/d;->a:LH/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, LH/d;->b:LH/a;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, LH/d;->c:LH/a;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, LH/d;->d:LH/a;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, v0

    .line 34
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "RoundedCornerShape(topStart = "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LH/d;->a:LH/a;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", topEnd = "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LH/d;->b:LH/a;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", bottomEnd = "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, LH/d;->c:LH/a;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", bottomStart = "

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, LH/d;->d:LH/a;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const/16 v1, 0x29

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0
.end method
