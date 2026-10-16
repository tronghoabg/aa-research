.class public final LVa/T7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/R9;


# instance fields
.field public synthetic a:LVa/r8;

.field public synthetic b:LVa/x8;

.field public synthetic c:LVa/y7;

.field public synthetic d:Ljava/util/List;


# virtual methods
.method public final a(LVa/S9;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, LVa/T7;->d:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object p0, v1, v2

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    aput-object p1, v1, v2

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    aput-object p2, v1, p1

    .line 14
    .line 15
    invoke-static {v0, v1}, LVa/E7;->N1(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p2, p0, LVa/T7;->a:LVa/r8;

    .line 20
    .line 21
    iget-object v0, p0, LVa/T7;->b:LVa/x8;

    .line 22
    .line 23
    iget-object v1, p0, LVa/T7;->c:LVa/y7;

    .line 24
    .line 25
    invoke-virtual {p2, v0, v1, p1}, LVa/r8;->c(LVa/x8;LVa/y7;Ljava/util/List;)LVa/s8;

    .line 26
    .line 27
    .line 28
    return-void
.end method
