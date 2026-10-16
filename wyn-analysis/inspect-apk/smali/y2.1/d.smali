.class public final Ly2/d;
.super LA7/B0;
.source "SourceFile"


# instance fields
.field public final b:LQ1/o;

.field public final c:LQ1/o;

.field public d:I

.field public e:Z

.field public f:Z

.field public g:I


# direct methods
.method public constructor <init>(Ls2/C;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, LA7/B0;-><init>(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, LQ1/o;

    .line 5
    .line 6
    sget-object v0, LR1/n;->a:[B

    .line 7
    .line 8
    invoke-direct {p1, v0}, LQ1/o;-><init>([B)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ly2/d;->b:LQ1/o;

    .line 12
    .line 13
    new-instance p1, LQ1/o;

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    invoke-direct {p1, v0}, LQ1/o;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Ly2/d;->c:LQ1/o;

    .line 20
    .line 21
    return-void
.end method
