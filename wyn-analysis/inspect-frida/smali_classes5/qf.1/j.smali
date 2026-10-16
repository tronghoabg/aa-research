.class public final synthetic Lqf/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lqf/j;->a:I

    iput-object p1, p0, Lqf/j;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lqf/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    iget-object p1, p0, Lqf/j;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, LAd/e;

    .line 11
    .line 12
    invoke-virtual {p1}, Lzd/e;->close()V

    .line 13
    .line 14
    .line 15
    sget-object p1, Lef/C;->a:Lef/C;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    check-cast p1, Lwd/c;

    .line 19
    .line 20
    const-string v0, "scope"

    .line 21
    .line 22
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, LCd/H;->a:LNd/a;

    .line 26
    .line 27
    new-instance v1, Lcom/moloco/sdk/service_locator/h;

    .line 28
    .line 29
    const/16 v2, 0x1d

    .line 30
    .line 31
    invoke-direct {v1, v2}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iget-object v2, p1, Lwd/c;->i:LNd/d;

    .line 35
    .line 36
    invoke-virtual {v2, v0, v1}, LNd/d;->a(LNd/a;Ltf/a;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, LNd/d;

    .line 41
    .line 42
    iget-object v1, p1, Lwd/c;->k:Lwd/d;

    .line 43
    .line 44
    iget-object v1, v1, Lwd/d;->b:Ljava/util/LinkedHashMap;

    .line 45
    .line 46
    iget-object v2, p0, Lqf/j;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, LCd/G;

    .line 49
    .line 50
    invoke-interface {v2}, LCd/G;->getKey()LNd/a;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    check-cast v1, Ltf/l;

    .line 62
    .line 63
    invoke-interface {v2, v1}, LCd/G;->b(Ltf/l;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-interface {v2, v1, p1}, LCd/G;->g(Ljava/lang/Object;Lwd/c;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v2}, LCd/G;->getKey()LNd/a;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v0, p1, v1}, LNd/d;->e(LNd/a;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    sget-object p1, Lef/C;->a:Lef/C;

    .line 78
    .line 79
    return-object p1

    .line 80
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 81
    .line 82
    const-string v0, "it"

    .line 83
    .line 84
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lqf/j;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    sget-object p1, Lef/C;->a:Lef/C;

    .line 95
    .line 96
    return-object p1

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
