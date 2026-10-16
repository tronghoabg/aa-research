.class public final Lad/C;
.super Lad/i;
.source "SourceFile"

# interfaces
.implements Lad/k;


# instance fields
.field public final b:LG9/e;

.field public c:Lx6/h;


# direct methods
.method public constructor <init>(ILG9/e;Ljava/lang/String;Lad/q;Lad/w;LE0/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lad/i;-><init>(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Lad/C;->b:LG9/e;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lad/C;->c:Lx6/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lx6/j;->a()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lad/C;->c:Lx6/h;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final b()Lio/flutter/plugin/platform/e;
    .locals 3

    .line 1
    iget-object v0, p0, Lad/C;->c:Lx6/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    new-instance v1, Lad/N;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, v0, v2}, Lad/N;-><init>(Landroid/view/View;I)V

    .line 11
    .line 12
    .line 13
    return-object v1
.end method

.method public final onAdLoaded()V
    .locals 3

    .line 1
    iget-object v0, p0, Lad/C;->c:Lx6/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lad/i;->a:I

    .line 6
    .line 7
    invoke-virtual {v0}, Lx6/j;->getResponseInfo()Lx6/t;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v2, p0, Lad/C;->b:LG9/e;

    .line 12
    .line 13
    invoke-virtual {v2, v1, v0}, LG9/e;->z(ILx6/t;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
