.class public abstract Lu0/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z


# direct methods
.method public static final a(LZ/k;LZ/k;)LZ/k;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "wrapped"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lu0/X;

    .line 12
    .line 13
    invoke-direct {v0}, Lu0/X;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v0}, LZ/k;->g(LZ/k;)LZ/k;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0, p1}, LZ/k;->g(LZ/k;)LZ/k;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-object p1, v0, Lu0/X;->b:Lu0/W;

    .line 25
    .line 26
    invoke-interface {p0, p1}, LZ/k;->g(LZ/k;)LZ/k;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method
