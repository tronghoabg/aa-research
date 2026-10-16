.class Lcom/applovin/impl/e2$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/e2$a;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/applovin/impl/e2$a;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/e2$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/e2$a$a;->a:Lcom/applovin/impl/e2$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/applovin/impl/e2$a$a;->a:Lcom/applovin/impl/e2$a;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/applovin/impl/e2$a;->a:Lcom/applovin/impl/e2;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/applovin/impl/e2;->a:Lcom/applovin/impl/sdk/k;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lcom/applovin/impl/e2$a$a;->a:Lcom/applovin/impl/e2$a;

    .line 17
    .line 18
    iget-object p1, p1, Lcom/applovin/impl/e2$a;->a:Lcom/applovin/impl/e2;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/applovin/impl/e2;->a:Lcom/applovin/impl/sdk/k;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v0, "HealthEventsReporter"

    .line 27
    .line 28
    const-string v1, "Caught unhandled exception"

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1, p2}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method
