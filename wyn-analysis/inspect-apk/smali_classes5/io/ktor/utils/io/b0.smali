.class public final Lio/ktor/utils/io/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEf/E;


# instance fields
.field public final a:Lio/ktor/utils/io/J;

.field public final b:Ljf/h;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/J;Ljf/h;)V
    .locals 1

    .line 1
    const-string v0, "coroutineContext"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lio/ktor/utils/io/b0;->a:Lio/ktor/utils/io/J;

    .line 10
    .line 11
    iput-object p2, p0, Lio/ktor/utils/io/b0;->b:Ljf/h;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final getCoroutineContext()Ljf/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/ktor/utils/io/b0;->b:Ljf/h;

    .line 2
    .line 3
    return-object v0
.end method
