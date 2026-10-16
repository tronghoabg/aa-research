.class public final Lcom/moloco/sdk/internal/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/u;


# instance fields
.field public final synthetic a:LZ/d;

.field public final synthetic b:LE/F;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:J

.field public final synthetic f:J


# direct methods
.method public constructor <init>(LZ/d;LE/F;Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/internal/w;->a:LZ/d;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/internal/w;->b:LE/F;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/moloco/sdk/internal/w;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/moloco/sdk/internal/w;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-wide p5, p0, Lcom/moloco/sdk/internal/w;->e:J

    .line 13
    .line 14
    iput-wide p7, p0, Lcom/moloco/sdk/internal/w;->f:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object p1, p2

    .line 2
    check-cast p1, Ljava/lang/Boolean;

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    move-object/from16 p1, p3

    .line 9
    .line 10
    check-cast p1, LHf/v0;

    .line 11
    .line 12
    move-object/from16 v2, p4

    .line 13
    .line 14
    check-cast v2, Ltf/l;

    .line 15
    .line 16
    move-object/from16 v10, p5

    .line 17
    .line 18
    check-cast v10, Ltf/a;

    .line 19
    .line 20
    move-object/from16 v11, p6

    .line 21
    .line 22
    check-cast v11, LN/o;

    .line 23
    .line 24
    move-object/from16 v1, p7

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Number;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v12

    .line 32
    const-string v1, "currentAdPartFlow"

    .line 33
    .line 34
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, "onButtonRendered"

    .line 38
    .line 39
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v1, "onCTA"

    .line 43
    .line 44
    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    shr-int/lit8 v1, v12, 0x6

    .line 48
    .line 49
    and-int/lit8 v1, v1, 0xe

    .line 50
    .line 51
    invoke-static {p1, v11, v1}, LN/d;->u(LHf/v0;LN/o;I)LN/V;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const-string p1, "alignment"

    .line 56
    .line 57
    iget-object v1, p0, Lcom/moloco/sdk/internal/w;->a:LZ/d;

    .line 58
    .line 59
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance p1, LE/j;

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-direct {p1, v1, v4}, LE/j;-><init>(LZ/d;Z)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Lr7/e;->w(LZ/k;)LZ/k;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object v1, p0, Lcom/moloco/sdk/internal/w;->b:LE/F;

    .line 73
    .line 74
    invoke-static {p1, v1}, Lcom/moloco/sdk/internal/publisher/H;->e0(LZ/k;LE/F;)LZ/k;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    new-instance v1, Lcom/moloco/sdk/internal/v;

    .line 79
    .line 80
    iget-wide v6, p0, Lcom/moloco/sdk/internal/w;->e:J

    .line 81
    .line 82
    iget-wide v8, p0, Lcom/moloco/sdk/internal/w;->f:J

    .line 83
    .line 84
    iget-object v4, p0, Lcom/moloco/sdk/internal/w;->c:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v5, p0, Lcom/moloco/sdk/internal/w;->d:Ljava/lang/String;

    .line 87
    .line 88
    invoke-direct/range {v1 .. v10}, Lcom/moloco/sdk/internal/v;-><init>(Ltf/l;LN/V;Ljava/lang/String;Ljava/lang/String;JJLtf/a;)V

    .line 89
    .line 90
    .line 91
    const v2, -0x2735ee25

    .line 92
    .line 93
    .line 94
    invoke-static {v11, v2, v1}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    shr-int/lit8 v1, v12, 0x3

    .line 99
    .line 100
    and-int/lit8 v1, v1, 0xe

    .line 101
    .line 102
    const/high16 v2, 0x30000

    .line 103
    .line 104
    or-int v7, v1, v2

    .line 105
    .line 106
    const/4 v3, 0x0

    .line 107
    const/4 v4, 0x0

    .line 108
    const/4 v2, 0x0

    .line 109
    move-object v1, p1

    .line 110
    move-object v6, v11

    .line 111
    invoke-static/range {v0 .. v7}, LFe/c;->b(ZLZ/k;Lz/j;Lz/k;Ljava/lang/String;LV/d;LN/o;I)V

    .line 112
    .line 113
    .line 114
    sget-object p1, Lef/C;->a:Lef/C;

    .line 115
    .line 116
    return-object p1
.end method
