.class public final LVa/y1;
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
    iput p1, p0, LVa/y1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LVa/y1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p0, LVa/y1;->b:LVa/Z0;

    .line 12
    .line 13
    check-cast v0, LVa/P6;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v1, LVa/O6;

    .line 19
    .line 20
    check-cast p1, Lcom/unity3d/services/core/webview/WebViewApp;

    .line 21
    .line 22
    invoke-direct {v1, v0, p1, p2}, LVa/O6;-><init>(LVa/P6;Lcom/unity3d/services/core/webview/WebViewApp;LVa/Ra;)V

    .line 23
    .line 24
    .line 25
    sget p1, LVa/P6;->T:I

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x55

    .line 28
    .line 29
    rem-int/lit16 p1, p1, 0x80

    .line 30
    .line 31
    sput p1, LVa/P6;->U:I

    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    const/4 v0, 0x0

    .line 35
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Ljava/util/WeakHashMap;

    .line 40
    .line 41
    sget v0, LVa/o2;->U:I

    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x77

    .line 44
    .line 45
    rem-int/lit16 v0, v0, 0x80

    .line 46
    .line 47
    sput v0, LVa/o2;->T:I

    .line 48
    .line 49
    iget-object v0, p0, LVa/y1;->b:LVa/Z0;

    .line 50
    .line 51
    check-cast v0, LVa/o2;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-instance v1, LVa/n2;

    .line 57
    .line 58
    invoke-direct {v1, v0, p1, p2}, LVa/n2;-><init>(LVa/o2;Ljava/util/WeakHashMap;LVa/Ra;)V

    .line 59
    .line 60
    .line 61
    sget p1, LVa/o2;->U:I

    .line 62
    .line 63
    add-int/lit8 p2, p1, 0x65

    .line 64
    .line 65
    rem-int/lit16 v0, p2, 0x80

    .line 66
    .line 67
    sput v0, LVa/o2;->T:I

    .line 68
    .line 69
    rem-int/lit8 p2, p2, 0x2

    .line 70
    .line 71
    if-nez p2, :cond_0

    .line 72
    .line 73
    add-int/lit8 p1, p1, 0x75

    .line 74
    .line 75
    rem-int/lit16 p1, p1, 0x80

    .line 76
    .line 77
    sput p1, LVa/o2;->T:I

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_0
    const/4 p1, 0x0

    .line 81
    throw p1

    .line 82
    :pswitch_1
    sget p1, LVa/K1;->S:I

    .line 83
    .line 84
    add-int/lit8 p1, p1, 0x71

    .line 85
    .line 86
    rem-int/lit16 p2, p1, 0x80

    .line 87
    .line 88
    sput p2, LVa/K1;->T:I

    .line 89
    .line 90
    rem-int/lit8 p1, p1, 0x2

    .line 91
    .line 92
    iget-object p2, p0, LVa/y1;->b:LVa/Z0;

    .line 93
    .line 94
    check-cast p2, LVa/K1;

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-static {}, LVa/K1;->J0()V

    .line 100
    .line 101
    .line 102
    if-nez p1, :cond_1

    .line 103
    .line 104
    const/16 p1, 0x1a

    .line 105
    .line 106
    div-int/lit8 p1, p1, 0x0

    .line 107
    .line 108
    :cond_1
    sget p1, LVa/K1;->T:I

    .line 109
    .line 110
    add-int/lit8 p1, p1, 0x2f

    .line 111
    .line 112
    rem-int/lit16 p2, p1, 0x80

    .line 113
    .line 114
    sput p2, LVa/K1;->S:I

    .line 115
    .line 116
    rem-int/lit8 p1, p1, 0x2

    .line 117
    .line 118
    const/4 p2, 0x0

    .line 119
    if-nez p1, :cond_2

    .line 120
    .line 121
    return-object p2

    .line 122
    :cond_2
    throw p2

    .line 123
    :pswitch_2
    const/4 p2, 0x0

    .line 124
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    check-cast p2, Landroid/content/Context;

    .line 129
    .line 130
    const/4 v0, 0x1

    .line 131
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Ljava/lang/String;

    .line 136
    .line 137
    const/4 v1, 0x2

    .line 138
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    check-cast p1, Ljava/lang/String;

    .line 143
    .line 144
    sget v2, LVa/E1;->U:I

    .line 145
    .line 146
    add-int/lit8 v2, v2, 0x33

    .line 147
    .line 148
    rem-int/lit16 v2, v2, 0x80

    .line 149
    .line 150
    sput v2, LVa/E1;->T:I

    .line 151
    .line 152
    iget-object v2, p0, LVa/y1;->b:LVa/Z0;

    .line 153
    .line 154
    check-cast v2, LVa/E1;

    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {p2}, Lcom/applovin/communicator/AppLovinCommunicator;->getInstance(Landroid/content/Context;)Lcom/applovin/communicator/AppLovinCommunicator;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    new-instance v2, LVa/z1;

    .line 164
    .line 165
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 166
    .line 167
    .line 168
    iput-object v0, v2, LVa/z1;->a:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {p2, v2, p1}, Lcom/applovin/communicator/AppLovinCommunicator;->subscribe(Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    sget p1, LVa/E1;->T:I

    .line 174
    .line 175
    add-int/lit8 p1, p1, 0x7b

    .line 176
    .line 177
    rem-int/lit16 p1, p1, 0x80

    .line 178
    .line 179
    sput p1, LVa/E1;->U:I

    .line 180
    .line 181
    add-int/lit8 p1, p1, 0x63

    .line 182
    .line 183
    rem-int/lit16 p2, p1, 0x80

    .line 184
    .line 185
    sput p2, LVa/E1;->T:I

    .line 186
    .line 187
    rem-int/2addr p1, v1

    .line 188
    const/4 p2, 0x0

    .line 189
    if-nez p1, :cond_3

    .line 190
    .line 191
    return-object p2

    .line 192
    :cond_3
    throw p2

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
