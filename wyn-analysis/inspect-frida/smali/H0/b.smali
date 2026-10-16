.class public final LH0/b;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/r;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LH0/b;->i:I

    iput-object p1, p0, LH0/b;->j:Ljava/lang/Object;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LH0/b;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 9
    .line 10
    .line 11
    check-cast p2, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 14
    .line 15
    .line 16
    check-cast p3, LN/o;

    .line 17
    .line 18
    check-cast p4, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    and-int/lit8 p1, p1, 0xb

    .line 25
    .line 26
    const/4 p2, 0x2

    .line 27
    if-ne p1, p2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p3}, LN/o;->x()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p3}, LN/o;->I()V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    iget-object p1, p0, LH0/b;->j:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Li0/d;

    .line 43
    .line 44
    iget-object p1, p1, Li0/d;->f:Li0/H;

    .line 45
    .line 46
    const/4 p4, 0x0

    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-static {p1, p4, p3, v0, p2}, Lic/d;->b(Li0/H;Ljava/util/Map;LN/o;II)V

    .line 49
    .line 50
    .line 51
    :goto_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_0
    check-cast p1, LE0/o;

    .line 55
    .line 56
    check-cast p2, LE0/l;

    .line 57
    .line 58
    check-cast p3, LE0/j;

    .line 59
    .line 60
    iget p3, p3, LE0/j;->a:I

    .line 61
    .line 62
    check-cast p4, LE0/k;

    .line 63
    .line 64
    iget p4, p4, LE0/k;->a:I

    .line 65
    .line 66
    const-string v0, "fontWeight"

    .line 67
    .line 68
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, LH0/b;->j:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, LH0/c;

    .line 74
    .line 75
    iget-object v1, v0, LH0/c;->e:LE0/e;

    .line 76
    .line 77
    check-cast v1, LE0/f;

    .line 78
    .line 79
    invoke-virtual {v1, p1, p2, p3, p4}, LE0/f;->b(LE0/o;LE0/l;II)LE0/q;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance p2, LH0/e;

    .line 84
    .line 85
    invoke-direct {p2, p1}, LH0/e;-><init>(LE0/q;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, v0, LH0/c;->j:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    iget-object p1, p2, LH0/e;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p1, Landroid/graphics/Typeface;

    .line 96
    .line 97
    return-object p1

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
