.class public final LHf/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LHf/l;


# direct methods
.method public synthetic constructor <init>(LHf/l;I)V
    .locals 0

    .line 1
    iput p2, p0, LHf/F;->a:I

    iput-object p1, p0, LHf/F;->b:LHf/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final collect(LHf/m;Ljf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LHf/F;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LHf/f;

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, LHf/f;-><init>(LHf/m;I)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LHf/F;->b:LHf/l;

    .line 14
    .line 15
    invoke-interface {p1, v0, p2}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 20
    .line 21
    if-ne p1, p2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 25
    .line 26
    :goto_0
    return-object p1

    .line 27
    :pswitch_0
    instance-of v0, p2, LHf/E;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    move-object v0, p2

    .line 32
    check-cast v0, LHf/E;

    .line 33
    .line 34
    iget v1, v0, LHf/E;->b:I

    .line 35
    .line 36
    const/high16 v2, -0x80000000

    .line 37
    .line 38
    and-int v3, v1, v2

    .line 39
    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    sub-int/2addr v1, v2

    .line 43
    iput v1, v0, LHf/E;->b:I

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance v0, LHf/E;

    .line 47
    .line 48
    invoke-direct {v0, p0, p2}, LHf/E;-><init>(LHf/F;Ljf/c;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    iget-object p2, v0, LHf/E;->a:Ljava/lang/Object;

    .line 52
    .line 53
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 54
    .line 55
    iget v2, v0, LHf/E;->b:I

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    if-ne v2, v3, :cond_2

    .line 61
    .line 62
    iget-object p1, v0, LHf/E;->d:Ljava/lang/Object;

    .line 63
    .line 64
    :try_start_0
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch LIf/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :catch_0
    move-exception p2

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_3
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance p2, Ljava/lang/Object;

    .line 82
    .line 83
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 84
    .line 85
    .line 86
    new-instance v2, Lkotlin/jvm/internal/E;

    .line 87
    .line 88
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    :try_start_1
    iget-object v4, p0, LHf/F;->b:LHf/l;

    .line 92
    .line 93
    new-instance v5, LHf/j;

    .line 94
    .line 95
    invoke-direct {v5, v2, p1, p2}, LHf/j;-><init>(Lkotlin/jvm/internal/E;LHf/m;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iput-object p2, v0, LHf/E;->d:Ljava/lang/Object;

    .line 99
    .line 100
    iput v3, v0, LHf/E;->b:I

    .line 101
    .line 102
    invoke-interface {v4, v5, v0}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1
    :try_end_1
    .catch LIf/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 106
    if-ne p1, v1, :cond_4

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :catch_1
    move-exception p1

    .line 110
    move-object v6, p2

    .line 111
    move-object p2, p1

    .line 112
    move-object p1, v6

    .line 113
    :goto_2
    iget-object v0, p2, LIf/a;->a:Ljava/lang/Object;

    .line 114
    .line 115
    if-ne v0, p1, :cond_5

    .line 116
    .line 117
    :cond_4
    :goto_3
    sget-object v1, Lef/C;->a:Lef/C;

    .line 118
    .line 119
    :goto_4
    return-object v1

    .line 120
    :cond_5
    throw p2

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
