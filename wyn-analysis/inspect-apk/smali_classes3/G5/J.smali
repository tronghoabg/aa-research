.class public abstract LG5/J;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LG5/t;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Landroid/media/AudioDeviceInfo;

    .line 2
    .line 3
    check-cast p0, LG5/G;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, LG5/C;

    .line 13
    .line 14
    invoke-direct {v0, p1}, LG5/C;-><init>(Landroid/media/AudioDeviceInfo;)V

    .line 15
    .line 16
    .line 17
    move-object p1, v0

    .line 18
    :goto_0
    iput-object p1, p0, LG5/G;->Y:LG5/C;

    .line 19
    .line 20
    iget-object p0, p0, LG5/G;->u:Landroid/media/AudioTrack;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    invoke-static {p0, p1}, LG5/A;->a(Landroid/media/AudioTrack;LG5/C;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method
