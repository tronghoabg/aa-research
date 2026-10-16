.class public final LA7/W1;
.super LA7/G1;
.source "SourceFile"


# instance fields
.field public d:Ljava/lang/String;

.field public e:Ljava/util/HashSet;

.field public f:Lx/e;

.field public g:Ljava/lang/Long;

.field public h:Ljava/lang/Long;


# virtual methods
.method public final j0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final k0(Ljava/lang/Integer;)LA7/X1;
    .locals 2

    .line 1
    iget-object v0, p0, LA7/W1;->f:Lx/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lx/v;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LA7/W1;->f:Lx/e;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, LA7/X1;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    new-instance v0, LA7/X1;

    .line 19
    .line 20
    iget-object v1, p0, LA7/W1;->d:Ljava/lang/String;

    .line 21
    .line 22
    invoke-direct {v0, p0, v1}, LA7/X1;-><init>(LA7/W1;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, LA7/W1;->f:Lx/e;

    .line 26
    .line 27
    invoke-virtual {v1, p1, v0}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public final l0(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    const/4 v6, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move-object v5, p5

    .line 8
    invoke-virtual/range {v0 .. v6}, LA7/W1;->m0(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Z)Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final m0(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Z)Ljava/util/ArrayList;
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move/from16 v10, p6

    .line 1
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    invoke-static {v8}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 3
    invoke-static {v9}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    .line 4
    iput-object v0, v1, LA7/W1;->d:Ljava/lang/String;

    .line 5
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, v1, LA7/W1;->e:Ljava/util/HashSet;

    .line 6
    new-instance v0, Lx/e;

    const/4 v11, 0x0

    .line 7
    invoke-direct {v0, v11}, Lx/v;-><init>(I)V

    .line 8
    iput-object v0, v1, LA7/W1;->f:Lx/e;

    move-object/from16 v0, p4

    .line 9
    iput-object v0, v1, LA7/W1;->g:Ljava/lang/Long;

    move-object/from16 v0, p5

    .line 10
    iput-object v0, v1, LA7/W1;->h:Ljava/lang/Long;

    .line 11
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfy$zzf;

    .line 12
    const-string v3, "_s"

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    move v2, v11

    .line 13
    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoe;->zza()Z

    move-result v0

    iget-object v3, v1, LA7/B0;->a:Ljava/lang/Object;

    move-object v13, v3

    check-cast v13, LA7/n0;

    if-eqz v0, :cond_2

    .line 14
    iget-object v0, v13, LA7/n0;->g:LA7/e;

    .line 15
    iget-object v3, v1, LA7/W1;->d:Ljava/lang/String;

    sget-object v4, LA7/y;->p0:LA7/D;

    .line 16
    invoke-virtual {v0, v3, v4}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v14, 0x1

    goto :goto_1

    :cond_2
    move v14, v11

    .line 17
    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoe;->zza()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 18
    iget-object v0, v13, LA7/n0;->g:LA7/e;

    .line 19
    iget-object v3, v1, LA7/W1;->d:Ljava/lang/String;

    sget-object v4, LA7/y;->o0:LA7/D;

    .line 20
    invoke-virtual {v0, v3, v4}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v15, 0x1

    goto :goto_2

    :cond_3
    move v15, v11

    :goto_2
    if-eqz v2, :cond_4

    .line 21
    invoke-virtual {v1}, LA7/H1;->f0()LA7/i;

    move-result-object v3

    iget-object v4, v1, LA7/W1;->d:Ljava/lang/String;

    .line 22
    invoke-virtual {v3}, LA7/G1;->h0()V

    .line 23
    invoke-virtual {v3}, LA7/B0;->c0()V

    .line 24
    invoke-static {v4}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 25
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 26
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "current_session_count"

    invoke-virtual {v0, v6, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 27
    :try_start_0
    invoke-virtual {v3}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    .line 28
    const-string v6, "events"

    const-string v7, "app_id = ?"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v6, v0, v7, v12}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 29
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    move-result-object v3

    .line 30
    invoke-static {v4}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    move-result-object v4

    .line 31
    iget-object v3, v3, LA7/N;->f:LA7/P;

    const-string v5, "Error resetting session-scoped event counts. appId"

    invoke-virtual {v3, v4, v5, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 32
    :cond_4
    :goto_3
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 33
    const-string v3, "audience_id"

    if-eqz v15, :cond_5

    if-eqz v14, :cond_5

    .line 34
    invoke-virtual {v1}, LA7/H1;->f0()LA7/i;

    move-result-object v4

    iget-object v5, v1, LA7/W1;->d:Ljava/lang/String;

    .line 35
    invoke-static {v5}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 36
    new-instance v6, Lx/e;

    .line 37
    invoke-direct {v6, v11}, Lx/v;-><init>(I)V

    .line 38
    invoke-virtual {v4}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v16

    .line 39
    :try_start_1
    const-string v17, "event_filters"

    const-string v7, "data"

    filled-new-array {v3, v7}, [Ljava/lang/String;

    move-result-object v18

    const-string v19, "app_id=?"

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v20

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    .line 40
    invoke-virtual/range {v16 .. v23}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 41
    :try_start_2
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v16
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v16, :cond_6

    .line 42
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    :cond_5
    move/from16 p5, v2

    goto/16 :goto_8

    :cond_6
    :goto_4
    const/4 v12, 0x1

    .line 43
    :try_start_3
    invoke-interface {v7, v12}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 44
    :try_start_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzc()Lcom/google/android/gms/internal/measurement/zzfo$zzb$zza;

    move-result-object v12

    invoke-static {v12, v0}, LA7/S1;->t0(Lcom/google/android/gms/internal/measurement/zzjt$zzb;[B)Lcom/google/android/gms/internal/measurement/zzlb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfo$zzb$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjt$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzlc;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzjt;

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfo$zzb;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 45
    :try_start_5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzk()Z

    move-result v12

    if-eqz v12, :cond_8

    .line 46
    invoke-interface {v7, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    .line 47
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v6, v11}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    if-nez v11, :cond_7

    .line 48
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 49
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v6, v12, v11}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :catchall_0
    move-exception v0

    move-object v12, v7

    goto :goto_9

    :catch_1
    move-exception v0

    move/from16 p5, v2

    goto :goto_7

    .line 50
    :cond_7
    :goto_5
    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    move/from16 p5, v2

    goto :goto_6

    :catch_2
    move-exception v0

    .line 51
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    move-result-object v11

    .line 52
    iget-object v11, v11, LA7/N;->f:LA7/P;

    .line 53
    const-string v12, "Failed to merge filter. appId"
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move/from16 p5, v2

    .line 54
    :try_start_6
    invoke-static {v5}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    move-result-object v2

    invoke-virtual {v11, v2, v12, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    :goto_6
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-nez v0, :cond_9

    .line 56
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    move-object v0, v6

    goto :goto_8

    :cond_9
    move/from16 v2, p5

    const/4 v11, 0x0

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_7

    :catchall_1
    move-exception v0

    const/4 v12, 0x0

    goto :goto_9

    :catch_4
    move-exception v0

    move/from16 p5, v2

    const/4 v7, 0x0

    .line 57
    :goto_7
    :try_start_7
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    move-result-object v2

    .line 58
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 59
    const-string v4, "Database error querying filters. appId"

    .line 60
    invoke-static {v5}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    move-result-object v5

    invoke-virtual {v2, v5, v4, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-eqz v7, :cond_a

    .line 62
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    :cond_a
    :goto_8
    move-object v11, v0

    goto :goto_a

    :goto_9
    if-eqz v12, :cond_b

    .line 63
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 64
    :cond_b
    throw v0

    .line 65
    :goto_a
    invoke-virtual {v1}, LA7/H1;->f0()LA7/i;

    move-result-object v2

    iget-object v4, v1, LA7/W1;->d:Ljava/lang/String;

    .line 66
    invoke-virtual {v2}, LA7/G1;->h0()V

    .line 67
    invoke-virtual {v2}, LA7/B0;->c0()V

    .line 68
    invoke-static {v4}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 69
    invoke-virtual {v2}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v17

    .line 70
    :try_start_8
    const-string v18, "audience_filter_values"

    const-string v0, "current_results"

    filled-new-array {v3, v0}, [Ljava/lang/String;

    move-result-object v19

    const-string v20, "app_id=?"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v21

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    .line 71
    invoke-virtual/range {v17 .. v24}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 72
    :try_start_9
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_d

    .line 73
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 74
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    :cond_c
    :goto_b
    move-object v12, v0

    goto/16 :goto_f

    :catchall_2
    move-exception v0

    move-object v12, v3

    goto/16 :goto_26

    :catch_5
    move-exception v0

    move-object/from16 v17, v2

    goto :goto_e

    .line 75
    :cond_d
    :try_start_a
    new-instance v5, Lx/e;

    const/4 v6, 0x0

    .line 76
    invoke-direct {v5, v6}, Lx/v;-><init>(I)V

    .line 77
    :goto_c
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    const/4 v12, 0x1

    .line 78
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0
    :try_end_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 79
    :try_start_b
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zze()Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    move-result-object v6

    invoke-static {v6, v0}, LA7/S1;->t0(Lcom/google/android/gms/internal/measurement/zzjt$zzb;[B)Lcom/google/android/gms/internal/measurement/zzlb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjt$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzlc;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzjt;

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfy$zzm;
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_5
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 80
    :try_start_c
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6, v0}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v17, v2

    goto :goto_d

    :catch_6
    move-exception v0

    .line 81
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    move-result-object v6

    .line 82
    iget-object v6, v6, LA7/N;->f:LA7/P;

    .line 83
    const-string v12, "Failed to merge filter results. appId, audienceId, error"
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_5
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    move-object/from16 v17, v2

    .line 84
    :try_start_d
    invoke-static {v4}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    move-result-object v2

    .line 85
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 86
    invoke-virtual {v6, v2, v7, v0, v12}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    :goto_d
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_7
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    if-nez v0, :cond_e

    .line 88
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    move-object v12, v5

    goto :goto_f

    :cond_e
    move-object/from16 v2, v17

    const/4 v6, 0x0

    goto :goto_c

    :catch_7
    move-exception v0

    goto :goto_e

    :catchall_3
    move-exception v0

    const/4 v12, 0x0

    goto/16 :goto_26

    :catch_8
    move-exception v0

    move-object/from16 v17, v2

    const/4 v3, 0x0

    .line 89
    :goto_e
    :try_start_e
    invoke-virtual/range {v17 .. v17}, LA7/B0;->zzj()LA7/N;

    move-result-object v2

    .line 90
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 91
    const-string v5, "Database error querying filter results. appId"

    .line 92
    invoke-static {v4}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    move-result-object v4

    invoke-virtual {v2, v4, v5, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 93
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    if-eqz v3, :cond_c

    .line 94
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    goto :goto_b

    .line 95
    :goto_f
    invoke-interface {v12}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2b

    .line 96
    new-instance v2, Ljava/util/HashSet;

    invoke-interface {v12}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    if-eqz p5, :cond_1b

    .line 97
    iget-object v3, v1, LA7/W1;->d:Ljava/lang/String;

    .line 98
    invoke-virtual {v1}, LA7/H1;->f0()LA7/i;

    move-result-object v4

    iget-object v5, v1, LA7/W1;->d:Ljava/lang/String;

    .line 99
    invoke-virtual {v4}, LA7/G1;->h0()V

    .line 100
    invoke-virtual {v4}, LA7/B0;->c0()V

    .line 101
    invoke-static {v5}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 102
    new-instance v0, Lx/e;

    const/4 v6, 0x0

    .line 103
    invoke-direct {v0, v6}, Lx/v;-><init>(I)V

    .line 104
    invoke-virtual {v4}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    .line 105
    :try_start_f
    const-string v7, "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_b
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    move-object/from16 p5, v2

    :try_start_10
    filled-new-array {v5, v5}, [Ljava/lang/String;

    move-result-object v2

    .line 106
    invoke-virtual {v6, v7, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_a
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    .line 107
    :try_start_11
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v6

    if-nez v6, :cond_f

    .line 108
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_11
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_11 .. :try_end_11} :catch_9
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 109
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_12

    :catchall_4
    move-exception v0

    move-object v12, v2

    goto/16 :goto_18

    :catch_9
    move-exception v0

    goto :goto_11

    :cond_f
    const/4 v6, 0x0

    .line 110
    :try_start_12
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    .line 111
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0, v6}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    if-nez v6, :cond_10

    .line 112
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 113
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v0, v7, v6}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    const/4 v7, 0x1

    .line 114
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v17

    .line 115
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v6
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_9
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    if-nez v6, :cond_f

    .line 117
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_12

    :catchall_5
    move-exception v0

    const/4 v12, 0x0

    goto/16 :goto_18

    :catch_a
    move-exception v0

    :goto_10
    const/4 v2, 0x0

    goto :goto_11

    :catch_b
    move-exception v0

    move-object/from16 p5, v2

    goto :goto_10

    .line 118
    :goto_11
    :try_start_13
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    move-result-object v4

    .line 119
    iget-object v4, v4, LA7/N;->f:LA7/P;

    .line 120
    const-string v6, "Database error querying scoped filters. appId"

    .line 121
    invoke-static {v5}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    move-result-object v5

    invoke-virtual {v4, v5, v6, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 122
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    if-eqz v2, :cond_11

    .line 123
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 124
    :cond_11
    :goto_12
    invoke-static {v3}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 125
    new-instance v2, Lx/e;

    const/4 v6, 0x0

    .line 126
    invoke-direct {v2, v6}, Lx/v;-><init>(I)V

    .line 127
    invoke-interface {v12}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_19

    .line 128
    invoke-interface {v12}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    invoke-interface {v12, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzfy$zzm;

    .line 130
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    if-eqz v6, :cond_12

    .line 131
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_13

    :cond_12
    move-object/from16 v17, v0

    move-object/from16 v20, v3

    goto/16 :goto_17

    .line 132
    :cond_13
    invoke-virtual {v1}, LA7/H1;->e0()LA7/S1;

    move-result-object v7

    move-object/from16 v17, v0

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzi()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v7, v0, v6}, LA7/S1;->y0(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 133
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_18

    .line 134
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzjt;->zzcd()Lcom/google/android/gms/internal/measurement/zzjt$zzb;

    move-result-object v7

    .line 135
    check-cast v7, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zzb()Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    move-result-object v7

    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zzb(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    move-result-object v0

    .line 136
    invoke-virtual {v1}, LA7/H1;->e0()LA7/S1;

    move-result-object v7

    move-object/from16 v18, v0

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzk()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v7, v0, v6}, LA7/S1;->y0(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 137
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zzd()Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    move-result-object v7

    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zzd(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    .line 138
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 139
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzh()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_14
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_15

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v3

    move-object/from16 v3, v19

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzfy$zze;

    .line 140
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfy$zze;->zza()I

    move-result v19

    move-object/from16 v21, v7

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_14

    .line 141
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_14
    move-object/from16 v3, v20

    move-object/from16 v7, v21

    goto :goto_14

    :cond_15
    move-object/from16 v20, v3

    .line 142
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zza()Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    move-result-object v3

    .line 143
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zza(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    .line 144
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 145
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzj()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_16
    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_17

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzfy$zzn;

    .line 146
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfy$zzn;->zzb()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_16

    .line 147
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_15

    .line 148
    :cond_17
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zzc()Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    move-result-object v3

    .line 149
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zzc(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    .line 150
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzjt$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzlc;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzjt;

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfy$zzm;

    invoke-virtual {v2, v4, v0}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_16
    move-object/from16 v0, v17

    move-object/from16 v3, v20

    goto/16 :goto_13

    :cond_18
    move-object/from16 v0, v17

    goto/16 :goto_13

    .line 151
    :goto_17
    invoke-virtual {v2, v4, v5}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_16

    :cond_19
    move-object v0, v2

    goto :goto_19

    :goto_18
    if-eqz v12, :cond_1a

    .line 152
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 153
    :cond_1a
    throw v0

    :cond_1b
    move-object/from16 p5, v2

    move-object v0, v12

    .line 154
    :goto_19
    invoke-virtual/range {p5 .. p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_1a
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2b

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzfy$zzm;

    .line 156
    new-instance v4, Ljava/util/BitSet;

    invoke-direct {v4}, Ljava/util/BitSet;-><init>()V

    .line 157
    new-instance v5, Ljava/util/BitSet;

    invoke-direct {v5}, Ljava/util/BitSet;-><init>()V

    .line 158
    new-instance v6, Lx/e;

    const/4 v7, 0x0

    .line 159
    invoke-direct {v6, v7}, Lx/v;-><init>(I)V

    if-eqz v3, :cond_1f

    .line 160
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zza()I

    move-result v7

    if-nez v7, :cond_1c

    goto :goto_1e

    .line 161
    :cond_1c
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzh()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_1f

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/google/android/gms/internal/measurement/zzfy$zze;

    .line 162
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzfy$zze;->zzf()Z

    move-result v19

    if-eqz v19, :cond_1e

    .line 163
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzfy$zze;->zza()I

    move-result v19

    move-object/from16 v20, v0

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 164
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzfy$zze;->zze()Z

    move-result v19

    if-eqz v19, :cond_1d

    .line 165
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzfy$zze;->zzb()J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    move-object/from16 p5, v3

    move-object/from16 v3, v18

    goto :goto_1c

    :cond_1d
    move-object/from16 p5, v3

    const/4 v3, 0x0

    .line 166
    :goto_1c
    invoke-virtual {v6, v0, v3}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1d

    :cond_1e
    move-object/from16 v20, v0

    move-object/from16 p5, v3

    :goto_1d
    move-object/from16 v3, p5

    move-object/from16 v0, v20

    goto :goto_1b

    :cond_1f
    :goto_1e
    move-object/from16 v20, v0

    move-object/from16 p5, v3

    .line 167
    new-instance v7, Lx/e;

    const/4 v3, 0x0

    .line 168
    invoke-direct {v7, v3}, Lx/v;-><init>(I)V

    if-eqz p5, :cond_22

    .line 169
    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzc()I

    move-result v0

    if-nez v0, :cond_20

    goto :goto_21

    .line 170
    :cond_20
    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzj()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_22

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v3, v16

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzfy$zzn;

    .line 171
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzn;->zzf()Z

    move-result v16

    if-eqz v16, :cond_21

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzn;->zza()I

    move-result v16

    if-lez v16, :cond_21

    .line 172
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzn;->zzb()I

    move-result v16

    move-object/from16 v19, v0

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 173
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzn;->zza()I

    move-result v16

    move/from16 v22, v14

    const/16 v21, 0x1

    add-int/lit8 v14, v16, -0x1

    invoke-virtual {v3, v14}, Lcom/google/android/gms/internal/measurement/zzfy$zzn;->zza(I)J

    move-result-wide v23

    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 174
    invoke-virtual {v7, v0, v3}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_20

    :cond_21
    move-object/from16 v19, v0

    move/from16 v22, v14

    :goto_20
    move-object/from16 v0, v19

    move/from16 v14, v22

    const/4 v3, 0x0

    goto :goto_1f

    :cond_22
    :goto_21
    move/from16 v22, v14

    if-eqz p5, :cond_25

    const/4 v0, 0x0

    .line 175
    :goto_22
    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzd()I

    move-result v3

    shl-int/lit8 v3, v3, 0x6

    if-ge v0, v3, :cond_25

    .line 176
    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzk()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v3}, LA7/S1;->K0(ILjava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_23

    .line 177
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    move-result-object v3

    .line 178
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iget-object v3, v3, LA7/N;->n:LA7/P;

    move/from16 v16, v15

    const-string v15, "Filter already evaluated. audience ID, filter ID"

    invoke-virtual {v3, v2, v15, v14}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 179
    invoke-virtual {v5, v0}, Ljava/util/BitSet;->set(I)V

    .line 180
    invoke-virtual/range {p5 .. p5}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zzi()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v3}, LA7/S1;->K0(ILjava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_24

    .line 181
    invoke-virtual {v4, v0}, Ljava/util/BitSet;->set(I)V

    goto :goto_23

    :cond_23
    move/from16 v16, v15

    .line 182
    :cond_24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v6, v3}, Lx/v;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_23
    add-int/lit8 v0, v0, 0x1

    move/from16 v15, v16

    goto :goto_22

    :cond_25
    move/from16 v16, v15

    .line 183
    invoke-interface {v12, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzfy$zzm;

    if-eqz v16, :cond_2a

    if-eqz v22, :cond_2a

    .line 184
    invoke-interface {v11, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_2a

    .line 185
    iget-object v14, v1, LA7/W1;->h:Ljava/lang/Long;

    if-eqz v14, :cond_2a

    iget-object v14, v1, LA7/W1;->g:Ljava/lang/Long;

    if-nez v14, :cond_26

    goto :goto_25

    .line 186
    :cond_26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    .line 187
    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzb()I

    move-result v15

    move-object/from16 p5, v0

    .line 188
    iget-object v0, v1, LA7/W1;->h:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v23

    const-wide/16 v25, 0x3e8

    div-long v23, v23, v25

    .line 189
    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzi()Z

    move-result v0

    if-eqz v0, :cond_27

    .line 190
    iget-object v0, v1, LA7/W1;->g:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v23

    div-long v23, v23, v25

    .line 191
    :cond_27
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Lx/v;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_28

    .line 192
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-virtual {v6, v0, v14}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    :cond_28
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lx/v;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_29

    .line 194
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-virtual {v7, v0, v14}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_29
    move-object/from16 v0, p5

    goto :goto_24

    .line 195
    :cond_2a
    :goto_25
    new-instance v0, LA7/X1;

    move-object v14, v2

    iget-object v2, v1, LA7/W1;->d:Ljava/lang/String;

    const/16 v18, 0x0

    invoke-direct/range {v0 .. v7}, LA7/X1;-><init>(LA7/W1;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfy$zzm;Ljava/util/BitSet;Ljava/util/BitSet;Lx/e;Lx/e;)V

    .line 196
    iget-object v2, v1, LA7/W1;->f:Lx/e;

    invoke-virtual {v2, v14, v0}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v15, v16

    move-object/from16 v0, v20

    move/from16 v14, v22

    goto/16 :goto_1a

    .line 197
    :cond_2b
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 198
    iget-object v0, v13, LA7/n0;->g:LA7/e;

    .line 199
    sget-object v2, LA7/y;->Y0:LA7/D;

    const/4 v3, 0x0

    .line 200
    invoke-virtual {v0, v3, v2}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 201
    invoke-virtual {v1, v8, v10}, LA7/W1;->n0(Ljava/util/List;Z)V

    if-eqz v10, :cond_2c

    .line 202
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 203
    :cond_2c
    invoke-virtual {v1, v9}, LA7/W1;->o0(Ljava/util/List;)V

    .line 204
    invoke-virtual {v1}, LA7/W1;->p0()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :cond_2d
    const/4 v12, 0x1

    .line 205
    invoke-virtual {v1, v8, v12}, LA7/W1;->n0(Ljava/util/List;Z)V

    .line 206
    invoke-virtual {v1, v9}, LA7/W1;->o0(Ljava/util/List;)V

    .line 207
    invoke-virtual {v1}, LA7/W1;->p0()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :goto_26
    if-eqz v12, :cond_2e

    .line 208
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 209
    :cond_2e
    throw v0
.end method

.method public final n0(Ljava/util/List;Z)V
    .locals 44

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_42

    .line 10
    .line 11
    :cond_0
    new-instance v2, Lx/e;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v2, v3}, Lx/v;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const-wide/16 v10, 0x0

    .line 24
    .line 25
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_56

    .line 30
    .line 31
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v12, v0

    .line 36
    check-cast v12, Lcom/google/android/gms/internal/measurement/zzfy$zzf;

    .line 37
    .line 38
    iget-object v13, v1, LA7/W1;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzg()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzh()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v14

    .line 48
    invoke-virtual {v1}, LA7/H1;->e0()LA7/S1;

    .line 49
    .line 50
    .line 51
    const-string v15, "_eid"

    .line 52
    .line 53
    invoke-static {v12, v15}, LA7/S1;->M0(Lcom/google/android/gms/internal/measurement/zzfy$zzf;Ljava/lang/String;)Ljava/io/Serializable;

    .line 54
    .line 55
    .line 56
    move-result-object v16

    .line 57
    const-wide/16 v19, 0x0

    .line 58
    .line 59
    move-object/from16 v6, v16

    .line 60
    .line 61
    check-cast v6, Ljava/lang/Long;

    .line 62
    .line 63
    if-eqz v6, :cond_1

    .line 64
    .line 65
    const/16 v16, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    move/from16 v16, v3

    .line 69
    .line 70
    :goto_1
    const-wide/16 v21, 0x1

    .line 71
    .line 72
    if-eqz v16, :cond_e

    .line 73
    .line 74
    const-string v5, "_ep"

    .line 75
    .line 76
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_e

    .line 81
    .line 82
    invoke-static {v6}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, LA7/H1;->e0()LA7/S1;

    .line 86
    .line 87
    .line 88
    const-string v0, "_en"

    .line 89
    .line 90
    invoke-static {v12, v0}, LA7/S1;->M0(Lcom/google/android/gms/internal/measurement/zzfy$zzf;Ljava/lang/String;)Ljava/io/Serializable;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    move-object v5, v0

    .line 95
    check-cast v5, Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_2

    .line 102
    .line 103
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const-string v5, "Extra parameter without an event name. eventId"

    .line 108
    .line 109
    iget-object v0, v0, LA7/N;->g:LA7/P;

    .line 110
    .line 111
    invoke-virtual {v0, v5, v6}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    move-object/from16 v25, v4

    .line 115
    .line 116
    :goto_2
    move-object/from16 v17, v12

    .line 117
    .line 118
    const/4 v3, 0x0

    .line 119
    goto/16 :goto_16

    .line 120
    .line 121
    :cond_2
    if-eqz v8, :cond_4

    .line 122
    .line 123
    if-eqz v9, :cond_4

    .line 124
    .line 125
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 126
    .line 127
    .line 128
    move-result-wide v16

    .line 129
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 130
    .line 131
    .line 132
    move-result-wide v23

    .line 133
    cmp-long v0, v16, v23

    .line 134
    .line 135
    if-eqz v0, :cond_3

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_3
    move-object/from16 v25, v4

    .line 139
    .line 140
    :goto_3
    move-object/from16 v18, v8

    .line 141
    .line 142
    goto/16 :goto_c

    .line 143
    .line 144
    :cond_4
    :goto_4
    invoke-virtual {v1}, LA7/H1;->f0()LA7/i;

    .line 145
    .line 146
    .line 147
    move-result-object v16

    .line 148
    invoke-virtual/range {v16 .. v16}, LA7/B0;->c0()V

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v16 .. v16}, LA7/G1;->h0()V

    .line 152
    .line 153
    .line 154
    :try_start_0
    invoke-virtual/range {v16 .. v16}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    const-string v7, "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"

    .line 159
    .line 160
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    filled-new-array {v13, v3}, [Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-virtual {v0, v7, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 169
    .line 170
    .line 171
    move-result-object v3
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 172
    :try_start_1
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    .line 173
    .line 174
    .line 175
    move-result v0
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 176
    if-nez v0, :cond_6

    .line 177
    .line 178
    :try_start_2
    invoke-virtual/range {v16 .. v16}, LA7/B0;->zzj()LA7/N;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 183
    .line 184
    const-string v7, "Main event not found"

    .line 185
    .line 186
    invoke-virtual {v0, v7}, LA7/P;->c(Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 187
    .line 188
    .line 189
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 190
    .line 191
    .line 192
    move-object/from16 v25, v4

    .line 193
    .line 194
    :cond_5
    :goto_5
    const/4 v0, 0x0

    .line 195
    goto/16 :goto_b

    .line 196
    .line 197
    :catchall_0
    move-exception v0

    .line 198
    move-object v5, v3

    .line 199
    goto/16 :goto_12

    .line 200
    .line 201
    :catch_0
    move-exception v0

    .line 202
    :goto_6
    move-object/from16 v25, v4

    .line 203
    .line 204
    goto :goto_a

    .line 205
    :cond_6
    const/4 v7, 0x0

    .line 206
    :try_start_3
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getBlob(I)[B

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    const/4 v7, 0x1

    .line 211
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 212
    .line 213
    .line 214
    move-result-wide v17

    .line 215
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 216
    .line 217
    .line 218
    move-result-object v7
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 219
    move-object/from16 v17, v3

    .line 220
    .line 221
    :try_start_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zze()Lcom/google/android/gms/internal/measurement/zzfy$zzf$zza;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-static {v3, v0}, LA7/S1;->t0(Lcom/google/android/gms/internal/measurement/zzjt$zzb;[B)Lcom/google/android/gms/internal/measurement/zzlb;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfy$zzf$zza;

    .line 230
    .line 231
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjt$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzlc;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzjt;

    .line 236
    .line 237
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfy$zzf;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 238
    .line 239
    :try_start_5
    invoke-static {v0, v7}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 240
    .line 241
    .line 242
    move-result-object v0
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 243
    invoke-interface/range {v17 .. v17}, Landroid/database/Cursor;->close()V

    .line 244
    .line 245
    .line 246
    move-object/from16 v25, v4

    .line 247
    .line 248
    goto :goto_b

    .line 249
    :catchall_1
    move-exception v0

    .line 250
    :goto_7
    move-object/from16 v5, v17

    .line 251
    .line 252
    goto/16 :goto_12

    .line 253
    .line 254
    :catch_1
    move-exception v0

    .line 255
    :goto_8
    move-object/from16 v25, v4

    .line 256
    .line 257
    :goto_9
    move-object/from16 v3, v17

    .line 258
    .line 259
    goto :goto_a

    .line 260
    :catch_2
    move-exception v0

    .line 261
    :try_start_6
    invoke-virtual/range {v16 .. v16}, LA7/B0;->zzj()LA7/N;

    .line 262
    .line 263
    .line 264
    move-result-object v3
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 265
    :try_start_7
    iget-object v3, v3, LA7/N;->f:LA7/P;
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 266
    .line 267
    :try_start_8
    const-string v7, "Failed to merge main event. appId, eventId"
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 268
    .line 269
    move-object/from16 v25, v4

    .line 270
    .line 271
    :try_start_9
    invoke-static {v13}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    invoke-virtual {v3, v4, v6, v0, v7}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 276
    .line 277
    .line 278
    invoke-interface/range {v17 .. v17}, Landroid/database/Cursor;->close()V

    .line 279
    .line 280
    .line 281
    goto :goto_5

    .line 282
    :catch_3
    move-exception v0

    .line 283
    goto :goto_9

    .line 284
    :catch_4
    move-exception v0

    .line 285
    goto :goto_8

    .line 286
    :catchall_2
    move-exception v0

    .line 287
    move-object/from16 v17, v3

    .line 288
    .line 289
    goto :goto_7

    .line 290
    :catch_5
    move-exception v0

    .line 291
    move-object/from16 v17, v3

    .line 292
    .line 293
    goto :goto_6

    .line 294
    :catchall_3
    move-exception v0

    .line 295
    const/4 v5, 0x0

    .line 296
    goto/16 :goto_12

    .line 297
    .line 298
    :catch_6
    move-exception v0

    .line 299
    move-object/from16 v25, v4

    .line 300
    .line 301
    const/4 v3, 0x0

    .line 302
    :goto_a
    :try_start_a
    invoke-virtual/range {v16 .. v16}, LA7/B0;->zzj()LA7/N;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    iget-object v4, v4, LA7/N;->f:LA7/P;

    .line 307
    .line 308
    const-string v7, "Error selecting main event"

    .line 309
    .line 310
    invoke-virtual {v4, v7, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 311
    .line 312
    .line 313
    if-eqz v3, :cond_5

    .line 314
    .line 315
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 316
    .line 317
    .line 318
    goto :goto_5

    .line 319
    :goto_b
    if-eqz v0, :cond_7

    .line 320
    .line 321
    iget-object v3, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 322
    .line 323
    if-nez v3, :cond_8

    .line 324
    .line 325
    :cond_7
    move-object v14, v6

    .line 326
    goto/16 :goto_11

    .line 327
    .line 328
    :cond_8
    move-object v8, v3

    .line 329
    check-cast v8, Lcom/google/android/gms/internal/measurement/zzfy$zzf;

    .line 330
    .line 331
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v0, Ljava/lang/Long;

    .line 334
    .line 335
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 336
    .line 337
    .line 338
    move-result-wide v10

    .line 339
    invoke-virtual {v1}, LA7/H1;->e0()LA7/S1;

    .line 340
    .line 341
    .line 342
    invoke-static {v8, v15}, LA7/S1;->M0(Lcom/google/android/gms/internal/measurement/zzfy$zzf;Ljava/lang/String;)Ljava/io/Serializable;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    move-object v9, v0

    .line 347
    check-cast v9, Ljava/lang/Long;

    .line 348
    .line 349
    goto/16 :goto_3

    .line 350
    .line 351
    :goto_c
    sub-long v16, v10, v21

    .line 352
    .line 353
    cmp-long v0, v16, v19

    .line 354
    .line 355
    if-gtz v0, :cond_9

    .line 356
    .line 357
    invoke-virtual {v1}, LA7/H1;->f0()LA7/i;

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    invoke-virtual {v3}, LA7/B0;->c0()V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    const-string v4, "Clearing complex main event info. appId"

    .line 369
    .line 370
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 371
    .line 372
    invoke-virtual {v0, v4, v13}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    :try_start_b
    invoke-virtual {v3}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    const-string v4, "delete from main_event_params where app_id=?"

    .line 380
    .line 381
    filled-new-array {v13}, [Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v6

    .line 385
    invoke-virtual {v0, v4, v6}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_7

    .line 386
    .line 387
    .line 388
    :goto_d
    move-object v3, v14

    .line 389
    goto :goto_e

    .line 390
    :catch_7
    move-exception v0

    .line 391
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    const-string v4, "Error clearing complex main event"

    .line 396
    .line 397
    iget-object v3, v3, LA7/N;->f:LA7/P;

    .line 398
    .line 399
    invoke-virtual {v3, v4, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    goto :goto_d

    .line 403
    :cond_9
    move-object v3, v14

    .line 404
    move-object v14, v13

    .line 405
    invoke-virtual {v1}, LA7/H1;->f0()LA7/i;

    .line 406
    .line 407
    .line 408
    move-result-object v13

    .line 409
    move-object v15, v6

    .line 410
    invoke-virtual/range {v13 .. v18}, LA7/i;->I0(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/zzfy$zzf;)V

    .line 411
    .line 412
    .line 413
    :goto_e
    new-instance v14, Ljava/util/ArrayList;

    .line 414
    .line 415
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzh()Ljava/util/List;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    :cond_a
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 427
    .line 428
    .line 429
    move-result v4

    .line 430
    if-eqz v4, :cond_b

    .line 431
    .line 432
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v4

    .line 436
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzfy$zzh;

    .line 437
    .line 438
    invoke-virtual {v1}, LA7/H1;->e0()LA7/S1;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzg()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v6

    .line 445
    invoke-static {v12, v6}, LA7/S1;->s0(Lcom/google/android/gms/internal/measurement/zzfy$zzf;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfy$zzh;

    .line 446
    .line 447
    .line 448
    move-result-object v6

    .line 449
    if-nez v6, :cond_a

    .line 450
    .line 451
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    goto :goto_f

    .line 455
    :cond_b
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 456
    .line 457
    .line 458
    move-result v0

    .line 459
    if-nez v0, :cond_c

    .line 460
    .line 461
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 462
    .line 463
    .line 464
    :goto_10
    move-object v0, v5

    .line 465
    move-wide/from16 v10, v16

    .line 466
    .line 467
    move-object/from16 v8, v18

    .line 468
    .line 469
    move-object/from16 v17, v12

    .line 470
    .line 471
    goto/16 :goto_15

    .line 472
    .line 473
    :cond_c
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    const-string v4, "No unique parameters in main event. eventName"

    .line 478
    .line 479
    iget-object v0, v0, LA7/N;->g:LA7/P;

    .line 480
    .line 481
    invoke-virtual {v0, v4, v5}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    move-object v14, v3

    .line 485
    goto :goto_10

    .line 486
    :goto_11
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    const-string v3, "Extra parameter without existing main event. eventName, eventId"

    .line 491
    .line 492
    iget-object v0, v0, LA7/N;->g:LA7/P;

    .line 493
    .line 494
    invoke-virtual {v0, v5, v3, v14}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    goto/16 :goto_2

    .line 498
    .line 499
    :goto_12
    if-eqz v5, :cond_d

    .line 500
    .line 501
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 502
    .line 503
    .line 504
    :cond_d
    throw v0

    .line 505
    :cond_e
    move-object/from16 v25, v4

    .line 506
    .line 507
    move-object v3, v14

    .line 508
    move-object v14, v6

    .line 509
    if-eqz v16, :cond_11

    .line 510
    .line 511
    invoke-virtual {v1}, LA7/H1;->e0()LA7/S1;

    .line 512
    .line 513
    .line 514
    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 515
    .line 516
    .line 517
    move-result-object v4

    .line 518
    const-string v5, "_epc"

    .line 519
    .line 520
    invoke-static {v12, v5}, LA7/S1;->M0(Lcom/google/android/gms/internal/measurement/zzfy$zzf;Ljava/lang/String;)Ljava/io/Serializable;

    .line 521
    .line 522
    .line 523
    move-result-object v5

    .line 524
    if-nez v5, :cond_f

    .line 525
    .line 526
    goto :goto_13

    .line 527
    :cond_f
    move-object v4, v5

    .line 528
    :goto_13
    check-cast v4, Ljava/lang/Long;

    .line 529
    .line 530
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 531
    .line 532
    .line 533
    move-result-wide v15

    .line 534
    cmp-long v4, v15, v19

    .line 535
    .line 536
    if-gtz v4, :cond_10

    .line 537
    .line 538
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 539
    .line 540
    .line 541
    move-result-object v4

    .line 542
    const-string v5, "Complex event with zero extra param count. eventName"

    .line 543
    .line 544
    iget-object v4, v4, LA7/N;->g:LA7/P;

    .line 545
    .line 546
    invoke-virtual {v4, v5, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    move-object v8, v12

    .line 550
    move-object/from16 v17, v8

    .line 551
    .line 552
    move-object v9, v14

    .line 553
    move-wide v10, v15

    .line 554
    goto :goto_14

    .line 555
    :cond_10
    move-object/from16 v17, v12

    .line 556
    .line 557
    invoke-virtual {v1}, LA7/H1;->f0()LA7/i;

    .line 558
    .line 559
    .line 560
    move-result-object v12

    .line 561
    invoke-static {v14}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v12 .. v17}, LA7/i;->I0(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/zzfy$zzf;)V

    .line 565
    .line 566
    .line 567
    move-object v9, v14

    .line 568
    move-wide v10, v15

    .line 569
    move-object/from16 v8, v17

    .line 570
    .line 571
    goto :goto_14

    .line 572
    :cond_11
    move-object/from16 v17, v12

    .line 573
    .line 574
    :goto_14
    move-object v14, v3

    .line 575
    :goto_15
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzjt;->zzcd()Lcom/google/android/gms/internal/measurement/zzjt$zzb;

    .line 576
    .line 577
    .line 578
    move-result-object v3

    .line 579
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzfy$zzf$zza;

    .line 580
    .line 581
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/measurement/zzfy$zzf$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfy$zzf$zza;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfy$zzf$zza;->zzd()Lcom/google/android/gms/internal/measurement/zzfy$zzf$zza;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    invoke-virtual {v0, v14}, Lcom/google/android/gms/internal/measurement/zzfy$zzf$zza;->zza(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfy$zzf$zza;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjt$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzlc;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzjt;

    .line 598
    .line 599
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfy$zzf;

    .line 600
    .line 601
    move-object v3, v0

    .line 602
    :goto_16
    if-eqz v3, :cond_55

    .line 603
    .line 604
    invoke-virtual {v1}, LA7/H1;->f0()LA7/i;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    iget-object v4, v1, LA7/W1;->d:Ljava/lang/String;

    .line 609
    .line 610
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzg()Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v5

    .line 614
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzg()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v6

    .line 618
    const-string v7, "events"

    .line 619
    .line 620
    invoke-virtual {v0, v7, v4, v6}, LA7/i;->b1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LA7/t;

    .line 621
    .line 622
    .line 623
    move-result-object v6

    .line 624
    if-nez v6, :cond_12

    .line 625
    .line 626
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 627
    .line 628
    .line 629
    move-result-object v6

    .line 630
    invoke-static {v4}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 631
    .line 632
    .line 633
    move-result-object v12

    .line 634
    iget-object v0, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v0, LA7/n0;

    .line 637
    .line 638
    iget-object v0, v0, LA7/n0;->m:LA7/J;

    .line 639
    .line 640
    invoke-virtual {v0, v5}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    iget-object v5, v6, LA7/N;->i:LA7/P;

    .line 645
    .line 646
    const-string v6, "Event aggregate wasn\'t created during raw event logging. appId, event"

    .line 647
    .line 648
    invoke-virtual {v5, v12, v6, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 649
    .line 650
    .line 651
    new-instance v26, LA7/t;

    .line 652
    .line 653
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzg()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v28

    .line 657
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzd()J

    .line 658
    .line 659
    .line 660
    move-result-wide v35

    .line 661
    const/16 v39, 0x0

    .line 662
    .line 663
    const/16 v40, 0x0

    .line 664
    .line 665
    const-wide/16 v29, 0x1

    .line 666
    .line 667
    const-wide/16 v31, 0x1

    .line 668
    .line 669
    const-wide/16 v33, 0x1

    .line 670
    .line 671
    const-wide/16 v37, 0x0

    .line 672
    .line 673
    const/16 v41, 0x0

    .line 674
    .line 675
    const/16 v42, 0x0

    .line 676
    .line 677
    move-object/from16 v27, v4

    .line 678
    .line 679
    invoke-direct/range {v26 .. v42}, LA7/t;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 680
    .line 681
    .line 682
    move-object v15, v3

    .line 683
    move-object/from16 v3, v26

    .line 684
    .line 685
    goto :goto_17

    .line 686
    :cond_12
    new-instance v27, LA7/t;

    .line 687
    .line 688
    iget-wide v4, v6, LA7/t;->c:J

    .line 689
    .line 690
    add-long v30, v4, v21

    .line 691
    .line 692
    iget-wide v4, v6, LA7/t;->d:J

    .line 693
    .line 694
    add-long v32, v4, v21

    .line 695
    .line 696
    iget-wide v4, v6, LA7/t;->e:J

    .line 697
    .line 698
    add-long v34, v4, v21

    .line 699
    .line 700
    iget-object v0, v6, LA7/t;->h:Ljava/lang/Long;

    .line 701
    .line 702
    iget-object v4, v6, LA7/t;->i:Ljava/lang/Long;

    .line 703
    .line 704
    iget-object v5, v6, LA7/t;->a:Ljava/lang/String;

    .line 705
    .line 706
    iget-object v12, v6, LA7/t;->b:Ljava/lang/String;

    .line 707
    .line 708
    iget-wide v13, v6, LA7/t;->f:J

    .line 709
    .line 710
    move-object v15, v3

    .line 711
    move-object/from16 v41, v4

    .line 712
    .line 713
    iget-wide v3, v6, LA7/t;->g:J

    .line 714
    .line 715
    move-object/from16 v40, v0

    .line 716
    .line 717
    iget-object v0, v6, LA7/t;->j:Ljava/lang/Long;

    .line 718
    .line 719
    iget-object v6, v6, LA7/t;->k:Ljava/lang/Boolean;

    .line 720
    .line 721
    move-object/from16 v42, v0

    .line 722
    .line 723
    move-wide/from16 v38, v3

    .line 724
    .line 725
    move-object/from16 v28, v5

    .line 726
    .line 727
    move-object/from16 v43, v6

    .line 728
    .line 729
    move-object/from16 v29, v12

    .line 730
    .line 731
    move-wide/from16 v36, v13

    .line 732
    .line 733
    invoke-direct/range {v27 .. v43}, LA7/t;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 734
    .line 735
    .line 736
    move-object/from16 v3, v27

    .line 737
    .line 738
    :goto_17
    invoke-virtual {v1}, LA7/H1;->f0()LA7/i;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    invoke-virtual {v0, v7, v3}, LA7/i;->D0(Ljava/lang/String;LA7/t;)V

    .line 743
    .line 744
    .line 745
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    .line 746
    .line 747
    .line 748
    move-result v0

    .line 749
    iget-object v4, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 750
    .line 751
    check-cast v4, LA7/n0;

    .line 752
    .line 753
    if-eqz v0, :cond_14

    .line 754
    .line 755
    iget-object v0, v4, LA7/n0;->g:LA7/e;

    .line 756
    .line 757
    sget-object v5, LA7/y;->Y0:LA7/D;

    .line 758
    .line 759
    const/4 v6, 0x0

    .line 760
    invoke-virtual {v0, v6, v5}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 761
    .line 762
    .line 763
    move-result v0

    .line 764
    if-eqz v0, :cond_15

    .line 765
    .line 766
    if-nez p2, :cond_13

    .line 767
    .line 768
    goto :goto_19

    .line 769
    :cond_13
    :goto_18
    move-object/from16 v4, v25

    .line 770
    .line 771
    const/4 v3, 0x0

    .line 772
    goto/16 :goto_0

    .line 773
    .line 774
    :cond_14
    const/4 v6, 0x0

    .line 775
    :cond_15
    :goto_19
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzg()Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v5

    .line 779
    invoke-virtual {v2, v5}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    check-cast v0, Ljava/util/Map;

    .line 784
    .line 785
    if-nez v0, :cond_1b

    .line 786
    .line 787
    invoke-virtual {v1}, LA7/H1;->f0()LA7/i;

    .line 788
    .line 789
    .line 790
    move-result-object v7

    .line 791
    iget-object v12, v1, LA7/W1;->d:Ljava/lang/String;

    .line 792
    .line 793
    invoke-virtual {v7}, LA7/G1;->h0()V

    .line 794
    .line 795
    .line 796
    invoke-virtual {v7}, LA7/B0;->c0()V

    .line 797
    .line 798
    .line 799
    invoke-static {v12}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 800
    .line 801
    .line 802
    invoke-static {v5}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    new-instance v13, Lx/e;

    .line 806
    .line 807
    const/4 v14, 0x0

    .line 808
    invoke-direct {v13, v14}, Lx/v;-><init>(I)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v7}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 812
    .line 813
    .line 814
    move-result-object v26

    .line 815
    :try_start_c
    const-string v27, "event_filters"

    .line 816
    .line 817
    const-string v0, "audience_id"

    .line 818
    .line 819
    const-string v14, "data"

    .line 820
    .line 821
    filled-new-array {v0, v14}, [Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object v28

    .line 825
    const-string v29, "app_id=? AND event_name=?"

    .line 826
    .line 827
    filled-new-array {v12, v5}, [Ljava/lang/String;

    .line 828
    .line 829
    .line 830
    move-result-object v30

    .line 831
    const/16 v31, 0x0

    .line 832
    .line 833
    const/16 v32, 0x0

    .line 834
    .line 835
    const/16 v33, 0x0

    .line 836
    .line 837
    invoke-virtual/range {v26 .. v33}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 838
    .line 839
    .line 840
    move-result-object v14
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 841
    :try_start_d
    invoke-interface {v14}, Landroid/database/Cursor;->moveToFirst()Z

    .line 842
    .line 843
    .line 844
    move-result v0

    .line 845
    if-nez v0, :cond_16

    .line 846
    .line 847
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_8
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 848
    .line 849
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 850
    .line 851
    .line 852
    move-object/from16 v16, v8

    .line 853
    .line 854
    goto/16 :goto_1f

    .line 855
    .line 856
    :catchall_4
    move-exception v0

    .line 857
    move-object v5, v14

    .line 858
    goto/16 :goto_20

    .line 859
    .line 860
    :catch_8
    move-exception v0

    .line 861
    move-object/from16 v17, v7

    .line 862
    .line 863
    :goto_1a
    move-object/from16 v16, v8

    .line 864
    .line 865
    goto/16 :goto_1e

    .line 866
    .line 867
    :cond_16
    :goto_1b
    const/4 v6, 0x1

    .line 868
    :try_start_e
    invoke-interface {v14, v6}, Landroid/database/Cursor;->getBlob(I)[B

    .line 869
    .line 870
    .line 871
    move-result-object v0
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_8
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 872
    :try_start_f
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzc()Lcom/google/android/gms/internal/measurement/zzfo$zzb$zza;

    .line 873
    .line 874
    .line 875
    move-result-object v6

    .line 876
    invoke-static {v6, v0}, LA7/S1;->t0(Lcom/google/android/gms/internal/measurement/zzjt$zzb;[B)Lcom/google/android/gms/internal/measurement/zzlb;

    .line 877
    .line 878
    .line 879
    move-result-object v0

    .line 880
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfo$zzb$zza;

    .line 881
    .line 882
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjt$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzlc;

    .line 883
    .line 884
    .line 885
    move-result-object v0

    .line 886
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzjt;

    .line 887
    .line 888
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfo$zzb;
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_8
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 889
    .line 890
    const/4 v6, 0x0

    .line 891
    :try_start_10
    invoke-interface {v14, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 892
    .line 893
    .line 894
    move-result v16

    .line 895
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 896
    .line 897
    .line 898
    move-result-object v6

    .line 899
    invoke-virtual {v13, v6}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v6

    .line 903
    check-cast v6, Ljava/util/List;

    .line 904
    .line 905
    if-nez v6, :cond_17

    .line 906
    .line 907
    new-instance v6, Ljava/util/ArrayList;

    .line 908
    .line 909
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_8
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 910
    .line 911
    .line 912
    move-object/from16 v17, v7

    .line 913
    .line 914
    :try_start_11
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 915
    .line 916
    .line 917
    move-result-object v7

    .line 918
    invoke-virtual {v13, v7, v6}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 919
    .line 920
    .line 921
    goto :goto_1c

    .line 922
    :catch_9
    move-exception v0

    .line 923
    goto :goto_1a

    .line 924
    :cond_17
    move-object/from16 v17, v7

    .line 925
    .line 926
    :goto_1c
    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 927
    .line 928
    .line 929
    move-object/from16 v16, v8

    .line 930
    .line 931
    goto :goto_1d

    .line 932
    :catch_a
    move-exception v0

    .line 933
    move-object/from16 v17, v7

    .line 934
    .line 935
    invoke-virtual/range {v17 .. v17}, LA7/B0;->zzj()LA7/N;

    .line 936
    .line 937
    .line 938
    move-result-object v6

    .line 939
    iget-object v6, v6, LA7/N;->f:LA7/P;

    .line 940
    .line 941
    const-string v7, "Failed to merge filter. appId"
    :try_end_11
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_11 .. :try_end_11} :catch_9
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 942
    .line 943
    move-object/from16 v16, v8

    .line 944
    .line 945
    :try_start_12
    invoke-static {v12}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 946
    .line 947
    .line 948
    move-result-object v8

    .line 949
    invoke-virtual {v6, v8, v7, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 950
    .line 951
    .line 952
    :goto_1d
    invoke-interface {v14}, Landroid/database/Cursor;->moveToNext()Z

    .line 953
    .line 954
    .line 955
    move-result v0
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_b
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    .line 956
    if-nez v0, :cond_18

    .line 957
    .line 958
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 959
    .line 960
    .line 961
    move-object v0, v13

    .line 962
    goto :goto_1f

    .line 963
    :cond_18
    move-object/from16 v8, v16

    .line 964
    .line 965
    move-object/from16 v7, v17

    .line 966
    .line 967
    goto :goto_1b

    .line 968
    :catch_b
    move-exception v0

    .line 969
    goto :goto_1e

    .line 970
    :catchall_5
    move-exception v0

    .line 971
    const/4 v5, 0x0

    .line 972
    goto :goto_20

    .line 973
    :catch_c
    move-exception v0

    .line 974
    move-object/from16 v17, v7

    .line 975
    .line 976
    move-object/from16 v16, v8

    .line 977
    .line 978
    const/4 v14, 0x0

    .line 979
    :goto_1e
    :try_start_13
    invoke-virtual/range {v17 .. v17}, LA7/B0;->zzj()LA7/N;

    .line 980
    .line 981
    .line 982
    move-result-object v6

    .line 983
    iget-object v6, v6, LA7/N;->f:LA7/P;

    .line 984
    .line 985
    const-string v7, "Database error querying filters. appId"

    .line 986
    .line 987
    invoke-static {v12}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 988
    .line 989
    .line 990
    move-result-object v8

    .line 991
    invoke-virtual {v6, v8, v7, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 992
    .line 993
    .line 994
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    .line 995
    .line 996
    if-eqz v14, :cond_19

    .line 997
    .line 998
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 999
    .line 1000
    .line 1001
    :cond_19
    :goto_1f
    invoke-virtual {v2, v5, v0}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    goto :goto_21

    .line 1005
    :goto_20
    if-eqz v5, :cond_1a

    .line 1006
    .line 1007
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 1008
    .line 1009
    .line 1010
    :cond_1a
    throw v0

    .line 1011
    :cond_1b
    move-object/from16 v16, v8

    .line 1012
    .line 1013
    :goto_21
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v5

    .line 1017
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v5

    .line 1021
    :goto_22
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1022
    .line 1023
    .line 1024
    move-result v6

    .line 1025
    if-eqz v6, :cond_54

    .line 1026
    .line 1027
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v6

    .line 1031
    check-cast v6, Ljava/lang/Integer;

    .line 1032
    .line 1033
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1034
    .line 1035
    .line 1036
    iget-object v7, v1, LA7/W1;->e:Ljava/util/HashSet;

    .line 1037
    .line 1038
    invoke-virtual {v7, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1039
    .line 1040
    .line 1041
    move-result v7

    .line 1042
    if-eqz v7, :cond_1c

    .line 1043
    .line 1044
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v7

    .line 1048
    const-string v8, "Skipping failed audience ID"

    .line 1049
    .line 1050
    iget-object v7, v7, LA7/N;->n:LA7/P;

    .line 1051
    .line 1052
    invoke-virtual {v7, v8, v6}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1053
    .line 1054
    .line 1055
    goto :goto_22

    .line 1056
    :cond_1c
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v7

    .line 1060
    check-cast v7, Ljava/util/List;

    .line 1061
    .line 1062
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v7

    .line 1066
    const/4 v8, 0x1

    .line 1067
    :goto_23
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1068
    .line 1069
    .line 1070
    move-result v12

    .line 1071
    if-eqz v12, :cond_52

    .line 1072
    .line 1073
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v8

    .line 1077
    check-cast v8, Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    .line 1078
    .line 1079
    new-instance v12, LA7/Z1;

    .line 1080
    .line 1081
    iget-object v13, v1, LA7/W1;->d:Ljava/lang/String;

    .line 1082
    .line 1083
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 1084
    .line 1085
    .line 1086
    iput-object v8, v12, LA7/Z1;->e:Lcom/google/android/gms/internal/measurement/zzfo$zzb;

    .line 1087
    .line 1088
    iget-object v14, v1, LA7/W1;->g:Ljava/lang/Long;

    .line 1089
    .line 1090
    move-object/from16 v17, v0

    .line 1091
    .line 1092
    iget-object v0, v1, LA7/W1;->h:Ljava/lang/Long;

    .line 1093
    .line 1094
    move-object/from16 v18, v0

    .line 1095
    .line 1096
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzb()I

    .line 1097
    .line 1098
    .line 1099
    move-result v0

    .line 1100
    move-object/from16 v21, v2

    .line 1101
    .line 1102
    iget-object v2, v1, LA7/W1;->f:Lx/e;

    .line 1103
    .line 1104
    invoke-virtual {v2, v6}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v2

    .line 1108
    check-cast v2, LA7/X1;

    .line 1109
    .line 1110
    if-nez v2, :cond_1d

    .line 1111
    .line 1112
    const/4 v0, 0x0

    .line 1113
    goto :goto_24

    .line 1114
    :cond_1d
    iget-object v2, v2, LA7/X1;->d:Ljava/util/BitSet;

    .line 1115
    .line 1116
    invoke-virtual {v2, v0}, Ljava/util/BitSet;->get(I)Z

    .line 1117
    .line 1118
    .line 1119
    move-result v0

    .line 1120
    :goto_24
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoe;->zza()Z

    .line 1121
    .line 1122
    .line 1123
    move-result v2

    .line 1124
    if-eqz v2, :cond_1e

    .line 1125
    .line 1126
    iget-object v2, v4, LA7/n0;->g:LA7/e;

    .line 1127
    .line 1128
    move/from16 v22, v0

    .line 1129
    .line 1130
    sget-object v0, LA7/y;->p0:LA7/D;

    .line 1131
    .line 1132
    invoke-virtual {v2, v13, v0}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 1133
    .line 1134
    .line 1135
    move-result v0

    .line 1136
    if-eqz v0, :cond_1f

    .line 1137
    .line 1138
    const/4 v0, 0x1

    .line 1139
    goto :goto_25

    .line 1140
    :cond_1e
    move/from16 v22, v0

    .line 1141
    .line 1142
    :cond_1f
    const/4 v0, 0x0

    .line 1143
    :goto_25
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzj()Z

    .line 1144
    .line 1145
    .line 1146
    move-result v2

    .line 1147
    if-eqz v2, :cond_20

    .line 1148
    .line 1149
    move-object v2, v7

    .line 1150
    move-object/from16 v26, v8

    .line 1151
    .line 1152
    iget-wide v7, v3, LA7/t;->e:J

    .line 1153
    .line 1154
    :goto_26
    move/from16 v27, v0

    .line 1155
    .line 1156
    goto :goto_27

    .line 1157
    :cond_20
    move-object v2, v7

    .line 1158
    move-object/from16 v26, v8

    .line 1159
    .line 1160
    iget-wide v7, v3, LA7/t;->c:J

    .line 1161
    .line 1162
    goto :goto_26

    .line 1163
    :goto_27
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v0

    .line 1167
    move-object/from16 v28, v2

    .line 1168
    .line 1169
    const/4 v2, 0x2

    .line 1170
    invoke-virtual {v0, v2}, LA7/N;->l0(I)Z

    .line 1171
    .line 1172
    .line 1173
    move-result v0

    .line 1174
    if-eqz v0, :cond_26

    .line 1175
    .line 1176
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v0

    .line 1180
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzl()Z

    .line 1181
    .line 1182
    .line 1183
    move-result v29

    .line 1184
    if-eqz v29, :cond_21

    .line 1185
    .line 1186
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzb()I

    .line 1187
    .line 1188
    .line 1189
    move-result v29

    .line 1190
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v29

    .line 1194
    move-object/from16 v2, v29

    .line 1195
    .line 1196
    :goto_28
    move-object/from16 v30, v3

    .line 1197
    .line 1198
    goto :goto_29

    .line 1199
    :cond_21
    const/4 v2, 0x0

    .line 1200
    goto :goto_28

    .line 1201
    :goto_29
    iget-object v3, v4, LA7/n0;->m:LA7/J;

    .line 1202
    .line 1203
    move-object/from16 v31, v5

    .line 1204
    .line 1205
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzf()Ljava/lang/String;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v5

    .line 1209
    invoke-virtual {v3, v5}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v3

    .line 1213
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 1214
    .line 1215
    const-string v5, "Evaluating filter. audience, filter, event"

    .line 1216
    .line 1217
    invoke-virtual {v0, v6, v2, v3, v5}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1218
    .line 1219
    .line 1220
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v0

    .line 1224
    invoke-virtual {v1}, LA7/H1;->e0()LA7/S1;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v2

    .line 1228
    const-string v3, "\nevent_filter {\n"

    .line 1229
    .line 1230
    invoke-static {v3}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v3

    .line 1234
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzl()Z

    .line 1235
    .line 1236
    .line 1237
    move-result v5

    .line 1238
    if-eqz v5, :cond_22

    .line 1239
    .line 1240
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzb()I

    .line 1241
    .line 1242
    .line 1243
    move-result v5

    .line 1244
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v5

    .line 1248
    move-object/from16 v32, v9

    .line 1249
    .line 1250
    const-string v9, "filter_id"

    .line 1251
    .line 1252
    move-wide/from16 v33, v10

    .line 1253
    .line 1254
    const/4 v10, 0x0

    .line 1255
    invoke-static {v3, v10, v9, v5}, LA7/S1;->H0(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 1256
    .line 1257
    .line 1258
    goto :goto_2a

    .line 1259
    :cond_22
    move-object/from16 v32, v9

    .line 1260
    .line 1261
    move-wide/from16 v33, v10

    .line 1262
    .line 1263
    const/4 v10, 0x0

    .line 1264
    :goto_2a
    iget-object v5, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 1265
    .line 1266
    check-cast v5, LA7/n0;

    .line 1267
    .line 1268
    iget-object v5, v5, LA7/n0;->m:LA7/J;

    .line 1269
    .line 1270
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzf()Ljava/lang/String;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v9

    .line 1274
    invoke-virtual {v5, v9}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v5

    .line 1278
    const-string v9, "event_name"

    .line 1279
    .line 1280
    invoke-static {v3, v10, v9, v5}, LA7/S1;->H0(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 1281
    .line 1282
    .line 1283
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzh()Z

    .line 1284
    .line 1285
    .line 1286
    move-result v5

    .line 1287
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzi()Z

    .line 1288
    .line 1289
    .line 1290
    move-result v9

    .line 1291
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzj()Z

    .line 1292
    .line 1293
    .line 1294
    move-result v11

    .line 1295
    invoke-static {v5, v9, v11}, LA7/S1;->v0(ZZZ)Ljava/lang/String;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v5

    .line 1299
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 1300
    .line 1301
    .line 1302
    move-result v9

    .line 1303
    if-nez v9, :cond_23

    .line 1304
    .line 1305
    const-string v9, "filter_type"

    .line 1306
    .line 1307
    invoke-static {v3, v10, v9, v5}, LA7/S1;->H0(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 1308
    .line 1309
    .line 1310
    :cond_23
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzk()Z

    .line 1311
    .line 1312
    .line 1313
    move-result v5

    .line 1314
    if-eqz v5, :cond_24

    .line 1315
    .line 1316
    const-string v5, "event_count_filter"

    .line 1317
    .line 1318
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zze()Lcom/google/android/gms/internal/measurement/zzfo$zzd;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v9

    .line 1322
    const/4 v10, 0x1

    .line 1323
    invoke-static {v3, v10, v5, v9}, LA7/S1;->G0(Ljava/lang/StringBuilder;ILjava/lang/String;Lcom/google/android/gms/internal/measurement/zzfo$zzd;)V

    .line 1324
    .line 1325
    .line 1326
    :cond_24
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zza()I

    .line 1327
    .line 1328
    .line 1329
    move-result v5

    .line 1330
    if-lez v5, :cond_25

    .line 1331
    .line 1332
    const-string v5, "  filters {\n"

    .line 1333
    .line 1334
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1335
    .line 1336
    .line 1337
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzg()Ljava/util/List;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v5

    .line 1341
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v5

    .line 1345
    :goto_2b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1346
    .line 1347
    .line 1348
    move-result v9

    .line 1349
    if-eqz v9, :cond_25

    .line 1350
    .line 1351
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v9

    .line 1355
    check-cast v9, Lcom/google/android/gms/internal/measurement/zzfo$zzc;

    .line 1356
    .line 1357
    const/4 v10, 0x2

    .line 1358
    invoke-virtual {v2, v3, v10, v9}, LA7/S1;->F0(Ljava/lang/StringBuilder;ILcom/google/android/gms/internal/measurement/zzfo$zzc;)V

    .line 1359
    .line 1360
    .line 1361
    goto :goto_2b

    .line 1362
    :cond_25
    const/4 v10, 0x1

    .line 1363
    invoke-static {v3, v10}, LA7/S1;->E0(Ljava/lang/StringBuilder;I)V

    .line 1364
    .line 1365
    .line 1366
    const-string v2, "}\n}\n"

    .line 1367
    .line 1368
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1369
    .line 1370
    .line 1371
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v2

    .line 1375
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 1376
    .line 1377
    const-string v3, "Filter definition"

    .line 1378
    .line 1379
    invoke-virtual {v0, v3, v2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1380
    .line 1381
    .line 1382
    goto :goto_2c

    .line 1383
    :cond_26
    move-object/from16 v30, v3

    .line 1384
    .line 1385
    move-object/from16 v31, v5

    .line 1386
    .line 1387
    move-object/from16 v32, v9

    .line 1388
    .line 1389
    move-wide/from16 v33, v10

    .line 1390
    .line 1391
    const/4 v10, 0x1

    .line 1392
    :goto_2c
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzl()Z

    .line 1393
    .line 1394
    .line 1395
    move-result v0

    .line 1396
    if-eqz v0, :cond_4f

    .line 1397
    .line 1398
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzb()I

    .line 1399
    .line 1400
    .line 1401
    move-result v0

    .line 1402
    const/16 v2, 0x100

    .line 1403
    .line 1404
    if-le v0, v2, :cond_27

    .line 1405
    .line 1406
    goto/16 :goto_3e

    .line 1407
    .line 1408
    :cond_27
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzh()Z

    .line 1409
    .line 1410
    .line 1411
    move-result v0

    .line 1412
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzi()Z

    .line 1413
    .line 1414
    .line 1415
    move-result v2

    .line 1416
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzj()Z

    .line 1417
    .line 1418
    .line 1419
    move-result v3

    .line 1420
    if-nez v0, :cond_29

    .line 1421
    .line 1422
    if-nez v2, :cond_29

    .line 1423
    .line 1424
    if-eqz v3, :cond_28

    .line 1425
    .line 1426
    goto :goto_2d

    .line 1427
    :cond_28
    const/4 v0, 0x0

    .line 1428
    goto :goto_2e

    .line 1429
    :cond_29
    :goto_2d
    move v0, v10

    .line 1430
    :goto_2e
    if-eqz v22, :cond_2b

    .line 1431
    .line 1432
    if-nez v0, :cond_2b

    .line 1433
    .line 1434
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v0

    .line 1438
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzl()Z

    .line 1439
    .line 1440
    .line 1441
    move-result v2

    .line 1442
    if-eqz v2, :cond_2a

    .line 1443
    .line 1444
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzb()I

    .line 1445
    .line 1446
    .line 1447
    move-result v2

    .line 1448
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v2

    .line 1452
    goto :goto_2f

    .line 1453
    :cond_2a
    const/4 v2, 0x0

    .line 1454
    :goto_2f
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 1455
    .line 1456
    const-string v3, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"

    .line 1457
    .line 1458
    invoke-virtual {v0, v6, v3, v2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1459
    .line 1460
    .line 1461
    move v8, v10

    .line 1462
    goto/16 :goto_40

    .line 1463
    .line 1464
    :cond_2b
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzg()Ljava/lang/String;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v2

    .line 1468
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzk()Z

    .line 1469
    .line 1470
    .line 1471
    move-result v3

    .line 1472
    if-eqz v3, :cond_2d

    .line 1473
    .line 1474
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zze()Lcom/google/android/gms/internal/measurement/zzfo$zzd;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v3

    .line 1478
    invoke-static {v7, v8, v3}, LA7/c;->b(JLcom/google/android/gms/internal/measurement/zzfo$zzd;)Ljava/lang/Boolean;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v3

    .line 1482
    if-nez v3, :cond_2c

    .line 1483
    .line 1484
    :goto_30
    const/4 v2, 0x0

    .line 1485
    goto/16 :goto_39

    .line 1486
    .line 1487
    :cond_2c
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1488
    .line 1489
    .line 1490
    move-result v3

    .line 1491
    if-nez v3, :cond_2d

    .line 1492
    .line 1493
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1494
    .line 1495
    goto/16 :goto_39

    .line 1496
    .line 1497
    :cond_2d
    new-instance v3, Ljava/util/HashSet;

    .line 1498
    .line 1499
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 1500
    .line 1501
    .line 1502
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzg()Ljava/util/List;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v5

    .line 1506
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v5

    .line 1510
    :goto_31
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1511
    .line 1512
    .line 1513
    move-result v7

    .line 1514
    if-eqz v7, :cond_2f

    .line 1515
    .line 1516
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v7

    .line 1520
    check-cast v7, Lcom/google/android/gms/internal/measurement/zzfo$zzc;

    .line 1521
    .line 1522
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zze()Ljava/lang/String;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v8

    .line 1526
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 1527
    .line 1528
    .line 1529
    move-result v8

    .line 1530
    if-eqz v8, :cond_2e

    .line 1531
    .line 1532
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v3

    .line 1536
    iget-object v5, v4, LA7/n0;->m:LA7/J;

    .line 1537
    .line 1538
    invoke-virtual {v5, v2}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v2

    .line 1542
    iget-object v3, v3, LA7/N;->i:LA7/P;

    .line 1543
    .line 1544
    const-string v5, "null or empty param name in filter. event"

    .line 1545
    .line 1546
    invoke-virtual {v3, v5, v2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1547
    .line 1548
    .line 1549
    goto :goto_30

    .line 1550
    :cond_2e
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zze()Ljava/lang/String;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v7

    .line 1554
    invoke-virtual {v3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1555
    .line 1556
    .line 1557
    goto :goto_31

    .line 1558
    :cond_2f
    new-instance v5, Lx/e;

    .line 1559
    .line 1560
    const/4 v7, 0x0

    .line 1561
    invoke-direct {v5, v7}, Lx/v;-><init>(I)V

    .line 1562
    .line 1563
    .line 1564
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzh()Ljava/util/List;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v8

    .line 1568
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v8

    .line 1572
    :cond_30
    :goto_32
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1573
    .line 1574
    .line 1575
    move-result v9

    .line 1576
    if-eqz v9, :cond_36

    .line 1577
    .line 1578
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v9

    .line 1582
    check-cast v9, Lcom/google/android/gms/internal/measurement/zzfy$zzh;

    .line 1583
    .line 1584
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzg()Ljava/lang/String;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v11

    .line 1588
    invoke-virtual {v3, v11}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1589
    .line 1590
    .line 1591
    move-result v11

    .line 1592
    if-eqz v11, :cond_30

    .line 1593
    .line 1594
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzl()Z

    .line 1595
    .line 1596
    .line 1597
    move-result v11

    .line 1598
    if-eqz v11, :cond_32

    .line 1599
    .line 1600
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzg()Ljava/lang/String;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v11

    .line 1604
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzl()Z

    .line 1605
    .line 1606
    .line 1607
    move-result v13

    .line 1608
    if-eqz v13, :cond_31

    .line 1609
    .line 1610
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzd()J

    .line 1611
    .line 1612
    .line 1613
    move-result-wide v22

    .line 1614
    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v9

    .line 1618
    goto :goto_33

    .line 1619
    :cond_31
    const/4 v9, 0x0

    .line 1620
    :goto_33
    invoke-virtual {v5, v11, v9}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1621
    .line 1622
    .line 1623
    goto :goto_32

    .line 1624
    :cond_32
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzj()Z

    .line 1625
    .line 1626
    .line 1627
    move-result v11

    .line 1628
    if-eqz v11, :cond_34

    .line 1629
    .line 1630
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzg()Ljava/lang/String;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v11

    .line 1634
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzj()Z

    .line 1635
    .line 1636
    .line 1637
    move-result v13

    .line 1638
    if-eqz v13, :cond_33

    .line 1639
    .line 1640
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zza()D

    .line 1641
    .line 1642
    .line 1643
    move-result-wide v22

    .line 1644
    invoke-static/range {v22 .. v23}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v9

    .line 1648
    goto :goto_34

    .line 1649
    :cond_33
    const/4 v9, 0x0

    .line 1650
    :goto_34
    invoke-virtual {v5, v11, v9}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1651
    .line 1652
    .line 1653
    goto :goto_32

    .line 1654
    :cond_34
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzn()Z

    .line 1655
    .line 1656
    .line 1657
    move-result v11

    .line 1658
    if-eqz v11, :cond_35

    .line 1659
    .line 1660
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzg()Ljava/lang/String;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v11

    .line 1664
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzh()Ljava/lang/String;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v9

    .line 1668
    invoke-virtual {v5, v11, v9}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1669
    .line 1670
    .line 1671
    goto :goto_32

    .line 1672
    :cond_35
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v3

    .line 1676
    iget-object v5, v4, LA7/n0;->m:LA7/J;

    .line 1677
    .line 1678
    invoke-virtual {v5, v2}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v2

    .line 1682
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzfy$zzh;->zzg()Ljava/lang/String;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v5

    .line 1686
    iget-object v8, v4, LA7/n0;->m:LA7/J;

    .line 1687
    .line 1688
    invoke-virtual {v8, v5}, LA7/J;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v5

    .line 1692
    iget-object v3, v3, LA7/N;->i:LA7/P;

    .line 1693
    .line 1694
    const-string v8, "Unknown value for param. event, param"

    .line 1695
    .line 1696
    invoke-virtual {v3, v2, v8, v5}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1697
    .line 1698
    .line 1699
    goto/16 :goto_30

    .line 1700
    .line 1701
    :cond_36
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzg()Ljava/util/List;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v3

    .line 1705
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v3

    .line 1709
    :goto_35
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1710
    .line 1711
    .line 1712
    move-result v8

    .line 1713
    if-eqz v8, :cond_47

    .line 1714
    .line 1715
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v8

    .line 1719
    check-cast v8, Lcom/google/android/gms/internal/measurement/zzfo$zzc;

    .line 1720
    .line 1721
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzg()Z

    .line 1722
    .line 1723
    .line 1724
    move-result v9

    .line 1725
    if-eqz v9, :cond_37

    .line 1726
    .line 1727
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzf()Z

    .line 1728
    .line 1729
    .line 1730
    move-result v9

    .line 1731
    if-eqz v9, :cond_37

    .line 1732
    .line 1733
    move v9, v10

    .line 1734
    goto :goto_36

    .line 1735
    :cond_37
    move v9, v7

    .line 1736
    :goto_36
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zze()Ljava/lang/String;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v11

    .line 1740
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 1741
    .line 1742
    .line 1743
    move-result v13

    .line 1744
    if-eqz v13, :cond_38

    .line 1745
    .line 1746
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v3

    .line 1750
    iget-object v5, v4, LA7/n0;->m:LA7/J;

    .line 1751
    .line 1752
    invoke-virtual {v5, v2}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v2

    .line 1756
    iget-object v3, v3, LA7/N;->i:LA7/P;

    .line 1757
    .line 1758
    const-string v5, "Event has empty param name. event"

    .line 1759
    .line 1760
    invoke-virtual {v3, v5, v2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1761
    .line 1762
    .line 1763
    goto/16 :goto_30

    .line 1764
    .line 1765
    :cond_38
    invoke-virtual {v5, v11}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v13

    .line 1769
    instance-of v7, v13, Ljava/lang/Long;

    .line 1770
    .line 1771
    if-eqz v7, :cond_3c

    .line 1772
    .line 1773
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzh()Z

    .line 1774
    .line 1775
    .line 1776
    move-result v7

    .line 1777
    if-nez v7, :cond_39

    .line 1778
    .line 1779
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v3

    .line 1783
    iget-object v5, v4, LA7/n0;->m:LA7/J;

    .line 1784
    .line 1785
    invoke-virtual {v5, v2}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v2

    .line 1789
    iget-object v5, v4, LA7/n0;->m:LA7/J;

    .line 1790
    .line 1791
    invoke-virtual {v5, v11}, LA7/J;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v5

    .line 1795
    iget-object v3, v3, LA7/N;->i:LA7/P;

    .line 1796
    .line 1797
    const-string v7, "No number filter for long param. event, param"

    .line 1798
    .line 1799
    invoke-virtual {v3, v2, v7, v5}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1800
    .line 1801
    .line 1802
    goto/16 :goto_30

    .line 1803
    .line 1804
    :cond_39
    check-cast v13, Ljava/lang/Long;

    .line 1805
    .line 1806
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 1807
    .line 1808
    .line 1809
    move-result-wide v10

    .line 1810
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzc()Lcom/google/android/gms/internal/measurement/zzfo$zzd;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v7

    .line 1814
    invoke-static {v10, v11, v7}, LA7/c;->b(JLcom/google/android/gms/internal/measurement/zzfo$zzd;)Ljava/lang/Boolean;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v7

    .line 1818
    if-nez v7, :cond_3a

    .line 1819
    .line 1820
    goto/16 :goto_30

    .line 1821
    .line 1822
    :cond_3a
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1823
    .line 1824
    .line 1825
    move-result v7

    .line 1826
    if-ne v7, v9, :cond_3b

    .line 1827
    .line 1828
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1829
    .line 1830
    goto/16 :goto_39

    .line 1831
    .line 1832
    :cond_3b
    const/4 v7, 0x0

    .line 1833
    const/4 v10, 0x1

    .line 1834
    goto :goto_35

    .line 1835
    :cond_3c
    instance-of v7, v13, Ljava/lang/Double;

    .line 1836
    .line 1837
    if-eqz v7, :cond_3f

    .line 1838
    .line 1839
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzh()Z

    .line 1840
    .line 1841
    .line 1842
    move-result v7

    .line 1843
    if-nez v7, :cond_3d

    .line 1844
    .line 1845
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v3

    .line 1849
    iget-object v5, v4, LA7/n0;->m:LA7/J;

    .line 1850
    .line 1851
    invoke-virtual {v5, v2}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v2

    .line 1855
    iget-object v5, v4, LA7/n0;->m:LA7/J;

    .line 1856
    .line 1857
    invoke-virtual {v5, v11}, LA7/J;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v5

    .line 1861
    iget-object v3, v3, LA7/N;->i:LA7/P;

    .line 1862
    .line 1863
    const-string v7, "No number filter for double param. event, param"

    .line 1864
    .line 1865
    invoke-virtual {v3, v2, v7, v5}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1866
    .line 1867
    .line 1868
    goto/16 :goto_30

    .line 1869
    .line 1870
    :cond_3d
    check-cast v13, Ljava/lang/Double;

    .line 1871
    .line 1872
    invoke-virtual {v13}, Ljava/lang/Double;->doubleValue()D

    .line 1873
    .line 1874
    .line 1875
    move-result-wide v10

    .line 1876
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzc()Lcom/google/android/gms/internal/measurement/zzfo$zzd;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v7

    .line 1880
    :try_start_14
    new-instance v8, Ljava/math/BigDecimal;

    .line 1881
    .line 1882
    invoke-direct {v8, v10, v11}, Ljava/math/BigDecimal;-><init>(D)V

    .line 1883
    .line 1884
    .line 1885
    invoke-static {v10, v11}, Ljava/lang/Math;->ulp(D)D

    .line 1886
    .line 1887
    .line 1888
    move-result-wide v10

    .line 1889
    invoke-static {v8, v7, v10, v11}, LA7/c;->e(Ljava/math/BigDecimal;Lcom/google/android/gms/internal/measurement/zzfo$zzd;D)Ljava/lang/Boolean;

    .line 1890
    .line 1891
    .line 1892
    move-result-object v7
    :try_end_14
    .catch Ljava/lang/NumberFormatException; {:try_start_14 .. :try_end_14} :catch_d

    .line 1893
    goto :goto_37

    .line 1894
    :catch_d
    const/4 v7, 0x0

    .line 1895
    :goto_37
    if-nez v7, :cond_3e

    .line 1896
    .line 1897
    goto/16 :goto_30

    .line 1898
    .line 1899
    :cond_3e
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1900
    .line 1901
    .line 1902
    move-result v7

    .line 1903
    if-ne v7, v9, :cond_3b

    .line 1904
    .line 1905
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1906
    .line 1907
    goto/16 :goto_39

    .line 1908
    .line 1909
    :cond_3f
    instance-of v7, v13, Ljava/lang/String;

    .line 1910
    .line 1911
    if-eqz v7, :cond_45

    .line 1912
    .line 1913
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzj()Z

    .line 1914
    .line 1915
    .line 1916
    move-result v7

    .line 1917
    if-eqz v7, :cond_40

    .line 1918
    .line 1919
    check-cast v13, Ljava/lang/String;

    .line 1920
    .line 1921
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzd()Lcom/google/android/gms/internal/measurement/zzfo$zzf;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v7

    .line 1925
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v8

    .line 1929
    invoke-static {v13, v7, v8}, LA7/c;->d(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfo$zzf;LA7/N;)Ljava/lang/Boolean;

    .line 1930
    .line 1931
    .line 1932
    move-result-object v7

    .line 1933
    goto :goto_38

    .line 1934
    :cond_40
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzh()Z

    .line 1935
    .line 1936
    .line 1937
    move-result v7

    .line 1938
    if-eqz v7, :cond_44

    .line 1939
    .line 1940
    check-cast v13, Ljava/lang/String;

    .line 1941
    .line 1942
    invoke-static {v13}, LA7/S1;->N0(Ljava/lang/String;)Z

    .line 1943
    .line 1944
    .line 1945
    move-result v7

    .line 1946
    if-eqz v7, :cond_43

    .line 1947
    .line 1948
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzc()Lcom/google/android/gms/internal/measurement/zzfo$zzd;

    .line 1949
    .line 1950
    .line 1951
    move-result-object v7

    .line 1952
    invoke-static {v13}, LA7/S1;->N0(Ljava/lang/String;)Z

    .line 1953
    .line 1954
    .line 1955
    move-result v8

    .line 1956
    if-nez v8, :cond_41

    .line 1957
    .line 1958
    :catch_e
    const/4 v7, 0x0

    .line 1959
    goto :goto_38

    .line 1960
    :cond_41
    :try_start_15
    new-instance v8, Ljava/math/BigDecimal;

    .line 1961
    .line 1962
    invoke-direct {v8, v13}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 1963
    .line 1964
    .line 1965
    const-wide/16 v10, 0x0

    .line 1966
    .line 1967
    invoke-static {v8, v7, v10, v11}, LA7/c;->e(Ljava/math/BigDecimal;Lcom/google/android/gms/internal/measurement/zzfo$zzd;D)Ljava/lang/Boolean;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v7
    :try_end_15
    .catch Ljava/lang/NumberFormatException; {:try_start_15 .. :try_end_15} :catch_e

    .line 1971
    :goto_38
    if-nez v7, :cond_42

    .line 1972
    .line 1973
    goto/16 :goto_30

    .line 1974
    .line 1975
    :cond_42
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1976
    .line 1977
    .line 1978
    move-result v7

    .line 1979
    if-ne v7, v9, :cond_3b

    .line 1980
    .line 1981
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1982
    .line 1983
    goto :goto_39

    .line 1984
    :cond_43
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v3

    .line 1988
    iget-object v5, v4, LA7/n0;->m:LA7/J;

    .line 1989
    .line 1990
    invoke-virtual {v5, v2}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v2

    .line 1994
    iget-object v5, v4, LA7/n0;->m:LA7/J;

    .line 1995
    .line 1996
    invoke-virtual {v5, v11}, LA7/J;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 1997
    .line 1998
    .line 1999
    move-result-object v5

    .line 2000
    iget-object v3, v3, LA7/N;->i:LA7/P;

    .line 2001
    .line 2002
    const-string v7, "Invalid param value for number filter. event, param"

    .line 2003
    .line 2004
    invoke-virtual {v3, v2, v7, v5}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2005
    .line 2006
    .line 2007
    goto/16 :goto_30

    .line 2008
    .line 2009
    :cond_44
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v3

    .line 2013
    iget-object v5, v4, LA7/n0;->m:LA7/J;

    .line 2014
    .line 2015
    invoke-virtual {v5, v2}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2016
    .line 2017
    .line 2018
    move-result-object v2

    .line 2019
    iget-object v5, v4, LA7/n0;->m:LA7/J;

    .line 2020
    .line 2021
    invoke-virtual {v5, v11}, LA7/J;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v5

    .line 2025
    iget-object v3, v3, LA7/N;->i:LA7/P;

    .line 2026
    .line 2027
    const-string v7, "No filter for String param. event, param"

    .line 2028
    .line 2029
    invoke-virtual {v3, v2, v7, v5}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2030
    .line 2031
    .line 2032
    goto/16 :goto_30

    .line 2033
    .line 2034
    :cond_45
    if-nez v13, :cond_46

    .line 2035
    .line 2036
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v3

    .line 2040
    iget-object v5, v4, LA7/n0;->m:LA7/J;

    .line 2041
    .line 2042
    invoke-virtual {v5, v2}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2043
    .line 2044
    .line 2045
    move-result-object v2

    .line 2046
    iget-object v5, v4, LA7/n0;->m:LA7/J;

    .line 2047
    .line 2048
    invoke-virtual {v5, v11}, LA7/J;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 2049
    .line 2050
    .line 2051
    move-result-object v5

    .line 2052
    iget-object v3, v3, LA7/N;->n:LA7/P;

    .line 2053
    .line 2054
    const-string v7, "Missing param for filter. event, param"

    .line 2055
    .line 2056
    invoke-virtual {v3, v2, v7, v5}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2057
    .line 2058
    .line 2059
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2060
    .line 2061
    goto :goto_39

    .line 2062
    :cond_46
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v3

    .line 2066
    iget-object v5, v4, LA7/n0;->m:LA7/J;

    .line 2067
    .line 2068
    invoke-virtual {v5, v2}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2069
    .line 2070
    .line 2071
    move-result-object v2

    .line 2072
    iget-object v5, v4, LA7/n0;->m:LA7/J;

    .line 2073
    .line 2074
    invoke-virtual {v5, v11}, LA7/J;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 2075
    .line 2076
    .line 2077
    move-result-object v5

    .line 2078
    iget-object v3, v3, LA7/N;->i:LA7/P;

    .line 2079
    .line 2080
    const-string v7, "Unknown param type. event, param"

    .line 2081
    .line 2082
    invoke-virtual {v3, v2, v7, v5}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2083
    .line 2084
    .line 2085
    goto/16 :goto_30

    .line 2086
    .line 2087
    :cond_47
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2088
    .line 2089
    :goto_39
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 2090
    .line 2091
    .line 2092
    move-result-object v3

    .line 2093
    if-nez v2, :cond_48

    .line 2094
    .line 2095
    const-string v5, "null"

    .line 2096
    .line 2097
    goto :goto_3a

    .line 2098
    :cond_48
    move-object v5, v2

    .line 2099
    :goto_3a
    iget-object v3, v3, LA7/N;->n:LA7/P;

    .line 2100
    .line 2101
    const-string v7, "Event filter result"

    .line 2102
    .line 2103
    invoke-virtual {v3, v7, v5}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2104
    .line 2105
    .line 2106
    if-nez v2, :cond_49

    .line 2107
    .line 2108
    :goto_3b
    const/4 v8, 0x0

    .line 2109
    goto :goto_40

    .line 2110
    :cond_49
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2111
    .line 2112
    iput-object v3, v12, LA7/c;->a:Ljava/lang/Boolean;

    .line 2113
    .line 2114
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2115
    .line 2116
    .line 2117
    move-result v2

    .line 2118
    if-nez v2, :cond_4b

    .line 2119
    .line 2120
    :cond_4a
    :goto_3c
    const/4 v8, 0x1

    .line 2121
    goto :goto_40

    .line 2122
    :cond_4b
    iput-object v3, v12, LA7/c;->b:Ljava/lang/Boolean;

    .line 2123
    .line 2124
    if-eqz v0, :cond_4a

    .line 2125
    .line 2126
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzk()Z

    .line 2127
    .line 2128
    .line 2129
    move-result v0

    .line 2130
    if-eqz v0, :cond_4a

    .line 2131
    .line 2132
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zzd()J

    .line 2133
    .line 2134
    .line 2135
    move-result-wide v2

    .line 2136
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2137
    .line 2138
    .line 2139
    move-result-object v0

    .line 2140
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzi()Z

    .line 2141
    .line 2142
    .line 2143
    move-result v2

    .line 2144
    if-eqz v2, :cond_4d

    .line 2145
    .line 2146
    if-eqz v27, :cond_4c

    .line 2147
    .line 2148
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzk()Z

    .line 2149
    .line 2150
    .line 2151
    move-result v2

    .line 2152
    if-eqz v2, :cond_4c

    .line 2153
    .line 2154
    goto :goto_3d

    .line 2155
    :cond_4c
    move-object v14, v0

    .line 2156
    :goto_3d
    iput-object v14, v12, LA7/c;->d:Ljava/lang/Long;

    .line 2157
    .line 2158
    goto :goto_3c

    .line 2159
    :cond_4d
    if-eqz v27, :cond_4e

    .line 2160
    .line 2161
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzk()Z

    .line 2162
    .line 2163
    .line 2164
    move-result v2

    .line 2165
    if-eqz v2, :cond_4e

    .line 2166
    .line 2167
    move-object/from16 v0, v18

    .line 2168
    .line 2169
    :cond_4e
    iput-object v0, v12, LA7/c;->c:Ljava/lang/Long;

    .line 2170
    .line 2171
    goto :goto_3c

    .line 2172
    :cond_4f
    :goto_3e
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 2173
    .line 2174
    .line 2175
    move-result-object v0

    .line 2176
    invoke-static {v13}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 2177
    .line 2178
    .line 2179
    move-result-object v2

    .line 2180
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzl()Z

    .line 2181
    .line 2182
    .line 2183
    move-result v3

    .line 2184
    if-eqz v3, :cond_50

    .line 2185
    .line 2186
    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/measurement/zzfo$zzb;->zzb()I

    .line 2187
    .line 2188
    .line 2189
    move-result v3

    .line 2190
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2191
    .line 2192
    .line 2193
    move-result-object v3

    .line 2194
    goto :goto_3f

    .line 2195
    :cond_50
    const/4 v3, 0x0

    .line 2196
    :goto_3f
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2197
    .line 2198
    .line 2199
    move-result-object v3

    .line 2200
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 2201
    .line 2202
    const-string v5, "Invalid event filter ID. appId, id"

    .line 2203
    .line 2204
    invoke-virtual {v0, v2, v5, v3}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2205
    .line 2206
    .line 2207
    goto :goto_3b

    .line 2208
    :goto_40
    if-eqz v8, :cond_51

    .line 2209
    .line 2210
    invoke-virtual {v1, v6}, LA7/W1;->k0(Ljava/lang/Integer;)LA7/X1;

    .line 2211
    .line 2212
    .line 2213
    move-result-object v0

    .line 2214
    invoke-virtual {v0, v12}, LA7/X1;->a(LA7/c;)V

    .line 2215
    .line 2216
    .line 2217
    move-object/from16 v0, v17

    .line 2218
    .line 2219
    move-object/from16 v2, v21

    .line 2220
    .line 2221
    move-object/from16 v7, v28

    .line 2222
    .line 2223
    move-object/from16 v3, v30

    .line 2224
    .line 2225
    move-object/from16 v5, v31

    .line 2226
    .line 2227
    move-object/from16 v9, v32

    .line 2228
    .line 2229
    move-wide/from16 v10, v33

    .line 2230
    .line 2231
    goto/16 :goto_23

    .line 2232
    .line 2233
    :cond_51
    iget-object v0, v1, LA7/W1;->e:Ljava/util/HashSet;

    .line 2234
    .line 2235
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2236
    .line 2237
    .line 2238
    goto :goto_41

    .line 2239
    :cond_52
    move-object/from16 v17, v0

    .line 2240
    .line 2241
    move-object/from16 v21, v2

    .line 2242
    .line 2243
    move-object/from16 v30, v3

    .line 2244
    .line 2245
    move-object/from16 v31, v5

    .line 2246
    .line 2247
    move-object/from16 v32, v9

    .line 2248
    .line 2249
    move-wide/from16 v33, v10

    .line 2250
    .line 2251
    :goto_41
    if-nez v8, :cond_53

    .line 2252
    .line 2253
    iget-object v0, v1, LA7/W1;->e:Ljava/util/HashSet;

    .line 2254
    .line 2255
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2256
    .line 2257
    .line 2258
    :cond_53
    move-object/from16 v0, v17

    .line 2259
    .line 2260
    move-object/from16 v2, v21

    .line 2261
    .line 2262
    move-object/from16 v3, v30

    .line 2263
    .line 2264
    move-object/from16 v5, v31

    .line 2265
    .line 2266
    move-object/from16 v9, v32

    .line 2267
    .line 2268
    move-wide/from16 v10, v33

    .line 2269
    .line 2270
    goto/16 :goto_22

    .line 2271
    .line 2272
    :cond_54
    move-object/from16 v32, v9

    .line 2273
    .line 2274
    move-wide/from16 v33, v10

    .line 2275
    .line 2276
    move-object/from16 v8, v16

    .line 2277
    .line 2278
    goto/16 :goto_18

    .line 2279
    .line 2280
    :cond_55
    move-object/from16 v16, v8

    .line 2281
    .line 2282
    move-object/from16 v32, v9

    .line 2283
    .line 2284
    move-wide/from16 v33, v10

    .line 2285
    .line 2286
    goto/16 :goto_18

    .line 2287
    .line 2288
    :cond_56
    :goto_42
    return-void
.end method

.method public final o0(Ljava/util/List;)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1c

    .line 10
    .line 11
    :cond_0
    new-instance v2, Lx/e;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v2, v3}, Lx/v;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2b

    .line 26
    .line 27
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v5, v0

    .line 32
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzfy$zzo;

    .line 33
    .line 34
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzg()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-virtual {v2, v6}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ljava/util/Map;

    .line 43
    .line 44
    const/4 v8, 0x1

    .line 45
    if-nez v0, :cond_6

    .line 46
    .line 47
    invoke-virtual {v1}, LA7/H1;->f0()LA7/i;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    iget-object v10, v1, LA7/W1;->d:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v9}, LA7/G1;->h0()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v9}, LA7/B0;->c0()V

    .line 57
    .line 58
    .line 59
    invoke-static {v10}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v6}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    new-instance v11, Lx/e;

    .line 66
    .line 67
    invoke-direct {v11, v3}, Lx/v;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v9}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    :try_start_0
    const-string v13, "property_filters"

    .line 75
    .line 76
    const-string v0, "audience_id"

    .line 77
    .line 78
    const-string v14, "data"

    .line 79
    .line 80
    filled-new-array {v0, v14}, [Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v14

    .line 84
    const-string v15, "app_id=? AND property_name=?"

    .line 85
    .line 86
    filled-new-array {v10, v6}, [Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v16

    .line 90
    const/16 v17, 0x0

    .line 91
    .line 92
    const/16 v18, 0x0

    .line 93
    .line 94
    const/16 v19, 0x0

    .line 95
    .line 96
    invoke-virtual/range {v12 .. v19}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 97
    .line 98
    .line 99
    move-result-object v12
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 100
    :try_start_1
    invoke-interface {v12}, Landroid/database/Cursor;->moveToFirst()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_2

    .line 105
    .line 106
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_3

    .line 112
    .line 113
    :catchall_0
    move-exception v0

    .line 114
    move-object v7, v12

    .line 115
    goto/16 :goto_4

    .line 116
    .line 117
    :catch_0
    move-exception v0

    .line 118
    goto :goto_2

    .line 119
    :cond_2
    :try_start_2
    invoke-interface {v12, v8}, Landroid/database/Cursor;->getBlob(I)[B

    .line 120
    .line 121
    .line 122
    move-result-object v0
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 123
    :try_start_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzc()Lcom/google/android/gms/internal/measurement/zzfo$zze$zza;

    .line 124
    .line 125
    .line 126
    move-result-object v13

    .line 127
    invoke-static {v13, v0}, LA7/S1;->t0(Lcom/google/android/gms/internal/measurement/zzjt$zzb;[B)Lcom/google/android/gms/internal/measurement/zzlb;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfo$zze$zza;

    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjt$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzlc;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzjt;

    .line 138
    .line 139
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfo$zze;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 140
    .line 141
    :try_start_4
    invoke-interface {v12, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 142
    .line 143
    .line 144
    move-result v13

    .line 145
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v14

    .line 149
    invoke-virtual {v11, v14}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v14

    .line 153
    check-cast v14, Ljava/util/List;

    .line 154
    .line 155
    if-nez v14, :cond_3

    .line 156
    .line 157
    new-instance v14, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v13

    .line 166
    invoke-virtual {v11, v13, v14}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    :cond_3
    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :catch_1
    move-exception v0

    .line 174
    invoke-virtual {v9}, LA7/B0;->zzj()LA7/N;

    .line 175
    .line 176
    .line 177
    move-result-object v13

    .line 178
    iget-object v13, v13, LA7/N;->f:LA7/P;

    .line 179
    .line 180
    const-string v14, "Failed to merge filter"

    .line 181
    .line 182
    invoke-static {v10}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 183
    .line 184
    .line 185
    move-result-object v15

    .line 186
    invoke-virtual {v13, v15, v14, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    :goto_1
    invoke-interface {v12}, Landroid/database/Cursor;->moveToNext()Z

    .line 190
    .line 191
    .line 192
    move-result v0
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 193
    if-nez v0, :cond_2

    .line 194
    .line 195
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 196
    .line 197
    .line 198
    move-object v0, v11

    .line 199
    goto :goto_3

    .line 200
    :catchall_1
    move-exception v0

    .line 201
    const/4 v7, 0x0

    .line 202
    goto :goto_4

    .line 203
    :catch_2
    move-exception v0

    .line 204
    const/4 v12, 0x0

    .line 205
    :goto_2
    :try_start_5
    invoke-virtual {v9}, LA7/B0;->zzj()LA7/N;

    .line 206
    .line 207
    .line 208
    move-result-object v9

    .line 209
    iget-object v9, v9, LA7/N;->f:LA7/P;

    .line 210
    .line 211
    const-string v11, "Database error querying filters. appId"

    .line 212
    .line 213
    invoke-static {v10}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    invoke-virtual {v9, v10, v11, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 221
    .line 222
    if-eqz v12, :cond_4

    .line 223
    .line 224
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 225
    .line 226
    .line 227
    :cond_4
    :goto_3
    invoke-virtual {v2, v6, v0}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    goto :goto_5

    .line 231
    :goto_4
    if-eqz v7, :cond_5

    .line 232
    .line 233
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 234
    .line 235
    .line 236
    :cond_5
    throw v0

    .line 237
    :cond_6
    :goto_5
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v9

    .line 249
    if-eqz v9, :cond_1

    .line 250
    .line 251
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v9

    .line 255
    check-cast v9, Ljava/lang/Integer;

    .line 256
    .line 257
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 258
    .line 259
    .line 260
    iget-object v10, v1, LA7/W1;->e:Ljava/util/HashSet;

    .line 261
    .line 262
    invoke-virtual {v10, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v10

    .line 266
    if-eqz v10, :cond_7

    .line 267
    .line 268
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    const-string v5, "Skipping failed audience ID"

    .line 273
    .line 274
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 275
    .line 276
    invoke-virtual {v0, v5, v9}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    goto/16 :goto_0

    .line 280
    .line 281
    :cond_7
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v10

    .line 285
    check-cast v10, Ljava/util/List;

    .line 286
    .line 287
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    move v11, v8

    .line 292
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 293
    .line 294
    .line 295
    move-result v12

    .line 296
    if-eqz v12, :cond_29

    .line 297
    .line 298
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v11

    .line 302
    check-cast v11, Lcom/google/android/gms/internal/measurement/zzfo$zze;

    .line 303
    .line 304
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 305
    .line 306
    .line 307
    move-result-object v12

    .line 308
    const/4 v13, 0x2

    .line 309
    invoke-virtual {v12, v13}, LA7/N;->l0(I)Z

    .line 310
    .line 311
    .line 312
    move-result v12

    .line 313
    iget-object v13, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v13, LA7/n0;

    .line 316
    .line 317
    if-eqz v12, :cond_b

    .line 318
    .line 319
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 320
    .line 321
    .line 322
    move-result-object v12

    .line 323
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzi()Z

    .line 324
    .line 325
    .line 326
    move-result v14

    .line 327
    if-eqz v14, :cond_8

    .line 328
    .line 329
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zza()I

    .line 330
    .line 331
    .line 332
    move-result v14

    .line 333
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 334
    .line 335
    .line 336
    move-result-object v14

    .line 337
    goto :goto_8

    .line 338
    :cond_8
    const/4 v14, 0x0

    .line 339
    :goto_8
    iget-object v15, v13, LA7/n0;->m:LA7/J;

    .line 340
    .line 341
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zze()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    invoke-virtual {v15, v7}, LA7/J;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v7

    .line 349
    iget-object v12, v12, LA7/N;->n:LA7/P;

    .line 350
    .line 351
    const-string v15, "Evaluating filter. audience, filter, property"

    .line 352
    .line 353
    invoke-virtual {v12, v9, v14, v7, v15}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 357
    .line 358
    .line 359
    move-result-object v7

    .line 360
    invoke-virtual {v1}, LA7/H1;->e0()LA7/S1;

    .line 361
    .line 362
    .line 363
    move-result-object v12

    .line 364
    const-string v14, "\nproperty_filter {\n"

    .line 365
    .line 366
    invoke-static {v14}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    move-result-object v14

    .line 370
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzi()Z

    .line 371
    .line 372
    .line 373
    move-result v15

    .line 374
    if-eqz v15, :cond_9

    .line 375
    .line 376
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zza()I

    .line 377
    .line 378
    .line 379
    move-result v15

    .line 380
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 381
    .line 382
    .line 383
    move-result-object v15

    .line 384
    const-string v8, "filter_id"

    .line 385
    .line 386
    invoke-static {v14, v3, v8, v15}, LA7/S1;->H0(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    :cond_9
    iget-object v8, v12, LA7/B0;->a:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v8, LA7/n0;

    .line 392
    .line 393
    iget-object v8, v8, LA7/n0;->m:LA7/J;

    .line 394
    .line 395
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zze()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v15

    .line 399
    invoke-virtual {v8, v15}, LA7/J;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v8

    .line 403
    const-string v15, "property_name"

    .line 404
    .line 405
    invoke-static {v14, v3, v15, v8}, LA7/S1;->H0(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzf()Z

    .line 409
    .line 410
    .line 411
    move-result v8

    .line 412
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzg()Z

    .line 413
    .line 414
    .line 415
    move-result v15

    .line 416
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzh()Z

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    invoke-static {v8, v15, v3}, LA7/S1;->v0(ZZZ)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 425
    .line 426
    .line 427
    move-result v8

    .line 428
    if-nez v8, :cond_a

    .line 429
    .line 430
    const-string v8, "filter_type"

    .line 431
    .line 432
    const/4 v15, 0x0

    .line 433
    invoke-static {v14, v15, v8, v3}, LA7/S1;->H0(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    goto :goto_9

    .line 437
    :cond_a
    const/4 v15, 0x0

    .line 438
    :goto_9
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzb()Lcom/google/android/gms/internal/measurement/zzfo$zzc;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    const/4 v8, 0x1

    .line 443
    invoke-virtual {v12, v14, v8, v3}, LA7/S1;->F0(Ljava/lang/StringBuilder;ILcom/google/android/gms/internal/measurement/zzfo$zzc;)V

    .line 444
    .line 445
    .line 446
    const-string v3, "}\n"

    .line 447
    .line 448
    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    iget-object v7, v7, LA7/N;->n:LA7/P;

    .line 456
    .line 457
    const-string v12, "Filter definition"

    .line 458
    .line 459
    invoke-virtual {v7, v12, v3}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    goto :goto_a

    .line 463
    :cond_b
    move v15, v3

    .line 464
    :goto_a
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzi()Z

    .line 465
    .line 466
    .line 467
    move-result v3

    .line 468
    if-eqz v3, :cond_c

    .line 469
    .line 470
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zza()I

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    const/16 v7, 0x100

    .line 475
    .line 476
    if-le v3, v7, :cond_d

    .line 477
    .line 478
    :cond_c
    move-object/from16 v18, v0

    .line 479
    .line 480
    move-object/from16 v21, v4

    .line 481
    .line 482
    move-object/from16 v22, v5

    .line 483
    .line 484
    move-object v4, v6

    .line 485
    goto/16 :goto_19

    .line 486
    .line 487
    :cond_d
    new-instance v3, LA7/a2;

    .line 488
    .line 489
    iget-object v7, v1, LA7/W1;->d:Ljava/lang/String;

    .line 490
    .line 491
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 492
    .line 493
    .line 494
    iput-object v11, v3, LA7/a2;->e:Lcom/google/android/gms/internal/measurement/zzfo$zze;

    .line 495
    .line 496
    iget-object v12, v1, LA7/W1;->g:Ljava/lang/Long;

    .line 497
    .line 498
    iget-object v14, v1, LA7/W1;->h:Ljava/lang/Long;

    .line 499
    .line 500
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zza()I

    .line 501
    .line 502
    .line 503
    move-result v8

    .line 504
    iget-object v15, v1, LA7/W1;->f:Lx/e;

    .line 505
    .line 506
    invoke-virtual {v15, v9}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v15

    .line 510
    check-cast v15, LA7/X1;

    .line 511
    .line 512
    if-nez v15, :cond_e

    .line 513
    .line 514
    const/4 v8, 0x0

    .line 515
    goto :goto_b

    .line 516
    :cond_e
    iget-object v15, v15, LA7/X1;->d:Ljava/util/BitSet;

    .line 517
    .line 518
    invoke-virtual {v15, v8}, Ljava/util/BitSet;->get(I)Z

    .line 519
    .line 520
    .line 521
    move-result v8

    .line 522
    :goto_b
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoe;->zza()Z

    .line 523
    .line 524
    .line 525
    move-result v15

    .line 526
    if-eqz v15, :cond_f

    .line 527
    .line 528
    iget-object v15, v13, LA7/n0;->g:LA7/e;

    .line 529
    .line 530
    move-object/from16 v18, v0

    .line 531
    .line 532
    sget-object v0, LA7/y;->n0:LA7/D;

    .line 533
    .line 534
    invoke-virtual {v15, v7, v0}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 535
    .line 536
    .line 537
    move-result v0

    .line 538
    if-eqz v0, :cond_10

    .line 539
    .line 540
    const/4 v0, 0x1

    .line 541
    goto :goto_c

    .line 542
    :cond_f
    move-object/from16 v18, v0

    .line 543
    .line 544
    :cond_10
    const/4 v0, 0x0

    .line 545
    :goto_c
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzf()Z

    .line 546
    .line 547
    .line 548
    move-result v7

    .line 549
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzg()Z

    .line 550
    .line 551
    .line 552
    move-result v15

    .line 553
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzh()Z

    .line 554
    .line 555
    .line 556
    move-result v19

    .line 557
    if-nez v7, :cond_12

    .line 558
    .line 559
    if-nez v15, :cond_12

    .line 560
    .line 561
    if-eqz v19, :cond_11

    .line 562
    .line 563
    goto :goto_d

    .line 564
    :cond_11
    const/4 v7, 0x0

    .line 565
    goto :goto_e

    .line 566
    :cond_12
    :goto_d
    const/4 v7, 0x1

    .line 567
    :goto_e
    if-eqz v8, :cond_15

    .line 568
    .line 569
    if-nez v7, :cond_15

    .line 570
    .line 571
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzi()Z

    .line 576
    .line 577
    .line 578
    move-result v7

    .line 579
    if-eqz v7, :cond_13

    .line 580
    .line 581
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zza()I

    .line 582
    .line 583
    .line 584
    move-result v7

    .line 585
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 586
    .line 587
    .line 588
    move-result-object v7

    .line 589
    goto :goto_f

    .line 590
    :cond_13
    const/4 v7, 0x0

    .line 591
    :goto_f
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 592
    .line 593
    const-string v8, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"

    .line 594
    .line 595
    invoke-virtual {v0, v9, v8, v7}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    move-object/from16 v21, v4

    .line 599
    .line 600
    move-object/from16 v22, v5

    .line 601
    .line 602
    move-object v4, v6

    .line 603
    :cond_14
    :goto_10
    const/4 v11, 0x1

    .line 604
    goto/16 :goto_18

    .line 605
    .line 606
    :cond_15
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzb()Lcom/google/android/gms/internal/measurement/zzfo$zzc;

    .line 607
    .line 608
    .line 609
    move-result-object v15

    .line 610
    move/from16 v20, v0

    .line 611
    .line 612
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzf()Z

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzk()Z

    .line 617
    .line 618
    .line 619
    move-result v21

    .line 620
    if-eqz v21, :cond_17

    .line 621
    .line 622
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzh()Z

    .line 623
    .line 624
    .line 625
    move-result v21

    .line 626
    if-nez v21, :cond_16

    .line 627
    .line 628
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    iget-object v13, v13, LA7/n0;->m:LA7/J;

    .line 633
    .line 634
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzg()Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v15

    .line 638
    invoke-virtual {v13, v15}, LA7/J;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v13

    .line 642
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 643
    .line 644
    const-string v15, "No number filter for long property. property"

    .line 645
    .line 646
    invoke-virtual {v0, v15, v13}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    move-object/from16 v21, v4

    .line 650
    .line 651
    move-object/from16 v22, v5

    .line 652
    .line 653
    :goto_11
    move-object v4, v6

    .line 654
    move/from16 v23, v7

    .line 655
    .line 656
    :goto_12
    const/4 v0, 0x0

    .line 657
    goto/16 :goto_16

    .line 658
    .line 659
    :cond_16
    move-object/from16 v21, v4

    .line 660
    .line 661
    move-object/from16 v22, v5

    .line 662
    .line 663
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzc()J

    .line 664
    .line 665
    .line 666
    move-result-wide v4

    .line 667
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzc()Lcom/google/android/gms/internal/measurement/zzfo$zzd;

    .line 668
    .line 669
    .line 670
    move-result-object v13

    .line 671
    invoke-static {v4, v5, v13}, LA7/c;->b(JLcom/google/android/gms/internal/measurement/zzfo$zzd;)Ljava/lang/Boolean;

    .line 672
    .line 673
    .line 674
    move-result-object v4

    .line 675
    invoke-static {v4, v0}, LA7/c;->c(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    :goto_13
    move-object v4, v6

    .line 680
    move/from16 v23, v7

    .line 681
    .line 682
    goto/16 :goto_16

    .line 683
    .line 684
    :cond_17
    move-object/from16 v21, v4

    .line 685
    .line 686
    move-object/from16 v22, v5

    .line 687
    .line 688
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzi()Z

    .line 689
    .line 690
    .line 691
    move-result v4

    .line 692
    if-eqz v4, :cond_19

    .line 693
    .line 694
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzh()Z

    .line 695
    .line 696
    .line 697
    move-result v4

    .line 698
    if-nez v4, :cond_18

    .line 699
    .line 700
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    iget-object v4, v13, LA7/n0;->m:LA7/J;

    .line 705
    .line 706
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzg()Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v5

    .line 710
    invoke-virtual {v4, v5}, LA7/J;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v4

    .line 714
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 715
    .line 716
    const-string v5, "No number filter for double property. property"

    .line 717
    .line 718
    invoke-virtual {v0, v5, v4}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 719
    .line 720
    .line 721
    goto :goto_11

    .line 722
    :cond_18
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zza()D

    .line 723
    .line 724
    .line 725
    move-result-wide v4

    .line 726
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzc()Lcom/google/android/gms/internal/measurement/zzfo$zzd;

    .line 727
    .line 728
    .line 729
    move-result-object v13

    .line 730
    :try_start_6
    new-instance v15, Ljava/math/BigDecimal;

    .line 731
    .line 732
    invoke-direct {v15, v4, v5}, Ljava/math/BigDecimal;-><init>(D)V

    .line 733
    .line 734
    .line 735
    invoke-static {v4, v5}, Ljava/lang/Math;->ulp(D)D

    .line 736
    .line 737
    .line 738
    move-result-wide v4

    .line 739
    invoke-static {v15, v13, v4, v5}, LA7/c;->e(Ljava/math/BigDecimal;Lcom/google/android/gms/internal/measurement/zzfo$zzd;D)Ljava/lang/Boolean;

    .line 740
    .line 741
    .line 742
    move-result-object v4
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_3

    .line 743
    goto :goto_14

    .line 744
    :catch_3
    const/4 v4, 0x0

    .line 745
    :goto_14
    invoke-static {v4, v0}, LA7/c;->c(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    goto :goto_13

    .line 750
    :cond_19
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzm()Z

    .line 751
    .line 752
    .line 753
    move-result v4

    .line 754
    if-eqz v4, :cond_1e

    .line 755
    .line 756
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzj()Z

    .line 757
    .line 758
    .line 759
    move-result v4

    .line 760
    if-nez v4, :cond_1d

    .line 761
    .line 762
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzh()Z

    .line 763
    .line 764
    .line 765
    move-result v4

    .line 766
    if-nez v4, :cond_1a

    .line 767
    .line 768
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    iget-object v4, v13, LA7/n0;->m:LA7/J;

    .line 773
    .line 774
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzg()Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v5

    .line 778
    invoke-virtual {v4, v5}, LA7/J;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v4

    .line 782
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 783
    .line 784
    const-string v5, "No string or number filter defined. property"

    .line 785
    .line 786
    invoke-virtual {v0, v5, v4}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 787
    .line 788
    .line 789
    goto/16 :goto_11

    .line 790
    .line 791
    :cond_1a
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzh()Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v4

    .line 795
    invoke-static {v4}, LA7/S1;->N0(Ljava/lang/String;)Z

    .line 796
    .line 797
    .line 798
    move-result v4

    .line 799
    if-eqz v4, :cond_1c

    .line 800
    .line 801
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzh()Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v4

    .line 805
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzc()Lcom/google/android/gms/internal/measurement/zzfo$zzd;

    .line 806
    .line 807
    .line 808
    move-result-object v5

    .line 809
    invoke-static {v4}, LA7/S1;->N0(Ljava/lang/String;)Z

    .line 810
    .line 811
    .line 812
    move-result v13

    .line 813
    if-nez v13, :cond_1b

    .line 814
    .line 815
    :catch_4
    move-object v4, v6

    .line 816
    move/from16 v23, v7

    .line 817
    .line 818
    :catch_5
    const/4 v5, 0x0

    .line 819
    goto :goto_15

    .line 820
    :cond_1b
    :try_start_7
    new-instance v13, Ljava/math/BigDecimal;

    .line 821
    .line 822
    invoke-direct {v13, v4}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_4

    .line 823
    .line 824
    .line 825
    move-object v4, v6

    .line 826
    move/from16 v23, v7

    .line 827
    .line 828
    const-wide/16 v6, 0x0

    .line 829
    .line 830
    :try_start_8
    invoke-static {v13, v5, v6, v7}, LA7/c;->e(Ljava/math/BigDecimal;Lcom/google/android/gms/internal/measurement/zzfo$zzd;D)Ljava/lang/Boolean;

    .line 831
    .line 832
    .line 833
    move-result-object v5
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_5

    .line 834
    :goto_15
    invoke-static {v5, v0}, LA7/c;->c(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    goto :goto_16

    .line 839
    :cond_1c
    move-object v4, v6

    .line 840
    move/from16 v23, v7

    .line 841
    .line 842
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    iget-object v5, v13, LA7/n0;->m:LA7/J;

    .line 847
    .line 848
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzg()Ljava/lang/String;

    .line 849
    .line 850
    .line 851
    move-result-object v6

    .line 852
    invoke-virtual {v5, v6}, LA7/J;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v5

    .line 856
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzh()Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v6

    .line 860
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 861
    .line 862
    const-string v7, "Invalid user property value for Numeric number filter. property, value"

    .line 863
    .line 864
    invoke-virtual {v0, v5, v7, v6}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 865
    .line 866
    .line 867
    goto/16 :goto_12

    .line 868
    .line 869
    :cond_1d
    move-object v4, v6

    .line 870
    move/from16 v23, v7

    .line 871
    .line 872
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzh()Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v5

    .line 876
    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/zzfo$zzc;->zzd()Lcom/google/android/gms/internal/measurement/zzfo$zzf;

    .line 877
    .line 878
    .line 879
    move-result-object v6

    .line 880
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 881
    .line 882
    .line 883
    move-result-object v7

    .line 884
    invoke-static {v5, v6, v7}, LA7/c;->d(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfo$zzf;LA7/N;)Ljava/lang/Boolean;

    .line 885
    .line 886
    .line 887
    move-result-object v5

    .line 888
    invoke-static {v5, v0}, LA7/c;->c(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    goto :goto_16

    .line 893
    :cond_1e
    move-object v4, v6

    .line 894
    move/from16 v23, v7

    .line 895
    .line 896
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    iget-object v5, v13, LA7/n0;->m:LA7/J;

    .line 901
    .line 902
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzg()Ljava/lang/String;

    .line 903
    .line 904
    .line 905
    move-result-object v6

    .line 906
    invoke-virtual {v5, v6}, LA7/J;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v5

    .line 910
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 911
    .line 912
    const-string v6, "User property has no value, property"

    .line 913
    .line 914
    invoke-virtual {v0, v6, v5}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 915
    .line 916
    .line 917
    goto/16 :goto_12

    .line 918
    .line 919
    :goto_16
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 920
    .line 921
    .line 922
    move-result-object v5

    .line 923
    if-nez v0, :cond_1f

    .line 924
    .line 925
    const-string v6, "null"

    .line 926
    .line 927
    goto :goto_17

    .line 928
    :cond_1f
    move-object v6, v0

    .line 929
    :goto_17
    iget-object v5, v5, LA7/N;->n:LA7/P;

    .line 930
    .line 931
    const-string v7, "Property filter result"

    .line 932
    .line 933
    invoke-virtual {v5, v7, v6}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 934
    .line 935
    .line 936
    if-nez v0, :cond_20

    .line 937
    .line 938
    const/4 v11, 0x0

    .line 939
    goto :goto_18

    .line 940
    :cond_20
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 941
    .line 942
    iput-object v5, v3, LA7/c;->a:Ljava/lang/Boolean;

    .line 943
    .line 944
    if-eqz v19, :cond_21

    .line 945
    .line 946
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 947
    .line 948
    .line 949
    move-result v5

    .line 950
    if-nez v5, :cond_21

    .line 951
    .line 952
    goto/16 :goto_10

    .line 953
    .line 954
    :cond_21
    if-eqz v8, :cond_22

    .line 955
    .line 956
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzf()Z

    .line 957
    .line 958
    .line 959
    move-result v5

    .line 960
    if-eqz v5, :cond_23

    .line 961
    .line 962
    :cond_22
    iput-object v0, v3, LA7/c;->b:Ljava/lang/Boolean;

    .line 963
    .line 964
    :cond_23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 965
    .line 966
    .line 967
    move-result v0

    .line 968
    if-eqz v0, :cond_14

    .line 969
    .line 970
    if-eqz v23, :cond_14

    .line 971
    .line 972
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzl()Z

    .line 973
    .line 974
    .line 975
    move-result v0

    .line 976
    if-eqz v0, :cond_14

    .line 977
    .line 978
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/zzfy$zzo;->zzd()J

    .line 979
    .line 980
    .line 981
    move-result-wide v5

    .line 982
    if-eqz v12, :cond_24

    .line 983
    .line 984
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 985
    .line 986
    .line 987
    move-result-wide v5

    .line 988
    :cond_24
    if-eqz v20, :cond_25

    .line 989
    .line 990
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzf()Z

    .line 991
    .line 992
    .line 993
    move-result v0

    .line 994
    if-eqz v0, :cond_25

    .line 995
    .line 996
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzg()Z

    .line 997
    .line 998
    .line 999
    move-result v0

    .line 1000
    if-nez v0, :cond_25

    .line 1001
    .line 1002
    if-eqz v14, :cond_25

    .line 1003
    .line 1004
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 1005
    .line 1006
    .line 1007
    move-result-wide v5

    .line 1008
    :cond_25
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzg()Z

    .line 1009
    .line 1010
    .line 1011
    move-result v0

    .line 1012
    if-eqz v0, :cond_26

    .line 1013
    .line 1014
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v0

    .line 1018
    iput-object v0, v3, LA7/c;->d:Ljava/lang/Long;

    .line 1019
    .line 1020
    goto/16 :goto_10

    .line 1021
    .line 1022
    :cond_26
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v0

    .line 1026
    iput-object v0, v3, LA7/c;->c:Ljava/lang/Long;

    .line 1027
    .line 1028
    goto/16 :goto_10

    .line 1029
    .line 1030
    :goto_18
    if-eqz v11, :cond_27

    .line 1031
    .line 1032
    invoke-virtual {v1, v9}, LA7/W1;->k0(Ljava/lang/Integer;)LA7/X1;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v0

    .line 1036
    invoke-virtual {v0, v3}, LA7/X1;->a(LA7/c;)V

    .line 1037
    .line 1038
    .line 1039
    move-object v6, v4

    .line 1040
    move-object/from16 v0, v18

    .line 1041
    .line 1042
    move-object/from16 v4, v21

    .line 1043
    .line 1044
    move-object/from16 v5, v22

    .line 1045
    .line 1046
    const/4 v3, 0x0

    .line 1047
    const/4 v8, 0x1

    .line 1048
    goto/16 :goto_7

    .line 1049
    .line 1050
    :cond_27
    iget-object v0, v1, LA7/W1;->e:Ljava/util/HashSet;

    .line 1051
    .line 1052
    invoke-virtual {v0, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1053
    .line 1054
    .line 1055
    goto :goto_1b

    .line 1056
    :goto_19
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    iget-object v3, v1, LA7/W1;->d:Ljava/lang/String;

    .line 1061
    .line 1062
    invoke-static {v3}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v3

    .line 1066
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zzi()Z

    .line 1067
    .line 1068
    .line 1069
    move-result v5

    .line 1070
    if-eqz v5, :cond_28

    .line 1071
    .line 1072
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfo$zze;->zza()I

    .line 1073
    .line 1074
    .line 1075
    move-result v5

    .line 1076
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v5

    .line 1080
    goto :goto_1a

    .line 1081
    :cond_28
    const/4 v5, 0x0

    .line 1082
    :goto_1a
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v5

    .line 1086
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 1087
    .line 1088
    const-string v6, "Invalid property filter ID. appId, id"

    .line 1089
    .line 1090
    invoke-virtual {v0, v3, v6, v5}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1091
    .line 1092
    .line 1093
    const/4 v11, 0x0

    .line 1094
    goto :goto_1b

    .line 1095
    :cond_29
    move-object/from16 v18, v0

    .line 1096
    .line 1097
    move-object/from16 v21, v4

    .line 1098
    .line 1099
    move-object/from16 v22, v5

    .line 1100
    .line 1101
    move-object v4, v6

    .line 1102
    :goto_1b
    if-nez v11, :cond_2a

    .line 1103
    .line 1104
    iget-object v0, v1, LA7/W1;->e:Ljava/util/HashSet;

    .line 1105
    .line 1106
    invoke-virtual {v0, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1107
    .line 1108
    .line 1109
    :cond_2a
    move-object v6, v4

    .line 1110
    move-object/from16 v0, v18

    .line 1111
    .line 1112
    move-object/from16 v4, v21

    .line 1113
    .line 1114
    move-object/from16 v5, v22

    .line 1115
    .line 1116
    const/4 v3, 0x0

    .line 1117
    const/4 v8, 0x1

    .line 1118
    goto/16 :goto_6

    .line 1119
    .line 1120
    :cond_2b
    :goto_1c
    return-void
.end method

.method public final p0()Ljava/util/ArrayList;
    .locals 14

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LA7/W1;->f:Lx/e;

    .line 7
    .line 8
    invoke-virtual {v1}, Lx/e;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, p0, LA7/W1;->e:Ljava/util/HashSet;

    .line 13
    .line 14
    check-cast v1, Lx/b;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lx/b;->removeAll(Ljava/util/Collection;)Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lx/b;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_9

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    iget-object v4, p0, LA7/W1;->f:Lx/e;

    .line 40
    .line 41
    invoke-virtual {v4, v2}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, LA7/X1;

    .line 46
    .line 47
    invoke-static {v4}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfy$zzd;->zzb()Lcom/google/android/gms/internal/measurement/zzfy$zzd$zza;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzd$zza;->zza(I)Lcom/google/android/gms/internal/measurement/zzfy$zzd$zza;

    .line 55
    .line 56
    .line 57
    iget-boolean v3, v4, LA7/X1;->b:Z

    .line 58
    .line 59
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzd$zza;->zza(Z)Lcom/google/android/gms/internal/measurement/zzfy$zzd$zza;

    .line 60
    .line 61
    .line 62
    iget-object v3, v4, LA7/X1;->c:Lcom/google/android/gms/internal/measurement/zzfy$zzm;

    .line 63
    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzd$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfy$zzm;)Lcom/google/android/gms/internal/measurement/zzfy$zzd$zza;

    .line 67
    .line 68
    .line 69
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfy$zzm;->zze()Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    iget-object v6, v4, LA7/X1;->d:Ljava/util/BitSet;

    .line 74
    .line 75
    invoke-static {v6}, LA7/S1;->w0(Ljava/util/BitSet;)Ljava/util/ArrayList;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zzb(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    iget-object v6, v4, LA7/X1;->e:Ljava/util/BitSet;

    .line 84
    .line 85
    invoke-static {v6}, LA7/S1;->w0(Ljava/util/BitSet;)Ljava/util/ArrayList;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zzd(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    iget-object v6, v4, LA7/X1;->f:Lx/e;

    .line 94
    .line 95
    const/4 v7, 0x0

    .line 96
    if-nez v6, :cond_2

    .line 97
    .line 98
    move-object v8, v7

    .line 99
    goto :goto_2

    .line 100
    :cond_2
    new-instance v8, Ljava/util/ArrayList;

    .line 101
    .line 102
    iget v9, v6, Lx/v;->c:I

    .line 103
    .line 104
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6}, Lx/e;->keySet()Ljava/util/Set;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    check-cast v9, Lx/b;

    .line 112
    .line 113
    invoke-virtual {v9}, Lx/b;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    :cond_3
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-eqz v10, :cond_4

    .line 122
    .line 123
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    check-cast v10, Ljava/lang/Integer;

    .line 128
    .line 129
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    invoke-virtual {v6, v10}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    check-cast v10, Ljava/lang/Long;

    .line 138
    .line 139
    if-eqz v10, :cond_3

    .line 140
    .line 141
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfy$zze;->zzc()Lcom/google/android/gms/internal/measurement/zzfy$zze$zza;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    invoke-virtual {v12, v11}, Lcom/google/android/gms/internal/measurement/zzfy$zze$zza;->zza(I)Lcom/google/android/gms/internal/measurement/zzfy$zze$zza;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 150
    .line 151
    .line 152
    move-result-wide v12

    .line 153
    invoke-virtual {v11, v12, v13}, Lcom/google/android/gms/internal/measurement/zzfy$zze$zza;->zza(J)Lcom/google/android/gms/internal/measurement/zzfy$zze$zza;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzjt$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzlc;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    check-cast v10, Lcom/google/android/gms/internal/measurement/zzjt;

    .line 162
    .line 163
    check-cast v10, Lcom/google/android/gms/internal/measurement/zzfy$zze;

    .line 164
    .line 165
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_4
    :goto_2
    if-eqz v8, :cond_5

    .line 170
    .line 171
    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zza(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    .line 172
    .line 173
    .line 174
    :cond_5
    iget-object v4, v4, LA7/X1;->g:Lx/e;

    .line 175
    .line 176
    if-nez v4, :cond_6

    .line 177
    .line 178
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_6
    new-instance v6, Ljava/util/ArrayList;

    .line 182
    .line 183
    iget v8, v4, Lx/v;->c:I

    .line 184
    .line 185
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4}, Lx/e;->keySet()Ljava/util/Set;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    check-cast v8, Lx/b;

    .line 193
    .line 194
    invoke-virtual {v8}, Lx/b;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    :goto_3
    move-object v9, v8

    .line 199
    check-cast v9, Lx/a;

    .line 200
    .line 201
    invoke-virtual {v9}, Lx/a;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    if-eqz v10, :cond_8

    .line 206
    .line 207
    invoke-virtual {v9}, Lx/a;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    check-cast v9, Ljava/lang/Integer;

    .line 212
    .line 213
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfy$zzn;->zzc()Lcom/google/android/gms/internal/measurement/zzfy$zzn$zza;

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 218
    .line 219
    .line 220
    move-result v11

    .line 221
    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/measurement/zzfy$zzn$zza;->zza(I)Lcom/google/android/gms/internal/measurement/zzfy$zzn$zza;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    invoke-virtual {v4, v9}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    check-cast v9, Ljava/util/List;

    .line 230
    .line 231
    if-eqz v9, :cond_7

    .line 232
    .line 233
    invoke-static {v9}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v10, v9}, Lcom/google/android/gms/internal/measurement/zzfy$zzn$zza;->zza(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfy$zzn$zza;

    .line 237
    .line 238
    .line 239
    :cond_7
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzjt$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzlc;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    check-cast v9, Lcom/google/android/gms/internal/measurement/zzjt;

    .line 244
    .line 245
    check-cast v9, Lcom/google/android/gms/internal/measurement/zzfy$zzn;

    .line 246
    .line 247
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_8
    move-object v4, v6

    .line 252
    :goto_4
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;->zzc(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzd$zza;->zza(Lcom/google/android/gms/internal/measurement/zzfy$zzm$zza;)Lcom/google/android/gms/internal/measurement/zzfy$zzd$zza;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzjt$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzlc;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzjt;

    .line 263
    .line 264
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzfy$zzd;

    .line 265
    .line 266
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0}, LA7/H1;->f0()LA7/i;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    iget-object v5, p0, LA7/W1;->d:Ljava/lang/String;

    .line 274
    .line 275
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzfy$zzd;->zzd()Lcom/google/android/gms/internal/measurement/zzfy$zzm;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    invoke-virtual {v4}, LA7/G1;->h0()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v4}, LA7/B0;->c0()V

    .line 283
    .line 284
    .line 285
    invoke-static {v5}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-static {v3}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzib;->zzca()[B

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    new-instance v6, Landroid/content/ContentValues;

    .line 296
    .line 297
    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 298
    .line 299
    .line 300
    const-string v8, "app_id"

    .line 301
    .line 302
    invoke-virtual {v6, v8, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    const-string v8, "audience_id"

    .line 306
    .line 307
    invoke-virtual {v6, v8, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 308
    .line 309
    .line 310
    const-string v2, "current_results"

    .line 311
    .line 312
    invoke-virtual {v6, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 313
    .line 314
    .line 315
    :try_start_0
    invoke-virtual {v4}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    const-string v3, "audience_filter_values"

    .line 320
    .line 321
    const/4 v8, 0x5

    .line 322
    invoke-virtual {v2, v3, v7, v6, v8}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 323
    .line 324
    .line 325
    move-result-wide v2

    .line 326
    const-wide/16 v6, -0x1

    .line 327
    .line 328
    cmp-long v2, v2, v6

    .line 329
    .line 330
    if-nez v2, :cond_0

    .line 331
    .line 332
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 337
    .line 338
    const-string v3, "Failed to insert filter results (got -1). appId"

    .line 339
    .line 340
    invoke-static {v5}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 341
    .line 342
    .line 343
    move-result-object v6

    .line 344
    invoke-virtual {v2, v3, v6}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 345
    .line 346
    .line 347
    goto/16 :goto_0

    .line 348
    .line 349
    :catch_0
    move-exception v2

    .line 350
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    invoke-static {v5}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    iget-object v3, v3, LA7/N;->f:LA7/P;

    .line 359
    .line 360
    const-string v5, "Error storing filter results. appId"

    .line 361
    .line 362
    invoke-virtual {v3, v4, v5, v2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    goto/16 :goto_0

    .line 366
    .line 367
    :cond_9
    return-object v0
.end method
