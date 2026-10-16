.class public final Lp9/a;
.super Lp9/j;
.source "SourceFile"


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Ls9/j;Lp9/i;Lka/C1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lp9/a;->d:I

    invoke-direct {p0, p1, p2, p3}, Lp9/j;-><init>(Ls9/j;Lp9/i;Lka/C1;)V

    return-void
.end method


# virtual methods
.method public final d(Ls9/k;)Z
    .locals 3

    .line 1
    iget v0, p0, Lp9/a;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp9/j;->b:Lka/C1;

    .line 7
    .line 8
    invoke-virtual {v0}, Lka/C1;->m()Lka/g;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Ls9/p;->b:Lka/C1;

    .line 13
    .line 14
    invoke-static {v1, v2}, Ls9/p;->d(Lka/h;Lka/C1;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p1, Ls9/k;->e:Ls9/l;

    .line 23
    .line 24
    iget-object v1, p0, Lp9/j;->c:Ls9/j;

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ls9/l;->f(Ls9/j;)Lka/C1;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Lka/C1;->m()Lka/g;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0, p1}, Ls9/p;->d(Lka/h;Lka/C1;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    :cond_1
    :goto_0
    return v2

    .line 44
    :pswitch_0
    iget-object p1, p1, Ls9/k;->e:Ls9/l;

    .line 45
    .line 46
    iget-object v0, p0, Lp9/j;->c:Ls9/j;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Ls9/l;->f(Ls9/j;)Lka/C1;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, Ls9/p;->f(Lka/C1;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    invoke-virtual {p1}, Lka/C1;->m()Lka/g;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object v0, p0, Lp9/j;->b:Lka/C1;

    .line 63
    .line 64
    invoke-static {p1, v0}, Ls9/p;->d(Lka/h;Lka/C1;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    const/4 p1, 0x1

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    const/4 p1, 0x0

    .line 73
    :goto_1
    return p1

    .line 74
    :pswitch_1
    iget-object p1, p1, Ls9/k;->e:Ls9/l;

    .line 75
    .line 76
    iget-object v0, p0, Lp9/j;->c:Ls9/j;

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Ls9/l;->f(Ls9/j;)Lka/C1;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, Ls9/p;->f(Lka/C1;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    const/4 v1, 0x0

    .line 87
    if-nez v0, :cond_3

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    invoke-virtual {p1}, Lka/C1;->m()Lka/g;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1}, Lka/g;->getValuesList()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Lka/C1;

    .line 113
    .line 114
    iget-object v2, p0, Lp9/j;->b:Lka/C1;

    .line 115
    .line 116
    invoke-virtual {v2}, Lka/C1;->m()Lka/g;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-static {v2, v0}, Ls9/p;->d(Lka/h;Lka/C1;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_4

    .line 125
    .line 126
    const/4 v1, 0x1

    .line 127
    :cond_5
    :goto_2
    return v1

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
