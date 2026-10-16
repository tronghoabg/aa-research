.class public Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ab:I

.field private bcc:Ljava/lang/String;

.field private bs:I

.field private cq:I

.field private cz:Ljava/lang/String;

.field private dhk:I

.field private dj:D

.field private dz:F

.field private ivm:Ljava/lang/String;

.field private lw:Ljava/lang/String;

.field private moa:D

.field private oa:I

.field private oib:I

.field private sy:I

.field private uef:I

.field private wk:I

.field private wrv:I

.field private xs:Ljava/lang/String;

.field private yo:J

.field private zjm:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, -0x40800000    # -1.0f

    .line 5
    .line 6
    iput v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->dz:F

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->wk:I

    .line 10
    .line 11
    iput v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->ab:I

    .line 12
    .line 13
    iput v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->bs:I

    .line 14
    .line 15
    iput v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->sy:I

    .line 16
    .line 17
    const v0, 0x4b000

    .line 18
    .line 19
    .line 20
    iput v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->oib:I

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->dhk:I

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public ab()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->bs:I

    .line 2
    .line 3
    return v0
.end method

.method public bcc()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->dz:F

    return v0
.end method

.method public bcc(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->wk:I

    return-void
.end method

.method public bs()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->sy:I

    .line 2
    .line 3
    return v0
.end method

.method public cq()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->cz:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public cz()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->lw:Ljava/lang/String;

    return-object v0
.end method

.method public cz(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->ab:I

    return-void
.end method

.method public dhk()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->ab:I

    .line 2
    .line 3
    return v0
.end method

.method public dj()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->xs:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public dz()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->zjm:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->xs:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/xs/oa;->uef(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->zjm:Ljava/lang/String;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->zjm:Ljava/lang/String;

    .line 18
    .line 19
    return-object v0
.end method

.method public ivm()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->moa:D

    return-wide v0
.end method

.method public ivm(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->bs:I

    return-void
.end method

.method public ivm(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->zjm:Ljava/lang/String;

    return-void
.end method

.method public lw()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->yo:J

    return-wide v0
.end method

.method public lw(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->oib:I

    return-void
.end method

.method public lw(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->cz:Ljava/lang/String;

    return-void
.end method

.method public moa()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->cq:I

    return v0
.end method

.method public moa(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->cq:I

    return-void
.end method

.method public moa(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->bcc:Ljava/lang/String;

    return-void
.end method

.method public oa()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->uef:I

    return v0
.end method

.method public oa(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->uef:I

    return-void
.end method

.method public oa(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->ivm:Ljava/lang/String;

    return-void
.end method

.method public oib()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->wk:I

    .line 2
    .line 3
    return v0
.end method

.method public orq()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->dhk:I

    .line 2
    .line 3
    return v0
.end method

.method public sy()Lorg/json/JSONObject;
    .locals 5

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-string v1, "cover_height"

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->oa()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 13
    .line 14
    .line 15
    const-string v1, "cover_url"

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->zjm()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    const-string v1, "cover_width"

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->yo()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    const-string v1, "endcard"

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->wrv()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    const-string v1, "file_hash"

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->dz()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 49
    .line 50
    .line 51
    const-string v1, "resolution"

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->cz()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    const-string v1, "size"

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->lw()J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 67
    .line 68
    .line 69
    const-string v1, "video_duration"

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->ivm()D

    .line 72
    .line 73
    .line 74
    move-result-wide v2

    .line 75
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    const-string v1, "video_url"

    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->dj()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    const-string v1, "playable_download_url"

    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->cq()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 94
    .line 95
    .line 96
    const-string v1, "if_playable_loading_show"

    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->oib()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    const-string v1, "remove_loading_page_type"

    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->dhk()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 112
    .line 113
    .line 114
    const-string v1, "fallback_endcard_judge"

    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->uef()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 121
    .line 122
    .line 123
    const-string v1, "video_preload_size"

    .line 124
    .line 125
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->wk()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 130
    .line 131
    .line 132
    const-string v1, "reward_video_cached_type"

    .line 133
    .line 134
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->ab()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    const-string v1, "execute_cached_type"

    .line 142
    .line 143
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->bs()I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 148
    .line 149
    .line 150
    const-string v1, "endcard_render"

    .line 151
    .line 152
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->moa()I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 157
    .line 158
    .line 159
    const-string v1, "replay_time"

    .line 160
    .line 161
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->orq()I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 166
    .line 167
    .line 168
    const-string v1, "play_speed_ratio"

    .line 169
    .line 170
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->bcc()F

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    float-to-double v2, v2

    .line 175
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->xs()D

    .line 179
    .line 180
    .line 181
    move-result-wide v1

    .line 182
    const-wide/16 v3, 0x0

    .line 183
    .line 184
    cmpl-double v1, v1, v3

    .line 185
    .line 186
    if-lez v1, :cond_0

    .line 187
    .line 188
    const-string v1, "start"

    .line 189
    .line 190
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->xs()D

    .line 191
    .line 192
    .line 193
    move-result-wide v2

    .line 194
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    .line 196
    .line 197
    :catch_0
    :cond_0
    return-object v0
.end method

.method public tpx()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->bs:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public uef()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->wrv:I

    return v0
.end method

.method public uef(D)V
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->moa:D

    return-void
.end method

.method public uef(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->wrv:I

    return-void
.end method

.method public uef(J)V
    .locals 0

    .line 3
    iput-wide p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->yo:J

    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->lw:Ljava/lang/String;

    return-void
.end method

.method public wk()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->oib:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    const v0, 0x4b000

    .line 6
    .line 7
    .line 8
    iput v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->oib:I

    .line 9
    .line 10
    :cond_0
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->oib:I

    .line 11
    .line 12
    int-to-long v0, v0

    .line 13
    iget-wide v2, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->yo:J

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-lez v0, :cond_1

    .line 18
    .line 19
    long-to-int v0, v2

    .line 20
    iput v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->oib:I

    .line 21
    .line 22
    :cond_1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->oib:I

    .line 23
    .line 24
    return v0
.end method

.method public wrv()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->bcc:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public xs()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->dj:D

    return-wide v0
.end method

.method public xs(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->sy:I

    return-void
.end method

.method public yo()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->oa:I

    return v0
.end method

.method public yo(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->oa:I

    return-void
.end method

.method public yo(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->xs:Ljava/lang/String;

    return-void
.end method

.method public zjm()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->ivm:Ljava/lang/String;

    return-object v0
.end method

.method public zjm(I)V
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    const/4 v0, 0x4

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->dhk:I

    return-void
.end method
