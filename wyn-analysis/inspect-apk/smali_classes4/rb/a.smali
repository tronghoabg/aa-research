.class public abstract Lrb/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public final c:Landroid/content/Context;

.field public final d:Lnb/c;

.field public final e:Lcom/unity3d/scar/adapter/common/c;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lnb/c;Ljava/lang/Object;Lcom/unity3d/scar/adapter/common/c;I)V
    .locals 0

    .line 1
    iput p5, p0, Lrb/a;->a:I

    iput-object p1, p0, Lrb/a;->c:Landroid/content/Context;

    iput-object p2, p0, Lrb/a;->d:Lnb/c;

    iput-object p3, p0, Lrb/a;->f:Ljava/lang/Object;

    iput-object p4, p0, Lrb/a;->e:Lcom/unity3d/scar/adapter/common/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lnb/b;)V
    .locals 7

    .line 1
    iget v0, p0, Lrb/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrb/a;->d:Lnb/c;

    .line 7
    .line 8
    iget-object v0, v0, Lnb/c;->d:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Lrb/a;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ltc/j;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const-class v3, Lcom/google/ads/mediation/admob/AdMobAdapter;

    .line 22
    .line 23
    const-string v4, "requester_type_5"

    .line 24
    .line 25
    const-string v5, "query_info_type"

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    new-instance v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 30
    .line 31
    const/16 v2, 0xe

    .line 32
    .line 33
    invoke-direct {v0, v2}, LA7/B0;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iget-object v1, v1, Ltc/j;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, LD6/c1;

    .line 39
    .line 40
    iget-object v1, v1, LD6/c1;->a:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, LA7/B0;->V(Ljava/lang/String;)LA7/B0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 47
    .line 48
    new-instance v1, Landroid/os/Bundle;

    .line 49
    .line 50
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v3, v1}, LA7/B0;->x(Ljava/lang/Class;Landroid/os/Bundle;)LA7/B0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 61
    .line 62
    new-instance v1, Lx6/g;

    .line 63
    .line 64
    invoke-direct {v1, v0}, Lx6/g;-><init>(LA7/B0;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    new-instance v2, Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 69
    .line 70
    const/16 v6, 0xe

    .line 71
    .line 72
    invoke-direct {v2, v6}, LA7/B0;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iget-object v1, v1, Ltc/j;->a:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, LD6/c1;

    .line 78
    .line 79
    iget-object v1, v1, LD6/c1;->a:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v2, v1}, LA7/B0;->V(Ljava/lang/String;)LA7/B0;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 86
    .line 87
    new-instance v2, Landroid/os/Bundle;

    .line 88
    .line 89
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v3, v2}, LA7/B0;->x(Ljava/lang/Class;Landroid/os/Bundle;)LA7/B0;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 100
    .line 101
    iget-object v2, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v2, LD6/P0;

    .line 104
    .line 105
    iput-object v0, v2, LD6/P0;->m:Ljava/lang/String;

    .line 106
    .line 107
    new-instance v0, Lx6/g;

    .line 108
    .line 109
    invoke-direct {v0, v1}, Lx6/g;-><init>(LA7/B0;)V

    .line 110
    .line 111
    .line 112
    move-object v1, v0

    .line 113
    :goto_0
    if-eqz p1, :cond_1

    .line 114
    .line 115
    iget-object v0, p0, Lrb/a;->g:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, Lrb/b;

    .line 118
    .line 119
    iput-object p1, v0, Lrb/b;->a:Lnb/b;

    .line 120
    .line 121
    :cond_1
    invoke-virtual {p0, v1}, Lrb/a;->c(Lx6/g;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_0
    iget-object v0, p0, Lrb/a;->d:Lnb/c;

    .line 126
    .line 127
    iget-object v0, v0, Lnb/c;->d:Ljava/lang/String;

    .line 128
    .line 129
    iget-object v1, p0, Lrb/a;->f:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, Lad/L;

    .line 132
    .line 133
    invoke-virtual {v1, v0}, Lad/L;->h(Ljava/lang/String;)Lx6/g;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-eqz p1, :cond_2

    .line 138
    .line 139
    iget-object v1, p0, Lrb/a;->g:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v1, Lrb/b;

    .line 142
    .line 143
    iput-object p1, v1, Lrb/b;->a:Lnb/b;

    .line 144
    .line 145
    :cond_2
    invoke-virtual {p0, v0}, Lrb/a;->c(Lx6/g;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public abstract c(Lx6/g;)V
.end method
