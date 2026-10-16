.class public final LVa/L7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/X9;


# instance fields
.field public synthetic a:LVa/r8;

.field public synthetic b:LVa/x8;

.field public synthetic c:LVa/y7;

.field public synthetic d:Ljava/util/List;


# virtual methods
.method public final a(LVa/Y9;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    iget-object v0, p0, LVa/L7;->d:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x4

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
    const/4 p1, 0x3

    .line 16
    aput-object p3, v1, p1

    .line 17
    .line 18
    invoke-static {v0, v1}, LVa/E7;->N1(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p2, p0, LVa/L7;->a:LVa/r8;

    .line 23
    .line 24
    iget-object p3, p0, LVa/L7;->b:LVa/x8;

    .line 25
    .line 26
    iget-object v0, p0, LVa/L7;->c:LVa/y7;

    .line 27
    .line 28
    invoke-virtual {p2, p3, v0, p1}, LVa/r8;->c(LVa/x8;LVa/y7;Ljava/util/List;)LVa/s8;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, LVa/s8;->e()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1
.end method
