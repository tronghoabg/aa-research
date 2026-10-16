.class public final synthetic LJ9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLe/b;
.implements LLe/d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LJ9/f;


# direct methods
.method public synthetic constructor <init>(LJ9/f;I)V
    .locals 0

    .line 1
    iput p2, p0, LJ9/e;->a:I

    iput-object p1, p0, LJ9/e;->b:LJ9/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, LJ9/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iget-object v0, p0, LJ9/e;->b:LJ9/f;

    .line 10
    .line 11
    iput-object p1, v0, LJ9/f;->d:Lta/o;

    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p1, Lta/o;

    .line 15
    .line 16
    iget-object v0, p0, LJ9/e;->b:LJ9/f;

    .line 17
    .line 18
    iput-object p1, v0, LJ9/f;->d:Lta/o;

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public test(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    check-cast p1, Lta/o;

    .line 2
    .line 3
    iget-object v0, p0, LJ9/e;->b:LJ9/f;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lta/o;->d()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    iget-object p1, v0, LJ9/f;->c:LM9/a;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    new-instance p1, Ljava/io/File;

    .line 22
    .line 23
    iget-object v0, v0, LJ9/f;->b:Landroid/app/Application;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v5, "fiam_eligible_campaigns_cache_file"

    .line 34
    .line 35
    invoke-direct {p1, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-wide/16 v5, 0x0

    .line 39
    .line 40
    cmp-long v0, v1, v5

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    cmp-long p1, v3, v1

    .line 45
    .line 46
    if-gez p1, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    sget-object p1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 60
    .line 61
    const-wide/16 v5, 0x1

    .line 62
    .line 63
    invoke-virtual {p1, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v5

    .line 67
    add-long/2addr v5, v0

    .line 68
    cmp-long p1, v3, v5

    .line 69
    .line 70
    if-gez p1, :cond_1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    const/4 p1, 0x0

    .line 74
    return p1

    .line 75
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 76
    return p1
.end method
