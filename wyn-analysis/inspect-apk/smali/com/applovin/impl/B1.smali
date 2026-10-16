.class public final synthetic Lcom/applovin/impl/B1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lcom/applovin/impl/B1;->a:I

    iput-object p1, p0, Lcom/applovin/impl/B1;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/applovin/impl/B1;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/applovin/impl/B1;->d:Ljava/lang/Object;

    iput-object p4, p0, Lcom/applovin/impl/B1;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/applovin/impl/B1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/applovin/impl/B1;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ls6/i;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/applovin/impl/B1;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, LE5/w0;

    .line 16
    .line 17
    check-cast v0, LE5/I;

    .line 18
    .line 19
    invoke-virtual {v0}, LE5/I;->v0()Lr6/f;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v2, Lr6/e;

    .line 27
    .line 28
    invoke-direct {v2, v1}, Lr6/e;-><init>(Lr6/f;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lr6/p;

    .line 32
    .line 33
    iget-object v3, p0, Lcom/applovin/impl/B1;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, Ls6/r;

    .line 36
    .line 37
    iget v4, v3, Ls6/r;->b:I

    .line 38
    .line 39
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-static {v4}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    iget-object v5, p0, Lcom/applovin/impl/B1;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v5, Lf6/Z;

    .line 50
    .line 51
    invoke-direct {v1, v5, v4}, Lr6/p;-><init>(Lf6/Z;Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    iget-object v4, v1, Lr6/p;->a:Lf6/Z;

    .line 55
    .line 56
    iget v5, v4, Lf6/Z;->c:I

    .line 57
    .line 58
    invoke-virtual {v2, v5}, Lr6/q;->a(I)V

    .line 59
    .line 60
    .line 61
    iget-object v5, v2, Lr6/q;->y:Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-virtual {v5, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    iget-object v1, v3, Ls6/r;->a:LE5/K0;

    .line 67
    .line 68
    iget-object v1, v1, LE5/K0;->b:Lf6/Z;

    .line 69
    .line 70
    iget v1, v1, Lf6/Z;->c:I

    .line 71
    .line 72
    invoke-virtual {v2, v1}, Lr6/e;->e(I)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lr6/f;

    .line 76
    .line 77
    invoke-direct {v1, v2}, Lr6/f;-><init>(Lr6/e;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, LE5/I;->K0(Lr6/r;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, v3, Ls6/r;->c:Ljava/lang/String;

    .line 84
    .line 85
    iget v1, p1, Ls6/i;->k:I

    .line 86
    .line 87
    packed-switch v1, :pswitch_data_1

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :pswitch_0
    iget-object v1, p1, Ls6/i;->l:Ls6/t;

    .line 92
    .line 93
    iget-object v1, v1, Ls6/t;->f:Ls6/p;

    .line 94
    .line 95
    iget-object v1, v1, Ls6/p;->j:[Ljava/lang/String;

    .line 96
    .line 97
    const/4 v2, 0x1

    .line 98
    aput-object v0, v1, v2

    .line 99
    .line 100
    :goto_0
    iget-object p1, p1, Ls6/i;->j:Ls6/t;

    .line 101
    .line 102
    iget-object p1, p1, Ls6/t;->k:Landroid/widget/PopupWindow;

    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :pswitch_1
    iget-object v0, p0, Lcom/applovin/impl/B1;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Lcom/applovin/impl/z1;

    .line 111
    .line 112
    iget-object v1, p0, Lcom/applovin/impl/B1;->c:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, Lcom/applovin/impl/sdk/ad/b;

    .line 115
    .line 116
    iget-object v2, p0, Lcom/applovin/impl/B1;->d:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v2, Lcom/applovin/impl/sdk/k;

    .line 119
    .line 120
    iget-object v3, p0, Lcom/applovin/impl/B1;->e:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v3, Landroid/app/Activity;

    .line 123
    .line 124
    invoke-static {v0, v1, v2, v3, p1}, Lcom/applovin/impl/z1;->V(Lcom/applovin/impl/z1;Lcom/applovin/impl/sdk/ad/b;Lcom/applovin/impl/sdk/k;Landroid/app/Activity;Landroid/view/View;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
