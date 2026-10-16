.class public abstract LCd/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LNd/a;

.field public static final b:LNd/a;

.field public static final c:LDd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 2
    .line 3
    const-class v1, Lyd/a;

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
    const-string v3, "UploadProgressListenerAttributeKey"

    .line 24
    .line 25
    invoke-direct {v0, v3, v4}, LNd/a;-><init>(Ljava/lang/String;LSd/a;)V

    .line 26
    .line 27
    .line 28
    sput-object v0, LCd/f;->a:LNd/a;

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
    const-string v2, "DownloadProgressListenerAttributeKey"

    .line 48
    .line 49
    invoke-direct {v0, v2, v1}, LNd/a;-><init>(Ljava/lang/String;LSd/a;)V

    .line 50
    .line 51
    .line 52
    sput-object v0, LCd/f;->b:LNd/a;

    .line 53
    .line 54
    new-instance v0, LAd/g;

    .line 55
    .line 56
    const/4 v1, 0x5

    .line 57
    invoke-direct {v0, v1}, LAd/g;-><init>(I)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Lcom/moloco/sdk/service_locator/h;

    .line 61
    .line 62
    const/16 v2, 0xe

    .line 63
    .line 64
    invoke-direct {v1, v2}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 65
    .line 66
    .line 67
    const-string v2, "BodyProgress"

    .line 68
    .line 69
    invoke-static {v2, v1, v0}, LU8/v0;->s(Ljava/lang/String;Ltf/a;Ltf/l;)LDd/c;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sput-object v0, LCd/f;->c:LDd/c;

    .line 74
    .line 75
    return-void
.end method
