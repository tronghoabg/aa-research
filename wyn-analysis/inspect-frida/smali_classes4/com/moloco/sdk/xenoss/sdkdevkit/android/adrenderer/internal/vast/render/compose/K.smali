.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/u;


# instance fields
.field public final synthetic a:LE/F;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J


# direct methods
.method public constructor <init>(LE/F;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/K;->a:LE/F;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/K;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/K;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p2, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    check-cast p3, LHf/v0;

    .line 8
    .line 9
    move-object v2, p4

    .line 10
    check-cast v2, Ltf/l;

    .line 11
    .line 12
    move-object v7, p5

    .line 13
    check-cast v7, Ltf/a;

    .line 14
    .line 15
    check-cast p6, LN/o;

    .line 16
    .line 17
    check-cast p7, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p7}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const-string p2, "currentAdPartFlow"

    .line 24
    .line 25
    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string p2, "onButtonRendered"

    .line 29
    .line 30
    invoke-static {v2, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string p2, "onCTA"

    .line 34
    .line 35
    invoke-static {v7, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    shr-int/lit8 p2, p1, 0x6

    .line 39
    .line 40
    and-int/lit8 p2, p2, 0xe

    .line 41
    .line 42
    invoke-static {p3, p6, p2}, LN/d;->u(LHf/v0;LN/o;I)LN/V;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    sget-object p2, LZ/a;->i:LZ/d;

    .line 47
    .line 48
    new-instance p3, LE/j;

    .line 49
    .line 50
    const/4 p4, 0x0

    .line 51
    invoke-direct {p3, p2, p4}, LE/j;-><init>(LZ/d;Z)V

    .line 52
    .line 53
    .line 54
    invoke-static {p3}, Lr7/e;->w(LZ/k;)LZ/k;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    iget-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/K;->a:LE/F;

    .line 59
    .line 60
    invoke-static {p2, p3}, Lcom/moloco/sdk/internal/publisher/H;->e0(LZ/k;LE/F;)LZ/k;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/J;

    .line 65
    .line 66
    iget-object v4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/K;->b:Ljava/lang/String;

    .line 67
    .line 68
    iget-wide v5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/K;->c:J

    .line 69
    .line 70
    invoke-direct/range {v1 .. v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/J;-><init>(Ltf/l;LN/V;Ljava/lang/String;JLtf/a;)V

    .line 71
    .line 72
    .line 73
    const p3, 0x3bdcec9c

    .line 74
    .line 75
    .line 76
    invoke-static {p6, p3, v1}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    shr-int/lit8 p1, p1, 0x3

    .line 81
    .line 82
    and-int/lit8 p1, p1, 0xe

    .line 83
    .line 84
    const/high16 p3, 0x30000

    .line 85
    .line 86
    or-int v7, p1, p3

    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    const/4 v4, 0x0

    .line 90
    const/4 v2, 0x0

    .line 91
    move-object v1, p2

    .line 92
    move-object v6, p6

    .line 93
    invoke-static/range {v0 .. v7}, LFe/c;->b(ZLZ/k;Lz/j;Lz/k;Ljava/lang/String;LV/d;LN/o;I)V

    .line 94
    .line 95
    .line 96
    sget-object p1, Lef/C;->a:Lef/C;

    .line 97
    .line 98
    return-object p1
.end method
