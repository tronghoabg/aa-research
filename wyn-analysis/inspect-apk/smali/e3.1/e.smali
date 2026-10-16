.class public abstract Le3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/content/Context;)Le3/d;
    .locals 6

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "AdServicesInfo.version="

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    sget-object v2, Lc3/a;->a:Lc3/a;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    const/16 v4, 0x1e

    .line 19
    .line 20
    if-lt v1, v4, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2}, Lc3/a;->a()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v5, v3

    .line 28
    :goto_0
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v5, "MeasurementManager"

    .line 36
    .line 37
    invoke-static {v5, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    if-lt v1, v4, :cond_1

    .line 41
    .line 42
    invoke-virtual {v2}, Lc3/a;->a()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    :cond_1
    const/4 v0, 0x5

    .line 47
    const/4 v1, 0x0

    .line 48
    if-lt v3, v0, :cond_2

    .line 49
    .line 50
    new-instance v0, Lg3/b;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lg3/b;-><init>(Landroid/content/Context;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move-object v0, v1

    .line 57
    :goto_1
    if-eqz v0, :cond_3

    .line 58
    .line 59
    new-instance p0, Le3/d;

    .line 60
    .line 61
    invoke-direct {p0, v0}, Le3/d;-><init>(Lg3/b;)V

    .line 62
    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_3
    return-object v1
.end method


# virtual methods
.method public abstract b(Landroid/net/Uri;Landroid/view/InputEvent;)Lp8/p;
.end method
