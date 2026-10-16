.class public final Llc/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Llc/d;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-static {}, Lb7/k;->z()Lb7/k;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, Lb7/k;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Loc/d;

    .line 18
    .line 19
    iget-boolean v1, v0, Loc/d;->b:Z

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Loc/d;->c(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v0, p1, p2}, Loc/d;->a(Landroid/content/Context;[Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(LE5/l;)Llc/b;
    .locals 12

    .line 1
    iget-object v0, p1, LE5/l;->d:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, Landroid/content/Context;

    .line 5
    .line 6
    iget-object v0, p1, LE5/l;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lmc/a;

    .line 9
    .line 10
    iget-object v1, p1, LE5/l;->f:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v8, v1

    .line 13
    check-cast v8, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, LE5/l;->g:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v9, v1

    .line 18
    check-cast v9, Ljava/util/List;

    .line 19
    .line 20
    new-instance v4, Lio/flutter/plugin/platform/q;

    .line 21
    .line 22
    invoke-direct {v4}, Lio/flutter/plugin/platform/q;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-boolean v6, p1, LE5/l;->b:Z

    .line 26
    .line 27
    iget-boolean v7, p1, LE5/l;->c:Z

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    invoke-static {}, Lb7/k;->z()Lb7/k;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object p1, p1, Lb7/k;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Loc/d;

    .line 38
    .line 39
    iget-boolean v0, p1, Loc/d;->b:Z

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    new-instance v0, Lmc/a;

    .line 44
    .line 45
    iget-object p1, p1, Loc/d;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, LM/y;

    .line 48
    .line 49
    iget-object p1, p1, LM/y;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Ljava/lang/String;

    .line 52
    .line 53
    const-string v1, "main"

    .line 54
    .line 55
    invoke-direct {v0, p1, v1}, Lmc/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 60
    .line 61
    const-string v0, "DartEntrypoints can only be created once a FlutterEngine is created."

    .line 62
    .line 63
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_1
    :goto_0
    iget-object p1, p0, Llc/d;->a:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_3

    .line 74
    .line 75
    new-instance v1, Llc/b;

    .line 76
    .line 77
    const/4 v5, 0x0

    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-direct/range {v1 .. v7}, Llc/b;-><init>(Landroid/content/Context;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/q;[Ljava/lang/String;ZZ)V

    .line 80
    .line 81
    .line 82
    if-eqz v8, :cond_2

    .line 83
    .line 84
    iget-object v2, v1, Llc/b;->i:Lac/a;

    .line 85
    .line 86
    iget-object v2, v2, Lac/a;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, Luc/r;

    .line 89
    .line 90
    const-string v3, "setInitialRoute"

    .line 91
    .line 92
    const/4 v4, 0x0

    .line 93
    invoke-virtual {v2, v3, v8, v4}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    iget-object v2, v1, Llc/b;->c:Lmc/b;

    .line 97
    .line 98
    invoke-virtual {v2, v0, v9}, Lmc/b;->d(Lmc/a;Ljava/util/List;)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    move-object v1, v4

    .line 103
    move v10, v6

    .line 104
    move v11, v7

    .line 105
    const/4 v3, 0x0

    .line 106
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Llc/b;

    .line 111
    .line 112
    iget-object v4, v3, Llc/b;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 113
    .line 114
    invoke-virtual {v4}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eqz v4, :cond_4

    .line 119
    .line 120
    move-object v6, v8

    .line 121
    move-object v7, v9

    .line 122
    sget-wide v8, Llc/b;->w:J

    .line 123
    .line 124
    iget-object v4, v0, Lmc/a;->c:Ljava/lang/String;

    .line 125
    .line 126
    iget-object v5, v0, Lmc/a;->b:Ljava/lang/String;

    .line 127
    .line 128
    iget-object v3, v3, Llc/b;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 129
    .line 130
    invoke-virtual/range {v3 .. v9}, Lio/flutter/embedding/engine/FlutterJNI;->spawn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)Lio/flutter/embedding/engine/FlutterJNI;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    move-object v4, v1

    .line 135
    new-instance v1, Llc/b;

    .line 136
    .line 137
    const/4 v5, 0x0

    .line 138
    move v6, v10

    .line 139
    move v7, v11

    .line 140
    invoke-direct/range {v1 .. v7}, Llc/b;-><init>(Landroid/content/Context;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/q;[Ljava/lang/String;ZZ)V

    .line 141
    .line 142
    .line 143
    :goto_1
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    new-instance p1, Llc/c;

    .line 147
    .line 148
    invoke-direct {p1, p0, v1}, Llc/c;-><init>(Llc/d;Llc/b;)V

    .line 149
    .line 150
    .line 151
    iget-object v0, v1, Llc/b;->t:Ljava/util/HashSet;

    .line 152
    .line 153
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    return-object v1

    .line 157
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 158
    .line 159
    const-string v0, "Spawn can only be called on a fully constructed FlutterEngine"

    .line 160
    .line 161
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw p1
.end method
