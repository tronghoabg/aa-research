.class public final LCd/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LCd/W;

.field public b:LCd/V;

.field public c:LBf/s;

.field public final d:LCd/X;

.field public e:Ltf/p;

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LCd/X;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v1, v2}, Llf/j;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LCd/Y;->d:LCd/X;

    .line 12
    .line 13
    new-instance v0, LCd/U;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, LCd/U;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LCd/Y;->e:Ltf/p;

    .line 20
    .line 21
    new-instance v0, LCd/W;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, v1}, LCd/W;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LCd/Y;->a:LCd/W;

    .line 28
    .line 29
    new-instance v0, LCd/V;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, v1}, LCd/V;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x3

    .line 36
    iput v1, p0, LCd/Y;->f:I

    .line 37
    .line 38
    iput-object v0, p0, LCd/Y;->b:LCd/V;

    .line 39
    .line 40
    new-instance v0, LBf/s;

    .line 41
    .line 42
    const/4 v1, 0x3

    .line 43
    invoke-direct {v0, p0, v1}, LBf/s;-><init>(Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    new-instance v1, LBf/s;

    .line 47
    .line 48
    const/4 v2, 0x2

    .line 49
    invoke-direct {v1, v0, v2}, LBf/s;-><init>(Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, LCd/Y;->c:LBf/s;

    .line 53
    .line 54
    return-void
.end method
