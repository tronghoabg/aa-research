.class public Ly3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/chromium/support_lib_boundary/WebMessageListenerBoundaryInterface;
.implements LD9/m;
.implements LZ4/a;
.implements Lcom/google/android/gms/internal/ads/zzcmx;
.implements LI4/q;
.implements LI4/B;
.implements Lw8/b;
.implements Ll1/o;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements LP8/b;
.implements LQ8/a;
.implements LP2/d;
.implements LR4/i;
.implements Luc/p;
.implements Lo2/h;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Ly3/j;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance p1, LI4/z;

    const/4 v0, 0x7

    .line 19
    invoke-direct {p1, v0}, LI4/z;-><init>(I)V

    .line 20
    iput-object p1, p0, Ly3/j;->b:Ljava/lang/Object;

    return-void

    .line 21
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ly3/j;->b:Ljava/lang/Object;

    return-void

    .line 23
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance p1, Landroid/media/AudioAttributes$Builder;

    invoke-direct {p1}, Landroid/media/AudioAttributes$Builder;-><init>()V

    iput-object p1, p0, Ly3/j;->b:Ljava/lang/Object;

    return-void

    .line 25
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance p1, LY4/b;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, LY4/b;-><init>(I)V

    iput-object p1, p0, Ly3/j;->b:Ljava/lang/Object;

    return-void

    .line 27
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance p1, LPd/b;

    invoke-direct {p1}, LPd/b;-><init>()V

    iput-object p1, p0, Ly3/j;->b:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_3
        0xd -> :sswitch_2
        0xf -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Ly3/j;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LA7/L1;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ly3/j;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iget-object p1, p1, LA7/L1;->l:LA7/n0;

    .line 5
    iput-object p1, p0, Ly3/j;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LN1/c;)V
    .locals 2

    const/16 v0, 0x12

    iput v0, p0, Ly3/j;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    iget v1, p1, LN1/c;->a:I

    .line 8
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    iget v1, p1, LN1/c;->b:I

    .line 9
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    iget p1, p1, LN1/c;->c:I

    .line 10
    invoke-virtual {v0, p1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    .line 11
    sget v0, LQ1/x;->a:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 12
    invoke-static {p1}, LG5/d;->n(Landroid/media/AudioAttributes$Builder;)V

    :cond_0
    const/16 v1, 0x20

    if-lt v0, v1, :cond_1

    .line 13
    invoke-static {p1}, LG5/f;->e(Landroid/media/AudioAttributes$Builder;)V

    .line 14
    :cond_1
    invoke-virtual {p1}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p1

    iput-object p1, p0, Ly3/j;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ly3/j;->a:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, LS3/s;

    invoke-direct {v0, p1}, LS3/s;-><init>(Landroid/widget/EditText;)V

    iput-object v0, p0, Ly3/j;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Ly3/j;->a:I

    iput-object p1, p0, Ly3/j;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static r(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lorg/json/JSONObject;

    .line 7
    .line 8
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-string p0, "name"

    .line 40
    .line 41
    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    const-string p0, "parameters"

    .line 45
    .line 46
    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method


# virtual methods
.method public A(Lo2/j;JJ)V
    .locals 4

    .line 1
    check-cast p1, Lo2/p;

    .line 2
    .line 3
    iget-object v0, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LX1/f;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v1, Lk2/z;

    .line 11
    .line 12
    iget-wide v2, p1, Lo2/p;->a:J

    .line 13
    .line 14
    iget-object v2, p1, Lo2/p;->d:LS1/z;

    .line 15
    .line 16
    iget-object v2, v2, LS1/z;->c:Landroid/net/Uri;

    .line 17
    .line 18
    invoke-direct {v1, p4, p5}, Lk2/z;-><init>(J)V

    .line 19
    .line 20
    .line 21
    iget-object p4, v0, LX1/f;->m:Lae/d;

    .line 22
    .line 23
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object p4, v0, LX1/f;->q:LZ1/d;

    .line 27
    .line 28
    iget p5, p1, Lo2/p;->c:I

    .line 29
    .line 30
    invoke-virtual {p4, v1, p5}, LZ1/d;->d(Lk2/z;I)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p1, Lo2/p;->f:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/lang/Long;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 38
    .line 39
    .line 40
    move-result-wide p4

    .line 41
    sub-long/2addr p4, p2

    .line 42
    iput-wide p4, v0, LX1/f;->L:J

    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    invoke-virtual {v0, p1}, LX1/f;->y(Z)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public E(Lo2/j;JJLjava/io/IOException;I)LU5/f;
    .locals 2

    .line 1
    check-cast p1, Lo2/p;

    .line 2
    .line 3
    iget-object p2, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p2, LX1/f;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p3, Lk2/z;

    .line 11
    .line 12
    iget-wide v0, p1, Lo2/p;->a:J

    .line 13
    .line 14
    iget-object p7, p1, Lo2/p;->d:LS1/z;

    .line 15
    .line 16
    iget-object p7, p7, LS1/z;->c:Landroid/net/Uri;

    .line 17
    .line 18
    invoke-direct {p3, p4, p5}, Lk2/z;-><init>(J)V

    .line 19
    .line 20
    .line 21
    iget p1, p1, Lo2/p;->c:I

    .line 22
    .line 23
    const/4 p4, 0x1

    .line 24
    iget-object p5, p2, LX1/f;->q:LZ1/d;

    .line 25
    .line 26
    invoke-virtual {p5, p3, p1, p6, p4}, LZ1/d;->g(Lk2/z;ILjava/io/IOException;Z)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p2, LX1/f;->m:Lae/d;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, p6}, LX1/f;->x(Ljava/io/IOException;)V

    .line 35
    .line 36
    .line 37
    sget-object p1, Lo2/m;->e:LU5/f;

    .line 38
    .line 39
    return-object p1
.end method

.method public a(J)I
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    if-gez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, -0x1

    .line 10
    return p1
.end method

.method public b(LR8/r;)V
    .locals 2

    .line 1
    iput-object p1, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    const-string p1, "FirebaseCrashlytics"

    .line 4
    .line 5
    const/4 v0, 0x3

    .line 6
    invoke-static {p1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string v0, "Registered Firebase Analytics event receiver for breadcrumbs"

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {p1, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public c()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, LE4/k;

    .line 2
    .line 3
    iget-object v1, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LE4/n;

    .line 6
    .line 7
    iget-object v2, v1, LE4/n;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ld7/j;

    .line 10
    .line 11
    iget-object v1, v1, LE4/n;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, LDd/c;

    .line 14
    .line 15
    invoke-direct {v0, v2, v1}, LE4/k;-><init>(Ld7/j;LDd/c;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public d(LI4/v;)LI4/p;
    .locals 2

    .line 1
    iget p1, p0, Ly3/j;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

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
    new-instance p1, LI4/c;

    .line 13
    .line 14
    iget-object v0, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LI4/z;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {p1, v0, v1}, LI4/c;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public e()V
    .locals 3

    .line 1
    iget-object v0, p0, Ly3/j;->b:Ljava/lang/Object;

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
    sget-object v2, Lz9/C;->b:Lz9/C;

    .line 16
    .line 17
    check-cast v1, LJ9/o;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, LJ9/o;->f(Lz9/C;)Lcom/google/android/gms/tasks/Task;

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v1, v0, LB9/d;->f:Landroid/app/Activity;

    .line 23
    .line 24
    iget-object v0, v0, LB9/d;->h:LB9/f;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const-string v2, "Dismissing fiam"

    .line 30
    .line 31
    invoke-static {v2}, LD9/e;->a(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, LB9/f;->e(Landroid/app/Activity;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    iput-object v1, v0, LB9/f;->j:LN9/h;

    .line 39
    .line 40
    iput-object v1, v0, LB9/f;->k:Lz9/E;

    .line 41
    .line 42
    return-void
.end method

.method public f(ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    const-string p1, "events"

    .line 5
    .line 6
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p2, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p2, LRe/i;

    .line 13
    .line 14
    invoke-interface {p2, p1}, LHe/d;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public g(J)Ljava/util/List;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ljava/util/List;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 13
    .line 14
    return-object p1
.end method

.method public getSupportedFeatures()[Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "WEB_MESSAGE_LISTENER"

    .line 2
    .line 3
    const-string v1, "WEB_MESSAGE_ARRAY_BUFFER"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public h()Landroidx/media/AudioAttributesImpl;
    .locals 2

    .line 1
    new-instance v0, Landroidx/media/AudioAttributesImplApi21;

    .line 2
    .line 3
    iget-object v1, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/media/AudioAttributes$Builder;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/media/AudioAttributesImplApi21;-><init>(Landroid/media/AudioAttributes;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public i()La4/h;
    .locals 3

    .line 1
    iget-object v0, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/b0;

    .line 4
    .line 5
    iget-object v1, v0, LA7/b0;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La4/f;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    const/4 v2, 0x1

    .line 11
    :try_start_0
    invoke-virtual {v0, v2}, LA7/b0;->l(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, LA7/b0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La4/b;

    .line 17
    .line 18
    iget-object v0, v0, La4/b;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, La4/f;->d(Ljava/lang/String;)La4/c;

    .line 21
    .line 22
    .line 23
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    monitor-exit v1

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    new-instance v1, La4/h;

    .line 28
    .line 29
    invoke-direct {v1, v0}, La4/h;-><init>(La4/c;)V

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    return-object v0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    monitor-exit v1

    .line 37
    throw v0
.end method

.method public j(Landroid/net/Uri;)LC4/e;
    .locals 3

    .line 1
    new-instance v0, LC4/a;

    .line 2
    .line 3
    iget-object v1, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/ContentResolver;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, p1, v2}, LC4/a;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;I)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public k(I)J
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p1, 0x0

    .line 6
    :goto_0
    invoke-static {p1}, LQ1/k;->c(Z)V

    .line 7
    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    return-wide v0
.end method

.method public l(Landroid/view/View;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->r(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_4

    .line 11
    .line 12
    sget-object v1, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v3, 0x1

    .line 19
    if-ne v1, v3, :cond_0

    .line 20
    .line 21
    move v2, v3

    .line 22
    :cond_0
    iget v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->d:I

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    :cond_1
    if-ne v0, v3, :cond_3

    .line 29
    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    neg-int v0, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 47
    .line 48
    .line 49
    return v3

    .line 50
    :cond_4
    return v2
.end method

.method public m(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 9

    .line 1
    const-string v0, "$A$:"

    .line 2
    .line 3
    iget-object v1, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LR8/r;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, p2}, Ly3/j;->r(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    iget-object v4, v1, LR8/r;->a:LR8/s;

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    iget-wide v0, v4, LR8/s;->d:J

    .line 35
    .line 36
    sub-long v5, p1, v0

    .line 37
    .line 38
    iget-object p1, v4, LR8/s;->p:LS8/f;

    .line 39
    .line 40
    iget-object p1, p1, LS8/f;->a:LS8/c;

    .line 41
    .line 42
    new-instance v3, LR8/o;

    .line 43
    .line 44
    const/4 v8, 0x1

    .line 45
    invoke-direct/range {v3 .. v8}, LR8/o;-><init>(LR8/s;JLjava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v3}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catch_0
    const-string p1, "Unable to serialize Firebase Analytics event to breadcrumb."

    .line 53
    .line 54
    const/4 p2, 0x0

    .line 55
    const-string v0, "FirebaseCrashlytics"

    .line 56
    .line 57
    invoke-static {v0, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void
.end method

.method public n(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio sink error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LG5/K;

    .line 11
    .line 12
    iget-object v0, v0, LG5/K;->F0:LG5/p;

    .line 13
    .line 14
    iget-object v1, v0, LG5/p;->b:Landroid/os/Handler;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    new-instance v2, LG5/n;

    .line 19
    .line 20
    const/4 v3, 0x6

    .line 21
    invoke-direct {v2, v0, p1, v3}, LG5/n;-><init>(LG5/p;Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public o(LJ5/h;Lb6/g;)LW5/c;
    .locals 8

    .line 1
    iget-object v0, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LY4/b;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v1

    .line 8
    :goto_0
    :try_start_0
    iget-object v4, v0, LY4/b;->a:[B

    .line 9
    .line 10
    const/16 v5, 0xa

    .line 11
    .line 12
    invoke-virtual {p1, v4, v1, v5, v1}, LJ5/h;->c([BIIZ)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, LY4/b;->A(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, LY4/b;->s()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const v6, 0x494433

    .line 23
    .line 24
    .line 25
    if-eq v4, v6, :cond_0

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    const/4 v4, 0x3

    .line 29
    invoke-virtual {v0, v4}, LY4/b;->B(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, LY4/b;->p()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    add-int/lit8 v6, v4, 0xa

    .line 37
    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    new-array v2, v6, [B

    .line 41
    .line 42
    iget-object v7, v0, LY4/b;->a:[B

    .line 43
    .line 44
    invoke-static {v7, v1, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v2, v5, v4, v1}, LJ5/h;->c([BIIZ)Z

    .line 48
    .line 49
    .line 50
    new-instance v4, Lb6/h;

    .line 51
    .line 52
    invoke-direct {v4, p2}, Lb6/h;-><init>(Lb6/g;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v6, v2}, Lb6/h;->O(I[B)LW5/c;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {p1, v4, v1}, LJ5/h;->b(IZ)Z

    .line 61
    .line 62
    .line 63
    :goto_1
    add-int/2addr v3, v6

    .line 64
    goto :goto_0

    .line 65
    :catch_0
    :goto_2
    iput v1, p1, LJ5/h;->f:I

    .line 66
    .line 67
    invoke-virtual {p1, v3, v1}, LJ5/h;->b(IZ)Z

    .line 68
    .line 69
    .line 70
    return-object v2
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LEf/n;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-virtual {v1, p1}, LEf/n;->a(Ljava/lang/Throwable;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v1, p1}, LEf/n;->resumeWith(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v1, p1}, LEf/n;->resumeWith(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public onMethodCall(Luc/o;Luc/q;)V
    .locals 1

    .line 1
    const-string v0, "check"

    .line 2
    .line 3
    iget-object p1, p1, Luc/o;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lxa/d;

    .line 14
    .line 15
    iget-object p1, p1, Lxa/d;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lxa/d;->m(Landroid/net/NetworkCapabilities;)Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p2, Ltc/g;

    .line 32
    .line 33
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    check-cast p2, Ltc/g;

    .line 38
    .line 39
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public onPostMessage(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;Landroid/net/Uri;ZLjava/lang/reflect/InvocationHandler;)V
    .locals 7

    .line 1
    const-class v0, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    .line 2
    .line 3
    invoke-static {v0, p2}, Ltg/b;->o(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    .line 8
    .line 9
    invoke-interface {p2}, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;->getPorts()[Ljava/lang/reflect/InvocationHandler;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    array-length v1, v0

    .line 14
    new-array v1, v1, [Lcom/google/android/gms/ads/nativead/l;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    array-length v3, v0

    .line 18
    if-ge v2, v3, :cond_0

    .line 19
    .line 20
    new-instance v3, Lcom/google/android/gms/ads/nativead/l;

    .line 21
    .line 22
    aget-object v4, v0, v2

    .line 23
    .line 24
    const/16 v5, 0x1b

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    invoke-direct {v3, v5, v6}, Lcom/google/android/gms/ads/nativead/l;-><init>(IZ)V

    .line 28
    .line 29
    .line 30
    const-class v5, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    .line 31
    .line 32
    invoke-static {v5, v4}, Ltg/b;->o(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    .line 37
    .line 38
    iput-object v4, v3, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 39
    .line 40
    aput-object v3, v1, v2

    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    sget-object v0, Ly3/o;->d:Ly3/b;

    .line 46
    .line 47
    invoke-virtual {v0}, Ly3/c;->b()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    const-class v0, Lorg/chromium/support_lib_boundary/WebMessagePayloadBoundaryInterface;

    .line 54
    .line 55
    invoke-interface {p2}, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;->getMessagePayload()Ljava/lang/reflect/InvocationHandler;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-static {v0, p2}, Ltg/b;->o(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    check-cast p2, Lorg/chromium/support_lib_boundary/WebMessagePayloadBoundaryInterface;

    .line 64
    .line 65
    invoke-interface {p2}, Lorg/chromium/support_lib_boundary/WebMessagePayloadBoundaryInterface;->getType()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    if-eq v0, v1, :cond_1

    .line 73
    .line 74
    const/4 p2, 0x0

    .line 75
    move-object v3, p2

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    new-instance v0, Lx3/e;

    .line 78
    .line 79
    invoke-interface {p2}, Lorg/chromium/support_lib_boundary/WebMessagePayloadBoundaryInterface;->getAsArrayBuffer()[B

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-direct {v0, p2}, Lx3/e;-><init>([B)V

    .line 84
    .line 85
    .line 86
    :goto_1
    move-object v3, v0

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    new-instance v0, Lx3/e;

    .line 89
    .line 90
    invoke-interface {p2}, Lorg/chromium/support_lib_boundary/WebMessagePayloadBoundaryInterface;->getAsString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-direct {v0, p2}, Lx3/e;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    new-instance v0, Lx3/e;

    .line 99
    .line 100
    invoke-interface {p2}, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;->getData()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-direct {v0, p2}, Lx3/e;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :goto_2
    if-eqz v3, :cond_4

    .line 109
    .line 110
    const-class p2, Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;

    .line 111
    .line 112
    invoke-static {p2, p5}, Ltg/b;->o(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    check-cast p2, Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;

    .line 117
    .line 118
    new-instance p5, LG8/c;

    .line 119
    .line 120
    const/16 v0, 0xe

    .line 121
    .line 122
    invoke-direct {p5, p2, v0}, LG8/c;-><init>(Ljava/lang/Object;I)V

    .line 123
    .line 124
    .line 125
    invoke-interface {p2, p5}, Lorg/chromium/support_lib_boundary/IsomorphicObjectBoundaryInterface;->getOrCreatePeer(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    move-object v6, p2

    .line 130
    check-cast v6, Ly3/f;

    .line 131
    .line 132
    iget-object p2, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 133
    .line 134
    move-object v1, p2

    .line 135
    check-cast v1, Lx3/i;

    .line 136
    .line 137
    move-object v2, p1

    .line 138
    move-object v4, p3

    .line 139
    move v5, p4

    .line 140
    invoke-interface/range {v1 .. v6}, Lx3/i;->onPostMessage(Landroid/webkit/WebView;Lx3/e;Landroid/net/Uri;ZLx3/a;)V

    .line 141
    .line 142
    .line 143
    :cond_4
    return-void
.end method

.method public p()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public q(Lwa/a;)V
    .locals 1

    .line 1
    const-string v0, "definition"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LPd/b;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, LPd/b;->a(Lwa/a;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, LVa/M6;->z(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public s(I)Ly3/j;
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/16 p1, 0xc

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/media/AudioAttributes$Builder;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public bridge t(I)Ly3/j;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ly3/j;->s(I)Ly3/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Ly3/j;->a:I

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
    iget-object v1, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, LR4/j;

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

.method public u(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 11

    .line 1
    iget v0, p0, Ly3/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LA7/L1;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object p1, v1, LA7/L1;->l:LA7/n0;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object p1, p1, LA7/n0;->i:LA7/N;

    .line 21
    .line 22
    invoke-static {p1}, LA7/n0;->d(LA7/D0;)V

    .line 23
    .line 24
    .line 25
    const-string p3, "AppId not known when logging event"

    .line 26
    .line 27
    iget-object p1, p1, LA7/N;->f:LA7/P;

    .line 28
    .line 29
    invoke-virtual {p1, p3, p2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    move-object v2, p0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v1}, LA7/L1;->zzl()LA7/k0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, LA7/W0;

    .line 39
    .line 40
    const/4 v6, 0x5

    .line 41
    move-object v2, p0

    .line 42
    move-object v3, p1

    .line 43
    move-object v4, p2

    .line 44
    move-object v5, p3

    .line 45
    invoke-direct/range {v1 .. v6}, LA7/W0;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    return-void

    .line 52
    :pswitch_0
    move-object v2, p0

    .line 53
    move-object v3, p1

    .line 54
    move-object v5, p3

    .line 55
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iget-object p2, v2, Ly3/j;->b:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v3, p2

    .line 62
    check-cast v3, LA7/P0;

    .line 63
    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    iget-object p1, v3, LA7/B0;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, LA7/n0;

    .line 69
    .line 70
    iget-object p1, p1, LA7/n0;->n:Ln7/b;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 76
    .line 77
    .line 78
    move-result-wide v9

    .line 79
    const/4 v7, 0x1

    .line 80
    const/4 v8, 0x1

    .line 81
    const-string v4, "auto"

    .line 82
    .line 83
    move-object v6, v5

    .line 84
    const-string v5, "_err"

    .line 85
    .line 86
    invoke-virtual/range {v3 .. v10}, LA7/P0;->w0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    iget-object p1, v3, LA7/B0;->a:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p1, LA7/n0;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    const-string p2, "Unexpected call on client side"

    .line 100
    .line 101
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p1

    .line 105
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public v()Z
    .locals 5

    .line 1
    iget-object v0, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/n0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    iget-object v2, v0, LA7/n0;->a:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {v2}, Lp7/c;->a(Landroid/content/Context;)LE0/a;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    iget-object v2, v0, LA7/n0;->i:LA7/N;

    .line 15
    .line 16
    invoke-static {v2}, LA7/n0;->d(LA7/D0;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v2, LA7/N;->n:LA7/P;

    .line 20
    .line 21
    const-string v3, "Failed to get PackageManager for Install Referrer Play Store compatibility check"

    .line 22
    .line 23
    invoke-virtual {v2, v3}, LA7/P;->c(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return v1

    .line 27
    :catch_0
    move-exception v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string v3, "com.android.vending"

    .line 30
    .line 31
    const/16 v4, 0x80

    .line 32
    .line 33
    invoke-virtual {v2, v4, v3}, LE0/a;->c(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v0, v2, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    const v2, 0x4d17ab4

    .line 40
    .line 41
    .line 42
    if-lt v0, v2, :cond_1

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    return v0

    .line 46
    :cond_1
    return v1

    .line 47
    :goto_0
    iget-object v0, v0, LA7/n0;->i:LA7/N;

    .line 48
    .line 49
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 50
    .line 51
    .line 52
    const-string v3, "Failed to retrieve Play Store version for Install Referrer"

    .line 53
    .line 54
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 55
    .line 56
    invoke-virtual {v0, v3, v2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return v1
.end method

.method public w(Lo2/j;JJZ)V
    .locals 0

    .line 1
    check-cast p1, Lo2/p;

    .line 2
    .line 3
    iget-object p2, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p2, LX1/f;

    .line 6
    .line 7
    invoke-virtual {p2, p1, p4, p5}, LX1/f;->v(Lo2/p;J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic zza(ZILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p1, p0, Ly3/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, LF6/l;

    .line 4
    .line 5
    iget-object p1, p1, LF6/l;->c:Lcom/google/android/gms/internal/ads/zzclb;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzclb;->zzI()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
