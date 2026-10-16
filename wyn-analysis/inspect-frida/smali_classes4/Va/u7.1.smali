.class public final LVa/u7;
.super LVa/xa;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public synthetic d:Ljava/lang/String;

.field public synthetic e:Ljava/util/List;

.field public synthetic f:LVa/y7;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/u7;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 5

    .line 1
    iget v0, p0, LVa/u7;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, LVa/u7;->e:Ljava/util/List;

    .line 8
    .line 9
    iget-object v2, p0, LVa/u7;->f:LVa/y7;

    .line 10
    .line 11
    iget-object v3, p0, LVa/u7;->d:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    invoke-static {v2, v3, v4, v0, v1}, LVa/y7;->s(LVa/y7;Ljava/lang/String;ZZLjava/util/List;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    const/4 v0, 0x1

    .line 19
    iget-object v1, p0, LVa/u7;->e:Ljava/util/List;

    .line 20
    .line 21
    iget-object v2, p0, LVa/u7;->f:LVa/y7;

    .line 22
    .line 23
    iget-object v3, p0, LVa/u7;->d:Ljava/lang/String;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-static {v2, v3, v4, v0, v1}, LVa/y7;->s(LVa/y7;Ljava/lang/String;ZZLjava/util/List;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    const/4 v0, 0x0

    .line 31
    iget-object v1, p0, LVa/u7;->e:Ljava/util/List;

    .line 32
    .line 33
    iget-object v2, p0, LVa/u7;->f:LVa/y7;

    .line 34
    .line 35
    iget-object v3, p0, LVa/u7;->d:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v2, v3, v0, v0, v1}, LVa/y7;->s(LVa/y7;Ljava/lang/String;ZZLjava/util/List;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
