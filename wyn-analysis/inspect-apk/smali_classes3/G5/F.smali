.class public final LG5/F;
.super Landroid/media/AudioTrack$StreamEventCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LG5/F;->a:I

    iput-object p1, p0, LG5/F;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/media/AudioTrack$StreamEventCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDataRequest(Landroid/media/AudioTrack;I)V
    .locals 0

    .line 1
    iget p2, p0, LG5/F;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, LG5/F;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p2, LG9/e;

    .line 9
    .line 10
    iget-object p2, p2, LG9/e;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p2, LW1/t;

    .line 13
    .line 14
    iget-object p2, p2, LW1/t;->v:Landroid/media/AudioTrack;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, LG5/F;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, LG9/e;

    .line 26
    .line 27
    iget-object p1, p1, LG9/e;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LW1/t;

    .line 30
    .line 31
    iget-object p2, p1, LW1/t;->r:Lxa/d;

    .line 32
    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    iget-boolean p1, p1, LW1/t;->V:Z

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-object p1, p2, Lxa/d;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, LW1/v;

    .line 42
    .line 43
    iget-object p1, p1, Ld2/q;->F:LU1/v;

    .line 44
    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p1}, LU1/v;->a()V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void

    .line 51
    :pswitch_0
    iget-object p2, p0, LG5/F;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p2, Lb7/k;

    .line 54
    .line 55
    iget-object p2, p2, Lb7/k;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p2, LG5/G;

    .line 58
    .line 59
    iget-object p2, p2, LG5/G;->u:Landroid/media/AudioTrack;

    .line 60
    .line 61
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-nez p1, :cond_2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    iget-object p1, p0, LG5/F;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Lb7/k;

    .line 71
    .line 72
    iget-object p1, p1, Lb7/k;->d:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, LG5/G;

    .line 75
    .line 76
    iget-object p2, p1, LG5/G;->r:Ly3/j;

    .line 77
    .line 78
    if-eqz p2, :cond_3

    .line 79
    .line 80
    iget-boolean p1, p1, LG5/G;->U:Z

    .line 81
    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    iget-object p1, p2, Ly3/j;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, LG5/K;

    .line 87
    .line 88
    iget-object p1, p1, LG5/K;->O0:LE5/K;

    .line 89
    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    iget-object p1, p1, LE5/K;->a:LE5/O;

    .line 93
    .line 94
    iget-object p1, p1, LE5/O;->h:Lu6/s;

    .line 95
    .line 96
    const/4 p2, 0x2

    .line 97
    invoke-virtual {p1, p2}, Lu6/s;->c(I)Z

    .line 98
    .line 99
    .line 100
    :cond_3
    :goto_1
    return-void

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onPresentationEnded(Landroid/media/AudioTrack;)V
    .locals 1

    .line 1
    iget v0, p0, LG5/F;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/media/AudioTrack$StreamEventCallback;->onPresentationEnded(Landroid/media/AudioTrack;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, LG5/F;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LG9/e;

    .line 13
    .line 14
    iget-object v0, v0, LG9/e;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LW1/t;

    .line 17
    .line 18
    iget-object v0, v0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object p1, p0, LG5/F;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LG9/e;

    .line 30
    .line 31
    iget-object p1, p1, LG9/e;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, LW1/t;

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p1, LW1/t;->U:Z

    .line 37
    .line 38
    :goto_0
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final onTearDown(Landroid/media/AudioTrack;)V
    .locals 1

    .line 1
    iget v0, p0, LG5/F;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LG5/F;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LG9/e;

    .line 9
    .line 10
    iget-object v0, v0, LG9/e;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LW1/t;

    .line 13
    .line 14
    iget-object v0, v0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, LG5/F;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, LG9/e;

    .line 26
    .line 27
    iget-object p1, p1, LG9/e;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LW1/t;

    .line 30
    .line 31
    iget-object v0, p1, LW1/t;->r:Lxa/d;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-boolean p1, p1, LW1/t;->V:Z

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lxa/d;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, LW1/v;

    .line 42
    .line 43
    iget-object p1, p1, Ld2/q;->F:LU1/v;

    .line 44
    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p1}, LU1/v;->a()V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void

    .line 51
    :pswitch_0
    iget-object v0, p0, LG5/F;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lb7/k;

    .line 54
    .line 55
    iget-object v0, v0, Lb7/k;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, LG5/G;

    .line 58
    .line 59
    iget-object v0, v0, LG5/G;->u:Landroid/media/AudioTrack;

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-nez p1, :cond_2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    iget-object p1, p0, LG5/F;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Lb7/k;

    .line 71
    .line 72
    iget-object p1, p1, Lb7/k;->d:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, LG5/G;

    .line 75
    .line 76
    iget-object v0, p1, LG5/G;->r:Ly3/j;

    .line 77
    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    iget-boolean p1, p1, LG5/G;->U:Z

    .line 81
    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    iget-object p1, v0, Ly3/j;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, LG5/K;

    .line 87
    .line 88
    iget-object p1, p1, LG5/K;->O0:LE5/K;

    .line 89
    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    iget-object p1, p1, LE5/K;->a:LE5/O;

    .line 93
    .line 94
    iget-object p1, p1, LE5/O;->h:Lu6/s;

    .line 95
    .line 96
    const/4 v0, 0x2

    .line 97
    invoke-virtual {p1, v0}, Lu6/s;->c(I)Z

    .line 98
    .line 99
    .line 100
    :cond_3
    :goto_1
    return-void

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
