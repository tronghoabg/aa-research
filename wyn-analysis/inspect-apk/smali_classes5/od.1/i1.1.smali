.class public final Lod/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmd/N;


# instance fields
.field public final synthetic a:Lmd/e;

.field public final synthetic b:Lod/l1;


# direct methods
.method public constructor <init>(Lod/l1;Lmd/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lod/i1;->b:Lod/l1;

    .line 5
    .line 6
    iput-object p2, p0, Lod/i1;->a:Lmd/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lmd/n;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lod/i1;->b:Lod/l1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lmd/n;->a:Lmd/m;

    .line 7
    .line 8
    sget-object v2, Lmd/m;->e:Lmd/m;

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v2, Lmd/m;->c:Lmd/m;

    .line 14
    .line 15
    sget-object v3, Lmd/m;->d:Lmd/m;

    .line 16
    .line 17
    iget-object v4, v0, Lod/l1;->f:Lmd/y;

    .line 18
    .line 19
    if-eq v1, v2, :cond_1

    .line 20
    .line 21
    if-ne v1, v3, :cond_2

    .line 22
    .line 23
    :cond_1
    invoke-virtual {v4}, Lmd/y;->i()V

    .line 24
    .line 25
    .line 26
    :cond_2
    iget-object v5, v0, Lod/l1;->h:Lmd/m;

    .line 27
    .line 28
    if-ne v5, v2, :cond_4

    .line 29
    .line 30
    sget-object v2, Lmd/m;->a:Lmd/m;

    .line 31
    .line 32
    if-ne v1, v2, :cond_3

    .line 33
    .line 34
    :goto_0
    return-void

    .line 35
    :cond_3
    if-ne v1, v3, :cond_4

    .line 36
    .line 37
    invoke-virtual {v0}, Lod/l1;->e()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_8

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    iget-object v5, p0, Lod/i1;->a:Lmd/e;

    .line 49
    .line 50
    if-eq v2, v3, :cond_7

    .line 51
    .line 52
    const/4 v3, 0x2

    .line 53
    if-eq v2, v3, :cond_6

    .line 54
    .line 55
    const/4 p1, 0x3

    .line 56
    if-ne v2, p1, :cond_5

    .line 57
    .line 58
    new-instance p1, Lod/f1;

    .line 59
    .line 60
    invoke-direct {p1, v0, v5}, Lod/f1;-><init>(Lod/l1;Lmd/e;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v2, "Unsupported state:"

    .line 69
    .line 70
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_6
    new-instance v2, Lod/k1;

    .line 85
    .line 86
    iget-object p1, p1, Lmd/n;->b:Lmd/k0;

    .line 87
    .line 88
    invoke-static {p1}, Lmd/K;->a(Lmd/k0;)Lmd/K;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-direct {v2, p1}, Lod/k1;-><init>(Lmd/K;)V

    .line 93
    .line 94
    .line 95
    move-object p1, v2

    .line 96
    goto :goto_1

    .line 97
    :cond_7
    new-instance p1, Lod/k1;

    .line 98
    .line 99
    const/4 v2, 0x0

    .line 100
    invoke-static {v5, v2}, Lmd/K;->b(Lmd/e;Lvd/p;)Lmd/K;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-direct {p1, v2}, Lod/k1;-><init>(Lmd/K;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_8
    new-instance p1, Lod/k1;

    .line 109
    .line 110
    sget-object v2, Lmd/K;->e:Lmd/K;

    .line 111
    .line 112
    invoke-direct {p1, v2}, Lod/k1;-><init>(Lmd/K;)V

    .line 113
    .line 114
    .line 115
    :goto_1
    iput-object v1, v0, Lod/l1;->h:Lmd/m;

    .line 116
    .line 117
    invoke-virtual {v4, v1, p1}, Lmd/y;->l(Lmd/m;Lmd/M;)V

    .line 118
    .line 119
    .line 120
    return-void
.end method
