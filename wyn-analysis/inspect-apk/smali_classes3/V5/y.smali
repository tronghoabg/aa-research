.class public abstract LV5/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/regex/Pattern;

.field public static final b:Ljava/util/HashMap;

.field public static c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "^\\D?(\\d+)$"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LV5/y;->a:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    new-instance v0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, LV5/y;->b:Ljava/util/HashMap;

    .line 15
    .line 16
    const/4 v0, -0x1

    .line 17
    sput v0, LV5/y;->c:I

    .line 18
    .line 19
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
    sget p0, Lu6/v;->a:I

    .line 12
    .line 13
    const/16 v2, 0x1a

    .line 14
    .line 15
    if-ge p0, v2, :cond_0

    .line 16
    .line 17
    sget-object p0, Lu6/v;->b:Ljava/lang/String;

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
    check-cast p0, LV5/n;

    .line 38
    .line 39
    iget-object p0, p0, LV5/n;->a:Ljava/lang/String;

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
    invoke-static/range {v2 .. v7}, LV5/n;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZ)LV5/n;

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
    new-instance p0, LV5/r;

    .line 66
    .line 67
    const/4 v2, 0x1

    .line 68
    invoke-direct {p0, v2}, LV5/r;-><init>(I)V

    .line 69
    .line 70
    .line 71
    new-instance v2, LV5/s;

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-direct {v2, p0, v3}, LV5/s;-><init>(Ljava/lang/Object;I)V

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 78
    .line 79
    .line 80
    :cond_1
    sget p0, Lu6/v;->a:I

    .line 81
    .line 82
    const/16 v2, 0x15

    .line 83
    .line 84
    if-ge p0, v2, :cond_3

    .line 85
    .line 86
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-le v2, v0, :cond_3

    .line 91
    .line 92
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, LV5/n;

    .line 97
    .line 98
    iget-object v2, v2, LV5/n;->a:Ljava/lang/String;

    .line 99
    .line 100
    const-string v3, "OMX.SEC.mp3.dec"

    .line 101
    .line 102
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-nez v3, :cond_2

    .line 107
    .line 108
    const-string v3, "OMX.SEC.MP3.Decoder"

    .line 109
    .line 110
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-nez v3, :cond_2

    .line 115
    .line 116
    const-string v3, "OMX.brcm.audio.mp3.decoder"

    .line 117
    .line 118
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_3

    .line 123
    .line 124
    :cond_2
    new-instance v2, LV5/r;

    .line 125
    .line 126
    const/4 v3, 0x2

    .line 127
    invoke-direct {v2, v3}, LV5/r;-><init>(I)V

    .line 128
    .line 129
    .line 130
    new-instance v3, LV5/s;

    .line 131
    .line 132
    const/4 v4, 0x0

    .line 133
    invoke-direct {v3, v2, v4}, LV5/s;-><init>(Ljava/lang/Object;I)V

    .line 134
    .line 135
    .line 136
    invoke-static {p1, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 137
    .line 138
    .line 139
    :cond_3
    const/16 v2, 0x20

    .line 140
    .line 141
    if-ge p0, v2, :cond_4

    .line 142
    .line 143
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    if-le p0, v0, :cond_4

    .line 148
    .line 149
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    check-cast p0, LV5/n;

    .line 154
    .line 155
    iget-object p0, p0, LV5/n;->a:Ljava/lang/String;

    .line 156
    .line 157
    const-string v0, "OMX.qti.audio.decoder.flac"

    .line 158
    .line 159
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    if-eqz p0, :cond_4

    .line 164
    .line 165
    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    check-cast p0, LV5/n;

    .line 170
    .line 171
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    :cond_4
    return-void
.end method

.method public static b(LE5/T;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, LE5/T;->l:Ljava/lang/String;

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
    iget-object v1, p0, LE5/T;->l:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-static {p0}, LV5/y;->d(LE5/T;)Landroid/util/Pair;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    const/16 v0, 0x10

    .line 39
    .line 40
    if-eq p0, v0, :cond_2

    .line 41
    .line 42
    const/16 v0, 0x100

    .line 43
    .line 44
    if-ne p0, v0, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/16 v0, 0x200

    .line 48
    .line 49
    if-ne p0, v0, :cond_3

    .line 50
    .line 51
    const-string p0, "video/avc"

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_2
    :goto_0
    const-string p0, "video/hevc"

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_3
    const/4 p0, 0x0

    .line 58
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
    if-eqz p0, :cond_7

    .line 55
    .line 56
    :cond_3
    const-string p0, "video/dv_hevc"

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_4
    const-string p0, "audio/alac"

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
    const-string p0, "OMX.lge.alac.decoder"

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_5

    .line 74
    .line 75
    const-string p0, "audio/x-lg-alac"

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_5
    const-string p0, "audio/flac"

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
    const-string p0, "OMX.lge.flac.decoder"

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
    const-string p0, "audio/x-lg-flac"

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_6
    const-string p0, "audio/ac3"

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
    const-string p0, "OMX.lge.ac3.decoder"

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
    const-string p0, "audio/lg-ac3"

    .line 114
    .line 115
    return-object p0

    .line 116
    :cond_7
    const/4 p0, 0x0

    .line 117
    return-object p0
.end method

.method public static d(LE5/T;)Landroid/util/Pair;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "04"

    .line 4
    .line 5
    const-string v2, "03"

    .line 6
    .line 7
    const-string v3, "02"

    .line 8
    .line 9
    const-string v4, "01"

    .line 10
    .line 11
    sget-object v5, LV5/y;->a:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    const/16 v10, 0xb

    .line 14
    .line 15
    const/16 v12, 0xa

    .line 16
    .line 17
    const/16 v16, 0x5

    .line 18
    .line 19
    const v17, 0x8000

    .line 20
    .line 21
    .line 22
    const/16 v18, 0x4000

    .line 23
    .line 24
    const/4 v8, -0x1

    .line 25
    const/4 v11, 0x3

    .line 26
    const/4 v13, 0x1

    .line 27
    const/16 v19, 0x8

    .line 28
    .line 29
    const/16 v20, 0x0

    .line 30
    .line 31
    const/4 v7, 0x2

    .line 32
    iget-object v15, v0, LE5/T;->i:Ljava/lang/String;

    .line 33
    .line 34
    const/16 v21, 0x0

    .line 35
    .line 36
    if-nez v15, :cond_0

    .line 37
    .line 38
    return-object v21

    .line 39
    :cond_0
    const/16 v22, 0x4

    .line 40
    .line 41
    const-string v14, "\\."

    .line 42
    .line 43
    invoke-virtual {v15, v14}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v14

    .line 47
    const-string v15, "video/dolby-vision"

    .line 48
    .line 49
    const/16 v23, 0x10

    .line 50
    .line 51
    iget-object v6, v0, LE5/T;->l:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v15, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    const/16 v24, 0x800

    .line 58
    .line 59
    const/16 v25, 0x1000

    .line 60
    .line 61
    const/16 v26, 0x200

    .line 62
    .line 63
    const/16 v27, 0x100

    .line 64
    .line 65
    const/16 v28, 0x80

    .line 66
    .line 67
    const/16 v29, 0x40

    .line 68
    .line 69
    const/16 v30, 0x20

    .line 70
    .line 71
    const/16 v31, 0x400

    .line 72
    .line 73
    const-string v15, "MediaCodecUtil"

    .line 74
    .line 75
    iget-object v9, v0, LE5/T;->i:Ljava/lang/String;

    .line 76
    .line 77
    if-eqz v6, :cond_1e

    .line 78
    .line 79
    array-length v0, v14

    .line 80
    const-string v6, "Ignoring malformed Dolby Vision codec string: "

    .line 81
    .line 82
    if-ge v0, v11, :cond_1

    .line 83
    .line 84
    invoke-static {v6, v9, v15}, LR8/v;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-object v21

    .line 88
    :cond_1
    aget-object v0, v14, v13

    .line 89
    .line 90
    invoke-virtual {v5, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-nez v5, :cond_2

    .line 99
    .line 100
    invoke-static {v6, v9, v15}, LR8/v;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-object v21

    .line 104
    :cond_2
    invoke-virtual {v0, v13}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-nez v0, :cond_3

    .line 109
    .line 110
    :goto_0
    move-object/from16 v5, v21

    .line 111
    .line 112
    goto/16 :goto_3

    .line 113
    .line 114
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    packed-switch v5, :pswitch_data_0

    .line 119
    .line 120
    .line 121
    :goto_1
    move v5, v8

    .line 122
    goto/16 :goto_2

    .line 123
    .line 124
    :pswitch_0
    const-string v5, "09"

    .line 125
    .line 126
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    if-nez v5, :cond_4

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_4
    const/16 v5, 0x9

    .line 134
    .line 135
    goto/16 :goto_2

    .line 136
    .line 137
    :pswitch_1
    const-string v5, "08"

    .line 138
    .line 139
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    if-nez v5, :cond_5

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_5
    move/from16 v5, v19

    .line 147
    .line 148
    goto/16 :goto_2

    .line 149
    .line 150
    :pswitch_2
    const-string v5, "07"

    .line 151
    .line 152
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-nez v5, :cond_6

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_6
    const/4 v5, 0x7

    .line 160
    goto :goto_2

    .line 161
    :pswitch_3
    const-string v5, "06"

    .line 162
    .line 163
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-nez v5, :cond_7

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_7
    const/4 v5, 0x6

    .line 171
    goto :goto_2

    .line 172
    :pswitch_4
    const-string v5, "05"

    .line 173
    .line 174
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-nez v5, :cond_8

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_8
    move/from16 v5, v16

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :pswitch_5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    if-nez v5, :cond_9

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_9
    move/from16 v5, v22

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :pswitch_6
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    if-nez v5, :cond_a

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_a
    move v5, v11

    .line 202
    goto :goto_2

    .line 203
    :pswitch_7
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    if-nez v5, :cond_b

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_b
    move v5, v7

    .line 211
    goto :goto_2

    .line 212
    :pswitch_8
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    if-nez v5, :cond_c

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_c
    move v5, v13

    .line 220
    goto :goto_2

    .line 221
    :pswitch_9
    const-string v5, "00"

    .line 222
    .line 223
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    if-nez v5, :cond_d

    .line 228
    .line 229
    goto :goto_1

    .line 230
    :cond_d
    move/from16 v5, v20

    .line 231
    .line 232
    :goto_2
    packed-switch v5, :pswitch_data_1

    .line 233
    .line 234
    .line 235
    goto :goto_0

    .line 236
    :pswitch_a
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    goto :goto_3

    .line 241
    :pswitch_b
    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    goto :goto_3

    .line 246
    :pswitch_c
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    goto :goto_3

    .line 251
    :pswitch_d
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    goto :goto_3

    .line 256
    :pswitch_e
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    goto :goto_3

    .line 261
    :pswitch_f
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    goto :goto_3

    .line 266
    :pswitch_10
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    goto :goto_3

    .line 271
    :pswitch_11
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    goto :goto_3

    .line 276
    :pswitch_12
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    goto :goto_3

    .line 281
    :pswitch_13
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    :goto_3
    if-nez v5, :cond_e

    .line 286
    .line 287
    const-string v1, "Unknown Dolby Vision profile string: "

    .line 288
    .line 289
    invoke-static {v1, v0, v15}, LR8/v;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    return-object v21

    .line 293
    :cond_e
    aget-object v0, v14, v7

    .line 294
    .line 295
    if-nez v0, :cond_f

    .line 296
    .line 297
    :goto_4
    move-object/from16 v1, v21

    .line 298
    .line 299
    goto/16 :goto_7

    .line 300
    .line 301
    :cond_f
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    sparse-switch v6, :sswitch_data_0

    .line 306
    .line 307
    .line 308
    :goto_5
    move v10, v8

    .line 309
    goto/16 :goto_6

    .line 310
    .line 311
    :sswitch_0
    const-string v1, "13"

    .line 312
    .line 313
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    if-nez v1, :cond_10

    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_10
    const/16 v10, 0xc

    .line 321
    .line 322
    goto/16 :goto_6

    .line 323
    .line 324
    :sswitch_1
    const-string v1, "12"

    .line 325
    .line 326
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-nez v1, :cond_1c

    .line 331
    .line 332
    goto :goto_5

    .line 333
    :sswitch_2
    const-string v1, "11"

    .line 334
    .line 335
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    if-nez v1, :cond_11

    .line 340
    .line 341
    goto :goto_5

    .line 342
    :cond_11
    move v10, v12

    .line 343
    goto/16 :goto_6

    .line 344
    .line 345
    :sswitch_3
    const-string v1, "10"

    .line 346
    .line 347
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    if-nez v1, :cond_12

    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_12
    const/16 v10, 0x9

    .line 355
    .line 356
    goto/16 :goto_6

    .line 357
    .line 358
    :sswitch_4
    const-string v1, "09"

    .line 359
    .line 360
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    if-nez v1, :cond_13

    .line 365
    .line 366
    goto :goto_5

    .line 367
    :cond_13
    move/from16 v10, v19

    .line 368
    .line 369
    goto/16 :goto_6

    .line 370
    .line 371
    :sswitch_5
    const-string v1, "08"

    .line 372
    .line 373
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    if-nez v1, :cond_14

    .line 378
    .line 379
    goto :goto_5

    .line 380
    :cond_14
    const/4 v10, 0x7

    .line 381
    goto :goto_6

    .line 382
    :sswitch_6
    const-string v1, "07"

    .line 383
    .line 384
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    if-nez v1, :cond_15

    .line 389
    .line 390
    goto :goto_5

    .line 391
    :cond_15
    const/4 v10, 0x6

    .line 392
    goto :goto_6

    .line 393
    :sswitch_7
    const-string v1, "06"

    .line 394
    .line 395
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    if-nez v1, :cond_16

    .line 400
    .line 401
    goto :goto_5

    .line 402
    :cond_16
    move/from16 v10, v16

    .line 403
    .line 404
    goto :goto_6

    .line 405
    :sswitch_8
    const-string v1, "05"

    .line 406
    .line 407
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    if-nez v1, :cond_17

    .line 412
    .line 413
    goto :goto_5

    .line 414
    :cond_17
    move/from16 v10, v22

    .line 415
    .line 416
    goto :goto_6

    .line 417
    :sswitch_9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    if-nez v1, :cond_18

    .line 422
    .line 423
    goto :goto_5

    .line 424
    :cond_18
    move v10, v11

    .line 425
    goto :goto_6

    .line 426
    :sswitch_a
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    if-nez v1, :cond_19

    .line 431
    .line 432
    goto :goto_5

    .line 433
    :cond_19
    move v10, v7

    .line 434
    goto :goto_6

    .line 435
    :sswitch_b
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    if-nez v1, :cond_1a

    .line 440
    .line 441
    goto/16 :goto_5

    .line 442
    .line 443
    :cond_1a
    move v10, v13

    .line 444
    goto :goto_6

    .line 445
    :sswitch_c
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    if-nez v1, :cond_1b

    .line 450
    .line 451
    goto/16 :goto_5

    .line 452
    .line 453
    :cond_1b
    move/from16 v10, v20

    .line 454
    .line 455
    :cond_1c
    :goto_6
    packed-switch v10, :pswitch_data_2

    .line 456
    .line 457
    .line 458
    goto/16 :goto_4

    .line 459
    .line 460
    :pswitch_14
    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    goto :goto_7

    .line 465
    :pswitch_15
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    goto :goto_7

    .line 470
    :pswitch_16
    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    goto :goto_7

    .line 475
    :pswitch_17
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    goto :goto_7

    .line 480
    :pswitch_18
    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    goto :goto_7

    .line 485
    :pswitch_19
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    goto :goto_7

    .line 490
    :pswitch_1a
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    goto :goto_7

    .line 495
    :pswitch_1b
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    goto :goto_7

    .line 500
    :pswitch_1c
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    goto :goto_7

    .line 505
    :pswitch_1d
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    goto :goto_7

    .line 510
    :pswitch_1e
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    goto :goto_7

    .line 515
    :pswitch_1f
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    goto :goto_7

    .line 520
    :pswitch_20
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    :goto_7
    if-nez v1, :cond_1d

    .line 525
    .line 526
    const-string v1, "Unknown Dolby Vision level string: "

    .line 527
    .line 528
    invoke-static {v1, v0, v15}, LR8/v;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    return-object v21

    .line 532
    :cond_1d
    new-instance v0, Landroid/util/Pair;

    .line 533
    .line 534
    invoke-direct {v0, v5, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 535
    .line 536
    .line 537
    return-object v0

    .line 538
    :cond_1e
    aget-object v1, v14, v20

    .line 539
    .line 540
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    const/high16 v2, 0x10000

    .line 544
    .line 545
    const/16 v3, 0x2000

    .line 546
    .line 547
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    sparse-switch v4, :sswitch_data_1

    .line 552
    .line 553
    .line 554
    :goto_8
    move v1, v8

    .line 555
    goto :goto_9

    .line 556
    :sswitch_d
    const-string v4, "vp09"

    .line 557
    .line 558
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v1

    .line 562
    if-nez v1, :cond_1f

    .line 563
    .line 564
    goto :goto_8

    .line 565
    :cond_1f
    const/4 v1, 0x6

    .line 566
    goto :goto_9

    .line 567
    :sswitch_e
    const-string v4, "mp4a"

    .line 568
    .line 569
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v1

    .line 573
    if-nez v1, :cond_20

    .line 574
    .line 575
    goto :goto_8

    .line 576
    :cond_20
    move/from16 v1, v16

    .line 577
    .line 578
    goto :goto_9

    .line 579
    :sswitch_f
    const-string v4, "hvc1"

    .line 580
    .line 581
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v1

    .line 585
    if-nez v1, :cond_21

    .line 586
    .line 587
    goto :goto_8

    .line 588
    :cond_21
    move/from16 v1, v22

    .line 589
    .line 590
    goto :goto_9

    .line 591
    :sswitch_10
    const-string v4, "hev1"

    .line 592
    .line 593
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result v1

    .line 597
    if-nez v1, :cond_22

    .line 598
    .line 599
    goto :goto_8

    .line 600
    :cond_22
    move v1, v11

    .line 601
    goto :goto_9

    .line 602
    :sswitch_11
    const-string v4, "avc2"

    .line 603
    .line 604
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    move-result v1

    .line 608
    if-nez v1, :cond_23

    .line 609
    .line 610
    goto :goto_8

    .line 611
    :cond_23
    move v1, v7

    .line 612
    goto :goto_9

    .line 613
    :sswitch_12
    const-string v4, "avc1"

    .line 614
    .line 615
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    move-result v1

    .line 619
    if-nez v1, :cond_24

    .line 620
    .line 621
    goto :goto_8

    .line 622
    :cond_24
    move v1, v13

    .line 623
    goto :goto_9

    .line 624
    :sswitch_13
    const-string v4, "av01"

    .line 625
    .line 626
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result v1

    .line 630
    if-nez v1, :cond_25

    .line 631
    .line 632
    goto :goto_8

    .line 633
    :cond_25
    move/from16 v1, v20

    .line 634
    .line 635
    :goto_9
    packed-switch v1, :pswitch_data_3

    .line 636
    .line 637
    .line 638
    return-object v21

    .line 639
    :pswitch_21
    array-length v0, v14

    .line 640
    const-string v1, "Ignoring malformed VP9 codec string: "

    .line 641
    .line 642
    if-ge v0, v11, :cond_26

    .line 643
    .line 644
    invoke-static {v1, v9, v15}, LR8/v;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    return-object v21

    .line 648
    :cond_26
    :try_start_0
    aget-object v0, v14, v13

    .line 649
    .line 650
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 651
    .line 652
    .line 653
    move-result v0

    .line 654
    aget-object v2, v14, v7

    .line 655
    .line 656
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 657
    .line 658
    .line 659
    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 660
    if-eqz v0, :cond_2a

    .line 661
    .line 662
    if-eq v0, v13, :cond_29

    .line 663
    .line 664
    if-eq v0, v7, :cond_28

    .line 665
    .line 666
    if-eq v0, v11, :cond_27

    .line 667
    .line 668
    move v2, v8

    .line 669
    goto :goto_a

    .line 670
    :cond_27
    move/from16 v2, v19

    .line 671
    .line 672
    goto :goto_a

    .line 673
    :cond_28
    move/from16 v2, v22

    .line 674
    .line 675
    goto :goto_a

    .line 676
    :cond_29
    move v2, v7

    .line 677
    goto :goto_a

    .line 678
    :cond_2a
    move v2, v13

    .line 679
    :goto_a
    if-ne v2, v8, :cond_2b

    .line 680
    .line 681
    const-string v1, "Unknown VP9 profile: "

    .line 682
    .line 683
    invoke-static {v0, v1, v15}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    return-object v21

    .line 687
    :cond_2b
    if-eq v1, v12, :cond_35

    .line 688
    .line 689
    if-eq v1, v10, :cond_34

    .line 690
    .line 691
    const/16 v0, 0x14

    .line 692
    .line 693
    if-eq v1, v0, :cond_33

    .line 694
    .line 695
    const/16 v0, 0x15

    .line 696
    .line 697
    if-eq v1, v0, :cond_32

    .line 698
    .line 699
    const/16 v0, 0x1e

    .line 700
    .line 701
    if-eq v1, v0, :cond_31

    .line 702
    .line 703
    const/16 v0, 0x1f

    .line 704
    .line 705
    if-eq v1, v0, :cond_30

    .line 706
    .line 707
    const/16 v0, 0x28

    .line 708
    .line 709
    if-eq v1, v0, :cond_2f

    .line 710
    .line 711
    const/16 v0, 0x29

    .line 712
    .line 713
    if-eq v1, v0, :cond_2e

    .line 714
    .line 715
    const/16 v0, 0x32

    .line 716
    .line 717
    if-eq v1, v0, :cond_2d

    .line 718
    .line 719
    const/16 v0, 0x33

    .line 720
    .line 721
    if-eq v1, v0, :cond_2c

    .line 722
    .line 723
    packed-switch v1, :pswitch_data_4

    .line 724
    .line 725
    .line 726
    move v6, v8

    .line 727
    goto :goto_b

    .line 728
    :pswitch_22
    move v6, v3

    .line 729
    goto :goto_b

    .line 730
    :pswitch_23
    move/from16 v6, v25

    .line 731
    .line 732
    goto :goto_b

    .line 733
    :pswitch_24
    move/from16 v6, v24

    .line 734
    .line 735
    goto :goto_b

    .line 736
    :cond_2c
    move/from16 v6, v26

    .line 737
    .line 738
    goto :goto_b

    .line 739
    :cond_2d
    move/from16 v6, v27

    .line 740
    .line 741
    goto :goto_b

    .line 742
    :cond_2e
    move/from16 v6, v28

    .line 743
    .line 744
    goto :goto_b

    .line 745
    :cond_2f
    move/from16 v6, v29

    .line 746
    .line 747
    goto :goto_b

    .line 748
    :cond_30
    move/from16 v6, v30

    .line 749
    .line 750
    goto :goto_b

    .line 751
    :cond_31
    move/from16 v6, v23

    .line 752
    .line 753
    goto :goto_b

    .line 754
    :cond_32
    move/from16 v6, v19

    .line 755
    .line 756
    goto :goto_b

    .line 757
    :cond_33
    move/from16 v6, v22

    .line 758
    .line 759
    goto :goto_b

    .line 760
    :cond_34
    move v6, v7

    .line 761
    goto :goto_b

    .line 762
    :cond_35
    move v6, v13

    .line 763
    :goto_b
    if-ne v6, v8, :cond_36

    .line 764
    .line 765
    const-string v0, "Unknown VP9 level: "

    .line 766
    .line 767
    invoke-static {v1, v0, v15}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 768
    .line 769
    .line 770
    return-object v21

    .line 771
    :cond_36
    new-instance v0, Landroid/util/Pair;

    .line 772
    .line 773
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 778
    .line 779
    .line 780
    move-result-object v2

    .line 781
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 782
    .line 783
    .line 784
    return-object v0

    .line 785
    :catch_0
    invoke-static {v1, v9, v15}, LR8/v;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    return-object v21

    .line 789
    :pswitch_25
    array-length v0, v14

    .line 790
    const-string v1, "Ignoring malformed MP4A codec string: "

    .line 791
    .line 792
    if-eq v0, v11, :cond_37

    .line 793
    .line 794
    invoke-static {v1, v9, v15}, LR8/v;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    return-object v21

    .line 798
    :cond_37
    :try_start_1
    aget-object v0, v14, v13

    .line 799
    .line 800
    move/from16 v2, v23

    .line 801
    .line 802
    invoke-static {v0, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 803
    .line 804
    .line 805
    move-result v0

    .line 806
    invoke-static {v0}, Lu6/k;->c(I)Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    const-string v2, "audio/mp4a-latm"

    .line 811
    .line 812
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    move-result v0

    .line 816
    if-eqz v0, :cond_3a

    .line 817
    .line 818
    aget-object v0, v14, v7

    .line 819
    .line 820
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 821
    .line 822
    .line 823
    move-result v0

    .line 824
    const/16 v2, 0x11

    .line 825
    .line 826
    if-eq v0, v2, :cond_39

    .line 827
    .line 828
    const/16 v4, 0x14

    .line 829
    .line 830
    if-eq v0, v4, :cond_38

    .line 831
    .line 832
    const/16 v2, 0x17

    .line 833
    .line 834
    if-eq v0, v2, :cond_39

    .line 835
    .line 836
    const/16 v2, 0x1d

    .line 837
    .line 838
    if-eq v0, v2, :cond_39

    .line 839
    .line 840
    const/16 v2, 0x27

    .line 841
    .line 842
    if-eq v0, v2, :cond_39

    .line 843
    .line 844
    const/16 v2, 0x2a

    .line 845
    .line 846
    if-eq v0, v2, :cond_39

    .line 847
    .line 848
    packed-switch v0, :pswitch_data_5

    .line 849
    .line 850
    .line 851
    move v2, v8

    .line 852
    goto :goto_c

    .line 853
    :pswitch_26
    const/4 v2, 0x6

    .line 854
    goto :goto_c

    .line 855
    :pswitch_27
    move/from16 v2, v16

    .line 856
    .line 857
    goto :goto_c

    .line 858
    :pswitch_28
    move/from16 v2, v22

    .line 859
    .line 860
    goto :goto_c

    .line 861
    :pswitch_29
    move v2, v11

    .line 862
    goto :goto_c

    .line 863
    :pswitch_2a
    move v2, v7

    .line 864
    goto :goto_c

    .line 865
    :pswitch_2b
    move v2, v13

    .line 866
    goto :goto_c

    .line 867
    :cond_38
    move v2, v4

    .line 868
    :cond_39
    :goto_c
    if-eq v2, v8, :cond_3a

    .line 869
    .line 870
    new-instance v0, Landroid/util/Pair;

    .line 871
    .line 872
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 873
    .line 874
    .line 875
    move-result-object v2

    .line 876
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 877
    .line 878
    .line 879
    move-result-object v3

    .line 880
    invoke-direct {v0, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 881
    .line 882
    .line 883
    return-object v0

    .line 884
    :catch_1
    invoke-static {v1, v9, v15}, LR8/v;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 885
    .line 886
    .line 887
    :cond_3a
    return-object v21

    .line 888
    :pswitch_2c
    const/16 v4, 0x14

    .line 889
    .line 890
    array-length v0, v14

    .line 891
    const-string v1, "Ignoring malformed HEVC codec string: "

    .line 892
    .line 893
    move/from16 v6, v22

    .line 894
    .line 895
    if-ge v0, v6, :cond_3b

    .line 896
    .line 897
    invoke-static {v1, v9, v15}, LR8/v;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 898
    .line 899
    .line 900
    return-object v21

    .line 901
    :cond_3b
    aget-object v0, v14, v13

    .line 902
    .line 903
    invoke-virtual {v5, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 908
    .line 909
    .line 910
    move-result v5

    .line 911
    if-nez v5, :cond_3c

    .line 912
    .line 913
    invoke-static {v1, v9, v15}, LR8/v;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 914
    .line 915
    .line 916
    return-object v21

    .line 917
    :cond_3c
    invoke-virtual {v0, v13}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    const-string v1, "1"

    .line 922
    .line 923
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 924
    .line 925
    .line 926
    move-result v1

    .line 927
    if-eqz v1, :cond_3d

    .line 928
    .line 929
    move v0, v13

    .line 930
    goto :goto_d

    .line 931
    :cond_3d
    const-string v1, "2"

    .line 932
    .line 933
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 934
    .line 935
    .line 936
    move-result v1

    .line 937
    if-eqz v1, :cond_5a

    .line 938
    .line 939
    move v0, v7

    .line 940
    :goto_d
    aget-object v1, v14, v11

    .line 941
    .line 942
    if-nez v1, :cond_3e

    .line 943
    .line 944
    :goto_e
    move-object/from16 v2, v21

    .line 945
    .line 946
    goto/16 :goto_11

    .line 947
    .line 948
    :cond_3e
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 949
    .line 950
    .line 951
    move-result v5

    .line 952
    sparse-switch v5, :sswitch_data_2

    .line 953
    .line 954
    .line 955
    :goto_f
    move v9, v8

    .line 956
    goto/16 :goto_10

    .line 957
    .line 958
    :sswitch_14
    const-string v4, "L186"

    .line 959
    .line 960
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 961
    .line 962
    .line 963
    move-result v4

    .line 964
    if-nez v4, :cond_3f

    .line 965
    .line 966
    goto :goto_f

    .line 967
    :cond_3f
    const/16 v9, 0x19

    .line 968
    .line 969
    goto/16 :goto_10

    .line 970
    .line 971
    :sswitch_15
    const-string v4, "L183"

    .line 972
    .line 973
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 974
    .line 975
    .line 976
    move-result v4

    .line 977
    if-nez v4, :cond_40

    .line 978
    .line 979
    goto :goto_f

    .line 980
    :cond_40
    const/16 v9, 0x18

    .line 981
    .line 982
    goto/16 :goto_10

    .line 983
    .line 984
    :sswitch_16
    const-string v4, "L180"

    .line 985
    .line 986
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 987
    .line 988
    .line 989
    move-result v4

    .line 990
    if-nez v4, :cond_41

    .line 991
    .line 992
    goto :goto_f

    .line 993
    :cond_41
    const/16 v9, 0x17

    .line 994
    .line 995
    goto/16 :goto_10

    .line 996
    .line 997
    :sswitch_17
    const-string v4, "L156"

    .line 998
    .line 999
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1000
    .line 1001
    .line 1002
    move-result v4

    .line 1003
    if-nez v4, :cond_42

    .line 1004
    .line 1005
    goto :goto_f

    .line 1006
    :cond_42
    const/16 v9, 0x16

    .line 1007
    .line 1008
    goto/16 :goto_10

    .line 1009
    .line 1010
    :sswitch_18
    const-string v4, "L153"

    .line 1011
    .line 1012
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v4

    .line 1016
    if-nez v4, :cond_43

    .line 1017
    .line 1018
    goto :goto_f

    .line 1019
    :cond_43
    const/16 v9, 0x15

    .line 1020
    .line 1021
    goto/16 :goto_10

    .line 1022
    .line 1023
    :sswitch_19
    const-string v5, "L150"

    .line 1024
    .line 1025
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1026
    .line 1027
    .line 1028
    move-result v5

    .line 1029
    if-nez v5, :cond_44

    .line 1030
    .line 1031
    goto :goto_f

    .line 1032
    :cond_44
    move v9, v4

    .line 1033
    goto/16 :goto_10

    .line 1034
    .line 1035
    :sswitch_1a
    const-string v4, "L123"

    .line 1036
    .line 1037
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1038
    .line 1039
    .line 1040
    move-result v4

    .line 1041
    if-nez v4, :cond_45

    .line 1042
    .line 1043
    goto :goto_f

    .line 1044
    :cond_45
    const/16 v9, 0x13

    .line 1045
    .line 1046
    goto/16 :goto_10

    .line 1047
    .line 1048
    :sswitch_1b
    const-string v4, "L120"

    .line 1049
    .line 1050
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1051
    .line 1052
    .line 1053
    move-result v4

    .line 1054
    if-nez v4, :cond_46

    .line 1055
    .line 1056
    goto :goto_f

    .line 1057
    :cond_46
    const/16 v9, 0x12

    .line 1058
    .line 1059
    goto/16 :goto_10

    .line 1060
    .line 1061
    :sswitch_1c
    const-string v4, "H186"

    .line 1062
    .line 1063
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1064
    .line 1065
    .line 1066
    move-result v4

    .line 1067
    if-nez v4, :cond_47

    .line 1068
    .line 1069
    goto :goto_f

    .line 1070
    :cond_47
    const/16 v9, 0x11

    .line 1071
    .line 1072
    goto/16 :goto_10

    .line 1073
    .line 1074
    :sswitch_1d
    const-string v4, "H183"

    .line 1075
    .line 1076
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1077
    .line 1078
    .line 1079
    move-result v4

    .line 1080
    if-nez v4, :cond_48

    .line 1081
    .line 1082
    goto :goto_f

    .line 1083
    :cond_48
    const/16 v9, 0x10

    .line 1084
    .line 1085
    goto/16 :goto_10

    .line 1086
    .line 1087
    :sswitch_1e
    const-string v4, "H180"

    .line 1088
    .line 1089
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1090
    .line 1091
    .line 1092
    move-result v4

    .line 1093
    if-nez v4, :cond_49

    .line 1094
    .line 1095
    goto/16 :goto_f

    .line 1096
    .line 1097
    :cond_49
    const/16 v9, 0xf

    .line 1098
    .line 1099
    goto/16 :goto_10

    .line 1100
    .line 1101
    :sswitch_1f
    const-string v4, "H156"

    .line 1102
    .line 1103
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1104
    .line 1105
    .line 1106
    move-result v4

    .line 1107
    if-nez v4, :cond_4a

    .line 1108
    .line 1109
    goto/16 :goto_f

    .line 1110
    .line 1111
    :cond_4a
    const/16 v9, 0xe

    .line 1112
    .line 1113
    goto/16 :goto_10

    .line 1114
    .line 1115
    :sswitch_20
    const-string v4, "H153"

    .line 1116
    .line 1117
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v4

    .line 1121
    if-nez v4, :cond_4b

    .line 1122
    .line 1123
    goto/16 :goto_f

    .line 1124
    .line 1125
    :cond_4b
    const/16 v9, 0xd

    .line 1126
    .line 1127
    goto/16 :goto_10

    .line 1128
    .line 1129
    :sswitch_21
    const-string v4, "H150"

    .line 1130
    .line 1131
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1132
    .line 1133
    .line 1134
    move-result v4

    .line 1135
    if-nez v4, :cond_4c

    .line 1136
    .line 1137
    goto/16 :goto_f

    .line 1138
    .line 1139
    :cond_4c
    const/16 v9, 0xc

    .line 1140
    .line 1141
    goto/16 :goto_10

    .line 1142
    .line 1143
    :sswitch_22
    const-string v4, "H123"

    .line 1144
    .line 1145
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1146
    .line 1147
    .line 1148
    move-result v4

    .line 1149
    if-nez v4, :cond_4d

    .line 1150
    .line 1151
    goto/16 :goto_f

    .line 1152
    .line 1153
    :cond_4d
    move v9, v10

    .line 1154
    goto/16 :goto_10

    .line 1155
    .line 1156
    :sswitch_23
    const-string v4, "H120"

    .line 1157
    .line 1158
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1159
    .line 1160
    .line 1161
    move-result v4

    .line 1162
    if-nez v4, :cond_4e

    .line 1163
    .line 1164
    goto/16 :goto_f

    .line 1165
    .line 1166
    :cond_4e
    move v9, v12

    .line 1167
    goto/16 :goto_10

    .line 1168
    .line 1169
    :sswitch_24
    const-string v4, "L93"

    .line 1170
    .line 1171
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1172
    .line 1173
    .line 1174
    move-result v4

    .line 1175
    if-nez v4, :cond_4f

    .line 1176
    .line 1177
    goto/16 :goto_f

    .line 1178
    .line 1179
    :cond_4f
    const/16 v9, 0x9

    .line 1180
    .line 1181
    goto/16 :goto_10

    .line 1182
    .line 1183
    :sswitch_25
    const-string v4, "L90"

    .line 1184
    .line 1185
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1186
    .line 1187
    .line 1188
    move-result v4

    .line 1189
    if-nez v4, :cond_50

    .line 1190
    .line 1191
    goto/16 :goto_f

    .line 1192
    .line 1193
    :cond_50
    move/from16 v9, v19

    .line 1194
    .line 1195
    goto/16 :goto_10

    .line 1196
    .line 1197
    :sswitch_26
    const-string v4, "L63"

    .line 1198
    .line 1199
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1200
    .line 1201
    .line 1202
    move-result v4

    .line 1203
    if-nez v4, :cond_51

    .line 1204
    .line 1205
    goto/16 :goto_f

    .line 1206
    .line 1207
    :cond_51
    const/4 v9, 0x7

    .line 1208
    goto :goto_10

    .line 1209
    :sswitch_27
    const-string v4, "L60"

    .line 1210
    .line 1211
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v4

    .line 1215
    if-nez v4, :cond_52

    .line 1216
    .line 1217
    goto/16 :goto_f

    .line 1218
    .line 1219
    :cond_52
    const/4 v9, 0x6

    .line 1220
    goto :goto_10

    .line 1221
    :sswitch_28
    const-string v4, "L30"

    .line 1222
    .line 1223
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1224
    .line 1225
    .line 1226
    move-result v4

    .line 1227
    if-nez v4, :cond_53

    .line 1228
    .line 1229
    goto/16 :goto_f

    .line 1230
    .line 1231
    :cond_53
    move/from16 v9, v16

    .line 1232
    .line 1233
    goto :goto_10

    .line 1234
    :sswitch_29
    const-string v4, "H93"

    .line 1235
    .line 1236
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v4

    .line 1240
    if-nez v4, :cond_54

    .line 1241
    .line 1242
    goto/16 :goto_f

    .line 1243
    .line 1244
    :cond_54
    const/4 v9, 0x4

    .line 1245
    goto :goto_10

    .line 1246
    :sswitch_2a
    const-string v4, "H90"

    .line 1247
    .line 1248
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1249
    .line 1250
    .line 1251
    move-result v4

    .line 1252
    if-nez v4, :cond_55

    .line 1253
    .line 1254
    goto/16 :goto_f

    .line 1255
    .line 1256
    :cond_55
    move v9, v11

    .line 1257
    goto :goto_10

    .line 1258
    :sswitch_2b
    const-string v4, "H63"

    .line 1259
    .line 1260
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1261
    .line 1262
    .line 1263
    move-result v4

    .line 1264
    if-nez v4, :cond_56

    .line 1265
    .line 1266
    goto/16 :goto_f

    .line 1267
    .line 1268
    :cond_56
    move v9, v7

    .line 1269
    goto :goto_10

    .line 1270
    :sswitch_2c
    const-string v4, "H60"

    .line 1271
    .line 1272
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1273
    .line 1274
    .line 1275
    move-result v4

    .line 1276
    if-nez v4, :cond_57

    .line 1277
    .line 1278
    goto/16 :goto_f

    .line 1279
    .line 1280
    :cond_57
    move v9, v13

    .line 1281
    goto :goto_10

    .line 1282
    :sswitch_2d
    const-string v4, "H30"

    .line 1283
    .line 1284
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1285
    .line 1286
    .line 1287
    move-result v4

    .line 1288
    if-nez v4, :cond_58

    .line 1289
    .line 1290
    goto/16 :goto_f

    .line 1291
    .line 1292
    :cond_58
    move/from16 v9, v20

    .line 1293
    .line 1294
    :goto_10
    packed-switch v9, :pswitch_data_6

    .line 1295
    .line 1296
    .line 1297
    goto/16 :goto_e

    .line 1298
    .line 1299
    :pswitch_2d
    const/high16 v2, 0x1000000

    .line 1300
    .line 1301
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v2

    .line 1305
    goto/16 :goto_11

    .line 1306
    .line 1307
    :pswitch_2e
    const/high16 v2, 0x400000

    .line 1308
    .line 1309
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v2

    .line 1313
    goto/16 :goto_11

    .line 1314
    .line 1315
    :pswitch_2f
    const/high16 v2, 0x100000

    .line 1316
    .line 1317
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v2

    .line 1321
    goto/16 :goto_11

    .line 1322
    .line 1323
    :pswitch_30
    const/high16 v2, 0x40000

    .line 1324
    .line 1325
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v2

    .line 1329
    goto/16 :goto_11

    .line 1330
    .line 1331
    :pswitch_31
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v2

    .line 1335
    goto/16 :goto_11

    .line 1336
    .line 1337
    :pswitch_32
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v2

    .line 1341
    goto/16 :goto_11

    .line 1342
    .line 1343
    :pswitch_33
    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v2

    .line 1347
    goto/16 :goto_11

    .line 1348
    .line 1349
    :pswitch_34
    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v2

    .line 1353
    goto/16 :goto_11

    .line 1354
    .line 1355
    :pswitch_35
    const/high16 v2, 0x2000000

    .line 1356
    .line 1357
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v2

    .line 1361
    goto/16 :goto_11

    .line 1362
    .line 1363
    :pswitch_36
    const/high16 v2, 0x800000

    .line 1364
    .line 1365
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v2

    .line 1369
    goto :goto_11

    .line 1370
    :pswitch_37
    const/high16 v2, 0x200000

    .line 1371
    .line 1372
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v2

    .line 1376
    goto :goto_11

    .line 1377
    :pswitch_38
    const/high16 v2, 0x80000

    .line 1378
    .line 1379
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v2

    .line 1383
    goto :goto_11

    .line 1384
    :pswitch_39
    const/high16 v2, 0x20000

    .line 1385
    .line 1386
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v2

    .line 1390
    goto :goto_11

    .line 1391
    :pswitch_3a
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v2

    .line 1395
    goto :goto_11

    .line 1396
    :pswitch_3b
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v2

    .line 1400
    goto :goto_11

    .line 1401
    :pswitch_3c
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v2

    .line 1405
    goto :goto_11

    .line 1406
    :pswitch_3d
    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v2

    .line 1410
    goto :goto_11

    .line 1411
    :pswitch_3e
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v2

    .line 1415
    goto :goto_11

    .line 1416
    :pswitch_3f
    const/16 v23, 0x10

    .line 1417
    .line 1418
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v2

    .line 1422
    goto :goto_11

    .line 1423
    :pswitch_40
    const/16 v22, 0x4

    .line 1424
    .line 1425
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v2

    .line 1429
    goto :goto_11

    .line 1430
    :pswitch_41
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v2

    .line 1434
    goto :goto_11

    .line 1435
    :pswitch_42
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v2

    .line 1439
    goto :goto_11

    .line 1440
    :pswitch_43
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v2

    .line 1444
    goto :goto_11

    .line 1445
    :pswitch_44
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v2

    .line 1449
    goto :goto_11

    .line 1450
    :pswitch_45
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v2

    .line 1454
    goto :goto_11

    .line 1455
    :pswitch_46
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v2

    .line 1459
    :goto_11
    if-nez v2, :cond_59

    .line 1460
    .line 1461
    const-string v0, "Unknown HEVC level string: "

    .line 1462
    .line 1463
    invoke-static {v0, v1, v15}, LR8/v;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1464
    .line 1465
    .line 1466
    return-object v21

    .line 1467
    :cond_59
    new-instance v1, Landroid/util/Pair;

    .line 1468
    .line 1469
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v0

    .line 1473
    invoke-direct {v1, v0, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1474
    .line 1475
    .line 1476
    return-object v1

    .line 1477
    :cond_5a
    const-string v1, "Unknown HEVC profile string: "

    .line 1478
    .line 1479
    invoke-static {v1, v0, v15}, LR8/v;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1480
    .line 1481
    .line 1482
    return-object v21

    .line 1483
    :pswitch_47
    array-length v0, v14

    .line 1484
    const-string v1, "Ignoring malformed AVC codec string: "

    .line 1485
    .line 1486
    if-ge v0, v7, :cond_5b

    .line 1487
    .line 1488
    invoke-static {v1, v9, v15}, LR8/v;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1489
    .line 1490
    .line 1491
    return-object v21

    .line 1492
    :cond_5b
    :try_start_2
    aget-object v0, v14, v13

    .line 1493
    .line 1494
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1495
    .line 1496
    .line 1497
    move-result v0

    .line 1498
    const/4 v4, 0x6

    .line 1499
    if-ne v0, v4, :cond_5c

    .line 1500
    .line 1501
    aget-object v0, v14, v13

    .line 1502
    .line 1503
    move/from16 v4, v20

    .line 1504
    .line 1505
    invoke-virtual {v0, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v0

    .line 1509
    const/16 v4, 0x10

    .line 1510
    .line 1511
    invoke-static {v0, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 1512
    .line 1513
    .line 1514
    move-result v0

    .line 1515
    aget-object v5, v14, v13

    .line 1516
    .line 1517
    const/4 v6, 0x4

    .line 1518
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v5

    .line 1522
    invoke-static {v5, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 1523
    .line 1524
    .line 1525
    move-result v1

    .line 1526
    goto :goto_12

    .line 1527
    :cond_5c
    const/16 v4, 0x10

    .line 1528
    .line 1529
    array-length v0, v14

    .line 1530
    if-lt v0, v11, :cond_66

    .line 1531
    .line 1532
    aget-object v0, v14, v13

    .line 1533
    .line 1534
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1535
    .line 1536
    .line 1537
    move-result v0

    .line 1538
    aget-object v5, v14, v7

    .line 1539
    .line 1540
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1541
    .line 1542
    .line 1543
    move-result v1
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1544
    :goto_12
    const/16 v5, 0x42

    .line 1545
    .line 1546
    if-eq v0, v5, :cond_62

    .line 1547
    .line 1548
    const/16 v5, 0x4d

    .line 1549
    .line 1550
    if-eq v0, v5, :cond_63

    .line 1551
    .line 1552
    const/16 v5, 0x58

    .line 1553
    .line 1554
    if-eq v0, v5, :cond_61

    .line 1555
    .line 1556
    const/16 v5, 0x64

    .line 1557
    .line 1558
    if-eq v0, v5, :cond_60

    .line 1559
    .line 1560
    const/16 v5, 0x6e

    .line 1561
    .line 1562
    if-eq v0, v5, :cond_5f

    .line 1563
    .line 1564
    const/16 v5, 0x7a

    .line 1565
    .line 1566
    if-eq v0, v5, :cond_5e

    .line 1567
    .line 1568
    const/16 v5, 0xf4

    .line 1569
    .line 1570
    if-eq v0, v5, :cond_5d

    .line 1571
    .line 1572
    move v7, v8

    .line 1573
    goto :goto_13

    .line 1574
    :cond_5d
    move/from16 v7, v29

    .line 1575
    .line 1576
    goto :goto_13

    .line 1577
    :cond_5e
    move/from16 v7, v30

    .line 1578
    .line 1579
    goto :goto_13

    .line 1580
    :cond_5f
    move v7, v4

    .line 1581
    goto :goto_13

    .line 1582
    :cond_60
    move/from16 v7, v19

    .line 1583
    .line 1584
    goto :goto_13

    .line 1585
    :cond_61
    const/4 v7, 0x4

    .line 1586
    goto :goto_13

    .line 1587
    :cond_62
    move v7, v13

    .line 1588
    :cond_63
    :goto_13
    if-ne v7, v8, :cond_64

    .line 1589
    .line 1590
    const-string v1, "Unknown AVC profile: "

    .line 1591
    .line 1592
    invoke-static {v0, v1, v15}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 1593
    .line 1594
    .line 1595
    return-object v21

    .line 1596
    :cond_64
    packed-switch v1, :pswitch_data_7

    .line 1597
    .line 1598
    .line 1599
    packed-switch v1, :pswitch_data_8

    .line 1600
    .line 1601
    .line 1602
    packed-switch v1, :pswitch_data_9

    .line 1603
    .line 1604
    .line 1605
    packed-switch v1, :pswitch_data_a

    .line 1606
    .line 1607
    .line 1608
    packed-switch v1, :pswitch_data_b

    .line 1609
    .line 1610
    .line 1611
    move v6, v8

    .line 1612
    goto :goto_14

    .line 1613
    :pswitch_48
    move v6, v2

    .line 1614
    goto :goto_14

    .line 1615
    :pswitch_49
    move/from16 v6, v17

    .line 1616
    .line 1617
    goto :goto_14

    .line 1618
    :pswitch_4a
    move/from16 v6, v18

    .line 1619
    .line 1620
    goto :goto_14

    .line 1621
    :pswitch_4b
    move v6, v3

    .line 1622
    goto :goto_14

    .line 1623
    :pswitch_4c
    move/from16 v6, v25

    .line 1624
    .line 1625
    goto :goto_14

    .line 1626
    :pswitch_4d
    move/from16 v6, v24

    .line 1627
    .line 1628
    goto :goto_14

    .line 1629
    :pswitch_4e
    move/from16 v6, v31

    .line 1630
    .line 1631
    goto :goto_14

    .line 1632
    :pswitch_4f
    move/from16 v6, v26

    .line 1633
    .line 1634
    goto :goto_14

    .line 1635
    :pswitch_50
    move/from16 v6, v27

    .line 1636
    .line 1637
    goto :goto_14

    .line 1638
    :pswitch_51
    move/from16 v6, v28

    .line 1639
    .line 1640
    goto :goto_14

    .line 1641
    :pswitch_52
    move/from16 v6, v29

    .line 1642
    .line 1643
    goto :goto_14

    .line 1644
    :pswitch_53
    move/from16 v6, v30

    .line 1645
    .line 1646
    goto :goto_14

    .line 1647
    :pswitch_54
    move v6, v4

    .line 1648
    goto :goto_14

    .line 1649
    :pswitch_55
    move/from16 v6, v19

    .line 1650
    .line 1651
    goto :goto_14

    .line 1652
    :pswitch_56
    const/4 v6, 0x4

    .line 1653
    goto :goto_14

    .line 1654
    :pswitch_57
    move v6, v13

    .line 1655
    :goto_14
    if-ne v6, v8, :cond_65

    .line 1656
    .line 1657
    const-string v0, "Unknown AVC level: "

    .line 1658
    .line 1659
    invoke-static {v1, v0, v15}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 1660
    .line 1661
    .line 1662
    return-object v21

    .line 1663
    :cond_65
    new-instance v0, Landroid/util/Pair;

    .line 1664
    .line 1665
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v1

    .line 1669
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v2

    .line 1673
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1674
    .line 1675
    .line 1676
    return-object v0

    .line 1677
    :cond_66
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1678
    .line 1679
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1680
    .line 1681
    .line 1682
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1683
    .line 1684
    .line 1685
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v0

    .line 1689
    invoke-static {v15, v0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    .line 1690
    .line 1691
    .line 1692
    return-object v21

    .line 1693
    :catch_2
    invoke-static {v1, v9, v15}, LR8/v;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1694
    .line 1695
    .line 1696
    return-object v21

    .line 1697
    :pswitch_58
    move/from16 v4, v23

    .line 1698
    .line 1699
    array-length v1, v14

    .line 1700
    const-string v5, "Ignoring malformed AV1 codec string: "

    .line 1701
    .line 1702
    const/4 v6, 0x4

    .line 1703
    if-ge v1, v6, :cond_67

    .line 1704
    .line 1705
    invoke-static {v5, v9, v15}, LR8/v;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1706
    .line 1707
    .line 1708
    return-object v21

    .line 1709
    :cond_67
    :try_start_4
    aget-object v1, v14, v13

    .line 1710
    .line 1711
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1712
    .line 1713
    .line 1714
    move-result v1

    .line 1715
    aget-object v10, v14, v7

    .line 1716
    .line 1717
    const/4 v2, 0x0

    .line 1718
    invoke-virtual {v10, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v2

    .line 1722
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1723
    .line 1724
    .line 1725
    move-result v2

    .line 1726
    aget-object v10, v14, v11

    .line 1727
    .line 1728
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1729
    .line 1730
    .line 1731
    move-result v5
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_3

    .line 1732
    if-eqz v1, :cond_68

    .line 1733
    .line 1734
    const-string v0, "Unknown AV1 profile: "

    .line 1735
    .line 1736
    invoke-static {v1, v0, v15}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 1737
    .line 1738
    .line 1739
    return-object v21

    .line 1740
    :cond_68
    move/from16 v1, v19

    .line 1741
    .line 1742
    if-eq v5, v1, :cond_69

    .line 1743
    .line 1744
    if-eq v5, v12, :cond_69

    .line 1745
    .line 1746
    const-string v0, "Unknown AV1 bit depth: "

    .line 1747
    .line 1748
    invoke-static {v5, v0, v15}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 1749
    .line 1750
    .line 1751
    return-object v21

    .line 1752
    :cond_69
    if-ne v5, v1, :cond_6a

    .line 1753
    .line 1754
    move v0, v13

    .line 1755
    goto :goto_15

    .line 1756
    :cond_6a
    iget-object v0, v0, LE5/T;->x:Lv6/b;

    .line 1757
    .line 1758
    if-eqz v0, :cond_6c

    .line 1759
    .line 1760
    iget-object v5, v0, Lv6/b;->d:[B

    .line 1761
    .line 1762
    if-nez v5, :cond_6b

    .line 1763
    .line 1764
    iget v0, v0, Lv6/b;->c:I

    .line 1765
    .line 1766
    const/4 v5, 0x7

    .line 1767
    if-eq v0, v5, :cond_6b

    .line 1768
    .line 1769
    const/4 v5, 0x6

    .line 1770
    if-ne v0, v5, :cond_6c

    .line 1771
    .line 1772
    :cond_6b
    move/from16 v0, v25

    .line 1773
    .line 1774
    goto :goto_15

    .line 1775
    :cond_6c
    move v0, v7

    .line 1776
    :goto_15
    packed-switch v2, :pswitch_data_c

    .line 1777
    .line 1778
    .line 1779
    move v6, v8

    .line 1780
    goto/16 :goto_16

    .line 1781
    .line 1782
    :pswitch_59
    const/high16 v6, 0x800000

    .line 1783
    .line 1784
    goto :goto_16

    .line 1785
    :pswitch_5a
    const/high16 v6, 0x400000

    .line 1786
    .line 1787
    goto :goto_16

    .line 1788
    :pswitch_5b
    const/high16 v6, 0x200000

    .line 1789
    .line 1790
    goto :goto_16

    .line 1791
    :pswitch_5c
    const/high16 v6, 0x100000

    .line 1792
    .line 1793
    goto :goto_16

    .line 1794
    :pswitch_5d
    const/high16 v6, 0x80000

    .line 1795
    .line 1796
    goto :goto_16

    .line 1797
    :pswitch_5e
    const/high16 v6, 0x40000

    .line 1798
    .line 1799
    goto :goto_16

    .line 1800
    :pswitch_5f
    const/high16 v6, 0x20000

    .line 1801
    .line 1802
    goto :goto_16

    .line 1803
    :pswitch_60
    const/high16 v6, 0x10000

    .line 1804
    .line 1805
    goto :goto_16

    .line 1806
    :pswitch_61
    move/from16 v6, v17

    .line 1807
    .line 1808
    goto :goto_16

    .line 1809
    :pswitch_62
    move/from16 v6, v18

    .line 1810
    .line 1811
    goto :goto_16

    .line 1812
    :pswitch_63
    move v6, v3

    .line 1813
    goto :goto_16

    .line 1814
    :pswitch_64
    move/from16 v6, v25

    .line 1815
    .line 1816
    goto :goto_16

    .line 1817
    :pswitch_65
    move/from16 v6, v24

    .line 1818
    .line 1819
    goto :goto_16

    .line 1820
    :pswitch_66
    move/from16 v6, v31

    .line 1821
    .line 1822
    goto :goto_16

    .line 1823
    :pswitch_67
    move/from16 v6, v26

    .line 1824
    .line 1825
    goto :goto_16

    .line 1826
    :pswitch_68
    move/from16 v6, v27

    .line 1827
    .line 1828
    goto :goto_16

    .line 1829
    :pswitch_69
    move/from16 v6, v28

    .line 1830
    .line 1831
    goto :goto_16

    .line 1832
    :pswitch_6a
    move/from16 v6, v29

    .line 1833
    .line 1834
    goto :goto_16

    .line 1835
    :pswitch_6b
    move/from16 v6, v30

    .line 1836
    .line 1837
    goto :goto_16

    .line 1838
    :pswitch_6c
    move v6, v4

    .line 1839
    goto :goto_16

    .line 1840
    :pswitch_6d
    move v6, v1

    .line 1841
    goto :goto_16

    .line 1842
    :pswitch_6e
    move v6, v7

    .line 1843
    goto :goto_16

    .line 1844
    :pswitch_6f
    move v6, v13

    .line 1845
    :goto_16
    :pswitch_70
    if-ne v6, v8, :cond_6d

    .line 1846
    .line 1847
    const-string v0, "Unknown AV1 level: "

    .line 1848
    .line 1849
    invoke-static {v2, v0, v15}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 1850
    .line 1851
    .line 1852
    return-object v21

    .line 1853
    :cond_6d
    new-instance v1, Landroid/util/Pair;

    .line 1854
    .line 1855
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v0

    .line 1859
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v2

    .line 1863
    invoke-direct {v1, v0, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1864
    .line 1865
    .line 1866
    return-object v1

    .line 1867
    :catch_3
    invoke-static {v5, v9, v15}, LR8/v;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1868
    .line 1869
    .line 1870
    return-object v21

    .line 1871
    :pswitch_data_0
    .packed-switch 0x600
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

    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    :sswitch_data_0
    .sparse-switch
        0x601 -> :sswitch_c
        0x602 -> :sswitch_b
        0x603 -> :sswitch_a
        0x604 -> :sswitch_9
        0x605 -> :sswitch_8
        0x606 -> :sswitch_7
        0x607 -> :sswitch_6
        0x608 -> :sswitch_5
        0x609 -> :sswitch_4
        0x61f -> :sswitch_3
        0x620 -> :sswitch_2
        0x621 -> :sswitch_1
        0x622 -> :sswitch_0
    .end sparse-switch

    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
    .end packed-switch

    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    :sswitch_data_1
    .sparse-switch
        0x2dd8f6 -> :sswitch_13
        0x2ddf23 -> :sswitch_12
        0x2ddf24 -> :sswitch_11
        0x30d038 -> :sswitch_10
        0x310dbc -> :sswitch_f
        0x333790 -> :sswitch_e
        0x374e43 -> :sswitch_d
    .end sparse-switch

    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_58
        :pswitch_47
        :pswitch_47
        :pswitch_2c
        :pswitch_2c
        :pswitch_25
        :pswitch_21
    .end packed-switch

    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    :pswitch_data_4
    .packed-switch 0x3c
        :pswitch_24
        :pswitch_23
        :pswitch_22
    .end packed-switch

    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
    .end packed-switch

    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    :sswitch_data_2
    .sparse-switch
        0x114a5 -> :sswitch_2d
        0x11502 -> :sswitch_2c
        0x11505 -> :sswitch_2b
        0x1155f -> :sswitch_2a
        0x11562 -> :sswitch_29
        0x123a9 -> :sswitch_28
        0x12406 -> :sswitch_27
        0x12409 -> :sswitch_26
        0x12463 -> :sswitch_25
        0x12466 -> :sswitch_24
        0x2178e7 -> :sswitch_23
        0x2178ea -> :sswitch_22
        0x217944 -> :sswitch_21
        0x217947 -> :sswitch_20
        0x21794a -> :sswitch_1f
        0x2179a1 -> :sswitch_1e
        0x2179a4 -> :sswitch_1d
        0x2179a7 -> :sswitch_1c
        0x234a63 -> :sswitch_1b
        0x234a66 -> :sswitch_1a
        0x234ac0 -> :sswitch_19
        0x234ac3 -> :sswitch_18
        0x234ac6 -> :sswitch_17
        0x234b1d -> :sswitch_16
        0x234b20 -> :sswitch_15
        0x234b23 -> :sswitch_14
    .end sparse-switch

    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    :pswitch_data_6
    .packed-switch 0x0
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
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
    .end packed-switch

    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    :pswitch_data_7
    .packed-switch 0xa
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
    .end packed-switch

    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    :pswitch_data_8
    .packed-switch 0x14
        :pswitch_53
        :pswitch_52
        :pswitch_51
    .end packed-switch

    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    :pswitch_data_9
    .packed-switch 0x1e
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
    .end packed-switch

    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    :pswitch_data_a
    .packed-switch 0x28
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
    .end packed-switch

    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    :pswitch_data_b
    .packed-switch 0x32
        :pswitch_4a
        :pswitch_49
        :pswitch_48
    .end packed-switch

    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    :pswitch_data_c
    .packed-switch 0x0
        :pswitch_6f
        :pswitch_6e
        :pswitch_70
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
    .end packed-switch
.end method

.method public static declared-synchronized e(Ljava/lang/String;ZZ)Ljava/util/List;
    .locals 8

    .line 1
    const-string v0, "MediaCodecList API didn\'t list secure decoder for: "

    .line 2
    .line 3
    const-class v1, LV5/y;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    new-instance v2, LV5/t;

    .line 7
    .line 8
    invoke-direct {v2, p0, p1, p2}, LV5/t;-><init>(Ljava/lang/String;ZZ)V

    .line 9
    .line 10
    .line 11
    sget-object v3, LV5/y;->b:Ljava/util/HashMap;

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
    sget v4, Lu6/v;->a:I

    .line 24
    .line 25
    const/16 v5, 0x15

    .line 26
    .line 27
    if-lt v4, v5, :cond_1

    .line 28
    .line 29
    new-instance v6, LV5/w;

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    invoke-direct {v6, v7, p1, p2}, LV5/w;-><init>(IZZ)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    new-instance v6, LXd/c;

    .line 39
    .line 40
    const/16 p2, 0x1b

    .line 41
    .line 42
    invoke-direct {v6, p2}, LXd/c;-><init>(I)V

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-static {v2, v6}, LV5/y;->f(LV5/t;LV5/v;)Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    if-gt v5, v4, :cond_2

    .line 58
    .line 59
    const/16 p1, 0x17

    .line 60
    .line 61
    if-gt v4, p1, :cond_2

    .line 62
    .line 63
    new-instance p1, LXd/c;

    .line 64
    .line 65
    const/16 p2, 0x1b

    .line 66
    .line 67
    invoke-direct {p1, p2}, LXd/c;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-static {v2, p1}, LV5/y;->f(LV5/t;LV5/v;)Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_2

    .line 79
    .line 80
    const-string p1, "MediaCodecUtil"

    .line 81
    .line 82
    new-instance v4, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v0, ". Assuming: "

    .line 91
    .line 92
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const/4 v0, 0x0

    .line 96
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, LV5/n;

    .line 101
    .line 102
    iget-object v0, v0, LV5/n;->a:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {p1, v0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :cond_2
    invoke-static {p0, p2}, LV5/y;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 115
    .line 116
    .line 117
    invoke-static {p2}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {v3, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    .line 123
    .line 124
    monitor-exit v1

    .line 125
    return-object p0

    .line 126
    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 127
    throw p0
.end method

.method public static f(LV5/t;LV5/v;)Ljava/util/ArrayList;
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
    iget-object v7, v1, LV5/t;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {v2}, LV5/v;->e()I

    .line 17
    .line 18
    .line 19
    move-result v12

    .line 20
    invoke-interface {v2}, LV5/v;->g()Z

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
    invoke-interface {v2, v14}, LV5/v;->b(I)Landroid/media/MediaCodecInfo;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget v6, Lu6/v;->a:I

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
    invoke-static {v0, v9, v13, v7}, LV5/y;->g(Landroid/media/MediaCodecInfo;Ljava/lang/String;ZLjava/lang/String;)Z

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
    invoke-static {v0, v9, v7}, LV5/y;->c(Landroid/media/MediaCodecInfo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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
    invoke-interface {v2, v4, v10, v9}, LV5/v;->c(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 72
    .line 73
    .line 74
    move-result v15

    .line 75
    invoke-interface {v2, v4, v9}, LV5/v;->d(Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 76
    .line 77
    .line 78
    move-result v16

    .line 79
    iget-boolean v8, v1, LV5/t;->c:Z

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
    invoke-interface {v2, v3, v10, v9}, LV5/v;->c(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    invoke-interface {v2, v3, v9}, LV5/v;->d(Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 96
    .line 97
    .line 98
    move-result v15
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 99
    iget-boolean v2, v1, LV5/t;->b:Z

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
    invoke-static {v0, v7}, LV5/y;->h(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v15

    .line 124
    xor-int/lit8 v15, v15, 0x1

    .line 125
    .line 126
    :goto_1
    invoke-static {v0, v7}, LV5/y;->h(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

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
    invoke-static/range {v6 .. v11}, LV5/n;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZ)LV5/n;

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
    invoke-static/range {v6 .. v11}, LV5/n;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZ)LV5/n;

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
    sget v6, Lu6/v;->a:I
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
    invoke-static {v10, v0}, Lu6/a;->o(Ljava/lang/String;Ljava/lang/String;)V

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
    invoke-static {v10, v1}, Lu6/a;->o(Ljava/lang/String;Ljava/lang/String;)V

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
    new-instance v1, LV5/u;

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

.method public static g(Landroid/media/MediaCodecInfo;Ljava/lang/String;ZLjava/lang/String;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_a

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
    sget p0, Lu6/v;->a:I

    .line 20
    .line 21
    const/16 p2, 0x15

    .line 22
    .line 23
    if-ge p0, p2, :cond_1

    .line 24
    .line 25
    const-string p2, "CIPAACDecoder"

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-nez p2, :cond_a

    .line 32
    .line 33
    const-string p2, "CIPMP3Decoder"

    .line 34
    .line 35
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-nez p2, :cond_a

    .line 40
    .line 41
    const-string p2, "CIPVorbisDecoder"

    .line 42
    .line 43
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-nez p2, :cond_a

    .line 48
    .line 49
    const-string p2, "CIPAMRNBDecoder"

    .line 50
    .line 51
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-nez p2, :cond_a

    .line 56
    .line 57
    const-string p2, "AACDecoder"

    .line 58
    .line 59
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-nez p2, :cond_a

    .line 64
    .line 65
    const-string p2, "MP3Decoder"

    .line 66
    .line 67
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    if-eqz p2, :cond_1

    .line 72
    .line 73
    goto/16 :goto_0

    .line 74
    .line 75
    :cond_1
    const/16 p2, 0x12

    .line 76
    .line 77
    if-ge p0, p2, :cond_2

    .line 78
    .line 79
    const-string p2, "OMX.MTK.AUDIO.DECODER.AAC"

    .line 80
    .line 81
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-eqz p2, :cond_2

    .line 86
    .line 87
    sget-object p2, Lu6/v;->b:Ljava/lang/String;

    .line 88
    .line 89
    const-string v0, "a70"

    .line 90
    .line 91
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_a

    .line 96
    .line 97
    const-string v0, "Xiaomi"

    .line 98
    .line 99
    sget-object v1, Lu6/v;->c:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    const-string v0, "HM"

    .line 108
    .line 109
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-eqz p2, :cond_2

    .line 114
    .line 115
    goto/16 :goto_0

    .line 116
    .line 117
    :cond_2
    const/16 p2, 0x10

    .line 118
    .line 119
    if-ne p0, p2, :cond_3

    .line 120
    .line 121
    const-string v0, "OMX.qcom.audio.decoder.mp3"

    .line 122
    .line 123
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_3

    .line 128
    .line 129
    sget-object v0, Lu6/v;->b:Ljava/lang/String;

    .line 130
    .line 131
    const-string v1, "dlxu"

    .line 132
    .line 133
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-nez v1, :cond_a

    .line 138
    .line 139
    const-string v1, "protou"

    .line 140
    .line 141
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-nez v1, :cond_a

    .line 146
    .line 147
    const-string v1, "ville"

    .line 148
    .line 149
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-nez v1, :cond_a

    .line 154
    .line 155
    const-string v1, "villeplus"

    .line 156
    .line 157
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-nez v1, :cond_a

    .line 162
    .line 163
    const-string v1, "villec2"

    .line 164
    .line 165
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-nez v1, :cond_a

    .line 170
    .line 171
    const-string v1, "gee"

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-nez v1, :cond_a

    .line 178
    .line 179
    const-string v1, "C6602"

    .line 180
    .line 181
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-nez v1, :cond_a

    .line 186
    .line 187
    const-string v1, "C6603"

    .line 188
    .line 189
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-nez v1, :cond_a

    .line 194
    .line 195
    const-string v1, "C6606"

    .line 196
    .line 197
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-nez v1, :cond_a

    .line 202
    .line 203
    const-string v1, "C6616"

    .line 204
    .line 205
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-nez v1, :cond_a

    .line 210
    .line 211
    const-string v1, "L36h"

    .line 212
    .line 213
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-nez v1, :cond_a

    .line 218
    .line 219
    const-string v1, "SO-02E"

    .line 220
    .line 221
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_3

    .line 226
    .line 227
    goto/16 :goto_0

    .line 228
    .line 229
    :cond_3
    if-ne p0, p2, :cond_4

    .line 230
    .line 231
    const-string p2, "OMX.qcom.audio.decoder.aac"

    .line 232
    .line 233
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result p2

    .line 237
    if-eqz p2, :cond_4

    .line 238
    .line 239
    sget-object p2, Lu6/v;->b:Ljava/lang/String;

    .line 240
    .line 241
    const-string v0, "C1504"

    .line 242
    .line 243
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-nez v0, :cond_a

    .line 248
    .line 249
    const-string v0, "C1505"

    .line 250
    .line 251
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-nez v0, :cond_a

    .line 256
    .line 257
    const-string v0, "C1604"

    .line 258
    .line 259
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-nez v0, :cond_a

    .line 264
    .line 265
    const-string v0, "C1605"

    .line 266
    .line 267
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result p2

    .line 271
    if-eqz p2, :cond_4

    .line 272
    .line 273
    goto/16 :goto_0

    .line 274
    .line 275
    :cond_4
    const/16 p2, 0x18

    .line 276
    .line 277
    const-string v0, "samsung"

    .line 278
    .line 279
    if-ge p0, p2, :cond_6

    .line 280
    .line 281
    const-string p2, "OMX.SEC.aac.dec"

    .line 282
    .line 283
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result p2

    .line 287
    if-nez p2, :cond_5

    .line 288
    .line 289
    const-string p2, "OMX.Exynos.AAC.Decoder"

    .line 290
    .line 291
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result p2

    .line 295
    if-eqz p2, :cond_6

    .line 296
    .line 297
    :cond_5
    sget-object p2, Lu6/v;->c:Ljava/lang/String;

    .line 298
    .line 299
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result p2

    .line 303
    if-eqz p2, :cond_6

    .line 304
    .line 305
    sget-object p2, Lu6/v;->b:Ljava/lang/String;

    .line 306
    .line 307
    const-string v1, "zeroflte"

    .line 308
    .line 309
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    if-nez v1, :cond_a

    .line 314
    .line 315
    const-string v1, "zerolte"

    .line 316
    .line 317
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    if-nez v1, :cond_a

    .line 322
    .line 323
    const-string v1, "zenlte"

    .line 324
    .line 325
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    if-nez v1, :cond_a

    .line 330
    .line 331
    const-string v1, "SC-05G"

    .line 332
    .line 333
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    if-nez v1, :cond_a

    .line 338
    .line 339
    const-string v1, "marinelteatt"

    .line 340
    .line 341
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    if-nez v1, :cond_a

    .line 346
    .line 347
    const-string v1, "404SC"

    .line 348
    .line 349
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    if-nez v1, :cond_a

    .line 354
    .line 355
    const-string v1, "SC-04G"

    .line 356
    .line 357
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    if-nez v1, :cond_a

    .line 362
    .line 363
    const-string v1, "SCV31"

    .line 364
    .line 365
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result p2

    .line 369
    if-eqz p2, :cond_6

    .line 370
    .line 371
    goto/16 :goto_0

    .line 372
    .line 373
    :cond_6
    const-string p2, "jflte"

    .line 374
    .line 375
    const/16 v1, 0x13

    .line 376
    .line 377
    if-gt p0, v1, :cond_7

    .line 378
    .line 379
    const-string v2, "OMX.SEC.vp8.dec"

    .line 380
    .line 381
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    if-eqz v2, :cond_7

    .line 386
    .line 387
    sget-object v2, Lu6/v;->c:Ljava/lang/String;

    .line 388
    .line 389
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    if-eqz v0, :cond_7

    .line 394
    .line 395
    sget-object v0, Lu6/v;->b:Ljava/lang/String;

    .line 396
    .line 397
    const-string v2, "d2"

    .line 398
    .line 399
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    if-nez v2, :cond_a

    .line 404
    .line 405
    const-string v2, "serrano"

    .line 406
    .line 407
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    if-nez v2, :cond_a

    .line 412
    .line 413
    invoke-virtual {v0, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    if-nez v2, :cond_a

    .line 418
    .line 419
    const-string v2, "santos"

    .line 420
    .line 421
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    if-nez v2, :cond_a

    .line 426
    .line 427
    const-string v2, "t0"

    .line 428
    .line 429
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    if-eqz v0, :cond_7

    .line 434
    .line 435
    goto :goto_0

    .line 436
    :cond_7
    if-gt p0, v1, :cond_8

    .line 437
    .line 438
    sget-object v0, Lu6/v;->b:Ljava/lang/String;

    .line 439
    .line 440
    invoke-virtual {v0, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 441
    .line 442
    .line 443
    move-result p2

    .line 444
    if-eqz p2, :cond_8

    .line 445
    .line 446
    const-string p2, "OMX.qcom.video.decoder.vp8"

    .line 447
    .line 448
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result p2

    .line 452
    if-eqz p2, :cond_8

    .line 453
    .line 454
    goto :goto_0

    .line 455
    :cond_8
    const/16 p2, 0x17

    .line 456
    .line 457
    if-gt p0, p2, :cond_9

    .line 458
    .line 459
    const-string p0, "audio/eac3-joc"

    .line 460
    .line 461
    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result p0

    .line 465
    if-eqz p0, :cond_9

    .line 466
    .line 467
    const-string p0, "OMX.MTK.AUDIO.DECODER.DSPAC3"

    .line 468
    .line 469
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result p0

    .line 473
    if-eqz p0, :cond_9

    .line 474
    .line 475
    goto :goto_0

    .line 476
    :cond_9
    const/4 p0, 0x1

    .line 477
    return p0

    .line 478
    :cond_a
    :goto_0
    const/4 p0, 0x0

    .line 479
    return p0
.end method

.method public static h(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, Lu6/v;->a:I

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
    invoke-static {p1}, Lu6/k;->g(Ljava/lang/String;)Z

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

.method public static i()I
    .locals 7

    .line 1
    sget v0, LV5/y;->c:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_7

    .line 5
    .line 6
    const-string v0, "video/avc"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {v0, v2, v2}, LV5/y;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, LV5/n;

    .line 26
    .line 27
    :goto_0
    if-eqz v0, :cond_6

    .line 28
    .line 29
    iget-object v0, v0, LV5/n;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, v0, Landroid/media/MediaCodecInfo$CodecCapabilities;->profileLevels:[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    :cond_1
    new-array v0, v2, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 38
    .line 39
    :cond_2
    array-length v3, v0

    .line 40
    move v4, v2

    .line 41
    :goto_1
    if-ge v2, v3, :cond_4

    .line 42
    .line 43
    aget-object v5, v0, v2

    .line 44
    .line 45
    iget v5, v5, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 46
    .line 47
    const/4 v6, 0x1

    .line 48
    if-eq v5, v6, :cond_3

    .line 49
    .line 50
    const/4 v6, 0x2

    .line 51
    if-eq v5, v6, :cond_3

    .line 52
    .line 53
    sparse-switch v5, :sswitch_data_0

    .line 54
    .line 55
    .line 56
    move v5, v1

    .line 57
    goto :goto_2

    .line 58
    :sswitch_0
    const/high16 v5, 0x2200000

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :sswitch_1
    const/high16 v5, 0x900000

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :sswitch_2
    const v5, 0x564000

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :sswitch_3
    const/high16 v5, 0x220000

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :sswitch_4
    const/high16 v5, 0x200000

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :sswitch_5
    const/high16 v5, 0x140000

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :sswitch_6
    const v5, 0xe1000

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :sswitch_7
    const v5, 0x65400

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :sswitch_8
    const v5, 0x31800

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :sswitch_9
    const v5, 0x18c00

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    const/16 v5, 0x6300

    .line 94
    .line 95
    :goto_2
    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    add-int/lit8 v2, v2, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    sget v0, Lu6/v;->a:I

    .line 103
    .line 104
    const/16 v1, 0x15

    .line 105
    .line 106
    if-lt v0, v1, :cond_5

    .line 107
    .line 108
    const v0, 0x54600

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    const v0, 0x2a300

    .line 113
    .line 114
    .line 115
    :goto_3
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    :cond_6
    sput v2, LV5/y;->c:I

    .line 120
    .line 121
    :cond_7
    sget v0, LV5/y;->c:I

    .line 122
    .line 123
    return v0

    .line 124
    nop

    .line 125
    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_9
        0x10 -> :sswitch_9
        0x20 -> :sswitch_9
        0x40 -> :sswitch_8
        0x80 -> :sswitch_7
        0x100 -> :sswitch_7
        0x200 -> :sswitch_6
        0x400 -> :sswitch_5
        0x800 -> :sswitch_4
        0x1000 -> :sswitch_4
        0x2000 -> :sswitch_3
        0x4000 -> :sswitch_2
        0x8000 -> :sswitch_1
        0x10000 -> :sswitch_1
        0x20000 -> :sswitch_0
        0x40000 -> :sswitch_0
        0x80000 -> :sswitch_0
    .end sparse-switch
.end method
