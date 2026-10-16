.class public final LA/M;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LS3/e;

.field public final b:Ljava/lang/String;

.field public c:LS3/i;

.field public final synthetic d:LA/U;


# direct methods
.method public constructor <init>(LA/U;LS3/e;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "typeConverter"

    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "label"

    .line 10
    .line 11
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LA/M;->d:LA/U;

    .line 15
    .line 16
    iput-object p2, p0, LA/M;->a:LS3/e;

    .line 17
    .line 18
    iput-object p3, p0, LA/M;->b:Ljava/lang/String;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Ltf/l;Ltf/l;)LS3/i;
    .locals 7

    .line 1
    iget-object v0, p0, LA/M;->c:LS3/i;

    .line 2
    .line 3
    iget-object v2, p0, LA/M;->d:LA/U;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LS3/i;

    .line 8
    .line 9
    new-instance v1, LA/O;

    .line 10
    .line 11
    invoke-virtual {v2}, LA/U;->b()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-interface {p2, v3}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v2}, LA/U;->b()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-interface {p2, v4}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-object v5, p0, LA/M;->a:LS3/e;

    .line 28
    .line 29
    invoke-static {v5, v4}, LA/t;->f(LS3/e;Ljava/lang/Object;)LA/n;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget-object v5, p0, LA/M;->a:LS3/e;

    .line 34
    .line 35
    iget-object v6, p0, LA/M;->b:Ljava/lang/String;

    .line 36
    .line 37
    invoke-direct/range {v1 .. v6}, LA/O;-><init>(LA/U;Ljava/lang/Object;LA/n;LS3/e;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, p0, v1, p1, p2}, LS3/i;-><init>(LA/M;LA/O;Ltf/l;Ltf/l;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, LA/M;->c:LS3/i;

    .line 44
    .line 45
    iget-object v3, v2, LA/U;->h:LX/p;

    .line 46
    .line 47
    invoke-virtual {v3, v1}, LX/p;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_0
    check-cast p2, Lkotlin/jvm/internal/n;

    .line 51
    .line 52
    iput-object p2, v0, LS3/i;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Lkotlin/jvm/internal/n;

    .line 55
    .line 56
    iput-object p1, v0, LS3/i;->b:Ljava/lang/Object;

    .line 57
    .line 58
    invoke-virtual {v2}, LA/U;->c()LA/N;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v0, p1}, LS3/i;->i(LA/N;)V

    .line 63
    .line 64
    .line 65
    return-object v0
.end method
