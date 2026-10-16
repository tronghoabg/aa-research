.class public final LE9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/a;


# instance fields
.field public final synthetic a:I

.field public final b:Ldf/a;

.field public final c:Ldf/a;

.field public final d:LG9/f;


# direct methods
.method public synthetic constructor <init>(Ldf/a;Ldf/a;LG9/f;I)V
    .locals 0

    .line 1
    iput p4, p0, LE9/b;->a:I

    iput-object p1, p0, LE9/b;->b:Ldf/a;

    iput-object p2, p0, LE9/b;->c:Ldf/a;

    iput-object p3, p0, LE9/b;->d:LG9/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LE9/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LE9/b;->b:Ldf/a;

    .line 7
    .line 8
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LD9/k;

    .line 13
    .line 14
    iget-object v1, p0, LE9/b;->c:Ldf/a;

    .line 15
    .line 16
    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroid/view/LayoutInflater;

    .line 21
    .line 22
    iget-object v2, p0, LE9/b;->d:LG9/f;

    .line 23
    .line 24
    invoke-virtual {v2}, LG9/f;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, LN9/h;

    .line 29
    .line 30
    new-instance v3, LE9/g;

    .line 31
    .line 32
    invoke-direct {v3, v0, v1, v2}, LE9/c;-><init>(LD9/k;Landroid/view/LayoutInflater;LN9/h;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, LE9/d;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, v3, v1}, LE9/d;-><init>(Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    iput-object v0, v3, LE9/g;->m:LE9/d;

    .line 42
    .line 43
    return-object v3

    .line 44
    :pswitch_0
    iget-object v0, p0, LE9/b;->b:Ldf/a;

    .line 45
    .line 46
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, LD9/k;

    .line 51
    .line 52
    iget-object v1, p0, LE9/b;->c:Ldf/a;

    .line 53
    .line 54
    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Landroid/view/LayoutInflater;

    .line 59
    .line 60
    iget-object v2, p0, LE9/b;->d:LG9/f;

    .line 61
    .line 62
    invoke-virtual {v2}, LG9/f;->get()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, LN9/h;

    .line 67
    .line 68
    new-instance v3, LE9/f;

    .line 69
    .line 70
    invoke-direct {v3, v0, v1, v2}, LE9/c;-><init>(LD9/k;Landroid/view/LayoutInflater;LN9/h;)V

    .line 71
    .line 72
    .line 73
    return-object v3

    .line 74
    :pswitch_1
    iget-object v0, p0, LE9/b;->b:Ldf/a;

    .line 75
    .line 76
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, LD9/k;

    .line 81
    .line 82
    iget-object v1, p0, LE9/b;->c:Ldf/a;

    .line 83
    .line 84
    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Landroid/view/LayoutInflater;

    .line 89
    .line 90
    iget-object v2, p0, LE9/b;->d:LG9/f;

    .line 91
    .line 92
    invoke-virtual {v2}, LG9/f;->get()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, LN9/h;

    .line 97
    .line 98
    new-instance v3, LE9/e;

    .line 99
    .line 100
    invoke-direct {v3, v0, v1, v2}, LE9/c;-><init>(LD9/k;Landroid/view/LayoutInflater;LN9/h;)V

    .line 101
    .line 102
    .line 103
    new-instance v0, LE9/d;

    .line 104
    .line 105
    const/4 v1, 0x0

    .line 106
    invoke-direct {v0, v3, v1}, LE9/d;-><init>(Ljava/lang/Object;I)V

    .line 107
    .line 108
    .line 109
    iput-object v0, v3, LE9/e;->n:LE9/d;

    .line 110
    .line 111
    return-object v3

    .line 112
    :pswitch_2
    iget-object v0, p0, LE9/b;->b:Ldf/a;

    .line 113
    .line 114
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, LD9/k;

    .line 119
    .line 120
    iget-object v1, p0, LE9/b;->c:Ldf/a;

    .line 121
    .line 122
    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Landroid/view/LayoutInflater;

    .line 127
    .line 128
    iget-object v2, p0, LE9/b;->d:LG9/f;

    .line 129
    .line 130
    invoke-virtual {v2}, LG9/f;->get()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, LN9/h;

    .line 135
    .line 136
    new-instance v3, LE9/a;

    .line 137
    .line 138
    invoke-direct {v3, v0, v1, v2}, LE9/c;-><init>(LD9/k;Landroid/view/LayoutInflater;LN9/h;)V

    .line 139
    .line 140
    .line 141
    return-object v3

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
