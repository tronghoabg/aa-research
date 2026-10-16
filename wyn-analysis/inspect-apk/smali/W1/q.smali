.class public final synthetic LW1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioRouting$OnRoutingChangedListener;


# instance fields
.field public final synthetic a:LDd/c;


# direct methods
.method public synthetic constructor <init>(LDd/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW1/q;->a:LDd/c;

    return-void
.end method


# virtual methods
.method public final onRoutingChanged(Landroid/media/AudioRouting;)V
    .locals 2

    .line 1
    iget-object v0, p0, LW1/q;->a:LDd/c;

    .line 2
    .line 3
    iget-object v1, v0, LDd/c;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LW1/q;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p1}, LW1/p;->j(Landroid/media/AudioRouting;)Landroid/media/AudioDeviceInfo;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object v0, v0, LDd/c;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LJ9/o;

    .line 19
    .line 20
    invoke-static {p1}, LW1/p;->j(Landroid/media/AudioRouting;)Landroid/media/AudioDeviceInfo;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, LJ9/o;->h(Landroid/media/AudioDeviceInfo;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method
