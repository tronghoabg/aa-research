.class public final LMf/b;
.super LMf/h;
.source "SourceFile"


# instance fields
.field public final g:LEf/n;


# direct methods
.method public constructor <init>(Ljf/c;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Ljf/c;->getContext()Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, LMf/h;-><init>(Ljf/h;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, LEf/n;

    .line 9
    .line 10
    invoke-static {p1}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, v1, p1}, LEf/n;-><init>(ILjf/c;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LMf/b;->g:LEf/n;

    .line 19
    .line 20
    return-void
.end method
