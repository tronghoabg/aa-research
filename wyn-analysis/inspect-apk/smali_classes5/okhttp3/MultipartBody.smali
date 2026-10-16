.class public final Lokhttp3/MultipartBody;
.super Lokhttp3/RequestBody;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/MultipartBody$Part;,
        Lokhttp3/MultipartBody$Builder;,
        Lokhttp3/MultipartBody$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lokhttp3/MultipartBody;",
        "Lokhttp3/RequestBody;",
        "Builder",
        "Companion",
        "Part",
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
.field public static final g:Lokhttp3/MediaType;

.field public static final h:Lokhttp3/MediaType;

.field public static final i:[B

.field public static final j:[B

.field public static final k:[B


# instance fields
.field public final c:Lcg/j;

.field public final d:Ljava/util/List;

.field public final e:Lokhttp3/MediaType;

.field public f:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/MultipartBody$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/MultipartBody$Companion;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lokhttp3/MediaType;->d:Lokhttp3/MediaType$Companion;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v0, "multipart/mixed"

    .line 13
    .line 14
    invoke-static {v0}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lokhttp3/MultipartBody;->g:Lokhttp3/MediaType;

    .line 19
    .line 20
    const-string v0, "multipart/alternative"

    .line 21
    .line 22
    invoke-static {v0}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 23
    .line 24
    .line 25
    const-string v0, "multipart/digest"

    .line 26
    .line 27
    invoke-static {v0}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 28
    .line 29
    .line 30
    const-string v0, "multipart/parallel"

    .line 31
    .line 32
    invoke-static {v0}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 33
    .line 34
    .line 35
    const-string v0, "multipart/form-data"

    .line 36
    .line 37
    invoke-static {v0}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lokhttp3/MultipartBody;->h:Lokhttp3/MediaType;

    .line 42
    .line 43
    const/4 v0, 0x2

    .line 44
    new-array v1, v0, [B

    .line 45
    .line 46
    fill-array-data v1, :array_0

    .line 47
    .line 48
    .line 49
    sput-object v1, Lokhttp3/MultipartBody;->i:[B

    .line 50
    .line 51
    new-array v1, v0, [B

    .line 52
    .line 53
    fill-array-data v1, :array_1

    .line 54
    .line 55
    .line 56
    sput-object v1, Lokhttp3/MultipartBody;->j:[B

    .line 57
    .line 58
    new-array v0, v0, [B

    .line 59
    .line 60
    fill-array-data v0, :array_2

    .line 61
    .line 62
    .line 63
    sput-object v0, Lokhttp3/MultipartBody;->k:[B

    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :array_0
    .array-data 1
        0x3at
        0x20t
    .end array-data

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    nop

    .line 73
    :array_1
    .array-data 1
        0xdt
        0xat
    .end array-data

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    nop

    .line 79
    :array_2
    .array-data 1
        0x2dt
        0x2dt
    .end array-data
.end method

.method public constructor <init>(Lcg/j;Lokhttp3/MediaType;Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "boundaryByteString"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "type"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lokhttp3/RequestBody;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lokhttp3/MultipartBody;->c:Lcg/j;

    .line 15
    .line 16
    iput-object p3, p0, Lokhttp3/MultipartBody;->d:Ljava/util/List;

    .line 17
    .line 18
    sget-object p3, Lokhttp3/MediaType;->d:Lokhttp3/MediaType$Companion;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p2, "; boundary="

    .line 29
    .line 30
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcg/j;->t()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lokhttp3/MultipartBody;->e:Lokhttp3/MediaType;

    .line 52
    .line 53
    const-wide/16 p1, -0x1

    .line 54
    .line 55
    iput-wide p1, p0, Lokhttp3/MultipartBody;->f:J

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final a(Lcg/h;Z)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    new-instance v1, Lcg/g;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    move-object v2, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    move-object v2, v1

    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    :goto_0
    iget-object v3, v0, Lokhttp3/MultipartBody;->d:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const-wide/16 v6, 0x0

    .line 23
    .line 24
    const/4 v8, 0x0

    .line 25
    :goto_1
    iget-object v9, v0, Lokhttp3/MultipartBody;->c:Lcg/j;

    .line 26
    .line 27
    sget-object v10, Lokhttp3/MultipartBody;->k:[B

    .line 28
    .line 29
    sget-object v11, Lokhttp3/MultipartBody;->j:[B

    .line 30
    .line 31
    if-ge v8, v4, :cond_6

    .line 32
    .line 33
    add-int/lit8 v12, v8, 0x1

    .line 34
    .line 35
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    check-cast v8, Lokhttp3/MultipartBody$Part;

    .line 40
    .line 41
    iget-object v13, v8, Lokhttp3/MultipartBody$Part;->a:Lokhttp3/Headers;

    .line 42
    .line 43
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v1, v10}, Lcg/h;->write([B)Lcg/h;

    .line 47
    .line 48
    .line 49
    invoke-interface {v1, v9}, Lcg/h;->u(Lcg/j;)Lcg/h;

    .line 50
    .line 51
    .line 52
    invoke-interface {v1, v11}, Lcg/h;->write([B)Lcg/h;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v13}, Lokhttp3/Headers;->size()I

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    const/4 v10, 0x0

    .line 60
    :goto_2
    if-ge v10, v9, :cond_1

    .line 61
    .line 62
    add-int/lit8 v14, v10, 0x1

    .line 63
    .line 64
    invoke-virtual {v13, v10}, Lokhttp3/Headers;->c(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v15

    .line 68
    invoke-interface {v1, v15}, Lcg/h;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 69
    .line 70
    .line 71
    move-result-object v15

    .line 72
    sget-object v5, Lokhttp3/MultipartBody;->i:[B

    .line 73
    .line 74
    invoke-interface {v15, v5}, Lcg/h;->write([B)Lcg/h;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v13, v10}, Lokhttp3/Headers;->f(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    invoke-interface {v5, v10}, Lcg/h;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-interface {v5, v11}, Lcg/h;->write([B)Lcg/h;

    .line 87
    .line 88
    .line 89
    move v10, v14

    .line 90
    goto :goto_2

    .line 91
    :cond_1
    iget-object v5, v8, Lokhttp3/MultipartBody$Part;->b:Lokhttp3/RequestBody;

    .line 92
    .line 93
    invoke-virtual {v5}, Lokhttp3/RequestBody;->contentType()Lokhttp3/MediaType;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    if-eqz v8, :cond_2

    .line 98
    .line 99
    const-string v9, "Content-Type: "

    .line 100
    .line 101
    invoke-interface {v1, v9}, Lcg/h;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    iget-object v8, v8, Lokhttp3/MediaType;->a:Ljava/lang/String;

    .line 106
    .line 107
    invoke-interface {v9, v8}, Lcg/h;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-interface {v8, v11}, Lcg/h;->write([B)Lcg/h;

    .line 112
    .line 113
    .line 114
    :cond_2
    invoke-virtual {v5}, Lokhttp3/RequestBody;->contentLength()J

    .line 115
    .line 116
    .line 117
    move-result-wide v8

    .line 118
    const-wide/16 v13, -0x1

    .line 119
    .line 120
    cmp-long v10, v8, v13

    .line 121
    .line 122
    if-eqz v10, :cond_3

    .line 123
    .line 124
    const-string v10, "Content-Length: "

    .line 125
    .line 126
    invoke-interface {v1, v10}, Lcg/h;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    invoke-interface {v10, v8, v9}, Lcg/h;->writeDecimalLong(J)Lcg/h;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    invoke-interface {v10, v11}, Lcg/h;->write([B)Lcg/h;

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_3
    if-eqz p2, :cond_4

    .line 139
    .line 140
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Lcg/g;->a()V

    .line 144
    .line 145
    .line 146
    return-wide v13

    .line 147
    :cond_4
    :goto_3
    invoke-interface {v1, v11}, Lcg/h;->write([B)Lcg/h;

    .line 148
    .line 149
    .line 150
    if-eqz p2, :cond_5

    .line 151
    .line 152
    add-long/2addr v6, v8

    .line 153
    goto :goto_4

    .line 154
    :cond_5
    invoke-virtual {v5, v1}, Lokhttp3/RequestBody;->writeTo(Lcg/h;)V

    .line 155
    .line 156
    .line 157
    :goto_4
    invoke-interface {v1, v11}, Lcg/h;->write([B)Lcg/h;

    .line 158
    .line 159
    .line 160
    move v8, v12

    .line 161
    goto/16 :goto_1

    .line 162
    .line 163
    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-interface {v1, v10}, Lcg/h;->write([B)Lcg/h;

    .line 167
    .line 168
    .line 169
    invoke-interface {v1, v9}, Lcg/h;->u(Lcg/j;)Lcg/h;

    .line 170
    .line 171
    .line 172
    invoke-interface {v1, v10}, Lcg/h;->write([B)Lcg/h;

    .line 173
    .line 174
    .line 175
    invoke-interface {v1, v11}, Lcg/h;->write([B)Lcg/h;

    .line 176
    .line 177
    .line 178
    if-eqz p2, :cond_7

    .line 179
    .line 180
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    iget-wide v3, v2, Lcg/g;->b:J

    .line 184
    .line 185
    add-long/2addr v6, v3

    .line 186
    invoke-virtual {v2}, Lcg/g;->a()V

    .line 187
    .line 188
    .line 189
    :cond_7
    return-wide v6
.end method

.method public final contentLength()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lokhttp3/MultipartBody;->f:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {p0, v0, v1}, Lokhttp3/MultipartBody;->a(Lcg/h;Z)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, Lokhttp3/MultipartBody;->f:J

    .line 16
    .line 17
    :cond_0
    return-wide v0
.end method

.method public final contentType()Lokhttp3/MediaType;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/MultipartBody;->e:Lokhttp3/MediaType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final writeTo(Lcg/h;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lokhttp3/MultipartBody;->a(Lcg/h;Z)J

    .line 3
    .line 4
    .line 5
    return-void
.end method
