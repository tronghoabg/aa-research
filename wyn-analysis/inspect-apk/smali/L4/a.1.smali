.class public final LL4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB4/i;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LL4/a;->a:I

    iput-object p2, p0, LL4/a;->b:Ljava/lang/Object;

    iput-object p3, p0, LL4/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;LB4/i;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LL4/a;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LL4/a;->c:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, LL4/a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILB4/g;)LE4/B;
    .locals 9

    .line 1
    iget v0, p0, LL4/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/io/InputStream;

    .line 7
    .line 8
    instance-of v0, p1, LL4/t;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p1, LL4/t;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    move v1, v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, LL4/t;

    .line 18
    .line 19
    iget-object v1, p0, LL4/a;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, LF4/f;

    .line 22
    .line 23
    invoke-direct {v0, p1, v1}, LL4/t;-><init>(Ljava/io/InputStream;LF4/f;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    move v1, p1

    .line 28
    move-object p1, v0

    .line 29
    :goto_0
    sget-object v2, LY4/f;->c:Ljava/util/ArrayDeque;

    .line 30
    .line 31
    monitor-enter v2

    .line 32
    :try_start_0
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, LY4/f;

    .line 37
    .line 38
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    new-instance v0, LY4/f;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/io/InputStream;-><init>()V

    .line 44
    .line 45
    .line 46
    :cond_1
    move-object v2, v0

    .line 47
    iput-object p1, v2, LY4/f;->a:LL4/t;

    .line 48
    .line 49
    new-instance v0, LY4/j;

    .line 50
    .line 51
    invoke-direct {v0, v2}, LY4/j;-><init>(LY4/f;)V

    .line 52
    .line 53
    .line 54
    new-instance v8, LS3/e;

    .line 55
    .line 56
    const/16 v3, 0xa

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-direct {v8, p1, v4, v2, v3}, LS3/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 60
    .line 61
    .line 62
    :try_start_1
    iget-object v3, p0, LL4/a;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v3, LL4/m;

    .line 65
    .line 66
    new-instance v4, LG9/e;

    .line 67
    .line 68
    iget-object v5, v3, LL4/m;->d:Ljava/util/ArrayList;

    .line 69
    .line 70
    iget-object v6, v3, LL4/m;->c:LF4/f;

    .line 71
    .line 72
    invoke-direct {v4, v6, v0, v5}, LG9/e;-><init>(LF4/f;Ljava/io/InputStream;Ljava/util/ArrayList;)V

    .line 73
    .line 74
    .line 75
    move v5, p2

    .line 76
    move v6, p3

    .line 77
    move-object v7, p4

    .line 78
    invoke-virtual/range {v3 .. v8}, LL4/m;->a(LL4/s;IILB4/g;LL4/l;)LL4/c;

    .line 79
    .line 80
    .line 81
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    invoke-virtual {v2}, LY4/f;->a()V

    .line 83
    .line 84
    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    invoke-virtual {p1}, LL4/t;->b()V

    .line 88
    .line 89
    .line 90
    :cond_2
    return-object p2

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    move-object p2, v0

    .line 93
    invoke-virtual {v2}, LY4/f;->a()V

    .line 94
    .line 95
    .line 96
    if-eqz v1, :cond_3

    .line 97
    .line 98
    invoke-virtual {p1}, LL4/t;->b()V

    .line 99
    .line 100
    .line 101
    :cond_3
    throw p2

    .line 102
    :catchall_1
    move-exception v0

    .line 103
    move-object p1, v0

    .line 104
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 105
    throw p1

    .line 106
    :pswitch_0
    move v5, p2

    .line 107
    move v6, p3

    .line 108
    check-cast p1, Landroid/net/Uri;

    .line 109
    .line 110
    iget-object p2, p0, LL4/a;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p2, LN4/b;

    .line 113
    .line 114
    invoke-virtual {p2, p1}, LN4/b;->c(Landroid/net/Uri;)LE4/B;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-nez p1, :cond_4

    .line 119
    .line 120
    const/4 p1, 0x0

    .line 121
    goto :goto_1

    .line 122
    :cond_4
    check-cast p1, LN4/a;

    .line 123
    .line 124
    invoke-virtual {p1}, LN4/a;->get()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 129
    .line 130
    iget-object p2, p0, LL4/a;->c:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p2, LF4/a;

    .line 133
    .line 134
    invoke-static {p2, p1, v5, v6}, LL4/o;->a(LF4/a;Landroid/graphics/drawable/Drawable;II)LL4/c;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    :goto_1
    return-object p1

    .line 139
    :pswitch_1
    move v5, p2

    .line 140
    move v6, p3

    .line 141
    move-object v7, p4

    .line 142
    iget-object p2, p0, LL4/a;->b:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p2, LB4/i;

    .line 145
    .line 146
    invoke-interface {p2, p1, v5, v6, v7}, LB4/i;->a(Ljava/lang/Object;IILB4/g;)LE4/B;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-nez p1, :cond_5

    .line 151
    .line 152
    const/4 p1, 0x0

    .line 153
    goto :goto_2

    .line 154
    :cond_5
    new-instance p2, LL4/c;

    .line 155
    .line 156
    iget-object p3, p0, LL4/a;->c:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p3, Landroid/content/res/Resources;

    .line 159
    .line 160
    invoke-direct {p2, p3, p1}, LL4/c;-><init>(Landroid/content/res/Resources;LE4/B;)V

    .line 161
    .line 162
    .line 163
    move-object p1, p2

    .line 164
    :goto_2
    return-object p1

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;LB4/g;)Z
    .locals 1

    .line 1
    iget v0, p0, LL4/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/io/InputStream;

    .line 7
    .line 8
    iget-object p1, p0, LL4/a;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, LL4/m;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :pswitch_0
    check-cast p1, Landroid/net/Uri;

    .line 18
    .line 19
    const-string p2, "android.resource"

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1

    .line 30
    :pswitch_1
    iget-object v0, p0, LL4/a;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LB4/i;

    .line 33
    .line 34
    invoke-interface {v0, p1, p2}, LB4/i;->b(Ljava/lang/Object;LB4/g;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    return p1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
