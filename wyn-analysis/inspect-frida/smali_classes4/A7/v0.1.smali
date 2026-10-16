.class public final LA7/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:J

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JI)V
    .locals 0

    .line 1
    iput p7, p0, LA7/v0;->a:I

    iput-object p2, p0, LA7/v0;->b:Ljava/lang/Object;

    iput-object p3, p0, LA7/v0;->c:Ljava/lang/Object;

    iput-object p4, p0, LA7/v0;->e:Ljava/lang/Object;

    iput-wide p5, p0, LA7/v0;->d:J

    iput-object p1, p0, LA7/v0;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, LA7/v0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/v0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/os/Bundle;

    .line 9
    .line 10
    const-string v1, "screen_name"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "screen_class"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, LA7/v0;->f:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v2, v1

    .line 23
    check-cast v2, LA7/i1;

    .line 24
    .line 25
    invoke-virtual {v2}, LA7/B0;->b0()LA7/U1;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v3, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const-string v5, "screen_view"

    .line 32
    .line 33
    invoke-virtual {v1, v5, v0, v3, v4}, LA7/U1;->o0(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    iget-object v0, p0, LA7/v0;->c:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v3, v0

    .line 40
    check-cast v3, LA7/j1;

    .line 41
    .line 42
    iget-object v0, p0, LA7/v0;->e:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v4, v0

    .line 45
    check-cast v4, LA7/j1;

    .line 46
    .line 47
    iget-wide v5, p0, LA7/v0;->d:J

    .line 48
    .line 49
    const/4 v7, 0x1

    .line 50
    invoke-virtual/range {v2 .. v8}, LA7/i1;->m0(LA7/j1;LA7/j1;JZLandroid/os/Bundle;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_0
    iget-object v12, p0, LA7/v0;->e:Ljava/lang/Object;

    .line 55
    .line 56
    iget-wide v10, p0, LA7/v0;->d:J

    .line 57
    .line 58
    iget-object v0, p0, LA7/v0;->f:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v9, v0

    .line 61
    check-cast v9, LA7/P0;

    .line 62
    .line 63
    iget-object v0, p0, LA7/v0;->b:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v13, v0

    .line 66
    check-cast v13, Ljava/lang/String;

    .line 67
    .line 68
    iget-object v0, p0, LA7/v0;->c:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v14, v0

    .line 71
    check-cast v14, Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual/range {v9 .. v14}, LA7/P0;->k0(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_1
    iget-object v0, p0, LA7/v0;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Ljava/lang/String;

    .line 80
    .line 81
    iget-object v1, p0, LA7/v0;->f:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, LA7/s0;

    .line 84
    .line 85
    iget-object v2, p0, LA7/v0;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, Ljava/lang/String;

    .line 88
    .line 89
    if-nez v2, :cond_1

    .line 90
    .line 91
    iget-object v1, v1, LA7/s0;->a:LA7/L1;

    .line 92
    .line 93
    invoke-virtual {v1}, LA7/L1;->zzl()LA7/k0;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v2}, LA7/k0;->c0()V

    .line 98
    .line 99
    .line 100
    iget-object v2, v1, LA7/L1;->F:Ljava/lang/String;

    .line 101
    .line 102
    if-eqz v2, :cond_0

    .line 103
    .line 104
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-nez v2, :cond_0

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_0
    iput-object v0, v1, LA7/L1;->F:Ljava/lang/String;

    .line 112
    .line 113
    const/4 v0, 0x0

    .line 114
    iput-object v0, v1, LA7/L1;->E:LA7/j1;

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_1
    new-instance v3, LA7/j1;

    .line 118
    .line 119
    iget-object v4, p0, LA7/v0;->e:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v4, Ljava/lang/String;

    .line 122
    .line 123
    iget-wide v5, p0, LA7/v0;->d:J

    .line 124
    .line 125
    invoke-direct {v3, v4, v2, v5, v6}, LA7/j1;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 126
    .line 127
    .line 128
    iget-object v1, v1, LA7/s0;->a:LA7/L1;

    .line 129
    .line 130
    invoke-virtual {v1}, LA7/L1;->zzl()LA7/k0;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v2}, LA7/k0;->c0()V

    .line 135
    .line 136
    .line 137
    iget-object v2, v1, LA7/L1;->F:Ljava/lang/String;

    .line 138
    .line 139
    if-eqz v2, :cond_2

    .line 140
    .line 141
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    :cond_2
    iput-object v0, v1, LA7/L1;->F:Ljava/lang/String;

    .line 145
    .line 146
    iput-object v3, v1, LA7/L1;->E:LA7/j1;

    .line 147
    .line 148
    :goto_0
    return-void

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
