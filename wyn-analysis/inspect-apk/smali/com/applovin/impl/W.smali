.class public final synthetic Lcom/applovin/impl/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;JI)V
    .locals 0

    .line 1
    iput p5, p0, Lcom/applovin/impl/W;->a:I

    iput-object p1, p0, Lcom/applovin/impl/W;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcom/applovin/impl/W;->d:Ljava/lang/Object;

    iput-wide p3, p0, Lcom/applovin/impl/W;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-wide v0, p0, Lcom/applovin/impl/W;->b:J

    .line 2
    .line 3
    iget-object v2, p0, Lcom/applovin/impl/W;->d:Ljava/lang/Object;

    .line 4
    .line 5
    const/16 v3, 0x1a

    .line 6
    .line 7
    iget-object v4, p0, Lcom/applovin/impl/W;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget v5, p0, Lcom/applovin/impl/W;->a:I

    .line 10
    .line 11
    packed-switch v5, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v4, LG5/p;

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget v0, Lu6/v;->a:I

    .line 20
    .line 21
    iget-object v0, v4, LG5/p;->c:LE5/F;

    .line 22
    .line 23
    iget-object v0, v0, LE5/F;->a:LE5/I;

    .line 24
    .line 25
    iget-object v1, v0, LE5/I;->r:LF5/f;

    .line 26
    .line 27
    invoke-virtual {v1}, LF5/f;->N()LF5/a;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    new-instance v4, LF5/c;

    .line 32
    .line 33
    iget-wide v7, p0, Lcom/applovin/impl/W;->b:J

    .line 34
    .line 35
    iget-object v6, p0, Lcom/applovin/impl/W;->d:Ljava/lang/Object;

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    invoke-direct/range {v4 .. v9}, LF5/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;JI)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v5, v3, v4}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, v0, LE5/I;->R:Ljava/lang/Object;

    .line 45
    .line 46
    if-ne v1, v6, :cond_0

    .line 47
    .line 48
    new-instance v1, LA5/f;

    .line 49
    .line 50
    const/4 v2, 0x6

    .line 51
    invoke-direct {v1, v2}, LA5/f;-><init>(I)V

    .line 52
    .line 53
    .line 54
    iget-object v0, v0, LE5/I;->l:LK8/H;

    .line 55
    .line 56
    invoke-virtual {v0, v3, v1}, LK8/H;->p(ILu6/g;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void

    .line 60
    :pswitch_0
    check-cast v4, LX2/j;

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    sget v0, LQ1/x;->a:I

    .line 66
    .line 67
    iget-object v0, v4, LX2/j;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, LU1/r;

    .line 70
    .line 71
    iget-object v0, v0, LU1/r;->a:LU1/u;

    .line 72
    .line 73
    iget-object v1, v0, LU1/u;->r:LV1/d;

    .line 74
    .line 75
    invoke-virtual {v1}, LV1/d;->K()LV1/a;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    new-instance v4, LF5/c;

    .line 80
    .line 81
    iget-wide v7, p0, Lcom/applovin/impl/W;->b:J

    .line 82
    .line 83
    iget-object v6, p0, Lcom/applovin/impl/W;->d:Ljava/lang/Object;

    .line 84
    .line 85
    const/4 v9, 0x2

    .line 86
    invoke-direct/range {v4 .. v9}, LF5/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;JI)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v5, v3, v4}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 90
    .line 91
    .line 92
    iget-object v1, v0, LU1/u;->N:Landroid/view/Surface;

    .line 93
    .line 94
    if-ne v1, v6, :cond_1

    .line 95
    .line 96
    new-instance v1, LJ9/x;

    .line 97
    .line 98
    invoke-direct {v1, v3}, LJ9/x;-><init>(I)V

    .line 99
    .line 100
    .line 101
    iget-object v0, v0, LU1/u;->l:LQ1/j;

    .line 102
    .line 103
    invoke-virtual {v0, v3, v1}, LQ1/j;->e(ILQ1/g;)V

    .line 104
    .line 105
    .line 106
    :cond_1
    return-void

    .line 107
    :pswitch_1
    check-cast v4, Lcom/bytedance/sdk/component/bcc/uef/ivm;

    .line 108
    .line 109
    check-cast v2, Ljava/lang/Runnable;

    .line 110
    .line 111
    invoke-static {v4, v2, v0, v1}, Lcom/bytedance/sdk/component/bcc/uef/ivm;->a(Lcom/bytedance/sdk/component/bcc/uef/ivm;Ljava/lang/Runnable;J)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :pswitch_2
    check-cast v4, Lcom/applovin/impl/j5;

    .line 116
    .line 117
    check-cast v2, Ljava/lang/Thread;

    .line 118
    .line 119
    invoke-static {v4, v2, v0, v1}, Lcom/applovin/impl/j5;->a(Lcom/applovin/impl/j5;Ljava/lang/Thread;J)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
