.class public final LAd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, LAd/d;->a:I

    iput-boolean p3, p0, LAd/d;->b:Z

    iput-object p2, p0, LAd/d;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, LAd/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iget-boolean v1, p0, LAd/d;->b:Z

    .line 4
    .line 5
    iget v2, p0, LAd/d;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, LN/o;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    const p2, 0x1cd491d3

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, LN/o;->M(I)V

    .line 21
    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    check-cast v0, Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/moloco/sdk/internal/ortb/model/h0;->e:Lcom/moloco/sdk/internal/ortb/model/A;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    :goto_0
    const/4 v0, 0x0

    .line 34
    goto :goto_3

    .line 35
    :cond_1
    iget-object v1, v0, Lcom/moloco/sdk/internal/ortb/model/A;->d:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 36
    .line 37
    iget-object v2, v0, Lcom/moloco/sdk/internal/ortb/model/A;->e:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 38
    .line 39
    invoke-static {v1, v2}, Lcom/moloco/sdk/internal/i;->b(Lcom/moloco/sdk/internal/ortb/model/X;Lcom/moloco/sdk/internal/ortb/model/k;)LZ/d;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget v1, v0, Lcom/moloco/sdk/internal/ortb/model/A;->c:I

    .line 44
    .line 45
    int-to-float v1, v1

    .line 46
    new-instance v5, LE/F;

    .line 47
    .line 48
    invoke-direct {v5, v1, v1, v1, v1}, LE/F;-><init>(FFFF)V

    .line 49
    .line 50
    .line 51
    iget-object v1, v0, Lcom/moloco/sdk/internal/ortb/model/A;->g:Le0/q;

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    iget-wide v1, v1, Le0/q;->a:J

    .line 56
    .line 57
    :goto_1
    move-wide v10, v1

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    sget-wide v1, Lcom/moloco/sdk/internal/x;->a:J

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :goto_2
    const v1, 0x3933e795

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v1}, LN/o;->M(I)V

    .line 66
    .line 67
    .line 68
    new-instance v3, Lcom/moloco/sdk/internal/w;

    .line 69
    .line 70
    iget-wide v8, v0, Lcom/moloco/sdk/internal/ortb/model/A;->f:J

    .line 71
    .line 72
    iget-object v6, v0, Lcom/moloco/sdk/internal/ortb/model/A;->b:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v7, v0, Lcom/moloco/sdk/internal/ortb/model/A;->a:Ljava/lang/String;

    .line 75
    .line 76
    invoke-direct/range {v3 .. v11}, Lcom/moloco/sdk/internal/w;-><init>(LZ/d;LE/F;Ljava/lang/String;Ljava/lang/String;JJ)V

    .line 77
    .line 78
    .line 79
    const v0, -0x3742f8fd

    .line 80
    .line 81
    .line 82
    invoke-static {p1, v0, v3}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p1, p2}, LN/o;->p(Z)V

    .line 87
    .line 88
    .line 89
    :goto_3
    invoke-virtual {p1, p2}, LN/o;->p(Z)V

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 94
    .line 95
    check-cast p2, Ljava/lang/String;

    .line 96
    .line 97
    const-string v2, "key"

    .line 98
    .line 99
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const-string v2, "value"

    .line 103
    .line 104
    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    if-eqz v1, :cond_3

    .line 108
    .line 109
    sget-object v1, LJd/p;->a:Ljava/util/List;

    .line 110
    .line 111
    const-string v1, "Content-Length"

    .line 112
    .line 113
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_3

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_3
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 121
    .line 122
    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :goto_4
    sget-object p1, Lef/C;->a:Lef/C;

    .line 126
    .line 127
    return-object p1

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
