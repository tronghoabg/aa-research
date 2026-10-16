.class public final LK/x;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V
    .locals 0

    .line 1
    iput p7, p0, LK/x;->i:I

    iput-object p1, p0, LK/x;->l:Ljava/lang/Object;

    iput-object p2, p0, LK/x;->m:Ljava/lang/Object;

    iput-object p3, p0, LK/x;->n:Ljava/lang/Object;

    iput-object p4, p0, LK/x;->o:Ljava/lang/Object;

    iput p5, p0, LK/x;->j:I

    iput p6, p0, LK/x;->k:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, LK/x;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v5, p1

    .line 7
    check-cast v5, LN/o;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    iget p1, p0, LK/x;->j:I

    .line 15
    .line 16
    or-int/lit8 v6, p1, 0x1

    .line 17
    .line 18
    iget-object p1, p0, LK/x;->o:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, p1

    .line 21
    check-cast v4, LV/d;

    .line 22
    .line 23
    iget-object p1, p0, LK/x;->m:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v2, p1

    .line 26
    check-cast v2, LZ/k;

    .line 27
    .line 28
    iget v7, p0, LK/x;->k:I

    .line 29
    .line 30
    iget-object v1, p0, LK/x;->l:Ljava/lang/Object;

    .line 31
    .line 32
    iget-object p1, p0, LK/x;->n:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v3, p1

    .line 35
    check-cast v3, LA/Z;

    .line 36
    .line 37
    invoke-static/range {v1 .. v7}, LFe/g;->c(Ljava/lang/Object;LZ/k;LA/Z;LV/d;LN/o;II)V

    .line 38
    .line 39
    .line 40
    sget-object p1, Lef/C;->a:Lef/C;

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_0
    move-object v4, p1

    .line 44
    check-cast v4, LN/o;

    .line 45
    .line 46
    check-cast p2, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 49
    .line 50
    .line 51
    iget p1, p0, LK/x;->j:I

    .line 52
    .line 53
    or-int/lit8 v5, p1, 0x1

    .line 54
    .line 55
    iget-object p1, p0, LK/x;->l:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v0, p1

    .line 58
    check-cast v0, Lh4/h;

    .line 59
    .line 60
    iget-object p1, p0, LK/x;->m:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v1, p1

    .line 63
    check-cast v1, LX3/k;

    .line 64
    .line 65
    iget-object p1, p0, LK/x;->o:Ljava/lang/Object;

    .line 66
    .line 67
    move-object v3, p1

    .line 68
    check-cast v3, Lr0/h;

    .line 69
    .line 70
    iget v6, p0, LK/x;->k:I

    .line 71
    .line 72
    iget-object p1, p0, LK/x;->n:Ljava/lang/Object;

    .line 73
    .line 74
    move-object v2, p1

    .line 75
    check-cast v2, LZ/k;

    .line 76
    .line 77
    invoke-static/range {v0 .. v6}, La/a;->d(Lh4/h;LX3/k;LZ/k;Lr0/h;LN/o;II)V

    .line 78
    .line 79
    .line 80
    sget-object p1, Lef/C;->a:Lef/C;

    .line 81
    .line 82
    return-object p1

    .line 83
    :pswitch_1
    move-object v4, p1

    .line 84
    check-cast v4, LN/o;

    .line 85
    .line 86
    check-cast p2, Ljava/lang/Number;

    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 89
    .line 90
    .line 91
    iget p1, p0, LK/x;->j:I

    .line 92
    .line 93
    or-int/lit8 v5, p1, 0x1

    .line 94
    .line 95
    iget-object p1, p0, LK/x;->o:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v3, p1

    .line 98
    check-cast v3, LV/d;

    .line 99
    .line 100
    iget-object p1, p0, LK/x;->m:Ljava/lang/Object;

    .line 101
    .line 102
    move-object v1, p1

    .line 103
    check-cast v1, LK/L;

    .line 104
    .line 105
    iget v6, p0, LK/x;->k:I

    .line 106
    .line 107
    iget-object p1, p0, LK/x;->l:Ljava/lang/Object;

    .line 108
    .line 109
    move-object v0, p1

    .line 110
    check-cast v0, LK/e;

    .line 111
    .line 112
    iget-object p1, p0, LK/x;->n:Ljava/lang/Object;

    .line 113
    .line 114
    move-object v2, p1

    .line 115
    check-cast v2, LK/z;

    .line 116
    .line 117
    invoke-static/range {v0 .. v6}, LFe/c;->c(LK/e;LK/L;LK/z;LV/d;LN/o;II)V

    .line 118
    .line 119
    .line 120
    sget-object p1, Lef/C;->a:Lef/C;

    .line 121
    .line 122
    return-object p1

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
