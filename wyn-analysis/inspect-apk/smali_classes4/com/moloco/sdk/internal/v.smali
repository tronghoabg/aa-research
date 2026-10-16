.class public final Lcom/moloco/sdk/internal/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic a:Ltf/l;

.field public final synthetic b:LN/V;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:Ltf/a;


# direct methods
.method public constructor <init>(Ltf/l;LN/V;Ljava/lang/String;Ljava/lang/String;JJLtf/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/internal/v;->a:Ltf/l;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/internal/v;->b:LN/V;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/moloco/sdk/internal/v;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/moloco/sdk/internal/v;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-wide p5, p0, Lcom/moloco/sdk/internal/v;->e:J

    .line 13
    .line 14
    iput-wide p7, p0, Lcom/moloco/sdk/internal/v;->f:J

    .line 15
    .line 16
    iput-object p9, p0, Lcom/moloco/sdk/internal/v;->g:Ltf/a;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lz/d;

    .line 6
    .line 7
    move-object/from16 v6, p2

    .line 8
    .line 9
    check-cast v6, LN/o;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    const-string v2, "$this$AnimatedVisibility"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, Lcom/moloco/sdk/internal/v;->b:LN/V;

    .line 24
    .line 25
    invoke-interface {v1}, LN/K0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/x;

    .line 30
    .line 31
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/t;

    .line 32
    .line 33
    const/4 v9, 0x0

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    const v1, -0x172b8c69

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6, v1}, LN/o;->M(I)V

    .line 40
    .line 41
    .line 42
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;

    .line 43
    .line 44
    new-instance v10, Lcom/moloco/sdk/internal/u;

    .line 45
    .line 46
    iget-wide v1, v0, Lcom/moloco/sdk/internal/v;->f:J

    .line 47
    .line 48
    iget-object v4, v0, Lcom/moloco/sdk/internal/v;->g:Ltf/a;

    .line 49
    .line 50
    iget-object v11, v0, Lcom/moloco/sdk/internal/v;->c:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v12, v0, Lcom/moloco/sdk/internal/v;->d:Ljava/lang/String;

    .line 53
    .line 54
    iget-wide v13, v0, Lcom/moloco/sdk/internal/v;->e:J

    .line 55
    .line 56
    const/16 v18, 0x0

    .line 57
    .line 58
    move-wide v15, v1

    .line 59
    move-object/from16 v17, v4

    .line 60
    .line 61
    invoke-direct/range {v10 .. v18}, Lcom/moloco/sdk/internal/u;-><init>(Ljava/lang/String;Ljava/lang/String;JJLtf/a;I)V

    .line 62
    .line 63
    .line 64
    const v1, -0x738b334d

    .line 65
    .line 66
    .line 67
    invoke-static {v6, v1, v10}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    const/16 v7, 0xc30

    .line 72
    .line 73
    const/4 v8, 0x1

    .line 74
    const/4 v2, 0x0

    .line 75
    iget-object v4, v0, Lcom/moloco/sdk/internal/v;->a:Ltf/l;

    .line 76
    .line 77
    invoke-static/range {v2 .. v8}, La/a;->h(LZ/k;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;Ltf/l;LV/d;LN/o;II)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6, v9}, LN/o;->p(Z)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/v;

    .line 85
    .line 86
    if-eqz v2, :cond_1

    .line 87
    .line 88
    const v1, -0x1722fb29

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6, v1}, LN/o;->M(I)V

    .line 92
    .line 93
    .line 94
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;

    .line 95
    .line 96
    new-instance v10, Lcom/moloco/sdk/internal/u;

    .line 97
    .line 98
    iget-wide v1, v0, Lcom/moloco/sdk/internal/v;->f:J

    .line 99
    .line 100
    iget-object v4, v0, Lcom/moloco/sdk/internal/v;->g:Ltf/a;

    .line 101
    .line 102
    iget-object v11, v0, Lcom/moloco/sdk/internal/v;->c:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v12, v0, Lcom/moloco/sdk/internal/v;->d:Ljava/lang/String;

    .line 105
    .line 106
    iget-wide v13, v0, Lcom/moloco/sdk/internal/v;->e:J

    .line 107
    .line 108
    const/16 v18, 0x1

    .line 109
    .line 110
    move-wide v15, v1

    .line 111
    move-object/from16 v17, v4

    .line 112
    .line 113
    invoke-direct/range {v10 .. v18}, Lcom/moloco/sdk/internal/u;-><init>(Ljava/lang/String;Ljava/lang/String;JJLtf/a;I)V

    .line 114
    .line 115
    .line 116
    const v1, -0x33bd5f24    # -5.1020656E7f

    .line 117
    .line 118
    .line 119
    invoke-static {v6, v1, v10}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    const/16 v7, 0xc30

    .line 124
    .line 125
    const/4 v8, 0x1

    .line 126
    const/4 v2, 0x0

    .line 127
    iget-object v4, v0, Lcom/moloco/sdk/internal/v;->a:Ltf/l;

    .line 128
    .line 129
    invoke-static/range {v2 .. v8}, La/a;->h(LZ/k;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;Ltf/l;LV/d;LN/o;II)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v6, v9}, LN/o;->p(Z)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_1
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/u;

    .line 137
    .line 138
    if-eqz v2, :cond_2

    .line 139
    .line 140
    const v1, -0x171ab2ee

    .line 141
    .line 142
    .line 143
    invoke-virtual {v6, v1}, LN/o;->M(I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v6, v9}, LN/o;->p(Z)V

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_2
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/w;

    .line 151
    .line 152
    if-eqz v2, :cond_3

    .line 153
    .line 154
    const v1, -0x1719d22e

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6, v1}, LN/o;->M(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v6, v9}, LN/o;->p(Z)V

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_3
    if-nez v1, :cond_4

    .line 165
    .line 166
    const v1, -0x17194aad

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6, v1}, LN/o;->M(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6, v9}, LN/o;->p(Z)V

    .line 173
    .line 174
    .line 175
    :goto_0
    sget-object v1, Lef/C;->a:Lef/C;

    .line 176
    .line 177
    return-object v1

    .line 178
    :cond_4
    const v1, -0x324bbfdb

    .line 179
    .line 180
    .line 181
    invoke-virtual {v6, v1}, LN/o;->M(I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v6, v9}, LN/o;->p(Z)V

    .line 185
    .line 186
    .line 187
    new-instance v1, LE5/Q;

    .line 188
    .line 189
    const/16 v2, 0x9

    .line 190
    .line 191
    const/4 v3, 0x0

    .line 192
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 193
    .line 194
    .line 195
    throw v1
.end method
