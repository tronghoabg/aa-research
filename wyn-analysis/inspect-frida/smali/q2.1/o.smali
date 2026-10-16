.class public final Lq2/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:Landroid/view/Surface;

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:I

.field public i:J

.field public j:J

.field public k:J

.field public l:J

.field public m:J

.field public n:J

.field public o:J

.field public final p:Ljava/lang/Object;

.field public final q:Ljava/lang/Object;

.field public final r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 4

    .line 1
    iput p2, p0, Lq2/o;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p2, Lq2/b;

    .line 10
    .line 11
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Lq2/a;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, v1}, Lq2/a;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p2, Lq2/b;->d:Ljava/lang/Object;

    .line 21
    .line 22
    new-instance v0, Lq2/a;

    .line 23
    .line 24
    invoke-direct {v0, v1}, Lq2/a;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p2, Lq2/b;->e:Ljava/lang/Object;

    .line 28
    .line 29
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    iput-wide v0, p2, Lq2/b;->b:J

    .line 35
    .line 36
    iput-object p2, p0, Lq2/o;->p:Ljava/lang/Object;

    .line 37
    .line 38
    const/4 p2, 0x0

    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    :cond_0
    move-object v2, p2

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const-string v2, "display"

    .line 44
    .line 45
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Landroid/hardware/display/DisplayManager;

    .line 50
    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    new-instance v2, Lio/flutter/view/s;

    .line 54
    .line 55
    const/4 v3, 0x2

    .line 56
    invoke-direct {v2, p0, p1, v3}, Lio/flutter/view/s;-><init>(Ljava/lang/Object;Landroid/hardware/display/DisplayManager;I)V

    .line 57
    .line 58
    .line 59
    :goto_0
    iput-object v2, p0, Lq2/o;->q:Ljava/lang/Object;

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    sget-object p2, Lq2/n;->e:Lq2/n;

    .line 64
    .line 65
    :cond_2
    iput-object p2, p0, Lq2/o;->r:Ljava/lang/Object;

    .line 66
    .line 67
    iput-wide v0, p0, Lq2/o;->i:J

    .line 68
    .line 69
    iput-wide v0, p0, Lq2/o;->j:J

    .line 70
    .line 71
    const/high16 p1, -0x40800000    # -1.0f

    .line 72
    .line 73
    iput p1, p0, Lq2/o;->d:F

    .line 74
    .line 75
    const/high16 p1, 0x3f800000    # 1.0f

    .line 76
    .line 77
    iput p1, p0, Lq2/o;->g:F

    .line 78
    .line 79
    const/4 p1, 0x0

    .line 80
    iput p1, p0, Lq2/o;->h:I

    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    .line 85
    .line 86
    new-instance p2, Lq2/b;

    .line 87
    .line 88
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    new-instance v0, Lq2/a;

    .line 92
    .line 93
    const/4 v1, 0x1

    .line 94
    invoke-direct {v0, v1}, Lq2/a;-><init>(I)V

    .line 95
    .line 96
    .line 97
    iput-object v0, p2, Lq2/b;->d:Ljava/lang/Object;

    .line 98
    .line 99
    new-instance v0, Lq2/a;

    .line 100
    .line 101
    invoke-direct {v0, v1}, Lq2/a;-><init>(I)V

    .line 102
    .line 103
    .line 104
    iput-object v0, p2, Lq2/b;->e:Ljava/lang/Object;

    .line 105
    .line 106
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    iput-wide v0, p2, Lq2/b;->b:J

    .line 112
    .line 113
    iput-object p2, p0, Lq2/o;->p:Ljava/lang/Object;

    .line 114
    .line 115
    const/4 p2, 0x0

    .line 116
    if-eqz p1, :cond_4

    .line 117
    .line 118
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    sget v2, Lu6/v;->a:I

    .line 123
    .line 124
    const/16 v3, 0x11

    .line 125
    .line 126
    if-lt v2, v3, :cond_3

    .line 127
    .line 128
    const-string v2, "display"

    .line 129
    .line 130
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, Landroid/hardware/display/DisplayManager;

    .line 135
    .line 136
    if-eqz v2, :cond_3

    .line 137
    .line 138
    new-instance v3, Lio/flutter/view/s;

    .line 139
    .line 140
    invoke-direct {v3, v2}, Lio/flutter/view/s;-><init>(Landroid/hardware/display/DisplayManager;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_3
    move-object v3, p2

    .line 145
    :goto_1
    if-nez v3, :cond_5

    .line 146
    .line 147
    const-string v2, "window"

    .line 148
    .line 149
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, Landroid/view/WindowManager;

    .line 154
    .line 155
    if-eqz p1, :cond_4

    .line 156
    .line 157
    new-instance v3, Lv6/l;

    .line 158
    .line 159
    invoke-direct {v3, p1}, Lv6/l;-><init>(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_4
    move-object v3, p2

    .line 164
    :cond_5
    :goto_2
    iput-object v3, p0, Lq2/o;->q:Ljava/lang/Object;

    .line 165
    .line 166
    if-eqz v3, :cond_6

    .line 167
    .line 168
    sget-object p2, Lv6/m;->e:Lv6/m;

    .line 169
    .line 170
    :cond_6
    iput-object p2, p0, Lq2/o;->r:Ljava/lang/Object;

    .line 171
    .line 172
    iput-wide v0, p0, Lq2/o;->i:J

    .line 173
    .line 174
    iput-wide v0, p0, Lq2/o;->j:J

    .line 175
    .line 176
    const/high16 p1, -0x40800000    # -1.0f

    .line 177
    .line 178
    iput p1, p0, Lq2/o;->d:F

    .line 179
    .line 180
    const/high16 p1, 0x3f800000    # 1.0f

    .line 181
    .line 182
    iput p1, p0, Lq2/o;->g:F

    .line 183
    .line 184
    const/4 p1, 0x0

    .line 185
    iput p1, p0, Lq2/o;->h:I

    .line 186
    .line 187
    return-void

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public static a(Lq2/o;Landroid/view/Display;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/Display;->getRefreshRate()F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    float-to-double v0, p1

    .line 11
    const-wide v2, 0x41cdcd6500000000L    # 1.0E9

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    div-double/2addr v2, v0

    .line 17
    double-to-long v0, v2

    .line 18
    iput-wide v0, p0, Lq2/o;->i:J

    .line 19
    .line 20
    const-wide/16 v2, 0x50

    .line 21
    .line 22
    mul-long/2addr v0, v2

    .line 23
    const-wide/16 v2, 0x64

    .line 24
    .line 25
    div-long/2addr v0, v2

    .line 26
    iput-wide v0, p0, Lq2/o;->j:J

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    const-string p1, "VideoFrameReleaseHelper"

    .line 30
    .line 31
    const-string v0, "Unable to query display refresh rate"

    .line 32
    .line 33
    invoke-static {p1, v0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    iput-wide v0, p0, Lq2/o;->i:J

    .line 42
    .line 43
    iput-wide v0, p0, Lq2/o;->j:J

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    .line 1
    iget v0, p0, Lq2/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget v0, Lu6/v;->a:I

    .line 7
    .line 8
    const/16 v1, 0x1e

    .line 9
    .line 10
    if-lt v0, v1, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lq2/o;->c:Landroid/view/Surface;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget v1, p0, Lq2/o;->h:I

    .line 17
    .line 18
    const/high16 v2, -0x80000000

    .line 19
    .line 20
    if-eq v1, v2, :cond_1

    .line 21
    .line 22
    iget v1, p0, Lq2/o;->f:F

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    cmpl-float v1, v1, v2

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iput v2, p0, Lq2/o;->f:F

    .line 31
    .line 32
    invoke-static {v0, v2}, Lv6/j;->a(Landroid/view/Surface;F)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void

    .line 36
    :pswitch_0
    sget v0, LQ1/x;->a:I

    .line 37
    .line 38
    const/16 v1, 0x1e

    .line 39
    .line 40
    if-lt v0, v1, :cond_3

    .line 41
    .line 42
    iget-object v0, p0, Lq2/o;->c:Landroid/view/Surface;

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    iget v1, p0, Lq2/o;->h:I

    .line 47
    .line 48
    const/high16 v2, -0x80000000

    .line 49
    .line 50
    if-eq v1, v2, :cond_3

    .line 51
    .line 52
    iget v1, p0, Lq2/o;->f:F

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    cmpl-float v1, v1, v2

    .line 56
    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    iput v2, p0, Lq2/o;->f:F

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    :try_start_0
    invoke-static {v0, v2, v1}, Lk1/c0;->k(Landroid/view/Surface;FI)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catch_0
    move-exception v0

    .line 68
    const-string v1, "VideoFrameReleaseHelper"

    .line 69
    .line 70
    const-string v2, "Failed to call Surface.setFrameRate"

    .line 71
    .line 72
    invoke-static {v1, v2, v0}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    :goto_1
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()V
    .locals 9

    .line 1
    iget v0, p0, Lq2/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget v0, Lu6/v;->a:I

    .line 7
    .line 8
    const/16 v1, 0x1e

    .line 9
    .line 10
    if-lt v0, v1, :cond_9

    .line 11
    .line 12
    iget-object v0, p0, Lq2/o;->c:Landroid/view/Surface;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_5

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lq2/o;->p:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lq2/b;

    .line 21
    .line 22
    iget-object v2, v0, Lq2/b;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Lq2/a;

    .line 25
    .line 26
    invoke-virtual {v2}, Lq2/a;->a()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/high16 v3, -0x40800000    # -1.0f

    .line 31
    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    iget-object v2, v0, Lq2/b;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lq2/a;

    .line 37
    .line 38
    invoke-virtual {v2}, Lq2/a;->a()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    iget-object v2, v0, Lq2/b;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lq2/a;

    .line 47
    .line 48
    iget-wide v4, v2, Lq2/a;->f:J

    .line 49
    .line 50
    const-wide/16 v6, 0x0

    .line 51
    .line 52
    cmp-long v8, v4, v6

    .line 53
    .line 54
    if-nez v8, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iget-wide v6, v2, Lq2/a;->g:J

    .line 58
    .line 59
    div-long/2addr v6, v4

    .line 60
    :goto_0
    long-to-double v4, v6

    .line 61
    const-wide v6, 0x41cdcd6500000000L    # 1.0E9

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    div-double/2addr v6, v4

    .line 67
    double-to-float v2, v6

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move v2, v3

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    iget v2, p0, Lq2/o;->d:F

    .line 72
    .line 73
    :goto_1
    iget v4, p0, Lq2/o;->e:F

    .line 74
    .line 75
    cmpl-float v5, v2, v4

    .line 76
    .line 77
    if-nez v5, :cond_4

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_4
    cmpl-float v5, v2, v3

    .line 81
    .line 82
    if-eqz v5, :cond_7

    .line 83
    .line 84
    cmpl-float v3, v4, v3

    .line 85
    .line 86
    if-eqz v3, :cond_7

    .line 87
    .line 88
    iget-object v1, v0, Lq2/b;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Lq2/a;

    .line 91
    .line 92
    invoke-virtual {v1}, Lq2/a;->a()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_6

    .line 97
    .line 98
    iget-object v1, v0, Lq2/b;->d:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, Lq2/a;

    .line 101
    .line 102
    invoke-virtual {v1}, Lq2/a;->a()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_5

    .line 107
    .line 108
    iget-object v0, v0, Lq2/b;->d:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Lq2/a;

    .line 111
    .line 112
    iget-wide v0, v0, Lq2/a;->g:J

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    :goto_2
    const-wide v3, 0x12a05f200L

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    cmp-long v0, v0, v3

    .line 126
    .line 127
    if-ltz v0, :cond_6

    .line 128
    .line 129
    const v0, 0x3ca3d70a    # 0.02f

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 134
    .line 135
    :goto_3
    iget v1, p0, Lq2/o;->e:F

    .line 136
    .line 137
    sub-float v1, v2, v1

    .line 138
    .line 139
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    cmpl-float v0, v1, v0

    .line 144
    .line 145
    if-ltz v0, :cond_9

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_7
    if-eqz v5, :cond_8

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_8
    iget v0, v0, Lq2/b;->c:I

    .line 152
    .line 153
    if-lt v0, v1, :cond_9

    .line 154
    .line 155
    :goto_4
    iput v2, p0, Lq2/o;->e:F

    .line 156
    .line 157
    const/4 v0, 0x0

    .line 158
    invoke-virtual {p0, v0}, Lq2/o;->d(Z)V

    .line 159
    .line 160
    .line 161
    :cond_9
    :goto_5
    return-void

    .line 162
    :pswitch_0
    sget v0, LQ1/x;->a:I

    .line 163
    .line 164
    const/16 v1, 0x1e

    .line 165
    .line 166
    if-lt v0, v1, :cond_13

    .line 167
    .line 168
    iget-object v0, p0, Lq2/o;->c:Landroid/view/Surface;

    .line 169
    .line 170
    if-nez v0, :cond_a

    .line 171
    .line 172
    goto/16 :goto_b

    .line 173
    .line 174
    :cond_a
    iget-object v0, p0, Lq2/o;->p:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v0, Lq2/b;

    .line 177
    .line 178
    iget-object v2, v0, Lq2/b;->d:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v2, Lq2/a;

    .line 181
    .line 182
    invoke-virtual {v2}, Lq2/a;->a()Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    const/high16 v3, -0x40800000    # -1.0f

    .line 187
    .line 188
    if-eqz v2, :cond_d

    .line 189
    .line 190
    iget-object v2, v0, Lq2/b;->d:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v2, Lq2/a;

    .line 193
    .line 194
    invoke-virtual {v2}, Lq2/a;->a()Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_c

    .line 199
    .line 200
    iget-object v2, v0, Lq2/b;->d:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v2, Lq2/a;

    .line 203
    .line 204
    iget-wide v4, v2, Lq2/a;->f:J

    .line 205
    .line 206
    const-wide/16 v6, 0x0

    .line 207
    .line 208
    cmp-long v8, v4, v6

    .line 209
    .line 210
    if-nez v8, :cond_b

    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_b
    iget-wide v6, v2, Lq2/a;->g:J

    .line 214
    .line 215
    div-long/2addr v6, v4

    .line 216
    :goto_6
    long-to-double v4, v6

    .line 217
    const-wide v6, 0x41cdcd6500000000L    # 1.0E9

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    div-double/2addr v6, v4

    .line 223
    double-to-float v2, v6

    .line 224
    goto :goto_7

    .line 225
    :cond_c
    move v2, v3

    .line 226
    goto :goto_7

    .line 227
    :cond_d
    iget v2, p0, Lq2/o;->d:F

    .line 228
    .line 229
    :goto_7
    iget v4, p0, Lq2/o;->e:F

    .line 230
    .line 231
    cmpl-float v5, v2, v4

    .line 232
    .line 233
    if-nez v5, :cond_e

    .line 234
    .line 235
    goto :goto_b

    .line 236
    :cond_e
    cmpl-float v5, v2, v3

    .line 237
    .line 238
    if-eqz v5, :cond_11

    .line 239
    .line 240
    cmpl-float v3, v4, v3

    .line 241
    .line 242
    if-eqz v3, :cond_11

    .line 243
    .line 244
    iget-object v1, v0, Lq2/b;->d:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v1, Lq2/a;

    .line 247
    .line 248
    invoke-virtual {v1}, Lq2/a;->a()Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    if-eqz v1, :cond_10

    .line 253
    .line 254
    iget-object v1, v0, Lq2/b;->d:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v1, Lq2/a;

    .line 257
    .line 258
    invoke-virtual {v1}, Lq2/a;->a()Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-eqz v1, :cond_f

    .line 263
    .line 264
    iget-object v0, v0, Lq2/b;->d:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v0, Lq2/a;

    .line 267
    .line 268
    iget-wide v0, v0, Lq2/a;->g:J

    .line 269
    .line 270
    goto :goto_8

    .line 271
    :cond_f
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    :goto_8
    const-wide v3, 0x12a05f200L

    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    cmp-long v0, v0, v3

    .line 282
    .line 283
    if-ltz v0, :cond_10

    .line 284
    .line 285
    const v0, 0x3ca3d70a    # 0.02f

    .line 286
    .line 287
    .line 288
    goto :goto_9

    .line 289
    :cond_10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 290
    .line 291
    :goto_9
    iget v1, p0, Lq2/o;->e:F

    .line 292
    .line 293
    sub-float v1, v2, v1

    .line 294
    .line 295
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    cmpl-float v0, v1, v0

    .line 300
    .line 301
    if-ltz v0, :cond_13

    .line 302
    .line 303
    goto :goto_a

    .line 304
    :cond_11
    if-eqz v5, :cond_12

    .line 305
    .line 306
    goto :goto_a

    .line 307
    :cond_12
    iget v0, v0, Lq2/b;->c:I

    .line 308
    .line 309
    if-lt v0, v1, :cond_13

    .line 310
    .line 311
    :goto_a
    iput v2, p0, Lq2/o;->e:F

    .line 312
    .line 313
    const/4 v0, 0x0

    .line 314
    invoke-virtual {p0, v0}, Lq2/o;->d(Z)V

    .line 315
    .line 316
    .line 317
    :cond_13
    :goto_b
    return-void

    .line 318
    nop

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Z)V
    .locals 4

    .line 1
    iget v0, p0, Lq2/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget v0, Lu6/v;->a:I

    .line 7
    .line 8
    const/16 v1, 0x1e

    .line 9
    .line 10
    if-lt v0, v1, :cond_3

    .line 11
    .line 12
    iget-object v0, p0, Lq2/o;->c:Landroid/view/Surface;

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    iget v1, p0, Lq2/o;->h:I

    .line 17
    .line 18
    const/high16 v2, -0x80000000

    .line 19
    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    iget-boolean v1, p0, Lq2/o;->b:Z

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget v1, p0, Lq2/o;->e:F

    .line 28
    .line 29
    const/high16 v2, -0x40800000    # -1.0f

    .line 30
    .line 31
    cmpl-float v2, v1, v2

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    iget v2, p0, Lq2/o;->g:F

    .line 36
    .line 37
    mul-float/2addr v1, v2

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v1, 0x0

    .line 40
    :goto_0
    if-nez p1, :cond_2

    .line 41
    .line 42
    iget p1, p0, Lq2/o;->f:F

    .line 43
    .line 44
    cmpl-float p1, p1, v1

    .line 45
    .line 46
    if-nez p1, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    iput v1, p0, Lq2/o;->f:F

    .line 50
    .line 51
    invoke-static {v0, v1}, Lv6/j;->a(Landroid/view/Surface;F)V

    .line 52
    .line 53
    .line 54
    :cond_3
    :goto_1
    return-void

    .line 55
    :pswitch_0
    sget v0, LQ1/x;->a:I

    .line 56
    .line 57
    const/16 v1, 0x1e

    .line 58
    .line 59
    if-lt v0, v1, :cond_8

    .line 60
    .line 61
    iget-object v0, p0, Lq2/o;->c:Landroid/view/Surface;

    .line 62
    .line 63
    if-eqz v0, :cond_8

    .line 64
    .line 65
    iget v1, p0, Lq2/o;->h:I

    .line 66
    .line 67
    const/high16 v2, -0x80000000

    .line 68
    .line 69
    if-ne v1, v2, :cond_4

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_4
    iget-boolean v1, p0, Lq2/o;->b:Z

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    iget v1, p0, Lq2/o;->e:F

    .line 78
    .line 79
    const/high16 v3, -0x40800000    # -1.0f

    .line 80
    .line 81
    cmpl-float v3, v1, v3

    .line 82
    .line 83
    if-eqz v3, :cond_5

    .line 84
    .line 85
    iget v3, p0, Lq2/o;->g:F

    .line 86
    .line 87
    mul-float/2addr v1, v3

    .line 88
    goto :goto_2

    .line 89
    :cond_5
    move v1, v2

    .line 90
    :goto_2
    if-nez p1, :cond_6

    .line 91
    .line 92
    iget p1, p0, Lq2/o;->f:F

    .line 93
    .line 94
    cmpl-float p1, p1, v1

    .line 95
    .line 96
    if-nez p1, :cond_6

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_6
    iput v1, p0, Lq2/o;->f:F

    .line 100
    .line 101
    cmpl-float p1, v1, v2

    .line 102
    .line 103
    if-nez p1, :cond_7

    .line 104
    .line 105
    const/4 p1, 0x0

    .line 106
    goto :goto_3

    .line 107
    :cond_7
    const/4 p1, 0x1

    .line 108
    :goto_3
    :try_start_0
    invoke-static {v0, v1, p1}, Lk1/c0;->k(Landroid/view/Surface;FI)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :catch_0
    move-exception p1

    .line 113
    const-string v0, "VideoFrameReleaseHelper"

    .line 114
    .line 115
    const-string v1, "Failed to call Surface.setFrameRate"

    .line 116
    .line 117
    invoke-static {v0, v1, p1}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    :cond_8
    :goto_4
    return-void

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
