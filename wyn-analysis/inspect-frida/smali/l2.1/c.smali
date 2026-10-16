.class public final Ll2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/C;


# instance fields
.field public final a:I

.field public final b:LN1/n;

.field public final c:Ls2/l;

.field public d:LN1/n;

.field public e:Ls2/C;

.field public f:J


# direct methods
.method public constructor <init>(IILN1/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Ll2/c;->a:I

    .line 5
    .line 6
    iput-object p3, p0, Ll2/c;->b:LN1/n;

    .line 7
    .line 8
    new-instance p1, Ls2/l;

    .line 9
    .line 10
    invoke-direct {p1}, Ls2/l;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ll2/c;->c:Ls2/l;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(JIIILs2/B;)V
    .locals 8

    .line 1
    iget-wide v0, p0, Ll2/c;->f:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-ltz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Ll2/c;->c:Ls2/l;

    .line 17
    .line 18
    iput-object v0, p0, Ll2/c;->e:Ls2/C;

    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Ll2/c;->e:Ls2/C;

    .line 21
    .line 22
    sget v0, LQ1/x;->a:I

    .line 23
    .line 24
    move-wide v2, p1

    .line 25
    move v4, p3

    .line 26
    move v5, p4

    .line 27
    move v6, p5

    .line 28
    move-object v7, p6

    .line 29
    invoke-interface/range {v1 .. v7}, Ls2/C;->a(JIIILs2/B;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final b(LN1/g;IZ)I
    .locals 2

    .line 1
    iget-object v0, p0, Ll2/c;->e:Ls2/C;

    .line 2
    .line 3
    sget v1, LQ1/x;->a:I

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3}, Ls2/C;->d(LN1/g;IZ)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final c(LN1/n;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ll2/c;->b:LN1/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, v0}, LN1/n;->d(LN1/n;)LN1/n;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    iput-object p1, p0, Ll2/c;->d:LN1/n;

    .line 10
    .line 11
    iget-object v0, p0, Ll2/c;->e:Ls2/C;

    .line 12
    .line 13
    sget v1, LQ1/x;->a:I

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ls2/C;->c(LN1/n;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final d(LN1/g;IZ)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Ll2/c;->b(LN1/g;IZ)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final synthetic e(ILQ1/o;)V
    .locals 0

    .line 1
    invoke-static {p0, p2, p1}, Lpd/f;->b(Ls2/C;LQ1/o;I)V

    return-void
.end method

.method public final f(LQ1/o;II)V
    .locals 1

    .line 1
    iget-object p3, p0, Ll2/c;->e:Ls2/C;

    .line 2
    .line 3
    sget v0, LQ1/x;->a:I

    .line 4
    .line 5
    invoke-interface {p3, p2, p1}, Ls2/C;->e(ILQ1/o;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
