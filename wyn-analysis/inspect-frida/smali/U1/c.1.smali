.class public final LU1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lk8/p;

.field public final b:LE5/d;

.field public c:LU1/r;

.field public d:LN1/c;

.field public e:I

.field public f:I

.field public g:F

.field public h:Landroid/media/AudioFocusRequest;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;LU1/r;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, LU1/c;->g:F

    .line 7
    .line 8
    new-instance v0, LE5/p;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p1, v1}, LE5/p;-><init>(Landroid/content/Context;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, LS3/f;->z(Lk8/p;)Lk8/p;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, LU1/c;->a:Lk8/p;

    .line 19
    .line 20
    iput-object p3, p0, LU1/c;->c:LU1/r;

    .line 21
    .line 22
    new-instance p1, LE5/d;

    .line 23
    .line 24
    const/4 p3, 0x1

    .line 25
    invoke-direct {p1, p0, p2, p3}, LE5/d;-><init>(Ljava/lang/Object;Landroid/os/Handler;I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, LU1/c;->b:LE5/d;

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    iput p1, p0, LU1/c;->e:I

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget v0, p0, LU1/c;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget v0, LQ1/x;->a:I

    .line 10
    .line 11
    const/16 v1, 0x1a

    .line 12
    .line 13
    iget-object v2, p0, LU1/c;->a:Lk8/p;

    .line 14
    .line 15
    if-lt v0, v1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, LU1/c;->h:Landroid/media/AudioFocusRequest;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-interface {v2}, Lk8/p;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/media/AudioManager;

    .line 26
    .line 27
    iget-object v1, p0, LU1/c;->h:Landroid/media/AudioFocusRequest;

    .line 28
    .line 29
    invoke-static {v0, v1}, LU1/b;->r(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    invoke-interface {v2}, Lk8/p;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Landroid/media/AudioManager;

    .line 38
    .line 39
    iget-object v1, p0, LU1/c;->b:LE5/d;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 42
    .line 43
    .line 44
    :cond_2
    :goto_0
    return-void
.end method

.method public final b(LN1/c;)V
    .locals 6

    .line 1
    iget-object v0, p0, LU1/c;->d:LN1/c;

    .line 2
    .line 3
    sget v1, LQ1/x;->a:I

    .line 4
    .line 5
    invoke-static {v0, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_4

    .line 10
    .line 11
    iput-object p1, p0, LU1/c;->d:LN1/c;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    :goto_0
    :pswitch_0
    move v2, v0

    .line 18
    goto :goto_2

    .line 19
    :cond_0
    const/4 v2, 0x3

    .line 20
    const/4 v3, 0x2

    .line 21
    const-string v4, "AudioFocusManager"

    .line 22
    .line 23
    iget v5, p1, LN1/c;->c:I

    .line 24
    .line 25
    packed-switch v5, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    :pswitch_1
    const-string p1, "Unidentified audio usage: "

    .line 29
    .line 30
    invoke-static {v5, p1, v4}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_2
    const/4 v2, 0x4

    .line 35
    goto :goto_2

    .line 36
    :pswitch_3
    iget p1, p1, LN1/c;->a:I

    .line 37
    .line 38
    if-ne p1, v1, :cond_1

    .line 39
    .line 40
    :pswitch_4
    move v2, v3

    .line 41
    goto :goto_2

    .line 42
    :goto_1
    :pswitch_5
    move v2, v1

    .line 43
    goto :goto_2

    .line 44
    :pswitch_6
    const-string p1, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."

    .line 45
    .line 46
    invoke-static {v4, p1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_2
    :pswitch_7
    iput v2, p0, LU1/c;->f:I

    .line 51
    .line 52
    if-eq v2, v1, :cond_2

    .line 53
    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    :cond_2
    move v0, v1

    .line 57
    :cond_3
    const-string p1, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."

    .line 58
    .line 59
    invoke-static {p1, v0}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    :cond_4
    return-void

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_4
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_3
        :pswitch_7
        :pswitch_7
        :pswitch_5
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final c(I)V
    .locals 3

    .line 1
    iget v0, p0, LU1/c;->e:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iput p1, p0, LU1/c;->e:I

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    if-ne p1, v0, :cond_1

    .line 10
    .line 11
    const p1, 0x3e4ccccd    # 0.2f

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 16
    .line 17
    :goto_0
    iget v0, p0, LU1/c;->g:F

    .line 18
    .line 19
    cmpl-float v0, v0, p1

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    iput p1, p0, LU1/c;->g:F

    .line 25
    .line 26
    iget-object p1, p0, LU1/c;->c:LU1/r;

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    iget-object p1, p1, LU1/r;->a:LU1/u;

    .line 31
    .line 32
    iget v0, p1, LU1/u;->V:F

    .line 33
    .line 34
    iget-object v1, p1, LU1/u;->y:LU1/c;

    .line 35
    .line 36
    iget v1, v1, LU1/c;->g:F

    .line 37
    .line 38
    mul-float/2addr v0, v1

    .line 39
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/4 v1, 0x1

    .line 44
    const/4 v2, 0x2

    .line 45
    invoke-virtual {p1, v1, v2, v0}, LU1/u;->D0(IILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    :goto_1
    return-void
.end method

.method public final d(IZ)I
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eq p1, v0, :cond_a

    .line 4
    .line 5
    iget p1, p0, LU1/c;->f:I

    .line 6
    .line 7
    if-ne p1, v0, :cond_a

    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    const/4 v2, -0x1

    .line 11
    if-eqz p2, :cond_7

    .line 12
    .line 13
    iget p2, p0, LU1/c;->e:I

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    if-ne p2, v3, :cond_0

    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    sget p2, LQ1/x;->a:I

    .line 21
    .line 22
    const/16 v4, 0x1a

    .line 23
    .line 24
    iget-object v5, p0, LU1/c;->a:Lk8/p;

    .line 25
    .line 26
    iget-object v6, p0, LU1/c;->b:LE5/d;

    .line 27
    .line 28
    if-lt p2, v4, :cond_4

    .line 29
    .line 30
    iget-object p1, p0, LU1/c;->h:Landroid/media/AudioFocusRequest;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    if-nez p1, :cond_2

    .line 36
    .line 37
    invoke-static {}, LA0/h;->m()V

    .line 38
    .line 39
    .line 40
    iget p1, p0, LU1/c;->f:I

    .line 41
    .line 42
    invoke-static {p1}, LA0/h;->f(I)Landroid/media/AudioFocusRequest$Builder;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static {}, LA0/h;->m()V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, LU1/c;->h:Landroid/media/AudioFocusRequest;

    .line 51
    .line 52
    invoke-static {p1}, LA0/h;->j(Landroid/media/AudioFocusRequest;)Landroid/media/AudioFocusRequest$Builder;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :goto_0
    iget-object p2, p0, LU1/c;->d:LN1/c;

    .line 57
    .line 58
    if-eqz p2, :cond_3

    .line 59
    .line 60
    iget v4, p2, LN1/c;->a:I

    .line 61
    .line 62
    if-ne v4, v0, :cond_3

    .line 63
    .line 64
    move v1, v0

    .line 65
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, LN1/c;->a()Ly3/j;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    iget-object p2, p2, Ly3/j;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p2, Landroid/media/AudioAttributes;

    .line 75
    .line 76
    invoke-static {p1, p2}, LA0/h;->g(Landroid/media/AudioFocusRequest$Builder;Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1, v1}, LA0/h;->i(Landroid/media/AudioFocusRequest$Builder;Z)Landroid/media/AudioFocusRequest$Builder;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1, v6}, LA0/h;->h(Landroid/media/AudioFocusRequest$Builder;Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, LA0/h;->k(Landroid/media/AudioFocusRequest$Builder;)Landroid/media/AudioFocusRequest;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, p0, LU1/c;->h:Landroid/media/AudioFocusRequest;

    .line 93
    .line 94
    :goto_1
    invoke-interface {v5}, Lk8/p;->get()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Landroid/media/AudioManager;

    .line 99
    .line 100
    iget-object p2, p0, LU1/c;->h:Landroid/media/AudioFocusRequest;

    .line 101
    .line 102
    invoke-static {p1, p2}, LA0/h;->b(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    goto :goto_3

    .line 107
    :cond_4
    invoke-interface {v5}, Lk8/p;->get()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    check-cast p2, Landroid/media/AudioManager;

    .line 112
    .line 113
    iget-object v4, p0, LU1/c;->d:LN1/c;

    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    const/16 v5, 0xd

    .line 119
    .line 120
    iget v4, v4, LN1/c;->c:I

    .line 121
    .line 122
    if-eq v4, v5, :cond_5

    .line 123
    .line 124
    packed-switch v4, :pswitch_data_0

    .line 125
    .line 126
    .line 127
    move v1, p1

    .line 128
    goto :goto_2

    .line 129
    :pswitch_0
    move v1, v3

    .line 130
    goto :goto_2

    .line 131
    :pswitch_1
    const/4 v1, 0x5

    .line 132
    goto :goto_2

    .line 133
    :pswitch_2
    const/4 v1, 0x4

    .line 134
    goto :goto_2

    .line 135
    :pswitch_3
    const/16 v1, 0x8

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    move v1, v0

    .line 139
    :goto_2
    :pswitch_4
    iget p1, p0, LU1/c;->f:I

    .line 140
    .line 141
    invoke-virtual {p2, v6, v1, p1}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    :goto_3
    if-ne p1, v0, :cond_6

    .line 146
    .line 147
    invoke-virtual {p0, v3}, LU1/c;->c(I)V

    .line 148
    .line 149
    .line 150
    return v0

    .line 151
    :cond_6
    invoke-virtual {p0, v0}, LU1/c;->c(I)V

    .line 152
    .line 153
    .line 154
    return v2

    .line 155
    :cond_7
    iget p2, p0, LU1/c;->e:I

    .line 156
    .line 157
    if-eq p2, v0, :cond_9

    .line 158
    .line 159
    if-eq p2, p1, :cond_8

    .line 160
    .line 161
    :goto_4
    return v0

    .line 162
    :cond_8
    return v1

    .line 163
    :cond_9
    return v2

    .line 164
    :cond_a
    invoke-virtual {p0}, LU1/c;->a()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, v1}, LU1/c;->c(I)V

    .line 168
    .line 169
    .line 170
    return v0

    .line 171
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
