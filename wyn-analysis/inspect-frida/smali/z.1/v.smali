.class public final Lz/v;
.super Lz/p;
.source "SourceFile"


# instance fields
.field public final a:LA/M;

.field public final b:LN/V;

.field public final c:LN/V;

.field public final d:Lz/t;


# direct methods
.method public constructor <init>(LA/M;LN/V;LN/V;)V
    .locals 1

    .line 1
    const-string v0, "lazyAnimation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lz/v;->a:LA/M;

    .line 10
    .line 11
    iput-object p2, p0, Lz/v;->b:LN/V;

    .line 12
    .line 13
    iput-object p3, p0, Lz/v;->c:LN/V;

    .line 14
    .line 15
    new-instance p1, Lz/t;

    .line 16
    .line 17
    invoke-direct {p1, p0}, Lz/t;-><init>(Lz/v;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lz/v;->d:Lz/t;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final q(Lt0/r;Lr0/m;J)LD0/b;
    .locals 3

    .line 1
    const-string v0, "$this$measure"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "measurable"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p2, p3, p4}, Lr0/m;->e(J)Lr0/t;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iget p3, p2, Lr0/t;->a:I

    .line 16
    .line 17
    iget p4, p2, Lr0/t;->b:I

    .line 18
    .line 19
    invoke-static {p3, p4}, LBa/c;->a(II)J

    .line 20
    .line 21
    .line 22
    move-result-wide p3

    .line 23
    iget v0, p2, Lr0/t;->a:I

    .line 24
    .line 25
    iget v1, p2, Lr0/t;->b:I

    .line 26
    .line 27
    new-instance v2, Lz/u;

    .line 28
    .line 29
    invoke-direct {v2, p0, p2, p3, p4}, Lz/u;-><init>(Lz/v;Lr0/t;J)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v0, v1, v2}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1
.end method
