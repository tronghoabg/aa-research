.class public final Lcom/moloco/sdk/acm/db/d;
.super Lk3/e;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lcom/moloco/sdk/acm/db/e;


# direct methods
.method public synthetic constructor <init>(Lcom/moloco/sdk/acm/db/e;Lcom/moloco/sdk/acm/db/MetricsDb_Impl;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/moloco/sdk/acm/db/d;->d:I

    iput-object p1, p0, Lcom/moloco/sdk/acm/db/d;->e:Lcom/moloco/sdk/acm/db/e;

    invoke-direct {p0, p2}, LE9/c;-><init>(Lk3/m;)V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lcom/moloco/sdk/acm/db/d;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "INSERT OR ABORT INTO `events` (`id`,`name`,`timestamp`,`eventType`,`data`,`tags`) VALUES (nullif(?, 0),?,?,?,?,?)"

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    const-string v0, "INSERT OR REPLACE INTO `events` (`id`,`name`,`timestamp`,`eventType`,`data`,`tags`) VALUES (nullif(?, 0),?,?,?,?,?)"

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final w(Lo3/g;Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/moloco/sdk/acm/db/d;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Lcom/moloco/sdk/acm/db/a;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iget-wide v1, p2, Lcom/moloco/sdk/acm/db/a;->a:J

    .line 10
    .line 11
    invoke-interface {p1, v0, v1, v2}, Lo3/e;->G(IJ)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    iget-object v1, p2, Lcom/moloco/sdk/acm/db/a;->b:Ljava/lang/String;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-interface {p1, v0}, Lo3/e;->N(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-interface {p1, v0, v1}, Lo3/e;->x(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    const/4 v0, 0x3

    .line 27
    iget-wide v1, p2, Lcom/moloco/sdk/acm/db/a;->c:J

    .line 28
    .line 29
    invoke-interface {p1, v0, v1, v2}, Lo3/e;->G(IJ)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/moloco/sdk/acm/db/d;->e:Lcom/moloco/sdk/acm/db/e;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/moloco/sdk/acm/db/e;->c:La9/b;

    .line 35
    .line 36
    const-string v0, "eventType"

    .line 37
    .line 38
    iget-object v1, p2, Lcom/moloco/sdk/acm/db/a;->d:Lcom/moloco/sdk/acm/db/b;

    .line 39
    .line 40
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, 0x4

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    invoke-interface {p1, v1}, Lo3/e;->N(I)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-interface {p1, v1, v0}, Lo3/e;->x(ILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :goto_1
    const/4 v0, 0x5

    .line 58
    iget-object v1, p2, Lcom/moloco/sdk/acm/db/a;->e:Ljava/lang/Long;

    .line 59
    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    invoke-interface {p1, v0}, Lo3/e;->N(I)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 67
    .line 68
    .line 69
    move-result-wide v1

    .line 70
    invoke-interface {p1, v0, v1, v2}, Lo3/e;->G(IJ)V

    .line 71
    .line 72
    .line 73
    :goto_2
    const-string v0, "tags"

    .line 74
    .line 75
    iget-object v1, p2, Lcom/moloco/sdk/acm/db/a;->f:Ljava/util/List;

    .line 76
    .line 77
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    const/16 v6, 0x3e

    .line 82
    .line 83
    const-string v2, ","

    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    const/4 v5, 0x0

    .line 87
    invoke-static/range {v1 .. v6}, Lff/o;->w0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltf/l;I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    const/4 v0, 0x6

    .line 92
    if-nez p2, :cond_3

    .line 93
    .line 94
    invoke-interface {p1, v0}, Lo3/e;->N(I)V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_3
    invoke-interface {p1, v0, p2}, Lo3/e;->x(ILjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :goto_3
    return-void

    .line 102
    :pswitch_0
    check-cast p2, Lcom/moloco/sdk/acm/db/a;

    .line 103
    .line 104
    const/4 v0, 0x1

    .line 105
    iget-wide v1, p2, Lcom/moloco/sdk/acm/db/a;->a:J

    .line 106
    .line 107
    invoke-interface {p1, v0, v1, v2}, Lo3/e;->G(IJ)V

    .line 108
    .line 109
    .line 110
    const/4 v0, 0x2

    .line 111
    iget-object v1, p2, Lcom/moloco/sdk/acm/db/a;->b:Ljava/lang/String;

    .line 112
    .line 113
    if-nez v1, :cond_4

    .line 114
    .line 115
    invoke-interface {p1, v0}, Lo3/e;->N(I)V

    .line 116
    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_4
    invoke-interface {p1, v0, v1}, Lo3/e;->x(ILjava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :goto_4
    const/4 v0, 0x3

    .line 123
    iget-wide v1, p2, Lcom/moloco/sdk/acm/db/a;->c:J

    .line 124
    .line 125
    invoke-interface {p1, v0, v1, v2}, Lo3/e;->G(IJ)V

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lcom/moloco/sdk/acm/db/d;->e:Lcom/moloco/sdk/acm/db/e;

    .line 129
    .line 130
    iget-object v0, v0, Lcom/moloco/sdk/acm/db/e;->c:La9/b;

    .line 131
    .line 132
    const-string v0, "eventType"

    .line 133
    .line 134
    iget-object v1, p2, Lcom/moloco/sdk/acm/db/a;->d:Lcom/moloco/sdk/acm/db/b;

    .line 135
    .line 136
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    const/4 v1, 0x4

    .line 144
    if-nez v0, :cond_5

    .line 145
    .line 146
    invoke-interface {p1, v1}, Lo3/e;->N(I)V

    .line 147
    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_5
    invoke-interface {p1, v1, v0}, Lo3/e;->x(ILjava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :goto_5
    const/4 v0, 0x5

    .line 154
    iget-object v1, p2, Lcom/moloco/sdk/acm/db/a;->e:Ljava/lang/Long;

    .line 155
    .line 156
    if-nez v1, :cond_6

    .line 157
    .line 158
    invoke-interface {p1, v0}, Lo3/e;->N(I)V

    .line 159
    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 163
    .line 164
    .line 165
    move-result-wide v1

    .line 166
    invoke-interface {p1, v0, v1, v2}, Lo3/e;->G(IJ)V

    .line 167
    .line 168
    .line 169
    :goto_6
    const-string v0, "tags"

    .line 170
    .line 171
    iget-object v1, p2, Lcom/moloco/sdk/acm/db/a;->f:Ljava/util/List;

    .line 172
    .line 173
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    const/4 v3, 0x0

    .line 177
    const/16 v6, 0x3e

    .line 178
    .line 179
    const-string v2, ","

    .line 180
    .line 181
    const/4 v4, 0x0

    .line 182
    const/4 v5, 0x0

    .line 183
    invoke-static/range {v1 .. v6}, Lff/o;->w0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltf/l;I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    const/4 v0, 0x6

    .line 188
    if-nez p2, :cond_7

    .line 189
    .line 190
    invoke-interface {p1, v0}, Lo3/e;->N(I)V

    .line 191
    .line 192
    .line 193
    goto :goto_7

    .line 194
    :cond_7
    invoke-interface {p1, v0, p2}, Lo3/e;->x(ILjava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :goto_7
    return-void

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
