.class public final Lad/T;
.super Lad/g;
.source "SourceFile"


# instance fields
.field public final b:LG9/e;

.field public final c:Ljava/lang/String;

.field public final d:LJ4/c;

.field public final e:Lad/q;

.field public final f:Lad/l;

.field public g:LS6/a;


# direct methods
.method public constructor <init>(ILG9/e;Ljava/lang/String;Lad/l;LJ4/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lad/i;-><init>(I)V

    .line 2
    iput-object p2, p0, Lad/T;->b:LG9/e;

    .line 3
    iput-object p3, p0, Lad/T;->c:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lad/T;->f:Lad/l;

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lad/T;->e:Lad/q;

    .line 6
    iput-object p5, p0, Lad/T;->d:LJ4/c;

    return-void
.end method

.method public constructor <init>(ILG9/e;Ljava/lang/String;Lad/q;LJ4/c;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lad/i;-><init>(I)V

    .line 8
    iput-object p2, p0, Lad/T;->b:LG9/e;

    .line 9
    iput-object p3, p0, Lad/T;->c:Ljava/lang/String;

    .line 10
    iput-object p4, p0, Lad/T;->e:Lad/q;

    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lad/T;->f:Lad/l;

    .line 12
    iput-object p5, p0, Lad/T;->d:LJ4/c;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lad/T;->g:LS6/a;

    .line 3
    .line 4
    return-void
.end method

.method public final c(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lad/T;->g:LS6/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p1, "FlutterRIAd"

    .line 6
    .line 7
    const-string v0, "Error setting immersive mode in rewarded interstitial ad - the rewarded interstitial ad wasn\'t loaded yet."

    .line 8
    .line 9
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {v0, p1}, LS6/a;->setImmersiveMode(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lad/T;->g:LS6/a;

    .line 2
    .line 3
    const-string v1, "FlutterRIAd"

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "Error showing rewarded interstitial - the rewarded interstitial ad wasn\'t loaded yet."

    .line 8
    .line 9
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v2, p0, Lad/T;->b:LG9/e;

    .line 14
    .line 15
    iget-object v3, v2, LG9/e;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Landroid/app/Activity;

    .line 18
    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    const-string v0, "Tried to show rewarded interstitial ad before activity was bound to the plugin."

    .line 22
    .line 23
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    new-instance v1, Lad/E;

    .line 28
    .line 29
    iget v3, p0, Lad/i;->a:I

    .line 30
    .line 31
    invoke-direct {v1, v3, v2}, Lad/E;-><init>(ILG9/e;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, LS6/a;->setFullScreenContentCallback(Lx6/k;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lad/T;->g:LS6/a;

    .line 38
    .line 39
    new-instance v1, Lad/S;

    .line 40
    .line 41
    invoke-direct {v1, p0}, Lad/S;-><init>(Lad/T;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, LS6/a;->setOnAdMetadataChangedListener(LR6/a;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lad/T;->g:LS6/a;

    .line 48
    .line 49
    iget-object v1, v2, LG9/e;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Landroid/app/Activity;

    .line 52
    .line 53
    new-instance v2, Lad/S;

    .line 54
    .line 55
    invoke-direct {v2, p0}, Lad/S;-><init>(Lad/T;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, LS6/a;->show(Landroid/app/Activity;Lx6/r;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method
