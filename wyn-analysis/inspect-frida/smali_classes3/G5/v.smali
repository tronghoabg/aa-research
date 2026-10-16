.class public final LG5/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:J

.field public d:J

.field public e:J

.field public f:J

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/media/AudioTrack;I)V
    .locals 1

    .line 1
    iput p2, p0, LG5/v;->a:I

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
    sget p2, Lu6/v;->a:I

    .line 10
    .line 11
    const/16 v0, 0x13

    .line 12
    .line 13
    if-lt p2, v0, :cond_0

    .line 14
    .line 15
    new-instance p2, LG5/u;

    .line 16
    .line 17
    invoke-direct {p2, p1}, LG5/u;-><init>(Landroid/media/AudioTrack;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, LG5/v;->g:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {p0}, LG5/v;->a()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, LG5/v;->g:Ljava/lang/Object;

    .line 28
    .line 29
    const/4 p1, 0x3

    .line 30
    invoke-virtual {p0, p1}, LG5/v;->b(I)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-void

    .line 34
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance p2, LW1/k;

    .line 38
    .line 39
    invoke-direct {p2, p1}, LW1/k;-><init>(Landroid/media/AudioTrack;)V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, LG5/v;->g:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {p0}, LG5/v;->a()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget v0, p0, LG5/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LG5/v;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LW1/k;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, LG5/v;->b(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void

    .line 17
    :pswitch_0
    iget-object v0, p0, LG5/v;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, LG5/u;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, v0}, LG5/v;->b(I)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(I)V
    .locals 6

    .line 1
    iget v0, p0, LG5/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iput p1, p0, LG5/v;->b:I

    .line 7
    .line 8
    const-wide/16 v0, 0x2710

    .line 9
    .line 10
    if-eqz p1, :cond_3

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq p1, v2, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x3

    .line 19
    if-eq p1, v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x4

    .line 22
    if-ne p1, v0, :cond_0

    .line 23
    .line 24
    const-wide/32 v0, 0x7a120

    .line 25
    .line 26
    .line 27
    iput-wide v0, p0, LG5/v;->d:J

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    const-wide/32 v0, 0x989680

    .line 37
    .line 38
    .line 39
    iput-wide v0, p0, LG5/v;->d:J

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    iput-wide v0, p0, LG5/v;->d:J

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    const-wide/16 v2, 0x0

    .line 46
    .line 47
    iput-wide v2, p0, LG5/v;->e:J

    .line 48
    .line 49
    const-wide/16 v2, -0x1

    .line 50
    .line 51
    iput-wide v2, p0, LG5/v;->f:J

    .line 52
    .line 53
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    const-wide/16 v4, 0x3e8

    .line 58
    .line 59
    div-long/2addr v2, v4

    .line 60
    iput-wide v2, p0, LG5/v;->c:J

    .line 61
    .line 62
    iput-wide v0, p0, LG5/v;->d:J

    .line 63
    .line 64
    :goto_0
    return-void

    .line 65
    :pswitch_0
    iput p1, p0, LG5/v;->b:I

    .line 66
    .line 67
    const-wide/16 v0, 0x2710

    .line 68
    .line 69
    if-eqz p1, :cond_7

    .line 70
    .line 71
    const/4 v2, 0x1

    .line 72
    if-eq p1, v2, :cond_6

    .line 73
    .line 74
    const/4 v0, 0x2

    .line 75
    if-eq p1, v0, :cond_5

    .line 76
    .line 77
    const/4 v0, 0x3

    .line 78
    if-eq p1, v0, :cond_5

    .line 79
    .line 80
    const/4 v0, 0x4

    .line 81
    if-ne p1, v0, :cond_4

    .line 82
    .line 83
    const-wide/32 v0, 0x7a120

    .line 84
    .line 85
    .line 86
    iput-wide v0, p0, LG5/v;->d:J

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_5
    const-wide/32 v0, 0x989680

    .line 96
    .line 97
    .line 98
    iput-wide v0, p0, LG5/v;->d:J

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_6
    iput-wide v0, p0, LG5/v;->d:J

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_7
    const-wide/16 v2, 0x0

    .line 105
    .line 106
    iput-wide v2, p0, LG5/v;->e:J

    .line 107
    .line 108
    const-wide/16 v2, -0x1

    .line 109
    .line 110
    iput-wide v2, p0, LG5/v;->f:J

    .line 111
    .line 112
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 113
    .line 114
    .line 115
    move-result-wide v2

    .line 116
    const-wide/16 v4, 0x3e8

    .line 117
    .line 118
    div-long/2addr v2, v4

    .line 119
    iput-wide v2, p0, LG5/v;->c:J

    .line 120
    .line 121
    iput-wide v0, p0, LG5/v;->d:J

    .line 122
    .line 123
    :goto_1
    return-void

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
