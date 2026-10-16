.class public final Lr0/w;
.super Lt0/n;
.source "SourceFile"


# static fields
.field public static final a:Lr0/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lr0/w;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lr0/w;->a:Lr0/w;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lt0/r;LP/a;J)LD0/b;
    .locals 6

    .line 1
    const-string v0, "$this$measure"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p2, LP/a;->a:LP/d;

    .line 7
    .line 8
    invoke-virtual {v0}, LP/d;->i()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-static {p3, p4}, LL0/a;->g(J)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    invoke-static {p3, p4}, LL0/a;->f(J)I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    sget-object p4, Lr0/u;->k:Lr0/u;

    .line 23
    .line 24
    invoke-static {p1, p2, p3, p4}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_0
    iget v1, v0, LP/d;->c:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    const/4 v3, 0x0

    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {p2, v3}, LP/a;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    check-cast p2, Lr0/m;

    .line 40
    .line 41
    invoke-interface {p2, p3, p4}, Lr0/m;->e(J)Lr0/t;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iget v0, p2, Lr0/t;->a:I

    .line 46
    .line 47
    invoke-static {v0, p3, p4}, Lxg/g;->u(IJ)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iget v1, p2, Lr0/t;->b:I

    .line 52
    .line 53
    invoke-static {v1, p3, p4}, Lxg/g;->t(IJ)I

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    new-instance p4, LE/w;

    .line 58
    .line 59
    const/4 v1, 0x6

    .line 60
    invoke-direct {p4, p2, v1}, LE/w;-><init>(Lr0/t;I)V

    .line 61
    .line 62
    .line 63
    invoke-static {p1, v0, p3, p4}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 69
    .line 70
    iget v2, v0, LP/d;->c:I

    .line 71
    .line 72
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iget v0, v0, LP/d;->c:I

    .line 76
    .line 77
    move v2, v3

    .line 78
    :goto_0
    if-ge v2, v0, :cond_2

    .line 79
    .line 80
    invoke-virtual {p2, v2}, LP/a;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Lr0/m;

    .line 85
    .line 86
    invoke-interface {v4, p3, p4}, Lr0/m;->e(J)Lr0/t;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    add-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    move v0, v3

    .line 101
    move v2, v0

    .line 102
    :goto_1
    if-ge v3, p2, :cond_3

    .line 103
    .line 104
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    check-cast v4, Lr0/t;

    .line 109
    .line 110
    iget v5, v4, Lr0/t;->a:I

    .line 111
    .line 112
    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    iget v4, v4, Lr0/t;->b:I

    .line 117
    .line 118
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    add-int/lit8 v3, v3, 0x1

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_3
    invoke-static {v0, p3, p4}, Lxg/g;->u(IJ)I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    invoke-static {v2, p3, p4}, Lxg/g;->t(IJ)I

    .line 130
    .line 131
    .line 132
    move-result p3

    .line 133
    new-instance p4, LI/g;

    .line 134
    .line 135
    const/4 v0, 0x1

    .line 136
    invoke-direct {p4, v1, v0}, LI/g;-><init>(Ljava/util/ArrayList;I)V

    .line 137
    .line 138
    .line 139
    invoke-static {p1, p2, p3, p4}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    return-object p1
.end method
