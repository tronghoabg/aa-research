.class public final LX0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/core/graphics/drawable/IconCompat;

.field public final b:Ljava/lang/CharSequence;

.field public final c:Landroid/app/PendingIntent;

.field public d:Z

.field public final e:Landroid/os/Bundle;

.field public f:Ljava/util/ArrayList;

.field public g:I

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, LX0/j;->d:Z

    .line 11
    .line 12
    iput-boolean v1, p0, LX0/j;->h:Z

    .line 13
    .line 14
    iput-object p1, p0, LX0/j;->a:Landroidx/core/graphics/drawable/IconCompat;

    .line 15
    .line 16
    invoke-static {p2}, LX0/q;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, LX0/j;->b:Ljava/lang/CharSequence;

    .line 21
    .line 22
    iput-object p3, p0, LX0/j;->c:Landroid/app/PendingIntent;

    .line 23
    .line 24
    iput-object v0, p0, LX0/j;->e:Landroid/os/Bundle;

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, LX0/j;->f:Ljava/util/ArrayList;

    .line 28
    .line 29
    iput-boolean v1, p0, LX0/j;->d:Z

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    iput p1, p0, LX0/j;->g:I

    .line 33
    .line 34
    iput-boolean v1, p0, LX0/j;->h:Z

    .line 35
    .line 36
    iput-boolean p1, p0, LX0/j;->i:Z

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a()LX0/k;
    .locals 15

    .line 1
    iget-boolean v0, p0, LX0/j;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, LX0/j;->c:Landroid/app/PendingIntent;

    .line 7
    .line 8
    if-eqz v0, :cond_6

    .line 9
    .line 10
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, LX0/j;->f:Ljava/util/ArrayList;

    .line 21
    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_3

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, LX0/T;

    .line 39
    .line 40
    iget-boolean v4, v3, LX0/T;->c:Z

    .line 41
    .line 42
    if-nez v4, :cond_2

    .line 43
    .line 44
    iget-object v4, v3, LX0/T;->b:[Ljava/lang/CharSequence;

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    array-length v4, v4

    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    :cond_1
    iget-object v4, v3, LX0/T;->e:Ljava/util/HashSet;

    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/util/HashSet;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const/4 v3, 0x0

    .line 72
    if-eqz v2, :cond_4

    .line 73
    .line 74
    move-object v10, v3

    .line 75
    goto :goto_2

    .line 76
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    new-array v2, v2, [LX0/T;

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, [LX0/T;

    .line 87
    .line 88
    move-object v10, v0

    .line 89
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    :goto_3
    move-object v9, v3

    .line 96
    goto :goto_4

    .line 97
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    new-array v0, v0, [LX0/T;

    .line 102
    .line 103
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    move-object v3, v0

    .line 108
    check-cast v3, [LX0/T;

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :goto_4
    new-instance v4, LX0/k;

    .line 112
    .line 113
    iget-boolean v11, p0, LX0/j;->d:Z

    .line 114
    .line 115
    iget v12, p0, LX0/j;->g:I

    .line 116
    .line 117
    iget-boolean v13, p0, LX0/j;->h:Z

    .line 118
    .line 119
    iget-boolean v14, p0, LX0/j;->i:Z

    .line 120
    .line 121
    iget-object v7, p0, LX0/j;->c:Landroid/app/PendingIntent;

    .line 122
    .line 123
    iget-object v8, p0, LX0/j;->e:Landroid/os/Bundle;

    .line 124
    .line 125
    iget-object v5, p0, LX0/j;->a:Landroidx/core/graphics/drawable/IconCompat;

    .line 126
    .line 127
    iget-object v6, p0, LX0/j;->b:Ljava/lang/CharSequence;

    .line 128
    .line 129
    invoke-direct/range {v4 .. v14}, LX0/k;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[LX0/T;[LX0/T;ZIZZ)V

    .line 130
    .line 131
    .line 132
    return-object v4

    .line 133
    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    .line 134
    .line 135
    const-string v1, "Contextual Actions must contain a valid PendingIntent"

    .line 136
    .line 137
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw v0
.end method
