.class public final LB/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB/Q;


# static fields
.field public static final b:LB/w;

.field public static final c:LB/w;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LB/w;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LB/w;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LB/w;->b:LB/w;

    .line 8
    .line 9
    new-instance v0, LB/w;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, LB/w;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, LB/w;->c:LB/w;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LB/w;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LD/i;LN/o;)LB/S;
    .locals 8

    .line 1
    iget v0, p0, LB/w;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "interactionSource"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const p1, 0x1106bdb4

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 15
    .line 16
    .line 17
    sget-object p1, LB/W;->a:LB/W;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p2, v0}, LN/o;->p(Z)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    const-string v0, "interactionSource"

    .line 25
    .line 26
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const v0, 0x64593183

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v0}, LN/o;->M(I)V

    .line 33
    .line 34
    .line 35
    const v0, -0x64e89930

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2, v0}, LN/o;->M(I)V

    .line 39
    .line 40
    .line 41
    const v0, -0x1d58f75c

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, v0}, LN/o;->M(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    sget-object v2, LN/k;->a:LN/P;

    .line 52
    .line 53
    sget-object v3, LN/P;->f:LN/P;

    .line 54
    .line 55
    if-ne v1, v2, :cond_0

    .line 56
    .line 57
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-static {v1, v3}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {p2, v1}, LN/o;->U(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    const/4 v4, 0x0

    .line 67
    invoke-virtual {p2, v4}, LN/o;->p(Z)V

    .line 68
    .line 69
    .line 70
    check-cast v1, LN/V;

    .line 71
    .line 72
    new-instance v5, LD/m;

    .line 73
    .line 74
    const/4 v6, 0x0

    .line 75
    invoke-direct {v5, p1, v1, v6}, LD/m;-><init>(LD/i;LN/V;Ljf/c;)V

    .line 76
    .line 77
    .line 78
    invoke-static {p2, p1, v5}, LN/d;->d(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, v4}, LN/o;->p(Z)V

    .line 82
    .line 83
    .line 84
    const v5, 0x47eb0cb0    # 120345.375f

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, v5}, LN/o;->M(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v0}, LN/o;->M(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    if-ne v5, v2, :cond_1

    .line 98
    .line 99
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 100
    .line 101
    invoke-static {v5, v3}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {p2, v5}, LN/o;->U(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_1
    invoke-virtual {p2, v4}, LN/o;->p(Z)V

    .line 109
    .line 110
    .line 111
    check-cast v5, LN/V;

    .line 112
    .line 113
    new-instance v7, LD/g;

    .line 114
    .line 115
    invoke-direct {v7, p1, v5, v6}, LD/g;-><init>(LD/i;LN/V;Ljf/c;)V

    .line 116
    .line 117
    .line 118
    invoke-static {p2, p1, v7}, LN/d;->d(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2, v4}, LN/o;->p(Z)V

    .line 122
    .line 123
    .line 124
    const v7, -0x6b9dfad0

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2, v7}, LN/o;->M(I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, v0}, LN/o;->M(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-ne v0, v2, :cond_2

    .line 138
    .line 139
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 140
    .line 141
    invoke-static {v0, v3}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {p2, v0}, LN/o;->U(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_2
    invoke-virtual {p2, v4}, LN/o;->p(Z)V

    .line 149
    .line 150
    .line 151
    check-cast v0, LN/V;

    .line 152
    .line 153
    new-instance v3, LD/d;

    .line 154
    .line 155
    invoke-direct {v3, p1, v0, v6}, LD/d;-><init>(LD/i;LN/V;Ljf/c;)V

    .line 156
    .line 157
    .line 158
    invoke-static {p2, p1, v3}, LN/d;->d(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p2, v4}, LN/o;->p(Z)V

    .line 162
    .line 163
    .line 164
    const v3, 0x44faf204

    .line 165
    .line 166
    .line 167
    invoke-virtual {p2, v3}, LN/o;->M(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    if-nez p1, :cond_3

    .line 179
    .line 180
    if-ne v3, v2, :cond_4

    .line 181
    .line 182
    :cond_3
    new-instance v3, LB/v;

    .line 183
    .line 184
    invoke-direct {v3, v1, v5, v0}, LB/v;-><init>(LN/V;LN/V;LN/V;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p2, v3}, LN/o;->U(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_4
    invoke-virtual {p2, v4}, LN/o;->p(Z)V

    .line 191
    .line 192
    .line 193
    check-cast v3, LB/v;

    .line 194
    .line 195
    invoke-virtual {p2, v4}, LN/o;->p(Z)V

    .line 196
    .line 197
    .line 198
    return-object v3

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
