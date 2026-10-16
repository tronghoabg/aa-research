.class public final LYf/b;
.super Lcom/moloco/sdk/internal/publisher/H;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:LYf/u;

.field public final synthetic d:Ljava/lang/String;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LYf/u;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LYf/b;->b:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYf/b;->c:LYf/u;

    iput-object p2, p0, LYf/b;->d:Ljava/lang/String;

    .line 3
    iget-object p1, p1, LYf/u;->b:LXf/c;

    .line 4
    iget-object p1, p1, LXf/c;->b:Lza/a;

    .line 5
    iput-object p1, p0, LYf/b;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LYf/u;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LYf/b;->b:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, LYf/b;->c:LYf/u;

    iput-object p2, p0, LYf/b;->d:Ljava/lang/String;

    iput-object p3, p0, LYf/b;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public C(I)V
    .locals 4

    .line 1
    iget v0, p0, LYf/b;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/moloco/sdk/internal/publisher/H;->C(I)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    int-to-long v0, p1

    .line 11
    const-wide v2, 0xffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    and-long/2addr v0, v2

    .line 17
    const/16 p1, 0xa

    .line 18
    .line 19
    invoke-static {v0, v1, p1}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, LYf/b;->z0(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public F(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget v0, p0, LYf/b;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/moloco/sdk/internal/publisher/H;->F(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const-string v0, "value"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, LXf/p;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iget-object v2, p0, LYf/b;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 21
    .line 22
    invoke-direct {v0, p1, v1, v2}, LXf/p;-><init>(Ljava/io/Serializable;ZLkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, LYf/b;->c:LYf/u;

    .line 26
    .line 27
    iget-object v1, p0, LYf/b;->d:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, v1, v0}, LYf/u;->N(Ljava/lang/String;Lkotlinx/serialization/json/b;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final a()Lza/a;
    .locals 1

    .line 1
    iget v0, p0, LYf/b;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LYf/b;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lza/a;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, LYf/b;->c:LYf/u;

    .line 12
    .line 13
    iget-object v0, v0, LYf/u;->b:LXf/c;

    .line 14
    .line 15
    iget-object v0, v0, LXf/c;->b:Lza/a;

    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public g(B)V
    .locals 1

    .line 1
    iget v0, p0, LYf/b;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/moloco/sdk/internal/publisher/H;->g(B)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    and-int/lit16 p1, p1, 0xff

    .line 11
    .line 12
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, LYf/b;->z0(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public o(J)V
    .locals 10

    .line 1
    iget v0, p0, LYf/b;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/H;->o(J)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    cmp-long v2, p1, v0

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    const-string p1, "0"

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/16 v3, 0xa

    .line 20
    .line 21
    if-lez v2, :cond_1

    .line 22
    .line 23
    invoke-static {p1, p2, v3}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/16 v2, 0x40

    .line 29
    .line 30
    new-array v2, v2, [C

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    ushr-long v4, p1, v4

    .line 34
    .line 35
    const/4 v6, 0x5

    .line 36
    int-to-long v6, v6

    .line 37
    div-long/2addr v4, v6

    .line 38
    int-to-long v6, v3

    .line 39
    mul-long v8, v4, v6

    .line 40
    .line 41
    sub-long/2addr p1, v8

    .line 42
    long-to-int p1, p1

    .line 43
    invoke-static {p1, v3}, Ljava/lang/Character;->forDigit(II)C

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    const/16 p2, 0x3f

    .line 48
    .line 49
    aput-char p1, v2, p2

    .line 50
    .line 51
    :goto_0
    cmp-long p1, v4, v0

    .line 52
    .line 53
    if-lez p1, :cond_2

    .line 54
    .line 55
    add-int/lit8 p2, p2, -0x1

    .line 56
    .line 57
    rem-long v8, v4, v6

    .line 58
    .line 59
    long-to-int p1, v8

    .line 60
    invoke-static {p1, v3}, Ljava/lang/Character;->forDigit(II)C

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    aput-char p1, v2, p2

    .line 65
    .line 66
    div-long/2addr v4, v6

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    new-instance p1, Ljava/lang/String;

    .line 69
    .line 70
    rsub-int/lit8 v0, p2, 0x40

    .line 71
    .line 72
    invoke-direct {p1, v2, p2, v0}, Ljava/lang/String;-><init>([CII)V

    .line 73
    .line 74
    .line 75
    :goto_1
    invoke-virtual {p0, p1}, LYf/b;->z0(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public q(S)V
    .locals 1

    .line 1
    iget v0, p0, LYf/b;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/moloco/sdk/internal/publisher/H;->q(S)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const v0, 0xffff

    .line 11
    .line 12
    .line 13
    and-int/2addr p1, v0

    .line 14
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1}, LYf/b;->z0(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public z0(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "s"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LXf/p;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, p1, v2, v1}, LXf/p;-><init>(Ljava/io/Serializable;ZLkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LYf/b;->c:LYf/u;

    .line 14
    .line 15
    iget-object v1, p0, LYf/b;->d:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p1, v1, v0}, LYf/u;->N(Ljava/lang/String;Lkotlinx/serialization/json/b;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
