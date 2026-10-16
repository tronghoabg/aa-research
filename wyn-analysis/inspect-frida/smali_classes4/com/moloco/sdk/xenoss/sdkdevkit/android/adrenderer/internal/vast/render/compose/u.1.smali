.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/u;


# instance fields
.field public final synthetic a:Ltf/s;


# direct methods
.method public constructor <init>(Ltf/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/u;->a:Ltf/s;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    move-object p1, p2

    .line 2
    sget-object p2, LE/q;->a:LE/q;

    .line 3
    .line 4
    check-cast p1, Ljava/lang/Boolean;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    check-cast p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/p;

    .line 11
    .line 12
    check-cast p4, Ltf/l;

    .line 13
    .line 14
    check-cast p5, Ltf/a;

    .line 15
    .line 16
    check-cast p6, LN/o;

    .line 17
    .line 18
    check-cast p7, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {p7}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p7

    .line 24
    const-string v1, "progress"

    .line 25
    .line 26
    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v1, "onShouldPlay"

    .line 30
    .line 31
    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v1, "onShouldReplay"

    .line 35
    .line 36
    invoke-static {p5, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    and-int/lit8 v1, p7, 0x6

    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p6, p2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    const/4 v1, 0x4

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 v1, 0x2

    .line 52
    :goto_0
    or-int/2addr v1, p7

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move v1, p7

    .line 55
    :goto_1
    and-int/lit8 v2, p7, 0x30

    .line 56
    .line 57
    if-nez v2, :cond_3

    .line 58
    .line 59
    invoke-virtual {p6, v0}, LN/o;->f(Z)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    const/16 v2, 0x20

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    const/16 v2, 0x10

    .line 69
    .line 70
    :goto_2
    or-int/2addr v1, v2

    .line 71
    :cond_3
    and-int/lit16 v2, p7, 0x180

    .line 72
    .line 73
    if-nez v2, :cond_5

    .line 74
    .line 75
    invoke-virtual {p6, p3}, LN/o;->e(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_4

    .line 80
    .line 81
    const/16 v2, 0x100

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    const/16 v2, 0x80

    .line 85
    .line 86
    :goto_3
    or-int/2addr v1, v2

    .line 87
    :cond_5
    and-int/lit16 v2, p7, 0xc00

    .line 88
    .line 89
    if-nez v2, :cond_7

    .line 90
    .line 91
    invoke-virtual {p6, p4}, LN/o;->e(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_6

    .line 96
    .line 97
    const/16 v2, 0x800

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_6
    const/16 v2, 0x400

    .line 101
    .line 102
    :goto_4
    or-int/2addr v1, v2

    .line 103
    :cond_7
    and-int/lit16 p7, p7, 0x6000

    .line 104
    .line 105
    if-nez p7, :cond_9

    .line 106
    .line 107
    invoke-virtual {p6, p5}, LN/o;->e(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p7

    .line 111
    if-eqz p7, :cond_8

    .line 112
    .line 113
    const/16 p7, 0x4000

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_8
    const/16 p7, 0x2000

    .line 117
    .line 118
    :goto_5
    or-int/2addr v1, p7

    .line 119
    :cond_9
    const p7, 0x12493

    .line 120
    .line 121
    .line 122
    and-int/2addr p7, v1

    .line 123
    const v2, 0x12492

    .line 124
    .line 125
    .line 126
    if-ne p7, v2, :cond_b

    .line 127
    .line 128
    invoke-virtual {p6}, LN/o;->x()Z

    .line 129
    .line 130
    .line 131
    move-result p7

    .line 132
    if-nez p7, :cond_a

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_a
    invoke-virtual {p6}, LN/o;->I()V

    .line 136
    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_b
    :goto_6
    const p7, 0xfb8cf42

    .line 140
    .line 141
    .line 142
    invoke-virtual {p6, p7}, LN/o;->M(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p6, p3}, LN/o;->e(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result p7

    .line 149
    invoke-virtual {p6, p5}, LN/o;->e(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    or-int/2addr p7, v2

    .line 154
    invoke-virtual {p6, p4}, LN/o;->e(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    or-int/2addr p7, v2

    .line 159
    invoke-virtual {p6, v0}, LN/o;->f(Z)Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    or-int/2addr p7, v2

    .line 164
    invoke-virtual {p6}, LN/o;->F()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    if-nez p7, :cond_c

    .line 169
    .line 170
    sget-object p7, LN/k;->a:LN/P;

    .line 171
    .line 172
    if-ne v2, p7, :cond_d

    .line 173
    .line 174
    :cond_c
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/t;

    .line 175
    .line 176
    invoke-direct {v2, p3, p5, p4, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/t;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/p;Ltf/a;Ltf/l;Z)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p6, v2}, LN/o;->U(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    :cond_d
    move-object p4, v2

    .line 183
    check-cast p4, Ltf/a;

    .line 184
    .line 185
    const/4 p3, 0x0

    .line 186
    invoke-virtual {p6, p3}, LN/o;->p(Z)V

    .line 187
    .line 188
    .line 189
    and-int/lit8 p3, v1, 0x7e

    .line 190
    .line 191
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    move-object p5, p6

    .line 196
    move-object p6, p3

    .line 197
    move-object p3, p1

    .line 198
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/u;->a:Ltf/s;

    .line 199
    .line 200
    invoke-interface/range {p1 .. p6}, Ltf/s;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    :goto_7
    sget-object p1, Lef/C;->a:Lef/C;

    .line 204
    .line 205
    return-object p1
.end method
