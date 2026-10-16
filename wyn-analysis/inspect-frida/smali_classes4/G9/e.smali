.class public LG9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA7/T;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements LL4/s;
.implements LP8/b;
.implements LP8/a;
.implements LP2/d;
.implements LY2/w;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 8

    const/16 v0, 0xd

    iput v0, p0, LG9/e;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, LG9/e;->c:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, LG9/e;->d:Ljava/lang/Object;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v3, 0x1

    const-wide/16 v4, 0x1

    const/4 v2, 0x1

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v1, p0, LG9/e;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 2
    iput p1, p0, LG9/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 3
    iput p1, p0, LG9/e;->a:I

    iput-object p3, p0, LG9/e;->b:Ljava/lang/Object;

    iput-object p4, p0, LG9/e;->c:Ljava/lang/Object;

    iput-object p2, p0, LG9/e;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LC8/i;LX2/j;)V
    .locals 3

    const/16 v0, 0x18

    iput v0, p0, LG9/e;->a:I

    .line 21
    sget-object v0, LEf/S;->a:LLf/e;

    .line 22
    sget-object v0, LLf/d;->b:LLf/d;

    .line 23
    invoke-static {v0}, LEf/H;->c(Ljf/h;)LKd/a;

    move-result-object v0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, LG9/e;->b:Ljava/lang/Object;

    .line 26
    iput-object v0, p0, LG9/e;->c:Ljava/lang/Object;

    .line 27
    iget-object p1, p2, LX2/j;->c:Ljava/lang/Object;

    check-cast p1, LW9/u;

    .line 28
    new-instance p2, LCe/a;

    .line 29
    iget-object v0, p1, LW9/u;->b:Ljava/lang/Object;

    check-cast v0, Lme/a;

    .line 30
    iget-object v1, v0, Lme/a;->c:Ljava/lang/Object;

    check-cast v1, Lef/p;

    invoke-virtual {v1}, Lef/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LDe/a;

    .line 31
    iget-object v2, p1, LW9/u;->d:Ljava/lang/Object;

    check-cast v2, Landroid/app/Application;

    .line 32
    invoke-virtual {v0}, Lme/a;->D()Lac/a;

    move-result-object v0

    .line 33
    iget-object p1, p1, LW9/u;->c:Ljava/lang/Object;

    check-cast p1, LC8/i;

    invoke-direct {p2, p1, v1, v2, v0}, LCe/a;-><init>(LC8/i;LDe/a;Landroid/app/Application;Lac/a;)V

    .line 34
    iput-object p2, p0, LG9/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LF4/f;Ljava/io/InputStream;Ljava/util/ArrayList;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, LG9/e;->a:I

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const-string v0, "Argument must not be null"

    invoke-static {p1, v0}, Lgc/b;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    iput-object p1, p0, LG9/e;->c:Ljava/lang/Object;

    .line 55
    invoke-static {p3, v0}, Lgc/b;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    iput-object p3, p0, LG9/e;->d:Ljava/lang/Object;

    .line 57
    new-instance p3, LC4/i;

    invoke-direct {p3, p2, p1}, LC4/i;-><init>(Ljava/io/InputStream;LF4/f;)V

    iput-object p3, p0, LG9/e;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LQ0/e;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, LG9/e;->a:I

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LG9/e;->b:Ljava/lang/Object;

    .line 75
    new-instance v0, LR0/b;

    .line 76
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object v0, p0, LG9/e;->c:Ljava/lang/Object;

    .line 78
    iput-object p1, p0, LG9/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LS3/l;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, LG9/e;->a:I

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LG9/e;->c:Ljava/lang/Object;

    .line 60
    iput-object p1, p0, LG9/e;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LW/d;Ljava/lang/String;Ltf/a;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, LG9/e;->a:I

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    iput-object p1, p0, LG9/e;->b:Ljava/lang/Object;

    iput-object p2, p0, LG9/e;->c:Ljava/lang/Object;

    check-cast p3, Lkotlin/jvm/internal/n;

    iput-object p3, p0, LG9/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LW1/t;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, LG9/e;->a:I

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 118
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, LG9/e;->b:Ljava/lang/Object;

    .line 119
    new-instance p1, LG5/F;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, LG5/F;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, LG9/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lad/I;Lcom/moloco/sdk/internal/services/k;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, LG9/e;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, LG9/e;->b:Ljava/lang/Object;

    .line 7
    iput-object p2, p0, LG9/e;->c:Ljava/lang/Object;

    .line 8
    new-instance p1, Lcom/moloco/sdk/internal/services/bidtoken/m;

    sget-object p2, Lcom/moloco/sdk/internal/services/bidtoken/f;->a:Lcom/moloco/sdk/internal/services/bidtoken/g;

    const-string v0, ""

    invoke-direct {p1, v0, v0, p2}, Lcom/moloco/sdk/internal/services/bidtoken/m;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/services/bidtoken/g;)V

    iput-object p1, p0, LG9/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/e0;Landroidx/lifecycle/d0;LH1/b;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, LG9/e;->a:I

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, LG9/e;->b:Ljava/lang/Object;

    .line 37
    iput-object p2, p0, LG9/e;->c:Ljava/lang/Object;

    .line 38
    iput-object p3, p0, LG9/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbe/a;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, LG9/e;->a:I

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, LG9/e;->b:Ljava/lang/Object;

    .line 19
    iput-object p2, p0, LG9/e;->c:Ljava/lang/Object;

    .line 20
    iput-object p3, p0, LG9/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/moloco/sdk/acm/http/g;Lcom/moloco/sdk/acm/db/e;Lab/b;Lcom/moloco/sdk/acm/http/a;)V
    .locals 0

    const/16 p3, 0x15

    iput p3, p0, LG9/e;->a:I

    const-string p3, "metricsRequest"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "metricsDAO"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "headers"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, LG9/e;->b:Ljava/lang/Object;

    .line 11
    iput-object p2, p0, LG9/e;->c:Ljava/lang/Object;

    .line 12
    iput-object p4, p0, LG9/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lea/b;Ljf/h;)V
    .locals 1

    const/16 v0, 0x1a

    iput v0, p0, LG9/e;->a:I

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, LG9/e;->b:Ljava/lang/Object;

    .line 50
    iput-object p2, p0, LG9/e;->c:Ljava/lang/Object;

    .line 51
    const-string p1, "firebase-settings.crashlytics.com"

    iput-object p1, p0, LG9/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf0/c;Lf0/c;I)V
    .locals 11

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x3

    const/16 v3, 0x19

    iput v3, p0, LG9/e;->a:I

    const/4 v4, 0x0

    .line 98
    iget-wide v5, p1, Lf0/c;->b:J

    .line 99
    sget-wide v7, Lf0/b;->a:J

    invoke-static {v5, v6, v7, v8}, Lf0/b;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {p1}, Lf0/h;->a(Lf0/c;)Lf0/c;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, p1

    .line 100
    :goto_0
    iget-wide v9, p2, Lf0/c;->b:J

    .line 101
    invoke-static {v9, v10, v7, v8}, Lf0/b;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 102
    invoke-static {p2}, Lf0/h;->a(Lf0/c;)Lf0/c;

    move-result-object v6

    goto :goto_1

    :cond_1
    move-object v6, p2

    :goto_1
    if-ne p3, v2, :cond_7

    .line 103
    iget-wide v9, p1, Lf0/c;->b:J

    invoke-static {v9, v10, v7, v8}, Lf0/b;->a(JJ)Z

    move-result p3

    .line 104
    iget-wide v9, p2, Lf0/c;->b:J

    invoke-static {v9, v10, v7, v8}, Lf0/b;->a(JJ)Z

    move-result v7

    if-eqz p3, :cond_2

    if-eqz v7, :cond_2

    goto :goto_4

    :cond_2
    if-nez p3, :cond_3

    if-eqz v7, :cond_7

    :cond_3
    if-eqz p3, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p2

    .line 105
    :goto_2
    check-cast p1, Lf0/n;

    .line 106
    sget-object p2, Lf0/h;->e:[F

    iget-object p1, p1, Lf0/n;->d:Lf0/p;

    if-eqz p3, :cond_5

    invoke-virtual {p1}, Lf0/p;->a()[F

    move-result-object p3

    goto :goto_3

    :cond_5
    move-object p3, p2

    :goto_3
    if-eqz v7, :cond_6

    .line 107
    invoke-virtual {p1}, Lf0/p;->a()[F

    move-result-object p2

    .line 108
    :cond_6
    aget p1, p3, v4

    aget v7, p2, v4

    div-float/2addr p1, v7

    .line 109
    aget v7, p3, v1

    aget v8, p2, v1

    div-float/2addr v7, v8

    .line 110
    aget p3, p3, v0

    aget p2, p2, v0

    div-float/2addr p3, p2

    new-array p2, v2, [F

    aput p1, p2, v4

    aput v7, p2, v1

    aput p3, p2, v0

    goto :goto_5

    :cond_7
    :goto_4
    const/4 p2, 0x0

    .line 111
    :goto_5
    invoke-direct {p0, v5, v6, p2, v3}, LG9/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(Lio/flutter/plugins/firebase/messaging/a;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, LG9/e;->a:I

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 115
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, LG9/e;->b:Ljava/lang/Object;

    .line 116
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, LG9/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 3

    const/16 v0, 0x1b

    iput v0, p0, LG9/e;->a:I

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, LG9/e;->b:Ljava/lang/Object;

    .line 71
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".new"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LG9/e;->c:Ljava/lang/Object;

    .line 72
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".bak"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LG9/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 4
    iput p4, p0, LG9/e;->a:I

    iput-object p1, p0, LG9/e;->b:Ljava/lang/Object;

    iput-object p2, p0, LG9/e;->c:Ljava/lang/Object;

    iput-object p3, p0, LG9/e;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, LG9/e;->a:I

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    new-instance v0, LN1/m;

    invoke-direct {v0}, LN1/m;-><init>()V

    .line 63
    invoke-static {p1}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, LN1/m;->m:Ljava/lang/String;

    .line 64
    new-instance p1, LN1/n;

    invoke-direct {p1, v0}, LN1/n;-><init>(LN1/m;)V

    .line 65
    iput-object p1, p0, LG9/e;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 6

    const/16 v0, 0x10

    iput v0, p0, LG9/e;->a:I

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LG9/e;->b:Ljava/lang/Object;

    .line 41
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [J

    iput-object v0, p0, LG9/e;->c:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 42
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 43
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LX2/d;

    mul-int/lit8 v2, v0, 0x2

    .line 44
    iget-object v3, p0, LG9/e;->c:Ljava/lang/Object;

    check-cast v3, [J

    iget-wide v4, v1, LX2/d;->b:J

    aput-wide v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    .line 45
    iget-wide v4, v1, LX2/d;->c:J

    aput-wide v4, v3, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 46
    :cond_0
    iget-object p1, p0, LG9/e;->c:Ljava/lang/Object;

    check-cast p1, [J

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    iput-object p1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 47
    invoke-static {p1}, Ljava/util/Arrays;->sort([J)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Lcom/moloco/sdk/acm/recorder/c;)V
    .locals 1

    const/16 v0, 0x17

    iput v0, p0, LG9/e;->a:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, LG9/e;->b:Ljava/lang/Object;

    .line 15
    iput-object p2, p0, LG9/e;->c:Ljava/lang/Object;

    .line 16
    new-instance p1, LAf/q;

    const/16 p2, 0x15

    invoke-direct {p1, p0, p2}, LAf/q;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    move-result-object p1

    iput-object p1, p0, LG9/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Luc/r;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, LG9/e;->a:I

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 68
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LG9/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([LG5/m;)V
    .locals 5

    const/4 v0, 0x5

    iput v0, p0, LG9/e;->a:I

    .line 79
    new-instance v0, LG5/N;

    invoke-direct {v0}, LG5/N;-><init>()V

    new-instance v1, LG5/P;

    .line 80
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/high16 v2, 0x3f800000    # 1.0f

    .line 81
    iput v2, v1, LG5/P;->c:F

    .line 82
    iput v2, v1, LG5/P;->d:F

    .line 83
    sget-object v2, LG5/k;->e:LG5/k;

    iput-object v2, v1, LG5/P;->e:LG5/k;

    .line 84
    iput-object v2, v1, LG5/P;->f:LG5/k;

    .line 85
    iput-object v2, v1, LG5/P;->g:LG5/k;

    .line 86
    iput-object v2, v1, LG5/P;->h:LG5/k;

    .line 87
    sget-object v2, LG5/m;->a:Ljava/nio/ByteBuffer;

    iput-object v2, v1, LG5/P;->k:Ljava/nio/ByteBuffer;

    .line 88
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v3

    iput-object v3, v1, LG5/P;->l:Ljava/nio/ShortBuffer;

    .line 89
    iput-object v2, v1, LG5/P;->m:Ljava/nio/ByteBuffer;

    const/4 v2, -0x1

    .line 90
    iput v2, v1, LG5/P;->b:I

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    array-length v2, p1

    add-int/lit8 v2, v2, 0x2

    new-array v2, v2, [LG5/m;

    iput-object v2, p0, LG9/e;->b:Ljava/lang/Object;

    const/4 v3, 0x0

    .line 93
    array-length v4, p1

    invoke-static {p1, v3, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 94
    iput-object v0, p0, LG9/e;->c:Ljava/lang/Object;

    .line 95
    iput-object v1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 96
    array-length v3, p1

    aput-object v0, v2, v3

    .line 97
    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    aput-object v1, v2, p1

    return-void
.end method

.method public static C(Ljava/io/File;Ljava/io/File;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "AtomicFile"

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, "Failed to delete file which is a directory "

    .line 18
    .line 19
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v2, "Failed to rename "

    .line 41
    .line 42
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p0, " to "

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public static n(Ljava/lang/String;)V
    .locals 6

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "[Thread: "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v2, "][sbt] "

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v1, "ServerBidTokenCache"

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x4

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static/range {v0 .. v5}, Lcom/moloco/sdk/internal/MolocoLogger;->debugBuildLog$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static final r(LG9/e;)Ljava/net/URL;
    .locals 3

    .line 1
    new-instance v0, Landroid/net/Uri$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "https"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "spi"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "v2"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "platforms"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "android"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "gmp"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object p0, p0, LG9/e;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lea/b;

    .line 53
    .line 54
    iget-object v1, p0, Lea/b;->a:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, "settings"

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object p0, p0, Lea/b;->b:Lea/a;

    .line 67
    .line 68
    const-string v1, "build_version"

    .line 69
    .line 70
    iget-object v2, p0, Lea/a;->c:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v1, "display_version"

    .line 77
    .line 78
    iget-object p0, p0, Lea/a;->b:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1, p0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    new-instance v0, Ljava/net/URL;

    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-object v0
.end method


# virtual methods
.method public A(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v1, "adId"

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const-string p1, "eventName"

    .line 16
    .line 17
    const-string v1, "onAppEvent"

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    const-string p1, "name"

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const-string p1, "data"

    .line 28
    .line 29
    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, LG9/e;->w(Ljava/util/HashMap;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public B(ILad/P;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v1, "adId"

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const-string p1, "eventName"

    .line 16
    .line 17
    const-string v1, "onRewardedAdUserEarnedReward"

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    const-string p1, "rewardItem"

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, LG9/e;->w(Ljava/util/HashMap;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public D(LQ0/e;III)V
    .locals 3

    .line 1
    iget v0, p1, LQ0/d;->b0:I

    .line 2
    .line 3
    iget v1, p1, LQ0/d;->c0:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput v2, p1, LQ0/d;->b0:I

    .line 7
    .line 8
    iput v2, p1, LQ0/d;->c0:I

    .line 9
    .line 10
    invoke-virtual {p1, p3}, LQ0/d;->O(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p4}, LQ0/d;->L(I)V

    .line 14
    .line 15
    .line 16
    if-gez v0, :cond_0

    .line 17
    .line 18
    iput v2, p1, LQ0/d;->b0:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iput v0, p1, LQ0/d;->b0:I

    .line 22
    .line 23
    :goto_0
    if-gez v1, :cond_1

    .line 24
    .line 25
    iput v2, p1, LQ0/d;->c0:I

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    iput v1, p1, LQ0/d;->c0:I

    .line 29
    .line 30
    :goto_1
    iget-object p1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, LQ0/e;

    .line 33
    .line 34
    iput p2, p1, LQ0/e;->t0:I

    .line 35
    .line 36
    invoke-virtual {p1}, LQ0/e;->U()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public E()Ljava/io/FileOutputStream;
    .locals 5

    .line 1
    iget-object v0, p0, LG9/e;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/io/File;

    .line 4
    .line 5
    iget-object v1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/io/File;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, LG9/e;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ljava/io/File;

    .line 18
    .line 19
    invoke-static {v1, v2}, LG9/e;->C(Ljava/io/File;Ljava/io/File;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :catch_0
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    :try_start_1
    new-instance v1, Ljava/io/FileOutputStream;

    .line 39
    .line 40
    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    :catch_1
    move-exception v1

    .line 45
    new-instance v2, Ljava/io/IOException;

    .line 46
    .line 47
    new-instance v3, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v4, "Failed to create new file "

    .line 50
    .line 51
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-direct {v2, v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    throw v2

    .line 65
    :cond_1
    new-instance v1, Ljava/io/IOException;

    .line 66
    .line 67
    new-instance v2, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v3, "Failed to create directory for "

    .line 70
    .line 71
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v1
.end method

.method public F(Lad/i;I)V
    .locals 2

    .line 1
    iget-object v0, p0, LG9/e;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    const/4 v0, 0x1

    .line 30
    new-array v0, v0, [Ljava/lang/Object;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    aput-object p2, v0, v1

    .line 34
    .line 35
    const-string p2, "Ad for following adId already exists: %d"

    .line 36
    .line 37
    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
.end method

.method public G([F)V
    .locals 4

    .line 1
    iget-object v0, p0, LG9/e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lf0/c;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lf0/c;->e([F)[F

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, LG9/e;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, [F

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    aget v2, p1, v1

    .line 17
    .line 18
    aget v3, v0, v1

    .line 19
    .line 20
    mul-float/2addr v2, v3

    .line 21
    aput v2, p1, v1

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    aget v2, p1, v1

    .line 25
    .line 26
    aget v3, v0, v1

    .line 27
    .line 28
    mul-float/2addr v2, v3

    .line 29
    aput v2, p1, v1

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    aget v2, p1, v1

    .line 33
    .line 34
    aget v0, v0, v1

    .line 35
    .line 36
    mul-float/2addr v2, v0

    .line 37
    aput v2, p1, v1

    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, LG9/e;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lf0/c;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lf0/c;->a([F)[F

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public H()V
    .locals 4

    .line 1
    iget-object v0, p0, LG9/e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LW/d;

    .line 4
    .line 5
    iget-object v1, v0, LW/d;->b:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    iget-object v2, p0, LG9/e;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/lang/String;

    .line 10
    .line 11
    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/util/List;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v3, p0, LG9/e;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Lkotlin/jvm/internal/n;

    .line 22
    .line 23
    invoke-interface {v1, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    :cond_0
    if-eqz v1, :cond_1

    .line 27
    .line 28
    move-object v3, v1

    .line 29
    check-cast v3, Ljava/util/Collection;

    .line 30
    .line 31
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, LW/d;->b:Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public I(LQ0/e;)V
    .locals 9

    .line 1
    iget-object v0, p0, LG9/e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p1, LQ0/e;->q0:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    const/4 v4, 0x1

    .line 17
    if-ge v3, v1, :cond_2

    .line 18
    .line 19
    iget-object v5, p1, LQ0/e;->q0:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, LQ0/d;

    .line 26
    .line 27
    iget-object v6, v5, LQ0/d;->p0:[I

    .line 28
    .line 29
    aget v7, v6, v2

    .line 30
    .line 31
    const/4 v8, 0x3

    .line 32
    if-eq v7, v8, :cond_0

    .line 33
    .line 34
    aget v4, v6, v4

    .line 35
    .line 36
    if-ne v4, v8, :cond_1

    .line 37
    .line 38
    :cond_0
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    iget-object p1, p1, LQ0/e;->s0:LR0/e;

    .line 45
    .line 46
    iput-boolean v4, p1, LR0/e;->b:Z

    .line 47
    .line 48
    return-void
.end method

.method public a(J)I
    .locals 2

    .line 1
    iget-object v0, p0, LG9/e;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [J

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, p1, p2, v1}, LQ1/x;->a([JJZ)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    array-length p2, v0

    .line 11
    if-ge p1, p2, :cond_0

    .line 12
    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, -0x1

    .line 15
    return p1
.end method

.method public b(LQ1/u;Ls2/o;LT5/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG9/e;->c:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p3}, LT5/B;->a()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, LT5/B;->b()V

    .line 7
    .line 8
    .line 9
    iget p1, p3, LT5/B;->e:I

    .line 10
    .line 11
    const/4 p3, 0x5

    .line 12
    invoke-interface {p2, p1, p3}, Ls2/o;->m(II)Ls2/C;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p2, p0, LG9/e;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p2, LN1/n;

    .line 21
    .line 22
    invoke-interface {p1, p2}, Ls2/C;->c(LN1/n;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public c(Llf/c;)Ljava/lang/Enum;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lcom/moloco/sdk/internal/services/bidtoken/u;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/moloco/sdk/internal/services/bidtoken/u;

    .line 11
    .line 12
    iget v3, v2, Lcom/moloco/sdk/internal/services/bidtoken/u;->d:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/moloco/sdk/internal/services/bidtoken/u;->d:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/moloco/sdk/internal/services/bidtoken/u;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/moloco/sdk/internal/services/bidtoken/u;-><init>(LG9/e;Llf/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/moloco/sdk/internal/services/bidtoken/u;->b:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 32
    .line 33
    iget v4, v2, Lcom/moloco/sdk/internal/services/bidtoken/u;->d:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    const-string v6, "[Thread: "

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    if-ne v4, v5, :cond_1

    .line 41
    .line 42
    iget-object v2, v2, Lcom/moloco/sdk/internal/services/bidtoken/u;->a:LG9/e;

    .line 43
    .line 44
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v1

    .line 56
    :cond_2
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, v0, LG9/e;->d:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Lcom/moloco/sdk/internal/services/bidtoken/m;

    .line 62
    .line 63
    iget-object v1, v1, Lcom/moloco/sdk/internal/services/bidtoken/m;->a:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_3

    .line 70
    .line 71
    sget-object v7, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 72
    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v2, "] cached bidToken is empty, needs refresh"

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    const/4 v10, 0x0

    .line 99
    const/4 v11, 0x0

    .line 100
    const-string v8, "ServerBidTokenCache"

    .line 101
    .line 102
    const/16 v12, 0xc

    .line 103
    .line 104
    const/4 v13, 0x0

    .line 105
    invoke-static/range {v7 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object v1, Lcom/moloco/sdk/internal/services/bidtoken/b;->a:Lcom/moloco/sdk/internal/services/bidtoken/b;

    .line 109
    .line 110
    return-object v1

    .line 111
    :cond_3
    iget-object v1, v0, LG9/e;->d:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v1, Lcom/moloco/sdk/internal/services/bidtoken/m;

    .line 114
    .line 115
    iget-object v1, v1, Lcom/moloco/sdk/internal/services/bidtoken/m;->a:Ljava/lang/String;

    .line 116
    .line 117
    iput-object v0, v2, Lcom/moloco/sdk/internal/services/bidtoken/u;->a:LG9/e;

    .line 118
    .line 119
    iput v5, v2, Lcom/moloco/sdk/internal/services/bidtoken/u;->d:I

    .line 120
    .line 121
    sget-object v4, Lcom/moloco/sdk/internal/bidtoken/c;->a:LLf/d;

    .line 122
    .line 123
    new-instance v7, Lcom/moloco/sdk/internal/bidtoken/b;

    .line 124
    .line 125
    const/4 v8, 0x0

    .line 126
    invoke-direct {v7, v1, v8}, Lcom/moloco/sdk/internal/bidtoken/b;-><init>(Ljava/lang/String;Ljf/c;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v4, v7, v2}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    if-ne v1, v3, :cond_4

    .line 134
    .line 135
    return-object v3

    .line 136
    :cond_4
    move-object v2, v0

    .line 137
    :goto_1
    check-cast v1, Lcom/moloco/sdk/internal/A;

    .line 138
    .line 139
    instance-of v3, v1, Lcom/moloco/sdk/internal/y;

    .line 140
    .line 141
    if-eqz v3, :cond_5

    .line 142
    .line 143
    sget-object v7, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 144
    .line 145
    new-instance v1, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v2, "] Failed to parse cached token for expiration, needs refresh"

    .line 162
    .line 163
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    const/4 v10, 0x0

    .line 171
    const/4 v11, 0x0

    .line 172
    const-string v8, "ServerBidTokenCache"

    .line 173
    .line 174
    const/16 v12, 0xc

    .line 175
    .line 176
    const/4 v13, 0x0

    .line 177
    invoke-static/range {v7 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    sget-object v1, Lcom/moloco/sdk/internal/services/bidtoken/b;->a:Lcom/moloco/sdk/internal/services/bidtoken/b;

    .line 181
    .line 182
    return-object v1

    .line 183
    :cond_5
    instance-of v3, v1, Lcom/moloco/sdk/internal/z;

    .line 184
    .line 185
    if-eqz v3, :cond_9

    .line 186
    .line 187
    check-cast v1, Lcom/moloco/sdk/internal/z;

    .line 188
    .line 189
    iget-object v1, v1, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v1, Lcom/moloco/sdk/internal/bidtoken/a;

    .line 192
    .line 193
    iget-object v2, v2, LG9/e;->c:Ljava/lang/Object;

    .line 194
    .line 195
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 196
    .line 197
    .line 198
    move-result-wide v2

    .line 199
    invoke-static {v1, v2, v3}, LFe/b;->b(Lcom/moloco/sdk/internal/bidtoken/a;J)Z

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    if-eqz v4, :cond_6

    .line 204
    .line 205
    sget-object v7, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 206
    .line 207
    new-instance v1, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string v2, "] Bid token expired, needs refresh"

    .line 224
    .line 225
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    const/4 v10, 0x0

    .line 233
    const/4 v11, 0x0

    .line 234
    const-string v8, "ServerBidTokenCache"

    .line 235
    .line 236
    const/16 v12, 0xc

    .line 237
    .line 238
    const/4 v13, 0x0

    .line 239
    invoke-static/range {v7 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    sget-object v1, Lcom/moloco/sdk/internal/services/bidtoken/b;->a:Lcom/moloco/sdk/internal/services/bidtoken/b;

    .line 243
    .line 244
    return-object v1

    .line 245
    :cond_6
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 246
    .line 247
    iget-wide v7, v1, Lcom/moloco/sdk/internal/bidtoken/a;->a:J

    .line 248
    .line 249
    invoke-virtual {v4, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 250
    .line 251
    .line 252
    move-result-wide v7

    .line 253
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 254
    .line 255
    const-wide/16 v9, 0xf

    .line 256
    .line 257
    invoke-virtual {v4, v9, v10}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 258
    .line 259
    .line 260
    move-result-wide v9

    .line 261
    invoke-static {v1, v2, v3}, LFe/b;->b(Lcom/moloco/sdk/internal/bidtoken/a;J)Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    if-nez v1, :cond_7

    .line 266
    .line 267
    sub-long v11, v7, v2

    .line 268
    .line 269
    cmp-long v1, v11, v9

    .line 270
    .line 271
    if-gtz v1, :cond_7

    .line 272
    .line 273
    goto :goto_2

    .line 274
    :cond_7
    const/4 v5, 0x0

    .line 275
    :goto_2
    sget-object v11, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 276
    .line 277
    const-string v1, "[sbt] currentTimeInMillis: "

    .line 278
    .line 279
    const-string v4, ", expiryTimeMillis: "

    .line 280
    .line 281
    invoke-static {v2, v3, v1, v4}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    const-string v2, ", nearExpiryThresholdMillis: "

    .line 289
    .line 290
    const-string v3, ", expiring: "

    .line 291
    .line 292
    invoke-static {v1, v2, v9, v10, v3}, LVa/M6;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v13

    .line 302
    const/4 v15, 0x4

    .line 303
    const/16 v16, 0x0

    .line 304
    .line 305
    const-string v12, "ServerBidTokenCache"

    .line 306
    .line 307
    const/4 v14, 0x0

    .line 308
    invoke-static/range {v11 .. v16}, Lcom/moloco/sdk/internal/MolocoLogger;->debugBuildLog$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    if-eqz v5, :cond_8

    .line 312
    .line 313
    new-instance v1, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    const-string v2, "] Bid token is near expiry. It will expire soon"

    .line 330
    .line 331
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v13

    .line 338
    const/4 v14, 0x0

    .line 339
    const/4 v15, 0x0

    .line 340
    const-string v12, "ServerBidTokenCache"

    .line 341
    .line 342
    const/16 v16, 0xc

    .line 343
    .line 344
    const/16 v17, 0x0

    .line 345
    .line 346
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    sget-object v1, Lcom/moloco/sdk/internal/services/bidtoken/b;->b:Lcom/moloco/sdk/internal/services/bidtoken/b;

    .line 350
    .line 351
    return-object v1

    .line 352
    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 353
    .line 354
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    const-string v2, "] Bid token has not expired"

    .line 369
    .line 370
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v13

    .line 377
    const/4 v14, 0x0

    .line 378
    const/4 v15, 0x0

    .line 379
    const-string v12, "ServerBidTokenCache"

    .line 380
    .line 381
    const/16 v16, 0xc

    .line 382
    .line 383
    const/16 v17, 0x0

    .line 384
    .line 385
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    new-instance v1, Ljava/lang/StringBuilder;

    .line 389
    .line 390
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    const-string v2, "] Bid token doesn\'t need refresh"

    .line 405
    .line 406
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v13

    .line 413
    const-string v12, "ServerBidTokenCache"

    .line 414
    .line 415
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    sget-object v1, Lcom/moloco/sdk/internal/services/bidtoken/b;->c:Lcom/moloco/sdk/internal/services/bidtoken/b;

    .line 419
    .line 420
    return-object v1

    .line 421
    :cond_9
    new-instance v1, LE5/Q;

    .line 422
    .line 423
    const/16 v2, 0x9

    .line 424
    .line 425
    const/4 v3, 0x0

    .line 426
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 427
    .line 428
    .line 429
    throw v1
.end method

.method public d(Lcom/moloco/sdk/internal/services/bidtoken/m;Llf/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lcom/moloco/sdk/internal/services/bidtoken/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/moloco/sdk/internal/services/bidtoken/v;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/internal/services/bidtoken/v;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/moloco/sdk/internal/services/bidtoken/v;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/internal/services/bidtoken/v;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/moloco/sdk/internal/services/bidtoken/v;-><init>(LG9/e;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/moloco/sdk/internal/services/bidtoken/v;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/internal/services/bidtoken/v;->f:I

    .line 30
    .line 31
    sget-object v3, Lef/C;->a:Lef/C;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    const-string v7, "[Thread: "

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v6, :cond_2

    .line 41
    .line 42
    if-ne v2, v5, :cond_1

    .line 43
    .line 44
    iget-object p1, v0, Lcom/moloco/sdk/internal/services/bidtoken/v;->c:Lcom/moloco/sdk/internal/bidtoken/a;

    .line 45
    .line 46
    iget-object v1, v0, Lcom/moloco/sdk/internal/services/bidtoken/v;->b:Lcom/moloco/sdk/internal/services/bidtoken/m;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/moloco/sdk/internal/services/bidtoken/v;->a:LG9/e;

    .line 49
    .line 50
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_2
    iget-object p1, v0, Lcom/moloco/sdk/internal/services/bidtoken/v;->b:Lcom/moloco/sdk/internal/services/bidtoken/m;

    .line 64
    .line 65
    iget-object v2, v0, Lcom/moloco/sdk/internal/services/bidtoken/v;->a:LG9/e;

    .line 66
    .line 67
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    new-instance p2, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {p2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v2, "] Acquired lock, checking for new token expiry"

    .line 91
    .line 92
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-static {p2}, LG9/e;->n(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-object p2, p0, LG9/e;->d:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p2, Lcom/moloco/sdk/internal/services/bidtoken/m;

    .line 105
    .line 106
    iget-object p2, p2, Lcom/moloco/sdk/internal/services/bidtoken/m;->a:Ljava/lang/String;

    .line 107
    .line 108
    const-string v2, ""

    .line 109
    .line 110
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-eqz p2, :cond_4

    .line 115
    .line 116
    iput-object p1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 117
    .line 118
    new-instance p1, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {p1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string p2, "] Updated cache with new bidToken as existing token was empty"

    .line 135
    .line 136
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-static {p1}, LG9/e;->n(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return-object v3

    .line 147
    :cond_4
    iget-object p2, p1, Lcom/moloco/sdk/internal/services/bidtoken/m;->a:Ljava/lang/String;

    .line 148
    .line 149
    iput-object p0, v0, Lcom/moloco/sdk/internal/services/bidtoken/v;->a:LG9/e;

    .line 150
    .line 151
    iput-object p1, v0, Lcom/moloco/sdk/internal/services/bidtoken/v;->b:Lcom/moloco/sdk/internal/services/bidtoken/m;

    .line 152
    .line 153
    iput v6, v0, Lcom/moloco/sdk/internal/services/bidtoken/v;->f:I

    .line 154
    .line 155
    sget-object v2, Lcom/moloco/sdk/internal/bidtoken/c;->a:LLf/d;

    .line 156
    .line 157
    new-instance v6, Lcom/moloco/sdk/internal/bidtoken/b;

    .line 158
    .line 159
    invoke-direct {v6, p2, v4}, Lcom/moloco/sdk/internal/bidtoken/b;-><init>(Ljava/lang/String;Ljf/c;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v2, v6, v0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    if-ne p2, v1, :cond_5

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_5
    move-object v2, p0

    .line 170
    :goto_1
    check-cast p2, Lcom/moloco/sdk/internal/A;

    .line 171
    .line 172
    instance-of v6, p2, Lcom/moloco/sdk/internal/z;

    .line 173
    .line 174
    if-eqz v6, :cond_9

    .line 175
    .line 176
    check-cast p2, Lcom/moloco/sdk/internal/z;

    .line 177
    .line 178
    iget-object p2, p2, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast p2, Lcom/moloco/sdk/internal/bidtoken/a;

    .line 181
    .line 182
    iget-object v6, v2, LG9/e;->b:Ljava/lang/Object;

    .line 183
    .line 184
    iget-object v6, v2, LG9/e;->d:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v6, Lcom/moloco/sdk/internal/services/bidtoken/m;

    .line 187
    .line 188
    iget-object v6, v6, Lcom/moloco/sdk/internal/services/bidtoken/m;->a:Ljava/lang/String;

    .line 189
    .line 190
    iput-object v2, v0, Lcom/moloco/sdk/internal/services/bidtoken/v;->a:LG9/e;

    .line 191
    .line 192
    iput-object p1, v0, Lcom/moloco/sdk/internal/services/bidtoken/v;->b:Lcom/moloco/sdk/internal/services/bidtoken/m;

    .line 193
    .line 194
    iput-object p2, v0, Lcom/moloco/sdk/internal/services/bidtoken/v;->c:Lcom/moloco/sdk/internal/bidtoken/a;

    .line 195
    .line 196
    iput v5, v0, Lcom/moloco/sdk/internal/services/bidtoken/v;->f:I

    .line 197
    .line 198
    sget-object v5, Lcom/moloco/sdk/internal/bidtoken/c;->a:LLf/d;

    .line 199
    .line 200
    new-instance v8, Lcom/moloco/sdk/internal/bidtoken/b;

    .line 201
    .line 202
    invoke-direct {v8, v6, v4}, Lcom/moloco/sdk/internal/bidtoken/b;-><init>(Ljava/lang/String;Ljf/c;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v5, v8, v0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    if-ne v0, v1, :cond_6

    .line 210
    .line 211
    :goto_2
    return-object v1

    .line 212
    :cond_6
    move-object v1, p1

    .line 213
    move-object p1, p2

    .line 214
    move-object p2, v0

    .line 215
    move-object v0, v2

    .line 216
    :goto_3
    check-cast p2, Lcom/moloco/sdk/internal/A;

    .line 217
    .line 218
    instance-of v2, p2, Lcom/moloco/sdk/internal/z;

    .line 219
    .line 220
    if-eqz v2, :cond_8

    .line 221
    .line 222
    check-cast p2, Lcom/moloco/sdk/internal/z;

    .line 223
    .line 224
    iget-object p2, p2, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast p2, Lcom/moloco/sdk/internal/bidtoken/a;

    .line 227
    .line 228
    iget-wide v4, p1, Lcom/moloco/sdk/internal/bidtoken/a;->a:J

    .line 229
    .line 230
    iget-wide p1, p2, Lcom/moloco/sdk/internal/bidtoken/a;->a:J

    .line 231
    .line 232
    cmp-long p1, v4, p1

    .line 233
    .line 234
    if-lez p1, :cond_7

    .line 235
    .line 236
    iput-object v1, v0, LG9/e;->d:Ljava/lang/Object;

    .line 237
    .line 238
    new-instance p1, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    invoke-direct {p1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 244
    .line 245
    .line 246
    move-result-object p2

    .line 247
    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p2

    .line 251
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    const-string p2, "] Updated cache with new bidToken"

    .line 255
    .line 256
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-static {p1}, LG9/e;->n(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    return-object v3

    .line 267
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    invoke-direct {p1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    const-string p2, "] New token\'s expiration is not greater than the existing token\'s expiration. Cache not updated."

    .line 284
    .line 285
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-static {p1}, LG9/e;->n(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    return-object v3

    .line 299
    :cond_8
    iput-object v1, v0, LG9/e;->d:Ljava/lang/Object;

    .line 300
    .line 301
    new-instance p1, Ljava/lang/StringBuilder;

    .line 302
    .line 303
    invoke-direct {p1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 307
    .line 308
    .line 309
    move-result-object p2

    .line 310
    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p2

    .line 314
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    const-string p2, "] Current token parsing failed. Updated cache with new bidToken"

    .line 318
    .line 319
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    invoke-static {p1}, LG9/e;->n(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    return-object v3

    .line 330
    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    invoke-direct {p1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 336
    .line 337
    .line 338
    move-result-object p2

    .line 339
    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p2

    .line 343
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    const-string p2, "] New token parsing failed. Cache not updated."

    .line 347
    .line 348
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-static {p1}, LG9/e;->n(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    return-object v3
.end method

.method public e(LQ1/o;)V
    .locals 13

    .line 1
    iget-object v0, p0, LG9/e;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LQ1/u;

    .line 4
    .line 5
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget v0, LQ1/x;->a:I

    .line 9
    .line 10
    iget-object v0, p0, LG9/e;->c:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v1, v0

    .line 13
    check-cast v1, LQ1/u;

    .line 14
    .line 15
    monitor-enter v1

    .line 16
    :try_start_0
    iget-wide v2, v1, LQ1/u;->c:J

    .line 17
    .line 18
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long v0, v2, v4

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-wide v6, v1, LQ1/u;->b:J

    .line 28
    .line 29
    add-long/2addr v2, v6

    .line 30
    :goto_0
    move-wide v7, v2

    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    move-object p1, v0

    .line 34
    goto :goto_3

    .line 35
    :cond_0
    invoke-virtual {v1}, LQ1/u;->d()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    goto :goto_0

    .line 40
    :goto_1
    monitor-exit v1

    .line 41
    iget-object v0, p0, LG9/e;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, LQ1/u;

    .line 44
    .line 45
    invoke-virtual {v0}, LQ1/u;->e()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    cmp-long v2, v7, v4

    .line 50
    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    cmp-long v2, v0, v4

    .line 54
    .line 55
    if-nez v2, :cond_1

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    iget-object v2, p0, LG9/e;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, LN1/n;

    .line 61
    .line 62
    iget-wide v3, v2, LN1/n;->s:J

    .line 63
    .line 64
    cmp-long v3, v0, v3

    .line 65
    .line 66
    if-eqz v3, :cond_2

    .line 67
    .line 68
    invoke-virtual {v2}, LN1/n;->a()LN1/m;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iput-wide v0, v2, LN1/m;->r:J

    .line 73
    .line 74
    new-instance v0, LN1/n;

    .line 75
    .line 76
    invoke-direct {v0, v2}, LN1/n;-><init>(LN1/m;)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, LG9/e;->b:Ljava/lang/Object;

    .line 80
    .line 81
    iget-object v1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, Ls2/C;

    .line 84
    .line 85
    invoke-interface {v1, v0}, Ls2/C;->c(LN1/n;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-virtual {p1}, LQ1/o;->a()I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    iget-object v0, p0, LG9/e;->d:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Ls2/C;

    .line 95
    .line 96
    invoke-interface {v0, v10, p1}, Ls2/C;->e(ILQ1/o;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v6, p1

    .line 102
    check-cast v6, Ls2/C;

    .line 103
    .line 104
    const/4 v12, 0x0

    .line 105
    const/4 v9, 0x1

    .line 106
    const/4 v11, 0x0

    .line 107
    invoke-interface/range {v6 .. v12}, Ls2/C;->a(JIIILs2/B;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    :goto_2
    return-void

    .line 111
    :goto_3
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    throw p1
.end method

.method public f(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    iget-object v0, p0, LG9/e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LC4/i;

    .line 4
    .line 5
    iget-object v0, v0, LC4/i;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LL4/t;

    .line 8
    .line 9
    invoke-virtual {v0}, LL4/t;->reset()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {v0, v1, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public g(J)Ljava/util/List;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v3

    .line 15
    :goto_0
    iget-object v5, v0, LG9/e;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v5, Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    if-ge v4, v6, :cond_2

    .line 24
    .line 25
    mul-int/lit8 v6, v4, 0x2

    .line 26
    .line 27
    iget-object v7, v0, LG9/e;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v7, [J

    .line 30
    .line 31
    aget-wide v8, v7, v6

    .line 32
    .line 33
    cmp-long v8, v8, p1

    .line 34
    .line 35
    if-gtz v8, :cond_1

    .line 36
    .line 37
    add-int/lit8 v6, v6, 0x1

    .line 38
    .line 39
    aget-wide v6, v7, v6

    .line 40
    .line 41
    cmp-long v6, p1, v6

    .line 42
    .line 43
    if-gez v6, :cond_1

    .line 44
    .line 45
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    check-cast v5, LX2/d;

    .line 50
    .line 51
    iget-object v6, v5, LX2/d;->a:LP1/b;

    .line 52
    .line 53
    iget v7, v6, LP1/b;->e:F

    .line 54
    .line 55
    const v8, -0x800001

    .line 56
    .line 57
    .line 58
    cmpl-float v7, v7, v8

    .line 59
    .line 60
    if-nez v7, :cond_0

    .line 61
    .line 62
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    new-instance v4, LA0/f;

    .line 73
    .line 74
    const/16 v5, 0x8

    .line 75
    .line 76
    invoke-direct {v4, v5}, LA0/f;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-static {v2, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 80
    .line 81
    .line 82
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-ge v3, v4, :cond_3

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    check-cast v4, LX2/d;

    .line 93
    .line 94
    iget-object v4, v4, LX2/d;->a:LP1/b;

    .line 95
    .line 96
    rsub-int/lit8 v5, v3, -0x1

    .line 97
    .line 98
    int-to-float v11, v5

    .line 99
    new-instance v6, LP1/b;

    .line 100
    .line 101
    iget v5, v4, LP1/b;->p:I

    .line 102
    .line 103
    iget v7, v4, LP1/b;->q:F

    .line 104
    .line 105
    move/from16 v23, v7

    .line 106
    .line 107
    iget-object v7, v4, LP1/b;->a:Ljava/lang/CharSequence;

    .line 108
    .line 109
    iget-object v8, v4, LP1/b;->b:Landroid/text/Layout$Alignment;

    .line 110
    .line 111
    iget-object v9, v4, LP1/b;->c:Landroid/text/Layout$Alignment;

    .line 112
    .line 113
    iget-object v10, v4, LP1/b;->d:Landroid/graphics/Bitmap;

    .line 114
    .line 115
    iget v13, v4, LP1/b;->g:I

    .line 116
    .line 117
    iget v14, v4, LP1/b;->h:F

    .line 118
    .line 119
    iget v15, v4, LP1/b;->i:I

    .line 120
    .line 121
    iget v12, v4, LP1/b;->n:I

    .line 122
    .line 123
    iget v0, v4, LP1/b;->o:F

    .line 124
    .line 125
    move/from16 v17, v0

    .line 126
    .line 127
    iget v0, v4, LP1/b;->j:F

    .line 128
    .line 129
    move/from16 v18, v0

    .line 130
    .line 131
    iget v0, v4, LP1/b;->k:F

    .line 132
    .line 133
    move/from16 v19, v0

    .line 134
    .line 135
    iget-boolean v0, v4, LP1/b;->l:Z

    .line 136
    .line 137
    iget v4, v4, LP1/b;->m:I

    .line 138
    .line 139
    move/from16 v20, v0

    .line 140
    .line 141
    move/from16 v21, v4

    .line 142
    .line 143
    move/from16 v22, v5

    .line 144
    .line 145
    move/from16 v16, v12

    .line 146
    .line 147
    const/4 v12, 0x1

    .line 148
    invoke-direct/range {v6 .. v23}, LP1/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    add-int/lit8 v3, v3, 0x1

    .line 155
    .line 156
    move-object/from16 v0, p0

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_3
    return-object v1
.end method

.method public h()V
    .locals 2

    .line 1
    iget-object v0, p0, LG9/e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LC4/i;

    .line 4
    .line 5
    iget-object v0, v0, LC4/i;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LL4/t;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v1, v0, LL4/t;->a:[B

    .line 11
    .line 12
    array-length v1, v1

    .line 13
    iput v1, v0, LL4/t;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw v1
.end method

.method public i()I
    .locals 3

    .line 1
    iget-object v0, p0, LG9/e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LC4/i;

    .line 4
    .line 5
    iget-object v0, v0, LC4/i;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LL4/t;

    .line 8
    .line 9
    invoke-virtual {v0}, LL4/t;->reset()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    iget-object v2, p0, LG9/e;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, LF4/f;

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Lka/e0;->r(LF4/f;Ljava/io/InputStream;Ljava/util/ArrayList;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0
.end method

.method public j(Llf/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, Lcom/moloco/sdk/acm/eventprocessing/f;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/moloco/sdk/acm/eventprocessing/f;

    .line 11
    .line 12
    iget v3, v2, Lcom/moloco/sdk/acm/eventprocessing/f;->d:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/moloco/sdk/acm/eventprocessing/f;->d:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/moloco/sdk/acm/eventprocessing/f;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lcom/moloco/sdk/acm/eventprocessing/f;-><init>(LG9/e;Llf/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lcom/moloco/sdk/acm/eventprocessing/f;->b:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 32
    .line 33
    iget v4, v2, Lcom/moloco/sdk/acm/eventprocessing/f;->d:I

    .line 34
    .line 35
    const-string v5, "RequestAndPurgeDB"

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x2

    .line 39
    const/4 v8, 0x1

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    if-eq v4, v8, :cond_2

    .line 43
    .line 44
    if-ne v4, v7, :cond_1

    .line 45
    .line 46
    iget-object v2, v2, Lcom/moloco/sdk/acm/eventprocessing/f;->a:LG9/e;

    .line 47
    .line 48
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    check-cast v0, Lef/n;

    .line 52
    .line 53
    iget-object v0, v0, Lef/n;->a:Ljava/lang/Object;

    .line 54
    .line 55
    goto/16 :goto_8

    .line 56
    .line 57
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_2
    iget-object v4, v2, Lcom/moloco/sdk/acm/eventprocessing/f;->a:LG9/e;

    .line 66
    .line 67
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_5

    .line 71
    .line 72
    :cond_3
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iput-object v1, v2, Lcom/moloco/sdk/acm/eventprocessing/f;->a:LG9/e;

    .line 76
    .line 77
    iput v8, v2, Lcom/moloco/sdk/acm/eventprocessing/f;->d:I

    .line 78
    .line 79
    iget-object v0, v1, LG9/e;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Lcom/moloco/sdk/acm/db/e;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v4, LAf/r;

    .line 87
    .line 88
    const/16 v9, 0xf

    .line 89
    .line 90
    invoke-direct {v4, v0, v9}, LAf/r;-><init>(Ljava/lang/Object;I)V

    .line 91
    .line 92
    .line 93
    new-instance v14, Lk3/o;

    .line 94
    .line 95
    iget-object v13, v0, Lcom/moloco/sdk/acm/db/e;->a:Lcom/moloco/sdk/acm/db/MetricsDb_Impl;

    .line 96
    .line 97
    invoke-direct {v14, v13, v4, v6}, Lk3/o;-><init>(Lcom/moloco/sdk/acm/db/MetricsDb_Impl;LAf/r;Ljf/c;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v2}, Ljf/c;->getContext()Ljf/h;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    sget-object v4, Lk3/s;->c:Lab/b;

    .line 105
    .line 106
    invoke-interface {v0, v4}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Lk3/s;

    .line 111
    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    iget-object v0, v0, Lk3/s;->a:Ljf/e;

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_4
    move-object v0, v6

    .line 118
    :goto_1
    if-eqz v0, :cond_5

    .line 119
    .line 120
    invoke-static {v0, v14, v2}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    goto :goto_4

    .line 125
    :cond_5
    invoke-interface {v2}, Ljf/c;->getContext()Ljf/h;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    new-instance v12, LEf/n;

    .line 130
    .line 131
    invoke-static {v2}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-direct {v12, v8, v0}, LEf/n;-><init>(ILjf/c;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12}, LEf/n;->t()V

    .line 139
    .line 140
    .line 141
    :try_start_0
    iget-object v0, v13, Lk3/m;->c:LT3/m;

    .line 142
    .line 143
    if-eqz v0, :cond_6

    .line 144
    .line 145
    new-instance v10, LA7/W0;

    .line 146
    .line 147
    const/16 v15, 0x13

    .line 148
    .line 149
    const/16 v16, 0x0

    .line 150
    .line 151
    invoke-direct/range {v10 .. v16}, LA7/W0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v10}, LT3/m;->execute(Ljava/lang/Runnable;)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :catch_0
    move-exception v0

    .line 159
    goto :goto_2

    .line 160
    :cond_6
    const-string v0, "internalTransactionExecutor"

    .line 161
    .line 162
    invoke-static {v0}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw v6
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    :goto_2
    new-instance v4, Ljava/lang/IllegalStateException;

    .line 167
    .line 168
    const-string v9, "Unable to acquire a thread to perform the database transaction."

    .line 169
    .line 170
    invoke-direct {v4, v9, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12, v4}, LEf/n;->a(Ljava/lang/Throwable;)Z

    .line 174
    .line 175
    .line 176
    :goto_3
    invoke-virtual {v12}, LEf/n;->s()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    sget-object v4, Lkf/a;->a:Lkf/a;

    .line 181
    .line 182
    :goto_4
    if-ne v0, v3, :cond_7

    .line 183
    .line 184
    goto/16 :goto_7

    .line 185
    .line 186
    :cond_7
    move-object v4, v1

    .line 187
    :goto_5
    check-cast v0, Ljava/util/List;

    .line 188
    .line 189
    sget-object v9, Lcom/moloco/sdk/acm/services/e;->a:LKd/a;

    .line 190
    .line 191
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    new-instance v9, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 200
    .line 201
    .line 202
    move-result v10

    .line 203
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    const-string v10, " events processed."

    .line 207
    .line 208
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    invoke-static {v5, v9}, Lcom/moloco/sdk/acm/services/e;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    new-instance v9, Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 221
    .line 222
    .line 223
    new-instance v10, Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v11

    .line 236
    if-eqz v11, :cond_d

    .line 237
    .line 238
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v11

    .line 242
    check-cast v11, Lcom/moloco/sdk/acm/db/a;

    .line 243
    .line 244
    const-string v12, "eventEntity"

    .line 245
    .line 246
    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 250
    .line 251
    .line 252
    move-result-wide v12

    .line 253
    iget-wide v14, v11, Lcom/moloco/sdk/acm/db/a;->c:J

    .line 254
    .line 255
    sub-long/2addr v12, v14

    .line 256
    const/16 v14, 0x3e8

    .line 257
    .line 258
    int-to-long v14, v14

    .line 259
    const-wide/16 v16, 0x2d0

    .line 260
    .line 261
    mul-long v16, v16, v14

    .line 262
    .line 263
    cmp-long v12, v12, v16

    .line 264
    .line 265
    if-ltz v12, :cond_8

    .line 266
    .line 267
    goto :goto_6

    .line 268
    :cond_8
    sget-object v12, Lcom/moloco/sdk/acm/eventprocessing/b;->a:[I

    .line 269
    .line 270
    iget-object v13, v11, Lcom/moloco/sdk/acm/db/a;->d:Lcom/moloco/sdk/acm/db/b;

    .line 271
    .line 272
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 273
    .line 274
    .line 275
    move-result v13

    .line 276
    aget v12, v12, v13

    .line 277
    .line 278
    const-string v13, "build(...)"

    .line 279
    .line 280
    iget-object v14, v11, Lcom/moloco/sdk/acm/db/a;->e:Ljava/lang/Long;

    .line 281
    .line 282
    iget-object v15, v11, Lcom/moloco/sdk/acm/db/a;->f:Ljava/util/List;

    .line 283
    .line 284
    iget-object v11, v11, Lcom/moloco/sdk/acm/db/a;->b:Ljava/lang/String;

    .line 285
    .line 286
    if-eq v12, v8, :cond_b

    .line 287
    .line 288
    if-ne v12, v7, :cond_a

    .line 289
    .line 290
    invoke-static {}, Lcom/moloco/sdk/Q0;->e()Lcom/moloco/sdk/P0;

    .line 291
    .line 292
    .line 293
    move-result-object v12

    .line 294
    invoke-virtual {v12, v11}, Lcom/moloco/sdk/P0;->c(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    check-cast v15, Ljava/util/List;

    .line 298
    .line 299
    invoke-virtual {v12, v15}, Lcom/moloco/sdk/P0;->a(Ljava/util/List;)V

    .line 300
    .line 301
    .line 302
    if-eqz v14, :cond_9

    .line 303
    .line 304
    invoke-virtual {v14}, Ljava/lang/Number;->longValue()J

    .line 305
    .line 306
    .line 307
    move-result-wide v14

    .line 308
    invoke-virtual {v12, v14, v15}, Lcom/moloco/sdk/P0;->b(J)V

    .line 309
    .line 310
    .line 311
    :cond_9
    invoke-virtual {v12}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 312
    .line 313
    .line 314
    move-result-object v11

    .line 315
    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    goto :goto_6

    .line 322
    :cond_a
    new-instance v0, LE5/Q;

    .line 323
    .line 324
    const/16 v2, 0x9

    .line 325
    .line 326
    const/4 v3, 0x0

    .line 327
    invoke-direct {v0, v3, v2}, LE5/Q;-><init>(BI)V

    .line 328
    .line 329
    .line 330
    throw v0

    .line 331
    :cond_b
    invoke-static {}, Lcom/moloco/sdk/O0;->e()Lcom/moloco/sdk/N0;

    .line 332
    .line 333
    .line 334
    move-result-object v12

    .line 335
    invoke-virtual {v12, v11}, Lcom/moloco/sdk/N0;->c(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    check-cast v15, Ljava/util/List;

    .line 339
    .line 340
    invoke-virtual {v12, v15}, Lcom/moloco/sdk/N0;->a(Ljava/util/List;)V

    .line 341
    .line 342
    .line 343
    if-eqz v14, :cond_c

    .line 344
    .line 345
    invoke-virtual {v14}, Ljava/lang/Number;->longValue()J

    .line 346
    .line 347
    .line 348
    move-result-wide v14

    .line 349
    long-to-int v11, v14

    .line 350
    invoke-virtual {v12, v11}, Lcom/moloco/sdk/N0;->b(I)V

    .line 351
    .line 352
    .line 353
    :cond_c
    invoke-virtual {v12}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 354
    .line 355
    .line 356
    move-result-object v11

    .line 357
    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    goto/16 :goto_6

    .line 364
    .line 365
    :cond_d
    new-instance v0, Lcom/moloco/sdk/acm/http/d;

    .line 366
    .line 367
    invoke-direct {v0, v10, v9}, Lcom/moloco/sdk/acm/http/d;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 371
    .line 372
    .line 373
    move-result v8

    .line 374
    if-eqz v8, :cond_e

    .line 375
    .line 376
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 377
    .line 378
    .line 379
    move-result v8

    .line 380
    if-eqz v8, :cond_e

    .line 381
    .line 382
    const-string v0, "No metrics to process"

    .line 383
    .line 384
    return-object v0

    .line 385
    :cond_e
    iput-object v4, v2, Lcom/moloco/sdk/acm/eventprocessing/f;->a:LG9/e;

    .line 386
    .line 387
    iput v7, v2, Lcom/moloco/sdk/acm/eventprocessing/f;->d:I

    .line 388
    .line 389
    iget-object v7, v4, LG9/e;->b:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v7, Lcom/moloco/sdk/acm/http/g;

    .line 392
    .line 393
    iget-object v8, v4, LG9/e;->d:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v8, Lcom/moloco/sdk/acm/http/a;

    .line 396
    .line 397
    invoke-virtual {v7, v0, v8, v2}, Lcom/moloco/sdk/acm/http/g;->b(Lcom/moloco/sdk/acm/http/d;Lcom/moloco/sdk/acm/http/a;Llf/c;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    if-ne v0, v3, :cond_f

    .line 402
    .line 403
    :goto_7
    return-object v3

    .line 404
    :cond_f
    move-object v2, v4

    .line 405
    :goto_8
    instance-of v3, v0, Lef/m;

    .line 406
    .line 407
    if-nez v3, :cond_10

    .line 408
    .line 409
    move-object v3, v0

    .line 410
    check-cast v3, Ljava/lang/String;

    .line 411
    .line 412
    sget-object v3, Lcom/moloco/sdk/acm/services/e;->a:LKd/a;

    .line 413
    .line 414
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    const-string v3, "Request Success"

    .line 418
    .line 419
    invoke-static {v5, v3}, Lcom/moloco/sdk/acm/services/e;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    :cond_10
    invoke-static {v0}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    if-eqz v3, :cond_11

    .line 427
    .line 428
    sget-object v4, Lcom/moloco/sdk/acm/services/e;->a:LKd/a;

    .line 429
    .line 430
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    new-instance v2, Ljava/lang/StringBuilder;

    .line 434
    .line 435
    const-string v4, "Request failure: "

    .line 436
    .line 437
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    const/16 v3, 0xc

    .line 452
    .line 453
    invoke-static {v3, v6, v5, v2}, Lcom/moloco/sdk/acm/services/e;->b(ILjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    :cond_11
    return-object v0
.end method

.method public k(I)J
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    move v2, v1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v0

    .line 8
    :goto_0
    invoke-static {v2}, LQ1/k;->c(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, LG9/e;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, [J

    .line 14
    .line 15
    array-length v3, v2

    .line 16
    if-ge p1, v3, :cond_1

    .line 17
    .line 18
    move v0, v1

    .line 19
    :cond_1
    invoke-static {v0}, LQ1/k;->c(Z)V

    .line 20
    .line 21
    .line 22
    aget-wide v0, v2, p1

    .line 23
    .line 24
    return-wide v0
.end method

.method public l()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 3

    .line 1
    iget-object v0, p0, LG9/e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LC4/i;

    .line 4
    .line 5
    iget-object v0, v0, LC4/i;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LL4/t;

    .line 8
    .line 9
    invoke-virtual {v0}, LL4/t;->reset()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    iget-object v2, p0, LG9/e;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, LF4/f;

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Lka/e0;->t(LF4/f;Ljava/io/InputStream;Ljava/util/ArrayList;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public m(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/concurrent/CountDownLatch;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "_ae"

    .line 9
    .line 10
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method

.method public o()V
    .locals 3

    .line 1
    iget-object v0, p0, LG9/e;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LTa/a;

    .line 10
    .line 11
    iput-object v0, p0, LG9/e;->d:Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, LG9/e;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    new-array v2, v2, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, v0, LG9/e;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, LJ8/v;

    .line 10
    .line 11
    if-nez v1, :cond_3

    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v3, "Error while validating application identity: "

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-static {v3, v4}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    :cond_0
    const-string v4, "FirebaseAuth"

    .line 30
    .line 31
    invoke-static {v4, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    instance-of v3, v1, LJ8/k;

    .line 37
    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    instance-of v3, v1, LJ8/j;

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    move-object v3, v1

    .line 45
    check-cast v3, LJ8/j;

    .line 46
    .line 47
    const-string v5, "UNAUTHORIZED_DOMAIN"

    .line 48
    .line 49
    iget-object v3, v3, LJ8/j;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v3, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    :cond_1
    check-cast v1, Ls8/j;

    .line 58
    .line 59
    iget-object v3, v0, LG9/e;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v1, v2, v3}, Lcom/google/firebase/auth/FirebaseAuth;->m(Ls8/j;LJ8/v;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    const-string v1, "Proceeding without any application identifier."

    .line 68
    .line 69
    invoke-static {v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    move-object v13, v1

    .line 74
    move-object v14, v13

    .line 75
    goto :goto_0

    .line 76
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, LK8/K;

    .line 81
    .line 82
    iget-object v1, v1, LK8/K;->a:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, LK8/K;

    .line 89
    .line 90
    iget-object v3, v3, LK8/K;->b:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    check-cast v4, LK8/K;

    .line 97
    .line 98
    iget-object v4, v4, LK8/K;->c:Ljava/lang/String;

    .line 99
    .line 100
    move-object v13, v1

    .line 101
    move-object v14, v3

    .line 102
    move-object v1, v4

    .line 103
    :goto_0
    iget-object v3, v2, LJ8/v;->b:Ljava/lang/Long;

    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 106
    .line 107
    .line 108
    move-result-wide v9

    .line 109
    iget-object v3, v2, LJ8/v;->e:Ljava/lang/String;

    .line 110
    .line 111
    iget-object v4, v2, LJ8/v;->c:LPc/T;

    .line 112
    .line 113
    iget-object v5, v0, LG9/e;->d:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v5, Lcom/google/firebase/auth/FirebaseAuth;

    .line 116
    .line 117
    iget-object v6, v5, Lcom/google/firebase/auth/FirebaseAuth;->g:LK8/f;

    .line 118
    .line 119
    iget-object v7, v6, LK8/f;->c:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v7, Ljava/lang/String;

    .line 122
    .line 123
    if-eqz v7, :cond_4

    .line 124
    .line 125
    iget-object v6, v6, LK8/f;->d:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v6, Ljava/lang/String;

    .line 128
    .line 129
    if-eqz v6, :cond_4

    .line 130
    .line 131
    if-eqz v3, :cond_4

    .line 132
    .line 133
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_4

    .line 138
    .line 139
    new-instance v3, LJ8/K;

    .line 140
    .line 141
    invoke-direct {v3, v5, v4}, LJ8/K;-><init>(Lcom/google/firebase/auth/FirebaseAuth;LPc/T;)V

    .line 142
    .line 143
    .line 144
    move-object v4, v3

    .line 145
    :cond_4
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_6

    .line 150
    .line 151
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    check-cast v3, LK8/K;

    .line 156
    .line 157
    iget-boolean v6, v2, LJ8/v;->j:Z

    .line 158
    .line 159
    if-eqz v6, :cond_5

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_5
    new-instance v6, LJ8/J;

    .line 163
    .line 164
    invoke-direct {v6, v5, v2, v3, v4}, LJ8/J;-><init>(Lcom/google/firebase/auth/FirebaseAuth;LJ8/v;LK8/K;LJ8/x;)V

    .line 165
    .line 166
    .line 167
    move-object v4, v6

    .line 168
    :cond_6
    :goto_1
    move-object/from16 v17, v4

    .line 169
    .line 170
    iget-object v6, v2, LJ8/v;->h:LK8/j;

    .line 171
    .line 172
    invoke-static {v6}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzag;->zzc(Ljava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_7

    .line 180
    .line 181
    invoke-virtual {v5}, Lcom/google/firebase/auth/FirebaseAuth;->n()LC6/l;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    if-eqz v3, :cond_7

    .line 186
    .line 187
    invoke-virtual {v5}, Lcom/google/firebase/auth/FirebaseAuth;->n()LC6/l;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-virtual {v3}, LC6/l;->I()Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-eqz v3, :cond_7

    .line 196
    .line 197
    const-string v1, "NO_RECAPTCHA"

    .line 198
    .line 199
    :cond_7
    move-object v15, v1

    .line 200
    iget-object v1, v6, LK8/j;->a:Ljava/lang/String;

    .line 201
    .line 202
    const/4 v3, 0x0

    .line 203
    const/4 v4, 0x1

    .line 204
    if-eqz v1, :cond_8

    .line 205
    .line 206
    move v1, v4

    .line 207
    goto :goto_2

    .line 208
    :cond_8
    move v1, v3

    .line 209
    :goto_2
    if-eqz v1, :cond_a

    .line 210
    .line 211
    iget-object v7, v2, LJ8/v;->e:Ljava/lang/String;

    .line 212
    .line 213
    invoke-static {v7}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    iget-object v8, v5, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    .line 217
    .line 218
    iget-object v1, v2, LJ8/v;->g:LJ8/w;

    .line 219
    .line 220
    if-eqz v1, :cond_9

    .line 221
    .line 222
    move v11, v4

    .line 223
    goto :goto_3

    .line 224
    :cond_9
    move v11, v3

    .line 225
    :goto_3
    invoke-virtual {v5}, Lcom/google/firebase/auth/FirebaseAuth;->r()Z

    .line 226
    .line 227
    .line 228
    move-result v16

    .line 229
    iget-object v1, v2, LJ8/v;->d:Ljava/util/concurrent/Executor;

    .line 230
    .line 231
    iget-object v2, v2, LJ8/v;->f:Landroid/app/Activity;

    .line 232
    .line 233
    const/4 v12, 0x0

    .line 234
    iget-object v5, v5, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 235
    .line 236
    move-object/from16 v18, v1

    .line 237
    .line 238
    move-object/from16 v19, v2

    .line 239
    .line 240
    invoke-virtual/range {v5 .. v19}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(LK8/j;Ljava/lang/String;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLJ8/x;Ljava/util/concurrent/Executor;Landroid/app/Activity;)Lcom/google/android/gms/tasks/Task;

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :cond_a
    iget-object v7, v2, LJ8/v;->i:LJ8/z;

    .line 245
    .line 246
    invoke-static {v7}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    iget-object v8, v5, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    .line 250
    .line 251
    iget-object v1, v2, LJ8/v;->g:LJ8/w;

    .line 252
    .line 253
    if-eqz v1, :cond_b

    .line 254
    .line 255
    move v11, v4

    .line 256
    goto :goto_4

    .line 257
    :cond_b
    move v11, v3

    .line 258
    :goto_4
    invoke-virtual {v5}, Lcom/google/firebase/auth/FirebaseAuth;->r()Z

    .line 259
    .line 260
    .line 261
    move-result v16

    .line 262
    iget-object v1, v2, LJ8/v;->d:Ljava/util/concurrent/Executor;

    .line 263
    .line 264
    iget-object v2, v2, LJ8/v;->f:Landroid/app/Activity;

    .line 265
    .line 266
    const/4 v12, 0x0

    .line 267
    iget-object v5, v5, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 268
    .line 269
    move-object/from16 v18, v1

    .line 270
    .line 271
    move-object/from16 v19, v2

    .line 272
    .line 273
    invoke-virtual/range {v5 .. v19}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(LK8/j;LJ8/z;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLJ8/x;Ljava/util/concurrent/Executor;Landroid/app/Activity;)Lcom/google/android/gms/tasks/Task;

    .line 274
    .line 275
    .line 276
    return-void
.end method

.method public p()I
    .locals 1

    .line 1
    iget-object v0, p0, LG9/e;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [J

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    return v0
.end method

.method public q(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    const-string v0, "Logging event _ae to Firebase Analytics with params "

    .line 2
    .line 3
    iget-object v1, p0, LG9/e;->c:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    sget-object v2, LO8/c;->a:LO8/c;

    .line 7
    .line 8
    new-instance v3, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v2, v0}, LO8/c;->f(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    invoke-direct {v0, v3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, LG9/e;->d:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v0, p0, LG9/e;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, LS3/l;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, LS3/l;->q(Landroid/os/Bundle;)V

    .line 36
    .line 37
    .line 38
    const-string p1, "Awaiting app exception callback from Analytics..."

    .line 39
    .line 40
    invoke-virtual {v2, p1}, LO8/c;->f(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    :try_start_1
    iget-object v0, p0, LG9/e;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Ljava/util/concurrent/CountDownLatch;

    .line 47
    .line 48
    const/16 v3, 0x1f4

    .line 49
    .line 50
    int-to-long v3, v3

    .line 51
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 52
    .line 53
    invoke-virtual {v0, v3, v4, v5}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    const-string v0, "App exception callback received from Analytics listener."

    .line 60
    .line 61
    invoke-virtual {v2, v0}, LO8/c;->f(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    const-string v0, "Timeout exceeded while awaiting app exception callback from Analytics listener."

    .line 68
    .line 69
    invoke-virtual {v2, v0, p1}, LO8/c;->g(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catch_0
    :try_start_2
    const-string v0, "Interrupted while awaiting app exception callback from Analytics listener."

    .line 74
    .line 75
    const-string v2, "FirebaseCrashlytics"

    .line 76
    .line 77
    invoke-static {v2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 78
    .line 79
    .line 80
    :goto_0
    iput-object p1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 81
    .line 82
    monitor-exit v1

    .line 83
    return-void

    .line 84
    :goto_1
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    throw p1
.end method

.method public s(Ljava/io/FileOutputStream;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :catch_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    const-string v1, "AtomicFile"

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string v0, "Failed to sync file output stream"

    .line 19
    .line 20
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catch_1
    move-exception p1

    .line 28
    const-string v0, "Failed to close file output stream"

    .line 29
    .line 30
    invoke-static {v1, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 31
    .line 32
    .line 33
    :goto_1
    iget-object p1, p0, LG9/e;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/io/File;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v2, "Failed to delete new file "

    .line 46
    .line 47
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    :cond_2
    :goto_2
    return-void
.end method

.method public t(Ljava/lang/String;ILjava/io/IOException;[BLjava/util/Map;)V
    .locals 7

    .line 1
    iget-object p1, p0, LG9/e;->c:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v6, p1

    .line 4
    check-cast v6, Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object p1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, LA7/L1;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iget-object p1, p0, LG9/e;->b:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v5, p1

    .line 15
    check-cast v5, Ljava/lang/String;

    .line 16
    .line 17
    move v2, p2

    .line 18
    move-object v3, p3

    .line 19
    move-object v4, p4

    .line 20
    invoke-virtual/range {v0 .. v6}, LA7/L1;->w(ZILjava/io/IOException;[BLjava/lang/String;Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, LG9/e;->a:I

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
    const-string v1, "DartCallback( bundle path: "

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LG9/e;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ", library path: "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, LG9/e;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lio/flutter/view/FlutterCallbackInformation;

    .line 33
    .line 34
    iget-object v2, v1, Lio/flutter/view/FlutterCallbackInformation;->callbackLibraryPath:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v2, ", function: "

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-object v1, v1, Lio/flutter/view/FlutterCallbackInformation;->callbackName:Ljava/lang/String;

    .line 45
    .line 46
    const-string v2, " )"

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :sswitch_1
    iget-object v0, p0, LG9/e;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lbe/a;

    .line 56
    .line 57
    iget-object v1, v0, Lbe/a;->a:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v2, p0, LG9/e;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Ljava/lang/String;

    .line 62
    .line 63
    if-nez v2, :cond_0

    .line 64
    .line 65
    const-string v2, ""

    .line 66
    .line 67
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v4, "NoCodesError: {code="

    .line 70
    .line 71
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v0, ", description="

    .line 78
    .line 79
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v0, ", details="

    .line 86
    .line 87
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0

    .line 98
    nop

    .line 99
    :sswitch_data_0
    .sparse-switch
        0x14 -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method

.method public u(Ljava/io/FileOutputStream;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :catch_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    const-string v1, "AtomicFile"

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string v0, "Failed to sync file output stream"

    .line 19
    .line 20
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catch_1
    move-exception p1

    .line 28
    const-string v0, "Failed to close file output stream"

    .line 29
    .line 30
    invoke-static {v1, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 31
    .line 32
    .line 33
    :goto_1
    iget-object p1, p0, LG9/e;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/io/File;

    .line 36
    .line 37
    iget-object v0, p0, LG9/e;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ljava/io/File;

    .line 40
    .line 41
    invoke-static {p1, v0}, LG9/e;->C(Ljava/io/File;Ljava/io/File;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public v(Ljava/lang/String;Lkotlin/reflect/KClass;)Landroidx/lifecycle/b0;
    .locals 5

    .line 1
    const-string v0, "modelClass"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "key"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LG9/e;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroidx/lifecycle/e0;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, Landroidx/lifecycle/e0;->a:Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroidx/lifecycle/b0;

    .line 25
    .line 26
    invoke-interface {p2, v1}, Lkotlin/reflect/KClass;->isInstance(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget-object v3, p0, LG9/e;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Landroidx/lifecycle/d0;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    instance-of p1, v3, Landroidx/lifecycle/Y;

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    check-cast v3, Landroidx/lifecycle/Y;

    .line 41
    .line 42
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, v3, Landroidx/lifecycle/Y;->d:Landroidx/lifecycle/o;

    .line 46
    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    iget-object p2, v3, Landroidx/lifecycle/Y;->e:Ln3/d;

    .line 50
    .line 51
    invoke-static {p2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1, p2, p1}, Landroidx/lifecycle/V;->a(Landroidx/lifecycle/b0;Ln3/d;Landroidx/lifecycle/o;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel"

    .line 58
    .line 59
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_1
    new-instance v1, LH1/c;

    .line 64
    .line 65
    iget-object v2, p0, LG9/e;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, LH1/b;

    .line 68
    .line 69
    invoke-direct {v1, v2}, LH1/c;-><init>(LH1/b;)V

    .line 70
    .line 71
    .line 72
    sget-object v2, LI1/b;->a:LI1/b;

    .line 73
    .line 74
    iget-object v4, v1, LH1/b;->a:Ljava/util/LinkedHashMap;

    .line 75
    .line 76
    invoke-interface {v4, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    :try_start_0
    invoke-interface {v3, p2, v1}, Landroidx/lifecycle/d0;->q(Lkotlin/reflect/KClass;LH1/c;)Landroidx/lifecycle/b0;

    .line 80
    .line 81
    .line 82
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    goto :goto_0

    .line 84
    :catch_0
    :try_start_1
    invoke-static {p2}, LFe/b;->y(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-interface {v3, v2, v1}, Landroidx/lifecycle/d0;->j(Ljava/lang/Class;LH1/c;)Landroidx/lifecycle/b0;

    .line 89
    .line 90
    .line 91
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_1

    .line 92
    goto :goto_0

    .line 93
    :catch_1
    invoke-static {p2}, LFe/b;->y(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-interface {v3, p2}, Landroidx/lifecycle/d0;->p(Ljava/lang/Class;)Landroidx/lifecycle/b0;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    :goto_0
    const-string v1, "viewModel"

    .line 102
    .line 103
    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    check-cast p1, Landroidx/lifecycle/b0;

    .line 111
    .line 112
    if-eqz p1, :cond_2

    .line 113
    .line 114
    invoke-virtual {p1}, Landroidx/lifecycle/b0;->a()V

    .line 115
    .line 116
    .line 117
    :cond_2
    return-object p2
.end method

.method public w(Ljava/util/HashMap;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, LL7/b;

    .line 11
    .line 12
    const/16 v2, 0xc

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v1, p0, v3, p1, v2}, LL7/b;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public x(ILQ0/d;LT0/e;)Z
    .locals 6

    .line 1
    iget-object v0, p2, LQ0/d;->p0:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget v2, v0, v1

    .line 5
    .line 6
    iget-object v3, p0, LG9/e;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v3, LR0/b;

    .line 9
    .line 10
    iput v2, v3, LR0/b;->a:I

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    aget v0, v0, v2

    .line 14
    .line 15
    iput v0, v3, LR0/b;->b:I

    .line 16
    .line 17
    invoke-virtual {p2}, LQ0/d;->q()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, v3, LR0/b;->c:I

    .line 22
    .line 23
    invoke-virtual {p2}, LQ0/d;->k()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, v3, LR0/b;->d:I

    .line 28
    .line 29
    iput-boolean v1, v3, LR0/b;->i:Z

    .line 30
    .line 31
    iput p1, v3, LR0/b;->j:I

    .line 32
    .line 33
    iget p1, v3, LR0/b;->a:I

    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    if-ne p1, v0, :cond_0

    .line 37
    .line 38
    move p1, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move p1, v1

    .line 41
    :goto_0
    iget v4, v3, LR0/b;->b:I

    .line 42
    .line 43
    if-ne v4, v0, :cond_1

    .line 44
    .line 45
    move v0, v2

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v0, v1

    .line 48
    :goto_1
    const/4 v4, 0x0

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    iget p1, p2, LQ0/d;->W:F

    .line 52
    .line 53
    cmpl-float p1, p1, v4

    .line 54
    .line 55
    if-lez p1, :cond_2

    .line 56
    .line 57
    move p1, v2

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move p1, v1

    .line 60
    :goto_2
    if-eqz v0, :cond_3

    .line 61
    .line 62
    iget v0, p2, LQ0/d;->W:F

    .line 63
    .line 64
    cmpl-float v0, v0, v4

    .line 65
    .line 66
    if-lez v0, :cond_3

    .line 67
    .line 68
    move v0, v2

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    move v0, v1

    .line 71
    :goto_3
    iget-object v4, p2, LQ0/d;->t:[I

    .line 72
    .line 73
    const/4 v5, 0x4

    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    aget p1, v4, v1

    .line 77
    .line 78
    if-ne p1, v5, :cond_4

    .line 79
    .line 80
    iput v2, v3, LR0/b;->a:I

    .line 81
    .line 82
    :cond_4
    if-eqz v0, :cond_5

    .line 83
    .line 84
    aget p1, v4, v2

    .line 85
    .line 86
    if-ne p1, v5, :cond_5

    .line 87
    .line 88
    iput v2, v3, LR0/b;->b:I

    .line 89
    .line 90
    :cond_5
    invoke-virtual {p3, p2, v3}, LT0/e;->b(LQ0/d;LR0/b;)V

    .line 91
    .line 92
    .line 93
    iget p1, v3, LR0/b;->e:I

    .line 94
    .line 95
    invoke-virtual {p2, p1}, LQ0/d;->O(I)V

    .line 96
    .line 97
    .line 98
    iget p1, v3, LR0/b;->f:I

    .line 99
    .line 100
    invoke-virtual {p2, p1}, LQ0/d;->L(I)V

    .line 101
    .line 102
    .line 103
    iget-boolean p1, v3, LR0/b;->h:Z

    .line 104
    .line 105
    iput-boolean p1, p2, LQ0/d;->E:Z

    .line 106
    .line 107
    iget p1, v3, LR0/b;->g:I

    .line 108
    .line 109
    invoke-virtual {p2, p1}, LQ0/d;->I(I)V

    .line 110
    .line 111
    .line 112
    iput v1, v3, LR0/b;->j:I

    .line 113
    .line 114
    iget-boolean p1, v3, LR0/b;->i:Z

    .line 115
    .line 116
    return p1
.end method

.method public y(ILad/f;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v1, "adId"

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const-string p1, "eventName"

    .line 16
    .line 17
    const-string v1, "onAdFailedToLoad"

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    const-string p1, "loadAdError"

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, LG9/e;->w(Ljava/util/HashMap;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public z(ILx6/t;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v1, "adId"

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const-string p1, "eventName"

    .line 16
    .line 17
    const-string v1, "onAdLoaded"

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p1, Lad/h;

    .line 27
    .line 28
    invoke-direct {p1, p2}, Lad/h;-><init>(Lx6/t;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    const-string p2, "responseInfo"

    .line 32
    .line 33
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, LG9/e;->w(Ljava/util/HashMap;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
