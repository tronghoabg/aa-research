.class Lcom/applovin/impl/g6$b$a;
.super Lcom/applovin/impl/i3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/g6$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/applovin/mediation/MaxAdFormat;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/applovin/impl/g6$b;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/g6$b;Lcom/applovin/impl/mediation/ads/a$a;Lcom/applovin/mediation/MaxAdFormat;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/applovin/impl/g6$b$a;->b:Lcom/applovin/mediation/MaxAdFormat;

    .line 4
    .line 5
    iput-object p4, p0, Lcom/applovin/impl/g6$b$a;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/applovin/impl/i3;-><init>(Lcom/applovin/impl/mediation/ads/a$a;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onAdLoadFailed(Ljava/lang/String;Lcom/applovin/mediation/MaxError;)V
    .locals 10

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 6
    .line 7
    invoke-static {v2}, Lcom/applovin/impl/g6$b;->i(Lcom/applovin/impl/g6$b;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    sub-long v7, v0, v2

    .line 12
    .line 13
    iget-object v0, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 14
    .line 15
    invoke-static {v0}, Lcom/applovin/impl/g6$b;->d(Lcom/applovin/impl/g6$b;)Lcom/applovin/impl/sdk/o;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 25
    .line 26
    invoke-static {v0}, Lcom/applovin/impl/g6$b;->f(Lcom/applovin/impl/g6$b;)Lcom/applovin/impl/sdk/o;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 31
    .line 32
    invoke-static {v1}, Lcom/applovin/impl/g6$b;->e(Lcom/applovin/impl/g6$b;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "Ad failed to load in "

    .line 37
    .line 38
    const-string v3, " ms for "

    .line 39
    .line 40
    invoke-static {v7, v8, v2, v3}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v3, p0, Lcom/applovin/impl/g6$b$a;->b:Lcom/applovin/mediation/MaxAdFormat;

    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/applovin/mediation/MaxAdFormat;->getLabel()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v3, " ad unit "

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p1, " with error: "

    .line 62
    .line 63
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v0, v1, p1}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_0
    iget-object p1, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 77
    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v1, "failed to load ad: "

    .line 81
    .line 82
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p2}, Lcom/applovin/mediation/MaxError;->getCode()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {p1, v0}, Lcom/applovin/impl/g6$b;->a(Lcom/applovin/impl/g6$b;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object v4, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 100
    .line 101
    invoke-static {v4}, Lcom/applovin/impl/g6$b;->g(Lcom/applovin/impl/g6$b;)Lcom/applovin/impl/y2;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    sget-object v6, Lcom/applovin/mediation/MaxNetworkResponseInfo$AdLoadState;->FAILED_TO_LOAD:Lcom/applovin/mediation/MaxNetworkResponseInfo$AdLoadState;

    .line 106
    .line 107
    move-object v9, p2

    .line 108
    invoke-static/range {v4 .. v9}, Lcom/applovin/impl/g6$b;->a(Lcom/applovin/impl/g6$b;Lcom/applovin/impl/y2;Lcom/applovin/mediation/MaxNetworkResponseInfo$AdLoadState;JLcom/applovin/mediation/MaxError;)V

    .line 109
    .line 110
    .line 111
    iget-object p1, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 112
    .line 113
    invoke-static {p1}, Lcom/applovin/impl/g6$b;->b(Lcom/applovin/impl/g6$b;)I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    iget-object p2, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 118
    .line 119
    invoke-static {p2}, Lcom/applovin/impl/g6$b;->c(Lcom/applovin/impl/g6$b;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    add-int/lit8 p2, p2, -0x1

    .line 128
    .line 129
    if-ge p1, p2, :cond_1

    .line 130
    .line 131
    new-instance p1, Lcom/applovin/impl/g6$b;

    .line 132
    .line 133
    iget-object p2, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 134
    .line 135
    iget-object v0, p2, Lcom/applovin/impl/g6$b;->k:Lcom/applovin/impl/g6;

    .line 136
    .line 137
    invoke-static {p2}, Lcom/applovin/impl/g6$b;->b(Lcom/applovin/impl/g6$b;)I

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    add-int/lit8 p2, p2, 0x1

    .line 142
    .line 143
    iget-object v1, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 144
    .line 145
    invoke-static {v1}, Lcom/applovin/impl/g6$b;->c(Lcom/applovin/impl/g6$b;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    const/4 v2, 0x0

    .line 150
    invoke-direct {p1, v0, p2, v1, v2}, Lcom/applovin/impl/g6$b;-><init>(Lcom/applovin/impl/g6;ILjava/util/List;Lcom/applovin/impl/g6$a;)V

    .line 151
    .line 152
    .line 153
    iget-object p2, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 154
    .line 155
    invoke-static {p2}, Lcom/applovin/impl/g6$b;->h(Lcom/applovin/impl/g6$b;)Lcom/applovin/impl/sdk/k;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-virtual {p2}, Lcom/applovin/impl/sdk/k;->r0()Lcom/applovin/impl/e6;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    sget-object v0, Lcom/applovin/impl/e6$b;->c:Lcom/applovin/impl/e6$b;

    .line 164
    .line 165
    invoke-virtual {p2, p1, v0}, Lcom/applovin/impl/e6;->a(Lcom/applovin/impl/j5;Lcom/applovin/impl/e6$b;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_1
    new-instance p1, Lcom/applovin/impl/mediation/MaxErrorImpl;

    .line 170
    .line 171
    const/16 p2, -0x1389

    .line 172
    .line 173
    const-string v0, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."

    .line 174
    .line 175
    invoke-direct {p1, p2, v0}, Lcom/applovin/impl/mediation/MaxErrorImpl;-><init>(ILjava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget-object p2, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 179
    .line 180
    iget-object p2, p2, Lcom/applovin/impl/g6$b;->k:Lcom/applovin/impl/g6;

    .line 181
    .line 182
    invoke-static {p2, p1}, Lcom/applovin/impl/g6;->a(Lcom/applovin/impl/g6;Lcom/applovin/mediation/MaxError;)V

    .line 183
    .line 184
    .line 185
    return-void
.end method

.method public onAdLoaded(Lcom/applovin/mediation/MaxAd;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 2
    .line 3
    const-string v1, "loaded ad"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/applovin/impl/g6$b;->a(Lcom/applovin/impl/g6$b;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object v2, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 13
    .line 14
    invoke-static {v2}, Lcom/applovin/impl/g6$b;->i(Lcom/applovin/impl/g6$b;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    sub-long v7, v0, v2

    .line 19
    .line 20
    iget-object v0, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/applovin/impl/g6$b;->j(Lcom/applovin/impl/g6$b;)Lcom/applovin/impl/sdk/o;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 32
    .line 33
    invoke-static {v0}, Lcom/applovin/impl/g6$b;->a(Lcom/applovin/impl/g6$b;)Lcom/applovin/impl/sdk/o;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v1, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 38
    .line 39
    invoke-static {v1}, Lcom/applovin/impl/g6$b;->k(Lcom/applovin/impl/g6$b;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, "Ad loaded in "

    .line 44
    .line 45
    const-string v3, "ms for "

    .line 46
    .line 47
    invoke-static {v7, v8, v2, v3}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iget-object v3, p0, Lcom/applovin/impl/g6$b$a;->b:Lcom/applovin/mediation/MaxAdFormat;

    .line 52
    .line 53
    const-string v4, " ad unit "

    .line 54
    .line 55
    invoke-static {v3, v2, v4}, Lcb/a;->r(Lcom/applovin/mediation/MaxAdFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object v3, p0, Lcom/applovin/impl/g6$b$a;->c:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v2, v3, v0, v1}, Lcb/a;->w(Ljava/lang/StringBuilder;Ljava/lang/String;Lcom/applovin/impl/sdk/o;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    iget-object v4, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 64
    .line 65
    move-object v5, p1

    .line 66
    check-cast v5, Lcom/applovin/impl/y2;

    .line 67
    .line 68
    sget-object v6, Lcom/applovin/mediation/MaxNetworkResponseInfo$AdLoadState;->AD_LOADED:Lcom/applovin/mediation/MaxNetworkResponseInfo$AdLoadState;

    .line 69
    .line 70
    const/4 v9, 0x0

    .line 71
    invoke-static/range {v4 .. v9}, Lcom/applovin/impl/g6$b;->a(Lcom/applovin/impl/g6$b;Lcom/applovin/impl/y2;Lcom/applovin/mediation/MaxNetworkResponseInfo$AdLoadState;JLcom/applovin/mediation/MaxError;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 75
    .line 76
    invoke-static {p1}, Lcom/applovin/impl/g6$b;->b(Lcom/applovin/impl/g6$b;)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    :goto_0
    add-int/lit8 p1, p1, 0x1

    .line 81
    .line 82
    iget-object v0, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 83
    .line 84
    invoke-static {v0}, Lcom/applovin/impl/g6$b;->c(Lcom/applovin/impl/g6$b;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-ge p1, v0, :cond_1

    .line 93
    .line 94
    iget-object v6, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 95
    .line 96
    invoke-static {v6}, Lcom/applovin/impl/g6$b;->c(Lcom/applovin/impl/g6$b;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    move-object v7, v0

    .line 105
    check-cast v7, Lcom/applovin/impl/y2;

    .line 106
    .line 107
    sget-object v8, Lcom/applovin/mediation/MaxNetworkResponseInfo$AdLoadState;->AD_LOAD_NOT_ATTEMPTED:Lcom/applovin/mediation/MaxNetworkResponseInfo$AdLoadState;

    .line 108
    .line 109
    const-wide/16 v9, -0x1

    .line 110
    .line 111
    const/4 v11, 0x0

    .line 112
    invoke-static/range {v6 .. v11}, Lcom/applovin/impl/g6$b;->a(Lcom/applovin/impl/g6$b;Lcom/applovin/impl/y2;Lcom/applovin/mediation/MaxNetworkResponseInfo$AdLoadState;JLcom/applovin/mediation/MaxError;)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    iget-object p1, p0, Lcom/applovin/impl/g6$b$a;->d:Lcom/applovin/impl/g6$b;

    .line 117
    .line 118
    iget-object p1, p1, Lcom/applovin/impl/g6$b;->k:Lcom/applovin/impl/g6;

    .line 119
    .line 120
    invoke-static {p1, v5}, Lcom/applovin/impl/g6;->a(Lcom/applovin/impl/g6;Lcom/applovin/impl/y2;)V

    .line 121
    .line 122
    .line 123
    return-void
.end method
