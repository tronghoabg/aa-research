.class public final LW1/c;
.super Landroid/media/AudioDeviceCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LW1/c;->a:I

    iput-object p1, p0, LW1/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .locals 7

    .line 1
    iget-object v0, p0, LW1/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget v3, p0, LW1/c;->a:I

    .line 6
    .line 7
    packed-switch v3, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const-string v3, "addedDevices"

    .line 11
    .line 12
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v3, Ljava/util/ArrayList;

    .line 16
    .line 17
    array-length v4, p1

    .line 18
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    array-length v4, p1

    .line 22
    move v5, v2

    .line 23
    :goto_0
    if-ge v5, v4, :cond_0

    .line 24
    .line 25
    aget-object v6, p1, v5

    .line 26
    .line 27
    invoke-static {v6}, Lff/B;->r(Landroid/media/AudioDeviceInfo;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    add-int/2addr v5, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-array p1, v1, [Ljava/lang/Object;

    .line 37
    .line 38
    aput-object v3, p1, v2

    .line 39
    .line 40
    check-cast v0, LR8/a;

    .line 41
    .line 42
    const-string v1, "onAudioDevicesAdded"

    .line 43
    .line 44
    invoke-virtual {v0, v1, p1}, LR8/a;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_0
    check-cast v0, LJ9/o;

    .line 49
    .line 50
    iget-object p1, v0, LJ9/o;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Landroid/content/Context;

    .line 53
    .line 54
    iget-object v1, v0, LJ9/o;->j:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, LN1/c;

    .line 57
    .line 58
    iget-object v2, v0, LJ9/o;->i:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, LY9/c;

    .line 61
    .line 62
    invoke-static {p1, v1, v2}, LW1/b;->b(Landroid/content/Context;LN1/c;LY9/c;)LW1/b;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v0, p1}, LJ9/o;->g(LW1/b;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .locals 7

    .line 1
    iget-object v0, p0, LW1/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget v3, p0, LW1/c;->a:I

    .line 6
    .line 7
    packed-switch v3, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const-string v3, "removedDevices"

    .line 11
    .line 12
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v3, Ljava/util/ArrayList;

    .line 16
    .line 17
    array-length v4, p1

    .line 18
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    array-length v4, p1

    .line 22
    move v5, v2

    .line 23
    :goto_0
    if-ge v5, v4, :cond_0

    .line 24
    .line 25
    aget-object v6, p1, v5

    .line 26
    .line 27
    invoke-static {v6}, Lff/B;->r(Landroid/media/AudioDeviceInfo;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    add-int/2addr v5, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-array p1, v1, [Ljava/lang/Object;

    .line 37
    .line 38
    aput-object v3, p1, v2

    .line 39
    .line 40
    check-cast v0, LR8/a;

    .line 41
    .line 42
    const-string v1, "onAudioDevicesRemoved"

    .line 43
    .line 44
    invoke-virtual {v0, v1, p1}, LR8/a;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_0
    check-cast v0, LJ9/o;

    .line 49
    .line 50
    iget-object v1, v0, LJ9/o;->i:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, LY9/c;

    .line 53
    .line 54
    invoke-static {v1, p1}, LQ1/x;->k(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    iput-object p1, v0, LJ9/o;->i:Ljava/lang/Object;

    .line 62
    .line 63
    :cond_1
    iget-object p1, v0, LJ9/o;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Landroid/content/Context;

    .line 66
    .line 67
    iget-object v1, v0, LJ9/o;->j:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, LN1/c;

    .line 70
    .line 71
    iget-object v2, v0, LJ9/o;->i:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, LY9/c;

    .line 74
    .line 75
    invoke-static {p1, v1, v2}, LW1/b;->b(Landroid/content/Context;LN1/c;LY9/c;)LW1/b;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {v0, p1}, LJ9/o;->g(LW1/b;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
