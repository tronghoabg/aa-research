.class public final Lx1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu1/i;


# instance fields
.field public final a:Lu1/G;


# direct methods
.method public constructor <init>(Lu1/G;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx1/d;->a:Lu1/G;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ltf/p;Ljf/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lx1/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lx1/c;-><init>(Ltf/p;Ljf/c;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lx1/d;->a:Lu1/G;

    .line 8
    .line 9
    invoke-virtual {p1, v0, p2}, Lu1/G;->a(Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final getData()LHf/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/d;->a:Lu1/G;

    .line 2
    .line 3
    iget-object v0, v0, Lu1/G;->d:LHf/f0;

    .line 4
    .line 5
    return-object v0
.end method
