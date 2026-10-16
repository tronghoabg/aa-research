.class public final LMf/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LEf/z0;

.field public final b:Ltf/p;

.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:LMf/b;


# direct methods
.method public constructor <init>(LMf/b;LEf/z0;Ltf/p;)V
    .locals 1

    .line 1
    sget-object v0, LEf/w0;->a:LEf/w0;

    .line 2
    .line 3
    sget-object v0, LEf/x0;->a:LEf/x0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, LMf/f;->e:LMf/b;

    .line 9
    .line 10
    iput-object p2, p0, LMf/f;->a:LEf/z0;

    .line 11
    .line 12
    iput-object p3, p0, LMf/f;->b:Ltf/p;

    .line 13
    .line 14
    const/4 p1, -0x1

    .line 15
    iput p1, p0, LMf/f;->d:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, LMf/f;->c:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, LJf/r;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LJf/r;

    .line 8
    .line 9
    iget v1, p0, LMf/f;->d:I

    .line 10
    .line 11
    iget-object v2, p0, LMf/f;->e:LMf/b;

    .line 12
    .line 13
    iget-object v2, v2, LMf/h;->a:Ljf/h;

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, LJf/r;->h(ILjf/h;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    instance-of v1, v0, LEf/U;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    check-cast v0, LEf/U;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    :goto_0
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-interface {v0}, LEf/U;->dispose()V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-void
.end method
