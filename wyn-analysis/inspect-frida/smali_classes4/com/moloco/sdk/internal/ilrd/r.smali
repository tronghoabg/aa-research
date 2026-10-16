.class public final Lcom/moloco/sdk/internal/ilrd/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/moloco/sdk/internal/services/k;

.field public final b:Lcom/moloco/sdk/internal/ilrd/q;

.field public final c:Lef/p;

.field public final d:J

.field public final e:Ljava/util/concurrent/atomic/AtomicReference;

.field public f:Z


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/k;Ljava/lang/String;)V
    .locals 9

    .line 1
    const-string v0, "timeProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/r;->a:Lcom/moloco/sdk/internal/services/k;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    :try_start_0
    sget-object v0, LXf/c;->d:LXf/b;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object v1, Lcom/moloco/sdk/internal/ilrd/q;->Companion:Lcom/moloco/sdk/internal/ilrd/a$c$b;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/moloco/sdk/internal/ilrd/a$c$b;->serializer()Lkotlinx/serialization/KSerializer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, p2, v1}, LXf/c;->a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, Lcom/moloco/sdk/internal/ilrd/q;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    move-object p1, p2

    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception v0

    .line 34
    move-object p2, v0

    .line 35
    move-object v3, p2

    .line 36
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 37
    .line 38
    const-string v2, "Error deserializing session data"

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    const-string v1, "IlrdActiveSession"

    .line 42
    .line 43
    const/16 v5, 0x8

    .line 44
    .line 45
    const/4 v6, 0x0

    .line 46
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    :goto_0
    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/r;->b:Lcom/moloco/sdk/internal/ilrd/q;

    .line 50
    .line 51
    new-instance p2, LAf/q;

    .line 52
    .line 53
    const/16 v0, 0x8

    .line 54
    .line 55
    invoke-direct {p2, p0, v0}, LAf/q;-><init>(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    invoke-static {p2}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    iput-object p2, p0, Lcom/moloco/sdk/internal/ilrd/r;->c:Lef/p;

    .line 63
    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    iget-wide v0, p1, Lcom/moloco/sdk/internal/ilrd/q;->d:J

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    iget-object p2, p0, Lcom/moloco/sdk/internal/ilrd/r;->a:Lcom/moloco/sdk/internal/services/k;

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    :goto_1
    iput-wide v0, p0, Lcom/moloco/sdk/internal/ilrd/r;->d:J

    .line 79
    .line 80
    new-instance p2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 81
    .line 82
    if-eqz p1, :cond_2

    .line 83
    .line 84
    iget-object v0, p1, Lcom/moloco/sdk/internal/ilrd/q;->b:Lcom/moloco/sdk/internal/ilrd/o;

    .line 85
    .line 86
    if-nez v0, :cond_3

    .line 87
    .line 88
    :cond_2
    new-instance v1, Lcom/moloco/sdk/internal/ilrd/o;

    .line 89
    .line 90
    const/4 v5, 0x0

    .line 91
    const/4 v6, 0x0

    .line 92
    const-wide/16 v2, -0x1

    .line 93
    .line 94
    const/4 v4, 0x0

    .line 95
    const/4 v7, 0x0

    .line 96
    const/4 v8, 0x0

    .line 97
    invoke-direct/range {v1 .. v8}, Lcom/moloco/sdk/internal/ilrd/o;-><init>(JIIIII)V

    .line 98
    .line 99
    .line 100
    move-object v0, v1

    .line 101
    :cond_3
    invoke-direct {p2, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iput-object p2, p0, Lcom/moloco/sdk/internal/ilrd/r;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 105
    .line 106
    if-eqz p1, :cond_4

    .line 107
    .line 108
    iget-boolean p1, p1, Lcom/moloco/sdk/internal/ilrd/q;->c:Z

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    const/4 p1, 0x0

    .line 112
    :goto_2
    iput-boolean p1, p0, Lcom/moloco/sdk/internal/ilrd/r;->f:Z

    .line 113
    .line 114
    return-void
.end method


# virtual methods
.method public final a(Lcom/moloco/sdk/internal/ilrd/t;)V
    .locals 10

    .line 1
    const-string v0, "ilrdData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/moloco/sdk/internal/ilrd/t;

    .line 7
    .line 8
    if-eqz v0, :cond_5

    .line 9
    .line 10
    iget-object p1, p1, Lcom/moloco/sdk/internal/ilrd/t;->a:Lcom/moloco/sdk/l0;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/moloco/sdk/l0;->j()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "getAdFormat(...)"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "toUpperCase(...)"

    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/moloco/sdk/internal/ilrd/r;->a:Lcom/moloco/sdk/internal/services/k;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    iget-object v0, p0, Lcom/moloco/sdk/internal/ilrd/r;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lcom/moloco/sdk/internal/ilrd/o;

    .line 48
    .line 49
    const-string v4, "BANNER"

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-static {p1, v4, v5}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_0

    .line 57
    .line 58
    iget p1, v1, Lcom/moloco/sdk/internal/ilrd/o;->b:I

    .line 59
    .line 60
    add-int/lit8 v4, p1, 0x1

    .line 61
    .line 62
    const/4 v6, 0x0

    .line 63
    const/16 v9, 0x3c

    .line 64
    .line 65
    const/4 v5, 0x0

    .line 66
    const/4 v7, 0x0

    .line 67
    const/4 v8, 0x0

    .line 68
    invoke-static/range {v1 .. v9}, Lcom/moloco/sdk/internal/ilrd/o;->a(Lcom/moloco/sdk/internal/ilrd/o;JIIIIII)Lcom/moloco/sdk/internal/ilrd/o;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    const-string v4, "MREC"

    .line 74
    .line 75
    invoke-static {p1, v4, v5}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_1

    .line 80
    .line 81
    iget p1, v1, Lcom/moloco/sdk/internal/ilrd/o;->c:I

    .line 82
    .line 83
    add-int/lit8 v5, p1, 0x1

    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    const/16 v9, 0x3a

    .line 87
    .line 88
    const/4 v4, 0x0

    .line 89
    const/4 v7, 0x0

    .line 90
    const/4 v8, 0x0

    .line 91
    invoke-static/range {v1 .. v9}, Lcom/moloco/sdk/internal/ilrd/o;->a(Lcom/moloco/sdk/internal/ilrd/o;JIIIIII)Lcom/moloco/sdk/internal/ilrd/o;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    goto :goto_0

    .line 96
    :cond_1
    const-string v4, "NATIVE"

    .line 97
    .line 98
    invoke-static {p1, v4, v5}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_2

    .line 103
    .line 104
    iget p1, v1, Lcom/moloco/sdk/internal/ilrd/o;->d:I

    .line 105
    .line 106
    add-int/lit8 v6, p1, 0x1

    .line 107
    .line 108
    const/4 v5, 0x0

    .line 109
    const/16 v9, 0x36

    .line 110
    .line 111
    const/4 v4, 0x0

    .line 112
    const/4 v7, 0x0

    .line 113
    const/4 v8, 0x0

    .line 114
    invoke-static/range {v1 .. v9}, Lcom/moloco/sdk/internal/ilrd/o;->a(Lcom/moloco/sdk/internal/ilrd/o;JIIIIII)Lcom/moloco/sdk/internal/ilrd/o;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    goto :goto_0

    .line 119
    :cond_2
    const-string v4, "INTER"

    .line 120
    .line 121
    invoke-static {p1, v4, v5}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_3

    .line 126
    .line 127
    iget p1, v1, Lcom/moloco/sdk/internal/ilrd/o;->e:I

    .line 128
    .line 129
    add-int/lit8 v7, p1, 0x1

    .line 130
    .line 131
    const/4 v5, 0x0

    .line 132
    const/16 v9, 0x2e

    .line 133
    .line 134
    const/4 v4, 0x0

    .line 135
    const/4 v6, 0x0

    .line 136
    const/4 v8, 0x0

    .line 137
    invoke-static/range {v1 .. v9}, Lcom/moloco/sdk/internal/ilrd/o;->a(Lcom/moloco/sdk/internal/ilrd/o;JIIIIII)Lcom/moloco/sdk/internal/ilrd/o;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    goto :goto_0

    .line 142
    :cond_3
    const-string v4, "REWARD"

    .line 143
    .line 144
    invoke-static {p1, v4, v5}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-eqz v4, :cond_4

    .line 149
    .line 150
    iget p1, v1, Lcom/moloco/sdk/internal/ilrd/o;->f:I

    .line 151
    .line 152
    add-int/lit8 v8, p1, 0x1

    .line 153
    .line 154
    const/4 v5, 0x0

    .line 155
    const/16 v9, 0x1e

    .line 156
    .line 157
    const/4 v4, 0x0

    .line 158
    const/4 v6, 0x0

    .line 159
    const/4 v7, 0x0

    .line 160
    invoke-static/range {v1 .. v9}, Lcom/moloco/sdk/internal/ilrd/o;->a(Lcom/moloco/sdk/internal/ilrd/o;JIIIIII)Lcom/moloco/sdk/internal/ilrd/o;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_4
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 169
    .line 170
    const-string v0, "Unknown ad format for Applovin: "

    .line 171
    .line 172
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    const/16 v6, 0xc

    .line 177
    .line 178
    const/4 v7, 0x0

    .line 179
    const-string v2, "IlrdActiveSession"

    .line 180
    .line 181
    const/4 v4, 0x0

    .line 182
    const/4 v5, 0x0

    .line 183
    invoke-static/range {v1 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_5
    new-instance p1, LE5/Q;

    .line 188
    .line 189
    const/16 v0, 0x9

    .line 190
    .line 191
    const/4 v1, 0x0

    .line 192
    invoke-direct {p1, v1, v0}, LE5/Q;-><init>(BI)V

    .line 193
    .line 194
    .line 195
    throw p1
.end method

.method public final b()Lcom/moloco/sdk/internal/ilrd/o;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/ilrd/r;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "get(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/moloco/sdk/internal/ilrd/o;

    .line 13
    .line 14
    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/ilrd/r;->c:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/moloco/sdk/internal/ilrd/r;->b()Lcom/moloco/sdk/internal/ilrd/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, v0, Lcom/moloco/sdk/internal/ilrd/o;->b:I

    .line 6
    .line 7
    iget v2, v0, Lcom/moloco/sdk/internal/ilrd/o;->c:I

    .line 8
    .line 9
    add-int v3, v1, v2

    .line 10
    .line 11
    iget v4, v0, Lcom/moloco/sdk/internal/ilrd/o;->d:I

    .line 12
    .line 13
    add-int/2addr v3, v4

    .line 14
    iget v5, v0, Lcom/moloco/sdk/internal/ilrd/o;->e:I

    .line 15
    .line 16
    add-int/2addr v3, v5

    .line 17
    iget v0, v0, Lcom/moloco/sdk/internal/ilrd/o;->f:I

    .line 18
    .line 19
    add-int/2addr v3, v0

    .line 20
    new-instance v6, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v7, "IlrdActiveSession(id="

    .line 23
    .line 24
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/moloco/sdk/internal/ilrd/r;->c()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v7, ", startTs="

    .line 35
    .line 36
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-wide v7, p0, Lcom/moloco/sdk/internal/ilrd/r;->d:J

    .line 40
    .line 41
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v7, ", expired="

    .line 45
    .line 46
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-boolean v7, p0, Lcom/moloco/sdk/internal/ilrd/r;->f:Z

    .line 50
    .line 51
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v7, ", impressions="

    .line 55
    .line 56
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v3, " [banner="

    .line 63
    .line 64
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v3, ", mrec="

    .line 68
    .line 69
    const-string v7, ", native="

    .line 70
    .line 71
    invoke-static {v1, v2, v3, v7, v6}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 72
    .line 73
    .line 74
    const-string v1, ", interstitial="

    .line 75
    .line 76
    const-string v2, ", rewarded="

    .line 77
    .line 78
    invoke-static {v4, v5, v1, v2, v6}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 79
    .line 80
    .line 81
    const-string v1, "])"

    .line 82
    .line 83
    invoke-static {v0, v1, v6}, LA7/p0;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    return-object v0
.end method
