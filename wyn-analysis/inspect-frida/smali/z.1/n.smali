.class public final Lz/n;
.super Lz/p;
.source "SourceFile"


# instance fields
.field public final a:LA/M;

.field public final b:LA/M;

.field public final c:LN/V;

.field public final d:LN/V;

.field public final e:LN/V;

.field public f:LZ/d;

.field public final g:LB/F;


# direct methods
.method public constructor <init>(LA/M;LA/M;LN/V;LN/V;LN/V;)V
    .locals 1

    .line 1
    const-string v0, "sizeAnimation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "offsetAnimation"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lz/n;->a:LA/M;

    .line 15
    .line 16
    iput-object p2, p0, Lz/n;->b:LA/M;

    .line 17
    .line 18
    iput-object p3, p0, Lz/n;->c:LN/V;

    .line 19
    .line 20
    iput-object p4, p0, Lz/n;->d:LN/V;

    .line 21
    .line 22
    iput-object p5, p0, Lz/n;->e:LN/V;

    .line 23
    .line 24
    new-instance p1, LB/F;

    .line 25
    .line 26
    const/16 p2, 0x19

    .line 27
    .line 28
    invoke-direct {p1, p0, p2}, LB/F;-><init>(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lz/n;->g:LB/F;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final q(Lt0/r;Lr0/m;J)LD0/b;
    .locals 9

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
    move-result-object v2

    .line 15
    iget p2, v2, Lr0/t;->a:I

    .line 16
    .line 17
    iget p3, v2, Lr0/t;->b:I

    .line 18
    .line 19
    invoke-static {p2, p3}, LBa/c;->a(II)J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    iget-object p2, p0, Lz/n;->g:LB/F;

    .line 24
    .line 25
    new-instance p3, Lz/m;

    .line 26
    .line 27
    const/4 p4, 0x0

    .line 28
    invoke-direct {p3, p0, v4, v5, p4}, Lz/m;-><init>(Lz/n;JI)V

    .line 29
    .line 30
    .line 31
    iget-object p4, p0, Lz/n;->a:LA/M;

    .line 32
    .line 33
    invoke-virtual {p4, p2, p3}, LA/M;->a(Ltf/l;Ltf/l;)LS3/i;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, LS3/i;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast p2, LL0/h;

    .line 42
    .line 43
    iget-wide v6, p2, LL0/h;->a:J

    .line 44
    .line 45
    sget-object p2, Lz/b;->p:Lz/b;

    .line 46
    .line 47
    new-instance p3, Lz/m;

    .line 48
    .line 49
    const/4 p4, 0x1

    .line 50
    invoke-direct {p3, p0, v4, v5, p4}, Lz/m;-><init>(Lz/n;JI)V

    .line 51
    .line 52
    .line 53
    iget-object p4, p0, Lz/n;->b:LA/M;

    .line 54
    .line 55
    invoke-virtual {p4, p2, p3}, LA/M;->a(Ltf/l;Ltf/l;)LS3/i;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p2}, LS3/i;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    check-cast p2, LL0/g;

    .line 64
    .line 65
    iget-wide p2, p2, LL0/g;->a:J

    .line 66
    .line 67
    iget-object v3, p0, Lz/n;->f:LZ/d;

    .line 68
    .line 69
    if-eqz v3, :cond_0

    .line 70
    .line 71
    sget-object v8, LL0/i;->a:LL0/i;

    .line 72
    .line 73
    invoke-virtual/range {v3 .. v8}, LZ/d;->a(JJLL0/i;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v0

    .line 77
    :goto_0
    move-wide v3, v0

    .line 78
    goto :goto_1

    .line 79
    :cond_0
    sget-wide v0, LL0/g;->b:J

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :goto_1
    const/16 p4, 0x20

    .line 83
    .line 84
    shr-long v0, v6, p4

    .line 85
    .line 86
    long-to-int p4, v0

    .line 87
    const-wide v0, 0xffffffffL

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    and-long/2addr v0, v6

    .line 93
    long-to-int v0, v0

    .line 94
    new-instance v1, Lz/l;

    .line 95
    .line 96
    move-wide v5, p2

    .line 97
    invoke-direct/range {v1 .. v6}, Lz/l;-><init>(Lr0/t;JJ)V

    .line 98
    .line 99
    .line 100
    invoke-static {p1, p4, v0, v1}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    return-object p1
.end method
