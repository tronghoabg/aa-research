.class public final Lf3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lh3/g;


# direct methods
.method public constructor <init>(Lh3/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf3/b;->a:Lh3/g;

    .line 5
    .line 6
    return-void
.end method

.method public static final a(Landroid/content/Context;)Lf3/b;
    .locals 8

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    sget-object v1, Lc3/a;->a:Lc3/a;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/16 v3, 0x1e

    .line 12
    .line 13
    if-lt v0, v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Lc3/a;->a()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v4, v2

    .line 21
    :goto_0
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x5

    .line 23
    const-string v7, "context.getSystemService\u2026opicsManager::class.java)"

    .line 24
    .line 25
    if-lt v4, v6, :cond_1

    .line 26
    .line 27
    new-instance v0, Lh3/d;

    .line 28
    .line 29
    invoke-static {}, LWf/p;->C()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0}, LWf/p;->e(Ljava/lang/Object;)Landroid/adservices/topics/TopicsManager;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const/4 v1, 0x1

    .line 45
    invoke-direct {v0, p0, v1}, Lh3/d;-><init>(Landroid/adservices/topics/TopicsManager;I)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    if-lt v0, v3, :cond_2

    .line 50
    .line 51
    invoke-virtual {v1}, Lc3/a;->a()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    :cond_2
    const/4 v0, 0x4

    .line 56
    if-ne v2, v0, :cond_3

    .line 57
    .line 58
    new-instance v0, Lh3/d;

    .line 59
    .line 60
    invoke-static {}, LWf/p;->C()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p0, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0}, LWf/p;->e(Ljava/lang/Object;)Landroid/adservices/topics/TopicsManager;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const/4 v1, 0x0

    .line 76
    invoke-direct {v0, p0, v1}, Lh3/d;-><init>(Landroid/adservices/topics/TopicsManager;I)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move-object v0, v5

    .line 81
    :goto_1
    if-eqz v0, :cond_4

    .line 82
    .line 83
    new-instance p0, Lf3/b;

    .line 84
    .line 85
    invoke-direct {p0, v0}, Lf3/b;-><init>(Lh3/g;)V

    .line 86
    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_4
    return-object v5
.end method


# virtual methods
.method public b(Lh3/a;)Lp8/p;
    .locals 3
    .param p1    # Lh3/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh3/a;",
            ")",
            "Lp8/p;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LEf/S;->a:LLf/e;

    .line 7
    .line 8
    sget-object v0, LJf/n;->a:LFf/e;

    .line 9
    .line 10
    invoke-static {v0}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lf3/a;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, p1, v2}, Lf3/a;-><init>(Lf3/b;Lh3/a;Ljf/c;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x3

    .line 21
    invoke-static {v0, v2, v1, p1}, LEf/H;->h(LEf/E;Ljf/h;Ltf/p;I)LEf/L;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Lka/e0;->g(LEf/L;)LN0/m;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
.end method
