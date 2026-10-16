.class public final LVa/X0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# instance fields
.field public final synthetic a:I

.field public synthetic b:LVa/Z0;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/X0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget p2, p0, LVa/X0;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/String;

    .line 12
    .line 13
    sget v0, LVa/Z0;->P:I

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0xd

    .line 16
    .line 17
    rem-int/lit16 v1, v0, 0x80

    .line 18
    .line 19
    sput v1, LVa/Z0;->Q:I

    .line 20
    .line 21
    rem-int/lit8 v0, v0, 0x2

    .line 22
    .line 23
    iget-object v1, p0, LVa/X0;->b:LVa/Z0;

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const/4 p2, 0x1

    .line 28
    :cond_0
    invoke-virtual {v1, p1, p2}, LVa/Z0;->y0(Ljava/lang/String;Z)Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    sget p2, LVa/Z0;->Q:I

    .line 33
    .line 34
    add-int/lit8 p2, p2, 0x61

    .line 35
    .line 36
    rem-int/lit16 v0, p2, 0x80

    .line 37
    .line 38
    sput v0, LVa/Z0;->P:I

    .line 39
    .line 40
    rem-int/lit8 p2, p2, 0x2

    .line 41
    .line 42
    if-nez p2, :cond_1

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_1
    const/4 p1, 0x0

    .line 46
    throw p1

    .line 47
    :pswitch_0
    iget-object p1, p0, LVa/X0;->b:LVa/Z0;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    sget p2, LVa/Z0;->P:I

    .line 53
    .line 54
    add-int/lit8 v0, p2, 0x4f

    .line 55
    .line 56
    rem-int/lit16 v0, v0, 0x80

    .line 57
    .line 58
    sput v0, LVa/Z0;->Q:I

    .line 59
    .line 60
    iget-object p1, p1, LVa/Z0;->M:Ljava/lang/String;

    .line 61
    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    add-int/lit8 p2, p2, 0x57

    .line 65
    .line 66
    rem-int/lit16 p2, p2, 0x80

    .line 67
    .line 68
    sput p2, LVa/Z0;->Q:I

    .line 69
    .line 70
    const/4 p1, 0x1

    .line 71
    goto :goto_0

    .line 72
    :cond_2
    const/4 p1, 0x0

    .line 73
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1

    .line 78
    :pswitch_1
    sget p2, LVa/Z0;->Q:I

    .line 79
    .line 80
    add-int/lit8 p2, p2, 0x65

    .line 81
    .line 82
    rem-int/lit16 p2, p2, 0x80

    .line 83
    .line 84
    sput p2, LVa/Z0;->P:I

    .line 85
    .line 86
    const-class p2, Ljava/lang/String;

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    invoke-static {p1, v0, p2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    sget p2, LVa/Z0;->P:I

    .line 94
    .line 95
    add-int/lit8 p2, p2, 0xb

    .line 96
    .line 97
    rem-int/lit16 v1, p2, 0x80

    .line 98
    .line 99
    sput v1, LVa/Z0;->Q:I

    .line 100
    .line 101
    rem-int/lit8 p2, p2, 0x2

    .line 102
    .line 103
    if-nez p2, :cond_3

    .line 104
    .line 105
    const/4 p2, 0x6

    .line 106
    div-int/2addr p2, v0

    .line 107
    :cond_3
    check-cast p1, Ljava/lang/String;

    .line 108
    .line 109
    iget-object p2, p0, LVa/X0;->b:LVa/Z0;

    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    sget v1, LVa/Z0;->P:I

    .line 115
    .line 116
    add-int/lit8 v1, v1, 0x59

    .line 117
    .line 118
    rem-int/lit16 v2, v1, 0x80

    .line 119
    .line 120
    sput v2, LVa/Z0;->Q:I

    .line 121
    .line 122
    rem-int/lit8 v1, v1, 0x2

    .line 123
    .line 124
    iput-object p1, p2, LVa/Z0;->M:Ljava/lang/String;

    .line 125
    .line 126
    if-eqz v1, :cond_5

    .line 127
    .line 128
    add-int/lit8 v2, v2, 0x75

    .line 129
    .line 130
    rem-int/lit16 p2, v2, 0x80

    .line 131
    .line 132
    sput p2, LVa/Z0;->P:I

    .line 133
    .line 134
    rem-int/lit8 v2, v2, 0x2

    .line 135
    .line 136
    if-eqz v2, :cond_4

    .line 137
    .line 138
    const/16 v1, 0x22

    .line 139
    .line 140
    div-int/2addr v1, v0

    .line 141
    :cond_4
    add-int/lit8 p2, p2, 0x77

    .line 142
    .line 143
    rem-int/lit16 p2, p2, 0x80

    .line 144
    .line 145
    sput p2, LVa/Z0;->Q:I

    .line 146
    .line 147
    return-object p1

    .line 148
    :cond_5
    const/4 p1, 0x0

    .line 149
    throw p1

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
