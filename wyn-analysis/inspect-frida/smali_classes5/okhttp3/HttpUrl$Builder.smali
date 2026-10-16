.class public final Lokhttp3/HttpUrl$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/HttpUrl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/HttpUrl$Builder$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lokhttp3/HttpUrl$Builder;",
        "",
        "<init>",
        "()V",
        "Companion",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final i:Lokhttp3/HttpUrl$Builder$Companion;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public final f:Ljava/util/ArrayList;

.field public g:Ljava/util/ArrayList;

.field public h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lokhttp3/HttpUrl$Builder$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lokhttp3/HttpUrl$Builder$Companion;-><init>(I)V

    sput-object v0, Lokhttp3/HttpUrl$Builder;->i:Lokhttp3/HttpUrl$Builder$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lokhttp3/HttpUrl$Builder;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lokhttp3/HttpUrl$Builder;->c:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    iput v1, p0, Lokhttp3/HttpUrl$Builder;->e:I

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lokhttp3/HttpUrl$Builder;->f:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()Lokhttp3/HttpUrl;
    .locals 14

    .line 1
    iget-object v1, p0, Lokhttp3/HttpUrl$Builder;->a:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v1, :cond_7

    .line 4
    .line 5
    sget-object v0, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 6
    .line 7
    iget-object v2, p0, Lokhttp3/HttpUrl$Builder;->b:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x7

    .line 11
    invoke-static {v0, v2, v3, v3, v4}, Lokhttp3/HttpUrl$Companion;->e(Lokhttp3/HttpUrl$Companion;Ljava/lang/String;III)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v5, p0, Lokhttp3/HttpUrl$Builder;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v5, v3, v3, v4}, Lokhttp3/HttpUrl$Companion;->e(Lokhttp3/HttpUrl$Companion;Ljava/lang/String;III)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    move v6, v4

    .line 22
    iget-object v4, p0, Lokhttp3/HttpUrl$Builder;->d:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v4, :cond_6

    .line 25
    .line 26
    iget v7, p0, Lokhttp3/HttpUrl$Builder;->e:I

    .line 27
    .line 28
    const/4 v8, -0x1

    .line 29
    if-eq v7, v8, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v7, p0, Lokhttp3/HttpUrl$Builder;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {v7}, Lokhttp3/HttpUrl$Companion;->b(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    :goto_0
    iget-object v0, p0, Lokhttp3/HttpUrl$Builder;->f:Ljava/util/ArrayList;

    .line 45
    .line 46
    move v8, v6

    .line 47
    new-instance v6, Ljava/util/ArrayList;

    .line 48
    .line 49
    const/16 v9, 0xa

    .line 50
    .line 51
    invoke-static {v0, v9}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    invoke-direct {v6, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v10

    .line 66
    if-eqz v10, :cond_1

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    check-cast v10, Ljava/lang/String;

    .line 73
    .line 74
    sget-object v11, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 75
    .line 76
    invoke-static {v11, v10, v3, v3, v8}, Lokhttp3/HttpUrl$Companion;->e(Lokhttp3/HttpUrl$Companion;Ljava/lang/String;III)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    iget-object v0, p0, Lokhttp3/HttpUrl$Builder;->g:Ljava/util/ArrayList;

    .line 85
    .line 86
    const/4 v10, 0x0

    .line 87
    if-nez v0, :cond_2

    .line 88
    .line 89
    move-object v11, v10

    .line 90
    goto :goto_4

    .line 91
    :cond_2
    new-instance v11, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-static {v0, v9}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    invoke-direct {v11, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-eqz v9, :cond_4

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    check-cast v9, Ljava/lang/String;

    .line 115
    .line 116
    if-nez v9, :cond_3

    .line 117
    .line 118
    move-object v9, v10

    .line 119
    goto :goto_3

    .line 120
    :cond_3
    sget-object v12, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 121
    .line 122
    const/4 v13, 0x3

    .line 123
    invoke-static {v12, v9, v3, v3, v13}, Lokhttp3/HttpUrl$Companion;->e(Lokhttp3/HttpUrl$Companion;Ljava/lang/String;III)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    :goto_3
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_4
    :goto_4
    iget-object v0, p0, Lokhttp3/HttpUrl$Builder;->h:Ljava/lang/String;

    .line 132
    .line 133
    if-nez v0, :cond_5

    .line 134
    .line 135
    :goto_5
    move-object v8, v10

    .line 136
    goto :goto_6

    .line 137
    :cond_5
    sget-object v9, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 138
    .line 139
    invoke-static {v9, v0, v3, v3, v8}, Lokhttp3/HttpUrl$Companion;->e(Lokhttp3/HttpUrl$Companion;Ljava/lang/String;III)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    goto :goto_5

    .line 144
    :goto_6
    invoke-virtual {p0}, Lokhttp3/HttpUrl$Builder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    new-instance v0, Lokhttp3/HttpUrl;

    .line 149
    .line 150
    move-object v3, v5

    .line 151
    move v5, v7

    .line 152
    move-object v7, v11

    .line 153
    invoke-direct/range {v0 .. v9}, Lokhttp3/HttpUrl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return-object v0

    .line 157
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 158
    .line 159
    const-string v1, "host == null"

    .line 160
    .line 161
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v0

    .line 165
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 166
    .line 167
    const-string v1, "scheme == null"

    .line 168
    .line 169
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v0
.end method

.method public final b(Lokhttp3/HttpUrl;Ljava/lang/String;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v7, 0x1

    .line 8
    const-string v4, "input"

    .line 9
    .line 10
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object v4, Lokhttp3/internal/Util;->a:[B

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v8, 0x0

    .line 20
    invoke-static {v2, v8, v4}, Lokhttp3/internal/Util;->m(Ljava/lang/String;II)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    invoke-static {v2, v4, v5}, Lokhttp3/internal/Util;->n(Ljava/lang/String;II)I

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    sget-object v5, Lokhttp3/HttpUrl$Builder;->i:Lokhttp3/HttpUrl$Builder$Companion;

    .line 33
    .line 34
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    sub-int v5, v9, v4

    .line 38
    .line 39
    const/16 v10, 0x5b

    .line 40
    .line 41
    const/4 v6, 0x2

    .line 42
    const/16 v11, 0x3a

    .line 43
    .line 44
    const/4 v12, -0x1

    .line 45
    if-ge v5, v6, :cond_1

    .line 46
    .line 47
    :cond_0
    :goto_0
    const/16 v16, 0x6

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    const/16 v13, 0x61

    .line 55
    .line 56
    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->g(II)I

    .line 57
    .line 58
    .line 59
    move-result v14

    .line 60
    const/16 v15, 0x41

    .line 61
    .line 62
    if-ltz v14, :cond_2

    .line 63
    .line 64
    const/16 v14, 0x7a

    .line 65
    .line 66
    invoke-static {v5, v14}, Lkotlin/jvm/internal/k;->g(II)I

    .line 67
    .line 68
    .line 69
    move-result v14

    .line 70
    if-lez v14, :cond_3

    .line 71
    .line 72
    :cond_2
    invoke-static {v5, v15}, Lkotlin/jvm/internal/k;->g(II)I

    .line 73
    .line 74
    .line 75
    move-result v14

    .line 76
    if-ltz v14, :cond_0

    .line 77
    .line 78
    const/16 v14, 0x5a

    .line 79
    .line 80
    invoke-static {v5, v14}, Lkotlin/jvm/internal/k;->g(II)I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-lez v5, :cond_3

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    add-int/lit8 v5, v4, 0x1

    .line 88
    .line 89
    :goto_1
    if-ge v5, v9, :cond_0

    .line 90
    .line 91
    add-int/lit8 v14, v5, 0x1

    .line 92
    .line 93
    const/16 v16, 0x6

    .line 94
    .line 95
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-gt v13, v3, :cond_4

    .line 100
    .line 101
    const/16 v13, 0x7b

    .line 102
    .line 103
    if-ge v3, v13, :cond_4

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    if-gt v15, v3, :cond_5

    .line 107
    .line 108
    if-ge v3, v10, :cond_5

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    const/16 v13, 0x30

    .line 112
    .line 113
    if-gt v13, v3, :cond_6

    .line 114
    .line 115
    if-ge v3, v11, :cond_6

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    const/16 v13, 0x2b

    .line 119
    .line 120
    if-ne v3, v13, :cond_7

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_7
    const/16 v13, 0x2d

    .line 124
    .line 125
    if-ne v3, v13, :cond_8

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_8
    const/16 v13, 0x2e

    .line 129
    .line 130
    if-ne v3, v13, :cond_9

    .line 131
    .line 132
    :goto_2
    move v5, v14

    .line 133
    const/16 v13, 0x61

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_9
    if-ne v3, v11, :cond_a

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_a
    :goto_3
    move v5, v12

    .line 140
    :goto_4
    const-string v13, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 141
    .line 142
    if-eq v5, v12, :cond_d

    .line 143
    .line 144
    const-string v3, "https:"

    .line 145
    .line 146
    invoke-static {v4, v2, v7, v3}, LBf/r;->j0(ILjava/lang/String;ZLjava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_b

    .line 151
    .line 152
    const-string v3, "https"

    .line 153
    .line 154
    iput-object v3, v0, Lokhttp3/HttpUrl$Builder;->a:Ljava/lang/String;

    .line 155
    .line 156
    add-int/lit8 v4, v4, 0x6

    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_b
    const-string v3, "http:"

    .line 160
    .line 161
    invoke-static {v4, v2, v7, v3}, LBf/r;->j0(ILjava/lang/String;ZLjava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-eqz v3, :cond_c

    .line 166
    .line 167
    const-string v3, "http"

    .line 168
    .line 169
    iput-object v3, v0, Lokhttp3/HttpUrl$Builder;->a:Ljava/lang/String;

    .line 170
    .line 171
    add-int/lit8 v4, v4, 0x5

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 175
    .line 176
    new-instance v3, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    const-string v4, "Expected URL scheme \'http\' or \'https\' but was \'"

    .line 179
    .line 180
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v8, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const/16 v2, 0x27

    .line 194
    .line 195
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v1

    .line 206
    :cond_d
    if-eqz v1, :cond_31

    .line 207
    .line 208
    iget-object v3, v1, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 209
    .line 210
    iput-object v3, v0, Lokhttp3/HttpUrl$Builder;->a:Ljava/lang/String;

    .line 211
    .line 212
    :goto_5
    move v3, v4

    .line 213
    move v5, v8

    .line 214
    :goto_6
    const/16 v14, 0x2f

    .line 215
    .line 216
    const/16 v15, 0x5c

    .line 217
    .line 218
    if-ge v3, v9, :cond_f

    .line 219
    .line 220
    add-int/lit8 v16, v3, 0x1

    .line 221
    .line 222
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-eq v3, v15, :cond_e

    .line 227
    .line 228
    if-ne v3, v14, :cond_f

    .line 229
    .line 230
    :cond_e
    add-int/2addr v5, v7

    .line 231
    move/from16 v3, v16

    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_f
    iget-object v3, v0, Lokhttp3/HttpUrl$Builder;->f:Ljava/util/ArrayList;

    .line 235
    .line 236
    const/16 v8, 0x3f

    .line 237
    .line 238
    move/from16 v17, v7

    .line 239
    .line 240
    const/16 v7, 0x23

    .line 241
    .line 242
    if-ge v5, v6, :cond_14

    .line 243
    .line 244
    if-eqz v1, :cond_14

    .line 245
    .line 246
    iget-object v6, v0, Lokhttp3/HttpUrl$Builder;->a:Ljava/lang/String;

    .line 247
    .line 248
    iget-object v10, v1, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 249
    .line 250
    invoke-static {v10, v6}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    if-nez v6, :cond_10

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_10
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->e()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    iput-object v5, v0, Lokhttp3/HttpUrl$Builder;->b:Ljava/lang/String;

    .line 262
    .line 263
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->a()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    iput-object v5, v0, Lokhttp3/HttpUrl$Builder;->c:Ljava/lang/String;

    .line 268
    .line 269
    iget-object v5, v1, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 270
    .line 271
    iput-object v5, v0, Lokhttp3/HttpUrl$Builder;->d:Ljava/lang/String;

    .line 272
    .line 273
    iget v5, v1, Lokhttp3/HttpUrl;->e:I

    .line 274
    .line 275
    iput v5, v0, Lokhttp3/HttpUrl$Builder;->e:I

    .line 276
    .line 277
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->c()Ljava/util/ArrayList;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 285
    .line 286
    .line 287
    if-eq v4, v9, :cond_11

    .line 288
    .line 289
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    if-ne v5, v7, :cond_13

    .line 294
    .line 295
    :cond_11
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->d()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v19

    .line 299
    if-nez v19, :cond_12

    .line 300
    .line 301
    const/4 v1, 0x0

    .line 302
    goto :goto_7

    .line 303
    :cond_12
    sget-object v18, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 304
    .line 305
    const/16 v20, 0x0

    .line 306
    .line 307
    const/16 v23, 0xd3

    .line 308
    .line 309
    const/16 v21, 0x0

    .line 310
    .line 311
    const-string v22, " \"\'<>#"

    .line 312
    .line 313
    invoke-static/range {v18 .. v23}, Lokhttp3/HttpUrl$Companion;->a(Lokhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-static {v1}, Lokhttp3/HttpUrl$Companion;->f(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    :goto_7
    iput-object v1, v0, Lokhttp3/HttpUrl$Builder;->g:Ljava/util/ArrayList;

    .line 322
    .line 323
    :cond_13
    move-object/from16 p1, v3

    .line 324
    .line 325
    goto/16 :goto_12

    .line 326
    .line 327
    :cond_14
    :goto_8
    add-int/2addr v4, v5

    .line 328
    const/4 v10, 0x0

    .line 329
    const/16 v16, 0x0

    .line 330
    .line 331
    :goto_9
    const-string v1, "@/\\?#"

    .line 332
    .line 333
    invoke-static {v2, v1, v4, v9}, Lokhttp3/internal/Util;->f(Ljava/lang/String;Ljava/lang/String;II)I

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    if-eq v1, v9, :cond_15

    .line 338
    .line 339
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    goto :goto_a

    .line 344
    :cond_15
    move v5, v12

    .line 345
    :goto_a
    if-eq v5, v12, :cond_1a

    .line 346
    .line 347
    if-eq v5, v7, :cond_1a

    .line 348
    .line 349
    if-eq v5, v14, :cond_1a

    .line 350
    .line 351
    if-eq v5, v15, :cond_1a

    .line 352
    .line 353
    if-eq v5, v8, :cond_1a

    .line 354
    .line 355
    const/16 v6, 0x40

    .line 356
    .line 357
    if-eq v5, v6, :cond_16

    .line 358
    .line 359
    goto :goto_9

    .line 360
    :cond_16
    const-string v5, "%40"

    .line 361
    .line 362
    if-nez v10, :cond_19

    .line 363
    .line 364
    move-object v6, v3

    .line 365
    move v3, v4

    .line 366
    invoke-static {v2, v11, v3, v1}, Lokhttp3/internal/Util;->e(Ljava/lang/String;CII)I

    .line 367
    .line 368
    .line 369
    move-result v4

    .line 370
    move/from16 v19, v1

    .line 371
    .line 372
    sget-object v1, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 373
    .line 374
    move-object/from16 v20, v6

    .line 375
    .line 376
    const/16 v6, 0xf0

    .line 377
    .line 378
    move-object/from16 v21, v5

    .line 379
    .line 380
    const-string v5, " \"\':;<=>@[]^`{}|/\\?#"

    .line 381
    .line 382
    move/from16 v7, v19

    .line 383
    .line 384
    move-object/from16 p1, v20

    .line 385
    .line 386
    move-object/from16 v8, v21

    .line 387
    .line 388
    invoke-static/range {v1 .. v6}, Lokhttp3/HttpUrl$Companion;->a(Lokhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    if-eqz v16, :cond_17

    .line 393
    .line 394
    new-instance v2, Ljava/lang/StringBuilder;

    .line 395
    .line 396
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 397
    .line 398
    .line 399
    iget-object v5, v0, Lokhttp3/HttpUrl$Builder;->b:Ljava/lang/String;

    .line 400
    .line 401
    invoke-static {v2, v5, v8, v3}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    :cond_17
    iput-object v3, v0, Lokhttp3/HttpUrl$Builder;->b:Ljava/lang/String;

    .line 406
    .line 407
    if-eq v4, v7, :cond_18

    .line 408
    .line 409
    add-int/lit8 v3, v4, 0x1

    .line 410
    .line 411
    const/16 v6, 0xf0

    .line 412
    .line 413
    const-string v5, " \"\':;<=>@[]^`{}|/\\?#"

    .line 414
    .line 415
    move-object/from16 v2, p2

    .line 416
    .line 417
    move v4, v7

    .line 418
    invoke-static/range {v1 .. v6}, Lokhttp3/HttpUrl$Companion;->a(Lokhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    iput-object v1, v0, Lokhttp3/HttpUrl$Builder;->c:Ljava/lang/String;

    .line 423
    .line 424
    move/from16 v10, v17

    .line 425
    .line 426
    goto :goto_b

    .line 427
    :cond_18
    move v4, v7

    .line 428
    :goto_b
    move-object/from16 v2, p2

    .line 429
    .line 430
    move/from16 v16, v17

    .line 431
    .line 432
    goto :goto_c

    .line 433
    :cond_19
    move-object/from16 p1, v3

    .line 434
    .line 435
    move v3, v4

    .line 436
    move-object v8, v5

    .line 437
    move v4, v1

    .line 438
    new-instance v7, Ljava/lang/StringBuilder;

    .line 439
    .line 440
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 441
    .line 442
    .line 443
    iget-object v1, v0, Lokhttp3/HttpUrl$Builder;->c:Ljava/lang/String;

    .line 444
    .line 445
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    sget-object v1, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 452
    .line 453
    const/16 v6, 0xf0

    .line 454
    .line 455
    const-string v5, " \"\':;<=>@[]^`{}|/\\?#"

    .line 456
    .line 457
    move-object/from16 v2, p2

    .line 458
    .line 459
    invoke-static/range {v1 .. v6}, Lokhttp3/HttpUrl$Companion;->a(Lokhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    iput-object v1, v0, Lokhttp3/HttpUrl$Builder;->c:Ljava/lang/String;

    .line 471
    .line 472
    :goto_c
    add-int/lit8 v4, v4, 0x1

    .line 473
    .line 474
    move-object/from16 v3, p1

    .line 475
    .line 476
    const/16 v7, 0x23

    .line 477
    .line 478
    const/16 v8, 0x3f

    .line 479
    .line 480
    goto/16 :goto_9

    .line 481
    .line 482
    :cond_1a
    move-object/from16 p1, v3

    .line 483
    .line 484
    move v7, v4

    .line 485
    move v4, v1

    .line 486
    move v1, v7

    .line 487
    :goto_d
    if-ge v1, v4, :cond_1e

    .line 488
    .line 489
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 490
    .line 491
    .line 492
    move-result v3

    .line 493
    const/16 v5, 0x5b

    .line 494
    .line 495
    if-ne v3, v5, :cond_1c

    .line 496
    .line 497
    :cond_1b
    add-int/lit8 v1, v1, 0x1

    .line 498
    .line 499
    if-ge v1, v4, :cond_1d

    .line 500
    .line 501
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    const/16 v6, 0x5d

    .line 506
    .line 507
    if-ne v3, v6, :cond_1b

    .line 508
    .line 509
    goto :goto_e

    .line 510
    :cond_1c
    if-ne v3, v11, :cond_1d

    .line 511
    .line 512
    move v8, v1

    .line 513
    goto :goto_f

    .line 514
    :cond_1d
    :goto_e
    add-int/lit8 v1, v1, 0x1

    .line 515
    .line 516
    goto :goto_d

    .line 517
    :cond_1e
    move v8, v4

    .line 518
    :goto_f
    add-int/lit8 v3, v8, 0x1

    .line 519
    .line 520
    const/4 v1, 0x4

    .line 521
    const/16 v10, 0x22

    .line 522
    .line 523
    if-ge v3, v4, :cond_21

    .line 524
    .line 525
    sget-object v5, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 526
    .line 527
    invoke-static {v5, v2, v7, v8, v1}, Lokhttp3/HttpUrl$Companion;->e(Lokhttp3/HttpUrl$Companion;Ljava/lang/String;III)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    invoke-static {v1}, Lokhttp3/internal/HostnamesKt;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    iput-object v1, v0, Lokhttp3/HttpUrl$Builder;->d:Ljava/lang/String;

    .line 536
    .line 537
    move-object v1, v5

    .line 538
    :try_start_0
    const-string v5, ""

    .line 539
    .line 540
    const/16 v6, 0xf8

    .line 541
    .line 542
    invoke-static/range {v1 .. v6}, Lokhttp3/HttpUrl$Companion;->a(Lokhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 547
    .line 548
    .line 549
    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 550
    move/from16 v5, v17

    .line 551
    .line 552
    if-gt v5, v1, :cond_1f

    .line 553
    .line 554
    const/high16 v5, 0x10000

    .line 555
    .line 556
    if-ge v1, v5, :cond_1f

    .line 557
    .line 558
    goto :goto_10

    .line 559
    :catch_0
    :cond_1f
    move v1, v12

    .line 560
    :goto_10
    iput v1, v0, Lokhttp3/HttpUrl$Builder;->e:I

    .line 561
    .line 562
    if-eq v1, v12, :cond_20

    .line 563
    .line 564
    goto :goto_11

    .line 565
    :cond_20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 566
    .line 567
    const-string v5, "Invalid URL port: \""

    .line 568
    .line 569
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 590
    .line 591
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    throw v2

    .line 599
    :cond_21
    sget-object v3, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 600
    .line 601
    invoke-static {v3, v2, v7, v8, v1}, Lokhttp3/HttpUrl$Companion;->e(Lokhttp3/HttpUrl$Companion;Ljava/lang/String;III)Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    invoke-static {v1}, Lokhttp3/internal/HostnamesKt;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    iput-object v1, v0, Lokhttp3/HttpUrl$Builder;->d:Ljava/lang/String;

    .line 610
    .line 611
    iget-object v1, v0, Lokhttp3/HttpUrl$Builder;->a:Ljava/lang/String;

    .line 612
    .line 613
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    invoke-static {v1}, Lokhttp3/HttpUrl$Companion;->b(Ljava/lang/String;)I

    .line 617
    .line 618
    .line 619
    move-result v1

    .line 620
    iput v1, v0, Lokhttp3/HttpUrl$Builder;->e:I

    .line 621
    .line 622
    :goto_11
    iget-object v1, v0, Lokhttp3/HttpUrl$Builder;->d:Ljava/lang/String;

    .line 623
    .line 624
    if-eqz v1, :cond_30

    .line 625
    .line 626
    :goto_12
    const-string v1, "?#"

    .line 627
    .line 628
    invoke-static {v2, v1, v4, v9}, Lokhttp3/internal/Util;->f(Ljava/lang/String;Ljava/lang/String;II)I

    .line 629
    .line 630
    .line 631
    move-result v7

    .line 632
    if-ne v4, v7, :cond_23

    .line 633
    .line 634
    :cond_22
    const/16 v17, 0x1

    .line 635
    .line 636
    goto/16 :goto_1b

    .line 637
    .line 638
    :cond_23
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 639
    .line 640
    .line 641
    move-result v1

    .line 642
    const-string v8, ""

    .line 643
    .line 644
    if-eq v1, v14, :cond_24

    .line 645
    .line 646
    if-ne v1, v15, :cond_25

    .line 647
    .line 648
    :cond_24
    move-object/from16 v10, p1

    .line 649
    .line 650
    const/16 v17, 0x1

    .line 651
    .line 652
    goto :goto_13

    .line 653
    :cond_25
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    .line 654
    .line 655
    .line 656
    move-result v1

    .line 657
    const/16 v17, 0x1

    .line 658
    .line 659
    add-int/lit8 v1, v1, -0x1

    .line 660
    .line 661
    move-object/from16 v10, p1

    .line 662
    .line 663
    invoke-virtual {v10, v1, v8}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    goto :goto_14

    .line 667
    :goto_13
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    add-int/lit8 v4, v4, 0x1

    .line 674
    .line 675
    :cond_26
    :goto_14
    move v3, v4

    .line 676
    :goto_15
    if-ge v3, v7, :cond_22

    .line 677
    .line 678
    const-string v1, "/\\"

    .line 679
    .line 680
    invoke-static {v2, v1, v3, v7}, Lokhttp3/internal/Util;->f(Ljava/lang/String;Ljava/lang/String;II)I

    .line 681
    .line 682
    .line 683
    move-result v4

    .line 684
    if-ge v4, v7, :cond_27

    .line 685
    .line 686
    const/4 v11, 0x1

    .line 687
    goto :goto_16

    .line 688
    :cond_27
    const/4 v11, 0x0

    .line 689
    :goto_16
    sget-object v1, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 690
    .line 691
    const/16 v6, 0xf0

    .line 692
    .line 693
    const-string v5, " \"<>^`{}|/\\?#"

    .line 694
    .line 695
    invoke-static/range {v1 .. v6}, Lokhttp3/HttpUrl$Companion;->a(Lokhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    const-string v3, "."

    .line 700
    .line 701
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 702
    .line 703
    .line 704
    move-result v3

    .line 705
    if-nez v3, :cond_2b

    .line 706
    .line 707
    const-string v3, "%2e"

    .line 708
    .line 709
    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 710
    .line 711
    .line 712
    move-result v3

    .line 713
    if-eqz v3, :cond_28

    .line 714
    .line 715
    goto :goto_18

    .line 716
    :cond_28
    const-string v3, ".."

    .line 717
    .line 718
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    move-result v3

    .line 722
    if-nez v3, :cond_2c

    .line 723
    .line 724
    const-string v3, "%2e."

    .line 725
    .line 726
    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 727
    .line 728
    .line 729
    move-result v3

    .line 730
    if-nez v3, :cond_2c

    .line 731
    .line 732
    const-string v3, ".%2e"

    .line 733
    .line 734
    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 735
    .line 736
    .line 737
    move-result v3

    .line 738
    if-nez v3, :cond_2c

    .line 739
    .line 740
    const-string v3, "%2e%2e"

    .line 741
    .line 742
    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 743
    .line 744
    .line 745
    move-result v3

    .line 746
    if-eqz v3, :cond_29

    .line 747
    .line 748
    goto :goto_19

    .line 749
    :cond_29
    const/4 v5, 0x1

    .line 750
    invoke-static {v10, v5}, Lka/n;->e(Ljava/util/ArrayList;I)Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v3

    .line 754
    check-cast v3, Ljava/lang/CharSequence;

    .line 755
    .line 756
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 757
    .line 758
    .line 759
    move-result v3

    .line 760
    if-nez v3, :cond_2a

    .line 761
    .line 762
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 763
    .line 764
    .line 765
    move-result v3

    .line 766
    sub-int/2addr v3, v5

    .line 767
    invoke-virtual {v10, v3, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    goto :goto_17

    .line 771
    :cond_2a
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 772
    .line 773
    .line 774
    :goto_17
    if-eqz v11, :cond_2b

    .line 775
    .line 776
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 777
    .line 778
    .line 779
    :cond_2b
    :goto_18
    const/16 v17, 0x1

    .line 780
    .line 781
    goto :goto_1a

    .line 782
    :cond_2c
    :goto_19
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 783
    .line 784
    .line 785
    move-result v1

    .line 786
    const/16 v17, 0x1

    .line 787
    .line 788
    add-int/lit8 v1, v1, -0x1

    .line 789
    .line 790
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v1

    .line 794
    check-cast v1, Ljava/lang/String;

    .line 795
    .line 796
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 797
    .line 798
    .line 799
    move-result v1

    .line 800
    if-nez v1, :cond_2d

    .line 801
    .line 802
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 803
    .line 804
    .line 805
    move-result v1

    .line 806
    if-nez v1, :cond_2d

    .line 807
    .line 808
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 809
    .line 810
    .line 811
    move-result v1

    .line 812
    add-int/lit8 v1, v1, -0x1

    .line 813
    .line 814
    invoke-virtual {v10, v1, v8}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    goto :goto_1a

    .line 818
    :cond_2d
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    :goto_1a
    if-eqz v11, :cond_26

    .line 822
    .line 823
    add-int/lit8 v3, v4, 0x1

    .line 824
    .line 825
    goto/16 :goto_15

    .line 826
    .line 827
    :goto_1b
    if-ge v7, v9, :cond_2e

    .line 828
    .line 829
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    .line 830
    .line 831
    .line 832
    move-result v1

    .line 833
    const/16 v3, 0x3f

    .line 834
    .line 835
    if-ne v1, v3, :cond_2e

    .line 836
    .line 837
    const/16 v1, 0x23

    .line 838
    .line 839
    invoke-static {v2, v1, v7, v9}, Lokhttp3/internal/Util;->e(Ljava/lang/String;CII)I

    .line 840
    .line 841
    .line 842
    move-result v4

    .line 843
    sget-object v1, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 844
    .line 845
    add-int/lit8 v3, v7, 0x1

    .line 846
    .line 847
    const/16 v6, 0xd0

    .line 848
    .line 849
    const-string v5, " \"\'<>#"

    .line 850
    .line 851
    invoke-static/range {v1 .. v6}, Lokhttp3/HttpUrl$Companion;->a(Lokhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v1

    .line 855
    invoke-static {v1}, Lokhttp3/HttpUrl$Companion;->f(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 856
    .line 857
    .line 858
    move-result-object v1

    .line 859
    iput-object v1, v0, Lokhttp3/HttpUrl$Builder;->g:Ljava/util/ArrayList;

    .line 860
    .line 861
    move v7, v4

    .line 862
    :cond_2e
    if-ge v7, v9, :cond_2f

    .line 863
    .line 864
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    .line 865
    .line 866
    .line 867
    move-result v1

    .line 868
    const/16 v3, 0x23

    .line 869
    .line 870
    if-ne v1, v3, :cond_2f

    .line 871
    .line 872
    sget-object v1, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 873
    .line 874
    const/16 v17, 0x1

    .line 875
    .line 876
    add-int/lit8 v3, v7, 0x1

    .line 877
    .line 878
    const/16 v6, 0xb0

    .line 879
    .line 880
    const-string v5, ""

    .line 881
    .line 882
    move v4, v9

    .line 883
    invoke-static/range {v1 .. v6}, Lokhttp3/HttpUrl$Companion;->a(Lokhttp3/HttpUrl$Companion;Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v1

    .line 887
    iput-object v1, v0, Lokhttp3/HttpUrl$Builder;->h:Ljava/lang/String;

    .line 888
    .line 889
    :cond_2f
    return-void

    .line 890
    :cond_30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 891
    .line 892
    const-string v3, "Invalid URL host: \""

    .line 893
    .line 894
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 895
    .line 896
    .line 897
    invoke-virtual {v2, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 898
    .line 899
    .line 900
    move-result-object v2

    .line 901
    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 905
    .line 906
    .line 907
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 908
    .line 909
    .line 910
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v1

    .line 914
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 915
    .line 916
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    move-result-object v1

    .line 920
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    throw v2

    .line 924
    :cond_31
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 925
    .line 926
    .line 927
    move-result v1

    .line 928
    move/from16 v3, v16

    .line 929
    .line 930
    if-le v1, v3, :cond_32

    .line 931
    .line 932
    invoke-static {v3, v2}, LBf/k;->T0(ILjava/lang/String;)Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v1

    .line 936
    const-string v2, "..."

    .line 937
    .line 938
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 939
    .line 940
    .line 941
    move-result-object v1

    .line 942
    goto :goto_1c

    .line 943
    :cond_32
    move-object v1, v2

    .line 944
    :goto_1c
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 945
    .line 946
    const-string v3, "Expected URL scheme \'http\' or \'https\' but no scheme was found for "

    .line 947
    .line 948
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 949
    .line 950
    .line 951
    move-result-object v1

    .line 952
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 953
    .line 954
    .line 955
    throw v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lokhttp3/HttpUrl$Builder;->a:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "://"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v1, "//"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object v1, p0, Lokhttp3/HttpUrl$Builder;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/16 v2, 0x3a

    .line 31
    .line 32
    if-lez v1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object v1, p0, Lokhttp3/HttpUrl$Builder;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-lez v1, :cond_3

    .line 42
    .line 43
    :goto_1
    iget-object v1, p0, Lokhttp3/HttpUrl$Builder;->b:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lokhttp3/HttpUrl$Builder;->c:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-lez v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lokhttp3/HttpUrl$Builder;->c:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :cond_2
    const/16 v1, 0x40

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    :cond_3
    iget-object v1, p0, Lokhttp3/HttpUrl$Builder;->d:Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    invoke-static {v1, v2}, LBf/k;->o0(Ljava/lang/CharSequence;C)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    const/16 v1, 0x5b

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lokhttp3/HttpUrl$Builder;->d:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const/16 v1, 0x5d

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    iget-object v1, p0, Lokhttp3/HttpUrl$Builder;->d:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    :cond_5
    :goto_2
    iget v1, p0, Lokhttp3/HttpUrl$Builder;->e:I

    .line 101
    .line 102
    const/4 v3, -0x1

    .line 103
    if-ne v1, v3, :cond_6

    .line 104
    .line 105
    iget-object v4, p0, Lokhttp3/HttpUrl$Builder;->a:Ljava/lang/String;

    .line 106
    .line 107
    if-eqz v4, :cond_9

    .line 108
    .line 109
    :cond_6
    if-eq v1, v3, :cond_7

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_7
    sget-object v1, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 113
    .line 114
    iget-object v3, p0, Lokhttp3/HttpUrl$Builder;->a:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-static {v3}, Lokhttp3/HttpUrl$Companion;->b(Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    :goto_3
    iget-object v3, p0, Lokhttp3/HttpUrl$Builder;->a:Ljava/lang/String;

    .line 127
    .line 128
    if-eqz v3, :cond_8

    .line 129
    .line 130
    sget-object v4, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-static {v3}, Lokhttp3/HttpUrl$Companion;->b(Ljava/lang/String;)I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-eq v1, v3, :cond_9

    .line 140
    .line 141
    :cond_8
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    :cond_9
    sget-object v1, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 148
    .line 149
    iget-object v2, p0, Lokhttp3/HttpUrl$Builder;->f:Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    const-string v1, "<this>"

    .line 155
    .line 156
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    const/4 v3, 0x0

    .line 164
    :goto_4
    if-ge v3, v1, :cond_a

    .line 165
    .line 166
    add-int/lit8 v4, v3, 0x1

    .line 167
    .line 168
    const/16 v5, 0x2f

    .line 169
    .line 170
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    check-cast v3, Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    move v3, v4

    .line 183
    goto :goto_4

    .line 184
    :cond_a
    iget-object v1, p0, Lokhttp3/HttpUrl$Builder;->g:Ljava/util/ArrayList;

    .line 185
    .line 186
    if-eqz v1, :cond_b

    .line 187
    .line 188
    const/16 v1, 0x3f

    .line 189
    .line 190
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    sget-object v1, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 194
    .line 195
    iget-object v2, p0, Lokhttp3/HttpUrl$Builder;->g:Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-static {v2, v0}, Lokhttp3/HttpUrl$Companion;->g(Ljava/util/ArrayList;Ljava/lang/StringBuilder;)V

    .line 204
    .line 205
    .line 206
    :cond_b
    iget-object v1, p0, Lokhttp3/HttpUrl$Builder;->h:Ljava/lang/String;

    .line 207
    .line 208
    if-eqz v1, :cond_c

    .line 209
    .line 210
    const/16 v1, 0x23

    .line 211
    .line 212
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    iget-object v1, p0, Lokhttp3/HttpUrl$Builder;->h:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    :cond_c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    const-string v1, "StringBuilder().apply(builderAction).toString()"

    .line 225
    .line 226
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    return-object v0
.end method
