.class public final synthetic Lq2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LX2/j;


# direct methods
.method public synthetic constructor <init>(LX2/j;IJ)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    iput p2, p0, Lq2/q;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq2/q;->b:LX2/j;

    return-void
.end method

.method public synthetic constructor <init>(LX2/j;JI)V
    .locals 0

    .line 2
    const/4 p2, 0x2

    iput p2, p0, Lq2/q;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq2/q;->b:LX2/j;

    return-void
.end method

.method public synthetic constructor <init>(LX2/j;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p3, p0, Lq2/q;->a:I

    iput-object p1, p0, Lq2/q;->b:LX2/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LX2/j;Ljava/lang/String;JJ)V
    .locals 0

    .line 4
    const/4 p2, 0x0

    iput p2, p0, Lq2/q;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq2/q;->b:LX2/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lq2/q;->b:LX2/j;

    .line 2
    .line 3
    iget v1, p0, Lq2/q;->a:I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget v1, LQ1/x;->a:I

    .line 12
    .line 13
    iget-object v0, v0, LX2/j;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, LU1/r;

    .line 16
    .line 17
    iget-object v0, v0, LU1/r;->a:LU1/u;

    .line 18
    .line 19
    iget-object v0, v0, LU1/u;->r:LV1/d;

    .line 20
    .line 21
    invoke-virtual {v0}, LV1/d;->K()LV1/a;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v2, LUc/l;

    .line 26
    .line 27
    const/16 v3, 0x1c

    .line 28
    .line 29
    invoke-direct {v2, v3}, LUc/l;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const/16 v3, 0x3fb

    .line 33
    .line 34
    invoke-virtual {v0, v1, v3, v2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    sget v1, LQ1/x;->a:I

    .line 39
    .line 40
    iget-object v0, v0, LX2/j;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, LU1/r;

    .line 43
    .line 44
    iget-object v0, v0, LU1/r;->a:LU1/u;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, LU1/u;->r:LV1/d;

    .line 50
    .line 51
    invoke-virtual {v0}, LV1/d;->K()LV1/a;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    new-instance v2, LV1/b;

    .line 56
    .line 57
    const/16 v3, 0xa

    .line 58
    .line 59
    invoke-direct {v2, v3}, LV1/b;-><init>(I)V

    .line 60
    .line 61
    .line 62
    const/16 v3, 0x3f7

    .line 63
    .line 64
    invoke-virtual {v0, v1, v3, v2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_1
    sget v1, LQ1/x;->a:I

    .line 69
    .line 70
    iget-object v0, v0, LX2/j;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, LU1/r;

    .line 73
    .line 74
    iget-object v0, v0, LU1/r;->a:LU1/u;

    .line 75
    .line 76
    iget-object v0, v0, LU1/u;->r:LV1/d;

    .line 77
    .line 78
    invoke-virtual {v0}, LV1/d;->K()LV1/a;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    new-instance v2, LUc/l;

    .line 83
    .line 84
    const/16 v3, 0x13

    .line 85
    .line 86
    invoke-direct {v2, v3}, LUc/l;-><init>(I)V

    .line 87
    .line 88
    .line 89
    const/16 v3, 0x406

    .line 90
    .line 91
    invoke-virtual {v0, v1, v3, v2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_2
    sget v1, LQ1/x;->a:I

    .line 96
    .line 97
    iget-object v0, v0, LX2/j;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, LU1/r;

    .line 100
    .line 101
    iget-object v0, v0, LU1/r;->a:LU1/u;

    .line 102
    .line 103
    iget-object v0, v0, LU1/u;->r:LV1/d;

    .line 104
    .line 105
    iget-object v1, v0, LV1/d;->d:LC6/l;

    .line 106
    .line 107
    iget-object v1, v1, LC6/l;->e:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v1, Lk2/H;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, LV1/d;->I(Lk2/H;)LV1/a;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    new-instance v2, LV1/b;

    .line 116
    .line 117
    const/4 v3, 0x4

    .line 118
    invoke-direct {v2, v3}, LV1/b;-><init>(I)V

    .line 119
    .line 120
    .line 121
    const/16 v3, 0x3fd

    .line 122
    .line 123
    invoke-virtual {v0, v1, v3, v2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_3
    sget v1, LQ1/x;->a:I

    .line 128
    .line 129
    iget-object v0, v0, LX2/j;->c:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, LU1/r;

    .line 132
    .line 133
    iget-object v0, v0, LU1/r;->a:LU1/u;

    .line 134
    .line 135
    iget-object v0, v0, LU1/u;->r:LV1/d;

    .line 136
    .line 137
    iget-object v1, v0, LV1/d;->d:LC6/l;

    .line 138
    .line 139
    iget-object v1, v1, LC6/l;->e:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v1, Lk2/H;

    .line 142
    .line 143
    invoke-virtual {v0, v1}, LV1/d;->I(Lk2/H;)LV1/a;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    new-instance v2, LUc/l;

    .line 148
    .line 149
    const/16 v3, 0x1d

    .line 150
    .line 151
    invoke-direct {v2, v3}, LUc/l;-><init>(I)V

    .line 152
    .line 153
    .line 154
    const/16 v3, 0x3fa

    .line 155
    .line 156
    invoke-virtual {v0, v1, v3, v2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :pswitch_4
    sget v1, LQ1/x;->a:I

    .line 161
    .line 162
    iget-object v0, v0, LX2/j;->c:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, LU1/r;

    .line 165
    .line 166
    iget-object v0, v0, LU1/r;->a:LU1/u;

    .line 167
    .line 168
    iget-object v0, v0, LU1/u;->r:LV1/d;

    .line 169
    .line 170
    invoke-virtual {v0}, LV1/d;->K()LV1/a;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    new-instance v2, LV1/b;

    .line 175
    .line 176
    const/16 v3, 0xe

    .line 177
    .line 178
    invoke-direct {v2, v3}, LV1/b;-><init>(I)V

    .line 179
    .line 180
    .line 181
    const/16 v3, 0x3f8

    .line 182
    .line 183
    invoke-virtual {v0, v1, v3, v2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
