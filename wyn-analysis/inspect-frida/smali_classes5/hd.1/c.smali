.class public final Lhd/c;
.super LJ8/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lhd/c;->b:I

    invoke-direct {p0, p1}, LJ8/a;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final b()LN1/w;
    .locals 15

    .line 1
    iget v0, p0, Lhd/c;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LJ5/n;

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    invoke-direct {v0, v1}, LJ5/n;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lza/a;

    .line 13
    .line 14
    invoke-direct {v1}, Lza/a;-><init>()V

    .line 15
    .line 16
    .line 17
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 18
    .line 19
    sget-object v7, Ll8/e0;->e:Ll8/e0;

    .line 20
    .line 21
    new-instance v1, LE5/Y;

    .line 22
    .line 23
    invoke-direct {v1}, LE5/Y;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v14, LN1/u;->a:LN1/u;

    .line 27
    .line 28
    iget-object v2, p0, LJ8/a;->a:Ljava/lang/String;

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    :goto_0
    move-object v3, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    goto :goto_0

    .line 40
    :goto_1
    const/4 v5, 0x0

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    new-instance v2, LN1/t;

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v8, 0x0

    .line 47
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-direct/range {v2 .. v10}, LN1/t;-><init>(Landroid/net/Uri;Ljava/lang/String;Lic/d;Ljava/util/List;Ll8/K;Ljava/lang/String;J)V

    .line 53
    .line 54
    .line 55
    move-object v11, v2

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    move-object v11, v5

    .line 58
    :goto_2
    new-instance v8, LN1/w;

    .line 59
    .line 60
    new-instance v10, LN1/r;

    .line 61
    .line 62
    invoke-direct {v10, v0}, LN1/q;-><init>(LJ5/n;)V

    .line 63
    .line 64
    .line 65
    new-instance v12, LN1/s;

    .line 66
    .line 67
    invoke-direct {v12, v1}, LN1/s;-><init>(LE5/Y;)V

    .line 68
    .line 69
    .line 70
    sget-object v13, LN1/z;->B:LN1/z;

    .line 71
    .line 72
    const-string v9, ""

    .line 73
    .line 74
    invoke-direct/range {v8 .. v14}, LN1/w;-><init>(Ljava/lang/String;LN1/r;LN1/t;LN1/s;LN1/z;LN1/u;)V

    .line 75
    .line 76
    .line 77
    return-object v8

    .line 78
    :pswitch_0
    new-instance v0, LJ5/n;

    .line 79
    .line 80
    const/4 v1, 0x3

    .line 81
    invoke-direct {v0, v1}, LJ5/n;-><init>(I)V

    .line 82
    .line 83
    .line 84
    new-instance v1, Lza/a;

    .line 85
    .line 86
    invoke-direct {v1}, Lza/a;-><init>()V

    .line 87
    .line 88
    .line 89
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 90
    .line 91
    sget-object v7, Ll8/e0;->e:Ll8/e0;

    .line 92
    .line 93
    new-instance v1, LE5/Y;

    .line 94
    .line 95
    invoke-direct {v1}, LE5/Y;-><init>()V

    .line 96
    .line 97
    .line 98
    sget-object v14, LN1/u;->a:LN1/u;

    .line 99
    .line 100
    iget-object v2, p0, LJ8/a;->a:Ljava/lang/String;

    .line 101
    .line 102
    if-nez v2, :cond_2

    .line 103
    .line 104
    const/4 v2, 0x0

    .line 105
    :goto_3
    move-object v3, v2

    .line 106
    goto :goto_4

    .line 107
    :cond_2
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    goto :goto_3

    .line 112
    :goto_4
    const/4 v5, 0x0

    .line 113
    if-eqz v3, :cond_3

    .line 114
    .line 115
    new-instance v2, LN1/t;

    .line 116
    .line 117
    const/4 v4, 0x0

    .line 118
    const/4 v8, 0x0

    .line 119
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    invoke-direct/range {v2 .. v10}, LN1/t;-><init>(Landroid/net/Uri;Ljava/lang/String;Lic/d;Ljava/util/List;Ll8/K;Ljava/lang/String;J)V

    .line 125
    .line 126
    .line 127
    move-object v11, v2

    .line 128
    goto :goto_5

    .line 129
    :cond_3
    move-object v11, v5

    .line 130
    :goto_5
    new-instance v8, LN1/w;

    .line 131
    .line 132
    new-instance v10, LN1/r;

    .line 133
    .line 134
    invoke-direct {v10, v0}, LN1/q;-><init>(LJ5/n;)V

    .line 135
    .line 136
    .line 137
    new-instance v12, LN1/s;

    .line 138
    .line 139
    invoke-direct {v12, v1}, LN1/s;-><init>(LE5/Y;)V

    .line 140
    .line 141
    .line 142
    sget-object v13, LN1/z;->B:LN1/z;

    .line 143
    .line 144
    const-string v9, ""

    .line 145
    .line 146
    invoke-direct/range {v8 .. v14}, LN1/w;-><init>(Ljava/lang/String;LN1/r;LN1/t;LN1/s;LN1/z;LN1/u;)V

    .line 147
    .line 148
    .line 149
    return-object v8

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Landroid/content/Context;)Lk2/G;
    .locals 1

    .line 1
    iget v0, p0, Lhd/c;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$Factory;

    .line 7
    .line 8
    invoke-direct {p1}, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$Factory;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_0
    new-instance v0, Lk2/v;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lk2/v;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
