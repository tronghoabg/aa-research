.class public final LJ9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lw8/d;

.field public final b:LRe/Q;

.field public c:Lw8/a;


# direct methods
.method public constructor <init>(Lw8/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ9/b;->a:Lw8/d;

    .line 5
    .line 6
    new-instance p1, Lxa/d;

    .line 7
    .line 8
    const/16 v0, 0xd

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, Lxa/d;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    sget v0, LHe/c;->a:I

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    const-string v1, "mode is null"

    .line 17
    .line 18
    invoke-static {v0, v1}, LN0/a;->n(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, LRe/m;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, p1, v1}, LRe/m;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, LHe/c;->c()LRe/Q;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, LJ9/b;->b:LRe/Q;

    .line 32
    .line 33
    invoke-virtual {p1}, LRe/Q;->f()V

    .line 34
    .line 35
    .line 36
    return-void
.end method
