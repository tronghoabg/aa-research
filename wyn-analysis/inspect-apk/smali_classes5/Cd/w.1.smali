.class public abstract LCd/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LNd/a;

.field public static final b:LNd/a;

.field public static final c:Lef/p;

.field public static final d:LDd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 2
    .line 3
    const-class v1, Lef/C;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :try_start_0
    invoke-static {v1}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 11
    .line 12
    .line 13
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-object v3, v2

    .line 16
    :goto_0
    new-instance v4, LSd/a;

    .line 17
    .line 18
    invoke-direct {v4, v0, v3}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, LNd/a;

    .line 22
    .line 23
    const-string v3, "SkipSaveBody"

    .line 24
    .line 25
    invoke-direct {v0, v3, v4}, LNd/a;-><init>(Ljava/lang/String;LSd/a;)V

    .line 26
    .line 27
    .line 28
    sput-object v0, LCd/w;->a:LNd/a;

    .line 29
    .line 30
    sget-object v0, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :try_start_1
    invoke-static {v1}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 37
    .line 38
    .line 39
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    :catchall_1
    new-instance v1, LSd/a;

    .line 41
    .line 42
    invoke-direct {v1, v0, v2}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, LNd/a;

    .line 46
    .line 47
    const-string v2, "ResponseBodySaved"

    .line 48
    .line 49
    invoke-direct {v0, v2, v1}, LNd/a;-><init>(Ljava/lang/String;LSd/a;)V

    .line 50
    .line 51
    .line 52
    sput-object v0, LCd/w;->b:LNd/a;

    .line 53
    .line 54
    new-instance v0, LCd/u;

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    invoke-direct {v0, v1}, LCd/u;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sput-object v0, LCd/w;->c:Lef/p;

    .line 65
    .line 66
    new-instance v0, LAd/g;

    .line 67
    .line 68
    const/4 v1, 0x7

    .line 69
    invoke-direct {v0, v1}, LAd/g;-><init>(I)V

    .line 70
    .line 71
    .line 72
    new-instance v1, Lcom/moloco/sdk/service_locator/h;

    .line 73
    .line 74
    const/16 v2, 0xe

    .line 75
    .line 76
    invoke-direct {v1, v2}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 77
    .line 78
    .line 79
    const-string v2, "SaveBody"

    .line 80
    .line 81
    invoke-static {v2, v1, v0}, LU8/v0;->s(Ljava/lang/String;Ltf/a;Ltf/l;)LDd/c;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, LCd/w;->d:LDd/c;

    .line 86
    .line 87
    sget-object v0, LCd/v;->a:LCd/v;

    .line 88
    .line 89
    new-instance v1, LAd/g;

    .line 90
    .line 91
    const/16 v2, 0x8

    .line 92
    .line 93
    invoke-direct {v1, v2}, LAd/g;-><init>(I)V

    .line 94
    .line 95
    .line 96
    const-string v2, "DoubleReceivePlugin"

    .line 97
    .line 98
    invoke-static {v2, v0, v1}, LU8/v0;->s(Ljava/lang/String;Ltf/a;Ltf/l;)LDd/c;

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public static final a()Lvg/b;
    .locals 1

    .line 1
    sget-object v0, LCd/w;->c:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lvg/b;

    .line 8
    .line 9
    return-object v0
.end method
