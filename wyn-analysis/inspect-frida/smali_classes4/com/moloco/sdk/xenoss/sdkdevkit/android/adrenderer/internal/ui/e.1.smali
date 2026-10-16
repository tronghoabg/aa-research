.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/s;


# instance fields
.field public final synthetic a:LZ/k;

.field public final synthetic b:Ltf/l;


# direct methods
.method public constructor <init>(LZ/k;Ltf/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/e;->a:LZ/k;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/e;->b:Ltf/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, LE/q;

    .line 2
    .line 3
    check-cast p2, Ltf/l;

    .line 4
    .line 5
    check-cast p3, LHf/v0;

    .line 6
    .line 7
    check-cast p4, LN/o;

    .line 8
    .line 9
    check-cast p5, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const-string p5, "onButtonRendered"

    .line 16
    .line 17
    invoke-static {p2, p5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    if-nez p3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p5, 0x0

    .line 24
    invoke-static {p3, p4, p5}, LN/d;->u(LHf/v0;LN/o;I)LN/V;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    invoke-interface {p3}, LN/K0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    check-cast p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/x;

    .line 33
    .line 34
    instance-of v0, p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/v;

    .line 35
    .line 36
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/e;->a:LZ/k;

    .line 37
    .line 38
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/e;->b:Ltf/l;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    const p3, -0x2ec83dd9

    .line 43
    .line 44
    .line 45
    invoke-virtual {p4, p3}, LN/o;->M(I)V

    .line 46
    .line 47
    .line 48
    shr-int/lit8 p1, p1, 0x3

    .line 49
    .line 50
    and-int/lit8 p1, p1, 0xe

    .line 51
    .line 52
    invoke-static {p2, v1, v2, p4, p1}, Lr7/e;->h(Ltf/l;LZ/k;Ltf/l;LN/o;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p4, p5}, LN/o;->p(Z)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    instance-of v0, p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/t;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    const p3, -0x2ec480b9

    .line 64
    .line 65
    .line 66
    invoke-virtual {p4, p3}, LN/o;->M(I)V

    .line 67
    .line 68
    .line 69
    shr-int/lit8 p1, p1, 0x3

    .line 70
    .line 71
    and-int/lit8 p1, p1, 0xe

    .line 72
    .line 73
    invoke-static {p2, v1, v2, p4, p1}, Lr7/e;->h(Ltf/l;LZ/k;Ltf/l;LN/o;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p4, p5}, LN/o;->p(Z)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    instance-of p1, p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/u;

    .line 81
    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    const p1, -0x2ec0f140

    .line 85
    .line 86
    .line 87
    invoke-virtual {p4, p1}, LN/o;->M(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p4, p5}, LN/o;->p(Z)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    instance-of p1, p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/w;

    .line 95
    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    const p1, -0x2ec01080

    .line 99
    .line 100
    .line 101
    invoke-virtual {p4, p1}, LN/o;->M(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p4, p5}, LN/o;->p(Z)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    if-nez p3, :cond_5

    .line 109
    .line 110
    const p1, -0x2ebf88e0

    .line 111
    .line 112
    .line 113
    invoke-virtual {p4, p1}, LN/o;->M(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p4, p5}, LN/o;->p(Z)V

    .line 117
    .line 118
    .line 119
    :goto_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 120
    .line 121
    return-object p1

    .line 122
    :cond_5
    const p1, -0x649b214c

    .line 123
    .line 124
    .line 125
    invoke-virtual {p4, p1}, LN/o;->M(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p4, p5}, LN/o;->p(Z)V

    .line 129
    .line 130
    .line 131
    new-instance p1, LE5/Q;

    .line 132
    .line 133
    const/16 p2, 0x9

    .line 134
    .line 135
    const/4 p3, 0x0

    .line 136
    invoke-direct {p1, p3, p2}, LE5/Q;-><init>(BI)V

    .line 137
    .line 138
    .line 139
    throw p1
.end method
