.class public final synthetic Lyc/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lq/s1;


# direct methods
.method public synthetic constructor <init>(Lq/s1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyc/n;->a:I

    iput-object p1, p0, Lyc/n;->b:Lq/s1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;Lba/a;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lyc/u;

    .line 14
    .line 15
    new-instance v1, LPc/p;

    .line 16
    .line 17
    const/16 v2, 0x17

    .line 18
    .line 19
    invoke-direct {v1, v0, p2, v2}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 20
    .line 21
    .line 22
    iget-object p2, p0, Lyc/n;->b:Lq/s1;

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 v0, 0x1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    if-ne p1, v0, :cond_0

    .line 35
    .line 36
    const/4 v0, 0x2

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string p2, "Unreachable code"

    .line 41
    .line 42
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_1
    :goto_0
    :try_start_0
    iget-object p1, p2, Lq/s1;->g:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lyc/g;

    .line 49
    .line 50
    iget-object p2, p1, Lyc/g;->a:LJ3/g;

    .line 51
    .line 52
    iget-object p2, p2, LJ3/g;->a:Ljava/util/HashMap;

    .line 53
    .line 54
    const-string v2, "EXPOSURE_LOCK"

    .line 55
    .line 56
    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, LBc/a;

    .line 61
    .line 62
    iput v0, p2, LBc/a;->b:I

    .line 63
    .line 64
    iget-object v0, p1, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 65
    .line 66
    invoke-virtual {p2, v0}, LBc/a;->a(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    .line 67
    .line 68
    .line 69
    new-instance p2, Lkd/c;

    .line 70
    .line 71
    const/16 v0, 0x1a

    .line 72
    .line 73
    invoke-direct {p2, v1, v0}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 74
    .line 75
    .line 76
    new-instance v0, Lo1/c;

    .line 77
    .line 78
    const/16 v2, 0x12

    .line 79
    .line 80
    invoke-direct {v0, v1, v2}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, p2, v0}, Lyc/g;->h(Ljava/lang/Runnable;Lyc/m;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :catch_0
    move-exception p1

    .line 88
    invoke-static {p1, v1}, Lq/s1;->h(Ljava/lang/Exception;Lyc/D;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method private final b(Ljava/lang/Object;Lba/a;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lyc/z;

    .line 14
    .line 15
    new-instance v1, LPc/q;

    .line 16
    .line 17
    const/16 v2, 0x16

    .line 18
    .line 19
    invoke-direct {v1, v0, p2, v2}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 20
    .line 21
    .line 22
    iget-object p2, p0, Lyc/n;->b:Lq/s1;

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    :try_start_0
    iget-object p2, p2, Lq/s1;->g:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p2, Lyc/g;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    move-object v2, v0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v2, Lu0/w0;

    .line 37
    .line 38
    iget-object v3, p1, Lyc/z;->a:Ljava/lang/Double;

    .line 39
    .line 40
    iget-object p1, p1, Lyc/z;->b:Ljava/lang/Double;

    .line 41
    .line 42
    invoke-direct {v2, p1, v3}, Lu0/w0;-><init>(Ljava/io/Serializable;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    iget-object p1, p2, Lyc/g;->a:LJ3/g;

    .line 46
    .line 47
    invoke-virtual {p1}, LJ3/g;->c()LDc/a;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    iget-object v3, v2, Lu0/w0;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, Ljava/lang/Double;

    .line 56
    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    iget-object v3, v2, Lu0/w0;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Ljava/lang/Double;

    .line 62
    .line 63
    if-nez v3, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    move-object v0, v2

    .line 67
    :cond_2
    :goto_1
    iput-object v0, p1, LDc/a;->c:Lu0/w0;

    .line 68
    .line 69
    invoke-virtual {p1}, LDc/a;->b()V

    .line 70
    .line 71
    .line 72
    iget-object v0, p2, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 73
    .line 74
    invoke-virtual {p1, v0}, LDc/a;->a(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    .line 75
    .line 76
    .line 77
    new-instance p1, Lkd/c;

    .line 78
    .line 79
    const/16 v0, 0x16

    .line 80
    .line 81
    invoke-direct {p1, v1, v0}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Lo1/c;

    .line 85
    .line 86
    const/16 v2, 0xe

    .line 87
    .line 88
    invoke-direct {v0, v1, v2}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, p1, v0}, Lyc/g;->h(Ljava/lang/Runnable;Lyc/m;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :catch_0
    move-exception p1

    .line 96
    invoke-static {p1, v1}, Lq/s1;->h(Ljava/lang/Exception;Lyc/D;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method private final c(Ljava/lang/Object;Lba/a;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lyc/n;->b:Lq/s1;

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object p1, p1, Lq/s1;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lyc/g;

    .line 11
    .line 12
    iget-object p1, p1, Lyc/g;->a:LJ3/g;

    .line 13
    .line 14
    invoke-virtual {p1}, LJ3/g;->b()LCc/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v1, p1, Lzc/a;->a:Lt6/q;

    .line 19
    .line 20
    iget-object v1, v1, Lt6/q;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Landroid/hardware/camera2/CameraCharacteristics;

    .line 23
    .line 24
    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_COMPENSATION_RANGE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroid/util/Range;

    .line 31
    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    const-wide/16 v1, 0x0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    int-to-double v1, v1

    .line 48
    :goto_0
    invoke-virtual {p1}, LCc/a;->b()D

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    mul-double/2addr v3, v1

    .line 53
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const/4 v1, 0x0

    .line 58
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    invoke-static {p1}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :goto_1
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lba/a;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    const/16 v3, 0x17

    .line 6
    .line 7
    const-string v4, "videoRecordingFailed"

    .line 8
    .line 9
    const/16 v6, 0x15

    .line 10
    .line 11
    const/16 v7, 0x18

    .line 12
    .line 13
    const-string v8, "CameraAccessException"

    .line 14
    .line 15
    const-string v9, "Camera"

    .line 16
    .line 17
    const-string v10, "Unreachable code"

    .line 18
    .line 19
    const/4 v11, 0x3

    .line 20
    const/4 v12, 0x2

    .line 21
    const/4 v13, 0x1

    .line 22
    const/4 v14, 0x0

    .line 23
    iget-object v15, v1, Lyc/n;->b:Lq/s1;

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    iget v0, v1, Lyc/n;->a:I

    .line 27
    .line 28
    packed-switch v0, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    new-instance v0, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    :try_start_0
    iget-object v3, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, Lyc/g;

    .line 39
    .line 40
    iget-object v3, v3, Lyc/g;->a:LJ3/g;

    .line 41
    .line 42
    invoke-virtual {v3}, LJ3/g;->b()LCc/a;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, LCc/a;->b()D

    .line 47
    .line 48
    .line 49
    move-result-wide v3

    .line 50
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v0, v5, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_0
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_0
    invoke-direct/range {p0 .. p2}, Lyc/n;->c(Ljava/lang/Object;Lba/a;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_1
    new-instance v0, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    :try_start_1
    iget-object v3, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v3, Lyc/g;

    .line 79
    .line 80
    iget-object v3, v3, Lyc/g;->a:LJ3/g;

    .line 81
    .line 82
    invoke-virtual {v3}, LJ3/g;->b()LCc/a;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    iget-object v4, v3, Lzc/a;->a:Lt6/q;

    .line 87
    .line 88
    iget-object v4, v4, Lt6/q;->a:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v4, Landroid/hardware/camera2/CameraCharacteristics;

    .line 91
    .line 92
    sget-object v6, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_COMPENSATION_RANGE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 93
    .line 94
    invoke-virtual {v4, v6}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    check-cast v4, Landroid/util/Range;

    .line 99
    .line 100
    if-nez v4, :cond_0

    .line 101
    .line 102
    const-wide/16 v6, 0x0

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_0
    invoke-virtual {v4}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    check-cast v4, Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    int-to-double v6, v4

    .line 116
    :goto_1
    invoke-virtual {v3}, LCc/a;->b()D

    .line 117
    .line 118
    .line 119
    move-result-wide v3

    .line 120
    mul-double/2addr v3, v6

    .line 121
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v0, v5, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :catchall_1
    move-exception v0

    .line 130
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    :goto_2
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :pswitch_2
    invoke-direct/range {p0 .. p2}, Lyc/n;->b(Ljava/lang/Object;Lba/a;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :pswitch_3
    invoke-direct/range {p0 .. p2}, Lyc/n;->a(Ljava/lang/Object;Lba/a;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :pswitch_4
    new-instance v0, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 149
    .line 150
    .line 151
    move-object/from16 v3, p1

    .line 152
    .line 153
    check-cast v3, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    check-cast v3, Lyc/v;

    .line 160
    .line 161
    new-instance v4, LPc/o;

    .line 162
    .line 163
    invoke-direct {v4, v0, v2, v6}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_4

    .line 174
    .line 175
    if-eq v0, v13, :cond_3

    .line 176
    .line 177
    if-eq v0, v12, :cond_2

    .line 178
    .line 179
    if-ne v0, v11, :cond_1

    .line 180
    .line 181
    const/4 v5, 0x4

    .line 182
    goto :goto_3

    .line 183
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 184
    .line 185
    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw v0

    .line 189
    :cond_2
    move v5, v11

    .line 190
    goto :goto_3

    .line 191
    :cond_3
    move v5, v12

    .line 192
    goto :goto_3

    .line 193
    :cond_4
    move v5, v13

    .line 194
    :goto_3
    :try_start_2
    iget-object v0, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v0, Lyc/g;

    .line 197
    .line 198
    invoke-virtual {v0, v4, v5}, Lyc/g;->k(LPc/o;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :catch_0
    move-exception v0

    .line 203
    invoke-static {v0, v4}, Lq/s1;->h(Ljava/lang/Exception;Lyc/D;)V

    .line 204
    .line 205
    .line 206
    :goto_4
    return-void

    .line 207
    :pswitch_5
    new-instance v0, Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 210
    .line 211
    .line 212
    :try_start_3
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 213
    .line 214
    .line 215
    :try_start_4
    iget-object v3, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v3, Lyc/g;

    .line 218
    .line 219
    invoke-virtual {v3, v14}, Lyc/g;->p(Lyc/b;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 220
    .line 221
    .line 222
    :try_start_5
    invoke-virtual {v0, v5, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    goto :goto_6

    .line 226
    :catchall_2
    move-exception v0

    .line 227
    goto :goto_5

    .line 228
    :catch_1
    move-exception v0

    .line 229
    new-instance v3, Lyc/o;

    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-direct {v3, v4, v0, v14}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 247
    :goto_5
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    :goto_6
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :pswitch_6
    new-instance v0, Ljava/util/ArrayList;

    .line 256
    .line 257
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 258
    .line 259
    .line 260
    :try_start_6
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 261
    .line 262
    .line 263
    :try_start_7
    iget-object v3, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v3, Lyc/g;

    .line 266
    .line 267
    iget-object v4, v15, Lq/s1;->f:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v4, Luc/j;

    .line 270
    .line 271
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    new-instance v6, LWa/d;

    .line 275
    .line 276
    invoke-direct {v6, v3, v11}, LWa/d;-><init>(Ljava/lang/Object;I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v4, v6}, Luc/j;->a(Luc/i;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v3, v5, v13}, Lyc/g;->o(ZZ)V

    .line 283
    .line 284
    .line 285
    const-string v3, "startPreviewWithImageStream"

    .line 286
    .line 287
    invoke-static {v9, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_7
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 288
    .line 289
    .line 290
    :try_start_8
    invoke-virtual {v0, v5, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    goto :goto_8

    .line 294
    :catchall_3
    move-exception v0

    .line 295
    goto :goto_7

    .line 296
    :catch_2
    move-exception v0

    .line 297
    new-instance v3, Lyc/o;

    .line 298
    .line 299
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-direct {v3, v8, v0, v14}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    throw v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 307
    :goto_7
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    :goto_8
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :pswitch_7
    new-instance v0, Ljava/util/ArrayList;

    .line 316
    .line 317
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 318
    .line 319
    .line 320
    :try_start_9
    iget-object v3, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v3, Lyc/g;

    .line 323
    .line 324
    iget-boolean v6, v3, Lyc/g;->u:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 325
    .line 326
    if-nez v6, :cond_5

    .line 327
    .line 328
    goto :goto_a

    .line 329
    :cond_5
    :try_start_a
    sget v6, Lyc/E;->a:I

    .line 330
    .line 331
    if-lt v6, v7, :cond_6

    .line 332
    .line 333
    goto :goto_9

    .line 334
    :cond_6
    move v13, v5

    .line 335
    :goto_9
    if-eqz v13, :cond_7

    .line 336
    .line 337
    iget-object v3, v3, Lyc/g;->t:Landroid/media/MediaRecorder;

    .line 338
    .line 339
    invoke-static {v3}, Lu6/u;->r(Landroid/media/MediaRecorder;)V
    :try_end_a
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 340
    .line 341
    .line 342
    :goto_a
    :try_start_b
    invoke-virtual {v0, v5, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 343
    .line 344
    .line 345
    goto :goto_d

    .line 346
    :catchall_4
    move-exception v0

    .line 347
    goto :goto_c

    .line 348
    :catch_3
    move-exception v0

    .line 349
    goto :goto_b

    .line 350
    :cond_7
    :try_start_c
    new-instance v0, Lyc/o;

    .line 351
    .line 352
    const-string v3, "pauseVideoRecording requires Android API +24."

    .line 353
    .line 354
    invoke-direct {v0, v4, v3, v14}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    throw v0
    :try_end_c
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 358
    :goto_b
    :try_start_d
    new-instance v3, Lyc/o;

    .line 359
    .line 360
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-direct {v3, v4, v0, v14}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    throw v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 368
    :goto_c
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    :goto_d
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    return-void

    .line 376
    :pswitch_8
    new-instance v0, Ljava/util/ArrayList;

    .line 377
    .line 378
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 379
    .line 380
    .line 381
    :try_start_e
    invoke-virtual {v15}, Lq/s1;->o()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    invoke-virtual {v0, v5, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 386
    .line 387
    .line 388
    goto :goto_e

    .line 389
    :catchall_5
    move-exception v0

    .line 390
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    :goto_e
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    return-void

    .line 398
    :pswitch_9
    new-instance v0, Ljava/util/ArrayList;

    .line 399
    .line 400
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 401
    .line 402
    .line 403
    move-object/from16 v3, p1

    .line 404
    .line 405
    check-cast v3, Ljava/util/ArrayList;

    .line 406
    .line 407
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    check-cast v3, Ljava/lang/Boolean;

    .line 412
    .line 413
    :try_start_f
    invoke-virtual {v15, v3}, Lq/s1;->n(Ljava/lang/Boolean;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0, v5, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 417
    .line 418
    .line 419
    goto :goto_f

    .line 420
    :catchall_6
    move-exception v0

    .line 421
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    :goto_f
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    return-void

    .line 429
    :pswitch_a
    new-instance v0, Ljava/util/ArrayList;

    .line 430
    .line 431
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 432
    .line 433
    .line 434
    new-instance v3, LPc/q;

    .line 435
    .line 436
    invoke-direct {v3, v0, v2, v6}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 437
    .line 438
    .line 439
    iget-object v0, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 440
    .line 441
    move-object v2, v0

    .line 442
    check-cast v2, Lyc/g;

    .line 443
    .line 444
    iget-object v0, v2, Lyc/g;->l:Lyc/h;

    .line 445
    .line 446
    iget v4, v0, Lyc/h;->b:I

    .line 447
    .line 448
    if-eq v4, v13, :cond_8

    .line 449
    .line 450
    new-instance v0, Lyc/o;

    .line 451
    .line 452
    const-string v2, "captureAlreadyActive"

    .line 453
    .line 454
    const-string v4, "Picture is currently already being captured"

    .line 455
    .line 456
    invoke-direct {v0, v2, v4, v14}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v3, v0}, LPc/q;->c(Lyc/o;)V

    .line 460
    .line 461
    .line 462
    goto :goto_11

    .line 463
    :cond_8
    iput-object v3, v2, Lyc/g;->z:LPc/q;

    .line 464
    .line 465
    iget-object v3, v2, Lyc/g;->g:Landroid/content/Context;

    .line 466
    .line 467
    invoke-virtual {v3}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 468
    .line 469
    .line 470
    move-result-object v3

    .line 471
    :try_start_10
    const-string v4, "CAP"

    .line 472
    .line 473
    const-string v5, ".jpg"

    .line 474
    .line 475
    invoke-static {v4, v5, v3}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 476
    .line 477
    .line 478
    move-result-object v3

    .line 479
    iput-object v3, v2, Lyc/g;->w:Ljava/io/File;

    .line 480
    .line 481
    iget-object v3, v2, Lyc/g;->x:LS3/s;

    .line 482
    .line 483
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    new-instance v4, LJ5/n;

    .line 487
    .line 488
    invoke-direct {v4, v12}, LJ5/n;-><init>(I)V

    .line 489
    .line 490
    .line 491
    iput-object v4, v3, LS3/s;->b:Ljava/lang/Object;

    .line 492
    .line 493
    new-instance v4, LJ5/n;

    .line 494
    .line 495
    invoke-direct {v4, v12}, LJ5/n;-><init>(I)V

    .line 496
    .line 497
    .line 498
    iput-object v4, v3, LS3/s;->c:Ljava/lang/Object;
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_5
    .catch Ljava/lang/SecurityException; {:try_start_10 .. :try_end_10} :catch_4

    .line 499
    .line 500
    iget-object v3, v2, Lyc/g;->q:Landroid/media/ImageReader;

    .line 501
    .line 502
    iget-object v4, v2, Lyc/g;->m:Landroid/os/Handler;

    .line 503
    .line 504
    invoke-virtual {v3, v2, v4}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    .line 505
    .line 506
    .line 507
    iget-object v3, v2, Lyc/g;->a:LJ3/g;

    .line 508
    .line 509
    iget-object v3, v3, LJ3/g;->a:Ljava/util/HashMap;

    .line 510
    .line 511
    const-string v4, "AUTO_FOCUS"

    .line 512
    .line 513
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v3

    .line 517
    check-cast v3, LAc/a;

    .line 518
    .line 519
    invoke-virtual {v3}, LAc/a;->b()Z

    .line 520
    .line 521
    .line 522
    move-result v4

    .line 523
    if-eqz v4, :cond_9

    .line 524
    .line 525
    iget v3, v3, LAc/a;->b:I

    .line 526
    .line 527
    if-ne v3, v13, :cond_9

    .line 528
    .line 529
    const-string v3, "runPictureAutoFocus"

    .line 530
    .line 531
    invoke-static {v9, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 532
    .line 533
    .line 534
    iput v12, v0, Lyc/h;->b:I

    .line 535
    .line 536
    invoke-virtual {v2}, Lyc/g;->d()V

    .line 537
    .line 538
    .line 539
    goto :goto_11

    .line 540
    :cond_9
    invoke-virtual {v2}, Lyc/g;->i()V

    .line 541
    .line 542
    .line 543
    goto :goto_11

    .line 544
    :catch_4
    move-exception v0

    .line 545
    goto :goto_10

    .line 546
    :catch_5
    move-exception v0

    .line 547
    :goto_10
    iget-object v3, v2, Lyc/g;->z:LPc/q;

    .line 548
    .line 549
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    iget-object v2, v2, Lyc/g;->h:Lmd/J;

    .line 554
    .line 555
    const-string v4, "cannotCreateFile"

    .line 556
    .line 557
    invoke-virtual {v2, v3, v4, v0}, Lmd/J;->l(Lyc/C;Ljava/lang/String;Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    :goto_11
    return-void

    .line 561
    :pswitch_b
    new-instance v0, Ljava/util/ArrayList;

    .line 562
    .line 563
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 564
    .line 565
    .line 566
    :try_start_11
    iget-object v3, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 567
    .line 568
    check-cast v3, Lyc/g;

    .line 569
    .line 570
    iget-object v3, v3, Lyc/g;->a:LJ3/g;

    .line 571
    .line 572
    invoke-virtual {v3}, LJ3/g;->f()LJc/b;

    .line 573
    .line 574
    .line 575
    move-result-object v3

    .line 576
    iput v5, v3, LJc/b;->d:I

    .line 577
    .line 578
    invoke-virtual {v0, v5, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 579
    .line 580
    .line 581
    goto :goto_12

    .line 582
    :catchall_7
    move-exception v0

    .line 583
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    :goto_12
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    return-void

    .line 591
    :pswitch_c
    new-instance v0, Ljava/util/ArrayList;

    .line 592
    .line 593
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 594
    .line 595
    .line 596
    move-object/from16 v3, p1

    .line 597
    .line 598
    check-cast v3, Ljava/util/ArrayList;

    .line 599
    .line 600
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v3

    .line 604
    check-cast v3, Lyc/t;

    .line 605
    .line 606
    :try_start_12
    iget-object v4, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 607
    .line 608
    check-cast v4, Lyc/g;

    .line 609
    .line 610
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 611
    .line 612
    .line 613
    move-result v3

    .line 614
    if-eqz v3, :cond_d

    .line 615
    .line 616
    if-eq v3, v13, :cond_c

    .line 617
    .line 618
    if-eq v3, v12, :cond_b

    .line 619
    .line 620
    if-ne v3, v11, :cond_a

    .line 621
    .line 622
    const/4 v13, 0x4

    .line 623
    goto :goto_13

    .line 624
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 625
    .line 626
    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    throw v0

    .line 630
    :cond_b
    move v13, v11

    .line 631
    goto :goto_13

    .line 632
    :cond_c
    move v13, v12

    .line 633
    :cond_d
    :goto_13
    iget-object v3, v4, Lyc/g;->a:LJ3/g;

    .line 634
    .line 635
    invoke-virtual {v3}, LJ3/g;->f()LJc/b;

    .line 636
    .line 637
    .line 638
    move-result-object v3

    .line 639
    iput v13, v3, LJc/b;->d:I

    .line 640
    .line 641
    invoke-virtual {v0, v5, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 642
    .line 643
    .line 644
    goto :goto_14

    .line 645
    :catchall_8
    move-exception v0

    .line 646
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    :goto_14
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 651
    .line 652
    .line 653
    return-void

    .line 654
    :pswitch_d
    new-instance v0, Ljava/util/ArrayList;

    .line 655
    .line 656
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 657
    .line 658
    .line 659
    :try_start_13
    iget-object v3, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 660
    .line 661
    check-cast v3, Lyc/g;

    .line 662
    .line 663
    if-eqz v3, :cond_f

    .line 664
    .line 665
    const-string v4, "dispose"

    .line 666
    .line 667
    invoke-static {v9, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 668
    .line 669
    .line 670
    invoke-virtual {v3}, Lyc/g;->a()V

    .line 671
    .line 672
    .line 673
    iget-object v4, v3, Lyc/g;->e:Lio/flutter/embedding/engine/renderer/i;

    .line 674
    .line 675
    invoke-virtual {v4}, Lio/flutter/embedding/engine/renderer/i;->release()V

    .line 676
    .line 677
    .line 678
    iget-object v3, v3, Lyc/g;->a:LJ3/g;

    .line 679
    .line 680
    invoke-virtual {v3}, LJ3/g;->f()LJc/b;

    .line 681
    .line 682
    .line 683
    move-result-object v3

    .line 684
    iget-object v3, v3, LJc/b;->c:LJc/a;

    .line 685
    .line 686
    iget-object v4, v3, LJc/a;->f:LA7/V1;

    .line 687
    .line 688
    if-nez v4, :cond_e

    .line 689
    .line 690
    goto :goto_15

    .line 691
    :cond_e
    iget-object v6, v3, LJc/a;->a:Landroid/app/Activity;

    .line 692
    .line 693
    invoke-virtual {v6, v4}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 694
    .line 695
    .line 696
    iput-object v14, v3, LJc/a;->f:LA7/V1;

    .line 697
    .line 698
    :cond_f
    :goto_15
    invoke-virtual {v0, v5, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 699
    .line 700
    .line 701
    goto :goto_16

    .line 702
    :catchall_9
    move-exception v0

    .line 703
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    :goto_16
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 708
    .line 709
    .line 710
    return-void

    .line 711
    :pswitch_e
    new-instance v0, Ljava/util/ArrayList;

    .line 712
    .line 713
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 714
    .line 715
    .line 716
    move-object/from16 v3, p1

    .line 717
    .line 718
    check-cast v3, Ljava/util/ArrayList;

    .line 719
    .line 720
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v3

    .line 724
    check-cast v3, Lyc/x;

    .line 725
    .line 726
    :try_start_14
    invoke-virtual {v15, v3}, Lq/s1;->i(Lyc/x;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v0, v5, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    .line 730
    .line 731
    .line 732
    goto :goto_17

    .line 733
    :catchall_a
    move-exception v0

    .line 734
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    :goto_17
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    return-void

    .line 742
    :pswitch_f
    new-instance v0, Ljava/util/ArrayList;

    .line 743
    .line 744
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 745
    .line 746
    .line 747
    :try_start_15
    iget-object v3, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 748
    .line 749
    check-cast v3, Lyc/g;

    .line 750
    .line 751
    iget-boolean v6, v3, Lyc/g;->u:Z
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_b

    .line 752
    .line 753
    if-nez v6, :cond_10

    .line 754
    .line 755
    goto :goto_19

    .line 756
    :cond_10
    :try_start_16
    sget v6, Lyc/E;->a:I

    .line 757
    .line 758
    if-lt v6, v7, :cond_11

    .line 759
    .line 760
    goto :goto_18

    .line 761
    :cond_11
    move v13, v5

    .line 762
    :goto_18
    if-eqz v13, :cond_12

    .line 763
    .line 764
    iget-object v3, v3, Lyc/g;->t:Landroid/media/MediaRecorder;

    .line 765
    .line 766
    invoke-static {v3}, Lu6/u;->g(Landroid/media/MediaRecorder;)V
    :try_end_16
    .catch Ljava/lang/IllegalStateException; {:try_start_16 .. :try_end_16} :catch_6
    .catchall {:try_start_16 .. :try_end_16} :catchall_b

    .line 767
    .line 768
    .line 769
    :goto_19
    :try_start_17
    invoke-virtual {v0, v5, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_b

    .line 770
    .line 771
    .line 772
    goto :goto_1c

    .line 773
    :catchall_b
    move-exception v0

    .line 774
    goto :goto_1b

    .line 775
    :catch_6
    move-exception v0

    .line 776
    goto :goto_1a

    .line 777
    :cond_12
    :try_start_18
    new-instance v0, Lyc/o;

    .line 778
    .line 779
    const-string v3, "resumeVideoRecording requires Android API +24."

    .line 780
    .line 781
    invoke-direct {v0, v4, v3, v14}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 782
    .line 783
    .line 784
    throw v0
    :try_end_18
    .catch Ljava/lang/IllegalStateException; {:try_start_18 .. :try_end_18} :catch_6
    .catchall {:try_start_18 .. :try_end_18} :catchall_b

    .line 785
    :goto_1a
    :try_start_19
    new-instance v3, Lyc/o;

    .line 786
    .line 787
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    invoke-direct {v3, v4, v0, v14}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 792
    .line 793
    .line 794
    throw v3
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_b

    .line 795
    :goto_1b
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    :goto_1c
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 800
    .line 801
    .line 802
    return-void

    .line 803
    :pswitch_10
    new-instance v0, Ljava/util/ArrayList;

    .line 804
    .line 805
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 806
    .line 807
    .line 808
    move-object/from16 v3, p1

    .line 809
    .line 810
    check-cast v3, Ljava/util/ArrayList;

    .line 811
    .line 812
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v3

    .line 816
    check-cast v3, Ljava/lang/String;

    .line 817
    .line 818
    :try_start_1a
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_c

    .line 819
    .line 820
    .line 821
    :try_start_1b
    iget-object v4, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 822
    .line 823
    check-cast v4, Lyc/g;

    .line 824
    .line 825
    new-instance v6, Lt6/q;

    .line 826
    .line 827
    iget-object v7, v15, Lq/s1;->a:Ljava/lang/Object;

    .line 828
    .line 829
    check-cast v7, Landroid/app/Activity;

    .line 830
    .line 831
    const-string v9, "camera"

    .line 832
    .line 833
    invoke-virtual {v7, v9}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v7

    .line 837
    check-cast v7, Landroid/hardware/camera2/CameraManager;

    .line 838
    .line 839
    invoke-direct {v6, v3, v7}, Lt6/q;-><init>(Ljava/lang/String;Landroid/hardware/camera2/CameraManager;)V

    .line 840
    .line 841
    .line 842
    invoke-virtual {v4, v6}, Lyc/g;->j(Lt6/q;)V
    :try_end_1b
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1b .. :try_end_1b} :catch_7
    .catchall {:try_start_1b .. :try_end_1b} :catchall_c

    .line 843
    .line 844
    .line 845
    :try_start_1c
    invoke-virtual {v0, v5, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 846
    .line 847
    .line 848
    goto :goto_1e

    .line 849
    :catchall_c
    move-exception v0

    .line 850
    goto :goto_1d

    .line 851
    :catch_7
    move-exception v0

    .line 852
    new-instance v3, Lyc/o;

    .line 853
    .line 854
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    invoke-direct {v3, v8, v0, v14}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 859
    .line 860
    .line 861
    throw v3
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_c

    .line 862
    :goto_1d
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    :goto_1e
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 867
    .line 868
    .line 869
    return-void

    .line 870
    :pswitch_11
    new-instance v0, Ljava/util/ArrayList;

    .line 871
    .line 872
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 873
    .line 874
    .line 875
    :try_start_1d
    iget-object v3, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 876
    .line 877
    check-cast v3, Lyc/g;

    .line 878
    .line 879
    iput-boolean v5, v3, Lyc/g;->v:Z

    .line 880
    .line 881
    new-instance v4, Lyc/c;

    .line 882
    .line 883
    invoke-direct {v4, v3, v5}, Lyc/c;-><init>(Lyc/g;I)V

    .line 884
    .line 885
    .line 886
    invoke-virtual {v3, v14, v4}, Lyc/g;->h(Ljava/lang/Runnable;Lyc/m;)V

    .line 887
    .line 888
    .line 889
    invoke-virtual {v0, v5, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_d

    .line 890
    .line 891
    .line 892
    goto :goto_1f

    .line 893
    :catchall_d
    move-exception v0

    .line 894
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    :goto_1f
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 899
    .line 900
    .line 901
    return-void

    .line 902
    :pswitch_12
    new-instance v0, Ljava/util/ArrayList;

    .line 903
    .line 904
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 905
    .line 906
    .line 907
    :try_start_1e
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_e

    .line 908
    .line 909
    .line 910
    :try_start_1f
    iget-object v3, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 911
    .line 912
    check-cast v3, Lyc/g;

    .line 913
    .line 914
    iget-boolean v4, v3, Lyc/g;->v:Z

    .line 915
    .line 916
    if-nez v4, :cond_13

    .line 917
    .line 918
    iput-boolean v13, v3, Lyc/g;->v:Z

    .line 919
    .line 920
    iget-object v3, v3, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 921
    .line 922
    if-eqz v3, :cond_13

    .line 923
    .line 924
    invoke-virtual {v3}, Landroid/hardware/camera2/CameraCaptureSession;->stopRepeating()V
    :try_end_1f
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1f .. :try_end_1f} :catch_8
    .catchall {:try_start_1f .. :try_end_1f} :catchall_e

    .line 925
    .line 926
    .line 927
    goto :goto_20

    .line 928
    :catch_8
    move-exception v0

    .line 929
    goto :goto_21

    .line 930
    :cond_13
    :goto_20
    :try_start_20
    invoke-virtual {v0, v5, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 931
    .line 932
    .line 933
    goto :goto_23

    .line 934
    :catchall_e
    move-exception v0

    .line 935
    goto :goto_22

    .line 936
    :goto_21
    new-instance v3, Lyc/o;

    .line 937
    .line 938
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    invoke-direct {v3, v8, v0, v14}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 943
    .line 944
    .line 945
    throw v3
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_e

    .line 946
    :goto_22
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    :goto_23
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 951
    .line 952
    .line 953
    return-void

    .line 954
    :pswitch_13
    new-instance v0, Ljava/util/ArrayList;

    .line 955
    .line 956
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 957
    .line 958
    .line 959
    move-object/from16 v4, p1

    .line 960
    .line 961
    check-cast v4, Ljava/util/ArrayList;

    .line 962
    .line 963
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v4

    .line 967
    check-cast v4, Ljava/lang/Double;

    .line 968
    .line 969
    new-instance v6, LPc/q;

    .line 970
    .line 971
    invoke-direct {v6, v0, v2, v3}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 972
    .line 973
    .line 974
    iget-object v0, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 975
    .line 976
    check-cast v0, Lyc/g;

    .line 977
    .line 978
    invoke-virtual {v4}, Ljava/lang/Double;->floatValue()F

    .line 979
    .line 980
    .line 981
    move-result v2

    .line 982
    iget-object v4, v0, Lyc/g;->a:LJ3/g;

    .line 983
    .line 984
    invoke-virtual {v4}, LJ3/g;->g()LKc/a;

    .line 985
    .line 986
    .line 987
    move-result-object v4

    .line 988
    iget-object v7, v4, LKc/a;->f:Ljava/lang/Float;

    .line 989
    .line 990
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 991
    .line 992
    .line 993
    move-result v8

    .line 994
    iget-object v9, v4, LKc/a;->e:Ljava/lang/Float;

    .line 995
    .line 996
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    .line 997
    .line 998
    .line 999
    move-result v10

    .line 1000
    cmpl-float v8, v2, v8

    .line 1001
    .line 1002
    if-gtz v8, :cond_15

    .line 1003
    .line 1004
    cmpg-float v8, v2, v10

    .line 1005
    .line 1006
    if-gez v8, :cond_14

    .line 1007
    .line 1008
    goto :goto_24

    .line 1009
    :cond_14
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v2

    .line 1013
    iput-object v2, v4, LKc/a;->d:Ljava/lang/Float;

    .line 1014
    .line 1015
    iget-object v2, v0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 1016
    .line 1017
    invoke-virtual {v4, v2}, LKc/a;->a(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    .line 1018
    .line 1019
    .line 1020
    new-instance v2, Lkd/c;

    .line 1021
    .line 1022
    invoke-direct {v2, v6, v3}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 1023
    .line 1024
    .line 1025
    new-instance v3, Lo1/c;

    .line 1026
    .line 1027
    const/16 v4, 0xf

    .line 1028
    .line 1029
    invoke-direct {v3, v6, v4}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v0, v2, v3}, Lyc/g;->h(Ljava/lang/Runnable;Lyc/m;)V

    .line 1033
    .line 1034
    .line 1035
    goto :goto_25

    .line 1036
    :cond_15
    :goto_24
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 1037
    .line 1038
    new-array v2, v12, [Ljava/lang/Object;

    .line 1039
    .line 1040
    aput-object v9, v2, v5

    .line 1041
    .line 1042
    aput-object v7, v2, v13

    .line 1043
    .line 1044
    const-string v3, "Zoom level out of bounds (zoom level should be between %f and %f)."

    .line 1045
    .line 1046
    invoke-static {v0, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v0

    .line 1050
    new-instance v2, Lyc/o;

    .line 1051
    .line 1052
    const-string v3, "ZOOM_ERROR"

    .line 1053
    .line 1054
    invoke-direct {v2, v3, v0, v14}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v6, v2}, LPc/q;->c(Lyc/o;)V

    .line 1058
    .line 1059
    .line 1060
    :goto_25
    return-void

    .line 1061
    :pswitch_14
    new-instance v0, Ljava/util/ArrayList;

    .line 1062
    .line 1063
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1064
    .line 1065
    .line 1066
    :try_start_21
    iget-object v3, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 1067
    .line 1068
    check-cast v3, Lyc/g;

    .line 1069
    .line 1070
    iget-object v3, v3, Lyc/g;->a:LJ3/g;

    .line 1071
    .line 1072
    invoke-virtual {v3}, LJ3/g;->g()LKc/a;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v3

    .line 1076
    iget-object v3, v3, LKc/a;->e:Ljava/lang/Float;

    .line 1077
    .line 1078
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 1079
    .line 1080
    .line 1081
    move-result v3

    .line 1082
    float-to-double v3, v3

    .line 1083
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v3

    .line 1087
    invoke-virtual {v0, v5, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_f

    .line 1088
    .line 1089
    .line 1090
    goto :goto_26

    .line 1091
    :catchall_f
    move-exception v0

    .line 1092
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v0

    .line 1096
    :goto_26
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1097
    .line 1098
    .line 1099
    return-void

    .line 1100
    :pswitch_15
    new-instance v0, Ljava/util/ArrayList;

    .line 1101
    .line 1102
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1103
    .line 1104
    .line 1105
    :try_start_22
    iget-object v3, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 1106
    .line 1107
    check-cast v3, Lyc/g;

    .line 1108
    .line 1109
    iget-object v3, v3, Lyc/g;->a:LJ3/g;

    .line 1110
    .line 1111
    invoke-virtual {v3}, LJ3/g;->g()LKc/a;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v3

    .line 1115
    iget-object v3, v3, LKc/a;->f:Ljava/lang/Float;

    .line 1116
    .line 1117
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 1118
    .line 1119
    .line 1120
    move-result v3

    .line 1121
    float-to-double v3, v3

    .line 1122
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v3

    .line 1126
    invoke-virtual {v0, v5, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_10

    .line 1127
    .line 1128
    .line 1129
    goto :goto_27

    .line 1130
    :catchall_10
    move-exception v0

    .line 1131
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    :goto_27
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1136
    .line 1137
    .line 1138
    return-void

    .line 1139
    :pswitch_16
    new-instance v0, Ljava/util/ArrayList;

    .line 1140
    .line 1141
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1142
    .line 1143
    .line 1144
    move-object/from16 v3, p1

    .line 1145
    .line 1146
    check-cast v3, Ljava/util/ArrayList;

    .line 1147
    .line 1148
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v3

    .line 1152
    check-cast v3, Lyc/z;

    .line 1153
    .line 1154
    new-instance v4, LPc/p;

    .line 1155
    .line 1156
    invoke-direct {v4, v0, v2, v7}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1160
    .line 1161
    .line 1162
    :try_start_23
    iget-object v0, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 1163
    .line 1164
    check-cast v0, Lyc/g;

    .line 1165
    .line 1166
    if-nez v3, :cond_16

    .line 1167
    .line 1168
    goto :goto_28

    .line 1169
    :cond_16
    new-instance v14, Lu0/w0;

    .line 1170
    .line 1171
    iget-object v2, v3, Lyc/z;->a:Ljava/lang/Double;

    .line 1172
    .line 1173
    iget-object v3, v3, Lyc/z;->b:Ljava/lang/Double;

    .line 1174
    .line 1175
    invoke-direct {v14, v3, v2}, Lu0/w0;-><init>(Ljava/io/Serializable;Ljava/lang/Object;)V

    .line 1176
    .line 1177
    .line 1178
    :goto_28
    invoke-virtual {v0, v4, v14}, Lyc/g;->m(LPc/p;Lu0/w0;)V
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_9

    .line 1179
    .line 1180
    .line 1181
    goto :goto_29

    .line 1182
    :catch_9
    move-exception v0

    .line 1183
    invoke-static {v0, v4}, Lq/s1;->h(Ljava/lang/Exception;Lyc/D;)V

    .line 1184
    .line 1185
    .line 1186
    :goto_29
    return-void

    .line 1187
    :pswitch_17
    new-instance v0, Ljava/util/ArrayList;

    .line 1188
    .line 1189
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1190
    .line 1191
    .line 1192
    move-object/from16 v3, p1

    .line 1193
    .line 1194
    check-cast v3, Ljava/util/ArrayList;

    .line 1195
    .line 1196
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v3

    .line 1200
    check-cast v3, Lyc/w;

    .line 1201
    .line 1202
    :try_start_24
    iget-object v4, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 1203
    .line 1204
    check-cast v4, Lyc/g;

    .line 1205
    .line 1206
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 1207
    .line 1208
    .line 1209
    move-result v3

    .line 1210
    if-eqz v3, :cond_18

    .line 1211
    .line 1212
    if-ne v3, v13, :cond_17

    .line 1213
    .line 1214
    goto :goto_2a

    .line 1215
    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1216
    .line 1217
    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1218
    .line 1219
    .line 1220
    throw v0

    .line 1221
    :cond_18
    move v12, v13

    .line 1222
    :goto_2a
    invoke-virtual {v4, v12}, Lyc/g;->l(I)V

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v0, v5, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_11

    .line 1226
    .line 1227
    .line 1228
    goto :goto_2b

    .line 1229
    :catchall_11
    move-exception v0

    .line 1230
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v0

    .line 1234
    :goto_2b
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1235
    .line 1236
    .line 1237
    return-void

    .line 1238
    :pswitch_18
    new-instance v0, Ljava/util/ArrayList;

    .line 1239
    .line 1240
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1241
    .line 1242
    .line 1243
    move-object/from16 v3, p1

    .line 1244
    .line 1245
    check-cast v3, Ljava/util/ArrayList;

    .line 1246
    .line 1247
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v4

    .line 1251
    check-cast v4, Ljava/lang/String;

    .line 1252
    .line 1253
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v3

    .line 1257
    check-cast v3, Lyc/y;

    .line 1258
    .line 1259
    new-instance v6, LPc/p;

    .line 1260
    .line 1261
    const/16 v7, 0x16

    .line 1262
    .line 1263
    invoke-direct {v6, v0, v2, v7}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 1264
    .line 1265
    .line 1266
    iget-object v0, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 1267
    .line 1268
    check-cast v0, Lyc/g;

    .line 1269
    .line 1270
    if-eqz v0, :cond_19

    .line 1271
    .line 1272
    invoke-virtual {v0}, Lyc/g;->a()V

    .line 1273
    .line 1274
    .line 1275
    :cond_19
    iget-object v0, v3, Lyc/y;->e:Ljava/lang/Boolean;

    .line 1276
    .line 1277
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1278
    .line 1279
    .line 1280
    move-result v0

    .line 1281
    new-instance v2, Lcom/applovin/impl/Y;

    .line 1282
    .line 1283
    invoke-direct {v2, v15, v6, v4, v3}, Lcom/applovin/impl/Y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1284
    .line 1285
    .line 1286
    iget-object v3, v15, Lq/s1;->c:Ljava/lang/Object;

    .line 1287
    .line 1288
    check-cast v3, Ls8/b;

    .line 1289
    .line 1290
    iget-boolean v4, v3, Ls8/b;->b:Z

    .line 1291
    .line 1292
    if-eqz v4, :cond_1a

    .line 1293
    .line 1294
    const-string v0, "CameraPermissionsRequestOngoing"

    .line 1295
    .line 1296
    const-string v3, "Another request is ongoing and multiple requests cannot be handled at once."

    .line 1297
    .line 1298
    invoke-virtual {v2, v0, v3}, Lcom/applovin/impl/Y;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1299
    .line 1300
    .line 1301
    goto :goto_2d

    .line 1302
    :cond_1a
    iget-object v4, v15, Lq/s1;->a:Ljava/lang/Object;

    .line 1303
    .line 1304
    check-cast v4, Landroid/app/Activity;

    .line 1305
    .line 1306
    const-string v6, "android.permission.CAMERA"

    .line 1307
    .line 1308
    invoke-static {v4, v6}, LY0/e;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 1309
    .line 1310
    .line 1311
    move-result v7

    .line 1312
    const-string v8, "android.permission.RECORD_AUDIO"

    .line 1313
    .line 1314
    if-nez v7, :cond_1c

    .line 1315
    .line 1316
    if-eqz v0, :cond_1b

    .line 1317
    .line 1318
    invoke-static {v4, v8}, LY0/e;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 1319
    .line 1320
    .line 1321
    move-result v7

    .line 1322
    if-nez v7, :cond_1c

    .line 1323
    .line 1324
    :cond_1b
    invoke-virtual {v2, v14, v14}, Lcom/applovin/impl/Y;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1325
    .line 1326
    .line 1327
    goto :goto_2d

    .line 1328
    :cond_1c
    new-instance v7, LYc/g;

    .line 1329
    .line 1330
    new-instance v9, Laa/f;

    .line 1331
    .line 1332
    const/16 v10, 0x1b

    .line 1333
    .line 1334
    invoke-direct {v9, v10, v3, v2}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1335
    .line 1336
    .line 1337
    invoke-direct {v7, v9}, LYc/g;-><init>(Laa/f;)V

    .line 1338
    .line 1339
    .line 1340
    iget-object v2, v15, Lq/s1;->d:Ljava/lang/Object;

    .line 1341
    .line 1342
    check-cast v2, Lo1/c;

    .line 1343
    .line 1344
    iget-object v2, v2, Lo1/c;->b:Ljava/lang/Object;

    .line 1345
    .line 1346
    check-cast v2, Lrc/b;

    .line 1347
    .line 1348
    check-cast v2, Lq/s1;

    .line 1349
    .line 1350
    invoke-virtual {v2, v7}, Lq/s1;->d(Luc/v;)V

    .line 1351
    .line 1352
    .line 1353
    iput-boolean v13, v3, Ls8/b;->b:Z

    .line 1354
    .line 1355
    if-eqz v0, :cond_1d

    .line 1356
    .line 1357
    new-array v0, v12, [Ljava/lang/String;

    .line 1358
    .line 1359
    aput-object v6, v0, v5

    .line 1360
    .line 1361
    aput-object v8, v0, v13

    .line 1362
    .line 1363
    goto :goto_2c

    .line 1364
    :cond_1d
    new-array v0, v13, [Ljava/lang/String;

    .line 1365
    .line 1366
    aput-object v6, v0, v5

    .line 1367
    .line 1368
    :goto_2c
    const/16 v2, 0x2644

    .line 1369
    .line 1370
    invoke-static {v4, v0, v2}, LX0/b;->a(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 1371
    .line 1372
    .line 1373
    :goto_2d
    return-void

    .line 1374
    :pswitch_19
    new-instance v0, Ljava/util/ArrayList;

    .line 1375
    .line 1376
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1377
    .line 1378
    .line 1379
    move-object/from16 v3, p1

    .line 1380
    .line 1381
    check-cast v3, Ljava/util/ArrayList;

    .line 1382
    .line 1383
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v3

    .line 1387
    check-cast v3, Ljava/lang/Double;

    .line 1388
    .line 1389
    new-instance v4, LPc/o;

    .line 1390
    .line 1391
    const/16 v7, 0x16

    .line 1392
    .line 1393
    invoke-direct {v4, v0, v2, v7}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 1394
    .line 1395
    .line 1396
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1397
    .line 1398
    .line 1399
    :try_start_25
    iget-object v0, v15, Lq/s1;->g:Ljava/lang/Object;

    .line 1400
    .line 1401
    check-cast v0, Lyc/g;

    .line 1402
    .line 1403
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 1404
    .line 1405
    .line 1406
    move-result-wide v2

    .line 1407
    iget-object v6, v0, Lyc/g;->a:LJ3/g;

    .line 1408
    .line 1409
    invoke-virtual {v6}, LJ3/g;->b()LCc/a;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v6

    .line 1413
    invoke-virtual {v6}, LCc/a;->b()D

    .line 1414
    .line 1415
    .line 1416
    move-result-wide v7

    .line 1417
    div-double/2addr v2, v7

    .line 1418
    iput-wide v2, v6, LCc/a;->b:D

    .line 1419
    .line 1420
    iget-object v2, v0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 1421
    .line 1422
    invoke-virtual {v6, v2}, LCc/a;->a(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    .line 1423
    .line 1424
    .line 1425
    new-instance v2, Lyc/b;

    .line 1426
    .line 1427
    invoke-direct {v2, v5, v4, v6}, Lyc/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1428
    .line 1429
    .line 1430
    new-instance v3, Lo1/c;

    .line 1431
    .line 1432
    const/16 v5, 0x11

    .line 1433
    .line 1434
    invoke-direct {v3, v4, v5}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 1435
    .line 1436
    .line 1437
    invoke-virtual {v0, v2, v3}, Lyc/g;->h(Ljava/lang/Runnable;Lyc/m;)V
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_a

    .line 1438
    .line 1439
    .line 1440
    goto :goto_2e

    .line 1441
    :catch_a
    move-exception v0

    .line 1442
    invoke-static {v0, v4}, Lq/s1;->g(Ljava/lang/Exception;Lyc/C;)V

    .line 1443
    .line 1444
    .line 1445
    :goto_2e
    return-void

    .line 1446
    :pswitch_1a
    new-instance v0, Ljava/util/ArrayList;

    .line 1447
    .line 1448
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1449
    .line 1450
    .line 1451
    :try_start_26
    iget-object v3, v15, Lq/s1;->a:Ljava/lang/Object;

    .line 1452
    .line 1453
    check-cast v3, Landroid/app/Activity;

    .line 1454
    .line 1455
    if-nez v3, :cond_1e

    .line 1456
    .line 1457
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_12

    .line 1458
    .line 1459
    goto :goto_2f

    .line 1460
    :cond_1e
    :try_start_27
    invoke-static {v3}, LBa/c;->u(Landroid/app/Activity;)Ljava/util/ArrayList;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v3
    :try_end_27
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_27 .. :try_end_27} :catch_b
    .catchall {:try_start_27 .. :try_end_27} :catchall_12

    .line 1464
    :goto_2f
    :try_start_28
    invoke-virtual {v0, v5, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1465
    .line 1466
    .line 1467
    goto :goto_31

    .line 1468
    :catchall_12
    move-exception v0

    .line 1469
    goto :goto_30

    .line 1470
    :catch_b
    move-exception v0

    .line 1471
    new-instance v3, Ljava/lang/RuntimeException;

    .line 1472
    .line 1473
    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1474
    .line 1475
    .line 1476
    throw v3
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_12

    .line 1477
    :goto_30
    invoke-static {v0}, LFe/b;->V(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v0

    .line 1481
    :goto_31
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1482
    .line 1483
    .line 1484
    return-void

    .line 1485
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
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
.end method
