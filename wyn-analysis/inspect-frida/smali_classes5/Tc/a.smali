.class public final LTc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ9/b;


# instance fields
.field public final synthetic a:Luc/h;

.field public final synthetic b:LTc/b;


# direct methods
.method public constructor <init>(LTc/b;Luc/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LTc/a;->b:LTc/b;

    .line 5
    .line 6
    iput-object p2, p0, LTc/a;->a:Luc/h;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LZ9/a;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object p1, p1, LZ9/a;->a:Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LTc/a;->b:LTc/b;

    .line 9
    .line 10
    iget-object p1, p1, LTc/b;->d:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v1, LT3/r;

    .line 13
    .line 14
    iget-object v2, p0, LTc/a;->a:Luc/h;

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    invoke-direct {v1, v3, v2, v0}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final b(LZ9/f;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, LTc/a;->a:Luc/h;

    .line 6
    .line 7
    const-string v1, "firebase_remote_config"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, p1, v2}, Luc/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
