.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/s;


# instance fields
.field public final synthetic a:LZ/d;

.field public final synthetic b:LE/F;

.field public final synthetic c:J


# direct methods
.method public constructor <init>(LZ/d;LE/F;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/P;->a:LZ/d;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/P;->b:LE/F;

    .line 7
    .line 8
    iput-wide p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/P;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, LE/q;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/p;

    .line 10
    .line 11
    move-object v6, p4

    .line 12
    check-cast v6, LN/o;

    .line 13
    .line 14
    check-cast p5, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p4

    .line 20
    const-string p5, "progress"

    .line 21
    .line 22
    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    and-int/lit8 p5, p4, 0x6

    .line 26
    .line 27
    if-nez p5, :cond_1

    .line 28
    .line 29
    invoke-virtual {v6, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p5

    .line 33
    if-eqz p5, :cond_0

    .line 34
    .line 35
    const/4 p5, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 p5, 0x2

    .line 38
    :goto_0
    or-int/2addr p5, p4

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move p5, p4

    .line 41
    :goto_1
    and-int/lit8 v0, p4, 0x30

    .line 42
    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {v6, p2}, LN/o;->f(Z)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    const/16 v0, 0x20

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/16 v0, 0x10

    .line 55
    .line 56
    :goto_2
    or-int/2addr p5, v0

    .line 57
    :cond_3
    and-int/lit16 p4, p4, 0x180

    .line 58
    .line 59
    if-nez p4, :cond_5

    .line 60
    .line 61
    invoke-virtual {v6, p3}, LN/o;->e(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p4

    .line 65
    if-eqz p4, :cond_4

    .line 66
    .line 67
    const/16 p4, 0x100

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    const/16 p4, 0x80

    .line 71
    .line 72
    :goto_3
    or-int/2addr p5, p4

    .line 73
    :cond_5
    and-int/lit16 p4, p5, 0x493

    .line 74
    .line 75
    const/16 p5, 0x492

    .line 76
    .line 77
    if-ne p4, p5, :cond_7

    .line 78
    .line 79
    invoke-virtual {v6}, LN/o;->x()Z

    .line 80
    .line 81
    .line 82
    move-result p4

    .line 83
    if-nez p4, :cond_6

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_6
    invoke-virtual {v6}, LN/o;->I()V

    .line 87
    .line 88
    .line 89
    goto :goto_8

    .line 90
    :cond_7
    :goto_4
    if-nez p2, :cond_9

    .line 91
    .line 92
    instance-of p4, p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/n;

    .line 93
    .line 94
    if-eqz p4, :cond_8

    .line 95
    .line 96
    move-object p4, p3

    .line 97
    check-cast p4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/n;

    .line 98
    .line 99
    const-wide/16 v0, 0x0

    .line 100
    .line 101
    iget-wide p4, p4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/n;->a:J

    .line 102
    .line 103
    cmp-long p4, p4, v0

    .line 104
    .line 105
    if-lez p4, :cond_8

    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_8
    const/4 p4, 0x0

    .line 109
    :goto_5
    move v0, p4

    .line 110
    goto :goto_7

    .line 111
    :cond_9
    :goto_6
    const/4 p4, 0x1

    .line 112
    goto :goto_5

    .line 113
    :goto_7
    sget-object p4, LE/L;->a:LE/x;

    .line 114
    .line 115
    const-string p5, "other"

    .line 116
    .line 117
    invoke-static {p4, p5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget-object p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/P;->a:LZ/d;

    .line 121
    .line 122
    invoke-virtual {p1, p4, p5}, LE/q;->a(LZ/k;LZ/d;)LZ/k;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iget-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/P;->b:LE/F;

    .line 127
    .line 128
    invoke-static {p1, p4}, Lcom/moloco/sdk/internal/publisher/H;->e0(LZ/k;LE/F;)LZ/k;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    new-instance p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/O;

    .line 133
    .line 134
    iget-wide p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/P;->c:J

    .line 135
    .line 136
    invoke-direct {p1, p2, p3, p4, p5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/O;-><init>(ZLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/p;J)V

    .line 137
    .line 138
    .line 139
    const p2, -0x5590556a

    .line 140
    .line 141
    .line 142
    invoke-static {v6, p2, p1}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    const/4 v2, 0x0

    .line 147
    const/high16 v7, 0x30000

    .line 148
    .line 149
    const/4 v3, 0x0

    .line 150
    const/4 v4, 0x0

    .line 151
    invoke-static/range {v0 .. v7}, LFe/c;->b(ZLZ/k;Lz/j;Lz/k;Ljava/lang/String;LV/d;LN/o;I)V

    .line 152
    .line 153
    .line 154
    :goto_8
    sget-object p1, Lef/C;->a:Lef/C;

    .line 155
    .line 156
    return-object p1
.end method
