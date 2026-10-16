.class final Lj$/time/format/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/time/format/f;


# virtual methods
.method public final o(Lj$/time/format/t;Ljava/lang/StringBuilder;)Z
    .locals 18

    move-object/from16 v0, p2

    .line 3414
    sget-object v1, Lj$/time/temporal/a;->INSTANT_SECONDS:Lj$/time/temporal/a;

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lj$/time/format/t;->e(Lj$/time/temporal/q;)Ljava/lang/Long;

    move-result-object v1

    .line 3416
    invoke-virtual {v2}, Lj$/time/format/t;->d()Lj$/time/temporal/TemporalAccessor;

    move-result-object v3

    sget-object v4, Lj$/time/temporal/a;->NANO_OF_SECOND:Lj$/time/temporal/a;

    invoke-interface {v3, v4}, Lj$/time/temporal/TemporalAccessor;->g(Lj$/time/temporal/q;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 3417
    invoke-virtual {v2}, Lj$/time/format/t;->d()Lj$/time/temporal/TemporalAccessor;

    move-result-object v2

    invoke-interface {v2, v4}, Lj$/time/temporal/TemporalAccessor;->w(Lj$/time/temporal/q;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    if-nez v1, :cond_1

    return v3

    .line 3422
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    if-eqz v2, :cond_2

    .line 3423
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    goto :goto_1

    :cond_2
    move-wide v1, v7

    :goto_1
    invoke-virtual {v4, v1, v2}, Lj$/time/temporal/a;->R(J)I

    move-result v1

    const-wide v9, -0xe79747c00L

    cmp-long v2, v5, v9

    .line 3425
    const-string v9, ":00"

    const-wide/16 v10, 0x1

    const-wide v12, 0xe79747c00L

    const-wide v14, 0x497968bd80L

    if-ltz v2, :cond_5

    const-wide v16, 0x3afff44180L

    sub-long v5, v5, v16

    .line 3428
    invoke-static {v5, v6, v14, v15}, Lj$/time/b;->f(JJ)J

    move-result-wide v16

    add-long v10, v16, v10

    .line 3429
    invoke-static {v5, v6, v14, v15}, Lj$/time/b;->e(JJ)J

    move-result-wide v5

    sub-long/2addr v5, v12

    .line 3430
    sget-object v2, Lj$/time/ZoneOffset;->UTC:Lj$/time/ZoneOffset;

    invoke-static {v5, v6, v3, v2}, Lj$/time/LocalDateTime;->g0(JILj$/time/ZoneOffset;)Lj$/time/LocalDateTime;

    move-result-object v2

    cmp-long v5, v10, v7

    if-lez v5, :cond_3

    const/16 v5, 0x2b

    .line 3432
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 3434
    :cond_3
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3435
    invoke-virtual {v2}, Lj$/time/LocalDateTime;->Z()I

    move-result v2

    if-nez v2, :cond_4

    .line 3436
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    const/16 p1, 0x1

    goto :goto_2

    :cond_5
    add-long/2addr v5, v12

    move-wide/from16 v16, v5

    const/16 p1, 0x1

    .line 3441
    div-long v4, v16, v14

    .line 3442
    rem-long v14, v16, v14

    sub-long v12, v14, v12

    .line 3443
    sget-object v2, Lj$/time/ZoneOffset;->UTC:Lj$/time/ZoneOffset;

    invoke-static {v12, v13, v3, v2}, Lj$/time/LocalDateTime;->g0(JILj$/time/ZoneOffset;)Lj$/time/LocalDateTime;

    move-result-object v2

    .line 3444
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    .line 3445
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3446
    invoke-virtual {v2}, Lj$/time/LocalDateTime;->Z()I

    move-result v12

    if-nez v12, :cond_6

    .line 3447
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    cmp-long v9, v4, v7

    if-gez v9, :cond_9

    .line 3450
    invoke-virtual {v2}, Lj$/time/LocalDateTime;->a0()I

    move-result v2

    const/16 v9, -0x2710

    if-ne v2, v9, :cond_7

    add-int/lit8 v2, v6, 0x2

    sub-long/2addr v4, v10

    .line 3451
    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v6, v2, v4}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_7
    cmp-long v2, v14, v7

    if-nez v2, :cond_8

    .line 3453
    invoke-virtual {v0, v6, v4, v5}, Ljava/lang/StringBuilder;->insert(IJ)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 3455
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    move-result-wide v4

    invoke-virtual {v0, v6, v4, v5}, Ljava/lang/StringBuilder;->insert(IJ)Ljava/lang/StringBuilder;

    :cond_9
    :goto_2
    if-gtz v1, :cond_a

    goto :goto_4

    :cond_a
    const/16 v2, 0x2e

    .line 3461
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const v2, 0x5f5e100

    :goto_3
    if-gtz v1, :cond_c

    .line 3463
    rem-int/lit8 v4, v3, 0x3

    if-nez v4, :cond_c

    const/4 v4, -0x2

    if-ge v3, v4, :cond_b

    goto :goto_5

    :cond_b
    :goto_4
    const/16 v1, 0x5a

    .line 3472
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return p1

    .line 3466
    :cond_c
    :goto_5
    div-int v4, v1, v2

    add-int/lit8 v5, v4, 0x30

    int-to-char v5, v5

    .line 3467
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    mul-int/2addr v4, v2

    sub-int/2addr v1, v4

    .line 3469
    div-int/lit8 v2, v2, 0xa

    add-int/lit8 v3, v3, 0x1

    goto :goto_3
.end method

.method public final q(Lj$/time/format/q;Ljava/lang/CharSequence;I)I
    .locals 17

    move/from16 v4, p3

    .line 3481
    new-instance v0, Lj$/time/format/p;

    invoke-direct {v0}, Lj$/time/format/p;-><init>()V

    sget-object v1, Lj$/time/format/DateTimeFormatter;->ISO_LOCAL_DATE:Lj$/time/format/DateTimeFormatter;

    .line 3482
    invoke-virtual {v0, v1}, Lj$/time/format/p;->a(Lj$/time/format/DateTimeFormatter;)V

    const/16 v1, 0x54

    invoke-virtual {v0, v1}, Lj$/time/format/p;->e(C)V

    sget-object v1, Lj$/time/temporal/a;->HOUR_OF_DAY:Lj$/time/temporal/a;

    const/4 v2, 0x2

    .line 3483
    invoke-virtual {v0, v1, v2}, Lj$/time/format/p;->k(Lj$/time/temporal/q;I)V

    const/16 v3, 0x3a

    invoke-virtual {v0, v3}, Lj$/time/format/p;->e(C)V

    sget-object v5, Lj$/time/temporal/a;->MINUTE_OF_HOUR:Lj$/time/temporal/a;

    .line 3484
    invoke-virtual {v0, v5, v2}, Lj$/time/format/p;->k(Lj$/time/temporal/q;I)V

    invoke-virtual {v0, v3}, Lj$/time/format/p;->e(C)V

    sget-object v3, Lj$/time/temporal/a;->SECOND_OF_MINUTE:Lj$/time/temporal/a;

    .line 3485
    invoke-virtual {v0, v3, v2}, Lj$/time/format/p;->k(Lj$/time/temporal/q;I)V

    sget-object v6, Lj$/time/temporal/a;->NANO_OF_SECOND:Lj$/time/temporal/a;

    .line 3486
    invoke-virtual {v0, v6}, Lj$/time/format/p;->b(Lj$/time/temporal/a;)V

    const/16 v2, 0x5a

    .line 3487
    invoke-virtual {v0, v2}, Lj$/time/format/p;->e(C)V

    .line 3488
    invoke-virtual {v0}, Lj$/time/format/p;->t()Lj$/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-virtual {v0}, Lj$/time/format/DateTimeFormatter;->f()Lj$/time/format/e;

    move-result-object v0

    .line 3489
    invoke-virtual/range {p1 .. p1}, Lj$/time/format/q;->c()Lj$/time/format/q;

    move-result-object v2

    move-object/from16 v7, p2

    .line 3490
    invoke-virtual {v0, v2, v7, v4}, Lj$/time/format/e;->q(Lj$/time/format/q;Ljava/lang/CharSequence;I)I

    move-result v0

    if-gez v0, :cond_0

    return v0

    .line 3496
    :cond_0
    sget-object v7, Lj$/time/temporal/a;->YEAR:Lj$/time/temporal/a;

    invoke-virtual {v2, v7}, Lj$/time/format/q;->i(Lj$/time/temporal/a;)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    .line 3497
    sget-object v9, Lj$/time/temporal/a;->MONTH_OF_YEAR:Lj$/time/temporal/a;

    invoke-virtual {v2, v9}, Lj$/time/format/q;->i(Lj$/time/temporal/a;)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Long;->intValue()I

    move-result v11

    .line 3498
    sget-object v9, Lj$/time/temporal/a;->DAY_OF_MONTH:Lj$/time/temporal/a;

    invoke-virtual {v2, v9}, Lj$/time/format/q;->i(Lj$/time/temporal/a;)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Long;->intValue()I

    move-result v12

    .line 3499
    invoke-virtual {v2, v1}, Lj$/time/format/q;->i(Lj$/time/temporal/a;)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    move-result v1

    .line 3500
    invoke-virtual {v2, v5}, Lj$/time/format/q;->i(Lj$/time/temporal/a;)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Long;->intValue()I

    move-result v14

    .line 3501
    invoke-virtual {v2, v3}, Lj$/time/format/q;->i(Lj$/time/temporal/a;)Ljava/lang/Long;

    move-result-object v3

    .line 3502
    invoke-virtual {v2, v6}, Lj$/time/format/q;->i(Lj$/time/temporal/a;)Ljava/lang/Long;

    move-result-object v2

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    .line 3503
    invoke-virtual {v3}, Ljava/lang/Long;->intValue()I

    move-result v3

    goto :goto_0

    :cond_1
    move v3, v5

    :goto_0
    if-eqz v2, :cond_2

    .line 3504
    invoke-virtual {v2}, Ljava/lang/Long;->intValue()I

    move-result v2

    move v9, v2

    goto :goto_1

    :cond_2
    move v9, v5

    :goto_1
    const/16 v2, 0x18

    if-ne v1, v2, :cond_3

    if-nez v14, :cond_3

    if-nez v3, :cond_3

    if-nez v9, :cond_3

    const/4 v1, 0x1

    move v15, v3

    move v13, v5

    move v5, v1

    goto :goto_2

    :cond_3
    const/16 v2, 0x17

    if-ne v1, v2, :cond_4

    const/16 v2, 0x3b

    if-ne v14, v2, :cond_4

    const/16 v10, 0x3c

    if-ne v3, v10, :cond_4

    .line 3510
    invoke-virtual/range {p1 .. p1}, Lj$/time/format/q;->o()V

    move v13, v1

    move v15, v2

    goto :goto_2

    :cond_4
    move v13, v1

    move v15, v3

    :goto_2
    long-to-int v1, v7

    .line 3513
    rem-int/lit16 v10, v1, 0x2710

    const/16 v16, 0x0

    .line 3516
    :try_start_0
    invoke-static/range {v10 .. v16}, Lj$/time/LocalDateTime;->e0(IIIIIII)Lj$/time/LocalDateTime;

    move-result-object v1

    int-to-long v2, v5

    invoke-virtual {v1, v2, v3}, Lj$/time/LocalDateTime;->plusDays(J)Lj$/time/LocalDateTime;

    move-result-object v1

    .line 3517
    sget-object v2, Lj$/time/ZoneOffset;->UTC:Lj$/time/ZoneOffset;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-static {v1, v2}, Lj$/time/chrono/i;->o(Lj$/time/chrono/e;Lj$/time/ZoneOffset;)J

    move-result-wide v1

    const-wide/16 v10, 0x2710

    .line 3518
    div-long/2addr v7, v10

    const-wide v10, 0x497968bd80L

    invoke-static {v7, v8, v10, v11}, Lj$/time/b;->g(JJ)J

    move-result-wide v7
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    add-long/2addr v1, v7

    move-wide v2, v1

    .line 3523
    sget-object v1, Lj$/time/temporal/a;->INSTANT_SECONDS:Lj$/time/temporal/a;

    move v5, v0

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v5}, Lj$/time/format/q;->n(Lj$/time/temporal/q;JII)I

    move-result v5

    int-to-long v2, v9

    move/from16 v4, p3

    move-object v1, v6

    .line 3524
    invoke-virtual/range {v0 .. v5}, Lj$/time/format/q;->n(Lj$/time/temporal/q;JII)I

    move-result v0

    return v0

    :catch_0
    not-int v0, v4

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 3529
    const-string v0, "Instant()"

    return-object v0
.end method
