.class public final LCd/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCd/u0;


# instance fields
.field public final a:Lwd/c;

.field public b:I

.field public c:Lxd/c;


# direct methods
.method public constructor <init>(Lwd/c;)V
    .locals 1

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LCd/i0;->a:Lwd/c;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(LFd/c;Llf/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, LCd/h0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LCd/h0;

    .line 7
    .line 8
    iget v1, v0, LCd/h0;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LCd/h0;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LCd/h0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LCd/h0;-><init>(LCd/i0;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LCd/h0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LCd/h0;->c:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p0, LCd/i0;->c:Lxd/c;

    .line 53
    .line 54
    if-eqz p2, :cond_3

    .line 55
    .line 56
    invoke-static {p2, v3}, LEf/H;->j(LEf/E;Ljava/util/concurrent/CancellationException;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    iget p2, p0, LCd/i0;->b:I

    .line 60
    .line 61
    const/16 v2, 0x14

    .line 62
    .line 63
    if-ge p2, v2, :cond_7

    .line 64
    .line 65
    add-int/2addr p2, v4

    .line 66
    iput p2, p0, LCd/i0;->b:I

    .line 67
    .line 68
    iget-object p2, p0, LCd/i0;->a:Lwd/c;

    .line 69
    .line 70
    iget-object p2, p2, Lwd/c;->g:LFd/f;

    .line 71
    .line 72
    iget-object v2, p1, LFd/c;->d:Ljava/lang/Object;

    .line 73
    .line 74
    iput v4, v0, LCd/h0;->c:I

    .line 75
    .line 76
    invoke-virtual {p2, p1, v2, v0}, LRd/d;->a(Ljava/lang/Object;Ljava/lang/Object;Llf/c;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    if-ne p2, v1, :cond_4

    .line 81
    .line 82
    return-object v1

    .line 83
    :cond_4
    :goto_1
    instance-of p1, p2, Lxd/c;

    .line 84
    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    move-object v3, p2

    .line 88
    check-cast v3, Lxd/c;

    .line 89
    .line 90
    :cond_5
    if-eqz v3, :cond_6

    .line 91
    .line 92
    iput-object v3, p0, LCd/i0;->c:Lxd/c;

    .line 93
    .line 94
    return-object v3

    .line 95
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 96
    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v1, "Failed to execute send pipeline. Expected [HttpClientCall], but received "

    .line 100
    .line 101
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p1

    .line 119
    :cond_7
    new-instance p1, LCd/s0;

    .line 120
    .line 121
    const-string p2, "Max send count 20 exceeded. Consider increasing the property maxSendCount if more is required."

    .line 122
    .line 123
    const/4 v0, 0x1

    .line 124
    invoke-direct {p1, p2, v0}, LCd/s0;-><init>(Ljava/lang/String;I)V

    .line 125
    .line 126
    .line 127
    throw p1
.end method
