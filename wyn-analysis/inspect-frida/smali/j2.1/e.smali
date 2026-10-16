.class public final Lj2/e;
.super LCa/d;
.source "SourceFile"


# instance fields
.field public e:Z

.field public f:Ljava/util/UUID;

.field public g:[B


# virtual methods
.method public final e()Ljava/lang/Object;
    .locals 15

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    new-instance v3, Lj2/a;

    .line 5
    .line 6
    iget-object v4, p0, Lj2/e;->f:Ljava/util/UUID;

    .line 7
    .line 8
    iget-object v5, p0, Lj2/e;->g:[B

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    invoke-static {v4, v6, v5}, LM2/r;->a(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    iget-object v6, p0, Lj2/e;->g:[B

    .line 16
    .line 17
    new-instance v7, LM2/t;

    .line 18
    .line 19
    new-instance v8, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    move v9, v2

    .line 25
    :goto_0
    array-length v10, v6

    .line 26
    if-ge v9, v10, :cond_0

    .line 27
    .line 28
    aget-byte v10, v6, v9

    .line 29
    .line 30
    int-to-char v10, v10

    .line 31
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    add-int/2addr v9, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    const-string v8, "<KID>"

    .line 41
    .line 42
    invoke-virtual {v6, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    const/4 v9, 0x5

    .line 47
    add-int/2addr v8, v9

    .line 48
    const-string v10, "</KID>"

    .line 49
    .line 50
    invoke-virtual {v6, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    invoke-virtual {v6, v8, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-static {v6, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    aget-byte v6, v11, v2

    .line 63
    .line 64
    const/4 v8, 0x3

    .line 65
    aget-byte v10, v11, v8

    .line 66
    .line 67
    aput-byte v10, v11, v2

    .line 68
    .line 69
    aput-byte v6, v11, v8

    .line 70
    .line 71
    aget-byte v6, v11, v0

    .line 72
    .line 73
    aget-byte v8, v11, v1

    .line 74
    .line 75
    aput-byte v8, v11, v0

    .line 76
    .line 77
    aput-byte v6, v11, v1

    .line 78
    .line 79
    const/4 v1, 0x4

    .line 80
    aget-byte v6, v11, v1

    .line 81
    .line 82
    aget-byte v8, v11, v9

    .line 83
    .line 84
    aput-byte v8, v11, v1

    .line 85
    .line 86
    aput-byte v6, v11, v9

    .line 87
    .line 88
    const/4 v1, 0x6

    .line 89
    aget-byte v6, v11, v1

    .line 90
    .line 91
    const/4 v8, 0x7

    .line 92
    aget-byte v9, v11, v8

    .line 93
    .line 94
    aput-byte v9, v11, v1

    .line 95
    .line 96
    aput-byte v6, v11, v8

    .line 97
    .line 98
    const/4 v13, 0x0

    .line 99
    const/4 v14, 0x0

    .line 100
    const/4 v8, 0x1

    .line 101
    const/4 v9, 0x0

    .line 102
    const/16 v10, 0x8

    .line 103
    .line 104
    const/4 v12, 0x0

    .line 105
    invoke-direct/range {v7 .. v14}, LM2/t;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 106
    .line 107
    .line 108
    new-array v0, v0, [LM2/t;

    .line 109
    .line 110
    aput-object v7, v0, v2

    .line 111
    .line 112
    invoke-direct {v3, v4, v5, v0}, Lj2/a;-><init>(Ljava/util/UUID;[B[LM2/t;)V

    .line 113
    .line 114
    .line 115
    return-object v3
.end method

.method public final g(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "ProtectionHeader"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final i(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 1

    .line 1
    const-string v0, "ProtectionHeader"

    .line 2
    .line 3
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Lj2/e;->e:Z

    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final m(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ProtectionHeader"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lj2/e;->e:Z

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const-string v2, "SystemID"

    .line 18
    .line 19
    invoke-interface {p1, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/16 v2, 0x7b

    .line 29
    .line 30
    if-ne v1, v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    sub-int/2addr v1, v0

    .line 37
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/16 v2, 0x7d

    .line 42
    .line 43
    if-ne v1, v2, :cond_0

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    sub-int/2addr v1, v0

    .line 50
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :cond_0
    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lj2/e;->f:Ljava/util/UUID;

    .line 59
    .line 60
    :cond_1
    return-void
.end method

.method public final n(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lj2/e;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lj2/e;->g:[B

    .line 15
    .line 16
    :cond_0
    return-void
.end method
