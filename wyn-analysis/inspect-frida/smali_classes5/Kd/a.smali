.class public final LKd/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEf/E;


# instance fields
.field public final synthetic a:I

.field public final b:Ljf/h;


# direct methods
.method public constructor <init>(Ljf/h;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LKd/a;->a:I

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, LKd/a;->b:Ljf/h;

    return-void
.end method

.method public constructor <init>(Ljf/h;Lio/ktor/utils/io/t;Ljava/lang/String;Ljava/lang/Long;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const/4 v9, 0x1

    const/4 v10, 0x0

    iput v10, v0, LKd/a;->a:I

    .line 1
    const-string v4, "coroutineContext"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "channel"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object v1, v0, LKd/a;->b:Ljf/h;

    .line 4
    sget-object v1, LKd/o;->a:LQf/a;

    .line 5
    sget-object v1, LJd/d;->a:LJd/f;

    .line 6
    const-string v1, "multipart/"

    invoke-static {v3, v1, v9}, LBf/k;->J0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_19

    .line 7
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    move v4, v10

    move v11, v4

    move v12, v11

    :goto_0
    const/4 v13, 0x4

    const/16 v15, 0x5c

    const/4 v6, 0x3

    const/16 v7, 0x22

    const/16 v8, 0x2c

    const/16 v10, 0x3b

    const/4 v14, 0x2

    if-ge v4, v1, :cond_d

    .line 8
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-eqz v11, :cond_b

    if-eq v11, v9, :cond_6

    if-eq v11, v14, :cond_4

    if-eq v11, v6, :cond_1

    if-eq v11, v13, :cond_0

    goto :goto_5

    :cond_0
    move v11, v6

    goto :goto_5

    :cond_1
    if-eq v5, v7, :cond_3

    if-eq v5, v15, :cond_2

    goto :goto_5

    :cond_2
    move v11, v13

    goto :goto_5

    :cond_3
    :goto_1
    move v11, v9

    :goto_2
    const/4 v12, 0x0

    goto :goto_5

    :cond_4
    if-eq v5, v7, :cond_0

    if-eq v5, v8, :cond_5

    if-eq v5, v10, :cond_3

    goto :goto_5

    :cond_5
    :goto_3
    const/4 v11, 0x0

    goto :goto_5

    :cond_6
    const/16 v6, 0x3d

    if-ne v5, v6, :cond_7

    move v11, v14

    goto :goto_5

    :cond_7
    if-ne v5, v10, :cond_8

    goto :goto_2

    :cond_8
    if-ne v5, v8, :cond_9

    goto :goto_3

    :cond_9
    const/16 v6, 0x20

    if-eq v5, v6, :cond_c

    if-nez v12, :cond_a

    move v5, v7

    const/16 v7, 0x9

    move/from16 v16, v8

    const/4 v8, 0x1

    move/from16 v17, v5

    .line 9
    const-string v5, "boundary="

    move/from16 v18, v6

    const/4 v6, 0x0

    move/from16 v15, v17

    const/4 v13, 0x3

    invoke-static/range {v3 .. v8}, LBf/k;->D0(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    move-result v5

    if-eqz v5, :cond_a

    :goto_4
    const/4 v1, -0x1

    goto :goto_6

    :cond_a
    add-int/2addr v12, v9

    goto :goto_5

    :cond_b
    if-ne v5, v10, :cond_c

    goto :goto_1

    :cond_c
    :goto_5
    add-int/2addr v4, v9

    const/4 v10, 0x0

    goto :goto_0

    :cond_d
    move v13, v6

    move v15, v7

    const/4 v4, -0x1

    goto :goto_4

    :goto_6
    if-eq v4, v1, :cond_18

    add-int/lit8 v4, v4, 0x9

    const/16 v1, 0x4a

    .line 10
    new-array v1, v1, [B

    .line 11
    new-instance v5, Lkotlin/jvm/internal/E;

    .line 12
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    const/16 v6, 0xd

    .line 13
    invoke-static {v5, v1, v6}, LKd/o;->c(Lkotlin/jvm/internal/E;[BB)V

    const/16 v6, 0xa

    .line 14
    invoke-static {v5, v1, v6}, LKd/o;->c(Lkotlin/jvm/internal/E;[BB)V

    const/16 v6, 0x2d

    .line 15
    invoke-static {v5, v1, v6}, LKd/o;->c(Lkotlin/jvm/internal/E;[BB)V

    .line 16
    invoke-static {v5, v1, v6}, LKd/o;->c(Lkotlin/jvm/internal/E;[BB)V

    .line 17
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x0

    :goto_7
    if-ge v4, v6, :cond_16

    .line 18
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const v11, 0xffff

    and-int/2addr v11, v8

    const/16 v12, 0x7f

    if-gt v11, v12, :cond_15

    if-eqz v7, :cond_12

    if-eq v7, v9, :cond_11

    if-eq v7, v14, :cond_f

    if-eq v7, v13, :cond_e

    :goto_8
    move/from16 v16, v9

    goto :goto_9

    :cond_e
    int-to-byte v7, v11

    .line 19
    invoke-static {v5, v1, v7}, LKd/o;->c(Lkotlin/jvm/internal/E;[BB)V

    move/from16 v16, v9

    move v7, v14

    :goto_9
    const/16 v9, 0x20

    const/16 v12, 0x2c

    goto :goto_a

    :cond_f
    if-eq v8, v15, :cond_16

    const/16 v12, 0x5c

    if-eq v8, v12, :cond_10

    int-to-byte v8, v11

    .line 20
    invoke-static {v5, v1, v8}, LKd/o;->c(Lkotlin/jvm/internal/E;[BB)V

    goto :goto_8

    :cond_10
    move/from16 v16, v9

    move v7, v13

    goto :goto_9

    :cond_11
    move/from16 v16, v9

    const/16 v9, 0x20

    const/16 v12, 0x5c

    if-eq v8, v9, :cond_16

    const/16 v12, 0x2c

    if-eq v8, v12, :cond_16

    if-eq v8, v10, :cond_16

    int-to-byte v8, v11

    .line 21
    invoke-static {v5, v1, v8}, LKd/o;->c(Lkotlin/jvm/internal/E;[BB)V

    goto :goto_a

    :cond_12
    move/from16 v16, v9

    const/16 v9, 0x20

    const/16 v12, 0x2c

    if-eq v8, v9, :cond_14

    if-eq v8, v15, :cond_13

    if-eq v8, v12, :cond_16

    if-eq v8, v10, :cond_16

    int-to-byte v7, v11

    .line 22
    invoke-static {v5, v1, v7}, LKd/o;->c(Lkotlin/jvm/internal/E;[BB)V

    move/from16 v7, v16

    goto :goto_a

    :cond_13
    move v7, v14

    :cond_14
    :goto_a
    add-int/lit8 v4, v4, 0x1

    move/from16 v9, v16

    goto :goto_7

    .line 23
    :cond_15
    new-instance v1, Ljava/io/IOException;

    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to parse multipart: wrong boundary byte 0x"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x10

    invoke-static {v3}, Ltg/b;->t(I)V

    invoke-static {v11, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "toString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " - should be 7bit character"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 25
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 26
    :cond_16
    iget v3, v5, Lkotlin/jvm/internal/E;->a:I

    const/4 v4, 0x4

    if-eq v3, v4, :cond_17

    const/4 v4, 0x0

    .line 27
    invoke-static {v4, v3, v1}, Lff/m;->k0(II[B)[B

    move-result-object v1

    .line 28
    new-instance v3, LQf/a;

    .line 29
    array-length v5, v1

    invoke-direct {v3, v1, v4, v5}, LQf/a;-><init>([BII)V

    .line 30
    new-instance v1, LKd/k;

    const/4 v5, 0x0

    move-object/from16 v6, p4

    invoke-direct {v1, v2, v3, v6, v5}, LKd/k;-><init>(Lio/ktor/utils/io/t;LQf/a;Ljava/lang/Long;Ljf/c;)V

    .line 31
    sget-object v2, Ljf/i;->a:Ljf/i;

    .line 32
    sget-object v3, LGf/a;->a:LGf/a;

    sget-object v5, LEf/F;->a:LEf/F;

    const/4 v6, 0x4

    .line 33
    invoke-static {v4, v6, v3}, Lic/d;->a(IILGf/a;)LGf/e;

    move-result-object v3

    .line 34
    invoke-static {v0, v2}, LEf/H;->E(LEf/E;Ljf/h;)Ljf/h;

    move-result-object v2

    .line 35
    new-instance v4, LGf/s;

    invoke-direct {v4, v2, v3}, LGf/s;-><init>(Ljf/h;LGf/e;)V

    .line 36
    invoke-virtual {v4, v5, v4, v1}, LEf/a;->a0(LEf/F;LEf/a;Ltf/p;)V

    return-void

    .line 37
    :cond_17
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Empty multipart boundary is not allowed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 38
    :cond_18
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Failed to parse multipart: Content-Type\'s boundary parameter is missing"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 39
    :cond_19
    new-instance v1, Lio/ktor/utils/io/T;

    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Failed to parse multipart: Content-Type should be multipart/* but it is "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 41
    const-string v3, "message"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 43
    throw v1
.end method


# virtual methods
.method public final getCoroutineContext()Ljf/h;
    .locals 1

    .line 1
    iget v0, p0, LKd/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LKd/a;->b:Ljf/h;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, LKd/a;->b:Ljf/h;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, LKd/a;->a:I

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
    const-string v1, "CoroutineScope(coroutineContext="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LKd/a;->b:Ljf/h;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 v1, 0x29

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
