.class public abstract Lgc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x0

    .line 5
    new-instance v4, Ljava/util/ArrayList;

    .line 6
    .line 7
    new-instance v5, Lfc/a;

    .line 8
    .line 9
    invoke-direct {v5, v3}, Lfc/a;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v6, Lfc/c;

    .line 13
    .line 14
    invoke-direct {v6, v3}, Lfc/c;-><init>(I)V

    .line 15
    .line 16
    .line 17
    new-instance v7, Lfc/c;

    .line 18
    .line 19
    invoke-direct {v7, v2}, Lfc/c;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v8, Lfc/a;

    .line 23
    .line 24
    invoke-direct {v8, v1}, Lfc/a;-><init>(I)V

    .line 25
    .line 26
    .line 27
    new-instance v9, Lfc/d;

    .line 28
    .line 29
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v10, Lfc/e;

    .line 33
    .line 34
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance v11, Lfc/f;

    .line 38
    .line 39
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v12, Lfc/a;

    .line 43
    .line 44
    invoke-direct {v12, v2}, Lfc/a;-><init>(I)V

    .line 45
    .line 46
    .line 47
    new-instance v13, Lfc/c;

    .line 48
    .line 49
    invoke-direct {v13, v1}, Lfc/c;-><init>(I)V

    .line 50
    .line 51
    .line 52
    new-instance v14, Lfc/g;

    .line 53
    .line 54
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    new-instance v15, Lfc/a;

    .line 58
    .line 59
    invoke-direct {v15, v0}, Lfc/a;-><init>(I)V

    .line 60
    .line 61
    .line 62
    move/from16 v16, v0

    .line 63
    .line 64
    const/16 v0, 0xb

    .line 65
    .line 66
    new-array v0, v0, [Lfc/b;

    .line 67
    .line 68
    aput-object v5, v0, v3

    .line 69
    .line 70
    aput-object v6, v0, v2

    .line 71
    .line 72
    aput-object v7, v0, v1

    .line 73
    .line 74
    aput-object v8, v0, v16

    .line 75
    .line 76
    const/4 v1, 0x4

    .line 77
    aput-object v9, v0, v1

    .line 78
    .line 79
    const/4 v1, 0x5

    .line 80
    aput-object v10, v0, v1

    .line 81
    .line 82
    const/4 v1, 0x6

    .line 83
    aput-object v11, v0, v1

    .line 84
    .line 85
    const/4 v1, 0x7

    .line 86
    aput-object v12, v0, v1

    .line 87
    .line 88
    const/16 v1, 0x8

    .line 89
    .line 90
    aput-object v13, v0, v1

    .line 91
    .line 92
    const/16 v1, 0x9

    .line 93
    .line 94
    aput-object v14, v0, v1

    .line 95
    .line 96
    const/16 v1, 0xa

    .line 97
    .line 98
    aput-object v15, v0, v1

    .line 99
    .line 100
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 105
    .line 106
    .line 107
    sput-object v4, Lgc/a;->a:Ljava/util/ArrayList;

    .line 108
    .line 109
    return-void
.end method

.method public static a()Lfc/b;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lgc/a;->a:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lfc/b;

    .line 23
    .line 24
    invoke-virtual {v2}, Lfc/b;->l()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v2, 0x1

    .line 39
    if-le v1, v2, :cond_3

    .line 40
    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Lfc/b;

    .line 61
    .line 62
    invoke-virtual {v3}, Lfc/b;->d()Lic/c;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const-class v2, Lgc/a;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    new-instance v3, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v4, "MORE THAN ONE CORRESPONDING:"

    .line 79
    .line 80
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, "|"

    .line 87
    .line 88
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-static {}, Lic/d;->y()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-lez v1, :cond_4

    .line 110
    .line 111
    const/4 v1, 0x0

    .line 112
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Lfc/b;

    .line 117
    .line 118
    return-object v0

    .line 119
    :cond_4
    const/4 v0, 0x0

    .line 120
    return-object v0
.end method
