.class public Lcom/bykv/vk/openvk/uef/uef/uef/xs/moa;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static uef(Ljava/io/File;)I
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, -0x1

    if-eqz v0, :cond_6

    .line 18
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_4

    .line 19
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-gtz v6, :cond_1

    return v1

    :cond_1
    const/4 v6, 0x0

    .line 20
    :try_start_0
    new-instance v7, Ljava/io/FileInputStream;

    invoke-direct {v7, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v0, 0x8

    .line 21
    :try_start_1
    new-array v6, v0, [B

    move-wide v8, v4

    .line 22
    :goto_0
    invoke-virtual {v7, v6}, Ljava/io/FileInputStream;->read([B)I

    move-result v10

    if-ne v10, v0, :cond_4

    const/4 v10, 0x0

    .line 23
    aget-byte v10, v6, v10

    int-to-long v10, v10

    const-wide/16 v12, 0xff

    and-long/2addr v10, v12

    const/16 v14, 0x18

    shl-long/2addr v10, v14

    const/4 v14, 0x1

    aget-byte v14, v6, v14

    int-to-long v14, v14

    and-long/2addr v14, v12

    const/16 v16, 0x10

    shl-long v14, v14, v16

    or-long/2addr v10, v14

    const/4 v14, 0x2

    aget-byte v14, v6, v14

    int-to-long v14, v14

    and-long/2addr v14, v12

    shl-long/2addr v14, v0

    or-long/2addr v10, v14

    const/4 v14, 0x3

    aget-byte v14, v6, v14

    int-to-long v14, v14

    and-long/2addr v12, v14

    or-long/2addr v10, v12

    const/4 v12, 0x4

    .line 24
    aget-byte v12, v6, v12

    const/16 v13, 0x6d

    if-ne v12, v13, :cond_2

    const/4 v12, 0x5

    aget-byte v12, v6, v12

    const/16 v13, 0x6f

    if-ne v12, v13, :cond_2

    const/4 v12, 0x6

    aget-byte v12, v6, v12

    if-ne v12, v13, :cond_2

    const/4 v12, 0x7

    aget-byte v12, v6, v12

    const/16 v13, 0x76

    if-eq v12, v13, :cond_4

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v6, v7

    goto :goto_2

    :cond_2
    :goto_1
    const-wide/16 v12, 0x8

    sub-long v12, v10, v12

    cmp-long v14, v12, v4

    if-lez v14, :cond_3

    .line 25
    invoke-virtual {v7, v12, v13}, Ljava/io/FileInputStream;->skip(J)J

    move-result-wide v14
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v12, v14, v12

    if-ltz v12, :cond_4

    :cond_3
    add-long/2addr v8, v10

    goto :goto_0

    :cond_4
    long-to-float v0, v8

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    long-to-float v1, v2

    div-float/2addr v0, v1

    float-to-int v0, v0

    .line 26
    :try_start_2
    invoke-virtual {v7}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return v0

    :catch_1
    move-object v6, v7

    goto :goto_3

    :catchall_1
    move-exception v0

    :goto_2
    if-eqz v6, :cond_5

    :try_start_3
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 27
    :catch_2
    :cond_5
    throw v0

    :catch_3
    :goto_3
    if-eqz v6, :cond_6

    .line 28
    :try_start_4
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :cond_6
    :goto_4
    return v1
.end method

.method public static uef(Ljava/lang/String;)I
    .locals 6

    .line 29
    const-string v0, "level"

    .line 30
    :try_start_0
    new-instance v1, Landroid/media/MediaExtractor;

    invoke-direct {v1}, Landroid/media/MediaExtractor;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    :try_start_1
    invoke-virtual {v1, p0}, Landroid/media/MediaExtractor;->setDataSource(Ljava/lang/String;)V

    .line 32
    invoke-virtual {v1}, Landroid/media/MediaExtractor;->getTrackCount()I

    move-result p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p0, :cond_2

    .line 33
    invoke-virtual {v1, v2}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    move-result-object v3

    .line 34
    const-string v4, "mime"

    invoke-virtual {v3, v4}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 35
    const-string v5, "video/avc"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, "video/hevc"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 36
    :cond_0
    invoke-virtual {v3, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 37
    invoke-virtual {v3, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 38
    invoke-virtual {v1}, Landroid/media/MediaExtractor;->release()V

    return p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {v1}, Landroid/media/MediaExtractor;->release()V

    goto :goto_2

    :catchall_0
    const/4 v1, 0x0

    :catchall_1
    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_2
    const/4 p0, -0x1

    return p0
.end method

.method private static uef(I)Ljava/lang/String;
    .locals 7

    .line 13
    const-class v0, Landroid/media/MediaCodecInfo$CodecProfileLevel;

    invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 14
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    .line 15
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v5, v6, :cond_0

    const-string v5, "HEVC"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x0

    .line 16
    :try_start_0
    invoke-virtual {v3, v5}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v3
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v3, p0, :cond_0

    return-object v4

    :catch_0
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 17
    :cond_1
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static uef()Lorg/json/JSONArray;
    .locals 13

    .line 1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 2
    new-instance v1, Landroid/media/MediaCodecList;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/media/MediaCodecList;-><init>(I)V

    invoke-virtual {v1}, Landroid/media/MediaCodecList;->getCodecInfos()[Landroid/media/MediaCodecInfo;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_3

    aget-object v5, v1, v4

    .line 3
    invoke-virtual {v5}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v6

    if-nez v6, :cond_2

    .line 4
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1d

    if-lt v6, v7, :cond_0

    invoke-static {v5}, Ld2/n;->x(Landroid/media/MediaCodecInfo;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 5
    :cond_0
    invoke-virtual {v5}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object v6

    array-length v7, v6

    move v8, v3

    :goto_1
    if-ge v8, v7, :cond_2

    aget-object v9, v6, v8

    .line 6
    const-string v10, "video/hevc"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 7
    invoke-virtual {v5, v10}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    move-result-object v9

    if-eqz v9, :cond_1

    .line 8
    iget-object v9, v9, Landroid/media/MediaCodecInfo$CodecCapabilities;->profileLevels:[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    array-length v10, v9

    move v11, v3

    :goto_2
    if-ge v11, v10, :cond_1

    aget-object v12, v9, v11

    .line 9
    iget v12, v12, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    invoke-static {v12}, Lcom/bykv/vk/openvk/uef/uef/uef/xs/moa;->uef(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 10
    :cond_3
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 11
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 12
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_3

    :cond_4
    return-object v1
.end method
