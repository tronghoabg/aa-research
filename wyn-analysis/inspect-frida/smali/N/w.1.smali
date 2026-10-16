.class public final LN/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/Q;


# static fields
.field public static final a:LN/w;

.field public static final b:Landroid/view/Choreographer;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LN/w;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LN/w;->a:LN/w;

    .line 7
    .line 8
    sget-object v0, LEf/S;->a:LLf/e;

    .line 9
    .line 10
    sget-object v0, LJf/n;->a:LFf/e;

    .line 11
    .line 12
    iget-object v0, v0, LFf/e;->e:LFf/e;

    .line 13
    .line 14
    new-instance v1, LN/u;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v1, v2, v3}, Llf/j;-><init>(ILjf/c;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, LEf/H;->I(Ljf/h;Ltf/p;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/view/Choreographer;

    .line 26
    .line 27
    sput-object v0, LN/w;->b:Landroid/view/Choreographer;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final d(Ltf/l;Llf/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LEf/n;

    .line 2
    .line 3
    invoke-static {p2}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, LEf/n;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LEf/n;->t()V

    .line 12
    .line 13
    .line 14
    new-instance p2, LN/v;

    .line 15
    .line 16
    invoke-direct {p2, v0, p1}, LN/v;-><init>(LEf/n;Ltf/l;)V

    .line 17
    .line 18
    .line 19
    sget-object p1, LN/w;->b:Landroid/view/Choreographer;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 22
    .line 23
    .line 24
    new-instance p1, LB/F;

    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    invoke-direct {p1, p2, v1}, LB/F;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, LEf/n;->v(Ltf/l;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, LEf/n;->s()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 38
    .line 39
    return-object p1
.end method

.method public final fold(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final get(Ljf/g;)Ljf/f;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LFe/e;->C(Ljf/f;Ljf/g;)Ljf/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final getKey()Ljf/g;
    .locals 1

    .line 1
    sget-object v0, LN/P;->b:LN/P;

    return-object v0
.end method

.method public final minusKey(Ljf/g;)Ljf/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LFe/e;->N(Ljf/f;Ljf/g;)Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final plus(Ljf/h;)Ljf/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LFe/e;->O(Ljf/f;Ljf/h;)Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
