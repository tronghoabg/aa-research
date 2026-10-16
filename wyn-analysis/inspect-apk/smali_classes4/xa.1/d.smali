.class public final Lxa/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/c0;
.implements LA7/T;
.implements LD9/m;
.implements LI4/q;
.implements LI4/a;
.implements LI4/B;
.implements LHe/e;
.implements LB4/e;
.implements Lcom/google/android/gms/internal/ads/zzhcc;
.implements LR4/i;
.implements Lo2/n;
.implements LX1/g;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(FLA/n;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lxa/d;->a:I

    if-eqz p2, :cond_0

    .line 24
    new-instance v0, LA/d0;

    invoke-direct {v0, p1, p2}, LA/d0;-><init>(FLA/n;)V

    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, LY9/c;

    invoke-direct {v0, p1}, LY9/c;-><init>(F)V

    .line 26
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance p1, LS3/n;

    .line 28
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object v0, p1, LS3/n;->a:Ljava/lang/Object;

    .line 30
    iput-object p1, p0, Lxa/d;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lxa/d;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    if-lt p1, v0, :cond_0

    .line 9
    new-instance p1, LXd/c;

    const/16 v0, 0x10

    .line 10
    invoke-direct {p1, v0}, LXd/c;-><init>(I)V

    goto :goto_0

    .line 11
    :cond_0
    new-instance p1, Lc8/e;

    const/16 v0, 0x10

    .line 12
    invoke-direct {p1, v0}, Lc8/e;-><init>(I)V

    .line 13
    :goto_0
    iput-object p1, p0, Lxa/d;->b:Ljava/lang/Object;

    return-void

    .line 14
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x4

    .line 15
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lxa/d;->b:Ljava/lang/Object;

    return-void

    .line 16
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {p1}, Lxg/g;->v(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lxa/d;->b:Ljava/lang/Object;

    return-void

    .line 18
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lxa/d;->b:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_2
        0xe -> :sswitch_1
        0xf -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Lxa/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v0, 0x7

    iput v0, p0, Lxa/d;->a:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    sget-object v0, Lef/j;->c:Lef/j;

    new-instance v1, LA0/p;

    const/4 v2, 0x4

    invoke-direct {v1, p1, v2}, LA0/p;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    move-result-object p1

    iput-object p1, p0, Lxa/d;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    const/16 v0, 0x1c

    iput v0, p0, Lxa/d;->a:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, LYf/j;

    sget-object v1, LBf/a;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, LYf/j;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    iput-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lxa/d;->a:I

    iput-object p1, p0, Lxa/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lxa/d;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 4
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxa/c;

    iget-object v1, p0, Lxa/d;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    iget-object v0, v0, Lxa/c;->a:LO9/b;

    const-class v2, Lxa/a;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static G(Ljava/lang/String;)Lxa/d;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-le v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, LA7/F0;->e(C)LA7/H0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    sget-object p0, LA7/H0;->b:LA7/H0;

    .line 26
    .line 27
    :goto_1
    new-instance v0, Lxa/d;

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    invoke-direct {v0, p0, v1}, Lxa/d;-><init>(Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public static m(Landroid/net/NetworkCapabilities;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "none"

    .line 7
    .line 8
    if-eqz p0, :cond_9

    .line 9
    .line 10
    const/16 v2, 0xc

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v3, 0x1

    .line 20
    invoke-virtual {p0, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    const/4 v3, 0x5

    .line 27
    invoke-virtual {p0, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    :cond_1
    const-string v3, "wifi"

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_2
    const/4 v3, 0x3

    .line 39
    invoke-virtual {p0, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    const-string v3, "ethernet"

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_3
    const/4 v3, 0x4

    .line 51
    invoke-virtual {p0, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_4

    .line 56
    .line 57
    const-string v3, "vpn"

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :cond_4
    const/4 v3, 0x0

    .line 63
    invoke-virtual {p0, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_5

    .line 68
    .line 69
    const-string v3, "mobile"

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    :cond_5
    const/4 v3, 0x2

    .line 75
    invoke-virtual {p0, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_6

    .line 80
    .line 81
    const-string v3, "bluetooth"

    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_7

    .line 91
    .line 92
    invoke-virtual {p0, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_7

    .line 97
    .line 98
    const-string p0, "other"

    .line 99
    .line 100
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-eqz p0, :cond_8

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    :cond_8
    return-object v0

    .line 113
    :cond_9
    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    return-object v0
.end method

.method public static s(LPc/m;)LJ8/o;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/m;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object p0, p0, LPc/m;->b:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Lcom/google/firebase/auth/FirebaseAuth;->f(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p0, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 19
    .line 20
    return-object p0
.end method


# virtual methods
.method public A(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio sink error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LW1/v;

    .line 11
    .line 12
    iget-object v0, v0, LW1/v;->D0:LS3/s;

    .line 13
    .line 14
    iget-object v1, v0, LS3/s;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Landroid/os/Handler;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    new-instance v2, LW1/f;

    .line 21
    .line 22
    const/4 v3, 0x4

    .line 23
    invoke-direct {v2, v0, p1, v3}, LW1/f;-><init>(LS3/s;Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public B(Lorg/json/JSONObject;)LZ8/a;
    .locals 3

    .line 1
    const-string v0, "settings_version"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x3

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "Could not determine SettingsJsonTransform for settings version "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v0, ". Using default settings values."

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "FirebaseCrashlytics"

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-static {v1, v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 33
    .line 34
    .line 35
    new-instance v0, Lx4/d;

    .line 36
    .line 37
    const/16 v1, 0x1d

    .line 38
    .line 39
    invoke-direct {v0, v1}, Lx4/d;-><init>(I)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance v0, Lx9/d;

    .line 44
    .line 45
    const/16 v1, 0x1d

    .line 46
    .line 47
    invoke-direct {v0, v1}, Lx9/d;-><init>(I)V

    .line 48
    .line 49
    .line 50
    :goto_0
    iget-object v1, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Lm9/S;

    .line 53
    .line 54
    invoke-interface {v0, v1, p1}, LZ8/b;->l(Lm9/S;Lorg/json/JSONObject;)LZ8/a;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1
.end method

.method public C()V
    .locals 5

    .line 1
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LYf/j;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v1, LYf/e;->c:LYf/e;

    .line 9
    .line 10
    iget-object v0, v0, LYf/j;->c:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, "array(...)"

    .line 17
    .line 18
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    monitor-enter v1

    .line 25
    :try_start_0
    iget v2, v1, LYf/f;->b:I

    .line 26
    .line 27
    array-length v3, v0

    .line 28
    add-int/2addr v3, v2

    .line 29
    sget v4, LYf/d;->a:I

    .line 30
    .line 31
    if-ge v3, v4, :cond_0

    .line 32
    .line 33
    array-length v3, v0

    .line 34
    div-int/lit8 v3, v3, 0x2

    .line 35
    .line 36
    add-int/2addr v2, v3

    .line 37
    iput v2, v1, LYf/f;->b:I

    .line 38
    .line 39
    iget-object v2, v1, LYf/f;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, Lff/l;

    .line 42
    .line 43
    invoke-virtual {v2, v0}, Lff/l;->addLast(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    monitor-exit v1

    .line 50
    return-void

    .line 51
    :goto_1
    monitor-exit v1

    .line 52
    throw v0
.end method

.method public D()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public E()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    return-wide v0
.end method

.method public F(JJ)J
    .locals 0

    .line 1
    const-wide/16 p1, 0x1

    .line 2
    .line 3
    return-wide p1
.end method

.method public H()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/n0;

    .line 4
    .line 5
    iget-object v1, v0, LA7/n0;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, LA7/n0;->i:LA7/N;

    .line 14
    .line 15
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    invoke-virtual {v0, v1}, LA7/N;->l0(I)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LX1/f;

    .line 4
    .line 5
    iget-object v1, v0, LX1/f;->A:Lo2/m;

    .line 6
    .line 7
    invoke-virtual {v1}, Lo2/m;->a()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, LX1/f;->C:Lio/ktor/utils/io/T;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    throw v0
.end method

.method public b(J)J
    .locals 0

    .line 1
    const-wide/16 p1, 0x0

    .line 2
    .line 3
    return-wide p1
.end method

.method public c([BLjava/lang/Object;Ljava/security/MessageDigest;)V
    .locals 2

    .line 1
    check-cast p2, Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p3, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    monitor-enter p1

    .line 14
    :try_start_0
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p3, p2}, Ljava/security/MessageDigest;->update([B)V

    .line 39
    .line 40
    .line 41
    monitor-exit p1

    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p2

    .line 44
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    throw p2
.end method

.method public d(LI4/v;)LI4/p;
    .locals 3

    .line 1
    iget v0, p0, Lxa/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, LI4/C;

    .line 7
    .line 8
    invoke-direct {p1, p0}, LI4/C;-><init>(LI4/B;)V

    .line 9
    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_0
    new-instance v0, LI4/b;

    .line 13
    .line 14
    const-class v1, Landroid/net/Uri;

    .line 15
    .line 16
    const-class v2, Landroid/content/res/AssetFileDescriptor;

    .line 17
    .line 18
    invoke-virtual {p1, v1, v2}, LI4/v;->b(Ljava/lang/Class;Ljava/lang/Class;)LI4/p;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v1, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Landroid/content/res/Resources;

    .line 25
    .line 26
    invoke-direct {v0, v1, p1}, LI4/b;-><init>(Landroid/content/res/Resources;LI4/p;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance p1, LI4/b;

    .line 31
    .line 32
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Landroid/content/res/AssetManager;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {p1, v1, v0, p0}, LI4/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LB9/d;

    .line 4
    .line 5
    iget-object v1, v0, LB9/d;->h:LB9/f;

    .line 6
    .line 7
    iget-object v2, v1, LB9/f;->j:LN9/h;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget-object v1, v1, LB9/f;->k:Lz9/E;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, "Impression timer onFinish for: "

    .line 18
    .line 19
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, v0, LB9/d;->h:LB9/f;

    .line 23
    .line 24
    iget-object v2, v2, LB9/f;->j:LN9/h;

    .line 25
    .line 26
    iget-object v2, v2, LN9/h;->b:LE5/b;

    .line 27
    .line 28
    iget-object v2, v2, LE5/b;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1}, LD9/e;->e(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, v0, LB9/d;->h:LB9/f;

    .line 43
    .line 44
    iget-object v0, v0, LB9/f;->k:Lz9/E;

    .line 45
    .line 46
    check-cast v0, LJ9/o;

    .line 47
    .line 48
    invoke-virtual {v0}, LJ9/o;->b()Lcom/google/android/gms/tasks/Task;

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
.end method

.method public f(JLA/n;LA/n;LA/n;)LA/n;
    .locals 7

    .line 1
    const-string v0, "initialValue"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "targetValue"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "initialVelocity"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v1, v0

    .line 19
    check-cast v1, LS3/n;

    .line 20
    .line 21
    move-wide v2, p1

    .line 22
    move-object v4, p3

    .line 23
    move-object v5, p4

    .line 24
    move-object v6, p5

    .line 25
    invoke-virtual/range {v1 .. v6}, LS3/n;->f(JLA/n;LA/n;LA/n;)LA/n;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
.end method

.method public g(LRe/i;)V
    .locals 5

    .line 1
    const-string v0, "Subscribing to analytics events."

    .line 2
    .line 3
    invoke-static {v0}, Lic/d;->E(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LJ9/b;

    .line 9
    .line 10
    iget-object v1, v0, LJ9/b;->a:Lw8/d;

    .line 11
    .line 12
    new-instance v2, Ly3/j;

    .line 13
    .line 14
    const/16 v3, 0xe

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-direct {v2, v3, v4}, Ly3/j;-><init>(IZ)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v2, Ly3/j;->b:Ljava/lang/Object;

    .line 21
    .line 22
    const-string p1, "fiam"

    .line 23
    .line 24
    invoke-interface {v1, p1, v2}, Lw8/d;->h(Ljava/lang/String;Lw8/b;)Lw8/a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, v0, LJ9/b;->c:Lw8/a;

    .line 29
    .line 30
    return-void
.end method

.method public h(JLA/n;LA/n;LA/n;)LA/n;
    .locals 7

    .line 1
    const-string v0, "initialValue"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "targetValue"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "initialVelocity"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v1, v0

    .line 19
    check-cast v1, LS3/n;

    .line 20
    .line 21
    move-wide v2, p1

    .line 22
    move-object v4, p3

    .line 23
    move-object v5, p4

    .line 24
    move-object v6, p5

    .line 25
    invoke-virtual/range {v1 .. v6}, LS3/n;->h(JLA/n;LA/n;LA/n;)LA/n;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
.end method

.method public i(LA/n;LA/n;LA/n;)J
    .locals 1

    .line 1
    const-string v0, "initialValue"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "targetValue"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "initialVelocity"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LS3/n;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2, p3}, LS3/n;->i(LA/n;LA/n;LA/n;)J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    return-wide p1
.end method

.method public j(Landroid/net/Uri;)LC4/e;
    .locals 3

    .line 1
    new-instance v0, LC4/a;

    .line 2
    .line 3
    iget-object v1, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/ContentResolver;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v1, p1, v2}, LC4/a;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;I)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public k(Landroid/content/res/AssetManager;Ljava/lang/String;)LC4/e;
    .locals 2

    .line 1
    new-instance v0, LC4/k;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p1, p2, v1}, LC4/k;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public l(IILJ5/h;)V
    .locals 22

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p0

    .line 8
    .line 9
    iget-object v4, v3, Lxa/d;->b:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v5, v4

    .line 12
    check-cast v5, LP5/c;

    .line 13
    .line 14
    iget-object v4, v5, LP5/c;->c:Landroid/util/SparseArray;

    .line 15
    .line 16
    const/4 v6, 0x4

    .line 17
    const/4 v7, 0x2

    .line 18
    const/4 v12, 0x0

    .line 19
    const/4 v13, 0x1

    .line 20
    const/16 v8, 0xa1

    .line 21
    .line 22
    const/16 v9, 0xa3

    .line 23
    .line 24
    const/4 v10, 0x0

    .line 25
    if-eq v0, v8, :cond_b

    .line 26
    .line 27
    if-eq v0, v9, :cond_b

    .line 28
    .line 29
    const/16 v8, 0xa5

    .line 30
    .line 31
    if-eq v0, v8, :cond_8

    .line 32
    .line 33
    const/16 v4, 0x41ed

    .line 34
    .line 35
    if-eq v0, v4, :cond_5

    .line 36
    .line 37
    const/16 v4, 0x4255

    .line 38
    .line 39
    if-eq v0, v4, :cond_4

    .line 40
    .line 41
    const/16 v4, 0x47e2

    .line 42
    .line 43
    if-eq v0, v4, :cond_3

    .line 44
    .line 45
    const/16 v4, 0x53ab

    .line 46
    .line 47
    if-eq v0, v4, :cond_2

    .line 48
    .line 49
    const/16 v4, 0x63a2

    .line 50
    .line 51
    if-eq v0, v4, :cond_1

    .line 52
    .line 53
    const/16 v4, 0x7672

    .line 54
    .line 55
    if-ne v0, v4, :cond_0

    .line 56
    .line 57
    invoke-virtual {v5, v0}, LP5/c;->c(I)V

    .line 58
    .line 59
    .line 60
    iget-object v0, v5, LP5/c;->u:LP5/b;

    .line 61
    .line 62
    new-array v4, v1, [B

    .line 63
    .line 64
    iput-object v4, v0, LP5/b;->v:[B

    .line 65
    .line 66
    invoke-virtual {v2, v4, v12, v1, v12}, LJ5/h;->f([BIIZ)Z

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string v2, "Unexpected id: "

    .line 73
    .line 74
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0, v10}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    throw v0

    .line 89
    :cond_1
    invoke-virtual {v5, v0}, LP5/c;->c(I)V

    .line 90
    .line 91
    .line 92
    iget-object v0, v5, LP5/c;->u:LP5/b;

    .line 93
    .line 94
    new-array v4, v1, [B

    .line 95
    .line 96
    iput-object v4, v0, LP5/b;->k:[B

    .line 97
    .line 98
    invoke-virtual {v2, v4, v12, v1, v12}, LJ5/h;->f([BIIZ)Z

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_2
    iget-object v0, v5, LP5/c;->i:LY4/b;

    .line 103
    .line 104
    iget-object v4, v0, LY4/b;->a:[B

    .line 105
    .line 106
    invoke-static {v4, v12}, Ljava/util/Arrays;->fill([BB)V

    .line 107
    .line 108
    .line 109
    iget-object v4, v0, LY4/b;->a:[B

    .line 110
    .line 111
    rsub-int/lit8 v6, v1, 0x4

    .line 112
    .line 113
    invoke-virtual {v2, v4, v6, v1, v12}, LJ5/h;->f([BIIZ)Z

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v12}, LY4/b;->A(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, LY4/b;->r()J

    .line 120
    .line 121
    .line 122
    move-result-wide v0

    .line 123
    long-to-int v0, v0

    .line 124
    iput v0, v5, LP5/c;->w:I

    .line 125
    .line 126
    return-void

    .line 127
    :cond_3
    new-array v4, v1, [B

    .line 128
    .line 129
    invoke-virtual {v2, v4, v12, v1, v12}, LJ5/h;->f([BIIZ)Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5, v0}, LP5/c;->c(I)V

    .line 133
    .line 134
    .line 135
    iget-object v0, v5, LP5/c;->u:LP5/b;

    .line 136
    .line 137
    new-instance v1, LJ5/v;

    .line 138
    .line 139
    invoke-direct {v1, v13, v4, v12, v12}, LJ5/v;-><init>(I[BII)V

    .line 140
    .line 141
    .line 142
    iput-object v1, v0, LP5/b;->j:LJ5/v;

    .line 143
    .line 144
    return-void

    .line 145
    :cond_4
    invoke-virtual {v5, v0}, LP5/c;->c(I)V

    .line 146
    .line 147
    .line 148
    iget-object v0, v5, LP5/c;->u:LP5/b;

    .line 149
    .line 150
    new-array v4, v1, [B

    .line 151
    .line 152
    iput-object v4, v0, LP5/b;->i:[B

    .line 153
    .line 154
    invoke-virtual {v2, v4, v12, v1, v12}, LJ5/h;->f([BIIZ)Z

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_5
    invoke-virtual {v5, v0}, LP5/c;->c(I)V

    .line 159
    .line 160
    .line 161
    iget-object v0, v5, LP5/c;->u:LP5/b;

    .line 162
    .line 163
    iget v4, v0, LP5/b;->g:I

    .line 164
    .line 165
    const v5, 0x64767643

    .line 166
    .line 167
    .line 168
    if-eq v4, v5, :cond_7

    .line 169
    .line 170
    const v5, 0x64766343

    .line 171
    .line 172
    .line 173
    if-ne v4, v5, :cond_6

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_6
    invoke-virtual {v2, v1}, LJ5/h;->j(I)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_7
    :goto_0
    new-array v4, v1, [B

    .line 181
    .line 182
    iput-object v4, v0, LP5/b;->N:[B

    .line 183
    .line 184
    invoke-virtual {v2, v4, v12, v1, v12}, LJ5/h;->f([BIIZ)Z

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_8
    iget v0, v5, LP5/c;->G:I

    .line 189
    .line 190
    if-eq v0, v7, :cond_9

    .line 191
    .line 192
    goto/16 :goto_12

    .line 193
    .line 194
    :cond_9
    iget v0, v5, LP5/c;->M:I

    .line 195
    .line 196
    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, LP5/b;

    .line 201
    .line 202
    iget v4, v5, LP5/c;->P:I

    .line 203
    .line 204
    if-ne v4, v6, :cond_a

    .line 205
    .line 206
    const-string v4, "V_VP9"

    .line 207
    .line 208
    iget-object v0, v0, LP5/b;->b:Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_a

    .line 215
    .line 216
    iget-object v0, v5, LP5/c;->n:LY4/b;

    .line 217
    .line 218
    invoke-virtual {v0, v1}, LY4/b;->x(I)V

    .line 219
    .line 220
    .line 221
    iget-object v0, v0, LY4/b;->a:[B

    .line 222
    .line 223
    invoke-virtual {v2, v0, v12, v1, v12}, LJ5/h;->f([BIIZ)Z

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_a
    invoke-virtual {v2, v1}, LJ5/h;->j(I)V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :cond_b
    iget v8, v5, LP5/c;->G:I

    .line 232
    .line 233
    const/16 v11, 0x8

    .line 234
    .line 235
    iget-object v14, v5, LP5/c;->g:LY4/b;

    .line 236
    .line 237
    if-nez v8, :cond_c

    .line 238
    .line 239
    iget-object v8, v5, LP5/c;->b:LP5/d;

    .line 240
    .line 241
    invoke-virtual {v8, v2, v12, v13, v11}, LP5/d;->c(LJ5/h;ZZI)J

    .line 242
    .line 243
    .line 244
    move-result-wide v9

    .line 245
    long-to-int v9, v9

    .line 246
    iput v9, v5, LP5/c;->M:I

    .line 247
    .line 248
    iget v8, v8, LP5/d;->c:I

    .line 249
    .line 250
    iput v8, v5, LP5/c;->N:I

    .line 251
    .line 252
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    iput-wide v8, v5, LP5/c;->I:J

    .line 258
    .line 259
    iput v13, v5, LP5/c;->G:I

    .line 260
    .line 261
    invoke-virtual {v14, v12}, LY4/b;->x(I)V

    .line 262
    .line 263
    .line 264
    :cond_c
    iget v8, v5, LP5/c;->M:I

    .line 265
    .line 266
    invoke-virtual {v4, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    check-cast v4, LP5/b;

    .line 271
    .line 272
    if-nez v4, :cond_d

    .line 273
    .line 274
    iget v0, v5, LP5/c;->N:I

    .line 275
    .line 276
    sub-int v0, v1, v0

    .line 277
    .line 278
    invoke-virtual {v2, v0}, LJ5/h;->j(I)V

    .line 279
    .line 280
    .line 281
    iput v12, v5, LP5/c;->G:I

    .line 282
    .line 283
    return-void

    .line 284
    :cond_d
    iget-object v8, v4, LP5/b;->X:LJ5/w;

    .line 285
    .line 286
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    iget v8, v5, LP5/c;->G:I

    .line 290
    .line 291
    if-ne v8, v13, :cond_22

    .line 292
    .line 293
    const/4 v8, 0x3

    .line 294
    invoke-virtual {v5, v2, v8}, LP5/c;->j(LJ5/h;I)V

    .line 295
    .line 296
    .line 297
    iget-object v9, v14, LY4/b;->a:[B

    .line 298
    .line 299
    aget-byte v9, v9, v7

    .line 300
    .line 301
    and-int/lit8 v9, v9, 0x6

    .line 302
    .line 303
    shr-int/2addr v9, v13

    .line 304
    const/16 v10, 0xff

    .line 305
    .line 306
    if-nez v9, :cond_10

    .line 307
    .line 308
    iput v13, v5, LP5/c;->K:I

    .line 309
    .line 310
    iget-object v6, v5, LP5/c;->L:[I

    .line 311
    .line 312
    if-nez v6, :cond_e

    .line 313
    .line 314
    new-array v6, v13, [I

    .line 315
    .line 316
    goto :goto_1

    .line 317
    :cond_e
    array-length v9, v6

    .line 318
    if-lt v9, v13, :cond_f

    .line 319
    .line 320
    goto :goto_1

    .line 321
    :cond_f
    array-length v6, v6

    .line 322
    mul-int/2addr v6, v7

    .line 323
    invoke-static {v6, v13}, Ljava/lang/Math;->max(II)I

    .line 324
    .line 325
    .line 326
    move-result v6

    .line 327
    new-array v6, v6, [I

    .line 328
    .line 329
    :goto_1
    iput-object v6, v5, LP5/c;->L:[I

    .line 330
    .line 331
    iget v9, v5, LP5/c;->N:I

    .line 332
    .line 333
    sub-int/2addr v1, v9

    .line 334
    sub-int/2addr v1, v8

    .line 335
    aput v1, v6, v12

    .line 336
    .line 337
    :goto_2
    move/from16 v19, v12

    .line 338
    .line 339
    move/from16 v17, v13

    .line 340
    .line 341
    goto/16 :goto_b

    .line 342
    .line 343
    :cond_10
    invoke-virtual {v5, v2, v6}, LP5/c;->j(LJ5/h;I)V

    .line 344
    .line 345
    .line 346
    move/from16 v17, v6

    .line 347
    .line 348
    iget-object v6, v14, LY4/b;->a:[B

    .line 349
    .line 350
    aget-byte v6, v6, v8

    .line 351
    .line 352
    and-int/2addr v6, v10

    .line 353
    add-int/2addr v6, v13

    .line 354
    iput v6, v5, LP5/c;->K:I

    .line 355
    .line 356
    iget-object v15, v5, LP5/c;->L:[I

    .line 357
    .line 358
    if-nez v15, :cond_11

    .line 359
    .line 360
    new-array v15, v6, [I

    .line 361
    .line 362
    goto :goto_3

    .line 363
    :cond_11
    array-length v11, v15

    .line 364
    if-lt v11, v6, :cond_12

    .line 365
    .line 366
    goto :goto_3

    .line 367
    :cond_12
    array-length v11, v15

    .line 368
    mul-int/2addr v11, v7

    .line 369
    invoke-static {v11, v6}, Ljava/lang/Math;->max(II)I

    .line 370
    .line 371
    .line 372
    move-result v6

    .line 373
    new-array v15, v6, [I

    .line 374
    .line 375
    :goto_3
    iput-object v15, v5, LP5/c;->L:[I

    .line 376
    .line 377
    if-ne v9, v7, :cond_13

    .line 378
    .line 379
    iget v6, v5, LP5/c;->N:I

    .line 380
    .line 381
    sub-int/2addr v1, v6

    .line 382
    add-int/lit8 v1, v1, -0x4

    .line 383
    .line 384
    iget v6, v5, LP5/c;->K:I

    .line 385
    .line 386
    div-int/2addr v1, v6

    .line 387
    invoke-static {v15, v12, v6, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 388
    .line 389
    .line 390
    goto :goto_2

    .line 391
    :cond_13
    if-ne v9, v13, :cond_16

    .line 392
    .line 393
    move v8, v12

    .line 394
    move v9, v8

    .line 395
    move/from16 v6, v17

    .line 396
    .line 397
    :goto_4
    iget v11, v5, LP5/c;->K:I

    .line 398
    .line 399
    sub-int/2addr v11, v13

    .line 400
    if-ge v8, v11, :cond_15

    .line 401
    .line 402
    iget-object v11, v5, LP5/c;->L:[I

    .line 403
    .line 404
    aput v12, v11, v8

    .line 405
    .line 406
    :goto_5
    add-int/lit8 v11, v6, 0x1

    .line 407
    .line 408
    invoke-virtual {v5, v2, v11}, LP5/c;->j(LJ5/h;I)V

    .line 409
    .line 410
    .line 411
    iget-object v15, v14, LY4/b;->a:[B

    .line 412
    .line 413
    aget-byte v6, v15, v6

    .line 414
    .line 415
    and-int/2addr v6, v10

    .line 416
    iget-object v15, v5, LP5/c;->L:[I

    .line 417
    .line 418
    aget v16, v15, v8

    .line 419
    .line 420
    add-int v16, v16, v6

    .line 421
    .line 422
    aput v16, v15, v8

    .line 423
    .line 424
    if-eq v6, v10, :cond_14

    .line 425
    .line 426
    add-int v9, v9, v16

    .line 427
    .line 428
    add-int/lit8 v8, v8, 0x1

    .line 429
    .line 430
    move v6, v11

    .line 431
    goto :goto_4

    .line 432
    :cond_14
    move v6, v11

    .line 433
    goto :goto_5

    .line 434
    :cond_15
    iget-object v8, v5, LP5/c;->L:[I

    .line 435
    .line 436
    iget v15, v5, LP5/c;->N:I

    .line 437
    .line 438
    sub-int/2addr v1, v15

    .line 439
    sub-int/2addr v1, v6

    .line 440
    sub-int/2addr v1, v9

    .line 441
    aput v1, v8, v11

    .line 442
    .line 443
    goto :goto_2

    .line 444
    :cond_16
    if-ne v9, v8, :cond_21

    .line 445
    .line 446
    move v8, v12

    .line 447
    move v9, v8

    .line 448
    move/from16 v6, v17

    .line 449
    .line 450
    :goto_6
    iget v11, v5, LP5/c;->K:I

    .line 451
    .line 452
    sub-int/2addr v11, v13

    .line 453
    if-ge v8, v11, :cond_1e

    .line 454
    .line 455
    iget-object v11, v5, LP5/c;->L:[I

    .line 456
    .line 457
    aput v12, v11, v8

    .line 458
    .line 459
    add-int/lit8 v11, v6, 0x1

    .line 460
    .line 461
    invoke-virtual {v5, v2, v11}, LP5/c;->j(LJ5/h;I)V

    .line 462
    .line 463
    .line 464
    iget-object v15, v14, LY4/b;->a:[B

    .line 465
    .line 466
    aget-byte v15, v15, v6

    .line 467
    .line 468
    if-eqz v15, :cond_1d

    .line 469
    .line 470
    move/from16 v17, v13

    .line 471
    .line 472
    move v13, v12

    .line 473
    :goto_7
    const/16 v15, 0x8

    .line 474
    .line 475
    if-ge v13, v15, :cond_19

    .line 476
    .line 477
    rsub-int/lit8 v15, v13, 0x7

    .line 478
    .line 479
    shl-int v15, v17, v15

    .line 480
    .line 481
    move/from16 v19, v12

    .line 482
    .line 483
    iget-object v12, v14, LY4/b;->a:[B

    .line 484
    .line 485
    aget-byte v12, v12, v6

    .line 486
    .line 487
    and-int/2addr v12, v15

    .line 488
    if-eqz v12, :cond_18

    .line 489
    .line 490
    add-int v12, v11, v13

    .line 491
    .line 492
    invoke-virtual {v5, v2, v12}, LP5/c;->j(LJ5/h;I)V

    .line 493
    .line 494
    .line 495
    iget-object v7, v14, LY4/b;->a:[B

    .line 496
    .line 497
    aget-byte v6, v7, v6

    .line 498
    .line 499
    and-int/2addr v6, v10

    .line 500
    not-int v7, v15

    .line 501
    and-int/2addr v6, v7

    .line 502
    int-to-long v6, v6

    .line 503
    :goto_8
    if-ge v11, v12, :cond_17

    .line 504
    .line 505
    const/16 v18, 0x8

    .line 506
    .line 507
    shl-long v6, v6, v18

    .line 508
    .line 509
    iget-object v15, v14, LY4/b;->a:[B

    .line 510
    .line 511
    add-int/lit8 v20, v11, 0x1

    .line 512
    .line 513
    aget-byte v11, v15, v11

    .line 514
    .line 515
    and-int/2addr v11, v10

    .line 516
    int-to-long v10, v11

    .line 517
    or-long/2addr v6, v10

    .line 518
    move/from16 v11, v20

    .line 519
    .line 520
    const/16 v10, 0xff

    .line 521
    .line 522
    goto :goto_8

    .line 523
    :cond_17
    if-lez v8, :cond_1a

    .line 524
    .line 525
    mul-int/lit8 v13, v13, 0x7

    .line 526
    .line 527
    add-int/lit8 v13, v13, 0x6

    .line 528
    .line 529
    const-wide/16 v10, 0x1

    .line 530
    .line 531
    shl-long v20, v10, v13

    .line 532
    .line 533
    sub-long v20, v20, v10

    .line 534
    .line 535
    sub-long v6, v6, v20

    .line 536
    .line 537
    goto :goto_9

    .line 538
    :cond_18
    add-int/lit8 v13, v13, 0x1

    .line 539
    .line 540
    move/from16 v12, v19

    .line 541
    .line 542
    const/4 v7, 0x2

    .line 543
    const/16 v10, 0xff

    .line 544
    .line 545
    goto :goto_7

    .line 546
    :cond_19
    move/from16 v19, v12

    .line 547
    .line 548
    const-wide/16 v6, 0x0

    .line 549
    .line 550
    move v12, v11

    .line 551
    :cond_1a
    :goto_9
    const-wide/32 v10, -0x80000000

    .line 552
    .line 553
    .line 554
    cmp-long v10, v6, v10

    .line 555
    .line 556
    if-ltz v10, :cond_1c

    .line 557
    .line 558
    const-wide/32 v10, 0x7fffffff

    .line 559
    .line 560
    .line 561
    cmp-long v10, v6, v10

    .line 562
    .line 563
    if-gtz v10, :cond_1c

    .line 564
    .line 565
    long-to-int v6, v6

    .line 566
    iget-object v7, v5, LP5/c;->L:[I

    .line 567
    .line 568
    if-nez v8, :cond_1b

    .line 569
    .line 570
    goto :goto_a

    .line 571
    :cond_1b
    add-int/lit8 v10, v8, -0x1

    .line 572
    .line 573
    aget v10, v7, v10

    .line 574
    .line 575
    add-int/2addr v6, v10

    .line 576
    :goto_a
    aput v6, v7, v8

    .line 577
    .line 578
    add-int/2addr v9, v6

    .line 579
    add-int/lit8 v8, v8, 0x1

    .line 580
    .line 581
    move v6, v12

    .line 582
    move/from16 v13, v17

    .line 583
    .line 584
    move/from16 v12, v19

    .line 585
    .line 586
    const/4 v7, 0x2

    .line 587
    const/16 v10, 0xff

    .line 588
    .line 589
    goto/16 :goto_6

    .line 590
    .line 591
    :cond_1c
    const-string v0, "EBML lacing sample size out of range."

    .line 592
    .line 593
    const/4 v1, 0x0

    .line 594
    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    throw v0

    .line 599
    :cond_1d
    const/4 v1, 0x0

    .line 600
    const-string v0, "No valid varint length mask found"

    .line 601
    .line 602
    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    throw v0

    .line 607
    :cond_1e
    move/from16 v19, v12

    .line 608
    .line 609
    move/from16 v17, v13

    .line 610
    .line 611
    iget-object v7, v5, LP5/c;->L:[I

    .line 612
    .line 613
    iget v8, v5, LP5/c;->N:I

    .line 614
    .line 615
    sub-int/2addr v1, v8

    .line 616
    sub-int/2addr v1, v6

    .line 617
    sub-int/2addr v1, v9

    .line 618
    aput v1, v7, v11

    .line 619
    .line 620
    :goto_b
    iget-object v1, v14, LY4/b;->a:[B

    .line 621
    .line 622
    aget-byte v6, v1, v19

    .line 623
    .line 624
    const/16 v18, 0x8

    .line 625
    .line 626
    shl-int/lit8 v6, v6, 0x8

    .line 627
    .line 628
    aget-byte v1, v1, v17

    .line 629
    .line 630
    const/16 v15, 0xff

    .line 631
    .line 632
    and-int/2addr v1, v15

    .line 633
    or-int/2addr v1, v6

    .line 634
    iget-wide v6, v5, LP5/c;->B:J

    .line 635
    .line 636
    int-to-long v8, v1

    .line 637
    invoke-virtual {v5, v8, v9}, LP5/c;->l(J)J

    .line 638
    .line 639
    .line 640
    move-result-wide v8

    .line 641
    add-long/2addr v8, v6

    .line 642
    iput-wide v8, v5, LP5/c;->H:J

    .line 643
    .line 644
    iget v1, v4, LP5/b;->d:I

    .line 645
    .line 646
    const/4 v6, 0x2

    .line 647
    if-eq v1, v6, :cond_20

    .line 648
    .line 649
    const/16 v15, 0xa3

    .line 650
    .line 651
    if-ne v0, v15, :cond_1f

    .line 652
    .line 653
    iget-object v1, v14, LY4/b;->a:[B

    .line 654
    .line 655
    aget-byte v1, v1, v6

    .line 656
    .line 657
    const/16 v7, 0x80

    .line 658
    .line 659
    and-int/2addr v1, v7

    .line 660
    if-ne v1, v7, :cond_1f

    .line 661
    .line 662
    goto :goto_c

    .line 663
    :cond_1f
    move/from16 v1, v19

    .line 664
    .line 665
    goto :goto_d

    .line 666
    :cond_20
    :goto_c
    move/from16 v1, v17

    .line 667
    .line 668
    :goto_d
    iput v1, v5, LP5/c;->O:I

    .line 669
    .line 670
    iput v6, v5, LP5/c;->G:I

    .line 671
    .line 672
    move/from16 v1, v19

    .line 673
    .line 674
    iput v1, v5, LP5/c;->J:I

    .line 675
    .line 676
    :goto_e
    const/16 v15, 0xa3

    .line 677
    .line 678
    goto :goto_f

    .line 679
    :cond_21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 680
    .line 681
    const-string v1, "Unexpected lacing value: "

    .line 682
    .line 683
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    const/4 v1, 0x0

    .line 694
    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    throw v0

    .line 699
    :cond_22
    move/from16 v17, v13

    .line 700
    .line 701
    goto :goto_e

    .line 702
    :goto_f
    if-ne v0, v15, :cond_24

    .line 703
    .line 704
    :goto_10
    iget v0, v5, LP5/c;->J:I

    .line 705
    .line 706
    iget v1, v5, LP5/c;->K:I

    .line 707
    .line 708
    if-ge v0, v1, :cond_23

    .line 709
    .line 710
    iget-object v1, v5, LP5/c;->L:[I

    .line 711
    .line 712
    aget v0, v1, v0

    .line 713
    .line 714
    const/4 v1, 0x0

    .line 715
    invoke-virtual {v5, v2, v4, v0, v1}, LP5/c;->m(LJ5/h;LP5/b;IZ)I

    .line 716
    .line 717
    .line 718
    move-result v10

    .line 719
    iget-wide v0, v5, LP5/c;->H:J

    .line 720
    .line 721
    iget v6, v5, LP5/c;->J:I

    .line 722
    .line 723
    iget v7, v4, LP5/b;->e:I

    .line 724
    .line 725
    mul-int/2addr v6, v7

    .line 726
    div-int/lit16 v6, v6, 0x3e8

    .line 727
    .line 728
    int-to-long v6, v6

    .line 729
    add-long/2addr v0, v6

    .line 730
    iget v9, v5, LP5/c;->O:I

    .line 731
    .line 732
    const/4 v11, 0x0

    .line 733
    move-wide v7, v0

    .line 734
    move-object v6, v4

    .line 735
    invoke-virtual/range {v5 .. v11}, LP5/c;->d(LP5/b;JIII)V

    .line 736
    .line 737
    .line 738
    iget v0, v5, LP5/c;->J:I

    .line 739
    .line 740
    add-int/lit8 v0, v0, 0x1

    .line 741
    .line 742
    iput v0, v5, LP5/c;->J:I

    .line 743
    .line 744
    goto :goto_10

    .line 745
    :cond_23
    const/4 v1, 0x0

    .line 746
    iput v1, v5, LP5/c;->G:I

    .line 747
    .line 748
    return-void

    .line 749
    :cond_24
    move-object v6, v4

    .line 750
    :goto_11
    iget v0, v5, LP5/c;->J:I

    .line 751
    .line 752
    iget v1, v5, LP5/c;->K:I

    .line 753
    .line 754
    if-ge v0, v1, :cond_25

    .line 755
    .line 756
    iget-object v1, v5, LP5/c;->L:[I

    .line 757
    .line 758
    aget v4, v1, v0

    .line 759
    .line 760
    move/from16 v7, v17

    .line 761
    .line 762
    invoke-virtual {v5, v2, v6, v4, v7}, LP5/c;->m(LJ5/h;LP5/b;IZ)I

    .line 763
    .line 764
    .line 765
    move-result v4

    .line 766
    aput v4, v1, v0

    .line 767
    .line 768
    iget v0, v5, LP5/c;->J:I

    .line 769
    .line 770
    add-int/2addr v0, v7

    .line 771
    iput v0, v5, LP5/c;->J:I

    .line 772
    .line 773
    goto :goto_11

    .line 774
    :cond_25
    :goto_12
    return-void
.end method

.method public n(LA/n;LA/n;LA/n;)LA/n;
    .locals 1

    .line 1
    const-string v0, "initialValue"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "targetValue"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "initialVelocity"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LS3/n;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2, p3}, LS3/n;->n(LA/n;LA/n;LA/n;)LA/n;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method public o(JJ)J
    .locals 0

    .line 1
    return-wide p3
.end method

.method public p()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LS3/n;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public q(JJ)J
    .locals 0

    .line 1
    const-wide/16 p1, 0x0

    .line 2
    .line 3
    return-wide p1
.end method

.method public r(JJ)J
    .locals 0

    .line 1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide p1
.end method

.method public t(Ljava/lang/String;ILjava/io/IOException;[BLjava/util/Map;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, LA7/L1;

    .line 5
    .line 6
    move-object v2, p1

    .line 7
    move v3, p2

    .line 8
    move-object v4, p3

    .line 9
    move-object v5, p4

    .line 10
    move-object v6, p5

    .line 11
    invoke-virtual/range {v1 .. v6}, LA7/L1;->J(Ljava/lang/String;ILjava/io/IOException;[BLjava/util/Map;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lxa/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "{fragment="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, LR4/g;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "}"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_0
    .end packed-switch
.end method

.method public u(J)LY1/j;
    .locals 0

    .line 1
    iget-object p1, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, LY1/j;

    .line 4
    .line 5
    return-object p1
.end method

.method public v(JJ)J
    .locals 0

    .line 1
    const-wide/16 p1, 0x0

    .line 2
    .line 3
    return-wide p1
.end method

.method public w(J)J
    .locals 0

    .line 1
    const-wide/16 p1, 0x1

    .line 2
    .line 3
    return-wide p1
.end method

.method public x(IJ)V
    .locals 9

    .line 1
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LP5/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x5031

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-string v3, " not supported"

    .line 12
    .line 13
    if-eq p1, v1, :cond_16

    .line 14
    .line 15
    const/16 v1, 0x5032

    .line 16
    .line 17
    const-wide/16 v4, 0x1

    .line 18
    .line 19
    if-eq p1, v1, :cond_14

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    const/4 v6, 0x3

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x2

    .line 25
    sparse-switch p1, :sswitch_data_0

    .line 26
    .line 27
    .line 28
    const/4 v2, -0x1

    .line 29
    packed-switch p1, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :pswitch_0
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 35
    .line 36
    .line 37
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 38
    .line 39
    long-to-int p2, p2

    .line 40
    iput p2, p1, LP5/b;->C:I

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_1
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 44
    .line 45
    .line 46
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 47
    .line 48
    long-to-int p2, p2

    .line 49
    iput p2, p1, LP5/b;->B:I

    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_2
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 53
    .line 54
    .line 55
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 56
    .line 57
    iput-boolean v1, p1, LP5/b;->x:Z

    .line 58
    .line 59
    long-to-int p1, p2

    .line 60
    invoke-static {p1}, Lv6/b;->a(I)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eq p1, v2, :cond_17

    .line 65
    .line 66
    iget-object p2, v0, LP5/c;->u:LP5/b;

    .line 67
    .line 68
    iput p1, p2, LP5/b;->y:I

    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_3
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 72
    .line 73
    .line 74
    long-to-int p1, p2

    .line 75
    if-eq p1, v1, :cond_2

    .line 76
    .line 77
    const/16 p2, 0x10

    .line 78
    .line 79
    const/4 p3, 0x6

    .line 80
    if-eq p1, p2, :cond_1

    .line 81
    .line 82
    const/16 p2, 0x12

    .line 83
    .line 84
    const/4 v1, 0x7

    .line 85
    if-eq p1, p2, :cond_0

    .line 86
    .line 87
    if-eq p1, p3, :cond_2

    .line 88
    .line 89
    if-eq p1, v1, :cond_2

    .line 90
    .line 91
    move v6, v2

    .line 92
    goto :goto_0

    .line 93
    :cond_0
    move v6, v1

    .line 94
    goto :goto_0

    .line 95
    :cond_1
    move v6, p3

    .line 96
    :cond_2
    :goto_0
    if-eq v6, v2, :cond_17

    .line 97
    .line 98
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 99
    .line 100
    iput v6, p1, LP5/b;->z:I

    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_4
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 104
    .line 105
    .line 106
    long-to-int p1, p2

    .line 107
    if-eq p1, v1, :cond_4

    .line 108
    .line 109
    if-eq p1, v8, :cond_3

    .line 110
    .line 111
    goto/16 :goto_3

    .line 112
    .line 113
    :cond_3
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 114
    .line 115
    iput v1, p1, LP5/b;->A:I

    .line 116
    .line 117
    return-void

    .line 118
    :cond_4
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 119
    .line 120
    iput v8, p1, LP5/b;->A:I

    .line 121
    .line 122
    return-void

    .line 123
    :sswitch_0
    iput-wide p2, v0, LP5/c;->r:J

    .line 124
    .line 125
    return-void

    .line 126
    :sswitch_1
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 127
    .line 128
    .line 129
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 130
    .line 131
    long-to-int p2, p2

    .line 132
    iput p2, p1, LP5/b;->e:I

    .line 133
    .line 134
    return-void

    .line 135
    :sswitch_2
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 136
    .line 137
    .line 138
    long-to-int p1, p2

    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    if-eq p1, v1, :cond_7

    .line 142
    .line 143
    if-eq p1, v8, :cond_6

    .line 144
    .line 145
    if-eq p1, v6, :cond_5

    .line 146
    .line 147
    goto/16 :goto_3

    .line 148
    .line 149
    :cond_5
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 150
    .line 151
    iput v6, p1, LP5/b;->r:I

    .line 152
    .line 153
    return-void

    .line 154
    :cond_6
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 155
    .line 156
    iput v8, p1, LP5/b;->r:I

    .line 157
    .line 158
    return-void

    .line 159
    :cond_7
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 160
    .line 161
    iput v1, p1, LP5/b;->r:I

    .line 162
    .line 163
    return-void

    .line 164
    :cond_8
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 165
    .line 166
    iput v7, p1, LP5/b;->r:I

    .line 167
    .line 168
    return-void

    .line 169
    :sswitch_3
    iput-wide p2, v0, LP5/c;->R:J

    .line 170
    .line 171
    return-void

    .line 172
    :sswitch_4
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 173
    .line 174
    .line 175
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 176
    .line 177
    long-to-int p2, p2

    .line 178
    iput p2, p1, LP5/b;->P:I

    .line 179
    .line 180
    return-void

    .line 181
    :sswitch_5
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 182
    .line 183
    .line 184
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 185
    .line 186
    iput-wide p2, p1, LP5/b;->S:J

    .line 187
    .line 188
    return-void

    .line 189
    :sswitch_6
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 190
    .line 191
    .line 192
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 193
    .line 194
    iput-wide p2, p1, LP5/b;->R:J

    .line 195
    .line 196
    return-void

    .line 197
    :sswitch_7
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 198
    .line 199
    .line 200
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 201
    .line 202
    long-to-int p2, p2

    .line 203
    iput p2, p1, LP5/b;->f:I

    .line 204
    .line 205
    return-void

    .line 206
    :sswitch_8
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 207
    .line 208
    .line 209
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 210
    .line 211
    cmp-long p2, p2, v4

    .line 212
    .line 213
    if-nez p2, :cond_9

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_9
    move v1, v7

    .line 217
    :goto_1
    iput-boolean v1, p1, LP5/b;->U:Z

    .line 218
    .line 219
    return-void

    .line 220
    :sswitch_9
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 221
    .line 222
    .line 223
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 224
    .line 225
    long-to-int p2, p2

    .line 226
    iput p2, p1, LP5/b;->p:I

    .line 227
    .line 228
    return-void

    .line 229
    :sswitch_a
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 230
    .line 231
    .line 232
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 233
    .line 234
    long-to-int p2, p2

    .line 235
    iput p2, p1, LP5/b;->q:I

    .line 236
    .line 237
    return-void

    .line 238
    :sswitch_b
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 239
    .line 240
    .line 241
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 242
    .line 243
    long-to-int p2, p2

    .line 244
    iput p2, p1, LP5/b;->o:I

    .line 245
    .line 246
    return-void

    .line 247
    :sswitch_c
    long-to-int p2, p2

    .line 248
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 249
    .line 250
    .line 251
    if-eqz p2, :cond_d

    .line 252
    .line 253
    if-eq p2, v1, :cond_c

    .line 254
    .line 255
    if-eq p2, v6, :cond_b

    .line 256
    .line 257
    const/16 p1, 0xf

    .line 258
    .line 259
    if-eq p2, p1, :cond_a

    .line 260
    .line 261
    goto/16 :goto_3

    .line 262
    .line 263
    :cond_a
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 264
    .line 265
    iput v6, p1, LP5/b;->w:I

    .line 266
    .line 267
    return-void

    .line 268
    :cond_b
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 269
    .line 270
    iput v1, p1, LP5/b;->w:I

    .line 271
    .line 272
    return-void

    .line 273
    :cond_c
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 274
    .line 275
    iput v8, p1, LP5/b;->w:I

    .line 276
    .line 277
    return-void

    .line 278
    :cond_d
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 279
    .line 280
    iput v7, p1, LP5/b;->w:I

    .line 281
    .line 282
    return-void

    .line 283
    :sswitch_d
    iget-wide v1, v0, LP5/c;->q:J

    .line 284
    .line 285
    add-long/2addr p2, v1

    .line 286
    iput-wide p2, v0, LP5/c;->x:J

    .line 287
    .line 288
    return-void

    .line 289
    :sswitch_e
    cmp-long p1, p2, v4

    .line 290
    .line 291
    if-nez p1, :cond_e

    .line 292
    .line 293
    goto/16 :goto_3

    .line 294
    .line 295
    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    .line 296
    .line 297
    const-string v0, "AESSettingsCipherMode "

    .line 298
    .line 299
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    invoke-static {p1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    throw p1

    .line 317
    :sswitch_f
    const-wide/16 v0, 0x5

    .line 318
    .line 319
    cmp-long p1, p2, v0

    .line 320
    .line 321
    if-nez p1, :cond_f

    .line 322
    .line 323
    goto/16 :goto_3

    .line 324
    .line 325
    :cond_f
    new-instance p1, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    const-string v0, "ContentEncAlgo "

    .line 328
    .line 329
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    invoke-static {p1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    throw p1

    .line 347
    :sswitch_10
    cmp-long p1, p2, v4

    .line 348
    .line 349
    if-nez p1, :cond_10

    .line 350
    .line 351
    goto/16 :goto_3

    .line 352
    .line 353
    :cond_10
    new-instance p1, Ljava/lang/StringBuilder;

    .line 354
    .line 355
    const-string v0, "EBMLReadVersion "

    .line 356
    .line 357
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    invoke-static {p1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    throw p1

    .line 375
    :sswitch_11
    cmp-long p1, p2, v4

    .line 376
    .line 377
    if-ltz p1, :cond_11

    .line 378
    .line 379
    const-wide/16 v0, 0x2

    .line 380
    .line 381
    cmp-long p1, p2, v0

    .line 382
    .line 383
    if-gtz p1, :cond_11

    .line 384
    .line 385
    goto/16 :goto_3

    .line 386
    .line 387
    :cond_11
    new-instance p1, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    const-string v0, "DocTypeReadVersion "

    .line 390
    .line 391
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object p1

    .line 404
    invoke-static {p1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    throw p1

    .line 409
    :sswitch_12
    const-wide/16 v0, 0x3

    .line 410
    .line 411
    cmp-long p1, p2, v0

    .line 412
    .line 413
    if-nez p1, :cond_12

    .line 414
    .line 415
    goto/16 :goto_3

    .line 416
    .line 417
    :cond_12
    new-instance p1, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    const-string v0, "ContentCompAlgo "

    .line 420
    .line 421
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object p1

    .line 434
    invoke-static {p1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    throw p1

    .line 439
    :sswitch_13
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 440
    .line 441
    .line 442
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 443
    .line 444
    long-to-int p2, p2

    .line 445
    iput p2, p1, LP5/b;->g:I

    .line 446
    .line 447
    return-void

    .line 448
    :sswitch_14
    iput-boolean v1, v0, LP5/c;->Q:Z

    .line 449
    .line 450
    return-void

    .line 451
    :sswitch_15
    iget-boolean v2, v0, LP5/c;->E:Z

    .line 452
    .line 453
    if-nez v2, :cond_17

    .line 454
    .line 455
    invoke-virtual {v0, p1}, LP5/c;->b(I)V

    .line 456
    .line 457
    .line 458
    iget-object p1, v0, LP5/c;->D:LQ1/l;

    .line 459
    .line 460
    invoke-virtual {p1, p2, p3}, LQ1/l;->a(J)V

    .line 461
    .line 462
    .line 463
    iput-boolean v1, v0, LP5/c;->E:Z

    .line 464
    .line 465
    return-void

    .line 466
    :sswitch_16
    long-to-int p1, p2

    .line 467
    iput p1, v0, LP5/c;->P:I

    .line 468
    .line 469
    return-void

    .line 470
    :sswitch_17
    invoke-virtual {v0, p2, p3}, LP5/c;->l(J)J

    .line 471
    .line 472
    .line 473
    move-result-wide p1

    .line 474
    iput-wide p1, v0, LP5/c;->B:J

    .line 475
    .line 476
    return-void

    .line 477
    :sswitch_18
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 478
    .line 479
    .line 480
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 481
    .line 482
    long-to-int p2, p2

    .line 483
    iput p2, p1, LP5/b;->c:I

    .line 484
    .line 485
    return-void

    .line 486
    :sswitch_19
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 487
    .line 488
    .line 489
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 490
    .line 491
    long-to-int p2, p2

    .line 492
    iput p2, p1, LP5/b;->n:I

    .line 493
    .line 494
    return-void

    .line 495
    :sswitch_1a
    invoke-virtual {v0, p1}, LP5/c;->b(I)V

    .line 496
    .line 497
    .line 498
    iget-object p1, v0, LP5/c;->C:LQ1/l;

    .line 499
    .line 500
    invoke-virtual {v0, p2, p3}, LP5/c;->l(J)J

    .line 501
    .line 502
    .line 503
    move-result-wide p2

    .line 504
    invoke-virtual {p1, p2, p3}, LQ1/l;->a(J)V

    .line 505
    .line 506
    .line 507
    return-void

    .line 508
    :sswitch_1b
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 509
    .line 510
    .line 511
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 512
    .line 513
    long-to-int p2, p2

    .line 514
    iput p2, p1, LP5/b;->m:I

    .line 515
    .line 516
    return-void

    .line 517
    :sswitch_1c
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 518
    .line 519
    .line 520
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 521
    .line 522
    long-to-int p2, p2

    .line 523
    iput p2, p1, LP5/b;->O:I

    .line 524
    .line 525
    return-void

    .line 526
    :sswitch_1d
    invoke-virtual {v0, p2, p3}, LP5/c;->l(J)J

    .line 527
    .line 528
    .line 529
    move-result-wide p1

    .line 530
    iput-wide p1, v0, LP5/c;->I:J

    .line 531
    .line 532
    return-void

    .line 533
    :sswitch_1e
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 534
    .line 535
    .line 536
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 537
    .line 538
    cmp-long p2, p2, v4

    .line 539
    .line 540
    if-nez p2, :cond_13

    .line 541
    .line 542
    goto :goto_2

    .line 543
    :cond_13
    move v1, v7

    .line 544
    :goto_2
    iput-boolean v1, p1, LP5/b;->V:Z

    .line 545
    .line 546
    return-void

    .line 547
    :sswitch_1f
    invoke-virtual {v0, p1}, LP5/c;->c(I)V

    .line 548
    .line 549
    .line 550
    iget-object p1, v0, LP5/c;->u:LP5/b;

    .line 551
    .line 552
    long-to-int p2, p2

    .line 553
    iput p2, p1, LP5/b;->d:I

    .line 554
    .line 555
    return-void

    .line 556
    :cond_14
    cmp-long p1, p2, v4

    .line 557
    .line 558
    if-nez p1, :cond_15

    .line 559
    .line 560
    goto :goto_3

    .line 561
    :cond_15
    new-instance p1, Ljava/lang/StringBuilder;

    .line 562
    .line 563
    const-string v0, "ContentEncodingScope "

    .line 564
    .line 565
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object p1

    .line 578
    invoke-static {p1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 579
    .line 580
    .line 581
    move-result-object p1

    .line 582
    throw p1

    .line 583
    :cond_16
    const-wide/16 v0, 0x0

    .line 584
    .line 585
    cmp-long p1, p2, v0

    .line 586
    .line 587
    if-nez p1, :cond_18

    .line 588
    .line 589
    :cond_17
    :goto_3
    return-void

    .line 590
    :cond_18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 591
    .line 592
    const-string v0, "ContentEncodingOrder "

    .line 593
    .line 594
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object p1

    .line 607
    invoke-static {p1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 608
    .line 609
    .line 610
    move-result-object p1

    .line 611
    throw p1

    .line 612
    nop

    .line 613
    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_1f
        0x88 -> :sswitch_1e
        0x9b -> :sswitch_1d
        0x9f -> :sswitch_1c
        0xb0 -> :sswitch_1b
        0xb3 -> :sswitch_1a
        0xba -> :sswitch_19
        0xd7 -> :sswitch_18
        0xe7 -> :sswitch_17
        0xee -> :sswitch_16
        0xf1 -> :sswitch_15
        0xfb -> :sswitch_14
        0x41e7 -> :sswitch_13
        0x4254 -> :sswitch_12
        0x4285 -> :sswitch_11
        0x42f7 -> :sswitch_10
        0x47e1 -> :sswitch_f
        0x47e8 -> :sswitch_e
        0x53ac -> :sswitch_d
        0x53b8 -> :sswitch_c
        0x54b0 -> :sswitch_b
        0x54b2 -> :sswitch_a
        0x54ba -> :sswitch_9
        0x55aa -> :sswitch_8
        0x55ee -> :sswitch_7
        0x56aa -> :sswitch_6
        0x56bb -> :sswitch_5
        0x6264 -> :sswitch_4
        0x75a2 -> :sswitch_3
        0x7671 -> :sswitch_2
        0x23e383 -> :sswitch_1
        0x2ad7b1 -> :sswitch_0
    .end sparse-switch

    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    :pswitch_data_0
    .packed-switch 0x55b9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public y()LG4/b;
    .locals 2

    .line 1
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, LG4/b;

    .line 15
    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    new-instance v0, LG4/b;

    .line 20
    .line 21
    invoke-direct {v0}, LG4/b;-><init>()V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    return-object v1

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v1
.end method

.method public z(LG4/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v2, 0xa

    .line 15
    .line 16
    if-ge v1, v2, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/util/ArrayDeque;

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p1
.end method

.method public zza(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/ads/zzdlv;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzdlv;->zzb(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic zzb(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/ads/zzdlv;

    .line 4
    .line 5
    check-cast p1, LN6/s;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzdlv;->zza(LN6/s;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
