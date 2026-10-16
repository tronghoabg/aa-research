.class public final LVa/ja;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Class;

.field public b:Ljava/lang/Class;

.field public c:Ljava/lang/Class;

.field public d:Ljava/util/List;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:Z

.field public n:LVa/r8;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    if-eqz p1, :cond_14

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, LVa/ja;

    .line 12
    .line 13
    if-eq v1, v0, :cond_1

    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_1
    check-cast p1, LVa/ja;

    .line 18
    .line 19
    iget v0, p0, LVa/ja;->e:I

    .line 20
    .line 21
    iget v1, p1, LVa/ja;->e:I

    .line 22
    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    goto/16 :goto_1

    .line 26
    .line 27
    :cond_2
    iget v0, p0, LVa/ja;->f:I

    .line 28
    .line 29
    iget v1, p1, LVa/ja;->f:I

    .line 30
    .line 31
    if-eq v0, v1, :cond_3

    .line 32
    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :cond_3
    iget v0, p0, LVa/ja;->g:I

    .line 36
    .line 37
    iget v1, p1, LVa/ja;->g:I

    .line 38
    .line 39
    if-eq v0, v1, :cond_4

    .line 40
    .line 41
    goto/16 :goto_1

    .line 42
    .line 43
    :cond_4
    iget v0, p0, LVa/ja;->h:I

    .line 44
    .line 45
    iget v1, p1, LVa/ja;->h:I

    .line 46
    .line 47
    if-eq v0, v1, :cond_5

    .line 48
    .line 49
    goto/16 :goto_1

    .line 50
    .line 51
    :cond_5
    iget v0, p0, LVa/ja;->i:I

    .line 52
    .line 53
    iget v1, p1, LVa/ja;->i:I

    .line 54
    .line 55
    if-eq v0, v1, :cond_6

    .line 56
    .line 57
    goto/16 :goto_1

    .line 58
    .line 59
    :cond_6
    iget v0, p0, LVa/ja;->j:I

    .line 60
    .line 61
    iget v1, p1, LVa/ja;->j:I

    .line 62
    .line 63
    if-eq v0, v1, :cond_7

    .line 64
    .line 65
    goto/16 :goto_1

    .line 66
    .line 67
    :cond_7
    iget v0, p0, LVa/ja;->k:I

    .line 68
    .line 69
    iget v1, p1, LVa/ja;->k:I

    .line 70
    .line 71
    if-eq v0, v1, :cond_8

    .line 72
    .line 73
    goto/16 :goto_1

    .line 74
    .line 75
    :cond_8
    iget v0, p0, LVa/ja;->l:I

    .line 76
    .line 77
    iget v1, p1, LVa/ja;->l:I

    .line 78
    .line 79
    if-eq v0, v1, :cond_9

    .line 80
    .line 81
    goto/16 :goto_1

    .line 82
    .line 83
    :cond_9
    iget-boolean v0, p0, LVa/ja;->m:Z

    .line 84
    .line 85
    iget-boolean v1, p1, LVa/ja;->m:Z

    .line 86
    .line 87
    if-eq v0, v1, :cond_a

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_a
    iget-object v0, p0, LVa/ja;->a:Ljava/lang/Class;

    .line 91
    .line 92
    if-eqz v0, :cond_b

    .line 93
    .line 94
    iget-object v1, p1, LVa/ja;->a:Ljava/lang/Class;

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_c

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_b
    iget-object v0, p1, LVa/ja;->a:Ljava/lang/Class;

    .line 104
    .line 105
    if-eqz v0, :cond_c

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_c
    iget-object v0, p0, LVa/ja;->b:Ljava/lang/Class;

    .line 109
    .line 110
    if-eqz v0, :cond_d

    .line 111
    .line 112
    iget-object v1, p1, LVa/ja;->b:Ljava/lang/Class;

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_e

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_d
    iget-object v0, p1, LVa/ja;->b:Ljava/lang/Class;

    .line 122
    .line 123
    if-eqz v0, :cond_e

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_e
    iget-object v0, p0, LVa/ja;->c:Ljava/lang/Class;

    .line 127
    .line 128
    if-eqz v0, :cond_f

    .line 129
    .line 130
    iget-object v1, p1, LVa/ja;->c:Ljava/lang/Class;

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-nez v0, :cond_10

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_f
    iget-object v0, p1, LVa/ja;->c:Ljava/lang/Class;

    .line 140
    .line 141
    if-eqz v0, :cond_10

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_10
    iget-object v0, p0, LVa/ja;->d:Ljava/util/List;

    .line 145
    .line 146
    if-eqz v0, :cond_11

    .line 147
    .line 148
    iget-object v1, p1, LVa/ja;->d:Ljava/util/List;

    .line 149
    .line 150
    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-nez v0, :cond_12

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_11
    iget-object v0, p1, LVa/ja;->d:Ljava/util/List;

    .line 158
    .line 159
    if-eqz v0, :cond_12

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_12
    iget-object v0, p0, LVa/ja;->n:LVa/r8;

    .line 163
    .line 164
    iget-object p1, p1, LVa/ja;->n:LVa/r8;

    .line 165
    .line 166
    if-eqz v0, :cond_13

    .line 167
    .line 168
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    return p1

    .line 173
    :cond_13
    if-nez p1, :cond_14

    .line 174
    .line 175
    :goto_0
    const/4 p1, 0x1

    .line 176
    return p1

    .line 177
    :cond_14
    :goto_1
    const/4 p1, 0x0

    .line 178
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, LVa/ja;->a:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, LVa/ja;->b:Ljava/lang/Class;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v2, v1

    .line 24
    :goto_1
    add-int/2addr v0, v2

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v2, p0, LVa/ja;->c:Ljava/lang/Class;

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move v2, v1

    .line 37
    :goto_2
    add-int/2addr v0, v2

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v2, p0, LVa/ja;->d:Ljava/util/List;

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    move v2, v1

    .line 50
    :goto_3
    add-int/2addr v0, v2

    .line 51
    mul-int/lit8 v0, v0, 0x1f

    .line 52
    .line 53
    iget v2, p0, LVa/ja;->e:I

    .line 54
    .line 55
    add-int/2addr v0, v2

    .line 56
    mul-int/lit8 v0, v0, 0x1f

    .line 57
    .line 58
    iget v2, p0, LVa/ja;->f:I

    .line 59
    .line 60
    add-int/2addr v0, v2

    .line 61
    mul-int/lit8 v0, v0, 0x1f

    .line 62
    .line 63
    iget v2, p0, LVa/ja;->g:I

    .line 64
    .line 65
    add-int/2addr v0, v2

    .line 66
    mul-int/lit8 v0, v0, 0x1f

    .line 67
    .line 68
    iget v2, p0, LVa/ja;->h:I

    .line 69
    .line 70
    add-int/2addr v0, v2

    .line 71
    mul-int/lit8 v0, v0, 0x1f

    .line 72
    .line 73
    iget v2, p0, LVa/ja;->i:I

    .line 74
    .line 75
    add-int/2addr v0, v2

    .line 76
    mul-int/lit8 v0, v0, 0x1f

    .line 77
    .line 78
    iget v2, p0, LVa/ja;->j:I

    .line 79
    .line 80
    add-int/2addr v0, v2

    .line 81
    mul-int/lit8 v0, v0, 0x1f

    .line 82
    .line 83
    iget v2, p0, LVa/ja;->k:I

    .line 84
    .line 85
    add-int/2addr v0, v2

    .line 86
    mul-int/lit8 v0, v0, 0x1f

    .line 87
    .line 88
    iget v2, p0, LVa/ja;->l:I

    .line 89
    .line 90
    add-int/2addr v0, v2

    .line 91
    mul-int/lit8 v0, v0, 0x1f

    .line 92
    .line 93
    iget-boolean v2, p0, LVa/ja;->m:Z

    .line 94
    .line 95
    add-int/2addr v0, v2

    .line 96
    mul-int/lit8 v0, v0, 0x1f

    .line 97
    .line 98
    iget-object v2, p0, LVa/ja;->n:LVa/r8;

    .line 99
    .line 100
    if-eqz v2, :cond_4

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    :cond_4
    add-int/2addr v0, v1

    .line 107
    return v0
.end method
