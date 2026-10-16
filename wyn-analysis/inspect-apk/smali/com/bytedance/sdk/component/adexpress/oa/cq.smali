.class public Lcom/bytedance/sdk/component/adexpress/oa/cq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;
    }
.end annotation


# instance fields
.field private ab:Z

.field private bcc:Ljava/lang/String;

.field private bs:Ljava/lang/String;

.field private cp:Lorg/json/JSONObject;

.field private cq:Ljava/lang/String;

.field private cz:Z

.field private dhk:I

.field private dj:J

.field private dxx:I

.field private dz:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private fz:Ljava/lang/String;

.field private gr:Z

.field private gsd:D

.field private gzw:Ljava/lang/String;

.field private ivm:Ljava/lang/String;

.field private final km:Ljava/lang/String;

.field private ku:Z

.field private lw:I

.field private final lz:Z

.field private moa:Lcom/bytedance/sdk/component/adexpress/oa/cz;

.field private oa:Lcom/bytedance/sdk/component/adexpress/oa/lw;

.field private oib:I

.field private orq:I

.field private final oyt:Ljava/lang/String;

.field private pz:Lorg/json/JSONObject;

.field private rt:I

.field private sy:I

.field private tpx:I

.field private ue:Lorg/json/JSONObject;

.field private uef:Lorg/json/JSONObject;

.field private wk:I

.field private wrv:I

.field private xs:Ljava/lang/String;

.field private yo:Ljava/lang/String;

.field private zjm:I


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->uef(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Lorg/json/JSONObject;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->uef:Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->oa(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Lcom/bytedance/sdk/component/adexpress/oa/lw;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->oa:Lcom/bytedance/sdk/component/adexpress/oa/lw;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->yo(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->yo:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->moa(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Lcom/bytedance/sdk/component/adexpress/oa/cz;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->moa:Lcom/bytedance/sdk/component/adexpress/oa/cz;

    .line 27
    .line 28
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->lw(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iput v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->lw:I

    .line 33
    .line 34
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->ivm(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->ivm:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->xs(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->xs:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->bcc(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->bcc:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->cz(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput-boolean v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->cz:Z

    .line 57
    .line 58
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->zjm(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iput v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->zjm:I

    .line 63
    .line 64
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->dj(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    iput-wide v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->dj:J

    .line 69
    .line 70
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->wrv(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iput v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->wrv:I

    .line 75
    .line 76
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->cq(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->cq:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->dz(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Ljava/util/Map;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->dz:Ljava/util/Map;

    .line 87
    .line 88
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->wk(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iput v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->wk:I

    .line 93
    .line 94
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->ab(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iput-boolean v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->ab:Z

    .line 99
    .line 100
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->bs(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->bs:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->sy(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    iput v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->sy:I

    .line 111
    .line 112
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->oib(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    iput v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->oib:I

    .line 117
    .line 118
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->dhk(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    iput v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->dhk:I

    .line 123
    .line 124
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->tpx(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    iput v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->tpx:I

    .line 129
    .line 130
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->orq(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    iput v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->orq:I

    .line 135
    .line 136
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->gzw(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->gzw:Ljava/lang/String;

    .line 141
    .line 142
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->gsd(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)D

    .line 143
    .line 144
    .line 145
    move-result-wide v0

    .line 146
    iput-wide v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->gsd:D

    .line 147
    .line 148
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->rt(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    iput v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->rt:I

    .line 153
    .line 154
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->gr(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    iput-boolean v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->gr:Z

    .line 159
    .line 160
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->ue(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Lorg/json/JSONObject;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->ue:Lorg/json/JSONObject;

    .line 165
    .line 166
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->pz(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Lorg/json/JSONObject;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->pz:Lorg/json/JSONObject;

    .line 171
    .line 172
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->cp(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->cp:Lorg/json/JSONObject;

    .line 177
    .line 178
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->ku(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    iput-boolean v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->ku:Z

    .line 183
    .line 184
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->fz(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->fz:Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->dxx(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    iput v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->dxx:I

    .line 195
    .line 196
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->lz(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    iput-boolean v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->lz:Z

    .line 201
    .line 202
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->oyt(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->oyt:Ljava/lang/String;

    .line 207
    .line 208
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;->km(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->km:Ljava/lang/String;

    .line 213
    .line 214
    return-void
.end method


# virtual methods
.method public ab()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->oib:I

    .line 2
    .line 3
    return v0
.end method

.method public bcc()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->cz:Z

    .line 2
    .line 3
    return v0
.end method

.method public bs()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->dhk:I

    .line 2
    .line 3
    return v0
.end method

.method public cq()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->ab:Z

    .line 2
    .line 3
    return v0
.end method

.method public cz()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->dj:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public dhk()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->cp:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public dj()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->dz:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public dz()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->bs:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public gr()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->lz:Z

    .line 2
    .line 3
    return v0
.end method

.method public gsd()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->fz:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public gzw()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->ku:Z

    .line 2
    .line 3
    return v0
.end method

.method public ivm()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->lw:I

    .line 2
    .line 3
    return v0
.end method

.method public lw()Lcom/bytedance/sdk/component/adexpress/oa/cz;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->moa:Lcom/bytedance/sdk/component/adexpress/oa/cz;

    .line 2
    .line 3
    return-object v0
.end method

.method public moa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->yo:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public oa()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->gsd:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public oib()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->pz:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public orq()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->orq:I

    .line 2
    .line 3
    return v0
.end method

.method public pz()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->km:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public rt()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->dxx:I

    .line 2
    .line 3
    return v0
.end method

.method public sy()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->ue:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public tpx()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->tpx:I

    .line 2
    .line 3
    return v0
.end method

.method public ue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->oyt:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->gr:Z

    .line 2
    .line 3
    return v0
.end method

.method public wk()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->sy:I

    .line 2
    .line 3
    return v0
.end method

.method public wrv()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->wk:I

    .line 2
    .line 3
    return v0
.end method

.method public xs()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->rt:I

    .line 2
    .line 3
    return v0
.end method

.method public yo()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->uef:Lorg/json/JSONObject;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->oa:Lcom/bytedance/sdk/component/adexpress/oa/lw;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/bytedance/sdk/component/adexpress/oa/lw;->uef()Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->uef:Lorg/json/JSONObject;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->uef:Lorg/json/JSONObject;

    .line 16
    .line 17
    return-object v0
.end method

.method public zjm()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/cq;->wrv:I

    .line 2
    .line 3
    return v0
.end method
