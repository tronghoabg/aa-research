.class public final synthetic Ln2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Ln2/d;->a:I

    iput-object p1, p0, Ln2/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, -0x1

    .line 4
    const/4 v3, 0x1

    .line 5
    iget-object v4, p0, Ln2/d;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v4, Ln2/o;

    .line 8
    .line 9
    check-cast p1, LN1/n;

    .line 10
    .line 11
    iget-object v5, v4, Ln2/o;->c:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v5

    .line 14
    :try_start_0
    iget-object v6, v4, Ln2/o;->g:Ln2/i;

    .line 15
    .line 16
    iget-boolean v6, v6, Ln2/i;->v:Z

    .line 17
    .line 18
    if-eqz v6, :cond_6

    .line 19
    .line 20
    iget-boolean v6, v4, Ln2/o;->f:Z

    .line 21
    .line 22
    if-nez v6, :cond_6

    .line 23
    .line 24
    iget v6, p1, LN1/n;->C:I

    .line 25
    .line 26
    if-eq v6, v2, :cond_6

    .line 27
    .line 28
    if-le v6, v1, :cond_6

    .line 29
    .line 30
    iget-object v6, p1, LN1/n;->n:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    if-nez v6, :cond_0

    .line 33
    .line 34
    :goto_0
    move v1, v0

    .line 35
    goto :goto_3

    .line 36
    :cond_0
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    sparse-switch v7, :sswitch_data_0

    .line 41
    .line 42
    .line 43
    :goto_1
    move v1, v2

    .line 44
    goto :goto_2

    .line 45
    :sswitch_0
    const-string v1, "audio/eac3"

    .line 46
    .line 47
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const/4 v1, 0x3

    .line 55
    goto :goto_2

    .line 56
    :sswitch_1
    const-string v7, "audio/ac4"

    .line 57
    .line 58
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-nez v6, :cond_4

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :sswitch_2
    const-string v1, "audio/ac3"

    .line 66
    .line 67
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    move v1, v3

    .line 75
    goto :goto_2

    .line 76
    :sswitch_3
    const-string v1, "audio/eac3-joc"

    .line 77
    .line 78
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_3

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    move v1, v0

    .line 86
    :cond_4
    :goto_2
    packed-switch v1, :pswitch_data_0

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :pswitch_0
    move v1, v3

    .line 91
    :goto_3
    const/16 v2, 0x20

    .line 92
    .line 93
    if-eqz v1, :cond_5

    .line 94
    .line 95
    :try_start_1
    sget v1, LQ1/x;->a:I

    .line 96
    .line 97
    if-lt v1, v2, :cond_6

    .line 98
    .line 99
    iget-object v1, v4, Ln2/o;->h:LA7/b0;

    .line 100
    .line 101
    if-eqz v1, :cond_6

    .line 102
    .line 103
    iget-boolean v1, v1, LA7/b0;->b:Z

    .line 104
    .line 105
    if-eqz v1, :cond_6

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :catchall_0
    move-exception p1

    .line 109
    goto :goto_5

    .line 110
    :cond_5
    :goto_4
    sget v1, LQ1/x;->a:I

    .line 111
    .line 112
    if-lt v1, v2, :cond_7

    .line 113
    .line 114
    iget-object v1, v4, Ln2/o;->h:LA7/b0;

    .line 115
    .line 116
    if-eqz v1, :cond_7

    .line 117
    .line 118
    iget-boolean v2, v1, LA7/b0;->b:Z

    .line 119
    .line 120
    if-eqz v2, :cond_7

    .line 121
    .line 122
    iget-object v1, v1, LA7/b0;->c:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v1, Landroid/media/Spatializer;

    .line 125
    .line 126
    invoke-static {v1}, LG5/f;->k(Landroid/media/Spatializer;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_7

    .line 131
    .line 132
    iget-object v1, v4, Ln2/o;->h:LA7/b0;

    .line 133
    .line 134
    iget-object v1, v1, LA7/b0;->c:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v1, Landroid/media/Spatializer;

    .line 137
    .line 138
    invoke-static {v1}, LG5/f;->q(Landroid/media/Spatializer;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_7

    .line 143
    .line 144
    iget-object v1, v4, Ln2/o;->h:LA7/b0;

    .line 145
    .line 146
    iget-object v2, v4, Ln2/o;->i:LN1/c;

    .line 147
    .line 148
    invoke-virtual {v1, v2, p1}, LA7/b0;->k(LN1/c;LN1/n;)Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_7

    .line 153
    .line 154
    :cond_6
    move v0, v3

    .line 155
    :cond_7
    monitor-exit v5

    .line 156
    return v0

    .line 157
    :goto_5
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 158
    throw p1

    .line 159
    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_3
        0xb269698 -> :sswitch_2
        0xb269699 -> :sswitch_1
        0x59ae0c65 -> :sswitch_0
    .end sparse-switch

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    iget v3, p0, Ln2/d;->a:I

    .line 5
    .line 6
    packed-switch v3, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v3, p0, Ln2/d;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Lr6/l;

    .line 12
    .line 13
    check-cast p1, LE5/T;

    .line 14
    .line 15
    iget-object v4, v3, Lr6/l;->c:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v4

    .line 18
    :try_start_0
    iget-object v5, v3, Lr6/l;->g:Lr6/f;

    .line 19
    .line 20
    iget-boolean v5, v5, Lr6/f;->J:Z

    .line 21
    .line 22
    if-eqz v5, :cond_6

    .line 23
    .line 24
    iget-boolean v5, v3, Lr6/l;->f:Z

    .line 25
    .line 26
    if-nez v5, :cond_6

    .line 27
    .line 28
    iget v5, p1, LE5/T;->y:I

    .line 29
    .line 30
    if-le v5, v1, :cond_6

    .line 31
    .line 32
    iget-object v5, p1, LE5/T;->l:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    if-nez v5, :cond_0

    .line 35
    .line 36
    :goto_0
    move v1, v0

    .line 37
    goto :goto_3

    .line 38
    :cond_0
    const/4 v6, -0x1

    .line 39
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    sparse-switch v7, :sswitch_data_0

    .line 44
    .line 45
    .line 46
    :goto_1
    move v1, v6

    .line 47
    goto :goto_2

    .line 48
    :sswitch_0
    const-string v1, "audio/eac3"

    .line 49
    .line 50
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const/4 v1, 0x3

    .line 58
    goto :goto_2

    .line 59
    :sswitch_1
    const-string v7, "audio/ac4"

    .line 60
    .line 61
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-nez v5, :cond_4

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :sswitch_2
    const-string v1, "audio/ac3"

    .line 69
    .line 70
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    move v1, v2

    .line 78
    goto :goto_2

    .line 79
    :sswitch_3
    const-string v1, "audio/eac3-joc"

    .line 80
    .line 81
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    move v1, v0

    .line 89
    :cond_4
    :goto_2
    packed-switch v1, :pswitch_data_1

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :pswitch_0
    move v1, v2

    .line 94
    :goto_3
    const/16 v5, 0x20

    .line 95
    .line 96
    if-eqz v1, :cond_5

    .line 97
    .line 98
    :try_start_1
    sget v1, Lu6/v;->a:I

    .line 99
    .line 100
    if-lt v1, v5, :cond_6

    .line 101
    .line 102
    iget-object v1, v3, Lr6/l;->h:LA7/b0;

    .line 103
    .line 104
    if-eqz v1, :cond_6

    .line 105
    .line 106
    iget-boolean v1, v1, LA7/b0;->b:Z

    .line 107
    .line 108
    if-eqz v1, :cond_6

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :catchall_0
    move-exception p1

    .line 112
    goto :goto_5

    .line 113
    :cond_5
    :goto_4
    sget v1, Lu6/v;->a:I

    .line 114
    .line 115
    if-lt v1, v5, :cond_7

    .line 116
    .line 117
    iget-object v1, v3, Lr6/l;->h:LA7/b0;

    .line 118
    .line 119
    if-eqz v1, :cond_7

    .line 120
    .line 121
    iget-boolean v5, v1, LA7/b0;->b:Z

    .line 122
    .line 123
    if-eqz v5, :cond_7

    .line 124
    .line 125
    iget-object v1, v1, LA7/b0;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v1, Landroid/media/Spatializer;

    .line 128
    .line 129
    invoke-static {v1}, LG5/f;->k(Landroid/media/Spatializer;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_7

    .line 134
    .line 135
    iget-object v1, v3, Lr6/l;->h:LA7/b0;

    .line 136
    .line 137
    iget-object v1, v1, LA7/b0;->c:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v1, Landroid/media/Spatializer;

    .line 140
    .line 141
    invoke-static {v1}, LG5/f;->q(Landroid/media/Spatializer;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_7

    .line 146
    .line 147
    iget-object v1, v3, Lr6/l;->h:LA7/b0;

    .line 148
    .line 149
    iget-object v3, v3, Lr6/l;->i:LG5/h;

    .line 150
    .line 151
    invoke-virtual {v1, p1, v3}, LA7/b0;->j(LE5/T;LG5/h;)Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_7

    .line 156
    .line 157
    :cond_6
    move v0, v2

    .line 158
    :cond_7
    monitor-exit v4

    .line 159
    return v0

    .line 160
    :goto_5
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 161
    throw p1

    .line 162
    :pswitch_1
    invoke-direct {p0, p1}, Ln2/d;->a(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    return p1

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_3
        0xb269698 -> :sswitch_2
        0xb269699 -> :sswitch_1
        0x59ae0c65 -> :sswitch_0
    .end sparse-switch

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
