.class final Lj$/time/format/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/time/format/f;


# static fields
.field private static volatile c:Ljava/util/AbstractMap$SimpleImmutableEntry;

.field private static volatile d:Ljava/util/AbstractMap$SimpleImmutableEntry;


# instance fields
.field public final synthetic a:I

.field private final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lj$/time/format/n;->a:I

    iput-object p2, p0, Lj$/time/format/n;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lj$/time/format/q;Ljava/lang/CharSequence;IILj$/time/format/j;)I
    .locals 3

    .line 4308
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    .line 4309
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lt p3, v1, :cond_0

    .line 4310
    invoke-static {v0}, Lj$/time/ZoneId;->of(Ljava/lang/String;)Lj$/time/ZoneId;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj$/time/format/q;->m(Lj$/time/ZoneId;)V

    return p3

    .line 4315
    :cond_0
    invoke-interface {p1, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-eq v1, v2, :cond_4

    .line 4316
    invoke-interface {p1, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x5a

    invoke-virtual {p0, v1, v2}, Lj$/time/format/q;->a(CC)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 4321
    :cond_1
    invoke-virtual {p0}, Lj$/time/format/q;->c()Lj$/time/format/q;

    move-result-object v1

    .line 4322
    invoke-virtual {p4, v1, p1, p3}, Lj$/time/format/j;->q(Lj$/time/format/q;Ljava/lang/CharSequence;I)I

    move-result p1

    if-gez p1, :cond_3

    .line 4325
    :try_start_0
    sget-object p1, Lj$/time/format/j;->e:Lj$/time/format/j;

    if-ne p4, p1, :cond_2

    not-int p0, p2

    return p0

    .line 4328
    :cond_2
    invoke-static {v0}, Lj$/time/ZoneId;->of(Ljava/lang/String;)Lj$/time/ZoneId;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj$/time/format/q;->m(Lj$/time/ZoneId;)V

    return p3

    .line 4331
    :cond_3
    sget-object p3, Lj$/time/temporal/a;->OFFSET_SECONDS:Lj$/time/temporal/a;

    invoke-virtual {v1, p3}, Lj$/time/format/q;->i(Lj$/time/temporal/a;)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    long-to-int p3, p3

    .line 4332
    invoke-static {p3}, Lj$/time/ZoneOffset;->c0(I)Lj$/time/ZoneOffset;

    move-result-object p3

    .line 4333
    invoke-static {v0, p3}, Lj$/time/ZoneId;->U(Ljava/lang/String;Lj$/time/ZoneOffset;)Lj$/time/ZoneId;

    move-result-object p3

    invoke-virtual {p0, p3}, Lj$/time/format/q;->m(Lj$/time/ZoneId;)V
    :try_end_0
    .catch Lj$/time/c; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    not-int p0, p2

    return p0

    .line 4317
    :cond_4
    :goto_0
    invoke-static {v0}, Lj$/time/ZoneId;->of(Ljava/lang/String;)Lj$/time/ZoneId;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj$/time/format/q;->m(Lj$/time/ZoneId;)V

    return p3
.end method


# virtual methods
.method public final o(Lj$/time/format/t;Ljava/lang/StringBuilder;)Z
    .locals 1

    iget v0, p0, Lj$/time/format/n;->a:I

    packed-switch v0, :pswitch_data_0

    .line 4208
    iget-object v0, p0, Lj$/time/format/n;->b:Ljava/lang/Object;

    check-cast v0, Lj$/time/format/a;

    invoke-virtual {p1, v0}, Lj$/time/format/t;->f(Lj$/time/format/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/time/ZoneId;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 4212
    :cond_0
    invoke-virtual {p1}, Lj$/time/ZoneId;->n()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    :goto_0
    return p1

    .line 2606
    :pswitch_0
    iget-object p1, p0, Lj$/time/format/n;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Lj$/time/format/q;Ljava/lang/CharSequence;I)I
    .locals 7

    iget v0, p0, Lj$/time/format/n;->a:I

    packed-switch v0, :pswitch_data_0

    .line 4251
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p3, v0, :cond_10

    if-ne p3, v0, :cond_1

    :cond_0
    not-int p1, p3

    goto/16 :goto_5

    .line 4260
    :cond_1
    invoke-interface {p2, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x2b

    if-eq v1, v2, :cond_f

    const/16 v2, 0x2d

    if-ne v1, v2, :cond_2

    goto/16 :goto_4

    :cond_2
    add-int/lit8 v2, p3, 0x2

    if-lt v0, v2, :cond_6

    add-int/lit8 v3, p3, 0x1

    .line 4264
    invoke-interface {p2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x55

    .line 4265
    invoke-virtual {p1, v1, v4}, Lj$/time/format/q;->a(CC)Z

    move-result v4

    const/16 v5, 0x54

    if-eqz v4, :cond_4

    invoke-virtual {p1, v3, v5}, Lj$/time/format/q;->a(CC)Z

    move-result v4

    if-eqz v4, :cond_4

    add-int/lit8 v1, p3, 0x3

    if-lt v0, v1, :cond_3

    .line 4266
    invoke-interface {p2, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v3, 0x43

    invoke-virtual {p1, v0, v3}, Lj$/time/format/q;->a(CC)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 4267
    sget-object v0, Lj$/time/format/j;->f:Lj$/time/format/j;

    invoke-static {p1, p2, p3, v1, v0}, Lj$/time/format/n;->a(Lj$/time/format/q;Ljava/lang/CharSequence;IILj$/time/format/j;)I

    move-result p1

    goto/16 :goto_5

    .line 4269
    :cond_3
    sget-object v0, Lj$/time/format/j;->f:Lj$/time/format/j;

    invoke-static {p1, p2, p3, v2, v0}, Lj$/time/format/n;->a(Lj$/time/format/q;Ljava/lang/CharSequence;IILj$/time/format/j;)I

    move-result p1

    goto/16 :goto_5

    :cond_4
    const/16 v4, 0x47

    .line 4270
    invoke-virtual {p1, v1, v4}, Lj$/time/format/q;->a(CC)Z

    move-result v4

    if-eqz v4, :cond_6

    add-int/lit8 v4, p3, 0x3

    if-lt v0, v4, :cond_6

    const/16 v6, 0x4d

    .line 4271
    invoke-virtual {p1, v3, v6}, Lj$/time/format/q;->a(CC)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p2, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-virtual {p1, v2, v5}, Lj$/time/format/q;->a(CC)Z

    move-result v2

    if-eqz v2, :cond_6

    add-int/lit8 v1, p3, 0x4

    if-lt v0, v1, :cond_5

    .line 4272
    invoke-interface {p2, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v2, 0x30

    invoke-virtual {p1, v0, v2}, Lj$/time/format/q;->a(CC)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 4273
    const-string p2, "GMT0"

    invoke-static {p2}, Lj$/time/ZoneId;->of(Ljava/lang/String;)Lj$/time/ZoneId;

    move-result-object p2

    invoke-virtual {p1, p2}, Lj$/time/format/q;->m(Lj$/time/ZoneId;)V

    move p1, v1

    goto/16 :goto_5

    .line 4276
    :cond_5
    sget-object v0, Lj$/time/format/j;->f:Lj$/time/format/j;

    invoke-static {p1, p2, p3, v4, v0}, Lj$/time/format/n;->a(Lj$/time/format/q;Ljava/lang/CharSequence;IILj$/time/format/j;)I

    move-result p1

    goto/16 :goto_5

    .line 4224
    :cond_6
    invoke-static {}, Lj$/time/zone/j;->a()Ljava/util/Set;

    move-result-object v0

    .line 4225
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v2

    .line 4226
    invoke-virtual {p1}, Lj$/time/format/q;->j()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 4227
    sget-object v3, Lj$/time/format/n;->c:Ljava/util/AbstractMap$SimpleImmutableEntry;

    goto :goto_0

    :cond_7
    sget-object v3, Lj$/time/format/n;->d:Ljava/util/AbstractMap$SimpleImmutableEntry;

    :goto_0
    if-eqz v3, :cond_8

    .line 4228
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eq v4, v2, :cond_d

    .line 4229
    :cond_8
    monitor-enter p0

    .line 4230
    :try_start_0
    invoke-virtual {p1}, Lj$/time/format/q;->j()Z

    move-result v3

    if-eqz v3, :cond_9

    sget-object v3, Lj$/time/format/n;->c:Ljava/util/AbstractMap$SimpleImmutableEntry;

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_9
    sget-object v3, Lj$/time/format/n;->d:Ljava/util/AbstractMap$SimpleImmutableEntry;

    :goto_1
    if-eqz v3, :cond_a

    .line 4231
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eq v4, v2, :cond_c

    .line 4232
    :cond_a
    new-instance v3, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, p1}, Lj$/time/format/l;->e(Ljava/util/Set;Lj$/time/format/q;)Lj$/time/format/l;

    move-result-object v0

    invoke-direct {v3, v2, v0}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4233
    invoke-virtual {p1}, Lj$/time/format/q;->j()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 4234
    sput-object v3, Lj$/time/format/n;->c:Ljava/util/AbstractMap$SimpleImmutableEntry;

    goto :goto_2

    .line 4236
    :cond_b
    sput-object v3, Lj$/time/format/n;->d:Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 4239
    :cond_c
    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4241
    :cond_d
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/time/format/l;

    .line 4282
    new-instance v2, Ljava/text/ParsePosition;

    invoke-direct {v2, p3}, Ljava/text/ParsePosition;-><init>(I)V

    .line 4283
    invoke-virtual {v0, p2, v2}, Lj$/time/format/l;->c(Ljava/lang/CharSequence;Ljava/text/ParsePosition;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_e

    const/16 p2, 0x5a

    .line 4285
    invoke-virtual {p1, v1, p2}, Lj$/time/format/q;->a(CC)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 4286
    sget-object p2, Lj$/time/ZoneOffset;->UTC:Lj$/time/ZoneOffset;

    invoke-virtual {p1, p2}, Lj$/time/format/q;->m(Lj$/time/ZoneId;)V

    add-int/lit8 p1, p3, 0x1

    goto :goto_5

    .line 4291
    :cond_e
    invoke-static {p2}, Lj$/time/ZoneId;->of(Ljava/lang/String;)Lj$/time/ZoneId;

    move-result-object p2

    invoke-virtual {p1, p2}, Lj$/time/format/q;->m(Lj$/time/ZoneId;)V

    .line 4292
    invoke-virtual {v2}, Ljava/text/ParsePosition;->getIndex()I

    move-result p1

    goto :goto_5

    .line 4239
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 4262
    :cond_f
    :goto_4
    sget-object v0, Lj$/time/format/j;->e:Lj$/time/format/j;

    invoke-static {p1, p2, p3, p3, v0}, Lj$/time/format/n;->a(Lj$/time/format/q;Ljava/lang/CharSequence;IILj$/time/format/j;)I

    move-result p1

    :goto_5
    return p1

    .line 4253
    :cond_10
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 2612
    :pswitch_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p3, v0, :cond_12

    if-ltz p3, :cond_12

    .line 2616
    iget-object v0, p0, Lj$/time/format/n;->b:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v5, 0x0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-virtual/range {v1 .. v6}, Lj$/time/format/q;->r(Ljava/lang/CharSequence;ILjava/lang/CharSequence;II)Z

    move-result p1

    if-nez p1, :cond_11

    not-int p1, v3

    goto :goto_6

    .line 2619
    :cond_11
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v3

    :goto_6
    return p1

    .line 2614
    :cond_12
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lj$/time/format/n;->a:I

    packed-switch v0, :pswitch_data_0

    .line 4342
    const-string v0, "ZoneRegionId()"

    return-object v0

    .line 2624
    :pswitch_0
    const-string v0, "\'\'"

    iget-object v1, p0, Lj$/time/format/n;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "\'"

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 2625
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
