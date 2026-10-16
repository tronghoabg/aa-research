.class public final LN/y;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:LN/z;

.field public final synthetic j:LV/f;

.field public final synthetic k:Lx/n;

.field public final synthetic l:I


# direct methods
.method public constructor <init>(LN/z;LV/f;Lx/n;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/y;->i:LN/z;

    .line 2
    .line 3
    iput-object p2, p0, LN/y;->j:LV/f;

    .line 4
    .line 5
    iput-object p3, p0, LN/y;->k:Lx/n;

    .line 6
    .line 7
    iput p4, p0, LN/y;->l:I

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LN/y;->i:LN/z;

    .line 2
    .line 3
    if-eq p1, v0, :cond_3

    .line 4
    .line 5
    instance-of v0, p1, LX/y;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, LN/y;->j:LV/f;

    .line 10
    .line 11
    iget v0, v0, LV/f;->a:I

    .line 12
    .line 13
    iget v1, p0, LN/y;->l:I

    .line 14
    .line 15
    sub-int/2addr v0, v1

    .line 16
    iget-object v1, p0, LN/y;->k:Lx/n;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lx/n;->c(Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ltz v2, :cond_0

    .line 23
    .line 24
    iget-object v3, v1, Lx/n;->c:[I

    .line 25
    .line 26
    aget v2, v3, v2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const v2, 0x7fffffff

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {v1, p1}, Lx/n;->b(Ljava/lang/Object;)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-gez v2, :cond_1

    .line 41
    .line 42
    not-int v2, v2

    .line 43
    :cond_1
    iget-object v3, v1, Lx/n;->b:[Ljava/lang/Object;

    .line 44
    .line 45
    aput-object p1, v3, v2

    .line 46
    .line 47
    iget-object p1, v1, Lx/n;->c:[I

    .line 48
    .line 49
    aput v0, p1, v2

    .line 50
    .line 51
    :cond_2
    sget-object p1, Lef/C;->a:Lef/C;

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v0, "A derived state calculation cannot read itself"

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1
.end method
