.class public final synthetic LCg/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LCg/c;

.field public final synthetic c:Luc/o;

.field public final synthetic d:Ltc/g;


# direct methods
.method public synthetic constructor <init>(LCg/c;Luc/o;Ltc/g;I)V
    .locals 0

    .line 1
    iput p4, p0, LCg/a;->a:I

    iput-object p1, p0, LCg/a;->b:LCg/c;

    iput-object p2, p0, LCg/a;->c:Luc/o;

    iput-object p3, p0, LCg/a;->d:Ltc/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    const-string v0, "album"

    .line 2
    .line 3
    iget-object v1, p0, LCg/a;->b:LCg/c;

    .line 4
    .line 5
    iget-object v2, p0, LCg/a;->d:Ltc/g;

    .line 6
    .line 7
    iget-object v3, p0, LCg/a;->c:Luc/o;

    .line 8
    .line 9
    iget v4, p0, LCg/a;->a:I

    .line 10
    .line 11
    packed-switch v4, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v4, LCg/c;->e:Landroid/net/Uri;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    :try_start_0
    const-string v4, "bytes"

    .line 20
    .line 21
    invoke-virtual {v3, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, [B

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/String;

    .line 32
    .line 33
    const-string v5, "name"

    .line 34
    .line 35
    invoke-virtual {v3, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v1, v0, v3, v4}, LCg/c;->d(Ljava/lang/String;Ljava/lang/String;[B)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Landroid/os/Handler;

    .line 45
    .line 46
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 51
    .line 52
    .line 53
    new-instance v1, LCg/b;

    .line 54
    .line 55
    const/4 v3, 0x1

    .line 56
    invoke-direct {v1, v2, v3}, LCg/b;-><init>(Ltc/g;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catch_0
    move-exception v0

    .line 64
    invoke-static {v0, v2}, LCg/c;->a(Ljava/lang/Exception;Ltc/g;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    return-void

    .line 68
    :pswitch_0
    sget-object v4, LCg/c;->e:Landroid/net/Uri;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    :try_start_1
    const-string v4, "path"

    .line 74
    .line 75
    invoke-virtual {v3, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v3, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Ljava/lang/String;

    .line 86
    .line 87
    iget-object v3, v3, Luc/o;->a:Ljava/lang/String;

    .line 88
    .line 89
    const-string v5, "Image"

    .line 90
    .line 91
    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    invoke-virtual {v1, v4, v0, v3}, LCg/c;->c(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    new-instance v0, Landroid/os/Handler;

    .line 99
    .line 100
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 105
    .line 106
    .line 107
    new-instance v1, LCg/b;

    .line 108
    .line 109
    const/4 v3, 0x2

    .line 110
    invoke-direct {v1, v2, v3}, LCg/b;-><init>(Ltc/g;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :catch_1
    move-exception v0

    .line 118
    invoke-static {v0, v2}, LCg/c;->a(Ljava/lang/Exception;Ltc/g;)V

    .line 119
    .line 120
    .line 121
    :goto_1
    return-void

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
