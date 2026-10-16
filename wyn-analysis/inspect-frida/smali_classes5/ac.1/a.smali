.class public final Lac/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements Lf6/W;
.implements Lo2/h;
.implements Lk2/b0;
.implements Lk1/r;
.implements Lo2/o;
.implements Lk1/c;
.implements Lh6/f;
.implements Lm2/c;
.implements Lq/G0;
.implements Lnb/b;
.implements Lp/w;
.implements Lq2/r;
.implements Lr9/w;
.implements Luc/p;
.implements Lu1/b;
.implements Lx3/b;
.implements Lzg/f;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Lac/a;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance p1, Le0/b;

    invoke-direct {p1}, Le0/b;-><init>()V

    iput-object p1, p0, Lac/a;->b:Ljava/lang/Object;

    return-void

    .line 14
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lac/a;->b:Ljava/lang/Object;

    return-void

    .line 15
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance p1, Lwa/a;

    const/16 v0, 0x18

    .line 17
    invoke-direct {p1, v0}, Lwa/a;-><init>(I)V

    .line 18
    iput-object p1, p0, Lac/a;->b:Ljava/lang/Object;

    return-void

    .line 19
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    :try_start_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object p1

    iput-object p1, p0, Lac/a;->b:Ljava/lang/Object;
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 21
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Couldn\'t create XmlPullParserFactory instance"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_2
        0xc -> :sswitch_1
        0xf -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Lac/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lac/a;->a:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-static {p1, p2}, Le1/c;->i(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, Lac/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lac/a;->a:I

    iput-object p1, p0, Lac/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lmc/b;)V
    .locals 5

    const/16 v0, 0x16

    iput v0, p0, Lac/a;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, La9/a;

    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v1, Luc/r;

    sget-object v2, Luc/m;->a:Luc/m;

    const/4 v3, 0x0

    .line 7
    const-string v4, "flutter/navigation"

    invoke-direct {v1, p1, v4, v2, v3}, Luc/r;-><init>(Luc/f;Ljava/lang/String;Luc/s;Lab/b;)V

    .line 8
    iput-object v1, p0, Lac/a;->b:Ljava/lang/Object;

    .line 9
    invoke-virtual {v1, v0}, Luc/r;->b(Luc/p;)V

    return-void
.end method

.method public constructor <init>(Ltf/l;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, Lac/a;->a:I

    const-string v0, "produceNewData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    check-cast p1, Lkotlin/jvm/internal/n;

    iput-object p1, p0, Lac/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public static G(Landroid/graphics/Rect;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Landroid/graphics/Rect;->left:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x2c

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget v2, p0, Landroid/graphics/Rect;->top:I

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public static I(Landroid/graphics/Rect;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x2c

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static K(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "Thread - "

    .line 10
    .line 11
    const-string v2, " "

    .line 12
    .line 13
    invoke-static {v1, v0, v2, p0}, LN0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public A(Lo2/j;JJ)V
    .locals 2

    .line 1
    check-cast p1, Lg2/f;

    .line 2
    .line 3
    iget-object p2, p0, Lac/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p2, Lg2/s;

    .line 6
    .line 7
    invoke-virtual {p2}, Lg2/s;->n()J

    .line 8
    .line 9
    .line 10
    move-result-wide p3

    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    cmp-long p3, p3, v0

    .line 14
    .line 15
    if-nez p3, :cond_1

    .line 16
    .line 17
    iget-boolean p1, p2, Lg2/s;->v:Z

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    invoke-static {p2}, Lg2/s;->l(Lg2/s;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :cond_1
    const/4 p3, 0x0

    .line 26
    :goto_0
    iget-object p4, p2, Lg2/s;->e:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result p5

    .line 32
    if-ge p3, p5, :cond_3

    .line 33
    .line 34
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p4

    .line 38
    check-cast p4, Lg2/r;

    .line 39
    .line 40
    iget-object p5, p4, Lg2/r;->a:Lg2/q;

    .line 41
    .line 42
    iget-object p5, p5, Lg2/q;->b:Lg2/f;

    .line 43
    .line 44
    if-ne p5, p1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p4}, Lg2/r;->a()V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    add-int/lit8 p3, p3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    :goto_1
    iget-object p1, p2, Lg2/s;->d:Lg2/n;

    .line 54
    .line 55
    const/4 p2, 0x1

    .line 56
    iput p2, p1, Lg2/n;->o:I

    .line 57
    .line 58
    return-void
.end method

.method public B()V
    .locals 3

    .line 1
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq2/e;

    .line 4
    .line 5
    iget-object v1, v0, Lq2/e;->P0:Landroid/view/Surface;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v0, v1, v2}, Lq2/e;->Q0(II)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public C()V
    .locals 4

    .line 1
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg2/s;

    .line 4
    .line 5
    iget-object v1, v0, Lg2/s;->b:Landroid/os/Handler;

    .line 6
    .line 7
    new-instance v2, Lg2/p;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-direct {v2, v0, v3}, Lg2/p;-><init>(Lg2/s;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public D(Lp/k;Lp/m;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp/e;

    .line 4
    .line 5
    iget-object v1, v0, Lp/e;->f:Landroid/os/Handler;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lp/e;->h:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    const/4 v5, -0x1

    .line 19
    if-ge v4, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    check-cast v6, Lp/d;

    .line 26
    .line 27
    iget-object v6, v6, Lp/d;->b:Lp/k;

    .line 28
    .line 29
    if-ne p1, v6, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v4, v5

    .line 36
    :goto_1
    if-ne v4, v5, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-ge v4, v3, :cond_3

    .line 46
    .line 47
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move-object v2, v1

    .line 52
    check-cast v2, Lp/d;

    .line 53
    .line 54
    :cond_3
    move-object v5, v2

    .line 55
    new-instance v3, LA7/W0;

    .line 56
    .line 57
    const/16 v8, 0x18

    .line 58
    .line 59
    move-object v4, p0

    .line 60
    move-object v7, p1

    .line 61
    move-object v6, p2

    .line 62
    invoke-direct/range {v3 .. v8}, LA7/W0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 66
    .line 67
    .line 68
    move-result-wide p1

    .line 69
    const-wide/16 v1, 0xc8

    .line 70
    .line 71
    add-long/2addr p1, v1

    .line 72
    iget-object v0, v0, Lp/e;->f:Landroid/os/Handler;

    .line 73
    .line 74
    invoke-virtual {v0, v3, v7, p1, p2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public E(Lo2/j;JJLjava/io/IOException;I)LU5/f;
    .locals 0

    .line 1
    check-cast p1, Lg2/f;

    .line 2
    .line 3
    iget-object p2, p0, Lac/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p2, Lg2/s;

    .line 6
    .line 7
    iget-boolean p3, p2, Lg2/s;->s:Z

    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    iput-object p6, p2, Lg2/s;->k:Ljava/io/IOException;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p6}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    instance-of p3, p3, Ljava/net/BindException;

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    iget p1, p2, Lg2/s;->u:I

    .line 23
    .line 24
    add-int/lit8 p3, p1, 0x1

    .line 25
    .line 26
    iput p3, p2, Lg2/s;->u:I

    .line 27
    .line 28
    const/4 p2, 0x3

    .line 29
    if-ge p1, p2, :cond_2

    .line 30
    .line 31
    sget-object p1, Lo2/m;->d:LU5/f;

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_1
    new-instance p3, Lio/ktor/utils/io/T;

    .line 35
    .line 36
    iget-object p1, p1, Lg2/f;->b:Lg2/w;

    .line 37
    .line 38
    iget-object p1, p1, Lg2/w;->b:Landroid/net/Uri;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {p3, p1, p6}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    iput-object p3, p2, Lg2/s;->l:Lio/ktor/utils/io/T;

    .line 48
    .line 49
    :cond_2
    :goto_0
    sget-object p1, Lo2/m;->e:LU5/f;

    .line 50
    .line 51
    return-object p1
.end method

.method public F(Lp/k;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq/i;

    .line 4
    .line 5
    iget-object v1, v0, Lq/i;->c:Lp/k;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne p1, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    move-object v1, p1

    .line 12
    check-cast v1, Lp/D;

    .line 13
    .line 14
    iget-object v1, v1, Lp/D;->A:Lp/m;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lq/i;->e:Lp/w;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, p1}, Lp/w;->F(Lp/k;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_1
    return v2
.end method

.method public H(LK3/r;)V
    .locals 3

    .line 1
    const-string v0, "screenMetrics"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "\n                mraidbridge.setScreenSize("

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p1, LK3/r;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Landroid/graphics/Rect;

    .line 16
    .line 17
    invoke-static {v1}, Lac/a;->I(Landroid/graphics/Rect;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ");\n                mraidbridge.setMaxSize("

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p1, LK3/r;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Landroid/graphics/Rect;

    .line 32
    .line 33
    invoke-static {v1}, Lac/a;->I(Landroid/graphics/Rect;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ");\n                mraidbridge.setCurrentPosition("

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p1, LK3/r;->g:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Landroid/graphics/Rect;

    .line 48
    .line 49
    invoke-static {v1}, Lac/a;->G(Landroid/graphics/Rect;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v2, ");\n                mraidbridge.setDefaultPosition("

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget-object p1, p1, LK3/r;->i:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Landroid/graphics/Rect;

    .line 64
    .line 65
    invoke-static {p1}, Lac/a;->G(Landroid/graphics/Rect;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string p1, ");\n                mraidbridge.notifySizeChangeEvent("

    .line 73
    .line 74
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-static {v1}, Lac/a;->I(Landroid/graphics/Rect;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string p1, ");\n            "

    .line 85
    .line 86
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p0, p1}, Lac/a;->J(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public J(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, LEf/S;->a:LLf/e;

    .line 2
    .line 3
    sget-object v0, LJf/n;->a:LFf/e;

    .line 4
    .line 5
    invoke-static {v0}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/creative/mraid/e;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, p0, p1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/creative/mraid/e;-><init>(Lac/a;Ljava/lang/String;Ljf/c;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x3

    .line 16
    invoke-static {v0, v2, v1, p1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public L(Lio/ktor/utils/io/T;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lg2/u;

    .line 2
    .line 3
    iget-object v1, p0, Lac/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lg2/s;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-boolean v0, v1, Lg2/s;->v:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {v1}, Lg2/s;->l(Lg2/s;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iput-object p1, v1, Lg2/s;->l:Lio/ktor/utils/io/T;

    .line 18
    .line 19
    return-void
.end method

.method public M(JLl8/K;)V
    .locals 11

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v2, v3, :cond_0

    .line 17
    .line 18
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Lg2/D;

    .line 23
    .line 24
    iget-object v3, v3, Lg2/D;->c:Landroid/net/Uri;

    .line 25
    .line 26
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v2, v1

    .line 40
    :goto_1
    iget-object v3, p0, Lac/a;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Lg2/s;

    .line 43
    .line 44
    iget-object v3, v3, Lg2/s;->f:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    if-ge v2, v3, :cond_2

    .line 56
    .line 57
    iget-object v3, p0, Lac/a;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Lg2/s;

    .line 60
    .line 61
    iget-object v3, v3, Lg2/s;->f:Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Lg2/q;

    .line 68
    .line 69
    iget-object v3, v3, Lg2/q;->b:Lg2/f;

    .line 70
    .line 71
    iget-object v3, v3, Lg2/f;->b:Lg2/w;

    .line 72
    .line 73
    iget-object v3, v3, Lg2/w;->b:Landroid/net/Uri;

    .line 74
    .line 75
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_1

    .line 84
    .line 85
    iget-object v3, p0, Lac/a;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v3, Lg2/s;

    .line 88
    .line 89
    iget-object v3, v3, Lg2/s;->g:Lcom/google/android/gms/ads/nativead/l;

    .line 90
    .line 91
    iget-object v3, v3, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v3, Lg2/v;

    .line 94
    .line 95
    iput-boolean v1, v3, Lg2/v;->m:Z

    .line 96
    .line 97
    invoke-virtual {v3}, Lg2/v;->t()V

    .line 98
    .line 99
    .line 100
    iget-object v3, p0, Lac/a;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v3, Lg2/s;

    .line 103
    .line 104
    invoke-virtual {v3}, Lg2/s;->m()Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_1

    .line 109
    .line 110
    iget-object v3, p0, Lac/a;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v3, Lg2/s;

    .line 113
    .line 114
    const/4 v6, 0x1

    .line 115
    iput-boolean v6, v3, Lg2/s;->q:Z

    .line 116
    .line 117
    iput-wide v4, v3, Lg2/s;->n:J

    .line 118
    .line 119
    iput-wide v4, v3, Lg2/s;->m:J

    .line 120
    .line 121
    iput-wide v4, v3, Lg2/s;->o:J

    .line 122
    .line 123
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    move v0, v1

    .line 127
    :goto_2
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-ge v0, v2, :cond_9

    .line 132
    .line 133
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    check-cast v2, Lg2/D;

    .line 138
    .line 139
    iget-object v3, p0, Lac/a;->b:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v3, Lg2/s;

    .line 142
    .line 143
    iget-object v6, v2, Lg2/D;->c:Landroid/net/Uri;

    .line 144
    .line 145
    move v7, v1

    .line 146
    :goto_3
    iget-object v8, v3, Lg2/s;->e:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    if-ge v7, v9, :cond_4

    .line 153
    .line 154
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    check-cast v9, Lg2/r;

    .line 159
    .line 160
    iget-boolean v9, v9, Lg2/r;->d:Z

    .line 161
    .line 162
    if-nez v9, :cond_3

    .line 163
    .line 164
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    check-cast v8, Lg2/r;

    .line 169
    .line 170
    iget-object v8, v8, Lg2/r;->a:Lg2/q;

    .line 171
    .line 172
    iget-object v9, v8, Lg2/q;->b:Lg2/f;

    .line 173
    .line 174
    iget-object v9, v9, Lg2/f;->b:Lg2/w;

    .line 175
    .line 176
    iget-object v9, v9, Lg2/w;->b:Landroid/net/Uri;

    .line 177
    .line 178
    invoke-virtual {v9, v6}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v9

    .line 182
    if-eqz v9, :cond_3

    .line 183
    .line 184
    iget-object v3, v8, Lg2/q;->b:Lg2/f;

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_4
    const/4 v3, 0x0

    .line 191
    :goto_4
    if-nez v3, :cond_5

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_5
    iget-wide v6, v2, Lg2/D;->a:J

    .line 195
    .line 196
    cmp-long v8, v6, v4

    .line 197
    .line 198
    if-eqz v8, :cond_6

    .line 199
    .line 200
    iget-object v8, v3, Lg2/f;->h:Lg2/g;

    .line 201
    .line 202
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    iget-boolean v8, v8, Lg2/g;->h:Z

    .line 206
    .line 207
    if-nez v8, :cond_6

    .line 208
    .line 209
    iget-object v8, v3, Lg2/f;->h:Lg2/g;

    .line 210
    .line 211
    iput-wide v6, v8, Lg2/g;->i:J

    .line 212
    .line 213
    :cond_6
    iget v6, v2, Lg2/D;->b:I

    .line 214
    .line 215
    iget-object v7, v3, Lg2/f;->h:Lg2/g;

    .line 216
    .line 217
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    iget-boolean v7, v7, Lg2/g;->h:Z

    .line 221
    .line 222
    if-nez v7, :cond_7

    .line 223
    .line 224
    iget-object v7, v3, Lg2/f;->h:Lg2/g;

    .line 225
    .line 226
    iput v6, v7, Lg2/g;->j:I

    .line 227
    .line 228
    :cond_7
    iget-object v6, p0, Lac/a;->b:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v6, Lg2/s;

    .line 231
    .line 232
    invoke-virtual {v6}, Lg2/s;->m()Z

    .line 233
    .line 234
    .line 235
    move-result v6

    .line 236
    if-eqz v6, :cond_8

    .line 237
    .line 238
    iget-object v6, p0, Lac/a;->b:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v6, Lg2/s;

    .line 241
    .line 242
    iget-wide v7, v6, Lg2/s;->n:J

    .line 243
    .line 244
    iget-wide v9, v6, Lg2/s;->m:J

    .line 245
    .line 246
    cmp-long v6, v7, v9

    .line 247
    .line 248
    if-nez v6, :cond_8

    .line 249
    .line 250
    iget-wide v6, v2, Lg2/D;->a:J

    .line 251
    .line 252
    iput-wide p1, v3, Lg2/f;->k:J

    .line 253
    .line 254
    iput-wide v6, v3, Lg2/f;->l:J

    .line 255
    .line 256
    :cond_8
    :goto_5
    add-int/lit8 v0, v0, 0x1

    .line 257
    .line 258
    goto/16 :goto_2

    .line 259
    .line 260
    :cond_9
    iget-object p1, p0, Lac/a;->b:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast p1, Lg2/s;

    .line 263
    .line 264
    invoke-virtual {p1}, Lg2/s;->m()Z

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    if-eqz p1, :cond_b

    .line 269
    .line 270
    iget-object p1, p0, Lac/a;->b:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast p1, Lg2/s;

    .line 273
    .line 274
    iget-wide p2, p1, Lg2/s;->n:J

    .line 275
    .line 276
    iget-wide v0, p1, Lg2/s;->m:J

    .line 277
    .line 278
    cmp-long p2, p2, v0

    .line 279
    .line 280
    if-nez p2, :cond_a

    .line 281
    .line 282
    iput-wide v4, p1, Lg2/s;->n:J

    .line 283
    .line 284
    iput-wide v4, p1, Lg2/s;->m:J

    .line 285
    .line 286
    return-void

    .line 287
    :cond_a
    iput-wide v4, p1, Lg2/s;->n:J

    .line 288
    .line 289
    invoke-virtual {p1, v0, v1}, Lg2/s;->d(J)J

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :cond_b
    iget-object p1, p0, Lac/a;->b:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast p1, Lg2/s;

    .line 296
    .line 297
    iget-wide p2, p1, Lg2/s;->o:J

    .line 298
    .line 299
    cmp-long v0, p2, v4

    .line 300
    .line 301
    if-eqz v0, :cond_c

    .line 302
    .line 303
    iget-boolean v0, p1, Lg2/s;->v:Z

    .line 304
    .line 305
    if-eqz v0, :cond_c

    .line 306
    .line 307
    invoke-virtual {p1, p2, p3}, Lg2/s;->d(J)J

    .line 308
    .line 309
    .line 310
    iget-object p1, p0, Lac/a;->b:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast p1, Lg2/s;

    .line 313
    .line 314
    iput-wide v4, p1, Lg2/s;->o:J

    .line 315
    .line 316
    :cond_c
    return-void
.end method

.method public N(Ljava/lang/String;Ljava/io/IOException;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    new-instance p2, Ljava/io/IOException;

    .line 4
    .line 5
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 10
    .line 11
    invoke-direct {v0, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    move-object p2, v0

    .line 15
    :goto_0
    iget-object p1, p0, Lac/a;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Lg2/s;

    .line 18
    .line 19
    iput-object p2, p1, Lg2/s;->k:Ljava/io/IOException;

    .line 20
    .line 21
    return-void
.end method

.method public O(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LC8/i;

    .line 9
    .line 10
    iget-object v0, v0, LC8/i;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lre/a;

    .line 13
    .line 14
    iget-object v1, v0, Lre/a;->a:Lae/a;

    .line 15
    .line 16
    sget-object v2, Lae/a;->b:Lae/a;

    .line 17
    .line 18
    iget v1, v1, Lae/a;->a:I

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    iget-object v0, v0, Lre/a;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p1}, Lac/a;->K(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public a(J)I
    .locals 0

    .line 1
    const/4 p1, -0x1

    .line 2
    return p1
.end method

.method public b(Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {v0, p1}, Le1/c;->t(Landroid/view/ContentInfo$Builder;Landroid/net/Uri;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public build()Lk1/f;
    .locals 3

    .line 1
    new-instance v0, Lk1/f;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/ads/nativead/l;

    .line 4
    .line 5
    iget-object v2, p0, Lac/a;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Landroid/view/ContentInfo$Builder;

    .line 8
    .line 9
    invoke-static {v2}, Le1/c;->j(Landroid/view/ContentInfo$Builder;)Landroid/view/ContentInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2}, Lcom/google/android/gms/ads/nativead/l;-><init>(Landroid/view/ContentInfo;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lk1/f;-><init>(Lk1/e;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public c()J
    .locals 11

    .line 1
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Lf6/W;

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    const-wide v2, 0x7fffffffffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    move-wide v5, v2

    .line 13
    :goto_0
    const-wide/high16 v7, -0x8000000000000000L

    .line 14
    .line 15
    if-ge v4, v1, :cond_1

    .line 16
    .line 17
    aget-object v9, v0, v4

    .line 18
    .line 19
    invoke-interface {v9}, Lf6/W;->c()J

    .line 20
    .line 21
    .line 22
    move-result-wide v9

    .line 23
    cmp-long v7, v9, v7

    .line 24
    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide v5

    .line 31
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    cmp-long v0, v5, v2

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    return-wide v7

    .line 39
    :cond_2
    return-wide v5
.end method

.method public e()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Lf6/W;

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v3, v1, :cond_1

    .line 9
    .line 10
    aget-object v4, v0, v3

    .line 11
    .line 12
    invoke-interface {v4}, Lf6/W;->e()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return v2
.end method

.method public g(J)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p1, p0, Lac/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/List;

    .line 4
    .line 5
    return-object p1
.end method

.method public k(I)J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    return-wide v0
.end method

.method public l(Lp/k;Z)V
    .locals 2

    .line 1
    instance-of v0, p1, Lp/D;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lp/D;

    .line 7
    .line 8
    iget-object v0, v0, Lp/D;->z:Lp/k;

    .line 9
    .line 10
    invoke-virtual {v0}, Lp/k;->k()Lp/k;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Lp/k;->c(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lq/i;

    .line 21
    .line 22
    iget-object v0, v0, Lq/i;->e:Lp/w;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, p1, p2}, Lp/w;->l(Lp/k;Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public m(Lp/k;Lp/m;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lac/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Lp/e;

    .line 4
    .line 5
    iget-object p2, p2, Lp/e;->f:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public n()J
    .locals 11

    .line 1
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Lf6/W;

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    const-wide v2, 0x7fffffffffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    move-wide v5, v2

    .line 13
    :goto_0
    const-wide/high16 v7, -0x8000000000000000L

    .line 14
    .line 15
    if-ge v4, v1, :cond_1

    .line 16
    .line 17
    aget-object v9, v0, v4

    .line 18
    .line 19
    invoke-interface {v9}, Lf6/W;->n()J

    .line 20
    .line 21
    .line 22
    move-result-wide v9

    .line 23
    cmp-long v7, v9, v7

    .line 24
    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide v5

    .line 31
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    cmp-long v0, v5, v2

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    return-wide v7

    .line 39
    :cond_2
    return-wide v5
.end method

.method public o(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Lf6/W;

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_0

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    invoke-interface {v3, p1, p2}, Lf6/W;->o(J)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void
.end method

.method public onAdLoaded()V
    .locals 3

    .line 1
    iget v0, p0, Lac/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lpb/a;

    .line 9
    .line 10
    iget-object v1, v0, Lpb/a;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lpb/b;

    .line 13
    .line 14
    iget-object v1, v1, LCa/d;->b:Ljava/io/Serializable;

    .line 15
    .line 16
    check-cast v1, Lj$/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    iget-object v2, v0, Lpb/a;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lnb/c;

    .line 21
    .line 22
    iget-object v2, v2, Lnb/c;->a:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v0, v0, Lpb/a;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lvb/c;

    .line 27
    .line 28
    invoke-virtual {v1, v2, v0}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lpb/a;

    .line 35
    .line 36
    iget-object v1, v0, Lpb/a;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Lpb/b;

    .line 39
    .line 40
    iget-object v1, v1, LCa/d;->b:Ljava/io/Serializable;

    .line 41
    .line 42
    check-cast v1, Lj$/util/concurrent/ConcurrentHashMap;

    .line 43
    .line 44
    iget-object v2, v0, Lpb/a;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lnb/c;

    .line 47
    .line 48
    iget-object v2, v2, Lnb/c;->a:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v0, v0, Lpb/a;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lrb/f;

    .line 53
    .line 54
    invoke-virtual {v1, v2, v0}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_0
    .end packed-switch
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lac/a;->b:Ljava/lang/Object;

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

.method public onFailure(Lzg/c;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget v0, p0, Lac/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "call"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p2, p0, Lac/a;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p2, LEf/n;

    .line 18
    .line 19
    invoke-virtual {p2, p1}, LEf/n;->resumeWith(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iget-object p1, p0, Lac/a;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lzg/g;

    .line 26
    .line 27
    invoke-static {p1, p2}, Lu6/u;->l(Lzg/g;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_0
    .end packed-switch
.end method

.method public onMethodCall(Luc/o;Luc/q;)V
    .locals 3

    .line 1
    iget-object v0, p1, Luc/o;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lac/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lq/o;

    .line 9
    .line 10
    const-string v2, "get"

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    const-string v2, "put"

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    check-cast p2, Ltc/g;

    .line 27
    .line 28
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    iget-object p1, p1, Luc/o;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, [B

    .line 35
    .line 36
    iput-object p1, v1, Lq/o;->f:Ljava/lang/Object;

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    check-cast p2, Ltc/g;

    .line 40
    .line 41
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    const/4 p1, 0x1

    .line 46
    iput-boolean p1, v1, Lq/o;->e:Z

    .line 47
    .line 48
    iget-boolean p1, v1, Lq/o;->d:Z

    .line 49
    .line 50
    if-nez p1, :cond_3

    .line 51
    .line 52
    iget-boolean p1, v1, Lq/o;->c:Z

    .line 53
    .line 54
    if-nez p1, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    check-cast p2, Ltc/g;

    .line 58
    .line 59
    iput-object p2, v1, Lq/o;->b:Ljava/lang/Object;

    .line 60
    .line 61
    return-void

    .line 62
    :cond_3
    :goto_0
    iget-object p1, v1, Lq/o;->f:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, [B

    .line 65
    .line 66
    invoke-static {p1}, Lq/o;->d([B)Ljava/util/HashMap;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p2, Ltc/g;

    .line 71
    .line 72
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public onResponse(Lzg/c;Lzg/Q;)V
    .locals 1

    .line 1
    iget v0, p0, Lac/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "call"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lac/a;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, LEf/n;

    .line 14
    .line 15
    invoke-virtual {p1, p2}, LEf/n;->resumeWith(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iget-object p1, p2, Lzg/Q;->a:Lokhttp3/Response;

    .line 20
    .line 21
    invoke-virtual {p1}, Lokhttp3/Response;->d()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lzg/g;

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p2, Lzg/Q;->b:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {v0, p1}, Lu6/u;->k(Lzg/g;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p1, LE5/Q;

    .line 38
    .line 39
    invoke-direct {p1, p2}, LE5/Q;-><init>(Lzg/Q;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0, p1}, Lu6/u;->j(Lzg/g;LE5/Q;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_0
    .end packed-switch
.end method

.method public p()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public q()V
    .locals 8

    .line 1
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq2/e;

    .line 4
    .line 5
    iget-object v3, v0, Lq2/e;->P0:Landroid/view/Surface;

    .line 6
    .line 7
    if-eqz v3, :cond_1

    .line 8
    .line 9
    iget-object v2, v0, Lq2/e;->E0:LX2/j;

    .line 10
    .line 11
    iget-object v1, v2, LX2/j;->b:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v7, v1

    .line 14
    check-cast v7, Landroid/os/Handler;

    .line 15
    .line 16
    if-eqz v7, :cond_0

    .line 17
    .line 18
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    new-instance v1, Lcom/applovin/impl/W;

    .line 23
    .line 24
    const/4 v6, 0x2

    .line 25
    invoke-direct/range {v1 .. v6}, Lcom/applovin/impl/W;-><init>(Ljava/lang/Object;Ljava/lang/Object;JI)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v7, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    const/4 v1, 0x1

    .line 32
    iput-boolean v1, v0, Lq2/e;->S0:Z

    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public run()V
    .locals 3

    .line 1
    new-instance v0, Lkd/c;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lac/a;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lr9/K;

    .line 11
    .line 12
    const-string v2, "build overlays"

    .line 13
    .line 14
    invoke-virtual {v1, v2, v0}, Lr9/K;->P(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setExtras(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {v0, p1}, Le1/c;->u(Landroid/view/ContentInfo$Builder;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public t(Landroid/net/Uri;LS1/j;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lac/a;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 5
    .line 6
    invoke-virtual {v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1, p2, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance p2, Lj2/g;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-direct {p2, p1}, Lj2/g;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, v1}, LCa/d;->h(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lj2/c;
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    return-object p1

    .line 29
    :catch_0
    move-exception p1

    .line 30
    invoke-static {v0, p1}, LN1/D;->b(Ljava/lang/String;Ljava/lang/Exception;)LN1/D;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    throw p1
.end method

.method public u(Lu1/a;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlin/jvm/internal/n;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public v(Landroid/view/View;Lk1/v0;)Lk1/v0;
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    invoke-virtual {v2}, Lk1/v0;->d()I

    .line 8
    .line 9
    .line 10
    move-result v5

    .line 11
    move-object/from16 v6, p0

    .line 12
    .line 13
    iget-object v0, v6, Lac/a;->b:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v7, v0

    .line 16
    check-cast v7, Lj/w;

    .line 17
    .line 18
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Lk1/v0;->d()I

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    iget-object v0, v7, Lj/w;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 26
    .line 27
    const/16 v9, 0x8

    .line 28
    .line 29
    if-eqz v0, :cond_f

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 36
    .line 37
    if-eqz v0, :cond_f

    .line 38
    .line 39
    iget-object v0, v7, Lj/w;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    move-object v10, v0

    .line 46
    check-cast v10, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 47
    .line 48
    iget-object v0, v7, Lj/w;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_d

    .line 55
    .line 56
    iget-object v0, v7, Lj/w;->c0:Landroid/graphics/Rect;

    .line 57
    .line 58
    if-nez v0, :cond_0

    .line 59
    .line 60
    new-instance v0, Landroid/graphics/Rect;

    .line 61
    .line 62
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, v7, Lj/w;->c0:Landroid/graphics/Rect;

    .line 66
    .line 67
    new-instance v0, Landroid/graphics/Rect;

    .line 68
    .line 69
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v0, v7, Lj/w;->d0:Landroid/graphics/Rect;

    .line 73
    .line 74
    :cond_0
    iget-object v11, v7, Lj/w;->c0:Landroid/graphics/Rect;

    .line 75
    .line 76
    iget-object v0, v7, Lj/w;->d0:Landroid/graphics/Rect;

    .line 77
    .line 78
    invoke-virtual {v2}, Lk1/v0;->b()I

    .line 79
    .line 80
    .line 81
    move-result v12

    .line 82
    invoke-virtual {v2}, Lk1/v0;->d()I

    .line 83
    .line 84
    .line 85
    move-result v13

    .line 86
    invoke-virtual {v2}, Lk1/v0;->c()I

    .line 87
    .line 88
    .line 89
    move-result v14

    .line 90
    invoke-virtual {v2}, Lk1/v0;->a()I

    .line 91
    .line 92
    .line 93
    move-result v15

    .line 94
    invoke-virtual {v11, v12, v13, v14, v15}, Landroid/graphics/Rect;->set(IIII)V

    .line 95
    .line 96
    .line 97
    iget-object v12, v7, Lj/w;->A:Landroid/view/ViewGroup;

    .line 98
    .line 99
    sget-object v13, Lq/v1;->a:Ljava/lang/reflect/Method;

    .line 100
    .line 101
    if-eqz v13, :cond_1

    .line 102
    .line 103
    const/4 v14, 0x2

    .line 104
    :try_start_0
    new-array v14, v14, [Ljava/lang/Object;

    .line 105
    .line 106
    aput-object v11, v14, v4

    .line 107
    .line 108
    aput-object v0, v14, v3

    .line 109
    .line 110
    invoke-virtual {v13, v12, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :catch_0
    move-exception v0

    .line 115
    const-string v12, "ViewUtils"

    .line 116
    .line 117
    const-string v13, "Could not invoke computeFitSystemWindows"

    .line 118
    .line 119
    invoke-static {v12, v13, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 120
    .line 121
    .line 122
    :cond_1
    :goto_0
    iget v0, v11, Landroid/graphics/Rect;->top:I

    .line 123
    .line 124
    iget v12, v11, Landroid/graphics/Rect;->left:I

    .line 125
    .line 126
    iget v11, v11, Landroid/graphics/Rect;->right:I

    .line 127
    .line 128
    iget-object v13, v7, Lj/w;->A:Landroid/view/ViewGroup;

    .line 129
    .line 130
    sget-object v14, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 131
    .line 132
    invoke-static {v13}, Lk1/K;->a(Landroid/view/View;)Lk1/v0;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    if-nez v13, :cond_2

    .line 137
    .line 138
    move v14, v4

    .line 139
    goto :goto_1

    .line 140
    :cond_2
    invoke-virtual {v13}, Lk1/v0;->b()I

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    :goto_1
    if-nez v13, :cond_3

    .line 145
    .line 146
    move v13, v4

    .line 147
    goto :goto_2

    .line 148
    :cond_3
    invoke-virtual {v13}, Lk1/v0;->c()I

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    :goto_2
    iget v15, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 153
    .line 154
    if-ne v15, v0, :cond_5

    .line 155
    .line 156
    iget v15, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 157
    .line 158
    if-ne v15, v12, :cond_5

    .line 159
    .line 160
    iget v15, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 161
    .line 162
    if-eq v15, v11, :cond_4

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_4
    move v11, v4

    .line 166
    goto :goto_4

    .line 167
    :cond_5
    :goto_3
    iput v0, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 168
    .line 169
    iput v12, v10, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 170
    .line 171
    iput v11, v10, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 172
    .line 173
    move v11, v3

    .line 174
    :goto_4
    iget-object v12, v7, Lj/w;->k:Landroid/content/Context;

    .line 175
    .line 176
    if-lez v0, :cond_6

    .line 177
    .line 178
    iget-object v0, v7, Lj/w;->C:Landroid/view/View;

    .line 179
    .line 180
    if-nez v0, :cond_6

    .line 181
    .line 182
    new-instance v0, Landroid/view/View;

    .line 183
    .line 184
    invoke-direct {v0, v12}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 185
    .line 186
    .line 187
    iput-object v0, v7, Lj/w;->C:Landroid/view/View;

    .line 188
    .line 189
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    .line 190
    .line 191
    .line 192
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 193
    .line 194
    iget v15, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 195
    .line 196
    const/16 v3, 0x33

    .line 197
    .line 198
    const/4 v9, -0x1

    .line 199
    invoke-direct {v0, v9, v15, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 200
    .line 201
    .line 202
    iput v14, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 203
    .line 204
    iput v13, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 205
    .line 206
    iget-object v3, v7, Lj/w;->A:Landroid/view/ViewGroup;

    .line 207
    .line 208
    iget-object v13, v7, Lj/w;->C:Landroid/view/View;

    .line 209
    .line 210
    invoke-virtual {v3, v13, v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 211
    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_6
    iget-object v0, v7, Lj/w;->C:Landroid/view/View;

    .line 215
    .line 216
    if-eqz v0, :cond_8

    .line 217
    .line 218
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 223
    .line 224
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 225
    .line 226
    iget v9, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 227
    .line 228
    if-ne v3, v9, :cond_7

    .line 229
    .line 230
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 231
    .line 232
    if-ne v3, v14, :cond_7

    .line 233
    .line 234
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 235
    .line 236
    if-eq v3, v13, :cond_8

    .line 237
    .line 238
    :cond_7
    iput v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 239
    .line 240
    iput v14, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 241
    .line 242
    iput v13, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 243
    .line 244
    iget-object v3, v7, Lj/w;->C:Landroid/view/View;

    .line 245
    .line 246
    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 247
    .line 248
    .line 249
    :cond_8
    :goto_5
    iget-object v0, v7, Lj/w;->C:Landroid/view/View;

    .line 250
    .line 251
    if-eqz v0, :cond_9

    .line 252
    .line 253
    const/4 v3, 0x1

    .line 254
    goto :goto_6

    .line 255
    :cond_9
    move v3, v4

    .line 256
    :goto_6
    if-eqz v3, :cond_b

    .line 257
    .line 258
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_b

    .line 263
    .line 264
    iget-object v0, v7, Lj/w;->C:Landroid/view/View;

    .line 265
    .line 266
    invoke-virtual {v0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 267
    .line 268
    .line 269
    move-result v9

    .line 270
    and-int/lit16 v9, v9, 0x2000

    .line 271
    .line 272
    if-eqz v9, :cond_a

    .line 273
    .line 274
    const v9, 0x7f060006

    .line 275
    .line 276
    .line 277
    invoke-static {v12, v9}, LY0/e;->getColor(Landroid/content/Context;I)I

    .line 278
    .line 279
    .line 280
    move-result v9

    .line 281
    goto :goto_7

    .line 282
    :cond_a
    const v9, 0x7f060005

    .line 283
    .line 284
    .line 285
    invoke-static {v12, v9}, LY0/e;->getColor(Landroid/content/Context;I)I

    .line 286
    .line 287
    .line 288
    move-result v9

    .line 289
    :goto_7
    invoke-virtual {v0, v9}, Landroid/view/View;->setBackgroundColor(I)V

    .line 290
    .line 291
    .line 292
    :cond_b
    iget-boolean v0, v7, Lj/w;->H:Z

    .line 293
    .line 294
    if-nez v0, :cond_c

    .line 295
    .line 296
    if-eqz v3, :cond_c

    .line 297
    .line 298
    move v8, v4

    .line 299
    :cond_c
    move v0, v3

    .line 300
    move v3, v11

    .line 301
    goto :goto_8

    .line 302
    :cond_d
    iget v0, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 303
    .line 304
    if-eqz v0, :cond_e

    .line 305
    .line 306
    iput v4, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 307
    .line 308
    move v0, v4

    .line 309
    const/4 v3, 0x1

    .line 310
    goto :goto_8

    .line 311
    :cond_e
    move v0, v4

    .line 312
    move v3, v0

    .line 313
    :goto_8
    if-eqz v3, :cond_10

    .line 314
    .line 315
    iget-object v3, v7, Lj/w;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 316
    .line 317
    invoke-virtual {v3, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 318
    .line 319
    .line 320
    goto :goto_9

    .line 321
    :cond_f
    move v0, v4

    .line 322
    :cond_10
    :goto_9
    iget-object v3, v7, Lj/w;->C:Landroid/view/View;

    .line 323
    .line 324
    if-eqz v3, :cond_12

    .line 325
    .line 326
    if-eqz v0, :cond_11

    .line 327
    .line 328
    goto :goto_a

    .line 329
    :cond_11
    const/16 v4, 0x8

    .line 330
    .line 331
    :goto_a
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 332
    .line 333
    .line 334
    :cond_12
    if-eq v5, v8, :cond_16

    .line 335
    .line 336
    invoke-virtual {v2}, Lk1/v0;->b()I

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    invoke-virtual {v2}, Lk1/v0;->c()I

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    invoke-virtual {v2}, Lk1/v0;->a()I

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 349
    .line 350
    const/16 v7, 0x22

    .line 351
    .line 352
    if-lt v5, v7, :cond_13

    .line 353
    .line 354
    new-instance v5, Lk1/k0;

    .line 355
    .line 356
    invoke-direct {v5, v2}, Lk1/k0;-><init>(Lk1/v0;)V

    .line 357
    .line 358
    .line 359
    goto :goto_b

    .line 360
    :cond_13
    const/16 v7, 0x1e

    .line 361
    .line 362
    if-lt v5, v7, :cond_14

    .line 363
    .line 364
    new-instance v5, Lk1/j0;

    .line 365
    .line 366
    invoke-direct {v5, v2}, Lk1/j0;-><init>(Lk1/v0;)V

    .line 367
    .line 368
    .line 369
    goto :goto_b

    .line 370
    :cond_14
    const/16 v7, 0x1d

    .line 371
    .line 372
    if-lt v5, v7, :cond_15

    .line 373
    .line 374
    new-instance v5, Lk1/i0;

    .line 375
    .line 376
    invoke-direct {v5, v2}, Lk1/i0;-><init>(Lk1/v0;)V

    .line 377
    .line 378
    .line 379
    goto :goto_b

    .line 380
    :cond_15
    new-instance v5, Lk1/h0;

    .line 381
    .line 382
    invoke-direct {v5, v2}, Lk1/h0;-><init>(Lk1/v0;)V

    .line 383
    .line 384
    .line 385
    :goto_b
    invoke-static {v0, v8, v3, v4}, Lb1/c;->b(IIII)Lb1/c;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-virtual {v5, v0}, Lk1/l0;->g(Lb1/c;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v5}, Lk1/l0;->b()Lk1/v0;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    goto :goto_c

    .line 397
    :cond_16
    move-object v0, v2

    .line 398
    :goto_c
    sget-object v2, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 399
    .line 400
    invoke-virtual {v0}, Lk1/v0;->f()Landroid/view/WindowInsets;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    if-eqz v2, :cond_17

    .line 405
    .line 406
    invoke-static {v1, v2}, Lk1/H;->b(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    invoke-virtual {v3, v2}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-nez v2, :cond_17

    .line 415
    .line 416
    invoke-static {v1, v3}, Lk1/v0;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lk1/v0;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    :cond_17
    return-object v0
.end method

.method public bridge synthetic w(Lo2/j;JJZ)V
    .locals 0

    .line 1
    check-cast p1, Lg2/f;

    .line 2
    .line 3
    return-void
.end method

.method public x(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lac/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {v0, p1}, Le1/c;->s(Landroid/view/ContentInfo$Builder;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public z(J)Z
    .locals 17

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    move v3, v2

    .line 5
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lac/a;->c()J

    .line 6
    .line 7
    .line 8
    move-result-wide v4

    .line 9
    const-wide/high16 v6, -0x8000000000000000L

    .line 10
    .line 11
    cmp-long v8, v4, v6

    .line 12
    .line 13
    if-nez v8, :cond_1

    .line 14
    .line 15
    return v3

    .line 16
    :cond_1
    move-object/from16 v8, p0

    .line 17
    .line 18
    iget-object v9, v8, Lac/a;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v9, [Lf6/W;

    .line 21
    .line 22
    array-length v10, v9

    .line 23
    move v11, v2

    .line 24
    move v12, v11

    .line 25
    :goto_0
    if-ge v11, v10, :cond_5

    .line 26
    .line 27
    aget-object v13, v9, v11

    .line 28
    .line 29
    invoke-interface {v13}, Lf6/W;->c()J

    .line 30
    .line 31
    .line 32
    move-result-wide v14

    .line 33
    cmp-long v16, v14, v6

    .line 34
    .line 35
    if-eqz v16, :cond_2

    .line 36
    .line 37
    cmp-long v16, v14, v0

    .line 38
    .line 39
    if-gtz v16, :cond_2

    .line 40
    .line 41
    const/16 v16, 0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move/from16 v16, v2

    .line 45
    .line 46
    :goto_1
    cmp-long v14, v14, v4

    .line 47
    .line 48
    if-eqz v14, :cond_3

    .line 49
    .line 50
    if-eqz v16, :cond_4

    .line 51
    .line 52
    :cond_3
    invoke-interface {v13, v0, v1}, Lf6/W;->z(J)Z

    .line 53
    .line 54
    .line 55
    move-result v13

    .line 56
    or-int/2addr v12, v13

    .line 57
    :cond_4
    add-int/lit8 v11, v11, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_5
    or-int/2addr v3, v12

    .line 61
    if-nez v12, :cond_0

    .line 62
    .line 63
    return v3
.end method
