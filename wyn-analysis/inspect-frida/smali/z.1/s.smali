.class public final Lz/s;
.super Lz/p;
.source "SourceFile"


# instance fields
.field public final a:LA/i;

.field public final b:LKd/a;

.field public c:Lz/q;


# direct methods
.method public constructor <init>(LA/i;LKd/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz/s;->a:LA/i;

    .line 5
    .line 6
    iput-object p2, p0, Lz/s;->b:LKd/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final q(Lt0/r;Lr0/m;J)LD0/b;
    .locals 8

    .line 1
    const-string v0, "$this$measure"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "measurable"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p2, p3, p4}, Lr0/m;->e(J)Lr0/t;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iget p3, p2, Lr0/t;->a:I

    .line 16
    .line 17
    iget p4, p2, Lr0/t;->b:I

    .line 18
    .line 19
    invoke-static {p3, p4}, LBa/c;->a(II)J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    iget-object v1, p0, Lz/s;->c:Lz/q;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object p3, v1, Lz/q;->a:LA/e;

    .line 28
    .line 29
    iget-object p4, p3, LA/e;->e:LN/Y;

    .line 30
    .line 31
    invoke-virtual {p4}, LN/Y;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p4

    .line 35
    check-cast p4, LL0/h;

    .line 36
    .line 37
    iget-wide v4, p4, LL0/h;->a:J

    .line 38
    .line 39
    invoke-static {v2, v3, v4, v5}, LL0/h;->a(JJ)Z

    .line 40
    .line 41
    .line 42
    move-result p4

    .line 43
    if-nez p4, :cond_0

    .line 44
    .line 45
    invoke-virtual {p3}, LA/e;->d()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    check-cast p3, LL0/h;

    .line 50
    .line 51
    iget-wide p3, p3, LL0/h;->a:J

    .line 52
    .line 53
    iput-wide p3, v1, Lz/q;->b:J

    .line 54
    .line 55
    new-instance v0, Lz/r;

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    move-object v4, p0

    .line 59
    invoke-direct/range {v0 .. v5}, Lz/r;-><init>(Lz/q;JLz/s;Ljf/c;)V

    .line 60
    .line 61
    .line 62
    iget-object p3, v4, Lz/s;->b:LKd/a;

    .line 63
    .line 64
    const/4 p4, 0x3

    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-static {p3, v2, v0, p4}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move-object v4, p0

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    move-object v4, p0

    .line 73
    new-instance v1, Lz/q;

    .line 74
    .line 75
    new-instance p3, LA/e;

    .line 76
    .line 77
    new-instance p4, LL0/h;

    .line 78
    .line 79
    invoke-direct {p4, v2, v3}, LL0/h;-><init>(J)V

    .line 80
    .line 81
    .line 82
    sget-object v0, LA/b0;->h:LS3/e;

    .line 83
    .line 84
    const/4 v5, 0x1

    .line 85
    invoke-static {v5, v5}, LBa/c;->a(II)J

    .line 86
    .line 87
    .line 88
    move-result-wide v5

    .line 89
    new-instance v7, LL0/h;

    .line 90
    .line 91
    invoke-direct {v7, v5, v6}, LL0/h;-><init>(J)V

    .line 92
    .line 93
    .line 94
    invoke-direct {p3, p4, v0, v7}, LA/e;-><init>(Ljava/lang/Object;LS3/e;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-direct {v1, p3, v2, v3}, Lz/q;-><init>(LA/e;J)V

    .line 98
    .line 99
    .line 100
    :goto_0
    iput-object v1, v4, Lz/s;->c:Lz/q;

    .line 101
    .line 102
    iget-object p3, v1, Lz/q;->a:LA/e;

    .line 103
    .line 104
    invoke-virtual {p3}, LA/e;->d()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    check-cast p3, LL0/h;

    .line 109
    .line 110
    iget-wide p3, p3, LL0/h;->a:J

    .line 111
    .line 112
    const/16 v0, 0x20

    .line 113
    .line 114
    shr-long v0, p3, v0

    .line 115
    .line 116
    long-to-int v0, v0

    .line 117
    const-wide v1, 0xffffffffL

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    and-long/2addr p3, v1

    .line 123
    long-to-int p3, p3

    .line 124
    new-instance p4, LE/w;

    .line 125
    .line 126
    const/4 v1, 0x7

    .line 127
    invoke-direct {p4, p2, v1}, LE/w;-><init>(Lr0/t;I)V

    .line 128
    .line 129
    .line 130
    invoke-static {p1, v0, p3, p4}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    return-object p1
.end method
