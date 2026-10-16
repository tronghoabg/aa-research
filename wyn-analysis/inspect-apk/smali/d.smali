.class public final Ld;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Ld;

.field public static final b:Lef/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ld;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ld;->a:Ld;

    .line 7
    .line 8
    new-instance v0, LCd/u;

    .line 9
    .line 10
    const/4 v1, 0x6

    .line 11
    invoke-direct {v0, v1}, LCd/u;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Ld;->b:Lef/p;

    .line 19
    .line 20
    return-void
.end method

.method public static a(Luc/f;Lac/b;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LVa/X7;

    .line 7
    .line 8
    sget-object v1, Ld;->b:Lef/p;

    .line 9
    .line 10
    invoke-virtual {v1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Luc/n;

    .line 15
    .line 16
    const-string v3, "dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.toggle"

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v0, p0, v2, v4, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    new-instance v2, Lc;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v2, p1, v3}, Lc;-><init>(Lac/b;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v0, v4}, LVa/X7;->n(Luc/b;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    new-instance v0, LVa/X7;

    .line 38
    .line 39
    invoke-virtual {v1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Luc/n;

    .line 44
    .line 45
    const-string v2, "dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.isEnabled"

    .line 46
    .line 47
    invoke-direct {v0, p0, v1, v4, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    new-instance p0, Lc;

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    invoke-direct {p0, p1, v1}, Lc;-><init>(Lac/b;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p0}, LVa/X7;->n(Luc/b;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    invoke-virtual {v0, v4}, LVa/X7;->n(Luc/b;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method
