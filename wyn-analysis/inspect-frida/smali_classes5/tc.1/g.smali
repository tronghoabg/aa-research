.class public final Ltc/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/q;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ltc/g;->a:I

    iput-object p2, p0, Ltc/g;->c:Ljava/lang/Object;

    iput-object p3, p0, Ltc/g;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final d()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Ltc/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltc/g;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lt6/q;

    .line 9
    .line 10
    iget-object v0, v0, Lt6/q;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Luc/r;

    .line 13
    .line 14
    iget-object v0, v0, Luc/r;->c:Luc/s;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Luc/s;->b(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p0, Ltc/g;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lmc/g;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lmc/g;->a(Ljava/nio/ByteBuffer;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object p1, p0, Ltc/g;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lq/o;

    .line 31
    .line 32
    iget-object v0, p0, Ltc/g;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, [B

    .line 35
    .line 36
    iput-object v0, p1, Lq/o;->f:Ljava/lang/Object;

    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Ltc/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltc/g;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lt6/q;

    .line 9
    .line 10
    iget-object v0, v0, Lt6/q;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Luc/r;

    .line 13
    .line 14
    iget-object v0, v0, Luc/r;->c:Luc/s;

    .line 15
    .line 16
    invoke-interface {v0, p1, p2, p3}, Luc/s;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p2, p0, Ltc/g;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p2, Lmc/g;

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Lmc/g;->a(Ljava/nio/ByteBuffer;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    new-instance p3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v0, "Error "

    .line 31
    .line 32
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p1, " while sending restoration data to framework: "

    .line 39
    .line 40
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string p2, "RestorationChannel"

    .line 51
    .line 52
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()V
    .locals 2

    .line 1
    iget v0, p0, Ltc/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltc/g;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lmc/g;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Lmc/g;->a(Ljava/nio/ByteBuffer;)V

    .line 12
    .line 13
    .line 14
    :pswitch_0
    return-void

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
