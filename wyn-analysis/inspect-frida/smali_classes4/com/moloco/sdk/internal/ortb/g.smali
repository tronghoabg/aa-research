.class public abstract Lcom/moloco/sdk/internal/ortb/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LBf/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LBf/i;

    .line 2
    .line 3
    const-string v1, "\\$\\{AUCTION_PRICE\\}"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LBf/i;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/moloco/sdk/internal/ortb/g;->a:LBf/i;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Lcom/moloco/sdk/internal/ortb/model/y;)Lcom/moloco/sdk/internal/ortb/model/y;
    .locals 13

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object p0, p0, Lcom/moloco/sdk/internal/ortb/model/y;->a:Ljava/util/List;

    .line 9
    .line 10
    const/16 v2, 0xa

    .line 11
    .line 12
    invoke-static {p0, v2}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_4

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lcom/moloco/sdk/internal/ortb/model/f;

    .line 34
    .line 35
    iget-object v3, v3, Lcom/moloco/sdk/internal/ortb/model/f;->a:Ljava/util/List;

    .line 36
    .line 37
    new-instance v4, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-static {v3, v2}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_3

    .line 55
    .line 56
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    check-cast v5, Lcom/moloco/sdk/internal/ortb/model/u;

    .line 61
    .line 62
    iget v8, v5, Lcom/moloco/sdk/internal/ortb/model/u;->b:F

    .line 63
    .line 64
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    iget-object v7, v5, Lcom/moloco/sdk/internal/ortb/model/u;->a:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6}, Ljava/lang/Float;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    const-string v9, ""

    .line 78
    .line 79
    if-nez v6, :cond_0

    .line 80
    .line 81
    move-object v6, v9

    .line 82
    :cond_0
    sget-object v10, Lcom/moloco/sdk/internal/ortb/g;->a:LBf/i;

    .line 83
    .line 84
    invoke-virtual {v10, v7, v6}, LBf/i;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    iget-object v6, v5, Lcom/moloco/sdk/internal/ortb/model/u;->c:Ljava/lang/String;

    .line 89
    .line 90
    if-eqz v6, :cond_2

    .line 91
    .line 92
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 93
    .line 94
    .line 95
    move-result-object v11

    .line 96
    invoke-virtual {v11}, Ljava/lang/Float;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    if-nez v11, :cond_1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_1
    move-object v9, v11

    .line 104
    :goto_2
    invoke-virtual {v10, v6, v9}, LBf/i;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    :goto_3
    move-object v9, v6

    .line 109
    goto :goto_4

    .line 110
    :cond_2
    const/4 v6, 0x0

    .line 111
    goto :goto_3

    .line 112
    :goto_4
    new-instance v6, Lcom/moloco/sdk/internal/ortb/model/u;

    .line 113
    .line 114
    iget-object v11, v5, Lcom/moloco/sdk/internal/ortb/model/u;->e:Ljava/lang/String;

    .line 115
    .line 116
    iget-object v12, v5, Lcom/moloco/sdk/internal/ortb/model/u;->f:Ljava/lang/String;

    .line 117
    .line 118
    iget-object v10, v5, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 119
    .line 120
    invoke-direct/range {v6 .. v12}, Lcom/moloco/sdk/internal/ortb/model/u;-><init>(Ljava/lang/String;FLjava/lang/String;Lcom/moloco/sdk/internal/ortb/model/w;Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    new-instance v3, Lcom/moloco/sdk/internal/ortb/model/f;

    .line 128
    .line 129
    invoke-direct {v3, v4}, Lcom/moloco/sdk/internal/ortb/model/f;-><init>(Ljava/util/ArrayList;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_4
    new-instance p0, Lcom/moloco/sdk/internal/ortb/model/y;

    .line 137
    .line 138
    invoke-direct {p0, v1}, Lcom/moloco/sdk/internal/ortb/model/y;-><init>(Ljava/util/ArrayList;)V

    .line 139
    .line 140
    .line 141
    return-object p0
.end method
