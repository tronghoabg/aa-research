.class public final LN/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljf/g;
.implements LN/A0;


# static fields
.field public static final synthetic b:LN/P;

.field public static final c:LN/P;

.field public static final d:LN/P;

.field public static final e:LN/P;

.field public static final f:LN/P;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LN/P;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LN/P;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LN/P;->b:LN/P;

    .line 8
    .line 9
    new-instance v0, LN/P;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, LN/P;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, LN/P;->c:LN/P;

    .line 16
    .line 17
    new-instance v0, LN/P;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, LN/P;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LN/P;->d:LN/P;

    .line 24
    .line 25
    new-instance v0, LN/P;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, LN/P;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, LN/P;->e:LN/P;

    .line 32
    .line 33
    new-instance v0, LN/P;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, LN/P;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LN/P;->f:LN/P;

    .line 40
    .line 41
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LN/P;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final b(LN/P;)V
    .locals 9

    .line 1
    sget-object v0, LN/p0;->u:LHf/x0;

    .line 2
    .line 3
    :cond_0
    sget-object v0, LN/p0;->u:LHf/x0;

    .line 4
    .line 5
    invoke-virtual {v0}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, LQ/e;

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, LT/b;

    .line 13
    .line 14
    iget-object v3, v2, LT/b;->c:LS/c;

    .line 15
    .line 16
    invoke-virtual {v3, p0}, LS/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, LT/a;

    .line 21
    .line 22
    if-nez v4, :cond_1

    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_1
    const/4 v5, 0x0

    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    move v6, v5

    .line 35
    :goto_0
    iget-object v7, v3, LS/c;->a:LS/n;

    .line 36
    .line 37
    invoke-virtual {v7, v6, p0, v5}, LS/n;->v(ILN/P;I)LS/n;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    const/4 v8, 0x1

    .line 42
    if-ne v7, v6, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    if-nez v6, :cond_4

    .line 46
    .line 47
    sget-object v3, LS/c;->c:LS/c;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    new-instance v7, LS/c;

    .line 51
    .line 52
    iget v3, v3, LS/c;->b:I

    .line 53
    .line 54
    sub-int/2addr v3, v8

    .line 55
    invoke-direct {v7, v6, v3}, LS/c;-><init>(LS/n;I)V

    .line 56
    .line 57
    .line 58
    move-object v3, v7

    .line 59
    :goto_1
    sget-object v6, LU/b;->a:LU/b;

    .line 60
    .line 61
    iget-object v7, v4, LT/a;->a:Ljava/lang/Object;

    .line 62
    .line 63
    if-eq v7, v6, :cond_5

    .line 64
    .line 65
    move v5, v8

    .line 66
    :cond_5
    iget-object v4, v4, LT/a;->b:Ljava/lang/Object;

    .line 67
    .line 68
    if-eqz v5, :cond_6

    .line 69
    .line 70
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-static {v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    check-cast v5, LT/a;

    .line 78
    .line 79
    new-instance v8, LT/a;

    .line 80
    .line 81
    iget-object v5, v5, LT/a;->a:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-direct {v8, v5, v4}, LT/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v7, v8}, LS/c;->c(Ljava/lang/Object;LT/a;)LS/c;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    :cond_6
    if-eq v4, v6, :cond_7

    .line 91
    .line 92
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-static {v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    check-cast v5, LT/a;

    .line 100
    .line 101
    new-instance v8, LT/a;

    .line 102
    .line 103
    iget-object v5, v5, LT/a;->b:Ljava/lang/Object;

    .line 104
    .line 105
    invoke-direct {v8, v7, v5}, LT/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v4, v8}, LS/c;->c(Ljava/lang/Object;LT/a;)LS/c;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    :cond_7
    if-eq v7, v6, :cond_8

    .line 113
    .line 114
    iget-object v5, v2, LT/b;->a:Ljava/lang/Object;

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_8
    move-object v5, v4

    .line 118
    :goto_2
    if-eq v4, v6, :cond_9

    .line 119
    .line 120
    iget-object v7, v2, LT/b;->b:Ljava/lang/Object;

    .line 121
    .line 122
    :cond_9
    new-instance v2, LT/b;

    .line 123
    .line 124
    invoke-direct {v2, v5, v7, v3}, LT/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;LS/c;)V

    .line 125
    .line 126
    .line 127
    :goto_3
    if-eq v1, v2, :cond_a

    .line 128
    .line 129
    invoke-virtual {v0, v1, v2}, LHf/x0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_0

    .line 134
    .line 135
    :cond_a
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, LN/P;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    return p1

    .line 17
    :pswitch_1
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, LN/P;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_1
    const-string v0, "Empty"

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_2
    const-string v0, "StructuralEqualityPolicy"

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_3
    const-string v0, "ReferentialEqualityPolicy"

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_4
    const-string v0, "NeverEqualPolicy"

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
