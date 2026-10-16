.class public final Lx4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:J

.field public final c:J

.field public final d:Z


# direct methods
.method public constructor <init>(JIJZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lx4/h;->a:I

    .line 5
    .line 6
    iput-wide p1, p0, Lx4/h;->b:J

    .line 7
    .line 8
    iput-wide p4, p0, Lx4/h;->c:J

    .line 9
    .line 10
    iput-boolean p6, p0, Lx4/h;->d:Z

    .line 11
    .line 12
    return-void
.end method

.method public static a(Ljava/util/Map;)Lx4/h;
    .locals 12

    .line 1
    const/4 v3, 0x5

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    new-instance v0, Lx4/h;

    .line 5
    .line 6
    const/4 v6, 0x0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    const-wide/16 v4, 0x1388

    .line 10
    .line 11
    invoke-direct/range {v0 .. v6}, Lx4/h;-><init>(JIJZ)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const-string v0, "accuracy"

    .line 16
    .line 17
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/Integer;

    .line 22
    .line 23
    const-string v1, "distanceFilter"

    .line 24
    .line 25
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/Integer;

    .line 30
    .line 31
    const-string v2, "timeInterval"

    .line 32
    .line 33
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/Integer;

    .line 38
    .line 39
    const-string v4, "useMSLAltitude"

    .line 40
    .line 41
    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Ljava/lang/Boolean;

    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_6

    .line 55
    .line 56
    const/4 v5, 0x2

    .line 57
    if-eq v0, v4, :cond_5

    .line 58
    .line 59
    const/4 v6, 0x3

    .line 60
    if-eq v0, v5, :cond_4

    .line 61
    .line 62
    if-eq v0, v6, :cond_3

    .line 63
    .line 64
    const/4 v5, 0x5

    .line 65
    if-eq v0, v5, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const/4 v3, 0x6

    .line 69
    :cond_2
    :goto_0
    move v8, v3

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    const/4 v3, 0x4

    .line 72
    goto :goto_0

    .line 73
    :cond_4
    move v8, v6

    .line 74
    goto :goto_1

    .line 75
    :cond_5
    move v8, v5

    .line 76
    goto :goto_1

    .line 77
    :cond_6
    move v8, v4

    .line 78
    :goto_1
    new-instance v5, Lx4/h;

    .line 79
    .line 80
    if-eqz v1, :cond_7

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    int-to-long v0, v0

    .line 87
    :goto_2
    move-wide v6, v0

    .line 88
    goto :goto_3

    .line 89
    :cond_7
    const-wide/16 v0, 0x0

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :goto_3
    if-eqz v2, :cond_8

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    int-to-long v0, v0

    .line 99
    :goto_4
    move-wide v9, v0

    .line 100
    goto :goto_5

    .line 101
    :cond_8
    const-wide/16 v0, 0x1388

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :goto_5
    if-eqz p0, :cond_9

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-eqz p0, :cond_9

    .line 111
    .line 112
    :goto_6
    move v11, v4

    .line 113
    goto :goto_7

    .line 114
    :cond_9
    const/4 v4, 0x0

    .line 115
    goto :goto_6

    .line 116
    :goto_7
    invoke-direct/range {v5 .. v11}, Lx4/h;-><init>(JIJZ)V

    .line 117
    .line 118
    .line 119
    return-object v5
.end method
