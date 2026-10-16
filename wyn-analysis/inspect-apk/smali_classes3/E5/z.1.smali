.class public final synthetic LE5/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu6/g;
.implements LQ1/g;
.implements LB5/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p3, p0, LE5/z;->a:I

    iput p2, p0, LE5/z;->b:I

    iput-object p1, p0, LE5/z;->c:Ljava/lang/Object;

    iput-object p4, p0, LE5/z;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lz5/f;Lt5/i;I)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, LE5/z;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE5/z;->c:Ljava/lang/Object;

    iput-object p2, p0, LE5/z;->d:Ljava/lang/Object;

    iput p3, p0, LE5/z;->b:I

    return-void
.end method


# virtual methods
.method public execute()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LE5/z;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iget-object v1, p0, LE5/z;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lz5/f;

    .line 8
    .line 9
    iget-object v1, v1, Lz5/f;->d:Lz5/c;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object v3, p0, LE5/z;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Lt5/i;

    .line 15
    .line 16
    invoke-virtual {v1, v3, v0, v2}, Lz5/c;->a(Lt5/i;IZ)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, LE5/z;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LN1/H;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LE5/z;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, LN1/I;

    .line 14
    .line 15
    iget-object v1, p0, LE5/z;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, LN1/I;

    .line 18
    .line 19
    iget v2, p0, LE5/z;->b:I

    .line 20
    .line 21
    invoke-interface {p1, v0, v1, v2}, LN1/H;->t(LN1/I;LN1/I;I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    check-cast p1, LE5/u0;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, LE5/z;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LE5/v0;

    .line 33
    .line 34
    iget-object v1, p0, LE5/z;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, LE5/v0;

    .line 37
    .line 38
    iget v2, p0, LE5/z;->b:I

    .line 39
    .line 40
    invoke-interface {p1, v0, v1, v2}, LE5/u0;->p(LE5/v0;LE5/v0;I)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
