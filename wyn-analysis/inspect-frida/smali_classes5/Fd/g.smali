.class public final LFd/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LJd/v;

.field public final b:LQd/d;

.field public final c:LJd/o;

.field public final d:LJd/u;

.field public final e:Lio/ktor/utils/io/t;

.field public final f:Ljf/h;

.field public final g:LQd/d;


# direct methods
.method public constructor <init>(LJd/v;LQd/d;LJd/o;LJd/u;Lio/ktor/utils/io/t;Ljf/h;)V
    .locals 1

    .line 1
    const-string v0, "requestTime"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "version"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "body"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "callContext"

    .line 17
    .line 18
    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LFd/g;->a:LJd/v;

    .line 25
    .line 26
    iput-object p2, p0, LFd/g;->b:LQd/d;

    .line 27
    .line 28
    iput-object p3, p0, LFd/g;->c:LJd/o;

    .line 29
    .line 30
    iput-object p4, p0, LFd/g;->d:LJd/u;

    .line 31
    .line 32
    iput-object p5, p0, LFd/g;->e:Lio/ktor/utils/io/t;

    .line 33
    .line 34
    iput-object p6, p0, LFd/g;->f:Ljf/h;

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    invoke-static {p1}, LQd/a;->a(Ljava/lang/Long;)LQd/d;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, LFd/g;->g:LQd/d;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HttpResponseData=(statusCode="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LFd/g;->a:LJd/v;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
