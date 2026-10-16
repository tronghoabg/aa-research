.class public final LUe/a;
.super LHe/n;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:LHe/n;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LHe/n;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LUe/a;->a:I

    iput-object p1, p0, LUe/a;->b:LHe/n;

    iput-object p2, p0, LUe/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(LHe/o;)V
    .locals 3

    .line 1
    iget v0, p0, LUe/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LSe/i;

    .line 7
    .line 8
    iget-object v1, p0, LUe/a;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LA7/h0;

    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    invoke-direct {v0, v2, p1, v1}, LSe/i;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LUe/a;->b:LHe/n;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, LHe/n;->b(LHe/o;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    new-instance v0, LS3/e;

    .line 23
    .line 24
    const/16 v1, 0x15

    .line 25
    .line 26
    invoke-direct {v0, v1, p0, p1}, LS3/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, LUe/a;->b:LHe/n;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, LHe/n;->b(LHe/o;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_1
    new-instance v0, LS3/c;

    .line 36
    .line 37
    const/16 v1, 0x1a

    .line 38
    .line 39
    invoke-direct {v0, v1, p0, p1}, LS3/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, LUe/a;->b:LHe/n;

    .line 43
    .line 44
    check-cast p1, LTe/d;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, LHe/n;->b(LHe/o;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
