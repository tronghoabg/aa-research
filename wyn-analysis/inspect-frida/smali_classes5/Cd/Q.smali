.class public final LCd/Q;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:LDd/h;

.field public b:LFd/c;

.field public c:Lwd/c;

.field public d:Lkotlin/jvm/internal/G;

.field public e:Lkotlin/jvm/internal/G;

.field public f:LJd/D;

.field public g:Ljava/lang/String;

.field public h:Lkotlin/jvm/internal/G;

.field public synthetic i:Ljava/lang/Object;

.field public j:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, LCd/Q;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LCd/Q;->j:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LCd/Q;->j:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1, p1, p1, p1, p0}, LCd/S;->a(LDd/h;LFd/c;Lxd/c;Lwd/c;Llf/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
