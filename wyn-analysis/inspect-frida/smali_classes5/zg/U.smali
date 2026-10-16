.class public abstract Lzg/U;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lzg/T;Ljava/lang/reflect/Method;)Lzg/q;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    .line 1
    new-instance v6, Lzg/O;

    invoke-direct {v6, v0, v1}, Lzg/O;-><init>(Lzg/T;Ljava/lang/reflect/Method;)V

    .line 2
    iget-object v7, v6, Lzg/O;->c:[Ljava/lang/annotation/Annotation;

    array-length v8, v7

    move v9, v4

    :goto_0
    iget-object v10, v6, Lzg/O;->b:Ljava/lang/reflect/Method;

    const-string v11, "HEAD"

    if-ge v9, v8, :cond_11

    aget-object v13, v7, v9

    .line 3
    instance-of v14, v13, LBg/b;

    if-eqz v14, :cond_0

    .line 4
    check-cast v13, LBg/b;

    invoke-interface {v13}, LBg/b;->value()Ljava/lang/String;

    move-result-object v10

    const-string v11, "DELETE"

    invoke-virtual {v6, v11, v10, v4}, Lzg/O;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_1
    move/from16 v18, v2

    goto/16 :goto_4

    .line 5
    :cond_0
    instance-of v14, v13, LBg/f;

    if-eqz v14, :cond_1

    .line 6
    check-cast v13, LBg/f;

    invoke-interface {v13}, LBg/f;->value()Ljava/lang/String;

    move-result-object v10

    const-string v11, "GET"

    invoke-virtual {v6, v11, v10, v4}, Lzg/O;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_1

    .line 7
    :cond_1
    instance-of v14, v13, LBg/g;

    if-eqz v14, :cond_2

    .line 8
    check-cast v13, LBg/g;

    invoke-interface {v13}, LBg/g;->value()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v11, v10, v4}, Lzg/O;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_1

    .line 9
    :cond_2
    instance-of v11, v13, LBg/n;

    if-eqz v11, :cond_3

    .line 10
    check-cast v13, LBg/n;

    invoke-interface {v13}, LBg/n;->value()Ljava/lang/String;

    move-result-object v10

    const-string v11, "PATCH"

    invoke-virtual {v6, v11, v10, v5}, Lzg/O;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_1

    .line 11
    :cond_3
    instance-of v11, v13, LBg/o;

    if-eqz v11, :cond_4

    .line 12
    check-cast v13, LBg/o;

    invoke-interface {v13}, LBg/o;->value()Ljava/lang/String;

    move-result-object v10

    const-string v11, "POST"

    invoke-virtual {v6, v11, v10, v5}, Lzg/O;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_1

    .line 13
    :cond_4
    instance-of v11, v13, LBg/p;

    if-eqz v11, :cond_5

    .line 14
    check-cast v13, LBg/p;

    invoke-interface {v13}, LBg/p;->value()Ljava/lang/String;

    move-result-object v10

    const-string v11, "PUT"

    invoke-virtual {v6, v11, v10, v5}, Lzg/O;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_1

    .line 15
    :cond_5
    instance-of v11, v13, LBg/m;

    if-eqz v11, :cond_6

    .line 16
    check-cast v13, LBg/m;

    invoke-interface {v13}, LBg/m;->value()Ljava/lang/String;

    move-result-object v10

    const-string v11, "OPTIONS"

    invoke-virtual {v6, v11, v10, v4}, Lzg/O;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_1

    .line 17
    :cond_6
    instance-of v11, v13, LBg/h;

    if-eqz v11, :cond_7

    .line 18
    check-cast v13, LBg/h;

    .line 19
    invoke-interface {v13}, LBg/h;->method()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v13}, LBg/h;->path()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v13}, LBg/h;->hasBody()Z

    move-result v12

    invoke-virtual {v6, v10, v11, v12}, Lzg/O;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_1

    .line 20
    :cond_7
    instance-of v11, v13, LBg/k;

    if-eqz v11, :cond_c

    .line 21
    check-cast v13, LBg/k;

    invoke-interface {v13}, LBg/k;->value()[Ljava/lang/String;

    move-result-object v11

    .line 22
    array-length v13, v11

    if-eqz v13, :cond_b

    .line 23
    new-instance v13, Lokhttp3/Headers$Builder;

    invoke-direct {v13}, Lokhttp3/Headers$Builder;-><init>()V

    .line 24
    array-length v14, v11

    move v15, v4

    :goto_2
    if-ge v15, v14, :cond_a

    aget-object v3, v11, v15

    const/16 v12, 0x3a

    .line 25
    invoke-virtual {v3, v12}, Ljava/lang/String;->indexOf(I)I

    move-result v12

    if-eq v12, v2, :cond_9

    if-eqz v12, :cond_9

    .line 26
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v17

    move/from16 v18, v2

    add-int/lit8 v2, v17, -0x1

    if-eq v12, v2, :cond_9

    .line 27
    invoke-virtual {v3, v4, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    add-int/2addr v12, v5

    .line 28
    invoke-virtual {v3, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 29
    const-string v12, "Content-Type"

    invoke-virtual {v12, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_8

    .line 30
    :try_start_0
    sget-object v2, Lokhttp3/MediaType;->d:Lokhttp3/MediaType$Companion;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v2

    .line 31
    iput-object v2, v6, Lzg/O;->t:Lokhttp3/MediaType;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 32
    const-string v1, "Malformed content type: %s"

    new-array v2, v5, [Ljava/lang/Object;

    aput-object v3, v2, v4

    invoke-static {v10, v0, v1, v2}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 33
    :cond_8
    invoke-virtual {v13, v2, v3}, Lokhttp3/Headers$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    add-int/2addr v15, v5

    move/from16 v2, v18

    goto :goto_2

    .line 34
    :cond_9
    new-array v0, v5, [Ljava/lang/Object;

    aput-object v3, v0, v4

    .line 35
    const-string v1, "@Headers value must be in the form \"Name: Value\". Found: \"%s\""

    const/4 v2, 0x0

    invoke-static {v10, v2, v1, v0}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 36
    throw v0

    :cond_a
    move/from16 v18, v2

    .line 37
    invoke-virtual {v13}, Lokhttp3/Headers$Builder;->d()Lokhttp3/Headers;

    move-result-object v2

    .line 38
    iput-object v2, v6, Lzg/O;->s:Lokhttp3/Headers;

    goto :goto_4

    :cond_b
    const/4 v2, 0x0

    .line 39
    new-array v0, v4, [Ljava/lang/Object;

    .line 40
    const-string v1, "@Headers annotation is empty."

    invoke-static {v10, v2, v1, v0}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 41
    throw v0

    :cond_c
    move/from16 v18, v2

    .line 42
    instance-of v2, v13, LBg/l;

    const-string v3, "Only one encoding annotation is allowed."

    if-eqz v2, :cond_e

    .line 43
    iget-boolean v2, v6, Lzg/O;->p:Z

    if-nez v2, :cond_d

    .line 44
    iput-boolean v5, v6, Lzg/O;->q:Z

    goto :goto_4

    .line 45
    :cond_d
    new-array v0, v4, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 46
    invoke-static {v10, v2, v3, v0}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 47
    throw v0

    :cond_e
    const/4 v2, 0x0

    .line 48
    instance-of v11, v13, LBg/e;

    if-eqz v11, :cond_10

    .line 49
    iget-boolean v11, v6, Lzg/O;->q:Z

    if-nez v11, :cond_f

    .line 50
    iput-boolean v5, v6, Lzg/O;->p:Z

    goto :goto_4

    .line 51
    :cond_f
    new-array v0, v4, [Ljava/lang/Object;

    .line 52
    invoke-static {v10, v2, v3, v0}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 53
    throw v0

    :cond_10
    :goto_4
    add-int/2addr v9, v5

    move/from16 v2, v18

    goto/16 :goto_0

    :cond_11
    move/from16 v18, v2

    .line 54
    iget-object v2, v6, Lzg/O;->n:Ljava/lang/String;

    if-eqz v2, :cond_7d

    .line 55
    iget-boolean v2, v6, Lzg/O;->o:Z

    if-nez v2, :cond_14

    .line 56
    iget-boolean v2, v6, Lzg/O;->q:Z

    if-nez v2, :cond_13

    .line 57
    iget-boolean v2, v6, Lzg/O;->p:Z

    if-nez v2, :cond_12

    goto :goto_5

    .line 58
    :cond_12
    new-array v0, v4, [Ljava/lang/Object;

    .line 59
    const-string v1, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."

    const/4 v2, 0x0

    invoke-static {v10, v2, v1, v0}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 60
    throw v0

    :cond_13
    const/4 v2, 0x0

    .line 61
    new-array v0, v4, [Ljava/lang/Object;

    .line 62
    const-string v1, "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."

    invoke-static {v10, v2, v1, v0}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 63
    throw v0

    .line 64
    :cond_14
    :goto_5
    iget-object v2, v6, Lzg/O;->d:[[Ljava/lang/annotation/Annotation;

    array-length v3, v2

    .line 65
    new-array v8, v3, [Lzg/a0;

    iput-object v8, v6, Lzg/O;->v:[Lzg/a0;

    add-int/lit8 v8, v3, -0x1

    move v9, v4

    :goto_6
    if-ge v9, v3, :cond_68

    .line 66
    iget-object v12, v6, Lzg/O;->v:[Lzg/a0;

    iget-object v13, v6, Lzg/O;->e:[Ljava/lang/reflect/Type;

    aget-object v13, v13, v9

    aget-object v14, v2, v9

    if-ne v9, v8, :cond_15

    move v15, v5

    goto :goto_7

    :cond_15
    move v15, v4

    :goto_7
    if-eqz v14, :cond_65

    .line 67
    array-length v4, v14

    const/4 v5, 0x0

    const/16 v19, 0x0

    :goto_8
    move-object/from16 v21, v2

    if-ge v5, v4, :cond_64

    aget-object v2, v14, v5

    move/from16 v22, v3

    .line 68
    instance-of v3, v2, LBg/y;

    move/from16 v23, v3

    const-string v3, "@Path parameters may not be used with @Url."

    move/from16 v24, v4

    const-class v4, Ljava/lang/String;

    if-eqz v23, :cond_1e

    .line 69
    invoke-virtual {v6, v9, v13}, Lzg/O;->c(ILjava/lang/reflect/Type;)V

    .line 70
    iget-boolean v2, v6, Lzg/O;->m:Z

    if-nez v2, :cond_1d

    .line 71
    iget-boolean v2, v6, Lzg/O;->i:Z

    if-nez v2, :cond_1c

    .line 72
    iget-boolean v2, v6, Lzg/O;->j:Z

    if-nez v2, :cond_1b

    .line 73
    iget-boolean v2, v6, Lzg/O;->k:Z

    if-nez v2, :cond_1a

    .line 74
    iget-boolean v2, v6, Lzg/O;->l:Z

    if-nez v2, :cond_19

    .line 75
    iget-object v2, v6, Lzg/O;->r:Ljava/lang/String;

    if-nez v2, :cond_18

    const/4 v2, 0x1

    .line 76
    iput-boolean v2, v6, Lzg/O;->m:Z

    .line 77
    const-class v2, Lokhttp3/HttpUrl;

    if-eq v13, v2, :cond_16

    if-eq v13, v4, :cond_16

    const-class v2, Ljava/net/URI;

    if-eq v13, v2, :cond_16

    instance-of v2, v13, Ljava/lang/Class;

    if-eqz v2, :cond_17

    move-object v2, v13

    check-cast v2, Ljava/lang/Class;

    .line 78
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "android.net.Uri"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    :cond_16
    const/4 v2, 0x0

    goto :goto_9

    .line 79
    :cond_17
    const-string v0, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."

    const/4 v2, 0x0

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 80
    :goto_9
    new-instance v3, Lzg/E;

    const/4 v4, 0x2

    invoke-direct {v3, v10, v9, v4}, Lzg/E;-><init>(Ljava/lang/reflect/Method;II)V

    move-object v1, v3

    move/from16 v16, v4

    move/from16 v23, v5

    move/from16 v26, v8

    move-object/from16 v28, v11

    move-object/from16 v27, v12

    move/from16 v25, v15

    goto/16 :goto_10

    :cond_18
    const/4 v2, 0x0

    .line 81
    iget-object v0, v6, Lzg/O;->n:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const-string v0, "@Url cannot be used with @%s URL"

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_19
    const/4 v2, 0x0

    .line 82
    const-string v0, "A @Url parameter must not come after a @QueryMap."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1a
    const/4 v2, 0x0

    .line 83
    const-string v0, "A @Url parameter must not come after a @QueryName."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1b
    const/4 v2, 0x0

    .line 84
    const-string v0, "A @Url parameter must not come after a @Query."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1c
    const/4 v2, 0x0

    .line 85
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v10, v9, v3, v0}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1d
    const/4 v2, 0x0

    .line 86
    const-string v0, "Multiple @Url method annotations found."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1e
    move/from16 v23, v5

    .line 87
    instance-of v5, v2, LBg/s;

    move/from16 v25, v5

    iget-object v5, v6, Lzg/O;->a:Lzg/T;

    if-eqz v25, :cond_26

    .line 88
    invoke-virtual {v6, v9, v13}, Lzg/O;->c(ILjava/lang/reflect/Type;)V

    .line 89
    iget-boolean v4, v6, Lzg/O;->j:Z

    if-nez v4, :cond_25

    .line 90
    iget-boolean v4, v6, Lzg/O;->k:Z

    if-nez v4, :cond_24

    .line 91
    iget-boolean v4, v6, Lzg/O;->l:Z

    if-nez v4, :cond_23

    .line 92
    iget-boolean v4, v6, Lzg/O;->m:Z

    if-nez v4, :cond_22

    .line 93
    iget-object v3, v6, Lzg/O;->r:Ljava/lang/String;

    if-eqz v3, :cond_21

    const/4 v3, 0x1

    .line 94
    iput-boolean v3, v6, Lzg/O;->i:Z

    .line 95
    check-cast v2, LBg/s;

    .line 96
    invoke-interface {v2}, LBg/s;->value()Ljava/lang/String;

    move-result-object v3

    .line 97
    sget-object v4, Lzg/O;->y:Ljava/util/regex/Pattern;

    invoke-virtual {v4, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    move-result v4

    if-eqz v4, :cond_20

    .line 98
    iget-object v4, v6, Lzg/O;->u:Ljava/util/LinkedHashSet;

    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1f

    .line 99
    invoke-virtual {v5, v13, v14}, Lzg/T;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 100
    new-instance v4, Lzg/G;

    invoke-interface {v2}, LBg/s;->encoded()Z

    move-result v2

    invoke-direct {v4, v10, v9, v3, v2}, Lzg/G;-><init>(Ljava/lang/reflect/Method;ILjava/lang/String;Z)V

    move-object v1, v4

    move/from16 v26, v8

    move-object/from16 v28, v11

    move-object/from16 v27, v12

    move/from16 v25, v15

    const/16 v16, 0x2

    goto/16 :goto_10

    .line 101
    :cond_1f
    iget-object v0, v6, Lzg/O;->r:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const-string v0, "URL \"%s\" does not contain \"{%s}\"."

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_20
    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v4, 0x1

    .line 102
    sget-object v0, Lzg/O;->x:Ljava/util/regex/Pattern;

    .line 103
    invoke-virtual {v0}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v2

    aput-object v3, v1, v4

    .line 104
    const-string v0, "@Path parameter name must match %s. Found: %s"

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_21
    const/4 v2, 0x0

    const/4 v4, 0x1

    .line 105
    iget-object v0, v6, Lzg/O;->n:Ljava/lang/String;

    new-array v1, v4, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const-string v0, "@Path can only be used with relative url on @%s"

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_22
    const/4 v2, 0x0

    .line 106
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v10, v9, v3, v0}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_23
    const/4 v2, 0x0

    .line 107
    const-string v0, "A @Path parameter must not come after a @QueryMap."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_24
    const/4 v2, 0x0

    .line 108
    const-string v0, "A @Path parameter must not come after a @QueryName."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_25
    const/4 v2, 0x0

    .line 109
    const-string v0, "A @Path parameter must not come after a @Query."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_26
    const/16 v16, 0x2

    .line 110
    instance-of v3, v2, LBg/t;

    move/from16 v25, v3

    const-string v3, "<String>)"

    move/from16 v26, v8

    const-string v8, " must include generic type (e.g., "

    move-object/from16 v27, v12

    const-class v12, Ljava/lang/Iterable;

    if-eqz v25, :cond_2a

    .line 111
    invoke-virtual {v6, v9, v13}, Lzg/O;->c(ILjava/lang/reflect/Type;)V

    .line 112
    check-cast v2, LBg/t;

    .line 113
    invoke-interface {v2}, LBg/t;->value()Ljava/lang/String;

    move-result-object v4

    .line 114
    invoke-interface {v2}, LBg/t;->encoded()Z

    move-result v2

    move/from16 v25, v15

    .line 115
    invoke-static {v13}, Lzg/a0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v15

    const/4 v1, 0x1

    .line 116
    iput-boolean v1, v6, Lzg/O;->j:Z

    .line 117
    invoke-virtual {v12, v15}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v12

    if-eqz v12, :cond_28

    .line 118
    instance-of v12, v13, Ljava/lang/reflect/ParameterizedType;

    if-eqz v12, :cond_27

    .line 119
    move-object v3, v13

    check-cast v3, Ljava/lang/reflect/ParameterizedType;

    const/4 v12, 0x0

    .line 120
    invoke-static {v12, v3}, Lzg/a0;->e(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v3

    .line 121
    invoke-virtual {v5, v3, v14}, Lzg/T;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 122
    new-instance v3, Lzg/B;

    invoke-direct {v3, v1, v4, v2}, Lzg/B;-><init>(ILjava/lang/String;Z)V

    .line 123
    new-instance v1, Lzg/z;

    invoke-direct {v1, v3, v12}, Lzg/z;-><init>(Lzg/a0;I)V

    :goto_a
    move-object/from16 v28, v11

    goto/16 :goto_10

    :cond_27
    const/4 v12, 0x0

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    invoke-virtual {v15}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    invoke-virtual {v15}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v12, [Ljava/lang/Object;

    .line 127
    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 128
    :cond_28
    invoke-virtual {v15}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_29

    .line 129
    invoke-virtual {v15}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lzg/O;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 130
    invoke-virtual {v5, v1, v14}, Lzg/T;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 131
    new-instance v1, Lzg/B;

    const/4 v15, 0x1

    invoke-direct {v1, v15, v4, v2}, Lzg/B;-><init>(ILjava/lang/String;Z)V

    .line 132
    new-instance v2, Lzg/z;

    invoke-direct {v2, v1, v15}, Lzg/z;-><init>(Lzg/a0;I)V

    :goto_b
    move-object v1, v2

    goto :goto_a

    :cond_29
    const/4 v15, 0x1

    .line 133
    invoke-virtual {v5, v13, v14}, Lzg/T;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 134
    new-instance v1, Lzg/B;

    invoke-direct {v1, v15, v4, v2}, Lzg/B;-><init>(ILjava/lang/String;Z)V

    goto :goto_a

    :cond_2a
    move/from16 v25, v15

    const/4 v15, 0x1

    .line 135
    instance-of v1, v2, LBg/v;

    if-eqz v1, :cond_2e

    .line 136
    invoke-virtual {v6, v9, v13}, Lzg/O;->c(ILjava/lang/reflect/Type;)V

    .line 137
    check-cast v2, LBg/v;

    .line 138
    invoke-interface {v2}, LBg/v;->encoded()Z

    move-result v1

    .line 139
    invoke-static {v13}, Lzg/a0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    .line 140
    iput-boolean v15, v6, Lzg/O;->k:Z

    .line 141
    invoke-virtual {v12, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_2c

    .line 142
    instance-of v4, v13, Ljava/lang/reflect/ParameterizedType;

    if-eqz v4, :cond_2b

    .line 143
    move-object v2, v13

    check-cast v2, Ljava/lang/reflect/ParameterizedType;

    const/4 v12, 0x0

    .line 144
    invoke-static {v12, v2}, Lzg/a0;->e(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v2

    .line 145
    invoke-virtual {v5, v2, v14}, Lzg/T;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 146
    new-instance v2, Lzg/H;

    invoke-direct {v2, v1}, Lzg/H;-><init>(Z)V

    .line 147
    new-instance v1, Lzg/z;

    invoke-direct {v1, v2, v12}, Lzg/z;-><init>(Lzg/a0;I)V

    goto/16 :goto_a

    :cond_2b
    const/4 v12, 0x0

    .line 148
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v12, [Ljava/lang/Object;

    .line 151
    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 152
    :cond_2c
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result v3

    if-eqz v3, :cond_2d

    .line 153
    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Lzg/O;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2

    .line 154
    invoke-virtual {v5, v2, v14}, Lzg/T;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 155
    new-instance v2, Lzg/H;

    invoke-direct {v2, v1}, Lzg/H;-><init>(Z)V

    .line 156
    new-instance v1, Lzg/z;

    const/4 v15, 0x1

    invoke-direct {v1, v2, v15}, Lzg/z;-><init>(Lzg/a0;I)V

    goto/16 :goto_a

    .line 157
    :cond_2d
    invoke-virtual {v5, v13, v14}, Lzg/T;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 158
    new-instance v2, Lzg/H;

    invoke-direct {v2, v1}, Lzg/H;-><init>(Z)V

    goto/16 :goto_b

    .line 159
    :cond_2e
    instance-of v1, v2, LBg/u;

    const-string v15, "Map must include generic types (e.g., Map<String, String>)"

    move/from16 v28, v1

    const-class v1, Ljava/util/Map;

    if-eqz v28, :cond_32

    .line 160
    invoke-virtual {v6, v9, v13}, Lzg/O;->c(ILjava/lang/reflect/Type;)V

    .line 161
    invoke-static {v13}, Lzg/a0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v3

    const/4 v8, 0x1

    .line 162
    iput-boolean v8, v6, Lzg/O;->l:Z

    .line 163
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_31

    .line 164
    invoke-static {v13, v3}, Lzg/a0;->g(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v1

    .line 165
    instance-of v3, v1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_30

    .line 166
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    const/4 v12, 0x0

    .line 167
    invoke-static {v12, v1}, Lzg/a0;->e(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v3

    if-ne v4, v3, :cond_2f

    .line 168
    invoke-static {v8, v1}, Lzg/a0;->e(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v1

    .line 169
    invoke-virtual {v5, v1, v14}, Lzg/T;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 170
    new-instance v1, Lzg/C;

    check-cast v2, LBg/u;

    .line 171
    invoke-interface {v2}, LBg/u;->encoded()Z

    move-result v2

    invoke-direct {v1, v10, v9, v2, v8}, Lzg/C;-><init>(Ljava/lang/reflect/Method;IZI)V

    goto/16 :goto_a

    .line 172
    :cond_2f
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "@QueryMap keys must be of type String: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v12, 0x0

    new-array v1, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_30
    const/4 v12, 0x0

    .line 173
    new-array v0, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v15, v0}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_31
    const/4 v12, 0x0

    .line 174
    const-string v0, "@QueryMap parameter type must be Map."

    new-array v1, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_32
    move-object/from16 v28, v11

    .line 175
    instance-of v11, v2, LBg/i;

    if-eqz v11, :cond_36

    .line 176
    invoke-virtual {v6, v9, v13}, Lzg/O;->c(ILjava/lang/reflect/Type;)V

    .line 177
    check-cast v2, LBg/i;

    .line 178
    invoke-interface {v2}, LBg/i;->value()Ljava/lang/String;

    move-result-object v1

    .line 179
    invoke-static {v13}, Lzg/a0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    .line 180
    invoke-virtual {v12, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_34

    .line 181
    instance-of v4, v13, Ljava/lang/reflect/ParameterizedType;

    if-eqz v4, :cond_33

    .line 182
    move-object v2, v13

    check-cast v2, Ljava/lang/reflect/ParameterizedType;

    const/4 v12, 0x0

    .line 183
    invoke-static {v12, v2}, Lzg/a0;->e(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v2

    .line 184
    invoke-virtual {v5, v2, v14}, Lzg/T;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 185
    new-instance v2, Lzg/D;

    invoke-direct {v2, v1}, Lzg/D;-><init>(Ljava/lang/String;)V

    .line 186
    new-instance v1, Lzg/z;

    invoke-direct {v1, v2, v12}, Lzg/z;-><init>(Lzg/a0;I)V

    goto/16 :goto_10

    :cond_33
    const/4 v12, 0x0

    .line 187
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 188
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v12, [Ljava/lang/Object;

    .line 190
    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 191
    :cond_34
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result v3

    if-eqz v3, :cond_35

    .line 192
    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Lzg/O;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2

    .line 193
    invoke-virtual {v5, v2, v14}, Lzg/T;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 194
    new-instance v2, Lzg/D;

    invoke-direct {v2, v1}, Lzg/D;-><init>(Ljava/lang/String;)V

    .line 195
    new-instance v1, Lzg/z;

    const/4 v11, 0x1

    invoke-direct {v1, v2, v11}, Lzg/z;-><init>(Lzg/a0;I)V

    goto/16 :goto_10

    :cond_35
    const/4 v11, 0x1

    .line 196
    invoke-virtual {v5, v13, v14}, Lzg/T;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 197
    new-instance v2, Lzg/D;

    invoke-direct {v2, v1}, Lzg/D;-><init>(Ljava/lang/String;)V

    :goto_c
    move-object v1, v2

    goto/16 :goto_10

    .line 198
    :cond_36
    instance-of v11, v2, LBg/j;

    if-eqz v11, :cond_3b

    .line 199
    const-class v2, Lokhttp3/Headers;

    if-ne v13, v2, :cond_37

    .line 200
    new-instance v1, Lzg/E;

    const/4 v15, 0x1

    invoke-direct {v1, v10, v9, v15}, Lzg/E;-><init>(Ljava/lang/reflect/Method;II)V

    goto/16 :goto_10

    .line 201
    :cond_37
    invoke-virtual {v6, v9, v13}, Lzg/O;->c(ILjava/lang/reflect/Type;)V

    .line 202
    invoke-static {v13}, Lzg/a0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    .line 203
    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_3a

    .line 204
    invoke-static {v13, v2}, Lzg/a0;->g(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v1

    .line 205
    instance-of v2, v1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_39

    .line 206
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    const/4 v12, 0x0

    .line 207
    invoke-static {v12, v1}, Lzg/a0;->e(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v2

    if-ne v4, v2, :cond_38

    const/4 v15, 0x1

    .line 208
    invoke-static {v15, v1}, Lzg/a0;->e(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v1

    .line 209
    invoke-virtual {v5, v1, v14}, Lzg/T;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 210
    new-instance v1, Lzg/E;

    invoke-direct {v1, v10, v9, v12}, Lzg/E;-><init>(Ljava/lang/reflect/Method;II)V

    goto/16 :goto_10

    .line 211
    :cond_38
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "@HeaderMap keys must be of type String: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_39
    const/4 v12, 0x0

    .line 212
    new-array v0, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v15, v0}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_3a
    const/4 v12, 0x0

    .line 213
    const-string v0, "@HeaderMap parameter type must be Map."

    new-array v1, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 214
    :cond_3b
    instance-of v11, v2, LBg/c;

    if-eqz v11, :cond_40

    .line 215
    invoke-virtual {v6, v9, v13}, Lzg/O;->c(ILjava/lang/reflect/Type;)V

    .line 216
    iget-boolean v1, v6, Lzg/O;->p:Z

    if-eqz v1, :cond_3f

    .line 217
    check-cast v2, LBg/c;

    .line 218
    invoke-interface {v2}, LBg/c;->value()Ljava/lang/String;

    move-result-object v1

    .line 219
    invoke-interface {v2}, LBg/c;->encoded()Z

    move-result v2

    const/4 v15, 0x1

    .line 220
    iput-boolean v15, v6, Lzg/O;->f:Z

    .line 221
    invoke-static {v13}, Lzg/a0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v4

    .line 222
    invoke-virtual {v12, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_3d

    .line 223
    instance-of v11, v13, Ljava/lang/reflect/ParameterizedType;

    if-eqz v11, :cond_3c

    .line 224
    move-object v3, v13

    check-cast v3, Ljava/lang/reflect/ParameterizedType;

    const/4 v12, 0x0

    .line 225
    invoke-static {v12, v3}, Lzg/a0;->e(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v3

    .line 226
    invoke-virtual {v5, v3, v14}, Lzg/T;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 227
    new-instance v3, Lzg/B;

    invoke-direct {v3, v12, v1, v2}, Lzg/B;-><init>(ILjava/lang/String;Z)V

    .line 228
    new-instance v1, Lzg/z;

    invoke-direct {v1, v3, v12}, Lzg/z;-><init>(Lzg/a0;I)V

    goto/16 :goto_10

    :cond_3c
    const/4 v12, 0x0

    .line 229
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 230
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v12, [Ljava/lang/Object;

    .line 232
    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_3d
    const/4 v12, 0x0

    .line 233
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    move-result v3

    if-eqz v3, :cond_3e

    .line 234
    invoke-virtual {v4}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Lzg/O;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v3

    .line 235
    invoke-virtual {v5, v3, v14}, Lzg/T;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 236
    new-instance v3, Lzg/B;

    invoke-direct {v3, v12, v1, v2}, Lzg/B;-><init>(ILjava/lang/String;Z)V

    .line 237
    new-instance v1, Lzg/z;

    const/4 v15, 0x1

    invoke-direct {v1, v3, v15}, Lzg/z;-><init>(Lzg/a0;I)V

    goto/16 :goto_10

    .line 238
    :cond_3e
    invoke-virtual {v5, v13, v14}, Lzg/T;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 239
    new-instance v3, Lzg/B;

    invoke-direct {v3, v12, v1, v2}, Lzg/B;-><init>(ILjava/lang/String;Z)V

    move-object v1, v3

    goto/16 :goto_10

    :cond_3f
    const/4 v12, 0x0

    .line 240
    const-string v0, "@Field parameters can only be used with form encoding."

    new-array v1, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 241
    :cond_40
    instance-of v11, v2, LBg/d;

    if-eqz v11, :cond_45

    .line 242
    invoke-virtual {v6, v9, v13}, Lzg/O;->c(ILjava/lang/reflect/Type;)V

    .line 243
    iget-boolean v3, v6, Lzg/O;->p:Z

    if-eqz v3, :cond_44

    .line 244
    invoke-static {v13}, Lzg/a0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v3

    .line 245
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_43

    .line 246
    invoke-static {v13, v3}, Lzg/a0;->g(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v1

    .line 247
    instance-of v3, v1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_42

    .line 248
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    const/4 v12, 0x0

    .line 249
    invoke-static {v12, v1}, Lzg/a0;->e(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v3

    if-ne v4, v3, :cond_41

    const/4 v15, 0x1

    .line 250
    invoke-static {v15, v1}, Lzg/a0;->e(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v1

    .line 251
    invoke-virtual {v5, v1, v14}, Lzg/T;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V

    .line 252
    iput-boolean v15, v6, Lzg/O;->f:Z

    .line 253
    new-instance v1, Lzg/C;

    check-cast v2, LBg/d;

    .line 254
    invoke-interface {v2}, LBg/d;->encoded()Z

    move-result v2

    invoke-direct {v1, v10, v9, v2, v12}, Lzg/C;-><init>(Ljava/lang/reflect/Method;IZI)V

    goto/16 :goto_10

    .line 255
    :cond_41
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "@FieldMap keys must be of type String: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_42
    const/4 v12, 0x0

    .line 256
    new-array v0, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v15, v0}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_43
    const/4 v12, 0x0

    .line 257
    const-string v0, "@FieldMap parameter type must be Map."

    new-array v1, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_44
    const/4 v12, 0x0

    .line 258
    const-string v0, "@FieldMap parameters can only be used with form encoding."

    new-array v1, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 259
    :cond_45
    instance-of v11, v2, LBg/q;

    move/from16 v29, v11

    const-class v11, Lokhttp3/MultipartBody$Part;

    if-eqz v29, :cond_54

    .line 260
    invoke-virtual {v6, v9, v13}, Lzg/O;->c(ILjava/lang/reflect/Type;)V

    .line 261
    iget-boolean v1, v6, Lzg/O;->q:Z

    if-eqz v1, :cond_53

    .line 262
    check-cast v2, LBg/q;

    const/4 v15, 0x1

    .line 263
    iput-boolean v15, v6, Lzg/O;->g:Z

    .line 264
    invoke-interface {v2}, LBg/q;->value()Ljava/lang/String;

    move-result-object v1

    .line 265
    invoke-static {v13}, Lzg/a0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v4

    .line 266
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_4c

    .line 267
    invoke-virtual {v12, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    sget-object v2, Lzg/I;->b:Lzg/I;

    const-string v5, "@Part annotation must supply a name or use MultipartBody.Part parameter type."

    if-eqz v1, :cond_48

    .line 268
    instance-of v1, v13, Ljava/lang/reflect/ParameterizedType;

    if-eqz v1, :cond_47

    .line 269
    move-object v1, v13

    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    const/4 v12, 0x0

    .line 270
    invoke-static {v12, v1}, Lzg/a0;->e(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v1

    .line 271
    invoke-static {v1}, Lzg/a0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v11, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_46

    .line 272
    new-instance v1, Lzg/z;

    invoke-direct {v1, v2, v12}, Lzg/z;-><init>(Lzg/a0;I)V

    goto/16 :goto_10

    .line 273
    :cond_46
    new-array v0, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v5, v0}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 274
    :cond_47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 275
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v12, 0x0

    new-array v1, v12, [Ljava/lang/Object;

    .line 277
    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_48
    const/4 v12, 0x0

    .line 278
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_4a

    .line 279
    invoke-virtual {v4}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    .line 280
    invoke-virtual {v11, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_49

    .line 281
    new-instance v1, Lzg/z;

    const/4 v15, 0x1

    invoke-direct {v1, v2, v15}, Lzg/z;-><init>(Lzg/a0;I)V

    goto/16 :goto_10

    .line 282
    :cond_49
    new-array v0, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v5, v0}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 283
    :cond_4a
    invoke-virtual {v11, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_4b

    goto/16 :goto_c

    .line 284
    :cond_4b
    new-array v0, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v5, v0}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 285
    :cond_4c
    const-string v15, "form-data; name=\""

    move-object/from16 v29, v2

    const-string v2, "\""

    .line 286
    invoke-static {v15, v1, v2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 287
    invoke-interface/range {v29 .. v29}, LBg/q;->encoding()Ljava/lang/String;

    move-result-object v2

    const-string v15, "Content-Disposition"

    const-string v0, "Content-Transfer-Encoding"

    filled-new-array {v15, v1, v0, v2}, [Ljava/lang/String;

    move-result-object v0

    .line 288
    sget-object v1, Lokhttp3/Headers;->b:Lokhttp3/Headers$Companion;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lokhttp3/Headers$Companion;->c([Ljava/lang/String;)Lokhttp3/Headers;

    move-result-object v0

    .line 289
    invoke-virtual {v12, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    const-string v2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."

    if-eqz v1, :cond_4f

    .line 290
    instance-of v1, v13, Ljava/lang/reflect/ParameterizedType;

    if-eqz v1, :cond_4e

    .line 291
    move-object v1, v13

    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    const/4 v12, 0x0

    .line 292
    invoke-static {v12, v1}, Lzg/a0;->e(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v1

    .line 293
    invoke-static {v1}, Lzg/a0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_4d

    .line 294
    invoke-virtual {v5, v1, v14, v7}, Lzg/T;->b(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lzg/j;

    move-result-object v1

    .line 295
    new-instance v2, Lzg/F;

    invoke-direct {v2, v10, v9, v0, v1}, Lzg/F;-><init>(Ljava/lang/reflect/Method;ILokhttp3/Headers;Lzg/j;)V

    .line 296
    new-instance v0, Lzg/z;

    invoke-direct {v0, v2, v12}, Lzg/z;-><init>(Lzg/a0;I)V

    :goto_d
    move-object v1, v0

    goto/16 :goto_10

    .line 297
    :cond_4d
    new-array v0, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v2, v0}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 298
    :cond_4e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 299
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v12, 0x0

    new-array v1, v12, [Ljava/lang/Object;

    .line 301
    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 302
    :cond_4f
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_51

    .line 303
    invoke-virtual {v4}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lzg/O;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 304
    invoke-virtual {v11, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_50

    .line 305
    invoke-virtual {v5, v1, v14, v7}, Lzg/T;->b(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lzg/j;

    move-result-object v1

    .line 306
    new-instance v2, Lzg/F;

    invoke-direct {v2, v10, v9, v0, v1}, Lzg/F;-><init>(Ljava/lang/reflect/Method;ILokhttp3/Headers;Lzg/j;)V

    .line 307
    new-instance v0, Lzg/z;

    const/4 v15, 0x1

    invoke-direct {v0, v2, v15}, Lzg/z;-><init>(Lzg/a0;I)V

    goto :goto_d

    :cond_50
    const/4 v12, 0x0

    .line 308
    new-array v0, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v2, v0}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_51
    const/4 v12, 0x0

    .line 309
    invoke-virtual {v11, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_52

    .line 310
    invoke-virtual {v5, v13, v14, v7}, Lzg/T;->b(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lzg/j;

    move-result-object v1

    .line 311
    new-instance v2, Lzg/F;

    invoke-direct {v2, v10, v9, v0, v1}, Lzg/F;-><init>(Ljava/lang/reflect/Method;ILokhttp3/Headers;Lzg/j;)V

    goto/16 :goto_c

    .line 312
    :cond_52
    new-array v0, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v2, v0}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_53
    const/4 v12, 0x0

    .line 313
    const-string v0, "@Part parameters can only be used with multipart encoding."

    new-array v1, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 314
    :cond_54
    instance-of v0, v2, LBg/r;

    if-eqz v0, :cond_5a

    .line 315
    invoke-virtual {v6, v9, v13}, Lzg/O;->c(ILjava/lang/reflect/Type;)V

    .line 316
    iget-boolean v0, v6, Lzg/O;->q:Z

    if-eqz v0, :cond_59

    const/4 v3, 0x1

    .line 317
    iput-boolean v3, v6, Lzg/O;->g:Z

    .line 318
    invoke-static {v13}, Lzg/a0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    .line 319
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_58

    .line 320
    invoke-static {v13, v0}, Lzg/a0;->g(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    .line 321
    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v1, :cond_57

    .line 322
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    const/4 v12, 0x0

    .line 323
    invoke-static {v12, v0}, Lzg/a0;->e(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v1

    if-ne v4, v1, :cond_56

    .line 324
    invoke-static {v3, v0}, Lzg/a0;->e(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    .line 325
    invoke-static {v0}, Lzg/a0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v11, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_55

    .line 326
    invoke-virtual {v5, v0, v14, v7}, Lzg/T;->b(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lzg/j;

    move-result-object v0

    .line 327
    check-cast v2, LBg/r;

    .line 328
    new-instance v1, Lzg/F;

    invoke-interface {v2}, LBg/r;->encoding()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v10, v9, v0, v2}, Lzg/F;-><init>(Ljava/lang/reflect/Method;ILzg/j;Ljava/lang/String;)V

    goto/16 :goto_10

    .line 329
    :cond_55
    const-string v0, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."

    const/4 v12, 0x0

    new-array v1, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_56
    const/4 v12, 0x0

    .line 330
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "@PartMap keys must be of type String: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_57
    const/4 v12, 0x0

    .line 331
    new-array v0, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v15, v0}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_58
    const/4 v12, 0x0

    .line 332
    const-string v0, "@PartMap parameter type must be Map."

    new-array v1, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_59
    const/4 v12, 0x0

    .line 333
    const-string v0, "@PartMap parameters can only be used with multipart encoding."

    new-array v1, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 334
    :cond_5a
    instance-of v0, v2, LBg/a;

    if-eqz v0, :cond_5d

    .line 335
    invoke-virtual {v6, v9, v13}, Lzg/O;->c(ILjava/lang/reflect/Type;)V

    .line 336
    iget-boolean v0, v6, Lzg/O;->p:Z

    if-nez v0, :cond_5c

    iget-boolean v0, v6, Lzg/O;->q:Z

    if-nez v0, :cond_5c

    .line 337
    iget-boolean v0, v6, Lzg/O;->h:Z

    if-nez v0, :cond_5b

    .line 338
    :try_start_1
    invoke-virtual {v5, v13, v14, v7}, Lzg/T;->b(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lzg/j;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v15, 0x1

    .line 339
    iput-boolean v15, v6, Lzg/O;->h:Z

    .line 340
    new-instance v1, Lzg/A;

    invoke-direct {v1, v10, v9, v0}, Lzg/A;-><init>(Ljava/lang/reflect/Method;ILzg/j;)V

    goto/16 :goto_10

    :catch_1
    move-exception v0

    const/4 v15, 0x1

    .line 341
    const-string v1, "Unable to create @Body converter for %s"

    new-array v2, v15, [Ljava/lang/Object;

    const/4 v12, 0x0

    aput-object v13, v2, v12

    invoke-static {v10, v0, v9, v1, v2}, Lzg/a0;->l(Ljava/lang/reflect/Method;Ljava/lang/Exception;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_5b
    const/4 v12, 0x0

    .line 342
    const-string v0, "Multiple @Body method annotations found."

    new-array v1, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_5c
    const/4 v12, 0x0

    .line 343
    const-string v0, "@Body parameters cannot be used with form or multi-part encoding."

    new-array v1, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 344
    :cond_5d
    instance-of v0, v2, LBg/x;

    if-eqz v0, :cond_61

    .line 345
    invoke-virtual {v6, v9, v13}, Lzg/O;->c(ILjava/lang/reflect/Type;)V

    .line 346
    invoke-static {v13}, Lzg/a0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    const/16 v20, 0x1

    add-int/lit8 v1, v9, -0x1

    :goto_e
    if-ltz v1, :cond_60

    .line 347
    iget-object v2, v6, Lzg/O;->v:[Lzg/a0;

    aget-object v2, v2, v1

    .line 348
    instance-of v3, v2, Lzg/J;

    if-eqz v3, :cond_5f

    check-cast v2, Lzg/J;

    iget-object v2, v2, Lzg/J;->b:Ljava/lang/Class;

    .line 349
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5e

    goto :goto_f

    .line 350
    :cond_5e
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "@Tag type "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 351
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " is duplicate of parameter #"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v20, 0x1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " and would always overwrite its value."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v12, 0x0

    new-array v1, v12, [Ljava/lang/Object;

    .line 352
    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_5f
    :goto_f
    add-int/lit8 v1, v1, -0x1

    goto :goto_e

    .line 353
    :cond_60
    new-instance v1, Lzg/J;

    invoke-direct {v1, v0}, Lzg/J;-><init>(Ljava/lang/Class;)V

    goto :goto_10

    :cond_61
    const/4 v1, 0x0

    :goto_10
    if-nez v1, :cond_62

    :goto_11
    const/16 v20, 0x1

    goto :goto_12

    :cond_62
    if-nez v19, :cond_63

    move-object/from16 v19, v1

    goto :goto_11

    :goto_12
    add-int/lit8 v5, v23, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v21

    move/from16 v3, v22

    move/from16 v4, v24

    move/from16 v15, v25

    move/from16 v8, v26

    move-object/from16 v12, v27

    move-object/from16 v11, v28

    goto/16 :goto_8

    .line 354
    :cond_63
    const-string v0, "Multiple Retrofit annotations found, only one allowed."

    const/4 v12, 0x0

    new-array v1, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_64
    :goto_13
    move/from16 v22, v3

    move/from16 v26, v8

    move-object/from16 v28, v11

    move-object/from16 v27, v12

    move/from16 v25, v15

    const/16 v16, 0x2

    goto :goto_14

    :cond_65
    const/16 v19, 0x0

    move-object/from16 v21, v2

    goto :goto_13

    :goto_14
    if-nez v19, :cond_67

    if-eqz v25, :cond_66

    .line 355
    :try_start_2
    invoke-static {v13}, Lzg/a0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljf/c;

    if-ne v0, v1, :cond_66

    const/4 v15, 0x1

    .line 356
    iput-boolean v15, v6, Lzg/O;->w:Z
    :try_end_2
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_2 .. :try_end_2} :catch_2

    const/16 v19, 0x0

    goto :goto_15

    .line 357
    :catch_2
    :cond_66
    const-string v0, "No Retrofit annotation found."

    const/4 v12, 0x0

    new-array v1, v12, [Ljava/lang/Object;

    invoke-static {v10, v9, v0, v1}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 358
    :cond_67
    :goto_15
    aput-object v19, v27, v9

    const/4 v15, 0x1

    add-int/2addr v9, v15

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v5, v15

    move-object/from16 v2, v21

    move/from16 v3, v22

    move/from16 v8, v26

    move-object/from16 v11, v28

    const/4 v4, 0x0

    goto/16 :goto_6

    :cond_68
    move v15, v5

    move-object/from16 v28, v11

    .line 359
    iget-object v0, v6, Lzg/O;->r:Ljava/lang/String;

    if-nez v0, :cond_6a

    iget-boolean v0, v6, Lzg/O;->m:Z

    if-eqz v0, :cond_69

    goto :goto_16

    .line 360
    :cond_69
    iget-object v0, v6, Lzg/O;->n:Ljava/lang/String;

    new-array v1, v15, [Ljava/lang/Object;

    const/16 v17, 0x0

    aput-object v0, v1, v17

    .line 361
    const-string v0, "Missing either @%s URL or @Url parameter."

    const/4 v2, 0x0

    invoke-static {v10, v2, v0, v1}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 362
    throw v0

    .line 363
    :cond_6a
    :goto_16
    iget-boolean v0, v6, Lzg/O;->p:Z

    if-nez v0, :cond_6c

    iget-boolean v1, v6, Lzg/O;->q:Z

    if-nez v1, :cond_6c

    iget-boolean v1, v6, Lzg/O;->o:Z

    if-nez v1, :cond_6c

    iget-boolean v1, v6, Lzg/O;->h:Z

    if-nez v1, :cond_6b

    goto :goto_17

    :cond_6b
    const/4 v12, 0x0

    .line 364
    new-array v0, v12, [Ljava/lang/Object;

    .line 365
    const-string v1, "Non-body HTTP method cannot contain @Body."

    const/4 v2, 0x0

    invoke-static {v10, v2, v1, v0}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 366
    throw v0

    :cond_6c
    :goto_17
    if-eqz v0, :cond_6e

    .line 367
    iget-boolean v0, v6, Lzg/O;->f:Z

    if-eqz v0, :cond_6d

    goto :goto_18

    :cond_6d
    const/4 v12, 0x0

    .line 368
    new-array v0, v12, [Ljava/lang/Object;

    .line 369
    const-string v1, "Form-encoded method must contain at least one @Field."

    const/4 v2, 0x0

    invoke-static {v10, v2, v1, v0}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 370
    throw v0

    .line 371
    :cond_6e
    :goto_18
    iget-boolean v0, v6, Lzg/O;->q:Z

    if-eqz v0, :cond_70

    iget-boolean v0, v6, Lzg/O;->g:Z

    if-eqz v0, :cond_6f

    goto :goto_19

    :cond_6f
    const/4 v12, 0x0

    .line 372
    new-array v0, v12, [Ljava/lang/Object;

    .line 373
    const-string v1, "Multipart method must contain at least one @Part."

    const/4 v2, 0x0

    invoke-static {v10, v2, v1, v0}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 374
    throw v0

    .line 375
    :cond_70
    :goto_19
    new-instance v0, Lzg/P;

    invoke-direct {v0, v6}, Lzg/P;-><init>(Lzg/O;)V

    .line 376
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 377
    invoke-static {v1}, Lzg/a0;->h(Ljava/lang/reflect/Type;)Z

    move-result v2

    if-nez v2, :cond_7c

    .line 378
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-eq v1, v2, :cond_7b

    .line 379
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v1

    .line 380
    iget-boolean v2, v0, Lzg/P;->k:Z

    const-class v3, Lzg/Q;

    if-eqz v2, :cond_74

    .line 381
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v4

    .line 382
    array-length v5, v4

    const/16 v20, 0x1

    add-int/lit8 v5, v5, -0x1

    aget-object v4, v4, v5

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 383
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v4

    const/4 v12, 0x0

    aget-object v4, v4, v12

    .line 384
    instance-of v5, v4, Ljava/lang/reflect/WildcardType;

    if-eqz v5, :cond_71

    .line 385
    check-cast v4, Ljava/lang/reflect/WildcardType;

    invoke-interface {v4}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v4

    aget-object v4, v4, v12

    .line 386
    :cond_71
    invoke-static {v4}, Lzg/a0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v5

    if-ne v5, v3, :cond_72

    instance-of v5, v4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v5, :cond_72

    .line 387
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v12, v4}, Lzg/a0;->e(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    const/4 v5, 0x1

    goto :goto_1a

    :cond_72
    move v5, v12

    .line 388
    :goto_1a
    new-instance v6, Lzg/Y;

    const-class v7, Lzg/c;

    const/4 v15, 0x1

    new-array v8, v15, [Ljava/lang/reflect/Type;

    aput-object v4, v8, v12

    const/4 v4, 0x0

    invoke-direct {v6, v4, v7, v8}, Lzg/Y;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 389
    const-class v4, Lzg/V;

    invoke-static {v1, v4}, Lzg/a0;->i([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_73

    goto :goto_1b

    .line 390
    :cond_73
    array-length v4, v1

    add-int/2addr v4, v15

    new-array v4, v4, [Ljava/lang/annotation/Annotation;

    .line 391
    sget-object v7, Lzg/W;->a:Lzg/W;

    aput-object v7, v4, v12

    .line 392
    array-length v7, v1

    invoke-static {v1, v12, v4, v15, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v4

    :goto_1b
    move-object/from16 v4, p0

    goto :goto_1c

    .line 393
    :cond_74
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v6

    const/4 v5, 0x0

    goto :goto_1b

    .line 394
    :goto_1c
    :try_start_3
    invoke-virtual {v4, v6, v1}, Lzg/T;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lzg/e;

    move-result-object v1
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4

    .line 395
    invoke-interface {v1}, Lzg/e;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    .line 396
    const-class v7, Lokhttp3/Response;

    if-eq v6, v7, :cond_7a

    if-eq v6, v3, :cond_79

    .line 397
    iget-object v3, v0, Lzg/P;->c:Ljava/lang/String;

    move-object/from16 v7, v28

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_75

    const-class v3, Ljava/lang/Void;

    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_76

    :cond_75
    move-object/from16 v3, p1

    goto :goto_1d

    :cond_76
    const/4 v12, 0x0

    .line 398
    new-array v0, v12, [Ljava/lang/Object;

    .line 399
    const-string v1, "HEAD method must use Void as response type."

    move-object/from16 v3, p1

    const/4 v2, 0x0

    invoke-static {v3, v2, v1, v0}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 400
    throw v0

    .line 401
    :goto_1d
    invoke-virtual {v3}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v7

    .line 402
    :try_start_4
    invoke-virtual {v4, v6, v7}, Lzg/T;->c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lzg/j;

    move-result-object v3
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3

    .line 403
    iget-object v4, v4, Lzg/T;->b:Lokhttp3/Call$Factory;

    if-nez v2, :cond_77

    .line 404
    new-instance v2, Lzg/n;

    invoke-direct {v2, v0, v4, v3, v1}, Lzg/n;-><init>(Lzg/P;Lokhttp3/Call$Factory;Lzg/j;Lzg/e;)V

    return-object v2

    :cond_77
    if-eqz v5, :cond_78

    .line 405
    new-instance v2, Lzg/p;

    invoke-direct {v2, v0, v4, v3, v1}, Lzg/p;-><init>(Lzg/P;Lokhttp3/Call$Factory;Lzg/j;Lzg/e;)V

    return-object v2

    .line 406
    :cond_78
    new-instance v2, Lzg/o;

    invoke-direct {v2, v0, v4, v3, v1}, Lzg/o;-><init>(Lzg/P;Lokhttp3/Call$Factory;Lzg/j;Lzg/e;)V

    return-object v2

    :catch_3
    move-exception v0

    .line 407
    const-string v1, "Unable to create converter for %s"

    const/4 v15, 0x1

    new-array v2, v15, [Ljava/lang/Object;

    const/4 v12, 0x0

    aput-object v6, v2, v12

    invoke-static {v3, v0, v1, v2}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_79
    move-object/from16 v3, p1

    const/4 v12, 0x0

    .line 408
    new-array v0, v12, [Ljava/lang/Object;

    .line 409
    const-string v1, "Response must include generic type (e.g., Response<String>)"

    const/4 v2, 0x0

    invoke-static {v3, v2, v1, v0}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 410
    throw v0

    :cond_7a
    move-object/from16 v3, p1

    .line 411
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 412
    invoke-static {v6}, Lzg/a0;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' is not a valid response body type. Did you mean ResponseBody?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v12, 0x0

    new-array v1, v12, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 413
    invoke-static {v3, v2, v0, v1}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 414
    throw v0

    :catch_4
    move-exception v0

    move-object/from16 v3, p1

    const/4 v12, 0x0

    .line 415
    const-string v1, "Unable to create call adapter for %s"

    const/4 v15, 0x1

    new-array v2, v15, [Ljava/lang/Object;

    aput-object v6, v2, v12

    invoke-static {v3, v0, v1, v2}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_7b
    move-object/from16 v3, p1

    const/4 v12, 0x0

    .line 416
    new-array v0, v12, [Ljava/lang/Object;

    .line 417
    const-string v1, "Service methods cannot return void."

    const/4 v2, 0x0

    invoke-static {v3, v2, v1, v0}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 418
    throw v0

    :cond_7c
    move-object/from16 v3, p1

    const/4 v2, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x1

    .line 419
    new-array v0, v15, [Ljava/lang/Object;

    aput-object v1, v0, v12

    .line 420
    const-string v1, "Method return type must not include a type variable or wildcard: %s"

    invoke-static {v3, v2, v1, v0}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 421
    throw v0

    :cond_7d
    move v12, v4

    const/4 v2, 0x0

    .line 422
    new-array v0, v12, [Ljava/lang/Object;

    .line 423
    const-string v1, "HTTP method annotation is required (e.g., @GET, @POST, etc.)."

    invoke-static {v10, v2, v1, v0}, Lzg/a0;->j(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    .line 424
    throw v0
.end method
