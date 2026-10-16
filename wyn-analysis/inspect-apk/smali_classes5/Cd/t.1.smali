.class public final LCd/t;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/q1;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LCd/t;->a:I

    .line 2
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 3
    iget-object p1, p1, Lcom/google/protobuf/q1;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, LCd/t;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LCd/t;->a:I

    iput-object p1, p0, LCd/t;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public available()I
    .locals 4

    .line 1
    iget v0, p0, LCd/t;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0}, Ljava/io/InputStream;->available()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0

    .line 11
    :pswitch_1
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :pswitch_2
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lcg/B;

    .line 23
    .line 24
    iget-boolean v1, v0, Lcg/B;->c:Z

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    iget-object v0, v0, Lcg/B;->b:Lcg/g;

    .line 29
    .line 30
    iget-wide v0, v0, Lcg/g;->b:J

    .line 31
    .line 32
    const v2, 0x7fffffff

    .line 33
    .line 34
    .line 35
    int-to-long v2, v2

    .line 36
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    long-to-int v0, v0

    .line 41
    return v0

    .line 42
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 43
    .line 44
    const-string v1, "closed"

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :pswitch_3
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lcg/g;

    .line 53
    .line 54
    iget-wide v0, v0, Lcg/g;->b:J

    .line 55
    .line 56
    const v2, 0x7fffffff

    .line 57
    .line 58
    .line 59
    int-to-long v2, v2

    .line 60
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    long-to-int v0, v0

    .line 65
    return v0

    .line 66
    :pswitch_4
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, LCd/t;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    return v0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public close()V
    .locals 1

    .line 1
    iget v0, p0, LCd/t;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/io/InputStream;->close()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcg/B;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcg/B;->close()V

    .line 15
    .line 16
    .line 17
    :pswitch_1
    return-void

    .line 18
    :pswitch_2
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lio/ktor/utils/io/t;

    .line 21
    .line 22
    invoke-static {v0}, Lio/ktor/utils/io/N;->b(Lio/ktor/utils/io/t;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_3
    invoke-super {p0}, Ljava/io/InputStream;->close()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, LCd/t;

    .line 32
    .line 33
    invoke-virtual {v0}, LCd/t;->close()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public mark(I)V
    .locals 1

    .line 1
    iget v0, p0, LCd/t;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ljava/io/InputStream;->mark(I)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, LCd/t;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/nio/Buffer;->mark()Ljava/nio/Buffer;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public markSupported()Z
    .locals 1

    .line 1
    iget v0, p0, LCd/t;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public final read()I
    .locals 6

    iget v0, p0, LCd/t;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    :goto_0
    return v0

    .line 3
    :pswitch_0
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    check-cast v0, Lcg/B;

    iget-boolean v1, v0, Lcg/B;->c:Z

    if-nez v1, :cond_2

    .line 4
    iget-object v1, v0, Lcg/B;->b:Lcg/g;

    .line 5
    iget-wide v2, v1, Lcg/g;->b:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    .line 6
    iget-object v0, v0, Lcg/B;->a:Lcg/H;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Lcg/H;->read(Lcg/g;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    const/4 v0, -0x1

    goto :goto_1

    .line 7
    :cond_1
    invoke-virtual {v1}, Lcg/g;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    :goto_1
    return v0

    .line 8
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9
    :pswitch_1
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    check-cast v0, Lcg/g;

    iget-wide v1, v0, Lcg/g;->b:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_3

    .line 10
    invoke-virtual {v0}, Lcg/g;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    goto :goto_2

    :cond_3
    const/4 v0, -0x1

    :goto_2
    return v0

    .line 11
    :pswitch_2
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/t;

    invoke-interface {v0}, Lio/ktor/utils/io/t;->h()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    .line 12
    :cond_4
    invoke-interface {v0}, Lio/ktor/utils/io/t;->d()LPf/a;

    move-result-object v1

    invoke-virtual {v1}, LPf/a;->exhausted()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 13
    new-instance v1, LVd/a;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, LVd/a;-><init>(Lio/ktor/utils/io/t;Ljf/c;)V

    invoke-static {v1}, LEf/H;->J(Ltf/p;)Ljava/lang/Object;

    .line 14
    :cond_5
    invoke-interface {v0}, Lio/ktor/utils/io/t;->h()Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_3
    const/4 v0, -0x1

    goto :goto_4

    .line 15
    :cond_6
    invoke-interface {v0}, Lio/ktor/utils/io/t;->d()LPf/a;

    move-result-object v0

    invoke-virtual {v0}, LPf/a;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    :goto_4
    return v0

    .line 16
    :pswitch_3
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    check-cast v0, LCd/t;

    invoke-virtual {v0}, LCd/t;->read()I

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final read([BII)I
    .locals 8

    iget v0, p0, LCd/t;->a:I

    packed-switch v0, :pswitch_data_0

    .line 17
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 19
    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    move p1, p3

    :goto_0
    return p1

    .line 20
    :pswitch_0
    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    check-cast v0, Lcg/B;

    iget-boolean v1, v0, Lcg/B;->c:Z

    if-nez v1, :cond_2

    .line 22
    array-length v1, p1

    int-to-long v2, v1

    int-to-long v4, p2

    int-to-long v6, p3

    invoke-static/range {v2 .. v7}, Lcg/b;->f(JJJ)V

    .line 23
    iget-object v1, v0, Lcg/B;->b:Lcg/g;

    .line 24
    iget-wide v2, v1, Lcg/g;->b:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    .line 25
    iget-object v0, v0, Lcg/B;->a:Lcg/H;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Lcg/H;->read(Lcg/g;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    const/4 p1, -0x1

    goto :goto_1

    .line 26
    :cond_1
    invoke-virtual {v1, p1, p2, p3}, Lcg/g;->read([BII)I

    move-result p1

    :goto_1
    return p1

    .line 27
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 28
    :pswitch_1
    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    check-cast v0, Lcg/g;

    invoke-virtual {v0, p1, p2, p3}, Lcg/g;->read([BII)I

    move-result p1

    return p1

    .line 30
    :pswitch_2
    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/t;

    invoke-interface {v0}, Lio/ktor/utils/io/t;->h()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    .line 32
    :cond_3
    invoke-interface {v0}, Lio/ktor/utils/io/t;->d()LPf/a;

    move-result-object v1

    invoke-virtual {v1}, LPf/a;->exhausted()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 33
    new-instance v1, LVd/a;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, LVd/a;-><init>(Lio/ktor/utils/io/t;Ljf/c;)V

    invoke-static {v1}, LEf/H;->J(Ltf/p;)Ljava/lang/Object;

    .line 34
    :cond_4
    invoke-interface {v0}, Lio/ktor/utils/io/t;->d()LPf/a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    iget-wide v1, v1, LPf/a;->c:J

    long-to-int v1, v1

    .line 36
    invoke-static {v1, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 37
    invoke-interface {v0}, Lio/ktor/utils/io/t;->d()LPf/a;

    move-result-object v1

    add-int/2addr p3, p2

    invoke-virtual {v1, p2, p3, p1}, LPf/a;->a(II[B)I

    move-result p1

    if-ltz p1, :cond_5

    goto :goto_3

    .line 38
    :cond_5
    invoke-interface {v0}, Lio/ktor/utils/io/t;->h()Z

    move-result p1

    if-eqz p1, :cond_6

    :goto_2
    const/4 p1, -0x1

    goto :goto_3

    :cond_6
    const/4 p1, 0x0

    :goto_3
    return p1

    .line 39
    :pswitch_3
    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    check-cast v0, LCd/t;

    invoke-virtual {v0, p1, p2, p3}, LCd/t;->read([BII)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public reset()V
    .locals 2

    .line 1
    iget v0, p0, LCd/t;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/io/InputStream;->reset()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    :try_start_0
    iget-object v0, p0, LCd/t;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/nio/Buffer;->reset()Ljava/nio/Buffer;
    :try_end_0
    .catch Ljava/nio/InvalidMarkException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catch_0
    move-exception v0

    .line 19
    new-instance v1, Ljava/io/IOException;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw v1

    .line 25
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, LCd/t;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, LCd/t;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lcg/B;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ".inputStream()"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, LCd/t;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lcg/g;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, ".inputStream()"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0

    .line 55
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
