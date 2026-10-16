.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic a:Ltf/l;

.field public final synthetic b:LN/V;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J

.field public final synthetic e:Ltf/a;


# direct methods
.method public constructor <init>(Ltf/l;LN/V;Ljava/lang/String;JLtf/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/J;->a:Ltf/l;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/J;->b:LN/V;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/J;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-wide p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/J;->d:J

    .line 11
    .line 12
    iput-object p6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/J;->e:Ltf/a;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, Lz/d;

    .line 2
    .line 3
    move-object v4, p2

    .line 4
    check-cast v4, LN/o;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 9
    .line 10
    .line 11
    const-string p2, "$this$AnimatedVisibility"

    .line 12
    .line 13
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/J;->b:LN/V;

    .line 17
    .line 18
    invoke-interface {p1}, LN/K0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/x;

    .line 23
    .line 24
    instance-of p2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/t;

    .line 25
    .line 26
    iget-object v9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/J;->e:Ltf/a;

    .line 27
    .line 28
    iget-wide v7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/J;->d:J

    .line 29
    .line 30
    iget-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/J;->c:Ljava/lang/String;

    .line 31
    .line 32
    const/4 p3, 0x0

    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    const p1, 0x47c58d93

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, p1}, LN/o;->M(I)V

    .line 39
    .line 40
    .line 41
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;

    .line 42
    .line 43
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;

    .line 44
    .line 45
    const/4 v10, 0x0

    .line 46
    invoke-direct/range {v5 .. v10}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;-><init>(Ljava/lang/String;JLtf/a;I)V

    .line 47
    .line 48
    .line 49
    const p1, -0x319bec8c

    .line 50
    .line 51
    .line 52
    invoke-static {v4, p1, v5}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const/16 v5, 0xc30

    .line 57
    .line 58
    const/4 v6, 0x1

    .line 59
    const/4 v0, 0x0

    .line 60
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/J;->a:Ltf/l;

    .line 61
    .line 62
    invoke-static/range {v0 .. v6}, La/a;->h(LZ/k;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;Ltf/l;LV/d;LN/o;II)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, p3}, LN/o;->p(Z)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    instance-of p2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/v;

    .line 70
    .line 71
    if-eqz p2, :cond_1

    .line 72
    .line 73
    const p1, 0x47ce9313

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, p1}, LN/o;->M(I)V

    .line 77
    .line 78
    .line 79
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;

    .line 80
    .line 81
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;

    .line 82
    .line 83
    const/4 v10, 0x1

    .line 84
    invoke-direct/range {v5 .. v10}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/I;-><init>(Ljava/lang/String;JLtf/a;I)V

    .line 85
    .line 86
    .line 87
    const p1, 0x5a729c1d

    .line 88
    .line 89
    .line 90
    invoke-static {v4, p1, v5}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    const/16 v5, 0xc30

    .line 95
    .line 96
    const/4 v6, 0x1

    .line 97
    const/4 v0, 0x0

    .line 98
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/J;->a:Ltf/l;

    .line 99
    .line 100
    invoke-static/range {v0 .. v6}, La/a;->h(LZ/k;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;Ltf/l;LV/d;LN/o;II)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, p3}, LN/o;->p(Z)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    instance-of p2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/u;

    .line 108
    .line 109
    if-eqz p2, :cond_2

    .line 110
    .line 111
    const p1, 0x47d7534f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4, p1}, LN/o;->M(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4, p3}, LN/o;->p(Z)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_2
    instance-of p2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/w;

    .line 122
    .line 123
    if-eqz p2, :cond_3

    .line 124
    .line 125
    const p1, 0x47d8a0ec

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, p1}, LN/o;->M(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, p3}, LN/o;->p(Z)V

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_3
    if-nez p1, :cond_4

    .line 136
    .line 137
    const p1, 0x47d928ab

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, p1}, LN/o;->M(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4, p3}, LN/o;->p(Z)V

    .line 144
    .line 145
    .line 146
    :goto_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 147
    .line 148
    return-object p1

    .line 149
    :cond_4
    const p1, -0x58860919

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4, p1}, LN/o;->M(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4, p3}, LN/o;->p(Z)V

    .line 156
    .line 157
    .line 158
    new-instance p1, LE5/Q;

    .line 159
    .line 160
    const/16 p2, 0x9

    .line 161
    .line 162
    const/4 p3, 0x0

    .line 163
    invoke-direct {p1, p3, p2}, LE5/Q;-><init>(BI)V

    .line 164
    .line 165
    .line 166
    throw p1
.end method
