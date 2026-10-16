.class public LUf/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Luf/a;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LWf/y;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LUf/h;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LUf/h;->c:Ljava/lang/Object;

    .line 5
    iget p1, p1, LWf/d0;->c:I

    iput p1, p0, LUf/h;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LUf/h;->a:I

    iput-object p1, p0, LUf/h;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, LUf/h;->a:I

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUf/h;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, LUf/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, LUf/h;->b:I

    .line 7
    .line 8
    iget-object v1, p0, LUf/h;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, [Ljava/lang/Object;

    .line 11
    .line 12
    array-length v1, v1

    .line 13
    if-ge v0, v1, :cond_0

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
    return v0

    .line 19
    :pswitch_0
    iget v0, p0, LUf/h;->b:I

    .line 20
    .line 21
    iget-object v1, p0, LUf/h;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lff/f;

    .line 24
    .line 25
    invoke-virtual {v1}, Lff/a;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-ge v0, v1, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    :goto_1
    return v0

    .line 35
    :pswitch_1
    iget v0, p0, LUf/h;->b:I

    .line 36
    .line 37
    iget-object v1, p0, LUf/h;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, [S

    .line 40
    .line 41
    array-length v1, v1

    .line 42
    if-ge v0, v1, :cond_2

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/4 v0, 0x0

    .line 47
    :goto_2
    return v0

    .line 48
    :pswitch_2
    iget v0, p0, LUf/h;->b:I

    .line 49
    .line 50
    iget-object v1, p0, LUf/h;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, [J

    .line 53
    .line 54
    array-length v1, v1

    .line 55
    if-ge v0, v1, :cond_3

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    const/4 v0, 0x0

    .line 60
    :goto_3
    return v0

    .line 61
    :pswitch_3
    iget v0, p0, LUf/h;->b:I

    .line 62
    .line 63
    iget-object v1, p0, LUf/h;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, [I

    .line 66
    .line 67
    array-length v1, v1

    .line 68
    if-ge v0, v1, :cond_4

    .line 69
    .line 70
    const/4 v0, 0x1

    .line 71
    goto :goto_4

    .line 72
    :cond_4
    const/4 v0, 0x0

    .line 73
    :goto_4
    return v0

    .line 74
    :pswitch_4
    iget v0, p0, LUf/h;->b:I

    .line 75
    .line 76
    iget-object v1, p0, LUf/h;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, [B

    .line 79
    .line 80
    array-length v1, v1

    .line 81
    if-ge v0, v1, :cond_5

    .line 82
    .line 83
    const/4 v0, 0x1

    .line 84
    goto :goto_5

    .line 85
    :cond_5
    const/4 v0, 0x0

    .line 86
    :goto_5
    return v0

    .line 87
    :pswitch_5
    iget v0, p0, LUf/h;->b:I

    .line 88
    .line 89
    if-lez v0, :cond_6

    .line 90
    .line 91
    const/4 v0, 0x1

    .line 92
    goto :goto_6

    .line 93
    :cond_6
    const/4 v0, 0x0

    .line 94
    :goto_6
    return v0

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LUf/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, LUf/h;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [Ljava/lang/Object;

    .line 9
    .line 10
    iget v1, p0, LUf/h;->b:I

    .line 11
    .line 12
    add-int/lit8 v2, v1, 0x1

    .line 13
    .line 14
    iput v2, p0, LUf/h;->b:I

    .line 15
    .line 16
    aget-object v0, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :catch_0
    move-exception v0

    .line 20
    iget v1, p0, LUf/h;->b:I

    .line 21
    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    iput v1, p0, LUf/h;->b:I

    .line 25
    .line 26
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v1

    .line 36
    :pswitch_0
    invoke-virtual {p0}, LUf/h;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    iget v0, p0, LUf/h;->b:I

    .line 43
    .line 44
    add-int/lit8 v1, v0, 0x1

    .line 45
    .line 46
    iput v1, p0, LUf/h;->b:I

    .line 47
    .line 48
    iget-object v1, p0, LUf/h;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Lff/f;

    .line 51
    .line 52
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0

    .line 57
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :pswitch_1
    iget v0, p0, LUf/h;->b:I

    .line 64
    .line 65
    iget-object v1, p0, LUf/h;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, [S

    .line 68
    .line 69
    array-length v2, v1

    .line 70
    if-ge v0, v2, :cond_1

    .line 71
    .line 72
    add-int/lit8 v2, v0, 0x1

    .line 73
    .line 74
    iput v2, p0, LUf/h;->b:I

    .line 75
    .line 76
    aget-short v0, v1, v0

    .line 77
    .line 78
    new-instance v1, Lef/z;

    .line 79
    .line 80
    invoke-direct {v1, v0}, Lef/z;-><init>(S)V

    .line 81
    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 85
    .line 86
    iget v1, p0, LUf/h;->b:I

    .line 87
    .line 88
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw v0

    .line 96
    :pswitch_2
    iget v0, p0, LUf/h;->b:I

    .line 97
    .line 98
    iget-object v1, p0, LUf/h;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, [J

    .line 101
    .line 102
    array-length v2, v1

    .line 103
    if-ge v0, v2, :cond_2

    .line 104
    .line 105
    add-int/lit8 v2, v0, 0x1

    .line 106
    .line 107
    iput v2, p0, LUf/h;->b:I

    .line 108
    .line 109
    aget-wide v0, v1, v0

    .line 110
    .line 111
    new-instance v2, Lef/w;

    .line 112
    .line 113
    invoke-direct {v2, v0, v1}, Lef/w;-><init>(J)V

    .line 114
    .line 115
    .line 116
    return-object v2

    .line 117
    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 118
    .line 119
    iget v1, p0, LUf/h;->b:I

    .line 120
    .line 121
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v0

    .line 129
    :pswitch_3
    iget v0, p0, LUf/h;->b:I

    .line 130
    .line 131
    iget-object v1, p0, LUf/h;->c:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, [I

    .line 134
    .line 135
    array-length v2, v1

    .line 136
    if-ge v0, v2, :cond_3

    .line 137
    .line 138
    add-int/lit8 v2, v0, 0x1

    .line 139
    .line 140
    iput v2, p0, LUf/h;->b:I

    .line 141
    .line 142
    aget v0, v1, v0

    .line 143
    .line 144
    new-instance v1, Lef/u;

    .line 145
    .line 146
    invoke-direct {v1, v0}, Lef/u;-><init>(I)V

    .line 147
    .line 148
    .line 149
    return-object v1

    .line 150
    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 151
    .line 152
    iget v1, p0, LUf/h;->b:I

    .line 153
    .line 154
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw v0

    .line 162
    :pswitch_4
    iget v0, p0, LUf/h;->b:I

    .line 163
    .line 164
    iget-object v1, p0, LUf/h;->c:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v1, [B

    .line 167
    .line 168
    array-length v2, v1

    .line 169
    if-ge v0, v2, :cond_4

    .line 170
    .line 171
    add-int/lit8 v2, v0, 0x1

    .line 172
    .line 173
    iput v2, p0, LUf/h;->b:I

    .line 174
    .line 175
    aget-byte v0, v1, v0

    .line 176
    .line 177
    new-instance v1, Lef/s;

    .line 178
    .line 179
    invoke-direct {v1, v0}, Lef/s;-><init>(B)V

    .line 180
    .line 181
    .line 182
    return-object v1

    .line 183
    :cond_4
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 184
    .line 185
    iget v1, p0, LUf/h;->b:I

    .line 186
    .line 187
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v0

    .line 195
    :pswitch_5
    iget-object v0, p0, LUf/h;->c:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v0, LWf/y;

    .line 198
    .line 199
    iget v1, p0, LUf/h;->b:I

    .line 200
    .line 201
    add-int/lit8 v2, v1, -0x1

    .line 202
    .line 203
    iput v2, p0, LUf/h;->b:I

    .line 204
    .line 205
    iget v2, v0, LWf/d0;->c:I

    .line 206
    .line 207
    sub-int/2addr v2, v1

    .line 208
    iget-object v0, v0, LWf/d0;->e:[Ljava/lang/String;

    .line 209
    .line 210
    aget-object v0, v0, v2

    .line 211
    .line 212
    return-object v0

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    .line 1
    iget v0, p0, LUf/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v1, "Operation is not supported for read-only collection"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string v1, "Operation is not supported for read-only collection"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :pswitch_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string v1, "Operation is not supported for read-only collection"

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0

    .line 30
    :pswitch_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 31
    .line 32
    const-string v1, "Operation is not supported for read-only collection"

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :pswitch_3
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 39
    .line 40
    const-string v1, "Operation is not supported for read-only collection"

    .line 41
    .line 42
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :pswitch_4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 47
    .line 48
    const-string v1, "Operation is not supported for read-only collection"

    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :pswitch_5
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 55
    .line 56
    const-string v1, "Operation is not supported for read-only collection"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
