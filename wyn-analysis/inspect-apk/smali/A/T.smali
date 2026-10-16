.class public final LA/T;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:LA/U;


# direct methods
.method public synthetic constructor <init>(LA/U;I)V
    .locals 0

    .line 1
    iput p2, p0, LA/T;->i:I

    iput-object p1, p0, LA/T;->j:LA/U;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LA/T;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/T;->j:LA/U;

    .line 7
    .line 8
    invoke-virtual {v0}, LA/U;->b()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Lz/f;->b:Lz/f;

    .line 13
    .line 14
    if-eq v1, v2, :cond_1

    .line 15
    .line 16
    iget-object v0, v0, LA/U;->c:LN/Y;

    .line 17
    .line 18
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-ne v0, v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 28
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :pswitch_0
    iget-object v0, p0, LA/T;->j:LA/U;

    .line 34
    .line 35
    iget-object v1, v0, LA/U;->h:LX/p;

    .line 36
    .line 37
    invoke-virtual {v1}, LX/p;->listIterator()Ljava/util/ListIterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-wide/16 v2, 0x0

    .line 42
    .line 43
    :goto_2
    move-object v4, v1

    .line 44
    check-cast v4, LX/v;

    .line 45
    .line 46
    invoke-virtual {v4}, LX/v;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_2

    .line 51
    .line 52
    invoke-virtual {v4}, LX/v;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, LA/O;

    .line 57
    .line 58
    invoke-virtual {v4}, LA/O;->a()LA/L;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    iget-wide v4, v4, LA/L;->h:J

    .line 63
    .line 64
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 65
    .line 66
    .line 67
    move-result-wide v2

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    iget-object v0, v0, LA/U;->i:LX/p;

    .line 70
    .line 71
    invoke-virtual {v0}, LX/p;->listIterator()Ljava/util/ListIterator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :goto_3
    move-object v1, v0

    .line 76
    check-cast v1, LX/v;

    .line 77
    .line 78
    invoke-virtual {v1}, LX/v;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    invoke-virtual {v1}, LX/v;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, LA/U;

    .line 89
    .line 90
    iget-object v1, v1, LA/U;->k:LN/z;

    .line 91
    .line 92
    invoke-virtual {v1}, LN/z;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Ljava/lang/Number;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 99
    .line 100
    .line 101
    move-result-wide v4

    .line 102
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 103
    .line 104
    .line 105
    move-result-wide v2

    .line 106
    goto :goto_3

    .line 107
    :cond_3
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    return-object v0

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
