.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/s;


# static fields
.field public static final a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/f;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, LE/q;

    .line 2
    .line 3
    move-object v0, p2

    .line 4
    check-cast v0, Ljava/lang/Boolean;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    check-cast p3, Ltf/a;

    .line 11
    .line 12
    move-object v4, p4

    .line 13
    check-cast v4, LN/o;

    .line 14
    .line 15
    check-cast p5, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p4

    .line 21
    const-string p5, "onClick"

    .line 22
    .line 23
    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    and-int/lit8 p5, p4, 0x6

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    if-nez p5, :cond_1

    .line 30
    .line 31
    invoke-virtual {v4, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p5

    .line 35
    if-eqz p5, :cond_0

    .line 36
    .line 37
    move p5, v1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 p5, 0x2

    .line 40
    :goto_0
    or-int/2addr p5, p4

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move p5, p4

    .line 43
    :goto_1
    and-int/lit8 v2, p4, 0x30

    .line 44
    .line 45
    if-nez v2, :cond_3

    .line 46
    .line 47
    invoke-virtual {v4, p2}, LN/o;->f(Z)Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-eqz p2, :cond_2

    .line 52
    .line 53
    const/16 p2, 0x20

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 p2, 0x10

    .line 57
    .line 58
    :goto_2
    or-int/2addr p5, p2

    .line 59
    :cond_3
    and-int/lit16 p2, p4, 0x180

    .line 60
    .line 61
    if-nez p2, :cond_5

    .line 62
    .line 63
    invoke-virtual {v4, p3}, LN/o;->e(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_4

    .line 68
    .line 69
    const/16 p2, 0x100

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    const/16 p2, 0x80

    .line 73
    .line 74
    :goto_3
    or-int/2addr p5, p2

    .line 75
    :cond_5
    and-int/lit16 p2, p5, 0x493

    .line 76
    .line 77
    const/16 p4, 0x492

    .line 78
    .line 79
    if-ne p2, p4, :cond_7

    .line 80
    .line 81
    invoke-virtual {v4}, LN/o;->x()Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-nez p2, :cond_6

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_6
    invoke-virtual {v4}, LN/o;->I()V

    .line 89
    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_7
    :goto_4
    sget-object p2, LZ/i;->a:LZ/i;

    .line 93
    .line 94
    sget-object p4, LZ/a;->h:LZ/d;

    .line 95
    .line 96
    invoke-virtual {p1, p2, p4}, LE/q;->a(LZ/k;LZ/d;)LZ/k;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    int-to-float p2, v1

    .line 101
    invoke-static {p1, p2}, Lcom/moloco/sdk/internal/publisher/H;->f0(LZ/k;F)LZ/k;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    new-instance p1, Lcom/moloco/sdk/internal/publisher/nativead/ui/a;

    .line 106
    .line 107
    const/4 p2, 0x1

    .line 108
    invoke-direct {p1, p3, p2}, Lcom/moloco/sdk/internal/publisher/nativead/ui/a;-><init>(Ltf/a;I)V

    .line 109
    .line 110
    .line 111
    const p2, 0xa3043cc

    .line 112
    .line 113
    .line 114
    invoke-static {v4, p2, p1}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    shr-int/lit8 p1, p5, 0x3

    .line 119
    .line 120
    and-int/lit8 p1, p1, 0xe

    .line 121
    .line 122
    or-int/lit16 v5, p1, 0xc00

    .line 123
    .line 124
    const/4 v2, 0x0

    .line 125
    const/4 v6, 0x4

    .line 126
    invoke-static/range {v0 .. v6}, LFe/g;->c(Ljava/lang/Object;LZ/k;LA/Z;LV/d;LN/o;II)V

    .line 127
    .line 128
    .line 129
    :goto_5
    sget-object p1, Lef/C;->a:Lef/C;

    .line 130
    .line 131
    return-object p1
.end method
