.class public final synthetic LV5/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LV5/s;->a:I

    iput-object p1, p0, LV5/s;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 1
    iget v0, p0, LV5/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/Map$Entry;

    .line 7
    .line 8
    check-cast p2, Ljava/util/Map$Entry;

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iget-object v0, p0, LV5/s;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lq6/d;

    .line 21
    .line 22
    invoke-virtual {v0, p1, p2}, Lq6/d;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :pswitch_0
    check-cast p1, Ls9/k;

    .line 28
    .line 29
    check-cast p2, Ls9/k;

    .line 30
    .line 31
    iget-object v0, p0, LV5/s;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, LO7/d;

    .line 34
    .line 35
    invoke-virtual {v0, p1, p2}, LO7/d;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    iget-object p1, p1, Ls9/k;->a:Ls9/h;

    .line 42
    .line 43
    iget-object p2, p2, Ls9/k;->a:Ls9/h;

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Ls9/h;->a(Ls9/h;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    :cond_0
    return v0

    .line 50
    :pswitch_1
    check-cast p1, Lp9/f;

    .line 51
    .line 52
    check-cast p2, Lp9/f;

    .line 53
    .line 54
    iget-object v0, p0, LV5/s;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lp9/C;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, Lp9/C;->c(Lp9/f;)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-static {p2}, Lp9/C;->c(Lp9/f;)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-static {v1, v2}, Lw9/p;->d(II)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    iget-object v0, v0, Lp9/C;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Lp9/u;

    .line 79
    .line 80
    invoke-virtual {v0}, Lp9/u;->a()LO7/d;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object p1, p1, Lp9/f;->b:Ls9/k;

    .line 85
    .line 86
    iget-object p2, p2, Lp9/f;->b:Ls9/k;

    .line 87
    .line 88
    invoke-virtual {v0, p1, p2}, LO7/d;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    :goto_0
    return v1

    .line 93
    :pswitch_2
    iget-object v0, p0, LV5/s;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Ld2/u;

    .line 96
    .line 97
    invoke-interface {v0, p2}, Ld2/u;->a(Ljava/lang/Object;)I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    invoke-interface {v0, p1}, Ld2/u;->a(Ljava/lang/Object;)I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    sub-int/2addr p2, p1

    .line 106
    return p2

    .line 107
    :pswitch_3
    iget-object v0, p0, LV5/s;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, LV5/x;

    .line 110
    .line 111
    invoke-interface {v0, p2}, LV5/x;->a(Ljava/lang/Object;)I

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    invoke-interface {v0, p1}, LV5/x;->a(Ljava/lang/Object;)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    sub-int/2addr p2, p1

    .line 120
    return p2

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
