.class public final synthetic LE5/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu6/h;
.implements Lu6/g;


# instance fields
.field public final synthetic a:LE5/I;


# direct methods
.method public synthetic constructor <init>(LE5/I;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE5/u;->a:LE5/I;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lu6/e;)V
    .locals 1

    .line 1
    check-cast p1, LE5/u0;

    .line 2
    .line 3
    iget-object v0, p0, LE5/u;->a:LE5/I;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v0, LE5/t0;

    .line 9
    .line 10
    invoke-direct {v0, p2}, LE5/t0;-><init>(Lu6/e;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v0}, LE5/u0;->n(LE5/t0;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, LE5/u0;

    .line 2
    .line 3
    iget-object v0, p0, LE5/u;->a:LE5/I;

    .line 4
    .line 5
    iget-object v0, v0, LE5/I;->O:LE5/s0;

    .line 6
    .line 7
    invoke-interface {p1, v0}, LE5/u0;->q(LE5/s0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
