.class public final Lcom/moloco/sdk/internal/publisher/L;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic a:I

.field public synthetic b:Z

.field public synthetic c:Z


# direct methods
.method public synthetic constructor <init>(ILjf/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/moloco/sdk/internal/publisher/L;->a:I

    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcom/moloco/sdk/internal/publisher/L;->a:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    check-cast p2, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    check-cast p3, Ljf/c;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcom/moloco/sdk/internal/publisher/L;

    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    const/4 v2, 0x5

    .line 24
    invoke-direct {v0, v1, p3, v2}, Lcom/moloco/sdk/internal/publisher/L;-><init>(ILjf/c;I)V

    .line 25
    .line 26
    .line 27
    iput-boolean p1, v0, Lcom/moloco/sdk/internal/publisher/L;->b:Z

    .line 28
    .line 29
    iput-boolean p2, v0, Lcom/moloco/sdk/internal/publisher/L;->c:Z

    .line 30
    .line 31
    sget-object p1, Lef/C;->a:Lef/C;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/internal/publisher/L;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :pswitch_0
    new-instance v0, Lcom/moloco/sdk/internal/publisher/L;

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    const/4 v2, 0x4

    .line 42
    invoke-direct {v0, v1, p3, v2}, Lcom/moloco/sdk/internal/publisher/L;-><init>(ILjf/c;I)V

    .line 43
    .line 44
    .line 45
    iput-boolean p1, v0, Lcom/moloco/sdk/internal/publisher/L;->b:Z

    .line 46
    .line 47
    iput-boolean p2, v0, Lcom/moloco/sdk/internal/publisher/L;->c:Z

    .line 48
    .line 49
    sget-object p1, Lef/C;->a:Lef/C;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/internal/publisher/L;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    :pswitch_1
    new-instance v0, Lcom/moloco/sdk/internal/publisher/L;

    .line 57
    .line 58
    const/4 v1, 0x3

    .line 59
    const/4 v2, 0x3

    .line 60
    invoke-direct {v0, v1, p3, v2}, Lcom/moloco/sdk/internal/publisher/L;-><init>(ILjf/c;I)V

    .line 61
    .line 62
    .line 63
    iput-boolean p1, v0, Lcom/moloco/sdk/internal/publisher/L;->b:Z

    .line 64
    .line 65
    iput-boolean p2, v0, Lcom/moloco/sdk/internal/publisher/L;->c:Z

    .line 66
    .line 67
    sget-object p1, Lef/C;->a:Lef/C;

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/internal/publisher/L;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :pswitch_2
    new-instance v0, Lcom/moloco/sdk/internal/publisher/L;

    .line 75
    .line 76
    const/4 v1, 0x3

    .line 77
    const/4 v2, 0x2

    .line 78
    invoke-direct {v0, v1, p3, v2}, Lcom/moloco/sdk/internal/publisher/L;-><init>(ILjf/c;I)V

    .line 79
    .line 80
    .line 81
    iput-boolean p1, v0, Lcom/moloco/sdk/internal/publisher/L;->b:Z

    .line 82
    .line 83
    iput-boolean p2, v0, Lcom/moloco/sdk/internal/publisher/L;->c:Z

    .line 84
    .line 85
    sget-object p1, Lef/C;->a:Lef/C;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/internal/publisher/L;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :pswitch_3
    new-instance v0, Lcom/moloco/sdk/internal/publisher/L;

    .line 93
    .line 94
    const/4 v1, 0x3

    .line 95
    const/4 v2, 0x1

    .line 96
    invoke-direct {v0, v1, p3, v2}, Lcom/moloco/sdk/internal/publisher/L;-><init>(ILjf/c;I)V

    .line 97
    .line 98
    .line 99
    iput-boolean p1, v0, Lcom/moloco/sdk/internal/publisher/L;->b:Z

    .line 100
    .line 101
    iput-boolean p2, v0, Lcom/moloco/sdk/internal/publisher/L;->c:Z

    .line 102
    .line 103
    sget-object p1, Lef/C;->a:Lef/C;

    .line 104
    .line 105
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/internal/publisher/L;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    return-object p1

    .line 110
    :pswitch_4
    new-instance v0, Lcom/moloco/sdk/internal/publisher/L;

    .line 111
    .line 112
    const/4 v1, 0x3

    .line 113
    const/4 v2, 0x0

    .line 114
    invoke-direct {v0, v1, p3, v2}, Lcom/moloco/sdk/internal/publisher/L;-><init>(ILjf/c;I)V

    .line 115
    .line 116
    .line 117
    iput-boolean p1, v0, Lcom/moloco/sdk/internal/publisher/L;->b:Z

    .line 118
    .line 119
    iput-boolean p2, v0, Lcom/moloco/sdk/internal/publisher/L;->c:Z

    .line 120
    .line 121
    sget-object p1, Lef/C;->a:Lef/C;

    .line 122
    .line 123
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/internal/publisher/L;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    return-object p1

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget v2, p0, Lcom/moloco/sdk/internal/publisher/L;->a:I

    .line 4
    .line 5
    packed-switch v2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 9
    .line 10
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-boolean p1, p0, Lcom/moloco/sdk/internal/publisher/L;->b:Z

    .line 14
    .line 15
    iget-boolean v2, p0, Lcom/moloco/sdk/internal/publisher/L;->c:Z

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    move v0, v1

    .line 22
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :pswitch_0
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-boolean p1, p0, Lcom/moloco/sdk/internal/publisher/L;->b:Z

    .line 33
    .line 34
    iget-boolean v2, p0, Lcom/moloco/sdk/internal/publisher/L;->c:Z

    .line 35
    .line 36
    sget-object v3, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 37
    .line 38
    new-instance v4, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v5, "isAdDisplaying final: "

    .line 41
    .line 42
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    move v5, v1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v5, v0

    .line 52
    :goto_0
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v5, ", _isAdDisplaying: "

    .line 56
    .line 57
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v5, ", webViewIsDisplaying: "

    .line 64
    .line 65
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    const/16 v8, 0xc

    .line 76
    .line 77
    const/4 v9, 0x0

    .line 78
    const-string v4, "TemplateFullscreenAd"

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    const/4 v7, 0x0

    .line 82
    invoke-static/range {v3 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    if-eqz p1, :cond_2

    .line 86
    .line 87
    if-eqz v2, :cond_2

    .line 88
    .line 89
    move v0, v1

    .line 90
    :cond_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :pswitch_1
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 96
    .line 97
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-boolean p1, p0, Lcom/moloco/sdk/internal/publisher/L;->b:Z

    .line 101
    .line 102
    iget-boolean v2, p0, Lcom/moloco/sdk/internal/publisher/L;->c:Z

    .line 103
    .line 104
    if-eqz p1, :cond_3

    .line 105
    .line 106
    if-eqz v2, :cond_3

    .line 107
    .line 108
    move v0, v1

    .line 109
    :cond_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    return-object p1

    .line 114
    :pswitch_2
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 115
    .line 116
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget-boolean p1, p0, Lcom/moloco/sdk/internal/publisher/L;->b:Z

    .line 120
    .line 121
    iget-boolean v2, p0, Lcom/moloco/sdk/internal/publisher/L;->c:Z

    .line 122
    .line 123
    if-eqz p1, :cond_4

    .line 124
    .line 125
    if-eqz v2, :cond_4

    .line 126
    .line 127
    move v0, v1

    .line 128
    :cond_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    return-object p1

    .line 133
    :pswitch_3
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 134
    .line 135
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    iget-boolean p1, p0, Lcom/moloco/sdk/internal/publisher/L;->b:Z

    .line 139
    .line 140
    iget-boolean v2, p0, Lcom/moloco/sdk/internal/publisher/L;->c:Z

    .line 141
    .line 142
    if-eqz p1, :cond_5

    .line 143
    .line 144
    if-eqz v2, :cond_5

    .line 145
    .line 146
    move v0, v1

    .line 147
    :cond_5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    return-object p1

    .line 152
    :pswitch_4
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 153
    .line 154
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget-boolean p1, p0, Lcom/moloco/sdk/internal/publisher/L;->b:Z

    .line 158
    .line 159
    iget-boolean v2, p0, Lcom/moloco/sdk/internal/publisher/L;->c:Z

    .line 160
    .line 161
    if-eqz p1, :cond_6

    .line 162
    .line 163
    if-eqz v2, :cond_6

    .line 164
    .line 165
    move v0, v1

    .line 166
    :cond_6
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    return-object p1

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
