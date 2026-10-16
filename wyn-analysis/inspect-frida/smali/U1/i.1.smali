.class public final LU1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU1/Z;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LE0/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU1/i;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance v0, LE0/a;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, v1}, LE0/a;-><init>(Landroid/content/Context;Z)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, LU1/i;->b:LE0/a;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Handler;LU1/r;LU1/r;LU1/r;LU1/r;)[LU1/W;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lq2/e;

    .line 7
    .line 8
    iget-object v4, p0, LU1/i;->b:LE0/a;

    .line 9
    .line 10
    iget-object v2, p0, LU1/i;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-direct {v1, v2, v4, p1, p2}, Lq2/e;-><init>(Landroid/content/Context;Ld2/i;Landroid/os/Handler;LU1/r;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    new-instance p2, LK8/H;

    .line 19
    .line 20
    invoke-direct {p2, v2}, LK8/H;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    iget-boolean v1, p2, LK8/H;->a:Z

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    xor-int/2addr v1, v3

    .line 27
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 28
    .line 29
    .line 30
    iput-boolean v3, p2, LK8/H;->a:Z

    .line 31
    .line 32
    iget-object v1, p2, LK8/H;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lb7/k;

    .line 35
    .line 36
    const/4 v8, 0x0

    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    new-instance v1, Lb7/k;

    .line 40
    .line 41
    new-array v3, v8, [LO1/d;

    .line 42
    .line 43
    invoke-direct {v1, v3}, Lb7/k;-><init>([LO1/d;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p2, LK8/H;->d:Ljava/lang/Object;

    .line 47
    .line 48
    :cond_0
    iget-object v1, p2, LK8/H;->g:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, LS3/c;

    .line 51
    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    new-instance v1, LS3/c;

    .line 55
    .line 56
    const/16 v3, 0x1c

    .line 57
    .line 58
    invoke-direct {v1, v2, v3}, LS3/c;-><init>(Landroid/content/Context;I)V

    .line 59
    .line 60
    .line 61
    iput-object v1, p2, LK8/H;->g:Ljava/lang/Object;

    .line 62
    .line 63
    :cond_1
    new-instance v7, LW1/t;

    .line 64
    .line 65
    invoke-direct {v7, p2}, LW1/t;-><init>(LK8/H;)V

    .line 66
    .line 67
    .line 68
    new-instance v2, LW1/v;

    .line 69
    .line 70
    iget-object v3, p0, LU1/i;->a:Landroid/content/Context;

    .line 71
    .line 72
    move-object v5, p1

    .line 73
    move-object v6, p3

    .line 74
    invoke-direct/range {v2 .. v7}, LW1/v;-><init>(Landroid/content/Context;Ld2/i;Landroid/os/Handler;LU1/r;LW1/t;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance p2, Lm2/d;

    .line 85
    .line 86
    invoke-direct {p2, p4, p1}, Lm2/d;-><init>(LU1/r;Landroid/os/Looper;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    new-instance p2, Le2/b;

    .line 97
    .line 98
    invoke-direct {p2, p5, p1}, Le2/b;-><init>(LU1/r;Landroid/os/Looper;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    new-instance p1, Lr2/a;

    .line 105
    .line 106
    invoke-direct {p1}, Lr2/a;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    new-instance p1, Lc2/h;

    .line 113
    .line 114
    sget-object p2, Lc2/c;->W8:La2/c;

    .line 115
    .line 116
    invoke-direct {p1, p2}, Lc2/h;-><init>(La2/c;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    new-array p1, v8, [LU1/W;

    .line 123
    .line 124
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, [LU1/W;

    .line 129
    .line 130
    return-object p1
.end method
