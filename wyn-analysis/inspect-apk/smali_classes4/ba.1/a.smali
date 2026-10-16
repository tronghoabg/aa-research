.class public final Lba/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/n;
.implements Ls2/o;
.implements Luc/c;


# static fields
.field public static d:Lba/a;

.field public static e:LNc/d;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Lba/a;->a:I

    sparse-switch p1, :sswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    :sswitch_0
    sget-object p1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-class v0, Lpd/m;

    .line 39
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const-string v1, "level"

    invoke-static {p1, v1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lba/a;->c:Ljava/lang/Object;

    .line 42
    const-string p1, "logger"

    invoke-static {v0, p1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lba/a;->b:Ljava/lang/Object;

    return-void

    .line 43
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance p1, Landroid/util/LongSparseArray;

    invoke-direct {p1}, Landroid/util/LongSparseArray;-><init>()V

    iput-object p1, p0, Lba/a;->b:Ljava/lang/Object;

    .line 45
    new-instance p1, Ljava/util/PriorityQueue;

    invoke-direct {p1}, Ljava/util/PriorityQueue;-><init>()V

    iput-object p1, p0, Lba/a;->c:Ljava/lang/Object;

    return-void

    .line 46
    :sswitch_2
    sget-object p1, Ld7/e;->d:Ld7/e;

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lba/a;->b:Ljava/lang/Object;

    .line 48
    iput-object p1, p0, Lba/a;->c:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_2
        0xd -> :sswitch_1
        0x13 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lba/a;->a:I

    iput-object p2, p0, Lba/a;->c:Ljava/lang/Object;

    iput-object p3, p0, Lba/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LN6/w;Ljava/util/concurrent/ScheduledFuture;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Lba/a;->a:I

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Lba/a;->b:Ljava/lang/Object;

    .line 67
    const-string p1, "future"

    invoke-static {p2, p1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lba/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LX2/j;)V
    .locals 1

    const/16 v0, 0x17

    iput v0, p0, Lba/a;->a:I

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iget-object v0, p1, LX2/j;->b:Ljava/lang/Object;

    check-cast v0, Lsd/a;

    .line 26
    iput-object v0, p0, Lba/a;->b:Ljava/lang/Object;

    .line 27
    iget-object p1, p1, LX2/j;->c:Ljava/lang/Object;

    check-cast p1, LA/d0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    new-instance v0, Lqd/d;

    invoke-direct {v0, p1}, Lqd/d;-><init>(LA/d0;)V

    .line 29
    iput-object v0, p0, Lba/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LX3/k;Lk4/j;)V
    .locals 2

    const/16 p1, 0xa

    iput p1, p0, Lba/a;->a:I

    const/4 p1, 0x0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p2, p0, Lba/a;->b:Ljava/lang/Object;

    .line 12
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p2, v0, :cond_3

    sget-boolean v1, Lk4/a;->a:Z

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-eq p2, v0, :cond_2

    const/16 p1, 0x1b

    if-ne p2, p1, :cond_1

    goto :goto_0

    .line 13
    :cond_1
    new-instance p1, Lk4/g;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lk4/g;-><init>(Z)V

    goto :goto_2

    .line 14
    :cond_2
    :goto_0
    new-instance p1, Lk4/h;

    .line 15
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    goto :goto_2

    .line 16
    :cond_3
    sget-boolean p2, Lk4/a;->a:Z

    .line 17
    :goto_1
    new-instance p2, Lk4/g;

    invoke-direct {p2, p1}, Lk4/g;-><init>(Z)V

    move-object p1, p2

    .line 18
    :goto_2
    iput-object p1, p0, Lba/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lba/a;->a:I

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/a;->b:Ljava/lang/Object;

    .line 5
    new-instance p1, LAf/q;

    const/4 v0, 0x5

    invoke-direct {p1, p0, v0}, LAf/q;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    move-result-object p1

    iput-object p1, p0, Lba/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsAnimation$Bounds;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lba/a;->a:I

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    invoke-static {p1}, Lcom/applovin/impl/sdk/z;->y(Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lb1/c;->c(Landroid/graphics/Insets;)Lb1/c;

    move-result-object v0

    .line 70
    iput-object v0, p0, Lba/a;->b:Ljava/lang/Object;

    .line 71
    invoke-static {p1}, Lcom/applovin/impl/sdk/z;->f(Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, Lb1/c;->c(Landroid/graphics/Insets;)Lb1/c;

    move-result-object p1

    .line 72
    iput-object p1, p0, Lba/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/o;LS8/d;LS8/d;)V
    .locals 2

    const/4 v0, 0x7

    iput v0, p0, Lba/a;->a:I

    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lba/a;->b:Ljava/lang/Object;

    .line 8
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/k;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p2, p3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/k;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lba/a;->c:Ljava/lang/Object;

    .line 9
    invoke-virtual {p1, v0}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/u;)V

    return-void
.end method

.method public constructor <init>(Lg0/b;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lba/a;->a:I

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lba/a;->c:Ljava/lang/Object;

    .line 51
    new-instance p1, Lad/L;

    const/4 v0, 0x5

    invoke-direct {p1, p0, v0}, Lad/L;-><init>(Ljava/lang/Object;I)V

    .line 52
    iput-object p1, p0, Lba/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lba/a;->a:I

    iput-object p1, p0, Lba/a;->b:Ljava/lang/Object;

    iput-object p3, p0, Lba/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, Lba/a;->a:I

    iput-object p1, p0, Lba/a;->b:Ljava/lang/Object;

    iput-object p3, p0, Lba/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkc/r;La2/c;)V
    .locals 1

    const/16 v0, 0x1b

    iput v0, p0, Lba/a;->a:I

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lba/a;->b:Ljava/lang/Object;

    .line 21
    iput-object p2, p0, Lba/a;->c:Ljava/lang/Object;

    .line 22
    new-instance p1, Lwc/a;

    invoke-direct {p1, p0}, Lwc/a;-><init>(Lba/a;)V

    .line 23
    iput-object p1, p2, La2/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lkc/r;Landroid/view/inputmethod/InputMethodManager;La2/v;)V
    .locals 2

    const/16 v0, 0xb

    iput v0, p0, Lba/a;->a:I

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    .line 32
    invoke-static {p1}, Lea/T;->x(Lkc/r;)V

    .line 33
    :cond_0
    iput-object p1, p0, Lba/a;->c:Ljava/lang/Object;

    .line 34
    iput-object p2, p0, Lba/a;->b:Ljava/lang/Object;

    .line 35
    iput-object p0, p3, La2/v;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm9/B;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, Lba/a;->a:I

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p1, p0, Lba/a;->b:Ljava/lang/Object;

    .line 75
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lba/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lmc/b;)V
    .locals 5

    const/16 v0, 0x18

    iput v0, p0, Lba/a;->a:I

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Lcom/google/android/gms/ads/nativead/l;

    const/16 v1, 0x17

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/ads/nativead/l;-><init>(Ljava/lang/Object;I)V

    .line 61
    new-instance v1, Luc/r;

    sget-object v2, Luc/m;->a:Luc/m;

    const/4 v3, 0x0

    .line 62
    const-string v4, "flutter/platform"

    invoke-direct {v1, p1, v4, v2, v3}, Luc/r;-><init>(Luc/f;Ljava/lang/String;Luc/s;Lab/b;)V

    .line 63
    iput-object v1, p0, Lba/a;->b:Ljava/lang/Object;

    .line 64
    invoke-virtual {v1, v0}, Luc/r;->b(Luc/p;)V

    return-void
.end method

.method public constructor <init>(Lmc/b;Landroid/content/pm/PackageManager;)V
    .locals 4

    const/16 v0, 0x19

    iput v0, p0, Lba/a;->a:I

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    new-instance v0, La2/c;

    const/16 v1, 0x1d

    invoke-direct {v0, p0, v1}, La2/c;-><init>(Ljava/lang/Object;I)V

    .line 55
    iput-object p2, p0, Lba/a;->b:Ljava/lang/Object;

    .line 56
    new-instance p2, Luc/r;

    sget-object v1, Luc/x;->b:Luc/x;

    const/4 v2, 0x0

    .line 57
    const-string v3, "flutter/processtext"

    invoke-direct {p2, p1, v3, v1, v2}, Luc/r;-><init>(Luc/f;Ljava/lang/String;Luc/s;Lab/b;)V

    .line 58
    invoke-virtual {p2, v0}, Luc/r;->b(Luc/p;)V

    return-void
.end method

.method public constructor <init>(Lt0/i;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Lba/a;->a:I

    const-string v0, "rootCoordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lba/a;->b:Ljava/lang/Object;

    .line 38
    new-instance p1, La2/v;

    const/16 v0, 0x12

    invoke-direct {p1, v0}, La2/v;-><init>(I)V

    iput-object p1, p0, Lba/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public static K(Lcg/g;)Ljava/lang/String;
    .locals 5

    .line 1
    iget-wide v0, p0, Lcg/g;->b:J

    .line 2
    .line 3
    const-wide/16 v2, 0x40

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-gtz v4, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcg/g;->D()Lcg/j;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lcg/j;->e()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    long-to-int v0, v0

    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcg/g;->J(I)Lcg/j;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Lcg/j;->e()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p0, "..."

    .line 40
    .line 41
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public static d(Lba/a;Lorg/json/JSONArray;)I
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    move v0, p0

    .line 6
    move v1, v0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const/4 v4, 0x2

    .line 13
    const/4 v5, 0x4

    .line 14
    const/4 v6, 0x1

    .line 15
    if-ge v0, v3, :cond_b

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v5}, LA/f;->g(I)[I

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    array-length v7, v5

    .line 26
    move v8, p0

    .line 27
    :goto_1
    if-ge v8, v7, :cond_a

    .line 28
    .line 29
    aget v9, v5, v8

    .line 30
    .line 31
    const/4 v10, 0x1

    .line 32
    if-eq v9, v10, :cond_3

    .line 33
    .line 34
    const/4 v10, 0x2

    .line 35
    if-eq v9, v10, :cond_2

    .line 36
    .line 37
    const/4 v10, 0x3

    .line 38
    if-eq v9, v10, :cond_1

    .line 39
    .line 40
    const/4 v10, 0x4

    .line 41
    if-ne v9, v10, :cond_0

    .line 42
    .line 43
    const-string v10, "DeviceOrientation.landscapeRight"

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_0
    const/4 p0, 0x0

    .line 47
    throw p0

    .line 48
    :cond_1
    const-string v10, "DeviceOrientation.landscapeLeft"

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const-string v10, "DeviceOrientation.portraitDown"

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    const-string v10, "DeviceOrientation.portraitUp"

    .line 55
    .line 56
    :goto_2
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v10

    .line 60
    if-eqz v10, :cond_9

    .line 61
    .line 62
    invoke-static {v9}, LA/f;->f(I)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_7

    .line 67
    .line 68
    if-eq v3, v6, :cond_6

    .line 69
    .line 70
    if-eq v3, v4, :cond_5

    .line 71
    .line 72
    const/4 v4, 0x3

    .line 73
    if-eq v3, v4, :cond_4

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    or-int/lit8 v1, v1, 0x8

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_5
    or-int/lit8 v1, v1, 0x2

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_6
    or-int/lit8 v1, v1, 0x4

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_7
    or-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    :goto_3
    if-nez v2, :cond_8

    .line 88
    .line 89
    move v2, v1

    .line 90
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_9
    add-int/lit8 v8, v8, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_a
    new-instance p0, Ljava/lang/NoSuchFieldException;

    .line 97
    .line 98
    const-string p1, "No such DeviceOrientation: "

    .line 99
    .line 100
    invoke-static {p1, v3}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-direct {p0, p1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p0

    .line 108
    :cond_b
    if-eqz v1, :cond_f

    .line 109
    .line 110
    const/16 p1, 0x8

    .line 111
    .line 112
    packed-switch v1, :pswitch_data_0

    .line 113
    .line 114
    .line 115
    goto :goto_4

    .line 116
    :pswitch_0
    const/16 p0, 0xd

    .line 117
    .line 118
    return p0

    .line 119
    :pswitch_1
    return v4

    .line 120
    :pswitch_2
    const/16 p0, 0xb

    .line 121
    .line 122
    return p0

    .line 123
    :pswitch_3
    const/16 p0, 0xc

    .line 124
    .line 125
    return p0

    .line 126
    :pswitch_4
    if-eq v2, v4, :cond_e

    .line 127
    .line 128
    if-eq v2, v5, :cond_d

    .line 129
    .line 130
    if-eq v2, p1, :cond_c

    .line 131
    .line 132
    :goto_4
    return v6

    .line 133
    :cond_c
    :pswitch_5
    return p1

    .line 134
    :cond_d
    :pswitch_6
    const/16 p0, 0x9

    .line 135
    .line 136
    :cond_e
    :pswitch_7
    return p0

    .line 137
    :cond_f
    const/4 p0, -0x1

    .line 138
    return p0

    .line 139
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_7
        :pswitch_4
        :pswitch_6
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method public static f(Lba/a;Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_4

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {}, Ltc/c;->values()[Ltc/c;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    array-length v4, v3

    .line 26
    move v5, v0

    .line 27
    :goto_1
    if-ge v5, v4, :cond_3

    .line 28
    .line 29
    aget-object v6, v3, v5

    .line 30
    .line 31
    iget-object v7, v6, Ltc/c;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-eqz v7, :cond_2

    .line 38
    .line 39
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    if-eq v2, v3, :cond_0

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_0
    sget-object v2, Ltc/c;->c:Ltc/c;

    .line 50
    .line 51
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_1
    sget-object v2, Ltc/c;->b:Ltc/c;

    .line 56
    .line 57
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    new-instance p0, Ljava/lang/NoSuchFieldException;

    .line 67
    .line 68
    const-string p1, "No such SystemUiOverlay: "

    .line 69
    .line 70
    invoke-static {p1, v2}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {p0, p1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p0

    .line 78
    :cond_4
    return-object p0
.end method

.method public static g(Lba/a;Ljava/lang/String;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x4

    .line 5
    invoke-static {p0}, LA/f;->g(I)[I

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    array-length v1, v0

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_8

    .line 12
    .line 13
    aget v3, v0, v2

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    if-eq v3, v4, :cond_3

    .line 17
    .line 18
    const/4 v4, 0x2

    .line 19
    if-eq v3, v4, :cond_2

    .line 20
    .line 21
    const/4 v4, 0x3

    .line 22
    if-eq v3, v4, :cond_1

    .line 23
    .line 24
    const/4 v4, 0x4

    .line 25
    if-ne v3, v4, :cond_0

    .line 26
    .line 27
    const-string v4, "SystemUiMode.edgeToEdge"

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    throw p0

    .line 32
    :cond_1
    const-string v4, "SystemUiMode.immersiveSticky"

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    const-string v4, "SystemUiMode.immersive"

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    const-string v4, "SystemUiMode.leanBack"

    .line 39
    .line 40
    :goto_1
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_7

    .line 45
    .line 46
    invoke-static {v3}, LA/f;->f(I)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    const/4 v0, 0x1

    .line 51
    if-eqz p1, :cond_6

    .line 52
    .line 53
    const/4 v1, 0x2

    .line 54
    if-eq p1, v0, :cond_5

    .line 55
    .line 56
    if-eq p1, v1, :cond_4

    .line 57
    .line 58
    return p0

    .line 59
    :cond_4
    const/4 p0, 0x3

    .line 60
    return p0

    .line 61
    :cond_5
    return v1

    .line 62
    :cond_6
    return v0

    .line 63
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_8
    new-instance p0, Ljava/lang/NoSuchFieldException;

    .line 67
    .line 68
    const-string v0, "No such SystemUiMode: "

    .line 69
    .line 70
    invoke-static {v0, p1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {p0, p1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p0
.end method

.method public static h(Lba/a;Lorg/json/JSONObject;)LL8/a;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string p0, "statusBarColor"

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    move-object v3, p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v3, v1

    .line 24
    :goto_0
    const-string p0, "statusBarIconBrightness"

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v2, 0x0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Lpd/f;->d(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    move v4, p0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v4, v2

    .line 44
    :goto_1
    const-string p0, "systemStatusBarContrastEnforced"

    .line 45
    .line 46
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    move-object v5, p0

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-object v5, v1

    .line 63
    :goto_2
    const-string p0, "systemNavigationBarColor"

    .line 64
    .line 65
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    move-object v6, p0

    .line 80
    goto :goto_3

    .line 81
    :cond_3
    move-object v6, v1

    .line 82
    :goto_3
    const-string p0, "systemNavigationBarIconBrightness"

    .line 83
    .line 84
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_4

    .line 89
    .line 90
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, Lpd/f;->d(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    :cond_4
    move v7, v2

    .line 99
    const-string p0, "systemNavigationBarDividerColor"

    .line 100
    .line 101
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_5

    .line 106
    .line 107
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    move-object v8, p0

    .line 116
    goto :goto_4

    .line 117
    :cond_5
    move-object v8, v1

    .line 118
    :goto_4
    const-string p0, "systemNavigationBarContrastEnforced"

    .line 119
    .line 120
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_6

    .line 125
    .line 126
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    :cond_6
    move-object v9, v1

    .line 135
    new-instance v2, LL8/a;

    .line 136
    .line 137
    invoke-direct/range {v2 .. v9}, LL8/a;-><init>(Ljava/lang/Integer;ILjava/lang/Boolean;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Boolean;)V

    .line 138
    .line 139
    .line 140
    return-object v2
.end method

.method public static k(Ljava/lang/Class;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isInterface(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "Interfaces can\'t be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: "

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "Abstract classes can\'t be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: "

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p0, "\nSee "

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p0, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 48
    .line 49
    const-string v1, "r8-abstract-class"

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_1
    const/4 p0, 0x0

    .line 64
    return-object p0
.end method

.method public static p(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, -0x1

    .line 22
    if-eq p1, v2, :cond_6

    .line 23
    .line 24
    if-eq v1, v2, :cond_6

    .line 25
    .line 26
    if-eq p1, v1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const-class v2, Ly1/o;

    .line 30
    .line 31
    invoke-interface {p0, p1, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, [Ly1/o;

    .line 36
    .line 37
    if-eqz v1, :cond_6

    .line 38
    .line 39
    array-length v2, v1

    .line 40
    if-lez v2, :cond_6

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    move v3, v0

    .line 44
    :goto_0
    if-ge v3, v2, :cond_6

    .line 45
    .line 46
    aget-object v4, v1, v3

    .line 47
    .line 48
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    if-eq v5, p1, :cond_4

    .line 59
    .line 60
    :cond_2
    if-nez p2, :cond_3

    .line 61
    .line 62
    if-eq v4, p1, :cond_4

    .line 63
    .line 64
    :cond_3
    if-le p1, v5, :cond_5

    .line 65
    .line 66
    if-ge p1, v4, :cond_5

    .line 67
    .line 68
    :cond_4
    invoke-interface {p0, v5, v4}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_6
    :goto_1
    return v0
.end method

.method public static r(Lh4/h;Ljava/lang/Throwable;)Lh4/d;
    .locals 2

    .line 1
    new-instance v0, Lh4/d;

    .line 2
    .line 3
    instance-of v1, p1, Lh4/k;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lh4/h;->u:Lh4/b;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v1, Lk4/d;->a:Lh4/b;

    .line 13
    .line 14
    iget-object v1, p0, Lh4/h;->u:Lh4/b;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v1, p0, Lh4/h;->u:Lh4/b;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v1, Lk4/d;->a:Lh4/b;

    .line 26
    .line 27
    :goto_0
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, v1, p0, p1}, Lh4/d;-><init>(Landroid/graphics/drawable/Drawable;Lh4/h;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method


# virtual methods
.method public A()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lba/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/logging/Logger;

    .line 4
    .line 5
    iget-object v1, p0, Lba/a;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/logging/Level;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public B(IILcg/g;IZ)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lba/a;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lpd/f;->q(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, " DATA: streamId="

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p1, " endStream="

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, " length="

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p1, " bytes="

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-static {p3}, Lba/a;->K(Lcg/g;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object p2, p0, Lba/a;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p2, Ljava/util/logging/Logger;

    .line 62
    .line 63
    iget-object p3, p0, Lba/a;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p3, Ljava/util/logging/Level;

    .line 66
    .line 67
    invoke-virtual {p2, p3, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    return-void
.end method

.method public C(IILrd/a;Lcg/j;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lba/a;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lpd/f;->q(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, " GO_AWAY: lastStreamId="

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p1, " errorCode="

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, " length="

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p4}, Lcg/j;->d()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p1, " bytes="

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    new-instance p1, Lcg/g;

    .line 53
    .line 54
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p4}, Lcg/g;->Q(Lcg/j;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, Lba/a;->K(Lcg/g;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object p2, p0, Lba/a;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p2, Ljava/util/logging/Logger;

    .line 74
    .line 75
    iget-object p3, p0, Lba/a;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p3, Ljava/util/logging/Level;

    .line 78
    .line 79
    invoke-virtual {p2, p3, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_0
    return-void
.end method

.method public D(IJ)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lba/a;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lpd/f;->q(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, " PING: ack=false bytes="

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p2, p0, Lba/a;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p2, Ljava/util/logging/Logger;

    .line 34
    .line 35
    iget-object p3, p0, Lba/a;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p3, Ljava/util/logging/Level;

    .line 38
    .line 39
    invoke-virtual {p2, p3, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public E(IILrd/a;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lba/a;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lpd/f;->q(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, " RST_STREAM: streamId="

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p1, " errorCode="

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object p2, p0, Lba/a;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p2, Ljava/util/logging/Logger;

    .line 42
    .line 43
    iget-object p3, p0, Lba/a;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p3, Ljava/util/logging/Level;

    .line 46
    .line 47
    invoke-virtual {p2, p3, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
.end method

.method public F(ILN/I;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lba/a;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lpd/f;->q(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, " SETTINGS: ack=false settings="

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    new-instance p1, Ljava/util/EnumMap;

    .line 25
    .line 26
    const-class v1, Lpd/n;

    .line 27
    .line 28
    invoke-direct {p1, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lpd/n;->values()[Lpd/n;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    array-length v2, v1

    .line 36
    const/4 v3, 0x0

    .line 37
    :goto_0
    if-ge v3, v2, :cond_1

    .line 38
    .line 39
    aget-object v4, v1, v3

    .line 40
    .line 41
    iget v5, v4, Lpd/n;->a:I

    .line 42
    .line 43
    invoke-virtual {p2, v5}, LN/I;->a(I)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_0

    .line 48
    .line 49
    iget-object v5, p2, LN/I;->b:[I

    .line 50
    .line 51
    iget v6, v4, Lpd/n;->a:I

    .line 52
    .line 53
    aget v5, v5, v6

    .line 54
    .line 55
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {p1, v4, v5}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object p2, p0, Lba/a;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p2, Ljava/util/logging/Logger;

    .line 79
    .line 80
    iget-object v0, p0, Lba/a;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Ljava/util/logging/Level;

    .line 83
    .line 84
    invoke-virtual {p2, v0, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    return-void
.end method

.method public G(IIJ)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lba/a;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lpd/f;->q(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, " WINDOW_UPDATE: streamId="

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p1, " windowSizeIncrement="

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object p2, p0, Lba/a;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p2, Ljava/util/logging/Logger;

    .line 42
    .line 43
    iget-object p3, p0, Lba/a;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p3, Ljava/util/logging/Level;

    .line 46
    .line 47
    invoke-virtual {p2, p3, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
.end method

.method public H(Lh4/h;Li4/f;)Lh4/l;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v4, p2

    .line 6
    .line 7
    iget-object v2, v1, Lh4/h;->e:Lff/v;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, v1, Lh4/h;->d:Landroid/graphics/Bitmap$Config;

    .line 13
    .line 14
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/16 v5, 0x1a

    .line 17
    .line 18
    if-lt v3, v5, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lcom/google/android/gms/internal/ads/m;->p()Landroid/graphics/Bitmap$Config;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-ne v2, v3, :cond_0

    .line 25
    .line 26
    iget-boolean v2, v1, Lh4/h;->j:Z

    .line 27
    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-object v2, v0, Lba/a;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Lxg/g;

    .line 34
    .line 35
    invoke-virtual {v2, v4}, Lxg/g;->j(Li4/f;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    iget-object v2, v1, Lh4/h;->d:Landroid/graphics/Bitmap$Config;

    .line 42
    .line 43
    :goto_0
    move-object v3, v2

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    :goto_1
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :goto_2
    iget-object v2, v0, Lba/a;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lk4/j;

    .line 51
    .line 52
    iget-boolean v2, v2, Lk4/j;->d:Z

    .line 53
    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    iget v2, v1, Lh4/h;->y:I

    .line 57
    .line 58
    :goto_3
    move v14, v2

    .line 59
    goto :goto_4

    .line 60
    :cond_2
    const/4 v2, 0x4

    .line 61
    goto :goto_3

    .line 62
    :goto_4
    iget-boolean v2, v1, Lh4/h;->k:Z

    .line 63
    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    iget-object v2, v1, Lh4/h;->e:Lff/v;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    sget-object v2, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    .line 72
    .line 73
    if-eq v3, v2, :cond_3

    .line 74
    .line 75
    const/4 v2, 0x1

    .line 76
    :goto_5
    move v7, v2

    .line 77
    goto :goto_6

    .line 78
    :cond_3
    const/4 v2, 0x0

    .line 79
    goto :goto_5

    .line 80
    :goto_6
    iget-object v2, v4, Li4/f;->a:Lp7/b;

    .line 81
    .line 82
    sget-object v5, Li4/b;->e:Li4/b;

    .line 83
    .line 84
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-nez v2, :cond_5

    .line 89
    .line 90
    iget-object v2, v4, Li4/f;->b:Lp7/b;

    .line 91
    .line 92
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_4

    .line 97
    .line 98
    goto :goto_8

    .line 99
    :cond_4
    iget v2, v1, Lh4/h;->z:I

    .line 100
    .line 101
    :goto_7
    move v5, v2

    .line 102
    goto :goto_9

    .line 103
    :cond_5
    :goto_8
    const/4 v2, 0x2

    .line 104
    goto :goto_7

    .line 105
    :goto_9
    new-instance v2, Lh4/l;

    .line 106
    .line 107
    move-object v6, v2

    .line 108
    iget-object v2, v1, Lh4/h;->a:Landroid/content/Context;

    .line 109
    .line 110
    move-object v8, v6

    .line 111
    invoke-static {v1}, Lk4/d;->a(Lh4/h;)Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    move-object v9, v8

    .line 116
    iget-boolean v8, v1, Lh4/h;->l:Z

    .line 117
    .line 118
    move-object v10, v9

    .line 119
    iget-object v9, v1, Lh4/h;->g:Lokhttp3/Headers;

    .line 120
    .line 121
    move-object v11, v10

    .line 122
    iget-object v10, v1, Lh4/h;->h:Lh4/p;

    .line 123
    .line 124
    move-object v12, v11

    .line 125
    iget-object v11, v1, Lh4/h;->s:Lh4/n;

    .line 126
    .line 127
    move-object v13, v12

    .line 128
    iget v12, v1, Lh4/h;->w:I

    .line 129
    .line 130
    iget v1, v1, Lh4/h;->x:I

    .line 131
    .line 132
    move-object v15, v13

    .line 133
    move v13, v1

    .line 134
    move-object v1, v15

    .line 135
    invoke-direct/range {v1 .. v14}, Lh4/l;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Li4/f;IZZZLokhttp3/Headers;Lh4/p;Lh4/n;III)V

    .line 136
    .line 137
    .line 138
    move-object v13, v1

    .line 139
    return-object v13
.end method

.method public I(Lkc/A;)Landroid/view/MotionEvent;
    .locals 7

    .line 1
    :goto_0
    iget-object v0, p0, Lba/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/PriorityQueue;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lba/a;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Landroid/util/LongSparseArray;

    .line 12
    .line 13
    iget-wide v3, p1, Lkc/A;->a:J

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/lang/Long;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 24
    .line 25
    .line 26
    move-result-wide v5

    .line 27
    cmp-long v1, v5, v3

    .line 28
    .line 29
    if-gez v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Long;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    invoke-virtual {v2, v0, v1}, Landroid/util/LongSparseArray;->remove(J)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_1

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Ljava/lang/Long;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    cmp-long p1, v5, v3

    .line 62
    .line 63
    if-nez p1, :cond_1

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-virtual {v2, v3, v4}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Landroid/view/MotionEvent;

    .line 73
    .line 74
    invoke-virtual {v2, v3, v4}, Landroid/util/LongSparseArray;->remove(J)V

    .line 75
    .line 76
    .line 77
    return-object p1
.end method

.method public J(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lba/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg0/b;

    .line 4
    .line 5
    iget-object v0, v0, Lg0/b;->a:Lg0/a;

    .line 6
    .line 7
    iput-wide p1, v0, Lg0/a;->d:J

    .line 8
    .line 9
    return-void
.end method

.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lba/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->a()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public b(Z)V
    .locals 7

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "viewVisible: "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v2, " called, invoking setIsViewable in WebView"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    const-string v1, "TemplateBridgeImpl"

    .line 25
    .line 26
    const/16 v5, 0xc

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Lcom/moloco/sdk/acm/h;

    .line 33
    .line 34
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 35
    .line 36
    const-string v1, "template_bridge_view_visible_invoked"

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "viewable"

    .line 46
    .line 47
    invoke-virtual {v0, v2, v1}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lba/a;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const-string v3, "attached"

    .line 63
    .line 64
    invoke-virtual {v0, v3, v2}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iget-object v2, p0, Lba/a;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Lcom/moloco/sdk/acm/recorder/c;

    .line 70
    .line 71
    invoke-virtual {v2, v0}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 72
    .line 73
    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v2, "setIsViewable("

    .line 77
    .line 78
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const/16 v2, 0x29

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/bridge/a;

    .line 94
    .line 95
    invoke-direct {v2, p0, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/bridge/a;-><init>(Lba/a;Z)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v0, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lba/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu0/w0;

    .line 4
    .line 5
    iget-object v0, v0, Lu0/w0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LVa/X7;

    .line 8
    .line 9
    iget-object v0, v0, LVa/X7;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Luc/n;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Luc/n;->a(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lba/a;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lmc/g;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lmc/g;->a(Ljava/nio/ByteBuffer;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public destroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lba/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/k;

    .line 4
    .line 5
    iget-object v1, p0, Lba/a;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/lifecycle/o;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V
    .locals 1

    .line 1
    const-string v0, "internalError"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lba/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public i(JLjava/util/List;)V
    .locals 12

    .line 1
    const-string v0, "pointerInputFilters"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lba/a;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La2/v;

    .line 9
    .line 10
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    move v5, v2

    .line 17
    move v4, v3

    .line 18
    :goto_0
    if-ge v4, v1, :cond_6

    .line 19
    .line 20
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    check-cast v6, Lp0/n;

    .line 25
    .line 26
    if-eqz v5, :cond_5

    .line 27
    .line 28
    iget-object v7, v0, La2/v;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v7, LP/d;

    .line 31
    .line 32
    iget v8, v7, LP/d;->c:I

    .line 33
    .line 34
    if-lez v8, :cond_2

    .line 35
    .line 36
    iget-object v7, v7, LP/d;->a:[Ljava/lang/Object;

    .line 37
    .line 38
    move v9, v3

    .line 39
    :cond_0
    aget-object v10, v7, v9

    .line 40
    .line 41
    move-object v11, v10

    .line 42
    check-cast v11, Lp0/e;

    .line 43
    .line 44
    iget-object v11, v11, Lp0/e;->c:Lp0/n;

    .line 45
    .line 46
    invoke-static {v11, v6}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    if-eqz v11, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 54
    .line 55
    if-lt v9, v8, :cond_0

    .line 56
    .line 57
    :cond_2
    const/4 v10, 0x0

    .line 58
    :goto_1
    check-cast v10, Lp0/e;

    .line 59
    .line 60
    if-eqz v10, :cond_4

    .line 61
    .line 62
    iput-boolean v2, v10, Lp0/e;->i:Z

    .line 63
    .line 64
    new-instance v0, Lp0/j;

    .line 65
    .line 66
    invoke-direct {v0, p1, p2}, Lp0/j;-><init>(J)V

    .line 67
    .line 68
    .line 69
    iget-object v6, v10, Lp0/e;->d:LP/d;

    .line 70
    .line 71
    invoke-virtual {v6, v0}, LP/d;->f(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_3

    .line 76
    .line 77
    new-instance v0, Lp0/j;

    .line 78
    .line 79
    invoke-direct {v0, p1, p2}, Lp0/j;-><init>(J)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6, v0}, LP/d;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_3
    move-object v0, v10

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move v5, v3

    .line 88
    :cond_5
    new-instance v7, Lp0/e;

    .line 89
    .line 90
    invoke-direct {v7, v6}, Lp0/e;-><init>(Lp0/n;)V

    .line 91
    .line 92
    .line 93
    new-instance v6, Lp0/j;

    .line 94
    .line 95
    invoke-direct {v6, p1, p2}, Lp0/j;-><init>(J)V

    .line 96
    .line 97
    .line 98
    iget-object v8, v7, Lp0/e;->d:LP/d;

    .line 99
    .line 100
    invoke-virtual {v8, v6}, LP/d;->b(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iget-object v0, v0, La2/v;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, LP/d;

    .line 106
    .line 107
    invoke-virtual {v0, v7}, LP/d;->b(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    move-object v0, v7

    .line 111
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_6
    return-void
.end method

.method public j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lba/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LN6/w;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iput-boolean v1, v0, LN6/w;->b:Z

    .line 7
    .line 8
    iget-object v0, p0, Lba/a;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/concurrent/ScheduledFuture;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public l()V
    .locals 4

    .line 1
    iget-object v0, p0, Lba/a;->c:Ljava/lang/Object;

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
    const/4 v3, 0x0

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

.method public m(II)Ls2/C;
    .locals 0

    .line 1
    iget-object p1, p0, Lba/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lk2/c0;

    .line 4
    .line 5
    return-object p1
.end method

.method public n(Ljava/util/Map;)Ljava/util/HashMap;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/Map$Entry;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lka/C1;

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lba/a;->o(Lka/C1;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    return-object v0
.end method

.method public o(Lka/C1;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {p1}, Ls9/p;->l(Lka/C1;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x3

    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lka/C1;->v()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p1}, Lka/n;->t(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "Unknown value type: "

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-array v0, v5, [Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {p1, v0}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    throw v4

    .line 33
    :pswitch_0
    invoke-virtual {p1}, Lka/C1;->s()Lka/p0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Lka/p0;->getFieldsMap()Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1}, Lba/a;->n(Ljava/util/Map;)Ljava/util/HashMap;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :pswitch_1
    invoke-virtual {p1}, Lka/C1;->s()Lka/p0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lka/p0;->getFieldsMap()Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-string v0, "value"

    .line 55
    .line 56
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Lka/C1;

    .line 61
    .line 62
    invoke-virtual {p1}, Lka/C1;->m()Lka/g;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lka/g;->getValuesList()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    new-array v0, v0, [D

    .line 75
    .line 76
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-ge v5, v1, :cond_0

    .line 81
    .line 82
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Lka/C1;

    .line 87
    .line 88
    invoke-virtual {v1}, Lka/C1;->getDoubleValue()D

    .line 89
    .line 90
    .line 91
    move-result-wide v1

    .line 92
    aput-wide v1, v0, v5

    .line 93
    .line 94
    add-int/2addr v5, v3

    .line 95
    goto :goto_0

    .line 96
    :cond_0
    new-instance p1, Lm9/g0;

    .line 97
    .line 98
    invoke-direct {p1, v0}, Lm9/g0;-><init>([D)V

    .line 99
    .line 100
    .line 101
    return-object p1

    .line 102
    :pswitch_2
    invoke-virtual {p1}, Lka/C1;->m()Lka/g;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {p1}, Lka/g;->getValuesCount()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Lka/g;->getValuesList()Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_1

    .line 128
    .line 129
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, Lka/C1;

    .line 134
    .line 135
    invoke-virtual {p0, v1}, Lba/a;->o(Lka/C1;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_1
    return-object v0

    .line 144
    :pswitch_3
    new-instance v0, Lm9/J;

    .line 145
    .line 146
    invoke-virtual {p1}, Lka/C1;->q()LIa/c;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1}, LIa/c;->e()D

    .line 151
    .line 152
    .line 153
    move-result-wide v1

    .line 154
    invoke-virtual {p1}, Lka/C1;->q()LIa/c;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p1}, LIa/c;->f()D

    .line 159
    .line 160
    .line 161
    move-result-wide v3

    .line 162
    invoke-direct {v0, v1, v2, v3, v4}, Lm9/J;-><init>(DD)V

    .line 163
    .line 164
    .line 165
    return-object v0

    .line 166
    :pswitch_4
    invoke-virtual {p1}, Lka/C1;->t()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v0}, Ls9/m;->l(Ljava/lang/String;)Ls9/m;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-object v4, v0, Ls9/e;->a:Ljava/util/List;

    .line 175
    .line 176
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-le v4, v1, :cond_2

    .line 181
    .line 182
    invoke-virtual {v0, v5}, Ls9/e;->g(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    const-string v6, "projects"

    .line 187
    .line 188
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    if-eqz v4, :cond_2

    .line 193
    .line 194
    invoke-virtual {v0, v2}, Ls9/e;->g(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    const-string v6, "databases"

    .line 199
    .line 200
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    if-eqz v4, :cond_2

    .line 205
    .line 206
    move v4, v3

    .line 207
    goto :goto_2

    .line 208
    :cond_2
    move v4, v5

    .line 209
    :goto_2
    const-string v6, "Tried to parse an invalid resource name: %s"

    .line 210
    .line 211
    new-array v7, v3, [Ljava/lang/Object;

    .line 212
    .line 213
    aput-object v0, v7, v5

    .line 214
    .line 215
    invoke-static {v4, v6, v7}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    new-instance v4, Ls9/f;

    .line 219
    .line 220
    invoke-virtual {v0, v3}, Ls9/e;->g(I)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    invoke-virtual {v0, v1}, Ls9/e;->g(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-direct {v4, v6, v0}, Ls9/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1}, Lka/C1;->t()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-static {p1}, Ls9/h;->c(Ljava/lang/String;)Ls9/h;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    iget-object v7, p0, Lba/a;->b:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v7, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 242
    .line 243
    iget-object v8, v7, Lcom/google/firebase/firestore/FirebaseFirestore;->c:Ls9/f;

    .line 244
    .line 245
    invoke-virtual {v4, v8}, Ls9/f;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    if-nez v4, :cond_3

    .line 250
    .line 251
    iget-object v4, p1, Ls9/h;->a:Ls9/m;

    .line 252
    .line 253
    iget-object v9, v8, Ls9/f;->b:Ljava/lang/String;

    .line 254
    .line 255
    iget-object v8, v8, Ls9/f;->a:Ljava/lang/String;

    .line 256
    .line 257
    const/4 v10, 0x5

    .line 258
    new-array v10, v10, [Ljava/lang/Object;

    .line 259
    .line 260
    aput-object v4, v10, v5

    .line 261
    .line 262
    aput-object v6, v10, v3

    .line 263
    .line 264
    aput-object v0, v10, v2

    .line 265
    .line 266
    aput-object v8, v10, v1

    .line 267
    .line 268
    const/4 v0, 0x4

    .line 269
    aput-object v9, v10, v0

    .line 270
    .line 271
    const-string v0, "DocumentSnapshot"

    .line 272
    .line 273
    const-string v1, "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead."

    .line 274
    .line 275
    invoke-static {v0, v1, v2, v10}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    :cond_3
    new-instance v0, Lm9/m;

    .line 279
    .line 280
    invoke-direct {v0, p1, v7}, Lm9/m;-><init>(Ls9/h;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 281
    .line 282
    .line 283
    return-object v0

    .line 284
    :pswitch_5
    invoke-virtual {p1}, Lka/C1;->o()Lcom/google/protobuf/ByteString;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    const-string v0, "Provided ByteString must not be null."

    .line 289
    .line 290
    invoke-static {p1, v0}, LFe/c;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    new-instance v0, Lm9/g;

    .line 294
    .line 295
    invoke-direct {v0, p1}, Lm9/g;-><init>(Lcom/google/protobuf/ByteString;)V

    .line 296
    .line 297
    .line 298
    return-object v0

    .line 299
    :pswitch_6
    invoke-virtual {p1}, Lka/C1;->getStringValue()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    return-object p1

    .line 304
    :pswitch_7
    iget-object v0, p0, Lba/a;->c:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v0, Lm9/n;

    .line 307
    .line 308
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-eq v0, v3, :cond_6

    .line 313
    .line 314
    if-eq v0, v2, :cond_4

    .line 315
    .line 316
    goto :goto_3

    .line 317
    :cond_4
    invoke-static {p1}, Ls9/n;->b(Lka/C1;)Lka/C1;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    if-nez p1, :cond_5

    .line 322
    .line 323
    goto :goto_3

    .line 324
    :cond_5
    invoke-virtual {p0, p1}, Lba/a;->o(Lka/C1;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    return-object p1

    .line 329
    :cond_6
    invoke-static {p1}, Ls9/n;->a(Lka/C1;)Lcom/google/protobuf/Timestamp;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    new-instance v0, Ls8/q;

    .line 334
    .line 335
    invoke-virtual {p1}, Lcom/google/protobuf/Timestamp;->getSeconds()J

    .line 336
    .line 337
    .line 338
    move-result-wide v1

    .line 339
    invoke-virtual {p1}, Lcom/google/protobuf/Timestamp;->getNanos()I

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    invoke-direct {v0, v1, v2, p1}, Ls8/q;-><init>(JI)V

    .line 344
    .line 345
    .line 346
    return-object v0

    .line 347
    :pswitch_8
    invoke-virtual {p1}, Lka/C1;->u()Lcom/google/protobuf/Timestamp;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    new-instance v0, Ls8/q;

    .line 352
    .line 353
    invoke-virtual {p1}, Lcom/google/protobuf/Timestamp;->getSeconds()J

    .line 354
    .line 355
    .line 356
    move-result-wide v1

    .line 357
    invoke-virtual {p1}, Lcom/google/protobuf/Timestamp;->getNanos()I

    .line 358
    .line 359
    .line 360
    move-result p1

    .line 361
    invoke-direct {v0, v1, v2, p1}, Ls8/q;-><init>(JI)V

    .line 362
    .line 363
    .line 364
    return-object v0

    .line 365
    :pswitch_9
    invoke-virtual {p1}, Lka/C1;->v()I

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    invoke-static {v0, v1}, LA/f;->b(II)Z

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-eqz v0, :cond_7

    .line 374
    .line 375
    invoke-virtual {p1}, Lka/C1;->r()J

    .line 376
    .line 377
    .line 378
    move-result-wide v0

    .line 379
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 380
    .line 381
    .line 382
    move-result-object p1

    .line 383
    return-object p1

    .line 384
    :cond_7
    invoke-virtual {p1}, Lka/C1;->getDoubleValue()D

    .line 385
    .line 386
    .line 387
    move-result-wide v0

    .line 388
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 389
    .line 390
    .line 391
    move-result-object p1

    .line 392
    return-object p1

    .line 393
    :pswitch_a
    invoke-virtual {p1}, Lka/C1;->n()Z

    .line 394
    .line 395
    .line 396
    move-result p1

    .line 397
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    return-object p1

    .line 402
    :goto_3
    :pswitch_b
    return-object v4

    .line 403
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public q(LE5/b;Z)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lba/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La2/v;

    .line 4
    .line 5
    iget-object v1, p1, LE5/b;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    iget-object v2, p0, Lba/a;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lt0/i;

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2, p1, p2}, La2/v;->n(Ljava/util/LinkedHashMap;Lt0/i;LE5/b;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    goto :goto_6

    .line 21
    :cond_0
    const-string v3, "parentCoordinates"

    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v3, v0, La2/v;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, LP/d;

    .line 29
    .line 30
    iget v5, v3, LP/d;->c:I

    .line 31
    .line 32
    const/4 v6, 0x1

    .line 33
    if-lez v5, :cond_4

    .line 34
    .line 35
    iget-object v7, v3, LP/d;->a:[Ljava/lang/Object;

    .line 36
    .line 37
    move v8, v4

    .line 38
    move v9, v8

    .line 39
    :cond_1
    aget-object v10, v7, v8

    .line 40
    .line 41
    check-cast v10, Lp0/e;

    .line 42
    .line 43
    invoke-virtual {v10, v1, v2, p1, p2}, Lp0/e;->G(Ljava/util/Map;Lr0/k;LE5/b;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    if-nez v10, :cond_3

    .line 48
    .line 49
    if-eqz v9, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    move v9, v4

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    :goto_0
    move v9, v6

    .line 55
    :goto_1
    add-int/lit8 v8, v8, 0x1

    .line 56
    .line 57
    if-lt v8, v5, :cond_1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    move v9, v4

    .line 61
    :goto_2
    iget p2, v3, LP/d;->c:I

    .line 62
    .line 63
    if-lez p2, :cond_8

    .line 64
    .line 65
    iget-object v1, v3, LP/d;->a:[Ljava/lang/Object;

    .line 66
    .line 67
    move v2, v4

    .line 68
    move v3, v2

    .line 69
    :cond_5
    aget-object v5, v1, v2

    .line 70
    .line 71
    check-cast v5, Lp0/e;

    .line 72
    .line 73
    invoke-virtual {v5, p1}, Lp0/e;->D(LE5/b;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-nez v5, :cond_7

    .line 78
    .line 79
    if-eqz v3, :cond_6

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_6
    move v3, v4

    .line 83
    goto :goto_4

    .line 84
    :cond_7
    :goto_3
    move v3, v6

    .line 85
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    if-lt v2, p2, :cond_5

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_8
    move v3, v4

    .line 91
    :goto_5
    invoke-virtual {v0, p1}, La2/v;->o(LE5/b;)V

    .line 92
    .line 93
    .line 94
    if-nez v3, :cond_a

    .line 95
    .line 96
    if-eqz v9, :cond_9

    .line 97
    .line 98
    goto :goto_7

    .line 99
    :cond_9
    :goto_6
    return v4

    .line 100
    :cond_a
    :goto_7
    return v6
.end method

.method public s(Ls2/w;)V
    .locals 0

    .line 1
    return-void
.end method

.method public t(Lqa/a;)Lna/m;
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x4

    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x0

    .line 5
    iget-object v4, p1, Lqa/a;->b:Ljava/lang/reflect/Type;

    .line 6
    .line 7
    iget-object v5, p0, Lba/a;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v5, Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    if-nez v6, :cond_12

    .line 16
    .line 17
    iget-object p1, p1, Lqa/a;->a:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-interface {v5, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    if-nez v5, :cond_11

    .line 24
    .line 25
    const-class v5, Ljava/util/EnumSet;

    .line 26
    .line 27
    invoke-virtual {v5, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const/4 v6, 0x0

    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    new-instance v5, Lna/e;

    .line 35
    .line 36
    invoke-direct {v5, v3, v4}, Lna/e;-><init>(ILjava/lang/reflect/Type;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-class v5, Ljava/util/EnumMap;

    .line 41
    .line 42
    if-ne p1, v5, :cond_1

    .line 43
    .line 44
    new-instance v5, Lna/e;

    .line 45
    .line 46
    invoke-direct {v5, v2, v4}, Lna/e;-><init>(ILjava/lang/reflect/Type;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move-object v5, v6

    .line 51
    :goto_0
    if-eqz v5, :cond_2

    .line 52
    .line 53
    return-object v5

    .line 54
    :cond_2
    iget-object v5, p0, Lba/a;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v5, Ljava/util/List;

    .line 57
    .line 58
    invoke-static {v5}, Lna/d;->f(Ljava/util/List;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_3

    .line 70
    .line 71
    :catch_0
    move-object v5, v6

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :try_start_0
    new-array v5, v3, [Ljava/lang/Class;

    .line 74
    .line 75
    invoke-virtual {p1, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 76
    .line 77
    .line 78
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    sget-object v7, Lpa/c;->a:Lp7/b;

    .line 80
    .line 81
    :try_start_1
    invoke-virtual {v5, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 82
    .line 83
    .line 84
    move-object v2, v6

    .line 85
    goto :goto_1

    .line 86
    :catch_1
    move-exception v2

    .line 87
    new-instance v7, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v8, "Failed making constructor \'"

    .line 90
    .line 91
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v5}, Lpa/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v8, "\' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: "

    .line 102
    .line 103
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-static {v2}, Lpa/c;->e(Ljava/lang/Exception;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    :goto_1
    if-eqz v2, :cond_4

    .line 125
    .line 126
    new-instance v5, LJ9/y;

    .line 127
    .line 128
    invoke-direct {v5, v2, v1}, LJ9/y;-><init>(Ljava/lang/String;I)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    new-instance v2, Lcom/unity3d/services/core/webview/b;

    .line 133
    .line 134
    const/16 v7, 0x19

    .line 135
    .line 136
    invoke-direct {v2, v5, v7}, Lcom/unity3d/services/core/webview/b;-><init>(Ljava/lang/Object;I)V

    .line 137
    .line 138
    .line 139
    move-object v5, v2

    .line 140
    :goto_2
    if-eqz v5, :cond_5

    .line 141
    .line 142
    return-object v5

    .line 143
    :cond_5
    const-class v2, Ljava/util/Collection;

    .line 144
    .line 145
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_9

    .line 150
    .line 151
    const-class v2, Ljava/util/SortedSet;

    .line 152
    .line 153
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_6

    .line 158
    .line 159
    new-instance v6, Lm9/B;

    .line 160
    .line 161
    invoke-direct {v6, v1}, Lm9/B;-><init>(I)V

    .line 162
    .line 163
    .line 164
    goto/16 :goto_3

    .line 165
    .line 166
    :cond_6
    const-class v1, Ljava/util/Set;

    .line 167
    .line 168
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_7

    .line 173
    .line 174
    new-instance v6, Lm9/B;

    .line 175
    .line 176
    const/4 v1, 0x5

    .line 177
    invoke-direct {v6, v1}, Lm9/B;-><init>(I)V

    .line 178
    .line 179
    .line 180
    goto/16 :goto_3

    .line 181
    .line 182
    :cond_7
    const-class v1, Ljava/util/Queue;

    .line 183
    .line 184
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_8

    .line 189
    .line 190
    new-instance v6, Lm9/B;

    .line 191
    .line 192
    const/4 v1, 0x6

    .line 193
    invoke-direct {v6, v1}, Lm9/B;-><init>(I)V

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_8
    new-instance v6, Lm9/B;

    .line 198
    .line 199
    const/4 v1, 0x7

    .line 200
    invoke-direct {v6, v1}, Lm9/B;-><init>(I)V

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_9
    const-class v1, Ljava/util/Map;

    .line 205
    .line 206
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_e

    .line 211
    .line 212
    const-class v1, Ljava/util/concurrent/ConcurrentNavigableMap;

    .line 213
    .line 214
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-eqz v1, :cond_a

    .line 219
    .line 220
    new-instance v6, Lm9/B;

    .line 221
    .line 222
    const/16 v1, 0x8

    .line 223
    .line 224
    invoke-direct {v6, v1}, Lm9/B;-><init>(I)V

    .line 225
    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_a
    const-class v1, Ljava/util/concurrent/ConcurrentMap;

    .line 229
    .line 230
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    if-eqz v1, :cond_b

    .line 235
    .line 236
    new-instance v6, Lm9/B;

    .line 237
    .line 238
    const/16 v1, 0x9

    .line 239
    .line 240
    invoke-direct {v6, v1}, Lm9/B;-><init>(I)V

    .line 241
    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_b
    const-class v1, Ljava/util/SortedMap;

    .line 245
    .line 246
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-eqz v1, :cond_c

    .line 251
    .line 252
    new-instance v6, Lm9/B;

    .line 253
    .line 254
    const/16 v1, 0xa

    .line 255
    .line 256
    invoke-direct {v6, v1}, Lm9/B;-><init>(I)V

    .line 257
    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_c
    instance-of v1, v4, Ljava/lang/reflect/ParameterizedType;

    .line 261
    .line 262
    if-eqz v1, :cond_d

    .line 263
    .line 264
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 265
    .line 266
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    aget-object v1, v1, v3

    .line 271
    .line 272
    new-instance v2, Lqa/a;

    .line 273
    .line 274
    invoke-direct {v2, v1}, Lqa/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 275
    .line 276
    .line 277
    const-class v1, Ljava/lang/String;

    .line 278
    .line 279
    iget-object v2, v2, Lqa/a;->a:Ljava/lang/Class;

    .line 280
    .line 281
    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    if-nez v1, :cond_d

    .line 286
    .line 287
    new-instance v6, Lm9/B;

    .line 288
    .line 289
    const/16 v1, 0xb

    .line 290
    .line 291
    invoke-direct {v6, v1}, Lm9/B;-><init>(I)V

    .line 292
    .line 293
    .line 294
    goto :goto_3

    .line 295
    :cond_d
    new-instance v6, Lm9/B;

    .line 296
    .line 297
    invoke-direct {v6, v0}, Lm9/B;-><init>(I)V

    .line 298
    .line 299
    .line 300
    :cond_e
    :goto_3
    if-eqz v6, :cond_f

    .line 301
    .line 302
    return-object v6

    .line 303
    :cond_f
    invoke-static {p1}, Lba/a;->k(Ljava/lang/Class;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    if-eqz v1, :cond_10

    .line 308
    .line 309
    new-instance p1, LJ9/y;

    .line 310
    .line 311
    invoke-direct {p1, v1, v0}, LJ9/y;-><init>(Ljava/lang/String;I)V

    .line 312
    .line 313
    .line 314
    return-object p1

    .line 315
    :cond_10
    new-instance v0, Lcom/unity3d/services/core/webview/b;

    .line 316
    .line 317
    const/16 v1, 0x1a

    .line 318
    .line 319
    invoke-direct {v0, p1, v1}, Lcom/unity3d/services/core/webview/b;-><init>(Ljava/lang/Object;I)V

    .line 320
    .line 321
    .line 322
    return-object v0

    .line 323
    :cond_11
    new-instance p1, Ljava/lang/ClassCastException;

    .line 324
    .line 325
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 326
    .line 327
    .line 328
    throw p1

    .line 329
    :cond_12
    new-instance p1, Ljava/lang/ClassCastException;

    .line 330
    .line 331
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 332
    .line 333
    .line 334
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lba/a;->a:I

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "Request{url="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lba/a;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lsd/a;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x7d

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :sswitch_1
    iget-object v0, p0, Lba/a;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/util/Map;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0

    .line 44
    :sswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v1, "Bounds{lower="

    .line 47
    .line 48
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lba/a;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Lb1/c;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v1, " upper="

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lba/a;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lb1/c;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, "}"

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    return-object v0

    .line 80
    nop

    .line 81
    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_2
        0x10 -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method

.method public u(Laa/e;)Lda/d;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-string v2, ""

    .line 4
    .line 5
    iget-object v3, p1, Laa/e;->g:Lorg/json/JSONArray;

    .line 6
    .line 7
    iget-wide v4, p1, Laa/e;->f:J

    .line 8
    .line 9
    new-instance p1, Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    move v6, v0

    .line 15
    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    if-ge v6, v7, :cond_8

    .line 20
    .line 21
    :try_start_0
    invoke-virtual {v3, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    const-string v8, "rolloutId"

    .line 26
    .line 27
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    const-string v9, "affectedParameterKeys"

    .line 32
    .line 33
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    if-le v10, v1, :cond_0

    .line 42
    .line 43
    const-string v10, "FirebaseRemoteConfig"

    .line 44
    .line 45
    const-string v11, "Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s"

    .line 46
    .line 47
    const/4 v12, 0x2

    .line 48
    new-array v12, v12, [Ljava/lang/Object;

    .line 49
    .line 50
    aput-object v8, v12, v0

    .line 51
    .line 52
    aput-object v9, v12, v1

    .line 53
    .line 54
    invoke-static {v11, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    invoke-static {v10, v11}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catch_0
    move-exception p1

    .line 63
    goto/16 :goto_5

    .line 64
    .line 65
    :cond_0
    :goto_1
    invoke-virtual {v9, v0, v2}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    iget-object v10, p0, Lba/a;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v10, Laa/c;

    .line 72
    .line 73
    invoke-virtual {v10}, Laa/c;->c()Laa/e;

    .line 74
    .line 75
    .line 76
    move-result-object v10
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    const/4 v11, 0x0

    .line 78
    if-nez v10, :cond_1

    .line 79
    .line 80
    :catch_1
    move-object v10, v11

    .line 81
    goto :goto_2

    .line 82
    :cond_1
    :try_start_1
    iget-object v10, v10, Laa/e;->b:Lorg/json/JSONObject;

    .line 83
    .line 84
    invoke-virtual {v10, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v10
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 88
    :goto_2
    if-eqz v10, :cond_2

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_2
    :try_start_2
    iget-object v10, p0, Lba/a;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v10, Laa/c;

    .line 94
    .line 95
    invoke-virtual {v10}, Laa/c;->c()Laa/e;

    .line 96
    .line 97
    .line 98
    move-result-object v10
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 99
    if-nez v10, :cond_3

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_3
    :try_start_3
    iget-object v10, v10, Laa/e;->b:Lorg/json/JSONObject;

    .line 103
    .line 104
    invoke-virtual {v10, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v11
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    .line 108
    :catch_2
    :goto_3
    if-eqz v11, :cond_4

    .line 109
    .line 110
    move-object v10, v11

    .line 111
    goto :goto_4

    .line 112
    :cond_4
    move-object v10, v2

    .line 113
    :goto_4
    :try_start_4
    sget v11, Lda/e;->a:I

    .line 114
    .line 115
    new-instance v11, Lda/b;

    .line 116
    .line 117
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 118
    .line 119
    .line 120
    if-eqz v8, :cond_7

    .line 121
    .line 122
    iput-object v8, v11, Lda/b;->a:Ljava/lang/String;

    .line 123
    .line 124
    const-string v8, "variantId"

    .line 125
    .line 126
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    if-eqz v7, :cond_6

    .line 131
    .line 132
    iput-object v7, v11, Lda/b;->b:Ljava/lang/String;

    .line 133
    .line 134
    if-eqz v9, :cond_5

    .line 135
    .line 136
    iput-object v9, v11, Lda/b;->c:Ljava/lang/String;

    .line 137
    .line 138
    iput-object v10, v11, Lda/b;->d:Ljava/lang/String;

    .line 139
    .line 140
    iput-wide v4, v11, Lda/b;->e:J

    .line 141
    .line 142
    iget-byte v7, v11, Lda/b;->f:B

    .line 143
    .line 144
    or-int/2addr v7, v1

    .line 145
    int-to-byte v7, v7

    .line 146
    iput-byte v7, v11, Lda/b;->f:B

    .line 147
    .line 148
    invoke-virtual {v11}, Lda/b;->a()Lda/c;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    invoke-virtual {p1, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    add-int/2addr v6, v1

    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    .line 159
    .line 160
    const-string v0, "Null parameterKey"

    .line 161
    .line 162
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p1

    .line 166
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 167
    .line 168
    const-string v0, "Null variantId"

    .line 169
    .line 170
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw p1

    .line 174
    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    .line 175
    .line 176
    const-string v0, "Null rolloutId"

    .line 177
    .line 178
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw p1
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    .line 182
    :goto_5
    new-instance v0, LZ9/e;

    .line 183
    .line 184
    const-string v1, "Exception parsing rollouts metadata to create RolloutsState."

    .line 185
    .line 186
    invoke-direct {v0, v1, p1}, Ls8/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    throw v0

    .line 190
    :cond_8
    new-instance v0, Lda/d;

    .line 191
    .line 192
    invoke-direct {v0, p1}, Lda/d;-><init>(Ljava/util/HashSet;)V

    .line 193
    .line 194
    .line 195
    return-object v0
.end method

.method public v()Le0/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lba/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg0/b;

    .line 4
    .line 5
    iget-object v0, v0, Lg0/b;->a:Lg0/a;

    .line 6
    .line 7
    iget-object v0, v0, Lg0/a;->c:Le0/o;

    .line 8
    .line 9
    return-object v0
.end method

.method public w(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lba/a;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;

    .line 6
    .line 7
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/l0;->a:[I

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    aget v1, v2, v1

    .line 20
    .line 21
    :goto_0
    iget-object v2, v0, Lba/a;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;

    .line 24
    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    :pswitch_0
    new-instance v1, LE5/Q;

    .line 29
    .line 30
    const/16 v2, 0x9

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :pswitch_1
    sget-object v4, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    const-string v5, "AggregatedFullscreenAd"

    .line 42
    .line 43
    const-string v6, "Failed to resolve creative type for the ad. Please check the ad markup and ensure it follows the expected format."

    .line 44
    .line 45
    const/16 v9, 0xc

    .line 46
    .line 47
    const/4 v10, 0x0

    .line 48
    invoke-static/range {v4 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_2
    sget-object v11, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 53
    .line 54
    const/4 v14, 0x0

    .line 55
    const/4 v15, 0x0

    .line 56
    const-string v12, "AggregatedFullscreenAd"

    .line 57
    .line 58
    const-string v13, "Template creative types should not be used with AggregatedFullscreenAd. Use TemplateFullscreenAd instead."

    .line 59
    .line 60
    const/16 v16, 0xc

    .line 61
    .line 62
    const/16 v17, 0x0

    .line 63
    .line 64
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_3
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;

    .line 69
    .line 70
    invoke-interface {v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->w(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_4
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;

    .line 75
    .line 76
    invoke-interface {v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->w(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_5
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;

    .line 81
    .line 82
    invoke-interface {v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->w(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :pswitch_6
    sget-object v3, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 87
    .line 88
    const/4 v6, 0x0

    .line 89
    const/4 v7, 0x0

    .line 90
    const-string v4, "AggregatedFullscreenAd"

    .line 91
    .line 92
    const-string v5, "creativeType is null"

    .line 93
    .line 94
    const/16 v8, 0xc

    .line 95
    .line 96
    const/4 v9, 0x0

    .line 97
    invoke-static/range {v3 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public varargs x([Ljava/lang/Object;)Ls2/m;
    .locals 4

    .line 1
    iget-object v0, p0, Lba/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lba/a;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    :goto_0
    move-object v1, v2

    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_2

    .line 22
    :cond_0
    :try_start_1
    iget-object v1, p0, Lba/a;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lm9/B;

    .line 25
    .line 26
    invoke-virtual {v1}, Lm9/B;->f()Ljava/lang/reflect/Constructor;

    .line 27
    .line 28
    .line 29
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    :try_start_2
    monitor-exit v0

    .line 31
    goto :goto_1

    .line 32
    :catch_0
    move-exception p1

    .line 33
    new-instance v1, Ljava/lang/RuntimeException;

    .line 34
    .line 35
    const-string v2, "Error instantiating extension"

    .line 36
    .line 37
    invoke-direct {v1, v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    throw v1

    .line 41
    :catch_1
    iget-object v1, p0, Lba/a;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 47
    .line 48
    .line 49
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    goto :goto_0

    .line 51
    :goto_1
    if-nez v1, :cond_1

    .line 52
    .line 53
    return-object v2

    .line 54
    :cond_1
    :try_start_3
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Ls2/m;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 59
    .line 60
    return-object p1

    .line 61
    :catch_2
    move-exception p1

    .line 62
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v1, "Unexpected error creating extractor"

    .line 65
    .line 66
    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :goto_2
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 71
    throw p1
.end method

.method public y()J
    .locals 2

    .line 1
    iget-object v0, p0, Lba/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg0/b;

    .line 4
    .line 5
    iget-object v0, v0, Lg0/b;->a:Lg0/a;

    .line 6
    .line 7
    iget-wide v0, v0, Lg0/a;->d:J

    .line 8
    .line 9
    return-wide v0
.end method

.method public z(Ljava/lang/CharSequence;IILy1/i;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p4, Ly1/i;->c:I

    .line 3
    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    if-nez v1, :cond_4

    .line 7
    .line 8
    iget-object v1, p0, Lba/a;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ly1/c;

    .line 11
    .line 12
    invoke-virtual {p4}, Ly1/i;->b()Lz1/a;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    const/16 v5, 0x8

    .line 17
    .line 18
    invoke-virtual {v4, v5}, Lgf/e;->a(I)I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    iget-object v6, v4, Lgf/e;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    iget v4, v4, Lgf/e;->a:I

    .line 29
    .line 30
    add-int/2addr v5, v4

    .line 31
    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    sget-object v4, Ly1/c;->b:Ljava/lang/ThreadLocal;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    if-nez v5, :cond_1

    .line 44
    .line 45
    new-instance v5, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 60
    .line 61
    .line 62
    :goto_0
    if-ge p2, p3, :cond_2

    .line 63
    .line 64
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    add-int/2addr p2, v0

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    iget-object p1, v1, Ly1/c;->a:Landroid/text/TextPaint;

    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    sget p3, Lb1/d;->a:I

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->hasGlyph(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    move p1, v2

    .line 88
    goto :goto_1

    .line 89
    :cond_3
    move p1, v0

    .line 90
    :goto_1
    iput p1, p4, Ly1/i;->c:I

    .line 91
    .line 92
    :cond_4
    iget p1, p4, Ly1/i;->c:I

    .line 93
    .line 94
    if-ne p1, v2, :cond_5

    .line 95
    .line 96
    return v0

    .line 97
    :cond_5
    return v3
.end method
