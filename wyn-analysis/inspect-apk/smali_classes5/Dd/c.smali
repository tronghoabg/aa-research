.class public final LDd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCd/G;
.implements LA7/T;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Ls2/o;
.implements LHe/b;
.implements LV5/k;
.implements Luc/p;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;
.implements Lg4/d;


# static fields
.field public static e:LDd/c;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, LDd/c;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, LV/e;->b:LV/i;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    .line 21
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDd/c;->c:Ljava/lang/Object;

    return-void

    .line 22
    :sswitch_0
    sget-object p1, Ld2/h;->a:Ld2/h;

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 25
    iput-object p1, p0, LDd/c;->c:Ljava/lang/Object;

    return-void

    .line 26
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_1
        0x16 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(ILandroid/text/TextPaint;Ljava/lang/CharSequence;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, LDd/c;->a:I

    const-string v0, "charSequence"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textPaint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    sget-object v0, Lef/j;->c:Lef/j;

    new-instance v1, LA0/c;

    invoke-direct {v1, p1, p2, p3}, LA0/c;-><init>(ILandroid/text/TextPaint;Ljava/lang/CharSequence;)V

    invoke-static {v0, v1}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    move-result-object p1

    iput-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    .line 13
    new-instance p1, LA0/e;

    const/4 v1, 0x0

    invoke-direct {p1, v1, p3, p2}, LA0/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, p1}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    move-result-object p1

    iput-object p1, p0, LDd/c;->c:Ljava/lang/Object;

    .line 14
    new-instance p1, LA0/d;

    invoke-direct {p1, p0, p3, p2, v1}, LA0/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v0, p1}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    move-result-object p1

    iput-object p1, p0, LDd/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, LDd/c;->a:I

    iput-object p2, p0, LDd/c;->b:Ljava/lang/Object;

    iput-object p3, p0, LDd/c;->c:Ljava/lang/Object;

    iput-object p4, p0, LDd/c;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/util/ArrayList;[B)V
    .locals 0

    const/16 p1, 0xc

    iput p1, p0, LDd/c;->a:I

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p2, p0, LDd/c;->b:Ljava/lang/Object;

    if-nez p3, :cond_0

    .line 68
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 69
    :cond_0
    invoke-static {p3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LDd/c;->c:Ljava/lang/Object;

    .line 70
    iput-object p4, p0, LDd/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 2
    iput p1, p0, LDd/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LD9/g;Lcom/bumptech/glide/g;)V
    .locals 0

    const/4 p2, 0x3

    iput p2, p0, LDd/c;->a:I

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDd/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LE4/o;LU4/d;LE4/s;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LDd/c;->a:I

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDd/c;->d:Ljava/lang/Object;

    .line 86
    iput-object p2, p0, LDd/c;->c:Ljava/lang/Object;

    .line 87
    iput-object p3, p0, LDd/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 2

    const/16 v0, 0x19

    iput v0, p0, LDd/c;->a:I

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Lj/E;

    const/4 v1, 0x0

    .line 54
    invoke-direct {v0, v1}, Lj/E;-><init>(I)V

    .line 55
    iput-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 56
    iput-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    .line 57
    iput-object p2, p0, LDd/c;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/media/AudioTrack;LJ9/o;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, LDd/c;->a:I

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    iput-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    .line 97
    iput-object p2, p0, LDd/c;->c:Ljava/lang/Object;

    .line 98
    new-instance p2, LW1/q;

    invoke-direct {p2, p0}, LW1/q;-><init>(LDd/c;)V

    iput-object p2, p0, LDd/c;->d:Ljava/lang/Object;

    .line 99
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 100
    iget-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    check-cast v0, LW1/q;

    invoke-static {p1, v0, p2}, LA7/O0;->r(Landroid/media/AudioTrack;LW1/q;Landroid/os/Handler;)V

    return-void
.end method

.method public constructor <init>(Landroid/media/MediaCodec;)V
    .locals 2

    const/16 v0, 0xd

    iput v0, p0, LDd/c;->a:I

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    .line 73
    sget v0, Lu6/v;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    .line 74
    invoke-virtual {p1}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, LDd/c;->c:Ljava/lang/Object;

    .line 75
    invoke-virtual {p1}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, LDd/c;->d:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/net/ConnectivityManager;Lk4/j;)V
    .locals 2

    const/16 v0, 0x18

    iput v0, p0, LDd/c;->a:I

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    .line 60
    iput-object p2, p0, LDd/c;->c:Ljava/lang/Object;

    .line 61
    new-instance p2, LQ3/h;

    const/4 v0, 0x2

    invoke-direct {p2, p0, v0}, LQ3/h;-><init>(Ljava/lang/Object;I)V

    iput-object p2, p0, LDd/c;->d:Ljava/lang/Object;

    .line 62
    new-instance v0, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v0}, Landroid/net/NetworkRequest$Builder;-><init>()V

    const/16 v1, 0xc

    .line 63
    invoke-virtual {v0, v1}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    move-result-object v0

    .line 64
    invoke-virtual {v0}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v0

    .line 65
    invoke-virtual {p1, v0, p2}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/messaging/FirebaseMessagingService;LW9/p;Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, LDd/c;->a:I

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p3, p0, LDd/c;->b:Ljava/lang/Object;

    .line 30
    iput-object p1, p0, LDd/c;->c:Ljava/lang/Object;

    .line 31
    iput-object p2, p0, LDd/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/moloco/sdk/internal/services/E;Lcom/moloco/sdk/internal/error/b;Lwd/c;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, LDd/c;->a:I

    const-string v0, "connectivityService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReportingService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "httpClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, LDd/c;->c:Ljava/lang/Object;

    .line 6
    iput-object p3, p0, LDd/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, LDd/c;->a:I

    iput-object p2, p0, LDd/c;->b:Ljava/lang/Object;

    iput-object p3, p0, LDd/c;->c:Ljava/lang/Object;

    iput-object p1, p0, LDd/c;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ltf/a;Ltf/l;)V
    .locals 6

    const/4 v0, 0x0

    iput v0, p0, LDd/c;->a:I

    const-string v0, "createConfiguration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p2, p0, LDd/c;->b:Ljava/lang/Object;

    .line 36
    iput-object p3, p0, LDd/c;->c:Ljava/lang/Object;

    .line 37
    sget-object p2, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    const-class p3, LDd/d;

    invoke-virtual {p2, p3}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    .line 38
    :try_start_0
    sget-object v1, Lkotlin/reflect/KTypeProjection;->Companion:Lkotlin/reflect/KTypeProjection$Companion;

    const-class v2, LDd/c;

    .line 39
    invoke-virtual {p2, v2}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 40
    const-string v3, "PluginConfigT"

    sget-object v4, Lkotlin/reflect/KVariance;->INVARIANT:Lkotlin/reflect/KVariance;

    const/4 v5, 0x0

    .line 41
    invoke-virtual {p2, v2, v3, v4, v5}, Lkotlin/jvm/internal/I;->typeParameter(Ljava/lang/Object;Ljava/lang/String;Lkotlin/reflect/KVariance;Z)Lkotlin/reflect/KTypeParameter;

    move-result-object v2

    .line 42
    const-class v3, Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    move-result-object v3

    .line 43
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {p2, v2, v3}, Lkotlin/jvm/internal/I;->setUpperBounds(Lkotlin/reflect/KTypeParameter;Ljava/util/List;)V

    .line 44
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {p2, v2, v3, v5}, Lkotlin/jvm/internal/I;->typeOf(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)Lkotlin/reflect/KType;

    move-result-object p2

    .line 45
    invoke-virtual {v1, p2}, Lkotlin/reflect/KTypeProjection$Companion;->invariant(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;

    move-result-object p2

    invoke-static {p3, p2}, Lkotlin/jvm/internal/H;->c(Ljava/lang/Class;Lkotlin/reflect/KTypeProjection;)Lkotlin/reflect/KType;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p2, 0x0

    .line 46
    :goto_0
    new-instance p3, LSd/a;

    invoke-direct {p3, v0, p2}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 47
    new-instance p2, LNd/a;

    invoke-direct {p2, p1, p3}, LNd/a;-><init>(Ljava/lang/String;LSd/a;)V

    .line 48
    iput-object p2, p0, LDd/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayDeque;Ljava/io/BufferedReader;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, LDd/c;->a:I

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    iput-object p1, p0, LDd/c;->c:Ljava/lang/Object;

    .line 94
    iput-object p2, p0, LDd/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lmd/b;[[Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0x1d

    iput v0, p0, LDd/c;->a:I

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    const-string v0, "addresses are not set"

    invoke-static {p1, v0}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    .line 90
    const-string p1, "attrs"

    invoke-static {p2, p1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LDd/c;->c:Ljava/lang/Object;

    .line 91
    const-string p1, "customOptions"

    invoke-static {p3, p1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, LDd/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lkc/r;)V
    .locals 5

    const/16 v0, 0x1b

    iput v0, p0, LDd/c;->a:I

    const/4 v0, 0x0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, LDd/c;->c:Ljava/lang/Object;

    .line 79
    iput-object p1, p0, LDd/c;->d:Ljava/lang/Object;

    .line 80
    new-instance v1, Lkc/w;

    .line 81
    invoke-virtual {p1}, Lkc/r;->getBinaryMessenger()Luc/f;

    move-result-object v2

    invoke-direct {v1, v2}, Lkc/w;-><init>(Luc/f;)V

    new-instance v2, LX2/j;

    new-instance v3, Ltc/a;

    .line 82
    invoke-virtual {p1}, Lkc/r;->getBinaryMessenger()Luc/f;

    move-result-object v4

    invoke-direct {v3, v4}, Ltc/a;-><init>(Luc/f;)V

    invoke-direct {v2, v3}, LX2/j;-><init>(Ltc/a;)V

    const/4 v3, 0x2

    new-array v3, v3, [Lkc/x;

    aput-object v1, v3, v0

    const/4 v0, 0x1

    aput-object v2, v3, v0

    iput-object v3, p0, LDd/c;->b:Ljava/lang/Object;

    .line 83
    new-instance v0, Lcom/google/android/gms/ads/nativead/l;

    invoke-virtual {p1}, Lkc/r;->getBinaryMessenger()Luc/f;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/nativead/l;-><init>(Luc/f;)V

    .line 84
    iput-object p0, v0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm9/C;)V
    .locals 1

    const/16 v0, 0x1c

    iput v0, p0, LDd/c;->a:I

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    .line 51
    new-instance p1, Lw9/e;

    invoke-direct {p1}, Lw9/e;-><init>()V

    iput-object p1, p0, LDd/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls2/o;LP2/j;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, LDd/c;->a:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, LDd/c;->c:Ljava/lang/Object;

    .line 18
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, LDd/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls2/p;)V
    .locals 1

    const/16 v0, 0x1a

    iput v0, p0, LDd/c;->a:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Luc/f;Landroid/content/Context;)V
    .locals 1

    const/16 v0, 0x17

    iput v0, p0, LDd/c;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 9
    iput-object p2, p0, LDd/c;->b:Ljava/lang/Object;

    .line 10
    iput-object p1, p0, LDd/c;->c:Ljava/lang/Object;

    return-void
.end method

.method public static L()Lmd/J;
    .locals 4

    .line 1
    new-instance v0, Lmd/J;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lmd/b;->b:Lmd/b;

    .line 7
    .line 8
    iput-object v1, v0, Lmd/J;->b:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    new-array v2, v1, [I

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    aput v1, v2, v3

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    aput v1, v2, v1

    .line 18
    .line 19
    const-class v1, Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, [[Ljava/lang/Object;

    .line 26
    .line 27
    iput-object v1, v0, Lmd/J;->c:Ljava/lang/Object;

    .line 28
    .line 29
    return-object v0
.end method

.method public static final p(LDd/c;Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LFd/c;

    .line 2
    .line 3
    invoke-direct {v0}, LFd/c;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p1}, LFd/e;->b(LFd/c;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, LAf/r;

    .line 10
    .line 11
    const/16 v1, 0x15

    .line 12
    .line 13
    invoke-direct {p1, p0, v1}, LAf/r;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, p1}, LCd/b0;->a(LFd/c;Ltf/l;)V

    .line 17
    .line 18
    .line 19
    sget-object p1, LJd/s;->b:LJd/s;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, LFd/c;->c(LJd/s;)V

    .line 22
    .line 23
    .line 24
    new-instance p1, LS3/s;

    .line 25
    .line 26
    iget-object p0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lwd/c;

    .line 29
    .line 30
    invoke-direct {p1, v0, p0}, LS3/s;-><init>(LFd/c;Lwd/c;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2}, LS3/s;->p(Llf/c;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public static final y(LDd/c;Landroid/net/Network;Z)V
    .locals 7

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getAllNetworks()[Landroid/net/Network;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    array-length v1, v0

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_3

    .line 13
    .line 14
    aget-object v4, v0, v3

    .line 15
    .line 16
    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    const/4 v6, 0x1

    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    move v4, p2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget-object v5, p0, LDd/c;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v5, Landroid/net/ConnectivityManager;

    .line 28
    .line 29
    invoke-virtual {v5, v4}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    const/16 v5, 0xc

    .line 36
    .line 37
    invoke-virtual {v4, v5}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    move v4, v6

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move v4, v2

    .line 46
    :goto_1
    if-eqz v4, :cond_2

    .line 47
    .line 48
    move v2, v6

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    :goto_2
    iget-object p0, p0, LDd/c;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Lk4/j;

    .line 56
    .line 57
    iget-object p1, p0, Lk4/j;->b:Ljava/lang/ref/WeakReference;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, LX3/k;

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    iput-boolean v2, p0, Lk4/j;->d:Z

    .line 68
    .line 69
    sget-object p1, Lef/C;->a:Lef/C;

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    const/4 p1, 0x0

    .line 73
    :goto_3
    if-nez p1, :cond_5

    .line 74
    .line 75
    invoke-virtual {p0}, Lk4/j;->a()V

    .line 76
    .line 77
    .line 78
    :cond_5
    return-void
.end method


# virtual methods
.method public A()V
    .locals 4

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LB9/d;

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, LDd/c;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    iget-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LD9/g;

    .line 21
    .line 22
    iget-object v0, v0, LD9/g;->b:Ljava/util/HashMap;

    .line 23
    .line 24
    monitor-enter v0

    .line 25
    :try_start_0
    iget-object v1, p0, LDd/c;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, LD9/g;

    .line 28
    .line 29
    iget-object v1, v1, LD9/g;->b:Ljava/util/HashMap;

    .line 30
    .line 31
    iget-object v2, p0, LDd/c;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object v1, p0, LDd/c;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, LD9/g;

    .line 44
    .line 45
    iget-object v1, v1, LD9/g;->b:Ljava/util/HashMap;

    .line 46
    .line 47
    iget-object v2, p0, LDd/c;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Ljava/util/Set;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception v1

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    new-instance v1, Ljava/util/HashSet;

    .line 61
    .line 62
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, LDd/c;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, LD9/g;

    .line 68
    .line 69
    iget-object v2, v2, LD9/g;->b:Ljava/util/HashMap;

    .line 70
    .line 71
    iget-object v3, p0, LDd/c;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v3, Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    :goto_0
    iget-object v2, p0, LDd/c;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, LB9/d;

    .line 81
    .line 82
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_2

    .line 87
    .line 88
    iget-object v2, p0, LDd/c;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, LB9/d;

    .line 91
    .line 92
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    :cond_2
    monitor-exit v0

    .line 96
    return-void

    .line 97
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    throw v1

    .line 99
    :cond_3
    :goto_2
    return-void
.end method

.method public B()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, LDd/c;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Leb/c;

    .line 29
    .line 30
    invoke-virtual {v2}, Leb/c;->H()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public declared-synchronized C()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LDd/c;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lp9/n;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lm9/C;

    .line 16
    .line 17
    iget-object v1, p0, LDd/c;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lw9/e;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lm9/C;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lp9/n;

    .line 26
    .line 27
    iput-object v0, p0, LDd/c;->c:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    :goto_1
    monitor-exit p0

    .line 33
    return-void

    .line 34
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw v0
.end method

.method public D(Landroid/content/Intent;Ljava/util/concurrent/CountDownLatch;)V
    .locals 8

    .line 1
    iget-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Llc/b;

    .line 4
    .line 5
    const-string v1, "FLTFireBGExecutor"

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string p1, "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered."

    .line 10
    .line 11
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    if-eqz p2, :cond_1

    .line 16
    .line 17
    new-instance v0, LYc/c;

    .line 18
    .line 19
    invoke-direct {v0, p2}, LYc/c;-><init>(Ljava/util/concurrent/CountDownLatch;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    const-string p2, "notification"

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    :try_start_0
    array-length v1, p1

    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-virtual {p2, p1, v2, v1}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 42
    .line 43
    .line 44
    sget-object p1, LW9/t;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 45
    .line 46
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, LW9/t;

    .line 51
    .line 52
    invoke-static {p1}, Lp7/b;->N(LW9/t;)Ljava/util/HashMap;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object v1, p0, LDd/c;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Luc/r;

    .line 59
    .line 60
    const-string v2, "MessagingBackground#onMessage"

    .line 61
    .line 62
    new-instance v3, LNc/d;

    .line 63
    .line 64
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 65
    .line 66
    .line 67
    sget-object v4, Lka/e0;->h:Landroid/content/Context;

    .line 68
    .line 69
    const-string v5, "io.flutter.firebase.messaging.callback"

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    invoke-virtual {v4, v5, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    const-string v5, "user_callback_handle"

    .line 77
    .line 78
    const-wide/16 v6, 0x0

    .line 79
    .line 80
    invoke-interface {v4, v5, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 81
    .line 82
    .line 83
    move-result-wide v4

    .line 84
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    const-string v5, "userCallbackHandle"

    .line 89
    .line 90
    invoke-virtual {v3, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    const-string v4, "message"

    .line 94
    .line 95
    invoke-virtual {v3, v4, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v2, v3, v0}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :catchall_0
    move-exception p1

    .line 106
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 107
    .line 108
    .line 109
    throw p1

    .line 110
    :cond_2
    const-string p1, "RemoteMessage byte array not found in Intent."

    .line 111
    .line 112
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public E()Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sget-wide v2, LN/b;->a:J

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    iget-object v2, p0, LDd/c;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, LV/i;

    .line 27
    .line 28
    invoke-virtual {v2, v0, v1}, LV/i;->a(J)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-ltz v0, :cond_1

    .line 33
    .line 34
    iget-object v1, v2, LV/i;->c:[Ljava/lang/Object;

    .line 35
    .line 36
    aget-object v0, v1, v0

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    return-object v0
.end method

.method public F()J
    .locals 2

    .line 1
    iget-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls2/j;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, v0, Ls2/j;->d:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    return-wide v0
.end method

.method public G()Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lmd/O;->c:Lmd/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    iget-object v3, p0, LDd/c;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v3, [[Ljava/lang/Object;

    .line 8
    .line 9
    array-length v4, v3

    .line 10
    if-ge v2, v4, :cond_1

    .line 11
    .line 12
    aget-object v4, v3, v2

    .line 13
    .line 14
    aget-object v4, v4, v1

    .line 15
    .line 16
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    aget-object v0, v3, v2

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    aget-object v0, v0, v1

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    return-object v0
.end method

.method public H(Landroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    iget-object v0, p0, LDd/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, [Lkc/x;

    .line 16
    .line 17
    array-length v2, v0

    .line 18
    if-lez v2, :cond_1

    .line 19
    .line 20
    new-instance v2, LN7/e;

    .line 21
    .line 22
    invoke-direct {v2, p0, p1}, LN7/e;-><init>(LDd/c;Landroid/view/KeyEvent;)V

    .line 23
    .line 24
    .line 25
    array-length v3, v0

    .line 26
    :goto_0
    if-ge v1, v3, :cond_2

    .line 27
    .line 28
    aget-object v4, v0, v1

    .line 29
    .line 30
    new-instance v5, LE4/F;

    .line 31
    .line 32
    invoke-direct {v5, v2}, LE4/F;-><init>(LN7/e;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v4, p1, v5}, Lkc/x;->t(Landroid/view/KeyEvent;LE4/F;)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p0, p1}, LDd/c;->N(Landroid/view/KeyEvent;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    const/4 p1, 0x1

    .line 45
    return p1
.end method

.method public I()Z
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x0

    .line 5
    iget-object v0, v1, LDd/c;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LW9/p;

    .line 8
    .line 9
    const-string v4, "gcm.n.noui"

    .line 10
    .line 11
    invoke-virtual {v0, v4}, LW9/p;->a(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    :goto_0
    const/16 v17, 0x1

    .line 18
    .line 19
    goto/16 :goto_22

    .line 20
    .line 21
    :cond_0
    iget-object v0, v1, LDd/c;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessagingService;

    .line 24
    .line 25
    const-string v5, "keyguard"

    .line 26
    .line 27
    invoke-virtual {v0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    check-cast v5, Landroid/app/KeyguardManager;

    .line 32
    .line 33
    invoke-virtual {v5}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "activity"

    .line 45
    .line 46
    invoke-virtual {v0, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/app/ActivityManager;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_3

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    check-cast v6, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 73
    .line 74
    iget v7, v6, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    .line 75
    .line 76
    if-ne v7, v5, :cond_2

    .line 77
    .line 78
    iget v0, v6, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 79
    .line 80
    const/16 v5, 0x64

    .line 81
    .line 82
    if-ne v0, v5, :cond_3

    .line 83
    .line 84
    return v3

    .line 85
    :cond_3
    :goto_1
    iget-object v0, v1, LDd/c;->d:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, LW9/p;

    .line 88
    .line 89
    const-string v5, "gcm.n.image"

    .line 90
    .line 91
    invoke-virtual {v0, v5}, LW9/p;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    const-string v7, "FirebaseMessaging"

    .line 100
    .line 101
    if-eqz v5, :cond_4

    .line 102
    .line 103
    :goto_2
    const/4 v5, 0x0

    .line 104
    goto :goto_3

    .line 105
    :cond_4
    :try_start_0
    new-instance v5, LW9/n;

    .line 106
    .line 107
    new-instance v8, Ljava/net/URL;

    .line 108
    .line 109
    invoke-direct {v8, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-direct {v5, v8}, LW9/n;-><init>(Ljava/net/URL;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :catch_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v8, "Not downloading image, bad URL: "

    .line 119
    .line 120
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :goto_3
    if-eqz v5, :cond_5

    .line 135
    .line 136
    iget-object v0, v1, LDd/c;->b:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 139
    .line 140
    new-instance v8, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 141
    .line 142
    invoke-direct {v8}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 143
    .line 144
    .line 145
    new-instance v9, LT3/r;

    .line 146
    .line 147
    const/16 v10, 0x11

    .line 148
    .line 149
    invoke-direct {v9, v10, v5, v8}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    invoke-interface {v0, v9}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iput-object v0, v5, LW9/n;->b:Ljava/util/concurrent/Future;

    .line 157
    .line 158
    invoke-virtual {v8}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iput-object v0, v5, LW9/n;->c:Lcom/google/android/gms/tasks/Task;

    .line 163
    .line 164
    :cond_5
    iget-object v0, v1, LDd/c;->c:Ljava/lang/Object;

    .line 165
    .line 166
    move-object v8, v0

    .line 167
    check-cast v8, Lcom/google/firebase/messaging/FirebaseMessagingService;

    .line 168
    .line 169
    iget-object v0, v1, LDd/c;->d:Ljava/lang/Object;

    .line 170
    .line 171
    move-object v9, v0

    .line 172
    check-cast v9, LW9/p;

    .line 173
    .line 174
    sget-object v0, LW9/e;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 175
    .line 176
    const-string v10, "Couldn\'t get own application info: "

    .line 177
    .line 178
    invoke-virtual {v8}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    const/16 v12, 0x80

    .line 187
    .line 188
    :try_start_1
    invoke-virtual {v0, v11, v12}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    if-eqz v0, :cond_6

    .line 193
    .line 194
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 195
    .line 196
    if-eqz v0, :cond_6

    .line 197
    .line 198
    :goto_4
    move-object v11, v0

    .line 199
    goto :goto_5

    .line 200
    :catch_1
    move-exception v0

    .line 201
    new-instance v11, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    invoke-direct {v11, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    .line 215
    .line 216
    :cond_6
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :goto_5
    const-string v0, "gcm.n.android_channel_id"

    .line 220
    .line 221
    invoke-virtual {v9, v0}, LW9/p;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 226
    .line 227
    const/16 v13, 0x1a

    .line 228
    .line 229
    if-ge v12, v13, :cond_7

    .line 230
    .line 231
    :catch_2
    :goto_6
    const/4 v0, 0x0

    .line 232
    goto/16 :goto_9

    .line 233
    .line 234
    :cond_7
    :try_start_2
    invoke-virtual {v8}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 235
    .line 236
    .line 237
    move-result-object v12

    .line 238
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v14

    .line 242
    invoke-virtual {v12, v14, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 243
    .line 244
    .line 245
    move-result-object v12

    .line 246
    iget v12, v12, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 247
    .line 248
    if-ge v12, v13, :cond_8

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_8
    const-class v12, Landroid/app/NotificationManager;

    .line 252
    .line 253
    invoke-virtual {v8, v12}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    check-cast v12, Landroid/app/NotificationManager;

    .line 258
    .line 259
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 260
    .line 261
    .line 262
    move-result v13

    .line 263
    if-nez v13, :cond_a

    .line 264
    .line 265
    invoke-static {v12, v0}, Lcom/dexterous/flutterlocalnotifications/a;->d(Landroid/app/NotificationManager;Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 266
    .line 267
    .line 268
    move-result-object v13

    .line 269
    if-eqz v13, :cond_9

    .line 270
    .line 271
    goto :goto_9

    .line 272
    :cond_9
    new-instance v13, Ljava/lang/StringBuilder;

    .line 273
    .line 274
    const-string v14, "Notification Channel requested ("

    .line 275
    .line 276
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    const-string v0, ") has not been created by the app. Manifest configuration, or default, value will be used."

    .line 283
    .line 284
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 292
    .line 293
    .line 294
    :cond_a
    const-string v0, "com.google.firebase.messaging.default_notification_channel_id"

    .line 295
    .line 296
    invoke-virtual {v11, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 301
    .line 302
    .line 303
    move-result v13

    .line 304
    if-nez v13, :cond_c

    .line 305
    .line 306
    invoke-static {v12, v0}, Lcom/dexterous/flutterlocalnotifications/a;->d(Landroid/app/NotificationManager;Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 307
    .line 308
    .line 309
    move-result-object v13

    .line 310
    if-eqz v13, :cond_b

    .line 311
    .line 312
    goto :goto_9

    .line 313
    :cond_b
    const-string v0, "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."

    .line 314
    .line 315
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 316
    .line 317
    .line 318
    goto :goto_7

    .line 319
    :cond_c
    const-string v0, "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."

    .line 320
    .line 321
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 322
    .line 323
    .line 324
    :goto_7
    invoke-static {v12}, LU1/b;->a(Landroid/app/NotificationManager;)Landroid/app/NotificationChannel;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    if-nez v0, :cond_e

    .line 329
    .line 330
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v13

    .line 338
    const-string v14, "fcm_fallback_notification_channel_label"

    .line 339
    .line 340
    const-string v15, "string"

    .line 341
    .line 342
    invoke-virtual {v0, v14, v15, v13}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-nez v0, :cond_d

    .line 347
    .line 348
    const-string v0, "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name."

    .line 349
    .line 350
    invoke-static {v7, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 351
    .line 352
    .line 353
    const-string v0, "Misc"

    .line 354
    .line 355
    goto :goto_8

    .line 356
    :cond_d
    invoke-virtual {v8, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    :goto_8
    invoke-static {v0}, LU1/b;->b(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-static {v12, v0}, Lcom/dexterous/flutterlocalnotifications/a;->q(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 365
    .line 366
    .line 367
    :cond_e
    const-string v0, "fcm_fallback_notification_channel"

    .line 368
    .line 369
    :goto_9
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v12

    .line 373
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 374
    .line 375
    .line 376
    move-result-object v13

    .line 377
    invoke-virtual {v8}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 378
    .line 379
    .line 380
    move-result-object v14

    .line 381
    new-instance v15, LX0/q;

    .line 382
    .line 383
    invoke-direct {v15, v8, v0}, LX0/q;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    const-string v0, "gcm.n.title"

    .line 387
    .line 388
    invoke-virtual {v9, v13, v12, v0}, LW9/p;->h(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 393
    .line 394
    .line 395
    move-result v16

    .line 396
    if-nez v16, :cond_f

    .line 397
    .line 398
    invoke-static {v0}, LX0/q;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    iput-object v0, v15, LX0/q;->e:Ljava/lang/CharSequence;

    .line 403
    .line 404
    :cond_f
    const-string v0, "gcm.n.body"

    .line 405
    .line 406
    invoke-virtual {v9, v13, v12, v0}, LW9/p;->h(Landroid/content/res/Resources;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 411
    .line 412
    .line 413
    move-result v16

    .line 414
    if-nez v16, :cond_10

    .line 415
    .line 416
    invoke-static {v0}, LX0/q;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    iput-object v6, v15, LX0/q;->f:Ljava/lang/CharSequence;

    .line 421
    .line 422
    new-instance v6, LX0/o;

    .line 423
    .line 424
    invoke-direct {v6, v3}, LX0/o;-><init>(I)V

    .line 425
    .line 426
    .line 427
    invoke-static {v0}, LX0/q;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    iput-object v0, v6, LX0/o;->f:Ljava/lang/Object;

    .line 432
    .line 433
    invoke-virtual {v15, v6}, LX0/q;->f(LX0/E;)V

    .line 434
    .line 435
    .line 436
    :cond_10
    const-string v0, "gcm.n.icon"

    .line 437
    .line 438
    invoke-virtual {v9, v0}, LW9/p;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 443
    .line 444
    .line 445
    move-result v6

    .line 446
    if-nez v6, :cond_13

    .line 447
    .line 448
    const-string v6, "drawable"

    .line 449
    .line 450
    invoke-virtual {v13, v0, v6, v12}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 451
    .line 452
    .line 453
    move-result v6

    .line 454
    if-eqz v6, :cond_11

    .line 455
    .line 456
    invoke-static {v13, v6}, LW9/e;->a(Landroid/content/res/Resources;I)Z

    .line 457
    .line 458
    .line 459
    move-result v17

    .line 460
    if-eqz v17, :cond_11

    .line 461
    .line 462
    :goto_a
    const/16 v17, 0x1

    .line 463
    .line 464
    goto :goto_e

    .line 465
    :cond_11
    const-string v6, "mipmap"

    .line 466
    .line 467
    invoke-virtual {v13, v0, v6, v12}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 468
    .line 469
    .line 470
    move-result v6

    .line 471
    if-eqz v6, :cond_12

    .line 472
    .line 473
    invoke-static {v13, v6}, LW9/e;->a(Landroid/content/res/Resources;I)Z

    .line 474
    .line 475
    .line 476
    move-result v17

    .line 477
    if-eqz v17, :cond_12

    .line 478
    .line 479
    goto :goto_a

    .line 480
    :cond_12
    new-instance v6, Ljava/lang/StringBuilder;

    .line 481
    .line 482
    const/16 v17, 0x1

    .line 483
    .line 484
    const-string v4, "Icon resource "

    .line 485
    .line 486
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    const-string v0, " not found. Notification will use default icon."

    .line 493
    .line 494
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 502
    .line 503
    .line 504
    goto :goto_b

    .line 505
    :cond_13
    const/16 v17, 0x1

    .line 506
    .line 507
    :goto_b
    const-string v0, "com.google.firebase.messaging.default_notification_icon"

    .line 508
    .line 509
    invoke-virtual {v11, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 510
    .line 511
    .line 512
    move-result v4

    .line 513
    if-eqz v4, :cond_14

    .line 514
    .line 515
    invoke-static {v13, v4}, LW9/e;->a(Landroid/content/res/Resources;I)Z

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    if-nez v0, :cond_15

    .line 520
    .line 521
    :cond_14
    :try_start_3
    invoke-virtual {v14, v12, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    iget v4, v0, Landroid/content/pm/ApplicationInfo;->icon:I
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_3

    .line 526
    .line 527
    goto :goto_c

    .line 528
    :catch_3
    move-exception v0

    .line 529
    new-instance v6, Ljava/lang/StringBuilder;

    .line 530
    .line 531
    invoke-direct {v6, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 542
    .line 543
    .line 544
    :cond_15
    :goto_c
    if-eqz v4, :cond_17

    .line 545
    .line 546
    invoke-static {v13, v4}, LW9/e;->a(Landroid/content/res/Resources;I)Z

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    if-nez v0, :cond_16

    .line 551
    .line 552
    goto :goto_d

    .line 553
    :cond_16
    move v6, v4

    .line 554
    goto :goto_e

    .line 555
    :cond_17
    :goto_d
    const v0, 0x1080093

    .line 556
    .line 557
    .line 558
    move v6, v0

    .line 559
    :goto_e
    iget-object v0, v15, LX0/q;->G:Landroid/app/Notification;

    .line 560
    .line 561
    iput v6, v0, Landroid/app/Notification;->icon:I

    .line 562
    .line 563
    const-string v0, "gcm.n.sound2"

    .line 564
    .line 565
    invoke-virtual {v9, v0}, LW9/p;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 570
    .line 571
    .line 572
    move-result v4

    .line 573
    if-eqz v4, :cond_18

    .line 574
    .line 575
    const-string v0, "gcm.n.sound"

    .line 576
    .line 577
    invoke-virtual {v9, v0}, LW9/p;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    :cond_18
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 582
    .line 583
    .line 584
    move-result v4

    .line 585
    if-eqz v4, :cond_19

    .line 586
    .line 587
    const/4 v0, 0x0

    .line 588
    goto :goto_f

    .line 589
    :cond_19
    const-string v4, "default"

    .line 590
    .line 591
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    move-result v4

    .line 595
    if-nez v4, :cond_1a

    .line 596
    .line 597
    const-string v4, "raw"

    .line 598
    .line 599
    invoke-virtual {v13, v0, v4, v12}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 600
    .line 601
    .line 602
    move-result v4

    .line 603
    if-eqz v4, :cond_1a

    .line 604
    .line 605
    new-instance v4, Ljava/lang/StringBuilder;

    .line 606
    .line 607
    const-string v6, "android.resource://"

    .line 608
    .line 609
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 613
    .line 614
    .line 615
    const-string v6, "/raw/"

    .line 616
    .line 617
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    goto :goto_f

    .line 632
    :cond_1a
    invoke-static {v2}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    :goto_f
    if-eqz v0, :cond_1b

    .line 637
    .line 638
    invoke-virtual {v15, v0}, LX0/q;->e(Landroid/net/Uri;)V

    .line 639
    .line 640
    .line 641
    :cond_1b
    const-string v0, "gcm.n.click_action"

    .line 642
    .line 643
    invoke-virtual {v9, v0}, LW9/p;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 648
    .line 649
    .line 650
    move-result v4

    .line 651
    if-nez v4, :cond_1c

    .line 652
    .line 653
    new-instance v4, Landroid/content/Intent;

    .line 654
    .line 655
    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v4, v12}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 659
    .line 660
    .line 661
    const/high16 v0, 0x10000000

    .line 662
    .line 663
    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 664
    .line 665
    .line 666
    goto :goto_11

    .line 667
    :cond_1c
    const-string v0, "gcm.n.link_android"

    .line 668
    .line 669
    invoke-virtual {v9, v0}, LW9/p;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 674
    .line 675
    .line 676
    move-result v4

    .line 677
    if-eqz v4, :cond_1d

    .line 678
    .line 679
    const-string v0, "gcm.n.link"

    .line 680
    .line 681
    invoke-virtual {v9, v0}, LW9/p;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    :cond_1d
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 686
    .line 687
    .line 688
    move-result v4

    .line 689
    if-nez v4, :cond_1e

    .line 690
    .line 691
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    goto :goto_10

    .line 696
    :cond_1e
    const/4 v0, 0x0

    .line 697
    :goto_10
    if-eqz v0, :cond_1f

    .line 698
    .line 699
    new-instance v4, Landroid/content/Intent;

    .line 700
    .line 701
    const-string v6, "android.intent.action.VIEW"

    .line 702
    .line 703
    invoke-direct {v4, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v4, v12}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v4, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 710
    .line 711
    .line 712
    goto :goto_11

    .line 713
    :cond_1f
    invoke-virtual {v14, v12}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 714
    .line 715
    .line 716
    move-result-object v4

    .line 717
    if-nez v4, :cond_20

    .line 718
    .line 719
    const-string v0, "No activity found to launch app"

    .line 720
    .line 721
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 722
    .line 723
    .line 724
    :cond_20
    :goto_11
    sget-object v0, LW9/e;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 725
    .line 726
    const/high16 v6, 0x44000000    # 512.0f

    .line 727
    .line 728
    const-string v10, "google.c.a.e"

    .line 729
    .line 730
    if-nez v4, :cond_21

    .line 731
    .line 732
    const/4 v2, 0x0

    .line 733
    goto :goto_13

    .line 734
    :cond_21
    const/high16 v12, 0x4000000

    .line 735
    .line 736
    invoke-virtual {v4, v12}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 737
    .line 738
    .line 739
    new-instance v12, Landroid/os/Bundle;

    .line 740
    .line 741
    iget-object v13, v9, LW9/p;->a:Landroid/os/Bundle;

    .line 742
    .line 743
    invoke-direct {v12, v13}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 744
    .line 745
    .line 746
    invoke-virtual {v13}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 747
    .line 748
    .line 749
    move-result-object v13

    .line 750
    invoke-interface {v13}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 751
    .line 752
    .line 753
    move-result-object v13

    .line 754
    :goto_12
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 755
    .line 756
    .line 757
    move-result v14

    .line 758
    if-eqz v14, :cond_24

    .line 759
    .line 760
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v14

    .line 764
    check-cast v14, Ljava/lang/String;

    .line 765
    .line 766
    const-string v2, "google.c."

    .line 767
    .line 768
    invoke-virtual {v14, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 769
    .line 770
    .line 771
    move-result v2

    .line 772
    if-nez v2, :cond_22

    .line 773
    .line 774
    const-string v2, "gcm.n."

    .line 775
    .line 776
    invoke-virtual {v14, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 777
    .line 778
    .line 779
    move-result v2

    .line 780
    if-nez v2, :cond_22

    .line 781
    .line 782
    const-string v2, "gcm.notification."

    .line 783
    .line 784
    invoke-virtual {v14, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 785
    .line 786
    .line 787
    move-result v2

    .line 788
    if-eqz v2, :cond_23

    .line 789
    .line 790
    :cond_22
    invoke-virtual {v12, v14}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 791
    .line 792
    .line 793
    :cond_23
    const/4 v2, 0x2

    .line 794
    goto :goto_12

    .line 795
    :cond_24
    invoke-virtual {v4, v12}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 796
    .line 797
    .line 798
    invoke-virtual {v9, v10}, LW9/p;->a(Ljava/lang/String;)Z

    .line 799
    .line 800
    .line 801
    move-result v2

    .line 802
    if-eqz v2, :cond_25

    .line 803
    .line 804
    invoke-virtual {v9}, LW9/p;->m()Landroid/os/Bundle;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    const-string v12, "gcm.n.analytics_data"

    .line 809
    .line 810
    invoke-virtual {v4, v12, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 811
    .line 812
    .line 813
    :cond_25
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 814
    .line 815
    .line 816
    move-result v2

    .line 817
    invoke-static {v8, v2, v4, v6}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 818
    .line 819
    .line 820
    move-result-object v2

    .line 821
    :goto_13
    iput-object v2, v15, LX0/q;->g:Landroid/app/PendingIntent;

    .line 822
    .line 823
    invoke-virtual {v9, v10}, LW9/p;->a(Ljava/lang/String;)Z

    .line 824
    .line 825
    .line 826
    move-result v2

    .line 827
    if-nez v2, :cond_26

    .line 828
    .line 829
    const/4 v0, 0x0

    .line 830
    goto :goto_14

    .line 831
    :cond_26
    new-instance v2, Landroid/content/Intent;

    .line 832
    .line 833
    const-string v4, "com.google.firebase.messaging.NOTIFICATION_DISMISS"

    .line 834
    .line 835
    invoke-direct {v2, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v9}, LW9/p;->m()Landroid/os/Bundle;

    .line 839
    .line 840
    .line 841
    move-result-object v4

    .line 842
    invoke-virtual {v2, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 843
    .line 844
    .line 845
    move-result-object v2

    .line 846
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 847
    .line 848
    .line 849
    move-result v0

    .line 850
    new-instance v4, Landroid/content/Intent;

    .line 851
    .line 852
    const-string v10, "com.google.android.c2dm.intent.RECEIVE"

    .line 853
    .line 854
    invoke-direct {v4, v10}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 855
    .line 856
    .line 857
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v10

    .line 861
    invoke-virtual {v4, v10}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 862
    .line 863
    .line 864
    move-result-object v4

    .line 865
    const-string v10, "wrapped_intent"

    .line 866
    .line 867
    invoke-virtual {v4, v10, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 868
    .line 869
    .line 870
    move-result-object v2

    .line 871
    invoke-static {v8, v0, v2, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    :goto_14
    if-eqz v0, :cond_27

    .line 876
    .line 877
    iget-object v2, v15, LX0/q;->G:Landroid/app/Notification;

    .line 878
    .line 879
    iput-object v0, v2, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 880
    .line 881
    :cond_27
    const-string v0, "gcm.n.color"

    .line 882
    .line 883
    invoke-virtual {v9, v0}, LW9/p;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 888
    .line 889
    .line 890
    move-result v2

    .line 891
    if-nez v2, :cond_28

    .line 892
    .line 893
    :try_start_4
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 894
    .line 895
    .line 896
    move-result v2

    .line 897
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 898
    .line 899
    .line 900
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_4

    .line 901
    goto :goto_15

    .line 902
    :catch_4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 903
    .line 904
    const-string v4, "Color is invalid: "

    .line 905
    .line 906
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 907
    .line 908
    .line 909
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 910
    .line 911
    .line 912
    const-string v0, ". Notification will use default color."

    .line 913
    .line 914
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 915
    .line 916
    .line 917
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 922
    .line 923
    .line 924
    :cond_28
    const-string v0, "com.google.firebase.messaging.default_notification_color"

    .line 925
    .line 926
    invoke-virtual {v11, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 927
    .line 928
    .line 929
    move-result v0

    .line 930
    if-eqz v0, :cond_29

    .line 931
    .line 932
    :try_start_5
    invoke-static {v8, v0}, LY0/e;->getColor(Landroid/content/Context;I)I

    .line 933
    .line 934
    .line 935
    move-result v0

    .line 936
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 937
    .line 938
    .line 939
    move-result-object v0
    :try_end_5
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_5 .. :try_end_5} :catch_5

    .line 940
    goto :goto_15

    .line 941
    :catch_5
    const-string v0, "Cannot find the color resource referenced in AndroidManifest."

    .line 942
    .line 943
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 944
    .line 945
    .line 946
    :cond_29
    const/4 v0, 0x0

    .line 947
    :goto_15
    if-eqz v0, :cond_2a

    .line 948
    .line 949
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 950
    .line 951
    .line 952
    move-result v0

    .line 953
    iput v0, v15, LX0/q;->z:I

    .line 954
    .line 955
    :cond_2a
    const-string v0, "gcm.n.sticky"

    .line 956
    .line 957
    invoke-virtual {v9, v0}, LW9/p;->a(Ljava/lang/String;)Z

    .line 958
    .line 959
    .line 960
    move-result v0

    .line 961
    xor-int/lit8 v0, v0, 0x1

    .line 962
    .line 963
    const/16 v2, 0x10

    .line 964
    .line 965
    invoke-virtual {v15, v2, v0}, LX0/q;->c(IZ)V

    .line 966
    .line 967
    .line 968
    const-string v0, "gcm.n.local_only"

    .line 969
    .line 970
    invoke-virtual {v9, v0}, LW9/p;->a(Ljava/lang/String;)Z

    .line 971
    .line 972
    .line 973
    move-result v0

    .line 974
    iput-boolean v0, v15, LX0/q;->u:Z

    .line 975
    .line 976
    const-string v0, "gcm.n.ticker"

    .line 977
    .line 978
    invoke-virtual {v9, v0}, LW9/p;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    if-eqz v0, :cond_2b

    .line 983
    .line 984
    iget-object v2, v15, LX0/q;->G:Landroid/app/Notification;

    .line 985
    .line 986
    invoke-static {v0}, LX0/q;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    iput-object v0, v2, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 991
    .line 992
    :cond_2b
    const-string v0, "gcm.n.notification_priority"

    .line 993
    .line 994
    invoke-virtual {v9, v0}, LW9/p;->b(Ljava/lang/String;)Ljava/lang/Integer;

    .line 995
    .line 996
    .line 997
    move-result-object v0

    .line 998
    const/4 v2, -0x2

    .line 999
    if-nez v0, :cond_2c

    .line 1000
    .line 1001
    :goto_16
    const/4 v0, 0x0

    .line 1002
    goto :goto_17

    .line 1003
    :cond_2c
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1004
    .line 1005
    .line 1006
    move-result v4

    .line 1007
    if-lt v4, v2, :cond_2d

    .line 1008
    .line 1009
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1010
    .line 1011
    .line 1012
    move-result v4

    .line 1013
    const/4 v6, 0x2

    .line 1014
    if-le v4, v6, :cond_2e

    .line 1015
    .line 1016
    :cond_2d
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1017
    .line 1018
    const-string v6, "notificationPriority is invalid "

    .line 1019
    .line 1020
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1024
    .line 1025
    .line 1026
    const-string v0, ". Skipping setting notificationPriority."

    .line 1027
    .line 1028
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v0

    .line 1035
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1036
    .line 1037
    .line 1038
    goto :goto_16

    .line 1039
    :cond_2e
    :goto_17
    if-eqz v0, :cond_2f

    .line 1040
    .line 1041
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1042
    .line 1043
    .line 1044
    move-result v0

    .line 1045
    iput v0, v15, LX0/q;->k:I

    .line 1046
    .line 1047
    :cond_2f
    const-string v0, "gcm.n.visibility"

    .line 1048
    .line 1049
    invoke-virtual {v9, v0}, LW9/p;->b(Ljava/lang/String;)Ljava/lang/Integer;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v0

    .line 1053
    if-nez v0, :cond_30

    .line 1054
    .line 1055
    :goto_18
    const/4 v0, 0x0

    .line 1056
    goto :goto_19

    .line 1057
    :cond_30
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1058
    .line 1059
    .line 1060
    move-result v4

    .line 1061
    const/4 v6, -0x1

    .line 1062
    if-lt v4, v6, :cond_31

    .line 1063
    .line 1064
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1065
    .line 1066
    .line 1067
    move-result v4

    .line 1068
    move/from16 v6, v17

    .line 1069
    .line 1070
    if-le v4, v6, :cond_32

    .line 1071
    .line 1072
    :cond_31
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1073
    .line 1074
    const-string v6, "visibility is invalid: "

    .line 1075
    .line 1076
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1080
    .line 1081
    .line 1082
    const-string v0, ". Skipping setting visibility."

    .line 1083
    .line 1084
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v0

    .line 1091
    const-string v4, "NotificationParams"

    .line 1092
    .line 1093
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1094
    .line 1095
    .line 1096
    goto :goto_18

    .line 1097
    :cond_32
    :goto_19
    if-eqz v0, :cond_33

    .line 1098
    .line 1099
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1100
    .line 1101
    .line 1102
    move-result v0

    .line 1103
    iput v0, v15, LX0/q;->A:I

    .line 1104
    .line 1105
    :cond_33
    const-string v0, "gcm.n.notification_count"

    .line 1106
    .line 1107
    invoke-virtual {v9, v0}, LW9/p;->b(Ljava/lang/String;)Ljava/lang/Integer;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v0

    .line 1111
    if-nez v0, :cond_34

    .line 1112
    .line 1113
    :goto_1a
    const/4 v0, 0x0

    .line 1114
    goto :goto_1b

    .line 1115
    :cond_34
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1116
    .line 1117
    .line 1118
    move-result v4

    .line 1119
    if-gez v4, :cond_35

    .line 1120
    .line 1121
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1122
    .line 1123
    const-string v6, "notificationCount is invalid: "

    .line 1124
    .line 1125
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1129
    .line 1130
    .line 1131
    const-string v0, ". Skipping setting notificationCount."

    .line 1132
    .line 1133
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1141
    .line 1142
    .line 1143
    goto :goto_1a

    .line 1144
    :cond_35
    :goto_1b
    if-eqz v0, :cond_36

    .line 1145
    .line 1146
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1147
    .line 1148
    .line 1149
    move-result v0

    .line 1150
    iput v0, v15, LX0/q;->j:I

    .line 1151
    .line 1152
    :cond_36
    invoke-virtual {v9}, LW9/p;->g()Ljava/lang/Long;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v0

    .line 1156
    if-eqz v0, :cond_37

    .line 1157
    .line 1158
    const/4 v6, 0x1

    .line 1159
    iput-boolean v6, v15, LX0/q;->l:Z

    .line 1160
    .line 1161
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1162
    .line 1163
    .line 1164
    move-result-wide v10

    .line 1165
    iget-object v0, v15, LX0/q;->G:Landroid/app/Notification;

    .line 1166
    .line 1167
    iput-wide v10, v0, Landroid/app/Notification;->when:J

    .line 1168
    .line 1169
    :cond_37
    invoke-virtual {v9}, LW9/p;->k()[J

    .line 1170
    .line 1171
    .line 1172
    move-result-object v0

    .line 1173
    if-eqz v0, :cond_38

    .line 1174
    .line 1175
    iget-object v4, v15, LX0/q;->G:Landroid/app/Notification;

    .line 1176
    .line 1177
    iput-object v0, v4, Landroid/app/Notification;->vibrate:[J

    .line 1178
    .line 1179
    :cond_38
    invoke-virtual {v9}, LW9/p;->d()[I

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    if-eqz v0, :cond_3a

    .line 1184
    .line 1185
    aget v4, v0, v3

    .line 1186
    .line 1187
    const/16 v17, 0x1

    .line 1188
    .line 1189
    aget v6, v0, v17

    .line 1190
    .line 1191
    const/16 v18, 0x2

    .line 1192
    .line 1193
    aget v0, v0, v18

    .line 1194
    .line 1195
    iget-object v8, v15, LX0/q;->G:Landroid/app/Notification;

    .line 1196
    .line 1197
    iput v4, v8, Landroid/app/Notification;->ledARGB:I

    .line 1198
    .line 1199
    iput v6, v8, Landroid/app/Notification;->ledOnMS:I

    .line 1200
    .line 1201
    iput v0, v8, Landroid/app/Notification;->ledOffMS:I

    .line 1202
    .line 1203
    if-eqz v6, :cond_39

    .line 1204
    .line 1205
    if-eqz v0, :cond_39

    .line 1206
    .line 1207
    const/4 v0, 0x1

    .line 1208
    goto :goto_1c

    .line 1209
    :cond_39
    move v0, v3

    .line 1210
    :goto_1c
    iget v4, v8, Landroid/app/Notification;->flags:I

    .line 1211
    .line 1212
    and-int/2addr v2, v4

    .line 1213
    or-int/2addr v0, v2

    .line 1214
    iput v0, v8, Landroid/app/Notification;->flags:I

    .line 1215
    .line 1216
    :cond_3a
    const-string v0, "gcm.n.default_sound"

    .line 1217
    .line 1218
    invoke-virtual {v9, v0}, LW9/p;->a(Ljava/lang/String;)Z

    .line 1219
    .line 1220
    .line 1221
    move-result v0

    .line 1222
    const-string v2, "gcm.n.default_vibrate_timings"

    .line 1223
    .line 1224
    invoke-virtual {v9, v2}, LW9/p;->a(Ljava/lang/String;)Z

    .line 1225
    .line 1226
    .line 1227
    move-result v2

    .line 1228
    if-eqz v2, :cond_3b

    .line 1229
    .line 1230
    const/16 v18, 0x2

    .line 1231
    .line 1232
    or-int/lit8 v0, v0, 0x2

    .line 1233
    .line 1234
    :cond_3b
    const-string v2, "gcm.n.default_light_settings"

    .line 1235
    .line 1236
    invoke-virtual {v9, v2}, LW9/p;->a(Ljava/lang/String;)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v2

    .line 1240
    if-eqz v2, :cond_3c

    .line 1241
    .line 1242
    or-int/lit8 v0, v0, 0x4

    .line 1243
    .line 1244
    :cond_3c
    iget-object v2, v15, LX0/q;->G:Landroid/app/Notification;

    .line 1245
    .line 1246
    iput v0, v2, Landroid/app/Notification;->defaults:I

    .line 1247
    .line 1248
    and-int/lit8 v0, v0, 0x4

    .line 1249
    .line 1250
    if-eqz v0, :cond_3d

    .line 1251
    .line 1252
    iget v0, v2, Landroid/app/Notification;->flags:I

    .line 1253
    .line 1254
    const/16 v17, 0x1

    .line 1255
    .line 1256
    or-int/lit8 v0, v0, 0x1

    .line 1257
    .line 1258
    iput v0, v2, Landroid/app/Notification;->flags:I

    .line 1259
    .line 1260
    :cond_3d
    const-string v0, "gcm.n.tag"

    .line 1261
    .line 1262
    invoke-virtual {v9, v0}, LW9/p;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v0

    .line 1266
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1267
    .line 1268
    .line 1269
    move-result v2

    .line 1270
    if-nez v2, :cond_3e

    .line 1271
    .line 1272
    :goto_1d
    move-object v2, v0

    .line 1273
    goto :goto_1e

    .line 1274
    :cond_3e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1275
    .line 1276
    const-string v2, "FCM-Notification:"

    .line 1277
    .line 1278
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1279
    .line 1280
    .line 1281
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1282
    .line 1283
    .line 1284
    move-result-wide v8

    .line 1285
    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1286
    .line 1287
    .line 1288
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v0

    .line 1292
    goto :goto_1d

    .line 1293
    :goto_1e
    if-nez v5, :cond_3f

    .line 1294
    .line 1295
    goto :goto_21

    .line 1296
    :cond_3f
    :try_start_6
    iget-object v0, v5, LW9/n;->c:Lcom/google/android/gms/tasks/Task;

    .line 1297
    .line 1298
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 1299
    .line 1300
    .line 1301
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1302
    .line 1303
    const-wide/16 v8, 0x5

    .line 1304
    .line 1305
    invoke-static {v0, v8, v9, v4}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v0

    .line 1309
    check-cast v0, Landroid/graphics/Bitmap;

    .line 1310
    .line 1311
    invoke-virtual {v15, v0}, LX0/q;->d(Landroid/graphics/Bitmap;)V

    .line 1312
    .line 1313
    .line 1314
    new-instance v4, LX0/n;

    .line 1315
    .line 1316
    invoke-direct {v4}, LX0/E;-><init>()V

    .line 1317
    .line 1318
    .line 1319
    if-nez v0, :cond_40

    .line 1320
    .line 1321
    const/4 v0, 0x0

    .line 1322
    goto :goto_1f

    .line 1323
    :cond_40
    invoke-static {v0}, Landroidx/core/graphics/drawable/IconCompat;->f(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v0

    .line 1327
    :goto_1f
    iput-object v0, v4, LX0/n;->e:Landroidx/core/graphics/drawable/IconCompat;

    .line 1328
    .line 1329
    const/4 v6, 0x0

    .line 1330
    invoke-virtual {v4, v6}, LX0/n;->k(Landroid/graphics/Bitmap;)V

    .line 1331
    .line 1332
    .line 1333
    invoke-virtual {v15, v4}, LX0/q;->f(LX0/E;)V
    :try_end_6
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_8
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_6 .. :try_end_6} :catch_7

    .line 1334
    .line 1335
    .line 1336
    goto :goto_21

    .line 1337
    :catch_6
    move-exception v0

    .line 1338
    goto :goto_20

    .line 1339
    :catch_7
    const-string v0, "Failed to download image in time, showing notification without it"

    .line 1340
    .line 1341
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1342
    .line 1343
    .line 1344
    invoke-virtual {v5}, LW9/n;->close()V

    .line 1345
    .line 1346
    .line 1347
    goto :goto_21

    .line 1348
    :catch_8
    const-string v0, "Interrupted while downloading image, showing notification without it"

    .line 1349
    .line 1350
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual {v5}, LW9/n;->close()V

    .line 1354
    .line 1355
    .line 1356
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v0

    .line 1360
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 1361
    .line 1362
    .line 1363
    goto :goto_21

    .line 1364
    :goto_20
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1365
    .line 1366
    const-string v5, "Failed to download image: "

    .line 1367
    .line 1368
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1369
    .line 1370
    .line 1371
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v0

    .line 1375
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v0

    .line 1382
    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1383
    .line 1384
    .line 1385
    :goto_21
    const/4 v0, 0x3

    .line 1386
    invoke-static {v7, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1387
    .line 1388
    .line 1389
    move-result v0

    .line 1390
    if-eqz v0, :cond_41

    .line 1391
    .line 1392
    const-string v0, "Showing notification"

    .line 1393
    .line 1394
    invoke-static {v7, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1395
    .line 1396
    .line 1397
    :cond_41
    iget-object v0, v1, LDd/c;->c:Ljava/lang/Object;

    .line 1398
    .line 1399
    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessagingService;

    .line 1400
    .line 1401
    const-string v4, "notification"

    .line 1402
    .line 1403
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v0

    .line 1407
    check-cast v0, Landroid/app/NotificationManager;

    .line 1408
    .line 1409
    invoke-virtual {v15}, LX0/q;->a()Landroid/app/Notification;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v4

    .line 1413
    invoke-virtual {v0, v2, v3, v4}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    .line 1414
    .line 1415
    .line 1416
    goto/16 :goto_0

    .line 1417
    .line 1418
    :goto_22
    return v17
.end method

.method public J()Z
    .locals 3

    .line 1
    iget-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, LDd/c;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 29
    .line 30
    return v1

    .line 31
    :cond_1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/io/BufferedReader;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    :goto_0
    return v1

    .line 56
    :cond_2
    const/4 v0, 0x0

    .line 57
    return v0
.end method

.method public K(LS1/h;Landroid/net/Uri;Ljava/util/Map;JJLk2/X;)V
    .locals 9

    .line 1
    const/4 v1, 0x0

    .line 2
    const/4 v2, 0x1

    .line 3
    new-instance v3, Ls2/j;

    .line 4
    .line 5
    move-object v4, p1

    .line 6
    move-wide v5, p4

    .line 7
    move-wide v7, p6

    .line 8
    invoke-direct/range {v3 .. v8}, Ls2/j;-><init>(LN1/g;JJ)V

    .line 9
    .line 10
    .line 11
    iput-object v3, p0, LDd/c;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p1, p0, LDd/c;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ls2/m;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Ls2/p;

    .line 23
    .line 24
    invoke-interface {p1, p2, p3}, Ls2/p;->a(Landroid/net/Uri;Ljava/util/Map;)[Ls2/m;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    array-length p3, p1

    .line 29
    sget-object v0, Ll8/K;->b:Ll8/I;

    .line 30
    .line 31
    const-string v0, "expectedSize"

    .line 32
    .line 33
    invoke-static {p3, v0}, Ll8/s;->d(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Ll8/H;

    .line 37
    .line 38
    invoke-direct {v0, p3}, Ll8/E;-><init>(I)V

    .line 39
    .line 40
    .line 41
    array-length p3, p1

    .line 42
    if-ne p3, v2, :cond_1

    .line 43
    .line 44
    aget-object p1, p1, v1

    .line 45
    .line 46
    iput-object p1, p0, LDd/c;->c:Ljava/lang/Object;

    .line 47
    .line 48
    goto/16 :goto_8

    .line 49
    .line 50
    :cond_1
    array-length p3, p1

    .line 51
    move v4, v1

    .line 52
    :goto_0
    if-ge v4, p3, :cond_9

    .line 53
    .line 54
    aget-object v5, p1, v4

    .line 55
    .line 56
    :try_start_0
    invoke-interface {v5, v3}, Ls2/m;->i(Ls2/n;)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_2

    .line 61
    .line 62
    iput-object v5, p0, LDd/c;->c:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    iput v1, v3, Ls2/j;->f:I

    .line 65
    .line 66
    goto :goto_7

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    move-object p1, v0

    .line 69
    goto :goto_3

    .line 70
    :cond_2
    :try_start_1
    invoke-interface {v5}, Ls2/m;->j()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v0, v5}, Ll8/E;->d(Ljava/lang/Iterable;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    .line 77
    iget-object v5, p0, LDd/c;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v5, Ls2/m;

    .line 80
    .line 81
    if-nez v5, :cond_4

    .line 82
    .line 83
    iget-wide v5, v3, Ls2/j;->d:J

    .line 84
    .line 85
    cmp-long v5, v5, p4

    .line 86
    .line 87
    if-nez v5, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    move v5, v1

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    :goto_1
    move v5, v2

    .line 93
    :goto_2
    invoke-static {v5}, LQ1/k;->g(Z)V

    .line 94
    .line 95
    .line 96
    iput v1, v3, Ls2/j;->f:I

    .line 97
    .line 98
    goto :goto_6

    .line 99
    :goto_3
    iget-object p2, p0, LDd/c;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p2, Ls2/m;

    .line 102
    .line 103
    if-nez p2, :cond_6

    .line 104
    .line 105
    iget-wide p2, v3, Ls2/j;->d:J

    .line 106
    .line 107
    cmp-long p2, p2, p4

    .line 108
    .line 109
    if-nez p2, :cond_5

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_5
    move v2, v1

    .line 113
    :cond_6
    :goto_4
    invoke-static {v2}, LQ1/k;->g(Z)V

    .line 114
    .line 115
    .line 116
    iput v1, v3, Ls2/j;->f:I

    .line 117
    .line 118
    throw p1

    .line 119
    :catch_0
    iget-object v5, p0, LDd/c;->c:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v5, Ls2/m;

    .line 122
    .line 123
    if-nez v5, :cond_8

    .line 124
    .line 125
    iget-wide v5, v3, Ls2/j;->d:J

    .line 126
    .line 127
    cmp-long v5, v5, p4

    .line 128
    .line 129
    if-nez v5, :cond_7

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_7
    move v5, v1

    .line 133
    goto :goto_2

    .line 134
    :cond_8
    :goto_5
    move v5, v2

    .line 135
    goto :goto_2

    .line 136
    :goto_6
    add-int/2addr v4, v2

    .line 137
    goto :goto_0

    .line 138
    :cond_9
    :goto_7
    iget-object p3, p0, LDd/c;->c:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast p3, Ls2/m;

    .line 141
    .line 142
    if-eqz p3, :cond_a

    .line 143
    .line 144
    :goto_8
    iget-object p1, p0, LDd/c;->c:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p1, Ls2/m;

    .line 147
    .line 148
    move-object/from16 p2, p8

    .line 149
    .line 150
    invoke-interface {p1, p2}, Ls2/m;->g(Ls2/o;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_a
    new-instance p3, Lj2/d;

    .line 155
    .line 156
    new-instance p4, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string p5, "None of the available extractors ("

    .line 159
    .line 160
    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance p5, LB8/e;

    .line 164
    .line 165
    const-string v3, ", "

    .line 166
    .line 167
    invoke-direct {p5, v3}, LB8/e;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-static {p1}, Ll8/K;->k([Ljava/lang/Object;)Ll8/e0;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    new-instance v3, Lk2/c;

    .line 175
    .line 176
    invoke-direct {v3, v1}, Lk2/c;-><init>(I)V

    .line 177
    .line 178
    .line 179
    invoke-static {p1, v3}, Ll8/s;->v(Ljava/util/List;Lk8/h;)Ljava/util/AbstractList;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {p5, p1}, LB8/e;->e(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string p1, ") could read the stream."

    .line 191
    .line 192
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Ll8/H;->g()Ll8/e0;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    const/4 p4, 0x0

    .line 207
    invoke-direct {p3, p1, p4, v1, v2}, LN1/D;-><init>(Ljava/lang/String;Ljava/lang/Exception;ZI)V

    .line 208
    .line 209
    .line 210
    invoke-static {p2}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 211
    .line 212
    .line 213
    throw p3
.end method

.method public M()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, LDd/c;->J()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, LDd/c;->d:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public N(Landroid/view/KeyEvent;)V
    .locals 8

    .line 1
    iget-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkc/r;

    .line 4
    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    iget-object v1, v0, Lkc/r;->k:Lio/flutter/plugin/editing/i;

    .line 8
    .line 9
    iget-object v2, v1, Lio/flutter/plugin/editing/i;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/view/inputmethod/InputMethodManager;->isAcceptingText()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_a

    .line 17
    .line 18
    iget-object v1, v1, Lio/flutter/plugin/editing/i;->j:Landroid/view/inputmethod/InputConnection;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    goto/16 :goto_1

    .line 23
    .line 24
    :cond_0
    instance-of v2, v1, Lio/flutter/plugin/editing/b;

    .line 25
    .line 26
    if-eqz v2, :cond_9

    .line 27
    .line 28
    check-cast v1, Lio/flutter/plugin/editing/b;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_a

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/16 v4, 0x15

    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    if-ne v2, v4, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {v1, v5, v2}, Lio/flutter/plugin/editing/b;->d(ZZ)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    goto/16 :goto_1

    .line 54
    .line 55
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    const/16 v4, 0x16

    .line 60
    .line 61
    if-ne v2, v4, :cond_2

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-virtual {v1, v3, v2}, Lio/flutter/plugin/editing/b;->d(ZZ)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    goto/16 :goto_1

    .line 72
    .line 73
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    const/16 v4, 0x13

    .line 78
    .line 79
    if-ne v2, v4, :cond_3

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-virtual {v1, v5, v2}, Lio/flutter/plugin/editing/b;->e(ZZ)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    goto/16 :goto_1

    .line 90
    .line 91
    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    const/16 v4, 0x14

    .line 96
    .line 97
    if-ne v2, v4, :cond_4

    .line 98
    .line 99
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    invoke-virtual {v1, v3, v2}, Lio/flutter/plugin/editing/b;->e(ZZ)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    goto :goto_1

    .line 108
    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    const/16 v4, 0x42

    .line 113
    .line 114
    if-eq v2, v4, :cond_5

    .line 115
    .line 116
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    const/16 v4, 0xa0

    .line 121
    .line 122
    if-ne v2, v4, :cond_6

    .line 123
    .line 124
    :cond_5
    iget-object v2, v1, Lio/flutter/plugin/editing/b;->e:Landroid/view/inputmethod/EditorInfo;

    .line 125
    .line 126
    iget v4, v2, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 127
    .line 128
    const/high16 v6, 0x20000

    .line 129
    .line 130
    and-int/2addr v4, v6

    .line 131
    if-nez v4, :cond_6

    .line 132
    .line 133
    iget v2, v2, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 134
    .line 135
    and-int/lit16 v2, v2, 0xff

    .line 136
    .line 137
    invoke-virtual {v1, v2}, Lio/flutter/plugin/editing/b;->performEditorAction(I)Z

    .line 138
    .line 139
    .line 140
    :goto_0
    move v3, v5

    .line 141
    goto :goto_1

    .line 142
    :cond_6
    iget-object v2, v1, Lio/flutter/plugin/editing/b;->d:Lio/flutter/plugin/editing/e;

    .line 143
    .line 144
    invoke-static {v2}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    invoke-static {v2}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-ltz v4, :cond_a

    .line 157
    .line 158
    if-ltz v6, :cond_a

    .line 159
    .line 160
    if-nez v7, :cond_7

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_7
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    invoke-virtual {v1}, Lio/flutter/plugin/editing/b;->beginBatchEdit()Z

    .line 172
    .line 173
    .line 174
    if-eq v3, v4, :cond_8

    .line 175
    .line 176
    invoke-virtual {v2, v3, v4}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 177
    .line 178
    .line 179
    :cond_8
    int-to-char v4, v7

    .line 180
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-virtual {v2, v3, v4}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 185
    .line 186
    .line 187
    add-int/2addr v3, v5

    .line 188
    invoke-virtual {v1, v3, v3}, Lio/flutter/plugin/editing/b;->setSelection(II)Z

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1}, Lio/flutter/plugin/editing/b;->endBatchEdit()Z

    .line 192
    .line 193
    .line 194
    goto :goto_0

    .line 195
    :cond_9
    invoke-interface {v1, p1}, Landroid/view/inputmethod/InputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    :cond_a
    :goto_1
    if-eqz v3, :cond_b

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_b
    iget-object v1, p0, LDd/c;->c:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v1, Ljava/util/HashSet;

    .line 205
    .line 206
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-eqz p1, :cond_c

    .line 221
    .line 222
    const-string p1, "KeyboardManager"

    .line 223
    .line 224
    const-string v0, "A redispatched key event was consumed before reaching KeyboardManager"

    .line 225
    .line 226
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 227
    .line 228
    .line 229
    :cond_c
    :goto_2
    return-void
.end method

.method public O(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, LZ4/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LZ4/b;

    .line 7
    .line 8
    invoke-interface {v0}, LZ4/b;->c()LZ4/e;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    iput-boolean v1, v0, LZ4/e;->a:Z

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, LDd/c;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, LZ4/c;

    .line 18
    .line 19
    invoke-interface {v0, p1}, LZ4/c;->a(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lj1/c;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lj1/c;->c(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
.end method

.method public P(Landroid/media/MediaCodec;)V
    .locals 1

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/media/LoudnessCodecController;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {v0, p1}, Lcom/applovin/impl/sdk/y;->l(Landroid/media/LoudnessCodecController;Landroid/media/MediaCodec;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public Q(Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sget-wide v2, LN/b;->a:J

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    iput-object p1, p0, LDd/c;->d:Ljava/lang/Object;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v2, p0, LDd/c;->c:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-enter v2

    .line 21
    :try_start_0
    iget-object v3, p0, LDd/c;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, LV/i;

    .line 30
    .line 31
    invoke-virtual {v3, v0, v1}, LV/i;->a(J)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-gez v4, :cond_1

    .line 36
    .line 37
    iget-object v4, p0, LDd/c;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 40
    .line 41
    invoke-virtual {v3, v0, v1, p1}, LV/i;->b(JLjava/lang/Object;)LV/i;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v4, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    monitor-exit v2

    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :try_start_1
    iget-object v0, v3, LV/i;->c:[Ljava/lang/Object;

    .line 53
    .line 54
    aput-object p1, v0, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    monitor-exit v2

    .line 57
    return-void

    .line 58
    :goto_0
    monitor-exit v2

    .line 59
    throw p1
.end method

.method public R(JLa2/v;)V
    .locals 8

    .line 1
    iget-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Llc/b;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p1, "FLTFireBGExecutor"

    .line 8
    .line 9
    const-string p2, "Background isolate already started."

    .line 10
    .line 11
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-static {}, Lb7/k;->z()Lb7/k;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, Lb7/k;->b:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v3, v0

    .line 22
    check-cast v3, Loc/d;

    .line 23
    .line 24
    new-instance v4, Landroid/os/Handler;

    .line 25
    .line 26
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-direct {v4, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, LYc/a;

    .line 34
    .line 35
    move-object v2, p0

    .line 36
    move-wide v6, p1

    .line 37
    move-object v5, p3

    .line 38
    invoke-direct/range {v1 .. v7}, LYc/a;-><init>(LDd/c;Loc/d;Landroid/os/Handler;La2/v;J)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public declared-synchronized S()Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, LDd/c;->C()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, LDd/c;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lp9/n;

    .line 8
    .line 9
    invoke-virtual {v0}, Lp9/n;->d()Lcom/google/android/gms/tasks/Task;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, LDd/c;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lw9/e;

    .line 16
    .line 17
    iget-object v1, v1, Lw9/e;->a:Lw9/c;

    .line 18
    .line 19
    iget-object v1, v1, Lw9/c;->a:Lw9/a;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->setCorePoolSize(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-object v0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    throw v0
.end method

.method public T(Lorg/json/JSONObject;)LK8/e;
    .locals 14

    .line 1
    const-string v0, "passkeyInfo"

    .line 2
    .line 3
    const-string v1, "userMultiFactorInfo"

    .line 4
    .line 5
    const-string v2, "userMetadata"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    const-string v4, "cachedTokenState"

    .line 9
    .line 10
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    const-string v5, "applicationName"

    .line 15
    .line 16
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    const-string v6, "anonymous"

    .line 21
    .line 22
    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    const-string v7, "2"

    .line 27
    .line 28
    const-string v8, "version"

    .line 29
    .line 30
    invoke-virtual {p1, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    if-eqz v8, :cond_0

    .line 35
    .line 36
    move-object v7, v8

    .line 37
    :cond_0
    const-string v8, "userInfos"

    .line 38
    .line 39
    invoke-virtual {p1, v8}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    .line 44
    .line 45
    .line 46
    move-result v9

    .line 47
    if-nez v9, :cond_1

    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_1
    new-instance v10, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v10, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    const/4 v11, 0x0

    .line 57
    move v12, v11

    .line 58
    :goto_0
    if-ge v12, v9, :cond_2

    .line 59
    .line 60
    invoke-virtual {v8, v12}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v13

    .line 64
    invoke-static {v13}, LK8/U;->V(Ljava/lang/String;)LK8/U;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    add-int/lit8 v12, v12, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catch_0
    move-exception p1

    .line 75
    goto/16 :goto_4

    .line 76
    .line 77
    :catch_1
    move-exception p1

    .line 78
    goto/16 :goto_4

    .line 79
    .line 80
    :catch_2
    move-exception p1

    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :catch_3
    move-exception p1

    .line 84
    goto/16 :goto_4

    .line 85
    .line 86
    :cond_2
    invoke-static {v5}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    new-instance v8, LK8/e;

    .line 91
    .line 92
    invoke-direct {v8, v5, v10}, LK8/e;-><init>(Ls8/g;Ljava/util/ArrayList;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-nez v5, :cond_3

    .line 100
    .line 101
    invoke-static {v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-static {v4}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iput-object v4, v8, LK8/e;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 109
    .line 110
    :cond_3
    if-nez v6, :cond_4

    .line 111
    .line 112
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 113
    .line 114
    iput-object v4, v8, LK8/e;->h:Ljava/lang/Boolean;

    .line 115
    .line 116
    :cond_4
    iput-object v7, v8, LK8/e;->g:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_5

    .line 123
    .line 124
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-static {v2}, LK8/g;->c(Lorg/json/JSONObject;)LK8/g;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    if-eqz v2, :cond_5

    .line 133
    .line 134
    iput-object v2, v8, LK8/e;->i:LK8/g;

    .line 135
    .line 136
    :cond_5
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-eqz v2, :cond_9

    .line 141
    .line 142
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    if-eqz v1, :cond_9

    .line 147
    .line 148
    new-instance v2, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    move v4, v11

    .line 154
    :goto_1
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    if-ge v4, v5, :cond_8

    .line 159
    .line 160
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    new-instance v6, Lorg/json/JSONObject;

    .line 165
    .line 166
    invoke-direct {v6, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const-string v5, "factorIdKey"

    .line 170
    .line 171
    invoke-virtual {v6, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    const-string v7, "phone"

    .line 176
    .line 177
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-eqz v7, :cond_6

    .line 182
    .line 183
    invoke-static {v6}, LJ8/z;->Y(Lorg/json/JSONObject;)LJ8/z;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    goto :goto_2

    .line 188
    :cond_6
    const-string v7, "totp"

    .line 189
    .line 190
    invoke-static {v5, v7}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    if-eqz v5, :cond_7

    .line 195
    .line 196
    invoke-static {v6}, LJ8/C;->Y(Lorg/json/JSONObject;)LJ8/C;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    goto :goto_2

    .line 201
    :cond_7
    move-object v5, v3

    .line 202
    :goto_2
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    add-int/lit8 v4, v4, 0x1

    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_8
    invoke-virtual {v8, v2}, LK8/e;->Z(Ljava/util/ArrayList;)V

    .line 209
    .line 210
    .line 211
    :cond_9
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-eqz v1, :cond_b

    .line 216
    .line 217
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    if-eqz p1, :cond_b

    .line 222
    .line 223
    new-instance v0, Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 226
    .line 227
    .line 228
    :goto_3
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-ge v11, v1, :cond_a

    .line 233
    .line 234
    invoke-virtual {p1, v11}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    new-instance v2, Lorg/json/JSONObject;

    .line 239
    .line 240
    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-static {v2}, LJ8/H;->V(Lorg/json/JSONObject;)LJ8/H;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    add-int/lit8 v11, v11, 0x1

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_a
    iput-object v0, v8, LK8/e;->m:Ljava/util/List;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/internal/firebase-auth-api/zzzh; {:try_start_0 .. :try_end_0} :catch_0

    .line 254
    .line 255
    :cond_b
    return-object v8

    .line 256
    :goto_4
    iget-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v0, Lh7/a;

    .line 259
    .line 260
    iget-object v0, v0, Lh7/a;->a:Ljava/lang/String;

    .line 261
    .line 262
    invoke-static {v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 263
    .line 264
    .line 265
    :goto_5
    return-object v3
.end method

.method public a()V
    .locals 5

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    check-cast v0, Lcom/moloco/sdk/internal/publisher/B;

    .line 2
    new-instance v1, Lcom/moloco/sdk/internal/publisher/x;

    iget-object v2, p0, LDd/c;->d:Ljava/lang/Object;

    check-cast v2, Lcom/moloco/sdk/internal/ortb/model/u;

    iget-object v3, p0, LDd/c;->c:Ljava/lang/Object;

    check-cast v3, Lcom/moloco/sdk/internal/publisher/C;

    const/4 v4, 0x0

    invoke-direct {v1, v0, v3, v2, v4}, Lcom/moloco/sdk/internal/publisher/x;-><init>(Lcom/moloco/sdk/internal/publisher/B;Lcom/moloco/sdk/internal/publisher/C;Lcom/moloco/sdk/internal/ortb/model/u;Ljf/c;)V

    const/4 v2, 0x3

    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/B;->j:LKd/a;

    invoke-static {v0, v4, v1, v2}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    return-void
.end method

.method public a(LJe/b;)V
    .locals 1

    .line 3
    iget-object v0, p0, LDd/c;->c:Ljava/lang/Object;

    check-cast v0, LJe/c;

    invoke-virtual {v0, p1}, LJe/c;->c(LJe/b;)V

    return-void
.end method

.method public b(Ltf/l;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ltf/a;

    .line 4
    .line 5
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    new-instance p1, LDd/d;

    .line 13
    .line 14
    iget-object v1, p0, LDd/c;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ltf/l;

    .line 17
    .line 18
    iget-object v2, p0, LDd/c;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, LNd/a;

    .line 21
    .line 22
    invoke-direct {p1, v2, v0, v1}, LDd/d;-><init>(LNd/a;Ljava/lang/Object;Ltf/l;)V

    .line 23
    .line 24
    .line 25
    return-object p1
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(IIJI)V
    .locals 8

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Landroid/media/MediaCodec;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    move v2, p1

    .line 8
    move v4, p2

    .line 9
    move-wide v5, p3

    .line 10
    move v7, p5

    .line 11
    invoke-virtual/range {v1 .. v7}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V
    .locals 4

    .line 1
    const-string v0, "internalError"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/moloco/sdk/internal/publisher/B;

    .line 9
    .line 10
    new-instance v1, Lcom/moloco/sdk/internal/publisher/y;

    .line 11
    .line 12
    iget-object v2, p0, LDd/c;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lcom/moloco/sdk/internal/publisher/C;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v1, v0, v2, p1, v3}, Lcom/moloco/sdk/internal/publisher/y;-><init>(Lcom/moloco/sdk/internal/publisher/B;Lcom/moloco/sdk/internal/publisher/C;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;Ljf/c;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x3

    .line 21
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/B;->j:LKd/a;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, p1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public f()Landroid/media/MediaFormat;
    .locals 1

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public flush()V
    .locals 1

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/media/MediaCodec;->flush()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public g(Ljava/lang/Object;Lwd/c;)V
    .locals 3

    .line 1
    check-cast p1, LDd/d;

    .line 2
    .line 3
    const-string v0, "plugin"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "scope"

    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, LDd/b;

    .line 14
    .line 15
    iget-object v1, p1, LDd/d;->a:LNd/a;

    .line 16
    .line 17
    iget-object v2, p1, LDd/d;->b:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-direct {v0, v1, p2, v2}, LDd/b;-><init>(LNd/a;Lwd/c;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p1, LDd/d;->c:Ltf/l;

    .line 23
    .line 24
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget-object v1, v0, LDd/b;->d:Lcom/moloco/sdk/service_locator/h;

    .line 28
    .line 29
    iput-object v1, p1, LDd/d;->d:Ltf/a;

    .line 30
    .line 31
    iget-object p1, v0, LDd/b;->c:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, LDd/e;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v1, v0, LDd/e;->a:LDd/a;

    .line 53
    .line 54
    iget-object v0, v0, LDd/e;->b:Llf/j;

    .line 55
    .line 56
    invoke-interface {v1, p2, v0}, LDd/a;->a(Lwd/c;Llf/j;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    return-void
.end method

.method public getKey()LNd/a;
    .locals 1

    .line 1
    iget-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LNd/a;

    .line 4
    .line 5
    return-object v0
.end method

.method public h(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public i(I)Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    sget v0, Lu6/v;->a:I

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/media/MediaCodec;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object v0, p0, LDd/c;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, [Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    aget-object p1, v0, p1

    .line 21
    .line 22
    return-object p1
.end method

.method public j(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public k()Z
    .locals 7

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getAllNetworks()[Landroid/net/Network;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    array-length v2, v1

    .line 10
    const/4 v3, 0x0

    .line 11
    move v4, v3

    .line 12
    :goto_0
    if-ge v4, v2, :cond_1

    .line 13
    .line 14
    aget-object v5, v1, v4

    .line 15
    .line 16
    invoke-virtual {v0, v5}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    const/16 v6, 0xc

    .line 23
    .line 24
    invoke-virtual {v5, v6}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    return v0

    .line 32
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return v3
.end method

.method public l()V
    .locals 1

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls2/o;

    .line 4
    .line 5
    invoke-interface {v0}, Ls2/o;->l()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public m(II)Ls2/C;
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    iget-object v1, p0, LDd/c;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Ls2/o;

    .line 5
    .line 6
    if-eq p2, v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v1, p1, p2}, Ls2/o;->m(II)Ls2/C;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :cond_0
    iget-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Landroid/util/SparseArray;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, LP2/m;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_1
    new-instance v2, LP2/m;

    .line 27
    .line 28
    invoke-interface {v1, p1, p2}, Ls2/o;->m(II)Ls2/C;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iget-object v1, p0, LDd/c;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, LP2/j;

    .line 35
    .line 36
    invoke-direct {v2, p2, v1}, LP2/m;-><init>(Ls2/C;LP2/j;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object v2
.end method

.method public n(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public o()I
    .locals 3

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public onComplete()V
    .locals 1

    .line 6
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    check-cast v0, LHe/b;

    invoke-interface {v0}, LHe/b;->onComplete()V

    return-void
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    iget-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    check-cast p1, Lc7/b;

    iget-object v0, p0, LDd/c;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, LDd/c;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/ScheduledFuture;

    .line 1
    iget-object v2, p1, Lc7/b;->a:Lx/v;

    .line 2
    monitor-enter v2

    :try_start_0
    iget-object p1, p1, Lc7/b;->a:Lx/v;

    invoke-virtual {p1, v0}, Lx/v;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    .line 4
    invoke-interface {v1, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void

    :catchall_0
    move-exception p1

    .line 5
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LHe/b;

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, LDd/c;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LQe/f;

    .line 8
    .line 9
    iget-object p1, v1, LQe/f;->c:LLe/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    :try_start_1
    sget-object p1, LMe/b;->a:LMe/b;

    .line 12
    .line 13
    iget-object v1, p0, LDd/c;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, LJe/c;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, LJe/c;->c(LJe/b;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, LHe/b;->onComplete()V
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Ljava/lang/NullPointerException;

    .line 32
    .line 33
    const-string v1, "Actually not, but can\'t pass out an exception otherwise..."

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :catch_0
    move-exception p1

    .line 43
    throw p1

    .line 44
    :catchall_1
    move-exception v1

    .line 45
    invoke-static {v1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    new-instance v2, LKe/b;

    .line 49
    .line 50
    const/4 v3, 0x2

    .line 51
    new-array v3, v3, [Ljava/lang/Throwable;

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    aput-object v1, v3, v4

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    aput-object p1, v3, v1

    .line 58
    .line 59
    invoke-direct {v2, v3}, LKe/b;-><init>([Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0, v2}, LHe/b;->onError(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public onMethodCall(Luc/o;Luc/q;)V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget v2, p0, LDd/c;->a:I

    .line 4
    .line 5
    packed-switch v2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v2, p1, Luc/o;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, LDd/c;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Ljava/util/HashMap;

    .line 16
    .line 17
    const-string v4, "id"

    .line 18
    .line 19
    const/4 v5, -0x1

    .line 20
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    sparse-switch v6, :sswitch_data_0

    .line 25
    .line 26
    .line 27
    :goto_0
    move v1, v5

    .line 28
    goto :goto_1

    .line 29
    :sswitch_0
    const-string v1, "disposeAllPlayers"

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v1, 0x2

    .line 39
    goto :goto_1

    .line 40
    :sswitch_1
    const-string v6, "disposePlayer"

    .line 41
    .line 42
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :sswitch_2
    const-string v1, "init"

    .line 50
    .line 51
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 v1, 0x0

    .line 59
    :cond_2
    :goto_1
    packed-switch v1, :pswitch_data_1

    .line 60
    .line 61
    .line 62
    check-cast p2, Ltc/g;

    .line 63
    .line 64
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_2

    .line 68
    .line 69
    :pswitch_0
    invoke-virtual {p0}, LDd/c;->B()V

    .line 70
    .line 71
    .line 72
    new-instance p1, Ljava/util/HashMap;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 75
    .line 76
    .line 77
    check-cast p2, Ltc/g;

    .line 78
    .line 79
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_2

    .line 83
    .line 84
    :pswitch_1
    invoke-virtual {p1, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Leb/c;

    .line 95
    .line 96
    if-eqz v0, :cond_3

    .line 97
    .line 98
    invoke-virtual {v0}, Leb/c;->H()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    :cond_3
    new-instance p1, Ljava/util/HashMap;

    .line 105
    .line 106
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 107
    .line 108
    .line 109
    check-cast p2, Ltc/g;

    .line 110
    .line 111
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :pswitch_2
    invoke-virtual {p1, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    move-object v7, v1

    .line 120
    check-cast v7, Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_4

    .line 127
    .line 128
    const-string p1, "Platform player "

    .line 129
    .line 130
    const-string v1, " already exists"

    .line 131
    .line 132
    invoke-static {p1, v7, v1}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p2, Ltc/g;

    .line 137
    .line 138
    invoke-virtual {p2, p1, v0, v0}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    const-string v1, "androidAudioEffects"

    .line 143
    .line 144
    invoke-virtual {p1, v1}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    move-object v9, v1

    .line 149
    check-cast v9, Ljava/util/List;

    .line 150
    .line 151
    new-instance v4, Leb/c;

    .line 152
    .line 153
    const-string v1, "audioLoadConfiguration"

    .line 154
    .line 155
    invoke-virtual {p1, v1}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    move-object v8, v1

    .line 160
    check-cast v8, Ljava/util/Map;

    .line 161
    .line 162
    const-string v1, "androidAudioOffloadPreferences"

    .line 163
    .line 164
    invoke-virtual {p1, v1}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    move-object v10, v1

    .line 169
    check-cast v10, Ljava/util/Map;

    .line 170
    .line 171
    const-string v1, "androidOffloadSchedulingEnabled"

    .line 172
    .line 173
    invoke-virtual {p1, v1}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    move-object v11, v1

    .line 178
    check-cast v11, Ljava/lang/Boolean;

    .line 179
    .line 180
    const-string v1, "useLazyPreparation"

    .line 181
    .line 182
    invoke-virtual {p1, v1}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    check-cast p1, Ljava/lang/Boolean;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 189
    .line 190
    .line 191
    move-result v12

    .line 192
    iget-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    .line 193
    .line 194
    move-object v5, p1

    .line 195
    check-cast v5, Landroid/content/Context;

    .line 196
    .line 197
    iget-object p1, p0, LDd/c;->c:Ljava/lang/Object;

    .line 198
    .line 199
    move-object v6, p1

    .line 200
    check-cast v6, Luc/f;

    .line 201
    .line 202
    invoke-direct/range {v4 .. v12}, Leb/c;-><init>(Landroid/content/Context;Luc/f;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Z)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v3, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    check-cast p2, Ltc/g;

    .line 209
    .line 210
    invoke-virtual {p2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    :goto_2
    return-void

    .line 214
    :pswitch_3
    iget-object p1, p1, Luc/o;->a:Ljava/lang/String;

    .line 215
    .line 216
    const-string v2, "MessagingBackground#initialized"

    .line 217
    .line 218
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    if-eqz p1, :cond_6

    .line 223
    .line 224
    iget-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 227
    .line 228
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 229
    .line 230
    .line 231
    sget-object p1, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundService;->h:Ljava/util/List;

    .line 232
    .line 233
    const-string p1, "FLTFireMsgService"

    .line 234
    .line 235
    const-string v1, "FlutterFirebaseMessagingBackgroundService started!"

    .line 236
    .line 237
    invoke-static {p1, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    sget-object p1, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundService;->h:Ljava/util/List;

    .line 241
    .line 242
    monitor-enter p1

    .line 243
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-eqz v2, :cond_5

    .line 252
    .line 253
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    check-cast v2, Landroid/content/Intent;

    .line 258
    .line 259
    sget-object v3, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundService;->i:LDd/c;

    .line 260
    .line 261
    invoke-virtual {v3, v2, v0}, LDd/c;->D(Landroid/content/Intent;Ljava/util/concurrent/CountDownLatch;)V

    .line 262
    .line 263
    .line 264
    goto :goto_3

    .line 265
    :catchall_0
    move-exception v0

    .line 266
    move-object p2, v0

    .line 267
    goto :goto_4

    .line 268
    :cond_5
    sget-object v0, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundService;->h:Ljava/util/List;

    .line 269
    .line 270
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 271
    .line 272
    .line 273
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 274
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 275
    .line 276
    check-cast p2, Ltc/g;

    .line 277
    .line 278
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    goto :goto_5

    .line 282
    :goto_4
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 283
    throw p2

    .line 284
    :cond_6
    check-cast p2, Ltc/g;

    .line 285
    .line 286
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 287
    .line 288
    .line 289
    :goto_5
    return-void

    .line 290
    nop

    .line 291
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_3
    .end packed-switch

    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    :sswitch_data_0
    .sparse-switch
        0x316510 -> :sswitch_2
        0x773559e0 -> :sswitch_1
        0x7ff02050 -> :sswitch_0
    .end sparse-switch

    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public q(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 5

    .line 1
    :cond_0
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iget-object v2, p0, LDd/c;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Landroid/media/MediaCodec;

    .line 6
    .line 7
    invoke-virtual {v2, p1, v0, v1}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x3

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    sget v3, Lu6/v;->a:I

    .line 15
    .line 16
    const/16 v4, 0x15

    .line 17
    .line 18
    if-ge v3, v4, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iput-object v2, p0, LDd/c;->d:Ljava/lang/Object;

    .line 25
    .line 26
    :cond_1
    if-eq v0, v1, :cond_0

    .line 27
    .line 28
    return v0
.end method

.method public r(I)Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    sget v0, Lu6/v;->a:I

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/media/MediaCodec;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, [Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    aget-object p1, v0, p1

    .line 21
    .line 22
    return-object p1
.end method

.method public release()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LDd/c;->c:Ljava/lang/Object;

    .line 3
    .line 4
    iput-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/media/MediaCodec;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public s(Ls2/w;)V
    .locals 1

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls2/o;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ls2/o;->s(Ls2/w;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public shutdown()V
    .locals 2

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 4
    .line 5
    iget-object v1, p0, LDd/c;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LQ3/h;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public t(Ljava/lang/String;ILjava/io/IOException;[BLjava/util/Map;)V
    .locals 6

    .line 1
    iget-object p1, p0, LDd/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v5, p1

    .line 4
    check-cast v5, LA7/P1;

    .line 5
    .line 6
    iget-object p1, p0, LDd/c;->d:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, LA7/L1;

    .line 10
    .line 11
    iget-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v1, p1

    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    move v2, p2

    .line 17
    move-object v3, p3

    .line 18
    move-object v4, p4

    .line 19
    invoke-virtual/range {v0 .. v5}, LA7/L1;->s(Ljava/lang/String;ILjava/io/IOException;[BLA7/P1;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LJ8/p;

    .line 6
    .line 7
    iget-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LJ8/o;

    .line 10
    .line 11
    check-cast v0, LK8/e;

    .line 12
    .line 13
    iget-object v0, v0, LK8/e;->c:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object p1, p1, LJ8/p;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, LDd/c;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, LDd/c;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, LJ8/b;

    .line 44
    .line 45
    if-nez v2, :cond_0

    .line 46
    .line 47
    new-instance v2, LJ8/b;

    .line 48
    .line 49
    new-instance v3, LG6/m;

    .line 50
    .line 51
    const/4 v4, 0x1

    .line 52
    invoke-direct {v3, v4}, LG6/m;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v2, v3}, LJ8/b;-><init>(LG6/m;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    iget-object v3, v0, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    .line 59
    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    iput-object v3, v2, LJ8/b;->h:Ljava/lang/String;

    .line 63
    .line 64
    :cond_1
    iget-object v0, v0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 65
    .line 66
    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ljava/lang/String;Ljava/lang/String;LJ8/b;)Lcom/google/android/gms/tasks/Task;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, LDd/c;->a:I

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
    invoke-static {p0}, LBa/c;->S(Ljava/lang/Object;)LA7/b0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "addrs"

    .line 16
    .line 17
    iget-object v2, p0, LDd/c;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Ljava/util/List;

    .line 20
    .line 21
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, "attrs"

    .line 25
    .line 26
    iget-object v2, p0, LDd/c;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lmd/b;

    .line 29
    .line 30
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, LDd/c;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, [[Ljava/lang/Object;

    .line 36
    .line 37
    invoke-static {v1}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v2, "customOptions"

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, LA7/b0;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :pswitch_data_0
    .packed-switch 0x1d
        :pswitch_0
    .end packed-switch
.end method

.method public u(ILH5/c;J)V
    .locals 7

    .line 1
    iget-object v3, p2, LH5/c;->i:Landroid/media/MediaCodec$CryptoInfo;

    .line 2
    .line 3
    iget-object p2, p0, LDd/c;->b:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroid/media/MediaCodec;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v6, 0x0

    .line 10
    move v1, p1

    .line 11
    move-wide v4, p3

    .line 12
    invoke-virtual/range {v0 .. v6}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public v(Lq2/d;Landroid/os/Handler;)V
    .locals 2

    .line 1
    new-instance v0, LV5/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, p1, v1}, LV5/a;-><init>(Ljava/lang/Object;Landroid/os/Handler$Callback;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LDd/c;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Landroid/media/MediaCodec;

    .line 10
    .line 11
    invoke-virtual {p1, v0, p2}, Landroid/media/MediaCodec;->setOnFrameRenderedListener(Landroid/media/MediaCodec$OnFrameRenderedListener;Landroid/os/Handler;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public w(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/moloco/sdk/internal/publisher/B;

    .line 4
    .line 5
    new-instance v1, Lcom/moloco/sdk/internal/publisher/z;

    .line 6
    .line 7
    iget-object v2, p0, LDd/c;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lcom/moloco/sdk/internal/publisher/C;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v1, v0, v2, p1, v3}, Lcom/moloco/sdk/internal/publisher/z;-><init>(Lcom/moloco/sdk/internal/publisher/B;Lcom/moloco/sdk/internal/publisher/C;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;Ljf/c;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x3

    .line 16
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/B;->j:LKd/a;

    .line 17
    .line 18
    invoke-static {v0, v3, v1, p1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public x(IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public z()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LDd/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj1/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lj1/c;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LDd/c;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, LZ4/a;

    .line 14
    .line 15
    invoke-interface {v0}, LZ4/a;->c()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "FactoryPools"

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v3, "Created new "

    .line 31
    .line 32
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    :cond_0
    instance-of v1, v0, LZ4/b;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    move-object v1, v0

    .line 54
    check-cast v1, LZ4/b;

    .line 55
    .line 56
    invoke-interface {v1}, LZ4/b;->c()LZ4/e;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const/4 v2, 0x0

    .line 61
    iput-boolean v2, v1, LZ4/e;->a:Z

    .line 62
    .line 63
    :cond_1
    return-object v0
.end method
