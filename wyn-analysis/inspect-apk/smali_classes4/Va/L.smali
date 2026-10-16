.class public final LVa/L;
.super LVa/Ba;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public synthetic d:LVa/V;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LVa/L;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LVa/V;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LVa/L;->c:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LVa/L;->d:LVa/V;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    .line 1
    iget v0, p0, LVa/L;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LVa/L;->d:LVa/V;

    .line 7
    .line 8
    sget v1, LVa/V;->p:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x35

    .line 11
    .line 12
    rem-int/lit16 v2, v1, 0x80

    .line 13
    .line 14
    sput v2, LVa/V;->q:I

    .line 15
    .line 16
    rem-int/lit8 v1, v1, 0x2

    .line 17
    .line 18
    invoke-virtual {v0}, LVa/V;->e()Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    const/16 v1, 0x1b

    .line 25
    .line 26
    div-int/lit8 v1, v1, 0x0

    .line 27
    .line 28
    :cond_0
    sget v1, LVa/V;->p:I

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x7

    .line 31
    .line 32
    rem-int/lit16 v2, v1, 0x80

    .line 33
    .line 34
    sput v2, LVa/V;->q:I

    .line 35
    .line 36
    rem-int/lit8 v1, v1, 0x2

    .line 37
    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    const/16 v1, 0x57

    .line 41
    .line 42
    div-int/lit8 v1, v1, 0x0

    .line 43
    .line 44
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, LVa/B7;

    .line 59
    .line 60
    invoke-virtual {v1}, LVa/B7;->q()V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    iget-object v0, p0, LVa/L;->d:LVa/V;

    .line 65
    .line 66
    invoke-static {v0}, LVa/V;->t(LVa/V;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    check-cast v0, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 75
    .line 76
    .line 77
    :cond_3
    iget-object v0, p0, LVa/L;->d:LVa/V;

    .line 78
    .line 79
    sget v1, LVa/V;->q:I

    .line 80
    .line 81
    add-int/lit8 v1, v1, 0x63

    .line 82
    .line 83
    rem-int/lit16 v1, v1, 0x80

    .line 84
    .line 85
    sput v1, LVa/V;->p:I

    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    iput-object v1, v0, LVa/V;->c:Ljava/util/ArrayList;

    .line 89
    .line 90
    sget v0, LVa/V;->q:I

    .line 91
    .line 92
    add-int/lit8 v0, v0, 0x53

    .line 93
    .line 94
    rem-int/lit16 v0, v0, 0x80

    .line 95
    .line 96
    sput v0, LVa/V;->p:I

    .line 97
    .line 98
    iget-object v2, p0, LVa/L;->d:LVa/V;

    .line 99
    .line 100
    add-int/lit8 v0, v0, 0x49

    .line 101
    .line 102
    rem-int/lit16 v3, v0, 0x80

    .line 103
    .line 104
    sput v3, LVa/V;->q:I

    .line 105
    .line 106
    rem-int/lit8 v0, v0, 0x2

    .line 107
    .line 108
    iput-object v1, v2, LVa/V;->h:LVa/x8;

    .line 109
    .line 110
    if-eqz v0, :cond_4

    .line 111
    .line 112
    return-void

    .line 113
    :cond_4
    throw v1

    .line 114
    :pswitch_0
    new-instance v0, LVa/v;

    .line 115
    .line 116
    const/16 v1, 0x8

    .line 117
    .line 118
    invoke-direct {v0, v1}, LVa/v;-><init>(I)V

    .line 119
    .line 120
    .line 121
    iput-object p0, v0, LVa/v;->d:Ljava/lang/Object;

    .line 122
    .line 123
    invoke-static {v0}, LVa/Cb;->g(LVa/Ba;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
