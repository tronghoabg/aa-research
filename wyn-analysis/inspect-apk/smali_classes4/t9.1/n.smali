.class public final Lt9/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/p;


# static fields
.field public static final a:Lt9/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lt9/n;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lt9/n;->a:Lt9/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lka/C1;)Lka/C1;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public final b(Lka/C1;Ls8/q;)Lka/C1;
    .locals 5

    .line 1
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "server_timestamp"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lka/B1;->n(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lka/C1;

    .line 15
    .line 16
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {}, Lcom/google/protobuf/Timestamp;->newBuilder()Lcom/google/protobuf/Timestamp$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-wide v3, p2, Ls8/q;->a:J

    .line 25
    .line 26
    invoke-virtual {v2, v3, v4}, Lcom/google/protobuf/Timestamp$Builder;->setSeconds(J)Lcom/google/protobuf/Timestamp$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget p2, p2, Ls8/q;->b:I

    .line 31
    .line 32
    invoke-virtual {v2, p2}, Lcom/google/protobuf/Timestamp$Builder;->setNanos(I)Lcom/google/protobuf/Timestamp$Builder;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {v1, p2}, Lka/B1;->o(Lcom/google/protobuf/Timestamp$Builder;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    check-cast p2, Lka/C1;

    .line 44
    .line 45
    invoke-static {}, Lka/p0;->f()Lka/n0;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "__type__"

    .line 50
    .line 51
    invoke-virtual {v1, v2, v0}, Lka/n0;->b(Ljava/lang/String;Lka/C1;)V

    .line 52
    .line 53
    .line 54
    const-string v0, "__local_write_time__"

    .line 55
    .line 56
    invoke-virtual {v1, v0, p2}, Lka/n0;->b(Ljava/lang/String;Lka/C1;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Ls9/n;->c(Lka/C1;)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-eqz p2, :cond_0

    .line 64
    .line 65
    invoke-static {p1}, Ls9/n;->b(Lka/C1;)Lka/C1;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :cond_0
    if-eqz p1, :cond_1

    .line 70
    .line 71
    const-string p2, "__previous_value__"

    .line 72
    .line 73
    invoke-virtual {v1, p2, p1}, Lka/n0;->b(Ljava/lang/String;Lka/C1;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1, v1}, Lka/B1;->j(Lka/n0;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Lka/C1;

    .line 88
    .line 89
    return-object p1
.end method

.method public final c(Lka/C1;Lka/C1;)Lka/C1;
    .locals 0

    .line 1
    return-object p2
.end method
