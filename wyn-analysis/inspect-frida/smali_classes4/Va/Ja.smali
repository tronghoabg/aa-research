.class public final LVa/Ja;
.super LVa/Ba;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public synthetic d:LVa/Ia;

.field public synthetic e:LVa/lb;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/Ja;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LVa/Ja;->c:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, LVa/Ja;->d:LVa/Ia;

    .line 9
    .line 10
    iget-object v2, v1, LVa/Ja;->e:LVa/lb;

    .line 11
    .line 12
    invoke-interface {v0, v2}, LVa/Ia;->c(LVa/lb;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, v1, LVa/Ja;->e:LVa/lb;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v2, v0, LVa/lb;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, LVa/Aa;

    .line 23
    .line 24
    iget v2, v2, LVa/Aa;->a:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v2, -0x1

    .line 28
    :goto_0
    iget-object v3, v1, LVa/Ja;->d:LVa/Ia;

    .line 29
    .line 30
    new-instance v4, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v5, "\u1645\u0cac\ub1b7\uc076\u6e75\uc076\ub5bb\ud241\u5633\u527b\uc683\u371c\u7917\u6c02\u5579\u2394\u089b\udbf1\ub1da\u3c2b\ubff4\uad06\ua6d1\uc8da\u2b9e\uf4f2\u70dc\udb69\u16ff\u6f8b\u9b10\uecd3\u6003\u6b1f\ud1ab\ued51\u24f4\ud198\uc683\u371c\u3432\u1d8e\ub1b7\uc076\u27bf\ub34b\u9d31\ue925\u7e4d\ud88b\u6e90\ua811\ub1da\u3c2b\ubff4\uad06\ud48a\u159d\uc075\u4ba1\u9db8\ua5ac\ud85d\u2bab\u55b9\ud996\u140f\uf29d\ub4d8\ue132"

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-static {v6, v6}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    add-int/lit8 v7, v7, 0x45

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/String;->toCharArray()[C

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, [C

    .line 49
    .line 50
    sget-object v8, LVa/Ab;->F:Ljava/lang/Object;

    .line 51
    .line 52
    monitor-enter v8

    .line 53
    :try_start_0
    array-length v9, v5

    .line 54
    new-array v9, v9, [C

    .line 55
    .line 56
    sput v6, LVa/Ab;->E:I

    .line 57
    .line 58
    const/4 v10, 0x2

    .line 59
    new-array v10, v10, [C

    .line 60
    .line 61
    :goto_1
    sget v11, LVa/Ab;->E:I

    .line 62
    .line 63
    array-length v12, v5

    .line 64
    if-ge v11, v12, :cond_2

    .line 65
    .line 66
    aget-char v12, v5, v11

    .line 67
    .line 68
    aput-char v12, v10, v6

    .line 69
    .line 70
    add-int/lit8 v11, v11, 0x1

    .line 71
    .line 72
    aget-char v11, v5, v11

    .line 73
    .line 74
    const/4 v12, 0x1

    .line 75
    aput-char v11, v10, v12

    .line 76
    .line 77
    const v11, 0xe370

    .line 78
    .line 79
    .line 80
    move v13, v6

    .line 81
    :goto_2
    const/16 v14, 0x10

    .line 82
    .line 83
    if-ge v13, v14, :cond_1

    .line 84
    .line 85
    aget-char v14, v10, v12

    .line 86
    .line 87
    aget-char v15, v10, v6

    .line 88
    .line 89
    add-int v16, v15, v11

    .line 90
    .line 91
    move/from16 v17, v12

    .line 92
    .line 93
    shl-int/lit8 v12, v15, 0x4

    .line 94
    .line 95
    add-int/lit16 v12, v12, 0x283

    .line 96
    .line 97
    xor-int v12, v16, v12

    .line 98
    .line 99
    move/from16 v16, v6

    .line 100
    .line 101
    ushr-int/lit8 v6, v15, 0x5

    .line 102
    .line 103
    add-int/lit16 v6, v6, 0x42eb

    .line 104
    .line 105
    xor-int/2addr v6, v12

    .line 106
    sub-int/2addr v14, v6

    .line 107
    int-to-char v6, v14

    .line 108
    aput-char v6, v10, v17

    .line 109
    .line 110
    add-int v12, v6, v11

    .line 111
    .line 112
    shl-int/lit8 v14, v6, 0x4

    .line 113
    .line 114
    add-int/lit16 v14, v14, 0xb88

    .line 115
    .line 116
    xor-int/2addr v12, v14

    .line 117
    ushr-int/lit8 v6, v6, 0x5

    .line 118
    .line 119
    add-int/lit16 v6, v6, 0x1117

    .line 120
    .line 121
    xor-int/2addr v6, v12

    .line 122
    sub-int/2addr v15, v6

    .line 123
    int-to-char v6, v15

    .line 124
    aput-char v6, v10, v16

    .line 125
    .line 126
    const v6, 0x9e37

    .line 127
    .line 128
    .line 129
    sub-int/2addr v11, v6

    .line 130
    add-int/lit8 v13, v13, 0x1

    .line 131
    .line 132
    move/from16 v6, v16

    .line 133
    .line 134
    move/from16 v12, v17

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :catchall_0
    move-exception v0

    .line 138
    goto :goto_3

    .line 139
    :cond_1
    move/from16 v16, v6

    .line 140
    .line 141
    move/from16 v17, v12

    .line 142
    .line 143
    sget v6, LVa/Ab;->E:I

    .line 144
    .line 145
    aget-char v11, v10, v16

    .line 146
    .line 147
    aput-char v11, v9, v6

    .line 148
    .line 149
    add-int/lit8 v11, v6, 0x1

    .line 150
    .line 151
    aget-char v12, v10, v17

    .line 152
    .line 153
    aput-char v12, v9, v11

    .line 154
    .line 155
    add-int/lit8 v6, v6, 0x2

    .line 156
    .line 157
    sput v6, LVa/Ab;->E:I

    .line 158
    .line 159
    move/from16 v6, v16

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_2
    move/from16 v16, v6

    .line 163
    .line 164
    new-instance v5, Ljava/lang/String;

    .line 165
    .line 166
    invoke-direct {v5, v9, v6, v7}, Ljava/lang/String;-><init>([CII)V

    .line 167
    .line 168
    .line 169
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 170
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-interface {v3, v0, v2}, LVa/Ia;->b(LVa/lb;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :goto_3
    monitor-exit v8

    .line 189
    throw v0

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
