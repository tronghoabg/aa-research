.class public final Lz/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LN/Y;


# direct methods
.method public constructor <init>(LA/U;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p1, LL0/h;

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    invoke-direct {p1, v0, v1}, LL0/h;-><init>(J)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LN/P;->f:LN/P;

    .line 12
    .line 13
    invoke-static {p1, v0}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lz/d;->a:LN/Y;

    .line 18
    .line 19
    return-void
.end method
