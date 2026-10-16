.class public final Lcom/moloco/sdk/internal/services/init/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/c;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/c;)V
    .locals 1

    .line 1
    const-string v0, "httpRequestClient"

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
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/init/u;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/c;

    .line 10
    .line 11
    return-void
.end method

.method public static b(Lcom/moloco/sdk/internal/services/init/n;J)[B
    .locals 4

    .line 1
    invoke-static {}, Lcom/moloco/sdk/c1;->e()Lcom/moloco/sdk/b1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/moloco/sdk/Y0;->d()Lcom/moloco/sdk/S0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    instance-of v2, p0, Lcom/moloco/sdk/internal/services/init/l;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lcom/moloco/sdk/V0;->c()Lcom/moloco/sdk/T0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast p0, Lcom/moloco/sdk/internal/services/init/l;

    .line 18
    .line 19
    iget-object p0, p0, Lcom/moloco/sdk/internal/services/init/l;->a:Lcom/moloco/sdk/internal/services/init/b;

    .line 20
    .line 21
    sget-object v3, Lcom/moloco/sdk/internal/services/init/t;->a:[I

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    aget p0, v3, p0

    .line 28
    .line 29
    packed-switch p0, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    new-instance p0, LE5/Q;

    .line 33
    .line 34
    const/16 p1, 0x9

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-direct {p0, p2, p1}, LE5/Q;-><init>(BI)V

    .line 38
    .line 39
    .line 40
    throw p0

    .line 41
    :pswitch_0
    sget-object p0, Lcom/moloco/sdk/U0;->g:Lcom/moloco/sdk/U0;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_1
    sget-object p0, Lcom/moloco/sdk/U0;->c:Lcom/moloco/sdk/U0;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_2
    sget-object p0, Lcom/moloco/sdk/U0;->f:Lcom/moloco/sdk/U0;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_3
    sget-object p0, Lcom/moloco/sdk/U0;->d:Lcom/moloco/sdk/U0;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_4
    sget-object p0, Lcom/moloco/sdk/U0;->e:Lcom/moloco/sdk/U0;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_5
    sget-object p0, Lcom/moloco/sdk/U0;->b:Lcom/moloco/sdk/U0;

    .line 57
    .line 58
    :goto_0
    invoke-virtual {v2, p0}, Lcom/moloco/sdk/T0;->a(Lcom/moloco/sdk/U0;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Lcom/moloco/sdk/V0;

    .line 66
    .line 67
    invoke-virtual {v1, p0}, Lcom/moloco/sdk/S0;->a(Lcom/moloco/sdk/V0;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_0
    instance-of v2, p0, Lcom/moloco/sdk/internal/services/init/m;

    .line 72
    .line 73
    if-eqz v2, :cond_1

    .line 74
    .line 75
    invoke-static {}, Lcom/moloco/sdk/X0;->c()Lcom/moloco/sdk/W0;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast p0, Lcom/moloco/sdk/internal/services/init/m;

    .line 80
    .line 81
    iget p0, p0, Lcom/moloco/sdk/internal/services/init/m;->a:I

    .line 82
    .line 83
    invoke-virtual {v2, p0}, Lcom/moloco/sdk/W0;->a(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, Lcom/moloco/sdk/X0;

    .line 91
    .line 92
    invoke-virtual {v1, p0}, Lcom/moloco/sdk/S0;->b(Lcom/moloco/sdk/X0;)V

    .line 93
    .line 94
    .line 95
    :goto_1
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, Lcom/moloco/sdk/Y0;

    .line 100
    .line 101
    invoke-virtual {v0, p0}, Lcom/moloco/sdk/b1;->a(Lcom/moloco/sdk/Y0;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p1, p2}, Lcom/moloco/sdk/b1;->b(J)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    check-cast p0, Lcom/moloco/sdk/c1;

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    const-string p1, "toByteArray(...)"

    .line 118
    .line 119
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-object p0

    .line 123
    :cond_1
    new-instance p0, LE5/Q;

    .line 124
    .line 125
    const/16 p1, 0x9

    .line 126
    .line 127
    const/4 p2, 0x0

    .line 128
    invoke-direct {p0, p2, p1}, LE5/Q;-><init>(BI)V

    .line 129
    .line 130
    .line 131
    throw p0

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Lcom/moloco/sdk/internal/services/init/n;J)V
    .locals 9

    .line 1
    const-string v0, "Reporting InitTracking server failure: "

    .line 2
    .line 3
    const-string v1, "Reporting InitTracking client failure: "

    .line 4
    .line 5
    :try_start_0
    instance-of v2, p1, Lcom/moloco/sdk/internal/services/init/l;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    sget-object v3, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 10
    .line 11
    const-string v4, "InitTrackingApi"

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    move-object v1, p1

    .line 19
    check-cast v1, Lcom/moloco/sdk/internal/services/init/l;

    .line 20
    .line 21
    iget-object v1, v1, Lcom/moloco/sdk/internal/services/init/l;->a:Lcom/moloco/sdk/internal/services/init/b;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x4

    .line 33
    invoke-static/range {v3 .. v8}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catch_0
    move-exception v0

    .line 38
    move-object p1, v0

    .line 39
    move-object v3, p1

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    instance-of v1, p1, Lcom/moloco/sdk/internal/services/init/m;

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 46
    .line 47
    const-string v3, "InitTrackingApi"

    .line 48
    .line 49
    new-instance v1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    move-object v0, p1

    .line 55
    check-cast v0, Lcom/moloco/sdk/internal/services/init/m;

    .line 56
    .line 57
    iget v0, v0, Lcom/moloco/sdk/internal/services/init/m;->a:I

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    const/4 v7, 0x0

    .line 67
    const/4 v5, 0x0

    .line 68
    const/4 v6, 0x4

    .line 69
    invoke-static/range {v2 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    const-string v0, "https://sdkopmetrics-us.dsp-api.moloco.com/v1/tracking/init"

    .line 73
    .line 74
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {p1, p2, p3}, Lcom/moloco/sdk/internal/services/init/u;->b(Lcom/moloco/sdk/internal/services/init/n;J)[B

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object p2, p0, Lcom/moloco/sdk/internal/services/init/u;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/c;

    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    const-string v0, "toString(...)"

    .line 97
    .line 98
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    sget-object v0, LJd/c;->b:LJd/f;

    .line 102
    .line 103
    const/4 v1, 0x0

    .line 104
    invoke-virtual {p2, p3, p1, v0, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/c;->a(Ljava/lang/String;[BLJd/f;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_1
    new-instance p1, LE5/Q;

    .line 109
    .line 110
    const/16 p2, 0x9

    .line 111
    .line 112
    const/4 p3, 0x0

    .line 113
    invoke-direct {p1, p3, p2}, LE5/Q;-><init>(BI)V

    .line 114
    .line 115
    .line 116
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    :goto_1
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 118
    .line 119
    const-string v2, "Failed to send notifyFailure post request"

    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    const-string v1, "InitTrackingApi"

    .line 123
    .line 124
    const/16 v5, 0x8

    .line 125
    .line 126
    const/4 v6, 0x0

    .line 127
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method
