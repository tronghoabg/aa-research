.class public final LVa/Ta;
.super LVa/Ba;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final synthetic d:LVa/va;

.field public final synthetic e:LVa/Xa;


# direct methods
.method public synthetic constructor <init>(LVa/Xa;LVa/va;I)V
    .locals 0

    .line 1
    iput p3, p0, LVa/Ta;->c:I

    iput-object p1, p0, LVa/Ta;->e:LVa/Xa;

    iput-object p2, p0, LVa/Ta;->d:LVa/va;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    .line 1
    iget v0, p0, LVa/Ta;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LVa/Ta;->e:LVa/Xa;

    .line 7
    .line 8
    iget-object v0, v0, LVa/Xa;->c:Ljava/io/Serializable;

    .line 9
    .line 10
    check-cast v0, Ljava/util/HashMap;

    .line 11
    .line 12
    iget-object v1, p0, LVa/Ta;->d:LVa/va;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, LVa/Ta;->e:LVa/Xa;

    .line 19
    .line 20
    iget-object v1, v0, LVa/Xa;->c:Ljava/io/Serializable;

    .line 21
    .line 22
    check-cast v1, Ljava/util/HashMap;

    .line 23
    .line 24
    new-instance v2, LVa/v;

    .line 25
    .line 26
    const/16 v3, 0x12

    .line 27
    .line 28
    invoke-direct {v2, v3}, LVa/v;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object p0, v2, LVa/v;->d:Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v3, p0, LVa/Ta;->d:LVa/va;

    .line 34
    .line 35
    invoke-virtual {v1, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, LVa/Xa;->k(LVa/Xa;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
