.class public final LA7/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:J

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLio/flutter/embedding/engine/FlutterJNI;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LA7/A;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, LA7/A;->b:J

    .line 4
    iput-object p3, p0, LA7/A;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    .line 1
    iput p4, p0, LA7/A;->a:I

    iput-wide p2, p0, LA7/A;->b:J

    iput-object p1, p0, LA7/A;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-wide v2, p0, LA7/A;->b:J

    .line 4
    .line 5
    iget-object v4, p0, LA7/A;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget v5, p0, LA7/A;->a:I

    .line 8
    .line 9
    packed-switch v5, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v5, LN/J0;

    .line 13
    .line 14
    const/4 v6, 0x2

    .line 15
    invoke-direct {v5, v1, v6}, LN/J0;-><init>(BI)V

    .line 16
    .line 17
    .line 18
    check-cast v4, Lod/q;

    .line 19
    .line 20
    iget-object v6, v4, Lod/q;->j:Lod/r;

    .line 21
    .line 22
    invoke-interface {v6, v5}, Lod/r;->i(LN/J0;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v6

    .line 29
    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 30
    .line 31
    const-wide/16 v9, 0x1

    .line 32
    .line 33
    invoke-virtual {v8, v9, v10}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v11

    .line 37
    div-long/2addr v6, v11

    .line 38
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v11

    .line 42
    invoke-virtual {v8, v9, v10}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v8

    .line 46
    rem-long/2addr v11, v8

    .line 47
    new-instance v8, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v9, "deadline exceeded after "

    .line 50
    .line 51
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-wide/16 v9, 0x0

    .line 55
    .line 56
    cmp-long v2, v2, v9

    .line 57
    .line 58
    if-gez v2, :cond_0

    .line 59
    .line 60
    const/16 v2, 0x2d

    .line 61
    .line 62
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    :cond_0
    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 69
    .line 70
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    new-array v6, v0, [Ljava/lang/Object;

    .line 75
    .line 76
    aput-object v3, v6, v1

    .line 77
    .line 78
    const-string v3, ".%09d"

    .line 79
    .line 80
    invoke-static {v2, v3, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v3, "s. "

    .line 88
    .line 89
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    iget-object v3, v4, Lod/q;->i:Lmd/c;

    .line 93
    .line 94
    sget-object v6, Lmd/i;->a:LB8/e;

    .line 95
    .line 96
    invoke-virtual {v3, v6}, Lmd/c;->a(LB8/e;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Ljava/lang/Long;

    .line 101
    .line 102
    if-nez v3, :cond_1

    .line 103
    .line 104
    const-wide/16 v6, 0x0

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 108
    .line 109
    .line 110
    move-result-wide v6

    .line 111
    long-to-double v6, v6

    .line 112
    sget-wide v9, Lod/q;->r:D

    .line 113
    .line 114
    div-double/2addr v6, v9

    .line 115
    :goto_0
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    new-array v0, v0, [Ljava/lang/Object;

    .line 120
    .line 121
    aput-object v3, v0, v1

    .line 122
    .line 123
    const-string v1, "Name resolution delay %.9f seconds. "

    .line 124
    .line 125
    invoke-static {v2, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    iget-object v0, v4, Lod/q;->j:Lod/r;

    .line 136
    .line 137
    sget-object v1, Lmd/k0;->h:Lmd/k0;

    .line 138
    .line 139
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v1, v2}, Lmd/k0;->b(Ljava/lang/String;)Lmd/k0;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-interface {v0, v1}, Lod/r;->g(Lmd/k0;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_0
    check-cast v4, Lio/flutter/embedding/engine/FlutterJNI;

    .line 152
    .line 153
    invoke-virtual {v4}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-nez v0, :cond_2

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_2
    invoke-virtual {v4, v2, v3}, Lio/flutter/embedding/engine/FlutterJNI;->unregisterTexture(J)V

    .line 161
    .line 162
    .line 163
    :goto_1
    return-void

    .line 164
    :pswitch_1
    check-cast v4, LA7/i1;

    .line 165
    .line 166
    iget-object v0, v4, LA7/B0;->a:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, LA7/n0;

    .line 169
    .line 170
    invoke-virtual {v0}, LA7/n0;->h()LA7/r;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0, v2, v3}, LA7/r;->h0(J)V

    .line 175
    .line 176
    .line 177
    const/4 v0, 0x0

    .line 178
    iput-object v0, v4, LA7/i1;->e:LA7/j1;

    .line 179
    .line 180
    return-void

    .line 181
    :pswitch_2
    check-cast v4, LA7/r;

    .line 182
    .line 183
    invoke-virtual {v4, v2, v3}, LA7/r;->l0(J)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
