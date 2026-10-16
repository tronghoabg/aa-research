.class public final La2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;
.implements Lcom/google/android/gms/tasks/OnFailureListener;
.implements Lcom/google/android/gms/tasks/OnCanceledListener;
.implements Lx6/p;
.implements Lc2/c;
.implements Lcom/dexterous/flutterlocalnotifications/i;
.implements Lcom/google/android/gms/common/api/internal/w;
.implements Li3/a;
.implements Luc/f;
.implements Lod/T0;
.implements Lorg/chromium/net/c;
.implements Lo2/h;
.implements Lnb/b;
.implements Lp/i;
.implements Lr9/f;
.implements Luc/p;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 8

    iput p1, p0, La2/c;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, La2/c;->b:Ljava/lang/Object;

    return-void

    .line 14
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, La2/c;->b:Ljava/lang/Object;

    return-void

    .line 16
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance p1, Lad/L;

    const/16 v0, 0x18

    invoke-direct {p1, v0}, Lad/L;-><init>(I)V

    iput-object p1, p0, La2/c;->b:Ljava/lang/Object;

    return-void

    .line 18
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 19
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance p1, La2/c;

    const/16 v0, 0x11

    .line 21
    invoke-direct {p1, v0}, La2/c;-><init>(I)V

    .line 22
    iput-object p1, p0, La2/c;->b:Ljava/lang/Object;

    return-void

    .line 23
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 25
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v4, 0x1

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v2, 0x1

    move v3, v2

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v1, p0, La2/c;->b:Ljava/lang/Object;

    return-void

    .line 26
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance p1, LV1/c;

    const/16 v0, 0x12

    invoke-direct {p1, v0}, LV1/c;-><init>(I)V

    iput-object p1, p0, La2/c;->b:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_5
        0x8 -> :sswitch_4
        0xa -> :sswitch_3
        0x11 -> :sswitch_2
        0x19 -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La2/c;->a:I

    iput-object p2, p0, La2/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, La2/c;->a:I

    const/16 v0, 0xa

    .line 8
    invoke-direct {p0, v0}, La2/c;-><init>(I)V

    .line 9
    const-string v0, "User-Agent"

    invoke-virtual {p0, v0, p2}, La2/c;->D(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    const-string p2, "CSeq"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, La2/c;->D(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    .line 11
    const-string p1, "Session"

    invoke-virtual {p0, p1, p3}, La2/c;->D(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, La2/c;->a:I

    iput-object p1, p0, La2/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lmc/b;)V
    .locals 5

    const/16 v0, 0x1c

    iput v0, p0, La2/c;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lad/L;

    const/16 v1, 0x1a

    invoke-direct {v0, p0, v1}, Lad/L;-><init>(Ljava/lang/Object;I)V

    .line 5
    new-instance v1, Luc/r;

    sget-object v2, Luc/x;->b:Luc/x;

    const/4 v3, 0x0

    .line 6
    const-string v4, "flutter/mousecursor"

    invoke-direct {v1, p1, v4, v2, v3}, Luc/r;-><init>(Luc/f;Ljava/lang/String;Luc/s;Lab/b;)V

    .line 7
    invoke-virtual {v1, v0}, Luc/r;->b(Luc/p;)V

    return-void
.end method

.method public static I(Lc4/j;Lh4/h;Lf4/c;Lf4/d;)Lh4/o;
    .locals 8

    .line 1
    new-instance v0, Lh4/o;

    .line 2
    .line 3
    iget-object v1, p3, Lf4/d;->a:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iget-object v2, p1, Lh4/h;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    move-object v3, v1

    .line 12
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 13
    .line 14
    invoke-direct {v1, v2, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 15
    .line 16
    .line 17
    const-string v2, "coil#disk_cache_key"

    .line 18
    .line 19
    iget-object p3, p3, Lf4/d;->b:Ljava/util/Map;

    .line 20
    .line 21
    invoke-interface {p3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    instance-of v3, v2, Ljava/lang/String;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    check-cast v2, Ljava/lang/String;

    .line 31
    .line 32
    move-object v5, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v5, v4

    .line 35
    :goto_0
    const-string v2, "coil#is_sampled"

    .line 36
    .line 37
    invoke-interface {p3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    instance-of v2, p3, Ljava/lang/Boolean;

    .line 42
    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    move-object v4, p3

    .line 46
    check-cast v4, Ljava/lang/Boolean;

    .line 47
    .line 48
    :cond_1
    const/4 p3, 0x0

    .line 49
    if-eqz v4, :cond_2

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    move v6, v2

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move v6, p3

    .line 58
    :goto_1
    sget-object v2, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    .line 59
    .line 60
    instance-of v2, p0, Lc4/j;

    .line 61
    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    iget-boolean p0, p0, Lc4/j;->g:Z

    .line 65
    .line 66
    if-eqz p0, :cond_3

    .line 67
    .line 68
    const/4 p3, 0x1

    .line 69
    :cond_3
    move v7, p3

    .line 70
    const/4 v3, 0x1

    .line 71
    move-object v2, p1

    .line 72
    move-object v4, p2

    .line 73
    invoke-direct/range {v0 .. v7}, Lh4/o;-><init>(Landroid/graphics/drawable/Drawable;Lh4/h;ILf4/c;Ljava/lang/String;ZZ)V

    .line 74
    .line 75
    .line 76
    return-object v0
.end method


# virtual methods
.method public A(Lo2/j;JJ)V
    .locals 0

    .line 1
    iget-object p1, p0, La2/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, LS3/l;

    .line 4
    .line 5
    sget-object p2, Lp2/b;->b:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter p2

    .line 8
    :try_start_0
    sget-boolean p3, Lp2/b;->c:Z

    .line 9
    .line 10
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-nez p3, :cond_0

    .line 12
    .line 13
    new-instance p2, Ljava/io/IOException;

    .line 14
    .line 15
    new-instance p3, Ljava/util/ConcurrentModificationException;

    .line 16
    .line 17
    invoke-direct {p3}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p1, LS3/l;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, LX1/f;

    .line 26
    .line 27
    invoke-virtual {p1, p2}, LX1/f;->x(Ljava/io/IOException;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-virtual {p1}, LS3/l;->r()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    throw p1
.end method

.method public B(Z)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, La2/c;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Luc/q;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public C(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "html"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La2/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LG4/c;

    .line 9
    .line 10
    const-string v1, "mraid.js"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, LG4/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "mraid-bridge.js"

    .line 17
    .line 18
    invoke-virtual {v0, v2}, LG4/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v2, "\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\"> \n        <style> body { margin:0; padding:0; overflow:hidden; } </style>\n        "

    .line 23
    .line 24
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v2, "<script>"

    .line 29
    .line 30
    const-string v3, "</script>"

    .line 31
    .line 32
    invoke-static {v2, v1, v3}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const/4 v2, 0x0

    .line 37
    const-string v3, "<script src=\"mraid.js\"></script>"

    .line 38
    .line 39
    invoke-static {p1, v3, v1, v2}, LBf/r;->h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, LBf/l;->V(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    sget-object v1, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 48
    .line 49
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v1, "getBytes(...)"

    .line 54
    .line 55
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    invoke-static {p1, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const-string v1, "encodeToString(...)"

    .line 64
    .line 65
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v2, "\n            <script>"

    .line 71
    .line 72
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v0, "</script>\n            <iframe id=\"adFrame\"\n                style=\"width:100vw; height:100vh; border:none;\"\n                src=\"data:text/html;base64,"

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string p1, "\"\n                sandbox=\"allow-scripts allow-same-origin\"\n            >\n            </iframe>\n        "

    .line 87
    .line 88
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {p1}, LBf/l;->V(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    return-object p1
.end method

.method public D(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lg2/o;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget-object v0, p0, La2/c;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La2/c;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, Ll8/s;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, La2/c;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ll8/w;

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    invoke-static {}, Ll8/w;->a()Ll8/w;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iput-object v1, v0, La2/c;->b:Ljava/lang/Object;

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v1, p1}, Ll8/w;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ll8/E;

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    sget-object v1, Ll8/K;->b:Ll8/I;

    .line 44
    .line 45
    const/4 v1, 0x4

    .line 46
    const-string v2, "expectedSize"

    .line 47
    .line 48
    invoke-static {v1, v2}, Ll8/s;->d(ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v2, Ll8/H;

    .line 52
    .line 53
    invoke-direct {v2, v1}, Ll8/E;-><init>(I)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v0, La2/c;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Ll8/w;

    .line 59
    .line 60
    if-nez v1, :cond_1

    .line 61
    .line 62
    invoke-static {}, Ll8/w;->a()Ll8/w;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iput-object v1, v0, La2/c;->b:Ljava/lang/Object;

    .line 67
    .line 68
    :cond_1
    invoke-virtual {v1, p1, v2}, Ll8/w;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-object v1, v2

    .line 72
    :cond_2
    invoke-virtual {v1, p2}, Ll8/E;->c(Ljava/lang/Object;)Ll8/E;

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public E(Lo2/j;JJLjava/io/IOException;I)LU5/f;
    .locals 0

    .line 1
    iget-object p1, p0, La2/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, LS3/l;

    .line 4
    .line 5
    iget-object p1, p1, LS3/l;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, LX1/f;

    .line 8
    .line 9
    invoke-virtual {p1, p6}, LX1/f;->x(Ljava/io/IOException;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, Lo2/m;->e:LU5/f;

    .line 13
    .line 14
    return-object p1
.end method

.method public F(Ljava/util/List;)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    if-ge v2, v3, :cond_1

    .line 9
    .line 10
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Ljava/lang/String;

    .line 15
    .line 16
    sget v4, LQ1/x;->a:I

    .line 17
    .line 18
    const-string v4, ":\\s?"

    .line 19
    .line 20
    const/4 v5, 0x2

    .line 21
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    array-length v4, v3

    .line 26
    if-ne v4, v5, :cond_0

    .line 27
    .line 28
    aget-object v4, v3, v1

    .line 29
    .line 30
    aget-object v3, v3, v0

    .line 31
    .line 32
    invoke-virtual {p0, v4, v3}, La2/c;->D(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    add-int/2addr v2, v0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-void
.end method

.method public G(Lh4/h;Lf4/c;Li4/f;I)Lf4/d;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget v3, v0, Lh4/h;->w:I

    .line 8
    .line 9
    invoke-static {v3}, Lcom/google/android/gms/internal/consent_sdk/a;->k(I)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x0

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    move-object/from16 v3, p0

    .line 17
    .line 18
    goto/16 :goto_d

    .line 19
    .line 20
    :cond_0
    move-object/from16 v3, p0

    .line 21
    .line 22
    iget-object v5, v3, La2/c;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v5, LX3/k;

    .line 25
    .line 26
    iget-object v5, v5, LX3/k;->e:Lef/p;

    .line 27
    .line 28
    invoke-virtual {v5}, Lef/p;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    check-cast v5, Lf4/e;

    .line 33
    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    iget-object v6, v5, Lf4/e;->a:Lf4/h;

    .line 37
    .line 38
    invoke-interface {v6, v1}, Lf4/h;->m(Lf4/c;)Lf4/d;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    if-nez v6, :cond_2

    .line 43
    .line 44
    iget-object v5, v5, Lf4/e;->b:Lf4/i;

    .line 45
    .line 46
    invoke-interface {v5, v1}, Lf4/i;->m(Lf4/c;)Lf4/d;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object v6, v4

    .line 52
    :cond_2
    :goto_0
    if-eqz v6, :cond_15

    .line 53
    .line 54
    iget-object v5, v6, Lf4/d;->a:Landroid/graphics/Bitmap;

    .line 55
    .line 56
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    if-nez v7, :cond_3

    .line 61
    .line 62
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 63
    .line 64
    :cond_3
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 65
    .line 66
    const/16 v9, 0x1a

    .line 67
    .line 68
    const/4 v10, 0x1

    .line 69
    if-lt v8, v9, :cond_4

    .line 70
    .line 71
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->p()Landroid/graphics/Bitmap$Config;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    if-ne v7, v8, :cond_4

    .line 76
    .line 77
    iget-boolean v7, v0, Lh4/h;->j:Z

    .line 78
    .line 79
    if-nez v7, :cond_4

    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    goto :goto_1

    .line 83
    :cond_4
    move v7, v10

    .line 84
    :goto_1
    if-nez v7, :cond_5

    .line 85
    .line 86
    :goto_2
    const/4 v10, 0x0

    .line 87
    goto/16 :goto_c

    .line 88
    .line 89
    :cond_5
    const-string v7, "coil#is_sampled"

    .line 90
    .line 91
    iget-object v8, v6, Lf4/d;->b:Ljava/util/Map;

    .line 92
    .line 93
    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    instance-of v8, v7, Ljava/lang/Boolean;

    .line 98
    .line 99
    if-eqz v8, :cond_6

    .line 100
    .line 101
    check-cast v7, Ljava/lang/Boolean;

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_6
    move-object v7, v4

    .line 105
    :goto_3
    if-eqz v7, :cond_7

    .line 106
    .line 107
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    goto :goto_4

    .line 112
    :cond_7
    const/4 v7, 0x0

    .line 113
    :goto_4
    sget-object v8, Li4/f;->c:Li4/f;

    .line 114
    .line 115
    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-eqz v8, :cond_8

    .line 120
    .line 121
    if-eqz v7, :cond_14

    .line 122
    .line 123
    goto/16 :goto_b

    .line 124
    .line 125
    :cond_8
    const-string v8, "coil#transformation_size"

    .line 126
    .line 127
    iget-object v1, v1, Lf4/c;->b:Ljava/util/Map;

    .line 128
    .line 129
    invoke-interface {v1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, Ljava/lang/String;

    .line 134
    .line 135
    if-eqz v1, :cond_9

    .line 136
    .line 137
    invoke-virtual {v2}, Li4/f;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    goto/16 :goto_c

    .line 146
    .line 147
    :cond_9
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    iget-object v8, v2, Li4/f;->a:Lp7/b;

    .line 156
    .line 157
    instance-of v9, v8, Li4/a;

    .line 158
    .line 159
    const v12, 0x7fffffff

    .line 160
    .line 161
    .line 162
    if-eqz v9, :cond_a

    .line 163
    .line 164
    check-cast v8, Li4/a;

    .line 165
    .line 166
    iget v8, v8, Li4/a;->e:I

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_a
    move v8, v12

    .line 170
    :goto_5
    iget-object v2, v2, Li4/f;->b:Lp7/b;

    .line 171
    .line 172
    instance-of v9, v2, Li4/a;

    .line 173
    .line 174
    if-eqz v9, :cond_b

    .line 175
    .line 176
    check-cast v2, Li4/a;

    .line 177
    .line 178
    iget v2, v2, Li4/a;->e:I

    .line 179
    .line 180
    :goto_6
    move/from16 v9, p4

    .line 181
    .line 182
    goto :goto_7

    .line 183
    :cond_b
    move v2, v12

    .line 184
    goto :goto_6

    .line 185
    :goto_7
    invoke-static {v1, v5, v8, v2, v9}, Lxg/g;->r(IIIII)D

    .line 186
    .line 187
    .line 188
    move-result-wide v13

    .line 189
    invoke-static {v0}, Lk4/d;->a(Lh4/h;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    .line 194
    .line 195
    if-eqz v0, :cond_d

    .line 196
    .line 197
    cmpl-double v9, v13, v15

    .line 198
    .line 199
    if-lez v9, :cond_c

    .line 200
    .line 201
    move-wide/from16 v17, v15

    .line 202
    .line 203
    goto :goto_8

    .line 204
    :cond_c
    move-wide/from16 v17, v13

    .line 205
    .line 206
    :goto_8
    int-to-double v8, v8

    .line 207
    int-to-double v11, v1

    .line 208
    mul-double v11, v11, v17

    .line 209
    .line 210
    sub-double/2addr v8, v11

    .line 211
    invoke-static {v8, v9}, Ljava/lang/Math;->abs(D)D

    .line 212
    .line 213
    .line 214
    move-result-wide v8

    .line 215
    cmpg-double v1, v8, v15

    .line 216
    .line 217
    if-lez v1, :cond_14

    .line 218
    .line 219
    int-to-double v1, v2

    .line 220
    int-to-double v8, v5

    .line 221
    mul-double v17, v17, v8

    .line 222
    .line 223
    sub-double v1, v1, v17

    .line 224
    .line 225
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    .line 226
    .line 227
    .line 228
    move-result-wide v1

    .line 229
    cmpg-double v1, v1, v15

    .line 230
    .line 231
    if-gtz v1, :cond_11

    .line 232
    .line 233
    goto :goto_c

    .line 234
    :cond_d
    const/high16 v9, -0x80000000

    .line 235
    .line 236
    if-eq v8, v9, :cond_f

    .line 237
    .line 238
    if-ne v8, v12, :cond_e

    .line 239
    .line 240
    goto :goto_9

    .line 241
    :cond_e
    sub-int/2addr v8, v1

    .line 242
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-gt v1, v10, :cond_11

    .line 247
    .line 248
    :cond_f
    :goto_9
    if-eq v2, v9, :cond_14

    .line 249
    .line 250
    if-ne v2, v12, :cond_10

    .line 251
    .line 252
    goto :goto_c

    .line 253
    :cond_10
    sub-int/2addr v2, v5

    .line 254
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    if-gt v1, v10, :cond_11

    .line 259
    .line 260
    goto :goto_c

    .line 261
    :cond_11
    cmpg-double v1, v13, v15

    .line 262
    .line 263
    if-nez v1, :cond_12

    .line 264
    .line 265
    goto :goto_a

    .line 266
    :cond_12
    if-nez v0, :cond_13

    .line 267
    .line 268
    goto :goto_b

    .line 269
    :cond_13
    :goto_a
    cmpl-double v0, v13, v15

    .line 270
    .line 271
    if-lez v0, :cond_14

    .line 272
    .line 273
    if-eqz v7, :cond_14

    .line 274
    .line 275
    :goto_b
    goto/16 :goto_2

    .line 276
    .line 277
    :cond_14
    :goto_c
    if-eqz v10, :cond_15

    .line 278
    .line 279
    return-object v6

    .line 280
    :cond_15
    :goto_d
    return-object v4
.end method

.method public H(Lh4/h;Ljava/lang/Object;Lh4/l;LX3/c;)Lf4/c;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p4, p0, La2/c;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p4, LX3/k;

    .line 7
    .line 8
    iget-object p4, p4, LX3/k;->f:LX3/b;

    .line 9
    .line 10
    iget-object p4, p4, LX3/b;->c:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p4}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    const/4 v2, 0x0

    .line 18
    if-ge v1, v0, :cond_2

    .line 19
    .line 20
    invoke-interface {p4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lef/k;

    .line 25
    .line 26
    iget-object v4, v3, Lef/k;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, Ld4/a;

    .line 29
    .line 30
    iget-object v3, v3, Lef/k;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Ljava/lang/Class;

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v3, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    const-string v3, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>"

    .line 45
    .line 46
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget v3, v4, Ld4/a;->a:I

    .line 50
    .line 51
    packed-switch v3, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    move-object v3, p2

    .line 55
    check-cast v3, Landroid/net/Uri;

    .line 56
    .line 57
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    const-string v5, "android.resource"

    .line 62
    .line 63
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_0

    .line 68
    .line 69
    new-instance v4, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const/16 v3, 0x2d

    .line 78
    .line 79
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object v3, p3, Lh4/l;->a:Landroid/content/Context;

    .line 83
    .line 84
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    sget-object v5, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    .line 93
    .line 94
    iget v3, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 95
    .line 96
    and-int/lit8 v3, v3, 0x30

    .line 97
    .line 98
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    goto :goto_1

    .line 106
    :cond_0
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    goto :goto_1

    .line 111
    :pswitch_0
    move-object v3, p2

    .line 112
    check-cast v3, Ljava/io/File;

    .line 113
    .line 114
    new-instance v4, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const/16 v5, 0x3a

    .line 127
    .line 128
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3}, Ljava/io/File;->lastModified()J

    .line 132
    .line 133
    .line 134
    move-result-wide v5

    .line 135
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    :goto_1
    if-eqz v3, :cond_1

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 146
    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :cond_2
    move-object v3, v2

    .line 150
    :goto_2
    if-nez v3, :cond_3

    .line 151
    .line 152
    return-object v2

    .line 153
    :cond_3
    iget-object p2, p1, Lh4/h;->s:Lh4/n;

    .line 154
    .line 155
    iget-object p2, p2, Lh4/n;->a:Ljava/util/Map;

    .line 156
    .line 157
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 158
    .line 159
    .line 160
    move-result p3

    .line 161
    sget-object p4, Lff/w;->a:Lff/w;

    .line 162
    .line 163
    if-eqz p3, :cond_4

    .line 164
    .line 165
    move-object p3, p4

    .line 166
    goto :goto_3

    .line 167
    :cond_4
    new-instance p3, Ljava/util/LinkedHashMap;

    .line 168
    .line 169
    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-nez v0, :cond_6

    .line 185
    .line 186
    :goto_3
    iget-object p1, p1, Lh4/h;->e:Lff/v;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    if-eqz p1, :cond_5

    .line 196
    .line 197
    new-instance p1, Lf4/c;

    .line 198
    .line 199
    invoke-direct {p1, v3, p4}, Lf4/c;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 200
    .line 201
    .line 202
    return-object p1

    .line 203
    :cond_5
    invoke-static {p3}, Lff/A;->a0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    new-instance p2, Lf4/c;

    .line 208
    .line 209
    invoke-direct {p2, v3, p1}, Lf4/c;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 210
    .line 211
    .line 212
    return-object p2

    .line 213
    :cond_6
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    check-cast p1, Ljava/util/Map$Entry;

    .line 218
    .line 219
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    new-instance p1, Ljava/lang/ClassCastException;

    .line 227
    .line 228
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 229
    .line 230
    .line 231
    throw p1

    .line 232
    nop

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public J(Ljava/util/concurrent/Callable;Ldd/a;)V
    .locals 4

    .line 1
    new-instance v0, Lp8/q;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La2/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 9
    .line 10
    new-instance v2, Lcom/applovin/impl/sdk/nativeAd/e;

    .line 11
    .line 12
    const/16 v3, 0xe

    .line 13
    .line 14
    invoke-direct {v2, v3, v0, p1}, Lcom/applovin/impl/sdk/nativeAd/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Lcom/applovin/impl/sdk/nativeAd/e;

    .line 21
    .line 22
    const/16 v1, 0xd

    .line 23
    .line 24
    invoke-direct {p1, v1, p2, v0}, Lcom/applovin/impl/sdk/nativeAd/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance p2, Ldd/b;

    .line 28
    .line 29
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lp8/m;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public K(ILtc/k;)V
    .locals 4

    .line 1
    iget-object v0, p0, La2/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/plugin/editing/i;

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/flutter/plugin/editing/i;->d()V

    .line 6
    .line 7
    .line 8
    iput-object p2, v0, Lio/flutter/plugin/editing/i;->f:Ltc/k;

    .line 9
    .line 10
    new-instance v1, LD9/n;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    const/16 v3, 0x8

    .line 14
    .line 15
    invoke-direct {v1, v2, p1, v3}, LD9/n;-><init>(III)V

    .line 16
    .line 17
    .line 18
    iput-object v1, v0, Lio/flutter/plugin/editing/i;->e:LD9/n;

    .line 19
    .line 20
    iget-object p1, v0, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lio/flutter/plugin/editing/e;->e(Lio/flutter/plugin/editing/d;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, Lio/flutter/plugin/editing/e;

    .line 26
    .line 27
    iget-object v1, p2, Ltc/k;->j:LS3/i;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iget-object v1, v1, LS3/i;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ltc/l;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v1, v2

    .line 38
    :goto_0
    iget-object v3, v0, Lio/flutter/plugin/editing/i;->a:Lkc/r;

    .line 39
    .line 40
    invoke-direct {p1, v1, v3}, Lio/flutter/plugin/editing/e;-><init>(Ltc/l;Lkc/r;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, v0, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 44
    .line 45
    invoke-virtual {v0, p2}, Lio/flutter/plugin/editing/i;->e(Ltc/k;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    iput-boolean p1, v0, Lio/flutter/plugin/editing/i;->i:Z

    .line 50
    .line 51
    iget-object p1, v0, Lio/flutter/plugin/editing/i;->e:LD9/n;

    .line 52
    .line 53
    iget p1, p1, LD9/n;->b:I

    .line 54
    .line 55
    const/4 p2, 0x3

    .line 56
    if-ne p1, p2, :cond_1

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    iput-boolean p1, v0, Lio/flutter/plugin/editing/i;->p:Z

    .line 60
    .line 61
    :cond_1
    iput-object v2, v0, Lio/flutter/plugin/editing/i;->m:Landroid/graphics/Rect;

    .line 62
    .line 63
    iget-object p1, v0, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Lio/flutter/plugin/editing/e;->a(Lio/flutter/plugin/editing/d;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public L(DD[D)V
    .locals 19

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-wide/from16 v2, p3

    .line 4
    .line 5
    move-object/from16 v4, p5

    .line 6
    .line 7
    move-object/from16 v5, p0

    .line 8
    .line 9
    iget-object v6, v5, La2/c;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v6, Lio/flutter/plugin/editing/i;

    .line 12
    .line 13
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 v7, 0x4

    .line 17
    new-array v7, v7, [D

    .line 18
    .line 19
    const/4 v8, 0x3

    .line 20
    aget-wide v9, v4, v8

    .line 21
    .line 22
    const-wide/16 v11, 0x0

    .line 23
    .line 24
    cmpl-double v9, v9, v11

    .line 25
    .line 26
    const/16 v10, 0xf

    .line 27
    .line 28
    const/4 v13, 0x0

    .line 29
    const/4 v14, 0x1

    .line 30
    if-nez v9, :cond_0

    .line 31
    .line 32
    const/4 v9, 0x7

    .line 33
    aget-wide v15, v4, v9

    .line 34
    .line 35
    cmpl-double v9, v15, v11

    .line 36
    .line 37
    if-nez v9, :cond_0

    .line 38
    .line 39
    aget-wide v15, v4, v10

    .line 40
    .line 41
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 42
    .line 43
    cmpl-double v9, v15, v17

    .line 44
    .line 45
    if-nez v9, :cond_0

    .line 46
    .line 47
    move v9, v14

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v9, v13

    .line 50
    :goto_0
    const/16 v15, 0xc

    .line 51
    .line 52
    aget-wide v15, v4, v15

    .line 53
    .line 54
    aget-wide v17, v4, v10

    .line 55
    .line 56
    div-double v15, v15, v17

    .line 57
    .line 58
    aput-wide v15, v7, v14

    .line 59
    .line 60
    aput-wide v15, v7, v13

    .line 61
    .line 62
    const/16 v10, 0xd

    .line 63
    .line 64
    aget-wide v15, v4, v10

    .line 65
    .line 66
    div-double v15, v15, v17

    .line 67
    .line 68
    aput-wide v15, v7, v8

    .line 69
    .line 70
    const/4 v10, 0x2

    .line 71
    aput-wide v15, v7, v10

    .line 72
    .line 73
    new-instance v15, LE5/b;

    .line 74
    .line 75
    invoke-direct {v15, v9, v4, v7}, LE5/b;-><init>(Z[D[D)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v15, v0, v1, v11, v12}, LE5/b;->g(DD)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v15, v0, v1, v2, v3}, LE5/b;->g(DD)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v15, v11, v12, v2, v3}, LE5/b;->g(DD)V

    .line 85
    .line 86
    .line 87
    iget-object v0, v6, Lio/flutter/plugin/editing/i;->a:Lkc/r;

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 102
    .line 103
    new-instance v1, Landroid/graphics/Rect;

    .line 104
    .line 105
    aget-wide v2, v7, v13

    .line 106
    .line 107
    float-to-double v11, v0

    .line 108
    mul-double/2addr v2, v11

    .line 109
    double-to-int v0, v2

    .line 110
    aget-wide v2, v7, v10

    .line 111
    .line 112
    mul-double/2addr v2, v11

    .line 113
    double-to-int v2, v2

    .line 114
    aget-wide v3, v7, v14

    .line 115
    .line 116
    mul-double/2addr v3, v11

    .line 117
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 118
    .line 119
    .line 120
    move-result-wide v3

    .line 121
    double-to-int v3, v3

    .line 122
    aget-wide v8, v7, v8

    .line 123
    .line 124
    mul-double/2addr v8, v11

    .line 125
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 126
    .line 127
    .line 128
    move-result-wide v7

    .line 129
    double-to-int v4, v7

    .line 130
    invoke-direct {v1, v0, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 131
    .line 132
    .line 133
    iput-object v1, v6, Lio/flutter/plugin/editing/i;->m:Landroid/graphics/Rect;

    .line 134
    .line 135
    return-void
.end method

.method public M(Ltc/l;)V
    .locals 12

    .line 1
    iget-object v0, p0, La2/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/plugin/editing/i;

    .line 4
    .line 5
    iget-object v1, v0, Lio/flutter/plugin/editing/i;->a:Lkc/r;

    .line 6
    .line 7
    iget-boolean v2, v0, Lio/flutter/plugin/editing/i;->i:Z

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_3

    .line 11
    .line 12
    iget-object v2, v0, Lio/flutter/plugin/editing/i;->o:Ltc/l;

    .line 13
    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    iget v4, v2, Ltc/l;->d:I

    .line 17
    .line 18
    if-ltz v4, :cond_3

    .line 19
    .line 20
    iget v5, v2, Ltc/l;->e:I

    .line 21
    .line 22
    if-le v5, v4, :cond_3

    .line 23
    .line 24
    sub-int/2addr v5, v4

    .line 25
    iget v6, p1, Ltc/l;->e:I

    .line 26
    .line 27
    iget v7, p1, Ltc/l;->d:I

    .line 28
    .line 29
    sub-int/2addr v6, v7

    .line 30
    const/4 v8, 0x1

    .line 31
    if-eq v5, v6, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    move v6, v3

    .line 35
    :goto_0
    if-ge v6, v5, :cond_2

    .line 36
    .line 37
    iget-object v9, v2, Ltc/l;->a:Ljava/lang/String;

    .line 38
    .line 39
    add-int v10, v6, v4

    .line 40
    .line 41
    invoke-virtual {v9, v10}, Ljava/lang/String;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    iget-object v10, p1, Ltc/l;->a:Ljava/lang/String;

    .line 46
    .line 47
    add-int v11, v6, v7

    .line 48
    .line 49
    invoke-virtual {v10, v11}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    if-eq v9, v10, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move v8, v3

    .line 60
    :goto_1
    iput-boolean v8, v0, Lio/flutter/plugin/editing/i;->i:Z

    .line 61
    .line 62
    :cond_3
    iput-object p1, v0, Lio/flutter/plugin/editing/i;->o:Ltc/l;

    .line 63
    .line 64
    iget-object v2, v0, Lio/flutter/plugin/editing/i;->h:Lio/flutter/plugin/editing/e;

    .line 65
    .line 66
    invoke-virtual {v2, p1}, Lio/flutter/plugin/editing/e;->f(Ltc/l;)V

    .line 67
    .line 68
    .line 69
    iget-boolean p1, v0, Lio/flutter/plugin/editing/i;->i:Z

    .line 70
    .line 71
    if-eqz p1, :cond_4

    .line 72
    .line 73
    iget-object p1, v0, Lio/flutter/plugin/editing/i;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 74
    .line 75
    invoke-virtual {p1, v1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 76
    .line 77
    .line 78
    iput-boolean v3, v0, Lio/flutter/plugin/editing/i;->i:Z

    .line 79
    .line 80
    :cond_4
    return-void
.end method

.method public N(LN1/n;)I
    .locals 6

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p1, LN1/n;->n:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v2, :cond_9

    .line 7
    .line 8
    invoke-static {v2}, LN1/C;->j(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    :cond_0
    sget v2, LQ1/x;->a:I

    .line 17
    .line 18
    iget-object p1, p1, LN1/n;->n:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget v2, LQ1/x;->a:I

    .line 24
    .line 25
    const/4 v4, -0x1

    .line 26
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    sparse-switch v5, :sswitch_data_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :sswitch_0
    const-string v5, "image/png"

    .line 35
    .line 36
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v4, 0x6

    .line 44
    goto :goto_0

    .line 45
    :sswitch_1
    const-string v5, "image/bmp"

    .line 46
    .line 47
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const/4 v4, 0x5

    .line 55
    goto :goto_0

    .line 56
    :sswitch_2
    const-string v5, "image/webp"

    .line 57
    .line 58
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-nez p1, :cond_3

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    move v4, v0

    .line 66
    goto :goto_0

    .line 67
    :sswitch_3
    const-string v5, "image/jpeg"

    .line 68
    .line 69
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    const/4 v4, 0x3

    .line 77
    goto :goto_0

    .line 78
    :sswitch_4
    const-string v5, "image/heif"

    .line 79
    .line 80
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_5

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_5
    const/4 v4, 0x2

    .line 88
    goto :goto_0

    .line 89
    :sswitch_5
    const-string v5, "image/heic"

    .line 90
    .line 91
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-nez p1, :cond_6

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_6
    move v4, v1

    .line 99
    goto :goto_0

    .line 100
    :sswitch_6
    const-string v5, "image/avif"

    .line 101
    .line 102
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-nez p1, :cond_7

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_7
    move v4, v3

    .line 110
    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :pswitch_0
    const/16 p1, 0x1a

    .line 115
    .line 116
    if-lt v2, p1, :cond_8

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :pswitch_1
    const/16 p1, 0x22

    .line 120
    .line 121
    if-lt v2, p1, :cond_8

    .line 122
    .line 123
    :goto_1
    :pswitch_2
    invoke-static {v0, v3, v3, v3}, LR8/v;->a(IIII)I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    return p1

    .line 128
    :cond_8
    :goto_2
    invoke-static {v1, v3, v3, v3}, LR8/v;->a(IIII)I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    return p1

    .line 133
    :cond_9
    :goto_3
    invoke-static {v3, v3, v3, v3}, LR8/v;->a(IIII)I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    return p1

    .line 138
    nop

    .line 139
    :sswitch_data_0
    .sparse-switch
        -0x58abd7ba -> :sswitch_6
        -0x58a8e8f5 -> :sswitch_5
        -0x58a8e8f2 -> :sswitch_4
        -0x58a7d764 -> :sswitch_3
        -0x58a21830 -> :sswitch_2
        -0x3468a12f -> :sswitch_1
        -0x34686c8b -> :sswitch_0
    .end sparse-switch

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public O(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La2/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lod/M0;

    .line 4
    .line 5
    iget-object v1, v0, Lod/M0;->Z:Lod/g0;

    .line 6
    .line 7
    iget-object v0, v0, Lod/M0;->E:Lod/H;

    .line 8
    .line 9
    invoke-virtual {v1, v0, p1}, LA7/B0;->W(Ljava/lang/Object;Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public a(ILjava/io/Serializable;)V
    .locals 3

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, ""

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :pswitch_2
    const-string v0, "RESULT_INSTALL_SKIP_FILE_SUCCESS"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_3
    const-string v0, "RESULT_PARSE_EXCEPTION"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_4
    const-string v0, "RESULT_IO_EXCEPTION"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_5
    const-string v0, "RESULT_BASELINE_PROFILE_NOT_FOUND"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_6
    const-string v0, "RESULT_DESIRED_FORMAT_UNSUPPORTED"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_7
    const-string v0, "RESULT_NOT_WRITABLE"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_8
    const-string v0, "RESULT_UNSUPPORTED_ART_VERSION"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_9
    const-string v0, "RESULT_ALREADY_INSTALLED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_a
    const-string v0, "RESULT_INSTALL_SUCCESS"

    .line 35
    .line 36
    :goto_0
    const/4 v1, 0x6

    .line 37
    const-string v2, "ProfileInstaller"

    .line 38
    .line 39
    if-eq p1, v1, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x7

    .line 42
    if-eq p1, v1, :cond_0

    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    if-eq p1, v1, :cond_0

    .line 47
    .line 48
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    .line 53
    .line 54
    invoke-static {v2, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    .line 56
    .line 57
    :goto_1
    iget-object p2, p0, La2/c;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p2, Landroidx/profileinstaller/ProfileInstallReceiver;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lg7/c;

    .line 2
    .line 3
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/f;->getService()Landroid/os/IInterface;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lg7/a;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/internal/base/zaa;->zaa()Landroid/os/Parcel;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La2/c;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lcom/google/android/gms/common/internal/y;

    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/base/zac;->zac(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/base/zaa;->zad(ILandroid/os/Parcel;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public b()Lab/b;
    .locals 2

    .line 1
    new-instance v0, Luc/m;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La2/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lmc/j;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lmc/j;->c(Luc/m;)Lab/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public c(Ls9/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    const-string v0, "ProfileInstaller"

    .line 2
    .line 3
    const-string v1, "DIAGNOSTIC_PROFILE_IS_COMPRESSED"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public e(Ls9/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method public f(Lp/k;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    iget-object p1, p0, La2/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    return p1
.end method

.method public g()Ljava/nio/channels/FileChannel;
    .locals 5

    .line 1
    iget-object v0, p0, La2/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/ParcelFileDescriptor;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getStatSize()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    const-wide/16 v3, -0x1

    .line 10
    .line 11
    cmp-long v1, v1, v3

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :cond_0
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V

    .line 26
    .line 27
    .line 28
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 29
    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v3, "Not a file: "

    .line 33
    .line 34
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v1
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public i(Ljava/lang/String;Luc/d;Lab/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, La2/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmc/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lmc/j;->i(Ljava/lang/String;Luc/d;Lab/b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public j(Ljava/lang/String;Ljava/nio/ByteBuffer;Luc/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, La2/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmc/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lmc/j;->j(Ljava/lang/String;Ljava/nio/ByteBuffer;Luc/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public k(Lp9/A;)I
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public l(Ljava/lang/String;Luc/d;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La2/c;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Lmc/j;

    .line 5
    .line 6
    invoke-virtual {v1, p1, p2, v0}, Lmc/j;->i(Ljava/lang/String;Luc/d;Lab/b;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public m(Ljava/lang/String;)Ls9/b;
    .locals 0

    .line 1
    sget-object p1, Ls9/b;->d:Ls9/b;

    .line 2
    .line 3
    return-object p1
.end method

.method public n(Lc9/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public o(Ljava/lang/String;Ls9/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onAdLoaded()V
    .locals 3

    .line 1
    iget-object v0, p0, La2/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lpb/a;

    .line 4
    .line 5
    iget-object v1, v0, Lpb/a;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lpb/b;

    .line 8
    .line 9
    iget-object v1, v1, LCa/d;->b:Ljava/io/Serializable;

    .line 10
    .line 11
    check-cast v1, Lj$/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    iget-object v2, v0, Lpb/a;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lnb/c;

    .line 16
    .line 17
    iget-object v2, v2, Lnb/c;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v0, v0, Lpb/a;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lrb/f;

    .line 22
    .line 23
    invoke-virtual {v1, v2, v0}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public onCanceled()V
    .locals 1

    .line 1
    iget-object v0, p0, La2/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/CountDownLatch;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 0

    .line 1
    iget-object p1, p0, La2/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/concurrent/CountDownLatch;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onMethodCall(Luc/o;Luc/q;)V
    .locals 6

    .line 1
    iget v0, p0, La2/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La2/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lba/a;

    .line 9
    .line 10
    iget-object v1, v0, Lba/a;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lxc/a;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v1, p1, Luc/o;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-object p1, p1, Luc/o;->b:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const-string v3, "error"

    .line 26
    .line 27
    const-string v4, "ProcessText.processTextAction"

    .line 28
    .line 29
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_2

    .line 34
    .line 35
    const-string p1, "ProcessText.queryTextActions"

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    check-cast p2, Ltc/g;

    .line 44
    .line 45
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    :try_start_0
    iget-object p1, v0, Lba/a;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lxc/a;

    .line 52
    .line 53
    invoke-virtual {p1}, Lxc/a;->b()Ljava/util/HashMap;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    move-object v0, p2

    .line 58
    check-cast v0, Ltc/g;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catch_0
    move-exception p1

    .line 65
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p2, Ltc/g;

    .line 70
    .line 71
    invoke-virtual {p2, v3, p1, v2}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    :try_start_1
    check-cast p1, Ljava/util/ArrayList;

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Ljava/lang/String;

    .line 83
    .line 84
    const/4 v4, 0x1

    .line 85
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    check-cast v4, Ljava/lang/String;

    .line 90
    .line 91
    const/4 v5, 0x2

    .line 92
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iget-object v0, v0, Lba/a;->c:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Lxc/a;

    .line 105
    .line 106
    move-object v5, p2

    .line 107
    check-cast v5, Ltc/g;

    .line 108
    .line 109
    invoke-virtual {v0, v1, v4, p1, v5}, Lxc/a;->a(Ljava/lang/String;Ljava/lang/String;ZLtc/g;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :catch_1
    move-exception p1

    .line 114
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p2, Ltc/g;

    .line 119
    .line 120
    invoke-virtual {p2, v3, p1, v2}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :goto_0
    return-void

    .line 124
    :pswitch_0
    iget-object p1, p0, La2/c;->b:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p1, La2/k;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_0
    .end packed-switch
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p1, p0, La2/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/concurrent/CountDownLatch;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public p(Lp9/A;)Ljava/util/List;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public q(Ljava/lang/String;Ljava/nio/ByteBuffer;)V
    .locals 2

    .line 1
    iget-object v0, p0, La2/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmc/j;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, p2, v1}, Lmc/j;->j(Ljava/lang/String;Ljava/nio/ByteBuffer;Luc/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public r()Ljava/util/Collection;
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public s()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La2/c;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Luc/q;

    .line 5
    .line 6
    const-string v2, "permissionRequestInProgress"

    .line 7
    .line 8
    const-string v3, "Another permission request is already in progress"

    .line 9
    .line 10
    invoke-interface {v1, v2, v3, v0}, Luc/q;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public start()V
    .locals 0

    .line 1
    return-void
.end method

.method public t(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, La2/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lad/L;

    .line 4
    .line 5
    iget-object v0, v0, Lad/L;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/util/HashSet;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 24
    .line 25
    return-object p1
.end method

.method public u(Ls9/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, La2/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lad/L;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lad/L;->e(Ls9/m;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public v()V
    .locals 0

    .line 1
    return-void
.end method

.method public w(Lo2/j;JJZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public x(Lp9/A;)Ls9/b;
    .locals 0

    .line 1
    sget-object p1, Ls9/b;->d:Ls9/b;

    .line 2
    .line 3
    return-object p1
.end method

.method public y(Lp9/A;)V
    .locals 0

    .line 1
    return-void
.end method

.method public z(Lp/k;)V
    .locals 2

    .line 1
    iget-object v0, p0, La2/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    .line 6
    .line 7
    iget-object v1, v1, Landroidx/appcompat/widget/ActionMenuView;->t:Lq/i;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lq/i;->j()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->G:Lk1/m;

    .line 19
    .line 20
    iget-object v0, v0, Lk1/m;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lk1/n;

    .line 37
    .line 38
    check-cast v1, Landroidx/fragment/app/V;

    .line 39
    .line 40
    iget-object v1, v1, Landroidx/fragment/app/V;->a:Landroidx/fragment/app/e0;

    .line 41
    .line 42
    invoke-virtual {v1, p1}, Landroidx/fragment/app/e0;->t(Landroid/view/Menu;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-void
.end method
