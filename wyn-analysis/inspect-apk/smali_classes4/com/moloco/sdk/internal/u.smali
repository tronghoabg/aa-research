.class public final Lcom/moloco/sdk/internal/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Ltf/a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JJLtf/a;I)V
    .locals 0

    .line 1
    iput p8, p0, Lcom/moloco/sdk/internal/u;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/internal/u;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/moloco/sdk/internal/u;->c:Ljava/lang/String;

    iput-wide p3, p0, Lcom/moloco/sdk/internal/u;->d:J

    iput-wide p5, p0, Lcom/moloco/sdk/internal/u;->e:J

    iput-object p7, p0, Lcom/moloco/sdk/internal/u;->f:Ltf/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lcom/moloco/sdk/internal/u;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v1, p1

    .line 7
    check-cast v1, LZ/k;

    .line 8
    .line 9
    move-object v9, p2

    .line 10
    check-cast v9, LN/o;

    .line 11
    .line 12
    check-cast p3, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const-string p2, "it"

    .line 19
    .line 20
    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    and-int/lit8 p2, p1, 0x6

    .line 24
    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v9, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    const/4 p2, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 p2, 0x2

    .line 36
    :goto_0
    or-int/2addr p1, p2

    .line 37
    :cond_1
    and-int/lit8 p2, p1, 0x13

    .line 38
    .line 39
    const/16 p3, 0x12

    .line 40
    .line 41
    if-ne p2, p3, :cond_3

    .line 42
    .line 43
    invoke-virtual {v9}, LN/o;->x()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-nez p2, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-virtual {v9}, LN/o;->I()V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    :goto_1
    and-int/lit8 v10, p1, 0xe

    .line 55
    .line 56
    iget-wide v4, p0, Lcom/moloco/sdk/internal/u;->d:J

    .line 57
    .line 58
    iget-wide v6, p0, Lcom/moloco/sdk/internal/u;->e:J

    .line 59
    .line 60
    iget-object v2, p0, Lcom/moloco/sdk/internal/u;->b:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v3, p0, Lcom/moloco/sdk/internal/u;->c:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v8, p0, Lcom/moloco/sdk/internal/u;->f:Ltf/a;

    .line 65
    .line 66
    invoke-static/range {v1 .. v10}, Lcom/moloco/sdk/internal/x;->a(LZ/k;Ljava/lang/String;Ljava/lang/String;JJLtf/a;LN/o;I)V

    .line 67
    .line 68
    .line 69
    :goto_2
    sget-object p1, Lef/C;->a:Lef/C;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_0
    move-object v0, p1

    .line 73
    check-cast v0, LZ/k;

    .line 74
    .line 75
    move-object v8, p2

    .line 76
    check-cast v8, LN/o;

    .line 77
    .line 78
    check-cast p3, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    const-string p2, "it"

    .line 85
    .line 86
    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    and-int/lit8 p2, p1, 0x6

    .line 90
    .line 91
    if-nez p2, :cond_5

    .line 92
    .line 93
    invoke-virtual {v8, v0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    if-eqz p2, :cond_4

    .line 98
    .line 99
    const/4 p2, 0x4

    .line 100
    goto :goto_3

    .line 101
    :cond_4
    const/4 p2, 0x2

    .line 102
    :goto_3
    or-int/2addr p1, p2

    .line 103
    :cond_5
    and-int/lit8 p2, p1, 0x13

    .line 104
    .line 105
    const/16 p3, 0x12

    .line 106
    .line 107
    if-ne p2, p3, :cond_7

    .line 108
    .line 109
    invoke-virtual {v8}, LN/o;->x()Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-nez p2, :cond_6

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_6
    invoke-virtual {v8}, LN/o;->I()V

    .line 117
    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_7
    :goto_4
    and-int/lit8 v9, p1, 0xe

    .line 121
    .line 122
    iget-wide v3, p0, Lcom/moloco/sdk/internal/u;->d:J

    .line 123
    .line 124
    iget-wide v5, p0, Lcom/moloco/sdk/internal/u;->e:J

    .line 125
    .line 126
    iget-object v1, p0, Lcom/moloco/sdk/internal/u;->b:Ljava/lang/String;

    .line 127
    .line 128
    iget-object v2, p0, Lcom/moloco/sdk/internal/u;->c:Ljava/lang/String;

    .line 129
    .line 130
    iget-object v7, p0, Lcom/moloco/sdk/internal/u;->f:Ltf/a;

    .line 131
    .line 132
    invoke-static/range {v0 .. v9}, Lcom/moloco/sdk/internal/x;->a(LZ/k;Ljava/lang/String;Ljava/lang/String;JJLtf/a;LN/o;I)V

    .line 133
    .line 134
    .line 135
    :goto_5
    sget-object p1, Lef/C;->a:Lef/C;

    .line 136
    .line 137
    return-object p1

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
