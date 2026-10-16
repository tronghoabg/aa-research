.class public final LCd/o;
.super LMd/c;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Long;

.field public final c:LJd/f;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LFd/c;LJd/f;Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, LCd/o;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p3, p0, LCd/o;->d:Ljava/lang/Object;

    .line 3
    iget-object p1, p1, LFd/c;->c:LJd/n;

    .line 4
    sget-object p3, LJd/p;->a:Ljava/util/List;

    const-string p3, "Content-Length"

    invoke-virtual {p1, p3}, LA7/B0;->E(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LCd/o;->b:Ljava/lang/Long;

    if-nez p2, :cond_1

    .line 5
    sget-object p1, LJd/c;->a:LJd/f;

    .line 6
    sget-object p2, LJd/c;->a:LJd/f;

    .line 7
    :cond_1
    iput-object p2, p0, LCd/o;->c:LJd/f;

    return-void
.end method

.method public constructor <init>(LRd/e;LJd/f;Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LCd/o;->a:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p3, p0, LCd/o;->d:Ljava/lang/Object;

    .line 10
    iget-object p1, p1, LRd/e;->a:Ljava/lang/Object;

    .line 11
    check-cast p1, LFd/c;

    .line 12
    iget-object p1, p1, LFd/c;->c:LJd/n;

    .line 13
    sget-object p3, LJd/p;->a:Ljava/util/List;

    const-string p3, "Content-Length"

    invoke-virtual {p1, p3}, LA7/B0;->E(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LCd/o;->b:Ljava/lang/Long;

    if-nez p2, :cond_1

    .line 14
    sget-object p1, LJd/c;->a:LJd/f;

    .line 15
    sget-object p2, LJd/c;->a:LJd/f;

    .line 16
    :cond_1
    iput-object p2, p0, LCd/o;->c:LJd/f;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 1

    .line 1
    iget v0, p0, LCd/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LCd/o;->b:Ljava/lang/Long;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, LCd/o;->b:Ljava/lang/Long;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()LJd/f;
    .locals 1

    .line 1
    iget v0, p0, LCd/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LCd/o;->c:LJd/f;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, LCd/o;->c:LJd/f;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Lio/ktor/utils/io/t;
    .locals 4

    .line 1
    iget-object v0, p0, LCd/o;->d:Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, LCd/o;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v0, Ljava/io/InputStream;

    .line 9
    .line 10
    sget-object v1, LEf/S;->a:LLf/e;

    .line 11
    .line 12
    sget-object v1, LLf/d;->b:LLf/d;

    .line 13
    .line 14
    sget-object v2, LWd/a;->a:LKd/e;

    .line 15
    .line 16
    const-string v3, "<this>"

    .line 17
    .line 18
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v3, "context"

    .line 22
    .line 23
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v3, "pool"

    .line 27
    .line 28
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v2, LVd/d;

    .line 32
    .line 33
    new-instance v3, LPf/b;

    .line 34
    .line 35
    invoke-direct {v3, v0}, LPf/b;-><init>(Ljava/io/InputStream;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v2, v3, v1}, LVd/d;-><init>(LPf/b;Ljf/h;)V

    .line 39
    .line 40
    .line 41
    return-object v2

    .line 42
    :pswitch_0
    check-cast v0, Lio/ktor/utils/io/t;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
