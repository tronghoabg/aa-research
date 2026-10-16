.class public final LDd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final a:LNd/a;

.field public final b:Ljava/lang/Object;

.field public final c:Ltf/l;

.field public d:Ltf/a;


# direct methods
.method public constructor <init>(LNd/a;Ljava/lang/Object;Ltf/l;)V
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "config"

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
    iput-object p1, p0, LDd/d;->a:LNd/a;

    .line 15
    .line 16
    iput-object p2, p0, LDd/d;->b:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p3, p0, LDd/d;->c:Ltf/l;

    .line 19
    .line 20
    new-instance p1, Lcom/moloco/sdk/service_locator/h;

    .line 21
    .line 22
    const/16 p2, 0xe

    .line 23
    .line 24
    invoke-direct {p1, p2}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, LDd/d;->d:Ltf/a;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, LDd/d;->d:Ltf/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
