.class public final LD3/f;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# static fields
.field public static final i:LD3/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LD3/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LD3/f;->i:LD3/f;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    const-class v2, LD3/h;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    new-instance v3, LD3/e;

    .line 12
    .line 13
    new-instance v4, LY9/c;

    .line 14
    .line 15
    invoke-direct {v4, v2, v0}, LY9/c;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v3, v2, v4}, LD3/e;-><init>(Ljava/lang/ClassLoader;LY9/c;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v3, v1

    .line 23
    :goto_0
    if-eqz v3, :cond_3

    .line 24
    .line 25
    invoke-virtual {v3}, LD3/e;->a()Landroidx/window/extensions/layout/WindowLayoutComponent;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-eqz v3, :cond_3

    .line 30
    .line 31
    new-instance v4, LY9/c;

    .line 32
    .line 33
    const-string v5, "loader"

    .line 34
    .line 35
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v4, v2, v0}, LY9/c;-><init>(Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, LA3/e;->a()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-lt v2, v0, :cond_1

    .line 46
    .line 47
    new-instance v0, LF3/d;

    .line 48
    .line 49
    invoke-direct {v0, v3}, LF3/d;-><init>(Landroidx/window/extensions/layout/WindowLayoutComponent;)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_1
    const/4 v0, 0x1

    .line 54
    if-ne v2, v0, :cond_2

    .line 55
    .line 56
    new-instance v0, LF3/c;

    .line 57
    .line 58
    invoke-direct {v0, v3, v4}, LF3/c;-><init>(Landroidx/window/extensions/layout/WindowLayoutComponent;LY9/c;)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_2
    new-instance v0, LF3/a;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :catchall_0
    sget-object v0, LD3/g;->a:LD3/g;

    .line 69
    .line 70
    :cond_3
    return-object v1
.end method
