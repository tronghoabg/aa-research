.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/t;


# instance fields
.field public final synthetic a:LZ/d;

.field public final synthetic b:LE/F;


# direct methods
.method public constructor <init>(LZ/d;LE/F;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/r;->a:LZ/d;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/r;->b:LE/F;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, LE/q;

    .line 2
    .line 3
    check-cast p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/s;

    .line 4
    .line 5
    check-cast p3, Ltf/a;

    .line 6
    .line 7
    check-cast p4, Ltf/a;

    .line 8
    .line 9
    move-object v6, p5

    .line 10
    check-cast v6, LN/o;

    .line 11
    .line 12
    check-cast p6, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p6}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p5

    .line 18
    const-string p6, "<this>"

    .line 19
    .line 20
    invoke-static {p1, p6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string p6, "onDisplayed"

    .line 24
    .line 25
    invoke-static {p3, p6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string p6, "onClick"

    .line 29
    .line 30
    invoke-static {p4, p6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    and-int/lit8 p6, p5, 0x6

    .line 34
    .line 35
    if-nez p6, :cond_1

    .line 36
    .line 37
    invoke-virtual {v6, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p6

    .line 41
    if-eqz p6, :cond_0

    .line 42
    .line 43
    const/4 p6, 0x4

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 p6, 0x2

    .line 46
    :goto_0
    or-int/2addr p6, p5

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move p6, p5

    .line 49
    :goto_1
    and-int/lit8 v0, p5, 0x30

    .line 50
    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    invoke-virtual {v6, p2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    const/16 v0, 0x20

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    const/16 v0, 0x10

    .line 63
    .line 64
    :goto_2
    or-int/2addr p6, v0

    .line 65
    :cond_3
    and-int/lit16 v0, p5, 0x180

    .line 66
    .line 67
    if-nez v0, :cond_5

    .line 68
    .line 69
    invoke-virtual {v6, p3}, LN/o;->e(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    const/16 v0, 0x100

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    const/16 v0, 0x80

    .line 79
    .line 80
    :goto_3
    or-int/2addr p6, v0

    .line 81
    :cond_5
    and-int/lit16 p5, p5, 0xc00

    .line 82
    .line 83
    if-nez p5, :cond_7

    .line 84
    .line 85
    invoke-virtual {v6, p4}, LN/o;->e(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p5

    .line 89
    if-eqz p5, :cond_6

    .line 90
    .line 91
    const/16 p5, 0x800

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_6
    const/16 p5, 0x400

    .line 95
    .line 96
    :goto_4
    or-int/2addr p6, p5

    .line 97
    :cond_7
    and-int/lit16 p5, p6, 0x2493

    .line 98
    .line 99
    const/16 p6, 0x2492

    .line 100
    .line 101
    if-ne p5, p6, :cond_9

    .line 102
    .line 103
    invoke-virtual {v6}, LN/o;->x()Z

    .line 104
    .line 105
    .line 106
    move-result p5

    .line 107
    if-nez p5, :cond_8

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_8
    invoke-virtual {v6}, LN/o;->I()V

    .line 111
    .line 112
    .line 113
    goto :goto_8

    .line 114
    :cond_9
    :goto_5
    if-eqz p2, :cond_a

    .line 115
    .line 116
    const/4 p5, 0x1

    .line 117
    :goto_6
    move v0, p5

    .line 118
    goto :goto_7

    .line 119
    :cond_a
    const/4 p5, 0x0

    .line 120
    goto :goto_6

    .line 121
    :goto_7
    sget-object p5, LZ/i;->a:LZ/i;

    .line 122
    .line 123
    iget-object p6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/r;->a:LZ/d;

    .line 124
    .line 125
    invoke-virtual {p1, p5, p6}, LE/q;->a(LZ/k;LZ/d;)LZ/k;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iget-object p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/r;->b:LE/F;

    .line 130
    .line 131
    invoke-static {p1, p5}, Lcom/moloco/sdk/internal/publisher/H;->e0(LZ/k;LE/F;)LZ/k;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    new-instance p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/q;

    .line 136
    .line 137
    invoke-direct {p1, p2, p3, p4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/q;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/s;Ltf/a;Ltf/a;)V

    .line 138
    .line 139
    .line 140
    const p2, 0x3afe2408

    .line 141
    .line 142
    .line 143
    invoke-static {v6, p2, p1}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    const/4 v2, 0x0

    .line 148
    const/high16 v7, 0x30000

    .line 149
    .line 150
    const/4 v3, 0x0

    .line 151
    const/4 v4, 0x0

    .line 152
    invoke-static/range {v0 .. v7}, LFe/c;->b(ZLZ/k;Lz/j;Lz/k;Ljava/lang/String;LV/d;LN/o;I)V

    .line 153
    .line 154
    .line 155
    :goto_8
    sget-object p1, Lef/C;->a:Lef/C;

    .line 156
    .line 157
    return-object p1
.end method
