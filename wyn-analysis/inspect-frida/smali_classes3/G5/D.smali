.class public final LG5/D;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LE5/T;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:[LG5/m;


# direct methods
.method public constructor <init>(LE5/T;IIIIIII[LG5/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LG5/D;->a:LE5/T;

    .line 5
    .line 6
    iput p2, p0, LG5/D;->b:I

    .line 7
    .line 8
    iput p3, p0, LG5/D;->c:I

    .line 9
    .line 10
    iput p4, p0, LG5/D;->d:I

    .line 11
    .line 12
    iput p5, p0, LG5/D;->e:I

    .line 13
    .line 14
    iput p6, p0, LG5/D;->f:I

    .line 15
    .line 16
    iput p7, p0, LG5/D;->g:I

    .line 17
    .line 18
    iput p8, p0, LG5/D;->h:I

    .line 19
    .line 20
    iput-object p9, p0, LG5/D;->i:[LG5/m;

    .line 21
    .line 22
    return-void
.end method

.method public static c(LG5/h;Z)Landroid/media/AudioAttributes;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/media/AudioAttributes$Builder;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x3

    .line 9
    invoke-virtual {p0, p1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/16 p1, 0x10

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    invoke-virtual {p0}, LG5/h;->a()LA/e0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget-object p0, p0, LA/e0;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Landroid/media/AudioAttributes;

    .line 36
    .line 37
    return-object p0
.end method


# virtual methods
.method public final a(ZLG5/h;I)Landroid/media/AudioTrack;
    .locals 12

    .line 1
    iget v1, p0, LG5/D;->c:I

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, LG5/D;->b(ZLG5/h;I)Landroid/media/AudioTrack;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 9
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getState()I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    if-ne v5, v3, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Landroid/media/AudioTrack;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 17
    .line 18
    .line 19
    :catch_0
    new-instance v4, LG5/r;

    .line 20
    .line 21
    if-ne v1, v3, :cond_1

    .line 22
    .line 23
    move v10, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v10, v2

    .line 26
    :goto_0
    iget v8, p0, LG5/D;->h:I

    .line 27
    .line 28
    iget-object v9, p0, LG5/D;->a:LE5/T;

    .line 29
    .line 30
    iget v6, p0, LG5/D;->e:I

    .line 31
    .line 32
    iget v7, p0, LG5/D;->f:I

    .line 33
    .line 34
    const/4 v11, 0x0

    .line 35
    invoke-direct/range {v4 .. v11}, LG5/r;-><init>(IIIILE5/T;ZLjava/lang/RuntimeException;)V

    .line 36
    .line 37
    .line 38
    throw v4

    .line 39
    :catch_1
    move-exception v0

    .line 40
    :goto_1
    move-object p1, v0

    .line 41
    move-object v11, p1

    .line 42
    goto :goto_2

    .line 43
    :catch_2
    move-exception v0

    .line 44
    goto :goto_1

    .line 45
    :goto_2
    new-instance v4, LG5/r;

    .line 46
    .line 47
    if-ne v1, v3, :cond_2

    .line 48
    .line 49
    move v10, v3

    .line 50
    goto :goto_3

    .line 51
    :cond_2
    move v10, v2

    .line 52
    :goto_3
    iget v7, p0, LG5/D;->f:I

    .line 53
    .line 54
    iget v8, p0, LG5/D;->h:I

    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    iget v6, p0, LG5/D;->e:I

    .line 58
    .line 59
    iget-object v9, p0, LG5/D;->a:LE5/T;

    .line 60
    .line 61
    invoke-direct/range {v4 .. v11}, LG5/r;-><init>(IIIILE5/T;ZLjava/lang/RuntimeException;)V

    .line 62
    .line 63
    .line 64
    throw v4
.end method

.method public final b(ZLG5/h;I)Landroid/media/AudioTrack;
    .locals 8

    .line 1
    sget v2, Lu6/v;->a:I

    .line 2
    .line 3
    const/16 v3, 0x1d

    .line 4
    .line 5
    iget v4, p0, LG5/D;->g:I

    .line 6
    .line 7
    iget v6, p0, LG5/D;->f:I

    .line 8
    .line 9
    iget v7, p0, LG5/D;->e:I

    .line 10
    .line 11
    if-lt v2, v3, :cond_1

    .line 12
    .line 13
    invoke-static {v7, v6, v4}, LG5/G;->e(III)Landroid/media/AudioFormat;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {p2, p1}, LG5/D;->c(LG5/h;Z)Landroid/media/AudioAttributes;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Landroid/media/AudioTrack$Builder;

    .line 22
    .line 23
    invoke-direct {v1}, Landroid/media/AudioTrack$Builder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Landroid/media/AudioTrack$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioTrack$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, v2}, Landroid/media/AudioTrack$Builder;->setAudioFormat(Landroid/media/AudioFormat;)Landroid/media/AudioTrack$Builder;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-virtual {v0, v1}, Landroid/media/AudioTrack$Builder;->setTransferMode(I)Landroid/media/AudioTrack$Builder;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget v2, p0, LG5/D;->h:I

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Landroid/media/AudioTrack$Builder;->setBufferSizeInBytes(I)Landroid/media/AudioTrack$Builder;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0, p3}, Landroid/media/AudioTrack$Builder;->setSessionId(I)Landroid/media/AudioTrack$Builder;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget v2, p0, LG5/D;->c:I

    .line 50
    .line 51
    if-ne v2, v1, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const/4 v1, 0x0

    .line 55
    :goto_0
    invoke-static {v0, v1}, LG5/d;->e(Landroid/media/AudioTrack$Builder;Z)Landroid/media/AudioTrack$Builder;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Landroid/media/AudioTrack$Builder;->build()Landroid/media/AudioTrack;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0

    .line 64
    :cond_1
    const/16 v3, 0x15

    .line 65
    .line 66
    if-lt v2, v3, :cond_2

    .line 67
    .line 68
    new-instance v2, Landroid/media/AudioTrack;

    .line 69
    .line 70
    invoke-static {p2, p1}, LG5/D;->c(LG5/h;Z)Landroid/media/AudioAttributes;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v7, v6, v4}, LG5/G;->e(III)Landroid/media/AudioFormat;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget v3, p0, LG5/D;->h:I

    .line 79
    .line 80
    const/4 v4, 0x1

    .line 81
    move-object v5, v2

    .line 82
    move-object v2, v0

    .line 83
    move-object v0, v5

    .line 84
    move v5, p3

    .line 85
    invoke-direct/range {v0 .. v5}, Landroid/media/AudioTrack;-><init>(Landroid/media/AudioAttributes;Landroid/media/AudioFormat;III)V

    .line 86
    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_2
    iget v0, p2, LG5/h;->c:I

    .line 90
    .line 91
    invoke-static {v0}, Lu6/v;->q(I)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez p3, :cond_3

    .line 96
    .line 97
    move v2, v1

    .line 98
    new-instance v1, Landroid/media/AudioTrack;

    .line 99
    .line 100
    iget v6, p0, LG5/D;->h:I

    .line 101
    .line 102
    const/4 v7, 0x1

    .line 103
    iget v3, p0, LG5/D;->e:I

    .line 104
    .line 105
    iget v4, p0, LG5/D;->f:I

    .line 106
    .line 107
    iget v5, p0, LG5/D;->g:I

    .line 108
    .line 109
    invoke-direct/range {v1 .. v7}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    .line 110
    .line 111
    .line 112
    return-object v1

    .line 113
    :cond_3
    move v2, v1

    .line 114
    new-instance v0, Landroid/media/AudioTrack;

    .line 115
    .line 116
    iget v5, p0, LG5/D;->h:I

    .line 117
    .line 118
    const/4 v6, 0x1

    .line 119
    iget v2, p0, LG5/D;->e:I

    .line 120
    .line 121
    iget v3, p0, LG5/D;->f:I

    .line 122
    .line 123
    iget v4, p0, LG5/D;->g:I

    .line 124
    .line 125
    move v7, p3

    .line 126
    invoke-direct/range {v0 .. v7}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    .line 127
    .line 128
    .line 129
    return-object v0
.end method
