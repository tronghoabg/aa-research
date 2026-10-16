.class public final LY2/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;
.implements La9/c;
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/q;
.implements Ld2/i;
.implements Lo2/o;
.implements Lr9/a;
.implements Luc/p;
.implements Luc/c;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(BI)V
    .locals 1

    iput p2, p0, LY2/B;->a:I

    packed-switch p2, :pswitch_data_0

    .line 28
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 30
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LY2/B;->c:Ljava/lang/Object;

    return-void

    .line 31
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    sget-object p1, Lef/j;->c:Lef/j;

    sget-object p2, Lt0/d;->j:Lt0/d;

    invoke-static {p1, p2}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    move-result-object p1

    iput-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 33
    new-instance p1, Lt0/D;

    const/4 p2, 0x1

    .line 34
    invoke-direct {p1, p2}, Lt0/D;-><init>(I)V

    .line 35
    new-instance p2, Lt0/P;

    .line 36
    invoke-direct {p2, p1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 37
    iput-object p2, p0, LY2/B;->c:Ljava/lang/Object;

    return-void

    .line 38
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance p1, Lc9/d;

    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v0, Lr9/c;->c:Lq6/d;

    invoke-direct {p1, p2, v0}, Lc9/d;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    iput-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 40
    new-instance p1, Lc9/d;

    sget-object v0, Lr9/c;->d:Lq6/d;

    invoke-direct {p1, p2, v0}, Lc9/d;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    iput-object p1, p0, LY2/B;->c:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(I)V
    .locals 3

    const/16 v0, 0xc

    iput v0, p0, LY2/B;->a:I

    .line 62
    new-instance v0, LV5/b;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, LV5/b;-><init>(II)V

    new-instance v1, LV5/b;

    const/4 v2, 0x3

    invoke-direct {v1, p1, v2}, LV5/b;-><init>(II)V

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    .line 65
    iput-object v1, p0, LY2/B;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(IC)V
    .locals 0

    .line 1
    iput p1, p0, LY2/B;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, LY2/B;->a:I

    iput-object p2, p0, LY2/B;->c:Ljava/lang/Object;

    iput-object p3, p0, LY2/B;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 3

    const/4 v0, 0x4

    iput v0, p0, LY2/B;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.os.IMessenger"

    .line 5
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 6
    new-instance v0, Landroid/os/Messenger;

    invoke-direct {v0, p1}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    iput-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    iput-object v2, p0, LY2/B;->c:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const-string v1, "com.google.android.gms.iid.IMessengerCompat"

    .line 7
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    new-instance v0, Lc7/g;

    .line 9
    invoke-direct {v0, p1}, Lc7/g;-><init>(Landroid/os/IBinder;)V

    iput-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    iput-object v2, p0, LY2/B;->b:Ljava/lang/Object;

    :goto_0
    return-void

    .line 10
    :cond_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "MessengerIpcClient"

    const-string v1, "Invalid interface descriptor: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    new-instance p1, Landroid/os/RemoteException;

    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    throw p1
.end method

.method public constructor <init>(Lcom/google/android/gms/ads/nativead/l;)V
    .locals 1

    const/16 v0, 0x1b

    iput v0, p0, LY2/B;->a:I

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY2/B;->c:Ljava/lang/Object;

    .line 42
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/moloco/sdk/acm/n;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, LY2/B;->a:I

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    iput-object p2, p0, LY2/B;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/moloco/sdk/acm/recorder/c;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, LY2/B;->a:I

    const-string v0, "metricsRecorder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 16
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, LY2/B;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/moloco/sdk/publisher/BannerAdShowListener;Lcom/moloco/sdk/internal/services/u;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/internal/publisher/J;Lcom/moloco/sdk/internal/publisher/J;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/internal/publisher/J;)V
    .locals 10

    const/16 v0, 0x8

    iput v0, p0, LY2/B;->a:I

    const-string v0, "appLifecycleTrackerService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customUserEventBuilderService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adType"

    move-object/from16 v6, p6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricsRecorder"

    move-object/from16 v7, p7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v9, 0x260

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v8, p8

    .line 18
    invoke-static/range {v1 .. v9}, Ltg/b;->a(Lcom/moloco/sdk/publisher/AdShowListener;Lcom/moloco/sdk/internal/services/u;Lcom/moloco/sdk/internal/services/events/c;Ltf/a;Ltf/a;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/acm/recorder/c;Ltf/a;I)Lcom/moloco/sdk/internal/publisher/b;

    move-result-object p2

    iput-object p2, p0, LY2/B;->b:Ljava/lang/Object;

    .line 19
    iput-object p1, p0, LY2/B;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg2/n;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, LY2/B;->a:I

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY2/B;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 69
    invoke-static {p1}, LQ1/x;->m(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    .line 70
    iput-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LY2/B;->a:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY2/B;->c:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    .line 21
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, LY2/B;->a:I

    iput-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    iput-object p3, p0, LY2/B;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, LY2/B;->a:I

    const-string v0, "clickThroughUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clickTrackingUrls"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, LY2/B;->c:Ljava/lang/Object;

    .line 24
    iput-object p2, p0, LY2/B;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Landroid/view/MotionEvent;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, LY2/B;->a:I

    const-string v0, "pointers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "motionEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 27
    iput-object p2, p0, LY2/B;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LY2/B;->a:I

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 50
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Ls2/C;

    iput-object p1, p0, LY2/B;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lmc/b;)V
    .locals 5

    const/16 v0, 0x1c

    iput v0, p0, LY2/B;->a:I

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Lad/L;

    const/16 v1, 0x1b

    invoke-direct {v0, p0, v1}, Lad/L;-><init>(Ljava/lang/Object;I)V

    .line 53
    new-instance v1, Luc/r;

    sget-object v2, Luc/x;->b:Luc/x;

    const/4 v3, 0x0

    .line 54
    const-string v4, "flutter/platform_views_2"

    invoke-direct {v1, p1, v4, v2, v3}, Luc/r;-><init>(Luc/f;Ljava/lang/String;Luc/s;Lab/b;)V

    .line 55
    iput-object v1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 56
    invoke-virtual {v1, v0}, Luc/r;->b(Luc/p;)V

    return-void
.end method

.method public constructor <init>(Lmd/b;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, LY2/B;->a:I

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lq2/m;Lq2/p;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, LY2/B;->a:I

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 59
    iput-object p2, p0, LY2/B;->c:Ljava/lang/Object;

    .line 60
    new-instance p1, LN1/m;

    invoke-direct {p1}, LN1/m;-><init>()V

    .line 61
    new-instance p2, LN1/n;

    invoke-direct {p2, p1}, LN1/n;-><init>(LN1/m;)V

    return-void
.end method

.method public constructor <init>([La9/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LY2/B;->a:I

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 45
    new-instance p1, La9/a;

    .line 46
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, LY2/B;->c:Ljava/lang/Object;

    return-void
.end method

.method public static r(C)LY2/B;
    .locals 3

    .line 1
    new-instance v0, Lk8/c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lk8/c;-><init>(C)V

    .line 4
    .line 5
    .line 6
    new-instance p0, LY2/B;

    .line 7
    .line 8
    new-instance v1, La2/v;

    .line 9
    .line 10
    const/16 v2, 0xe

    .line 11
    .line 12
    invoke-direct {v1, v0, v2}, La2/v;-><init>(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lk8/e;->b:Lk8/e;

    .line 16
    .line 17
    const/16 v2, 0x10

    .line 18
    .line 19
    invoke-direct {p0, v2, v1, v0}, LY2/B;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method


# virtual methods
.method public A(Ljava/lang/String;)Lo9/j;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lo9/j;

    .line 10
    .line 11
    return-object p1
.end method

.method public B(Lt0/t;)Z
    .locals 1

    .line 1
    const-string v0, "node"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lt0/t;->r()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lt0/P;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "Check failed."

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method public C(I)Lc9/d;
    .locals 4

    .line 1
    invoke-static {}, Ls9/h;->b()Ls9/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lr9/c;

    .line 6
    .line 7
    invoke-direct {v1, v0, p1}, Lr9/c;-><init>(Ls9/h;I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lc9/d;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lc9/d;->b(Lr9/c;)LA7/v;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Ls9/h;->c:Lc9/d;

    .line 19
    .line 20
    :goto_0
    iget-object v2, v0, LA7/v;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Ljava/util/Iterator;

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, LA7/v;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lr9/c;

    .line 35
    .line 36
    iget v3, v2, Lr9/c;->b:I

    .line 37
    .line 38
    if-ne v3, p1, :cond_0

    .line 39
    .line 40
    iget-object v3, v2, Lr9/c;->a:Ls9/h;

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-object v3, p0, LY2/B;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, Lc9/d;

    .line 49
    .line 50
    invoke-virtual {v3, v2}, Lc9/d;->c(Ljava/lang/Object;)Lc9/d;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    iput-object v3, p0, LY2/B;->b:Ljava/lang/Object;

    .line 55
    .line 56
    iget-object v3, p0, LY2/B;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Lc9/d;

    .line 59
    .line 60
    invoke-virtual {v3, v2}, Lc9/d;->c(Ljava/lang/Object;)Lc9/d;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iput-object v2, p0, LY2/B;->c:Ljava/lang/Object;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    return-object v1
.end method

.method public D(Lmd/a;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, v1}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public E(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, La2/v;

    .line 7
    .line 8
    new-instance v1, Lk8/n;

    .line 9
    .line 10
    invoke-direct {v1, v0, p0, p1}, Lk8/n;-><init>(La2/v;LY2/B;Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {v1}, Lk8/n;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Lk8/n;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public F(I)Ls2/C;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, [I

    .line 5
    .line 6
    array-length v2, v1

    .line 7
    if-ge v0, v2, :cond_1

    .line 8
    .line 9
    aget v1, v1, v0

    .line 10
    .line 11
    if-ne p1, v1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, LY2/B;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, [Lk2/c0;

    .line 16
    .line 17
    aget-object p1, p1, v0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v1, "Unmatched track of type: "

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string v0, "BaseMediaChunkOutput"

    .line 38
    .line 39
    invoke-static {v0, p1}, LQ1/k;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    new-instance p1, Ls2/l;

    .line 43
    .line 44
    invoke-direct {p1}, Ls2/l;-><init>()V

    .line 45
    .line 46
    .line 47
    return-object p1
.end method

.method public M(Lo9/j;)V
    .locals 2

    .line 1
    iget-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    iget-object v1, p1, Lo9/j;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public Q(Lo9/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    iget-object v1, p1, Lo9/e;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;Ljava/lang/String;Llf/c;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    instance-of v4, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;

    iget v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->g:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->g:I

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;

    invoke-direct {v4, v0, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;-><init>(LY2/B;Llf/c;)V

    :goto_0
    iget-object v3, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->e:Ljava/lang/Object;

    sget-object v5, Lkf/a;->a:Lkf/a;

    .line 1
    iget v6, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->g:I

    const/4 v7, 0x0

    const-string v8, "UNKNOWN_MTID"

    const/4 v9, 0x1

    if-eqz v6, :cond_2

    if-ne v6, v9, :cond_1

    iget-object v1, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->d:Ljava/lang/String;

    iget-object v2, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->c:Ljava/lang/String;

    iget-object v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;

    iget-object v4, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->a:LY2/B;

    invoke-static {v3}, LFe/e;->U(Ljava/lang/Object;)V

    move-object/from16 v19, v3

    move-object v3, v1

    move-object v1, v5

    move-object v5, v4

    move-object/from16 v4, v19

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 2
    iget-object v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/A0;

    if-eqz v3, :cond_8

    .line 3
    iget-object v3, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/A0;->b:Ljava/lang/String;

    if-nez v3, :cond_3

    goto/16 :goto_4

    .line 4
    :cond_3
    iput-object v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->a:LY2/B;

    iput-object v1, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;

    iput-object v2, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->c:Ljava/lang/String;

    iput-object v3, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->d:Ljava/lang/String;

    iput v9, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/D0;->g:I

    iget-object v6, v0, LY2/B;->b:Ljava/lang/Object;

    check-cast v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;

    .line 5
    sget-object v9, LEf/S;->a:LLf/e;

    .line 6
    sget-object v9, LLf/d;->b:LLf/d;

    .line 7
    new-instance v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/j;

    invoke-direct {v10, v3, v6, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/j;-><init>(Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;Ljf/c;)V

    invoke-static {v9, v10, v4}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_4

    return-object v5

    :cond_4
    move-object v5, v0

    .line 8
    :goto_1
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/i;

    .line 9
    instance-of v6, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/h;

    if-eqz v6, :cond_5

    .line 10
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/A0;

    .line 11
    iget-object v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/A0;

    .line 12
    iget-object v3, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/A0;->a:Ljava/lang/Integer;

    .line 13
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/h;

    .line 14
    iget-object v4, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/h;->a:Ljava/io/File;

    .line 15
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    .line 16
    iget-object v5, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/A0;

    iget-object v5, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/A0;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/B0;

    .line 17
    invoke-direct {v2, v3, v4, v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/A0;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/B0;)V

    .line 18
    new-instance v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;

    iget-object v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/C0;

    iget-object v4, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/E0;

    iget-object v10, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->a:Ljava/lang/String;

    iget-object v11, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->b:Ljava/lang/String;

    iget-object v12, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->c:Ljava/lang/String;

    iget-object v13, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->d:Ljava/lang/String;

    iget-object v14, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->e:Ljava/lang/String;

    iget-object v15, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;->f:Ljava/lang/Integer;

    move-object/from16 v17, v2

    move-object/from16 v16, v3

    move-object/from16 v18, v4

    invoke-direct/range {v9 .. v18}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/C0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/A0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/E0;)V

    move-object v7, v9

    goto :goto_3

    .line 19
    :cond_5
    iget-object v5, v5, LY2/B;->c:Ljava/lang/Object;

    check-cast v5, Lcom/moloco/sdk/internal/error/b;

    new-instance v6, Lcom/moloco/sdk/internal/error/a;

    if-eqz v2, :cond_6

    invoke-direct {v6, v2}, Lcom/moloco/sdk/internal/error/a;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    invoke-direct {v6, v8}, Lcom/moloco/sdk/internal/error/a;-><init>(Ljava/lang/String;)V

    :goto_2
    const-string v2, "DEC_FAILED_TO_LOAD"

    invoke-virtual {v5, v2, v6}, Lcom/moloco/sdk/internal/error/b;->a(Ljava/lang/String;Lcom/moloco/sdk/internal/error/a;)V

    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "dec loading error: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ": `Not found` for "

    .line 21
    invoke-static {v2, v4, v3}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 22
    sget-object v8, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const-string v9, "DECLoaderImpl"

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    :goto_3
    if-nez v7, :cond_7

    return-object v1

    :cond_7
    return-object v7

    .line 23
    :cond_8
    :goto_4
    new-instance v3, Lcom/moloco/sdk/internal/error/a;

    if-eqz v2, :cond_9

    invoke-direct {v3, v2}, Lcom/moloco/sdk/internal/error/a;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_9
    invoke-direct {v3, v8}, Lcom/moloco/sdk/internal/error/a;-><init>(Ljava/lang/String;)V

    :goto_5
    iget-object v2, v0, LY2/B;->c:Ljava/lang/Object;

    check-cast v2, Lcom/moloco/sdk/internal/error/b;

    const-string v4, "DEC_LOADED_WITH_NO_APP_ICON"

    invoke-virtual {v2, v4, v3}, Lcom/moloco/sdk/internal/error/b;->a(Ljava/lang/String;Lcom/moloco/sdk/internal/error/a;)V

    .line 24
    sget-object v5, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, "DECLoaderImpl"

    const-string v7, "can\'t precache DEC: appIconUri is null"

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    return-object v1
.end method

.method public a()V
    .locals 14

    const/4 v1, 0x1

    const/4 v0, 0x0

    iget v2, p0, LY2/B;->a:I

    packed-switch v2, :pswitch_data_0

    .line 25
    sget-object v3, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    const/16 v8, 0xc

    const/4 v9, 0x0

    const-string v4, "TemplateFullscreenAd"

    const-string v5, "Skip button shown, triggering listener callback"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 26
    iget-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/q;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/i;->a()V

    :cond_0
    return-void

    .line 27
    :pswitch_0
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 28
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x18

    if-lt v3, v4, :cond_1

    .line 29
    invoke-static {v2}, Lff/o;->X0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    :goto_0
    move-object v13, v2

    goto :goto_1

    .line 30
    :cond_1
    sget-object v2, Lff/x;->a:Lff/x;

    goto :goto_0

    .line 31
    :goto_1
    new-instance v3, LJ3/d;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v9, -0x1

    const-wide/16 v11, -0x1

    invoke-direct/range {v3 .. v13}, LJ3/d;-><init>(IZZZZJJLjava/util/Set;)V

    .line 32
    iget-object v2, p0, LY2/B;->b:Ljava/lang/Object;

    check-cast v2, Lcom/moloco/sdk/acm/n;

    iget-object v4, v2, Lcom/moloco/sdk/acm/n;->b:Ljava/lang/String;

    .line 33
    new-instance v5, Lef/k;

    const-string v6, "url"

    invoke-direct {v5, v6, v4}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    iget-object v2, v2, Lcom/moloco/sdk/acm/n;->d:Ljava/lang/Object;

    .line 35
    const-string v4, "AppKey"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 36
    new-instance v7, Lef/k;

    invoke-direct {v7, v4, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    const-string v4, "AppBundle"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 38
    new-instance v8, Lef/k;

    invoke-direct {v8, v4, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    const-string v4, "AppVersion"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 40
    new-instance v9, Lef/k;

    invoke-direct {v9, v4, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    const-string v4, "OS"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 42
    new-instance v10, Lef/k;

    invoke-direct {v10, v4, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    const-string v4, "osv"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 44
    new-instance v11, Lef/k;

    invoke-direct {v11, v4, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    const-string v4, "SdkVersion"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 46
    new-instance v12, Lef/k;

    invoke-direct {v12, v4, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    const-string v4, "Mediator"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 48
    new-instance v6, Lef/k;

    invoke-direct {v6, v4, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v2, 0x8

    .line 49
    new-array v2, v2, [Lef/k;

    aput-object v5, v2, v0

    aput-object v7, v2, v1

    const/4 v4, 0x2

    aput-object v8, v2, v4

    const/4 v4, 0x3

    aput-object v9, v2, v4

    const/4 v4, 0x4

    aput-object v10, v2, v4

    const/4 v4, 0x5

    aput-object v11, v2, v4

    const/4 v4, 0x6

    aput-object v12, v2, v4

    const/4 v4, 0x7

    aput-object v6, v2, v4

    .line 50
    invoke-static {v2}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    move-result-object v2

    .line 51
    :try_start_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 53
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    .line 54
    new-instance v8, Lef/k;

    invoke-direct {v8, v7, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 55
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_4

    .line 56
    :cond_2
    new-array v5, v0, [Lef/k;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    .line 57
    check-cast v4, [Lef/k;

    array-length v5, v4

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Lef/k;

    .line 58
    new-instance v5, LJ3/g;

    invoke-direct {v5, v0}, LJ3/g;-><init>(I)V

    .line 59
    array-length v6, v4

    :goto_3
    if-ge v0, v6, :cond_3

    aget-object v7, v4, v0

    .line 60
    iget-object v8, v7, Lef/k;->a:Ljava/lang/Object;

    .line 61
    check-cast v8, Ljava/lang/String;

    .line 62
    iget-object v7, v7, Lef/k;->b:Ljava/lang/Object;

    .line 63
    invoke-virtual {v5, v7, v8}, LJ3/g;->i(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/2addr v0, v1

    goto :goto_3

    .line 64
    :cond_3
    invoke-virtual {v5}, LJ3/g;->a()LJ3/h;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    .line 65
    :goto_4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Data: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "DBPeriodicRequest"

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    :goto_5
    if-nez v0, :cond_4

    goto :goto_6

    .line 66
    :cond_4
    new-instance v2, LA7/b0;

    const-class v4, Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;

    invoke-direct {v2, v4}, LA7/b0;-><init>(Ljava/lang/Class;)V

    .line 67
    iget-object v4, v2, LA7/b0;->d:Ljava/lang/Object;

    check-cast v4, LS3/p;

    iput-object v3, v4, LS3/p;->j:LJ3/d;

    .line 68
    iput-object v0, v4, LS3/p;->e:LJ3/h;

    .line 69
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 70
    invoke-virtual {v2, v1}, LA7/b0;->r(I)V

    .line 71
    invoke-virtual {v2}, LA7/b0;->i()LJ3/s;

    move-result-object v0

    .line 72
    iget-object v1, p0, LY2/B;->c:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    invoke-static {v1}, LK3/q;->c(Landroid/content/Context;)LK3/q;

    move-result-object v1

    .line 73
    invoke-virtual {v1, v0}, LJ3/x;->a(LJ3/s;)LS3/e;

    :goto_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic b(LC6/l;)Ld2/j;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, LY2/B;->m(LC6/l;)Ld2/a;

    move-result-object p1

    return-object p1
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/q;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/i;->b()V

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object p1, p0, LY2/B;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lmd/J;

    .line 4
    .line 5
    iget-object v0, p1, Lmd/J;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 8
    .line 9
    iget-object v1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ltc/h;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    iget-object p1, p1, Lmd/J;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v0, "The queue becomes empty after removing config generation "

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget v0, v1, Ltc/h;->a:I

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v0, "SettingsChannel"

    .line 47
    .line 48
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
.end method

.method public d(Lcom/moloco/sdk/publisher/MolocoAd;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "molocoAd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/moloco/sdk/internal/publisher/b;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Lcom/moloco/sdk/internal/publisher/b;->b(Lcom/moloco/sdk/publisher/MolocoAd;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V
    .locals 1

    .line 1
    const-string v0, "internalShowError"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/q;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/i;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LY2/B;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;->destroy()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public f([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    const/16 v1, 0x400

    .line 3
    .line 4
    if-gt v0, v1, :cond_0

    .line 5
    .line 6
    return-object p1

    .line 7
    :cond_0
    iget-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, [La9/c;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    move-object v3, p1

    .line 13
    :goto_0
    const/4 v4, 0x1

    .line 14
    if-ge v2, v4, :cond_2

    .line 15
    .line 16
    aget-object v4, v0, v2

    .line 17
    .line 18
    array-length v5, v3

    .line 19
    if-gt v5, v1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    invoke-interface {v4, p1}, La9/c;->f([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    :goto_1
    array-length p1, v3

    .line 30
    if-le p1, v1, :cond_3

    .line 31
    .line 32
    iget-object p1, p0, LY2/B;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, La9/a;

    .line 35
    .line 36
    invoke-virtual {p1, v3}, La9/a;->f([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :cond_3
    return-object v3
.end method

.method public g(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    add-int/2addr v0, v1

    .line 18
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const-string v0, "="

    .line 22
    .line 23
    invoke-static {v2, p2, v0, p1}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p2, p0, LY2/B;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p2, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public h(Lt0/t;)V
    .locals 1

    .line 1
    const-string v0, "node"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lt0/t;->r()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lt0/P;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "Check failed."

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method public i()Lmd/b;
    .locals 4

    .line 1
    iget-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lmd/b;

    .line 10
    .line 11
    iget-object v0, v0, Lmd/b;->a:Ljava/util/IdentityHashMap;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/util/Map$Entry;

    .line 32
    .line 33
    iget-object v2, p0, LY2/B;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Ljava/util/IdentityHashMap;

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v2, v3}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_0

    .line 46
    .line 47
    iget-object v2, p0, LY2/B;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Ljava/util/IdentityHashMap;

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Lmd/a;

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v2, v3, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    new-instance v0, Lmd/b;

    .line 66
    .line 67
    iget-object v1, p0, LY2/B;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Ljava/util/IdentityHashMap;

    .line 70
    .line 71
    invoke-direct {v0, v1}, Lmd/b;-><init>(Ljava/util/IdentityHashMap;)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    iput-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 78
    .line 79
    :cond_2
    iget-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Lmd/b;

    .line 82
    .line 83
    return-object v0
.end method

.method public j()V
    .locals 2

    .line 1
    iget-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public k(JLQ1/o;)V
    .locals 4

    .line 1
    invoke-virtual {p3}, LQ1/o;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p3}, LQ1/o;->h()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p3}, LQ1/o;->h()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p3}, LQ1/o;->u()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/16 v3, 0x1b2

    .line 23
    .line 24
    if-ne v0, v3, :cond_1

    .line 25
    .line 26
    const v0, 0x47413934

    .line 27
    .line 28
    .line 29
    if-ne v1, v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x3

    .line 32
    if-ne v2, v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, [Ls2/C;

    .line 37
    .line 38
    invoke-static {p1, p2, p3, v0}, Ls2/a;->g(JLQ1/o;[Ls2/C;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    return-void
.end method

.method public l(Ls9/h;)Z
    .locals 3

    .line 1
    new-instance v0, Lr9/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lr9/c;-><init>(Ls9/h;I)V

    .line 5
    .line 6
    .line 7
    iget-object v2, p0, LY2/B;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lc9/d;

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Lc9/d;->b(Lr9/c;)LA7/v;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v2, v0, LA7/v;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ljava/util/Iterator;

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    return v1

    .line 26
    :cond_0
    invoke-virtual {v0}, LA7/v;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lr9/c;

    .line 31
    .line 32
    iget-object v0, v0, Lr9/c;->a:Ls9/h;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ls9/h;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    return p1
.end method

.method public m(LC6/l;)Ld2/a;
    .locals 6

    .line 1
    const-string v0, "createCodec:"

    .line 2
    .line 3
    iget-object v1, p1, LC6/l;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ld2/m;

    .line 6
    .line 7
    iget-object v1, v1, Ld2/m;->a:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 26
    .line 27
    .line 28
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 29
    :try_start_1
    new-instance v1, Ld2/d;

    .line 30
    .line 31
    iget-object v3, p0, LY2/B;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, LV5/b;

    .line 34
    .line 35
    invoke-virtual {v3}, LV5/b;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Landroid/os/HandlerThread;

    .line 40
    .line 41
    invoke-direct {v1, v0, v3}, Ld2/d;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;)V

    .line 42
    .line 43
    .line 44
    new-instance v3, Ld2/a;

    .line 45
    .line 46
    iget-object v4, p0, LY2/B;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v4, LV5/b;

    .line 49
    .line 50
    invoke-virtual {v4}, LV5/b;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Landroid/os/HandlerThread;

    .line 55
    .line 56
    iget-object v5, p1, LC6/l;->f:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v5, LDd/c;

    .line 59
    .line 60
    invoke-direct {v3, v0, v4, v1, v5}, Ld2/a;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Ld2/k;LDd/c;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 61
    .line 62
    .line 63
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 64
    .line 65
    .line 66
    iget-object v1, p1, LC6/l;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Landroid/view/Surface;

    .line 69
    .line 70
    if-nez v1, :cond_0

    .line 71
    .line 72
    iget-object v2, p1, LC6/l;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Ld2/m;

    .line 75
    .line 76
    iget-boolean v2, v2, Ld2/m;->h:Z

    .line 77
    .line 78
    if-eqz v2, :cond_0

    .line 79
    .line 80
    sget v2, LQ1/x;->a:I

    .line 81
    .line 82
    const/16 v4, 0x23

    .line 83
    .line 84
    if-lt v2, v4, :cond_0

    .line 85
    .line 86
    const/16 v2, 0x8

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catch_0
    move-exception p1

    .line 90
    move-object v2, v3

    .line 91
    goto :goto_1

    .line 92
    :cond_0
    const/4 v2, 0x0

    .line 93
    :goto_0
    iget-object v4, p1, LC6/l;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v4, Landroid/media/MediaFormat;

    .line 96
    .line 97
    iget-object p1, p1, LC6/l;->e:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p1, Landroid/media/MediaCrypto;

    .line 100
    .line 101
    invoke-static {v3, v4, v1, p1, v2}, Ld2/a;->a(Ld2/a;Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 102
    .line 103
    .line 104
    return-object v3

    .line 105
    :catch_1
    move-exception p1

    .line 106
    goto :goto_1

    .line 107
    :catch_2
    move-exception p1

    .line 108
    move-object v0, v2

    .line 109
    :goto_1
    if-nez v2, :cond_1

    .line 110
    .line 111
    if-eqz v0, :cond_2

    .line 112
    .line 113
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_1
    invoke-virtual {v2}, Ld2/a;->release()V

    .line 118
    .line 119
    .line 120
    :cond_2
    :goto_2
    throw p1
.end method

.method public n(Ls2/o;LT5/B;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, LY2/B;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, [Ls2/C;

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-ge v1, v3, :cond_2

    .line 9
    .line 10
    invoke-virtual {p2}, LT5/B;->a()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, LT5/B;->b()V

    .line 14
    .line 15
    .line 16
    iget v3, p2, LT5/B;->e:I

    .line 17
    .line 18
    const/4 v4, 0x3

    .line 19
    invoke-interface {p1, v3, v4}, Ls2/o;->m(II)Ls2/C;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v4, p0, LY2/B;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, LN1/n;

    .line 32
    .line 33
    iget-object v5, v4, LN1/n;->n:Ljava/lang/String;

    .line 34
    .line 35
    const-string v6, "application/cea-608"

    .line 36
    .line 37
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-nez v6, :cond_1

    .line 42
    .line 43
    const-string v6, "application/cea-708"

    .line 44
    .line 45
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    move v6, v0

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    :goto_1
    const/4 v6, 0x1

    .line 55
    :goto_2
    new-instance v7, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v8, "Invalid closed caption MIME type provided: "

    .line 58
    .line 59
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-static {v7, v6}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    new-instance v6, LN1/m;

    .line 73
    .line 74
    invoke-direct {v6}, LN1/m;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, LT5/B;->b()V

    .line 78
    .line 79
    .line 80
    iget-object v7, p2, LT5/B;->f:Ljava/lang/String;

    .line 81
    .line 82
    iput-object v7, v6, LN1/m;->a:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v5}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    iput-object v5, v6, LN1/m;->m:Ljava/lang/String;

    .line 89
    .line 90
    iget v5, v4, LN1/n;->e:I

    .line 91
    .line 92
    iput v5, v6, LN1/m;->e:I

    .line 93
    .line 94
    iget-object v5, v4, LN1/n;->d:Ljava/lang/String;

    .line 95
    .line 96
    iput-object v5, v6, LN1/m;->d:Ljava/lang/String;

    .line 97
    .line 98
    iget v5, v4, LN1/n;->H:I

    .line 99
    .line 100
    iput v5, v6, LN1/m;->G:I

    .line 101
    .line 102
    iget-object v4, v4, LN1/n;->q:Ljava/util/List;

    .line 103
    .line 104
    iput-object v4, v6, LN1/m;->p:Ljava/util/List;

    .line 105
    .line 106
    invoke-static {v6, v3}, LVa/M6;->y(LN1/m;Ls2/C;)V

    .line 107
    .line 108
    .line 109
    aput-object v3, v2, v1

    .line 110
    .line 111
    add-int/lit8 v1, v1, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    return-void
.end method

.method public o(I)V
    .locals 4

    .line 1
    iget-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    add-int/lit8 p1, p1, 0x1

    .line 15
    .line 16
    new-array p1, p1, [I

    .line 17
    .line 18
    iput-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {p1, v1}, Ljava/util/Arrays;->fill([II)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    array-length v2, v0

    .line 25
    if-lt p1, v2, :cond_2

    .line 26
    .line 27
    array-length v2, v0

    .line 28
    :goto_0
    if-gt v2, p1, :cond_1

    .line 29
    .line 30
    mul-int/lit8 v2, v2, 0x2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-array p1, v2, [I

    .line 34
    .line 35
    iput-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 36
    .line 37
    array-length v2, v0

    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-static {v0, v3, p1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, [I

    .line 45
    .line 46
    array-length v0, v0

    .line 47
    array-length v2, p1

    .line 48
    invoke-static {p1, v0, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void
.end method

.method public onMethodCall(Luc/o;Luc/q;)V
    .locals 3

    .line 1
    iget-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/ads/nativead/l;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LDd/c;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ljava/util/Map;

    .line 14
    .line 15
    check-cast p2, Ltc/g;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object p1, p1, Luc/o;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const-string v1, "getKeyboardState"

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    check-cast p2, Ltc/g;

    .line 35
    .line 36
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    :try_start_0
    iget-object p1, v0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, LDd/c;

    .line 43
    .line 44
    iget-object p1, p1, LDd/c;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, [Lkc/x;

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    aget-object p1, p1, v0

    .line 50
    .line 51
    check-cast p1, Lkc/w;

    .line 52
    .line 53
    iget-object p1, p1, Lkc/w;->b:Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, LY2/B;->b:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catch_0
    move-exception p1

    .line 63
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string v0, "error"

    .line 68
    .line 69
    move-object v1, p2

    .line 70
    check-cast v1, Ltc/g;

    .line 71
    .line 72
    const/4 v2, 0x0

    .line 73
    invoke-virtual {v1, v0, p1, v2}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    iget-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, Ljava/util/Map;

    .line 79
    .line 80
    check-cast p2, Ltc/g;

    .line 81
    .line 82
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public p(II)V
    .locals 3

    .line 1
    iget-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    array-length v0, v0

    .line 8
    if-lt p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    add-int v0, p1, p2

    .line 12
    .line 13
    invoke-virtual {p0, v0}, LY2/B;->o(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, [I

    .line 19
    .line 20
    array-length v2, v1

    .line 21
    sub-int/2addr v2, p1

    .line 22
    sub-int/2addr v2, p2

    .line 23
    invoke-static {v1, p1, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, [I

    .line 29
    .line 30
    const/4 v2, -0x1

    .line 31
    invoke-static {v1, p1, v0, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    add-int/lit8 v0, v0, -0x1

    .line 46
    .line 47
    :goto_0
    if-ltz v0, :cond_3

    .line 48
    .line 49
    iget-object v1, p0, LY2/B;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Landroidx/recyclerview/widget/t0;

    .line 58
    .line 59
    iget v2, v1, Landroidx/recyclerview/widget/t0;->a:I

    .line 60
    .line 61
    if-ge v2, p1, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    add-int/2addr v2, p2

    .line 65
    iput v2, v1, Landroidx/recyclerview/widget/t0;->a:I

    .line 66
    .line 67
    :goto_1
    add-int/lit8 v0, v0, -0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    :goto_2
    return-void
.end method

.method public q(II)V
    .locals 5

    .line 1
    iget-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    array-length v0, v0

    .line 8
    if-lt p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    add-int v0, p1, p2

    .line 12
    .line 13
    invoke-virtual {p0, v0}, LY2/B;->o(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, [I

    .line 19
    .line 20
    array-length v2, v1

    .line 21
    sub-int/2addr v2, p1

    .line 22
    sub-int/2addr v2, p2

    .line 23
    invoke-static {v1, v0, v1, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, [I

    .line 29
    .line 30
    array-length v2, v1

    .line 31
    sub-int/2addr v2, p2

    .line 32
    array-length v3, v1

    .line 33
    const/4 v4, -0x1

    .line 34
    invoke-static {v1, v2, v3, v4}, Ljava/util/Arrays;->fill([IIII)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, LY2/B;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/util/ArrayList;

    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/lit8 v1, v1, -0x1

    .line 49
    .line 50
    :goto_0
    if-ltz v1, :cond_4

    .line 51
    .line 52
    iget-object v2, p0, LY2/B;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Landroidx/recyclerview/widget/t0;

    .line 61
    .line 62
    iget v3, v2, Landroidx/recyclerview/widget/t0;->a:I

    .line 63
    .line 64
    if-ge v3, p1, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    if-ge v3, v0, :cond_3

    .line 68
    .line 69
    iget-object v2, p0, LY2/B;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    sub-int/2addr v3, p2

    .line 78
    iput v3, v2, Landroidx/recyclerview/widget/t0;->a:I

    .line 79
    .line 80
    :goto_1
    add-int/lit8 v1, v1, -0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    :goto_2
    return-void
.end method

.method public s(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 1

    .line 1
    const-string v0, "molocoAd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/moloco/sdk/internal/publisher/b;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/internal/publisher/b;->d(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public t(Landroid/net/Uri;LS1/j;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo2/o;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lo2/o;->t(Landroid/net/Uri;LS1/j;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lf2/a;

    .line 10
    .line 11
    iget-object p2, p0, LY2/B;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, Ljava/util/List;

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-interface {p1, p2}, Lf2/a;->a(Ljava/util/List;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lf2/a;

    .line 29
    .line 30
    :cond_1
    :goto_0
    return-object p1
.end method

.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 9

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    iget-object p1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, LS8/f;

    .line 6
    .line 7
    iget-object p1, p1, LS8/f;->c:LS8/c;

    .line 8
    .line 9
    iget-object p1, p1, LS8/c;->a:Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    new-instance v0, LG8/c;

    .line 12
    .line 13
    const/4 v1, 0x6

    .line 14
    invoke-direct {v0, p0, v1}, LG8/c;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lorg/json/JSONObject;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object v1, p0, LY2/B;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, LK3/r;

    .line 33
    .line 34
    iget-object v2, v1, LK3/r;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lxa/d;

    .line 37
    .line 38
    invoke-virtual {v2, p1}, Lxa/d;->B(Lorg/json/JSONObject;)LZ8/a;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iget-wide v3, v2, LZ8/a;->c:J

    .line 43
    .line 44
    iget-object v5, v1, LK3/r;->e:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v5, LY9/c;

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const-string v6, "Failed to close settings writer."

    .line 52
    .line 53
    const/4 v7, 0x2

    .line 54
    const-string v8, "FirebaseCrashlytics"

    .line 55
    .line 56
    invoke-static {v8, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_0

    .line 61
    .line 62
    const-string v7, "Writing settings to cache file..."

    .line 63
    .line 64
    invoke-static {v8, v7, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 65
    .line 66
    .line 67
    :cond_0
    :try_start_0
    const-string v7, "expires_at"

    .line 68
    .line 69
    invoke-virtual {p1, v7, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 70
    .line 71
    .line 72
    new-instance v3, Ljava/io/FileWriter;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 73
    .line 74
    :try_start_1
    iget-object v4, v5, LY9/c;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, Ljava/io/File;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    :try_start_2
    invoke-direct {v3, v4}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 79
    .line 80
    .line 81
    :try_start_3
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v3, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/io/Writer;->flush()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 89
    .line 90
    .line 91
    :goto_0
    invoke-static {v3, v6}, LR8/g;->b(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    goto :goto_3

    .line 95
    :catchall_0
    move-exception p1

    .line 96
    move-object v0, v3

    .line 97
    goto :goto_4

    .line 98
    :catch_0
    move-exception v4

    .line 99
    goto :goto_2

    .line 100
    :catchall_1
    move-exception p1

    .line 101
    goto :goto_4

    .line 102
    :catch_1
    move-exception v4

    .line 103
    :goto_1
    move-object v3, v0

    .line 104
    goto :goto_2

    .line 105
    :catch_2
    move-exception v3

    .line 106
    move-object v4, v3

    .line 107
    goto :goto_1

    .line 108
    :goto_2
    :try_start_4
    const-string v5, "Failed to cache settings"

    .line 109
    .line 110
    invoke-static {v8, v5, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :goto_3
    const-string v3, "Loaded settings: "

    .line 115
    .line 116
    invoke-static {v3, p1}, LK3/r;->d(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 117
    .line 118
    .line 119
    iget-object p1, v1, LK3/r;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p1, LZ8/c;

    .line 122
    .line 123
    iget-object p1, p1, LZ8/c;->f:Ljava/lang/String;

    .line 124
    .line 125
    const-string v3, "com.google.firebase.crashlytics"

    .line 126
    .line 127
    const/4 v4, 0x0

    .line 128
    iget-object v5, v1, LK3/r;->a:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v5, Landroid/content/Context;

    .line 131
    .line 132
    invoke-virtual {v5, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    const-string v4, "existing_instance_identifier"

    .line 141
    .line 142
    invoke-interface {v3, v4, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 143
    .line 144
    .line 145
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 146
    .line 147
    .line 148
    iget-object p1, v1, LK3/r;->h:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 151
    .line 152
    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iget-object p1, v1, LK3/r;->i:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    check-cast p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 164
    .line 165
    invoke-virtual {p1, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_5

    .line 169
    :goto_4
    invoke-static {v0, v6}, LR8/g;->b(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p1

    .line 173
    :cond_1
    :goto_5
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, LY2/B;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

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
    :sswitch_0
    iget-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lt0/P;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "set.toString()"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :sswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const/16 v1, 0x64

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, LY2/B;->c:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const/16 v1, 0x7b

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, LY2/B;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const/4 v3, 0x0

    .line 59
    :goto_0
    if-ge v3, v2, :cond_1

    .line 60
    .line 61
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    add-int/lit8 v4, v2, -0x1

    .line 71
    .line 72
    if-ge v3, v4, :cond_0

    .line 73
    .line 74
    const-string v4, ", "

    .line 75
    .line 76
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    const/16 v1, 0x7d

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0

    .line 92
    nop

    .line 93
    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public u(Ljava/lang/String;)Lo9/e;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lo9/e;

    .line 10
    .line 11
    return-object p1
.end method

.method public v(LX2/j;)V
    .locals 13

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    sget-object v3, Lg2/C;->c:Lg2/C;

    .line 5
    .line 6
    iget-object v4, p1, LX2/j;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v4, Lg2/F;

    .line 9
    .line 10
    iget-object v4, v4, Lg2/F;->a:Ll8/j0;

    .line 11
    .line 12
    const-string v5, "range"

    .line 13
    .line 14
    invoke-virtual {v4, v5}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, Ljava/lang/String;

    .line 19
    .line 20
    iget-object v5, p0, LY2/B;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Lg2/n;

    .line 23
    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    :try_start_0
    invoke-static {v4}, Lg2/C;->a(Ljava/lang/String;)Lg2/C;

    .line 27
    .line 28
    .line 29
    move-result-object v3
    :try_end_0
    .catch LN1/D; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception p1

    .line 32
    iget-object v0, v5, Lg2/n;->a:Lac/a;

    .line 33
    .line 34
    const-string v1, "SDP format error."

    .line 35
    .line 36
    invoke-virtual {v0, v1, p1}, Lac/a;->N(Ljava/lang/String;Ljava/io/IOException;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    :goto_0
    iget-object v4, v5, Lg2/n;->h:Landroid/net/Uri;

    .line 41
    .line 42
    const-string v6, "initialCapacity"

    .line 43
    .line 44
    invoke-static {v0, v6}, Ll8/s;->d(ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-array v6, v0, [Ljava/lang/Object;

    .line 48
    .line 49
    move v7, v1

    .line 50
    move v8, v7

    .line 51
    :goto_1
    iget-object v9, p1, LX2/j;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v9, Lg2/F;

    .line 54
    .line 55
    iget-object v9, v9, Lg2/F;->b:Ll8/e0;

    .line 56
    .line 57
    iget v10, v9, Ll8/e0;->d:I

    .line 58
    .line 59
    if-ge v7, v10, :cond_13

    .line 60
    .line 61
    invoke-virtual {v9, v7}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    check-cast v9, Lg2/c;

    .line 66
    .line 67
    iget-object v10, v9, Lg2/c;->j:Lg2/b;

    .line 68
    .line 69
    iget-object v10, v10, Lg2/b;->b:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v10}, LA6/h;->P(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    const/4 v11, -0x1

    .line 79
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    sparse-switch v12, :sswitch_data_0

    .line 84
    .line 85
    .line 86
    goto/16 :goto_2

    .line 87
    .line 88
    :sswitch_0
    const-string v12, "H263-2000"

    .line 89
    .line 90
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    if-nez v10, :cond_1

    .line 95
    .line 96
    goto/16 :goto_2

    .line 97
    .line 98
    :cond_1
    const/16 v11, 0x10

    .line 99
    .line 100
    goto/16 :goto_2

    .line 101
    .line 102
    :sswitch_1
    const-string v12, "H263-1998"

    .line 103
    .line 104
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    if-nez v10, :cond_2

    .line 109
    .line 110
    goto/16 :goto_2

    .line 111
    .line 112
    :cond_2
    const/16 v11, 0xf

    .line 113
    .line 114
    goto/16 :goto_2

    .line 115
    .line 116
    :sswitch_2
    const-string v12, "MP4V-ES"

    .line 117
    .line 118
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    if-nez v10, :cond_3

    .line 123
    .line 124
    goto/16 :goto_2

    .line 125
    .line 126
    :cond_3
    const/16 v11, 0xe

    .line 127
    .line 128
    goto/16 :goto_2

    .line 129
    .line 130
    :sswitch_3
    const-string v12, "AMR-WB"

    .line 131
    .line 132
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    if-nez v10, :cond_4

    .line 137
    .line 138
    goto/16 :goto_2

    .line 139
    .line 140
    :cond_4
    const/16 v11, 0xd

    .line 141
    .line 142
    goto/16 :goto_2

    .line 143
    .line 144
    :sswitch_4
    const-string v12, "MP4A-LATM"

    .line 145
    .line 146
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    if-nez v10, :cond_5

    .line 151
    .line 152
    goto/16 :goto_2

    .line 153
    .line 154
    :cond_5
    const/16 v11, 0xc

    .line 155
    .line 156
    goto/16 :goto_2

    .line 157
    .line 158
    :sswitch_5
    const-string v12, "PCMU"

    .line 159
    .line 160
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    if-nez v10, :cond_6

    .line 165
    .line 166
    goto/16 :goto_2

    .line 167
    .line 168
    :cond_6
    const/16 v11, 0xb

    .line 169
    .line 170
    goto/16 :goto_2

    .line 171
    .line 172
    :sswitch_6
    const-string v12, "PCMA"

    .line 173
    .line 174
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    if-nez v10, :cond_7

    .line 179
    .line 180
    goto/16 :goto_2

    .line 181
    .line 182
    :cond_7
    const/16 v11, 0xa

    .line 183
    .line 184
    goto/16 :goto_2

    .line 185
    .line 186
    :sswitch_7
    const-string v12, "OPUS"

    .line 187
    .line 188
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    if-nez v10, :cond_8

    .line 193
    .line 194
    goto/16 :goto_2

    .line 195
    .line 196
    :cond_8
    const/16 v11, 0x9

    .line 197
    .line 198
    goto/16 :goto_2

    .line 199
    .line 200
    :sswitch_8
    const-string v12, "H265"

    .line 201
    .line 202
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    if-nez v10, :cond_9

    .line 207
    .line 208
    goto/16 :goto_2

    .line 209
    .line 210
    :cond_9
    const/16 v11, 0x8

    .line 211
    .line 212
    goto/16 :goto_2

    .line 213
    .line 214
    :sswitch_9
    const-string v12, "H264"

    .line 215
    .line 216
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v10

    .line 220
    if-nez v10, :cond_a

    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_a
    const/4 v11, 0x7

    .line 224
    goto :goto_2

    .line 225
    :sswitch_a
    const-string v12, "VP9"

    .line 226
    .line 227
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v10

    .line 231
    if-nez v10, :cond_b

    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_b
    const/4 v11, 0x6

    .line 235
    goto :goto_2

    .line 236
    :sswitch_b
    const-string v12, "VP8"

    .line 237
    .line 238
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    if-nez v10, :cond_c

    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_c
    const/4 v11, 0x5

    .line 246
    goto :goto_2

    .line 247
    :sswitch_c
    const-string v12, "L16"

    .line 248
    .line 249
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v10

    .line 253
    if-nez v10, :cond_d

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_d
    move v11, v0

    .line 257
    goto :goto_2

    .line 258
    :sswitch_d
    const-string v12, "AMR"

    .line 259
    .line 260
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v10

    .line 264
    if-nez v10, :cond_e

    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_e
    const/4 v11, 0x3

    .line 268
    goto :goto_2

    .line 269
    :sswitch_e
    const-string v12, "AC3"

    .line 270
    .line 271
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    if-nez v10, :cond_f

    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_f
    const/4 v11, 0x2

    .line 279
    goto :goto_2

    .line 280
    :sswitch_f
    const-string v12, "L8"

    .line 281
    .line 282
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v10

    .line 286
    if-nez v10, :cond_10

    .line 287
    .line 288
    goto :goto_2

    .line 289
    :cond_10
    move v11, v2

    .line 290
    goto :goto_2

    .line 291
    :sswitch_10
    const-string v12, "MPEG4-GENERIC"

    .line 292
    .line 293
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v10

    .line 297
    if-nez v10, :cond_11

    .line 298
    .line 299
    goto :goto_2

    .line 300
    :cond_11
    move v11, v1

    .line 301
    :goto_2
    packed-switch v11, :pswitch_data_0

    .line 302
    .line 303
    .line 304
    goto :goto_4

    .line 305
    :pswitch_0
    new-instance v10, Lg2/w;

    .line 306
    .line 307
    iget-object v11, p1, LX2/j;->b:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v11, Lg2/o;

    .line 310
    .line 311
    invoke-direct {v10, v11, v9, v4}, Lg2/w;-><init>(Lg2/o;Lg2/c;Landroid/net/Uri;)V

    .line 312
    .line 313
    .line 314
    array-length v9, v6

    .line 315
    add-int/lit8 v11, v8, 0x1

    .line 316
    .line 317
    invoke-static {v9, v11}, Ll8/E;->f(II)I

    .line 318
    .line 319
    .line 320
    move-result v9

    .line 321
    array-length v12, v6

    .line 322
    if-gt v9, v12, :cond_12

    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_12
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    :goto_3
    aput-object v10, v6, v8

    .line 330
    .line 331
    move v8, v11

    .line 332
    :goto_4
    add-int/2addr v7, v2

    .line 333
    goto/16 :goto_1

    .line 334
    .line 335
    :cond_13
    invoke-static {v8, v6}, Ll8/K;->h(I[Ljava/lang/Object;)Ll8/e0;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    iget-object v4, v5, Lg2/n;->a:Lac/a;

    .line 344
    .line 345
    if-eqz v0, :cond_14

    .line 346
    .line 347
    const/4 p1, 0x0

    .line 348
    const-string v0, "No playable track."

    .line 349
    .line 350
    invoke-virtual {v4, v0, p1}, Lac/a;->N(Ljava/lang/String;Ljava/io/IOException;)V

    .line 351
    .line 352
    .line 353
    return-void

    .line 354
    :cond_14
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    move v0, v1

    .line 358
    :goto_5
    iget v6, p1, Ll8/e0;->d:I

    .line 359
    .line 360
    iget-object v7, v4, Lac/a;->b:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v7, Lg2/s;

    .line 363
    .line 364
    if-ge v0, v6, :cond_15

    .line 365
    .line 366
    invoke-virtual {p1, v0}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v6

    .line 370
    check-cast v6, Lg2/w;

    .line 371
    .line 372
    new-instance v8, Lg2/r;

    .line 373
    .line 374
    iget-object v9, v7, Lg2/s;->h:Lad/I;

    .line 375
    .line 376
    invoke-direct {v8, v7, v6, v0, v9}, Lg2/r;-><init>(Lg2/s;Lg2/w;ILg2/d;)V

    .line 377
    .line 378
    .line 379
    iget-object v6, v7, Lg2/s;->e:Ljava/util/ArrayList;

    .line 380
    .line 381
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    iget-object v6, v8, Lg2/r;->a:Lg2/q;

    .line 385
    .line 386
    iget-object v6, v6, Lg2/q;->b:Lg2/f;

    .line 387
    .line 388
    iget-object v8, v8, Lg2/r;->b:Lo2/m;

    .line 389
    .line 390
    iget-object v7, v7, Lg2/s;->c:Lac/a;

    .line 391
    .line 392
    invoke-virtual {v8, v6, v7, v1}, Lo2/m;->f(Lo2/j;Lo2/h;I)J

    .line 393
    .line 394
    .line 395
    add-int/2addr v0, v2

    .line 396
    goto :goto_5

    .line 397
    :cond_15
    iget-object p1, v7, Lg2/s;->g:Lcom/google/android/gms/ads/nativead/l;

    .line 398
    .line 399
    iget-wide v6, v3, Lg2/C;->a:J

    .line 400
    .line 401
    iget-wide v3, v3, Lg2/C;->b:J

    .line 402
    .line 403
    sub-long v6, v3, v6

    .line 404
    .line 405
    invoke-static {v6, v7}, LQ1/x;->K(J)J

    .line 406
    .line 407
    .line 408
    move-result-wide v6

    .line 409
    iget-object p1, p1, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast p1, Lg2/v;

    .line 412
    .line 413
    iput-wide v6, p1, Lg2/v;->l:J

    .line 414
    .line 415
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    cmp-long v0, v3, v6

    .line 421
    .line 422
    if-nez v0, :cond_16

    .line 423
    .line 424
    move v0, v2

    .line 425
    goto :goto_6

    .line 426
    :cond_16
    move v0, v1

    .line 427
    :goto_6
    xor-int/2addr v0, v2

    .line 428
    iput-boolean v0, p1, Lg2/v;->m:Z

    .line 429
    .line 430
    cmp-long v0, v3, v6

    .line 431
    .line 432
    if-nez v0, :cond_17

    .line 433
    .line 434
    move v0, v2

    .line 435
    goto :goto_7

    .line 436
    :cond_17
    move v0, v1

    .line 437
    :goto_7
    iput-boolean v0, p1, Lg2/v;->n:Z

    .line 438
    .line 439
    iput-boolean v1, p1, Lg2/v;->o:Z

    .line 440
    .line 441
    invoke-virtual {p1}, Lg2/v;->t()V

    .line 442
    .line 443
    .line 444
    iput-boolean v2, v5, Lg2/n;->p:Z

    .line 445
    .line 446
    return-void

    .line 447
    :sswitch_data_0
    .sparse-switch
        -0x7290cac7 -> :sswitch_10
        0x96c -> :sswitch_f
        0xfc51 -> :sswitch_e
        0xfda6 -> :sswitch_d
        0x12371 -> :sswitch_c
        0x14cbe -> :sswitch_b
        0x14cbf -> :sswitch_a
        0x217d28 -> :sswitch_9
        0x217d29 -> :sswitch_8
        0x25203f -> :sswitch_7
        0x2562c7 -> :sswitch_6
        0x2562db -> :sswitch_5
        0x3f401eeb -> :sswitch_4
        0x734e0c52 -> :sswitch_3
        0x74c813f6 -> :sswitch_2
        0x7f62e82d -> :sswitch_1
        0x7f6339a4 -> :sswitch_0
    .end sparse-switch

    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public w(Lo/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LS3/i;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LS3/i;->b(Lo/a;)Lo/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, v0, LS3/i;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Landroid/view/ActionMode$Callback;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LY2/B;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lj/w;

    .line 19
    .line 20
    iget-object v0, p1, Lj/w;->w:Landroid/widget/PopupWindow;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p1, Lj/w;->l:Landroid/view/Window;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p1, Lj/w;->x:Lj/m;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v0, p1, Lj/w;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p1, Lj/w;->y:Lk1/X;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0}, Lk1/X;->b()V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v0, p1, Lj/w;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 47
    .line 48
    invoke-static {v0}, Lk1/S;->a(Landroid/view/View;)Lk1/X;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-virtual {v0, v1}, Lk1/X;->a(F)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p1, Lj/w;->y:Lk1/X;

    .line 57
    .line 58
    new-instance v1, Lj/n;

    .line 59
    .line 60
    const/4 v2, 0x2

    .line 61
    invoke-direct {v1, p0, v2}, Lj/n;-><init>(Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lk1/X;->d(Lk1/Y;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    const/4 v0, 0x0

    .line 68
    iput-object v0, p1, Lj/w;->u:Lo/a;

    .line 69
    .line 70
    iget-object v0, p1, Lj/w;->A:Landroid/view/ViewGroup;

    .line 71
    .line 72
    sget-object v1, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 73
    .line 74
    invoke-static {v0}, Lk1/H;->c(Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lj/w;->J()V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public x()V
    .locals 5

    .line 1
    iget-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg2/n;

    .line 4
    .line 5
    iget v1, v0, Lg2/n;->o:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    move v1, v4

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v1, v3

    .line 15
    :goto_0
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 16
    .line 17
    .line 18
    iput v4, v0, Lg2/n;->o:I

    .line 19
    .line 20
    iput-boolean v3, v0, Lg2/n;->r:Z

    .line 21
    .line 22
    iget-wide v1, v0, Lg2/n;->s:J

    .line 23
    .line 24
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    cmp-long v3, v1, v3

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-static {v1, v2}, LQ1/x;->W(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    invoke-virtual {v0, v1, v2}, Lg2/n;->i(J)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public y(Lo/a;Lp/k;)Z
    .locals 4

    .line 1
    iget-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj/w;

    .line 4
    .line 5
    iget-object v0, v0, Lj/w;->A:Landroid/view/ViewGroup;

    .line 6
    .line 7
    sget-object v1, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    invoke-static {v0}, Lk1/H;->c(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LY2/B;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, LS3/i;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, LS3/i;->b(Lo/a;)Lo/f;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v1, v0, LS3/i;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lx/v;

    .line 23
    .line 24
    invoke-virtual {v1, p2}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Landroid/view/Menu;

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    new-instance v2, Lp/A;

    .line 33
    .line 34
    iget-object v3, v0, LS3/i;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Landroid/content/Context;

    .line 37
    .line 38
    invoke-direct {v2, v3, p2}, Lp/A;-><init>(Landroid/content/Context;Lp/k;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p2, v2}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_0
    iget-object p2, v0, LS3/i;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p2, Landroid/view/ActionMode$Callback;

    .line 47
    .line 48
    invoke-interface {p2, p1, v2}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    return p1
.end method

.method public z(I)Lc9/d;
    .locals 4

    .line 1
    invoke-static {}, Ls9/h;->b()Ls9/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lr9/c;

    .line 6
    .line 7
    invoke-direct {v1, v0, p1}, Lr9/c;-><init>(Ls9/h;I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LY2/B;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lc9/d;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lc9/d;->b(Lr9/c;)LA7/v;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Ls9/h;->c:Lc9/d;

    .line 19
    .line 20
    :goto_0
    iget-object v2, v0, LA7/v;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Ljava/util/Iterator;

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, LA7/v;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lr9/c;

    .line 35
    .line 36
    iget v3, v2, Lr9/c;->b:I

    .line 37
    .line 38
    if-ne v3, p1, :cond_0

    .line 39
    .line 40
    iget-object v2, v2, Lr9/c;->a:Ls9/h;

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return-object v1
.end method
