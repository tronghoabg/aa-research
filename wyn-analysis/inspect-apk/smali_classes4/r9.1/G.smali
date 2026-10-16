.class public final synthetic Lr9/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw9/g;


# instance fields
.field public final synthetic a:LA7/c0;

.field public final synthetic b:[I

.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:[Ls9/m;


# direct methods
.method public synthetic constructor <init>(LA7/c0;[ILjava/util/ArrayList;[Ls9/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr9/G;->a:LA7/c0;

    iput-object p2, p0, Lr9/G;->b:[I

    iput-object p3, p0, Lr9/G;->c:Ljava/util/ArrayList;

    iput-object p4, p0, Lr9/G;->d:[Ls9/m;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    check-cast p1, Landroid/database/Cursor;

    .line 4
    .line 5
    iget-object v2, p0, Lr9/G;->a:LA7/c0;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lka/e0;->l(Ljava/lang/String;)Ls9/m;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance v3, Ls9/h;

    .line 19
    .line 20
    invoke-direct {v3, p1}, Ls9/h;-><init>(Ls9/m;)V

    .line 21
    .line 22
    .line 23
    iget-object v4, v2, LA7/c0;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, LY2/B;

    .line 26
    .line 27
    invoke-virtual {v4, v3}, LY2/B;->l(Ls9/h;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    iget-object v2, v2, LA7/c0;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Lr9/K;

    .line 34
    .line 35
    iget-object v5, v3, Ls9/h;->a:Ls9/m;

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    move v6, v0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string v4, "SELECT 1 FROM document_mutations WHERE path = ?"

    .line 42
    .line 43
    invoke-virtual {v2, v4}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-static {v5}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    new-array v7, v0, [Ljava/lang/Object;

    .line 52
    .line 53
    aput-object v6, v7, v1

    .line 54
    .line 55
    invoke-virtual {v4, v7}, Lne/a;->b([Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4}, Lne/a;->i()Landroid/database/Cursor;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    :try_start_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    .line 63
    .line 64
    .line 65
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 67
    .line 68
    .line 69
    :goto_0
    if-nez v6, :cond_1

    .line 70
    .line 71
    iget-object v4, p0, Lr9/G;->b:[I

    .line 72
    .line 73
    aget v6, v4, v1

    .line 74
    .line 75
    add-int/2addr v6, v0

    .line 76
    aput v6, v4, v1

    .line 77
    .line 78
    iget-object v4, p0, Lr9/G;->c:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    invoke-static {v5}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    new-array v0, v0, [Ljava/lang/Object;

    .line 88
    .line 89
    aput-object v3, v0, v1

    .line 90
    .line 91
    const-string v3, "DELETE FROM target_documents WHERE path = ? AND target_id = 0"

    .line 92
    .line 93
    invoke-virtual {v2, v3, v0}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_1
    iget-object v0, p0, Lr9/G;->d:[Ls9/m;

    .line 97
    .line 98
    aput-object p1, v0, v1

    .line 99
    .line 100
    return-void

    .line 101
    :catchall_0
    move-exception p1

    .line 102
    if-eqz v4, :cond_2

    .line 103
    .line 104
    :try_start_1
    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :catchall_1
    move-exception v0

    .line 109
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    :cond_2
    :goto_1
    throw p1
.end method
