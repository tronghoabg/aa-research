.class public final Lz/t;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lz/v;


# direct methods
.method public constructor <init>(Lz/v;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lz/t;->i:I

    .line 1
    iput-object p1, p0, Lz/t;->j:Lz/v;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lz/v;J)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, Lz/t;->i:I

    .line 2
    iput-object p1, p0, Lz/t;->j:Lz/v;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lz/t;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LA/N;

    .line 7
    .line 8
    const-string v0, "$this$null"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lz/f;->a:Lz/f;

    .line 14
    .line 15
    sget-object v1, Lz/f;->b:Lz/f;

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1}, LA/N;->a(Lz/f;Lz/f;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v2, p0, Lz/t;->j:Lz/v;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object p1, v2, Lz/v;->b:LN/V;

    .line 26
    .line 27
    invoke-interface {p1}, LN/K0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    sget-object p1, Lz/i;->d:LA/F;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    sget-object v0, Lz/f;->c:Lz/f;

    .line 43
    .line 44
    invoke-virtual {p1, v1, v0}, LA/N;->a(Lz/f;Lz/f;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    iget-object p1, v2, Lz/v;->c:LN/V;

    .line 51
    .line 52
    invoke-interface {p1}, LN/K0;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    sget-object p1, Lz/i;->d:LA/F;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 62
    .line 63
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_3
    sget-object p1, Lz/i;->d:LA/F;

    .line 68
    .line 69
    :goto_0
    return-object p1

    .line 70
    :pswitch_0
    check-cast p1, Lz/f;

    .line 71
    .line 72
    const-string v0, "it"

    .line 73
    .line 74
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lz/t;->j:Lz/v;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v1, v0, Lz/v;->b:LN/V;

    .line 83
    .line 84
    invoke-interface {v1}, LN/K0;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-nez v1, :cond_7

    .line 89
    .line 90
    sget-wide v1, LL0/g;->b:J

    .line 91
    .line 92
    iget-object v0, v0, Lz/v;->c:LN/V;

    .line 93
    .line 94
    invoke-interface {v0}, LN/K0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-nez v0, :cond_6

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_5

    .line 105
    .line 106
    const/4 v0, 0x1

    .line 107
    if-eq p1, v0, :cond_5

    .line 108
    .line 109
    const/4 v0, 0x2

    .line 110
    if-ne p1, v0, :cond_4

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_4
    new-instance p1, LE5/Q;

    .line 114
    .line 115
    const/16 v0, 0x9

    .line 116
    .line 117
    const/4 v1, 0x0

    .line 118
    invoke-direct {p1, v1, v0}, LE5/Q;-><init>(BI)V

    .line 119
    .line 120
    .line 121
    throw p1

    .line 122
    :cond_5
    :goto_1
    new-instance p1, LL0/g;

    .line 123
    .line 124
    invoke-direct {p1, v1, v2}, LL0/g;-><init>(J)V

    .line 125
    .line 126
    .line 127
    return-object p1

    .line 128
    :cond_6
    new-instance p1, Ljava/lang/ClassCastException;

    .line 129
    .line 130
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 131
    .line 132
    .line 133
    throw p1

    .line 134
    :cond_7
    new-instance p1, Ljava/lang/ClassCastException;

    .line 135
    .line 136
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 137
    .line 138
    .line 139
    throw p1

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
