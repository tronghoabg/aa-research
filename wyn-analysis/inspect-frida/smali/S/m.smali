.class public final LS/m;
.super Lff/a;
.source "SourceFile"


# instance fields
.field public final a:LS/c;


# direct methods
.method public constructor <init>(LS/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LS/m;->a:LS/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LS/m;->a:LS/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lff/g;->containsValue(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final getSize()I
    .locals 1

    .line 1
    iget-object v0, p0, LS/m;->a:LS/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, v0, LS/c;->b:I

    .line 7
    .line 8
    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 7

    .line 1
    new-instance v0, LS/l;

    .line 2
    .line 3
    iget-object v1, p0, LS/m;->a:LS/c;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    new-array v3, v2, [LS/o;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    :goto_0
    if-ge v4, v2, :cond_0

    .line 11
    .line 12
    new-instance v5, LS/p;

    .line 13
    .line 14
    const/4 v6, 0x2

    .line 15
    invoke-direct {v5, v6}, LS/p;-><init>(I)V

    .line 16
    .line 17
    .line 18
    aput-object v5, v3, v4

    .line 19
    .line 20
    add-int/lit8 v4, v4, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v1, v1, LS/c;->a:LS/n;

    .line 24
    .line 25
    invoke-direct {v0, v1, v3}, LS/d;-><init>(LS/n;[LS/o;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method
