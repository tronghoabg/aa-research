.class public final synthetic Lp3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp3/c;->a:I

    iput-object p1, p0, Lp3/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lp3/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp3/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lkotlin/jvm/internal/M;

    .line 9
    .line 10
    iget-object v0, v0, Lkotlin/jvm/internal/M;->a:Lkotlin/reflect/KClass;

    .line 11
    .line 12
    instance-of v1, v0, Lkotlin/jvm/internal/m;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, Lkotlin/jvm/internal/m;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Lkotlin/jvm/internal/m;->findJavaDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :cond_1
    return-object v2

    .line 28
    :pswitch_0
    iget-object v0, p0, Lp3/c;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lp3/h;

    .line 31
    .line 32
    iget-object v1, v0, Lp3/h;->b:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v3, v0, Lp3/h;->a:Landroid/content/Context;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    iget-boolean v1, v0, Lp3/h;->d:Z

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    new-instance v1, Ljava/io/File;

    .line 43
    .line 44
    invoke-virtual {v3}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const-string v4, "getNoBackupFilesDir(...)"

    .line 49
    .line 50
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v4, v0, Lp3/h;->b:Ljava/lang/String;

    .line 54
    .line 55
    invoke-direct {v1, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance v2, Lp3/g;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    new-instance v5, Lac/a;

    .line 65
    .line 66
    const/16 v1, 0xf

    .line 67
    .line 68
    invoke-direct {v5, v1}, Lac/a;-><init>(I)V

    .line 69
    .line 70
    .line 71
    iget-object v6, v0, Lp3/h;->c:LN2/j;

    .line 72
    .line 73
    iget-boolean v7, v0, Lp3/h;->e:Z

    .line 74
    .line 75
    invoke-direct/range {v2 .. v7}, Lp3/g;-><init>(Landroid/content/Context;Ljava/lang/String;Lac/a;LN2/j;Z)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v2, Lp3/g;

    .line 80
    .line 81
    new-instance v5, Lac/a;

    .line 82
    .line 83
    const/16 v1, 0xf

    .line 84
    .line 85
    invoke-direct {v5, v1}, Lac/a;-><init>(I)V

    .line 86
    .line 87
    .line 88
    iget-object v4, v0, Lp3/h;->b:Ljava/lang/String;

    .line 89
    .line 90
    iget-boolean v7, v0, Lp3/h;->e:Z

    .line 91
    .line 92
    iget-object v6, v0, Lp3/h;->c:LN2/j;

    .line 93
    .line 94
    invoke-direct/range {v2 .. v7}, Lp3/g;-><init>(Landroid/content/Context;Ljava/lang/String;Lac/a;LN2/j;Z)V

    .line 95
    .line 96
    .line 97
    :goto_1
    iget-boolean v0, v0, Lp3/h;->g:Z

    .line 98
    .line 99
    invoke-virtual {v2, v0}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 100
    .line 101
    .line 102
    return-object v2

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
