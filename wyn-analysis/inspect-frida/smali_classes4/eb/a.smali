.class public final synthetic Leb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU1/Z;


# instance fields
.field public final synthetic a:Leb/c;


# direct methods
.method public synthetic constructor <init>(Leb/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/a;->a:Leb/c;

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Handler;LU1/r;LU1/r;LU1/r;LU1/r;)[LU1/W;
    .locals 7

    .line 1
    new-instance v0, LU1/i;

    .line 2
    .line 3
    iget-object v6, p0, Leb/a;->a:Leb/c;

    .line 4
    .line 5
    iget-object v1, v6, Leb/c;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v0, v1}, LU1/i;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    move-object v1, p1

    .line 11
    move-object v2, p2

    .line 12
    move-object v3, p3

    .line 13
    move-object v4, p4

    .line 14
    move-object v5, p5

    .line 15
    invoke-virtual/range {v0 .. v5}, LU1/i;->a(Landroid/os/Handler;LU1/r;LU1/r;LU1/r;LU1/r;)[LU1/W;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    array-length p2, p1

    .line 20
    add-int/lit8 p2, p2, 0x1

    .line 21
    .line 22
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, [LU1/W;

    .line 27
    .line 28
    array-length p1, p1

    .line 29
    new-instance p3, Leb/b;

    .line 30
    .line 31
    invoke-direct {p3, v6}, Leb/b;-><init>(Leb/c;)V

    .line 32
    .line 33
    .line 34
    aput-object p3, p2, p1

    .line 35
    .line 36
    return-object p2
.end method
