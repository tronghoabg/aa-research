.class public final synthetic LU1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ1/h;
.implements LQ1/g;


# instance fields
.field public final synthetic a:LU1/u;


# direct methods
.method public synthetic constructor <init>(LU1/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU1/o;->a:LU1/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;LN1/l;)V
    .locals 0

    .line 1
    check-cast p1, LN1/H;

    .line 2
    .line 3
    iget-object p2, p0, LU1/o;->a:LU1/u;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, LN1/H;

    .line 2
    .line 3
    iget-object v0, p0, LU1/o;->a:LU1/u;

    .line 4
    .line 5
    iget-object v0, v0, LU1/u;->K:LN1/G;

    .line 6
    .line 7
    invoke-interface {p1, v0}, LN1/H;->E(LN1/G;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
