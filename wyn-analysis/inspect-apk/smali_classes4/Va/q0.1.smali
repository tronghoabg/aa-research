.class public final LVa/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# instance fields
.field public final synthetic a:I

.field public synthetic b:LVa/W0;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/q0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LVa/q0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LVa/U0;

    .line 7
    .line 8
    sget v1, LVa/W0;->T:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1d

    .line 11
    .line 12
    rem-int/lit16 v2, v1, 0x80

    .line 13
    .line 14
    sput v2, LVa/W0;->U:I

    .line 15
    .line 16
    rem-int/lit8 v1, v1, 0x2

    .line 17
    .line 18
    const-class v2, Lx6/k;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    :goto_0
    invoke-static {p1, v1, v2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    goto :goto_0

    .line 30
    :goto_1
    check-cast p1, Lx6/k;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, LVa/q0;->b:LVa/W0;

    .line 36
    .line 37
    iput-object v1, v0, LVa/U0;->c:LVa/W0;

    .line 38
    .line 39
    iput-object p1, v0, LVa/U0;->a:Lx6/k;

    .line 40
    .line 41
    iput-object p2, v0, LVa/U0;->b:LVa/Ra;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_0
    new-instance v0, LVa/S0;

    .line 45
    .line 46
    sget v1, LVa/W0;->U:I

    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x33

    .line 49
    .line 50
    rem-int/lit16 v1, v1, 0x80

    .line 51
    .line 52
    sput v1, LVa/W0;->T:I

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    const-class v2, Lz6/a;

    .line 56
    .line 57
    invoke-static {p1, v1, v2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    sget v1, LVa/W0;->U:I

    .line 62
    .line 63
    add-int/lit8 v1, v1, 0x5

    .line 64
    .line 65
    rem-int/lit16 v1, v1, 0x80

    .line 66
    .line 67
    sput v1, LVa/W0;->T:I

    .line 68
    .line 69
    check-cast p1, Lz6/a;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, LVa/q0;->b:LVa/W0;

    .line 75
    .line 76
    iput-object v1, v0, LVa/S0;->c:LVa/W0;

    .line 77
    .line 78
    iput-object p1, v0, LVa/S0;->a:Lz6/a;

    .line 79
    .line 80
    iput-object p2, v0, LVa/S0;->b:LVa/Ra;

    .line 81
    .line 82
    return-object v0

    .line 83
    :pswitch_1
    new-instance v0, LVa/T0;

    .line 84
    .line 85
    sget v1, LVa/W0;->T:I

    .line 86
    .line 87
    add-int/lit8 v1, v1, 0x1f

    .line 88
    .line 89
    rem-int/lit16 v1, v1, 0x80

    .line 90
    .line 91
    sput v1, LVa/W0;->U:I

    .line 92
    .line 93
    const/4 v1, 0x0

    .line 94
    const-class v2, Lcom/google/android/gms/ads/AdListener;

    .line 95
    .line 96
    invoke-static {p1, v1, v2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    sget v1, LVa/W0;->T:I

    .line 101
    .line 102
    add-int/lit8 v1, v1, 0x39

    .line 103
    .line 104
    rem-int/lit16 v2, v1, 0x80

    .line 105
    .line 106
    sput v2, LVa/W0;->U:I

    .line 107
    .line 108
    rem-int/lit8 v1, v1, 0x2

    .line 109
    .line 110
    if-eqz v1, :cond_1

    .line 111
    .line 112
    check-cast p1, Lcom/google/android/gms/ads/AdListener;

    .line 113
    .line 114
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 115
    .line 116
    .line 117
    iget-object v1, p0, LVa/q0;->b:LVa/W0;

    .line 118
    .line 119
    iput-object v1, v0, LVa/T0;->c:LVa/W0;

    .line 120
    .line 121
    iput-object p1, v0, LVa/T0;->a:Lcom/google/android/gms/ads/AdListener;

    .line 122
    .line 123
    iput-object p2, v0, LVa/T0;->b:LVa/Ra;

    .line 124
    .line 125
    return-object v0

    .line 126
    :cond_1
    const/4 p1, 0x0

    .line 127
    throw p1

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
