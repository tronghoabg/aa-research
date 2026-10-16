.class public abstract Lzd/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LNd/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 2
    .line 3
    const-class v1, Ljava/util/Map;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :try_start_0
    sget-object v2, Lkotlin/reflect/KTypeProjection;->Companion:Lkotlin/reflect/KTypeProjection$Companion;

    .line 10
    .line 11
    const-class v3, Lzd/f;

    .line 12
    .line 13
    invoke-virtual {v2}, Lkotlin/reflect/KTypeProjection$Companion;->getSTAR()Lkotlin/reflect/KTypeProjection;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-static {v3, v4}, Lkotlin/jvm/internal/H;->c(Ljava/lang/Class;Lkotlin/reflect/KTypeProjection;)Lkotlin/reflect/KType;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v2, v3}, Lkotlin/reflect/KTypeProjection$Companion;->invariant(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const-class v4, Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v4}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v2, v4}, Lkotlin/reflect/KTypeProjection$Companion;->invariant(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v3, v2}, Lkotlin/jvm/internal/H;->e(Lkotlin/reflect/KTypeProjection;Lkotlin/reflect/KTypeProjection;)Lkotlin/reflect/KType;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/I;->mutableCollectionType(Lkotlin/reflect/KType;)Lkotlin/reflect/KType;

    .line 40
    .line 41
    .line 42
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    const/4 v0, 0x0

    .line 45
    :goto_0
    new-instance v2, LSd/a;

    .line 46
    .line 47
    invoke-direct {v2, v1, v0}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 48
    .line 49
    .line 50
    new-instance v0, LNd/a;

    .line 51
    .line 52
    const-string v1, "EngineCapabilities"

    .line 53
    .line 54
    invoke-direct {v0, v1, v2}, LNd/a;-><init>(Ljava/lang/String;LSd/a;)V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lzd/g;->a:LNd/a;

    .line 58
    .line 59
    sget-object v0, LCd/m0;->a:LCd/m0;

    .line 60
    .line 61
    invoke-static {v0}, Ltg/b;->P(Ljava/lang/Object;)Ljava/util/Set;

    .line 62
    .line 63
    .line 64
    return-void
.end method
