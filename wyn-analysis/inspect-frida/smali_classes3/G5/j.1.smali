.class public final LG5/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:LG5/j;

.field public static final d:LG5/j;

.field public static final e:Ll8/j0;


# instance fields
.field public final a:[I

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, LG5/j;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    filled-new-array {v1}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const/16 v3, 0x8

    .line 9
    .line 10
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    invoke-direct {v0, v3, v2}, LG5/j;-><init>(I[I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LG5/j;->c:LG5/j;

    .line 18
    .line 19
    new-instance v0, LG5/j;

    .line 20
    .line 21
    const/4 v2, 0x6

    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    const/4 v6, 0x5

    .line 27
    filled-new-array {v1, v6, v2}, [I

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-direct {v0, v3, v1}, LG5/j;-><init>(I[I)V

    .line 32
    .line 33
    .line 34
    sput-object v0, LG5/j;->d:LG5/j;

    .line 35
    .line 36
    new-instance v0, LE4/n;

    .line 37
    .line 38
    const/4 v1, 0x4

    .line 39
    const/16 v2, 0x12

    .line 40
    .line 41
    invoke-direct {v0, v1, v2}, LE4/n;-><init>(II)V

    .line 42
    .line 43
    .line 44
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1, v5}, LE4/n;->v(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const/16 v1, 0x11

    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1, v5}, LE4/n;->v(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    const/4 v1, 0x7

    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0, v1, v5}, LE4/n;->v(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const/16 v1, 0x12

    .line 69
    .line 70
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, v1, v5}, LE4/n;->v(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v5, v4}, LE4/n;->v(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v4, v4}, LE4/n;->v(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    const/16 v1, 0xe

    .line 84
    .line 85
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0, v1, v4}, LE4/n;->v(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, LE4/n;->e()Ll8/j0;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    sput-object v0, LG5/j;->e:Ll8/j0;

    .line 97
    .line 98
    return-void
.end method

.method public constructor <init>(I[I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    array-length v0, p2

    .line 7
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iput-object p2, p0, LG5/j;->a:[I

    .line 12
    .line 13
    invoke-static {p2}, Ljava/util/Arrays;->sort([I)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p2, 0x0

    .line 18
    new-array p2, p2, [I

    .line 19
    .line 20
    iput-object p2, p0, LG5/j;->a:[I

    .line 21
    .line 22
    :goto_0
    iput p1, p0, LG5/j;->b:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(LE5/T;)Landroid/util/Pair;
    .locals 9

    .line 1
    iget-object v0, p1, LE5/T;->l:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, LE5/T;->i:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0, v1}, Lu6/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, LG5/j;->e:Ll8/j0;

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Ll8/j0;->containsKey(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v3, 0x0

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    goto/16 :goto_7

    .line 26
    .line 27
    :cond_0
    iget-object v1, p0, LG5/j;->a:[I

    .line 28
    .line 29
    const/4 v4, 0x7

    .line 30
    const/4 v5, 0x6

    .line 31
    const/16 v6, 0x8

    .line 32
    .line 33
    const/16 v7, 0x12

    .line 34
    .line 35
    if-ne v0, v7, :cond_2

    .line 36
    .line 37
    invoke-static {v1, v7}, Ljava/util/Arrays;->binarySearch([II)I

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-ltz v8, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move v0, v5

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    if-ne v0, v6, :cond_4

    .line 47
    .line 48
    invoke-static {v1, v6}, Ljava/util/Arrays;->binarySearch([II)I

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-ltz v8, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    move v0, v4

    .line 56
    :cond_4
    :goto_1
    invoke-static {v1, v0}, Ljava/util/Arrays;->binarySearch([II)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-ltz v1, :cond_10

    .line 61
    .line 62
    const/4 v1, -0x1

    .line 63
    iget v8, p1, LE5/T;->y:I

    .line 64
    .line 65
    if-eq v8, v1, :cond_6

    .line 66
    .line 67
    if-ne v0, v7, :cond_5

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    iget p1, p0, LG5/j;->b:I

    .line 71
    .line 72
    if-le v8, p1, :cond_a

    .line 73
    .line 74
    goto :goto_7

    .line 75
    :cond_6
    :goto_2
    iget p1, p1, LE5/T;->z:I

    .line 76
    .line 77
    if-eq p1, v1, :cond_7

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_7
    const p1, 0xbb80

    .line 81
    .line 82
    .line 83
    :goto_3
    sget v1, Lu6/v;->a:I

    .line 84
    .line 85
    const/16 v7, 0x1d

    .line 86
    .line 87
    if-lt v1, v7, :cond_8

    .line 88
    .line 89
    invoke-static {v0, p1}, LG5/i;->b(II)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    :goto_4
    move v8, p1

    .line 94
    goto :goto_5

    .line 95
    :cond_8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    const/4 v1, 0x0

    .line 100
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v2, p1}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-eqz p1, :cond_9

    .line 109
    .line 110
    move-object v1, p1

    .line 111
    :cond_9
    check-cast v1, Ljava/lang/Integer;

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    goto :goto_4

    .line 118
    :cond_a
    :goto_5
    sget p1, Lu6/v;->a:I

    .line 119
    .line 120
    const/16 v1, 0x1c

    .line 121
    .line 122
    if-gt p1, v1, :cond_c

    .line 123
    .line 124
    if-ne v8, v4, :cond_b

    .line 125
    .line 126
    move v5, v6

    .line 127
    goto :goto_6

    .line 128
    :cond_b
    const/4 v1, 0x3

    .line 129
    if-eq v8, v1, :cond_d

    .line 130
    .line 131
    const/4 v1, 0x4

    .line 132
    if-eq v8, v1, :cond_d

    .line 133
    .line 134
    const/4 v1, 0x5

    .line 135
    if-ne v8, v1, :cond_c

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_c
    move v5, v8

    .line 139
    :cond_d
    :goto_6
    const/16 v1, 0x1a

    .line 140
    .line 141
    if-gt p1, v1, :cond_e

    .line 142
    .line 143
    const-string p1, "fugu"

    .line 144
    .line 145
    sget-object v1, Lu6/v;->b:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-eqz p1, :cond_e

    .line 152
    .line 153
    const/4 p1, 0x1

    .line 154
    if-ne v5, p1, :cond_e

    .line 155
    .line 156
    const/4 v5, 0x2

    .line 157
    :cond_e
    invoke-static {v5}, Lu6/v;->k(I)I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-nez p1, :cond_f

    .line 162
    .line 163
    :goto_7
    return-object v3

    .line 164
    :cond_f
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-static {v0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    return-object p1

    .line 177
    :cond_10
    return-object v3
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
    instance-of v1, p1, LG5/j;

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
    check-cast p1, LG5/j;

    .line 12
    .line 13
    iget-object v1, p1, LG5/j;->a:[I

    .line 14
    .line 15
    iget-object v3, p0, LG5/j;->a:[I

    .line 16
    .line 17
    invoke-static {v3, v1}, Ljava/util/Arrays;->equals([I[I)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget v1, p0, LG5/j;->b:I

    .line 24
    .line 25
    iget p1, p1, LG5/j;->b:I

    .line 26
    .line 27
    if-ne v1, p1, :cond_2

    .line 28
    .line 29
    return v0

    .line 30
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, LG5/j;->a:[I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, LG5/j;->b:I

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AudioCapabilities[maxChannelCount="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, LG5/j;->b:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", supportedEncodings="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LG5/j;->a:[I

    .line 19
    .line 20
    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, "]"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method
