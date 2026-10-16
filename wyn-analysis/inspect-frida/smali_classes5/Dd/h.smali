.class public final LDd/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEf/E;


# instance fields
.field public final a:LCd/u0;

.field public final b:Ljf/h;


# direct methods
.method public constructor <init>(LCd/u0;Ljf/h;)V
    .locals 1

    .line 1
    const-string v0, "httpSendSender"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "coroutineContext"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LDd/h;->a:LCd/u0;

    .line 15
    .line 16
    iput-object p2, p0, LDd/h;->b:Ljf/h;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final getCoroutineContext()Ljf/h;
    .locals 1

    .line 1
    iget-object v0, p0, LDd/h;->b:Ljf/h;

    .line 2
    .line 3
    return-object v0
.end method
