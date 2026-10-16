.class public final Lz/g;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lz/j;

.field public final synthetic k:Lz/k;


# direct methods
.method public synthetic constructor <init>(Lz/j;Lz/k;I)V
    .locals 0

    .line 1
    iput p3, p0, Lz/g;->i:I

    iput-object p1, p0, Lz/g;->j:Lz/j;

    iput-object p2, p0, Lz/g;->k:Lz/k;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lz/g;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LA/N;

    .line 7
    .line 8
    check-cast p2, LN/o;

    .line 9
    .line 10
    check-cast p3, Ljava/lang/Number;

    .line 11
    .line 12
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 13
    .line 14
    .line 15
    const-string p3, "$this$animateFloat"

    .line 16
    .line 17
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const p3, -0x337bb23

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, p3}, LN/o;->M(I)V

    .line 24
    .line 25
    .line 26
    sget-object p3, Lz/f;->a:Lz/f;

    .line 27
    .line 28
    sget-object v0, Lz/f;->b:Lz/f;

    .line 29
    .line 30
    invoke-virtual {p1, p3, v0}, LA/N;->a(Lz/f;Lz/f;)Z

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    if-eqz p3, :cond_0

    .line 35
    .line 36
    iget-object p1, p0, Lz/g;->j:Lz/j;

    .line 37
    .line 38
    iget-object p1, p1, Lz/j;->a:Lz/w;

    .line 39
    .line 40
    sget-object p1, Lz/i;->c:LA/F;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    sget-object p3, Lz/f;->c:Lz/f;

    .line 44
    .line 45
    invoke-virtual {p1, v0, p3}, LA/N;->a(Lz/f;Lz/f;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    iget-object p1, p0, Lz/g;->k:Lz/k;

    .line 52
    .line 53
    iget-object p1, p1, Lz/k;->a:Lz/w;

    .line 54
    .line 55
    sget-object p1, Lz/i;->c:LA/F;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    sget-object p1, Lz/i;->c:LA/F;

    .line 59
    .line 60
    :goto_0
    const/4 p3, 0x0

    .line 61
    invoke-virtual {p2, p3}, LN/o;->p(Z)V

    .line 62
    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_0
    check-cast p1, LA/N;

    .line 66
    .line 67
    check-cast p2, LN/o;

    .line 68
    .line 69
    check-cast p3, Ljava/lang/Number;

    .line 70
    .line 71
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 72
    .line 73
    .line 74
    const-string p3, "$this$animateFloat"

    .line 75
    .line 76
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const p3, -0x3681844

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, p3}, LN/o;->M(I)V

    .line 83
    .line 84
    .line 85
    sget-object p3, Lz/f;->a:Lz/f;

    .line 86
    .line 87
    sget-object v0, Lz/f;->b:Lz/f;

    .line 88
    .line 89
    invoke-virtual {p1, p3, v0}, LA/N;->a(Lz/f;Lz/f;)Z

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    if-eqz p3, :cond_3

    .line 94
    .line 95
    iget-object p1, p0, Lz/g;->j:Lz/j;

    .line 96
    .line 97
    iget-object p1, p1, Lz/j;->a:Lz/w;

    .line 98
    .line 99
    iget-object p1, p1, Lz/w;->a:Lz/o;

    .line 100
    .line 101
    if-eqz p1, :cond_2

    .line 102
    .line 103
    iget-object p1, p1, Lz/o;->a:LA/u;

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    sget-object p1, Lz/i;->c:LA/F;

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    sget-object p3, Lz/f;->c:Lz/f;

    .line 110
    .line 111
    invoke-virtual {p1, v0, p3}, LA/N;->a(Lz/f;Lz/f;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_5

    .line 116
    .line 117
    iget-object p1, p0, Lz/g;->k:Lz/k;

    .line 118
    .line 119
    iget-object p1, p1, Lz/k;->a:Lz/w;

    .line 120
    .line 121
    iget-object p1, p1, Lz/w;->a:Lz/o;

    .line 122
    .line 123
    if-eqz p1, :cond_4

    .line 124
    .line 125
    iget-object p1, p1, Lz/o;->a:LA/u;

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_4
    sget-object p1, Lz/i;->c:LA/F;

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_5
    sget-object p1, Lz/i;->c:LA/F;

    .line 132
    .line 133
    :goto_1
    const/4 p3, 0x0

    .line 134
    invoke-virtual {p2, p3}, LN/o;->p(Z)V

    .line 135
    .line 136
    .line 137
    return-object p1

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
