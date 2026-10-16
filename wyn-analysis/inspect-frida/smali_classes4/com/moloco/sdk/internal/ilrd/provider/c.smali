.class public final Lcom/moloco/sdk/internal/ilrd/provider/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/internal/ilrd/provider/d;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/ilrd/provider/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/provider/c;->a:Lcom/moloco/sdk/internal/ilrd/provider/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getCommunicatorId()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Moloco"

    .line 2
    .line 3
    return-object v0
.end method

.method public final onMessageReceived(Lcom/applovin/communicator/AppLovinCommunicatorMessage;)V
    .locals 10

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/internal/ilrd/provider/c;->a:Lcom/moloco/sdk/internal/ilrd/provider/d;

    .line 7
    .line 8
    iget-object v1, v0, Lcom/moloco/sdk/internal/ilrd/provider/d;->b:LKd/a;

    .line 9
    .line 10
    invoke-static {v1}, LEf/H;->y(LEf/E;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto/16 :goto_0

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p1}, Lcom/applovin/communicator/AppLovinCommunicatorMessage;->getTopic()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "max_revenue_events"

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_8

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/applovin/communicator/AppLovinCommunicatorMessage;->getMessageData()Landroid/os/Bundle;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v1, "getMessageData(...)"

    .line 35
    .line 36
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, "revenue"

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    const-string v3, "country_code"

    .line 46
    .line 47
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    const-string v4, "network_name"

    .line 52
    .line 53
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    const-string v5, "max_ad_unit_id"

    .line 58
    .line 59
    invoke-virtual {p1, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    const-string v6, "third_party_ad_placement_id"

    .line 64
    .line 65
    invoke-virtual {p1, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    const-string v7, "ad_format"

    .line 70
    .line 71
    invoke-virtual {p1, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    const-string v8, "user_segment"

    .line 76
    .line 77
    invoke-virtual {p1, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    const-string v9, "id"

    .line 82
    .line 83
    invoke-virtual {p1, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {}, Lcom/moloco/sdk/l0;->k()Lcom/moloco/sdk/k0;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    invoke-virtual {v9, v1, v2}, Lcom/moloco/sdk/k0;->f(D)V

    .line 92
    .line 93
    .line 94
    if-eqz v3, :cond_1

    .line 95
    .line 96
    invoke-virtual {v9, v3}, Lcom/moloco/sdk/k0;->b(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_1
    if-eqz v4, :cond_2

    .line 100
    .line 101
    invoke-virtual {v9, v4}, Lcom/moloco/sdk/k0;->e(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :cond_2
    if-eqz v5, :cond_3

    .line 105
    .line 106
    invoke-virtual {v9, v5}, Lcom/moloco/sdk/k0;->d(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :cond_3
    if-eqz v6, :cond_4

    .line 110
    .line 111
    invoke-virtual {v9, v6}, Lcom/moloco/sdk/k0;->g(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    if-eqz v7, :cond_5

    .line 115
    .line 116
    invoke-virtual {v9, v7}, Lcom/moloco/sdk/k0;->a(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :cond_5
    if-eqz v8, :cond_6

    .line 120
    .line 121
    invoke-virtual {v9, v8}, Lcom/moloco/sdk/k0;->h(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :cond_6
    if-eqz p1, :cond_7

    .line 125
    .line 126
    invoke-virtual {v9, p1}, Lcom/moloco/sdk/k0;->c(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :cond_7
    invoke-virtual {v9}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    const-string v1, "build(...)"

    .line 134
    .line 135
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    check-cast p1, Lcom/moloco/sdk/l0;

    .line 139
    .line 140
    new-instance v1, Lcom/moloco/sdk/internal/ilrd/t;

    .line 141
    .line 142
    invoke-direct {v1, p1}, Lcom/moloco/sdk/internal/ilrd/t;-><init>(Lcom/moloco/sdk/l0;)V

    .line 143
    .line 144
    .line 145
    iget-object p1, v0, Lcom/moloco/sdk/internal/ilrd/provider/d;->b:LKd/a;

    .line 146
    .line 147
    new-instance v2, Lcom/moloco/sdk/internal/ilrd/provider/b;

    .line 148
    .line 149
    const/4 v3, 0x0

    .line 150
    invoke-direct {v2, v0, v1, v3}, Lcom/moloco/sdk/internal/ilrd/provider/b;-><init>(Lcom/moloco/sdk/internal/ilrd/provider/d;Lcom/moloco/sdk/internal/ilrd/t;Ljf/c;)V

    .line 151
    .line 152
    .line 153
    const/4 v0, 0x3

    .line 154
    invoke-static {p1, v3, v2, v0}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 155
    .line 156
    .line 157
    :cond_8
    :goto_0
    return-void
.end method
