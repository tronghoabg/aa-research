.class public final Lcom/moloco/sdk/internal/services/events/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/moloco/sdk/internal/services/x;

.field public final b:Lcom/moloco/sdk/internal/services/c;

.field public final c:Lcom/moloco/sdk/internal/services/v;

.field public final d:Lcom/moloco/sdk/internal/services/i;

.field public final e:Lcom/moloco/sdk/internal/services/usertracker/c;

.field public final f:Lcom/moloco/sdk/internal/services/q;

.field public final g:Lcom/moloco/sdk/internal/services/proto/a;

.field public final h:Lcom/moloco/sdk/internal/services/events/e;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/x;Lcom/moloco/sdk/internal/services/c;Lcom/moloco/sdk/internal/services/v;Lcom/moloco/sdk/internal/services/i;Lcom/moloco/sdk/internal/services/usertracker/c;Lcom/moloco/sdk/internal/services/q;Lcom/moloco/sdk/internal/services/proto/a;Lcom/moloco/sdk/internal/services/events/e;)V
    .locals 1

    .line 1
    const-string v0, "appInfoService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "networkInfoService"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "deviceInfoService"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "screenInfoService"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "userIdentifierService"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "adDataService"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "encoderService"

    .line 32
    .line 33
    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "userEventConfigService"

    .line 37
    .line 38
    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/events/c;->a:Lcom/moloco/sdk/internal/services/x;

    .line 45
    .line 46
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/events/c;->b:Lcom/moloco/sdk/internal/services/c;

    .line 47
    .line 48
    iput-object p3, p0, Lcom/moloco/sdk/internal/services/events/c;->c:Lcom/moloco/sdk/internal/services/v;

    .line 49
    .line 50
    iput-object p4, p0, Lcom/moloco/sdk/internal/services/events/c;->d:Lcom/moloco/sdk/internal/services/i;

    .line 51
    .line 52
    iput-object p5, p0, Lcom/moloco/sdk/internal/services/events/c;->e:Lcom/moloco/sdk/internal/services/usertracker/c;

    .line 53
    .line 54
    iput-object p6, p0, Lcom/moloco/sdk/internal/services/events/c;->f:Lcom/moloco/sdk/internal/services/q;

    .line 55
    .line 56
    iput-object p7, p0, Lcom/moloco/sdk/internal/services/events/c;->g:Lcom/moloco/sdk/internal/services/proto/a;

    .line 57
    .line 58
    iput-object p8, p0, Lcom/moloco/sdk/internal/services/events/c;->h:Lcom/moloco/sdk/internal/services/events/e;

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final a(JLBa/c;Ljava/lang/String;Llf/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p5, Lcom/moloco/sdk/internal/services/events/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lcom/moloco/sdk/internal/services/events/b;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/internal/services/events/b;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/moloco/sdk/internal/services/events/b;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/internal/services/events/b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, Lcom/moloco/sdk/internal/services/events/b;-><init>(Lcom/moloco/sdk/internal/services/events/c;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, Lcom/moloco/sdk/internal/services/events/b;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/internal/services/events/b;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p4, v0, Lcom/moloco/sdk/internal/services/events/b;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p5}, LFe/e;->U(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p5}, LFe/e;->U(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p5, p0, Lcom/moloco/sdk/internal/services/events/c;->h:Lcom/moloco/sdk/internal/services/events/e;

    .line 54
    .line 55
    iget-object p5, p5, Lcom/moloco/sdk/internal/services/events/e;->a:Lcom/moloco/sdk/internal/services/events/g;

    .line 56
    .line 57
    iget-boolean p5, p5, Lcom/moloco/sdk/internal/services/events/g;->a:Z

    .line 58
    .line 59
    if-nez p5, :cond_3

    .line 60
    .line 61
    sget-object v4, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 62
    .line 63
    const-string v6, "Event reporting config disabled, UserAdInteractionExt not reporting"

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    const-string v5, "CustomUserEventBuilderServiceImpl"

    .line 67
    .line 68
    const/4 v8, 0x4

    .line 69
    const/4 v9, 0x0

    .line 70
    invoke-static/range {v4 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-object p4

    .line 74
    :cond_3
    iput-object p4, v0, Lcom/moloco/sdk/internal/services/events/b;->a:Ljava/lang/String;

    .line 75
    .line 76
    iput v3, v0, Lcom/moloco/sdk/internal/services/events/b;->d:I

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/moloco/sdk/internal/services/events/c;->b(JLBa/c;Llf/c;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p5

    .line 82
    if-ne p5, v1, :cond_4

    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_4
    :goto_1
    check-cast p5, Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const-string p2, "user_ad_interaction_ext"

    .line 96
    .line 97
    invoke-virtual {p1, p2, p5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    const-string p2, "toString(...)"

    .line 110
    .line 111
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object p1
.end method

.method public final b(JLBa/c;Llf/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p4, Lcom/moloco/sdk/internal/services/events/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/moloco/sdk/internal/services/events/a;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/internal/services/events/a;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/moloco/sdk/internal/services/events/a;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/internal/services/events/a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/moloco/sdk/internal/services/events/a;-><init>(Lcom/moloco/sdk/internal/services/events/c;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/moloco/sdk/internal/services/events/a;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/internal/services/events/a;->i:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-wide p1, v0, Lcom/moloco/sdk/internal/services/events/a;->f:J

    .line 37
    .line 38
    iget-object p3, v0, Lcom/moloco/sdk/internal/services/events/a;->e:Lcom/moloco/sdk/k1;

    .line 39
    .line 40
    iget-object v1, v0, Lcom/moloco/sdk/internal/services/events/a;->d:Lcom/moloco/sdk/k1;

    .line 41
    .line 42
    iget-object v2, v0, Lcom/moloco/sdk/internal/services/events/a;->c:Lcom/moloco/sdk/k1;

    .line 43
    .line 44
    iget-object v3, v0, Lcom/moloco/sdk/internal/services/events/a;->b:LBa/c;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/moloco/sdk/internal/services/events/a;->a:Lcom/moloco/sdk/internal/services/events/c;

    .line 47
    .line 48
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lcom/moloco/sdk/E1;->m()Lcom/moloco/sdk/k1;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    iget-object v2, p0, Lcom/moloco/sdk/internal/services/events/c;->h:Lcom/moloco/sdk/internal/services/events/e;

    .line 68
    .line 69
    iget-object v2, v2, Lcom/moloco/sdk/internal/services/events/e;->a:Lcom/moloco/sdk/internal/services/events/g;

    .line 70
    .line 71
    iget-boolean v2, v2, Lcom/moloco/sdk/internal/services/events/g;->b:Z

    .line 72
    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    iput-object p0, v0, Lcom/moloco/sdk/internal/services/events/a;->a:Lcom/moloco/sdk/internal/services/events/c;

    .line 76
    .line 77
    iput-object p3, v0, Lcom/moloco/sdk/internal/services/events/a;->b:LBa/c;

    .line 78
    .line 79
    iput-object p4, v0, Lcom/moloco/sdk/internal/services/events/a;->c:Lcom/moloco/sdk/k1;

    .line 80
    .line 81
    iput-object p4, v0, Lcom/moloco/sdk/internal/services/events/a;->d:Lcom/moloco/sdk/k1;

    .line 82
    .line 83
    iput-object p4, v0, Lcom/moloco/sdk/internal/services/events/a;->e:Lcom/moloco/sdk/k1;

    .line 84
    .line 85
    iput-wide p1, v0, Lcom/moloco/sdk/internal/services/events/a;->f:J

    .line 86
    .line 87
    iput v3, v0, Lcom/moloco/sdk/internal/services/events/a;->i:I

    .line 88
    .line 89
    iget-object v2, p0, Lcom/moloco/sdk/internal/services/events/c;->e:Lcom/moloco/sdk/internal/services/usertracker/c;

    .line 90
    .line 91
    invoke-virtual {v2, v0}, Lcom/moloco/sdk/internal/services/usertracker/c;->a(Llf/c;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-ne v0, v1, :cond_3

    .line 96
    .line 97
    return-object v1

    .line 98
    :cond_3
    move-object v3, p3

    .line 99
    move-object p3, p4

    .line 100
    move-object v1, p3

    .line 101
    move-object v2, v1

    .line 102
    move-object p4, v0

    .line 103
    move-object v0, p0

    .line 104
    :goto_1
    check-cast p4, Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {p3, p4}, Lcom/moloco/sdk/k1;->j(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    move-object p4, v1

    .line 110
    move-object p3, v3

    .line 111
    goto :goto_2

    .line 112
    :cond_4
    move-object v0, p0

    .line 113
    move-object v2, p4

    .line 114
    :goto_2
    iget-object v1, v0, Lcom/moloco/sdk/internal/services/events/c;->f:Lcom/moloco/sdk/internal/services/q;

    .line 115
    .line 116
    check-cast v1, Lcom/moloco/sdk/internal/services/r;

    .line 117
    .line 118
    invoke-virtual {v1}, Lcom/moloco/sdk/internal/services/r;->a()LFe/c;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    instance-of v3, v1, Lcom/moloco/sdk/internal/services/o;

    .line 123
    .line 124
    if-eqz v3, :cond_5

    .line 125
    .line 126
    check-cast v1, Lcom/moloco/sdk/internal/services/o;

    .line 127
    .line 128
    iget-object v1, v1, Lcom/moloco/sdk/internal/services/o;->a:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {p4, v1}, Lcom/moloco/sdk/k1;->a(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_5
    instance-of v1, v1, Lcom/moloco/sdk/internal/services/p;

    .line 135
    .line 136
    if-eqz v1, :cond_10

    .line 137
    .line 138
    :goto_3
    invoke-virtual {p4, p1, p2}, Lcom/moloco/sdk/k1;->f(J)V

    .line 139
    .line 140
    .line 141
    invoke-static {}, Lcom/moloco/sdk/w1;->c()Lcom/moloco/sdk/v1;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p1}, Lcom/moloco/sdk/v1;->a()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    check-cast p1, Lcom/moloco/sdk/w1;

    .line 153
    .line 154
    invoke-virtual {p4, p1}, Lcom/moloco/sdk/k1;->l(Lcom/moloco/sdk/w1;)V

    .line 155
    .line 156
    .line 157
    iget-object p1, v0, Lcom/moloco/sdk/internal/services/events/c;->d:Lcom/moloco/sdk/internal/services/i;

    .line 158
    .line 159
    invoke-virtual {p1}, Lcom/moloco/sdk/internal/services/i;->a()Lcom/moloco/sdk/internal/services/h;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    instance-of p2, p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/f;

    .line 164
    .line 165
    const/16 v1, 0xa

    .line 166
    .line 167
    if-eqz p2, :cond_6

    .line 168
    .line 169
    invoke-static {}, Lcom/moloco/sdk/u1;->b()Lcom/moloco/sdk/t1;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    check-cast p1, Lcom/moloco/sdk/u1;

    .line 178
    .line 179
    invoke-virtual {p4, p1}, Lcom/moloco/sdk/k1;->h(Lcom/moloco/sdk/u1;)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_6

    .line 183
    .line 184
    :cond_6
    instance-of p2, p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/e;

    .line 185
    .line 186
    if-eqz p2, :cond_a

    .line 187
    .line 188
    invoke-static {}, Lcom/moloco/sdk/p1;->g()Lcom/moloco/sdk/o1;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    check-cast p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/e;

    .line 193
    .line 194
    iget-object v3, p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/e;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 195
    .line 196
    invoke-static {v3}, LFe/e;->d(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;)Lcom/moloco/sdk/B1;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-virtual {p2, v3}, Lcom/moloco/sdk/o1;->b(Lcom/moloco/sdk/B1;)V

    .line 201
    .line 202
    .line 203
    invoke-static {}, Lcom/moloco/sdk/D1;->d()Lcom/moloco/sdk/C1;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    iget v4, p1, Lcom/moloco/sdk/internal/services/h;->b:F

    .line 208
    .line 209
    invoke-virtual {v3, v4}, Lcom/moloco/sdk/C1;->b(F)V

    .line 210
    .line 211
    .line 212
    iget p1, p1, Lcom/moloco/sdk/internal/services/h;->d:F

    .line 213
    .line 214
    invoke-virtual {v3, p1}, Lcom/moloco/sdk/C1;->a(F)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    const-string v3, "build(...)"

    .line 222
    .line 223
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    check-cast p1, Lcom/moloco/sdk/D1;

    .line 227
    .line 228
    invoke-virtual {p2, p1}, Lcom/moloco/sdk/o1;->c(Lcom/moloco/sdk/D1;)V

    .line 229
    .line 230
    .line 231
    iget-object p1, p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/e;->l:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/h;

    .line 232
    .line 233
    if-eqz p1, :cond_7

    .line 234
    .line 235
    invoke-static {p1}, LFe/e;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/h;)Lcom/moloco/sdk/D1;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {p2, p1}, Lcom/moloco/sdk/o1;->e(Lcom/moloco/sdk/D1;)V

    .line 240
    .line 241
    .line 242
    :cond_7
    iget-object p1, p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/e;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 243
    .line 244
    if-eqz p1, :cond_8

    .line 245
    .line 246
    invoke-static {p1}, LFe/e;->d(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;)Lcom/moloco/sdk/B1;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-virtual {p2, p1}, Lcom/moloco/sdk/o1;->d(Lcom/moloco/sdk/B1;)V

    .line 251
    .line 252
    .line 253
    :cond_8
    new-instance p1, Ljava/util/ArrayList;

    .line 254
    .line 255
    iget-object p3, p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/e;->m:Ljava/util/List;

    .line 256
    .line 257
    invoke-static {p3, v1}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    invoke-direct {p1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 262
    .line 263
    .line 264
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object p3

    .line 268
    :goto_4
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    if-eqz v3, :cond_9

    .line 273
    .line 274
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;

    .line 279
    .line 280
    invoke-static {}, Lcom/moloco/sdk/n1;->e()Lcom/moloco/sdk/l1;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    iget-object v5, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;

    .line 285
    .line 286
    sget-object v6, Lcom/moloco/sdk/internal/services/events/d;->a:[I

    .line 287
    .line 288
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    aget v5, v6, v5

    .line 293
    .line 294
    packed-switch v5, :pswitch_data_0

    .line 295
    .line 296
    .line 297
    new-instance p1, LE5/Q;

    .line 298
    .line 299
    const/16 p2, 0x9

    .line 300
    .line 301
    const/4 p3, 0x0

    .line 302
    invoke-direct {p1, p3, p2}, LE5/Q;-><init>(BI)V

    .line 303
    .line 304
    .line 305
    throw p1

    .line 306
    :pswitch_0
    sget-object v5, Lcom/moloco/sdk/m1;->j:Lcom/moloco/sdk/m1;

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :pswitch_1
    sget-object v5, Lcom/moloco/sdk/m1;->h:Lcom/moloco/sdk/m1;

    .line 310
    .line 311
    goto :goto_5

    .line 312
    :pswitch_2
    sget-object v5, Lcom/moloco/sdk/m1;->g:Lcom/moloco/sdk/m1;

    .line 313
    .line 314
    goto :goto_5

    .line 315
    :pswitch_3
    sget-object v5, Lcom/moloco/sdk/m1;->f:Lcom/moloco/sdk/m1;

    .line 316
    .line 317
    goto :goto_5

    .line 318
    :pswitch_4
    sget-object v5, Lcom/moloco/sdk/m1;->e:Lcom/moloco/sdk/m1;

    .line 319
    .line 320
    goto :goto_5

    .line 321
    :pswitch_5
    sget-object v5, Lcom/moloco/sdk/m1;->i:Lcom/moloco/sdk/m1;

    .line 322
    .line 323
    goto :goto_5

    .line 324
    :pswitch_6
    sget-object v5, Lcom/moloco/sdk/m1;->d:Lcom/moloco/sdk/m1;

    .line 325
    .line 326
    goto :goto_5

    .line 327
    :pswitch_7
    sget-object v5, Lcom/moloco/sdk/m1;->c:Lcom/moloco/sdk/m1;

    .line 328
    .line 329
    goto :goto_5

    .line 330
    :pswitch_8
    sget-object v5, Lcom/moloco/sdk/m1;->b:Lcom/moloco/sdk/m1;

    .line 331
    .line 332
    :goto_5
    invoke-virtual {v4, v5}, Lcom/moloco/sdk/l1;->c(Lcom/moloco/sdk/m1;)V

    .line 333
    .line 334
    .line 335
    iget-object v5, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 336
    .line 337
    invoke-static {v5}, LFe/e;->d(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;)Lcom/moloco/sdk/B1;

    .line 338
    .line 339
    .line 340
    move-result-object v5

    .line 341
    invoke-virtual {v4, v5}, Lcom/moloco/sdk/l1;->a(Lcom/moloco/sdk/B1;)V

    .line 342
    .line 343
    .line 344
    iget-object v3, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/h;

    .line 345
    .line 346
    invoke-static {v3}, LFe/e;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/h;)Lcom/moloco/sdk/D1;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    invoke-virtual {v4, v3}, Lcom/moloco/sdk/l1;->b(Lcom/moloco/sdk/D1;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v4}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    check-cast v3, Lcom/moloco/sdk/n1;

    .line 358
    .line 359
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    goto :goto_4

    .line 363
    :cond_9
    invoke-virtual {p2, p1}, Lcom/moloco/sdk/o1;->a(Ljava/util/ArrayList;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    check-cast p1, Lcom/moloco/sdk/p1;

    .line 371
    .line 372
    invoke-virtual {p4, p1}, Lcom/moloco/sdk/k1;->e(Lcom/moloco/sdk/p1;)V

    .line 373
    .line 374
    .line 375
    goto :goto_6

    .line 376
    :cond_a
    instance-of p1, p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/b;

    .line 377
    .line 378
    if-eqz p1, :cond_b

    .line 379
    .line 380
    invoke-static {}, Lcom/moloco/sdk/j1;->c()Lcom/moloco/sdk/i1;

    .line 381
    .line 382
    .line 383
    move-result-object p1

    .line 384
    check-cast p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/b;

    .line 385
    .line 386
    iget-wide p2, p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/b;->j:J

    .line 387
    .line 388
    invoke-virtual {p1, p2, p3}, Lcom/moloco/sdk/i1;->a(J)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    check-cast p1, Lcom/moloco/sdk/j1;

    .line 396
    .line 397
    invoke-virtual {p4, p1}, Lcom/moloco/sdk/k1;->d(Lcom/moloco/sdk/j1;)V

    .line 398
    .line 399
    .line 400
    goto :goto_6

    .line 401
    :cond_b
    instance-of p1, p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/a;

    .line 402
    .line 403
    if-eqz p1, :cond_f

    .line 404
    .line 405
    invoke-static {}, Lcom/moloco/sdk/h1;->b()Lcom/moloco/sdk/g1;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    check-cast p1, Lcom/moloco/sdk/h1;

    .line 414
    .line 415
    invoke-virtual {p4, p1}, Lcom/moloco/sdk/k1;->c(Lcom/moloco/sdk/h1;)V

    .line 416
    .line 417
    .line 418
    :goto_6
    iget-object p1, v0, Lcom/moloco/sdk/internal/services/events/c;->a:Lcom/moloco/sdk/internal/services/x;

    .line 419
    .line 420
    invoke-virtual {p1}, Lcom/moloco/sdk/internal/services/x;->a()Lcom/moloco/sdk/internal/services/w;

    .line 421
    .line 422
    .line 423
    move-result-object p1

    .line 424
    invoke-static {}, Lcom/moloco/sdk/f1;->d()Lcom/moloco/sdk/e1;

    .line 425
    .line 426
    .line 427
    move-result-object p2

    .line 428
    iget-object p3, p1, Lcom/moloco/sdk/internal/services/w;->a:Ljava/lang/String;

    .line 429
    .line 430
    invoke-virtual {p2, p3}, Lcom/moloco/sdk/e1;->a(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    iget-object p1, p1, Lcom/moloco/sdk/internal/services/w;->b:Ljava/lang/String;

    .line 434
    .line 435
    invoke-virtual {p2, p1}, Lcom/moloco/sdk/e1;->b(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    check-cast p1, Lcom/moloco/sdk/f1;

    .line 443
    .line 444
    invoke-virtual {p4, p1}, Lcom/moloco/sdk/k1;->b(Lcom/moloco/sdk/f1;)V

    .line 445
    .line 446
    .line 447
    iget-object p1, v0, Lcom/moloco/sdk/internal/services/events/c;->c:Lcom/moloco/sdk/internal/services/v;

    .line 448
    .line 449
    invoke-virtual {p1}, Lcom/moloco/sdk/internal/services/v;->a()Lcom/moloco/sdk/internal/services/F;

    .line 450
    .line 451
    .line 452
    move-result-object p1

    .line 453
    invoke-static {}, Lcom/moloco/sdk/s1;->f()Lcom/moloco/sdk/q1;

    .line 454
    .line 455
    .line 456
    move-result-object p2

    .line 457
    sget-object p3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 458
    .line 459
    invoke-virtual {p2}, Lcom/moloco/sdk/q1;->c()V

    .line 460
    .line 461
    .line 462
    iget-object p3, p1, Lcom/moloco/sdk/internal/services/F;->b:Ljava/lang/String;

    .line 463
    .line 464
    invoke-virtual {p2, p3}, Lcom/moloco/sdk/q1;->a(Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {p2}, Lcom/moloco/sdk/q1;->b()V

    .line 468
    .line 469
    .line 470
    iget p1, p1, Lcom/moloco/sdk/internal/services/F;->h:F

    .line 471
    .line 472
    invoke-virtual {p2, p1}, Lcom/moloco/sdk/q1;->d(F)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 476
    .line 477
    .line 478
    move-result-object p1

    .line 479
    check-cast p1, Lcom/moloco/sdk/s1;

    .line 480
    .line 481
    invoke-virtual {p4, p1}, Lcom/moloco/sdk/k1;->g(Lcom/moloco/sdk/s1;)V

    .line 482
    .line 483
    .line 484
    iget-object p1, v0, Lcom/moloco/sdk/internal/services/events/c;->b:Lcom/moloco/sdk/internal/services/c;

    .line 485
    .line 486
    invoke-virtual {p1}, Lcom/moloco/sdk/internal/services/c;->a()LBa/c;

    .line 487
    .line 488
    .line 489
    move-result-object p1

    .line 490
    invoke-static {}, Lcom/moloco/sdk/z1;->d()Lcom/moloco/sdk/x1;

    .line 491
    .line 492
    .line 493
    move-result-object p2

    .line 494
    instance-of p3, p1, Lcom/moloco/sdk/internal/services/a;

    .line 495
    .line 496
    if-eqz p3, :cond_c

    .line 497
    .line 498
    sget-object p3, Lcom/moloco/sdk/y1;->d:Lcom/moloco/sdk/y1;

    .line 499
    .line 500
    invoke-virtual {p2, p3}, Lcom/moloco/sdk/x1;->b(Lcom/moloco/sdk/y1;)V

    .line 501
    .line 502
    .line 503
    check-cast p1, Lcom/moloco/sdk/internal/services/a;

    .line 504
    .line 505
    iget-object p1, p1, Lcom/moloco/sdk/internal/services/a;->j:Ljava/lang/String;

    .line 506
    .line 507
    invoke-virtual {p2, p1}, Lcom/moloco/sdk/x1;->a(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    goto :goto_7

    .line 511
    :cond_c
    sget-object p3, Lcom/moloco/sdk/internal/services/b;->j:Lcom/moloco/sdk/internal/services/b;

    .line 512
    .line 513
    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result p3

    .line 517
    if-eqz p3, :cond_d

    .line 518
    .line 519
    sget-object p1, Lcom/moloco/sdk/y1;->b:Lcom/moloco/sdk/y1;

    .line 520
    .line 521
    invoke-virtual {p2, p1}, Lcom/moloco/sdk/x1;->b(Lcom/moloco/sdk/y1;)V

    .line 522
    .line 523
    .line 524
    goto :goto_7

    .line 525
    :cond_d
    sget-object p3, Lcom/moloco/sdk/internal/services/b;->k:Lcom/moloco/sdk/internal/services/b;

    .line 526
    .line 527
    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result p1

    .line 531
    if-eqz p1, :cond_e

    .line 532
    .line 533
    sget-object p1, Lcom/moloco/sdk/y1;->c:Lcom/moloco/sdk/y1;

    .line 534
    .line 535
    invoke-virtual {p2, p1}, Lcom/moloco/sdk/x1;->b(Lcom/moloco/sdk/y1;)V

    .line 536
    .line 537
    .line 538
    :goto_7
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 539
    .line 540
    .line 541
    move-result-object p1

    .line 542
    check-cast p1, Lcom/moloco/sdk/z1;

    .line 543
    .line 544
    invoke-virtual {p4, p1}, Lcom/moloco/sdk/k1;->k(Lcom/moloco/sdk/z1;)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 548
    .line 549
    .line 550
    move-result-object p1

    .line 551
    check-cast p1, Lcom/moloco/sdk/E1;

    .line 552
    .line 553
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 554
    .line 555
    new-instance p2, Ljava/lang/StringBuilder;

    .line 556
    .line 557
    const-string p3, "Encoding protobuf UserAdInteractionExt: "

    .line 558
    .line 559
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v4

    .line 569
    const-string v3, "CustomUserEventBuilderServiceImpl"

    .line 570
    .line 571
    const/4 v5, 0x0

    .line 572
    const/4 v6, 0x4

    .line 573
    const/4 v7, 0x0

    .line 574
    invoke-static/range {v2 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 575
    .line 576
    .line 577
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 578
    .line 579
    .line 580
    iget-object p2, v0, Lcom/moloco/sdk/internal/services/events/c;->g:Lcom/moloco/sdk/internal/services/proto/a;

    .line 581
    .line 582
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    invoke-virtual {p1}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 586
    .line 587
    .line 588
    move-result-object p1

    .line 589
    invoke-static {p1, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object p1

    .line 593
    const-string p2, "encodeToString(...)"

    .line 594
    .line 595
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    const-string p2, "Successfully built userAdInteractionExt as base64 string: "

    .line 599
    .line 600
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v4

    .line 604
    const-string v3, "CustomUserEventBuilderServiceImpl"

    .line 605
    .line 606
    const/4 v5, 0x0

    .line 607
    const/4 v6, 0x4

    .line 608
    const/4 v7, 0x0

    .line 609
    invoke-static/range {v2 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    return-object p1

    .line 613
    :cond_e
    new-instance p1, LE5/Q;

    .line 614
    .line 615
    const/16 p2, 0x9

    .line 616
    .line 617
    const/4 p3, 0x0

    .line 618
    invoke-direct {p1, p3, p2}, LE5/Q;-><init>(BI)V

    .line 619
    .line 620
    .line 621
    throw p1

    .line 622
    :cond_f
    new-instance p1, LE5/Q;

    .line 623
    .line 624
    const/16 p2, 0x9

    .line 625
    .line 626
    const/4 p3, 0x0

    .line 627
    invoke-direct {p1, p3, p2}, LE5/Q;-><init>(BI)V

    .line 628
    .line 629
    .line 630
    throw p1

    .line 631
    :cond_10
    new-instance p1, LE5/Q;

    .line 632
    .line 633
    const/16 p2, 0x9

    .line 634
    .line 635
    const/4 p3, 0x0

    .line 636
    invoke-direct {p1, p3, p2}, LE5/Q;-><init>(BI)V

    .line 637
    .line 638
    .line 639
    throw p1

    .line 640
    nop

    .line 641
    :pswitch_data_0
    .packed-switch 0x1
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
.end method
