.class public final LVa/Rb;
.super LVa/Ba;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public synthetic d:Landroid/app/Activity;

.field public synthetic e:Landroid/os/Bundle;

.field public synthetic f:LVa/Tb;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/Rb;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 5

    .line 1
    iget v0, p0, LVa/Rb;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LVa/Rb;->f:LVa/Tb;

    .line 7
    .line 8
    iget-object v1, p0, LVa/Rb;->d:Landroid/app/Activity;

    .line 9
    .line 10
    invoke-static {v0, v1}, LVa/Tb;->S(LVa/Tb;Landroid/app/Activity;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-static {v0}, LVa/Tb;->O(LVa/Tb;)LVa/db;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, LVa/Rb;->e:Landroid/os/Bundle;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x61

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    sget v3, LVa/Tb;->t:I

    .line 30
    .line 31
    add-int/2addr v3, v1

    .line 32
    rem-int/lit16 v3, v3, 0x80

    .line 33
    .line 34
    sput v3, LVa/Tb;->s:I

    .line 35
    .line 36
    sget-object v3, LVa/Tb;->r:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0}, LVa/Tb;->N(LVa/Tb;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 43
    .line 44
    .line 45
    :cond_0
    sget v2, LVa/Tb;->s:I

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x1f

    .line 48
    .line 49
    rem-int/lit16 v3, v2, 0x80

    .line 50
    .line 51
    sput v3, LVa/Tb;->t:I

    .line 52
    .line 53
    rem-int/lit8 v2, v2, 0x2

    .line 54
    .line 55
    const/4 v3, 0x1

    .line 56
    iput-boolean v3, v0, LVa/Tb;->o:Z

    .line 57
    .line 58
    if-nez v2, :cond_1

    .line 59
    .line 60
    div-int/lit8 v1, v1, 0x0

    .line 61
    .line 62
    :cond_1
    return-void

    .line 63
    :pswitch_0
    iget-object v0, p0, LVa/Rb;->f:LVa/Tb;

    .line 64
    .line 65
    iget-object v1, p0, LVa/Rb;->d:Landroid/app/Activity;

    .line 66
    .line 67
    invoke-static {v0, v1}, LVa/Tb;->S(LVa/Tb;Landroid/app/Activity;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    invoke-static {v0}, LVa/Tb;->O(LVa/Tb;)LVa/db;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v2, p0, LVa/Rb;->e:Landroid/os/Bundle;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    sget v1, LVa/Tb;->t:I

    .line 83
    .line 84
    add-int/lit8 v1, v1, 0x2d

    .line 85
    .line 86
    rem-int/lit16 v1, v1, 0x80

    .line 87
    .line 88
    sput v1, LVa/Tb;->s:I

    .line 89
    .line 90
    const/4 v1, 0x0

    .line 91
    invoke-static {v0, v1}, LVa/Tb;->H(LVa/Tb;Z)V

    .line 92
    .line 93
    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    sget v1, LVa/Tb;->t:I

    .line 97
    .line 98
    add-int/lit8 v1, v1, 0x61

    .line 99
    .line 100
    rem-int/lit16 v1, v1, 0x80

    .line 101
    .line 102
    sput v1, LVa/Tb;->s:I

    .line 103
    .line 104
    sget-object v1, LVa/Tb;->r:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    invoke-static {v0, v1}, LVa/Tb;->K(LVa/Tb;Z)V

    .line 111
    .line 112
    .line 113
    invoke-static {v0}, LVa/Tb;->N(LVa/Tb;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    const/4 v2, 0x1

    .line 118
    if-eqz v1, :cond_2

    .line 119
    .line 120
    invoke-static {v0, v2}, LVa/Tb;->H(LVa/Tb;Z)V

    .line 121
    .line 122
    .line 123
    :cond_2
    invoke-static {v0, v2}, LVa/Tb;->P(LVa/Tb;Z)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    invoke-static {v0, v1}, LVa/Tb;->K(LVa/Tb;Z)V

    .line 128
    .line 129
    .line 130
    :cond_4
    :goto_0
    return-void

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
