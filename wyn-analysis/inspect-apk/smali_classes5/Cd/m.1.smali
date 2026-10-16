.class public abstract LCd/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LNd/a;

.field public static final b:Lvg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

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
    :try_start_0
    invoke-static {v1}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    new-instance v2, LSd/a;

    .line 16
    .line 17
    invoke-direct {v2, v0, v1}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, LNd/a;

    .line 21
    .line 22
    const-string v1, "ValidateMark"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, LNd/a;-><init>(Ljava/lang/String;LSd/a;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, LCd/m;->a:LNd/a;

    .line 28
    .line 29
    const-string v0, "io.ktor.client.plugins.DefaultResponseValidation"

    .line 30
    .line 31
    invoke-static {v0}, Lvg/d;->c(Ljava/lang/String;)Lvg/b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, LCd/m;->b:Lvg/b;

    .line 36
    .line 37
    return-void
.end method
