.class public final LVa/J7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/L9;


# instance fields
.field public synthetic a:LVa/r8;

.field public synthetic b:LVa/x8;

.field public synthetic c:LVa/y7;

.field public synthetic d:Ljava/util/List;


# virtual methods
.method public final a(LVa/M9;Landroid/media/MediaPlayer;II)Z
    .locals 2

    .line 1
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    const/4 v0, 0x5

    .line 10
    new-array v0, v0, [Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    aput-object p0, v0, v1

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    aput-object p1, v0, v1

    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    aput-object p2, v0, p1

    .line 20
    .line 21
    const/4 p1, 0x3

    .line 22
    aput-object p3, v0, p1

    .line 23
    .line 24
    const/4 p1, 0x4

    .line 25
    aput-object p4, v0, p1

    .line 26
    .line 27
    iget-object p1, p0, LVa/J7;->d:Ljava/util/List;

    .line 28
    .line 29
    invoke-static {p1, v0}, LVa/E7;->N1(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object p2, p0, LVa/J7;->a:LVa/r8;

    .line 34
    .line 35
    iget-object p3, p0, LVa/J7;->b:LVa/x8;

    .line 36
    .line 37
    iget-object p4, p0, LVa/J7;->c:LVa/y7;

    .line 38
    .line 39
    invoke-virtual {p2, p3, p4, p1}, LVa/r8;->c(LVa/x8;LVa/y7;Ljava/util/List;)LVa/s8;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, LVa/s8;->e()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1
.end method
