.class public final LCd/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LCd/b;

.field public static final c:LNd/a;


# instance fields
.field public final a:Ltf/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LCd/b;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, LCd/b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LCd/j;->b:LCd/b;

    .line 8
    .line 9
    sget-object v0, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 10
    .line 11
    const-class v1, LCd/j;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :try_start_0
    invoke-static {v1}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 18
    .line 19
    .line 20
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    const/4 v1, 0x0

    .line 23
    :goto_0
    new-instance v2, LSd/a;

    .line 24
    .line 25
    invoke-direct {v2, v0, v1}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, LNd/a;

    .line 29
    .line 30
    const-string v1, "DefaultRequest"

    .line 31
    .line 32
    invoke-direct {v0, v1, v2}, LNd/a;-><init>(Ljava/lang/String;LSd/a;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, LCd/j;->c:LNd/a;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>(Ltf/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LCd/j;->a:Ltf/l;

    .line 5
    .line 6
    return-void
.end method
