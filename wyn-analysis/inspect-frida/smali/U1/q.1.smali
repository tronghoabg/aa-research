.class public final synthetic LU1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ1/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LN1/Y;


# direct methods
.method public synthetic constructor <init>(LN1/Y;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LU1/q;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU1/q;->b:LN1/Y;

    return-void
.end method

.method public synthetic constructor <init>(LV1/a;LN1/Y;)V
    .locals 0

    .line 2
    const/4 p1, 0x1

    iput p1, p0, LU1/q;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LU1/q;->b:LN1/Y;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, LU1/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LV1/i;

    .line 7
    .line 8
    iget-object v0, p1, LV1/i;->o:LE4/n;

    .line 9
    .line 10
    iget-object v1, p0, LU1/q;->b:LN1/Y;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v2, v0, LE4/n;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, LN1/n;

    .line 17
    .line 18
    iget v3, v2, LN1/n;->v:I

    .line 19
    .line 20
    const/4 v4, -0x1

    .line 21
    if-ne v3, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2}, LN1/n;->a()LN1/m;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget v3, v1, LN1/Y;->a:I

    .line 28
    .line 29
    iput v3, v2, LN1/m;->t:I

    .line 30
    .line 31
    iget v3, v1, LN1/Y;->b:I

    .line 32
    .line 33
    iput v3, v2, LN1/m;->u:I

    .line 34
    .line 35
    new-instance v3, LN1/n;

    .line 36
    .line 37
    invoke-direct {v3, v2}, LN1/n;-><init>(LN1/m;)V

    .line 38
    .line 39
    .line 40
    new-instance v2, LE4/n;

    .line 41
    .line 42
    iget v4, v0, LE4/n;->b:I

    .line 43
    .line 44
    iget-object v0, v0, LE4/n;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Ljava/lang/String;

    .line 47
    .line 48
    const/4 v5, 0x4

    .line 49
    invoke-direct {v2, v0, v4, v5, v3}, LE4/n;-><init>(Ljava/lang/String;IILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object v2, p1, LV1/i;->o:LE4/n;

    .line 53
    .line 54
    :cond_0
    iget p1, v1, LN1/Y;->a:I

    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_0
    check-cast p1, LN1/H;

    .line 58
    .line 59
    iget-object v0, p0, LU1/q;->b:LN1/Y;

    .line 60
    .line 61
    invoke-interface {p1, v0}, LN1/H;->p(LN1/Y;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
