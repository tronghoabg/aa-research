.class public final LK/s;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, LK/s;->i:I

    iput-object p1, p0, LK/s;->j:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LK/s;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lx0/g;

    .line 7
    .line 8
    const-string v0, "$this$fakeSemanticsNode"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, LK/s;->j:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p1, v0}, Lx0/p;->a(Lx0/g;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sget-object p1, Lef/C;->a:Lef/C;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_0
    check-cast p1, Lx0/g;

    .line 22
    .line 23
    const-string v0, "$this$semantics"

    .line 24
    .line 25
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, LK/s;->j:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p1, v0}, Lx0/p;->c(Lx0/g;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lef/C;->a:Lef/C;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_1
    check-cast p1, Lx0/g;

    .line 37
    .line 38
    const-string v0, "$this$semantics"

    .line 39
    .line 40
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, LK/s;->j:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {p1, v0}, Lx0/p;->a(Lx0/g;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x5

    .line 49
    invoke-static {p1, v0}, Lx0/p;->b(Lx0/g;I)V

    .line 50
    .line 51
    .line 52
    sget-object p1, Lef/C;->a:Lef/C;

    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
