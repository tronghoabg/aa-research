.class public abstract Ld2/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ld2/v;->a:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 8

    .line 1
    const-string v0, "audio/raw"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    sget p0, LQ1/x;->a:I

    .line 12
    .line 13
    const/16 v2, 0x1a

    .line 14
    .line 15
    if-ge p0, v2, :cond_0

    .line 16
    .line 17
    sget-object p0, LQ1/x;->b:Ljava/lang/String;

    .line 18
    .line 19
    const-string v2, "R9"

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-ne p0, v0, :cond_0

    .line 32
    .line 33
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Ld2/m;

    .line 38
    .line 39
    iget-object p0, p0, Ld2/m;->a:Ljava/lang/String;

    .line 40
    .line 41
    const-string v2, "OMX.MTK.AUDIO.DECODER.RAW"

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    const-string v2, "OMX.google.raw.decoder"

    .line 52
    .line 53
    const-string v3, "audio/raw"

    .line 54
    .line 55
    const-string v4, "audio/raw"

    .line 56
    .line 57
    const/4 v7, 0x0

    .line 58
    invoke-static/range {v2 .. v7}, Ld2/m;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZ)Ld2/m;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :cond_0
    new-instance p0, Ld2/h;

    .line 66
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    new-instance v2, LV5/s;

    .line 71
    .line 72
    const/4 v3, 0x1

    .line 73
    invoke-direct {v2, p0, v3}, LV5/s;-><init>(Ljava/lang/Object;I)V

    .line 74
    .line 75
    .line 76
    invoke-static {p1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    sget p0, LQ1/x;->a:I

    .line 80
    .line 81
    const/16 v2, 0x20

    .line 82
    .line 83
    if-ge p0, v2, :cond_2

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-le p0, v0, :cond_2

    .line 90
    .line 91
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, Ld2/m;

    .line 96
    .line 97
    iget-object p0, p0, Ld2/m;->a:Ljava/lang/String;

    .line 98
    .line 99
    const-string v0, "OMX.qti.audio.decoder.flac"

    .line 100
    .line 101
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-eqz p0, :cond_2

    .line 106
    .line 107
    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    check-cast p0, Ld2/m;

    .line 112
    .line 113
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    :cond_2
    return-void
.end method

.method public static b(LN1/n;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, LN1/n;->n:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "audio/eac3-joc"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string p0, "audio/eac3"

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string v0, "video/dolby-vision"

    .line 15
    .line 16
    iget-object v1, p0, LN1/n;->n:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const-string v2, "video/hevc"

    .line 23
    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    invoke-static {p0}, Ld2/v;->d(LN1/n;)Landroid/util/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_4

    .line 31
    .line 32
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    const/16 v0, 0x10

    .line 41
    .line 42
    if-eq p0, v0, :cond_3

    .line 43
    .line 44
    const/16 v0, 0x100

    .line 45
    .line 46
    if-ne p0, v0, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/16 v0, 0x200

    .line 50
    .line 51
    if-ne p0, v0, :cond_2

    .line 52
    .line 53
    const-string p0, "video/avc"

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_2
    const/16 v0, 0x400

    .line 57
    .line 58
    if-ne p0, v0, :cond_4

    .line 59
    .line 60
    const-string p0, "video/av01"

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_3
    :goto_0
    return-object v2

    .line 64
    :cond_4
    const-string p0, "video/mv-hevc"

    .line 65
    .line 66
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_5

    .line 71
    .line 72
    return-object v2

    .line 73
    :cond_5
    const/4 p0, 0x0

    .line 74
    return-object p0
.end method

.method public static c(Landroid/media/MediaCodecInfo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    if-ge v1, v0, :cond_1

    .line 8
    .line 9
    aget-object v2, p0, v1

    .line 10
    .line 11
    invoke-virtual {v2, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string p0, "video/dolby-vision"

    .line 22
    .line 23
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_4

    .line 28
    .line 29
    const-string p0, "OMX.MS.HEVCDV.Decoder"

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    const-string p0, "video/hevcdv"

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    const-string p0, "OMX.RTK.video.decoder"

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_3

    .line 47
    .line 48
    const-string p0, "OMX.realtek.video.decoder.tunneled"

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_8

    .line 55
    .line 56
    :cond_3
    const-string p0, "video/dv_hevc"

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_4
    const-string p0, "video/mv-hevc"

    .line 60
    .line 61
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_5

    .line 66
    .line 67
    const-string p0, "c2.qti.mvhevc.decoder"

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_8

    .line 74
    .line 75
    const-string p0, "video/x-mvhevc"

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_5
    const-string p0, "audio/alac"

    .line 79
    .line 80
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_6

    .line 85
    .line 86
    const-string p0, "OMX.lge.alac.decoder"

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_6

    .line 93
    .line 94
    const-string p0, "audio/x-lg-alac"

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_6
    const-string p0, "audio/flac"

    .line 98
    .line 99
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_7

    .line 104
    .line 105
    const-string p0, "OMX.lge.flac.decoder"

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-eqz p0, :cond_7

    .line 112
    .line 113
    const-string p0, "audio/x-lg-flac"

    .line 114
    .line 115
    return-object p0

    .line 116
    :cond_7
    const-string p0, "audio/ac3"

    .line 117
    .line 118
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-eqz p0, :cond_8

    .line 123
    .line 124
    const-string p0, "OMX.lge.ac3.decoder"

    .line 125
    .line 126
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    if-eqz p0, :cond_8

    .line 131
    .line 132
    const-string p0, "audio/lg-ac3"

    .line 133
    .line 134
    return-object p0

    .line 135
    :cond_8
    const/4 p0, 0x0

    .line 136
    return-object p0
.end method

.method public static d(LN1/n;)Landroid/util/Pair;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "10"

    .line 4
    .line 5
    const-string v3, "09"

    .line 6
    .line 7
    const-string v4, "08"

    .line 8
    .line 9
    const-string v5, "07"

    .line 10
    .line 11
    const-string v6, "06"

    .line 12
    .line 13
    const-string v7, "05"

    .line 14
    .line 15
    const-string v8, "04"

    .line 16
    .line 17
    const-string v9, "03"

    .line 18
    .line 19
    const-string v10, "02"

    .line 20
    .line 21
    const-string v11, "01"

    .line 22
    .line 23
    const/16 v16, 0x5

    .line 24
    .line 25
    const/16 v17, 0x8

    .line 26
    .line 27
    const/4 v13, 0x3

    .line 28
    const/16 v18, 0x0

    .line 29
    .line 30
    sget-object v19, LQ1/a;->a:[B

    .line 31
    .line 32
    const/16 v19, 0x4

    .line 33
    .line 34
    iget-object v12, v0, LN1/n;->k:Ljava/lang/String;

    .line 35
    .line 36
    const/16 v20, 0x0

    .line 37
    .line 38
    if-nez v12, :cond_0

    .line 39
    .line 40
    goto/16 :goto_b

    .line 41
    .line 42
    :cond_0
    const-string v14, "\\."

    .line 43
    .line 44
    invoke-virtual {v12, v14}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v12

    .line 48
    const-string v14, "video/dolby-vision"

    .line 49
    .line 50
    const/16 v22, 0x2

    .line 51
    .line 52
    iget-object v15, v0, LN1/n;->n:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v14

    .line 58
    const/16 v23, 0x800

    .line 59
    .line 60
    const/16 v24, 0x1000

    .line 61
    .line 62
    const/16 v25, 0x200

    .line 63
    .line 64
    const/16 v26, 0x100

    .line 65
    .line 66
    const/16 v27, 0x80

    .line 67
    .line 68
    const/16 v28, 0x40

    .line 69
    .line 70
    const/16 v29, 0x20

    .line 71
    .line 72
    const/16 v30, 0x400

    .line 73
    .line 74
    const/16 v31, 0x10

    .line 75
    .line 76
    const-string v15, "CodecSpecificDataUtil"

    .line 77
    .line 78
    const/16 v32, 0x1

    .line 79
    .line 80
    iget-object v2, v0, LN1/n;->k:Ljava/lang/String;

    .line 81
    .line 82
    if-eqz v14, :cond_1f

    .line 83
    .line 84
    array-length v0, v12

    .line 85
    const-string v14, "Ignoring malformed Dolby Vision codec string: "

    .line 86
    .line 87
    if-ge v0, v13, :cond_1

    .line 88
    .line 89
    invoke-static {v14, v2, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object v20

    .line 93
    :cond_1
    sget-object v0, LQ1/a;->c:Ljava/util/regex/Pattern;

    .line 94
    .line 95
    aget-object v13, v12, v32

    .line 96
    .line 97
    invoke-virtual {v0, v13}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 102
    .line 103
    .line 104
    move-result v13

    .line 105
    if-nez v13, :cond_2

    .line 106
    .line 107
    invoke-static {v14, v2, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-object v20

    .line 111
    :cond_2
    move/from16 v2, v32

    .line 112
    .line 113
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-nez v0, :cond_3

    .line 118
    .line 119
    :goto_0
    move-object/from16 v2, v20

    .line 120
    .line 121
    goto/16 :goto_3

    .line 122
    .line 123
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    sparse-switch v2, :sswitch_data_0

    .line 128
    .line 129
    .line 130
    :goto_1
    const/4 v2, -0x1

    .line 131
    goto/16 :goto_2

    .line 132
    .line 133
    :sswitch_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-nez v2, :cond_4

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_4
    const/16 v2, 0xa

    .line 141
    .line 142
    goto/16 :goto_2

    .line 143
    .line 144
    :sswitch_1
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-nez v2, :cond_5

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_5
    const/16 v2, 0x9

    .line 152
    .line 153
    goto/16 :goto_2

    .line 154
    .line 155
    :sswitch_2
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-nez v2, :cond_6

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_6
    move/from16 v2, v17

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :sswitch_3
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-nez v2, :cond_7

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_7
    const/4 v2, 0x7

    .line 173
    goto :goto_2

    .line 174
    :sswitch_4
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-nez v2, :cond_8

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_8
    const/4 v2, 0x6

    .line 182
    goto :goto_2

    .line 183
    :sswitch_5
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-nez v2, :cond_9

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_9
    move/from16 v2, v16

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :sswitch_6
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-nez v2, :cond_a

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_a
    move/from16 v2, v19

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :sswitch_7
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-nez v2, :cond_b

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_b
    const/4 v2, 0x3

    .line 211
    goto :goto_2

    .line 212
    :sswitch_8
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-nez v2, :cond_c

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_c
    move/from16 v2, v22

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :sswitch_9
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-nez v2, :cond_d

    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_d
    const/4 v2, 0x1

    .line 230
    goto :goto_2

    .line 231
    :sswitch_a
    const-string v2, "00"

    .line 232
    .line 233
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-nez v2, :cond_e

    .line 238
    .line 239
    goto :goto_1

    .line 240
    :cond_e
    move/from16 v2, v18

    .line 241
    .line 242
    :goto_2
    packed-switch v2, :pswitch_data_0

    .line 243
    .line 244
    .line 245
    goto :goto_0

    .line 246
    :pswitch_0
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    goto :goto_3

    .line 251
    :pswitch_1
    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    goto :goto_3

    .line 256
    :pswitch_2
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    goto :goto_3

    .line 261
    :pswitch_3
    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    goto :goto_3

    .line 266
    :pswitch_4
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    goto :goto_3

    .line 271
    :pswitch_5
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    goto :goto_3

    .line 276
    :pswitch_6
    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    goto :goto_3

    .line 281
    :pswitch_7
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    goto :goto_3

    .line 286
    :pswitch_8
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    goto :goto_3

    .line 291
    :pswitch_9
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    goto :goto_3

    .line 296
    :pswitch_a
    const/16 v32, 0x1

    .line 297
    .line 298
    invoke-static/range {v32 .. v32}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    :goto_3
    if-nez v2, :cond_f

    .line 303
    .line 304
    const-string v1, "Unknown Dolby Vision profile string: "

    .line 305
    .line 306
    invoke-static {v1, v0, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    return-object v20

    .line 310
    :cond_f
    aget-object v0, v12, v22

    .line 311
    .line 312
    if-nez v0, :cond_10

    .line 313
    .line 314
    :goto_4
    move-object/from16 v1, v20

    .line 315
    .line 316
    goto/16 :goto_8

    .line 317
    .line 318
    :cond_10
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 319
    .line 320
    .line 321
    move-result v12

    .line 322
    sparse-switch v12, :sswitch_data_1

    .line 323
    .line 324
    .line 325
    :goto_5
    const/16 v21, -0x1

    .line 326
    .line 327
    goto/16 :goto_7

    .line 328
    .line 329
    :sswitch_b
    const-string v1, "13"

    .line 330
    .line 331
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    if-nez v1, :cond_11

    .line 336
    .line 337
    goto :goto_5

    .line 338
    :cond_11
    const/16 v1, 0xc

    .line 339
    .line 340
    goto :goto_6

    .line 341
    :sswitch_c
    const-string v1, "12"

    .line 342
    .line 343
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    if-nez v1, :cond_12

    .line 348
    .line 349
    goto :goto_5

    .line 350
    :cond_12
    const/16 v1, 0xb

    .line 351
    .line 352
    :goto_6
    move/from16 v21, v1

    .line 353
    .line 354
    goto/16 :goto_7

    .line 355
    .line 356
    :sswitch_d
    const-string v1, "11"

    .line 357
    .line 358
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    if-nez v1, :cond_13

    .line 363
    .line 364
    goto :goto_5

    .line 365
    :cond_13
    const/16 v21, 0xa

    .line 366
    .line 367
    goto/16 :goto_7

    .line 368
    .line 369
    :sswitch_e
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    if-nez v1, :cond_14

    .line 374
    .line 375
    goto :goto_5

    .line 376
    :cond_14
    const/16 v21, 0x9

    .line 377
    .line 378
    goto/16 :goto_7

    .line 379
    .line 380
    :sswitch_f
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    if-nez v1, :cond_15

    .line 385
    .line 386
    goto :goto_5

    .line 387
    :cond_15
    move/from16 v21, v17

    .line 388
    .line 389
    goto :goto_7

    .line 390
    :sswitch_10
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    if-nez v1, :cond_16

    .line 395
    .line 396
    goto :goto_5

    .line 397
    :cond_16
    const/16 v21, 0x7

    .line 398
    .line 399
    goto :goto_7

    .line 400
    :sswitch_11
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    if-nez v1, :cond_17

    .line 405
    .line 406
    goto :goto_5

    .line 407
    :cond_17
    const/16 v21, 0x6

    .line 408
    .line 409
    goto :goto_7

    .line 410
    :sswitch_12
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    if-nez v1, :cond_18

    .line 415
    .line 416
    goto :goto_5

    .line 417
    :cond_18
    move/from16 v21, v16

    .line 418
    .line 419
    goto :goto_7

    .line 420
    :sswitch_13
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    if-nez v1, :cond_19

    .line 425
    .line 426
    goto :goto_5

    .line 427
    :cond_19
    move/from16 v21, v19

    .line 428
    .line 429
    goto :goto_7

    .line 430
    :sswitch_14
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v1

    .line 434
    if-nez v1, :cond_1a

    .line 435
    .line 436
    goto :goto_5

    .line 437
    :cond_1a
    const/16 v21, 0x3

    .line 438
    .line 439
    goto :goto_7

    .line 440
    :sswitch_15
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    if-nez v1, :cond_1b

    .line 445
    .line 446
    goto :goto_5

    .line 447
    :cond_1b
    move/from16 v21, v22

    .line 448
    .line 449
    goto :goto_7

    .line 450
    :sswitch_16
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result v1

    .line 454
    if-nez v1, :cond_1c

    .line 455
    .line 456
    goto/16 :goto_5

    .line 457
    .line 458
    :cond_1c
    const/16 v21, 0x1

    .line 459
    .line 460
    goto :goto_7

    .line 461
    :sswitch_17
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    if-nez v1, :cond_1d

    .line 466
    .line 467
    goto/16 :goto_5

    .line 468
    .line 469
    :cond_1d
    move/from16 v21, v18

    .line 470
    .line 471
    :goto_7
    packed-switch v21, :pswitch_data_1

    .line 472
    .line 473
    .line 474
    goto/16 :goto_4

    .line 475
    .line 476
    :pswitch_b
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    goto :goto_8

    .line 481
    :pswitch_c
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    goto :goto_8

    .line 486
    :pswitch_d
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    goto :goto_8

    .line 491
    :pswitch_e
    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    goto :goto_8

    .line 496
    :pswitch_f
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    goto :goto_8

    .line 501
    :pswitch_10
    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    goto :goto_8

    .line 506
    :pswitch_11
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    goto :goto_8

    .line 511
    :pswitch_12
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    goto :goto_8

    .line 516
    :pswitch_13
    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    goto :goto_8

    .line 521
    :pswitch_14
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    goto :goto_8

    .line 526
    :pswitch_15
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    goto :goto_8

    .line 531
    :pswitch_16
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    goto :goto_8

    .line 536
    :pswitch_17
    const/16 v32, 0x1

    .line 537
    .line 538
    invoke-static/range {v32 .. v32}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 539
    .line 540
    .line 541
    move-result-object v1

    .line 542
    :goto_8
    if-nez v1, :cond_1e

    .line 543
    .line 544
    const-string v1, "Unknown Dolby Vision level string: "

    .line 545
    .line 546
    invoke-static {v1, v0, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    return-object v20

    .line 550
    :cond_1e
    new-instance v0, Landroid/util/Pair;

    .line 551
    .line 552
    invoke-direct {v0, v2, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    return-object v0

    .line 556
    :cond_1f
    aget-object v1, v12, v18

    .line 557
    .line 558
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    const/16 v3, 0x4000

    .line 562
    .line 563
    const v4, 0x8000

    .line 564
    .line 565
    .line 566
    const/high16 v5, 0x10000

    .line 567
    .line 568
    const/16 v6, 0x14

    .line 569
    .line 570
    iget-object v0, v0, LN1/n;->B:LN1/f;

    .line 571
    .line 572
    const/16 v7, 0x2000

    .line 573
    .line 574
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 575
    .line 576
    .line 577
    move-result v8

    .line 578
    sparse-switch v8, :sswitch_data_2

    .line 579
    .line 580
    .line 581
    :goto_9
    const/4 v1, -0x1

    .line 582
    goto/16 :goto_a

    .line 583
    .line 584
    :sswitch_18
    const-string v8, "vp09"

    .line 585
    .line 586
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    move-result v1

    .line 590
    if-nez v1, :cond_20

    .line 591
    .line 592
    goto :goto_9

    .line 593
    :cond_20
    const/4 v1, 0x7

    .line 594
    goto :goto_a

    .line 595
    :sswitch_19
    const-string v8, "s263"

    .line 596
    .line 597
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    move-result v1

    .line 601
    if-nez v1, :cond_21

    .line 602
    .line 603
    goto :goto_9

    .line 604
    :cond_21
    const/4 v1, 0x6

    .line 605
    goto :goto_a

    .line 606
    :sswitch_1a
    const-string v8, "mp4a"

    .line 607
    .line 608
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    move-result v1

    .line 612
    if-nez v1, :cond_22

    .line 613
    .line 614
    goto :goto_9

    .line 615
    :cond_22
    move/from16 v1, v16

    .line 616
    .line 617
    goto :goto_a

    .line 618
    :sswitch_1b
    const-string v8, "hvc1"

    .line 619
    .line 620
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    move-result v1

    .line 624
    if-nez v1, :cond_23

    .line 625
    .line 626
    goto :goto_9

    .line 627
    :cond_23
    move/from16 v1, v19

    .line 628
    .line 629
    goto :goto_a

    .line 630
    :sswitch_1c
    const-string v8, "hev1"

    .line 631
    .line 632
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 633
    .line 634
    .line 635
    move-result v1

    .line 636
    if-nez v1, :cond_24

    .line 637
    .line 638
    goto :goto_9

    .line 639
    :cond_24
    const/4 v1, 0x3

    .line 640
    goto :goto_a

    .line 641
    :sswitch_1d
    const-string v8, "avc2"

    .line 642
    .line 643
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    move-result v1

    .line 647
    if-nez v1, :cond_25

    .line 648
    .line 649
    goto :goto_9

    .line 650
    :cond_25
    move/from16 v1, v22

    .line 651
    .line 652
    goto :goto_a

    .line 653
    :sswitch_1e
    const-string v8, "avc1"

    .line 654
    .line 655
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v1

    .line 659
    if-nez v1, :cond_26

    .line 660
    .line 661
    goto :goto_9

    .line 662
    :cond_26
    const/4 v1, 0x1

    .line 663
    goto :goto_a

    .line 664
    :sswitch_1f
    const-string v8, "av01"

    .line 665
    .line 666
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    move-result v1

    .line 670
    if-nez v1, :cond_27

    .line 671
    .line 672
    goto :goto_9

    .line 673
    :cond_27
    move/from16 v1, v18

    .line 674
    .line 675
    :goto_a
    packed-switch v1, :pswitch_data_2

    .line 676
    .line 677
    .line 678
    :goto_b
    return-object v20

    .line 679
    :pswitch_18
    array-length v0, v12

    .line 680
    const-string v1, "Ignoring malformed VP9 codec string: "

    .line 681
    .line 682
    const/4 v3, 0x3

    .line 683
    if-ge v0, v3, :cond_28

    .line 684
    .line 685
    invoke-static {v1, v2, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    return-object v20

    .line 689
    :cond_28
    const/4 v0, 0x1

    .line 690
    :try_start_0
    aget-object v3, v12, v0

    .line 691
    .line 692
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 693
    .line 694
    .line 695
    move-result v3

    .line 696
    aget-object v4, v12, v22

    .line 697
    .line 698
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 699
    .line 700
    .line 701
    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 702
    if-eqz v3, :cond_2c

    .line 703
    .line 704
    if-eq v3, v0, :cond_2b

    .line 705
    .line 706
    move/from16 v0, v22

    .line 707
    .line 708
    if-eq v3, v0, :cond_2a

    .line 709
    .line 710
    const/4 v0, 0x3

    .line 711
    if-eq v3, v0, :cond_29

    .line 712
    .line 713
    const/4 v0, -0x1

    .line 714
    :goto_c
    const/4 v2, -0x1

    .line 715
    goto :goto_d

    .line 716
    :cond_29
    move/from16 v0, v17

    .line 717
    .line 718
    goto :goto_c

    .line 719
    :cond_2a
    move/from16 v0, v19

    .line 720
    .line 721
    goto :goto_c

    .line 722
    :cond_2b
    const/4 v0, 0x2

    .line 723
    goto :goto_c

    .line 724
    :cond_2c
    const/4 v0, 0x1

    .line 725
    goto :goto_c

    .line 726
    :goto_d
    if-ne v0, v2, :cond_2d

    .line 727
    .line 728
    const-string v0, "Unknown VP9 profile: "

    .line 729
    .line 730
    invoke-static {v3, v0, v15}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 731
    .line 732
    .line 733
    return-object v20

    .line 734
    :cond_2d
    const/16 v2, 0xa

    .line 735
    .line 736
    if-eq v1, v2, :cond_37

    .line 737
    .line 738
    const/16 v2, 0xb

    .line 739
    .line 740
    if-eq v1, v2, :cond_36

    .line 741
    .line 742
    if-eq v1, v6, :cond_35

    .line 743
    .line 744
    const/16 v2, 0x15

    .line 745
    .line 746
    if-eq v1, v2, :cond_34

    .line 747
    .line 748
    const/16 v2, 0x1e

    .line 749
    .line 750
    if-eq v1, v2, :cond_33

    .line 751
    .line 752
    const/16 v2, 0x1f

    .line 753
    .line 754
    if-eq v1, v2, :cond_32

    .line 755
    .line 756
    const/16 v2, 0x28

    .line 757
    .line 758
    if-eq v1, v2, :cond_31

    .line 759
    .line 760
    const/16 v2, 0x29

    .line 761
    .line 762
    if-eq v1, v2, :cond_30

    .line 763
    .line 764
    const/16 v2, 0x32

    .line 765
    .line 766
    if-eq v1, v2, :cond_2f

    .line 767
    .line 768
    const/16 v2, 0x33

    .line 769
    .line 770
    if-eq v1, v2, :cond_2e

    .line 771
    .line 772
    packed-switch v1, :pswitch_data_3

    .line 773
    .line 774
    .line 775
    const/4 v2, -0x1

    .line 776
    const/4 v13, -0x1

    .line 777
    goto :goto_f

    .line 778
    :pswitch_19
    move v13, v7

    .line 779
    :goto_e
    const/4 v2, -0x1

    .line 780
    goto :goto_f

    .line 781
    :pswitch_1a
    move/from16 v13, v24

    .line 782
    .line 783
    goto :goto_e

    .line 784
    :pswitch_1b
    move/from16 v13, v23

    .line 785
    .line 786
    goto :goto_e

    .line 787
    :cond_2e
    move/from16 v13, v25

    .line 788
    .line 789
    goto :goto_e

    .line 790
    :cond_2f
    move/from16 v13, v26

    .line 791
    .line 792
    goto :goto_e

    .line 793
    :cond_30
    move/from16 v13, v27

    .line 794
    .line 795
    goto :goto_e

    .line 796
    :cond_31
    move/from16 v13, v28

    .line 797
    .line 798
    goto :goto_e

    .line 799
    :cond_32
    move/from16 v13, v29

    .line 800
    .line 801
    goto :goto_e

    .line 802
    :cond_33
    move/from16 v13, v31

    .line 803
    .line 804
    goto :goto_e

    .line 805
    :cond_34
    move/from16 v13, v17

    .line 806
    .line 807
    goto :goto_e

    .line 808
    :cond_35
    move/from16 v13, v19

    .line 809
    .line 810
    goto :goto_e

    .line 811
    :cond_36
    const/4 v2, -0x1

    .line 812
    const/4 v13, 0x2

    .line 813
    goto :goto_f

    .line 814
    :cond_37
    const/4 v2, -0x1

    .line 815
    const/4 v13, 0x1

    .line 816
    :goto_f
    if-ne v13, v2, :cond_38

    .line 817
    .line 818
    const-string v0, "Unknown VP9 level: "

    .line 819
    .line 820
    invoke-static {v1, v0, v15}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 821
    .line 822
    .line 823
    return-object v20

    .line 824
    :cond_38
    new-instance v1, Landroid/util/Pair;

    .line 825
    .line 826
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 831
    .line 832
    .line 833
    move-result-object v2

    .line 834
    invoke-direct {v1, v0, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 835
    .line 836
    .line 837
    return-object v1

    .line 838
    :catch_0
    invoke-static {v1, v2, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 839
    .line 840
    .line 841
    goto/16 :goto_1a

    .line 842
    .line 843
    :pswitch_1c
    new-instance v0, Landroid/util/Pair;

    .line 844
    .line 845
    const/16 v32, 0x1

    .line 846
    .line 847
    invoke-static/range {v32 .. v32}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    invoke-direct {v0, v1, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 852
    .line 853
    .line 854
    array-length v1, v12

    .line 855
    const-string v3, "Ignoring malformed H263 codec string: "

    .line 856
    .line 857
    const/4 v4, 0x3

    .line 858
    if-ge v1, v4, :cond_39

    .line 859
    .line 860
    invoke-static {v3, v2, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    return-object v0

    .line 864
    :cond_39
    :try_start_1
    aget-object v1, v12, v32

    .line 865
    .line 866
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 867
    .line 868
    .line 869
    move-result v1

    .line 870
    const/16 v22, 0x2

    .line 871
    .line 872
    aget-object v4, v12, v22

    .line 873
    .line 874
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 875
    .line 876
    .line 877
    move-result v4

    .line 878
    new-instance v5, Landroid/util/Pair;

    .line 879
    .line 880
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 881
    .line 882
    .line 883
    move-result-object v1

    .line 884
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 885
    .line 886
    .line 887
    move-result-object v4

    .line 888
    invoke-direct {v5, v1, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 889
    .line 890
    .line 891
    return-object v5

    .line 892
    :catch_1
    invoke-static {v3, v2, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 893
    .line 894
    .line 895
    move-object/from16 v20, v0

    .line 896
    .line 897
    goto/16 :goto_1a

    .line 898
    .line 899
    :pswitch_1d
    array-length v0, v12

    .line 900
    const-string v1, "Ignoring malformed MP4A codec string: "

    .line 901
    .line 902
    const/4 v3, 0x3

    .line 903
    if-eq v0, v3, :cond_3a

    .line 904
    .line 905
    invoke-static {v1, v2, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 906
    .line 907
    .line 908
    return-object v20

    .line 909
    :cond_3a
    const/16 v32, 0x1

    .line 910
    .line 911
    :try_start_2
    aget-object v0, v12, v32

    .line 912
    .line 913
    move/from16 v3, v31

    .line 914
    .line 915
    invoke-static {v0, v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 916
    .line 917
    .line 918
    move-result v0

    .line 919
    invoke-static {v0}, LN1/C;->e(I)Ljava/lang/String;

    .line 920
    .line 921
    .line 922
    move-result-object v0

    .line 923
    const-string v3, "audio/mp4a-latm"

    .line 924
    .line 925
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 926
    .line 927
    .line 928
    move-result v0

    .line 929
    if-eqz v0, :cond_50

    .line 930
    .line 931
    const/16 v22, 0x2

    .line 932
    .line 933
    aget-object v0, v12, v22

    .line 934
    .line 935
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 936
    .line 937
    .line 938
    move-result v0

    .line 939
    const/16 v3, 0x11

    .line 940
    .line 941
    if-eq v0, v3, :cond_3b

    .line 942
    .line 943
    if-eq v0, v6, :cond_3c

    .line 944
    .line 945
    const/16 v3, 0x17

    .line 946
    .line 947
    if-eq v0, v3, :cond_3b

    .line 948
    .line 949
    const/16 v3, 0x1d

    .line 950
    .line 951
    if-eq v0, v3, :cond_3b

    .line 952
    .line 953
    const/16 v3, 0x27

    .line 954
    .line 955
    if-eq v0, v3, :cond_3b

    .line 956
    .line 957
    const/16 v3, 0x2a

    .line 958
    .line 959
    if-eq v0, v3, :cond_3b

    .line 960
    .line 961
    packed-switch v0, :pswitch_data_4

    .line 962
    .line 963
    .line 964
    const/4 v0, -0x1

    .line 965
    const/4 v3, -0x1

    .line 966
    goto :goto_11

    .line 967
    :pswitch_1e
    const/4 v0, -0x1

    .line 968
    const/4 v3, 0x6

    .line 969
    goto :goto_11

    .line 970
    :pswitch_1f
    move/from16 v3, v16

    .line 971
    .line 972
    :cond_3b
    :goto_10
    const/4 v0, -0x1

    .line 973
    goto :goto_11

    .line 974
    :pswitch_20
    move/from16 v3, v19

    .line 975
    .line 976
    goto :goto_10

    .line 977
    :pswitch_21
    const/4 v0, -0x1

    .line 978
    const/4 v3, 0x3

    .line 979
    goto :goto_11

    .line 980
    :pswitch_22
    const/4 v0, -0x1

    .line 981
    const/4 v3, 0x2

    .line 982
    goto :goto_11

    .line 983
    :pswitch_23
    const/4 v0, -0x1

    .line 984
    const/4 v3, 0x1

    .line 985
    goto :goto_11

    .line 986
    :cond_3c
    move v3, v6

    .line 987
    goto :goto_10

    .line 988
    :goto_11
    if-eq v3, v0, :cond_50

    .line 989
    .line 990
    new-instance v0, Landroid/util/Pair;

    .line 991
    .line 992
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 993
    .line 994
    .line 995
    move-result-object v3

    .line 996
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 997
    .line 998
    .line 999
    move-result-object v4

    .line 1000
    invoke-direct {v0, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1001
    .line 1002
    .line 1003
    return-object v0

    .line 1004
    :catch_2
    invoke-static {v1, v2, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1005
    .line 1006
    .line 1007
    goto/16 :goto_1a

    .line 1008
    .line 1009
    :pswitch_24
    invoke-static {v2, v12, v0}, LQ1/a;->c(Ljava/lang/String;[Ljava/lang/String;LN1/f;)Landroid/util/Pair;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    return-object v0

    .line 1014
    :pswitch_25
    array-length v0, v12

    .line 1015
    const-string v1, "Ignoring malformed AVC codec string: "

    .line 1016
    .line 1017
    const/4 v6, 0x2

    .line 1018
    if-ge v0, v6, :cond_3d

    .line 1019
    .line 1020
    invoke-static {v1, v2, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1021
    .line 1022
    .line 1023
    return-object v20

    .line 1024
    :cond_3d
    const/16 v32, 0x1

    .line 1025
    .line 1026
    :try_start_3
    aget-object v0, v12, v32

    .line 1027
    .line 1028
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1029
    .line 1030
    .line 1031
    move-result v0

    .line 1032
    const/4 v8, 0x6

    .line 1033
    if-ne v0, v8, :cond_3e

    .line 1034
    .line 1035
    aget-object v0, v12, v32

    .line 1036
    .line 1037
    move/from16 v8, v18

    .line 1038
    .line 1039
    invoke-virtual {v0, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v0

    .line 1043
    const/16 v6, 0x10

    .line 1044
    .line 1045
    invoke-static {v0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 1046
    .line 1047
    .line 1048
    move-result v0

    .line 1049
    aget-object v8, v12, v32

    .line 1050
    .line 1051
    move/from16 v9, v19

    .line 1052
    .line 1053
    invoke-virtual {v8, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v8

    .line 1057
    invoke-static {v8, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 1058
    .line 1059
    .line 1060
    move-result v1

    .line 1061
    goto :goto_12

    .line 1062
    :cond_3e
    const/16 v6, 0x10

    .line 1063
    .line 1064
    array-length v0, v12

    .line 1065
    const/4 v8, 0x3

    .line 1066
    if-lt v0, v8, :cond_48

    .line 1067
    .line 1068
    const/16 v32, 0x1

    .line 1069
    .line 1070
    aget-object v0, v12, v32

    .line 1071
    .line 1072
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1073
    .line 1074
    .line 1075
    move-result v0

    .line 1076
    const/16 v22, 0x2

    .line 1077
    .line 1078
    aget-object v8, v12, v22

    .line 1079
    .line 1080
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1081
    .line 1082
    .line 1083
    move-result v1
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    .line 1084
    :goto_12
    const/16 v2, 0x42

    .line 1085
    .line 1086
    if-eq v0, v2, :cond_45

    .line 1087
    .line 1088
    const/16 v2, 0x4d

    .line 1089
    .line 1090
    if-eq v0, v2, :cond_44

    .line 1091
    .line 1092
    const/16 v2, 0x58

    .line 1093
    .line 1094
    if-eq v0, v2, :cond_43

    .line 1095
    .line 1096
    const/16 v2, 0x64

    .line 1097
    .line 1098
    if-eq v0, v2, :cond_42

    .line 1099
    .line 1100
    const/16 v2, 0x6e

    .line 1101
    .line 1102
    if-eq v0, v2, :cond_41

    .line 1103
    .line 1104
    const/16 v2, 0x7a

    .line 1105
    .line 1106
    if-eq v0, v2, :cond_40

    .line 1107
    .line 1108
    const/16 v2, 0xf4

    .line 1109
    .line 1110
    if-eq v0, v2, :cond_3f

    .line 1111
    .line 1112
    const/4 v2, -0x1

    .line 1113
    :goto_13
    const/4 v8, -0x1

    .line 1114
    goto :goto_14

    .line 1115
    :cond_3f
    move/from16 v2, v28

    .line 1116
    .line 1117
    goto :goto_13

    .line 1118
    :cond_40
    move/from16 v2, v29

    .line 1119
    .line 1120
    goto :goto_13

    .line 1121
    :cond_41
    move v2, v6

    .line 1122
    goto :goto_13

    .line 1123
    :cond_42
    move/from16 v2, v17

    .line 1124
    .line 1125
    goto :goto_13

    .line 1126
    :cond_43
    const/4 v2, 0x4

    .line 1127
    goto :goto_13

    .line 1128
    :cond_44
    const/4 v2, 0x2

    .line 1129
    goto :goto_13

    .line 1130
    :cond_45
    const/4 v2, 0x1

    .line 1131
    goto :goto_13

    .line 1132
    :goto_14
    if-ne v2, v8, :cond_46

    .line 1133
    .line 1134
    const-string v1, "Unknown AVC profile: "

    .line 1135
    .line 1136
    invoke-static {v0, v1, v15}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 1137
    .line 1138
    .line 1139
    return-object v20

    .line 1140
    :cond_46
    packed-switch v1, :pswitch_data_5

    .line 1141
    .line 1142
    .line 1143
    packed-switch v1, :pswitch_data_6

    .line 1144
    .line 1145
    .line 1146
    packed-switch v1, :pswitch_data_7

    .line 1147
    .line 1148
    .line 1149
    packed-switch v1, :pswitch_data_8

    .line 1150
    .line 1151
    .line 1152
    packed-switch v1, :pswitch_data_9

    .line 1153
    .line 1154
    .line 1155
    const/4 v0, -0x1

    .line 1156
    const/4 v13, -0x1

    .line 1157
    goto :goto_16

    .line 1158
    :pswitch_26
    move v13, v5

    .line 1159
    :goto_15
    const/4 v0, -0x1

    .line 1160
    goto :goto_16

    .line 1161
    :pswitch_27
    move v13, v4

    .line 1162
    goto :goto_15

    .line 1163
    :pswitch_28
    move v13, v3

    .line 1164
    goto :goto_15

    .line 1165
    :pswitch_29
    move v13, v7

    .line 1166
    goto :goto_15

    .line 1167
    :pswitch_2a
    move/from16 v13, v24

    .line 1168
    .line 1169
    goto :goto_15

    .line 1170
    :pswitch_2b
    move/from16 v13, v23

    .line 1171
    .line 1172
    goto :goto_15

    .line 1173
    :pswitch_2c
    move/from16 v13, v30

    .line 1174
    .line 1175
    goto :goto_15

    .line 1176
    :pswitch_2d
    move/from16 v13, v25

    .line 1177
    .line 1178
    goto :goto_15

    .line 1179
    :pswitch_2e
    move/from16 v13, v26

    .line 1180
    .line 1181
    goto :goto_15

    .line 1182
    :pswitch_2f
    move/from16 v13, v27

    .line 1183
    .line 1184
    goto :goto_15

    .line 1185
    :pswitch_30
    move/from16 v13, v28

    .line 1186
    .line 1187
    goto :goto_15

    .line 1188
    :pswitch_31
    move/from16 v13, v29

    .line 1189
    .line 1190
    goto :goto_15

    .line 1191
    :pswitch_32
    move v13, v6

    .line 1192
    goto :goto_15

    .line 1193
    :pswitch_33
    move/from16 v13, v17

    .line 1194
    .line 1195
    goto :goto_15

    .line 1196
    :pswitch_34
    const/4 v0, -0x1

    .line 1197
    const/4 v13, 0x4

    .line 1198
    goto :goto_16

    .line 1199
    :pswitch_35
    const/4 v0, -0x1

    .line 1200
    const/4 v13, 0x1

    .line 1201
    :goto_16
    if-ne v13, v0, :cond_47

    .line 1202
    .line 1203
    const-string v0, "Unknown AVC level: "

    .line 1204
    .line 1205
    invoke-static {v1, v0, v15}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 1206
    .line 1207
    .line 1208
    return-object v20

    .line 1209
    :cond_47
    new-instance v0, Landroid/util/Pair;

    .line 1210
    .line 1211
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v1

    .line 1215
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v2

    .line 1219
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1220
    .line 1221
    .line 1222
    return-object v0

    .line 1223
    :cond_48
    :try_start_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1224
    .line 1225
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v0

    .line 1235
    invoke-static {v15, v0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_3

    .line 1236
    .line 1237
    .line 1238
    return-object v20

    .line 1239
    :catch_3
    invoke-static {v1, v2, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1240
    .line 1241
    .line 1242
    goto/16 :goto_1a

    .line 1243
    .line 1244
    :pswitch_36
    move/from16 v6, v31

    .line 1245
    .line 1246
    array-length v1, v12

    .line 1247
    const-string v8, "Ignoring malformed AV1 codec string: "

    .line 1248
    .line 1249
    const/4 v9, 0x4

    .line 1250
    if-ge v1, v9, :cond_49

    .line 1251
    .line 1252
    invoke-static {v8, v2, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1253
    .line 1254
    .line 1255
    return-object v20

    .line 1256
    :cond_49
    const/16 v32, 0x1

    .line 1257
    .line 1258
    :try_start_5
    aget-object v1, v12, v32

    .line 1259
    .line 1260
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1261
    .line 1262
    .line 1263
    move-result v1

    .line 1264
    const/4 v10, 0x2

    .line 1265
    aget-object v11, v12, v10

    .line 1266
    .line 1267
    const/4 v13, 0x0

    .line 1268
    invoke-virtual {v11, v13, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v11

    .line 1272
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1273
    .line 1274
    .line 1275
    move-result v11

    .line 1276
    const/16 v33, 0x3

    .line 1277
    .line 1278
    aget-object v12, v12, v33

    .line 1279
    .line 1280
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1281
    .line 1282
    .line 1283
    move-result v2
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_4

    .line 1284
    if-eqz v1, :cond_4a

    .line 1285
    .line 1286
    const-string v0, "Unknown AV1 profile: "

    .line 1287
    .line 1288
    invoke-static {v1, v0, v15}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 1289
    .line 1290
    .line 1291
    return-object v20

    .line 1292
    :cond_4a
    move/from16 v1, v17

    .line 1293
    .line 1294
    if-eq v2, v1, :cond_4b

    .line 1295
    .line 1296
    const/16 v8, 0xa

    .line 1297
    .line 1298
    if-eq v2, v8, :cond_4b

    .line 1299
    .line 1300
    const-string v0, "Unknown AV1 bit depth: "

    .line 1301
    .line 1302
    invoke-static {v2, v0, v15}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 1303
    .line 1304
    .line 1305
    return-object v20

    .line 1306
    :cond_4b
    if-ne v2, v1, :cond_4c

    .line 1307
    .line 1308
    move/from16 v2, v32

    .line 1309
    .line 1310
    goto :goto_17

    .line 1311
    :cond_4c
    if-eqz v0, :cond_4e

    .line 1312
    .line 1313
    iget-object v2, v0, LN1/f;->d:[B

    .line 1314
    .line 1315
    if-nez v2, :cond_4d

    .line 1316
    .line 1317
    iget v0, v0, LN1/f;->c:I

    .line 1318
    .line 1319
    const/4 v2, 0x7

    .line 1320
    if-eq v0, v2, :cond_4d

    .line 1321
    .line 1322
    const/4 v8, 0x6

    .line 1323
    if-ne v0, v8, :cond_4e

    .line 1324
    .line 1325
    :cond_4d
    move/from16 v2, v24

    .line 1326
    .line 1327
    goto :goto_17

    .line 1328
    :cond_4e
    move v2, v10

    .line 1329
    :goto_17
    packed-switch v11, :pswitch_data_a

    .line 1330
    .line 1331
    .line 1332
    const/4 v0, -0x1

    .line 1333
    const/4 v13, -0x1

    .line 1334
    goto/16 :goto_19

    .line 1335
    .line 1336
    :pswitch_37
    const/high16 v13, 0x800000

    .line 1337
    .line 1338
    :goto_18
    const/4 v0, -0x1

    .line 1339
    goto/16 :goto_19

    .line 1340
    .line 1341
    :pswitch_38
    const/high16 v13, 0x400000

    .line 1342
    .line 1343
    goto :goto_18

    .line 1344
    :pswitch_39
    const/high16 v13, 0x200000

    .line 1345
    .line 1346
    goto :goto_18

    .line 1347
    :pswitch_3a
    const/high16 v13, 0x100000

    .line 1348
    .line 1349
    goto :goto_18

    .line 1350
    :pswitch_3b
    const/high16 v13, 0x80000

    .line 1351
    .line 1352
    goto :goto_18

    .line 1353
    :pswitch_3c
    const/high16 v13, 0x40000

    .line 1354
    .line 1355
    goto :goto_18

    .line 1356
    :pswitch_3d
    const/high16 v13, 0x20000

    .line 1357
    .line 1358
    goto :goto_18

    .line 1359
    :pswitch_3e
    move v13, v5

    .line 1360
    goto :goto_18

    .line 1361
    :pswitch_3f
    move v13, v4

    .line 1362
    goto :goto_18

    .line 1363
    :pswitch_40
    move v13, v3

    .line 1364
    goto :goto_18

    .line 1365
    :pswitch_41
    move v13, v7

    .line 1366
    goto :goto_18

    .line 1367
    :pswitch_42
    move/from16 v13, v24

    .line 1368
    .line 1369
    goto :goto_18

    .line 1370
    :pswitch_43
    move/from16 v13, v23

    .line 1371
    .line 1372
    goto :goto_18

    .line 1373
    :pswitch_44
    move/from16 v13, v30

    .line 1374
    .line 1375
    goto :goto_18

    .line 1376
    :pswitch_45
    move/from16 v13, v25

    .line 1377
    .line 1378
    goto :goto_18

    .line 1379
    :pswitch_46
    move/from16 v13, v26

    .line 1380
    .line 1381
    goto :goto_18

    .line 1382
    :pswitch_47
    move/from16 v13, v27

    .line 1383
    .line 1384
    goto :goto_18

    .line 1385
    :pswitch_48
    move/from16 v13, v28

    .line 1386
    .line 1387
    goto :goto_18

    .line 1388
    :pswitch_49
    move/from16 v13, v29

    .line 1389
    .line 1390
    goto :goto_18

    .line 1391
    :pswitch_4a
    move v13, v6

    .line 1392
    goto :goto_18

    .line 1393
    :pswitch_4b
    move v13, v1

    .line 1394
    goto :goto_18

    .line 1395
    :pswitch_4c
    move v13, v9

    .line 1396
    goto :goto_18

    .line 1397
    :pswitch_4d
    move v13, v10

    .line 1398
    goto :goto_18

    .line 1399
    :pswitch_4e
    move/from16 v13, v32

    .line 1400
    .line 1401
    goto :goto_18

    .line 1402
    :goto_19
    if-ne v13, v0, :cond_4f

    .line 1403
    .line 1404
    const-string v0, "Unknown AV1 level: "

    .line 1405
    .line 1406
    invoke-static {v11, v0, v15}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 1407
    .line 1408
    .line 1409
    return-object v20

    .line 1410
    :cond_4f
    new-instance v0, Landroid/util/Pair;

    .line 1411
    .line 1412
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v1

    .line 1416
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v2

    .line 1420
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1421
    .line 1422
    .line 1423
    return-object v0

    .line 1424
    :catch_4
    invoke-static {v8, v2, v15}, LN0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1425
    .line 1426
    .line 1427
    :cond_50
    :goto_1a
    return-object v20

    .line 1428
    nop

    .line 1429
    :sswitch_data_0
    .sparse-switch
        0x600 -> :sswitch_a
        0x601 -> :sswitch_9
        0x602 -> :sswitch_8
        0x603 -> :sswitch_7
        0x604 -> :sswitch_6
        0x605 -> :sswitch_5
        0x606 -> :sswitch_4
        0x607 -> :sswitch_3
        0x608 -> :sswitch_2
        0x609 -> :sswitch_1
        0x61f -> :sswitch_0
    .end sparse-switch

    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    :sswitch_data_1
    .sparse-switch
        0x601 -> :sswitch_17
        0x602 -> :sswitch_16
        0x603 -> :sswitch_15
        0x604 -> :sswitch_14
        0x605 -> :sswitch_13
        0x606 -> :sswitch_12
        0x607 -> :sswitch_11
        0x608 -> :sswitch_10
        0x609 -> :sswitch_f
        0x61f -> :sswitch_e
        0x620 -> :sswitch_d
        0x621 -> :sswitch_c
        0x622 -> :sswitch_b
    .end sparse-switch

    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch

    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    :sswitch_data_2
    .sparse-switch
        0x2dd8f6 -> :sswitch_1f
        0x2ddf23 -> :sswitch_1e
        0x2ddf24 -> :sswitch_1d
        0x30d038 -> :sswitch_1c
        0x310dbc -> :sswitch_1b
        0x333790 -> :sswitch_1a
        0x35091c -> :sswitch_19
        0x374e43 -> :sswitch_18
    .end sparse-switch

    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_36
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_24
        :pswitch_1d
        :pswitch_1c
        :pswitch_18
    .end packed-switch

    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    :pswitch_data_3
    .packed-switch 0x3c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
    .end packed-switch

    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
    .end packed-switch

    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    :pswitch_data_5
    .packed-switch 0xa
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
    .end packed-switch

    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    :pswitch_data_6
    .packed-switch 0x14
        :pswitch_31
        :pswitch_30
        :pswitch_2f
    .end packed-switch

    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    :pswitch_data_7
    .packed-switch 0x1e
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
    .end packed-switch

    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    :pswitch_data_8
    .packed-switch 0x28
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
    .end packed-switch

    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    :pswitch_data_9
    .packed-switch 0x32
        :pswitch_28
        :pswitch_27
        :pswitch_26
    .end packed-switch

    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    :pswitch_data_a
    .packed-switch 0x0
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
    .end packed-switch
.end method

.method public static declared-synchronized e(Ljava/lang/String;ZZ)Ljava/util/List;
    .locals 6

    .line 1
    const-string v0, "MediaCodecList API didn\'t list secure decoder for: "

    .line 2
    .line 3
    const-class v1, Ld2/v;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    new-instance v2, Ld2/r;

    .line 7
    .line 8
    invoke-direct {v2, p0, p1, p2}, Ld2/r;-><init>(Ljava/lang/String;ZZ)V

    .line 9
    .line 10
    .line 11
    sget-object v3, Ld2/v;->a:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    monitor-exit v1

    .line 22
    return-object v4

    .line 23
    :cond_0
    :try_start_1
    new-instance v4, LV5/w;

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    invoke-direct {v4, v5, p1, p2}, LV5/w;-><init>(IZZ)V

    .line 27
    .line 28
    .line 29
    invoke-static {v2, v4}, Ld2/v;->f(Ld2/r;Ld2/t;)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    sget p1, LQ1/x;->a:I

    .line 42
    .line 43
    const/16 v4, 0x17

    .line 44
    .line 45
    if-gt p1, v4, :cond_1

    .line 46
    .line 47
    new-instance p1, Landroidx/fragment/app/X;

    .line 48
    .line 49
    const/4 p2, 0x4

    .line 50
    invoke-direct {p1, p2}, Landroidx/fragment/app/X;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-static {v2, p1}, Ld2/v;->f(Ld2/r;Ld2/t;)Ljava/util/ArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_1

    .line 62
    .line 63
    const-string p1, "MediaCodecUtil"

    .line 64
    .line 65
    new-instance v4, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v0, ". Assuming: "

    .line 74
    .line 75
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Ld2/m;

    .line 84
    .line 85
    iget-object v0, v0, Ld2/m;->a:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {p1, v0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catchall_0
    move-exception p0

    .line 99
    goto :goto_1

    .line 100
    :cond_1
    :goto_0
    invoke-static {p0, p2}, Ld2/v;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p2}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {v3, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    .line 109
    .line 110
    monitor-exit v1

    .line 111
    return-object p0

    .line 112
    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 113
    throw p0
.end method

.method public static f(Ld2/r;Ld2/t;)Ljava/util/ArrayList;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v3, "secure-playback"

    .line 6
    .line 7
    const-string v4, "tunneled-playback"

    .line 8
    .line 9
    :try_start_0
    new-instance v5, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v7, v1, Ld2/r;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {v2}, Ld2/t;->e()I

    .line 17
    .line 18
    .line 19
    move-result v12

    .line 20
    invoke-interface {v2}, Ld2/t;->g()Z

    .line 21
    .line 22
    .line 23
    move-result v13

    .line 24
    const/4 v0, 0x0

    .line 25
    move v14, v0

    .line 26
    :goto_0
    if-ge v14, v12, :cond_f

    .line 27
    .line 28
    invoke-interface {v2, v14}, Ld2/t;->b(I)Landroid/media/MediaCodecInfo;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget v6, LQ1/x;->a:I

    .line 33
    .line 34
    const/16 v8, 0x1d

    .line 35
    .line 36
    if-lt v6, v8, :cond_0

    .line 37
    .line 38
    invoke-static {v0}, Ld2/n;->x(Landroid/media/MediaCodecInfo;)Z

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    if-eqz v9, :cond_0

    .line 43
    .line 44
    goto/16 :goto_7

    .line 45
    .line 46
    :cond_0
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    invoke-static {v0, v9, v13, v7}, Ld2/v;->h(Landroid/media/MediaCodecInfo;Ljava/lang/String;ZLjava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    if-nez v10, :cond_1

    .line 55
    .line 56
    goto/16 :goto_7

    .line 57
    .line 58
    :cond_1
    invoke-static {v0, v9, v7}, Ld2/v;->c(Landroid/media/MediaCodecInfo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    .line 62
    if-nez v10, :cond_2

    .line 63
    .line 64
    goto/16 :goto_7

    .line 65
    .line 66
    :cond_2
    move-object v11, v9

    .line 67
    :try_start_1
    invoke-virtual {v0, v10}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    invoke-interface {v2, v4, v10, v9}, Ld2/t;->c(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 72
    .line 73
    .line 74
    move-result v15

    .line 75
    invoke-interface {v2, v4, v9}, Ld2/t;->d(Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 76
    .line 77
    .line 78
    move-result v16

    .line 79
    iget-boolean v8, v1, Ld2/r;->c:Z

    .line 80
    .line 81
    if-nez v8, :cond_3

    .line 82
    .line 83
    if-nez v16, :cond_d

    .line 84
    .line 85
    :cond_3
    if-eqz v8, :cond_4

    .line 86
    .line 87
    if-nez v15, :cond_4

    .line 88
    .line 89
    goto/16 :goto_7

    .line 90
    .line 91
    :cond_4
    invoke-interface {v2, v3, v10, v9}, Ld2/t;->c(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    invoke-interface {v2, v3, v9}, Ld2/t;->d(Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 96
    .line 97
    .line 98
    move-result v15
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 99
    iget-boolean v2, v1, Ld2/r;->b:Z

    .line 100
    .line 101
    if-nez v2, :cond_5

    .line 102
    .line 103
    if-nez v15, :cond_d

    .line 104
    .line 105
    :cond_5
    if-eqz v2, :cond_6

    .line 106
    .line 107
    if-nez v8, :cond_6

    .line 108
    .line 109
    goto/16 :goto_7

    .line 110
    .line 111
    :cond_6
    const/16 v15, 0x1d

    .line 112
    .line 113
    if-lt v6, v15, :cond_7

    .line 114
    .line 115
    :try_start_2
    invoke-static {v0}, Ld2/n;->j(Landroid/media/MediaCodecInfo;)Z

    .line 116
    .line 117
    .line 118
    move-result v15

    .line 119
    goto :goto_1

    .line 120
    :cond_7
    invoke-static {v0, v7}, Ld2/v;->i(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v15

    .line 124
    xor-int/lit8 v15, v15, 0x1

    .line 125
    .line 126
    :goto_1
    invoke-static {v0, v7}, Ld2/v;->i(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-object/from16 v16, v0

    .line 130
    .line 131
    const/16 v0, 0x1d

    .line 132
    .line 133
    if-lt v6, v0, :cond_8

    .line 134
    .line 135
    invoke-static/range {v16 .. v16}, Ld2/n;->v(Landroid/media/MediaCodecInfo;)Z

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_8
    invoke-virtual/range {v16 .. v16}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-static {v0}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const-string v6, "omx.google."

    .line 148
    .line 149
    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-nez v6, :cond_9

    .line 154
    .line 155
    const-string v6, "c2.android."

    .line 156
    .line 157
    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    if-nez v6, :cond_9

    .line 162
    .line 163
    const-string v6, "c2.google."

    .line 164
    .line 165
    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    move-result v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 169
    :cond_9
    :goto_2
    if-eqz v13, :cond_b

    .line 170
    .line 171
    if-eq v2, v8, :cond_a

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_a
    :goto_3
    move-object v6, v11

    .line 175
    goto :goto_5

    .line 176
    :cond_b
    :goto_4
    if-nez v13, :cond_c

    .line 177
    .line 178
    if-nez v2, :cond_c

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :goto_5
    const/4 v11, 0x0

    .line 182
    move-object v8, v10

    .line 183
    move v10, v15

    .line 184
    :try_start_3
    invoke-static/range {v6 .. v11}, Ld2/m;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZ)Ld2/m;

    .line 185
    .line 186
    .line 187
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 188
    move-object v2, v6

    .line 189
    move-object v6, v8

    .line 190
    :try_start_4
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_7

    .line 194
    :catch_0
    move-exception v0

    .line 195
    move-object v8, v6

    .line 196
    goto :goto_6

    .line 197
    :catch_1
    move-exception v0

    .line 198
    move-object v2, v6

    .line 199
    move-object v6, v8

    .line 200
    goto :goto_6

    .line 201
    :cond_c
    move-object v6, v10

    .line 202
    move-object v2, v11

    .line 203
    move v10, v15

    .line 204
    if-nez v13, :cond_d

    .line 205
    .line 206
    if-eqz v8, :cond_d

    .line 207
    .line 208
    new-instance v0, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    const-string v8, ".secure"

    .line 217
    .line 218
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 225
    const/4 v11, 0x1

    .line 226
    move-object v8, v6

    .line 227
    move-object v6, v0

    .line 228
    :try_start_5
    invoke-static/range {v6 .. v11}, Ld2/m;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZ)Ld2/m;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 233
    .line 234
    .line 235
    goto :goto_8

    .line 236
    :catch_2
    move-exception v0

    .line 237
    goto :goto_6

    .line 238
    :catch_3
    move-exception v0

    .line 239
    move-object v8, v10

    .line 240
    move-object v2, v11

    .line 241
    :goto_6
    :try_start_6
    sget v6, LQ1/x;->a:I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 242
    .line 243
    const/16 v9, 0x17

    .line 244
    .line 245
    const-string v10, "MediaCodecUtil"

    .line 246
    .line 247
    if-gt v6, v9, :cond_e

    .line 248
    .line 249
    :try_start_7
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    if-nez v6, :cond_e

    .line 254
    .line 255
    new-instance v0, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    const-string v6, "Skipping codec "

    .line 261
    .line 262
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    const-string v2, " (failed to query capabilities)"

    .line 269
    .line 270
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-static {v10, v0}, LQ1/k;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    :cond_d
    :goto_7
    add-int/lit8 v14, v14, 0x1

    .line 281
    .line 282
    move-object/from16 v2, p1

    .line 283
    .line 284
    goto/16 :goto_0

    .line 285
    .line 286
    :cond_e
    new-instance v1, Ljava/lang/StringBuilder;

    .line 287
    .line 288
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 289
    .line 290
    .line 291
    const-string v3, "Failed to query codec "

    .line 292
    .line 293
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    const-string v2, " ("

    .line 300
    .line 301
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    const-string v2, ")"

    .line 308
    .line 309
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-static {v10, v1}, LQ1/k;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    .line 320
    :cond_f
    :goto_8
    return-object v5

    .line 321
    :catch_4
    move-exception v0

    .line 322
    new-instance v1, Ld2/s;

    .line 323
    .line 324
    const-string v2, "Failed to query underlying media codecs"

    .line 325
    .line 326
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 327
    .line 328
    .line 329
    throw v1
.end method

.method public static g(Ld2/h;LN1/n;ZZ)Ll8/e0;
    .locals 1

    .line 1
    iget-object v0, p1, LN1/n;->n:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p2, p3}, Ld2/v;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {p1}, Ld2/v;->b(LN1/n;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    sget-object p0, Ll8/e0;->e:Ll8/e0;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2, p3}, Ld2/v;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1, v0}, Ll8/E;->d(Ljava/lang/Iterable;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p0}, Ll8/E;->d(Ljava/lang/Iterable;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ll8/H;->g()Ll8/e0;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public static h(Landroid/media/MediaCodecInfo;Ljava/lang/String;ZLjava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_4

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    const-string p0, ".secure"

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :cond_0
    sget p0, LQ1/x;->a:I

    .line 20
    .line 21
    const/16 p2, 0x18

    .line 22
    .line 23
    if-ge p0, p2, :cond_2

    .line 24
    .line 25
    const-string p2, "OMX.SEC.aac.dec"

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-nez p2, :cond_1

    .line 32
    .line 33
    const-string p2, "OMX.Exynos.AAC.Decoder"

    .line 34
    .line 35
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    :cond_1
    const-string p2, "samsung"

    .line 42
    .line 43
    sget-object v0, LQ1/x;->c:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    sget-object p2, LQ1/x;->b:Ljava/lang/String;

    .line 52
    .line 53
    const-string v0, "zeroflte"

    .line 54
    .line 55
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_4

    .line 60
    .line 61
    const-string v0, "zerolte"

    .line 62
    .line 63
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    const-string v0, "zenlte"

    .line 70
    .line 71
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_4

    .line 76
    .line 77
    const-string v0, "SC-05G"

    .line 78
    .line 79
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_4

    .line 84
    .line 85
    const-string v0, "marinelteatt"

    .line 86
    .line 87
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_4

    .line 92
    .line 93
    const-string v0, "404SC"

    .line 94
    .line 95
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_4

    .line 100
    .line 101
    const-string v0, "SC-04G"

    .line 102
    .line 103
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_4

    .line 108
    .line 109
    const-string v0, "SCV31"

    .line 110
    .line 111
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    if-eqz p2, :cond_2

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    const/16 p2, 0x17

    .line 119
    .line 120
    if-gt p0, p2, :cond_3

    .line 121
    .line 122
    const-string p0, "audio/eac3-joc"

    .line 123
    .line 124
    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-eqz p0, :cond_3

    .line 129
    .line 130
    const-string p0, "OMX.MTK.AUDIO.DECODER.DSPAC3"

    .line 131
    .line 132
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-eqz p0, :cond_3

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_3
    const/4 p0, 0x1

    .line 140
    return p0

    .line 141
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 142
    return p0
.end method

.method public static i(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, LQ1/x;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Ld2/n;->h(Landroid/media/MediaCodecInfo;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-static {p1}, LN1/C;->i(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string p1, "arc."

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const-string p1, "omx.google."

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_5

    .line 43
    .line 44
    const-string p1, "omx.ffmpeg."

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_5

    .line 51
    .line 52
    const-string p1, "omx.sec."

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    const-string p1, ".sw."

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_5

    .line 67
    .line 68
    :cond_3
    const-string p1, "omx.qcom.video.decoder.hevcswvdec"

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_5

    .line 75
    .line 76
    const-string p1, "c2.android."

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    const-string p1, "c2.google."

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-nez p1, :cond_5

    .line 91
    .line 92
    const-string p1, "omx."

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_4

    .line 99
    .line 100
    const-string p1, "c2."

    .line 101
    .line 102
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-nez p0, :cond_4

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 110
    return p0

    .line 111
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 112
    return p0
.end method
