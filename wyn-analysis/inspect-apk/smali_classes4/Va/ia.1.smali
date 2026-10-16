.class public final LVa/ia;
.super LVa/ca;
.source "SourceFile"


# instance fields
.field public O:I

.field public P:Ljava/lang/Class;

.field public Q:Z

.field public R:Ljava/util/ArrayList;

.field public S:Ljava/util/List;

.field public T:I


# virtual methods
.method public final q0()V
    .locals 2

    .line 1
    invoke-super {p0}, LVa/ca;->q0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, LVa/ia;->P:Ljava/lang/Class;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput v1, p0, LVa/ia;->O:I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, p0, LVa/ia;->Q:Z

    .line 12
    .line 13
    iget-object v1, p0, LVa/ia;->R:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LVa/ia;->S:Ljava/util/List;

    .line 19
    .line 20
    const/4 v0, -0x1

    .line 21
    iput v0, p0, LVa/ia;->T:I

    .line 22
    .line 23
    return-void
.end method
