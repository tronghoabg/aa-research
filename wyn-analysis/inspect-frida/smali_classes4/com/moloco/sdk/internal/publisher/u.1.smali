.class public final Lcom/moloco/sdk/internal/publisher/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:J


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    invoke-static {}, Lcom/moloco/sdk/internal/publisher/c0;->values()[Lcom/moloco/sdk/internal/publisher/c0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    array-length v2, v0

    .line 8
    invoke-static {v2}, Lff/B;->D(I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/16 v3, 0x10

    .line 13
    .line 14
    if-ge v2, v3, :cond_0

    .line 15
    .line 16
    move v2, v3

    .line 17
    :cond_0
    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 18
    .line 19
    .line 20
    array-length v2, v0

    .line 21
    const/4 v3, 0x0

    .line 22
    :goto_0
    const/4 v4, 0x5

    .line 23
    if-ge v3, v2, :cond_1

    .line 24
    .line 25
    aget-object v5, v0, v3

    .line 26
    .line 27
    sget-object v6, Lcom/moloco/sdk/internal/publisher/t;->a:[I

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    aget v6, v6, v7

    .line 34
    .line 35
    packed-switch v6, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    new-instance v0, LE5/Q;

    .line 39
    .line 40
    const/16 v1, 0x9

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :pswitch_0
    sget-object v4, LCf/c;->d:LCf/c;

    .line 48
    .line 49
    const/16 v6, 0xf

    .line 50
    .line 51
    invoke-static {v6, v4}, LFe/b;->S(ILCf/c;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v6

    .line 55
    goto :goto_1

    .line 56
    :pswitch_1
    sget-object v6, LCf/c;->d:LCf/c;

    .line 57
    .line 58
    invoke-static {v4, v6}, LFe/b;->S(ILCf/c;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v6

    .line 62
    :goto_1
    new-instance v4, LCf/a;

    .line 63
    .line 64
    invoke-direct {v4, v6, v7}, LCf/a;-><init>(J)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    add-int/lit8 v3, v3, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    sget-object v0, LCf/c;->d:LCf/c;

    .line 74
    .line 75
    invoke-static {v4, v0}, LFe/b;->S(ILCf/c;)J

    .line 76
    .line 77
    .line 78
    move-result-wide v2

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object v1, p0, Lcom/moloco/sdk/internal/publisher/u;->a:Ljava/util/Map;

    .line 83
    .line 84
    iput-wide v2, p0, Lcom/moloco/sdk/internal/publisher/u;->b:J

    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/moloco/sdk/internal/publisher/u;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    check-cast p1, Lcom/moloco/sdk/internal/publisher/u;

    .line 12
    .line 13
    iget-object v1, p1, Lcom/moloco/sdk/internal/publisher/u;->a:Ljava/util/Map;

    .line 14
    .line 15
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/u;->a:Ljava/util/Map;

    .line 16
    .line 17
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    :goto_0
    return v2

    .line 24
    :cond_2
    sget-object v1, LCf/a;->b:LCf/h;

    .line 25
    .line 26
    iget-wide v3, p0, Lcom/moloco/sdk/internal/publisher/u;->b:J

    .line 27
    .line 28
    iget-wide v5, p1, Lcom/moloco/sdk/internal/publisher/u;->b:J

    .line 29
    .line 30
    cmp-long p1, v3, v5

    .line 31
    .line 32
    if-nez p1, :cond_3

    .line 33
    .line 34
    return v0

    .line 35
    :cond_3
    return v2
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/u;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    sget-object v1, LCf/a;->b:LCf/h;

    .line 10
    .line 11
    const/16 v1, 0x20

    .line 12
    .line 13
    iget-wide v2, p0, Lcom/moloco/sdk/internal/publisher/u;->b:J

    .line 14
    .line 15
    ushr-long v4, v2, v1

    .line 16
    .line 17
    xor-long/2addr v2, v4

    .line 18
    long-to-int v1, v2

    .line 19
    add-int/2addr v1, v0

    .line 20
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AdCreatorConfiguration(adTimeouts="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/u;->a:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", defaultTimeoutDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/moloco/sdk/internal/publisher/u;->b:J

    invoke-static {v1, v2}, LCf/a;->j(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
