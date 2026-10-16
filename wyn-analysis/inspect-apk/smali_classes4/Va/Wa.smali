.class public final LVa/Wa;
.super LVa/Ba;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public synthetic d:LVa/q;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/Wa;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    .line 1
    iget v0, p0, LVa/Wa;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LVa/Wa;->d:LVa/q;

    .line 7
    .line 8
    iget-object v0, v0, LVa/q;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LVa/Va;

    .line 11
    .line 12
    iget-object v0, v0, LVa/Va;->d:LVa/Xa;

    .line 13
    .line 14
    new-instance v1, LVa/Va;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-direct {v1, v2}, LVa/Va;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, v1, LVa/Va;->d:LVa/Xa;

    .line 21
    .line 22
    invoke-static {v1}, LVa/Cb;->j(LVa/Ba;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object v0, p0, LVa/Wa;->d:LVa/q;

    .line 27
    .line 28
    iget-object v0, v0, LVa/q;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, LVa/Va;

    .line 31
    .line 32
    iget-object v0, v0, LVa/Va;->d:LVa/Xa;

    .line 33
    .line 34
    invoke-static {v0}, LVa/Xa;->k(LVa/Xa;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
