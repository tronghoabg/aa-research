.class public final synthetic Lr9/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw9/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr9/D;->a:I

    iput-object p1, p0, Lr9/D;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    iget-object v4, p0, Lr9/D;->b:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    iget v6, p0, Lr9/D;->a:I

    .line 9
    .line 10
    packed-switch v6, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Landroid/database/Cursor;

    .line 14
    .line 15
    check-cast v4, Lr9/O;

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    iput v5, v4, Lr9/O;->c:I

    .line 25
    .line 26
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    int-to-long v5, v3

    .line 31
    iput-wide v5, v4, Lr9/O;->d:J

    .line 32
    .line 33
    new-instance v3, Ls9/o;

    .line 34
    .line 35
    new-instance v5, Ls8/q;

    .line 36
    .line 37
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 38
    .line 39
    .line 40
    move-result-wide v6

    .line 41
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-direct {v5, v6, v7, v1}, Ls8/q;-><init>(JI)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v3, v5}, Ls9/o;-><init>(Ls8/q;)V

    .line 49
    .line 50
    .line 51
    iput-object v3, v4, Lr9/O;->e:Ls9/o;

    .line 52
    .line 53
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    iput-wide v0, v4, Lr9/O;->f:J

    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_0
    check-cast v4, [Ljava/lang/Boolean;

    .line 61
    .line 62
    check-cast p1, Landroid/database/Cursor;

    .line 63
    .line 64
    :try_start_0
    const-string v0, "BUILD_OVERLAYS"

    .line 65
    .line 66
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_0

    .line 75
    .line 76
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 77
    .line 78
    aput-object p1, v4, v5
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catch_0
    move-exception p1

    .line 82
    goto :goto_1

    .line 83
    :cond_0
    :goto_0
    return-void

    .line 84
    :goto_1
    const-string v0, "SQLitePersistence.DataMigration failed to parse: %s"

    .line 85
    .line 86
    new-array v1, v3, [Ljava/lang/Object;

    .line 87
    .line 88
    aput-object p1, v1, v5

    .line 89
    .line 90
    invoke-static {v0, v1}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    const/4 p1, 0x0

    .line 94
    throw p1

    .line 95
    :pswitch_1
    check-cast p1, Landroid/database/Cursor;

    .line 96
    .line 97
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 102
    .line 103
    .line 104
    move-result-wide v6

    .line 105
    new-instance v3, Ls9/o;

    .line 106
    .line 107
    new-instance v8, Ls8/q;

    .line 108
    .line 109
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 110
    .line 111
    .line 112
    move-result-wide v9

    .line 113
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-direct {v8, v9, v10, v1}, Ls8/q;-><init>(JI)V

    .line 118
    .line 119
    .line 120
    invoke-direct {v3, v8}, Ls9/o;-><init>(Ls8/q;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v0}, Lka/e0;->l(Ljava/lang/String;)Ls9/m;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    new-instance v1, Ls9/h;

    .line 132
    .line 133
    invoke-direct {v1, v0}, Ls9/h;-><init>(Ls9/m;)V

    .line 134
    .line 135
    .line 136
    const/4 v0, 0x5

    .line 137
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    new-instance v2, Ls9/b;

    .line 146
    .line 147
    invoke-direct {v2, v3, v1, p1}, Ls9/b;-><init>(Ls9/o;Ls9/h;I)V

    .line 148
    .line 149
    .line 150
    new-instance p1, Ls9/c;

    .line 151
    .line 152
    invoke-direct {p1, v6, v7, v2}, Ls9/c;-><init>(JLs9/b;)V

    .line 153
    .line 154
    .line 155
    check-cast v4, Ljava/util/HashMap;

    .line 156
    .line 157
    invoke-virtual {v4, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
