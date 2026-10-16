.class public final synthetic Loc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Loc/d;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Landroid/os/Handler;

.field public final synthetic e:LYc/b;


# direct methods
.method public synthetic constructor <init>(Loc/d;Landroid/content/Context;Landroid/os/Handler;LYc/b;I)V
    .locals 0

    .line 1
    iput p5, p0, Loc/b;->a:I

    iput-object p1, p0, Loc/b;->b:Loc/d;

    iput-object p2, p0, Loc/b;->c:Landroid/content/Context;

    iput-object p3, p0, Loc/b;->d:Landroid/os/Handler;

    iput-object p4, p0, Loc/b;->e:LYc/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Loc/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Loc/b;->b:Loc/d;

    .line 7
    .line 8
    iget-object v1, p0, Loc/b;->c:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v0, v1, v2}, Loc/d;->a(Landroid/content/Context;[Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Loc/b;->d:Landroid/os/Handler;

    .line 19
    .line 20
    iget-object v1, p0, Loc/b;->e:LYc/b;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object v3, p0, Loc/b;->b:Loc/d;

    .line 27
    .line 28
    :try_start_0
    iget-object v0, v3, Loc/d;->g:Ljava/util/concurrent/Future;

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Loc/c;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 41
    .line 42
    const/16 v2, 0x1c

    .line 43
    .line 44
    if-lt v1, v2, :cond_0

    .line 45
    .line 46
    invoke-static {v0}, Llc/f;->e(Landroid/os/Looper;)Landroid/os/Handler;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance v1, Landroid/os/Handler;

    .line 52
    .line 53
    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 54
    .line 55
    .line 56
    move-object v0, v1

    .line 57
    :goto_0
    new-instance v2, Loc/b;

    .line 58
    .line 59
    iget-object v5, p0, Loc/b;->d:Landroid/os/Handler;

    .line 60
    .line 61
    iget-object v6, p0, Loc/b;->e:LYc/b;

    .line 62
    .line 63
    iget-object v4, p0, Loc/b;->c:Landroid/content/Context;

    .line 64
    .line 65
    const/4 v7, 0x1

    .line 66
    invoke-direct/range {v2 .. v7}, Loc/b;-><init>(Loc/d;Landroid/content/Context;Landroid/os/Handler;LYc/b;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :catch_0
    move-exception v0

    .line 74
    const-string v1, "FlutterLoader"

    .line 75
    .line 76
    const-string v2, "Flutter initialization failed."

    .line 77
    .line 78
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 79
    .line 80
    .line 81
    new-instance v1, Ljava/lang/RuntimeException;

    .line 82
    .line 83
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    throw v1

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
