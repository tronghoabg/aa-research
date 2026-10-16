.class public final Lcom/moloco/sdk/internal/publisher/nativead/ui/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/internal/publisher/nativead/ui/g;

.field public final synthetic b:LS8/d;

.field public final synthetic c:LZ/k;

.field public final synthetic d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/nativead/ui/g;LS8/d;LZ/k;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/e;->a:Lcom/moloco/sdk/internal/publisher/nativead/ui/g;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/e;->b:LS8/d;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/e;->c:LZ/k;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/e;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    check-cast v13, LN/o;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v1, v1, 0x3

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    if-ne v1, v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v13}, LN/o;->x()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v13}, LN/o;->I()V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_1

    .line 31
    .line 32
    :cond_1
    :goto_0
    iget-object v1, v0, Lcom/moloco/sdk/internal/publisher/nativead/ui/e;->a:Lcom/moloco/sdk/internal/publisher/nativead/ui/g;

    .line 33
    .line 34
    iget-object v15, v1, Lcom/moloco/sdk/internal/publisher/nativead/ui/g;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    .line 35
    .line 36
    sget-wide v16, Le0/q;->b:J

    .line 37
    .line 38
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;

    .line 39
    .line 40
    iget-object v2, v0, Lcom/moloco/sdk/internal/publisher/nativead/ui/e;->b:LS8/d;

    .line 41
    .line 42
    invoke-direct {v1, v2, v2, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;-><init>(Ltf/a;Ltf/a;Ltf/a;)V

    .line 43
    .line 44
    .line 45
    const v2, -0x3f53ef0f

    .line 46
    .line 47
    .line 48
    invoke-virtual {v13, v2}, LN/o;->M(I)V

    .line 49
    .line 50
    .line 51
    sget-wide v9, Le0/q;->d:J

    .line 52
    .line 53
    sget-object v7, LZ/a;->a:LZ/d;

    .line 54
    .line 55
    const v2, 0x7f080182

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v13}, Lff/B;->H(ILN/o;)Lh0/c;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    const v2, 0x7f080183

    .line 63
    .line 64
    .line 65
    invoke-static {v2, v13}, Lff/B;->H(ILN/o;)Lh0/c;

    .line 66
    .line 67
    .line 68
    move-result-object v12

    .line 69
    const-wide/16 v5, 0x0

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    move-object v3, v1

    .line 73
    const-wide/16 v1, 0x0

    .line 74
    .line 75
    move-object v14, v3

    .line 76
    const-wide/16 v3, 0x0

    .line 77
    .line 78
    move-object/from16 v18, v14

    .line 79
    .line 80
    const/16 v14, 0x22f

    .line 81
    .line 82
    invoke-static/range {v1 .. v14}, Lr7/e;->b(JJJLZ/d;LE/F;JLh0/c;Lh0/c;LN/o;I)LV/d;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    const/4 v1, 0x0

    .line 87
    invoke-virtual {v13, v1}, LN/o;->p(Z)V

    .line 88
    .line 89
    .line 90
    sget-object v2, Lcom/moloco/sdk/internal/publisher/nativead/ui/h;->a:LV/d;

    .line 91
    .line 92
    sget v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/v;->a:I

    .line 93
    .line 94
    const v3, 0x2ad5e248

    .line 95
    .line 96
    .line 97
    invoke-virtual {v13, v3}, LN/o;->M(I)V

    .line 98
    .line 99
    .line 100
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/u;

    .line 101
    .line 102
    invoke-direct {v3, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/u;-><init>(Ltf/s;)V

    .line 103
    .line 104
    .line 105
    const v2, 0x715b97f3

    .line 106
    .line 107
    .line 108
    invoke-static {v13, v2, v3}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v13, v1}, LN/o;->p(Z)V

    .line 113
    .line 114
    .line 115
    iget-object v14, v0, Lcom/moloco/sdk/internal/publisher/nativead/ui/e;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;

    .line 116
    .line 117
    move-object/from16 v3, v18

    .line 118
    .line 119
    const/16 v18, 0x2440

    .line 120
    .line 121
    move-object v10, v3

    .line 122
    move-wide/from16 v3, v16

    .line 123
    .line 124
    move-object/from16 v16, v13

    .line 125
    .line 126
    move-object v13, v2

    .line 127
    iget-object v2, v0, Lcom/moloco/sdk/internal/publisher/nativead/ui/e;->c:LZ/k;

    .line 128
    .line 129
    const/4 v6, 0x0

    .line 130
    const/4 v7, 0x0

    .line 131
    const/4 v8, 0x0

    .line 132
    const/4 v9, 0x0

    .line 133
    const/4 v11, 0x0

    .line 134
    const/4 v12, 0x0

    .line 135
    move-object v1, v15

    .line 136
    const/4 v15, 0x0

    .line 137
    const v17, 0x30c36180

    .line 138
    .line 139
    .line 140
    invoke-static/range {v1 .. v18}, Lr7/e;->f(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;LZ/k;JLtf/u;Ltf/c;Ltf/c;Ltf/c;Ltf/u;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;Ltf/s;Ltf/t;Ltf/u;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;ZLN/o;II)V

    .line 141
    .line 142
    .line 143
    :goto_1
    sget-object v1, Lef/C;->a:Lef/C;

    .line 144
    .line 145
    return-object v1
.end method
