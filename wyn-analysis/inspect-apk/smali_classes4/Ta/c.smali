.class public final LTa/c;
.super LTa/a;
.source "SourceFile"


# instance fields
.field public final c:Ljava/util/HashSet;

.field public final d:Lorg/json/JSONObject;

.field public final e:J

.field public final synthetic f:I


# direct methods
.method public constructor <init>(LS3/c;Ljava/util/HashSet;Lorg/json/JSONObject;JI)V
    .locals 0

    .line 1
    iput p6, p0, LTa/c;->f:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, LTa/a;-><init>(LS3/c;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LTa/c;->c:Ljava/util/HashSet;

    .line 12
    .line 13
    iput-object p3, p0, LTa/c;->d:Lorg/json/JSONObject;

    .line 14
    .line 15
    iput-wide p4, p0, LTa/c;->e:J

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 12

    .line 1
    const-string v0, "setNativeViewHierarchy"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, LOa/g;->a:LOa/g;

    .line 6
    .line 7
    iget-wide v4, p0, LTa/c;->e:J

    .line 8
    .line 9
    iget-object v6, p0, LTa/c;->c:Ljava/util/HashSet;

    .line 10
    .line 11
    const/4 v7, 0x2

    .line 12
    iget v8, p0, LTa/c;->f:I

    .line 13
    .line 14
    packed-switch v8, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v8

    .line 21
    if-nez v8, :cond_1

    .line 22
    .line 23
    sget-object v8, LOa/c;->c:LOa/c;

    .line 24
    .line 25
    if-eqz v8, :cond_1

    .line 26
    .line 27
    iget-object v8, v8, LOa/c;->a:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-static {v8}, Lj$/util/DesugarCollections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    if-eqz v9, :cond_1

    .line 42
    .line 43
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    check-cast v9, LMa/j;

    .line 48
    .line 49
    iget-object v10, v9, LMa/j;->h:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v6, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    if-eqz v10, :cond_0

    .line 56
    .line 57
    iget-object v9, v9, LMa/j;->e:LQa/a;

    .line 58
    .line 59
    iget-wide v10, v9, LQa/a;->e:J

    .line 60
    .line 61
    cmp-long v10, v4, v10

    .line 62
    .line 63
    if-ltz v10, :cond_0

    .line 64
    .line 65
    iput v7, v9, LQa/a;->d:I

    .line 66
    .line 67
    invoke-virtual {v9}, LQa/a;->e()Landroid/webkit/WebView;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    iget-object v9, v9, LQa/a;->a:Ljava/lang/String;

    .line 72
    .line 73
    new-array v11, v7, [Ljava/lang/Object;

    .line 74
    .line 75
    aput-object p1, v11, v2

    .line 76
    .line 77
    aput-object v9, v11, v1

    .line 78
    .line 79
    invoke-virtual {v3, v10, v0, v11}, LOa/g;->a(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    invoke-super {p0, p1}, LTa/a;->a(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_0
    sget-object v8, LOa/c;->c:LOa/c;

    .line 88
    .line 89
    if-eqz v8, :cond_3

    .line 90
    .line 91
    iget-object v8, v8, LOa/c;->a:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-static {v8}, Lj$/util/DesugarCollections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    :cond_2
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    if-eqz v9, :cond_3

    .line 106
    .line 107
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    check-cast v9, LMa/j;

    .line 112
    .line 113
    iget-object v10, v9, LMa/j;->h:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v6, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    if-eqz v10, :cond_2

    .line 120
    .line 121
    iget-object v9, v9, LMa/j;->e:LQa/a;

    .line 122
    .line 123
    iget-wide v10, v9, LQa/a;->e:J

    .line 124
    .line 125
    cmp-long v10, v4, v10

    .line 126
    .line 127
    if-ltz v10, :cond_2

    .line 128
    .line 129
    iget v10, v9, LQa/a;->d:I

    .line 130
    .line 131
    const/4 v11, 0x3

    .line 132
    if-eq v10, v11, :cond_2

    .line 133
    .line 134
    iput v11, v9, LQa/a;->d:I

    .line 135
    .line 136
    invoke-virtual {v9}, LQa/a;->e()Landroid/webkit/WebView;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    iget-object v9, v9, LQa/a;->a:Ljava/lang/String;

    .line 141
    .line 142
    new-array v11, v7, [Ljava/lang/Object;

    .line 143
    .line 144
    aput-object p1, v11, v2

    .line 145
    .line 146
    aput-object v9, v11, v1

    .line 147
    .line 148
    invoke-virtual {v3, v10, v0, v11}, LOa/g;->a(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_3
    invoke-super {p0, p1}, LTa/a;->a(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget p1, p0, LTa/c;->f:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LTa/a;->b:LS3/c;

    .line 7
    .line 8
    iget-object v0, p1, LS3/c;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lorg/json/JSONObject;

    .line 11
    .line 12
    iget-object v1, p0, LTa/c;->d:Lorg/json/JSONObject;

    .line 13
    .line 14
    invoke-static {v1, v0}, LRa/b;->e(Lorg/json/JSONObject;Lorg/json/JSONObject;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iput-object v1, p1, LS3/c;->b:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    return-object p1

    .line 29
    :pswitch_0
    iget-object p1, p0, LTa/c;->d:Lorg/json/JSONObject;

    .line 30
    .line 31
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, LTa/c;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, LTa/c;->a(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, LTa/c;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
