.class public final LVc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/i;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Lm9/n;

.field public d:I

.field public e:Lm9/L;

.field public f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVc/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget p1, p0, LVc/b;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LVc/b;->e:Lm9/L;

    .line 7
    .line 8
    check-cast p1, Lm9/l;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lm9/l;->remove()V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, LVc/b;->e:Lm9/L;

    .line 17
    .line 18
    :cond_0
    return-void

    .line 19
    :pswitch_0
    iget-object p1, p0, LVc/b;->e:Lm9/L;

    .line 20
    .line 21
    check-cast p1, Lm9/l;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Lm9/l;->remove()V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    iput-object p1, p0, LVc/b;->e:Lm9/L;

    .line 30
    .line 31
    :cond_1
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onListen(Ljava/lang/Object;Luc/g;)V
    .locals 8

    .line 1
    iget p1, p0, LVc/b;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p1, Lw9/k;->a:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iget v0, p0, LVc/b;->b:I

    .line 9
    .line 10
    const-string v1, "metadataChanges must not be null."

    .line 11
    .line 12
    invoke-static {v0, v1}, Lpd/f;->o(ILjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget v1, p0, LVc/b;->d:I

    .line 16
    .line 17
    const-string v2, "listen source must not be null."

    .line 18
    .line 19
    invoke-static {v1, v2}, Lpd/f;->o(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, LVc/a;

    .line 23
    .line 24
    check-cast p2, Luc/h;

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    invoke-direct {v2, v3, p0, p2}, LVc/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p2, p0, LVc/b;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p2, Lm9/W;

    .line 33
    .line 34
    new-instance v3, Lp9/g;

    .line 35
    .line 36
    invoke-direct {v3}, Lp9/g;-><init>()V

    .line 37
    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    const/4 v5, 0x2

    .line 41
    const/4 v6, 0x0

    .line 42
    if-ne v0, v5, :cond_0

    .line 43
    .line 44
    move v7, v4

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v7, v6

    .line 47
    :goto_0
    iput-boolean v7, v3, Lp9/g;->a:Z

    .line 48
    .line 49
    if-ne v0, v5, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move v4, v6

    .line 53
    :goto_1
    iput-boolean v4, v3, Lp9/g;->b:Z

    .line 54
    .line 55
    iput-boolean v6, v3, Lp9/g;->c:Z

    .line 56
    .line 57
    iput v1, v3, Lp9/g;->d:I

    .line 58
    .line 59
    invoke-virtual {p2, p1, v3, v2}, Lm9/W;->a(Ljava/util/concurrent/Executor;Lp9/g;Lm9/p;)Lm9/l;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, LVc/b;->e:Lm9/L;

    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_0
    sget-object p1, Lw9/k;->a:Ljava/util/concurrent/Executor;

    .line 67
    .line 68
    iget v0, p0, LVc/b;->b:I

    .line 69
    .line 70
    const-string v1, "metadataChanges must not be null."

    .line 71
    .line 72
    invoke-static {v0, v1}, Lpd/f;->o(ILjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget v1, p0, LVc/b;->d:I

    .line 76
    .line 77
    const-string v2, "listen source must not be null."

    .line 78
    .line 79
    invoke-static {v1, v2}, Lpd/f;->o(ILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    new-instance v2, LVc/a;

    .line 83
    .line 84
    check-cast p2, Luc/h;

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-direct {v2, v3, p0, p2}, LVc/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object p2, p0, LVc/b;->f:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p2, Lm9/m;

    .line 93
    .line 94
    new-instance v3, Lp9/g;

    .line 95
    .line 96
    invoke-direct {v3}, Lp9/g;-><init>()V

    .line 97
    .line 98
    .line 99
    const/4 v4, 0x1

    .line 100
    const/4 v5, 0x2

    .line 101
    const/4 v6, 0x0

    .line 102
    if-ne v0, v5, :cond_2

    .line 103
    .line 104
    move v7, v4

    .line 105
    goto :goto_2

    .line 106
    :cond_2
    move v7, v6

    .line 107
    :goto_2
    iput-boolean v7, v3, Lp9/g;->a:Z

    .line 108
    .line 109
    if-ne v0, v5, :cond_3

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_3
    move v4, v6

    .line 113
    :goto_3
    iput-boolean v4, v3, Lp9/g;->b:Z

    .line 114
    .line 115
    iput-boolean v6, v3, Lp9/g;->c:Z

    .line 116
    .line 117
    iput v1, v3, Lp9/g;->d:I

    .line 118
    .line 119
    invoke-virtual {p2, p1, v3, v2}, Lm9/m;->a(Ljava/util/concurrent/Executor;Lp9/g;Lm9/p;)Lm9/l;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iput-object p1, p0, LVc/b;->e:Lm9/L;

    .line 124
    .line 125
    return-void

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
