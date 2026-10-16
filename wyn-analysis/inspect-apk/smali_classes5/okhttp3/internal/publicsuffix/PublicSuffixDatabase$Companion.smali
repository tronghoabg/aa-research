.class public final Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000c\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00088\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "EXCEPTION_MARKER",
        "C",
        "",
        "",
        "PREVAILING_RULE",
        "Ljava/util/List;",
        "PUBLIC_SUFFIX_RESOURCE",
        "Ljava/lang/String;",
        "",
        "WILDCARD_LABEL",
        "[B",
        "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;",
        "instance",
        "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;-><init>()V

    return-void
.end method

.method public static final a(Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;[B[[BI)Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    array-length v4, v0

    .line 11
    const/4 v5, 0x0

    .line 12
    move v6, v5

    .line 13
    :goto_0
    if-ge v6, v4, :cond_c

    .line 14
    .line 15
    add-int v7, v6, v4

    .line 16
    .line 17
    div-int/lit8 v7, v7, 0x2

    .line 18
    .line 19
    :goto_1
    const/16 v8, 0xa

    .line 20
    .line 21
    if-le v7, v2, :cond_0

    .line 22
    .line 23
    aget-byte v9, v0, v7

    .line 24
    .line 25
    if-eq v9, v8, :cond_0

    .line 26
    .line 27
    add-int/2addr v7, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    add-int/lit8 v9, v7, 0x1

    .line 30
    .line 31
    move v10, v3

    .line 32
    :goto_2
    add-int v11, v9, v10

    .line 33
    .line 34
    aget-byte v12, v0, v11

    .line 35
    .line 36
    if-eq v12, v8, :cond_1

    .line 37
    .line 38
    add-int/2addr v10, v3

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    sub-int v8, v11, v9

    .line 41
    .line 42
    move/from16 v12, p3

    .line 43
    .line 44
    move v10, v5

    .line 45
    move v13, v10

    .line 46
    move v14, v13

    .line 47
    :goto_3
    if-eqz v10, :cond_2

    .line 48
    .line 49
    const/16 v10, 0x2e

    .line 50
    .line 51
    move v15, v5

    .line 52
    goto :goto_4

    .line 53
    :cond_2
    aget-object v15, v1, v12

    .line 54
    .line 55
    aget-byte v15, v15, v13

    .line 56
    .line 57
    sget-object v16, Lokhttp3/internal/Util;->a:[B

    .line 58
    .line 59
    and-int/lit16 v15, v15, 0xff

    .line 60
    .line 61
    move/from16 v17, v15

    .line 62
    .line 63
    move v15, v10

    .line 64
    move/from16 v10, v17

    .line 65
    .line 66
    :goto_4
    add-int v16, v9, v14

    .line 67
    .line 68
    aget-byte v2, v0, v16

    .line 69
    .line 70
    sget-object v16, Lokhttp3/internal/Util;->a:[B

    .line 71
    .line 72
    and-int/lit16 v2, v2, 0xff

    .line 73
    .line 74
    sub-int/2addr v10, v2

    .line 75
    if-eqz v10, :cond_3

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_3
    add-int/2addr v14, v3

    .line 79
    add-int/2addr v13, v3

    .line 80
    if-ne v14, v8, :cond_4

    .line 81
    .line 82
    goto :goto_5

    .line 83
    :cond_4
    aget-object v2, v1, v12

    .line 84
    .line 85
    array-length v2, v2

    .line 86
    if-ne v2, v13, :cond_b

    .line 87
    .line 88
    array-length v2, v1

    .line 89
    sub-int/2addr v2, v3

    .line 90
    if-ne v12, v2, :cond_a

    .line 91
    .line 92
    :goto_5
    if-gez v10, :cond_5

    .line 93
    .line 94
    :goto_6
    move v4, v7

    .line 95
    :goto_7
    const/4 v2, -0x1

    .line 96
    goto :goto_0

    .line 97
    :cond_5
    if-lez v10, :cond_6

    .line 98
    .line 99
    :goto_8
    add-int/lit8 v6, v11, 0x1

    .line 100
    .line 101
    goto :goto_7

    .line 102
    :cond_6
    sub-int v2, v8, v14

    .line 103
    .line 104
    aget-object v10, v1, v12

    .line 105
    .line 106
    array-length v10, v10

    .line 107
    sub-int/2addr v10, v13

    .line 108
    add-int/2addr v12, v3

    .line 109
    array-length v13, v1

    .line 110
    :goto_9
    if-ge v12, v13, :cond_7

    .line 111
    .line 112
    add-int/lit8 v14, v12, 0x1

    .line 113
    .line 114
    aget-object v12, v1, v12

    .line 115
    .line 116
    array-length v12, v12

    .line 117
    add-int/2addr v10, v12

    .line 118
    move v12, v14

    .line 119
    goto :goto_9

    .line 120
    :cond_7
    if-ge v10, v2, :cond_8

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_8
    if-le v10, v2, :cond_9

    .line 124
    .line 125
    goto :goto_8

    .line 126
    :cond_9
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 127
    .line 128
    const-string v2, "UTF_8"

    .line 129
    .line 130
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    new-instance v2, Ljava/lang/String;

    .line 134
    .line 135
    invoke-direct {v2, v0, v9, v8, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 136
    .line 137
    .line 138
    return-object v2

    .line 139
    :cond_a
    add-int/2addr v12, v3

    .line 140
    move v10, v3

    .line 141
    const/4 v2, -0x1

    .line 142
    const/4 v13, -0x1

    .line 143
    goto :goto_3

    .line 144
    :cond_b
    move v10, v15

    .line 145
    const/4 v2, -0x1

    .line 146
    goto :goto_3

    .line 147
    :cond_c
    const/4 v0, 0x0

    .line 148
    return-object v0
.end method
