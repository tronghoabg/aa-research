.class public final LDd/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwd/c;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/ArrayList;

.field public final d:Lcom/moloco/sdk/service_locator/h;


# direct methods
.method public constructor <init>(LNd/a;Lwd/c;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "client"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "pluginConfig"

    .line 12
    .line 13
    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, LDd/b;->a:Lwd/c;

    .line 20
    .line 21
    iput-object p3, p0, LDd/b;->b:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, LDd/b;->c:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance p1, Lcom/moloco/sdk/service_locator/h;

    .line 31
    .line 32
    const/16 p2, 0xe

    .line 33
    .line 34
    invoke-direct {p1, p2}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, LDd/b;->d:Lcom/moloco/sdk/service_locator/h;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a(LDd/a;Llf/j;)V
    .locals 2

    .line 1
    iget-object v0, p0, LDd/b;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v1, LDd/e;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, LDd/e;-><init>(LDd/a;Llf/j;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method
