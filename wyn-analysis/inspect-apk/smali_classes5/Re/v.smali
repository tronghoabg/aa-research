.class public final LRe/v;
.super LXe/a;
.source "SourceFile"


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LOe/a;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LRe/v;->f:I

    invoke-direct {p0, p1}, LXe/a;-><init>(LOe/a;)V

    iput-object p2, p0, LRe/v;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LRe/v;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LXe/a;->d:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget v0, p0, LXe/a;->e:I

    .line 12
    .line 13
    iget-object v1, p0, LXe/a;->a:LOe/a;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-interface {v1, p1}, LHe/f;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    :try_start_0
    iget-object v0, p0, LRe/v;->g:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, LY9/c;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, LY9/c;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v0, "The mapper function returned a null value."

    .line 31
    .line 32
    invoke-static {p1, v0}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    invoke-interface {v1, p1}, LHe/f;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    invoke-virtual {p0, p1}, LXe/a;->a(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-void

    .line 44
    :pswitch_0
    invoke-virtual {p0, p1}, LRe/v;->d(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_2

    .line 49
    .line 50
    iget-object p1, p0, LXe/a;->b:Lug/b;

    .line 51
    .line 52
    const-wide/16 v0, 0x1

    .line 53
    .line 54
    invoke-interface {p1, v0, v1}, Lug/b;->request(J)V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget v0, p0, LRe/v;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LXe/a;->d:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    :try_start_0
    iget-object v0, p0, LRe/v;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, LY9/c;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, LY9/c;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v0, "The mapper function returned a null value."

    .line 21
    .line 22
    invoke-static {p1, v0}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, LXe/a;->a:LOe/a;

    .line 26
    .line 27
    invoke-interface {v0, p1}, LOe/a;->d(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    invoke-virtual {p0, p1}, LXe/a;->a(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    :goto_0
    return p1

    .line 38
    :pswitch_0
    iget-boolean v0, p0, LXe/a;->d:Z

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    iget v0, p0, LXe/a;->e:I

    .line 44
    .line 45
    iget-object v1, p0, LXe/a;->a:LOe/a;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    invoke-interface {v1, p1}, LOe/a;->d(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    goto :goto_3

    .line 55
    :cond_2
    const/4 v0, 0x1

    .line 56
    :try_start_1
    iget-object v2, p0, LRe/v;->g:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, LLe/d;

    .line 59
    .line 60
    invoke-interface {v2, p1}, LLe/d;->test(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    invoke-interface {v1, p1}, LOe/a;->d(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    :goto_1
    move p1, v0

    .line 73
    goto :goto_3

    .line 74
    :cond_3
    :goto_2
    const/4 p1, 0x0

    .line 75
    goto :goto_3

    .line 76
    :catchall_1
    move-exception p1

    .line 77
    invoke-virtual {p0, p1}, LXe/a;->a(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :goto_3
    return p1

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final poll()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LRe/v;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LXe/a;->c:LOe/e;

    .line 7
    .line 8
    invoke-interface {v0}, LOe/h;->poll()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, LRe/v;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, LY9/c;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, LY9/c;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "The mapper function returned a null value."

    .line 23
    .line 24
    invoke-static {v0, v1}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    return-object v0

    .line 30
    :pswitch_0
    iget-object v0, p0, LXe/a;->c:LOe/e;

    .line 31
    .line 32
    :cond_1
    :goto_1
    invoke-interface {v0}, LOe/h;->poll()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    iget-object v2, p0, LRe/v;->g:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, LLe/d;

    .line 43
    .line 44
    invoke-interface {v2, v1}, LLe/d;->test(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    :goto_2
    return-object v1

    .line 51
    :cond_3
    iget v1, p0, LXe/a;->e:I

    .line 52
    .line 53
    const/4 v2, 0x2

    .line 54
    if-ne v1, v2, :cond_1

    .line 55
    .line 56
    const-wide/16 v1, 0x1

    .line 57
    .line 58
    invoke-interface {v0, v1, v2}, Lug/b;->request(J)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
