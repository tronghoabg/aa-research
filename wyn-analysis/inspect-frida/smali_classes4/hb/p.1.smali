.class public final Lhb/p;
.super Lhb/r;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lhb/r;


# direct methods
.method public synthetic constructor <init>(Lhb/r;I)V
    .locals 0

    .line 1
    iput p2, p0, Lhb/p;->a:I

    iput-object p1, p0, Lhb/p;->b:Lhb/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson(Lhb/w;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lhb/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p1, Lhb/w;->f:Z

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p1, Lhb/w;->f:Z

    .line 10
    .line 11
    :try_start_0
    iget-object v1, p0, Lhb/p;->b:Lhb/r;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    iput-boolean v0, p1, Lhb/w;->f:Z

    .line 18
    .line 19
    return-object v1

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    iput-boolean v0, p1, Lhb/w;->f:Z

    .line 22
    .line 23
    throw v1

    .line 24
    :pswitch_0
    iget-boolean v0, p1, Lhb/w;->e:Z

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    iput-boolean v1, p1, Lhb/w;->e:Z

    .line 28
    .line 29
    :try_start_1
    iget-object v1, p0, Lhb/p;->b:Lhb/r;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    iput-boolean v0, p1, Lhb/w;->e:Z

    .line 36
    .line 37
    return-object v1

    .line 38
    :catchall_1
    move-exception v1

    .line 39
    iput-boolean v0, p1, Lhb/w;->e:Z

    .line 40
    .line 41
    throw v1

    .line 42
    :pswitch_1
    iget-object v0, p0, Lhb/p;->b:Lhb/r;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final isLenient()Z
    .locals 1

    .line 1
    iget v0, p0, Lhb/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhb/p;->b:Lhb/r;

    .line 7
    .line 8
    invoke-virtual {v0}, Lhb/r;->isLenient()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0

    .line 13
    :pswitch_0
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :pswitch_1
    iget-object v0, p0, Lhb/p;->b:Lhb/r;

    .line 16
    .line 17
    invoke-virtual {v0}, Lhb/r;->isLenient()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toJson(Lhb/C;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lhb/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhb/p;->b:Lhb/r;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-boolean v0, p1, Lhb/C;->f:Z

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, p1, Lhb/C;->f:Z

    .line 16
    .line 17
    :try_start_0
    iget-object v1, p0, Lhb/p;->b:Lhb/r;

    .line 18
    .line 19
    invoke-virtual {v1, p1, p2}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    iput-boolean v0, p1, Lhb/C;->f:Z

    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p2

    .line 26
    iput-boolean v0, p1, Lhb/C;->f:Z

    .line 27
    .line 28
    throw p2

    .line 29
    :pswitch_1
    iget-boolean v0, p1, Lhb/C;->g:Z

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    iput-boolean v1, p1, Lhb/C;->g:Z

    .line 33
    .line 34
    :try_start_1
    iget-object v1, p0, Lhb/p;->b:Lhb/r;

    .line 35
    .line 36
    invoke-virtual {v1, p1, p2}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    .line 38
    .line 39
    iput-boolean v0, p1, Lhb/C;->g:Z

    .line 40
    .line 41
    return-void

    .line 42
    :catchall_1
    move-exception p2

    .line 43
    iput-boolean v0, p1, Lhb/C;->g:Z

    .line 44
    .line 45
    throw p2

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lhb/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lhb/p;->b:Lhb/r;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ".failOnUnknown()"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lhb/p;->b:Lhb/r;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ".lenient()"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lhb/p;->b:Lhb/r;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, ".serializeNulls()"

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
