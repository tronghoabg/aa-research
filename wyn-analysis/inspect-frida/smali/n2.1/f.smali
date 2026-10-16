.class public final Ln2/f;
.super Ln2/m;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(ILN1/O;ILn2/i;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ln2/m;-><init>(ILN1/O;I)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p4, Ln2/i;->w:Z

    .line 5
    .line 6
    invoke-static {p5, p1}, LR8/v;->c(IZ)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Ln2/f;->e:I

    .line 11
    .line 12
    iget-object p1, p0, Ln2/m;->d:LN1/n;

    .line 13
    .line 14
    iget p2, p1, LN1/n;->u:I

    .line 15
    .line 16
    const/4 p3, -0x1

    .line 17
    if-eq p2, p3, :cond_1

    .line 18
    .line 19
    iget p1, p1, LN1/n;->v:I

    .line 20
    .line 21
    if-ne p1, p3, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    mul-int p3, p2, p1

    .line 25
    .line 26
    :cond_1
    :goto_0
    iput p3, p0, Ln2/f;->f:I

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Ln2/f;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public final bridge synthetic b(Ln2/m;)Z
    .locals 0

    .line 1
    check-cast p1, Ln2/f;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Ln2/f;

    .line 2
    .line 3
    iget v0, p0, Ln2/f;->f:I

    .line 4
    .line 5
    iget p1, p1, Ln2/f;->f:I

    .line 6
    .line 7
    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
