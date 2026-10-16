.class public final LP2/c;
.super LT1/e;
.source "SourceFile"

# interfaces
.implements LP2/d;


# instance fields
.field public e:LP2/d;

.field public f:J

.field public final synthetic g:I

.field public h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LP2/c;->g:I

    const/4 v0, 0x3

    invoke-direct {p0, v0}, LH5/a;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lc2/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LP2/c;->g:I

    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, LH5/a;-><init>(I)V

    .line 3
    iput-object p1, p0, LP2/c;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(J)I
    .locals 3

    .line 1
    iget-object v0, p0, LP2/c;->e:LP2/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, LP2/c;->f:J

    .line 7
    .line 8
    sub-long/2addr p1, v1

    .line 9
    invoke-interface {v0, p1, p2}, LP2/d;->a(J)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final g(J)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, LP2/c;->e:LP2/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, LP2/c;->f:J

    .line 7
    .line 8
    sub-long/2addr p1, v1

    .line 9
    invoke-interface {v0, p1, p2}, LP2/d;->g(J)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final k(I)J
    .locals 4

    .line 1
    iget-object v0, p0, LP2/c;->e:LP2/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1}, LP2/d;->k(I)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-wide v2, p0, LP2/c;->f:J

    .line 11
    .line 12
    add-long/2addr v0, v2

    .line 13
    return-wide v0
.end method

.method public final o()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LH5/a;->b:I

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    iput-wide v1, p0, LT1/e;->c:J

    .line 7
    .line 8
    iput-boolean v0, p0, LT1/e;->d:Z

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, LP2/c;->e:LP2/d;

    .line 12
    .line 13
    return-void
.end method

.method public final p()I
    .locals 1

    .line 1
    iget-object v0, p0, LP2/c;->e:LP2/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, LP2/d;->p()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public final q()V
    .locals 1

    .line 1
    iget v0, p0, LP2/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LP2/c;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LPc/b;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, LPc/b;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, LQ2/h;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, LP2/c;->o()V

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, LQ2/h;->b:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    iget-object v0, p0, LP2/c;->h:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lc2/b;

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Lc2/b;->l(LT1/e;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
