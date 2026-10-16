.class public final Lef/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljf/c;


# instance fields
.field public a:LYf/z;

.field public b:Ljf/c;

.field public c:Ljava/lang/Object;


# virtual methods
.method public final getContext()Ljf/h;
    .locals 1

    .line 1
    sget-object v0, Ljf/i;->a:Ljf/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lef/b;->b:Ljf/c;

    .line 3
    .line 4
    iput-object p1, p0, Lef/b;->c:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method
