.class public final LVa/W7;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:LVa/r8;

.field public final synthetic c:LVa/x8;

.field public final synthetic d:LVa/y7;

.field public final synthetic e:Ljava/util/List;


# direct methods
.method public constructor <init>(LVa/y7;LVa/r8;LVa/x8;Ljava/util/List;Z)V
    .locals 0

    .line 1
    iput-boolean p5, p0, LVa/W7;->a:Z

    .line 2
    .line 3
    iput-object p2, p0, LVa/W7;->b:LVa/r8;

    .line 4
    .line 5
    iput-object p3, p0, LVa/W7;->c:LVa/x8;

    .line 6
    .line 7
    iput-object p1, p0, LVa/W7;->d:LVa/y7;

    .line 8
    .line 9
    iput-object p4, p0, LVa/W7;->e:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, LVa/W7;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LVa/W7;->e:Ljava/util/List;

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aput-object p0, v1, v2

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    aput-object p1, v1, v2

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    aput-object p2, v1, p1

    .line 18
    .line 19
    invoke-static {v0, v1}, LVa/E7;->N1(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object p2, p0, LVa/W7;->c:LVa/x8;

    .line 24
    .line 25
    iget-object v0, p0, LVa/W7;->d:LVa/y7;

    .line 26
    .line 27
    iget-object v1, p0, LVa/W7;->b:LVa/r8;

    .line 28
    .line 29
    invoke-virtual {v1, p2, v0, p1}, LVa/r8;->c(LVa/x8;LVa/y7;Ljava/util/List;)LVa/s8;

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    new-instance v0, LVa/Da;

    .line 34
    .line 35
    const/16 v1, 0x11

    .line 36
    .line 37
    invoke-direct {v0, v1}, LVa/Da;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object p0, v0, LVa/Da;->f:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object p1, v0, LVa/Da;->e:Ljava/lang/Object;

    .line 43
    .line 44
    iput-object p2, v0, LVa/Da;->d:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-static {v0}, LVa/Cb;->j(LVa/Ba;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
