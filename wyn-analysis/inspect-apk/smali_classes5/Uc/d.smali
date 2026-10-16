.class public final synthetic LUc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Landroid/view/ViewGroup;Landroidx/lifecycle/o;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, LUc/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUc/d;->b:Ljava/lang/Object;

    iput-object p2, p0, LUc/d;->d:Ljava/lang/Object;

    iput-object p3, p0, LUc/d;->c:Ljava/lang/Object;

    iput-object p4, p0, LUc/d;->e:Ljava/lang/Object;

    iput-object p5, p0, LUc/d;->f:Ljava/lang/Object;

    iput-object p6, p0, LUc/d;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p7, p0, LUc/d;->a:I

    iput-object p1, p0, LUc/d;->b:Ljava/lang/Object;

    iput-object p2, p0, LUc/d;->c:Ljava/lang/Object;

    iput-object p3, p0, LUc/d;->d:Ljava/lang/Object;

    iput-object p4, p0, LUc/d;->e:Ljava/lang/Object;

    iput-object p5, p0, LUc/d;->f:Ljava/lang/Object;

    iput-object p6, p0, LUc/d;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Ljava/lang/String;Lcom/applovin/impl/sdk/k;Ljava/lang/String;)V
    .locals 1

    .line 3
    const/4 v0, 0x3

    iput v0, p0, LUc/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUc/d;->d:Ljava/lang/Object;

    iput-object p2, p0, LUc/d;->b:Ljava/lang/Object;

    iput-object p3, p0, LUc/d;->c:Ljava/lang/Object;

    iput-object p4, p0, LUc/d;->e:Ljava/lang/Object;

    iput-object p5, p0, LUc/d;->f:Ljava/lang/Object;

    iput-object p6, p0, LUc/d;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    iget-object v0, p0, LUc/d;->f:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, LUc/d;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, LUc/d;->e:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, LUc/d;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, LUc/d;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, LUc/d;->g:Ljava/lang/Object;

    .line 12
    .line 13
    iget v6, p0, LUc/d;->a:I

    .line 14
    .line 15
    packed-switch v6, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object v12, v5

    .line 19
    check-cast v12, Lcom/applovin/impl/t4;

    .line 20
    .line 21
    move-object v7, v4

    .line 22
    check-cast v7, Lcom/applovin/impl/mediation/h;

    .line 23
    .line 24
    move-object v9, v3

    .line 25
    check-cast v9, Lcom/applovin/mediation/adapter/parameters/MaxAdapterSignalCollectionParameters;

    .line 26
    .line 27
    move-object v10, v2

    .line 28
    check-cast v10, Landroid/app/Activity;

    .line 29
    .line 30
    move-object v8, v1

    .line 31
    check-cast v8, Lcom/applovin/mediation/adapter/MaxSignalProvider;

    .line 32
    .line 33
    move-object v11, v0

    .line 34
    check-cast v11, Lcom/applovin/impl/e5;

    .line 35
    .line 36
    invoke-static/range {v7 .. v12}, Lcom/applovin/impl/mediation/h;->q(Lcom/applovin/impl/mediation/h;Lcom/applovin/mediation/adapter/MaxSignalProvider;Lcom/applovin/mediation/adapter/parameters/MaxAdapterSignalCollectionParameters;Landroid/app/Activity;Lcom/applovin/impl/e5;Lcom/applovin/impl/t4;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    check-cast v1, Lcom/applovin/mediation/MaxAdFormat;

    .line 41
    .line 42
    check-cast v2, Ljava/lang/String;

    .line 43
    .line 44
    check-cast v3, Ljava/lang/String;

    .line 45
    .line 46
    check-cast v4, Ljava/lang/String;

    .line 47
    .line 48
    check-cast v0, Lcom/applovin/impl/sdk/k;

    .line 49
    .line 50
    check-cast v5, Ljava/lang/String;

    .line 51
    .line 52
    move-object v13, v4

    .line 53
    move-object v4, v0

    .line 54
    move-object v0, v3

    .line 55
    move-object v3, v2

    .line 56
    move-object v2, v1

    .line 57
    move-object v1, v13

    .line 58
    invoke-static/range {v0 .. v5}, Lcom/applovin/impl/mediation/ads/a;->b(Ljava/lang/String;Ljava/lang/String;Lcom/applovin/mediation/MaxAdFormat;Ljava/lang/String;Lcom/applovin/impl/sdk/k;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_1
    move-object v10, v0

    .line 63
    check-cast v10, Landroid/view/ViewGroup;

    .line 64
    .line 65
    move-object v11, v5

    .line 66
    check-cast v11, Landroidx/lifecycle/o;

    .line 67
    .line 68
    move-object v6, v4

    .line 69
    check-cast v6, Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl;

    .line 70
    .line 71
    move-object v8, v1

    .line 72
    check-cast v8, Ljava/lang/String;

    .line 73
    .line 74
    move-object v9, v2

    .line 75
    check-cast v9, Landroid/app/Activity;

    .line 76
    .line 77
    move-object v7, v3

    .line 78
    check-cast v7, Ljava/lang/String;

    .line 79
    .line 80
    invoke-static/range {v6 .. v11}, Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl;->o(Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Landroid/view/ViewGroup;Landroidx/lifecycle/o;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_2
    check-cast v0, Lcom/applovin/impl/e5;

    .line 85
    .line 86
    check-cast v4, Lcom/applovin/impl/mediation/MediationServiceImpl;

    .line 87
    .line 88
    check-cast v1, Lcom/applovin/impl/t4;

    .line 89
    .line 90
    check-cast v3, Lcom/applovin/impl/mediation/h;

    .line 91
    .line 92
    check-cast v2, Lcom/applovin/impl/mediation/MaxAdapterParametersImpl;

    .line 93
    .line 94
    check-cast v5, Landroid/app/Activity;

    .line 95
    .line 96
    move-object v13, v4

    .line 97
    move-object v4, v0

    .line 98
    move-object v0, v13

    .line 99
    move-object v13, v3

    .line 100
    move-object v3, v2

    .line 101
    move-object v2, v13

    .line 102
    invoke-static/range {v0 .. v5}, Lcom/applovin/impl/mediation/MediationServiceImpl;->h(Lcom/applovin/impl/mediation/MediationServiceImpl;Lcom/applovin/impl/t4;Lcom/applovin/impl/mediation/h;Lcom/applovin/impl/mediation/MaxAdapterParametersImpl;Lcom/applovin/impl/e5;Landroid/app/Activity;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_3
    check-cast v4, LUc/t;

    .line 107
    .line 108
    check-cast v1, LUc/n;

    .line 109
    .line 110
    check-cast v3, Ljava/lang/String;

    .line 111
    .line 112
    check-cast v2, Ljava/lang/Boolean;

    .line 113
    .line 114
    check-cast v0, LUc/u;

    .line 115
    .line 116
    check-cast v5, LPc/o;

    .line 117
    .line 118
    sget-object v6, LUc/f;->h:Ljava/util/HashMap;

    .line 119
    .line 120
    :try_start_0
    iget v6, v4, LUc/t;->a:I

    .line 121
    .line 122
    invoke-static {v6}, Lxg/g;->H(I)I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    invoke-static {v1}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    invoke-static {v1, v3, v2, v0}, Lxg/g;->I(Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/lang/String;ZLUc/u;)Lm9/W;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    if-nez v0, :cond_0

    .line 139
    .line 140
    new-instance v0, LUc/o;

    .line 141
    .line 142
    const-string v1, "invalid_query"

    .line 143
    .line 144
    const-string v2, "An error occurred while parsing query arguments, see native logs for more information. Please report this issue."

    .line 145
    .line 146
    const/4 v3, 0x0

    .line 147
    invoke-direct {v0, v1, v2, v3}, LUc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v5, v0}, LPc/o;->b(Ljava/lang/Exception;)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :catch_0
    move-exception v0

    .line 155
    goto :goto_0

    .line 156
    :cond_0
    invoke-virtual {v0, v6}, Lm9/W;->c(I)Lcom/google/android/gms/tasks/Task;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, Lm9/Y;

    .line 165
    .line 166
    iget v1, v4, LUc/t;->b:I

    .line 167
    .line 168
    invoke-static {v1}, Lxg/g;->G(I)Lm9/n;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-static {v0, v1}, Lxg/g;->X(Lm9/Y;Lm9/n;)LUc/v;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v5, v0}, LPc/o;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :goto_0
    invoke-static {v5, v0}, Lvf/a;->K(LUc/y;Ljava/lang/Exception;)V

    .line 181
    .line 182
    .line 183
    :goto_1
    return-void

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
