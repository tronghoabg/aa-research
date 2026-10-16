.class public abstract Lc0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La2/v;

.field public static final b:LZ/k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lc0/b;->k:Lc0/b;

    .line 2
    .line 3
    invoke-static {v0}, Lff/B;->G(Ltf/a;)La2/v;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lc0/k;->a:La2/v;

    .line 8
    .line 9
    new-instance v0, Lc0/h;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Lc0/h;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lc0/h;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-direct {v1, v2}, Lc0/h;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, LVa/M6;->f(LZ/k;LZ/k;)LZ/k;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lc0/h;

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    invoke-direct {v1, v2}, Lc0/h;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, LZ/k;->g(LZ/k;)LZ/k;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lc0/k;->b:LZ/k;

    .line 36
    .line 37
    return-void
.end method
