.class public final LVa/q;
.super LVa/eb;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/q;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, LVa/q;->a:I

    iput-object p1, p0, LVa/q;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget p1, p0, LVa/q;->a:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :sswitch_0
    new-instance p1, LVa/Wa;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p1, v0}, LVa/Wa;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p0, p1, LVa/Wa;->d:LVa/q;

    .line 14
    .line 15
    invoke-static {p1}, LVa/Cb;->j(LVa/Ba;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :sswitch_1
    sget p1, LVa/x;->r:I

    .line 20
    .line 21
    add-int/lit8 p1, p1, 0x35

    .line 22
    .line 23
    rem-int/lit16 p1, p1, 0x80

    .line 24
    .line 25
    sput p1, LVa/x;->s:I

    .line 26
    .line 27
    iget-object p1, p0, LVa/q;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LVa/x;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    sget v0, LVa/x;->r:I

    .line 35
    .line 36
    add-int/lit8 v1, v0, 0x4b

    .line 37
    .line 38
    rem-int/lit16 v1, v1, 0x80

    .line 39
    .line 40
    sput v1, LVa/x;->s:I

    .line 41
    .line 42
    iget-boolean v1, p1, LVa/x;->g:Z

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    if-nez v1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    add-int/lit8 v0, v0, 0x75

    .line 49
    .line 50
    rem-int/lit16 v1, v0, 0x80

    .line 51
    .line 52
    sput v1, LVa/x;->s:I

    .line 53
    .line 54
    rem-int/lit8 v0, v0, 0x2

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    invoke-virtual {p1}, LVa/x;->s()V

    .line 59
    .line 60
    .line 61
    sget v0, LVa/x;->s:I

    .line 62
    .line 63
    add-int/lit8 v0, v0, 0x6b

    .line 64
    .line 65
    rem-int/lit16 v0, v0, 0x80

    .line 66
    .line 67
    sput v0, LVa/x;->r:I

    .line 68
    .line 69
    :goto_0
    const/4 v0, 0x0

    .line 70
    iput-boolean v0, p1, LVa/x;->g:Z

    .line 71
    .line 72
    sget p1, LVa/x;->s:I

    .line 73
    .line 74
    add-int/lit8 p1, p1, 0x3b

    .line 75
    .line 76
    rem-int/lit16 v0, p1, 0x80

    .line 77
    .line 78
    sput v0, LVa/x;->r:I

    .line 79
    .line 80
    rem-int/lit8 p1, p1, 0x2

    .line 81
    .line 82
    if-nez p1, :cond_1

    .line 83
    .line 84
    return-void

    .line 85
    :cond_1
    throw v2

    .line 86
    :cond_2
    invoke-virtual {p1}, LVa/x;->s()V

    .line 87
    .line 88
    .line 89
    throw v2

    .line 90
    nop

    .line 91
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method public d(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget p1, p0, LVa/q;->a:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :sswitch_0
    new-instance p1, LVa/Wa;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-direct {p1, v0}, LVa/Wa;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p0, p1, LVa/Wa;->d:LVa/q;

    .line 14
    .line 15
    invoke-static {p1}, LVa/Cb;->j(LVa/Ba;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :sswitch_1
    iget-object p1, p0, LVa/q;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, LVa/x;

    .line 22
    .line 23
    invoke-virtual {p1}, LVa/x;->w()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget p1, p0, LVa/q;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p1, p0, LVa/q;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LA7/b0;

    .line 10
    .line 11
    iget-object p1, p1, LA7/b0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroid/os/Handler;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget p1, p0, LVa/q;->a:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :sswitch_0
    iget-object p1, p0, LVa/q;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LA7/b0;

    .line 10
    .line 11
    iget-object p1, p1, LA7/b0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroid/os/Handler;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :sswitch_1
    new-instance p1, LVa/v;

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    invoke-direct {p1, v0}, LVa/v;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object p0, p1, LVa/v;->d:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {p1}, LVa/Cb;->e(LVa/Ba;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x4 -> :sswitch_0
    .end sparse-switch
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 5

    .line 1
    iget v0, p0, LVa/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    return-void

    .line 7
    :pswitch_1
    iget-object v0, p0, LVa/q;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LA7/b0;

    .line 10
    .line 11
    iget-object v1, v0, LA7/b0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v2, LVa/y;

    .line 16
    .line 17
    const/16 v3, 0x15

    .line 18
    .line 19
    invoke-direct {v2, v3}, LVa/y;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object v0, v2, LVa/y;->e:Ljava/lang/Object;

    .line 23
    .line 24
    iput-object p1, v2, LVa/y;->d:Ljava/lang/Object;

    .line 25
    .line 26
    const-wide/16 v3, 0x1f4

    .line 27
    .line 28
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_2
    sget-object v0, LVa/sa;->M:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v1, p0, LVa/q;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, LVa/y7;

    .line 37
    .line 38
    invoke-static {v1, p1}, LVa/y7;->B(LVa/y7;Landroid/app/Activity;)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v1, v0, p1}, LVa/y7;->o(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget v0, p0, LVa/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    return-void

    .line 7
    :pswitch_1
    iget-object v0, p0, LVa/q;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LA7/b0;

    .line 10
    .line 11
    iget-boolean v1, v0, LA7/b0;->b:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iput-boolean v1, v0, LA7/b0;->b:Z

    .line 17
    .line 18
    iget-object v1, v0, LA7/b0;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, LVa/jb;

    .line 21
    .line 22
    invoke-interface {v1, p1}, LVa/jb;->d(Landroid/app/Activity;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p1, v0, LA7/b0;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Landroid/os/Handler;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_2
    sget-object v0, LVa/sa;->N:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v1, p0, LVa/q;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, LVa/y7;

    .line 39
    .line 40
    invoke-static {v1, p1}, LVa/y7;->B(LVa/y7;Landroid/app/Activity;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v1, v0, p1}, LVa/y7;->o(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget p1, p0, LVa/q;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p1, p0, LVa/q;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LA7/b0;

    .line 10
    .line 11
    iget-object p1, p1, LA7/b0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroid/os/Handler;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget p1, p0, LVa/q;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p1, p0, LVa/q;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LA7/b0;

    .line 10
    .line 11
    iget-object p1, p1, LA7/b0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroid/os/Handler;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget p1, p0, LVa/q;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p1, p0, LVa/q;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LA7/b0;

    .line 10
    .line 11
    iget-object p1, p1, LA7/b0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroid/os/Handler;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method
