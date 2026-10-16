.class public final La4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcg/y;

.field public b:Lcg/u;

.field public c:D

.field public d:J

.field public e:J

.field public f:LLf/d;


# virtual methods
.method public final a()La4/i;
    .locals 12

    .line 1
    iget-object v5, p0, La4/a;->a:Lcg/y;

    .line 2
    .line 3
    if-eqz v5, :cond_1

    .line 4
    .line 5
    iget-wide v0, p0, La4/a;->c:D

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmpl-double v2, v0, v2

    .line 10
    .line 11
    if-lez v2, :cond_0

    .line 12
    .line 13
    :try_start_0
    new-instance v2, Landroid/os/StatFs;

    .line 14
    .line 15
    invoke-virtual {v5}, Lcg/y;->e()Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-direct {v2, v3}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockCountLong()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    long-to-double v3, v3

    .line 31
    mul-double/2addr v0, v3

    .line 32
    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockSizeLong()J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    long-to-double v2, v2

    .line 37
    mul-double/2addr v0, v2

    .line 38
    double-to-long v6, v0

    .line 39
    iget-wide v8, p0, La4/a;->d:J

    .line 40
    .line 41
    iget-wide v10, p0, La4/a;->e:J

    .line 42
    .line 43
    invoke-static/range {v6 .. v11}, Landroid/support/v4/media/session/b;->T(JJJ)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    goto :goto_0

    .line 48
    :catch_0
    iget-wide v0, p0, La4/a;->d:J

    .line 49
    .line 50
    :goto_0
    move-wide v1, v0

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    const-wide/16 v0, 0x0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :goto_1
    new-instance v0, La4/i;

    .line 56
    .line 57
    iget-object v4, p0, La4/a;->b:Lcg/u;

    .line 58
    .line 59
    iget-object v3, p0, La4/a;->f:LLf/d;

    .line 60
    .line 61
    invoke-direct/range {v0 .. v5}, La4/i;-><init>(JLLf/d;Lcg/u;Lcg/y;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v1, "directory == null"

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0
.end method
